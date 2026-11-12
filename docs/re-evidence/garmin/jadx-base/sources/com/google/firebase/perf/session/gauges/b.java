package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.v1.ApplicationProcessState;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ GaugeManager f53797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f53798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ApplicationProcessState f53799d;

    public /* synthetic */ b(GaugeManager gaugeManager, String str, ApplicationProcessState applicationProcessState, int i14) {
        this.f53796a = i14;
        this.f53797b = gaugeManager;
        this.f53798c = str;
        this.f53799d = applicationProcessState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53796a) {
            case 0:
                this.f53797b.lambda$stopCollectingGauges$3(this.f53798c, this.f53799d);
                break;
            default:
                this.f53797b.lambda$startCollectingGauges$2(this.f53798c, this.f53799d);
                break;
        }
    }
}
