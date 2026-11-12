package ue;

import i3.e5;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lue/c;", "Ljava/util/concurrent/ThreadFactory;", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c implements ThreadFactory {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f170040a = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f170041b;

    public c(boolean z14) {
        this.f170041b = z14;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        runnable.getClass();
        StringBuilder sbK = e5.k(this.f170041b ? "WM.task-" : "androidx.work-");
        sbK.append(this.f170040a.incrementAndGet());
        return new Thread(runnable, sbK.toString());
    }
}
