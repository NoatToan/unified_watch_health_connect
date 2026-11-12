package androidx.lifecycle;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
public final class a2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b0 f7827a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ c2 f7828b;

    public a2(b0 b0Var, c2 c2Var) {
        this.f7827a = b0Var;
        this.f7828b = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f7827a.d(this.f7828b);
    }
}
