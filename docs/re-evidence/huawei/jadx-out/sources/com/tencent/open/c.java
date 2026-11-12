package com.tencent.open;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import com.tencent.open.log.SLog;

/* JADX INFO: loaded from: classes20.dex */
public abstract class c extends Dialog {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected b f31046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final WebChromeClient f31047b;

    protected abstract void a(String str);

    public c(Context context, int i) {
        super(context, i);
        this.f31047b = new WebChromeClient() { // from class: com.tencent.open.c.1
            @Override // android.webkit.WebChromeClient
            public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
                if (consoleMessage == null) {
                    return false;
                }
                SLog.i("openSDK_LOG.JsDialog", "WebChromeClient onConsoleMessage" + consoleMessage.message() + " -- From  111 line " + consoleMessage.lineNumber() + " of " + consoleMessage.sourceId());
                c.this.a(consoleMessage == null ? "" : consoleMessage.message());
                return true;
            }

            @Override // android.webkit.WebChromeClient
            public void onConsoleMessage(String str, int i2, String str2) {
                SLog.i("openSDK_LOG.JsDialog", "WebChromeClient onConsoleMessage" + str + " -- From 222 line " + i2 + " of " + str2);
            }
        };
    }

    @Override // android.app.Dialog
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f31046a = new b();
    }
}
