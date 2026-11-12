package com.miot.rn.plugin.reactpackage.react_native_orientation;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import androidx.health.connect.client.records.metadata.DeviceTypes;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.xiaomi.fitness.component.StandardComponentEvent;
import defpackage.cm8;
import java.util.HashMap;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
public class OrientationModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    final BroadcastReceiver receiver;

    public class a extends BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ReactApplicationContext f10225a;

        public a(ReactApplicationContext reactApplicationContext) {
            this.f10225a = reactApplicationContext;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            Configuration configuration = (Configuration) intent.getParcelableExtra(StandardComponentEvent.KEY_NEW_CONFIG);
            String.valueOf(configuration.orientation);
            String str = configuration.orientation == 1 ? "PORTRAIT" : "LANDSCAPE";
            WritableMap writableMapCreateMap = Arguments.createMap();
            writableMapCreateMap.putString("orientation", str);
            if (this.f10225a.hasActiveCatalystInstance()) {
                ((DeviceEventManagerModule.RCTDeviceEventEmitter) this.f10225a.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit("orientationDidChange", writableMapCreateMap);
            }
        }
    }

    public OrientationModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.receiver = new a(reactApplicationContext);
        reactApplicationContext.addLifecycleEventListener(this);
    }

    private String getOrientationString(int i) {
        if (i == 2) {
            return "LANDSCAPE";
        }
        if (i == 1) {
            return "PORTRAIT";
        }
        return i == 0 ? DeviceTypes.UNKNOWN : AbstractJsonLexerKt.NULL;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap map = new HashMap();
        String orientationString = getOrientationString(getReactApplicationContext().getResources().getConfiguration().orientation);
        if (orientationString == AbstractJsonLexerKt.NULL) {
            map.put("initialOrientation", null);
        } else {
            map.put("initialOrientation", orientationString);
        }
        return map;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return "Orientation";
    }

    @ReactMethod
    public void getOrientation(Callback callback) {
        int i = getReactApplicationContext().getResources().getConfiguration().orientation;
        String orientationString = getOrientationString(i);
        if (orientationString == AbstractJsonLexerKt.NULL) {
            callback.invoke(Integer.valueOf(i), null);
        } else {
            callback.invoke(null, orientationString);
        }
    }

    @ReactMethod
    public void lockToLandscape() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.setRequestedOrientation(6);
    }

    @ReactMethod
    public void lockToLandscapeLeft() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.setRequestedOrientation(0);
    }

    @ReactMethod
    public void lockToLandscapeRight() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.setRequestedOrientation(8);
    }

    @ReactMethod
    public void lockToPortrait() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.setRequestedOrientation(1);
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        try {
            currentActivity.unregisterReceiver(this.receiver);
        } catch (IllegalArgumentException e) {
            cm8.j("ReactNative", "receiver already unregistered", e);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            cm8.i("ReactNative", "no activity to register receiver");
        } else if (Build.VERSION.SDK_INT >= 33) {
            currentActivity.registerReceiver(this.receiver, new IntentFilter("onConfigurationChanged"), 4);
        } else {
            currentActivity.registerReceiver(this.receiver, new IntentFilter("onConfigurationChanged"));
        }
    }

    @ReactMethod
    public void unlockAllOrientations() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.setRequestedOrientation(4);
    }
}
