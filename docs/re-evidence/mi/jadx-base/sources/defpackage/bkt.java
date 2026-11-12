package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public final class bkt implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Set f4325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ f7n f4326b;

    public bkt(f7n f7nVar, Set set) {
        this.f4326b = f7nVar;
        this.f4325a = set;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f4326b.f(this.f4325a);
        } catch (Exception unused) {
        }
    }
}
