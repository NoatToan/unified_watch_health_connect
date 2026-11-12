package defpackage;

import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor;
import com.huawei.datatype.DeviceCommand;
import com.huawei.health.deviceconnect.callback.SendCallback;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hwcloudmodel.callback.ICloudOperationResult;
import com.huawei.hwcloudmodel.model.intelligent.DeviceLinkResultNotifyRequest;
import com.huawei.hwcloudmodel.model.intelligent.DeviceLinkResultNotifyResponse;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.constant.WatchFaceConstant;
import com.huawei.hwdevice.outofprocess.util.NotificationContentProviderUtil;
import com.huawei.hwlogsmodel.LogUtil;
import health.compact.a.CommonUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ConcurrentModificationException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class nby {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static nby f42856a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f42857c = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Set<String> f42858b = new HashSet(16);
    private String d;

    private nby() {
    }

    public static nby a() {
        nby nbyVar;
        synchronized (f42857c) {
            if (f42856a == null) {
                f42856a = new nby();
            }
            nbyVar = f42856a;
        }
        return nbyVar;
    }

    public void a(byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            LogUtil.j("HwNotificationIconPushManager", "parseInfo dataInfos is null or length < NORMAL_CAPABILITY_LENGTH");
            return;
        }
        byte b2 = bArr[1];
        if (b2 == 13) {
            d(bArr);
        } else if (b2 != 15) {
            LogUtil.d("HwNotificationIconPushManager", "no support : ", Byte.valueOf(b2));
        } else {
            c(bArr);
        }
    }

    public void d(byte[] bArr) {
        ees eesVarB;
        if (bArr == null || bArr.length < 2) {
            LogUtil.j("HwNotificationIconPushManager", "parserDeviceAppInfo dataInfos is null or length < NORMAL_CAPABILITY_LENGTH");
            return;
        }
        if (bArr[1] != 13) {
            LogUtil.j("HwNotificationIconPushManager", "parserDeviceAppInfo command id is not 13");
            return;
        }
        String strE = eeq.e(bArr);
        if (TextUtils.isEmpty(strE)) {
            LogUtil.j("HwNotificationIconPushManager", "parserDeviceAppInfo resultDataHex is empty");
            return;
        }
        if (bArr.length == 8 && bArr[2] == 127) {
            LogUtil.j("HwNotificationIconPushManager", "parserDeviceAppInfo dataInfos is invalid");
            return;
        }
        j();
        try {
            eesVarB = new eet().b(strE.substring(4));
        } catch (eeu unused) {
            LogUtil.e("HwNotificationIconPushManager", "parserDeviceAppInfo TlvException");
            eesVarB = null;
        }
        if (eesVarB == null) {
            LogUtil.j("HwNotificationIconPushManager", "parserDeviceAppInfo tlvFather is null");
            return;
        }
        List<ees> listB = eesVarB.b();
        if (listB == null || listB.isEmpty()) {
            LogUtil.j("HwNotificationIconPushManager", "parserDeviceAppInfo tlvFatherList is null");
            m();
            o();
            return;
        }
        ees eesVar = listB.get(0);
        if (eesVar == null) {
            LogUtil.j("HwNotificationIconPushManager", "parserDeviceAppInfo tlvAppList is null");
            return;
        }
        Iterator<ees> it = eesVar.b().iterator();
        while (it.hasNext()) {
            d(it.next());
        }
        m();
        o();
    }

    private void o() {
        LogUtil.a("HwNotificationIconPushManager", "Enter pushNotificationAppInfo.");
        for (lzj lzjVar : nbx.d()) {
            String strE = e(lzjVar.f());
            if (TextUtils.isEmpty(strE) || !strE.contains(c(lzjVar.d(), lzjVar.c()))) {
                b(lzjVar.f(), lzjVar.d(), lzjVar.c(), mir.e(lzjVar.f(), nbx.d(lzjVar.f())));
            }
        }
    }

    private void d(ees eesVar) {
        String strD = "";
        String strD2 = "";
        String strD3 = strD2;
        for (eew eewVar : eesVar.e()) {
            int iB = CommonUtil.b(eewVar.e(), 16);
            if (iB == 3) {
                strD = eeq.d(eewVar.b());
            } else if (iB == 4) {
                strD2 = eeq.d(eewVar.b());
            } else if (iB == 5) {
                strD3 = eeq.d(eewVar.b());
            }
        }
        LogUtil.a("HwNotificationIconPushManager", "handleSingleTlv packageName: ", strD, " appName: ", strD2, " versionCode: ", strD3);
        e(strD, strD2 + strD3);
    }

    private static void m() {
        DeviceCommand deviceCommand = new DeviceCommand();
        deviceCommand.setServiceID(2);
        deviceCommand.setCommandID(13);
        byte[] bArrC = eeq.c(eeq.d(127) + eeq.d(4) + eeq.c(SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US));
        deviceCommand.setDataContent(bArrC);
        deviceCommand.setDataLen(bArrC.length);
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    private void e(String str, String str2) {
        BaseApplication.getContext().getSharedPreferences("notification_app_info", 0).edit().putString(str, str2).apply();
        LogUtil.a("HwNotificationIconPushManager", "saveNotificationAppInfo completed");
    }

    private String e(String str) {
        String string = BaseApplication.getContext().getSharedPreferences("notification_app_info", 0).getString(str, null);
        LogUtil.d("HwNotificationIconPushManager", "getNotificationAppInfo completed");
        return string;
    }

    private String c(String str, String str2) {
        return str + str2;
    }

    private void j() {
        SharedPreferences.Editor editorEdit = BaseApplication.getContext().getSharedPreferences("notification_app_info", 0).edit();
        editorEdit.clear();
        editorEdit.apply();
        LogUtil.a("HwNotificationIconPushManager", "clearSharedPreferencesData completed");
    }

    private void b(String str, String str2, String str3, byte[] bArr) {
        String str4;
        LogUtil.a("HwNotificationIconPushManager", "enter sendNotificationAppInfo 5.2.14");
        if (!g()) {
            LogUtil.j("HwNotificationIconPushManager", "hasn't device connected.");
            return;
        }
        DeviceCommand deviceCommand = new DeviceCommand();
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || bArr == null) {
            LogUtil.j("HwNotificationIconPushManager", "sendNotificationAppInfo, app info is empty.");
            return;
        }
        String strA = eeq.a(str);
        String str5 = eeq.d(1) + eeq.d(strA.length() / 2) + strA;
        String strA2 = eeq.a(str2);
        String str6 = eeq.d(2) + eeq.d(strA2.length() / 2) + strA2;
        String strA3 = eeq.a(str3);
        String str7 = eeq.d(3) + eeq.d(strA3.length() / 2) + strA3;
        if (bArr.length <= 0) {
            str4 = "";
        } else {
            str4 = eeq.d(4) + eeq.b(bArr.length);
        }
        deviceCommand.setServiceID(2);
        deviceCommand.setCommandID(14);
        byte[] bArrD = d(eeq.c(str5 + str6 + str7 + str4), bArr);
        deviceCommand.setDataLen(bArrD.length);
        deviceCommand.setDataContent(bArrD);
        e(str, c(str2, str3));
        mkf.e(BaseApplication.getContext()).sendDeviceData(deviceCommand);
    }

    private boolean g() {
        BluetoothAdapter defaultAdapter = BluetoothAdapter.getDefaultAdapter();
        if (defaultAdapter != null && defaultAdapter.getState() == 10) {
            LogUtil.a("HwNotificationIconPushManager", "switch not on, not need start service!");
            return false;
        }
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "HwNotificationIconPushManager");
        if (deviceList == null || deviceList.isEmpty()) {
            LogUtil.a("HwNotificationIconPushManager", "hasDeviceConnected, false.");
            return false;
        }
        LogUtil.a("HwNotificationIconPushManager", "hasDeviceConnected, has device Db info.");
        return true;
    }

    private byte[] d(byte[] bArr, byte[] bArr2) {
        LogUtil.a("HwNotificationIconPushManager", "byteMerger, dataInfos :", Integer.valueOf(bArr.length), " , iconByteArray :", Integer.valueOf(bArr2.length));
        if (bArr2.length <= 0) {
            return bArr;
        }
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    public boolean b(String str, String str2, String str3) {
        LogUtil.a("HwNotificationIconPushManager", "isNeedPushAppInfo, appName :", str, " , versionCode :", str2, " , appPackageName :", str3);
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            LogUtil.a("HwNotificationIconPushManager", "isPushedNotificationApp, param is empty.");
            return false;
        }
        String strE = e(str3);
        String str4 = str + str2;
        LogUtil.a("HwNotificationIconPushManager", "isNeedPushAppInfo, appInfoString :", strE, " , appNameAndVersionCode :", str4);
        if (strE == null || !strE.contains(str4)) {
            return true;
        }
        LogUtil.a("HwNotificationIconPushManager", "isNeedPushAppInfo, appJsonString contains appNameAndPackageName.");
        return false;
    }

    public void e(Intent intent) {
        String str;
        if (intent == null) {
            LogUtil.j("HwNotificationIconPushManager", "appInstalled, intent is null.");
            return;
        }
        String dataString = intent.getDataString();
        ReleaseLogUtil.d("Notify_HwNotificationIconPushManager", "intentInfo is :", dataString);
        if (TextUtils.isEmpty(dataString)) {
            LogUtil.j("HwNotificationIconPushManager", "appInstalled intentInfo is empty.");
            return;
        }
        String[] strArrSplit = dataString.split(":");
        if (strArrSplit.length > 1) {
            str = strArrSplit[1];
        } else {
            str = strArrSplit[0];
        }
        d(str);
    }

    public void d(String str) {
        if (n()) {
            LogUtil.j("HwNotificationIconPushManager", "isn't support notification push icon.");
            c(str);
        }
        if (e()) {
            b(str);
        }
    }

    public void d() {
        ReleaseLogUtil.d("Notify_HwNotificationIconPushManager", "language start change");
        if (e()) {
            k();
            return;
        }
        if (!n()) {
            LogUtil.j("HwNotificationIconPushManager", "isn't support notification push icon.");
            return;
        }
        for (lzj lzjVar : nbx.d()) {
            String strE = e(lzjVar.f());
            LogUtil.a("HwNotificationIconPushManager", "localeChange, appInfo :", strE, ", info.getAppName :", lzjVar.d());
            if (TextUtils.isEmpty(strE)) {
                b(lzjVar.f(), lzjVar.d(), lzjVar.c(), mir.e(lzjVar.f(), nbx.d(lzjVar.f())));
            } else if (!strE.contains(lzjVar.d())) {
                b(lzjVar.f(), lzjVar.d(), lzjVar.c(), new byte[0]);
            }
        }
    }

    public void c(String str) {
        ReleaseLogUtil.d("Notify_HwNotificationIconPushManager", "packageName :", str);
        if (e()) {
            b(str);
            return;
        }
        if (!NotificationContentProviderUtil.a(str) && !i().contains(str)) {
            LogUtil.j("HwNotificationIconPushManager", str, " send Notification failed: SUB_SWITCH_TURN_OFF!");
            return;
        }
        PackageManager packageManager = BaseApplication.getContext().getPackageManager();
        if (packageManager == null) {
            LogUtil.j("HwNotificationIconPushManager", "sendNotificationAppInfo, packageManager is null.");
            return;
        }
        try {
            PackageInfo packageInfo = packageManager.getPackageInfo(str, 0);
            ApplicationInfo applicationInfo = packageInfo.applicationInfo;
            if (applicationInfo == null) {
                LogUtil.j("HwNotificationIconPushManager", "sendNotificationAppInfo, applicationInfo is null.");
                return;
            }
            String strValueOf = String.valueOf(packageInfo.versionCode);
            String string = applicationInfo.loadLabel(packageManager).toString();
            if (n() && b(string, strValueOf, applicationInfo.packageName)) {
                ReleaseLogUtil.d("Notify_HwNotificationIconPushManager", "sendNotificationAppInfo, is support notification push icon.");
                b(applicationInfo.packageName, string, strValueOf, mir.e(str, packageManager.getApplicationIcon(applicationInfo)));
            }
        } catch (PackageManager.NameNotFoundException unused) {
            LogUtil.e("HwNotificationIconPushManager", "sendNotificationAppInfo, NameNotFoundException.");
        }
    }

    public void h() {
        ReleaseLogUtil.d("Notify_HwNotificationIconPushManager", "enter checkedChangedPushAppInfo.");
        if (n()) {
            for (lzj lzjVar : nbx.a()) {
                if (b(lzjVar.d(), lzjVar.c(), lzjVar.f())) {
                    b(lzjVar.f(), lzjVar.d(), lzjVar.c(), mir.e(lzjVar.f(), nbx.d(lzjVar.f())));
                }
            }
        }
        if (e()) {
            l();
        }
    }

    private void c(byte[] bArr) {
        String strE = eeq.e(bArr);
        eet eetVar = new eet();
        try {
            String strSubstring = strE.substring(4);
            List<eew> listE = eetVar.b(strSubstring).e();
            if (listE != null && !listE.isEmpty()) {
                int iV = -1;
                String strD = null;
                for (eew eewVar : listE) {
                    int iV2 = CommonUtil.v(eewVar.e());
                    if (iV2 == 1) {
                        strD = eeq.d(eewVar.b());
                    } else if (iV2 != 127) {
                        LogUtil.j("HwNotificationIconPushManager", "new type, not support parse : ", eewVar.e());
                    } else {
                        iV = CommonUtil.v(eewVar.b());
                    }
                }
                e(strD, iV);
                return;
            }
            LogUtil.j("HwNotificationIconPushManager", "parseBleMultiLinkInfo device push app is wrong : ", strSubstring);
        } catch (eeu unused) {
            LogUtil.e("HwNotificationIconPushManager", "parserDeviceAppInfo TlvException");
        }
    }

    private void e(String str, int i) {
        lqo.b(BaseApplication.getContext()).d(new DeviceLinkResultNotifyRequest(str, i), new ICloudOperationResult<DeviceLinkResultNotifyResponse>() { // from class: nby.4
            @Override // com.huawei.hwcloudmodel.callback.ICloudOperationResult
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public void operationResult(DeviceLinkResultNotifyResponse deviceLinkResultNotifyResponse, String str2, boolean z) {
                LogUtil.a("HwNotificationIconPushManager", "isSuccess : ", Boolean.valueOf(z), " ,text : ", str2);
            }
        });
    }

    private boolean n() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwNotificationIconPushManager");
        DeviceInfo deviceInfo = deviceList.size() > 0 ? deviceList.get(0) : null;
        if (deviceInfo == null) {
            LogUtil.j("HwNotificationIconPushManager", "isSupportSyncIcon deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, 17);
    }

    public boolean e() {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.CONNECTED_MAIN_DEVICES, null, "HwNotificationIconPushManager");
        DeviceInfo deviceInfo = deviceList.size() > 0 ? deviceList.get(0) : null;
        if (deviceInfo == null) {
            LogUtil.j("HwNotificationIconPushManager", "isSupportAddIconTimestamp deviceInfo is null");
            return false;
        }
        return eey.d(deviceInfo, 77);
    }

    private void k() {
        List<lzj> listD = nbx.d();
        if (listD.isEmpty()) {
            return;
        }
        Set<String> setF = f();
        boolean zB = SharedPreferenceManager.b("SUPPORT_NOTIFY_ICON", "SUPPORT_NOTIFY_ICON", false);
        for (lzj lzjVar : listD) {
            if (zB || setF.contains(lzjVar.f())) {
                LogUtil.a("HwNotificationIconPushManager", "onLanguageChange: getPkgName= ", lzjVar.f());
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("appPkgName", lzjVar.f());
                    jSONObject.put("appName", lzjVar.d());
                    JSONObject jSONObjectD = d(6003, jSONObject);
                    LogUtil.a("HwNotificationIconPushManager", "onLanguageChange: ", jSONObjectD.toString());
                    nbz.d().d(jSONObjectD.toString());
                } catch (UnsupportedEncodingException | JSONException unused) {
                    LogUtil.e("HwNotificationIconPushManager", "onLanguageChange JSONException or UnsupportedEncodingException");
                }
            }
        }
    }

    public void b(String str) {
        if (!SharedPreferenceManager.b("SUPPORT_NOTIFY_ICON", "SUPPORT_NOTIFY_ICON", false) && !f().contains(str)) {
            LogUtil.j("HwNotificationIconPushManager", "onSingleNotificationAppOpened not is icon ", str);
            return;
        }
        if (TextUtils.equals(str, this.d)) {
            LogUtil.j("HwNotificationIconPushManager", "onSingleNotificationAppOpened is transmitting");
            return;
        }
        if (this.f42858b.contains(str)) {
            LogUtil.j("HwNotificationIconPushManager", "onSingleNotificationAppOpened mPushAppSet contains");
            return;
        }
        if (!NotificationContentProviderUtil.a(str) && !i().contains(str)) {
            LogUtil.j("HwNotificationIconPushManager", str, " onSingleNotificationAppOpened push failed: SUB_SWITCH_TURN_OFF!");
            return;
        }
        ReleaseLogUtil.d("Notify_HwNotificationIconPushManager", "onSingleNotificationAppOpened packageName:", str);
        this.f42858b.add(str);
        s();
    }

    private Set<String> f() {
        HashSet hashSet = new HashSet();
        hashSet.addAll(i());
        hashSet.addAll(cio.f1620b);
        return hashSet;
    }

    private Set<String> i() {
        HashSet hashSet = new HashSet();
        if (NotificationContentProviderUtil.f()) {
            boolean zB = SharedPreferenceManager.b("SUPPORT_NOTIFY_LIVE_LEVEL_CAPABILITY", "SUPPORT_NOTIFY_LIVE_LEVEL_CAPABILITY", false);
            LogUtil.a("HwNotificationIconPushManager", "getLiveCloudList notifyLiveLevelCapability=", Boolean.valueOf(zB));
            if (zB) {
                String strB = SharedPreferenceManager.b("NOTIFY_LIVE_LEVEL_VALUE", "NOTIFY_LIVE_LEVEL_VALUE", "levelDefault");
                LogUtil.a("HwNotificationIconPushManager", "getLiveCloudList notifyLiveLevel=", strB);
                if (!TextUtils.equals(strB, "levelDefault")) {
                    hashSet.addAll(NotificationContentProviderUtil.e(strB));
                    return hashSet;
                }
                hashSet.addAll(NotificationContentProviderUtil.e("levelDefault"));
            }
        }
        return hashSet;
    }

    public void c() {
        ReleaseLogUtil.d("Notify_HwNotificationIconPushManager", "onDeviceConnected:");
        if (!e()) {
            LogUtil.j("HwNotificationIconPushManager", "onDeviceConnected device is not support add icon timestamp.");
            return;
        }
        this.f42858b.clear();
        a((String) null);
        if (!NotificationContentProviderUtil.b()) {
            ReleaseLogUtil.d("Notify_HwNotificationIconPushManager", "onDeviceConnected authorized is close");
            return;
        }
        List<String> listJ = NotificationContentProviderUtil.j();
        listJ.addAll(i());
        d(listJ);
    }

    private void d(List<String> list) {
        Set<String> setF = f();
        Iterator<String> it = list.iterator();
        boolean zB = SharedPreferenceManager.b("SUPPORT_NOTIFY_ICON", "SUPPORT_NOTIFY_ICON", false);
        while (it.hasNext()) {
            String next = it.next();
            if (!zB && !setF.contains(next)) {
                it.remove();
            } else if (this.f42858b.contains(next)) {
                it.remove();
            }
        }
        ReleaseLogUtil.d("Notify_HwNotificationIconPushManager", "pushEnableApps.size: ", Integer.valueOf(list.size()));
        if (list.isEmpty()) {
            return;
        }
        this.f42858b.addAll(list);
        s();
    }

    public void b() {
        ReleaseLogUtil.d("Notify_HwNotificationIconPushManager", "onNotificationLiveLevel start");
        if (!e()) {
            LogUtil.j("HwNotificationIconPushManager", "onNotificationLiveLevel device is not support add icon timestamp.");
            return;
        }
        if (!NotificationContentProviderUtil.b()) {
            ReleaseLogUtil.e("Notify_HwNotificationIconPushManager", "onNotificationLiveLevel authorized is close");
            return;
        }
        Set<String> setI = i();
        if (setI.isEmpty()) {
            LogUtil.j("HwNotificationIconPushManager", "onNotificationLiveLevel liveCloudList is empty");
        } else {
            this.f42858b.addAll(setI);
            s();
        }
    }

    private void l() {
        ReleaseLogUtil.d("Notify_HwNotificationIconPushManager", "onNotificationSwitchOpened()");
        List<String> listJ = NotificationContentProviderUtil.j();
        listJ.addAll(cio.e);
        listJ.add(cio.d);
        listJ.addAll(i());
        d(listJ);
    }

    private void s() {
        lzj lzjVarA;
        String next;
        if (!TextUtils.isEmpty(this.d)) {
            LogUtil.j("HwNotificationIconPushManager", "sendMessage transmitting");
            return;
        }
        Iterator<String> it = this.f42858b.iterator();
        loop0: while (true) {
            lzjVarA = null;
            while (true) {
                try {
                    if (!it.hasNext()) {
                        break loop0;
                    }
                    next = it.next();
                    it.remove();
                    if (cio.d.equals(next)) {
                        lzjVarA = nbx.e();
                    } else {
                        lzjVarA = nbx.a(next);
                    }
                    if (lzjVarA == null) {
                        LogUtil.j("HwNotificationIconPushManager", "sendPushAppInfoToDevice ", next, " failer because appInfo is null.");
                    }
                } catch (ConcurrentModificationException unused) {
                    LogUtil.e("HwNotificationIconPushManager", "sendPushAppInfoToDevice ConcurrentModificationException");
                }
            }
            if (!TextUtils.isEmpty(lzjVarA.c())) {
                break;
            } else {
                LogUtil.j("HwNotificationIconPushManager", "sendPushAppInfoToDevice ", next, " failer because apCode is null.", next);
            }
        }
        if (lzjVarA == null) {
            LogUtil.j("HwNotificationIconPushManager", "sendPushAppInfoToDevice final appInfo is null");
        } else {
            a(lzjVarA.f());
            d(lzjVarA);
        }
    }

    private void d(lzj lzjVar) {
        try {
            String strE = nbx.e(lzjVar.f(), lzjVar.c());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appInfoHash", strE);
            jSONObject.put("appPkgName", lzjVar.f());
            jSONObject.put("appName", lzjVar.d());
            jSONObject.put("retCode", 10000);
            JSONObject jSONObjectD = d(6001, jSONObject);
            ReleaseLogUtil.d("Notify_HwNotificationIconPushManager", "sendPushAppInfoToDevice: ", jSONObjectD.toString());
            nbz.d().d(jSONObjectD.toString());
        } catch (UnsupportedEncodingException | JSONException unused) {
            LogUtil.e("HwNotificationIconPushManager", "sendPushAppInfoToDevice Exception");
        }
    }

    public void a(JSONObject jSONObject) throws JSONException {
        if (!e()) {
            LogUtil.j("HwNotificationIconPushManager", "dealDeviceRequestIcon device is not support add icon and timestamp.");
            return;
        }
        int i = jSONObject.getInt("retCode");
        String string = jSONObject.getString("appPkgName");
        ReleaseLogUtil.d("Notify_HwNotificationIconPushManager", "dealDeviceRequestIcon retCode:", Integer.valueOf(i));
        if (i == 10004 || i == 10005) {
            a((String) null);
            s();
            return;
        }
        String string2 = jSONObject.getString("appInfoHash");
        if (i != 10001 && i != 10002 && i != 10003) {
            e(string, string2, 10010);
            return;
        }
        int i2 = jSONObject.getInt("iconWidth");
        int i3 = jSONObject.getInt("iconHeight");
        LogUtil.a("HwNotificationIconPushManager", "operateAppIcon pkgName:", string, " iconWidth:", Integer.valueOf(i2), " iconHeight:", Integer.valueOf(i3));
        if (TextUtils.isEmpty(string) || i2 <= 0 || i3 <= 0) {
            e(string, string2, 10010);
            return;
        }
        Drawable drawableD = nbx.d(string);
        if (drawableD == null) {
            e(string, string2, 10009);
            LogUtil.j("HwNotificationIconPushManager", "dealDeviceRequestIcon drawable is null,", string);
            return;
        }
        Bitmap bitmapA = nbx.a(drawableD);
        if (bitmapA == null) {
            e(string, string2, 10009);
            LogUtil.j("HwNotificationIconPushManager", "dealDeviceRequestIcon final iconBitmap is null,", string);
        } else {
            Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmapA, i2, i3, true);
            String strD = d(string, string2, i);
            nce.c(bitmapCreateScaledBitmap, strD);
            e(i, string, string2, strD);
        }
    }

    private void e(final int i, final String str, final String str2, String str3) {
        final File file = new File(str3);
        if (file.exists()) {
            nbz.d().c(file, new SendCallback() { // from class: nby.1
                @Override // com.huawei.health.deviceconnect.callback.SendCallback
                public void onFileTransferReport(String str4) {
                }

                @Override // com.huawei.health.deviceconnect.callback.SendCallback
                public void onSendProgress(long j) {
                }

                @Override // com.huawei.health.deviceconnect.callback.SendCallback
                public void onSendResult(int i2) {
                    LogUtil.a("HwNotificationIconPushManager", "dealDeviceRequestIcon onSendResult errorNumber:", Integer.valueOf(i2));
                    if (i2 == 207) {
                        File file2 = file;
                        if (file2 != null && file2.exists()) {
                            LogUtil.d("HwNotificationIconPushManager", "dealDeviceRequestIcon onSendResult file delete:", Boolean.valueOf(file.delete()));
                        }
                        nby nbyVar = nby.this;
                        nbyVar.e(str, str2, nbyVar.a(i));
                    }
                }
            });
        } else {
            LogUtil.j("HwNotificationIconPushManager", "dealDeviceRequestIcon file not exists ", str);
        }
    }

    public void c(JSONObject jSONObject) throws JSONException {
        if (!e()) {
            ReleaseLogUtil.e("Notify_HwNotificationIconPushManager", "dealDeviceTerminate device is not support add icon timestamp.");
            return;
        }
        int i = jSONObject.getInt("retCode");
        ReleaseLogUtil.d("Notify_HwNotificationIconPushManager", "dealDeviceTerminate pkgName:", jSONObject.getString("appPkgName"), " retCode:", Integer.valueOf(i));
        if (i == 10011) {
            a((String) null);
            s();
        }
    }

    private JSONObject d(int i, JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("msgType", i);
        jSONObject2.put("msgBody", jSONObject);
        return jSONObject2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(String str, String str2, int i) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appPkgName", str);
            jSONObject.put("retCode", i);
            jSONObject.put("appInfoHash", str2);
            JSONObject jSONObjectD = d(6002, jSONObject);
            LogUtil.a("HwNotificationIconPushManager", "sendErrorCommand: ", jSONObjectD.toString());
            nbz.d().d(jSONObjectD.toString());
        } catch (UnsupportedEncodingException | JSONException unused) {
            LogUtil.e("HwNotificationIconPushManager", "sendErrorCommand Exception");
        }
    }

    private String d(String str, String str2, int i) {
        try {
            return BaseApplication.getContext().getFilesDir().getCanonicalPath() + File.separator + RemoteMessageConst.NOTIFICATION + File.separator + "iconPush" + File.separator + (str2 + "_" + str.replace(".", "") + "_" + d(i)) + WatchFaceConstant.BIN_SUFFIX;
        } catch (IOException unused) {
            LogUtil.e("HwNotificationIconPushManager", "getAppIconBinPath IOException");
            return "";
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int a(int i) {
        switch (i) {
            case 10001:
                return 10006;
            case 10002:
                return 10007;
            case 10003:
                return 10008;
            default:
                LogUtil.j("HwNotificationIconPushManager", "getSentFileCode default");
                return 10007;
        }
    }

    private int d(int i) {
        switch (i) {
            case 10001:
                return 1;
            case 10002:
                return 2;
            case 10003:
                return 3;
            default:
                LogUtil.j("HwNotificationIconPushManager", "getFileType default");
                return 2;
        }
    }

    private void a(String str) {
        synchronized (f42857c) {
            this.d = str;
        }
    }
}
