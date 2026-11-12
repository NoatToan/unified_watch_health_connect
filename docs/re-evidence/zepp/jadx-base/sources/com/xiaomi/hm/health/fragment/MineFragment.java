package com.xiaomi.hm.health.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.p008lifecycle.LifecycleOwner;
import androidx.p008lifecycle.Observer;
import com.google.android.material.timepicker.TimeModel;
import com.huami.account.HMLoginManager;
import com.huami.account.legal.UserInfoPolicyPropertyRegistry;
import com.huami.account.ui.areas.SelectAreaHelper;
import com.huami.account.utils.PolicyTipUtil;
import com.huami.android.vo.Resource;
import com.huami.android.vo.Status;
import com.huami.assistant.ui.activity.SmartActivity;
import com.huami.bluetooth.device.HeadsetDevice;
import com.huami.feedback.api.FeedbackService;
import com.huami.feedback.util.AnalyticsKt;
import com.huami.healthlabel.utils.HealthLabelHelper;
import com.huami.koinstartup.KoinAdapterKt;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.view.scroll.HMScrollView;
import com.huami.message.ui.home.MidongMessageCenterActivity;
import com.huami.message.viewmodel.MessageCountViewModel;
import com.huami.mifit.analytics.Analytics;
import com.huami.mifit.analytics.builder.CountEventBuilder;
import com.huami.module.darkmode.AppNightModeHelper;
import com.huami.network.hmnetwork.server.HMServerDef;
import com.huami.passport.AccountManager;
import com.huami.reddot.RedDotConstant;
import com.huami.reddot.RedDotManager;
import com.huami.reddot.RedDotProvider;
import com.huami.reddot.entity.DeviceEntranceRedDotInfo;
import com.huami.reddot.network.RedDotRequest;
import com.huami.sleepassistant.lib.ui.base.ext.ViewExKt;
import com.huami.tools.log.HMLog;
import com.huami.userproperty.UserPropertyManager;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.companion.device.DeviceManager;
import com.huami.watch.companion.device.DeviceUtil;
import com.huami.watch.companion.sport.event.PBInfoChangedEvent;
import com.huami.watch.companion.sport.pb.PBManager;
import com.huami.watch.companion.ui.activity.BaseDeviceStatusActivity;
import com.huami.watch.companion.ui.activity.PBTabActivity;
import com.huami.watch.hmwatchmanager.R;
import com.huami.watch.util.RxBus;
import com.huami.widget.toast.IconToast;
import com.huami.widget.typeface.TypefaceTextView;
import com.xiaomi.hm.health.BraceletApp;
import com.xiaomi.hm.health.Constant;
import com.xiaomi.hm.health.HMConfig;
import com.xiaomi.hm.health.account.AuditUserInfoManager;
import com.xiaomi.hm.health.activity.MainTabActivity;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.GlobalUtil;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.baseutil.SmartExecutor;
import com.xiaomi.hm.health.bt.classic.HMSportController;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMBoltClassicDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.sport.SportCommand;
import com.xiaomi.hm.health.client.RedDotParamsClient;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.HMBlueMonkeySettingActivity;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMDeviceManager;
import com.xiaomi.hm.health.device.HMDeviceUtils;
import com.xiaomi.hm.health.device.HMHeadsetSettingActivity;
import com.xiaomi.hm.health.device.HMNormandySettingActivity;
import com.xiaomi.hm.health.device.HMShoesSettingActivity;
import com.xiaomi.hm.health.device.HMTreadmillSettingActivity;
import com.xiaomi.hm.health.device.HMUnifySelectDeviceActivity;
import com.xiaomi.hm.health.device.HMWeightSettingActivity;
import com.xiaomi.hm.health.device.HmEarbudMusicActivity;
import com.xiaomi.hm.health.device.deviceconfig.Feature;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.event.HMActiveDeviceEvent;
import com.xiaomi.hm.health.device.event.HMDeviceBatteryEvent;
import com.xiaomi.hm.health.device.event.HMDeviceBindEvent;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import com.xiaomi.hm.health.device.event.StatEvent;
import com.xiaomi.hm.health.device.event.TreadmillSportEvent;
import com.xiaomi.hm.health.device.firmware.HMFwOnlineUpgradeManager;
import com.xiaomi.hm.health.device.model.HMBrandType;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.di.koin.module.TrainingModuleKt;
import com.xiaomi.hm.health.di.koin.startup.UserInfoModuleInitializerKt;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.eventbus.EventBluetooth;
import com.xiaomi.hm.health.eventbus.EventFwCheckResult;
import com.xiaomi.hm.health.eventbus.EventMineRedDot;
import com.xiaomi.hm.health.eventbus.EventTotalAnalysisJobFinished;
import com.xiaomi.hm.health.fragment.MineFragment;
import com.xiaomi.hm.health.homepage.status.utils.HomeAnalytics;
import com.xiaomi.hm.health.keeper.HMKeeper;
import com.xiaomi.hm.health.keeper.HMKeeperConstant;
import com.xiaomi.hm.health.keeper.SystemUpgradePersistentKt;
import com.xiaomi.hm.health.manager.DeviceAuthDebugManager;
import com.xiaomi.hm.health.manager.RunningManager;
import com.xiaomi.hm.health.mine.MineViewModel;
import com.xiaomi.hm.health.model.account.HMPersonInfo;
import com.xiaomi.hm.health.nps.NpsClickedMode;
import com.xiaomi.hm.health.nps.NpsEventTracker;
import com.xiaomi.hm.health.nps.NpsUtil;
import com.xiaomi.hm.health.nps.NpsViewModel;
import com.xiaomi.hm.health.nps.model.NpsDevice;
import com.xiaomi.hm.health.push.MessageManager;
import com.xiaomi.hm.health.push.event.EventNewMessageReceived;
import com.xiaomi.hm.health.relation.RelationServiceKt;
import com.xiaomi.hm.health.share.HMShareActivity;
import com.xiaomi.hm.health.share.ShareAdapter;
import com.xiaomi.hm.health.thirdbind.ThirdBindActivity;
import com.xiaomi.hm.health.ui.AnalyseActivity;
import com.xiaomi.hm.health.ui.SettingActivity;
import com.xiaomi.hm.health.ui.goal.ui.GoalSummaryActivity;
import com.xiaomi.hm.health.ui.keekalive.KeepAliveActivity;
import com.xiaomi.hm.health.utils.FragmentTrackHelper;
import com.xiaomi.hm.health.utils.Utils;
import com.xiaomi.hm.health.view.ImageItem;
import com.xiaomi.hm.health.wxapi.WeChatAPI;
import de.greenrobot.event.EventBus;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;
import org.koin.android.compat.SharedViewModelCompat;
import org.koin.android.compat.ViewModelCompat;
import org.koin.core.KoinApplication;
import org.koin.java.KoinJavaComponent;
import rx.functions.Action1;
import rx.subscriptions.CompositeSubscription;

