package com.xiaomi.hm.health.device.headset.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p010navigation.NavGraph;
import androidx.p010navigation.fragment.NavHostFragment;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.headset.viewmodel.CervicalProtectionViewModel;
import com.xiaomi.hm.health.device.headset.vo.CervicalProtectionVo;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 -2\u00020\u00012\u00020\u0002:\u0001-B\u0007¢\u0006\u0004\b+\u0010,J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0014J\u0010\u0010\u000e\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\nH\u0014J\u0006\u0010\u000f\u001a\u00020\u0003J\u000e\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0015\u001a\u00020\u00032\b\b\u0001\u0010\u0014\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0016R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010!\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010#R\u0016\u0010&\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010%R\u001d\u0010*\u001a\u00020'8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b\u001f\u0010)¨\u0006."}, d2 = {"Lcom/xiaomi/hm/health/device/headset/ui/CervicalProtectionActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lorg/koin/core/component/KoinComponent;", "", GoogleApiAvailabilityLight.a, "f", "e", "g", "", "h", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "outState", "onSaveInstanceState", "setResult", "Landroid/view/View$OnClickListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "setBackClick", "", "title", "setRainbowTitle", "", "Lcom/xiaomi/hm/health/device/headset/viewmodel/CervicalProtectionViewModel;", "a", "Lcom/xiaomi/hm/health/device/headset/viewmodel/CervicalProtectionViewModel;", "viewModel", "b", "Ljava/lang/String;", "address", "Lcom/xiaomi/hm/health/databases/model/Device;", "c", "Lcom/xiaomi/hm/health/databases/model/Device;", "device", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "Z", "cervicalProtectionSwitch", "Lcom/huami/devicex/manager/DeviceManagerApi;", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class CervicalProtectionActivity extends AppCompatActivity implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int REQUEST_CODE = 16;

    @NotNull
    public static final String RESULT_CERVICAL_SWITCH = "result_cervical_switch";

    @NotNull
    private static final String g = "CERVICAL_PROTECTION_ENABLE";

    @NotNull
    private static final String h = "address";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private CervicalProtectionViewModel viewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    private String address;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Device device;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private HMDeviceType deviceType = HMDeviceType.VDevice;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private boolean cervicalProtectionSwitch;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J&\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bR\u0016\u0010\f\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000e\u001a\u00020\u00068\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0016\u0010\u000f\u001a\u00020\b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0011\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/ui/CervicalProtectionActivity$Companion;", "", "Landroid/app/Activity;", "activity", "", "enable", "", "address", "", "requestCode", "", "startActivityForResult", CervicalProtectionActivity.g, "Ljava/lang/String;", "EXTRA_DEVICE_ADDRESS", "REQUEST_CODE", LogUtil.I, "RESULT_CERVICAL_SWITCH", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void startActivityForResult(@NotNull Activity activity, boolean enable, @NotNull String address, int requestCode) {
            Intent intent = new Intent(activity, (Class<?>) CervicalProtectionActivity.class);
            intent.putExtra(CervicalProtectionActivity.g, enable);
            intent.putExtra("address", address);
            activity.startActivityForResult(intent, requestCode);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public CervicalProtectionActivity() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.headset.ui.CervicalProtectionActivity$special$$inlined$inject$default$1
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
    }

    private final DeviceManagerApi c() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final void d() {
        this.address = getIntent().getStringExtra("address");
        this.cervicalProtectionSwitch = getIntent().getBooleanExtra(g, false);
        String str = this.address;
        if (str == null) {
            finish();
            return;
        }
        if (str == null) {
            return;
        }
        Device bindDevice = c().getBindDevice(HMDeviceType.HEADSET, str);
        if (bindDevice == null) {
            bindDevice = null;
        } else {
            this.deviceType = HMDeviceType.fromValue(bindDevice.getDevice_type().intValue());
            Unit unit = Unit.INSTANCE;
        }
        this.device = bindDevice;
    }

    private final void e() {
        CervicalProtectionViewModel cervicalProtectionViewModel = (CervicalProtectionViewModel) new ViewModelProvider(this).get(CervicalProtectionViewModel.class);
        this.viewModel = cervicalProtectionViewModel;
        String str = this.address;
        if (str == null) {
            return;
        }
        Objects.requireNonNull(cervicalProtectionViewModel);
        cervicalProtectionViewModel.initHeadsetNeedCondition(str);
    }

    private final void f() {
        Fragment fragmentFindFragmentById = getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment);
        Objects.requireNonNull(fragmentFindFragmentById, "null cannot be cast to non-null type androidx.navigation.fragment.NavHostFragment");
        NavHostFragment navHostFragment = (NavHostFragment) fragmentFindFragmentById;
        NavGraph navGraphInflate = navHostFragment.getNavController().getNavInflater().inflate(R.navigation.nav_cervical_protection);
        navGraphInflate.setStartDestination(this.cervicalProtectionSwitch ? R.id.cervicalProtectionDetailFragment : R.id.cervicalProtectionHomeFragment);
        navHostFragment.getNavController().setGraph(navGraphInflate);
    }

    private final void g() {
        BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager()).setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.headset.ui.CervicalProtectionActivity$initStatusBar$1
            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            @NotNull
            public HMDeviceType getHMDeviceType() {
                return this.a.deviceType;
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public boolean isActivatedDevice() {
                return this.a.h();
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                if (enable) {
                    CervicalProtectionViewModel cervicalProtectionViewModel = this.a.viewModel;
                    Objects.requireNonNull(cervicalProtectionViewModel);
                    cervicalProtectionViewModel.getCervicalProtectionInfo();
                }
                this.a.findViewById(R.id.mask_view).setVisibility(enable ? 8 : 0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h() {
        return c().isActive(this.device);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cervical_protection);
        g();
        d();
        f();
        e();
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("address", this.address);
    }

    public final void setBackClick(@NotNull View.OnClickListener listener) {
        ((RainbowTitleBar) findViewById(R.id.tv_title_bar)).setNavigationOnClickListener(listener);
    }

    public final void setRainbowTitle(@StringRes int title) {
        ((RainbowTitleBar) findViewById(R.id.tv_title_bar)).setTitle(title);
    }

    public final void setResult() {
        Boolean cervicalProtection;
        Intent intent = new Intent();
        CervicalProtectionViewModel cervicalProtectionViewModel = this.viewModel;
        Objects.requireNonNull(cervicalProtectionViewModel);
        CervicalProtectionVo value = cervicalProtectionViewModel.getCervicalProtection().getValue();
        boolean zBooleanValue = false;
        if (value != null && (cervicalProtection = value.getCervicalProtection()) != null) {
            zBooleanValue = cervicalProtection.booleanValue();
        }
        intent.putExtra(RESULT_CERVICAL_SWITCH, zBooleanValue);
        setResult(-1, intent);
    }

    public final void setRainbowTitle(@NotNull String title) {
        ((RainbowTitleBar) findViewById(R.id.tv_title_bar)).setTitle(title);
    }
}
