package hu;

import android.content.Context;
import android.text.TextUtils;
import androidx.room.a0;
import c22.o;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.gfdi.configuration.SupportedCapability;
import ht1.v;
import java.util.List;
import lu.d;
import lu.e;
import o13.m;
import o13.t;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.jvm.internal.j;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lhu/a;", "Lcom/garmin/android/library/backgroundtaskmanagement/a;", "<init>", "()V", "a", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class a extends com.garmin.android.library.backgroundtaskmanagement.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C1699a f85684b = new C1699a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final t f85685c = m.b(new v(5));

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f85686a;

        static {
            int[] iArr = new int[lu.a.values().length];
            try {
                iArr[lu.a.LAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[lu.a.NAVIGATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[lu.a.POWER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[lu.a.PACE_SPEED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[lu.a.HEART_RATE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f85686a = iArr;
        }
    }

    private a() {
    }

    public static a M() {
        a aVar = new a();
        i2.a aVar2 = i2.f36769a;
        a2 a2Var = a2.GENERAL;
        aVar2.getClass();
        i2.a.b(a2Var, "AudioPromptsBizManager", "AudioPromptsBizManager created");
        return aVar;
    }

    public static String N(long j8, lu.a aVar) {
        String str;
        gu.c cVar = (gu.c) KoinJavaComponent.get$default(gu.c.class, null, null, 6, null);
        int i14 = b.f85686a[aVar.ordinal()];
        if (i14 == 3) {
            String strB = cVar.b(j8, S(R.string.key_audio_prompt_power_alert_type));
            if (strB == null) {
                return "AVERAGE_POWER";
            }
            str = TextUtils.isEmpty(strB) ? null : strB;
            return str != null ? str : "AVERAGE_POWER";
        }
        if (i14 == 4) {
            String strB2 = cVar.b(j8, S(R.string.key_audio_prompt_pace_speed_alert_type));
            if (strB2 == null) {
                return "AVERAGE_PACE_SPEED";
            }
            str = TextUtils.isEmpty(strB2) ? null : strB2;
            return str != null ? str : "AVERAGE_PACE_SPEED";
        }
        if (i14 != 5) {
            String strB3 = cVar.b(j8, S(R.string.key_audio_prompt_heart_rate_alert_type));
            if (strB3 == null) {
                return "HEART_RATE";
            }
            str = TextUtils.isEmpty(strB3) ? null : strB3;
            return str != null ? str : "HEART_RATE";
        }
        String strB4 = cVar.b(j8, S(R.string.key_audio_prompt_heart_rate_alert_type));
        if (strB4 == null) {
            return "HEART_RATE";
        }
        str = TextUtils.isEmpty(strB4) ? null : strB4;
        return str != null ? str : "HEART_RATE";
    }

    public static String O(List list) {
        StringBuilder sb3;
        list.getClass();
        if (list.size() > 0) {
            sb3 = new StringBuilder();
            sb3.append((String) list.get(0));
            if (list.size() >= 1) {
                int size = list.size();
                for (int i14 = 1; i14 < size; i14++) {
                    sb3.append(", ");
                    sb3.append((String) list.get(i14));
                }
            }
        } else {
            sb3 = null;
        }
        return sb3 != null ? sb3.toString() : "";
    }

    public static lu.b P(long j8, lu.a aVar) {
        String strB;
        aVar.getClass();
        gu.c cVar = (gu.c) KoinJavaComponent.get$default(gu.c.class, null, null, 6, null);
        int i14 = b.f85686a[aVar.ordinal()];
        if (i14 == 3) {
            strB = cVar.b(j8, S(R.string.key_audio_prompt_power_frequency));
        } else if (i14 != 4) {
            strB = i14 != 5 ? cVar.b(j8, S(R.string.key_audio_prompt_heart_rate_frequency)) : cVar.b(j8, S(R.string.key_audio_prompt_heart_rate_frequency));
        } else {
            strB = cVar.b(j8, S(R.string.key_audio_prompt_pace_speed_frequency));
        }
        if (strB == null || TextUtils.isEmpty(strB)) {
            return lu.b.MINUTE_3;
        }
        try {
            return lu.b.valueOf(strB);
        } catch (IllegalArgumentException unused) {
            String strName = aVar.name();
            String simpleName = lu.b.class.getSimpleName();
            StringBuilder sbI = p6.b.i("getFrequency: type[", strB, "] for alertType[", strName, "] isn't defined in ");
            sbI.append(simpleName);
            String string = sbI.toString();
            i2.a aVar2 = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar2.getClass();
            i2.a.f(a2Var, "AudioPromptsBizManager", string);
            return lu.b.MINUTE_3;
        }
    }

    public static String Q(long j8, lu.a aVar) {
        aVar.getClass();
        lu.b bVarP = P(j8, aVar);
        Context contextC = ((o) KoinJavaComponent.get$default(o.class, null, null, 6, null)).c();
        int i14 = bVarP.f114923a;
        int i15 = bVarP.f114924b;
        if (i14 == 0) {
            String string = contextC.getString(i15);
            string.getClass();
            return string;
        }
        String string2 = contextC.getString(i15, Integer.valueOf(i14));
        string2.getClass();
        return string2;
    }

    public static lu.c R(long j8) {
        String strN = "";
        try {
            strN = N(j8, lu.a.HEART_RATE);
            return lu.c.valueOf(strN);
        } catch (IllegalArgumentException unused) {
            String strJ = a0.j("getHeartRateAlertType: enumName[", strN, "] isn't defined in ", lu.c.class.getSimpleName());
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "AudioPromptsBizManager", strJ);
            return lu.c.HEART_RATE;
        }
    }

    public static String S(int i14) {
        return hb.a.h((o) KoinJavaComponent.get$default(o.class, null, null, 6, null), i14);
    }

    public static d T(long j8) {
        String strN = "";
        try {
            strN = N(j8, lu.a.PACE_SPEED);
            return d.valueOf(strN);
        } catch (IllegalArgumentException unused) {
            String strJ = a0.j("getPaceSpeedAlertType: enumName[", strN, "] isn't defined in ", d.class.getSimpleName());
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "AudioPromptsBizManager", strJ);
            return d.AVERAGE_PACE_SPEED;
        }
    }

    public static e U(long j8) {
        String strN = "";
        try {
            strN = N(j8, lu.a.POWER);
            return e.valueOf(strN);
        } catch (IllegalArgumentException unused) {
            String strJ = a0.j("getPowerAlertType: enumName[", strN, "] isn't defined in ", e.class.getSimpleName());
            i2.a aVar = i2.f36769a;
            a2 a2Var = a2.GENERAL;
            aVar.getClass();
            i2.a.f(a2Var, "AudioPromptsBizManager", strJ);
            return e.AVERAGE_POWER;
        }
    }

    public static boolean V(long j8, lu.a aVar) {
        String strB;
        aVar.getClass();
        if (km2.a.i(j8, null, SupportedCapability.REALTIME_SETTINGS.ordinal())) {
            return true;
        }
        gu.c cVar = (gu.c) KoinJavaComponent.get$default(gu.c.class, null, null, 6, null);
        int i14 = b.f85686a[aVar.ordinal()];
        if (i14 == 1) {
            strB = cVar.b(j8, S(R.string.key_audio_prompt_lap_alert_on_off));
        } else if (i14 == 2) {
            strB = cVar.b(j8, S(R.string.key_audio_prompt_navigation_alert_on_off));
        } else if (i14 == 3) {
            strB = cVar.b(j8, S(R.string.key_audio_prompt_power_alert_on_off));
        } else if (i14 != 4) {
            strB = i14 != 5 ? cVar.b(j8, S(R.string.key_audio_prompt_heart_rate_alert_on_off)) : cVar.b(j8, S(R.string.key_audio_prompt_heart_rate_alert_on_off));
        } else {
            strB = cVar.b(j8, S(R.string.key_audio_prompt_pace_speed_alert_on_off));
        }
        if (strB != null) {
            return Boolean.parseBoolean(strB);
        }
        return false;
    }

    public static boolean W(long j8) {
        w13.c cVar = lu.a.f114908g;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            if (V(j8, (lu.a) bVarN.next())) {
                return true;
            }
        }
        return false;
    }

    public static void X(long j8, boolean z14, lu.a aVar) {
        aVar.getClass();
        gu.c cVar = (gu.c) KoinJavaComponent.get$default(gu.c.class, null, null, 6, null);
        int i14 = b.f85686a[aVar.ordinal()];
        if (i14 == 1) {
            cVar.r(j8, S(R.string.key_audio_prompt_lap_alert_on_off), String.valueOf(z14));
            return;
        }
        if (i14 == 2) {
            cVar.r(j8, S(R.string.key_audio_prompt_navigation_alert_on_off), String.valueOf(z14));
            return;
        }
        if (i14 == 3) {
            cVar.r(j8, S(R.string.key_audio_prompt_power_alert_on_off), String.valueOf(z14));
            return;
        }
        if (i14 == 4) {
            cVar.r(j8, S(R.string.key_audio_prompt_pace_speed_alert_on_off), String.valueOf(z14));
        } else if (i14 != 5) {
            cVar.r(j8, S(R.string.key_audio_prompt_heart_rate_alert_on_off), String.valueOf(z14));
        } else {
            cVar.r(j8, S(R.string.key_audio_prompt_heart_rate_alert_on_off), String.valueOf(z14));
        }
    }

    /* JADX INFO: renamed from: hu.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lhu/a$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "data_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class C1699a {
        public /* synthetic */ C1699a(j jVar) {
            this();
        }

        public final synchronized a a() {
            return (a) a.f85685c.getValue();
        }

        private C1699a() {
        }
    }
}
