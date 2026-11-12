package rt1;

import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.s;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lrt1/l;", "", "<init>", "()V", "gcm-training-plans_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final l f154545a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f154546b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final LinkedHashSet f154547c = new LinkedHashSet();

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f154548a;

        static {
            int[] iArr = new int[vt1.o.values().length];
            try {
                iArr[vt1.o.f180175f.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vt1.o.f180176g.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f154548a = iArr;
        }
    }

    private l() {
    }

    public static void a(String str) {
        ArrayList arrayList = f154546b;
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
        ht.a.f85464a.getClass();
        ht.a.a(null, str);
        String strConcat = "Logging event ".concat(str);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "TrainingDashboardAnalytics", strConcat);
    }

    public static void b(String str) {
        ht.a.f85464a.getClass();
        ht.a.a(null, str);
        String strConcat = "Logging event ".concat(str);
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "TrainingDashboardAnalytics", strConcat);
    }

    public static void c(vt1.o oVar) {
        String str;
        Object next;
        Object next2;
        int i14;
        String str2;
        String str3;
        LinkedHashSet linkedHashSet = f154547c;
        if (linkedHashSet.isEmpty()) {
            return;
        }
        b("GarminCoachTrainingPreferencesChanged");
        Iterator it = linkedHashSet.iterator();
        do {
            str = null;
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            str3 = (String) next;
            if (s.g(str3, vt1.h.NONE.f180123d) || s.g(str3, tw1.h.STRENGTH_TRAINING_GYM.f166715a) || s.g(str3, tw1.h.STRENGTH_TRAINING_BODYWEIGHT.f166715a)) {
                break;
            }
        } while (!s.g(str3, tw1.h.STRENGTH_TRAINING_DUMBBELLS_ONLY.f166715a));
        String str4 = (String) next;
        if (s.g(str4, tw1.h.STRENGTH_TRAINING_GYM.f166715a)) {
            b("GarminCoachFullGymPreferenceEnabled");
        } else if (s.g(str4, tw1.h.STRENGTH_TRAINING_BODYWEIGHT.f166715a)) {
            b("GarminCoachBodyweightPreferenceEnabled");
        } else if (s.g(str4, tw1.h.STRENGTH_TRAINING_DUMBBELLS_ONLY.f166715a)) {
            b("GarminCoachDumbbellsPreferenceEnabled");
        } else if (s.g(str4, vt1.h.NONE.f180123d)) {
            b("GarminCoachStrengthPreferenceDisabled");
        }
        Iterator it3 = linkedHashSet.iterator();
        do {
            if (!it3.hasNext()) {
                next2 = null;
                break;
            }
            next2 = it3.next();
            str2 = (String) next2;
            if (s.g(str2, tw1.k.INTERMEDIATE.f166748b)) {
                break;
            }
        } while (!s.g(str2, tw1.k.BEGINNER.f166748b));
        String str5 = (String) next2;
        boolean zG = s.g(str5, tw1.k.INTERMEDIATE.f166748b);
        l lVar = f154545a;
        if (zG) {
            i14 = oVar != null ? a.f154548a[oVar.ordinal()] : -1;
            if (i14 == 1) {
                str = "CoachRunTrainLevelToExperienced";
            } else if (i14 == 2) {
                str = "CoachBikeTrainLevelToExperienced";
            }
            if (str != null) {
                lVar.getClass();
                b(str);
            }
        } else if (s.g(str5, tw1.k.BEGINNER.f166748b)) {
            i14 = oVar != null ? a.f154548a[oVar.ordinal()] : -1;
            if (i14 == 1) {
                str = "CoachRunTrainLevelToBeginner";
            } else if (i14 == 2) {
                str = "CoachBikeTrainLevelToBeginner";
            }
            if (str != null) {
                lVar.getClass();
                b(str);
            }
        }
        linkedHashSet.clear();
    }
}
