package com.huawei.ui.homehealth.device.util;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.utils.SimpleChain;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.device.activity.agreement.AgreementDeclarationActivity;
import com.huawei.ui.device.akruidevcie.utils.BluetoothEnableUtils;
import com.huawei.ui.device.utlis.clouddevice.DownloadCloudDeviceResource;
import com.huawei.ui.homehealth.R;
import com.huawei.ui.homehealth.device.callback.ReconnectCallback;
import com.huawei.ui.homehealth.device.devicelist.ReconnectFailGuideActivity;
import com.huawei.ui.homehealth.device.util.ReconnectUtils;
import com.huawei.ui.homehealth.view.CloudReconnectFailDialog;
import defpackage.cqp;
import defpackage.dxx;
import defpackage.eel;
import defpackage.lvi;
import defpackage.lvl;
import defpackage.lwg;
import defpackage.maq;
import defpackage.mig;
import defpackage.rdp;
import defpackage.res;
import defpackage.rfi;
import defpackage.rtk;
import defpackage.tfn;
import defpackage.ykx;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes17.dex */
public class ReconnectUtils {

    public interface ConnectFailTip extends Runnable {
        boolean dismiss(DeviceInfo deviceInfo);
    }

    public static void d(final DeviceInfo deviceInfo, final SimpleChain.Emitter emitter) {
        final Activity activity = BaseApplication.getActivity();
        if (activity == null) {
            emitter.onError("context == null");
        } else {
            SimpleChain.b("ReconnectUtils").e(new SimpleChain.INext() { // from class: ruo
                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
                public final void onNext(SimpleChain.Emitter emitter2, Object[] objArr) {
                    ReconnectUtils.b(emitter2, activity, deviceInfo);
                }
            }).e(new SimpleChain.INext() { // from class: run
                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.INext
                public final void onNext(SimpleChain.Emitter emitter2, Object[] objArr) {
                    ReconnectUtils.a(emitter2, activity);
                }
            }).d(new SimpleChain.Emitter() { // from class: com.huawei.ui.homehealth.device.util.ReconnectUtils.2
                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
                public void onSuccess(Object... objArr) {
                    ReconnectUtils.d(activity, deviceInfo);
                    emitter.onSuccess(new Object[0]);
                }

                @Override // com.huawei.hwcommonmodel.utils.SimpleChain.Emitter
                public void onError(String str) {
                    ReleaseLogUtil.e("R_ReconnectUtils", "reconnect onError:", str);
                    emitter.onError(str);
                }
            }, new Object[0]);
        }
    }

    public static void b(SimpleChain.Emitter emitter, Activity activity, final DeviceInfo deviceInfo) {
        BluetoothEnableUtils.d(emitter, activity, new BluetoothEnableUtils.IsSupportLocation() { // from class: com.huawei.ui.homehealth.device.util.ReconnectUtils.1
            @Override // com.huawei.ui.device.akruidevcie.utils.BluetoothEnableUtils.IsSupportLocation
            public boolean get() {
                return lvi.a(deviceInfo.getProductType()).b() == 2;
            }
        });
    }

