package com.huawei.health.devicemgr.business.entity;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import defpackage.cpu;
import defpackage.ede;

/* JADX INFO: loaded from: classes2.dex */
public class DeviceCapability implements Parcelable {
    public static final Parcelable.Creator<DeviceCapability> CREATOR = new Parcelable.Creator<DeviceCapability>() { // from class: com.huawei.health.devicemgr.business.entity.DeviceCapability.3
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public DeviceCapability[] newArray(int i) {
            return new DeviceCapability[i];
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public DeviceCapability createFromParcel(Parcel parcel) {
            return new ede().a(parcel);
        }
    };
    public static final int DEFAULT_EVENT_ALARM_NUMBER = 5;
    public static final int DEFAULT_SMART_WATCH_VERSION_VALUE = 0;
    public static final int DEVICE_DATA_TYPE_AF = 4;
    public static final int DEVICE_DATA_TYPE_COMMON = 1;
    public static final int DEVICE_DATA_TYPE_COMPRESSED = 0;
    public static final int DEVICE_DATA_TYPE_SEPARATED = 3;
    public static final int MOTION_GOAL_CAP_CALORIE = 2;
    public static final int MOTION_GOAL_CAP_DISTANCE = 4;
    public static final int MOTION_GOAL_CAP_STEPS = 1;
    private boolean isSupportTimeSetting = false;
    private boolean isSupportGetFirmwareVersion = false;
    private boolean isSupportGetBattery = false;
    private boolean isSupportAutoLightScreen = false;
    private boolean isSupportAvoidDisturb = false;
    private boolean isSupportFactoryReset = false;
    private boolean isSupportPairDevice = false;
    private boolean isSupportGetHandsetInfo = false;
    private boolean isSupportNotificationIntervalInfo = false;
    private boolean isSupportActivityType = false;
    private boolean isSupportAuthenticDevice = false;
    private boolean isSupportGoldCard = false;
    private boolean isSupportRemoteCamera = false;
    private boolean isSupportMessageAlert = false;
    private boolean isSupportMessageAlertInfo = false;
    private boolean isSupportMessageSupportInfo = false;
    private boolean isSupportDeleteMsg = false;
    private boolean isSupportMessageCenterPushDevice = false;
    private boolean isSupportWearMessagePush = false;
    private boolean isSupportIntelligentHomeLinkage = false;
    private boolean isSupportContacts = false;
    private boolean isSupportCallingOperationType = false;
    private boolean isSupportSportTotal = false;
    private int motionGoalCap = 1;
    private int fitnessFrameType = 0;
    private boolean isSupportActivityReminder = false;
    private boolean isSupportSetUserInfoEncrypt = false;
    private boolean isSupportSampleFrame = false;
    private boolean isSupportThreshold = false;
    private boolean isSupportReserveSync = false;
    private boolean isSupportHeartRateZone = false;
    private boolean isSupportCoreSleep = false;
    private boolean isSupportGetUserInfo = false;
    private boolean isSupportHeartRateEnable = false;
    private boolean isSupportSendCoreSleepOutState = false;
    private boolean isSupportQueryCoreSleepSwitch = false;
    private boolean isSupportEventAlarm = false;
    private int eventAlarmNum = 5;
    private int smartWatchVersionTypeValue = 0;
    private boolean isSupportSmartAlarm = false;
    private boolean isSupportOtaUpdate = false;
    private boolean isSupportMaintenance = false;
    private boolean isSupportMaintenanceInTime = false;
    private boolean isSupportMaintenanceGetData = false;
    private boolean isSupportAntiLost = false;
    private boolean isSupportBluetoothOffAlert = false;
    private boolean isSupportLanguage = false;
    private boolean isSupportAtmosphereSupportExpand = false;
    private boolean isSupportWeatherSupportErrorCode = false;
    private boolean isSupportWeatherPush = false;
    private boolean isSupportExerciseAdvice = false;
    private boolean isSupportExerciseAdviceTime = false;
    private boolean isSupportExerciseAdviceMonitor = false;
    private boolean isSupportWorkout = false;
    private boolean isSupportWorkoutInfo = false;
    private boolean isSupportWorkoutReminder = false;
    private boolean isSupportWorkoutRecord = false;
    private boolean isSupportWorkoutExerciseDisplayLink = false;
    private boolean isSupportWorkoutRecordPaceMap = false;
    private boolean isSupportWorkoutCapabilicy = false;
    private boolean isSupportWorkoutTrustHeartRate = false;
    private boolean isSupportGpsLocation = false;
    private boolean isSupportGpsData = false;
    private boolean isSupportGpsSetParameter = false;
    private boolean isSupportGpsPostProcessing = false;
    private boolean isSupportGpsSearchStarOptimization = false;
    private boolean isSupportHeartRateInfo = false;
    private boolean isSupportStressInfo = false;
    private boolean isSupportSleep = false;
    private boolean isSupportClimb = false;
    private boolean isSupportRiding = false;
    private boolean isSupportStand = false;
    private boolean isSupportSleepShallow = false;
    private boolean isSupportSleepDeep = false;
    private boolean isSupportWalk = false;
    private boolean isSupportRun = false;
    private boolean isSupportStep = false;
    private boolean isSupportCalorie = false;
    private boolean isSupportDistance = false;
    private boolean isSupportHeartRate = false;
    private int promptPush = 0;
    private boolean isSupportCallMute = false;
    private boolean isSupportHelp = false;
    private boolean isSupportDistanceDetail = false;
    private boolean isSupportEsim = false;
    private boolean isSupportMultiSim = false;
    private boolean isSupportNewEsim = false;
    private boolean isSupportPay = false;
    private boolean isSupportRotateSwitchScreen = false;
    private boolean isSupportLeftRightHandWearMode = false;
    private boolean isSupportStress = false;
    private boolean isSupportMidware = false;
    private boolean isSupportAccount = false;
    private boolean isSupportOneLevelMenu = false;
    private boolean isSupportMusicControl = false;
    private boolean isSupportQueryAllowDisturbContent = false;
    private boolean isSupportDefaultSwitch = false;
    private boolean isSupportPosture = false;
    private boolean isSupportPressAutoMonitor = false;
    private boolean isSupportContinueHeartRate = false;
    private boolean isSupportAtmosphere = false;
    private boolean isSupportFootWear = false;
    private boolean isSupportAutoDetectMode = false;
    private boolean isSupportRunPosture = false;
    private boolean isSupportInformCloseOrOpen = false;
    private boolean isSupportHeartRateRaiseAlarm = false;
    private boolean isSupportGetHeartRateRaiseAlarmNumber = false;
    private boolean isSupportGetHighAndMiddleSport = false;
    private boolean isSupportHeartRateDownAlarm = false;
    private boolean isSupportRestHeartRateControls = false;
    private boolean isSupportCycleBloodOxygenSwitch = false;
    private boolean isSupportBloodOxygenDownRemind = false;
    private boolean isSupportRunPaceSet = false;
    private boolean isSupportMediumToHighStrengthPreValue = false;
    private boolean isSupportChangeAlarm = false;
    private boolean isSupportNeedSyncBeforeOta = false;
    private boolean isSupportAutoUpdate = false;
    private boolean isSupportUpdateChange = false;
    private boolean isSupportNotifyDeviceNewVersion = false;
    private boolean isSupportDeviceRequestCheck = false;
    private boolean isSupportPhonesInfo = false;
    private boolean isSupportNotifyDeviceBroadCast = false;
    private boolean isSupportUnitWeather = false;
    private boolean isSupportHrrHeartRateCapability = false;
    private boolean isSupportWatchFace = false;
    private boolean isSupportMarket = false;
    private boolean isSupportMarketParams = false;
    private boolean isSupportTws = false;
    private boolean isSupportStressAppToDevice = false;
    private boolean isSupportMusicInfoList = false;
    private boolean isSupportElectronicCard = false;
    private boolean isSupportSyncAccount = false;
    private boolean isSupportOneTouch = false;
    private boolean isSupportSleepBreathe = false;
    private boolean isSupportHiCarDriverRemind = false;
    private boolean isSupportMessageFeedback = false;
    private boolean isSupportWearStatus = false;
    private boolean isSupportPhd = false;
    private boolean isSupportHiWear = false;
    private boolean isSupportWearEngine = false;
    private boolean isSupportCheckDeviceSpace = false;
    private boolean isSupportWeatherFutureInfo = false;

    @SerializedName("isSupport_atrial_operator")
    private boolean isSupportAtrialOperator = false;
    private boolean isSupportMenstrual = false;
    private boolean isSupportSosTransmission = false;
    private boolean isSupportSendSosSms = false;
    private boolean isSupportDeviceFutureWeatherCapability = false;
    private boolean isSupportTide = false;
    private boolean isSupportAppId = false;
    private boolean isSupportWalletOpenCard = false;
    private boolean isSupportSendSwitchStatusInfo = false;
    private boolean isSupportWatchFaceAppId = false;
    private boolean isSupportZoneId = false;
    private boolean isSupportHttp = false;
    private boolean isSupportSyncHiCall = false;
    private boolean isSupportSyncContacts = false;
    private boolean isSupportChangePhonePair = false;
    private boolean isSupportAccountSwitch = false;
    private boolean isSupportSettingRelated = false;
    private boolean isSupportLegalPrivacy = false;
    private boolean isSupportLegalUserAgreement = false;
    private boolean isSupportLegalOpenSource = false;
    private boolean isSupportLegalServiceStatement = false;
    private boolean isSupportLegalSourceStatement = false;
    private boolean isSupportLegalSystemWebView = false;
    private boolean isSupportSelfUploadDeviceLog = false;
    private boolean isSupportSmartWatchVersionStatus = false;
    private boolean isHmsAutoUpdate = false;
    private boolean isHmsAutoUpdateWifi = false;
    private boolean isHmsNotifyUpdate = false;
    private boolean isSupportUserSetting = false;
    private boolean isSupportSyncWifi = false;
    private boolean isHideWalletEntrance = false;
    private boolean isSupportEcgAuth = false;
    private boolean isSupportActivityRecognitionStatus = false;
    private boolean isSupportWeatherErrorCode = false;
    private boolean isSupportCoreSleepNewFile = false;
    private boolean isSupportSyncTime = false;
    private boolean isSupportRriNewFile = false;
    private boolean isSupportUploadGpsAndPdrFile = false;
    private boolean isSupportConnectStatus = false;
    private boolean isSupportExpandCapability = false;
    private boolean isSupportHarmonyAgreement = false;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean isSupportWeatherErrorCode() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportWeatherErrorCode))).booleanValue();
    }

    public void setSupportWeatherErrorCode(boolean z) {
        this.isSupportWeatherErrorCode = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportActivityRecognitionStatus() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportActivityRecognitionStatus))).booleanValue();
    }

    public void setSupportActivityRecognitionStatus(boolean z) {
        this.isSupportActivityRecognitionStatus = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportSendSwitchStatus() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportSendSwitchStatusInfo))).booleanValue();
    }

    public void setSupportSendSwitchStatus(boolean z) {
        this.isSupportSendSwitchStatusInfo = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportSmartWatchVersionStatus() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportSmartWatchVersionStatus))).booleanValue();
    }

    public void setSupportSmartWatchVersionStatus(boolean z) {
        this.isSupportSmartWatchVersionStatus = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isHmsNotifyUpdate() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isHmsNotifyUpdate))).booleanValue();
    }

    public void configureHmsNotifyUpdate(boolean z) {
        this.isHmsNotifyUpdate = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isHmsAutoUpdateWifi() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isHmsAutoUpdateWifi))).booleanValue();
    }

    public void configureHmsAutoUpdateWifi(boolean z) {
        this.isHmsAutoUpdateWifi = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isHmsAutoUpdate() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isHmsAutoUpdate))).booleanValue();
    }

    public void configureHmsAutoUpdate(boolean z) {
        this.isHmsAutoUpdate = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportAppId() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportAppId))).booleanValue();
    }

    public void configureSupportAppId(boolean z) {
        this.isSupportAppId = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportUserSetting() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportUserSetting))).booleanValue();
    }

    public void configureSupportUserSetting(boolean z) {
        this.isSupportUserSetting = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportWalletOpenCard() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportWalletOpenCard))).booleanValue();
    }

    public void configureSupportWalletOpenCard(boolean z) {
        this.isSupportWalletOpenCard = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportTide() {
        return this.isSupportTide;
    }

    public void setSupportTide(boolean z) {
        this.isSupportTide = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportDeviceFutureWeatherCapability() {
        return this.isSupportDeviceFutureWeatherCapability;
    }

    public void setSupportDeviceFutureWeatherCapability(boolean z) {
        this.isSupportDeviceFutureWeatherCapability = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportElectronicCard() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportElectronicCard))).booleanValue();
    }

    public void setSupportElectronicCard(boolean z) {
        this.isSupportElectronicCard = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportSyncAccount() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportSyncAccount))).booleanValue();
    }

    public void setSupportSyncAccount(boolean z) {
        this.isSupportSyncAccount = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportOneTouch() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportOneTouch))).booleanValue();
    }

    public void setSupportOneTouch(boolean z) {
        this.isSupportOneTouch = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportWatchFace() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportWatchFace))).booleanValue();
    }

    public void setSupportWatchFace(boolean z) {
        this.isSupportWatchFace = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportMarketFace() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportMarket))).booleanValue();
    }

    public void setSupportMarketFace(boolean z) {
        this.isSupportMarket = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportMarketParams() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportMarketParams))).booleanValue();
    }

    public void setSupportMarketParams(boolean z) {
        this.isSupportMarketParams = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportTws() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportTws))).booleanValue();
    }

    public void setSupportTws(boolean z) {
        this.isSupportTws = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportUnitWeather() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportUnitWeather))).booleanValue();
    }

    public void configureSupportUnitWeather(boolean z) {
        this.isSupportUnitWeather = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isAtmosphereSupportExpand() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportAtmosphereSupportExpand))).booleanValue();
    }

    public void configureAtmosphereSupportExpand(boolean z) {
        this.isSupportAtmosphereSupportExpand = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isWeatherSupportErrorCode() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportWeatherSupportErrorCode))).booleanValue();
    }

    public void configureWeatherSupportErrorCode(boolean z) {
        this.isSupportWeatherSupportErrorCode = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isWeatherSupportFutureInfo() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportWeatherFutureInfo))).booleanValue();
    }

    public void configureWeatherSupportFutureInfo(boolean z) {
        this.isSupportWeatherFutureInfo = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportAtrialOperator() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportAtrialOperator))).booleanValue();
    }

    public boolean isSupportMenstrual() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportMenstrual))).booleanValue();
    }

    public void configureSupportMenstrual(boolean z) {
        this.isSupportMenstrual = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportSosTransmission() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportSosTransmission))).booleanValue();
    }

    public void configureSupportSosTransmission(boolean z) {
        this.isSupportSosTransmission = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportSendSosSms() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportSendSosSms))).booleanValue();
    }

    public void configureSupportSendSosSms(boolean z) {
        this.isSupportSendSosSms = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public void configureSupportAtrialOperator(boolean z) {
        this.isSupportAtrialOperator = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportIntelligentHomeLinkage() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportIntelligentHomeLinkage))).booleanValue();
    }

    public void configureSupportIntelligentHomeLinkage(boolean z) {
        this.isSupportIntelligentHomeLinkage = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportDefaultSwitch() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportDefaultSwitch))).booleanValue();
    }

    public void setSupportDefaultSwitch(boolean z) {
        this.isSupportDefaultSwitch = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportMidware() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportMidware))).booleanValue();
    }

    public void configureSupportMidware(boolean z) {
        this.isSupportMidware = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportMusicControl() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportMusicControl))).booleanValue();
    }

    public void configureSupportMusicControl(boolean z) {
        this.isSupportMusicControl = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportLeftRightHandWearMode() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportLeftRightHandWearMode))).booleanValue();
    }

    public void configureSupportLeftRightHandWearMode(boolean z) {
        this.isSupportLeftRightHandWearMode = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportQueryAllowDisturbContent() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportQueryAllowDisturbContent))).booleanValue();
    }

    public void configureSupportQueryAllowDisturbContent(boolean z) {
        this.isSupportQueryAllowDisturbContent = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportStress() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportStress))).booleanValue();
    }

    public void configureSupportStress(boolean z) {
        this.isSupportStress = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportPay() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportPay))).booleanValue();
    }

    public void configureSupportPay(boolean z) {
        this.isSupportPay = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportEsim() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportEsim))).booleanValue();
    }

    public boolean isSupportMultiSim() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportMultiSim))).booleanValue();
    }

    public void configureSupportEsim(boolean z) {
        this.isSupportEsim = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public void configureSupportMultiSim(boolean z) {
        this.isSupportMultiSim = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportNewEsim() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportNewEsim))).booleanValue();
    }

    public void configureSupportNewEsim(boolean z) {
        this.isSupportNewEsim = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isLanguage() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportLanguage))).booleanValue();
    }

    public void configureLanguage(boolean z) {
        this.isSupportLanguage = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isGoldCard() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportGoldCard))).booleanValue();
    }

    public void configureGoldCard(boolean z) {
        this.isSupportGoldCard = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportRemoteCamera() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportRemoteCamera))).booleanValue();
    }

    public void configureSupportRemoteCamera(boolean z) {
        this.isSupportRemoteCamera = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isClimb() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportClimb))).booleanValue();
    }

    public void configureClimb(boolean z) {
        this.isSupportClimb = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isRiding() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportRiding))).booleanValue();
    }

    public void configureRiding(boolean z) {
        this.isSupportRiding = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isStand() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportStand))).booleanValue();
    }

    public void configureStand(boolean z) {
        this.isSupportStand = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSleepShallow() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportSleepShallow))).booleanValue();
    }

    public void configureSleepShallow(boolean z) {
        this.isSupportSleepShallow = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSleepDeep() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportSleepDeep))).booleanValue();
    }

    public void configureSleepDeep(boolean z) {
        this.isSupportSleepDeep = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isWalk() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportWalk))).booleanValue();
    }

    public void configureWalk(boolean z) {
        this.isSupportWalk = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isRun() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportRun))).booleanValue();
    }

    public void configureRun(boolean z) {
        this.isSupportRun = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isStep() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportStep))).booleanValue();
    }

    public void configureStep(boolean z) {
        this.isSupportStep = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isCalorie() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportCalorie))).booleanValue();
    }

    public void configureCalorie(boolean z) {
        this.isSupportCalorie = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isDistance() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportDistance))).booleanValue();
    }

    public void configureDistance(boolean z) {
        this.isSupportDistance = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSleep() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportSleep))).booleanValue();
    }

    public void configureSleep(boolean z) {
        this.isSupportSleep = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isActivityReminder() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportActivityReminder))).booleanValue();
    }

    public void configureActivityReminder(boolean z) {
        this.isSupportActivityReminder = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isBluetoothOffAlert() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportBluetoothOffAlert))).booleanValue();
    }

    public void configureBluetoothOffAlert(boolean z) {
        this.isSupportBluetoothOffAlert = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isEventAlarm() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportEventAlarm))).booleanValue();
    }

    public void configureEventAlarm(boolean z) {
        this.isSupportEventAlarm = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public int getEventAlarmNum() {
        return this.eventAlarmNum;
    }

    public void configureEventAlarmNum(int i) {
        this.eventAlarmNum = ((Integer) cpu.a(Integer.valueOf(i))).intValue();
    }

    public int getSmartWatchVersionTypeValue() {
        return ((Integer) cpu.a(Integer.valueOf(this.smartWatchVersionTypeValue))).intValue();
    }

    public void configureSmartWatchVersionTypeValue(int i) {
        this.smartWatchVersionTypeValue = ((Integer) cpu.a(Integer.valueOf(i))).intValue();
    }

    public boolean isSmartAlarm() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportSmartAlarm))).booleanValue();
    }

    public void configureSmartAlarm(boolean z) {
        this.isSupportSmartAlarm = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isAvoidDisturb() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportAvoidDisturb))).booleanValue();
    }

    public void configureAvoidDisturb(boolean z) {
        this.isSupportAvoidDisturb = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isMessageAlert() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportMessageAlert))).booleanValue();
    }

    public void configureMessageAlert(boolean z) {
        this.isSupportMessageAlert = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportCallMute() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportCallMute))).booleanValue();
    }

    public void configureCallMute(boolean z) {
        this.isSupportCallMute = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isWeatherPush() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportWeatherPush))).booleanValue();
    }

    public void configureWeatherPush(boolean z) {
        this.isSupportWeatherPush = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportAutoLightScreen() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportAutoLightScreen))).booleanValue();
    }

    public void configureAutoLightScreen(boolean z) {
        this.isSupportAutoLightScreen = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public void configruePressAutoMonitor(boolean z) {
        this.isSupportPressAutoMonitor = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportPressAutoMonitor() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportPressAutoMonitor))).booleanValue();
    }

    public boolean isSupportRotateSwitchScreen() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportRotateSwitchScreen))).booleanValue();
    }

    public void configureRotateSwitchScreen(boolean z) {
        this.isSupportRotateSwitchScreen = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isContacts() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportContacts))).booleanValue();
    }

    public void configureContacts(boolean z) {
        this.isSupportContacts = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isOtaUpdate() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportOtaUpdate))).booleanValue();
    }

    public void configureOtaUpdate(boolean z) {
        this.isSupportOtaUpdate = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isFactoryReset() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportFactoryReset))).booleanValue();
    }

    public void configureFactoryReset(boolean z) {
        this.isSupportFactoryReset = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public void configureFitnessFrameType(int i) {
        this.fitnessFrameType = ((Integer) cpu.a(Integer.valueOf(i))).intValue();
    }

    public int getFitnessFrameType() {
        return ((Integer) cpu.a(Integer.valueOf(this.fitnessFrameType))).intValue();
    }

    public int isPromptPush() {
        return ((Integer) cpu.a(Integer.valueOf(this.promptPush))).intValue();
    }

    public void configurePromptPush(int i) {
        this.promptPush = ((Integer) cpu.a(Integer.valueOf(i))).intValue();
    }

    public void configureMotionGoalCap(int i) {
        this.motionGoalCap = ((Integer) cpu.a(Integer.valueOf(i))).intValue();
    }

    public int getMotionGoalCap() {
        return ((Integer) cpu.a(Integer.valueOf(this.motionGoalCap))).intValue();
    }

    public void configureIsSupportHeartRate(boolean z) {
        this.isSupportHeartRate = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportHeartRate() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportHeartRate))).booleanValue();
    }

    public void configureIsSupportHeartRateZone(boolean z) {
        this.isSupportHeartRateZone = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportHeartRateZone() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportHeartRateZone))).booleanValue();
    }

    public void configureIsSupportCoreSleep(boolean z) {
        this.isSupportCoreSleep = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportCoreSleep() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportCoreSleep))).booleanValue();
    }

    public boolean isDeviceSupportCoreSleep() {
        return isSupportCoreSleep() || isSupportQueryDeviceCoreSleepSwitch();
    }

    public boolean isSupportSendCoreSleepOutState() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportSendCoreSleepOutState))).booleanValue();
    }

    public void configureIsSupportSendCoreSleepOutState(boolean z) {
        this.isSupportSendCoreSleepOutState = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportQueryDeviceCoreSleepSwitch() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportQueryCoreSleepSwitch))).booleanValue();
    }

    public void configureIsSupportQueryDeviceCoreSleepSwitch(boolean z) {
        this.isSupportQueryCoreSleepSwitch = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public void configureisSupportHeartRateEnable(boolean z) {
        this.isSupportHeartRateEnable = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportHeartRateEnable() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportHeartRateEnable))).booleanValue();
    }

    public boolean isSupportGetUserInfo() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportGetUserInfo))).booleanValue();
    }

    public void configureSupportGetUserInfo(boolean z) {
        this.isSupportGetUserInfo = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public void configureIsSupportHelp(boolean z) {
        this.isSupportHelp = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportHelp() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportHelp))).booleanValue();
    }

    public void configureSupportExerciseAdvice(boolean z) {
        this.isSupportExerciseAdvice = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportExerciseAdvice() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportExerciseAdvice))).booleanValue();
    }

    public void configureSupportWorkout(boolean z) {
        this.isSupportWorkout = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportWorkout() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportWorkout))).booleanValue();
    }

    public void configureReserveSync(boolean z) {
        this.isSupportReserveSync = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isReserveSync() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportReserveSync))).booleanValue();
    }

    public void configureSupportGpsLocation(boolean z) {
        this.isSupportGpsLocation = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportGpsLocation() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportGpsLocation))).booleanValue();
    }

    public boolean isMaintenance() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportMaintenance))).booleanValue();
    }

    public void configureMaintenance(boolean z) {
        this.isSupportMaintenance = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isMaintenanceInTime() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportMaintenanceInTime))).booleanValue();
    }

    public void configureMaintenanceInTime(boolean z) {
        this.isSupportMaintenanceInTime = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isMaintenanceGetData() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportMaintenanceGetData))).booleanValue();
    }

    public void configureMaintenanceGetData(boolean z) {
        this.isSupportMaintenanceGetData = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public void configureDistanceDetail(boolean z) {
        this.isSupportDistanceDetail = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean getDistanceDetail() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportDistanceDetail))).booleanValue();
    }

    public boolean isSupportTimeSetting() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportTimeSetting))).booleanValue();
    }

    public void configureSupportTimeSetting(boolean z) {
        this.isSupportTimeSetting = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportGetFirmwareVersion() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportGetFirmwareVersion))).booleanValue();
    }

    public void configureSupportGetFirmwareVersion(boolean z) {
        this.isSupportGetFirmwareVersion = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportGetBattery() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportGetBattery))).booleanValue();
    }

    public void configureSupportGetBattery(boolean z) {
        this.isSupportGetBattery = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportPairDevice() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportPairDevice))).booleanValue();
    }

    public void configureSupportPairDevice(boolean z) {
        this.isSupportPairDevice = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportGetHandsetInfo() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportGetHandsetInfo))).booleanValue();
    }

    public void configureSupportGetHandsetInfo(boolean z) {
        this.isSupportGetHandsetInfo = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportNotificationIntervalInfo() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportNotificationIntervalInfo))).booleanValue();
    }

    public void configureSupportNotificationIntervalInfo(boolean z) {
        this.isSupportNotificationIntervalInfo = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportActivityType() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportActivityType))).booleanValue();
    }

    public void configureSupportActivityType(boolean z) {
        this.isSupportActivityType = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportAuthenticDevice() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportAuthenticDevice))).booleanValue();
    }

    public void configureSupportAuthenticDevice(boolean z) {
        this.isSupportAuthenticDevice = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportMessageAlertInfo() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportMessageAlertInfo))).booleanValue();
    }

    public void configureSupportMessageAlertInfo(boolean z) {
        this.isSupportMessageAlertInfo = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportMessageSupportInfo() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportMessageSupportInfo))).booleanValue();
    }

    public void configureSupportMessageSupportInfo(boolean z) {
        this.isSupportMessageSupportInfo = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportMessageCenterPushDevice() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportMessageCenterPushDevice))).booleanValue();
    }

    public void configureupportMessageCenterPushDevice(boolean z) {
        this.isSupportMessageCenterPushDevice = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportWearMessagePush() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportWearMessagePush))).booleanValue();
    }

    public void configureSupportWearMessagePush(boolean z) {
        this.isSupportWearMessagePush = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportCallingOperationType() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportCallingOperationType))).booleanValue();
    }

    public void configureSupportCallingOperationType(boolean z) {
        this.isSupportCallingOperationType = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportSetUserInfoEncrypt() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportSetUserInfoEncrypt))).booleanValue();
    }

    public void configureSupportSetUserInfoEncrypt(boolean z) {
        this.isSupportSetUserInfoEncrypt = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportSampleFrame() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportSampleFrame))).booleanValue();
    }

    public void configureSupportSampleFrame(boolean z) {
        this.isSupportSampleFrame = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportThreshold() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportThreshold))).booleanValue();
    }

    public void configureSupportThreshold(boolean z) {
        this.isSupportThreshold = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportAntiLost() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportAntiLost))).booleanValue();
    }

    public void configureSupportAntiLost(boolean z) {
        this.isSupportAntiLost = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportExerciseAdviceTime() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportExerciseAdviceTime))).booleanValue();
    }

    public void configureSupportExerciseAdviceTime(boolean z) {
        this.isSupportExerciseAdviceTime = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportExerciseAdviceMonitor() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportExerciseAdviceMonitor))).booleanValue();
    }

    public void configureSupportExerciseAdviceMonitor(boolean z) {
        this.isSupportExerciseAdviceMonitor = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportWorkoutInfo() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportWorkoutInfo))).booleanValue();
    }

    public void configureSupportWorkoutInfo(boolean z) {
        this.isSupportWorkoutInfo = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportWorkoutReminder() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportWorkoutReminder))).booleanValue();
    }

    public void configureSupportWorkoutReminder(boolean z) {
        this.isSupportWorkoutReminder = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportWorkoutRecord() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportWorkoutRecord))).booleanValue();
    }

    public void configureSupportWorkoutRecord(boolean z) {
        this.isSupportWorkoutRecord = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public void configureSupportWorkoutTrustHeartRate(boolean z) {
        this.isSupportWorkoutTrustHeartRate = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportWorkoutTrustHeartRate() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportWorkoutTrustHeartRate))).booleanValue();
    }

    public boolean isSupportWorkoutExerciseDisplayLink() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportWorkoutExerciseDisplayLink))).booleanValue();
    }

    public void configureSupportWorkoutExerciseDisplayLink(boolean z) {
        this.isSupportWorkoutExerciseDisplayLink = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportWorkoutRecordPaceMap() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportWorkoutRecordPaceMap))).booleanValue();
    }

    public void configureSupportWorkoutRecordPaceMap(boolean z) {
        this.isSupportWorkoutRecordPaceMap = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportWorkoutCapabilicy() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportWorkoutCapabilicy))).booleanValue();
    }

    public boolean isSupportSleepBreathe() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportSleepBreathe))).booleanValue();
    }

    public void configureSupportSleepBreathe(boolean z) {
        this.isSupportSleepBreathe = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportHiCarDriverRemind() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportHiCarDriverRemind))).booleanValue();
    }

    public void configureSupportHiCarDriverRemind(boolean z) {
        this.isSupportHiCarDriverRemind = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportMessageFeedback() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportMessageFeedback))).booleanValue();
    }

    public void configureSupportMessageFeedback(boolean z) {
        this.isSupportMessageFeedback = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportWearStatus() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportWearStatus))).booleanValue();
    }

    public void configureSupportWearStatus(boolean z) {
        this.isSupportWearStatus = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportPhd() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportPhd))).booleanValue();
    }

    public void configureSupportPhd(boolean z) {
        this.isSupportPhd = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportHiWear() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportHiWear))).booleanValue();
    }

    public void configureSupportHiWear(boolean z) {
        this.isSupportHiWear = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportWearEngine() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportWearEngine))).booleanValue();
    }

    public void configureSupportWearEngine(boolean z) {
        this.isSupportWearEngine = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportCheckDeviceSpace() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportCheckDeviceSpace))).booleanValue();
    }

    public void configureSupportCheckDeviceSpace(boolean z) {
        this.isSupportCheckDeviceSpace = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public void configureSupportWorkoutCapabilicy(boolean z) {
        this.isSupportWorkoutCapabilicy = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportGpsData() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportGpsData))).booleanValue();
    }

    public void configureSupportGpsData(boolean z) {
        this.isSupportGpsData = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportGpsSetParameter() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportGpsSetParameter))).booleanValue();
    }

    public void configureSupportGpsSetParameter(boolean z) {
        this.isSupportGpsSetParameter = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportGpsPostProcessing() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportGpsPostProcessing))).booleanValue();
    }

    public void configureSupportGpsPostProcessing(boolean z) {
        this.isSupportGpsPostProcessing = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportGpsSearchStarOptimization() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportGpsSearchStarOptimization))).booleanValue();
    }

    public void configureSupportGpsSearchStarOptimization(boolean z) {
        this.isSupportGpsSearchStarOptimization = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportHeartRateInfo() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportHeartRateInfo))).booleanValue();
    }

    public void configureSupportHeartRateInfo(boolean z) {
        this.isSupportHeartRateInfo = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public void configureSupportStressInfo(boolean z) {
        this.isSupportStressInfo = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportStressInfo() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportStressInfo))).booleanValue();
    }

    public boolean isSupportSportTotal() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportSportTotal))).booleanValue();
    }

    public void configureSupportSportTotal(boolean z) {
        this.isSupportSportTotal = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportAccount() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportAccount))).booleanValue();
    }

    public void configureSupportAccount(boolean z) {
        this.isSupportAccount = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportOneLevelMenu() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportOneLevelMenu))).booleanValue();
    }

    public void configureSupportOneLevelMenu(boolean z) {
        this.isSupportOneLevelMenu = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportDeleteMsg() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportDeleteMsg))).booleanValue();
    }

    public void configureSupportDeleteMsg(boolean z) {
        this.isSupportDeleteMsg = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportPosture() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportPosture))).booleanValue();
    }

    public void configureSupportPosture(boolean z) {
        this.isSupportPosture = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportContinueHeartRate() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportContinueHeartRate))).booleanValue();
    }

    public void configureSupportContinueHeartRate(boolean z) {
        this.isSupportContinueHeartRate = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportAtmosphere() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportAtmosphere))).booleanValue();
    }

    public void configureSupportAtmosphere(boolean z) {
        this.isSupportAtmosphere = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public void configureHeartRateRaiseAlarm(boolean z) {
        this.isSupportHeartRateRaiseAlarm = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public void configureHeartRateDownAlarm(boolean z) {
        this.isSupportHeartRateDownAlarm = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportHeartRateRaiseAlarm() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportHeartRateRaiseAlarm))).booleanValue();
    }

    public boolean isSupportRestHeartRateControls() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportRestHeartRateControls))).booleanValue();
    }

    public void configureSupportRestHeartRateControls(boolean z) {
        this.isSupportRestHeartRateControls = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportHeartRateDownAlarm() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportHeartRateDownAlarm))).booleanValue();
    }

    public boolean isSupportCycleBloodOxygenSwitch() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportCycleBloodOxygenSwitch))).booleanValue();
    }

    public void configureCycleBloodOxygenSwitch(boolean z) {
        this.isSupportCycleBloodOxygenSwitch = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportBloodOxygenDownRemind() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportBloodOxygenDownRemind))).booleanValue();
    }

    public void configureBloodOxygenDownRemind(boolean z) {
        this.isSupportBloodOxygenDownRemind = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportGetHeartRateRaiseAlarmNumber() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportGetHeartRateRaiseAlarmNumber))).booleanValue();
    }

    public void configureRunPaceSetCapability(boolean z) {
        this.isSupportRunPaceSet = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportRunPaceSetCapability() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportRunPaceSet))).booleanValue();
    }

    public boolean isSupportMediumToHighStrengthPreValue() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportMediumToHighStrengthPreValue))).booleanValue();
    }

    public void configureSupportMediumToHighStrengthPreValue(boolean z) {
        this.isSupportMediumToHighStrengthPreValue = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportGetHighAndMiddleSport() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportGetHighAndMiddleSport))).booleanValue();
    }

    public void configureGetHeartRateRaiseAlarmNumber(boolean z) {
        this.isSupportGetHeartRateRaiseAlarmNumber = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public void configureGetHighAndMiddleSport(boolean z) {
        this.isSupportGetHighAndMiddleSport = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean getIsSupportHrrHeartRateCapability() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportHrrHeartRateCapability))).booleanValue();
    }

    public void configureSetHrrHeartRateCapability(boolean z) {
        this.isSupportHrrHeartRateCapability = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportChangeAlarm() {
        return this.isSupportChangeAlarm;
    }

    public void configureChangeAlarm(boolean z) {
        this.isSupportChangeAlarm = z;
    }

    public boolean isSupportPhonesInfo() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportPhonesInfo))).booleanValue();
    }

    public void configureIsSupportPhonesInfo(boolean z) {
        this.isSupportPhonesInfo = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportNotifyDeviceBroadCast() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportNotifyDeviceBroadCast))).booleanValue();
    }

    public void configureIsSupportNotifyDeviceBroadCast(boolean z) {
        this.isSupportNotifyDeviceBroadCast = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public void configureIsSupportStressAppToDevice(boolean z) {
        this.isSupportStressAppToDevice = z;
    }

    public boolean isSupportStressAppToDevice() {
        return this.isSupportStressAppToDevice;
    }

    public void configureIsSupportMusicInfoList(boolean z) {
        this.isSupportMusicInfoList = z;
    }

    public boolean getIsSupportAutoUpdate() {
        return this.isSupportAutoUpdate;
    }

    public void configureIsSupportAutoUpdate(boolean z) {
        this.isSupportAutoUpdate = z;
    }

    public boolean getIsSupportUpdateChange() {
        return this.isSupportUpdateChange;
    }

    public void configureIsSupportUpdateChange(boolean z) {
        this.isSupportUpdateChange = z;
    }

    public boolean getIsSupportNotifyDeviceNewVersion() {
        return this.isSupportNotifyDeviceNewVersion;
    }

    public void configureIsSupportNotifyDeviceNewVersion(boolean z) {
        this.isSupportNotifyDeviceNewVersion = z;
    }

    public boolean getIsSupportDeviceRequestCheck() {
        return this.isSupportDeviceRequestCheck;
    }

    public void configureIsSupportDeviceRequestCheck(boolean z) {
        this.isSupportDeviceRequestCheck = z;
    }

    public boolean isSupportMusicInfoList() {
        return this.isSupportMusicInfoList;
    }

    public boolean isSupportZoneId() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportZoneId))).booleanValue();
    }

    public void configureSupportZoneId(boolean z) {
        this.isSupportZoneId = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportHttps() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportHttp))).booleanValue();
    }

    public void configureSupportHttps(boolean z) {
        this.isSupportHttp = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportSettingRelated() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportSettingRelated))).booleanValue();
    }

    public void configureSupportSettingRelated(boolean z) {
        this.isSupportSettingRelated = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportLegalPrivacy() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportLegalPrivacy))).booleanValue();
    }

    public void configureSupportLegalPrivacy(boolean z) {
        this.isSupportLegalPrivacy = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportLegalUserAgreement() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportLegalUserAgreement))).booleanValue();
    }

    public void configureSupportLegalUserAgreement(boolean z) {
        this.isSupportLegalUserAgreement = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportLegalOpenSource() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportLegalOpenSource))).booleanValue();
    }

    public void configureSupportOpenSourceOpen(boolean z) {
        this.isSupportLegalOpenSource = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportLegalServiceStatement() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportLegalServiceStatement))).booleanValue();
    }

    public void configureSupportLegalServiceStatement(boolean z) {
        this.isSupportLegalServiceStatement = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportLegalSourceStatement() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportLegalSourceStatement))).booleanValue();
    }

    public void configureSupportLegalSourceStatement(boolean z) {
        this.isSupportLegalSourceStatement = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportLegalSystemWebView() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportLegalSystemWebView))).booleanValue();
    }

    public void configureSupportLegalSystemWebView(boolean z) {
        this.isSupportLegalSystemWebView = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public void resetDeviceCapability() {
        new ede().c(this);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        new ede().a(parcel, this);
    }

    public boolean isSupportFootWear() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportFootWear))).booleanValue();
    }

    public void configureSupportFootWear(boolean z) {
        this.isSupportFootWear = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportAutoDetectMode() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportAutoDetectMode))).booleanValue();
    }

    public void configureSupportAutoDetectMode(boolean z) {
        this.isSupportAutoDetectMode = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportRunPosture() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportRunPosture))).booleanValue();
    }

    public void configureSupportRunPosture(boolean z) {
        this.isSupportRunPosture = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportInformCloseOrOpen() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportInformCloseOrOpen))).booleanValue();
    }

    public void configureSupportInformCloseOrOpen(boolean z) {
        this.isSupportInformCloseOrOpen = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isNeedSyncBeforeOta() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportNeedSyncBeforeOta))).booleanValue();
    }

    public void configureSyncBeforeOta(boolean z) {
        this.isSupportNeedSyncBeforeOta = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public void configureSyncHiCall(boolean z) {
        this.isSupportSyncHiCall = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportSyncHiCall() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportSyncHiCall))).booleanValue();
    }

    public void configureSyncContacts(boolean z) {
        this.isSupportSyncContacts = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportSyncContacts() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportSyncContacts))).booleanValue();
    }

    public boolean isSupportSelfUploadDeviceLog() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportSelfUploadDeviceLog))).booleanValue();
    }

    public void setSupportSelfUploadDeviceLog(boolean z) {
        this.isSupportSelfUploadDeviceLog = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportChangePhonePair() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportChangePhonePair))).booleanValue();
    }

    public void configureSupportChangePhonePair(boolean z) {
        this.isSupportChangePhonePair = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportAccountSwitch() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportAccountSwitch))).booleanValue();
    }

    public void configureSupportAccountSwitch(boolean z) {
        this.isSupportAccountSwitch = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportWatchFaceAppId() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportWatchFaceAppId))).booleanValue();
    }

    public void configureSupportWatchFaceAppId(boolean z) {
        this.isSupportWatchFaceAppId = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isHideWalletEntrance() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isHideWalletEntrance))).booleanValue();
    }

    public void configureHideWalletEntrance(boolean z) {
        this.isHideWalletEntrance = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportEcgAuth() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportEcgAuth))).booleanValue();
    }

    public void configureSupportEcgAuth(boolean z) {
        this.isSupportEcgAuth = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportCoreSleepNewFile() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportCoreSleepNewFile))).booleanValue();
    }

    public void configureSupportCoreSleepNewFile(boolean z) {
        this.isSupportCoreSleepNewFile = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportSyncTime() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportSyncTime))).booleanValue();
    }

    public void configureSupportSyncTime(boolean z) {
        this.isSupportSyncTime = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportRriNewFile() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportRriNewFile))).booleanValue();
    }

    public void configureSupportRriNewFile(boolean z) {
        this.isSupportRriNewFile = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportUploadGpsAndPdrFile() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportUploadGpsAndPdrFile))).booleanValue();
    }

    public void configureIsSupportUploadGpsAndPdrFile(boolean z) {
        this.isSupportUploadGpsAndPdrFile = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportConnectStatus() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportConnectStatus))).booleanValue();
    }

    public void configureSupportConnectStatus(boolean z) {
        this.isSupportConnectStatus = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportExpandCapability() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportExpandCapability))).booleanValue();
    }

    public void configureSupportExpandCapability(boolean z) {
        this.isSupportExpandCapability = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportSyncWifi() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportSyncWifi))).booleanValue();
    }

    public void configureSupportSyncWifi(boolean z) {
        this.isSupportSyncWifi = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }

    public boolean isSupportHarmonyAgreement() {
        return ((Boolean) cpu.a(Boolean.valueOf(this.isSupportHarmonyAgreement))).booleanValue();
    }

    public void configureSupportHarmonyAgreement(boolean z) {
        this.isSupportHarmonyAgreement = ((Boolean) cpu.a(Boolean.valueOf(z))).booleanValue();
    }
}
