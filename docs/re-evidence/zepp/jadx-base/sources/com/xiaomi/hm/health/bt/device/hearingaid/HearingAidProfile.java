package com.xiaomi.hm.health.bt.device.hearingaid;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.content.Context;
import android.os.Build;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.Success;
import com.huami.bluetooth.profile.channel.module.connect.ConnectModule;
import com.huami.bluetooth.profile.channel.module.connect.ConnectParam;
import com.huami.bluetooth.profile.channel.module.settings.EcfCmdProvider;
import com.huami.bluetooth.profile.characteristic.HMBleBluetoothCharacteristic;
import com.huami.bluetooth.profile.characteristic.HMGattCharacteristic;
import com.huami.bluetooth.profile.ecf.EcfController;
import com.huami.bluetooth.profile.ecf.EcfControllerImpl;
import com.huami.tools.analytics.DbUtils;
import com.huami.tools.log.HMLog;
import com.tekartik.sqflite.Constant;
import com.xiaomi.hm.health.bt.HMBleConfig;
import com.xiaomi.hm.health.bt.device.hearingaid.HearingAidProfile;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.base.IBaseProfile;
import com.xiaomi.hm.health.bt.profile.generic.HMGenericCommand;
import com.xiaomi.hm.health.bt.profile.generic.HMGenericProfile;
import com.xiaomi.hm.health.bt.profile.generic.HMGenericResponse;
import com.xmlywind.sdk.common.mta.PointCategory;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 62\u00020\u00012\u00020\u0002:\u000267B\u001f\u0012\u0006\u0010/\u001a\u00020.\u0012\u0006\u00101\u001a\u000200\u0012\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0002J\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0002J$\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0014J\b\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016J\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u0003H\u0016J\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0016J\u001a\u0010\u0018\u001a\u00020\u00102\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0017\u001a\u00020\u0003H\u0016J\u0014\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0016R\u0016\u0010 \u001a\u00020\u001d8\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010#\u001a\u00020\u00058\u0002@\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010'\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u0018\u0010*\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010-\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,¨\u00068"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/hearingaid/HearingAidProfile;", "Lcom/xiaomi/hm/health/bt/profile/base/BaseProfile;", "Lcom/huami/bluetooth/profile/channel/module/settings/EcfCmdProvider;", "", "q0", "", "r0", "Lcom/huami/bluetooth/profile/Request$Command;", Constant.h, "", "data", "Lcom/xiaomi/hm/health/bt/profile/base/HMNotifyResponse;", "u0", "cmdLen", "timeout", "s0", "", "initCharacteristics", "Lcom/xiaomi/hm/health/bt/profile/base/DeviceInfo;", "getDeviceInfo", "sendECFCommand", "Lcom/huami/bluetooth/profile/ecf/EcfController;", "getEcfController", "profileType", "patchWriteEcf", "Lcom/xiaomi/hm/health/bt/profile/generic/HMGenericCommand;", "command", "Lcom/xiaomi/hm/health/bt/profile/generic/HMGenericResponse;", "sendGenericCommand", "", "W", "Ljava/lang/String;", "tag", "X", "B", "ECF_COMMAND_GET_MTU_SIZE", "Landroid/bluetooth/BluetoothGattCharacteristic;", "Y", "Landroid/bluetooth/BluetoothGattCharacteristic;", "m_CharControlPoint", "Z", "[B", "mEcfData", "m0", "Lcom/huami/bluetooth/profile/ecf/EcfController;", "ecfController", "Landroid/content/Context;", DbUtils.Const.Table.CONTEXT, "Landroid/bluetooth/BluetoothDevice;", "device", "Lcom/xiaomi/hm/health/bt/gatt/IGattCallback$IConnectionStateChangeCallback;", "callback", "<init>", "(Landroid/content/Context;Landroid/bluetooth/BluetoothDevice;Lcom/xiaomi/hm/health/bt/gatt/IGattCallback$IConnectionStateChangeCallback;)V", "Companion", "a", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class HearingAidProfile extends BaseProfile implements EcfCmdProvider {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static final UUID n0 = GattUtils.uuid128(1);
    private static final UUID o0 = GattUtils.uuid128(2);
    private static final UUID p0 = GattUtils.uuid128(3);
    private static final UUID q0 = GattUtils.uuid128(4);
    private static final UUID r0 = GattUtils.uuid128(5);
    private static final UUID s0 = GattUtils.uuid128(6);
    private static final UUID t0 = GattUtils.uuid128(7);

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    @NotNull
    private final String tag;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private final byte ECF_COMMAND_GET_MTU_SIZE;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    @Nullable
    private BluetoothGattCharacteristic m_CharControlPoint;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    @Nullable
    private byte[] mEcfData;

    /* JADX INFO: renamed from: m0, reason: from kotlin metadata */
    @Nullable
    private EcfController ecfController;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015R!\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R!\u0010\b\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007R!\u0010\n\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0005\u001a\u0004\b\u000b\u0010\u0007R!\u0010\f\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u0005\u001a\u0004\b\r\u0010\u0007R!\u0010\u000e\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0005\u001a\u0004\b\u000f\u0010\u0007R!\u0010\u0010\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0005\u001a\u0004\b\u0011\u0010\u0007R!\u0010\u0012\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0005\u001a\u0004\b\u0013\u0010\u0007¨\u0006\u0016"}, d2 = {"Lcom/xiaomi/hm/health/bt/device/hearingaid/HearingAidProfile$Companion;", "", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "UUID_CHARACTERISTIC_SENSOR_DATA_CONTROL_POINT", "Ljava/util/UUID;", "getUUID_CHARACTERISTIC_SENSOR_DATA_CONTROL_POINT", "()Ljava/util/UUID;", "UUID_CHARACTERISTIC_SENSOR_DATA", "getUUID_CHARACTERISTIC_SENSOR_DATA", "UUID_CHARACTERISTIC_CONTROL_POINT", "getUUID_CHARACTERISTIC_CONTROL_POINT", "UUID_CHARACTERISTIC_ACTIVITY_DATA_CONTROL_POINT", "getUUID_CHARACTERISTIC_ACTIVITY_DATA_CONTROL_POINT", "UUID_CHARACTERISTIC_ACTIVITY_DATA", "getUUID_CHARACTERISTIC_ACTIVITY_DATA", "UUID_CHARACTERISTIC_BATTERY", "getUUID_CHARACTERISTIC_BATTERY", "UUID_CHARACTERISTIC_REALTIME_STEPS", "getUUID_CHARACTERISTIC_REALTIME_STEPS", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final UUID getUUID_CHARACTERISTIC_ACTIVITY_DATA() {
            return HearingAidProfile.r0;
        }

        public final UUID getUUID_CHARACTERISTIC_ACTIVITY_DATA_CONTROL_POINT() {
            return HearingAidProfile.q0;
        }

        public final UUID getUUID_CHARACTERISTIC_BATTERY() {
            return HearingAidProfile.s0;
        }

        public final UUID getUUID_CHARACTERISTIC_CONTROL_POINT() {
            return HearingAidProfile.p0;
        }

        public final UUID getUUID_CHARACTERISTIC_REALTIME_STEPS() {
            return HearingAidProfile.t0;
        }

        public final UUID getUUID_CHARACTERISTIC_SENSOR_DATA() {
            return HearingAidProfile.o0;
        }

        public final UUID getUUID_CHARACTERISTIC_SENSOR_DATA_CONTROL_POINT() {
            return HearingAidProfile.n0;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0002\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0005¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016R\u001e\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u00058\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068V@\u0016X\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"com/xiaomi/hm/health/bt/device/hearingaid/HearingAidProfile$a", "Lcom/huami/bluetooth/profile/characteristic/HMGattCharacteristic;", "", PointCategory.INIT, "deInit", "Lkotlin/Function0;", "Landroid/bluetooth/BluetoothGattCharacteristic;", "a", "Lkotlin/jvm/functions/Function0;", "fun", "getCharacteristic", "()Landroid/bluetooth/BluetoothGattCharacteristic;", "characteristic", "<init>", "(Lkotlin/jvm/functions/Function0;)V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class a implements HMGattCharacteristic {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        @NotNull
        private final Function0<BluetoothGattCharacteristic> fun;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull Function0<? extends BluetoothGattCharacteristic> function0) {
            this.fun = function0;
        }

        @Override // com.huami.bluetooth.profile.characteristic.HMGattCharacteristic
        public boolean deInit() {
            return true;
        }

        @Override // com.huami.bluetooth.profile.characteristic.HMGattCharacteristic
        @Nullable
        /* JADX INFO: renamed from: getCharacteristic */
        public BluetoothGattCharacteristic get_characteristic() {
            return this.fun.getA();
        }

        @Override // com.huami.bluetooth.profile.characteristic.HMGattCharacteristic
        public boolean init() {
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<String> {
        public final /* synthetic */ int a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(0);
            this.a = i;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("ATT MTU size:", Integer.valueOf(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0018\u0002\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"Landroid/bluetooth/BluetoothGattCharacteristic;", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class c extends Lambda implements Function0<BluetoothGattCharacteristic> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final BluetoothGattCharacteristic getA() {
            return HearingAidProfile.this.m_CharControlPoint;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class d extends Lambda implements Function0<String> {
        public static final d a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "Connect channel module is null";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class e extends Lambda implements Function0<String> {
        public final /* synthetic */ ModuleResult<ConnectParam> a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ModuleResult<ConnectParam> moduleResult) {
            super(0);
            this.a = moduleResult;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("Query connect param failed:", this.a);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class f extends Lambda implements Function0<String> {
        public static final f a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return HearingAidProfile.INSTANCE.getUUID_CHARACTERISTIC_CONTROL_POINT() + " is null!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class g extends Lambda implements Function0<String> {
        public final /* synthetic */ byte[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(byte[] bArr) {
            super(0);
            this.a = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("ecf cmd: ", GattUtils.bytesToHexString(this.a));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class h extends Lambda implements Function0<String> {
        public static final h a = new h();

        public h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return "ecf cmd failed!";
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000e\n\u0000\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class i extends Lambda implements Function0<String> {
        public final /* synthetic */ byte[] a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(byte[] bArr) {
            super(0);
            this.a = bArr;
        }

        @Override // kotlin.jvm.functions.Function0
        @Nullable
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final String getA() {
            return Intrinsics.stringPlus("ecf notify:", GattUtils.bytesToHexString(this.a));
        }
    }

    public HearingAidProfile(@NotNull Context context, @NotNull BluetoothDevice bluetoothDevice, @NotNull IGattCallback.IConnectionStateChangeCallback iConnectionStateChangeCallback) {
        super(context, bluetoothDevice, iConnectionStateChangeCallback);
        this.tag = "HearingAidProfile";
        this.ECF_COMMAND_GET_MTU_SIZE = (byte) 19;
    }

    private final int q0() {
        if (!supportModule(ConnectModule.class)) {
            return r0();
        }
        ConnectModule connectModule = (ConnectModule) getChannelModule(ConnectModule.class);
        if (connectModule == null) {
            HMLog.info(this.tag, d.a);
            return -1;
        }
        ModuleResult<ConnectParam> moduleResultQueryConnectParam = connectModule.queryConnectParam();
        if (moduleResultQueryConnectParam instanceof Success) {
            return ((ConnectParam) ((Success) moduleResultQueryConnectParam).getData()).getMtu();
        }
        HMLog.info(this.tag, new e(moduleResultQueryConnectParam));
        return -1;
    }

    private final byte r0() {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{this.ECF_COMMAND_GET_MTU_SIZE});
        if (hMNotifyResponseSendECFCommand == null) {
            return (byte) -1;
        }
        if (!hMNotifyResponseSendECFCommand.isSuccess(this.ECF_COMMAND_GET_MTU_SIZE)) {
            hMNotifyResponseSendECFCommand = null;
        }
        if (hMNotifyResponseSendECFCommand == null) {
            return (byte) -1;
        }
        byte[] data = hMNotifyResponseSendECFCommand.getData();
        HMNotifyResponse hMNotifyResponse = data != null && data.length == 2 ? hMNotifyResponseSendECFCommand : null;
        if (hMNotifyResponse == null) {
            return (byte) -1;
        }
        return (byte) (((byte) (((long) ((byte) (hMNotifyResponse.getData()[1] & (-1)))) << 8)) | ((byte) (hMNotifyResponse.getData()[0] & (-1))));
    }

    private final HMNotifyResponse s0(byte[] cmd, int cmdLen, int timeout) {
        synchronized (EcfController.INSTANCE.getEcfLock()) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.m_CharControlPoint;
            if (bluetoothGattCharacteristic == null) {
                return null;
            }
            if (!registerNotification(bluetoothGattCharacteristic, new IGattCallback.INotifyCallback() { // from class: ay3
                @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
                public final void notify(byte[] bArr) {
                    HearingAidProfile.t0(this.a, bArr);
                }
            })) {
                return null;
            }
            this.mEcfData = null;
            HMLog.info(BaseProfile.TAG, new g(cmd));
            if (!write(this.m_CharControlPoint, cmd)) {
                HMLog.info(BaseProfile.TAG, h.a);
                return null;
            }
            if (this.mEcfData == null) {
                waiting(this.m_CharControlPoint, timeout);
            }
            unregisterNotification(this.m_CharControlPoint);
            return HMNotifyResponse.parse(this.mEcfData, cmdLen);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void t0(HearingAidProfile hearingAidProfile, byte[] bArr) {
        HMLog.info(BaseProfile.TAG, new i(bArr));
        hearingAidProfile.mEcfData = bArr;
        hearingAidProfile.watingNotify(hearingAidProfile.m_CharControlPoint);
    }

    private final HMNotifyResponse u0(Request.Command cmd, byte[] data) {
        Request request = new Request(cmd, data);
        return sendECFCommand(request.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String(), request.getCmdLen());
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile
    @NotNull
    public DeviceInfo getDeviceInfo() {
        if (Build.VERSION.SDK_INT >= 24 && HMBleConfig.SUPPORT_UPDATE_MTU) {
            int iQ0 = q0();
            HMLog.info(this.tag, new b(iQ0));
            getMtu().setAttMtuSize(iQ0);
        }
        return super.getDeviceInfo();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.EcfCmdProvider
    @Nullable
    public EcfController getEcfController() {
        if (this.ecfController == null) {
            this.ecfController = new EcfControllerImpl(new HMBleBluetoothCharacteristic(new a(new c()), this));
        }
        return this.ecfController;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile, com.xiaomi.hm.health.bt.gatt.GattPeripheral
    public boolean initCharacteristics() {
        BluetoothGattCharacteristic characteristic = getService(IBaseProfile.UUID_SERVICE_MILI_SERVICE).getCharacteristic(p0);
        this.m_CharControlPoint = characteristic;
        if (characteristic != null) {
            return super.initCharacteristics();
        }
        HMLog.info(BaseProfile.TAG, f.a);
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.EcfCmdProvider
    public boolean patchWriteEcf(@Nullable byte[] data, int profileType) {
        return super.patchWrite(data, profileType);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.EcfCmdProvider
    public boolean sendECFCommand(@NotNull Request.Command cmd, @NotNull byte[] data) {
        HMNotifyResponse hMNotifyResponseU0 = u0(cmd, data);
        if (hMNotifyResponseU0 == null) {
            return false;
        }
        return hMNotifyResponseU0.isSuccess();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.EcfCmdProvider
    @Nullable
    public HMGenericResponse sendGenericCommand(@Nullable HMGenericCommand command) {
        HMGenericResponse hMGenericResponseWrite;
        synchronized (EcfController.INSTANCE.getEcfLock()) {
            hMGenericResponseWrite = HMGenericProfile.write(this, this.m_CharControlPoint, command);
        }
        return hMGenericResponseWrite;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.EcfCmdProvider
    @Nullable
    public HMNotifyResponse sendECFCommand(@Nullable byte[] cmd, int cmdLen) {
        return s0(cmd, cmdLen, 5000);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.EcfCmdProvider
    @Nullable
    public HMNotifyResponse sendECFCommand(@Nullable byte[] cmd) {
        return sendECFCommand(cmd, 1);
    }
}
