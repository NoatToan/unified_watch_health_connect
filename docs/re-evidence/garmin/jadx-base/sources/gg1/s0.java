package gg1;

import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import java.util.Iterator;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u001b\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lgg1/s0;", "", "Lf12/l;", "userSettings", "Lo53/z;", "ioDispatcher", "<init>", "(Lf12/l;Lo53/z;)V", "a", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f12.l f77310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o53.z f77311b;

    static {
        new a(null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public s0(f12.l lVar, o53.z zVar, int i14, p005kotlin.jvm.internal.j jVar) {
        lVar = (i14 & 1) != 0 ? (f12.l) KoinJavaComponent.get$default(f12.l.class, null, null, 6, null) : lVar;
        if ((i14 & 2) != 0) {
            x53.c cVar = o53.s0.f129406a;
            zVar = x53.b.f189152a;
        }
        this(lVar, zVar);
    }

    public static final void a(s0 s0Var, JSONObject jSONObject) {
        Object bVar;
        Object next;
        s0Var.getClass();
        try {
            int i14 = o13.q.f128596b;
            String strOptString = jSONObject.getJSONObject("firstDayOfWeek").optString("dayId", "");
            strOptString.getClass();
            if (strOptString.length() > 0) {
                f12.l lVar = s0Var.f77310a;
                m.a aVar = m.f77259e;
                int i15 = Integer.parseInt(strOptString);
                aVar.getClass();
                Iterator<T> it = m.f77268n.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((m) next).f77270b != i15);
                m mVar = (m) next;
                if (mVar == null) {
                    mVar = m.SUNDAY;
                }
                lVar.H4(mVar);
            }
            bVar = Unit.INSTANCE;
        } catch (Throwable th3) {
            int i16 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        Throwable thB = o13.q.b(bVar);
        if (thB != null) {
            a2 a2Var = a2.SETTINGS;
            i2.f36769a.getClass();
            i2.a.g(a2Var, "PersistUserSettingsTask", thB);
        }
    }

    public static final void b(s0 s0Var, JSONObject jSONObject) {
        Object bVar;
        f12.l lVar = s0Var.f77310a;
        try {
            int i14 = o13.q.f128596b;
            String strOptString = jSONObject.optString("hydrationMeasurementUnit", "");
            strOptString.getClass();
            if (strOptString.length() > 0) {
                n.a aVar = n.f77276b;
                n nVarA1 = lVar.a1();
                aVar.getClass();
                lVar.T2(n.a.a(strOptString, nVarA1));
            }
            bVar = Unit.INSTANCE;
        } catch (Throwable th3) {
            int i15 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        Throwable thB = o13.q.b(bVar);
        if (thB != null) {
            a2 a2Var = a2.SETTINGS;
            i2.f36769a.getClass();
            i2.a.g(a2Var, "PersistUserSettingsTask", thB);
        }
    }

    public static final void c(s0 s0Var, JSONObject jSONObject) {
        s0Var.getClass();
        String strOptString = jSONObject.optString("measurementSystem", "");
        strOptString.getClass();
        if (strOptString.length() > 0) {
            o0.f77285d.getClass();
            o0 o0VarA = o0.a.a(strOptString);
            if (o0VarA == null) {
                a2 a2Var = a2.SETTINGS;
                String strM = am.j.m("Unknown MeasurementSystemEnum value [", strOptString, "]! Defaulting to statute.");
                i2.f36769a.getClass();
                i2.a.f(a2Var, "PersistUserSettingsTask", strM);
                o0VarA = o0.STATUTE_US;
            }
            s0Var.f77310a.H1(o0VarA);
        }
    }

    public static final void d(s0 s0Var, JSONObject jSONObject) {
        Object bVar;
        s0Var.getClass();
        try {
            int i14 = o13.q.f128596b;
            String strOptString = jSONObject.getJSONObject("timeFormat").optString("formatKey", "");
            strOptString.getClass();
            if (strOptString.length() > 0) {
                x0 x0Var = (x0) x0.f77365c.get(strOptString);
                if (x0Var == null) {
                    i2.f36769a.getClass();
                    i2.a.f(a2.SETTINGS, "PersistUserSettingsTask", "Unknown TimeFormatEnum value [" + strOptString + "]! Defaulting to 12 hour.");
                    x0Var = x0.TWELVE_HOUR;
                }
                GCMSettingManager.f41536b.edit().putString(GCMSettingManager.f41535a.getString(R.string.key_user_time_format), x0Var.name()).apply();
            }
            bVar = Unit.INSTANCE;
        } catch (Throwable th3) {
            int i15 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        Throwable thB = o13.q.b(bVar);
        if (thB != null) {
            a2 a2Var = a2.SETTINGS;
            i2.f36769a.getClass();
            i2.a.g(a2Var, "PersistUserSettingsTask", thB);
        }
    }

    public static final Object e(s0 s0Var, JSONObject jSONObject) {
        Object bVar;
        s0Var.getClass();
        try {
            int i14 = o13.q.f128596b;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("userData");
            if (jSONObjectOptJSONObject != null) {
                boolean z14 = false;
                boolean zOptBoolean = jSONObjectOptJSONObject.optBoolean("wheelchairModeEnabled", false);
                f12.l lVar = s0Var.f77310a;
                if (zOptBoolean) {
                    bv.b.f21239a.getClass();
                    bv.b.a();
                    if (k1.f37122a.Z()) {
                        z14 = true;
                    }
                }
                lVar.v4(z14);
            }
            bVar = Unit.INSTANCE;
        } catch (Throwable th3) {
            int i15 = o13.q.f128596b;
            bVar = new o13.q.b(th3);
        }
        Throwable thB = o13.q.b(bVar);
        if (thB != null) {
            a2 a2Var = a2.SETTINGS;
            i2.f36769a.getClass();
            i2.a.g(a2Var, "PersistUserSettingsTask", thB);
        }
        return bVar;
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006¨\u0006\u000f"}, d2 = {"Lgg1/s0$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "USER_DATA", "TIME_FORMAT", "TIME_FORMAT_KEY", "FIRST_DAY_OF_WEEK", "FIRST_DAY_OF_WEEK_ID", "MEASUREMENT_SYSTEM", "HYDRATION_MEASUREMENT_UNIT", "WHEELCHAIR_MODE_ENABLED", "app_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }

    public s0(f12.l lVar, o53.z zVar) {
        lVar.getClass();
        zVar.getClass();
        this.f77310a = lVar;
        this.f77311b = zVar;
    }

    public s0() {
        this(null, null, 3, null);
    }
}
