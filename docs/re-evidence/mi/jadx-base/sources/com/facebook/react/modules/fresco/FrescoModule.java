package com.facebook.react.modules.fresco;

import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import defpackage.apa;
import defpackage.bej;
import defpackage.cm8;
import defpackage.f7h;
import defpackage.i7h;
import defpackage.k5d;
import defpackage.kk4;
import defpackage.l1a;
import defpackage.ndj;
import defpackage.qyo;
import java.util.HashSet;
import okhttp3.JavaNetCookieJar;
import okhttp3.OkHttpClient;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = FrescoModule.NAME, needsEagerInit = true)
public class FrescoModule extends ReactContextBaseJavaModule implements LifecycleEventListener {
    public static final String NAME = "FrescoModule";
    private static boolean sHasBeenInitialized = false;
    private final boolean mClearOnDestroy;
    private k5d mConfig;

    public FrescoModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, true, null);
    }

    private static k5d getDefaultConfig(ReactContext reactContext) {
        return getDefaultConfigBuilder(reactContext).D();
    }

    public static k5d.b getDefaultConfigBuilder(ReactContext reactContext) {
        HashSet hashSet = new HashSet();
        hashSet.add(new qyo());
        OkHttpClient okHttpClientA = f7h.a();
        ((kk4) okHttpClientA.cookieJar()).b(new JavaNetCookieJar(new l1a(reactContext)));
        return i7h.a(reactContext.getApplicationContext(), okHttpClientA).J(new bej(okHttpClientA)).G(false).K(hashSet);
    }

    public static boolean hasBeenInitialized() {
        return sHasBeenInitialized;
    }

    public void clearSensitiveData() {
        apa.a().a();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        getReactApplicationContext().addLifecycleEventListener(this);
        if (!hasBeenInitialized()) {
            if (this.mConfig == null) {
                this.mConfig = getDefaultConfig(getReactApplicationContext());
            }
            apa.c(getReactApplicationContext().getApplicationContext(), this.mConfig);
            sHasBeenInitialized = true;
        } else if (this.mConfig != null) {
            cm8.C("ReactNative", "Fresco has already been initialized with a different config. The new Fresco configuration will be ignored!");
        }
        this.mConfig = null;
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        if (hasBeenInitialized() && this.mClearOnDestroy) {
            apa.a().c();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z) {
        this(reactApplicationContext, z, null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z, k5d k5dVar) {
        super(reactApplicationContext);
        this.mClearOnDestroy = z;
        this.mConfig = k5dVar;
    }
}
