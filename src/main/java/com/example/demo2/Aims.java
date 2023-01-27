package com.example.demo2;

import java.util.ArrayList;
import java.util.List;
//import disc.*;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Orientation;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

import static javafx.geometry.HPos.RIGHT;
//import order.Order;


public class Aims extends Application {
//    static ArrayList <DigitalVideoDisc> dvd = new ArrayList<>();
    static List<DigitalVideoDisc> dvd;

//    static ArrayList <Book> book = new ArrayList<>();
    static List<Book> book;
//    static ArrayList <CompactDisc> cd = new ArrayList<>();
    static List<CompactDisc> cd;
    static ArrayList <String> author = new ArrayList<>();
    static ArrayList <Integer> bookChoose = new ArrayList<>();
    static ArrayList <Integer> dvdChoose = new ArrayList<>();
    static ArrayList <Integer> cdChoose = new ArrayList<>();
    static Order anOrder = new Order();
    static Order myOrder = new Order();
    static int pay = 0;
//newly added
    Scene primaryScene;
    Scene adminScene;
    TableView<DigitalVideoDisc> dvdTable;
    TableView<Book> bookTable;
    TableView<CompactDisc> cdTable;
    TableView<Order> orderTable;
    TextField director, length, title, category, cost;
    TextField btitle, bcategory, bcost, bauthors;
    TextField cddirector, cdlength, cdtitle, cdcategory, cdcost,cdartist;
    String password;
    String nameField;
    String action="";
    @FXML
    Label adminName;
//    @FXML
//    Label adminPass;
//    @FXML
//    Label adminAction;
//    @FXML
////    Button adminInfoBtn;
    ObservableList<DigitalVideoDisc> dvds;
    ObservableList<Book> books;
    ObservableList<CompactDisc> cds;


    public static void main(String[] args) {
//        //to change to DVD table
//        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
//        dvd1.setCategory("Animation");
//        dvd1.setCost(19.95f);
//        dvd1.setDirector("Roger Allers");
//        dvd1.setLength(87);
//        dvd1.setId_to_store(1);
//        dvd.add(dvd1);
//
//        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
//        dvd2.setCategory("Science Fiction");
//        dvd2.setCost(24.95f);
//        dvd2.setDirector("George Lucas");
//        dvd2.setLength(124);
//        dvd2.setId_to_store(2);
//        dvd.add(dvd2);
//
//        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
//        dvd3.setCategory("Animation");
//        dvd3.setCost(18.99f);
//        dvd3.setDirector("John Musker");
//        dvd3.setLength(90);
//        dvd3.setId_to_store(2);
//        dvd.add(dvd3);

//        //Book
//        Book book1 = new Book("Analysis");
//        author.add("Nguyen Dinh Tri");
//        author.add("Tran viet Dung");
//        author.add("Tran Xuan Hien");
//        author.add("Nguyen Xuan Thao");
//        for (int i = 0; i < author.toArray().length; i ++){
//            book1.addAuthor(author.get(i));
//        }
//        book1.setCategory("Lecture");
//        book1.setCost(1.2f);
//        book1.setId_to_store(4);
//        book.add(book1);
//
//        Book book2 = new Book("Algebra");
//        author.clear();
//        author.add("Nguyen Dinh Tri");
//        author.add("Tran viet Dung");
//        author.add("Tran Xuan Hien");
//        author.add("Nguyen Xuan Thao");
//        for (int i = 0; i < author.toArray().length; i ++){
//            book2.addAuthor(author.get(i));
//        }
//        book2.setCategory("Lecture");
//        book2.setCost(1.2f);
//        book2.setId_to_store(5);
//        book.add(book2);
//
//        Book book3 = new Book("Sherlock Holmes chapter 1");
//        author.clear();
//        author.add("Conan Doyle");
//        for (int i = 0; i < author.toArray().length; i ++){
//            book3.addAuthor(author.get(i));
//        }
//        book3.setCategory("Detective");
//        book3.setCost(10.2f);
//        book3.setId_to_store(6);
//        book.add(book3);
//
//        Book book4 = new Book("Sherlock Holmes chapter 2");
//        author.clear();
//        author.add("Conan Doyle");
//        for (int i = 0; i < author.toArray().length; i ++){
//            book4.addAuthor(author.get(i));
//        }
//        book4.setCategory("Detective");
//        book4.setCost(10.2f);
//        book4.setId_to_store(7);
//        book.add(book4);
//
//        Book book5 = new Book("The old man and the sea");
//        author.clear();
//        author.add("Earnest Hemingway");
//        for (int i = 0; i < author.toArray().length; i ++){
//            book5.addAuthor(author.get(i));
//        }
//        book5.setCategory("Novel");
//        book5.setCost(10.2f);
//        book5.setId_to_store(8);
//        book.add(book5);
//
//        //CD
//        CompactDisc cd1 = new CompactDisc("Conan");
//        cd1.setArtist("Aoyama Gosho");
//        cd1.setCategory("Detective");
//        cd1.setCost(14.4f);
//        cd1.setLength(120);
//        cd1.setId_to_store(9);
//        cd.add(cd1);
//
//        CompactDisc cd2 = new CompactDisc("Doraemon");
//        cd2.setArtist("Fujiko F.Fujio");
//        cd2.setCategory("Cartoon and Science Fiction");
//        cd2.setCost(14.4f);
//        cd2.setLength(120);
//        cd2.setId_to_store(10);
//        cd.add(cd2);
//
//        CompactDisc cd3 = new CompactDisc("Pokemon");
//        cd3.setArtist("Aoyama Gosho");
//        cd3.setCategory("Detective");
//        cd3.setCost(14.4f);
//        cd3.setLength(120);
//        cd3.setId_to_store(9);
//        cd.add(cd3);

//        for (int i = 0; i < book.size(); i ++) {
//            bookChoose.add(1);
//        }
//        for (int i = 0; i < dvd.size(); i ++) {
//            dvdChoose.add(1);
//        }
//        for (int i = 0; i < cd.size(); i ++) {
//            cdChoose.add(1);
//        }

        launch(args);
        System.exit(0);
    }

