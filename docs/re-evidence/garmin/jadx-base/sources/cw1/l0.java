package cw1;

import i3.fe;
import i3.kd;
import i3.uc;
import org.joda.time.LocalDate;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class l0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56092a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e23.l f56093b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f56094c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f56095d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ o13.h f56096e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f56097f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f56098g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f56099h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f56100i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f56101j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final /* synthetic */ Object f56102k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f56103l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f56104m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final /* synthetic */ Object f56105n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final /* synthetic */ Object f56106o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final /* synthetic */ o13.h f56107p;

    public /* synthetic */ l0(int i14, int i15, fe feVar, dy1.p pVar, i53.c cVar, boolean z14, e23.l lVar, e23.p pVar2, e23.l lVar2, e23.l lVar3, e23.a aVar, e23.a aVar2, e23.a aVar3, e23.a aVar4, int i16) {
        this.f56097f = i14;
        this.f56098g = i15;
        this.f56094c = feVar;
        this.f56100i = pVar;
        this.f56106o = cVar;
        this.f56095d = z14;
        this.f56093b = lVar;
        this.f56101j = pVar2;
        this.f56107p = lVar2;
        this.f56102k = lVar3;
        this.f56096e = aVar;
        this.f56103l = aVar2;
        this.f56104m = aVar3;
        this.f56105n = aVar4;
        this.f56099h = i16;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f56092a) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p3.p0.t(1);
                m0.a((h4.r) this.f56094c, (String) this.f56100i, (String) this.f56101j, (LocalDate) this.f56102k, (LocalDate) this.f56103l, (LocalDate) this.f56104m, (LocalDate) this.f56105n, (i53.c) this.f56106o, this.f56097f, this.f56093b, (e23.l) this.f56107p, (e23.a) this.f56096e, this.f56095d, this.f56098g, this.f56099h, (p3.m) obj, iT);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT2 = p3.p0.t(this.f56098g | 1);
                int iT3 = p3.p0.t(this.f56099h);
                kd.b((j23.f) this.f56100i, this.f56093b, (h4.r) this.f56094c, this.f56095d, (j23.f) this.f56101j, (e23.a) this.f56096e, (uc) this.f56102k, (a2.j) this.f56103l, (a2.j) this.f56104m, (z3.e) this.f56105n, (z3.e) this.f56106o, (e23.q) this.f56107p, this.f56097f, (p3.m) obj, iT2, iT3);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iT4 = p3.p0.t(this.f56097f | 1);
                int iT5 = p3.p0.t(this.f56098g);
                jt1.k.e((pt1.x) this.f56094c, (String) this.f56100i, this.f56095d, (e23.q) this.f56101j, (e23.p) this.f56102k, this.f56093b, (e23.l) this.f56107p, (e23.l) this.f56103l, (e23.l) this.f56104m, (e23.l) this.f56105n, (e23.l) this.f56106o, (e23.l) this.f56096e, (p3.m) obj, iT4, iT5, this.f56099h);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT6 = p3.p0.t(this.f56099h | 1);
                wx1.p.a(this.f56097f, this.f56098g, (fe) this.f56094c, (dy1.p) this.f56100i, (i53.c) this.f56106o, this.f56095d, this.f56093b, (e23.p) this.f56101j, (e23.l) this.f56107p, (e23.l) this.f56102k, (e23.a) this.f56096e, (e23.a) this.f56103l, (e23.a) this.f56104m, (e23.a) this.f56105n, (p3.m) obj, iT6);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ l0(h4.r rVar, String str, String str2, LocalDate localDate, LocalDate localDate2, LocalDate localDate3, LocalDate localDate4, i53.c cVar, int i14, e23.l lVar, e23.l lVar2, e23.a aVar, boolean z14, int i15, int i16, int i17) {
        this.f56094c = rVar;
        this.f56100i = str;
        this.f56101j = str2;
        this.f56102k = localDate;
        this.f56103l = localDate2;
        this.f56104m = localDate3;
        this.f56105n = localDate4;
        this.f56106o = cVar;
        this.f56097f = i14;
        this.f56093b = lVar;
        this.f56107p = lVar2;
        this.f56096e = aVar;
        this.f56095d = z14;
        this.f56098g = i15;
        this.f56099h = i16;
    }

    public /* synthetic */ l0(j23.f fVar, e23.l lVar, h4.r rVar, boolean z14, j23.f fVar2, e23.a aVar, uc ucVar, a2.j jVar, a2.j jVar2, z3.e eVar, z3.e eVar2, e23.q qVar, int i14, int i15, int i16) {
        this.f56100i = fVar;
        this.f56093b = lVar;
        this.f56094c = rVar;
        this.f56095d = z14;
        this.f56101j = fVar2;
        this.f56096e = aVar;
        this.f56102k = ucVar;
        this.f56103l = jVar;
        this.f56104m = jVar2;
        this.f56105n = eVar;
        this.f56106o = eVar2;
        this.f56107p = qVar;
        this.f56097f = i14;
        this.f56098g = i15;
        this.f56099h = i16;
    }

    public /* synthetic */ l0(pt1.x xVar, String str, boolean z14, e23.q qVar, e23.p pVar, e23.l lVar, e23.l lVar2, e23.l lVar3, e23.l lVar4, e23.l lVar5, e23.l lVar6, e23.l lVar7, int i14, int i15, int i16) {
        this.f56094c = xVar;
        this.f56100i = str;
        this.f56095d = z14;
        this.f56101j = qVar;
        this.f56102k = pVar;
        this.f56093b = lVar;
        this.f56107p = lVar2;
        this.f56103l = lVar3;
        this.f56104m = lVar4;
        this.f56105n = lVar5;
        this.f56106o = lVar6;
        this.f56096e = lVar7;
        this.f56097f = i14;
        this.f56098g = i15;
        this.f56099h = i16;
    }
}
