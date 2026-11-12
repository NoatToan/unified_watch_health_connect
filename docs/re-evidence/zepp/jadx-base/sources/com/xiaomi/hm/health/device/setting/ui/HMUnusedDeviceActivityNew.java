package com.xiaomi.hm.health.device.setting.ui;

import android.content.ComponentCallbacks;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.exifinterface.media.ExifInterface;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.huami.android.design.dialog.AlertDialogFragment;
import com.huami.android.design.dialog.loading.LoadingDialog;
import com.huami.devicex.R;
import com.huami.devicex.injection.basic.DeviceUtilsApi;
import com.huami.devicex.manager.DeviceManagerApi;
import com.huami.lib.rainbow.ListTile;
import com.huami.tools.log.HMLog;
import com.huami.view.basetitle.BaseTitleActivity;
import com.huami.watch.util.Rx;
import com.huami.widget.toast.IconToast;
import com.xiaomi.hm.health.baseui.DarkModeUtilKt;
import com.xiaomi.hm.health.baseutil.GlobalConfig;
import com.xiaomi.hm.health.baseutil.NetUtil;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.device.HMDeviceType;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.databases.model.Device;
import com.xiaomi.hm.health.device.EarbudEnableHelper;
import com.xiaomi.hm.health.device.HMDeviceConfig;
import com.xiaomi.hm.health.device.HMUnusedDeviceActivity;
import com.xiaomi.hm.health.device.bind.BindServiceApi;
import com.xiaomi.hm.health.device.bind.HMUnbindBaseLogic;
import com.xiaomi.hm.health.device.bind.IUnbindListener;
import com.xiaomi.hm.health.device.bind.UnbindError;
import com.xiaomi.hm.health.device.bolt.TreadmillStartListener;
import com.xiaomi.hm.health.device.bolt.TreadmillStartTask;
import com.xiaomi.hm.health.device.firmware.HMFwUpgradeManager;
import com.xiaomi.hm.health.device.model.HMBrandType;
import com.xiaomi.hm.health.device.setting.dial.DialFetchApi;
import com.xiaomi.hm.health.device.setting.dial.UnusedDialImpl;
import com.xiaomi.hm.health.device.setting.ui.HMUnusedDeviceActivityNew;
import com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator;
import com.xiaomi.hm.health.device.view.EditDeviceDisplayNameDialog;
import com.xiaomi.hm.health.devicex.manage.api.core.manager.DeviceConnectManger;
import io.reactivex.ObservableEmitter;
import io.reactivex.ObservableOnSubscribe;
import io.reactivex.functions.Consumer;
import java.io.Serializable;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.koin.android.ext.android.AndroidKoinScopeExtKt;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.parameter.ParametersHolderKt;
import org.koin.core.qualifier.Qualifier;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 M2\u00020\u00012\u00020\u0002:\u0001MB\u0007¢\u0006\u0004\bK\u0010LJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\b\u0010\b\u001a\u00020\u0003H\u0002J\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0002J\b\u0010\u000b\u001a\u00020\u0003H\u0002J\u0018\u0010\u000f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tH\u0002J\u001a\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0013\u001a\u00020\u0012H\u0002J\u0012\u0010\u0017\u001a\u00020\u00032\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0014J\"\u0010\u001d\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00182\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0014J\u0012\u0010 \u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016J\u001c\u0010#\u001a\u00020\u00032\b\u0010\"\u001a\u0004\u0018\u00010!2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016J\u0012\u0010$\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016R\u0018\u0010(\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010+\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010*R\u001d\u00100\u001a\u00020,8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010/R\u001d\u00105\u001a\u0002018B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b2\u0010-\u001a\u0004\b3\u00104R\u001d\u0010:\u001a\u0002068B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b7\u0010-\u001a\u0004\b8\u00109R\u001d\u0010?\u001a\u00020;8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010-\u001a\u0004\b=\u0010>R\u001d\u0010C\u001a\u00020@8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010-\u001a\u0004\bA\u0010BR\u001d\u0010G\u001a\u00020D8B@\u0002X\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\bE\u0010FR\u0018\u0010J\u001a\u0004\u0018\u00010H8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010I¨\u0006N"}, d2 = {"Lcom/xiaomi/hm/health/device/setting/ui/HMUnusedDeviceActivityNew;", "Lcom/huami/view/basetitle/BaseTitleActivity;", "Lcom/xiaomi/hm/health/device/bind/IUnbindListener;", "", "initViews", "Z", "y", "z", "O", "", "E", "Y", "Landroid/widget/TextView;", "subTitleTv", "subTitle", "X", "Ljava/lang/Runnable;", "runnable", "", "delay", "V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "", "requestCode", "resultCode", "Landroid/content/Intent;", "data", "onActivityResult", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "type", "onUnbindStart", "Lcom/xiaomi/hm/health/device/bind/UnbindError;", "error", "onUnbindFailure", "onUnbindSuccess", "Lcom/xiaomi/hm/health/databases/model/Device;", "x", "Lcom/xiaomi/hm/health/databases/model/Device;", "mDevice", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "Lcom/xiaomi/hm/health/bt/device/HMDeviceSource;", "mSource", "Lcom/huami/devicex/manager/DeviceManagerApi;", "Lkotlin/Lazy;", "G", "()Lcom/huami/devicex/manager/DeviceManagerApi;", "deviceManagerApi", "Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "H", "()Lcom/huami/devicex/injection/basic/DeviceUtilsApi;", "deviceUtilsApi", "Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "B", LogUtil.I, "()Lcom/xiaomi/hm/health/device/setting/ui/navi/DeviceXNavigator;", "deviceXNavigator", "Lcom/xiaomi/hm/health/device/bind/BindServiceApi;", "C", LogUtil.D, "()Lcom/xiaomi/hm/health/device/bind/BindServiceApi;", "bindServiceApi", "Lcom/xiaomi/hm/health/device/setting/dial/DialFetchApi;", "J", "()Lcom/xiaomi/hm/health/device/setting/dial/DialFetchApi;", "unusedDialImpl", "Lcom/xiaomi/hm/health/devicex/manage/api/core/manager/DeviceConnectManger;", "F", "()Lcom/xiaomi/hm/health/devicex/manage/api/core/manager/DeviceConnectManger;", "deviceConnectManger", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "Lcom/huami/android/design/dialog/loading/LoadingDialog;", "mLoadingDlg", "<init>", "()V", "Companion", "devicex_zeppRelease"}, k = 1, mv = {1, 5, 1})
public final class HMUnusedDeviceActivityNew extends BaseTitleActivity implements IUnbindListener {
    private static final long G = 1500;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceUtilsApi;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceXNavigator;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @NotNull
    private final Lazy bindServiceApi;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private final Lazy unusedDialImpl;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceConnectManger;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    private LoadingDialog mLoadingDlg;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @Nullable
    private Device mDevice;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    @NotNull
    private HMDeviceSource mSource = HMDeviceSource.VDEVICE;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    private final Lazy deviceManagerApi;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 5, 1})
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[HMDeviceType.values().length];
            iArr[HMDeviceType.MILI.ordinal()] = 1;
            iArr[HMDeviceType.WEIGHT.ordinal()] = 2;
            iArr[HMDeviceType.SHOES.ordinal()] = 3;
            iArr[HMDeviceType.OTHER.ordinal()] = 4;
            iArr[HMDeviceType.WATCH.ordinal()] = 5;
            iArr[HMDeviceType.EARBUD.ordinal()] = 6;
            iArr[HMDeviceType.TREADMILL.ordinal()] = 7;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lorg/koin/core/parameter/ParametersHolder;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<ParametersHolder> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final ParametersHolder getA() {
            return ParametersHolderKt.parametersOf(Boolean.FALSE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HMUnusedDeviceActivityNew() {
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.SYNCHRONIZED;
        final Qualifier qualifier = null;
        final Object[] objArr = 0 == true ? 1 : 0;
        this.deviceManagerApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DeviceManagerApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.HMUnusedDeviceActivityNew$special$$inlined$inject$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.manager.DeviceManagerApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceManagerApi getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(DeviceManagerApi.class), qualifier, objArr);
            }
        });
        final Object[] objArr2 = 0 == true ? 1 : 0;
        final Object[] objArr3 = 0 == true ? 1 : 0;
        this.deviceUtilsApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DeviceUtilsApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.HMUnusedDeviceActivityNew$special$$inlined$inject$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.huami.devicex.injection.basic.DeviceUtilsApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceUtilsApi getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(DeviceUtilsApi.class), objArr2, objArr3);
            }
        });
        final Object[] objArr4 = 0 == true ? 1 : 0;
        final Object[] objArr5 = 0 == true ? 1 : 0;
        this.deviceXNavigator = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DeviceXNavigator>() { // from class: com.xiaomi.hm.health.device.setting.ui.HMUnusedDeviceActivityNew$special$$inlined$inject$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.ui.navi.DeviceXNavigator, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceXNavigator getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(DeviceXNavigator.class), objArr4, objArr5);
            }
        });
        final Object[] objArr6 = 0 == true ? 1 : 0;
        final Object[] objArr7 = 0 == true ? 1 : 0;
        this.bindServiceApi = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<BindServiceApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.HMUnusedDeviceActivityNew$special$$inlined$inject$default$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.bind.BindServiceApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final BindServiceApi getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(BindServiceApi.class), objArr6, objArr7);
            }
        });
        final a aVar = a.a;
        final Object[] objArr8 = 0 == true ? 1 : 0;
        this.unusedDialImpl = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DialFetchApi>() { // from class: com.xiaomi.hm.health.device.setting.ui.HMUnusedDeviceActivityNew$special$$inlined$inject$default$5
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.device.setting.dial.DialFetchApi, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DialFetchApi getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(DialFetchApi.class), objArr8, aVar);
            }
        });
        final Object[] objArr9 = 0 == true ? 1 : 0;
        final Object[] objArr10 = 0 == true ? 1 : 0;
        this.deviceConnectManger = LazyKt__LazyJVMKt.lazy(lazyThreadSafetyMode, (Function0) new Function0<DeviceConnectManger>() { // from class: com.xiaomi.hm.health.device.setting.ui.HMUnusedDeviceActivityNew$special$$inlined$inject$default$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Type inference failed for: r0v2, types: [com.xiaomi.hm.health.devicex.manage.api.core.manager.DeviceConnectManger, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* JADX INFO: renamed from: invoke */
            public final DeviceConnectManger getA() {
                ComponentCallbacks componentCallbacks = this;
                return AndroidKoinScopeExtKt.getKoinScope(componentCallbacks).get(Reflection.getOrCreateKotlinClass(DeviceConnectManger.class), objArr9, objArr10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void A(HMUnusedDeviceActivityNew hMUnusedDeviceActivityNew, Device device, ObservableEmitter observableEmitter) {
        observableEmitter.onNext(Boolean.valueOf(EarbudEnableHelper.INSTANCE.enableEarbud(device, hMUnusedDeviceActivityNew.F().createDevice(device, false))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(HMUnusedDeviceActivityNew hMUnusedDeviceActivityNew, boolean z) {
        if (!z) {
            LoadingDialog loadingDialog = hMUnusedDeviceActivityNew.mLoadingDlg;
            if (loadingDialog == null) {
                return;
            }
            loadingDialog.setFailed(hMUnusedDeviceActivityNew.getString(R.string.start_device_failed));
            return;
        }
        LoadingDialog loadingDialog2 = hMUnusedDeviceActivityNew.mLoadingDlg;
        if (loadingDialog2 != null) {
            loadingDialog2.dismiss();
        }
        hMUnusedDeviceActivityNew.I().startHmEarbudMusicActivity(hMUnusedDeviceActivityNew);
        hMUnusedDeviceActivityNew.finish();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(HMUnusedDeviceActivityNew hMUnusedDeviceActivityNew, Throwable th) {
        HMLog.e("StartEarbud", "启用耳机异常", th);
        LoadingDialog loadingDialog = hMUnusedDeviceActivityNew.mLoadingDlg;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.setFailed(hMUnusedDeviceActivityNew.getString(R.string.start_device_failed));
    }

    private final BindServiceApi D() {
        return (BindServiceApi) this.bindServiceApi.getValue();
    }

    private final String E() {
        Device device = this.mDevice;
        if (device == null) {
            return null;
        }
        Integer device_type = device.getDevice_type();
        int value = HMDeviceType.EARBUD.getValue();
        if (device_type == null || device_type.intValue() != value) {
            return device.getDevice_address();
        }
        String device_address = device.getDevice_address();
        return getString(R.string.earbud_mac_detail, new Object[]{device_address, device_address.substring(0, device_address.length() - 2) + "02"});
    }

    private final DeviceConnectManger F() {
        return (DeviceConnectManger) this.deviceConnectManger.getValue();
    }

    private final DeviceManagerApi G() {
        return (DeviceManagerApi) this.deviceManagerApi.getValue();
    }

    private final DeviceUtilsApi H() {
        return (DeviceUtilsApi) this.deviceUtilsApi.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceXNavigator I() {
        return (DeviceXNavigator) this.deviceXNavigator.getValue();
    }

    private final DialFetchApi J() {
        return (DialFetchApi) this.unusedDialImpl.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(HMUnusedDeviceActivityNew hMUnusedDeviceActivityNew, View view) {
        hMUnusedDeviceActivityNew.O();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void L(HMUnusedDeviceActivityNew hMUnusedDeviceActivityNew, View view) {
        if (!NetUtil.isNetworkConnected(hMUnusedDeviceActivityNew)) {
            IconToast.showError(hMUnusedDeviceActivityNew, hMUnusedDeviceActivityNew.getString(R.string.no_network_connection));
        } else if (GattUtils.isBluetoothEnable()) {
            hMUnusedDeviceActivityNew.Z();
        } else {
            IconToast.showError(hMUnusedDeviceActivityNew, hMUnusedDeviceActivityNew.getString(R.string.ble_not_open));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(final HMUnusedDeviceActivityNew hMUnusedDeviceActivityNew, View view) {
        AlertDialogFragment alertDialogFragmentNewInstance = EditDeviceDisplayNameDialog.newInstance(hMUnusedDeviceActivityNew.mDevice, hMUnusedDeviceActivityNew.getBaseContext(), new EditDeviceDisplayNameDialog.IDisplayNameListener() { // from class: tn3
            @Override // com.xiaomi.hm.health.device.view.EditDeviceDisplayNameDialog.IDisplayNameListener
            public final void onDisplayNameChanged(String str) {
                HMUnusedDeviceActivityNew.N(this.a, str);
            }
        });
        if (alertDialogFragmentNewInstance == null) {
            return;
        }
        alertDialogFragmentNewInstance.show(hMUnusedDeviceActivityNew.getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N(HMUnusedDeviceActivityNew hMUnusedDeviceActivityNew, String str) {
        if (str == null || kotlin.text.m.isBlank(str)) {
            hMUnusedDeviceActivityNew.getSubTitleTextView().setVisibility(8);
        } else {
            hMUnusedDeviceActivityNew.getSubTitleTextView().setVisibility(0);
            hMUnusedDeviceActivityNew.X(hMUnusedDeviceActivityNew.getSubTitleTextView(), str);
        }
    }

    private final void O() {
        String string;
        if (!NetUtil.isNetworkConnected(this)) {
            IconToast.showError(this, getString(R.string.no_network));
            return;
        }
        String[] stringArray = getResources().getStringArray(R.array.unbind_device_description);
        Device device = this.mDevice;
        if (device == null) {
            return;
        }
        HMDeviceType hMDeviceTypeFromValue = HMDeviceType.fromValue(device.getDevice_type().intValue());
        switch (hMDeviceTypeFromValue == null ? -1 : WhenMappings.$EnumSwitchMapping$0[hMDeviceTypeFromValue.ordinal()]) {
            case 1:
                string = !HMDeviceConfig.isWatch(HMDeviceSource.fromValue(device.getDevice_source().intValue())) ? stringArray[0] : stringArray[3];
                break;
            case 2:
                string = !HMDeviceConfig.isBfs(HMDeviceSource.fromValue(device.getDevice_source().intValue())) ? stringArray[1] : getResources().getString(R.string.weight_bfs);
                break;
            case 3:
                string = stringArray[2];
                break;
            case 4:
                string = stringArray[4];
                break;
            case 5:
                string = stringArray[3];
                break;
            case 6:
                string = getString(R.string.earbud_chopin);
                break;
            case 7:
                string = getString(R.string.other_bolt_offical);
                break;
            default:
                string = "";
                break;
        }
        new AlertDialogFragment.Builder(this).setMessage(getString(R.string.device_unbind_confirm, new Object[]{string})).setPositiveButton(R.string.device_unbind, new DialogInterface.OnClickListener() { // from class: mn3
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                HMUnusedDeviceActivityNew.P(this.a, dialogInterface, i);
            }
        }).setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null).show(getSupportFragmentManager());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P(HMUnusedDeviceActivityNew hMUnusedDeviceActivityNew, DialogInterface dialogInterface, int i) {
        HMUnbindBaseLogic.unbind(hMUnusedDeviceActivityNew.mDevice, hMUnusedDeviceActivityNew);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Q(HMUnusedDeviceActivityNew hMUnusedDeviceActivityNew) {
        LoadingDialog loadingDialog = hMUnusedDeviceActivityNew.mLoadingDlg;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.setFailed(hMUnusedDeviceActivityNew.getString(R.string.device_unbind_failed));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(HMUnusedDeviceActivityNew hMUnusedDeviceActivityNew) {
        LoadingDialog loadingDialog = hMUnusedDeviceActivityNew.mLoadingDlg;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
        }
        hMUnusedDeviceActivityNew.mLoadingDlg = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(HMUnusedDeviceActivityNew hMUnusedDeviceActivityNew) {
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(hMUnusedDeviceActivityNew, hMUnusedDeviceActivityNew.getString(R.string.device_unbinding));
        loadingDialogShowDialog.setCancelable(false);
        Unit unit = Unit.INSTANCE;
        hMUnusedDeviceActivityNew.mLoadingDlg = loadingDialogShowDialog;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(HMUnusedDeviceActivityNew hMUnusedDeviceActivityNew) {
        LoadingDialog loadingDialog = hMUnusedDeviceActivityNew.mLoadingDlg;
        if (loadingDialog == null) {
            return;
        }
        loadingDialog.setSuccess(hMUnusedDeviceActivityNew.getString(R.string.device_unbind_success));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(HMUnusedDeviceActivityNew hMUnusedDeviceActivityNew) {
        LoadingDialog loadingDialog = hMUnusedDeviceActivityNew.mLoadingDlg;
        if (loadingDialog != null) {
            loadingDialog.dismiss();
        }
        hMUnusedDeviceActivityNew.mLoadingDlg = null;
        hMUnusedDeviceActivityNew.finish();
    }

    private final void V(Runnable runnable, long delay) {
        ListTile listTile = (ListTile) findViewById(R.id.mac_address);
        if (listTile == null) {
            return;
        }
        listTile.postDelayed(runnable, delay);
    }

    public static /* synthetic */ void W(HMUnusedDeviceActivityNew hMUnusedDeviceActivityNew, Runnable runnable, long j, int i, Object obj) {
        if ((i & 2) != 0) {
            j = 0;
        }
        hMUnusedDeviceActivityNew.V(runnable, j);
    }

    private final void X(TextView subTitleTv, String subTitle) {
        if (TextUtils.isEmpty(subTitle)) {
            subTitleTv.setVisibility(8);
        } else {
            subTitleTv.setVisibility(0);
            subTitleTv.setText(subTitle);
        }
    }

    private final void Y() {
        DialFetchApi dialFetchApiJ = J();
        UnusedDialImpl unusedDialImpl = dialFetchApiJ instanceof UnusedDialImpl ? (UnusedDialImpl) dialFetchApiJ : null;
        if (unusedDialImpl != null) {
            Device device = this.mDevice;
            unusedDialImpl.setSn(device != null ? device.getSn() : null);
        }
        DialFetchApi dialFetchApiJ2 = J();
        HMDeviceSource hMDeviceSource = this.mSource;
        int i = R.id.iv_skin;
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(i);
        int i2 = R.id.iv_dial;
        AppCompatImageView appCompatImageView2 = (AppCompatImageView) findViewById(i2);
        int i3 = R.id.iv_device_transparent;
        if (dialFetchApiJ2.showCache(hMDeviceSource, appCompatImageView, appCompatImageView2, (AppCompatImageView) findViewById(i3))) {
            ((AppCompatImageView) findViewById(R.id.iv_default_device)).setVisibility(8);
            ((AppCompatImageView) findViewById(R.id.iv_device_shadow)).setVisibility(0);
            ((AppCompatImageView) findViewById(i)).setVisibility(0);
            ((AppCompatImageView) findViewById(i2)).setVisibility(0);
            return;
        }
        ((AppCompatImageView) findViewById(R.id.iv_default_device)).setVisibility(0);
        ((AppCompatImageView) findViewById(R.id.iv_device_shadow)).setVisibility(8);
        ((AppCompatImageView) findViewById(i)).setVisibility(8);
        ((AppCompatImageView) findViewById(i2)).setVisibility(8);
        ((AppCompatImageView) findViewById(i3)).setVisibility(8);
    }

    private final void Z() {
        HMFwUpgradeManager.addIgnoreActivity(HMUnusedDeviceActivityNew.class);
        Device device = this.mDevice;
        if (device == null) {
            return;
        }
        HMDeviceType hMDeviceTypeFromValue = HMDeviceType.fromValue(device.getDevice_type().intValue());
        if (hMDeviceTypeFromValue == HMDeviceType.TREADMILL) {
            LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.device_using));
            loadingDialogShowDialog.setCancelable(false);
            Unit unit = Unit.INSTANCE;
            this.mLoadingDlg = loadingDialogShowDialog;
            new TreadmillStartTask(null, G().getConflictDevice(this.mSource), device, new TreadmillStartListener() { // from class: com.xiaomi.hm.health.device.setting.ui.HMUnusedDeviceActivityNew$useDevice$1$task$1
                @Override // com.xiaomi.hm.health.device.bolt.TreadmillStartListener
                public void onFinish(boolean result) {
                    if (!result) {
                        LoadingDialog loadingDialog = this.a.mLoadingDlg;
                        if (loadingDialog == null) {
                            return;
                        }
                        loadingDialog.setFailed(this.a.getString(R.string.start_device_failed));
                        return;
                    }
                    LoadingDialog loadingDialog2 = this.a.mLoadingDlg;
                    if (loadingDialog2 != null) {
                        loadingDialog2.dismiss();
                    }
                    this.a.I().startHMTreadmillSettingActivity(this.a);
                    this.a.finish();
                }
            }).execute(new Void[0]);
            return;
        }
        if (hMDeviceTypeFromValue == HMDeviceType.WEIGHT || hMDeviceTypeFromValue == HMDeviceType.WATCH) {
            D().startUseDevice(this, this.mDevice, null, false);
        } else if (hMDeviceTypeFromValue == HMDeviceType.EARBUD) {
            z();
        } else {
            y();
        }
    }

    private final void initViews() {
        String firmware_version;
        Device device = this.mDevice;
        String displayName = device == null ? null : device.getDisplayName();
        if (displayName == null || kotlin.text.m.isBlank(displayName)) {
            getSubTitleTextView().setVisibility(8);
        } else {
            X(getSubTitleTextView(), displayName);
        }
        Device device2 = this.mDevice;
        if (device2 != null) {
            setTitleText((GlobalConfig.get().isBuildMidong() && G().isUseWearCompanionName(device2)) ? H().getHuamiDeviceDescription(device2) : H().getDeviceDescription(this.mSource, HMBrandType.fromValue(device2.getBrandType().intValue())));
        }
        getTitleTextView().setFocusableInTouchMode(true);
        getTitleTextView().setEllipsize(TextUtils.TruncateAt.MARQUEE);
        getTitleTextView().setMarqueeRepeatLimit(1);
        Y();
        ((ListTile) findViewById(R.id.mac_address)).setTips(E());
        Device device3 = this.mDevice;
        if (device3 != null && (firmware_version = device3.getFirmware_version()) != null) {
            ((ListTile) findViewById(R.id.firmware_version)).setTips(firmware_version);
        }
        ((AppCompatButton) findViewById(R.id.unused_unbind_tv)).setOnClickListener(new View.OnClickListener() { // from class: sn3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMUnusedDeviceActivityNew.K(this.a, view);
            }
        });
        ((AppCompatButton) findViewById(R.id.use_device)).setOnClickListener(new View.OnClickListener() { // from class: qn3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMUnusedDeviceActivityNew.L(this.a, view);
            }
        });
        getRightImage().setOnClickListener(new View.OnClickListener() { // from class: rn3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HMUnusedDeviceActivityNew.M(this.a, view);
            }
        });
    }

    private final void y() {
        new HMUnusedDeviceActivity.MyConnectTask(this, this.mDevice, F()).execute(new Void[0]);
    }

    private final void z() {
        if (!NetUtil.isNetworkConnected(this)) {
            IconToast.showError(this, getString(R.string.no_network));
            return;
        }
        final Device device = this.mDevice;
        if (device == null) {
            return;
        }
        LoadingDialog loadingDialogShowDialog = LoadingDialog.showDialog(this, getString(R.string.earbud_start_device));
        loadingDialogShowDialog.setCancelable(false);
        Unit unit = Unit.INSTANCE;
        this.mLoadingDlg = loadingDialogShowDialog;
        Rx.io(new ObservableOnSubscribe() { // from class: un3
            @Override // io.reactivex.ObservableOnSubscribe
            public final void subscribe(ObservableEmitter observableEmitter) {
                HMUnusedDeviceActivityNew.A(this.a, device, observableEmitter);
            }
        }).subscribe(new Consumer() { // from class: vn3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                HMUnusedDeviceActivityNew.B(this.a, ((Boolean) obj).booleanValue());
            }
        }, new Consumer() { // from class: wn3
            @Override // io.reactivex.functions.Consumer
            public final void accept(Object obj) {
                HMUnusedDeviceActivityNew.C(this.a, (Throwable) obj);
            }
        });
    }

    public void _$_clearFindViewByIdCache() {
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1024 && resultCode == -1) {
            finish();
        }
    }

    @Override // com.huami.view.basetitle.BaseTitleActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        setTheme(R.style.Theme_App_Zepp);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unused_device_new);
        DarkModeUtilKt.setDeviceSettingUnifyTitleStyle(this, "", null, R.color.s10);
        Serializable serializableExtra = getIntent().getSerializableExtra("db_device");
        Device device = serializableExtra instanceof Device ? (Device) serializableExtra : null;
        this.mDevice = device;
        this.mSource = HMDeviceSource.fromValue(device.getDevice_source().intValue());
        updateTitleLayout();
        initViews();
    }

    @Override // com.xiaomi.hm.health.device.bind.IUnbindListener
    public void onUnbindFailure(@Nullable UnbindError error, @Nullable HMDeviceType type) {
        W(this, new Runnable() { // from class: yn3
            @Override // java.lang.Runnable
            public final void run() {
                HMUnusedDeviceActivityNew.Q(this.a);
            }
        }, 0L, 2, null);
        V(new Runnable() { // from class: pn3
            @Override // java.lang.Runnable
            public final void run() {
                HMUnusedDeviceActivityNew.R(this.a);
            }
        }, 1500L);
    }

    @Override // com.xiaomi.hm.health.device.bind.IUnbindListener
    public void onUnbindStart(@Nullable HMDeviceType type) {
        W(this, new Runnable() { // from class: xn3
            @Override // java.lang.Runnable
            public final void run() {
                HMUnusedDeviceActivityNew.S(this.a);
            }
        }, 0L, 2, null);
    }

    @Override // com.xiaomi.hm.health.device.bind.IUnbindListener
    public void onUnbindSuccess(@Nullable HMDeviceType type) {
        W(this, new Runnable() { // from class: nn3
            @Override // java.lang.Runnable
            public final void run() {
                HMUnusedDeviceActivityNew.T(this.a);
            }
        }, 0L, 2, null);
        V(new Runnable() { // from class: on3
            @Override // java.lang.Runnable
            public final void run() {
                HMUnusedDeviceActivityNew.U(this.a);
            }
        }, 1500L);
    }
}
