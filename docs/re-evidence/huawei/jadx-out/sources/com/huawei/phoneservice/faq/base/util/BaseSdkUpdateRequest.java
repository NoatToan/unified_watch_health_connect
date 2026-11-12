package com.huawei.phoneservice.faq.base.util;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes13.dex */
public abstract class BaseSdkUpdateRequest<T> implements SdkUpdateListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private T f21575a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Timer f21576b;

    public abstract void onCallback(String str, String str2, String str3, T t);

    @Override // com.huawei.phoneservice.faq.base.util.SdkUpdateListener
    public void onSdkUpdate(String str, String str2, String str3) {
        onCallback(str, str2, str3, this.f21575a);
    }

    public void a(TimerTask timerTask) {
        Timer timer = new Timer();
        this.f21576b = timer;
        timer.schedule(timerTask, 180000L);
    }

    public void a() {
        Timer timer = this.f21576b;
        if (timer != null) {
            timer.cancel();
        }
    }

    public BaseSdkUpdateRequest(T t) {
        this.f21575a = t;
    }
}
