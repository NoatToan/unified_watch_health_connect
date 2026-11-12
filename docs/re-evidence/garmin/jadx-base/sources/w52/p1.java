package w52;

import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class p1 implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182711a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.a f182712b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p3.p1 f182713c;

    public /* synthetic */ p1(e23.a aVar, p3.p1 p1Var, int i14) {
        this.f182711a = i14;
        this.f182712b = aVar;
        this.f182713c = p1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        switch (this.f182711a) {
            case 0:
                this.f182713c.setValue(Boolean.FALSE);
                e23.a aVar = this.f182712b;
                if (aVar != null) {
                    aVar.invoke();
                }
                break;
            case 1:
                this.f182713c.setValue(Boolean.FALSE);
                e23.a aVar2 = this.f182712b;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                break;
            case 2:
                this.f182713c.setValue(Boolean.TRUE);
                this.f182712b.invoke();
                break;
            case 3:
                this.f182712b.invoke();
                this.f182713c.setValue(Boolean.FALSE);
                break;
            case 4:
                this.f182712b.invoke();
                this.f182713c.setValue(Boolean.FALSE);
                break;
            case 5:
                this.f182712b.invoke();
                this.f182713c.setValue(Boolean.TRUE);
                break;
            case 6:
                this.f182713c.setValue(Boolean.FALSE);
                this.f182712b.invoke();
                break;
            case 7:
                this.f182713c.setValue(Boolean.FALSE);
                this.f182712b.invoke();
                break;
            case 8:
                this.f182713c.setValue(Boolean.FALSE);
                this.f182712b.invoke();
                break;
            default:
                this.f182713c.setValue(Boolean.FALSE);
                this.f182712b.invoke();
                break;
        }
        return Unit.INSTANCE;
    }
}
