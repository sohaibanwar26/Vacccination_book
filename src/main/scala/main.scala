// import scalafx.application.JFXApp
// import scalafx.application.JFXApp.PrimaryStage
// import scalafx.scene.Scene
// import scalafx.scene.text.{Text, Font}
// import scalafx.scene.effect.DropShadow
// import scalafx.scene.paint.Color
// import scalafx.scene.shape.{Path, MoveTo, LineTo}
// import scalafx.animation.FadeTransition
// import scalafx.util.Duration
// import scalafx.Includes._
// import scalafx.scene.image.{Image, ImageView}
// object MyScalaApp extends JFXApp{
//     stage= new PrimaryStage(){
//       title= "My Scala"
//       alwaysOnTop= true
//       scene = new Scene(width = 400, height = 400){
//           val f = new Font("serif", 28)
//           val mycolor = Color.rgb(200,100,50)
//           val ds = new DropShadow(5.0, -3.0, -3.0, mycolor ) 
//           val myText = new Text(10, 100, "first scala program"){
//                   font = f
//                   effect = ds 
//                   fill = Color.Blue   
//                 }
//             val img = new Image(getClass().getResourceAsStream("elonmusk.jpg"))

//           content = Array(
//               new Path(){
//                   elements = Array(
//                       MoveTo.apply(100,30),
//                       LineTo.apply(100, 150),
//                       LineTo.apply(200, 150),
//                       LineTo.apply(100,30)

//                   )
//                   fill = Color.Red
//               },

//               new ImageView(img){
//                   fitWidth = 500
//                   fitHeight = 500
//                   x = -100
//                   y = -50
//               },
//               myText,
//               new Text(10, 200, "Hi there"){
//                   font = f
//                   effect = ds
//                   fill = Color.Green
//               },
                           
//           )
//             val ft = new FadeTransition(Duration(2000), content(0)){
//                fromValue = 1.0
//                toValue = 0
//                cycleCount = FadeTransition.Indefinite
//                autoReverse = true
//            }
          
           
//            ft.play()  


//     }
//   }
// }