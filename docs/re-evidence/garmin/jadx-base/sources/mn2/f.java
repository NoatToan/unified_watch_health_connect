package mn2;

import c83.a0;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class f implements e23.l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f119795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ b f119796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f119797c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f119798d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pn2.m f119799e;

    public /* synthetic */ f(b bVar, String str, String str2, pn2.m mVar, int i14) {
        this.f119795a = i14;
        this.f119796b = bVar;
        this.f119797c = str;
        this.f119798d = str2;
        this.f119799e = mVar;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f119795a;
        pn2.m<qn2.t, qn2.i> mVar = this.f119799e;
        String str = this.f119798d;
        String str2 = this.f119797c;
        b bVar = this.f119796b;
        switch (i14) {
            case 0:
                a0 a0Var = (a0) obj;
                a0Var.getClass();
                return j.c(a0Var, "getCardList", null, new f(this.f119796b, this.f119797c, this.f119798d, this.f119799e, 3), 56);
            case 1:
                a0 a0Var2 = (a0) obj;
                a0Var2.getClass();
                return j.c(a0Var2, "beginInitializeChip", null, new f(this.f119796b, this.f119797c, this.f119798d, this.f119799e, 4), 56);
            case 2:
                a0 a0Var3 = (a0) obj;
                a0Var3.getClass();
                return j.c(a0Var3, "endInitializeChip", null, new f(this.f119796b, this.f119797c, this.f119798d, this.f119799e, 5), 56);
            case 3:
                return bVar.c(str2, str, mVar);
            case 4:
                ((qn2.t) mVar.b()).f((String) obj);
                Unit unit = Unit.INSTANCE;
                return bVar.m(str2, str, mVar);
            default:
                return bVar.f(str2, str, mVar);
        }
    }
}
