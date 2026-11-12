package mw0;

import am.j1;
import am.x0;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Parcelable;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b82.d2;
import c2.a0;
import c2.h2;
import c2.l2;
import c2.q2;
import c2.s2;
import c2.t;
import c2.t2;
import c2.u2;
import c2.x2;
import c2.y;
import c2.z;
import c22.l3;
import c22.m3;
import c22.s3;
import com.airbnb.lottie.LottieComposition;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO;
import dy1.v;
import e2.i0;
import et1.k1;
import f5.z0;
import h5.e0;
import i3.a1;
import i3.i7;
import i3.mc;
import i3.mh;
import i3.u;
import i3.ua;
import i3.v5;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.t1;
import l72.u0;
import l72.v2;
import lc.m0;
import li0.n0;
import li0.w;
import n70.z2;
import o4.m1;
import o53.b0;
import o72.a3;
import o72.b3;
import o72.i1;
import o72.j2;
import org.joda.time.DateTime;
import org.joda.time.Minutes;
import p005kotlin.Unit;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.d0;
import p13.h0;
import p13.j0;
import p13.x;
import p3.b4;
import p3.i2;
import p3.l1;
import p3.n1;
import p3.p0;
import p3.p1;
import p3.x1;
import p3.x3;
import rk0.c1;
import rk0.d1;
import s70.c0;
import sk0.h1;
import sk0.y0;
import tn2.s0;
import v62.i8;
import v62.v3;
import w5.f0;

