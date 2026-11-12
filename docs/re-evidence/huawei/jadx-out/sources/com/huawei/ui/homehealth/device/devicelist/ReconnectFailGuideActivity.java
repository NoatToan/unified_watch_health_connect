package com.huawei.ui.homehealth.device.devicelist;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.huawei.haf.language.LanguageInstallHelper;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwdevice.phoneprocess.mgr.notification.SensitivePermissionStatus;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.ui.commonui.base.BaseActivity;
import com.huawei.ui.commonui.dialog.CustomTextAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.pairing.EarphonePairActivity;
import com.huawei.ui.homehealth.device.devicelist.ReconnectFailGuideActivity;
import com.huawei.ui.homehealth.device.util.ReconnectUtils;
import defpackage.coq;
import defpackage.cqd;
import defpackage.edl;
import defpackage.edn;
import defpackage.lvi;
import defpackage.lxb;
import defpackage.mgh;
import defpackage.qpx;
import defpackage.qre;
import defpackage.qrs;
import defpackage.rdp;
import defpackage.tqp;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes17.dex */
public class ReconnectFailGuideActivity extends BaseActivity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomTextAlertDialog f25319a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f25321c;
    private ProgressBar f;
    private NoTitleCustomAlertDialog d = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicReference<String> f25320b = new AtomicReference<>();
    private DeviceInfo h = null;
    private Context e = null;
    private final BroadcastReceiver i = new BroadcastReceiver() { // from class: com.huawei.ui.homehealth.device.devicelist.ReconnectFailGuideActivity.2
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (context == null || intent == null) {
                LogUtil.j("ReconnectFailGuideActivity", "context or intent is null");
                return;
            }
            if ("com.huawei.bone.action.CONNECTION_STATE_CHANGED".equals(intent.getAction())) {
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("deviceinfo");
                    if (!(parcelableExtra instanceof DeviceInfo)) {
                        LogUtil.e("ReconnectFailGuideActivity", "parcelableExtra is not deviceInfo");
                        return;
                    }
                    DeviceInfo deviceInfo = (DeviceInfo) parcelableExtra;
                    if (deviceInfo == null || ReconnectFailGuideActivity.this.h == null || !Objects.equals(ReconnectFailGuideActivity.this.h.getDeviceIdentify(), deviceInfo.getDeviceIdentify())) {
                        return;
                    }
                    ReconnectFailGuideActivity reconnectFailGuideActivity = ReconnectFailGuideActivity.this;
                    reconnectFailGuideActivity.d(deviceInfo, reconnectFailGuideActivity);
                } catch (ClassCastException unused) {
                    LogUtil.e("ReconnectFailGuideActivity", "dealStateChange ClassCastException");
                } catch (Exception unused2) {
                    LogUtil.e("ReconnectFailGuideActivity", "dealStateChange Exception");
                }
            }
        }
    };

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        ReleaseLogUtil.d("R_ReconnectFailGuideActivity", "onCreate");
        super.onCreate(bundle);
        this.e = this;
        setContentView(R.layout.activity_reconnect_fail_guide);
        i();
        d();
    }

    public void d() {
        LogUtil.a("ReconnectFailGuideActivity", "registerReceiverExported");
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("com.huawei.bone.action.CONNECTION_STATE_CHANGED");
            intentFilter.setPriority(800);
            BroadcastManagerUtil.c(this.e, this.i, intentFilter, LocalBroadcast.f36595c, null);
        } catch (IllegalStateException unused) {
            LogUtil.e("ReconnectFailGuideActivity", "registerConnectStateBroadcast IllegalStateException");
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        DeviceInfo deviceInfo;
        super.onActivityResult(i, i2, intent);
        if (i == 608) {
            ReleaseLogUtil.d("R_ReconnectFailGuideActivity", "SENSITIVE_PERMISSION_STATUS resultCode", Integer.valueOf(i2));
            if (i2 == -1) {
                SharedPreferenceManager.c("SENSITIVE_PERMISSION_STATUS", "SENSITIVE_PERMISSION_STATUS", SensitivePermissionStatus.RESTART.getValue());
                DeviceInfo deviceInfo2 = this.h;
                if (deviceInfo2 != null) {
                    tqp.e(deviceInfo2.getDeviceIdentify(), intent);
                    return;
                } else {
                    ReleaseLogUtil.d("R_ReconnectFailGuideActivity", "SENSITIVE_PERMISSION_STATUS mCurrentDeviceInfo is null");
                    return;
                }
            }
            rdp.e(new IBaseResponseCallback() { // from class: com.huawei.ui.homehealth.device.devicelist.ReconnectFailGuideActivity.4
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i3, Object obj) {
                    ReleaseLogUtil.d("R_ReconnectFailGuideActivity", "SENSITIVE_PERMISSION_STATUS createAuthorizeDialog errorCode:", Integer.valueOf(i3));
                    if (i3 == -1) {
                        if (ReconnectFailGuideActivity.this.h != null) {
                            String deviceIdentify = ReconnectFailGuideActivity.this.h.getDeviceIdentify();
                            ReconnectFailGuideActivity reconnectFailGuideActivity = ReconnectFailGuideActivity.this;
                            rdp.a(deviceIdentify, reconnectFailGuideActivity, reconnectFailGuideActivity.h.getDeviceBluetoothType());
                            return;
                        }
                        ReleaseLogUtil.d("R_ReconnectFailGuideActivity", "SENSITIVE_PERMISSION_STATUS createAuthorizeDialog mCurrentDeviceInfo is null");
                    }
                }
            }, this.e);
            return;
        }
        if (i == 10006 && (deviceInfo = this.h) != null && Objects.equals(deviceInfo.getDeviceIdentify(), this.f25320b.getAndSet(null))) {
            mgh.a(i, i2, intent, deviceInfo);
        }
    }

    private void i() {
        Intent intent = getIntent();
        if (intent == null) {
            LogUtil.j("ReconnectFailGuideActivity", "initData intent is null");
            return;
        }
        if (intent.getExtras() != null) {
            this.h = (DeviceInfo) intent.getExtras().getParcelable("deviceInfo");
        }
        if (this.h == null) {
            ReleaseLogUtil.e("R_ReconnectFailGuideActivity", "initData deviceInfo is null");
            return;
        }
        e();
        h();
        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.btn_reconnect_layout);
        this.f = (ProgressBar) findViewById(R.id.device_reconnecting);
        this.f25321c = (TextView) findViewById(R.id.btn_reconnect_text);
        linearLayout.setOnClickListener(new View.OnClickListener() { // from class: rpk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47562a.a(view);
            }
        });
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.device.devicelist.ReconnectFailGuideActivity$1, reason: invalid class name */
    public class AnonymousClass1 implements SimpleChain.Emitter {
        AnonymousClass1() {
        }

        @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
        public void onSuccess(Object... objArr) {
            ReconnectFailGuideActivity.this.runOnUiThread(new Runnable() { // from class: rpo
                @Override // java.lang.Runnable
                public final void run() {
                    this.d.e();
                }
            });
        }

        public /* synthetic */ void e() {
            ReconnectFailGuideActivity.this.f.setVisibility(0);
            ReconnectFailGuideActivity.this.f25321c.setText(R.string.IDS_device_guide_connecting);
        }

        @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
        public void onError(String str) {
            ReconnectFailGuideActivity.this.runOnUiThread(new Runnable() { // from class: rpm
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.d();
                }
            });
            ReleaseLogUtil.e("R_ReconnectFailGuideActivity", "reconnect onError:" + str);
        }

        public /* synthetic */ void d() {
            ReconnectFailGuideActivity.this.f.setVisibility(8);
            ReconnectFailGuideActivity.this.f25321c.setText(R.string.IDS_device_list_pair);
        }
    }

    public /* synthetic */ void a(View view) {
        ReconnectUtils.d(this.h, new AnonymousClass1());
    }

    public void e() {
        String strF;
        String strF2;
        HealthTextView healthTextView = (HealthTextView) findViewById(R.id.device_connect_fail_retry_msg);
        HealthTextView healthTextView2 = (HealthTextView) findViewById(R.id.device_connect_fail_des1);
        HealthTextView healthTextView3 = (HealthTextView) findViewById(R.id.device_connect_fail_des2);
        if (b()) {
            if (qrs.ah(this.e)) {
                strF2 = qre.f(R.string.IDS_device_connect_tips_dialog_sub_content_watch_pad);
            } else {
                strF2 = qre.f(R.string.IDS_device_connect_tips_dialog_sub_content_watch_phone);
            }
            healthTextView.setText(strF2);
            healthTextView2.setText(this.e.getResources().getString(R.string.IDS_device_watch_connect_fail_des1, 1));
            healthTextView3.setText(this.e.getResources().getString(R.string.IDS_device_watch_connect_fail_des2, 2));
        } else {
            if (qrs.ah(this.e)) {
                strF = qre.f(R.string.IDS_device_connect_tips_dialog_sub_content_band_pad);
            } else {
                strF = qre.f(R.string.IDS_device_connect_tips_dialog_sub_content_band_phone);
            }
            healthTextView.setText(strF);
            healthTextView2.setText(this.e.getResources().getString(R.string.IDS_device_band_connect_fail_des1, 1));
            healthTextView3.setText(this.e.getResources().getString(R.string.IDS_device_band_connect_fail_des2, 2));
        }
        ((HealthTextView) findViewById(R.id.device_connect_fail_des3)).setText(this.e.getResources().getString(R.string.IDS_device_connect_fail_des3, 3));
    }

    public void h() {
        ImageView imageView = (ImageView) findViewById(R.id.device_restore_img);
        ImageView imageView2 = (ImageView) findViewById(R.id.device_watch_pair_img);
        if (!b()) {
            if (LanguageUtil.l(this.e)) {
                imageView.setImageResource(R.mipmap.ic_device_band_setting_cn);
                imageView2.setImageResource(R.mipmap.ic_device_band_pair_cn);
                return;
            } else {
                imageView.setImageResource(R.mipmap.ic_device_band_setting_en);
                imageView2.setImageResource(R.mipmap.ic_device_band_pair_en);
                return;
            }
        }
        if (LanguageUtil.l(this.e)) {
            if (c()) {
                imageView.setImageResource(R.mipmap.ic_device_square_watch_setting_cn);
                imageView2.setImageResource(R.mipmap.ic_device_square_watch_pair_cn);
                return;
            } else {
                imageView.setImageResource(R.mipmap.ic_device_round_watch_setting_cn);
                imageView2.setImageResource(R.mipmap.ic_device_round_watch_pair_cn);
                return;
            }
        }
        if (c()) {
            imageView.setImageResource(R.mipmap.ic_device_square_watch_setting_en);
            imageView2.setImageResource(R.mipmap.ic_device_square_watch_pair_en);
        } else {
            imageView.setImageResource(R.mipmap.ic_device_round_watch_setting_en);
            imageView2.setImageResource(R.mipmap.ic_device_round_watch_pair_en);
        }
    }

    public static int c(DeviceInfo deviceInfo) {
        edl pluginInfoByDeviceType;
        edn ednVarA = lvi.a(deviceInfo.getProductType());
        int iK = ednVarA != null ? ednVarA.k() : 0;
        return (iK != 0 || (pluginInfoByDeviceType = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByDeviceType(deviceInfo.getProductType())) == null || pluginInfoByDeviceType.i() == null) ? iK : pluginInfoByDeviceType.i().at();
    }

    public boolean b() {
        List<ProductMapInfo> listC;
        String strE;
        String hiLinkDeviceId = this.h.getHiLinkDeviceId();
        LogUtil.a("ReconnectFailGuideActivity", "isWatch hiLinkDeviceId:" + hiLinkDeviceId);
        ProductMapParseUtil.a(BaseApplication.getContext());
        if (!TextUtils.isEmpty(hiLinkDeviceId)) {
            listC = ProductMap.c("productId", hiLinkDeviceId);
        } else {
            int iC = c(this.h);
            LogUtil.a("ReconnectFailGuideActivity", "isWatch healthCloudId:" + iC);
            listC = ProductMap.c("deviceId", String.valueOf(iC));
        }
        if (!coq.d(listC)) {
            ProductMapInfo productMapInfo = listC.get(0);
            if (productMapInfo == null) {
                strE = "06D";
            } else {
                strE = productMapInfo.e();
            }
            LogUtil.a("ReconnectFailGuideActivity", "isWatch deviceKind:" + strE);
            return "06D".equals(strE);
        }
        return !lvi.f(this.h.getProductType());
    }

    public boolean c() {
        int productType = this.h.getProductType();
        int iM = lvi.a(productType).m();
        LogUtil.a("ReconnectFailGuideActivity", "isSquareWatch deviceShape:" + iM, ", deviceType: ", Integer.valueOf(productType));
        return iM == 2;
    }

    public void d(final DeviceInfo deviceInfo, final Activity activity) {
        if (activity == null || activity.isFinishing() || activity.isDestroyed()) {
            LogUtil.j("ReconnectFailGuideActivity", "activity is invalid");
            return;
        }
        LogUtil.a("ReconnectFailGuideActivity", "handleSpecialConnectState getDeviceConnectState: ", Integer.valueOf(deviceInfo.getDeviceConnectState()));
        if (deviceInfo.getDeviceConnectState() == 1) {
            activity.runOnUiThread(new Runnable() { // from class: rpi
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47560c.a();
                }
            });
            return;
        }
        if (deviceInfo.getDeviceConnectState() == 11) {
            if (deviceInfo.getDeviceFactoryReset() != 1) {
                LogUtil.j("ReconnectFailGuideActivity", "OObe this device is not factory");
                return;
            } else {
                ReconnectUtils.b(activity, deviceInfo);
                d(activity);
                return;
            }
        }
        if (deviceInfo.getDeviceConnectState() == 15) {
            if (deviceInfo.getDeviceFactoryReset() != 1) {
                LogUtil.j("ReconnectFailGuideActivity", "AccountAuthorize this device is not factory");
                return;
            } else {
                activity.runOnUiThread(new Runnable() { // from class: rpl
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.d.a(activity, deviceInfo);
                    }
                });
                return;
            }
        }
        if (deviceInfo.getDeviceConnectState() == 9 || deviceInfo.getDeviceConnectState() == 13) {
            a(activity);
            return;
        }
        if (deviceInfo.getDeviceConnectState() == 2) {
            a(deviceInfo, com.huawei.haf.application.BaseApplication.j() == activity, activity);
            if (com.huawei.haf.application.BaseApplication.j() == activity) {
                d(activity);
                return;
            }
            return;
        }
        if (deviceInfo.getDeviceConnectState() == 12) {
            e(deviceInfo, activity);
        } else if (deviceInfo.getDeviceConnectState() == 4) {
            activity.runOnUiThread(new Runnable() { // from class: rpj
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47561b.d(deviceInfo);
                }
            });
        }
    }

    public /* synthetic */ void a() {
        this.f.setVisibility(0);
        this.f25321c.setText(R.string.IDS_device_guide_connecting);
    }

    public /* synthetic */ void a(Activity activity, DeviceInfo deviceInfo) {
        if (activity != com.huawei.haf.application.BaseApplication.j()) {
            return;
        }
        LogUtil.a("ReconnectFailGuideActivity", "handAccountAuthorize enter judge");
        mgh.a(activity);
        this.f25320b.set(deviceInfo.getDeviceIdentify());
    }

    public /* synthetic */ void d(DeviceInfo deviceInfo) {
        this.f.setVisibility(8);
        this.f25321c.setText(com.huawei.ui.homehealth.R.string.IDS_device_list_pair);
        qpx.e(BaseApplication.getContext(), qre.a(com.huawei.ui.homehealth.R.string.IDS_device_connect_fail_tips, deviceInfo.getDeviceName()));
    }

    private void d(Activity activity) {
        if (activity.isFinishing()) {
            return;
        }
        activity.finish();
    }

    private void e(DeviceInfo deviceInfo, Activity activity) {
        if (activity == null || com.huawei.haf.application.BaseApplication.j() != activity) {
            LogUtil.j("ReconnectFailGuideActivity", "activity is null or is not topactivity");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialog = this.d;
        if (noTitleCustomAlertDialog != null && noTitleCustomAlertDialog.isShowing()) {
            this.d.cancel();
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(activity).a(String.format(Locale.ENGLISH, qre.f(com.huawei.ui.homehealth.R.string.IDS_kid_oobe_pair_tips), deviceInfo.getDeviceName())).c(com.huawei.ui.homehealth.R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: com.huawei.ui.homehealth.device.devicelist.ReconnectFailGuideActivity.3
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                LogUtil.a("ReconnectFailGuideActivity", "showKidAccountNotSupportPairDialog, click");
            }
        }).c();
        this.d = noTitleCustomAlertDialogC;
        noTitleCustomAlertDialogC.setCancelable(false);
        if (this.d.isShowing() || activity.isFinishing()) {
            return;
        }
        this.d.show();
    }

    private void a(Activity activity) {
        if (CommonUtil.i(activity, "com.huawei.ui.device.activity.pairing.DevicePairGuideActivity")) {
            LogUtil.j("ReconnectFailGuideActivity", "accountInconsistentAlertDialog isForeground is DevicePairGuideActivity");
            return;
        }
        CustomTextAlertDialog customTextAlertDialog = this.f25319a;
        if (customTextAlertDialog != null && customTextAlertDialog.isShowing()) {
            LogUtil.a("ReconnectFailGuideActivity", "mAccountSwitchAlertDialog.isShowing");
            return;
        }
        final CustomTextAlertDialog[] customTextAlertDialogArr = {this.f25319a};
        CustomTextAlertDialog customTextAlertDialogB = new CustomTextAlertDialog.Builder(activity).e(activity.getResources().getString(com.huawei.ui.homehealth.R.string.IDS_not_connect_inconsistent_account_title)).a(activity.getResources().getString(com.huawei.ui.homehealth.R.string.IDS_not_connect_inconsistent_account_content)).e(com.huawei.ui.homehealth.R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: rpg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ReconnectFailGuideActivity.e(customTextAlertDialogArr, view);
            }
        }).b();
        this.f25319a = customTextAlertDialogB;
        customTextAlertDialogB.setCancelable(false);
        this.f25319a.show();
    }

    public static /* synthetic */ void e(CustomTextAlertDialog[] customTextAlertDialogArr, View view) {
        LogUtil.a("ReconnectFailGuideActivity", "user indicates know");
        CustomTextAlertDialog customTextAlertDialog = customTextAlertDialogArr[0];
        if (customTextAlertDialog != null) {
            customTextAlertDialog.dismiss();
            customTextAlertDialogArr[0] = null;
        }
    }

    public void a(DeviceInfo deviceInfo, boolean z, Activity activity) {
        boolean zC = cqd.c(deviceInfo, 112);
        LogUtil.a("ReconnectFailGuideActivity", "afterOobeConnectedProcess. isSupportEarPhone: ", Boolean.valueOf(zC), " isNeedConnectEarphone: ", Boolean.valueOf(z));
        if (zC && z) {
            LogUtil.a("ReconnectFailGuideActivity", "afterOobeConnectedProcess. in");
            lxb.c().b(deviceInfo, new AnonymousClass5(activity, deviceInfo));
        }
    }

    /* JADX INFO: renamed from: com.huawei.ui.homehealth.device.devicelist.ReconnectFailGuideActivity$5, reason: invalid class name */
    public class AnonymousClass5 implements IBaseResponseCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ DeviceInfo f25325a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Activity f25327c;

        AnonymousClass5(Activity activity, DeviceInfo deviceInfo) {
            this.f25327c = activity;
            this.f25325a = deviceInfo;
        }

        @Override // com.huawei.hwbasemgr.IBaseResponseCallback
        /* JADX INFO: renamed from: onResponse */
        public void a(int i, Object obj) {
            final Activity activity = this.f25327c;
            if (activity == null) {
                return;
            }
            final DeviceInfo deviceInfo = this.f25325a;
            activity.runOnUiThread(new Runnable() { // from class: rpp
                @Override // java.lang.Runnable
                public final void run() {
                    ReconnectFailGuideActivity.AnonymousClass5.b(activity, deviceInfo);
                }
            });
        }

        public static /* synthetic */ void b(Activity activity, DeviceInfo deviceInfo) {
            Intent intent = new Intent();
            intent.setClass(activity, EarphonePairActivity.class);
            intent.putExtra("device_identify", deviceInfo.getDeviceIdentify());
            activity.startActivity(intent);
        }
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.i);
    }

    @Override // com.huawei.ui.commonui.base.BaseActivity, androidx.activity.ComponentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        LanguageInstallHelper.updateResources(this);
        super.onConfigurationChanged(configuration);
    }
}
