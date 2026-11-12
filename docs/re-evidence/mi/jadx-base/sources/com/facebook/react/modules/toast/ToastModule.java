package com.facebook.react.modules.toast;

import android.widget.Toast;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.UiThreadUtil;
import defpackage.e4f;
import defpackage.ndj;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
@ndj(name = ToastModule.NAME)
public class ToastModule extends ReactContextBaseJavaModule {
    private static final String DURATION_LONG_KEY = "LONG";
    private static final String DURATION_SHORT_KEY = "SHORT";
    private static final String GRAVITY_BOTTOM_KEY = "BOTTOM";
    private static final String GRAVITY_CENTER = "CENTER";
    private static final String GRAVITY_TOP_KEY = "TOP";
    public static final String NAME = "ToastAndroid";

    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f7467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f7468b;

        public a(String str, int i) {
            this.f7467a = str;
            this.f7468b = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast.makeText(ToastModule.this.getReactApplicationContext(), this.f7467a, this.f7468b).show();
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f7469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f7470b;
        public final /* synthetic */ int c;

        public b(String str, int i, int i2) {
            this.f7469a = str;
            this.f7470b = i;
            this.c = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast toastMakeText = Toast.makeText(ToastModule.this.getReactApplicationContext(), this.f7469a, this.f7470b);
            toastMakeText.setGravity(this.c, 0, 0);
            toastMakeText.show();
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f7471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f7472b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;
        public final /* synthetic */ int e;

        public c(String str, int i, int i2, int i3, int i4) {
            this.f7471a = str;
            this.f7472b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            Toast toastMakeText = Toast.makeText(ToastModule.this.getReactApplicationContext(), this.f7471a, this.f7472b);
            toastMakeText.setGravity(this.c, this.d, this.e);
            toastMakeText.show();
        }
    }

    public ToastModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule
    public Map<String, Object> getConstants() {
        HashMap mapB = e4f.b();
        mapB.put(DURATION_SHORT_KEY, 0);
        mapB.put(DURATION_LONG_KEY, 1);
        mapB.put(GRAVITY_TOP_KEY, 49);
        mapB.put(GRAVITY_BOTTOM_KEY, 81);
        mapB.put(GRAVITY_CENTER, 17);
        return mapB;
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @ReactMethod
    public void show(String str, int i) {
        UiThreadUtil.runOnUiThread(new a(str, i));
    }

    @ReactMethod
    public void showWithGravity(String str, int i, int i2) {
        UiThreadUtil.runOnUiThread(new b(str, i, i2));
    }

    @ReactMethod
    public void showWithGravityAndOffset(String str, int i, int i2, int i3, int i4) {
        UiThreadUtil.runOnUiThread(new c(str, i, i2, i3, i4));
    }
}