    public ObservableList<DigitalVideoDisc> getDVD(){
        dvds= FXCollections.observableArrayList();
        dvds.add(new DigitalVideoDisc("Roger Allers",87,"The Lion King","Animation",19.95f));
        dvds.add(new DigitalVideoDisc("George Lucas",124,"Star Wars","Science Fiction",24.95f));
        dvds.add(new DigitalVideoDisc("John Musker",90,"Aladdin","Animation",18.99f));

        return dvds;
    }
    public ObservableList<Book> getBook(){
        books= FXCollections.observableArrayList();
        author.add("Nguyen Dinh Tri");
        author.add("Tran viet Dung");
        author.add("Tran Xuan Hien");
        author.add("Nguyen Xuan Thao");
        books.add(new Book("Analysis","Lecture",1.2f,author));
        books.add(new Book("Algebra","Lecture",1.2f,author));
        author.clear();
        author.add("Conan Doyle");
        books.add(new Book( "Sherlock Holmes chapter 1","Detective",10.2f, author));
        books.add(new Book("Sherlock Holmes chapter 2","Detective", 10.2f,author));
        author.clear();
        author.add("Earnest Hemingway");
        books.add(new Book("The old man and the sea","Novel",10.2f, author));

        return books;
    }
    public ObservableList<CompactDisc> getCD(){
        cds= FXCollections.observableArrayList();
        cds.add(new CompactDisc("Aoyama Gosho", "Conan", 120, "Conan", "Detective", 14.4f));
        cds.add(new CompactDisc("Fujiko F.Fujio", "Doraemon", 120,"Doraemon","Cartoon and Science Fiction",14.4f));
        cds.add(new CompactDisc("Aoyama Gosho", "Pokemon", 120, "Pokemon", "Detective", 14.4f));

        return cds;
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

//////log in scene
        BorderPane logInPane = new BorderPane();
//        Scene logInScene = new Scene(logInPane, 1000, 500);
//        primaryStage.setScene(logInScene);

        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.setPadding(new Insets(25, 25, 25, 25));
    //display welcome
        Text scenetitle = new Text("Welcome");
        scenetitle.setStyle("-fx-font: 50 System; -fx-font-family:serif; -fx-font-weight: Bold; -fx-text-fill: #EDD382;");
        scenetitle.setLayoutX(150);
        scenetitle.setLayoutY(150);
        grid.add(scenetitle, 0, 0, 2, 1);
    //user name
        Label userName = new Label("Your Name:");
        userName.setStyle("-fx-font: 45 System; -fx-font-weight: Bold; -fx-text-fill: #3772FF");
        userName.setLayoutX(50);
        userName.setLayoutY(50);
        grid.add(userName, 0, 1);

        TextField name = new TextField();
        name.setPromptText("Enter your name.");
        grid.add(name, 1, 1);
    //pw
        Label pw = new Label("Password:");
        pw.setStyle("-fx-font: 45 System; -fx-font-weight: Bold; -fx-text-fill: #3772FF");
        pw.setLayoutX(50);
        pw.setLayoutY(50);
        grid.add(pw, 0, 2);

        PasswordField passwordField = new PasswordField();
        passwordField.setPromptText("Enter your password.");
        grid.add(passwordField, 1, 2);
    //choose roles
        Label role = new Label("Role:");
        role.setStyle("-fx-font: 45 System; -fx-font-weight: Bold; -fx-text-fill: #3772FF");
        role.setLayoutX(50);
        role.setLayoutY(50);
        grid.add(role, 0, 3);

        ComboBox<String> cbox= new ComboBox<>();
        cbox.getItems().addAll("User","Admin");
        cbox.setPromptText("What's your role?");
        grid.add(cbox,1,3);
//        cbox.setOnAction(e -> {
//            if((cbox.getValue()).equals("User"))
//        });

        Button btn = new Button("Sign in");
        btn.setMaxWidth(120);
        btn.setMaxHeight(90);
        HBox hbBtn = new HBox(10);
        hbBtn.setAlignment(Pos.BOTTOM_RIGHT);
        hbBtn.getChildren().add(btn);
        grid.add(hbBtn, 1, 5);

        final Text text = new Text();
        grid.add(text, 0, 6);
        GridPane.setColumnSpan(text, 2);
        GridPane.setHalignment(text, RIGHT);
    //banner
        Label titleLabel2 = new Label("Order Management Application");
        titleLabel2.setStyle("-fx-font-size: 34 System; -fx-font-weight: Bold; -fx-text-fill: #DF2935; -fx-background-color: #FDCA40");
        titleLabel2.setAlignment(Pos.CENTER);
        titleLabel2.setPrefWidth(1000);
        titleLabel2.setPrefHeight(60);
    //bakcground img
        Image image = new Image("D:\\code\\Java\\demo2\\images\\bookstore3.jpg");
        ImageView imageView = new ImageView(image);
        //Setting the position of the image
        imageView.setX(50);
        imageView.setY(25);
        //setting the fit height and width of the image view
        imageView.setFitHeight(455);
        imageView.setFitWidth(1000);
//        grid.getChildren().add(imageView);

        StackPane spane= new StackPane();
        spane.getChildren().addAll(imageView,grid);

        logInPane.setTop(titleLabel2);
        logInPane.setCenter(spane);
        Scene logInScene = new Scene(logInPane, 1000, 500);
        primaryStage.setScene(logInScene);
        btn.setOnMouseClicked(new EventHandler<MouseEvent>() {

            @Override
            public void handle(MouseEvent mouseEvent) {
                nameField=name.getText().toString();
                password = passwordField.getText().toString();
                if(name.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, "InputError!",
                            "Please enter your user name. ");
                    return;
                }
                if(passwordField.getText().isEmpty()) {
                    showAlert(Alert.AlertType.ERROR, "InputError!",
                            "Please enter your password. ");
                    return;
                }
                if((cbox.getValue()).equals("Admin")) primaryStage.setScene(adminScene);
                else  primaryStage.setScene(primaryScene);

            }
        });

//////admin scene
        // dvd table
        TableColumn<DigitalVideoDisc,String> dirtCol= new TableColumn<>("Director Name");
        dirtCol.setMinWidth(200);
        dirtCol.setCellValueFactory(new PropertyValueFactory<>("director"));
        TableColumn<DigitalVideoDisc,Integer> lenCol= new TableColumn<>("Length");
        lenCol.setMinWidth(100);
        lenCol.setCellValueFactory(new PropertyValueFactory<>("length"));
        TableColumn<DigitalVideoDisc,String> ttlCol= new TableColumn<>("Title Name");
        ttlCol.setMinWidth(200);
        ttlCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        TableColumn<DigitalVideoDisc,String> catCol= new TableColumn<>("Category Name");
        catCol.setMinWidth(200);
        catCol.setCellValueFactory(new PropertyValueFactory<>("category"));
        TableColumn<DigitalVideoDisc,Float> costCol= new TableColumn<>("Cost");
        costCol.setMinWidth(100);
        costCol.setCellValueFactory(new PropertyValueFactory<>("cost"));
        //text field to insert data
        director =new TextField();director.setMinWidth(200); length=new TextField();length.setMinWidth(100);
        title=new TextField();title.setMinWidth(200);  category=new TextField();category.setMinWidth(200);
        cost=new TextField();cost.setMinWidth(100);
        //dvd table view
        dvdTable=new TableView<>();
        dvdTable.setItems(getDVD());
        dvdTable.getColumns().addAll(dirtCol,lenCol,ttlCol,catCol,costCol);
        //to store in arrayList
        dvd=dvdTable.getItems();
        for (int i = 0; i < dvd.size(); i ++) {
            dvdChoose.add(1);
        }

        // book table
        TableColumn<Book,String> titleCol= new TableColumn<>("TITLE");
        titleCol.setMinWidth(200);
        titleCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        TableColumn<Book,String> categoryCol= new TableColumn<>("CATEGORY");
        categoryCol.setMinWidth(200);
        categoryCol.setCellValueFactory(new PropertyValueFactory<>("category"));
        TableColumn<Book,Float> bcostCol= new TableColumn<>("COST");
        bcostCol.setMinWidth(200);
        bcostCol.setCellValueFactory(new PropertyValueFactory<>("cost"));
        TableColumn<Book,ArrayList<String>> authorsCol= new TableColumn<>("AUTHORS");
        authorsCol.setMinWidth(200);
        authorsCol.setCellValueFactory(new PropertyValueFactory<>("authors"));
        //text field to insert data
        btitle = new TextField();  bcategory= new TextField(); bcost= new TextField(); bauthors= new TextField();
        //book table view
        bookTable=new TableView<>();
        bookTable.setItems(getBook());
        bookTable.getColumns().addAll(titleCol,categoryCol,bcostCol,authorsCol);
        //to store in arrayList
        book=bookTable.getItems();
        for (int i = 0; i < book.size(); i ++) {
            bookChoose.add(1);
        }

        //cd table
        TableColumn<CompactDisc,String> cddirtCol= new TableColumn<>("Director Name");
        cddirtCol.setMinWidth(200);
        cddirtCol.setCellValueFactory(new PropertyValueFactory<>("director"));
        TableColumn<CompactDisc,Integer> cdlenCol= new TableColumn<>("Length");
        cdlenCol.setMinWidth(100);
        cdlenCol.setCellValueFactory(new PropertyValueFactory<>("length"));
        TableColumn<CompactDisc,String> cdttlCol= new TableColumn<>("Title Name");
        cdttlCol.setMinWidth(200);
        cdttlCol.setCellValueFactory(new PropertyValueFactory<>("title"));
        TableColumn<CompactDisc,String> cdcatCol= new TableColumn<>("Category Name");
        cdcatCol.setMinWidth(200);
        cdcatCol.setCellValueFactory(new PropertyValueFactory<>("category"));
        TableColumn<CompactDisc,Float> cdcostCol= new TableColumn<>("Cost");
        cdcostCol.setMinWidth(100);
        cdcostCol.setCellValueFactory(new PropertyValueFactory<>("cost"));
        TableColumn<CompactDisc,ArrayList<String>> cdartistCol= new TableColumn<>("ARTIST");
        cdartistCol.setMinWidth(200);
        cdartistCol.setCellValueFactory(new PropertyValueFactory<>("artist"));
        //text field to insert data
        cddirector =new TextField();cddirector.setMinWidth(200); cdlength=new TextField();cdlength.setMinWidth(100);
        cdtitle=new TextField();cdtitle.setMinWidth(200);  cdcategory=new TextField();cdcategory.setMinWidth(200);
        cdcost=new TextField();cdcost.setMinWidth(100); cdartist= new TextField(); cdartist.setMinWidth(200);
        // cd table view
        cdTable=new TableView<>();
        cdTable.setItems(getCD());
        cdTable.getColumns().addAll(cddirtCol,cdlenCol,cdttlCol,cdcatCol,cdcostCol,cdartistCol);
        //to store in arrayList
        cd=cdTable.getItems();
        for (int i = 0; i < cd.size(); i ++) {
            cdChoose.add(1);
        }

        //order table
        TableColumn<Order,Integer> indexCol = new TableColumn<>("Bil");
        indexCol.setMinWidth(200);
        indexCol.setCellValueFactory(new PropertyValueFactory<>("orderTabId"));
        TableColumn<Order,String> detailCol = new TableColumn<>("Order Details");
        detailCol.setMinWidth(200);
        detailCol.setCellValueFactory(new PropertyValueFactory<>("orderTabDetails"));
        orderTable=new TableView<>();
        orderTable.setItems(getOrder());
        orderTable.getColumns().addAll(indexCol,detailCol);
        orderTable.setMaxHeight(300);

        //table buttons,hbox        not used
//        Button addBtn= new Button("ADD");
//        addBtn.setOnAction(e -> addBtnClicked());
//        Button delBtn= new Button("DELETE");
//        delBtn.setOnAction(e -> delBtnClicked());
        //diff table
//        btnhb.getChildren().addAll(director,length,title,category,cost,addBtn,delBtn);
//        adminbp.setBottom(tableVB);
//        tableVB.getChildren().addAll(dvdTable,btnhb);

