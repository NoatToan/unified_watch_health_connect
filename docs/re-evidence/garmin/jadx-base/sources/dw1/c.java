package dw1;

import android.content.Context;
import c22.l3;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.workouts.data.model.k;
import gg0.g;
import gg0.h;
import i3.e5;
import jv1.t;
import o13.p;
import org.apache.commons.lang3.StringUtils;
import u4.d;
import u62.o2;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f61445a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f61446b;

        static {
            int[] iArr = new int[g.values().length];
            try {
                iArr[g.FINISH_WITH_LEG_TIME_GOALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[g.FINISH_WITH_AN_OVERALL_GOAL_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f61445a = iArr;
            int[] iArr2 = new int[h.values().length];
            try {
                iArr2[h.DISTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[h.TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f61446b = iArr2;
        }
    }

    public static final t a(Context context, k kVar, com.garmin.android.apps.connectmobile.workouts.data.model.c cVar, m52.c cVar2, d dVar) {
        cVar2.getClass();
        p<String, String> pVarT = og0.a.f131967a.t(context, kVar, cVar, cVar2, false);
        String str = pVarT.f128594a;
        String str2 = pVarT.f128595b;
        String strG = e5.g(context.getString(cVar2.f116677c), StringUtils.SPACE, context.getString(R.string.lbl_leg));
        b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
        c0235a.f16962a.put("text", str2);
        return new t(strG, str, c0235a.b(), false, str.length() > 0, dVar, false, null, "navigateToTriathlonEditGoalSelection", cVar2, 200, null);
    }

    public static final t b(Context context, com.garmin.android.apps.connectmobile.workouts.data.model.c cVar, int i14) {
        Integer transitionOutDurationSeconds;
        Integer transitionOutDurationSeconds2;
        String string = context.getString(R.string.activity_transition_name_label, Integer.valueOf(i14));
        string.getClass();
        l3.a aVar = l3.f23124b;
        Long lValueOf = (cVar == null || (transitionOutDurationSeconds2 = cVar.getTransitionOutDurationSeconds()) == null) ? null : Long.valueOf(transitionOutDurationSeconds2.intValue());
        aVar.getClass();
        String strG1 = l3.a.g1(lValueOf);
        boolean z14 = false;
        String strK1 = l3.a.k1(new l22.a(context), true, (cVar == null || (transitionOutDurationSeconds = cVar.getTransitionOutDurationSeconds()) == null) ? 0 : transitionOutDurationSeconds.intValue());
        String str = strG1 == null ? "" : strG1;
        b92.a.C0235a c0235a = new b92.a.C0235a(null, 1, null);
        c0235a.f16962a.put("text", strK1);
        b92.a aVarB = c0235a.b();
        if (strG1 != null && strG1.length() > 0) {
            z14 = true;
        }
        boolean z15 = z14;
        p pVar = new p(string, cVar);
        s62.a.f157643a.getClass();
        return new t(string, str, aVarB, false, z15, o2.a(t62.a.f162797a), false, null, "navigateToTriathlonTransitionRow", pVar, 200, null);
    }
}
