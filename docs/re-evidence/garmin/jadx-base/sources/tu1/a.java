package tu1;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.v;
import androidx.lifecycle.i0;
import b21.n9;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.activities.model.ActivityListItemDTO;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import e23.p;
import f12.l;
import h4.r;
import i3.e5;
import j20.x;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.w3;
import l72.p2;
import org.apache.commons.lang3.StringUtils;
import org.joda.time.DateTime;
import org.joda.time.DateTimeConstants;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.s;
import p005kotlin.math.MathKt;
import p13.c0;
import p13.d0;
import p13.h0;
import p13.j0;
import p13.n0;
import p13.t0;
import p13.y;
import p3.m;
import p3.n;
import p3.o0;
import p3.x1;
import r22.m0;
import t70.a1;
import tn2.t;
import u1.w;
import vt1.o;
import wt1.q;
import ww1.a0;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: tu1.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C3133a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f166472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f166473b;

        static {
            int[] iArr = new int[gg0.f.values().length];
            try {
                iArr[gg0.f.f77134j.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[gg0.f.f77133i.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f166472a = iArr;
            int[] iArr2 = new int[o.values().length];
            try {
                iArr2[o.f180175f.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[o.f180176g.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f166473b = iArr2;
        }
    }

    public static final void A(ArrayList arrayList, List list, List list2, Long l14) {
        ActivityListItemDTO activityListItemDTO;
        Object next;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                d0.A(arrayList, new t((av1.d) it.next(), 9), true);
            }
        }
        Object obj = null;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList(y.r(list, 10));
            Iterator it3 = list.iterator();
            while (it3.hasNext()) {
                av1.d dVar = (av1.d) it3.next();
                if (list2 != null) {
                    Iterator it4 = list2.iterator();
                    do {
                        if (!it4.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it4.next();
                    } while (((ActivityListItemDTO) next).f29250b != dVar.getActivityId());
                    activityListItemDTO = (ActivityListItemDTO) next;
                } else {
                    activityListItemDTO = null;
                }
                arrayList2.add(iw1.a.b(v(dVar, activityListItemDTO), false, false, dVar.j(), s.g(activityListItemDTO != null ? Long.valueOf(activityListItemDTO.f29250b) : null, l14), false, false, false, -328833, 31));
            }
            obj = arrayList2;
        }
        if (obj == null) {
            obj = j0.f134944a;
        }
        arrayList.addAll((Collection) obj);
        if (arrayList.size() > 1) {
            c0.u(arrayList, new g());
        }
    }

    public static final Integer B(List<yw1.g> list) {
        int iH;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (true) {
            LocalDate localDateV = null;
            if (!it.hasNext()) {
                break;
            }
            String str = ((yw1.g) it.next()).f199922b;
            if (str != null) {
                try {
                    localDateV = g22.k.v(str, "yyyy-MM-dd");
                } catch (Exception unused) {
                }
            }
            if (localDateV != null) {
                arrayList.add(localDateV);
            }
        }
        if (arrayList.isEmpty() || arrayList.size() < 5 || (iH = h(arrayList)) < 5) {
            return null;
        }
        return Integer.valueOf(iH);
    }

    /* JADX WARN: Code duplicated, block: B:47:0x00ad  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(p2 p2Var, r rVar, String str, String str2, boolean z14, p pVar, e23.a aVar, m mVar, int i14, int i15) {
        p pVar2;
        int i16;
        o0 o0Var;
        r rVar2;
        p pVar3;
        p2Var.getClass();
        str.getClass();
        aVar.getClass();
        o0 o0VarE = mVar.E(-1497572991);
        int i17 = i14 | (o0VarE.B(p2Var) ? 4 : 2) | 48 | (o0VarE.B(str) ? 256 : 128) | (o0VarE.B(str2) ? 2048 : 1024) | 24576 | (o0VarE.h(z14) ? 131072 : 65536);
        int i18 = i15 & 32;
        if (i18 != 0) {
            i16 = i17 | 1572864;
            pVar2 = pVar;
        } else {
            pVar2 = pVar;
            i16 = i17 | (o0VarE.r(pVar2) ? ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288);
        }
        int i19 = i16 | (o0VarE.r(aVar) ? 8388608 : 4194304);
        if (o0VarE.n(i19 & 1, (4793491 & i19) != 4793490)) {
            r.a aVar2 = r.S;
            p pVar4 = i18 != 0 ? null : pVar2;
            x1 x1Var = n.f135158a;
            boolean z15 = (i19 & 29360128) == 8388608;
            Object objQ = o0VarE.q();
            if (z15) {
                objQ = new a1(aVar, 21);
                o0VarE.K(objQ);
            } else {
                m.f135153a.getClass();
                if (objQ == m.a.f135155b) {
                    objQ = new a1(aVar, 21);
                    o0VarE.K(objQ);
                }
            }
            r rVarD = w.d(aVar2, z14, null, null, (e23.a) objQ, 14);
            z3.e eVarC = z3.f.c(1054313908, new rw0.g(z14, 7), o0VarE);
            int i24 = i19 >> 6;
            int i25 = b92.a.f16960b;
            int i26 = i19 << 3;
            int i27 = (i24 & 112) | (i24 & 14) | 100663296 | 24576 | (i26 & 29360128);
            p2 p2Var2 = p2.f111205a;
            o0Var = o0VarE;
            p2Var.h(str, str2, null, rVarD, null, false, false, pVar4, eVarC, null, null, o0Var, i27, i26 & 112, 1636);
            rVar2 = aVar2;
            pVar3 = pVar4;
        } else {
            o0Var = o0VarE;
            o0Var.e();
            rVar2 = rVar;
            pVar3 = pVar2;
        }
        p3.p2 p2VarI0 = o0Var.i0();
        if (p2VarI0 != null) {
            p2VarI0.f135219d = new n9(p2Var, rVar2, str, str2, z14, pVar3, aVar, i14, i15);
        }
    }

    public static final void b(Context context, ArrayList arrayList) {
        String strG;
        LocalTime localTimeF;
        String string;
        long jDoubleValue;
        String quantityString;
        String strD;
        context.getClass();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            iw1.a aVar = (iw1.a) it.next();
            boolean z14 = aVar.f95318f;
            String str = aVar.f95336y;
            Double d14 = aVar.f95327n;
            String strD2 = null;
            if (z14) {
                jDoubleValue = d14 != null ? MathKt.d(d14.doubleValue()) : 0L;
                if (aVar.f95335x) {
                    strD2 = context.getString(R.string.lbl_stay_tuned_for_details);
                } else if (aVar.f95316d == null) {
                    l3.f23124b.getClass();
                    String strE1 = l3.a.e1(jDoubleValue);
                    String strK1 = l3.a.k1(new l22.a(context), true, (int) jDoubleValue);
                    com.garmin.android.apps.connectmobile.workouts.data.model.w wVar = aVar.f95324k0;
                    if (wVar != null) {
                        Resources resources = context.getResources();
                        resources.getClass();
                        strD2 = wVar.C(resources);
                    }
                    if (str != null) {
                        aVar.f95329p = x.d(strK1, StringUtils.SPACE, context.getString(R.string.bullet_point), StringUtils.SPACE, str);
                        strD = x.d(strE1, StringUtils.SPACE, context.getString(R.string.bullet_point), StringUtils.SPACE, str);
                    } else {
                        aVar.f95329p = strK1;
                        strD = strE1;
                    }
                    if (strD2 != null) {
                        aVar.f95329p = x.d(strK1, StringUtils.SPACE, context.getString(R.string.bullet_point), StringUtils.SPACE, strD2);
                        strD2 = x.d(strE1, StringUtils.SPACE, context.getString(R.string.bullet_point), StringUtils.SPACE, strD2);
                    } else {
                        strD2 = strD;
                    }
                }
            } else if (aVar.f95332t) {
                if (aVar.f95333v) {
                    jDoubleValue = d14 != null ? (long) d14.doubleValue() : 0L;
                    l3.f23124b.getClass();
                    int i14 = ((int) jDoubleValue) / DateTimeConstants.SECONDS_PER_HOUR;
                    String quantityString2 = "";
                    if (i14 > 0) {
                        quantityString = context.getResources().getQuantityString(R.plurals.lbl_duration_hour, i14, Integer.valueOf(i14));
                        quantityString.getClass();
                    } else {
                        quantityString = "";
                    }
                    int iL1 = l3.a.L1(jDoubleValue);
                    if (iL1 > 0) {
                        quantityString2 = context.getResources().getQuantityString(R.plurals.lbl_duration_minute, iL1, Integer.valueOf(iL1));
                        quantityString2.getClass();
                    }
                    strG = d53.w.i0(quantityString + StringUtils.SPACE + quantityString2).toString();
                } else {
                    og0.a aVar2 = og0.a.f131967a;
                    aVar2.getClass();
                    strG = e5.g(og0.a.i(aVar2, d14 != null ? d14.doubleValue() : 0.0d), StringUtils.SPACE, og0.a.u(context));
                }
                strD2 = strG;
                fg0.r rVar = aVar.f95334w;
                if (rVar != null && (localTimeF = rVar.f()) != null && (string = localTimeF.toString("hh:mm a")) != null) {
                    strD2 = x.d(strD2, StringUtils.SPACE, context.getString(R.string.bullet_point), StringUtils.SPACE, string);
                }
            }
            aVar.f95328o = strD2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0066  */
    public static final void c(ArrayList arrayList, List list) {
        fg0.j eventCustomization;
        Double dB;
        if (list == null || list.isEmpty()) {
            return;
        }
        ArrayList<iw1.a> arrayList2 = new ArrayList(y.r(list, 10));
        Iterator it = list.iterator();
        while (true) {
            boolean z14 = false;
            if (!it.hasNext()) {
                break;
            }
            fg0.k kVar = (fg0.k) it.next();
            kVar.getClass();
            LocalDate localDateNow = LocalDate.now();
            LocalDate date = kVar.getDate();
            if (date == null) {
                date = localDateNow;
            }
            og0.a aVar = og0.a.f131967a;
            date.getClass();
            fg0.r eventTimeLocal = kVar.getEventTimeLocal();
            aVar.getClass();
            DateTime dateTimeA = og0.a.a(date, eventTimeLocal);
            String strR = kVar.r(false);
            fg0.d completionTarget = kVar.getCompletionTarget();
            String shareableEventUuid = null;
            if (completionTarget == null || !completionTarget.o()) {
                fg0.d completionTarget2 = kVar.getCompletionTarget();
                if (completionTarget2 != null) {
                    dB = completionTarget2.b();
                } else {
                    dB = null;
                }
            } else {
                fg0.d completionTarget3 = kVar.getCompletionTarget();
                if (completionTarget3 != null) {
                    dB = completionTarget3.g();
                } else {
                    dB = null;
                }
            }
            fg0.d completionTarget4 = kVar.getCompletionTarget();
            if (completionTarget4 != null && completionTarget4.o()) {
                z14 = true;
            }
            fg0.r eventTimeLocal2 = kVar.getEventTimeLocal();
            boolean zIsAfter = date.isAfter(localDateNow);
            Long l14 = kVar.n0() ? kVar.getCom.google.android.exoplayer2.text.ttml.TtmlNode.ATTR_ID java.lang.String() : null;
            if (!kVar.n0()) {
                shareableEventUuid = kVar.getShareableEventUuid();
            }
            arrayList2.add(new iw1.a(dateTimeA, strR, dB, z14, eventTimeLocal2, l14, shareableEventUuid, kVar, zIsAfter, true));
        }
        for (iw1.a aVar2 : arrayList2) {
            Iterator it3 = arrayList.iterator();
            int i14 = 0;
            while (true) {
                if (!it3.hasNext()) {
                    i14 = -1;
                    break;
                }
                iw1.a aVar3 = (iw1.a) it3.next();
                DateTime dateTime = aVar3.f95330q;
                if (dateTime != null && g22.k.f(dateTime, aVar2.f95330q) && !aVar3.f95321i) {
                    break;
                } else {
                    i14++;
                }
            }
            if (i14 != -1) {
                iw1.a aVar4 = (iw1.a) arrayList.get(i14);
                fg0.k kVar2 = aVar4.E;
                boolean zG = (kVar2 == null || (eventCustomization = kVar2.getEventCustomization()) == null) ? false : s.g(eventCustomization.getIsPrimaryEvent(), Boolean.TRUE);
                boolean z15 = (aVar4.f95318f || aVar4.f95319g || !s.g(aVar4.Y, "EVENT_DAY")) ? false : true;
                if (aVar4.f95320h || ((z15 && !zG) || (aVar4.f95335x && aVar4.E == null))) {
                    arrayList.set(i14, aVar2);
                } else {
                    arrayList.add(aVar2);
                }
            } else {
                arrayList.add(aVar2);
            }
        }
        if (arrayList.size() > 1) {
            c0.u(arrayList, new b());
        }
    }

    public static final boolean d(int i14, int i15, List list) {
        int i16;
        list.getClass();
        if (list.isEmpty()) {
            i16 = 0;
        } else {
            Iterator it = list.iterator();
            i16 = 0;
            while (it.hasNext()) {
                if (((mv1.f) it.next()).f121194c && (i16 = i16 + 1) < 0) {
                    p13.x.p();
                    throw null;
                }
            }
        }
        return i14 <= i16 && i16 <= i15;
    }

    public static final jv1.o e(j61.f fVar, List<? extends jv1.o> list) {
        list.getClass();
        Object obj = null;
        if (fVar.getElevationGainMeter() != null) {
            for (Object obj2 : list) {
                if (((jv1.o) obj2) instanceof jv1.o.a) {
                    obj = obj2;
                    break;
                }
            }
            return (jv1.o) obj;
        }
        if (fVar.getElevationProfileType() == null) {
            return null;
        }
        for (Object obj3 : list) {
            if (s.g(((jv1.o) obj3).f101105a, fVar.getElevationProfileType())) {
                obj = obj3;
                break;
            }
        }
        return (jv1.o) obj;
    }

    public static final List<iw1.a> f(List<iw1.a> list, DateTime dateTime) {
        Object next;
        ArrayList arrayListL = androidx.core.view.j.l(list);
        for (Object obj : list) {
            iw1.a aVar = (iw1.a) obj;
            if (g22.k.f(dateTime, aVar.f95330q) && aVar.F != null && aVar.T > -1) {
                arrayListL.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayListL) {
            Integer numValueOf = Integer.valueOf(((iw1.a) obj2).T);
            Object arrayList = linkedHashMap.get(numValueOf);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(numValueOf, arrayList);
            }
            ((List) arrayList).add(obj2);
        }
        Iterator it = linkedHashMap.values().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((List) next).size() <= 1);
        List<iw1.a> list2 = (List) next;
        return list2 == null ? j0.f134944a : list2;
    }

    public static final ArrayList g(List list, DateTime dateTime) {
        ArrayList arrayListL = androidx.core.view.j.l(list);
        for (Object obj : list) {
            iw1.a aVar = (iw1.a) obj;
            if (g22.k.f(dateTime, aVar.f95330q) && aVar.P && aVar.f95318f && aVar.f95316d == null && !aVar.f95335x) {
                arrayListL.add(obj);
            }
        }
        return arrayListL;
    }

    public static final int h(ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return 0;
        }
        List listM0 = h0.M0(h0.b1(h0.f1(arrayList)));
        int size = listM0.size();
        int iMax = 1;
        int i14 = 1;
        for (int i15 = 1; i15 < size; i15++) {
            if (s.g(listM0.get(i15), ((LocalDate) listM0.get(i15 - 1)).plusDays(1))) {
                i14++;
                iMax = Math.max(iMax, i14);
            } else {
                i14 = 1;
            }
        }
        return iMax;
    }

    public static final double i(List<com.garmin.android.apps.connectmobile.workouts.data.model.f> list) {
        Object next;
        list.getClass();
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((com.garmin.android.apps.connectmobile.workouts.data.model.f) next).getName() != m52.i.HALF_IRON);
        com.garmin.android.apps.connectmobile.workouts.data.model.f fVar = (com.garmin.android.apps.connectmobile.workouts.data.model.f) next;
        if (fVar == null) {
            return 0.0d;
        }
        i.a aVar = i.f166483a;
        og0.a aVar2 = og0.a.f131967a;
        List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listF = fVar.f();
        aVar2.getClass();
        return i.a.i(aVar, og0.a.D(listF)).f96788b;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x004b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    public static final int j(jv1.h hVar, o oVar, boolean z14, boolean z15) {
        int i14;
        boolean z16;
        if (hVar instanceof jv1.g) {
            jv1.g gVar = (jv1.g) hVar;
            og0.a aVar = og0.a.f131967a;
            Double d14 = gVar.f101057a;
            double dDoubleValue = d14 != null ? d14.doubleValue() : 0.0d;
            gg0.i iVar = gVar.f101058b;
            if (iVar == null) {
                iVar = gg0.i.METER;
            }
            aVar.getClass();
            double dG = og0.a.g(dDoubleValue, iVar);
            i14 = oVar != null ? C3133a.f166473b[oVar.ordinal()] : -1;
            if (i14 == 1 ? dG >= 15000.0d : i14 != 2 || dG >= 50000.0d) {
                z16 = z15;
            }
            if (z16 && !z14) {
                return 3;
            }
            if (z16 && z14) {
                return 4;
            }
            if (!z16 && !z14) {
                return 4;
            }
        } else if (hVar instanceof jv1.i) {
            double d15 = ((jv1.i) hVar).f101059c;
            i14 = oVar != null ? C3133a.f166473b[oVar.ordinal()] : -1;
            if (i14 == 1 ? ((int) d15) >= 5400 : i14 != 2 || ((int) d15) >= 8100) {
                z16 = z15;
            }
            if (z16 && !z14) {
                return 3;
            }
            if (z16 && z14) {
                return 4;
            }
            if (!z16 && !z14) {
                return 4;
            }
        } else if (hVar == null && z15) {
            return z14 ? 4 : 3;
        }
        return 5;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x005f  */
    /* JADX WARN: Code duplicated, block: B:31:? A[RETURN, SYNTHETIC] */
    public static final m52.i k(List<com.garmin.android.apps.connectmobile.workouts.data.model.f> list, double d14) {
        m52.i name;
        ArrayList<com.garmin.android.apps.connectmobile.workouts.data.model.f> arrayListL = androidx.core.view.j.l(list);
        for (Object obj : list) {
            com.garmin.android.apps.connectmobile.workouts.data.model.f fVar = (com.garmin.android.apps.connectmobile.workouts.data.model.f) obj;
            if (fVar.getName() != m52.i.FULL_IRON && fVar.getName() != m52.i.CUSTOM) {
                arrayListL.add(obj);
            }
        }
        for (com.garmin.android.apps.connectmobile.workouts.data.model.f fVar2 : arrayListL) {
            i.a aVar = i.f166483a;
            og0.a aVar2 = og0.a.f131967a;
            List<com.garmin.android.apps.connectmobile.workouts.data.model.k> listF = fVar2.f();
            aVar2.getClass();
            if (i.a.i(aVar, og0.a.D(listF)).contains(Double.valueOf(d14))) {
                name = fVar2.getName();
                if (name == null) {
                    return m52.i.CUSTOM;
                }
                return name;
            }
        }
        name = null;
        if (name == null) {
            return m52.i.CUSTOM;
        }
        return name;
    }

    public static final boolean l(jv1.h hVar) {
        if (hVar instanceof jv1.g) {
            return ((jv1.g) hVar).a() > ((double) (mg0.b.c() ? 160000 : 160934)) * 1.05d;
        }
        return false;
    }

    public static final boolean m(jv1.h hVar) {
        if (!(hVar instanceof jv1.g)) {
            return false;
        }
        jv1.g gVar = (jv1.g) hVar;
        return gVar.f101054c == vt1.n.OTHER && gVar.a() > ((double) vt1.n.MARATHON.f180173c) * 1.05d;
    }

    public static final boolean n(List<com.garmin.android.apps.connectmobile.workouts.data.model.f> list, double d14) {
        list.getClass();
        return k(list, d14) == m52.i.HALF_IRON || d14 > i(list);
    }

    public static final boolean o(LocalDate localDate, LocalDate localDate2, LocalDate localDate3) {
        localDate2.getClass();
        localDate3.getClass();
        if (localDate.isAfter(localDate2) || g22.k.g(localDate, localDate2)) {
            return g22.k.g(localDate, localDate3) || localDate.isBefore(localDate3);
        }
        return false;
    }

    public static final void p(View view2, int i14, z3.e eVar) {
        ComposeView composeView = (ComposeView) view2.findViewById(i14);
        composeView.setViewCompositionStrategy(w3.d.f91628b);
        composeView.setContent(new z3.e(-196365223, true, new aa2.o(eVar, 14)));
    }

    public static final void q(Context context, v vVar, i0 i0Var, View view2, e23.a aVar) {
        context.getClass();
        ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).b1(false);
        m0.a.d(m0.f149759e, R.drawable.home_blue_bg_large, context.getString(R.string.lbl_add_to_home_screen), context.getString(R.string.msg_add_to_home_screen), R.string.lbl_add_to_home, new ew2.c(i0Var, view2, context, aVar, 20), R.string.not_now_lbl, null, null, 1984).show(vVar, (String) null);
    }

    public static final ArrayList r(ArrayList arrayList) {
        ArrayList arrayListD1 = h0.d1(q.f187129o);
        gg1.m mVarE1 = ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).e1();
        if (mVarE1 == gg1.m.SUNDAY) {
            Collections.rotate(arrayListD1, -1);
        } else if (mVarE1 == gg1.m.MONDAY) {
            Collections.rotate(arrayListD1, -2);
        }
        n0 n0VarJ1 = h0.j1(arrayListD1);
        int iA = t0.a(y.r(n0VarJ1, 10));
        if (iA < 16) {
            iA = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iA);
        Iterator it = n0VarJ1.iterator();
        while (true) {
            p13.o0 o0Var = (p13.o0) it;
            if (!o0Var.f134956a.hasNext()) {
                return h0.d1(h0.N0(arrayList, new e(linkedHashMap)));
            }
            p13.m0 m0Var = (p13.m0) o0Var.next();
            o13.p pVar = new o13.p(m0Var.f134952b, Integer.valueOf(m0Var.f134951a));
            linkedHashMap.put(pVar.f128594a, pVar.f128595b);
        }
    }

    public static final ArrayList s(List list) {
        Object next;
        ArrayList arrayList = new ArrayList(y.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tw1.a aVar = (tw1.a) it.next();
            Boolean currentPhase = aVar.getCurrentPhase();
            DateTime dateTimeH = aVar.h();
            DateTime dateTimeF = aVar.f();
            a0.a aVar2 = a0.f187707c;
            String trainingPhase = aVar.getTrainingPhase();
            aVar2.getClass();
            Iterator<T> it3 = a0.f187717m.iterator();
            do {
                if (!it3.hasNext()) {
                    next = null;
                    break;
                }
                next = it3.next();
            } while (!s.g(((a0) next).f187718a, trainingPhase));
            arrayList.add(new ww1.x(currentPhase, dateTimeH, dateTimeF, (a0) next));
        }
        return new ArrayList(arrayList);
    }

    public static final vt1.d t(fg0.k kVar) {
        kVar.getClass();
        gg0.f eventType = kVar.getEventType();
        if (eventType == null || !eventType.e()) {
            return null;
        }
        gg0.f eventType2 = kVar.getEventType();
        int i14 = eventType2 == null ? -1 : C3133a.f166472a[eventType2.ordinal()];
        if (i14 != 1) {
            return i14 != 2 ? vt1.d.f180091d : vt1.d.f180093f;
        }
        return vt1.d.f180092e;
    }

    public static final jv1.h u(fg0.k kVar) {
        gg0.i unit;
        Double value;
        gg0.i unit2;
        Double value2;
        kVar.getClass();
        fg0.d completionTarget = kVar.getCompletionTarget();
        double dDoubleValue = 0.0d;
        if (completionTarget == null || !completionTarget.m()) {
            fg0.d completionTarget2 = kVar.getCompletionTarget();
            if (completionTarget2 != null && (value = completionTarget2.getValue()) != null) {
                dDoubleValue = value.doubleValue();
            }
            fg0.d completionTarget3 = kVar.getCompletionTarget();
            if (completionTarget3 == null || (unit = completionTarget3.getUnit()) == null) {
                unit = gg0.i.SECOND;
            }
            return new jv1.i(dDoubleValue, unit);
        }
        gg0.f eventType = kVar.getEventType();
        vt1.n nVarV1 = (eventType == null || !eventType.f()) ? vt1.n.OTHER : kVar.v1();
        fg0.d completionTarget4 = kVar.getCompletionTarget();
        if (completionTarget4 != null && (value2 = completionTarget4.getValue()) != null) {
            dDoubleValue = value2.doubleValue();
        }
        fg0.d completionTarget5 = kVar.getCompletionTarget();
        if (completionTarget5 == null || (unit2 = completionTarget5.getUnit()) == null) {
            unit2 = gg0.i.METER;
        }
        return new jv1.g(nVarV1, unit2, Double.valueOf(dDoubleValue));
    }

    public static final iw1.a v(av1.d dVar, ActivityListItemDTO activityListItemDTO) {
        dVar.getClass();
        Long workoutId = dVar.getWorkoutId();
        Long lValueOf = Long.valueOf(dVar.getActivityId());
        boolean zQ = dVar.q();
        String name = dVar.getName();
        Double dValueOf = Double.valueOf(dVar.getDuration());
        DateTime dateTimeJ = dVar.j();
        DateTime dateTimeJ2 = dVar.j();
        Double dValueOf2 = Double.valueOf(dVar.getDistance());
        Integer workoutGroupEnumerator = dVar.getWorkoutGroupEnumerator();
        return new iw1.a(workoutId, lValueOf, zQ, name, dValueOf, dateTimeJ, dateTimeJ2, dValueOf2, false, activityListItemDTO, true, workoutGroupEnumerator != null ? workoutGroupEnumerator.intValue() : -1, 256, null);
    }

    public static final o w(fg0.k kVar) {
        kVar.getClass();
        gg0.f eventType = kVar.getEventType();
        if (eventType != null && eventType.e()) {
            return o.f180176g;
        }
        gg0.f eventType2 = kVar.getEventType();
        return (eventType2 == null || !eventType2.g()) ? o.f180175f : o.f180178i;
    }

    public static final ArrayList x(List list) {
        ArrayList arrayListL = androidx.core.view.j.l(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            mv1.f fVar = (mv1.f) it.next();
            String str = fVar.f121194c ? fVar.f121192a.f187130a : null;
            if (str != null) {
                arrayListL.add(str);
            }
        }
        return arrayListL;
    }

    public static final ArrayList y(List list, boolean z14) {
        DateTime dateTimeB;
        m52.k kVar;
        boolean z15;
        tw1.g sportType;
        Integer estimatedDurationInSecs;
        DateTime dateTimeWithTimeAtStartOfDay;
        DateTime dateTimeWithTimeAtStartOfDay2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            tw1.r rVar = (tw1.r) it.next();
            rVar.getClass();
            DateTime dateTimeB2 = rVar.b();
            boolean z16 = (dateTimeB2 == null || (dateTimeWithTimeAtStartOfDay2 = dateTimeB2.withTimeAtStartOfDay()) == null || !g22.k.c(dateTimeWithTimeAtStartOfDay2)) ? false : true;
            tw1.j taskWorkout = rVar.getTaskWorkout();
            boolean z17 = taskWorkout != null && taskWorkout.z();
            DateTime dateTimeB3 = rVar.b();
            Boolean boolValueOf = (dateTimeB3 == null || (dateTimeWithTimeAtStartOfDay = dateTimeB3.withTimeAtStartOfDay()) == null) ? null : Boolean.valueOf(dateTimeWithTimeAtStartOfDay.isAfterNow());
            tw1.j taskWorkout2 = rVar.getTaskWorkout();
            boolean z18 = (taskWorkout2 != null ? s.g(taskWorkout2.getRestDay(), Boolean.TRUE) : false) || rVar.getTaskWorkout() == null || !(z14 || z17 || !z16);
            tw1.j taskWorkout3 = rVar.getTaskWorkout();
            Long lValueOf = taskWorkout3 != null ? Long.valueOf(taskWorkout3.getWorkoutId()) : null;
            tw1.j taskWorkout4 = rVar.getTaskWorkout();
            String workoutUuid = taskWorkout4 != null ? taskWorkout4.getWorkoutUuid() : null;
            tw1.j taskWorkout5 = rVar.getTaskWorkout();
            Long workoutScheduleId = taskWorkout5 != null ? taskWorkout5.getWorkoutScheduleId() : null;
            tw1.j taskWorkout6 = rVar.getTaskWorkout();
            Long associatedActivityId = taskWorkout6 != null ? taskWorkout6.getAssociatedActivityId() : null;
            Integer weekId = rVar.getWeekId();
            tw1.j taskWorkout7 = rVar.getTaskWorkout();
            boolean z19 = g22.n.d(taskWorkout7 != null ? taskWorkout7.getWorkoutName() : null) && !z18;
            boolean zG = rVar.g();
            tw1.j taskWorkout8 = rVar.getTaskWorkout();
            String workoutName = taskWorkout8 != null ? taskWorkout8.getWorkoutName() : null;
            tw1.j taskWorkout9 = rVar.getTaskWorkout();
            Double dValueOf = (taskWorkout9 == null || (estimatedDurationInSecs = taskWorkout9.getEstimatedDurationInSecs()) == null) ? null : Double.valueOf(estimatedDurationInSecs.intValue());
            tw1.j taskWorkout10 = rVar.getTaskWorkout();
            if (taskWorkout10 == null || (dateTimeB = taskWorkout10.j()) == null) {
                dateTimeB = rVar.b();
            }
            DateTime dateTime = dateTimeB;
            tw1.j taskWorkout11 = rVar.getTaskWorkout();
            DateTime dateTimeB4 = taskWorkout11 != null ? taskWorkout11.b() : null;
            boolean z24 = z18 && s.g(boolValueOf, Boolean.TRUE);
            tw1.j taskWorkout12 = rVar.getTaskWorkout();
            String workoutDescription = taskWorkout12 != null ? taskWorkout12.getWorkoutDescription() : null;
            tw1.j taskWorkout13 = rVar.getTaskWorkout();
            if (((taskWorkout13 == null || (sportType = taskWorkout13.getSportType()) == null) ? null : sportType.getSportTypeId()) != null) {
                m52.k.a aVar = m52.k.f116753m;
                int iIntValue = rVar.getTaskWorkout().getSportType().getSportTypeId().intValue();
                aVar.getClass();
                m52.k[] kVarArrValues = m52.k.values();
                int length = kVarArrValues.length;
                int i14 = 0;
                while (true) {
                    if (i14 >= length) {
                        kVar = null;
                        break;
                    }
                    kVar = kVarArrValues[i14];
                    if (kVar.f116766b == iIntValue) {
                        break;
                    }
                    i14++;
                }
                if (kVar == null) {
                    kVar = m52.k.f116756p;
                }
            } else {
                kVar = m52.k.f116756p;
            }
            m52.k kVar2 = kVar;
            tw1.j taskWorkout14 = rVar.getTaskWorkout();
            String workoutPhrase = taskWorkout14 != null ? taskWorkout14.getWorkoutPhrase() : null;
            tw1.j taskWorkout15 = rVar.getTaskWorkout();
            iw1.a aVar2 = new iw1.a(lValueOf, workoutUuid, workoutScheduleId, associatedActivityId, weekId, z19, false, z18, false, false, z17, null, workoutName, dValueOf, null, null, dateTime, dateTimeB4, false, false, null, z24, workoutDescription, null, false, true, null, null, null, null, kVar2, zG, 0, false, workoutPhrase, false, taskWorkout15 != null ? taskWorkout15.getRunWalkDescription() : null, 1033371712, 11, null);
            if (aVar2.f95320h) {
                if (!arrayList.isEmpty()) {
                    Iterator it3 = arrayList.iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            z15 = true;
                            break;
                        }
                        iw1.a aVar3 = (iw1.a) it3.next();
                        if (aVar3.f95320h && g22.k.f(aVar3.f95330q, aVar2.f95330q)) {
                            z15 = false;
                            break;
                        }
                    }
                } else {
                    z15 = true;
                    break;
                }
                if (z15) {
                    arrayList.add(aVar2);
                }
            } else {
                arrayList.add(aVar2);
            }
        }
        if (arrayList.size() > 1) {
            c0.u(arrayList, new f());
        }
        return arrayList;
    }

    public static final tw1.t z(jv1.c cVar) {
        Object next;
        boolean zEqualsIgnoreCase;
        fx1.d.a aVar = fx1.d.f73833c;
        String strName = cVar.name();
        aVar.getClass();
        strName.getClass();
        Iterator<T> it = fx1.d.f73837g.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String strName2 = ((fx1.d) next).name();
            if (strName2 != null) {
                zEqualsIgnoreCase = strName2.equalsIgnoreCase(strName);
            } else if (strName2 != strName) {
                if (strName2 != null && strName2.length() == strName.length()) {
                    int length = strName2.length();
                    int i14 = 0;
                    while (true) {
                        if (i14 >= length) {
                            zEqualsIgnoreCase = true;
                        } else if (d53.b.d(strName2.charAt(i14), strName.charAt(i14), true)) {
                            i14++;
                        }
                    }
                }
                zEqualsIgnoreCase = false;
            } else {
                zEqualsIgnoreCase = true;
            }
        } while (!zEqualsIgnoreCase);
        fx1.d dVar = (fx1.d) next;
        if (dVar != null) {
            return new tw1.t(Integer.valueOf(dVar.f73838a), dVar.f73839b);
        }
        return null;
    }
}
