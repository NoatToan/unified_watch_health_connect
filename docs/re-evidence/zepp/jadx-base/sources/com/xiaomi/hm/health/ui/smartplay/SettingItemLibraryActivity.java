package com.xiaomi.hm.health.ui.smartplay;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.bluetooth.profile.ecf.data.HidStatus;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.injection.data.PropertyStoreApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.hid.HidSdk;
import com.huami.hid.takepic.BluetoothServiceListener;
import com.huami.hid.takepic.HidListener;
import com.huami.lib.rainbow.ListTile;
import com.huami.stress.domain.utils.LogTagUtilsKt;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.wallet.ui.helper.LoadingDialogHelper;
import com.xiaomi.hm.health.baseutil.Language;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMCallback;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.device.HMMiLiProDevice;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.OffWistConfig;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.discovery.WebHelper;
import com.xiaomi.hm.health.ui.BLEStatueListenerAdapter;
import com.xiaomi.hm.health.ui.BTStatusFragment;
import com.xiaomi.hm.health.ui.UnifyTitleBarStyle;
import com.xiaomi.hm.health.ui.smartplay.SettingItemLibraryActivity;
import com.xiaomi.hm.health.utils.CincoAnalytics;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;
import org.cybergarage.soap.SOAP;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.qualifier.Qualifier;
import org.koin.mp.KoinPlatformTools;

