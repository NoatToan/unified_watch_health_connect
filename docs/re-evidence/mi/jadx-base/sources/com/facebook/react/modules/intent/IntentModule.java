package com.facebook.react.modules.intent;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.mi.fitness.netproxy.NetProxyComponentKt;
import defpackage.ndj;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = IntentModule.NAME)
public class IntentModule extends ReactContextBaseJavaModule {
    public static final String NAME = "IntentAndroid";

    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7422a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f7422a = iArr;
            try {
                iArr[ReadableType.String.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7422a[ReadableType.Number.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7422a[ReadableType.Boolean.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public IntentModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void canOpenURL(String str, Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(new JSApplicationIllegalArgumentException("Invalid URL: " + str));
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
            intent.addFlags(268435456);
            promise.resolve(Boolean.valueOf(intent.resolveActivity(getReactApplicationContext().getPackageManager()) != null));
        } catch (Exception e) {
            promise.reject(new JSApplicationIllegalArgumentException("Could not check if URL '" + str + "' can be opened: " + e.getMessage()));
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x002c  */
    @ReactMethod
    public void getInitialURL(Promise promise) {
        String string;
        try {
            Activity currentActivity = getCurrentActivity();
            if (currentActivity != null) {
                Intent intent = currentActivity.getIntent();
                String action = intent.getAction();
                Uri data = intent.getData();
                if (data == null || !("android.intent.action.VIEW".equals(action) || "android.nfc.action.NDEF_DISCOVERED".equals(action))) {
                    string = null;
                } else {
                    string = data.toString();
                }
            } else {
                string = null;
            }
            promise.resolve(string);
        } catch (Exception e) {
            promise.reject(new JSApplicationIllegalArgumentException("Could not get the initial URL : " + e.getMessage()));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void openSettings(Promise promise) {
        try {
            Intent intent = new Intent();
            Activity currentActivity = getCurrentActivity();
            String packageName = getReactApplicationContext().getPackageName();
            intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
            intent.addCategory("android.intent.category.DEFAULT");
            intent.setData(Uri.parse("package:" + packageName));
            intent.addFlags(268435456);
            intent.addFlags(1073741824);
            intent.addFlags(NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY);
            currentActivity.startActivity(intent);
            promise.resolve(Boolean.TRUE);
        } catch (Exception e) {
            promise.reject(new JSApplicationIllegalArgumentException("Could not open the Settings: " + e.getMessage()));
        }
    }

    @ReactMethod
    public void openURL(String str, Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(new JSApplicationIllegalArgumentException("Invalid URL: " + str));
            return;
        }
        try {
            Activity currentActivity = getCurrentActivity();
            Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str).normalizeScheme());
            String packageName = getReactApplicationContext().getPackageName();
            ComponentName componentNameResolveActivity = intent.resolveActivity(getReactApplicationContext().getPackageManager());
            String packageName2 = componentNameResolveActivity != null ? componentNameResolveActivity.getPackageName() : "";
            if (currentActivity == null || !packageName.equals(packageName2)) {
                intent.addFlags(268435456);
            }
            if (currentActivity != null) {
                currentActivity.startActivity(intent);
            } else {
                getReactApplicationContext().startActivity(intent);
            }
            promise.resolve(Boolean.TRUE);
        } catch (Exception e) {
            promise.reject(new JSApplicationIllegalArgumentException("Could not open URL '" + str + "': " + e.getMessage()));
        }
    }

    @ReactMethod
    public void sendIntent(String str, ReadableArray readableArray, Promise promise) {
        if (str == null || str.isEmpty()) {
            promise.reject(new JSApplicationIllegalArgumentException("Invalid Action: " + str + "."));
            return;
        }
        Intent intent = new Intent(str);
        if (intent.resolveActivity(getReactApplicationContext().getPackageManager()) == null) {
            promise.reject(new JSApplicationIllegalArgumentException("Could not launch Intent with action " + str + "."));
            return;
        }
        if (readableArray != null) {
            for (int i = 0; i < readableArray.size(); i++) {
                ReadableMap map = readableArray.getMap(i);
                String strNextKey = map.keySetIterator().nextKey();
                int i2 = a.f7422a[map.getType(strNextKey).ordinal()];
                if (i2 == 1) {
                    intent.putExtra(strNextKey, map.getString(strNextKey));
                } else if (i2 == 2) {
                    intent.putExtra(strNextKey, Double.valueOf(map.getDouble(strNextKey)));
                } else {
                    if (i2 != 3) {
                        promise.reject(new JSApplicationIllegalArgumentException("Extra type for " + strNextKey + " not supported."));
                        return;
                    }
                    intent.putExtra(strNextKey, map.getBoolean(strNextKey));
                }
            }
        }
        getReactApplicationContext().startActivity(intent);
    }
}
