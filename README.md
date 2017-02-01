# Day 1 - Introduction to Web Development with ASP.NET Core MVC
### _KEA CS 4th Semester 02-02-2017_

## Agenda today
The porpouse of today is to introduce you to ASP.NET Core 1.0 and to introduce you to the enxt 14 week in this elective. 

We will start out by doing a low level introduction to how .NET Core, and ASP.NET Core works. We will look at the basic building blocks which a ASP.NET Core application is made off.
We will install .NET Core on Windows, Mac or Linux, create a first hello world console application, and 
creating a basic asp.net web application. We will also install and start using the VS Code editor.

## Books & Materials in this Semester
* [dot.net](dot.net)
    * _(Everything you will need is here)_
* [MVA Asp.net Core](https://mva.microsoft.com/training-topics/web-development#!index=3&jobf=Developer&lang=1033)
    * _(Specific videos from here will be used)_

## Curicullum
* [MVA: Introduction to ASP.NET Core and Tooling](https://mva.microsoft.com/en-US/training-courses/introduction-to-aspnet-core-10-16841?l=JWZaodE6C_5706218965)
* [Getting Started with ASP.NET Core](https://docs.microsoft.com/en-us/aspnet/core/getting-started)
* [Application Startup in ASP.NET Core](https://docs.microsoft.com/en-us/aspnet/core/fundamentals/startup)
* [Middleware](https://docs.microsoft.com/en-us/aspnet/core/fundamentals/middleware)
* [Working with static files in ASP.NET Core](https://docs.microsoft.com/en-us/aspnet/core/fundamentals/static-files)



## Installation of .net core
Go to [dot.net](http://dot.net) and click on [download](https://www.microsoft.com/net/download), and on 
[.NET Core](https://www.microsoft.com/net/download/core). Choose you OS, and follow the instructions.         
_(If you are on Windows choose "Select your environment" -> "Command Line / Other")_.   

## Getting Started Guied
1. Install [.NET Core](https://www.microsoft.com/net/core#macos)
2. Create a new .NET Core project:

````
mkdir aspnetcoreapp
cd aspnetcoreapp
dotnet new
````
3. Restore the packages:
````
dotnet restore
````
4. Run the app (the dotnet run command will build (compile) the app when it's out of date):
````
dotnet run
````

## Resources    
