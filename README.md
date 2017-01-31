#How to Clone Objects in Java

Cloning objects is something immensely important in almost all programming languages. Having two of the same object is very helpful for 
graphics, storing information, and shortening code length. However, there are a few intricacies to know in order to do it properly.

**Here is an example class that I will be manipulating to show how cloning works in a basic sense.**

![alt text](https://github.com/Jewgene/Tutorial/blob/master/FruitClass.png)

**I want to declare two fruits in my code, so rather than calling the constructor twice, I will simply call it once and than copy that Fruit 
object into another one.**



![alt text](https://github.com/Jewgene/Tutorial/blob/master/Example1.png)


Nothing fancy is going on here. I'm simply declaring a Fruit object, **apple**, and assigning it a color, a number, and a type. I then declare 
another Fruit object, **otherApple**, using a default constructor, which is blank, and then setting it equal to **apple**. These two objects are
exactly identical. Not only are the equal to each other, they are literally the same object. What that means is that if I were to change 
something about **apple**, **otherApple** would change as well. The converse is also true.

![alt text](https://github.com/Jewgene/Tutorial/blob/master/Example2.png)

If I run the above code, **otherApple** will have a red value of 0, despite me never changing it explicitly. This is because in Java,
and many other languages if I use the "=" operator to set an object equal to another one, what I am really doing is creating a **reference**
of the original object. In other words, this copied object will **always** have the same values as the original. 

While this can be useful, it is usually preferrable to have the two objects be unique so that we can change them independently. Looking back
at the Fruit class, notice the first constructor I created.

![alt text](https://github.com/Jewgene/Tutorial/blob/master/Example5.png)
