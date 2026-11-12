package ak0;

import ew1.d3;
import i3.mc;
import java.util.List;
import l72.i3;
import p005kotlin.Unit;
import p3.p0;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class r implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f3665a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f3666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f3667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f3668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3669e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f3670f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f3671g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f3672h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f3673i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f3674j;

    public /* synthetic */ r(d3 d3Var, Integer num, List list, e23.l lVar, boolean z14, int i14, int i15, boolean z15, e23.a aVar, int i16) {
        this.f3666b = d3Var;
        this.f3672h = num;
        this.f3674j = list;
        this.f3669e = lVar;
        this.f3667c = z14;
        this.f3670f = i14;
        this.f3671g = i15;
        this.f3668d = z15;
        this.f3673i = aVar;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f3665a;
        int i15 = this.f3670f;
        Object obj3 = this.f3673i;
        Object obj4 = this.f3674j;
        Object obj5 = this.f3669e;
        Object obj6 = this.f3672h;
        Object obj7 = this.f3666b;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                int iT = p0.t(i15 | 1);
                com.garmin.android.apps.connectmobile.gcplus.presentation.home.b.b((String) obj7, (i3) obj6, this.f3667c, this.f3668d, (e23.a) obj3, (e23.l) obj5, (z3.e) obj4, (p3.m) obj, iT, this.f3671g);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(i15 | 1);
                cw1.r.b((h4.r) obj6, (String) obj7, (String) obj3, (b92.a) obj4, this.f3667c, this.f3668d, (e23.l) obj5, (p3.m) obj, iT2, this.f3671g);
                break;
            case 2:
                ((Integer) obj2).getClass();
                d3.a aVar = d3.f66394d;
                int iT3 = p0.t(385);
                ((d3) obj7).w6((Integer) obj6, (List) obj4, (e23.l) obj5, this.f3667c, this.f3670f, this.f3671g, this.f3668d, (e23.a) obj3, (p3.m) obj, iT3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int iT4 = p0.t(i15 | 1);
                g11.p.a((h4.r) obj7, (c2.j.l) obj6, (v21.e) obj3, (g21.u) obj5, (g21.f0) obj4, this.f3667c, this.f3668d, (p3.m) obj, iT4, this.f3671g);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iT5 = p0.t(i15 | 1);
                in1.b.a(this.f3667c, this.f3668d, (km1.v) obj7, (o53.b0) obj6, (mc) obj4, (e23.a) obj3, (e23.l) obj5, (p3.m) obj, iT5, this.f3671g);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT6 = p0.t(i15 | 1);
                vn.c.a((String) obj7, (wn.a) obj6, (sn.h) obj5, (im.b) obj4, (e23.a) obj3, this.f3667c, this.f3668d, (p3.m) obj, iT6, this.f3671g);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ r(h4.r rVar, c2.j.l lVar, v21.e eVar, g21.u uVar, g21.f0 f0Var, boolean z14, boolean z15, int i14, int i15) {
        this.f3666b = rVar;
        this.f3672h = lVar;
        this.f3673i = eVar;
        this.f3669e = uVar;
        this.f3674j = f0Var;
        this.f3667c = z14;
        this.f3668d = z15;
        this.f3670f = i14;
        this.f3671g = i15;
    }

    public /* synthetic */ r(h4.r rVar, String str, String str2, b92.a aVar, boolean z14, boolean z15, e23.l lVar, int i14, int i15) {
        this.f3672h = rVar;
        this.f3666b = str;
        this.f3673i = str2;
        this.f3674j = aVar;
        this.f3667c = z14;
        this.f3668d = z15;
        this.f3669e = lVar;
        this.f3670f = i14;
        this.f3671g = i15;
    }

    public /* synthetic */ r(String str, i3 i3Var, boolean z14, boolean z15, e23.a aVar, e23.l lVar, z3.e eVar, int i14, int i15) {
        this.f3666b = str;
        this.f3672h = i3Var;
        this.f3667c = z14;
        this.f3668d = z15;
        this.f3673i = aVar;
        this.f3669e = lVar;
        this.f3674j = eVar;
        this.f3670f = i14;
        this.f3671g = i15;
    }

    public /* synthetic */ r(String str, wn.a aVar, sn.h hVar, im.b bVar, e23.a aVar2, boolean z14, boolean z15, int i14, int i15) {
        this.f3666b = str;
        this.f3672h = aVar;
        this.f3669e = hVar;
        this.f3674j = bVar;
        this.f3673i = aVar2;
        this.f3667c = z14;
        this.f3668d = z15;
        this.f3670f = i14;
        this.f3671g = i15;
    }

    public /* synthetic */ r(boolean z14, boolean z15, km1.v vVar, o53.b0 b0Var, mc mcVar, e23.a aVar, e23.l lVar, int i14, int i15) {
        this.f3667c = z14;
        this.f3668d = z15;
        this.f3666b = vVar;
        this.f3672h = b0Var;
        this.f3674j = mcVar;
        this.f3673i = aVar;
        this.f3669e = lVar;
        this.f3670f = i14;
        this.f3671g = i15;
    }
}
