package com.xiaomi.hm.health.device.earbud.activity;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.widget.RelativeLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.p008lifecycle.Observer;
import androidx.p008lifecycle.ViewModelLazy;
import androidx.p008lifecycle.ViewModelProvider;
import androidx.p008lifecycle.ViewModelStore;
import com.amap.api.mapcore.util.hl;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.devicex.funapi.DeviceXFunctionsKt;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.femalehealth.uilib.widget.ExtKt;
import com.huami.lib.rainbow.ListTile;
import com.huami.lib.rainbow.titlebar.RainbowTitleBar;
import com.huami.tools.log.HMLog;
import com.huami.widget.toast.IconToast;
import com.huami.widget.typeface.TypefaceTextView;
import com.loc.z;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HmBaseEarbudDevice;
import com.xiaomi.hm.health.bt.device.HmEarbudDevice;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.earbud.model.EarbudRebootInfo;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.BaseEarbudDeviceActivity;
import com.xiaomi.hm.health.device.deviceconfig.configs.ConfigHelperKt;
import com.xiaomi.hm.health.device.earbud.activity.HmEarbudSettingActivity;
import com.xiaomi.hm.health.device.earbud.util.EarbudUtil;
import com.xiaomi.hm.health.device.earbud.viewmodel.EarbudDeviceViewModel;
import com.xiaomi.hm.health.device.firmware.FirmwareManagerApi;
import com.xiaomi.hm.health.device.firmware.FirmwareOnlineManagerApi;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.device.view.EditDeviceDisplayNameDialog;
import com.xiaomi.hm.health.eventbus.EventFwCheckResult;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.utils.DeviceManualUtils;
import com.ximalaya.ting.android.opensdk.constants.DTransferConstants;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 X2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001XB\u0007¢\u0006\u0004\bV\u0010WJ\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0019\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\b\u0010\u0011\u001a\u00020\u0006H\u0002J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0006H\u0002J\b\u0010\u0014\u001a\u00020\u0004H\u0002J\u0010\u0010\u0016\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\tH\u0002J\u0010\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0012\u0010\u001a\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002J\u0012\u0010\u001d\u001a\u00020\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014J\b\u0010\u001e\u001a\u00020\u0004H\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0014J\u000e\u0010\"\u001a\u00020\u00042\u0006\u0010!\u001a\u00020 J\"\u0010'\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\t2\u0006\u0010$\u001a\u00020\t2\b\u0010&\u001a\u0004\u0018\u00010%H\u0014R\u001d\u0010,\u001a\u00020\u00028T@\u0014X\u0094\u0084\u0002¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u001d\u00101\u001a\u00020-8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010)\u001a\u0004\b/\u00100R\u001d\u00105\u001a\u0002028B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010)\u001a\u0004\b\u000f\u00104R\u001d\u0010:\u001a\u0002068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010)\u001a\u0004\b8\u00109R\u001d\u0010?\u001a\u00020;8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010)\u001a\u0004\b=\u0010>R\u001d\u0010D\u001a\u00020@8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010)\u001a\u0004\bB\u0010CR\u001d\u0010I\u001a\u00020E8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010)\u001a\u0004\bG\u0010HR\u0018\u0010M\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010P\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u001d\u0010U\u001a\u00020Q8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\bR\u0010)\u001a\u0004\bS\u0010T¨\u0006Y"}, d2 = {"Lcom/xiaomi/hm/health/device/earbud/activity/HmEarbudSettingActivity;", "Lcom/xiaomi/hm/health/device/BaseEarbudDeviceActivity;", "Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudDeviceViewModel;", "Lorg/koin/core/component/KoinComponent;", "", "initView", "", "enable", "O", "", "minute", "", "r", "(Ljava/lang/Integer;)Ljava/lang/String;", "Landroid/view/View;", "v", com.google.android.exoplayer2.text.ttml.b.r, "N", "isLeft", SOAP.XMLNS, "K", "what", DTransferConstants.SEARCH_KEY, "Landroid/app/Activity;", "activity", "M", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "observeData", "onResume", "Lcom/xiaomi/hm/health/eventbus/EventFwCheckResult;", "result", "onEventMainThread", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", GoogleApiAvailabilityLight.a, "Lkotlin/Lazy;", "getMViewModel", "()Lcom/xiaomi/hm/health/device/earbud/viewmodel/EarbudDeviceViewModel;", "mViewModel", "Lcom/xiaomi/hm/health/device/firmware/FirmwareOnlineManagerApi;", "e", "x", "()Lcom/xiaomi/hm/health/device/firmware/FirmwareOnlineManagerApi;", "firmwareOnlineManagerApi", "Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "f", "()Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "deviceXNavigator", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "g", "u", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "Lcom/xiaomi/hm/health/device/firmware/FirmwareManagerApi;", "h", "w", "()Lcom/xiaomi/hm/health/device/firmware/FirmwareManagerApi;", "firmwareManagerApi", "Lcom/huami/devicex/manager/DeviceManagerApi;", "i", "t", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", z.j, "y", "()Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "mDeviceSouce", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", hl.k, "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mCheckingDialog", "l", "Z", "isCheckByUser", "Landroid/os/Handler;", "m", "z", "()Landroid/os/Handler;", "mHandler", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HmEarbudSettingActivity extends BaseEarbudDeviceActivity<EarbudDeviceViewModel> implements KoinComponent {
    private static final int n = 0;
    private static final int o = 1;

    @NotNull
    private static final String p = "HmEarbudSettingActivity";
    private static final int q = 22;
    private static final long r = 30000;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    private final Lazy mViewModel = new ViewModelLazy(Reflection.getOrCreateKotlinClass(EarbudDeviceViewModel.class), new Function0<ViewModelStore>() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudSettingActivity$special$$inlined$viewModels$default$2
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
    }, new Function0<ViewModelProvider.Factory>() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudSettingActivity$special$$inlined$viewModels$default$1
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
    private final Lazy firmwareOnlineManagerApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceXNavigator;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    private final Lazy firmwareManagerApi;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    private final Lazy mDeviceSouce;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mCheckingDialog;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private boolean isCheckByUser;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    private final Lazy mHandler;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "MESSAGE_TIMEOUT";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function1<View, Unit> {
        public b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            HmEarbudSettingActivity.this.startActivity(new Intent(HmEarbudSettingActivity.this, (Class<?>) HmEarbudOperSettingActivity.class));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function1<View, Unit> {
        public c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            HmEarbudSettingActivity.this.v().startUnbindDeviceActivityForResult(HmEarbudSettingActivity.this, 1);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function1<View, Unit> {
        public d() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            HmEarbudSettingActivity.this.startActivity(new Intent(HmEarbudSettingActivity.this, (Class<?>) HmEarbudResetActivity.class));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function1<View, Unit> {
        public e() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            HmEarbudSettingActivity.this.startActivityForResult(new Intent(HmEarbudSettingActivity.this, (Class<?>) HmEarbudPlayTimeSettingActivity.class), 0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function1<View, Unit> {
        public f() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            HmEarbudSettingActivity.this.startActivity(new Intent(HmEarbudSettingActivity.this, (Class<?>) HmEarbudAlarmActivity.class));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function1<View, Unit> {
        public g() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            EarbudUtil.INSTANCE.showEarbudHelp(HmEarbudSettingActivity.this);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function1<View, Unit> {
        public h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            HmEarbudSettingActivity.this.p(view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Landroid/view/View;", "it", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function1<View, Unit> {
        public i() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(@NotNull View view) {
            HmEarbudSettingActivity.this.startActivity(new Intent(HmEarbudSettingActivity.this, (Class<?>) HmEarbudNotifyActivity.class));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class j extends Lambda implements Function0<HMDeviceSource> {
        public j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final HMDeviceSource getA() {
            return HmEarbudSettingActivity.this.t().getBoundDeviceSource(HMDeviceType.EARBUD);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class k extends Lambda implements Function0<String> {
        public final /* synthetic */ EventFwCheckResult a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(EventFwCheckResult eventFwCheckResult) {
            super(0);
            this.a = eventFwCheckResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "status:" + this.a.isSuccess;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HmEarbudSettingActivity() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.firmwareOnlineManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<FirmwareOnlineManagerApi>() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudSettingActivity$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.firmware.FirmwareOnlineManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final FirmwareOnlineManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(FirmwareOnlineManagerApi.class), qualifier, objArr);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceXNavigator = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<DeviceXNavigator>() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudSettingActivity$special$$inlined$inject$default$2
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
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudSettingActivity$special$$inlined$inject$default$3
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
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), objArr4, objArr5);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode4 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.firmwareManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode4, (Function0) new Function0<FirmwareManagerApi>() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudSettingActivity$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.firmware.FirmwareManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final FirmwareManagerApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(FirmwareManagerApi.class), objArr6, objArr7);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode5 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr8 = 0 == true ? 1 : 0;
        final Object[] objArr9 = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode5, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudSettingActivity$special$$inlined$inject$default$5
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
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), objArr8, objArr9);
            }
        });
        this.mDeviceSouce = LazyKt__LazyJVMKt.lazy(new j());
        this.mHandler = LazyKt__LazyJVMKt.lazy(new Function0<HmEarbudSettingActivity$mHandler$2.AnonymousClass1>() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudSettingActivity$mHandler$2
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v0, types: [com.xiaomi.hm.health.device.earbud.activity.HmEarbudSettingActivity$mHandler$2$1] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final AnonymousClass1 getA() {
                final HmEarbudSettingActivity hmEarbudSettingActivity = this.a;
                return new Handler() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudSettingActivity$mHandler$2.1
                    @Override // android.os.Handler
                    public void dispatchMessage(@NotNull Message msg) {
                        super.dispatchMessage(msg);
                        hmEarbudSettingActivity.q(msg.what);
                    }
                };
            }
        });
    }

    private final void A(Activity activity) {
        LoadingDialog loadingDialog;
        if (activity == null || activity.isDestroyed() || activity.isFinishing() || (loadingDialog = this.mCheckingDialog) == null || !loadingDialog.isShowing()) {
            return;
        }
        this.mCheckingDialog.dismiss();
        this.mCheckingDialog = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(HmEarbudSettingActivity hmEarbudSettingActivity, View view, int i2) {
        hmEarbudSettingActivity.K();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(HmEarbudSettingActivity hmEarbudSettingActivity, View view) {
        DeviceManualUtils.showDeviceManual(hmEarbudSettingActivity, HMDeviceSource.EARBUD_CHOPIN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D(HmEarbudSettingActivity hmEarbudSettingActivity, View view) {
        return hmEarbudSettingActivity.N();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(HmEarbudSettingActivity hmEarbudSettingActivity, Integer num) {
        ((ListTile) hmEarbudSettingActivity.findViewById(R.id.play_time)).setTips(hmEarbudSettingActivity.r(num));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(HmEarbudSettingActivity hmEarbudSettingActivity, List list) {
        if (list == null || list.size() != 2) {
            return;
        }
        EarbudRebootInfo earbudRebootInfo = (EarbudRebootInfo) list.get(0);
        EarbudRebootInfo earbudRebootInfo2 = (EarbudRebootInfo) list.get(1);
        new AlertDialogFragment.Builder(hmEarbudSettingActivity).setMessage(hmEarbudSettingActivity.getString(R.string.earbud_reboot_times, new Object[]{Integer.valueOf(earbudRebootInfo.getOtherTimes()), Integer.valueOf(earbudRebootInfo2.getOtherTimes()), Integer.valueOf(earbudRebootInfo.getStTimes()), Integer.valueOf(earbudRebootInfo2.getStTimes()), Integer.valueOf(earbudRebootInfo.getLowBatteryTimes()), Integer.valueOf(earbudRebootInfo2.getLowBatteryTimes())})).setNeutralButton(hmEarbudSettingActivity.getString(R.string.i_know), (DialogInterface.OnClickListener) null).show(hmEarbudSettingActivity.getSupportFragmentManager(), "device_reboot_times");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void G(HmEarbudSettingActivity hmEarbudSettingActivity, HmEarbudDevice hmEarbudDevice) {
        if (hmEarbudDevice != null) {
            ((ListTile) hmEarbudSettingActivity.findViewById(R.id.mac_address)).setTips(hmEarbudSettingActivity.getString(R.string.earbud_mac_detail, new Object[]{hmEarbudDevice.getBluetoothDevice().getAddress(), hmEarbudDevice.getRightDevice().getBluetoothDevice().getAddress()}));
            String boundDeviceFirmwareVersion = hmEarbudSettingActivity.t().getBoundDeviceFirmwareVersion(hmEarbudDevice.getMDeviceSource().getType());
            if (boundDeviceFirmwareVersion != null) {
                if (boundDeviceFirmwareVersion.length() > 0) {
                    ((ListTile) hmEarbudSettingActivity.findViewById(R.id.fw_version)).setTips(boundDeviceFirmwareVersion);
                }
            }
            if (hmEarbudSettingActivity.x().hasFwUpgrade(HMDeviceType.EARBUD)) {
                ((ListTile) hmEarbudSettingActivity.findViewById(R.id.check_update)).setDotted(true);
            } else {
                ((ListTile) hmEarbudSettingActivity.findViewById(R.id.check_update)).setDotted(false);
            }
        }
        if (hmEarbudDevice != null && hmEarbudDevice.isAllConnected()) {
            hmEarbudSettingActivity.getMViewModel().loadPlayTimeSetting();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(HmEarbudSettingActivity hmEarbudSettingActivity, BatteryInfo batteryInfo) {
        int i2 = R.id.tv_left_battery;
        TypefaceTextView typefaceTextView = (TypefaceTextView) hmEarbudSettingActivity.findViewById(i2);
        String string = batteryInfo == null ? null : Integer.valueOf(batteryInfo.getLevel()).toString();
        if (string == null) {
            string = hmEarbudSettingActivity.getString(R.string.earbud_battery_disable);
        }
        typefaceTextView.setText(string);
        int iS = hmEarbudSettingActivity.s(true);
        ((TypefaceTextView) hmEarbudSettingActivity.findViewById(i2)).setTextColor(iS);
        ((TypefaceTextView) hmEarbudSettingActivity.findViewById(R.id.tv_left_battery_percent)).setTextColor(iS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(HmEarbudSettingActivity hmEarbudSettingActivity, BatteryInfo batteryInfo) {
        int i2 = R.id.tv_right_battery;
        TypefaceTextView typefaceTextView = (TypefaceTextView) hmEarbudSettingActivity.findViewById(i2);
        String string = batteryInfo == null ? null : Integer.valueOf(batteryInfo.getLevel()).toString();
        if (string == null) {
            string = hmEarbudSettingActivity.getString(R.string.earbud_battery_disable);
        }
        typefaceTextView.setText(string);
        int iS = hmEarbudSettingActivity.s(false);
        ((TypefaceTextView) hmEarbudSettingActivity.findViewById(i2)).setTextColor(iS);
        ((TypefaceTextView) hmEarbudSettingActivity.findViewById(R.id.tv_right_battery_percent)).setTextColor(iS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J(HmEarbudSettingActivity hmEarbudSettingActivity, View view) {
        hmEarbudSettingActivity.onBackPressed();
    }

    private final void K() {
        AlertDialogFragment alertDialogFragmentNewInstance = EditDeviceDisplayNameDialog.newInstance(t().getBindInfo(HMDeviceType.EARBUD), getBaseContext(), new EditDeviceDisplayNameDialog.IDisplayNameListener() { // from class: i74
            @Override // com.xiaomi.hm.health.device.view.EditDeviceDisplayNameDialog.IDisplayNameListener
            public final void onDisplayNameChanged(String str) {
                HmEarbudSettingActivity.L(this.a, str);
            }
        });
        if (alertDialogFragmentNewInstance == null) {
            return;
        }
        alertDialogFragmentNewInstance.show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(HmEarbudSettingActivity hmEarbudSettingActivity, String str) {
        RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) hmEarbudSettingActivity.findViewById(R.id.tv_title_bar);
        if (str == null || str.length() == 0) {
            str = "";
        }
        rainbowTitleBar.setSubtitle(str);
    }

    private final void M(Activity activity) {
        if (activity.isDestroyed()) {
            return;
        }
        int i2 = R.string.checking_new_apk;
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(activity, getString(i2));
        this.mCheckingDialog = loadingDialogShowDialog;
        loadingDialogShowDialog.setMessage(getString(i2));
        this.mCheckingDialog.setCancelable(false);
        this.mCheckingDialog.show();
        z().sendEmptyMessageDelayed(22, 30000L);
    }

    private final boolean N() {
        if (DeviceXFunctionsKt.getBuildConfigApi().isSupportMiliSleepHr()) {
            HmEarbudDevice value = getMViewModel().getDeviceData().getValue();
            if (value != null && value.isAllConnected()) {
                getMViewModel().loadDeviceResetTimes();
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(boolean enable) {
        ((AppCompatImageView) findViewById(R.id.iv_disconnect)).setVisibility(enable ? 8 : 0);
        ((RelativeLayout) findViewById(R.id.battery_container)).setVisibility(enable ? 0 : 8);
        ((ListTile) findViewById(R.id.play_time)).setEnabled(enable);
        ((ListTile) findViewById(R.id.alarm)).setEnabled(enable);
        ((ListTile) findViewById(R.id.operation)).setEnabled(enable);
        ((ListTile) findViewById(R.id.notify)).setEnabled(enable);
        ((ListTile) findViewById(R.id.reset)).setEnabled(enable);
        ((ListTile) findViewById(R.id.check_update)).setEnabled(enable);
    }

    private final void initView() {
        DeviceManagerApi deviceManagerApiT = t();
        HMDeviceType hMDeviceType = HMDeviceType.EARBUD;
        Device bindInfo = deviceManagerApiT.getBindInfo(hMDeviceType);
        if (bindInfo != null) {
            RainbowTitleBar rainbowTitleBar = (RainbowTitleBar) findViewById(R.id.tv_title_bar);
            String displayName = bindInfo.getDisplayName();
            rainbowTitleBar.setSubtitle(displayName == null || displayName.length() == 0 ? "" : bindInfo.getDisplayName());
        }
        ((RainbowTitleBar) findViewById(R.id.tv_title_bar)).setOnActionMenuClickListener(new RainbowTitleBar.OnActionMenuClickListener() { // from class: h74
            @Override // com.huami.lib.rainbow.titlebar.RainbowTitleBar.OnActionMenuClickListener
            public final void onClick(View view, int i2) {
                HmEarbudSettingActivity.B(this.a, view, i2);
            }
        });
        BTStatusFragment.newInstance(R.id.status_content, getSupportFragmentManager()).setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.device.earbud.activity.HmEarbudSettingActivity.initView.3
            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            @NotNull
            public HMDeviceType getHMDeviceType() {
                return HMDeviceType.EARBUD;
            }

            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                super.onEnableChange(enable);
                HmEarbudSettingActivity.this.O(enable);
                if (enable) {
                    HmEarbudSettingActivity.this.getMViewModel().loadPlayTime();
                }
            }
        });
        ExtKt.smartClick$default((ListTile) findViewById(R.id.reset), 0L, new d(), 1, null);
        ExtKt.smartClick$default((ListTile) findViewById(R.id.play_time), 0L, new e(), 1, null);
        ExtKt.smartClick$default((ListTile) findViewById(R.id.alarm), 0L, new f(), 1, null);
        ExtKt.smartClick$default((ListTile) findViewById(R.id.help), 0L, new g(), 1, null);
        ExtKt.smartClick$default((ListTile) findViewById(R.id.check_update), 0L, new h(), 1, null);
        ExtKt.smartClick$default((ListTile) findViewById(R.id.notify), 0L, new i(), 1, null);
        ExtKt.smartClick$default((ListTile) findViewById(R.id.operation), 0L, new b(), 1, null);
        int i2 = R.id.play_device;
        ((ListTile) findViewById(i2)).setTitle(getString(R.string.play_with_device, new Object[]{getString(ConfigHelperKt.getDeviceDesc(y()))}));
        ((ListTile) findViewById(i2)).setOnClickListener(new View.OnClickListener() { // from class: a74
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HmEarbudSettingActivity.C(this.a, view);
            }
        });
        ((ListTile) findViewById(R.id.mac_address)).setOnLongClickListener(new View.OnLongClickListener() { // from class: b74
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return HmEarbudSettingActivity.D(this.a, view);
            }
        });
        ExtKt.smartClick$default(findViewById(R.id.setting_unbind), 0L, new c(), 1, null);
        ((ListTile) findViewById(R.id.fw_version)).setTips(t().getBoundDeviceFirmwareVersion(hMDeviceType));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(View v) {
        if (!NetUtil.isNetworkConnected(this)) {
            IconToast.showError(this, getString(R.string.no_network_connection));
            return;
        }
        if (u().isFastDoubleClick(v)) {
            return;
        }
        FirmwareOnlineManagerApi firmwareOnlineManagerApiX = x();
        HMDeviceType hMDeviceType = HMDeviceType.EARBUD;
        if (firmwareOnlineManagerApiX.hasFwUpgrade(hMDeviceType)) {
            v().startFwUpgradeInfoActivity(this, y());
            return;
        }
        this.isCheckByUser = true;
        M(this);
        w().checkFw(hMDeviceType, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(int what) {
        if (isFinishing() || isDestroyed() || what != 22) {
            return;
        }
        HMLog.debug("timeout", a.a);
        A(this);
        IconToast.showSuccess(this, R.string.fw_uptodate);
    }

    private final String r(Integer minute) {
        if (minute == null) {
            return getString(R.string.earbud_smart_play);
        }
        return minute.intValue() <= 0 ? getString(R.string.earbud_play_time_no_limit) : u().formatMinute(minute.intValue());
    }

    private final int s(boolean isLeft) {
        HmBaseEarbudDevice rightDevice;
        boolean z;
        Integer numValueOf = null;
        if (isLeft) {
            HmEarbudDevice value = getMViewModel().getDeviceData().getValue();
            z = (value == null ? null : value.getBatteryInfo()) == null;
            BatteryInfo value2 = getMViewModel().getLeftBatteryData().getValue();
            if (value2 != null) {
                numValueOf = Integer.valueOf(value2.getLevel());
            }
        } else {
            HmEarbudDevice value3 = getMViewModel().getDeviceData().getValue();
            z = ((value3 != null && (rightDevice = value3.getRightDevice()) != null) ? rightDevice.getBatteryInfo() : null) == null;
            BatteryInfo value4 = getMViewModel().getRightBatteryData().getValue();
            if (value4 != null) {
                numValueOf = Integer.valueOf(value4.getLevel());
            }
        }
        int iIntValue = numValueOf == null ? -1 : numValueOf.intValue();
        if (z) {
            return ContextCompat.getColor(this, R.color.s2);
        }
        return iIntValue >= 0 && iIntValue <= 20 ? ContextCompat.getColor(this, R.color.p3) : ContextCompat.getColor(this, R.color.s1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceManagerApi t() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final DeviceUtilsApi u() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceXNavigator v() {
        return (DeviceXNavigator) this.deviceXNavigator.getValue();
    }

    private final FirmwareManagerApi w() {
        return (FirmwareManagerApi) this.firmwareManagerApi.getValue();
    }

    private final FirmwareOnlineManagerApi x() {
        return (FirmwareOnlineManagerApi) this.firmwareOnlineManagerApi.getValue();
    }

    private final HMDeviceSource y() {
        return (HMDeviceSource) this.mDeviceSouce.getValue();
    }

    private final Handler z() {
        return (Handler) this.mHandler.getValue();
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
        getMViewModel().getDeviceData().observe(this, new Observer() { // from class: c74
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HmEarbudSettingActivity.G(this.a, (HmEarbudDevice) obj);
            }
        });
        getMViewModel().getLeftBatteryData().observe(this, new Observer() { // from class: e74
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HmEarbudSettingActivity.H(this.a, (BatteryInfo) obj);
            }
        });
        getMViewModel().getRightBatteryData().observe(this, new Observer() { // from class: d74
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HmEarbudSettingActivity.I(this.a, (BatteryInfo) obj);
            }
        });
        getMViewModel().getPlayTimeSetting().observe(this, new Observer() { // from class: f74
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HmEarbudSettingActivity.E(this.a, (Integer) obj);
            }
        });
        getMViewModel().getDeviceRebootTimeData().observe(this, new Observer() { // from class: g74
            @Override // androidx.p008lifecycle.Observer
            public final void onChanged(Object obj) {
                HmEarbudSettingActivity.F(this.a, (List) obj);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 0) {
            getMViewModel().loadPlayTimeSetting();
        } else if (requestCode == 1 && resultCode == -1) {
            getMViewModel().removeAllDownload();
            finish();
        }
    }

    @Override // com.xiaomi.hm.health.device.BaseEarbudDeviceActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_earbud_setting);
        int i2 = R.id.tv_title_bar;
        ((RainbowTitleBar) findViewById(i2)).setTitle(u().getDeviceDescription(y()));
        ((RainbowTitleBar) findViewById(i2)).setNavigationOnClickListener(new View.OnClickListener() { // from class: z64
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HmEarbudSettingActivity.J(this.a, view);
            }
        });
        initView();
        observeData();
    }

    public final void onEventMainThread(@NotNull EventFwCheckResult result) {
        HMLog.debug(getTAG(), new k(result));
        z().removeMessages(22);
        A(this);
        ((ListTile) findViewById(R.id.check_update)).setDotted(result.isSuccess);
        if (result.isSuccess && this.isCheckByUser) {
            this.isCheckByUser = false;
            v().startFwUpgradeInfoActivity(this, y());
        } else if (this.isCheckByUser) {
            this.isCheckByUser = false;
            IconToast.showSuccess(this, R.string.fw_uptodate);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        w().checkFw(HMDeviceType.EARBUD, true);
    }
}
