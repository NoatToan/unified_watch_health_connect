package fg2;

import com.garmin.android.apps.connectmobile.R;
import com.google.android.exoplayer2.audio.WavUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import o4.q1;
import p005kotlin.Unit;
import p3.x1;
import s5.i0;
import yg2.j0;

/* JADX INFO: loaded from: classes11.dex */
public final class h0 {
    public static final boolean a(yg2.a aVar, yg2.o oVar) {
        aVar.getClass();
        oVar.getClass();
        yg2.a aVar2 = (yg2.a) p13.h0.n0(oVar.b());
        return (aVar2 != null && aVar.getClusterIndex() == aVar2.getClusterIndex() && oVar.c().isEmpty() && m(aVar, oVar)) ? false : true;
    }

    public static final boolean b(yg2.o oVar) {
        Object objPrevious;
        oVar.getClass();
        i53.c<yg2.a> cVarB = oVar.b();
        if (cVarB != null && cVarB.isEmpty()) {
            return false;
        }
        for (yg2.a aVar : cVarB) {
            aVar.getClass();
            ArrayList arrayListG = g(oVar.d(), aVar.getStartStepIndex(), aVar.getEndStepIndex());
            ListIterator listIterator = arrayListG.listIterator(arrayListG.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((yg2.h0) objPrevious).f197048o);
            yg2.h0 h0Var = (yg2.h0) objPrevious;
            if (h0Var != null) {
                lt2.b bVarJ = h0Var.getPrimaryTarget();
                Double dValueOf = bVarJ != null ? Double.valueOf(bVarJ.f114871b) : null;
                return dValueOf == null || dValueOf.doubleValue() > 2.147483647E9d;
            }
        }
        return false;
    }

