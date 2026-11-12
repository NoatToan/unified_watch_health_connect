package dv0;

import li0.z;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class t implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f61425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f61426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e23.a f61427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f61428d;

    public /* synthetic */ t(int i14, int i15, e23.a aVar, boolean z14) {
        this.f61425a = 10;
        this.f61426b = z14;
        this.f61427c = aVar;
        this.f61428d = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        p3.m mVar = (p3.m) obj;
        Integer num = (Integer) obj2;
        switch (this.f61425a) {
            case 0:
                num.getClass();
                u.a(this.f61426b, this.f61427c, mVar, p0.t(this.f61428d | 1));
                break;
            case 1:
                num.intValue();
                fv0.f.g(this.f61426b, this.f61427c, mVar, p0.t(this.f61428d | 1));
                break;
            case 2:
                num.intValue();
                h50.e.d(this.f61426b, this.f61427c, mVar, p0.t(this.f61428d | 1));
                break;
            case 3:
                num.getClass();
                l3.k.a(this.f61426b, this.f61427c, mVar, p0.t(this.f61428d | 1));
                break;
            case 4:
                num.intValue();
                z.b(this.f61426b, this.f61427c, mVar, p0.t(this.f61428d | 1));
                break;
            case 5:
                num.intValue();
                z.l(this.f61426b, this.f61427c, mVar, p0.t(this.f61428d | 1));
                break;
            case 6:
                num.intValue();
                z.h(this.f61426b, this.f61427c, mVar, p0.t(this.f61428d | 1));
                break;
            case 7:
                num.intValue();
                z.c(this.f61426b, this.f61427c, mVar, p0.t(this.f61428d | 1));
                break;
            case 8:
                num.intValue();
                z.m(this.f61426b, this.f61427c, mVar, p0.t(this.f61428d | 1));
                break;
            case 9:
                num.intValue();
                z.k(this.f61426b, this.f61427c, mVar, p0.t(this.f61428d | 1));
                break;
            case 10:
                num.getClass();
                q51.d.a(p0.t(1), this.f61428d, this.f61427c, mVar, this.f61426b);
                break;
            default:
                num.intValue();
                v50.b.d(this.f61426b, this.f61427c, mVar, p0.t(this.f61428d | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ t(boolean z14, e23.a aVar, int i14, int i15, byte b14) {
        this.f61425a = i15;
        this.f61426b = z14;
        this.f61427c = aVar;
        this.f61428d = i14;
    }
}
