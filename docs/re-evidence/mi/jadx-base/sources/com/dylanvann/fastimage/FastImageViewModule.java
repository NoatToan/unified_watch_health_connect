package com.dylanvann.fastimage;

import android.app.Activity;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import defpackage.ea9;
import defpackage.fa9;

/* JADX INFO: loaded from: classes4.dex */
class FastImageViewModule extends ReactContextBaseJavaModule {
    private static final String REACT_CLASS = "FastImageView";

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ReadableArray f7062a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Activity f7063b;

        public a(ReadableArray readableArray, Activity activity) {
            this.f7062a = readableArray;
            this.f7063b = activity;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < this.f7062a.size(); i++) {
                ReadableMap map = this.f7062a.getMap(i);
                ea9 ea9VarC = fa9.c(this.f7063b, map);
                com.bumptech.glide.a.u(this.f7063b.getApplicationContext()).q(ea9VarC.j() ? ea9VarC.d() : ea9VarC.f() ? ea9VarC.e() : ea9VarC.g()).a(fa9.d(this.f7063b, ea9VarC, map)).D0();
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Activity f7064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Promise f7065b;

        public b(Activity activity, Promise promise) {
            this.f7064a = activity;
            this.f7065b = promise;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.bumptech.glide.a.d(this.f7064a.getApplicationContext()).c();
            this.f7065b.resolve(null);
        }
    }

    public FastImageViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @ReactMethod
    public void clearDiskCache(Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.resolve(null);
        } else {
            com.bumptech.glide.a.d(currentActivity.getApplicationContext()).b();
            promise.resolve(null);
        }
    }

    @ReactMethod
    public void clearMemoryCache(Promise promise) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            promise.resolve(null);
        } else {
            currentActivity.runOnUiThread(new b(currentActivity, promise));
        }
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactMethod
    public void preload(ReadableArray readableArray) {
        Activity currentActivity = getCurrentActivity();
        if (currentActivity == null) {
            return;
        }
        currentActivity.runOnUiThread(new a(readableArray, currentActivity));
    }
}
