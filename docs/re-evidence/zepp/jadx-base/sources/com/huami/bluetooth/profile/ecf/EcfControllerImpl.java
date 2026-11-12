package com.huami.bluetooth.profile.ecf;

import androidx.exifinterface.media.ExifInterface;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.gms.common.GoogleApiAvailabilityLight;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.profile.characteristic.BluetoothCharacteristic;
import com.huami.bluetooth.profile.ecf.data.ActivityGoal;
import com.huami.bluetooth.profile.ecf.data.ActivityGoalKt;
import com.huami.bluetooth.profile.ecf.data.AppState;
import com.huami.bluetooth.profile.ecf.data.Equalizer;
import com.huami.bluetooth.profile.ecf.data.HRZone;
import com.huami.bluetooth.profile.ecf.data.HeadsetKnockSetting;
import com.huami.bluetooth.profile.ecf.data.HeadsetKnockSettingKt;
import com.huami.bluetooth.profile.ecf.data.HeadsetSideListenSetting;
import com.huami.bluetooth.profile.ecf.data.HeadsetSideListenSettingKt;
import com.huami.bluetooth.profile.ecf.data.HeadsetSportSetting;
import com.huami.bluetooth.profile.ecf.data.HeadsetSportSettingKt;
import com.huami.bluetooth.profile.ecf.data.HrReminderInfo;
import com.huami.bluetooth.profile.ecf.data.HrReminderInfoKt;
import com.huami.bluetooth.profile.ecf.data.MultiDeviceState;
import com.huami.bluetooth.profile.ecf.data.MultiDeviceStateKt;
import com.huami.bluetooth.profile.ecf.data.NoiseControl;
import com.huami.bluetooth.profile.ecf.data.NoiseControlKt;
import com.huami.bluetooth.profile.ecf.data.NowTimeConfig;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.chart.style.constant.GoalLineStyleConstant;
import com.huami.passport.Configs;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.model.HMHrReminder;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.base.Mtu;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.milipro.DisplaySetting;
import com.xiaomi.hm.health.bt.utils.ByteArrayKt;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u008a\u00012\u00020\u0001:\u0001\u0012B.\u0012\u0006\u0010~\u001a\u00020|\u0012\r\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u007f\u0012\f\b\u0002\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0082\u0001¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001B\u0013\b\u0016\u0012\u0006\u0010~\u001a\u00020|¢\u0006\u0006\b\u0085\u0001\u0010\u0087\u0001B\"\b\u0016\u0012\u0006\u0010~\u001a\u00020|\u0012\r\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u007f¢\u0006\u0006\b\u0085\u0001\u0010\u0088\u0001B\u001f\b\u0016\u0012\u0006\u0010~\u001a\u00020|\u0012\n\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0082\u0001¢\u0006\u0006\b\u0085\u0001\u0010\u0089\u0001J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J0\u0010\t\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0005*\u00020\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u0007H\u0082\b¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000e\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0002J\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003H\u0002J\u0010\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0011\u001a\u00020\u0010H\u0002J$\u0010\u0019\u001a\u00020\u0015*\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0002J\u0010\u0010\u001c\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0016J\u0010\u0010\u001f\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0016J\n\u0010!\u001a\u0004\u0018\u00010 H\u0016J\u0010\u0010#\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020 H\u0016J\n\u0010%\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010&\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020$H\u0016J\n\u0010(\u001a\u0004\u0018\u00010'H\u0016J\u0010\u0010)\u001a\u00020\u00022\u0006\u0010\"\u001a\u00020'H\u0016J\b\u0010*\u001a\u00020\u0002H\u0016J\n\u0010,\u001a\u0004\u0018\u00010+H\u0016J\n\u0010.\u001a\u0004\u0018\u00010-H\u0016J\n\u0010/\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u00100\u001a\u00020\u0002H\u0016J\u001e\u00105\u001a\u00020\u00022\f\u00103\u001a\b\u0012\u0004\u0012\u000202012\u0006\u00104\u001a\u00020\u0002H\u0016J\u0016\u00107\u001a\u00020\u00022\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001401H\u0016J\u0010\u00109\u001a\u00020\u00022\u0006\u0010\"\u001a\u000208H\u0016J\u0010\u0010<\u001a\u00020\u00022\u0006\u0010;\u001a\u00020:H\u0016J\u0011\u0010=\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b=\u0010>J\u0019\u0010@\u001a\u0004\u0018\u00010\u00022\u0006\u0010?\u001a\u00020\u0002H\u0016¢\u0006\u0004\b@\u0010AJ\u0019\u0010C\u001a\u0004\u0018\u00010\u00022\u0006\u0010B\u001a\u00020\u0015H\u0016¢\u0006\u0004\bC\u0010DJ\u0011\u0010E\u001a\u0004\u0018\u00010\u0015H\u0016¢\u0006\u0004\bE\u0010FJ\u0011\u0010G\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\bG\u0010>J\u0019\u0010H\u001a\u0004\u0018\u00010\u00022\u0006\u0010?\u001a\u00020\u0002H\u0016¢\u0006\u0004\bH\u0010AJ\u0010\u0010I\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u0002H\u0016J\u0018\u0010K\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u00022\u0006\u0010J\u001a\u00020\u0002H\u0016J\u0011\u0010L\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\bL\u0010>J\u0019\u0010M\u001a\u0004\u0018\u00010\u00022\u0006\u0010?\u001a\u00020\u0002H\u0016¢\u0006\u0004\bM\u0010AJ\u0011\u0010N\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\bN\u0010>J\u0010\u0010P\u001a\u00020\u00022\u0006\u0010O\u001a\u00020\u0002H\u0016J\u0010\u0010Q\u001a\u00020\u00022\u0006\u0010O\u001a\u00020\u0002H\u0016J\u0011\u0010R\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\bR\u0010>J\u0010\u0010T\u001a\u00020\u00022\u0006\u0010S\u001a\u00020-H\u0016J\u0010\u0010W\u001a\u00020\u00022\u0006\u0010V\u001a\u00020UH\u0016J\n\u0010X\u001a\u0004\u0018\u00010UH\u0016J\u0010\u0010Y\u001a\u00020\u00022\u0006\u0010O\u001a\u00020\u0002H\u0016J\u0011\u0010Z\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\bZ\u0010>J\u0010\u0010[\u001a\u00020\u00022\u0006\u0010O\u001a\u00020\u0002H\u0016J\u0011\u0010\\\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\\\u0010>J\u0010\u0010]\u001a\u00020\u00022\u0006\u0010O\u001a\u00020\u0002H\u0016J\u0011\u0010^\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b^\u0010>J\u0019\u0010a\u001a\u0004\u0018\u00010\u00022\u0006\u0010`\u001a\u00020_H\u0016¢\u0006\u0004\ba\u0010bJ\u0010\u0010d\u001a\u00020\u00022\u0006\u0010c\u001a\u00020\u0002H\u0016J\u0011\u0010e\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\be\u0010>J\u0010\u0010f\u001a\u00020\u00022\u0006\u0010c\u001a\u00020\u0002H\u0016J\u0011\u0010g\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\bg\u0010>J\u0010\u0010h\u001a\u00020\u00022\u0006\u0010c\u001a\u00020\u0002H\u0016J\u0011\u0010i\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\bi\u0010>J\u0010\u0010j\u001a\u00020\u00022\u0006\u0010c\u001a\u00020\u0002H\u0016J\u0011\u0010k\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\bk\u0010>J\u0010\u0010n\u001a\u00020\u00022\u0006\u0010m\u001a\u00020lH\u0016J\n\u0010o\u001a\u0004\u0018\u00010lH\u0016J\u0010\u0010r\u001a\u00020\u00022\u0006\u0010q\u001a\u00020pH\u0016J\u0010\u0010s\u001a\u00020\u00022\u0006\u0010?\u001a\u00020\u0002H\u0016J\b\u0010t\u001a\u00020\u0002H\u0016J\u0010\u0010u\u001a\u00020\u00022\u0006\u0010c\u001a\u00020\u0002H\u0016J\u0011\u0010w\u001a\u0004\u0018\u00010vH\u0016¢\u0006\u0004\bw\u0010xJ\u0010\u0010y\u001a\u00020\u00022\u0006\u0010c\u001a\u00020\u0002H\u0016J\n\u0010{\u001a\u0004\u0018\u00010zH\u0016R\u0016\u0010~\u001a\u00020|8\u0002@\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010}R\u001e\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u00020\u007f8\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u000e\u0010\u0080\u0001R\u001b\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0012\u0010\u0083\u0001¨\u0006\u008b\u0001"}, d2 = {"Lcom/huami/bluetooth/profile/ecf/EcfControllerImpl;", "Lcom/huami/bluetooth/profile/ecf/EcfController;", "", "", "h", ExifInterface.GPS_DIRECTION_TRUE, "Lcom/xiaomi/hm/health/bt/profile/base/HMNotifyResponse;", "Lkotlin/Function1;", "converter", "i", "(Lcom/xiaomi/hm/health/bt/profile/base/HMNotifyResponse;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lcom/huami/bluetooth/profile/Request$Command;", "command", "data", "b", "e", "Lcom/huami/bluetooth/profile/Request;", "request", "c", "f", "Lcom/xiaomi/hm/health/bt/profile/dfu/HMFirmwareInfo;", "", "len", "", "totalSize", "a", "Lcom/huami/bluetooth/profile/ecf/data/AppState;", "state", "syncAppState", "Lcom/huami/bluetooth/profile/ecf/data/Equalizer;", "equalizer", "setEqualizer", "Lcom/huami/bluetooth/profile/ecf/data/HeadsetKnockSetting;", "getHeadsetKnockSetting", "setting", "setHeadsetKnock", "Lcom/huami/bluetooth/profile/ecf/data/HeadsetSideListenSetting;", "getHeadsetSideListenSetting", "setHeadsetSideListen", "Lcom/huami/bluetooth/profile/ecf/data/HeadsetSportSetting;", "getHeadsetSportSetting", "setHeadsetSport", Configs.Params.RESET, "Lcom/huami/bluetooth/profile/ecf/data/MultiDeviceState;", "getMultiDeviceState", "", "getVersion", "getOffWristLockState", "syncSecondEarStatistic", "", "Lcom/huami/bluetooth/profile/ecf/data/ActivityGoal;", GoalLineStyleConstant.GOALS, "useTwoWayCmd", "setActivityGoal", "firmwares", "setOtaProgress", "Lcom/xiaomi/hm/health/bt/profile/milipro/DisplaySetting;", "setDisplaySettingByTimexVendor", "Lcom/huami/bluetooth/profile/ecf/data/HRZone;", "hrZone", "setHrZone", "readAtrialFibEnable", "()Ljava/lang/Boolean;", "isEnable", "setAtrialFibEnable", "(Z)Ljava/lang/Boolean;", "interval", "setAlldayHeartRate", "(I)Ljava/lang/Boolean;", "getAlldayHeartRate", "()Ljava/lang/Integer;", "getRemEnable", "setRemEnable", "setHrSleepEnable", "isNewHealthDetect", "setOsaEnable", "getOsaEnable", "setPressEnable", "getPressEnable", "isOpen", "setReportHeadsetInfoSwitch", "setRelaxationPrompt", "getRelaxationPrompt", "deviceName", "modifyDeviceName", "Lcom/huami/bluetooth/profile/ecf/data/NoiseControl;", SessionDescription.n, "setNoiseControl", "getNoiseControl", "setEnvironmentSound", "getEnvironmentSound", "setRunningRecognition", "getRunningRecognition", "setVoiceControl", "getVoiceControl", "Lcom/huami/bluetooth/profile/ecf/data/NowTimeConfig;", "config", "setNowTimeConfig", "(Lcom/huami/bluetooth/profile/ecf/data/NowTimeConfig;)Ljava/lang/Boolean;", "enable", "setWearInduction", "getWearInduction", "setHearingHealth", "getHearingHealth", "setCervicalProtection", "getCervicalProtection", "setPercussionBroadcast", "getPercussionBroadcast", "Lcom/huami/bluetooth/profile/ecf/data/HrReminderInfo;", "hrReminderInfo", "setHrReminder", "getHrReminder", "Lcom/xiaomi/hm/health/bt/model/HMHrReminder;", "hrReminder", "setMiliHrReminder", "setSportHrEnable", "doRoleSwitch", "doPostureCalibration", "", "getHeadNeckAngle", "()Ljava/lang/Short;", "enableCervicalProtectionSound", "Lcom/xiaomi/hm/health/bt/profile/base/Mtu;", "getMtu", "Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;", "Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;", "characteristic", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "supportHeadsetKnockNew", "Lcom/huami/bluetooth/profile/ecf/ECFInterceptor;", "Lcom/huami/bluetooth/profile/ecf/ECFInterceptor;", "ecfInterceptor", "<init>", "(Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;Lkotlin/jvm/functions/Function0;Lcom/huami/bluetooth/profile/ecf/ECFInterceptor;)V", "(Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;)V", "(Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;Lkotlin/jvm/functions/Function0;)V", "(Lcom/huami/bluetooth/profile/characteristic/BluetoothCharacteristic;Lcom/huami/bluetooth/profile/ecf/ECFInterceptor;)V", GoogleApiAvailabilityLight.a, "bluetooth_release"}, k = 1, mv = {1, 5, 1})
public final class EcfControllerImpl implements EcfController {

