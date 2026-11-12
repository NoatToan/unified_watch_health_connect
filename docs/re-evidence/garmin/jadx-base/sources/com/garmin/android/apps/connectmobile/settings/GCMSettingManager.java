package com.garmin.android.apps.connectmobile.settings;

import am.x0;
import am.z0;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.SharedPreferences;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.text.TextUtils;
import bs2.nv;
import c22.t1;
import com.garmin.android.apps.connectmobile.GarminConnectMobileApp;
import com.garmin.android.apps.connectmobile.R;
import com.garmin.android.apps.connectmobile.devices.model.DeviceSettingsDTO;
import com.garmin.android.apps.connectmobile.forceupdate.MinVersionSupportService;
import com.garmin.android.apps.connectmobile.i2;
import com.garmin.android.apps.connectmobile.k1;
import com.garmin.android.apps.connectmobile.settings.model.UserSettingsDTO;
import com.garmin.android.apps.connectmobile.startup.init.BaseModuleDelegateInitializer;
import com.garmin.android.apps.connectmobile.util.GsonUtil;
import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.google.maps.android.BuildConfig;
import f12.l;
import gg1.m;
import gg1.n;
import gg1.o0;
import iu0.g;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.joda.time.DateTime;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.java.KoinJavaComponent;
import p92.o;
import wi1.j;
import ww0.u;
import z10.v0;

