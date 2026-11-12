package b82;

import java.util.Calendar;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class x1 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f16891a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f16892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f16893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f16894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f16895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f16896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f16897g;

    public /* synthetic */ x1(long j8, long j14, Calendar calendar, e23.a aVar, e23.l lVar, int i14) {
        this.f16892b = j8;
        this.f16893c = j14;
        this.f16895e = calendar;
        this.f16896f = aVar;
        this.f16897g = lVar;
        this.f16894d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f16891a;
        int i15 = this.f16894d;
        Object obj3 = this.f16897g;
        Object obj4 = this.f16896f;
        Object obj5 = this.f16895e;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                y1 y1Var = y1.f16902a;
                int iT = p3.p0.t(196609);
                ((y1) obj5).b(this.f16894d, (y1.a) obj4, (p3.n1) obj3, this.f16892b, this.f16893c, (p3.m) obj, iT);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT2 = p3.p0.t(i15 | 1);
                jy0.y.a(this.f16892b, this.f16893c, (Calendar) obj5, (e23.a) obj4, (e23.l) obj3, (p3.m) obj, iT2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                l72.p pVar = l72.p.f111202a;
                int iT3 = p3.p0.t(i15 | 1);
                ((l72.p) obj5).b((String) obj4, (h4.r) obj3, this.f16892b, this.f16893c, (p3.m) obj, iT3);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT4 = p3.p0.t(i15 | 1);
                z01.b.a((h4.r) obj5, (Float) obj4, this.f16892b, this.f16893c, (Float) obj3, (p3.m) obj, iT4);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ x1(y1 y1Var, int i14, y1.a aVar, p3.n1 n1Var, long j8, long j14, int i15) {
        this.f16895e = y1Var;
        this.f16894d = i14;
        this.f16896f = aVar;
        this.f16897g = n1Var;
        this.f16892b = j8;
        this.f16893c = j14;
    }

    public /* synthetic */ x1(h4.r rVar, Float f14, long j8, long j14, Float f15, int i14) {
        this.f16895e = rVar;
        this.f16896f = f14;
        this.f16892b = j8;
        this.f16893c = j14;
        this.f16897g = f15;
        this.f16894d = i14;
    }

    public /* synthetic */ x1(l72.p pVar, String str, h4.r rVar, long j8, long j14, int i14) {
        this.f16895e = pVar;
        this.f16896f = str;
        this.f16897g = rVar;
        this.f16892b = j8;
        this.f16893c = j14;
        this.f16894d = i14;
    }
}
