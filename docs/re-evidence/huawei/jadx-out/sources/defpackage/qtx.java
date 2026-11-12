package defpackage;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothManager;
import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import com.huawei.arkuidevice.DeviceBridgeApi;
import com.huawei.devicepair.model.StartPairOption;
import com.huawei.devicesdk.entity.ScanMode;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.ui.privacy.HonorDeviceShowPrivacyActivity;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.connectivity.ScanFilter;
import com.huawei.health.ecologydevice.manager.ResourceManager;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwdevice.outofprocess.util.NotificationContentProviderUtil;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.AdShowExtras;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.secure.android.common.SafeIntent;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.CustomViewDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.adddevice.DevicePairGuideSecondActivity;
import com.huawei.ui.device.activity.adddevice.OneKeyScanActivity;
import com.huawei.ui.device.activity.pairing.DevicePairGuideActivity;
import com.huawei.ui.device.interactors.CompatibilityInteractor;
import com.huawei.ui.device.utlis.BluetoothPermisionUtils;
import health.compact.a.CloudUtils;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import health.compact.a.util.LogUtil;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes16.dex */
public class qtx {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List<String> f46831a = new ArrayList<String>() { // from class: qtx.1
        {
            add("wear_watch");
            add("wear_band");
            add("SMART_HEADPHONES");
            add("HDK_HEART_RATE");
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46833c;
    private String d;
    private int e;
    private CustomViewDialog f;
    private boolean g = false;
    private rcv h;
    private String i;
    private boolean j;
    private String k;
    private rba l;
    private String o;

    private boolean c() {
        return this.j;
    }

    public void a(boolean z) {
        this.j = z;
    }

    public void e(int i, String str) {
        this.e = i;
        this.f46833c = str;
    }

    public void e(boolean z) {
        this.g = z;
    }

    public void b(String str) {
        this.d = str;
    }

    public ArrayList<rbe> d(Map<rbe, Integer> map) {
        ArrayList<rbe> arrayList = new ArrayList<>(16);
        if (map != null && !map.isEmpty()) {
            ArrayList<Map.Entry> arrayList2 = new ArrayList(map.entrySet());
            Collections.sort(arrayList2, new Comparator<Map.Entry<rbe, Integer>>() { // from class: qtx.6
                @Override // java.util.Comparator
                /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
                public int compare(Map.Entry<rbe, Integer> entry, Map.Entry<rbe, Integer> entry2) {
                    if (entry == null || entry2 == null || entry.getValue() == null || entry2.getValue() == null) {
                        return 0;
                    }
                    return entry.getValue().intValue() - entry2.getValue().intValue();
                }
            });
            for (Map.Entry entry : arrayList2) {
                if (entry.getKey() != null && !TextUtils.isEmpty(((rbe) entry.getKey()).c())) {
                    arrayList.add((rbe) entry.getKey());
                    LogUtil.a("DeviceEntranceUtil", "sortItem itemList name:", ((rbe) entry.getKey()).c(), " rssi ", Integer.valueOf(((rbe) entry.getKey()).n()));
                }
            }
            LogUtil.a("DeviceEntranceUtil", "sortItem itemList num:", Integer.valueOf(arrayList.size()));
        }
        return arrayList;
    }

    public void d(final ScanMode scanMode, final List<cmy> list, final OneKeyScanActivity.d dVar) {
        ReleaseLogUtil.d("R_DeviceEntranceUtil", "scanDevice:", Integer.valueOf(list.size()));
        if (dVar == null) {
            LogUtil.d("DeviceEntranceUtil", "scanDevice handler == null");
            return;
        }
        final DeviceBridgeApi deviceBridgeApi = (DeviceBridgeApi) Services.d("DeviceBridgeApiManager", DeviceBridgeApi.class);
        if (deviceBridgeApi == null) {
            LogUtil.d("DeviceEntranceUtil", "scanDevice deviceBridgeApi == null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: qtz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f46863c.a(deviceBridgeApi, scanMode, list, dVar);
                }
            });
        }
    }

