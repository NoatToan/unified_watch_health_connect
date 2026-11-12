package com.huawei.hihealth;

import com.huawei.hihealth.listener.ResultCallback;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class HiHealthKitExtendApi$$ExternalSyntheticLambda28 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f11935a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f11936b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ResultCallback f11937c;
    public final /* synthetic */ OutputStream d;
    public final /* synthetic */ HiHealthKitExtendApi e;

    @Override // java.lang.Runnable
    public final void run() {
        this.e.b(this.f11937c, this.f11935a, this.f11936b, this.d);
    }
}
