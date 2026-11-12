package com.miui.tsmclient.common.task;

import android.text.TextUtils;
import com.miui.tsmclient.util.LogUtils;
import defpackage.xno;

/* JADX INFO: loaded from: classes4.dex */
public class SimpleSubscriber<T> extends xno<T> {
    private String mCompleteLog;
    private String mErrorLog;

    public SimpleSubscriber() {
        this("error occurred");
    }

    @Override // defpackage.a6h
    public void onCompleted() {
        if (TextUtils.isEmpty(this.mCompleteLog)) {
            return;
        }
        LogUtils.d(this.mCompleteLog);
    }

    @Override // defpackage.a6h
    public void onError(Throwable th) {
        if (TextUtils.isEmpty(this.mErrorLog)) {
            return;
        }
        LogUtils.e(this.mErrorLog, th);
    }

    @Override // defpackage.a6h
    public void onNext(T t) {
    }

    public SimpleSubscriber(String str) {
        this(null, str);
    }

    public SimpleSubscriber(String str, String str2) {
        this.mCompleteLog = str;
        this.mErrorLog = str2;
    }
}
