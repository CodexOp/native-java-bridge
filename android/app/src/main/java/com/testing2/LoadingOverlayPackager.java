package com.testing2;
import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//CHANGE LoadingOverlay WITH THE NAME OF YOUR CHOICE
public class LoadingOverlayPackager implements ReactPackage {




    @Override
    public List<ViewManager> createViewManagers(ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }

    @Override
    public List<NativeModule> createNativeModules(
            ReactApplicationContext reactContext) {
        List<NativeModule> modules = new ArrayList<>();

        modules.add(new LoadingOverlay(reactContext));

        return modules;
    }

}