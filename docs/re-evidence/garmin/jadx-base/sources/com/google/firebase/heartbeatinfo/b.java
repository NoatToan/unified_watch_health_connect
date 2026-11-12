package com.google.firebase.heartbeatinfo;

import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class b implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ DefaultHeartBeatController f53737b;

    public /* synthetic */ b(DefaultHeartBeatController defaultHeartBeatController, int i14) {
        this.f53736a = i14;
        this.f53737b = defaultHeartBeatController;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f53736a) {
            case 0:
                return this.f53737b.lambda$getHeartBeatsHeader$1();
            default:
                return this.f53737b.lambda$registerHeartBeat$0();
        }
    }
}
