package rx.schedulers;

import j83.h;

/* JADX INFO: loaded from: classes11.dex */
@Deprecated
public final class ImmediateScheduler extends h {
    private ImmediateScheduler() {
        throw new IllegalStateException("No instances!");
    }

    @Override // j83.h
    public h.a createWorker() {
        return null;
    }
}
