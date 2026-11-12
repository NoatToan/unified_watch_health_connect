package com.xiaomi.hm.health.device;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.ItemTouchHelper;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.core.device.wifi_settings.ui.CenterDialogFragment;
import com.huami.core.device.wifi_settings.ui.WifiDeviceStatusFragment;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.sleepassistant.lib.ui.base.ext.ViewExKt;
import com.huami.tools.analytics.DbUtils;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.HMWeightSmartCardsListActivity;
import com.xiaomi.hm.health.device.UpdateState;
import com.xiaomi.hm.health.device.event.HMDeviceConnectionEvent;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 >2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001>B\u0007¢\u0006\u0004\b<\u0010=J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\b\u0010\u0006\u001a\u00020\u0004H\u0002J\b\u0010\u0007\u001a\u00020\u0004H\u0002J\b\u0010\b\u001a\u00020\u0004H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0002J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0010\u001a\u00020\u0004H\u0002J\b\u0010\u0011\u001a\u00020\u0004H\u0002J\u0012\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0015\u001a\u00020\u0004H\u0016R\u001d\u0010\u001b\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010 \u001a\u00020\u001c8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010%\u001a\u00020!8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b#\u0010$R\u0016\u0010(\u001a\u00020\u00008\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010*\u001a\u00020\u000e8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u0018\u001a\u0004\b\u0017\u0010)R\u001f\u0010.\u001a\u0004\u0018\u00010+8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u0018\u001a\u0004\b\u001d\u0010-R\u001f\u00101\u001a\u0004\u0018\u00010/8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b&\u00100R\u001d\u00104\u001a\u0002028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0018\u001a\u0004\b,\u00103R\u001d\u00108\u001a\u0002058B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\u0018\u001a\u0004\b\"\u00107R\u0018\u0010;\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010:¨\u0006?"}, d2 = {"Lcom/xiaomi/hm/health/device/HMWeightSmartCardsListActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lcom/xiaomi/hm/health/device/SmartCardAdapter$OnCardsMaxListener;", "Lorg/koin/core/component/KoinComponent;", "", LogUtil.D, "H", "initRecyclerView", "K", "G", "", "enable", "Q", "P", "Landroid/widget/LinearLayout;", "E", "u", "R", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onCardsMax", "Lcom/huami/devicex/manager/DeviceManagerApi;", "x", "Lkotlin/Lazy;", "w", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Landroidx/recyclerview/widget/RecyclerView;", "y", "B", "()Landroidx/recyclerview/widget/RecyclerView;", "mRecyclerView", "Lcom/xiaomi/hm/health/device/SmartCardAdapter;", "z", "v", "()Lcom/xiaomi/hm/health/device/SmartCardAdapter;", "adapter", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/xiaomi/hm/health/device/HMWeightSmartCardsListActivity;", DbUtils.Const.Table.CONTEXT, "()Landroid/widget/LinearLayout;", "footerView", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "C", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "hmWeightDevice", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "mDeviceSource", "Lcom/xiaomi/hm/health/device/WeightSettingViewModel;", "()Lcom/xiaomi/hm/health/device/WeightSettingViewModel;", "mWeightSettingViewModel", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "F", "()Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "loadingHelper", "Lcom/huami/core/device/wifi_settings/ui/WifiDeviceStatusFragment;", "Lcom/huami/core/device/wifi_settings/ui/WifiDeviceStatusFragment;", "statusFragment", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HMWeightSmartCardsListActivity extends BaseTitleActivity implements SmartCardAdapter.OnCardsMaxListener, KoinComponent {

    @NotNull
    public static final String KEY_DEVICE_SOURCE = "deviceSource";

    @NotNull
    public static final String TAG = "HMSmartCardsListActivity";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final HMWeightSmartCardsListActivity context;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final Lazy footerView;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private final Lazy hmWeightDevice;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceSource;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    private final Lazy mWeightSettingViewModel;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @NotNull
    private final Lazy loadingHelper;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @Nullable
    private WifiDeviceStatusFragment statusFragment;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy mRecyclerView;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Lazy adapter;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[UpdateState.values().length];
            iArr[UpdateState.LOADING.ordinal()] = 1;
            iArr[UpdateState.SUCCESS.ordinal()] = 2;
            iArr[UpdateState.SAVING.ordinal()] = 3;
            iArr[UpdateState.SAVE_FAIL.ordinal()] = 4;
            iArr[UpdateState.SAVE_SUCCESS.ordinal()] = 5;
            iArr[UpdateState.FAIL.ordinal()] = 6;
            iArr[UpdateState.TIMEOUT.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/SmartCardAdapter;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<SmartCardAdapter> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final SmartCardAdapter getA() {
            return new SmartCardAdapter(HMWeightSmartCardsListActivity.this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/widget/LinearLayout;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<LinearLayout> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LinearLayout getA() {
            return HMWeightSmartCardsListActivity.this.E();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<HMBaseDevice> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMBaseDevice getA() {
            return HMWeightSmartCardsListActivity.this.w().getDevice(HMDeviceType.WEIGHT);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<LoadingDialogHelper> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final LoadingDialogHelper getA() {
            return new LoadingDialogHelper(HMWeightSmartCardsListActivity.this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<HMDeviceSource> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMDeviceSource getA() {
            Serializable serializableExtra = HMWeightSmartCardsListActivity.this.getIntent().getSerializableExtra("deviceSource");
            if (serializableExtra == null) {
                return null;
            }
            return (HMDeviceSource) serializableExtra;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroidx/recyclerview/widget/RecyclerView;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<RecyclerView> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final RecyclerView getA() {
            return (RecyclerView) HMWeightSmartCardsListActivity.this.findViewById(R.id.rv_app_cards);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/device/WeightSettingViewModel;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<WeightSettingViewModel> {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final WeightSettingViewModel getA() {
            return (WeightSettingViewModel) new ViewModelProvider(HMWeightSmartCardsListActivity.this).get(WeightSettingViewModel.class);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HMWeightSmartCardsListActivity() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.HMWeightSmartCardsListActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        this.mRecyclerView = LazyKt__LazyJVMKt.lazy(new f());
        this.adapter = LazyKt__LazyJVMKt.lazy(new a());
        this.context = this;
        this.footerView = LazyKt__LazyJVMKt.lazy(new b());
        this.hmWeightDevice = LazyKt__LazyJVMKt.lazy(new c());
        this.mDeviceSource = LazyKt__LazyJVMKt.lazy(new e());
        this.mWeightSettingViewModel = LazyKt__LazyJVMKt.lazy(new g());
        this.loadingHelper = LazyKt__LazyJVMKt.lazy(new d());
    }

    private final HMDeviceSource A() {
        return (HMDeviceSource) this.mDeviceSource.getValue();
    }

    private final RecyclerView B() {
        return (RecyclerView) this.mRecyclerView.getValue();
    }

    private final WeightSettingViewModel C() {
        return (WeightSettingViewModel) this.mWeightSettingViewModel.getValue();
    }

    private final void D() {
        HMBaseDevice hMBaseDeviceY = y();
        Q(hMBaseDeviceY == null ? false : hMBaseDeviceY.isConnected());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinearLayout E() {
        LinearLayout linearLayout = new LinearLayout(this.context);
        linearLayout.addView(LayoutInflater.from(this.context).inflate(R.layout.sort_list_app_footer, (ViewGroup) B(), false), new LinearLayout.LayoutParams(-1, -2));
        return linearLayout;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(HMWeightSmartCardsListActivity hMWeightSmartCardsListActivity, List list) {
        int i;
        ((RainbowTitleBar) hMWeightSmartCardsListActivity.findViewById(R.id.actionbar)).setMenuEnable(0, !(list == null || list.isEmpty()));
        LinearLayout linearLayoutX = hMWeightSmartCardsListActivity.x();
        if ((list instanceof Collection) && list.isEmpty()) {
            i = 0;
        } else {
            Iterator it2 = list.iterator();
            i = 0;
            while (it2.hasNext()) {
                if ((((DisplaySettingVo) it2.next()).getStatus() == AppCardStatus.HIDDEN) && (i = i + 1) < 0) {
                    CollectionsKt__CollectionsKt.throwCountOverflow();
                }
            }
        }
        ViewExKt.setVisible(linearLayoutX, i < 1);
    }

    private final void G() {
        HMDeviceSource hMDeviceSourceA = A();
        if (hMDeviceSourceA == null) {
            return;
        }
        WifiDeviceStatusFragment onDeviceStatusChangeListener = WifiDeviceStatusFragment.INSTANCE.newInstance(hMDeviceSourceA.getValue()).setOnDeviceStatusChangeListener(new WifiDeviceStatusFragment.OnDeviceStatusChangeListener() { // from class: com.xiaomi.hm.health.device.HMWeightSmartCardsListActivity$initStatusFragment$1$1
            @Override // com.huami.core.device.wifi_settings.ui.WifiDeviceStatusFragment.OnDeviceStatusChangeListener
            public void onDeviceStatusChange(boolean enable) {
                this.a.Q(enable);
            }
        });
        this.statusFragment = onDeviceStatusChangeListener;
        if (onDeviceStatusChangeListener == null) {
            return;
        }
        onDeviceStatusChangeListener.show(R.id.container, getSupportFragmentManager());
    }

    private final void H() {
        int i = R.id.actionbar;
        ((RainbowTitleBar) findViewById(i)).setTitle(R.string.smart_card_setting);
        ((RainbowTitleBar) findViewById(i)).setNavigationOnClickListener(new View.OnClickListener() { // from class: tq3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMWeightSmartCardsListActivity.I(this.a, view);
            }
        });
        ((RainbowTitleBar) findViewById(i)).setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: yq3
            @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
            public final void onClick(View view, int i2) {
                HMWeightSmartCardsListActivity.J(this.a, view, i2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(HMWeightSmartCardsListActivity hMWeightSmartCardsListActivity, View view) {
        hMWeightSmartCardsListActivity.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(HMWeightSmartCardsListActivity hMWeightSmartCardsListActivity, View view, int i) {
        hMWeightSmartCardsListActivity.P();
    }

    private final void K() {
        if (A() == null) {
            return;
        }
        C().getDeviceStatusLiveData().observe(this, new Observer() { // from class: vq3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMWeightSmartCardsListActivity.N(this.a, (HMDeviceConnectionEvent) obj);
            }
        });
        C().loadAppCards();
        C().getAppCardsLiveData().observe(this, new Observer() { // from class: xq3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMWeightSmartCardsListActivity.O(this.a, (List) obj);
            }
        });
        C().getStatueLiveData().observe(this, new Observer() { // from class: uq3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMWeightSmartCardsListActivity.L(this.a, (UpdateState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(final HMWeightSmartCardsListActivity hMWeightSmartCardsListActivity, UpdateState updateState) {
        if (updateState == null) {
            return;
        }
        switch (WhenMappings.$EnumSwitchMapping$0[updateState.ordinal()]) {
            case 1:
                hMWeightSmartCardsListActivity.z().showLoading();
                break;
            case 2:
                hMWeightSmartCardsListActivity.z().hideLoading();
                break;
            case 3:
                hMWeightSmartCardsListActivity.z().showLoading(R.string.saving);
                break;
            case 4:
                hMWeightSmartCardsListActivity.z().setFail(R.string.save_failed);
                break;
            case 5:
                hMWeightSmartCardsListActivity.z().setSuccess(R.string.saving_success);
                ((RainbowTitleBar) hMWeightSmartCardsListActivity.findViewById(R.id.actionbar)).postDelayed(new Runnable() { // from class: zq3
                    @Override // java.lang.Runnable
                    public final void run() {
                        HMWeightSmartCardsListActivity.M(this.a);
                    }
                }, 500L);
                break;
            case 6:
            case 7:
                hMWeightSmartCardsListActivity.z().setFail(R.string.load_fail);
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(HMWeightSmartCardsListActivity hMWeightSmartCardsListActivity) {
        hMWeightSmartCardsListActivity.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(HMWeightSmartCardsListActivity hMWeightSmartCardsListActivity, HMDeviceConnectionEvent hMDeviceConnectionEvent) {
        if (hMDeviceConnectionEvent == null) {
            return;
        }
        hMWeightSmartCardsListActivity.Q(hMDeviceConnectionEvent.isConnected());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(HMWeightSmartCardsListActivity hMWeightSmartCardsListActivity, List list) {
        int i;
        if (list != null) {
            hMWeightSmartCardsListActivity.v().setNewData(list);
            LinearLayout linearLayoutX = hMWeightSmartCardsListActivity.x();
            if (list.isEmpty()) {
                i = 0;
            } else {
                Iterator it2 = list.iterator();
                i = 0;
                while (it2.hasNext()) {
                    if ((((DisplaySettingVo) it2.next()).getStatus() == AppCardStatus.HIDDEN) && (i = i + 1) < 0) {
                        CollectionsKt__CollectionsKt.throwCountOverflow();
                    }
                }
            }
            ViewExKt.setVisible(linearLayoutX, i < 1);
        }
        ((RainbowTitleBar) hMWeightSmartCardsListActivity.findViewById(R.id.actionbar)).setMenuEnable(0, list.isEmpty());
    }

    private final void P() {
        List<DisplaySettingVo> value = v().getSortedResult().getValue();
        if (value == null) {
            u();
        } else {
            C().updateCards(value);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(boolean enable) {
        ViewExKt.setVisible(findViewById(R.id.mask_view), !enable);
        ((RainbowTitleBar) findViewById(R.id.actionbar)).setMenuEnable(0, enable);
    }

    private final void R() {
        CenterDialogFragment negativeButton$default = CenterDialogFragment.setNegativeButton$default(CenterDialogFragment.Companion.newInstance$default(CenterDialogFragment.INSTANCE, 0, 1, null).setMessage(getString(R.string.tips_smart_card_more_than_max)), getString(R.string.got_it), null, new DialogInterface.OnClickListener() { // from class: rq3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HMWeightSmartCardsListActivity.S(dialogInterface, i);
            }
        }, 2, null);
        negativeButton$default.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: sq3
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                HMWeightSmartCardsListActivity.T(this.a, dialogInterface);
            }
        });
        negativeButton$default.show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(DialogInterface dialogInterface, int i) {
        dialogInterface.dismiss();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(HMWeightSmartCardsListActivity hMWeightSmartCardsListActivity, DialogInterface dialogInterface) {
        hMWeightSmartCardsListActivity.v().setShowDialog(false);
    }

    private final void initRecyclerView() {
        B().setLayoutManager(new LinearLayoutManager(this.context));
        SmartCardAdapter smartCardAdapterV = v();
        smartCardAdapterV.bindToRecyclerView(B());
        smartCardAdapterV.addFooterView(x());
        v().getSortedResult().observe(this, new Observer() { // from class: wq3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HMWeightSmartCardsListActivity.F(this.a, (List) obj);
            }
        });
        new ItemTouchHelper(new ItemTouchHelperCallback(v())).attachToRecyclerView(B());
    }

    private final void u() {
        finish();
    }

    private final SmartCardAdapter v() {
        return (SmartCardAdapter) this.adapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceManagerApi w() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final LinearLayout x() {
        return (LinearLayout) this.footerView.getValue();
    }

    private final HMBaseDevice y() {
        return (HMBaseDevice) this.hmWeightDevice.getValue();
    }

    private final LoadingDialogHelper z() {
        return (LoadingDialogHelper) this.loadingHelper.getValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.SmartCardAdapter.OnCardsMaxListener
    public void onCardsMax() {
        R();
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setStyle(BaseTitleActivity.STYLE.NONE);
        setContentView(R.layout.activity_smart_list);
        D();
        H();
        initRecyclerView();
        K();
        G();
    }
}
