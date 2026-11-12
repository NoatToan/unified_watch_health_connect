package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.HiAccountInfo;
import com.huawei.hihealth.api.HiHealthManager;
import com.huawei.hihealth.data.listener.HiCommonListener;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwdevicemgr.R;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.utils.Constants;
import health.compact.a.AuthorizationUtils;
import health.compact.a.CommonUtil;
import health.compact.a.Services;
import health.compact.a.Utils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class mms {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f41940c = {"android.permission.BLUETOOTH_CONNECT", "android.permission.BLUETOOTH_SCAN"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f41941a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<String, Integer> f41942b;
    private DeviceInfo d;
    private Map<String, Integer> e;

    private mms() {
        this.e = new HashMap();
        this.f41942b = new HashMap();
        this.d = null;
        this.f41941a = false;
        a();
        c();
    }

    public static final mms b() {
        return a.f41946a;
    }

    private void a() {
        this.f41942b.put("000002", 16);
        this.f41942b.put("000108", 34);
        this.f41942b.put("000109", 58);
        this.f41942b.put("00M004", 34);
        this.f41942b.put("00M008", 34);
        this.f41942b.put("00N004", 65);
        this.f41942b.put("00005W", 34);
        this.f41942b.put("00005X", 34);
        this.f41942b.put("00005Y", 35);
        this.f41942b.put("00005Z", 35);
        this.f41942b.put("00M00E", 66);
        this.f41942b.put("00M0A2", 72);
        this.f41942b.put("00M0A3", 72);
        this.f41942b.put("00M0A4", 72);
        this.f41942b.put("00M0A5", 72);
        this.f41942b.put("00M0AS", 82);
        this.f41942b.put("00M0AN", 72);
    }

    private void c() {
        this.e.put("00000A", 20);
        this.e.put("00000B", 21);
        this.e.put("00000C", 18);
        this.e.put("00000D", 19);
        this.e.put("00010A", 60);
        this.e.put("00010B", 61);
        this.e.put("00N006", 64);
        this.e.put("00M0A0", 71);
        this.e.put("00M0A1", 71);
        this.e.put("00M0A9", 71);
        this.e.put("00M0AD", 71);
        this.e.put("00M0AE", 71);
        this.e.put("00M0AF", 61);
        this.e.put("00M0AG", 61);
        this.e.put("00M0A7", 73);
        this.e.put("00M0A8", 73);
        this.e.put("00M0B2", 75);
    }

    public void a(String str, String str2, String str3) {
        int i;
        int i2;
        int iIntValue;
        int i3;
        if (this.f41942b.get(str) != null) {
            iIntValue = this.f41942b.get(str).intValue();
            i3 = 1;
        } else {
            if (this.e.get(str) != null) {
                iIntValue = this.e.get(str).intValue();
                i3 = 2;
            } else {
                i = -1;
                i2 = -1;
            }
            if (Build.VERSION.SDK_INT > 30 && !PermissionUtil.b(BaseApplication.getContext(), f41940c)) {
                xjt.z("connectDeviceDirectly no permission.");
                e();
            }
            d(str, str2, str3, i, i2);
        }
        i = iIntValue;
        i2 = i3;
        if (Build.VERSION.SDK_INT > 30) {
            xjt.z("connectDeviceDirectly no permission.");
            e();
        }
        d(str, str2, str3, i, i2);
    }

    private void e() {
        String string = BaseApplication.getContext().getResources().getString(R.string.IDS_device_reconnect_remind);
        Notification.Builder builderC = lsb.d().c();
        builderC.setContentText(string);
        builderC.setSmallIcon(R.drawable.healthlogo_ic_notification);
        builderC.setStyle(new Notification.BigTextStyle().bigText(string));
        builderC.setContentIntent(c(BaseApplication.getContext()));
        builderC.setAutoCancel(true);
        lsb.a().c(10001, builderC.build());
    }

    private PendingIntent c(Context context) {
        Intent intent = new Intent();
        intent.setClassName(context, "com.huawei.health.MainActivity");
        intent.setFlags(536870912);
        intent.putExtra(Constants.HOME_TAB_NAME, Constants.HOME_TAB_DEVICE);
        return PendingIntent.getActivity(BaseApplication.getContext(), 0, intent, 67108864);
    }

    private void d(final String str, final String str2, final String str3, final int i, final int i2) {
        final String strB = lmq.b(str3);
        final int iC = c(strB);
        LogUtil.a("AutoDiscoverManager", "continueConnectDeviceDirectly mDeviceName :", CommonUtil.n(str2), " ,mProductType :", Integer.valueOf(i), " ,mBluetoothType :", Integer.valueOf(i2), ", deviceIdentify :", CommonUtil.n(strB), " ,connectState :", Integer.valueOf(iC));
        if (d(str2, strB) && this.f41941a) {
            LogUtil.j("AutoDiscoverManager", "continueConnectDeviceDirectly stop retry.");
            this.f41941a = false;
        } else if (!d(i)) {
            this.f41941a = true;
            d(str2, str, str3, i);
        } else if (!Utils.h()) {
            LogUtil.a("AutoDiscoverManager", "continueConnectDeviceDirectly no need login.");
            d(iC, str2, strB, i, i2);
        } else {
            HiHealthManager.d(BaseApplication.getContext()).fetchAccountInfo(new HiCommonListener() { // from class: mms.1
                @Override // com.huawei.hihealth.data.listener.HiCommonListener
                public void onSuccess(int i3, Object obj) {
                    String huid;
                    if (!(obj instanceof HiAccountInfo)) {
                        huid = "";
                    } else {
                        huid = ((HiAccountInfo) obj).getHuid();
                    }
                    if (!TextUtils.isEmpty(huid)) {
                        mms.this.d(iC, str2, strB, i, i2);
                        return;
                    }
                    LogUtil.j("AutoDiscoverManager", "AccountLoginReceiver userId is empty.");
                    mms.this.f41941a = true;
                    mms.this.d(str2, str, str3, i);
                }

                @Override // com.huawei.hihealth.data.listener.HiCommonListener
                public void onFailure(int i3, Object obj) {
                    xjt.z("continueConnectDeviceDirectly get account info fail.");
                    LogUtil.j("AutoDiscoverManager", "get account info fail.");
                    mms.this.d(iC, str2, strB, i, i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i, String str, String str2, int i2, int i3) {
        if (i == 1 || i == 2) {
            LogUtil.j("AutoDiscoverManager", "handleDirectConnectDevice device connecting or connected.");
        } else if (!mjx.d(i2)) {
            mkd.d().a(true);
        } else {
            e(str, str2, i2, i3);
        }
    }

    private void e(String str, String str2, int i, int i2) {
        cqp.a(100009, str, "", "");
        com.huawei.devicesdk.entity.DeviceInfo deviceInfo = new com.huawei.devicesdk.entity.DeviceInfo();
        deviceInfo.setDeviceBtType(i2);
        deviceInfo.setDeviceName(str);
        deviceInfo.setDeviceMac(str2);
        deviceInfo.setDeviceType(i);
        mkf.e(BaseApplication.getContext()).connectDevice(deviceInfo, 0);
    }

    private int c(String str) {
        List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "AutoDiscoverManager");
        if (coq.d(deviceList)) {
            LogUtil.j("AutoDiscoverManager", "getCurrentDeviceConnectState deviceInfoList is empty.");
            return 0;
        }
        for (DeviceInfo deviceInfo : deviceList) {
            if (str.equalsIgnoreCase(deviceInfo.getDeviceIdentify())) {
                return deviceInfo.getDeviceConnectState();
            }
        }
        return 0;
    }

    public boolean d(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            LogUtil.j("AutoDiscoverManager", "isDeviceReconnect deviceName or deviceIdentify is empty.");
            return false;
        }
        DeviceInfo deviceInfo = this.d;
        if (deviceInfo != null && str.equalsIgnoreCase(deviceInfo.getDeviceName()) && str2.equalsIgnoreCase(this.d.getDeviceIdentify())) {
            long jCurrentTimeMillis = System.currentTimeMillis() - this.d.getLastConnectedTime();
            if (jCurrentTimeMillis > C.DEFAULT_SEEK_FORWARD_INCREMENT_MS && jCurrentTimeMillis < 25000) {
                LogUtil.a("AutoDiscoverManager", "isDeviceReconnect is retry.");
                return true;
            }
        }
        LogUtil.a("AutoDiscoverManager", "isDeviceReconnect is not retry.");
        this.d = null;
        DeviceInfo deviceInfo2 = new DeviceInfo();
        this.d = deviceInfo2;
        deviceInfo2.setDeviceName(str);
        this.d.setDeviceIdentify(str2);
        this.d.setLastConnectedTime(System.currentTimeMillis());
        return false;
    }

    public boolean d(int i) {
        if (!AuthorizationUtils.c(BaseApplication.getContext())) {
            LogUtil.j("AutoDiscoverManager", "isDirectConnect user no agree privacy.");
            return false;
        }
        if (((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(mmx.a(i))) {
            return true;
        }
        LogUtil.j("AutoDiscoverManager", "isDirectConnect no device resource.");
        return false;
    }

    public void d(String str, String str2, String str3, int i) {
        LogUtil.a("AutoDiscoverManager", "Enter openHealthApp param is ", Boolean.valueOf(TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)));
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return;
        }
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("huaweischeme://healthapp/oneKeyDirect?device=supportNearDiscovery&destination=nearDiscovery"));
        intent.setAction("com.huawei.health.action.ONE_KEY_DIRECT");
        intent.setPackage(BaseApplication.getContext().getPackageName());
        intent.putExtra("DEVICE_NAME", str);
        intent.putExtra("DEVICE_ID", str3);
        intent.putExtra("DEVICE_PRODUCT_TYPE", i);
        intent.putExtra("DEVICE_MODULE_ID", str2);
        intent.putExtra("IS_FROM_PHONE_SERVICE", true);
        intent.addFlags(268435456);
        try {
            BaseApplication.getContext().startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.a("startJumpActivity not find JumpActivity", new Object[0]);
        }
    }

    /* JADX INFO: loaded from: classes10.dex */
    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final mms f41946a = new mms();
    }
}
