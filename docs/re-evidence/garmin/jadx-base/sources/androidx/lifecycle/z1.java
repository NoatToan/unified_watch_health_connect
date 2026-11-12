package androidx.lifecycle;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class z1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f8084a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2 f8085b;

    public z1(b0 b0Var, c2 c2Var) {
        this.f8084a = b0Var;
        this.f8085b = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f8084a.a(this.f8085b);
    }
}
