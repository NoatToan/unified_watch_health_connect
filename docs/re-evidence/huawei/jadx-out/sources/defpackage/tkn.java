package defpackage;

import android.app.Activity;
import android.bluetooth.BluetoothAdapter;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.apprichtap.haptic.base.PrebakedEffectId;
import com.huawei.callback.FitnessCloudCallBack;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.ui.privacy.HonorDevicePrivacyActivity;
import com.huawei.health.device.util.EventBus;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.messagecenter.api.MessageCenterApi;
import com.huawei.health.messagecenter.model.MessageObject;
import com.huawei.health.userprofilemgr.model.BaseResponseCallback;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback;
import com.huawei.hwcloudmodel.healthdatacloud.model.GetBindDeviceReq;
import com.huawei.hwcloudmodel.healthdatacloud.model.UnbindDeviceRequest;
import com.huawei.hwcloudmodel.model.CloudCommonReponse;
import com.huawei.hwcloudmodel.model.intelligent.ReleaseDeviceLinkageResponse;
import com.huawei.hwcloudmodel.model.userprofile.GetBindDeviceRsp;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwdataaccessmodel.utils.StorageDataCallback;
import com.huawei.hwdevice.outofprocess.mgr.device.ProfileAgent;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.activity.WebViewActivity;
import com.huawei.operation.utils.Constants;
import com.huawei.pluginachievement.manager.model.KakaConstants;
import com.huawei.profile.client.connect.ServiceConnectCallback;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.dialog.CommonDialog21;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomStateDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.HealthButtonBarLayout;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.dotspageindicator.HealthDotsPageIndicator;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.viewpager.HealthViewPager;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.device.utlis.BluetoothPermisionUtils;
import com.huawei.ui.device.utlis.FindNetworkUtils;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.homewear21.home.WearHomeOldActivity;
import com.huawei.ui.homewear21.home.legal.WearHomeLegalInformationActivity;
import com.huawei.ui.main.stories.guide.interactors.GuideInteractors;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.KeyValDbManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageResult;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes18.dex */
public class tkn implements IBaseResponseCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomAlertDialog f49265a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f49266b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private NoTitleCustomAlertDialog f49267c;
    private final BtSwitchStateCallback d;
    private WearHomeOldActivity e;
    private CustomAlertDialog f;
    private EventBus.ICallback g;
    private AnimationDrawable h;
    private AnimationDrawable i;
    private CustomAlertDialog j;
    private CommonDialog21 k;
    private CustomTextAlertDialog l;
    private mhs m;
    private CustomTextAlertDialog n;
    private NoTitleCustomAlertDialog o;

    static class b implements ServiceConnectCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f49296c;

        b(String str) {
            this.f49296c = str;
        }

        @Override // com.huawei.profile.client.connect.ServiceConnectCallback
        public void onConnect() {
            LogUtil.a("WearHomeMainAction", "profile connected");
            ProfileAgent.PROFILE_AGENT.setConnected(true);
            ThreadPoolManager.c().execute(new Runnable() { // from class: tkn.b.4
                @Override // java.lang.Runnable
                public void run() {
                    if (b.this.f49296c != null) {
                        new mgz().a(b.this.f49296c);
                        ProfileAgent.PROFILE_AGENT.disconnectProfile();
                    } else {
                        LogUtil.j("WearHomeMainAction", "deviceSecUuid is null");
                    }
                }
            });
        }

        @Override // com.huawei.profile.client.connect.ServiceConnectCallback
        public void onDisconnect() {
            ProfileAgent.PROFILE_AGENT.setConnected(false);
            LogUtil.a("WearHomeMainAction", "profile disconnected");
        }
    }

    public tkn(Context context, WearHomeOldActivity wearHomeOldActivity) {
        this.f49267c = null;
        this.d = new BtSwitchStateCallback() { // from class: tkn.5
            @Override // com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback
            public void onBtSwitchStateCallback(int i) {
                if (tkn.this.e == null || tkn.this.e.f26235c == null) {
                    return;
                }
                tkn.this.e.f26235c.d(tkn.this.d);
                LogUtil.a("WearHomeMainAction", "onBtSwitchStateCallback bluetoothSwitchState:", Integer.valueOf(i));
                if (i == 3) {
                    tkn.this.c();
                }
            }
        };
        this.g = new EventBus.ICallback() { // from class: tkn.13
            @Override // com.huawei.health.device.util.EventBus.ICallback
            public void onEvent(EventBus.d dVar) {
                if (dVar == null) {
                    LogUtil.j("WearHomeMainAction", "event is null");
                    return;
                }
                Bundle bundleB = dVar.b();
                if (bundleB == null) {
                    LogUtil.j("WearHomeMainAction", "bundle is null");
                    return;
                }
                if ("sign_account_hms_login_state_action".equals(dVar.e())) {
                    tkn.this.e();
                    if (tkn.this.e.d() != null) {
                        tkn.this.e.d().removeMessages(300005);
                        tkn.this.e.d().removeMessages(300006);
                    }
                    String string = bundleB.getString("sign_account_hms_login_state_key");
                    if (string == null) {
                        LogUtil.j("WearHomeMainAction", "state is null");
                        return;
                    }
                    if ("-1".equals(string)) {
                        LogUtil.j("WearHomeMainAction", "state is default");
                        tkn.this.d(2);
                        return;
                    }
                    if (!"1".equals(string) && tkn.this.e.d() != null) {
                        tkn.this.e.d().sendEmptyMessageDelayed(300005, 2000L);
                        if (tkn.this.n != null && tkn.this.n.isShowing() && !tkn.this.e.isFinishing()) {
                            ReleaseLogUtil.d("R_GRS_WearHomeMainAction", "state is success hide dialog");
                            tkn.this.n.dismiss();
                            tkn.this.n = null;
                        }
                    }
                    tkn.this.e.a(lsk.a(string, 10));
                    ReleaseLogUtil.d("R_GRS_WearHomeMainAction", "action  state is :", dVar.e(), string);
                }
            }
        };
        this.e = wearHomeOldActivity;
        this.f49266b = context;
        this.m = mhs.a();
        lwg.d().c(this);
    }

    public tkn() {
        this.f49267c = null;
        this.d = new BtSwitchStateCallback() { // from class: tkn.5
            @Override // com.huawei.hwbtsdk.btdatatype.callback.BtSwitchStateCallback
            public void onBtSwitchStateCallback(int i) {
                if (tkn.this.e == null || tkn.this.e.f26235c == null) {
                    return;
                }
                tkn.this.e.f26235c.d(tkn.this.d);
                LogUtil.a("WearHomeMainAction", "onBtSwitchStateCallback bluetoothSwitchState:", Integer.valueOf(i));
                if (i == 3) {
                    tkn.this.c();
                }
            }
        };
        this.g = new EventBus.ICallback() { // from class: tkn.13
            @Override // com.huawei.health.device.util.EventBus.ICallback
            public void onEvent(EventBus.d dVar) {
                if (dVar == null) {
                    LogUtil.j("WearHomeMainAction", "event is null");
                    return;
                }
                Bundle bundleB = dVar.b();
                if (bundleB == null) {
                    LogUtil.j("WearHomeMainAction", "bundle is null");
                    return;
                }
                if ("sign_account_hms_login_state_action".equals(dVar.e())) {
                    tkn.this.e();
                    if (tkn.this.e.d() != null) {
                        tkn.this.e.d().removeMessages(300005);
                        tkn.this.e.d().removeMessages(300006);
                    }
                    String string = bundleB.getString("sign_account_hms_login_state_key");
                    if (string == null) {
                        LogUtil.j("WearHomeMainAction", "state is null");
                        return;
                    }
                    if ("-1".equals(string)) {
                        LogUtil.j("WearHomeMainAction", "state is default");
                        tkn.this.d(2);
                        return;
                    }
                    if (!"1".equals(string) && tkn.this.e.d() != null) {
                        tkn.this.e.d().sendEmptyMessageDelayed(300005, 2000L);
                        if (tkn.this.n != null && tkn.this.n.isShowing() && !tkn.this.e.isFinishing()) {
                            ReleaseLogUtil.d("R_GRS_WearHomeMainAction", "state is success hide dialog");
                            tkn.this.n.dismiss();
                            tkn.this.n = null;
                        }
                    }
                    tkn.this.e.a(lsk.a(string, 10));
                    ReleaseLogUtil.d("R_GRS_WearHomeMainAction", "action  state is :", dVar.e(), string);
                }
            }
        };
    }

    public void e(String str, String str2, DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            ReleaseLogUtil.d("R_GRS_WearHomeMainAction", "openLegalActivity deviceInfo is null");
            return;
        }
        try {
            Intent intent = new Intent();
            intent.setClass(this.f49266b, WearHomeLegalInformationActivity.class);
            intent.putExtra("device_id", str);
            intent.putExtra("device_name", str2);
            intent.putExtra("product_type", deviceInfo.getProductType());
            this.f49266b.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("WearHomeMainAction", "ActivityNotFoundException WearHomeLegalInformationActivity");
        }
    }

    public void d() {
        this.e.startActivityForResult(new Intent(this.f49266b, (Class<?>) HonorDevicePrivacyActivity.class), 10008);
    }

    public void d(String str) {
        int i;
        ReleaseLogUtil.d("R_GRS_WearHomeMainAction", "enter WearHomeMainAction startDetection");
        if ("LOCAL_TYPE".equals(str)) {
            i = 1;
        } else if ("REMOTE_TYPE".equals(str)) {
            i = 2;
        } else {
            LogUtil.d("WearHomeMainAction", "startConnectDetection else");
            i = -1;
        }
        lwo.c().e(this.e.d, i);
    }

    public void a(boolean z) {
        String string;
        ResolveInfo resolveInfoResolveActivity;
        try {
            lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HOME_1010046.value(), new HashMap(16), 0);
            if (z) {
                string = "95030";
            } else {
                string = BaseApplication.getContext().getString(R.string.IDS_main_sns_member_service_call_number_item_3);
            }
            Intent intent = new Intent("android.intent.action.DIAL", Uri.parse(KakaConstants.SCHEME_TEL + string));
            PackageManager packageManager = this.e.getPackageManager();
            if (packageManager == null || (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536)) == null) {
                return;
            }
            ComponentName componentName = new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name);
            intent.setComponent(componentName);
            String packageName = componentName.getPackageName();
            WearHomeOldActivity wearHomeOldActivity = this.e;
            qrs.c(intent, packageName, wearHomeOldActivity, wearHomeOldActivity.getString(R.string.IDS_hwh_phone));
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("WearHomeMainAction", "callHotline() ActivityNotFoundException");
        }
    }

    public void f() {
        r();
        this.e.u.execute(new Runnable() { // from class: tkn.20
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("WearHomeMainAction", "openHuaFenClubActivity enter");
                final String strD = GRSManager.c(BaseApplication.getContext()).getUrl("domainClubHuawei") + "/forum.php?mod=forumdisplay&fid=4301";
                DeviceInfo deviceInfoA = tfn.a().a(tkn.this.e.f26233a);
                if (deviceInfoA != null) {
                    int productType = deviceInfoA.getProductType();
                    LogUtil.a("WearHomeMainAction", "openHuaFenClubActivity() productType ", Integer.valueOf(productType));
                    if (!eel.d(productType)) {
                        strD = tqy.b().d(deviceInfoA);
                    }
                }
                LogUtil.a("WearHomeMainAction", "startWebViewActivity() url is ", strD, ", jumpModeKey is ", 1);
                tkn.this.e.runOnUiThread(new Runnable() { // from class: tkn.20.1
                    @Override // java.lang.Runnable
                    public void run() {
                        LogUtil.a("WearHomeMainAction", "Handler");
                        tkn.this.i(strD);
                    }
                });
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(String str) {
        try {
            Intent intent = new Intent(this.f49266b, (Class<?>) WebViewActivity.class);
            intent.putExtra("url", str);
            intent.putExtra(Constants.JUMP_MODE_KEY, 1);
            this.f49266b.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            LogUtil.e("WearHomeMainAction", "ActivityNotFoundException WebViewActivity");
        }
    }

    private void r() {
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.HOME_1010042.value(), new HashMap(16), 0);
    }

    public void a() {
        if (BluetoothAdapter.getDefaultAdapter() != null && !BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            if (Build.VERSION.SDK_INT > 30) {
                PermissionUtil.d(this.e, PermissionUtil.PermissionType.SCAN, new BluetoothPermisionUtils.NearbyPermissionAction(this.e) { // from class: tkn.22
                    @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
                    public void onGranted() {
                        LogUtil.a("WearHomeMainAction", "checkBluetoothState nearby permission granted");
                        tkn.this.x();
                    }
                });
                return;
            } else {
                x();
                return;
            }
        }
        c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.f49266b).a(this.f49266b.getResources().getString(R.string.IDS_device_bluetooth_open_request)).c(R.string.IDS_device_bt_right_btn_info, new View.OnClickListener() { // from class: tkv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.b(view);
            }
        }).a(R.string.IDS_device_bt_left_btn_info, new View.OnClickListener() { // from class: tkw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49303c.e(view);
            }
        }).c();
        this.o = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        this.o.show();
    }

    /* synthetic */ void b(View view) {
        LogUtil.a("WearHomeMainAction", "user choose open bluetooth");
        WearHomeOldActivity wearHomeOldActivity = this.e;
        if (wearHomeOldActivity == null || wearHomeOldActivity.f26235c == null) {
            return;
        }
        this.e.f26235c.e(this.d);
    }

    /* synthetic */ void e(View view) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.o;
        if (noTitleCustomAlertDialog == null) {
            return;
        }
        noTitleCustomAlertDialog.dismiss();
        this.o = null;
    }

    public void c() {
        LogUtil.a("WearHomeMainAction", 0, "WearHomeMainAction", "Enter unbindListener");
        LogUtil.a("WearHomeMainAction", "Enter unbind ota status:", Integer.valueOf(maq.b().c(this.e.f26233a)));
        if (lwg.d().e(this.e.f26233a)) {
            y();
        } else {
            q();
        }
    }

    private void q() {
        this.m.getSwitchSetting("intelligent_home_linkage", this.e.f26233a, new IBaseResponseCallback() { // from class: tkn.23
            /* JADX WARN: Code duplicated, block: B:11:0x002d  */
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                String str;
                boolean z = false;
                if (i == 0 && (obj instanceof String)) {
                    String str2 = (String) obj;
                    if (str2.contains(com.huawei.openalliance.ad.constant.Constants.PARAM_SERVER_SPLIT)) {
                        String[] strArrSplit = str2.split(com.huawei.openalliance.ad.constant.Constants.PARAM_SERVER_SPLIT);
                        LogUtil.a("WearHomeMainAction", "getIntelligentStatus splits length is ", Integer.valueOf(strArrSplit.length));
                        if (strArrSplit.length == 5) {
                            str = strArrSplit[0];
                            z = true;
                        } else {
                            str = "";
                        }
                    } else {
                        str = "";
                    }
                } else {
                    str = "";
                }
                LogUtil.a("WearHomeMainAction", "getIntelligentStatus isEnable = ", Boolean.valueOf(z));
                tkn.this.d(z, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final boolean z, final String str) {
        this.e.runOnUiThread(new Runnable() { // from class: tkn.24
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("WearHomeMainAction", "updateIntelligentStatus enter");
                if (tkn.this.e.d != null && CommonUtil.ab(BaseApplication.getContext())) {
                    tkn tknVar = tkn.this;
                    tknVar.c(tknVar.e.d, z, str);
                } else {
                    tkn tknVar2 = tkn.this;
                    tknVar2.c(z, str, tknVar2.e.d);
                }
            }
        });
    }

    /* JADX INFO: renamed from: tkn$25, reason: invalid class name */
    class AnonymousClass25 implements FindNetworkUtils.IFindNetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ DeviceInfo f49280a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f49281c;
        final /* synthetic */ String e;

        AnonymousClass25(boolean z, String str, DeviceInfo deviceInfo) {
            this.f49281c = z;
            this.e = str;
            this.f49280a = deviceInfo;
        }

        @Override // com.huawei.ui.device.utlis.FindNetworkUtils.IFindNetworkCallback
        public void onSuccess(final int i, HashMap<String, Object> map) {
            if (tkn.this.e != null) {
                WearHomeOldActivity wearHomeOldActivity = tkn.this.e;
                final boolean z = this.f49281c;
                final String str = this.e;
                final DeviceInfo deviceInfo = this.f49280a;
                wearHomeOldActivity.runOnUiThread(new Runnable() { // from class: tld
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49312b.b(i, z, str, deviceInfo);
                    }
                });
                return;
            }
            LogUtil.j("WearHomeMainAction", "queryRegisterStatus mActivity is null");
        }

        /* synthetic */ void b(int i, boolean z, String str, DeviceInfo deviceInfo) {
            if (i == 1) {
                tkn.this.d(z, str, deviceInfo);
            } else {
                tkn.this.c(z, str, deviceInfo);
            }
        }

        @Override // com.huawei.ui.device.utlis.FindNetworkUtils.IFindNetworkCallback
        public void onFail(String str) {
            LogUtil.j("WearHomeMainAction", "queryRegisterStatus fail message:", str);
            if (tkn.this.e != null) {
                WearHomeOldActivity wearHomeOldActivity = tkn.this.e;
                final boolean z = this.f49281c;
                final String str2 = this.e;
                final DeviceInfo deviceInfo = this.f49280a;
                wearHomeOldActivity.runOnUiThread(new Runnable() { // from class: tlb
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49310b.e(z, str2, deviceInfo);
                    }
                });
                return;
            }
            LogUtil.j("WearHomeMainAction", "queryRegisterStatus mActivity is null");
        }

        /* synthetic */ void e(boolean z, String str, DeviceInfo deviceInfo) {
            tkn.this.c(z, str, deviceInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(DeviceInfo deviceInfo, boolean z, String str) {
        FindNetworkUtils.e(deviceInfo, com.huawei.haf.application.BaseApplication.b(), new AnonymousClass25(z, str, deviceInfo));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z, String str, DeviceInfo deviceInfo) {
        if (z) {
            d(str, String.format(Locale.ENGLISH, this.f49266b.getString(R.string.IDS_device_to_intelligent_home_linkage_remove_pairing), this.f49266b.getString(R.string.IDS_app_name_health), this.f49266b.getString(R.string.IDS_device_intelligent_home)), deviceInfo, false);
        } else {
            e(this.f49266b.getResources().getString(R.string.IDS_unbind_device_wear_home), deviceInfo, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z, String str, DeviceInfo deviceInfo) {
        Resources resources = this.f49266b.getResources();
        if (z) {
            d(str, String.format(Locale.ENGLISH, resources.getString(R.string.IDS_device_to_intelligent_home_linkage_findnet_remove_pairing), resources.getString(R.string.IDS_app_name_health), resources.getString(R.string.IDS_device_intelligent_home)), deviceInfo, true);
        } else {
            e(resources.getString(R.string.IDS_find_network_delete), deviceInfo, true);
        }
    }

    private void d(final String str, String str2, final DeviceInfo deviceInfo, final boolean z) {
        LogUtil.a("WearHomeMainAction", 1, "WearHomeMainAction", "enter showUnbindIntelligentHomeDialog()");
        if (this.l == null) {
            CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.f49266b).a(R.string.IDS_device_wear_home_delete_device).a(str2).a(R.string.IDS_music_management_delete, new View.OnClickListener() { // from class: tkz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f49304a.e(z, deviceInfo, str, view);
                }
            }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: tky
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.e.d(view);
                }
            }).b();
            this.l = customTextAlertDialogB;
            customTextAlertDialogB.setCancelable(false);
            this.l.show();
        }
    }

    /* synthetic */ void e(boolean z, DeviceInfo deviceInfo, String str, View view) {
        if (z) {
            FindNetworkUtils.b(deviceInfo, BaseApplication.getContext());
        }
        h(str);
        this.l.dismiss();
        this.l = null;
    }

    /* synthetic */ void d(View view) {
        LogUtil.d("WearHomeMainAction", "showLoginFail cancel click");
        this.l.dismiss();
        this.l = null;
    }

    private void h(String str) {
        ab();
        LogUtil.d("WearHomeMainAction", "showUnbindDialog ok click");
        lxe.a(BaseApplication.getContext()).d(str, new FitnessCloudCallBack() { // from class: tkn.21
            @Override // com.huawei.callback.FitnessCloudCallBack
            public void onResponce(Object obj) {
                if (obj instanceof ReleaseDeviceLinkageResponse) {
                    ReleaseDeviceLinkageResponse releaseDeviceLinkageResponse = (ReleaseDeviceLinkageResponse) obj;
                    if (releaseDeviceLinkageResponse.getResultCode().intValue() == 0) {
                        tkn.this.m.setSwitchSetting("intelligent_home_linkage", null, tkn.this.e.f26233a, null);
                        LogUtil.a("WearHomeMainAction", "releaseDeviceLinkage is success ", releaseDeviceLinkageResponse.getResultCode(), com.huawei.openalliance.ad.constant.Constants.LINK, releaseDeviceLinkageResponse.getResultDesc());
                        return;
                    } else {
                        LogUtil.j("WearHomeMainAction", "releaseDeviceLinkage is fail ", releaseDeviceLinkageResponse.getResultCode() + com.huawei.openalliance.ad.constant.Constants.LINK, releaseDeviceLinkageResponse.getResultDesc());
                        return;
                    }
                }
                LogUtil.j("WearHomeMainAction", "releaseDeviceLinkage is fail");
            }
        });
    }

    public void h() {
        LogUtil.a("WearHomeMainAction", "showFirstEcgServiceDialog enter");
        if (this.f == null) {
            View viewInflate = View.inflate(this.f49266b, R.layout.dialog_first_ecg_service_tip, null);
            ((HealthTextView) out.b(viewInflate, R.id.ecg_collect_text)).setText(this.f49266b.getResources().getString(R.string.IDS_ecg_service_tip_msg, "599"));
            CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(this.f49266b).a(viewInflate).a(R.string.IDS_hw_common_active_later, new DialogInterface.OnClickListener() { // from class: tkn.2
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    tqp.c(tkn.this.f49266b, 3);
                    LogUtil.a("WearHomeMainAction", "showFirstEcgServiceDialog, user click cancel");
                }
            }).d(R.string.IDS_hw_common_ui_dialog_active, new DialogInterface.OnClickListener() { // from class: tkn.29
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    tqp.c(tkn.this.f49266b, 2);
                    tkn.this.ad();
                }
            }).b();
            this.f = customAlertDialogB;
            HealthButton healthButton = (HealthButton) customAlertDialogB.findViewById(R.id.dialog_btn_positive);
            healthButton.setTextColor(this.f49266b.getResources().getColor(R.color.hwbutton_selector_text_emphasize_emui, null));
            healthButton.setBackgroundResource(R.drawable.button_background_emphasize);
            ((HealthButtonBarLayout) this.f.findViewById(R.id.button_bar)).setDividerDrawable(this.f49266b.getResources().getDrawable(R.drawable.custom_dialog_divider_vertical_trusparent, null));
            this.f.setCancelable(false);
        }
        if (this.f.isShowing() || this.e.isFinishing()) {
            return;
        }
        this.f.show();
        lvb.e().setSharedPreference("KEY_SHOW_ECG_SERVICE_ACTIVATION_TIP_FLAG", String.valueOf(System.currentTimeMillis()), null);
        tqp.c(this.f49266b, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ad() {
        boolean z = false;
        boolean zIsSupportEcgAuth = this.e.e != null ? this.e.e.isSupportEcgAuth() : false;
        if (eey.d(this.e.d, 106) && fej.a("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.h5.ecgce")) {
            z = true;
        }
        boolean zO = Utils.o();
        LogUtil.a("WearHomeMainAction", "startEcgForParamsByCapability isSupportEcgAuth:", Boolean.valueOf(zIsSupportEcgAuth), ", isSupportEcgAnalysis:", Boolean.valueOf(z), ", isOversea:", Boolean.valueOf(zO));
        if (z) {
            LogUtil.a("WearHomeMainAction", "startEcgForParamsByCapability start ecg analysis");
            prf.d(BaseApplication.getContext(), "com.huawei.health.h5.ecgce", 1, "interpretation");
        } else {
            if (!zIsSupportEcgAuth || zO) {
                return;
            }
            prf.d(BaseApplication.getContext(), "com.huawei.health.ecg.collection", 1, "interpretation");
        }
    }

    public void b(String str) {
        DeviceInfo deviceInfoE = tfn.a().e(str);
        if (deviceInfoE == null) {
            LogUtil.j("WearHomeMainAction", "showDialogRateReminder current device info is null");
            return;
        }
        if (eel.a(deviceInfoE.getProductType())) {
            CustomAlertDialog customAlertDialog = this.f49265a;
            if (customAlertDialog != null && customAlertDialog.isShowing()) {
                LogUtil.d("WearHomeMainAction", "showWearShoesDialog Already show!");
                this.e.e(WearHomeOldActivity.EnumDialog.RATE);
                return;
            } else {
                w();
                return;
            }
        }
        if (eel.b(deviceInfoE.getProductType())) {
            s();
        } else {
            h(deviceInfoE);
        }
    }

    private void h(DeviceInfo deviceInfo) {
        final boolean z;
        CustomAlertDialog customAlertDialog = this.f49265a;
        if (customAlertDialog != null && customAlertDialog.isShowing()) {
            this.e.e(WearHomeOldActivity.EnumDialog.RATE);
            return;
        }
        final View viewInflate = LayoutInflater.from(this.f49266b).inflate(R.layout.fragment_set_rate_reminder_dialog, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.fragment_set_rate_reminder_dialog_image);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.fragment_set_rate_reminder_dialog_text);
        if (deviceInfo == null) {
            LogUtil.a("WearHomeMainAction", "refresh dialog Support deviceInfo is null , return");
            this.e.e(WearHomeOldActivity.EnumDialog.RATE);
            return;
        }
        if (deviceInfo.getProductType() == 3 || deviceInfo.getProductType() == 10 || deviceInfo.getProductType() == 8) {
            imageView.setImageResource(R.drawable.home_set_rate_watch_remider_image);
            healthTextView.setText(R.string.IDS_main_homefragment_rate_reminder_watch_text);
        } else if (b(deviceInfo)) {
            imageView.setImageResource(R.drawable.home_set_rate_band_remider_image);
            healthTextView.setText(R.string.IDS_main_homefragment_rate_reminder_band_text);
        } else {
            if (eel.e(deviceInfo.getProductType())) {
                imageView.setImageResource(R.mipmap.pic_runing_schema);
                healthTextView.setText(R.string.IDS_aw_running_mode_describe_dialog);
                z = false;
            } else if (!b(deviceInfo.getProductType(), imageView, healthTextView)) {
                this.e.e(WearHomeOldActivity.EnumDialog.RATE);
                return;
            }
            ThreadPoolManager.c().execute(new Runnable() { // from class: tkn.3
                @Override // java.lang.Runnable
                public void run() {
                    if (z && tkn.this.e.d != null) {
                        if (eep.c(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(lvi.j(tkn.this.e.d.getProductType())))) {
                            LogUtil.a("WearHomeMainAction", "exist show guide page config");
                            return;
                        }
                    }
                    tkn.this.e.runOnUiThread(new Runnable() { // from class: tkn.3.4
                        @Override // java.lang.Runnable
                        public void run() {
                            tkn.this.g(viewInflate);
                        }
                    });
                }
            });
        }
        z = true;
        ThreadPoolManager.c().execute(new Runnable() { // from class: tkn.3
            @Override // java.lang.Runnable
            public void run() {
                if (z && tkn.this.e.d != null) {
                    if (eep.c(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(lvi.j(tkn.this.e.d.getProductType())))) {
                        LogUtil.a("WearHomeMainAction", "exist show guide page config");
                        return;
                    }
                }
                tkn.this.e.runOnUiThread(new Runnable() { // from class: tkn.3.4
                    @Override // java.lang.Runnable
                    public void run() {
                        tkn.this.g(viewInflate);
                    }
                });
            }
        });
    }

    private boolean b(DeviceInfo deviceInfo) {
        return deviceInfo.getProductType() == 13 || deviceInfo.getProductType() == 15 || deviceInfo.getProductType() == 16 || deviceInfo.getProductType() == 12;
    }

    public void i() {
        if (this.e.d == null) {
            LogUtil.j("WearHomeMainAction", "showUserGuideDialog, currentDeviceInfo is null");
        } else {
            final String strJ = lvi.j(this.e.d.getProductType());
            ThreadPoolManager.c().execute(new Runnable() { // from class: tkn.4
                @Override // java.lang.Runnable
                public void run() {
                    edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(strJ);
                    if (pluginInfoByUuid == null) {
                        LogUtil.j("WearHomeMainAction", "ezPluginInfo is null");
                        return;
                    }
                    boolean zE = rgd.d(tkn.this.e.d, false).e();
                    ArrayList arrayList = new ArrayList();
                    List<List<String>> listD = eep.d(pluginInfoByUuid);
                    if (zE) {
                        for (List<String> list : listD) {
                            if (list.size() >= 2) {
                                arrayList.add(list.get(1));
                            }
                        }
                    } else {
                        arrayList.addAll(eep.a(pluginInfoByUuid, "guide_data", ""));
                    }
                    tkn.this.a(strJ, pluginInfoByUuid, (ArrayList<String>) arrayList);
                }
            });
        }
    }

    public void d(final Activity activity, final DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("R_GRS_WearHomeMainAction", "showXiaoYiDialog enter.");
        if (deviceInfo != null && activity != null) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: tkn.1
                @Override // java.lang.Runnable
                public void run() {
                    tkn.this.e(activity, deviceInfo);
                }
            });
        } else if (this.e.d == null) {
            LogUtil.j("WearHomeMainAction", "showXiaoYiDialog, currentDeviceInfo is null");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: tkn.10
                @Override // java.lang.Runnable
                public void run() {
                    tkn tknVar = tkn.this;
                    tknVar.e(tknVar.e, tkn.this.e.d);
                }
            });
        }
    }

    public void e(final Activity activity, DeviceInfo deviceInfo) {
        final String strJ = lvi.j(deviceInfo.getProductType());
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(strJ);
        if (pluginInfoByUuid == null) {
            LogUtil.j("WearHomeMainAction", "showXiaoYiDialog ezPluginInfo is null");
            return;
        }
        final ArrayList<String> arrayListA = eep.a(pluginInfoByUuid, "xiao_yi_guide_data", deviceInfo.getHiLinkDeviceId());
        final List<List<String>> listD = eep.d(pluginInfoByUuid, "xiao_yi_guide_data", deviceInfo.getHiLinkDeviceId());
        final ArrayList<String> arrayListB = eep.b(pluginInfoByUuid, "xiao_yi_guide_data", deviceInfo.getHiLinkDeviceId());
        if (arrayListA == null || arrayListA.isEmpty() || arrayListA.size() != listD.size()) {
            ReleaseLogUtil.e("R_GRS_WearHomeMainAction", "guide description is null, is do not support xiaoyi dialog");
            return;
        }
        final int iE = eep.e(pluginInfoByUuid);
        final int iA = eep.a(pluginInfoByUuid);
        activity.runOnUiThread(new Runnable() { // from class: tkn.8
            @Override // java.lang.Runnable
            public void run() {
                LogUtil.a("WearHomeMainAction", "showXiaoYiDialog runOnUiThread enter.");
                CustomStateDialog.Builder builder = new CustomStateDialog.Builder(activity);
                builder.e(strJ).e(arrayListB).a(arrayListA).c(listD).d(iE);
                CustomStateDialog customStateDialogA = builder.a(iA);
                customStateDialogA.setCanceledOnTouchOutside(false);
                if (customStateDialogA.isShowing() || activity.isFinishing()) {
                    return;
                }
                customStateDialogA.show();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final String str, edl edlVar, final ArrayList<String> arrayList) {
        final List<List<String>> listD = eep.d(edlVar, "guide_data", "");
        final ArrayList<String> arrayListB = eep.b(edlVar, "guide_data", "");
        WearHomeOldActivity wearHomeOldActivity = this.e;
        if (wearHomeOldActivity != null && wearHomeOldActivity.d != null) {
            eep.e(edlVar, this.e.d.getHiLinkDeviceId(), arrayListB, arrayList, listD);
        }
        if (arrayList == null || arrayList.isEmpty() || arrayList.size() != listD.size()) {
            LogUtil.j("WearHomeMainAction", "guide description is null, is do not support guide dialog");
            return;
        }
        final int iE = eep.e(edlVar);
        final int iA = eep.a(edlVar);
        this.e.runOnUiThread(new Runnable() { // from class: tkn.9
            @Override // java.lang.Runnable
            public void run() {
                CustomStateDialog.Builder builder = new CustomStateDialog.Builder(tkn.this.f49266b);
                builder.e(str).e(arrayListB).a(arrayList).c(listD).d(iE);
                CustomStateDialog customStateDialogA = builder.a(iA);
                customStateDialogA.setCanceledOnTouchOutside(false);
                if (customStateDialogA.isShowing() || tkn.this.e.isFinishing()) {
                    return;
                }
                customStateDialogA.show();
                new GuideInteractors(tkn.this.f49266b).c(erh.d(tkn.this.e.d.getDeviceIdentify()));
            }
        });
    }

    public void g() {
        CustomAlertDialog customAlertDialog = this.j;
        if (customAlertDialog != null && customAlertDialog.isShowing()) {
            LogUtil.j("WearHomeMainAction", "mEarCustomDialog isShowing");
        } else {
            ThreadPoolManager.c().execute(new Runnable() { // from class: tkn.7
                @Override // java.lang.Runnable
                public void run() {
                    View viewInflate = LayoutInflater.from(tkn.this.f49266b).inflate(R.layout.ear_muff_dialog_content_layout, (ViewGroup) null);
                    ((HealthTextView) viewInflate.findViewById(R.id.ear_muff_title)).setText(R.string.IDS_ear_remove_title);
                    ((HealthTextView) viewInflate.findViewById(R.id.ear_muff_content)).setText(R.string.IDS_ear_remove_content);
                    View viewInflate2 = LayoutInflater.from(tkn.this.f49266b).inflate(R.layout.ear_muff_dialog_content_layout, (ViewGroup) null);
                    ((HealthTextView) viewInflate2.findViewById(R.id.ear_muff_title)).setText(R.string.IDS_ear_install_title);
                    ((HealthTextView) viewInflate2.findViewById(R.id.ear_muff_content)).setText(R.string.IDS_ear_install_content);
                    tkn.this.e(viewInflate, viewInflate2);
                    final View viewInflate3 = LayoutInflater.from(tkn.this.f49266b).inflate(R.layout.ear_muff_viewpager, (ViewGroup) null);
                    ArrayList arrayList = new ArrayList(16);
                    arrayList.add(viewInflate);
                    arrayList.add(viewInflate2);
                    HealthViewPager healthViewPager = (HealthViewPager) viewInflate3.findViewById(R.id.viewpager);
                    healthViewPager.setAdapter(new tli(arrayList));
                    healthViewPager.setCurrentItem(0);
                    healthViewPager.setIsAutoHeight(true);
                    HealthDotsPageIndicator healthDotsPageIndicator = (HealthDotsPageIndicator) viewInflate3.findViewById(R.id.indicator);
                    healthDotsPageIndicator.setRtlEnable(true);
                    healthDotsPageIndicator.setViewPager(healthViewPager);
                    tkn.this.c(healthViewPager, (ArrayList<View>) arrayList);
                    if (tkn.this.e != null) {
                        tkn.this.e.runOnUiThread(new Runnable() { // from class: tkn.7.3
                            @Override // java.lang.Runnable
                            public void run() {
                                tkn.this.f(viewInflate3);
                            }
                        });
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(View view, View view2) {
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(lvi.j(this.e.d.getProductType()));
        if (pluginInfoByUuid == null) {
            LogUtil.j("WearHomeMainAction", "ezPluginInfo is null");
            return;
        }
        ArrayList<String> arrayListB = eep.b(pluginInfoByUuid, 6);
        if (arrayListB == null) {
            LogUtil.j("WearHomeMainAction", "removalList is null");
            return;
        }
        this.h = new AnimationDrawable();
        LogUtil.a("WearHomeMainAction", "removalList size is:", Integer.valueOf(arrayListB.size()));
        Iterator<String> it = arrayListB.iterator();
        while (it.hasNext()) {
            Bitmap bitmapE = e(pluginInfoByUuid, it.next());
            if (bitmapE != null) {
                this.h.addFrame(new BitmapDrawable(bitmapE), 100);
            }
        }
        ((ImageView) view.findViewById(R.id.ear_muff_image)).setImageDrawable(this.h);
        this.h.setOneShot(false);
        this.h.start();
        ArrayList<String> arrayListB2 = eep.b(pluginInfoByUuid, 5);
        if (arrayListB2 == null) {
            LogUtil.j("WearHomeMainAction", "installList is null");
            return;
        }
        this.i = new AnimationDrawable();
        LogUtil.a("WearHomeMainAction", "installList size is:", Integer.valueOf(arrayListB2.size()));
        Iterator<String> it2 = arrayListB2.iterator();
        while (it2.hasNext()) {
            Bitmap bitmapE2 = e(pluginInfoByUuid, it2.next());
            if (bitmapE2 != null) {
                this.i.addFrame(new BitmapDrawable(bitmapE2), 100);
            }
        }
        ((ImageView) view2.findViewById(R.id.ear_muff_image)).setImageDrawable(this.i);
        this.i.setOneShot(false);
        this.i.start();
    }

    private Bitmap e(edl edlVar, String str) {
        return ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).loadImageByImagePath(pig.c().e(edlVar.c()) + File.separator + edlVar.c() + File.separator + "img" + File.separator + str + ".png");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(HealthViewPager healthViewPager, final ArrayList<View> arrayList) {
        healthViewPager.setOnPageChangeListener(new HealthViewPager.OnPageChangeListener() { // from class: tkn.6
            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrolled(int i, float f, int i2) {
                LogUtil.d("WearHomeMainAction", "onPageScrolled position ", Integer.valueOf(i));
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageSelected(int i) {
                if (i < 0 || i >= arrayList.size()) {
                    LogUtil.j("WearHomeMainAction", "onPageSelected position error:", Integer.valueOf(i));
                    return;
                }
                LogUtil.a("WearHomeMainAction", "onPageSelected position ", Integer.valueOf(i));
                if (i == 0) {
                    if (tkn.this.i != null) {
                        tkn.this.i.stop();
                    }
                    if (tkn.this.h != null) {
                        if (tkn.this.h.isRunning()) {
                            tkn.this.h.stop();
                        }
                        tkn.this.h.start();
                        return;
                    }
                    return;
                }
                if (tkn.this.h != null) {
                    tkn.this.h.stop();
                }
                if (tkn.this.i != null) {
                    if (tkn.this.i.isRunning()) {
                        tkn.this.i.stop();
                    }
                    tkn.this.i.start();
                }
            }

            @Override // com.huawei.uikit.hwviewpager.widget.HwViewPager.OnPageChangeListener
            public void onPageScrollStateChanged(int i) {
                LogUtil.d("WearHomeMainAction", "in onPageScrollStateChanged", Integer.valueOf(i));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(View view) {
        LogUtil.a("WearHomeMainAction", "showDialogEarMuffDialog");
        CustomAlertDialog.Builder builderA = new CustomAlertDialog.Builder(this.f49266b).a(R.string.IDS_common_notification_know_tips, new DialogInterface.OnClickListener() { // from class: tkn.14
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (tkn.this.j != null) {
                    tkn.this.j.dismiss();
                    tkn.this.j = null;
                }
                if (tkn.this.i != null) {
                    tkn.this.i.stop();
                    tkn.this.i = null;
                }
                if (tkn.this.h != null) {
                    tkn.this.h.stop();
                    tkn.this.h = null;
                }
            }
        });
        this.j = builderA.b();
        builderA.a(view);
        this.j.setCancelable(false);
        if (this.j.isShowing() || this.e.isFinishing()) {
            return;
        }
        this.j.show();
    }

    private boolean b(int i, ImageView imageView, HealthTextView healthTextView) {
        if (imageView == null || healthTextView == null) {
            return false;
        }
        edl pluginInfoByDeviceType = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByDeviceType(i);
        int iAf = (pluginInfoByDeviceType == null || pluginInfoByDeviceType.i() == null) ? -1 : pluginInfoByDeviceType.i().af();
        if (iAf == 1) {
            imageView.setImageResource(R.drawable.home_set_rate_band_remider_image);
            healthTextView.setText(R.string.IDS_main_homefragment_rate_reminder_band_text);
            return true;
        }
        if (iAf != 2) {
            return false;
        }
        imageView.setImageResource(R.drawable.home_set_rate_watch_remider_image);
        healthTextView.setText(R.string.IDS_main_homefragment_rate_reminder_watch_text);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(View view) {
        CustomAlertDialog.Builder builderA = new CustomAlertDialog.Builder(this.f49266b).a(R.string.IDS_common_notification_know_tips, new DialogInterface.OnClickListener() { // from class: tkn.11
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (tkn.this.f49265a != null) {
                    tkn.this.f49265a.dismiss();
                    tkn.this.f49265a = null;
                }
                tkn.this.e.e(WearHomeOldActivity.EnumDialog.RATE);
            }
        });
        this.f49265a = builderA.b();
        builderA.a(view);
        this.f49265a.setCancelable(false);
        if (this.f49265a.isShowing() || this.e.isFinishing()) {
            return;
        }
        this.f49265a.show();
    }

    private void s() {
        CustomAlertDialog customAlertDialog = this.f49265a;
        if (customAlertDialog != null && customAlertDialog.isShowing()) {
            LogUtil.d("WearHomeMainAction", "showAw70ProWearWristsDialog Already show!");
            this.e.e(WearHomeOldActivity.EnumDialog.RATE);
        } else {
            e(new CustomAlertDialog.Builder(this.f49266b).a(R.string.IDS_startup_next, new DialogInterface.OnClickListener() { // from class: tkn.12
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    tkn.this.w();
                }
            }), e(1));
        }
    }

    private void e(CustomAlertDialog.Builder builder, View view) {
        this.f49265a = builder.b();
        builder.a(view);
        this.f49265a.setCancelable(false);
        if (this.f49265a.isShowing() || this.e.isFinishing()) {
            return;
        }
        this.f49265a.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        e(new CustomAlertDialog.Builder(this.f49266b).a(R.string.IDS_startup_next, new DialogInterface.OnClickListener() { // from class: tkn.15
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (tkn.this.f49265a != null) {
                    tkn.this.f49265a.dismiss();
                    tkn.this.f49265a = null;
                }
                tkn.this.z();
            }
        }), e(2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        e(new CustomAlertDialog.Builder(this.f49266b).a(R.string.IDS_user_permission_know, new DialogInterface.OnClickListener() { // from class: tkn.18
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                if (tkn.this.f49265a != null) {
                    tkn.this.f49265a.dismiss();
                    tkn.this.f49265a = null;
                }
            }
        }), e(3));
    }

    private View e(int i) {
        View viewInflate = LayoutInflater.from(this.f49266b).inflate(R.layout.fragment_aw70_pro_dialog, (ViewGroup) null);
        ImageView imageView = (ImageView) viewInflate.findViewById(R.id.aw70_pro_example_start_run_img);
        ImageView imageView2 = (ImageView) viewInflate.findViewById(R.id.aw70_pro_prompt_img);
        HealthTextView healthTextView = (HealthTextView) viewInflate.findViewById(R.id.aw70_pro_prompt_title);
        HealthTextView healthTextView2 = (HealthTextView) viewInflate.findViewById(R.id.aw70_pro_prompt_first_content);
        HealthTextView healthTextView3 = (HealthTextView) viewInflate.findViewById(R.id.aw70_pro_prompt_second_content);
        HealthTextView healthTextView4 = (HealthTextView) viewInflate.findViewById(R.id.aw70_pro_prompt_third_content);
        if (i == 1) {
            imageView.setImageResource(R.mipmap.pic_aw70_pro_wear_wrists);
            imageView2.setVisibility(8);
            healthTextView.setText(R.string.IDS_aw70_pro_prompt_wear_wrists);
            healthTextView2.setText(this.e.getString(R.string.IDS_aw70_pro_prompt_wear_wrists_first_content, new Object[]{1}));
            healthTextView3.setText(this.e.getString(R.string.IDS_aw70_pro_prompt_wear_wrists_second_content, new Object[]{2}));
            healthTextView4.setVisibility(8);
            return viewInflate;
        }
        if (i == 2) {
            imageView2.setImageResource(R.mipmap.pic_aw70_pro_wear_shoe);
            imageView.setVisibility(8);
            healthTextView.setText(R.string.IDS_aw70_pro_prompt_wear_shoe);
            healthTextView2.setText(this.e.getString(R.string.IDS_aw70_pro_prompt_wear_shoe_first_content, new Object[]{1}));
            healthTextView3.setText(this.e.getString(R.string.IDS_aw70_pro_prompt_wear_shoe_second_content, new Object[]{2}));
            healthTextView4.setVisibility(8);
            return viewInflate;
        }
        if (i == 3) {
            imageView.setImageResource(R.mipmap.pic_wearing_aw70_pro_foot);
            imageView2.setVisibility(8);
            healthTextView.setText(R.string.IDS_main_time_line_start_workout);
            healthTextView2.setVisibility(8);
            healthTextView3.setVisibility(8);
            healthTextView4.setVisibility(0);
            healthTextView4.setText(R.string.IDS_aw70_pro_prompt_start_exercise_content);
            return viewInflate;
        }
        LogUtil.d("WearHomeMainAction", "loadAw70ProDialogView is not exist");
        return viewInflate;
    }

    public void l() {
        ab();
    }

    private void ab() {
        LogUtil.a("WearHomeMainAction", 0, "WearHomeMainAction", "Enter unbindDevice");
        List<DeviceInfo> listK = tfn.a().k();
        this.e.d = tfn.a().e(this.e.f26233a);
        DeviceInfo deviceInfo = null;
        if (this.e.d != null && listK != null && listK.size() > 0) {
            rcw.b(BaseApplication.getContext()).b(this.e.d);
            rcw.b(BaseApplication.getContext()).g(this.e.f26233a);
            int iIndexOf = -1;
            for (DeviceInfo deviceInfo2 : listK) {
                if (deviceInfo2.getDeviceIdentify().equals(this.e.d.getDeviceIdentify())) {
                    iIndexOf = listK.indexOf(deviceInfo2);
                }
            }
            LogUtil.a("WearHomeMainAction", 0, "WearHomeMainAction", "deleteUseDeviceList() id is ", Integer.valueOf(iIndexOf));
            if (iIndexOf != -1) {
                DeviceInfo deviceInfoRemove = listK.remove(iIndexOf);
                p();
                deviceInfo = deviceInfoRemove;
            }
            t();
            if (this.e.e != null && this.e.e.isSupportSyncWifi()) {
                KeyValDbManager.d(BaseApplication.getContext()).b("saved_support_sync_wifi", "0");
            }
            rdt.e(this.e.d);
            tqp.a(this.e.d.getProductType(), this.e.f26233a);
        }
        if (this.e.d == null && listK != null && listK.size() > 0) {
            int iB = b(listK);
            LogUtil.a("WearHomeMainAction", 0, "WearHomeMainAction", "deleteUseDeviceList() id is ", Integer.valueOf(iB));
            if (iB != -1) {
                DeviceInfo deviceInfoRemove2 = listK.remove(iB);
                p();
                deviceInfo = deviceInfoRemove2;
            }
            t();
        }
        f(deviceInfo);
        if (deviceInfo != null) {
            c(deviceInfo);
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: tkq
            @Override // java.lang.Runnable
            public final void run() {
                this.d.b();
            }
        });
        lvb.e().b("deleteDevice", deviceInfo, 0, "");
    }

    /* synthetic */ void b() {
        n();
        LogUtil.a("WearHomeMainAction", "unbindDevice delete DeviceInfo success");
    }

    private int b(List<DeviceInfo> list) {
        int iIndexOf = -1;
        for (DeviceInfo deviceInfo : list) {
            if (deviceInfo.getDeviceIdentify().equals(this.e.f26233a)) {
                iIndexOf = list.indexOf(deviceInfo);
            }
        }
        return iIndexOf;
    }

    private void p() {
        LogUtil.a("WearHomeMainAction", "deleteDevice");
        ArrayList arrayList = new ArrayList(16);
        arrayList.add(this.e.f26233a);
        tfn.a().b(arrayList, true);
    }

    private void c(DeviceInfo deviceInfo) {
        LogUtil.a("WearHomeMainAction", "removeCloudDevice removedDeviceInfo is ", deviceInfo.toString());
        String deviceModel = deviceInfo.getDeviceModel();
        if (deviceModel == null || !deviceModel.toUpperCase(Locale.ENGLISH).contains("HECTOR")) {
            LogUtil.j("WearHomeMainAction", "removeCloudDevice getDeviceModel not contains HECTOR");
        } else {
            final String deviceName = deviceInfo.getDeviceName();
            this.e.u.execute(new Runnable() { // from class: tkn.17
                @Override // java.lang.Runnable
                public void run() {
                    LogUtil.a("WearHomeMainAction", "removeCloudDevice run() getAllBindDeviceSync");
                    GetBindDeviceRsp getBindDeviceRspA = lqo.b(tkn.this.f49266b).a(new GetBindDeviceReq());
                    if (!tkn.this.b(getBindDeviceRspA)) {
                        LogUtil.e("WearHomeMainAction", "removeCloudDevice getBindDeviceSync error");
                        return;
                    }
                    List<com.huawei.hwcloudmodel.model.userprofile.DeviceInfo> deviceInfos = getBindDeviceRspA.getDeviceInfos();
                    if (deviceInfos == null || deviceInfos.isEmpty()) {
                        LogUtil.j("WearHomeMainAction", "getBindDeviceSync deviceInfos is null");
                        return;
                    }
                    for (com.huawei.hwcloudmodel.model.userprofile.DeviceInfo deviceInfo2 : deviceInfos) {
                        if (deviceName == null || deviceInfo2 == null || TextUtils.isEmpty(deviceInfo2.getName())) {
                            LogUtil.j("WearHomeMainAction", "getBindDeviceSync info data error");
                        } else if (deviceInfo2.getName().equals(deviceName)) {
                            LogUtil.a("WearHomeMainAction", "cloud DeviceInfo is ", deviceInfo2.toString());
                            tkn.this.a(deviceInfo2.getDeviceCode().longValue());
                            return;
                        }
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b(GetBindDeviceRsp getBindDeviceRsp) {
        if (getBindDeviceRsp == null) {
            LogUtil.j("WearHomeMainAction", "checkCloudResponse response is null");
            return false;
        }
        Integer resultCode = getBindDeviceRsp.getResultCode();
        int iIntValue = resultCode.intValue();
        LogUtil.a("WearHomeMainAction", "checkCloudResponse response resultCode is,", resultCode);
        return iIntValue == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(long j) {
        LogUtil.a("WearHomeMainAction", "unBindDevice enter");
        UnbindDeviceRequest unbindDeviceRequest = new UnbindDeviceRequest();
        unbindDeviceRequest.setDeviceCode(Long.valueOf(j));
        CloudCommonReponse cloudCommonReponseD = lqo.b(this.f49266b).d(unbindDeviceRequest);
        if (cloudCommonReponseD != null) {
            LogUtil.a("WearHomeMainAction", "unBindDevice response is ", cloudCommonReponseD.toString());
        } else {
            LogUtil.j("WearHomeMainAction", "unBindDevice response is null");
        }
    }

    private void n() {
        MessageCenterApi messageCenterApi = (MessageCenterApi) Services.b("PluginMessageCenter", MessageCenterApi.class);
        List<MessageObject> messages = messageCenterApi.getMessages(String.valueOf(19), "device_type_connected");
        LogUtil.a("WearHomeMainAction", "deleteDeviceInfo, delete messageList, messageList.size():", Integer.valueOf(messages.size()));
        int size = messages.size();
        for (int i = 0; i < size; i++) {
            try {
                messageCenterApi.deleteMessage(messages.get(i).getMsgId());
                lvb.e().setSharedPreference("kStorage_DeviceCfgMgr_Identify", "", null);
                LogUtil.d("WearHomeMainAction", "deleteDeviceInfo delete success");
            } catch (NumberFormatException unused) {
                LogUtil.e("WearHomeMainAction", "deleteDeviceInfo error");
                return;
            }
        }
    }

    private void f(DeviceInfo deviceInfo) {
        e(deviceInfo);
        if (!Utils.o() && deviceInfo != null) {
            ProfileAgent.PROFILE_AGENT.connectProfile(new b(deviceInfo.getSecurityUuid() + "#ANDROID21"));
        }
        meo.a().e(deviceInfo);
        this.e.m = false;
        this.e.finish();
    }

    private void e(DeviceInfo deviceInfo) {
        if (deviceInfo != null) {
            LogUtil.a("WearHomeMainAction", "get device info");
            String strD = erh.d(deviceInfo.getDeviceIdentify());
            String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(PrebakedEffectId.RT_COIN_DROP), strD);
            LogUtil.a("WearHomeMainAction", "sharedPreferenceResult is ", strE);
            if (!TextUtils.isEmpty(strE) && strE.equals("0")) {
                SharedPreferenceManager.b(BaseApplication.getContext(), String.valueOf(PrebakedEffectId.RT_COIN_DROP), strD);
            }
            SharedPreferenceManager.b(BaseApplication.getContext(), String.valueOf(10005), "keyUserGuidePage" + strD);
            SharedPreferenceManager.b(BaseApplication.getContext(), String.valueOf(10008), "keyToastShowTime" + strD);
            KeyValDbManager.d(BaseApplication.getContext()).d("downloadHiAiPlugin");
        }
    }

    private void e(String str, final DeviceInfo deviceInfo, final boolean z) {
        LogUtil.a("WearHomeMainAction", 1, "WearHomeMainAction", "enter showRestoreFactoryDialog()");
        CustomTextAlertDialog.Builder builderE = new CustomTextAlertDialog.Builder(this.f49266b).a(R.string.IDS_device_wear_home_delete_device).a(str).a(R.string.IDS_unbind_device_wear_home_unpair, new View.OnClickListener() { // from class: tkt
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.e.a(z, deviceInfo, view);
            }
        }).e(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: tkp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("WearHomeMainAction", "showLoginFail cancel click");
            }
        });
        if (this.e.isFinishing()) {
            return;
        }
        CustomTextAlertDialog customTextAlertDialogB = builderE.b();
        customTextAlertDialogB.setCancelable(false);
        customTextAlertDialogB.show();
    }

    /* synthetic */ void a(boolean z, DeviceInfo deviceInfo, View view) {
        LogUtil.a("WearHomeMainAction", "showUnbindDialog ok click");
        if (z) {
            FindNetworkUtils.b(deviceInfo, BaseApplication.getContext());
        }
        rdt.e(3);
        ab();
    }

    private void y() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.f49266b).a(this.f49266b.getResources().getString(R.string.IDS_device_ota_later_note)).c(R.string.IDS_user_permission_know, new View.OnClickListener() { // from class: tkx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("WearHomeMainAction", "showTipDialog，click known button");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public void j() {
        if (this.e.e != null && this.e.e.isSupportSyncAccount()) {
            v();
        } else {
            LogUtil.j("WearHomeMainAction", "showDialogSyncAccount current device does not support sync account");
        }
    }

    public void m() {
        EventBus.ICallback iCallback = this.g;
        if (iCallback != null) {
            EventBus.a(iCallback, "sign_account_hms_login_state_action");
        }
    }

    public void k() {
        EventBus.ICallback iCallback = this.g;
        if (iCallback != null) {
            EventBus.b(iCallback, 1, "sign_account_hms_login_state_action");
        }
    }

    private void v() {
        LogUtil.a("WearHomeMainAction", 1, "WearHomeMainAction", "enter showSyncAccountDialog()");
        if (this.n == null) {
            if (!Utils.h()) {
                ReleaseLogUtil.d("R_GRS_WearHomeMainAction", "showSyncAccountDialog no cloud empty account");
                lvj.c().b(2);
            } else {
                c(new BaseResponseCallback() { // from class: tku
                    @Override // com.huawei.health.userprofilemgr.model.BaseResponseCallback
                    public final void onResponse(int i, Object obj) {
                        this.f49302a.d(i, (String) obj);
                    }
                });
            }
        }
    }

    /* synthetic */ void d(int i, final String str) {
        LogUtil.a("WearHomeMainAction", "getAccountPlainTextInfo errorCode:", Integer.valueOf(i));
        if (this.e == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            LogUtil.a("WearHomeMainAction", "showSyncAccountDialog accountName is null");
        } else {
            this.e.runOnUiThread(new Runnable() { // from class: tks
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.e(str);
                }
            });
        }
    }

    /* synthetic */ void e(String str) {
        if (this.e.isDestroyed() || this.e.isFinishing() || this.n != null) {
            return;
        }
        String strC = tqo.c(str);
        boolean zMatches = Pattern.compile("^([0-9]|(\\+))\\d+$").matcher(str).matches();
        if ((LanguageUtil.z(this.f49266b) || LanguageUtil.x(this.f49266b)) && zMatches) {
            LogUtil.a("WearHomeMainAction", "enter isUrduLanguage or isFarsiLanguage");
            String strSubstring = strC.substring(0, 3);
            String strSubstring2 = strC.substring(strC.length() - 2, strC.length());
            StringBuilder sb = new StringBuilder(16);
            sb.append(strC);
            sb.replace(0, 3, strSubstring2);
            sb.replace(sb.length() - 3, sb.length(), strSubstring);
            LogUtil.a("WearHomeMainAction", "stringBuilder:", sb.toString());
            strC = sb.toString();
        }
        a(strC);
    }

    private void a(String str) {
        String str2 = String.format(Locale.ENGLISH, this.f49266b.getString(R.string.IDS_device_wear_home_sync_account_content), str);
        if (qrs.ah(BaseApplication.getContext())) {
            str2 = String.format(Locale.ENGLISH, this.f49266b.getString(R.string.IDS_sync_account_content_pad), str);
        }
        final GuideInteractors guideInteractors = new GuideInteractors(this.f49266b);
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.f49266b).a(R.string.IDS_device_wear_home_sync_account_title).a(str2).a(R.string.IDS_device_wear_home_confirm_sync_account, new View.OnClickListener() { // from class: tkl
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49263b.d(guideInteractors, view);
            }
        }).e(R.string.IDS_device_wear_home_skip_sync_account, new View.OnClickListener() { // from class: tkr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.e(guideInteractors, view);
            }
        }).b();
        this.n = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        if (this.n.isShowing() || this.e.isFinishing()) {
            return;
        }
        this.n.show();
    }

    /* synthetic */ void d(GuideInteractors guideInteractors, View view) {
        d(guideInteractors);
    }

    /* synthetic */ void e(GuideInteractors guideInteractors, View view) {
        ReleaseLogUtil.d("R_GRS_WearHomeMainAction", "showSyncAccountDialog skip click");
        guideInteractors.c(this.e.f26233a, false);
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10005), "KEY_SHOW_SYNC_ACCOUNT_ARK_UI_ON_REMINDERS_FLAG".concat(this.e.f26233a), "UNCOMPLETE", null);
        this.n.dismiss();
        this.n = null;
        lvj.c().b(0);
    }

    private void c(final BaseResponseCallback<String> baseResponseCallback) {
        ThreadPoolManager.c().a("getAccountPlainTextInfo", new Runnable() { // from class: tkm
            @Override // java.lang.Runnable
            public final void run() {
                this.f49264a.a(baseResponseCallback);
            }
        });
    }

    /* synthetic */ void a(BaseResponseCallback baseResponseCallback) {
        final String[] strArr = {""};
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1001, new StorageDataCallback() { // from class: tkn.16
            @Override // com.huawei.hwdataaccessmodel.utils.StorageDataCallback
            public void onProcessed(StorageResult storageResult) {
                if (storageResult.b() == 0) {
                    strArr[0] = String.valueOf(storageResult.c());
                } else {
                    LogUtil.j("WearHomeMainAction", "getAccountInfo getErrorCode:", Integer.valueOf(storageResult.b()));
                }
                countDownLatch.countDown();
            }
        });
        try {
            if (!countDownLatch.await(3L, TimeUnit.SECONDS)) {
                ReleaseLogUtil.e("R_GRS_WearHomeMainAction", "getAccountPlainTextInfo timeout");
            }
        } catch (InterruptedException unused) {
            ReleaseLogUtil.e("R_GRS_WearHomeMainAction", "getAccountPlainTextInfo InterruptedException");
        }
        baseResponseCallback.onResponse(0, strArr[0]);
    }

    private void d(GuideInteractors guideInteractors) {
        ReleaseLogUtil.d("R_GRS_WearHomeMainAction", "showSyncAccountDialog sync click");
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10005), "KEY_SHOW_SYNC_ACCOUNT_ARK_UI_ON_REMINDERS_FLAG".concat(this.e.f26233a), "UNCOMPLETE", null);
        guideInteractors.c(this.e.f26233a, false);
        this.n.dismiss();
        this.n = null;
        if (!c(this.e.f26233a)) {
            d(1);
            return;
        }
        lvj.c().b(1);
        u();
        this.e.l = true;
        if (this.e.d() != null) {
            this.e.d().sendEmptyMessageDelayed(300006, 180000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(int i) {
        if (this.e.v != null) {
            LogUtil.a("WearHomeMainAction", "mWearHomeSyncCard not null");
            this.e.a(i);
        }
    }

    private void t() {
        LogUtil.a("WearHomeMainAction", 0, "WearHomeMainAction", "Enter sendDeviceListChangeBroadcast()");
        if (CommonUtil.ck()) {
            eem.a(tfn.a().k(), "WearHomeMainAction");
        }
    }

    public void e() {
        LogUtil.a("WearHomeMainAction", "dissLoadingDialog()");
        CommonDialog21 commonDialog21 = this.k;
        if (commonDialog21 != null) {
            commonDialog21.dismiss();
            this.k = null;
        }
    }

    private void u() {
        LogUtil.a("WearHomeMainAction", "showLoadingDialog()");
        CommonDialog21 commonDialog21 = this.k;
        if (commonDialog21 == null) {
            new CommonDialog21(this.f49266b, R.style.app_update_dialogActivity);
            CommonDialog21 commonDialog21B = CommonDialog21.b(this.f49266b);
            this.k = commonDialog21B;
            commonDialog21B.b(this.f49266b.getResources().getString(R.string.IDS_loading_sync_account));
            this.k.setCancelable(false);
            this.k.c();
            this.k.setCanceledOnTouchOutside(false);
            LogUtil.a("WearHomeMainAction", "mLoadingSync.show()");
            return;
        }
        commonDialog21.c();
        LogUtil.a("WearHomeMainAction", "mLoadingSync.show()");
    }

    public void a(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityE = DeviceSettingsInteractors.e(BaseApplication.getContext()).e(deviceInfo.getDeviceIdentify());
        if (deviceCapabilityE == null || !deviceCapabilityE.isSupportSyncAccount()) {
            ReleaseLogUtil.d("R_GRS_WearHomeMainAction", "not support isSupportSyncAccount");
            return;
        }
        int deviceConnectState = deviceInfo.getDeviceConnectState();
        ReleaseLogUtil.d("R_GRS_WearHomeMainAction", "deviceConnectionChange state = ", Integer.valueOf(deviceConnectState), ", isSyncingAccount = ", Boolean.valueOf(this.e.l));
        if (!this.e.l || deviceConnectState == 2) {
            return;
        }
        d(1);
        e();
    }

    private boolean c(String str) {
        if (BluetoothAdapter.getDefaultAdapter() == null) {
            LogUtil.j("WearHomeMainAction", 1, "WearHomeMainAction", "BluetoothAdapter is null.");
            return false;
        }
        if (!BluetoothAdapter.getDefaultAdapter().isEnabled()) {
            LogUtil.a("WearHomeMainAction", 1, "WearHomeMainAction", "Bluetooth is not enabled or cannot be used.");
            return false;
        }
        DeviceInfo deviceInfoB = mgg.b(str, "WearHomeMainAction");
        if (deviceInfoB != null) {
            return deviceInfoB.getDeviceConnectState() == 2;
        }
        LogUtil.j("WearHomeMainAction", 1, "WearHomeMainAction", "currentDeviceInfo is null.");
        return false;
    }

    public void d(DeviceInfo deviceInfo) {
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.f49267c;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            this.f49267c.cancel();
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.f49266b).a(String.format(Locale.ENGLISH, this.f49266b.getString(R.string.IDS_kid_oobe_pair_tips), deviceInfo.getDeviceName())).c(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: tkn.19
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("WearHomeMainAction", "showKidAccountNotSupportPairDialog, click");
            }
        }).c();
        this.f49267c = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        if (this.f49267c.isShowing() || this.e.isFinishing()) {
            return;
        }
        this.f49267c.show();
    }

    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
    /* JADX INFO: renamed from: onResponse */
    public void a(int i, Object obj) {
        if (obj instanceof String) {
            h((String) obj);
        } else {
            ab();
        }
    }

    public void o() {
        lwg.d().d(this);
    }
}
