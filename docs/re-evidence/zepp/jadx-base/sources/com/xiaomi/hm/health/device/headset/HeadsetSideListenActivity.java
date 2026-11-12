package com.xiaomi.hm.health.device.headset;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelProvider;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.ecf.data.HeadsetSideListenSetting;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.koinstartup.KoinComponentAdapter;
import com.huami.lib.rainbow.ListTile;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.xiaomi.hm.health.baseui.BaseTitleBarExtKt;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.headset.HeadsetSideListenActivity;
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
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u0007¢\u0006\u0004\b(\u0010)J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0002J\b\u0010\b\u001a\u00020\u0005H\u0002J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\tH\u0002J\b\u0010\f\u001a\u00020\tH\u0002J\u0012\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014J\u0010\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\rH\u0014R\u0016\u0010\u0015\u001a\u00020\u00128\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0019\u001a\u00020\u00168\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010'\u001a\u00020\"8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006+"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/HeadsetSideListenActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lcom/huami/koinstartup/KoinComponentAdapter;", "Lcom/huami/bluetooth/profile/ecf/data/HeadsetSideListenSetting;", "setting", "", SOAP.XMLNS, "initView", "o", "", "enable", "t", DTransferConstants.SEARCH_KEY, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "outState", "onSaveInstanceState", "Lcom/xiaomi/hm/health/device/headset/SideListenViewModel;", "x", "Lcom/xiaomi/hm/health/device/headset/SideListenViewModel;", "viewModel", "", "y", "Ljava/lang/String;", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Lcom/xiaomi/hm/health/databases/model/Device;", "z", "Lcom/xiaomi/hm/health/databases/model/Device;", "device", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "deviceType", "Lcom/huami/devicex/manager/DeviceManagerApi;", "B", "Lkotlin/Lazy;", GoogleApiAvailabilityLight.b, "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HeadsetSideListenActivity extends BaseTitleActivity implements KoinComponentAdapter {

    @NotNull
    private static final String C = "HeadsetSideListenActivity";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String D = "device_address";
    private static final int E = 10;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private HMDeviceType deviceType = HMDeviceType.VDevice;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private SideListenViewModel viewModel;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private String address;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @Nullable
    private Device device;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007R\u0016\u0010\b\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\u000b\u001a\u00020\n8\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0016\u0010\r\u001a\u00020\u00048\u0002@\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\t¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/device/headset/HeadsetSideListenActivity$Companion;", "", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "", "start", "EXTRA_DEVICE_ADDRESS", "Ljava/lang/String;", "", "MIN_VOLUME", LogUtil.I, "TAG", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void start(@NotNull Context context, @NotNull String address) {
            Intent intent = new Intent(context, (Class<?>) HeadsetSideListenActivity.class);
            intent.putExtra(HeadsetSideListenActivity.D, address);
            Unit unit = Unit.INSTANCE;
            context.startActivity(intent);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;
        public final /* synthetic */ boolean b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, boolean z2) {
            super(0);
            this.a = z;
            this.b = z2;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return this.a + "," + this.b;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ HeadsetSideListenSetting a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(HeadsetSideListenSetting headsetSideListenSetting) {
            super(0);
            this.a = headsetSideListenSetting;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "update ui " + SideListenViewModelKt.toPrintString(this.a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HeadsetSideListenActivity() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.headset.HeadsetSideListenActivity$special$$inlined$inject$default$1
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

    private final void initView() {
        ((SeekBar) findViewById(R.id.headset_vocal_enhancement_volume_bar)).setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() { // from class: com.xiaomi.hm.health.device.headset.HeadsetSideListenActivity.initView.1

            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.headset.HeadsetSideListenActivity$initView$1$a */
            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
            public static final class a extends Lambda implements Function0<String> {
                public final /* synthetic */ SeekBar a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public a(SeekBar seekBar) {
                    super(0);
                    this.a = seekBar;
                }

                @Override // kotlin.jvm.functions.Function0
                @Nullable
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final String getA() {
                    return "seek touch stop " + this.a.getProgress();
                }
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onProgressChanged(@NotNull SeekBar seekBar, int progress, boolean fromUser) {
                ((TextView) HeadsetSideListenActivity.this.findViewById(R.id.tv_side_listen_volume)).setText(HeadsetSideListenActivity.this.getResources().getString(R.string.body_index_percent, String.valueOf(progress)));
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStartTrackingTouch(@NotNull SeekBar seekBar) {
            }

            @Override // android.widget.SeekBar.OnSeekBarChangeListener
            public void onStopTrackingTouch(@NotNull SeekBar seekBar) {
                HMLog.info(HeadsetSideListenActivity.C, new a(seekBar));
                if (seekBar.getProgress() < 10) {
                    seekBar.setProgress(10);
                }
                SideListenViewModel sideListenViewModel = HeadsetSideListenActivity.this.viewModel;
                Objects.requireNonNull(sideListenViewModel);
                sideListenViewModel.setSideListen(((ListTile) HeadsetSideListenActivity.this.findViewById(R.id.headset_vocal_enhancement_item)).isChecked(), seekBar.getProgress());
            }
        });
        findViewById(R.id.side_listen_volume_divider).setVisibility(8);
        int i = R.id.headset_vocal_enhancement_item;
        ((ListTile) findViewById(i)).setVisibility(8);
        ((ListTile) findViewById(i)).setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: eu3
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                HeadsetSideListenActivity.p(this.a, compoundButton, z);
            }
        });
        t(q());
        o();
    }

    private final DeviceManagerApi n() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final void o() {
        BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager()).setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.headset.HeadsetSideListenActivity$initStatusBar$1
            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            @NotNull
            public HMDeviceType getHMDeviceType() {
                return this.a.deviceType;
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public boolean isActivatedDevice() {
                return this.a.q();
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                this.a.t(enable);
                if (enable) {
                    SideListenViewModel sideListenViewModel = this.a.viewModel;
                    Objects.requireNonNull(sideListenViewModel);
                    sideListenViewModel.loadSetting();
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void p(HeadsetSideListenActivity headsetSideListenActivity, CompoundButton compoundButton, boolean z) {
        boolean zIsPressed = compoundButton.isPressed();
        HMLog.info(C, new a(z, zIsPressed));
        if (zIsPressed) {
            SideListenViewModel sideListenViewModel = headsetSideListenActivity.viewModel;
            Objects.requireNonNull(sideListenViewModel);
            sideListenViewModel.setSideListen(z, ((SeekBar) headsetSideListenActivity.findViewById(R.id.headset_vocal_enhancement_volume_bar)).getProgress());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean q() {
        return n().isActive(this.device);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void r(HeadsetSideListenActivity headsetSideListenActivity, HeadsetSideListenSetting headsetSideListenSetting) {
        headsetSideListenActivity.s(headsetSideListenSetting);
    }

    private final void s(HeadsetSideListenSetting setting) {
        HMLog.info(C, new b(setting));
        ((SeekBar) findViewById(R.id.headset_vocal_enhancement_volume_bar)).setProgress(setting.getVolume());
        ((ListTile) findViewById(R.id.headset_vocal_enhancement_item)).setChecked(setting.getVoiceEnhancement());
    }

    @JvmStatic
    public static final void start(@NotNull Context context, @NotNull String str) {
        INSTANCE.start(context, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(boolean enable) {
        ((ListTile) findViewById(R.id.headset_vocal_enhancement_item)).setEnabled(enable);
        ((SeekBar) findViewById(R.id.headset_vocal_enhancement_volume_bar)).setEnabled(enable);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponentAdapter.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            Intent intent = getIntent();
            savedInstanceState = intent == null ? null : intent.getExtras();
        }
        String string = savedInstanceState == null ? null : savedInstanceState.getString(D);
        if (string == null) {
            finish();
            return;
        }
        this.address = string;
        Device bindDevice = n().getBindDevice(HMDeviceType.HEADSET, string);
        if (bindDevice == null) {
            bindDevice = null;
        } else {
            this.deviceType = HMDeviceType.fromValue(bindDevice.getDevice_type().intValue());
            Unit unit = Unit.INSTANCE;
        }
        this.device = bindDevice;
        setContentView(R.layout.activity_side_listen);
        BaseTitleBarExtKt.setTitleBar(this, getResources().getString(R.string.headset_settings_side_listen), null, R.color.s38, BaseTitleActivity.STYLE.BACK_AND_TITLE);
        TextView titleTextView = getTitleTextView();
        titleTextView.setTextSize(2, 17.0f);
        titleTextView.setTypeface(null, 1);
        SideListenViewModel sideListenViewModel = (SideListenViewModel) new ViewModelProvider(this).get(SideListenViewModel.class);
        this.viewModel = sideListenViewModel;
        Objects.requireNonNull(sideListenViewModel);
        sideListenViewModel.getSideListenLiveData().observe(this, new Observer() { // from class: fu3
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HeadsetSideListenActivity.r(this.a, (HeadsetSideListenSetting) obj);
            }
        });
        initView();
        SideListenViewModel sideListenViewModel2 = this.viewModel;
        Objects.requireNonNull(sideListenViewModel2);
        sideListenViewModel2.loadSetting();
    }

    @Override // com.huami.view.basetitle.BaseFragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(@NotNull Bundle outState) {
        super.onSaveInstanceState(outState);
        String str = this.address;
        Objects.requireNonNull(str);
        outState.putString(D, str);
    }
}