        BorderPane adminbp= new BorderPane();
        HBox adminhb = new HBox();
        //scene for each table
        //book scene
        Button bookaddBtn= new Button("ADD");
        bookaddBtn.setOnAction(e -> bookAddBtn());
        Button bookdelBtn= new Button("DELETE");
        bookdelBtn.setOnAction(e -> bookDelBtn());
        HBox bookBtnHb= new HBox();
        bookBtnHb.setPadding(new Insets(10,10,10,10));
        bookBtnHb.setSpacing(10);
        //search bar
        HBox booksearchHb= new HBox();
        Label booksearchLabel = new Label("key in item to search(analysis,lecture):");
        booksearchLabel.setStyle("-fx-font: 25 System; -fx-font-weight: Bold; -fx-text-fill: #C1121F");
        TextField bookSearchText = new TextField();
        booksearchHb.getChildren().addAll(booksearchLabel,bookSearchText);
        FilteredList<Book>bookFilter= new FilteredList<>(books,b->true);
        bookSearchText.textProperty().addListener((observable,oldValue,newValue)->{
            bookFilter.setPredicate(bookobj->{
                if(newValue==null||newValue.isEmpty()) return true;
                String lowerCase=newValue.toLowerCase();
                if(bookobj.getCategory().toLowerCase().indexOf(lowerCase) != -1) return true;
                else if(bookobj.getTitle().toLowerCase().indexOf(lowerCase) != -1) return true;
//                else if(bookobj.getAuthors().toLowerCase().indexOf(lowerCase) != -1) return true;
                else return false;
            });
        });
        SortedList<Book> booksorted= new SortedList<>(bookFilter);
        booksorted.comparatorProperty().bind(bookTable.comparatorProperty());
        bookTable.setItems(booksorted);
        VBox bookTabVb = new VBox();
        bookBtnHb.getChildren().addAll(btitle, bcategory, bcost,bauthors,bookaddBtn,bookdelBtn);
        bookTabVb.getChildren().addAll(booksearchHb,bookTable,bookBtnHb);
        Scene bookScene= new Scene(bookTabVb);

        //cd scene
        Button cdaddBtn= new Button("ADD");
        cdaddBtn.setOnAction(e -> cdAddBtn());
        Button cddelBtn= new Button("DELETE");
        cddelBtn.setOnAction(e -> cdDelBtn());
        HBox cdBtnHb= new HBox();
        cdBtnHb.setPadding(new Insets(10,10,10,10));
        cdBtnHb.setSpacing(10);
        //search bar
        HBox cdsearchHb= new HBox();
        Label cdsearchLabel = new Label("key in item to search(director,title,category,artist):");
        cdsearchLabel.setStyle("-fx-font: 25 System; -fx-font-weight: Bold; -fx-text-fill: #C1121F");
        TextField cdSearchText = new TextField();
        cdsearchHb.getChildren().addAll(cdsearchLabel,cdSearchText);
        FilteredList<CompactDisc>cdFilter= new FilteredList<>(cds,b->true);
        cdSearchText.textProperty().addListener((observable,oldValue,newValue)->{
            cdFilter.setPredicate(cdobj->{
                if(newValue==null||newValue.isEmpty()) return true;
                String lowerCase=newValue.toLowerCase();
                if(cdobj.getCategory().toLowerCase().indexOf(lowerCase) != -1) return true;
                else if(cdobj.getTitle().toLowerCase().indexOf(lowerCase) != -1) return true;
                else if(cdobj.getDirector().toLowerCase().indexOf(lowerCase) != -1) return true;
                else if(cdobj.getArtist().toLowerCase().indexOf(lowerCase) != -1) return true;
                else return false;
            });
        });
        SortedList<CompactDisc> cdsorted= new SortedList<>(cdFilter);
        cdsorted.comparatorProperty().bind(cdTable.comparatorProperty());
        cdTable.setItems(cdsorted);
        VBox cdTabVb = new VBox();
        cdBtnHb.getChildren().addAll(cddirector, cdlength, cdtitle, cdcategory, cdcost,cdartist,cdaddBtn,cddelBtn);
        cdTabVb.getChildren().addAll(cdsearchHb,cdTable,cdBtnHb);
        Scene cdScene= new Scene(cdTabVb);

        //dvd scene
        Button dvdaddBtn= new Button("ADD");
        dvdaddBtn.setOnAction(e -> dvdAddBtn());
        Button dvddelBtn= new Button("DELETE");
        dvddelBtn.setOnAction(e -> dvdDelBtn());
        HBox dvdBtnHb= new HBox();
        dvdBtnHb.setPadding(new Insets(10,10,10,10));
        dvdBtnHb.setSpacing(10);
        //search bar
        HBox dvdsearchHb= new HBox();
        Label dvdsearchLabel = new Label("key in item to search(director,title,category):");
        dvdsearchLabel.setStyle("-fx-font: 25 System; -fx-font-weight: Bold; -fx-text-fill: #C1121F");
        TextField dvdSearchText = new TextField();
        dvdsearchHb.getChildren().addAll(dvdsearchLabel,dvdSearchText);
        FilteredList<DigitalVideoDisc>dvdFilter= new FilteredList<>(dvds,b->true);
        dvdSearchText.textProperty().addListener((observable,oldValue,newValue)->{
            dvdFilter.setPredicate(dvdobj->{
                if(newValue==null||newValue.isEmpty()) return true;
                String lowerCase=newValue.toLowerCase();
                if(dvdobj.getCategory().toLowerCase().indexOf(lowerCase) != -1) return true;
                else if(dvdobj.getTitle().toLowerCase().indexOf(lowerCase) != -1) return true;
                else if(dvdobj.getDirector().toLowerCase().indexOf(lowerCase) != -1) return true;
                else return false;
            });
        });
        SortedList<DigitalVideoDisc> sorted= new SortedList<>(dvdFilter);
        sorted.comparatorProperty().bind(dvdTable.comparatorProperty());
        dvdTable.setItems(sorted);

        VBox dvdTabVb = new VBox();
        dvdBtnHb.getChildren().addAll(director, length, title, category, cost,dvdaddBtn,dvddelBtn);
        dvdTabVb.getChildren().addAll(dvdsearchHb,dvdTable,dvdBtnHb);
        Scene dvdScene= new Scene(dvdTabVb);

        //table select buttons
        //book btn
        Image bookBtnImg = new Image("D:\\code\\Java\\demo2\\images\\bookBtn.jpg");
        ImageView bookBtnImgV = new ImageView(bookBtnImg);
        bookBtnImgV.setFitHeight(200);
        bookBtnImgV.setFitWidth(200);
        Button bookTabBtn = new Button("manage book table",bookBtnImgV);
        bookTabBtn.setMaxWidth(400);
        bookTabBtn.setMaxHeight(200);
//        bookTabBtn.setGraphic(bookBtnImgV);
        bookTabBtn.setOnMouseClicked(e -> {
            Stage bookTabStg = new Stage();
            bookTabStg.setScene(bookScene);
            bookTabStg.show();
        });
        //cd btn
        Image cdBtnImg = new Image("D:\\code\\Java\\demo2\\images\\cdBtn.jpg");
        ImageView cdBtnImgV = new ImageView(cdBtnImg);
        cdBtnImgV.setFitHeight(200);
        cdBtnImgV.setFitWidth(200);
        Button cdTabBtn = new Button("manage CD table",cdBtnImgV);
        cdTabBtn.setMaxWidth(400);
        cdTabBtn.setMaxHeight(200);
//        cdTabBtn.setGraphic(cdBtnImgV);
        cdTabBtn.setOnMouseClicked(e -> {
            Stage cdTabStg = new Stage();
            cdTabStg.setScene(cdScene);
            cdTabStg.show();
        });
        //dvd btn
        Button dvdTabBtn = new Button("manage DVD table");
        Image dvdBtnImg = new Image("D:\\code\\Java\\demo2\\images\\dvdBtn.png");
        ImageView dvdBtnImgV = new ImageView(dvdBtnImg);
        dvdTabBtn.setMaxWidth(400);
        dvdTabBtn.setMaxHeight(200);
        dvdTabBtn.setGraphic(dvdBtnImgV);
        dvdBtnImgV.setFitHeight(200);
        dvdBtnImgV.setFitWidth(200);
        dvdTabBtn.setOnMouseClicked(e -> {
            Stage dvdTabStg = new Stage();
            dvdTabStg.setScene(dvdScene);
            dvdTabStg.show();
        });

        //btn for back to log in
        Button bckBtn= new Button("back to previous page");
        bckBtn.setMaxHeight(50);
        bckBtn.setMaxWidth(170);
//        Parent root = FXMLLoader.load(getClass().getResource("adminAction.fxml"));
//        Scene AdminInfoScene = new Scene(root);
        bckBtn.setOnMouseClicked(e -> {
            primaryStage.setScene(logInScene);
//            adminName.setText(nameField);
//            adminPass.setText(password);
//            adminAction.setText(action);
        });
//        adminInfoBtn.setOnMouseClicked(e -> primaryStage.setScene(logInScene));

        //test
        Scene orderScene= new Scene(orderTable);
        HBox orderhb= new HBox(orderTable);
//        Button testorder=new Button("order");
//        testorder.setOnMouseClicked(e -> { Stage orderstg = new Stage();
//            orderstg.setScene(orderScene);
//            orderstg.show(); });

        //banner
        VBox bannervb = new VBox();
        Label adminSceneLabel = new Label("Order Management Application");
        adminSceneLabel.setStyle("-fx-font-size: 34 System; -fx-font-weight: Bold; -fx-text-fill: #080708; -fx-background-color: #DF2935");
        adminSceneLabel.setAlignment(Pos.CENTER);
        adminSceneLabel.setPrefWidth(1000);
        adminSceneLabel.setPrefHeight(60);

        Label adminTitleLabel = new Label("Admin Management");
        adminTitleLabel.setStyle("-fx-font-size: 28 System; -fx-font-family:serif; -fx-font-weight: Bold; -fx-text-fill: #E6E8E6; -fx-background-color: #FDCA40");
        adminTitleLabel.setAlignment(Pos.CENTER);
        adminTitleLabel.setPrefWidth(1000);
        adminTitleLabel.setPrefHeight(60);

