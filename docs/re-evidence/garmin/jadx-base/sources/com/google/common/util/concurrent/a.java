package com.google.common.util.concurrent;

import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class a implements Executor {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f53594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Service f53595b;

    public /* synthetic */ a(Service service, int i14) {
        this.f53594a = i14;
        this.f53595b = service;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.f53594a) {
            case 0:
                ((AbstractExecutionThreadService) this.f53595b).lambda$executor$0(runnable);
                break;
            default:
                ((AbstractIdleService) this.f53595b).lambda$executor$0(runnable);
                break;
        }
    }
}
