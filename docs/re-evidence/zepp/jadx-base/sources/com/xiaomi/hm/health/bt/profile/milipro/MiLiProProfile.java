package com.xiaomi.hm.health.bt.profile.milipro;

import android.annotation.SuppressLint;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothGattCharacteristic;
import android.bluetooth.BluetoothGattService;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.huami.bluetooth.profile.Request;
import com.huami.bluetooth.profile.channel.module.base.ModuleResult;
import com.huami.bluetooth.profile.channel.module.base.Success;
import com.huami.bluetooth.profile.channel.module.connect.ConnectModule;
import com.huami.bluetooth.profile.channel.module.connect.ConnectParam;
import com.huami.bluetooth.profile.channel.module.dial.DialApi;
import com.huami.bluetooth.profile.channel.module.dial.DialApiFactory;
import com.huami.bluetooth.profile.channel.module.obsolete.ObsoleteModule;
import com.huami.bluetooth.profile.channel.module.pai.PaiModule;
import com.huami.bluetooth.profile.channel.module.pb.PBApi;
import com.huami.bluetooth.profile.channel.module.pb.PBUtils;
import com.huami.bluetooth.profile.channel.module.settings.EcfCmdProvider;
import com.huami.bluetooth.profile.channel.module.settings.SettingsGroupType;
import com.huami.bluetooth.profile.channel.module.settings.SettingsImpl;
import com.huami.bluetooth.profile.channel.module.settings.SettingsModule;
import com.huami.bluetooth.profile.channel.module.settings.entity.language.SettingsLanguage;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.EnumData;
import com.huami.bluetooth.profile.channel.module.settings.primarydata.Settings;
import com.huami.bluetooth.profile.characteristic.HMBleBluetoothCharacteristic;
import com.huami.bluetooth.profile.characteristic.HMGattCharacteristic;
import com.huami.bluetooth.profile.ecf.ECFInterceptor;
import com.huami.bluetooth.profile.ecf.EcfCommand;
import com.huami.bluetooth.profile.ecf.EcfController;
import com.huami.bluetooth.profile.ecf.EcfControllerImpl;
import com.huami.bluetooth.profile.ecf.ExtendCmd;
import com.huami.bluetooth.profile.ecf.GenericInterceptor;
import com.huami.bluetooth.profile.ecf.PieceDataInterceptor;
import com.huami.bluetooth.profile.ecf.TimexVendorCmd;
import com.huami.bluetooth.profile.ecf.TwoWayCmd;
import com.huami.bluetooth.profile.ecf.data.ActivityGoal;
import com.huami.bluetooth.profile.ecf.data.ActivityGoalKt;
import com.huami.bluetooth.profile.ecf.data.DialReplacement;
import com.huami.bluetooth.profile.ecf.data.DialsInfo;
import com.huami.bluetooth.profile.ecf.data.HRZone;
import com.huami.bluetooth.profile.ecf.data.HidStatus;
import com.huami.bluetooth.profile.ecf.data.LiftWristTouch;
import com.huami.bluetooth.profile.ecf.data.NowTimeConfig;
import com.huami.bluetooth.profile.ecf.data.StandAlertConfig;
import com.huami.bluetooth.profile.ecf.data.Touchscreen;
import com.huami.bluetooth.utils.ByteUtilsKt;
import com.huami.ecg.core.db.entity.EcgData;
import com.huami.tools.log.HMLog;
import com.huami.watch.util.Log;
import com.xiaomi.hm.health.bt.HMBleConfig;
import com.xiaomi.hm.health.bt.debug.Debug;
import com.xiaomi.hm.health.bt.device.HMBaseDevice;
import com.xiaomi.hm.health.bt.device.HMDeviceFeature;
import com.xiaomi.hm.health.bt.device.HMDeviceSource;
import com.xiaomi.hm.health.bt.gatt.GattUtils;
import com.xiaomi.hm.health.bt.gatt.IGattCallback;
import com.xiaomi.hm.health.bt.model.HMAccessInfo;
import com.xiaomi.hm.health.bt.model.HMAidInfo;
import com.xiaomi.hm.health.bt.model.HMAutoBacklightInfo;
import com.xiaomi.hm.health.bt.model.HMDisconnectRemindConfig;
import com.xiaomi.hm.health.bt.model.HMDisplayData;
import com.xiaomi.hm.health.bt.model.HMHrReminder;
import com.xiaomi.hm.health.bt.model.HMLanguage;
import com.xiaomi.hm.health.bt.model.HMLiftWristConfig;
import com.xiaomi.hm.health.bt.model.HMNBInfo;
import com.xiaomi.hm.health.bt.model.HMNegativeScreen;
import com.xiaomi.hm.health.bt.model.HMPeytoSettings;
import com.xiaomi.hm.health.bt.model.HMProDisplayItem;
import com.xiaomi.hm.health.bt.model.HMProDisplayItemExt;
import com.xiaomi.hm.health.bt.model.HMReminderInfo;
import com.xiaomi.hm.health.bt.model.HMSedentaryConfig;
import com.xiaomi.hm.health.bt.model.HMSilentConfig;
import com.xiaomi.hm.health.bt.model.HMStatisticInfo;
import com.xiaomi.hm.health.bt.model.HMTarget;
import com.xiaomi.hm.health.bt.model.HMVibrateInfo;
import com.xiaomi.hm.health.bt.model.LanguageComBination;
import com.xiaomi.hm.health.bt.model.PasswordInfo;
import com.xiaomi.hm.health.bt.model.selftest.HMChaohuTestInfo;
import com.xiaomi.hm.health.bt.profile.adreminder.AdReminder;
import com.xiaomi.hm.health.bt.profile.alert.HMAlertMode;
import com.xiaomi.hm.health.bt.profile.base.BaseProfile;
import com.xiaomi.hm.health.bt.profile.base.BatteryInfo;
import com.xiaomi.hm.health.bt.profile.base.DeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.GeneralDeviceInfo;
import com.xiaomi.hm.health.bt.profile.base.HMNotifyResponse;
import com.xiaomi.hm.health.bt.profile.base.HMOtherVersion;
import com.xiaomi.hm.health.bt.profile.base.IBaseProfile;
import com.xiaomi.hm.health.bt.profile.base.LEParams;
import com.xiaomi.hm.health.bt.profile.base.MedicalRegisterVersion;
import com.xiaomi.hm.health.bt.profile.base.ProfileUtils;
import com.xiaomi.hm.health.bt.profile.base.RealtimeStep;
import com.xiaomi.hm.health.bt.profile.beep.BeepItem;
import com.xiaomi.hm.health.bt.profile.collect.DataCollect;
import com.xiaomi.hm.health.bt.profile.dfu.HMFirmwareInfo;
import com.xiaomi.hm.health.bt.profile.feature.AGpsFeatureInit;
import com.xiaomi.hm.health.bt.profile.feature.Feature;
import com.xiaomi.hm.health.bt.profile.gdsp.gps.SportCalibrateInfo;
import com.xiaomi.hm.health.bt.profile.gdsp.pai.HMPaiData;
import com.xiaomi.hm.health.bt.profile.generic.HMGenericCommand;
import com.xiaomi.hm.health.bt.profile.generic.HMGenericProfile;
import com.xiaomi.hm.health.bt.profile.generic.HMGenericResponse;
import com.xiaomi.hm.health.bt.profile.hr.HeartRateData;
import com.xiaomi.hm.health.bt.profile.milipro.MiLiProProfile;
import com.xiaomi.hm.health.bt.profile.milipro.model.AlarmClockExt;
import com.xiaomi.hm.health.bt.profile.milipro.model.BlePairMode;
import com.xiaomi.hm.health.bt.profile.milipro.model.BlePairStatus;
import com.xiaomi.hm.health.bt.profile.page.PageItem;
import com.xiaomi.hm.health.bt.profile.smartwatch.SmartWatchProfile;
import com.xiaomi.hm.health.bt.profile.sport.SportItemDataConfig;
import com.xiaomi.hm.health.bt.profile.sport.SportRemindConfig;
import com.xiaomi.hm.health.bt.profile.sport.coaching.HMCoachingState;
import com.xiaomi.hm.health.bt.profile.sport.coaching.HMCoachingWorkout;
import com.xiaomi.hm.health.bt.profile.worldclock.WorldTime;
import com.xiaomi.hm.health.bt.proxy.ProxyContainer;
import com.xiaomi.hm.health.bt.utils.ArraysUtil;
import com.xiaomi.hm.health.bt.utils.BytesUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes18.dex */
@SuppressLint({"NewApi"})
public class MiLiProProfile extends BaseProfile implements IMiLiProProfile, ECFInterceptor, EcfCmdProvider, PBApi, PieceDataInterceptor, GenericInterceptor {
    private static final int A1 = 0;
    private static final int B1 = 256;
    private static final int C1 = 3;
    private static final int D1 = 6;
    private static final int E1 = 46;
    public static final byte ECF_COMMAND_AUTO_BACKLIGHT = 26;
    public static final byte ECF_COMMAND_ENTRANCE_AVAILABILITY = 53;
    public static final byte ECF_COMMAND_EXTEND = 6;
    public static final short ECF_COMMAND_EXTEND_ANTI_THEFT = 12;
    public static final short ECF_COMMAND_EXTEND_BIND = 32;
    public static final short ECF_COMMAND_EXTEND_CONNECTED_ADV = 1;
    public static final short ECF_COMMAND_EXTEND_DATE_FORMAT = 30;
    public static final short ECF_COMMAND_EXTEND_HR_BROADCAST = 31;
    public static final short ECF_COMMAND_EXTEND_HR_REMINDER = 26;
    public static final short ECF_COMMAND_EXTEND_MULTI_LINK = 15;
    public static final byte ECF_COMMAND_EXTEND_NB_IMEI = 38;
    public static final byte ECF_COMMAND_EXTEND_NB_VER = 39;
    public static final short ECF_COMMAND_EXTEND_OTHER_CALENDAR = 40;
    public static final short ECF_COMMAND_EXTEND_SET_SPORT_REMIND_CONFIG = 39;
    public static final short ECF_COMMAND_EXTEND_SHOW_CONTACT = 16;
    public static final short ECF_COMMAND_EXTEND_SPORT_HEARTRATE = 34;
    public static final short ECF_COMMAND_EXTEND_START_DAY_OF_WEEK = 41;
    public static final short ECF_COMMAND_EXTEND_STOP_DEVICE = 27;
    public static final short ECF_COMMAND_EXTEND_SWIM_LOG = 42;
    public static final short ECF_COMMAND_EXTEND_TIME_FORMAT = 2;
    public static final short ECF_COMMAND_EXTEND_UNIT = 3;
    public static final byte ECF_COMMAND_EXTERNAL_RESOURCE = 65;
    public static final byte ECF_COMMAND_GET_BASE_RESOURCE_INFO = 35;
    public static final byte ECF_COMMAND_GET_BIND_STATUS = 37;
    public static final byte ECF_COMMAND_GET_RESOURCE_VERSION = 12;
    public static final byte ECF_COMMAND_GET_RES_INFO = 17;
    public static final byte ECF_COMMAND_GET_SWIM_LOG_SWITCH = 36;
    public static final byte ECF_COMMAND_SET_BEEP = 60;
    public static final byte ECF_COMMAND_SET_SEDENTARY = 8;
    public static final byte ECF_COMMAND_SET_SILENT = 9;
    public static final byte ECF_COMMAND_SET_SPORT_DATA_ITEM = -31;
    public static final byte ECF_COMMAND_SET_SPORT_TYPE_SORT = -32;
    public static final byte ECF_COMMAND_TWO_WAY = -2;
    public static final byte ECF_GET_STORAGE_STATE = 57;
    public static final byte ECF_MULTI_TARGET = 58;
    public static final byte ECF_TWO_WAY_CMD = -2;
    public static final byte ECF_TWO_WAY_CMD_READ = 1;
    public static final byte ECF_TWO_WAY_CMD_WRITE = 0;
    public static final byte ECF_WRITE_PAI_DATA = 59;
    private static final int F1 = 47;
    public static final byte FLAG_MENSTRUATION_DEVICE_NOTIFY = 1;
    public static final byte FLAG_MENSTRUATION_NOTIFY = 2;
    public static final byte FLAG_OVULATION_NOTIFY = 4;
    public static final byte KEY_CALORIE_TARGET = 2;
    public static final byte KEY_DISTANCE_TARGET = 4;
    public static final byte KEY_STEP_TARGET = 1;
    public static final byte PROFILE_AD_REMINDER = 40;
    public static final byte PROFILE_CUSTOM_VIBRATE = 32;
    private static final int i1 = 0;
    private static final int j1 = 1;
    private static final int k1 = 2;
    private static final byte l1 = 72;
    private static final short m1 = 3;
    private static final short n1 = 4;
    private static final short o1 = 49;
    private static final byte p1 = -2;
    private static final byte q1 = 5;
    private static final byte r1 = 7;
    private static final byte s1 = 0;
    private static final byte t1 = 1;
    private static final byte u1 = 0;
    private static final byte v1 = 1;
    private static final int w1 = 0;
    private static final int x1 = 1;
    private static final int y1 = 2;
    private static final int z1 = 3;
    private final byte A0;
    private final short B0;
    private final short C0;
    private final short D0;
    private final short E0;
    private final short F0;
    private final short G0;
    private final short H0;
    private final short I0;
    private final short J0;
    private final short K0;
    private final short L0;
    private final short M0;
    private final short N0;
    private final short O0;
    private final short P0;
    private final short Q0;
    private final short R0;
    private final short S0;
    private final short T0;
    private final short U0;
    private final short V0;
    private final String W;
    private final short W0;
    private final byte X;
    private final short X0;
    private final byte Y;
    private final short Y0;
    private final byte Z;
    private final short Z0;
    private final short a1;
    private final short b1;
    private final short c1;
    private final int d1;
    private BluetoothGattCharacteristic e1;
    private byte[] f1;
    private EcfController g1;
    private DialApi h1;
    private final byte m0;
    private final byte n0;
    private final byte o0;
    private final byte p0;
    private final byte q0;
    private final byte r0;
    private final byte s0;
    private final byte t0;
    private final byte u0;
    private final byte v0;
    private final byte w0;
    private final byte x0;
    private final byte y0;
    private final byte z0;

