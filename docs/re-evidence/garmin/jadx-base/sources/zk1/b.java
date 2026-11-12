package zk1;

import d53.s;
import d53.t;
import e23.l;
import p005kotlin.Unit;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class b implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f205088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p1 f205089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ al1.a f205090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l f205091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p1 f205092e;

    public /* synthetic */ b(p1 p1Var, al1.a aVar, l lVar, p1 p1Var2, int i14) {
        this.f205088a = i14;
        this.f205089b = p1Var;
        this.f205090c = aVar;
        this.f205091d = lVar;
        this.f205092e = p1Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.a
    public final Object invoke() {
        int iIntValue;
        switch (this.f205088a) {
            case 0:
                String str = (String) this.f205089b.getF182175a();
                str.getClass();
                Double dF = s.f(str);
                if (dF != null) {
                    double dDoubleValue = dF.doubleValue();
                    if (dDoubleValue != this.f205090c.f3752a && dDoubleValue >= 0.0d) {
                        this.f205091d.invoke(Double.valueOf(dDoubleValue));
                    }
                }
                this.f205092e.setValue(Boolean.FALSE);
                break;
            default:
                Integer numI = t.i((String) this.f205089b.getF182175a());
                if (numI != null && (iIntValue = numI.intValue()) != this.f205090c.f3754c && iIntValue >= 0) {
                    this.f205091d.invoke(Integer.valueOf(iIntValue));
                }
                this.f205092e.setValue(Boolean.FALSE);
                break;
        }
        return Unit.INSTANCE;
    }
}
