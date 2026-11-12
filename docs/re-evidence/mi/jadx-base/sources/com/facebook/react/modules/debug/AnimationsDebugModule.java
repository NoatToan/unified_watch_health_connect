package com.facebook.react.modules.debug;

import android.widget.Toast;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.google.android.material.timepicker.TimeModel;
import defpackage.cm8;
import defpackage.ndj;
import defpackage.p06;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = AnimationsDebugModule.NAME)
public class AnimationsDebugModule extends ReactContextBaseJavaModule {
    protected static final String NAME = "AnimationsDebugModule";
    private final p06 mCatalystSettings;
    private a mFrameCallback;

    public AnimationsDebugModule(ReactApplicationContext reactApplicationContext, p06 p06Var) {
        super(reactApplicationContext);
        this.mCatalystSettings = p06Var;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void onCatalystInstanceDestroy() {
        a aVar = this.mFrameCallback;
        if (aVar != null) {
            aVar.p();
            this.mFrameCallback = null;
        }
    }

    @ReactMethod
    public void startRecordingFps() {
        p06 p06Var = this.mCatalystSettings;
        if (p06Var == null || !p06Var.a()) {
            return;
        }
        if (this.mFrameCallback != null) {
            throw new JSApplicationCausedNativeException("Already recording FPS!");
        }
        a aVar = new a(getReactApplicationContext());
        this.mFrameCallback = aVar;
        aVar.o();
    }

    @ReactMethod
    public void stopRecordingFps(double d) {
        a aVar = this.mFrameCallback;
        if (aVar == null) {
            return;
        }
        aVar.p();
        a.b bVarH = this.mFrameCallback.h((long) d);
        if (bVarH == null) {
            Toast.makeText(getReactApplicationContext(), "Unable to get FPS info", 1);
        } else {
            Locale locale = Locale.US;
            String str = String.format(locale, "FPS: %.2f, %d frames (%d expected)", Double.valueOf(bVarH.e), Integer.valueOf(bVarH.f7405a), Integer.valueOf(bVarH.c)) + "\n" + String.format(locale, "JS FPS: %.2f, %d frames (%d expected)", Double.valueOf(bVarH.f), Integer.valueOf(bVarH.f7406b), Integer.valueOf(bVarH.c)) + "\nTotal Time MS: " + String.format(locale, TimeModel.NUMBER_FORMAT, Integer.valueOf(bVarH.g));
            cm8.b("ReactNative", str);
            Toast.makeText(getReactApplicationContext(), str, 1).show();
        }
        this.mFrameCallback = null;
    }
}
