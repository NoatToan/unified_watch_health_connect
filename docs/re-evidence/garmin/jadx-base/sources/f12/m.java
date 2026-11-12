package f12;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Pair;
import c22.a3;
import c22.u2;
import c22.x2;
import com.garmin.android.apps.connectmobile.a2;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.android.gms.stats.CodePackage;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.crashlytics.internal.common.IdManager;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import ds.e0;
import gg1.o0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import m63.b0;
import m63.m0;
import m63.q0;
import m63.y1;
import org.joda.time.LocalDate;
import org.joda.time.Years;
import org.joda.time.format.DateTimeFormat;
import org.koin.java.KoinJavaComponent;
import p005kotlin.Metadata;
import p005kotlin.Unit;
import p13.h0;
import p13.j0;
import p13.k0;
import r53.e2;
import r53.g2;
import z10.l0;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lf12/m;", "Lf12/l;", "<init>", "()V", "a", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class m implements l {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f68087d = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final o13.t f68088b = o13.m.b(new ey0.a(this));

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e2 f68089c = g2.b(1, 0, null, 6);

    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f68090a;

        static {
            int[] iArr = new int[o0.values().length];
            try {
                iArr[o0.STATUTE_US.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f68090a = iArr;
        }
    }

    static {
        new a(null);
    }

    public static String S4(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode == -1611296843) {
            if (str.equals(CodePackage.LOCATION)) {
                return "keyUserHasBlockedCalendarPermissionRequests";
            }
            return null;
        }
        if (iHashCode == 76105038) {
            if (str.equals("PHONE")) {
                return "keyUserHasBlockedCalendarPermissionRequests";
            }
            return null;
        }
        if (iHashCode == 604302142 && str.equals("CALENDAR")) {
            return "keyUserHasBlockedCalendarPermissionRequests";
        }
        return null;
    }

    @Override // f12.l
    public final boolean A() {
        return i().getBoolean("key_connection_consent_dialog", true);
    }

    @Override // f12.l
    public final void A0() {
        i().edit().remove("keyAccountSuspendDismissBannerScreens").apply();
    }

    @Override // f12.l
    public final boolean A1() {
        return i().getBoolean("key_user_location_confirmation", false);
    }

    @Override // f12.l
    public final void A2(boolean z14) {
        e0.q(this, "key_is_user_pregnant", z14);
    }

    @Override // f12.l
    public final HashSet A3() {
        l0 l0Var;
        SharedPreferences sharedPreferencesI = i();
        Set<String> set = p13.l0.f134950a;
        Set<String> stringSet = sharedPreferencesI.getStringSet("keyConsentDismissBannerScreens", set);
        if (stringSet != null) {
            set = stringSet;
        }
        Set<String> set2 = set;
        ArrayList arrayList = new ArrayList(p13.y.r(set2, 10));
        for (String str : set2) {
            l0.a aVar = l0.f201102d;
            str.getClass();
            aVar.getClass();
            l0[] l0VarArrValues = l0.values();
            int length = l0VarArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    l0Var = null;
                    break;
                }
                l0Var = l0VarArrValues[i14];
                if (p005kotlin.jvm.internal.s.g(l0Var.f201117a, str)) {
                    break;
                }
                i14++;
            }
            arrayList.add(l0Var);
        }
        return h0.Z0(arrayList);
    }

    @Override // f12.l
    public final String A4(String str, String str2) {
        return i().getString(str, str2);
    }

    @Override // f12.l
    public final Boolean B(String str) {
        Map map;
        str.getClass();
        String string = i().getString("3dMapEnabled", null);
        if (string == null || string.length() == 0) {
            map = k0.f134949a;
            map.getClass();
        } else {
            n63.b.a aVar = n63.b.f123892d;
            aVar.getClass();
            map = (Map) aVar.c(new q0(y1.f117048a, m63.g.f116948a), string);
        }
        return (Boolean) map.getOrDefault(str, null);
    }

    @Override // f12.l
    public final void B0(String str) {
        str.getClass();
        i().edit().putString("userSettingsUserID", str).apply();
    }

    @Override // f12.l
    public final void B1(LocalDate localDate) {
        if (localDate == null) {
            i().edit().remove("userDateOfBirthString").apply();
        } else {
            i().edit().putString("userDateOfBirthString", DateTimeFormat.forPattern("yyyy-MM-dd").print(localDate)).apply();
        }
    }

    @Override // f12.l
    public final boolean B2() {
        bv.b.f21239a.getClass();
        bv.b.a();
        return k1.f37122a.c() && i().getBoolean("key_should_show_pregnancy_tracking_nav_bar_tip", true);
    }

    @Override // f12.l
    public final boolean B3() {
        return i().getBoolean("keyWheelchairMode", false);
    }

    @Override // f12.l
    public final boolean B4() {
        return i().getBoolean("keyUserSkinTempPrediction", true);
    }

    @Override // f12.l
    public final boolean C() {
        return i().getBoolean("3dMapEnabledCourses", false);
    }

    @Override // f12.l
    public final boolean C0() {
        return i().getBoolean("keyUserGlucoseTrackingSetup", false);
    }

    @Override // f12.l
    public final boolean C1() {
        return g() == o0.STATUTE_UK;
    }

    @Override // f12.l
    public final boolean C2() {
        return i().getBoolean("keyUserHasPregnancyRecords", false);
    }

    @Override // f12.l
    public final long C3() {
        return i().getLong("keyRegisteredRealTimeHeartRateDeviceId", -1L);
    }

    @Override // f12.l
    public final boolean C4() {
        return i().getBoolean("keyUserHasVO2MAXRecords", false);
    }

    @Override // f12.l
    public final void D(String str, com.garmin.android.library.mapsdkadapter.i.d dVar) {
        Map linkedHashMap;
        str.getClass();
        dVar.getClass();
        String string = i().getString("activityMapProvider", null);
        if (string == null || string.length() == 0) {
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            linkedHashMap = new LinkedHashMap(k0Var);
        } else {
            n63.b.a aVar = n63.b.f123892d;
            aVar.getClass();
            linkedHashMap = (Map) aVar.c(new q0(y1.f117048a, new b0("com.garmin.android.library.mapsdkadapter.IMap.MapProvider", com.garmin.android.library.mapsdkadapter.i.d.values())), string);
        }
        linkedHashMap.put(str, dVar);
        SharedPreferences.Editor editorEdit = i().edit();
        n63.b.a aVar2 = n63.b.f123892d;
        aVar2.getClass();
        editorEdit.putString("activityMapProvider", aVar2.b(new q0(y1.f117048a, new b0("com.garmin.android.library.mapsdkadapter.IMap.MapProvider", com.garmin.android.library.mapsdkadapter.i.d.values())), linkedHashMap));
        editorEdit.apply();
    }

    @Override // f12.l
    public final Set<String> D0(String str, Set<String> set) {
        return i().getStringSet(str, set);
    }

    @Override // f12.l
    public final void D1() {
        e0.q(this, "key_should_show_cycle_tracking_nav_bar_tip", false);
    }

    @Override // f12.l
    public final void D2() {
        e0.q(this, "keySocialGroupRideInfoDialog", false);
    }

    @Override // f12.l
    public final long D3(long j8, String str) {
        return i().getLong(str, j8);
    }

    @Override // f12.l
    public final boolean D4() {
        return i().getBoolean("key_earned_share_activity_badge", false);
    }

    @Override // f12.l
    public final com.garmin.android.library.mapsdkadapter.i.d E(String str) {
        Map map;
        str.getClass();
        String string = i().getString("activityMapProvider", null);
        if (string == null || string.length() == 0) {
            map = k0.f134949a;
            map.getClass();
        } else {
            n63.b.a aVar = n63.b.f123892d;
            aVar.getClass();
            map = (Map) aVar.c(new q0(y1.f117048a, new b0("com.garmin.android.library.mapsdkadapter.IMap.MapProvider", com.garmin.android.library.mapsdkadapter.i.d.values())), string);
        }
        return (com.garmin.android.library.mapsdkadapter.i.d) map.getOrDefault(str, null);
    }

    @Override // f12.l
    public final void E0(boolean z14) {
        e0.q(this, "keyUserOvulationDate", z14);
    }

    @Override // f12.l
    public final boolean E1() {
        return i().getBoolean("keyUserOvulationDate", true);
    }

    @Override // f12.l
    public final c22.l E2() {
        String string = i().getString("keyAppTheme", "DARK");
        return c22.l.valueOf(string != null ? string : "DARK");
    }

    @Override // f12.l
    public final int E3() {
        return i().getInt("keyUserRunningVO2Max", -1);
    }

    @Override // f12.l
    public final void E4(String str) {
        i().edit().remove(str).apply();
    }

    @Override // f12.l
    public final Integer F() {
        return Integer.valueOf(i().getInt("epicMapType", 1));
    }

    @Override // f12.l
    public final String F0() {
        String string = i().getString("transactionKey", "");
        return string == null ? "" : string;
    }

    @Override // f12.l
    public final void F1(long j8) {
        i().edit().putLong("keyUserBottomTimeToDate", j8).apply();
    }

    @Override // f12.l
    public final void F2(String str) {
        i().edit().putString("lastCIQSignInRequestJson", str).apply();
    }

    @Override // f12.l
    public final void F3(boolean z14) {
        e0.q(this, "key_disable_pairing_constraints", z14);
    }

    @Override // f12.l
    public final void F4(ww0.a aVar) {
        aVar.getClass();
        i().edit().putString("keyUserCycleType", GsonUtil.a(aVar)).apply();
        if (y1() != aVar) {
            T3(true);
        }
    }

    @Override // f12.l
    public final void G() {
        e0.q(this, "key_connection_consent_dialog", false);
    }

    @Override // f12.l
    public final void G0() {
        e0.q(this, "show_mct_with_skin_temperature_tooltip", false);
    }

    @Override // f12.l
    public final com.garmin.android.library.mapsdkadapter.i.b G1() {
        com.garmin.android.library.mapsdkadapter.i.b bVarValueOf;
        String string = i().getString("keyMapGeodeticSystem", "WGS84");
        return (string == null || (bVarValueOf = com.garmin.android.library.mapsdkadapter.i.b.valueOf(string)) == null) ? com.garmin.android.library.mapsdkadapter.i.b.WGS84 : bVarValueOf;
    }

    @Override // f12.l
    public final void G2(boolean z14) {
        e0.q(this, "keyUserPerimenopauseMenopauseSymptoms", z14);
    }

    @Override // f12.l
    @SuppressLint({"ApplySharedPref"})
    public final void G3(Set<String> set, Set<String> set2) {
        set.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(h0.g1(N()));
        linkedHashSet.addAll(set);
        linkedHashSet.removeAll(set2);
        SharedPreferences.Editor editorEdit = i().edit();
        editorEdit.putStringSet("userRoles", linkedHashSet);
        editorEdit.commit();
    }

    @Override // f12.l
    public final boolean G4() {
        return i().getBoolean("keyUserPerimenopauseMenopauseSymptoms", false);
    }

    @Override // f12.l
    public final com.garmin.android.library.mapsdkadapter.i.d H() {
        Object obj = null;
        String string = i().getString("epicMapProvider", null);
        if (string == null) {
            return null;
        }
        w13.c cVar = com.garmin.android.library.mapsdkadapter.i.d.f50295h;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            Object next = bVarN.next();
            if (p005kotlin.jvm.internal.s.g(((com.garmin.android.library.mapsdkadapter.i.d) next).f50296a, string)) {
                obj = next;
                break;
            }
        }
        return (com.garmin.android.library.mapsdkadapter.i.d) obj;
    }

    @Override // f12.l
    public final void H0(boolean z14) {
        e0.q(this, "keyMoreMenuRefreshNeeded", z14);
    }

    @Override // f12.l
    public final void H1(o0 o0Var) {
        o0Var.getClass();
        i().edit().putString("keyUserMeasurementUnit", o0Var.name()).apply();
    }

    @Override // f12.l
    public final void H2() {
        e0.q(this, "key_course_map_settings_hint", false);
    }

    @Override // f12.l
    public final void H3(long j8) {
        i().edit().putLong("userSleepStopTime", j8).apply();
    }

    @Override // f12.l
    public final void H4(gg1.m mVar) {
        mVar.getClass();
        i().edit().putString("keyUserFirstDayOfWeek", mVar.name()).apply();
    }

    @Override // f12.l
    public final boolean I() {
        return i().getBoolean("KeyPowerCurveAvailable", false);
    }

    @Override // f12.l
    public final boolean I0(long j8, List<Long> list) {
        list.getClass();
        SharedPreferences sharedPreferencesI = i();
        Set<String> set = p13.l0.f134950a;
        Set<String> stringSet = sharedPreferencesI.getStringSet("keyDismissedPersonalRecordBanners", set);
        if (stringSet != null) {
            set = stringSet;
        }
        if (list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (!set.contains(j8 + "/" + ((Number) it.next()).longValue())) {
                return false;
            }
        }
        return true;
    }

    @Override // f12.l
    public final boolean I1() {
        return i().contains("key_strava_beacon_toggle");
    }

    @Override // f12.l
    public final boolean I2() {
        return i().getBoolean("key_disable_pairing_constraints", false);
    }

    @Override // f12.l
    public final void I3(int i14) {
        i().edit().putInt("keyUserRunningVO2Max", i14).apply();
    }

    @Override // f12.l
    public final boolean I4() {
        return i().getBoolean("keyUserSexualActivity", true);
    }

    @Override // f12.l
    public final void J(boolean z14) {
        e0.q(this, "keyHistoricalActivitiesRefreshNeeded", z14);
    }

    @Override // f12.l
    public final void J0() {
        e0.q(this, "keyVivokidChallengeTermsAccepted", true);
    }

    @Override // f12.l
    public final void J1(boolean z14) {
        e0.q(this, "nameApproved", z14);
    }

    @Override // f12.l
    public final List<String> J2() {
        List<String> listB1;
        Set<String> stringSet = i().getStringSet("userSuggestedFocuses", p13.l0.f134950a);
        return (stringSet == null || (listB1 = h0.b1(stringSet)) == null) ? j0.f134944a : listB1;
    }

    @Override // f12.l
    public final long J3() {
        return i().getLong("keyShowCalendarNotificationTimestamp", 0L);
    }

    @Override // f12.l
    public final boolean J4() {
        return i().getBoolean("nameApproved", false);
    }

    @Override // f12.l
    public final String K() {
        String string = i().getString("userHandednessCapability", "");
        return string == null ? "" : string;
    }

    @Override // f12.l
    public final void K0() {
        i().edit().remove("keyAppTheme").commit();
    }

    @Override // f12.l
    public final void K1(double d14) {
        if (d14 >= 0.0d) {
            i().edit().putString("userWeightStr", String.valueOf(d14)).apply();
        }
    }

    @Override // f12.l
    public final void K2(ArrayList arrayList) {
        i().edit().putStringSet("userSuggestedFocuses", h0.g1(arrayList)).apply();
    }

    @Override // f12.l
    public final long K3() {
        return i().getLong("keyUserBottomTimeToDate", -1L);
    }

    @Override // f12.l
    public final boolean K4() {
        return i().getBoolean("keyHistoricalActivitiesRefreshNeeded", false);
    }

    @Override // f12.l
    public final long L() {
        return i().getLong("keyUserWelcomeCardTimestamp", 0L);
    }

    @Override // f12.l
    public final boolean L0() {
        return i().getBoolean("keyUserHasSocialGroupRides", false);
    }

    @Override // f12.l
    public final Set<String> L1(String str) {
        SharedPreferences sharedPreferencesI = i();
        p13.l0 l0Var = p13.l0.f134950a;
        Set<String> stringSet = sharedPreferencesI.getStringSet(str, l0Var);
        return stringSet == null ? l0Var : stringSet;
    }

    @Override // f12.l
    public final boolean L2() {
        return i().getBoolean("key_display_training_status_pause_banner", true);
    }

    @Override // f12.l
    public final void L3(String str) {
        str.getClass();
        Set<String> setF1 = h0.f1(b4());
        setF1.add(str);
        i().edit().putStringSet("userSessions", setF1).apply();
    }

    @Override // f12.l
    public final a3 L4() {
        SharedPreferences sharedPreferencesI = i();
        sharedPreferencesI.getClass();
        return new a3(sharedPreferencesI, "KEY_ANNUAL_REPORT_PROCESSING_STATE", "");
    }

    @Override // f12.l
    public final void M() {
        i().edit().putLong("keyRegisteredRealTimeRespirationDeviceId", -1L).apply();
    }

    @Override // f12.l
    public final void M0(long j8, boolean z14) {
        i().edit().putBoolean(String.valueOf(j8), z14).apply();
    }

    @Override // f12.l
    public final void M1(String str) {
        str.getClass();
        i().edit().putString("key_user_location_country_code", str + ";" + System.currentTimeMillis()).apply();
        f60.a.f69195a.getClass();
        FirebaseCrashlytics.getInstance().setCustomKey("consentCountry", str);
    }

    @Override // f12.l
    public final List<String> M2() {
        String[] strArrSplit;
        if (i().contains("keyAudioPromptDialectDeviceId")) {
            String string = i().getString("keyAudioPromptDialectDeviceId", null);
            if (!TextUtils.isEmpty(string) && (strArrSplit = TextUtils.split(string, ",")) != null) {
                if (!(strArrSplit.length == 0)) {
                    return p13.x.k(Arrays.copyOf(strArrSplit, strArrSplit.length));
                }
            }
        }
        return null;
    }

    @Override // f12.l
    public final void M3(String str) {
        str.getClass();
        i().edit().putString("userGarminGUID", str).apply();
    }

    @Override // f12.l
    public final void M4(com.garmin.android.library.mapsdkadapter.i.b bVar) {
        bVar.getClass();
        i().edit().putString("keyMapGeodeticSystem", bVar.name()).apply();
    }

    @Override // f12.l
    public final Set<String> N() {
        SharedPreferences sharedPreferencesI = i();
        p13.l0 l0Var = p13.l0.f134950a;
        Set<String> stringSet = sharedPreferencesI.getStringSet("userRoles", l0Var);
        return stringSet == null ? l0Var : stringSet;
    }

    @Override // f12.l
    public final void N0() {
        e0.q(this, "keyMetricBasedPolylineTooltip", false);
    }

    @Override // f12.l
    public final boolean N1() {
        return i().getBoolean("key_custom_course_new_point_hint", true);
    }

    @Override // f12.l
    public final void N2(boolean z14) {
        e0.q(this, "key_display_pause_garmin_coach_banner", z14);
    }

    @Override // f12.l
    public final void N3() {
        i().edit().putString("KeyPowerCurveStartDate", "2006-01-01").apply();
    }

    @Override // f12.l
    public final long N4() {
        return i().getLong("keyRegisteredRealTimeRespirationDeviceId", -1L);
    }

    @Override // f12.l
    public final pd1.c O() {
        return R4("keyPregnancyReminderListDto");
    }

    @Override // f12.l
    public final long O0() {
        return i().getLong("userLastGraduationConsentCheckDate", 0L);
    }

    @Override // f12.l
    @SuppressLint({"ApplySharedPref"})
    public final void O1() {
        i().edit().clear().commit();
    }

    @Override // f12.l
    public final void O2(String str, boolean z14) {
        e0.q(this, str, z14);
    }

    @Override // f12.l
    public final boolean O3() {
        return i().getBoolean("keyUserBabyMovementTrackingSetup", false);
    }

    @Override // f12.l
    public final String O4() {
        return i().getString("keyUserTimezone", null);
    }

    @Override // f12.l
    public final void P(long j8) {
        i().edit().putLong("userLastGraduationConsentCheckDate", j8).apply();
    }

    @Override // f12.l
    public final boolean P0() {
        Set<String> setN = N();
        return setN.contains("ROLE_FITNESS_USER") || setN.contains("ROLE_WELLNESS_USER") || setN.contains("ROLE_OUTDOOR_USER") || setN.contains("ROLE_DIVE_USER");
    }

    @Override // f12.l
    public final void P1(boolean z14) {
        e0.q(this, "keyUserPregnancySetup", z14);
    }

    @Override // f12.l
    public final void P2(o0 o0Var) {
        o0Var.getClass();
        i().edit().putString("keyUserBikeWheelMeasurementUnit", o0Var.name()).apply();
    }

    @Override // f12.l
    public final boolean P3() {
        return i().getBoolean("keyUserPeriodPredictions", true);
    }

    @Override // f12.l
    public final u2 P4(String str, boolean z14) {
        SharedPreferences sharedPreferencesI = i();
        sharedPreferencesI.getClass();
        return new u2(sharedPreferencesI, str, z14);
    }

    @Override // f12.l
    public final boolean Q() {
        return i().getBoolean("keyUserMood", true);
    }

    @Override // f12.l
    public final void Q0(long j8, ArrayList arrayList) {
        if (I0(j8, arrayList)) {
            return;
        }
        SharedPreferences sharedPreferencesI = i();
        Set<String> set = p13.l0.f134950a;
        Set<String> stringSet = sharedPreferencesI.getStringSet("keyDismissedPersonalRecordBanners", set);
        if (stringSet != null) {
            set = stringSet;
        }
        SharedPreferences.Editor editorEdit = i().edit();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(set);
        ArrayList arrayList2 = new ArrayList(p13.y.r(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(j8 + "/" + ((Number) it.next()).longValue());
        }
        linkedHashSet.addAll(arrayList2);
        Unit unit = Unit.INSTANCE;
        editorEdit.putStringSet("keyDismissedPersonalRecordBanners", linkedHashSet);
        editorEdit.commit();
    }

    @Override // f12.l
    public final void Q1(String str, boolean z14) {
        e0.q(this, S4(str), z14);
    }

    @Override // f12.l
    public final String Q2() {
        String string = i().getString("userGarminGUID", "");
        return string == null ? "" : string;
    }

    @Override // f12.l
    public final boolean Q3() {
        return i().getBoolean("ltLiveTrackAutoStartKey", false);
    }

    @Override // f12.l
    public final void Q4(boolean z14) {
        e0.q(this, "keyUserHasBlockedNotificationRequests", z14);
    }

    @Override // f12.l
    public final void R(String str) {
        i().edit().putString("userGender", str).apply();
    }

    @Override // f12.l
    public final float R0(String str) {
        return i().getFloat(str, -1.0f);
    }

    @Override // f12.l
    public final void R1(ww0.i iVar) {
        iVar.getClass();
        i().edit().putString("keyUserHormoneContraception", GsonUtil.a(iVar)).apply();
    }

    @Override // f12.l
    public final void R2(float f14, String str) {
        i().edit().putFloat(str, f14).apply();
    }

    @Override // f12.l
    public final void R3(l0 l0Var) {
        String str;
        l0Var.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet<l0> hashSetV = V();
        ArrayList arrayList = new ArrayList(p13.y.r(hashSetV, 10));
        for (l0 l0Var2 : hashSetV) {
            if (l0Var2 == null || (str = l0Var2.f201117a) == null) {
                str = "";
            }
            arrayList.add(str);
        }
        linkedHashSet.addAll(arrayList);
        linkedHashSet.add(l0Var.f201117a);
        i().edit().putStringSet("keyAccountSuspendDismissBannerScreens", linkedHashSet).apply();
    }

    public final pd1.c R4(String str) {
        String string = i().getString(str, null);
        if (string == null) {
            return null;
        }
        pd1.c cVar = (pd1.c) GsonUtil.f47253b.fromJson(string, pd1.c.class);
        return cVar == null ? new pd1.c(null, null, null, 7, null) : cVar;
    }

    @Override // f12.l
    public final void S(String str, String str2) {
        str2.getClass();
        i().edit().putString(str, str2).apply();
    }

    @Override // f12.l
    public final boolean S0() {
        return i().getBoolean("keyVivokidChallengeTermsAccepted", false);
    }

    @Override // f12.l
    public final Set<String> S1() {
        Set<String> stringSet = i().getStringSet("keyHandsCalibrationDeviceRecords", new HashSet());
        return stringSet == null ? new HashSet() : stringSet;
    }

    @Override // f12.l
    public final String S2() {
        return i().getString("lastCIQSignInRequestJson", null);
    }

    @Override // f12.l
    public final boolean S3(j22.g gVar) {
        gVar.getClass();
        return i().getBoolean(S4(gVar.name()), false);
    }

    @Override // f12.l
    public final void T(Set<String> set) {
        set.getClass();
        i().edit().putStringSet("keyHandsCalibrationDeviceRecords", set).apply();
    }

    @Override // f12.l
    public final void T0(String str) {
        str.getClass();
        i().edit().putString("userHandednessCapability", str).apply();
    }

    @Override // f12.l
    public final boolean T1() {
        return i().getBoolean("show_mct_with_skin_temperature_tooltip", true);
    }

    @Override // f12.l
    public final void T2(gg1.n nVar) {
        i().edit().putString("keyUserMeasurementFluidUnit", nVar.f77282a).apply();
    }

    @Override // f12.l
    public final void T3(boolean z14) {
        SharedPreferences.Editor editorEdit = i().edit();
        l.f68084a.getClass();
        editorEdit.putBoolean("keyMyDayRefreshNeeded", z14).apply();
    }

    @Override // f12.l
    public final void U(long j8) {
        i().edit().putLong("profilePK", j8).apply();
    }

    @Override // f12.l
    public final Pair<String, Long> U0() {
        String string = i().getString("key_user_location_country_code", null);
        if (string == null) {
            return null;
        }
        String[] strArr = (String[]) d53.w.W(string, new String[]{";"}).toArray(new String[0]);
        return new Pair<>(strArr[0], Long.valueOf(Long.parseLong(strArr[1])));
    }

    @Override // f12.l
    public final String U1() {
        String string = i().getString("userSettingsUserID", "");
        return string == null ? "" : string;
    }

    @Override // f12.l
    public final void U2(float f14) {
        i().edit().putFloat("userHeight", f14).apply();
    }

    @Override // f12.l
    public final void U3(long j8) {
        i().edit().putLong("userSleepStartTime", j8).apply();
    }

    @Override // f12.l
    public final HashSet V() {
        l0 l0Var;
        SharedPreferences sharedPreferencesI = i();
        Set<String> set = p13.l0.f134950a;
        Set<String> stringSet = sharedPreferencesI.getStringSet("keyAccountSuspendDismissBannerScreens", set);
        if (stringSet != null) {
            set = stringSet;
        }
        Set<String> set2 = set;
        ArrayList arrayList = new ArrayList(p13.y.r(set2, 10));
        for (String str : set2) {
            l0.a aVar = l0.f201102d;
            str.getClass();
            aVar.getClass();
            l0[] l0VarArrValues = l0.values();
            int length = l0VarArrValues.length;
            int i14 = 0;
            while (true) {
                if (i14 >= length) {
                    l0Var = null;
                    break;
                }
                l0Var = l0VarArrValues[i14];
                if (p005kotlin.jvm.internal.s.g(l0Var.f201117a, str)) {
                    break;
                }
                i14++;
            }
            arrayList.add(l0Var);
        }
        return h0.Z0(arrayList);
    }

    @Override // f12.l
    public final String V0() {
        return i().getString("key_training_status_paused_date", "");
    }

    @Override // f12.l
    public final boolean V1() {
        return i().getBoolean("key_strava_beacon_toggle", false);
    }

    @Override // f12.l
    public final void V2(boolean z14) {
        e0.q(this, "keyUserSkinTempPrediction", z14);
    }

    @Override // f12.l
    public final x2 V3() {
        SharedPreferences sharedPreferencesI = i();
        sharedPreferencesI.getClass();
        return new x2(sharedPreferencesI, "keyNewsfeedFollowingNumber", 0);
    }

    @Override // f12.l
    public final void W(String str) {
        i().edit().putString("key_training_status_paused_date", str).apply();
    }

    @Override // f12.l
    public final com.garmin.android.apps.connectmobile.userprofile.model.g W0() {
        String string = i().getString("userAdministratorAccount", "");
        return (com.garmin.android.apps.connectmobile.userprofile.model.g) GsonUtil.f47253b.fromJson(string != null ? string : "", com.garmin.android.apps.connectmobile.userprofile.model.g.class);
    }

    @Override // f12.l
    public final void W1(long j8) {
        i().edit().putLong("keyUserTotalBottomTime", j8).apply();
    }

    @Override // f12.l
    public final boolean W2(String str, boolean z14) {
        return i().getBoolean(str, z14);
    }

    @Override // f12.l
    public final void W3(String str) {
        i().edit().putString("displayName", str).apply();
    }

    @Override // f12.l
    public final void X(int i14) {
        i().edit().putInt("userActivityLevel", i14).apply();
    }

    @Override // f12.l
    public final void X0(i22.d dVar) {
        try {
            i().edit().putString("keyLastSignificantLocationUpdate", new Gson().toJson(dVar)).apply();
        } catch (Exception unused) {
            i2.f36769a.getClass();
            i2.a.f(a2.SETTINGS, "GCMUserSettingsImpl", "Cannot serialize significant location: " + dVar);
        }
    }

    @Override // f12.l
    public final void X1(String str, Set<String> set) {
        set.getClass();
        i().edit().putStringSet(str, set).apply();
    }

    @Override // f12.l
    public final void X2(String str) {
        i().edit().putString("fullName", str).apply();
    }

    @Override // f12.l
    public final boolean X3() {
        return i().getBoolean("userHasViewableAccounts", false);
    }

    @Override // f12.l
    public final boolean Y() {
        return i().getBoolean("key_strava_beacon_premium_user", false);
    }

    @Override // f12.l
    public final boolean Y0() {
        return i().getBoolean("keyMoreMenuRefreshNeeded", false);
    }

    @Override // f12.l
    public final void Y1(boolean z14) {
        e0.q(this, "key_strava_beacon_premium_user", z14);
    }

    @Override // f12.l
    public final void Y2() {
        e0.q(this, "key_earned_share_activity_badge", true);
    }

    @Override // f12.l
    public final boolean Y3(long j8) {
        return i().getBoolean("userMangedAccountNoticeSeen_" + j8, false);
    }

    @Override // f12.l
    public final void Z(com.garmin.android.apps.connectmobile.userprofile.model.g gVar) {
        i().edit().putString("userAdministratorAccount", GsonUtil.a(gVar)).apply();
    }

    @Override // f12.l
    public final void Z0(pd1.c cVar) {
        cVar.getClass();
        i().edit().putString("keyBloodPressureReminderListDto", GsonUtil.a(cVar)).apply();
    }

    @Override // f12.l
    public final void Z1(boolean z14) {
        e0.q(this, "keyUserHasSocialGroupRides", z14);
    }

    @Override // f12.l
    public final void Z2() {
        i().edit().putInt("keyDevicesDashboardShowBTAdapterDisabledDialog", 0).apply();
    }

    @Override // f12.l
    public final void Z3() {
        e0.q(this, "keyContactsManagementShowAddEmergencyContactAlert", true);
    }

    @Override // f12.l
    public final void a(boolean z14) {
        SharedPreferences.Editor editorEdit = i().edit();
        editorEdit.putBoolean("3dMapEnabledCourses", z14);
        editorEdit.apply();
    }

    @Override // f12.l
    public final String a0(String str) {
        String string = i().getString(str, "");
        return string == null ? "" : string;
    }

    @Override // f12.l
    public final gg1.n a1() {
        return b.f68090a[g().ordinal()] == 1 ? gg1.n.CUP_US : gg1.n.METRIC;
    }

    @Override // f12.l
    public final void a2(boolean z14) {
        e0.q(this, "keyUserHasPregnancyRecords", z14);
    }

    @Override // f12.l
    public final boolean a3(long j8) {
        return i().getBoolean("userMangedAccountReviewContacts_" + j8, false);
    }

    @Override // f12.l
    public final boolean a4() {
        return i().getBoolean("keyUserPhysicalSymptoms", true);
    }

    @Override // f12.l
    public final String b() {
        return i().getString("keyUserLocale", null);
    }

    @Override // f12.l
    public final void b0(boolean z14) {
        e0.q(this, "keyUserMood", z14);
    }

    @Override // f12.l
    public final void b1(boolean z14) {
        e0.q(this, "key_show_training_plan_home_card", z14);
    }

    @Override // f12.l
    public final void b2(boolean z14) {
        e0.q(this, "userHasViewableAccounts", z14);
    }

    @Override // f12.l
    public final void b3(boolean z14) {
        e0.q(this, "key_disable_prompts", z14);
    }

    @Override // f12.l
    public final Set<String> b4() {
        SharedPreferences sharedPreferencesI = i();
        p13.l0 l0Var = p13.l0.f134950a;
        Set<String> stringSet = sharedPreferencesI.getStringSet("userSessions", l0Var);
        return stringSet == null ? l0Var : stringSet;
    }

    @Override // f12.l
    public final boolean c() {
        return g() == o0.STATUTE_US;
    }

    @Override // f12.l
    public final void c0(int i14) {
        i().edit().putInt("keyUserCyclingVO2Max", i14).apply();
    }

    @Override // f12.l
    public final int c1() {
        return i().getInt("KeyMapTypeOption", 1);
    }

    @Override // f12.l
    public final void c2(long j8) {
        i().edit().putLong("keyUserWelcomeCardTimestamp", j8).apply();
    }

    @Override // f12.l
    public final int c3() {
        return i().getInt("userPoints", 0);
    }

    @Override // f12.l
    public final void c4(long j8, gg1.k kVar) {
        i().edit().putString(org.apache.commons.lang3.e.e(j8, "key_device_supported_feature_"), GsonUtil.a(kVar)).apply();
    }

    @Override // f12.l
    public final long d() {
        return i().getLong("userSleepStopTime", -1L);
    }

    @Override // f12.l
    public final gg1.n d0() {
        String string = i().getString("keyUserMeasurementFluidUnit", null);
        gg1.n.a aVar = gg1.n.f77276b;
        gg1.n nVarA1 = a1();
        aVar.getClass();
        return gg1.n.a.a(string, nVarA1);
    }

    @Override // f12.l
    public final boolean d1() {
        return i().getBoolean("key_is_user_pregnant", false);
    }

    @Override // f12.l
    public final void d2(boolean z14) {
        e0.q(this, "key_strava_beacon_toggle", z14);
    }

    @Override // f12.l
    public final boolean d3() {
        return !((f12.b) KoinJavaComponent.get$default(f12.b.class, null, null, 6, null)).f() && i().getBoolean("linked_account_pref", false);
    }

    @Override // f12.l
    public final boolean d4() {
        return i().getBoolean("keyUserHasBlockedNotificationRequests", false);
    }

    @Override // f12.l
    public final void e(int i14) {
        SharedPreferences.Editor editorEdit = i().edit();
        editorEdit.putInt("epicMapType", i14);
        editorEdit.apply();
    }

    @Override // f12.l
    public final void e0() {
        e0.q(this, "key_custom_course_more_options_hint", false);
    }

    @Override // f12.l
    public final gg1.m e1() {
        String string = i().getString("keyUserFirstDayOfWeek", "");
        String str = string != null ? string : "";
        return str.length() > 0 ? gg1.m.valueOf(str) : gg1.m.MONDAY;
    }

    @Override // f12.l
    public final int e2() {
        return i().getInt("userActivityLevel", -1);
    }

    @Override // f12.l
    public final void e3(boolean z14) {
        e0.q(this, "KeyPowerCurveAvailable", z14);
    }

    @Override // f12.l
    public final void e4(boolean z14) {
        e0.q(this, "keyUserHasCurrentPregnancy", z14);
    }

    @Override // f12.l
    public final String f() {
        String string = i().getString("userLocation", "");
        return string == null ? "" : string;
    }

    @Override // f12.l
    public final void f0() {
        F4(ww0.a.INACTIVE);
        if (i().contains("keyUserAvgCycleLength")) {
            E4("keyUserAvgCycleLength");
        }
        if (i().contains("keyUserAvgPeriodLength")) {
            E4("keyUserAvgPeriodLength");
        }
        if (i().contains("keyUserHormoneContraception")) {
            E4("keyUserHormoneContraception");
        }
    }

    @Override // f12.l
    public final void f1(int i14) {
        i().edit().putInt("KeyMapTypeOption", i14).apply();
    }

    @Override // f12.l
    public final int f2() {
        return i().getInt("keyUserAvgCycleLength", -1);
    }

    @Override // f12.l
    public final void f3(String str) {
        Set setG1 = h0.g1(N());
        if (setG1.contains(str)) {
            return;
        }
        SharedPreferences.Editor editorEdit = i().edit();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(setG1);
        linkedHashSet.add(str);
        Unit unit = Unit.INSTANCE;
        editorEdit.putStringSet("userRoles", linkedHashSet);
        editorEdit.commit();
    }

    @Override // f12.l
    public final void f4(boolean z14) {
        e0.q(this, "key_user_location_confirmation", z14);
    }

    @Override // f12.l
    public final o0 g() {
        String string = i().getString("keyUserMeasurementUnit", "");
        String str = string != null ? string : "";
        if (str.length() > 0) {
            return o0.valueOf(str);
        }
        return p005kotlin.jvm.internal.s.g(Locale.US.getCountry(), Locale.getDefault().getCountry()) ? o0.STATUTE_US : o0.METRIC;
    }

    @Override // f12.l
    public final gg1.k g0(long j8) {
        String string = i().getString(org.apache.commons.lang3.e.e(j8, "key_device_supported_feature_"), "");
        if (string == null || string.length() == 0) {
            return new gg1.k(null, null, 3, null);
        }
        try {
            return (gg1.k) GsonUtil.f47253b.fromJson(string, gg1.k.class);
        } catch (JsonSyntaxException unused) {
            return new gg1.k(null, null, 3, null);
        }
    }

    @Override // f12.l
    public final void g1(boolean z14) {
        e0.q(this, "keyUserPhysicalSymptoms", z14);
    }

    @Override // f12.l
    public final void g2(long j8) {
        i().edit().putLong("keyRegisteredRealTimeHeartRateDeviceId", j8).apply();
    }

    @Override // f12.l
    public final void g3(long j8) {
        SharedPreferences.Editor editorEdit = i().edit();
        editorEdit.putBoolean("userMangedAccountNoticeSeen_" + j8, true);
        editorEdit.apply();
    }

    @Override // f12.l
    public final boolean g4() {
        return i().getBoolean("key_show_training_plan_home_card", true);
    }

    @Override // f12.l
    public final String getUserDisplayName() {
        String string = i().getString("displayName", "");
        return string == null ? "" : string;
    }

    @Override // f12.l
    public final String getUserFullName() {
        String string = i().getString("fullName", "");
        return string == null ? "" : string;
    }

    @Override // f12.l
    public final String getUserName() {
        String string = i().getString("userName", "");
        return string == null ? "" : string;
    }

    @Override // f12.l
    public final long getUserProfilePk() {
        return i().getLong("profilePK", -1L);
    }

    @Override // f12.l
    public final long h() {
        return i().getLong("userSleepStartTime", -1L);
    }

    @Override // f12.l
    public final void h0(boolean z14) {
        e0.q(this, "keyUserSexualActivity", z14);
    }

    @Override // f12.l
    public final void h1() {
        long j8 = i().getLong("keyCalendarPermissionAttempts", 0L);
        if (j8 == Long.MAX_VALUE) {
            return;
        }
        i().edit().putLong("keyCalendarPermissionAttempts", j8 + 1).apply();
    }

    @Override // f12.l
    public final void h2(long j8, String str) {
        i().edit().putLong(str, j8).apply();
    }

    @Override // f12.l
    public final void h3(c22.l lVar) {
        lVar.getClass();
        i().edit().putString("keyAppTheme", lVar.name()).apply();
    }

    @Override // f12.l
    public final String h4() {
        return i().getString("userFocus", null);
    }

    public final SharedPreferences i() {
        return (SharedPreferences) this.f68088b.getValue();
    }

    @Override // f12.l
    /* JADX INFO: renamed from: i0, reason: from getter */
    public final e2 getF68089c() {
        return this.f68089c;
    }

    @Override // f12.l
    public final void i1(String str) {
        str.getClass();
        i().edit().putString("transactionKey", str).apply();
    }

    @Override // f12.l
    public final int i2(int i14, String str) {
        return i().getInt(str, i14);
    }

    @Override // f12.l
    public final int i3() {
        return i().getInt("ltContactsCount", 0);
    }

    @Override // f12.l
    public final boolean i4() {
        return i().getBoolean("keyMetricBasedPolylineTooltip", true);
    }

    @Override // f12.l
    public final int j() {
        return i().getInt("userLevel", 0);
    }

    @Override // f12.l
    public final void j0() {
        e0.q(this, "keyUserHazardsNoticeDialog", false);
    }

    @Override // f12.l
    public final ww0.i j1() {
        String string = i().getString("keyUserHormoneContraception", "");
        ww0.i iVar = (ww0.i) GsonUtil.f47253b.fromJson(string != null ? string : "", ww0.i.class);
        return iVar == null ? ww0.i.NONE : iVar;
    }

    @Override // f12.l
    public final void j2(String str) {
        i().edit().putString("userName", str).apply();
    }

    @Override // f12.l
    public final void j3(boolean z14) {
        e0.q(this, "keyUserDischarge", z14);
    }

    @Override // f12.l
    public final void j4() {
        e0.q(this, "keyChallengeTermsAccepted", true);
    }

    @Override // f12.l
    public final o0 k() {
        String string = i().getString("keyUserBikeWheelMeasurementUnit", "METRIC");
        return o0.valueOf(string != null ? string : "METRIC");
    }

    @Override // f12.l
    public final int k0(String str) {
        return i().getInt(str, -1);
    }

    @Override // f12.l
    public final boolean k1() {
        return i().getBoolean("keyChallengeTermsAccepted", false);
    }

    @Override // f12.l
    public final boolean k2(String str) {
        return i().getBoolean(str, false);
    }

    @Override // f12.l
    public final void k3() {
        e0.q(this, "key_custom_course_new_point_hint", false);
    }

    @Override // f12.l
    public final boolean k4() {
        return i().getBoolean("keyUserHazardsNoticeDialog", true);
    }

    @Override // f12.l
    public final com.garmin.android.library.mapsdkadapter.i.d l() {
        Object obj = null;
        String string = i().getString("trailsMapProvider", null);
        if (string == null) {
            return null;
        }
        w13.c cVar = com.garmin.android.library.mapsdkadapter.i.d.f50295h;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            Object next = bVarN.next();
            if (p005kotlin.jvm.internal.s.g(((com.garmin.android.library.mapsdkadapter.i.d) next).f50296a, string)) {
                obj = next;
                break;
            }
        }
        return (com.garmin.android.library.mapsdkadapter.i.d) obj;
    }

    @Override // f12.l
    public final boolean l0() {
        return i().getBoolean("keySocialGroupRideInfoDialog", true);
    }

    @Override // f12.l
    public final LocalDate l1() {
        if (i().contains("userDateOfBirthString")) {
            try {
                return DateTimeFormat.forPattern("yyyy-MM-dd").parseLocalDate(i().getString("userDateOfBirthString", null));
            } catch (IllegalArgumentException e4) {
                i2.f36769a.getClass();
                i2.a.e(a2.SETTINGS, "getUserDateOfBirth: " + e4);
            } catch (UnsupportedOperationException e14) {
                i2.f36769a.getClass();
                i2.a.e(a2.SETTINGS, "getUserDateOfBirth: " + e14);
            }
        }
        return null;
    }

    @Override // f12.l
    public final void l2(boolean z14) {
        e0.q(this, "keyPulseOxSleepCardSupported", z14);
    }

    @Override // f12.l
    public final long l3(String str) {
        return i().getLong(str, -1L);
    }

    @Override // f12.l
    public final void l4(String str) {
        i().edit().putString("userIconURL", str).apply();
    }

    @Override // f12.l
    public final void m(com.garmin.android.library.mapsdkadapter.i.d dVar) {
        dVar.getClass();
        SharedPreferences.Editor editorEdit = i().edit();
        editorEdit.putString("epicMapProvider", dVar.f50296a);
        editorEdit.apply();
    }

    @Override // f12.l
    public final boolean m0() {
        return i().getBoolean("key_display_pause_garmin_coach_banner", true);
    }

    @Override // f12.l
    public final void m1(int i14) {
        i().edit().putInt("userLevel", i14).apply();
    }

    @Override // f12.l
    public final void m2(boolean z14) {
        e0.q(this, "keyUserFlow", z14);
    }

    @Override // f12.l
    public final boolean m3(String str) {
        return i().contains(str);
    }

    @Override // f12.l
    public final void m4(boolean z14) {
        e0.q(this, "keyUserSexDrive", z14);
    }

    @Override // f12.l
    public final boolean n() {
        return i().getBoolean("3dMapEnabledTrails", false);
    }

    @Override // f12.l
    public final float n0(String str) {
        return i().getFloat(str, 0.0f);
    }

    @Override // f12.l
    public final long n1() {
        return i().getLong("keyCalendarPermissionAttempts", 0L);
    }

    @Override // f12.l
    public final boolean n2() {
        return i().getBoolean("key_custom_course_more_options_hint", true);
    }

    @Override // f12.l
    public final boolean n3() {
        return i().getBoolean("keyFiveHzDialog", true);
    }

    @Override // f12.l
    public final boolean n4() {
        return i().getBoolean("key_course_map_settings_hint", true);
    }

    @Override // f12.l
    public final void o(int i14, String str) {
        Map linkedHashMap;
        String string = i().getString("activityMapType", null);
        if (string == null || string.length() == 0) {
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            linkedHashMap = new LinkedHashMap(k0Var);
        } else {
            n63.b.a aVar = n63.b.f123892d;
            aVar.getClass();
            linkedHashMap = (Map) aVar.c(new q0(y1.f117048a, m0.f116981a), string);
        }
        linkedHashMap.put(str, Integer.valueOf(i14));
        SharedPreferences.Editor editorEdit = i().edit();
        n63.b.a aVar2 = n63.b.f123892d;
        aVar2.getClass();
        editorEdit.putString("activityMapType", aVar2.b(new q0(y1.f117048a, m0.f116981a), linkedHashMap));
        editorEdit.apply();
    }

    @Override // f12.l
    public final void o0(boolean z14) {
        e0.q(this, "keyUserGlucoseTrackingSetup", z14);
    }

    @Override // f12.l
    public final boolean o1(long j8) {
        return i().getBoolean(String.valueOf(j8), false);
    }

    @Override // f12.l
    public final boolean o2() {
        return i().getBoolean("Key Live Event Sharing In Progress", false);
    }

    @Override // f12.l
    public final void o3(int i14) {
        i().edit().putInt("ltContactsCount", i14).apply();
    }

    @Override // f12.l
    public final void o4(boolean z14) {
        e0.q(this, "keyUserBabyMovementTrackingSetup", z14);
    }

    @Override // f12.l
    public final void p(com.garmin.android.library.mapsdkadapter.i.d dVar) {
        dVar.getClass();
        SharedPreferences.Editor editorEdit = i().edit();
        editorEdit.putString("trailsMapProvider", dVar.f50296a);
        editorEdit.apply();
    }

    @Override // f12.l
    public final void p0(l0 l0Var) {
        String str;
        l0Var.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        HashSet<l0> hashSetA3 = A3();
        ArrayList arrayList = new ArrayList(p13.y.r(hashSetA3, 10));
        for (l0 l0Var2 : hashSetA3) {
            if (l0Var2 == null || (str = l0Var2.f201117a) == null) {
                str = "";
            }
            arrayList.add(str);
        }
        linkedHashSet.addAll(arrayList);
        linkedHashSet.add(l0Var.f201117a);
        i().edit().putStringSet("keyConsentDismissBannerScreens", linkedHashSet).apply();
    }

    @Override // f12.l
    public final void p1(String str) {
        i().edit().putString("userLocation", str).apply();
    }

    @Override // f12.l
    public final boolean p2() {
        return i().getBoolean("key_disable_prompts", false);
    }

    @Override // f12.l
    public final void p3(boolean z14) {
        e0.q(this, "key_display_training_status_pause_banner", z14);
    }

    @Override // f12.l
    public final void p4(boolean z14) {
        e0.q(this, "linked_account_pref", z14);
    }

    @Override // f12.l
    public final Integer q(String str) {
        Map map;
        str.getClass();
        String string = i().getString("activityMapType", null);
        if (string == null || string.length() == 0) {
            map = k0.f134949a;
            map.getClass();
        } else {
            n63.b.a aVar = n63.b.f123892d;
            aVar.getClass();
            map = (Map) aVar.c(new q0(y1.f117048a, m0.f116981a), string);
        }
        return (Integer) map.getOrDefault(str, null);
    }

    @Override // f12.l
    public final boolean q0() {
        return i().getBoolean("keyUserPregnancySetup", false);
    }

    @Override // f12.l
    public final void q1() {
        e0.q(this, "keyContactsManagementShowAddLiveTrackContactAlert", true);
    }

    @Override // f12.l
    public final boolean q2() {
        bv.b.f21239a.getClass();
        bv.b.a();
        return k1.f37122a.d() && i().getBoolean("key_should_show_cycle_tracking_nav_bar_tip", true);
    }

    @Override // f12.l
    public final void q3(String str) {
        i().edit().putString("userFocus", str).apply();
    }

    @Override // f12.l
    public final String q4() {
        String string = i().getString("userIconURL", "");
        return string == null ? "" : string;
    }

    @Override // f12.l
    public final void r(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        onSharedPreferenceChangeListener.getClass();
        i().unregisterOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // f12.l
    public final boolean r0() {
        SharedPreferences sharedPreferencesI = i();
        l.f68084a.getClass();
        return sharedPreferencesI.getBoolean("keyMyDayRefreshNeeded", true);
    }

    @Override // f12.l
    public final void r1(int i14) {
        i().edit().putInt("keyUserAvgPeriodLength", i14).apply();
    }

    @Override // f12.l
    public final int r2() {
        return i().getInt("keyUserAvgPeriodLength", -1);
    }

    @Override // f12.l
    public final void r3(int i14) {
        i().edit().putInt("keyInviteNotificationCount", i14).apply();
    }

    @Override // f12.l
    public final void r4(String str, String str2) {
        str.getClass();
        i().edit().putString(str.concat("_userIconURL"), str2).apply();
    }

    @Override // f12.l
    public final void s(String str, boolean z14) {
        Map linkedHashMap;
        str.getClass();
        String string = i().getString("3dMapEnabled", null);
        if (string == null || string.length() == 0) {
            k0 k0Var = k0.f134949a;
            k0Var.getClass();
            linkedHashMap = new LinkedHashMap(k0Var);
        } else {
            n63.b.a aVar = n63.b.f123892d;
            aVar.getClass();
            linkedHashMap = (Map) aVar.c(new q0(y1.f117048a, m63.g.f116948a), string);
        }
        linkedHashMap.put(str, Boolean.valueOf(z14));
        SharedPreferences.Editor editorEdit = i().edit();
        n63.b.a aVar2 = n63.b.f123892d;
        aVar2.getClass();
        editorEdit.putString("3dMapEnabled", aVar2.b(new q0(y1.f117048a, m63.g.f116948a), linkedHashMap));
        editorEdit.apply();
    }

    @Override // f12.l
    public final void s0(int i14) {
        i().edit().putInt("diveNumber", i14).apply();
    }

    @Override // f12.l
    public final void s1(long j8) {
        i().edit().putLong("key_primary_activity_tracker_id", j8).apply();
    }

    @Override // f12.l
    public final void s2(String str) {
        i().edit().putString("keyUserTimezone", str).apply();
    }

    @Override // f12.l
    public final boolean s3() {
        return i().getBoolean("keyUserFlow", true);
    }

    @Override // f12.l
    public final long s4() {
        return i().getLong("key_primary_activity_tracker_id", -1L);
    }

    @Override // f12.l
    public final float t() {
        return i().getFloat("userHeight", -1.0f);
    }

    @Override // f12.l
    public final void t0() {
        e0.q(this, "keyFiveHzDialog", false);
    }

    @Override // f12.l
    @SuppressLint({"WrongConstant"})
    public final String[] t1() {
        com.garmin.android.apps.connectmobile.navigation.h.f39377a.getClass();
        String[] strArrA = com.garmin.android.apps.connectmobile.navigation.h.a();
        String string = i().getString("key_bottom_navigation_items", null);
        if (string != null && !d53.w.J(string)) {
            String[] strArrSplit = TextUtils.split(string, ",");
            if (strArrSplit.length == 3) {
                strArrA = (String[]) Arrays.copyOf(strArrSplit, strArrSplit.length);
                int length = strArrA.length;
                for (int i14 = 0; i14 < length; i14++) {
                    com.garmin.android.apps.connectmobile.navigation.h hVar = com.garmin.android.apps.connectmobile.navigation.h.f39377a;
                    String str = strArrA[i14];
                    hVar.getClass();
                    if (!com.garmin.android.apps.connectmobile.navigation.h.d(str)) {
                        for (String str2 : com.garmin.android.apps.connectmobile.navigation.h.a()) {
                            if (!d53.w.z(string, str2, false) && !p13.u.z(strArrA, str2)) {
                                strArrA[i14] = str2;
                                break;
                            }
                        }
                    }
                }
                if (!p13.m.b(strArrA, strArrSplit)) {
                    t2(strArrA);
                }
            }
        }
        return strArrA;
    }

    @Override // f12.l
    public final void t2(String[] strArr) {
        strArr.getClass();
        SharedPreferences.Editor editorEdit = i().edit();
        editorEdit.remove("key_bottom_navigation_items");
        editorEdit.commit();
        if (strArr.length == 0) {
            return;
        }
        SharedPreferences.Editor editorEdit2 = i().edit();
        editorEdit2.putString("key_bottom_navigation_items", TextUtils.join(",", strArr));
        editorEdit2.commit();
    }

    @Override // f12.l
    public final void t3(int i14) {
        i().edit().putInt("keyUserAvgCycleLength", i14).apply();
    }

    @Override // f12.l
    public final void t4() {
        i().edit().putStringSet("userSessions", p13.l0.f134950a).apply();
    }

    @Override // f12.l
    public final int u() {
        try {
            LocalDate localDateL1 = l1();
            if (localDateL1 != null) {
                return Years.yearsBetween(localDateL1, new LocalDate()).getYears();
            }
            return -1;
        } catch (Exception e4) {
            a2 a2Var = a2.SETTINGS;
            String strN = fb1.c.n("getUserAge: ", e4.getMessage());
            i2.f36769a.getClass();
            i2.a.f(a2Var, "GCMUserSettingsImpl", strN);
            return -1;
        }
    }

    @Override // f12.l
    public final void u0(long j8, boolean z14) {
        SharedPreferences.Editor editorEdit = i().edit();
        editorEdit.putBoolean("userMangedAccountReviewContacts_" + j8, z14);
        editorEdit.apply();
    }

    @Override // f12.l
    public final void u1(pd1.c cVar) {
        cVar.getClass();
        i().edit().putString("keyPregnancyReminderListDto", GsonUtil.a(cVar)).apply();
    }

    @Override // f12.l
    public final void u2(int i14, String str) {
        i().edit().putInt(str, i14).apply();
    }

    @Override // f12.l
    public final void u3(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        onSharedPreferenceChangeListener.getClass();
        i().registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    @Override // f12.l
    public final i22.d u4() {
        String string = i().getString("keyLastSignificantLocationUpdate", null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return (i22.d) new Gson().fromJson(string, i22.d.class);
        } catch (Exception unused) {
            a2 a2Var = a2.SETTINGS;
            i2.f36769a.getClass();
            i2.a.f(a2Var, "GCMUserSettingsImpl", "Cannot deserialize significant location.");
            return null;
        }
    }

    @Override // f12.l
    public final com.garmin.android.library.mapsdkadapter.i.d v() {
        Object obj = null;
        String string = i().getString("coursesMapProvider", null);
        if (string == null) {
            return null;
        }
        w13.c cVar = com.garmin.android.library.mapsdkadapter.i.d.f50295h;
        p13.c.b bVarN = com.airbnb.lottie.animation.keyframe.a.n(cVar, cVar);
        while (bVarN.hasNext()) {
            Object next = bVarN.next();
            if (p005kotlin.jvm.internal.s.g(((com.garmin.android.library.mapsdkadapter.i.d) next).f50296a, string)) {
                obj = next;
                break;
            }
        }
        return (com.garmin.android.library.mapsdkadapter.i.d) obj;
    }

    @Override // f12.l
    public final void v0(boolean z14) {
        e0.q(this, "keyUserPeriodPredictions", z14);
    }

    @Override // f12.l
    public final void v1(String str) {
        i().edit().putString("keyUserLocale", str).apply();
    }

    @Override // f12.l
    public final boolean v2() {
        return i().getInt("keyDevicesDashboardShowBTAdapterDisabledDialog", 1) == 1;
    }

    @Override // f12.l
    public final double v3() {
        SharedPreferences sharedPreferencesI = i();
        String str = IdManager.DEFAULT_VERSION_NAME;
        String string = sharedPreferencesI.getString("userWeightStr", IdManager.DEFAULT_VERSION_NAME);
        if (string != null) {
            str = string;
        }
        return Double.parseDouble(str);
    }

    @Override // f12.l
    public final void v4(boolean z14) {
        e0.q(this, "keyWheelchairMode", z14);
        this.f68089c.d(Boolean.valueOf(z14));
    }

    @Override // f12.l
    public final String w() {
        String string = i().getString("userGender", "");
        return string == null ? "" : string;
    }

    @Override // f12.l
    public final List<String> w0() {
        String[] strArrSplit;
        if (i().contains("keyAudioPromptDialect")) {
            String string = i().getString("keyAudioPromptDialect", null);
            if (!TextUtils.isEmpty(string) && (strArrSplit = TextUtils.split(string, ",")) != null) {
                if (!(strArrSplit.length == 0)) {
                    return p13.x.k(Arrays.copyOf(strArrSplit, strArrSplit.length));
                }
            }
        }
        return null;
    }

    @Override // f12.l
    public final void w1() {
        e0.q(this, "key_should_show_pregnancy_tracking_nav_bar_tip", false);
    }

    @Override // f12.l
    public final long w2() {
        return i().getLong("userLastLoggedSession", -1L);
    }

    @Override // f12.l
    public final pd1.c w3() {
        return R4("keyBloodPressureReminderListDto");
    }

    @Override // f12.l
    public final void w4(long j8) {
        i().edit().putLong("keyShowCalendarNotificationTimestamp", j8).apply();
    }

    @Override // f12.l
    public final void x(boolean z14) {
        SharedPreferences.Editor editorEdit = i().edit();
        editorEdit.putBoolean("3dMapEnabledTrails", z14);
        editorEdit.apply();
    }

    @Override // f12.l
    public final boolean x0() {
        return i().getBoolean("keyUserSexDrive", true);
    }

    @Override // f12.l
    public final void x1(boolean z14) {
        e0.q(this, "keyUserFertileWindowPredictions", z14);
    }

    @Override // f12.l
    public final void x2(double d14) {
        if (d14 >= 0.0d) {
            i().edit().putString("userGoalWeightStr", String.valueOf(d14)).apply();
        }
    }

    @Override // f12.l
    public final boolean x3() {
        return i().getBoolean("keyUserDischarge", true);
    }

    @Override // f12.l
    public final void x4(int i14) {
        i().edit().putInt("userPoints", i14).apply();
    }

    @Override // f12.l
    public final boolean y() {
        return g() == o0.METRIC;
    }

    @Override // f12.l
    public final boolean y0() {
        return i().getBoolean("keyUserHasCurrentPregnancy", false);
    }

    @Override // f12.l
    public final ww0.a y1() {
        String string = i().getString("keyUserCycleType", "");
        ww0.a aVar = (ww0.a) GsonUtil.f47253b.fromJson(string != null ? string : "", ww0.a.class);
        return aVar == null ? ww0.a.REGULAR : aVar;
    }

    @Override // f12.l
    public final int y2() {
        return i().getInt("keyUserCyclingVO2Max", -1);
    }

    @Override // f12.l
    public final void y3(ArrayList arrayList, ArrayList arrayList2) {
        SharedPreferences.Editor editorEdit = i().edit();
        editorEdit.getClass();
        editorEdit.remove("keyAudioPromptDialectDeviceId");
        editorEdit.remove("keyAudioPromptDialect");
        if (!arrayList.isEmpty() && !arrayList2.isEmpty()) {
            editorEdit.putString("keyAudioPromptDialectDeviceId", TextUtils.join(",", arrayList));
            editorEdit.putString("keyAudioPromptDialect", TextUtils.join(",", arrayList2));
        }
        editorEdit.apply();
    }

    @Override // f12.l
    public final int y4() {
        return i().getInt("keyInviteNotificationCount", 0);
    }

    @Override // f12.l
    public final void z(com.garmin.android.library.mapsdkadapter.i.d dVar) {
        dVar.getClass();
        SharedPreferences.Editor editorEdit = i().edit();
        editorEdit.putString("coursesMapProvider", dVar.f50296a);
        editorEdit.apply();
    }

    @Override // f12.l
    public final boolean z0() {
        return i().getBoolean("keyUserFertileWindowPredictions", true);
    }

    @Override // f12.l
    public final void z1() {
        e0.q(this, "Key Live Event Sharing In Progress", false);
    }

    @Override // f12.l
    public final boolean z2() {
        return i().getBoolean("keyPulseOxSleepCardSupported", false);
    }

    @Override // f12.l
    public final void z3(long j8) {
        i().edit().putLong("userLastLoggedSession", j8).apply();
    }

    @Override // f12.l
    public final String z4(String str) {
        str.getClass();
        return i().getString(str.concat("_userIconURL"), null);
    }

    @Metadata(d1 = {"\u0000\u0015\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0003\b\u0098\u0001\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0012\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0006R\u0014\u0010\u0014\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u0014\u0010\u0015\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0016\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0006R\u0014\u0010\u0017\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u001a\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001b\u0010\u0006R\u0014\u0010\u001c\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b#\u0010\u0006R\u0014\u0010$\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b$\u0010\u0006R\u0014\u0010%\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b%\u0010\u0006R\u0014\u0010&\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b&\u0010\u0006R\u0014\u0010'\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b'\u0010\u0006R\u0014\u0010(\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b(\u0010\u0006R\u0014\u0010)\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b)\u0010\u0006R\u0014\u0010*\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b*\u0010\u0006R\u0014\u0010+\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b+\u0010\u0006R\u0014\u0010,\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b,\u0010\u0006R\u0014\u0010-\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b-\u0010\u0006R\u0014\u0010.\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b.\u0010\u0006R\u0014\u0010/\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b/\u0010\u0006R\u0014\u00100\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b0\u0010\u0006R\u0014\u00101\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b1\u0010\u0006R\u0014\u00102\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b2\u0010\u0006R\u0014\u00103\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b3\u0010\u0006R\u0014\u00104\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b4\u0010\u0006R\u0014\u00105\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b5\u0010\u0006R\u0014\u00106\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b6\u0010\u0006R\u0014\u00107\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b7\u0010\u0006R\u0014\u00108\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b8\u0010\u0006R\u0014\u00109\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b9\u0010\u0006R\u0014\u0010:\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b:\u0010\u0006R\u0014\u0010;\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b;\u0010\u0006R\u0014\u0010<\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b<\u0010\u0006R\u0014\u0010=\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b=\u0010\u0006R\u0014\u0010>\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b>\u0010\u0006R\u0014\u0010?\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b?\u0010\u0006R\u0014\u0010@\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b@\u0010\u0006R\u0014\u0010A\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bA\u0010\u0006R\u0014\u0010B\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bB\u0010\u0006R\u0014\u0010C\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bC\u0010\u0006R\u0014\u0010D\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bD\u0010\u0006R\u0014\u0010E\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bE\u0010\u0006R\u0014\u0010F\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bF\u0010\u0006R\u0014\u0010G\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bG\u0010\u0006R\u0014\u0010H\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bH\u0010\u0006R\u0014\u0010I\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bI\u0010\u0006R\u0014\u0010J\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bJ\u0010\u0006R\u0014\u0010K\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bK\u0010\u0006R\u0014\u0010L\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bL\u0010\u0006R\u0014\u0010M\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bM\u0010\u0006R\u0014\u0010N\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bN\u0010\u0006R\u0014\u0010O\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bO\u0010\u0006R\u0014\u0010P\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bP\u0010\u0006R\u0014\u0010Q\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bQ\u0010\u0006R\u0014\u0010R\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bR\u0010\u0006R\u0014\u0010S\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bS\u0010\u0006R\u0014\u0010T\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bT\u0010\u0006R\u0014\u0010U\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bU\u0010\u0006R\u0014\u0010V\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bV\u0010\u0006R\u0014\u0010W\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bW\u0010\u0006R\u0014\u0010X\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bX\u0010\u0006R\u0014\u0010Y\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bY\u0010\u0006R\u0014\u0010Z\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bZ\u0010\u0006R\u0014\u0010[\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b[\u0010\u0006R\u0014\u0010\\\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\\\u0010\u0006R\u0014\u0010]\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b]\u0010\u0006R\u0014\u0010^\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b^\u0010\u0006R\u0014\u0010_\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b_\u0010\u0006R\u0014\u0010`\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b`\u0010\u0006R\u0014\u0010a\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\ba\u0010\u0006R\u0014\u0010b\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bb\u0010\u0006R\u0014\u0010c\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bc\u0010\u0006R\u0014\u0010d\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bd\u0010\u0006R\u0014\u0010e\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\be\u0010\u0006R\u0014\u0010f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bf\u0010\u0006R\u0014\u0010g\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bg\u0010\u0006R\u0014\u0010h\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bh\u0010\u0006R\u0014\u0010i\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bi\u0010\u0006R\u0014\u0010j\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bj\u0010\u0006R\u0014\u0010k\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bk\u0010\u0006R\u0014\u0010l\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bl\u0010\u0006R\u0014\u0010m\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bm\u0010\u0006R\u0014\u0010n\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bn\u0010\u0006R\u0014\u0010o\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bo\u0010\u0006R\u0014\u0010p\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bp\u0010\u0006R\u0014\u0010q\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bq\u0010\u0006R\u0014\u0010r\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\br\u0010\u0006R\u0014\u0010s\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bs\u0010\u0006R\u0014\u0010t\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bt\u0010\u0006R\u0014\u0010u\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bu\u0010\u0006R\u0014\u0010v\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bv\u0010\u0006R\u0014\u0010w\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bw\u0010\u0006R\u0014\u0010x\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bx\u0010\u0006R\u0014\u0010y\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\by\u0010\u0006R\u0014\u0010z\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\bz\u0010\u0006R\u0014\u0010{\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b{\u0010\u0006R\u0014\u0010|\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b|\u0010\u0006R\u0014\u0010}\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b}\u0010\u0006R\u0014\u0010~\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b~\u0010\u0006R\u0014\u0010\u007f\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u007f\u0010\u0006R\u0016\u0010\u0080\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010\u0006R\u0016\u0010\u0081\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010\u0006R\u0016\u0010\u0082\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010\u0006R\u0016\u0010\u0083\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0083\u0001\u0010\u0006R\u0016\u0010\u0084\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0084\u0001\u0010\u0006R\u0016\u0010\u0085\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0085\u0001\u0010\u0006R\u0016\u0010\u0086\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010\u0006R\u0016\u0010\u0087\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010\u0006R\u0016\u0010\u0088\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010\u0006R\u0016\u0010\u0089\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010\u0006R\u0016\u0010\u008a\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010\u0006R\u0016\u0010\u008b\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010\u0006R\u0016\u0010\u008c\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u008c\u0001\u0010\u0006R\u0016\u0010\u008d\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010\u0006R\u0016\u0010\u008e\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010\u0006R\u0016\u0010\u008f\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u008f\u0001\u0010\u0006R\u0016\u0010\u0090\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0090\u0001\u0010\u0006R\u0016\u0010\u0091\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0091\u0001\u0010\u0006R\u0016\u0010\u0092\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0092\u0001\u0010\u0006R\u0016\u0010\u0093\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010\u0006R\u0016\u0010\u0094\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0094\u0001\u0010\u0006R\u0016\u0010\u0095\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0095\u0001\u0010\u0006R\u0016\u0010\u0096\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0096\u0001\u0010\u0006R\u0016\u0010\u0097\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0097\u0001\u0010\u0006R\u0016\u0010\u0098\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0098\u0001\u0010\u0006R\u0016\u0010\u0099\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u0099\u0001\u0010\u0006R\u0016\u0010\u009a\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010\u0006R\u0016\u0010\u009b\u0001\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0007\n\u0005\b\u009b\u0001\u0010\u0006¨\u0006\u009c\u0001"}, d2 = {"Lf12/m$a;", "", "<init>", "()V", "", "DEFAULT_POWER_CURVE_START_DATE", "Ljava/lang/String;", "DEFAULT_POWER_CURVE_API_START_DATE", "TAG", "GCM_USER_PREFS", "USER_TRANSACTION_KEY", "USER_PROFILE_PK", "USER_FULL_NAME", "USER_DISPLAY_NAME", "USER_NAME", "USER_ICON_URL", "USER_ROLES", "USER_LAST_GRADUATION_CONSENT_CHECK_DATE", "USER_LIVE_TRACKING_SESSION_NAME", "USER_LIVE_TRACK_CONTACTS_COUNT", "USER_DEVICES_DASHBOARD_SHOW_BT_ADAPTER_DISABLED_DIALOG", "USER_INVITE_NOTIFICATION_COUNT", "USER_HEIGHT", "USER_WEIGHT_STR", "USER_WEIGHT_GOAL_STR", "USER_DATE_OF_BIRTH", "USER_GENDER", "USER_SLEEP_START_TIME", "USER_SLEEP_STOP_TIME", "USER_LEVEL", "USER_POINTS", "USER_LOCATION", "USER_SETTINGS_USER_ID", "USER_DIVE_NUMBER", "USER_HANDEDNESS_CAPABILITY", "USER_NAME_APPROVED", "USER_MEASUREMENT_UNIT", "USER_MEASUREMENT_FLUID_UNIT", "USER_ACTIVITY_LEVEL", "USER_VO2_MAX_RUNNING", "USER_VO2_MAX_CYCLING", "USER_FIRST_DAY_OF_WEEK", "USER_GOOGLE_ID_TOKEN", "USER_SHOW_CALENDAR_NOTIFICATION_TIMESTAMP", "USER_CALENDAR_PERMISSION_ATTEMPTS", "USER_MY_DAY_REFRESH_NEEDED", "USER_MORE_MENU_REFRESH_NEEDED", "USER_WELCOME_CARD_TIMESTAMP", "USER_REGISTERED_REAL_TIME_HEART_RATE_DEVICE_ID", "USER_REGISTERED_REAL_TIME_RESPIRATION_DEVICE_ID", "USER_LAST_WEIGHT_FOR_DELTA", "USER_BOTTOM_TIME_TO_DATE", "USER_TOTAL_BOTTOM_TIME", "USER_PRIMARY_ACTIVITY_TRACKER_ID", "USER_MY_FITNESS_PAL_ACCOUNT_LINKED", "USER_AUDIO_PROMPT_DIALECT_DEVICE_ID", "USER_AUDIO_PROMPT_DIALECT", "USER_EARNED_SHARE_ACTIVITY_BADGE", "USER_LOCATION_CONFIRMATION", "USER_LOCATION_COUNTRY_CODE", "USER_CONSENT_DISMISS_BANNER_SCREENS", "USER_ACCOUNT_SUSPEND_DISMISS_BANNER_SCREENS", "USER_LAST_SIGNIFICANT_LOCATION_UPDATE", "USER_STRAVA_BEACON_TOGGLE", "USER_STRAVA_BEACON_PREMIUM_USER", "USER_CONNECTION_CONSENT_DIALOG", "USER_BOTTOM_NAVIGATION_ITEMS", "USER_SHOW_TRAINING_PLAN_HOME_CARD", "USER_BODY_BATTERY_INFO_DIALOG", "USER_PULSE_OX_VISITED", "USER_PULSE_OX_CHART_BLENDED", "USER_GARMIN_GUID", "USER_POWER_CURVE_DATA_AVAILABLE", "USER_POWER_CURVE_START_DATE", "USER_LIVE_EVENT_SHARING_IN_PROGESS", "USER_LIVE_TRACKING_AUTO_START", "USER_BIKE_WHEEL_MEASUREMENT_UNIT", "USER_CYCLE_TYPE", "USER_HORMONE_CONTRACEPTION", "USER_AVG_CYCLE_LENGTH", "USER_AVG_PERIOD_LENGTH", "USER_PERIOD_PREDICTIONS", "USER_SKIN_TEMP_PREDICTION", "USER_FERTILE_WINDOW_PREDICTIONS", "USER_SHOW_MCT_WITH_SKIN_TEMP_TOOLTIP", "USER_FLOW", "USER_PHYSICAL_SYMPTOMS", "USER_PERIMENOPAUSE_MENOPAUSE_SYMPTOMS", "USER_MOOD", "USER_DISCHARGE", "USER_OVULATION_DATE", "USER_SEXUAL_ACTIVITY", "USER_SEX_DRIVE", "USER_MAP_TYPE_OPTION", "USER_SHOULD_SHOW_CYCLE_TRACKING_NAV_BAR_TIP", "USER_CONTACTS_MANAGEMENT_SHOW_ADD_EMERGENCY_CONTACT_ALERT", "USER_CONTACTS_MANAGEMENT_SHOW_ADD_LIVETRACK_CONTACT_ALERT", "USER_CONTACTS_MANAGEMENT_SHOW_TOOL_TIP", "USER_HANDS_CALIBRATION_DEVICE_RECORDS", "USER_PULSE_OX_SLEEP_CARD_SUPPORTED", "USER_DISABLE_PAIRING_CONSTRAINTS", "USER_DISABLE_PROMPTS", "USER_IS_USER_PREGNANT", "USER_ADD_WEIGHT_GOAL_HINT", "USER_CUSTOM_COURSE_NEW_POINT_HINT", "USER_CUSTOM_COURSE_MORE_OPTIONS_HINT", "USER_COURSE_MAP_SETTINGS_HINT", "USER_TRAINING_STATUS_PAUSE_DATE_STRING", "USER_DISPLAY_TS_PAUSE_BANNER", "USER_DISPLAY_PAUSE_GARMIN_COACH_BANNER", "USER_DEVICE_SUPPORTED_FEATURE", "USER_CHALLENGE_TERMS_ACCEPTED", "USER_VIVOKID_CHALLENGE_TERMS_ACCEPTED", "USER_METRIC_BASED_POLYLINE_TOOLTIP", "USER_MAP_GEODETIC_SYSTEM", "USER_SHOULD_SHOW_PREGNANCY_TRACKING_NAV_BAR_TIP", "USER_PREGNANCY_SETUP", "USER_GLUCOSE_TRACKING_SETUP", "USER_BABY_MOVEMENT_TRACKING_SETUP", "USER_HAS_PREGNANCY_RECORDS", "USER_HAS_CURRENT_PREGNANCY", "APP_THEME", "USER_HAS_BLOCKED_CALENDAR_PERMISSION_REQUESTS", "USER_HAS_BLOCKED_PHONE_PERMISSION_REQUESTS", "USER_HAS_BLOCKED_LOCATION_PERMISSION_REQUESTS", "USER_HAS_BLOCKED_NOTIFICATION_REQUESTS", "USER_PREGNANCY_REMINDERS", "USER_BLOOD_PRESSURE_REMINDERS", "USER_DISMISSED_PERSONAL_RECORD_BANNERS", "LAST_CIQ_SIGN_IN_REQUEST_JSON", "USER_LOCALE", "USER_TIMEZONE", "WHEELCHAIR_MODE", "USER_HAS_VO2_MAX_RECORDS", "USER_FOCUS", "USER_SUGGESTED_FOCUSES", "USER_LAST_LOGGED_SESSION", "USER_SESSIONS", "USER_SOCIAL_GROUP_RIDE_INFO_DIALOG", "USER_HAS_SOCIAL_GROUP_RIDES", "USER_HAZARDS_NOTICE_DIALOG", "USER_HAS_VIEWABLE_ACCOUNTS", "HISTORICAL_ACTIVITIES_REFRESH_NEEDED", "USER_FIVE_HZ_DIALOG", "USER_ACTIVITY_MAP_PROVIDER", "USER_3D_MAP_ENABLED", "USER_ACTIVITY_MAP_TYPE", "USER_COURSES_MAP_PROVIDER", "USER_3D_MAP_ENABLED_COURSES", "USER_TRAILS_MAP_PROVIDER", "USER_3D_MAP_ENABLED_TRAILS", "USER_EPIC_MAP_PROVIDER", "USER_EPIC_MAP_TYPE", "USER_ADMINISTRATOR_ACCOUNT", "USER_MANAGED_ACCOUNT_NOTICE_SEEN", "USER_MANAGED_ACCOUNT_REVIEW_CONTACTS", "gcm-common-base_vanillaRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(p005kotlin.jvm.internal.j jVar) {
            this();
        }

        private a() {
        }
    }
}