/* JADX INFO: loaded from: classes21.dex */
public class MineFragment extends BaseFragment implements View.OnClickListener {
    public static final int FILE_REQ = 4098;
    private static final String K = "MineFragment";
    private static final String L = "t/hmwatchmanager.mine.icon.medal";
    private static final String M = "t/hmwatchmanager.mine.icon.weekly";
    private static final int N = 20;
    private static final String O = "Entrance_Mine";
    private static final int P = 4;
    private View G;
    private Disposable I;
    private ListTile J;
    private LinearLayout d;
    private View e;
    private View f;
    private TextView g;
    private ImageView h;
    private ListTile i;
    public ListTile j;
    private MessageManager k;
    private d l;
    private RedDotRequest m;
    private CompositeSubscription n;
    private DeviceEntranceRedDotInfo o;
    private Activity p;
    private Context q;
    private Runnable r;
    private TypefaceTextView s;
    private TypefaceTextView t;
    private TextView u;
    private TextView v;
    private ImageView w;
    private ImageItem x;
    private LinearLayout y;
    private boolean a = true;
    private final Lazy<FeedbackService> b = KoinJavaComponent.inject(FeedbackService.class);
    private final DeviceXNavigator c = (DeviceXNavigator) KoinJavaComponent.get(DeviceXNavigator.class);
    private final SparseArray<ListTile> z = new SparseArray<>();
    private final Lazy<MessageCountViewModel> A = ViewModelCompat.viewModel(this, MessageCountViewModel.class);
    private final Lazy<MineViewModel> B = ViewModelCompat.viewModel(this, MineViewModel.class);
    private final Lazy<NpsViewModel> C = SharedViewModelCompat.sharedViewModel(this, NpsViewModel.class);
    private final NpsEventTracker D = new NpsEventTracker();
    private final FragmentTrackHelper E = new FragmentTrackHelper(this, new Function1() { // from class: w65
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return MineFragment.V0((Long) obj);
        }
    }, new Function0() { // from class: j65
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: invoke */
        public final Object getA() {
            return MineFragment.W0();
        }
    });
    private final HashMap<HMDeviceType, ListTile> F = new HashMap<>();
    private float H = 0.0f;

    public class a implements HMScrollView.OnHMScrollViewStateChanged {
        public a() {
        }

        private void a(int what, float value) {
            Bundle bundle = new Bundle();
            bundle.putFloat("key", value);
            Message message = new Message();
            message.what = what;
            message.setData(bundle);
            MineFragment.this.l.sendMessage(message);
        }

        @Override // com.huami.lib.view.scroll.HMScrollView.OnHMScrollViewStateChanged
        public void onBottomExpand(float distance) {
        }

        @Override // com.huami.lib.view.scroll.HMScrollView.OnHMScrollViewStateChanged
        public void onExpandViewExpand(float distance) {
            if (distance < 0.0f) {
                return;
            }
            a(0, distance);
        }

        @Override // com.huami.lib.view.scroll.HMScrollView.OnHMScrollViewStateChanged
        public void onExpandViewExpandStart() {
            MineFragment.this.l.sendEmptyMessage(3);
        }

        @Override // com.huami.lib.view.scroll.HMScrollView.OnHMScrollViewStateChanged
        public void onExpandViewRelease(float ratio) {
            a(4, ratio);
        }

        @Override // com.huami.lib.view.scroll.HMScrollView.OnHMScrollViewStateChanged
        public void onScrollerScroll(float distance) {
            a(2, distance);
        }
    }

    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;
        public static final /* synthetic */ int[] b;

        static {
            int[] iArr = new int[HMSportController.TreadmillSportState.values().length];
            b = iArr;
            try {
                iArr[HMSportController.TreadmillSportState.RUNNING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                b[HMSportController.TreadmillSportState.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[SportCommand.values().length];
            a = iArr2;
            try {
                iArr2[SportCommand.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[SportCommand.RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[SportCommand.PAUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[SportCommand.STOP.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public static class c implements Action1<ArrayList<String>> {
        public WeakReference<MineFragment> a;

        public c(MineFragment fragment) {
            this.a = new WeakReference<>(fragment);
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(ArrayList<String> data) {
            MineFragment mineFragment = this.a.get();
            if (mineFragment == null || mineFragment.isDetached() || data == null || data.size() <= 0) {
                return;
            }
            for (String str : data) {
                mineFragment.j0(str);
                mineFragment.p0(str);
                mineFragment.k0(str);
                mineFragment.h0(str);
                mineFragment.m0(str);
            }
        }
    }

    public static class d extends Handler {
        private static final int b = 0;
        private static final int c = 2;
        private static final int d = 3;
        private static final int e = 4;
        private static final String f = "key";
        public WeakReference<MineFragment> a;

        public d(MineFragment fragment) {
            this.a = new WeakReference<>(fragment);
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            super.handleMessage(msg);
            MineFragment mineFragment = this.a.get();
            if (mineFragment != null && msg.what == 2 && mineFragment.isAdded() && mineFragment.B1() && ((MainTabActivity) mineFragment.p).isTabOnMine()) {
                float f2 = msg.getData().getFloat("key");
                mineFragment.H = f2 > 255.0f ? 1.0f : f2 / 255.0f;
                mineFragment.H = mineFragment.H >= 0.0f ? mineFragment.H : 0.0f;
                mineFragment.e.setAlpha(mineFragment.H);
                mineFragment.f.setAlpha(mineFragment.H);
            }
        }
    }

    public static class e implements Action1<Throwable> {
        private e() {
        }

        @Override // rx.functions.Action1
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(Throwable throwable) {
        }
    }

    private void A0() {
        this.B.getValue().getOrderUrl().observe(this, new Observer() { // from class: u55
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.K0((String) obj);
            }
        });
        this.B.getValue().getMedicalUrl().observe(this, new Observer() { // from class: t55
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.L0((String) obj);
            }
        });
    }

    private void A1() {
        this.A.getValue().loadUserNotice();
    }

    private void B0() {
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        this.C.getValue().getNpsDevices().observe(viewLifecycleOwner, new Observer() { // from class: x55
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.Q1((List) obj);
            }
        });
        this.C.getValue().getShowRedDot().observe(viewLifecycleOwner, new Observer() { // from class: v55
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.M0((List) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean B1() {
        if (this.p == null) {
            this.p = getActivity();
        }
        return this.p != null;
    }

    private boolean C0() {
        return AppNightModeHelper.isDarkMode(requireContext());
    }

    private boolean C1() {
        if (this.q == null) {
            this.q = getContext();
        }
        return this.q != null;
    }

    private boolean D0() {
        AccountManager accountManager = AccountManager.getDefault(BraceletApp.getContext());
        int age = HMPersonInfo.getInstance().getUserInfo().getAge();
        return accountManager.isLogin() && (!HMLoginManager.isInUSA() ? age < 16 : age < 13);
    }

    private void D1() {
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        HMDeviceType hMDeviceType = HMDeviceType.TREADMILL;
        if (hMDeviceManager.getDevice(hMDeviceType) == null) {
            HMDeviceManager.getInstance().createDevice(hMDeviceType);
        }
        if (isAdded()) {
            s0();
        }
    }

    private boolean E0() {
        AccountManager accountManager = AccountManager.getDefault(BraceletApp.getContext());
        int age = HMPersonInfo.getInstance().getUserInfo().getAge();
        return accountManager.isLogin() && (HMLoginManager.isInUSA() || HMLoginManager.isUnknown() ? age >= 13 : age >= 16);
    }

    private void E1(String id, String value) {
        Analytics.recordEvent(new CountEventBuilder(id).setValue(value));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void F0(View.OnClickListener onClickListener, View view) {
        if (PolicyTipUtil.anonymousPolicyApi().showLoginIfNeeded()) {
            return;
        }
        onClickListener.onClick(view);
    }

    private void F1(List<Device> boundDeviceList) {
        this.C.getValue().updateBoundDevices(boundDeviceList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G0(HMDeviceType hMDeviceType, boolean z, HMBaseDevice hMBaseDevice, ListTile listTile) {
        boolean z2 = HMFwOnlineUpgradeManager.SUPPORT_CLOUD_FW_UPGRADE && HMFwOnlineUpgradeManager.getInstance().useOnline(hMDeviceType) && HMFwOnlineUpgradeManager.getInstance().hasFwUpgrade(requireActivity(), hMDeviceType);
        if (z || !z2) {
            if (z2 || !J1()) {
                return;
            }
            W1(listTile, false);
            EventBus.getDefault().post(new EventMineRedDot(Constant.TYPE_MINE_REDOT_FWUPGRADE, false));
            return;
        }
        String strX0 = x0(hMDeviceType, hMBaseDevice);
        if (strX0 == null || strX0.length() == 0) {
            W1(listTile, true);
            EventBus.getDefault().post(new EventMineRedDot(Constant.TYPE_MINE_REDOT_FWUPGRADE));
        } else if (!strX0.equals(SystemUpgradePersistentKt.getFwUpgradeVer(getContext(), hMDeviceType))) {
            W1(listTile, true);
            EventBus.getDefault().post(new EventMineRedDot(Constant.TYPE_MINE_REDOT_FWUPGRADE));
        } else if (J1()) {
            W1(listTile, false);
        }
    }

    private void G1(@NonNull HMDeviceType deviceType) {
        H1(deviceType, t0(deviceType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H0(ListTile listTile, NpsDevice npsDevice, View view) {
        this.D.trackNpsClick(listTile, npsDevice.getSource());
        this.C.getValue().setClickedEntrance(npsDevice.getSource());
        WebHelper.launch(npsDevice.getUrl());
        NpsUtil.INSTANCE.setHasNpsActivityDone(0);
    }

    private void H1(@NonNull HMDeviceType type, @Nullable HMBaseDevice device) {
        DeviceInfo deviceInfo;
        if (type == HMDeviceType.MILI) {
            HMKeeper.saveFwUpgradeShowRedDotVer("", SystemUpgradePersistentKt.getFwUpgradeVer(getContext(), type));
        } else {
            if (device == null || (deviceInfo = device.getDeviceInfo()) == null || deviceInfo.getSerialNumber() == null) {
                return;
            }
            HMKeeper.saveFwUpgradeRedDotHideVersion(deviceInfo.getSerialNumber(), SystemUpgradePersistentKt.getFwUpgradeVer(getContext(), type));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String I0() {
        return "doOnResumeUpdate";
    }

    private void I1(int count) {
        if (count <= 0) {
            this.g.setVisibility(8);
        } else {
            this.g.setVisibility(0);
            this.g.setText(RedDotManager.getManager().getRedDotCountStr(count));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J0(Resource resource) {
        if (resource == null || resource.getStatus() != Status.SUCCESS || resource.getData() == null) {
            return;
        }
        I1(((Integer) resource.getData()).intValue());
    }

    private boolean J1() {
        HMDeviceSource boundDeviceSource = HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.MILI);
        HMDeviceSource hMDeviceSource = HMDeviceSource.MILI_PEYTO;
        if (boundDeviceSource == hMDeviceSource) {
            return !this.o.getShowRedDot(hMDeviceSource.getValue());
        }
        if (HMDeviceConfig.hasFeatureTempoWatchFace(boundDeviceSource)) {
            return !this.o.getShowRedDot(HMDeviceSource.MILI_TEMPO.getValue());
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0(String str) {
        if (TextUtils.isEmpty(str)) {
            IconToast.showError(requireContext(), getResources().getString(R.string.no_network));
        } else {
            WebHelper.launch(str);
        }
    }

    private void K1() {
        L1();
        T1();
        X1();
        V1();
        Y1();
        P1();
        N1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void L0(String str) {
        if (TextUtils.isEmpty(str)) {
            IconToast.showError(requireContext(), getResources().getString(R.string.no_network));
            return;
        }
        if (getActivity() == null) {
            return;
        }
        WeChatAPI weChatAPI = new WeChatAPI(getActivity());
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("userName", WeChatAPI.WECHAT_EMERGENCY_USERNAME);
            jSONObject.put("path", str);
            weChatAPI.launchMiniProgram(jSONObject.toString());
        } catch (JSONException e2) {
            e2.printStackTrace();
        }
    }

    private void L1() {
        this.d.removeAllViews();
        this.F.clear();
        final List<Device> deviceListOrdered = HMDeviceManager.getDeviceListOrdered();
        Iterator<Device> it2 = deviceListOrdered.iterator();
        int i = 0;
        while (it2.hasNext()) {
            if (it2.next().getDevice_source().intValue() != HMDeviceSource.SENSORHUB.getValue()) {
                i++;
            }
        }
        boolean z = i == 0;
        F1(deviceListOrdered);
        this.v.setVisibility(z ? 0 : 8);
        this.u.setVisibility(z ? 8 : 0);
        this.w.setVisibility(i <= 4 ? 8 : 0);
        if (z) {
            HMLog.debug(K, new Function0() { // from class: u65
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return MineFragment.l1();
                }
            });
            return;
        }
        HMLog.debug(K, new Function0() { // from class: i65
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return MineFragment.m1(deviceListOrdered);
            }
        });
        for (final Device device : deviceListOrdered) {
            if (device.getDevice_source().intValue() != HMDeviceSource.SENSORHUB.getValue()) {
                if (this.a && this.d.getChildCount() == 4) {
                    return;
                }
                LayoutInflater layoutInflaterFrom = LayoutInflater.from(getContext());
                final boolean zIsActive = HMDeviceManager.getInstance().isActive(device);
                final HMDeviceType hMDeviceTypeFromValue = HMDeviceType.fromValue(device.getDevice_type().intValue());
                final HMDeviceSource hMDeviceSourceFromValue = HMDeviceSource.fromValue(device.getDevice_source().intValue());
                final ListTile listTileR0 = r0((GlobalConfig.get().isBuildMidong() && HMDeviceManager.getInstance().isUseWearCompanionName(device)) ? HMDeviceUtils.getHuamiDeviceDescription(device) : HMDeviceUtils.getDeviceDescription(hMDeviceSourceFromValue, HMBrandType.fromValue(device.getBrandType().intValue())));
                if (!zIsActive && !ConfigHelperKt.hasFeature(Feature.HEADSET_MOZART_SOURCE_S, hMDeviceSourceFromValue)) {
                    if (hMDeviceTypeFromValue == HMDeviceType.EARBUD) {
                        listTileR0.setSubtitle(R.string.unused);
                    } else {
                        listTileR0.setTips(R.string.unused);
                    }
                }
                if (hMDeviceTypeFromValue == HMDeviceType.MILI) {
                    if (zIsActive) {
                        n0(listTileR0, hMDeviceTypeFromValue);
                    }
                    listTileR0.setOnClickListener(l0(new View.OnClickListener() { // from class: b75
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.n1(zIsActive, listTileR0, hMDeviceTypeFromValue, hMDeviceSourceFromValue, device, view);
                        }
                    }));
                } else if (hMDeviceTypeFromValue == HMDeviceType.WEIGHT) {
                    listTileR0.setOnClickListener(l0(new View.OnClickListener() { // from class: c75
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.o1(zIsActive, device, view);
                        }
                    }));
                } else if (hMDeviceTypeFromValue == HMDeviceType.SHOES) {
                    listTileR0.setOnClickListener(l0(new View.OnClickListener() { // from class: m55
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.p1(zIsActive, device, view);
                        }
                    }));
                } else if (hMDeviceTypeFromValue == HMDeviceType.WATCH) {
                    listTileR0.setOnClickListener(l0(new View.OnClickListener() { // from class: d75
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.q1(zIsActive, device, view);
                        }
                    }));
                } else if (hMDeviceTypeFromValue == HMDeviceType.EARBUD) {
                    if (zIsActive && HMDeviceManager.getInstance().isConnected(hMDeviceTypeFromValue)) {
                        n0(listTileR0, hMDeviceTypeFromValue);
                    }
                    ViewExKt.smartClick(listTileR0, 300L, new Function1() { // from class: v65
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return this.a.r1(zIsActive, listTileR0, hMDeviceTypeFromValue, device, (View) obj);
                        }
                    });
                } else if (hMDeviceTypeFromValue == HMDeviceType.OTHER) {
                    listTileR0.setOnClickListener(l0(new View.OnClickListener() { // from class: e75
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.s1(zIsActive, device, view);
                        }
                    }));
                } else if (hMDeviceTypeFromValue == HMDeviceType.TREADMILL) {
                    listTileR0.setOnClickListener(l0(new View.OnClickListener() { // from class: n55
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.t1(zIsActive, device, view);
                        }
                    }));
                } else if (hMDeviceTypeFromValue == HMDeviceType.HEADSET) {
                    if (hMDeviceSourceFromValue == HMDeviceSource.OTHER_MOZART) {
                        layoutInflaterFrom.inflate(R.layout.layout_headset_item_battery_info, listTileR0);
                    }
                    listTileR0.setOnClickListener(l0(new View.OnClickListener() { // from class: z65
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            this.a.u1(listTileR0, hMDeviceTypeFromValue, device, view);
                        }
                    }));
                }
                String displayName = device.getDisplayName();
                if (!TextUtils.isEmpty(displayName)) {
                    listTileR0.setSubtitle(displayName);
                }
                if (zIsActive) {
                    this.F.put(hMDeviceTypeFromValue, listTileR0);
                }
                this.d.addView(listTileR0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0(List list) {
        if (list == null) {
            return;
        }
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            NpsClickedMode npsClickedMode = (NpsClickedMode) it2.next();
            if (npsClickedMode != null) {
                try {
                    int i = Integer.parseInt(npsClickedMode.getCode());
                    if (this.z.indexOfKey(i) >= 0) {
                        ListTile listTile = this.z.get(i);
                        listTile.setDotted(!npsClickedMode.getHasClicked());
                        this.D.trackNpsShow(listTile, npsClickedMode.getCode());
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        }
    }

    private void M1() {
        boolean z;
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        HMDeviceType hMDeviceType = HMDeviceType.EARBUD;
        HMBaseDevice device = hMDeviceManager.getDevice(hMDeviceType);
        if (device instanceof HmEarbudDevice) {
            HmEarbudDevice hmEarbudDevice = (HmEarbudDevice) device;
            ListTile listTile = this.F.get(hMDeviceType);
            if (listTile == null) {
                HMLog.debug(K, new Function0() { // from class: q65
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return MineFragment.v1();
                    }
                });
                return;
            }
            if (!hmEarbudDevice.isAllConnected()) {
                listTile.setTips("");
                return;
            }
            String deviceID = hmEarbudDevice.getDeviceInfo() == null ? null : hmEarbudDevice.getDeviceInfo().getDeviceID();
            if (deviceID == null) {
                return;
            }
            BatteryInfo batteryInfo = hmEarbudDevice.getBatteryInfo();
            BatteryInfo batteryInfo2 = hmEarbudDevice.getRightDevice().getBatteryInfo();
            boolean z2 = true;
            if (batteryInfo == null) {
                batteryInfo = HMKeeper.getEarbudBattery(true, deviceID);
                z = true;
            } else {
                HMKeeper.saveEarbudBattery(true, deviceID, batteryInfo.toJsonString());
                z = false;
            }
            if (batteryInfo2 == null) {
                batteryInfo2 = HMKeeper.getEarbudBattery(false, deviceID);
            } else {
                HMKeeper.saveEarbudBattery(false, deviceID, batteryInfo2.toJsonString());
                z2 = false;
            }
            listTile.setTips(v0(batteryInfo, z, batteryInfo2, z2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void N0(View view) {
        Intent intent = new Intent(requireActivity(), (Class<?>) MidongMessageCenterActivity.class);
        intent.putExtra(MidongMessageCenterActivity.IS_OUT, !Language.isSimplifiedChinese());
        startActivity(intent);
        Analytics.recordEvent(new CountEventBuilder(StatEvent.MINE_MESSAGEBOX_C).addExtra("tp", "messagebox"));
    }

    private void N1() {
        M1();
        HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
        HMDeviceType hMDeviceType = HMDeviceType.EARBUD;
        HMBaseDevice device = hMDeviceManager.getDevice(hMDeviceType);
        Device bindInfo = HMDeviceManager.getInstance().getBindInfo(hMDeviceType);
        String displayName = bindInfo == null ? "" : bindInfo.getDisplayName();
        boolean z = (device instanceof HmEarbudDevice) && ((HmEarbudDevice) device).isAllConnected();
        ListTile listTile = this.F.get(hMDeviceType);
        if (listTile == null) {
            return;
        }
        if (z) {
            listTile.setSubtitle(displayName != null ? displayName : "");
            n0(listTile, hMDeviceType);
        } else if (HMDeviceManager.getInstance().isBluetoothEnable()) {
            listTile.setSubtitle(R.string.device_connecting);
        } else {
            listTile.setSubtitle(displayName != null ? displayName : "");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void O0(View view) {
        if (C1()) {
            HMBaseDevice device = HMDeviceManager.getInstance().getDevice(HMDeviceType.EARBUD);
            if (device instanceof HmEarbudDevice) {
                ((HmEarbudDevice) device).cancelDownloadMusic();
            }
            AnalyticsKt.feedbackFromAnalytics("Entrance_Mine");
            this.b.getValue().feedback(null, this.q, getChildFragmentManager(), null);
        }
        Analytics.recordEvent(new CountEventBuilder(StatEvent.MINE_FEEDBACK_C));
    }

    private void O1(@NonNull TextView view, @Nullable BatteryInfo batteryInfo, boolean isLeft) {
        if (batteryInfo == null || batteryInfo.getLevel() < 0 || batteryInfo.getLevel() > 100) {
            if (isLeft) {
                view.setText(getString(R.string.headset_left_battery_info, getString(R.string.empty_value)));
            } else {
                view.setText(getString(R.string.headset_right_battery_info, getString(R.string.empty_value)));
            }
            view.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            view.setTextColor(ContextCompat.getColor(view.getContext(), R.color.black30));
            return;
        }
        int i = R.color.default_itemview_right_color;
        if (batteryInfo.getLevel() < 20) {
            i = R.color.setting_battery_low_text_color;
        }
        view.setTextColor(ContextCompat.getColor(view.getContext(), i));
        String string = getString(R.string.battery_level_mili_setting, String.valueOf(batteryInfo.getLevel()));
        if (isLeft) {
            view.setText(getString(R.string.headset_left_battery_info, string));
        } else {
            view.setText(getString(R.string.headset_right_battery_info, string));
        }
        view.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, batteryInfo.isCharging() ? ContextCompat.getDrawable(requireContext(), R.drawable.headset_charging_icon) : null, (Drawable) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean P0(View view) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void P1() {
        HashMap<HMDeviceType, ListTile> map = this.F;
        HMDeviceType hMDeviceType = HMDeviceType.HEADSET;
        ListTile listTile = map.get(hMDeviceType);
        if (listTile == null) {
            HMLog.debug(K, new Function0() { // from class: o65
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return MineFragment.w1();
                }
            });
            return;
        }
        View viewFindViewById = listTile.findViewById(R.id.headset_battery_info_container);
        HMBaseDevice hMBaseDeviceT0 = t0(hMDeviceType);
        boolean z = true;
        if (!(hMBaseDeviceT0 != 0 && hMBaseDeviceT0.isConnected())) {
            if (viewFindViewById != null) {
                viewFindViewById.setVisibility(8);
            }
            if (HMDeviceManager.getInstance().isBluetoothEnable() && hMBaseDeviceT0 != 0 && hMBaseDeviceT0.getMDeviceSource() == HMDeviceSource.OTHER_MOZART) {
                listTile.setTips(R.string.device_connecting);
                return;
            } else {
                listTile.setTips("");
                return;
            }
        }
        listTile.setTips("");
        if (viewFindViewById != null) {
            viewFindViewById.setVisibility(0);
        }
        HeadsetDevice headsetDevice = (HeadsetDevice) hMBaseDeviceT0;
        BatteryInfo batteryInfo = headsetDevice.getBatteryInfo(HeadsetDevice.Part.Left.INSTANCE);
        BatteryInfo batteryInfo2 = headsetDevice.getBatteryInfo(HeadsetDevice.Part.Right.INSTANCE);
        if (viewFindViewById != null) {
            O1((TextView) viewFindViewById.findViewById(R.id.tv_left_battery), batteryInfo, true);
            O1((TextView) viewFindViewById.findViewById(R.id.tv_right_battery), batteryInfo2, false);
        }
        o0(listTile, hMDeviceType, hMBaseDeviceT0);
        if ((batteryInfo == null || !batteryInfo.isCharging()) && (batteryInfo2 == null || !batteryInfo2.isCharging())) {
            z = false;
        }
        CountEventBuilder countEventBuilder = new CountEventBuilder(StatEvent.EVENT_MINE_DEVICES_STATUS);
        countEventBuilder.setValue(z ? StatEvent.VALUE_BAND_CHARGING : StatEvent.VALUE_BAND_CONNECTION);
        Analytics.recordEvent(countEventBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean Q0(View view) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Q1(List<NpsDevice> npsDevices) {
        if (npsDevices == null || npsDevices.size() == 0) {
            this.y.setVisibility(8);
            return;
        }
        this.y.setVisibility(0);
        ArrayList arrayList = new ArrayList();
        SparseArray sparseArray = new SparseArray();
        for (NpsDevice npsDevice : npsDevices) {
            try {
                int i = Integer.parseInt(npsDevice.getSource());
                arrayList.add(Integer.valueOf(i));
                if (this.z.indexOfKey(i) < 0) {
                    ListTile listTileQ0 = q0(npsDevice);
                    this.y.addView(listTileQ0);
                    this.z.put(i, listTileQ0);
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        int size = this.z.size();
        for (int i2 = 0; i2 < size; i2++) {
            ListTile listTileValueAt = this.z.valueAt(i2);
            if (!arrayList.contains(Integer.valueOf(this.z.keyAt(i2)))) {
                sparseArray.put(this.z.keyAt(i2), this.z.valueAt(i2));
                this.y.removeView(listTileValueAt);
            }
        }
        int size2 = sparseArray.size();
        for (int i3 = 0; i3 < size2; i3++) {
            this.z.remove(sparseArray.keyAt(i3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean R0(View view) {
        return false;
    }

    private void R1() {
        this.s.setText(getResources().getQuantityString(R.plurals.mine_goal, HMKeeper.getSharedPref().getInt(HMKeeperConstant.TOTAL_ANALYSIS_REACH_GOALS, 0), Integer.valueOf(HMKeeper.getSharedPref().getInt(HMKeeperConstant.TOTAL_ANALYSIS_REACH_GOALS, 0))));
    }

    private /* synthetic */ boolean S0(View view) {
        DeviceAuthDebugManager.showAuthDevicesDialog(requireActivity());
        return true;
    }

    private void S1() {
        BatteryInfo batteryInfo;
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        HMBaseDevice hMBaseDeviceT0 = t0(hMDeviceType);
        if (hMBaseDeviceT0 == null || !hMBaseDeviceT0.isConnected() || ConfigHelperKt.hasFeature(Feature.IS_VIRTUAL_DEVICE, hMBaseDeviceT0.getMDeviceSource()) || (batteryInfo = hMBaseDeviceT0.getBatteryInfo()) == null) {
            return;
        }
        ListTile listTile = this.F.get(hMDeviceType);
        if (listTile == null) {
            HMLog.debug(K, new Function0() { // from class: l65
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return MineFragment.x1();
                }
            });
            return;
        }
        if (batteryInfo.isCharging()) {
            listTile.setTips(R.string.mili_setting_charging);
            E1(StatEvent.EVENT_MINE_DEVICES_STATUS, StatEvent.VALUE_BAND_CHARGING);
        } else {
            o0(listTile, hMDeviceType, hMBaseDeviceT0);
            listTile.setTips(batteryInfo.getLevel() == -1 ? "" : getString(R.string.battery_level, String.valueOf(batteryInfo.getLevel())));
            E1(StatEvent.EVENT_MINE_DEVICES_STATUS, StatEvent.VALUE_BAND_CONNECTION);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void T0(View view) {
        HMShareActivity.launch(getActivity(), 12, 2, ShareAdapter.newInstance().getShareContinue());
    }

    private void T1() {
        HashMap<HMDeviceType, ListTile> map = this.F;
        HMDeviceType hMDeviceType = HMDeviceType.MILI;
        ListTile listTile = map.get(hMDeviceType);
        if (listTile == null) {
            return;
        }
        HMBaseDevice hMBaseDeviceT0 = t0(hMDeviceType);
        if (hMBaseDeviceT0 != null && hMBaseDeviceT0.isConnected()) {
            S1();
        } else if (!HMDeviceManager.getInstance().isBluetoothEnable()) {
            listTile.setTips("");
        } else {
            listTile.setTips(R.string.device_connecting);
            E1(StatEvent.EVENT_MINE_DEVICES_STATUS, StatEvent.VALUE_BAND_CONNECTING);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean U0(View view) {
        UserInfoPolicyPropertyRegistry.INSTANCE.isAllowUserInfoUsage().set(null);
        UserPropertyManager.INSTANCE.schedulePushAll();
        IconToast.showSuccess(requireContext(), "清除用户信息同意使用标志");
        return true;
    }

    private void U1() {
        BatteryInfo batteryInfo;
        HMDeviceType hMDeviceType = HMDeviceType.OTHER;
        HMBaseDevice hMBaseDeviceT0 = t0(hMDeviceType);
        if (hMBaseDeviceT0 == null || !hMBaseDeviceT0.isConnected() || (batteryInfo = hMBaseDeviceT0.getBatteryInfo()) == null) {
            return;
        }
        ListTile listTile = this.F.get(hMDeviceType);
        if (!batteryInfo.isCharging()) {
            Objects.requireNonNull(listTile);
            listTile.setTips(batteryInfo.getLevel() == -1 ? "" : getString(R.string.battery_level, String.format(Locale.getDefault(), TimeModel.NUMBER_FORMAT, Integer.valueOf(batteryInfo.getLevel()))));
        } else if (listTile != null) {
            listTile.setTips(R.string.mili_setting_charging);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit V0(Long l) {
        HomeAnalytics.analyticsVisibleTime("mine", l.longValue());
        return Unit.INSTANCE;
    }

    private void V1() {
        HashMap<HMDeviceType, ListTile> map = this.F;
        HMDeviceType hMDeviceType = HMDeviceType.OTHER;
        ListTile listTile = map.get(hMDeviceType);
        if (listTile == null) {
            return;
        }
        HMBaseDevice hMBaseDeviceT0 = t0(hMDeviceType);
        if (hMBaseDeviceT0 != null && hMBaseDeviceT0.isConnected()) {
            U1();
        } else if (HMDeviceManager.getInstance().isBluetoothEnable()) {
            listTile.setTips(R.string.device_connecting);
        } else {
            listTile.setTips("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Unit W0() {
        HomeAnalytics.analysisTabVisible("mine");
        return Unit.INSTANCE;
    }

    private void W1(@NonNull final ListTile itemView, final boolean visible) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        activity.runOnUiThread(new Runnable() { // from class: a65
            @Override // java.lang.Runnable
            public final void run() {
                itemView.setDotted(visible);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String X0() {
        return "onCreateView...";
    }

    private void X1() {
        HMDeviceType hMDeviceType = HMDeviceType.SHOES;
        HMBaseDevice hMBaseDeviceT0 = t0(hMDeviceType);
        boolean z = hMBaseDeviceT0 != null && hMBaseDeviceT0.isConnected();
        ListTile listTile = this.F.get(hMDeviceType);
        if (listTile == null) {
            return;
        }
        if (z) {
            listTile.setTips(Utils.getShoesDistanceDescription());
        } else if (HMDeviceManager.getInstance().isBluetoothEnable()) {
            listTile.setTips(R.string.device_connecting);
        } else {
            listTile.setTips("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String Y0() {
        return "MineFragment textsize " + Utils.sp2px(this.q, 14.0f) + " text " + HMPersonInfo.getInstance().getUserInfo().getNickname() + " alpha " + this.H;
    }

    private void Y1() {
        HashMap<HMDeviceType, ListTile> map = this.F;
        HMDeviceType hMDeviceType = HMDeviceType.TREADMILL;
        ListTile listTile = map.get(hMDeviceType);
        if (listTile == null) {
            return;
        }
        HMBaseDevice device = HMDeviceManager.getInstance().getDevice(hMDeviceType);
        if (!(device != null && device.isConnected())) {
            if (HMDeviceManager.getInstance().isBluetoothEnable()) {
                listTile.setTips(R.string.device_connecting);
                return;
            } else {
                listTile.setTips("");
                return;
            }
        }
        int i = b.b[((HMBoltClassicDevice) device).getSportState().ordinal()];
        if (i == 1) {
            listTile.setTips(R.string.bolt_state_running);
        } else {
            if (i != 2) {
                return;
            }
            listTile.setTips(R.string.bolt_state_paused);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void Z0(Object obj) throws Exception {
        if (obj instanceof PBInfoChangedEvent) {
            boolean zHasUnconfirmed = PBManager.get().hasUnconfirmed(requireActivity().getApplicationContext());
            this.x.setShowDot(zHasUnconfirmed);
            this.J.setDotted(zHasUnconfirmed);
        }
    }

    private void Z1() {
        HMPersonInfo hMPersonInfo = HMPersonInfo.getInstance();
        if (isAdded()) {
            AuditUserInfoManager.displayAvatar(requireActivity(), hMPersonInfo, requireView().findViewById(R.id.avatar_in_audit), this.h);
        }
        TextView textView = (TextView) requireView().findViewById(R.id.nickname_audit);
        textView.setText(String.format("(%s)", getString(R.string.account_ui_in_audit)));
        AuditUserInfoManager.displayNickname(this.t, textView);
        com.huami.watch.companion.device.Device currentDevice = DeviceManager.getManager(requireActivity()).getCurrentDevice();
        if (DeviceUtil.isSupportAssistant(requireActivity()) && currentDevice != null && currentDevice.isConnected()) {
            this.i.setVisibility(0);
        } else {
            this.i.setVisibility(8);
        }
        RunningManager.setOrUpdateRunnerData();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String a1() {
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void b1(Throwable th) throws Exception {
        HMLog.warn(K, th, new Function0() { // from class: n65
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return MineFragment.a1();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String c1() {
        return "onDestroyView...";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String d1(TreadmillSportEvent treadmillSportEvent) {
        return "treadmillSportEvent: " + treadmillSportEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String e1(HMDeviceConnectionEvent hMDeviceConnectionEvent) {
        return "Connection event :" + hMDeviceConnectionEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String f1(HMDeviceBindEvent hMDeviceBindEvent) {
        return "Bind event :" + hMDeviceBindEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g1(ArrayList arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str = (String) it2.next();
            h0(str);
            m0(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(String type) {
        if (TextUtils.equals(type, RedDotConstant.CHAOHU_WATCH_SKIN)) {
            HMKeeper.setShowWatchFaceRedDot(true);
            this.o.setShowRedDot(HMDeviceSource.MILI_PEYTO.getValue(), true);
            RedDotProvider.getProvider().saveRedDotInfo(RedDotConstant.CHAOHU_WATCH_SKIN);
            EventBus.getDefault().post(new EventMineRedDot(Constant.TYPE_MINE_REDOT_WATCH_FACE));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h1() {
        return "";
    }

    private void i0() {
        MessageManager messageManager = this.k;
        if (messageManager != null) {
            this.j.setDotted(messageManager.hasNewMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void i1(Throwable th) {
        HMLog.error(K, "", th, new Function0() { // from class: t65
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return MineFragment.h1();
            }
        });
    }

    private void initViews(View view) {
        this.e = view.findViewById(R.id.mine_toolbar);
        this.f = view.findViewById(R.id.top_mask);
        if (C0()) {
            this.f.setAlpha(1.0f);
            ((ImageView) view.findViewById(R.id.mine_header_bg)).setImageResource(R.drawable.mine_home_header_bg_night);
        }
        boolean z = false;
        this.e.setVisibility(0);
        this.g = (TextView) view.findViewById(R.id.tv_red_dot);
        int statusBarHeight = BaseTitleActivity.getStatusBarHeight(view.getContext());
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) this.e.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = statusBarHeight;
        this.e.setLayoutParams(layoutParams);
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.f.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) layoutParams2).height = statusBarHeight;
        this.f.setLayoutParams(layoutParams2);
        view.findViewById(R.id.mine_message_layout).setOnClickListener(new View.OnClickListener() { // from class: s65
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.N0(view2);
            }
        });
        HMScrollView hMScrollView = (HMScrollView) view.findViewById(R.id.mine_hmscrollview);
        ImageView imageView = (ImageView) view.findViewById(R.id.mine_person_icon);
        this.h = imageView;
        imageView.setOnClickListener(this);
        TypefaceTextView typefaceTextView = (TypefaceTextView) view.findViewById(R.id.mine_name);
        this.t = typefaceTextView;
        typefaceTextView.setTextColor(ContextCompat.getColor(requireContext(), R.color.s1));
        this.t.setText(HMPersonInfo.getInstance().getUserInfo().getNickname());
        hMScrollView.setOnHMScrollViewStateChanged(new a());
        TextView textView = (TextView) view.findViewById(R.id.mine_add_device_bound);
        this.v = textView;
        textView.setOnClickListener(this);
        TextView textView2 = (TextView) view.findViewById(R.id.tv_add_device_title);
        this.u = textView2;
        textView2.setOnClickListener(this);
        ImageView imageView2 = (ImageView) view.findViewById(R.id.iv_device_fold);
        this.w = imageView2;
        imageView2.setOnClickListener(this);
        ListTile listTile = (ListTile) view.findViewById(R.id.item_feed_back);
        listTile.setOnClickListener(new View.OnClickListener() { // from class: w55
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.O0(view2);
            }
        });
        listTile.setOnLongClickListener(new View.OnLongClickListener() { // from class: r55
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return this.a.P0(view2);
            }
        });
        view.findViewById(R.id.item_settings).setOnLongClickListener(new View.OnLongClickListener() { // from class: p55
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return this.a.Q0(view2);
            }
        });
        ListTile listTile2 = (ListTile) view.findViewById(R.id.item_analyse);
        listTile2.setOnClickListener(this);
        this.J = (ListTile) view.findViewById(R.id.item_my_record);
        View viewFindViewById = view.findViewById(R.id.mine_group);
        if (Utils.isOverseaUser()) {
            viewFindViewById.setVisibility(8);
        } else {
            viewFindViewById.setVisibility(0);
        }
        if (HMLoginManager.isUnknown()) {
            if (Locale.SIMPLIFIED_CHINESE.getCountry().equals(Locale.getDefault().getCountry())) {
                this.J.setVisibility(8);
            } else {
                listTile2.setVisibility(0);
                this.J.setVisibility(0);
                this.J.setDotted(PBManager.get().hasUnconfirmed(requireActivity().getApplicationContext()));
            }
        } else if (HMLoginManager.isInMainland()) {
            this.J.setVisibility(8);
        } else {
            listTile2.setVisibility(0);
            this.J.setVisibility(0);
            this.J.setDotted(PBManager.get().hasUnconfirmed(requireActivity().getApplicationContext()));
        }
        ListTile listTile3 = (ListTile) view.findViewById(R.id.item_friends);
        this.j = listTile3;
        listTile3.setVisibility(0);
        this.j.setOnClickListener(this);
        ListTile listTile4 = (ListTile) view.findViewById(R.id.item_settings);
        listTile4.setOnClickListener(this);
        listTile4.setDotted(Utils.checkRedRotOfAppUpgrade());
        ListTile listTile5 = (ListTile) view.findViewById(R.id.item_my_medical_card);
        ListTile listTile6 = (ListTile) view.findViewById(R.id.item_my_order);
        if (!Utils.isOverseaUser()) {
            listTile5.setVisibility(0);
            listTile5.setOnClickListener(this);
            listTile6.setVisibility(0);
            listTile6.setOnClickListener(this);
        }
        ListTile listTile7 = (ListTile) view.findViewById(R.id.item_sport_goal);
        listTile7.setOnClickListener(this);
        listTile7.setOnLongClickListener(new View.OnLongClickListener() { // from class: q55
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view2) {
                return this.a.R0(view2);
            }
        });
        ListTile listTile8 = (ListTile) view.findViewById(R.id.item_smart);
        this.i = listTile8;
        listTile8.setOnClickListener(this);
        ListTile listTile9 = (ListTile) view.findViewById(R.id.item_third);
        listTile9.setOnClickListener(this);
        ListTile listTile10 = this.J;
        if (listTile10 != null) {
            listTile10.setOnClickListener(this);
        }
        boolean z2 = GlobalConfig.get().isBuildPlay() && (HMLoginManager.isUnknown() || HMLoginManager.isInNonContinental()) && !E0();
        if (!GlobalConfig.get().isBuildPlay() && HMLoginManager.isInNonContinental() && !D0()) {
            z = true;
        }
        if (z2 || z) {
            listTile9.setVisibility(8);
        }
        this.y = (LinearLayout) view.findViewById(R.id.item_nps_layout);
        view.findViewById(R.id.medal).setOnClickListener(this);
        view.findViewById(R.id.report).setOnClickListener(this);
        TypefaceTextView typefaceTextView2 = (TypefaceTextView) view.findViewById(R.id.mine_goals);
        this.s = typefaceTextView2;
        typefaceTextView2.setOnClickListener(new View.OnClickListener() { // from class: h65
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.a.T0(view2);
            }
        });
        R1();
        view.findViewById(R.id.mine_course).setOnClickListener(this);
        view.findViewById(R.id.mine_order).setOnClickListener(this);
        view.findViewById(R.id.mine_health).setOnClickListener(this);
        this.d = (LinearLayout) this.G.findViewById(R.id.mine_device_list);
        this.x = (ImageItem) view.findViewById(R.id.mine_order);
        this.x.setShowDot(PBManager.get().hasUnconfirmed(requireActivity().getApplicationContext()));
        if (GlobalUtil.isInnerFlavor()) {
            this.h.setOnLongClickListener(new View.OnLongClickListener() { // from class: o55
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return this.a.U0(view2);
                }
            });
        }
        B0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j0(String type) {
        if (TextUtils.equals(type, RedDotConstant.DISCOVERY_TYPE_ICON_MEDAL)) {
            HMKeeper.setShowMedalRedDot(true);
            RedDotProvider.getProvider().saveRedDotInfo(RedDotConstant.DISCOVERY_TYPE_ICON_MEDAL);
            EventBus.getDefault().post(new EventMineRedDot("medal"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String j1() {
        return "do nothing return...";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k0(String type) {
        if (TextUtils.equals(type, RedDotConstant.DISCOVERY_TYPE_ICON_MESSAGE_CENTER)) {
            HMKeeper.setShowMsgCenterRedDot(true);
            RedDotProvider.getProvider().saveRedDotInfo(RedDotConstant.DISCOVERY_TYPE_ICON_MESSAGE_CENTER);
            EventBus.getDefault().post(new EventMineRedDot(Constant.TYPE_MINE_REDOT_MESSAGE_CENTER));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ String k1(boolean z) {
        return "setUserVisibleHint...isVisibleToUser::" + z + "   mSubscription::" + this.n + "   mRedDotRequest::" + this.m;
    }

    private View.OnClickListener l0(final View.OnClickListener onClickListener) {
        return new View.OnClickListener() { // from class: l55
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MineFragment.F0(onClickListener, view);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String l1() {
        return "device lists is empty";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0(String type) {
        if (TextUtils.equals(type, RedDotConstant.TEMPO_WATCH_SKIN)) {
            HMKeeper.setShowTempoWatchFaceRedDot(true);
            this.o.setShowRedDot(HMDeviceSource.MILI_TEMPO.getValue(), true);
            RedDotProvider.getProvider().saveRedDotInfo(RedDotConstant.TEMPO_WATCH_SKIN);
            EventBus.getDefault().post(new EventMineRedDot(Constant.TYPE_MINE_TEMPO_REDOT_WATCH_FACE));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String m1(List list) {
        return "device lists contains " + list.size() + " devices";
    }

    private void n0(@NonNull ListTile itemView, @NonNull HMDeviceType deviceType) {
        o0(itemView, deviceType, t0(deviceType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void n1(boolean z, ListTile listTile, HMDeviceType hMDeviceType, HMDeviceSource hMDeviceSource, Device device, View view) {
        if (Utils.isFastDoubleClick(view)) {
            return;
        }
        if (z) {
            if (listTile.isIndicatorVisible()) {
                listTile.setIndicatorIcon((Drawable) null);
                G1(hMDeviceType);
            }
            this.c.navigateToDeviceSetting(requireActivity(), hMDeviceSource);
            E1(StatEvent.EVENT_MINE_OUT, StatEvent.VALUE_MINE_DEVICE);
            E1(StatEvent.EVENT_MINE_OUT, StatEvent.VALUE_MINE_BAND);
        } else if (PolicyTipUtil.userInfoPolicyApi().interceptWithShowTip()) {
            return;
        } else {
            this.c.navigateToUnused(getContext(), device);
        }
        Analytics.recordEvent(new CountEventBuilder(StatEvent.MINE_DEVICE_C).addExtra("tp", "detail").addExtra("source", String.valueOf(device.getDevice_source().intValue())));
    }

    private void o0(@NonNull final ListTile itemView, @NonNull final HMDeviceType deviceType, @Nullable final HMBaseDevice device) {
        final boolean zIsIndicatorVisible = itemView.isIndicatorVisible();
        SmartExecutor.getExecutor().execute(new Runnable() { // from class: b65
            @Override // java.lang.Runnable
            public final void run() {
                this.a.G0(deviceType, zIsIndicatorVisible, device, itemView);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void o1(boolean z, Device device, View view) {
        if (z) {
            startActivity(new Intent(requireActivity(), (Class<?>) HMWeightSettingActivity.class));
            E1(StatEvent.EVENT_MINE_OUT, StatEvent.VALUE_MINE_DEVICE);
            E1(StatEvent.EVENT_MINE_OUT, StatEvent.VALUE_MINE_SCALES);
        } else {
            this.c.navigateToUnused(getContext(), device);
        }
        Analytics.recordEvent(new CountEventBuilder(StatEvent.MINE_DEVICE_C).addExtra("tp", "detail").addExtra("source", String.valueOf(device.getDevice_source().intValue())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p0(String type) {
        if (TextUtils.equals(type, RedDotConstant.DISCOVERY_TYPE_ICON_DATA_REPORT)) {
            HMKeeper.setShowWeeklyReportRedDot(true);
            RedDotProvider.getProvider().saveRedDotInfo(RedDotConstant.DISCOVERY_TYPE_ICON_DATA_REPORT);
            EventBus.getDefault().post(new EventMineRedDot(Constant.TYPE_MINE_REDOT_WEEK_REPORT));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void p1(boolean z, Device device, View view) {
        if (z) {
            E1(StatEvent.EVENT_MINE_OUT, StatEvent.VALUE_MINE_DEVICE);
            if (HMDeviceManager.getInstance().getBoundDeviceSource(HMDeviceType.SHOES) == HMDeviceSource.SHOES_MARS) {
                startActivity(new Intent(requireActivity(), (Class<?>) HMNormandySettingActivity.class));
            } else {
                startActivity(new Intent(requireActivity(), (Class<?>) HMShoesSettingActivity.class));
                E1(StatEvent.EVENT_MINE_OUT, StatEvent.VALUE_MINE_SHOE);
            }
        } else {
            this.c.navigateToUnused(getContext(), device);
        }
        Analytics.recordEvent(new CountEventBuilder(StatEvent.MINE_DEVICE_C).addExtra("tp", "detail").addExtra("source", String.valueOf(device.getDevice_source().intValue())));
    }

    private ListTile q0(final NpsDevice device) {
        final ListTile listTileR0 = r0(String.format(getResources().getString(R.string.nps_mine_multi_title), device.getName(), getResources().getString(R.string.nps_mine_title)));
        listTileR0.setOnClickListener(new View.OnClickListener() { // from class: a75
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.H0(listTileR0, device, view);
            }
        });
        return listTileR0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void q1(boolean z, Device device, View view) {
        if (z) {
            Bundle bundle = new Bundle();
            bundle.putString(BaseDeviceStatusActivity.KEY_AREA, SelectAreaHelper.getArea().getValue());
            BaseDeviceStatusActivity.invokeDeviceStatusActivity(requireActivity(), device.getDevice_address(), bundle);
        } else {
            this.c.navigateToUnused(getContext(), device);
        }
        Analytics.recordEvent(new CountEventBuilder(StatEvent.MINE_DEVICE_C).addExtra("tp", "detail").addExtra("source", String.valueOf(device.getDevice_source().intValue())));
    }

    private ListTile r0(String title) {
        ListTile listTile = new ListTile(requireContext());
        listTile.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        listTile.setTitle(title);
        return listTile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit r1(boolean z, ListTile listTile, HMDeviceType hMDeviceType, Device device, View view) {
        if (z) {
            if (listTile.isIndicatorVisible()) {
                listTile.setIndicatorIcon((Drawable) null);
                G1(hMDeviceType);
            }
            startActivity(new Intent(requireActivity(), (Class<?>) HmEarbudMusicActivity.class));
        } else {
            this.c.navigateToUnused(getContext(), device);
        }
        return null;
    }

    private void s0() {
        HMLog.debug(K, new Function0() { // from class: k65
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return MineFragment.I0();
            }
        });
        K1();
        Z1();
        i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s1(boolean z, Device device, View view) {
        if (z) {
            startActivity(new Intent(requireActivity(), (Class<?>) HMBlueMonkeySettingActivity.class));
        } else {
            this.c.navigateToUnused(getContext(), device);
        }
        Analytics.recordEvent(new CountEventBuilder(StatEvent.MINE_DEVICE_C).addExtra("tp", "detail").addExtra("source", String.valueOf(device.getDevice_source().intValue())));
    }

    @Nullable
    private HMBaseDevice t0(HMDeviceType type) {
        return HMDeviceManager.getInstance().getDevice(type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void t1(boolean z, Device device, View view) {
        if (z) {
            startActivity(new Intent(requireActivity(), (Class<?>) HMTreadmillSettingActivity.class));
        } else {
            this.c.navigateToUnused(getContext(), device);
        }
        Analytics.recordEvent(new CountEventBuilder(StatEvent.MINE_DEVICE_C).addExtra("tp", "detail").addExtra("source", String.valueOf(device.getDevice_source().intValue())));
    }

    private int u0(BatteryInfo battery, boolean isCache) {
        if (isCache || battery == null) {
            return Color.parseColor("#4d000000");
        }
        return battery.getLevel() <= 20 ? Color.parseColor("#c84d67") : Color.parseColor("#80000000");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void u1(ListTile listTile, HMDeviceType hMDeviceType, Device device, View view) {
        if (listTile.isIndicatorVisible()) {
            listTile.setIndicatorIcon((Drawable) null);
            G1(hMDeviceType);
        }
        HMHeadsetSettingActivity.start(listTile.getContext(), device.getDevice_address());
        Analytics.recordEvent(new CountEventBuilder(StatEvent.MINE_DEVICE_C).addExtra("tp", "detail").addExtra("source", String.valueOf(device.getDevice_source().intValue())));
    }

    private SpannableString v0(BatteryInfo left, boolean isLeftCache, BatteryInfo right, boolean isRightCache) {
        String string = getString(R.string.earbud_battery_detail_left, w0(left));
        SpannableString spannableString = new SpannableString(string + "\n" + getString(R.string.earbud_battery_detail_right, w0(right)));
        spannableString.setSpan(new ForegroundColorSpan(u0(left, isLeftCache)), 0, string.length(), 33);
        spannableString.setSpan(new ForegroundColorSpan(u0(right, isRightCache)), string.length() + 1, spannableString.length(), 33);
        return spannableString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String v1() {
        return "itemView is null";
    }

    private String w0(BatteryInfo battery) {
        if (battery == null) {
            return getString(R.string.earbud_battery_disable);
        }
        return getString(R.string.battery_level_mili_setting, battery.getLevel() + "");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String w1() {
        return "itemView is null";
    }

    @Nullable
    private String x0(@NonNull HMDeviceType type, @Nullable HMBaseDevice device) {
        DeviceInfo deviceInfo;
        if (type == HMDeviceType.MILI) {
            return HMKeeper.getFwUpgradeShowRedDotVer("");
        }
        if (device == null || (deviceInfo = device.getDeviceInfo()) == null || deviceInfo.getSerialNumber() == null) {
            return null;
        }
        return HMKeeper.getFwUpgradeRedDotHideVersion(deviceInfo.getSerialNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String x1() {
        return "itemView is null";
    }

    private void y0() {
        UserInfoModuleInitializerKt.getUserInfoService().navigateToPersonInfo(requireActivity(), null);
    }

    private void z0() {
        this.A.getValue().getUserNoticeResult().observe(this, new Observer() { // from class: s55
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                this.a.J0((Resource) obj);
            }
        });
        A1();
    }

    private void z1() {
        startActivity(new Intent(requireActivity(), (Class<?>) HMUnifySelectDeviceActivity.class));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.mine_health) {
            HealthLabelHelper.openRecordLabelPage(requireContext());
            return;
        }
        if (id == R.id.mine_course) {
            KoinApplication koinApplicationProxyOrNull = KoinAdapterKt.getKoinApplicationProxyOrNull();
            if (koinApplicationProxyOrNull != null) {
                TrainingModuleKt.trainingNavigator(koinApplicationProxyOrNull.getKoin()).navigateToJoinedTrainingList(v.getContext());
            }
            Analytics.recordEvent(new CountEventBuilder(StatEvent.MINE_KINGKONG_C).addExtra("tp", "course"));
            return;
        }
        if (id == R.id.report) {
            if (Utils.isFastDoubleClick(v)) {
                return;
            }
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EVENT_MINE_OUT).setValue(StatEvent.VALUE_MINE_WEEKLY_REPORT));
            WebHelper.launch(HMServerDef.getHost() + M);
            Analytics.recordEvent(new CountEventBuilder(StatEvent.MINE_KINGKONG_C).addExtra("tp", StatEvent.MINE_KINGKONG_C_WEEKLY_VALUE));
            HMKeeper.setShowWeeklyReportRedDot(false);
            return;
        }
        if (id == R.id.item_my_record || id == R.id.mine_order) {
            if (Utils.isFastDoubleClick(v)) {
                return;
            }
            this.x.setShowDot(false);
            this.J.setDotted(false);
            startActivity(new Intent(requireActivity(), (Class<?>) PBTabActivity.class));
            Analytics.recordEvent(new CountEventBuilder(StatEvent.MINE_PB_C));
            return;
        }
        if (id == R.id.medal) {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EVENT_MINE_OUT).setValue(StatEvent.VALUE_MINE_MEDAL));
            WebHelper.launch(HMServerDef.getHost() + L);
            HMKeeper.setShowMedalRedDot(false);
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EVENT_MEDAL_VIEWNUM).setValue(StatEvent.VALUE_REDDOT));
            Analytics.recordEvent(new CountEventBuilder(StatEvent.MINE_KINGKONG_C).addExtra("tp", "medal"));
            return;
        }
        if (id == R.id.tv_add_device_title || id == R.id.mine_add_device_bound) {
            if (PolicyTipUtil.userInfoPolicyApi().interceptWithShowTip()) {
                return;
            }
            z1();
            Analytics.recordEvent(new CountEventBuilder(StatEvent.MINE_DEVICE_ADD_C));
            return;
        }
        if (id == R.id.item_third) {
            startActivity(new Intent(requireActivity(), (Class<?>) ThirdBindActivity.class));
            Analytics.recordEvent(new CountEventBuilder(StatEvent.MINE_THIRDPORT_C));
            return;
        }
        if (id == R.id.mine_person_icon) {
            y0();
            Analytics.recordEvent(new CountEventBuilder(StatEvent.MINE_OWNER_ICON_C));
            return;
        }
        if (id == R.id.item_friends) {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EVENT_MINE_OUT).setValue(StatEvent.VALUE_MINE_RELATIVES));
            startActivity(RelationServiceKt.getRelationService().friendActivityIntent(requireActivity()));
            Analytics.recordEvent(new CountEventBuilder(StatEvent.MINE_FRIEND_C));
            return;
        }
        if (id == R.id.item_settings) {
            SettingActivity.lunch(requireActivity(), "Set");
            Analytics.recordEvent(new CountEventBuilder(StatEvent.MINE_SETTING_C));
            return;
        }
        if (id == R.id.item_sport_goal) {
            if (PolicyTipUtil.userInfoPolicyApi().interceptWithShowTip()) {
                return;
            }
            startActivity(new Intent(requireActivity(), (Class<?>) GoalSummaryActivity.class));
            Analytics.recordEvent(new CountEventBuilder(StatEvent.MINE_GOAL_C));
            return;
        }
        if (id == R.id.item_analyse) {
            startActivity(new Intent(requireActivity(), (Class<?>) AnalyseActivity.class));
            return;
        }
        if (id == R.id.item_gethelp) {
            WebHelper.launch(HMConfig.Url.helpUrl());
            Analytics.recordEvent(new CountEventBuilder(StatEvent.MINE_FAQ_C));
            return;
        }
        if (id == R.id.item_keep_alive) {
            Analytics.recordEvent(new CountEventBuilder(StatEvent.EVENT_MINE_OUT).setValue("Mine_Keepalive"));
            startActivity(new Intent(requireActivity(), (Class<?>) KeepAliveActivity.class));
            return;
        }
        if (id == R.id.item_smart) {
            startActivity(new Intent(requireActivity(), (Class<?>) SmartActivity.class));
            return;
        }
        if (id == R.id.iv_device_fold) {
            boolean z = !this.a;
            this.a = z;
            this.w.setImageResource(z ? R.drawable.ic_my_device_fold : R.drawable.ic_my_device_unfold);
            K1();
            return;
        }
        if (id == R.id.item_my_medical_card) {
            this.B.getValue().getMedicalCardUrl();
        } else if (id == R.id.item_my_order) {
            this.B.getValue().getMineOrderUrl();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.o = DeviceEntranceRedDotInfo.getInstance();
        this.m = new RedDotRequest(new RedDotParamsClient());
        CompositeSubscription compositeSubscription = new CompositeSubscription();
        this.n = compositeSubscription;
        compositeSubscription.add(this.m.requestMineRedDot().subscribe(new c(this), new e()));
        this.l = new d(this);
        z0();
        if (Utils.isOverseaUser()) {
            return;
        }
        A0();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        HMLog.debug(K, new Function0() { // from class: p65
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return MineFragment.X0();
            }
        });
        if (this.G == null) {
            this.G = inflater.inflate((GlobalConfig.get().isBuildMidong() && Utils.isOverseaUser()) ? R.layout.fragment_mine_oversea_layout : R.layout.fragment_mine_layout, container, false);
        }
        initViews(this.G);
        EventBus.getDefault().register(this);
        MessageManager messageManager = MessageManager.getDefault(BraceletApp.getContext());
        this.k = messageManager;
        messageManager.register(this);
        i0();
        if (B1() && ((MainTabActivity) this.p).isTabOnMine() && !Float.isNaN(this.H)) {
            ((BaseTitleActivity) this.p).getTitleTextView().setTextSize(17.3f);
            ((BaseTitleActivity) this.p).getTitleTextView().setAlpha(this.H);
            if (C1()) {
                HMLog.debug(K, new Function0() { // from class: f65
                    @Override // kotlin.jvm.functions.Function0
                    /* JADX INFO: renamed from: invoke */
                    public final Object getA() {
                        return this.a.Y0();
                    }
                });
            }
        }
        this.I = RxBus.get().toObservable().subscribe(new Consumer() { // from class: y55
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                this.a.Z0(obj);
            }
        }, new Consumer() { // from class: z55
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) throws Exception {
                MineFragment.b1((Throwable) obj);
            }
        });
        Runnable runnable = this.r;
        if (runnable != null) {
            runnable.run();
            this.r = null;
        }
        return this.G;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        HMLog.debug(K, new Function0() { // from class: m65
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return MineFragment.c1();
            }
        });
        EventBus.getDefault().unregister(this);
        this.k.unregister(this);
        CompositeSubscription compositeSubscription = this.n;
        if (compositeSubscription != null && !compositeSubscription.isUnsubscribed()) {
            this.n.unsubscribe();
        }
        Disposable disposable = this.I;
        if (disposable != null) {
            disposable.dispose();
        }
        super.onDestroyView();
    }

    public void onEventMainThread(EventBluetooth eventBluetooth) {
        if (eventBluetooth.isOn) {
            return;
        }
        ListTile listTile = this.F.get(HMDeviceType.MILI);
        Objects.requireNonNull(listTile);
        listTile.setTips("");
        ListTile listTile2 = this.F.get(HMDeviceType.SHOES);
        Objects.requireNonNull(listTile2);
        listTile2.setTips("");
        ListTile listTile3 = this.F.get(HMDeviceType.OTHER);
        Objects.requireNonNull(listTile3);
        listTile3.setTips("");
        ListTile listTile4 = this.F.get(HMDeviceType.TREADMILL);
        Objects.requireNonNull(listTile4);
        listTile4.setTips("");
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        this.E.trackOnHiddenChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.E.trackOnPause();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        HMLog.d(K, "onResume...", new Object[0]);
        this.E.trackOnResume();
        if (B1() && !((MainTabActivity) this.p).isTabOnMine()) {
            HMLog.debug(K, new Function0() { // from class: r65
                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: invoke */
                public final Object getA() {
                    return MineFragment.j1();
                }
            });
            return;
        }
        s0();
        if (getActivity() != null) {
            ((MainTabActivity) getActivity()).checkUnreadMessageCount();
        }
    }

    public void setPendingAction(Runnable action) {
        this.r = action;
    }

    @Override // com.xiaomi.hm.health.fragment.BaseFragment, androidx.fragment.app.Fragment
    public void setUserVisibleHint(final boolean isVisibleToUser) {
        CompositeSubscription compositeSubscription;
        RedDotRequest redDotRequest;
        super.setUserVisibleHint(isVisibleToUser);
        HMLog.debug(K, new Function0() { // from class: g65
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return this.a.k1(isVisibleToUser);
            }
        });
        this.E.trackOnUserVisibleHint();
        if (!isVisibleToUser || (compositeSubscription = this.n) == null || (redDotRequest = this.m) == null) {
            return;
        }
        compositeSubscription.add(redDotRequest.requestMsgBoxRedDot().subscribe(new c(this), new e()));
        D1();
    }

    public void onEventMainThread(HMDeviceBatteryEvent event) {
        if (event.getDeviceType() == HMDeviceType.MILI) {
            S1();
            return;
        }
        if (event.getDeviceType() == HMDeviceType.EARBUD) {
            M1();
        } else if (event.getDeviceType() == HMDeviceType.OTHER) {
            U1();
        } else if (event.getDeviceType() == HMDeviceType.HEADSET) {
            P1();
        }
    }

    public void onEventMainThread(HeadsetDevice.HeadsetDeviceState state) {
        P1();
    }

    public void onEventMainThread(EventNewMessageReceived event) {
        i0();
    }

    public void onEventMainThread(final TreadmillSportEvent event) {
        HMLog.info(K, new Function0() { // from class: e65
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return MineFragment.d1(event);
            }
        });
        ListTile listTile = this.F.get(HMDeviceType.TREADMILL);
        if (listTile == null) {
            return;
        }
        int i = b.a[event.getCommand().ordinal()];
        if (i == 1 || i == 2) {
            listTile.setTips(R.string.bolt_state_running);
        } else if (i == 3) {
            listTile.setTips(R.string.bolt_state_paused);
        } else {
            if (i != 4) {
                return;
            }
            listTile.setTips("");
        }
    }

    public void onEventMainThread(EventFwCheckResult event) {
        if (event.isSuccess) {
            HMDeviceManager hMDeviceManager = HMDeviceManager.getInstance();
            HMDeviceType hMDeviceType = HMDeviceType.TREADMILL;
            if (hMDeviceManager.hasBound(hMDeviceType)) {
                HMFwOnlineUpgradeManager.getInstance().checkFwUpgrade(getContext(), hMDeviceType, false);
            }
        }
    }

    public void onEventMainThread(final HMDeviceConnectionEvent event) {
        HMLog.info(K, new Function0() { // from class: d65
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return MineFragment.e1(event);
            }
        });
        HMDeviceType deviceType = event.getDeviceType();
        if (deviceType == HMDeviceType.MILI) {
            T1();
            return;
        }
        if (deviceType == HMDeviceType.SHOES) {
            X1();
            return;
        }
        if (deviceType == HMDeviceType.OTHER) {
            V1();
            return;
        }
        if (deviceType == HMDeviceType.EARBUD) {
            N1();
        } else if (deviceType == HMDeviceType.TREADMILL) {
            Y1();
        } else if (deviceType == HMDeviceType.HEADSET) {
            P1();
        }
    }

    public void onEventMainThread(HMActiveDeviceEvent event) {
        L1();
        HMDeviceType deviceType = event.getDeviceType();
        if (deviceType == HMDeviceType.MILI) {
            T1();
            return;
        }
        if (deviceType == HMDeviceType.SHOES) {
            X1();
            return;
        }
        if (deviceType == HMDeviceType.OTHER) {
            V1();
        } else if (deviceType == HMDeviceType.HEADSET) {
            P1();
        } else if (deviceType == HMDeviceType.EARBUD) {
            N1();
        }
    }

    public void onEventMainThread(final HMDeviceBindEvent event) {
        CompositeSubscription compositeSubscription;
        RedDotRequest redDotRequest;
        HMLog.info(K, new Function0() { // from class: c65
            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: invoke */
            public final Object getA() {
                return MineFragment.f1(event);
            }
        });
        L1();
        if (event.getDeviceType() != HMDeviceType.MILI || (compositeSubscription = this.n) == null || (redDotRequest = this.m) == null) {
            return;
        }
        compositeSubscription.add(redDotRequest.requestWatchFaceRedDot().subscribe(new Action1() { // from class: x65
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                this.a.g1((ArrayList) obj);
            }
        }, new Action1() { // from class: y65
            @Override // rx.functions.Action1
            public final void call(Object obj) {
                MineFragment.i1((Throwable) obj);
            }
        }));
    }

    public void onEventMainThread(EventTotalAnalysisJobFinished e2) {
        X1();
        R1();
    }
}
