package w21;

import e23.p;
import j23.q;
import p005kotlin.Unit;
import p3.n;
import p3.p0;
import p3.x1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f181511a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f181512b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f181513c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f181514d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f181515e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f181516f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f181517g;

    public /* synthetic */ c(float f14, wo0.a aVar, boolean z14, String str, String str2, String str3) {
        this.f181512b = f14;
        this.f181514d = aVar;
        this.f181513c = z14;
        this.f181515e = str;
        this.f181516f = str2;
        this.f181517g = str3;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f181511a;
        Object obj3 = this.f181517g;
        Object obj4 = this.f181516f;
        Object obj5 = this.f181515e;
        Object obj6 = this.f181514d;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                m.e((y21.a) obj6, this.f181513c, this.f181512b, (e23.a) obj5, (e23.a) obj4, (e23.a) obj3, (p3.m) obj, p0.t(1));
                break;
            default:
                wo0.a aVar = (wo0.a) obj6;
                String str = (String) obj5;
                String str2 = (String) obj4;
                String str3 = (String) obj3;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    float f14 = this.f181512b;
                    boolean z14 = this.f181513c;
                    if (f14 < 1.5f) {
                        mVar.C(2093889261);
                        xo0.b.b(aVar, z14, str, str2, str3, false, mVar, 196608);
                        mVar.f();
                    } else if (new q(1.5f, 2.0f).contains(Float.valueOf(f14))) {
                        mVar.C(2094370350);
                        xo0.b.b(aVar, z14, str, str2, str3, true, mVar, 196608);
                        mVar.f();
                    } else {
                        mVar.C(2094830824);
                        xo0.b.c(aVar, z14, str, str2, str3, mVar, 0);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c(y21.a aVar, boolean z14, float f14, e23.a aVar2, e23.a aVar3, e23.a aVar4, int i14) {
        this.f181514d = aVar;
        this.f181513c = z14;
        this.f181512b = f14;
        this.f181515e = aVar2;
        this.f181516f = aVar3;
        this.f181517g = aVar4;
    }
}