/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class h implements e23.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f121266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f121267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f121268c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f121269d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f121270e;

    public /* synthetic */ h(Double d14, Double d15, e23.l lVar, String str) {
        this.f121266a = 11;
        this.f121267b = d14;
        this.f121268c = d15;
        this.f121270e = lVar;
        this.f121269d = str;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00e4  */
    /* JADX WARN: Multi-variable type inference failed */
    private final Object a(Object obj, Object obj2, Object obj3) {
        b0 b0Var = (b0) this.f121267b;
        mc mcVar = (mc) this.f121268c;
        p1 p1Var = (p1) this.f121269d;
        q72.b bVar = (q72.b) this.f121270e;
        h2 h2Var = (h2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        h2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(h2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarE = u1.n.e(c2.l.j(c2.l.x(h4.r.S, h2Var), h2Var), tn.k.a(d92.b.f58623a, mVar), m1.f128891a);
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarE, mVar);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.b0 b0Var2 = c2.b0.f22601a;
            boolean zR = mVar.r(b0Var) | mVar.B(mcVar) | mVar.B(p1Var);
            Object objQ = mVar.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zR) {
                objQ = new fo.j(b0Var, mcVar, p1Var, 15);
                mVar.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new fo.j(b0Var, mcVar, p1Var, 15);
                    mVar.K(objQ);
                }
            }
            e23.a aVar3 = (e23.a) objQ;
            Object objQ2 = mVar.q();
            aVar2.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ2 == c2565a) {
                objQ2 = p0.n(new r72.i(0, false, false, null, 15, null));
                mVar.K(objQ2);
            }
            p1 p1Var2 = (p1) objQ2;
            l72.s.f111232a.a(((r72.i) p1Var2.getF182175a()).f151179b, z3.f.c(-1372601332, new w(p1Var2, 23), mVar), mVar, 48);
            q72.h.f(bVar, (r72.i) p1Var2.getF182175a(), mVar, 0);
            if (((Boolean) p1Var.getF182175a()).booleanValue()) {
                mVar.C(21487221);
                l72.w wVar = l72.w.f111301a;
                z3.e eVarC = z3.f.c(1207079061, new p40.r(aVar3, 10), mVar);
                boolean zB = mVar.B(aVar3);
                Object objQ3 = mVar.q();
                if (zB || objQ3 == c2565a) {
                    objQ3 = new pf0.j(aVar3, 20);
                    mVar.K(objQ3);
                }
                wVar.f("Reports Settings", null, null, eVarC, (e23.a) objQ3, mcVar, false, new q51.a(7), z3.f.c(1163870379, new eb0.a(p1Var2, 14), mVar), mVar, 805309446, 198);
                mVar.f();
            } else {
                mVar.C(22161843);
                mVar.f();
            }
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0147  */
    private final Object b(Object obj, Object obj2, Object obj3) {
        z3.e eVar = (z3.e) this.f121267b;
        String str = (String) this.f121269d;
        b0 b0Var = (b0) this.f121268c;
        a1 a1Var = (a1) this.f121270e;
        a0 a0Var = (a0) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        q80.b bVar = q80.b.f143300a;
        a0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(a0Var) ? 4 : 2;
        }
        int i14 = iIntValue;
        if (mVar.n(i14 & 1, (i14 & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            h4.d.f81522a.getClass();
            h4.g.b bVar2 = h4.d.a.f81534l;
            c2.j.f22691a.getClass();
            c2.j.g gVar = c2.j.f22698h;
            h4.r.a aVar = h4.r.S;
            h4.r rVarE = u1.n.e(x2.f(aVar, 1.0f), p6.b.a(d92.b.f58623a, mVar), m1.f128891a);
            s2 s2VarA = q2.a(gVar, bVar2, mVar, 54);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarE, mVar);
            h5.g.V.getClass();
            e0.a aVar2 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar2);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, s2VarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar3 = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar3);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            u2 u2Var = u2.f22900a;
            d92.b.f58625c.getClass();
            int i15 = 1;
            h4.r rVarA = u2Var.a(c2.l.A(aVar, j92.b.f97899b.f97920e, 0.0f, 2), 1.0f, true);
            d92.b.f58624b.getClass();
            mh.c(str, rVarA, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97930g, mVar), mVar, 0, 0, 131068);
            boolean zR = mVar.r(b0Var) | mVar.B(a1Var);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new k1(b0Var, a1Var, i15);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new k1(b0Var, a1Var, i15);
                    mVar.K(objQ);
                }
            }
            u0.a(null, null, null, null, (e23.a) objQ, mVar, 0, 15);
            mVar.y();
            eVar.invoke(a0Var, mVar, Integer.valueOf(i14 & 14));
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object c(Object obj, Object obj2, Object obj3) {
        p1 p1Var = (p1) this.f121267b;
        i53.c cVar = (i53.c) this.f121268c;
        d1 d1Var = (d1) this.f121269d;
        i0 i0Var = (i0) this.f121270e;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((e2.d) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            h4.r rVarY = c2.l.y(aVar, j92.b.f97899b.f97920e);
            x0 x0Var = ((c1) p1Var.getF182175a()).f153084d;
            eb0.a aVar2 = new eb0.a(p1Var, 15);
            Object objQ = mVar.q();
            p3.m.f135153a.getClass();
            p3.m.a.C2565a c2565a = p3.m.a.f135155b;
            if (objQ == c2565a) {
                objQ = new rk0.n(3);
                mVar.K(objQ);
            }
            e23.l lVar = (e23.l) objQ;
            boolean zB = mVar.B(p1Var) | mVar.r(d1Var) | mVar.B(i0Var);
            Object objQ2 = mVar.q();
            if (zB || objQ2 == c2565a) {
                objQ2 = new p90.h(p1Var, 27, d1Var, i0Var);
                mVar.K(objQ2);
            }
            uk0.m.a(rVarY, x0Var, cVar, aVar2, lVar, null, (e23.l) objQ2, mVar, 24576);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        Double averageSleepScore;
        mm1.a aVar = (mm1.a) this.f121267b;
        b10.d dVar = (b10.d) this.f121268c;
        b10.b bVar = (b10.b) this.f121269d;
        ArrayList arrayList = (ArrayList) this.f121270e;
        t2 t2Var = (t2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            int iB = (aVar == null || (averageSleepScore = aVar.getAverageSleepScore()) == null) ? -1 : MathKt.b(averageSleepScore.doubleValue());
            l72.x0 x0Var = l72.x0.f111346a;
            String strI = rn1.j.i(mVar, iB);
            String string = dVar.f14215a.getString(R.string.lbl_average_stress_level_score);
            b92.a aVarB = rn1.c.b(bVar.b(iB));
            int i14 = iIntValue & 14;
            int i15 = b92.a.f16960b;
            x0Var.a((l72.x0.f111348c << 24) | i14, 60, aVarB, t2Var, null, null, strI, string, null, null, mVar);
            rn1.j.b(t2Var, (rl1.i) d0.E(arrayList), aVar, mVar, i14 | (mm1.a.f119613m << 6));
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:31:0x00de  */
    private final Object e(Object obj, Object obj2, Object obj3) {
        Object dVar;
        String str = (String) this.f121269d;
        e23.a aVar = (e23.a) this.f121267b;
        v vVar = (v) this.f121268c;
        e23.p pVar = (e23.p) this.f121270e;
        a0 a0Var = (a0) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        a0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(a0Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            Object[] objArr = {str};
            boolean zB = mVar.B(str);
            Object objQ = mVar.q();
            p3.m.a aVar2 = p3.m.f135153a;
            if (zB) {
                objQ = new a90.c(str, 13);
                mVar.K(objQ);
            } else {
                aVar2.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a90.c(str, 13);
                    mVar.K(objQ);
                }
            }
            p1 p1Var = (p1) d4.a.e(objArr, (e23.a) objQ, mVar, 0);
            String strQ = gl1.y.Q(mVar, R.string.strength_training_select_exercise);
            boolean zR = mVar.r(vVar) | mVar.B(p1Var) | mVar.B(pVar) | mVar.B(str) | mVar.B(aVar);
            Object objQ2 = mVar.q();
            if (zR) {
                dVar = new p50.d(5, vVar, aVar, pVar, str, p1Var);
                mVar.K(dVar);
            } else {
                aVar2.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    dVar = new p50.d(5, vVar, aVar, pVar, str, p1Var);
                    mVar.K(dVar);
                } else {
                    dVar = objQ2;
                }
            }
            rx1.l.a(0, aVar, (e23.a) dVar, null, strQ, null, mVar, false);
            h4.r rVarA = a0Var.a(x2.f(h4.r.S, 1.0f), 1.0f, false);
            boolean zR2 = mVar.r(vVar) | mVar.B(p1Var);
            Object objQ3 = mVar.q();
            if (zR2) {
                objQ3 = new rk0.g(8, vVar, p1Var);
                mVar.K(objQ3);
            } else {
                aVar2.getClass();
                if (objQ3 == p3.m.a.f135155b) {
                    objQ3 = new rk0.g(8, vVar, p1Var);
                    mVar.K(objQ3);
                }
            }
            e2.c.b(rVarA, null, null, null, null, null, false, null, (e23.l) objQ3, mVar, 0, 510);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:81:0x019d  */
    private final Object f(Object obj, Object obj2, Object obj3) {
        List<s12.b> listC;
        final long jE;
        s12.n nVar = (s12.n) this.f121267b;
        e23.a aVar = (e23.a) this.f121268c;
        Context context = (Context) this.f121269d;
        p1 p1Var = (p1) this.f121270e;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((a0) obj).getClass();
        final int i14 = 0;
        final int i15 = 1;
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            int i16 = 3;
            int i17 = 2;
            int i18 = -1;
            if (nVar.f155983a) {
                listC = j0.f134944a;
            } else {
                n0 n0Var = nVar.f155986d.f112656i;
                boolean zB = s3.b();
                if (n0Var != null ? s.g(n0Var.f112817b, Boolean.TRUE) : false) {
                    listC = p13.w.c(s12.b.f155928j);
                } else if ((n0Var != null ? n0Var.f112816a : null) != null) {
                    ArrayList arrayList = new ArrayList();
                    hi0.e.b bVar = n0Var.f112816a;
                    int i19 = bVar == null ? -1 : s12.n.a.f155988a[bVar.ordinal()];
                    if (i19 == 1 || i19 == 2) {
                        if (!zB) {
                            Boolean bool = n0Var.f112819d;
                            Boolean bool2 = Boolean.TRUE;
                            arrayList.add(s.g(bool, bool2) ? s12.b.f155923e : s12.b.f155922d);
                            arrayList.add(s.g(n0Var.f112818c, bool2) ? s12.b.f155926h : s12.b.f155925g);
                        }
                        arrayList.add(s12.b.f155927i);
                        if (!zB) {
                            if (n0Var.f112816a == hi0.e.b.MUTUAL) {
                                arrayList.add(s12.b.f155929k);
                            }
                            arrayList.add(s12.b.f155930l);
                        }
                    } else if (i19 != 3) {
                        arrayList.add(s12.b.f155927i);
                    } else {
                        arrayList.add(s12.b.f155927i);
                        if (!zB) {
                            arrayList.add(s12.b.f155929k);
                        }
                    }
                    listC = arrayList;
                } else {
                    listC = p13.w.c(s12.b.f155927i);
                }
            }
            ArrayList<s12.b> arrayListD1 = h0.d1(listC);
            if (nVar.f155984b) {
                int i24 = 0;
                for (s12.b bVar2 : listC) {
                    if (bVar2 == s12.b.f155922d || bVar2 == s12.b.f155923e) {
                        i18 = i24;
                        break;
                    }
                    i24++;
                }
                if (i18 >= 0) {
                    arrayListD1.add(i18 + 1, s12.b.f155924f);
                } else {
                    arrayListD1.add(0, s12.b.f155924f);
                }
            }
            for (final s12.b bVar3 : arrayListD1) {
                int i25 = s12.d.a.f155946a[bVar3.ordinal()];
                if (i25 == i15 || i25 == i17 || i25 == i16) {
                    mVar.C(-1443585174);
                    d92.b.f58623a.getClass();
                    jE = d92.b.a(mVar).k().e();
                    mVar.f();
                } else {
                    mVar.C(-1443583638);
                    d92.b.f58623a.getClass();
                    jE = d92.b.a(mVar).k().b();
                    mVar.f();
                }
                z3.e eVarC = z3.f.c(1620495251, new e23.p() { // from class: s12.c
                    @Override // e23.p
                    public final Object invoke(Object obj4, Object obj5) {
                        int i26 = i14;
                        b bVar4 = bVar3;
                        switch (i26) {
                            case 0:
                                p3.m mVar2 = (p3.m) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (mVar2.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    x1 x1Var2 = p3.n.f135158a;
                                    mh.c(gl1.y.Q(mVar2, bVar4.f155932a), null, jE, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar2, 0, 0, 262138);
                                } else {
                                    mVar2.e();
                                }
                                break;
                            default:
                                p3.m mVar3 = (p3.m) obj4;
                                int iIntValue3 = ((Integer) obj5).intValue();
                                if (mVar3.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                    x1 x1Var3 = p3.n.f135158a;
                                    u4.d dVar = bVar4.f155933b;
                                    if (dVar == null) {
                                        mVar3.C(1436662761);
                                        mVar3.f();
                                    } else {
                                        mVar3.C(1436662762);
                                        i7.b(dVar, null, null, jE, mVar3, 48, 4);
                                        mVar3.f();
                                    }
                                } else {
                                    mVar3.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, mVar);
                boolean zB2 = mVar.B(aVar) | mVar.k(bVar3.ordinal()) | mVar.r(nVar) | mVar.r(context);
                Object objQ = mVar.q();
                if (zB2) {
                    p50.d dVar = new p50.d((o13.h) aVar, (Object) bVar3, (Object) nVar, (Object) context, p1Var, 6);
                    mVar.K(dVar);
                    objQ = dVar;
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        p50.d dVar2 = new p50.d((o13.h) aVar, (Object) bVar3, (Object) nVar, (Object) context, p1Var, 6);
                        mVar.K(dVar2);
                        objQ = dVar2;
                    }
                }
                p3.m mVar2 = mVar;
                u.b(eVarC, (e23.a) objQ, null, z3.f.c(934125398, new e23.p() { // from class: s12.c
                    @Override // e23.p
                    public final Object invoke(Object obj4, Object obj5) {
                        int i26 = i15;
                        b bVar4 = bVar3;
                        switch (i26) {
                            case 0:
                                p3.m mVar3 = (p3.m) obj4;
                                int iIntValue2 = ((Integer) obj5).intValue();
                                if (mVar3.n(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    x1 x1Var2 = p3.n.f135158a;
                                    mh.c(gl1.y.Q(mVar3, bVar4.f155932a), null, jE, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, null, mVar3, 0, 0, 262138);
                                } else {
                                    mVar3.e();
                                }
                                break;
                            default:
                                p3.m mVar4 = (p3.m) obj4;
                                int iIntValue3 = ((Integer) obj5).intValue();
                                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                                    x1 x1Var3 = p3.n.f135158a;
                                    u4.d dVar3 = bVar4.f155933b;
                                    if (dVar3 == null) {
                                        mVar4.C(1436662761);
                                        mVar4.f();
                                    } else {
                                        mVar4.C(1436662762);
                                        i7.b(dVar3, null, null, jE, mVar4, 48, 4);
                                        mVar4.f();
                                    }
                                } else {
                                    mVar4.e();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, mVar), null, false, null, null, mVar2, 3078, 500);
                i15 = i15;
                i14 = i14;
                mVar = mVar2;
                i16 = i16;
                i17 = i17;
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:71:0x0267  */
    private final Object g(Object obj, Object obj2, Object obj3) {
        h4.r.a aVar;
        String str;
        String location;
        float f14;
        Long userLevel;
        com.garmin.android.apps.connectmobile.userprofile.model.j profileImageUrls;
        com.garmin.android.apps.connectmobile.userprofile.model.q qVar = (com.garmin.android.apps.connectmobile.userprofile.model.q) this.f121267b;
        com.garmin.android.apps.connectmobile.userprofile.i.d dVar = (com.garmin.android.apps.connectmobile.userprofile.i.d) this.f121268c;
        com.garmin.android.apps.connectmobile.userprofile.i iVar = (com.garmin.android.apps.connectmobile.userprofile.i) this.f121269d;
        e23.l lVar = (e23.l) this.f121270e;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((h4.r) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            float f15 = 96;
            g6.f.a aVar2 = g6.f.f75994b;
            hi0.a userFollowProfile = qVar.getUserFollowProfile();
            String str2 = (userFollowProfile == null || (profileImageUrls = userFollowProfile.getProfileImageUrls()) == null) ? null : profileImageUrls.f46878g;
            hi0.a userFollowProfile2 = qVar.getUserFollowProfile();
            b12.k.b(null, null, f15, new b12.b(str2, null, f12.u.a((int) ((userFollowProfile2 == null || (userLevel = userFollowProfile2.getUserLevel()) == null) ? 0L : userLevel.longValue())), null, null, 26, null), mVar, (b12.b.f14385f << 9) | 384, 19);
            h4.r.a aVar3 = h4.r.S;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(aVar3, mVar);
            h5.g.V.getClass();
            e0.a aVar4 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar4);
            } else {
                mVar.c();
            }
            h5.g.a.e eVar = h5.g.a.f81810g;
            b4.c(eVar, zVarA, mVar);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            h5.g.a.f fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            h4.r rVarF = x2.f(aVar3, 1.0f);
            s2 s2VarA = q2.a(c2.j.f22692b, h4.d.a.f81533k, mVar, 48);
            int iHashCode2 = Long.hashCode(mVar.getU());
            i2 i2VarX2 = mVar.x();
            h4.r rVarC2 = h4.k.c(rVarF, mVar);
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar4);
            } else {
                mVar.c();
            }
            b4.c(eVar, s2VarA, mVar);
            b4.c(c1623g, i2VarX2, mVar);
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                v.h.z(iHashCode2, mVar, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, mVar);
            u2 u2Var = u2.f22900a;
            hi0.a userFollowProfile3 = qVar.getUserFollowProfile();
            String fullName = userFollowProfile3 != null ? userFollowProfile3.getFullName() : null;
            if (fullName == null) {
                fullName = "";
            }
            long jA = com.nimbusds.jose.shaded.gson.internal.a.a(d92.b.f58623a, mVar);
            d92.b.f58624b.getClass();
            s5.x0 x0Var = j92.f.f97930g;
            f0.f182097b.getClass();
            mh.c(fullName, u2Var.a(aVar3, 1.0f, false), jA, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, s5.x0.a(x0Var, 0L, 0L, f0.f182104i, null, 0L, null, null, 0, o53.f0.B(28), null, null, 16646139), mVar, 0, 0, 131064);
            p3.m mVar2 = mVar;
            n0 n0Var = dVar.f46789b.f112656i;
            if (n0Var != null ? s.g(n0Var.f112819d, Boolean.TRUE) : false) {
                mVar2.C(1554970190);
                if (((g6.c) mVar2.A(t1.f91490h)).getF75992b() > 0.8f) {
                    f14 = 0;
                } else {
                    d92.b.f58625c.getClass();
                    f14 = j92.b.f97899b.f97916a;
                }
                float f16 = f14;
                s62.a.f157643a.getClass();
                u4.d dVarA = i8.a(t62.b.f162798a);
                long jX = com.nimbusds.jose.shaded.gson.internal.a.x(mVar2);
                d92.b.f58625c.getClass();
                aVar = aVar3;
                i7.b(dVarA, null, x2.q(c2.l.C(aVar3, j92.b.f97899b.f97918c, f16, 0.0f, 0.0f, 12), j92.b.f97901d.f97904c), jX, mVar2, 48, 0);
                mVar2 = mVar2;
                mVar2.f();
            } else {
                aVar = aVar3;
                mVar2.C(1555632319);
                mVar2.f();
            }
            mVar2.y();
            hi0.a userFollowProfile4 = qVar.getUserFollowProfile();
            if (userFollowProfile4 == null || (location = userFollowProfile4.getLocation()) == null) {
                str = null;
            } else {
                if (location.length() > 0) {
                    str = location;
                } else {
                    str = null;
                }
            }
            if (str == null) {
                mVar2.C(140660778);
                mVar2.f();
            } else {
                mVar2.C(140660779);
                p3.m mVar3 = mVar2;
                mh.c(str, null, d92.b.a(mVar2).k().b(), null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, s5.x0.a(j92.f.f97933j, 0L, 0L, null, null, 0L, null, null, 0, o53.f0.B(18), null, null, 16646143), mVar3, 0, 0, 131066);
                mVar2 = mVar3;
                Unit unit = Unit.INSTANCE;
                mVar2.f();
            }
            float f17 = ((Configuration) mVar2.A(AndroidCompositionLocals_androidKt.f6041a)).screenWidthDp;
            d92.b.f58625c.getClass();
            j92.e eVar2 = j92.b.f97899b;
            float f18 = eVar2.f97922g;
            float f19 = eVar2.f97921f;
            p3.m mVar4 = mVar2;
            s12.m.a(c2.l.C(aVar, 0.0f, eVar2.f97919d, 0.0f, 0.0f, 13), false, null, c2.j.i(eVar2.f97919d), c2.j.i(f19), z3.f.c(-1587626294, new ku1.l(qVar, (((g6.c) mVar2.A(t1.f91490h)).getF75992b() > 1.6f ? 1 : (((g6.c) mVar2.A(t1.f91490h)).getF75992b() == 1.6f ? 0 : -1)) >= 0 ? aVar : x2.w(aVar, 0.0f, ((((f17 - f18) - f15) - eVar2.f97920e) - f19) / 2, 1), dVar, iVar, lVar, 17), mVar2), mVar4, 196608, 6);
            mVar4.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x013d  */
    /* JADX WARN: Code duplicated, block: B:90:0x0177  */
    /* JADX WARN: Failed to calculate best type for var: r21v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v0 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v0 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v0 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v0 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v1 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v1 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v1 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v1 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v2 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v2 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v2 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r21v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r21v2 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r22v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v0 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r22v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v0 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r22v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v0 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r22v0 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v0 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r22v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v1 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r22v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v1 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r22v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v1 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r22v1 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v1 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r22v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v2 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r22v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v2 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r22v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v2 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r22v2 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r22v2 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v26 ??, new type: com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v26 ??, new type: com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v26 ??, new type: com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v26 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v26 ??, new type: com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v34 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v34 ??, new type: com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v34 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v34 ??, new type: com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v7 ??, new type: com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v7 ??, new type: com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v7 ??, new type: com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v7 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v7 ??, new type: com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v8 ??, new type: com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v8 ??, new type: com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v8 ??, new type: com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r3v8 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r3v8 ??, new type: com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v15 ??, new type: com.garmin.android.apps.connectmobile.courses.model.g
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v15 ??, new type: com.garmin.android.apps.connectmobile.courses.model.g
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v15 ??, new type: java.lang.Object
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v15 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v15 ??, new type: java.lang.Object
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v16 ??, new type: java.lang.Object
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v16 ??, new type: java.lang.Object
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v29 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v29 ??, new type: com.garmin.android.apps.connectmobile.courses.model.g
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v29 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v29 ??, new type: com.garmin.android.apps.connectmobile.courses.model.g
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v29 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v29 ??, new type: com.garmin.android.apps.connectmobile.courses.model.g
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r5v29 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r5v29 ??, new type: com.garmin.android.apps.connectmobile.courses.model.g
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v16 ??, new type: com.garmin.android.apps.connectmobile.courses.model.g
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v16 ??, new type: com.garmin.android.apps.connectmobile.courses.model.g
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v16 ??, new type: java.lang.Object
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v16 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v16 ??, new type: java.lang.Object
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v17 ??, new type: java.lang.Object
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v17 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v17 ??, new type: java.lang.Object
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v28 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v28 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v28 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v28 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v28 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v28 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v28 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v28 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v30 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v30 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v30 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v30 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v30 ??, new type: java.lang.String
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v33 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v33 ??, new type: com.garmin.android.apps.connectmobile.courses.model.g
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:681)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v33 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v33 ??, new type: com.garmin.android.apps.connectmobile.courses.model.g
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 6 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v33 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v33 ??, new type: com.garmin.android.apps.connectmobile.courses.model.g
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 8 more
     */
    /* JADX WARN: Failed to calculate best type for var: r6v33 ??
    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r6v33 ??, new type: com.garmin.android.apps.connectmobile.courses.model.g
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$1(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
    	... 7 more
     */
    /* JADX WARN: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: TypeSearchVarInfo not found in map for var: r11v0 ??
    	at jadx.core.dex.visitors.typeinference.TypeSearchState.getVarInfo(TypeSearchState.java:34)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.lambda$resolveIndependentVariables$1(TypeSearch.java:173)
    	at java.base/java.util.stream.MatchOps$1MatchSink.accept(MatchOps.java:90)
    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.test(ReferencePipeline.java:306)
    	at java.base/java.util.stream.MatchOps$1MatchSink.accept(MatchOps.java:90)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1701)
    	at java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:147)
    	at java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:588)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:574)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:230)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:196)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
    	at java.base/java.util.stream.ReferencePipeline.allMatch(ReferencePipeline.java:673)
    	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.accept(ReferencePipeline.java:291)
    	at java.base/java.util.ArrayList$ArrayListSpliterator.tryAdvance(ArrayList.java:1701)
    	at java.base/java.util.stream.ReferencePipeline.forEachWithCancel(ReferencePipeline.java:147)
    	at java.base/java.util.stream.AbstractPipeline.copyIntoWithCancel(AbstractPipeline.java:588)
    	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:574)
    	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:230)
    	at java.base/java.util.stream.MatchOps$MatchOp.evaluateSequential(MatchOps.java:196)
    	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
    	at java.base/java.util.stream.ReferencePipeline.allMatch(ReferencePipeline.java:673)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.resolveIndependentVariables(TypeSearch.java:173)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:63)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.runMultiVariableSearch(FixTypesVisitor.java:119)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX WARN: Type inference failed for: r21v0 */
    /* JADX WARN: Type inference failed for: r21v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r22v0 */
    /* JADX WARN: Type inference failed for: r22v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r22v2 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [com.garmin.android.apps.connectmobile.courses.model.GeoPointDTO] */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v29, types: [com.garmin.android.apps.connectmobile.courses.model.g] */
    /* JADX WARN: Type inference failed for: r5v39 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v33, types: [com.garmin.android.apps.connectmobile.courses.model.g] */
    /* JADX WARN: Type inference failed for: r6v40 */
    private final Object h(Object obj, Object obj2, Object obj3) {
        boolean z14;
        boolean z15;
        boolean z16;
        ?? r14;
        ?? r15;
        ?? r16;
        long j8;
        ?? B1;
        Parcelable parcelable;
        boolean z17;
        boolean z18;
        t50.e eVar = (t50.e) this.f121267b;
        e23.l lVar = (e23.l) this.f121268c;
        Context context = (Context) this.f121269d;
        n1 n1Var = (n1) this.f121270e;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            w20.a aVar = eVar.f162543c;
            com.garmin.android.apps.connectmobile.courses.model.e eVar2 = aVar != null ? aVar.f181476a : null;
            if (eVar2 != null) {
                mVar.C(-1632932523);
                String str = eVar2.courseId;
                boolean z19 = str == null || str.length() == 0 || (eVar2.c0() && !eVar2.f0());
                h4.r.a aVar2 = h4.r.S;
                c2.j.f22691a.getClass();
                c2.j.k kVar = c2.j.f22694d;
                h4.d.f81522a.getClass();
                z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
                int iHashCode = Long.hashCode(mVar.getU());
                i2 i2VarX = mVar.x();
                h4.r rVarC = h4.k.c(aVar2, mVar);
                h5.g.V.getClass();
                e0.a aVar3 = h5.g.a.f81805b;
                if (mVar.F() == null) {
                    p0.l();
                    throw r11;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar3);
                } else {
                    mVar.c();
                }
                b4.c(h5.g.a.f81810g, zVarA, mVar);
                b4.c(h5.g.a.f81809f, i2VarX, mVar);
                h5.g.a.b bVar = h5.g.a.f81813j;
                if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar, iHashCode, bVar);
                }
                b4.c(h5.g.a.f81807d, rVarC, mVar);
                c2.b0 b0Var = c2.b0.f22601a;
                List<com.garmin.android.apps.connectmobile.courses.model.g> listJ = eVar2.j();
                if (listJ == null) {
                    listJ = j0.f134944a;
                }
                if (listJ != null && listJ.isEmpty()) {
                    z14 = false;
                    break;
                }
                Iterator it = listJ.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z14 = false;
                        break;
                    }
                    Integer num = ((com.garmin.android.apps.connectmobile.courses.model.g) it.next()).restDuration;
                    if (num != null && num.intValue() > 0) {
                        z14 = true;
                        break;
                    }
                }
                Integer cutoffDuration = eVar2.getCutoffDuration();
                if ((cutoffDuration != null ? cutoffDuration.intValue() : -1) > 0) {
                    z15 = true;
                } else {
                    if (listJ != null && listJ.isEmpty()) {
                        z18 = false;
                        break;
                    }
                    Iterator it3 = listJ.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z18 = false;
                            break;
                        }
                        Integer num2 = ((com.garmin.android.apps.connectmobile.courses.model.g) it3.next()).cutoffDuration;
                        if (num2 != null && num2.intValue() > 0) {
                            z18 = true;
                            break;
                        }
                    }
                    if (z18) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                }
                if (!g22.n.d(eVar2.getStartNote()) && !g22.n.d(eVar2.getFinishNote())) {
                    if (listJ != null && listJ.isEmpty()) {
                        z17 = false;
                        break;
                    }
                    Iterator it4 = listJ.iterator();
                    while (true) {
                        if (!it4.hasNext()) {
                            z17 = false;
                            break;
                        }
                        if (g22.n.d(((com.garmin.android.apps.connectmobile.courses.model.g) it4.next()).note)) {
                            z17 = true;
                            break;
                        }
                    }
                    z16 = z17;
                }
                t50.d dVar = new t50.d(z19, z14, z15, z16);
                Object objQ = mVar.q();
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new a3(n1Var, 8);
                    mVar.K(objQ);
                }
                s50.d.a(dVar, lVar, (e23.l) objQ, mVar, 384);
                context.getClass();
                GeoPointDTO geoPointDTOD = eVar2.D();
                if (geoPointDTOD == null) {
                    List<GeoPointDTO> list = eVar2.geoPoints;
                    geoPointDTOD = list != null ? (GeoPointDTO) h0.d0(list) : null;
                }
                if (geoPointDTOD != null) {
                    ?? gVar = new com.garmin.android.apps.connectmobile.courses.model.g(geoPointDTOD, context.getString(R.string.course_start));
                    gVar.note = eVar2.getStartNote();
                    gVar.derivedElevation = geoPointDTOD.elevation;
                    gVar.m(com.garmin.android.apps.connectmobile.courses.model.f.COURSE_START.f32922a);
                    gVar.k();
                    r14 = gVar;
                } else {
                    r14 = r11;
                }
                List<GeoPointDTO> list2 = eVar2.geoPoints;
                if (list2 != null) {
                    parcelable = (GeoPointDTO) h0.n0(list2);
                } else {
                    r15 = r11;
                }
                if (r15 != 0) {
                    r15 = parcelable;
                    ?? gVar2 = new com.garmin.android.apps.connectmobile.courses.model.g((GeoPointDTO) r15, context.getString(R.string.course_finish));
                    gVar2.note = eVar2.getFinishNote();
                    gVar2.derivedElevation = r15.elevation;
                    gVar2.m(com.garmin.android.apps.connectmobile.courses.model.f.COURSE_FINISH.f32922a);
                    gVar2.cutoffDuration = eVar2.getCutoffDuration();
                    gVar2.k();
                    r16 = gVar2;
                } else {
                    r15 = parcelable;
                    r16 = r11;
                }
                List listL = x.l(r14);
                Iterable iterableK = eVar2.k();
                if (iterableK == null) {
                    iterableK = j0.f134944a;
                }
                ArrayList arrayListC0 = h0.C0(h0.C0(listL, iterableK), x.l(r16));
                List<com.garmin.android.apps.connectmobile.courses.model.g> listN0 = h0.N0(arrayListC0, new s50.c.e());
                ArrayList arrayList = new ArrayList(p13.y.r(listN0, 10));
                for (com.garmin.android.apps.connectmobile.courses.model.g gVar3 : listN0) {
                    f12.l.f68084a.getClass();
                    boolean zY = f12.l.a.a().y();
                    gVar3.getClass();
                    com.garmin.android.apps.connectmobile.courses.model.f.a aVar4 = com.garmin.android.apps.connectmobile.courses.model.f.f32898h;
                    String coursePointType = gVar3.getCoursePointType();
                    aVar4.getClass();
                    com.garmin.android.apps.connectmobile.courses.model.f fVarA = com.garmin.android.apps.connectmobile.courses.model.f.a.a(coursePointType);
                    Long coursePointId = gVar3.getCoursePointId();
                    String strA = gVar3.name;
                    if (strA == null) {
                        strA = dh.b.A(context, fVarA.a());
                    }
                    String str2 = strA;
                    l3.a aVar5 = l3.f23124b;
                    Double distance = gVar3.getDistance();
                    double dDoubleValue = distance != null ? distance.doubleValue() : 0.0d;
                    m3 m3Var = zY ? m3.KILOMETER : m3.MILE;
                    double d14 = dDoubleValue;
                    DecimalFormat decimalFormat = l3.f23129g;
                    aVar5.getClass();
                    String strO = l3.a.O(context, d14, m3Var, decimalFormat, true);
                    String str3 = gVar3.note;
                    Integer num3 = gVar3.restDuration;
                    if (num3 != null) {
                        j8 = 1000;
                        B1 = l3.a.b1(((long) num3.intValue()) * 1000);
                    } else {
                        j8 = 1000;
                        B1 = r11;
                    }
                    Integer num4 = gVar3.cutoffDuration;
                    arrayList.add(new q40.a(coursePointId, str2, fVarA, strO, str3, B1, num4 != null ? l3.a.b1(((long) num4.intValue()) * j8) : r11));
                }
                i53.f fVarJ = i53.a.j(arrayList);
                boolean zR = mVar.r(arrayListC0) | mVar.B(lVar);
                Object objQ2 = mVar.q();
                if (zR || objQ2 == p3.m.a.f135155b) {
                    objQ2 = new gr2.a(arrayListC0, lVar, 2);
                    mVar.K(objQ2);
                }
                e23.l lVar2 = (e23.l) objQ2;
                boolean zB = mVar.B(lVar);
                Object objQ3 = mVar.q();
                if (zB || objQ3 == p3.m.a.f135155b) {
                    objQ3 = new me2.d(lVar, 26);
                    mVar.K(objQ3);
                }
                p40.e0.a(0, (e23.a) objQ3, lVar2, fVarJ, mVar, z19);
                mVar.y();
                mVar.f();
            } else {
                mVar.C(-1631079715);
                mVar.f();
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0066  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ac  */
    private final Object i(Object obj, Object obj2, Object obj3) {
        p3.m.a aVar;
        List list = (List) this.f121267b;
        e23.a aVar2 = (e23.a) this.f121268c;
        e23.l lVar = (e23.l) this.f121269d;
        p1 p1Var = (p1) this.f121270e;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            mVar.C(963759995);
            Iterator it = list.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                aVar = p3.m.f135153a;
                if (!zHasNext) {
                    break;
                }
                z2.b bVar = (z2.b) it.next();
                String str = bVar.f124812b;
                boolean z14 = bVar.f124814d;
                jc0.c cVar = bVar.f124815e;
                boolean zB = mVar.B(lVar) | mVar.r(bVar);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new q42.v(lVar, 21, bVar, p1Var);
                    mVar.K(objQ);
                } else {
                    aVar.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new q42.v(lVar, 21, bVar, p1Var);
                        mVar.K(objQ);
                    }
                }
                c0.e(str, z14, cVar, (e23.a) objQ, mVar, 0);
            }
            mVar.f();
            h4.r.a aVar3 = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            v5.a(0.0f, 0, 2, r1.q2.f(mVar), c2.l.A(aVar3, 0.0f, j92.b.f97899b.f97918c, 1), mVar);
            boolean zB2 = mVar.B(aVar2);
            Object objQ2 = mVar.q();
            if (zB2) {
                objQ2 = new p40.j0(aVar2, p1Var, 6);
                mVar.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new p40.j0(aVar2, p1Var, 6);
                    mVar.K(objQ2);
                }
            }
            c0.b((e23.a) objQ2, mVar, 0);
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:25:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:26:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:31:0x0118  */
    /* JADX WARN: Code duplicated, block: B:34:0x017a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0183  */
    /* JADX WARN: Code duplicated, block: B:37:0x0187  */
    /* JADX WARN: Code duplicated, block: B:42:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:45:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:47:0x01d7  */
    /* JADX WARN: Code duplicated, block: B:48:0x01db  */
    /* JADX WARN: Code duplicated, block: B:53:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:56:0x020f  */
    /* JADX WARN: Code duplicated, block: B:57:0x021d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0268  */
    /* JADX WARN: Code duplicated, block: B:61:0x0274  */
    /* JADX WARN: Code duplicated, block: B:63:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:65:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:67:0x02d3  */
    private final Object j(Object obj, Object obj2, Object obj3) {
        yg2.h0 h0Var;
        h5.g.a.f fVar;
        c2.b0 b0Var;
        s2 s2VarA;
        int iHashCode;
        i2 i2VarX;
        h4.r rVarC;
        z0 z0VarD;
        int iHashCode2;
        i2 i2VarX2;
        h4.r rVarC2;
        z zVarA;
        int iHashCode3;
        i2 i2VarX3;
        h4.r rVarC3;
        j92.e eVar;
        boolean z14;
        LottieComposition lottieComposition = (LottieComposition) this.f121267b;
        yg2.h0 h0Var2 = (yg2.h0) this.f121268c;
        String str = (String) this.f121269d;
        s5.c cVar = (s5.c) this.f121270e;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            h4.r.a aVar = h4.r.S;
            d92.b.f58623a.getClass();
            d92.b.f58625c.getClass();
            j92.e eVar2 = j92.b.f97899b;
            h4.r rVarC4 = x2.c(c2.l.y(aVar, eVar2.f97920e), 1.0f);
            h4.d.f81522a.getClass();
            h4.g.a aVar2 = h4.d.a.f81537o;
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            z zVarA2 = y.a(kVar, aVar2, mVar, 48);
            int iHashCode4 = Long.hashCode(mVar.getU());
            i2 i2VarX4 = mVar.x();
            h4.r rVarC5 = h4.k.c(rVarC4, mVar);
            h5.g.V.getClass();
            e0.a aVar3 = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar3);
            } else {
                mVar.c();
            }
            h5.g.a.e eVar3 = h5.g.a.f81810g;
            b4.c(eVar3, zVarA2, mVar);
            h5.g.a.C1623g c1623g = h5.g.a.f81809f;
            b4.c(c1623g, i2VarX4, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT()) {
                h0Var = h0Var2;
            } else {
                h0Var = h0Var2;
                if (!s.g(mVar.q(), Integer.valueOf(iHashCode4))) {
                }
                fVar = h5.g.a.f81807d;
                b4.c(fVar, rVarC5, mVar);
                b0Var = c2.b0.f22601a;
                h4.r rVarF = x2.f(aVar, 1.0f);
                s2VarA = q2.a(c2.j.f22693c, h4.d.a.f81533k, mVar, 6);
                iHashCode = Long.hashCode(mVar.getU());
                i2VarX = mVar.x();
                rVarC = h4.k.c(rVarF, mVar);
                if (mVar.F() != null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar3);
                } else {
                    mVar.c();
                }
                b4.c(eVar3, s2VarA, mVar);
                b4.c(c1623g, i2VarX, mVar);
                if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                    v.h.z(iHashCode, mVar, iHashCode, bVar);
                }
                b4.c(fVar, rVarC, mVar);
                u2 u2Var = u2.f22900a;
                s62.a.f157643a.getClass();
                i7.b(v3.a(t62.b.f162798a), "", x2.q(aVar, j92.b.f97901d.f97904c), sn.a.b(mVar), mVar, 48, 0);
                mVar.y();
                h4.r rVarD = x2.d(aVar, 1.0f);
                z0VarD = c2.q.d(h4.d.a.f81525c, false);
                iHashCode2 = Long.hashCode(mVar.getU());
                i2VarX2 = mVar.x();
                rVarC2 = h4.k.c(rVarD, mVar);
                if (mVar.F() != null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar3);
                } else {
                    mVar.c();
                }
                b4.c(eVar3, z0VarD, mVar);
                b4.c(c1623g, i2VarX2, mVar);
                if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode2))) {
                    v.h.z(iHashCode2, mVar, iHashCode2, bVar);
                }
                b4.c(fVar, rVarC2, mVar);
                c2.u uVar = c2.u.f22885a;
                h4.r rVarF2 = x2.f(aVar, 1.0f);
                zVarA = y.a(kVar, aVar2, mVar, 48);
                iHashCode3 = Long.hashCode(mVar.getU());
                i2VarX3 = mVar.x();
                rVarC3 = h4.k.c(rVarF2, mVar);
                if (mVar.F() != null) {
                    p0.l();
                    throw null;
                }
                mVar.z();
                if (mVar.getT()) {
                    mVar.M(aVar3);
                } else {
                    mVar.c();
                }
                b4.c(eVar3, zVarA, mVar);
                b4.c(c1623g, i2VarX3, mVar);
                if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode3))) {
                    v.h.z(iHashCode3, mVar, iHashCode3, bVar);
                }
                b4.c(fVar, rVarC3, mVar);
                sg2.e.f159224c.getClass();
                sg2.d.a(lottieComposition, sg2.e.a.a(h0Var), mVar, 0);
                if (str == null) {
                    mVar.C(145439759);
                    mVar.f();
                    eVar = eVar2;
                    z14 = true;
                } else {
                    mVar.C(145439760);
                    eVar = eVar2;
                    c2.l.f(x2.k(aVar, eVar.f97920e), mVar);
                    d92.b.f58624b.getClass();
                    z14 = true;
                    mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97929f, mVar), mVar, 0, 0, 131070);
                    Unit unit = Unit.INSTANCE;
                    mVar.f();
                }
                if (cVar == null) {
                    mVar = mVar;
                    mVar.C(145837923);
                    mVar.f();
                } else {
                    mVar = mVar;
                    mVar.C(145837924);
                    c2.l.f(x2.k(aVar, eVar.f97918c), mVar);
                    d92.b.f58624b.getClass();
                    p3.m mVar2 = mVar;
                    mh.d(cVar, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, d92.c.b(j92.f.f97930g, mVar), mVar2, 0, 0, 262142);
                    mVar = mVar2;
                    Unit unit2 = Unit.INSTANCE;
                    mVar.f();
                }
                c2.l.f(b0Var.a(aVar, 1.0f, z14), mVar);
                mVar.y();
                mVar.y();
                mVar.y();
            }
            v.h.z(iHashCode4, mVar, iHashCode4, bVar);
            fVar = h5.g.a.f81807d;
            b4.c(fVar, rVarC5, mVar);
            b0Var = c2.b0.f22601a;
            h4.r rVarF3 = x2.f(aVar, 1.0f);
            s2VarA = q2.a(c2.j.f22693c, h4.d.a.f81533k, mVar, 6);
            iHashCode = Long.hashCode(mVar.getU());
            i2VarX = mVar.x();
            rVarC = h4.k.c(rVarF3, mVar);
            if (mVar.F() != null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar3);
            } else {
                mVar.c();
            }
            b4.c(eVar3, s2VarA, mVar);
            b4.c(c1623g, i2VarX, mVar);
            if (mVar.getT()) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            } else {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(fVar, rVarC, mVar);
            u2 u2Var2 = u2.f22900a;
            s62.a.f157643a.getClass();
            i7.b(v3.a(t62.b.f162798a), "", x2.q(aVar, j92.b.f97901d.f97904c), sn.a.b(mVar), mVar, 48, 0);
            mVar.y();
            h4.r rVarD2 = x2.d(aVar, 1.0f);
            z0VarD = c2.q.d(h4.d.a.f81525c, false);
            iHashCode2 = Long.hashCode(mVar.getU());
            i2VarX2 = mVar.x();
            rVarC2 = h4.k.c(rVarD2, mVar);
            if (mVar.F() != null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar3);
            } else {
                mVar.c();
            }
            b4.c(eVar3, z0VarD, mVar);
            b4.c(c1623g, i2VarX2, mVar);
            if (mVar.getT()) {
                v.h.z(iHashCode2, mVar, iHashCode2, bVar);
            } else {
                v.h.z(iHashCode2, mVar, iHashCode2, bVar);
            }
            b4.c(fVar, rVarC2, mVar);
            c2.u uVar2 = c2.u.f22885a;
            h4.r rVarF4 = x2.f(aVar, 1.0f);
            zVarA = y.a(kVar, aVar2, mVar, 48);
            iHashCode3 = Long.hashCode(mVar.getU());
            i2VarX3 = mVar.x();
            rVarC3 = h4.k.c(rVarF4, mVar);
            if (mVar.F() != null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar3);
            } else {
                mVar.c();
            }
            b4.c(eVar3, zVarA, mVar);
            b4.c(c1623g, i2VarX3, mVar);
            if (mVar.getT()) {
                v.h.z(iHashCode3, mVar, iHashCode3, bVar);
            } else {
                v.h.z(iHashCode3, mVar, iHashCode3, bVar);
            }
            b4.c(fVar, rVarC3, mVar);
            sg2.e.f159224c.getClass();
            sg2.d.a(lottieComposition, sg2.e.a.a(h0Var), mVar, 0);
            if (str == null) {
                mVar.C(145439759);
                mVar.f();
                eVar = eVar2;
                z14 = true;
            } else {
                mVar.C(145439760);
                eVar = eVar2;
                c2.l.f(x2.k(aVar, eVar.f97920e), mVar);
                d92.b.f58624b.getClass();
                z14 = true;
                mh.c(str, null, 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, d92.c.b(j92.f.f97929f, mVar), mVar, 0, 0, 131070);
                Unit unit3 = Unit.INSTANCE;
                mVar.f();
            }
            if (cVar == null) {
                mVar = mVar;
                mVar.C(145837923);
                mVar.f();
            } else {
                mVar = mVar;
                mVar.C(145837924);
                c2.l.f(x2.k(aVar, eVar.f97918c), mVar);
                d92.b.f58624b.getClass();
                p3.m mVar3 = mVar;
                mh.d(cVar, null, 0L, 0L, 0L, null, 0L, 0, false, 0, 0, null, null, d92.c.b(j92.f.f97930g, mVar), mVar3, 0, 0, 262142);
                mVar = mVar3;
                Unit unit4 = Unit.INSTANCE;
                mVar.f();
            }
            c2.l.f(b0Var.a(aVar, 1.0f, z14), mVar);
            mVar.y();
            mVar.y();
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object k(Object obj, Object obj2, Object obj3) {
        h1 h1Var = (h1) this.f121267b;
        e23.a aVar = (e23.a) this.f121268c;
        e23.a aVar2 = (e23.a) this.f121269d;
        p1 p1Var = (p1) this.f121270e;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((t) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            y0.a(x2.d(h4.r.S, 1.0f), null, (sk0.z0) p1Var.getF182175a(), h1Var, aVar, aVar2, mVar, 54);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final Object l(Object obj, Object obj2, Object obj3) {
        pm1.f fVar = (pm1.f) this.f121267b;
        Context context = (Context) this.f121268c;
        sm1.s sVar = (sm1.s) this.f121269d;
        pm1.g gVar = (pm1.g) this.f121270e;
        p3.m mVar = (p3.m) obj2;
        ((Integer) obj3).getClass();
        ((r1.e0) obj).getClass();
        x1 x1Var = p3.n.f135158a;
        Object objQ = mVar.q();
        p3.m.f135153a.getClass();
        p3.m.a.C2565a c2565a = p3.m.a.f135155b;
        String strH = null;
        if (objQ == c2565a) {
            objQ = p0.n(null);
            mVar.K(objQ);
        }
        p1 p1Var = (p1) objQ;
        fVar.e(new sm1.r.g(p1Var));
        g82.c cVar = g82.c.f76436a;
        g82.c.b bVar = new g82.c.b(R.drawable.skin_temp_onboarding, null, null, 6, null);
        String strQ = gl1.y.Q(mVar, R.string.lbl_know_your_body_better);
        String strQ2 = gl1.y.Q(mVar, R.string.msg_smartwatch_detects_breathing_variations);
        String strH2 = ((hc1.b) p1Var.getF182175a()) != null ? sn.a.h(mVar, 1352112582, R.string.pulse_ox_settings_title, mVar) : sn.a.h(mVar, 1352213332, R.string.lbl_close, mVar);
        boolean zR = mVar.r(fVar) | mVar.r(context) | mVar.r(sVar) | mVar.r(gVar);
        Object objQ2 = mVar.q();
        if (zR || objQ2 == c2565a) {
            p50.d dVar = new p50.d(10, sVar, gVar, fVar, context, p1Var);
            mVar.K(dVar);
            objQ2 = dVar;
        }
        e23.a aVar = (e23.a) objQ2;
        if (((hc1.b) p1Var.getF182175a()) != null) {
            strH = sn.a.h(mVar, 1290574718, R.string.lbl_close, mVar);
        } else {
            mVar.C(1353149345);
            mVar.f();
        }
        String str = strH;
        boolean zR2 = mVar.r(sVar) | mVar.r(gVar);
        Object objQ3 = mVar.q();
        if (zR2 || objQ3 == c2565a) {
            objQ3 = new sm1.p(sVar, gVar, 0);
            mVar.K(objQ3);
        }
        e23.a aVar2 = (e23.a) objQ3;
        Object objQ4 = mVar.q();
        if (objQ4 == c2565a) {
            objQ4 = new sk0.i0(12);
            mVar.K(objQ4);
        }
        cVar.c(bVar, strQ, strQ2, 0, strH2, aVar, str, aVar2, false, (e23.a) objQ4, mVar, 905969664, 8);
        return Unit.INSTANCE;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f121269d;
        String str2 = (String) this.f121267b;
        pq1.d dVar = (pq1.d) this.f121268c;
        String str3 = (String) this.f121270e;
        t2 t2Var = (t2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        t2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(t2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            l72.x0 x0Var = l72.x0.f111346a;
            String strQ = gl1.y.Q(mVar, R.string.lbl_distance);
            dVar.getClass();
            Context context = dVar.f139569a;
            b92.a aVarA = wz1.a.a(context.getString(R.string.lbl_distance_value, xy2.b.O(context, str)) + str2);
            int i14 = b92.a.f16960b;
            int i15 = (l72.x0.f111348c << 24) | (iIntValue & 14);
            x0Var.a(i15, 52, aVarA, t2Var, null, null, str, strQ, str2, null, mVar);
            x0Var.a(i15, 60, wz1.a.a(context.getString(R.string.lbl_calories_word_value, xy2.b.O(context, str3))), t2Var, null, null, str3, gl1.y.Q(mVar, R.string.lbl_calories), null, null, mVar);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object o(Object obj, Object obj2, Object obj3) {
        String str = (String) this.f121269d;
        tb0.x xVar = (tb0.x) this.f121267b;
        ub0.l lVar = (ub0.l) this.f121268c;
        e23.l lVar2 = (e23.l) this.f121270e;
        a0 a0Var = (a0) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        a0Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(a0Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            tb0.l.b(a0Var, str, xVar, lVar, lVar2, mVar, iIntValue & 14);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:40:0x019b  */
    private final Object q(Object obj, Object obj2, Object obj3) {
        String strA;
        List list = (List) this.f121267b;
        yw.b bVar = (yw.b) this.f121268c;
        Context context = (Context) this.f121269d;
        e23.l lVar = (e23.l) this.f121270e;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((a0) obj).getClass();
        int i14 = 0;
        int i15 = 1;
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            h4.r rVarE = u1.n.e(h4.r.S, p6.b.a(d92.b.f58623a, mVar), m1.f128891a);
            d92.b.f58625c.getClass();
            float f14 = j92.b.f97899b.f97920e;
            h4.r rVarS = c2.l.s(c2.l.C(rVarE, f14, 0.0f, f14, 0.0f, 10));
            c2.j.f22691a.getClass();
            c2.j.k kVar = c2.j.f22694d;
            h4.d.f81522a.getClass();
            z zVarA = y.a(kVar, h4.d.a.f81536n, mVar, 0);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarS, mVar);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, zVarA, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar2 = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar2);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.b0 b0Var = c2.b0.f22601a;
            mVar.C(1503586796);
            for (Object obj4 : list) {
                int i16 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                pw.a aVar2 = (pw.a) obj4;
                l22.a aVar3 = bVar.f199875a;
                context.getClass();
                aVar2.getClass();
                Double systolic = aVar2.getSystolic();
                Integer numValueOf = systolic != null ? Integer.valueOf((int) systolic.doubleValue()) : null;
                Double diastolic = aVar2.getDiastolic();
                String str = numValueOf + "/" + (diastolic != null ? Integer.valueOf((int) diastolic.doubleValue()) : null);
                long jK = aVar2.k();
                String strValueOf = String.valueOf(i14);
                if (jK > 0) {
                    strA = DateFormat.getTimeFormat(context).format(new Date(jK));
                    strA.getClass();
                } else {
                    strA = aVar3.a(R.string.lbl_reading_index, strValueOf);
                }
                String upperCase = aVar3.a(R.string.string_line_string_pattern, str, strA).toUpperCase(Locale.ROOT);
                upperCase.getClass();
                d92.b.f58623a.getClass();
                d92.b.f58624b.getClass();
                s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar);
                g6.f.a aVar4 = g6.f.f75994b;
                h4.r rVarF = x2.f(c2.l.A(h4.r.S, 0.0f, 8, i15), 1.0f);
                boolean zB = mVar.B(lVar) | mVar.r(aVar2);
                Object objQ = mVar.q();
                if (zB) {
                    objQ = new tb0.d(11, lVar, aVar2);
                    mVar.K(objQ);
                } else {
                    p3.m.f135153a.getClass();
                    if (objQ == p3.m.a.f135155b) {
                        objQ = new tb0.d(11, lVar, aVar2);
                        mVar.K(objQ);
                    }
                }
                p3.m mVar2 = mVar;
                mh.c(upperCase, u1.w.d(rVarF, false, null, null, (e23.a) objQ, 15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar2, 0, 0, 131068);
                i15 = i15;
                mVar = mVar2;
                i14 = i16;
            }
            p3.m mVar3 = mVar;
            mVar3.f();
            mVar3.y();
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0063  */
    /* JADX WARN: Code duplicated, block: B:24:0x007f  */
    private final Object r(Object obj, Object obj2, Object obj3) {
        e23.l lVar = (e23.l) this.f121267b;
        e23.l lVar2 = (e23.l) this.f121268c;
        p1 p1Var = (p1) this.f121269d;
        x3 x3Var = (x3) this.f121270e;
        h2 h2Var = (h2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        h2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(h2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            p1Var.setValue(h2Var);
            h4.r rVarX = c2.l.x(h4.r.S, h2Var);
            String str = (String) x3Var.getF182175a();
            boolean zB = mVar.B(lVar);
            Object objQ = mVar.q();
            p3.m.a aVar = p3.m.f135153a;
            if (zB) {
                objQ = new ub0.h(lVar, 2);
                mVar.K(objQ);
            } else {
                aVar.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ub0.h(lVar, 2);
                    mVar.K(objQ);
                }
            }
            e23.a aVar2 = (e23.a) objQ;
            boolean zB2 = mVar.B(lVar2);
            Object objQ2 = mVar.q();
            if (zB2) {
                objQ2 = new ub0.h(lVar2, 3);
                mVar.K(objQ2);
            } else {
                aVar.getClass();
                if (objQ2 == p3.m.a.f135155b) {
                    objQ2 = new ub0.h(lVar2, 3);
                    mVar.K(objQ2);
                }
            }
            wg2.m.a(rVarX, str, aVar2, (e23.a) objQ2, mVar, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00d5  */
    private final Object s(Object obj, Object obj2, Object obj3) {
        p1 p1Var = (p1) this.f121267b;
        m0 m0Var = (m0) this.f121268c;
        x3 x3Var = (x3) this.f121269d;
        x3 x3Var2 = (x3) this.f121270e;
        h2 h2Var = (h2) obj;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        h2Var.getClass();
        if ((iIntValue & 6) == 0) {
            iIntValue |= mVar.B(h2Var) ? 4 : 2;
        }
        if (mVar.n(iIntValue & 1, (iIntValue & 19) != 18)) {
            x1 x1Var = p3.n.f135158a;
            p1Var.setValue(h2Var);
            h4.r rVarX = c2.l.x(u1.n.e(h4.r.S, tn.k.a(d92.b.f58623a, mVar), m1.f128891a), h2Var);
            h4.d.f81522a.getClass();
            z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
            int iHashCode = Long.hashCode(mVar.getU());
            i2 i2VarX = mVar.x();
            h4.r rVarC = h4.k.c(rVarX, mVar);
            h5.g.V.getClass();
            e0.a aVar = h5.g.a.f81805b;
            if (mVar.F() == null) {
                p0.l();
                throw null;
            }
            mVar.z();
            if (mVar.getT()) {
                mVar.M(aVar);
            } else {
                mVar.c();
            }
            b4.c(h5.g.a.f81810g, z0VarD, mVar);
            b4.c(h5.g.a.f81809f, i2VarX, mVar);
            h5.g.a.b bVar = h5.g.a.f81813j;
            if (mVar.getT() || !s.g(mVar.q(), Integer.valueOf(iHashCode))) {
                v.h.z(iHashCode, mVar, iHashCode, bVar);
            }
            b4.c(h5.g.a.f81807d, rVarC, mVar);
            c2.u uVar = c2.u.f22885a;
            Map map = (Map) x3Var.getF182175a();
            yg2.h0 h0Var = (yg2.h0) x3Var2.getF182175a();
            boolean zR = mVar.r(m0Var);
            Object objQ = mVar.q();
            if (zR) {
                objQ = new ug2.x(m0Var, 3);
                mVar.K(objQ);
            } else {
                p3.m.f135153a.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ug2.x(m0Var, 3);
                    mVar.K(objQ);
                }
            }
            sg2.k.a(map, h0Var, (e23.a) objQ, mVar, 0);
            mVar.y();
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0065  */
    private final Object u(Object obj, Object obj2, Object obj3) {
        e23.a aVar = (e23.a) this.f121267b;
        lg2.a aVar2 = (lg2.a) this.f121268c;
        x3 x3Var = (x3) this.f121269d;
        p1 p1Var = (p1) this.f121270e;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((a0) obj).getClass();
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            boolean z14 = ((lg2.s) x3Var.getF182175a()).f112357a;
            boolean z15 = ((lg2.s) x3Var.getF182175a()).f112358b;
            boolean z16 = ((lg2.s) x3Var.getF182175a()).f112359c;
            boolean zR = mVar.r(aVar2);
            Object objQ = mVar.q();
            p3.m.a aVar3 = p3.m.f135153a;
            if (zR) {
                objQ = new ug2.s(aVar2, 2);
                mVar.K(objQ);
            } else {
                aVar3.getClass();
                if (objQ == p3.m.a.f135155b) {
                    objQ = new ug2.s(aVar2, 2);
                    mVar.K(objQ);
                }
            }
            e23.a aVar4 = (e23.a) objQ;
            Object objQ2 = mVar.q();
            aVar3.getClass();
            if (objQ2 == p3.m.a.f135155b) {
                objQ2 = new tn.h(p1Var, 13);
                mVar.K(objQ2);
            }
            e23.a aVar5 = (e23.a) objQ2;
            String strQ = gl1.y.Q(mVar, R.string.lbl_discard);
            xg2.a aVar6 = xg2.a.Secondary;
            xg2.k.b(x.k(new xg2.i(strQ, aVar5, aVar6, z16, true, (z14 || z15) ? false : true), new xg2.i(gl1.y.Q(mVar, R.string.lbl_resume), aVar4, aVar6, z15, true, (z14 || z16) ? false : true), new xg2.i(gl1.y.Q(mVar, R.string.lbl_save), aVar, xg2.a.Primary, z14, true, (z15 || z16) ? false : true)), mVar, 0);
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    private final Object v(Object obj, Object obj2, Object obj3) {
        z3.e eVar;
        i53.c cVar = (i53.c) this.f121267b;
        e23.l lVar = (e23.l) this.f121268c;
        e23.l lVar2 = (e23.l) this.f121269d;
        n1 n1Var = (n1) this.f121270e;
        p3.m mVar = (p3.m) obj2;
        int iIntValue = ((Integer) obj3).intValue();
        ((a0) obj).getClass();
        boolean z14 = true;
        if (mVar.n(iIntValue & 1, (iIntValue & 17) != 16)) {
            x1 x1Var = p3.n.f135158a;
            int i14 = 0;
            for (Object obj4 : cVar) {
                int i15 = i14 + 1;
                if (i14 < 0) {
                    x.q();
                    throw null;
                }
                k30.k kVar = (k30.k) obj4;
                if (n1Var.getIntValue() == i14) {
                    v40.a.f175539a.getClass();
                    eVar = v40.a.f175540b;
                } else {
                    v40.a.f175539a.getClass();
                    eVar = v40.a.f175541c;
                }
                z3.e eVar2 = eVar;
                h4.r.a aVar = h4.r.S;
                Object objQ = mVar.q();
                p3.m.f135153a.getClass();
                p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                if (objQ == c2565a) {
                    objQ = new uu.o(20);
                    mVar.K(objQ);
                }
                h4.r rVarC = p5.v.c((e23.l) objQ, aVar, z14);
                z3.e eVarC = z3.f.c(300421745, new tr2.o(kVar, 14), mVar);
                boolean zK = mVar.k(i14) | mVar.B(cVar) | mVar.B(lVar) | mVar.B(lVar2);
                Object objQ2 = mVar.q();
                if (zK || objQ2 == c2565a) {
                    a42.q qVar = new a42.q(i14, cVar, lVar2, n1Var, lVar, 4);
                    mVar.K(qVar);
                    objQ2 = qVar;
                }
                p3.m mVar2 = mVar;
                u.b(eVarC, (e23.a) objQ2, rVarC, null, eVar2, false, null, null, mVar2, 6, 488);
                z14 = z14;
                mVar = mVar2;
                i14 = i15;
            }
            x1 x1Var2 = p3.n.f135158a;
        } else {
            mVar.e();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:150:0x03f3  */
    /* JADX WARN: Code duplicated, block: B:233:0x072b  */
    /* JADX WARN: Code duplicated, block: B:378:0x0caa  */
    /* JADX WARN: Code duplicated, block: B:56:0x023e  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // e23.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Context context;
        p1 p1Var;
        p3.m mVar;
        ArrayList arrayList;
        p3.m mVar2;
        int i14 = this.f121266a;
        int i15 = 25;
        p3.m.a aVar = p3.m.f135153a;
        Object obj4 = this.f121270e;
        Object obj5 = this.f121269d;
        Object obj6 = this.f121268c;
        Object obj7 = this.f121267b;
        int i16 = 6;
        switch (i14) {
            case 0:
                List list = (List) obj7;
                l72.x0.a aVar2 = (l72.x0.a) obj6;
                String str = (String) obj5;
                pv0.y yVar = (pv0.y) obj4;
                t2 t2Var = (t2) obj;
                p3.m mVar3 = (p3.m) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                t2Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= mVar3.B(t2Var) ? 4 : 2;
                }
                if (mVar3.n(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x1 x1Var = p3.n.f135158a;
                    d2 d2Var = d2.f16532a;
                    d2Var.getClass();
                    h4.r rVarA = t2Var.a(d2.i(), 0.2f, true);
                    h4.d.f81522a.getClass();
                    int i17 = iIntValue & 14;
                    d2Var.e(t2Var, rVarA, h4.d.a.f81536n, z3.f.c(426520039, new i(0, aVar2, str), mVar3), mVar3, i17 | 3456, 0);
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj8 : list) {
                        if (s.g(((kw0.d) obj8).f106916c, yVar)) {
                            arrayList2.add(obj8);
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    int iIntValue2 = 0;
                    while (it.hasNext()) {
                        Integer num = ((kw0.d) it.next()).f106915b;
                        iIntValue2 += num != null ? num.intValue() : 0;
                    }
                    d2 d2Var2 = d2.f16532a;
                    String strValueOf = String.valueOf(iIntValue2);
                    h4.d.f81522a.getClass();
                    h4.g.a aVar3 = h4.d.a.f81536n;
                    d2Var2.getClass();
                    d2Var2.f(t2Var, strValueOf, t2Var.a(d2.i(), 0.2f, true), aVar3, 0, 0, mVar3, i17 | 3072, 24);
                    x1 x1Var2 = p3.n.f135158a;
                } else {
                    mVar3.e();
                }
                return Unit.INSTANCE;
            case 1:
                e23.a aVar4 = (e23.a) obj7;
                e23.p<? super p3.m, ? super Integer, Unit> pVar = (e23.p) obj6;
                p1 p1Var2 = (p1) obj5;
                p1 p1Var3 = (p1) obj4;
                t2 t2Var2 = (t2) obj;
                p3.m mVar4 = (p3.m) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                t2Var2.getClass();
                if ((iIntValue3 & 6) == 0) {
                    iIntValue3 |= mVar4.B(t2Var2) ? 4 : 2;
                }
                if (mVar4.n(iIntValue3 & 1, (iIntValue3 & 19) != 18)) {
                    x1 x1Var3 = p3.n.f135158a;
                    if (((Boolean) p1Var2.getF182175a()).booleanValue()) {
                        mVar4.C(2115066956);
                        l72.w.a aVar5 = l72.w.a.f111302a;
                        z3.e eVarC = z3.f.c(1566468212, new o72.b(1, pVar, p1Var3), mVar4);
                        boolean zB = mVar4.B(aVar4);
                        Object objQ = mVar4.q();
                        if (zB) {
                            objQ = new nw0.x(aVar4, 7);
                            mVar4.K(objQ);
                        } else {
                            aVar.getClass();
                            if (objQ == p3.m.a.f135155b) {
                                objQ = new nw0.x(aVar4, 7);
                                mVar4.K(objQ);
                            }
                        }
                        aVar5.a(t2Var2, eVarC, null, (e23.a) objQ, mVar4, (iIntValue3 & 14) | 48, 2);
                        mVar4.f();
                    } else {
                        mVar4.C(2115879156);
                        l72.w.a.f111302a.c(t2Var2, "Header", (String) p1Var3.getF182175a(), pVar, mVar4, (iIntValue3 & 14) | 48, 0);
                        mVar4.f();
                    }
                } else {
                    mVar4.e();
                }
                return Unit.INSTANCE;
            case 2:
                Context context2 = (Context) obj7;
                p1 p1Var4 = (p1) obj6;
                l1 l1Var = (l1) obj5;
                n1 n1Var = (n1) obj4;
                p3.m mVar5 = (p3.m) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar5.n(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    x1 x1Var4 = p3.n.f135158a;
                    Object objQ2 = mVar5.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a = p3.m.a.f135155b;
                    if (objQ2 == c2565a) {
                        objQ2 = new j2(p1Var4, 19);
                        mVar5.K(objQ2);
                    }
                    b3.a(54, (e23.a) objQ2, "Weight Picker Stones", mVar5);
                    if (((Boolean) p1Var4.getF182175a()).booleanValue()) {
                        mVar5.C(-1792511897);
                        l72.c1 c1Var = l72.c1.f110940a;
                        z3.e eVarC2 = z3.f.c(-948614558, new i(i15, l1Var, n1Var), mVar5);
                        boolean zR = mVar5.r(context2);
                        Object objQ3 = mVar5.q();
                        if (zR || objQ3 == c2565a) {
                            context = context2;
                            objQ3 = new ho.d0((Object) context, (Object) n1Var, (Object) l1Var, false, (Object) p1Var4, 29);
                            mVar5.K(objQ3);
                        } else {
                            context = context2;
                        }
                        e23.a<Unit> aVar6 = (e23.a) objQ3;
                        boolean zR2 = mVar5.r(context);
                        Object objQ4 = mVar5.q();
                        if (zR2 || objQ4 == c2565a) {
                            objQ4 = new o72.z2(context, p1Var4, 12);
                            mVar5.K(objQ4);
                        }
                        c1Var.a(true, "Weight in Statute UK System with Stones as Preferred Unit", null, eVarC2, null, "Action1", false, false, aVar6, "Action2", (e23.a) objQ4, mVar5, 805506102, 0, 212);
                        mVar5.f();
                    } else {
                        mVar5.C(-1791012737);
                        mVar5.f();
                    }
                } else {
                    mVar5.e();
                }
                return Unit.INSTANCE;
            case 3:
                e23.l lVar = (e23.l) obj7;
                h90.b bVar = (h90.b) obj6;
                e23.l lVar2 = (e23.l) obj5;
                p1 p1Var5 = (p1) obj4;
                p3.m mVar6 = (p3.m) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar6.n(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x1 x1Var5 = p3.n.f135158a;
                    h4.r.a aVar7 = h4.r.S;
                    h4.r rVarA2 = x80.c.a(aVar7, lVar);
                    c2.j jVar = c2.j.f22691a;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    float f14 = j92.b.f97899b.f97920e;
                    jVar.getClass();
                    c2.j.i iVarI = c2.j.i(f14);
                    h4.d.f81522a.getClass();
                    s2 s2VarA = q2.a(iVarI, h4.d.a.f81533k, mVar6, 0);
                    int iHashCode = Long.hashCode(mVar6.getU());
                    i2 i2VarX = mVar6.x();
                    h4.r rVarC = h4.k.c(rVarA2, mVar6);
                    h5.g.V.getClass();
                    e0.a aVar8 = h5.g.a.f81805b;
                    if (mVar6.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar6.z();
                    if (mVar6.getT()) {
                        mVar6.M(aVar8);
                    } else {
                        mVar6.c();
                    }
                    b4.c(h5.g.a.f81810g, s2VarA, mVar6);
                    b4.c(h5.g.a.f81809f, i2VarX, mVar6);
                    h5.g.a.b bVar2 = h5.g.a.f81813j;
                    if (mVar6.getT() || !s.g(mVar6.q(), Integer.valueOf(iHashCode))) {
                        v.h.z(iHashCode, mVar6, iHashCode, bVar2);
                    }
                    b4.c(h5.g.a.f81807d, rVarC, mVar6);
                    u2 u2Var = u2.f22900a;
                    h4.r rVarA3 = u2Var.a(aVar7, 1.0f, true);
                    int i18 = bVar.f82517a;
                    j90.c cVar = j90.c.LEFT;
                    int i19 = cVar.f97796a;
                    boolean zBooleanValue = ((Boolean) lVar2.invoke(cVar)).booleanValue();
                    Object objQ5 = mVar6.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a2 = p3.m.a.f135155b;
                    if (objQ5 == c2565a2) {
                        objQ5 = new j2(p1Var5, 26);
                        mVar6.K(objQ5);
                    }
                    oa0.b.c(rVarA3, i18, i19, zBooleanValue, (e23.a) objQ5, mVar6, 24960);
                    h4.r rVarA4 = u2Var.a(aVar7, 1.0f, true);
                    int i24 = bVar.f82518b;
                    j90.c cVar2 = j90.c.RIGHT;
                    int i25 = cVar2.f97796a;
                    boolean zBooleanValue2 = ((Boolean) lVar2.invoke(cVar2)).booleanValue();
                    Object objQ6 = mVar6.q();
                    if (objQ6 == c2565a2) {
                        objQ6 = new j2(p1Var5, 27);
                        mVar6.K(objQ6);
                    }
                    oa0.b.c(rVarA4, i24, i25, zBooleanValue2, (e23.a) objQ6, mVar6, 24960);
                    mVar6.y();
                } else {
                    mVar6.e();
                }
                return Unit.INSTANCE;
            case 4:
                e23.l lVar3 = (e23.l) obj7;
                h90.e eVar = (h90.e) obj6;
                e23.l lVar4 = (e23.l) obj5;
                p1 p1Var6 = (p1) obj4;
                p3.m mVar7 = (p3.m) obj2;
                int iIntValue6 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar7.n(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    x1 x1Var6 = p3.n.f135158a;
                    h4.r.a aVar9 = h4.r.S;
                    h4.r rVarD = x2.d(aVar9, 1.0f);
                    c2.j.f22691a.getClass();
                    c2.j.k kVar = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA = y.a(kVar, h4.d.a.f81536n, mVar7, 0);
                    int iHashCode2 = Long.hashCode(mVar7.getU());
                    i2 i2VarX2 = mVar7.x();
                    h4.r rVarC2 = h4.k.c(rVarD, mVar7);
                    h5.g.V.getClass();
                    e0.a aVar10 = h5.g.a.f81805b;
                    if (mVar7.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar10);
                    } else {
                        mVar7.c();
                    }
                    h5.g.a.e eVar2 = h5.g.a.f81810g;
                    b4.c(eVar2, zVarA, mVar7);
                    h5.g.a.C1623g c1623g = h5.g.a.f81809f;
                    b4.c(c1623g, i2VarX2, mVar7);
                    h5.g.a.b bVar3 = h5.g.a.f81813j;
                    if (mVar7.getT() || !s.g(mVar7.q(), Integer.valueOf(iHashCode2))) {
                        v.h.z(iHashCode2, mVar7, iHashCode2, bVar3);
                    }
                    h5.g.a.f fVar = h5.g.a.f81807d;
                    b4.c(fVar, rVarC2, mVar7);
                    c2.b0 b0Var = c2.b0.f22601a;
                    h4.r rVarA5 = x80.c.a(x2.x(x2.f(aVar9, 1.0f), null, 3), lVar3);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    j92.e eVar3 = j92.b.f97899b;
                    float f15 = eVar3.f97920e;
                    float f16 = eVar3.f97923h;
                    c2.j.i iVarI2 = c2.j.i(f15);
                    h4.g.b bVar4 = h4.d.a.f81533k;
                    s2 s2VarA2 = q2.a(iVarI2, bVar4, mVar7, 0);
                    int iHashCode3 = Long.hashCode(mVar7.getU());
                    i2 i2VarX3 = mVar7.x();
                    h4.r rVarC3 = h4.k.c(rVarA5, mVar7);
                    if (mVar7.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar10);
                    } else {
                        mVar7.c();
                    }
                    b4.c(eVar2, s2VarA2, mVar7);
                    b4.c(c1623g, i2VarX3, mVar7);
                    if (mVar7.getT() || !s.g(mVar7.q(), Integer.valueOf(iHashCode3))) {
                        v.h.z(iHashCode3, mVar7, iHashCode3, bVar3);
                    }
                    b4.c(fVar, rVarC3, mVar7);
                    u2 u2Var2 = u2.f22900a;
                    t4.d dVarA = n5.c.a(eVar.f82525a, mVar7, 0);
                    j90.k kVar2 = j90.k.LANDSCAPE;
                    u1.y0.a(dVarA, gl1.y.Q(mVar7, kVar2.f97834b), c2.l.A(v2.a(u2Var2.a(aVar9, 1.0f, true), !((Boolean) lVar4.invoke(kVar2)).booleanValue(), new i1(5), mVar7, 0), 0.0f, f16, 1), null, null, 0.0f, null, mVar7, 0, 120);
                    t4.d dVarA2 = n5.c.a(eVar.f82526b, mVar7, 0);
                    j90.k kVar3 = j90.k.PORTRAIT;
                    u1.y0.a(dVarA2, gl1.y.Q(mVar7, kVar3.f97834b), c2.l.A(v2.a(u2Var2.a(aVar9, 1.0f, true), !((Boolean) lVar4.invoke(kVar3)).booleanValue(), new i1(6), mVar7, 0), 0.0f, f16, 1), null, null, 0.0f, null, mVar7, 0, 120);
                    mVar7.y();
                    h4.r rVarX = x2.x(x2.f(aVar9, 1.0f), null, 3);
                    s2 s2VarA3 = q2.a(c2.j.i(eVar3.f97920e), bVar4, mVar7, 0);
                    int iHashCode4 = Long.hashCode(mVar7.getU());
                    i2 i2VarX4 = mVar7.x();
                    h4.r rVarC4 = h4.k.c(rVarX, mVar7);
                    if (mVar7.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar7.z();
                    if (mVar7.getT()) {
                        mVar7.M(aVar10);
                    } else {
                        mVar7.c();
                    }
                    b4.c(eVar2, s2VarA3, mVar7);
                    b4.c(c1623g, i2VarX4, mVar7);
                    if (mVar7.getT() || !s.g(mVar7.q(), Integer.valueOf(iHashCode4))) {
                        v.h.z(iHashCode4, mVar7, iHashCode4, bVar3);
                    }
                    b4.c(fVar, rVarC4, mVar7);
                    h4.r rVarA6 = u2Var2.a(aVar9, 1.0f, true);
                    boolean zBooleanValue3 = ((Boolean) lVar4.invoke(kVar2)).booleanValue();
                    String strQ = gl1.y.Q(mVar7, kVar2.f97834b);
                    float f17 = da0.u.f58858a;
                    k2.h hVarA = k2.i.a(f17);
                    Object objQ7 = mVar7.q();
                    aVar.getClass();
                    p3.m.a.C2565a c2565a3 = p3.m.a.f135155b;
                    if (objQ7 == c2565a3) {
                        p1Var = p1Var6;
                        objQ7 = new j2(p1Var, 28);
                        mVar7.K(objQ7);
                    } else {
                        p1Var = p1Var6;
                    }
                    da0.u.a(null, zBooleanValue3, strQ, rVarA6, hVarA, (e23.a) objQ7, mVar7, 196608, 1);
                    h4.r rVarA7 = u2Var2.a(aVar9, 1.0f, true);
                    boolean zBooleanValue4 = ((Boolean) lVar4.invoke(kVar3)).booleanValue();
                    String strQ2 = gl1.y.Q(mVar7, kVar3.f97834b);
                    k2.h hVarA2 = k2.i.a(f17);
                    Object objQ8 = mVar7.q();
                    if (objQ8 == c2565a3) {
                        objQ8 = new j2(p1Var, 29);
                        mVar7.K(objQ8);
                    }
                    da0.u.a(null, zBooleanValue4, strQ2, rVarA7, hVarA2, (e23.a) objQ8, mVar7, 196608, 1);
                    mVar7.y();
                    mVar7.y();
                } else {
                    mVar7.e();
                }
                return Unit.INSTANCE;
            case 5:
                List list2 = (List) obj7;
                DateTime dateTime = (DateTime) obj6;
                mo0.a aVar11 = (mo0.a) obj5;
                e23.l lVar5 = (e23.l) obj4;
                p3.m mVar8 = (p3.m) obj2;
                int iIntValue7 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar8.n(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    x1 x1Var7 = p3.n.f135158a;
                    h4.r rVarF = x2.f(h4.r.S, 1.0f);
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarS = c2.l.s(c2.l.A(rVarF, j92.b.f97899b.f97920e, 0.0f, 2));
                    c2.j.f22691a.getClass();
                    c2.j.k kVar4 = c2.j.f22694d;
                    h4.d.f81522a.getClass();
                    z zVarA2 = y.a(kVar4, h4.d.a.f81536n, mVar8, 0);
                    int iHashCode5 = Long.hashCode(mVar8.getU());
                    i2 i2VarX5 = mVar8.x();
                    h4.r rVarC5 = h4.k.c(rVarS, mVar8);
                    h5.g.V.getClass();
                    e0.a aVar12 = h5.g.a.f81805b;
                    if (mVar8.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar8.z();
                    if (mVar8.getT()) {
                        mVar8.M(aVar12);
                    } else {
                        mVar8.c();
                    }
                    b4.c(h5.g.a.f81810g, zVarA2, mVar8);
                    b4.c(h5.g.a.f81809f, i2VarX5, mVar8);
                    h5.g.a.b bVar5 = h5.g.a.f81813j;
                    if (mVar8.getT() || !s.g(mVar8.q(), Integer.valueOf(iHashCode5))) {
                        v.h.z(iHashCode5, mVar8, iHashCode5, bVar5);
                    }
                    b4.c(h5.g.a.f81807d, rVarC5, mVar8);
                    c2.b0 b0Var2 = c2.b0.f22601a;
                    if (list2 == null) {
                        mVar8.C(1700202146);
                        mVar8.f();
                        mVar = mVar8;
                    } else {
                        mVar8.C(1700202147);
                        int i26 = 0;
                        for (Object obj9 : list2) {
                            int i27 = i26 + 1;
                            if (i26 < 0) {
                                x.q();
                                throw null;
                            }
                            gs1.d.b bVar6 = (gs1.d.b) obj9;
                            gs1.d.b bVar7 = (gs1.d.b) list2.get(i26);
                            DateTime dateTimeNow = bVar7.f78713a;
                            if (dateTimeNow == null) {
                                dateTimeNow = DateTime.now();
                            }
                            String strP = gl1.y.P(R.string.string_short_dash_line_string_pattern, new Object[]{new yz.k(DateFormat.is24HourFormat(aVar11.f119868a)).a(Minutes.minutesBetween(dateTime, dateTimeNow).getMinutes()), aVar11.b(bVar7.f78714b)}, mVar8);
                            d92.b.f58623a.getClass();
                            d92.b.f58624b.getClass();
                            s5.x0 x0VarB = d92.c.b(j92.f.f97931h, mVar8);
                            h4.r.a aVar13 = h4.r.S;
                            d92.b.f58625c.getClass();
                            h4.r rVarF2 = x2.f(c2.l.A(aVar13, 0.0f, j92.b.f97899b.f97918c, 1), 1.0f);
                            boolean zB2 = mVar8.B(lVar5) | mVar8.r(bVar6);
                            Object objQ9 = mVar8.q();
                            if (zB2) {
                                objQ9 = new oe.j(i16, lVar5, bVar6);
                                mVar8.K(objQ9);
                            } else {
                                aVar.getClass();
                                if (objQ9 == p3.m.a.f135155b) {
                                    objQ9 = new oe.j(i16, lVar5, bVar6);
                                    mVar8.K(objQ9);
                                }
                            }
                            mh.c(strP, u1.w.d(rVarF2, false, null, null, (e23.a) objQ9, 15), 0L, null, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, x0VarB, mVar8, 0, 0, 131068);
                            i26 = i27;
                            i16 = 6;
                        }
                        mVar = mVar8;
                        mVar.f();
                    }
                    mVar.y();
                    x1 x1Var8 = p3.n.f135158a;
                } else {
                    mVar8.e();
                }
                return Unit.INSTANCE;
            case 6:
                ly0.a aVar14 = (ly0.a) obj7;
                e23.a aVar15 = (e23.a) obj6;
                fy0.e eVar4 = (fy0.e) obj5;
                e23.a aVar16 = (e23.a) obj4;
                p3.m mVar9 = (p3.m) obj2;
                int iIntValue8 = ((Integer) obj3).intValue();
                ((e2.d) obj).getClass();
                if (mVar9.n(iIntValue8 & 1, (iIntValue8 & 17) != 16)) {
                    x1 x1Var9 = p3.n.f135158a;
                    h4.r.a aVar17 = h4.r.S;
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    h4.r rVarA8 = c2.l.A(aVar17, j92.b.f97899b.f97920e, 0.0f, 2);
                    h4.d.f81522a.getClass();
                    z0 z0VarD = c2.q.d(h4.d.a.f81524b, false);
                    int iHashCode6 = Long.hashCode(mVar9.getU());
                    i2 i2VarX6 = mVar9.x();
                    h4.r rVarC6 = h4.k.c(rVarA8, mVar9);
                    h5.g.V.getClass();
                    e0.a aVar18 = h5.g.a.f81805b;
                    if (mVar9.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar9.z();
                    if (mVar9.getT()) {
                        mVar9.M(aVar18);
                    } else {
                        mVar9.c();
                    }
                    b4.c(h5.g.a.f81810g, z0VarD, mVar9);
                    b4.c(h5.g.a.f81809f, i2VarX6, mVar9);
                    h5.g.a.b bVar8 = h5.g.a.f81813j;
                    if (mVar9.getT() || !s.g(mVar9.q(), Integer.valueOf(iHashCode6))) {
                        v.h.z(iHashCode6, mVar9, iHashCode6, bVar8);
                    }
                    b4.c(h5.g.a.f81807d, rVarC6, mVar9);
                    c2.u uVar = c2.u.f22885a;
                    cy0.c cVar3 = aVar14.f115283c;
                    if (cVar3 != null) {
                        List<ps.j> listD = cVar3.d();
                        ArrayList arrayList3 = new ArrayList(p13.y.r(listD, 10));
                        int i28 = 0;
                        for (Object obj10 : listD) {
                            int i29 = i28 + 1;
                            if (i28 < 0) {
                                x.q();
                                throw null;
                            }
                            arrayList3.add(new wg0.c(i28, (ps.j) obj10));
                            i28 = i29;
                        }
                        arrayList = new ArrayList(arrayList3);
                    } else {
                        aVar16.invoke();
                        arrayList = new ArrayList();
                    }
                    ArrayList arrayList4 = arrayList;
                    h4.r.a aVar19 = h4.r.S;
                    fy0.e.a.a(aVar19, aVar14.f115281a, aVar14.f115282b, new wg0.l(null, arrayList4, null, null, 0, 16, null), aVar15, eVar4, mVar9, (ps.m.f139904n << 6) | 6 | (wg0.l.f185101f << 9));
                    mVar9.y();
                    d92.b.f58623a.getClass();
                    d92.b.f58625c.getClass();
                    c2.l.f(x2.h(aVar19, j92.b.f97899b.f97918c), mVar9);
                    x1 x1Var10 = p3.n.f135158a;
                } else {
                    mVar9.e();
                }
                return Unit.INSTANCE;
            case 7:
                p40.k kVar5 = (p40.k) obj7;
                q40.b bVar9 = (q40.b) obj6;
                p1 p1Var7 = (p1) obj5;
                p1 p1Var8 = (p1) obj4;
                p3.m mVar10 = (p3.m) obj2;
                int iIntValue9 = ((Integer) obj3).intValue();
                ((a0) obj).getClass();
                if (mVar10.n(iIntValue9 & 1, (iIntValue9 & 17) != 16)) {
                    x1 x1Var11 = p3.n.f135158a;
                    p40.c.f135642a.getClass();
                    z3.e eVar5 = p40.c.f135643b;
                    boolean zB3 = mVar10.B(kVar5) | mVar10.r(bVar9);
                    Object objQ10 = mVar10.q();
                    if (zB3) {
                        objQ10 = new nw0.p(kVar5, 17, bVar9, p1Var7);
                        mVar10.K(objQ10);
                    } else {
                        aVar.getClass();
                        if (objQ10 == p3.m.a.f135155b) {
                            objQ10 = new nw0.p(kVar5, 17, bVar9, p1Var7);
                            mVar10.K(objQ10);
                        }
                    }
                    u.b(eVar5, (e23.a) objQ10, null, null, null, false, null, null, mVar10, 6, 508);
                    if (bVar9.f142584k) {
                        mVar10.C(-414965190);
                        z3.e eVar6 = p40.c.f135644c;
                        Object objQ11 = mVar10.q();
                        aVar.getClass();
                        if (objQ11 == p3.m.a.f135155b) {
                            objQ11 = new j1(p1Var7, p1Var8, 25);
                            mVar10.K(objQ11);
                        }
                        u.b(eVar6, (e23.a) objQ11, null, null, null, false, null, null, mVar10, 54, 508);
                        mVar10.f();
                    } else {
                        mVar10.C(-414362643);
                        mVar10.f();
                    }
                    z3.e eVar7 = p40.c.f135645d;
                    Object objQ12 = mVar10.q();
                    aVar.getClass();
                    if (objQ12 == p3.m.a.f135155b) {
                        objQ12 = new om0.h(p1Var7, 21);
                        mVar10.K(objQ12);
                    }
                    u.b(eVar7, (e23.a) objQ12, null, null, null, false, null, null, mVar10, 54, 508);
                } else {
                    mVar10.e();
                }
                return Unit.INSTANCE;
            case 8:
                return a(obj, obj2, obj3);
            case 9:
                return b(obj, obj2, obj3);
            case 10:
                String str2 = (String) obj5;
                String str3 = (String) obj7;
                String str4 = (String) obj6;
                q81.m mVar11 = (q81.m) obj4;
                t2 t2Var3 = (t2) obj;
                p3.m mVar12 = (p3.m) obj2;
                int iIntValue10 = ((Integer) obj3).intValue();
                t2Var3.getClass();
                if ((iIntValue10 & 6) == 0) {
                    iIntValue10 |= mVar12.B(t2Var3) ? 4 : 2;
                }
                if (mVar12.n(iIntValue10 & 1, (iIntValue10 & 19) != 18)) {
                    x1 x1Var12 = p3.n.f135158a;
                    l72.x0 x0Var = l72.x0.f111346a;
                    String strQ3 = gl1.y.Q(mVar12, R.string.lbl_hill_score_avg_score);
                    b92.a aVarA = wz1.a.a(str3);
                    int i30 = b92.a.f16960b;
                    int i34 = (l72.x0.f111348c << 24) | (iIntValue10 & 14);
                    x0Var.a(i34, 60, aVarA, t2Var3, null, null, str2, strQ3, null, null, mVar12);
                    if (str4 == null) {
                        str4 = mVar11.f143351f;
                    }
                    x0Var.a(i34, 124, null, t2Var3, null, null, str4, gl1.y.Q(mVar12, R.string.lbl_hill_score_max_score), null, null, mVar12);
                } else {
                    mVar12.e();
                }
                return Unit.INSTANCE;
            case 11:
                Double d14 = (Double) obj7;
                Double d15 = (Double) obj6;
                e23.l lVar6 = (e23.l) obj4;
                String str5 = (String) obj5;
                h4.r rVar = (h4.r) obj;
                p3.m mVar13 = (p3.m) obj2;
                int iIntValue11 = ((Integer) obj3).intValue();
                rVar.getClass();
                if ((iIntValue11 & 6) == 0) {
                    iIntValue11 |= mVar13.B(rVar) ? 4 : 2;
                }
                if (mVar13.n(iIntValue11 & 1, (iIntValue11 & 19) != 18)) {
                    x1 x1Var13 = p3.n.f135158a;
                    c02.h.b(rVar, d14, d15, yz1.k.d(mVar13), lVar6, str5, mVar13, iIntValue11 & 14);
                } else {
                    mVar13.e();
                }
                return Unit.INSTANCE;
            case 12:
                return c(obj, obj2, obj3);
            case 13:
                return d(obj, obj2, obj3);
            case 14:
                return e(obj, obj2, obj3);
            case 15:
                return f(obj, obj2, obj3);
            case 16:
                return g(obj, obj2, obj3);
            case 17:
                return h(obj, obj2, obj3);
            case 18:
                return i(obj, obj2, obj3);
            case 19:
                return j(obj, obj2, obj3);
            case 20:
                return k(obj, obj2, obj3);
            case 21:
                return l(obj, obj2, obj3);
            case 22:
                return n(obj, obj2, obj3);
            case 23:
                return o(obj, obj2, obj3);
            case 24:
                return q(obj, obj2, obj3);
            case 25:
                return r(obj, obj2, obj3);
            case 26:
                return s(obj, obj2, obj3);
            case 27:
                return u(obj, obj2, obj3);
            case 28:
                return v(obj, obj2, obj3);
            default:
                v72.b bVar10 = (v72.b) obj7;
                x3 x3Var = (x3) obj6;
                m0 m0Var = (m0) obj5;
                x3 x3Var2 = (x3) obj4;
                h2 h2Var = (h2) obj;
                p3.m mVar14 = (p3.m) obj2;
                int iIntValue12 = ((Integer) obj3).intValue();
                h2Var.getClass();
                if ((iIntValue12 & 6) == 0) {
                    iIntValue12 |= mVar14.B(h2Var) ? 4 : 2;
                }
                if (mVar14.n(iIntValue12 & 1, (iIntValue12 & 19) != 18)) {
                    x1 x1Var14 = p3.n.f135158a;
                    h4.r.a aVar20 = h4.r.S;
                    h4.r rVarE = u1.n.e(c2.l.j(c2.l.x(aVar20, h2Var), h2Var), tn.k.a(d92.b.f58623a, mVar14), m1.f128891a);
                    h4.d.f81522a.getClass();
                    h4.g gVar = h4.d.a.f81524b;
                    z0 z0VarD2 = c2.q.d(gVar, false);
                    int iHashCode7 = Long.hashCode(mVar14.getU());
                    i2 i2VarX7 = mVar14.x();
                    h4.r rVarC7 = h4.k.c(rVarE, mVar14);
                    h5.g.V.getClass();
                    e0.a aVar21 = h5.g.a.f81805b;
                    if (mVar14.F() == null) {
                        p0.l();
                        throw null;
                    }
                    mVar14.z();
                    if (mVar14.getT()) {
                        mVar14.M(aVar21);
                    } else {
                        mVar14.c();
                    }
                    h5.g.a.e eVar8 = h5.g.a.f81810g;
                    b4.c(eVar8, z0VarD2, mVar14);
                    h5.g.a.C1623g c1623g2 = h5.g.a.f81809f;
                    b4.c(c1623g2, i2VarX7, mVar14);
                    h5.g.a.b bVar11 = h5.g.a.f81813j;
                    if (mVar14.getT() || !s.g(mVar14.q(), Integer.valueOf(iHashCode7))) {
                        v.h.z(iHashCode7, mVar14, iHashCode7, bVar11);
                    }
                    h5.g.a.f fVar2 = h5.g.a.f81807d;
                    b4.c(fVar2, rVarC7, mVar14);
                    c2.u uVar2 = c2.u.f22885a;
                    float f18 = 16;
                    g6.f.a aVar22 = g6.f.f75994b;
                    c2.l.f(x2.h(aVar20, f18), mVar14);
                    if (((Boolean) x3Var2.getF182175a()).booleanValue()) {
                        mVar14.C(-1516934070);
                        h4.r rVarD2 = x2.d(aVar20, 1.0f);
                        z0 z0VarD3 = c2.q.d(gVar, false);
                        int iHashCode8 = Long.hashCode(mVar14.getU());
                        i2 i2VarX8 = mVar14.x();
                        h4.r rVarC8 = h4.k.c(rVarD2, mVar14);
                        if (mVar14.F() == null) {
                            p0.l();
                            throw null;
                        }
                        mVar14.z();
                        if (mVar14.getT()) {
                            mVar14.M(aVar21);
                        } else {
                            mVar14.c();
                        }
                        b4.c(eVar8, z0VarD3, mVar14);
                        b4.c(c1623g2, i2VarX8, mVar14);
                        if (mVar14.getT() || !s.g(mVar14.q(), Integer.valueOf(iHashCode8))) {
                            v.h.z(iHashCode8, mVar14, iHashCode8, bVar11);
                        }
                        b4.c(fVar2, rVarC8, mVar14);
                        ua.a(0.0f, 0.0f, 0, 0, 62, 0L, 0L, uVar2.c(aVar20, h4.d.a.f81528f), mVar14);
                        mVar2 = mVar14;
                        mVar2.y();
                        mVar2.f();
                    } else {
                        mVar2 = mVar14;
                        mVar2.C(-1516649862);
                        if (((List) x3Var.getF182175a()).isEmpty()) {
                            mVar2.C(-1516633308);
                            d92.b.f58624b.getClass();
                            s5.x0 x0VarF = d92.c.f(j92.f.f97932i, mVar2);
                            h4.r rVarY = c2.l.y(x2.f(aVar20, 1.0f), f18);
                            d6.h.f57752b.getClass();
                            mh.c("No results found", rVarY, 0L, null, 0L, null, 0L, d6.h.a(d6.h.f57755e), 0L, 0, false, 0, 0, null, x0VarF, mVar2, 54, 0, 130044);
                            mVar2.f();
                        } else {
                            mVar2.C(-1516298322);
                            mVar2.f();
                        }
                        if (((Number) bVar10.f176180f.getValue()).intValue() == ((List) x3Var.getF182175a()).size()) {
                            mVar2.C(-1516234245);
                        } else {
                            mVar2.C(-1516107331);
                            Context context3 = (Context) mVar2.A(AndroidCompositionLocals_androidKt.f6042b);
                            h4.r rVarF3 = x2.f(aVar20, 1.0f);
                            d92.b.f58625c.getClass();
                            j92.e eVar9 = j92.b.f97899b;
                            float f19 = eVar9.f97920e;
                            l2 l2VarE = c2.l.e(0.0f, f19, 0.0f, f19, 5);
                            c2.j jVar2 = c2.j.f22691a;
                            float f22 = eVar9.f97920e;
                            h4.g.b bVar12 = h4.d.a.f81533k;
                            jVar2.getClass();
                            c2.j.i iVarK = c2.j.k(f22, bVar12);
                            boolean zB4 = mVar2.B(x3Var) | mVar2.r(context3) | mVar2.r(m0Var);
                            Object objQ13 = mVar2.q();
                            if (zB4) {
                                objQ13 = new s0(x3Var, 13, context3, m0Var);
                                mVar2.K(objQ13);
                            } else {
                                aVar.getClass();
                                if (objQ13 == p3.m.a.f135155b) {
                                    objQ13 = new s0(x3Var, 13, context3, m0Var);
                                    mVar2.K(objQ13);
                                }
                            }
                            e2.c.b(rVarF3, null, l2VarE, iVarK, null, null, false, null, (e23.l) objQ13, mVar2, 6, 490);
                        }
                        mVar2.f();
                        mVar2.f();
                    }
                    mVar2.y();
                } else {
                    mVar14.e();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ h(int i14, String str, Object obj, Object obj2, Object obj3) {
        this.f121266a = i14;
        this.f121269d = str;
        this.f121267b = obj;
        this.f121268c = obj2;
        this.f121270e = obj3;
    }

    public /* synthetic */ h(Object obj, Object obj2, Object obj3, Object obj4, int i14) {
        this.f121266a = i14;
        this.f121267b = obj;
        this.f121268c = obj2;
        this.f121269d = obj3;
        this.f121270e = obj4;
    }

    public /* synthetic */ h(z3.e eVar, String str, b0 b0Var, a1 a1Var) {
        this.f121266a = 9;
        this.f121267b = eVar;
        this.f121269d = str;
        this.f121268c = b0Var;
        this.f121270e = a1Var;
    }
}
