# MovieMaster

## Result Update

| Design |
|-|
| ![](/media/output.gif) |

- Added the relative transition change of the Movie carousel progress, and the Movie details bottom
  info progress.
- Added the relative transition change of the Movie carousel progress, and the Movie rating
  progress.
- Tuned some Movie carousel transitions values.
- Fixed the movie description transition.

## Features

- Advanced animation examples by only using the `ConstraintLayout` and `MotionLayout` APIs.
- The nested `MotionLayout`s are decorated as `CustomViews`. It is possible to have
  multiple `MotionLayout`s on
  the same screen and manipulate them in your own manner.
- The multiple `Carousel`s relations and progress transitions examples.
- The examples of switching and propagating the progress between the transitions programmatically.
- Great staggered animation example and its REAL usage.

## MotionLayout Advantages:

- Animates the default scenarios easily and with the advanced preview/editor.
- Possibility to decouple `MotionLayout`s into the nested ones (f.e. `CustomView`).
- The `ImageFilterView` is kinda of a cherry on top, across the `MotionLayout` helpers.
- Possibility to run different and nested `MotionLayout`s transitions simultaneously.
- Decouples the animation stuff from the code to the motion scene file.
- Ability to transition the custom views and their attributes.
- Staggered animations and their manipulation.

## Summary

The `MotionLayout` is an amazing solution for simple and advanced screen animations. It works well
for the single
transition to the end and back, but when there are multiple transitions the problems could occur. It
has the handy
scene editor under the hood, so it is useful to test transitions inside the Android Studio. The
other advantage of the
`MotionLayout`s is the ability to decouple them into the `CustomView`s. Also, `MotionLayout`
supports touch events, like
click and swipe, but I would not recommend them right now, because it still buggy, especially inside
the `Carousel`. The
following helpers `Carousel` and `MotionLabel` are not worth it for now, because the API is not
completed yet and
they contain some real issues. On the other hand, the `ImageFilterView` and `MotionEffect` do the
job properly.
In my opinion, `MotionLayout` should be used for some stunning screen animations, where no touch
events included, for
example splash screen, tutorial screen, or dashboard screen.

## Author:

[AKASH PATEL](https://www.linkedin.com/in/akash-patel-53870588/)  
[akash4397@gmail.com](mailto:akash4397@gmail.com)