/* JADX INFO: loaded from: classes22.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u0000 <2\u00020\u00012\u00020\u0002:\u0001<B\u0007¢\u0006\u0004\b:\u0010;J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0002J\b\u0010\n\u001a\u00020\u0003H\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\u0003H\u0002J\u0012\u0010\u000f\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u0010\u001a\u00020\u0003H\u0014J\b\u0010\u0011\u001a\u00020\u0003H\u0014R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001d\u0010\u001a\u001a\u00020\u00168B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019R\u001d\u0010\u001f\u001a\u00020\u001b8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010\"\u001a\u00020 8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u0017\u0010!R\u001d\u0010&\u001a\u00020#8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0018\u001a\u0004\b\u001c\u0010%R\u0016\u0010*\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010)R\u0016\u00100\u001a\u00020-8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00101\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010)R\u0016\u00103\u001a\u00020\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u00102R\"\u00109\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00102\u001a\u0004\b5\u00106\"\u0004\b7\u00108¨\u0006="}, d2 = {"Lcom/xiaomi/hm/health/ui/smartplay/SettingItemLibraryActivity;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lorg/koin/core/component/KoinComponent;", "", "F", "u", "t", "", "success", "J", "G", SOAP.XMLNS, "w", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "onStart", "onDestroy", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "x", "Lcom/huami/wallet/ui/helper/LoadingDialogHelper;", "loadingDialogHelper", "Lcom/huami/devicex/manager/DeviceManagerApi;", "y", "Lkotlin/Lazy;", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/huami/devicex/injection/data/PropertyStoreApi;", "z", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "()Lcom/huami/devicex/injection/data/PropertyStoreApi;", "propertyStoreApi", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "B", "()Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "deviceXNavigator", "Lcom/huami/lib/rainbow/ListTile;", "C", "Lcom/huami/lib/rainbow/ListTile;", "laptopItem", LogUtil.D, "offWistLockItem", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "E", "Lcom/xiaomi/hm/health/bt/device/HMMiLiProDevice;", "device", "takePicView", "Z", "isLapTopChecked", "H", "getTrigCallback", "()Z", "setTrigCallback", "(Z)V", "trigCallback", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class SettingItemLibraryActivity extends BaseTitleActivity implements KoinComponent {

    @NotNull
    public static final String TAG = "SettingItemLibraryActivity";

    @NotNull
    public static final String URL_FOR_HELP_OTHER = "https://m.pc.mi.com/software/Miunlock/Users_guide/en";

    @NotNull
    public static final String URL_FOR_HELP_SIMPLE_CHINESE = "https://m.pc.mi.com/software/MiUnlock/Users_guide";

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceXNavigator;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private ListTile laptopItem;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private ListTile offWistLockItem;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    private final HMMiLiProDevice device;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    private ListTile takePicView;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private boolean isLapTopChecked;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private boolean trigCallback;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    private LoadingDialogHelper loadingDialogHelper;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Lazy propertyStoreApi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<String> {
        public final /* synthetic */ String a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str) {
            super(0);
            this.a = str;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "lockStr " + this.a;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "onDestroy " + SettingItemLibraryActivity.this.y().toPropertyBoolStr(SettingItemLibraryActivity.this.isLapTopChecked);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<String> {
        public final /* synthetic */ boolean a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z) {
            super(0);
            this.a = z;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "showSuccFail " + this.a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SettingItemLibraryActivity() {
        KoinPlatformTools koinPlatformTools = KoinPlatformTools.INSTANCE;
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode = koinPlatformTools.defaultLazyMode();
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.ui.smartplay.SettingItemLibraryActivity$special$$inlined$inject$default$1
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
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode2 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.propertyStoreApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode2, (Function0) new Function0<PropertyStoreApi>() { // from class: com.xiaomi.hm.health.ui.smartplay.SettingItemLibraryActivity$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.data.PropertyStoreApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final PropertyStoreApi getA() {
                KoinComponent koinComponent = this;
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(PropertyStoreApi.class), objArr2, objArr3);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyModeDefaultLazyMode3 = koinPlatformTools.defaultLazyMode();
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode3, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.ui.smartplay.SettingItemLibraryActivity$special$$inlined$inject$default$3
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
        this.deviceXNavigator = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyModeDefaultLazyMode4, (Function0) new Function0<DeviceXNavigator>() { // from class: com.xiaomi.hm.health.ui.smartplay.SettingItemLibraryActivity$special$$inlined$inject$default$4
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
                return (koinComponent instanceof KoinScopeComponent ? ((KoinScopeComponent) koinComponent).getScope() : koinComponent.getKoin().getScopeRegistry().getRootScope()).get(Reflection.getOrCreateKotlinClass(DeviceXNavigator.class), objArr6, objArr7);
            }
        });
        HMBaseDevice device = x().getDevice(HMDeviceType.MILI);
        Objects.requireNonNull(device, "null cannot be cast to non-null type com.xiaomi.hm.health.bt.device.HMMiLiProDevice");
        this.device = (HMMiLiProDevice) device;
        this.trigCallback = true;
    }

    private final PropertyStoreApi A() {
        return (PropertyStoreApi) this.propertyStoreApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(View view) {
        if (Language.isSimplifiedChinese()) {
            WebHelper.launch(URL_FOR_HELP_SIMPLE_CHINESE);
        } else {
            WebHelper.launch(URL_FOR_HELP_OTHER);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(SettingItemLibraryActivity settingItemLibraryActivity, View view) {
        CincoAnalytics.cincoOperateAnalytics("Wrist_Lock");
        settingItemLibraryActivity.z().startOffWistSettingActivity(settingItemLibraryActivity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(SettingItemLibraryActivity settingItemLibraryActivity, CompoundButton compoundButton, boolean z) {
        settingItemLibraryActivity.isLapTopChecked = z;
        if (settingItemLibraryActivity.getTrigCallback()) {
            if (z) {
                settingItemLibraryActivity.G();
            } else {
                settingItemLibraryActivity.u();
            }
        }
        settingItemLibraryActivity.setTrigCallback(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(SettingItemLibraryActivity settingItemLibraryActivity, View view) {
        HidSdk.startTakePicSettingActivity(settingItemLibraryActivity, HMDeviceConfig.isWatch());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F() {
        ListTile listTile = this.takePicView;
        if (listTile == null) {
            return;
        }
        listTile.setTips(HidSdk.INSTANCE.updateSettingStatus(this));
    }

    private final void G() {
        new AlertDialogFragment.Builder(this).setMessage(R.string.mi_laptop_unlock_msg).setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() { // from class: mr6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SettingItemLibraryActivity.H(this.a, dialogInterface, i);
            }
        }).setPositiveButton(R.string.confirm, new DialogInterface.OnClickListener() { // from class: kr6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SettingItemLibraryActivity.I(this.a, dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(SettingItemLibraryActivity settingItemLibraryActivity, DialogInterface dialogInterface, int i) {
        settingItemLibraryActivity.s();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void I(SettingItemLibraryActivity settingItemLibraryActivity, DialogInterface dialogInterface, int i) {
        settingItemLibraryActivity.w();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void J(boolean success) {
        if (isFinishing() || isDestroyed()) {
            return;
        }
        HMLog.debug(LogTagUtilsKt.getTAG(this), new c(success));
        LoadingDialogHelper loadingDialogHelper = this.loadingDialogHelper;
        if (loadingDialogHelper != null) {
            loadingDialogHelper.showLoading();
        }
        if (success) {
            LoadingDialogHelper loadingDialogHelper2 = this.loadingDialogHelper;
            if (loadingDialogHelper2 == null) {
                return;
            }
            loadingDialogHelper2.setSuccess(R.string.close_success);
            return;
        }
        LoadingDialogHelper loadingDialogHelper3 = this.loadingDialogHelper;
        if (loadingDialogHelper3 == null) {
            return;
        }
        loadingDialogHelper3.setFail(R.string.close_fail);
    }

    private final void s() {
        this.trigCallback = false;
        ListTile listTile = this.laptopItem;
        Objects.requireNonNull(listTile);
        listTile.setChecked(false);
    }

    private final void t() {
        this.device.enableMultiLink(false, new HMCallback<Object>() { // from class: com.xiaomi.hm.health.ui.smartplay.SettingItemLibraryActivity$cancelMultiLink$1

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
                    return "onFinish " + this.a;
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
                    return "start";
                }
            }

            {
                super(true);
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                HMLog.debug(LogTagUtilsKt.getTAG(this), new a(result));
                ListTile listTile = this.a.laptopItem;
                Objects.requireNonNull(listTile);
                listTile.setChecked(!result);
                this.a.J(result);
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onStart() {
                super.onStart();
                HMLog.debug(LogTagUtilsKt.getTAG(this), b.a);
            }
        });
    }

    private final void u() {
        AlertDialogFragment.Builder builder = new AlertDialogFragment.Builder(this);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        builder.setMessage(String.format(getString(R.string.mi_laptop_close_msg_new), Arrays.copyOf(new Object[]{getString(R.string.xiaomi_laptop_unlock)}, 1))).setNeutralButton(R.string.got_it, new DialogInterface.OnClickListener() { // from class: lr6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                SettingItemLibraryActivity.v(this.a, dialogInterface, i);
            }
        }).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void v(SettingItemLibraryActivity settingItemLibraryActivity, DialogInterface dialogInterface, int i) {
        settingItemLibraryActivity.t();
    }

    private final void w() {
        this.device.enableMultiLink(true, new HMCallback<Object>() { // from class: com.xiaomi.hm.health.ui.smartplay.SettingItemLibraryActivity$enableMutli$1

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
                    return "onFinish " + this.a;
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
                    return "start";
                }
            }

            {
                super(true);
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onFinish(boolean result) {
                HMLog.debug(LogTagUtilsKt.getTAG(this), new a(result));
                ListTile listTile = this.a.laptopItem;
                Objects.requireNonNull(listTile);
                listTile.setChecked(result);
                if (result) {
                    LoadingDialogHelper loadingDialogHelper = this.a.loadingDialogHelper;
                    if (loadingDialogHelper == null) {
                        return;
                    }
                    loadingDialogHelper.setSuccess(R.string.open_success);
                    return;
                }
                LoadingDialogHelper loadingDialogHelper2 = this.a.loadingDialogHelper;
                if (loadingDialogHelper2 == null) {
                    return;
                }
                loadingDialogHelper2.setFail(R.string.open_fail);
            }

            @Override // com.xiaomi.hm.health.bt.device.HMCallback
            public void onStart() {
                super.onStart();
                HMLog.debug(LogTagUtilsKt.getTAG(this), b.a);
                LoadingDialogHelper loadingDialogHelper = this.a.loadingDialogHelper;
                if (loadingDialogHelper == null) {
                    return;
                }
                loadingDialogHelper.showLoading(R.string.opening);
            }
        });
    }

    private final DeviceManagerApi x() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceUtilsApi y() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    private final DeviceXNavigator z() {
        return (DeviceXNavigator) this.deviceXNavigator.getValue();
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // org.koin.core.component.KoinComponent
    @NotNull
    public Koin getKoin() {
        return KoinComponent.DefaultImpls.getKoin(this);
    }

    public final boolean getTrigCallback() {
        return this.trigCallback;
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting_library);
        UnifyTitleBarStyle.setUnifyTitleStyle$default(this, getString(R.string.library), null, 2, null);
        TextView textView = (TextView) findViewById(R.id.click_for_help);
        textView.setOnClickListener(new View.OnClickListener() { // from class: pr6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingItemLibraryActivity.B(view);
            }
        });
        this.loadingDialogHelper = new LoadingDialogHelper(this);
        ListTile listTile = (ListTile) findViewById(R.id.mi_laptop_item);
        this.laptopItem = listTile;
        Objects.requireNonNull(listTile);
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        listTile.setTitle(String.format(getString(R.string.mi_laptop_unlock_new), Arrays.copyOf(new Object[]{getString(R.string.xiaomi_laptop)}, 1)));
        ListTile listTile2 = this.laptopItem;
        Objects.requireNonNull(listTile2);
        listTile2.setSubtitle(String.format(getString(R.string.mi_laptop_unlock_info_new), Arrays.copyOf(new Object[]{getString(R.string.xiaomi_laptop_unlock)}, 1)));
        this.offWistLockItem = (ListTile) findViewById(R.id.mili_setting_off_wrist_lock_ll);
        ListTile listTile3 = this.laptopItem;
        Objects.requireNonNull(listTile3);
        listTile3.setVisibility(HMDeviceConfig.supportLaptopUnLock() ? 0 : 8);
        textView.setVisibility(HMDeviceConfig.supportLaptopUnLock() ? 0 : 8);
        ListTile listTile4 = this.offWistLockItem;
        Objects.requireNonNull(listTile4);
        listTile4.setVisibility(HMDeviceConfig.hasFeatureOffWistLock() ? 0 : 8);
        ListTile listTile5 = this.offWistLockItem;
        Objects.requireNonNull(listTile5);
        listTile5.setOnClickListener(new View.OnClickListener() { // from class: nr6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SettingItemLibraryActivity.C(this.a, view);
            }
        });
        String property = A().getProperty("huami.mifit.user.settings.lab.laptopunlock", null);
        HMLog.debug(LogTagUtilsKt.getTAG(this), new a(property));
        boolean zFromPropertyBoolStr = y().fromPropertyBoolStr(property);
        this.isLapTopChecked = zFromPropertyBoolStr;
        ListTile listTile6 = this.laptopItem;
        Objects.requireNonNull(listTile6);
        listTile6.setChecked(zFromPropertyBoolStr);
        ListTile listTile7 = this.laptopItem;
        Objects.requireNonNull(listTile7);
        listTile7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: qr6
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                SettingItemLibraryActivity.D(this.a, compoundButton, z);
            }
        });
        BTStatusFragment.newInstance(R.id.container, getSupportFragmentManager()).setBLEStatusListener(new BLEStatueListenerAdapter() { // from class: com.xiaomi.hm.health.ui.smartplay.SettingItemLibraryActivity.onCreate.5
            @Override // com.xiaomi.hm.health.ui.BLEStatueListenerAdapter, com.xiaomi.hm.health.ui.BTStatusFragment.BLEStatueListener
            public void onEnableChange(boolean enable) {
                ListTile listTile8 = SettingItemLibraryActivity.this.laptopItem;
                Objects.requireNonNull(listTile8);
                listTile8.setEnabled(enable);
                ListTile listTile9 = SettingItemLibraryActivity.this.takePicView;
                if (listTile9 == null) {
                    return;
                }
                listTile9.setEnabled(enable);
            }
        });
        if (HMDeviceConfig.supportTakePic()) {
            ListTile listTile8 = (ListTile) findViewById(R.id.take_pic);
            this.takePicView = listTile8;
            if (listTile8 != null) {
                listTile8.setSubtitle(HidSdk.INSTANCE.updateSettingTips(this, HMDeviceConfig.isWatch()));
            }
            ListTile listTile9 = this.takePicView;
            if (listTile9 != null) {
                listTile9.setVisibility(0);
            }
            String boundDeviceAddress = x().getBoundDeviceAddress(HMDeviceType.MILI);
            if (boundDeviceAddress == null) {
                boundDeviceAddress = "";
            }
            HidSdk.init(this, boundDeviceAddress, new BluetoothServiceListener() { // from class: com.xiaomi.hm.health.ui.smartplay.SettingItemLibraryActivity.onCreate.6
                @Override // com.huami.hid.takepic.BluetoothServiceListener
                public void connected() {
                    SettingItemLibraryActivity.this.F();
                }
            }, new HidListener() { // from class: com.xiaomi.hm.health.ui.smartplay.SettingItemLibraryActivity.onCreate.7

                /* JADX INFO: renamed from: com.xiaomi.hm.health.ui.smartplay.SettingItemLibraryActivity$onCreate$7$a */
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
                        return "set connect result: " + this.a;
                    }
                }

                /* JADX INFO: renamed from: com.xiaomi.hm.health.ui.smartplay.SettingItemLibraryActivity$onCreate$7$b */
                @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
                public static final class b extends Lambda implements Function0<String> {
                    public final /* synthetic */ boolean a;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(boolean z) {
                        super(0);
                        this.a = z;
                    }

                    @Override // kotlin.jvm.functions.Function0
                    @Nullable
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final String getA() {
                        return "set disconnect result: " + this.a;
                    }
                }

                @Override // com.huami.hid.takepic.HidListener
                public void onHidConnected() {
                    HMLog.info(LogTagUtilsKt.getTAG(this), new a(SettingItemLibraryActivity.this.device.setHidStatus(new HidStatus.HidConnect())));
                }

                @Override // com.huami.hid.takepic.HidListener
                public void onHidDisconnected() {
                    HMLog.info(LogTagUtilsKt.getTAG(this), new b(SettingItemLibraryActivity.this.device.setHidStatus(new HidStatus.HidDisconnect())));
                }
            }, false);
            ListTile listTile10 = this.takePicView;
            if (listTile10 == null) {
                return;
            }
            listTile10.setOnClickListener(new View.OnClickListener() { // from class: or6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SettingItemLibraryActivity.E(this.a, view);
                }
            });
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        HMLog.debug(LogTagUtilsKt.getTAG(this), new b());
        A().setProperty("huami.mifit.user.settings.lab.laptopunlock", y().toPropertyBoolStr(this.isLapTopChecked));
        A().postPropertiesToServer(true);
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        if (OffWistConfig.INSTANCE.offWistConfig().getEnabled()) {
            ListTile listTile = this.offWistLockItem;
            Objects.requireNonNull(listTile);
            listTile.setTips(R.string.alert_enable);
        } else {
            ListTile listTile2 = this.offWistLockItem;
            Objects.requireNonNull(listTile2);
            listTile2.setTips(R.string.alert_disable);
        }
        if (HMDeviceConfig.supportTakePic()) {
            F();
        }
    }

    public final void setTrigCallback(boolean z) {
        this.trigCallback = z;
    }
}
