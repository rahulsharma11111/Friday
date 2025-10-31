function App()
 {
function f(event)
    {
         alert("Alright you click on :"+event.target.name);
    }
return(
       <div style={{backgroundColor:"black",height:"100vh",textAlign:"center",paddingTop:"50px"}}>
        <h1 style={{color:"white"}}>Hello World</h1>
       <button name="red" onClick={f}>RED</button>
        <button name="blue" onClick={f}>Blue</button>
	<button name="green" onClick={f}>Green</button>
</div>

);
}

export default App;
