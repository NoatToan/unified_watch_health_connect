package qk0;

import lc.u0;
import p005kotlin.Unit;
import p3.n1;
import p3.p1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f145109a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ n1 f145110b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f145111c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f145112d;

    public /* synthetic */ l(n1 n1Var, p1 p1Var, p1 p1Var2) {
        this.f145110b = n1Var;
        this.f145111c = p1Var;
        this.f145112d = p1Var2;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f145109a;
        int iIntValue = ((Integer) obj).intValue();
        switch (i14) {
            case 0:
                int i15 = r.i.f145146a[((s) s.f145153d.get(iIntValue)).ordinal()];
                if (i15 == 1) {
                    this.f145111c.setValue(this.f145112d.getF182175a());
                } else if (i15 != 2) {
                    u0.r();
                    return null;
                }
                this.f145110b.t(iIntValue);
                return Unit.INSTANCE;
            default:
                this.f145110b.t(iIntValue);
                if (!x91.i.b(this.f145111c)) {
                    this.f145112d.setValue(Boolean.FALSE);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ l(p1 p1Var, p1 p1Var2, n1 n1Var) {
        this.f145111c = p1Var;
        this.f145112d = p1Var2;
        this.f145110b = n1Var;
    }
}
