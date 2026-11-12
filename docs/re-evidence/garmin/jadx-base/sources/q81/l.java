package q81;

import e23.p;
import h4.r;
import l72.x0;
import p005kotlin.Unit;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class l implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f143341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f143342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f143343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f143344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ m f143345e;

    public /* synthetic */ l(String str, String str2, String str3, m mVar, int i14) {
        this.f143341a = i14;
        this.f143342b = str;
        this.f143343c = str2;
        this.f143344d = str3;
        this.f143345e = mVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f143341a) {
            case 0:
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-1834892488, new l(this.f143342b, this.f143343c, this.f143344d, this.f143345e, 1), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    x0 x0Var = x0.f111346a;
                    g6.f.a aVar = g6.f.f75994b;
                    x0Var.e(c2.l.C(r.S, 0.0f, 0.0f, 0.0f, 16, 7), z3.f.c(-871126767, new mw0.h(10, this.f143342b, this.f143343c, this.f143344d, this.f143345e), mVar2), mVar2, (x0.f111348c << 6) | 54, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
