//PUT YOUR PACKAGE HERE, IT'S THE SAME AS IN MainApplication.java
package com.testing2;
import android.util.Log;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import android.app.Activity;
import android.content.Intent;
// import com.trustwallet.walletcore.*;
    
// when i am importing the trustwallet library it throwing error

public class LoadingOverlay extends ReactContextBaseJavaModule {

    public LoadingOverlay(ReactApplicationContext reactContext) {
        super(reactContext);
    }


    @Override
    public String getName() {
        return "LoadingOverlay";
    }




    // @Override
    // public void onCreate() {
    //     super.onCreate();
    //     WalletCore.init(null); // or pass null if you don't have a context

    //     // Create an instance of the WalletCore class
    //     WalletCore walletCore = WalletCore.getInstance();

    //     // Generate a BIP39 mnemonic
    //     String mnemonic = walletCore.generateMnemonic();

    //     // Display the mnemonic in a TextView
    //     Log.d("menmonic", mnemonic);

    // }






    @ReactMethod
    public void toggle() {
        Log.d("LoadingOverlay", "Create event called with name");
        Log.d("myTag", "This is my message");

    }
}