    public static void a(SimpleChain.Emitter emitter, Activity activity) {
        if (maq.b().f()) {
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(activity).a(activity.getResources().getString(R.string.IDS_main_device_ota_error_message)).c(R.string.IDS_user_permission_know, new View.OnClickListener() { // from class: rup
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogUtil.a("ReconnectUtils", "showTipDialog，click known button");
                }
            }).c();
            noTitleCustomAlertDialogC.setCancelable(false);
            noTitleCustomAlertDialogC.show();
            emitter.onError("hasOtaUpdating");
            return;
        }
        emitter.onSuccess(new Object[0]);
    }

    public static void e(SimpleChain.Emitter emitter, Activity activity, DeviceInfo deviceInfo) {
        if (lwg.d().e(deviceInfo.getDeviceIdentify())) {
            NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(activity).a(activity.getString(R.string.IDS_device_ota_later_note)).c(R.string.IDS_user_permission_know, new View.OnClickListener() { // from class: rur
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    LogUtil.a("ReconnectUtils", "showTipDialog，click known button");
                }
            }).c();
            noTitleCustomAlertDialogC.setCancelable(false);
            noTitleCustomAlertDialogC.show();
            emitter.onError("checkHasOtaUpdatingDevice hasOtaUpdating");
            return;
        }
        emitter.onSuccess(new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(final Activity activity, final DeviceInfo deviceInfo) {
        final List<DeviceInfo> listK = tfn.a().k();
        d(deviceInfo, listK);
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        final boolean z = deviceInfo instanceof CloudDeviceInfo;
        final DownloadCloudDeviceResource downloadCloudDeviceResource = new DownloadCloudDeviceResource();
        if (z) {
            res.d().b(true);
            res.d().a(deviceInfo.getProductType(), deviceInfo.getDeviceName(), deviceIdentify, activity);
            deviceIdentify = deviceInfo.getProductType() + Constants.LINK + deviceInfo.getDeviceIdentify();
        } else {
            downloadCloudDeviceResource.e();
        }
        final String str = deviceIdentify;
        ThreadPoolManager.c().execute(new Runnable() { // from class: com.huawei.ui.homehealth.device.util.ReconnectUtils.5
            @Override // java.lang.Runnable
            public void run() {
                lvl.a((List<DeviceInfo>) listK, str);
                new rfi().b(downloadCloudDeviceResource, ReconnectUtils.d(deviceInfo), z, str, activity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String d(DeviceInfo deviceInfo) {
        if (deviceInfo instanceof CloudDeviceInfo) {
            return ((CloudDeviceInfo) deviceInfo).getDeviceProfileId();
        }
        return deviceInfo.getSecurityUuid() + "#ANDROID21";
    }

    private static void d(DeviceInfo deviceInfo, List<DeviceInfo> list) {
        if (list == null) {
            LogUtil.a("ReconnectUtils", "handleDeviceState deviceInfoLists is null");
            return;
        }
        if (eel.d(deviceInfo.getProductType())) {
            for (DeviceInfo deviceInfo2 : list) {
                if (deviceInfo.getDeviceIdentify().equalsIgnoreCase(deviceInfo2.getDeviceIdentify())) {
                    deviceInfo2.setDeviceActiveState(1);
                    deviceInfo2.setDeviceConnectState(1);
                } else if (!eel.d(deviceInfo2.getProductType())) {
                    LogUtil.j("ReconnectUtils", "handleDeviceState default");
                } else {
                    deviceInfo2.setDeviceActiveState(0);
                    deviceInfo2.setDeviceConnectState(3);
                }
            }
            return;
        }
        for (DeviceInfo deviceInfo3 : list) {
            if (deviceInfo.getDeviceIdentify().equalsIgnoreCase(deviceInfo3.getDeviceIdentify())) {
                deviceInfo3.setDeviceActiveState(1);
                deviceInfo3.setDeviceConnectState(1);
            }
            if (!deviceInfo.getDeviceIdentify().equalsIgnoreCase(deviceInfo3.getDeviceIdentify()) && deviceInfo3.getAutoDetectSwitchStatus() != 1 && !rdp.d(deviceInfo.getProductType()) && deviceInfo3.getDeviceActiveState() == 1) {
                deviceInfo3.setDeviceActiveState(0);
                deviceInfo3.setDeviceConnectState(3);
            }
        }
        dxx.d().j();
    }

    public static ConnectFailTip a(final Activity activity, final DeviceInfo deviceInfo, final int i, final ReconnectCallback reconnectCallback) {
        ConnectFailTip connectFailTip = new ConnectFailTip() { // from class: com.huawei.ui.homehealth.device.util.ReconnectUtils.3
            private BaseDialog d;

            @Override // java.lang.Runnable
            public void run() {
                if (activity != com.huawei.haf.application.BaseApplication.j()) {
                    return;
                }
                DeviceInfo deviceInfo2 = deviceInfo;
                if ((deviceInfo2 instanceof CloudDeviceInfo) && deviceInfo2.getProductType() != 275) {
                    a(deviceInfo);
                } else {
                    c(deviceInfo);
                }
            }

            private void a(DeviceInfo deviceInfo2) {
                if (i == 1) {
                    c(deviceInfo2);
                    return;
                }
                CloudReconnectFailDialog.Builder builder = new CloudReconnectFailDialog.Builder(activity);
                builder.a(deviceInfo2.getProductType(), lvi.a(deviceInfo2.getProductType()).b()).b(reconnectCallback);
                CloudReconnectFailDialog cloudReconnectFailDialogE = builder.e();
                this.d = cloudReconnectFailDialogE;
                cloudReconnectFailDialogE.setCanceledOnTouchOutside(false);
                if (this.d.isShowing() || activity.isFinishing()) {
                    return;
                }
                this.d.show();
            }

            private void c(DeviceInfo deviceInfo2) {
                if (ReconnectUtils.e(deviceInfo2) && deviceInfo2.getProductType() >= 85 && deviceInfo2.getProductType() != 275) {
                    ReconnectUtils.a(deviceInfo2, "e1");
                } else {
                    this.d = rtk.e(activity, dxx.d().e(deviceInfo2.getProductType()));
                }
            }

            @Override // com.huawei.ui.homehealth.device.util.ReconnectUtils.ConnectFailTip
            public boolean dismiss(DeviceInfo deviceInfo2) {
                BaseDialog baseDialog = this.d;
                if (baseDialog == null || !baseDialog.isShowing()) {
                    return true;
                }
                if (deviceInfo2 != null && mig.d(deviceInfo, deviceInfo2) && deviceInfo2.getDeviceConnectState() != 2) {
                    return false;
                }
                baseDialog.dismiss();
                return true;
            }
        };
        activity.runOnUiThread(connectFailTip);
        return connectFailTip;
    }

    public static boolean e(DeviceInfo deviceInfo) {
        boolean z = false;
        if (deviceInfo == null) {
            LogUtil.j("ReconnectUtils", "showTipDialog, deviceInfo is null");
            return false;
        }
        if (deviceInfo.getProductType() == 275) {
            return false;
        }
        String strE = ykx.e(deviceInfo);
        if (!(deviceInfo instanceof CloudDeviceInfo) && (Objects.equals(strE, "06E") || Objects.equals(strE, "06D"))) {
            z = true;
        }
        LogUtil.a("ReconnectUtils", "isLocalWearDevice: ", Boolean.valueOf(z));
        return z;
    }

    public static void a(DeviceInfo deviceInfo, String str) {
        if (deviceInfo == null) {
            ReleaseLogUtil.e("R_ReconnectUtils", "deviceInfo == null");
            return;
        }
        Activity activity = BaseApplication.getActivity();
        if (activity == null) {
            ReleaseLogUtil.e("R_ReconnectUtils", "context == null");
            return;
        }
        cqp.a(100117, deviceInfo.getDeviceName(), String.valueOf(deviceInfo.getProductType()), str);
        Intent intent = new Intent(activity, (Class<?>) ReconnectFailGuideActivity.class);
        intent.putExtra("pairGuideSelectAddress", deviceInfo.getDeviceIdentify());
        Bundle bundle = new Bundle();
        bundle.putParcelable("deviceInfo", deviceInfo);
        intent.putExtras(bundle);
        activity.startActivityForResult(intent, 1);
    }

    public static void b(final Activity activity, final DeviceInfo deviceInfo) {
        activity.runOnUiThread(new Runnable() { // from class: ruq
            @Override // java.lang.Runnable
            public final void run() {
                ReconnectUtils.a(activity, deviceInfo);
            }
        });
    }

    public static /* synthetic */ void a(Activity activity, DeviceInfo deviceInfo) {
        if (activity != com.huawei.haf.application.BaseApplication.j()) {
            return;
        }
        LogUtil.a("ReconnectUtils", "handOObe enter judge");
        Intent intent = new Intent();
        intent.putExtra("pairGuideSelectAddress", deviceInfo.getDeviceIdentify());
        intent.setClass(activity, AgreementDeclarationActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("deviceInfo", deviceInfo);
        intent.putExtras(bundle);
        intent.putExtra("device_country_code", deviceInfo.getCountryCode());
        intent.putExtra("device_emui_version", deviceInfo.getEmuiVersion());
        activity.startActivity(intent);
    }
}
