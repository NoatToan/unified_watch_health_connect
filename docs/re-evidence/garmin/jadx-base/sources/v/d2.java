package v;

import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d2 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f173762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e2 f173763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ c2 f173764c;

    public /* synthetic */ d2(e2 e2Var, c2 c2Var, int i14) {
        this.f173762a = i14;
        this.f173763b = e2Var;
        this.f173764c = c2Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f173762a) {
            case 0:
                e2 e2Var = this.f173763b;
                c2 c2Var = this.f173764c;
                e1 e1Var = e2Var.f173785b;
                synchronized (e1Var.f173777b) {
                    e1Var.f173778c.remove(e2Var);
                    e1Var.f173779d.remove(e2Var);
                    break;
                }
                e2Var.q(c2Var);
                if (e2Var.f173790g == null) {
                    e2Var.toString();
                    return;
                } else {
                    Objects.requireNonNull(e2Var.f173789f);
                    e2Var.f173789f.m(c2Var);
                    return;
                }
            default:
                e2 e2Var2 = this.f173763b;
                c2 c2Var2 = this.f173764c;
                Objects.requireNonNull(e2Var2.f173789f);
                e2Var2.f173789f.q(c2Var2);
                return;
        }
    }
}
