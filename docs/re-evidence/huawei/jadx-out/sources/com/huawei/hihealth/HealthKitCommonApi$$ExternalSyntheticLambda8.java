package com.huawei.hihealth;

import com.huawei.hihealth.listener.ResultCallback;
import com.huawei.hihealth.model.EventTypeInfo;
import com.huawei.hihealth.model.Subscriber;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class HealthKitCommonApi$$ExternalSyntheticLambda8 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Subscriber f11777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ EventTypeInfo f11778b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ResultCallback f11779c;
    public final /* synthetic */ HealthKitCommonApi d;

    @Override // java.lang.Runnable
    public final void run() {
        this.d.d(this.f11779c, this.f11777a, this.f11778b);
    }
}
