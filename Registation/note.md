1. Introduction to CSS
CSS (Cascading Style Sheets) is a style sheet language used to describe the presentation (look and formatting) of a document written in HTML or XML. It controls the layout of multiple web pages all at once.

Example:
html
 
<!DOCTYPE html>
<html>
<head>
    <style>
        body {
            background-color: lightblue;
        }
        h1 {
            color: white;
            text-align: center;
        }
        p {
            font-family: verdana;
            font-size: 20px;
        }
    </style>
</head>
<body>
    <h1>This is a heading</h1>
    <p>This is a paragraph.</p>
</body>
</html>
2. Selectors in CSS
Selectors are used to select the HTML elements you want to style.

Types of Selectors:
1.Universal Selector (*): Selects all elements.
2.Element Selector (h1, p): Selects all <h1> or <p> elements.
3.ID Selector (#id): Selects a specific element with the given ID.
4.Class Selector (.class): Selects all elements with the specified class.
5.Attribute Selector ([type="text"]): Selects elements with a specific attribute.
Example:
html
 
<style>
    * {
        margin: 0;
        padding: 0;
    }
    h1 {
        color: blue;
    }
    #header {
        background-color: grey;
    }
    .highlight {
        background-color: yellow;
    }
</style>
<h1 id="header">Header</h1>
<p class="highlight">This is a highlighted paragraph.</p>

3. Colors in CSS
CSS allows you to specify colors in different formats:

Color Names: red, blue
Hexadecimal: #ff0000
RGB: rgb(255, 0, 0)
RGBA: rgba(255, 0, 0, 0.5)
HSL/HSLA: hsl(120, 100%, 50%)
Example:
css
 
p {
    color: red; /* Color name */
    background-color: #00ff00; /* Hex code */
    border: 1px solid rgb(0, 0, 255); /* RGB */
    opacity: 0.8; /* Opacity */
}



4. Box Model
The CSS box model describes the rectangular boxes that are generated for elements in the document tree and consists of margins, borders, padding, and the actual content.

Example:
css
 
div {
    width: 300px;
    border: 15px solid green;
    padding: 50px;
    margin: 20px;
}
5. Text Styling
CSS provides several properties to style text:

color
text-align
text-decoration
font-family
font-size
font-weight
Example:
css
 
h1 {
    font-size: 40px;
    color: navy;
    text-align: center;
    text-decoration: underline;
}
6. Backgrounds
CSS provides properties to style element backgrounds:

background-color
background-image
background-repeat
background-position
background-size
Example:
css
 
body {
    background-color: #f0f8ff;
    background-image: url('image.jpg');
    background-repeat: no-repeat;
    background-size: cover;
}
7. Positioning
CSS provides properties to control the positioning of elements:

static (default)
relative
absolute
fixed
sticky
Example:
css
 
.relative-box {
    position: relative;
    top: 10px;
    left: 10px;
}
.absolute-box {
    position: absolute;
    top: 50px;
    left: 50px;
}
8. Flexbox
Flexbox is a layout module that makes it easier to design flexible responsive layout structures.

Example:
css
 
.container {
    display: flex;
    justify-content: center;
    align-items: center;
    height: 100vh;
}
9. Grid Layout
CSS Grid Layout provides a two-dimensional grid-based layout system.

Example:
css
 
.grid-container {
    display: grid;
    grid-template-columns: auto auto auto;
    gap: 10px;
}
.grid-item {
    background-color: #d9d9d9;
    border: 1px solid #000;
}
10. Media Queries
Media queries are used to apply styles based on the device's characteristics, like width, height, etc.

Example:
css
 
@media screen and (max-width: 600px) {
    body {
        background-color: lightblue;
    }
}
11. Transitions and Animations
CSS transitions and animations can add visual effects and enhance user experience.

transition
animation
Example (Transition):
css
 
.button {
    width: 100px;
    transition: width 2s;
}
.button:hover {
    width: 200px;
}
Example (Animation):
css
 
@keyframes example {
    from {background-color: red;}
    to {background-color: yellow;}
}
div {
    width: 100px;
    height: 100px;
    background-color: red;
    animation: example 5s infinite;
}
12. Pseudo-Classes and Pseudo-Elements
Pseudo-Classes: :hover, :focus, :active, etc.
Pseudo-Elements: ::before, ::after, ::first-letter
Example:
css
 
a:hover {
    color: red;
}
p::first-letter {
    font-size: 200%;
    color: green;
}
13. CSS Variables
CSS variables allow you to store values and reuse them.

Example:
css
 
:root {
    --main-color: #3498db;
}
body {
    background-color: var(--main-color);
}
14. Responsive Web Design
Responsive web design makes web pages look good on all devices using flexible layouts, images, and media queries.

Example:
css
 
.container {
    width: 100%;
    max-width: 1200px;
    margin: auto;
    padding: 20px;
}
15. Browser Developer Tools
Modern browsers come with built-in developer tools to inspect CSS and HTML code, test changes, and debug.
notes.md
Displaying notes.md.