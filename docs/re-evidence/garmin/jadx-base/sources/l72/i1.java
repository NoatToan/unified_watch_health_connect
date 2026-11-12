package l72;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class i1 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f111056a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Integer f111057b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.l f111058c;

    public /* synthetic */ i1(e23.l lVar, int i14, Integer num) {
        this.f111056a = i14;
        this.f111057b = num;
        this.f111058c = lVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        switch (this.f111056a) {
            case 0:
                String str = (String) obj;
                str.getClass();
                Integer num = this.f111057b;
                if (num == null || (str.length() <= num.intValue() && num.intValue() > 0)) {
                    this.f111058c.invoke(str);
                }
                break;
            case 1:
                x5.l0 l0Var = (x5.l0) obj;
                l0Var.getClass();
                Integer num2 = this.f111057b;
                if (num2 == null || (l0Var.f188878a.f157138b.length() <= num2.intValue() && num2.intValue() > 0)) {
                    this.f111058c.invoke(l0Var);
                }
                break;
            default:
                x5.l0 l0Var2 = (x5.l0) obj;
                l0Var2.getClass();
                Integer num3 = this.f111057b;
                if (num3 == null || (l0Var2.f188878a.f157138b.length() <= num3.intValue() && num3.intValue() > 0)) {
                    this.f111058c.invoke(l0Var2);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
