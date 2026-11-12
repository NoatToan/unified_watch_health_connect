package at1;

import e23.p;
import h4.r;
import ht1.w;
import l72.a2;
import l72.y1;
import p005kotlin.Unit;
import p3.o1;
import p3.p0;
import p3.p1;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class h implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f12779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f12780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12783f;

    public /* synthetic */ h(r rVar, y1 y1Var, long j8, z3.e eVar, int i14) {
        this.f12778a = 3;
        this.f12782e = rVar;
        this.f12779b = y1Var;
        this.f12780c = j8;
        this.f12783f = eVar;
        this.f12781d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f12778a;
        int i15 = this.f12781d;
        Object obj3 = this.f12783f;
        Object obj4 = this.f12782e;
        Object obj5 = this.f12779b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(i15 | 1);
                jg.b.c((p1) obj4, this.f12780c, (String) obj5, (e23.l) obj3, (p3.m) obj, iT);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1);
                h62.k.h((String) obj5, (u4.d) obj4, this.f12780c, (e23.a) obj3, (p3.m) obj, iT2, this.f12781d);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iT3 = p0.t(i15 | 1);
                w.a((p1) obj4, this.f12780c, (o1) obj5, (e23.l) obj3, (p3.m) obj, iT3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iT4 = p0.t(i15 | 1);
                a2.b((r) obj4, (y1) obj5, this.f12780c, (z3.e) obj3, (p3.m) obj, iT4);
                break;
            case 4:
                p3.m mVar = (p3.m) obj;
                ((Integer) obj2).getClass();
                int i16 = o81.a.f130834f;
                ((o81.a) obj4).h(p0.t(i15 | 1), this.f12780c, (String) obj5, (String) obj3, mVar);
                break;
            default:
                ((Integer) obj2).intValue();
                int iT5 = p0.t(i15 | 1);
                long j8 = this.f12780c;
                tg1.m.a((String) obj5, j8, (e23.a) obj4, (e23.l) obj3, (p3.m) obj, iT5);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ h(long j8, Object obj, Object obj2, Object obj3, int i14, int i15) {
        this.f12778a = i15;
        this.f12782e = obj;
        this.f12780c = j8;
        this.f12779b = obj2;
        this.f12783f = obj3;
        this.f12781d = i14;
    }

    public /* synthetic */ h(String str, long j8, e23.a aVar, e23.l lVar, int i14) {
        this.f12778a = 5;
        this.f12779b = str;
        this.f12780c = j8;
        this.f12782e = aVar;
        this.f12783f = lVar;
        this.f12781d = i14;
    }

    public /* synthetic */ h(String str, u4.d dVar, long j8, e23.a aVar, int i14, int i15) {
        this.f12778a = 1;
        this.f12779b = str;
        this.f12782e = dVar;
        this.f12780c = j8;
        this.f12783f = aVar;
        this.f12781d = i15;
    }
}
