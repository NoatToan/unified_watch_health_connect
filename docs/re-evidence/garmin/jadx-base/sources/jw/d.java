package jw;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.settings.GCMSettingManager;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import gg1.h0;
import gg1.o0;
import gg1.x0;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;
import lc.u0;
import org.joda.time.LocalDate;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class d extends com.garmin.android.library.backgroundtaskmanagement.d {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final SimpleDateFormat f101236i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f101237j;

    public d(com.garmin.android.library.backgroundtaskmanagement.b bVar, String str) {
        super(bVar);
        this.f101236i = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        this.f101237j = str;
    }

    public static void e(JSONObject jSONObject) {
        Object next;
        try {
            if (!jSONObject.has("firstDayOfWeek") || jSONObject.isNull("firstDayOfWeek")) {
                return;
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("firstDayOfWeek");
            if (!jSONObject2.has("dayName") || jSONObject2.isNull("dayName")) {
                return;
            }
            f12.l.f68084a.getClass();
            f12.l lVarA = f12.l.a.a();
            String strOptString = jSONObject2.optString("dayName");
            gg1.m.f77259e.getClass();
            strOptString.getClass();
            Iterator<T> it = gg1.m.f77268n.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!p005kotlin.jvm.internal.s.g(((gg1.m) next).f77269a, strOptString));
            gg1.m mVar = (gg1.m) next;
            if (mVar == null) {
                mVar = gg1.m.SUNDAY;
            }
            lVarA.H4(mVar);
        } catch (JSONException e4) {
            u0.v(e4, new StringBuilder("persistFirstDayOfWeek: "), a2.USER, "CacheUserSettingsTask");
        }
    }

    public static void f(JSONObject jSONObject) {
        if (!jSONObject.has("measurementSystem") || jSONObject.isNull("measurementSystem")) {
            return;
        }
        String strOptString = jSONObject.optString("measurementSystem", "");
        if (strOptString.isEmpty()) {
            return;
        }
        o0.f77285d.getClass();
        o0 o0VarA = o0.a.a(strOptString);
        if (o0VarA == null) {
            i2.f(a2.USER, "CacheUserSettingsTask", "Unknown MeasurementSystemEnum value [" + strOptString + "]! Defaulting to statute.");
            o0VarA = o0.STATUTE_US;
        }
        f12.l.f68084a.getClass();
        f12.l.a.a().H1(o0VarA);
    }

    public static void g(JSONObject jSONObject) {
        if (jSONObject.has("contraception") && !jSONObject.isNull("contraception")) {
            ww0.i iVar = (ww0.i) GsonUtil.f47253b.fromJson(jSONObject.optString("contraception", ""), ww0.i.class);
            if (iVar != null) {
                f12.l.f68084a.getClass();
                f12.l.a.a().R1(iVar);
            }
        }
        if (jSONObject.has("menstrualCycleType") && !jSONObject.isNull("menstrualCycleType")) {
            String strOptString = jSONObject.optString("menstrualCycleType", "");
            f12.l.f68084a.getClass();
            f12.l.a.a().A2(!TextUtils.isEmpty(strOptString) && strOptString.equalsIgnoreCase("Pregnant"));
            ww0.a aVar = (ww0.a) GsonUtil.f47253b.fromJson(strOptString, ww0.a.class);
            if (aVar != null) {
                f12.l.a.a().F4(aVar);
            }
        }
        if (jSONObject.has("avgCycleLength") && !jSONObject.isNull("avgCycleLength")) {
            f12.l.f68084a.getClass();
            f12.l.a.a().t3(jSONObject.optInt("avgCycleLength"));
        }
        if (jSONObject.has("avgPeriodLength") && !jSONObject.isNull("avgPeriodLength")) {
            f12.l.f68084a.getClass();
            f12.l.a.a().r1(jSONObject.optInt("avgPeriodLength"));
        }
        if (jSONObject.has("periodPrediction") && !jSONObject.isNull("periodPrediction")) {
            f12.l.f68084a.getClass();
            f12.l.a.a().v0(jSONObject.optBoolean("periodPrediction"));
        }
        if (jSONObject.has("skinTempPrediction") && !jSONObject.isNull("skinTempPrediction")) {
            f12.l.f68084a.getClass();
            f12.l.a.a().V2(jSONObject.optBoolean("skinTempPrediction"));
        }
        if (jSONObject.has("ovulationPrediction") && !jSONObject.isNull("ovulationPrediction")) {
            f12.l.f68084a.getClass();
            f12.l.a.a().x1(jSONObject.optBoolean("ovulationPrediction"));
        }
        if (jSONObject.has("flowTracking") && !jSONObject.isNull("flowTracking")) {
            f12.l.f68084a.getClass();
            f12.l.a.a().m2(jSONObject.optBoolean("flowTracking"));
        }
        if (jSONObject.has("dischargeTracking") && !jSONObject.isNull("dischargeTracking")) {
            f12.l.f68084a.getClass();
            f12.l.a.a().j3(jSONObject.optBoolean("dischargeTracking"));
        }
        if (jSONObject.has("moodTracking") && !jSONObject.isNull("moodTracking")) {
            f12.l.f68084a.getClass();
            f12.l.a.a().b0(jSONObject.optBoolean("moodTracking"));
        }
        if (jSONObject.has("ovulationDateTracking") && !jSONObject.isNull("ovulationDateTracking")) {
            f12.l.f68084a.getClass();
            f12.l.a.a().E0(jSONObject.optBoolean("ovulationDateTracking"));
        }
        if (jSONObject.has("sexDriveTracking") && !jSONObject.isNull("sexDriveTracking")) {
            f12.l.f68084a.getClass();
            f12.l.a.a().m4(jSONObject.optBoolean("sexDriveTracking"));
        }
        if (jSONObject.has("sexualActivityTracking") && !jSONObject.isNull("sexualActivityTracking")) {
            f12.l.f68084a.getClass();
            f12.l.a.a().h0(jSONObject.optBoolean("sexualActivityTracking"));
        }
        if (jSONObject.has("physicalSymptomsTracking") && !jSONObject.isNull("physicalSymptomsTracking")) {
            f12.l.f68084a.getClass();
            f12.l.a.a().g1(jSONObject.optBoolean("physicalSymptomsTracking"));
        }
        if (jSONObject.has("menopauseSymptomsTracking") && !jSONObject.isNull("menopauseSymptomsTracking")) {
            f12.l.f68084a.getClass();
            f12.l.a.a().G2(jSONObject.optBoolean("menopauseSymptomsTracking"));
        }
        if (jSONObject.has("pregnancySetup") && !jSONObject.isNull("pregnancySetup")) {
            boolean zOptBoolean = jSONObject.optBoolean("pregnancySetup");
            i52.a aVar2 = i52.a.f91796a;
            f12.l.f68084a.getClass();
            f12.l.a.a().P1(zOptBoolean);
        }
        if (jSONObject.has("glucoseTracking") && !jSONObject.isNull("glucoseTracking")) {
            boolean zOptBoolean2 = jSONObject.optBoolean("glucoseTracking");
            i52.a aVar3 = i52.a.f91796a;
            f12.l.f68084a.getClass();
            f12.l.a.a().o0(zOptBoolean2);
        }
        if (!jSONObject.has("babyMovementTracking") || jSONObject.isNull("babyMovementTracking")) {
            return;
        }
        boolean zOptBoolean3 = jSONObject.optBoolean("babyMovementTracking");
        i52.a aVar4 = i52.a.f91796a;
        f12.l.f68084a.getClass();
        f12.l.a.a().o4(zOptBoolean3);
    }

    public static void h(JSONObject jSONObject) {
        if (!jSONObject.has("timeFormat") || jSONObject.isNull("timeFormat")) {
            return;
        }
        String strOptString = jSONObject.optString("timeFormat", "");
        if (strOptString.isEmpty()) {
            return;
        }
        x0 x0Var = (x0) x0.f77365c.get(strOptString);
        if (x0Var == null) {
            i2.f(a2.USER, "CacheUserSettingsTask", "Unknown TimeFormatEnum value [" + strOptString + "]! Defaulting to 12 hour.");
            x0Var = x0.TWELVE_HOUR;
        }
        GCMSettingManager.f41536b.edit().putString(GCMSettingManager.f41535a.getString(R.string.key_user_time_format), x0Var.name()).apply();
    }

    public static void i(JSONObject jSONObject) {
        if (jSONObject.has("weatherLocation")) {
            if (jSONObject.isNull("weatherLocation")) {
                Context context = GarminConnectMobileApp.f28688j;
                du2.g.a aVar = du2.g.f61293g;
                aVar.getClass();
                du2.g.a.e(context, null, null);
                Context context2 = GarminConnectMobileApp.f28688j;
                du2.g.d dVar = du2.g.d.PHONE;
                aVar.getClass();
                du2.g.a.f(context2, dVar);
                return;
            }
            try {
                JSONObject jSONObject2 = jSONObject.getJSONObject("weatherLocation");
                double dOptDouble = jSONObject2.optDouble("latitude");
                double dOptDouble2 = jSONObject2.optDouble("longitude");
                Context context3 = GarminConnectMobileApp.f28688j;
                Double dValueOf = Double.valueOf(dOptDouble);
                Double dValueOf2 = Double.valueOf(dOptDouble2);
                du2.g.a aVar2 = du2.g.f61293g;
                aVar2.getClass();
                du2.g.a.e(context3, dValueOf, dValueOf2);
                du2.g.d dVar2 = jSONObject2.optBoolean("useFixedLocation", false) ? du2.g.d.STATIC : du2.g.d.PHONE;
                Context context4 = GarminConnectMobileApp.f28688j;
                aVar2.getClass();
                du2.g.a.f(context4, dVar2);
            } catch (Exception unused) {
            }
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.f
    public final void a() {
        String str = this.f101237j;
        if (TextUtils.isEmpty(str)) {
            c(com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
            i2.f(a2.USER, "CacheUserSettingsTask", "Cannot save user personal information. JSON is null or empty!");
            return;
        }
        qd2.a aVarB = qd2.a.b();
        if (aVarB != null) {
            aVarB.g(qd2.a.b.USER_SETTINGS, str);
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.has(TtmlNode.ATTR_ID) && !jSONObject.isNull(TtmlNode.ATTR_ID)) {
                f12.l.f68084a.getClass();
                f12.l.a.a().B0(jSONObject.optString(TtmlNode.ATTR_ID, ""));
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("userData");
            if (jSONObject2.has("gender")) {
                String strOptString = !jSONObject2.isNull("gender") ? jSONObject2.optString("gender", "") : null;
                f12.l.f68084a.getClass();
                f12.l.a.a().R(strOptString);
            }
            if (!jSONObject2.has("diveNumber") || jSONObject2.isNull("diveNumber")) {
                f12.l.f68084a.getClass();
                f12.l.a.a().s0(0);
            } else {
                int iOptInt = jSONObject2.optInt("diveNumber", 0);
                f12.l.f68084a.getClass();
                f12.l.a.a().s0(iOptInt);
            }
            if (jSONObject2.has("handedness") && !jSONObject2.isNull("handedness")) {
                String strOptString2 = jSONObject2.optString("handedness", "");
                if (!strOptString2.isEmpty()) {
                    f12.l.f68084a.getClass();
                    f12.l.a.a().T0(strOptString2);
                }
            }
            if (jSONObject2.has("weight")) {
                double dOptDouble = !jSONObject2.isNull("weight") ? jSONObject2.optDouble("weight", 0.0d) * 0.001d : 0.0d;
                f12.l.f68084a.getClass();
                f12.l.a.a().K1(dOptDouble);
            }
            if (jSONObject2.has("height")) {
                double dOptDouble2 = !jSONObject2.isNull("height") ? jSONObject2.optDouble("height", 0.0d) : -1.0d;
                f12.l.f68084a.getClass();
                f12.l.a.a().U2((float) dOptDouble2);
            }
            h(jSONObject2);
            d(jSONObject2);
            f(jSONObject2);
            if (jSONObject2.has("activityLevel")) {
                int iOptInt2 = !jSONObject2.isNull("activityLevel") ? jSONObject2.optInt("activityLevel", -1) : -1;
                f12.l.f68084a.getClass();
                f12.l.a.a().X(iOptInt2);
            }
            if (jSONObject2.has("vo2MaxRunning")) {
                f12.l.f68084a.getClass();
                f12.l.a.a().I3(jSONObject2.optInt("vo2MaxRunning", -1));
            }
            if (jSONObject2.has("vo2MaxCycling")) {
                f12.l.f68084a.getClass();
                f12.l.a.a().c0(jSONObject2.optInt("vo2MaxCycling", -1));
            }
            if (jSONObject2.has("externalBottomTime") && !jSONObject2.isNull("externalBottomTime")) {
                double dOptDouble3 = jSONObject2.optDouble("externalBottomTime", 0.0d);
                f12.l.f68084a.getClass();
                f12.l.a.a().F1(Math.round(dOptDouble3));
            }
            e(jSONObject2);
            if (jSONObject2.has("hydrationMeasurementUnit") && !jSONObject2.isNull("hydrationMeasurementUnit")) {
                String strOptString3 = jSONObject2.optString("hydrationMeasurementUnit", "");
                if (!strOptString3.isEmpty()) {
                    f12.l.f68084a.getClass();
                    gg1.n nVarA1 = f12.l.a.a().a1();
                    gg1.n.f77276b.getClass();
                    f12.l.a.a().T2(gg1.n.a.a(strOptString3, nVarA1));
                }
            }
            if (jSONObject2.has("trainingStatusPausedDate")) {
                if (jSONObject2.isNull("trainingStatusPausedDate")) {
                    f12.l.f68084a.getClass();
                    f12.l.a.a().W(null);
                } else {
                    f12.l.f68084a.getClass();
                    f12.l.a.a().W(jSONObject2.optString("trainingStatusPausedDate", null));
                }
            }
            if (jSONObject2.has("glucoseMeasurementUnit") && !jSONObject2.isNull("glucoseMeasurementUnit")) {
                String strOptString4 = jSONObject2.optString("glucoseMeasurementUnit", "");
                if (!strOptString4.isEmpty()) {
                    h0.f77238d.getClass();
                    h0 h0VarA = h0.a.a(strOptString4);
                    i52.a aVar = i52.a.f91796a;
                    h0VarA.getClass();
                    SharedPreferences.Editor editorEdit = i52.a.f91797b.edit();
                    i52.a.f91796a.getClass();
                    editorEdit.putString(i52.a.c(R.string.key_user_glucose_measurement_unit), h0VarA.f77242a).apply();
                }
            }
            i(jSONObject2);
            if (jSONObject.has("userSleep")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("userSleep");
                if (jSONObject3.has("sleepTime") && !jSONObject3.isNull("sleepTime")) {
                    long jOptLong = jSONObject3.optLong("sleepTime", 0L);
                    if (jOptLong > 0) {
                        f12.l.f68084a.getClass();
                        f12.l.a.a().U3(jOptLong);
                    }
                    if (jSONObject3.has("wakeTime") && !jSONObject3.isNull("wakeTime")) {
                        long jOptLong2 = jSONObject3.optLong("wakeTime", 0L);
                        if (jOptLong2 > 0) {
                            f12.l.f68084a.getClass();
                            f12.l.a.a().H3(jOptLong2);
                        }
                    }
                }
            }
            if (jSONObject.has("userMenstrualCycleSettings")) {
                g(jSONObject.getJSONObject("userMenstrualCycleSettings"));
            } else {
                f12.l.f68084a.getClass();
                f12.l.a.a().f0();
            }
            c(com.garmin.android.library.backgroundtaskmanagement.b.c.SUCCESS);
        } catch (JSONException e4) {
            c(com.garmin.android.library.backgroundtaskmanagement.b.c.UNRECOVERABLE);
            i2.f(a2.USER, "CacheUserSettingsTask", e4.getMessage());
        }
    }

    @Override // com.garmin.android.library.backgroundtaskmanagement.d
    public final void b() {
    }

    public final void d(JSONObject jSONObject) {
        if (jSONObject.has("birthDate")) {
            LocalDate localDateFromDateFields = null;
            if (!jSONObject.isNull("birthDate")) {
                String strOptString = jSONObject.optString("birthDate", "");
                try {
                    Date date = this.f101236i.parse(strOptString);
                    if (date != null && !strOptString.isEmpty()) {
                        localDateFromDateFields = LocalDate.fromDateFields(date);
                    }
                } catch (ParseException unused) {
                    i2.f(a2.USER, "CacheUserSettingsTask", "Exception creating Date object from JSON value [" + strOptString + "].");
                }
            }
            f12.l.f68084a.getClass();
            f12.l.a.a().B1(localDateFromDateFields);
        }
    }
}
