package com.xiaomi.hm.health.device.earbud.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelLazy;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import com.amap.api.mapcore.util.hl;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.exoplayer2.text.ttml.b;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.loc.z;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.BaseEarbudDeviceActivity;
import com.xiaomi.hm.health.device.earbud.activity.HmEarbudPlayTimeSettingActivity;
import com.xiaomi.hm.health.device.earbud.fragment.dialog.EarbudPlayTimeDialog;
import com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0012\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0011\u001a\u00020\u0004H\u0016R\u001d\u0010\u0016\u001a\u00020\u00028T@\u0014X\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u001b\u001a\u00020\u00178B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001e\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/activity/HmEarbudPlayTimeSettingActivity;", "Lcom/xiaomi/hm/health/device/BaseEarbudDeviceActivity;", "Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudDeviceViewModel;", "Lorg/koin/core/component/KoinComponent;", "", "initView", "", "enable", b.r, "", "minute", "", z.j, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "observeData", "onBackPressed", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "getMViewModel", "()Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudDeviceViewModel;", "mViewModel", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "e", hl.k, "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "f", LogUtil.I, "defaultTime", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HmEarbudPlayTimeSettingActivity extends BaseEarbudDeviceActivity<EarbudDeviceViewModel> implements KoinComponent {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(EarbudDeviceViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudPlayTimeSettingActivity$special$$inlined$viewModels$default$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelStore getA() {
            return this.getViewModelStore();
        }
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudPlayTimeSettingActivity$special$$inlined$viewModels$default$1
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke */
        public final ViewModelProvider.Factory getA() {
            return this.getDefaultViewModelProviderFactory();
        }
    });

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private int defaultTime;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {

        /* JADX INFO: renamed from: com.xiaomi.hm.health.device.earbud.activity.HmEarbudPlayTimeSettingActivity$a$a, reason: collision with other inner class name */
        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "minute", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
        public static final class C0806a extends Lambda implements Function1<Integer, Unit> {
            public final /* synthetic */ HmEarbudPlayTimeSettingActivity a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0806a(HmEarbudPlayTimeSettingActivity hmEarbudPlayTimeSettingActivity) {
                super(1);
                this.a = hmEarbudPlayTimeSettingActivity;
            }

            public final void a(int i) {
                this.a.getMViewModel().setPlayTime(i);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
                a(num.intValue());
                return Unit.INSTANCE;
            }
        }

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            EarbudPlayTimeDialog earbudPlayTimeDialog = new EarbudPlayTimeDialog();
            HmEarbudPlayTimeSettingActivity hmEarbudPlayTimeSettingActivity = HmEarbudPlayTimeSettingActivity.this;
            earbudPlayTimeDialog.setCurrentValue(hmEarbudPlayTimeSettingActivity.defaultTime);
            earbudPlayTimeDialog.setOnValueSelect(new C0806a(hmEarbudPlayTimeSettingActivity));
            earbudPlayTimeDialog.show(HmEarbudPlayTimeSettingActivity.this.getSupportFragmentManager(), "Play Time");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HmEarbudPlayTimeSettingActivity() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudPlayTimeSettingActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceUtilsApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), qualifier, objArr);
            }
        });
    }

    private final void initView() {
        BTStatusFragment.newInstance(R.id.status_content, getSupportFragmentManager()).setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudPlayTimeSettingActivity.initView.1
            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            @NotNull
            public HMDeviceType getHMDeviceType() {
                return HMDeviceType.EARBUD;
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                super.onEnableChange(enable);
                HmEarbudPlayTimeSettingActivity.this.p(enable);
            }
        });
        ((ListTile) findViewById(R.id.smart_play)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: r64
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                HmEarbudPlayTimeSettingActivity.l(this.a, compoundButton, z);
            }
        });
        ExtKt.smartClick$default((ListTile) findViewById(R.id.play_time), 0L, new a(), 1, null);
    }

    private final String j(int minute) {
        return minute <= 0 ? getString(R.string.earbud_play_time_no_limit) : k().formatMinute(minute);
    }

    private final DeviceUtilsApi k() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(HmEarbudPlayTimeSettingActivity hmEarbudPlayTimeSettingActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            hmEarbudPlayTimeSettingActivity.getMViewModel().setSmartPlay(z);
        }
        ((ListTile) hmEarbudPlayTimeSettingActivity.findViewById(R.id.play_time)).setEnabled(!z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m(HmEarbudPlayTimeSettingActivity hmEarbudPlayTimeSettingActivity, Integer num) {
        if (num == null) {
            return;
        }
        int iIntValue = num.intValue();
        hmEarbudPlayTimeSettingActivity.defaultTime = iIntValue;
        ((ListTile) hmEarbudPlayTimeSettingActivity.findViewById(R.id.play_time)).setTips(hmEarbudPlayTimeSettingActivity.j(iIntValue));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(HmEarbudPlayTimeSettingActivity hmEarbudPlayTimeSettingActivity, Boolean bool) {
        if (bool == null) {
            return;
        }
        ((ListTile) hmEarbudPlayTimeSettingActivity.findViewById(R.id.smart_play)).setChecked(bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(HmEarbudPlayTimeSettingActivity hmEarbudPlayTimeSettingActivity, View view) {
        hmEarbudPlayTimeSettingActivity.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(boolean enable) {
        ((ListTile) findViewById(R.id.play_time)).setEnabled(enable);
        ((ListTile) findViewById(R.id.smart_play)).setEnabled(enable);
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity
    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity
    @NotNull
    public EarbudDeviceViewModel getMViewModel() {
        return (EarbudDeviceViewModel) this.mViewModel.getValue();
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity
    public void observeData() {
        super.observeData();
        getMViewModel().loadPlayTime();
        getMViewModel().loadSmartPlay();
        getMViewModel().getPlayTimeData().observe(this, new Observer() { // from class: t64
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HmEarbudPlayTimeSettingActivity.m(this.a, (Integer) obj);
            }
        });
        getMViewModel().getSmartPlayData().observe(this, new Observer() { // from class: s64
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HmEarbudPlayTimeSettingActivity.n(this.a, (Boolean) obj);
            }
        });
    }

    @Override // androidx.view.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        setResult(-1);
        super.onBackPressed();
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earbud_playtime_setting);
        ((RainbowTitleBar) findViewById(R.id.tv_title_bar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: q64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HmEarbudPlayTimeSettingActivity.o(this.a, view);
            }
        });
        initView();
        observeData();
    }
}
