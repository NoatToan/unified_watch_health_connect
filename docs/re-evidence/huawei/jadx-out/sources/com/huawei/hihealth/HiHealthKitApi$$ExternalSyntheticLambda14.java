package com.huawei.hihealth;

import com.huawei.hihealth.listener.ResultCallback;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class HiHealthKitApi$$ExternalSyntheticLambda14 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ OutputStream f11807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ResultCallback f11809c;
    public final /* synthetic */ HiHealthKitApi d;
    public final /* synthetic */ String e;

    @Override // java.lang.Runnable
    public final void run() {
        this.d.a(this.f11809c, this.f11808b, this.e, this.f11807a);
    }
}
