
object Q1 extends App{

  val alphabet = "abcdefghijklmnopqrstuvwxyz"
  //alphabet is in lower case therefore all letters
  //in the string should be converted to lower case before calculating new index

  val encrypt = (c:Char, key:Int, a:String)=>a((a.indexOf(c.toLower)+key)%a.size) //Encryption function
  val decrypt = (c:Char, key:Int, a:String)=>a((a.indexOf(c.toLower)-key)%a.size) //Decryption function

  val cipher =(algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))

  val ct = cipher(encrypt,"s",5,alphabet) //should print as x since s,t,u,v,w,[x]
  val pt = cipher(decrypt,ct,5,alphabet) //should again print s since decyphering cyphered letter


  println(ct)
  println(pt)

}
