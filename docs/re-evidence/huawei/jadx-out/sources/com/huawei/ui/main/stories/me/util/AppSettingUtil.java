package com.huawei.ui.main.stories.me.util;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.healthcloud.plugintrack.R;
import com.huawei.hihealth.HiSyncOption;
import com.huawei.hihealth.api.HiHealthNativeApi;
import com.huawei.hihealth.api.SyncApi;
import com.huawei.hihealth.motion.HealthOpenSDK;
import com.huawei.hihealth.motion.IFlushResult;
import com.huawei.hihealth.util.HealthSyncUtil;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwcommonmodel.utils.PermissionUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.huaweilogin.ThirdPartyLoginManager;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.downloadwidget.HealthDownLoadWidget;
import com.huawei.ui.commonui.switchbutton.HealthSwitchButton;
import com.huawei.ui.commonui.utils.CustomPermissionAction;
import defpackage.dep;
import defpackage.iyd;
import defpackage.lmf;
import defpackage.qpx;
import defpackage.qrs;
import health.compact.a.CommonUtil;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes19.dex */
public class AppSettingUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private CustomPermissionAction f28532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<Context> f28533b;
    private Context d;

    public AppSettingUtil(Context context) {
        this.d = context;
        this.f28533b = new WeakReference<>(context);
    }

    private void d(boolean z) {
        iyd iydVar = new iyd();
        Intent intent = new Intent("com.huawei.health.track.config");
        intent.setPackage("com.huawei.health");
        intent.setClassName("com.huawei.health", "com.huawei.health.manager.DaemonService");
        intent.putExtra("autotrack_enable", z);
        intent.putExtra("stop_delay", iydVar.b());
        intent.putExtra("start_delay", iydVar.c());
        Context context = this.d;
        if (context != null) {
            context.startService(intent);
        }
    }

    public void b(HealthOpenSDK healthOpenSDK, HealthDownLoadWidget healthDownLoadWidget, String str) {
        if (healthOpenSDK == null) {
            LogUtil.j("AppSettingUtil", "syncData healthOpenSdk is null");
            return;
        }
        if (!TextUtils.isEmpty(str)) {
            qpx.e(this.d, str);
        }
        try {
            HealthSyncUtil.b(SyncApi.FITNESS);
        } catch (IllegalArgumentException unused) {
            LogUtil.e("AppSettingUtil", "FitnessAdvice syncData failed");
        }
        try {
            HealthSyncUtil.b(SyncApi.HEALTH_LIFE);
        } catch (IllegalArgumentException unused2) {
            LogUtil.e("AppSettingUtil", "HealthLifeModel syncData failed");
        }
        if (healthDownLoadWidget != null) {
            healthDownLoadWidget.setProgress(0);
            healthDownLoadWidget.setVisibility(0);
        }
        healthOpenSDK.e(new IFlushResult() { // from class: com.huawei.ui.main.stories.me.util.AppSettingUtil.3
            @Override // com.huawei.hihealth.motion.IFlushResult
            public void onSuccess(Bundle bundle) {
                AppSettingUtil.this.a();
            }

            @Override // com.huawei.hihealth.motion.IFlushResult
            public void onFailed(Bundle bundle) {
                AppSettingUtil.this.a();
            }

            @Override // com.huawei.hihealth.motion.IFlushResult
            public void onServiceException(Bundle bundle) {
                AppSettingUtil.this.a();
            }
        });
    }

    private void e() {
        ReleaseLogUtil.d("R_AppSettingUtil", "setHiSyncOption part data start");
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(20000);
        hiSyncOption.setSyncScope(1);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncManual(1);
        HiHealthNativeApi.a(this.d).synCloud(hiSyncOption, null);
    }

    private void d() {
        ReleaseLogUtil.d("R_AppSettingUtil", "setHiSyncOption all data start");
        HiSyncOption hiSyncOption = new HiSyncOption();
        hiSyncOption.setSyncModel(2);
        hiSyncOption.setSyncAction(0);
        hiSyncOption.setSyncDataType(20000);
        hiSyncOption.setSyncScope(1);
        hiSyncOption.setSyncMethod(2);
        hiSyncOption.setSyncManual(1);
        hiSyncOption.setSyncDataArea(1);
        HiHealthNativeApi.a(this.d).synCloud(hiSyncOption, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (!CommonUtil.cc()) {
            e();
            return;
        }
        if (HandlerExecutor.c()) {
            ThreadPoolManager.c().execute(new Runnable() { // from class: vvt
                @Override // java.lang.Runnable
                public final void run() {
                    this.f51639a.a();
                }
            });
            return;
        }
        final String[] strArr = new String[1];
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        ThirdPartyLoginManager.getInstance().queryHomeCountrySyncStatus(new IBaseResponseCallback() { // from class: com.huawei.ui.main.stories.me.util.AppSettingUtil.4
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public void a(int i, Object obj) {
                ReleaseLogUtil.d("R_AppSettingUtil", "setHiSyncOption queryHomeCountrySyncStatus errorCode:", Integer.valueOf(i));
                if (i == 0 && (obj instanceof Integer)) {
                    Integer num = (Integer) obj;
                    int iIntValue = num.intValue();
                    LogUtil.a("AppSettingUtil", "setHiSyncOption queryHomeCountrySyncStatus value:", num);
                    strArr[0] = String.valueOf(iIntValue);
                }
                countDownLatch.countDown();
            }
        });
        try {
            ReleaseLogUtil.d("R_AppSettingUtil", "setHiSyncOption isOnTime:", Boolean.valueOf(countDownLatch.await(5000L, TimeUnit.MILLISECONDS)));
        } catch (InterruptedException unused) {
            ReleaseLogUtil.a("R_AppSettingUtil", "setHiSyncOption InterruptedException");
        }
        ReleaseLogUtil.d("R_AppSettingUtil", "setHiSyncOption status:", strArr[0]);
        String str = strArr[0];
        if (str != null && "1".equals(str)) {
            d();
        } else {
            e();
        }
    }

    public void a(String str, String str2) {
        HashMap map = new HashMap();
        map.put("click", "1");
        if (str2 != null) {
            map.put("type", str2);
        }
        lmf.d().c(this.d, str, map, 0);
    }

    public boolean a(String str) {
        return "".equals(str) || str == null || "0".equals(str);
    }

    public void e(boolean z, iyd iydVar, HealthSwitchButton healthSwitchButton) {
        if (healthSwitchButton == null) {
            LogUtil.e("AppSettingUtil", "autoTrackSwitch is null");
        } else if (iydVar != null) {
            if (z) {
                d(iydVar, healthSwitchButton);
            } else {
                c(iydVar, healthSwitchButton, false);
            }
        }
    }

    public void d(boolean z, iyd iydVar) {
        String str;
        if (iydVar == null) {
            LogUtil.j("AppSettingUtil", "permissionSetConfigFile autoTrackConfig is null");
            return;
        }
        if (!z) {
            str = "2";
        } else {
            str = "1";
        }
        a(AnalyticsValue.HEALTH_MINE_SETTINGS_AUTO_TRACK_2040031.value(), str);
        iydVar.e(this.d, z);
        iydVar.b(this.d);
        d(z);
    }

    /* JADX INFO: renamed from: com.huawei.ui.main.stories.me.util.AppSettingUtil$2, reason: invalid class name */
    public class AnonymousClass2 extends CustomPermissionAction {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ HealthSwitchButton f28534a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ iyd f28535b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(Context context, iyd iydVar, HealthSwitchButton healthSwitchButton) {
            super(context);
            this.f28535b = iydVar;
            this.f28534a = healthSwitchButton;
        }

        @Override // com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onGranted() {
            LogUtil.a("AppSettingUtil", "Granted Permission");
            if (!AppSettingUtil.this.b()) {
                AppSettingUtil.this.c(this.f28535b, this.f28534a, true);
            } else {
                PermissionUtil.d(AppSettingUtil.this.c(), PermissionUtil.PermissionType.LOCATION_WITH_BACKGROUND, AppSettingUtil.this.f28532a);
            }
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onDenied(String str) {
            super.onDenied(str);
            LogUtil.j("AppSettingUtil", "permission denied by the user");
            if (!PermissionUtil.b() || !dep.e(AppSettingUtil.this.c())) {
                AppSettingUtil.this.c(this.f28535b, this.f28534a, PermissionUtil.j() && dep.e(AppSettingUtil.this.c()));
            } else {
                AppSettingUtil.this.e(this.f28535b, this.f28534a);
            }
        }

        @Override // com.huawei.ui.commonui.utils.CustomPermissionAction, com.huawei.hwcommonmodel.utils.permission.PermissionsResultAction
        public void onForeverDenied(PermissionUtil.PermissionType permissionType) {
            LogUtil.j("AppSettingUtil", "permission forever denied, show the guide window");
            if (permissionType == PermissionUtil.PermissionType.LOCATION || permissionType == PermissionUtil.PermissionType.LOCATION_WITH_BACKGROUND) {
                Context context = AppSettingUtil.this.d;
                final iyd iydVar = this.f28535b;
                final HealthSwitchButton healthSwitchButton = this.f28534a;
                View.OnClickListener onClickListener = new View.OnClickListener() { // from class: vvu
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f51641b.d(iydVar, healthSwitchButton, view);
                    }
                };
                final iyd iydVar2 = this.f28535b;
                final HealthSwitchButton healthSwitchButton2 = this.f28534a;
                qrs.b(context, permissionType, onClickListener, new View.OnClickListener() { // from class: vvs
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f51638c.e(iydVar2, healthSwitchButton2, view);
                    }
                });
            }
        }

        public /* synthetic */ void d(iyd iydVar, HealthSwitchButton healthSwitchButton, View view) {
            LogUtil.a("AppSettingUtil", "onForeverDenied on click confirm");
            AppSettingUtil.this.c(iydVar, healthSwitchButton, false);
        }

        public /* synthetic */ void e(iyd iydVar, HealthSwitchButton healthSwitchButton, View view) {
            LogUtil.a("AppSettingUtil", "onForeverDenied on click cancel");
            AppSettingUtil.this.c(iydVar, healthSwitchButton, false);
        }
    }

    private void d(iyd iydVar, HealthSwitchButton healthSwitchButton) {
        if (this.f28532a == null) {
            this.f28532a = new AnonymousClass2(c(), iydVar, healthSwitchButton);
        }
        b(iydVar, healthSwitchButton);
    }

    private void b(iyd iydVar, HealthSwitchButton healthSwitchButton) {
        if (PermissionUtil.j() && dep.e(c())) {
            c(iydVar, healthSwitchButton, true);
        } else if (PermissionUtil.b() && dep.e(c())) {
            e(iydVar, healthSwitchButton);
        } else {
            PermissionUtil.d(c(), PermissionUtil.PermissionType.LOCATION, this.f28532a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(iyd iydVar, HealthSwitchButton healthSwitchButton, boolean z) {
        d(z, iydVar);
        healthSwitchButton.setChecked(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final iyd iydVar, final HealthSwitchButton healthSwitchButton) {
        LogUtil.a("AppSettingUtil", "enter showLocationTips show dialog");
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.d).a(this.d.getString(R.string.IDS_hw_need_always_access_location_permissions_tips)).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: vvw
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f51643a.b(iydVar, healthSwitchButton, view);
            }
        }).c(R.string.IDS_common_enable_button, new View.OnClickListener() { // from class: vvv
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.b(view);
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    public /* synthetic */ void b(iyd iydVar, HealthSwitchButton healthSwitchButton, View view) {
        c(iydVar, healthSwitchButton, false);
        LogUtil.a("AppSettingUtil", "showLocationTips onClick cancel");
    }

    public /* synthetic */ void b(View view) {
        LogUtil.a("AppSettingUtil", "showLocationTips onClick confirm");
        PermissionUtil.d(c(), PermissionUtil.PermissionType.LOCATION, this.f28532a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean b() {
        LogUtil.a("AppSettingUtil", "enter isApplyBackgroundLocationPermission");
        return (PermissionUtil.j() || PermissionUtil.e(c(), PermissionUtil.PermissionType.LOCATION_WITH_BACKGROUND) == PermissionUtil.PermissionResult.GRANTED) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Context c() {
        Context context = this.f28533b.get();
        return context == null ? BaseApplication.getContext() : context;
    }
}
