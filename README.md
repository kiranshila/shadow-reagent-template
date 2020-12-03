# Shadow-CLJS / Reagent Starter Template

I tried to add comments to everything to explain.

Shadow requires a few node things to work, I recommend using [Yarn](https://classic.yarnpkg.com/en/).

In the project directory, run the following to install all the node deps

``` sh
$ yarn install
```

You can install shadow globally with `yarn global add shadow-cljs`

Then, you can use the following commands

``` sh
# compile a build once and exit
shadow-cljs compile app

# compile and watch
shadow-cljs watch app

# connect to REPL for the build (available while watch is running)
shadow-cljs cljs-repl app
```
