package v2;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l0 implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f175078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.p0 f175079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ p005kotlin.jvm.internal.p0 f175080c;

    public /* synthetic */ l0(p005kotlin.jvm.internal.p0 p0Var, p005kotlin.jvm.internal.p0 p0Var2, int i14) {
        this.f175078a = i14;
        this.f175079b = p0Var;
        this.f175080c = p0Var2;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f175078a;
        p005kotlin.jvm.internal.p0 p0Var = this.f175080c;
        p005kotlin.jvm.internal.p0 p0Var2 = this.f175079b;
        d53.i iVar = (d53.i) obj;
        switch (i14) {
            case 0:
                m0 m0Var = m0.f175086a;
                if (p0Var2.f105807a == -1) {
                    p0Var2.f105807a = iVar.b().f96796a;
                }
                p0Var.f105807a = iVar.b().f96797b + 1;
                break;
            default:
                m0 m0Var2 = m0.f175086a;
                if (p0Var2.f105807a == -1) {
                    p0Var2.f105807a = iVar.b().f96796a;
                }
                p0Var.f105807a = iVar.b().f96797b + 1;
                break;
        }
        return "";
    }
}
