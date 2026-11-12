package com.xiaomi.hm.health.bt.device;

import android.bluetooth.BluetoothDevice;
import android.content.Context;
import com.baidu.ocr.sdk.utils.LogUtil;
import com.facebook.appevents.integrity.IntegrityManager;
import com.huami.bluetooth.business.IScaleMeasureApi;
import com.huami.bluetooth.business.ScaleMeasureImp;
import com.huami.bluetooth.business.ScaleMeasureOwner;
import com.huami.bluetooth.profile.channel.module.ScaleSettingModule;
import com.huami.tools.analytics.DbUtils;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.profile.auth.AuthInfo;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.dfu.IHMFirmwareUpgradeCallback;
import com.xiaomi.hm.health.bt.profile.mili.model.UserInfo;
import com.xiaomi.hm.health.bt.profile.weight.AmazfitScaleProfile;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u0017\u0012\u0006\u0010+\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b,\u0010-B\u0019\b\u0016\u0012\u0006\u0010+\u001a\u00020\u0005\u0012\u0006\u0010.\u001a\u00020!¢\u0006\u0004\b,\u0010/J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0018\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0014J\b\u0010\f\u001a\u00020\u000bH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016J\u001c\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016J\u0012\u0010\u0018\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\b\u0010\u0019\u001a\u00020\u000fH\u0014J\u001a\u0010\u001c\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0012\u0010\u001d\u001a\u00020\u000f2\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u001e\u001a\u00020\u000fH\u0014J\b\u0010\u001f\u001a\u00020\u000fH\u0014J\b\u0010 \u001a\u00020\u000fH\u0016J\u0006\u0010\"\u001a\u00020!R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)¨\u00061"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/HMAmazfitScaleDevice;", "Lcom/xiaomi/hm/health/bt/device/HMWeightDevice;", "Lcom/huami/bluetooth/business/ScaleMeasureOwner;", "Lcom/huami/bluetooth/business/IScaleMeasureApi;", "getScaleMeasureApi", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/bluetooth/BluetoothDevice;", "device", "Lcom/xiaomi/hm/health/bt/profile/base/BaseProfile;", "createProfile", "Lcom/xiaomi/hm/health/bt/device/HMDeviceType;", "getDeviceType", "", "forceDirectly", "", "create", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;", "firmwareInfo", "Lcom/xiaomi/hm/health/bt/profile/dfu/IHMFirmwareUpgradeCallback;", "callback", "updateFwUpgrade", "Lcom/xiaomi/hm/health/bt/profile/auth/AuthInfo;", "info", "unbindSync", "onDeviceConnected", "", "status", "onDeviceConnectionFailed", "onDeviceConnecting", "onDeviceDisconnected", "onDeviceConnectTimeout", "destroy", "", "getWifiRevision", "Lcom/huami/bluetooth/business/ScaleMeasureImp;", LogUtil.D, "Lcom/huami/bluetooth/business/ScaleMeasureImp;", "scaleMeasureApi", "Lcom/xiaomi/hm/health/bt/profile/weight/AmazfitScaleProfile;", "E", "Lcom/xiaomi/hm/health/bt/profile/weight/AmazfitScaleProfile;", "mScaleProfile", "ctx", "<init>", "(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;)V", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "(Landroid/content/Context;Ljava/lang/String;)V", "Companion", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HMAmazfitScaleDevice extends HMWeightDevice implements ScaleMeasureOwner {

    @NotNull
    private static final String F = "HMAmazfitScaleDevice";
    private static final int G = 300;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    @NotNull
    private final ScaleMeasureImp scaleMeasureApi;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @Nullable
    private AmazfitScaleProfile mScaleProfile;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<DeviceInfo> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final DeviceInfo invoke() {
            return HMAmazfitScaleDevice.this.getDeviceInfo();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u0002\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Unit> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Unit invoke() {
            invoke2();
            return Unit.INSTANCE;
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2() {
            HMAmazfitScaleDevice.this.reConnect(false);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Lkotlinx/coroutines/CoroutineScope;", "", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    @DebugMetadata(c = "com.xiaomi.hm.health.bt.device.HMAmazfitScaleDevice$unbindSync$1", f = "HMAmazfitScaleDevice.kt", i = {}, l = {79}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        public int a;
        public final /* synthetic */ AuthInfo b;
        public final /* synthetic */ HMAmazfitScaleDevice c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AuthInfo authInfo, HMAmazfitScaleDevice hMAmazfitScaleDevice, Continuation<? super c> continuation) {
            super(2, continuation);
            this.b = authInfo;
            this.c = hMAmazfitScaleDevice;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return new c(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation<? super Boolean> continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            UserInfo userInfo;
            Integer numBoxInt;
            Object coroutine_suspended = kotlin.coroutines.intrinsics.a.getCOROUTINE_SUSPENDED();
            int i = this.a;
            boolean z = false;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AuthInfo authInfo = this.b;
                Long lBoxLong = null;
                if (authInfo != null && (userInfo = authInfo.getUserInfo()) != null && (numBoxInt = Boxing.boxInt(userInfo.uid)) != null) {
                    lBoxLong = Boxing.boxLong(numBoxInt.intValue());
                }
                if (lBoxLong == null) {
                    Debug.fi(HMAmazfitScaleDevice.F, "UserId in null while unbind scale");
                } else {
                    ScaleSettingModule scaleSettingModule = (ScaleSettingModule) this.c.getChannelModule(ScaleSettingModule.class);
                    if (scaleSettingModule != null) {
                        long jLongValue = lBoxLong.longValue();
                        this.a = 1;
                        obj = scaleSettingModule.deleteUserID(jLongValue, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
                return Boxing.boxBoolean(z);
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            if (((Boolean) obj).booleanValue()) {
                z = true;
            }
            return Boxing.boxBoolean(z);
        }
    }

    public HMAmazfitScaleDevice(@NotNull Context context, @NotNull BluetoothDevice bluetoothDevice) {
        super(context, bluetoothDevice);
        ScaleMeasureImp scaleMeasureImp = new ScaleMeasureImp(getMDeviceSource().getValue(), bluetoothDevice.getAddress());
        this.scaleMeasureApi = scaleMeasureImp;
        registerLifeCycleListener(scaleMeasureImp);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMWeightDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void create(boolean forceDirectly) {
        super.create(forceDirectly);
        this.scaleMeasureApi.registerDeviceInfoCallback(new a());
        this.scaleMeasureApi.registerConnectCallback(new b());
        Debug.fi(F, "amazfit scale device created");
    }

    @Override // com.xiaomi.hm.health.bt.device.HMWeightDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    @NotNull
    public BaseProfile createProfile(@NotNull Context context, @NotNull BluetoothDevice device) {
        Debug.fi(F, "create profile");
        AmazfitScaleProfile amazfitScaleProfile = new AmazfitScaleProfile(context, device, this);
        this.mScaleProfile = amazfitScaleProfile;
        return amazfitScaleProfile;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMWeightDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void destroy() {
        super.destroy();
        Debug.fi(F, "amazfit scale device destroy");
    }

    @Override // com.xiaomi.hm.health.bt.device.HMWeightDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    @NotNull
    public HMDeviceType getDeviceType() {
        return HMDeviceType.WEIGHT;
    }

    @Override // com.huami.bluetooth.business.ScaleMeasureOwner
    @NotNull
    public IScaleMeasureApi getScaleMeasureApi() {
        return this.scaleMeasureApi;
    }

    @NotNull
    public final String getWifiRevision() {
        String wifiFirmwareRevision;
        AmazfitScaleProfile amazfitScaleProfile = this.mScaleProfile;
        return (amazfitScaleProfile == null || (wifiFirmwareRevision = amazfitScaleProfile.getWifiFirmwareRevision()) == null) ? "" : wifiFirmwareRevision;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public void onDeviceConnectTimeout() {
        super.onDeviceConnectTimeout();
    }

    @Override // com.xiaomi.hm.health.bt.device.HMWeightDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public void onDeviceConnected() {
        super.onDeviceConnected();
        if (getBaseProfile() != null) {
            this.scaleMeasureApi.setChannel(getBaseProfile());
        }
        Debug.fi(F, "amazfit scale device connected");
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.gatt.IGattCallback.IConnectionStateChangeCallback
    public void onDeviceConnecting(@Nullable BluetoothDevice device) {
        super.onDeviceConnecting(device);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.gatt.IGattCallback.IConnectionStateChangeCallback
    public void onDeviceConnectionFailed(@Nullable BluetoothDevice device, int status) {
        super.onDeviceConnectionFailed(device, status);
    }

    @Override // com.xiaomi.hm.health.bt.device.HMWeightDevice, com.xiaomi.hm.health.bt.device.HMBaseBleDevice
    public void onDeviceDisconnected() {
        super.onDeviceDisconnected();
        Debug.fi(F, "amazfit scale device disconnected");
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseDevice
    public boolean unbindSync(@Nullable AuthInfo info) {
        if (isConnected()) {
            return ((Boolean) kotlinx.coroutines.d.b(null, new c(info, this, null), 1, null)).booleanValue();
        }
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.device.HMBaseBleDevice, com.xiaomi.hm.health.bt.device.HMBaseDevice
    public void updateFwUpgrade(@Nullable HMFirmwareInfo firmwareInfo, @Nullable IHMFirmwareUpgradeCallback callback) {
        if (firmwareInfo != null) {
            firmwareInfo.setSupportSyncSize(true);
        }
        if (firmwareInfo != null) {
            firmwareInfo.setSyncSize(300);
        }
        super.updateFwUpgrade(firmwareInfo, callback);
    }

    public HMAmazfitScaleDevice(@NotNull Context context, @NotNull String str) {
        this(context, GattUtils.getRemoteDevice(str));
    }
}