        Label adminLabel = new Label("Click on the button below to manage different tables.");
        adminLabel.setStyle("-fx-font-size: 20 System; -fx-font-family:serif; -fx-font-weight: Bold; -fx-text-fill: #DF2935;");
        adminLabel.setAlignment(Pos.CENTER);
        adminLabel.setPrefWidth(1000);
        adminLabel.setPrefHeight(40);

        //content pane for switch
        Pane adminConPane= new Pane();
        adminConPane.getChildren().add(adminhb);

        //menu
        Menu tablesMenu= new Menu("Tables");
        MenuItem tablemi = new MenuItem("tables...");
        tablemi.setOnAction(e -> {
            adminConPane.getChildren().remove(orderhb);
            adminConPane.getChildren().add(adminhb);
        });
        tablesMenu.getItems().add(tablemi);
        Menu orderMenu= new Menu("Order(s)");
        MenuItem ordermi= new MenuItem("orders...");
        ordermi.setOnAction(e -> {
            adminConPane.getChildren().remove(adminhb);
            adminConPane.getChildren().add(orderhb);
        });
        orderMenu.getItems().add(ordermi);
        MenuBar menuBar= new MenuBar();
        menuBar.getMenus().addAll(tablesMenu,orderMenu);

        bannervb.getChildren().addAll(adminSceneLabel,adminTitleLabel,menuBar);
        adminhb.getChildren().addAll(bookTabBtn,cdTabBtn,dvdTabBtn);
        adminhb.setAlignment(Pos.CENTER);
        adminbp.setTop(bannervb);
        adminbp.setPadding(new Insets(10));

        adminbp.setCenter(adminConPane);
        adminbp.setBottom(bckBtn);
        adminbp.setStyle("-fx-background-color:#E6E8E6; -fx-border-width: 5; ");
        adminScene= new Scene(adminbp,1000, 500);

//////user scene
        BorderPane primaryPane = new BorderPane();
        ///////////////////// Khoi tao tieu de
        Label titleLabel = new Label("Order Management Application");
        titleLabel.setStyle("-fx-font-size: 34 System; -fx-font-weight: Bold; -fx-text-fill: #3772FF; -fx-background-color: #FDCA40");
        titleLabel.setAlignment(Pos.CENTER);
        titleLabel.setPrefWidth(1000);
        titleLabel.setPrefHeight(60);
        primaryPane.setTop(titleLabel);

        primaryScene = new Scene(primaryPane, 1000, 500);
//        primaryStage.setScene(primaryScene);

        /////////////////////// Khoi tao Menu
        VBox menuBox = new VBox();
        menuBox.setStyle("-fx-background-color: #2c3e50; -fx-border-width: 5; -fx-border-color: #2ecc71");
        menuBox.setPrefWidth(248);
        menuBox.setPrefHeight(425);
        primaryPane.setLeft(menuBox);

        Label menuLabel = new Label("MENU");
        menuLabel.setStyle("-fx-font-size: 41 Tahoma; -fx-text-fill: #f1c40f; -fx-font-weight: Bold; -fx-border-color: #2ecc71; -fx-border-width: 5");
        menuLabel.setPrefSize(238, 118);
        menuLabel.setAlignment(Pos.CENTER);

        Label createLabel = new Label("  Create new Order");
        createLabel.setStyle("-fx-font-size: 15 System; -fx-text-fill: #DF2935; -fx-border-color: #2ecc71; -fx-border-width: 5");
        createLabel.setPrefSize(259, 62);

        Label addLabel = new Label("  Add item to the order");
        addLabel.setStyle("-fx-font-size: 15 System; -fx-text-fill: #DF2935; -fx-border-color: #2ecc71; -fx-border-width: 5");
        addLabel.setPrefSize(259, 62);

        Label deleteLabel = new Label("  Delete item by id");
        deleteLabel.setStyle("-fx-font-size: 15 System; -fx-text-fill: #DF2935; -fx-border-color: #2ecc71; -fx-border-width: 5");
        deleteLabel.setPrefSize(259, 62);

        Label displayLabel = new Label("  Display the items list of order");
        displayLabel.setStyle("-fx-font-size: 15 System; -fx-text-fill: #DF2935; -fx-border-color: #2ecc71; -fx-border-width: 5");
        displayLabel.setPrefSize(259, 62);

        Label exitLabel = new Label("  Exit to review");
        exitLabel.setStyle("-fx-font-size: 15 System; -fx-text-fill: #DF2935; -fx-border-color: #2ecc71; -fx-border-width: 5");
        exitLabel.setPrefSize(259, 76);

        menuBox.getChildren().addAll(menuLabel,createLabel,addLabel, deleteLabel, displayLabel, exitLabel);

        Pane contentPane = new Pane();
        contentPane.setPrefSize(760, 420);
        contentPane.setStyle("-fx-background-color: #E6E8E6");
        primaryPane.setCenter(contentPane);

        ////////////////////// lock stage after paid
        Stage lockStage = new Stage();
        AnchorPane lockPane = new AnchorPane();
        Label lockLabel = new Label("You need to create an order to continue shopping !\n Please click \"CREATE NEW ORDER\' to proceed shopping. ");
        lockPane.getChildren().add(lockLabel);
        Scene lockScence = new Scene(lockPane, 400, 200);
        lockStage.setScene(lockScence);

        ///////////////////////   Main scene
        Label primaryLabel = new Label("Welcome to our store");
        primaryLabel.setStyle("-fx-font: 40 System; -fx-font-weight: Bold; -fx-text-fill: #780000");
        primaryLabel.setLayoutX(150);
        primaryLabel.setLayoutY(150);
        contentPane.getChildren().add(primaryLabel);

