package defpackage;

import android.app.Activity;
import android.bluetooth.BluetoothGatt;
import android.bluetooth.BluetoothGattCharacteristic;
import android.content.ActivityNotFoundException;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import androidx.media3.common.C;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.ecologydevice.R;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.health.device.api.HealthDeviceEntryApi;
import com.huawei.health.device.api.HonourDeviceConstantsApi;
import com.huawei.health.device.api.MultiUsersManagerApi;
import com.huawei.health.device.connectivity.comm.MeasurableDevice;
import com.huawei.health.device.constants.WeightConstants;
import com.huawei.health.device.model.DeviceExtra;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.model.RecordAction;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hihealth.HiHealthData;
import com.huawei.hihealth.HiUserInfo;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.AdShowExtras;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.ble.BleConstants;
import com.huawei.operation.h5pro.ble.BleJsInteractionCompact;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.wisecloud.drmclient.license.HwDrmConstant;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.KeyValDbManager;
import health.compact.a.LanguageUtil;
import health.compact.a.LogAnonymous;
import health.compact.a.ReleaseLogUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.UnitUtil;
import health.compact.a.Utils;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class etn {
    public static final String d = BaseApplication.getAppPackage();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final double[] f33461a = {25.0d, 80.0d};

    public static int a(int i) {
        if (i == -100) {
            return 1;
        }
        return i;
    }

    public static int d(int i) {
        if (i <= 0) {
            return 29;
        }
        return i;
    }

    public static int e(int i) {
        if (i <= 0) {
            return 173;
        }
        return i;
    }

    public static void c(BluetoothGatt bluetoothGatt, BluetoothGattCharacteristic bluetoothGattCharacteristic, BluetoothGattCharacteristic bluetoothGattCharacteristic2) {
        int i;
        LogUtil.a("PluginDevice_HealthUtils", "Enter setDateTime");
        if (bluetoothGattCharacteristic == null && bluetoothGattCharacteristic2 == null) {
            LogUtil.a("PluginDevice_HealthUtils", "setDateTime fail");
            return;
        }
        if (bluetoothGattCharacteristic != null) {
            LogUtil.a("PluginDevice_HealthUtils", "setDateTime mDateTimeCharacteristic != null");
            i = 7;
        } else {
            bluetoothGattCharacteristic = null;
            i = 0;
        }
        if (bluetoothGattCharacteristic2 != null) {
            LogUtil.a("PluginDevice_HealthUtils", "setDateTime mCurrentTimeCharacteristic != null");
            i = 10;
        } else {
            bluetoothGattCharacteristic2 = bluetoothGattCharacteristic;
        }
        byte[] bArrC = c(i);
        if (bluetoothGatt != null) {
            bluetoothGattCharacteristic2.setValue(bArrC);
            LogUtil.a("PluginDevice_HealthUtils", "setDateTime array = ", Arrays.toString(bArrC));
            new ehl().e(bluetoothGatt, bluetoothGattCharacteristic2);
        }
    }

    public static byte[] c(int i) {
        Calendar calendar = Calendar.getInstance();
        int i2 = calendar.get(1);
        int i3 = calendar.get(2);
        byte[] bArr = new byte[i];
        bArr[0] = (byte) (i2 & 255);
        bArr[1] = (byte) ((i2 >> 8) & 255);
        bArr[2] = (byte) ((i3 + 1) & 255);
        bArr[3] = (byte) (calendar.get(5) & 255);
        bArr[4] = (byte) (calendar.get(11) & 255);
        bArr[5] = (byte) (calendar.get(12) & 255);
        bArr[6] = (byte) (calendar.get(13) & 255);
        return bArr;
    }

    public static int a(double d2) {
        if (Math.abs(d2 - Math.floor(d2)) >= 1.0E-6d) {
            return 100;
        }
        return (int) d2;
    }

    private static AnalyticsValue b(HealthDevice.HealthDeviceKind healthDeviceKind) {
        if (healthDeviceKind == HealthDevice.HealthDeviceKind.HDK_BODY_TEMPERATURE) {
            return AnalyticsValue.HEALTH_PLUGIN_DEVICE_BEGIN_MEASURE_2060043;
        }
        if (healthDeviceKind == HealthDevice.HealthDeviceKind.HDK_BLOOD_OXYGEN) {
            return AnalyticsValue.HEALTH_PLUGIN_DEVICE_BEGIN_MEASURE_2060045;
        }
        if (healthDeviceKind == HealthDevice.HealthDeviceKind.HDK_BLOOD_SUGAR) {
            return AnalyticsValue.HEALTH_PLUGIN_DEVICE_BEGIN_MEASURE_2060010;
        }
        return null;
    }

    public static void o(String str) {
        elh elhVarD;
        AnalyticsValue analyticsValueB;
        if (str == null || (elhVarD = ResourceManager.c().d(str)) == null || (analyticsValueB = b(elhVarD.m())) == null) {
            return;
        }
        HashMap map = new HashMap(16);
        map.put("device_name", c(str, elhVarD.l().d()));
        map.put("prodId", era.b(str));
        lmf.d().c(dxw.d(), analyticsValueB.value(), map, 0);
    }

    private static AnalyticsValue e(HealthDevice.HealthDeviceKind healthDeviceKind) {
        if (healthDeviceKind == HealthDevice.HealthDeviceKind.HDK_BODY_TEMPERATURE) {
            return AnalyticsValue.HEALTH_PLUGIN_DEVICE_MEASURE_SUCCEED_2060044;
        }
        if (healthDeviceKind == HealthDevice.HealthDeviceKind.HDK_BLOOD_OXYGEN) {
            return AnalyticsValue.HEALTH_PLUGIN_DEVICE_MEASURE_SUCCEED_2060046;
        }
        return null;
    }

    public static void k(String str) {
        elh elhVarD;
        AnalyticsValue analyticsValueE;
        if (str == null || (elhVarD = ResourceManager.c().d(str)) == null || (analyticsValueE = e(elhVarD.m())) == null) {
            return;
        }
        HashMap map = new HashMap(16);
        map.put("device_name", c(str, elhVarD.l().d()));
        map.put(DeviceCategoryFragment.DEVICE_TYPE, elhVarD.m().name());
        map.put("measure_time", new SimpleDateFormat(HwDrmConstant.TIME_FORMAT).format(new Date(System.currentTimeMillis())));
        lmf.d().c(dxw.d(), analyticsValueE.value(), map, 0);
    }

    public static boolean i(String str) {
        if (str == null) {
            return false;
        }
        for (HealthDevice.HealthDeviceKind healthDeviceKind : HealthDevice.HealthDeviceKind.values()) {
            if (healthDeviceKind.name().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static HealthDevice.HealthDeviceKind a(String str) {
        return i(str) ? HealthDevice.HealthDeviceKind.valueOf(str) : HealthDevice.HealthDeviceKind.HDK_NOT_DEVICE;
    }

    public static boolean g(String str) {
        elh elhVarD;
        if (TextUtils.isEmpty(str) || (elhVarD = ResourceManager.c().d(str)) == null) {
            return false;
        }
        return HealthDevice.HealthDeviceKind.HDK_ROPE_SKIPPING.equals(elhVarD.m());
    }

    public static String e(String str, String str2) {
        String str3 = "";
        if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str)) {
            String str4 = "&" + str + "=";
            int iIndexOf = str2.indexOf(str4);
            if (iIndexOf != -1) {
                String strSubstring = str2.substring(iIndexOf + str4.length());
                LogUtil.a("PluginDevice_HealthUtils", "substring:", strSubstring);
                if (strSubstring != null) {
                    int iIndexOf2 = strSubstring.indexOf("&");
                    int iIndexOf3 = strSubstring.indexOf(";");
                    if (iIndexOf2 != -1) {
                        strSubstring = strSubstring.substring(0, iIndexOf2);
                    } else if (iIndexOf3 != -1) {
                        strSubstring = strSubstring.substring(0, iIndexOf3);
                    }
                    str3 = strSubstring;
                }
                LogUtil.a("PluginDevice_HealthUtils", "param:", str3);
            }
        }
        return str3;
    }

    public static String e(String str) {
        if (str == null) {
            LogUtil.j("PluginDevice_HealthUtils", "payload == null");
            return "";
        }
        try {
            String strSubstring = str.substring(str.indexOf(RecordAction.ACT_COST_TIME_TAG));
            int iIndexOf = strSubstring.indexOf("&");
            if (iIndexOf != -1) {
                return strSubstring.substring(2, iIndexOf);
            }
        } catch (IndexOutOfBoundsException e) {
            LogUtil.a("PluginDevice_HealthUtils", "no devicetype(t=) in NFC payload or qr code", e.getLocalizedMessage());
        }
        return "";
    }

    public static boolean n(String str) {
        elh elhVarD;
        if (TextUtils.isEmpty(str) || (elhVarD = ResourceManager.c().d(str)) == null) {
            return false;
        }
        HealthDevice.HealthDeviceKind healthDeviceKindM = elhVarD.m();
        return HealthDevice.HealthDeviceKind.HDK_TREADMILL.equals(healthDeviceKindM) || HealthDevice.HealthDeviceKind.HDK_EXERCISE_BIKE.equals(healthDeviceKindM) || HealthDevice.HealthDeviceKind.HDK_ROWING_MACHINE.equals(healthDeviceKindM) || HealthDevice.HealthDeviceKind.HDK_ELLIPTICAL_MACHINE.equals(healthDeviceKindM) || HealthDevice.HealthDeviceKind.HDK_WALKING_MACHINE.equals(healthDeviceKindM);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    public static HealthDevice.HealthDeviceKind b(String str) {
        if (str == null) {
            return null;
        }
        str.hashCode();
        switch (str) {
            case "025":
                return HealthDevice.HealthDeviceKind.HDK_WEIGHT;
            case "02B":
                return HealthDevice.HealthDeviceKind.HDK_BLOOD_PRESSURE;
            case "054":
                return HealthDevice.HealthDeviceKind.HDK_SMART_PILLOW;
            case "086":
                return HealthDevice.HealthDeviceKind.HDK_BLOOD_SUGAR;
            case "088":
                return HealthDevice.HealthDeviceKind.HDK_HEART_RATE;
            case "08F":
                return HealthDevice.HealthDeviceKind.HDK_TREADMILL;
            case "092":
                return HealthDevice.HealthDeviceKind.HDK_WALKING_MACHINE;
            case "095":
                return HealthDevice.HealthDeviceKind.HDK_ROPE_SKIPPING;
            case "0B3":
                return HealthDevice.HealthDeviceKind.HDK_BODY_TEMPERATURE;
            case "0B4":
                return HealthDevice.HealthDeviceKind.HDK_BLOOD_OXYGEN;
            case "0BF":
                return HealthDevice.HealthDeviceKind.HDK_EXERCISE_BIKE;
            case "0C0":
                return HealthDevice.HealthDeviceKind.HDK_ELLIPTICAL_MACHINE;
            case "0C1":
                return HealthDevice.HealthDeviceKind.HDK_ROWING_MACHINE;
            case "0C5":
                return HealthDevice.HealthDeviceKind.HDK_MASSAGE_GUN;
            case "14C":
                return HealthDevice.HealthDeviceKind.HDK_ECG;
            default:
                return null;
        }
    }

    public static boolean b(Context context) {
        if (context != null) {
            return LanguageUtil.l(context) && !Utils.o() && CommonUtil.v(context) && !UnitUtil.f();
        }
        LogUtil.e("PluginDevice_HealthUtils", "context == null");
        return false;
    }

    private static double d(double d2) {
        return Math.round(d2 * 10.0d) / 10.0d;
    }

    public static double e(double d2, int i) {
        if (i <= 0) {
            return 0.0d;
        }
        return d(d2 / Math.pow(((double) i) / 100.0d, 2.0d));
    }

    public static boolean b(double d2) {
        return b(d2, a());
    }

    private static boolean b(double d2, double[] dArr) {
        return d2 >= dArr[0] && d2 <= dArr[1];
    }

    public static double[] a() {
        return new double[]{e(WeightConstants.a()[0]), e(WeightConstants.a()[1])};
    }

    public static double e(double d2) {
        return CommonUtil.a(String.valueOf(new BigDecimal(d2).setScale(0, 4)));
    }

    public static String d(double d2, double d3, double d4, String str) {
        boolean z;
        String string;
        String string2;
        if (d2 <= 0.0d || d3 <= 0.0d || d4 < 10.0d || d4 > 250.0d) {
            LogUtil.j("PluginDevice_HealthUtils", "getMeasureResultTip weight or startWeight or goalWeight is illegal");
            return "";
        }
        LogUtil.d("PluginDevice_HealthUtils", "getMeasureResultTip weight ", Double.valueOf(d2), " startWeight ", Double.valueOf(d3), " goalWeight ", Double.valueOf(d4));
        Resources resources = BaseApplication.getContext().getResources();
        if (d3 < d4) {
            z = d2 >= d4;
            if (z) {
                string2 = resources.getString(R.string.IDS_device_wifi_measure_result_equal_target_msg);
            } else {
                string2 = resources.getString(R.string.IDS_device_wifi_measure_result_more_target_msg, str);
            }
            LogUtil.a("PluginDevice_HealthUtils", "getMeasureResultTip gain weight isDoneGoal ", Boolean.valueOf(z));
            return string2;
        }
        if (d3 <= d4) {
            String string3 = resources.getString(R.string.IDS_device_wifi_measure_result_equal_target_msg);
            LogUtil.a("PluginDevice_HealthUtils", "getMeasureResultTip done goal");
            return string3;
        }
        z = d2 <= d4;
        if ((d3 - d4) / d3 >= 0.18d) {
            ReleaseLogUtil.d("R_PluginDevice_HealthUtils", "getMeasureResultTip startWeight and goalWeight is not 0.18");
            return "";
        }
        if (z) {
            string = resources.getString(R.string.IDS_device_wifi_measure_result_equal_target_msg);
        } else {
            string = resources.getString(R.string.IDS_device_wifi_measure_result_less_target_msg, str);
        }
        LogUtil.a("PluginDevice_HealthUtils", "getMeasureResultTip lose weight isDoneTarget ", Boolean.valueOf(z));
        return string;
    }

    public static void b(Context context, IBaseResponseCallback iBaseResponseCallback) {
        if (qra.e("key_person_info_setting_dialog_show_count_") == 2) {
            b();
        }
        a(context, true, iBaseResponseCallback);
    }

    private static void a(final Context context, final boolean z, final IBaseResponseCallback iBaseResponseCallback) {
        if (z && !qra.c()) {
            LogUtil.j("PluginDevice_HealthUtils", "showSetUserInfoDialog canShowSettingDialog false");
            e(iBaseResponseCallback, 0);
        } else {
            if (context == null) {
                LogUtil.j("PluginDevice_HealthUtils", "context == null");
                return;
            }
            CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(context).a(R.string.IDS_profile_dialog_title).b(R.string.IDS_profile_dialog_content).e(R.string.IDS_main_btn_state_ignore, new View.OnClickListener() { // from class: etn.4
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.j("PluginDevice_HealthUtils", "showSetUserInfoDialog cancel");
                    if (z) {
                        etn.b();
                        etn.e(iBaseResponseCallback, 0);
                    }
                }
            }).a(R.string.IDS_profile_dialog_go_perfect, new View.OnClickListener() { // from class: etn.2
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    etn.e(context, z);
                }
            }).b();
            customTextAlertDialogB.setCancelable(false);
            customTextAlertDialogB.show();
        }
    }

    public static void e(Context context, boolean z) {
        Intent intent = new Intent();
        intent.setClassName(context, KakaConstants.USER_INFO_URL);
        intent.setPackage(context.getPackageName());
        if (intent.resolveActivity(context.getPackageManager()) == null) {
            LogUtil.j("PluginDevice_HealthUtils", "showSettingDialog resolveActivity == null");
            return;
        }
        if (z) {
            b();
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("PluginDevice_HealthUtils", "jumpUserInfoActivity startActivity catch e:", e.getMessage());
        }
    }

    public static void b() {
        int i;
        Context context = BaseApplication.getContext();
        String strE = nio.e(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
        KeyValDbManager keyValDbManagerD = KeyValDbManager.d(context);
        String str = "key_person_info_setting_dialog_show_count_" + strE;
        String strC = keyValDbManagerD.c(str);
        LogUtil.a("PluginDevice_HealthUtils", "updateShowCount count=", strC);
        if (TextUtils.isEmpty(strC)) {
            keyValDbManagerD.b(str, Integer.toString(1));
            return;
        }
        try {
            i = Integer.parseInt(strC);
        } catch (NumberFormatException e) {
            LogUtil.e("PluginDevice_HealthUtils", "updateShowCountAndTime e=", LogAnonymous.b(e));
            i = 0;
        }
        keyValDbManagerD.b(str, Integer.toString(i + 1));
    }

    public static void e(final Handler handler) {
        ((MultiUsersManagerApi) Services.b("PluginDevice", MultiUsersManagerApi.class)).getCurrentUserForUserInfo(new ResponseCallback() { // from class: etm
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                etn.e(handler, i, (dnj) obj);
            }
        });
    }

    static /* synthetic */ void e(Handler handler, int i, dnj dnjVar) {
        LogUtil.a("PluginDevice_HealthUtils", "getCurrentUserForUserInfo code = ", Integer.valueOf(i));
        if (i == 0) {
            e(handler, 10001, (Object) dnjVar);
            LogUtil.a("PluginDevice_HealthUtils", "getCurrentUserForUserInfo currentUserInfo  is null ? ", Boolean.valueOf(dnjVar == null));
            OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_WEIGHT_GET_USER_INFORMATION_85070011.value(), qrs.a("0"));
            return;
        }
        OpAnalyticsUtil.getInstance().setEventOneErrorCode(OperationKey.HEALTH_APP_WEIGHT_GET_USER_INFORMATION_85070011.value(), i);
    }

    public static boolean d(Object obj) {
        if (obj instanceof HiUserInfo) {
            HiUserInfo hiUserInfo = (HiUserInfo) obj;
            return hiUserInfo.isGenderValid() && hiUserInfo.isBirthdayValid() && hiUserInfo.isHeightValid();
        }
        if (obj instanceof dnj) {
            dnj dnjVar = (dnj) obj;
            return dnjVar.u() && dnjVar.s() && dnjVar.y();
        }
        LogUtil.j("PluginDevice_HealthUtils", "object is invalid");
        return false;
    }

    public static void b(Context context, Object obj) {
        IBaseResponseCallback iBaseResponseCallback = new IBaseResponseCallback() { // from class: etn.1
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj2) {
                LogUtil.d("PluginDevice_HealthUtils", "checkUserWeightAndShowDialog cancel");
            }
        };
        if (obj instanceof HiUserInfo) {
            if (((HiUserInfo) obj).isWeightValid()) {
                return;
            }
            b(context, iBaseResponseCallback);
        } else if (obj instanceof dnj) {
            if (((dnj) obj).w()) {
                return;
            }
            b(context, iBaseResponseCallback);
        } else {
            if (obj instanceof JSONObject) {
                try {
                    if (((JSONObject) obj).getJSONArray("data").getJSONObject(0).getDouble("weight") <= 0.0d) {
                        b(context, iBaseResponseCallback);
                        return;
                    }
                    return;
                } catch (JSONException unused) {
                    LogUtil.j("PluginDevice_HealthUtils", "JSONObject is invalid");
                    return;
                }
            }
            LogUtil.j("PluginDevice_HealthUtils", "object is invalid");
        }
    }

    public static void e(Handler handler, int i, Object obj) {
        Message messageObtain = Message.obtain();
        messageObtain.what = i;
        messageObtain.obj = obj;
        if (handler != null) {
            handler.sendMessage(messageObtain);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void e(IBaseResponseCallback iBaseResponseCallback, int i) {
        if (iBaseResponseCallback != null) {
            iBaseResponseCallback.a(i, null);
        }
    }

    public static Intent b(elh elhVar, String str, String str2) {
        if (elhVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.a("PluginDevice_HealthUtils", "jumpIntroductionData productInfo or productId or uniqueId = null");
            return null;
        }
        Intent intent = new Intent();
        intent.setPackage(dmz.y);
        intent.setClassName(dmz.y, "com.huawei.operation.activity.WebViewActivity");
        intent.putExtra("url", elg.e().e(str));
        intent.putExtra("productId", str);
        intent.putExtra("uniqueId", str2);
        intent.putExtra("name", c(str, elhVar.l().d()));
        intent.putExtra("deviceType", elhVar.m().name());
        intent.putExtra(Constants.KEY_BLE_SCAN_MODE, elhVar.v().c());
        intent.putExtra("bleIntroductionType", elhVar.n().b());
        return intent;
    }

    public static void c(Context context, elh elhVar, String str, String str2) {
        LogUtil.a("PluginDevice_HealthUtils", "switchToH5ProIntro");
        if (context == null || elhVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("PluginDevice_HealthUtils", "switchToH5ProIntro context or productInfo or productId or uniqueId = null");
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("productId", str);
        contentValues.put("uniqueId", str2);
        contentValues.put("name", elhVar.l().d());
        contentValues.put("deviceType", elhVar.m().name());
        contentValues.put("deviceId", elhVar.h());
        new BleJsInteractionCompact().startH5Pro(context, "com.huawei.health.device." + str, contentValues, "");
    }

    public static void b(Context context, elh elhVar, String str, String str2, String str3) {
        LogUtil.a("PluginDevice_HealthUtils", "switchToH5ProIntro");
        if (context == null || elhVar == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("PluginDevice_HealthUtils", "switchToH5ProIntro context or productInfo or productId or uniqueId = null");
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("productId", str);
        contentValues.put("uniqueId", str2);
        contentValues.put("name", elhVar.l().d());
        contentValues.put("deviceType", elhVar.m().name());
        contentValues.put("deviceId", elhVar.h());
        contentValues.put(BleConstants.ATTACH_SN, str3);
        new BleJsInteractionCompact().startH5Pro(context, "com.huawei.health.device." + str, contentValues, "");
    }

    public static void c(Context context, String str, String str2, String str3) {
        LogUtil.a("PluginDevice_HealthUtils", "goToH5ProIntro");
        elh elhVarD = ResourceManager.c().d(str);
        if (context == null || elhVarD == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("PluginDevice_HealthUtils", "goToH5ProIntro context or productInfo or productId or uniqueId = null");
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("productId", str);
        contentValues.put("uniqueId", str2);
        contentValues.put("name", elhVarD.l().d());
        contentValues.put("deviceType", elhVarD.m().name());
        contentValues.put("deviceId", elhVarD.h());
        new BleJsInteractionCompact().startH5Pro(context, "com.huawei.health.device." + str, contentValues, str3);
    }

    public static void b(Context context, String str, String str2) {
        if (context == null) {
            LogUtil.j("PluginDevice_HealthUtils", "context == null, disable startWebViewActivity");
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(dmz.y);
        intent.setClassName(dmz.y, "com.huawei.operation.activity.WebViewActivity");
        intent.putExtra("url", elg.e().e(str));
        intent.putExtra("productId", str);
        elh elhVarD = ResourceManager.c().d(str);
        if (elhVarD == null) {
            LogUtil.j("PluginDevice_HealthUtils", "productInfo is null");
            return;
        }
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", str2);
        contentValues.put("name", c(str, elhVarD.l().d()));
        contentValues.put("deviceType", elhVarD.m().name());
        intent.putExtra("commonDeviceInfo", contentValues);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("PluginDevice_HealthUtils", "startWebViewActivity startActivity catch e:", e.getMessage());
        }
    }

    public static void b(Activity activity, String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str) || activity == null || TextUtils.isEmpty(str2)) {
            LogUtil.e("PluginDevice_HealthUtils", "startHealthKitActivity initData is null");
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(activity.getPackageName());
        intent.setClassName(activity, "com.huawei.ui.thirdpartservice.activity.healthkit.HealthKitActivity");
        intent.putExtra("key_start_to_measure_to_health_kit_authorization", true);
        intent.putExtra("productId", str);
        intent.putExtra("uniqueId", str2);
        elh elhVarD = ResourceManager.c().d(str);
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", str2);
        if (elhVarD == null) {
            LogUtil.e("PluginDevice_HealthUtils", "startHealthKitActivity deviceProductInfo is null");
            return;
        }
        contentValues.put("name", elhVarD.l().d());
        contentValues.put("deviceType", elhVarD.m().name());
        intent.putExtra("commonDeviceInfo", contentValues);
        try {
            activity.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("PluginDevice_HealthUtils", "startHealthKitActivity startActivity catch e:", e.getMessage());
        }
        if (z) {
            activity.finish();
        }
    }

    public static void b(Activity activity, String str) {
        if (activity == null || TextUtils.isEmpty(str)) {
            return;
        }
        Intent intent = new Intent(activity, (Class<?>) WebViewActivity.class);
        String strE = elg.e().e(str);
        LogUtil.d("PluginDevice_HealthUtils", "gotoSinoH5" + strE);
        intent.putExtra("url", strE + "#/type=1");
        intent.putExtra("productId", str);
        try {
            activity.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("PluginDevice_HealthUtils", "gotoSinoH5 startActivity catch e:", e.getMessage());
        }
        activity.finish();
    }

    public static boolean a(Context context) {
        if (context == null) {
            LogUtil.a("PluginDevice_HealthUtils", "isSwitchPage,context is null");
            return false;
        }
        String strE = SharedPreferenceManager.e(context, String.valueOf(10008), "key_device_pair_switch_ui");
        if (TextUtils.isEmpty(strE)) {
            return true;
        }
        return Boolean.parseBoolean(strE);
    }

    public static String d(String str) {
        LogUtil.d("PluginDevice_HealthUtils", "getSubProductId productId = " + str);
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        return str.indexOf(com.huawei.openalliance.ad.constant.Constants.LINK) > 0 ? str.substring(0, str.indexOf(com.huawei.openalliance.ad.constant.Constants.LINK)) : str;
    }

    public static boolean d(Context context) {
        if (context == null) {
            return false;
        }
        String commonCountryCode = GRSManager.c(BaseApplication.getContext()).getCommonCountryCode();
        LogUtil.a("PluginDevice_HealthUtils", "isShowPrivacy country", commonCountryCode);
        if (TextUtils.isEmpty(commonCountryCode)) {
            commonCountryCode = SharedPreferenceManager.e(context, Integer.toString(PrebakedEffectId.RT_SNIPER_RIFLE), "select_country");
        }
        if (TextUtils.isEmpty(commonCountryCode)) {
            return false;
        }
        String strD = lon.c().d("domain_honor_country");
        LogUtil.j("PluginDevice_HealthUtils", "honorCountrysString: ", strD);
        if (strD == null) {
            LogUtil.j("PluginDevice_HealthUtils", "honorCountrysString is null");
            return true;
        }
        if (strD.equals("ALL")) {
            return true;
        }
        for (String str : strD.split(",")) {
            if (str.equalsIgnoreCase(commonCountryCode)) {
                return true;
            }
        }
        return false;
    }

    public static void a(Context context, String str) {
        if (context == null) {
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(dmz.y);
        intent.setClassName(dmz.y, "com.huawei.ui.device.activity.adddevice.AllDeviceListActivity");
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("kind_id", str);
        }
        iov.d(context, intent);
    }

    public static void c() {
        Intent intent = new Intent();
        intent.setAction("com.huawei.health.action.PAIR_DEVICE_SUCCESS");
        LocalBroadcastManager.getInstance().sendBroadcast(intent);
    }

    public static void e() {
        Intent intent = new Intent();
        intent.setAction("com.huawei.bone.action.UI_DEVICE_LIST_CHANGED");
        LocalBroadcastManager.getInstance().sendBroadcast(intent);
    }

    public static boolean d(String str, String str2) {
        HealthDeviceEntryApi healthDeviceEntryApi = (HealthDeviceEntryApi) Services.b("PluginDevice", HealthDeviceEntryApi.class);
        if (TextUtils.isEmpty(str2)) {
            HealthDevice bondedDevice = healthDeviceEntryApi.getBondedDevice(str);
            if (bondedDevice != null) {
                LogUtil.j("PluginDevice_HealthUtils", "isBondedThirdPartyDevice uniqueId is null and thirdPartyDevice name: ", bondedDevice.getDeviceName());
            }
            return bondedDevice != null;
        }
        if (healthDeviceEntryApi.isDeviceKitUniversal(str)) {
            com.huawei.hihealth.device.open.HealthDevice bondedDeviceUniversal = healthDeviceEntryApi.getBondedDeviceUniversal(str, str2);
            if (bondedDeviceUniversal != null) {
                LogUtil.j("PluginDevice_HealthUtils", "isBondedThirdPartyDevice by prodId and uniqueId thirdPartyDevice name: ", bondedDeviceUniversal.getDeviceName());
            }
            return bondedDeviceUniversal != null;
        }
        HealthDevice bondedDeviceByUniqueId = healthDeviceEntryApi.getBondedDeviceByUniqueId(str2);
        if (bondedDeviceByUniqueId != null) {
            LogUtil.j("PluginDevice_HealthUtils", "isBondedThirdPartyDevice by uniqueId thirdPartyDevice name: ", bondedDeviceByUniqueId.getDeviceName());
        }
        return healthDeviceEntryApi.getBondedDeviceByUniqueId(str2) != null;
    }

    public static boolean j(String str) {
        elh elhVarD = ResourceManager.c().d(str);
        return (elhVarD == null || elhVarD.m() == null || !HealthDevice.HealthDeviceKind.HDK_FITTINGS.name().equals(elhVarD.m().name())) ? false : true;
    }

    public static boolean b(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("PluginDevice_HealthUtils", "isBondedFittingsDevice attachUniqueId or uniqueId is null");
            return false;
        }
        MeasurableDevice bondedDeviceByUniqueId = dmg.a().getBondedDeviceByUniqueId(str, false);
        if (bondedDeviceByUniqueId == null) {
            return false;
        }
        DeviceExtra deviceExtra = (DeviceExtra) HiJsonUtil.d(bondedDeviceByUniqueId.getExtra(), DeviceExtra.class);
        if (deviceExtra != null && njy.b(deviceExtra.getFittings())) {
            Iterator<DeviceExtra.DeviceData> it = deviceExtra.getFittings().iterator();
            while (it.hasNext()) {
                if (str2.equals(it.next().getUniqueId())) {
                    LogUtil.a("PluginDevice_HealthUtils", "isBondedFittingsDevice is true");
                    return true;
                }
            }
        }
        LogUtil.a("PluginDevice_HealthUtils", "isBondedFittingsDevice is false");
        return false;
    }

    public static void c(Context context, String str, String str2) {
        if (context == null || TextUtils.isEmpty(str2)) {
            LogUtil.a("PluginDevice_HealthUtils", "startThirdDeviceBindingPage context or productId is null");
            return;
        }
        elh elhVarD = ResourceManager.c().d(str2);
        if (elhVarD == null) {
            LogUtil.a("PluginDevice_HealthUtils", "startThirdDeviceBindingPage productInfo null");
            a(context, str);
        } else if (str2.equals("9bf158ba-49b0-46aa-9fdf-ed75da1569cf")) {
            b(context, elhVarD);
        } else {
            d(context, elhVarD);
        }
    }

    private static void d(Context context, elh elhVar) {
        if (context == null || elhVar == null) {
            LogUtil.a("PluginDevice_HealthUtils", "startThirdDevicePairGuide context or productInfo is null");
            return;
        }
        Intent intent = new Intent();
        if (elhVar.c().size() > 0) {
            intent.setPackage(dmz.y);
            intent.setClassName(dmz.y, "com.huawei.ui.device.activity.adddevice.PairingGuideActivity");
            intent.putExtra("kind_id", elhVar.m().name());
            if (((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).isHuaweiOrHonourDevice(elhVar.t())) {
                intent.putExtra("pair_guide", "2");
            } else {
                intent.putExtra("pair_guide", "5");
            }
            List<pjc> listC = piq.e().c(elhVar.t());
            if (njy.b(listC) && listC.get(0).g() != null) {
                intent.putExtra(AdShowExtras.DOWNLOAD_SOURCE, egk.c(listC.get(0).g()));
            }
            ArrayList<String> arrayList = new ArrayList<>();
            arrayList.add(elhVar.t());
            intent.putStringArrayListExtra(BasePairManagerJsApi.UUID_LIST, arrayList);
            try {
                context.startActivity(intent);
                return;
            } catch (ActivityNotFoundException e) {
                LogUtil.e("PluginDevice_HealthUtils", "startThirdDevicePairGuide startActivity catch e:", e.getMessage());
                return;
            }
        }
        b(intent, context, elhVar);
    }

    private static void b(Intent intent, Context context, elh elhVar) {
        intent.setClassName(dmz.y, "com.huawei.ui.device.activity.adddevice.OneKeyScanActivity");
        intent.setFlags(67108864);
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(elhVar.t());
        intent.putStringArrayListExtra(BasePairManagerJsApi.UUID_LIST, arrayList);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.e("PluginDevice_HealthUtils", "startThirdDevicePairGuide startActivity catch e:", e.getMessage());
        }
    }

    private static void b(Context context, elh elhVar) {
        if (context == null || elhVar == null) {
            LogUtil.a("PluginDevice_HealthUtils", "startThirdPartyDeviceBindingActivity context or productInfo is null");
            return;
        }
        String strA = elo.a(elhVar.t(), elhVar.l().d());
        List<pjc> listC = piq.e().c(elhVar.t());
        String strB = elhVar.l().b();
        if (njy.b(listC)) {
            strB = listC.get(0).i();
        }
        try {
            context.startActivity(c(elhVar.t(), null, elhVar.m().name(), strA, strB));
        } catch (ActivityNotFoundException e) {
            LogUtil.e("PluginDevice_HealthUtils", "startThirdPartyDeviceBindingActivity startActivity catch e:", e.getMessage());
        }
    }

    private static Intent c(String str, String str2, String str3, String str4, String str5) {
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setAction("SWITCH_PLUGINDEVICE");
        intent.setPackage(dmz.y);
        intent.setClassName(dmz.y, "com.huawei.health.device.ui.DeviceMainActivity");
        intent.putExtra("productId", str);
        intent.putExtra("arg1", "DeviceBindWaitingFragment");
        intent.putExtra("DeviceType", str3);
        intent.putExtra("DeviceName", str4);
        intent.putExtra("DeviceIconPath", str5);
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", str2);
        contentValues.put("productId", str);
        intent.putExtra("commonDeviceInfo", contentValues);
        return intent;
    }

    public static boolean f(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("PluginDevice_HealthUtils", "uuid is invalid");
            return false;
        }
        if (piu.c().e(str) == null) {
            LogUtil.j("PluginDevice_HealthUtils", "not download nfc task");
            return false;
        }
        LogUtil.a("PluginDevice_HealthUtils", "pullTask not null");
        return true;
    }

    private static double[] f() {
        double[] dArr = f33461a;
        return new double[]{UnitUtil.d(dArr[0], 1), UnitUtil.d(dArr[1], 1)};
    }

    private static boolean c(double d2) {
        return b(UnitUtil.d(d2, 1), f());
    }

    public static double a(HiHealthData hiHealthData) {
        double d2 = hiHealthData.getDouble("protein");
        if (Double.compare(d2, 0.0d) <= 0) {
            double d3 = hiHealthData.getDouble("bodyWeight");
            double d4 = hiHealthData.getDouble(BleConstants.MOISTURE_RATE);
            double d5 = hiHealthData.getDouble(BleConstants.BODY_FAT_RATE);
            double d6 = hiHealthData.getDouble(BleConstants.BONE_SALT);
            if (!c(d4)) {
                d4 = hiHealthData.getDouble(BleConstants.MOISTURE);
            }
            int iD = d(hiHealthData);
            try {
                double d7 = UnitUtil.d(d3, iD);
                LogUtil.a("PluginDevice_HealthUtils", "getProteinValue weight: ", Double.valueOf(d7), " hiWaterRate: ", Double.valueOf(d4));
                double d8 = (UnitUtil.d(d7, iD) * d4) / 100.0d;
                LogUtil.a("PluginDevice_HealthUtils", "getProteinValue waterValue: ", Double.valueOf(d8));
                double d9 = UnitUtil.d(d8, iD);
                double d10 = UnitUtil.d((UnitUtil.d(d7, iD) * d5) / 100.0d, iD);
                double d11 = UnitUtil.d(d6, iD);
                if (Double.compare(d7, 0.0d) <= 0 || Double.compare(d10, 0.0d) <= 0 || Double.compare(d9, 0.0d) <= 0) {
                    return 0.0d;
                }
                if (Double.compare(d11, 0.0d) <= 0) {
                    return 0.0d;
                }
                return UnitUtil.d(((d7 - d9) - d10) - d11, iD);
            } catch (NumberFormatException unused) {
                LogUtil.e("PluginDevice_HealthUtils", "getProteinValue NumberFormatException");
            }
        }
        return d2;
    }

    private static int d(HiHealthData hiHealthData) {
        int i = hiHealthData.getInt("trackdata_deviceType");
        LogUtil.a("PluginDevice_HealthUtils", "getFractionDigitByType type = ", Integer.valueOf(i));
        if (!((HonourDeviceConstantsApi) Services.b("PluginDevice", HonourDeviceConstantsApi.class)).isHuaweiWspDataType(i)) {
            return 1;
        }
        double dH = hiHealthData.getDouble("bodyWeight");
        if (UnitUtil.f()) {
            dH = UnitUtil.h(dH);
            LogUtil.a("PluginDevice_HealthUtils", "getFractionDigitByType type showImperialUnit, ", Double.valueOf(dH));
        }
        return Math.round(Math.pow(10.0d, 2.0d) * dH) % 10 == 0 ? 1 : 2;
    }

    public static void b(Activity activity, final String str, boolean z) {
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: etn.5
            @Override // java.lang.Runnable
            public void run() {
                qpx.e(BaseApplication.getContext(), str);
            }
        });
        if (z) {
            activity.finish();
        }
    }

    public static boolean h(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return "87c3421b-5975-49f9-8d6d-013481708278".equals(str) || "59532edb-41d1-4fa0-b587-04a265db8b1f".equals(str);
    }

    public static String c(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            return elo.a(str, str2);
        }
        return "";
    }

    public static String c(String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("PluginDevice_HealthUtils", "getDeviceName productId is null");
            return "";
        }
        elh elhVarD = ResourceManager.c().d(str);
        return elhVarD != null ? elo.a(str, elhVarD.l().d()) : "";
    }

    public static String a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("PluginDevice_HealthUtils", "getDeviceName productId is null");
            return "";
        }
        elh elhVarD = ResourceManager.c().d(str);
        return elhVarD != null ? elo.b(str, elhVarD.l().d(), str2) : "";
    }

    public static void b(List<cmy> list, int i) {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), "ecology_device_module", "ecology_device_bluetooth_name");
        if (TextUtils.isEmpty(strE)) {
            return;
        }
        cmy.a aVar = new cmy.a();
        aVar.b(i);
        aVar.a(strE.toUpperCase(Locale.ENGLISH));
        list.add(aVar.c());
    }

    public static boolean d(long j) {
        return Math.abs(System.currentTimeMillis() - j) < C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS;
    }

    public static void d() {
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(dxc.e);
        arrayList.add(dxc.f32474a);
        arrayList.add(dxc.d);
        ekn.b((ArrayList<String>) arrayList);
    }

    public static int b(float f, float f2, int i) {
        return new BigDecimal(f).setScale(i, 4).compareTo(new BigDecimal(f2).setScale(i, 4));
    }

    public static int b(float f, float f2) {
        return b(f, f2, 1);
    }
}
