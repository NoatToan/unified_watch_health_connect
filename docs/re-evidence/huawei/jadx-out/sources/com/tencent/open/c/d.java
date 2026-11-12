package com.tencent.open.c;

import android.content.Context;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.tencent.open.log.SLog;
import com.tencent.open.web.security.SecureJsInterface;

/* JADX INFO: loaded from: classes20.dex */
public class d extends b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f31052a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private KeyEvent f31053b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.tencent.open.web.security.a f31054c;

    public d(Context context) {
        super(context);
    }

    @Override // android.webkit.WebView, android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        int unicodeChar;
        SLog.d("openSDK_LOG.SecureWebView", "-->dispatchKeyEvent, is device support: " + f31052a);
        if (!f31052a) {
            return super.dispatchKeyEvent(keyEvent);
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyCode == 66) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyCode == 67) {
                com.tencent.open.web.security.a.f31129b = true;
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getUnicodeChar() == 0) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (SecureJsInterface.isPWDEdit && (((unicodeChar = keyEvent.getUnicodeChar()) >= 33 && unicodeChar <= 95) || (unicodeChar >= 97 && unicodeChar <= 125))) {
                KeyEvent keyEvent2 = new KeyEvent(0, 17);
                this.f31053b = keyEvent2;
                return super.dispatchKeyEvent(keyEvent2);
            }
            return super.dispatchKeyEvent(keyEvent);
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        int unicodeChar;
        SLog.d("openSDK_LOG.SecureWebView", "-->onKeyDown, is device support: " + f31052a);
        if (!f31052a) {
            return super.onKeyDown(i, keyEvent);
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 4) {
                return super.onKeyDown(i, keyEvent);
            }
            if (keyCode == 66) {
                return super.onKeyDown(i, keyEvent);
            }
            if (keyCode == 67) {
                com.tencent.open.web.security.a.f31129b = true;
                return super.onKeyDown(i, keyEvent);
            }
            if (keyEvent.getUnicodeChar() == 0) {
                return super.onKeyDown(i, keyEvent);
            }
            if (SecureJsInterface.isPWDEdit && (((unicodeChar = keyEvent.getUnicodeChar()) >= 33 && unicodeChar <= 95) || (unicodeChar >= 97 && unicodeChar <= 125))) {
                KeyEvent keyEvent2 = new KeyEvent(0, 17);
                this.f31053b = keyEvent2;
                return super.onKeyDown(keyEvent2.getKeyCode(), this.f31053b);
            }
            return super.onKeyDown(i, keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        SLog.i("openSDK_LOG.SecureWebView", "-->create input connection, is edit: " + SecureJsInterface.isPWDEdit);
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        SLog.v("openSDK_LOG.SecureWebView", "-->onCreateInputConnection, inputConn is " + inputConnectionOnCreateInputConnection);
        if (inputConnectionOnCreateInputConnection != null) {
            f31052a = true;
            com.tencent.open.web.security.a aVar = new com.tencent.open.web.security.a(super.onCreateInputConnection(editorInfo), false);
            this.f31054c = aVar;
            return aVar;
        }
        f31052a = false;
        return inputConnectionOnCreateInputConnection;
    }
}
