package com.huawei.ui.homewear21.home;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import android.view.View;
import com.huawei.devicepair.model.StartPairOption;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.device.api.IndoorEquipManagerApi;
import com.huawei.health.device.model.HealthDevice;
import com.huawei.health.device.ui.DeviceMainActivity;
import com.huawei.health.devicemgr.api.constant.HwGetDevicesMode;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.ui.measure.fragment.device.DeviceCategoryFragment;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.h5pro.jsmodules.device.BasePairManagerJsApi;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import com.huawei.ui.device.activity.coresleep.CoreSleepSelectorActivity;
import com.huawei.ui.device.activity.heartrate.ContinueHeartRateSettingActivity;
import com.huawei.ui.device.activity.intelligenthome.IntelligentHomeLinkageActivity;
import com.huawei.ui.device.activity.notification.NotificationSettingActivity;
import com.huawei.ui.device.activity.pairing.DevicePairGuideActivity;
import com.huawei.ui.device.activity.pressautomonitor.PressAutoMonitorActivity;
import com.huawei.ui.device.activity.selectcontact.ContactMainActivity;
import com.huawei.ui.homewear21.R;
import defpackage.cjk;
import defpackage.dxx;
import defpackage.ecu;
import defpackage.eej;
import defpackage.lmq;
import defpackage.lsy;
import defpackage.lvi;
import defpackage.qpx;
import defpackage.qrs;
import defpackage.qtv;
import defpackage.rgd;
import defpackage.tfv;
import defpackage.tpb;
import defpackage.tqp;
import defpackage.xjt;
import health.compact.a.AuthorizationUtils;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes43.dex */
public class KeyDirectActivity extends BaseActivity {
    private Context e;
    private Uri i;
    private String k;
    private tfv o;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f26194b = "";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f26193a = "";
    private String h = "";
    private boolean f = false;
    private int g = -1;
    private int d = 104;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private tpb f26195c = null;
    private d j = new d(this);

    static class d extends Handler {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private WeakReference<KeyDirectActivity> f26200c;

