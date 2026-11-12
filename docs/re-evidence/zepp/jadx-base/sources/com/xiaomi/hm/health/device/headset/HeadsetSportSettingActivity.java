package com.xiaomi.hm.health.device.headset;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import androidx.appcompat.app.AppCompatActivity;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.ecf.data.HeadsetSportSetting;
import com.huami.bluetooth.profile.ecf.data.HrBroadcastType;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.koinstartup.KoinComponentAdapter;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.headset.HeadsetSportSettingActivity;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0001+B\u0007¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\b\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\tH\u0002J\b\u0010\r\u001a\u00020\u0005H\u0002J\u0012\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u000eH\u0014R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u001a\u001a\u00020\u00178\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\"\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010(\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006,"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/HeadsetSportSettingActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "Lcom/huami/bluetooth/profile/ecf/data/HeadsetSportSetting;", "headsetSportSetting", "", DTransferConstants.SEARCH_KEY, "initViews", "i", "", "m", "enable", "r", com.google.android.exoplayer2.text.ttml.b.r, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "outState", "onSaveInstanceState", "Lcom/xiaomi/hm/health/device/headset/HeadSetSportSettingViewModel;", "a", "Lcom/xiaomi/hm/health/device/headset/HeadSetSportSettingViewModel;", "sportSettingViewModel", "", "b", "Ljava/lang/String;", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Lcom/xiaomi/hm/health/databases/model/Device;", "c", "Lcom/xiaomi/hm/health/databases/model/Device;", "device", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", GoogleApiAvailabilityLight.a, "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "Lcom/huami/devicex/manager/DeviceManagerApi;", "e", "Lkotlin/Lazy;", "h", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HeadsetSportSettingActivity extends AppCompatActivity implements KoinComponentAdapter {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String f = "HeadsetSportSettingActivity";

    @NotNull
    private static final String g = "device_address";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private HeadSetSportSettingViewModel sportSettingViewModel;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private String address;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private Device device;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private HMDeviceType deviceType = HMDeviceType.VDevice;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\t¨\u0006\r"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/HeadsetSportSettingActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "", "start", "EXTRA_DEVICE_ADDRESS", "Ljava/lang/String;", "TAG", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void start(@NotNull Context context, @NotNull String address) {
            Intent intent = new Intent(context, (Class<?>) HeadsetSportSettingActivity.class);
            intent.putExtra(HeadsetSportSettingActivity.g, address);
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ HeadsetSportSetting a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(HeadsetSportSetting headsetSportSetting) {
            super(0);
            this.a = headsetSportSetting;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "update headset sport ui:" + HeadSetSportSettingViewModelKt.toPrintString(this.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HeadsetSportSettingActivity() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.headset.HeadsetSportSettingActivity$special$$inlined$inject$default$1
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

    private final DeviceManagerApi h() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final void i() {
        BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager()).setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.headset.HeadsetSportSettingActivity$initStatusBar$1
            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            @NotNull
            public HMDeviceType getHMDeviceType() {
                return this.a.deviceType;
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public boolean isActivatedDevice() {
                return this.a.m();
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                this.a.r(enable);
                if (enable) {
                    HeadSetSportSettingViewModel headSetSportSettingViewModel = this.a.sportSettingViewModel;
                    Objects.requireNonNull(headSetSportSettingViewModel);
                    headSetSportSettingViewModel.loadSetting();
                }
            }
        });
    }

    private final void initViews() {
        ((ListTile) findViewById(R.id.headset_beat_enhancement_item)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: ju3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                HeadsetSportSettingActivity.j(this.a, compoundButton, z);
            }
        });
        int i = R.id.headset_auto_side_listen_item;
        ((ListTile) findViewById(i)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: hu3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                HeadsetSportSettingActivity.k(this.a, compoundButton, z);
            }
        });
        ((ListTile) findViewById(i)).setVisibility(8);
        ((ListTile) findViewById(R.id.headset_sport_heart_rate_broadcast_item)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: iu3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                HeadsetSportSettingActivity.l(this.a, compoundButton, z);
            }
        });
        r(m());
        i();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(HeadsetSportSettingActivity headsetSportSettingActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            headsetSportSettingActivity.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k(HeadsetSportSettingActivity headsetSportSettingActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            headsetSportSettingActivity.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(HeadsetSportSettingActivity headsetSportSettingActivity, CompoundButton compoundButton, boolean z) {
        if (compoundButton.isPressed()) {
            headsetSportSettingActivity.p();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m() {
        return h().isActive(this.device);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n(HeadsetSportSettingActivity headsetSportSettingActivity, View view) {
        headsetSportSettingActivity.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void o(HeadsetSportSettingActivity headsetSportSettingActivity, HeadsetSportSetting headsetSportSetting) {
        headsetSportSettingActivity.q(headsetSportSetting);
    }

    private final void p() {
        HeadSetSportSettingViewModel headSetSportSettingViewModel = this.sportSettingViewModel;
        Objects.requireNonNull(headSetSportSettingViewModel);
        headSetSportSettingViewModel.setSportSetting(((ListTile) findViewById(R.id.headset_beat_enhancement_item)).isChecked(), ((ListTile) findViewById(R.id.headset_auto_side_listen_item)).isChecked(), ((ListTile) findViewById(R.id.headset_sport_heart_rate_broadcast_item)).isChecked() ? HrBroadcastType.OPEN : HrBroadcastType.CLOSE);
    }

    private final void q(HeadsetSportSetting headsetSportSetting) {
        HMLog.info(f, new a(headsetSportSetting));
        ((ListTile) findViewById(R.id.headset_beat_enhancement_item)).setChecked(headsetSportSetting.getMeterEnhancement());
        ((ListTile) findViewById(R.id.headset_auto_side_listen_item)).setChecked(headsetSportSetting.getAutoSideListen());
        ((ListTile) findViewById(R.id.headset_sport_heart_rate_broadcast_item)).setChecked(headsetSportSetting.getHrBroadcast() != HrBroadcastType.CLOSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void r(boolean enable) {
        ((ListTile) findViewById(R.id.headset_beat_enhancement_item)).setEnabled(enable);
        ((ListTile) findViewById(R.id.headset_auto_side_listen_item)).setEnabled(enable);
        ((ListTile) findViewById(R.id.headset_sport_heart_rate_broadcast_item)).setEnabled(enable);
    }

    @JvmStatic
    public static final void start(@NotNull Context context, @NotNull String str) {
        INSTANCE.start(context, str);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        Device device = null;
        if (savedInstanceState == null) {
            Intent intent = getIntent();
            savedInstanceState = intent == null ? null : intent.getExtras();
        }
        String string = savedInstanceState == null ? null : savedInstanceState.getString(g);
        if (string == null) {
            finish();
            return;
        }
        this.address = string;
        Device bindDevice = h().getBindDevice(HMDeviceType.HEADSET, string);
        if (bindDevice != null) {
            this.deviceType = HMDeviceType.fromValue(bindDevice.getDevice_type().intValue());
            Unit unit = Unit.INSTANCE;
            device = bindDevice;
        }
        this.device = device;
        setContentView(R.layout.activity_headset_sport_setting);
        ((RainbowTitleBar) findViewById(R.id.rainbowTitleBar)).setNavigationOnClickListener(new View.OnClickListener() { // from class: gu3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HeadsetSportSettingActivity.n(this.a, view);
            }
        });
        HeadSetSportSettingViewModel headSetSportSettingViewModel = (HeadSetSportSettingViewModel) new ViewModelProvider(this).get(HeadSetSportSettingViewModel.class);
        this.sportSettingViewModel = headSetSportSettingViewModel;
        Objects.requireNonNull(headSetSportSettingViewModel);
        headSetSportSettingViewModel.getSportSettingLiveData().observe(this, new Observer() { // from class: ku3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HeadsetSportSettingActivity.o(this.a, (HeadsetSportSetting) obj);
            }
        });
        initViews();
        HeadSetSportSettingViewModel headSetSportSettingViewModel2 = this.sportSettingViewModel;
        Objects.requireNonNull(headSetSportSettingViewModel2);
        headSetSportSettingViewModel2.loadSetting();
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String str = this.address;
        Objects.requireNonNull(str);
        outState.putString(g, str);
    }
}
