package aa2;

import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class d implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2314a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h4.r f2315b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f2316c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f2317d;

    public /* synthetic */ d(int i14, String str, h4.r rVar, int i15) {
        this.f2314a = 4;
        this.f2317d = i14;
        this.f2316c = str;
        this.f2315b = rVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f2314a;
        p3.m mVar = (p3.m) obj;
        ((Integer) obj2).getClass();
        switch (i14) {
            case 0:
                i.b(this.f2317d, p0.t(1), this.f2315b, this.f2316c, mVar);
                break;
            case 1:
                cw1.c.g(p0.t(this.f2317d | 1), this.f2315b, this.f2316c, mVar);
                break;
            case 2:
                da0.f.a(p0.t(this.f2317d | 1), this.f2315b, this.f2316c, mVar);
                break;
            case 3:
                h02.d.b(p0.t(this.f2317d | 1), this.f2315b, this.f2316c, mVar);
                break;
            case 4:
                s12.m.c(this.f2317d, p0.t(1), this.f2315b, this.f2316c, mVar);
                break;
            default:
                uu1.a.a(p0.t(this.f2317d | 1), this.f2315b, this.f2316c, mVar);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ d(h4.r rVar, String str, int i14, int i15) {
        this.f2314a = 0;
        this.f2315b = rVar;
        this.f2316c = str;
        this.f2317d = i14;
    }

    public /* synthetic */ d(h4.r rVar, String str, int i14, int i15, byte b14) {
        this.f2314a = i15;
        this.f2315b = rVar;
        this.f2316c = str;
        this.f2317d = i14;
    }

    public /* synthetic */ d(String str, h4.r rVar, int i14) {
        this.f2314a = 2;
        this.f2316c = str;
        this.f2315b = rVar;
        this.f2317d = i14;
    }
}
