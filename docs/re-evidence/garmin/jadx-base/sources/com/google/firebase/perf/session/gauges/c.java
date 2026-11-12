package com.google.firebase.perf.session.gauges;

import com.google.firebase.perf.util.Timer;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53800a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MemoryGaugeCollector f53801b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Timer f53802c;

    public /* synthetic */ c(MemoryGaugeCollector memoryGaugeCollector, Timer timer, int i14) {
        this.f53800a = i14;
        this.f53801b = memoryGaugeCollector;
        this.f53802c = timer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f53800a) {
            case 0:
                this.f53801b.lambda$scheduleMemoryMetricCollectionWithRate$0(this.f53802c);
                break;
            default:
                this.f53801b.lambda$scheduleMemoryMetricCollectionOnce$1(this.f53802c);
                break;
        }
    }
}
