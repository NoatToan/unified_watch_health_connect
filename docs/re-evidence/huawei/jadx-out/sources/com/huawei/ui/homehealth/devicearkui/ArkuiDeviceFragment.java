package com.huawei.ui.homehealth.devicearkui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;
import com.huawei.callback.DeviceDeleteListener;
import com.huawei.devicefeature.DeviceFeatureSupportApi;
import com.huawei.haf.common.exception.ExceptionUtils;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.api.DeviceGeneralSettingApi;
import com.huawei.health.device.api.DeviceManagerCommonConfigApi;
import com.huawei.health.device.callback.BackLogCallback;
import com.huawei.health.device.callback.DeleteDeviceCallback;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.ecologydevice.util.FAUtil;
import com.huawei.health.userprofilemgr.api.UserProfileMgrApi;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.WatchFaceUtil;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import com.huawei.hwdevice.phoneprocess.mgr.notification.SensitivePermissionStatus;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.operation.OperationKey;
import com.huawei.operation.utils.Constants;
import com.huawei.ui.commonui.base.BaseFragment;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.activity.pairing.EarphonePairActivity;
import com.huawei.ui.device.activity.screenshot.ScreenshotPermissionDialogActivity;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.util.ReconnectUtils;
import com.huawei.ui.homehealth.devicearkui.ArkuiDeviceFragment;
import com.huawei.ui.homehealth.devicearkui.DeviceDelegateEnum;
import com.huawei.ui.homehealth.devicearkui.delegate.DeviceViewDelegate;
import com.huawei.ui.homehealth.devicearkui.viewmodel.DeviceProtectViewModel;
import com.huawei.ui.homehealth.devicearkui.viewmodel.MonitorViewModel;
import com.huawei.ui.main.stories.guide.interactors.GuideInteractors;
import com.huawei.watchface.api.HwWatchFaceApi;
import defpackage.cqd;
import defpackage.dru;
import defpackage.erh;
import defpackage.iov;
import defpackage.lsg;
import defpackage.lss;
import defpackage.lut;
import defpackage.lvi;
import defpackage.lxb;
import defpackage.mfs;
import defpackage.mgh;
import defpackage.mig;
import defpackage.miw;
import defpackage.qqe;
import defpackage.qsp;
import defpackage.rdo;
import defpackage.rdp;
import defpackage.res;
import defpackage.rtk;
import defpackage.tox;
import defpackage.tpe;
import defpackage.tpl;
import defpackage.tqp;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.Sha256;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import java.util.function.Function;

