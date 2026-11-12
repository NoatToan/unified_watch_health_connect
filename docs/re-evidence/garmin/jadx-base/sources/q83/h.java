package q83;

import java.util.concurrent.ThreadFactory;

/* JADX INFO: loaded from: classes11.dex */
public final class h extends j83.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ThreadFactory f143413a;

    public h(ThreadFactory threadFactory) {
        this.f143413a = threadFactory;
    }

    @Override // j83.h
    public final j83.h.a createWorker() {
        return new i(this.f143413a);
    }
}
