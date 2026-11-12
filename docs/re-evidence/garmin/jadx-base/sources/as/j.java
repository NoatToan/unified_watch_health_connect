package as;

import cw1.e1;
import ew1.m2;
import java.util.List;
import l72.p2;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class j implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12649a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12650b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f12651c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12652d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12653e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12654f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f12655g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f12656h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f12657i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ o13.h f12658j;

    public /* synthetic */ j(int i14, Integer num, boolean z14, e23.a aVar, e23.a aVar2, e23.p pVar, e23.p pVar2, int i15, int i16) {
        this.f12651c = i14;
        this.f12654f = num;
        this.f12650b = z14;
        this.f12655g = aVar;
        this.f12656h = aVar2;
        this.f12657i = pVar;
        this.f12658j = pVar2;
        this.f12652d = i15;
        this.f12653e = i16;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f12649a;
        int i15 = this.f12652d;
        Object obj3 = this.f12655g;
        o13.h hVar = this.f12658j;
        Object obj4 = this.f12657i;
        Object obj5 = this.f12656h;
        Object obj6 = this.f12654f;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(i15 | 1);
                k.c(this.f12651c, (Integer) obj6, this.f12650b, (e23.a) obj3, (e23.a) obj5, (e23.p) obj4, (e23.p) hVar, (p3.m) obj, iT, this.f12653e);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(7);
                e1.a((h4.r) obj6, (String) obj3, (List) obj5, (vt1.h) obj4, (e23.l) hVar, this.f12650b, this.f12651c, this.f12652d, (p3.m) obj, iT2, this.f12653e);
                break;
            case 2:
                ((Integer) obj2).getClass();
                m2.a aVar = m2.f66581d;
                int iT3 = p0.t(this.f12653e | 1);
                ((m2) obj6).z6((h4.r) obj3, (vt1.o) obj5, (vt1.d) obj4, this.f12650b, this.f12651c, this.f12652d, (e23.l) hVar, (p3.m) obj, iT3);
                break;
            default:
                ((Integer) obj2).getClass();
                p2 p2Var = p2.f111205a;
                int iT4 = p0.t(this.f12651c | 1);
                int iT5 = p0.t(i15);
                ((p2) obj6).e((h4.r) obj5, this.f12650b, (e23.p) obj4, (e23.p) hVar, (e23.a) obj3, (p3.m) obj, iT4, iT5, this.f12653e);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ j(m2 m2Var, h4.r rVar, vt1.o oVar, vt1.d dVar, boolean z14, int i14, int i15, e23.l lVar, int i16) {
        this.f12654f = m2Var;
        this.f12655g = rVar;
        this.f12656h = oVar;
        this.f12657i = dVar;
        this.f12650b = z14;
        this.f12651c = i14;
        this.f12652d = i15;
        this.f12658j = lVar;
        this.f12653e = i16;
    }

    public /* synthetic */ j(h4.r rVar, String str, List list, vt1.h hVar, e23.l lVar, boolean z14, int i14, int i15, int i16, int i17) {
        this.f12654f = rVar;
        this.f12655g = str;
        this.f12656h = list;
        this.f12657i = hVar;
        this.f12658j = lVar;
        this.f12650b = z14;
        this.f12651c = i14;
        this.f12652d = i15;
        this.f12653e = i17;
    }

    public /* synthetic */ j(p2 p2Var, h4.r rVar, boolean z14, e23.p pVar, e23.p pVar2, e23.a aVar, int i14, int i15, int i16) {
        this.f12654f = p2Var;
        this.f12656h = rVar;
        this.f12650b = z14;
        this.f12657i = pVar;
        this.f12658j = pVar2;
        this.f12655g = aVar;
        this.f12651c = i14;
        this.f12652d = i15;
        this.f12653e = i16;
    }
}
