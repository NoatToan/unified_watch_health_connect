package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Message;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.media3.extractor.ts.TsExtractor;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.huawei.devicefeature.DeviceFeatureSupportApi;
import com.huawei.devicefeature.FeatureSupportCallback;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealthservice.old.model.OldToNewMotionPath;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.hwversionmgr.manager.HwVersionManager;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.operation.h5pro.jsmodules.fallDetection.FallDetectionUtil;
import com.huawei.operation.utils.OnlineImUtil;
import com.huawei.ui.commonui.dialog.CustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.commonui.radiobutton.HealthRadioButton;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.homewear21.home.WearHomeOldActivity;
import com.huawei.ui.homewear21.home.adapter.GridSpacingItemDecoration;
import com.huawei.ui.homewear21.home.adapter.WearHomeGeneralCardAdapter;
import com.huawei.ui.homewear21.home.card.WearHomeBaseCard;
import com.huawei.ui.homewear21.home.holder.WearHomeGeneralHolder;
import com.huawei.ui.homewear21.home.listener.WearHomeListener;
import health.compact.a.CommonUtil;
import health.compact.a.KeyValDbManager;
import health.compact.a.LanguageUtil;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.StorageParams;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Consumer;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class tmo extends WearHomeBaseCard {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Gson f49357a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HealthRadioButton f49359c;
    private RelativeLayout d;
    private CustomAlertDialog e;
    private RelativeLayout h;
    private HealthRadioButton i;
    private tjc j;
    private WearHomeGeneralCardAdapter k;
    private tlg n;
    private WearHomeGeneralHolder m = null;
    private List<tlf> f = new ArrayList(16);
    private String g = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f49358b = false;

    public tmo(Context context, WearHomeOldActivity wearHomeOldActivity, tjc tjcVar) {
        this.mContext = context;
        this.mActivity = wearHomeOldActivity;
        this.j = tjcVar;
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public RecyclerView.ViewHolder getCardViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.m = new WearHomeGeneralHolder(layoutInflater.inflate(R.layout.wear_home_general_layout, viewGroup, false));
        this.k = new WearHomeGeneralCardAdapter(this.mContext, this.f);
        this.m.c().addItemDecoration(new GridSpacingItemDecoration(true, qqp.a(this.mContext, 0.0f)));
        this.m.c().setLayoutManager(new LinearLayoutManager(this.mContext));
        this.m.c().b(false);
        this.m.c().setAdapter(this.k);
        this.m.c().setLayerType(2, null);
        this.m.c().setItemAnimator(new DefaultItemAnimator());
        this.k.e(new WearHomeListener() { // from class: tmo.1
            @Override // com.huawei.ui.homewear21.home.listener.WearHomeListener
            public void onItemClick(int i) {
                tmo.this.b(i);
            }
        });
        s();
        return this.m;
    }

    private void s() {
        q();
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public void deviceConnectionChange(int i) {
        if (this.mActivity == null || this.m == null || this.k == null || this.j == null) {
            LogUtil.j("WearHomeGeneralCard", "deviceConnectionChange fail mActivity:", this.mActivity, " mWearHomeGeneralHolder:", this.m, " mWearHomeGeneralCardAdapter:", this.k);
            return;
        }
        this.mActivity.e = this.mActivity.f26234b.e(this.mActivity.f26233a);
        if (this.mActivity.e == null) {
            LogUtil.j("WearHomeGeneralCard", "deviceConnectionChange fail mActivity.mDeviceCapability == null");
            this.m.b().setVisibility(8);
            return;
        }
        this.mActivity.d = tfn.a().a(this.mActivity.f26233a);
        if (this.mActivity.d == null) {
            LogUtil.j("WearHomeGeneralCard", "deviceConnectionChange fail mActivity.mCurrentDeviceInfo == null");
            return;
        }
        l();
        if (this.f.size() == 0) {
            LogUtil.j("WearHomeGeneralCard", "deviceConnectionChange mWearHomeGeneralBeans.size() == 0");
            this.m.b().setVisibility(8);
        } else {
            this.m.b().setVisibility(0);
            f(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(int i) {
        if (i == 2) {
            i();
        } else {
            for (tlf tlfVar : this.f) {
                LogUtil.a("WearHomeGeneralCard", "checkIsOtaEnd OTA item isEnable");
                if (maq.b().c(this.mActivity.f26233a) != 6) {
                    LogUtil.a("WearHomeGeneralCard", "checkIsOtaEnd current device is not OTAing");
                    tlfVar.e(false);
                }
                DeviceFeatureSupportApi deviceFeatureSupportApi = (DeviceFeatureSupportApi) Services.d("Module_Device_Feature", DeviceFeatureSupportApi.class);
                if (tlfVar.d() == 45 && deviceFeatureSupportApi != null && deviceFeatureSupportApi.isSupportWheelchair(this.mActivity.d)) {
                    tlfVar.e(true);
                }
            }
        }
        this.k.d(this.f);
        this.k.notifyDataSetChanged();
        LogUtil.a("WearHomeGeneralCard", "size() = ", Integer.valueOf(this.f.size()));
    }

    private void i() {
        if (this.mActivity.d != null && eel.d(this.mActivity.d.getProductType())) {
            p();
            return;
        }
        if (this.mActivity.f26234b.e(this.mActivity.f26233a) != null && this.mActivity.f26234b.e(this.mActivity.f26233a).isOtaUpdate() && maq.b().c(this.mActivity.f26233a) == 6) {
            LogUtil.a("WearHomeGeneralCard", "refreshSettingView() wear device is OTA");
            for (tlf tlfVar : this.f) {
                tlfVar.e(false);
                if (tlfVar.d() == 13) {
                    tlfVar.e(true);
                }
            }
            return;
        }
        r();
    }

    private void r() {
        boolean zD;
        boolean zD2;
        if (this.mActivity.d != null) {
            zD = eey.d(this.mActivity.d, 58);
            zD2 = eey.d(this.mActivity.d, 108);
        } else {
            zD = false;
            zD2 = false;
        }
        for (tlf tlfVar : this.f) {
            if (this.mActivity.k && this.mActivity.d != null && tqp.e(this.mActivity.d.getProductType())) {
                tlfVar.e(false);
                if (tlfVar.d() == 46 || tlfVar.d() == 32 || tlfVar.d() == 33 || tlfVar.d() == 55) {
                    tlfVar.e(true);
                }
                if (zD || zD2) {
                    if (tlfVar.d() == 13) {
                        tlfVar.e(true);
                    }
                }
            } else {
                tlfVar.e(true);
            }
        }
    }

    private void p() {
        if (this.mActivity.f26234b.e(this.mActivity.f26233a) != null && this.mActivity.f26234b.e(this.mActivity.f26233a).isOtaUpdate() && maq.b().c(this.mActivity.f26233a) == 6) {
            LogUtil.a("WearHomeGeneralCard", "refreshSettingView() AW70 is OTA");
            for (tlf tlfVar : this.f) {
                tlfVar.e(false);
                if (tlfVar.d() == 13) {
                    tlfVar.e(true);
                }
            }
        }
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public void onResume() {
        q();
        v();
        tjc tjcVar = this.j;
        if (tjcVar != null) {
            tjcVar.m();
        }
    }

    private void v() {
        LogUtil.a("WearHomeGeneralCard", "refreshOtaLittleRed");
        if (this.mActivity.d == null || !eey.d(this.mActivity.d, 108) || Utils.k()) {
            return;
        }
        HwOtaUpgradeManager.d().e(this.mActivity.d, new HwOtaUpgradeManager.RefreshLittleRedListener() { // from class: tmo.2
            @Override // com.huawei.hwdevice.mainprocess.mgr.hwotamanager.HwOtaUpgradeManager.RefreshLittleRedListener
            public void refreshLittleRed() {
                boolean zO = HwVersionManager.b(tmo.this.mContext).o(tmo.this.mActivity.f26233a);
                LogUtil.a("WearHomeGeneralCard", "refreshLittleRed isNewVersion:", Boolean.valueOf(zO), ", size:", Integer.valueOf(tmo.this.f.size()));
                for (tlf tlfVar : tmo.this.f) {
                    if (tlfVar.d() == 13 && tmo.this.mActivity.d != null) {
                        LogUtil.a("WearHomeGeneralCard", "refreshLittleRed setNewVersion");
                        tlfVar.d(zO);
                        tmo tmoVar = tmo.this;
                        tmoVar.f(tmoVar.mActivity.d.getDeviceConnectState());
                        return;
                    }
                }
            }
        });
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public void onDestroy() {
        LogUtil.a("WearHomeGeneralCard", "onDestroy");
        this.j.k();
    }

    private void q() {
        if (this.mActivity == null || this.m == null || this.k == null || this.j == null) {
            LogUtil.j("WearHomeGeneralCard", "initView fail mActivity:", this.mActivity, " mWearHomeGeneralHolder:", this.m, " mWearHomeGeneralCardAdapter:", this.k);
            return;
        }
        if (this.mActivity.e == null) {
            LogUtil.j("WearHomeGeneralCard", "initView fail mActivity.mDeviceCapability == null");
            this.m.b().setVisibility(8);
            return;
        }
        if (!this.mActivity.d().hasMessages(11)) {
            a(false);
        }
        this.mActivity.d = tfn.a().a(this.mActivity.f26233a);
        if (this.mActivity.d == null) {
            LogUtil.j("WearHomeGeneralCard", "initView fail mActivity.mCurrentDeviceInfo == null");
            return;
        }
        l();
        if (this.f.size() == 0) {
            LogUtil.j("WearHomeGeneralCard", "initView mWearHomeGeneralBeans.size() == 0");
            this.m.b().setVisibility(8);
        } else {
            this.m.b().setVisibility(0);
            f(this.mActivity.d.getDeviceConnectState());
        }
    }

    public void e() {
        q();
    }

    private void l() {
        this.f.clear();
        if (t()) {
            a(45, this.mActivity.getString(R.string.IDS_device_wear_home_device_setting), "", this.mActivity.h);
        }
        if (this.mActivity.e.isSupportFootWear() || this.mActivity.e.isSupportAutoDetectMode() || this.mActivity.e.isSupportRunPosture()) {
            y();
        }
        if (this.mActivity.e.isFactoryReset()) {
            a(14, this.mActivity.getString(R.string.IDS_settings_restore_factory_settings), "", this.mActivity.h);
        }
        o();
        k();
        n();
        m();
        if (this.mActivity.d != null && this.mActivity.d.getAutoDetectSwitchStatus() != 1) {
            h();
            x();
        }
        LogUtil.a("WearHomeGeneralCard", "device model is ", this.mActivity.d.getDeviceModel());
        if (this.mActivity.f != 11) {
            a(65, this.mActivity.getString(R.string.IDS_wear_home_device_info), "", true);
        }
        String strC = KeyValDbManager.d(BaseApplication.getContext()).c("test_ecg_nmpa_key");
        boolean zD = eey.d(this.mActivity.d, 27);
        LogUtil.a("WearHomeGeneralCard", "isSupportNmpa ", Boolean.valueOf(zD));
        if (zD && !TextUtils.isEmpty(strC) && Boolean.parseBoolean(strC)) {
            LogUtil.a("WearHomeGeneralCard", "show ecg nmpa.");
            a(51, this.mActivity.getString(R.string.IDS_ecg_nmpa), "", this.mActivity.h);
        }
    }

    private void k() {
        b(this.mActivity.d, new FeatureSupportCallback() { // from class: tmt
            @Override // com.huawei.devicefeature.FeatureSupportCallback
            public final void success(boolean z) {
                this.e.e(z);
            }
        });
    }

    /* synthetic */ void e(final boolean z) {
        LogUtil.a("WearHomeGeneralCard", "initServiceSupport ", Boolean.valueOf(z));
        HandlerExecutor.b(new Runnable() { // from class: tmw
            @Override // java.lang.Runnable
            public final void run() {
                this.f49365c.b(z);
            }
        });
    }

    /* synthetic */ void b(boolean z) {
        this.f49358b = z;
        if (z) {
            tlf tlfVar = new tlf();
            tlfVar.e(TsExtractor.TS_STREAM_TYPE_DTS_HD);
            tlfVar.c(this.mActivity.getString(R.string.ids_wear_home_service_support));
            tlfVar.e("");
            tlfVar.e(true);
            tlfVar.d("");
            tlfVar.d(false);
            b(e(13) + 1, tlfVar);
            a(55);
            a(46);
        }
    }

    private void a(int i) {
        Iterator<tlf> it = this.f.iterator();
        while (it.hasNext()) {
            if (it.next().d() == i) {
                it.remove();
                WearHomeGeneralCardAdapter wearHomeGeneralCardAdapter = this.k;
                if (wearHomeGeneralCardAdapter != null) {
                    wearHomeGeneralCardAdapter.notifyDataSetChanged();
                    return;
                }
                return;
            }
        }
    }

    private int e(int i) {
        for (int i2 = 0; i2 < this.f.size(); i2++) {
            if (this.f.get(i2).d() == i) {
                return i2;
            }
        }
        return -1;
    }

    private void b(final DeviceInfo deviceInfo, final FeatureSupportCallback featureSupportCallback) {
        if (deviceInfo.getVersionType() != 0) {
            LogUtil.j("WearHomeGeneralCard", "the device not release");
            featureSupportCallback.success(false);
            return;
        }
        if (eei.d(this.mActivity.d)) {
            featureSupportCallback.success(false);
            LogUtil.j("WearHomeGeneralCard", "HonorDevice");
        } else if (this.mActivity.d != null && etn.d(BaseApplication.getContext()) && lvi.l(this.mActivity.d.getProductType()) && SharedPreferenceManager.c(com.huawei.haf.application.BaseApplication.b(), LoginInit.getInstance(com.huawei.haf.application.BaseApplication.b()).getAccountInfo(1011))) {
            LogUtil.j("WearHomeGeneralCard", "Honor Device");
            featureSupportCallback.success(false);
        } else {
            lss.a((DeviceFeatureSupportApi) Services.d("Module_Device_Feature", DeviceFeatureSupportApi.class), new Consumer() { // from class: tmp
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    this.f49362c.b(deviceInfo, featureSupportCallback, (DeviceFeatureSupportApi) obj);
                }
            });
        }
    }

    /* synthetic */ void b(DeviceInfo deviceInfo, final FeatureSupportCallback featureSupportCallback, DeviceFeatureSupportApi deviceFeatureSupportApi) {
        deviceFeatureSupportApi.isServiceSupport(deviceInfo, new DeviceFeatureSupportApi.ServiceSupportCallBack() { // from class: tmq
            @Override // com.huawei.devicefeature.DeviceFeatureSupportApi.ServiceSupportCallBack
            public final void onResult(String str) {
                this.d.a(featureSupportCallback, str);
            }
        });
    }

    /* synthetic */ void a(FeatureSupportCallback featureSupportCallback, String str) {
        featureSupportCallback.success(a(str));
    }

    private boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (this.f49357a == null) {
            this.f49357a = new Gson();
        }
        tlg tlgVar = (tlg) this.f49357a.fromJson(str, tlg.class);
        this.n = tlgVar;
        if (tlgVar == null) {
            return false;
        }
        return "Y".equals(tlgVar.b().c());
    }

    private void x() {
        int i;
        if (CommonUtil.ap()) {
            LogUtil.j("WearHomeGeneralCard", "beta app not support");
            return;
        }
        if (this.f49358b) {
            return;
        }
        boolean zCa = CommonUtil.ca();
        boolean zH = Utils.h();
        if (zCa || !zH) {
            return;
        }
        if (CommonUtil.n(BaseApplication.getContext(), LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1009)) != 1 || LanguageUtil.o(this.mContext) || LanguageUtil.q(this.mContext)) {
            if (OnlineImUtil.isShowOnlineEntry()) {
                i = R.string.IDS_hw_personal_cetenr_help_customer_service;
            } else {
                i = R.string.IDS_hwh_health_vo2max_help;
            }
            a(46, this.mActivity.getString(i), "", this.mActivity.h);
        }
    }

    private void h() {
        if (eei.d(this.mActivity.d)) {
            LogUtil.j("WearHomeGeneralCard", "new honor device does not support");
            return;
        }
        if (CommonUtil.bu()) {
            LogUtil.j("Dfx_WearHomeGeneralCard", "release version not support");
            return;
        }
        if (LoginInit.getInstance(com.huawei.haf.application.BaseApplication.b()).isKoreaCountry()) {
            ReleaseLogUtil.e("Dfx_WearHomeGeneralCard", "beta version not support Korea");
            return;
        }
        String strC = KeyValDbManager.d(this.mContext).c("is_support_dfx_status");
        boolean zEquals = "true".equals(strC);
        LogUtil.a("WearHomeGeneralCard", "dfxStatus = ", strC);
        boolean z = eey.d(this.mActivity.d, 34) && lws.c(BaseApplication.getContext()).d(this.mActivity.f26233a) && zEquals;
        if (Utils.o() && z) {
            LogUtil.a("WearHomeGeneralCard", "show setting_about_beta_question.");
            a(33, this.mActivity.getString(R.string.IDS_device_beta_user_profile_questions_suggestions), "", this.mActivity.h);
        }
    }

    private void o() {
        boolean zD = eey.d(this.mActivity.d, 58);
        boolean zD2 = eey.d(this.mActivity.d, 108);
        LogUtil.a("WearHomeGeneralCard", "initFirmwareUpgradeItem isSupportOtaUpgrade:", Boolean.valueOf(zD2));
        if (this.mActivity.e.isOtaUpdate() || zD || zD2) {
            boolean zO = HwVersionManager.b(this.mContext).o(this.mActivity.f26233a);
            LogUtil.a("WearHomeGeneralCard", "initGeneralList() isNewVersion is ", Boolean.valueOf(zO));
            tlf tlfVar = new tlf();
            tlfVar.e(13);
            tlfVar.c(this.mActivity.getString(R.string.IDS_device_wear_home_device_ota_upgrade));
            tlfVar.e("");
            tlfVar.e(this.mActivity.h);
            tlfVar.d("");
            tlfVar.d(zO);
            a(tlfVar);
        }
    }

    private void n() {
        boolean zD = eey.d(this.mActivity.d, OldToNewMotionPath.SPORT_TYPE_PINGPONG);
        LogUtil.a("WearHomeGeneralCard", "initEmergencySos: ", Boolean.valueOf(zD));
        if (zD) {
            a(OldToNewMotionPath.SPORT_TYPE_VOLLEYBALL, this.mActivity.getString(R.string.IDS_settings_emergency_sos), "", this.mActivity.h);
        }
    }

    private void m() {
        boolean zD;
        boolean zD2;
        LogUtil.a("WearHomeGeneralCard", "enter initDetectionItem");
        if (this.mActivity == null) {
            LogUtil.j("WearHomeGeneralCard", "mActivity is null");
            return;
        }
        if (this.f49358b) {
            return;
        }
        if (this.mActivity.h) {
            if (this.mActivity.d != null) {
                zD = eey.d(this.mActivity.d, 71);
                zD2 = eey.d(this.mActivity.d, 115);
            } else {
                zD = false;
                zD2 = false;
            }
            LogUtil.a("WearHomeGeneralCard", "isSupportDetecttion = ", Boolean.valueOf(zD), " isSupportDiagnosisOut = ", Boolean.valueOf(zD2), " isHarmony = ", Boolean.valueOf(CommonUtil.bc()));
            boolean z = CommonUtil.bc() && zD;
            boolean z2 = !CommonUtil.bc() && zD2;
            if ((z || z2) && tqp.h()) {
                LogUtil.a("WearHomeGeneralCard", "show detection entrance");
                a(55, this.mActivity.getString(R.string.IDS_device_detection), "", this.mActivity.h);
                return;
            }
            return;
        }
        if (tqp.h()) {
            LogUtil.a("WearHomeGeneralCard", "show isSupportConnectDetect");
            a(55, this.mActivity.getString(R.string.IDS_device_detection), "", true);
        } else {
            LogUtil.a("WearHomeGeneralCard", "not show isOversea or below android9");
        }
    }

    private void y() {
        String string;
        String string2;
        StorageParams storageParams = new StorageParams();
        if (this.mActivity.e.isSupportRunPosture()) {
            if (eel.b(this.mActivity.f)) {
                string2 = this.mActivity.getString(R.string.IDS_aw_pro_running_mode_no_use_function);
                string = this.mActivity.getString(R.string.IDS_aw_pro_shoe_buckle);
            } else {
                string2 = this.mActivity.getString(R.string.IDS_aw_entrance_mode_select_subtitle);
                string = this.mActivity.getString(R.string.IDS_aw_running_mode);
            }
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "KEY_AW70_WARE_MODE", "RUNNING_MODE", storageParams);
        } else {
            string = this.mActivity.getString(R.string.IDS_aw_handring_mode);
            SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(10000), "KEY_AW70_WARE_MODE", "HANDRING_MODE", storageParams);
            string2 = "";
        }
        String string3 = this.mActivity.getString(R.string.IDS_aw_entrance_mode_select);
        e(36, string3, string, this.mActivity.h, string2);
        LogUtil.a("WearHomeGeneralCard", "After adding AW70 mode select item");
    }

    private boolean t() {
        if (this.mActivity.e.isAvoidDisturb()) {
            return true;
        }
        if ((this.mActivity.e.isSupportPhonesInfo() && this.mActivity.e.isSupportNotifyDeviceBroadCast()) || this.mActivity.e.isBluetoothOffAlert() || this.mActivity.e.isSupportOneLevelMenu() || this.mActivity.e.isSupportAutoLightScreen() || this.mActivity.e.isSupportRotateSwitchScreen() || this.mActivity.e.isSupportLeftRightHandWearMode()) {
            return true;
        }
        DeviceFeatureSupportApi deviceFeatureSupportApi = (DeviceFeatureSupportApi) Services.d("Module_Device_Feature", DeviceFeatureSupportApi.class);
        return deviceFeatureSupportApi != null && deviceFeatureSupportApi.isSupportWheelchair(this.mActivity.d);
    }

    private void a(int i, String str, String str2, boolean z) {
        e(i, str, str2, z, "");
    }

    private void e(int i, String str, String str2, boolean z, String str3) {
        tlf tlfVar = new tlf();
        tlfVar.e(i);
        tlfVar.c(str);
        tlfVar.e(str2);
        tlfVar.e(z);
        tlfVar.d(str3);
        tlfVar.d(false);
        a(tlfVar);
    }

    private void b(int i, tlf tlfVar) {
        if (i < 0 || i > this.f.size()) {
            LogUtil.a("WearHomeGeneralCard", "addGeneralSettingItem error:", Integer.valueOf(i));
            return;
        }
        LogUtil.a("WearHomeGeneralCard", "addGeneralSettingItem ", Integer.valueOf(i));
        this.f.add(i, tlfVar);
        WearHomeGeneralCardAdapter wearHomeGeneralCardAdapter = this.k;
        if (wearHomeGeneralCardAdapter != null) {
            wearHomeGeneralCardAdapter.notifyDataSetChanged();
        }
    }

    private void a(tlf tlfVar) {
        this.f.add(tlfVar);
        WearHomeGeneralCardAdapter wearHomeGeneralCardAdapter = this.k;
        if (wearHomeGeneralCardAdapter != null) {
            wearHomeGeneralCardAdapter.notifyDataSetChanged();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(int i) {
        if (!qrs.r() && i < this.f.size()) {
            CommonUtil.c();
            int iD = this.f.get(i).d();
            ReleaseLogUtil.d("Dfx_WearHomeGeneralCard", "id:", Integer.valueOf(iD), ", mGeneralAction: ", this.j);
            if (iD == 13) {
                this.j.y();
                return;
            }
            if (iD == 14) {
                this.j.r();
                return;
            }
            if (iD == 32) {
                rdt.d("feedback");
                this.j.x();
                return;
            }
            if (iD == 33) {
                rdt.d("beta_feedback");
                this.j.p();
                return;
            }
            if (iD == 36) {
                this.j.t();
                return;
            }
            if (iD == 51) {
                LogUtil.a("WearHomeGeneralCard", "ecg duration setting.");
                rdt.d("sleep_apnea_test");
                ab();
                return;
            }
            if (iD == 55) {
                rdt.d("device_checkup");
                u();
                return;
            }
            if (iD == 65) {
                rdt.d("device_info");
                this.j.h();
                return;
            }
            if (iD == 133) {
                this.mActivity.o();
                FallDetectionUtil.jumpEmergencySosH5(this.mActivity.d);
                return;
            }
            if (iD == 136) {
                if (this.n == null) {
                    LogUtil.j("WearHomeGeneralCard", "jump ServiceSupport fail");
                    return;
                } else {
                    rdt.d("service_support");
                    this.j.d(this.n);
                    return;
                }
            }
            if (iD == 45) {
                rdt.d("device_set");
                this.j.i();
            } else if (iD != 46) {
                LogUtil.j("WearHomeGeneralCard", "setOnItemClick default");
            } else {
                rdt.d("help_customer_service");
                this.j.u();
            }
        }
    }

    private void u() {
        if (this.mActivity.h) {
            this.j.q();
            ReleaseLogUtil.d("Dfx_WearHomeGeneralCard", "startDetection");
        } else {
            ReleaseLogUtil.d("Dfx_WearHomeGeneralCard", "startConnectDetection");
            this.mActivity.s.d("LOCAL_TYPE");
        }
    }

    private void ab() {
        CustomAlertDialog.Builder builder = new CustomAlertDialog.Builder(this.mActivity);
        Object systemService = BaseApplication.getContext().getSystemService("layout_inflater");
        if (systemService instanceof LayoutInflater) {
            View viewInflate = ((LayoutInflater) systemService).inflate(R.layout.hw_ecg_duration_dialog, (ViewGroup) null);
            builder.b(this.mActivity.getString(R.string.IDS_ecg_duration_dialog_title)).a(viewInflate).a(R.string.IDS_hw_show_cancel, new DialogInterface.OnClickListener() { // from class: tmu
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i) {
                    LogUtil.d("WearHomeGeneralCard", "cancel showEcgDurationDialog");
                }
            });
            e(viewInflate);
            CustomAlertDialog customAlertDialogB = builder.b();
            this.e = customAlertDialogB;
            customAlertDialogB.show();
        }
    }

    private void e(View view) {
        this.f49359c = (HealthRadioButton) view.findViewById(R.id.settings_close_ecg_button);
        this.i = (HealthRadioButton) view.findViewById(R.id.settings_open_ecg_button);
        this.d = (RelativeLayout) view.findViewById(R.id.settings_close_ecg_duration);
        this.h = (RelativeLayout) view.findViewById(R.id.settings_open_ecg_duration);
        HealthTextView healthTextView = (HealthTextView) view.findViewById(R.id.settings_close_ecg_text);
        String string = this.mActivity.getResources().getString(R.string.IDS_ecg_duration_second);
        healthTextView.setText(String.format(Locale.ENGLISH, string, 30));
        ((HealthTextView) view.findViewById(R.id.settings_open_ecg_text)).setText(String.format(Locale.ENGLISH, string, 120));
        this.d.setOnClickListener(new View.OnClickListener() { // from class: tmr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.e.c(view2);
            }
        });
        this.h.setOnClickListener(new View.OnClickListener() { // from class: tms
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.d.b(view2);
            }
        });
        w();
    }

    /* synthetic */ void c(View view) {
        c(0);
    }

    /* synthetic */ void b(View view) {
        c(1);
    }

    private void c(int i) {
        lvu.b().e(i, new IBaseResponseCallback() { // from class: tmv
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i2, Object obj) {
                tmo.d(i2, obj);
            }
        });
        CustomAlertDialog customAlertDialog = this.e;
        if (customAlertDialog != null) {
            customAlertDialog.dismiss();
        }
        c(d(i));
        w();
    }

    static /* synthetic */ void d(int i, Object obj) {
        if (i == 0) {
            LogUtil.a("WearHomeGeneralCard", "send 5.35.16 success.");
        } else {
            LogUtil.j("WearHomeGeneralCard", "sendEcgDuration error : ", Integer.valueOf(i));
        }
    }

    private JSONObject d(int i) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("get_ecg_authentication_switch_from_device", i);
            return jSONObject;
        } catch (JSONException unused) {
            LogUtil.e("WearHomeGeneralCard", "createJson JSONException");
            return jSONObject;
        }
    }

    private void w() {
        int iE = lvu.b().e();
        HealthRadioButton healthRadioButton = this.f49359c;
        if (healthRadioButton == null || this.i == null) {
            LogUtil.j("WearHomeGeneralCard", "showEcgDurationButton button is null.");
            return;
        }
        if (iE == 0) {
            healthRadioButton.setChecked(true);
            this.i.setChecked(false);
        } else if (iE == 1) {
            healthRadioButton.setChecked(false);
            this.i.setChecked(true);
        } else {
            LogUtil.j("WearHomeGeneralCard", "no support status;");
            this.f49359c.setChecked(true);
            this.i.setChecked(false);
        }
    }

    private void c(JSONObject jSONObject) {
        SharedPreferenceManager.e(BaseApplication.getContext(), Integer.toString(35), "storage_ecg_duration_json", jSONObject.toString(), new StorageParams(1));
    }

    public void g() {
        this.j.b(false);
        if (!this.j.d() || this.mActivity.isFinishing()) {
            return;
        }
        LogUtil.a("WearHomeGeneralCard", "upload log overtimes toast");
        if (!this.j.f()) {
            LogUtil.a("WearHomeGeneralCard", "uploadLogTimeout 5.10.12 not timeout");
            qpx.b(this.mContext, R.string.IDS_hw_toast_log_upload_failed);
        }
        this.j.a(false);
        mjh.d(false);
    }

    public void b(Message message) {
        if (message == null || this.j.g()) {
            LogUtil.j("WearHomeGeneralCard", "isCollectOver = ", Boolean.valueOf(this.j.g()));
            this.j.c(-1);
            this.j.c("");
        } else {
            String str = message.obj instanceof String ? (String) message.obj : "";
            c(message.arg1, str);
            if (str.equals(this.g)) {
                return;
            }
            this.g = str;
            LogUtil.a("WearHomeGeneralCard", "getDeviceLogProcess mLastProgressDesc :", str);
        }
    }

    public void j() {
        this.j.w();
    }

    public void d() {
        LogUtil.a("WearHomeGeneralCard", 1, "WearHomeGeneralCard", "reset factory success");
        this.mActivity.f26234b.c();
        a(false);
        this.j.c();
        lmf.d().c(LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1011));
    }

    public void a(boolean z) {
        this.j.d(z);
    }

    public void a() {
        this.j.l();
    }

    public void b(String str) {
        this.j.d(str);
    }

    public void f() {
        this.j.s();
    }

    private void c(int i, String str) {
        this.j.b();
        this.j.e(i, str);
        LogUtil.a("WearHomeGeneralCard", "mCustomProgressDialog.show()");
    }

    public void d(int i, String str, String str2) {
        this.j.c(i, str, str2);
    }

    public void c() {
        LogUtil.a("WearHomeGeneralCard", "enter handlerDeviceGotoFeedBack");
        if (Utils.o()) {
            ltr.b().setProductType(20);
        } else {
            ltr.b().setProductType(1);
        }
        this.j.e();
    }

    public void b() {
        this.j.c(10001, "5.10.12 cancel timeout 7 minutes");
    }
}
