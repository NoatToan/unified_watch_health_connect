package a11;

import c22.a4;
import p005kotlin.Unit;
import p3.n1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class f0 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f294a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f295b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ n1 f296c;

    public /* synthetic */ f0(e23.l lVar, n1 n1Var, int i14) {
        this.f294a = i14;
        this.f295b = lVar;
        this.f296c = n1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f294a) {
            case 0:
                this.f295b.invoke(Integer.valueOf(this.f296c.getIntValue()));
                break;
            case 1:
                this.f295b.invoke(Integer.valueOf(this.f296c.getIntValue()));
                break;
            case 2:
                this.f295b.invoke(Integer.valueOf(this.f296c.getIntValue()));
                break;
            case 3:
                this.f295b.invoke(Integer.valueOf(this.f296c.getIntValue()));
                break;
            case 4:
                this.f295b.invoke(Integer.valueOf(this.f296c.getIntValue()));
                break;
            case 5:
                this.f295b.invoke(Long.valueOf(this.f296c.getIntValue()));
                break;
            case 6:
                this.f295b.invoke(Integer.valueOf(this.f296c.getIntValue()));
                break;
            case 7:
                this.f295b.invoke(Integer.valueOf(this.f296c.getIntValue()));
                break;
            case 8:
                this.f295b.invoke(Integer.valueOf(this.f296c.getIntValue()));
                break;
            default:
                a4.a aVar = a4.f22995c;
                String strValueOf = String.valueOf(this.f296c.getIntValue());
                aVar.getClass();
                a4 a4VarA = a4.a.a(strValueOf);
                if (a4VarA == null) {
                    a4VarA = a4.MONDAY;
                }
                this.f295b.invoke(a4VarA);
                break;
        }
        return Unit.INSTANCE;
    }
}
