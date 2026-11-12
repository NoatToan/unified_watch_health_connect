package c82;

import b11.v;
import com.garmin.android.apps.connectmobile.activities.newmodel.ActivityDetailChartDTO;
import e11.x;
import e2.i0;
import e23.l;
import e23.p;
import h4.r;
import i3.mc;
import java.util.List;
import java.util.Map;
import lc.y;
import o53.b0;
import p005kotlin.Unit;
import p3.m;
import p3.n;
import p3.p0;
import p3.x1;
import yg2.f0;
import yg2.h0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class c implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f25709a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f25710b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f25711c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f25712d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f25713e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f25714f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f25715g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f25716h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f25717i;

    public /* synthetic */ c(yg2.h hVar, yg2.g gVar, vf2.e eVar, boolean z14, y yVar, boolean z15, z3.e eVar2, int i14) {
        this.f25713e = hVar;
        this.f25714f = gVar;
        this.f25715g = eVar;
        this.f25710b = z14;
        this.f25716h = yVar;
        this.f25711c = z15;
        this.f25717i = eVar2;
        this.f25712d = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f25709a;
        int i15 = this.f25712d;
        Object obj3 = this.f25717i;
        Object obj4 = this.f25716h;
        Object obj5 = this.f25715g;
        Object obj6 = this.f25714f;
        Object obj7 = this.f25713e;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                g.d((r) obj7, this.f25710b, (h) obj6, (String) obj5, (String) obj4, this.f25711c, (e23.a) obj3, (m) obj, p0.t(1), this.f25712d);
                break;
            case 1:
                ((Integer) obj2).getClass();
                dt1.f.a((pt1.d) obj7, this.f25710b, this.f25711c, (je2.b) obj6, (l) obj5, (e23.r) obj4, (l) obj3, (m) obj, p0.t(i15 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                x.c((r) obj7, (v21.e) obj6, (v) obj5, this.f25710b, this.f25711c, (e23.a) obj3, (e23.a) obj4, (m) obj, p0.t(i15 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                p003ji0.h.a((i0) obj7, this.f25710b, this.f25711c, (e23.a) obj3, (z3.e) obj6, (p003ji0.a) obj5, (l) obj4, (m) obj, p0.t(i15 | 1));
                break;
            case 4:
                String str = (String) obj5;
                List list = (List) obj7;
                l lVar = (l) obj6;
                e23.a aVar = (e23.a) obj3;
                e23.a aVar2 = (e23.a) obj4;
                m mVar = (m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (mVar.n(iIntValue & 1, (iIntValue & 3) != 2)) {
                    x1 x1Var = n.f135158a;
                    if (this.f25710b) {
                        mVar.C(645298005);
                        lw1.j.b(str, this.f25712d, list, this.f25711c, lVar, aVar, aVar2, mVar, 0);
                        mVar.f();
                    } else {
                        mVar.C(645771778);
                        mVar.f();
                    }
                } else {
                    mVar.e();
                }
                break;
            case 5:
                ((Integer) obj2).intValue();
                rg2.g.b((h0) obj7, this.f25710b, (rf2.l) obj6, (Map) obj5, this.f25711c, (zf2.d) obj4, (h0) obj3, (m) obj, p0.t(i15 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                ((sd0.c) obj7).a((List) obj6, (ActivityDetailChartDTO) obj5, (yo1.f) obj4, this.f25710b, this.f25711c, (e23.a) obj3, (m) obj, p0.t(i15 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                w70.e.a(this.f25710b, this.f25711c, (b0) obj7, (mc) obj6, (w70.g) obj5, (e23.a) obj3, (e23.a) obj4, (m) obj, p0.t(i15 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                f0.b((yg2.h) obj7, (yg2.g) obj6, (vf2.e) obj5, this.f25710b, (y) obj4, this.f25711c, (z3.e) obj3, (m) obj, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ c(r rVar, v21.e eVar, v vVar, boolean z14, boolean z15, e23.a aVar, e23.a aVar2, int i14) {
        this.f25713e = rVar;
        this.f25714f = eVar;
        this.f25715g = vVar;
        this.f25710b = z14;
        this.f25711c = z15;
        this.f25717i = aVar;
        this.f25716h = aVar2;
        this.f25712d = i14;
    }

    public /* synthetic */ c(r rVar, boolean z14, h hVar, String str, String str2, boolean z15, e23.a aVar, int i14, int i15) {
        this.f25713e = rVar;
        this.f25710b = z14;
        this.f25714f = hVar;
        this.f25715g = str;
        this.f25716h = str2;
        this.f25711c = z15;
        this.f25717i = aVar;
        this.f25712d = i15;
    }

    public /* synthetic */ c(pt1.d dVar, boolean z14, boolean z15, je2.b bVar, l lVar, e23.r rVar, l lVar2, int i14) {
        this.f25713e = dVar;
        this.f25710b = z14;
        this.f25711c = z15;
        this.f25714f = bVar;
        this.f25715g = lVar;
        this.f25716h = rVar;
        this.f25717i = lVar2;
        this.f25712d = i14;
    }

    public /* synthetic */ c(sd0.c cVar, List list, ActivityDetailChartDTO activityDetailChartDTO, yo1.f fVar, boolean z14, boolean z15, e23.a aVar, int i14) {
        this.f25713e = cVar;
        this.f25714f = list;
        this.f25715g = activityDetailChartDTO;
        this.f25716h = fVar;
        this.f25710b = z14;
        this.f25711c = z15;
        this.f25717i = aVar;
        this.f25712d = i14;
    }

    public /* synthetic */ c(i0 i0Var, boolean z14, boolean z15, e23.a aVar, z3.e eVar, p003ji0.a aVar2, l lVar, int i14) {
        this.f25713e = i0Var;
        this.f25710b = z14;
        this.f25711c = z15;
        this.f25717i = aVar;
        this.f25714f = eVar;
        this.f25715g = aVar2;
        this.f25716h = lVar;
        this.f25712d = i14;
    }

    public /* synthetic */ c(h0 h0Var, boolean z14, rf2.l lVar, Map map, boolean z15, zf2.d dVar, h0 h0Var2, int i14) {
        this.f25713e = h0Var;
        this.f25710b = z14;
        this.f25714f = lVar;
        this.f25715g = map;
        this.f25711c = z15;
        this.f25716h = dVar;
        this.f25717i = h0Var2;
        this.f25712d = i14;
    }

    public /* synthetic */ c(boolean z14, String str, int i14, List list, boolean z15, l lVar, e23.a aVar, e23.a aVar2) {
        this.f25710b = z14;
        this.f25715g = str;
        this.f25712d = i14;
        this.f25713e = list;
        this.f25711c = z15;
        this.f25714f = lVar;
        this.f25717i = aVar;
        this.f25716h = aVar2;
    }

    public /* synthetic */ c(boolean z14, boolean z15, b0 b0Var, mc mcVar, w70.g gVar, e23.a aVar, e23.a aVar2, int i14) {
        this.f25710b = z14;
        this.f25711c = z15;
        this.f25713e = b0Var;
        this.f25714f = mcVar;
        this.f25715g = gVar;
        this.f25717i = aVar;
        this.f25716h = aVar2;
        this.f25712d = i14;
    }
}
