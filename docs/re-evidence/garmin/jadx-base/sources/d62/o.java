package d62;

import android.graphics.Bitmap;
import android.net.Uri;
import c2.k3;
import com.garmin.android.apps.connectmobile.workouts.presentation.details.doworkout.WorkoutActivityProfileSelectionActivity;
import ew1.a1;
import ew1.m2;
import g02.r0;
import i3.e7;
import i3.ej;
import i3.h7;
import i3.ij;
import i3.k4;
import i3.mc;
import java.util.List;
import km1.v;
import l72.f0;
import li0.z;
import o4.r1;
import o53.b0;
import org.joda.time.Interval;
import p004k6.c0;
import p005kotlin.Unit;
import p3.p0;
import vd0.c1;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class o implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f58044a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f58045b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f58046c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f58047d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f58048e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f58049f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f58050g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final /* synthetic */ Object f58051h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f58052i;

    public /* synthetic */ o(Uri uri, String str, e23.a aVar, e23.a aVar2, e23.l lVar, boolean z14, int i14, int i15) {
        this.f58044a = 21;
        this.f58051h = uri;
        this.f58045b = str;
        this.f58048e = aVar;
        this.f58047d = aVar2;
        this.f58052i = lVar;
        this.f58046c = z14;
        this.f58049f = i14;
        this.f58050g = i15;
    }

    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f58044a;
        int i15 = this.f58049f;
        Object obj3 = this.f58052i;
        Object obj4 = this.f58047d;
        Object obj5 = this.f58048e;
        Object obj6 = this.f58045b;
        Object obj7 = this.f58051h;
        switch (i14) {
            case 0:
                ((Integer) obj2).getClass();
                WorkoutActivityProfileSelectionActivity.b bVar = WorkoutActivityProfileSelectionActivity.f48559a;
                int iT = p0.t(1 | i15);
                ((WorkoutActivityProfileSelectionActivity) obj7).da((String) obj6, (String) obj4, (u4.d) obj3, this.f58046c, (e23.a) obj5, (p3.m) obj, iT, this.f58050g);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int iT2 = p0.t(1 | i15);
                da0.u.a((String) obj6, this.f58046c, (String) obj4, (h4.r) obj7, (r1) obj3, (e23.a) obj5, (p3.m) obj, iT2, this.f58050g);
                break;
            case 2:
                ((Integer) obj2).getClass();
                a1.a aVar = a1.f66302e;
                int iT3 = p0.t(1);
                ((a1) obj7).w6((h4.r) obj6, (List) obj4, (tw1.d) obj3, this.f58046c, this.f58049f, this.f58050g, (e23.l) obj5, (p3.m) obj, iT3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                m2.a aVar2 = m2.f66581d;
                int iT4 = p0.t(1);
                ((m2) obj7).y6((h4.r) obj6, (vt1.o) obj4, (vt1.d) obj3, this.f58046c, this.f58049f, this.f58050g, (e23.p) obj5, (p3.m) obj, iT4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int iT5 = p0.t(1 | i15);
                fs.d.a((fs.f) obj7, this.f58046c, (e23.a) obj5, (e23.a) obj6, (n4.d) obj4, (e23.l) obj3, (p3.m) obj, iT5, this.f58050g);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int iT6 = p0.t(1 | i15);
                r0.c((String) obj6, (String) obj4, this.f58046c, (e23.p) obj7, (e23.p) obj3, (e23.a) obj5, (p3.m) obj, iT6, this.f58050g);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int iT7 = p0.t(1 | i15);
                h7.a((e23.a) obj5, (h4.r) obj7, this.f58046c, (e7) obj6, (r1) obj4, (e23.p) obj3, (p3.m) obj, iT7, this.f58050g);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int iT8 = p0.t(1 | i15);
                ej.b((c0) obj7, (z3.e) obj6, (ij) obj4, (h4.r) obj3, this.f58046c, (z3.e) obj5, (p3.m) obj, iT8, this.f58050g);
                break;
            case 8:
                ((Integer) obj2).getClass();
                int iT9 = p0.t(24961);
                il1.c.a((i53.d) obj7, (kl1.a) obj6, this.f58046c, this.f58049f, (e23.l) obj4, (e23.l) obj3, (e23.l) obj5, (p3.m) obj, iT9, this.f58050g);
                break;
            case 9:
                ((Integer) obj2).getClass();
                int iT10 = p0.t(196609);
                is.h.a((h4.r) obj7, (ds.n) obj6, (Bitmap) obj4, this.f58049f, (nr.p0) obj3, this.f58046c, (e23.a) obj5, (p3.m) obj, iT10, this.f58050g);
                break;
            case 10:
                ((Integer) obj2).getClass();
                int iT11 = p0.t(1 | i15);
                l72.l.c((e23.q) obj7, (e23.q) obj6, (h4.r) obj4, (b92.a) obj3, this.f58046c, (e23.a) obj5, (p3.m) obj, iT11, this.f58050g);
                break;
            case 11:
                u4.d dVar = (u4.d) obj3;
                e23.a aVar3 = (e23.a) obj5;
                ((Integer) obj2).getClass();
                f0 f0Var = f0.f110999a;
                int iT12 = p0.t(1 | i15);
                int i16 = this.f58050g;
                ((f0) obj7).d(iT12, i16, aVar3, (h4.r) obj4, (String) obj6, (p3.m) obj, dVar, this.f58046c);
                break;
            case 12:
                ((Integer) obj2).getClass();
                f0.a aVar4 = f0.a.f111000a;
                int iT13 = p0.t(1 | i15);
                ((f0.a) obj7).i((e23.p) obj4, (String) obj6, (h4.r) obj3, this.f58046c, (e23.a) obj5, (p3.m) obj, iT13, this.f58050g);
                break;
            case 13:
                ((Integer) obj2).getClass();
                int iT14 = p0.t(1 | i15);
                l72.r1.c((String) obj6, (String) obj4, (e23.a) obj5, this.f58046c, (b92.a) obj7, (e23.p) obj3, (p3.m) obj, iT14, this.f58050g);
                break;
            case 14:
                ((Integer) obj2).getClass();
                lg2.m mVar = lg2.m.f112346a;
                int iT15 = p0.t(1 | i15);
                ((lg2.m) obj7).d((e23.p) obj3, (String) obj6, (h4.r) obj4, this.f58046c, (e23.a) obj5, (p3.m) obj, iT15, this.f58050g);
                break;
            case 15:
                ((Integer) obj2).getClass();
                int iT16 = p0.t(1 | i15);
                z.g((e23.p) obj7, (u4.d) obj3, (String) obj6, (h4.r) obj4, this.f58046c, (e23.a) obj5, (p3.m) obj, iT16, this.f58050g);
                break;
            case 16:
                ((Integer) obj2).getClass();
                int iT17 = p0.t(1 | i15);
                mw0.a.a((String) obj6, this.f58046c, (e23.l) obj7, (e23.l) obj4, (e23.p) obj3, (e23.p) obj5, (p3.m) obj, iT17, this.f58050g);
                break;
            case 17:
                ((Integer) obj2).getClass();
                int iT18 = p0.t(1 | i15);
                pn1.b.a(this.f58046c, (v) obj7, (km1.b) obj6, (b0) obj4, (mc) obj3, (e23.l) obj5, (p3.m) obj, iT18, this.f58050g);
                break;
            case 18:
                ((Integer) obj2).getClass();
                int iT19 = p0.t(1 | i15);
                px.a.a((h4.r) obj7, (jx.a) obj6, (gt.a) obj4, (ix.j) obj3, this.f58046c, (Interval) obj5, (p3.m) obj, iT19, this.f58050g);
                break;
            case 19:
                ((Integer) obj2).getClass();
                int iT20 = p0.t(1 | i15);
                og2.k.g((String) obj6, (e23.a) obj5, (e23.a) obj7, this.f58046c, (e23.p) obj4, (z3.e) obj3, (p3.m) obj, iT20, this.f58050g);
                break;
            case 20:
                ((Integer) obj2).getClass();
                int iT21 = p0.t(1 | i15);
                s12.m.a((h4.r) obj7, this.f58046c, (h4.d.c) obj6, (c2.j.l) obj4, (c2.j.e) obj3, (z3.e) obj5, (p3.m) obj, iT21, this.f58050g);
                break;
            case 21:
                ((Integer) obj2).getClass();
                int iT22 = p0.t(1 | i15);
                c1.a((Uri) obj7, (String) obj6, (e23.a) obj5, (e23.a) obj4, (e23.l) obj3, this.f58046c, (p3.m) obj, iT22, this.f58050g);
                break;
            case 22:
                ((Integer) obj2).getClass();
                int iT23 = p0.t(1 | i15);
                vx.c.c((k4) obj7, (String) obj6, (e23.l) obj3, (String) obj4, (e23.a) obj5, this.f58046c, (p3.m) obj, iT23, this.f58050g);
                break;
            case 23:
                ((Integer) obj2).getClass();
                int iT24 = p0.t(1 | i15);
                yz1.t.a((String) obj6, (String) obj4, (String) obj7, (h4.r) obj3, this.f58046c, (e23.a) obj5, (p3.m) obj, iT24, this.f58050g);
                break;
            case 24:
                ((Integer) obj2).getClass();
                int iT25 = p0.t(1 | i15);
                z01.d.a((h4.r) obj7, (v21.e) obj4, (String) obj6, (g21.f0) obj3, (g21.f0) obj5, this.f58046c, (p3.m) obj, iT25, this.f58050g);
                break;
            case 25:
                ((Integer) obj2).getClass();
                int iT26 = p0.t(1 | i15);
                z02.d.a(this.f58046c, (e23.p) obj7, (e23.p) obj6, (e23.p) obj4, (k3) obj3, (e23.p) obj5, (p3.m) obj, iT26, this.f58050g);
                break;
            default:
                ((Integer) obj2).getClass();
                int iT27 = p0.t(i15 | 1);
                zs1.l.a((h4.r) obj7, (pt1.t) obj6, this.f58046c, (e23.a) obj5, (e23.l) obj4, (e23.l) obj3, (p3.m) obj, iT27, this.f58050g);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ o(e23.a aVar, h4.r rVar, boolean z14, e7 e7Var, r1 r1Var, e23.p pVar, int i14, int i15) {
        this.f58044a = 6;
        this.f58048e = aVar;
        this.f58051h = rVar;
        this.f58046c = z14;
        this.f58045b = e7Var;
        this.f58047d = r1Var;
        this.f58052i = pVar;
        this.f58049f = i14;
        this.f58050g = i15;
    }

    public /* synthetic */ o(ew1.u uVar, h4.r rVar, Object obj, Object obj2, boolean z14, int i14, int i15, o13.h hVar, int i16, int i17) {
        this.f58044a = i17;
        this.f58051h = uVar;
        this.f58045b = rVar;
        this.f58047d = obj;
        this.f58052i = obj2;
        this.f58046c = z14;
        this.f58049f = i14;
        this.f58050g = i15;
        this.f58048e = hVar;
    }

    public /* synthetic */ o(fs.f fVar, boolean z14, e23.a aVar, e23.a aVar2, n4.d dVar, e23.l lVar, int i14, int i15) {
        this.f58044a = 4;
        this.f58051h = fVar;
        this.f58046c = z14;
        this.f58048e = aVar;
        this.f58045b = aVar2;
        this.f58047d = dVar;
        this.f58052i = lVar;
        this.f58049f = i14;
        this.f58050g = i15;
    }

    public /* synthetic */ o(h4.r rVar, ds.n nVar, Bitmap bitmap, int i14, nr.p0 p0Var, boolean z14, e23.a aVar, int i15, int i16) {
        this.f58044a = 9;
        this.f58051h = rVar;
        this.f58045b = nVar;
        this.f58047d = bitmap;
        this.f58049f = i14;
        this.f58052i = p0Var;
        this.f58046c = z14;
        this.f58048e = aVar;
        this.f58050g = i16;
    }

    public /* synthetic */ o(h4.r rVar, pt1.t tVar, boolean z14, e23.a aVar, e23.l lVar, e23.l lVar2, int i14, int i15) {
        this.f58044a = 26;
        this.f58051h = rVar;
        this.f58045b = tVar;
        this.f58046c = z14;
        this.f58048e = aVar;
        this.f58047d = lVar;
        this.f58052i = lVar2;
        this.f58049f = i14;
        this.f58050g = i15;
    }

    public /* synthetic */ o(h4.r rVar, v21.e eVar, String str, g21.f0 f0Var, g21.f0 f0Var2, boolean z14, int i14, int i15) {
        this.f58044a = 24;
        this.f58051h = rVar;
        this.f58047d = eVar;
        this.f58045b = str;
        this.f58052i = f0Var;
        this.f58048e = f0Var2;
        this.f58046c = z14;
        this.f58049f = i14;
        this.f58050g = i15;
    }

    public /* synthetic */ o(h4.r rVar, boolean z14, h4.d.c cVar, c2.j.l lVar, c2.j.e eVar, z3.e eVar2, int i14, int i15) {
        this.f58044a = 20;
        this.f58051h = rVar;
        this.f58046c = z14;
        this.f58045b = cVar;
        this.f58047d = lVar;
        this.f58052i = eVar;
        this.f58048e = eVar2;
        this.f58049f = i14;
        this.f58050g = i15;
    }

    public /* synthetic */ o(k4 k4Var, String str, e23.l lVar, String str2, e23.a aVar, boolean z14, int i14, int i15) {
        this.f58044a = 22;
        this.f58051h = k4Var;
        this.f58045b = str;
        this.f58052i = lVar;
        this.f58047d = str2;
        this.f58048e = aVar;
        this.f58046c = z14;
        this.f58049f = i14;
        this.f58050g = i15;
    }

    public /* synthetic */ o(i53.d dVar, kl1.a aVar, boolean z14, int i14, e23.l lVar, e23.l lVar2, e23.l lVar3, int i15, int i16) {
        this.f58044a = 8;
        this.f58051h = dVar;
        this.f58045b = aVar;
        this.f58046c = z14;
        this.f58049f = i14;
        this.f58047d = lVar;
        this.f58052i = lVar2;
        this.f58048e = lVar3;
        this.f58050g = i16;
    }

    public /* synthetic */ o(Object obj, Object obj2, Object obj3, Object obj4, boolean z14, Object obj5, int i14, int i15, int i16) {
        this.f58044a = i16;
        this.f58051h = obj;
        this.f58045b = obj2;
        this.f58047d = obj3;
        this.f58052i = obj4;
        this.f58046c = z14;
        this.f58048e = obj5;
        this.f58049f = i14;
        this.f58050g = i15;
    }

    public /* synthetic */ o(Object obj, u4.d dVar, String str, h4.r rVar, boolean z14, e23.a aVar, int i14, int i15, int i16) {
        this.f58044a = i16;
        this.f58051h = obj;
        this.f58052i = dVar;
        this.f58045b = str;
        this.f58047d = rVar;
        this.f58046c = z14;
        this.f58048e = aVar;
        this.f58049f = i14;
        this.f58050g = i15;
    }

    public /* synthetic */ o(String str, e23.a aVar, e23.a aVar2, boolean z14, e23.p pVar, z3.e eVar, int i14, int i15) {
        this.f58044a = 19;
        this.f58045b = str;
        this.f58048e = aVar;
        this.f58051h = aVar2;
        this.f58046c = z14;
        this.f58047d = pVar;
        this.f58052i = eVar;
        this.f58049f = i14;
        this.f58050g = i15;
    }

    public /* synthetic */ o(String str, String str2, e23.a aVar, boolean z14, b92.a aVar2, e23.p pVar, int i14, int i15) {
        this.f58044a = 13;
        this.f58045b = str;
        this.f58047d = str2;
        this.f58048e = aVar;
        this.f58046c = z14;
        this.f58051h = aVar2;
        this.f58052i = pVar;
        this.f58049f = i14;
        this.f58050g = i15;
    }

    public /* synthetic */ o(String str, String str2, String str3, h4.r rVar, boolean z14, e23.a aVar, int i14, int i15) {
        this.f58044a = 23;
        this.f58045b = str;
        this.f58047d = str2;
        this.f58051h = str3;
        this.f58052i = rVar;
        this.f58046c = z14;
        this.f58048e = aVar;
        this.f58049f = i14;
        this.f58050g = i15;
    }

    public /* synthetic */ o(String str, String str2, boolean z14, e23.p pVar, e23.p pVar2, e23.a aVar, int i14, int i15) {
        this.f58044a = 5;
        this.f58045b = str;
        this.f58047d = str2;
        this.f58046c = z14;
        this.f58051h = pVar;
        this.f58052i = pVar2;
        this.f58048e = aVar;
        this.f58049f = i14;
        this.f58050g = i15;
    }

    public /* synthetic */ o(String str, boolean z14, e23.l lVar, e23.l lVar2, e23.p pVar, e23.p pVar2, int i14, int i15) {
        this.f58044a = 16;
        this.f58045b = str;
        this.f58046c = z14;
        this.f58051h = lVar;
        this.f58047d = lVar2;
        this.f58052i = pVar;
        this.f58048e = pVar2;
        this.f58049f = i14;
        this.f58050g = i15;
    }

    public /* synthetic */ o(String str, boolean z14, String str2, h4.r rVar, r1 r1Var, e23.a aVar, int i14, int i15) {
        this.f58044a = 1;
        this.f58045b = str;
        this.f58046c = z14;
        this.f58047d = str2;
        this.f58051h = rVar;
        this.f58052i = r1Var;
        this.f58048e = aVar;
        this.f58049f = i14;
        this.f58050g = i15;
    }

    public /* synthetic */ o(f0.a aVar, e23.p pVar, String str, h4.r rVar, boolean z14, e23.a aVar2, int i14, int i15) {
        this.f58044a = 12;
        this.f58051h = aVar;
        this.f58047d = pVar;
        this.f58045b = str;
        this.f58052i = rVar;
        this.f58046c = z14;
        this.f58048e = aVar2;
        this.f58049f = i14;
        this.f58050g = i15;
    }

    public /* synthetic */ o(lg2.m mVar, h4.r rVar, e23.p pVar, String str, boolean z14, e23.a aVar, int i14, int i15) {
        this.f58044a = 14;
        this.f58051h = mVar;
        this.f58047d = rVar;
        this.f58052i = pVar;
        this.f58045b = str;
        this.f58046c = z14;
        this.f58048e = aVar;
        this.f58049f = i14;
        this.f58050g = i15;
    }

    public /* synthetic */ o(boolean z14, Object obj, Object obj2, Object obj3, Object obj4, o13.h hVar, int i14, int i15, int i16) {
        this.f58044a = i16;
        this.f58046c = z14;
        this.f58051h = obj;
        this.f58045b = obj2;
        this.f58047d = obj3;
        this.f58052i = obj4;
        this.f58048e = hVar;
        this.f58049f = i14;
        this.f58050g = i15;
    }
}
