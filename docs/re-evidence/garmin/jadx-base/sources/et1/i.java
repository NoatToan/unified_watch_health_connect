package et1;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class i implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f65651a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.p f65652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f65653c;

    public /* synthetic */ i(e23.p pVar, p3.p1 p1Var, int i14) {
        this.f65651a = i14;
        this.f65652b = pVar;
        this.f65653c = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f65651a) {
            case 0:
                m4.g0 g0Var = (m4.g0) obj;
                g0Var.getClass();
                if (g0Var.a()) {
                    this.f65652b.invoke((String) this.f65653c.getF182175a(), Boolean.FALSE);
                }
                break;
            case 1:
                m4.g0 g0Var2 = (m4.g0) obj;
                g0Var2.getClass();
                if (g0Var2.a()) {
                    this.f65652b.invoke((String) this.f65653c.getF182175a(), Boolean.TRUE);
                }
                break;
            case 2:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f65653c.setValue(bool);
                this.f65652b.invoke(qw0.v.HAZARDS, bool);
                break;
            default:
                x5.l0 l0Var = (x5.l0) obj;
                l0Var.getClass();
                this.f65653c.setValue(l0Var);
                this.f65652b.invoke(l0Var.f188878a.f157138b, Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}