        menuLabel.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                contentPane.getChildren().clear();
                contentPane.getChildren().add(primaryLabel);
            }
        });

        /////////////////// Create new Order
        createLabel.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                contentPane.getChildren().clear();
                for (int i = 0; i < book.size(); i ++) {
                    bookChoose.set(i, 1);
                }
                for (int i = 0; i < dvd.size(); i ++) {
                    dvdChoose.set(i, 1);
                }
                for (int i = 0; i < cd.size(); i ++) {
                    cdChoose.set(i, 1);
                }
                anOrder.itemsOrdered.clear();
                pay = 0;

                Label newOrderLabel = new Label("New Order was created !");
                newOrderLabel.setStyle("-fx-font: 30 System; -fx-font-weight: Bold; -fx-text-fill: #780000");
                newOrderLabel.setLayoutX(200);
                newOrderLabel.setLayoutY(180);
                contentPane.getChildren().add(newOrderLabel);
            }
        });
        //////////////////////////  Add item to order
        addLabel.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                contentPane.getChildren().clear();

                ToolBar itemBar = new ToolBar();
                itemBar.setStyle("-fx-background-color: #fcb941");
                itemBar.setPrefSize(760, 22);

                Button bookItem = new Button("Book");
                bookItem.setStyle("-fx-font: 15 System; -fx-font-weight: Bold; -fx-text-fill: #3a539b; -fx-background-color: #f2784b");
                bookItem.setAlignment(Pos.CENTER);
                bookItem.setPrefSize(150, 21);

                Button dvdItem = new Button("Digital Video Disc");
                dvdItem.setStyle("-fx-font: 15 System; -fx-font-weight: Bold; -fx-text-fill: #3a539b; -fx-background-color: #f2784b");
                dvdItem.setAlignment(Pos.CENTER);
                dvdItem.setPrefSize(150, 21);

                Button cdItem = new Button("Compact Disc");
                cdItem.setStyle("-fx-font: 15 System; -fx-font-weight: Bold; -fx-text-fill: #3a539b; -fx-background-color: #f2784b");
                cdItem.setAlignment(Pos.CENTER);
                cdItem.setPrefSize(150, 21);

                Button payItem = new Button("List item");
                payItem.setStyle("-fx-font: 15 System; -fx-font-weight: Bold; -fx-text-fill: #3a539b; -fx-background-color: #f2784b");
                payItem.setAlignment(Pos.CENTER);
                payItem.setPrefSize(150, 21);
                itemBar.getItems().addAll(bookItem, dvdItem, cdItem, payItem);

                ScrollPane listItemPane = new ScrollPane();
                listItemPane.setPrefSize(750, 400);
                listItemPane.setLayoutY(31);
                listItemPane.setStyle("-fx-background-color: #7f8c8d");
                VBox listItemBox = new VBox();
                listItemBox.setPrefWidth(760);
                listItemBox.setStyle("-fx-background-color: #7f8c8d");
                listItemPane.setContent(listItemBox);

                Label welcomeAddItem = new Label("Choose the type of item you want to add");
                welcomeAddItem.setStyle("-fx-font: 30 System; -fx-font-weight: Bold; -fx-text-fill: #7f8c8d");
                welcomeAddItem.setLayoutX(100);
                welcomeAddItem.setLayoutY(180);
                contentPane.getChildren().addAll(itemBar, listItemPane, welcomeAddItem);


                //////////////////// show list of books
                bookItem.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        listItemBox.getChildren().clear();
                        contentPane.getChildren().remove(welcomeAddItem);
                        ArrayList<SplitPane> listMediaItem = new ArrayList<>();
                        ArrayList<Label> mediaTitle = new ArrayList<>();
                        ArrayList<Pane> mediaInfoPane = new ArrayList<>();
                        ArrayList<TextArea> mediaInfo = new ArrayList<>();
                        ArrayList<Button> addOrSub = new ArrayList<>();

                        for (int i = 0; i < book.size(); i ++) {
                            listMediaItem.add(null);
                            listMediaItem.set(i, new SplitPane());
                            listMediaItem.get(i).setOrientation(Orientation.VERTICAL);
                            listMediaItem.get(i).setPrefSize(760, 150);
                            listItemBox.getChildren().add(listMediaItem.get(i));

                            mediaTitle.add(null);
                            mediaTitle.set(i, new Label(book.get(i).getTitle()));
                            mediaTitle.get(i).setStyle("-fx-font-size: 20 System; -fx-font-weight: Bold; -fx-text-fill: #4d13d1; -fx-background-color: #e8e8e8");
                            mediaTitle.get(i).setAlignment(Pos.CENTER);
                            mediaTitle.get(i).setPrefSize(758, 31);

                            mediaInfoPane.add(null);
                            mediaInfoPane.set(i, new Pane());
                            mediaInfoPane.get(i).setStyle("-fx-background-color: #c5eff7");

                            mediaInfo.add(null);
                            mediaInfo.set(i, new TextArea("Authors: " + book.get(i).getAuthors() + "\n"
                                    + "Category: " + book.get(i).getCategory() + "\n"
                                    + "Cost: " + book.get(i).getCost() + "$\n"
                                    + "ID: " + book.get(i).getId_to_store()));
                            mediaInfo.get(i).setStyle("-fx-font-size: 15 System; -fx-text-fill: #f62459");
                            mediaInfo.get(i).setLayoutX(100);
                            mediaInfo.get(i).setEditable(false);

                            addOrSub.add(null);
                            addOrSub.set(i, new Button());
                            if (bookChoose.get(i) == 1) {
                                addOrSub.get(i).setText("Add");
                            }
                            else {
                                addOrSub.get(i).setText("Sub");
                            }
                            addOrSub.get(i).setStyle("-fx-font-size: 15 System; -fx-text-fill: #f03434; -fx-background-color: #c8f7c5");
                            addOrSub.get(i).setLayoutX(480);
                            addOrSub.get(i).setLayoutY(70);
                            mediaInfoPane.get(i).getChildren().addAll(mediaInfo.get(i), addOrSub.get(i));
                            listMediaItem.get(i).getItems().addAll(mediaTitle.get(i), mediaInfoPane.get(i));

                            int finalI = i;
                            addOrSub.get(i).setOnMouseClicked(new EventHandler<MouseEvent>() {
                                @Override
                                public void handle(MouseEvent mouseEvent) {
                                    if (pay == 0){
                                        if (bookChoose.get(finalI) == 0) {
                                            bookChoose.set(finalI, (bookChoose.get(finalI) + 1) % 2);
                                            addOrSub.get(finalI).setText("Add");
                                            anOrder.itemsOrdered.remove(book.get(finalI));
                                        } else if (anOrder.itemsOrdered.size() < anOrder.MAX_NUMBERS_ORDERED) {
                                            bookChoose.set(finalI, (bookChoose.get(finalI) + 1) % 2);
                                            addOrSub.get(finalI).setText("Sub");
                                            anOrder.itemsOrdered.add(book.get(finalI));
                                        } else {
                                            Label label = new Label("Full items of the order !!");
                                            AnchorPane root = new AnchorPane();
                                            root.getChildren().add(label);
                                            Scene scene = new Scene(root, 200, 200);
                                            Stage stage = new Stage();
                                            stage.setScene(scene);
                                            stage.initModality(Modality.WINDOW_MODAL);
                                            stage.initOwner(primaryStage);
                                            stage.show();
                                        }
                                    }
                                    else {
                                        lockStage.show();
                                    }
                                }
                            });
                        }
                    }
                });

                //////////////////// show list of dvds
                dvdItem.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        listItemBox.getChildren().clear();
                        contentPane.getChildren().remove(welcomeAddItem);
                        ArrayList<SplitPane> listMediaItem = new ArrayList<>();
                        ArrayList<Label> mediaTitle = new ArrayList<>();
                        ArrayList<Pane> mediaInfoPane = new ArrayList<>();
                        ArrayList<TextArea> mediaInfo = new ArrayList<>();
                        ArrayList<Button> addOrSub = new ArrayList<>();

                        for (int i = 0; i < dvd.size(); i ++) {
                            listMediaItem.add(null);
                            listMediaItem.set(i, new SplitPane());
                            listMediaItem.get(i).setOrientation(Orientation.VERTICAL);
                            listMediaItem.get(i).setPrefSize(760, 150);
                            listItemBox.getChildren().add(listMediaItem.get(i));

                            mediaTitle.add(null);
                            mediaTitle.set(i, new Label(dvd.get(i).getTitle()));
                            mediaTitle.get(i).setStyle("-fx-font-size: 20 System; -fx-font-weight: Bold; -fx-text-fill: #4d13d1; -fx-background-color: #e8e8e8");
                            mediaTitle.get(i).setAlignment(Pos.CENTER);
                            mediaTitle.get(i).setPrefSize(758, 31);

                            mediaInfoPane.add(null);
                            mediaInfoPane.set(i, new Pane());
                            mediaInfoPane.get(i).setStyle("-fx-background-color: #c5eff7");

                            mediaInfo.add(null);
                            mediaInfo.set(i, new TextArea("Director: " + dvd.get(i).getDirector() + "\n"
                                    + "Category: " + dvd.get(i).getCategory() + "\n"
                                    + "Length: " + dvd.get(i).getLength() + "\n"
                                    + "Cost: " + dvd.get(i).getCost() + "$\n"
                                    + "ID: " + dvd.get(i).getId_to_store()));
                            mediaInfo.get(i).setStyle("-fx-font-size: 15 System; -fx-text-fill: #f62459");
                            mediaInfo.get(i).setLayoutX(100);
                            mediaInfo.get(i).setEditable(false);

                            addOrSub.add(null);
                            addOrSub.set(i, new Button());
                            if (dvdChoose.get(i) == 1) {
                                addOrSub.get(i).setText("Add");
                            }
                            else {
                                addOrSub.get(i).setText("Sub");
                            }
                            addOrSub.get(i).setStyle("-fx-font-size: 15 System; -fx-text-fill: #f03434; -fx-background-color: #c8f7c5");
                            addOrSub.get(i).setLayoutX(480);
                            addOrSub.get(i).setLayoutY(70);
                            mediaInfoPane.get(i).getChildren().addAll(mediaInfo.get(i), addOrSub.get(i));
                            listMediaItem.get(i).getItems().addAll(mediaTitle.get(i), mediaInfoPane.get(i));

                            int finalI = i;
                            addOrSub.get(i).setOnMouseClicked(new EventHandler<MouseEvent>() {
                                @Override
                                public void handle(MouseEvent mouseEvent) {
                                    if (pay == 0){
                                        if (dvdChoose.get(finalI) == 0) {
                                            dvdChoose.set(finalI, (dvdChoose.get(finalI) + 1) % 2);
                                            addOrSub.get(finalI).setText("Add");
                                            anOrder.itemsOrdered.remove(dvd.get(finalI));
                                        } else if (anOrder.itemsOrdered.size() < anOrder.MAX_NUMBERS_ORDERED) {
                                            dvdChoose.set(finalI, (dvdChoose.get(finalI) + 1) % 2);
                                            addOrSub.get(finalI).setText("Sub");
                                            anOrder.itemsOrdered.add(dvd.get(finalI));
                                        } else {
                                            Label label = new Label("Full items of the order !!");
                                            AnchorPane root = new AnchorPane();
                                            root.getChildren().add(label);
                                            Scene scene = new Scene(root, 200, 200);
                                            Stage stage = new Stage();
                                            stage.setScene(scene);
                                            stage.initModality(Modality.WINDOW_MODAL);
                                            stage.initOwner(primaryStage);
                                            stage.show();
                                        }
                                    }
                                    else {
                                        lockStage.show();
                                    }
                                }
                            });
                        }
                    }
                });
                //////////////////// show list of CDs
                cdItem.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        listItemBox.getChildren().clear();
                        contentPane.getChildren().remove(welcomeAddItem);
                        ArrayList<SplitPane> listMediaItem = new ArrayList<>();
                        ArrayList<Label> mediaTitle = new ArrayList<>();
                        ArrayList<Pane> mediaInfoPane = new ArrayList<>();
                        ArrayList<TextArea> mediaInfo = new ArrayList<>();
                        ArrayList<Button> addOrSub = new ArrayList<>();

                        for (int i = 0; i < cd.size(); i ++) {
                            listMediaItem.add(null);
                            listMediaItem.set(i, new SplitPane());
                            listMediaItem.get(i).setOrientation(Orientation.VERTICAL);
                            listMediaItem.get(i).setPrefSize(760, 180);
                            listItemBox.getChildren().add(listMediaItem.get(i));

                            mediaTitle.add(null);
                            mediaTitle.set(i, new Label(cd.get(i).getTitle()));
                            mediaTitle.get(i).setStyle("-fx-font-size: 20 System; -fx-font-weight: Bold; -fx-text-fill: #4d13d1; -fx-background-color: #e8e8e8");
                            mediaTitle.get(i).setAlignment(Pos.CENTER);
                            mediaTitle.get(i).setPrefSize(758, 31);

                            mediaInfoPane.add(null);
                            mediaInfoPane.set(i, new Pane());
                            mediaInfoPane.get(i).setStyle("-fx-background-color: #c5eff7");

                            mediaInfo.add(null);
                            mediaInfo.set(i, new TextArea("Director: " + cd.get(i).getDirector() + "\n"
                                    + "Artist: " + cd.get(i).getArtist() + "\n"
                                    + "Category: " + cd.get(i).getCategory() + "\n"
                                    + "Length: " + cd.get(i).getLength() + "\n"
                                    + "Cost: " + cd.get(i).getCost() + "$\n"
                                    + "ID: " + cd.get(i).getId_to_store()));
                            mediaInfo.get(i).setStyle("-fx-font-size: 15 System; -fx-text-fill: #f62459");
                            mediaInfo.get(i).setLayoutX(100);
                            mediaInfo.get(i).setEditable(false);

                            addOrSub.add(null);
                            addOrSub.set(i, new Button());
                            if (cdChoose.get(i) == 1) {
                                addOrSub.get(i).setText("Add");
                            }
                            else {
                                addOrSub.get(i).setText("Sub");
                            }
                            addOrSub.get(i).setStyle("-fx-font-size: 15 System; -fx-text-fill: #f03434; -fx-background-color: #c8f7c5");
                            addOrSub.get(i).setLayoutX(480);
                            addOrSub.get(i).setLayoutY(70);
                            mediaInfoPane.get(i).getChildren().addAll(mediaInfo.get(i), addOrSub.get(i));
                            listMediaItem.get(i).getItems().addAll(mediaTitle.get(i), mediaInfoPane.get(i));

                            int finalI = i;
                            addOrSub.get(i).setOnMouseClicked(new EventHandler<MouseEvent>() {
                                @Override
                                public void handle(MouseEvent mouseEvent) {
                                    if (pay == 0){
                                        if (cdChoose.get(finalI) == 0) {
                                            cdChoose.set(finalI, (cdChoose.get(finalI) + 1) % 2);
                                            addOrSub.get(finalI).setText("Add");
                                            anOrder.itemsOrdered.remove(cd.get(finalI));
                                        } else if (anOrder.itemsOrdered.size() < anOrder.MAX_NUMBERS_ORDERED) {
                                            cdChoose.set(finalI, (cdChoose.get(finalI) + 1) % 2);
                                            addOrSub.get(finalI).setText("Sub");
                                            anOrder.itemsOrdered.add(cd.get(finalI));
                                        } else {
                                            Label label = new Label("Full items of the order !!");
                                            AnchorPane root = new AnchorPane();
                                            root.getChildren().add(label);
                                            Scene scene = new Scene(root, 200, 200);
                                            Stage stage = new Stage();
                                            stage.setScene(scene);
                                            stage.initModality(Modality.WINDOW_MODAL);
                                            stage.initOwner(primaryStage);
                                            stage.show();
                                        }
                                    }
                                    else {
                                        lockStage.show();
                                    }
                                }
                            });
                        }
                    }
                });
                //////////////////// Show list item of order and pay
                payItem.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        listItemBox.getChildren().clear();
                        contentPane.getChildren().remove(welcomeAddItem);
                        ArrayList<SplitPane> listMediaItem = new ArrayList<>();
                        ArrayList<Label> mediaTitle = new ArrayList<>();
                        ArrayList<Pane> mediaInfoPane = new ArrayList<>();
                        ArrayList<TextArea> mediaInfo = new ArrayList<>();

                        for (int i = 0; i < anOrder.itemsOrdered.size(); i++) {
                            listMediaItem.add(null);
                            listMediaItem.set(i, new SplitPane());
                            listMediaItem.get(i).setOrientation(Orientation.VERTICAL);
                            listMediaItem.get(i).setPrefSize(760, 180);
                            listItemBox.getChildren().add(listMediaItem.get(i));

                            mediaTitle.add(null);
                            mediaTitle.set(i, new Label(anOrder.itemsOrdered.get(i).getTitle()));
                            mediaTitle.get(i).setStyle("-fx-font-size: 20 System; -fx-font-weight: Bold; -fx-text-fill: #4d13d1; -fx-background-color: #e8e8e8");
                            mediaTitle.get(i).setAlignment(Pos.CENTER);
                            mediaTitle.get(i).setPrefSize(758, 31);

                            mediaInfoPane.add(null);
                            mediaInfoPane.set(i, new Pane());
                            mediaInfoPane.get(i).setStyle("-fx-background-color: #c5eff7");

                            mediaInfo.add(null);
                            if (anOrder.itemsOrdered.get(i) instanceof CompactDisc) {
                                mediaInfo.set(i, new TextArea("Director: " + ((CompactDisc) anOrder.itemsOrdered.get(i)).getDirector() + "\n"
                                        + "Artist: " + ((CompactDisc) anOrder.itemsOrdered.get(i)).getArtist() + "\n"
                                        + "Category: " + anOrder.itemsOrdered.get(i).getCategory() + "\n"
                                        + "Length: " + ((Disc) anOrder.itemsOrdered.get(i)).getLength() + "\n"
                                        + "Cost: " + anOrder.itemsOrdered.get(i).getCost() + "$\n"
                                        + "ID: " + anOrder.itemsOrdered.get(i).getId_to_store()));
                            }
                            if (anOrder.itemsOrdered.get(i) instanceof DigitalVideoDisc) {
                                mediaInfo.set(i, new TextArea("Director: " + ((Disc) anOrder.itemsOrdered.get(i)).getDirector() + "\n"
                                        + "Category: " + anOrder.itemsOrdered.get(i).getCategory() + "\n"
                                        + "Length: " + ((Disc) anOrder.itemsOrdered.get(i)).getLength() + "\n"
                                        + "Cost: " + anOrder.itemsOrdered.get(i).getCost() + "$\n"
                                        + "ID: " + anOrder.itemsOrdered.get(i).getId_to_store()));
                            }
                            if (anOrder.itemsOrdered.get(i) instanceof Book) {
                                mediaInfo.set(i, new TextArea("Authors: " + ((Book) anOrder.itemsOrdered.get(i)).getAuthors() + "\n"
                                        + "Category: " + anOrder.itemsOrdered.get(i).getCategory() + "\n"
                                        + "Cost: " + anOrder.itemsOrdered.get(i).getCost() + "$\n"
                                        + "ID: " + anOrder.itemsOrdered.get(i).getId_to_store()));
                            }
                            mediaInfo.get(i).setStyle("-fx-font-size: 15 System; -fx-text-fill: #f62459");
                            mediaInfo.get(i).setLayoutX(100);
                            mediaInfo.get(i).setEditable(false);
                            mediaInfoPane.get(i).getChildren().add(mediaInfo.get(i));
                            listMediaItem.get(i).getItems().addAll(mediaTitle.get(i), mediaInfoPane.get(i));
                        }
                        Button payButton = new Button("Pay");
                        payButton.setStyle("-fx-font-size: 20 System; -fx-text-fill: #020122; -fx-font-weight: Bold; -fx-background-color: #fc9e4f");
                        payButton.setAlignment(Pos.CENTER);
                        payButton.setPrefWidth(760);
                        listItemBox.getChildren().add(payButton);

                        if (pay == 0) {
                            {
                                payButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
                                    @Override
                                    public void handle(MouseEvent mouseEvent) {

                                        String order="";
                                        VBox vb= new VBox();

                                        if (anOrder.itemsOrdered.size() >= 1) {
                                            Label orderTitle = new Label("Order Receipt");
                                            orderTitle.setStyle("-fx-font: 50 System; -fx-text-fill: #f4442e; -fx-font-weight: Bold;");
                                            orderTitle.setAlignment(Pos.CENTER);
                                            orderTitle.setLayoutX(150);
                                            orderTitle.setLayoutY(70);
                                            vb.getChildren().add(orderTitle);

                                            for (int i = 0; i < anOrder.itemsOrdered.size(); i++) {
                                                order=(i+1)+". "+myOrder.addMedia(anOrder.itemsOrdered.get(i));
                                                Label orderLabel = new Label(order);
                                                orderLabel.setStyle("-fx-font: 15 System; -fx-text-fill: #020122");
                                                orderLabel.setAlignment(Pos.BOTTOM_CENTER);
                                                orderLabel.setLayoutX(150);
                                                orderLabel.setLayoutY(70);
                                                vb.getChildren().add(orderLabel);
                                            }
                                            Stage payStage = new Stage();
//                                            AnchorPane payPane = new AnchorPane();
                                            BorderPane payPane= new BorderPane();
//                                            payPane.setStyle("-fx-background-color: #edd382");
                                            if (anOrder.itemsOrdered.size() < 3) {
                                                Label payLabel = new Label("Total cost is: " + (anOrder.totalCost()) + "$");
                                                payLabel.setStyle("-fx-font: 20 System; -fx-font-weight: Bold; -fx-text-fill: #020122");
                                                payLabel.setAlignment(Pos.BOTTOM_CENTER);
                                                payLabel.setLayoutX(200);
                                                payLabel.setLayoutY(90);
//                                                payPane.getChildren().add(payLabel);
                                                vb.getChildren().add(payLabel);
                                                payPane.setTop(vb);
                                            } else {
                                                Label luckyLabel = new Label("You get a lucky item: " + anOrder.itemsOrdered.get(anOrder.i).getTitle());
                                                Label payLabel = new Label("Total cost is: " + (anOrder.totalCost() - anOrder.itemsOrdered.get(anOrder.i).getCost()) + "$");
                                                payLabel.setStyle("-fx-font: 15 System; -fx-text-fill: #f62459");
                                                payLabel.setAlignment(Pos.BOTTOM_CENTER);
                                                payLabel.setLayoutX(100);
                                                payLabel.setLayoutY(50);
                                                payPane.getChildren().add(payLabel);
                                                luckyLabel.setStyle("-fx-font: 20 System; -fx-text-fill: #00b16a");
                                                luckyLabel.setAlignment(Pos.CENTER);
                                                luckyLabel.setLayoutX(100);
                                                luckyLabel.setLayoutY(75);
                                                payPane.setTop(luckyLabel);
                                            }
                                            Button printbtn= new Button("print receipt");
                                            printbtn.setMaxHeight(30);
                                            printbtn.setMaxWidth(100);
                                            payPane.setCenter(printbtn);

                                            Image image = new Image("D:\\code\\Java\\demo2\\images\\order.png");
                                            ImageView imageView = new ImageView(image);
                                            //Setting the position of the image
                                            imageView.setX(50);
                                            imageView.setY(25);
                                            //setting the fit height and width of the image view
                                            imageView.setFitHeight(455);
                                            imageView.setFitWidth(1000);

                                            StackPane spane2= new StackPane();
                                            spane2.getChildren().addAll(imageView,payPane);
                                            Scene payScene = new Scene(spane2, 600, 400);
                                            payStage.setScene(payScene);
                                            payStage.show();
                                            pay = 1;
                                            anOrder.itemsOrdered.clear();
                                        }
                                    }
                                });
                            }
                        } else {
                            lockStage.show();
                        }
                    }
                });
            }
        });
        ///////////////////////// Delete item by id
        deleteLabel.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                contentPane.getChildren().clear();
                AnchorPane deleteSearch = new AnchorPane();
                deleteSearch.setPrefWidth(600);
                deleteSearch.setPrefHeight(400);
                deleteSearch.setLayoutX(0);
                deleteSearch.setLayoutY(0);

                Label searchDeleteLabel = new Label("Search");
                searchDeleteLabel.setStyle("-fx-font-size: 15 System; -fx-text-fill: #f7ca18; -fx-background-color: #9a12b3");
                searchDeleteLabel.setPrefWidth(68);
                searchDeleteLabel.setPrefHeight(31);
                searchDeleteLabel.setLayoutX(0);
                searchDeleteLabel.setLayoutY(10);
                searchDeleteLabel.setAlignment(Pos.CENTER);

                TextField searchDeleteText = new TextField();
                searchDeleteText.setPrefWidth(247);
                searchDeleteText.setPrefHeight(31);
                searchDeleteText.setLayoutX(68);
                searchDeleteText.setLayoutY(10);
                searchDeleteText.setStyle("-fx-font: 15 System");

                Button searchDeleteButton = new Button("Enter");
                searchDeleteButton.setStyle("-fx-font-size: 15 System; -fx-text-fill: #eb9532; -fx-background-color: #1f3a93");
                searchDeleteButton.setPrefWidth(55);
                searchDeleteButton.setPrefHeight(31);
                searchDeleteButton.setLayoutX(314);
                searchDeleteButton.setLayoutY(10);

                Pane deleteNotationPane = new Pane();
                deleteNotationPane.setLayoutX(50);
                deleteNotationPane.setLayoutY(100);
                deleteSearch.getChildren().addAll(searchDeleteText, searchDeleteLabel, searchDeleteButton, deleteNotationPane);

                ///////////////////// delete media by button
                searchDeleteButton.setOnMouseClicked(new EventHandler<MouseEvent>() {
                    @Override
                    public void handle(MouseEvent mouseEvent) {
                        String stringDeleteSearch = searchDeleteText.getText();
                        int k = 0;
                        for (int i = 0; i < myOrder.itemsOrdered.size(); i ++) {
                            if (myOrder.itemsOrdered.get(i).getId_to_store() == Integer.parseInt(stringDeleteSearch)){
                                Label deleteNotation = new Label("The item " + myOrder.itemsOrdered.get(i).getTitle() + " is deleted !");
                                deleteNotation.setStyle("-fx-font-size: 15 System; -fx-text-fill: #f03434; -fx-font-weight: Bold");
                                deleteNotationPane.getChildren().clear();
                                deleteNotationPane.getChildren().add(deleteNotation);
                                k = 1;
                                myOrder.itemsOrdered.remove(i);
                                break;
                            }
                        }
                        if (k == 0) {
                            Label deleteNotation = new Label("There no item has id: " + searchDeleteText.getText());
                            deleteNotation.setStyle("-fx-font-size: 15 System; -fx-text-fill: #f03434; -fx-font-weight: Bold");
                            deleteNotationPane.getChildren().clear();
                            deleteNotationPane.getChildren().add(deleteNotation);
                        }
                    }
                });
                ///////////////////// delete media by Enter
                searchDeleteText.setOnKeyPressed(new EventHandler<KeyEvent>() {
                    @Override
                    public void handle(KeyEvent keyEvent) {
                        if (keyEvent.getCode() == KeyCode.ENTER) {
                            String stringDeleteSearch = searchDeleteText.getText();
                            int k = 0;
                            for (int i = 0; i < myOrder.itemsOrdered.size(); i ++) {
                                if (myOrder.itemsOrdered.get(i).getId_to_store() == Integer.parseInt(stringDeleteSearch)){
                                    Label deleteNotation = new Label("The item " + myOrder.itemsOrdered.get(i).getTitle() + " is deleted !");
                                    deleteNotation.setStyle("-fx-font-size: 15 System; -fx-text-fill: #f03434; -fx-font-weight: Bold");
                                    deleteNotationPane.getChildren().clear();
                                    deleteNotationPane.getChildren().add(deleteNotation);
                                    k = 1;
                                    myOrder.itemsOrdered.remove(i);
                                    break;
                                }
                            }
                            if (k == 0) {
                                Label deleteNotation = new Label("There no item has id: " + searchDeleteText.getText());
                                deleteNotation.setStyle("-fx-font-size: 15 System; -fx-text-fill: #f03434; -fx-font-weight: Bold");
                                deleteNotationPane.getChildren().clear();
                                deleteNotationPane.getChildren().add(deleteNotation);
                            }
                        }
                    }
                });
                contentPane.getChildren().add(deleteSearch);
            }
        });
        //////////////////////// Display list item of order
        displayLabel.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                contentPane.getChildren().clear();
                Label titleDisplay = new Label("The items list of your order");
                titleDisplay.setStyle("-fx-font: 30 System; -fx-font-weight: Bold; -fx-text-fill: #020122");
                titleDisplay.setLayoutX(180);

                ScrollPane listItemPane = new ScrollPane();
                listItemPane.setPrefSize(750, 400);
                listItemPane.setLayoutY(40);
                listItemPane.setStyle("-fx-background-color: #7f8c8d");
                VBox listItemBox = new VBox();
                listItemBox.setPrefWidth(760);
                listItemBox.setStyle("-fx-background-color: #7f8c8d");
                listItemPane.setContent(listItemBox);
                contentPane.getChildren().addAll(titleDisplay, listItemPane);

                ArrayList<SplitPane> listMediaItem = new ArrayList<>();
                ArrayList<Label> mediaTitle = new ArrayList<>();
                ArrayList<Pane> mediaInfoPane = new ArrayList<>();
                ArrayList<TextArea> mediaInfo = new ArrayList<>();

                for (int i = 0; i < myOrder.itemsOrdered.size(); i++) {
                    listMediaItem.add(null);
                    listMediaItem.set(i, new SplitPane());
                    listMediaItem.get(i).setOrientation(Orientation.VERTICAL);
                    listMediaItem.get(i).setPrefSize(760, 180);
                    listItemBox.getChildren().add(listMediaItem.get(i));

                    mediaTitle.add(null);
                    mediaTitle.set(i, new Label(myOrder.itemsOrdered.get(i).getTitle()));
                    mediaTitle.get(i).setStyle("-fx-font-size: 20 System; -fx-font-weight: Bold; -fx-text-fill: #020122; -fx-background-color: #e8e8e8");
                    mediaTitle.get(i).setAlignment(Pos.CENTER);
                    mediaTitle.get(i).setPrefSize(758, 31);

                    mediaInfoPane.add(null);
                    mediaInfoPane.set(i, new Pane());
                    mediaInfoPane.get(i).setStyle("-fx-background-color: #c5eff7");

                    mediaInfo.add(null);
                    if (myOrder.itemsOrdered.get(i) instanceof CompactDisc) {
                        mediaInfo.set(i, new TextArea("Director: " + ((CompactDisc) myOrder.itemsOrdered.get(i)).getDirector() + "\n"
                                + "Artist: " + ((CompactDisc) myOrder.itemsOrdered.get(i)).getArtist() + "\n"
                                + "Category: " + myOrder.itemsOrdered.get(i).getCategory() + "\n"
                                + "Length: " + ((Disc) myOrder.itemsOrdered.get(i)).getLength() + "\n"
                                + "Cost: " + myOrder.itemsOrdered.get(i).getCost() + "$\n"
                                + "ID: " + myOrder.itemsOrdered.get(i).getId_to_store()));
                        int finalI = i;
                        mediaTitle.get(i).setOnMouseClicked(new EventHandler<MouseEvent>() {
                            @Override
                            public void handle(MouseEvent mouseEvent) {
                                ((CompactDisc) myOrder.itemsOrdered.get(finalI)).play();
                            }
                        });
                    }
                    if (myOrder.itemsOrdered.get(i) instanceof DigitalVideoDisc) {
                        mediaInfo.set(i, new TextArea("Director: " + ((Disc) myOrder.itemsOrdered.get(i)).getDirector() + "\n"
                                + "Category: " + myOrder.itemsOrdered.get(i).getCategory() + "\n"
                                + "Length: " + ((Disc) myOrder.itemsOrdered.get(i)).getLength() + "\n"
                                + "Cost: " + myOrder.itemsOrdered.get(i).getCost() + "$\n"
                                + "ID: " + myOrder.itemsOrdered.get(i).getId_to_store()));
                        int finalI = i;
                        mediaTitle.get(i).setOnMouseClicked(new EventHandler<MouseEvent>() {
                            @Override
                            public void handle(MouseEvent mouseEvent) {
                                ((DigitalVideoDisc) myOrder.itemsOrdered.get(finalI)).play();
                            }
                        });
                    }
                    if (myOrder.itemsOrdered.get(i) instanceof Book) {
                        mediaInfo.set(i, new TextArea("Authors: " + ((Book) myOrder.itemsOrdered.get(i)).getAuthors() + "\n"
                                + "Category: " + myOrder.itemsOrdered.get(i).getCategory() + "\n"
                                + "Cost: " + myOrder.itemsOrdered.get(i).getCost() + "$\n"
                                + "ID: " + myOrder.itemsOrdered.get(i).getId_to_store()));
                    }
                    mediaInfo.get(i).setStyle("-fx-font-size: 15 System; -fx-text-fill: #f62459");
                    mediaInfo.get(i).setLayoutX(100);
                    mediaInfoPane.get(i).getChildren().add(mediaInfo.get(i));
                    listMediaItem.get(i).getItems().addAll(mediaTitle.get(i), mediaInfoPane.get(i));
                }
            }
        });
