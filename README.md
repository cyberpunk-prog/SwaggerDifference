# SwaggerDifference

## Steps to execute the differences:

1. In the file directory add the old/new swaggers location.
       
       SwaggerDiff diff = SwaggerDiff.compareV2("src/main/resources/NewSwaggers/OldSwagger.json", "src/main/resources/NewSwaggers/NewSwagger.json");


2. Execute the Difference class or main.

    
    public class Difference {
    public static void main(String []args){


3. This will generate a file in the ``testNewApi.html``. Where you can find below items:

    (a) What's New
    
    (b) What's Deprecated
    
    (c) What's Changed


4. For more info on the project , visit: https://github.com/Sayi/swagger-diff
