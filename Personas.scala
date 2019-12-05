class Personas(val name:String) {
   def m(): Int = { 
     // Do nothing in particular
     return 0
   }

   // Assign the return value of m to m1
   val m1 = m
   // Assing the return value of m to m1 (not a copy)
   var m2 = m
   // Assing the function to m3
   def m3 = m

   // Lazy value definition: wont be called until needed.
   lazy val m4 = m
}
