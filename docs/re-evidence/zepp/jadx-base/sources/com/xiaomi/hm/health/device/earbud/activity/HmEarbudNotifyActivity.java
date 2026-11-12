package com.xiaomi.hm.health.device.earbud.activity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelLazy;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.device.feature.notification.appnotify.NotificationManager;
import com.huami.device.feature.notification.data.AppsNotificationRepo;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.lib.view.widget.TipComponent;
import com.huami.tools.log.HMLog;
import com.tbruyelle.rxpermissions2.Permission;
import com.tbruyelle.rxpermissions2.RxPermissions;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.device.BaseEarbudDeviceActivity;
import com.xiaomi.hm.health.device.earbud.activity.HmEarbudNotifyActivity;
import com.xiaomi.hm.health.device.earbud.fragment.dialog.EarbudCallNotifyDialog;
import com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.model.account.HMMiliConfig;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import io.reactivex.functions.Consumer;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\u0007¢\u0006\u0004\b%\u0010&J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0004H\u0003J\b\u0010\n\u001a\u00020\u0004H\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\b\u0010\f\u001a\u00020\u0004H\u0002J\b\u0010\r\u001a\u00020\u0004H\u0002J\u0012\u0010\u0010\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u0011\u001a\u00020\u0004H\u0016J\b\u0010\u0012\u001a\u00020\u0004H\u0014R\u001d\u0010\u0017\u001a\u00020\u00028T@\u0014X\u0094\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\u001a\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0014\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010$\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u0014\u001a\u0004\b\"\u0010#¨\u0006'"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/activity/HmEarbudNotifyActivity;", "Lcom/xiaomi/hm/health/device/BaseEarbudDeviceActivity;", "Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudDeviceViewModel;", "Lorg/koin/core/component/KoinComponent;", "", "initView", "", "enable", "E", "z", "C", "v", LogUtil.D, "o", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "observeData", "onResume", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "getMViewModel", "()Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudDeviceViewModel;", "mViewModel", "e", "Z", "mShouldViewEnable", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "f", com.google.android.exoplayer2.text.ttml.b.r, "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "g", DTransferConstants.SEARCH_KEY, "()Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "deviceXNavigator", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HmEarbudNotifyActivity extends BaseEarbudDeviceActivity<EarbudDeviceViewModel> implements KoinComponent {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(EarbudDeviceViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudNotifyActivity$special$$inlined$viewModels$default$2
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
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudNotifyActivity$special$$inlined$viewModels$default$1
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
    private boolean mShouldViewEnable = true;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceXNavigator;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function1<View, Unit> {
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
            HmEarbudNotifyActivity.this.q().startAppNotificationAlertActivity(HmEarbudNotifyActivity.this, HMDeviceType.EARBUD);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "";
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HmEarbudNotifyActivity() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudNotifyActivity$special$$inlined$inject$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceXNavigator = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceXNavigator>() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudNotifyActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceXNavigator getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceXNavigator.class), objArr2, objArr3);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(HmEarbudNotifyActivity hmEarbudNotifyActivity, Permission permission) {
        if (!Intrinsics.areEqual(permission.name, "android.permission.READ_PHONE_STATE")) {
            permission = null;
        }
        if (permission == null) {
            return;
        }
        if (permission.granted) {
            ((ListTile) hmEarbudNotifyActivity.findViewById(R.id.call_item)).setEnabled(true);
            hmEarbudNotifyActivity.o();
        } else if (permission.shouldShowRequestPermissionRationale) {
            ((ListTile) hmEarbudNotifyActivity.findViewById(R.id.call_item)).setEnabled(false);
        } else {
            ((ListTile) hmEarbudNotifyActivity.findViewById(R.id.call_item)).setEnabled(false);
            hmEarbudNotifyActivity.p().showPermissionDenieDialog(hmEarbudNotifyActivity, hmEarbudNotifyActivity.getString(R.string.permission_phone));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(Throwable th) {
        HMLog.warn$default(null, th, b.a, 1, null);
    }

    private final void C() {
        if (!this.mShouldViewEnable) {
            o();
        } else if (v()) {
            ((ListTile) findViewById(R.id.call_item)).setEnabled(true);
            o();
        } else {
            ((ListTile) findViewById(R.id.call_item)).setEnabled(false);
            D();
        }
    }

    private final void D() {
        int i = R.id.call_permission_tips;
        ((TipComponent) findViewById(i)).setTitle(R.string.tips_call_permission);
        ((TipComponent) findViewById(i)).setSubTitle(getString(R.string.tips_call_permission_sub));
        ((TipComponent) findViewById(i)).setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E(boolean enable) {
        ((ListTile) findViewById(R.id.call_item)).setEnabled(enable);
        ((ListTile) findViewById(R.id.sms_item)).setEnabled(enable);
        ((ListTile) findViewById(R.id.notify_item)).setEnabled(enable);
        ((ListTile) findViewById(R.id.smart_item)).setEnabled(enable);
        C();
    }

    private final void initView() {
        BTStatusFragment.newInstance(R.id.status_content, getSupportFragmentManager()).setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudNotifyActivity.initView.1
            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            @NotNull
            public HMDeviceType getHMDeviceType() {
                return HMDeviceType.EARBUD;
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                super.onEnableChange(enable);
                HmEarbudNotifyActivity.this.mShouldViewEnable = enable;
                HmEarbudNotifyActivity.this.E(enable);
            }
        });
        ((ListTile) findViewById(R.id.call_item)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: g64
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                HmEarbudNotifyActivity.r(this.a, compoundButton, z);
            }
        });
        ((ListTile) findViewById(R.id.sms_item)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: f64
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                HmEarbudNotifyActivity.s(this.a, compoundButton, z);
            }
        });
        ExtKt.smartClick$default((ListTile) findViewById(R.id.notify_item), 0L, new a(), 1, null);
        ((ListTile) findViewById(R.id.smart_item)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: h64
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                HmEarbudNotifyActivity.t(this.a, compoundButton, z);
            }
        });
        int i = R.id.call_permission_tips;
        ((TipComponent) findViewById(i)).showWarningIcon();
        ((TipComponent) findViewById(i)).setActionGoto(new View.OnClickListener() { // from class: d64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HmEarbudNotifyActivity.u(this.a, view);
            }
        });
    }

    private final void o() {
        ((TipComponent) findViewById(R.id.call_permission_tips)).setVisibility(8);
    }

    private final DeviceUtilsApi p() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceXNavigator q() {
        return (DeviceXNavigator) this.deviceXNavigator.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(HmEarbudNotifyActivity hmEarbudNotifyActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            if (z) {
                new EarbudCallNotifyDialog().show(hmEarbudNotifyActivity.getSupportFragmentManager(), "Call Notify");
            }
            hmEarbudNotifyActivity.getMViewModel().updateEnableCallNotify(z);
        }
        hmEarbudNotifyActivity.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(HmEarbudNotifyActivity hmEarbudNotifyActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            hmEarbudNotifyActivity.getMViewModel().updateEnableSmsNotify(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t(HmEarbudNotifyActivity hmEarbudNotifyActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            hmEarbudNotifyActivity.getMViewModel().setSleepNotDisturb(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(HmEarbudNotifyActivity hmEarbudNotifyActivity, View view) {
        hmEarbudNotifyActivity.z();
    }

    private final boolean v() {
        return p().checkPermission("android.permission.READ_PHONE_STATE");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(HmEarbudNotifyActivity hmEarbudNotifyActivity, HMMiliConfig hMMiliConfig) {
        ((ListTile) hmEarbudNotifyActivity.findViewById(R.id.call_item)).setChecked(hMMiliConfig.isInComingCallEnabled());
        ((ListTile) hmEarbudNotifyActivity.findViewById(R.id.sms_item)).setChecked(hMMiliConfig.isSmsNotifyEnabled());
        ((ListTile) hmEarbudNotifyActivity.findViewById(R.id.notify_item)).setTips(AppsNotificationRepo.isNotificationOn$default(NotificationManager.getInstance().getAppsRepo(), null, 1, null) ? R.string.alert_enable : R.string.alert_disable);
        hmEarbudNotifyActivity.C();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(HmEarbudNotifyActivity hmEarbudNotifyActivity, Boolean bool) {
        ((ListTile) hmEarbudNotifyActivity.findViewById(R.id.smart_item)).setChecked(Intrinsics.areEqual(bool, Boolean.TRUE));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(HmEarbudNotifyActivity hmEarbudNotifyActivity, View view) {
        hmEarbudNotifyActivity.onBackPressed();
    }

    @SuppressLint({"CheckResult"})
    private final void z() {
        RxPermissions rxPermissions = new RxPermissions(this);
        String[] strArr = {"android.permission.READ_PHONE_STATE", "android.permission.CALL_PHONE"};
        if (Build.VERSION.SDK_INT >= 26) {
            strArr = new String[]{"android.permission.READ_PHONE_STATE", "android.permission.CALL_PHONE", "android.permission.ANSWER_PHONE_CALLS"};
        }
        rxPermissions.requestEach((String[]) Arrays.copyOf(strArr, strArr.length)).subscribe(new Consumer() { // from class: k64
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                HmEarbudNotifyActivity.A(this.a, (Permission) obj);
            }
        }, new Consumer() { // from class: l64
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                HmEarbudNotifyActivity.B((Throwable) obj);
            }
        });
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
        getMViewModel().getDeviceUserConfigData().observe(this, new Observer() { // from class: i64
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HmEarbudNotifyActivity.w(this.a, (HMMiliConfig) obj);
            }
        });
        getMViewModel().getSleepNotDisturbData().observe(this, new Observer() { // from class: j64
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HmEarbudNotifyActivity.x(this.a, (Boolean) obj);
            }
        });
        getMViewModel().loadSleepNotDisturb();
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earbud_notify);
        int i = R.id.tv_title_bar;
        ((RainbowTitleBar) findViewById(i)).setTitle(R.string.earbud_notify);
        ((RainbowTitleBar) findViewById(i)).setNavigationOnClickListener(new View.OnClickListener() { // from class: e64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HmEarbudNotifyActivity.y(this.a, view);
            }
        });
        initView();
        observeData();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        C();
    }
}
