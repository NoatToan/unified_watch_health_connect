package w52;

import java.util.List;
import org.joda.time.LocalDate;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class j0 implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f182552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f182553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f182554c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f182555d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f182556e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f182557f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f182558g;

    public /* synthetic */ j0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i14, int i15) {
        this.f182552a = i15;
        this.f182554c = obj;
        this.f182555d = obj2;
        this.f182556e = obj3;
        this.f182557f = obj4;
        this.f182558g = obj5;
        this.f182553b = i14;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f182552a;
        Object obj3 = this.f182558g;
        Object obj4 = this.f182557f;
        Object obj5 = this.f182556e;
        Object obj6 = this.f182555d;
        int i15 = this.f182553b;
        Object obj7 = this.f182554c;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                l0.i((com.garmin.android.apps.connectmobile.workouts.presentation.edit.k) obj7, (Integer) obj6, (Double) obj5, (m52.b) obj4, (m52.j) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.device.setup.presentation.inreach.a.b((String) obj7, (String) obj6, (c42.c) obj5, (e23.a) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 2:
                ((Integer) obj2).intValue();
                wl.c.a((u82.d) obj7, (tf0.i) obj6, (Long) obj5, (e23.l) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                wn0.g.n((i53.c) obj7, (in0.g) obj6, (un0.a) obj5, (e23.p) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                x1.l.e((p004k6.c0) obj7, (e23.a) obj6, (h4.r) obj5, (x1.e) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                List<Integer> list = xn.x.f191633p;
                ((xn.x) obj7).p((h4.r) obj6, (List) obj5, (s5.x0) obj4, (List) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 6:
                ((Integer) obj2).getClass();
                xq1.i.a((jq1.i) obj7, (LocalDate) obj6, (LocalDate) obj5, (e23.l) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                xq1.j.a((yd1.b) obj7, (yq1.e) obj6, (o82.a) obj5, (n82.f) obj4, (e23.a) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                yn0.n.a((i53.d) obj7, (i53.d) obj6, (j23.g) obj5, (un0.a) obj4, (in0.m) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                z02.f.e((String) obj7, (u4.d) obj6, (e23.a) obj5, (i53.c) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                int iT = p3.p0.t(i15) | 1;
                ((z3.e) obj7).c(this.f182555d, this.f182556e, this.f182557f, this.f182558g, (p3.m) obj, iT);
                break;
            case 11:
                ((Integer) obj2).getClass();
                z30.a.a((e23.p) obj7, (n50.g) obj6, (e23.l) obj5, (n50.d) obj4, (e23.l) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                zz1.c.d((h4.r) obj7, (zz1.d) obj6, (String) obj5, (zz1.a) obj4, (z3.e) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                zz1.c.c((h4.r) obj7, (zz1.d) obj6, (String) obj5, (e23.a) obj4, (z3.e) obj3, (p3.m) obj, p3.p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
