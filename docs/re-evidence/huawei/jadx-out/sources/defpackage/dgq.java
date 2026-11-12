package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Rect;
import android.net.Uri;
import android.text.TextUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.huawei.health.MainActivity;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hms.support.api.entity.pay.HwPayConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.device.activity.adddevice.DevicePairGuideSecondActivity;
import com.huawei.ui.device.activity.adddevice.PairingGuideActivity;
import com.huawei.ui.device.activity.notification.NotificationSettingActivity;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import health.compact.a.EzPluginManager;
import health.compact.a.Services;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class dgq {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static DeviceSettingsInteractors f31777a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Rect f31778b;
    private static HashMap<String, String> e = new HashMap<>(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static DeviceCapability f31779c = null;

    public static void e(Uri uri, String str, Context context, Rect rect, boolean z) {
        LogUtil.a("wear_JumpUtil", "smartLifeJump()");
        if (str == null) {
            LogUtil.j("wear_JumpUtil", "smartLifeJump() hiLinkDeviceType is null");
            return;
        }
        if (uri == null) {
            LogUtil.j("wear_JumpUtil", "smartLifeJump() smartLifeInfo is null");
            return;
        }
        if (context == null) {
            LogUtil.j("wear_JumpUtil", "smartLifeJump() context is null");
            return;
        }
        if (rect != null) {
            f31778b = rect;
        }
        try {
            String queryParameter = uri.getQueryParameter("SubMAC");
            String queryParameter2 = uri.getQueryParameter("ProductID");
            LogUtil.a("wear_JumpUtil", "smartLifeJump() smartLifeInfo result is ", queryParameter);
            DeviceInfo deviceInfoE = e(context, queryParameter, queryParameter2);
            String queryParameter3 = uri.getQueryParameter("Opcode");
            if (!TextUtils.isEmpty(queryParameter3) && queryParameter3.equals("Delete")) {
                LogUtil.a("wear_JumpUtil", "smartLifeJump() operate is jump remove device");
                b(context, deviceInfoE, z);
                return;
            }
            if (!TextUtils.isEmpty(queryParameter3) && queryParameter3.equals("Add")) {
                LogUtil.a("wear_JumpUtil", "smartLifeJump() operate is jump bind device");
                if (rdp.d(context)) {
                    a(context, queryParameter2, str);
                    return;
                } else {
                    c(context, queryParameter2, str);
                    return;
                }
            }
            if (!TextUtils.isEmpty(queryParameter3) && queryParameter3.equals("MessageNotification")) {
                LogUtil.a("wear_JumpUtil", "smartLifeJump() operate is jump MessageNotification");
                d(context);
            } else {
                LogUtil.a("wear_JumpUtil", "smartLifeJump() operate is jump info");
                d(context, deviceInfoE, z);
            }
        } catch (UnsupportedOperationException unused) {
            LogUtil.e("wear_JumpUtil", "smartLifeJump error is UnsupportedOperationException");
        }
    }

    private static void a(Context context, String str, String str2) {
        if (coq.d(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getDeviceList())) {
            b(context);
            return;
        }
        LogUtil.a("wear_JumpUtil", "bindDevice smartProductId is ", str, " hiLinkDeviceType is ", str2);
        if (a(str) != null) {
            LogUtil.a("wear_JumpUtil", "bindDevice localDevice name is ", a(str).c());
            b(context, str);
            return;
        }
        edl edlVarD = d(str);
        if (edlVarD == null) {
            LogUtil.a("wear_JumpUtil", "bindDevice ezPluginInfo is null");
            b(context);
        } else {
            b(context, new meh(edlVarD.i().ah(), qtk.a(edlVarD)));
        }
    }

    private static void b(Context context) {
        try {
            Intent intent = new Intent();
            intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.ui.device.activity.adddevice.AllDeviceListActivity");
            intent.setFlags(67108864);
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("wear_JumpUtil", "ActivityNotFoundException e:", e2.getMessage());
        }
    }

    private static void b(Context context, String str) {
        meh mehVarA = a(str);
        if (mehVarA == null) {
            LogUtil.j("wear_JumpUtil", "intentPairGuideLocale deviceInfo is null");
            return;
        }
        if (mehVarA.a() == 10) {
            String strC = mehVarA.c();
            ArrayList arrayList = new ArrayList(16);
            if (TextUtils.equals(strC, "PORSCHE DESIGN")) {
                arrayList.add("85acddd2-2a69-462b-9766-61602023199b");
                e.put("85acddd2-2a69-462b-9766-61602023199b", "3");
            } else {
                arrayList.add("e5ae9c59-0db8-4624-9862-09725412fff2");
                e.put("e5ae9c59-0db8-4624-9862-09725412fff2", "3");
            }
            try {
                Intent intent = new Intent(context, (Class<?>) DevicePairGuideSecondActivity.class);
                intent.putExtra(BasePairManagerJsApi.UUID_LIST, arrayList);
                intent.putExtra("kind_id", "wear_watch");
                intent.putExtra("pair_guide_array", e);
                context.startActivity(intent);
                return;
            } catch (ActivityNotFoundException e2) {
                LogUtil.e("wear_JumpUtil", "ActivityNotFoundException e:", e2.getMessage());
                return;
            }
        }
        ArrayList<String> arrayList2 = new ArrayList<>(16);
        arrayList2.add(lvi.c(mehVarA.a()));
        if (coq.d(arrayList2)) {
            LogUtil.j("wear_JumpUtil", "uuidList is empty");
            return;
        }
        try {
            Intent intent2 = new Intent(context, (Class<?>) PairingGuideActivity.class);
            intent2.putStringArrayListExtra(BasePairManagerJsApi.UUID_LIST, arrayList2);
            intent2.putExtra("kind_id", c(str));
            intent2.putExtra("pair_guide", "2");
            context.startActivity(intent2);
        } catch (ActivityNotFoundException e3) {
            LogUtil.e("wear_JumpUtil", "ActivityNotFoundException e:", e3.getMessage());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x0046  */
    private static String c(String str) {
        byte b2;
        str.hashCode();
        switch (str) {
            case "0050":
                b2 = 0;
                break;
            case "0051":
                b2 = 1;
                break;
            case "0054":
                b2 = 2;
                break;
            case "0056":
                b2 = 3;
                break;
            case "004Z":
                b2 = 4;
                break;
            default:
                b2 = -1;
                break;
        }
        if (b2 == 0 || b2 == 1 || b2 == 2 || b2 == 3 || b2 == 4) {
            return "wear_band";
        }
        return "wear_watch";
    }

    private static void b(Context context, meh mehVar) {
        String str;
        ArrayList<String> arrayList = new ArrayList<>(16);
        String strD = lvi.d(mehVar.a());
        arrayList.add(strD);
        if (coq.d(arrayList)) {
            LogUtil.j("wear_JumpUtil", "uuidList is empty");
            b(context);
            return;
        }
        edn ednVarA = lvi.a(strD);
        if (ednVarA == null) {
            LogUtil.j("wear_JumpUtil", "deviceInfoNew is null");
            b(context);
            return;
        }
        if (ednVarA.f() != 1) {
            str = "wear_watch";
        } else {
            str = "wear_band";
        }
        try {
            Intent intent = new Intent(context, (Class<?>) PairingGuideActivity.class);
            intent.putStringArrayListExtra(BasePairManagerJsApi.UUID_LIST, arrayList);
            intent.putExtra("kind_id", str);
            intent.putExtra("pair_guide", "2");
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("wear_JumpUtil", "ActivityNotFoundException e:", e2.getMessage());
        }
    }

    private static DeviceInfo e(Context context, String str, String str2) {
        int iA;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("wear_JumpUtil", "getDeviceInfoBySubMac() subMac or smartProductId is isEmpty");
            return null;
        }
        LogUtil.a("wear_JumpUtil", "getDeviceInfoBySubMac smartProductId is ", str2);
        List<DeviceInfo> listB = DeviceSettingsInteractors.e(context).b(str);
        if (listB == null || listB.isEmpty()) {
            LogUtil.j("wear_JumpUtil", "getDeviceInfoBySubMac() resultList is null or empty");
            return null;
        }
        if (listB.size() == 1) {
            LogUtil.a("wear_JumpUtil", "getDeviceInfoBySubMac Matching subMac device only one");
            return listB.get(0);
        }
        if (a(str2) != null) {
            LogUtil.a("wear_JumpUtil", "getDeviceInfoBySubMac localDevice name is ", a(str2).c());
            iA = a(str2).a();
        } else {
            edl edlVarD = d(str2);
            if (edlVarD != null) {
                LogUtil.a("wear_JumpUtil", "getDeviceInfoBySubMac() ezPluginInfo not null");
                iA = new meh(edlVarD.i().ah(), qtk.a(edlVarD)).a();
            } else {
                iA = 0;
            }
        }
        LogUtil.a("wear_JumpUtil", "getDeviceInfoBySubMac() deviceType is ", Integer.valueOf(iA));
        for (DeviceInfo deviceInfo : listB) {
            if (deviceInfo.getProductType() == iA) {
                LogUtil.a("wear_JumpUtil", "getDeviceInfoBySubMac() deviceType Matching");
                return deviceInfo;
            }
        }
        return listB.get(0);
    }

    private static void d(Context context) {
        String deviceIdentify;
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "wear_JumpUtil");
        List<DeviceInfo> deviceList2 = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_AW70_DEVICES, null, "wear_JumpUtil");
        boolean z = false;
        if (coq.d(deviceList)) {
            deviceList = deviceList2;
        } else if (!eel.d(deviceList.get(0).getProductType()) && !coq.d(deviceList2)) {
            deviceList.addAll(deviceList2);
        }
        if (coq.d(deviceList)) {
            LogUtil.j("wear_JumpUtil", "getConnectDevice() no device connected");
            a(context);
            return;
        }
        f31777a = DeviceSettingsInteractors.e(context);
        Iterator<DeviceInfo> it = deviceList.iterator();
        while (true) {
            if (!it.hasNext()) {
                deviceIdentify = "";
                break;
            }
            DeviceInfo next = it.next();
            DeviceCapability deviceCapabilityE = f31777a.e(next.getDeviceIdentify());
            f31779c = deviceCapabilityE;
            if (deviceCapabilityE != null && deviceCapabilityE.isMessageAlert()) {
                deviceIdentify = next.getDeviceIdentify();
                if (next.getPowerSaveModel() != 1) {
                    break;
                }
                z = true;
                break;
            }
            LogUtil.j("wear_JumpUtil", "getConnectDevice() no DeviceCapability is null or isMessageAlert is false");
        }
        if (TextUtils.isEmpty(deviceIdentify) || z) {
            LogUtil.a("wear_JumpUtil", "getConnectDevice() deviceMac is empty");
            a(context);
        } else {
            LogUtil.a("wear_JumpUtil", "getConnectDevice() deviceMac not empty");
            a(context, deviceIdentify);
        }
    }

    private static void b(Context context, DeviceInfo deviceInfo, boolean z) {
        LogUtil.a("wear_JumpUtil", "jumpDeleteWearDevice enter");
        if (deviceInfo == null) {
            LogUtil.j("wear_JumpUtil", "jumpDeleteWearDevic deviceInfo is null");
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setClassName(context, "com.huawei.ui.homewear21.home.WearHomeActivity");
            intent.setClassName(context, "com.huawei.ui.homewear21.home.WearHomeActivity");
            intent.putExtra("device_id", deviceInfo.getDeviceIdentify());
            intent.putExtra("FROM_SMART_LIFE", true);
            intent.putExtra("Delete", true);
            intent.setSourceBounds(f31778b);
            intent.putExtra("isClick", z);
            intent.setFlags(268435456);
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("wear_JumpUtil", "ActivityNotFoundException e:", e2.getMessage());
        }
    }

    private static void c(Context context, String str, String str2) {
        LogUtil.a("wear_JumpUtil", "bindWearDevice smartProductId is ", str, " hiLinkDeviceType is ", str2);
        if (a(str) != null) {
            LogUtil.a("wear_JumpUtil", "bindWearDevice localDevice name is ", a(str).c());
            d(context, a(str));
            return;
        }
        edl edlVarD = d(str);
        if (edlVarD == null) {
            LogUtil.a("wear_JumpUtil", "bindWearDevice ezPluginInfo is null");
            c(context, str2);
        } else {
            d(context, new meh(edlVarD.i().ah(), qtk.a(edlVarD)));
        }
    }

    public static void c(Context context, String str) {
        try {
            Intent intent = new Intent();
            intent.setClassName(context, "com.huawei.ui.device.activity.adddevice.AddDeviceChildActivity");
            if (str.equals("06E")) {
                intent.putExtra(TtmlNode.TAG_STYLE, 2);
            } else if (!str.equals("06D")) {
                LogUtil.j("wear_JumpUtil", "startBindDeviceList other type");
            } else {
                intent.putExtra(TtmlNode.TAG_STYLE, 1);
            }
            intent.putExtra("isHeartRateDevice", 0);
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("wear_JumpUtil", "ActivityNotFoundException e:", e2.getMessage());
        }
    }

    private static void d(Context context, DeviceInfo deviceInfo, boolean z) {
        LogUtil.a("wear_JumpUtil", "smartLifeHomeJump enter");
        if (deviceInfo == null) {
            LogUtil.j("wear_JumpUtil", "smartLifeHomeJump deviceInfo is null");
            a(context);
            return;
        }
        if (deviceInfo.getDeviceConnectState() == 2) {
            LogUtil.a("wear_JumpUtil", "smartLifeHomeJump() jump to deviceInfo");
            try {
                Intent intent = new Intent();
                intent.setClassName(context, "com.huawei.ui.homewear21.home.WearHomeActivity");
                intent.putExtra("device_id", deviceInfo.getDeviceIdentify());
                intent.putExtra("FROM_SMART_LIFE", true);
                intent.setSourceBounds(f31778b);
                intent.putExtra("isClick", z);
                intent.setFlags(32768);
                context.startActivity(intent);
                if (context instanceof Activity) {
                    ((Activity) context).overridePendingTransition(0, 0);
                    return;
                }
                return;
            } catch (ActivityNotFoundException e2) {
                LogUtil.e("wear_JumpUtil", "ActivityNotFoundException e:", e2.getMessage());
                return;
            }
        }
        a(context, deviceInfo, z);
    }

    public static void a(Context context) {
        if (context == null) {
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setClassName(BaseApplication.getAppPackage(), MainActivity.class.getName());
            intent.setFlags(67108864);
            intent.putExtra(Constants.HOME_TAB_NAME, Constants.HOME_TAB_DEVICE);
            intent.putExtra("SHORTCUT", "SC_DEVICE");
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("wear_JumpUtil", "ActivityNotFoundException e：", e2.getMessage());
        }
    }

    private static void a(Context context, DeviceInfo deviceInfo, boolean z) {
        LogUtil.a("wear_JumpUtil", "smartLifeJump() jumpToDeviceConnect");
        try {
            Intent intent = new Intent();
            intent.setClassName(context, "com.huawei.ui.homehealth.devicemanagercard.DeviceManagerWearNoConnect");
            intent.putExtra("device_name", deviceInfo.getDeviceName());
            intent.putExtra("device_identify", deviceInfo.getDeviceIdentify());
            intent.putExtra("device_picID", lvi.a(deviceInfo.getProductType()).y());
            intent.putExtra("FROM_SMART_LIFE", true);
            intent.setSourceBounds(f31778b);
            intent.putExtra("isClick", z);
            intent.putExtra(DeviceCategoryFragment.DEVICE_TYPE, deviceInfo.getProductType());
            intent.setFlags(32768);
            context.startActivity(intent);
            if (context instanceof Activity) {
                ((Activity) context).overridePendingTransition(0, 0);
            }
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("wear_JumpUtil", "ActivityNotFoundException e:", e2.getMessage());
        }
    }

    private static void d(Context context, meh mehVar) {
        String strD;
        if (mehVar == null) {
            LogUtil.j("wear_JumpUtil", "device productName is null");
            return;
        }
        if (mehVar.a() == 10) {
            strD = mehVar.c();
        } else {
            strD = rcv.a(BaseApplication.getContext()).d(mehVar.a());
        }
        LogUtil.a("wear_JumpUtil", "device productName is ", strD);
        try {
            Intent intent = new Intent();
            intent.setPackage(context.getPackageName());
            intent.setClassName(context, "com.huawei.ui.device.activity.adddevice.AddDeviceIntroActivity");
            intent.putExtra(DeviceCategoryFragment.DEVICE_TYPE, mehVar.a());
            intent.putExtra("isFromWear", true);
            LogUtil.a("wear_JumpUtil", HwPayConstant.KEY_PRODUCTNAME, strD);
            if (strD != null && strD.equals("PORSCHE DESIGN")) {
                intent.putExtra("isPorc", true);
                intent.putExtra("IS_PROC", true);
            }
            intent.putExtra("dname", strD);
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("wear_JumpUtil", "ActivityNotFoundException e:", e2.getMessage());
        }
    }

    private static meh a(String str) {
        HashMap map = new HashMap(16);
        map.put("004Q", new meh("HUAWEI WATCH 2", 10));
        map.put("004U", new meh("PORSCHE DESIGN", 10));
        map.put("004W", new meh("荣耀手表S1", 8));
        map.put("0050", new meh("华为手环 B3青春版", 14));
        map.put("0051", new meh("华为运动手环", 15));
        map.put("004Z", new meh("华为手环", 7));
        map.put("0054", new meh("荣耀手环 3", 13));
        map.put("0056", new meh("荣耀畅玩手环 A2", 12));
        if (map.containsKey(str)) {
            return (meh) map.get(str);
        }
        return null;
    }

    public static edl d(String str) {
        List<phz> listC = EzPluginManager.b().c();
        if (listC == null || listC.isEmpty()) {
            LogUtil.a("wear_JumpUtil", "bindWearDevice hiLinkDeviceList is null or hiLinkDeviceList is empty");
            return b(str);
        }
        Iterator<phz> it = listC.iterator();
        while (it.hasNext()) {
            String strA = it.next().a();
            if (!((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(strA)) {
                LogUtil.j("wear_JumpUtil", "bindWearDevice ezPluginInfo isPluginAvaiable false");
            } else if (c(strA, str) != null) {
                LogUtil.a("wear_JumpUtil", "bindWearDevice ezPluginInfo not null");
                break;
            }
        }
        return b(str);
    }

    private static edl b(String str) {
        List<edx> indexList = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getIndexList();
        edl edlVarC = null;
        if (indexList == null || indexList.isEmpty()) {
            LogUtil.a("wear_JumpUtil", "descriptionInfo hiLinkDeviceList is null or hiLinkDeviceList is empty");
            return null;
        }
        Iterator<edx> it = indexList.iterator();
        while (it.hasNext()) {
            String strB = it.next().b();
            if (!((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(strB)) {
                LogUtil.j("wear_JumpUtil", "bindWearDevice descriptionInfo isPluginAvaiable false");
            } else {
                edlVarC = c(strB, str);
                if (edlVarC != null) {
                    LogUtil.a("wear_JumpUtil", "bindWearDevice descriptionInfo not null");
                    break;
                }
            }
        }
        return edlVarC;
    }

    private static edl c(String str, String str2) {
        LogUtil.a("wear_JumpUtil", "gePluginInfo product is ", str, " productId is ", str2);
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(str);
        if (pluginInfoByUuid == null) {
            LogUtil.j("wear_JumpUtil", "gePluginInfo pluginInfo is null");
            return null;
        }
        edz edzVarI = pluginInfoByUuid.i();
        if (edzVarI == null) {
            LogUtil.j("wear_JumpUtil", "gePluginInfo pluginInfoForWear is empty");
            return null;
        }
        if (TextUtils.isEmpty(edzVarI.e())) {
            LogUtil.j("wear_JumpUtil", "gePluginInfo AiTipsProduct is empty");
            return null;
        }
        LogUtil.a("wear_JumpUtil", "gePluginInfo AiTipsProduct is", edzVarI.e());
        try {
            if (new JSONObject(edzVarI.e()).has("ai_tips_product_" + str2)) {
                return pluginInfoByUuid;
            }
            return null;
        } catch (JSONException unused) {
            LogUtil.e("wear_JumpUtil", "getPluginInfo JSONException");
        }
    }

    private static void a(Context context, String str) {
        try {
            Intent intent = new Intent(context, (Class<?>) NotificationSettingActivity.class);
            intent.putExtra("device_id", str);
            context.startActivity(intent);
        } catch (ActivityNotFoundException e2) {
            LogUtil.e("wear_JumpUtil", "ActivityNotFoundException e:", e2.getMessage());
        }
    }
}