/* JADX INFO: loaded from: classes10.dex */
public class GCMSettingManager implements zd.b<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static Context f41535a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static SharedPreferences f41536b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static SharedPreferences f41537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static SharedPreferences f41538d;

    public static void A(String str) {
        if (str == null) {
            return;
        }
        HashMap mapG = g();
        for (Map.Entry entry : mapG.entrySet()) {
            if (((String) entry.getKey()).equals(str)) {
                mapG.remove(entry.getKey());
                break;
            }
        }
        StringBuilder sb3 = new StringBuilder();
        for (Map.Entry entry2 : mapG.entrySet()) {
            sb3.append((String) entry2.getKey());
            sb3.append(",");
            sb3.append((String) entry2.getValue());
        }
        f41536b.edit().putString(f41535a.getString(R.string.key_swing_session_note), sb3.toString()).apply();
    }

    @SuppressLint({"ApplySharedPref"})
    public static void B() {
        l.f68084a.getClass();
        l.a.a().O1();
        f41538d.edit().clear().apply();
        o.f136619a.getClass();
        o.m().clear();
        v0.f201271b.getClass();
        SharedPreferences.Editor editorEdit = v0.a.a().f201273a.edit();
        editorEdit.clear();
        editorEdit.apply();
        Context context = f41535a;
        context.getClass();
        context.getSharedPreferences("tooltips_showed", 0).edit().clear().apply();
    }

    public static void C(long j8, String str, String str2) {
        HashSet hashSet = new HashSet();
        Set<String> stringSet = f41536b.getStringSet(str, null);
        boolean z14 = false;
        if (stringSet != null && stringSet.size() > 0) {
            for (String str3 : stringSet) {
                if (str3.startsWith(Long.toString(j8))) {
                    if (!TextUtils.isEmpty(str2)) {
                        hashSet.add(j8 + "," + str2);
                    }
                    z14 = true;
                } else {
                    hashSet.add(str3.trim());
                }
            }
        }
        if (!z14) {
            hashSet.add(j8 + "," + str2);
        }
        f41536b.edit().putStringSet(str, hashSet).apply();
    }

    @Deprecated
    public static void D() {
        String string;
        nb2.a[] aVarArr = nb2.a.f125254d;
        if (aVarArr == null || aVarArr.length == 0) {
            string = null;
        } else {
            if (aVarArr.length == 1) {
                string = aVarArr[0].toString();
            } else {
                StringBuilder sb3 = new StringBuilder(aVarArr[0].toString());
                for (int i14 = 1; i14 < aVarArr.length; i14++) {
                    sb3.append(",");
                    sb3.append(aVarArr[i14].toString().trim());
                }
                string = sb3.toString();
            }
        }
        f41536b.edit().putString(f41535a.getString(R.string.key_live_tracking_invites), string).apply();
    }

    public static void E(float f14) {
        f41536b.edit().putFloat(f41535a.getString(R.string.key_running_stride_length), f14).apply();
    }

    public static void F(double d14) {
        f41536b.edit().putLong(f41535a.getString(R.string.key_running_measured_distance), Double.doubleToLongBits(d14)).apply();
    }

    public static void G(int i14) {
        com.airbnb.lottie.animation.keyframe.a.p(f41535a, R.string.key_running_measured_distance_unit, f41536b.edit(), i14);
    }

    public static void H(int i14) {
        com.airbnb.lottie.animation.keyframe.a.p(f41535a, R.string.key_running_total_steps, f41536b.edit(), i14);
    }

    public static void I(long j8, boolean z14) {
        SharedPreferences.Editor editorEdit = f41536b.edit();
        editorEdit.putBoolean(f41535a.getString(R.string.key_sync_on_connect) + j8, z14);
        editorEdit.apply();
    }

    public static void J(fd0.d dVar, nv nvVar, long j8) {
        f41536b.edit().putLong(d(dVar, nvVar), j8).apply();
    }

    public static void K(long j8) {
        f41537c.edit().putLong("VECTOR_FIRMWARE_DOWNLOAD_ID", j8).apply();
    }

    public static void L(float f14) {
        f41536b.edit().putFloat(f41535a.getString(R.string.key_walking_stride_length), f14).apply();
    }

    public static void M(double d14) {
        f41536b.edit().putLong(f41535a.getString(R.string.key_walking_measured_distance), Double.doubleToLongBits(d14)).apply();
    }

    public static void N(int i14) {
        com.airbnb.lottie.animation.keyframe.a.p(f41535a, R.string.key_walking_measured_distance_unit, f41536b.edit(), i14);
    }

    public static void O(int i14) {
        com.airbnb.lottie.animation.keyframe.a.p(f41535a, R.string.key_walking_total_steps, f41536b.edit(), i14);
    }

    public static void P(float f14) {
        f41536b.edit().putFloat(f41535a.getString(R.string.key_wheelchair_stroke_length), f14).apply();
    }

    public static void Q(double d14) {
        f41536b.edit().putLong(f41535a.getString(R.string.key_wheelchair_measured_distance), Double.doubleToLongBits(d14)).apply();
    }

    public static void R(int i14) {
        com.airbnb.lottie.animation.keyframe.a.p(f41535a, R.string.key_wheelchair_measured_distance_unit, f41536b.edit(), i14);
    }

    public static void S(int i14) {
        com.airbnb.lottie.animation.keyframe.a.p(f41535a, R.string.key_wheelchair_total_pushes, f41536b.edit(), i14);
    }

    public static void T(long j8, boolean z14) {
        C(j8, f41535a.getString(R.string.key_wifi_setup_status), Boolean.toString(z14));
    }

    public static void U(long j8, i22.d dVar) {
        C(j8, f41535a.getString(R.string.key_device_significant_location_update), dVar == null ? "-" : new Gson().toJson(dVar));
    }

    public static void V(long j8, DeviceSettingsDTO deviceSettingsDTO) {
        if (deviceSettingsDTO == null) {
            return;
        }
        if (deviceSettingsDTO.f33886m1 != null) {
            String string = f41535a.getString(R.string.key_audio_prompt_lap_alert_on_off);
            Boolean bool = deviceSettingsDTO.f33886m1;
            C(j8, string, String.valueOf(bool != null ? bool.booleanValue() : false));
        }
        if (deviceSettingsDTO.V0()) {
            C(j8, f41535a.getString(R.string.key_audio_prompt_power_alert_on_off), String.valueOf(deviceSettingsDTO.o0()));
        }
        if (deviceSettingsDTO.f33908y1 != null || deviceSettingsDTO.f33906x1 != null) {
            if (deviceSettingsDTO.f33906x1 == null) {
                deviceSettingsDTO.f33906x1 = "TIME";
            }
            C(j8, f41535a.getString(R.string.key_audio_prompt_power_frequency), deviceSettingsDTO.p0().name());
        }
        if (deviceSettingsDTO.f33904w1 != null) {
            String string2 = f41535a.getString(R.string.key_audio_prompt_power_alert_type);
            String str = deviceSettingsDTO.f33904w1;
            lu.e.f114944d.getClass();
            C(j8, string2, lu.e.a.a(str).name());
        }
        if (deviceSettingsDTO.Z0()) {
            C(j8, f41535a.getString(R.string.key_audio_prompt_pace_speed_alert_on_off), String.valueOf(deviceSettingsDTO.x0()));
        }
        if (deviceSettingsDTO.f33894q1 != null || !TextUtils.isEmpty(deviceSettingsDTO.f33892p1)) {
            if (TextUtils.isEmpty(deviceSettingsDTO.f33892p1)) {
                deviceSettingsDTO.f33892p1 = "TIME";
            }
            C(j8, f41535a.getString(R.string.key_audio_prompt_pace_speed_frequency), deviceSettingsDTO.z0().name());
        }
        if (!TextUtils.isEmpty(deviceSettingsDTO.f33890o1)) {
            String string3 = f41535a.getString(R.string.key_audio_prompt_pace_speed_alert_type);
            String str2 = deviceSettingsDTO.f33890o1;
            lu.d.f114935d.getClass();
            C(j8, string3, lu.d.a.a(str2).name());
        }
        if (deviceSettingsDTO.R0()) {
            C(j8, f41535a.getString(R.string.key_audio_prompt_heart_rate_alert_on_off), String.valueOf(deviceSettingsDTO.k0()));
        }
        if (deviceSettingsDTO.f33900u1 != null || !TextUtils.isEmpty(deviceSettingsDTO.f33899t1)) {
            if (TextUtils.isEmpty(deviceSettingsDTO.f33899t1)) {
                deviceSettingsDTO.f33899t1 = "TIME";
            }
            C(j8, f41535a.getString(R.string.key_audio_prompt_heart_rate_frequency), deviceSettingsDTO.n0().name());
        }
        if (TextUtils.isEmpty(deviceSettingsDTO.f33897s1)) {
            return;
        }
        String string4 = f41535a.getString(R.string.key_audio_prompt_heart_rate_alert_type);
        String str3 = deviceSettingsDTO.f33897s1;
        lu.c.f114926c.getClass();
        C(j8, string4, lu.c.a.a(str3).name());
    }

    public static boolean a(int i14, long j8) {
        StringBuilder sb3;
        String strU = u(i14);
        if (TextUtils.isEmpty(strU)) {
            sb3 = new StringBuilder(Long.toString(j8));
        } else {
            StringBuilder sb4 = new StringBuilder(strU);
            sb4.append(",");
            sb4.append(Long.toString(j8));
            sb3 = sb4;
        }
        return f41536b.edit().putString(f41535a.getString(i14), sb3.toString()).commit();
    }

    public static synchronized void b(String str) {
        l.f68084a.getClass();
        l.a.a().f3(str);
    }

    public static void c(long j8) {
        f41536b.edit().remove(f41535a.getString(R.string.key_live_event_sharing_alerts) + "_" + j8).commit();
    }

    public static String d(fd0.d dVar, nv nvVar) {
        StringBuilder sb3 = new StringBuilder("key_tds_device_unit_id_");
        sb3.append(dVar.name());
        if (nvVar != null) {
            sb3.append("_");
            sb3.append(nvVar.name());
        }
        return sb3.toString();
    }

    public static ArrayList e(int i14) {
        String strU = u(i14);
        if (TextUtils.isEmpty(strU)) {
            return null;
        }
        List listAsList = Arrays.asList(TextUtils.split(strU, "\\s*,\\s*"));
        if (listAsList.isEmpty()) {
            return null;
        }
        ArrayList arrayList = new ArrayList(listAsList.size());
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            arrayList.add(Long.valueOf((String) it.next()));
        }
        return arrayList;
    }

    public static int f() {
        return f41536b.getInt(lg1.d.AUTO_SYNC_INTERVAL.f112244a, 600000);
    }

    public static HashMap g() {
        HashMap map = new HashMap();
        String string = f41536b.getString(f41535a.getString(R.string.key_swing_session_note), null);
        if (string != null) {
            String[] strArrSplit = string.split(",");
            for (int i14 = 0; i14 < strArrSplit.length - 1; i14 += 2) {
                map.put(strArrSplit[i14], strArrSplit[i14 + 1]);
            }
        }
        return map;
    }

    public static String h(long j8, String str) {
        Set<String> stringSet = f41536b.getStringSet(str, null);
        if (stringSet != null && stringSet.size() > 0) {
            for (String str2 : stringSet) {
                if (str2.trim().startsWith(Long.toString(j8))) {
                    return str2.substring(str2.indexOf(",") + 1);
                }
            }
        }
        return null;
    }

    public static x0 i() {
        bv.b.f21240b.getClass();
        x0 x0Var = k1.f37122a.l0() ? x0.f4271b3 : x0.f4308n;
        x0 x0VarM = z0.m(f41536b.getString(f41535a.getString(R.string.key_last_manual_activity_type), x0Var.f4358a));
        return x0VarM == null ? x0Var : x0VarM;
    }

    public static MinVersionSupportService.a j() {
        kg1.a.f104701a.getClass();
        if (kg1.a.C2003a.a().Q() != null) {
            return MinVersionSupportService.a.values()[kg1.a.C2003a.a().Q().intValue()];
        }
        return ((f12.b) KoinJavaComponent.get(f12.b.class)).f() ? MinVersionSupportService.a.values()[MinVersionSupportService.a.CHINA.ordinal()] : MinVersionSupportService.a.values()[MinVersionSupportService.a.PROD.ordinal()];
    }

    public static gg1.v0 k() {
        String strName = ((f12.b) KoinJavaComponent.get(f12.b.class)).h().name();
        gg1.v0.T.getClass();
        return gg1.v0.a.a(strName);
    }

    public static cl0.d l() {
        String string = f41536b.getString(f41535a.getString(R.string.key_user_golf_swing_speed_unit), "");
        if (!string.isEmpty()) {
            return cl0.d.valueOf(string);
        }
        o0 o0VarG = ((l) KoinJavaComponent.get(l.class)).g();
        cl0.d.f27928c.getClass();
        int i14 = o0VarG == null ? -1 : cl0.d.a.C0426a.f27936a[o0VarG.ordinal()];
        if (i14 == 1 || i14 == 2) {
            return cl0.d.MILE_PER_HOUR;
        }
        return i14 != 3 ? cl0.d.METER_PER_SEC : cl0.d.KILOMETER_PER_HOUR;
    }

    public static gg1.x0 m() {
        String string = f41536b.getString(f41535a.getString(R.string.key_user_time_format), "");
        return !string.isEmpty() ? gg1.x0.valueOf(string) : gg1.x0.TWELVE_HOUR;
    }

    public static com.garmin.android.apps.connectmobile.repcounting.model.c n() {
        String string = f41536b.getString("STRENGTH_TRAINING_RECENT_EXERCISES", "");
        com.garmin.android.apps.connectmobile.repcounting.model.c cVar = new com.garmin.android.apps.connectmobile.repcounting.model.c();
        ArrayList arrayList = cVar.f41097a;
        arrayList.clear();
        try {
            JSONArray jSONArray = new JSONArray(string);
            int length = jSONArray.length();
            for (int i14 = 0; i14 < length; i14++) {
                com.garmin.android.apps.connectmobile.repcounting.model.d dVar = new com.garmin.android.apps.connectmobile.repcounting.model.d();
                dVar.C(new JSONObject(jSONArray.getString(i14)));
                String str = dVar.f41102a;
                String str2 = dVar.f41106e;
                if (str2 == null) {
                    str2 = str == null ? "" : str;
                }
                arrayList.add(new com.garmin.android.apps.connectmobile.repcounting.model.c.C0779c(str, str2, dVar));
            }
            return cVar;
        } catch (JSONException e4) {
            i2.a.j(i2.f36769a, "ExerciseListDTO", "fromJson: " + e4.getMessage());
            return cVar;
        }
    }

    public static double o() {
        return Double.longBitsToDouble(f41536b.getLong(f41535a.getString(R.string.key_running_measured_distance), 0L));
    }

    public static HashMap p() {
        i22.d dVar;
        HashMap map = new HashMap();
        Set<String> stringSet = f41536b.getStringSet(f41535a.getString(R.string.key_device_significant_location_update), null);
        if (stringSet != null && stringSet.size() > 0) {
            for (String str : stringSet) {
                int iIndexOf = str.indexOf(",");
                Long lValueOf = Long.valueOf(str.substring(0, iIndexOf));
                lValueOf.getClass();
                int i14 = iIndexOf + 1;
                if ("-".equalsIgnoreCase(str.substring(i14))) {
                    dVar = null;
                } else {
                    try {
                        dVar = (i22.d) new Gson().fromJson(str.substring(i14), i22.d.class);
                    } catch (Exception unused) {
                        dVar = null;
                    }
                }
                map.put(lValueOf, dVar);
            }
        }
        return map;
    }

    public static g q(long j8) {
        String string = f41536b.getString(f41535a.getString(R.string.key_live_event_sharing_alerts) + "_" + j8, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        try {
            return (g) GsonUtil.f47253b.fromJson(string, g.class);
        } catch (JsonSyntaxException unused) {
            return null;
        }
    }

    public static long r(fd0.d dVar, nv nvVar) {
        return f41536b.getLong(d(dVar, nvVar), -1L);
    }

    public static UserSettingsDTO s() {
        Address address;
        UserSettingsDTO userSettingsDTO = new UserSettingsDTO();
        l.f68084a.getClass();
        l lVarA = l.a.a();
        userSettingsDTO.f43523a = lVarA.U1();
        String strW = lVarA.w();
        UserSettingsDTO.c.f43531c.getClass();
        userSettingsDTO.P0(UserSettingsDTO.c.a.a(strW));
        String strK = lVarA.K();
        if (!TextUtils.isEmpty(strK)) {
            UserSettingsDTO.d.f43539c.getClass();
            userSettingsDTO.R0(UserSettingsDTO.d.a.a(strK));
        }
        userSettingsDTO.s1(lVarA.v3() * 1000.0d);
        userSettingsDTO.S0(lVarA.t());
        String str = m().f77367a;
        UserSettingsDTO.e.f43546b.getClass();
        userSettingsDTO.c1(UserSettingsDTO.e.a.a(str));
        userSettingsDTO.L0(lVarA.l1());
        String str2 = lVarA.g().f77291a;
        o0.f77285d.getClass();
        userSettingsDTO.V0(o0.a.b(str2));
        userSettingsDTO.J0(lVarA.e2());
        userSettingsDTO.h1(lVarA.E3());
        userSettingsDTO.e1(lVarA.y2());
        if (lVarA.K3() != -1) {
            userSettingsDTO.M0(lVarA.K3());
        }
        j jVar = userSettingsDTO.f43524b;
        if (jVar != null) {
            wi1.d dVar = new wi1.d();
            m mVarE1 = lVarA.e1();
            dVar.f185493a = mVarE1.f77270b;
            dVar.f185494b = mVarE1.f77269a;
            dVar.f185495c = mVarE1.f77271c;
            jVar.f185548k = dVar;
            jVar.f185557v = l.a.a().V0();
            g42.d dVar2 = new g42.d();
            Context context = GarminConnectMobileApp.f28688j;
            du2.g.f61293g.getClass();
            dVar2.f75784a = du2.g.a.d(context) == du2.g.d.STATIC;
            Location locationC = du2.g.a.c(f41535a);
            if (locationC != null) {
                dVar2.f75785b = Double.valueOf(locationC.getLatitude());
                dVar2.f75786c = Double.valueOf(locationC.getLongitude());
                try {
                    List<Address> fromLocation = new Geocoder(f41535a).getFromLocation(locationC.getLatitude(), locationC.getLongitude(), 1);
                    if (!fromLocation.isEmpty() && (address = fromLocation.get(0)) != null) {
                        dVar2.f75785b = Double.valueOf(address.getLatitude());
                        dVar2.f75786c = Double.valueOf(address.getLongitude());
                        dVar2.f75789f = address.getPostalCode();
                        dVar2.f75788e = address.getCountryCode();
                        dVar2.f75787d = t1.b(address);
                    }
                } catch (IOException e4) {
                    e4.printStackTrace();
                }
            }
            jVar.f185558w = dVar2;
            l.f68084a.getClass();
            jVar.f185559x = l.a.a().B3();
        }
        if (lVarA.h() != -1) {
            userSettingsDTO.Z0(lVarA.h());
        }
        if (lVarA.d() != -1) {
            userSettingsDTO.j1(lVarA.d());
        }
        n nVarD0 = lVarA.d0();
        if (userSettingsDTO.f43524b == null) {
            userSettingsDTO.f43524b = new j();
        }
        j jVar2 = userSettingsDTO.f43524b;
        jVar2.getClass();
        jVar2.f185556t = nVarD0.f77282a;
        userSettingsDTO.Q0(i52.a.i());
        k1 k1Var = k1.f37122a;
        if (k1Var.k() || k1Var.c()) {
            userSettingsDTO.a0(lVarA.f2());
            userSettingsDTO.c0(lVarA.r2());
            userSettingsDTO.g0(lVarA.y1());
            userSettingsDTO.f0(lVarA.j1());
            userSettingsDTO.w0(lVarA.P3());
            userSettingsDTO.E0(lVarA.B4());
            userSettingsDTO.i0(lVarA.z0());
            userSettingsDTO.j0(lVarA.s3());
            userSettingsDTO.x0(lVarA.a4());
            userSettingsDTO.n0(lVarA.G4());
            userSettingsDTO.o0(lVarA.Q());
            userSettingsDTO.h0(lVarA.x3());
            userSettingsDTO.p0(lVarA.E1());
            userSettingsDTO.C0(lVarA.I4());
            userSettingsDTO.A0(lVarA.x0());
            userSettingsDTO.z0(lVarA.q0());
            userSettingsDTO.k0(lVarA.C0());
            userSettingsDTO.e0(lVarA.O3());
            SharedPreferences sharedPreferences = i52.a.f91797b;
            i52.a.f91796a.getClass();
            DateTime dateTime = new DateTime(sharedPreferences.getLong(i52.a.c(R.string.key_inactive_report_timestamp), -1L));
            if (userSettingsDTO.f43527e == null) {
                userSettingsDTO.f43527e = new u(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
            }
            u uVar = userSettingsDTO.f43527e;
            uVar.getClass();
            uVar.y(dateTime);
        }
        return userSettingsDTO;
    }

    public static String t(long j8) {
        String strH = h(j8, f41535a.getString(R.string.key_user_short_names));
        if (strH == null || !BuildConfig.TRAVIS.equalsIgnoreCase(strH.trim())) {
            return strH;
        }
        return null;
    }

    public static String u(int i14) {
        String string = f41535a.getString(i14);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return f41536b.getString(string, null);
    }

    public static double v() {
        return Double.longBitsToDouble(f41536b.getLong(f41535a.getString(R.string.key_walking_measured_distance), 0L));
    }

    public static double w() {
        return Double.longBitsToDouble(f41536b.getLong(f41535a.getString(R.string.key_wheelchair_measured_distance), 0L));
    }

    public static boolean x() {
        return f41536b.getBoolean(lg1.d.ENABLE_AUTO_SYNC.f112244a, false);
    }

    public static boolean y(int i14) {
        Set<String> stringSet = f41536b.getStringSet(f41535a.getString(R.string.key_calendar_filter), xx.c.a(GarminConnectMobileApp.f28688j));
        if (stringSet.size() == 0 || i14 == -1) {
            return false;
        }
        String string = f41535a.getString(i14);
        Iterator<String> it = stringSet.iterator();
        while (it.hasNext()) {
            if (it.next().equals(string)) {
                return true;
            }
        }
        return false;
    }

    public static boolean z(long j8) {
        String strH = h(j8, f41535a.getString(R.string.key_wifi_setup_status));
        return !TextUtils.isEmpty(strH) && Boolean.parseBoolean(strH);
    }

    @Override // zd.b
    public final Object create(Context context) {
        f41535a = context;
        f41536b = context.getSharedPreferences(context.getString(R.string.key_shared_preferences_name), 0);
        f41537c = context.getSharedPreferences(f41535a.getString(R.string.key_vector_shared_preferences_name), 0);
        f41538d = context.getSharedPreferences(f41535a.getString(R.string.key_sync_shared_preferences_name), 0);
        return new Object();
    }

    @Override // zd.b
    public final List<Class<? extends zd.b<?>>> dependencies() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(BaseModuleDelegateInitializer.class);
        return arrayList;
    }
}
