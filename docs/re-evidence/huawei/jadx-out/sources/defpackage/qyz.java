package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Message;
import android.os.RemoteException;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.CharacterStyle;
import android.text.style.ClickableSpan;
import android.text.style.TypefaceSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.huawei.devicefeature.DeviceFeatureSupportApi;
import com.huawei.haf.bundle.AppBundle;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.device.ui.privacy.HonorDeviceShowPrivacyActivity;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceCapability;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbtsdk.btcommon.BTDeviceMgrUtil;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwcommonmodel.constants.AnalyticsValue;
import com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager;
import com.huawei.hwdevice.phoneprocess.mgr.connectmgr.DeviceDialogMessage;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwlogsmodel.common.LogConfig;
import com.huawei.hwservicesmgr.IWearPhoneServiceAIDL;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.maps.offlinedata.health.p2p.receiver.OfflineMapReceiver;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.ui.commonui.button.HealthButton;
import com.huawei.ui.commonui.checkbox.HealthCheckBox;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import com.huawei.ui.device.R;
import com.huawei.ui.device.activity.agreement.AgreementDeclarationActivity;
import com.huawei.ui.device.activity.pairing.DevicePairDoneActivity;
import com.huawei.ui.device.activity.pairing.DevicePairGuideActivity;
import com.huawei.ui.device.activity.pairing.DevicePairGuideUtil;
import com.huawei.ui.device.activity.pairing.KeepAliveTipsActivity;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.device.utlis.FindNetworkUtils;
import com.huawei.ui.main.stories.guide.interactors.GuideInteractors;
import com.huawei.ui.main.stories.me.views.privacy.OtaPrivacyActivity;
import com.huawei.ui.main.stories.userprofile.activity.WorkModeConflictDialogActivity;
import health.compact.a.BroadcastManagerUtil;
import health.compact.a.CommonUtil;
import health.compact.a.CompileParameterUtil;
import health.compact.a.LanguageUtil;
import health.compact.a.LocalBroadcast;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes16.dex */
public class qyz {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f46978a = System.lineSeparator();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private DevicePairGuideActivity f46980c;
    private AnimationDrawable e;
    private qtx n;
    private ExecutorService i = Executors.newCachedThreadPool();
    private boolean j = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f46979b = -1;
    private NoTitleCustomAlertDialog d = null;
    private int l = 1;
    private qyx h = new qyx();
    private qyv k = new qyv();
    private qyw g = new qyw();
    private qzb f = new qzb();

    public void a(DevicePairGuideActivity devicePairGuideActivity) {
        if (devicePairGuideActivity != null) {
            this.f46980c = devicePairGuideActivity;
        }
    }

    public void b() {
        if (this.f46980c != null) {
            this.f46980c = null;
        }
    }

    public void c() {
        LogUtil.a("DEVMGR_MemberAndViewHelper", "destroyInstance() start.");
        lvb.e().b("deleteDevice", new DeviceInfo(), 0, String.valueOf(false));
        ExecutorService executorService = this.i;
        if (executorService != null) {
            executorService.shutdown();
        }
        this.f.b();
    }

    public void d() {
        this.f.a();
    }

