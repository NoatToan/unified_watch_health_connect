package an;

import com.garmin.android.apps.connectmobile.activities.dashboard.PolylineView;
import com.google.mlkit.common.MlKitException;
import e23.l;
import java.util.List;
import m92.c0;
import m92.m;
import m92.m0;
import m92.n0;
import o13.p;
import o4.d0;
import o4.f0;
import o4.g1;
import o4.u1;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.j;
import p13.x;
import q4.f;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class a implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ long f4412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f4413c;

    public /* synthetic */ a(long j8, List list, int i14) {
        this.f4411a = i14;
        this.f4412b = j8;
        this.f4413c = list;
    }

    @Override // e23.l
    public final Object invoke(Object obj) {
        int i14 = this.f4411a;
        List list = this.f4413c;
        long j8 = this.f4412b;
        switch (i14) {
            case 0:
                PolylineView polylineView = (PolylineView) obj;
                polylineView.getClass();
                polylineView.c(f0.j(j8), list);
                return Unit.INSTANCE;
            case 1:
                PolylineView polylineView2 = (PolylineView) obj;
                polylineView2.getClass();
                polylineView2.c(f0.j(j8), list);
                return Unit.INSTANCE;
            case 2:
                f fVar = (f) obj;
                fVar.getClass();
                List list2 = this.f4413c;
                if (list2.isEmpty()) {
                    return i53.a.c();
                }
                d92.b.f58623a.getClass();
                d92.b.f58625c.getClass();
                float f14 = j92.b.f97899b.f97917b / 2;
                g6.f.a aVar = g6.f.f75994b;
                m.d dVar = new m.d(j8, null);
                g1.f128855a.getClass();
                return c0.e(fVar, f14, dVar, false, 0.0f, null, null, list2, Float.valueOf(481.0f), null, null, Float.valueOf(0.0f), Float.valueOf(100.0f), null, false, g1.a.a(0.0f, new float[]{4.0f, 4.0f}), 13116);
            default:
                Float fValueOf = Float.valueOf(481.0f);
                Float fValueOf2 = Float.valueOf(0.0f);
                f fVar2 = (f) obj;
                fVar2.getClass();
                i53.c cVarE = i53.a.e(list);
                d0.f128823b.getClass();
                List listK = x.k(new p(fValueOf2, d0.a(d0.f128831j)), new p(Float.valueOf(1.0f), d0.a(d0.c(0.4f, j8, 14))));
                u1.f129010b.getClass();
                return n0.d(fVar2, new m0(cVarE, (d0) null, new m.b(listK, u1.f129011c, null), (g6.f) null, 10, (j) null), fValueOf, null, null, fValueOf2, Float.valueOf(100.0f), null, MlKitException.CODE_SCANNER_TASK_IN_PROGRESS);
        }
    }

    public /* synthetic */ a(List list, long j8, int i14) {
        this.f4411a = i14;
        this.f4413c = list;
        this.f4412b = j8;
    }
}
