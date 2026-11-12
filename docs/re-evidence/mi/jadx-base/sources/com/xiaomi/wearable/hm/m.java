package com.xiaomi.wearable.hm;

import android.location.Location;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.xiaomi.hm.health.bt.profile.nfc.ApduRequest;
import com.xiaomi.hm.health.bt.profile.nfc.ApduResponse;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface m extends IInterface {

    public static abstract class a extends Binder implements m {
        static final int TRANSACTION_addLFEventCallback = 117;
        static final int TRANSACTION_addOrUpdate = 217;
        static final int TRANSACTION_alertApp = 41;
        static final int TRANSACTION_alertFind = 157;
        static final int TRANSACTION_alertGenericApp = 42;
        static final int TRANSACTION_alertHongbao = 47;
        static final int TRANSACTION_alertInCall = 44;
        static final int TRANSACTION_alertInCallStop = 45;
        static final int TRANSACTION_alertMiuiAlarm = 200;
        static final int TRANSACTION_alertSms = 46;
        static final int TRANSACTION_alertWeather = 40;
        static final int TRANSACTION_cancelFwUpgrade = 37;
        static final int TRANSACTION_cancelSilentUpgradeIfNeed = 230;
        static final int TRANSACTION_closeApduChannel = 26;
        static final int TRANSACTION_connect = 13;
        static final int TRANSACTION_continueVoiceCommand = 63;
        static final int TRANSACTION_defaultVibrate = 160;
        static final int TRANSACTION_delete = 221;
        static final int TRANSACTION_deleteAlertToDevice = 172;
        static final int TRANSACTION_deleteBySource = 256;
        static final int TRANSACTION_deleteSwitchCardTimeSync = 205;
        static final int TRANSACTION_deleteVibrate = 159;
        static final int TRANSACTION_destory = 254;
        static final int TRANSACTION_deviceSportStop = 56;
        static final int TRANSACTION_disableBind = 155;
        static final int TRANSACTION_disableHid = 228;
        static final int TRANSACTION_disconnect = 14;
        static final int TRANSACTION_enableConnectedAdv = 183;
        static final int TRANSACTION_enableGoalRemind = 156;
        static final int TRANSACTION_enableHeart = 248;
        static final int TRANSACTION_enableHeartAndSleep = 249;
        static final int TRANSACTION_enableHrBroadcast = 184;
        static final int TRANSACTION_enableMultiLink = 162;
        static final int TRANSACTION_enableOsa = 180;
        static final int TRANSACTION_enablePressure = 129;
        static final int TRANSACTION_enableRealtimeStep = 231;
        static final int TRANSACTION_enableRelax = 130;
        static final int TRANSACTION_enableSleep = 250;
        static final int TRANSACTION_enableSpo2 = 194;
        static final int TRANSACTION_enableSportHeartRate = 128;
        static final int TRANSACTION_enableWristBright = 113;
        static final int TRANSACTION_getAlarms = 125;
        static final int TRANSACTION_getAtrialFibEnable = 236;
        static final int TRANSACTION_getBatteryLevel = 126;
        static final int TRANSACTION_getCRSCode = 185;
        static final int TRANSACTION_getDailyData = 23;
        static final int TRANSACTION_getDeviceInfo = 2;
        static final int TRANSACTION_getDeviceLog = 127;
        static final int TRANSACTION_getHeartRateConfig = 235;
        static final int TRANSACTION_getHrData = 22;
        static final int TRANSACTION_getHrDetectionData = 260;
        static final int TRANSACTION_getHrReminder = 238;
        static final int TRANSACTION_getHrReminderEnable = 239;
        static final int TRANSACTION_getLanguages = 153;
        static final int TRANSACTION_getLockStatus = 253;
        static final int TRANSACTION_getLowHrReminder = 240;
        static final int TRANSACTION_getLowHrReminderEnable = 241;
        static final int TRANSACTION_getLowOsaDetectionData = 259;
        static final int TRANSACTION_getLowSpo2AlertValue = 243;
        static final int TRANSACTION_getMenstruationConfig = 140;
        static final int TRANSACTION_getMenstruationTotalRecord = 139;
        static final int TRANSACTION_getNfcCardInfoSync = 38;
        static final int TRANSACTION_getOsaEnable = 245;
        static final int TRANSACTION_getPaiGoalData = 167;
        static final int TRANSACTION_getPressureAlertEnable = 247;
        static final int TRANSACTION_getPressureEnable = 246;
        static final int TRANSACTION_getRealtimeData = 19;
        static final int TRANSACTION_getRemindersSync = 121;
        static final int TRANSACTION_getRestHeartRate = 232;
        static final int TRANSACTION_getSkinPath = 50;
        static final int TRANSACTION_getSleepAssistantEnable = 244;
        static final int TRANSACTION_getSleepBreathScore = 181;
        static final int TRANSACTION_getSmartSpo2Enable = 242;
        static final int TRANSACTION_getSportTypeConfig = 164;
        static final int TRANSACTION_getSteps = 18;
        static final int TRANSACTION_getUserInfoSync = 31;
        static final int TRANSACTION_getVersionName = 21;
        static final int TRANSACTION_getWatchFacesAllSync = 252;
        static final int TRANSACTION_hasAlgoFeature = 177;
        static final int TRANSACTION_hasBaseFeature = 175;
        static final int TRANSACTION_hasHardwareFeature = 176;
        static final int TRANSACTION_hasSoftwareFeature = 174;
        static final int TRANSACTION_initListener = 1;
        static final int TRANSACTION_invokeUpgrade = 35;
        static final int TRANSACTION_isConnected = 17;
        static final int TRANSACTION_isMiliMainLand = 182;
        static final int TRANSACTION_isSilentUpgradePushed = 227;
        static final int TRANSACTION_isSportAlive = 133;
        static final int TRANSACTION_isSupportActivityData = 225;
        static final int TRANSACTION_isSupportCardTimeSwitchSync = 202;
        static final int TRANSACTION_isSupportDialFontCustomColor = 255;
        static final int TRANSACTION_modifyCity = 212;
        static final int TRANSACTION_muteMiuiAlarm = 263;
        static final int TRANSACTION_nfcLoadService = 186;
        static final int TRANSACTION_observeHealthSettingChange = 118;
        static final int TRANSACTION_onGetSignData = 20;
        static final int TRANSACTION_openApduChannel = 24;
        static final int TRANSACTION_passwordInteraction = 189;
        static final int TRANSACTION_queryCityList = 210;
        static final int TRANSACTION_queryData = 216;
        static final int TRANSACTION_queryDisplayListSync = 223;
        static final int TRANSACTION_querySettingSync = 197;
        static final int TRANSACTION_querySwitchCardTimeSync = 203;
        static final int TRANSACTION_queryWeatherSettings = 214;
        static final int TRANSACTION_readWristAndPinState = 173;
        static final int TRANSACTION_registerBTExceptionListener = 233;
        static final int TRANSACTION_retryFwUpgrade = 36;
        static final int TRANSACTION_sendApduData = 25;
        static final int TRANSACTION_sendGpsPoint = 124;
        static final int TRANSACTION_sendMusicControl = 119;
        static final int TRANSACTION_sendReplyResult = 8;
        static final int TRANSACTION_sendSmsPermission = 9;
        static final int TRANSACTION_sendSportNoTimerConfig = 191;
        static final int TRANSACTION_sendSportTypeSort = 165;
        static final int TRANSACTION_sendVoiceAsrNoContent = 102;
        static final int TRANSACTION_sendVoiceAsrTimeOut = 101;
        static final int TRANSACTION_sendVoiceCaption = 98;
        static final int TRANSACTION_sendVoiceCloseAlarmCommand = 71;
        static final int TRANSACTION_sendVoiceCloseReminderCommand = 75;
        static final int TRANSACTION_sendVoiceDeleteAlarmCommand = 73;
        static final int TRANSACTION_sendVoiceDeleteAlarmCommandList = 74;
        static final int TRANSACTION_sendVoiceDeleteReminderCommand = 77;
        static final int TRANSACTION_sendVoiceDeleteReminderCommandList = 79;
        static final int TRANSACTION_sendVoiceDeleteTimerCommand = 87;
        static final int TRANSACTION_sendVoiceDeleteTimerCommandList = 88;
        static final int TRANSACTION_sendVoiceDeltaBrightnessCommand = 110;
        static final int TRANSACTION_sendVoiceExeCustomSkillCommand = 108;
        static final int TRANSACTION_sendVoiceFindPhoneCommand = 89;
        static final int TRANSACTION_sendVoiceInvalidateTokenCommand = 90;
        static final int TRANSACTION_sendVoiceMusicNext = 93;
        static final int TRANSACTION_sendVoiceMusicPREV = 94;
        static final int TRANSACTION_sendVoiceMusicPause = 92;
        static final int TRANSACTION_sendVoiceMusicPlay = 91;
        static final int TRANSACTION_sendVoiceNavigateToMainPageCommand = 64;
        static final int TRANSACTION_sendVoiceNetworkDisable = 100;
        static final int TRANSACTION_sendVoiceNetworkError = 99;
        static final int TRANSACTION_sendVoiceNfcCommand = 65;
        static final int TRANSACTION_sendVoiceNotSupportCommand = 106;
        static final int TRANSACTION_sendVoiceOpenAlarmCommand = 70;
        static final int TRANSACTION_sendVoiceOpenBrightnessCommand = 109;
        static final int TRANSACTION_sendVoiceOpenReminderCommand = 80;
        static final int TRANSACTION_sendVoiceOpenTimerCommand = 86;
        static final int TRANSACTION_sendVoicePercentBrightnessCommand = 111;
        static final int TRANSACTION_sendVoiceQueryAlarmCommand = 72;
        static final int TRANSACTION_sendVoiceQueryReminderCommand = 76;
        static final int TRANSACTION_sendVoiceQuerySpeechText = 97;
        static final int TRANSACTION_sendVoiceQuietModeCommand = 107;
        static final int TRANSACTION_sendVoiceReadyCommand = 67;
        static final int TRANSACTION_sendVoiceRebootCommand = 134;
        static final int TRANSACTION_sendVoiceRenderListCommand = 95;
        static final int TRANSACTION_sendVoiceSetAlarmCommand = 68;
        static final int TRANSACTION_sendVoiceSetAlarmCommandList = 69;
        static final int TRANSACTION_sendVoiceSetReminderCommand = 81;
        static final int TRANSACTION_sendVoiceSetReminderCommandList = 82;
        static final int TRANSACTION_sendVoiceSetTimerCommand = 83;
        static final int TRANSACTION_sendVoiceSetTimerCommandForAlexa = 84;
        static final int TRANSACTION_sendVoiceSetTimerCommandList = 85;
        static final int TRANSACTION_sendVoiceShutdownCommand = 135;
        static final int TRANSACTION_sendVoiceTtsNoContent = 104;
        static final int TRANSACTION_sendVoiceTtsTimeout = 103;
        static final int TRANSACTION_sendVoiceUnknownErrorCommand = 105;
        static final int TRANSACTION_sendVoiceWearableCommand = 78;
        static final int TRANSACTION_sendVoiceWeatherForecastCommand = 96;
        static final int TRANSACTION_setAccessInfo = 28;
        static final int TRANSACTION_setActivityMode = 234;
        static final int TRANSACTION_setAidInfo = 27;
        static final int TRANSACTION_setAlarmSync = 61;
        static final int TRANSACTION_setAppSort = 151;
        static final int TRANSACTION_setAtrialFibEnable = 237;
        static final int TRANSACTION_setAuthKey = 3;
        static final int TRANSACTION_setAutoBacklight = 114;
        static final int TRANSACTION_setAutoReconnect = 5;
        static final int TRANSACTION_setBatteryChangedCallback = 170;
        static final int TRANSACTION_setCallReplyDelegate = 7;
        static final int TRANSACTION_setCallback = 6;
        static final int TRANSACTION_setDateTimeSync = 168;
        static final int TRANSACTION_setDisplayListSync = 193;
        static final int TRANSACTION_setGoal = 33;
        static final int TRANSACTION_setHidStatus = 166;
        static final int TRANSACTION_setHignHr = 131;
        static final int TRANSACTION_setHrMaxValue = 258;
        static final int TRANSACTION_setLanguage = 154;
        static final int TRANSACTION_setLowHr = 132;
        static final int TRANSACTION_setLowSpo2 = 195;
        static final int TRANSACTION_setMenstruationNotify = 142;
        static final int TRANSACTION_setMenstruationOvulation = 141;
        static final int TRANSACTION_setMenstruationTotalRecord = 138;
        static final int TRANSACTION_setMultiTarget = 224;
        static final int TRANSACTION_setPair = 4;
        static final int TRANSACTION_setPasswordInteraction = 188;
        static final int TRANSACTION_setReminderSync = 149;
        static final int TRANSACTION_setSedentary = 148;
        static final int TRANSACTION_setShortcutApp = 116;
        static final int TRANSACTION_setStepCallback = 192;
        static final int TRANSACTION_setTimeSwitchCardSync = 204;
        static final int TRANSACTION_setTimeUnitSync = 169;
        static final int TRANSACTION_setToken = 218;
        static final int TRANSACTION_setUnwearPassword = 150;
        static final int TRANSACTION_setUserInfoSync = 32;
        static final int TRANSACTION_setVibrate = 161;
        static final int TRANSACTION_setVoiceCallback = 62;
        static final int TRANSACTION_setWearLocation = 112;
        static final int TRANSACTION_setWeatherInfo = 115;
        static final int TRANSACTION_setWeatherTemperatureUnit = 215;
        static final int TRANSACTION_setWorldClock = 152;
        static final int TRANSACTION_showContactInDevice = 229;
        static final int TRANSACTION_shutdown = 257;
        static final int TRANSACTION_smsDelete = 12;
        static final int TRANSACTION_smsQueryData = 10;
        static final int TRANSACTION_smsSyncMsg = 11;
        static final int TRANSACTION_sportConfig = 51;
        static final int TRANSACTION_sportNotifyGpsState = 123;
        static final int TRANSACTION_sportNotifyHr = 59;
        static final int TRANSACTION_sportNotifyKm = 60;
        static final int TRANSACTION_sportNotifyPace = 58;
        static final int TRANSACTION_sportNotifyTemperature = 122;
        static final int TRANSACTION_sportPause = 53;
        static final int TRANSACTION_sportResume = 54;
        static final int TRANSACTION_sportShow = 57;
        static final int TRANSACTION_sportStart = 52;
        static final int TRANSACTION_sportStop = 55;
        static final int TRANSACTION_startHttpProxy = 207;
        static final int TRANSACTION_startRealtimeMeasureHr = 136;
        static final int TRANSACTION_startSyncAtrialFibData = 179;
        static final int TRANSACTION_startSyncFirstbeatData = 199;
        static final int TRANSACTION_startSyncGpsData = 39;
        static final int TRANSACTION_startSyncPaiData = 145;
        static final int TRANSACTION_startSyncPressureDataAllDay = 147;
        static final int TRANSACTION_startSyncPressureDataSingle = 146;
        static final int TRANSACTION_startSyncSpO2Data = 178;
        static final int TRANSACTION_startWeatherHttpProxy = 208;
        static final int TRANSACTION_stopHttpProxy = 209;
        static final int TRANSACTION_stopRealtimeMeasureHr = 137;
        static final int TRANSACTION_stopVoiceCommand = 66;
        static final int TRANSACTION_storageStatus = 48;
        static final int TRANSACTION_supportFirstbeat = 171;
        static final int TRANSACTION_supportHrDetection = 251;
        static final int TRANSACTION_supportHrDetectionData = 261;
        static final int TRANSACTION_supportLinkageMiuiAlarm = 264;
        static final int TRANSACTION_supportLowOsaData = 262;
        static final int TRANSACTION_supportNightModeSetting = 222;
        static final int TRANSACTION_supportSilentUpgrade = 226;
        static final int TRANSACTION_switchMenstruationDeviceNotify = 143;
        static final int TRANSACTION_switchSmartPredict = 144;
        static final int TRANSACTION_syncActivityDataFromDevice = 220;
        static final int TRANSACTION_syncActivityDataToDevice = 219;
        static final int TRANSACTION_syncDataToDevice = 198;
        static final int TRANSACTION_syncSkin = 49;
        static final int TRANSACTION_syncStandAlertConfig = 206;
        static final int TRANSACTION_syncStatisticData = 265;
        static final int TRANSACTION_testVibrate = 158;
        static final int TRANSACTION_triggerPair = 43;
        static final int TRANSACTION_unWearStatus = 201;
        static final int TRANSACTION_unbindSync = 16;
        static final int TRANSACTION_updateDid = 15;
        static final int TRANSACTION_updateFindPhoneStatus = 120;
        static final int TRANSACTION_updateFwUpgrade = 34;
        static final int TRANSACTION_updateNfcCardConfig = 29;
        static final int TRANSACTION_updateNfcCardList = 30;
        static final int TRANSACTION_updatePasswordInteraction = 187;
        static final int TRANSACTION_updatePhoneMuteState = 163;
        static final int TRANSACTION_updateWeatherSettings = 213;
        static final int TRANSACTION_writeCityList = 211;
        static final int TRANSACTION_writeSettingSync = 196;
        static final int TRANSACTION_writeSleepBack = 190;

        /* JADX INFO: renamed from: com.xiaomi.wearable.hm.m$a$a, reason: collision with other inner class name */
        public static class C0881a implements m {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public IBinder f14403a;

            public C0881a(IBinder iBinder) {
                this.f14403a = iBinder;
            }

            @Override // com.xiaomi.wearable.hm.m
            public void addLFEventCallback(s sVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeStrongInterface(sVar);
                    this.f14403a.transact(117, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void addOrUpdate(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(217, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean alertApp(HuamiDataWrapper huamiDataWrapper, int i, String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.f14403a.transact(41, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean alertFind() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(157, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean alertGenericApp(int i, String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.f14403a.transact(42, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean alertHongbao(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(47, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean alertInCall(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f14403a.transact(44, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean alertInCallStop() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(45, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean alertMiuiAlarm(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(200, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean alertSms(int i, String str, String str2, String str3) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    this.f14403a.transact(46, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean alertWeather(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f14403a.transact(40, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.f14403a;
            }

            @Override // com.xiaomi.wearable.hm.m
            public void cancelFwUpgrade() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(37, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void cancelSilentUpgradeIfNeed() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(230, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public HuamiDataWrapper closeApduChannel() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(26, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (HuamiDataWrapper) b.d(parcelObtain2, HuamiDataWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void connect(n nVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeStrongInterface(nVar);
                    this.f14403a.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean continueVoiceCommand() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(63, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean defaultVibrate(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(160, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void delete(long j) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeLong(j);
                    this.f14403a.transact(221, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean deleteAlertToDevice(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(172, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void deleteBySource(int[] iArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeIntArray(iArr);
                    this.f14403a.transact(256, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean deleteSwitchCardTimeSync(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(205, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean deleteVibrate(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(159, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void destory() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(254, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean deviceSportStop() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(56, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean disableBind(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14403a.transact(155, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean disableHid() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(a.TRANSACTION_disableHid, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void disconnect() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean enableConnectedAdv(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14403a.transact(183, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean enableGoalRemind(boolean z, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(156, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean enableHeart(boolean z, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(a.TRANSACTION_enableHeart, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean enableHeartAndSleep(boolean z, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(a.TRANSACTION_enableHeartAndSleep, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean enableHrBroadcast(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14403a.transact(184, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean enableMultiLink(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14403a.transact(162, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean enableOsa(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14403a.transact(180, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean enablePressure(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14403a.transact(129, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void enableRealtimeStep(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14403a.transact(231, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean enableRelax(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14403a.transact(130, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean enableSleep(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14403a.transact(250, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean enableSpo2(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14403a.transact(194, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean enableSportHeartRate(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14403a.transact(128, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean enableWristBright(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(113, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public List<HuamiDataWrapper> getAlarms() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(125, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(HuamiDataWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean getAtrialFibEnable() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(a.TRANSACTION_getAtrialFibEnable, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public HuamiDataWrapper getBatteryLevel() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(126, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (HuamiDataWrapper) b.d(parcelObtain2, HuamiDataWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean getCRSCode() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(185, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public HuamiDataWrapper getDailyData(long j, int i, HuamiDataWrapper huamiDataWrapper, List<HuamiDataWrapper> list, boolean z, e eVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeLong(j);
                    parcelObtain.writeInt(i);
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    b.e(parcelObtain, list, 0);
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeStrongInterface(eVar);
                    this.f14403a.transact(23, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (HuamiDataWrapper) b.d(parcelObtain2, HuamiDataWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public HuamiDataWrapper getDeviceInfo() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (HuamiDataWrapper) b.d(parcelObtain2, HuamiDataWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void getDeviceLog(HuamiDataWrapper huamiDataWrapper, h hVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    parcelObtain.writeStrongInterface(hVar);
                    this.f14403a.transact(127, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public int getHeartRateConfig() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(a.TRANSACTION_getHeartRateConfig, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public HuamiDataWrapper getHrData(long j, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeLong(j);
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(22, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (HuamiDataWrapper) b.d(parcelObtain2, HuamiDataWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public List<HuamiDataWrapper> getHrDetectionData(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(a.TRANSACTION_getHrDetectionData, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(HuamiDataWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public int getHrReminder() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(a.TRANSACTION_getHrReminder, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean getHrReminderEnable() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(239, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public List<HuamiDataWrapper> getLanguages() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(153, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(HuamiDataWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean getLockStatus() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(253, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public int getLowHrReminder() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(240, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean getLowHrReminderEnable() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(a.TRANSACTION_getLowHrReminderEnable, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public List<HuamiDataWrapper> getLowOsaDetectionData(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(259, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(HuamiDataWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public int getLowSpo2AlertValue() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(a.TRANSACTION_getLowSpo2AlertValue, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public HuamiDataWrapper getMenstruationConfig() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(140, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (HuamiDataWrapper) b.d(parcelObtain2, HuamiDataWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public HuamiDataWrapper getMenstruationTotalRecord() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(139, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (HuamiDataWrapper) b.d(parcelObtain2, HuamiDataWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public HuamiDataWrapper getNfcCardInfoSync() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(38, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (HuamiDataWrapper) b.d(parcelObtain2, HuamiDataWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean getOsaEnable() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(a.TRANSACTION_getOsaEnable, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public HuamiDataWrapper getPaiGoalData(int i, int i2, int i3, int i4, int i5) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    parcelObtain.writeInt(i3);
                    parcelObtain.writeInt(i4);
                    parcelObtain.writeInt(i5);
                    this.f14403a.transact(167, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (HuamiDataWrapper) b.d(parcelObtain2, HuamiDataWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean getPressureAlertEnable() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(a.TRANSACTION_getPressureAlertEnable, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean getPressureEnable() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(a.TRANSACTION_getPressureEnable, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public HuamiDataWrapper getRealtimeData() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (HuamiDataWrapper) b.d(parcelObtain2, HuamiDataWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public List<HuamiDataWrapper> getRemindersSync() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(121, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(HuamiDataWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public List<HuamiDataWrapper> getRestHeartRate(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(232, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(HuamiDataWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public String getSkinPath(String str, List<String> list, byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStringList(list);
                    parcelObtain.writeByteArray(bArr);
                    this.f14403a.transact(50, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean getSleepAssistantEnable() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(a.TRANSACTION_getSleepAssistantEnable, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public int getSleepBreathScore(long j, long j2, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeLong(j);
                    parcelObtain.writeLong(j2);
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(181, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean getSmartSpo2Enable() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(a.TRANSACTION_getSmartSpo2Enable, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public HuamiDataWrapper getSportTypeConfig() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(164, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (HuamiDataWrapper) b.d(parcelObtain2, HuamiDataWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public int getSteps() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public HuamiDataWrapper getUserInfoSync() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(31, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (HuamiDataWrapper) b.d(parcelObtain2, HuamiDataWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public String getVersionName() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(21, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public int[] getWatchFacesAllSync() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(252, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createIntArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean hasAlgoFeature(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(177, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean hasBaseFeature(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(175, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean hasHardwareFeature(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(176, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean hasSoftwareFeature(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(174, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void initListener() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void invokeUpgrade(p pVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeStrongInterface(pVar);
                    this.f14403a.transact(35, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean isConnected() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean isMiliMainLand() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(182, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean isSilentUpgradePushed() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(a.TRANSACTION_isSilentUpgradePushed, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean isSportAlive() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(133, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean isSupportActivityData() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(225, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean isSupportCardTimeSwitchSync() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(202, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean isSupportDialFontCustomColor() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(255, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean modifyCity(HuamiDataWrapper huamiDataWrapper, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14403a.transact(212, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean muteMiuiAlarm(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(a.TRANSACTION_muteMiuiAlarm, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public ApduResponse nfcLoadService(byte[] bArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeByteArray(bArr);
                    this.f14403a.transact(186, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ApduResponse) b.d(parcelObtain2, ApduResponse.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void observeHealthSettingChange(o oVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeStrongInterface(oVar);
                    this.f14403a.transact(118, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public byte[] onGetSignData(byte[] bArr, byte[] bArr2, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeByteArray(bArr2);
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createByteArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public HuamiDataWrapper openApduChannel() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(24, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (HuamiDataWrapper) b.d(parcelObtain2, HuamiDataWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public HuamiDataWrapper passwordInteraction() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(189, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (HuamiDataWrapper) b.d(parcelObtain2, HuamiDataWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public List<HuamiDataWrapper> queryCityList() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(210, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(HuamiDataWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void queryData(long[] jArr, q qVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeLongArray(jArr);
                    parcelObtain.writeStrongInterface(qVar);
                    this.f14403a.transact(216, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public List<HuamiDataWrapper> queryDisplayListSync(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(223, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(HuamiDataWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public HuamiDataWrapper querySettingSync(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(197, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (HuamiDataWrapper) b.d(parcelObtain2, HuamiDataWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public List<HuamiDataWrapper> querySwitchCardTimeSync(String str, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(203, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(HuamiDataWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public HuamiDataWrapper queryWeatherSettings() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(214, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (HuamiDataWrapper) b.d(parcelObtain2, HuamiDataWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean readWristAndPinState() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(173, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void registerBTExceptionListener(g gVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeStrongInterface(gVar);
                    this.f14403a.transact(a.TRANSACTION_registerBTExceptionListener, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void retryFwUpgrade() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(36, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public ApduResponse sendApduData(ApduRequest apduRequest) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, apduRequest, 0);
                    this.f14403a.transact(25, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (ApduResponse) b.d(parcelObtain2, ApduResponse.CREATOR);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendGpsPoint(Location location, int i, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, location, 0);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14403a.transact(124, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendMusicControl(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(119, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void sendReplyResult(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14403a.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void sendSmsPermission(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14403a.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendSportNoTimerConfig(HuamiDataWrapper huamiDataWrapper, k kVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    parcelObtain.writeStrongInterface(kVar);
                    this.f14403a.transact(191, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendSportTypeSort(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(165, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceAsrNoContent() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(102, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceAsrTimeOut() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(101, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceCaption(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeString(str);
                    this.f14403a.transact(98, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceCloseAlarmCommand() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(71, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceCloseReminderCommand(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeString(str);
                    this.f14403a.transact(75, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceDeleteAlarmCommand(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeString(str);
                    this.f14403a.transact(73, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceDeleteAlarmCommandList(List<String> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeStringList(list);
                    this.f14403a.transact(74, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceDeleteReminderCommand(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeString(str);
                    this.f14403a.transact(77, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceDeleteReminderCommandList(List<String> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeStringList(list);
                    this.f14403a.transact(79, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceDeleteTimerCommand() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(87, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceDeleteTimerCommandList(List<String> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeStringList(list);
                    this.f14403a.transact(88, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceDeltaBrightnessCommand(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(110, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceExeCustomSkillCommand(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeString(str);
                    this.f14403a.transact(108, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceFindPhoneCommand() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(89, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceInvalidateTokenCommand() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(90, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceMusicNext() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(93, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceMusicPREV() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(94, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceMusicPause() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(92, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceMusicPlay() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(91, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceNavigateToMainPageCommand() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(64, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceNetworkDisable() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(100, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceNetworkError() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(99, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceNfcCommand(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(65, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceNotSupportCommand() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(106, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceOpenAlarmCommand() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(70, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceOpenBrightnessCommand() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(109, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceOpenReminderCommand(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeString(str);
                    this.f14403a.transact(80, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceOpenTimerCommand() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(86, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoicePercentBrightnessCommand(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(111, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceQueryAlarmCommand() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(72, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceQueryReminderCommand(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeString(str);
                    this.f14403a.transact(76, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceQuerySpeechText(String str, boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14403a.transact(97, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceQuietModeCommand(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(107, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceReadyCommand(List<String> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeStringList(list);
                    this.f14403a.transact(67, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void sendVoiceRebootCommand() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(134, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceRenderListCommand(String str, String str2, List<HuamiDataWrapper> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    b.e(parcelObtain, list, 0);
                    this.f14403a.transact(95, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceSetAlarmCommand(String str, String str2, String str3, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(68, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceSetAlarmCommandList(List<String> list, long j, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeStringList(list);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(69, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceSetReminderCommand(String str, String str2, String str3, String str4, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeString(str4);
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(81, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceSetReminderCommandList(List<String> list, String str, long j, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeStringList(list);
                    parcelObtain.writeString(str);
                    parcelObtain.writeLong(j);
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(82, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceSetTimerCommand(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f14403a.transact(83, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceSetTimerCommandForAlexa(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.f14403a.transact(84, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceSetTimerCommandList(long j, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeLong(j);
                    parcelObtain.writeString(str);
                    this.f14403a.transact(85, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void sendVoiceShutdownCommand() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(135, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceTtsNoContent() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(104, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceTtsTimeout() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(103, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceUnknownErrorCommand() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(105, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceWearableCommand(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeString(str);
                    this.f14403a.transact(78, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sendVoiceWeatherForecastCommand(List<HuamiDataWrapper> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.e(parcelObtain, list, 0);
                    this.f14403a.transact(96, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setAccessInfo(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(28, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setActivityMode(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(a.TRANSACTION_setActivityMode, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setAidInfo(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(27, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setAlarmSync(List<HuamiDataWrapper> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.e(parcelObtain, list, 0);
                    this.f14403a.transact(61, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setAppSort(List<HuamiDataWrapper> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.e(parcelObtain, list, 0);
                    this.f14403a.transact(151, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setAtrialFibEnable(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14403a.transact(a.TRANSACTION_setAtrialFibEnable, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void setAuthKey(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeString(str);
                    this.f14403a.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setAutoBacklight(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(114, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void setAutoReconnect(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14403a.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void setBatteryChangedCallback(c cVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeStrongInterface(cVar);
                    this.f14403a.transact(170, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void setCallReplyDelegate(d dVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeStrongInterface(dVar);
                    this.f14403a.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void setCallback(n nVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeStrongInterface(nVar);
                    this.f14403a.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setDateTimeSync(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(168, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setDisplayListSync(int i, List<HuamiDataWrapper> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(i);
                    b.e(parcelObtain, list, 0);
                    this.f14403a.transact(193, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setGoal(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(33, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setHidStatus(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(166, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setHignHr(boolean z, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(131, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void setHrMaxValue(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(258, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setLanguage(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(154, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setLowHr(boolean z, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(132, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setLowSpo2(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(195, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setMenstruationNotify(boolean z, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(142, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setMenstruationOvulation(boolean z, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(141, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setMenstruationTotalRecord(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(138, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setMultiTarget(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(224, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void setPair(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14403a.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setPasswordInteraction() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(188, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setReminderSync(List<HuamiDataWrapper> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.e(parcelObtain, list, 0);
                    this.f14403a.transact(149, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setSedentary(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(148, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setShortcutApp(List<HuamiDataWrapper> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.e(parcelObtain, list, 0);
                    this.f14403a.transact(116, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void setStepCallback(r rVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeStrongInterface(rVar);
                    this.f14403a.transact(192, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public int setTimeSwitchCardSync(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(204, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setTimeUnitSync(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14403a.transact(169, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setToken() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(218, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setUnwearPassword(boolean z, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeString(str);
                    this.f14403a.transact(150, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setUserInfoSync(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(32, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setVibrate(HuamiDataWrapper huamiDataWrapper, int i, int[] iArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeIntArray(iArr);
                    this.f14403a.transact(161, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void setVoiceCallback(c0 c0Var) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeStrongInterface(c0Var);
                    this.f14403a.transact(62, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setWearLocation(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14403a.transact(112, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setWeatherInfo(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(115, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setWeatherTemperatureUnit(byte b2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeByte(b2);
                    this.f14403a.transact(215, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean setWorldClock(List<HuamiDataWrapper> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.e(parcelObtain, list, 0);
                    this.f14403a.transact(152, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean showContactInDevice(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14403a.transact(a.TRANSACTION_showContactInDevice, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void shutdown() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(a.TRANSACTION_shutdown, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void smsDelete(int i, v vVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeStrongInterface(vVar);
                    this.f14403a.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void smsQueryData(v vVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeStrongInterface(vVar);
                    this.f14403a.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void smsSyncMsg(List<HuamiDataWrapper> list, v vVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.e(parcelObtain, list, 0);
                    parcelObtain.writeStrongInterface(vVar);
                    this.f14403a.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sportConfig(HuamiDataWrapper huamiDataWrapper, k kVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    parcelObtain.writeStrongInterface(kVar);
                    this.f14403a.transact(51, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sportNotifyGpsState(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(123, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sportNotifyHr(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(59, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sportNotifyKm(float f, int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeFloat(f);
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(60, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sportNotifyPace(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(58, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sportNotifyTemperature(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(122, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sportPause() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(53, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sportResume(int i) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(i);
                    this.f14403a.transact(54, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sportShow(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(57, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sportStart(int i, int i2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(i);
                    parcelObtain.writeInt(i2);
                    this.f14403a.transact(52, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean sportStop() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(55, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void startHttpProxy(l lVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeStrongInterface(lVar);
                    this.f14403a.transact(207, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void startRealtimeMeasureHr(x xVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeStrongInterface(xVar);
                    this.f14403a.transact(136, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void startSyncAtrialFibData(HuamiDataWrapper huamiDataWrapper, com.xiaomi.wearable.hm.b bVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    parcelObtain.writeStrongInterface(bVar);
                    this.f14403a.transact(179, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void startSyncFirstbeatData(HuamiDataWrapper huamiDataWrapper, HuamiDataWrapper huamiDataWrapper2, i iVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    b.f(parcelObtain, huamiDataWrapper2, 0);
                    parcelObtain.writeStrongInterface(iVar);
                    this.f14403a.transact(199, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void startSyncGpsData(HuamiDataWrapper huamiDataWrapper, j jVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    parcelObtain.writeStrongInterface(jVar);
                    this.f14403a.transact(39, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void startSyncPaiData(HuamiDataWrapper huamiDataWrapper, y yVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    parcelObtain.writeStrongInterface(yVar);
                    this.f14403a.transact(145, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void startSyncPressureDataAllDay(long j, HuamiDataWrapper huamiDataWrapper, z zVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeLong(j);
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    parcelObtain.writeStrongInterface(zVar);
                    this.f14403a.transact(147, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void startSyncPressureDataSingle(long j, HuamiDataWrapper huamiDataWrapper, a0 a0Var) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeLong(j);
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    parcelObtain.writeStrongInterface(a0Var);
                    this.f14403a.transact(146, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void startSyncSpO2Data(HuamiDataWrapper huamiDataWrapper, w wVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    parcelObtain.writeStrongInterface(wVar);
                    this.f14403a.transact(178, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void startWeatherHttpProxy(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(208, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void stopHttpProxy() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(209, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean stopRealtimeMeasureHr() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(137, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean stopVoiceCommand() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(66, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void storageStatus(String str, t tVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(tVar);
                    this.f14403a.transact(48, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean supportFirstbeat() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(171, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean supportHrDetection() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(251, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean supportHrDetectionData() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(261, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean supportLinkageMiuiAlarm() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(a.TRANSACTION_supportLinkageMiuiAlarm, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean supportLowOsaData() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(a.TRANSACTION_supportLowOsaData, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean supportNightModeSetting() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(222, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean supportSilentUpgrade() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(a.TRANSACTION_supportSilentUpgrade, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean switchMenstruationDeviceNotify(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14403a.transact(143, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean switchSmartPredict(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14403a.transact(144, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void syncActivityDataFromDevice(HuamiDataWrapper huamiDataWrapper, com.xiaomi.wearable.hm.a aVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    parcelObtain.writeStrongInterface(aVar);
                    this.f14403a.transact(220, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void syncActivityDataToDevice(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(219, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void syncDataToDevice(List<HuamiDataWrapper> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.e(parcelObtain, list, 0);
                    this.f14403a.transact(198, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void syncSkin(String str, b0 b0Var) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(b0Var);
                    this.f14403a.transact(49, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean syncStandAlertConfig(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(206, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public List<HuamiDataWrapper> syncStatisticData() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(a.TRANSACTION_syncStatisticData, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createTypedArrayList(HuamiDataWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean testVibrate(int[] iArr) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeIntArray(iArr);
                    this.f14403a.transact(158, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean triggerPair() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(43, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public int unWearStatus() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(201, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean unbindSync() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    this.f14403a.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void updateDid(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeString(str);
                    this.f14403a.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean updateFindPhoneStatus(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14403a.transact(120, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void updateFwUpgrade(boolean z, int i, Map map, String str, f fVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    parcelObtain.writeInt(i);
                    parcelObtain.writeMap(map);
                    parcelObtain.writeString(str);
                    parcelObtain.writeStrongInterface(fVar);
                    this.f14403a.transact(34, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public HuamiDataWrapper updateNfcCardConfig(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(29, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return (HuamiDataWrapper) b.d(parcelObtain2, HuamiDataWrapper.INSTANCE);
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean updateNfcCardList(List<HuamiDataWrapper> list, HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.e(parcelObtain, list, 0);
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(30, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean updatePasswordInteraction(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeString(str);
                    this.f14403a.transact(187, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean updatePhoneMuteState(boolean z) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeInt(z ? 1 : 0);
                    this.f14403a.transact(163, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean updateWeatherSettings(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(213, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean writeCityList(List<HuamiDataWrapper> list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.e(parcelObtain, list, 0);
                    this.f14403a.transact(211, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public boolean writeSettingSync(HuamiDataWrapper huamiDataWrapper) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    b.f(parcelObtain, huamiDataWrapper, 0);
                    this.f14403a.transact(196, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt() != 0;
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.xiaomi.wearable.hm.m
            public void writeSleepBack(u uVar) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken("com.xiaomi.wearable.hm.HuamiApi");
                    parcelObtain.writeStrongInterface(uVar);
                    this.f14403a.transact(190, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public a() {
            attachInterface(this, "com.xiaomi.wearable.hm.HuamiApi");
        }

        public static m asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.xiaomi.wearable.hm.HuamiApi");
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof m)) ? new C0881a(iBinder) : (m) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i >= 1 && i <= 16777215) {
                parcel.enforceInterface("com.xiaomi.wearable.hm.HuamiApi");
            }
            if (i == 1598968902) {
                parcel2.writeString("com.xiaomi.wearable.hm.HuamiApi");
                return true;
            }
            switch (i) {
                case 1:
                    initListener();
                    parcel2.writeNoException();
                    return true;
                case 2:
                    HuamiDataWrapper deviceInfo = getDeviceInfo();
                    parcel2.writeNoException();
                    b.f(parcel2, deviceInfo, 1);
                    return true;
                case 3:
                    setAuthKey(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    setPair(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    setAutoReconnect(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 6:
                    setCallback(n.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 7:
                    setCallReplyDelegate(d.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    sendReplyResult(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 9:
                    sendSmsPermission(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 10:
                    smsQueryData(v.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 11:
                    smsSyncMsg(parcel.createTypedArrayList(HuamiDataWrapper.INSTANCE), v.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 12:
                    smsDelete(parcel.readInt(), v.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 13:
                    connect(n.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 14:
                    disconnect();
                    parcel2.writeNoException();
                    return true;
                case 15:
                    updateDid(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 16:
                    boolean zUnbindSync = unbindSync();
                    parcel2.writeNoException();
                    parcel2.writeInt(zUnbindSync ? 1 : 0);
                    return true;
                case 17:
                    boolean zIsConnected = isConnected();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsConnected ? 1 : 0);
                    return true;
                case 18:
                    int steps = getSteps();
                    parcel2.writeNoException();
                    parcel2.writeInt(steps);
                    return true;
                case 19:
                    HuamiDataWrapper realtimeData = getRealtimeData();
                    parcel2.writeNoException();
                    b.f(parcel2, realtimeData, 1);
                    return true;
                case 20:
                    byte[] bArrOnGetSignData = onGetSignData(parcel.createByteArray(), parcel.createByteArray(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeByteArray(bArrOnGetSignData);
                    return true;
                case 21:
                    String versionName = getVersionName();
                    parcel2.writeNoException();
                    parcel2.writeString(versionName);
                    return true;
                case 22:
                    HuamiDataWrapper hrData = getHrData(parcel.readLong(), parcel.readInt());
                    parcel2.writeNoException();
                    b.f(parcel2, hrData, 1);
                    return true;
                case 23:
                    long j = parcel.readLong();
                    int i3 = parcel.readInt();
                    HuamiDataWrapper.Companion companion = HuamiDataWrapper.INSTANCE;
                    HuamiDataWrapper dailyData = getDailyData(j, i3, (HuamiDataWrapper) b.d(parcel, companion), parcel.createTypedArrayList(companion), parcel.readInt() != 0, e.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    b.f(parcel2, dailyData, 1);
                    return true;
                case 24:
                    HuamiDataWrapper huamiDataWrapperOpenApduChannel = openApduChannel();
                    parcel2.writeNoException();
                    b.f(parcel2, huamiDataWrapperOpenApduChannel, 1);
                    return true;
                case 25:
                    ApduResponse apduResponseSendApduData = sendApduData((ApduRequest) b.d(parcel, ApduRequest.CREATOR));
                    parcel2.writeNoException();
                    b.f(parcel2, apduResponseSendApduData, 1);
                    return true;
                case 26:
                    HuamiDataWrapper huamiDataWrapperCloseApduChannel = closeApduChannel();
                    parcel2.writeNoException();
                    b.f(parcel2, huamiDataWrapperCloseApduChannel, 1);
                    return true;
                case 27:
                    boolean aidInfo = setAidInfo((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(aidInfo ? 1 : 0);
                    return true;
                case 28:
                    boolean accessInfo = setAccessInfo((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(accessInfo ? 1 : 0);
                    return true;
                case 29:
                    HuamiDataWrapper huamiDataWrapperUpdateNfcCardConfig = updateNfcCardConfig((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    b.f(parcel2, huamiDataWrapperUpdateNfcCardConfig, 1);
                    return true;
                case 30:
                    HuamiDataWrapper.Companion companion2 = HuamiDataWrapper.INSTANCE;
                    boolean zUpdateNfcCardList = updateNfcCardList(parcel.createTypedArrayList(companion2), (HuamiDataWrapper) b.d(parcel, companion2));
                    parcel2.writeNoException();
                    parcel2.writeInt(zUpdateNfcCardList ? 1 : 0);
                    return true;
                case 31:
                    HuamiDataWrapper userInfoSync = getUserInfoSync();
                    parcel2.writeNoException();
                    b.f(parcel2, userInfoSync, 1);
                    return true;
                case 32:
                    boolean userInfoSync2 = setUserInfoSync((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(userInfoSync2 ? 1 : 0);
                    return true;
                case 33:
                    boolean goal = setGoal(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(goal ? 1 : 0);
                    return true;
                case 34:
                    updateFwUpgrade(parcel.readInt() != 0, parcel.readInt(), parcel.readHashMap(getClass().getClassLoader()), parcel.readString(), f.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 35:
                    invokeUpgrade(p.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 36:
                    retryFwUpgrade();
                    parcel2.writeNoException();
                    return true;
                case 37:
                    cancelFwUpgrade();
                    parcel2.writeNoException();
                    return true;
                case 38:
                    HuamiDataWrapper nfcCardInfoSync = getNfcCardInfoSync();
                    parcel2.writeNoException();
                    b.f(parcel2, nfcCardInfoSync, 1);
                    return true;
                case 39:
                    startSyncGpsData((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE), j.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 40:
                    boolean zAlertWeather = alertWeather(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zAlertWeather ? 1 : 0);
                    return true;
                case 41:
                    boolean zAlertApp = alertApp((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zAlertApp ? 1 : 0);
                    return true;
                case 42:
                    boolean zAlertGenericApp = alertGenericApp(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zAlertGenericApp ? 1 : 0);
                    return true;
                case 43:
                    boolean zTriggerPair = triggerPair();
                    parcel2.writeNoException();
                    parcel2.writeInt(zTriggerPair ? 1 : 0);
                    return true;
                case 44:
                    boolean zAlertInCall = alertInCall(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zAlertInCall ? 1 : 0);
                    return true;
                case 45:
                    boolean zAlertInCallStop = alertInCallStop();
                    parcel2.writeNoException();
                    parcel2.writeInt(zAlertInCallStop ? 1 : 0);
                    return true;
                case 46:
                    boolean zAlertSms = alertSms(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zAlertSms ? 1 : 0);
                    return true;
                case 47:
                    boolean zAlertHongbao = alertHongbao(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zAlertHongbao ? 1 : 0);
                    return true;
                case 48:
                    storageStatus(parcel.readString(), t.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 49:
                    syncSkin(parcel.readString(), b0.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 50:
                    String skinPath = getSkinPath(parcel.readString(), parcel.createStringArrayList(), parcel.createByteArray());
                    parcel2.writeNoException();
                    parcel2.writeString(skinPath);
                    return true;
                case 51:
                    boolean zSportConfig = sportConfig((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE), k.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zSportConfig ? 1 : 0);
                    return true;
                case 52:
                    boolean zSportStart = sportStart(parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSportStart ? 1 : 0);
                    return true;
                case 53:
                    boolean zSportPause = sportPause();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSportPause ? 1 : 0);
                    return true;
                case 54:
                    boolean zSportResume = sportResume(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSportResume ? 1 : 0);
                    return true;
                case 55:
                    boolean zSportStop = sportStop();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSportStop ? 1 : 0);
                    return true;
                case 56:
                    boolean zDeviceSportStop = deviceSportStop();
                    parcel2.writeNoException();
                    parcel2.writeInt(zDeviceSportStop ? 1 : 0);
                    return true;
                case 57:
                    boolean zSportShow = sportShow((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(zSportShow ? 1 : 0);
                    return true;
                case 58:
                    boolean zSportNotifyPace = sportNotifyPace(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSportNotifyPace ? 1 : 0);
                    return true;
                case 59:
                    boolean zSportNotifyHr = sportNotifyHr(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSportNotifyHr ? 1 : 0);
                    return true;
                case 60:
                    boolean zSportNotifyKm = sportNotifyKm(parcel.readFloat(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSportNotifyKm ? 1 : 0);
                    return true;
                case 61:
                    boolean alarmSync = setAlarmSync(parcel.createTypedArrayList(HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(alarmSync ? 1 : 0);
                    return true;
                case 62:
                    setVoiceCallback(c0.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 63:
                    boolean zContinueVoiceCommand = continueVoiceCommand();
                    parcel2.writeNoException();
                    parcel2.writeInt(zContinueVoiceCommand ? 1 : 0);
                    return true;
                case 64:
                    boolean zSendVoiceNavigateToMainPageCommand = sendVoiceNavigateToMainPageCommand();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceNavigateToMainPageCommand ? 1 : 0);
                    return true;
                case 65:
                    boolean zSendVoiceNfcCommand = sendVoiceNfcCommand(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceNfcCommand ? 1 : 0);
                    return true;
                case 66:
                    boolean zStopVoiceCommand = stopVoiceCommand();
                    parcel2.writeNoException();
                    parcel2.writeInt(zStopVoiceCommand ? 1 : 0);
                    return true;
                case 67:
                    boolean zSendVoiceReadyCommand = sendVoiceReadyCommand(parcel.createStringArrayList());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceReadyCommand ? 1 : 0);
                    return true;
                case 68:
                    boolean zSendVoiceSetAlarmCommand = sendVoiceSetAlarmCommand(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceSetAlarmCommand ? 1 : 0);
                    return true;
                case 69:
                    boolean zSendVoiceSetAlarmCommandList = sendVoiceSetAlarmCommandList(parcel.createStringArrayList(), parcel.readLong(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceSetAlarmCommandList ? 1 : 0);
                    return true;
                case 70:
                    boolean zSendVoiceOpenAlarmCommand = sendVoiceOpenAlarmCommand();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceOpenAlarmCommand ? 1 : 0);
                    return true;
                case 71:
                    boolean zSendVoiceCloseAlarmCommand = sendVoiceCloseAlarmCommand();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceCloseAlarmCommand ? 1 : 0);
                    return true;
                case 72:
                    boolean zSendVoiceQueryAlarmCommand = sendVoiceQueryAlarmCommand();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceQueryAlarmCommand ? 1 : 0);
                    return true;
                case 73:
                    boolean zSendVoiceDeleteAlarmCommand = sendVoiceDeleteAlarmCommand(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceDeleteAlarmCommand ? 1 : 0);
                    return true;
                case 74:
                    boolean zSendVoiceDeleteAlarmCommandList = sendVoiceDeleteAlarmCommandList(parcel.createStringArrayList());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceDeleteAlarmCommandList ? 1 : 0);
                    return true;
                case 75:
                    boolean zSendVoiceCloseReminderCommand = sendVoiceCloseReminderCommand(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceCloseReminderCommand ? 1 : 0);
                    return true;
                case 76:
                    boolean zSendVoiceQueryReminderCommand = sendVoiceQueryReminderCommand(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceQueryReminderCommand ? 1 : 0);
                    return true;
                case 77:
                    boolean zSendVoiceDeleteReminderCommand = sendVoiceDeleteReminderCommand(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceDeleteReminderCommand ? 1 : 0);
                    return true;
                case 78:
                    boolean zSendVoiceWearableCommand = sendVoiceWearableCommand(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceWearableCommand ? 1 : 0);
                    return true;
                case 79:
                    boolean zSendVoiceDeleteReminderCommandList = sendVoiceDeleteReminderCommandList(parcel.createStringArrayList());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceDeleteReminderCommandList ? 1 : 0);
                    return true;
                case 80:
                    boolean zSendVoiceOpenReminderCommand = sendVoiceOpenReminderCommand(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceOpenReminderCommand ? 1 : 0);
                    return true;
                case 81:
                    boolean zSendVoiceSetReminderCommand = sendVoiceSetReminderCommand(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceSetReminderCommand ? 1 : 0);
                    return true;
                case 82:
                    boolean zSendVoiceSetReminderCommandList = sendVoiceSetReminderCommandList(parcel.createStringArrayList(), parcel.readString(), parcel.readLong(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceSetReminderCommandList ? 1 : 0);
                    return true;
                case 83:
                    boolean zSendVoiceSetTimerCommand = sendVoiceSetTimerCommand(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceSetTimerCommand ? 1 : 0);
                    return true;
                case 84:
                    boolean zSendVoiceSetTimerCommandForAlexa = sendVoiceSetTimerCommandForAlexa(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceSetTimerCommandForAlexa ? 1 : 0);
                    return true;
                case 85:
                    boolean zSendVoiceSetTimerCommandList = sendVoiceSetTimerCommandList(parcel.readLong(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceSetTimerCommandList ? 1 : 0);
                    return true;
                case 86:
                    boolean zSendVoiceOpenTimerCommand = sendVoiceOpenTimerCommand();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceOpenTimerCommand ? 1 : 0);
                    return true;
                case 87:
                    boolean zSendVoiceDeleteTimerCommand = sendVoiceDeleteTimerCommand();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceDeleteTimerCommand ? 1 : 0);
                    return true;
                case 88:
                    boolean zSendVoiceDeleteTimerCommandList = sendVoiceDeleteTimerCommandList(parcel.createStringArrayList());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceDeleteTimerCommandList ? 1 : 0);
                    return true;
                case 89:
                    boolean zSendVoiceFindPhoneCommand = sendVoiceFindPhoneCommand();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceFindPhoneCommand ? 1 : 0);
                    return true;
                case 90:
                    boolean zSendVoiceInvalidateTokenCommand = sendVoiceInvalidateTokenCommand();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceInvalidateTokenCommand ? 1 : 0);
                    return true;
                case 91:
                    boolean zSendVoiceMusicPlay = sendVoiceMusicPlay();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceMusicPlay ? 1 : 0);
                    return true;
                case 92:
                    boolean zSendVoiceMusicPause = sendVoiceMusicPause();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceMusicPause ? 1 : 0);
                    return true;
                case 93:
                    boolean zSendVoiceMusicNext = sendVoiceMusicNext();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceMusicNext ? 1 : 0);
                    return true;
                case 94:
                    boolean zSendVoiceMusicPREV = sendVoiceMusicPREV();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceMusicPREV ? 1 : 0);
                    return true;
                case 95:
                    boolean zSendVoiceRenderListCommand = sendVoiceRenderListCommand(parcel.readString(), parcel.readString(), parcel.createTypedArrayList(HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceRenderListCommand ? 1 : 0);
                    return true;
                case 96:
                    boolean zSendVoiceWeatherForecastCommand = sendVoiceWeatherForecastCommand(parcel.createTypedArrayList(HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceWeatherForecastCommand ? 1 : 0);
                    return true;
                case 97:
                    boolean zSendVoiceQuerySpeechText = sendVoiceQuerySpeechText(parcel.readString(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceQuerySpeechText ? 1 : 0);
                    return true;
                case 98:
                    boolean zSendVoiceCaption = sendVoiceCaption(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceCaption ? 1 : 0);
                    return true;
                case 99:
                    boolean zSendVoiceNetworkError = sendVoiceNetworkError();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceNetworkError ? 1 : 0);
                    return true;
                case 100:
                    boolean zSendVoiceNetworkDisable = sendVoiceNetworkDisable();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceNetworkDisable ? 1 : 0);
                    return true;
                case 101:
                    boolean zSendVoiceAsrTimeOut = sendVoiceAsrTimeOut();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceAsrTimeOut ? 1 : 0);
                    return true;
                case 102:
                    boolean zSendVoiceAsrNoContent = sendVoiceAsrNoContent();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceAsrNoContent ? 1 : 0);
                    return true;
                case 103:
                    boolean zSendVoiceTtsTimeout = sendVoiceTtsTimeout();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceTtsTimeout ? 1 : 0);
                    return true;
                case 104:
                    boolean zSendVoiceTtsNoContent = sendVoiceTtsNoContent();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceTtsNoContent ? 1 : 0);
                    return true;
                case 105:
                    boolean zSendVoiceUnknownErrorCommand = sendVoiceUnknownErrorCommand();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceUnknownErrorCommand ? 1 : 0);
                    return true;
                case 106:
                    boolean zSendVoiceNotSupportCommand = sendVoiceNotSupportCommand();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceNotSupportCommand ? 1 : 0);
                    return true;
                case 107:
                    boolean zSendVoiceQuietModeCommand = sendVoiceQuietModeCommand((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceQuietModeCommand ? 1 : 0);
                    return true;
                case 108:
                    boolean zSendVoiceExeCustomSkillCommand = sendVoiceExeCustomSkillCommand(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceExeCustomSkillCommand ? 1 : 0);
                    return true;
                case 109:
                    boolean zSendVoiceOpenBrightnessCommand = sendVoiceOpenBrightnessCommand();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceOpenBrightnessCommand ? 1 : 0);
                    return true;
                case 110:
                    boolean zSendVoiceDeltaBrightnessCommand = sendVoiceDeltaBrightnessCommand(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoiceDeltaBrightnessCommand ? 1 : 0);
                    return true;
                case 111:
                    boolean zSendVoicePercentBrightnessCommand = sendVoicePercentBrightnessCommand(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendVoicePercentBrightnessCommand ? 1 : 0);
                    return true;
                case 112:
                    boolean wearLocation = setWearLocation(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(wearLocation ? 1 : 0);
                    return true;
                case 113:
                    boolean zEnableWristBright = enableWristBright((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(zEnableWristBright ? 1 : 0);
                    return true;
                case 114:
                    boolean autoBacklight = setAutoBacklight((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(autoBacklight ? 1 : 0);
                    return true;
                case 115:
                    boolean weatherInfo = setWeatherInfo((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(weatherInfo ? 1 : 0);
                    return true;
                case 116:
                    boolean shortcutApp = setShortcutApp(parcel.createTypedArrayList(HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(shortcutApp ? 1 : 0);
                    return true;
                case 117:
                    addLFEventCallback(s.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 118:
                    observeHealthSettingChange(o.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 119:
                    boolean zSendMusicControl = sendMusicControl((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendMusicControl ? 1 : 0);
                    return true;
                case 120:
                    boolean zUpdateFindPhoneStatus = updateFindPhoneStatus(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(zUpdateFindPhoneStatus ? 1 : 0);
                    return true;
                case 121:
                    List<HuamiDataWrapper> remindersSync = getRemindersSync();
                    parcel2.writeNoException();
                    b.e(parcel2, remindersSync, 1);
                    return true;
                case 122:
                    boolean zSportNotifyTemperature = sportNotifyTemperature((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(zSportNotifyTemperature ? 1 : 0);
                    return true;
                case 123:
                    boolean zSportNotifyGpsState = sportNotifyGpsState((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(zSportNotifyGpsState ? 1 : 0);
                    return true;
                case 124:
                    boolean zSendGpsPoint = sendGpsPoint((Location) b.d(parcel, Location.CREATOR), parcel.readInt(), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendGpsPoint ? 1 : 0);
                    return true;
                case 125:
                    List<HuamiDataWrapper> alarms = getAlarms();
                    parcel2.writeNoException();
                    b.e(parcel2, alarms, 1);
                    return true;
                case 126:
                    HuamiDataWrapper batteryLevel = getBatteryLevel();
                    parcel2.writeNoException();
                    b.f(parcel2, batteryLevel, 1);
                    return true;
                case 127:
                    getDeviceLog((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE), h.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 128:
                    boolean zEnableSportHeartRate = enableSportHeartRate(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(zEnableSportHeartRate ? 1 : 0);
                    return true;
                case 129:
                    boolean zEnablePressure = enablePressure(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(zEnablePressure ? 1 : 0);
                    return true;
                case 130:
                    boolean zEnableRelax = enableRelax(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(zEnableRelax ? 1 : 0);
                    return true;
                case 131:
                    boolean hignHr = setHignHr(parcel.readInt() != 0, parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(hignHr ? 1 : 0);
                    return true;
                case 132:
                    boolean lowHr = setLowHr(parcel.readInt() != 0, parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(lowHr ? 1 : 0);
                    return true;
                case 133:
                    boolean zIsSportAlive = isSportAlive();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsSportAlive ? 1 : 0);
                    return true;
                case 134:
                    sendVoiceRebootCommand();
                    parcel2.writeNoException();
                    return true;
                case 135:
                    sendVoiceShutdownCommand();
                    parcel2.writeNoException();
                    return true;
                case 136:
                    startRealtimeMeasureHr(x.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 137:
                    boolean zStopRealtimeMeasureHr = stopRealtimeMeasureHr();
                    parcel2.writeNoException();
                    parcel2.writeInt(zStopRealtimeMeasureHr ? 1 : 0);
                    return true;
                case 138:
                    boolean menstruationTotalRecord = setMenstruationTotalRecord((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(menstruationTotalRecord ? 1 : 0);
                    return true;
                case 139:
                    HuamiDataWrapper menstruationTotalRecord2 = getMenstruationTotalRecord();
                    parcel2.writeNoException();
                    b.f(parcel2, menstruationTotalRecord2, 1);
                    return true;
                case 140:
                    HuamiDataWrapper menstruationConfig = getMenstruationConfig();
                    parcel2.writeNoException();
                    b.f(parcel2, menstruationConfig, 1);
                    return true;
                case 141:
                    boolean menstruationOvulation = setMenstruationOvulation(parcel.readInt() != 0, parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(menstruationOvulation ? 1 : 0);
                    return true;
                case 142:
                    boolean menstruationNotify = setMenstruationNotify(parcel.readInt() != 0, parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(menstruationNotify ? 1 : 0);
                    return true;
                case 143:
                    boolean zSwitchMenstruationDeviceNotify = switchMenstruationDeviceNotify(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(zSwitchMenstruationDeviceNotify ? 1 : 0);
                    return true;
                case 144:
                    boolean zSwitchSmartPredict = switchSmartPredict(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(zSwitchSmartPredict ? 1 : 0);
                    return true;
                case 145:
                    startSyncPaiData((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE), y.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 146:
                    startSyncPressureDataSingle(parcel.readLong(), (HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE), a0.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 147:
                    startSyncPressureDataAllDay(parcel.readLong(), (HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE), z.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 148:
                    boolean sedentary = setSedentary((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(sedentary ? 1 : 0);
                    return true;
                case 149:
                    boolean reminderSync = setReminderSync(parcel.createTypedArrayList(HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(reminderSync ? 1 : 0);
                    return true;
                case 150:
                    boolean unwearPassword = setUnwearPassword(parcel.readInt() != 0, parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(unwearPassword ? 1 : 0);
                    return true;
                case 151:
                    boolean appSort = setAppSort(parcel.createTypedArrayList(HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(appSort ? 1 : 0);
                    return true;
                case 152:
                    boolean worldClock = setWorldClock(parcel.createTypedArrayList(HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(worldClock ? 1 : 0);
                    return true;
                case 153:
                    List<HuamiDataWrapper> languages = getLanguages();
                    parcel2.writeNoException();
                    b.e(parcel2, languages, 1);
                    return true;
                case 154:
                    boolean language = setLanguage((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(language ? 1 : 0);
                    return true;
                case 155:
                    boolean zDisableBind = disableBind(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(zDisableBind ? 1 : 0);
                    return true;
                case 156:
                    boolean zEnableGoalRemind = enableGoalRemind(parcel.readInt() != 0, parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zEnableGoalRemind ? 1 : 0);
                    return true;
                case 157:
                    boolean zAlertFind = alertFind();
                    parcel2.writeNoException();
                    parcel2.writeInt(zAlertFind ? 1 : 0);
                    return true;
                case 158:
                    boolean zTestVibrate = testVibrate(parcel.createIntArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(zTestVibrate ? 1 : 0);
                    return true;
                case 159:
                    boolean zDeleteVibrate = deleteVibrate((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(zDeleteVibrate ? 1 : 0);
                    return true;
                case 160:
                    boolean zDefaultVibrate = defaultVibrate((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(zDefaultVibrate ? 1 : 0);
                    return true;
                case 161:
                    boolean vibrate = setVibrate((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE), parcel.readInt(), parcel.createIntArray());
                    parcel2.writeNoException();
                    parcel2.writeInt(vibrate ? 1 : 0);
                    return true;
                case 162:
                    boolean zEnableMultiLink = enableMultiLink(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(zEnableMultiLink ? 1 : 0);
                    return true;
                case 163:
                    boolean zUpdatePhoneMuteState = updatePhoneMuteState(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(zUpdatePhoneMuteState ? 1 : 0);
                    return true;
                case 164:
                    HuamiDataWrapper sportTypeConfig = getSportTypeConfig();
                    parcel2.writeNoException();
                    b.f(parcel2, sportTypeConfig, 1);
                    return true;
                case 165:
                    boolean zSendSportTypeSort = sendSportTypeSort((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendSportTypeSort ? 1 : 0);
                    return true;
                case 166:
                    boolean hidStatus = setHidStatus((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(hidStatus ? 1 : 0);
                    return true;
                case 167:
                    HuamiDataWrapper paiGoalData = getPaiGoalData(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    b.f(parcel2, paiGoalData, 1);
                    return true;
                case 168:
                    boolean dateTimeSync = setDateTimeSync((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(dateTimeSync ? 1 : 0);
                    return true;
                case 169:
                    boolean timeUnitSync = setTimeUnitSync(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(timeUnitSync ? 1 : 0);
                    return true;
                case 170:
                    setBatteryChangedCallback(c.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 171:
                    boolean zSupportFirstbeat = supportFirstbeat();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSupportFirstbeat ? 1 : 0);
                    return true;
                case 172:
                    boolean zDeleteAlertToDevice = deleteAlertToDevice(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zDeleteAlertToDevice ? 1 : 0);
                    return true;
                case 173:
                    boolean wristAndPinState = readWristAndPinState();
                    parcel2.writeNoException();
                    parcel2.writeInt(wristAndPinState ? 1 : 0);
                    return true;
                case 174:
                    boolean zHasSoftwareFeature = hasSoftwareFeature(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zHasSoftwareFeature ? 1 : 0);
                    return true;
                case 175:
                    boolean zHasBaseFeature = hasBaseFeature(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zHasBaseFeature ? 1 : 0);
                    return true;
                case 176:
                    boolean zHasHardwareFeature = hasHardwareFeature(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zHasHardwareFeature ? 1 : 0);
                    return true;
                case 177:
                    boolean zHasAlgoFeature = hasAlgoFeature(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zHasAlgoFeature ? 1 : 0);
                    return true;
                case 178:
                    startSyncSpO2Data((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE), w.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 179:
                    startSyncAtrialFibData((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE), com.xiaomi.wearable.hm.b.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 180:
                    boolean zEnableOsa = enableOsa(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(zEnableOsa ? 1 : 0);
                    return true;
                case 181:
                    int sleepBreathScore = getSleepBreathScore(parcel.readLong(), parcel.readLong(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(sleepBreathScore);
                    return true;
                case 182:
                    boolean zIsMiliMainLand = isMiliMainLand();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsMiliMainLand ? 1 : 0);
                    return true;
                case 183:
                    boolean zEnableConnectedAdv = enableConnectedAdv(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(zEnableConnectedAdv ? 1 : 0);
                    return true;
                case 184:
                    boolean zEnableHrBroadcast = enableHrBroadcast(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(zEnableHrBroadcast ? 1 : 0);
                    return true;
                case 185:
                    boolean cRSCode = getCRSCode();
                    parcel2.writeNoException();
                    parcel2.writeInt(cRSCode ? 1 : 0);
                    return true;
                case 186:
                    ApduResponse apduResponseNfcLoadService = nfcLoadService(parcel.createByteArray());
                    parcel2.writeNoException();
                    b.f(parcel2, apduResponseNfcLoadService, 1);
                    return true;
                case 187:
                    boolean zUpdatePasswordInteraction = updatePasswordInteraction(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeInt(zUpdatePasswordInteraction ? 1 : 0);
                    return true;
                case 188:
                    boolean passwordInteraction = setPasswordInteraction();
                    parcel2.writeNoException();
                    parcel2.writeInt(passwordInteraction ? 1 : 0);
                    return true;
                case 189:
                    HuamiDataWrapper huamiDataWrapperPasswordInteraction = passwordInteraction();
                    parcel2.writeNoException();
                    b.f(parcel2, huamiDataWrapperPasswordInteraction, 1);
                    return true;
                case 190:
                    writeSleepBack(u.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 191:
                    boolean zSendSportNoTimerConfig = sendSportNoTimerConfig((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE), k.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    parcel2.writeInt(zSendSportNoTimerConfig ? 1 : 0);
                    return true;
                case 192:
                    setStepCallback(r.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 193:
                    boolean displayListSync = setDisplayListSync(parcel.readInt(), parcel.createTypedArrayList(HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(displayListSync ? 1 : 0);
                    return true;
                case 194:
                    boolean zEnableSpo2 = enableSpo2(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(zEnableSpo2 ? 1 : 0);
                    return true;
                case 195:
                    boolean lowSpo2 = setLowSpo2(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(lowSpo2 ? 1 : 0);
                    return true;
                case 196:
                    boolean zWriteSettingSync = writeSettingSync((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(zWriteSettingSync ? 1 : 0);
                    return true;
                case 197:
                    HuamiDataWrapper huamiDataWrapperQuerySettingSync = querySettingSync((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    b.f(parcel2, huamiDataWrapperQuerySettingSync, 1);
                    return true;
                case 198:
                    syncDataToDevice(parcel.createTypedArrayList(HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    return true;
                case 199:
                    HuamiDataWrapper.Companion companion3 = HuamiDataWrapper.INSTANCE;
                    startSyncFirstbeatData((HuamiDataWrapper) b.d(parcel, companion3), (HuamiDataWrapper) b.d(parcel, companion3), i.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 200:
                    boolean zAlertMiuiAlarm = alertMiuiAlarm(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zAlertMiuiAlarm ? 1 : 0);
                    return true;
                case 201:
                    int iUnWearStatus = unWearStatus();
                    parcel2.writeNoException();
                    parcel2.writeInt(iUnWearStatus);
                    return true;
                case 202:
                    boolean zIsSupportCardTimeSwitchSync = isSupportCardTimeSwitchSync();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsSupportCardTimeSwitchSync ? 1 : 0);
                    return true;
                case 203:
                    List<HuamiDataWrapper> listQuerySwitchCardTimeSync = querySwitchCardTimeSync(parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    b.e(parcel2, listQuerySwitchCardTimeSync, 1);
                    return true;
                case 204:
                    int timeSwitchCardSync = setTimeSwitchCardSync((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(timeSwitchCardSync);
                    return true;
                case 205:
                    boolean zDeleteSwitchCardTimeSync = deleteSwitchCardTimeSync((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(zDeleteSwitchCardTimeSync ? 1 : 0);
                    return true;
                case 206:
                    boolean zSyncStandAlertConfig = syncStandAlertConfig((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(zSyncStandAlertConfig ? 1 : 0);
                    return true;
                case 207:
                    startHttpProxy(l.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 208:
                    startWeatherHttpProxy((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    return true;
                case 209:
                    stopHttpProxy();
                    parcel2.writeNoException();
                    return true;
                case 210:
                    List<HuamiDataWrapper> listQueryCityList = queryCityList();
                    parcel2.writeNoException();
                    b.e(parcel2, listQueryCityList, 1);
                    return true;
                case 211:
                    boolean zWriteCityList = writeCityList(parcel.createTypedArrayList(HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(zWriteCityList ? 1 : 0);
                    return true;
                case 212:
                    boolean zModifyCity = modifyCity((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE), parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(zModifyCity ? 1 : 0);
                    return true;
                case 213:
                    boolean zUpdateWeatherSettings = updateWeatherSettings((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(zUpdateWeatherSettings ? 1 : 0);
                    return true;
                case 214:
                    HuamiDataWrapper huamiDataWrapperQueryWeatherSettings = queryWeatherSettings();
                    parcel2.writeNoException();
                    b.f(parcel2, huamiDataWrapperQueryWeatherSettings, 1);
                    return true;
                case 215:
                    boolean weatherTemperatureUnit = setWeatherTemperatureUnit(parcel.readByte());
                    parcel2.writeNoException();
                    parcel2.writeInt(weatherTemperatureUnit ? 1 : 0);
                    return true;
                case 216:
                    queryData(parcel.createLongArray(), q.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 217:
                    addOrUpdate((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    return true;
                case 218:
                    boolean token = setToken();
                    parcel2.writeNoException();
                    parcel2.writeInt(token ? 1 : 0);
                    return true;
                case 219:
                    syncActivityDataToDevice((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    return true;
                case 220:
                    syncActivityDataFromDevice((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE), com.xiaomi.wearable.hm.a.AbstractBinderC0864a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 221:
                    delete(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 222:
                    boolean zSupportNightModeSetting = supportNightModeSetting();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSupportNightModeSetting ? 1 : 0);
                    return true;
                case 223:
                    List<HuamiDataWrapper> listQueryDisplayListSync = queryDisplayListSync(parcel.readInt());
                    parcel2.writeNoException();
                    b.e(parcel2, listQueryDisplayListSync, 1);
                    return true;
                case 224:
                    boolean multiTarget = setMultiTarget((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    parcel2.writeInt(multiTarget ? 1 : 0);
                    return true;
                case 225:
                    boolean zIsSupportActivityData = isSupportActivityData();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsSupportActivityData ? 1 : 0);
                    return true;
                case TRANSACTION_supportSilentUpgrade /* 226 */:
                    boolean zSupportSilentUpgrade = supportSilentUpgrade();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSupportSilentUpgrade ? 1 : 0);
                    return true;
                case TRANSACTION_isSilentUpgradePushed /* 227 */:
                    boolean zIsSilentUpgradePushed = isSilentUpgradePushed();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsSilentUpgradePushed ? 1 : 0);
                    return true;
                case TRANSACTION_disableHid /* 228 */:
                    boolean zDisableHid = disableHid();
                    parcel2.writeNoException();
                    parcel2.writeInt(zDisableHid ? 1 : 0);
                    return true;
                case TRANSACTION_showContactInDevice /* 229 */:
                    boolean zShowContactInDevice = showContactInDevice(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(zShowContactInDevice ? 1 : 0);
                    return true;
                case 230:
                    cancelSilentUpgradeIfNeed();
                    parcel2.writeNoException();
                    return true;
                case 231:
                    enableRealtimeStep(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    return true;
                case 232:
                    List<HuamiDataWrapper> restHeartRate = getRestHeartRate((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    b.e(parcel2, restHeartRate, 1);
                    return true;
                case TRANSACTION_registerBTExceptionListener /* 233 */:
                    registerBTExceptionListener(g.a.asInterface(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_setActivityMode /* 234 */:
                    boolean activityMode = setActivityMode(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(activityMode ? 1 : 0);
                    return true;
                case TRANSACTION_getHeartRateConfig /* 235 */:
                    int heartRateConfig = getHeartRateConfig();
                    parcel2.writeNoException();
                    parcel2.writeInt(heartRateConfig);
                    return true;
                case TRANSACTION_getAtrialFibEnable /* 236 */:
                    boolean atrialFibEnable = getAtrialFibEnable();
                    parcel2.writeNoException();
                    parcel2.writeInt(atrialFibEnable ? 1 : 0);
                    return true;
                case TRANSACTION_setAtrialFibEnable /* 237 */:
                    boolean atrialFibEnable2 = setAtrialFibEnable(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(atrialFibEnable2 ? 1 : 0);
                    return true;
                case TRANSACTION_getHrReminder /* 238 */:
                    int hrReminder = getHrReminder();
                    parcel2.writeNoException();
                    parcel2.writeInt(hrReminder);
                    return true;
                case 239:
                    boolean hrReminderEnable = getHrReminderEnable();
                    parcel2.writeNoException();
                    parcel2.writeInt(hrReminderEnable ? 1 : 0);
                    return true;
                case 240:
                    int lowHrReminder = getLowHrReminder();
                    parcel2.writeNoException();
                    parcel2.writeInt(lowHrReminder);
                    return true;
                case TRANSACTION_getLowHrReminderEnable /* 241 */:
                    boolean lowHrReminderEnable = getLowHrReminderEnable();
                    parcel2.writeNoException();
                    parcel2.writeInt(lowHrReminderEnable ? 1 : 0);
                    return true;
                case TRANSACTION_getSmartSpo2Enable /* 242 */:
                    boolean smartSpo2Enable = getSmartSpo2Enable();
                    parcel2.writeNoException();
                    parcel2.writeInt(smartSpo2Enable ? 1 : 0);
                    return true;
                case TRANSACTION_getLowSpo2AlertValue /* 243 */:
                    int lowSpo2AlertValue = getLowSpo2AlertValue();
                    parcel2.writeNoException();
                    parcel2.writeInt(lowSpo2AlertValue);
                    return true;
                case TRANSACTION_getSleepAssistantEnable /* 244 */:
                    boolean sleepAssistantEnable = getSleepAssistantEnable();
                    parcel2.writeNoException();
                    parcel2.writeInt(sleepAssistantEnable ? 1 : 0);
                    return true;
                case TRANSACTION_getOsaEnable /* 245 */:
                    boolean osaEnable = getOsaEnable();
                    parcel2.writeNoException();
                    parcel2.writeInt(osaEnable ? 1 : 0);
                    return true;
                case TRANSACTION_getPressureEnable /* 246 */:
                    boolean pressureEnable = getPressureEnable();
                    parcel2.writeNoException();
                    parcel2.writeInt(pressureEnable ? 1 : 0);
                    return true;
                case TRANSACTION_getPressureAlertEnable /* 247 */:
                    boolean pressureAlertEnable = getPressureAlertEnable();
                    parcel2.writeNoException();
                    parcel2.writeInt(pressureAlertEnable ? 1 : 0);
                    return true;
                case TRANSACTION_enableHeart /* 248 */:
                    boolean zEnableHeart = enableHeart(parcel.readInt() != 0, parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zEnableHeart ? 1 : 0);
                    return true;
                case TRANSACTION_enableHeartAndSleep /* 249 */:
                    boolean zEnableHeartAndSleep = enableHeartAndSleep(parcel.readInt() != 0, parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zEnableHeartAndSleep ? 1 : 0);
                    return true;
                case 250:
                    boolean zEnableSleep = enableSleep(parcel.readInt() != 0);
                    parcel2.writeNoException();
                    parcel2.writeInt(zEnableSleep ? 1 : 0);
                    return true;
                case 251:
                    boolean zSupportHrDetection = supportHrDetection();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSupportHrDetection ? 1 : 0);
                    return true;
                case 252:
                    int[] watchFacesAllSync = getWatchFacesAllSync();
                    parcel2.writeNoException();
                    parcel2.writeIntArray(watchFacesAllSync);
                    return true;
                case 253:
                    boolean lockStatus = getLockStatus();
                    parcel2.writeNoException();
                    parcel2.writeInt(lockStatus ? 1 : 0);
                    return true;
                case 254:
                    destory();
                    parcel2.writeNoException();
                    return true;
                case 255:
                    boolean zIsSupportDialFontCustomColor = isSupportDialFontCustomColor();
                    parcel2.writeNoException();
                    parcel2.writeInt(zIsSupportDialFontCustomColor ? 1 : 0);
                    return true;
                case 256:
                    deleteBySource(parcel.createIntArray());
                    parcel2.writeNoException();
                    return true;
                case TRANSACTION_shutdown /* 257 */:
                    shutdown();
                    parcel2.writeNoException();
                    return true;
                case 258:
                    setHrMaxValue(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 259:
                    List<HuamiDataWrapper> lowOsaDetectionData = getLowOsaDetectionData((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    b.e(parcel2, lowOsaDetectionData, 1);
                    return true;
                case TRANSACTION_getHrDetectionData /* 260 */:
                    List<HuamiDataWrapper> hrDetectionData = getHrDetectionData((HuamiDataWrapper) b.d(parcel, HuamiDataWrapper.INSTANCE));
                    parcel2.writeNoException();
                    b.e(parcel2, hrDetectionData, 1);
                    return true;
                case 261:
                    boolean zSupportHrDetectionData = supportHrDetectionData();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSupportHrDetectionData ? 1 : 0);
                    return true;
                case TRANSACTION_supportLowOsaData /* 262 */:
                    boolean zSupportLowOsaData = supportLowOsaData();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSupportLowOsaData ? 1 : 0);
                    return true;
                case TRANSACTION_muteMiuiAlarm /* 263 */:
                    boolean zMuteMiuiAlarm = muteMiuiAlarm(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(zMuteMiuiAlarm ? 1 : 0);
                    return true;
                case TRANSACTION_supportLinkageMiuiAlarm /* 264 */:
                    boolean zSupportLinkageMiuiAlarm = supportLinkageMiuiAlarm();
                    parcel2.writeNoException();
                    parcel2.writeInt(zSupportLinkageMiuiAlarm ? 1 : 0);
                    return true;
                case TRANSACTION_syncStatisticData /* 265 */:
                    List<HuamiDataWrapper> listSyncStatisticData = syncStatisticData();
                    parcel2.writeNoException();
                    b.e(parcel2, listSyncStatisticData, 1);
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
    }

    public static class b {
        public static <T> T d(Parcel parcel, Parcelable.Creator<T> creator) {
            if (parcel.readInt() != 0) {
                return creator.createFromParcel(parcel);
            }
            return null;
        }

        public static <T extends Parcelable> void e(Parcel parcel, List<T> list, int i) {
            if (list == null) {
                parcel.writeInt(-1);
                return;
            }
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                f(parcel, list.get(i2), i);
            }
        }

        public static <T extends Parcelable> void f(Parcel parcel, T t, int i) {
            if (t == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                t.writeToParcel(parcel, i);
            }
        }
    }

    void addLFEventCallback(s sVar) throws RemoteException;

    void addOrUpdate(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    boolean alertApp(HuamiDataWrapper huamiDataWrapper, int i, String str, String str2, String str3) throws RemoteException;

    boolean alertFind() throws RemoteException;

    boolean alertGenericApp(int i, String str, String str2, String str3) throws RemoteException;

    boolean alertHongbao(int i) throws RemoteException;

    boolean alertInCall(String str, String str2) throws RemoteException;

    boolean alertInCallStop() throws RemoteException;

    boolean alertMiuiAlarm(int i) throws RemoteException;

    boolean alertSms(int i, String str, String str2, String str3) throws RemoteException;

    boolean alertWeather(String str, String str2) throws RemoteException;

    void cancelFwUpgrade() throws RemoteException;

    void cancelSilentUpgradeIfNeed() throws RemoteException;

    HuamiDataWrapper closeApduChannel() throws RemoteException;

    void connect(n nVar) throws RemoteException;

    boolean continueVoiceCommand() throws RemoteException;

    boolean defaultVibrate(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    void delete(long j) throws RemoteException;

    boolean deleteAlertToDevice(int i) throws RemoteException;

    void deleteBySource(int[] iArr) throws RemoteException;

    boolean deleteSwitchCardTimeSync(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    boolean deleteVibrate(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    void destory() throws RemoteException;

    boolean deviceSportStop() throws RemoteException;

    boolean disableBind(boolean z) throws RemoteException;

    boolean disableHid() throws RemoteException;

    void disconnect() throws RemoteException;

    boolean enableConnectedAdv(boolean z) throws RemoteException;

    boolean enableGoalRemind(boolean z, int i) throws RemoteException;

    boolean enableHeart(boolean z, int i) throws RemoteException;

    boolean enableHeartAndSleep(boolean z, int i) throws RemoteException;

    boolean enableHrBroadcast(boolean z) throws RemoteException;

    boolean enableMultiLink(boolean z) throws RemoteException;

    boolean enableOsa(boolean z) throws RemoteException;

    boolean enablePressure(boolean z) throws RemoteException;

    void enableRealtimeStep(boolean z) throws RemoteException;

    boolean enableRelax(boolean z) throws RemoteException;

    boolean enableSleep(boolean z) throws RemoteException;

    boolean enableSpo2(boolean z) throws RemoteException;

    boolean enableSportHeartRate(boolean z) throws RemoteException;

    boolean enableWristBright(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    List<HuamiDataWrapper> getAlarms() throws RemoteException;

    boolean getAtrialFibEnable() throws RemoteException;

    HuamiDataWrapper getBatteryLevel() throws RemoteException;

    boolean getCRSCode() throws RemoteException;

    HuamiDataWrapper getDailyData(long j, int i, HuamiDataWrapper huamiDataWrapper, List<HuamiDataWrapper> list, boolean z, e eVar) throws RemoteException;

    HuamiDataWrapper getDeviceInfo() throws RemoteException;

    void getDeviceLog(HuamiDataWrapper huamiDataWrapper, h hVar) throws RemoteException;

    int getHeartRateConfig() throws RemoteException;

    HuamiDataWrapper getHrData(long j, int i) throws RemoteException;

    List<HuamiDataWrapper> getHrDetectionData(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    int getHrReminder() throws RemoteException;

    boolean getHrReminderEnable() throws RemoteException;

    List<HuamiDataWrapper> getLanguages() throws RemoteException;

    boolean getLockStatus() throws RemoteException;

    int getLowHrReminder() throws RemoteException;

    boolean getLowHrReminderEnable() throws RemoteException;

    List<HuamiDataWrapper> getLowOsaDetectionData(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    int getLowSpo2AlertValue() throws RemoteException;

    HuamiDataWrapper getMenstruationConfig() throws RemoteException;

    HuamiDataWrapper getMenstruationTotalRecord() throws RemoteException;

    HuamiDataWrapper getNfcCardInfoSync() throws RemoteException;

    boolean getOsaEnable() throws RemoteException;

    HuamiDataWrapper getPaiGoalData(int i, int i2, int i3, int i4, int i5) throws RemoteException;

    boolean getPressureAlertEnable() throws RemoteException;

    boolean getPressureEnable() throws RemoteException;

    HuamiDataWrapper getRealtimeData() throws RemoteException;

    List<HuamiDataWrapper> getRemindersSync() throws RemoteException;

    List<HuamiDataWrapper> getRestHeartRate(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    String getSkinPath(String str, List<String> list, byte[] bArr) throws RemoteException;

    boolean getSleepAssistantEnable() throws RemoteException;

    int getSleepBreathScore(long j, long j2, int i) throws RemoteException;

    boolean getSmartSpo2Enable() throws RemoteException;

    HuamiDataWrapper getSportTypeConfig() throws RemoteException;

    int getSteps() throws RemoteException;

    HuamiDataWrapper getUserInfoSync() throws RemoteException;

    String getVersionName() throws RemoteException;

    int[] getWatchFacesAllSync() throws RemoteException;

    boolean hasAlgoFeature(int i) throws RemoteException;

    boolean hasBaseFeature(int i) throws RemoteException;

    boolean hasHardwareFeature(int i) throws RemoteException;

    boolean hasSoftwareFeature(int i) throws RemoteException;

    void initListener() throws RemoteException;

    void invokeUpgrade(p pVar) throws RemoteException;

    boolean isConnected() throws RemoteException;

    boolean isMiliMainLand() throws RemoteException;

    boolean isSilentUpgradePushed() throws RemoteException;

    boolean isSportAlive() throws RemoteException;

    boolean isSupportActivityData() throws RemoteException;

    boolean isSupportCardTimeSwitchSync() throws RemoteException;

    boolean isSupportDialFontCustomColor() throws RemoteException;

    boolean modifyCity(HuamiDataWrapper huamiDataWrapper, boolean z) throws RemoteException;

    boolean muteMiuiAlarm(int i) throws RemoteException;

    ApduResponse nfcLoadService(byte[] bArr) throws RemoteException;

    void observeHealthSettingChange(o oVar) throws RemoteException;

    byte[] onGetSignData(byte[] bArr, byte[] bArr2, int i) throws RemoteException;

    HuamiDataWrapper openApduChannel() throws RemoteException;

    HuamiDataWrapper passwordInteraction() throws RemoteException;

    List<HuamiDataWrapper> queryCityList() throws RemoteException;

    void queryData(long[] jArr, q qVar) throws RemoteException;

    List<HuamiDataWrapper> queryDisplayListSync(int i) throws RemoteException;

    HuamiDataWrapper querySettingSync(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    List<HuamiDataWrapper> querySwitchCardTimeSync(String str, int i) throws RemoteException;

    HuamiDataWrapper queryWeatherSettings() throws RemoteException;

    boolean readWristAndPinState() throws RemoteException;

    void registerBTExceptionListener(g gVar) throws RemoteException;

    void retryFwUpgrade() throws RemoteException;

    ApduResponse sendApduData(ApduRequest apduRequest) throws RemoteException;

    boolean sendGpsPoint(Location location, int i, boolean z) throws RemoteException;

    boolean sendMusicControl(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    void sendReplyResult(boolean z) throws RemoteException;

    void sendSmsPermission(boolean z) throws RemoteException;

    boolean sendSportNoTimerConfig(HuamiDataWrapper huamiDataWrapper, k kVar) throws RemoteException;

    boolean sendSportTypeSort(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    boolean sendVoiceAsrNoContent() throws RemoteException;

    boolean sendVoiceAsrTimeOut() throws RemoteException;

    boolean sendVoiceCaption(String str) throws RemoteException;

    boolean sendVoiceCloseAlarmCommand() throws RemoteException;

    boolean sendVoiceCloseReminderCommand(String str) throws RemoteException;

    boolean sendVoiceDeleteAlarmCommand(String str) throws RemoteException;

    boolean sendVoiceDeleteAlarmCommandList(List<String> list) throws RemoteException;

    boolean sendVoiceDeleteReminderCommand(String str) throws RemoteException;

    boolean sendVoiceDeleteReminderCommandList(List<String> list) throws RemoteException;

    boolean sendVoiceDeleteTimerCommand() throws RemoteException;

    boolean sendVoiceDeleteTimerCommandList(List<String> list) throws RemoteException;

    boolean sendVoiceDeltaBrightnessCommand(int i) throws RemoteException;

    boolean sendVoiceExeCustomSkillCommand(String str) throws RemoteException;

    boolean sendVoiceFindPhoneCommand() throws RemoteException;

    boolean sendVoiceInvalidateTokenCommand() throws RemoteException;

    boolean sendVoiceMusicNext() throws RemoteException;

    boolean sendVoiceMusicPREV() throws RemoteException;

    boolean sendVoiceMusicPause() throws RemoteException;

    boolean sendVoiceMusicPlay() throws RemoteException;

    boolean sendVoiceNavigateToMainPageCommand() throws RemoteException;

    boolean sendVoiceNetworkDisable() throws RemoteException;

    boolean sendVoiceNetworkError() throws RemoteException;

    boolean sendVoiceNfcCommand(int i) throws RemoteException;

    boolean sendVoiceNotSupportCommand() throws RemoteException;

    boolean sendVoiceOpenAlarmCommand() throws RemoteException;

    boolean sendVoiceOpenBrightnessCommand() throws RemoteException;

    boolean sendVoiceOpenReminderCommand(String str) throws RemoteException;

    boolean sendVoiceOpenTimerCommand() throws RemoteException;

    boolean sendVoicePercentBrightnessCommand(int i) throws RemoteException;

    boolean sendVoiceQueryAlarmCommand() throws RemoteException;

    boolean sendVoiceQueryReminderCommand(String str) throws RemoteException;

    boolean sendVoiceQuerySpeechText(String str, boolean z) throws RemoteException;

    boolean sendVoiceQuietModeCommand(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    boolean sendVoiceReadyCommand(List<String> list) throws RemoteException;

    void sendVoiceRebootCommand() throws RemoteException;

    boolean sendVoiceRenderListCommand(String str, String str2, List<HuamiDataWrapper> list) throws RemoteException;

    boolean sendVoiceSetAlarmCommand(String str, String str2, String str3, int i) throws RemoteException;

    boolean sendVoiceSetAlarmCommandList(List<String> list, long j, int i) throws RemoteException;

    boolean sendVoiceSetReminderCommand(String str, String str2, String str3, String str4, int i) throws RemoteException;

    boolean sendVoiceSetReminderCommandList(List<String> list, String str, long j, int i) throws RemoteException;

    boolean sendVoiceSetTimerCommand(String str, String str2) throws RemoteException;

    boolean sendVoiceSetTimerCommandForAlexa(String str, String str2) throws RemoteException;

    boolean sendVoiceSetTimerCommandList(long j, String str) throws RemoteException;

    void sendVoiceShutdownCommand() throws RemoteException;

    boolean sendVoiceTtsNoContent() throws RemoteException;

    boolean sendVoiceTtsTimeout() throws RemoteException;

    boolean sendVoiceUnknownErrorCommand() throws RemoteException;

    boolean sendVoiceWearableCommand(String str) throws RemoteException;

    boolean sendVoiceWeatherForecastCommand(List<HuamiDataWrapper> list) throws RemoteException;

    boolean setAccessInfo(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    boolean setActivityMode(int i) throws RemoteException;

    boolean setAidInfo(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    boolean setAlarmSync(List<HuamiDataWrapper> list) throws RemoteException;

    boolean setAppSort(List<HuamiDataWrapper> list) throws RemoteException;

    boolean setAtrialFibEnable(boolean z) throws RemoteException;

    void setAuthKey(String str) throws RemoteException;

    boolean setAutoBacklight(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    void setAutoReconnect(boolean z) throws RemoteException;

    void setBatteryChangedCallback(c cVar) throws RemoteException;

    void setCallReplyDelegate(d dVar) throws RemoteException;

    void setCallback(n nVar) throws RemoteException;

    boolean setDateTimeSync(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    boolean setDisplayListSync(int i, List<HuamiDataWrapper> list) throws RemoteException;

    boolean setGoal(int i) throws RemoteException;

    boolean setHidStatus(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    boolean setHignHr(boolean z, int i) throws RemoteException;

    void setHrMaxValue(int i) throws RemoteException;

    boolean setLanguage(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    boolean setLowHr(boolean z, int i) throws RemoteException;

    boolean setLowSpo2(int i) throws RemoteException;

    boolean setMenstruationNotify(boolean z, int i) throws RemoteException;

    boolean setMenstruationOvulation(boolean z, int i) throws RemoteException;

    boolean setMenstruationTotalRecord(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    boolean setMultiTarget(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    void setPair(boolean z) throws RemoteException;

    boolean setPasswordInteraction() throws RemoteException;

    boolean setReminderSync(List<HuamiDataWrapper> list) throws RemoteException;

    boolean setSedentary(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    boolean setShortcutApp(List<HuamiDataWrapper> list) throws RemoteException;

    void setStepCallback(r rVar) throws RemoteException;

    int setTimeSwitchCardSync(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    boolean setTimeUnitSync(boolean z) throws RemoteException;

    boolean setToken() throws RemoteException;

    boolean setUnwearPassword(boolean z, String str) throws RemoteException;

    boolean setUserInfoSync(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    boolean setVibrate(HuamiDataWrapper huamiDataWrapper, int i, int[] iArr) throws RemoteException;

    void setVoiceCallback(c0 c0Var) throws RemoteException;

    boolean setWearLocation(boolean z) throws RemoteException;

    boolean setWeatherInfo(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    boolean setWeatherTemperatureUnit(byte b2) throws RemoteException;

    boolean setWorldClock(List<HuamiDataWrapper> list) throws RemoteException;

    boolean showContactInDevice(boolean z) throws RemoteException;

    void shutdown() throws RemoteException;

    void smsDelete(int i, v vVar) throws RemoteException;

    void smsQueryData(v vVar) throws RemoteException;

    void smsSyncMsg(List<HuamiDataWrapper> list, v vVar) throws RemoteException;

    boolean sportConfig(HuamiDataWrapper huamiDataWrapper, k kVar) throws RemoteException;

    boolean sportNotifyGpsState(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    boolean sportNotifyHr(int i) throws RemoteException;

    boolean sportNotifyKm(float f, int i) throws RemoteException;

    boolean sportNotifyPace(int i) throws RemoteException;

    boolean sportNotifyTemperature(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    boolean sportPause() throws RemoteException;

    boolean sportResume(int i) throws RemoteException;

    boolean sportShow(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    boolean sportStart(int i, int i2) throws RemoteException;

    boolean sportStop() throws RemoteException;

    void startHttpProxy(l lVar) throws RemoteException;

    void startRealtimeMeasureHr(x xVar) throws RemoteException;

    void startSyncAtrialFibData(HuamiDataWrapper huamiDataWrapper, com.xiaomi.wearable.hm.b bVar) throws RemoteException;

    void startSyncFirstbeatData(HuamiDataWrapper huamiDataWrapper, HuamiDataWrapper huamiDataWrapper2, i iVar) throws RemoteException;

    void startSyncGpsData(HuamiDataWrapper huamiDataWrapper, j jVar) throws RemoteException;

    void startSyncPaiData(HuamiDataWrapper huamiDataWrapper, y yVar) throws RemoteException;

    void startSyncPressureDataAllDay(long j, HuamiDataWrapper huamiDataWrapper, z zVar) throws RemoteException;

    void startSyncPressureDataSingle(long j, HuamiDataWrapper huamiDataWrapper, a0 a0Var) throws RemoteException;

    void startSyncSpO2Data(HuamiDataWrapper huamiDataWrapper, w wVar) throws RemoteException;

    void startWeatherHttpProxy(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    void stopHttpProxy() throws RemoteException;

    boolean stopRealtimeMeasureHr() throws RemoteException;

    boolean stopVoiceCommand() throws RemoteException;

    void storageStatus(String str, t tVar) throws RemoteException;

    boolean supportFirstbeat() throws RemoteException;

    boolean supportHrDetection() throws RemoteException;

    boolean supportHrDetectionData() throws RemoteException;

    boolean supportLinkageMiuiAlarm() throws RemoteException;

    boolean supportLowOsaData() throws RemoteException;

    boolean supportNightModeSetting() throws RemoteException;

    boolean supportSilentUpgrade() throws RemoteException;

    boolean switchMenstruationDeviceNotify(boolean z) throws RemoteException;

    boolean switchSmartPredict(boolean z) throws RemoteException;

    void syncActivityDataFromDevice(HuamiDataWrapper huamiDataWrapper, com.xiaomi.wearable.hm.a aVar) throws RemoteException;

    void syncActivityDataToDevice(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    void syncDataToDevice(List<HuamiDataWrapper> list) throws RemoteException;

    void syncSkin(String str, b0 b0Var) throws RemoteException;

    boolean syncStandAlertConfig(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    List<HuamiDataWrapper> syncStatisticData() throws RemoteException;

    boolean testVibrate(int[] iArr) throws RemoteException;

    boolean triggerPair() throws RemoteException;

    int unWearStatus() throws RemoteException;

    boolean unbindSync() throws RemoteException;

    void updateDid(String str) throws RemoteException;

    boolean updateFindPhoneStatus(boolean z) throws RemoteException;

    void updateFwUpgrade(boolean z, int i, Map map, String str, f fVar) throws RemoteException;

    HuamiDataWrapper updateNfcCardConfig(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    boolean updateNfcCardList(List<HuamiDataWrapper> list, HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    boolean updatePasswordInteraction(String str) throws RemoteException;

    boolean updatePhoneMuteState(boolean z) throws RemoteException;

    boolean updateWeatherSettings(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    boolean writeCityList(List<HuamiDataWrapper> list) throws RemoteException;

    boolean writeSettingSync(HuamiDataWrapper huamiDataWrapper) throws RemoteException;

    void writeSleepBack(u uVar) throws RemoteException;
}
