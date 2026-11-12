package com.facebook.react.modules.sound;

import android.media.AudioManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import defpackage.ndj;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = SoundManagerModule.NAME)
public class SoundManagerModule extends ReactContextBaseJavaModule {
    public static final String NAME = "SoundManager";

    public SoundManagerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void playTouchSound() {
        AudioManager audioManager = (AudioManager) getReactApplicationContext().getSystemService("audio");
        if (audioManager != null) {
            audioManager.playSoundEffect(0);
        }
    }
}
