package com.huami.midong.webview;

import androidx.annotation.NonNull;
import com.huami.midong.webview.nativejsapi.IJsBridgeCallback;
import com.huami.watch.util.Log;

/* JADX INFO: loaded from: classes11.dex */
public class JsBridgeDelegate {
    private static final String TAG = "JsBridge";
    private static IJsBridgeCallback mJsBridgeCallback;

    @NonNull
    public static IJsBridgeCallback getJsBridgeCallback() {
        IJsBridgeCallback iJsBridgeCallback = mJsBridgeCallback;
        if (iJsBridgeCallback != null) {
            return iJsBridgeCallback;
        }
        Log.e(TAG, "you must init JsBridgeDelegate", new Object[0]);
        throw new IllegalStateException("you must init JsBridgeDelegate");
    }

    public static void init(IJsBridgeCallback iJsBridgeCallback) {
        mJsBridgeCallback = iJsBridgeCallback;
    }
}