    public static class a implements HMGattCharacteristic {
        private Function0<BluetoothGattCharacteristic> a;

        public a(Function0<BluetoothGattCharacteristic> fun) {
            this.a = fun;
        }

        @Override // com.huami.bluetooth.profile.characteristic.HMGattCharacteristic
        public boolean deInit() {
            return true;
        }

        @Override // com.huami.bluetooth.profile.characteristic.HMGattCharacteristic
        @Nullable
        /* JADX INFO: renamed from: getCharacteristic */
        public BluetoothGattCharacteristic get_characteristic() {
            return this.a.invoke();
        }

        @Override // com.huami.bluetooth.profile.characteristic.HMGattCharacteristic
        public boolean init() {
            return true;
        }
    }

    public MiLiProProfile(Context context, BluetoothDevice device, IGattCallback.IConnectionStateChangeCallback connCB) {
        super(context, device, connCB);
        this.W = "MiLiProProfile";
        this.X = (byte) 1;
        this.Y = (byte) 2;
        this.Z = (byte) 3;
        this.m0 = (byte) 4;
        this.n0 = (byte) 5;
        this.o0 = (byte) 7;
        this.p0 = (byte) 10;
        this.q0 = (byte) 11;
        this.r0 = (byte) 13;
        this.s0 = (byte) 14;
        this.t0 = (byte) 15;
        this.u0 = (byte) 16;
        this.v0 = (byte) 19;
        this.w0 = (byte) 20;
        this.x0 = (byte) 27;
        this.y0 = (byte) 29;
        this.z0 = (byte) 30;
        this.A0 = (byte) 31;
        this.B0 = (short) 4;
        this.C0 = (short) 5;
        this.D0 = (short) 6;
        this.E0 = (short) 7;
        this.F0 = (short) 9;
        this.G0 = (short) 10;
        this.H0 = (short) 11;
        this.I0 = (short) 13;
        this.J0 = (short) 17;
        this.K0 = (short) 19;
        this.L0 = (short) 20;
        this.M0 = (short) 21;
        this.N0 = (short) 22;
        this.O0 = (short) 23;
        this.P0 = (short) 24;
        this.Q0 = (short) 25;
        this.R0 = (short) 28;
        this.S0 = (short) 29;
        this.T0 = (short) 33;
        this.U0 = (short) 35;
        this.V0 = (short) 36;
        this.W0 = (short) 60;
        this.X0 = (short) 61;
        this.Y0 = (short) 50;
        this.Z0 = (short) 54;
        this.a1 = (short) 59;
        this.b1 = (short) 63;
        this.c1 = (short) 36;
        this.d1 = 57;
        this.e1 = null;
        this.f1 = null;
        this.g1 = null;
    }

    private DialApi A0() {
        if (this.h1 == null) {
            this.h1 = DialApiFactory.INSTANCE.create(this);
        }
        return this.h1;
    }

    private ArrayList<HMLanguage> B0() {
        byte[] bArrCommandResponseData;
        HMGenericResponse hMGenericResponseSendGenericCommand = sendGenericCommand(new HMGenericCommand(14));
        if (hMGenericResponseSendGenericCommand == null || !hMGenericResponseSendGenericCommand.isCommandSuccess() || (bArrCommandResponseData = hMGenericResponseSendGenericCommand.commandResponseData()) == null || bArrCommandResponseData.length == 0) {
            return null;
        }
        ArrayList<HMLanguage> arrayList = new ArrayList<>(bArrCommandResponseData.length);
        for (byte b : bArrCommandResponseData) {
            arrayList.add(new HMLanguage(b & 255));
        }
        return arrayList;
    }