    public static final yg2.a c(yg2.o oVar, Integer num) {
        yg2.a next;
        oVar.getClass();
        Iterator<yg2.a> it = oVar.b().iterator();
        while (it.hasNext()) {
            next = it.next();
            yg2.a aVar = next;
            j23.l lVar = new j23.l(aVar.getStartStepIndex(), aVar.getEndStepIndex());
            if (num != null && lVar.d(num.intValue())) {
                return next;
            }
        }
        next = null;
        return next;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x002d A[RETURN] */
    public static final Integer d(yg2.a aVar, yg2.o oVar) {
        oVar.getClass();
        Iterator it = l(aVar, oVar).iterator();
        int i14 = 0;
        while (it.hasNext()) {
            if (((yg2.h0) it.next()).getStatus() == yg2.n.ACTIVE) {
                if (i14 != -1) {
                    return Integer.valueOf(i14);
                }
                return null;
            }
            i14++;
        }
        i14 = -1;
        if (i14 != -1) {
            return Integer.valueOf(i14);
        }
        return null;
    }

    public static final s5.c e(yg2.a aVar, yg2.o oVar, yg2.h0 h0Var, p3.m mVar) {
        oVar.getClass();
        h0Var.getClass();
        x1 x1Var = p3.n.f135158a;
        ArrayList arrayListL = l(aVar, oVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : arrayListL) {
            if (!((yg2.h0) obj).f197048o) {
                arrayList.add(obj);
            }
        }
        mVar.C(1135681375);
        int i14 = 0;
        s5.c.b bVar = new s5.c.b(i14, 1, null);
        mVar.C(1135682516);
        for (Object obj2 : arrayList) {
            int i15 = i14 + 1;
            if (i14 < 0) {
                p13.x.q();
                throw null;
            }
            yg2.h0 h0Var2 = (yg2.h0) obj2;
            lt2.a aVarD = h0Var2.getDuration();
            if (aVarD != null) {
                int i16 = (int) aVarD.f114867b;
                if (h0Var2.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() == h0Var.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String()) {
                    mVar.C(-7970713);
                    d92.b.f58623a.getClass();
                    int iJ = bVar.j(new i0(d92.b.a(mVar).k().a(), 0L, (w5.f0) null, (w5.b0) null, (w5.c0) null, (w5.q) null, (String) null, 0L, (d6.a) null, (d6.m) null, (z5.c) null, 0L, (d6.i) null, (q1) null, (s5.b0) null, (q4.g) null, WavUtil.TYPE_WAVE_FORMAT_EXTENSIBLE, (p005kotlin.jvm.internal.j) null));
                    try {
                        bVar.b(String.valueOf(i16));
                        Unit unit = Unit.INSTANCE;
                        bVar.f(iJ);
                        mVar.f();
                    } catch (Throwable th3) {
                        bVar.f(iJ);
                        throw th3;
                    }
                } else {
                    mVar.C(-7812892);
                    mVar.f();
                    bVar.b(String.valueOf(i16));
                }
                if (i14 < arrayList.size() - 1) {
                    bVar.b(" : ");
                }
            }
            i14 = i15;
        }
        mVar.f();
        s5.c cVarK = bVar.k();
        mVar.f();
        x1 x1Var2 = p3.n.f135158a;
        return cVarK;
    }

    public static final yg2.a f(yg2.h0 h0Var, yg2.o oVar) {
        yg2.a aVar;
        yg2.a next;
        h0Var.getClass();
        oVar.getClass();
        Iterator<yg2.a> it = oVar.b().iterator();
        while (true) {
            aVar = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            yg2.a aVar2 = next;
            if (aVar2.getStartStepIndex() <= h0Var.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() && aVar2.getEndStepIndex() >= h0Var.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String()) {
                break;
            }
        }
        yg2.a aVar3 = next;
        if (aVar3 != null) {
            return aVar3;
        }
        for (yg2.a aVar4 : oVar.c()) {
            yg2.a aVar5 = aVar4;
            if (aVar5.getStartStepIndex() <= h0Var.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() && aVar5.getEndStepIndex() >= h0Var.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String()) {
                aVar = aVar4;
                break;
            }
        }
        return aVar;
    }

    public static final ArrayList g(i53.c cVar, int i14, int i15) {
        cVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : cVar) {
            int iF = ((yg2.h0) obj).getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String();
            if (i14 <= iF && iF <= i15) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final ArrayList h(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (((yg2.h0) obj).f197048o) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    public static final yg2.h0 i(yg2.h0 h0Var, yg2.o oVar) {
        yg2.a aVar;
        int i14;
        int i15;
        h0Var.getClass();
        oVar.getClass();
        yg2.a aVarF = f(h0Var, oVar);
        if (aVarF != null) {
            int iF = h0Var.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() + 1;
            if (new j23.l(aVarF.getStartStepIndex(), aVarF.getEndStepIndex()).d(iF)) {
                yg2.h0 h0VarS = s(oVar, iF);
                if (h0VarS == null || !h0VarS.f197048o) {
                    return h0VarS;
                }
                return n(aVarF, oVar) ? s(oVar, aVarF.getStartStepIndex()) : i(h0VarS, oVar);
            }
            int iIndexOf = oVar.b().indexOf(aVarF);
            if (iIndexOf == -1 || (i15 = iIndexOf + 1) >= oVar.b().size()) {
                int iIndexOf2 = oVar.c().indexOf(aVarF);
                aVar = (iIndexOf2 == -1 || (i14 = iIndexOf2 + 1) >= oVar.c().size()) ? null : oVar.c().get(i14);
            } else {
                aVar = oVar.b().get(i15);
            }
            if (aVar != null) {
                return s(oVar, aVar.getStartStepIndex());
            }
        }
        return null;
    }

    public static final j0 j(yg2.h0 h0Var, yg2.o oVar) {
        h0Var.getClass();
        oVar.getClass();
        if (b(oVar)) {
            return null;
        }
        yg2.h0 h0VarI = i(h0Var, oVar);
        if (h0VarI != null) {
            yg2.i0 i0Var = h0VarI.f197040g;
            return i0Var != null ? new j0.b(i0Var, yg2.v.a(h0VarI)) : new j0.a(yg2.v.a(h0VarI));
        }
        if (p(oVar)) {
            return !oVar.c().isEmpty() ? new j0.a(R.string.lbl_complete_skipped_groups) : new j0.a(R.string.lbl_end_of_workout);
        }
        return null;
    }

    public static final Integer k(yg2.h0 h0Var) {
        h0Var.getClass();
        lt2.a aVarD = h0Var.getDuration();
        if (aVarD != null) {
            return Integer.valueOf((int) aVarD.f114867b);
        }
        return null;
    }

    public static final ArrayList l(yg2.a aVar, yg2.o oVar) {
        aVar.getClass();
        oVar.getClass();
        i53.c<yg2.h0> cVarD = oVar.d();
        ArrayList arrayList = new ArrayList();
        for (yg2.h0 h0Var : cVarD) {
            j23.l lVar = new j23.l(aVar.getStartStepIndex(), aVar.getEndStepIndex());
            int iF = h0Var.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String();
            if (lVar.f96796a <= iF && iF <= lVar.f96797b) {
                arrayList.add(h0Var);
            }
        }
        return arrayList;
    }

    public static final boolean m(yg2.a aVar, yg2.o oVar) {
        aVar.getClass();
        oVar.getClass();
        ArrayList arrayListL = l(aVar, oVar);
        if (arrayListL.isEmpty()) {
            return false;
        }
        Iterator it = arrayListL.iterator();
        while (it.hasNext()) {
            if (((yg2.h0) it.next()).getStatus() == yg2.n.ACTIVE) {
                return true;
            }
        }
        return false;
    }

    public static final boolean n(yg2.a aVar, yg2.o oVar) {
        yg2.h0 next;
        lt2.b bVarJ;
        oVar.getClass();
        Iterator<yg2.h0> it = oVar.d().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            yg2.h0 h0Var = next;
            if (h0Var.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() >= aVar.getStartStepIndex() && h0Var.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() <= aVar.getEndStepIndex() && h0Var.f197048o) {
                break;
            }
        }
        yg2.h0 h0Var2 = next;
        if (h0Var2 == null || (bVarJ = h0Var2.getPrimaryTarget()) == null) {
            return false;
        }
        double d14 = bVarJ.f114871b;
        return Double.isNaN(d14) || aVar.f196937d < ((int) d14);
    }

    public static final boolean o(yg2.a aVar, yg2.o oVar) {
        aVar.getClass();
        oVar.getClass();
        i53.c<yg2.h0> cVarD = oVar.d();
        boolean z14 = false;
        if (cVarD == null || !cVarD.isEmpty()) {
            for (yg2.h0 h0Var : cVarD) {
                if (h0Var.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() >= aVar.getStartStepIndex() && h0Var.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() <= aVar.getEndStepIndex() && h0Var.getStatus() != yg2.n.COMPLETED && !h0Var.f197048o) {
                    z14 = true;
                    break;
                }
            }
        }
        return !z14;
    }

    public static final boolean p(yg2.o oVar) {
        yg2.h0 next;
        oVar.getClass();
        Iterator<yg2.h0> it = oVar.d().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.getStatus() != yg2.n.ACTIVE);
        yg2.h0 h0Var = next;
        yg2.a aVar = (yg2.a) p13.h0.n0(oVar.b());
        return (h0Var == null || aVar == null || aVar.getEndStepIndex() != h0Var.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() || n(aVar, oVar)) ? false : true;
    }

    public static final boolean q(yg2.h0 h0Var, boolean z14, rf2.l lVar, Float f14) {
        if ((lVar instanceof rf2.l.d) || (lVar instanceof rf2.l.b) || (lVar instanceof rf2.l.c)) {
            return (h0Var != null ? h0Var.getCom.garmin.android.gncs.NotificationConstants.KEY_DATA_MIME_TYPE java.lang.String() : null) == mt2.l.REST;
        }
        if (z14) {
            if (((int) (f14 != null ? f14.floatValue() : 0.0f)) % 2 == 1) {
                return true;
            }
        }
        return false;
    }

    public static final boolean r(yg2.a aVar, yg2.o oVar) {
        aVar.getClass();
        oVar.getClass();
        return oVar.c().contains(aVar);
    }

    public static final yg2.h0 s(yg2.o oVar, int i14) {
        yg2.h0 next;
        Iterator<yg2.h0> it = oVar.d().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (next.getCom.google.firebase.analytics.FirebaseAnalytics.Param.INDEX java.lang.String() == i14) {
                return next;
            }
        }
        next = null;
        return next;
    }
}
