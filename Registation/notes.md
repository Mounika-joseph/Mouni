**colours in css**
colour names:
<html>
Selectors r used to select the HTML elements u want to style.
Type of Selectors:
1.Universal Selector(*):Selects all elements.
2.Elements Selectors(h1,)
5.Attribute Selector ([type="text"])

Box Model:
The CSS box model describes the rectangular boxes that r generated for elements in the document tree and consists of margins,borders,paddingand the actual content.
Ex:
css
div{
    width:300px;
    border:15px soild green;
    padding:50px;
    margin:20px;
}
text Style:
Back ground:
css provides properties to style element backgrounds:
backgrounds-colour
backgrounds-images
backgrounds-repet

positioning:
css provides properties to control the positioning of elements
ststic(default)
relative
absolute
fixed
sticky

examples:
css relative-box{
    position:relativ;
    top:50px;
    left:50px;
}

flexbox:
flexbox is a layout module that makes it easier to design flexble 









Gird Layout:
css grid layout provides a two-dimensional grid-based layout system.

example:
css
.rid-container{
    display:grid;
    grid-template-coloums:auto auto auto;
    gap:10px;
}
Media Queries:
media queries r used to apply styles based on the devices characteristics,like width,height,etc.

EX:
css 

@media screen and (max-width:600px) {
    body{
        background-colour:lightblue:
    }
}

Transitions and Animations:
css transitions and animations can add visual effects and enhance user experience.

transitions
animations
ex(transition)
.button{
    width:100px;
    transition:width 25;
}
.button:hover{
    width:200px;
}

ex(Animations)
csss
@keyframes ex{
    from {background-colour:red;}
    to{background-color:yellow;}
}
div{
    width:100pcx;
    height:100pxc;
    background-color:red;
    animation:ex 5s infinities;
}

css variables
css variables allow y to  store values and reuse them.

ex:
css 
:root{
    --main-color:#3498db;
}
body{
    background-clour:var(--main-coor);
}

Browser Developer Tools:
Mderan browsers come with built-in developer tools to inspect css andd HTML code,test changes and debug.

Responsive web design:
Responsive wed design makes web pages look good on all devices using flexible layout,images and media quaries.











