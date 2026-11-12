package ba2;

import e23.l;
import g6.q;
import o53.f0;
import p005kotlin.Unit;
import p3.p1;
import s5.q0;
import s5.x0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17054a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ double f17055b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p1 f17056c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f17057d;

    public /* synthetic */ a(double d14, p1 p1Var, p1 p1Var2) {
        this.f17054a = 2;
        this.f17056c = p1Var;
        this.f17055b = d14;
        this.f17057d = p1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f17054a) {
            case 0:
                q0 q0Var = (q0) obj;
                q0Var.getClass();
                if (q0Var.e()) {
                    p1 p1Var = this.f17056c;
                    x0 x0Var = (x0) p1Var.getF182175a();
                    long j8 = ((x0) p1Var.getF182175a()).f157323b.f157308c;
                    f0.n(j8);
                    long j14 = j8 & 1095216660480L;
                    double d14 = q.d(j8);
                    double d15 = this.f17055b;
                    long jH = f0.H((float) (d14 * d15), j14);
                    long j15 = ((x0) p1Var.getF182175a()).f157322a.fontSize;
                    f0.n(j15);
                    p1Var.setValue(x0.a(x0Var, 0L, f0.H((float) (((double) q.d(j15)) * d15), 1095216660480L & j15), null, null, 0L, null, null, 0, jH, null, null, 16646141));
                } else {
                    this.f17057d.setValue(Boolean.TRUE);
                }
                break;
            case 1:
                q0 q0Var2 = (q0) obj;
                q0Var2.getClass();
                if (q0Var2.e()) {
                    p1 p1Var2 = this.f17056c;
                    x0 x0Var2 = (x0) p1Var2.getF182175a();
                    long j16 = ((x0) p1Var2.getF182175a()).f157323b.f157308c;
                    f0.n(j16);
                    long j17 = j16 & 1095216660480L;
                    double d16 = q.d(j16);
                    double d17 = this.f17055b;
                    long jH2 = f0.H((float) (d16 * d17), j17);
                    long j18 = ((x0) p1Var2.getF182175a()).f157322a.fontSize;
                    f0.n(j18);
                    p1Var2.setValue(x0.a(x0Var2, 0L, f0.H((float) (((double) q.d(j18)) * d17), 1095216660480L & j18), null, null, 0L, null, null, 0, jH2, null, null, 16646141));
                } else {
                    this.f17057d.setValue(Boolean.TRUE);
                }
                break;
            default:
                j23.f fVar = (j23.f) obj;
                fVar.getClass();
                Object start = fVar.getStart();
                if (((int) ((Number) start).floatValue()) <= 0.0d) {
                    start = null;
                }
                Float f14 = (Float) start;
                this.f17056c.setValue(f14 != null ? Double.valueOf(f14.floatValue()) : null);
                Object objB = fVar.b();
                if (((int) ((Number) objB).floatValue()) >= this.f17055b) {
                    objB = null;
                }
                Float f15 = (Float) objB;
                this.f17057d.setValue(f15 != null ? Double.valueOf(f15.floatValue()) : null);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ a(double d14, p1 p1Var, p1 p1Var2, int i14) {
        this.f17054a = i14;
        this.f17055b = d14;
        this.f17056c = p1Var;
        this.f17057d = p1Var2;
    }
}