    @Deprecated
    @NotNull
    public static final String TAG = "EcfControllerImpl";

    @NotNull
    private static final c d = new c(null);

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final BluetoothCharacteristic characteristic;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final Function0<Boolean> supportHeadsetKnockNew;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private final ECFInterceptor ecfInterceptor;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends Lambda implements Function0<Boolean> {
        public static final a a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0006\n\u0002\u0010\u000b\n\u0000\u0010\u0001\u001a\u00020\u0000H\n"}, d2 = {"", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class b extends Lambda implements Function0<Boolean> {
        public static final b a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Boolean invoke() {
            return Boolean.valueOf(invoke2());
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final boolean invoke2() {
            return false;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"com/huami/bluetooth/profile/ecf/EcfControllerImpl$c", "", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "bluetooth_release"}, k = 1, mv = {1, 5, 1})
    public static final class c {
        private c() {
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public EcfControllerImpl(@NotNull BluetoothCharacteristic bluetoothCharacteristic, @NotNull Function0<Boolean> function0, @Nullable ECFInterceptor eCFInterceptor) {
        this.characteristic = bluetoothCharacteristic;
        this.supportHeadsetKnockNew = function0;
        this.ecfInterceptor = eCFInterceptor;
    }

    private final int a(HMFirmwareInfo hMFirmwareInfo, int i, int i2, long j) {
        if (i2 == i - 1) {
            return 100;
        }
        int fileSize = j == 0 ? 0 : (int) ((hMFirmwareInfo.getFileSize() * ((long) 100)) / j);
        if (fileSize == 0) {
            return 1;
        }
        return fileSize;
    }

    private final boolean b(Request.Command command, byte[] data) {
        return c(new Request(command, data));
    }

    private final boolean c(Request request) {
        HMNotifyResponse hMNotifyResponseF = f(request);
        if (hMNotifyResponseF == null) {
            return false;
        }
        return hMNotifyResponseF.isSuccess();
    }

    public static /* synthetic */ boolean d(EcfControllerImpl ecfControllerImpl, Request.Command command, byte[] bArr, int i, Object obj) {
        if ((i & 2) != 0) {
            bArr = null;
        }
        return ecfControllerImpl.b(command, bArr);
    }

    private final HMNotifyResponse e(Request.Command command, byte[] data) {
        return f(new Request(command, data));
    }

    private final HMNotifyResponse f(Request request) {
        HMNotifyResponse hMNotifyResponse;
        synchronized (EcfController.INSTANCE.getEcfLock()) {
            ECFInterceptor eCFInterceptor = this.ecfInterceptor;
            if (eCFInterceptor != null && eCFInterceptor.preHandleECF(request.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String())) {
                return this.ecfInterceptor.postHandleECF(request.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String(), request.getCmdLen());
            }
            Debug.fi(TAG, Intrinsics.stringPlus("Send cmd: ", GattUtils.bytesToHexString(request.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String())));
            HMNotifyResponse hMNotifyResponseSendCommandWithResponse = this.characteristic.sendCommandWithResponse(request.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String());
            if (hMNotifyResponseSendCommandWithResponse == null) {
                hMNotifyResponse = null;
            } else {
                Debug.fi(TAG, Intrinsics.stringPlus("Received: ", GattUtils.bytesToHexString(hMNotifyResponseSendCommandWithResponse.getOriginResponseData())));
                hMNotifyResponse = HMNotifyResponse.parse(hMNotifyResponseSendCommandWithResponse.getOriginResponseData(), request.getCmdLen());
            }
            Debug.fi(TAG, Intrinsics.stringPlus("Response: ", hMNotifyResponse));
            return hMNotifyResponse;
        }
    }

    public static /* synthetic */ HMNotifyResponse g(EcfControllerImpl ecfControllerImpl, Request.Command command, byte[] bArr, int i, Object obj) {
        if ((i & 2) != 0) {
            bArr = null;
        }
        return ecfControllerImpl.e(command, bArr);
    }

    private final byte[] h(boolean z) {
        return new byte[]{ByteUtilsKt.toByte(z)};
    }

    private final <T> T i(HMNotifyResponse hMNotifyResponse, Function1<? super byte[], ? extends T> function1) {
        byte[] data;
        if (!hMNotifyResponse.isSuccess() || (data = hMNotifyResponse.getData()) == null) {
            return null;
        }
        if (!(!(data.length == 0))) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        return function1.invoke(data);
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean doPostureCalibration(boolean enable) {
        return b(EcfCommand.PostureCalibration.INSTANCE, h(enable));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean doRoleSwitch() {
        byte[] data;
        Boolean boolValueOf = null;
        HMNotifyResponse hMNotifyResponseG = g(this, EcfCommand.HeadsetRoleSwitch.INSTANCE, null, 2, null);
        if (hMNotifyResponseG == null) {
            return false;
        }
        if (hMNotifyResponseG.isSuccess() && (data = hMNotifyResponseG.getData()) != null) {
            if (!(!(data.length == 0))) {
                data = null;
            }
            if (data != null) {
                boolValueOf = Boolean.valueOf(ByteUtilsKt.toBoolean(data));
            }
        }
        if (boolValueOf == null) {
            return false;
        }
        return boolValueOf.booleanValue();
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean enableCervicalProtectionSound(boolean enable) {
        return b(EcfCommand.CervicalProtectionSoundSwitch.INSTANCE, h(enable));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    @Nullable
    public Integer getAlldayHeartRate() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseG = g(this, new EcfCommand.TwoWay(TwoWayCmd.HrInterval.INSTANCE, true), null, 2, null);
        if (hMNotifyResponseG == null || !hMNotifyResponseG.isSuccess() || (data = hMNotifyResponseG.getData()) == null) {
            return null;
        }
        if (!(true ^ (data.length == 0))) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        return Integer.valueOf(data[0]);
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    @Nullable
    public Boolean getCervicalProtection() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseG = g(this, new EcfCommand.TwoWay(TwoWayCmd.CervicalProtection.INSTANCE, true), null, 2, null);
        if (hMNotifyResponseG == null || !hMNotifyResponseG.isSuccess() || (data = hMNotifyResponseG.getData()) == null) {
            return null;
        }
        if (!(true ^ (data.length == 0))) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        return Boolean.valueOf(ByteUtilsKt.toBoolean(data[0]));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    @Nullable
    public Boolean getEnvironmentSound() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseG = g(this, new EcfCommand.TwoWay(TwoWayCmd.EnvironmentSoundSwitch.INSTANCE, true), null, 2, null);
        if (hMNotifyResponseG == null || !hMNotifyResponseG.isSuccess() || (data = hMNotifyResponseG.getData()) == null) {
            return null;
        }
        if (!(true ^ (data.length == 0))) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        return Boolean.valueOf(ByteUtilsKt.toBoolean(data[0]));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    @Nullable
    public Short getHeadNeckAngle() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseG = g(this, EcfCommand.HeadNeckAngle.INSTANCE, null, 2, null);
        if (hMNotifyResponseG == null || !hMNotifyResponseG.isSuccess() || (data = hMNotifyResponseG.getData()) == null) {
            return null;
        }
        if (!(!(data.length == 0))) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        return Short.valueOf(GattUtils.bytesToSignShort(data, 0));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    @Nullable
    public HeadsetKnockSetting getHeadsetKnockSetting() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseG = g(this, new EcfCommand.TwoWay(TwoWayCmd.HeadsetKnocking.INSTANCE, true), null, 2, null);
        if (hMNotifyResponseG == null || !hMNotifyResponseG.isSuccess() || (data = hMNotifyResponseG.getData()) == null) {
            return null;
        }
        if (!(true ^ (data.length == 0))) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        return HeadsetKnockSettingKt.toHeadsetKnockSetting(data);
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    @Nullable
    public HeadsetSideListenSetting getHeadsetSideListenSetting() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseG = g(this, new EcfCommand.TwoWay(TwoWayCmd.HeadsetSideListen.INSTANCE, true), null, 2, null);
        if (hMNotifyResponseG == null || !hMNotifyResponseG.isSuccess() || (data = hMNotifyResponseG.getData()) == null) {
            return null;
        }
        if (!(true ^ (data.length == 0))) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        return HeadsetSideListenSettingKt.toHeadsetSideListenSetting(data);
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    @Nullable
    public HeadsetSportSetting getHeadsetSportSetting() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseG = g(this, new EcfCommand.TwoWay(TwoWayCmd.HeadsetSport.INSTANCE, true), null, 2, null);
        if (hMNotifyResponseG == null || !hMNotifyResponseG.isSuccess() || (data = hMNotifyResponseG.getData()) == null) {
            return null;
        }
        if (!(true ^ (data.length == 0))) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        return HeadsetSportSettingKt.toHeadsetSportSetting(data);
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    @Nullable
    public Boolean getHearingHealth() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseG = g(this, new EcfCommand.TwoWay(TwoWayCmd.HearingHealth.INSTANCE, true), null, 2, null);
        if (hMNotifyResponseG == null || !hMNotifyResponseG.isSuccess() || (data = hMNotifyResponseG.getData()) == null) {
            return null;
        }
        if (!(true ^ (data.length == 0))) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        return Boolean.valueOf(ByteUtilsKt.toBoolean(data[0]));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    @Nullable
    public HrReminderInfo getHrReminder() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseG = g(this, new EcfCommand.TwoWay(TwoWayCmd.HighHrReminder.INSTANCE, true), null, 2, null);
        if (hMNotifyResponseG == null || !hMNotifyResponseG.isSuccess() || (data = hMNotifyResponseG.getData()) == null) {
            return null;
        }
        if (!(true ^ (data.length == 0))) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        return HrReminderInfoKt.toHrReminderInfo(data);
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    @Nullable
    public Mtu getMtu() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseG = g(this, EcfCommand.MtuCom.INSTANCE, null, 2, null);
        if (hMNotifyResponseG == null || !hMNotifyResponseG.isSuccess() || (data = hMNotifyResponseG.getData()) == null) {
            return null;
        }
        if (!(!(data.length == 0))) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        return new Mtu(GattUtils.bytesToInt(data, 0, 2));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    @Nullable
    public MultiDeviceState getMultiDeviceState() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseG = g(this, EcfCommand.MultiDeviceState.INSTANCE, null, 2, null);
        if (hMNotifyResponseG == null || !hMNotifyResponseG.isSuccess() || (data = hMNotifyResponseG.getData()) == null) {
            return null;
        }
        if (!(!(data.length == 0))) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        return MultiDeviceStateKt.toMultiDeviceState(data);
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    @Nullable
    public NoiseControl getNoiseControl() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseG = g(this, new EcfCommand.TwoWay(TwoWayCmd.NoiseControlCmd.INSTANCE, true), null, 2, null);
        if (hMNotifyResponseG == null || !hMNotifyResponseG.isSuccess() || (data = hMNotifyResponseG.getData()) == null) {
            return null;
        }
        if (!(true ^ (data.length == 0))) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        return NoiseControlKt.toNoiseControl(data);
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    @Nullable
    public HMNotifyResponse getOffWristLockState() {
        return g(this, EcfCommand.OffWristLock.INSTANCE, null, 2, null);
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    @Nullable
    public Boolean getOsaEnable() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseG = g(this, new EcfCommand.TwoWay(TwoWayCmd.Osa.INSTANCE, true), null, 2, null);
        if (hMNotifyResponseG == null || !hMNotifyResponseG.isSuccess() || (data = hMNotifyResponseG.getData()) == null) {
            return null;
        }
        if (!(true ^ (data.length == 0))) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        return Boolean.valueOf(ByteUtilsKt.toBoolean(data[0]));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    @Nullable
    public Boolean getPercussionBroadcast() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseG = g(this, new EcfCommand.TwoWay(TwoWayCmd.PercussionBroadcast.INSTANCE, true), null, 2, null);
        if (hMNotifyResponseG == null || !hMNotifyResponseG.isSuccess() || (data = hMNotifyResponseG.getData()) == null) {
            return null;
        }
        if (!(true ^ (data.length == 0))) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        return Boolean.valueOf(ByteUtilsKt.toBoolean(data[0]));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    @Nullable
    public Boolean getPressEnable() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseG = g(this, new EcfCommand.TwoWay(TwoWayCmd.Pressure.INSTANCE, true), null, 2, null);
        if (hMNotifyResponseG == null || !hMNotifyResponseG.isSuccess() || (data = hMNotifyResponseG.getData()) == null) {
            return null;
        }
        if (!(true ^ (data.length == 0))) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        return Boolean.valueOf(ByteUtilsKt.toBoolean(data[0]));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    @Nullable
    public Boolean getRelaxationPrompt() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseG = g(this, new EcfCommand.TwoWay(TwoWayCmd.RelaxationPromptSwitch.INSTANCE, true), null, 2, null);
        if (hMNotifyResponseG == null || !hMNotifyResponseG.isSuccess() || (data = hMNotifyResponseG.getData()) == null) {
            return null;
        }
        if (!(true ^ (data.length == 0))) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        return Boolean.valueOf(ByteUtilsKt.toBoolean(data[0]));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    @Nullable
    public Boolean getRemEnable() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseG = g(this, new EcfCommand.TwoWay(TwoWayCmd.Rem.INSTANCE, true), null, 2, null);
        if (hMNotifyResponseG == null || !hMNotifyResponseG.isSuccess() || (data = hMNotifyResponseG.getData()) == null) {
            return null;
        }
        if (!(true ^ (data.length == 0))) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        return Boolean.valueOf(ByteUtilsKt.toBoolean(data[0]));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    @Nullable
    public Boolean getRunningRecognition() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseG = g(this, new EcfCommand.TwoWay(TwoWayCmd.RunningRecognitionSwitch.INSTANCE, true), null, 2, null);
        if (hMNotifyResponseG == null || !hMNotifyResponseG.isSuccess() || (data = hMNotifyResponseG.getData()) == null) {
            return null;
        }
        if (!(true ^ (data.length == 0))) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        return Boolean.valueOf(ByteUtilsKt.toBoolean(data[0]));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    @Nullable
    public String getVersion() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseG = g(this, EcfCommand.GetVersion.INSTANCE, null, 2, null);
        if (hMNotifyResponseG == null || !hMNotifyResponseG.isSuccess() || (data = hMNotifyResponseG.getData()) == null) {
            return null;
        }
        if (!(!(data.length == 0))) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        return ByteArrayKt.toString$default(data, 0, 0, 2, null);
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    @Nullable
    public Boolean getVoiceControl() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseG = g(this, new EcfCommand.TwoWay(TwoWayCmd.VoiceControlSwitch.INSTANCE, true), null, 2, null);
        if (hMNotifyResponseG == null || !hMNotifyResponseG.isSuccess() || (data = hMNotifyResponseG.getData()) == null) {
            return null;
        }
        if (!(true ^ (data.length == 0))) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        return Boolean.valueOf(ByteUtilsKt.toBoolean(data[0]));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    @Nullable
    public Boolean getWearInduction() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseG = g(this, new EcfCommand.TwoWay(TwoWayCmd.WearInduction.INSTANCE, true), null, 2, null);
        if (hMNotifyResponseG == null || !hMNotifyResponseG.isSuccess() || (data = hMNotifyResponseG.getData()) == null) {
            return null;
        }
        if (!(true ^ (data.length == 0))) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        return Boolean.valueOf(ByteUtilsKt.toBoolean(data[0]));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean modifyDeviceName(@NotNull String deviceName) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(deviceName.getBytes(Charsets.UTF_8));
        byteArrayOutputStream.write(0);
        return b(EcfCommand.ModifyDeviceName.INSTANCE, byteArrayOutputStream.toByteArray());
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    @Nullable
    public Boolean readAtrialFibEnable() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseG = g(this, new EcfCommand.TwoWay(TwoWayCmd.AtrialFib.INSTANCE, true), null, 2, null);
        if (hMNotifyResponseG == null || !hMNotifyResponseG.isSuccess() || (data = hMNotifyResponseG.getData()) == null) {
            return null;
        }
        if (!(true ^ (data.length == 0))) {
            data = null;
        }
        if (data == null) {
            return null;
        }
        return Boolean.valueOf(ByteUtilsKt.toBoolean(data[0]));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean reset() {
        return c(new Request(new EcfCommand.Extend(ExtendCmd.Reset.INSTANCE), new byte[]{1}));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean setActivityGoal(@NotNull List<ActivityGoal> goals, boolean useTwoWayCmd) {
        return useTwoWayCmd ? b(new EcfCommand.TwoWay(TwoWayCmd.GoalAndReminder.INSTANCE), ActivityGoalKt.toBytes(goals)) : b(new EcfCommand.Extend(ExtendCmd.SetActivityGoal.INSTANCE), ActivityGoalKt.toEcfExtendBytes(goals));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    @Nullable
    public Boolean setAlldayHeartRate(int interval) {
        return Boolean.valueOf(b(new EcfCommand.TwoWay(TwoWayCmd.HrInterval.INSTANCE, false), new byte[]{(byte) interval}));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    @Nullable
    public Boolean setAtrialFibEnable(boolean isEnable) {
        return Boolean.valueOf(b(new EcfCommand.TwoWay(TwoWayCmd.AtrialFib.INSTANCE, false), h(isEnable)));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean setCervicalProtection(boolean enable) {
        return b(new EcfCommand.TwoWay(TwoWayCmd.CervicalProtection.INSTANCE, false), h(enable));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean setDisplaySettingByTimexVendor(@NotNull DisplaySetting setting) {
        return b(new EcfCommand.Vendor(TimexVendorCmd.SetDisplaySetting.INSTANCE), setting.toBleBytes());
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean setEnvironmentSound(boolean isOpen) {
        return b(new EcfCommand.TwoWay(TwoWayCmd.EnvironmentSoundSwitch.INSTANCE, false), h(isOpen));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean setEqualizer(@NotNull Equalizer equalizer) {
        return b(EcfCommand.SetEq.INSTANCE, equalizer.getBytes$bluetooth_release());
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean setHeadsetKnock(@NotNull HeadsetKnockSetting setting) {
        return this.supportHeadsetKnockNew.invoke().booleanValue() ? b(EcfCommand.HeadsetKnockingNew.INSTANCE, setting.getBytesNew$bluetooth_release()) : b(new EcfCommand.TwoWay(TwoWayCmd.HeadsetKnocking.INSTANCE), setting.getBytes$bluetooth_release());
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean setHeadsetSideListen(@NotNull HeadsetSideListenSetting setting) {
        return b(new EcfCommand.TwoWay(TwoWayCmd.HeadsetSideListen.INSTANCE), setting.getBytes$bluetooth_release());
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean setHeadsetSport(@NotNull HeadsetSportSetting setting) {
        return b(new EcfCommand.TwoWay(TwoWayCmd.HeadsetSport.INSTANCE), setting.getBytes$bluetooth_release());
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean setHearingHealth(boolean enable) {
        return b(new EcfCommand.TwoWay(TwoWayCmd.HearingHealth.INSTANCE, false), h(enable));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean setHrReminder(@NotNull HrReminderInfo hrReminderInfo) {
        return b(new EcfCommand.TwoWay(TwoWayCmd.HighHrReminder.INSTANCE, false), hrReminderInfo.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String());
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean setHrSleepEnable(boolean isEnable) {
        return b(new EcfCommand.Extend(ExtendCmd.HrSleep.INSTANCE), h(isEnable));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean setHrZone(@NotNull HRZone hrZone) {
        return b(new EcfCommand.Vendor(TimexVendorCmd.SetHrZone.INSTANCE), hrZone.getBytes());
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean setMiliHrReminder(@NotNull HMHrReminder hrReminder) {
        return b(new EcfCommand.Extend(ExtendCmd.HrReminder.INSTANCE), hrReminder.toBytes());
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean setNoiseControl(@NotNull NoiseControl control) {
        return b(new EcfCommand.TwoWay(TwoWayCmd.NoiseControlCmd.INSTANCE, false), control.getBytes$bluetooth_release());
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    @Nullable
    public Boolean setNowTimeConfig(@NotNull NowTimeConfig config) {
        return Boolean.valueOf(b(new EcfCommand.TwoWay(TwoWayCmd.NowTime.INSTANCE, false), config.getBytes()));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean setOsaEnable(boolean isEnable, boolean isNewHealthDetect) {
        return isNewHealthDetect ? b(new EcfCommand.TwoWay(TwoWayCmd.Osa.INSTANCE), h(isEnable)) : b(new EcfCommand.Extend(ExtendCmd.Osa.INSTANCE), h(isEnable));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean setOtaProgress(@NotNull List<? extends HMFirmwareInfo> firmwares) {
        Iterator<? extends HMFirmwareInfo> it2 = firmwares.iterator();
        long fileSize = 0;
        while (it2.hasNext()) {
            fileSize += it2.next().getFileSize();
        }
        int iA = 0;
        if (fileSize == 0) {
            return false;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int size = firmwares.size();
        int i = 0;
        for (HMFirmwareInfo hMFirmwareInfo : firmwares) {
            byteArrayOutputStream.write(hMFirmwareInfo.getFwType().getValue());
            iA += a(hMFirmwareInfo, size, i, fileSize);
            byteArrayOutputStream.write(iA);
            i++;
        }
        return b(new EcfCommand.Extend(ExtendCmd.SetOtaProgress.INSTANCE), byteArrayOutputStream.toByteArray());
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean setPercussionBroadcast(boolean enable) {
        return b(new EcfCommand.TwoWay(TwoWayCmd.PercussionBroadcast.INSTANCE, false), h(enable));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    @Nullable
    public Boolean setPressEnable(boolean isEnable) {
        return Boolean.valueOf(b(new EcfCommand.TwoWay(TwoWayCmd.Pressure.INSTANCE, false), h(isEnable)));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean setRelaxationPrompt(boolean isOpen) {
        return b(new EcfCommand.TwoWay(TwoWayCmd.RelaxationPromptSwitch.INSTANCE, false), h(isOpen));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    @Nullable
    public Boolean setRemEnable(boolean isEnable) {
        return Boolean.valueOf(b(new EcfCommand.TwoWay(TwoWayCmd.Rem.INSTANCE, false), h(isEnable)));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean setReportHeadsetInfoSwitch(boolean isOpen) {
        return b(EcfCommand.ReportHeadsetInfoSwitch.INSTANCE, h(isOpen));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean setRunningRecognition(boolean isOpen) {
        return b(new EcfCommand.TwoWay(TwoWayCmd.RunningRecognitionSwitch.INSTANCE, false), h(isOpen));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean setSportHrEnable(boolean isEnable) {
        return b(new EcfCommand.Extend(ExtendCmd.SportHr.INSTANCE), h(isEnable));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean setVoiceControl(boolean isOpen) {
        return b(new EcfCommand.TwoWay(TwoWayCmd.VoiceControlSwitch.INSTANCE, false), h(isOpen));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean setWearInduction(boolean enable) {
        return b(new EcfCommand.TwoWay(TwoWayCmd.WearInduction.INSTANCE, false), h(enable));
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean syncAppState(@NotNull AppState state) {
        return b(EcfCommand.SyncAppState.INSTANCE, new byte[]{state.getValue()});
    }

    @Override // com.huami.bluetooth.profile.ecf.EcfController
    public boolean syncSecondEarStatistic() {
        return d(this, new EcfCommand.Extend(ExtendCmd.SecondEarStatisticSync.INSTANCE), null, 2, null);
    }

    public /* synthetic */ EcfControllerImpl(BluetoothCharacteristic bluetoothCharacteristic, Function0 function0, ECFInterceptor eCFInterceptor, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(bluetoothCharacteristic, function0, (i & 4) != 0 ? null : eCFInterceptor);
    }

    public EcfControllerImpl(@NotNull BluetoothCharacteristic bluetoothCharacteristic) {
        this(bluetoothCharacteristic, a.a);
    }

    public EcfControllerImpl(@NotNull BluetoothCharacteristic bluetoothCharacteristic, @NotNull Function0<Boolean> function0) {
        this(bluetoothCharacteristic, function0, null);
    }

    public EcfControllerImpl(@NotNull BluetoothCharacteristic bluetoothCharacteristic, @Nullable ECFInterceptor eCFInterceptor) {
        this(bluetoothCharacteristic, b.a, eCFInterceptor);
    }
}