    /* synthetic */ void a(DeviceBridgeApi deviceBridgeApi, ScanMode scanMode, List list, final OneKeyScanActivity.d dVar) {
        LogUtil.a("DeviceEntranceUtil", "scanDevice startDiscoveringByNative");
        deviceBridgeApi.startDiscoveringByNative(scanMode, list, new IBaseResponseCallback() { // from class: qtx.7
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                if (obj instanceof rbe) {
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 1;
                    messageObtain.obj = obj;
                    dVar.sendMessage(messageObtain);
                    return;
                }
                if (i == 21) {
                    Message messageObtain2 = Message.obtain();
                    messageObtain2.what = 2;
                    dVar.removeMessages(3);
                    dVar.sendMessage(messageObtain2);
                    return;
                }
                if (i == 22) {
                    Message messageObtain3 = Message.obtain();
                    messageObtain3.what = 3;
                    dVar.removeMessages(3);
                    dVar.sendMessage(messageObtain3);
                }
            }
        });
    }

    public void d(Context context, rbe rbeVar, boolean z, boolean z2) {
        if (context == null || rbeVar == null) {
            return;
        }
        List<String> listL = rbeVar.l();
        if (njy.e(listL)) {
            LogUtil.d("DeviceEntranceUtil", "uuidList is null");
            return;
        }
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setAction("SWITCH_PLUGINDEVICE");
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setClassName(context, "com.huawei.health.device.ui.DeviceMainActivity");
        intent.putExtra("is_go_rope_jump", z2);
        if (listL instanceof ArrayList) {
            intent.putStringArrayListExtra(BasePairManagerJsApi.UUID_LIST, (ArrayList) listL);
        }
        intent.putExtra("KEY_INTENT_COURSE_ENTRANCE", this.e);
        intent.putExtra("KEY_INTENT_EQUIPMENT_TYPE", this.f46833c);
        intent.putExtra("DeviceType", rbeVar.i());
        intent.putExtra("DeviceName", rbeVar.c());
        intent.putExtra("DeviceIconPath", rbeVar.d());
        intent.putExtra("arg1", "DeviceBindWaitingFragment");
        intent.putExtra(AdShowExtras.DOWNLOAD_SOURCE, eek.d(rbeVar.g()));
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", rbeVar.j());
        if (listL.size() > 1) {
            contentValues.put("productId", "");
        } else {
            contentValues.put("productId", listL.get(0));
        }
        intent.putExtra("commonDeviceInfo", contentValues);
        if ((context instanceof Activity) && z) {
            ((Activity) context).startActivityForResult(intent, 4);
            return;
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.c("DeviceEntranceUtil", "ActivityNotFoundException e:", e.getMessage());
        }
    }

    public void a(Context context, rbe rbeVar, boolean z, boolean z2) {
        Intent intentE;
        if (context == null || rbeVar == null) {
            return;
        }
        if (rbeVar.i().equals("HDK_WEIGHT")) {
            intentE = e(context, rbeVar);
        } else {
            Intent intentC = c(rbeVar.l().get(0), rbeVar.j(), rbeVar.i(), rbeVar.m(), rbeVar.d());
            intentC.putExtra(AdShowExtras.DOWNLOAD_SOURCE, eek.d(rbeVar.g()));
            intentC.putExtra("is_go_rope_jump", z2);
            intentE = intentC;
        }
        if ((context instanceof Activity) && z) {
            ((Activity) context).startActivityForResult(intentE, 4);
            return;
        }
        try {
            context.startActivity(intentE);
        } catch (ActivityNotFoundException e) {
            LogUtil.c("DeviceEntranceUtil", "ActivityNotFoundException e:", e.getMessage());
        }
    }

    public void d(Context context, rbe rbeVar, String str) {
        if (rbeVar == null) {
            LogUtil.d("DeviceEntranceUtil", "showPrivacyActivity itemData is null");
            return;
        }
        Intent intent = new Intent(BaseApplication.getContext(), (Class<?>) HonorDeviceShowPrivacyActivity.class);
        Map<String, String> mapF = rbeVar.f();
        if (mapF == null) {
            this.o = rbeVar.d();
        } else {
            this.o = mapF.get(str);
        }
        String str2 = this.o;
        if (str2 != null) {
            LogUtil.a("DeviceEntranceUtil", "showPrivacyActivity mPrivacyImagePath not null and path = ", str2);
            intent.putExtra("image_path", this.o);
        } else {
            LogUtil.d("DeviceEntranceUtil", "showPrivacyActivity mPrivacyImagePath is null");
        }
        if (context instanceof Activity) {
            ((Activity) context).startActivityForResult(intent, 1001);
            return;
        }
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.c("DeviceEntranceUtil", "ActivityNotFoundException e:", e.getMessage());
        }
    }

    public void e(Context context, rbe rbeVar, List<String> list, BroadcastReceiver broadcastReceiver, boolean z) {
        String strC = c(rbeVar);
        if (CompileParameterUtil.c("IS_LUPIN_SUPPORT_PRIVACY", false) && "25c6df38-ca23-11e9-a32f-2a2ae2dbcce4".equals(strC)) {
            boolean zC = SharedPreferenceManager.c(BaseApplication.getContext(), LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
            if (etn.d(BaseApplication.getContext()) && !zC) {
                d(context, rbeVar, strC);
                return;
            } else {
                a(context, rbeVar, list, broadcastReceiver, z);
                return;
            }
        }
        a(context, rbeVar, list, broadcastReceiver, z);
    }

    private void a(Context context, rbe rbeVar, List<String> list, BroadcastReceiver broadcastReceiver, boolean z) {
        if (!njy.e(list)) {
            LogUtil.a("DeviceEntranceUtil", "thirdPartyAndPrivacy openThirdParty uuidlist no null");
            a(context, rbeVar, true, z);
        } else {
            LogUtil.a("DeviceEntranceUtil", "thirdPartyAndPrivacy openThirdParty uuidlist null");
            d(context, rbeVar, false, z);
        }
        c(broadcastReceiver);
    }

    public void c(BroadcastReceiver broadcastReceiver) {
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.huawei.health.action.PAIR_DEVICE_SUCCESS");
            LocalBroadcastManager.getInstance().registerReceiver(broadcastReceiver, intentFilter);
        } catch (IllegalArgumentException unused) {
            LogUtil.c("DeviceEntranceUtil", "resisterReceiver, broadcastReceiver is error");
        }
    }

    public void a(Context context, rbe rbeVar, List<String> list, Intent intent, BroadcastReceiver broadcastReceiver) {
        if (intent == null) {
            LogUtil.d("DeviceEntranceUtil", "data is null");
            return;
        }
        int intExtra = intent.getIntExtra("honor_show_privacy_key", 0);
        LogUtil.a("DeviceEntranceUtil", "privacy privacyStatus", Integer.valueOf(intExtra));
        if (intExtra == 1) {
            LogUtil.a("DeviceEntranceUtil", "user agree privacy");
            if (!njy.e(list)) {
                a(context, rbeVar, true, false);
            } else {
                d(context, rbeVar, false, false);
            }
            c(broadcastReceiver);
            return;
        }
        LogUtil.d("DeviceEntranceUtil", "user do not agree privacy");
    }

    public void c(Context context, rba rbaVar) {
        if (context == null || rbaVar == null) {
            return;
        }
        try {
            Intent intentC = c(rbaVar.r().get(0), (String) null, rbaVar.h(), rbaVar.g(), rbaVar.f());
            intentC.putExtra(AdShowExtras.DOWNLOAD_SOURCE, eek.d(rbaVar.j()));
            context.startActivity(intentC);
        } catch (ActivityNotFoundException e) {
            LogUtil.c("DeviceEntranceUtil", "ActivityNotFoundException e:", e.getMessage());
        }
    }

    public void a(Context context, elh elhVar) {
        if (context == null || elhVar == null) {
            return;
        }
        if (!b(elhVar)) {
            LogUtil.d("DeviceEntranceUtil", "startThirdPartyH5PairGuide device resource can not use");
            return;
        }
        boolean zEquals = "true".equals(ioi.d().c(402));
        if ("H5".equals(elhVar.e()) && zEquals) {
            d(context, elhVar.t());
        } else if ("H5".equals(elhVar.e()) && !zEquals) {
            a(context, elhVar.t());
        } else {
            LogUtil.d("DeviceEntranceUtil", "startThirdPartyH5PairGuide else");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r0 >= r2) goto L15;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private boolean b(elh elhVar) {
        int iE = CommonUtil.e(BaseApplication.getContext());
        String str = "DeviceEntranceUtil";
        LogUtil.a("DeviceEntranceUtil", "isDeviceResourceCanUsing currentVersion =", Integer.valueOf(iE));
        String strA = elhVar.a();
        String strB = elhVar.b();
        try {
            if (!CloudUtils.d()) {
                if (TextUtils.isEmpty(strA) || iE >= Long.parseLong(strA)) {
                    str = str;
                    return true;
                }
            } else {
                if (!TextUtils.isEmpty(strB)) {
                    long j = iE;
                    long j2 = Long.parseLong(strB);
                    str = j2;
                }
                return true;
            }
            str = str;
            return false;
        } catch (NumberFormatException unused) {
            LogUtil.c(str, "isDeviceResourceCanUsing NumberFormatException");
            return false;
        }
    }

    private void a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.c("DeviceEntranceUtil", "startHealthKitActivity productId is null");
            return;
        }
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        intent.setClassName(context, "com.huawei.ui.thirdpartservice.activity.healthkit.HealthKitActivity");
        intent.putExtra("productId", str);
        intent.putExtra("device_list_to_health_kit_authorization", true);
        elh elhVarD = ResourceManager.c().d(str);
        ContentValues contentValues = new ContentValues();
        if (elhVarD == null) {
            LogUtil.c("DeviceEntranceUtil", "startHealthKitActivity deviceProductInfo is null");
            return;
        }
        contentValues.put("name", elhVarD.l().d());
        contentValues.put("deviceType", elhVarD.m().name());
        intent.putExtra("commonDeviceInfo", contentValues);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.c("DeviceEntranceUtil", "ActivityNotFoundException e:", e.getMessage());
        }
    }

    private void d(Context context, String str) {
        Intent intent = new Intent();
        intent.setPackage(context.getPackageName());
        intent.setClassName(context, "com.huawei.operation.activity.WebViewActivity");
        intent.putExtra("url", elg.e().e(str) + "#/type=4/uuidpre=" + etn.d(str));
        intent.putExtra("productId", str);
        elh elhVarD = ResourceManager.c().d(str);
        ContentValues contentValues = new ContentValues();
        if (elhVarD == null) {
            return;
        }
        contentValues.put("name", elo.a(str, elhVarD.l().d()));
        contentValues.put("deviceType", elhVarD.m().name());
        intent.putExtra("commonDeviceInfo", contentValues);
        LogUtil.a("DeviceEntranceUtil", "sannuo_type=4_device list page to H5 interface,Productid=", str);
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException e) {
            LogUtil.c("DeviceEntranceUtil", "ActivityNotFoundException e:", e.getMessage());
        }
    }

    private Intent e(Context context, rbe rbeVar) {
        String strC;
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setAction("SWITCH_PLUGINDEVICE");
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setClassName(context, "com.huawei.health.device.ui.DeviceMainActivity");
        List<String> listL = rbeVar.l();
        if (enq.d().c()) {
            strC = rbeVar.l().get(0);
        } else {
            if (!njy.e(listL)) {
                if (listL.size() == 1) {
                    strC = listL.get(0);
                } else if (listL.size() >= 2) {
                    strC = c(rbeVar);
                } else {
                    LogUtil.d("DeviceEntranceUtil", "more devices");
                }
            } else {
                LogUtil.d("DeviceEntranceUtil", "uuidLis is null");
            }
            strC = "";
        }
        intent.putExtra("productId", strC);
        intent.putExtra("DeviceType", rbeVar.i());
        intent.putExtra("is_invalidation", c());
        intent.putExtra("DeviceName", rbeVar.c());
        intent.putExtra("DeviceIconPath", rbeVar.d());
        intent.putExtra("arg1", "DeviceBindWaitingFragment");
        intent.putExtra(AdShowExtras.DOWNLOAD_SOURCE, eek.d(rbeVar.g()));
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", rbeVar.j());
        contentValues.put("productId", strC);
        intent.putExtra("commonDeviceInfo", contentValues);
        return intent;
    }

    private Intent c(String str, String str2, String str3, String str4, String str5) {
        Intent intent = new Intent();
        intent.setFlags(268435456);
        intent.setAction("SWITCH_PLUGINDEVICE");
        intent.setPackage(BaseApplication.getAppPackage());
        intent.setClassName(BaseApplication.getContext(), "com.huawei.health.device.ui.DeviceMainActivity");
        intent.putExtra("productId", str);
        intent.putExtra("KEY_INTENT_COURSE_ENTRANCE", this.e);
        intent.putExtra("KEY_INTENT_EQUIPMENT_TYPE", this.f46833c);
        intent.putExtra("fittings_host_sn", this.d);
        intent.putExtra("arg1", "DeviceBindWaitingFragment");
        intent.putExtra("DeviceType", str3);
        intent.putExtra("DeviceName", str4);
        intent.putExtra("DeviceIconPath", str5);
        intent.putExtra("isJumpFromFittings", this.g);
        ContentValues contentValues = new ContentValues();
        contentValues.put("uniqueId", str2);
        contentValues.put("productId", str);
        intent.putExtra("commonDeviceInfo", contentValues);
        return intent;
    }

    public String c(rbe rbeVar) {
        String str = "";
        if (rbeVar == null) {
            LogUtil.a("DeviceEntranceUtil", "getProductId itemData is null");
            return "";
        }
        List<String> listL = rbeVar.l();
        String strC = rbeVar.c();
        String strC2 = c(strC);
        if (!TextUtils.isEmpty(strC2)) {
            return strC2;
        }
        LogUtil.d("DeviceEntranceUtil", "ScanDeviceItem deviceName:", strC);
        cpl.a(rbeVar.j());
        Iterator<String> it = listL.iterator();
        while (true) {
            boolean zB = false;
            if (!it.hasNext()) {
                break;
            }
            String next = it.next();
            LogUtil.d("DeviceEntranceUtil", "uuidList uuid:", next);
            elh elhVarD = ResourceManager.c().d(next);
            if (elhVarD == null) {
                LogUtil.d("DeviceEntranceUtil", "productInfo is null");
            } else {
                ScanFilter scanFilterX = elhVarD.x();
                if (scanFilterX == null) {
                    LogUtil.d("DeviceEntranceUtil", "getProductId scanFilter is null");
                } else {
                    zB = scanFilterX.b(strC);
                }
                LogUtil.d("DeviceEntranceUtil", "getProductId deviceNameMatched:", Boolean.valueOf(zB));
                if (zB) {
                    LogUtil.d("DeviceEntranceUtil", "getProductId productId:", next);
                    str = next;
                }
            }
        }
        if (!TextUtils.isEmpty(str)) {
            return str;
        }
        LogUtil.d("DeviceEntranceUtil", "productId is null");
        return listL.get(0);
    }

    private String c(String str) {
        String str2 = "";
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains("Dobby") || str.contains("HUAWEI Scale 3 BLE-")) {
            return "c943c933-442e-4c34-bcd0-66597f24aaed";
        }
        if (str.contains("Hagrid-B29") || str.contains("HUAWEI Scale 3 Pro-")) {
            str2 = "b29df4e3-b1f7-4e40-960d-4cfb63ccca05";
        } else if (str.contains("HAG") || str.contains("HUAWEI Scale 2 Pro-")) {
            str2 = "8358eb90-b40d-11e9-a2a3-2a2ae2dbcce4";
        } else {
            LogUtil.d("DeviceEntranceUtil", "other hagr device");
        }
        if (str.contains("CH100")) {
            str2 = "33123f39-7fc1-420b-9882-a4b0d6c61100";
        }
        if (str.contains("CH18")) {
            str2 = "34fa0346-d46c-439d-9cb0-2f696618846b";
        }
        if (str.contains("CH100S")) {
            str2 = "ccd1f0f8-8c57-4bd7-a884-0ef38482f15f";
        }
        if (str.contains("AH100")) {
            str2 = "7a1063dd-0e0f-4a72-9939-461476ff0259";
        }
        return (str.contains("LUP-") || str.contains("AH111") || str.contains("HONOR Scale 2-")) ? "25c6df38-ca23-11e9-a32f-2a2ae2dbcce4" : str2;
    }

    public void d(Context context) {
        if (context != null) {
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(context).a(context.getResources().getString(R.string.IDS_main_device_ota_error_message)).c(R.string.IDS_user_permission_know, new View.OnClickListener() { // from class: qtx.15
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    LogUtil.a("DeviceEntranceUtil", "showTipDialog,click known button");
                }
            }).c();
            noTitleCustomAlertDialogC.setCancelable(false);
            noTitleCustomAlertDialogC.show();
        }
    }

    public int a(String str) {
        if ("EMPTY".equals(str)) {
            return 0;
        }
        if ("EXACT".equals(str)) {
            return 1;
        }
        if ("PREFIX".equals(str)) {
            return 2;
        }
        if ("SUFFIX".equals(str)) {
            return 3;
        }
        return "CONTAIN".equals(str) ? 4 : 0;
    }

    public void b(Context context, OneKeyScanActivity.d dVar, HealthTextView healthTextView) {
        if (context == null || dVar == null || healthTextView == null) {
            LogUtil.d("DeviceEntranceUtil", "checkPermission, error ");
            return;
        }
        boolean zB = BluetoothPermisionUtils.b(context);
        LogUtil.a("DeviceEntranceUtil", "checkPermission, isCheckPermission: ", Boolean.valueOf(zB));
        if (zB) {
            Message messageObtain = Message.obtain();
            messageObtain.what = 4;
            dVar.sendMessage(messageObtain);
        } else {
            d(context, dVar, healthTextView);
            e(context, dVar);
        }
    }

    public void d(final Context context, final OneKeyScanActivity.d dVar, final HealthTextView healthTextView) {
        LogUtil.a("DeviceEntranceUtil", "enter setScanClick");
        if (context == null || dVar == null || healthTextView == null) {
            LogUtil.d("DeviceEntranceUtil", "setScanClick, context or handler or textview is null");
            return;
        }
        String string = context.getResources().getString(R.string.IDS_make_sure_location);
        String string2 = context.getResources().getString(R.string.IDS_location_permission);
        if (Build.VERSION.SDK_INT > 30) {
            string2 = context.getResources().getString(R.string.IDS_nearby_permission);
        }
        String str = String.format(Locale.ROOT, string, string2);
        SpannableString spannableString = new SpannableString(str);
        int iIndexOf = str.indexOf(string2);
        if (iIndexOf < 0) {
            return;
        }
        int length = string2.length();
        final int color = BaseApplication.getContext().getResources().getColor(R.color.colorAccent);
        spannableString.setSpan(new ClickableSpan() { // from class: qtx.14
            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(color);
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                qtx.this.b(context, dVar, healthTextView);
            }
        }, iIndexOf, length + iIndexOf, 34);
        healthTextView.setText(spannableString);
        healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void c(final Context context, final OneKeyScanActivity.d dVar, final HealthTextView healthTextView) {
        if (context == null || dVar == null || healthTextView == null) {
            LogUtil.d("DeviceEntranceUtil", "checkGpsService, context or handler or textview is null");
            return;
        }
        String string = context.getResources().getString(R.string.IDS_make_location_service);
        String string2 = context.getResources().getString(R.string.IDS_location_service);
        healthTextView.setTextColor(context.getResources().getColor(R.color.textColorSecondary));
        String str = String.format(Locale.ROOT, string, string2);
        SpannableString spannableString = new SpannableString(str);
        int iIndexOf = str.indexOf(string2);
        if (iIndexOf < 0) {
            return;
        }
        int length = string2.length();
        final int color = BaseApplication.getContext().getResources().getColor(R.color.colorAccent);
        spannableString.setSpan(new ClickableSpan() { // from class: qtx.13
            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(color);
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                LogUtil.a("DeviceEntranceUtil", "setScanClick onClick");
                qtx.this.b(context, dVar, healthTextView);
            }
        }, iIndexOf, length + iIndexOf, 34);
        healthTextView.setText(spannableString);
        healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void b(final Context context, HealthTextView healthTextView) {
        if (context == null || healthTextView == null) {
            LogUtil.d("DeviceEntranceUtil", "checkGpsService, context or handler or textview is null");
            return;
        }
        LogUtil.a("DeviceEntranceUtil", "enter checkBluetooth");
        String string = context.getResources().getString(R.string.IDS_make_location_service);
        String string2 = context.getResources().getString(R.string.IDS_hwh_bluetooth);
        healthTextView.setTextColor(context.getResources().getColor(R.color.textColorSecondary));
        String str = String.format(Locale.ROOT, string, string2);
        SpannableString spannableString = new SpannableString(str);
        int iIndexOf = str.indexOf(string2);
        if (iIndexOf < 0) {
            return;
        }
        int length = string2.length();
        final int color = BaseApplication.getContext().getResources().getColor(R.color.colorAccent);
        spannableString.setSpan(new ClickableSpan() { // from class: qtx.11
            @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                textPaint.setColor(color);
            }

            @Override // android.text.style.ClickableSpan
            public void onClick(View view) {
                LogUtil.a("DeviceEntranceUtil", "setScanClick onClick");
                qtx.this.f(context);
            }
        }, iIndexOf, length + iIndexOf, 34);
        healthTextView.setText(spannableString);
        healthTextView.setMovementMethod(LinkMovementMethod.getInstance());
        f(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Context context) {
        try {
            Intent intent = new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE");
            if (context instanceof Activity) {
                ((Activity) context).startActivityForResult(intent, 102);
            } else {
                context.startActivity(intent);
            }
        } catch (SecurityException unused) {
            LogUtil.a("DeviceEntranceUtil", "openBluetooth is error");
        }
    }

    public void e(final Context context, final OneKeyScanActivity.d dVar) {
        PermissionUtil.PermissionType permissionType = PermissionUtil.PermissionType.LOCATION;
        if (Build.VERSION.SDK_INT > 30) {
            permissionType = PermissionUtil.PermissionType.SCAN;
        }
        PermissionUtil.d(context, permissionType, new PermissionsResultAction() { // from class: qtx.12
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.a("DeviceEntranceUtil", "requestPermission onGranted");
                Message messageObtain = Message.obtain();
                messageObtain.what = 4;
                dVar.sendMessage(messageObtain);
            }

            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                LogUtil.a("DeviceEntranceUtil", "requestPermission onDenied");
            }

            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onForeverDenied(PermissionUtil.PermissionType permissionType2) {
                super.onForeverDenied(permissionType2);
                LogUtil.a("DeviceEntranceUtil", "requestPermission onForeverDenied");
                qtx.this.c(context);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(final Context context) {
        if (context == null) {
            LogUtil.d("DeviceEntranceUtil", "createGpsDialog, context is null");
            return;
        }
        if (context instanceof Activity) {
            LogUtil.a("DeviceEntranceUtil", "enter createGpsDialog");
            if (((Activity) context).isFinishing()) {
                LogUtil.d("DeviceEntranceUtil", "createGpsDialog,activity is finishing");
                return;
            }
            CustomViewDialog customViewDialog = this.f;
            String string = null;
            if (customViewDialog != null) {
                if (customViewDialog.isShowing()) {
                    this.f.dismiss();
                }
                this.f = null;
            }
            View viewInflate = View.inflate(context, R.layout.dialog_gps_location_permission_layout, null);
            if (Build.VERSION.SDK_INT > 30) {
                ((HealthTextView) viewInflate.findViewById(R.id.content)).setText(R.string.IDS_hw_bluetooth_permission_guide);
                string = BaseApplication.getContext().getString(R.string.IDS_hwh_home_other_permissions_title);
                ((HealthTextView) viewInflate.findViewById(R.id.content_tip)).setVisibility(8);
            }
            CustomViewDialog customViewDialogD = new CustomViewDialog.Builder(context).b(true).a(string).d(viewInflate).c(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: qtx.5
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (qtx.this.f != null) {
                        qtx.this.f.dismiss();
                        qtx.this.f = null;
                    }
                }
            }).d(R.string.IDS_hwh_motiontrack_permission_guide_go_set, new View.OnClickListener() { // from class: qtx.18
                @Override // android.view.View.OnClickListener
                public void onClick(View view) {
                    if (qtx.this.f != null) {
                        qtx.this.f.dismiss();
                        qtx.this.f = null;
                    }
                    rdp.c((Activity) context, 2);
                }
            }).d();
            this.f = customViewDialogD;
            customViewDialogD.setCancelable(false);
            this.f.show();
        }
    }

    public void b(Context context, DeviceInfo deviceInfo, List<String> list) {
        if (context == null || deviceInfo == null) {
            LogUtil.d("DeviceEntranceUtil", "handleConnect error");
            return;
        }
        if (!NotificationContentProviderUtil.b()) {
            LogUtil.a("DeviceEntranceUtil", "gotoConnect NOTIFICATION_INITIALIZE");
            if (lzi.a().d()) {
                NotificationContentProviderUtil.c(1);
            } else {
                NotificationContentProviderUtil.c(0);
            }
        }
        CompatibilityInteractor compatibilityInteractor = new CompatibilityInteractor();
        if (compatibilityInteractor.a(BaseApplication.getContext())) {
            a(context, deviceInfo, list);
            return;
        }
        List<DeviceInfo> listG = fks.d().g();
        if (listG == null) {
            a(context, deviceInfo, list);
            return;
        }
        if (listG.size() > 0 && CompatibilityInteractor.c(BaseApplication.getContext())) {
            if (compatibilityInteractor.b(listG)) {
                b(compatibilityInteractor, list, listG, context, deviceInfo);
                return;
            } else {
                a(context, deviceInfo, list);
                return;
            }
        }
        a(context, deviceInfo, list);
    }

    private void b(final CompatibilityInteractor compatibilityInteractor, final List<String> list, List<DeviceInfo> list2, final Context context, final DeviceInfo deviceInfo) {
        if (compatibilityInteractor.d(list2) == null) {
            a(context, deviceInfo, list);
        } else {
            compatibilityInteractor.b(context, null, new IBaseResponseCallback() { // from class: qtx.4
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    if (i != 0) {
                        qtx.this.a(context, deviceInfo, (List<String>) list);
                    } else {
                        if (obj == null || !(obj instanceof String) || compatibilityInteractor == null || !"SURE".equals(obj)) {
                            return;
                        }
                        CommonUtil.aj(BaseApplication.getContext());
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Context context, DeviceInfo deviceInfo, List<String> list) {
        if (context instanceof Activity) {
            b((Activity) context, deviceInfo, list);
        }
    }

    public static boolean b(String str, List<String> list) {
        if (njy.e(list)) {
            return !TextUtils.isEmpty(str) && str.startsWith("HDK");
        }
        return b(str, list.get(0));
    }

    public static boolean b(String str, String str2) {
        if (TextUtils.isEmpty(str) || !str.startsWith("HDK")) {
            return false;
        }
        LogUtil.a("DeviceEntranceUtil", "isThirdEceSystem：", str2);
        return !"41bfc883-69f1-494e-8f6a-8e545202565c".equals(str2);
    }

    private void b(Activity activity, DeviceInfo deviceInfo, List<String> list) {
        if (njy.e(list)) {
            LogUtil.d("DeviceEntranceUtil", "uuidList is empty");
            return;
        }
        try {
            if (activity == null || deviceInfo == null) {
                LogUtil.d("DeviceEntranceUtil", "enterDevicePairGuide context or deviceInfo is null");
                return;
            }
            String deviceUdid = deviceInfo.getDeviceUdid();
            if (cjk.d().isSupportH5Pair(deviceUdid)) {
                cjk.d().startPair(activity, StartPairOption.builder().c(deviceInfo.getUuid()).d(list).d(deviceUdid).a("wear_watch").e(false).a());
                return;
            }
            Intent intent = new Intent(activity, (Class<?>) DevicePairGuideActivity.class);
            intent.putExtra("pairGuideSelectName", deviceInfo.getDeviceUdid());
            intent.putExtra("pairGuideFromScanList", true);
            intent.putExtra("isHeartRateDevice", 0);
            if (list instanceof ArrayList) {
                intent.putStringArrayListExtra(BasePairManagerJsApi.UUID_LIST, (ArrayList) list);
            }
            intent.putExtra("kind_id", deviceInfo.getDeviceModel());
            intent.putExtra("DOWNLOAD_RESOURCE", true);
            intent.putExtra("pairGuideSelectAddress", deviceInfo.getUuid());
            intent.putExtra("pairGuideDeviceMode", 100001);
            activity.startActivityForResult(intent, 1);
        } catch (ActivityNotFoundException unused) {
            LogUtil.c("DeviceEntranceUtil", "enterDevicePairGuide error");
        }
    }

    public void e(Context context, final String str, final DeviceInfo deviceInfo, final OneKeyScanActivity.d dVar) {
        if (context == null || deviceInfo == null || dVar == null) {
            LogUtil.d("DeviceEntranceUtil", "showReplaceDeviceDialog, parameter is null");
            return;
        }
        rcv rcvVarA = rcv.a(BaseApplication.getContext());
        int productType = deviceInfo.getProductType();
        String deviceName = deviceInfo.getDeviceName();
        String strD = rcvVarA.d(productType);
        this.f46832b = strD;
        c(strD, productType, rcvVarA);
        LogUtil.a("DeviceEntranceUtil", "new device ", str, ", old device ", this.f46832b, " currentDeviceName ", deviceName);
        this.k = str;
        if (!TextUtils.isEmpty(deviceName)) {
            this.f46832b = deviceName;
        }
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(context).a(R.string.IDS_device_replace_dialog_title_notification).a(String.format(Locale.ROOT, context.getResources().getString(R.string.IDS_replace_device_dialog_content_new), this.k, this.f46832b)).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: qtx.2
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("DeviceEntranceUtil", "showReplaceDeviceDialog():Click not to switch the device");
            }
        }).a(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: qtx.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("DeviceEntranceUtil", "showReplaceDeviceDialog():Click to agree to switch the device");
                qtx qtxVar = qtx.this;
                qtxVar.d(qtxVar.f46832b, str);
                qtx.this.c(dVar, deviceInfo.getDeviceIdentify());
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    private void c(String str, int i, rcv rcvVar) {
        if (TextUtils.isEmpty(str)) {
            lvi.l();
            this.f46832b = rcvVar.d(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(String str, String str2) {
        HashMap map = new HashMap(16);
        map.put("old_device", str);
        map.put("new_device", str2);
        e(AnalyticsValue.ONE_KEY_SCAN_CLICK_CONNECT_REPLACE_DEVICE.value(), map);
    }

    public boolean c(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.d("DeviceEntranceUtil", "isBondedThirdPartyDevice productId or uniqueId is null");
            return false;
        }
        if (drw.e().h(str)) {
            return drw.e().a(str, str2) != null;
        }
        return drw.e().a(str2) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(OneKeyScanActivity.d dVar, String str) {
        Message messageObtain = Message.obtain();
        messageObtain.what = 5;
        dVar.sendMessage(messageObtain);
        rcw.b(BaseApplication.getContext()).g(str);
        LogUtil.a("DeviceEntranceUtil", "Clear the upgrade inter data");
    }

    public void a(Context context) {
        if (context == null) {
            LogUtil.d("DeviceEntranceUtil", "got jumpToNetSettings error, context is null");
            return;
        }
        try {
            SafeIntent safeIntent = new SafeIntent(new Intent());
            safeIntent.setAction("android.settings.WIRELESS_SETTINGS");
            context.startActivity(safeIntent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.c("DeviceEntranceUtil", "jump2NetSettings error");
        }
    }

    public void d(String str) {
        HashMap map = new HashMap(16);
        map.put("click", "1");
        e(str, map);
    }

    public void e(String str, Map<String, Object> map) {
        lmf.d().c(BaseApplication.getContext(), str, map, 0);
    }

    public List<BluetoothDevice> e() {
        ArrayList arrayList = new ArrayList(10);
        try {
            Object systemService = BaseApplication.getContext().getSystemService("bluetooth");
            if (systemService instanceof BluetoothManager) {
                return ((BluetoothManager) systemService).getConnectedDevices(7);
            }
        } catch (SecurityException unused) {
            LogUtil.c("DeviceEntranceUtil", "getDeviceList SecurityException");
        }
        return arrayList;
    }

    public List<BluetoothDevice> a() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        ArrayList arrayList = new ArrayList(10);
        try {
            Method declaredMethod = BluetoothAdapter.class.getDeclaredMethod("getConnectionState", new Class[0]);
            declaredMethod.setAccessible(true);
            Set<BluetoothDevice> bondedDevices = defaultAdapter.getBondedDevices();
            if (bondedDevices == null) {
                LogUtil.a("DeviceEntranceUtil", "getConnectedDeviceList() devices is null");
                return arrayList;
            }
            for (BluetoothDevice bluetoothDevice : bondedDevices) {
                Method declaredMethod2 = BluetoothDevice.class.getDeclaredMethod("isConnected", new Class[0]);
                declaredMethod.setAccessible(true);
                if (declaredMethod2.invoke(bluetoothDevice, new Object[0]) instanceof Boolean) {
                    Boolean bool = (Boolean) declaredMethod2.invoke(bluetoothDevice, new Object[0]);
                    boolean zBooleanValue = bool.booleanValue();
                    LogUtil.a("DeviceEntranceUtil", "getConnectDevice:", bluetoothDevice.getName(), " connect status:", bool);
                    if (zBooleanValue) {
                        arrayList.add(bluetoothDevice);
                    }
                }
            }
            return arrayList;
        } catch (IllegalAccessException unused) {
            LogUtil.c("DeviceEntranceUtil", "getConnectedDeviceList IllegalAccessException");
        } catch (IllegalArgumentException unused2) {
            LogUtil.c("DeviceEntranceUtil", "getConnectedDeviceList IllegalArgumentException");
        } catch (NoSuchMethodException unused3) {
            LogUtil.c("DeviceEntranceUtil", "getConnectedDeviceList NoSuchMethodException");
        } catch (SecurityException unused4) {
            LogUtil.c("DeviceEntranceUtil", "getConnectedDeviceList SecurityException");
        } catch (InvocationTargetException unused5) {
            LogUtil.c("DeviceEntranceUtil", "getConnectedDeviceList InvocationTargetException");
        }
    }

    public void e(Context context, HealthTextView healthTextView) {
        if (context == null || healthTextView == null) {
            LogUtil.d("DeviceEntranceUtil", "setSecondText, parameter is null");
            return;
        }
        String string = context.getResources().getString(R.string.IDS_add_device_manully);
        if (!CommonUtil.bg() && Build.VERSION.SDK_INT > 30) {
            try {
                Set<BluetoothDevice> bondedDevices = BluetoothAdapter.getDefaultAdapter().getBondedDevices();
                if (bondedDevices == null || bondedDevices.isEmpty()) {
                    string = context.getResources().getString(R.string.IDS_add_device_exception);
                }
            } catch (SecurityException unused) {
                string = context.getResources().getString(R.string.IDS_add_device_exception);
            }
        }
        healthTextView.setTextColor(context.getResources().getColor(R.color.textColorSecondary));
        healthTextView.setText(string);
    }

    public void e(rba rbaVar, Context context) {
        if (rbaVar == null || context == null) {
            LogUtil.d("DeviceEntranceUtil", "startIntentPairGuideSecond, parameter is null");
            return;
        }
        Intent intent = new Intent(context, (Class<?>) DevicePairGuideSecondActivity.class);
        List<String> listR = rbaVar.r();
        if (listR instanceof ArrayList) {
            intent.putStringArrayListExtra(BasePairManagerJsApi.UUID_LIST, (ArrayList) listR);
        }
        intent.putExtra("kind_id", rbaVar.h());
        Map<String, String> mapM = rbaVar.m();
        if (mapM instanceof Serializable) {
            intent.putExtra("pair_guide_array", (Serializable) mapM);
        }
        Map<String, edu> mapO = rbaVar.o();
        if (mapO != null && (mapO instanceof Map)) {
            LogUtil.d("DeviceEntranceUtil", "startIntentPairGuideSecond, resourceBeanMap:", mapO.toString());
            intent.putExtra("second_resource", (Serializable) mapO);
        }
        if (context instanceof Activity) {
            try {
                ((Activity) context).startActivity(intent);
            } catch (ActivityNotFoundException e) {
                LogUtil.c("DeviceEntranceUtil", "ActivityNotFoundException e:", e.getMessage());
            }
        }
    }

    public void e(final rba rbaVar, Context context, final rcv rcvVar) {
        if (rbaVar == null || context == null || rcvVar == null) {
            LogUtil.d("DeviceEntranceUtil", "enterPairGuide, parameter is null");
        } else {
            final WeakReference weakReference = new WeakReference(context);
            LoginInit.getInstance(BaseApplication.getContext()).browsingToLogin(new IBaseResponseCallback() { // from class: qub
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.e.c(rbaVar, rcvVar, weakReference, i, obj);
                }
            }, "");
        }
    }

    /* synthetic */ void c(rba rbaVar, rcv rcvVar, WeakReference weakReference, int i, Object obj) {
        if (i == 0) {
            this.i = rbaVar.g();
            this.l = rbaVar;
            this.h = rcvVar;
            i((Context) weakReference.get());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(Context context) {
        List<String> listR = this.l.r();
        if (listR == null || listR.isEmpty()) {
            LogUtil.d("DeviceEntranceUtil", "enterLeoPairGuide uuid is empty");
            return;
        }
        String str = listR.get(0);
        boolean zA = edg.a(str);
        edn ednVarC = lvi.c(str, zA);
        if (ednVarC == null) {
            LogUtil.a("DeviceEntranceUtil", "enterLeoPairGuide, deviceInfoNew is null ");
            return;
        }
        int iL = ednVarC.l();
        Intent intent = new Intent(context, (Class<?>) DevicePairGuideActivity.class);
        if (iL == 10) {
            qtk.a(intent, iL, this.h);
            intent.putExtra("pairGuideProductType", 10);
            intent.putExtra("pairGuideProductName", ednVarC.i());
            intent.putExtra("IS_PROC", zA);
        } else {
            intent.putExtra("pairGuideSelectName", this.l.g());
            intent.putExtra("pairGuideFromScanList", true);
            intent.putExtra("isHeartRateDevice", false);
            if (listR instanceof ArrayList) {
                intent.putStringArrayListExtra(BasePairManagerJsApi.UUID_LIST, (ArrayList) listR);
            }
            intent.putExtra("kind_id", this.l.h());
            intent.putExtra("DOWNLOAD_RESOURCE", true);
            intent.putExtra("pairGuideSelectAddress", "");
        }
        intent.putExtra("pairGuideFromScanList", false);
        intent.putExtra("pairGuideDeviceMode", 100001);
        if (context instanceof Activity) {
            ((Activity) context).startActivityForResult(intent, 1);
        }
    }

    private void i(Context context) {
        if (context == null) {
            LogUtil.d("DeviceEntranceUtil", "startPair context is null");
            return;
        }
        DeviceInfo deviceInfoD = mgg.d("DeviceEntranceUtil");
        if (deviceInfoD != null && HwVersionManager.b(BaseApplication.getContext()).m(deviceInfoD.getDeviceIdentify())) {
            LogUtil.a("DeviceEntranceUtil", "wear device OTA is in progress");
            d(context);
        } else {
            e(context);
        }
    }

    private void e(Context context) {
        LogUtil.a("DeviceEntranceUtil", "enter handleDialogByConnectedDevice");
        List<DeviceInfo> listB = rcv.a(BaseApplication.getContext()).b();
        if (listB == null || listB.isEmpty()) {
            LogUtil.d("DeviceEntranceUtil", "onClick connectedDeviceInfo is null");
            b(context);
        } else if (listB.size() == 1) {
            d(context, listB);
        } else if (listB.size() >= 2) {
            a(context, listB);
        } else {
            LogUtil.a("DeviceEntranceUtil", "more devices");
        }
    }

    private void a(Context context, List<DeviceInfo> list) {
        for (DeviceInfo deviceInfo : list) {
            if (!eel.d(deviceInfo.getProductType(), deviceInfo.getAutoDetectSwitchStatus())) {
                LogUtil.a("DeviceEntranceUtil", "onClick user has connect other device, and also wants to connect other device");
                c(context, this.i, deviceInfo);
                return;
            }
        }
    }

    private void d(Context context, List<DeviceInfo> list) {
        LogUtil.a("DeviceEntranceUtil", "onClick has one connected device");
        DeviceInfo deviceInfo = list.get(0);
        if (deviceInfo == null) {
            LogUtil.d("DeviceEntranceUtil", "onClick connected is null");
        } else if (eel.d(deviceInfo.getProductType())) {
            e(context, deviceInfo);
        } else {
            LogUtil.a("DeviceEntranceUtil", "onClick user has connect other device, and also wants to connect other device");
            c(context, this.i, deviceInfo);
        }
    }

    private void e(Context context, DeviceInfo deviceInfo) {
        if (deviceInfo.getAutoDetectSwitchStatus() == 0) {
            LogUtil.a("DeviceEntranceUtil", "onClick user has connect aw70 band mode, and also wants to connect other device");
            c(context, this.i, deviceInfo);
        } else if (deviceInfo.getAutoDetectSwitchStatus() == 1) {
            LogUtil.a("DeviceEntranceUtil", "onClick user has connect aw70 run mode, and also wants to connect other device");
            b(context);
        } else {
            LogUtil.a("DeviceEntranceUtil", "onClick user has connect aw70 unknown mode, and also wants to connect other device");
        }
    }

    private void c(final Context context, final String str, final DeviceInfo deviceInfo) {
        if (context == null || deviceInfo == null) {
            LogUtil.d("DeviceEntranceUtil", "showReplacePairDeviceDialog, parameter is null");
            return;
        }
        rcv rcvVarA = rcv.a(BaseApplication.getContext());
        int productType = deviceInfo.getProductType();
        String strD = rcvVarA.d(productType);
        this.f46832b = strD;
        c(strD, productType, rcvVarA);
        String deviceName = deviceInfo.getDeviceName();
        LogUtil.a("DeviceEntranceUtil", "new device ", str, ", old device ", this.f46832b);
        this.k = str;
        if (!TextUtils.isEmpty(deviceName)) {
            this.f46832b = deviceName;
        }
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(context).a(R.string.IDS_device_replace_dialog_title_notification).a(String.format(Locale.ROOT, context.getResources().getString(R.string.IDS_replace_device_dialog_content_new), this.k, this.f46832b)).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: qtx.9
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("DeviceEntranceUtil", "showReplacePairDeviceDialog():Click not to switch the device");
            }
        }).a(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: qtx.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("DeviceEntranceUtil", "showReplacePairDeviceDialog():Click to agree to switch the device");
                qtx qtxVar = qtx.this;
                qtxVar.d(qtxVar.f46832b, str);
                qtx.this.b(context);
                rcw.b(BaseApplication.getContext()).g(deviceInfo.getDeviceIdentify());
            }
        }).b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public eds b(List<eds> list, List<String> list2) {
        for (eds edsVar : list) {
            if (edsVar != null && !njy.e(edsVar.aa())) {
                ArrayList arrayList = new ArrayList(edsVar.aa());
                arrayList.retainAll(list2);
                if (arrayList.size() != 0) {
                    return edsVar;
                }
            }
        }
        return new eds();
    }

    public void a(final Handler handler, final List<String> list, final List<eds> list2) {
        handler.post(new Runnable() { // from class: qtx.8
            @Override // java.lang.Runnable
            public void run() {
                List list3 = list;
                if (list3 != null) {
                    eds edsVarB = qtx.this.b((List<eds>) list2, (List<String>) list3);
                    if (list.size() <= 0 || edsVarB == null) {
                        return;
                    }
                    String str = (String) list.get(0);
                    if (!enq.d().g(str) || njy.e(edsVarB.d())) {
                        return;
                    }
                    HealthDevice healthDeviceB = enq.d().b(str);
                    rbe rbeVar = new rbe();
                    rbeVar.c(edsVarB.d().get(0));
                    rbeVar.a(healthDeviceB.getAddress());
                    Message messageObtain = Message.obtain();
                    messageObtain.what = 1;
                    messageObtain.obj = rbeVar;
                    handler.sendMessage(messageObtain);
                }
            }
        });
    }
}
