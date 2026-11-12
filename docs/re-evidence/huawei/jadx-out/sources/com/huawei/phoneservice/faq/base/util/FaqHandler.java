package com.huawei.phoneservice.faq.base.util;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes13.dex */
public class FaqHandler extends Handler {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private WeakReference<CallBack> f21577c;

    @FunctionalInterface
    public interface CallBack {
        void handleMessage(int i, Message message);
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) {
        CallBack callBack;
        super.handleMessage(message);
        WeakReference<CallBack> weakReference = this.f21577c;
        if (weakReference == null || (callBack = weakReference.get()) == null) {
            return;
        }
        callBack.handleMessage(message.what, message);
    }

    public FaqHandler(CallBack callBack) {
        if (callBack != null) {
            this.f21577c = new WeakReference<>(callBack);
        }
    }
}
