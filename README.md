# FIRST PROJECT

## SPLASH VIEW
 * Splash init with image online [Splash_java](https://github.com/AlmuFerCar/First/blob/master/app/src/main/java/com/afernandezcar/first/Splash.java)


   ![image_splash_internet](img/splash_con_carga_imagen.png)


   If the internet image is not loaded, you see a background color that is predefined
      ![imagen_splash_internet](img/splash_sin_carga_imagen.png)


 * Logo animation (zoom logo) [Logo_zoom](https://github.com/AlmuFerCar/First/blob/master/app/src/main/res/anim/scale.xml)


   ![image_splash_internet](img/logo_splash_normal.png)  ![image_splash_internet](img/logo_splash_zoom.png)

 * Logo splash with name project  [Splash_xml](https://github.com/AlmuFerCar/First/blob/master/app/src/main/res/layout/activity_splash.xml)
   
   
   * change font [Letra_Splash](https://github.com/AlmuFerCar/First/blob/master/app/src/main/res/font/barriecito.xml)


   * background gradient (the background is not visible because when starting the image or java background is loaded)[Gradiente_fondo_Splash](https://github.com/AlmuFerCar/First/blob/master/app/src/main/res/drawable/gradient.xml)

   ![imagen_splash_internet](img/vista_splash_sin_java.png)


## LOGIN VERTICAL VIEW 
 * Background gradient [background_gradient](https://github.com/AlmuFerCar/First/blob/master/app/src/main/res/drawable/gradient.xml)


 * Image face [image_java_background](https://github.com/AlmuFerCar/First/blob/master/app/src/main/java/com/afernandezcar/first/LoginActivity.java)


 * Animation fade in


 * Animation zoom


 * Animation rotate 


   * Animations are done one after another in the same xml file [animation_logo](https://github.com/AlmuFerCar/First/blob/master/app/src/main/res/anim/fadein.xml)


   * All animations are implementates in this java file [implements_animation_java](https://github.com/AlmuFerCar/First/blob/master/app/src/main/java/com/afernandezcar/first/LoginActivity.java)


   * Transparent bottom [transparent_bottom](https://github.com/AlmuFerCar/First/blob/master/app/src/main/res/layout/activity_login.xml)


   * Guide lines [guide_lines](https://github.com/AlmuFerCar/First/blob/master/app/src/main/res/layout/activity_login.xml)


   ![imagen_logo_fadein_fondo](img/login_1.png)  ![imagen_logo_zoom_fondo](img/login_2.png)  ![imagen_logo_rotate_fondo](img/login_3.png)  ![imagen_logo_rotate_fondo](img/login_4.png)

  #### LOGIN HORIZONTAL VIEW


* Design rotate view [rotate view xml](https://github.com/AlmuFerCar/First/blob/master/app/src/main/res/layout-land/activity_login.xml)


   ![login rotate view](img/land_view.png)


## SIGNUP VIEW


This view is similar to login view
* Icon in the edit text and password with eye icon  [sign up view xml](https://github.com/AlmuFerCar/First/blob/master/app/src/main/res/layout/activity_signup.xml)


```
    app:passwordToggleEnabled="true"
    app:startIconDrawable="@drawable/ic_lock"
```

   ![sign uo view](img/sign_up.png)


## MAIN VIEW


* Main View java [main java](https://github.com/AlmuFerCar/First/blob/master/app/src/main/java/com/afernandezcar/first/Main.java)


* Main View xml (WebView) [main xml](https://github.com/AlmuFerCar/First/blob/master/app/src/main/res/layout/activity_main.xml)


   ![main view](img/main_1.png)


*Option select image


   ![select image](img/context_menu.png)


   * if you select copy


   ![select image](img/context_menu_copy.png)


* option zoom image and image with zoom


   ![zoom image](img/imagen_zoom.png) ![zoom image](img/imagen_con_zoom.png)


* App bar menu with back arrow


[change file Manifest](https://github.com/AlmuFerCar/First/blob/master/app/src/main/AndroidManifest.xml)        


```XML
    <activity
      android:name=".Main"
      android:exported="true"
      android:parentActivityName=".LoginActivity">
      <meta-data
      android:name="android.app.lib_name"
      android:value="" />
    </activity>
```


   ![appbar menu](img/appbar.png)


* Refresh Webview


[main java](https://github.com/AlmuFerCar/First/blob/master/app/src/main/java/com/afernandezcar/first/Main.java)


   ![refresh web view icon](img/main_2.png)


* Click search and settings icons


[main java](https://github.com/AlmuFerCar/First/blob/master/app/src/main/java/com/afernandezcar/first/Main.java)


[appbar menu](https://github.com/AlmuFerCar/First/blob/master/app/src/main/res/menu/menu_appbar.xml)


   ![search bottom](img/main_3.png) ![settings bottom](img/main_4.png)


* Click on the settings button and display the menu with an option with an icon


   ![setting_bottom_display](img/main_6.png)


* Message click sign out with logo in the message


   ![message sign out](img/main_7.png)

 

|TITULO1 |TITULO2 |
|:-----:|:----:|
|       |      |
| CONTENIDO COLUMNA 1 | CONTENIDO COLUMNA 2 |



