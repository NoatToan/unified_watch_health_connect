package defpackage;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import com.huawei.featureuserprofile.route.hwgpxmodel.Wpt;
import com.huawei.health.device.api.EcologyDeviceApi;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.model.RecordAction;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hms.hihealth.data.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.indoorequip.R;
import com.huawei.indoorequip.datastruct.MachineControlPointResponse;
import com.huawei.indoorequip.datastruct.QrCodeOrNfcInfo;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.nfc.PluginPayAdapter;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.ble.BleConstants;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.io.File;
import java.text.NumberFormat;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes12.dex */
public class nzc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f43992b = phs.d;
    private static final String d;
    private static final String e;

    private static int a(int i, float f) {
        if (f < 8.0f || i <= 0) {
            return -1;
        }
        if (i >= 70 || f <= 10.0f) {
            return (i <= 140 || f >= 14.0f) ? 0 : 2;
        }
        return 1;
    }

    private static int b(int i, float f) {
        if (f < 8.0f || i <= 0) {
            return -1;
        }
        return i > 3 ? 2 : 0;
    }

    private static float c(float f) {
        if (f < 3.0f) {
            return 3.0f;
        }
        if (f > 13.0f) {
            return 13.0f;
        }
        return f;
    }

    private static int c(int i, float f) {
        if (f < 8.0f || i <= 0) {
            return -1;
        }
        if (i < 5) {
            return 1;
        }
        return i > 20 ? 2 : 0;
    }

    private static int d(int i, float f) {
        if (f < 8.0f || i <= 0) {
            return -1;
        }
        return i > 20 ? 2 : 0;
    }

    public static boolean d(int i) {
        return i == 264 || i == 283;
    }

    public static int e(int i) {
        if (i == 0) {
            return 13;
        }
        if (i == 1) {
            return 12;
        }
        if (i != 2) {
            return -1;
        }
        return MachineControlPointResponse.OP_CODE_EXTENSION_SET_TARGETED_EXPENDED_ENERGY;
    }

    private static int e(int i, float f) {
        return -1;
    }

    private static int f(int i, float f) {
        if (f < 8.0f || i <= 0) {
            return -1;
        }
        return i > 300 ? 2 : 0;
    }

    public static boolean i(int i) {
        return i == 264 || i == 265;
    }

    static {
        String strD = fdy.d("com.huawei.health_ecologydevice_config", "north_device_img_resource", (String) null);
        e = strD;
        d = strD + File.separator;
    }

    protected nzc() {
        throw new UnsupportedOperationException();
    }

    public static String b(double d2, int i, int i2) {
        if (i == 1) {
            NumberFormat numberFormat = NumberFormat.getInstance();
            numberFormat.setMaximumFractionDigits(i2);
            numberFormat.setMinimumFractionDigits(i2);
            return numberFormat.format(d2);
        }
        if (i == 2) {
            NumberFormat percentInstance = NumberFormat.getPercentInstance();
            percentInstance.setMaximumFractionDigits(i2);
            percentInstance.setMinimumFractionDigits(i2);
            return percentInstance.format(d2 / 100.0d);
        }
        return "";
    }

    public static String d(byte[] bArr) {
        if (bArr == null) {
            LogUtil.e("Track_IDEQ_UtilsForIndrEqp", "bytes == null");
            return "";
        }
        StringBuffer stringBuffer = new StringBuffer(16);
        for (byte b2 : bArr) {
            String hexString = Integer.toHexString(b2 & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            stringBuffer.append(hexString.toUpperCase(Locale.ENGLISH)).append(" ");
        }
        return stringBuffer.toString();
    }

    public static String b(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("Track_IDEQ_UtilsForIndrEqp", "in == null || length == 0");
            return "";
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        if (!i(upperCase)) {
            return "";
        }
        return upperCase.substring(0, 2) + ":" + upperCase.substring(2, 4) + ":" + upperCase.substring(4, 6) + ":" + upperCase.substring(6, 8) + ":" + upperCase.substring(8, 10) + ":" + upperCase.substring(10, 12);
    }

    public static String j(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.e("Track_IDEQ_UtilsForIndrEqp", "in == null || length == 0");
            return "";
        }
        String upperCase = str.toUpperCase(Locale.ENGLISH);
        return i(upperCase) ? upperCase : f(upperCase);
    }

    private static String f(String str) {
        String[] strArrSplit;
        if (!str.contains(":") || (strArrSplit = str.split(":")) == null || strArrSplit.length != 6) {
            return "";
        }
        String str2 = strArrSplit[0] + strArrSplit[1] + strArrSplit[2] + strArrSplit[3] + strArrSplit[4] + strArrSplit[5];
        return i(str2) ? str2 : "";
    }

    public static boolean i(String str) {
        if (!TextUtils.isEmpty(str) && str.length() <= 12) {
            return Pattern.compile("^([A-F0-9]{2}){6}$").matcher(str).find();
        }
        LogUtil.e("Track_IDEQ_UtilsForIndrEqp", "in == null || length >12");
        return false;
    }

    public static boolean a() {
        if (CommonUtil.bg()) {
            return CommonUtil.aw();
        }
        return true;
    }

    public static void a(Context context, String str, String str2) {
        if (context == null || str == null) {
            LogUtil.e("Track_IDEQ_UtilsForIndrEqp", "context == null || launchBy == null");
            return;
        }
        LogUtil.d("Track_IDEQ_UtilsForIndrEqp", "tickBiWhenActivityStart, launchBy:", str);
        HashMap map = new HashMap(3);
        map.put("prodId", b(str2, ""));
        map.put("macAddress", erh.d(str2));
        map.put("launchBy", str);
        lmf.d().c(context, AnalyticsValue.HEALTH_GYM_EQUIP_ACTIVITY_START_2170001.value(), map, 0);
    }

    public static void c(Context context, String str, String str2, QrCodeOrNfcInfo qrCodeOrNfcInfo) {
        if (context == null || str2 == null || qrCodeOrNfcInfo == null) {
            LogUtil.e("Track_IDEQ_UtilsForIndrEqp", "context == null || name == null || qrCodeOrNfcInfo == null");
            return;
        }
        LogUtil.a("Track_IDEQ_UtilsForIndrEqp", "tickBIWhenConnectStart, source:", str);
        HashMap map = new HashMap(4);
        map.put("source", str);
        map.put("brocastName", str2);
        map.put("device_model", Constants.LINK);
        map.put(DeviceCategoryFragment.DEVICE_TYPE, qrCodeOrNfcInfo.getDeviceType());
        map.put("macAddress", erh.d(qrCodeOrNfcInfo.getBtMac()));
        String pid = qrCodeOrNfcInfo.getPid();
        if (TextUtils.isEmpty(pid)) {
            map.put("prodId", b(qrCodeOrNfcInfo.getBtMac(), str2));
        } else {
            map.put("prodId", pid);
        }
        lmf.d().c(context, AnalyticsValue.HEALTH_GYM_EQUIP_CONNECT_START_2170002.value(), map, 0);
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(6);
        linkedHashMap.put("event", "start_connect");
        linkedHashMap.put("ftms", Constants.LINK);
        linkedHashMap.put("equipType_Brand_Model", Constants.LINK);
        linkedHashMap.put("macAfterSha256", Constants.LINK);
        linkedHashMap.put("invalidData", Constants.LINK);
        linkedHashMap.put("realUseTime", Constants.LINK);
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_USE_INDOOR_EQUIP_80050001.value(), linkedHashMap);
    }

    public static void d(Context context, nxo nxoVar) {
        String str;
        String strD;
        if (context == null || nxoVar == null) {
            LogUtil.e("Track_IDEQ_UtilsForIndrEqp", "context = null || devicesInfoBean == null");
            return;
        }
        String strM = nxoVar.m();
        String strH = nxoVar.h();
        String strF = nxoVar.f();
        String strC = nxoVar.c();
        if (strC == null || strC.length() == 0 || Constants.LINK.equals(strC)) {
            str = Constants.LINK;
        } else {
            if (!c(context)) {
                strD = "OVERSEA_USER";
            } else {
                strD = erh.d(j(strC));
            }
            str = strD;
        }
        LogUtil.a("Track_IDEQ_UtilsForIndrEqp", "tickBIWhenConnectResult, result:", strM, ", ftms:", strH, ", name:", strF);
        HashMap map = new HashMap(7);
        map.put("result", strM);
        map.put("ftms", strH);
        map.put("brocastName", strF);
        String strJ = nxoVar.j();
        map.put("equipType", strJ);
        String strE = nxoVar.e();
        map.put("equipBrand", strE);
        String strB = nxoVar.b();
        map.put("equipModel", strB);
        map.put("macAfterSha256", str);
        map.put("macAfterSha256_2", erh.d(strC));
        map.put("prodId", b(strC, strF));
        lmf.d().c(context, AnalyticsValue.HEALTH_GYM_EQUIP_CONNECT_RESULT_2170003.value(), map, 0);
        lmf.d().c(context, AnalyticsValue.HEALTH_GYM_EQUIP_CONNECT_RESULT_WHITE_2170017.value(), map, 0);
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(6);
        linkedHashMap.put("event", strM);
        linkedHashMap.put("ftms", strH);
        linkedHashMap.put("equipType_Brand_Model", strJ + "_" + strE + "_" + strB);
        linkedHashMap.put("macAfterSha256", str);
        linkedHashMap.put("invalidData", Constants.LINK);
        linkedHashMap.put("realUseTime", Constants.LINK);
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_USE_INDOOR_EQUIP_80050001.value(), linkedHashMap);
    }

    public static void a(String str, String str2, String str3, int i) {
        HashMap map = new HashMap();
        map.put("click", 1);
        map.put("prodId", str);
        map.put(DeviceCategoryFragment.DEVICE_TYPE, str3);
        map.put("course_id", str2);
        map.put("event", Integer.valueOf(i));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_HEART_RATE_CONTROL_2170049.value(), map, 0);
    }

    private static String b(String str, String str2) {
        String prodId;
        MeasurableDevice measurableDeviceB = dmp.d().b(str, false);
        if (measurableDeviceB == null) {
            prodId = "";
        } else {
            prodId = ((EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class)).getProdId(measurableDeviceB.getProductId());
        }
        return TextUtils.isEmpty(prodId) ? h(str2) : prodId;
    }

    private static String h(String str) {
        String strD = d(str);
        if (TextUtils.isEmpty(strD)) {
            LogUtil.a("Track_IDEQ_UtilsForIndrEqp", "broadcastName is empty");
            return "";
        }
        return ((EcologyDeviceApi) Services.b("EcologyDevice", EcologyDeviceApi.class)).getProdId(strD);
    }

    public static String d(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("Track_IDEQ_UtilsForIndrEqp", "broadcastName is empty");
            return "";
        }
        List<eds> deviceInfoByBluetooth = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getDeviceInfoByBluetooth(str);
        if (njy.b(deviceInfoByBluetooth)) {
            List<String> listAa = deviceInfoByBluetooth.get(0).aa();
            if (njy.b(listAa)) {
                return listAa.get(0);
            }
        }
        return "";
    }

    public static void e(Context context, nxo nxoVar) {
        if (context == null || nxoVar == null) {
            LogUtil.e("Track_IDEQ_UtilsForIndrEqp", "context == null || devicesInfoBean == null");
            return;
        }
        String strK = nxoVar.k();
        String strA = nxoVar.a();
        String strD = nxoVar.d();
        String strC = nxoVar.c();
        String strD2 = Constants.LINK;
        if (strC != null && strC.length() != 0 && !Constants.LINK.equals(strC)) {
            strD2 = !c(context) ? "OVERSEA_USER" : erh.d(j(strC));
        }
        LogUtil.a("Track_IDEQ_UtilsForIndrEqp", "tickBIWhenDisconnect, willReconnect:", strK, ", breakBySelf:", strA, ", connectedBefore:", strD);
        HashMap map = new HashMap(7);
        map.put("willRecon", strK);
        map.put("reconTimesThisBreakBefore", Integer.valueOf(nxoVar.i()));
        map.put("reconTimesTotalBefore", Integer.valueOf(nxoVar.n()));
        map.put("breakBySelf", strA);
        map.put("connectedBefore", strD);
        map.put("brocastName", nxoVar.f());
        map.put("macAfterSha256", strD2);
        map.put("macAfterSha256_2", erh.d(strC));
        lmf.d().c(context, AnalyticsValue.HEALTH_GYM_EQUIP_DISCONNECT_2170004.value(), map, 0);
    }

    public static void c(ProductMapInfo productMapInfo, int i, String str, int i2) {
        String strName;
        if (productMapInfo == null) {
            LogUtil.e("Track_IDEQ_UtilsForIndrEqp", "productMapInfo == null");
            return;
        }
        String strF = productMapInfo.f();
        elh elhVarD = ResourceManager.c().d(strF);
        if (elhVarD == null) {
            LogUtil.e("Track_IDEQ_UtilsForIndrEqp", "productInfo is null");
            return;
        }
        HashMap map = new HashMap(16);
        if (elhVarD.m() == null) {
            strName = "";
        } else {
            strName = elhVarD.m().name();
        }
        map.put("kind_name", strName);
        map.put("device_name", etn.c(strF));
        map.put("data_type", Integer.valueOf(i2));
        map.put("prodId", productMapInfo.g());
        map.put("macAddress", erh.d(str));
        map.put("duration_time", Integer.valueOf(i));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_ROPE_DEVICE_DATA_2170022.value(), map, 0);
    }

    public static void b(Context context, nxo nxoVar, int i) {
        if (context == null || nxoVar == null) {
            LogUtil.e("Track_IDEQ_UtilsForIndrEqp", "context == null || devicesInfoBean == null");
            return;
        }
        boolean zR = nxoVar.r();
        String strC = nxoVar.c();
        String strD = Constants.LINK;
        if (strC != null && strC.length() != 0 && !Constants.LINK.equals(strC)) {
            strD = !c(context) ? "OVERSEA_USER" : erh.d(j(strC));
        }
        String str = zR + "";
        String strB = b(nxoVar);
        LogUtil.a("Track_IDEQ_UtilsForIndrEqp", "tickBIWhenFinishSession, reason:", strB, ", invalidData:", str, ", sportTarget: ", Integer.valueOf(i));
        HashMap map = new HashMap(16);
        map.put("reason", strB);
        map.put("invalidData", str);
        long jL = nxoVar.l();
        map.put("realUseTime", Long.toString(jL));
        String strF = nxoVar.f();
        map.put("brocastName", strF);
        map.put("macAfterSha256", strD);
        map.put("macAfterSha256_2", erh.d(strC));
        map.put("device_model", nxoVar.b());
        map.put(DeviceCategoryFragment.DEVICE_TYPE, nxoVar.j());
        map.put(PluginPayAdapter.KEY_DEVICE_INFO_SN, nxoVar.g());
        map.put("prodId", b(nxoVar.c(), strF));
        if (i != -1) {
            map.put(Wpt.MODE, Integer.valueOf(i));
        }
        lmf.d().c(context, AnalyticsValue.HEALTH_GYM_EQUIP_FINISH_SESSION_2170006.value(), map, 0);
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_USE_INDOOR_EQUIP_80050001.value(), c(strD, strB, str, jL));
    }

    public static void a(String str, String str2, String str3) {
        LogUtil.a("Track_IDEQ_UtilsForIndrEqp", "biEventForRopePerformance entry");
        HashMap map = new HashMap();
        map.put("macAddress", erh.d(str2));
        map.put("page_id", str3);
        map.put("prodId", era.b(str));
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HEALTH_ROPE_TWO_LEVEL_PAGE_2170040.value(), map, 0);
    }

    private static String b(nxo nxoVar) {
        boolean zQ = nxoVar.q();
        boolean zO = nxoVar.o();
        boolean zP = nxoVar.p();
        boolean zT = nxoVar.t();
        if (zQ && zO && !zP && zT) {
            return "PressPhoneBtn";
        }
        if (zQ && !zO && !zP && !zT) {
            return "PressEndBtn(2BtnDialog)";
        }
        if (!zQ && zO && !zP && !zT) {
            return "UnexpectedBreak";
        }
        if (zQ && zO && !zP && !zT) {
            return "PressEquipBtn";
        }
        return DeviceInfo.STR_TYPE_UNKNOWN;
    }

    private static LinkedHashMap<String, String> c(String str, String str2, String str3, long j) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(6);
        linkedHashMap.put("event", str2);
        linkedHashMap.put("ftms", Constants.LINK);
        linkedHashMap.put("equipType_Brand_Model", Constants.LINK);
        linkedHashMap.put("macAfterSha256", str);
        linkedHashMap.put("invalidData", str3);
        linkedHashMap.put("realUseTime", Long.toString(j));
        return linkedHashMap;
    }

    public static void d(Context context, String str) {
        if (context == null) {
            LogUtil.e("Track_IDEQ_UtilsForIndrEqp", "context = null");
            return;
        }
        HashMap map = new HashMap(3);
        map.put("prodId", b(str, ""));
        map.put("macAddress", erh.d(str));
        map.put("hrFromWear", "1");
        lmf.d().c(context, AnalyticsValue.HEALTH_GYM_EQUIP_HR_FROM_WEAR_2170007.value(), map, 0);
    }

    public static void e(Context context, String str) {
        if (context == null || str == null) {
            LogUtil.e("Track_IDEQ_UtilsForIndrEqp", "context == null || clickBtn == null");
            return;
        }
        LogUtil.a("Track_IDEQ_UtilsForIndrEqp", "tickBiWhenClickBtn, clickBtn:", str);
        HashMap map = new HashMap(1);
        map.put("clickBtn", str);
        lmf.d().c(context, AnalyticsValue.HEALTH_GYM_EQUIP_CLICK_BTN_2170008.value(), map, 0);
    }

    public static void a(Context context, String str) {
        if (context == null || str == null) {
            LogUtil.e("Track_IDEQ_UtilsForIndrEqp", "context == null || lifeCycle = null");
            return;
        }
        LogUtil.a("Track_IDEQ_UtilsForIndrEqp", "tickBiWhenActivityLifecycleChange, lifeCycle:", str);
        HashMap map = new HashMap(1);
        map.put("lifeCycle", str);
        lmf.d().c(context, AnalyticsValue.HEALTH_GYM_EQUIP_ACTIVITY_LIFECYCLE_CHANGE_2170009.value(), map, 0);
    }

    public static void b(Context context, String str, String str2) {
        if (context == null || str == null) {
            LogUtil.e("Track_IDEQ_UtilsForIndrEqp", "context == null || lifeCycle == null");
            return;
        }
        LogUtil.a("Track_IDEQ_UtilsForIndrEqp", "tickBiWhenLandActivityLifecycleChange, lifeCycle:", str);
        HashMap map = new HashMap(3);
        map.put("prodId", b(str2, ""));
        map.put("macAddress", erh.d(str2));
        map.put("lifeCycle", str);
        lmf.d().c(context, AnalyticsValue.HEALTH_GYM_EQUIP_LAND_ACTIVITY_LIFECYCLE_CHANGE_2170012.value(), map, 0);
    }

    public static void b(Context context, String str) {
        if (context == null) {
            LogUtil.e("Track_IDEQ_UtilsForIndrEqp", "context ==null");
            return;
        }
        LogUtil.a("Track_IDEQ_UtilsForIndrEqp", "tickBIWhenUseTV");
        HashMap map = new HashMap(2);
        map.put("useTV", "1");
        map.put("prodId", b(str, ""));
        lmf.d().c(context, AnalyticsValue.HEALTH_GYM_EQUIP_USE_TV_2170013.value(), map, 0);
    }

    public static void b(Context context, boolean z) {
        if (context == null) {
            LogUtil.e("Track_IDEQ_UtilsForIndrEqp", "context == null");
            return;
        }
        LogUtil.d("Track_IDEQ_UtilsForIndrEqp", "tickBiWhenShowPrivacyDialog, isAgreeOrNot:", Boolean.valueOf(z));
        HashMap map = new HashMap(1);
        map.put("isAgreeOrNot", Boolean.valueOf(z));
        lmf.d().c(context, AnalyticsValue.HEALTH_GYM_EQUIP_AGREE_OR_NOT_2170015.value(), map, 0);
    }

    public static boolean g(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.contains("proto=2") || str.contains("ftmp=1");
    }

    public static String e(String str) {
        String strSubstring;
        if (str == null) {
            LogUtil.e("Track_IDEQ_UtilsForIndrEqp", "payload == null");
            return "";
        }
        int iIndexOf = str.indexOf("&tvn=");
        if (iIndexOf == -1 || (strSubstring = str.substring(iIndexOf + 4)) == null) {
            return "";
        }
        int iIndexOf2 = strSubstring.indexOf("&");
        int iIndexOf3 = strSubstring.indexOf(";");
        if (iIndexOf2 != -1) {
            return strSubstring.substring(1, iIndexOf2);
        }
        if (iIndexOf3 != -1) {
            return strSubstring.substring(1, iIndexOf3);
        }
        return strSubstring.substring(1);
    }

    public static String c(String str) {
        if (str == null) {
            LogUtil.j("Track_IDEQ_UtilsForIndrEqp", "payload == null");
            return "";
        }
        try {
            String strSubstring = str.substring(str.indexOf(RecordAction.ACT_COST_TIME_TAG));
            int iIndexOf = strSubstring.indexOf("&");
            if (iIndexOf < 0) {
                return "31";
            }
            return strSubstring.substring(2, iIndexOf);
        } catch (IndexOutOfBoundsException e2) {
            LogUtil.a("Track_IDEQ_UtilsForIndrEqp", "no devicetype(t=) in NFC payload, use default type,", e2.getLocalizedMessage());
            return "31";
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v0 int, still in use, count: 2, list:
      (r1v0 int) from 0x001d: IF  (r1v0 int) != (49750 int)  -> B:8:0x001f A[HIDDEN]
      (r1v0 int) from 0x0022: IF  (r1v0 int) != (49776 int)  -> B:10:0x0024 A[HIDDEN]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    public static int a(String str) {
        byte b2 = 0;
        if (str == null) {
            LogUtil.j("Track_IDEQ_UtilsForIndrEqp", "deviceType is null");
            return 0;
        }
        str.hashCode();
        if (iHashCode != 49750) {
            if (iHashCode != 49776) {
                switch (str) {
                    case "260":
                        b2 = 1;
                        break;
                    case "261":
                        b2 = 2;
                        break;
                    case "262":
                        b2 = 3;
                        break;
                    default:
                        b2 = -1;
                        break;
                }
            } else if (str.equals(BleConstants.SPORT_TYPE_TREADMILL)) {
                b2 = 4;
            } else {
                b2 = -1;
            }
        } else if (!str.equals(BleConstants.SPORT_TYPE_BIKE)) {
            b2 = -1;
        }
        if (b2 == 0) {
            return OldToNewMotionPath.SPORT_TYPE_INDOOR_BIKE;
        }
        if (b2 == 1) {
            return OldToNewMotionPath.SPORT_TYPE_CROSS_TRAINER;
        }
        if (b2 == 2) {
            return OldToNewMotionPath.SPORT_TYPE_ROW_MACHINE;
        }
        if (b2 != 3) {
            return b2 != 4 ? 264 : 281;
        }
        return 283;
    }

    public static String c(int i) {
        if (i == 265) {
            return "0BF";
        }
        if (i == 281) {
            return "092";
        }
        if (i == 283) {
            return "095";
        }
        if (i == 273) {
            return "0C0";
        }
        if (i == 274) {
            return "0C1";
        }
        return "08F";
    }

    public static int b(String str, int i, float f) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "touch time":
                b2 = 0;
                break;
            case "eversion angle":
                b2 = 1;
                break;
            case "ground impact":
                b2 = 2;
                break;
            case "step frequency":
                b2 = 3;
                break;
            case "ground shock peak":
                b2 = 4;
                break;
            case "swing angle":
                b2 = 5;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return f(i, f);
        }
        if (b2 == 1) {
            return c(i, f);
        }
        if (b2 == 2) {
            return d(i, f);
        }
        if (b2 == 3) {
            return e(i, f);
        }
        if (b2 == 4) {
            return b(i, f);
        }
        if (b2 != 5) {
            return -1;
        }
        return a(i, f);
    }

    public static boolean e(Context context) {
        if (context != null) {
            return LanguageUtil.l(context) && !Utils.o() && CommonUtil.v(context) && !UnitUtil.f();
        }
        LogUtil.e("Track_IDEQ_UtilsForIndrEqp", "context == null");
        return false;
    }

    public static boolean c(Context context) {
        if (context != null) {
            return !Utils.o() && CommonUtil.v(context) && (LoginInit.getInstance(context).getSiteId() == 1);
        }
        LogUtil.e("Track_IDEQ_UtilsForIndrEqp", "context == null");
        return false;
    }

    public static Drawable e(Context context, int i) {
        if (context == null) {
            LogUtil.e("Track_IDEQ_UtilsForIndrEqp", "getLandingWayImgRes method,context is null!");
            return null;
        }
        if (LanguageUtil.ba(context)) {
            BitmapDrawable bitmapDrawableE = qqz.e(context, i);
            if (bitmapDrawableE != null) {
                return bitmapDrawableE;
            }
            LogUtil.a("Track_IDEQ_UtilsForIndrEqp", "getLandingWayImgRes method,create mirrorImg failed!");
            return context.getResources().getDrawable(i);
        }
        return context.getResources().getDrawable(i);
    }

    public static Drawable b(Context context, int i) {
        if (context == null) {
            LogUtil.e("Track_IDEQ_UtilsForIndrEqp", "getIconImgRes method,context is null!");
            return null;
        }
        if (LanguageUtil.ba(context)) {
            BitmapDrawable bitmapDrawableE = qqz.e(context, i);
            if (bitmapDrawableE != null) {
                return bitmapDrawableE;
            }
            LogUtil.a("Track_IDEQ_UtilsForIndrEqp", "getIconImgRes method,create btConnectingRtl failed!");
            return context.getResources().getDrawable(i);
        }
        return context.getResources().getDrawable(i);
    }

    public static boolean c() {
        if (LanguageUtil.al(BaseApplication.getContext()) && !Utils.o()) {
            return false;
        }
        if (!CommonUtil.cj()) {
            LogUtil.a("Track_IDEQ_UtilsForIndrEqp", "isOverseaForIndoorEquip!");
            return true;
        }
        LogUtil.j("Track_IDEQ_UtilsForIndrEqp", "is not overseaForIndoorEquip!");
        return false;
    }

    public static String a(int i, Context context) {
        if (context != null) {
            return context.getResources().getString(R.string.ie_main_landscape_heart_rate_unit, context.getResources().getQuantityString(R.plurals.ie_main_watch_heart_rate_unit_string, i, "").trim());
        }
        LogUtil.j("Track_IDEQ_UtilsForIndrEqp", "setHeartRateUnitText context null");
        return "";
    }

    public static String d(int i, Context context) {
        if (context == null) {
            LogUtil.j("Track_IDEQ_UtilsForIndrEqp", "setHeartRateUnitText context null");
            return "";
        }
        if (!qrs.af(context)) {
            return context.getResources().getString(R.string.ie_main_landscape_heart_rate_unit, context.getResources().getQuantityString(R.plurals.ie_main_watch_heart_rate_unit_string, i, "").trim());
        }
        return context.getResources().getString(R.string.ie_main_watch_heart_rate_string);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    public static String a(String str, boolean z, boolean z2) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "31":
                b2 = 0;
                break;
            case "259":
                b2 = 1;
                break;
            case "260":
                b2 = 2;
                break;
            case "261":
                b2 = 3;
                break;
            case "264":
                b2 = 4;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0) {
            return d(z, z2);
        }
        if (b2 == 1) {
            if (z) {
                return d + "pic_pad_indoor_bike_1.webp";
            }
            return d + "pic_indoor_bike_1.webp";
        }
        if (b2 == 2) {
            if (z) {
                return d + "pic_pad_cross_trainer_1.webp";
            }
            return d + "pic_cross_trainer_1.webp";
        }
        if (b2 == 3) {
            if (z) {
                return d + "pic_pad_rowing_machine_1.webp";
            }
            return d + "pic_rowing_machine_1.webp";
        }
        if (b2 != 4) {
            return "";
        }
        if (z) {
            return d + "pic_pad_walking_machine_1.webp";
        }
        return d + "pic_walking_machine_1.webp";
    }

    private static String d(boolean z, boolean z2) {
        if (z) {
            if (z2) {
                return d + "pic_runner_contact_4.webp";
            }
            return d + "pic_runner_contact_5.webp";
        }
        if (z2) {
            return d + "pic_runner_contact_1.webp";
        }
        return d + "pic_runner_contact_2.webp";
    }

    public static int a(int i) {
        if (i == 1) {
            return R.drawable.ic_bolt_connected;
        }
        if (i == 2) {
            return R.drawable.ic_bolt_connected_two;
        }
        return 0;
    }

    public static int b(float f) {
        return ((int) (c(f) * (-40.0f))) + 720;
    }

    public static boolean b(Context context) {
        if (context == null) {
            return false;
        }
        if (qrs.ah(context)) {
            LogUtil.a("Track_IDEQ_UtilsForIndrEqp", "isPad");
            return false;
        }
        if (qrs.af(context)) {
            LogUtil.a("Track_IDEQ_UtilsForIndrEqp", "isWideScreen");
            return false;
        }
        return qrs.x();
    }

    public static boolean b(int i) {
        if (!CommonUtil.bh() || UnitUtil.f()) {
            return true;
        }
        return (CommonUtil.bd() && i != 264) || Utils.o();
    }
}
