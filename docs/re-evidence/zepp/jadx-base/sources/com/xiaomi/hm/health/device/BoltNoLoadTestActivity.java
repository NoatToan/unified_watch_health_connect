package com.xiaomi.hm.health.device;

import android.os.Bundle;
import android.widget.CompoundButton;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.devicex.R;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.ListTile;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMBoltClassicDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.smartwatch.FTMSFeature;
import com.xiaomi.hm.health.bt.profile.ftms.FTMSCommand;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.ui.UnifyTitleBarStyle;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0001\u0019B\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014R\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\u0010\u001a\u00020\r8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001d\u0010\u0016\u001a\u00020\u00118B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001a"}, d2 = {"Lcom/xiaomi/hm/health/device/BoltNoLoadTestActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lorg/koin/core/component/KoinComponent;", "", GoogleApiAvailabilityLight.b, "m", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/xiaomi/hm/health/bt/device/HMBoltClassicDevice;", "x", "Lcom/xiaomi/hm/health/bt/device/HMBoltClassicDevice;", "boltClassicDevice", "Lcom/huami/lib/rainbow/ListTile;", "y", "Lcom/huami/lib/rainbow/ListTile;", "noLoadTestItem", "Lcom/huami/devicex/manager/DeviceManagerApi;", "z", "Lkotlin/Lazy;", "l", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class BoltNoLoadTestActivity extends BaseTitleActivity implements KoinComponent {

    @NotNull
    private static final String A = "BoltNoLoadTestActivity";

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private HMBoltClassicDevice boltClassicDevice;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private ListTile noLoadTestItem;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX WARN: Multi-variable type inference failed */
    public BoltNoLoadTestActivity() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.BoltNoLoadTestActivity$special$$inlined$inject$default$1
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

    private final DeviceManagerApi l() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final void m() {
        BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager()).setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.BoltNoLoadTestActivity$initStatusBar$1
            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            @NotNull
            public HMDeviceType getHMDeviceType() {
                return HMDeviceType.TREADMILL;
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                ListTile listTile = this.a.noLoadTestItem;
                Objects.requireNonNull(listTile);
                listTile.setEnabled(enable);
                if (enable) {
                    HMBoltClassicDevice hMBoltClassicDevice = this.a.boltClassicDevice;
                    Objects.requireNonNull(hMBoltClassicDevice);
                    final BoltNoLoadTestActivity boltNoLoadTestActivity = this.a;
                    hMBoltClassicDevice.getFtmsFeature(new HMCallback<FTMSFeature>() { // from class: com.xiaomi.hm.health.device.BoltNoLoadTestActivity$initStatusBar$1$onEnableChange$1

                        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                        public static final class a extends Lambda implements Function0<String> {
                            public final /* synthetic */ FTMSFeature a;

                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            public a(FTMSFeature fTMSFeature) {
                                super(0);
                                this.a = fTMSFeature;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            @Nullable
                            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final String getA() {
                                FTMSFeature fTMSFeature = this.a;
                                return "noLoad: " + (fTMSFeature == null ? null : Boolean.valueOf(fTMSFeature.hasFeature(17)));
                            }
                        }

                        @Override // com.xiaomi.hm.health.bt.device.HMCallback
                        public void onFinish(@Nullable FTMSFeature t) {
                            super.onFinish(t);
                            HMLog.info("BoltNoLoadTestActivity", new a(t));
                            if (t == null) {
                                ListTile listTile2 = boltNoLoadTestActivity.noLoadTestItem;
                                Objects.requireNonNull(listTile2);
                                listTile2.setChecked(false);
                            } else {
                                ListTile listTile3 = boltNoLoadTestActivity.noLoadTestItem;
                                Objects.requireNonNull(listTile3);
                                listTile3.setChecked(t.hasFeature(17));
                            }
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void n() {
        IconToast.showError(this, R.string.open_fail);
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        UnifyTitleBarStyle.setUnifyTitleStyle$default(this, getString(R.string.bolt_setting_no_Load_test), null, 2, null);
        setContentView(R.layout.activity_bolt_no_load);
        HMBaseDevice device = l().getDevice(HMDeviceType.TREADMILL);
        Objects.requireNonNull(device, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMBoltClassicDevice");
        this.boltClassicDevice = (HMBoltClassicDevice) device;
        ListTile listTile = (ListTile) findViewById(R.id.item_no_load_test);
        this.noLoadTestItem = listTile;
        Objects.requireNonNull(listTile);
        listTile.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: com.xiaomi.hm.health.device.BoltNoLoadTestActivity.onCreate.1
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public void onCheckedChanged(@Nullable final CompoundButton button, final boolean isChecked) {
                boolean z = false;
                if (button != null && button.isPressed()) {
                    z = true;
                }
                if (z) {
                    int i = isChecked ? 1 : 2;
                    HMBoltClassicDevice hMBoltClassicDevice = BoltNoLoadTestActivity.this.boltClassicDevice;
                    Objects.requireNonNull(hMBoltClassicDevice);
                    FTMSCommand fTMSCommand = new FTMSCommand(21, i);
                    final BoltNoLoadTestActivity boltNoLoadTestActivity = BoltNoLoadTestActivity.this;
                    hMBoltClassicDevice.sendFTMSCommand(fTMSCommand, new HMCallback<Object>() { // from class: com.xiaomi.hm.health.device.BoltNoLoadTestActivity$onCreate$1$onCheckedChanged$1

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
                                return "open: " + this.a + ", ret: " + this.b;
                            }
                        }

                        @Override // com.xiaomi.hm.health.bt.device.HMCallback
                        public void onFinish(boolean result) {
                            HMLog.info("BoltNoLoadTestActivity", new a(isChecked, result));
                            if (result) {
                                return;
                            }
                            boltNoLoadTestActivity.n();
                            button.toggle();
                        }
                    });
                }
            }
        });
        HMBoltClassicDevice hMBoltClassicDevice = this.boltClassicDevice;
        Objects.requireNonNull(hMBoltClassicDevice);
        if (hMBoltClassicDevice.isConnected()) {
            HMBoltClassicDevice hMBoltClassicDevice2 = this.boltClassicDevice;
            Objects.requireNonNull(hMBoltClassicDevice2);
            hMBoltClassicDevice2.getFtmsFeature(new HMCallback<FTMSFeature>() { // from class: com.xiaomi.hm.health.device.BoltNoLoadTestActivity.onCreate.2

                /* JADX INFO: renamed from: com.xiaomi.hm.health.device.BoltNoLoadTestActivity$onCreate$2$a */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class a extends Lambda implements Function0<String> {
                    public final /* synthetic */ FTMSFeature a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public a(FTMSFeature fTMSFeature) {
                        super(0);
                        this.a = fTMSFeature;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        FTMSFeature fTMSFeature = this.a;
                        return "noLoad: " + (fTMSFeature == null ? null : Boolean.valueOf(fTMSFeature.hasFeature(17)));
                    }
                }

                @Override // com.xiaomi.hm.health.bt.device.HMCallback
                public void onFinish(@Nullable FTMSFeature t) {
                    super.onFinish(t);
                    HMLog.info(BoltNoLoadTestActivity.A, new a(t));
                    if (t == null) {
                        ListTile listTile2 = BoltNoLoadTestActivity.this.noLoadTestItem;
                        Objects.requireNonNull(listTile2);
                        listTile2.setChecked(false);
                    } else {
                        ListTile listTile3 = BoltNoLoadTestActivity.this.noLoadTestItem;
                        Objects.requireNonNull(listTile3);
                        listTile3.setChecked(t.hasFeature(17));
                    }
                }
            });
        }
        m();
    }
}
