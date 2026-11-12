package at;

import c2.k3;
import c22.l;
import cw1.r;
import e23.p;
import i3.fe;
import java.util.Map;
import l72.y2;
import p005kotlin.Unit;
import p3.m;
import p3.p0;
import ux1.j;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f12706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f12707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f12708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f12709d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f12710e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f12711f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f12712g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f12713h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f12714i;

    public /* synthetic */ a(int i14, boolean z14, boolean z15, String str, e23.a aVar, e23.a aVar2, e23.a aVar3, int i15) {
        this.f12706a = 2;
        this.f12710e = i14;
        this.f12707b = z14;
        this.f12708c = z15;
        this.f12712g = str;
        this.f12709d = aVar;
        this.f12713h = aVar2;
        this.f12714i = aVar3;
        this.f12711f = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f12706a;
        int i15 = this.f12710e;
        Object obj3 = this.f12714i;
        Object obj4 = this.f12713h;
        Object obj5 = this.f12712g;
        Object obj6 = this.f12709d;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(i15 | 1);
                c.a(this.f12707b, this.f12708c, (e23.a) obj6, (z3.e) obj5, (k3) obj3, (z3.e) obj4, (m) obj, iT, this.f12711f);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(i15 | 1);
                r.a((h4.r) obj5, (String) obj4, (b92.a) obj3, this.f12707b, this.f12708c, (e23.a) obj6, (m) obj, iT2, this.f12711f);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int iT3 = p0.t(this.f12711f | 1);
                ku1.g.d(this.f12710e, this.f12707b, this.f12708c, (String) obj5, (e23.a) obj6, (e23.a) obj4, (e23.a) obj3, (m) obj, iT3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                y2 y2Var = y2.f111386a;
                int iT4 = p0.t(i15 | 1);
                ((y2) obj6).d(this.f12707b, (p) obj5, (p) obj4, (h4.r) obj3, this.f12708c, (m) obj, iT4, this.f12711f);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iT5 = p0.t(i15 | 1);
                t21.b.b((String) obj5, (String) obj4, (String) obj3, this.f12707b, this.f12708c, (e23.a) obj6, (m) obj, iT5, this.f12711f);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iT6 = p0.t(i15 | 1);
                j.l(this.f12707b, this.f12708c, (dy1.r) obj5, (Map) obj4, (fe) obj3, (e23.a) obj6, (m) obj, iT6, this.f12711f);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT7 = p0.t(i15 | 1);
                z02.b.a(this.f12707b, (d92.a) obj6, (d92.a) obj5, (l) obj4, this.f12708c, (p) obj3, (m) obj, iT7, this.f12711f);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ a(Object obj, String str, Object obj2, boolean z14, boolean z15, e23.a aVar, int i14, int i15, int i16) {
        this.f12706a = i16;
        this.f12712g = obj;
        this.f12713h = str;
        this.f12714i = obj2;
        this.f12707b = z14;
        this.f12708c = z15;
        this.f12709d = aVar;
        this.f12710e = i14;
        this.f12711f = i15;
    }

    public /* synthetic */ a(y2 y2Var, boolean z14, p pVar, p pVar2, h4.r rVar, boolean z15, int i14, int i15) {
        this.f12706a = 3;
        this.f12709d = y2Var;
        this.f12707b = z14;
        this.f12712g = pVar;
        this.f12713h = pVar2;
        this.f12714i = rVar;
        this.f12708c = z15;
        this.f12710e = i14;
        this.f12711f = i15;
    }

    public /* synthetic */ a(boolean z14, d92.a aVar, d92.a aVar2, l lVar, boolean z15, p pVar, int i14, int i15) {
        this.f12706a = 6;
        this.f12707b = z14;
        this.f12709d = aVar;
        this.f12712g = aVar2;
        this.f12713h = lVar;
        this.f12708c = z15;
        this.f12714i = pVar;
        this.f12710e = i14;
        this.f12711f = i15;
    }

    public /* synthetic */ a(boolean z14, boolean z15, dy1.r rVar, Map map, fe feVar, e23.a aVar, int i14, int i15) {
        this.f12706a = 5;
        this.f12707b = z14;
        this.f12708c = z15;
        this.f12712g = rVar;
        this.f12713h = map;
        this.f12714i = feVar;
        this.f12709d = aVar;
        this.f12710e = i14;
        this.f12711f = i15;
    }

    public /* synthetic */ a(boolean z14, boolean z15, e23.a aVar, z3.e eVar, k3 k3Var, z3.e eVar2, int i14, int i15) {
        this.f12706a = 0;
        this.f12707b = z14;
        this.f12708c = z15;
        this.f12709d = aVar;
        this.f12712g = eVar;
        this.f12714i = k3Var;
        this.f12713h = eVar2;
        this.f12710e = i14;
        this.f12711f = i15;
    }
}
