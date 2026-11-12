package com.huawei.hihealth;

import com.huawei.hihealth.listener.HiSubscribeCallback;
import com.huawei.hihealth.model.Notification;
import com.huawei.hihealth.model.SubscribeModel;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class HealthKitCommonApi$$ExternalSyntheticLambda9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ HiSubscribeCallback f11780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ HealthKitCommonApi f11781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Notification f11782c;
    public final /* synthetic */ SubscribeModel e;

    @Override // java.lang.Runnable
    public final void run() {
        this.f11781b.c(this.f11782c, this.f11780a, this.e);
    }
}