    public void d(final DevicePairGuideActivity devicePairGuideActivity) {
        devicePairGuideActivity.d.start();
        j(devicePairGuideActivity);
        ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).downloadIndexByUuidList(devicePairGuideActivity.dn, new DownloadDeviceInfoCallBack() { // from class: qyz.3
            @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack
            public void onSuccess() {
                devicePairGuideActivity.d.stop();
                qyz.this.g(devicePairGuideActivity);
            }

            @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack
            public void onFailure(int i) {
                devicePairGuideActivity.d.stop();
                rdt.b(100102, "");
                qyz.this.d(devicePairGuideActivity, i);
            }

            @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack
            public void netWorkError() {
                devicePairGuideActivity.d.stop();
                qyz.this.h(devicePairGuideActivity);
            }

            @Override // com.huawei.health.devicemgr.business.entity.downloadresouce.DownloadDeviceInfoCallBack
            public void onDownload(int i) {
                qyz.this.b(devicePairGuideActivity, i);
            }
        });
    }

    private void b(int i, ImageView imageView) {
        DevicePairGuideUtil.b(i, imageView);
    }

    private void g(int i) {
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            return;
        }
        devicePairGuideActivity.cb.setVisibility(8);
        devicePairGuideActivity.bt.setVisibility(8);
        devicePairGuideActivity.am.setVisibility(8);
        devicePairGuideActivity.da.setVisibility(0);
        devicePairGuideActivity.ak.setVisibility(0);
        devicePairGuideActivity.cr.setVisibility(8);
        devicePairGuideActivity.n.setVisibility(8);
        devicePairGuideActivity.l.setVisibility(8);
        devicePairGuideActivity.r.setVisibility(8);
        devicePairGuideActivity.k.setVisibility(8);
        devicePairGuideActivity.cf.setVisibility(8);
        devicePairGuideActivity.cx.setVisibility(0);
        devicePairGuideActivity.cx.setImageResource(R.drawable.ic_pairing_completed);
        devicePairGuideActivity.dc.setText(i);
        devicePairGuideActivity.df.setVisibility(0);
        devicePairGuideActivity.s.setVisibility(8);
    }

    private void e(GuideInteractors guideInteractors) {
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            return;
        }
        o(devicePairGuideActivity);
        devicePairGuideActivity.y.setVisibility(0);
        t(devicePairGuideActivity);
        devicePairGuideActivity.bz.setVisibility(8);
        devicePairGuideActivity.cc.setVisibility(0);
        LogUtil.a("DEVMGR_MemberAndViewHelper", "Enter MSG_SHOW_PAIR_SUCCESS_RESULT():");
        guideInteractors.e(true);
        if (!rdp.d(devicePairGuideActivity.aq)) {
            guideInteractors.b(true);
            guideInteractors.c(true);
            guideInteractors.a(true);
            guideInteractors.j(true);
        }
        String string = devicePairGuideActivity.getResources().getString(R.string.IDS_apphelp_pwindows_continue_button);
        String string2 = devicePairGuideActivity.getResources().getString(R.string.IDS_sns_compelete);
        devicePairGuideActivity.ao = DeviceSettingsInteractors.e(BaseApplication.getContext());
        devicePairGuideActivity.ap = devicePairGuideActivity.ao.e(devicePairGuideActivity.dm);
        devicePairGuideActivity.as.setVisibility(0);
        devicePairGuideActivity.v.setVisibility(8);
        if (devicePairGuideActivity.ap != null && devicePairGuideActivity.ap.isMessageAlert()) {
            devicePairGuideActivity.bm = true;
            LogUtil.a("DEVMGR_MemberAndViewHelper", "device is support notification");
            if (devicePairGuideActivity.bh && !nzz.c()) {
                if (LanguageUtil.bq(BaseApplication.getContext())) {
                    devicePairGuideActivity.as.setText(string2.toUpperCase(new Locale("tr", "TR")));
                } else {
                    devicePairGuideActivity.as.setText(string2.toUpperCase(Locale.ENGLISH));
                }
            } else {
                devicePairGuideActivity.as.setText(string.toUpperCase(Locale.ENGLISH));
            }
        } else {
            LogUtil.a("DEVMGR_MemberAndViewHelper", "device is not support notification");
            if (nzz.c()) {
                devicePairGuideActivity.as.setText(string.toUpperCase(Locale.ENGLISH));
            } else {
                devicePairGuideActivity.as.setText(string2.toUpperCase(Locale.ENGLISH));
            }
        }
        if (m(this.f46980c)) {
            y();
        }
    }

    private void o(DevicePairGuideActivity devicePairGuideActivity) {
        DeviceCapability deviceCapability;
        Map<String, DeviceCapability> mapD = lvb.e().d(3, "", "DEVMGR_MemberAndViewHelper");
        if (mapD != null) {
            LogUtil.j("DEVMGR_MemberAndViewHelper", "filter deviceCapabilityMap is null");
            deviceCapability = mapD.get(devicePairGuideActivity.ai);
        } else {
            deviceCapability = null;
        }
        LogUtil.a("DEVMGR_MemberAndViewHelper", "query deviceCapabilityMap:", BTDeviceMgrUtil.c().e(devicePairGuideActivity.ai));
        if (eel.e(devicePairGuideActivity.aq) || eel.b(devicePairGuideActivity.aq)) {
            int i = R.string.IDS_aw_binding_remind;
            if (qrs.ah(BaseApplication.getContext())) {
                i = R.string.IDS_pad_aw_binding_remind;
            }
            devicePairGuideActivity.df.setText(i);
            return;
        }
        if (b(deviceCapability)) {
            x(devicePairGuideActivity);
        } else {
            a(devicePairGuideActivity, deviceCapability);
        }
    }

    private boolean b(DeviceCapability deviceCapability) {
        DeviceInfo deviceInfoB = mgg.b(x(), "DEVMGR_MemberAndViewHelper");
        if (deviceInfoB != null) {
            if (deviceInfoB.getSportVersion() == 1) {
                return true;
            }
            if (deviceInfoB.getSportVersion() == 0) {
                return false;
            }
        }
        return deviceCapability != null && deviceCapability.isSupportSmartWatchVersionStatus();
    }

    private void a(DevicePairGuideActivity devicePairGuideActivity, DeviceCapability deviceCapability) {
        String strBf;
        LogUtil.a("DEVMGR_MemberAndViewHelper", "setSportWatchPairResult in. ");
        if (this.l == 2) {
            devicePairGuideActivity.df.setText(devicePairGuideActivity.getResources().getString(R.string.IDS_family_pair_success_tip));
            return;
        }
        LogUtil.a("DEVMGR_MemberAndViewHelper", "deviceCapability == null in. ", deviceCapability == null ? null : Boolean.valueOf(deviceCapability.isSupportHiWear()));
        if (Utils.h() && deviceCapability != null && deviceCapability.isSupportHiWear()) {
            String strD = lvi.d(devicePairGuideActivity.aq);
            boolean zIsResourcesAvailable = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isResourcesAvailable(strD);
            LogUtil.a("DEVMGR_MemberAndViewHelper", "Paired successful tip: ", strD, ", isPluginAvailable.", Boolean.valueOf(zIsResourcesAvailable));
            if (zIsResourcesAvailable) {
                edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(strD);
                LogUtil.a("DEVMGR_MemberAndViewHelper", "get devicePluginInfo. ");
                if (pluginInfoByUuid == null || pluginInfoByUuid.i() == null) {
                    LogUtil.j("DEVMGR_MemberAndViewHelper", "devicePluginInfo or WearDeviceInfo is null");
                } else {
                    edz edzVarI = pluginInfoByUuid.i();
                    if (!TextUtils.isEmpty(edzVarI.bf())) {
                        strBf = edzVarI.bf();
                    }
                }
                strBf = "";
            } else {
                strBf = "";
            }
            a(strBf, devicePairGuideActivity);
            return;
        }
        String string = devicePairGuideActivity.getResources().getString(R.string.IDS_device_paring_success_descommon_info_union_new);
        if (qrs.ah(BaseApplication.getContext())) {
            string = devicePairGuideActivity.getResources().getString(R.string.IDS_pad_device_descommon_union);
        }
        devicePairGuideActivity.df.setText(string);
    }

    private void a(String str, DevicePairGuideActivity devicePairGuideActivity) {
        int iN = CommonUtil.n(BaseApplication.getContext(), LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009));
        if (!TextUtils.isEmpty(str)) {
            d(devicePairGuideActivity, str);
            return;
        }
        if (iN == 7 && !qrs.ah(BaseApplication.getContext())) {
            b(devicePairGuideActivity, devicePairGuideActivity.getResources().getString(R.string.IDS_eur_phone_pair_ok_tip_sport));
            return;
        }
        String string = devicePairGuideActivity.getResources().getString(R.string.IDS_device_paring_success_tip);
        if (qrs.ah(BaseApplication.getContext())) {
            d(devicePairGuideActivity, devicePairGuideActivity.getResources().getString(R.string.IDS_pad_device_paring_tip));
        } else {
            d(devicePairGuideActivity, string);
        }
    }

    private void x(DevicePairGuideActivity devicePairGuideActivity) {
        if (Utils.o()) {
            if (Utils.h()) {
                w(devicePairGuideActivity);
                return;
            }
            String string = devicePairGuideActivity.getResources().getString(R.string.IDS_pair_smart_ok_oversea);
            if (qrs.ah(BaseApplication.getContext())) {
                string = devicePairGuideActivity.getResources().getString(R.string.IDS_pad_pair_smart_ok_oversea);
            }
            devicePairGuideActivity.df.setText(string);
            return;
        }
        String string2 = devicePairGuideActivity.getResources().getString(R.string.IDS_phone_pair_ok_tip);
        if (qrs.ah(BaseApplication.getContext())) {
            string2 = devicePairGuideActivity.getResources().getString(R.string.IDS_pad_pair_ok_tip);
        }
        d(devicePairGuideActivity, string2);
    }

    private void w(DevicePairGuideActivity devicePairGuideActivity) {
        if (CommonUtil.n(BaseApplication.getContext(), LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009)) == 7 && !qrs.ah(BaseApplication.getContext())) {
            b(devicePairGuideActivity, devicePairGuideActivity.getResources().getString(R.string.IDS_eur_phone_pair_ok_tip));
            return;
        }
        String string = devicePairGuideActivity.getResources().getString(R.string.IDS_phone_pair_ok_oversea);
        if (qrs.ah(BaseApplication.getContext())) {
            string = devicePairGuideActivity.getResources().getString(R.string.IDS_pad_pair_ok_oversea);
        }
        d(devicePairGuideActivity, string);
    }

    private void b(DevicePairGuideActivity devicePairGuideActivity, String str) {
        devicePairGuideActivity.df.setText(str);
        LogUtil.a("DEVMGR_MemberAndViewHelper", "setWatchTips enter");
        String string = devicePairGuideActivity.getResources().getString(R.string.IDS_eur_phone_pair_ok_tip2);
        String string2 = devicePairGuideActivity.getResources().getString(R.string.IDS_eur_phone_pair_here);
        String str2 = String.format(Locale.ENGLISH, string, string2);
        SpannableString spannableString = new SpannableString(str2);
        int iIndexOf = str2.indexOf(string2);
        int length = string2.length() + iIndexOf;
        LogUtil.a("DEVMGR_MemberAndViewHelper", "startPosition: ", Integer.valueOf(iIndexOf), " ", Integer.valueOf(length));
        qri.d(spannableString, iIndexOf, length, new wmt(devicePairGuideActivity.getBaseContext(), "HealthPrivacy"));
        qri.d(spannableString, iIndexOf, length, new TypefaceSpan(Constants.FONT));
        devicePairGuideActivity.db.setMovementMethod(LinkMovementMethod.getInstance());
        devicePairGuideActivity.db.setVisibility(0);
        devicePairGuideActivity.db.setHighlightColor(devicePairGuideActivity.getResources().getColor(android.R.color.transparent));
        devicePairGuideActivity.db.setText(spannableString);
    }

    private void t(DevicePairGuideActivity devicePairGuideActivity) {
        if (qrs.ac()) {
            ViewGroup.LayoutParams layoutParams = devicePairGuideActivity.y.getLayoutParams();
            layoutParams.height = qrs.d(BaseApplication.getContext(), 80.0f);
            devicePairGuideActivity.y.setLayoutParams(layoutParams);
        }
    }

    private void d(DevicePairGuideActivity devicePairGuideActivity, String str) {
        String string = devicePairGuideActivity.getResources().getString(R.string.IDS_hw_common_ui_xlistview_footer_hint_normal);
        String string2 = devicePairGuideActivity.getResources().getString(R.string.IDS_device_pair_minute_and_second, str, string);
        SpannableString spannableString = new SpannableString(string2);
        int length = string2.length() - string.length();
        qri.d(spannableString, length, spannableString.toString().length(), new wmt(devicePairGuideActivity.getBaseContext(), "HealthPrivacy"));
        qri.d(spannableString, length, spannableString.toString().length(), new TypefaceSpan(Constants.FONT));
        devicePairGuideActivity.df.setMovementMethod(LinkMovementMethod.getInstance());
        devicePairGuideActivity.df.setHighlightColor(devicePairGuideActivity.getResources().getColor(android.R.color.transparent));
        devicePairGuideActivity.df.setText(spannableString);
    }

    public boolean h() {
        return this.h.b(this.f46980c);
    }

    protected void f() {
        this.h.d(this.f46980c);
    }

    public void e(long j, int i, int i2) {
        this.f46979b = j;
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            LogUtil.j("DEVMGR_MemberAndViewHelper", "receiverPairRequest activity is null");
            return;
        }
        boolean zC = this.h.c(i, i2);
        if (b(i2)) {
            a(10001, zC);
        } else {
            this.h.b(devicePairGuideActivity, zC);
        }
    }

    private boolean b(int i) {
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            LogUtil.j("DEVMGR_MemberAndViewHelper", "isNeedToHonorPrivacy activity is null");
            return false;
        }
        if (etn.d((Context) devicePairGuideActivity) && lvi.l(i)) {
            return !SharedPreferenceManager.c(devicePairGuideActivity, LoginInit.getInstance(devicePairGuideActivity).getUsetId());
        }
        return false;
    }

    public void a(boolean z) {
        LogUtil.a("DEVMGR_MemberAndViewHelper", "sendBluetoothConnection isOpenTestButton:", Boolean.valueOf(z));
        if (z) {
            qzd.c(BaseApplication.getContext()).a(this.f46979b, rcv.a(a()));
            return;
        }
        IWearPhoneServiceAIDL iWearPhoneServiceAIDLC = lug.c();
        if (iWearPhoneServiceAIDLC != null) {
            try {
                DeviceDialogMessage deviceDialogMessage = new DeviceDialogMessage();
                deviceDialogMessage.setMethod(10026);
                deviceDialogMessage.setIsStatusFlag(false);
                deviceDialogMessage.setSelectId(this.f46979b);
                deviceDialogMessage.setDeviceName(null);
                int iA = rcv.a(a());
                if (CompileParameterUtil.c("IS_SUPPORT_NEW_ADD_MODE", false) && iA != -1) {
                    deviceDialogMessage.setBluetoothType(iA);
                }
                LogUtil.a("DEVMGR_MemberAndViewHelper", "connectSelectedDevice deviceName:", deviceDialogMessage.getDeviceName(), ", bluetoothType:", Integer.valueOf(deviceDialogMessage.getBluetoothType()));
                iWearPhoneServiceAIDLC.dialogMessage(deviceDialogMessage, null);
            } catch (RemoteException unused) {
                LogUtil.e("DEVMGR_MemberAndViewHelper", "connectSelectedDevice RemoteException");
            }
        }
    }

    public void d(boolean z) {
        this.h.e(this.f46980c, z);
    }

    public void t() {
        this.k.e(this.f46980c);
    }

    public void j() {
        this.g.d(this.f46980c);
    }

    public void g() {
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            return;
        }
        DevicePairGuideActivity.setViewSafeRegion(false, devicePairGuideActivity.da, devicePairGuideActivity.ak);
        DevicePairGuideActivity.setViewSafeRegion(false, devicePairGuideActivity.am, devicePairGuideActivity.n, devicePairGuideActivity.s);
        devicePairGuideActivity.bz.setOnClickListener(devicePairGuideActivity);
        devicePairGuideActivity.cc.setOnClickListener(devicePairGuideActivity);
        LogUtil.a("DEVMGR_MemberAndViewHelper", "mIsFromScanList:", Boolean.valueOf(devicePairGuideActivity.bf));
        l(devicePairGuideActivity);
        if (devicePairGuideActivity.bf && devicePairGuideActivity.bd) {
            z(devicePairGuideActivity);
            y(devicePairGuideActivity);
            d(devicePairGuideActivity);
            return;
        }
        u(devicePairGuideActivity);
    }

    private void l(final DevicePairGuideActivity devicePairGuideActivity) {
        devicePairGuideActivity.as = (HealthButton) qsp.a(devicePairGuideActivity, R.id.done_button);
        devicePairGuideActivity.as.setOnClickListener(new View.OnClickListener() { // from class: qzc
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.a(devicePairGuideActivity, view);
            }
        });
        devicePairGuideActivity.ay = (HealthButton) qsp.a(devicePairGuideActivity, R.id.got_it_button);
        devicePairGuideActivity.ay.setOnClickListener(new View.OnClickListener() { // from class: qzi
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f47028c.e(view);
            }
        });
        devicePairGuideActivity.dt = (HealthCheckBox) qsp.a(devicePairGuideActivity, R.id.wlan_auto_download_checkbox);
        devicePairGuideActivity.du = (LinearLayout) qsp.a(devicePairGuideActivity, R.id.wlan_auto_download_layout);
        devicePairGuideActivity.dq = (HealthTextView) qsp.a(devicePairGuideActivity, R.id.wlan_auto_download_text);
        if (Utils.o()) {
            devicePairGuideActivity.dq.setText(R.string.IDS_wlan_auto_update_device_new_overseas);
        } else {
            devicePairGuideActivity.dq.setText(R.string.IDS_wlan_auto_update_device_new);
        }
        devicePairGuideActivity.i = (LinearLayout) qsp.a(this.f46980c, R.id.auto_install_layout);
        devicePairGuideActivity.f = (HealthCheckBox) qsp.a(this.f46980c, R.id.auto_install_checkbox);
        devicePairGuideActivity.j = (LinearLayout) qsp.a(this.f46980c, R.id.auto_open_wifi_layout);
        devicePairGuideActivity.h = (HealthCheckBox) qsp.a(this.f46980c, R.id.auto_open_wifi_checkbox);
        devicePairGuideActivity.m = (HealthTextView) qsp.a(this.f46980c, R.id.auto_open_wifi_text);
        devicePairGuideActivity.g = (HealthTextView) qsp.a(this.f46980c, R.id.auto_open_wifi_content_text);
        devicePairGuideActivity.cy = (HealthTextView) qsp.a(devicePairGuideActivity, R.id.pair_result_device_ota_privacy_txt);
        devicePairGuideActivity.bv = (HealthTextView) qsp.a(devicePairGuideActivity, R.id.pair_continue_txt);
        devicePairGuideActivity.dp = (HealthTextView) qsp.a(devicePairGuideActivity, R.id.unpair_txt);
    }

    /* synthetic */ void a(DevicePairGuideActivity devicePairGuideActivity, View view) {
        LogUtil.a("DEVMGR_MemberAndViewHelper", "mDoneButton onclick");
        DevicePairGuideActivity devicePairGuideActivity2 = this.f46980c;
        if (devicePairGuideActivity2 == null) {
            return;
        }
        devicePairGuideActivity2.a();
        p(devicePairGuideActivity);
        v();
        if (this.f46980c.i.getVisibility() == 0 && !this.f46980c.f.isChecked()) {
            this.f46980c.startActivityForResult(new Intent(this.f46980c, (Class<?>) DevicePairDoneActivity.class), 10003);
            return;
        }
        b(true);
        if (nzz.c()) {
            u();
        } else {
            c(true);
        }
    }

    /* synthetic */ void e(View view) {
        LogUtil.a("DEVMGR_MemberAndViewHelper", "mGotItButton onclick");
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            return;
        }
        devicePairGuideActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(DevicePairGuideActivity devicePairGuideActivity) {
        DevicePairGuideActivity.f24605c = false;
        if (CommonUtil.bg()) {
            LogUtil.j("DEVMGR_MemberAndViewHelper", "sendPairSuccessReceiver is huawei system");
            return;
        }
        Intent intent = new Intent();
        intent.setAction("com.huawei.health.action.PAIR_DEVICE_SUCCESS");
        BaseApplication.getContext().sendBroadcast(intent, LocalBroadcast.f36595c);
    }

    private void u() {
        Intent intent = new Intent(this.f46980c, (Class<?>) KeepAliveTipsActivity.class);
        intent.putExtra("DEVICE_NAME", this.f46980c.bo);
        this.f46980c.startActivityForResult(intent, 10004);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            return;
        }
        devicePairGuideActivity.ao = DeviceSettingsInteractors.e(BaseApplication.getContext());
        devicePairGuideActivity.af = devicePairGuideActivity.ao.e(x());
        if (devicePairGuideActivity.af == null) {
            LogUtil.a("DEVMGR_MemberAndViewHelper", "mDeviceCapability is null");
            return;
        }
        boolean isSupportAutoUpdate = devicePairGuideActivity.af.getIsSupportAutoUpdate();
        LogUtil.a("DEVMGR_MemberAndViewHelper", "isSupportAutoUpdate is ", Boolean.valueOf(isSupportAutoUpdate));
        if (isSupportAutoUpdate) {
            DeviceInfo deviceInfoB = mgg.b(x(), "DEVMGR_MemberAndViewHelper");
            if (deviceInfoB != null) {
                LogUtil.a("DEVMGR_MemberAndViewHelper", "saveAutoInstallCheck save AutoOnCheckedListener");
                rdt.e(deviceInfoB.getDeviceIdentify(), deviceInfoB.getDeviceUdid(), z);
                max.c().b(this.f46980c.ai, z ? 23 : 24);
                return;
            }
            LogUtil.j("DEVMGR_MemberAndViewHelper", "currentDeviceInfo is null");
        }
    }

    private void y(DevicePairGuideActivity devicePairGuideActivity) {
        if (TextUtils.isEmpty(devicePairGuideActivity.bp)) {
            return;
        }
        if (TextUtils.equals(devicePairGuideActivity.bp, "wear_watch")) {
            devicePairGuideActivity.cz.setImageResource(R.drawable.icon_watch_pair);
        } else if (TextUtils.equals(devicePairGuideActivity.bp, "SPORTS_GENIE".toLowerCase())) {
            devicePairGuideActivity.cz.setImageResource(R.drawable.icon_sports_genie_pair);
        } else if (TextUtils.equals(devicePairGuideActivity.bp, "wear_band")) {
            devicePairGuideActivity.cz.setImageResource(R.drawable.icon_hand_pair);
        }
    }

    private void u(DevicePairGuideActivity devicePairGuideActivity) {
        LogUtil.a("DEVMGR_MemberAndViewHelper", "startPair");
        devicePairGuideActivity.f24607b = false;
        boolean zN = lvi.n(devicePairGuideActivity.aq);
        if (!CommonUtil.ap() && zN) {
            boolean zC = qtk.c(((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(lvi.j(devicePairGuideActivity.aq)), devicePairGuideActivity.aq, CommonUtil.e(BaseApplication.getContext()));
            ReleaseLogUtil.d("DEVMGR_MemberAndViewHelper", "startPair isUpdate: ", Boolean.valueOf(zC));
            if (zC) {
                devicePairGuideActivity.bb.sendEmptyMessage(14);
                return;
            }
        }
        devicePairGuideActivity.e();
        devicePairGuideActivity.d.start();
        if (devicePairGuideActivity.bg && (devicePairGuideActivity.ag == null || devicePairGuideActivity.ag.i() == null)) {
            LogUtil.j("DEVMGR_MemberAndViewHelper", "mDeviceInfoForPlugin or mWearDeviceInfo is null");
            devicePairGuideActivity.bb.sendEmptyMessageDelayed(15, 500L);
        } else {
            c(devicePairGuideActivity);
        }
    }

    public void c(DevicePairGuideActivity devicePairGuideActivity) {
        if (LogConfig.b() && mgb.b(devicePairGuideActivity.bo, devicePairGuideActivity.ag)) {
            s(devicePairGuideActivity);
            if ("1".equals(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1004))) {
                c(devicePairGuideActivity, 1);
                rdt.d();
                return;
            } else {
                p();
                return;
            }
        }
        b(devicePairGuideActivity);
    }

    public void b(DevicePairGuideActivity devicePairGuideActivity) {
        if (devicePairGuideActivity == null) {
            return;
        }
        if (devicePairGuideActivity.bf) {
            if (b(devicePairGuideActivity.aq)) {
                a(10002, false);
                return;
            } else {
                f(devicePairGuideActivity);
                return;
            }
        }
        q(devicePairGuideActivity);
    }

    private void f(DevicePairGuideActivity devicePairGuideActivity) {
        if (this.h.c(devicePairGuideActivity)) {
            if (Utils.n() && !Utils.o()) {
                devicePairGuideActivity.cg.setVisibility(8);
                this.h.a(devicePairGuideActivity, true);
                return;
            } else {
                this.h.a(devicePairGuideActivity);
                b(devicePairGuideActivity.aq, devicePairGuideActivity.cz);
                return;
            }
        }
        q(devicePairGuideActivity);
    }

    private void q(DevicePairGuideActivity devicePairGuideActivity) {
        if (devicePairGuideActivity == null) {
            return;
        }
        devicePairGuideActivity.b();
        devicePairGuideActivity.d();
    }

    private void z(DevicePairGuideActivity devicePairGuideActivity) {
        devicePairGuideActivity.cb.setVisibility(8);
        devicePairGuideActivity.bt.setVisibility(8);
        devicePairGuideActivity.am.setVisibility(8);
        devicePairGuideActivity.y.setVisibility(8);
        devicePairGuideActivity.da.setVisibility(0);
        devicePairGuideActivity.ak.setVisibility(0);
        devicePairGuideActivity.cf.setVisibility(0);
        devicePairGuideActivity.cr.setVisibility(0);
        devicePairGuideActivity.df.setVisibility(8);
        devicePairGuideActivity.du.setVisibility(8);
        devicePairGuideActivity.i.setVisibility(8);
        devicePairGuideActivity.j.setVisibility(8);
        devicePairGuideActivity.cy.setVisibility(8);
        devicePairGuideActivity.cx.setVisibility(8);
        devicePairGuideActivity.ds.setVisibility(8);
        devicePairGuideActivity.s.setVisibility(8);
        devicePairGuideActivity.v.setVisibility(8);
        devicePairGuideActivity.av.setVisibility(0);
    }

    private boolean a(List<String> list, DevicePairGuideActivity devicePairGuideActivity) {
        for (String str : list) {
            edn ednVarA = lvi.a(str);
            if (ednVarA == null) {
                LogUtil.j("DEVMGR_MemberAndViewHelper", "deviceInfoPlugin is null");
                edn ednVarC = lvi.c(str, false);
                if (ednVarC == null) {
                    LogUtil.j("DEVMGR_MemberAndViewHelper", "deviceInfoNew is null");
                    return false;
                }
                int iL = ednVarC.l();
                LogUtil.a("DEVMGR_MemberAndViewHelper", "deviceType: ", Integer.valueOf(iL));
                if (iL == devicePairGuideActivity.aq) {
                    devicePairGuideActivity.aj = ednVarC.i();
                    return true;
                }
            } else {
                int iL2 = ednVarA.l();
                LogUtil.a("DEVMGR_MemberAndViewHelper", "deviceType: ", Integer.valueOf(iL2));
                if (iL2 == devicePairGuideActivity.aq) {
                    devicePairGuideActivity.aj = ednVarA.i();
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g(DevicePairGuideActivity devicePairGuideActivity) {
        devicePairGuideActivity.av.setVisibility(8);
        devicePairGuideActivity.at.setVisibility(8);
        devicePairGuideActivity.di.setVisibility(8);
        devicePairGuideActivity.br.setVisibility(8);
        devicePairGuideActivity.aq = lvi.c(devicePairGuideActivity.bo);
        int i = devicePairGuideActivity.aq;
        LogUtil.a("DEVMGR_MemberAndViewHelper", "downLoadSuccessInfo :", Integer.valueOf(i), ", name:", devicePairGuideActivity.bo);
        if (devicePairGuideActivity.aq == -1) {
            lvi.l();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused) {
                LogUtil.e("DEVMGR_MemberAndViewHelper", "downLoadSuccessInfo exception");
            }
            devicePairGuideActivity.aq = lvi.c(devicePairGuideActivity.bo);
        }
        if (devicePairGuideActivity.aq == -1) {
            xjt.l("get device type error");
            devicePairGuideActivity.bb.sendEmptyMessage(14);
            return;
        }
        if (njy.e(devicePairGuideActivity.dn)) {
            LogUtil.j("DEVMGR_MemberAndViewHelper", "uuidList is empty");
            xjt.l("uuidList is empty");
            d(devicePairGuideActivity, -1);
        } else if (!a(devicePairGuideActivity.dn, devicePairGuideActivity)) {
            LogUtil.j("DEVMGR_MemberAndViewHelper", "not found device");
            xjt.l("not found device");
            d(devicePairGuideActivity, -1);
        } else {
            devicePairGuideActivity.dh = devicePairGuideActivity.aq;
            u(devicePairGuideActivity);
        }
    }

    private void j(DevicePairGuideActivity devicePairGuideActivity) {
        ReleaseLogUtil.d("DEVMGR_MemberAndViewHelper", "enter downLoadDeviceResource()");
        devicePairGuideActivity.dc.setText("");
        devicePairGuideActivity.cr.setText("");
        devicePairGuideActivity.at.setVisibility(0);
        devicePairGuideActivity.di.setVisibility(8);
        devicePairGuideActivity.br.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(final DevicePairGuideActivity devicePairGuideActivity, int i) {
        xjt.l("download device resource error");
        ReleaseLogUtil.d("DEVMGR_MemberAndViewHelper", "enter downLoadDeviceResourceError()");
        devicePairGuideActivity.dc.setText(devicePairGuideActivity.getString(R.string.IDS_downlod_device_error));
        devicePairGuideActivity.cr.setText(R.string.IDS_network_check);
        devicePairGuideActivity.at.setVisibility(8);
        devicePairGuideActivity.di.setVisibility(0);
        devicePairGuideActivity.br.setVisibility(8);
        if (i == -3) {
            devicePairGuideActivity.dj.setText(R.string.IDS_download_error_storage);
        } else {
            devicePairGuideActivity.dj.setText(R.string.IDS_no_device_res);
        }
        devicePairGuideActivity.di.setOnClickListener(new View.OnClickListener() { // from class: qyz.14
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                qyz.this.d(devicePairGuideActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h(final DevicePairGuideActivity devicePairGuideActivity) {
        ReleaseLogUtil.d("DEVMGR_MemberAndViewHelper", "enter downLoadDeviceResourceNetError()");
        try {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            BroadcastManagerUtil.a(devicePairGuideActivity, devicePairGuideActivity.bq, intentFilter);
        } catch (IllegalStateException unused) {
            LogUtil.e("DEVMGR_MemberAndViewHelper", "registerNetBroadCast IllegalStateException");
        }
        devicePairGuideActivity.dc.setText(devicePairGuideActivity.getString(R.string.IDS_downlod_device_error));
        devicePairGuideActivity.cr.setText(R.string.IDS_network_check);
        devicePairGuideActivity.at.setVisibility(8);
        devicePairGuideActivity.di.setVisibility(8);
        devicePairGuideActivity.br.setVisibility(0);
        devicePairGuideActivity.br.setOnClickListener(new View.OnClickListener() { // from class: qyz.13
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (qyz.this.n == null) {
                    qyz.this.n = new qtx();
                }
                qyz.this.n.a(devicePairGuideActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(DevicePairGuideActivity devicePairGuideActivity, int i) {
        devicePairGuideActivity.at.setVisibility(0);
        devicePairGuideActivity.di.setVisibility(8);
        devicePairGuideActivity.br.setVisibility(8);
        devicePairGuideActivity.at.setProgress(i);
    }

    private void a(int i, boolean z) {
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            LogUtil.d("DEVMGR_MemberAndViewHelper", "DevicePairGuideActivity is null ");
            return;
        }
        devicePairGuideActivity.ba.setVisibility(4);
        Intent intent = new Intent(devicePairGuideActivity, (Class<?>) HonorDeviceShowPrivacyActivity.class);
        intent.putExtra("is_support_special_midware", z);
        intent.putExtra("honor_device_type_key", devicePairGuideActivity.aq);
        devicePairGuideActivity.startActivityForResult(intent, i);
    }

    public void a(int i, int i2, Intent intent) {
        LogUtil.a("DEVMGR_MemberAndViewHelper", "requestCode:", Integer.valueOf(i), "resultCode:", Integer.valueOf(i2), "data:", intent);
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            LogUtil.d("DEVMGR_MemberAndViewHelper", "DevicePairGuideActivity is null ");
            return;
        }
        devicePairGuideActivity.ba.setVisibility(0);
        if (d(i, i2, devicePairGuideActivity)) {
            return;
        }
        if (i == 10004) {
            if (i2 == 3) {
                c(true);
                return;
            }
            return;
        }
        if (i == 10003) {
            b(i2 == 2);
            if (nzz.c()) {
                u();
                return;
            } else {
                c(true);
                return;
            }
        }
        if (mgh.a(i, i2, intent, devicePairGuideActivity.ah)) {
            return;
        }
        if (intent == null || intent.getIntExtra("honor_show_privacy_key", 0) != 1) {
            devicePairGuideActivity.finish();
            return;
        }
        if (i == 10002) {
            f(devicePairGuideActivity);
        } else if (i == 10001) {
            this.h.e(devicePairGuideActivity, intent);
        } else {
            LogUtil.j("DEVMGR_MemberAndViewHelper", "do nothing");
        }
    }

    private boolean d(int i, int i2, DevicePairGuideActivity devicePairGuideActivity) {
        if (i != 10005) {
            return false;
        }
        if (i2 == 6) {
            devicePairGuideActivity.aw.setVisibility(0);
            devicePairGuideActivity.aw.setText(String.format(Locale.ROOT, devicePairGuideActivity.getResources().getString(R.string.IDS_ear_phone_pair_guid_error_tips), devicePairGuideActivity.getResources().getString(R.string.IDS_wear_home_device_earphone)));
            d(R.string.IDS_ear_phone_pair_error_result);
            return true;
        }
        d(R.string.IDS_blite_guide_paire_completed);
        devicePairGuideActivity.cz.setImageResource(R.drawable.icon_pair_watch_earphone);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v() {
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            return;
        }
        if (devicePairGuideActivity.du.getVisibility() == 0) {
            LogUtil.a("DEVMGR_MemberAndViewHelper", "mWlanAutoDownloadLayout is show ,isCheck ", Boolean.valueOf(devicePairGuideActivity.dt.isChecked()));
            rdt.d(devicePairGuideActivity.dt.isChecked());
            max.c().b(this.f46980c.ai, devicePairGuideActivity.dt.isChecked() ? 21 : 22);
        }
        r(devicePairGuideActivity);
        if (devicePairGuideActivity.j.getVisibility() == 0) {
            DeviceInfo deviceInfoB = mgg.b(x(), "DEVMGR_MemberAndViewHelper");
            if (deviceInfoB != null) {
                rdt.d(devicePairGuideActivity.h.isChecked(), deviceInfoB.getDeviceIdentify());
            } else {
                LogUtil.j("DEVMGR_MemberAndViewHelper", "handleWlanStatus currentDeviceInfo is null");
            }
        }
    }

    private void r(DevicePairGuideActivity devicePairGuideActivity) {
        DeviceInfo deviceInfoB = mgg.b(x(), "DEVMGR_MemberAndViewHelper");
        boolean z = eey.d(deviceInfoB, 108) && !Utils.k();
        LogUtil.a("DEVMGR_MemberAndViewHelper", "enter saveWlanSwitch isOverseaNoCloudVersion ", Boolean.valueOf(Utils.k()));
        if (z) {
            HwOtaUpgradeManager.d().c(deviceInfoB.getDeviceUdid(), String.valueOf(devicePairGuideActivity.dt.isChecked()));
        }
    }

    private void n(DevicePairGuideActivity devicePairGuideActivity) {
        if (mgb.e(this.l)) {
            AppBundle.d().preDownloadPlugins(BaseApplication.getContext(), Collections.singletonList("PluginWearAbility"), true, true);
        }
        if (rdp.c()) {
            AppBundle.d().preDownloadPlugins(BaseApplication.getContext(), Collections.singletonList("PluginHiAiEngine"), true, true);
        }
        LogUtil.a("DEVMGR_MemberAndViewHelper", "background downloading");
    }

    public void i() {
        final DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            return;
        }
        String string = devicePairGuideActivity.getResources().getString(R.string.IDS_device_pair_guide_step);
        devicePairGuideActivity.ce.setText(String.format(Locale.ENGLISH, string, 1));
        devicePairGuideActivity.cd.setText(String.format(Locale.ENGLISH, string, 2));
        devicePairGuideActivity.cj.setText(String.format(Locale.ENGLISH, string, 3));
        devicePairGuideActivity.ci.setText(String.format(Locale.ENGLISH, string, 4));
        devicePairGuideActivity.ae.setLeftButtonOnClickListener(new View.OnClickListener() { // from class: qyz.12
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ReleaseLogUtil.d("DEVMGR_MemberAndViewHelper", "onClick(): mCustomTitleBar");
                if (devicePairGuideActivity.e) {
                    qyz.this.d();
                    return;
                }
                devicePairGuideActivity.e(4, 1);
                if (!TextUtils.isEmpty(devicePairGuideActivity.dm) && !qyz.this.j) {
                    ArrayList arrayList = new ArrayList(16);
                    arrayList.add(devicePairGuideActivity.dm);
                    ReleaseLogUtil.d("DEVMGR_MemberAndViewHelper", "mCustomTitleBar LeftButton onClick unPair device");
                    devicePairGuideActivity.al.b((List<String>) arrayList, true);
                    xjt.l("user cancel pair device");
                    devicePairGuideActivity.c();
                    devicePairGuideActivity.finish();
                    return;
                }
                if (!qrs.r()) {
                    qyz.this.r();
                    devicePairGuideActivity.a();
                    qyz.this.p(devicePairGuideActivity);
                    qyz.this.v();
                    if (devicePairGuideActivity.i.getVisibility() != 0 || devicePairGuideActivity.f.isChecked()) {
                        qyz.this.b(true);
                        qyz.this.c(false);
                        return;
                    } else {
                        devicePairGuideActivity.startActivityForResult(new Intent(devicePairGuideActivity, (Class<?>) DevicePairDoneActivity.class), 10003);
                        return;
                    }
                }
                LogUtil.a("DEVMGR_MemberAndViewHelper", "click too fast");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            return;
        }
        if (z) {
            Intent intent = new Intent();
            intent.putExtra("device_id", devicePairGuideActivity.dm);
            intent.putExtra("is_support_notification", devicePairGuideActivity.bm);
            intent.putExtra("product_type", devicePairGuideActivity.aq);
            d(devicePairGuideActivity, intent);
            return;
        }
        ac(devicePairGuideActivity);
    }

    private void i(DevicePairGuideActivity devicePairGuideActivity) {
        boolean zD = eey.d(devicePairGuideActivity.ah, 283);
        LogUtil.a("DEVMGR_MemberAndViewHelper", "isSupportBeidou: ", Boolean.valueOf(zD));
        if (!zD || Utils.o() || !CommonUtil.ab(BaseApplication.getContext())) {
            lua.d(String.valueOf(10008), "beidouStatus", false);
        } else {
            mfx.a(devicePairGuideActivity.ah, new IBaseResponseCallback() { // from class: qyz.18
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public void a(int i, Object obj) {
                    LogUtil.a("DEVMGR_MemberAndViewHelper", "checkBeidouStatus, errorCode: ", Integer.valueOf(i), " objData: ", obj);
                    if (i != 0 || !(obj instanceof Boolean)) {
                        lua.d(String.valueOf(10008), "beidouStatus", false);
                    } else {
                        lua.d(String.valueOf(10008), "beidouStatus", !((Boolean) obj).booleanValue());
                    }
                }
            });
        }
    }

    private void d(final DevicePairGuideActivity devicePairGuideActivity, final Intent intent) {
        devicePairGuideActivity.runOnUiThread(new Runnable() { // from class: qyz.17
            @Override // java.lang.Runnable
            public void run() {
                if (devicePairGuideActivity.ca == 100003) {
                    qtv.e(intent, devicePairGuideActivity, qtv.c(2, true, devicePairGuideActivity.aq, true));
                } else {
                    devicePairGuideActivity.setResult(2, intent);
                }
                qyz.this.ac(devicePairGuideActivity);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ac(DevicePairGuideActivity devicePairGuideActivity) {
        String strE = SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), "first_pair_success_status");
        LogUtil.a("DEVMGR_MemberAndViewHelper", "isConnectSuccessGoBack value is ", strE);
        if (!"true".equals(strE)) {
            LogUtil.a("DEVMGR_MemberAndViewHelper", "isConnectSuccessGoBack first pair not success");
            SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10008), "first_pair_success_status", "true", null);
        }
        devicePairGuideActivity.c();
        devicePairGuideActivity.finish();
    }

    public CustomAlertDialog.Builder e() {
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            return null;
        }
        CustomAlertDialog.Builder builderD = new CustomAlertDialog.Builder(devicePairGuideActivity).d(R.string.IDS_service_area_notice_title);
        builderD.d(R.string.IDS_apphelp_pwindows_continue_button, new DialogInterface.OnClickListener() { // from class: qyz.16
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                LogUtil.a("DEVMGR_MemberAndViewHelper", "showunBindDialog onclick");
                DevicePairGuideActivity devicePairGuideActivity2 = qyz.this.f46980c;
                if (devicePairGuideActivity2 == null) {
                    return;
                }
                devicePairGuideActivity2.bb.sendEmptyMessageDelayed(9, 5000L);
                rcv.a(BaseApplication.getContext()).e(new IBaseResponseCallback() { // from class: qyz.16.5
                    @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                    /* JADX INFO: renamed from: onResponse */
                    public void a(int i2, Object obj) {
                        LogUtil.a("DEVMGR_MemberAndViewHelper", "initBindBuild migrateWearDeviceList errCode：", Integer.valueOf(i2));
                        DevicePairGuideActivity devicePairGuideActivity3 = qyz.this.f46980c;
                        if (devicePairGuideActivity3 == null || i2 != 0) {
                            return;
                        }
                        qyz.this.ab();
                        fks.d().b(devicePairGuideActivity3.aa.a(), new DevicePairGuideActivity.f(devicePairGuideActivity3));
                    }
                });
                if (devicePairGuideActivity2.z != null) {
                    devicePairGuideActivity2.z.dismiss();
                    devicePairGuideActivity2.z = null;
                }
            }
        });
        builderD.a(R.string.IDS_settings_button_cancal, new DialogInterface.OnClickListener() { // from class: qyz.19
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                LogUtil.a("DEVMGR_MemberAndViewHelper", "showDialogToMigrate setNegativeButton onclick");
                qyz.this.ad();
            }
        });
        return builderD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ab() {
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity != null) {
            devicePairGuideActivity.bb.postDelayed(new Runnable() { // from class: qyz.20
                @Override // java.lang.Runnable
                public void run() {
                    qyz.this.f46980c.aa.c();
                }
            }, 2000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ad() {
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            return;
        }
        if (devicePairGuideActivity.z != null) {
            devicePairGuideActivity.z.dismiss();
            devicePairGuideActivity.z = null;
        }
        devicePairGuideActivity.finish();
    }

    public void r() {
        LogUtil.a("DEVMGR_MemberAndViewHelper", "enter stopPairGuideAnim():!");
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            LogUtil.j("DEVMGR_MemberAndViewHelper", "stopPairGuideAnim mActivity is null");
            return;
        }
        if (devicePairGuideActivity.q != null) {
            devicePairGuideActivity.q.stop();
            devicePairGuideActivity.q = null;
        } else {
            LogUtil.j("DEVMGR_MemberAndViewHelper", "mB1PairGuideAnimation is null!");
        }
        if (devicePairGuideActivity.p != null) {
            devicePairGuideActivity.p.stop();
            devicePairGuideActivity.q = null;
        } else {
            LogUtil.j("DEVMGR_MemberAndViewHelper", "mB2PairGuideAnimation is null!");
        }
        if (devicePairGuideActivity.t != null) {
            devicePairGuideActivity.t.stop();
            devicePairGuideActivity.q = null;
        } else {
            LogUtil.j("DEVMGR_MemberAndViewHelper", "mB1PairGuideAnimation is null!");
        }
    }

    private void e(String str) {
        boolean zIsOtaUpdate;
        boolean isSupportAutoUpdate;
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            return;
        }
        devicePairGuideActivity.ao = DeviceSettingsInteractors.e(devicePairGuideActivity);
        devicePairGuideActivity.af = devicePairGuideActivity.ao.e(str);
        if (devicePairGuideActivity.af == null) {
            LogUtil.a("DEVMGR_MemberAndViewHelper", "mDeviceCapability is null");
            zIsOtaUpdate = false;
            isSupportAutoUpdate = false;
        } else {
            zIsOtaUpdate = devicePairGuideActivity.af.isOtaUpdate();
            isSupportAutoUpdate = devicePairGuideActivity.af.getIsSupportAutoUpdate();
        }
        DeviceInfo deviceInfoB = mgg.b(x(), "DEVMGR_MemberAndViewHelper");
        boolean z = eey.d(deviceInfoB, 108) && !Utils.k();
        boolean zD = eel.d(devicePairGuideActivity.aq);
        LogUtil.a("DEVMGR_MemberAndViewHelper", "isOtaUpdate is ", Boolean.valueOf(zIsOtaUpdate), " isSupportAutoUpdate is ", Boolean.valueOf(isSupportAutoUpdate), " isAw70 is ", Boolean.valueOf(zD), " mDeviceProductType is ", Integer.valueOf(devicePairGuideActivity.aq), ", isSupportOtaUpgrade:", Boolean.valueOf(z), " isOverseaNoCloudVersion ", Boolean.valueOf(Utils.k()));
        if (eev.b(devicePairGuideActivity.aq, zIsOtaUpdate, zD) || z) {
            devicePairGuideActivity.dt.setOnCheckedChangeListener(devicePairGuideActivity.bu);
            devicePairGuideActivity.du.setVisibility(0);
            devicePairGuideActivity.dt.setChecked(n());
        }
        if (isSupportAutoUpdate) {
            devicePairGuideActivity.i.setVisibility(0);
            devicePairGuideActivity.f.setChecked(n());
        }
        if (z) {
            devicePairGuideActivity.i.setVisibility(8);
        }
        e(a(zIsOtaUpdate, deviceInfoB), deviceInfoB);
        b(deviceInfoB);
    }

    private void y() {
        String string;
        LogUtil.j("DEVMGR_MemberAndViewHelper", "initPairEurOtherPrivacyView enter");
        final DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null || qrs.ah(BaseApplication.getContext())) {
            return;
        }
        devicePairGuideActivity.bv.setVisibility(0);
        String string2 = devicePairGuideActivity.as.getText().toString();
        SpannableString spannableString = new SpannableString(devicePairGuideActivity.getResources().getString(R.string.IDS_eur_phone_pair_ok_tip4, string2));
        qri.a(spannableString, string2, new CharacterStyle() { // from class: qyz.5
            @Override // android.text.style.CharacterStyle
            public void updateDrawState(TextPaint textPaint) {
                if (textPaint != null) {
                    textPaint.setColor(devicePairGuideActivity.getResources().getColor(R.color.textColorPrimary));
                    textPaint.setUnderlineText(false);
                }
            }
        });
        devicePairGuideActivity.bv.setMovementMethod(LinkMovementMethod.getInstance());
        devicePairGuideActivity.bv.setHighlightColor(devicePairGuideActivity.getResources().getColor(android.R.color.transparent));
        devicePairGuideActivity.bv.setText(spannableString);
        devicePairGuideActivity.dp.setVisibility(0);
        if (b(k(devicePairGuideActivity))) {
            string = devicePairGuideActivity.getResources().getString(R.string.IDS_eur_phone_pair_ok_tip5);
        } else {
            string = devicePairGuideActivity.getResources().getString(R.string.IDS_eur_phone_pair_ok_tip6);
        }
        devicePairGuideActivity.dp.setText(string);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m(DevicePairGuideActivity devicePairGuideActivity) {
        int iN = CommonUtil.n(BaseApplication.getContext(), LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009));
        LogUtil.a("DEVMGR_MemberAndViewHelper", "isShowEurTip siteId:", Integer.valueOf(iN));
        if (iN == 7) {
            return (eel.e(devicePairGuideActivity.aq) || eel.b(devicePairGuideActivity.aq) || devicePairGuideActivity.aq == 75) ? false : true;
        }
        LogUtil.j("DEVMGR_MemberAndViewHelper", "isShowEurTip is not EUROPE_LOGIN_SITE_ID");
        return false;
    }

    private DeviceCapability k(DevicePairGuideActivity devicePairGuideActivity) {
        DeviceCapability deviceCapability;
        Map<String, DeviceCapability> mapD = lvb.e().d(3, "", "DEVMGR_MemberAndViewHelper");
        if (mapD != null) {
            LogUtil.j("DEVMGR_MemberAndViewHelper", "filter deviceCapabilityMap is null");
            deviceCapability = mapD.get(devicePairGuideActivity.ai);
        } else {
            deviceCapability = null;
        }
        LogUtil.a("DEVMGR_MemberAndViewHelper", "query deviceCapabilityMap:", BTDeviceMgrUtil.c().e(devicePairGuideActivity.ai));
        return deviceCapability;
    }

    public boolean n() {
        return ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).isSupportPairCheckedOtaAutoUpdateSwitch();
    }

    private void b(DeviceInfo deviceInfo) {
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            LogUtil.j("DEVMGR_MemberAndViewHelper", "initAutoOpenWifiView activity is null");
            return;
        }
        boolean z = eey.d(deviceInfo, 35) || eey.d(deviceInfo, 76);
        if (Build.VERSION.SDK_INT > 30 && CommonUtil.bg() && z) {
            devicePairGuideActivity.j.setVisibility(0);
            if (!Utils.o()) {
                devicePairGuideActivity.m.setText(R.string.IDS_device_transmit_text);
                devicePairGuideActivity.g.setText(R.string.IDS_device_transmit_tips);
                devicePairGuideActivity.h.setChecked(n());
            } else {
                devicePairGuideActivity.m.setText(R.string.IDS_device_transmit_text_overseas);
                devicePairGuideActivity.g.setText(R.string.IDS_device_transmit_tips_overseas);
                devicePairGuideActivity.h.setChecked(n());
            }
        } else {
            devicePairGuideActivity.j.setVisibility(8);
            LogUtil.j("DEVMGR_MemberAndViewHelper", "initAutoOpenWifiView is not Harmony3.0 or not support wifiP2P");
        }
        boolean zK = Utils.k();
        if (!eey.d(deviceInfo, 108) || zK) {
            return;
        }
        devicePairGuideActivity.j.setVisibility(8);
        LogUtil.j("DEVMGR_MemberAndViewHelper", "initAutoOpenWifiView is Galileo");
    }

    private boolean a(boolean z, DeviceInfo deviceInfo) {
        boolean zD = eey.d(deviceInfo, 58);
        boolean zD2 = eey.d(deviceInfo, 108);
        LogUtil.a("DEVMGR_MemberAndViewHelper", "isOtaUpdate is ", Boolean.valueOf(z), "isSupportDetect is ", Boolean.valueOf(zD), "isSupportOtaUpgrade is ", Boolean.valueOf(zD2));
        return z || zD || zD2;
    }

    public void q() {
        n(this.f46980c);
        SharedPreferenceManager.c("privacy_center", "account_device", String.valueOf(System.currentTimeMillis()));
        ReleaseLogUtil.d("DEVMGR_MemberAndViewHelper", "Enter showPairSuccessResult():");
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            return;
        }
        i(devicePairGuideActivity);
        devicePairGuideActivity.dc.setVisibility(0);
        final DeviceInfo deviceInfoB = mgg.b(x(), "DEVMGR_MemberAndViewHelper");
        ThreadPoolManager.c().a("DEVMGR_MemberAndViewHelper", new Runnable() { // from class: qzh
            @Override // java.lang.Runnable
            public final void run() {
                qyz.d(deviceInfoB);
            }
        });
        FindNetworkUtils.e(deviceInfoB, devicePairGuideActivity);
        mga.f();
        if (eey.d(deviceInfoB, 112)) {
            devicePairGuideActivity.e = true;
            this.f.a(deviceInfoB, devicePairGuideActivity);
            return;
        }
        d(R.string.IDS_blite_guide_paire_completed);
        boolean zIsSupportOfflineMap = ((DeviceFeatureSupportApi) Services.b("Module_Device_Feature", DeviceFeatureSupportApi.class)).isSupportOfflineMap(deviceInfoB);
        LogUtil.a("DEVMGR_MemberAndViewHelper", "isSupport offlinemap : ", Boolean.valueOf(zIsSupportOfflineMap));
        if (zIsSupportOfflineMap) {
            rdo.b().a(BaseApplication.getContext(), deviceInfoB.getDeviceUdid());
            OfflineMapReceiver.getInstance().onConnectStatusChanged(com.huawei.haf.application.BaseApplication.f(), deviceInfoB.getDeviceUdid(), 2);
        }
    }

    static /* synthetic */ void d(DeviceInfo deviceInfo) {
        String strE = net.e("DEVMGR_MemberAndViewHelper", deviceInfo);
        String strB = net.b(deviceInfo);
        if (deviceInfo == null) {
            ReleaseLogUtil.e("DEVMGR_MemberAndViewHelper", "showPairSuccessResult currentDeviceInfo is null.");
        } else {
            net.b("DEVMGR_MemberAndViewHelper", strB, strE);
            mga.h(deviceInfo);
        }
    }

    protected void d(int i) {
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            return;
        }
        this.j = true;
        final HashMap map = new HashMap(16);
        String strX = x();
        map.put("productId", strX);
        map.put("deviceId", Integer.valueOf(lvi.a(devicePairGuideActivity.aq).k()));
        LogUtil.a("DEVMGR_MemberAndViewHelper", "PluginAchieve setEvent productID:", BTDeviceMgrUtil.c().e(strX));
        ExecutorService executorService = this.i;
        if (executorService != null && !executorService.isShutdown()) {
            this.i.execute(new Runnable() { // from class: qyz.4
                @Override // java.lang.Runnable
                public void run() {
                    DevicePairGuideActivity devicePairGuideActivity2 = qyz.this.f46980c;
                    if (devicePairGuideActivity2 == null) {
                        return;
                    }
                    oru.a(devicePairGuideActivity2).c(devicePairGuideActivity2, String.valueOf(1500), map);
                }
            });
        }
        devicePairGuideActivity.d.stop();
        devicePairGuideActivity.cf.setVisibility(8);
        LogUtil.a("DEVMGR_MemberAndViewHelper", "stop anims");
        devicePairGuideActivity.bj = true;
        ai();
        g(i);
        e(strX);
        GuideInteractors guideInteractors = new GuideInteractors(BaseApplication.getContext());
        e(guideInteractors);
        a(guideInteractors);
        b(devicePairGuideActivity.aq, devicePairGuideActivity.cz);
        if (this.l != 2) {
            ino.b(devicePairGuideActivity);
        }
        aa();
        Intent intent = new Intent();
        intent.setAction("com.huawei.health.action.PAIR_DEVICE_SUCCESS");
        LocalBroadcastManager.getInstance().sendBroadcast(intent);
        devicePairGuideActivity.setResult(3);
        rgd.e(mgg.b(x(), "DEVMGR_MemberAndViewHelper"));
    }

    private void e(boolean z, final DeviceInfo deviceInfo) {
        final DevicePairGuideActivity devicePairGuideActivity;
        if (z && (devicePairGuideActivity = this.f46980c) != null) {
            int iN = CommonUtil.n(BaseApplication.getContext(), LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009));
            LogUtil.a("DEVMGR_MemberAndViewHelper", "initPairResultOtaPrivacyView siteId:", Integer.valueOf(iN));
            if (iN != 7) {
                LogUtil.j("DEVMGR_MemberAndViewHelper", "initPairResultOtaPrivacyView is not EUROPE_LOGIN_SITE_ID");
                devicePairGuideActivity.cy.setVisibility(8);
                return;
            }
            devicePairGuideActivity.cy.setVisibility(0);
            String string = devicePairGuideActivity.getResources().getString(R.string.IDS_ota_privacy_tips);
            String string2 = devicePairGuideActivity.getResources().getString(R.string.IDS_main_no_device_click);
            String str = String.format(Locale.ENGLISH, string, string2);
            SpannableString spannableString = new SpannableString(str);
            int iIndexOf = str.indexOf(string2);
            int length = string2.length() + iIndexOf;
            spannableString.setSpan(new ClickableSpan() { // from class: qyz.1
                @Override // android.text.style.ClickableSpan
                public void onClick(View view) {
                    if (qrs.c(500)) {
                        return;
                    }
                    try {
                        Intent intent = new Intent(devicePairGuideActivity, (Class<?>) OtaPrivacyActivity.class);
                        intent.putExtra("deviceInfo", deviceInfo);
                        intent.putExtra("OTA_SHOW_EUR_TYPE", qyz.this.m(devicePairGuideActivity));
                        devicePairGuideActivity.startActivity(intent);
                    } catch (ActivityNotFoundException unused) {
                        LogUtil.e("DEVMGR_MemberAndViewHelper", "initPairResultOtaPrivacyView ActivityNotFoundException");
                    }
                }

                @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                public void updateDrawState(TextPaint textPaint) {
                    if (textPaint != null) {
                        super.updateDrawState(textPaint);
                        textPaint.setColor(Color.parseColor("#fb6522"));
                        textPaint.setUnderlineText(false);
                    }
                }
            }, iIndexOf, length, 18);
            spannableString.setSpan(new TypefaceSpan(Constants.FONT), iIndexOf, length, 33);
            devicePairGuideActivity.cy.setMovementMethod(LinkMovementMethod.getInstance());
            devicePairGuideActivity.cy.setHighlightColor(devicePairGuideActivity.getResources().getColor(android.R.color.transparent));
            devicePairGuideActivity.cy.setText(spannableString);
        }
    }

    private void a(GuideInteractors guideInteractors) {
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            return;
        }
        int iC = com.huawei.haf.application.BaseApplication.c();
        LogUtil.a("DEVMGR_MemberAndViewHelper", "showPairSuccessResult CommonUtil.HIHEALTH_VERSION_CODE is ", 20100000, " appVersionCode is ", Integer.valueOf(iC));
        if (iC >= 20100000 || guideInteractors.i()) {
            qsp.a(devicePairGuideActivity, R.id.pair_text_layout).setVisibility(8);
            devicePairGuideActivity.as.setVisibility(0);
            devicePairGuideActivity.v.setVisibility(8);
            devicePairGuideActivity.ac.setVisibility(8);
            return;
        }
        devicePairGuideActivity.dk.setText(devicePairGuideActivity.getResources().getString(R.string.IDS_startup_next).toUpperCase(Locale.ENGLISH));
    }

    private String x() {
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            return "default";
        }
        if (!TextUtils.isEmpty(devicePairGuideActivity.ai)) {
            return devicePairGuideActivity.ai;
        }
        if (TextUtils.isEmpty(devicePairGuideActivity.dm)) {
            return "default";
        }
        return devicePairGuideActivity.dm;
    }

    public void c(DeviceInfo deviceInfo) {
        a(deviceInfo, 120000);
    }

    public void a(DeviceInfo deviceInfo, int i) {
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            return;
        }
        if (deviceInfo.getProductType() != -1 && devicePairGuideActivity.aq != deviceInfo.getProductType()) {
            LogUtil.a("DEVMGR_MemberAndViewHelper", "report device connect state not match wanted device");
            xjt.l("deviceType is error");
            return;
        }
        devicePairGuideActivity.dm = deviceInfo.getDeviceIdentify();
        LogUtil.a("DEVMGR_MemberAndViewHelper", "mConnectStateChangedReceiver : DEVICE_CONNECTING！, mTempMac is", BTDeviceMgrUtil.c().e(devicePairGuideActivity.dm));
        Message messageObtainMessage = devicePairGuideActivity.bb.obtainMessage();
        messageObtainMessage.what = 1;
        messageObtainMessage.arg1 = deviceInfo.getDeviceConnectState();
        messageObtainMessage.obj = deviceInfo;
        devicePairGuideActivity.bb.sendMessage(messageObtainMessage);
        devicePairGuideActivity.bb.sendEmptyMessageDelayed(12, i);
    }

    public void b(int i, int i2) {
        ReleaseLogUtil.d("DEVMGR_MemberAndViewHelper", "Enter showPairFailureResult():errorCode:", Integer.valueOf(i2));
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            return;
        }
        this.j = false;
        e(i2);
        v(devicePairGuideActivity);
        if (lvi.n(devicePairGuideActivity.aq) && devicePairGuideActivity.ag != null && devicePairGuideActivity.ag.i() != null) {
            if (i == 1) {
                devicePairGuideActivity.cr.setVisibility(0);
                devicePairGuideActivity.cr.setText(R.string.IDS_band_is_unavailable_tip_string_new);
            } else if (i2 == 6) {
                LogUtil.a("DEVMGR_MemberAndViewHelper", "showPairFailureResult() DeviceConnectState.DEVICE_WORK_MODE_CONFLICT");
                ac();
            } else {
                LogUtil.a("DEVMGR_MemberAndViewHelper", "showPairFailureResult() other errorType");
            }
        }
        e(i, i2);
    }

    private void v(DevicePairGuideActivity devicePairGuideActivity) {
        devicePairGuideActivity.d.stop();
        devicePairGuideActivity.cf.setVisibility(8);
        LogUtil.a("DEVMGR_MemberAndViewHelper", "showPairFailureResult stop animal");
        ai();
        devicePairGuideActivity.bj = false;
        devicePairGuideActivity.cb.setVisibility(8);
        devicePairGuideActivity.bt.setVisibility(8);
        devicePairGuideActivity.am.setVisibility(8);
        devicePairGuideActivity.y.setVisibility(0);
        t(devicePairGuideActivity);
        devicePairGuideActivity.bz.setVisibility(0);
        devicePairGuideActivity.dk.setText(devicePairGuideActivity.getResources().getString(R.string.IDS_retry).toUpperCase(Locale.ENGLISH));
        devicePairGuideActivity.da.setVisibility(0);
        devicePairGuideActivity.ak.setVisibility(0);
        devicePairGuideActivity.cr.setVisibility(8);
        devicePairGuideActivity.n.setVisibility(8);
        devicePairGuideActivity.l.setVisibility(8);
        devicePairGuideActivity.r.setVisibility(8);
        devicePairGuideActivity.k.setVisibility(8);
        devicePairGuideActivity.cf.setVisibility(8);
        devicePairGuideActivity.cx.setVisibility(0);
        devicePairGuideActivity.cx.setImageResource(R.drawable.ic_pairing_result_failure);
        devicePairGuideActivity.dc.setText(R.string.IDS_blite_guide_paire_fail);
        devicePairGuideActivity.df.setVisibility(8);
        devicePairGuideActivity.du.setVisibility(8);
        devicePairGuideActivity.s.setVisibility(8);
        devicePairGuideActivity.v.setVisibility(8);
        devicePairGuideActivity.ac.setVisibility(8);
    }

    private void e(int i) {
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            LogUtil.j("DEVMGR_MemberAndViewHelper", "activity is null");
        } else {
            rdt.e(lvi.e(devicePairGuideActivity.aq, devicePairGuideActivity.bo, devicePairGuideActivity.bi), i);
        }
    }

    private void ac() {
        DeviceInfo next;
        LogUtil.a("DEVMGR_MemberAndViewHelper", "showModeConflictDialog enter");
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            return;
        }
        List<DeviceInfo> listB = devicePairGuideActivity.al.b();
        if (listB == null) {
            LogUtil.a("DEVMGR_MemberAndViewHelper", "currentDeviceList is null");
            return;
        }
        Iterator<DeviceInfo> it = listB.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.getDeviceConnectState() == 2) {
                LogUtil.a("DEVMGR_MemberAndViewHelper", "showConflictDialog find connected device");
                break;
            }
        }
        if (next == null) {
            LogUtil.a("DEVMGR_MemberAndViewHelper", "showConflictDialog connectedDevice is null");
            return;
        }
        String str = String.format(Locale.ENGLISH, devicePairGuideActivity.getResources().getString(R.string.IDS_work_mode_conflict_dialog_content), devicePairGuideActivity.al.d(next.getProductType()), devicePairGuideActivity.al.d(devicePairGuideActivity.aq));
        Intent intent = new Intent();
        intent.putExtra("content", str);
        intent.setClass(devicePairGuideActivity, WorkModeConflictDialogActivity.class);
        devicePairGuideActivity.startActivity(intent);
    }

    private void e(int i, int i2) {
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            return;
        }
        if (i2 == 16) {
            i(i2);
            return;
        }
        int i3 = devicePairGuideActivity.aq;
        if (i3 != 5) {
            if (i3 != 15) {
                if (i3 == 7) {
                    devicePairGuideActivity.cz.setImageResource(R.drawable.icon_hand_pair);
                    if (i == 1) {
                        LogUtil.a("DEVMGR_MemberAndViewHelper", "PairFailureResult B3 errorType ：1");
                        devicePairGuideActivity.cr.setVisibility(0);
                        devicePairGuideActivity.cr.setText(R.string.IDS_band_is_unavailable_tip_string_newphone);
                        return;
                    }
                    i(i2);
                    return;
                }
                if (i3 != 8) {
                    if (i3 == 12) {
                        devicePairGuideActivity.cz.setImageResource(R.drawable.icon_hand_pair);
                        i(i2);
                        return;
                    } else if (i3 != 13) {
                        c(i, i2);
                        return;
                    }
                }
            }
            devicePairGuideActivity.cz.setImageResource(R.drawable.icon_hand_pair);
            ae();
            return;
        }
        devicePairGuideActivity.cz.setImageResource(R.drawable.icon_watch_pair);
        i(i2);
    }

    private void i(int i) {
        String str;
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            return;
        }
        devicePairGuideActivity.dc.setVisibility(0);
        LogUtil.a("DEVMGR_MemberAndViewHelper", "enter showPairFailureNote():", Integer.valueOf(devicePairGuideActivity.aq));
        devicePairGuideActivity.cr.setVisibility(0);
        String strD = devicePairGuideActivity.al.d(devicePairGuideActivity.aq);
        LogUtil.a("DEVMGR_MemberAndViewHelper", "content is ", strD);
        if (devicePairGuideActivity.aq == 11 && ("HUAWEI CM-R1P".equals(devicePairGuideActivity.bo) || devicePairGuideActivity.getString(R.string.IDS_huawei_r1_pro_content).equals(devicePairGuideActivity.bo) || devicePairGuideActivity.getString(R.string.IDS_device_r1_pro_name_title).equals(devicePairGuideActivity.bo))) {
            strD = devicePairGuideActivity.getString(R.string.IDS_huawei_r1_pro_content);
        } else if (!TextUtils.isEmpty(devicePairGuideActivity.bo)) {
            strD = devicePairGuideActivity.bo;
        }
        if (i == -1) {
            str = String.format(Locale.ENGLISH, devicePairGuideActivity.getResources().getString(R.string.IDS_startup_pair_device_timeout), strD);
        } else if (i == 1003003) {
            str = String.format(Locale.ENGLISH, devicePairGuideActivity.getResources().getString(R.string.IDS_device_pair_fail_sub_account), new Object[0]);
        } else if (i == 16) {
            str = String.format(Locale.ENGLISH, devicePairGuideActivity.getResources().getString(R.string.IDS_pair_guide_fail_help_string), new Object[0]);
        } else {
            boolean zAh = qrs.ah(BaseApplication.getContext());
            String lowerCase = Build.BRAND.toLowerCase();
            boolean z = lowerCase.equals("xiaomi") || lowerCase.equals("vivo");
            boolean z2 = LanguageUtil.f(devicePairGuideActivity) || LanguageUtil.q(devicePairGuideActivity);
            if (zAh) {
                str = String.format(Locale.ENGLISH, devicePairGuideActivity.getResources().getString(R.string.IDS_blite_pair_fail_tips_pad, strD), new Object[0]);
            } else if (z2 && z) {
                str = String.format(Locale.ENGLISH, devicePairGuideActivity.getResources().getString(R.string.IDS_vivo_pair_help_string, 1, 2, strD), new Object[0]);
                devicePairGuideActivity.cr.setTextSize(0, devicePairGuideActivity.getResources().getDimension(R.dimen.textSizeBody2));
                devicePairGuideActivity.cr.setGravity(3);
            } else {
                str = String.format(Locale.ENGLISH, devicePairGuideActivity.getResources().getString(R.string.IDS_blite_guide_paire_fail_help_string, strD), new Object[0]);
            }
        }
        devicePairGuideActivity.cr.setText(str);
    }

    private void ae() {
        int i;
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            return;
        }
        LogUtil.a("DEVMGR_MemberAndViewHelper", "enter showPairFailureOnlyPhoneNote():", Integer.valueOf(devicePairGuideActivity.aq));
        devicePairGuideActivity.cr.setVisibility(0);
        boolean zAh = qrs.ah(BaseApplication.getContext());
        Resources resources = devicePairGuideActivity.getResources();
        if (zAh) {
            i = R.string.IDS_blite_pair_reopen_bt_pad;
        } else {
            i = R.string.IDS_blite_guide_paire_fail_help_no_band_string;
        }
        devicePairGuideActivity.cr.setText(resources.getString(i));
    }

    private void c(int i, int i2) {
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            return;
        }
        int i3 = devicePairGuideActivity.aq;
        if (i3 != 1) {
            if (i3 == 3) {
                devicePairGuideActivity.cz.setImageResource(R.drawable.icon_watch_pair);
                devicePairGuideActivity.dc.setText(R.string.IDS_device_fragment_w1_pairing_guide_2);
                devicePairGuideActivity.bb.sendEmptyMessage(5);
                LogUtil.a("DEVMGR_MemberAndViewHelper", "Android Wear");
                devicePairGuideActivity.cc.setVisibility(0);
                devicePairGuideActivity.dk.setText(R.string.IDS_device_fragment_pairing_btn_open_android_wear);
                return;
            }
            if (i3 == 14) {
                devicePairGuideActivity.cz.setImageResource(R.drawable.icon_hand_pair);
                if (i == 1) {
                    LogUtil.a("DEVMGR_MemberAndViewHelper", "PairFailureResult GRUS errorType ：1");
                    devicePairGuideActivity.cr.setVisibility(0);
                    devicePairGuideActivity.cr.setText(R.string.IDS_band_is_unavailable_tip_string_newphone);
                    return;
                }
                i(i2);
                return;
            }
            if (i3 == 32 || i3 == 10) {
                z();
                return;
            }
            if (i3 == 11) {
                devicePairGuideActivity.cz.setImageResource(R.drawable.icon_head_setpair);
                i(i2);
                return;
            } else if (i3 != 23 && i3 != 24 && i3 != 36 && i3 != 37) {
                i(i2);
                return;
            }
        }
        devicePairGuideActivity.cz.setImageResource(R.drawable.icon_hand_pair);
        i(i2);
    }

    private void z() {
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            return;
        }
        devicePairGuideActivity.cz.setImageResource(R.drawable.icon_watch_pair);
        StringBuffer stringBuffer = new StringBuffer(16);
        stringBuffer.append(devicePairGuideActivity.getResources().getString(R.string.IDS_compatibility_note_reasons));
        String str = f46978a;
        stringBuffer.append(str);
        stringBuffer.append(String.format(Locale.ENGLISH, devicePairGuideActivity.getResources().getString(R.string.IDS_compatibility_note_not_connected_with_android_wear), String.valueOf(1)));
        stringBuffer.append(str);
        stringBuffer.append(String.format(Locale.ENGLISH, devicePairGuideActivity.getResources().getString(R.string.IDS_compatibility_note_low_watch_version), String.valueOf(2)));
        stringBuffer.append(str);
        stringBuffer.append(String.format(Locale.ENGLISH, devicePairGuideActivity.getResources().getString(R.string.IDS_compatibility_Android_Wear_low_watch_version), String.valueOf(3)));
        stringBuffer.append(str);
        devicePairGuideActivity.dc.setText(devicePairGuideActivity.getResources().getString(R.string.IDS_blite_guide_paire_fail));
        devicePairGuideActivity.dc.setVisibility(8);
        devicePairGuideActivity.ds.setText(stringBuffer.toString());
        devicePairGuideActivity.ds.setVisibility(0);
        devicePairGuideActivity.bb.sendEmptyMessage(5);
        LogUtil.a("DEVMGR_MemberAndViewHelper", "Android Wear");
        devicePairGuideActivity.cc.setVisibility(0);
        devicePairGuideActivity.dk.setText(R.string.IDS_device_fragment_pairing_btn_open_android_wear);
    }

    public void m() {
        w();
    }

    public void o() {
        w();
    }

    public void l() {
        w();
    }

    public void k() {
        w();
    }

    public void e(Message message) {
        int i = message.arg1;
        LogUtil.a("DEVMGR_MemberAndViewHelper", "updatePairProcessTips status: ", Integer.valueOf(i));
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            LogUtil.j("DEVMGR_MemberAndViewHelper", "updatePairProcessTips activity is null");
            return;
        }
        String string = devicePairGuideActivity.getString(R.string.IDS_device_paring_tip_des_info_21);
        switch (i) {
            case 9:
                string = devicePairGuideActivity.getString(R.string.IDS_device_pair_account_inconsistent);
                devicePairGuideActivity.dc.setVisibility(0);
                break;
            case 10:
                devicePairGuideActivity.bb.removeMessages(12);
                string = devicePairGuideActivity.getString(R.string.IDS_device_pair_select_the_language_on_the_watch);
                devicePairGuideActivity.au.setVisibility(0);
                devicePairGuideActivity.u.setVisibility(8);
                devicePairGuideActivity.dc.setVisibility(0);
                ai();
                devicePairGuideActivity.bl = true;
                break;
            case 11:
                d(message, devicePairGuideActivity);
                break;
            case 12:
            default:
                LogUtil.j("DEVMGR_MemberAndViewHelper", "updatePairProcessTips status is not match, return.");
                return;
            case 13:
                string = devicePairGuideActivity.getString(R.string.IDS_device_pair_account_inconsistent_opt);
                devicePairGuideActivity.dc.setVisibility(0);
                break;
            case 14:
                devicePairGuideActivity.bb.removeMessages(12);
                string = devicePairGuideActivity.getString(R.string.IDS_device_pair_watch_clean_restart);
                devicePairGuideActivity.u.setVisibility(8);
                devicePairGuideActivity.dc.setVisibility(0);
                devicePairGuideActivity.dd[0] = R.string.IDS_device_pair_watch_clean_restart;
                devicePairGuideActivity.j();
                break;
        }
        devicePairGuideActivity.dc.setText(string);
    }

    private void d(Message message, final DevicePairGuideActivity devicePairGuideActivity) {
        if (message.obj instanceof DeviceInfo) {
            final DeviceInfo deviceInfo = (DeviceInfo) message.obj;
            DevicePairGuideUtil.d(deviceInfo, new DevicePairGuideUtil.ShowKidDialogCallback() { // from class: qyz.2
                @Override // com.huawei.ui.device.activity.pairing.DevicePairGuideUtil.ShowKidDialogCallback
                public void onResult(boolean z) {
                    LogUtil.a("DEVMGR_MemberAndViewHelper", "isShowDialog:", Boolean.valueOf(z));
                    if (z) {
                        qyz.this.a(deviceInfo);
                        qyz.this.e(devicePairGuideActivity);
                        return;
                    }
                    int deviceFactoryReset = deviceInfo.getDeviceFactoryReset();
                    LogUtil.a("DEVMGR_MemberAndViewHelper", "type value:", Integer.valueOf(deviceFactoryReset));
                    if (deviceFactoryReset == 1) {
                        qyz.this.c(devicePairGuideActivity, deviceInfo);
                    } else {
                        LogUtil.a("DEVMGR_MemberAndViewHelper", "type value not 1");
                    }
                }
            });
        } else {
            LogUtil.j("DEVMGR_MemberAndViewHelper", "message is not DeviceInfo");
        }
    }

    public void a(DeviceInfo deviceInfo) {
        HashMap map = new HashMap(16);
        map.put("Result", 2);
        map.put("deviceType", "HDK_WEAR");
        map.put("Action", 3);
        map.put("Page", 4);
        map.put("deviceName", deviceInfo.getDeviceName());
        lmf.d().c(BaseApplication.getContext(), AnalyticsValue.UNAUTHORIZED_DEVICE_PAIRING_FAILURE.value(), map, 0);
    }

    public void e(final DevicePairGuideActivity devicePairGuideActivity) {
        devicePairGuideActivity.runOnUiThread(new Runnable() { // from class: qyz.10
            @Override // java.lang.Runnable
            public void run() {
                if (qyz.this.d != null && qyz.this.d.isShowing()) {
                    qyz.this.d.cancel();
                }
                NoTitleCustomAlertDialog.Builder builderC = new NoTitleCustomAlertDialog.Builder(devicePairGuideActivity.f24606a).a(String.format(Locale.ENGLISH, qyz.this.f46980c.f24606a.getString(R.string.IDS_kid_oobe_pair_tips), qyz.this.f46980c.bo)).c(R.string.IDS_common_notification_know_tips, new View.OnClickListener() { // from class: qyz.10.1
                    @Override // android.view.View.OnClickListener
                    public void onClick(View view) {
                        if (!TextUtils.isEmpty(devicePairGuideActivity.dm)) {
                            LogUtil.a("DEVMGR_MemberAndViewHelper", "activity.mTempMac is not empty and unPair device");
                            ArrayList arrayList = new ArrayList(16);
                            arrayList.add(devicePairGuideActivity.dm);
                            devicePairGuideActivity.al.b((List<String>) arrayList, true);
                            devicePairGuideActivity.c();
                        } else {
                            LogUtil.j("DEVMGR_MemberAndViewHelper", "activity.mTempMac isEmpty");
                        }
                        devicePairGuideActivity.finish();
                    }
                });
                qyz.this.d = builderC.c();
                qyz.this.d.setCancelable(false);
                if (qyz.this.d.isShowing() || devicePairGuideActivity.isFinishing()) {
                    return;
                }
                qyz.this.d.show();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(DevicePairGuideActivity devicePairGuideActivity, DeviceInfo deviceInfo) {
        GuideInteractors guideInteractors = new GuideInteractors(BaseApplication.getContext());
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(10005), "KEY_SHOW_SYNC_ACCOUNT_ARK_UI_ON_REMINDERS_FLAG".concat(devicePairGuideActivity.dm), "UNCOMPLETE", null);
        guideInteractors.c(devicePairGuideActivity.dm, true);
        if (AgreementDeclarationActivity.d) {
            LogUtil.j("DEVMGR_MemberAndViewHelper", "restoreFactorySet oobe has been created.");
            return;
        }
        AgreementDeclarationActivity.d = true;
        Intent intent = new Intent();
        intent.putExtra("pairGuideSelectAddress", deviceInfo.getDeviceIdentify());
        intent.setClass(devicePairGuideActivity, AgreementDeclarationActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("deviceInfo", deviceInfo);
        intent.putExtras(bundle);
        intent.putExtra("device_country_code", deviceInfo.getCountryCode());
        intent.putExtra("device_emui_version", deviceInfo.getEmuiVersion());
        intent.putExtra("firstPair", "1");
        devicePairGuideActivity.startActivity(intent);
    }

    public void c(int i) {
        LogUtil.a("DEVMGR_MemberAndViewHelper", "pairProcessOtherAnimation deviceType: ", Integer.valueOf(i));
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null || i == 0 || i == -1) {
            return;
        }
        Bitmap bitmapD = DevicePairGuideUtil.d(i);
        if (bitmapD != null) {
            devicePairGuideActivity.cz.setImageBitmap(bitmapD);
            af();
        } else {
            e(devicePairGuideActivity, i);
        }
    }

    private void e(DevicePairGuideActivity devicePairGuideActivity, int i) {
        int iM = lvi.a(i).m();
        LogUtil.a("DEVMGR_MemberAndViewHelper", "pairProcessOtherAnimation deviceShapes: ", Integer.valueOf(iM));
        if (iM == 1) {
            devicePairGuideActivity.cz.setImageResource(R.drawable.icon_watch_pair);
            af();
            return;
        }
        if (iM == 2) {
            devicePairGuideActivity.cz.setImageResource(R.drawable.icon_watch_pair_squares);
            af();
            return;
        }
        if (iM == 3) {
            if (eel.d(i)) {
                k();
                return;
            } else {
                devicePairGuideActivity.cz.setImageResource(R.drawable.icon_hand_pair);
                af();
                return;
            }
        }
        LogUtil.a("DEVMGR_MemberAndViewHelper", "pairProcessOtherAnimation isBand: ", Boolean.valueOf(lvi.a(i).r()));
        if (lvi.a(i).r()) {
            if (eel.d(i)) {
                k();
                return;
            } else {
                devicePairGuideActivity.cz.setImageResource(R.drawable.icon_hand_pair);
                af();
                return;
            }
        }
        if (lvi.a(i).f() == 6) {
            devicePairGuideActivity.cz.setImageResource(R.drawable.icon_sports_genie_pair);
            af();
        } else {
            devicePairGuideActivity.cz.setImageResource(R.drawable.icon_watch_pair);
            af();
        }
    }

    private void af() {
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            return;
        }
        if (rdp.d(devicePairGuideActivity.aq)) {
            devicePairGuideActivity.dc.setVisibility(0);
            devicePairGuideActivity.cr.setVisibility(8);
        } else {
            devicePairGuideActivity.cr.setVisibility(8);
            devicePairGuideActivity.dc.setVisibility(0);
            devicePairGuideActivity.dc.setText(devicePairGuideActivity.getString(devicePairGuideActivity.dd[0], new Object[]{devicePairGuideActivity.aj}));
        }
    }

    private void aa() {
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null || TextUtils.isEmpty(devicePairGuideActivity.dm)) {
            return;
        }
        LogUtil.a("DEVMGR_MemberAndViewHelper", "enter setDeviceActiveTime");
        if (SharedPreferenceManager.a(BaseApplication.getContext(), String.valueOf(2000000)).contains(ckg.b(devicePairGuideActivity.dm))) {
            LogUtil.a("DEVMGR_MemberAndViewHelper", "setDeviceActiveTime device already active.");
            return;
        }
        StorageParams storageParams = new StorageParams();
        long jCurrentTimeMillis = System.currentTimeMillis();
        SharedPreferenceManager.e(BaseApplication.getContext(), String.valueOf(2000000), ckg.b(devicePairGuideActivity.dm), String.valueOf(jCurrentTimeMillis), storageParams);
    }

    private void b(Context context, ImageView imageView, int i, int i2) {
        AnimationDrawable animationDrawableE = qza.a().e(context, imageView, i, i2);
        this.e = animationDrawableE;
        if (animationDrawableE != null) {
            animationDrawableE.start();
        } else {
            LogUtil.d("DEVMGR_MemberAndViewHelper", "framesAnimation is null");
        }
    }

    private void ai() {
        AnimationDrawable animationDrawable = this.e;
        if (animationDrawable != null) {
            animationDrawable.stop();
        }
    }

    public int a() {
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            return -1;
        }
        return devicePairGuideActivity.aq;
    }

    public void a(int i) {
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity != null) {
            devicePairGuideActivity.aq = i;
        }
    }

    public void b(String str) {
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity != null) {
            devicePairGuideActivity.f3do = str;
        }
    }

    public void s() {
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            LogUtil.j("DEVMGR_MemberAndViewHelper", "resetUserSelectProductType mActivity is null.");
            return;
        }
        LogUtil.a("DEVMGR_MemberAndViewHelper", "resetUserSelectProductType mDeviceProductType :", Integer.valueOf(devicePairGuideActivity.aq), ", mSaveDeviceProductType :", Integer.valueOf(devicePairGuideActivity.dh));
        if (devicePairGuideActivity.aq != devicePairGuideActivity.dh) {
            devicePairGuideActivity.aq = devicePairGuideActivity.dh;
        }
    }

    private void w() {
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null) {
            return;
        }
        devicePairGuideActivity.da.setVisibility(8);
        devicePairGuideActivity.ak.setVisibility(8);
        devicePairGuideActivity.cf.setVisibility(8);
        if (qrs.af(devicePairGuideActivity)) {
            devicePairGuideActivity.n.setVisibility(8);
            devicePairGuideActivity.r.setVisibility(0);
            devicePairGuideActivity.k.setVisibility(0);
            b(devicePairGuideActivity, devicePairGuideActivity.k, R.array.huawei_aw70_pair_guide_animation, 200);
        } else {
            devicePairGuideActivity.n.setVisibility(0);
            devicePairGuideActivity.r.setVisibility(8);
            devicePairGuideActivity.l.setVisibility(0);
            b(devicePairGuideActivity, devicePairGuideActivity.l, R.array.huawei_aw70_pair_guide_animation, 200);
        }
        devicePairGuideActivity.cr.setVisibility(8);
        devicePairGuideActivity.cr.setText(devicePairGuideActivity.getString(devicePairGuideActivity.o[0], new Object[]{devicePairGuideActivity.aj}));
    }

    public void p() {
        DevicePairGuideActivity devicePairGuideActivity = this.f46980c;
        if (devicePairGuideActivity == null || devicePairGuideActivity.f24606a == null) {
            LogUtil.j("DEVMGR_MemberAndViewHelper", "showSelectVersionDialog mActivity is null");
            return;
        }
        this.l = 1;
        View viewInflate = LayoutInflater.from(devicePairGuideActivity.f24606a).inflate(R.layout.dialog_select_mode, (ViewGroup) null);
        final HealthRadioButton healthRadioButton = (HealthRadioButton) viewInflate.findViewById(R.id.settings_mode_self_radioButton);
        final HealthRadioButton healthRadioButton2 = (HealthRadioButton) viewInflate.findViewById(R.id.settings_mode_family_members_radioButton);
        RelativeLayout relativeLayout = (RelativeLayout) viewInflate.findViewById(R.id.settings_mode_self_layout);
        RelativeLayout relativeLayout2 = (RelativeLayout) viewInflate.findViewById(R.id.settings_mode_family_layout);
        healthRadioButton2.setChecked(false);
        healthRadioButton.setChecked(true);
        relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: qyz.8
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                healthRadioButton2.setChecked(false);
                healthRadioButton.setChecked(true);
                qyz.this.l = 1;
            }
        });
        relativeLayout2.setOnClickListener(new View.OnClickListener() { // from class: qyz.6
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                healthRadioButton2.setChecked(true);
                healthRadioButton.setChecked(false);
                qyz.this.l = 2;
            }
        });
        a(healthRadioButton2, healthRadioButton);
        e(devicePairGuideActivity, viewInflate);
    }

    private void a(final HealthRadioButton healthRadioButton, final HealthRadioButton healthRadioButton2) {
        healthRadioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: qyz.9
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (z) {
                    healthRadioButton.setChecked(true);
                    healthRadioButton2.setChecked(false);
                    qyz.this.l = 2;
                }
            }
        });
        healthRadioButton2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: qyz.7
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                if (z) {
                    healthRadioButton.setChecked(false);
                    healthRadioButton2.setChecked(true);
                    qyz.this.l = 1;
                }
            }
        });
    }

    private void e(final DevicePairGuideActivity devicePairGuideActivity, View view) {
        CustomAlertDialog customAlertDialogB = new CustomAlertDialog.Builder(devicePairGuideActivity.f24606a).d(R.string.IDS_select_pair_mode).a(view).d(R.string.IDS_settings_button_ok, new DialogInterface.OnClickListener() { // from class: qyz.11
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                qyz qyzVar = qyz.this;
                qyzVar.c(devicePairGuideActivity, qyzVar.l);
                rdt.a(qyz.this.l);
            }
        }).a(R.string.IDS_settings_button_cancal, new DialogInterface.OnClickListener() { // from class: qyz.15
            @Override // android.content.DialogInterface.OnClickListener
            public void onClick(DialogInterface dialogInterface, int i) {
                DevicePairGuideActivity devicePairGuideActivity2 = devicePairGuideActivity;
                if (devicePairGuideActivity2 != null) {
                    devicePairGuideActivity2.finish();
                }
            }
        }).b();
        customAlertDialogB.setCancelable(false);
        customAlertDialogB.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(DevicePairGuideActivity devicePairGuideActivity, int i) {
        mgb.c(devicePairGuideActivity.ai, i);
        b(devicePairGuideActivity);
    }

    private void s(DevicePairGuideActivity devicePairGuideActivity) {
        if (lvi.f(devicePairGuideActivity.aq)) {
            devicePairGuideActivity.bp = "wear_band";
        } else {
            devicePairGuideActivity.bp = "wear_watch";
        }
        devicePairGuideActivity.da.setVisibility(0);
        devicePairGuideActivity.cx.setVisibility(8);
        y(devicePairGuideActivity);
    }
}