    private int C0() {
        if (!supportModule(ConnectModule.class)) {
            return D0();
        }
        ConnectModule connectModule = (ConnectModule) getChannelModule(ConnectModule.class);
        if (connectModule == null) {
            HMLog.info("MiLiProProfile", new Function0() { // from class: t45
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return MiLiProProfile.I0();
                }
            });
            return -1;
        }
        final ModuleResult<ConnectParam> moduleResultQueryConnectParam = connectModule.queryConnectParam();
        if (moduleResultQueryConnectParam instanceof Success) {
            return ((ConnectParam) ((Success) moduleResultQueryConnectParam).getData()).getMtu();
        }
        HMLog.info("MiLiProProfile", new Function0() { // from class: q45
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MiLiProProfile.J0(moduleResultQueryConnectParam);
            }
        });
        return -1;
    }

    private int D0() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{19});
        if (hMNotifyResponseSendECFCommand == null || !hMNotifyResponseSendECFCommand.isSuccess((byte) 19) || (data = hMNotifyResponseSendECFCommand.getData()) == null || data.length != 2) {
            return -1;
        }
        return ((data[1] & 255) << 8) | (data[0] & 255);
    }

    private Integer E0(HMNotifyResponse response) {
        Debug.fi("MiLiProProfile", "skinId response: " + response);
        if (response != null && response.isSuccess()) {
            byte[] data = response.getData();
            if (data.length == 4) {
                return Integer.valueOf(ByteUtilsKt.toInt(data, 4, 0));
            }
            if (data.length == 5) {
                return Integer.valueOf(ByteUtilsKt.toInt(data, 4, 1));
            }
        }
        return null;
    }

    private Pair<Boolean, ArrayList<HMLanguage>> F0(Feature feature) {
        SettingsModule settingsModule;
        Settings settings;
        Pair<Boolean, ArrayList<HMLanguage>> pair = new Pair<>(Boolean.FALSE, new ArrayList());
        if (feature != null) {
            boolean zHasSw = feature.hasSw(19);
            boolean zSupportModule = ((HMBaseDevice) this.mCallback).supportModule(SettingsModule.class);
            Object obj = this.mCallback;
            if (!(obj instanceof HMBaseDevice) || (!(zHasSw || zSupportModule) || (settingsModule = (SettingsModule) ((HMBaseDevice) obj).getChannelModule(SettingsModule.class)) == null)) {
                return pair;
            }
            SettingsGroupType settingsGroupType = SettingsGroupType.LANGUAGE;
            HashMap<SettingsGroupType, Settings> mapQuerySettingsSync = settingsModule.querySettingsSync(true, new SettingsGroupType[]{settingsGroupType});
            if (mapQuerySettingsSync == null || (settings = mapQuerySettingsSync.get(settingsGroupType)) == null) {
                return pair;
            }
            EnumData languageEnum = SettingsLanguage.getLanguageEnum(settings);
            ArrayList<Integer> enums = languageEnum != null ? languageEnum.getEnums() : null;
            if (enums == null) {
                return new Pair<>(Boolean.TRUE, new ArrayList());
            }
            ArrayList arrayList = new ArrayList(enums.size());
            Iterator<Integer> it2 = enums.iterator();
            while (it2.hasNext()) {
                arrayList.add(new HMLanguage(it2.next().intValue()));
            }
            return new Pair<>(Boolean.TRUE, arrayList);
        }
        return pair;
    }

    private void G0(DeviceInfo deviceInfo) {
        if (deviceInfo == null || deviceInfo.getDeviceFeature() == null) {
            return;
        }
        Feature deviceFeature = deviceInfo.getDeviceFeature();
        HMDeviceSource deviceSource = deviceInfo.getDeviceSource();
        Pair<Boolean, ArrayList<HMLanguage>> pairF0 = F0(deviceFeature);
        boolean zHasSw = deviceFeature.hasSw(0);
        deviceInfo.getLanguageComBination().setContainLanguageGroup(((Boolean) pairF0.first).booleanValue());
        deviceInfo.getLanguageComBination().setContainLanguageFeature(zHasSw);
        if (deviceInfo.getLanguageComBination().isSupportDeviceSettings()) {
            ArrayList<HMLanguage> arrayListB0 = ((Boolean) pairF0.first).booleanValue() ? (ArrayList) pairF0.second : B0();
            LanguageComBination languageComBination = deviceInfo.getLanguageComBination();
            if (arrayListB0 == null) {
                arrayListB0 = new ArrayList<>();
            }
            languageComBination.setLanguageList(arrayListB0);
        }
        if (deviceInfo.getLanguageComBination().isSupportDeviceSettings() || HMDeviceFeature.SET_LANGUAGE_S.contains(deviceSource)) {
            return;
        }
        setLanguageNew(HMLanguage.getLanguageStr(Locale.getDefault()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ BluetoothGattCharacteristic H0() {
        return this.e1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String I0() {
        return "Connect channel module is null";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String J0(ModuleResult moduleResult) {
        return "Query connect param failed:" + moduleResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void K0(byte[] bArr) {
        Debug.fi("MiLiProProfile", "ecf notify:" + GattUtils.bytesToHexString(bArr));
        this.f1 = bArr;
        watingNotify(this.e1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String L0(boolean z) {
        return "set default color " + z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M0(AtomicBoolean atomicBoolean, CountDownLatch countDownLatch, byte[] bArr) {
        Debug.fi("MiLiProProfile", "PPCP notify:" + GattUtils.bytesToHexString(bArr));
        atomicBoolean.getAndSet(true);
        countDownLatch.countDown();
    }

    private HMChaohuTestInfo N0(byte[] value) {
        Debug.i("MiLiProProfile", "parseSelfTestValue:" + GattUtils.bytesToHexString(value));
        HMChaohuTestInfo hMChaohuTestInfo = new HMChaohuTestInfo(value);
        byte b = value[0];
        hMChaohuTestInfo.setGpsOK(((b >> 7) & 1) == 0);
        hMChaohuTestInfo.setBarometerOK(((b >> 6) & 1) == 0);
        hMChaohuTestInfo.setMotorOK(((b >> 5) & 1) == 0);
        hMChaohuTestInfo.setChargingOK(((b >> 4) & 1) == 0);
        hMChaohuTestInfo.setPPGOK(((b >> 3) & 1) == 0);
        hMChaohuTestInfo.setGsensorStatus((b >> 1) & 3);
        hMChaohuTestInfo.setFlashOK((b & 1) == 0);
        hMChaohuTestInfo.setGeomagnetic(value[1] & 255);
        hMChaohuTestInfo.setBarometerValue((value[2] & 255) | ((value[3] & 255) << 8) | ((value[4] & 255) << 16) | ((value[5] & 255) << 24));
        hMChaohuTestInfo.setBarometerDelta((value[6] & 255) | ((value[7] & 255) << 8));
        hMChaohuTestInfo.setMotorGValue(((value[9] & 255) << 8) | (value[8] & 255));
        Debug.i("MiLiProProfile", "result:" + hMChaohuTestInfo);
        return hMChaohuTestInfo;
    }

    private HMNotifyResponse O0(byte[] cmd, int cmdLen, int timeout) {
        if (preHandleECF(cmd)) {
            return postHandleECF(cmd, cmdLen);
        }
        synchronized (EcfController.INSTANCE.getEcfLock()) {
            BluetoothGattCharacteristic bluetoothGattCharacteristic = this.e1;
            if (bluetoothGattCharacteristic == null) {
                return null;
            }
            if (!registerNotification(bluetoothGattCharacteristic, new IGattCallback.INotifyCallback() { // from class: o45
                @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
                public final void notify(byte[] bArr) {
                    this.a.K0(bArr);
                }
            })) {
                return null;
            }
            this.f1 = null;
            Debug.fi("MiLiProProfile", "ecf cmd: " + GattUtils.bytesToHexString(cmd));
            if (!write(this.e1, cmd)) {
                Debug.fi("MiLiProProfile", "ecf cmd failed!");
                return null;
            }
            if (this.f1 == null) {
                waiting(this.e1, timeout);
            }
            unregisterNotification(this.e1);
            return HMNotifyResponse.parse(this.f1, cmdLen);
        }
    }

    private HMNotifyResponse P0(Request.Command cmd) {
        return Q0(cmd, null);
    }

    private HMNotifyResponse Q0(Request.Command cmd, byte[] data) {
        Request request = new Request(cmd, data);
        return sendECFCommand(request.getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String(), request.getCmdLen());
    }

    private boolean R0(byte[] body) {
        return patchWrite(new Request(new EcfCommand.Vendor(TimexVendorCmd.SetCoach.INSTANCE), body).getOrg.cybergarage.http.HTTP.CONTENT_RANGE_BYTES java.lang.String(), 2);
    }

    private byte[] S0(short s, boolean z) {
        return new byte[]{6, (byte) (s & 255), (byte) ((s >> 8) & 255), z ? (byte) 1 : (byte) 0};
    }

    private int v0(HMFirmwareInfo info, long totalSize) {
        int fileSize = totalSize != 0 ? (int) ((info.getFileSize() * 100) / totalSize) : 0;
        if (fileSize == 0) {
            return 1;
        }
        return fileSize;
    }

    private boolean w0() {
        if (this.settingsApi != null) {
            return true;
        }
        Debug.fi("MiLiProProfile", "settingsApi null");
        return false;
    }

    private boolean x0(Feature feature, PageItem item) {
        if (item.getCurrentType() == 26) {
            return feature != null && feature.hasSw(1);
        }
        return true;
    }

    private static int y0(byte[] bytes) {
        return z0(bytes, 0);
    }

    private static int z0(byte[] bytes, int index) {
        return ((bytes[index + 3] & 255) << 24) | (bytes[index] & 255) | ((bytes[index + 1] & 255) << 8) | ((bytes[index + 2] & 255) << 16);
    }

    public boolean activateSignature() {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{31});
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 31);
    }

    public boolean changeCity() {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{6, 24, 0, 0}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    public boolean deleteDial(int id) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{6, 36, 0, 1, (byte) (id & 255), (byte) ((id >> 8) & 255), (byte) ((id >> 16) & 255), (byte) ((id >> 24) & 255)}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    public boolean deleteDials(List<Integer> dials) {
        DialApi dialApiA0 = A0();
        boolean zDeleteDial = dialApiA0 == null ? false : dialApiA0.deleteDial(dials);
        Debug.fi("MiLiProProfile", "deleteDials [" + ArraysUtil.toString(dials) + "], Success: " + zDeleteDial);
        return zDeleteDial;
    }

    public boolean disableBind(boolean disable) {
        if (w0()) {
            return this.settingsApi.setRestrictedBindingSwitch(disable);
        }
        return false;
    }

    public boolean enableConnectedAdv(boolean enable) {
        if (w0()) {
            return this.settingsApi.setConnectedAdvSwitch(enable);
        }
        return false;
    }

    public boolean enableGoalRemind(boolean z) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{6, 6, 0, z ? (byte) 1 : (byte) 0}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    public boolean enableHrBroadcast(boolean enable) {
        if (w0()) {
            return this.settingsApi.enableHrBroadcast(enable);
        }
        return false;
    }

    public boolean enableHrSleep(boolean z) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{6, ECF_COMMAND_SET_BEEP, 0, z ? (byte) 1 : (byte) 0}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    public boolean enableLockScreen(boolean z) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{6, 22, 0, z ? (byte) 1 : (byte) 0}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    public boolean enableMessagePreview(boolean z) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{6, 29, 0, z ? (byte) 1 : (byte) 0}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    public boolean enableMultiLink(boolean enable) {
        if (w0()) {
            return this.settingsApi.setMultiLinkSwitch(enable);
        }
        return false;
    }

    public boolean enableOsa(boolean z) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{6, 61, 0, z ? (byte) 1 : (byte) 0}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    public boolean enableSportHeartRate(boolean enable) {
        if (w0()) {
            return this.settingsApi.enableSportHeartRate(enable);
        }
        return false;
    }

    public boolean enableSwimLog(boolean enable) {
        if (w0()) {
            return this.settingsApi.enableSwimLog(enable);
        }
        return false;
    }

    public boolean enableWristBright(boolean z) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{6, 5, 0, z ? (byte) 1 : (byte) 0}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    public boolean enableWristFlip(boolean z) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{6, 13, 0, z ? (byte) 1 : (byte) 0}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    public boolean findPhone(byte state) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{6, 20, 0, state}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    public ArrayList<AlarmClockExt> getAlarms() {
        HMGenericResponse hMGenericResponseSendGenericCommand = sendGenericCommand(new HMGenericCommand(1));
        if (hMGenericResponseSendGenericCommand == null || !hMGenericResponseSendGenericCommand.isCommandSuccess()) {
            return null;
        }
        return AlarmClockExt.fromBytes(hMGenericResponseSendGenericCommand.commandResponseData());
    }

    public Boolean getAutoOtaAtNightSwitch() {
        return !w0() ? Boolean.FALSE : this.settingsApi.getAutoOtaAtNightSwitch();
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile
    @androidx.annotation.Nullable
    public DeviceInfo getBaseDeviceInfo() {
        GeneralDeviceInfo generalDeviceInfo = getGeneralDeviceInfo();
        if (generalDeviceInfo == null) {
            return null;
        }
        return new DeviceInfo(generalDeviceInfo);
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile, com.huami.bluetooth.profile.channel.module.battery.BatteryApi
    public BatteryInfo getBatteryInfo() {
        BluetoothGattCharacteristic bluetoothGattCharacteristic = this.m_CharBattery;
        if (bluetoothGattCharacteristic == null) {
            return null;
        }
        return parseBatteryInfo(read(bluetoothGattCharacteristic));
    }

    @androidx.annotation.Nullable
    public BlePairStatus getBlePairStatus() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{l1});
        if (hMNotifyResponseSendECFCommand == null || !hMNotifyResponseSendECFCommand.isSuccess() || (data = hMNotifyResponseSendECFCommand.getData()) == null || data.length != 1) {
            return null;
        }
        return new BlePairStatus((data[0] & 1) != 0, (data[0] & 2) != 0 ? BlePairMode.SECURE_CONNECT : BlePairMode.LEGACY);
    }

    public int getCalorieGoal() {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{-2, 4, 1}, 3);
        return !(hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) -2)) ? -1 : 0;
    }

    @androidx.annotation.Nullable
    public HMCoachingState getCoachingState() {
        HMGenericResponse hMGenericResponseSendGenericCommand = sendGenericCommand(new HMGenericCommand(4));
        if (hMGenericResponseSendGenericCommand == null || !hMGenericResponseSendGenericCommand.isCommandSuccess()) {
            return null;
        }
        return new HMCoachingState(hMGenericResponseSendGenericCommand.commandResponseData());
    }

    public DataCollect getCollectData(Calendar time) {
        return getCollectData(time, o1);
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile
    public DeviceInfo getDeviceInfo() {
        DeviceInfo baseDeviceInfo = getBaseDeviceInfo();
        if (baseDeviceInfo == null) {
            return null;
        }
        updateExternalDeviceInfo(baseDeviceInfo);
        return baseDeviceInfo;
    }

    public HMPeytoSettings getDeviceSettings() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{13});
        if (hMNotifyResponseSendECFCommand == null || !hMNotifyResponseSendECFCommand.isSuccess((byte) 13) || (data = hMNotifyResponseSendECFCommand.getData()) == null || data.length < 3) {
            return null;
        }
        Debug.i("MiLiProProfile", "settings:" + GattUtils.bytesToHexString(data));
        HMPeytoSettings hMPeytoSettings = new HMPeytoSettings();
        short s = (short) ((data[0] & 255) | ((data[1] & 255) << 8));
        hMPeytoSettings.setRtHrOn((s & 1) == 1);
        hMPeytoSettings.setLiftScreenOn(((s >> 1) & 1) == 1);
        hMPeytoSettings.setWatchFaceType((s >> 2) & 7);
        hMPeytoSettings.setConnectedAdvOn(((s >> 5) & 1) == 1);
        hMPeytoSettings.setLongPressDef((s >> 6) & 3);
        hMPeytoSettings.setDisturbMode(3 & (s >> 8));
        int i = data[2] & 255;
        if (i > 0) {
            ArrayList<HMPeytoSettings.AlarmSwitch> arrayList = new ArrayList<>(i);
            for (int i2 = 0; i2 < i; i2++) {
                byte b = data[i2 + 3];
                arrayList.add(new HMPeytoSettings.AlarmSwitch(b & 15, ((b >> 4) & 1) == 1));
            }
            hMPeytoSettings.setAlarmSwitches(arrayList);
        }
        Debug.i("MiLiProProfile", "settings:" + hMPeytoSettings);
        return hMPeytoSettings;
    }

    public HMPeytoSettings getDeviceSettingsNew() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{13});
        HMPeytoSettings hMPeytoSettings = null;
        if (hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 13) && (data = hMNotifyResponseSendECFCommand.getData()) != null) {
            int i = 5;
            if (data.length >= 5) {
                Debug.i("MiLiProProfile", "settings:" + GattUtils.bytesToHexString(data));
                hMPeytoSettings = new HMPeytoSettings();
                int i2 = data[0] & 255;
                Debug.i("MiLiProProfile", "version:" + i2);
                short s = (short) ((data[1] & 255) | ((data[2] & 255) << 8));
                hMPeytoSettings.setRtHrOn((s & 1) == 1);
                hMPeytoSettings.setLiftScreenOn(((s >> 1) & 1) == 1);
                hMPeytoSettings.setConnectedAdvOn(((s >> 2) & 1) == 1);
                hMPeytoSettings.setLongPressDef((s >> 3) & 15);
                hMPeytoSettings.setDisturbMode((s >> 7) & 3);
                if (i2 >= 2) {
                    hMPeytoSettings.setAutoPause(((s >> 9) & 1) == 1);
                    hMPeytoSettings.setHrAlert(((s >> 10) & 1) == 1);
                    hMPeytoSettings.setPaceAlert(((s >> 11) & 1) == 1);
                    hMPeytoSettings.setDisAlert(((s >> 12) & 1) == 1);
                    hMPeytoSettings.setBrightness((s >> 13) & 7);
                }
                hMPeytoSettings.setWatchFaceType(data[3] & 255);
                if (i2 >= 3) {
                    hMPeytoSettings.setLanguage(data[4] & 255);
                } else {
                    i = 4;
                }
                int i3 = i + 1;
                int i4 = data[i] & 255;
                if (i4 > 0) {
                    ArrayList<HMPeytoSettings.AlarmSwitch> arrayList = new ArrayList<>(i4);
                    for (int i5 = 0; i5 < i4; i5++) {
                        byte b = data[i3 + i5];
                        arrayList.add(new HMPeytoSettings.AlarmSwitch(b & 15, ((b >> 4) & 1) == 1));
                    }
                    hMPeytoSettings.setAlarmSwitches(arrayList);
                }
                Debug.i("MiLiProProfile", "settings:" + hMPeytoSettings);
            }
        }
        return hMPeytoSettings;
    }

    public int getDeviceState() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{15});
        if (hMNotifyResponseSendECFCommand == null || !hMNotifyResponseSendECFCommand.isSuccess((byte) 15) || (data = hMNotifyResponseSendECFCommand.getData()) == null || data.length != 2) {
            return -1;
        }
        return ((data[1] & 255) << 8) | (data[0] & 255);
    }

    public ArrayList<Integer> getDialIds() {
        byte[] data;
        byte[] bArr = new byte[5];
        char c = 0;
        byte b = 6;
        bArr[0] = 6;
        bArr[1] = 36;
        bArr[2] = 0;
        bArr[3] = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        int i2 = 0;
        while (true) {
            bArr[4] = (byte) i;
            HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(bArr, 3);
            if (hMNotifyResponseSendECFCommand == null || !hMNotifyResponseSendECFCommand.isSuccess(b) || (data = hMNotifyResponseSendECFCommand.getData()) == null || data.length < 2) {
                break;
            }
            int i3 = data[c] & 255;
            int i4 = data[1] & 255;
            i2 += i4;
            for (int i5 = 0; i5 < i4; i5++) {
                int i6 = i5 * 4;
                arrayList.add(Integer.valueOf((data[i6 + 2] & 255) | ((data[i6 + 3] & 255) << 8) | ((data[i6 + 4] & 255) << 16) | ((data[i6 + 5] & 255) << 24)));
            }
            if (i2 >= i3) {
                break;
            }
            i++;
            c = 0;
            b = 6;
        }
        return arrayList;
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.EcfCmdProvider
    @NonNull
    public EcfController getEcfController() {
        if (this.g1 == null) {
            this.g1 = new EcfControllerImpl(new HMBleBluetoothCharacteristic(new a(new Function0() { // from class: r45
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return this.a.H0();
                }
            }), this), this);
        }
        return this.g1;
    }

    public String getGpsVersion() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{14});
        Debug.fi("MiLiProProfile", "getGpsVersion:" + hMNotifyResponseSendECFCommand);
        if (hMNotifyResponseSendECFCommand == null || !hMNotifyResponseSendECFCommand.isSuccess((byte) 14) || (data = hMNotifyResponseSendECFCommand.getData()) == null || data.length == 0) {
            return null;
        }
        if (data.length != 1) {
            return new String(data, Charset.forName("UTF-8"));
        }
        if ((data[0] & 255) == 255) {
            return EcgData.DEFAULT_DIGIT_VALUE;
        }
        return null;
    }

    public HeartRateData getHeartRateData() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseP0 = P0(new EcfCommand.Vendor(TimexVendorCmd.GetHeartRate.INSTANCE));
        if (hMNotifyResponseP0 == null || !hMNotifyResponseP0.isSuccess() || (data = hMNotifyResponseP0.getData()) == null || data.length != 4) {
            return null;
        }
        return new HeartRateData(data);
    }

    @androidx.annotation.Nullable
    public HidStatus getHidStatus() {
        if (w0()) {
            return this.settingsApi.getHidStatus();
        }
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.GattPeripheral
    public LEParams getLEParams() {
        BluetoothGattCharacteristic characteristic;
        byte[] bArr;
        BluetoothGattService service = getService(IBaseProfile.UUID_SERVICE_MILI_SERVICE);
        if (service == null || (characteristic = service.getCharacteristic(IBaseProfile.UUID_CHARACTERISTIC_PPCP)) == null || (bArr = read(characteristic)) == null || bArr.length != 8) {
            return null;
        }
        return new LEParams((bArr[0] & 255) | ((bArr[1] & 255) << 8), (bArr[2] & 255) | ((bArr[3] & 255) << 8), (bArr[4] & 255) | ((bArr[5] & 255) << 8), ((bArr[7] & 255) << 8) | (bArr[6] & 255));
    }

    public Boolean getLockStatus() {
        return this.settingsApi.getLockStatus();
    }

    @androidx.annotation.Nullable
    public MedicalRegisterVersion getMedicalRegVersion() {
        HMGenericResponse hMGenericResponseSendGenericCommand = sendGenericCommand(new HMGenericCommand(22));
        if (hMGenericResponseSendGenericCommand != null && hMGenericResponseSendGenericCommand.isCommandSuccess()) {
            byte[] bArrCommandResponseData = hMGenericResponseSendGenericCommand.commandResponseData();
            Debug.fi("MiLiProProfile", "medical register version info data = " + GattUtils.bytesToHexString(bArrCommandResponseData));
            if (bArrCommandResponseData != null && bArrCommandResponseData.length != 0) {
                return MedicalRegisterVersion.INSTANCE.parse(bArrCommandResponseData);
            }
        }
        return null;
    }

    public HMNBInfo getNBInfo(DeviceInfo deviceInfo) {
        return new HMNBInfo(getNbImei(false, deviceInfo), getNbImsi(), getNbVersion(false, deviceInfo));
    }

    public String getNbImei(boolean selfTest, @androidx.annotation.Nullable DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            deviceInfo = getDeviceInfo();
        }
        String str = "";
        if (!ProfileUtils.isValidFirmware(deviceInfo, "V1.0.7.30")) {
            return "";
        }
        byte b = selfTest ? (byte) 4 : (byte) 38;
        HMNotifyResponse hMNotifyResponseO0 = O0(selfTest ? new byte[]{b, 9} : new byte[]{b}, 1, 5000);
        if (hMNotifyResponseO0 != null && hMNotifyResponseO0.isSuccess(b)) {
            byte[] originResponseData = hMNotifyResponseO0.getOriginResponseData();
            if (originResponseData != null) {
                byte[] bArr = new byte[originResponseData.length - 3];
                System.arraycopy(originResponseData, 3, bArr, 0, originResponseData.length - 3);
                str = new String(bArr, StandardCharsets.UTF_8);
            }
            Debug.i("MiLiProProfile", "imei: " + str);
        }
        return str;
    }

    public String getNbImsi() {
        return "";
    }

    public String getNbVersion(boolean selfTest, @androidx.annotation.Nullable DeviceInfo deviceInfo) {
        if (deviceInfo == null) {
            deviceInfo = getDeviceInfo();
        }
        String str = "";
        if (!ProfileUtils.isValidFirmware(deviceInfo, "V1.0.7.30")) {
            return "";
        }
        byte b = selfTest ? (byte) 4 : (byte) 39;
        HMNotifyResponse hMNotifyResponseO0 = O0(selfTest ? new byte[]{b, 13} : new byte[]{b}, 1, 5000);
        if (hMNotifyResponseO0 != null && hMNotifyResponseO0.isSuccess(b)) {
            byte[] originResponseData = hMNotifyResponseO0.getOriginResponseData();
            if (originResponseData != null && originResponseData.length >= 7) {
                str = selfTest ? String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf(originResponseData[4] & 255), Integer.valueOf(originResponseData[5] & 255), Integer.valueOf(originResponseData[6] & 255), Integer.valueOf(originResponseData[7] & 255)) : String.format(Locale.US, "%d.%d.%d.%d", Integer.valueOf(originResponseData[3] & 255), Integer.valueOf(originResponseData[4] & 255), Integer.valueOf(originResponseData[5] & 255), Integer.valueOf(originResponseData[6] & 255));
            }
            Debug.i("MiLiProProfile", "nb ver: " + str);
        }
        return str;
    }

    public Boolean getOffWristLockState() {
        if (w0()) {
            return this.settingsApi.getOffWristLockState();
        }
        throw new IllegalStateException();
    }

    public PasswordInfo getPassword() {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{29});
        if (hMNotifyResponseSendECFCommand == null) {
            return null;
        }
        byte[] originResponseData = hMNotifyResponseSendECFCommand.getOriginResponseData();
        Debug.i("MiLiProProfile", "getPassword:" + GattUtils.bytesToHexString(originResponseData));
        if (originResponseData == null || originResponseData.length < 3 || originResponseData[0] != 16 || originResponseData[1] != 29) {
            return null;
        }
        byte b = originResponseData[2];
        if (b == 5) {
            return new PasswordInfo(1);
        }
        if (b != 1) {
            return null;
        }
        if (originResponseData.length == 4 && (originResponseData[3] & 255) == 0) {
            return new PasswordInfo(2);
        }
        if (originResponseData.length == 6 && (originResponseData[3] & 255) == 1) {
            return new PasswordInfo(0, String.format("%02x%02x", Byte.valueOf(originResponseData[5]), Byte.valueOf(originResponseData[4])));
        }
        return null;
    }

    public boolean getPressureSwitch() {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{-2, 6, 1}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) -2) && hMNotifyResponseSendECFCommand.getData().length > 0 && hMNotifyResponseSendECFCommand.getData()[0] == 1;
    }

    public ArrayList<HMReminderInfo> getReminders() {
        HMGenericResponse hMGenericResponseSendGenericCommand = sendGenericCommand(new HMGenericCommand(2));
        if (hMGenericResponseSendGenericCommand == null || !hMGenericResponseSendGenericCommand.isCommandSuccess()) {
            return null;
        }
        return HMReminderInfo.fromBytes(hMGenericResponseSendGenericCommand.commandResponseData());
    }

    public Integer getSkinId() {
        DialApi dialApiA0 = A0();
        Integer dialId = dialApiA0 == null ? null : dialApiA0.getDialId();
        Debug.fi("MiLiProProfile", "getSkinId:" + dialId + "; and dialApi is: " + dialApiA0);
        return dialId;
    }

    public Integer getSkinIdTimexVendor() {
        return E0(P0(new EcfCommand.Vendor(TimexVendorCmd.GetWatchSkinId.INSTANCE)));
    }

    @androidx.annotation.Nullable
    public SportItemDataConfig getSportDataConfig(int sportType) {
        HMGenericCommand hMGenericCommand = new HMGenericCommand(18);
        hMGenericCommand.setCommandExtend(GattUtils.shortToBytes((short) sportType));
        HMGenericResponse hMGenericResponseSendGenericCommand = sendGenericCommand(hMGenericCommand);
        if (hMGenericResponseSendGenericCommand == null || !hMGenericResponseSendGenericCommand.isCommandSuccess()) {
            return null;
        }
        return SportItemDataConfig.INSTANCE.parseFromRawData(hMGenericResponseSendGenericCommand.commandResponseData());
    }

    @androidx.annotation.Nullable
    public HMGenericResponse getSportTypeConfig() {
        return sendGenericCommand(new HMGenericCommand(17));
    }

    public HMStatisticInfo getStatisticInfo() {
        int i;
        byte[] data;
        byte[] data2;
        byte[] data3;
        HMStatisticInfo hMStatisticInfo = new HMStatisticInfo();
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{3, 1});
        if (hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 3) && (data3 = hMNotifyResponseSendECFCommand.getData()) != null && data3.length == 13 && data3[0] == 1) {
            Debug.i("MiLiProProfile", "response data:" + GattUtils.bytesToHexString(data3));
            int i2 = (data3[1] & 255) | ((data3[2] & 255) << 8) | ((data3[3] & 255) << 16) | ((data3[4] & 255) << 24);
            int i3 = (data3[5] & 255) | (data3[6] << 8);
            int i4 = (data3[7] & 255) | (data3[8] << 8);
            int i5 = (data3[9] & 255) | (data3[10] << 8);
            int i6 = (data3[12] << 8) | (data3[11] & 255);
            hMStatisticInfo.setUpTime(i2);
            hMStatisticInfo.setRebootCount(i3);
            hMStatisticInfo.setDisconnectCount(i4);
            hMStatisticInfo.setKeyCount(i5);
            hMStatisticInfo.setLiftWristCount(i6);
        }
        HMNotifyResponse hMNotifyResponseSendECFCommand2 = sendECFCommand(new byte[]{3, 2});
        if (hMNotifyResponseSendECFCommand2 != null && hMNotifyResponseSendECFCommand2.isSuccess((byte) 3) && (data2 = hMNotifyResponseSendECFCommand2.getData()) != null && data2.length == 17 && data2[0] == 2) {
            Debug.i("MiLiProProfile", "response data:" + GattUtils.bytesToHexString(data2));
            int i7 = (data2[1] & 255) | ((data2[2] & 255) << 8) | ((data2[3] & 255) << 16) | ((data2[4] & 255) << 24);
            int i8 = (data2[5] & 255) | ((data2[6] & 255) << 8) | ((data2[7] & 255) << 16) | ((data2[8] & 255) << 24);
            int i9 = ((data2[10] & 255) << 8) | (data2[9] & 255) | ((data2[11] & 255) << 16) | ((data2[12] & 255) << 24);
            int i10 = ((data2[16] & 255) << 24) | (data2[13] & 255) | ((data2[14] & 255) << 8) | ((data2[15] & 255) << 16);
            hMStatisticInfo.setVibrateTime(i7);
            hMStatisticInfo.setLcdTime(i8);
            hMStatisticInfo.setFlashTime(i9);
            hMStatisticInfo.setPpgTime(i10);
        }
        HMNotifyResponse hMNotifyResponseSendECFCommand3 = sendECFCommand(new byte[]{3, 3});
        if (hMNotifyResponseSendECFCommand3 != null && hMNotifyResponseSendECFCommand3.isSuccess((byte) 3) && (data = hMNotifyResponseSendECFCommand3.getData()) != null && data.length == 17 && data[0] == 3) {
            Debug.i("MiLiProProfile", "response data:" + GattUtils.bytesToHexString(data));
            int i11 = (data[1] & 255) | ((data[2] & 255) << 8) | ((data[3] & 255) << 16) | ((data[4] & 255) << 24);
            int i12 = (data[5] & 255) | ((data[6] & 255) << 8) | ((data[7] & 255) << 16) | ((data[8] & 255) << 24);
            int i13 = (data[9] & 255) | ((data[10] & 255) << 8) | ((data[11] & 255) << 16) | ((data[12] & 255) << 24);
            int i14 = ((data[16] & 255) << 24) | (data[13] & 255) | ((data[14] & 255) << 8) | ((data[15] & 255) << 16);
            hMStatisticInfo.setConnectionTime(i11);
            hMStatisticInfo.setPhoneNotifyCount(i12);
            hMStatisticInfo.setAppNotifyCount(i13);
            hMStatisticInfo.setResumeTime(i14);
        }
        HMNotifyResponse hMNotifyResponseSendECFCommand4 = sendECFCommand(new byte[]{3, 4});
        if (hMNotifyResponseSendECFCommand4 != null && hMNotifyResponseSendECFCommand4.isSuccess((byte) 3)) {
            byte[] data4 = hMNotifyResponseSendECFCommand4.getData();
            Debug.i("MiLiProProfile", "response data:" + GattUtils.bytesToHexString(data4));
            if (data4 != null && data4.length > 0 && data4[0] == 4) {
                if (data4.length >= 5) {
                    hMStatisticInfo.setAlgorithmTime((data4[1] & 255) | ((data4[2] & 255) << 8) | ((data4[3] & 255) << 16) | ((data4[4] & 255) << 24));
                    i = 5;
                } else {
                    i = 1;
                }
                if (data4.length == 9) {
                    int i15 = i + 1;
                    int i16 = i15 + 1;
                    hMStatisticInfo.setSedentarinessCount(((data4[i16 + 1] & 255) << 24) | (data4[i] & 255) | ((data4[i15] & 255) << 8) | ((data4[i16] & 255) << 16));
                }
            }
        }
        HMNotifyResponse hMNotifyResponseSendECFCommand5 = sendECFCommand(new byte[]{3, 5});
        if (hMNotifyResponseSendECFCommand5 != null && hMNotifyResponseSendECFCommand5.isSuccess((byte) 3)) {
            byte[] data5 = hMNotifyResponseSendECFCommand5.getData();
            Debug.i("MiLiProProfile", "response data:" + GattUtils.bytesToHexString(data5));
            if (data5 != null && data5.length > 0 && data5[0] == 5 && data5.length == 17) {
                int i17 = ((data5[2] & 255) << 8) | (data5[1] & 255) | ((data5[3] & 255) << 16) | ((data5[4] & 255) << 24);
                int i18 = (data5[5] & 255) | ((data5[6] & 255) << 8) | ((data5[7] & 255) << 16) | ((data5[8] & 255) << 24);
                int i19 = (data5[9] & 255) | ((data5[10] & 255) << 8) | ((data5[11] & 255) << 16) | ((data5[12] & 255) << 24);
                int i20 = ((data5[16] & 255) << 24) | ((data5[15] & 255) << 16) | ((data5[14] & 255) << 8) | (data5[13] & 255);
                hMStatisticInfo.setReconnectCount1(i17);
                hMStatisticInfo.setReconnectCount2(i18);
                hMStatisticInfo.setReconnectCount3(i19);
                hMStatisticInfo.setReconnectCount4(i20);
            }
        }
        return hMStatisticInfo;
    }

    public boolean getStorageState(long dialSize, long dialId) {
        DialApi dialApiA0 = A0();
        boolean storageState = dialApiA0 == null ? false : dialApiA0.getStorageState((int) dialId, dialSize);
        Debug.fi("MiLiProProfile", "getStorageState:result:" + storageState);
        return storageState;
    }

    public int getSwimLogSwitch() {
        if (w0()) {
            return this.settingsApi.getSwimLogSwitch();
        }
        return -1;
    }

    public HMTarget getTargets() {
        if (w0()) {
            return this.settingsApi.getTargets();
        }
        return null;
    }

    public List<Integer> getWatchFacesAll() {
        DialApi dialApiA0 = A0();
        List<Integer> arrayList = dialApiA0 == null ? new ArrayList<>() : dialApiA0.getAllWatchFaceIds();
        Debug.fi("MiLiProProfile", "getWatchFacesAll Ids: " + ArraysUtil.toString(arrayList));
        return arrayList;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile, com.xiaomi.hm.health.bt.gatt.GattPeripheral
    public boolean initCharacteristics() {
        super.initCharacteristics();
        UUID uuid = IBaseProfile.UUID_SERVICE_MILI_SERVICE;
        BluetoothGattService service = getService(uuid);
        if (service == null) {
            Debug.fi("MiLiProProfile", uuid + " is null!");
            return false;
        }
        UUID uuid2 = IMiLiProProfile.UUID_CHARACTERISTIC_BATTERY;
        BluetoothGattCharacteristic characteristic = service.getCharacteristic(uuid2);
        this.m_CharBattery = characteristic;
        if (characteristic == null) {
            Debug.fi("MiLiProProfile", uuid2 + " is null!");
            return false;
        }
        UUID uuid3 = IMiLiProProfile.UUID_CHARACTERISTIC_REALTIME_STEPS;
        BluetoothGattCharacteristic characteristic2 = service.getCharacteristic(uuid3);
        this.m_CharRealtimeSteps = characteristic2;
        if (characteristic2 == null) {
            Debug.fi("MiLiProProfile", uuid3 + " is null!");
            return false;
        }
        UUID uuid4 = IMiLiProProfile.UUID_CHARACTERISTIC_CONTROL_POINT;
        BluetoothGattCharacteristic characteristic3 = service.getCharacteristic(uuid4);
        this.e1 = characteristic3;
        if (characteristic3 != null) {
            return true;
        }
        Debug.fi("MiLiProProfile", uuid4 + " is null!");
        return false;
    }

    @androidx.annotation.Nullable
    public HMOtherVersion initOtherVersion(HMDeviceSource source) {
        if (w0()) {
            return this.settingsApi.getDeviceInfoSync(source);
        }
        return null;
    }

    public boolean isContactShow(HMAlertMode mode) {
        if (w0()) {
            return this.settingsApi.isContactShow(mode);
        }
        return false;
    }

    public boolean isMultiLinkBond() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{37});
        return (hMNotifyResponseSendECFCommand == null || !hMNotifyResponseSendECFCommand.isSuccess((byte) 37) || (data = hMNotifyResponseSendECFCommand.getData()) == null || data.length == 0 || data[0] != 1) ? false : true;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile
    public BatteryInfo parseBatteryInfo(byte[] value) {
        Debug.fi("MiLiProProfile", "parseBatteryInfo:" + GattUtils.bytesToHexString(value));
        return BatteryInfo.parseBatteryInfo(value);
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile
    public RealtimeStep parseRealtimeStep(byte[] value) {
        if (value != null && value.length >= 5) {
            return RealtimeStep.parseFrom(value);
        }
        Debug.fi("MiLiProProfile", "parseRealtimeStep failed as wrong value : " + GattUtils.bytesToHexString(value));
        return null;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.GattPeripheral
    public boolean patchWrite(byte[] data, int profileType) {
        return preHandlePieceData(data, profileType) ? postHandlePieceData(data, profileType) : super.patchWrite(data, profileType);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.EcfCmdProvider
    public boolean patchWriteEcf(byte[] data, int profileType) {
        return patchWrite(data, profileType);
    }

    public boolean phoneMute(byte state) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{6, 25, 0, state}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    @Override // com.huami.bluetooth.profile.ecf.ECFInterceptor
    @Nullable
    public HMNotifyResponse postHandleECF(@NotNull byte[] cmd, int cmdLen) {
        ObsoleteModule obsoleteModule = (ObsoleteModule) getChannelModule(ObsoleteModule.class);
        if (obsoleteModule == null) {
            return null;
        }
        return obsoleteModule.getObsoleteApi().sendECFCommand(cmd, cmdLen);
    }

    @Override // com.huami.bluetooth.profile.ecf.GenericInterceptor
    @Nullable
    public HMGenericResponse postHandleGenericData(@NotNull HMGenericCommand command) {
        ObsoleteModule obsoleteModule = (ObsoleteModule) getChannelModule(ObsoleteModule.class);
        if (obsoleteModule == null) {
            return null;
        }
        return obsoleteModule.getObsoleteApi().sendGenericCommand(command);
    }

    @Override // com.huami.bluetooth.profile.ecf.PieceDataInterceptor
    public boolean postHandlePieceData(@NotNull byte[] data, int type) {
        ObsoleteModule obsoleteModule = (ObsoleteModule) getChannelModule(ObsoleteModule.class);
        if (obsoleteModule == null) {
            return false;
        }
        return obsoleteModule.getObsoleteApi().sendPieceData(data, type);
    }

    @Override // com.huami.bluetooth.profile.ecf.ECFInterceptor
    public boolean preHandleECF(@NotNull byte[] cmd) {
        byte b = cmd[0];
        if (b == 4 || b == 17 || b == 12 || b == 31 || b == 33) {
            return false;
        }
        return supportModule(144);
    }

    @Override // com.huami.bluetooth.profile.ecf.GenericInterceptor
    public boolean preHandleGenericData(@NotNull HMGenericCommand command) {
        return supportModule(144);
    }

    @Override // com.huami.bluetooth.profile.ecf.PieceDataInterceptor
    public boolean preHandlePieceData(@NotNull byte[] data, int type) {
        return supportModule(144);
    }

    public Object readSpo2() {
        byte[] data;
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{-2, 5, 1}, 3);
        if (hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) -2) && (data = hMNotifyResponseSendECFCommand.getData()) != null) {
            if (data.length == 1) {
                return Boolean.valueOf(data[0] == 1);
            }
        }
        return null;
    }

    public boolean removeCoachingWorkout(int index, long workoutId) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(index);
        try {
            byteArrayOutputStream.write(GattUtils.numberToBytes(workoutId, 8));
            byteArrayOutputStream.write(2);
            return R0(byteArrayOutputStream.toByteArray());
        } catch (Exception e) {
            Debug.e("MiLiProProfile", "removeCoachingWorkout error:", e);
            return false;
        }
    }

    public int replaceDial(int src, int dest, int destSize) {
        DialApi dialApiA0 = A0();
        int iReplaceDial = dialApiA0 == null ? -1 : dialApiA0.replaceDial(src, dest, destSize);
        Debug.fi("MiLiProProfile", "replaceDial:code:" + iReplaceDial);
        return iReplaceDial;
    }

    public boolean reset() {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{6, 11, 0, 1}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    public HMChaohuTestInfo selfTest() {
        byte[] originResponseData;
        HMNotifyResponse hMNotifyResponseO0 = O0(new byte[]{4, 1}, 1, 20000);
        if (hMNotifyResponseO0 == null || !hMNotifyResponseO0.isSuccess((byte) 4) || (originResponseData = hMNotifyResponseO0.getOriginResponseData()) == null || originResponseData.length != 14) {
            return null;
        }
        byte[] bArr = new byte[originResponseData.length - 4];
        System.arraycopy(originResponseData, 4, bArr, 0, originResponseData.length - 4);
        return N0(bArr);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.EcfCmdProvider
    public boolean sendECFCommand(Request.Command cmd, byte[] data) {
        HMNotifyResponse hMNotifyResponseQ0 = Q0(cmd, data);
        return hMNotifyResponseQ0 != null && hMNotifyResponseQ0.isSuccess();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.EcfCmdProvider
    public HMGenericResponse sendGenericCommand(HMGenericCommand command) {
        synchronized (EcfController.INSTANCE.getEcfLock()) {
            if (preHandleGenericData(command)) {
                return postHandleGenericData(command);
            }
            return HMGenericProfile.write(this, this.e1, command);
        }
    }

    public boolean sendLoc(int longitude, int latitude, int altitude) {
        HMNotifyResponse hMNotifyResponseSendLocWithResponse = sendLocWithResponse(longitude, latitude, altitude);
        return hMNotifyResponseSendLocWithResponse != null && hMNotifyResponseSendLocWithResponse.isSuccess((byte) 6);
    }

    public HMNotifyResponse sendLocWithResponse(int longitude, int latitude, int altitude) {
        return sendECFCommand(new byte[]{6, 50, 0, (byte) (longitude & 255), (byte) ((longitude >> 8) & 255), (byte) ((longitude >> 16) & 255), (byte) ((longitude >> 24) & 255), (byte) (latitude & 255), (byte) ((latitude >> 8) & 255), (byte) ((latitude >> 16) & 255), (byte) ((latitude >> 24) & 255), (byte) (altitude & 255), (byte) ((altitude >> 8) & 255), (byte) ((altitude >> 16) & 255), (byte) ((altitude >> 24) & 255)}, 3);
    }

    public boolean sendUpgradeInfo(List<HMFirmwareInfo> firmwares) {
        if (firmwares == null || firmwares.isEmpty()) {
            return true;
        }
        long fileSize = 0;
        Iterator<HMFirmwareInfo> it2 = firmwares.iterator();
        while (it2.hasNext()) {
            fileSize += it2.next().getFileSize();
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int size = firmwares.size();
        int i = 0;
        int iV0 = 0;
        while (i < size) {
            HMFirmwareInfo hMFirmwareInfo = firmwares.get(i);
            byteArrayOutputStream.write(hMFirmwareInfo.getFwType().getValue());
            iV0 = i == size + (-1) ? 100 : iV0 + v0(hMFirmwareInfo, fileSize);
            byteArrayOutputStream.write(iV0);
            i++;
        }
        return sendECFCommand(new EcfCommand.Extend(ExtendCmd.SetOtaProgress.INSTANCE), byteArrayOutputStream.toByteArray());
    }

    public boolean setAccessInfo(HMAccessInfo info) {
        if (info == null) {
            return false;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int aidLen = info.getAidLen();
            byte[] aid = info.getAid();
            String name = info.getName();
            byteArrayOutputStream.write(27);
            byteArrayOutputStream.write(aidLen);
            if (aidLen > 0) {
                byteArrayOutputStream.write(aid);
            }
            if (!TextUtils.isEmpty(name)) {
                byteArrayOutputStream.write(name.getBytes());
            }
            byteArrayOutputStream.write(0);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (isSupportPatchWrite()) {
                return patchWrite(byteArray, 2);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public boolean setActivityMode(int mode) {
        return this.settingsApi.setActivityMode(mode);
    }

    public boolean setActivityTarget(boolean remind, long activity) {
        return this.settingsApi.setActivityTarget(remind, activity);
    }

    public boolean setAdReminder(AdReminder reminder) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(40);
            byteArrayOutputStream.write(reminder.toBleBytes());
            boolean zPatchWrite = patchWrite(byteArrayOutputStream.toByteArray(), 2);
            Debug.fi("MiLiProProfile", "setAdReminder: " + zPatchWrite);
            return zPatchWrite;
        } catch (Exception e) {
            Debug.fi("MiLiProProfile", "setAdReminder: " + e.toString());
            return false;
        }
    }

    public boolean setAdvParam(short min, short max) {
        if (this.e1 == null) {
            return false;
        }
        byte[] bArr = {1, (byte) (min & 255), (byte) ((min >> 8) & 255), (byte) (max & 255), (byte) ((max >> 8) & 255)};
        Debug.i("MiLiProProfile", "cmd:" + GattUtils.bytesToHexString(bArr));
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(bArr);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 1);
    }

    public boolean setAidInfo(HMAidInfo aidInfo) {
        if (aidInfo == null) {
            return false;
        }
        int aidLen = aidInfo.getAidLen();
        byte[] bArr = new byte[aidLen + 6];
        bArr[0] = 6;
        bArr[1] = 28;
        bArr[2] = 0;
        bArr[3] = (byte) aidInfo.getOp();
        bArr[4] = (byte) aidInfo.getType();
        bArr[5] = (byte) aidLen;
        if (aidLen > 0) {
            System.arraycopy(aidInfo.getAid(), 0, bArr, 6, aidLen);
        }
        return isSupportPatchWrite() && patchWrite(bArr, 2);
    }

    public boolean setAlarm(AlarmClockExt alarmClock) {
        byte[] bytes = alarmClock.getBytes();
        byte[] bArr = {2, bytes[0], bytes[1], bytes[2], bytes[3]};
        Debug.i("MiLiProProfile", "cmd:" + GattUtils.bytesToHexString(bArr));
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(bArr);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 2);
    }

    public boolean setAutoBlacklight(HMAutoBacklightInfo info) {
        if (info != null && w0()) {
            return this.settingsApi.setNightMode(info);
        }
        return false;
    }

    public void setAutoOtaAtNightSwitch(boolean open) {
        if (w0()) {
            this.settingsApi.setAutoOtaAtNightSwitch(open);
        }
    }

    public boolean setBeepSettings(List<BeepItem> beepItems) {
        if (beepItems != null && beepItems.size() != 0) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(60);
            try {
                for (BeepItem beepItem : beepItems) {
                    byteArrayOutputStream.write(GattUtils.numberToBytes(beepItem.getType(), 2));
                    byteArrayOutputStream.write(beepItem.getSwitchState());
                }
                return patchWrite(byteArrayOutputStream.toByteArray(), 2);
            } catch (IOException unused) {
            }
        }
        return false;
    }

    public boolean setButtonIgnore(boolean z) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{6, 9, 0, z ? (byte) 1 : (byte) 0}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    public boolean setCalorieGoal(int goal) {
        boolean z = false;
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{-2, 4, 0, (byte) (goal & 255), (byte) ((goal >> 8) & 255), (byte) ((goal >> 16) & 255), (byte) ((goal >> 24) & 255)}, 3);
        if (hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) -2)) {
            z = true;
        }
        Debug.fi("MiLiProProfile", "Set Calorie [" + goal + "], Success: " + z);
        return z;
    }

    public boolean setCalorieTarget(boolean remind, long calorie) {
        if (w0()) {
            return this.settingsApi.setCalorieTarget(remind, calorie);
        }
        return false;
    }

    public boolean setCoachingWorkout(HMCoachingWorkout workout, int index, boolean isUpdate) {
        if (workout == null) {
            return false;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(index);
        try {
            byteArrayOutputStream.write(GattUtils.numberToBytes(workout.getId(), 8));
            byteArrayOutputStream.write(isUpdate ? 1 : 0);
            byteArrayOutputStream.write(workout.getBytes());
            return R0(byteArrayOutputStream.toByteArray());
        } catch (Exception e) {
            Debug.e("MiLiProProfile", "setCoachingWorkout error:", e);
            return false;
        }
    }

    public boolean setCustomVibrate(HMVibrateInfo vibrateInfo) {
        try {
            Debug.fi("MiLiProProfile", "vibrateInfo: " + vibrateInfo);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(32);
            byteArrayOutputStream.write(vibrateInfo.toBleBytes());
            boolean zPatchWrite = patchWrite(byteArrayOutputStream.toByteArray(), 2);
            Debug.fi("MiLiProProfile", "setCustomVibrate: " + zPatchWrite);
            return zPatchWrite;
        } catch (Exception e) {
            Debug.fi("MiLiProProfile", "setCustomVibrate: " + e.toString());
            return false;
        }
    }

    public boolean setDateFormat(String format) {
        if (w0()) {
            return this.settingsApi.setDateDisplayStyle(format);
        }
        return false;
    }

    public boolean setDialDefaultColor(int colorId) {
        DialApi dialApiA0 = A0();
        final boolean z = dialApiA0 != null && dialApiA0.setDialDefaultColor(colorId);
        HMLog.info("MiLiProProfile", new Function0() { // from class: s45
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MiLiProProfile.L0(z);
            }
        });
        return z;
    }

    public boolean setDisconnectRemind(HMDisconnectRemindConfig config) {
        if (w0()) {
            return this.settingsApi.setDisconnectRemind(config);
        }
        return false;
    }

    public boolean setDisplayData(List<HMDisplayData> displayDatas) {
        if (displayDatas == null || displayDatas.size() == 0) {
            return false;
        }
        byte[] bArr = new byte[(displayDatas.size() * 2) + 1];
        bArr[0] = 16;
        int i = 1;
        for (HMDisplayData hMDisplayData : displayDatas) {
            int i2 = i + 1;
            bArr[i] = (byte) ((hMDisplayData.getIndex() & 15) | (hMDisplayData.isEnable() ? 128 : 0));
            i = i2 + 1;
            bArr[i2] = hMDisplayData.getType();
        }
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(bArr);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 16);
    }

    public boolean setDisplayItem(HMProDisplayItem item) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{6, 4, 0, item.getValue()}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    public boolean setDisplaySetting(DisplaySetting setting) {
        byte[] bleBytes = setting.toBleBytes();
        byte[] bArr = new byte[bleBytes.length + 1];
        bArr[0] = 10;
        System.arraycopy(bleBytes, 0, bArr, 1, bleBytes.length);
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(bArr);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 10);
    }

    public boolean setDisplaySettingByTimexVendor(DisplaySetting setting) {
        return sendECFCommand(new EcfCommand.Vendor(TimexVendorCmd.SetDisplaySetting.INSTANCE), setting.toBleBytes());
    }

    public boolean setDisplayType(byte type) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{6, 10, 0, type}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    public boolean setDistanceTarget(boolean remind, long distance) {
        if (w0()) {
            return this.settingsApi.setDistanceTarget(remind, distance);
        }
        return false;
    }

    public boolean setEntranceAvailability(boolean showXiaoai, boolean xiaoaiAvailable, boolean showNfc, boolean nfcAvailable, boolean showBankCard, boolean bankCardAvailable, boolean showBusDoorCard, boolean busDoorCardAvailable) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(53);
        byteArrayOutputStream.write(0);
        byte b = showXiaoai ? (byte) 1 : (byte) 0;
        if (xiaoaiAvailable) {
            b = (byte) (b | 2);
        }
        byteArrayOutputStream.write(b);
        byteArrayOutputStream.write(1);
        byte b2 = showNfc ? (byte) 1 : (byte) 0;
        if (nfcAvailable) {
            b2 = (byte) (b2 | 2);
        }
        byteArrayOutputStream.write(b2);
        byteArrayOutputStream.write(2);
        byte b3 = showBankCard ? (byte) 1 : (byte) 0;
        if (bankCardAvailable) {
            b3 = (byte) (b3 | 2);
        }
        byteArrayOutputStream.write(b3);
        byteArrayOutputStream.write(3);
        byte b4 = showBusDoorCard ? (byte) 1 : (byte) 0;
        if (busDoorCardAvailable) {
            b4 = (byte) (b4 | 2);
        }
        byteArrayOutputStream.write(b4);
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        boolean zPatchWrite = patchWrite(byteArray, 2);
        Debug.fi("MiLiProProfile", "setEntranceAvailability: " + GattUtils.bytesToHexString(byteArray) + ", ret: " + zPatchWrite);
        return zPatchWrite;
    }

    public boolean setHRZone(HRZone zone) {
        return sendECFCommand(new EcfCommand.Vendor(TimexVendorCmd.SetHrZone.INSTANCE), zone.getBytes());
    }

    public boolean setHeartRateZone(byte type, byte[] percents, byte[] zones, byte restHR) {
        if (w0()) {
            return this.settingsApi.setHeartRateZoneSync(type, percents, zones, restHR);
        }
        return false;
    }

    public boolean setHidStatus(HidStatus status) {
        if (status != null && w0()) {
            return this.settingsApi.setHidStatus(status);
        }
        return false;
    }

    public boolean setHrReminder(HMHrReminder reminder) {
        if (w0()) {
            return this.settingsApi.setHighHrReminder(reminder);
        }
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.gatt.GattPeripheral
    public boolean setLEParams(int connIntMin, int connIntMax, int latency, int timeout, int advInt) {
        BluetoothGattCharacteristic characteristic;
        BluetoothGattService service = getService(IBaseProfile.UUID_SERVICE_MILI_SERVICE);
        if (service == null || (characteristic = service.getCharacteristic(IBaseProfile.UUID_CHARACTERISTIC_PPCP)) == null) {
            return false;
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        if (!registerNotification(characteristic, new IGattCallback.INotifyCallback() { // from class: p45
            @Override // com.xiaomi.hm.health.bt.gatt.IGattCallback.INotifyCallback
            public final void notify(byte[] bArr) {
                this.a.M0(atomicBoolean, countDownLatch, bArr);
            }
        })) {
            return false;
        }
        if (write(characteristic, new byte[]{(byte) (connIntMin & 255), (byte) ((connIntMin >> 8) & 255), (byte) (connIntMax & 255), (byte) ((connIntMax >> 8) & 255), (byte) (latency & 255), (byte) ((latency >> 8) & 255), (byte) (timeout & 255), (byte) ((timeout >> 8) & 255)})) {
            try {
                countDownLatch.await(5000L, TimeUnit.MILLISECONDS);
            } catch (Exception unused) {
            }
        }
        unregisterNotification(characteristic);
        return atomicBoolean.get();
    }

    public boolean setLanguage(HMLanguage language) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{6, ECF_WRITE_PAI_DATA, 0, (byte) language.getLanguage()}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    public boolean setLanguageNew(String lang) {
        Debug.fi("MiLiProProfile", "setLanguageNew:" + lang);
        if (TextUtils.isEmpty(lang)) {
            return false;
        }
        int length = lang.getBytes().length;
        byte[] bArr = new byte[length + 3];
        bArr[0] = 6;
        bArr[1] = 23;
        bArr[2] = 0;
        System.arraycopy(lang.getBytes(), 0, bArr, 3, length);
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(bArr, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    public boolean setLiftWristSensitivity(byte sensitivity) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{6, 35, 0, sensitivity}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    public Boolean setLiftWristTouch(LiftWristTouch liftWristTouch) {
        return Boolean.valueOf(sendECFCommand(new EcfCommand.Vendor(TimexVendorCmd.SetLiftWristTouch.INSTANCE), liftWristTouch.getBytes()));
    }

    public boolean setLongPressKey(int key) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{6, 17, 0, (byte) key}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    public boolean setMileageUnit(boolean isMetric) {
        if (w0()) {
            return this.settingsApi.setMileageUnit(isMetric);
        }
        return false;
    }

    public boolean setMultiGoal(@NonNull final List<ActivityGoal> goals) {
        return sendECFCommand(new EcfCommand.TwoWay(TwoWayCmd.GoalAndReminder.INSTANCE), ActivityGoalKt.toBytes(goals));
    }

    public boolean setMultiGoalEcfExtend(@NonNull final List<ActivityGoal> goals) {
        return sendECFCommand(new EcfCommand.Extend(ExtendCmd.SetActivityGoal.INSTANCE), ActivityGoalKt.toEcfExtendBytes(goals));
    }

    public boolean setNegativeScreen(HMNegativeScreen screen) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{6, 21, 0, screen.getValue()}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    public boolean setNowTimeConfig(@NonNull NowTimeConfig config) {
        if (w0()) {
            return this.settingsApi.setHourlyAnnounceSwitch(config);
        }
        return false;
    }

    public boolean setOtherCalendar(byte calendar) {
        if (w0()) {
            return this.settingsApi.setOtherCalendar(calendar);
        }
        return false;
    }

    @Override // com.huami.bluetooth.profile.channel.module.pb.PBApi
    public boolean setPBInfos(List<? extends SmartWatchProfile.BlePBInfo> pbInfos, boolean isFull) {
        ByteBuffer byteBufferPut = ByteBuffer.allocate((pbInfos.size() * 14) + 1).order(ByteOrder.LITTLE_ENDIAN).put((byte) 0);
        byteBufferPut.put(PBUtils.INSTANCE.pbList2Bytes(pbInfos));
        byte[] bArrArray = byteBufferPut.array();
        boolean zPatchWrite = patchWrite(bArrArray, isFull ? 46 : 47);
        Log.d("MiLiProProfile", "Set PB: " + ArraysUtil.toString(pbInfos) + ", Data: " + BytesUtil.log(bArrArray) + ", Success: " + zPatchWrite, new Object[0]);
        return zPatchWrite;
    }

    public boolean setPages(Feature feature, List<PageItem> pages) {
        if (pages == null || pages.size() == 0) {
            return false;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(30);
        for (PageItem pageItem : pages) {
            if (x0(feature, pageItem)) {
                byteArrayOutputStream.write(pageItem.getIndex());
                byteArrayOutputStream.write(pageItem.getFlag());
                byteArrayOutputStream.write(pageItem.getParentType());
                byteArrayOutputStream.write(pageItem.getCurrentType());
            }
        }
        return patchWrite(byteArrayOutputStream.toByteArray(), 2);
    }

    public boolean setPressureSwitch(boolean z) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{-2, 6, 0, z ? (byte) 1 : (byte) 0}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) -2);
    }

    public boolean setRecordStep(int step) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{6, 7, 0, (byte) (step & 255), (byte) ((step >> 8) & 255), (byte) ((step >> 16) & 255), (byte) ((step >> 24) & 255)}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    public boolean setReminder(HMReminderInfo info, int version) {
        if (info == null) {
            return false;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byteArrayOutputStream.write(11);
            byteArrayOutputStream.write(info.toBleBytes(version));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            if (isSupportPatchWrite()) {
                return patchWrite(byteArray, 2);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public boolean setSedentary(HMSedentaryConfig config) {
        boolean z = false;
        if (config == null) {
            return false;
        }
        byte[] bArr = {8, config.isEnable(), (byte) (config.getInterval() & 255), (byte) ((config.getInterval() >> 8) & 255), config.getStartHour(), config.getStartMinutes(), config.getStopHour(), config.getStopMinutes(), config.getStartHour2(), config.getStartMinutes2(), config.getStopHour2(), config.getStopMinutes2()};
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(bArr);
        if (hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 8)) {
            z = true;
        }
        Debug.fi("MiLiProProfile", "setSedentaryRemind cmd = " + GattUtils.bytesToHexString(bArr) + "; result = " + z);
        return z;
    }

    public boolean setSilent(HMSilentConfig config) {
        if (w0()) {
            return this.settingsApi.setSilent(config);
        }
        return false;
    }

    public boolean setSportRemindConfig(SportRemindConfig config) {
        if (w0()) {
            return this.settingsApi.setSportRemindConfig(config);
        }
        return false;
    }

    public boolean setStandAlertConfig(@NonNull StandAlertConfig config) {
        if (w0()) {
            return this.settingsApi.setStandAlertConfig(config);
        }
        return false;
    }

    public boolean setStandTarget(boolean remind, long stand) {
        return this.settingsApi.setStandTarget(remind, stand);
    }

    public boolean setStartDayOfWeek(byte dayOfWeek) {
        if (w0()) {
            return this.settingsApi.setWeeklyStartTime(dayOfWeek);
        }
        return false;
    }

    public boolean setStepTarget(boolean remind, long step) {
        if (!w0()) {
            return false;
        }
        SettingsModule settingsModule = (SettingsModule) getChannelModule(SettingsModule.class);
        return this.settingsApi.setStepTarget(remind, step, settingsModule != null ? settingsModule.getVersion() : null);
    }

    public boolean setTargets(HMTarget target) {
        Debug.fi("MiLiProProfile", "setTargets: " + target);
        if (!w0()) {
            return false;
        }
        SettingsModule settingsModule = (SettingsModule) getChannelModule(SettingsModule.class);
        return this.settingsApi.setTargets(target, settingsModule != null ? settingsModule.getVersion() : null);
    }

    public boolean setTimeUnit(boolean is12Hour) {
        if (w0()) {
            return this.settingsApi.setTimeFormat(is12Hour);
        }
        return false;
    }

    public Boolean setTouchScreen(Touchscreen touchScreen) {
        return Boolean.valueOf(sendECFCommand(new EcfCommand.Vendor(TimexVendorCmd.SetTouchScreen.INSTANCE), touchScreen.getBytes()));
    }

    public boolean setUnwearPassword(boolean z, String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(6);
        byteArrayOutputStream.write(33);
        byteArrayOutputStream.write(0);
        byteArrayOutputStream.write(z ? 1 : 0);
        if (!TextUtils.isEmpty(str)) {
            byteArrayOutputStream.write(str.getBytes(), 0, str.getBytes().length);
        }
        byteArrayOutputStream.write(0);
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(byteArrayOutputStream.toByteArray(), 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    public boolean setWatchFace(int watchFaceId) {
        DialApi dialApiA0 = A0();
        boolean dialId = dialApiA0 == null ? false : dialApiA0.setDialId(watchFaceId);
        Debug.fi("MiLiProProfile", "Set WatchFace [" + watchFaceId + "], Success: " + dialId);
        return dialId;
    }

    public boolean setWeixinId(byte[] weixinId) {
        if (weixinId == null || weixinId.length != 16) {
            return false;
        }
        byte[] bArr = new byte[17];
        bArr[0] = 7;
        System.arraycopy(weixinId, 0, bArr, 1, 16);
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(bArr);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 7);
    }

    @Deprecated
    public boolean setWorldTime(List<WorldTime> worldTimes) {
        if (worldTimes == null || worldTimes.size() == 0) {
            return false;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byteArrayOutputStream.write(54);
        Iterator<WorldTime> it2 = worldTimes.iterator();
        while (it2.hasNext()) {
            try {
                byteArrayOutputStream.write(it2.next().getByteArray());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return patchWrite(byteArrayOutputStream.toByteArray(), 2);
    }

    public boolean showContact(HMAlertMode mode, boolean show) {
        if (w0()) {
            return this.settingsApi.showContactSync(mode, show);
        }
        return false;
    }

    public boolean sportCalibrate(SportCalibrateInfo info) {
        if (info == null) {
            return false;
        }
        int startTimestamp = info.getStartTimestamp();
        int step = info.getStep();
        int distance = info.getDistance();
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{20, (byte) info.getSportType().getValue(), (byte) (startTimestamp & 255), (byte) ((startTimestamp >> 8) & 255), (byte) ((startTimestamp >> 16) & 255), (byte) ((startTimestamp >> 24) & 255), (byte) info.getStartTimezone(), (byte) (step & 255), (byte) ((step >> 8) & 255), (byte) ((step >> 16) & 255), (byte) ((step >> 24) & 255), (byte) (distance & 255), (byte) ((distance >> 8) & 255), (byte) ((distance >> 16) & 255), (byte) ((distance >> 24) & 255)});
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 20);
    }

    public boolean stopDevice() {
        if (w0()) {
            return this.settingsApi.stopDevice();
        }
        return false;
    }

    public boolean switchSpo2(boolean z) {
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{-2, 5, 0, z ? (byte) 1 : (byte) 0}, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) -2);
    }

    @Override // com.xiaomi.hm.health.bt.gatt.GattPeripheral
    public boolean sync() {
        return false;
    }

    @Override // com.xiaomi.hm.health.bt.profile.base.BaseProfile
    public void updateExternalDeviceInfo(@androidx.annotation.Nullable DeviceInfo realInfo) {
        if (realInfo == null) {
            return;
        }
        HMDeviceSource deviceSource = realInfo.getDeviceSource();
        G0(realInfo);
        HMOtherVersion hMOtherVersionInitOtherVersion = initOtherVersion(realInfo.getDeviceSource());
        realInfo.setOtherVersion(hMOtherVersionInitOtherVersion);
        if (ProxyContainer.getDeviceFeature().hasFeatureGPS(deviceSource)) {
            if (hMOtherVersionInitOtherVersion == null || !(this.settingsApi instanceof SettingsImpl)) {
                realInfo.setGpsVersionStr(getGpsVersion());
            } else {
                realInfo.setGpsVersionStr(hMOtherVersionInitOtherVersion.getGpsVersion());
            }
        }
        if (Build.VERSION.SDK_INT >= 24 && HMBleConfig.SUPPORT_UPDATE_MTU) {
            int iC0 = C0();
            Debug.fi("MiLiProProfile", "ATT MTU size:" + iC0);
            getMtu().setAttMtuSize(iC0);
        }
        new AGpsFeatureInit().initAGpsFeature(this, realInfo);
        if (HMDeviceFeature.hasFeatureJHS(deviceSource)) {
            try {
                realInfo.setMedicalRegVersion(getMedicalRegVersion());
            } catch (Exception unused) {
                Debug.fi("MiLiProProfile", "Get medical version failed");
            }
        }
    }

    public boolean writePaiData(HMPaiData data) {
        try {
            if (!supportModule(34)) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                byteArrayOutputStream.write(59);
                byteArrayOutputStream.write(data.getWriteBytes());
                return patchWrite(byteArrayOutputStream.toByteArray(), 2);
            }
            PaiModule paiModule = (PaiModule) getChannelModule(PaiModule.class);
            if (paiModule != null) {
                return paiModule.setPai(data);
            }
            Debug.fi("MiLiProProfile", "PaiModule is null");
            return false;
        } catch (Exception e) {
            Debug.fi("MiLiProProfile", "writePaiData exception:" + e.getMessage());
            return false;
        }
    }

    public DataCollect getCollectData(Calendar time, short ecfCmd) {
        byte[] data;
        short s = (short) time.get(1);
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(new byte[]{6, (byte) (ecfCmd & 255), (byte) ((ecfCmd >> 8) & 255), (byte) (s & 255), (byte) ((s >> 8) & 255), (byte) (time.get(2) + 1), (byte) time.get(5), (byte) time.get(11), (byte) time.get(12), (byte) time.get(13), (byte) ProfileUtils.getTimezoneKey(time.getTimeZone())});
        if (hMNotifyResponseSendECFCommand == null || !hMNotifyResponseSendECFCommand.isSuccess((byte) 6, ecfCmd) || (data = hMNotifyResponseSendECFCommand.getData()) == null || data.length < 10) {
            return null;
        }
        Debug.i("MiLiProProfile", "getCollectData = " + GattUtils.bytesToHexString(data));
        return new DataCollect(data);
    }

    public boolean enableWristBright(HMLiftWristConfig hMLiftWristConfig) {
        byte[] bArr = new byte[8];
        bArr[0] = 6;
        bArr[1] = 5;
        bArr[2] = 0;
        bArr[3] = hMLiftWristConfig.isEnable() ? (byte) 1 : (byte) 0;
        if (hMLiftWristConfig.isAllDay()) {
            bArr[4] = 0;
            bArr[5] = 0;
            bArr[6] = 0;
            bArr[7] = 0;
        } else {
            bArr[4] = (byte) hMLiftWristConfig.getStartHour();
            bArr[5] = (byte) hMLiftWristConfig.getStartMinutes();
            bArr[6] = (byte) hMLiftWristConfig.getStopHour();
            bArr[7] = (byte) hMLiftWristConfig.getStopMinutes();
        }
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(bArr, 3);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 6);
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.EcfCmdProvider
    @androidx.annotation.Nullable
    public HMNotifyResponse sendECFCommand(byte[] cmd) {
        return sendECFCommand(cmd, 1);
    }

    public boolean deleteDials(DialsInfo info) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(63);
            byteArrayOutputStream.write(info.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return patchWrite(byteArrayOutputStream.toByteArray(), 2);
    }

    public int replaceDial(DialReplacement replacement) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            byteArrayOutputStream.write(6);
            byteArrayOutputStream.write(36);
            byteArrayOutputStream.write(0);
            byteArrayOutputStream.write(replacement.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(byteArrayOutputStream.toByteArray(), 3);
        if (hMNotifyResponseSendECFCommand == null) {
            return -1;
        }
        if (hMNotifyResponseSendECFCommand.isSuccess((byte) 6)) {
            return 0;
        }
        return hMNotifyResponseSendECFCommand.getCode();
    }

    @Override // com.huami.bluetooth.profile.channel.module.settings.EcfCmdProvider
    @androidx.annotation.Nullable
    public HMNotifyResponse sendECFCommand(byte[] cmd, int cmdLen) {
        return O0(cmd, cmdLen, 5000);
    }

    public boolean setDisplayItem(HMProDisplayItemExt item) {
        byte[] value = item.getValue();
        byte[] bArr = new byte[value.length + 1];
        bArr[0] = 10;
        System.arraycopy(value, 0, bArr, 1, value.length);
        HMNotifyResponse hMNotifyResponseSendECFCommand = sendECFCommand(bArr);
        return hMNotifyResponseSendECFCommand != null && hMNotifyResponseSendECFCommand.isSuccess((byte) 10);
    }
}
