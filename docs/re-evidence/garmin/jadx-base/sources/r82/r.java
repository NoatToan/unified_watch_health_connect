package r82;

import p005kotlin.Unit;
import p3.p1;
import x5.l0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class r implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f151319a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Integer f151320b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f151321c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f151322d;

    public /* synthetic */ r(Integer num, e23.l lVar, p1 p1Var, int i14) {
        this.f151319a = i14;
        this.f151320b = num;
        this.f151321c = lVar;
        this.f151322d = p1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f151319a) {
            case 0:
                String str = (String) obj;
                str.getClass();
                Integer num = this.f151320b;
                if (num == null || (str.length() <= num.intValue() && num.intValue() > 0)) {
                    p1 p1Var = this.f151322d;
                    p1Var.setValue(str);
                    this.f151321c.invoke((String) p1Var.getF182175a());
                }
                break;
            default:
                l0 l0Var = (l0) obj;
                l0Var.getClass();
                s5.c cVar = l0Var.f188878a;
                Integer num2 = this.f151320b;
                if (num2 == null || (cVar.f157138b.length() <= num2.intValue() && num2.intValue() > 0)) {
                    this.f151321c.invoke(cVar.f157138b);
                    this.f151322d.setValue(l0Var);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
