package com.huawei.health.recognizekit.h5;

import android.webkit.JavascriptInterface;
import com.huawei.health.h5pro.jsbridge.base.JsModuleBase;
import defpackage.gug;

/* JADX INFO: loaded from: classes.dex */
public class RecognizeH5Helper extends JsModuleBase {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static IH5Wrapper f8681a;

    /* JADX INFO: loaded from: classes8.dex */
    public interface IH5Wrapper {
        void finish();

        void inputManual();

        void reShooting();
    }

    public static void d(IH5Wrapper iH5Wrapper) {
        f8681a = iH5Wrapper;
    }

    @JavascriptInterface
    public void inputManual() {
        IH5Wrapper iH5Wrapper = f8681a;
        if (iH5Wrapper != null) {
            iH5Wrapper.inputManual();
        }
    }

    @JavascriptInterface
    public void reShooting() {
        IH5Wrapper iH5Wrapper = f8681a;
        if (iH5Wrapper != null) {
            iH5Wrapper.reShooting();
        }
    }

    @JavascriptInterface
    public void finishNative() {
        IH5Wrapper iH5Wrapper = f8681a;
        if (iH5Wrapper != null) {
            iH5Wrapper.finish();
        }
    }

    @JavascriptInterface
    public String getBackground() {
        return gug.b();
    }

    public static void a() {
        f8681a = null;
    }
}
