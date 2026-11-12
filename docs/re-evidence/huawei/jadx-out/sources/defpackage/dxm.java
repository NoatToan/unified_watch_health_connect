package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.manager.DeviceCloudSharePreferencesManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.networkclient.HealthEngineRequestManager;
import com.huawei.health.healthdatamgr.api.HealthDataMgrApi;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.fitnessdatatype.HeartZoneConf;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.device.MatterDataContans;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;
import org.slf4j.Marker;

/* JADX INFO: loaded from: classes7.dex */
public class dxm {
    public static final String d = dmz.f32036a;
    public static final Map<String, Integer> h = Collections.unmodifiableMap(new HashMap<String, Integer>() { // from class: dxm.1
        {
            put("c943c933-442e-4c34-bcd0-66597f24aaed", 672);
            put("e835d102-af95-48a6-ae13-2983bc06f5c0", 140);
            put("25c6df38-ca23-11e9-a32f-2a2ae2dbcce4", 106);
            put("f005e900-7dcf-49f7-a1b0-a98e46bf62ec", Integer.valueOf(OldToNewMotionPath.SPORT_TYPE_VOLLEYBALL));
            put("8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4", 94);
            put("b29df4e3-b1f7-4e40-960d-4cfb63ccca05", 385);
            put("7a1063dd-0e0f-4a72-9939-461476ff0259", 84);
            put("33123f39-7fc1-420b-9882-a4b0d6c61100", 82);
            put("ccd1f0f8-8c57-4bd7-a884-0ef38482f15f", 84);
            put("34fa0346-d46c-439d-9cb0-2f696618846b", 82);
            put("a8ba095d-4123-43c4-a30a-0240011c58de", 84);
            put("e4b0b1d5-2003-4d88-8b5f-c4f64542040b", 82);
        }
    });
    public static final List<String> e = Collections.unmodifiableList(new ArrayList<String>() { // from class: dxm.3
        {
            add("c943c933-442e-4c34-bcd0-66597f24aaed");
            add("e835d102-af95-48a6-ae13-2983bc06f5c0");
            add("34fa0346-d46c-439d-9cb0-2f696618846b");
            add("33123f39-7fc1-420b-9882-a4b0d6c61100");
            add("8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4");
            add("b29df4e3-b1f7-4e40-960d-4cfb63ccca05");
            add("e4b0b1d5-2003-4d88-8b5f-c4f64542040b");
            add("7a1063dd-0e0f-4a72-9939-461476ff0259");
            add("25c6df38-ca23-11e9-a32f-2a2ae2dbcce4");
            add("ccd1f0f8-8c57-4bd7-a884-0ef38482f15f");
            add("a8ba095d-4123-43c4-a30a-0240011c58de");
        }
    });
    public static final Map<String, String> j = Collections.unmodifiableMap(new HashMap<String, String>() { // from class: dxm.8
        {
            put("8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4", "HAG-B19");
            put("b29df4e3-b1f7-4e40-960d-4cfb63ccca05", "Hagrid-B29");
            put("e835d102-af95-48a6-ae13-2983bc06f5c0", "HEM-B19");
            put("25c6df38-ca23-11e9-a32f-2a2ae2dbcce4", "LUP-B19");
            put("c943c933-442e-4c34-bcd0-66597f24aaed", "DOBBY-B19");
        }
    });
    public static final Map<String, String> i = Collections.unmodifiableMap(new HashMap<String, String>() { // from class: dxm.9
        {
            put("8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4", "Hagrid-B19");
            put("b29df4e3-b1f7-4e40-960d-4cfb63ccca05", "Hagrid2021-B19");
            put("e835d102-af95-48a6-ae13-2983bc06f5c0", "Herm-B19");
            put("25c6df38-ca23-11e9-a32f-2a2ae2dbcce4", "Lupin-B19HN");
            put("c943c933-442e-4c34-bcd0-66597f24aaed", "Dobby-B19");
        }
    });
    public static final Map<String, Integer> f = Collections.unmodifiableMap(new HashMap<String, Integer>() { // from class: dxm.6
        {
            put("8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4", 54);
            put("b29df4e3-b1f7-4e40-960d-4cfb63ccca05", 599);
            put("e835d102-af95-48a6-ae13-2983bc06f5c0", 70);
            put("25c6df38-ca23-11e9-a32f-2a2ae2dbcce4", 263);
            put("c943c933-442e-4c34-bcd0-66597f24aaed", 70);
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final List<String> f32486c = Collections.unmodifiableList(new ArrayList<String>() { // from class: dxm.7
        {
            add("34fa0346-d46c-439d-9cb0-2f696618846b");
            add("33123f39-7fc1-420b-9882-a4b0d6c61100");
            add("ccd1f0f8-8c57-4bd7-a884-0ef38482f15f");
            add("7a1063dd-0e0f-4a72-9939-461476ff0259");
            add("8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4");
            add("b29df4e3-b1f7-4e40-960d-4cfb63ccca05");
            add("25c6df38-ca23-11e9-a32f-2a2ae2dbcce4");
            add("e835d102-af95-48a6-ae13-2983bc06f5c0");
            add("c943c933-442e-4c34-bcd0-66597f24aaed");
        }
    });
    public static final List<Integer> o = Collections.unmodifiableList(new ArrayList<Integer>() { // from class: dxm.10
        {
            add(94);
            add(95);
            add(385);
            add(106);
            add(140);
            add(168);
            add(672);
        }
    });
    public static final List<Integer> m = Collections.unmodifiableList(new ArrayList<Integer>() { // from class: dxm.12
        {
            add(94);
            add(95);
            add(385);
            add(106);
            add(140);
            add(168);
            add(672);
            add(82);
            add(85);
            add(84);
            add(86);
            add(57);
            add(48);
        }
    });

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map<String, String> f32485b = Collections.unmodifiableMap(new HashMap<String, String>() { // from class: dxm.14
        {
            put("8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4", "007B");
            put("b29df4e3-b1f7-4e40-960d-4cfb63ccca05", "M00F");
            put("25c6df38-ca23-11e9-a32f-2a2ae2dbcce4", "N001");
            put("e835d102-af95-48a6-ae13-2983bc06f5c0", "M00D");
            put("c943c933-442e-4c34-bcd0-66597f24aaed", "M0CJ");
        }
    });
    public static final Map<String, String> g = Collections.unmodifiableMap(new HashMap<String, String>() { // from class: dxm.4
        {
            put("007B", "8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4");
            put("M00F", "b29df4e3-b1f7-4e40-960d-4cfb63ccca05");
            put("N001", "25c6df38-ca23-11e9-a32f-2a2ae2dbcce4");
            put("M00D", "e835d102-af95-48a6-ae13-2983bc06f5c0");
            put("M0CJ", "c943c933-442e-4c34-bcd0-66597f24aaed");
            put("117K", "e4b0b1d5-2003-4d88-8b5f-c4f64542040b");
            put("117V", "a8ba095d-4123-43c4-a30a-0240011c58de");
        }
    });
    private static final List<String> n = new ArrayList<String>() { // from class: dxm.2
        {
            add("007B");
            add("M00F");
            add("M00D");
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Set<String> f32484a = Collections.unmodifiableSet(new HashSet<String>() { // from class: dxm.5
        {
            add("M0CJ");
            add("M00D");
            add("0059");
            add("007B");
            add("M00F");
            add("117K");
            add("005A");
            add("N001");
            add("117V");
        }
    });

    public static boolean c(double d2) {
        return d2 > 0.0d;
    }

    private static boolean e(String str, String str2, int i2) {
        LogUtil.a("HonourDeviceConstants", "isSpecifiedDevice productId ", str, " deviceProductId ", str2, " deviceType ", Integer.valueOf(i2));
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        if (str2.equals(str)) {
            return true;
        }
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD == null) {
            LogUtil.j("HonourDeviceConstants", "isSpecifiedDevice productInfo is null");
            return false;
        }
        String strC = elhVarD.c("deviceId");
        LogUtil.a("HonourDeviceConstants", "isSpecifiedDevice deviceId ", strC);
        return String.valueOf(i2).equals(strC);
    }

    public static boolean q(String str) {
        return e(str, "c943c933-442e-4c34-bcd0-66597f24aaed", 672);
    }

    public static boolean u(String str) {
        return e(str, "e835d102-af95-48a6-ae13-2983bc06f5c0", 140);
    }

    public static boolean v(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HonourDeviceConstants", "isNewHagWeightDevice productId = null");
            return false;
        }
        if (!"b29df4e3-b1f7-4e40-960d-4cfb63ccca05".equals(str)) {
            return false;
        }
        LogUtil.a("HonourDeviceConstants", "isNewHagWeightDevice is HAG2021 device");
        return true;
    }

    public static boolean aa(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return "6d5416d9-2167-41df-ab10-c492e152b44f".equals(str);
    }

    public static boolean ad(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return e.contains(str);
    }

    public static boolean af(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return f32484a.contains(str);
    }

    public static boolean aw(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return "34fa0346-d46c-439d-9cb0-2f696618846b".equals(str) || ("33123f39-7fc1-420b-9882-a4b0d6c61100".equals(str) || "ccd1f0f8-8c57-4bd7-a884-0ef38482f15f".equals(str));
    }

    public static boolean ab(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return "34fa0346-d46c-439d-9cb0-2f696618846b".equals(str) || ag(str) || ("33123f39-7fc1-420b-9882-a4b0d6c61100".equals(str) || "ccd1f0f8-8c57-4bd7-a884-0ef38482f15f".equals(str));
    }

    public static boolean ac(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return "6d5416d9-2167-41df-ab10-c492e152b44f".equals(str) || ab(str);
    }

    public static boolean z(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return "7a1063dd-0e0f-4a72-9939-461476ff0259".equals(str);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0052  */
    public static boolean a(String str, String str2) {
        byte b2;
        LogUtil.a("HonourDeviceConstants", "isTlvScaleProduct productId=", dyg.b(str), ", uniqueId=", dyg.d(str2));
        if (!TextUtils.isEmpty(str)) {
            str.hashCode();
            int iHashCode = str.hashCode();
            if (iHashCode != 299435131) {
                if (iHashCode != 759413903) {
                    if (iHashCode == 912505950 && str.equals("b29df4e3-b1f7-4e40-960d-4cfb63ccca05")) {
                        b2 = 2;
                    } else {
                        b2 = -1;
                    }
                } else if (str.equals("c943c933-442e-4c34-bcd0-66597f24aaed")) {
                    b2 = 1;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("e835d102-af95-48a6-ae13-2983bc06f5c0")) {
                b2 = 0;
            } else {
                b2 = -1;
            }
            if (b2 == 0 || b2 == 1 || b2 == 2) {
                return true;
            }
        }
        return drk.b(str2, 19);
    }

    public static boolean ag(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HonourDeviceConstants", "isNewScaleProduct productId = null");
            return false;
        }
        if ("8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4".equals(str) || "25c6df38-ca23-11e9-a32f-2a2ae2dbcce4".equals(str)) {
            LogUtil.a("HonourDeviceConstants", "is wsp scale device (hygrid or mini or herm)");
            return true;
        }
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD == null) {
            LogUtil.j("HonourDeviceConstants", "isNewScaleProduct productInfo = null");
            return false;
        }
        String strC = elhVarD.c("is_huawei_wsp_scale");
        LogUtil.a("HonourDeviceConstants", "is wsp scale device product.xml is_huawei_wsp_scale= ", strC);
        return TextUtils.equals("true", strC);
    }

    public static boolean y(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HonourDeviceConstants", "isDualModeProduct productId = null");
            return false;
        }
        if ("8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4".equals(str)) {
            LogUtil.a("HonourDeviceConstants", "isDualModeProduct is hagrid device");
            return true;
        }
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD == null) {
            LogUtil.j("HonourDeviceConstants", "isDualModeProduct productInfo = null");
            return false;
        }
        String strC = elhVarD.c("is_dual_mode");
        LogUtil.a("HonourDeviceConstants", "isDualModeProduct product.xml is_dual_mode=", strC);
        return TextUtils.equals("true", strC);
    }

    public static boolean ai(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return "25c6df38-ca23-11e9-a32f-2a2ae2dbcce4".equals(str);
    }

    public static boolean ah(String str) {
        return "8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4".equals(str) || "b29df4e3-b1f7-4e40-960d-4cfb63ccca05".equals(str);
    }

    public static boolean ar(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HonourDeviceConstants", "isSupportSelectUserProduct productId = null");
            return false;
        }
        if ("34fa0346-d46c-439d-9cb0-2f696618846b".equals(str) || "8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4".equals(str) || "25c6df38-ca23-11e9-a32f-2a2ae2dbcce4".equals(str)) {
            LogUtil.a("HonourDeviceConstants", "isSupportSelectUserProduct is (huawei / hagird / mini)");
            return true;
        }
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD == null) {
            LogUtil.j("HonourDeviceConstants", "isSupportSelectUserProduct productInfo = null");
            return false;
        }
        String strC = elhVarD.c("is_support_multi_user");
        LogUtil.a("HonourDeviceConstants", "isSupportSelectUserProduct product.xml is_support_multi_user=", strC);
        return TextUtils.equals("true", strC);
    }

    public static String i(String str) {
        String str2 = i.get(str);
        return str2 == null ? e(str) : str2;
    }

    private static int ba(String str) {
        Integer numValueOf = f.get(str);
        if (numValueOf == null) {
            numValueOf = Integer.valueOf(c(str));
        }
        return numValueOf.intValue();
    }

    public static void c(Context context, String str, String str2) {
        String strM;
        LogUtil.a("HonourDeviceConstants", "enter sendWeightDetailSyncSuccessBroadcast");
        if (context == null) {
            return;
        }
        if (!ag(str)) {
            LogUtil.a("HonourDeviceConstants", "!sendWeightDetailSyncSuccessBroadcast isHyGrideScaleDevice");
            return;
        }
        if (ag(str)) {
            strM = m(str2);
            if (TextUtils.isEmpty(strM)) {
                strM = m(str);
            }
        } else {
            strM = null;
        }
        dxn.e("HonourDeviceConstants", strM, context, str2);
        LogUtil.a("HonourDeviceConstants", "device version = ", strM, ", productId = ", str);
        MeasurableDevice measurableDeviceB = dmp.d().b(str2, true);
        if (measurableDeviceB == null) {
            LogUtil.j("HonourDeviceConstants", "!sendWeightDetailSyncSuccessBroadcast device null");
            return;
        }
        Intent intent = new Intent("com.huawei.health.weight_detail_sync_success");
        intent.setPackage(BaseApplication.getContext().getPackageName());
        Bundle bundle = new Bundle();
        bundle.putString("deviceVersion", strM);
        bundle.putString("deviceModel", i(str));
        bundle.putString(MatterDataContans.KEY_MAC_ADDRESS, measurableDeviceB.getAddress());
        bundle.putString(HealthEngineRequestManager.PARAMS_DEVICE_SN, measurableDeviceB.getSerialNumber());
        bundle.putString("deviceUniqueId", str2);
        bundle.putInt("productType", ba(str));
        intent.putExtras(bundle);
        context.sendBroadcast(intent);
    }

    public static boolean f() {
        if (drw.e().h("6d5416d9-2167-41df-ab10-c492e152b44f")) {
            return drw.e().e("6d5416d9-2167-41df-ab10-c492e152b44f") != null;
        }
        return drw.e().b("6d5416d9-2167-41df-ab10-c492e152b44f") != null;
    }

    public static boolean x(String str) {
        if (aa(str)) {
            return f();
        }
        return false;
    }

    public static boolean ae(String str) {
        return (TextUtils.isEmpty(str) || drw.e().b(str) == null || !ab(str)) ? false : true;
    }

    public static void k() {
        elh elhVarD = ResourceManager.c().d("6d5416d9-2167-41df-ab10-c492e152b44f");
        if (elhVarD == null || !f()) {
            return;
        }
        dnf.e().b(elhVarD.q(), ResourceManager.c().a("6d5416d9-2167-41df-ab10-c492e152b44f") + File.separator + elhVarD.o());
        dnf.e().b("54C9739F-CA5C-4347-9F00-75B9DDF2C649");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0048  */
    public static Bundle a() {
        int warningLimitHR;
        Bundle bundle = new Bundle();
        bundle.putString("AM16_PACKAGE_NAME", "6d5416d9-2167-41df-ab10-c492e152b44f");
        bundle.putBoolean("EXT_IS_MUTE", false);
        bundle.putInt("AM16_MEASURE_TYPE", 1);
        bundle.putBoolean("IS_PLAY_HEART_RATE_TOO_HIGH", false);
        HealthDataMgrApi healthDataMgrApi = (HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class);
        if (healthDataMgrApi != null) {
            LogUtil.a("HonourDeviceConstants", "healthDataMgrApi is not null");
            HeartZoneConf heartZoneConf = healthDataMgrApi.getHeartZoneConf();
            if (heartZoneConf != null) {
                LogUtil.a("HonourDeviceConstants", "heartZoneConf is not null");
                warningLimitHR = heartZoneConf.getWarningLimitHR();
            } else {
                warningLimitHR = 170;
            }
        } else {
            warningLimitHR = 170;
        }
        LogUtil.a("HonourDeviceConstants", "getAm16Bundle rate warning ", Integer.valueOf(warningLimitHR));
        bundle.putInt("HEART_RATE_WARN_UPPER", warningLimitHR);
        return bundle;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0047  */
    public static Bundle h() {
        int warningLimitHR;
        Bundle bundle = new Bundle();
        bundle.putString("AM16_PACKAGE_NAME", "6d5416d9-2167-41df-ab10-c492e152b44f");
        bundle.putBoolean("EXT_IS_MUTE", false);
        boolean zIsWarningEnble = true;
        bundle.putInt("AM16_MEASURE_TYPE", 1);
        HealthDataMgrApi healthDataMgrApi = (HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class);
        if (healthDataMgrApi != null) {
            LogUtil.a("HonourDeviceConstants", "getHeartSeeBundle healthDataMgrApi is not null");
            HeartZoneConf heartZoneConf = healthDataMgrApi.getHeartZoneConf();
            if (heartZoneConf != null) {
                LogUtil.a("HonourDeviceConstants", "getHeartSeeBundle heartZoneConf is not null");
                zIsWarningEnble = heartZoneConf.isWarningEnble();
                warningLimitHR = heartZoneConf.getWarningLimitHR();
            } else {
                warningLimitHR = 170;
            }
        } else {
            warningLimitHR = 170;
        }
        LogUtil.a("HonourDeviceConstants", "getHeartSeeBundle rate warning ", Integer.valueOf(warningLimitHR));
        bundle.putBoolean("IS_PLAY_HEART_RATE_TOO_HIGH", zIsWarningEnble);
        bundle.putInt("HEART_RATE_WARN_UPPER", warningLimitHR);
        return bundle;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0043  */
    public static Bundle b() {
        int warningLimitHR;
        Bundle bundle = new Bundle();
        bundle.putString("AM16_PACKAGE_NAME", "6d5416d9-2167-41df-ab10-c492e152b44f");
        bundle.putBoolean("EXT_IS_MUTE", true);
        bundle.putInt("AM16_MEASURE_TYPE", 2);
        HealthDataMgrApi healthDataMgrApi = (HealthDataMgrApi) Services.d("HWHealthDataMgr", HealthDataMgrApi.class);
        if (healthDataMgrApi != null) {
            LogUtil.a("HonourDeviceConstants", "getAm16BundleMute healthDataMgrApi is not null");
            HeartZoneConf heartZoneConf = healthDataMgrApi.getHeartZoneConf();
            if (heartZoneConf != null) {
                LogUtil.a("HonourDeviceConstants", "getAm16BundleMute heartZoneConf is not null");
                warningLimitHR = heartZoneConf.getWarningLimitHR();
            } else {
                warningLimitHR = 170;
            }
        } else {
            warningLimitHR = 170;
        }
        LogUtil.a("HonourDeviceConstants", "getAm16BundleMute rate warning ", Integer.valueOf(warningLimitHR));
        bundle.putInt("HEART_RATE_WARN_UPPER", warningLimitHR);
        return bundle;
    }

    public static boolean i() {
        return new DeviceCloudSharePreferencesManager(dxw.d()).h("is_down_am16_source");
    }

    public static void l() {
        new DeviceCloudSharePreferencesManager(dxw.d()).e("is_down_am16_source", true);
    }

    public static boolean r(String str) {
        try {
            return !TextUtils.isEmpty(str) && aa(new JSONObject(str).optString("productId"));
        } catch (JSONException e2) {
            LogUtil.e("HonourDeviceConstants", e2.getMessage());
            return false;
        }
    }

    public static void r() {
        String str = d;
        if (new File(str).exists()) {
            LogUtil.a("HonourDeviceConstants", "HonourDeviceConstants updateResouce ");
            elx.a().c(str, null, dxc.d, null);
        }
    }

    public static boolean e() {
        return new DeviceCloudSharePreferencesManager(dxw.d()).h("is_show_permission_tip");
    }

    public static void o() {
        new DeviceCloudSharePreferencesManager(dxw.d()).e("is_show_permission_tip", true);
    }

    public static boolean ak(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!"e4b0b1d5-2003-4d88-8b5f-c4f64542040b".equals(str) && !"a8ba095d-4123-43c4-a30a-0240011c58de".equals(str)) {
            return true;
        }
        if (CompileParameterUtil.c("SUPPORT_WIFI_WEIGHT_DEVICE", false)) {
            return Utils.h();
        }
        return false;
    }

    public static String m(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return new DeviceCloudSharePreferencesManager(dxw.d()).b(str);
    }

    public static void g(String str, String str2) {
        LogUtil.a("HonourDeviceConstants", "save scale version success");
        new DeviceCloudSharePreferencesManager(dxw.d()).b(str, str2);
    }

    public static boolean at(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return "a8ba095d-4123-43c4-a30a-0240011c58de".equals(str) || "e4b0b1d5-2003-4d88-8b5f-c4f64542040b".equals(str);
    }

    public static boolean ax(String str) {
        LogUtil.a("HonourDeviceConstants", "isWiFiScale productId:", str);
        if (at(str)) {
            return true;
        }
        if (ag(str)) {
            return p(str);
        }
        LogUtil.j("HonourDeviceConstants", "isWiFiScale default ");
        return false;
    }

    public static boolean c(String str, String str2) {
        LogUtil.a("HonourDeviceConstants", "isWiFiScale productId:", str);
        if (at(str)) {
            return true;
        }
        if (ag(str) && e(str, str2)) {
            return true;
        }
        LogUtil.a("HonourDeviceConstants", "isWiFiScale is false");
        return false;
    }

    public static boolean e(String str, String str2) {
        if (!ag(str)) {
            LogUtil.j("HonourDeviceConstants", "isHaigerWiFiDevice not haiger Scale", str);
            return false;
        }
        MeasurableDevice measurableDeviceB = dmp.d().b(str2, false);
        if (measurableDeviceB != null && (measurableDeviceB instanceof eby)) {
            LogUtil.a("HonourDeviceConstants", "isHaigerWiFiDevice true");
            return true;
        }
        LogUtil.a("HonourDeviceConstants", "isHaigerWiFiDevice false");
        return false;
    }

    public static boolean p(String str) {
        if (!ag(str)) {
            LogUtil.j("HonourDeviceConstants", "isHaigerWiFiDevice not haiger Scale", str);
            return false;
        }
        if (drw.e().b(str) instanceof eby) {
            LogUtil.a("HonourDeviceConstants", "isHaigerWiFiDevice true");
            return true;
        }
        LogUtil.a("HonourDeviceConstants", "isHaigerWiFiDevice false");
        return false;
    }

    public static boolean w(String str) {
        return n.contains(str);
    }

    public static boolean g() {
        Iterator<String> it = f32486c.iterator();
        while (it.hasNext()) {
            if (drw.e().b(it.next()) != null) {
                return true;
            }
        }
        return false;
    }

    public static int j(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HonourDeviceConstants", "getDeviceIdByProductId productId = null return -1");
            return -1;
        }
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD == null) {
            LogUtil.j("HonourDeviceConstants", "getDeviceIdByProductId productInfo = null return -1");
            return -1;
        }
        String strH = elhVarD.h();
        LogUtil.a("HonourDeviceConstants", "getDeviceIdByProductId deviceId： ", dyg.d(strH));
        if (!TextUtils.isEmpty(strH)) {
            try {
                return Integer.parseInt(strH);
            } catch (NumberFormatException unused) {
                LogUtil.e("HonourDeviceConstants", "getDeviceIdByProductId exception");
            }
        }
        return -1;
    }

    public static void m() {
        LogUtil.a("HonourDeviceConstants", "save scale version success");
        new DeviceCloudSharePreferencesManager(dxw.d()).b("clear_device_user_data", "1");
    }

    public static boolean c() {
        String strB = new DeviceCloudSharePreferencesManager(dxw.d()).b("clear_device_user_data");
        LogUtil.a("HonourDeviceConstants", "getFirstCleanUserData success", strB);
        return !"1".equalsIgnoreCase(strB);
    }

    public static void n() {
        LogUtil.a("HonourDeviceConstants", "setFirstBind success");
        new DeviceCloudSharePreferencesManager(dxw.d()).b("first_bind_hour_device", "1");
    }

    public static boolean d() {
        String strB = new DeviceCloudSharePreferencesManager(dxw.d()).b("first_bind_hour_device");
        LogUtil.a("HonourDeviceConstants", "getFirstBind success", strB);
        return !"1".equalsIgnoreCase(strB);
    }

    public static String t(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HonourDeviceConstants", "getProductId prodId is null");
            return "";
        }
        if ("007B".equals(str)) {
            return "8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4";
        }
        if ("M00F".equals(str)) {
            return "b29df4e3-b1f7-4e40-960d-4cfb63ccca05";
        }
        if ("M00D".equals(str)) {
            return "e835d102-af95-48a6-ae13-2983bc06f5c0";
        }
        if ("117K".equals(str) || "1808".equals(str)) {
            return "e4b0b1d5-2003-4d88-8b5f-c4f64542040b";
        }
        if ("117V".equals(str)) {
            return "a8ba095d-4123-43c4-a30a-0240011c58de";
        }
        LogUtil.j("HonourDeviceConstants", "getProductId prodId error:", str);
        return "";
    }

    public static String n(String str) {
        String strB = new DeviceCloudSharePreferencesManager(dxw.d()).b(str + "sn");
        if (!"0".equalsIgnoreCase(strB)) {
            return strB;
        }
        HealthDevice healthDeviceB = drw.e().b(str);
        if (!(healthDeviceB instanceof eby)) {
            return "";
        }
        eby ebyVar = (eby) healthDeviceB;
        if (ebyVar.a() != null) {
            return ebyVar.a().l();
        }
        return "";
    }

    public static String l(String str) {
        String strB = new DeviceCloudSharePreferencesManager(dxw.d()).b(str + "sn");
        if ("0".equalsIgnoreCase(strB)) {
            MeasurableDevice measurableDeviceB = dmp.d().b(str, false);
            if (measurableDeviceB == null) {
                return "";
            }
            strB = measurableDeviceB.getSerialNumber();
            if (TextUtils.isEmpty(strB) && (measurableDeviceB instanceof eby)) {
                eby ebyVar = (eby) measurableDeviceB;
                if (ebyVar.a() != null) {
                    return ebyVar.a().l();
                }
            }
        }
        return strB;
    }

    public static void d(String str, String str2) {
        LogUtil.a("HonourDeviceConstants", "save device sn");
        new DeviceCloudSharePreferencesManager(dxw.d()).b(str2 + "sn", str);
    }

    public static void b(String str, String str2) {
        LogUtil.a("HonourDeviceConstants", "save device mac");
        new DeviceCloudSharePreferencesManager(dxw.d()).b(str2 + "mac", str);
    }

    public static String f(String str) {
        String strB = new DeviceCloudSharePreferencesManager(dxw.d()).b(str + "mac");
        if (!"0".equalsIgnoreCase(strB)) {
            return strB;
        }
        MeasurableDevice measurableDeviceA = dmp.d().a(str, false);
        if (measurableDeviceA == null) {
            return "";
        }
        return measurableDeviceA.getAddress();
    }

    public static void au(String str) {
        if (str == null) {
            LogUtil.j("HonourDeviceConstants", "setDevicesUseTime wifi productId is null");
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        new dsa("deviceUsedTime").b(dxw.d(), str, jCurrentTimeMillis);
        LogUtil.a("HonourDeviceConstants", "setDevicesUseTime sharedPreferences uniqueId = ", dyg.d(str), "; bandTime = ", Long.valueOf(jCurrentTimeMillis));
    }

    public static void b(String str) {
        if (str == null) {
            LogUtil.j("HonourDeviceConstants", "deleteWifiDeviceUserTime productId is null");
        } else {
            new dsa("deviceUsedTime").e(dxw.d(), str);
        }
    }

    public static String a(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HonourDeviceConstants", "encryptMac address is null");
            return "";
        }
        String strReplace = nio.e(str).replace(Marker.ANY_NON_NULL_MARKER, "A").replace("=", "A").replace("/", "A");
        return strReplace.length() >= 24 ? strReplace.substring(0, 24) : strReplace;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:52:0x00a0  */
    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        boolean zO = Utils.o();
        boolean zW = CommonUtil.w(BaseApplication.getContext());
        String strZ = CommonUtil.z();
        String str2 = zO ? "/handbook/Jumppage/EMUI8.0/C001B001/en-US/index.html?lang=%1$s&devicetype=%2$s" : "/Jumppage/EMUI8.0/C001B001/en-US/index.html?lang=%1$s&devicetype=%2$s";
        str.hashCode();
        switch (str) {
            case "25c6df38-ca23-11e9-a32f-2a2ae2dbcce4":
                return b(zO, strZ, zW);
            case "33123f39-7fc1-420b-9882-a4b0d6c61100":
                return String.format(Locale.ENGLISH, str2, strZ, "CH100");
            case "8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4":
                return d(zO, strZ, zW);
            case "6d5416d9-2167-41df-ab10-c492e152b44f":
                return zO ? "/help/AM16/app8.0/en-US/index.html" : "/help/AM16/app8.0/zh-CN/index.html";
            case "ccd1f0f8-8c57-4bd7-a884-0ef38482f15f":
                return String.format(Locale.ENGLISH, str2, strZ, "CH100S");
            case "34fa0346-d46c-439d-9cb0-2f696618846b":
                return String.format(Locale.ENGLISH, str2, strZ, "CH18");
            case "e835d102-af95-48a6-ae13-2983bc06f5c0":
                return a(zO, strZ, zW);
            case "c943c933-442e-4c34-bcd0-66597f24aaed":
                return e(zO, strZ, zW);
            case "b29df4e3-b1f7-4e40-960d-4cfb63ccca05":
                return c(zO, strZ, zW);
            case "7a1063dd-0e0f-4a72-9939-461476ff0259":
                return String.format(Locale.ENGLISH, str2, strZ, "AH100");
            default:
                return "";
        }
    }

    private static String a(boolean z, String str, boolean z2) {
        if (z) {
            return String.format(Locale.ENGLISH, "/handbook/Jumppage/EMUI8.0/C001B001/en-US/index.html?lang=%1$s&devicetype=Herm", str);
        }
        return z2 ? "/SmartWear/Herm/EMUI10.0/C001B001/zh-CN/index.html?cid=11055" : "/SmartWear/Herm/EMUI10.0/C001B001/en-US/index.html?cid=11055";
    }

    private static String e(boolean z, String str, boolean z2) {
        if (z) {
            return String.format(Locale.ENGLISH, "/handbook/Jumppage/EMUI8.0/C001B001/en-US/index.html?lang=%s&devicetype=M0CJ", str);
        }
        return z2 ? "/hwtips/scene/device/index.html?lang=zh-CN&prodId=M0CJ&cid=11055" : "/hwtips/scene/device/index.html?lang=en-US&prodId=M0CJ";
    }

    private static String b(boolean z, String str, boolean z2) {
        if (z) {
            return String.format(Locale.ENGLISH, "/handbook/Jumppage/EMUI8.0/C001B001/en-US/index.html?lang=%1$s&devicetype=Lupin", str);
        }
        return z2 ? "/SmartWear/Lupin/EMUI8.0/C001B001/zh-CN/index.html" : "/SmartWear/Lupin/EMUI8.0/C001B001/en-US/index.html";
    }

    private static String d(boolean z, String str, boolean z2) {
        if (z) {
            return String.format(Locale.ENGLISH, "/handbook/Jumppage/EMUI8.0/C001B001/en-US/index.html?lang=%1$s&devicetype=HAG-B19", str);
        }
        return z2 ? "/SmartWear/HAG-B19/EMUI8.0/C001B001/zh-CN/index.html" : "/SmartWear/HAG-B19/EMUI8.0/C001B001/en-US/index.html";
    }

    private static String c(boolean z, String str, boolean z2) {
        if (z) {
            return String.format(Locale.ENGLISH, "/handbook/Jumppage/EMUI8.0/C001B001/en-US/index.html?lang=%1$s&devicetype=HAG-B29", str);
        }
        return z2 ? "/SmartWear/HAG-B29/EMUI8.0/C001B001/zh-CN/index.html?cid=11055" : "/SmartWear/HAG-B29/EMUI8.0/C001B001/en-US/index.html?cid=11055";
    }

    public static String k(String str) {
        boolean zO = Utils.o();
        boolean zW = CommonUtil.w(BaseApplication.getContext());
        if (!zO) {
            return zW ? "/SmartWear/Lupin/MagicUI4.0/C001B001/zh-CN/index.html" : "/SmartWear/Lupin/MagicUI4.0/C001B001/en-US/index.html";
        }
        if (TextUtils.isEmpty(str)) {
            return String.format(Locale.ENGLISH, "/handbook/Jumppage/EMUI8.0/C001B001/en-US/index.html?lang=%1$s&devicetype=Lupin", CommonUtil.z());
        }
        if (zW) {
            return "/honor_SmartWear/Jumppage/MagicUI4.0/C001B001/en-US/index.html?lang=zh-CN&devicetype=Lupin&MagicUI=MagicUI4.0";
        }
        return String.format(Locale.ENGLISH, "/honor_SmartWear/Jumppage/MagicUI4.0/C001B001/en-US/index.html?lang=%s&devicetype=Lupin&MagicUI=MagicUI4.0", CommonUtil.z());
    }

    public static boolean j() {
        return Utils.h();
    }

    public static boolean s(String str) {
        boolean zO = Utils.o();
        if (!az(str) || zO) {
            return (ay(str) && zO) ? false : true;
        }
        return false;
    }

    private static boolean az(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return "33123f39-7fc1-420b-9882-a4b0d6c61100".equals(str) || "ccd1f0f8-8c57-4bd7-a884-0ef38482f15f".equals(str);
    }

    public static String o(String str) {
        elh elhVarD;
        LogUtil.a("HonourDeviceConstants", "getDeviceNameByProductId productId ", str);
        if (TextUtils.isEmpty(str) || (elhVarD = ResourceManager.c().d(str)) == null || elhVarD.l() == null) {
            return "";
        }
        String strA = elo.a(str, elhVarD.l().d());
        LogUtil.d("HonourDeviceConstants", "getDeviceNameByProductId deviceName = ", strA);
        return strA;
    }

    public static boolean e(int i2) {
        return o.contains(Integer.valueOf(i2));
    }

    public static boolean a(int i2) {
        return m.contains(Integer.valueOf(i2));
    }

    public static String h(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("HonourDeviceConstants", "getDeviceIdentify uniqueId is null");
            return "";
        }
        MeasurableDevice measurableDeviceB = dmp.d().b(str, false);
        if (measurableDeviceB == null) {
            LogUtil.a("HonourDeviceConstants", "getDeviceIdentify device is null");
            return "";
        }
        String serialNumber = measurableDeviceB.getSerialNumber();
        if (TextUtils.isEmpty(serialNumber)) {
            serialNumber = l(measurableDeviceB.getUniqueId());
        }
        if (TextUtils.isEmpty(serialNumber)) {
            serialNumber = measurableDeviceB.getUniqueId();
        }
        if (TextUtils.isEmpty(serialNumber)) {
            return "";
        }
        String strReplaceAll = serialNumber.replaceAll(":", "");
        return strReplaceAll.length() < 3 ? strReplaceAll : strReplaceAll.substring(strReplaceAll.length() - 3);
    }

    private static boolean ay(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return "34fa0346-d46c-439d-9cb0-2f696618846b".equals(str) || "7a1063dd-0e0f-4a72-9939-461476ff0259".equals(str);
    }

    public static boolean aq(String str) {
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD != null && !TextUtils.isEmpty(elhVarD.c("is_support_uds"))) {
            return TextUtils.equals("true", elhVarD.c("is_support_uds"));
        }
        if (!"b29df4e3-b1f7-4e40-960d-4cfb63ccca05".equals(str)) {
            return false;
        }
        LogUtil.a("HonourDeviceConstants", "is Hagrid2021 support uds.");
        return true;
    }

    public static boolean am(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HonourDeviceConstants", "isSupportNps productId = null");
            return false;
        }
        if (u(str)) {
            return true;
        }
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD == null) {
            LogUtil.j("HonourDeviceConstants", "isSupportNps productInfo = null");
            return false;
        }
        String strC = elhVarD.c("is_support_nps");
        LogUtil.a("HonourDeviceConstants", "isSupportNps product.xml is_support_Nps=", strC);
        return TextUtils.equals("true", strC);
    }

    public static boolean an(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("HonourDeviceConstants", "isShowGuestMeasure productId = null");
            return false;
        }
        if (u(str) || q(str)) {
            return true;
        }
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD == null) {
            LogUtil.j("HonourDeviceConstants", "isShowGuestMeasure productInfo = null");
            return false;
        }
        String strC = elhVarD.c("manger_support_info_invisible");
        LogUtil.a("HonourDeviceConstants", "isShowGuestMeasure product.xml is ", strC);
        return TextUtils.equals("true", strC);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0037  */
    public static String g(String str) {
        byte b2;
        str.hashCode();
        int iHashCode = str.hashCode();
        if (iHashCode != 299435131) {
            if (iHashCode != 759413903) {
                if (iHashCode == 912505950 && str.equals("b29df4e3-b1f7-4e40-960d-4cfb63ccca05")) {
                    b2 = 2;
                } else {
                    b2 = -1;
                }
            } else if (str.equals("c943c933-442e-4c34-bcd0-66597f24aaed")) {
                b2 = 1;
            } else {
                b2 = -1;
            }
        } else if (str.equals("e835d102-af95-48a6-ae13-2983bc06f5c0")) {
            b2 = 0;
        } else {
            b2 = -1;
        }
        if (b2 == 0) {
            return "Herm-B19";
        }
        if (b2 == 1) {
            return "Dobby-B19";
        }
        if (b2 == 2) {
            return "Hagrid-B29";
        }
        LogUtil.j("HonourDeviceConstants", "productId is unknow, productId = ", str);
        return "UNKNOW_DEVICE";
    }

    public static boolean b(HiHealthData hiHealthData) {
        if (hiHealthData == null) {
            return false;
        }
        return c(hiHealthData.getDouble("lfrfHfImpedance"));
    }

    public static boolean c(dnb dnbVar) {
        return dnbVar != null && dnbVar.t() != null && dnbVar.t().length > 0 && c(dnbVar.t()[0]);
    }

    public static boolean e(dso dsoVar) {
        return dsoVar != null && dsoVar.f() != null && dsoVar.f().length > 0 && c(dsoVar.f()[0]);
    }

    public static boolean al(String str) {
        return f(str, "is_support_other_activity_connect");
    }

    public static boolean aj(String str) {
        return f(str, "is_support_keep_connected_when_back");
    }

    public static boolean ao(String str) {
        return f(str, "is_support_sync_while_connected");
    }

    public static boolean av(String str) {
        return f(str, "is_support_weight_data_claiming");
    }

    public static boolean as(String str) {
        return f(str, "is_support_question_and_suggestion");
    }

    public static boolean ap(String str) {
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD == null) {
            LogUtil.j("HonourDeviceConstants", "ProductInfo is null");
            return false;
        }
        if (!njy.e(elhVarD.ad())) {
            return true;
        }
        LogUtil.j("HonourDeviceConstants", "useGuides is null");
        return false;
    }

    private static boolean f(String str, String str2) {
        LogUtil.a("HonourDeviceConstants", str2, ", productId = ", str);
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD == null) {
            LogUtil.j("HonourDeviceConstants", "productInfo = null");
            return false;
        }
        String strC = elhVarD.c(str2);
        LogUtil.a("HonourDeviceConstants", "isSupport = ", strC);
        return TextUtils.equals("true", strC);
    }

    public static int c(String str) {
        if (!TextUtils.isEmpty(str)) {
            elh elhVarD = ResourceManager.c().d(str);
            if (elhVarD == null) {
                LogUtil.j("HonourDeviceConstants", "getCloudDeviceId productInfo is null");
                return -1;
            }
            String strH = elhVarD.h();
            if (strH == null) {
                LogUtil.j("HonourDeviceConstants", "getCloudDeviceId deviceIdStr is null");
                return -1;
            }
            try {
                return Integer.parseInt(strH);
            } catch (NumberFormatException unused) {
                LogUtil.e("HonourDeviceConstants", "parseInt exception, input is ", strH);
            }
        }
        return -1;
    }

    public static String e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return j(str, "device_name");
    }

    private static String j(String str, String str2) {
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD == null) {
            LogUtil.j("HonourDeviceConstants", "getCloudValueByKey productInfo is null");
            return null;
        }
        String strC = elhVarD.c(str2);
        LogUtil.a("HonourDeviceConstants", "cloud key is ", str2, ", value is ", strC);
        return strC;
    }
}
