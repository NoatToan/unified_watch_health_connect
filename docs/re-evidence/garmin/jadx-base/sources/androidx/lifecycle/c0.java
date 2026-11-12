package androidx.lifecycle;

import p005kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/lifecycle/c0;", "", "Landroidx/lifecycle/b0;", "lifecycle", "Landroidx/lifecycle/b0$b;", "minState", "Landroidx/lifecycle/p;", "dispatchQueue", "Lo53/l1;", "parentJob", "<init>", "(Landroidx/lifecycle/b0;Landroidx/lifecycle/b0$b;Landroidx/lifecycle/p;Lo53/l1;)V", "lifecycle-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b0 f7845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b0.b f7846b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f7847c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.core.view.q f7848d;

    public c0(b0 b0Var, b0.b bVar, p pVar, o53.l1 l1Var) {
        b0Var.getClass();
        bVar.getClass();
        pVar.getClass();
        l1Var.getClass();
        this.f7845a = b0Var;
        this.f7846b = bVar;
        this.f7847c = pVar;
        androidx.core.view.q qVar = new androidx.core.view.q(1, this, l1Var);
        this.f7848d = qVar;
        if (b0Var.getF7973d() != b0.b.DESTROYED) {
            b0Var.a(qVar);
        } else {
            l1Var.c(null);
            a();
        }
    }

    public final void a() {
        this.f7845a.d(this.f7848d);
        p pVar = this.f7847c;
        pVar.f7984b = true;
        pVar.a();
    }
}
