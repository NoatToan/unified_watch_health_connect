package fy1;

import android.os.Bundle;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import java.util.ArrayList;
import lc.u0;
import p005kotlin.Metadata;
import vt1.o;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lfy1/c;", "", "<init>", "()V", "gcm-domain-training_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f73884a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ArrayList f73885b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f73886c = "";

    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f73887a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f73888b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ int[] f73889c;

        static {
            int[] iArr = new int[vt1.e.values().length];
            try {
                iArr[vt1.e.TRAIN_FOR_A_RACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[vt1.e.ACHIEVE_A_MILESTONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[vt1.e.IMPROVE_FITNESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f73887a = iArr;
            int[] iArr2 = new int[o.values().length];
            try {
                iArr2[o.f180178i.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[o.f180176g.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[o.f180175f.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            f73888b = iArr2;
            int[] iArr3 = new int[vt1.h.values().length];
            try {
                iArr3[vt1.h.FULL_GYM.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[vt1.h.BODYWEIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[vt1.h.DUMBBELLS.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[vt1.h.NONE.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            f73889c = iArr3;
        }
    }

    private c() {
    }

    public static void a() {
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "FBTSetupAnalytics", "Initialize FBT setup flow logging session");
        f73885b.clear();
        f73886c = "";
    }

    public static void b(String str) {
        ArrayList arrayList = f73885b;
        if (arrayList.contains(str)) {
            return;
        }
        arrayList.add(str);
        Bundle bundle = new Bundle();
        i.f73924a.getClass();
        bundle.putBoolean("InDSWCapableFlow", i.a.o());
        bundle.putBoolean("HasStrengthDSWCapableDevice", i.a.q());
        if (f73886c.length() > 0) {
            bundle.putString("SetupType", f73886c);
        }
        ht.a.f85464a.getClass();
        ht.a.a(bundle, str);
        String str2 = "Logging event " + str + " params=" + bundle;
        i2.a aVar = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar.getClass();
        i2.a.b(a2Var, "FBTSetupAnalytics", str2);
    }

    public static void c(vt1.e eVar) {
        String str;
        eVar.getClass();
        int i14 = a.f73887a[eVar.ordinal()];
        if (i14 == 1) {
            str = "TrainForRace";
        } else if (i14 == 2) {
            str = "AchieveMilestone";
        } else {
            if (i14 != 3) {
                u0.r();
                return;
            }
            str = "ImproveFitness";
        }
        f73886c = str;
        b("GarminCoachSetupTypeSelected");
    }
}
