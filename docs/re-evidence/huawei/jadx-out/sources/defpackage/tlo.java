package defpackage;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.devicefeature.DeviceFeatureSupportApi;
import com.huawei.haf.common.utils.CollectionUtils;
import com.huawei.haf.handler.HandlerExecutor;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.api.constant.GetDeviceInfoMode;
import com.huawei.health.devicemgr.api.mainprocess.DownloadManagerApi;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hihealth.dictionary.constants.ProductMap;
import com.huawei.hihealth.dictionary.constants.ProductMapInfo;
import com.huawei.hihealth.dictionary.utils.ProductMapParseUtil;
import com.huawei.hihealth.util.HiJsonUtil;
import com.huawei.hms.hihealth.HiHealthActivities;
import com.huawei.hwbasemgr.IBaseResponseCallback;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcloudmodel.agreement.AgrConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.util.WatchFaceUtil;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.HwExerciseConstants;
import com.huawei.hwdevice.phoneprocess.mgr.exercise.utils.HwWorkoutServiceUtils;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.maps.offlinedata.health.init.OfflineMapInitManager;
import com.huawei.maps.offlinedata.health.init.OnCheckUpdatesListener;
import com.huawei.maps.offlinedata.health.init.OnCreateResultListener;
import com.huawei.openalliance.ad.constant.Constants;
import com.huawei.openalliance.ad.constant.CreativeType;
import com.huawei.operation.OpAnalyticsUtil;
import com.huawei.trade.PayApi;
import com.huawei.trade.datatype.DeviceBenefitQueryParam;
import com.huawei.trade.datatype.DeviceBenefits;
import com.huawei.trade.datatype.DeviceInboxInfo;
import com.huawei.trade.datatype.RepeatResourceBenefitInfo;
import com.huawei.ui.commonui.base.BaseDialog;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.device.activity.intelligenthome.IntelligentHomeLinkageActivity;
import com.huawei.ui.device.utlis.FindNetworkUtils;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.homewear21.home.WearHomeOldActivity;
import com.huawei.ui.homewear21.home.adapter.GridSpacingItemDecoration;
import com.huawei.ui.homewear21.home.adapter.WearHomeFeatureCardAdapter;
import com.huawei.ui.homewear21.home.card.WearHomeBaseCard;
import com.huawei.ui.homewear21.home.card.WechatDeviceProviderHelper;
import com.huawei.ui.homewear21.home.holder.WearHomeFeatureHolder;
import com.huawei.ui.homewear21.home.listener.WearHomeListener;
import com.huawei.ui.homewear21.home.manager.hwnfcwalletmgr.WalletAppManager;
import com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback;
import com.huawei.wear.oversea.overseamanger.SatcomQueryCallBack;
import com.huawei.wear.oversea.satcomcard.SatcomCardSupportInfo;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.KeyValDbManager;
import health.compact.a.Services;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.ToIntFunction;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes18.dex */
public class tlo extends WearHomeBaseCard {
    private static String d = "";
    private static final Object e = new Object();
    private tiv f;
    private boolean g;
    private WearHomeFeatureCardAdapter t;
    private WearHomeFeatureHolder q = null;
    private List<tlj> k = new ArrayList(16);
    private boolean i = false;
    private boolean o = false;
    private String h = "";
    private String j = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f49332c = "";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f49331b = "";
    private String s = "";
    private rgg m = null;
    private volatile boolean l = false;
    private boolean n = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final BroadcastReceiver f49330a = new BroadcastReceiver() { // from class: tlo.1
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null) {
                LogUtil.j("WearHomeFeatureCard", "mDeviceAppUpdateBroadcastReceiver intent is null");
                return;
            }
            LogUtil.a("WearHomeFeatureCard", "mDeviceAppUpdateBroadcastReceiver intent action is:", intent.getAction());
            if ("com.huawei.appmarket.action.REFRESH_DEVICE_APP_UPDATE".equals(intent.getAction())) {
                tlo.this.a(intent.getBooleanExtra("isEnable", false));
            }
        }
    };

    public tlo(Context context, WearHomeOldActivity wearHomeOldActivity) {
        this.mContext = context;
        this.mActivity = wearHomeOldActivity;
        this.f = new tiv(context, wearHomeOldActivity);
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public RecyclerView.ViewHolder getCardViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.q = new WearHomeFeatureHolder(layoutInflater.inflate(R.layout.wear_home_feature_layout, viewGroup, false));
        this.t = new WearHomeFeatureCardAdapter(this.mContext, this.k);
        this.q.a().setLayoutManager(ag());
        this.q.a().addItemDecoration(ai());
        this.q.a().setAdapter(this.t);
        this.q.a().setLayerType(2, null);
        this.q.a().setItemAnimator(new DefaultItemAnimator());
        this.t.d(new WearHomeListener() { // from class: tlx
            @Override // com.huawei.ui.homewear21.home.listener.WearHomeListener
            public final void onItemClick(int i) {
                this.f49342b.b(i);
            }
        });
        aw();
        return this.q;
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public void deviceConnectionChange(int i) {
        if (this.mActivity == null || this.q == null || this.t == null) {
            LogUtil.j("WearHomeFeatureCard", "deviceConnectionChange fail mActivity:", this.mActivity, " mWearHomeFeatureHolder:", this.q, " mWearHomeFeatureCardAdapter:", this.t);
            return;
        }
        this.mActivity.e = this.mActivity.f26234b.e(this.mActivity.f26233a);
        if (this.mActivity.e == null) {
            this.q.a().setVisibility(8);
            return;
        }
        this.mActivity.d = tfn.a().a(this.mActivity.f26233a);
        if (this.mActivity.d == null) {
            return;
        }
        an();
        if (this.k.size() == 0) {
            this.q.a().setVisibility(8);
            return;
        }
        this.q.a().setVisibility(0);
        LogUtil.a("WearHomeFeatureCard", "deviceConnectionChange state:", Integer.valueOf(i));
        n(i);
    }

    private void au() {
        this.t.d(this.k);
        this.t.notifyDataSetChanged();
    }

    public void d(int i) {
        this.f.a(i);
    }

    public void l() {
        LogUtil.a("WearHomeFeatureCard", "checkLocationServiceStatus() ENTER");
        if (this.mActivity == null) {
            LogUtil.j("WearHomeFeatureCard", "mActivity is null");
            return;
        }
        if (!tqp.b("wear_local_service_time")) {
            LogUtil.a("WearHomeFeatureCard", "showGpsNoteDialog <48h");
            return;
        }
        if (this.mActivity.f26234b == null) {
            LogUtil.j("WearHomeFeatureCard", "checkLocationServiceStatus() if (mDeviceInteractors null)");
            i(R.string.IDS_hw_gps_location);
        } else {
            this.mActivity.e = this.mActivity.f26234b.e(this.mActivity.f26233a);
            i(R.string.IDS_hw_gps_location);
        }
    }

    private void i(final int i) {
        if (this.g) {
            LogUtil.j("WearHomeFeatureCard", "gps dialog is open");
        } else {
            this.mActivity.runOnUiThread(new Runnable() { // from class: tml
                @Override // java.lang.Runnable
                public final void run() {
                    this.e.a(i);
                }
            });
        }
    }

    /* synthetic */ void a(int i) {
        e(i, 101);
    }

    private void e(int i, final int i2) {
        this.g = true;
        LogUtil.a("WearHomeFeatureCard", "showGpsDialog() mIsGpsOpenDialog is open");
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.mContext).a(this.mContext.getString(i)).c(R.string.IDS_settings_button_ok, new View.OnClickListener() { // from class: tmb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49346b.b(i2, view);
            }
        }).a(R.string.IDS_settings_button_cancal, new View.OnClickListener() { // from class: tlz
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49343b.e(view);
            }
        }).c();
        noTitleCustomAlertDialogC.setCanceledOnTouchOutside(false);
        noTitleCustomAlertDialogC.setCancelable(false);
        if (noTitleCustomAlertDialogC.isShowing() || this.mActivity.isFinishing()) {
            return;
        }
        noTitleCustomAlertDialogC.show();
        KeyValDbManager.d(BaseApplication.getContext()).b("wear_local_service_time", String.valueOf(System.currentTimeMillis()));
    }

    /* synthetic */ void b(int i, View view) {
        this.g = false;
        LogUtil.a("WearHomeFeatureCard", "showGPSSettingDialog() setPositiveButton");
        Intent intent = new Intent();
        intent.setAction("android.settings.LOCATION_SOURCE_SETTINGS");
        try {
            c(intent, i);
        } catch (ActivityNotFoundException unused) {
            intent.setAction("android.settings.SETTINGS");
            try {
                c(intent, i);
            } catch (ActivityNotFoundException unused2) {
                LogUtil.e("WearHomeFeatureCard", "startActivity exception");
            }
        }
    }

    /* synthetic */ void e(View view) {
        LogUtil.a("WearHomeFeatureCard", "showGpsDialog onclick NegativeButton");
        this.g = false;
    }

    private void c(Intent intent, int i) throws ActivityNotFoundException {
        ResolveInfo resolveInfoResolveActivity;
        PackageManager packageManager = this.mActivity.getPackageManager();
        if (packageManager == null || (resolveInfoResolveActivity = packageManager.resolveActivity(intent, 65536)) == null) {
            return;
        }
        intent.setComponent(new ComponentName(resolveInfoResolveActivity.activityInfo.packageName, resolveInfoResolveActivity.activityInfo.name));
        this.mActivity.startActivityForResult(intent, i);
    }

    private void n(int i) {
        if (i == 2) {
            aa();
        } else {
            for (tlj tljVar : this.k) {
                LogUtil.d("WearHomeFeatureCard", "checkIsOtaEnd OTA item isEnable");
                tljVar.a(false);
                if (tljVar.d() == 131 || tljVar.d() == 130 || tljVar.d() == 112 || tljVar.d() == 108) {
                    tljVar.a(true);
                } else if (tljVar.d() == 101) {
                    DeviceInfo deviceInfo = ecu.d().getDeviceInfo(GetDeviceInfoMode.ACTIVE_MAIN_DEVICES_WITHOUT_AW70, null, "R_WearHomeFeatureCard");
                    DeviceInfo deviceInfo2 = this.mActivity.d;
                    if (deviceInfo != null && deviceInfo2 != null && Objects.equals(deviceInfo.getDeviceIdentify(), deviceInfo2.getDeviceIdentify())) {
                        tljVar.a(true);
                    }
                } else if (tljVar.d() == 115) {
                    boolean zC = FindNetworkUtils.c(this.mActivity.d, this.mActivity);
                    ReleaseLogUtil.d("R_WearHomeFeatureCard", "isSupportOfflineFindDevice:", Boolean.valueOf(zC));
                    if (zC) {
                        tljVar.a(true);
                    }
                }
            }
        }
        au();
    }

    private void aa() {
        if (this.mActivity.d != null && eel.d(this.mActivity.d.getProductType())) {
            ar();
            return;
        }
        if (ap()) {
            LogUtil.a("WearHomeFeatureCard", "refreshSettingView() wear device is OTA");
            for (tlj tljVar : this.k) {
                tljVar.a(false);
                if (tljVar.d() == 131 || tljVar.d() == 130 || tljVar.d() == 108) {
                    tljVar.a(true);
                }
                if (this.mActivity.k && (tljVar.d() == 117 || tljVar.d() == 116)) {
                    tljVar.a(true);
                }
            }
            return;
        }
        this.l = false;
        for (tlj tljVar2 : this.k) {
            if (this.mActivity.d != null && !tqp.e(this.mActivity.d.getProductType())) {
                tljVar2.a(true);
            } else if (!this.mActivity.k) {
                tljVar2.a(true);
            } else {
                tljVar2.a(false);
                if (d(tljVar2)) {
                    tljVar2.a(true);
                }
            }
        }
    }

    private boolean d(tlj tljVar) {
        int iD = tljVar.d();
        if (iD == 108 || iD == 130 || iD == 131) {
            return true;
        }
        switch (iD) {
            case 115:
            case AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID /* 116 */:
            case 117:
                return true;
            default:
                LogUtil.j("WearHomeFeatureCard", "isEnable default");
                return false;
        }
    }

    private void ar() {
        if (ap()) {
            LogUtil.a("WearHomeFeatureCard", "refreshSettingView() AW70 is OTA");
            for (tlj tljVar : this.k) {
                tljVar.a(false);
                if (tljVar.d() == 131 || tljVar.d() == 108) {
                    tljVar.a(true);
                }
            }
        }
    }

    private boolean ap() {
        return this.mActivity.f26234b.e(this.mActivity.f26233a) != null && this.mActivity.f26234b.e(this.mActivity.f26233a).isOtaUpdate() && maq.b().c(this.mActivity.f26233a) == 6;
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public void onResume() {
        LogUtil.a("WearHomeFeatureCard", BaseDialog.LIFE_CYCLE_ON_RESUME);
        al();
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public void onDestroy() {
        LogUtil.a("WearHomeFeatureCard", "onDestroy");
        tqp.a(this.f49330a);
        this.i = false;
    }

    public void m() {
        LogUtil.a("WearHomeFeatureCard", "updateFeatureCard");
        al();
    }

    public static String a() {
        return d;
    }

    private GridLayoutManager ag() {
        if (this.t.getItemCount() == 1) {
            GridLayoutManager gridLayoutManagerC = c(1);
            WearHomeFeatureHolder.c(1);
            return gridLayoutManagerC;
        }
        if (this.t.getItemCount() == 2) {
            GridLayoutManager gridLayoutManagerC2 = c(2);
            WearHomeFeatureHolder.c(2);
            return gridLayoutManagerC2;
        }
        if (qrs.af(this.mContext)) {
            GridLayoutManager gridLayoutManagerC3 = c(3);
            WearHomeFeatureHolder.c(3);
            return gridLayoutManagerC3;
        }
        GridLayoutManager gridLayoutManagerC4 = c(2);
        WearHomeFeatureHolder.c(2);
        return gridLayoutManagerC4;
    }

    private GridLayoutManager c(final int i) {
        final Context context = this.mContext;
        final int i2 = 1;
        final boolean z = false;
        return new GridLayoutManager(context, i, i2, z) { // from class: com.huawei.ui.homewear21.home.card.WearHomeFeatureCard$2
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.LayoutManager
            public boolean canScrollVertically() {
                return false;
            }
        };
    }

    private void aw() {
        LogUtil.a("WearHomeFeatureCard", "onUiCreate");
        this.f.a();
        al();
    }

    private void al() {
        if (this.mActivity == null || this.q == null || this.t == null) {
            LogUtil.j("WearHomeFeatureCard", "initView fail mActivity:", this.mActivity, " mWearHomeFeatureHolder:", this.q, " mWearHomeFeatureCardAdapter:", this.t);
            return;
        }
        if (this.mActivity.e == null) {
            this.q.a().setVisibility(8);
            LogUtil.j("WearHomeFeatureCard", "initView fail mActivity.mDeviceCapability is null");
            return;
        }
        this.mActivity.d = tfn.a().a(this.mActivity.f26233a);
        if (this.mActivity.d == null) {
            LogUtil.j("WearHomeFeatureCard", "initView fail mActivity.mCurrentDeviceInfo is null");
            return;
        }
        an();
        OpAnalyticsUtil.getInstance().isSetIgnoringBatteryOptimizations(this.mContext, "e2");
        bo();
    }

    private void bo() {
        this.mActivity.d = tfn.a().a(this.mActivity.f26233a);
        if (this.k.size() == 0 || this.mActivity.d == null) {
            LogUtil.j("WearHomeFeatureCard", "updateWearHomeFeatureCard fail mWearHomeFeatureBeans size is 0");
            this.q.a().setVisibility(8);
        } else {
            this.q.a().setVisibility(0);
            n(this.mActivity.d.getDeviceConnectState());
        }
    }

    private GridSpacingItemDecoration ai() {
        return new GridSpacingItemDecoration(false, qqp.a(this.mContext, 0.0f));
    }

    private void bg() {
        if (((DeviceFeatureSupportApi) Services.b("Module_Device_Feature", DeviceFeatureSupportApi.class)).isSupportOfflineMap(this.mActivity.d)) {
            LogUtil.a("WearHomeFeatureCard", "onReceive connectState ", Integer.valueOf(this.mActivity.d.getDeviceConnectState()));
            if (e(112) == null) {
                rdo.b().a(BaseApplication.getContext(), this.mActivity.d.getDeviceUdid());
                bj();
            } else if (this.n) {
                c(false);
            }
            a(112, this.mActivity.getString(R.string.IDS_device_home_offline_map), R.mipmap.ic_offline_map, true);
            this.q.a().post(new Runnable() { // from class: tmi
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49352c.j();
                }
            });
        }
    }

    /* synthetic */ void j() {
        this.t.notifyDataSetChanged();
    }

    private void bf() {
        boolean zIsSupportOutdoorAdventure = ((DeviceFeatureSupportApi) Services.b("Module_Device_Feature", DeviceFeatureSupportApi.class)).isSupportOutdoorAdventure(this.mActivity.d);
        LogUtil.a("WearHomeFeatureCard", "isSupportOutdoorAdventure : ", Boolean.valueOf(zIsSupportOutdoorAdventure));
        if (zIsSupportOutdoorAdventure) {
            a(CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON, this.mActivity.getString(R.string.IDS_hw_sport_oal), R.mipmap.ic_outdoor_adventure, this.mActivity.h);
        }
    }

    private void bj() {
        LogUtil.a("WearHomeFeatureCard", "OfflineMapInitManager checkForUpdates");
        OfflineMapInitManager.getInstance().checkForUpdates(this.mActivity.getApplicationContext(), this.mActivity.d.getDeviceUdid(), new OnCheckUpdatesListener() { // from class: tlm
            @Override // com.huawei.maps.offlinedata.health.init.OnCheckUpdatesListener
            public final void onResult(boolean z) {
                this.d.c(z);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(boolean z) {
        LogUtil.j("WearHomeFeatureCard", "OfflineMapInitManager updateMapItem: isShowRedDot ", Boolean.valueOf(z));
        tlj tljVarE = e(112);
        if (tljVarE != null) {
            LogUtil.a("WearHomeFeatureCard", "OfflineMapInitManager  isEnable", Boolean.valueOf(tljVarE.h()));
            tljVarE.e(z);
            c(tljVarE);
            return;
        }
        LogUtil.j("WearHomeFeatureCard", "DeviceSettingConstants.ID_DEVICE_OFFLINE_MAP is null");
    }

    private void an() {
        this.k.clear();
        z();
        r();
        DeviceInfo deviceInfo = this.mActivity.d;
        if (WatchFaceUtil.isSupportMyWatch(deviceInfo)) {
            a(101, this.mActivity.getString(R.string.IDS_my_watchface), R.mipmap.ic_setup_my_watch_face, true);
        }
        if (at()) {
            a(AgrConstant.HEALTH_AGREEMENT_CODE, this.mActivity.getString(R.string.IDS_device_home_health_monitor), R.drawable.ic_setup_mointor, this.mActivity.h);
        }
        ad();
        if (deviceInfo == null) {
            LogUtil.j("WearHomeFeatureCard", "showItemCaseOne: currentDeviceInfo is null");
        } else {
            String deviceName = deviceInfo.getDeviceName();
            ReleaseLogUtil.d("R_WearHomeFeatureCard", "showHeartIndexItem currentDeviceName:", deviceName);
            if (!TextUtils.isEmpty(deviceName) && deviceInfo.getProductType() == 11 && deviceName.contains("HUAWEI CM-R1P")) {
                be();
            }
        }
        ReleaseLogUtil.d("R_WearHomeFeatureCard", "TYPE_MUSIC isSupportMusicInfoList:", Boolean.valueOf(this.mActivity.e.isSupportMusicInfoList()));
        if (this.mActivity.e.isSupportMusicInfoList()) {
            a(111, this.mActivity.getString(R.string.IDS_hwh_motiontrack_music), R.drawable.ic_music, this.mActivity.h);
        }
        boolean zC = lxc.c(this.mActivity.f26233a);
        ReleaseLogUtil.d("R_WearHomeFeatureCard", "SUPPORT_FAMILY_MODE_HEART isSupportFamilyModeHeart:", Boolean.valueOf(zC), " PairMode", Integer.valueOf(mgb.d(this.mActivity.f26233a)));
        if (zC && lxc.a(this.mActivity.f26233a)) {
            a(Constants.MAX_PRO_BOTTOM_MARGIN_PAD, this.mActivity.getString(R.string.IDS_hwh_motiontrack_sport_heart_rate_setting), R.mipmap.ic_setup_heart, this.mActivity.h);
        }
        ReleaseLogUtil.d("R_WearHomeFeatureCard", "initAppMarketCard isSupportMarketFace:", Boolean.valueOf(this.mActivity.e.isSupportMarketFace()), " isSupportMarketParams", Boolean.valueOf(this.mActivity.e.isSupportMarketParams()), " isSupportAppGallery:", Boolean.valueOf(eey.d(this.mActivity.d, 44)), "isSingleWatchSupportAppGallery:", Boolean.valueOf(eey.d(this.mActivity.d, HwWorkoutServiceUtils.HEART_RATE_TRUST_VALUE)));
        if (this.mActivity.e.isSupportMarketFace() || this.mActivity.e.isSupportMarketParams() || lyy.b().b(this.mActivity.d)) {
            am();
        } else if (!eel.d(this.mActivity.f)) {
            OpAnalyticsUtil.getInstance().setProbabilityProblemEvent("initAppMarketCard failed", String.format("device name=%s, HiLinkId=%s, Model=%s Version=%s", this.mActivity.d.getDeviceName(), this.mActivity.d.getHiLinkDeviceId(), this.mActivity.d.getDeviceModel(), this.mActivity.d.getSoftVersion()));
        }
        ReleaseLogUtil.d("R_WearHomeFeatureCard", "DEVICE_SETTING_NOTAIFICATION isMessageAlert:", Boolean.valueOf(this.mActivity.e.isMessageAlert()));
        if (this.mActivity.e.isMessageAlert()) {
            if (TextUtils.isEmpty(this.s)) {
                this.s = this.mActivity.getString(R.string.IDS_status_disabled);
            }
            c(103, this.mActivity.getString(R.string.IDS_nottification_settings_b2_ex), R.drawable.ic_massage2, this.mActivity.h, this.s);
            bl();
        }
        bg();
        bf();
        if (tqp.b(this.mActivity.d)) {
            a(114, this.mActivity.getString(R.string.IDS_notification_live_settings), R.mipmap.nottification_live, this.mActivity.h);
        }
        u();
    }

    private void t() {
        boolean zE = grt.e(this.mActivity.d);
        LogUtil.a("WearHomeFeatureCard", "addArrhythmiaItem showArrhythmiaItem is ", Boolean.valueOf(zE));
        if (zE) {
            a(122, this.mActivity.getString(R.string.IDS_arrhythmia_title), R.mipmap.ic_arrhythmia, this.mActivity.h);
        }
    }

    private void z() {
        ReleaseLogUtil.d("R_WearHomeFeatureCard", "dealEarphoneHealth isSupportEarphone:", Boolean.valueOf(eey.d(this.mActivity.d, 112)));
        if (eey.d(this.mActivity.d, 112)) {
            LogUtil.a("WearHomeFeatureCard", "show the Headset");
            a(104, this.mActivity.getString(R.string.IDS_wear_home_device_earphone), R.mipmap.ic_earphone_health, this.mActivity.h);
        }
    }

    private void am() {
        if (lyy.b().b(this.mActivity.d)) {
            if (as()) {
                LogUtil.a("WearHomeFeatureCard", "initAppMarketCard isKoreaVersion is true");
                return;
            } else {
                a(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, this.mActivity.getString(R.string.IDS_device_fragment_application_market), R.drawable.ic_setup_appmarket, this.mActivity.h);
                return;
            }
        }
        lyy.b().a(this.mActivity.e, new IBaseResponseCallback() { // from class: tly
            @Override // com.huawei.hwbasemgr.IBaseResponseCallback
            /* JADX INFO: renamed from: onResponse */
            public final void a(int i, Object obj) {
                this.e.b(i, obj);
            }
        });
    }

    /* synthetic */ void b(int i, Object obj) {
        LogUtil.a("WearHomeFeatureCard", "showAppMarket errorCode:", Integer.valueOf(i));
        if (i == 1) {
            p();
        }
    }

    private void bl() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: tlw
            @Override // java.lang.Runnable
            public final void run() {
                this.f49341c.h();
            }
        });
    }

    /* synthetic */ void h() {
        final boolean zD = lzi.a().d();
        final int iE = eei.e();
        HandlerExecutor.b(new Runnable() { // from class: tmn
            @Override // java.lang.Runnable
            public final void run() {
                this.f49355b.d(iE, zD);
            }
        });
    }

    /* synthetic */ void d(int i, boolean z) {
        int i2;
        this.s = this.mActivity.getString(R.string.IDS_status_disabled);
        if (tqp.b(this.mActivity.f)) {
            this.s = this.mActivity.getString(R.string.IDS_status_enabled);
        }
        if (i == 1) {
            if (z) {
                i2 = R.drawable.ic_device_massage;
            } else {
                i2 = R.drawable.ic_device_massage_close;
            }
        } else if (z) {
            i2 = R.drawable.ic_massage2;
        } else {
            i2 = R.drawable.ic_massage2_close;
        }
        for (tlj tljVar : this.k) {
            if (tljVar != null && tljVar.d() == 103) {
                LogUtil.j("WearHomeFeatureCard", "refreshNotificationPushRedDot isShowRedDot: ", Boolean.valueOf(qxg.a()));
                tljVar.e(qxg.a());
                LogUtil.a("WearHomeFeatureCard", "update notification icon and status");
                tljVar.c(this.s);
                tljVar.e(i2);
                break;
            }
        }
        au();
    }

    private void p() {
        this.mActivity.runOnUiThread(new Runnable() { // from class: tmf
            @Override // java.lang.Runnable
            public final void run() {
                this.f49349a.bd();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bd() {
        LogUtil.a("WearHomeFeatureCard", "updateAppMarketShow");
        if (!this.i) {
            LogUtil.a("WearHomeFeatureCard", "updateAppMarketShow registerLocalBroadcast");
            tqp.e(this.f49330a, "com.huawei.appmarket.action.REFRESH_DEVICE_APP_UPDATE");
            this.i = true;
        }
        lyy.b().h();
        a(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY, this.mActivity.getString(R.string.IDS_device_fragment_application_market), R.drawable.ic_setup_appmarket, this.mActivity.h);
        bb();
        lyy.b().d();
        au();
    }

    private void bb() {
        tlj tljVarE = e(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY);
        if (tljVarE == null) {
            LogUtil.j("WearHomeFeatureCard", "setAppMarketRedDotByCache id is error");
        } else {
            tljVarE.e(lyy.b().c(this.mActivity.d.getDeviceIdentify()));
        }
    }

    private tlj e(int i) {
        if (CollectionUtils.a(this.k)) {
            return null;
        }
        return c(i, 0, this.k.size() - 1);
    }

    private tlj c(int i, int i2, int i3) {
        if (i2 > i3) {
            return null;
        }
        int i4 = (i2 + i3) / 2;
        tlj tljVar = this.k.get(i4);
        if (tljVar.d() == i) {
            return tljVar;
        }
        if (tljVar.d() > i) {
            return c(i, i2, i4 - 1);
        }
        return c(i, i4 + 1, i3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final boolean z) {
        if (this.mActivity == null) {
            LogUtil.j("WearHomeFeatureCard", "refreshAppMarketRedDot mActivity is null");
            return;
        }
        if (this.mActivity.d != null) {
            lyy.b().a(this.mActivity.d.getDeviceIdentify(), z);
        }
        this.mActivity.runOnUiThread(new Runnable() { // from class: tmc
            @Override // java.lang.Runnable
            public final void run() {
                this.e.b(z);
            }
        });
    }

    /* synthetic */ void b(boolean z) {
        for (tlj tljVar : this.k) {
            if (tljVar != null && tljVar.d() == 109) {
                LogUtil.j("WearHomeFeatureCard", "refreshAppMarketRedDot, get apps card and set red dot");
                tljVar.e(z);
                break;
            }
        }
        au();
    }

    private void u() {
        x();
        ay();
        ReleaseLogUtil.d("R_WearHomeFeatureCard", "DEVICE_SETTING_ALARM isEventAlarm:", Boolean.valueOf(this.mActivity.e.isEventAlarm()), " isSmartAlarm", Boolean.valueOf(this.mActivity.e.isSmartAlarm()));
        if (this.mActivity.e.isEventAlarm() || this.mActivity.e.isSmartAlarm()) {
            a(AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID, this.mActivity.getString(R.string.IDS_settings_prompt), R.mipmap.ic_setup_list_alme, this.mActivity.h);
        }
        ReleaseLogUtil.d("R_WearHomeFeatureCard", "DEVICE_SETTING_WEATHER isWeatherPush:", Boolean.valueOf(this.mActivity.e.isWeatherPush()));
        if (this.mActivity.e.isWeatherPush()) {
            a(117, this.mActivity.getString(R.string.IDS_weather_push), R.mipmap.ic_setup_list_weather, this.mActivity.h);
        }
        v();
        ReleaseLogUtil.d("R_WearHomeFeatureCard", "DEVICE_SETTING_CONTACTS isContacts:", Boolean.valueOf(this.mActivity.e.isContacts()));
        if (this.mActivity.e.isContacts()) {
            a(126, this.mActivity.getString(R.string.IDS_contact_favorite_contacts), R.drawable.ic_setup_list_user, this.mActivity.h);
        }
        ac();
        ReleaseLogUtil.d("R_WearHomeFeatureCard", "SMS_QUICK_REPLY isSupportEditSms:", Boolean.valueOf(tqp.a(this.mActivity.d)));
        if (tqp.a(this.mActivity.d)) {
            a(127, this.mActivity.getString(R.string.IDS_sms_quick_reply), R.mipmap.ic_setup_list_sms_send, this.mActivity.h);
        }
        if (aq()) {
            a(129, this.mActivity.getString(R.string.IDS_Smart_life_linkage), R.drawable.ic_setup_list_interactive, this.mActivity.h);
        }
        if (nzz.c()) {
            a(108, ae(), R.drawable.ic_system, true);
        }
        if (this.mActivity.c() != null) {
            this.mActivity.c().b(new WechatDeviceProviderHelper.CheckResultListener() { // from class: tmk
                @Override // com.huawei.ui.homewear21.home.card.WechatDeviceProviderHelper.CheckResultListener
                public final void onResult(boolean z) {
                    this.e.e(z);
                }
            });
        }
        az();
        ba();
    }

    /* synthetic */ void e(boolean z) {
        ReleaseLogUtil.d("R_WearHomeFeatureCard", "SUPPORT_WECHAT_DEVICE_BIND isSupportWechatDevice:", Boolean.valueOf(z));
        if (z) {
            a(130, this.mActivity.getString(R.string.IDS_device_wechat_bind_card), R.mipmap.ic_wechat_info, true);
            this.q.a().post(new Runnable() { // from class: tlk
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49327a.c();
                }
            });
        }
    }

    /* synthetic */ void c() {
        this.t.notifyDataSetChanged();
    }

    private String ae() {
        edl pluginInfoByDeviceType;
        String string = this.mActivity.getString(R.string.IDS_hw_disconnected_device);
        DeviceInfo deviceInfo = this.mActivity.d;
        if (deviceInfo == null) {
            LogUtil.j("WearHomeFeatureCard", "getDeviceProtectString, deviceinfo is null");
            return string;
        }
        int iK = lvi.a(deviceInfo.getProductType()).k();
        if (iK == 0 && (pluginInfoByDeviceType = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByDeviceType(deviceInfo.getProductType())) != null && pluginInfoByDeviceType.i() != null) {
            iK = pluginInfoByDeviceType.i().at();
        }
        LogUtil.a("WearHomeFeatureCard", "hiType: ", Integer.valueOf(iK));
        ProductMapParseUtil.a(BaseApplication.getContext());
        List<ProductMapInfo> listC = ProductMap.c("deviceId", String.valueOf(iK));
        if (CollectionUtils.a(listC)) {
            return string;
        }
        ProductMapInfo productMapInfo = listC.get(0);
        if (productMapInfo == null) {
            LogUtil.j("WearHomeFeatureCard", "getDeviceProtectString, productMapInfo is null");
            return string;
        }
        String strE = productMapInfo.e();
        LogUtil.a("WearHomeFeatureCard", "deviceType: ", strE);
        if (TextUtils.isEmpty(strE)) {
            return string;
        }
        if ("06D".equals(strE)) {
            return this.mActivity.getString(R.string.IDS_hw_disconnected_watch);
        }
        return "06E".equals(strE) ? this.mActivity.getString(R.string.IDS_hw_disconnected_band) : string;
    }

    private void bc() {
        boolean zD = eey.d(this.mActivity.d, 75);
        boolean z = zD && fej.a("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.h5.vascular-health");
        ReleaseLogUtil.d("R_WearHomeFeatureCard", "setVascularItem isSupportCapability:", Boolean.valueOf(zD), " isSupportVascular:", Boolean.valueOf(z));
        if (z) {
            a(124, this.mActivity.getString(R.string.IDS_vascular_elasticity_test), R.mipmap.ic_vascular_test, this.mActivity.h);
        }
    }

    private void v() {
        ReleaseLogUtil.d("R_WearHomeFeatureCard", "addSimCardItem isSupportEsim:", Boolean.valueOf(this.mActivity.e.isSupportEsim()));
        if (qrs.ah(BaseApplication.getContext()) || !this.mActivity.e.isSupportEsim()) {
            return;
        }
        ReleaseLogUtil.d("R_WearHomeFeatureCard", "addSimCardItem isSupportNewEsim:", Boolean.valueOf(this.mActivity.e.isSupportNewEsim()));
        if (this.mActivity.e.isSupportNewEsim()) {
            a(107, this.mActivity.getString(R.string.IDS_main_homefragment_esimcard), R.mipmap.ic_esim, true);
        } else {
            a(107, this.mActivity.getString(R.string.IDS_main_homefragment_simcard), R.drawable.ic_sim, true);
        }
    }

    private void y() {
        LogUtil.a("WearHomeFeatureCard", "addOverseaWalletItem enter");
        if (LoginInit.getInstance(BaseApplication.getContext()).isMinorAccount()) {
            LogUtil.a("WearHomeFeatureCard", "addOverseaWalletItem minor account");
            return;
        }
        final DeviceInfo deviceInfo = this.mActivity.d;
        if (deviceInfo == null) {
            LogUtil.a("WearHomeFeatureCard", "addOverseaWalletItem device info is null");
            return;
        }
        if (as()) {
            LogUtil.a("WearHomeFeatureCard", "addOverseaWalletItem isKoreaVersion  is true");
            return;
        }
        final boolean isSupportWalletApp = WalletAppManager.getInstance().getIsSupportWalletApp(deviceInfo.getDeviceIdentify());
        ReleaseLogUtil.d("WearHomeFeatureCard", "addOverseaWalletItem show wallet: ", Boolean.valueOf(isSupportWalletApp));
        if (isSupportWalletApp) {
            a(110, this.mActivity.getString(R.string.IDS_device_wallet), R.mipmap.img_setup_oversea_wallet, this.mActivity.h);
        }
        WalletAppManager.getInstance().getValidWalletApplication(deviceInfo.getDeviceIdentify(), new ResponseCallback() { // from class: tmh
            @Override // com.huawei.hwbasemgr.ResponseCallback
            public final void onResponse(int i, Object obj) {
                this.f49350a.d(isSupportWalletApp, deviceInfo, i, (List) obj);
            }
        });
    }

    /* synthetic */ void d(boolean z, DeviceInfo deviceInfo, int i, List list) {
        boolean zA = CollectionUtils.a(list);
        boolean z2 = !zA;
        ReleaseLogUtil.d("WearHomeFeatureCard", "addOverseaWalletItem reload wallet icon:", Boolean.valueOf(z2));
        if (z2 == z) {
            return;
        }
        ReleaseLogUtil.d("WearHomeFeatureCard", "addOverseaWalletItem reload wallet icon");
        WalletAppManager.getInstance().setIsSupportWalletApp(deviceInfo.getDeviceIdentify(), z2);
        if (!zA) {
            this.mActivity.runOnUiThread(new Runnable() { // from class: tls
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49338c.d();
                }
            });
        } else if (f(110)) {
            this.q.a().post(new Runnable() { // from class: tlp
                @Override // java.lang.Runnable
                public final void run() {
                    this.f49335a.i();
                }
            });
        }
    }

    /* synthetic */ void d() {
        a(110, this.mActivity.getString(R.string.IDS_device_wallet), R.mipmap.img_setup_oversea_wallet, this.mActivity.h);
        c(e(110));
    }

    /* synthetic */ void i() {
        this.t.notifyDataSetChanged();
    }

    private void ac() {
        if (WalletAppManager.getInstance().isOverseaService()) {
            y();
            LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1014);
            n();
        } else {
            if (rgd.e(this.mActivity.f26233a, this.mActivity.e)) {
                a(110, this.mActivity.getString(R.string.IDS_device_wallet), R.mipmap.ic_setup_list_wallet, this.mActivity.h);
                LoginInit.getInstance(BaseApplication.getContext()).getAccountInfo(1014);
                n();
                return;
            }
            LogUtil.j("WearHomeFeatureCard", "not support language.");
        }
    }

    public void n() {
        boolean zD = eey.d(this.mActivity.d, 283);
        LogUtil.a("WearHomeFeatureCard", "isSupportBeidou: ", Boolean.valueOf(zD));
        if (zD) {
            return;
        }
        ReleaseLogUtil.d("R_WearHomeFeatureCard", "querySupportSatcom enter, mWalletSatcomCardInfo:", this.m);
        rgg rggVar = this.m;
        if (rggVar != null && rggVar.e()) {
            a(106, this.mActivity.getString(R.string.IDS_device_wallet_satcom_card), R.mipmap.ic_setup_list_satcom, this.mActivity.h);
            for (tlj tljVar : this.k) {
                if (tljVar != null && tljVar.d() == 106) {
                    tljVar.d(this.m.a() == 1);
                    tljVar.e(ao());
                    break;
                }
            }
            ReleaseLogUtil.d("R_WearHomeFeatureCard", "querySupportSatcom isSupportSatCom is true");
            return;
        }
        if (this.m == null) {
            this.m = new rgg();
        }
        rgd.c(this.mActivity.d, new SatcomQueryCallBack() { // from class: tlo.3
            @Override // com.huawei.wear.oversea.overseamanger.SatcomQueryCallBack
            public int onSuccess(SatcomCardSupportInfo satcomCardSupportInfo) {
                int iE = satcomCardSupportInfo.e();
                boolean zB = satcomCardSupportInfo.b();
                int iD = satcomCardSupportInfo.d();
                ReleaseLogUtil.d("R_WearHomeFeatureCard", "querySupportSatcom onSuccess returnCode:", Integer.valueOf(iE), ", isSupportSatcomCard:", Boolean.valueOf(zB), ", activityPeriod:", Integer.valueOf(iD));
                if (zB && iD != 0) {
                    tlo.this.m.e(true);
                    tlo.this.m.a(iD);
                    tlo tloVar = tlo.this;
                    tloVar.e(tloVar.m);
                }
                return iE;
            }

            @Override // com.huawei.wear.oversea.overseamanger.SatcomQueryCallBack
            public int onFail(SatcomCardSupportInfo satcomCardSupportInfo) {
                int iE = satcomCardSupportInfo.e();
                ReleaseLogUtil.e("R_WearHomeFeatureCard", "querySupportSatcom fail returnCode is:", Integer.valueOf(iE));
                return iE;
            }
        });
    }

    private boolean ao() {
        return !SharedPreferenceManager.b(String.valueOf(10008), "click_satcom_card", false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(final rgg rggVar) {
        this.mActivity.runOnUiThread(new Runnable() { // from class: tlr
            @Override // java.lang.Runnable
            public final void run() {
                this.f49336a.d(rggVar);
            }
        });
    }

    /* synthetic */ void d(rgg rggVar) {
        tlj tljVar = new tlj();
        tljVar.d(106);
        tljVar.a(this.mActivity.getString(R.string.IDS_device_wallet_satcom_card));
        tljVar.e(R.mipmap.ic_setup_list_satcom);
        tljVar.a(this.mActivity.h);
        tljVar.c("");
        tljVar.d(rggVar.a() == 1);
        tljVar.e(ao());
        c(tljVar);
    }

    private void c(tlj tljVar) {
        tlj tljVarE = e(tljVar.d());
        if (tljVarE == null) {
            b(tljVar);
        } else {
            tljVarE.a(tljVar.e());
            tljVarE.d(tljVar.f());
            tljVarE.e(tljVar.c());
            tljVarE.c(tljVar.b());
            tljVarE.e(tljVar.j());
            tljVarE.e(tljVar.a());
            tljVarE.a(tljVar.h());
        }
        this.q.a().post(new Runnable() { // from class: tme
            @Override // java.lang.Runnable
            public final void run() {
                this.f49348b.f();
            }
        });
    }

    /* synthetic */ void f() {
        this.t.notifyDataSetChanged();
    }

    private void x() {
        boolean zD = eey.d(this.mActivity.d, 79);
        ReleaseLogUtil.d("R_WearHomeFeatureCard", "addFindDeviceItem isSupportFindDevice:", Boolean.valueOf(zD));
        if (zD) {
            boolean zC = FindNetworkUtils.c(this.mActivity.d, this.mActivity);
            ReleaseLogUtil.d("R_WearHomeFeatureCard", "isSupportOfflineFindDevice:", Boolean.valueOf(zC));
            if (zC) {
                a(115, this.mActivity.getString(R.string.IDS_bolt_find_device), R.drawable.ic_setup_list_find_device, true);
            } else {
                a(115, this.mActivity.getString(R.string.IDS_bolt_find_device), R.drawable.ic_setup_list_find_device, this.mActivity.h);
            }
        }
    }

    private void ay() {
        boolean zD = eey.d(this.mActivity.d, 98);
        ReleaseLogUtil.d("R_WearHomeFeatureCard", "setRimSizeItem isSupportSetWheelSize:", Boolean.valueOf(zD));
        if (zD) {
            c(128, this.mActivity.getString(R.string.IDS_bolt_wheel_size), R.mipmap.ic_setup_list_rim, this.mActivity.h, med.c().a(this.mActivity.d));
        }
    }

    private boolean aq() {
        boolean z = false;
        if (Utils.o()) {
            LogUtil.a("WearHomeFeatureCard", "isIntelligentHomeShow version is oversea or googlePlay");
            return false;
        }
        boolean zAj = aj();
        boolean zIsSupportIntelligentHomeLinkage = this.mActivity.e.isSupportIntelligentHomeLinkage();
        ReleaseLogUtil.d("R_WearHomeFeatureCard", "intelligentHomeSwitch:", Boolean.valueOf(zAj), "; isSupportIntelligentHomeLinkage:", Boolean.valueOf(zIsSupportIntelligentHomeLinkage));
        if (CommonUtil.bu() && zIsSupportIntelligentHomeLinkage && zAj) {
            return true;
        }
        if (zIsSupportIntelligentHomeLinkage) {
            if (zAj) {
                z = true;
            } else {
                String strE = SharedPreferenceManager.e(this.mContext, String.valueOf(10008), "intelligent_home_switch");
                LogUtil.a("WearHomeFeatureCard", "devicePairSwitchFlag:", strE);
                if (strE != null && !TextUtils.isEmpty(strE)) {
                    z = Boolean.parseBoolean(strE);
                }
            }
        }
        LogUtil.a("WearHomeFeatureCard", "isIntelligentHomeVisible:", Boolean.valueOf(z));
        return z;
    }

    private boolean aj() {
        DeviceInfo deviceInfo = this.mActivity.d;
        if (deviceInfo == null || deviceInfo.getProductType() <= 71) {
            LogUtil.a("WearHomeFeatureCard", "getIntelligentHomeSwitchFromCloud not new product");
            return true;
        }
        String hiLinkDeviceId = deviceInfo.getHiLinkDeviceId();
        if (hiLinkDeviceId == null || hiLinkDeviceId.isEmpty()) {
            LogUtil.j("WearHomeFeatureCard", "getIntelligentHomeSwitchFromCloud HiLinkDeviceId is null");
            return false;
        }
        edl pluginInfoByUuid = ((DownloadManagerApi) Services.b("DownloadDeviceResource", DownloadManagerApi.class)).getPluginInfoByUuid(lvi.j(deviceInfo.getProductType()));
        if (pluginInfoByUuid == null || pluginInfoByUuid.i() == null) {
            LogUtil.j("WearHomeFeatureCard", "getIntelligentHomeSwitchFromCloud pluginInfo is null");
            return true;
        }
        edz edzVarI = pluginInfoByUuid.i();
        if (edzVarI == null) {
            LogUtil.j("WearHomeFeatureCard", "pluginInfoForWear is null");
        } else {
            try {
                String string = new JSONObject(edzVarI.e()).getString("ai_tips_product_" + hiLinkDeviceId);
                LogUtil.a("WearHomeFeatureCard", "hiLinkDeviceInfo is:", string);
                JSONObject jSONObject = new JSONObject(string);
                if (jSONObject.has("intelligent_home_switch")) {
                    return jSONObject.optBoolean("intelligent_home_switch");
                }
            } catch (JSONException unused) {
                LogUtil.e("WearHomeFeatureCard", "getIntelligentHomeSwitchFromCloud JSONException");
            }
        }
        return true;
    }

    private void az() {
        boolean zIsSupportHelp = this.mActivity.e.isSupportHelp();
        boolean z = zIsSupportHelp && lvi.a(this.mActivity.d.getProductType()).z();
        ReleaseLogUtil.d("R_WearHomeFeatureCard", "DEVICE_SETTING_HELP isSupportHelp:", Boolean.valueOf(zIsSupportHelp), " isSupportHelpUx:", Boolean.valueOf(z));
        if (z) {
            a(131, this.mActivity.getString(R.string.IDS_main_discovery_tab_service_help), R.drawable.ic_setup_list_guide, true);
            this.f.d();
        }
        boolean zD = lxc.d(this.mActivity.f26233a);
        ReleaseLogUtil.d("R_WearHomeFeatureCard", "SUPPORT_STUDENT_INFO isSupportFamilyModeUserInfo:", Boolean.valueOf(zD), " PairMode:", Integer.valueOf(mgb.d(this.mActivity.f26233a)));
        if (zD && lxc.a(this.mActivity.f26233a)) {
            a(56, this.mActivity.getString(R.string.IDS_startup_set_user_info), R.mipmap.ic_student_info, this.mActivity.h);
        }
    }

    private void ba() {
        if (!lwd.c().d()) {
            ReleaseLogUtil.d("R_WearHomeFeatureCard", "setCmccAi isChineseUseAndLanguage is false");
            return;
        }
        if (this.mActivity.d == null) {
            ReleaseLogUtil.d("R_WearHomeFeatureCard", "setCmccAi mCurrentDeviceInfo is null");
            return;
        }
        if (!lwd.c().e(this.mActivity.d, lvi.j(this.mActivity.d.getProductType()))) {
            ReleaseLogUtil.d("R_WearHomeFeatureCard", "setCmccAi isSupportCmccProduct is false");
        } else {
            ReleaseLogUtil.d("R_WearHomeFeatureCard", "setCmccAi success");
            a(102, this.mActivity.getString(R.string.IDS_lingxi_assistant), R.mipmap.ic_cmcc_ai, this.mActivity.h);
        }
    }

    private void ad() {
        s();
        t();
        bc();
        w();
        ReleaseLogUtil.d("R_WearHomeFeatureCard", "isSupportInnovationResearch: ", Boolean.valueOf(av()));
        if (Utils.o() || !av()) {
            return;
        }
        LogUtil.j("WearHomeFeatureCard", "show the innovation research card");
        a(125, this.mActivity.getString(R.string.IDS_hw_innovation_research), R.mipmap.ic_research, this.mActivity.h);
        af();
    }

    private boolean av() {
        if (!eey.d(this.mActivity.d, 100) && eey.d(this.mActivity.d, 59)) {
            return true;
        }
        DeviceInfo deviceInfoC = mgg.c("WearHomeFeatureCard");
        if ((this.mActivity.e.isSupportAtrialOperator() && !eei.d(deviceInfoC)) || this.mActivity.e.isSupportEcgAuth() || eey.d(this.mActivity.d, AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID) || eey.d(this.mActivity.d, 95)) {
            return true;
        }
        return this.mActivity.e.isSupportSleepBreathe();
    }

    private void w() {
        boolean zB = mbt.a().b(this.mActivity.d);
        ReleaseLogUtil.d("R_WearHomeFeatureCard", "show the Sleep Breath Pause isSupportSleepBreathe: ", Boolean.valueOf(zB));
        if (zB) {
            a(123, this.mActivity.getString(mbt.a().b() ? R.string.IDS_sleep_banner : R.string.IDS_sleep_apnea), R.mipmap.ic_sleep_right_nmpa, this.mActivity.h);
        }
    }

    private void s() {
        boolean z = false;
        boolean zIsSupportEcgAuth = this.mActivity.e != null ? this.mActivity.e.isSupportEcgAuth() : false;
        boolean z2 = eey.d(this.mActivity.d, 226) && eey.d(this.mActivity.d, 106) && ukb.g();
        if (eey.d(this.mActivity.d, 106) && fej.a("com.huawei.health_deviceFeature_config", "txt", "com.huawei.health.h5.ecgce")) {
            z = true;
        }
        ReleaseLogUtil.d("R_WearHomeFeatureCard", "addEcgItem isSupportEcgAuth:", Boolean.valueOf(zIsSupportEcgAuth), ", isSupportEcgAnalysis:", Boolean.valueOf(z), ", isSupportExtInfoSupportEcg:", Boolean.valueOf(z2));
        if (z || z2) {
            a(120, this.mActivity.getString(R.string.IDS_quick_app_ecg_analysis), R.mipmap.ic_ecg_analysis, this.mActivity.h);
        } else {
            if (!zIsSupportEcgAuth || Utils.o()) {
                return;
            }
            a(49, this.mActivity.getString(R.string.IDS_quick_app_ecg), R.mipmap.ic_setup_heart, this.mActivity.h);
        }
    }

    private void be() {
        a(43, this.mActivity.getString(R.string.IDS_hw_heart_index), R.drawable.ic_setup_list_smile, this.mActivity.h);
    }

    private boolean at() {
        if ((this.mActivity.e.isSupportCoreSleep() && loj.c(58)) || this.mActivity.e.isActivityReminder()) {
            return true;
        }
        if (this.mActivity.e.isSupportContinueHeartRate()) {
            LogUtil.a("WearHomeFeatureCard", "prepare add press continue heart rate item");
            return true;
        }
        if (this.mActivity.e.isSupportHeartRateEnable() && !this.mActivity.e.isSupportContinueHeartRate()) {
            LogUtil.a("WearHomeFeatureCard", "prepare add press cycle heart rate item");
            return true;
        }
        if (this.mActivity.e.isSupportPressAutoMonitor()) {
            LogUtil.a("WearHomeFeatureCard", "prepare add press auto monitor item");
            return true;
        }
        if (mbt.a().b(this.mActivity.d)) {
            return true;
        }
        return eey.d(this.mActivity.d, 29);
    }

    private boolean f(int i) {
        LogUtil.a("WearHomeFeatureCard", "removeGeneralSettingItem:", Integer.valueOf(i));
        synchronized (e) {
            Iterator<tlj> it = this.k.iterator();
            while (it.hasNext()) {
                if (it.next().d() == i) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }
    }

    private void a(int i, String str, int i2, boolean z) {
        c(i, str, i2, z, "");
    }

    private void c(int i, String str, int i2, boolean z, String str2) {
        tlj tljVar = new tlj();
        tljVar.d(i);
        tljVar.a(str);
        tljVar.e(i2);
        tljVar.a(z);
        tljVar.c(str2);
        b(tljVar);
    }

    private void b(tlj tljVar) {
        int iD = tljVar.d();
        LogUtil.a("WearHomeFeatureCard", "addGeneralSettingItem :", Integer.valueOf(iD), ",item:", tljVar.e());
        if (e(tljVar.d()) != null) {
            return;
        }
        synchronized (e) {
            this.k.add(tljVar);
            this.k.sort(Comparator.comparingInt(new ToIntFunction() { // from class: tmg
                @Override // java.util.function.ToIntFunction
                public final int applyAsInt(Object obj) {
                    return ((tlj) obj).d();
                }
            }));
            this.t.d(this.k);
        }
    }

    private void af() {
        if (!TextUtils.isEmpty(d)) {
            LogUtil.a("WearHomeFeatureCard", "Heart Vascular study AppMarket UrlHost is not empty.");
        } else {
            this.mActivity.u.execute(new Runnable() { // from class: tmd
                @Override // java.lang.Runnable
                public final void run() {
                    tlo.e();
                }
            });
        }
    }

    static /* synthetic */ void e() {
        String url = GRSManager.c(BaseApplication.getContext()).getUrl("domainAppgalleryCloudHuawei");
        d = url;
        LogUtil.d("WearHomeFeatureCard", "sHeartVascularStudyAppMarketUrlHost:", url);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public void b(int i) {
        if (!qrs.r() && i < this.k.size()) {
            tlj tljVar = this.k.get(i);
            int iD = tljVar.d();
            if (iD == 114) {
                rdt.d("live_notifications");
                this.f.u();
                return;
            }
            if (iD == 129) {
                rdt.d("smart_life");
                this.mActivity.a(IntelligentHomeLinkageActivity.class, 2);
                qrs.ae(this.mContext);
                return;
            }
            if (iD != 131) {
                switch (iD) {
                    case 101:
                        rdt.d("my_face");
                        this.f.p();
                        break;
                    case 102:
                        rdt.d("lingxi_assistant");
                        lwa.b(this.mActivity);
                        break;
                    case 103:
                        ak();
                        break;
                    default:
                        switch (iD) {
                            case 107:
                                this.f.m();
                                break;
                            case 108:
                                this.f.c();
                                break;
                            case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY /* 109 */:
                                this.f.n();
                                break;
                            case 110:
                                this.f.y();
                                SharedPreferenceManager.c("privacy_center", "bank_account", String.valueOf(System.currentTimeMillis()));
                                break;
                            case 111:
                                this.f.k();
                                break;
                            default:
                                switch (iD) {
                                    case AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID /* 116 */:
                                        this.f.r();
                                        break;
                                    case 117:
                                        rdt.d(HwExerciseConstants.JSON_NAME_WORKOUT_WEATHER);
                                        this.f.aa();
                                        break;
                                    case AgrConstant.HEALTH_AGREEMENT_CODE /* 118 */:
                                        rdt.d("health_monitoring");
                                        this.f.x();
                                        break;
                                    default:
                                        h(tljVar.d());
                                        break;
                                }
                                break;
                        }
                        break;
                }
                return;
            }
            this.f.o();
        }
    }

    private void ak() {
        if (tqp.d(this.mContext, this.mActivity.f, true)) {
            bh();
        } else {
            this.f.b();
        }
    }

    private void bh() {
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.mContext).a(this.mContext.getResources().getString(R.string.IDS_miss_sensitive_notification_message_new)).c(R.string.IDS_hw_health_user_profile_go_setting, new View.OnClickListener() { // from class: tln
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49329a.b(view);
            }
        }).a(R.string.IDS_main_btn_state_ignore, new View.OnClickListener() { // from class: tlq
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.d.d(view);
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    /* synthetic */ void b(View view) {
        this.mActivity.t = true;
        new ArrayList(16).add(this.mActivity.f26233a);
        if (this.mActivity.b("showMissSensitiveNotificationDialog")) {
            return;
        }
        ReleaseLogUtil.d("R_WearHomeFeatureCard", "unbindAndReconnectDevice mDeviceMac is ", CommonUtil.n(this.mActivity.f26233a));
        rdp.a(this.mActivity.f26233a, this.mActivity, this.mActivity.d.getDeviceBluetoothType());
    }

    /* synthetic */ void d(View view) {
        this.f.b();
    }

    private void h(int i) {
        if (i == 43) {
            rdt.d("heart_index");
            this.f.l();
            return;
        }
        if (i == 49) {
            rdt.d("ecg");
            this.f.g();
            return;
        }
        if (i == 53) {
            this.f.a(this.o);
            return;
        }
        if (i == 56) {
            this.f.w();
            return;
        }
        if (i == 105) {
            rdt.d("guardian_service");
            this.f.d(this.h);
            return;
        }
        if (i == 119) {
            this.f.q();
            return;
        }
        if (i != 130) {
            switch (i) {
                case 126:
                    this.f.t();
                    break;
                case 127:
                    rdt.d("quick_reply");
                    this.f.s();
                    break;
                case 128:
                    rdt.d("wheel_size");
                    this.f.a(this.mActivity.d);
                    break;
                default:
                    g(i);
                    break;
            }
            return;
        }
        LogUtil.a("WearHomeFeatureCard", "ID_SUPPORT_WECHAT_DEVICE_BIND gotoWechat");
        this.mActivity.c().c(this.mActivity);
        rdt.d("wechat_devices");
    }

    private void g(int i) {
        if (i == 104) {
            rdt.d("earbuds");
            this.f.a(this.mActivity.d, 104, false);
            return;
        }
        if (i == 106) {
            rdt.d("beidou_satellite_messaging");
            this.f.ad();
            return;
        }
        if (i == 115) {
            rdt.d("find_device");
            if (eey.d(this.mActivity.d, 112)) {
                this.f.d(this.mActivity.d);
                return;
            } else {
                this.f.b(this.mActivity.d);
                return;
            }
        }
        if (i == 120) {
            rdt.d("electrocardiogram");
            this.f.i();
            return;
        }
        if (i == 112) {
            rdt.d("map");
            this.f.a(this.mActivity.d, new OnCreateResultListener() { // from class: tma
                @Override // com.huawei.maps.offlinedata.health.init.OnCreateResultListener
                public final void onCreateResult(boolean z) {
                    this.f49344a.d(z);
                }
            });
            return;
        }
        if (i != 113) {
            switch (i) {
                case 122:
                    rdt.d("pulse_wave_arrhythmia_analysis");
                    this.f.v();
                    break;
                case 123:
                    rdt.d("sleep_apnea");
                    if (this.mActivity != null) {
                        LogUtil.a("WearHomeFeatureCard", "setOnItemClick sleep breath pause");
                        kjy.b().startOsaH5(this.mActivity, "Device_0001");
                    }
                    break;
                case 124:
                    rdt.d("arterial_stiffness_detection");
                    this.f.f();
                    break;
                case 125:
                    rdt.d("research");
                    this.f.h();
                    break;
                default:
                    LogUtil.j("WearHomeFeatureCard", "setOnItemClick default");
                    break;
            }
            return;
        }
        rdt.d(HiHealthActivities.OUTDOOR_ADVENTURE);
        this.f.j();
    }

    /* synthetic */ void d(boolean z) {
        this.n = z;
    }

    public void q() {
        if (this.mActivity == null) {
            LogUtil.j("WearHomeFeatureCard", "updateWheelSize mActivity is null");
            return;
        }
        if (this.mActivity.d == null) {
            LogUtil.j("WearHomeFeatureCard", "updateWheelSize mCurrentDeviceInfo is null");
            return;
        }
        for (tlj tljVar : this.k) {
            if (tljVar.d() == 128) {
                LogUtil.a("WearHomeFeatureCard", "update bolt wheel size");
                tljVar.c(med.c().a(this.mActivity.d));
                n(this.mActivity.d.getDeviceConnectState());
                return;
            }
        }
    }

    private void r() {
        List<String> fieldList = this.mActivity.d.getFieldList();
        if (fieldList == null || fieldList.isEmpty()) {
            LogUtil.a("WearHomeFeatureCard", "addExclusiveGuardianItem not support exclusive guardian");
            return;
        }
        bm();
        if (CommonUtil.ab(this.mActivity)) {
            ab();
        }
    }

    private void bm() {
        String strE = tqp.e(this.mActivity, this.mActivity.d.getDeviceIdentify(), "exclusiveGuardStatus");
        this.j = strE;
        ReleaseLogUtil.d("R_WearHomeFeatureCard", "updateStatusFromLocal mExclusiveGuardianLocalStatus = ", strE);
        String str = this.j;
        this.h = str;
        if ("1".equals(str)) {
            b(105, this.mActivity.getString(R.string.IDS_guardian_service), R.mipmap.ic_guardian_pending, this.mActivity.h, this.mActivity.getString(R.string.IDS_guardian_status_pending));
            return;
        }
        if ("2".equals(this.h)) {
            b(105, this.mActivity.getString(R.string.IDS_guardian_service), R.mipmap.ic_guardian_pending, this.mActivity.h, this.mActivity.getString(R.string.IDS_guardian_status_to_be_signed));
            return;
        }
        if ("3".equals(this.h)) {
            String strE2 = tqp.e(this.mActivity, this.mActivity.d.getDeviceIdentify(), "exclusiveGuardDoctorImgUrl");
            this.f49331b = strE2;
            LogUtil.a("WearHomeFeatureCard", "updateStatusFromLocal mDoctorImgLocalUrl = ", strE2);
            String str2 = this.f49331b;
            if (str2 == null) {
                str2 = "";
            }
            this.f49331b = str2;
            this.f49332c = str2;
            b(105, this.mActivity.getString(R.string.IDS_guardian_service), R.mipmap.ic_guardian_guarded, this.mActivity.h, "");
            return;
        }
        LogUtil.j("WearHomeFeatureCard", "updateStatusFromLocal else branch");
    }

    private void ab() {
        LogUtil.a("WearHomeFeatureCard", "getDeviceBenefits");
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi == null) {
            LogUtil.j("WearHomeFeatureCard", "getDeviceBenefits payApi is null");
        } else {
            payApi.getDeviceBenefits(qhu.d(this.mActivity.d, DeviceBenefitQueryParam.DeviceBenefitType.DEVICE_BENEFIT_TYPE_INBOX, true), new IBaseResponseCallback() { // from class: tlv
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.f49340c.c(i, obj);
                }
            });
        }
    }

    /* synthetic */ void c(int i, Object obj) {
        LogUtil.a("WearHomeFeatureCard", "getDeviceBenefits errorCode = ", Integer.valueOf(i), ", objectData = ", obj);
        if (i != 0 || !(obj instanceof DeviceBenefits)) {
            LogUtil.j("WearHomeFeatureCard", "getDeviceBenefits fail");
        } else {
            LogUtil.d("WearHomeFeatureCard", "getDeviceBenefits objectData = ", HiJsonUtil.d(obj));
            c((DeviceBenefits) obj);
        }
    }

    private void c(DeviceBenefits deviceBenefits) {
        List<DeviceInboxInfo> inboxInfos = deviceBenefits.getInboxInfos();
        if (inboxInfos == null || inboxInfos.isEmpty()) {
            LogUtil.j("WearHomeFeatureCard", "handleDeviceBenefitsResult inboxInfoList is null or empty");
            return;
        }
        boolean z = false;
        for (DeviceInboxInfo deviceInboxInfo : inboxInfos) {
            if (tqp.b(deviceInboxInfo)) {
                if (deviceInboxInfo.getActiveStatus() == 1) {
                    bi();
                    return;
                } else if (deviceInboxInfo.getActiveStatus() == 2) {
                    z = true;
                } else {
                    LogUtil.j("WearHomeFeatureCard", "handleDeviceBenefitsResult else branch");
                }
            }
        }
        ReleaseLogUtil.d("R_WearHomeFeatureCard", "handleDeviceBenefitsResult isActiveStatus = ", Boolean.valueOf(z));
        if (z) {
            ax();
        }
    }

    private void ax() {
        LogUtil.a("WearHomeFeatureCard", "queryBenefitInfo");
        PayApi payApi = (PayApi) Services.d("TradeService", PayApi.class);
        if (payApi == null) {
            LogUtil.j("WearHomeFeatureCard", "queryBenefitInfo payApi is null");
        } else {
            payApi.queryBenefitInfo(9, "", new IBaseResponseCallback() { // from class: tmj
                @Override // com.huawei.hwbasemgr.IBaseResponseCallback
                /* JADX INFO: renamed from: onResponse */
                public final void a(int i, Object obj) {
                    this.d.a(i, obj);
                }
            });
        }
    }

    /* synthetic */ void a(int i, Object obj) {
        LogUtil.a("WearHomeFeatureCard", "queryBenefitInfo errorCode = ", Integer.valueOf(i), ", objectData = ", obj);
        if (i != 0 || !(obj instanceof RepeatResourceBenefitInfo)) {
            LogUtil.j("WearHomeFeatureCard", "queryBenefitInfo fail");
            return;
        }
        LogUtil.a("WearHomeFeatureCard", "queryBenefitInfo objectData = ", HiJsonUtil.d(obj));
        RepeatResourceBenefitInfo repeatResourceBenefitInfo = (RepeatResourceBenefitInfo) obj;
        long nowTime = repeatResourceBenefitInfo.getNowTime() != 0 ? repeatResourceBenefitInfo.getNowTime() : System.currentTimeMillis();
        LogUtil.a("WearHomeFeatureCard", "queryBenefitInfo currentTime = ", Long.valueOf(nowTime));
        if (repeatResourceBenefitInfo.getExpireTime().longValue() >= nowTime) {
            ah();
        } else {
            bp();
        }
    }

    private void ah() {
        LogUtil.a("WearHomeFeatureCard", "getDoctorBasicInfo");
        ugs.e().getDoctorBasicInfo(new DataCallback() { // from class: tlo.2
            @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback
            public void onFailure(int i, String str) {
                LogUtil.j("WearHomeFeatureCard", "getDoctorBasicInfo errorCode = ", i + ", errorInfo = ", str);
                if (CommonUtil.ab(tlo.this.mActivity)) {
                    tlo.this.bp();
                }
            }

            @Override // com.huawei.ui.main.stories.fitness.activity.pressuremeasure.cloud.callback.DataCallback
            public void onSuccess(JSONObject jSONObject) {
                LogUtil.a("WearHomeFeatureCard", "getDoctorBasicInfo data = " + jSONObject.toString());
                try {
                    if (jSONObject.getInt("resultCode") == 0) {
                        if (TextUtils.isEmpty(jSONObject.optString("doctorId"))) {
                            tlo.this.bp();
                            LogUtil.a("WearHomeFeatureCard", "getDoctorBasicInfo doctorId is empty");
                            return;
                        }
                        String strOptString = jSONObject.optString("doctorHeadIcon");
                        tlo.this.f49332c = "";
                        if (!TextUtils.isEmpty(strOptString)) {
                            tlo.this.f49332c = strOptString;
                        }
                        tlo.this.bk();
                    }
                } catch (JSONException unused) {
                    LogUtil.e("WearHomeFeatureCard", "getDoctorBasicInfo JSONException");
                }
            }
        });
    }

    private void bi() {
        this.h = "1";
        this.f49332c = "";
        if ("1".equals(this.j)) {
            LogUtil.a("WearHomeFeatureCard", "updatePendingStatus status not change, return");
            return;
        }
        LogUtil.a("WearHomeFeatureCard", "updatePendingStatus");
        tqp.e(this.mActivity, this.mActivity.d.getDeviceIdentify(), "exclusiveGuardDoctorImgUrl", "");
        tqp.e(this.mActivity, this.mActivity.d.getDeviceIdentify(), "exclusiveGuardStatus", this.h);
        this.mActivity.runOnUiThread(new Runnable() { // from class: tlu
            @Override // java.lang.Runnable
            public final void run() {
                this.f49339a.k();
            }
        });
    }

    /* synthetic */ void k() {
        b(105, this.mActivity.getString(R.string.IDS_guardian_service), R.mipmap.ic_guardian_pending, this.mActivity.h, this.mActivity.getString(R.string.IDS_guardian_status_pending));
        bo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bp() {
        this.h = "2";
        this.f49332c = "";
        if ("2".equals(this.j)) {
            LogUtil.a("WearHomeFeatureCard", "updateToBeSignedStatus status not change, return");
            return;
        }
        if (this.mActivity == null || this.mActivity.isDestroyed() || this.mActivity.isFinishing()) {
            LogUtil.j("WearHomeFeatureCard", "updateToBeSignedStatus mActivity is null or destroyed ");
            return;
        }
        DeviceInfo deviceInfo = this.mActivity.d;
        if (deviceInfo == null) {
            LogUtil.j("WearHomeFeatureCard", "updateToBeSignedStatus deviceInfo is null");
            return;
        }
        String deviceIdentify = deviceInfo.getDeviceIdentify();
        LogUtil.a("WearHomeFeatureCard", "updateToBeSignedStatus");
        tqp.e(this.mActivity, deviceIdentify, "exclusiveGuardDoctorImgUrl", "");
        tqp.e(this.mActivity, deviceIdentify, "exclusiveGuardStatus", this.h);
        this.mActivity.runOnUiThread(new Runnable() { // from class: tmm
            @Override // java.lang.Runnable
            public final void run() {
                this.d.o();
            }
        });
    }

    /* synthetic */ void o() {
        b(105, this.mActivity.getString(R.string.IDS_guardian_service), R.mipmap.ic_guardian_pending, this.mActivity.h, this.mActivity.getString(R.string.IDS_guardian_status_to_be_signed));
        bo();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void bk() {
        this.h = "3";
        if ("3".equals(this.j) && this.f49332c.equals(this.f49331b)) {
            LogUtil.a("WearHomeFeatureCard", "updateGuardedStatus status not change, return");
            return;
        }
        LogUtil.a("WearHomeFeatureCard", "updateGuardedStatus");
        tqp.e(this.mActivity, this.mActivity.d.getDeviceIdentify(), "exclusiveGuardDoctorImgUrl", this.f49332c);
        tqp.e(this.mActivity, this.mActivity.d.getDeviceIdentify(), "exclusiveGuardStatus", this.h);
        this.mActivity.runOnUiThread(new Runnable() { // from class: tlt
            @Override // java.lang.Runnable
            public final void run() {
                this.e.g();
            }
        });
    }

    /* synthetic */ void g() {
        b(105, this.mActivity.getString(R.string.IDS_guardian_service), R.mipmap.ic_guardian_guarded, this.mActivity.h, "");
        bo();
    }

    private void b(int i, String str, int i2, boolean z, String str2) {
        tlj tljVar = new tlj();
        tljVar.d(i);
        tljVar.a(str);
        tljVar.e(i2);
        tljVar.a(z);
        tljVar.c(str2);
        tljVar.e("1".equals(this.h));
        tljVar.e(this.f49332c);
        c(tljVar);
    }

    public void e(DeviceInfo deviceInfo, int i, boolean z) {
        LogUtil.a("WearHomeFeatureCard", "showEarphonePairGuide in. ");
        this.f.a(deviceInfo, i, z);
    }

    public boolean b() {
        return this.f.e();
    }

    private boolean as() {
        boolean zA = Utils.a(this.mContext);
        LogUtil.a("WearHomeFeatureCard", "isKoreaVersion is:", Boolean.valueOf(zA));
        return zA;
    }
}
