package com.huawei.hwcloudjs.service.hms;

import android.app.Activity;
import com.huawei.hms.api.HuaweiApiAvailability;

/* JADX INFO: loaded from: classes37.dex */
class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ HuaweiApiAvailability f17181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f17182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ k.b f17183c;

    @Override // java.lang.Runnable
    public void run() {
        Activity activity = (Activity) this.f17183c.f17172c.get();
        if (activity != null) {
            this.f17181a.resolveError(activity, this.f17182b, 9004);
        }
    }

    l(k.b bVar, HuaweiApiAvailability huaweiApiAvailability, int i) {
        this.f17183c = bVar;
        this.f17181a = huaweiApiAvailability;
        this.f17182b = i;
    }
}
