package a42;

import am.p1;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Picture;
import b82.q1;
import c2.h2;
import c2.t2;
import c22.x0;
import c62.h1;
import c62.i1;
import com.garmin.android.apps.connectmobile.R;
import cw1.g1;
import e2.i0;
import i3.a1;
import i3.ec;
import i3.fe;
import i3.j2;
import i3.j9;
import i3.mc;
import i3.rj;
import i3.u7;
import java.util.List;
import o4.z0;
import org.joda.time.DateTime;
import p005kotlin.Unit;
import p3.n1;
import p3.p0;
import p3.x1;
import p3.x3;
import w52.v0;

/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class n implements e23.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f1049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f1050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f1051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f1052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f1053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f1054g;

    public /* synthetic */ n(String str, int i14, String str2, e23.l lVar, String str3, e23.a aVar, int i15) {
        this.f1048a = 10;
        this.f1050c = str;
        this.f1049b = i14;
        this.f1051d = str2;
        this.f1052e = lVar;
        this.f1053f = str3;
        this.f1054g = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:23:0x00cc  */
    @Override // e23.p
    public final Object invoke(Object obj, Object obj2) {
        int i14 = this.f1048a;
        p3.m.a aVar = p3.m.f135153a;
        int i15 = this.f1049b;
        Object obj3 = this.f1051d;
        Object obj4 = this.f1054g;
        Object obj5 = this.f1053f;
        Object obj6 = this.f1052e;
        Object obj7 = this.f1050c;
        switch (i14) {
            case 0:
                h82.r rVar = (h82.r) obj7;
                Context context = (Context) obj3;
                s sVar = (s) obj6;
                o53.b0 b0Var = (o53.b0) obj5;
                a1 a1Var = (a1) obj4;
                p3.m mVar = (p3.m) obj;
                int iIntValue = ((Integer) obj2).intValue();
                s.a aVar2 = s.f1073g;
                if (mVar.n(1 & iIntValue, (iIntValue & 3) != 2)) {
                    x1 x1Var = p3.n.f135158a;
                    x0.f23314a.getClass();
                    rVar.s(0, 2, gl1.d.W(x0.f23643tb), null, mVar);
                    String strW = gl1.d.W(x0.Eb);
                    Object objQ = mVar.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ == c2565a) {
                        objQ = new a03.h(22);
                        mVar.K(objQ);
                    }
                    String strA = oi0.c.A(context, (e23.l) objQ, strW);
                    int i16 = this.f1049b;
                    boolean zK = mVar.k(i16) | mVar.r(sVar) | mVar.r(context) | mVar.r(b0Var) | mVar.B(a1Var);
                    Object objQ2 = mVar.q();
                    if (zK || objQ2 == c2565a) {
                        q qVar = new q(i16, sVar, context, b0Var, a1Var, 0);
                        mVar.K(qVar);
                        objQ2 = qVar;
                    }
                    rVar.w(strW, strA, (e23.a) objQ2, mVar, 0, 0);
                    rVar.q(gl1.d.W(x0.Fb), mVar, 0);
                } else {
                    mVar.e();
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                aa2.s.b((aa2.u) obj7, (e23.a) obj3, (e23.l) obj6, (e23.r) obj5, (e23.r) obj4, (p3.m) obj, p0.t(1 | i15));
                break;
            case 2:
                ((Integer) obj2).getClass();
                p1.b((i0) obj7, (String) obj3, (List) obj6, (am.x0) obj5, (e23.l) obj4, (p3.m) obj, p0.t(1), this.f1049b);
                break;
            case 3:
                ((Integer) obj2).getClass();
                ao1.k.f((wn1.n) obj7, (String) obj3, (e23.a) obj6, (e23.a) obj5, (e23.a) obj4, (p3.m) obj, p0.t(1 | i15));
                break;
            case 4:
                ((Integer) obj2).getClass();
                b02.b.c((h4.r) obj7, (Boolean) obj3, (e23.l) obj6, (e23.p) obj5, (z3.e) obj4, (p3.m) obj, p0.t(1 | i15));
                break;
            case 5:
                ((Integer) obj2).getClass();
                q1 q1Var = q1.f16749a;
                ((q1) obj7).b(this.f1051d, (u4.d) obj6, (h4.r) obj5, (e23.q) obj4, (p3.m) obj, p0.t(1 | i15));
                break;
            case 6:
                ((Integer) obj2).getClass();
                zf.b.d((String) obj7, (z0) obj3, (String) obj6, (o4.d0) obj5, (Boolean) obj4, (p3.m) obj, p0.t(1), this.f1049b);
                break;
            case 7:
                ((Integer) obj2).getClass();
                i1.a((h1) obj7, (l52.i.a) obj3, (com.garmin.android.apps.connectmobile.workouts.presentation.details.e) obj6, (e23.a) obj5, (e23.q) obj4, (p3.m) obj, p0.t(1 | i15));
                break;
            case 8:
                String str = (String) obj7;
                String str2 = (String) obj3;
                String str3 = (String) obj6;
                e23.a aVar3 = (e23.a) obj5;
                x3 x3Var = (x3) obj4;
                p3.m mVar2 = (p3.m) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                com.garmin.android.apps.connectmobile.incidentdetection.d.a aVar4 = com.garmin.android.apps.connectmobile.incidentdetection.d.f36855d;
                if (mVar2.n(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    x1 x1Var2 = p3.n.f135158a;
                    cq0.t.b(str, str2, String.valueOf(i15), gl1.y.Q(mVar2, R.string.lbl_time_unit_seconds), (List) x3Var.getF182175a(), str3, aVar3, mVar2, 0);
                } else {
                    mVar2.e();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                cw1.c.e((h4.r) obj7, (Integer) obj3, (t4.d) obj6, (Integer) obj5, (e23.a) obj4, (p3.m) obj, p0.t(1 | i15));
                break;
            case 10:
                ((Integer) obj2).getClass();
                g1.a((String) obj7, this.f1049b, (String) obj3, (e23.l) obj6, (String) obj5, (e23.a) obj4, (p3.m) obj, p0.t(12583345));
                break;
            case 11:
                ((Integer) obj2).intValue();
                dk0.n.a((dk0.f) obj7, (dk0.m) obj3, (i53.c) obj6, (e23.p) obj5, (e23.a) obj4, (p3.m) obj, p0.t(1 | i15));
                break;
            case 12:
                ((Integer) obj2).intValue();
                dt1.g.a((com.garmin.android.library.mapsdkadapter.i.d) obj7, (i53.f) obj3, (i53.c) obj6, (List) obj5, (e23.a) obj4, (p3.m) obj, p0.t(1 | i15));
                break;
            case 13:
                ((Integer) obj2).getClass();
                e11.j.a((f11.a) obj7, (v21.e) obj3, (e01.a) obj6, (fe) obj5, (e23.l) obj4, (p3.m) obj, p0.t(1 | i15));
                break;
            case 14:
                o51.i iVar = (o51.i) obj7;
                t41.h hVar = (t41.h) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                hVar.getClass();
                int iIndexOf = iVar.f129269a.indexOf(hVar);
                ((n1) obj3).t(j23.t.e((int) iVar.f129270b.get(iIntValue3).get(iIndexOf).f129268c, i15, 5999));
                ((n1) obj6).t(iIntValue3);
                ((n1) obj5).t(iIndexOf);
                ((p3.p1) obj4).setValue(Boolean.TRUE);
                break;
            case 15:
                ((Integer) obj2).getClass();
                e62.l.a((v0) obj7, (com.garmin.android.apps.connectmobile.workouts.presentation.details.f) obj3, this.f1049b, (e23.l) obj6, (e23.a) obj5, (e23.a) obj4, (p3.m) obj, p0.t(385));
                break;
            case 16:
                ((Integer) obj2).getClass();
                ep.k.a((String) obj7, (Long) obj3, (e23.l) obj6, (Long) obj5, (Long) obj4, (p3.m) obj, p0.t(1), this.f1049b);
                break;
            case 17:
                ((Integer) obj2).getClass();
                f40.b.a((h4.r) obj7, (com.garmin.android.apps.connectmobile.courses.model.i) obj3, (Double) obj6, (Double) obj5, (e23.a) obj4, (p3.m) obj, p0.t(i15 | 1));
                break;
            case 18:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.j.b bVar = com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.j.f40667v;
                ((com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.j) obj7).u6((t2) obj3, (com.garmin.android.apps.connectmobile.pregnancytracking.ui.details.j.a) obj6, (String) obj5, (String) obj4, (p3.m) obj, p0.t(i15 | 1));
                break;
            case 19:
                ((Integer) obj2).getClass();
                fn1.c.a((km1.c) obj7, (DateTime) obj3, (sm1.s) obj6, (e23.a) obj5, (e23.a) obj4, (p3.m) obj, p0.t(i15 | 1));
                break;
            case 20:
                ((Integer) obj2).getClass();
                fn1.r.b((km1.c0) obj7, (km1.c) obj3, (sm1.s) obj6, (mc) obj4, (o53.b0) obj5, (p3.m) obj, p0.t(i15 | 1));
                break;
            case 21:
                ((Integer) obj2).getClass();
                g52.r.a((yd1.b) obj7, (d52.q) obj3, (o82.a) obj6, (n82.f) obj5, (e23.a) obj4, (p3.m) obj, p0.t(i15 | 1));
                break;
            case 22:
                ((Integer) obj2).getClass();
                gs.n.c((t2) obj7, (String) obj3, (String) obj6, (String) obj5, (h4.r) obj4, (p3.m) obj, p0.t(i15 | 1));
                break;
            case 23:
                ((Integer) obj2).intValue();
                gw0.j.d((i53.c) obj7, (i53.c) obj3, (b63.o) obj6, (i53.c) obj5, (e23.l) obj4, (p3.m) obj, p0.t(i15 | 1));
                break;
            case 24:
                ((Integer) obj2).getClass();
                h82.r rVar2 = h82.r.f82497a;
                ((h82.r) obj7).x((String) obj3, (String) obj6, (String) obj5, (e23.a) obj4, (p3.m) obj, p0.t(i15 | 1));
                break;
            case 25:
                ((Integer) obj2).getClass();
                hq.v.b((t2) obj7, (h4.r) obj3, (String) obj6, (s5.x0) obj5, (h2) obj4, (p3.m) obj, p0.t(i15 | 1));
                break;
            case 26:
                ((Integer) obj2).getClass();
                u7.a((j2) obj7, (j9) obj3, (ec) obj6, (rj) obj5, (e23.p) obj4, (p3.m) obj, p0.t(i15 | 1));
                break;
            case 27:
                Picture picture = (Picture) obj7;
                nr.p0 p0Var = (nr.p0) obj3;
                ds.n nVar = (ds.n) obj6;
                Bitmap bitmap = (Bitmap) obj5;
                ds.c cVar = (ds.c) obj4;
                p3.m mVar3 = (p3.m) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (mVar3.n(1 & iIntValue4, (iIntValue4 & 3) != 2)) {
                    x1 x1Var3 = p3.n.f135158a;
                    h4.r.a aVar5 = h4.r.S;
                    boolean zR = mVar3.r(picture) | mVar3.r(p0Var);
                    Object objQ3 = mVar3.q();
                    if (zR) {
                        objQ3 = new is.f(picture, p0Var, 0);
                        mVar3.K(objQ3);
                    } else {
                        aVar.getClass();
                        if (objQ3 == p3.m.a.f135155b) {
                            objQ3 = new is.f(picture, p0Var, 0);
                            mVar3.K(objQ3);
                        }
                    }
                    h4.r rVarE = l4.k.e(aVar5, (e23.l) objQ3);
                    boolean zB = mVar3.B(cVar) | mVar3.k(i15);
                    Object objQ4 = mVar3.q();
                    if (zB) {
                        objQ4 = new ag0.a(cVar, i15, 7);
                        mVar3.K(objQ4);
                    } else {
                        aVar.getClass();
                        if (objQ4 == p3.m.a.f135155b) {
                            objQ4 = new ag0.a(cVar, i15, 7);
                            mVar3.K(objQ4);
                        }
                    }
                    is.h.a(rVarE, nVar, bitmap, 64, p0Var, false, (e23.a) objQ4, mVar3, 196608, 0);
                } else {
                    mVar3.e();
                }
                break;
            case 28:
                ((Integer) obj2).getClass();
                k11.s.d((h4.r) obj7, (l11.i) obj3, (e23.l) obj6, (e23.l) obj5, (e23.a) obj4, (p3.m) obj, p0.t(i15 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                com.garmin.android.apps.connectmobile.developer.tutorials.a.C0558a c0558a = com.garmin.android.apps.connectmobile.developer.tutorials.a.f33708e;
                ((com.garmin.android.apps.connectmobile.developer.tutorials.a) obj7).v6((d90.j) obj3, (o90.a) obj6, (d90.i) obj5, (iz1.f) obj4, (p3.m) obj, p0.t(i15 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i14, int i15) {
        this.f1048a = i15;
        this.f1050c = obj;
        this.f1051d = obj2;
        this.f1052e = obj3;
        this.f1053f = obj4;
        this.f1054g = obj5;
        this.f1049b = i14;
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i14, int i15, int i16) {
        this.f1048a = i16;
        this.f1050c = obj;
        this.f1051d = obj2;
        this.f1052e = obj3;
        this.f1053f = obj4;
        this.f1054g = obj5;
        this.f1049b = i15;
    }

    public /* synthetic */ n(Object obj, Object obj2, int i14, Object obj3, Object obj4, Object obj5, int i15) {
        this.f1048a = i15;
        this.f1050c = obj;
        this.f1051d = obj2;
        this.f1049b = i14;
        this.f1052e = obj3;
        this.f1053f = obj4;
        this.f1054g = obj5;
    }

    public /* synthetic */ n(km1.c0 c0Var, km1.c cVar, sm1.s sVar, mc mcVar, o53.b0 b0Var, int i14) {
        this.f1048a = 20;
        this.f1050c = c0Var;
        this.f1051d = cVar;
        this.f1052e = sVar;
        this.f1054g = mcVar;
        this.f1053f = b0Var;
        this.f1049b = i14;
    }

    public /* synthetic */ n(o51.i iVar, int i14, n1 n1Var, n1 n1Var2, n1 n1Var3, p3.p1 p1Var) {
        this.f1048a = 14;
        this.f1050c = iVar;
        this.f1049b = i14;
        this.f1051d = n1Var;
        this.f1052e = n1Var2;
        this.f1053f = n1Var3;
        this.f1054g = p1Var;
    }

    public /* synthetic */ n(v0 v0Var, com.garmin.android.apps.connectmobile.workouts.presentation.details.f fVar, int i14, e23.l lVar, e23.a aVar, e23.a aVar2, int i15) {
        this.f1048a = 15;
        this.f1050c = v0Var;
        this.f1051d = fVar;
        this.f1049b = i14;
        this.f1052e = lVar;
        this.f1053f = aVar;
        this.f1054g = aVar2;
    }
}