/* JADX INFO: loaded from: classes17.dex */
public class ArkuiDeviceFragment extends BaseFragment {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinearLayout f25369a;
    private FragmentActivity d;
    private String f;
    private String g;
    private boolean i;
    private DeviceProtectViewModel j;
    private CustomTextAlertDialog l;
    private DeviceInfo m;
    private long n;
    private boolean q;
    private CustomAlertDialog r;
    private GuideInteractors s;
    private DeviceDelegateEnum.IDeviceViewKind t;
    private View v;
    private MonitorViewModel y;
    private final ArrayList<DeviceViewDelegate> p = new ArrayList<>();
    private final HashMap<DeviceDelegateEnum, DeviceViewDelegate> k = new HashMap<>();
    private AtomicReference<String> e = new AtomicReference<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ExecutorService f25371c = Executors.newCachedThreadPool();
    private boolean h = false;
    private NoTitleCustomAlertDialog o = null;
    private final BroadcastReceiver x = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.devicearkui.ArkuiDeviceFragment.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                ReleaseLogUtil.e("R_ArkuiDeviceFragment", "mScreenPermissionReceiver intent is null");
                return;
            }
            ReleaseLogUtil.d("R_ArkuiDeviceFragment", "mScreenPermissionReceiver action is:", intent.getAction());
            if (TextUtils.isEmpty(intent.getAction())) {
                return;
            }
            String action = intent.getAction();
            if ("com.huawei.health.action.SCREEN_SHOT_PERMISSION_QUEST".equals(action) || HwWatchFaceApi.ACTION_FOREGROUND_STATUS.equals(action)) {
                ArkuiDeviceFragment.this.h();
            }
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final BroadcastReceiver f25370b = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.devicearkui.ArkuiDeviceFragment.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("ArkuiDeviceFragment", "mDeviceConnectEarphoneReceiver handler is null");
            } else if ("com.huawei.health.pair_earphone".equals(intent.getAction())) {
                LogUtil.a("ArkuiDeviceFragment", "mDeviceConnectEarphoneReceiver PAIR_EARPHONE_ACTION");
                ArkuiDeviceFragment arkuiDeviceFragment = ArkuiDeviceFragment.this;
                arkuiDeviceFragment.d(arkuiDeviceFragment.m, true);
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d = getActivity();
        this.j = (DeviceProtectViewModel) new ViewModelProvider(this.d).get(DeviceProtectViewModel.class);
        this.y = (MonitorViewModel) new ViewModelProvider(this.d).get(MonitorViewModel.class);
        this.s = new GuideInteractors(BaseApplication.getContext());
        g();
        m();
        l();
        n();
    }

    private void g() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f = arguments.getString("device_id");
            this.i = arguments.getBoolean("key_is_detail_activity", false);
        }
    }

    private void m() {
        if (this.i) {
            dru druVar = new dru();
            druVar.e(lut.a().b(this.f));
            d(druVar);
            return;
        }
        this.j.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final dru druVar) {
        DeviceDelegateEnum.IDeviceViewKind showDeviceViewKind = DeviceDelegateEnum.getShowDeviceViewKind(druVar);
        if (Objects.equals(this.t, showDeviceViewKind)) {
            return;
        }
        this.t = showDeviceViewKind;
        ArrayList<DeviceDelegateEnum> deviceView = showDeviceViewKind.getDeviceView(this.i);
        a();
        Iterator<DeviceDelegateEnum> it = deviceView.iterator();
        while (it.hasNext()) {
            this.p.add(e(it.next()));
        }
        k();
        ThreadPoolManager.c().a("ArkuiDeviceFragment", new Runnable() { // from class: rws
            @Override // java.lang.Runnable
            public final void run() {
                this.f47794c.e(druVar);
            }
        });
    }

    public /* synthetic */ void e(dru druVar) {
        if (druVar == null) {
            ReleaseLogUtil.a("R_ArkuiDeviceFragment", "updateDeviceView groupInfo is null");
        } else {
            tqp.d(this.d, druVar.a());
        }
    }

    private DeviceViewDelegate e(DeviceDelegateEnum deviceDelegateEnum) {
        return this.k.computeIfAbsent(deviceDelegateEnum, new Function() { // from class: rwj
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return this.e.b((DeviceDelegateEnum) obj);
            }
        });
    }

    public /* synthetic */ DeviceViewDelegate b(DeviceDelegateEnum deviceDelegateEnum) {
        return deviceDelegateEnum.create(this.d);
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.devicearkui.ArkuiDeviceFragment$2, reason: invalid class name */
    public class AnonymousClass2 implements DeviceProtectViewModel.DeviceUpdateCallback {
        AnonymousClass2() {
        }

        @Override // com.huawei.ui.homehealth.devicearkui.viewmodel.DeviceProtectViewModel.DeviceUpdateCallback
        public void onTopDeviceUpdate(final dru druVar) {
            final DeviceInfo deviceInfoA = druVar != null ? druVar.a() : null;
            ArkuiDeviceFragment.this.d.runOnUiThread(new Runnable() { // from class: rwv
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47799c.a(druVar, deviceInfoA);
                }
            });
        }

        public /* synthetic */ void a(dru druVar, DeviceInfo deviceInfo) {
            ArkuiDeviceFragment.this.d(druVar);
            ArkuiDeviceFragment.this.s(deviceInfo);
        }
    }

    private void l() {
        if (!this.i) {
            this.j.c(new AnonymousClass2());
        }
        this.j.a(new AnonymousClass9());
        this.j.d(new DeviceDeleteListener() { // from class: com.huawei.ui.homehealth.devicearkui.ArkuiDeviceFragment.6
            @Override // com.huawei.callback.DeviceDeleteListener
            public void onDeviceDelete(DeviceInfo deviceInfo) {
                if (mig.d(ArkuiDeviceFragment.this.m, deviceInfo)) {
                    if (ArkuiDeviceFragment.this.i) {
                        ArkuiDeviceFragment.this.d.finish();
                    } else {
                        ArkuiDeviceFragment.this.d();
                    }
                }
            }
        });
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.devicearkui.ArkuiDeviceFragment$9, reason: invalid class name */
    public class AnonymousClass9 implements DeviceProtectViewModel.DeviceConnectStateCallback {
        AnonymousClass9() {
        }

        @Override // com.huawei.ui.homehealth.devicearkui.viewmodel.DeviceProtectViewModel.DeviceConnectStateCallback
        public void onDeviceConnectChanger(dru druVar, int i) {
            final DeviceInfo deviceInfoA = druVar.a();
            if (deviceInfoA == null) {
                return;
            }
            LogUtil.a("ArkuiDeviceFragment", "onDeviceConnectChanger deviceInfo name:", deviceInfoA.getDeviceName(), " connect:", Integer.valueOf(deviceInfoA.getDeviceConnectState()));
            if (mig.d(ArkuiDeviceFragment.this.m, deviceInfoA)) {
                ArkuiDeviceFragment.this.d.runOnUiThread(new Runnable() { // from class: rwx
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f47802a.a(deviceInfoA);
                    }
                });
            }
        }

        public /* synthetic */ void a(DeviceInfo deviceInfo) {
            ArkuiDeviceFragment.this.s(deviceInfo);
            ArkuiDeviceFragment.this.f(deviceInfo);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(final DeviceInfo deviceInfo) {
        if (deviceInfo.getDeviceConnectState() == 11) {
            if (deviceInfo.getDeviceFactoryReset() != 1) {
                LogUtil.j("ArkuiDeviceFragment", "OObe this device is not factory");
                return;
            } else {
                ReconnectUtils.b(this.d, deviceInfo);
                return;
            }
        }
        if (deviceInfo.getDeviceConnectState() == 15) {
            if (deviceInfo.getDeviceFactoryReset() != 1) {
                LogUtil.j("ArkuiDeviceFragment", "AccountAuthorize this device is not factory");
                return;
            } else {
                this.d.runOnUiThread(new Runnable() { // from class: rwp
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.b(deviceInfo);
                    }
                });
                return;
            }
        }
        if (deviceInfo.getDeviceConnectState() == 9 || deviceInfo.getDeviceConnectState() == 13) {
            c();
            return;
        }
        if (deviceInfo.getDeviceConnectState() == 2) {
            d(deviceInfo, com.huawei.haf.application.BaseApplication.j() == this.d);
            if (WatchFaceUtil.isSupportMyWatch(deviceInfo)) {
                LogUtil.a("ArkuiDeviceFragment", "handleSpecialConnectState reload watchface params");
                WatchFaceManager.getInstance().refreshWatchFaceInfo(deviceInfo.getDeviceIdentify(), new ResponseCallback() { // from class: rwl
                    @Override // com.huawei.hwbasemgr.ResponseCallback
                    public final void onResponse(int i, Object obj) {
                        LogUtil.a("ArkuiDeviceFragment", "handleSpecialConnectState reload watchface params finish");
                    }
                });
                WatchFaceManager.getInstance().getWearWatchInfoFromDevice(deviceInfo.getDeviceIdentify(), false, WatchFaceManager.WATCH_FACE_LOCAL_LIST_KEY_PREFIX, new ResponseCallback() { // from class: rwm
                    @Override // com.huawei.hwbasemgr.ResponseCallback
                    public final void onResponse(int i, Object obj) {
                        LogUtil.a("ArkuiDeviceFragment", "handleSpecialConnectState reload watchface list finish");
                    }
                });
                return;
            }
            return;
        }
        if (deviceInfo.getDeviceConnectState() == 12) {
            n(deviceInfo);
        }
    }

    public /* synthetic */ void b(DeviceInfo deviceInfo) {
        if (this.d != com.huawei.haf.application.BaseApplication.j()) {
            return;
        }
        LogUtil.a("ArkuiDeviceFragment", "handAccountAuthorize enter judge");
        mgh.a(this.d);
        this.e.set(deviceInfo.getDeviceIdentify());
    }

    private void n(DeviceInfo deviceInfo) {
        if (this.d == null || com.huawei.haf.application.BaseApplication.j() != this.d) {
            LogUtil.j("ArkuiDeviceFragment", "activity is null or is not topactivity");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.o;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            this.o.cancel();
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.d).a(String.format(Locale.ENGLISH, getString(R.string.IDS_kid_oobe_pair_tips), deviceInfo.getDeviceName())).c(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.devicearkui.ArkuiDeviceFragment.10
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("ArkuiDeviceFragment", "showKidAccountNotSupportPairDialog, click");
            }
        }).c();
        this.o = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        if (this.o.isShowing() || this.d.isFinishing()) {
            return;
        }
        this.o.show();
    }

    private void c() {
        if (CommonUtil.i(this.d, "com.huawei.ui.device.activity.pairing.DevicePairGuideActivity")) {
            LogUtil.j("ArkuiDeviceFragment", "accountInconsistentAlertDialog isForeground is DevicePairGuideActivity");
            return;
        }
        CustomTextAlertDialog customTextAlertDialog = this.l;
        if (customTextAlertDialog != null && customTextAlertDialog.isShowing()) {
            LogUtil.a("ArkuiDeviceFragment", "AccountSwitchAlertDialog.isShowing");
            return;
        }
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(this.d).e(this.d.getResources().getString(R.string.IDS_not_connect_inconsistent_account_title)).a(this.d.getResources().getString(R.string.IDS_not_connect_inconsistent_account_content)).e(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: rwq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47791a.d(view);
            }
        }).b();
        this.l = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        this.l.show();
    }

    public /* synthetic */ void d(View view) {
        LogUtil.a("ArkuiDeviceFragment", "user indicates know");
        this.l.dismiss();
        this.l = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(DeviceInfo deviceInfo, boolean z) {
        boolean zC = cqd.c(deviceInfo, 112);
        LogUtil.a("ArkuiDeviceFragment", "afterOobeConnectedProcess. isSupportEarPhone: ", Boolean.valueOf(zC), " isNeedConnectEarphone: ", Boolean.valueOf(z));
        if (zC && z) {
            LogUtil.a("ArkuiDeviceFragment", "afterOobeConnectedProcess. in");
            lxb.c().b(deviceInfo, new AnonymousClass7(deviceInfo));
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.devicearkui.ArkuiDeviceFragment$7, reason: invalid class name */
    public class AnonymousClass7 implements IBaseResponseCallback {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ DeviceInfo f25378c;

        AnonymousClass7(DeviceInfo deviceInfo) {
            this.f25378c = deviceInfo;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            if (ArkuiDeviceFragment.this.d == null) {
                return;
            }
            FragmentActivity fragmentActivity = ArkuiDeviceFragment.this.d;
            final DeviceInfo deviceInfo = this.f25378c;
            fragmentActivity.runOnUiThread(new Runnable() { // from class: rwy
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47805b.c(deviceInfo);
                }
            });
        }

        public /* synthetic */ void c(DeviceInfo deviceInfo) {
            Intent intent = new Intent();
            intent.setClass(ArkuiDeviceFragment.this.d, EarphonePairActivity.class);
            intent.putExtra("device_identify", deviceInfo.getDeviceIdentify());
            ArkuiDeviceFragment.this.startActivity(intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        if (this.v == null) {
            View viewInflate = layoutInflater.inflate(R.layout.fragment_arkui_device, viewGroup, false);
            this.v = viewInflate;
            this.f25369a = (LinearLayout) viewInflate.findViewById(R.id.device_scrollview_content);
            k();
            View view = this.v;
            if (view != null && (view instanceof ViewGroup)) {
                mfs.a(getActivity(), (ViewGroup) this.v);
            }
        }
        return this.v;
    }

    private void a() {
        LinearLayout linearLayout = this.f25369a;
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        this.p.clear();
    }

    private void k() {
        if (this.f25369a != null) {
            final LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.d);
            this.p.forEach(new Consumer() { // from class: rwb
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.e.c(layoutInflaterFrom, (DeviceViewDelegate) obj);
                }
            });
        }
    }

    public /* synthetic */ void c(LayoutInflater layoutInflater, DeviceViewDelegate deviceViewDelegate) {
        LinearLayout linearLayout = this.f25369a;
        linearLayout.addView(deviceViewDelegate.obtainView(layoutInflater, linearLayout));
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (!this.i) {
            d();
            d(this.q);
            i();
        } else if (!s(lut.a().b(this.f))) {
            d(this.q);
        }
        h(this.m);
    }

    private void i() {
        if (!Utils.h() || Utils.i()) {
            return;
        }
        ThreadPoolManager.c().execute(new Runnable() { // from class: rwr
            @Override // java.lang.Runnable
            public final void run() {
                this.f47792a.e();
            }
        });
    }

    public /* synthetic */ void e() {
        FAUtil.a(new FAUtil.ResultCallback() { // from class: rwu
            @Override // com.huawei.health.ecologydevice.util.FAUtil.ResultCallback
            public final void onResult(boolean z) {
                this.f47796a.c(z);
            }
        });
    }

    public /* synthetic */ void c(boolean z) {
        LogUtil.a("ArkuiDeviceFragment", "update FaDevice：", Boolean.valueOf(z));
        if (z) {
            this.j.e();
        }
    }

    public void d() {
        DeviceProtectViewModel deviceProtectViewModel = this.j;
        if (deviceProtectViewModel == null) {
            ReleaseLogUtil.e("R_ArkuiDeviceFragment", "requestRefresh deviceProtectViewModel == null");
            return;
        }
        deviceProtectViewModel.e();
        this.j.d();
        this.j.a();
        this.j.c();
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment
    public void initViewTahiti() {
        super.initViewTahiti();
        this.y.c();
    }

    private boolean o(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.a("ArkuiDeviceFragment", "needUpdate deviceInfo == null");
            return true;
        }
        if (!mig.c(this.m, deviceInfo)) {
            return SystemClock.elapsedRealtime() - this.n > 60000;
        }
        LogUtil.a("ArkuiDeviceFragment", "needUpdate deviceInfoChanger");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean s(final DeviceInfo deviceInfo) {
        if (!o(deviceInfo)) {
            return false;
        }
        this.n = SystemClock.elapsedRealtime();
        this.m = deviceInfo;
        if (!this.i) {
            lut.a().d(deviceInfo);
        }
        if (deviceInfo == null) {
            ReleaseLogUtil.d("R_ArkuiDeviceFragment", "updateDevice deviceInfo name:", Constants.NULL);
        } else {
            ReleaseLogUtil.d("R_ArkuiDeviceFragment", "updateDevice deviceInfo name:", deviceInfo.getDeviceName(), " connect:", Integer.valueOf(deviceInfo.getDeviceConnectState()), " isCloud:", Boolean.valueOf(deviceInfo instanceof CloudDeviceInfo));
        }
        this.d.runOnUiThread(new Runnable() { // from class: rwg
            @Override // java.lang.Runnable
            public final void run() {
                this.d.i(deviceInfo);
            }
        });
        h(deviceInfo);
        f();
        View view = this.v;
        if (view == null || !(view instanceof ViewGroup)) {
            return true;
        }
        LogUtil.a("ArkuiDeviceFragment", "updateDevice showWatermarkWithView");
        mfs.a(getActivity(), (ViewGroup) this.v);
        return true;
    }

    public /* synthetic */ void i(final DeviceInfo deviceInfo) {
        this.p.forEach(new Consumer() { // from class: rwk
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((DeviceViewDelegate) obj).updateDevice(deviceInfo);
            }
        });
    }

    @Override // com.huawei.ui.commonui.base.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.q = z;
        if (this.d == null) {
            return;
        }
        if (z) {
            d();
        }
        d(z);
    }

    private void d(final boolean z) {
        this.p.forEach(new Consumer() { // from class: rwi
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((DeviceViewDelegate) obj).setUserVisibleHint(z);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        DeviceInfo deviceInfo;
        super.onActivityResult(i, i2, intent);
        if (i == 608) {
            ReleaseLogUtil.d("R_ArkuiDeviceFragment", "SENSITIVE_PERMISSION_STATUS resultCode", Integer.valueOf(i2), ",isCloudDeviceInfo：", Boolean.valueOf(this.m instanceof CloudDeviceInfo));
            if (this.m instanceof CloudDeviceInfo) {
                res.d().c(String.valueOf(i2));
                if (i2 == -1) {
                    SharedPreferenceManager.c("SENSITIVE_PERMISSION_STATUS", "SENSITIVE_PERMISSION_STATUS", SensitivePermissionStatus.RESTART.getValue());
                    res.d().a("ArkuiDeviceFragment", intent);
                    res.d().b();
                    return;
                }
                rdp.e(new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.devicearkui.ArkuiDeviceFragment.8
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i3, Object obj) {
                        if (i3 == -1) {
                            res.d().e((Context) ArkuiDeviceFragment.this.d);
                        } else {
                            res.d().c(String.valueOf(608));
                            res.d().b();
                        }
                    }
                }, this.d);
                return;
            }
            if (i2 == -1) {
                SharedPreferenceManager.c("SENSITIVE_PERMISSION_STATUS", "SENSITIVE_PERMISSION_STATUS", SensitivePermissionStatus.RESTART.getValue());
                DeviceInfo deviceInfo2 = this.m;
                if (deviceInfo2 == null) {
                    ReleaseLogUtil.d("R_ArkuiDeviceFragment", "SENSITIVE_PERMISSION_STATUS mCurrentDeviceInfo is null");
                    return;
                } else {
                    tqp.e(deviceInfo2.getDeviceIdentify(), intent);
                    return;
                }
            }
            rdp.e(new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.devicearkui.ArkuiDeviceFragment.13
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i3, Object obj) {
                    ReleaseLogUtil.d("R_ArkuiDeviceFragment", "SENSITIVE_PERMISSION_STATUS createAuthorizeDialog errorCode:", Integer.valueOf(i3));
                    if (i3 == -1) {
                        if (ArkuiDeviceFragment.this.m == null) {
                            ReleaseLogUtil.d("R_ArkuiDeviceFragment", "SENSITIVE_PERMISSION_STATUS createAuthorizeDialog mCurrentDeviceInfo is null");
                        } else {
                            rdp.a(ArkuiDeviceFragment.this.m.getDeviceIdentify(), ArkuiDeviceFragment.this.getActivity(), ArkuiDeviceFragment.this.m.getDeviceBluetoothType());
                        }
                    }
                }
            }, this.d);
            return;
        }
        if (i == 10006 && (deviceInfo = this.m) != null && Objects.equals(deviceInfo.getDeviceIdentify(), this.e.getAndSet(null))) {
            mgh.a(i, i2, intent, deviceInfo);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.p.forEach(new Consumer() { // from class: rwd
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ((DeviceViewDelegate) obj).onDestroy();
            }
        });
        p();
    }

    public void b() {
        lss.a(this.m, new Consumer() { // from class: rwe
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f47781b.a((DeviceInfo) obj);
            }
        });
    }

    public /* synthetic */ void a(DeviceInfo deviceInfo) {
        ReleaseLogUtil.d("R_ArkuiDeviceFragment", "deleteDevice deviceInfo.name:", deviceInfo.getDeviceName());
        DeviceGeneralSettingApi deviceGeneralSettingApi = (DeviceGeneralSettingApi) Services.d("DeviceSetting", DeviceGeneralSettingApi.class);
        if (deviceGeneralSettingApi != null) {
            deviceGeneralSettingApi.deleteDevice(deviceInfo.getDeviceIdentify(), deviceInfo.getDeviceName(), true, new DeleteDeviceCallback() { // from class: com.huawei.ui.homehealth.devicearkui.ArkuiDeviceFragment.3
                @Override // com.huawei.health.device.callback.DeleteDeviceCallback
                public void onSuccess() {
                    ReleaseLogUtil.d("R_ArkuiDeviceFragment", "deleteDevice onSuccess");
                }

                @Override // com.huawei.health.device.callback.DeleteDeviceCallback
                public void onFail(String str) {
                    ReleaseLogUtil.e("R_ArkuiDeviceFragment", "deleteDevice onFail msg:", str);
                }
            });
        }
    }

    private void h(final DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            this.g = null;
        }
        if (deviceInfo == null || deviceInfo.getDeviceConnectState() != 2) {
            return;
        }
        this.d.runOnUiThread(new Runnable() { // from class: rww
            @Override // java.lang.Runnable
            public final void run() {
                this.f47801b.d(deviceInfo);
            }
        });
        ((DeviceManagerCommonConfigApi) Services.b("Module_Device_Feature", DeviceManagerCommonConfigApi.class)).downLoadCommonConfig();
    }

    public /* synthetic */ void d(final DeviceInfo deviceInfo) {
        if (this.d != com.huawei.haf.application.BaseApplication.j()) {
            return;
        }
        j(deviceInfo);
        if (Objects.equals(deviceInfo.getDeviceIdentify(), this.g)) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: rwz
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47806b.e(deviceInfo);
                }
            });
        } else {
            this.g = deviceInfo.getDeviceIdentify();
            k(deviceInfo);
        }
    }

    public /* synthetic */ void e(DeviceInfo deviceInfo) {
        b(deviceInfo.getDeviceIdentify());
    }

    private void j(final DeviceInfo deviceInfo) {
        LogUtil.a("ArkuiDeviceFragment", "initMapSdk ");
        ExecutorService executorService = this.f25371c;
        if (executorService == null || deviceInfo == null) {
            return;
        }
        executorService.execute(new Runnable() { // from class: rwh
            @Override // java.lang.Runnable
            public final void run() {
                ArkuiDeviceFragment.c(deviceInfo);
            }
        });
    }

    public static /* synthetic */ void c(DeviceInfo deviceInfo) {
        if (((DeviceFeatureSupportApi) Services.b("Module_Device_Feature", DeviceFeatureSupportApi.class)).isSupportOfflineMap(deviceInfo)) {
            LogUtil.a("ArkuiDeviceFragment", "OfflineMapEngineManager  initWearEngineAbility");
            rdo.b().a(BaseApplication.getContext(), deviceInfo.getDeviceUdid());
        }
    }

    private void k(DeviceInfo deviceInfo) {
        DeviceCapability deviceCapabilityE = lut.a().e(deviceInfo.getDeviceIdentify());
        ArrayList arrayList = new ArrayList(16);
        tqp.b(deviceInfo, arrayList);
        tqp.i(deviceInfo, arrayList);
        tqp.d(deviceInfo, arrayList);
        tqp.c(deviceInfo, arrayList);
        tqp.j(deviceInfo, arrayList);
        tqp.a(deviceInfo, arrayList);
        tqp.g(deviceInfo, arrayList);
        ReleaseLogUtil.d("R_ArkuiDeviceFragment", "requestPermissions isOversea:", Boolean.valueOf(Utils.o()));
        tqp.e(deviceInfo, arrayList);
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        ArrayList arrayList2 = new ArrayList(16);
        if (tqp.b("wear_permission_time") && !lsg.d(this.d, strArr)) {
            arrayList2.addAll(arrayList);
        }
        ArrayList arrayList3 = new ArrayList(16);
        tqp.a(deviceCapabilityE, arrayList3);
        String[] strArr2 = new String[arrayList3.size()];
        arrayList3.toArray(strArr2);
        if (tqp.b("wear_local_permission_time") && !lsg.d(this.d, strArr2)) {
            arrayList2.addAll(arrayList3);
        }
        LogUtil.a("ArkuiDeviceFragment", "requestPermissions permissionList is ", arrayList2);
        String[] strArr3 = new String[arrayList2.size()];
        arrayList2.toArray(strArr3);
        c(deviceInfo, deviceCapabilityE, strArr3);
    }

    private void c(final DeviceInfo deviceInfo, final DeviceCapability deviceCapability, final String[] strArr) {
        if (strArr.length == 0) {
            if (qqe.e(BaseApplication.getContext())) {
                LogUtil.a("ArkuiDeviceFragment", "requestPermissions hasCalendarPermission");
                tpl.b();
            }
            p(deviceInfo);
            return;
        }
        a(deviceInfo, new DialogInterface.OnClickListener() { // from class: rwn
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f47787a.c(strArr, deviceCapability, deviceInfo, dialogInterface, i);
            }
        });
    }

    public /* synthetic */ void c(String[] strArr, final DeviceCapability deviceCapability, final DeviceInfo deviceInfo, DialogInterface dialogInterface, int i) {
        e(strArr);
        if (-2 == i) {
            return;
        }
        lsg.a(getActivity(), strArr, new PermissionsResultAction() { // from class: com.huawei.ui.homehealth.devicearkui.ArkuiDeviceFragment.4
            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onGranted() {
                LogUtil.a("ArkuiDeviceFragment", "requestPermissions onGranted");
                DeviceCapability deviceCapability2 = deviceCapability;
                if (deviceCapability2 != null && deviceCapability2.isSupportSendSosSms()) {
                    ((UserProfileMgrApi) Services.b("HWUserProfileMgr", UserProfileMgrApi.class)).registerContactChangeObserver();
                }
                tpl.b();
                ArkuiDeviceFragment.this.p(deviceInfo);
            }

            @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
            public void onDenied(String str) {
                LogUtil.a("ArkuiDeviceFragment", "requestPermissions onDenied");
                tpl.b();
                ArkuiDeviceFragment.this.p(deviceInfo);
            }
        });
    }

    private void e(String[] strArr) {
        if (tqp.b("wear_permission_time") && !lsg.d(this.d, strArr)) {
            KeyValDbManager.d(BaseApplication.getContext()).b("wear_permission_time", String.valueOf(System.currentTimeMillis()));
        }
        if (!tqp.b("wear_local_permission_time") || lsg.d(this.d, strArr)) {
            return;
        }
        KeyValDbManager.d(BaseApplication.getContext()).b("wear_local_permission_time", String.valueOf(System.currentTimeMillis()));
    }

    private void a(final DeviceInfo deviceInfo, final DialogInterface.OnClickListener onClickListener) {
        CustomAlertDialog customAlertDialog = this.r;
        if (customAlertDialog != null && customAlertDialog.isShowing()) {
            this.r.dismiss();
        }
        final String strD = Sha256.d(deviceInfo.getDeviceIdentify(), "SHA-256");
        if (!TextUtils.isEmpty(SharedPreferenceManager.e(BaseApplication.getContext(), "device_permission_tip_", "device_permission_tip_" + strD))) {
            LogUtil.j("ArkuiDeviceFragment", "showPermissionDialog has shown");
            return;
        }
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.d);
        builder.d(R.string.IDS_device_page_permission_tip).a(R.string.IDS_emergency_cancel, new DialogInterface.OnClickListener() { // from class: rwo
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.e.b(strD, onClickListener, deviceInfo, dialogInterface, i);
            }
        });
        builder.e(false).d(R.string.IDS_apply_permission, new DialogInterface.OnClickListener() { // from class: rwf
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                this.f47782a.a(strD, onClickListener, dialogInterface, i);
            }
        }).a(j());
        this.r = builder.b();
        LogUtil.a("ArkuiDeviceFragment", "showPermissionDialog show");
        this.r.show();
    }

    public /* synthetic */ void b(String str, DialogInterface.OnClickListener onClickListener, DeviceInfo deviceInfo, DialogInterface dialogInterface, int i) {
        LogUtil.a("ArkuiDeviceFragment", "showPermissionDialog cancel");
        SharedPreferenceManager.e(BaseApplication.getContext(), "device_permission_tip_", "device_permission_tip_" + str, "device_permission_tip_", new StorageParams());
        e("deny");
        onClickListener.onClick(dialogInterface, i);
        tpl.b();
        p(deviceInfo);
    }

    public /* synthetic */ void a(String str, DialogInterface.OnClickListener onClickListener, DialogInterface dialogInterface, int i) {
        LogUtil.a("ArkuiDeviceFragment", "showPermissionDialog apply");
        SharedPreferenceManager.e(BaseApplication.getContext(), "device_permission_tip_", "device_permission_tip_" + str, "device_permission_tip_", new StorageParams());
        e("agree");
        onClickListener.onClick(dialogInterface, i);
    }

    private View j() {
        View viewInflate = View.inflate(this.d, R.layout.dialog_permission_tip, null);
        if (viewInflate != null) {
            HealthTextView healthTextView = (HealthTextView) qsp.a(viewInflate, R.id.tv_device_permission_description);
            View viewA = qsp.a(viewInflate, R.id.ll_calendar);
            int i = R.string.device_permission_description_oversea;
            if (healthTextView != null) {
                healthTextView.setText(i);
            }
            if (viewA != null) {
                viewA.setVisibility(0);
            }
        }
        return viewInflate;
    }

    public void e(String str) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>(1);
        linkedHashMap.put("keyWords", str);
        OpAnalyticsUtil.getInstance().setEvent2nd(OperationKey.HEALTH_APP_DEVICE_PERMISSION_2129040.value(), linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(final DeviceInfo deviceInfo) {
        m(deviceInfo);
        l(deviceInfo);
        r(deviceInfo);
        q(deviceInfo);
        ThreadPoolManager.c().execute(new Runnable() { // from class: rwc
            @Override // java.lang.Runnable
            public final void run() {
                this.f47780c.g(deviceInfo);
            }
        });
    }

    public /* synthetic */ void g(DeviceInfo deviceInfo) {
        b(deviceInfo.getDeviceIdentify());
    }

    private void m(DeviceInfo deviceInfo) {
        boolean zA = this.s.a();
        LogUtil.a("ArkuiDeviceFragment", "Enter onResume private void showRateReminderDialog() is ", Boolean.valueOf(zA));
        if (zA) {
            this.s.b(false);
            FragmentActivity fragmentActivity = this.d;
            tox.e(fragmentActivity, fragmentActivity, deviceInfo);
        }
    }

    private void l(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            LogUtil.a("ArkuiDeviceFragment", " is null");
            return;
        }
        boolean zE = this.s.e();
        boolean zK = lvi.k(deviceInfo.getProductType());
        LogUtil.a("ArkuiDeviceFragment", "showEarMuffReminderDialog isFromPairSuccess:", Boolean.valueOf(zE), "isSupportEarMuff:", Boolean.valueOf(zK));
        if (zE) {
            this.s.c(false);
            if (zK) {
                FragmentActivity fragmentActivity = this.d;
                tox.c(fragmentActivity, fragmentActivity, deviceInfo);
            }
        }
    }

    private void r(DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            return;
        }
        boolean zH = this.s.h();
        String strD = erh.d(deviceInfo.getDeviceIdentify());
        if (this.s.d(strD)) {
            LogUtil.a("ArkuiDeviceFragment", "transfer data to new version");
            this.s.c(strD);
            SharedPreferenceManager.b(BaseApplication.getContext(), String.valueOf(10005), strD);
        }
        boolean zD = this.s.d("keyUserGuidePage" + strD);
        LogUtil.a("ArkuiDeviceFragment", "Enter onResume private void showUserGuidDialog() is ", Boolean.valueOf(zH), "showUserGuideFlagValue is", Boolean.valueOf(zD));
        if (zH || !zD) {
            this.s.a(false);
            tox.b(this.d, deviceInfo);
        }
    }

    private void q(DeviceInfo deviceInfo) {
        LogUtil.a("ArkuiDeviceFragment", "showXiaoYiDialog enter.");
        if (CommonUtil.bg()) {
            if (deviceInfo == null) {
                LogUtil.a("ArkuiDeviceFragment", "mCurrentDeviceInfo is null");
                return;
            }
            boolean zF = this.s.f();
            ReleaseLogUtil.d("R_ArkuiDeviceFragment", "showXiaoYiDialog isFromPairSuccess: " + zF);
            if (zF) {
                this.s.j(false);
                tox.a(this.d, deviceInfo);
            }
        }
    }

    private void b(final String str) {
        if (TextUtils.isEmpty(str)) {
            LogUtil.j("ArkuiDeviceFragment", "showSyncAccountDialog currentDeviceId isEmpty");
            return;
        }
        boolean zE = this.s.e(str);
        LogUtil.a("ArkuiDeviceFragment", "Enter onResume isShowSyncAccount is ", Boolean.valueOf(zE));
        if (!zE) {
            LogUtil.j("ArkuiDeviceFragment", "showSyncAccountDialog not show");
            return;
        }
        DeviceCapability deviceCapabilityE = lut.a().e(str);
        if (deviceCapabilityE == null || !deviceCapabilityE.isSupportSyncAccount()) {
            LogUtil.j("ArkuiDeviceFragment", "showSyncAccountDialog not support sync account");
        } else {
            this.d.runOnUiThread(new Runnable() { // from class: rwt
                @Override // java.lang.Runnable
                public final void run() {
                    ArkuiDeviceFragment.c(str);
                }
            });
        }
    }

    public static /* synthetic */ void c(String str) {
        tpe tpeVarB = tpe.b();
        tpeVarB.d((BackLogCallback<Integer>) null);
        tpeVarB.e(false);
        tpeVarB.d(str);
        tpeVarB.e();
    }

    private void f() {
        DeviceInfo deviceInfo = this.m;
        Objects.isNull(deviceInfo);
        if (deviceInfo == null) {
            ReleaseLogUtil.e("R_ArkuiDeviceFragment", "handleScreenshotDialog mCurrentDeviceInfo is null");
            return;
        }
        if (this.m instanceof CloudDeviceInfo) {
            ReleaseLogUtil.e("R_ArkuiDeviceFragment", "handleScreenshotDialog mCurrentDeviceInfo is CloudDeviceInfo");
            return;
        }
        ReleaseLogUtil.d("R_ArkuiDeviceFragment", " handleScreenshotDialog isFactoryResetVerified:", Boolean.valueOf(this.h));
        if (this.h) {
            return;
        }
        this.h = true;
        int deviceFactoryReset = this.m.getDeviceFactoryReset();
        ReleaseLogUtil.d("R_ArkuiDeviceFragment", "handleScreenshotDialog deviceFactoryReset:", Integer.valueOf(deviceFactoryReset));
        if (deviceFactoryReset == 1) {
            miw.a();
        } else {
            o();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        ReleaseLogUtil.d("R_ArkuiDeviceFragment", " handleBroadCastScreenshotDialog enter");
        if (this.m == null) {
            ReleaseLogUtil.e("R_ArkuiDeviceFragment", "handleBroadCastScreenshotDialog mCurrentDeviceInfo is null");
        } else {
            o();
        }
    }

    private void o() {
        PermissionUtil.PermissionResult permissionResultA = miw.a(getActivity());
        ReleaseLogUtil.d("R_ArkuiDeviceFragment", "showScreenShotPermissionDialog result is ", permissionResultA);
        if (permissionResultA == PermissionUtil.PermissionResult.GRANTED) {
            miw.a();
            return;
        }
        boolean zE = miw.e();
        boolean zC = miw.c();
        boolean zH = com.huawei.haf.application.BaseApplication.h();
        int iD = com.huawei.haf.application.BaseApplication.d(ScreenshotPermissionDialogActivity.class.getName());
        ReleaseLogUtil.d("R_ArkuiDeviceFragment", "showScreenShotPermissionDialog isShowDialog:", Boolean.valueOf(zE), " isRunningForeground:", Boolean.valueOf(zH), " isInAnHour:", Boolean.valueOf(zC), " indexActivity:", Integer.valueOf(iD));
        if (zE && zH && zC && -1 == iD) {
            iov.d(getActivity(), new Intent(getActivity(), (Class<?>) ScreenshotPermissionDialogActivity.class));
        }
    }

    private void n() {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(HwWatchFaceApi.ACTION_FOREGROUND_STATUS);
        intentFilter.addAction("com.huawei.health.action.SCREEN_SHOT_PERMISSION_QUEST");
        BroadcastManagerUtil.d(getActivity(), this.x, intentFilter, LocalBroadcast.f36595c, null);
        rtk.d(this.f25370b);
    }

    private void p() {
        try {
            BroadcastReceiver broadcastReceiver = this.x;
            if (broadcastReceiver != null) {
                this.d.unregisterReceiver(broadcastReceiver);
            }
        } catch (IllegalArgumentException e) {
            LogUtil.j("ArkuiDeviceFragment", "unregisterReceiver exception:", ExceptionUtils.c(e));
        }
        rtk.b(this.f25370b);
    }
}
