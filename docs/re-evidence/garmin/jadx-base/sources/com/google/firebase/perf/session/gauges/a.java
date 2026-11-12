package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.util.Timer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53793a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CpuGaugeCollector f53794b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Timer f53795c;

    public /* synthetic */ a(CpuGaugeCollector cpuGaugeCollector, Timer timer, int i14) {
        this.f53793a = i14;
        this.f53794b = cpuGaugeCollector;
        this.f53795c = timer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53793a) {
            case 0:
                this.f53794b.lambda$scheduleCpuMetricCollectionWithRate$0(this.f53795c);
                break;
            default:
                this.f53794b.lambda$scheduleCpuMetricCollectionOnce$1(this.f53795c);
                break;
        }
    }
}
