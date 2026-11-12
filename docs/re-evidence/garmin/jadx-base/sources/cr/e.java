package cr;

import p005kotlin.Unit;
import p3.p1;
import s5.w0;
import x5.l0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class e implements e23.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f55262a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f55263b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f55264c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p1 f55265d;

    public /* synthetic */ e(e23.l lVar, String str, p1 p1Var) {
        this.f55262a = 2;
        this.f55264c = str;
        this.f55263b = lVar;
        this.f55265d = p1Var;
    }

    @Override // e23.a
    public final Object invoke() {
        int i14 = this.f55262a;
        String str = this.f55264c;
        p1 p1Var = this.f55265d;
        e23.l lVar = this.f55263b;
        switch (i14) {
            case 0:
                lVar.invoke(str);
                p1Var.setValue(Boolean.FALSE);
                break;
            case 1:
                lVar.invoke(str);
                p1Var.setValue(Boolean.FALSE);
                break;
            case 2:
                o62.x xVar = o62.x.f129810a;
                String str2 = this.f55264c;
                p1Var.setValue(new l0(str2, 0L, (w0) null, 6, (p005kotlin.jvm.internal.j) null));
                lVar.invoke(str2);
                break;
            default:
                p1Var.setValue(Boolean.FALSE);
                lVar.invoke(str);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ e(int i14, e23.l lVar, String str, p1 p1Var) {
        this.f55262a = i14;
        this.f55263b = lVar;
        this.f55264c = str;
        this.f55265d = p1Var;
    }
}
