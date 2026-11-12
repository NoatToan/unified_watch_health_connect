package defpackage;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTableDecoder;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.huawei.haf.localbroadcastmanager.LocalBroadcastManager;
import com.huawei.haf.threadpool.ThreadPoolManager;
import com.huawei.health.devicemgr.business.entity.DeviceInfo;
import com.huawei.hwbasemgr.ResponseCallback;
import com.huawei.hwcloudmodel.agreement.AgrConstant;
import com.huawei.hwcommonmodel.application.BaseApplication;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.WatchFaceManager;
import com.huawei.hwdevice.mainprocess.mgr.hwmywatchfacemgr.type.weardevice.WatchFaceParamsResult;
import com.huawei.hwdevice.outofprocess.mgr.device.CloudDeviceInfo;
import com.huawei.hwdevice.outofprocess.util.HwWatchFaceUtil;
import com.huawei.hwlogsmodel.LogUtil;
import com.huawei.login.ui.login.LoginInit;
import com.huawei.openalliance.ad.constant.CreativeType;
import com.huawei.ui.commonui.dialog.NoTitleCustomAlertDialog;
import com.huawei.ui.commonui.healthtextview.HealthTextView;
import com.huawei.ui.device.activity.pairing.DevicePairGuideActivity;
import com.huawei.ui.device.interactors.DeviceSettingsInteractors;
import com.huawei.ui.homewear21.R;
import com.huawei.ui.homewear21.home.card.WearHomeBaseCard;
import com.huawei.ui.homewear21.home.holder.WearHomeWatchFaceHolder;
import com.huawei.watchface.mvp.ui.activity.PrivacyStatementActivity;
import health.compact.a.CommonUtil;
import health.compact.a.GRSManager;
import health.compact.a.LanguageUtil;
import health.compact.a.SharedPreferenceManager;
import health.compact.a.Utils;
import health.compact.a.hwlogsmodel.ReleaseLogUtil;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: classes18.dex */
public class tod extends WearHomeBaseCard {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<Integer, Integer> f49419a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private tfv f49421c;
    private Activity d;
    private String f;
    private String k;
    private View n;
    private WearHomeWatchFaceHolder l = null;
    private boolean e = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f49420b = false;
    private View.OnClickListener g = new View.OnClickListener() { // from class: toh
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.f49438c.b(view);
        }
    };
    private View.OnClickListener h = new View.OnClickListener() { // from class: toi
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.e.d(view);
        }
    };
    private final BroadcastReceiver i = new BroadcastReceiver() { // from class: tod.4
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            ReleaseLogUtil.d("WearHomeWatchFaceCard", "mNonLocalBroadcastReceiver intent:", intent.getAction());
            if (PrivacyStatementActivity.ACTION_WATCHFACE_SERVICE_DISABLE.equals(intent.getAction())) {
                if (Utils.k()) {
                    return;
                }
                mhs.a().setSwitchSetting("watch_face_privacy_service_status", "2", null);
                return;
            }
            LogUtil.j("WearHomeWatchFaceCard", "mNonLocalBroadcastReceiver()  intent:", intent.getAction());
        }
    };
    private final BroadcastReceiver j = new BroadcastReceiver() { // from class: tod.5
        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            LogUtil.a("WearHomeWatchFaceCard", "onReceive mWatchFaceReceiver action is ", action);
            if (tod.this.m() && tod.this.l() && "com.huawei.watchface.action.ACTION_WATCHFACE_LIST".equals(action)) {
                mca.a(intent);
                tod todVar = tod.this;
                DeviceInfo deviceInfoE = todVar.e(todVar.mDeviceMac);
                if (deviceInfoE == null || deviceInfoE.getDeviceConnectState() == 2) {
                    tod.this.q();
                } else {
                    LogUtil.j("WearHomeWatchFaceCard", "deviceInfo is not connected");
                }
            }
        }
    };

    static {
        HashMap map = new HashMap();
        f49419a = map;
        map.put(94, 94);
        map.put(86, 95);
        map.put(87, 95);
        map.put(100, 95);
        map.put(102, 95);
        map.put(112, 95);
        map.put(Integer.valueOf(CreativeType.WINDOW_IMAGE_WITH_DOWNLOAD_BUTTON), 95);
        map.put(108, 60);
        map.put(Integer.valueOf(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY), 60);
        map.put(Integer.valueOf(AgrConstant.HEALTH_AGREEMENT_CODE), 95);
        map.put(115, 95);
        map.put(Integer.valueOf(AppInfoTableDecoder.APPLICATION_INFORMATION_TABLE_ID), 95);
    }

    /* synthetic */ void b(View view) {
        LogUtil.a("WearHomeWatchFaceCard", "Enter watchFaceClick Listener");
        this.mCurrentDeviceInfo = e(this.mDeviceMac);
        if (this.mCurrentDeviceInfo != null && ((this.mCurrentDeviceInfo.getDeviceConnectState() == 2 || this.mCurrentDeviceInfo.getDeviceConnectState() == 1) && maq.b().c(this.mDeviceMac) == 6)) {
            LogUtil.a("WearHomeWatchFaceCard", "Enter watchFaceClick Listener ，wear device is OTA");
            o();
            return;
        }
        if (this.mCurrentDeviceInfo != null && this.mCurrentDeviceInfo.getDeviceConnectState() != 2) {
            LogUtil.j("WearHomeWatchFaceCard", "mWatchFaceClick mCurrentDeviceInfo not DEVICE_CONNECTED, isTop:", Boolean.valueOf(mig.d(lut.a().d(), this.mCurrentDeviceInfo)));
        }
        LogUtil.a("WearHomeWatchFaceCard", "click goto WatchFace");
        a(-1);
        HwWatchFaceUtil.d().a(2);
    }

    /* synthetic */ void d(View view) {
        LogUtil.a("WearHomeWatchFaceCard", "Enter watchFaceClick Listener");
        this.mCurrentDeviceInfo = e(this.mDeviceMac);
        if (this.mCurrentDeviceInfo != null && ((this.mCurrentDeviceInfo.getDeviceConnectState() == 2 || this.mCurrentDeviceInfo.getDeviceConnectState() == 1) && maq.b().c(this.mDeviceMac) == 6)) {
            LogUtil.a("WearHomeWatchFaceCard", "Enter watchFaceClick Listener ，wear device is OTAing");
            o();
            return;
        }
        if (this.mCurrentDeviceInfo != null && this.mCurrentDeviceInfo.getDeviceConnectState() != 2) {
            LogUtil.j("WearHomeWatchFaceCard", "mWatchFacePositionClick mCurrentDeviceInfo not DEVICE_CONNECTED, isTop:", Boolean.valueOf(mig.d(lut.a().d(), this.mCurrentDeviceInfo)));
        }
        LogUtil.a("WearHomeWatchFaceCard", "click goto WatchFace");
        if (view != null) {
            a(((Integer) view.getTag()).intValue());
            HwWatchFaceUtil.d().a(3);
        }
    }

    public tod(Activity activity) {
        LogUtil.a("WearHomeWatchFaceCard", "new WearHomeWatchFaceCard construct");
        this.d = activity;
        this.mContext = activity;
    }

    public tod(Activity activity, String str) {
        d(activity, str);
        LogUtil.a("WearHomeWatchFaceCard", "TESTCARD new WearHomeWatchFaceCard mDeviceMac: ", CommonUtil.n(this.mDeviceMac));
    }

    public void d(Activity activity, String str) {
        this.d = activity;
        this.mContext = activity;
        this.mDeviceMac = str;
        this.mCurrentDeviceInfo = e(this.mDeviceMac);
        this.mDeviceCapability = DeviceSettingsInteractors.e(BaseApplication.getContext()).e(this.mDeviceMac);
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public RecyclerView.ViewHolder getCardViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.n = layoutInflater.inflate(R.layout.wear_home_watch_face_layout, viewGroup, false);
        this.f49420b = false;
        k();
        return this.l;
    }

    public View b(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        this.n = layoutInflater.inflate(R.layout.watch_face_market_layout, viewGroup, false);
        this.f49420b = true;
        k();
        return this.n;
    }

    public void a(View view) {
        View viewFindViewById = view.findViewById(R.id.card_parent);
        this.n = viewFindViewById;
        RelativeLayout relativeLayout = (RelativeLayout) viewFindViewById.findViewById(R.id.card_watchface_view);
        if (relativeLayout.getLayoutParams() instanceof LinearLayout.LayoutParams) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) relativeLayout.getLayoutParams();
            layoutParams.setMargins(layoutParams.leftMargin, 0, layoutParams.rightMargin, layoutParams.bottomMargin);
        }
        k();
    }

    public void e() {
        WearHomeWatchFaceHolder wearHomeWatchFaceHolder = this.l;
        if (wearHomeWatchFaceHolder == null || wearHomeWatchFaceHolder.d() == null) {
            return;
        }
        if (this.f49420b) {
            this.l.e().setVisibility(0);
            this.l.a().setPadding(0, qrs.d(this.mContext, 12.0f), 0, qrs.d(this.mContext, 12.0f));
            this.l.g().setPadding(0, qrs.d(this.mContext, 12.0f), 0, qrs.d(this.mContext, 12.0f));
        }
        this.l.d().setVisibility(8);
    }

    public void a() {
        WearHomeWatchFaceHolder wearHomeWatchFaceHolder = this.l;
        if (wearHomeWatchFaceHolder == null || wearHomeWatchFaceHolder.d() == null) {
            return;
        }
        this.l.b().setVisibility(8);
    }

    private void k() {
        WearHomeWatchFaceHolder wearHomeWatchFaceHolder = new WearHomeWatchFaceHolder(this.n, this.f49420b);
        this.l = wearHomeWatchFaceHolder;
        wearHomeWatchFaceHolder.g().setOnClickListener(qji.d(new View.OnClickListener() { // from class: tol
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f49439a.e(view);
            }
        }, this.d, true, ""));
        h();
    }

    /* synthetic */ void e(View view) {
        this.g.onClick(view);
    }

    public void b(DeviceInfo deviceInfo) {
        if (deviceInfo == null || (deviceInfo instanceof CloudDeviceInfo)) {
            if (this.l == null) {
                LogUtil.j("WearHomeWatchFaceCard", "updateDevice fail mWearHomeWatchFaceHolder is null");
                return;
            }
            LogUtil.j("WearHomeWatchFaceCard", "updateDevice fail deviceInfo is null");
            this.l.b().setVisibility(8);
            this.mDeviceMac = null;
            this.mCurrentDeviceInfo = null;
            this.mDeviceCapability = null;
            return;
        }
        if (!mig.d(this.mCurrentDeviceInfo, deviceInfo)) {
            LogUtil.a("WearHomeWatchFaceCard", "new deviceInfo name:", deviceInfo.getDeviceName());
            g();
        }
        this.mDeviceMac = deviceInfo.getDeviceIdentify();
        this.mCurrentDeviceInfo = deviceInfo;
        this.mDeviceCapability = DeviceSettingsInteractors.e(BaseApplication.getContext()).e(this.mDeviceMac);
        h();
    }

    private void g() {
        for (int i = 0; i < 6; i++) {
            RelativeLayout relativeLayout = (RelativeLayout) qsp.a(this.n, BaseApplication.getContext().getResources().getIdentifier("rl_watchface" + i, "id", BaseApplication.getContext().getPackageName()));
            if (relativeLayout != null) {
                LogUtil.a("WearHomeWatchFaceCard", "relativeLayout index:", Integer.valueOf(i));
                relativeLayout.setVisibility(8);
            }
        }
        if (this.f49420b) {
            this.l.e().setVisibility(0);
            this.l.a().setPadding(0, qrs.d(this.mContext, 12.0f), 0, qrs.d(this.mContext, 12.0f));
            this.l.g().setPadding(0, qrs.d(this.mContext, 12.0f), 0, qrs.d(this.mContext, 12.0f));
        }
        this.l.d().setVisibility(8);
    }

    private void h() {
        if (this.d == null || this.l == null) {
            LogUtil.j("WearHomeWatchFaceCard", "initView fail");
            return;
        }
        LogUtil.a("WearHomeWatchFaceCard", "isDeviceWatchFaceNewDelegate = ", Boolean.valueOf(this.f49420b));
        if (this.f49420b) {
            this.l.c().setText(this.mContext.getResources().getString(R.string.IDS_tab_device_recommend));
            d(R.drawable.ic_public_arrow_left_arkui, R.drawable.ic_public_arrow_right_arkui);
        } else {
            this.l.c().setText(this.mContext.getResources().getString(R.string.IDS_user_profile_more_new));
            d(R.drawable.common_ui_arrow_left, R.drawable.common_ui_arrow_right);
            this.l.c().setAlpha(1.0f);
        }
        this.mDeviceCapability = DeviceSettingsInteractors.e(BaseApplication.getContext()).e(this.mDeviceMac);
        if (this.mDeviceCapability == null && this.mCurrentDeviceInfo != null && !tqp.e(this.mCurrentDeviceInfo.getProductType(), this.mDeviceMac)) {
            LogUtil.j("WearHomeWatchFaceCard", "mDeviceCapability is null");
            this.l.b().setVisibility(8);
            return;
        }
        if (this.mCurrentDeviceInfo != null && this.mCurrentDeviceInfo.getPowerSaveModel() == 1 && tqp.e(this.mCurrentDeviceInfo.getProductType())) {
            LogUtil.j("WearHomeWatchFaceCard", "getPowerSaveModel is power state");
            this.l.b().setVisibility(8);
            return;
        }
        this.mCurrentDeviceInfo = e(this.mDeviceMac);
        if (this.mCurrentDeviceInfo == null) {
            LogUtil.j("WearHomeWatchFaceCard", "initView mCurrentDeviceInfo == null");
            return;
        }
        if ((this.mCurrentDeviceInfo.getPowerSaveModel() != 1 || !tqp.e(this.mCurrentDeviceInfo.getProductType())) && m()) {
            j();
        } else {
            this.l.b().setVisibility(8);
        }
        if (this.mCurrentDeviceInfo.getDeviceConnectState() == 2 || this.f49420b) {
            return;
        }
        e();
    }

    private void d(int i, int i2) {
        if (LanguageUtil.ba(BaseApplication.getContext())) {
            this.l.h().setImageResource(i);
        } else {
            this.l.h().setImageResource(i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public DeviceInfo e(String str) {
        if (this.f49420b) {
            DeviceInfo deviceInfoB = lut.a().b(str);
            if (deviceInfoB instanceof CloudDeviceInfo) {
                return null;
            }
            return deviceInfoB;
        }
        return tfn.a().a(str);
    }

    private void j() {
        ThreadPoolManager.c().execute(new Runnable() { // from class: toj
            @Override // java.lang.Runnable
            public final void run() {
                this.d.c();
            }
        });
    }

    /* synthetic */ void c() {
        String strD = GRSManager.c(this.mContext).d();
        Map<String, String> mapE = mca.e(strD);
        this.f = mapE.get("watchFaceH5");
        this.k = mapE.get("watchFace");
        ReleaseLogUtil.d("HWWEAR_WearHomeWatchFaceCard", "countryCode:", strD, ",watchFaceH5New:", CommonUtil.e(this.f, "/", 2), ",watchFace:", CommonUtil.e(this.k, "/", 2), ",watchFaceTop:");
        this.d.runOnUiThread(new Runnable() { // from class: too
            @Override // java.lang.Runnable
            public final void run() {
                this.f49447c.d();
            }
        });
    }

    /* synthetic */ void d() {
        if (!this.e) {
            n();
            tqp.e(this.j, "com.huawei.watchface.action.ACTION_WATCHFACE_LIST");
            LogUtil.a("WearHomeWatchFaceCard", "initView() mIsRegistration ", Boolean.valueOf(this.e));
            this.e = true;
        }
        LogUtil.a("WearHomeWatchFaceCard", "onUiCreate startLoadingView");
        r();
    }

    private void n() {
        LogUtil.a("WearHomeWatchFaceCard", "enter registerNonLocalBroadcastReceiver");
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(PrivacyStatementActivity.ACTION_WATCHFACE_SERVICE_DISABLE);
        LocalBroadcastManager localBroadcastManager = LocalBroadcastManager.getInstance();
        if (localBroadcastManager != null) {
            localBroadcastManager.registerReceiver(this.i, intentFilter);
        }
    }

    private void s() {
        try {
            LocalBroadcastManager.getInstance().unregisterReceiver(this.i);
        } catch (IllegalArgumentException e) {
            LogUtil.e("WearHomeWatchFaceCard", "unRegisterNonLocalBroadcastReceiver Exception: ", e.getMessage());
        }
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public void deviceConnectionChange(int i) {
        h();
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public void onResume() {
        h();
    }

    @Override // com.huawei.ui.homewear21.home.card.WearHomeBaseCard
    public void onDestroy() {
        this.e = false;
        s();
        tqp.a(this.j);
    }

    public void b() {
        DeviceInfo deviceInfoE = e(this.mDeviceMac);
        if (deviceInfoE == null || deviceInfoE.getDeviceConnectState() != 2) {
            LogUtil.j("WearHomeWatchFaceCard", "deviceInfo is not connected");
            return;
        }
        LogUtil.a("WearHomeWatchFaceCard", "have DeviceInfo");
        DeviceSettingsInteractors deviceSettingsInteractorsE = DeviceSettingsInteractors.e(BaseApplication.getContext());
        if (deviceSettingsInteractorsE == null || deviceSettingsInteractorsE.d() == null) {
            return;
        }
        LogUtil.a("WearHomeWatchFaceCard", "deviceInter.capabilityNegotiation() != null");
        e(deviceSettingsInteractorsE, deviceInfoE);
    }

    private void e(DeviceSettingsInteractors deviceSettingsInteractors, DeviceInfo deviceInfo) {
        if (deviceSettingsInteractors.d().isSupportWatchFace() && SharedPreferenceManager.g(this.mContext).equals(deviceInfo.getDeviceIdentify())) {
            LogUtil.a("WearHomeWatchFaceCard", "device.capabilityNegotiation().isSupportWatchFace() is true");
            if (SharedPreferenceManager.j(BaseApplication.getContext()) && SharedPreferenceManager.h(this.mContext, HwWatchFaceUtil.d().e())) {
                LogUtil.a("WearHomeWatchFaceCard", "data and Language is same");
                mca.a();
                DeviceInfo deviceInfoE = e(this.mDeviceMac);
                if (deviceInfoE != null && deviceInfoE.getDeviceConnectState() != 2) {
                    LogUtil.j("WearHomeWatchFaceCard", "deviceInfo is not connected");
                } else {
                    q();
                }
            }
        }
    }

    public void a(DeviceInfo deviceInfo) {
        WearHomeWatchFaceHolder wearHomeWatchFaceHolder;
        int i = qrs.af(this.mContext) ? 6 : 3;
        d(i);
        if (deviceInfo == null || !mig.d(lut.a().d(), deviceInfo) || !m() || (wearHomeWatchFaceHolder = this.l) == null || wearHomeWatchFaceHolder.d() == null || this.l.d().getVisibility() != 0) {
            return;
        }
        if (i == 6 && mca.e() < 6) {
            b(deviceInfo);
        } else {
            q();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q() {
        if (this.mCurrentDeviceInfo == null) {
            LogUtil.j("WearHomeWatchFaceCard", "updateWatchFace failed for mCurrentDeviceInfo is null");
        } else {
            WatchFaceManager.getInstance().queryWatchFaceInfo(this.mCurrentDeviceInfo.getDeviceIdentify(), new AnonymousClass1());
        }
    }

    /* JADX INFO: renamed from: tod$1, reason: invalid class name */
    class AnonymousClass1 implements ResponseCallback<WatchFaceParamsResult> {
        AnonymousClass1() {
        }

        @Override // com.huawei.hwbasemgr.ResponseCallback
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onResponse(int i, final WatchFaceParamsResult watchFaceParamsResult) {
            if (i == 0 && watchFaceParamsResult != null) {
                tod.this.d.runOnUiThread(new Runnable() { // from class: toq
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f49448a.b(watchFaceParamsResult);
                    }
                });
            } else {
                ReleaseLogUtil.e("DEVMGR_WearHomeWatchFaceCard", "setMyWatchView queryWatchFaceInfo status is: ", Integer.valueOf(i));
            }
        }

        /* synthetic */ void b(WatchFaceParamsResult watchFaceParamsResult) {
            tod.this.e(watchFaceParamsResult);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e(WatchFaceParamsResult watchFaceParamsResult) {
        int screenHeight = watchFaceParamsResult.getScreenHeight();
        int screenWidth = watchFaceParamsResult.getScreenWidth();
        if (mca.c(screenWidth, screenHeight)) {
            ReleaseLogUtil.e("DEVMGR_WearHomeWatchFaceCard", "updateWatchFace BeanResolutionInvalid");
            return;
        }
        int i = qrs.af(this.mContext) ? 6 : 3;
        d(i);
        int iMin = Math.min(i, mca.e());
        if (iMin > 0) {
            this.l.b().setVisibility(0);
            if (this.f49420b) {
                this.l.e().setVisibility(8);
                this.l.a().setPadding(0, qrs.d(this.mContext, 24.0f), 0, qrs.d(this.mContext, 10.0f));
                this.l.a().setTextSize(18.0f);
                this.l.a().setTypeface(Build.VERSION.SDK_INT >= 28 ? Typeface.create(Typeface.DEFAULT, 700, false) : Typeface.create(Typeface.DEFAULT, 1));
                this.l.g().setPadding(0, qrs.d(this.mContext, 24.0f), 0, qrs.d(this.mContext, 10.0f));
            }
            this.l.d().setVisibility(0);
        }
        for (int i2 = 0; i2 < iMin; i2++) {
            b(i2, screenWidth, screenHeight);
        }
        ReleaseLogUtil.d("DEVMGR_WearHomeWatchFaceCard", "top3 watchFace uri is ok.");
    }

    private void d(int i) {
        while (i < 6) {
            RelativeLayout relativeLayout = (RelativeLayout) qsp.a(this.n, BaseApplication.getContext().getResources().getIdentifier("rl_watchface" + i, "id", BaseApplication.getContext().getPackageName()));
            if (relativeLayout != null) {
                LogUtil.a("WearHomeWatchFaceCard", "relativeLayout index:", Integer.valueOf(i));
                relativeLayout.setVisibility(8);
            }
            i++;
        }
    }

    private void b(int i, int i2, int i3) {
        LogUtil.a("WearHomeWatchFaceCard", "updateWatchFaceItem position:", Integer.valueOf(i));
        RelativeLayout relativeLayout = (RelativeLayout) this.n.findViewById(BaseApplication.getContext().getResources().getIdentifier("rl_watchface" + i, "id", BaseApplication.getContext().getPackageName()));
        if (relativeLayout == null) {
            LogUtil.j("WearHomeWatchFaceCard", "updateWatchFaceItem relativeLayout == null.");
            return;
        }
        relativeLayout.setTag(Integer.valueOf(i));
        relativeLayout.setOnClickListener(this.h);
        relativeLayout.setVisibility(0);
        if (i < 0 || i >= mca.e()) {
            return;
        }
        ImageView imageView = (ImageView) this.n.findViewById(BaseApplication.getContext().getResources().getIdentifier("im_watchface" + i, "id", BaseApplication.getContext().getPackageName()));
        Object tag = imageView.getTag();
        Objects.isNull(tag);
        if (tag == null) {
            imageView.setLayoutParams(tqp.d(imageView.getLayoutParams(), 80, 80));
            imageView.setTag("tag_im_watchface" + i);
        }
        b(mca.c(i), imageView, i2, i3);
        HealthTextView healthTextView = (HealthTextView) this.n.findViewById(BaseApplication.getContext().getResources().getIdentifier("tv_watchface" + i, "id", BaseApplication.getContext().getPackageName()));
        String strD = mca.d(i);
        LogUtil.a("WearHomeWatchFaceCard", "update Watch Face item title is:", strD);
        healthTextView.setText(strD);
    }

    private void b(String str, final ImageView imageView, final int i, final int i2) {
        int i3;
        if (this.mCurrentDeviceInfo == null) {
            LogUtil.j("WearHomeWatchFaceCard", "loadPicture failed for mCurrentDeviceInfo is null");
            return;
        }
        final boolean z = i == i2;
        if (z) {
            i3 = R.mipmap.ic_watchface_default;
        } else {
            i3 = R.mipmap.pic_setup_band;
        }
        LogUtil.a("WearHomeWatchFaceCard", "loadPicture mContext : ", this.mContext);
        if (this.mContext == null || i()) {
            return;
        }
        qqf.a(str, new RequestOptions().placeholder(i3), new CustomTarget<Drawable>() { // from class: tod.2
            @Override // com.bumptech.glide.request.target.Target
            public void onLoadCleared(Drawable drawable) {
            }

            @Override // com.bumptech.glide.request.target.Target
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onResourceReady(Drawable drawable, Transition<? super Drawable> transition) {
                try {
                    tod.this.b(imageView, drawable, z, i, i2);
                } catch (OutOfMemoryError unused) {
                    LogUtil.e("WearHomeWatchFaceCard", "loadPicture() OutOfMemoryError");
                }
            }
        });
    }

    private boolean i() {
        Activity activity = this.d;
        if (activity != null && !activity.isFinishing() && !this.d.isDestroyed()) {
            return false;
        }
        LogUtil.a("WearHomeWatchFaceCard", "mActivity is destroyed");
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(ImageView imageView, Drawable drawable, boolean z, int i, int i2) {
        Bitmap bitmapA;
        Integer numValueOf;
        LogUtil.a("WearHomeWatchFaceCard", "setImageToWatchFaceItem()");
        if (drawable == null || imageView == null) {
            LogUtil.j("WearHomeWatchFaceCard", "setImageToWatchFaceItem(), drawable or imageView is null.");
            return;
        }
        if (drawable instanceof BitmapDrawable) {
            bitmapA = ((BitmapDrawable) drawable).getBitmap();
            LogUtil.a("WearHomeWatchFaceCard", "setImageToWatchFaceItem() drawable instanceof BitmapDrawable");
        } else {
            bitmapA = qqf.a(drawable);
            LogUtil.a("WearHomeWatchFaceCard", "setImageToWatchFaceItem() else");
        }
        if (bitmapA == null) {
            LogUtil.j("WearHomeWatchFaceCard", "setImageToWatchFaceItem, bitmap is null");
            return;
        }
        if (z) {
            LogUtil.a("WearHomeWatchFaceCard", "setImageToWatchFaceItem(), set circle image.");
            int iMin = Math.min(bitmapA.getHeight(), bitmapA.getWidth());
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            layoutParams.width = qrs.d(this.mContext, 80.0f);
            layoutParams.height = qrs.d(this.mContext, 80.0f);
            imageView.setLayoutParams(layoutParams);
            imageView.setAdjustViewBounds(true);
            imageView.setImageBitmap(qqf.e(bitmapA, iMin / 2));
            return;
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapA, 1, 0, bitmapA.getWidth() - 2, bitmapA.getHeight());
        if (bitmapCreateBitmap.getWidth() > i || bitmapCreateBitmap.getHeight() > i2) {
            bitmapCreateBitmap = Bitmap.createScaledBitmap(bitmapCreateBitmap, i, i2, true);
        }
        float fD = qrs.d(this.mContext, 64.0f) / bitmapCreateBitmap.getWidth();
        LogUtil.a("WearHomeWatchFaceCard", "scaleWidth is,", Float.valueOf(fD));
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        layoutParams2.width = qrs.d(this.mContext, 64.0f);
        layoutParams2.height = (int) (bitmapCreateBitmap.getHeight() * fD);
        imageView.setLayoutParams(layoutParams2);
        imageView.setAdjustViewBounds(true);
        LogUtil.a("WearHomeWatchFaceCard", "setImageToWatchFaceItem(), set image.");
        Bitmap bitmapD = qqf.d(bitmapCreateBitmap, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), qrs.d(this.mContext, 8.0f / fD));
        if (this.mCurrentDeviceInfo != null && (numValueOf = f49419a.get(Integer.valueOf(this.mCurrentDeviceInfo.getProductType()))) != null) {
            if ((this.mCurrentDeviceInfo.getProductType() == 108 || this.mCurrentDeviceInfo.getProductType() == 109) && bitmapCreateBitmap.getWidth() < i) {
                numValueOf = Integer.valueOf((int) ((bitmapCreateBitmap.getWidth() * 60.0f) / i));
            }
            bitmapD = qqf.d(bitmapCreateBitmap, bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), numValueOf.intValue());
        }
        if (bitmapD != null) {
            imageView.setImageBitmap(bitmapD);
        } else {
            LogUtil.j("WearHomeWatchFaceCard", "setImageToWatchFaceItem, roundBitmap is null");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean m() {
        if (this.mDeviceCapability == null || !this.mDeviceCapability.isSupportWatchFace()) {
            return this.mCurrentDeviceInfo != null && tqp.e(this.mCurrentDeviceInfo.getProductType(), this.mDeviceMac);
        }
        return true;
    }

    private void r() {
        if (m() && l()) {
            LogUtil.a("WearHomeWatchFaceCard", "initGeneralList HwWatchFaceManager init");
            if (f()) {
                LogUtil.j("WearHomeWatchFaceCard", "updateWatchFaceShow AffectPair, isAddDevice:", Boolean.valueOf(DevicePairGuideActivity.f24605c));
                return;
            } else if (this.f49420b && LoginInit.getInstance(BaseApplication.getContext()).isBrowseMode()) {
                LogUtil.j("WearHomeWatchFaceCard", "updateWatchFaceShow isBrowseMode");
                return;
            } else {
                tqp.g(BaseApplication.getContext());
                this.l.b().setVisibility(0);
                return;
            }
        }
        this.l.b().setVisibility(8);
    }

    private boolean f() {
        return (CommonUtil.bg() || !DevicePairGuideActivity.f24605c || com.huawei.haf.application.BaseApplication.j() == this.d) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean l() {
        if (!TextUtils.isEmpty(this.f) && !TextUtils.isEmpty(this.k)) {
            LogUtil.a("WearHomeWatchFaceCard", "can get isGetGrsAbility");
            return true;
        }
        LogUtil.j("WearHomeWatchFaceCard", "can not isGetGrsAbility");
        return false;
    }

    private void o() {
        if (this.d == null) {
            LogUtil.j("WearHomeWatchFaceCard", "showTipDialog mActivity is null");
            return;
        }
        NoTitleCustomAlertDialog noTitleCustomAlertDialogC = new NoTitleCustomAlertDialog.Builder(this.d).a(this.d.getResources().getString(R.string.IDS_device_ota_later_note)).c(R.string.IDS_ota_update_know, new View.OnClickListener() { // from class: tok
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                LogUtil.a("WearHomeWatchFaceCard", "showTipDialog，click known button");
            }
        }).c();
        noTitleCustomAlertDialogC.setCancelable(false);
        noTitleCustomAlertDialogC.show();
    }

    private void a(int i) {
        if (this.d == null) {
            LogUtil.j("WearHomeWatchFaceCard", "gotoWatchFace mActivity is null");
            return;
        }
        if (this.f49421c == null) {
            this.f49421c = new tfv(this.d, "com.huawei.ui.homewear21.home.WearHomeOldActivity");
        }
        if (qrs.r()) {
            LogUtil.j("WearHomeWatchFaceCard", "click too fast");
        } else if (i != -1 && !mca.c()) {
            a(i, mca.b(i), mca.a(i));
        } else {
            this.f49421c.c(i);
        }
    }

    private void a(int i, String str, String str2) {
        if (this.d == null) {
            LogUtil.j("WearHomeWatchFaceCard", "gotoWatchFace mActivity is null");
        } else {
            this.f49421c.a(i);
        }
    }
}
