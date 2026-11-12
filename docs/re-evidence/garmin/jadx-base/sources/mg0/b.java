package mg0;

import android.content.Context;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.data.model.k;
import f12.l;
import fg0.d;
import fg0.j;
import gg0.h;
import gg0.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import o13.p;
import org.koin.java.KoinJavaComponent;
import p005kotlin.jvm.internal.y0;
import p13.c0;

/* JADX INFO: loaded from: classes8.dex */
public final class b {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f118370a;

        static {
            int[] iArr = new int[m52.c.values().length];
            try {
                iArr[m52.c.SWIMMING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[m52.c.OPEN_WATER_SWIMMING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[m52.c.LAP_SWIMMING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[m52.c.CYCLING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f118370a = iArr;
        }
    }

    public static final b92.a a(String str) {
        b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
        c0235a.f16962a.put("label_secondary", str);
        return c0235a.b();
    }

    public static final ArrayList b(Context context, List list, List list2, boolean z14) {
        String string;
        Object next;
        Object next2;
        Object next3;
        Object next4;
        Object next5;
        Object next6;
        m52.c eventLegActivityType;
        Integer transitionOutDurationSeconds;
        Integer transitionOutDurationSeconds2;
        m52.c eventLegActivityType2;
        Integer transitionOutDurationSeconds3;
        Integer transitionOutDurationSeconds4;
        m52.c eventLegActivityType3;
        k kVar;
        context.getClass();
        list.getClass();
        list2.getClass();
        ArrayList arrayList = new ArrayList();
        String string2 = context.getString(R.string.lbl_leg);
        string2.getClass();
        Iterator it = list.iterator();
        do {
            string = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            kVar = (k) next;
            if (kVar.getEventLegActivityType() == m52.c.SWIMMING || kVar.getEventLegActivityType() == m52.c.OPEN_WATER_SWIMMING) {
                break;
            }
        } while (kVar.getEventLegActivityType() != m52.c.LAP_SWIMMING);
        k kVar2 = (k) next;
        Iterator it3 = list2.iterator();
        while (true) {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
            com.garmin.android.apps.connectmobile.workouts.data.model.c cVar = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next2;
            if (kVar2 != null && cVar.getLegIndex() == kVar2.getLegIndex()) {
                break;
            }
        }
        com.garmin.android.apps.connectmobile.workouts.data.model.c cVar2 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next2;
        String string3 = context.getString(R.string.string_space_string_pattern, (kVar2 == null || (eventLegActivityType3 = kVar2.getEventLegActivityType()) == null) ? null : context.getString(eventLegActivityType3.f116677c), string2);
        string3.getClass();
        String string4 = context.getString(R.string.activity_transition_name_label, 1);
        string4.getClass();
        p<String, String> pVarT = og0.a.f131967a.t(context, kVar2, cVar2, m52.c.SWIMMING, z14);
        arrayList.add(new mg0.a(string3, pVarT.f128594a, a(pVarT.f128595b), R.drawable.swim_pool, kVar2, cVar2));
        l3.a aVar = l3.f23124b;
        Long lValueOf = (cVar2 == null || (transitionOutDurationSeconds4 = cVar2.getTransitionOutDurationSeconds()) == null) ? null : Long.valueOf(transitionOutDurationSeconds4.intValue());
        aVar.getClass();
        String strG1 = l3.a.g1(lValueOf);
        int iIntValue = 0;
        arrayList.add(new mg0.a(string4, strG1 == null ? "" : strG1, a(l3.a.k1(new l22.a(context), true, (cVar2 == null || (transitionOutDurationSeconds3 = cVar2.getTransitionOutDurationSeconds()) == null) ? 0 : transitionOutDurationSeconds3.intValue())), R.drawable.multisport_transition, null, cVar2, 16, null));
        Iterator it4 = list.iterator();
        do {
            if (!it4.hasNext()) {
                next3 = null;
                break;
            }
            next3 = it4.next();
        } while (((k) next3).getEventLegActivityType() != m52.c.CYCLING);
        k kVar3 = (k) next3;
        Iterator it5 = list2.iterator();
        while (true) {
            if (!it5.hasNext()) {
                next4 = null;
                break;
            }
            next4 = it5.next();
            com.garmin.android.apps.connectmobile.workouts.data.model.c cVar3 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
            if (kVar3 != null && cVar3.getLegIndex() == kVar3.getLegIndex()) {
                break;
            }
        }
        com.garmin.android.apps.connectmobile.workouts.data.model.c cVar4 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next4;
        Integer numValueOf = (kVar3 == null || (eventLegActivityType2 = kVar3.getEventLegActivityType()) == null) ? null : Integer.valueOf(eventLegActivityType2.f116677c);
        numValueOf.getClass();
        String string5 = context.getString(R.string.string_space_string_pattern, context.getString(numValueOf.intValue()), string2);
        string5.getClass();
        p<String, String> pVarT2 = og0.a.f131967a.t(context, kVar3, cVar4, m52.c.CYCLING, z14);
        String string6 = context.getString(R.string.activity_transition_name_label, 2);
        string6.getClass();
        arrayList.add(new mg0.a(string5, pVarT2.f128594a, a(pVarT2.f128595b), R.drawable.bike, kVar3, cVar4));
        l3.a aVar2 = l3.f23124b;
        Long lValueOf2 = (cVar4 == null || (transitionOutDurationSeconds2 = cVar4.getTransitionOutDurationSeconds()) == null) ? null : Long.valueOf(transitionOutDurationSeconds2.intValue());
        aVar2.getClass();
        String strG2 = l3.a.g1(lValueOf2);
        String str = strG2 == null ? "" : strG2;
        l22.a aVar3 = new l22.a(context);
        if (cVar4 != null && (transitionOutDurationSeconds = cVar4.getTransitionOutDurationSeconds()) != null) {
            iIntValue = transitionOutDurationSeconds.intValue();
        }
        arrayList.add(new mg0.a(string6, str, a(l3.a.k1(aVar3, true, iIntValue)), R.drawable.multisport_transition, null, cVar4, 16, null));
        Iterator it6 = list.iterator();
        do {
            if (!it6.hasNext()) {
                next5 = null;
                break;
            }
            next5 = it6.next();
        } while (((k) next5).getEventLegActivityType() != m52.c.RUNNING);
        k kVar4 = (k) next5;
        Iterator it7 = list2.iterator();
        while (true) {
            if (!it7.hasNext()) {
                next6 = null;
                break;
            }
            next6 = it7.next();
            com.garmin.android.apps.connectmobile.workouts.data.model.c cVar5 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
            if (kVar4 != null && cVar5.getLegIndex() == kVar4.getLegIndex()) {
                break;
            }
        }
        com.garmin.android.apps.connectmobile.workouts.data.model.c cVar6 = (com.garmin.android.apps.connectmobile.workouts.data.model.c) next6;
        if (kVar4 != null && (eventLegActivityType = kVar4.getEventLegActivityType()) != null) {
            string = context.getString(eventLegActivityType.f116677c);
        }
        String string7 = context.getString(R.string.string_space_string_pattern, string, string2);
        string7.getClass();
        p<String, String> pVarT3 = og0.a.f131967a.t(context, kVar4, cVar6, m52.c.RUNNING, z14);
        arrayList.add(new mg0.a(string7, pVarT3.f128594a, a(pVarT3.f128595b), R.drawable.run, kVar4, cVar6));
        return arrayList;
    }

    public static final boolean c() {
        return ((l) KoinJavaComponent.get$default(l.class, null, null, 6, null)).y();
    }

    public static final void d(fg0.k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.c cVar) {
        List<com.garmin.android.apps.connectmobile.workouts.data.model.c> listH;
        kVar.getClass();
        j eventCustomization = kVar.getEventCustomization();
        ArrayList arrayList = (eventCustomization == null || (listH = eventCustomization.h()) == null) ? new ArrayList() : new ArrayList(listH);
        j eventCustomization2 = kVar.getEventCustomization();
        y0.a(arrayList).remove(eventCustomization2 != null ? eventCustomization2.g(Integer.valueOf(cVar.getLegIndex())) : null);
        arrayList.add(cVar);
        if (arrayList.size() > 1) {
            c0.u(arrayList, new c());
        }
        j eventCustomization3 = kVar.getEventCustomization();
        kVar.E0(eventCustomization3 != null ? j.b(eventCustomization3, null, arrayList, null, null, null, null, 8189) : null);
        e(kVar);
    }

    public static final void e(fg0.k kVar) {
        List<com.garmin.android.apps.connectmobile.workouts.data.model.c> listH;
        kVar.getClass();
        j eventCustomization = kVar.getEventCustomization();
        double d14 = 0.0d;
        if (eventCustomization != null && (listH = eventCustomization.h()) != null) {
            double dIntValue = 0.0d;
            for (com.garmin.android.apps.connectmobile.workouts.data.model.c cVar : listH) {
                og0.a aVar = og0.a.f131967a;
                Double value = cVar.getValue();
                double dDoubleValue = value != null ? value.doubleValue() : 0.0d;
                i unit = cVar.getUnit();
                if (unit == null) {
                    unit = i.SECOND;
                }
                aVar.getClass();
                double dJ = og0.a.j(dDoubleValue, unit) + dIntValue;
                Integer transitionOutDurationSeconds = cVar.getTransitionOutDurationSeconds();
                dIntValue = (transitionOutDurationSeconds != null ? transitionOutDurationSeconds.intValue() : 0.0d) + dJ;
            }
            d14 = dIntValue;
        }
        j eventCustomization2 = kVar.getEventCustomization();
        if (eventCustomization2 != null) {
            eventCustomization2.F(new d(Double.valueOf(d14), i.SECOND, h.TIME));
        }
    }
}
