package io.expo.appearance;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Build;
import androidx.annotation.RequiresApi;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.modules.core.DeviceEventManagerModule;
import com.xiaomi.onetrack.c.i;
import com.xiaomi.onetrack.c.q;
import com.xiaomi.smarthome.framework.plugin.rn.nativemodule.ui.ColorSchemeHelper;
import defpackage.cm8;
import defpackage.e4f;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u001e2\u00020\u00012\u00020\u0002:\u0001\u001eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0002J\u0014\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00140\u0013H\u0016J\"\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000fH\u0002J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000fH\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\b\u0010\u001b\u001a\u00020\u0016H\u0017J\b\u0010\u001c\u001a\u00020\u0016H\u0016J\b\u0010\u001d\u001a\u00020\u0016H\u0016R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lio/expo/appearance/RNCAppearanceModule;", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "Lcom/facebook/react/bridge/LifecycleEventListener;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "<init>", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "mBroadcastReceiver", "Landroid/content/BroadcastReceiver;", "getName", "", "getColorScheme", q.f13857a, "Landroid/content/res/Configuration;", "preferences", "Lcom/facebook/react/bridge/WritableMap;", "getPreferences", "()Lcom/facebook/react/bridge/WritableMap;", "getConstants", "", "", "sendEvent", "", "Lcom/facebook/react/bridge/ReactContext;", i.d, "params", "updateAndSendAppearancePreferences", "onHostResume", "onHostPause", "onHostDestroy", "Companion", "react-native-appearance_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class RNCAppearanceModule extends ReactContextBaseJavaModule implements LifecycleEventListener {

    @NotNull
    public static final String REACT_CLASS = "RNCAppearance";

    @Nullable
    private BroadcastReceiver mBroadcastReceiver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RNCAppearanceModule(@NotNull final ReactApplicationContext reactContext) {
        super(reactContext);
        Intrinsics.checkNotNullParameter(reactContext, "reactContext");
        if (Build.VERSION.SDK_INT > 28) {
            this.mBroadcastReceiver = new BroadcastReceiver() { // from class: io.expo.appearance.RNCAppearanceModule.1
                @Override // android.content.BroadcastReceiver
                public void onReceive(Context context, Intent intent) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    Intrinsics.checkNotNullParameter(intent, "intent");
                    RNCAppearanceModule rNCAppearanceModule = RNCAppearanceModule.this;
                    rNCAppearanceModule.sendEvent(reactContext, "appearanceChanged", rNCAppearanceModule.getPreferences());
                }
            };
            reactContext.addLifecycleEventListener(this);
        }
    }

    private final String getColorScheme(Configuration config) {
        if (Build.VERSION.SDK_INT > 28) {
            int i = config.uiMode & 48;
            if (i == 0 || i == 16) {
                return "light";
            }
            if (i == 32) {
                return ColorSchemeHelper.SCHEME_DARK;
            }
        }
        return "no-preference";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WritableMap getPreferences() {
        WritableMap writableMapCreateMap = Arguments.createMap();
        Configuration configuration = getReactApplicationContext().getResources().getConfiguration();
        Intrinsics.checkNotNullExpressionValue(configuration, "getConfiguration(...)");
        writableMapCreateMap.putString("colorScheme", getColorScheme(configuration));
        Intrinsics.checkNotNull(writableMapCreateMap);
        return writableMapCreateMap;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void sendEvent(ReactContext reactContext, String eventName, WritableMap params) {
        if (reactContext.hasActiveCatalystInstance()) {
            cm8.n("sendEvent", eventName + ": " + params);
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) reactContext.getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(eventName, params);
        }
    }

    private final void updateAndSendAppearancePreferences() {
        sendEvent("appearanceChanged", getPreferences());
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    @NotNull
    public Map<String, Object> getConstants() {
        HashMap mapB = e4f.b();
        Intrinsics.checkNotNullExpressionValue(mapB, "newHashMap(...)");
        mapB.put("initialPreferences", getPreferences());
        return mapB;
    }

    @Override // com.facebook.react.bridge.NativeModule
    @NotNull
    public String getName() {
        return REACT_CLASS;
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
            currentActivity.unregisterReceiver(this.mBroadcastReceiver);
        } catch (IllegalArgumentException e) {
            cm8.j("ReactNative", "mBroadcastReceiver already unregistered", e);
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    @RequiresApi(33)
    public void onHostResume() {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            cm8.i("ReactNative", "no activity to register receiver");
        } else {
            currentActivity.registerReceiver(this.mBroadcastReceiver, new IntentFilter("onConfigurationChanged"), 4);
            updateAndSendAppearancePreferences();
        }
    }

    private final void sendEvent(String eventName, WritableMap params) {
        if (getReactApplicationContext().hasActiveCatalystInstance()) {
            cm8.n("sendEvent", eventName + ": " + params);
            ((DeviceEventManagerModule.RCTDeviceEventEmitter) getReactApplicationContext().getJSModule(DeviceEventManagerModule.RCTDeviceEventEmitter.class)).emit(eventName, params);
        }
    }
}
