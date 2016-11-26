# Day 1 - Introduction to Web Development with ASP.NET Core MVC
### _KEA CS 4th Semester 02-02-2017_

## Agenda today
The porpouse of today is to introduce you to ASP.NET Core 1.0 and to introduce you to the enxt 14 week in this elective. 

We will start out by doing a low level introduction to how .NET Core, and ASP.NET Core works. 
This will include installing .NET Core on Windows, Mac or Linux, creating a first hello world console application, and 
creating a basic asp.net web application. We will also install and start using the VS Code editor.

This is done locally and will be deleted i decide on github.

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
4. Run the app (the dotnet run command will build the app when it's out of date):
````
dotnet run
````





## Resources    
* [dot.net](http://dot.net)
* [ASP.NET Core Documentation](https://docs.microsoft.com/en-us/aspnet/core/)
* [Install .NET Core](https://www.microsoft.com/net/download/core)
* [VS Code](https://code.visualstudio.com/)
* [Getting Started with C#](https://www.microsoft.com/net/tutorials/csharp/getting-started)
* [Visual Studio Download](https://www.visualstudio.com/downloads/)
* [Visual Studio for MAC Download](https://www.visualstudio.com/vs/visual-studio-mac/)
* [Yeoman generator-aspnet](https://github.com/OmniSharp/generator-aspnet)
* [Migrating From ASP.NET MVC to ASP.NET Core MVC](https://docs.microsoft.com/en-us/aspnet/core/migration/mvc)
* [ASP.NET Core from the command line](https://cmatskas.com/asp-net-core-from-the-command-line/)
* [How to set the hosting environment in ASP.NET Core](http://andrewlock.net/how-to-set-the-hosting-environment-in-asp-net-core/)