// Exit scene
        BorderPane exitbp= new BorderPane();
        VBox exitvb = new VBox();
        Label titleLabel3 = new Label("Order Management Application");
        titleLabel3.setStyle("-fx-font-size: 34 System; -fx-font-weight: Bold; -fx-text-fill: #DF2935; -fx-background-color: #FDCA40");
        titleLabel3.setAlignment(Pos.CENTER);
        titleLabel3.setPrefWidth(1000);
        titleLabel3.setPrefHeight(60);

        Label tqLabel = new Label("Thank You for Shopping With Us");
        tqLabel.setStyle("-fx-font-size: 28 System; -fx-font-family:serif; -fx-font-weight: Bold; -fx-text-fill: #DF2935; ");
        tqLabel.setAlignment(Pos.CENTER);
        tqLabel.setPrefWidth(1000);
        tqLabel.setPrefHeight(60);

        //background img
        Image payImage = new Image("D:\\code\\Java\\demo2\\images\\pay.jpg");
        ImageView payImageView = new ImageView(payImage);
        //Setting the position of the image
        payImageView.setX(50);
        payImageView.setY(25);
        //setting the fit height and width of the image view
        payImageView.setFitHeight(455);
        payImageView.setFitWidth(1000);

        //review text box
        Label reviewTtl= new Label("--Feel free to leave your review for improvement--\nBy clicking on 'submit' you will leave this page.");
        reviewTtl.setStyle("-fx-font-size: 28 System; -fx-font-weight: Bold; -fx-font-family:Lucida Calligraphy; -fx-text-fill: #3772FF;");
        TextField review= new TextField();
        review.setMaxWidth(350);
        review.setMinHeight(100);
        Label reviewLbl= new Label();
        reviewLbl.setStyle("-fx-font-size: 20 System; -fx-font-family:serif; -fx-font-weight: Bold; -fx-text-fill: #3772FF;");
        //buttons
        Button reviewSub= new Button("Submit/Exit");
        reviewSub.setOnMouseClicked(e -> primaryStage.close());
