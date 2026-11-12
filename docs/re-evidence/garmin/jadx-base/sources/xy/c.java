package xy;

import e23.p;
import l72.x0;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import w5.r;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f192608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f192609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f192610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ String f192611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ String f192612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ String f192613f;

    public /* synthetic */ c(String str, int i14, String str2, String str3, String str4, String str5) {
        this.f192608a = 0;
        this.f192609b = str;
        this.f192610c = str2;
        this.f192611d = str3;
        this.f192612e = str4;
        this.f192613f = str5;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f192608a) {
            case 0:
                ((Integer) obj2).getClass();
                r.a(this.f192609b, this.f192610c, this.f192611d, this.f192612e, this.f192613f, (m) obj, p0.t(1));
                break;
            case 1:
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    z02.b.a(false, null, null, null, false, z3.f.c(-812676722, new c(this.f192609b, this.f192610c, this.f192611d, this.f192612e, this.f192613f, 2, (byte) 0), mVar), mVar, 196608, 31);
                } else {
                    mVar.e();
                }
                break;
            default:
                m mVar2 = (m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = n.f135158a;
                    x0 x0Var = x0.f111346a;
                    h4.r.a aVar = h4.r.S;
                    float f14 = 16;
                    g6.f.a aVar2 = g6.f.f75994b;
                    x0Var.e(c2.l.C(aVar, f14, 0.0f, f14, f14, 2), z3.f.c(1205056615, new x91.n(this.f192609b, this.f192610c, this.f192611d, this.f192612e, this.f192613f, 7), mVar2), mVar2, (x0.f111348c << 6) | 54, 0);
                } else {
                    mVar2.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c(String str, String str2, String str3, String str4, String str5, int i14, byte b14) {
        this.f192608a = i14;
        this.f192609b = str;
        this.f192610c = str2;
        this.f192611d = str3;
        this.f192612e = str4;
        this.f192613f = str5;
    }
}