        d(KeyDirectActivity keyDirectActivity) {
            this.f26200c = new WeakReference<>(keyDirectActivity);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message == null) {
                LogUtil.j("KeyDirectActivity", "handleMessage message is null");
                return;
            }
            KeyDirectActivity keyDirectActivity = this.f26200c.get();
            if (keyDirectActivity == null || keyDirectActivity.isFinishing()) {
                LogUtil.j("KeyDirectActivity", "handleMessage keyDirectActivity is null or is finish");
                return;
            }
            if (message.what == 2001) {
                if (!TextUtils.isEmpty(keyDirectActivity.k)) {
                    keyDirectActivity.d();
                    return;
                }
                LogUtil.j("KeyDirectActivity", "mWatchFaceGrsUrl is empty");
                if (message.obj instanceof String) {
                    keyDirectActivity.a((String) message.obj);
                } else {
                    LogUtil.j("KeyDirectActivity", "message obj no is String");
                }
            }
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ReleaseLogUtil.d("KeyDirectActivity", "enter onCreate");
        this.e = this;
        tqp.g(BaseApplication.getContext());
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("KeyDirectActivity", "intent is null");
            g();
            return;
        }
        try {
            String stringExtra = intent.getStringExtra("DEVICE_MODULE_ID");
            this.h = stringExtra;
            if (!TextUtils.isEmpty(stringExtra)) {
                b(intent);
                return;
            }
            Uri data = intent.getData();
            this.i = data;
            if (data == null) {
                xjt.z("mSchemeDataUri is null.");
                LogUtil.j("KeyDirectActivity", "mSchemeDataUri is null");
                g();
                return;
            }
            LoginInit loginInit = LoginInit.getInstance(this.e);
            if (!AuthorizationUtils.c(this.e) || !loginInit.getIsLogined()) {
                LogUtil.a("KeyDirectActivity", "jump to MainActivity");
                startActivity(getPackageManager().getLaunchIntentForPackage(getPackageName()));
                g();
                return;
            }
            c();
        } catch (Throwable unused) {
            LogUtil.j("KeyDirectActivity", "onCreate get moduleId occur Throwable.");
            g();
        }
    }

    private void c() {
        try {
            String queryParameter = this.i.getQueryParameter("destination");
            if (TextUtils.isEmpty(queryParameter)) {
                LogUtil.j("KeyDirectActivity", "checkDestination() destination is empty");
                g();
                return;
            }
            LogUtil.a("KeyDirectActivity", "destination is ", queryParameter);
            if ("healthzone".equals(queryParameter)) {
                LogUtil.a("KeyDirectActivity", "go to HealthZone");
                b();
                return;
            }
            List<DeviceInfo> deviceList = ecu.d().getDeviceList(HwGetDevicesMode.ALL_DEVICES, null, "KeyDirectActivity");
            if (deviceList == null || deviceList.isEmpty()) {
                LogUtil.j("KeyDirectActivity", "initDeviceMap() no used device");
                f();
            } else {
                LogUtil.a("KeyDirectActivity", "device list is not empty");
                b(deviceList, queryParameter);
            }
        } catch (UnsupportedOperationException unused) {
            LogUtil.e("KeyDirectActivity", "checkDestination error is UnsupportedOperationException");
        }
    }

    private void b(List<DeviceInfo> list, String str) {
        ArrayList<DeviceInfo> arrayList = new ArrayList(16);
        for (DeviceInfo deviceInfo : list) {
            int productType = deviceInfo.getProductType();
            if (productType == 35 || productType == 34) {
                arrayList.add(deviceInfo);
                LogUtil.a("KeyDirectActivity", deviceInfo.getDeviceName(), "add to checkDeviceList");
            }
        }
        if (arrayList.isEmpty()) {
            LogUtil.j("KeyDirectActivity", "checkDeviceType() GT2 or Magic2");
            f();
            return;
        }
        for (DeviceInfo deviceInfo2 : arrayList) {
            LogUtil.a("KeyDirectActivity", "target device item is ", deviceInfo2.getDeviceName());
            if (deviceInfo2.getDeviceConnectState() == 2) {
                a(deviceInfo2.getDeviceIdentify(), str);
                return;
            }
        }
        String deviceIdentify = ((DeviceInfo) arrayList.get(0)).getDeviceIdentify();
        if (arrayList.size() == 1 && list.size() == 1) {
            a(deviceIdentify);
        } else {
            c((DeviceInfo) arrayList.get(0));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        LogUtil.a("KeyDirectActivity", "jumpToWearHome");
        Intent intent = new Intent();
        intent.setClassName(this.e, "com.huawei.ui.homewear21.home.WearHomeActivity");
        intent.putExtra("device_id", str);
        intent.setFlags(268435456);
        startActivity(intent);
        g();
    }

    private void f() {
        LogUtil.a("KeyDirectActivity", "jumpToDeviceList");
        HealthDevice.HealthDeviceKind healthDeviceKind = HealthDevice.HealthDeviceKind.HDK_UNKNOWN;
        Intent intent = new Intent(this.e, (Class<?>) DeviceMainActivity.class);
        intent.putExtra("view", "ListDevice");
        intent.putExtra("root_in_me", "me");
        intent.putExtra("kind", healthDeviceKind.name());
        intent.setFlags(268435456);
        startActivity(intent);
        g();
    }

    private void a(String str, String str2) {
        DeviceCapability deviceCapabilityA = eej.a(str);
        if (deviceCapabilityA == null) {
            LogUtil.j("KeyDirectActivity", "device capability is null.");
            f();
        } else {
            d(str, str2, deviceCapabilityA);
        }
    }

    private void d(String str, String str2, DeviceCapability deviceCapability) {
        LogUtil.a("KeyDirectActivity", "doDistribution.");
        if ("sleep".equals(str2)) {
            b(str, deviceCapability);
            return;
        }
        if ("intelligent".equals(str2)) {
            e(str, deviceCapability);
            return;
        }
        if (IndoorEquipManagerApi.KEY_HEART_RATE.equals(str2)) {
            c(str, deviceCapability);
            return;
        }
        if ("press".equals(str2)) {
            g(str, deviceCapability);
            return;
        }
        if ("pay".equals(str2)) {
            j(str, deviceCapability);
            return;
        }
        if ("music".equals(str2)) {
            a(str, deviceCapability);
            return;
        }
        if (RemoteMessageConst.NOTIFICATION.equals(str2)) {
            h(str, deviceCapability);
            return;
        }
        if ("contact".equals(str2)) {
            d(str, deviceCapability);
        } else if ("watchface".equals(str2)) {
            i(str, deviceCapability);
        } else {
            LogUtil.j("KeyDirectActivity", "unknown destination:", str2);
            a(str);
        }
    }

    private void c(String str, DeviceCapability deviceCapability) {
        if (deviceCapability.isSupportContinueHeartRate()) {
            a(str, ContinueHeartRateSettingActivity.class);
        } else {
            LogUtil.j("KeyDirectActivity", "not support ContinueHeartRate");
            a(str);
        }
    }

    private void g(String str, DeviceCapability deviceCapability) {
        if (deviceCapability.isSupportPressAutoMonitor()) {
            a(str, PressAutoMonitorActivity.class);
        } else {
            LogUtil.j("KeyDirectActivity", "not support PressAutoMonitor");
            a(str);
        }
    }

    private void j(String str, DeviceCapability deviceCapability) {
        if (rgd.e(str, deviceCapability)) {
            b(str);
        } else {
            LogUtil.j("KeyDirectActivity", "not support Pay");
            a(str);
        }
    }

    private void a(String str, DeviceCapability deviceCapability) {
        if (deviceCapability.isSupportMusicInfoList()) {
            a(str, MusicSecondaryMenuActivity.class);
        } else {
            LogUtil.j("KeyDirectActivity", "not support Music");
            a(str);
        }
    }

    private void h(String str, DeviceCapability deviceCapability) {
        if (deviceCapability.isMessageAlert()) {
            a(str, NotificationSettingActivity.class);
        } else {
            LogUtil.j("KeyDirectActivity", "not support Notification");
            a(str);
        }
    }

    private void d(String str, DeviceCapability deviceCapability) {
        if (deviceCapability.isContacts()) {
            a((String) null, ContactMainActivity.class);
        } else {
            LogUtil.j("KeyDirectActivity", "not support Contacts");
            a(str);
        }
    }

    private void i(String str, DeviceCapability deviceCapability) {
        if (deviceCapability.isSupportWatchFace()) {
            e(str);
        } else {
            LogUtil.j("KeyDirectActivity", "not support WatchFace");
            a(str);
        }
    }

    private void e(String str, DeviceCapability deviceCapability) {
        if (deviceCapability.isSupportIntelligentHomeLinkage()) {
            a(str, IntelligentHomeLinkageActivity.class);
        } else {
            LogUtil.j("KeyDirectActivity", "not support IntelligentHomeLinkage.");
            a(str);
        }
    }

    private void b(String str, DeviceCapability deviceCapability) {
        if (deviceCapability.isDeviceSupportCoreSleep()) {
            a(str, CoreSleepSelectorActivity.class);
        } else {
            LogUtil.j("KeyDirectActivity", "not support CoreSleep.");
            a(str);
        }
    }

    private void b() {
        Intent intent = new Intent();
        intent.setClassName(BaseApplication.getAppPackage(), "com.huawei.pluginhealthzone.activity.FamilyHealthTempActivity");
        intent.setFlags(67108864);
        startActivity(intent);
        g();
    }

    private void a(String str, Class<?> cls) {
        Intent intent = new Intent(this.e, cls);
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("device_id", str);
        }
        intent.setFlags(67108864);
        startActivity(intent);
        g();
    }

    private void b(String str) {
        tqp.b(this.e);
        tqp.d(this.e, str);
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        LogUtil.a("KeyDirectActivity", "gotoWatchFace");
        if (this.o == null) {
            this.o = new tfv(this, "com.huawei.ui.homewear21.home.KeyDirectActivity");
        }
        this.o.c(-1);
    }

    private void g() {
        setIntent(null);
        finish();
    }

    private void e(final String str) {
        LogUtil.a("KeyDirectActivity", "start to get watchFace url");
        lsy.a(new Runnable() { // from class: com.huawei.ui.homewear21.home.KeyDirectActivity.4
            @Override // java.lang.Runnable
            public void run() {
                String commonCountryCode = GRSManager.c(BaseApplication.getContext()).getCommonCountryCode();
                KeyDirectActivity.this.k = GRSManager.c(BaseApplication.getContext()).getNoCheckUrl("domainContentcenterDbankcdnNew", commonCountryCode);
                Message messageObtainMessage = KeyDirectActivity.this.j.obtainMessage();
                messageObtainMessage.what = 2001;
                messageObtainMessage.obj = str;
                KeyDirectActivity.this.j.sendMessage(messageObtainMessage);
            }
        });
    }

    private void c(DeviceInfo deviceInfo) {
        LogUtil.a("KeyDirectActivity", "jumpDeviceNotConnect");
        dxx dxxVarD = dxx.d();
        Intent intent = new Intent();
        intent.setClassName(this.e, "com.huawei.ui.homehealth.devicemanagercard.DeviceManagerWearNoConnect");
        intent.putExtra("device_name", deviceInfo.getDeviceName());
        intent.putExtra("device_identify", deviceInfo.getDeviceIdentify());
        intent.putExtra("device_picID", dxxVarD.c(deviceInfo.getProductType()));
        intent.putExtra(DeviceCategoryFragment.DEVICE_TYPE, deviceInfo.getProductType());
        intent.setFlags(67108864);
        this.e.startActivity(intent);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        ReleaseLogUtil.d("KeyDirectActivity", "enter onResume");
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        LogUtil.a("KeyDirectActivity", "onActivityResult requestCode: ", Integer.valueOf(i), ", resultCode: ", Integer.valueOf(i2));
        if (i == 1 && i2 == 2 && intent != null) {
            qtv.e(intent, this, qtv.c(i2, true, intent.getIntExtra("product_type", -1), true));
        } else {
            g();
        }
    }

    private void b(Intent intent) {
        LogUtil.a("KeyDirectActivity", "Enter handleDirectConnectDevice.");
        this.f26195c = tpb.c();
        this.f26194b = intent.getStringExtra("DEVICE_NAME");
        this.f26193a = lmq.b(intent.getStringExtra("DEVICE_ID"));
        this.f = intent.getBooleanExtra("IS_FROM_PHONE_SERVICE", false);
        this.g = this.f26195c.e(this.h, intent);
        if (TextUtils.isEmpty(this.f26194b) || TextUtils.isEmpty(this.f26193a)) {
            xjt.z("mDeviceName or mDeviceIdentify is empty.");
            LogUtil.j("KeyDirectActivity", "handleDirectConnectDevice mDeviceName or mDeviceIdentify is empty.");
            g();
            return;
        }
        i();
    }

    private void i() {
        this.d = this.f26195c.d();
        LogUtil.a("KeyDirectActivity", "startConnectDevice mDeviceName: ", CommonUtil.n(this.f26194b), ", mDeviceIdentify: ", CommonUtil.n(this.f26193a), ", mProductType: ", Integer.valueOf(this.g), ", mCurrentAppState: ", Integer.valueOf(this.d), ", mIsFromPhoneService: ", Boolean.valueOf(this.f));
        this.f26195c.e(this.f26194b, this.f26193a, this.h, this.g, this.f);
        switch (this.d) {
            case 100:
            case 101:
            case 103:
                xjt.z("startConnectDevice NO_AGREE_PRIVACY_SCENARIO or NO_LOGIN.");
                tpb.b();
                a();
                break;
            case 102:
            case 105:
                e();
                break;
            case 104:
            default:
                LogUtil.j("KeyDirectActivity", "mCurrentAppState is ok.");
                if (this.f26195c.a(this.h)) {
                    c(this, lvi.j(this.g));
                } else {
                    g();
                }
                break;
        }
    }

    private void a() {
        LogUtil.a("KeyDirectActivity", "Enter goAppMainPage.");
        Intent launchIntentForPackage = getPackageManager().getLaunchIntentForPackage(getPackageName());
        launchIntentForPackage.putExtra("directConnectDevice", "directConnectDevice");
        launchIntentForPackage.addFlags(67108864);
        startActivity(launchIntentForPackage);
        g();
    }

    private void e() {
        LogUtil.a("KeyDirectActivity", "Enter goDirectConnectPage.");
        startActivity(new Intent(this, (Class<?>) DirectConnectDeviceActivity.class));
        g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(String str) {
        LogUtil.a("KeyDirectActivity", "Enter goDevicePairPage.");
        String strI = lvi.a(this.g).i();
        ArrayList arrayList = new ArrayList(10);
        arrayList.add(str);
        if (cjk.d().isSupportH5Pair(this.f26194b)) {
            cjk.d().startPair(this.e, StartPairOption.builder().c(this.f26193a).d(arrayList).d(this.f26194b).a("wear_watch").e(false).a());
            finish();
            return;
        }
        Intent intent = new Intent(this, (Class<?>) DevicePairGuideActivity.class);
        intent.putExtra("pairGuideProductType", this.g);
        intent.putExtra("pairGuideProductName", strI);
        intent.putExtra("pairGuideSelectName", this.f26194b);
        intent.putExtra("pairGuideFromScanList", true);
        intent.putExtra("pairGuideFromNearDiscovery", true);
        intent.putExtra("pairGuideSelectAddress", this.f26193a);
        intent.putExtra("pairGuideDeviceMode", 100008);
        intent.putExtra("DOWNLOAD_RESOURCE", true);
        intent.putExtra(BasePairManagerJsApi.UUID_LIST, arrayList);
        startActivityForResult(intent, 1);
    }

    private void c(Activity activity, String str) {
        if (activity == null) {
            ReleaseLogUtil.e("R_KeyDirectActivity", "goDevicePairPage the activity is null!");
        } else if (Build.VERSION.SDK_INT <= 30) {
            ReleaseLogUtil.e("R_KeyDirectActivity", "goDevicePairPage Phone is below to Android 12");
            c(str);
        } else {
            PermissionUtil.d(activity, PermissionUtil.PermissionType.SCAN, new AnonymousClass2(activity, str, activity));
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.homewear21.home.KeyDirectActivity$2, reason: invalid class name */
    public class AnonymousClass2 extends CustomPermissionAction {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f26196b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f26197c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Context context, String str, Activity activity) {
            super(context);
            this.f26196b = str;
            this.f26197c = activity;
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            ReleaseLogUtil.a("R_KeyDirectActivity", "goDevicePairPage doActionWithPermissions onGranted");
            KeyDirectActivity.this.c(this.f26196b);
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onDenied(String str) {
            super.onDenied(str);
            qpx.e(this.f26197c, R.string.IDS_nearby_permission_exception);
            this.f26197c.finish();
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
            final Activity activity = this.f26197c;
            View.OnClickListener onClickListener = new View.OnClickListener() { // from class: tft
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    activity.finish();
                }
            };
            final Activity activity2 = this.f26197c;
            qrs.c(activity, permissionType, (CustomTextAlertDialog) null, onClickListener, new View.OnClickListener() { // from class: tfq
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    activity2.finish();
                }
            });
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