//        Button backlogin=new Button("Back to login page");
//        backlogin.setOnMouseClicked(e -> {
//            primaryStage.setScene(logInScene);
//            getOrder();
//        });
//        backlogin.setMaxWidth(100);
        VBox reviewvb= new VBox(10,reviewTtl,review,reviewLbl,reviewSub);
        reviewvb.setAlignment(Pos.CENTER);
        reviewLbl.textProperty().bind(review.textProperty());

        StackPane exitspane= new StackPane();
        exitspane.getChildren().addAll(payImageView,reviewvb);

        exitvb.getChildren().addAll(titleLabel3,tqLabel);
        exitbp.setTop(exitvb);
        exitbp.setCenter(exitspane);
        Scene exitScene = new Scene(exitbp, 1000, 500);

        exitLabel.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                primaryStage.setScene(exitScene);
//                primaryStage.close();
            }
        });

        primaryStage.show();
        primaryStage.setResizable(false);
    }

    public void dvdAddBtn(){
        DigitalVideoDisc dvd = new DigitalVideoDisc();
        dvd.setCost(Float.parseFloat(cost.getText()));
        dvd.setDirector(director.getText());
        dvd.setCategory(category.getText());
        dvd.setTitle(title.getText());
        dvd.setLength(Integer.parseInt(length.getText()));
        dvdTable.getItems().add(dvd);
        cost.clear(); director.clear(); category.clear(); title.clear(); length.clear();
        dvdChoose.add(1);   //update ArrayList
        action="added one DVD";
    }
    public void bookAddBtn(){
        Book bk= new Book();
        bk.setTitle(btitle.getText());
        bk.setCost(Float.parseFloat(bcost.getText()));
        bk.setCategory(bcategory.getText());
        bk.setAuthors(bauthors.getText());
        bookTable.getItems().add(bk);
        btitle.clear(); bcategory.clear(); bcost.clear(); bauthors.clear();
        bookChoose.add(1);    //update ArrayList
        action="added one book";
    }
    public void cdAddBtn(){
        CompactDisc cd=new CompactDisc();
        cd.setCost(Float.parseFloat(cdcost.getText()));
        cd.setCategory(cdcategory.getText());
        cd.setTitle(cdtitle.getText());
        cd.setLength(Integer.parseInt(cdlength.getText()));
        cd.setDirector(cddirector.getText());
        cd.setArtist(cdartist.getText());
        cdTable.getItems().add(cd);
        cddirector.clear(); cdlength.clear(); cdtitle.clear(); cdcategory.clear(); cdcost.clear(); cdartist.clear();
        cdChoose.add(1);    //update ArrayList
        action="added one CD";
    }
    public void dvdDelBtn(){
        ObservableList<DigitalVideoDisc> dvdSelect,alldvd;
        alldvd= dvdTable.getItems();
        dvdSelect = dvdTable.getSelectionModel().getSelectedItems();
        dvdSelect.forEach(alldvd::remove);
        action="deleted one DVD";
    }
    public void bookDelBtn(){
        ObservableList<Book> bookSel,allbk;
        allbk=bookTable.getItems();
        bookSel=bookTable.getSelectionModel().getSelectedItems();
        bookSel.forEach(allbk::remove);
        action="deleted one book";
    }
    public void cdDelBtn(){
        ObservableList<CompactDisc> cdSel,allcd;
        allcd=cdTable.getItems();
        cdSel=cdTable.getSelectionModel().getSelectedItems();
        cdSel.forEach(allcd::remove);
        action="deleted one CD";
    }
    private static void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.show();
    }

    public ObservableList<Order> getOrder(){
        ObservableList<Order> order= FXCollections.observableArrayList();

//        ArrayList<TextArea> mediaInfo = new ArrayList<>();
        String mediaInfo="";
        if (myOrder.itemsOrdered.size() > 0) {
            for (int i = 0; i < myOrder.itemsOrdered.size(); i++) {
                if (myOrder.itemsOrdered.get(i) instanceof CompactDisc) {
                    mediaInfo="Director: " + ((CompactDisc) myOrder.itemsOrdered.get(i)).getDirector() + "\n"
                            + "Artist: " + ((CompactDisc) myOrder.itemsOrdered.get(i)).getArtist() + "\n"
                            + "Category: " + myOrder.itemsOrdered.get(i).getCategory() + "\n"
                            + "Length: " + ((Disc) myOrder.itemsOrdered.get(i)).getLength() + "\n"
                            + "Cost: " + myOrder.itemsOrdered.get(i).getCost() + "$\n"
                            + "ID: " + myOrder.itemsOrdered.get(i).getId_to_store();
//                int finalI = i;
                }
                if (myOrder.itemsOrdered.get(i) instanceof DigitalVideoDisc) {
                    mediaInfo="Director: " + ((Disc) myOrder.itemsOrdered.get(i)).getDirector() + "\n"
                            + "Category: " + myOrder.itemsOrdered.get(i).getCategory() + "\n"
                            + "Length: " + ((Disc) myOrder.itemsOrdered.get(i)).getLength() + "\n"
                            + "Cost: " + myOrder.itemsOrdered.get(i).getCost() + "$\n"
                            + "ID: " + myOrder.itemsOrdered.get(i).getId_to_store();
                    int finalI = i;
                }
                if (myOrder.itemsOrdered.get(i) instanceof Book) {
                    mediaInfo="Authors: " + ((Book) myOrder.itemsOrdered.get(i)).getAuthors() + "\n"
                            + "Category: " + myOrder.itemsOrdered.get(i).getCategory() + "\n"
                            + "Cost: " + myOrder.itemsOrdered.get(i).getCost() + "$\n"
                            + "ID: " + myOrder.itemsOrdered.get(i).getId_to_store();
                }
                order.add(new Order(i,mediaInfo));
            }
        }
        else{order.add(new Order(0,mediaInfo));}

        return order;
    }


}

