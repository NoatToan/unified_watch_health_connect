package com.xiaomi.hm.health.device;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.bluetooth.profile.ecf.data.NowTimeConfig;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.sky.lib.constant.WebConstant;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.widget.toast.IconToast;
import com.huami.widget.wheelview.HMTimeChooseView;
import com.xiaomi.hm.health.baseui.widget.ItemView;
import com.xiaomi.hm.health.baseutil.TimeUtils;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.MiliNowTimeSettingActivity;
import java.util.Calendar;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function4;
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

/* JADX INFO: loaded from: classes20.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 ;2\u00020\u00012\u00020\u0002:\u0001;B\u0007¢\u0006\u0004\b9\u0010:J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\b\u0010\t\u001a\u00020\u0003H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000bH\u0002J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u0005H\u0002J\u0010\u0010\u0012\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0018\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0015\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0003H\u0002J\b\u0010\u0019\u001a\u00020\u0003H\u0002J\u0012\u0010\u001c\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0014R\u001d\u0010\"\u001a\u00020\u001d8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010'\u001a\u0004\u0018\u00010#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010*R\u0016\u0010-\u001a\u00020(8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\r\u0010*R\u0018\u00100\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/Rp\u00108\u001a\\\u0012\u0013\u0012\u00110#¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b('\u0012\u0013\u0012\u00110\u0010¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(\u0011\u0012\u0013\u0012\u00110(¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(4\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b2\u0012\b\b3\u0012\u0004\b\b(5\u0012\u0004\u0012\u00020\u0003018\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006<"}, d2 = {"Lcom/xiaomi/hm/health/device/MiliNowTimeSettingActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lorg/koin/core/component/KoinComponent;", "", "w", "", "idx", "", "v", "initData", "initViews", "", "isStart", "B", "newTime", "G", "Lcom/xiaomi/hm/health/device/HMNowTimeConfig$NowTimeSettings;", "settings", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "minutes", "Lcom/huami/widget/wheelview/HMTimeChooseView$ITimeChooseListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/huami/widget/wheelview/HMTimeChooseView;", "r", SOAP.XMLNS, "F", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Lcom/huami/devicex/manager/DeviceManagerApi;", "x", "Lkotlin/Lazy;", "u", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "y", "t", "()Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "device", "Lcom/xiaomi/hm/health/baseui/widget/ItemView;", "z", "Lcom/xiaomi/hm/health/baseui/widget/ItemView;", "mEnableItem", "mStartItem", "mStopItem", "C", "Lcom/xiaomi/hm/health/device/HMNowTimeConfig$NowTimeSettings;", "mNowTimeSettings", "Lkotlin/Function4;", "Lkotlin/ParameterName;", "name", "itemView", "opType", LogUtil.D, "Lkotlin/jvm/functions/Function4;", "configAction", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class MiliNowTimeSettingActivity extends BaseTitleActivity implements KoinComponent {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int OP_START_TIME = 1;
    public static final int OP_STOP_TIME = 2;
    public static final int OP_TYPE_SWITCH = 0;

    @NotNull
    public static final String TAG = "MiliNowTimeSettingActivity";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private ItemView mStartItem;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private ItemView mStopItem;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    private HMNowTimeConfig.NowTimeSettings mNowTimeSettings;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private final Function4<HMBaseDevice, HMNowTimeConfig.NowTimeSettings, ItemView, Integer, Unit> configAction;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy device;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private ItemView mEnableItem;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00068\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\f\u001a\u00020\u000b8\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/xiaomi/hm/health/device/MiliNowTimeSettingActivity$Companion;", "", "Landroid/content/Context;", "ctx", "", WebConstant.QueryParam.LAUNCH, "", "OP_START_TIME", LogUtil.I, "OP_STOP_TIME", "OP_TYPE_SWITCH", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void launch(@NotNull Context ctx) {
            ctx.startActivity(new Intent(ctx, (Class<?>) MiliNowTimeSettingActivity.class));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMBaseDevice;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<HMBaseDevice> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMBaseDevice getA() {
            return MiliNowTimeSettingActivity.this.u().getDevice(HMDeviceType.MILI);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MiliNowTimeSettingActivity() {
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.MiliNowTimeSettingActivity$special$$inlined$inject$default$1
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
        this.device = LazyKt__LazyJVMKt.lazy(new a());
        this.configAction = new Function4<HMBaseDevice, HMNowTimeConfig.NowTimeSettings, ItemView, Integer, Unit>() { // from class: com.xiaomi.hm.health.device.MiliNowTimeSettingActivity$configAction$1
            {
                super(4);
            }

            public final void a(@NotNull HMBaseDevice hMBaseDevice, @NotNull final HMNowTimeConfig.NowTimeSettings nowTimeSettings, @NotNull final ItemView itemView, final int i) {
                if (hMBaseDevice instanceof HMMiLiProDevice) {
                    HMMiLiProDevice hMMiLiProDevice = (HMMiLiProDevice) hMBaseDevice;
                    if (hMMiLiProDevice.isConnected()) {
                        NowTimeConfig nowTimeConfig = nowTimeSettings.toNowTimeConfig();
                        final MiliNowTimeSettingActivity miliNowTimeSettingActivity = this.a;
                        hMMiLiProDevice.setNowTimeConfig(nowTimeConfig, new HMCallback<Boolean>() { // from class: com.xiaomi.hm.health.device.MiliNowTimeSettingActivity$configAction$1.1

                            /* JADX INFO: renamed from: com.xiaomi.hm.health.device.MiliNowTimeSettingActivity$configAction$1$1$a */
                            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                            public static final class a extends Lambda implements Function0<String> {
                                public final /* synthetic */ boolean a;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                public a(boolean z) {
                                    super(0);
                                    this.a = z;
                                }

                                @Override // kotlin.jvm.functions.Function0
                                @Nullable
                                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final String getA() {
                                    return "setNowTime :Result:" + this.a;
                                }
                            }

                            @Override // com.xiaomi.hm.health.bt.device.HMCallback
                            public /* bridge */ /* synthetic */ void onFinish(Boolean bool) {
                                onFinish(bool.booleanValue());
                            }

                            @Override // com.xiaomi.hm.health.bt.device.HMCallback
                            public void onFinish(boolean ret) {
                                HMLog.info(MiliNowTimeSettingActivity.TAG, new a(ret));
                                if (ret) {
                                    miliNowTimeSettingActivity.A(nowTimeSettings);
                                } else {
                                    miliNowTimeSettingActivity.F();
                                }
                                int i2 = i;
                                if (i2 == 1) {
                                    if (ret) {
                                        ItemView itemView2 = miliNowTimeSettingActivity.mStartItem;
                                        Objects.requireNonNull(itemView2);
                                        itemView2.setValue(miliNowTimeSettingActivity.v(nowTimeSettings.getStart()));
                                        return;
                                    }
                                    return;
                                }
                                if (i2 != 2) {
                                    if (ret) {
                                        return;
                                    }
                                    itemView.toggle();
                                } else if (ret) {
                                    ItemView itemView3 = miliNowTimeSettingActivity.mStopItem;
                                    Objects.requireNonNull(itemView3);
                                    itemView3.setValue(miliNowTimeSettingActivity.v(nowTimeSettings.getStop()));
                                }
                            }
                        });
                    }
                }
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(HMBaseDevice hMBaseDevice, HMNowTimeConfig.NowTimeSettings nowTimeSettings, ItemView itemView, Integer num) {
                a(hMBaseDevice, nowTimeSettings, itemView, num.intValue());
                return Unit.INSTANCE;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void A(HMNowTimeConfig.NowTimeSettings settings) {
        HMNowTimeConfig.INSTANCE.setNowTimeConfigString(settings);
    }

    private final void B(final boolean isStart) {
        HMNowTimeConfig.NowTimeSettings nowTimeSettings = this.mNowTimeSettings;
        final int start = nowTimeSettings == null ? 480 : nowTimeSettings.getStart();
        HMNowTimeConfig.NowTimeSettings nowTimeSettings2 = this.mNowTimeSettings;
        final int stop = nowTimeSettings2 == null ? 1260 : nowTimeSettings2.getStop();
        int i = isStart ? start : stop;
        final AtomicInteger atomicInteger = new AtomicInteger(-1);
        new AlertDialogFragment.Builder(this).setTitle(isStart ? R.string.long_sit_alert_start : R.string.long_sit_alert_stop).setCancelable(true).setContentView(r(i, new HMTimeChooseView.ITimeChooseListener() { // from class: j55
            @Override // com.huami.widget.wheelview.HMTimeChooseView.ITimeChooseListener
            public final void onTimeChoose(int i2, int i3) {
                MiliNowTimeSettingActivity.C(atomicInteger, i2, i3);
            }
        })).setPositiveButton(getString(R.string.yes), new DialogInterface.OnClickListener() { // from class: f55
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                MiliNowTimeSettingActivity.D(atomicInteger, isStart, start, stop, this, dialogInterface, i2);
            }
        }).setNegativeButton(getString(R.string.cancel), new DialogInterface.OnClickListener() { // from class: g55
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                MiliNowTimeSettingActivity.E(dialogInterface, i2);
            }
        }).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(AtomicInteger atomicInteger, int i, int i2) {
        atomicInteger.set((i * 60) + i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(AtomicInteger atomicInteger, boolean z, int i, int i2, MiliNowTimeSettingActivity miliNowTimeSettingActivity, DialogInterface dialogInterface, int i3) {
        int i4 = atomicInteger.get();
        if ((z && i4 == i) || (!z && i4 == i2)) {
            return;
        }
        if (z && i4 >= i2) {
            Toast.makeText(miliNowTimeSettingActivity, R.string.long_sit_start_gt_stop, 0).show();
        } else if (z || i4 > i) {
            miliNowTimeSettingActivity.G(z, i4);
        } else {
            Toast.makeText(miliNowTimeSettingActivity, R.string.long_sit_stop_lt_start, 0).show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(DialogInterface dialogInterface, int i) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        IconToast.showError(this, R.string.long_sit_set_failed);
    }

    private final void G(boolean isStart, int newTime) {
        HMNowTimeConfig.NowTimeSettings nowTimeSettings = this.mNowTimeSettings;
        if (nowTimeSettings == null) {
            return;
        }
        if (isStart) {
            nowTimeSettings.setStart(newTime);
            HMBaseDevice hMBaseDeviceT = t();
            if (hMBaseDeviceT == null) {
                return;
            }
            Function4<HMBaseDevice, HMNowTimeConfig.NowTimeSettings, ItemView, Integer, Unit> function4 = this.configAction;
            ItemView itemView = this.mStartItem;
            Objects.requireNonNull(itemView);
            function4.invoke(hMBaseDeviceT, nowTimeSettings, itemView, 1);
            return;
        }
        nowTimeSettings.setStop(newTime);
        HMBaseDevice hMBaseDeviceT2 = t();
        if (hMBaseDeviceT2 == null) {
            return;
        }
        Function4<HMBaseDevice, HMNowTimeConfig.NowTimeSettings, ItemView, Integer, Unit> function5 = this.configAction;
        ItemView itemView2 = this.mStopItem;
        Objects.requireNonNull(itemView2);
        function5.invoke(hMBaseDeviceT2, nowTimeSettings, itemView2, 2);
    }

    private final void initData() {
        HMNowTimeConfig.NowTimeSettings nowTimeSettingsFromNowTimeConfig = HMNowTimeConfig.INSTANCE.fromNowTimeConfig();
        this.mNowTimeSettings = nowTimeSettingsFromNowTimeConfig;
        if (nowTimeSettingsFromNowTimeConfig == null) {
            return;
        }
        ItemView itemView = this.mEnableItem;
        Objects.requireNonNull(itemView);
        itemView.setChecked(nowTimeSettingsFromNowTimeConfig.getEnable());
        ItemView itemView2 = this.mStartItem;
        Objects.requireNonNull(itemView2);
        itemView2.setValue(v(nowTimeSettingsFromNowTimeConfig.getStart()));
        ItemView itemView3 = this.mStopItem;
        Objects.requireNonNull(itemView3);
        itemView3.setValue(v(nowTimeSettingsFromNowTimeConfig.getStop()));
    }

    private final void initViews() {
        this.mEnableItem = (ItemView) findViewById(R.id.item_enable);
        this.mStartItem = (ItemView) findViewById(R.id.item_start_time);
        this.mStopItem = (ItemView) findViewById(R.id.item_end_time);
    }

    private final HMTimeChooseView r(int minutes, HMTimeChooseView.ITimeChooseListener listener) {
        HMTimeChooseView hMTimeChooseView = new HMTimeChooseView(this);
        hMTimeChooseView.setInitialTime(minutes / 60, 0);
        hMTimeChooseView.setOnTimeChooseListener(listener);
        hMTimeChooseView.mMinWheel.setClickable(false);
        hMTimeChooseView.mMinWheel.setEnabled(false);
        return hMTimeChooseView;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    private final void s() {
        boolean z;
        ItemView itemView = this.mEnableItem;
        Objects.requireNonNull(itemView);
        if (itemView.isEnabled()) {
            ItemView itemView2 = this.mEnableItem;
            Objects.requireNonNull(itemView2);
            if (itemView2.isChecked()) {
                z = true;
            } else {
                z = false;
            }
        } else {
            z = false;
        }
        ItemView itemView3 = this.mStartItem;
        Objects.requireNonNull(itemView3);
        itemView3.setEnabled(z);
        ItemView itemView4 = this.mStopItem;
        Objects.requireNonNull(itemView4);
        itemView4.setEnabled(z);
    }

    private final HMBaseDevice t() {
        return (HMBaseDevice) this.device.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceManagerApi u() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String v(int idx) {
        Calendar calendar = Calendar.getInstance();
        calendar.clear();
        calendar.set(11, idx / 60);
        calendar.set(12, 0);
        return TimeUtils.formatTime(DeviceXFunctionsKt.getContext(), calendar.getTime());
    }

    private final void w() {
        ItemView itemView = this.mStartItem;
        Objects.requireNonNull(itemView);
        itemView.setOnClickListener(new View.OnClickListener() { // from class: i55
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MiliNowTimeSettingActivity.x(this.a, view);
            }
        });
        ItemView itemView2 = this.mStopItem;
        Objects.requireNonNull(itemView2);
        itemView2.setOnClickListener(new View.OnClickListener() { // from class: h55
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MiliNowTimeSettingActivity.y(this.a, view);
            }
        });
        ItemView itemView3 = this.mEnableItem;
        Objects.requireNonNull(itemView3);
        itemView3.setOnCheckedChangeListener(new ItemView.OnCheckedChangeListener() { // from class: k55
            @Override // com.xiaomi.hm.health.baseui.widget.ItemView.OnCheckedChangeListener
            public final void onCheckedChanged(ItemView itemView4, boolean z, boolean z2) {
                MiliNowTimeSettingActivity.z(this.a, itemView4, z, z2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void x(MiliNowTimeSettingActivity miliNowTimeSettingActivity, View view) {
        miliNowTimeSettingActivity.B(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void y(MiliNowTimeSettingActivity miliNowTimeSettingActivity, View view) {
        miliNowTimeSettingActivity.B(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(MiliNowTimeSettingActivity miliNowTimeSettingActivity, ItemView itemView, boolean z, boolean z2) {
        if (z2) {
            HMNowTimeConfig.NowTimeSettings nowTimeSettings = miliNowTimeSettingActivity.mNowTimeSettings;
            if (nowTimeSettings != null) {
                nowTimeSettings.setEnable(z);
                HMBaseDevice hMBaseDeviceT = miliNowTimeSettingActivity.t();
                if (hMBaseDeviceT != null) {
                    Function4<HMBaseDevice, HMNowTimeConfig.NowTimeSettings, ItemView, Integer, Unit> function4 = miliNowTimeSettingActivity.configAction;
                    ItemView itemView2 = miliNowTimeSettingActivity.mEnableItem;
                    Objects.requireNonNull(itemView2);
                    function4.invoke(hMBaseDeviceT, nowTimeSettings, itemView2, 0);
                }
            }
            miliNowTimeSettingActivity.s();
        }
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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mili_now_time_setting);
        setStyle(BaseTitleActivity.STYLE.BACK_AND_TITLE, -1, getString(R.string.now_time), true);
        initViews();
        initData();
        w();
    }
}
