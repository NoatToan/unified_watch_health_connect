package com.xiaomi.hm.health.bt.proto;

import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes20.dex */
public final class Venice {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.Venice$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    public static final class VeniceEventMessage extends GeneratedMessageLite<VeniceEventMessage, Builder> implements VeniceEventMessageOrBuilder {
        public static final int ALARMPAGE_FIELD_NUMBER = 17;
        public static final int ALARMREMINDCOUNT_FIELD_NUMBER = 18;
        public static final int ALIPAYBINDSUCCCOUNT_FIELD_NUMBER = 34;
        public static final int ALIPAYCODE128NUM_FIELD_NUMBER = 36;
        public static final int ALIPAYPAGE_FIELD_NUMBER = 33;
        public static final int ALIPAYQRCODENUM_FIELD_NUMBER = 35;
        public static final int ALLDAYHRPAGE_FIELD_NUMBER = 56;
        public static final int ALLGOALACHIEVE_FIELD_NUMBER = 55;
        public static final int AUTOBRIGHTON_FIELD_NUMBER = 39;
        public static final int AUTOEXTINGUISHON_FIELD_NUMBER = 40;
        public static final int BLOODOXYGENEXPLAIN_FIELD_NUMBER = 61;
        public static final int BLOODOXYGENPAGE_FIELD_NUMBER = 59;
        public static final int CALORIEGOALACHIEVE_FIELD_NUMBER = 53;
        public static final int CHANGEDIALCOUNT_FIELD_NUMBER = 9;
        public static final int CHARGINGCOUNT_FIELD_NUMBER = 5;
        public static final int COMBINDIALCOUNT_FIELD_NUMBER = 8;
        public static final int COUNTDOWNNUM_FIELD_NUMBER = 13;
        private static final VeniceEventMessage DEFAULT_INSTANCE;
        public static final int DIALAPPLISTPAGEVIEW_FIELD_NUMBER = 11;
        public static final int DIALCONTROLPAGE_FIELD_NUMBER = 22;
        public static final int DIALID_FIELD_NUMBER = 10;
        public static final int DNDCOUNT_FIELD_NUMBER = 27;
        public static final int DNDCUSTOMCOUNT_FIELD_NUMBER = 44;
        public static final int ELLIPTICALCOUNT_FIELD_NUMBER = 71;
        public static final int EVENTREMINDCOUNT_FIELD_NUMBER = 20;
        public static final int EXTINGUISHTIMEON_FIELD_NUMBER = 41;
        public static final int FACTORYRESETCOUNT_FIELD_NUMBER = 4;
        public static final int FINDPHONECOUNT_FIELD_NUMBER = 23;
        public static final int FLASHLIGHTPAGE_FIELD_NUMBER = 24;
        public static final int HREXPLAIN_FIELD_NUMBER = 58;
        public static final int INDOORRIDDINGCOUNT_FIELD_NUMBER = 70;
        public static final int INDOORRUNCOUNT_FIELD_NUMBER = 66;
        public static final int INDOORSWIMCOUNT_FIELD_NUMBER = 73;
        public static final int LCDONBECAUSEOFEVENT_FIELD_NUMBER = 2;
        public static final int LCDONBECAUSEOFPRESS_FIELD_NUMBER = 1;
        public static final int MANUALMEASURBLOODOXYGEN_FIELD_NUMBER = 60;
        public static final int MANUALMEASURHR_FIELD_NUMBER = 57;
        public static final int MANUALMEASURSTRESS_FIELD_NUMBER = 63;
        public static final int MOTIONDETECTIONON_FIELD_NUMBER = 42;
        public static final int MUSICPAGE_FIELD_NUMBER = 21;
        public static final int NOTIFIDELEALLCOUNT_FIELD_NUMBER = 31;
        public static final int NOTIFISLIPDELECOUNT_FIELD_NUMBER = 32;
        public static final int OUTDOORRIDDINGCOUNT_FIELD_NUMBER = 72;
        public static final int OUTDOORRUNCOUNT_FIELD_NUMBER = 68;
        public static final int PAIDETAILPAGE_FIELD_NUMBER = 50;
        public static final int PAIGOALACHIEVE_FIELD_NUMBER = 52;
        public static final int PALMCOVERCOUNT_FIELD_NUMBER = 6;
        private static volatile Parser<VeniceEventMessage> PARSER = null;
        public static final int PINCHONCOUNT_FIELD_NUMBER = 47;
        public static final int POWERSAVINGPAGE_FIELD_NUMBER = 25;
        public static final int QUICKSTARTPAGE_FIELD_NUMBER = 28;
        public static final int QUICKSTARTSETTINGSAVE_FIELD_NUMBER = 29;
        public static final int REMINDPAGE_FIELD_NUMBER = 19;
        public static final int SCREENNOTIFICATIION_FIELD_NUMBER = 30;
        public static final int SCREENPWDONCOUNT_FIELD_NUMBER = 45;
        public static final int SETTINGBACKLIGHTPAGE_FIELD_NUMBER = 38;
        public static final int SETTINGPAGE_FIELD_NUMBER = 37;
        public static final int SETTINGWATCHFACEPAGE_FIELD_NUMBER = 7;
        public static final int SMARTDNDCOUNT_FIELD_NUMBER = 43;
        public static final int SNAPCOUNT_FIELD_NUMBER = 26;
        public static final int SPORTDETECTIONCOUNT_FIELD_NUMBER = 80;
        public static final int SPORTGPSFAIL_FIELD_NUMBER = 79;
        public static final int SPORTGPSFOUND_FIELD_NUMBER = 77;
        public static final int SPORTGPSSKIP_FIELD_NUMBER = 78;
        public static final int SPORTHISTORYPAGE_FIELD_NUMBER = 75;
        public static final int SPORTLISTPAGE_FIELD_NUMBER = 65;
        public static final int SPORTREALTIMESWITCHCOUNT_FIELD_NUMBER = 81;
        public static final int SPORTSETTINGPAGE_FIELD_NUMBER = 76;
        public static final int STANDGOALACHIEVE_FIELD_NUMBER = 54;
        public static final int STATUSPAGE_FIELD_NUMBER = 48;
        public static final int STEPGOALACHIEVE_FIELD_NUMBER = 51;
        public static final int STOPWATCHNUM_FIELD_NUMBER = 15;
        public static final int STRESSDETECTIONPAGE_FIELD_NUMBER = 62;
        public static final int STRESSSUSPENDCOUNT_FIELD_NUMBER = 64;
        public static final int SWIMCOUNT_FIELD_NUMBER = 74;
        public static final int TARGETSETTINGCOUNT_FIELD_NUMBER = 49;
        public static final int TIMERCOUNTDOWNPAGE_FIELD_NUMBER = 12;
        public static final int TIMERSTOPWATCHPAGE_FIELD_NUMBER = 14;
        public static final int TRAINCOUNT_FIELD_NUMBER = 67;
        public static final int VOICERECOGCOUNT_FIELD_NUMBER = 46;
        public static final int WALKCOUNT_FIELD_NUMBER = 69;
        public static final int WEATHERPAGE_FIELD_NUMBER = 16;
        public static final int WRISTFLIPEVENT_FIELD_NUMBER = 3;
        private int alarmPage_;
        private int alarmRemindCount_;
        private int alipayBindSuccCount_;
        private int alipayCode128Num_;
        private int alipayPage_;
        private int alipayQRCodeNum_;
        private int allGoalAchieve_;
        private int alldayHrPage_;
        private int autoBrightOn_;
        private int autoExtinguishOn_;
        private int bitField0_;
        private int bitField1_;
        private int bitField2_;
        private int bloodoxygenExplain_;
        private int bloodoxygenPage_;
        private int calorieGoalAchieve_;
        private int changeDialCount_;
        private int chargingCount_;
        private int combinDialCount_;
        private int countdownNum_;
        private int dialApplistPageView_;
        private int dialControlPage_;
        private int dialId_;
        private int dndCount_;
        private int dndCustomCount_;
        private int ellipticalCount_;
        private int eventRemindCount_;
        private int extinguishTimeOn_;
        private int factoryResetCount_;
        private int findPhoneCount_;
        private int flashLightPage_;
        private int hRExplain_;
        private int indoorRiddingCount_;
        private int indoorRunCount_;
        private int indoorSwimCount_;
        private int lcdOnBecauseOfEvent_;
        private int lcdOnBecauseOfPress_;
        private int manualMeasurBloodoxygen_;
        private int manualMeasurHR_;
        private int manualMeasurStress_;
        private byte memoizedIsInitialized = 2;
        private int motionDetectionOn_;
        private int musicPage_;
        private int notifiDeleAllCount_;
        private int notifiSlipDeleCount_;
        private int outdoorRiddingCount_;
        private int outdoorRunCount_;
        private int pAIGoalAchieve_;
        private int paiDetailPage_;
        private int palmCoverCount_;
        private int pinchOnCount_;
        private int powerSavingPage_;
        private int quickStartPage_;
        private int quickStartSettingSave_;
        private int remindPage_;
        private int screenNotificatiion_;
        private int screenPwdOnCount_;
        private int settingBacklightPage_;
        private int settingPage_;
        private int settingWatchfacePage_;
        private int smartDndCount_;
        private int snapCount_;
        private int sportDetectionCount_;
        private int sportGpsFail_;
        private int sportGpsSkip_;
        private int sportGpsfound_;
        private int sportHistoryPage_;
        private int sportListPage_;
        private int sportRealtimeSwitchCount_;
        private int sportSettingPage_;
        private int standGoalAchieve_;
        private int statusPage_;
        private int stepGoalAchieve_;
        private int stopwatchNum_;
        private int stressDetectionPage_;
        private int stressSuspendCount_;
        private int swimCount_;
        private int targetSettingCount_;
        private int timerCountdownPage_;
        private int timerStopwatchPage_;
        private int trainCount_;
        private int voiceRecogCount_;
        private int walkCount_;
        private int weatherPage_;
        private int wristFlipEvent_;

        public static final class Builder extends GeneratedMessageLite.Builder<VeniceEventMessage, Builder> implements VeniceEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAlarmPage() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearAlarmPage();
                return this;
            }

            public Builder clearAlarmRemindCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearAlarmRemindCount();
                return this;
            }

            public Builder clearAlipayBindSuccCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearAlipayBindSuccCount();
                return this;
            }

            public Builder clearAlipayCode128Num() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearAlipayCode128Num();
                return this;
            }

            public Builder clearAlipayPage() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearAlipayPage();
                return this;
            }

            public Builder clearAlipayQRCodeNum() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearAlipayQRCodeNum();
                return this;
            }

            public Builder clearAllGoalAchieve() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearAllGoalAchieve();
                return this;
            }

            public Builder clearAlldayHrPage() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearAlldayHrPage();
                return this;
            }

            public Builder clearAutoBrightOn() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearAutoBrightOn();
                return this;
            }

            public Builder clearAutoExtinguishOn() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearAutoExtinguishOn();
                return this;
            }

            public Builder clearBloodoxygenExplain() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearBloodoxygenExplain();
                return this;
            }

            public Builder clearBloodoxygenPage() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearBloodoxygenPage();
                return this;
            }

            public Builder clearCalorieGoalAchieve() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearCalorieGoalAchieve();
                return this;
            }

            public Builder clearChangeDialCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearChangeDialCount();
                return this;
            }

            public Builder clearChargingCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearChargingCount();
                return this;
            }

            public Builder clearCombinDialCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearCombinDialCount();
                return this;
            }

            public Builder clearCountdownNum() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearCountdownNum();
                return this;
            }

            public Builder clearDialApplistPageView() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearDialApplistPageView();
                return this;
            }

            public Builder clearDialControlPage() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearDialControlPage();
                return this;
            }

            public Builder clearDialId() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearDialId();
                return this;
            }

            public Builder clearDndCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearDndCount();
                return this;
            }

            public Builder clearDndCustomCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearDndCustomCount();
                return this;
            }

            public Builder clearEllipticalCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearEllipticalCount();
                return this;
            }

            public Builder clearEventRemindCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearEventRemindCount();
                return this;
            }

            public Builder clearExtinguishTimeOn() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearExtinguishTimeOn();
                return this;
            }

            public Builder clearFactoryResetCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearFactoryResetCount();
                return this;
            }

            public Builder clearFindPhoneCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearFindPhoneCount();
                return this;
            }

            public Builder clearFlashLightPage() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearFlashLightPage();
                return this;
            }

            public Builder clearHRExplain() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearHRExplain();
                return this;
            }

            public Builder clearIndoorRiddingCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearIndoorRiddingCount();
                return this;
            }

            public Builder clearIndoorRunCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearIndoorRunCount();
                return this;
            }

            public Builder clearIndoorSwimCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearIndoorSwimCount();
                return this;
            }

            public Builder clearLcdOnBecauseOfEvent() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearLcdOnBecauseOfEvent();
                return this;
            }

            public Builder clearLcdOnBecauseOfPress() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearLcdOnBecauseOfPress();
                return this;
            }

            public Builder clearManualMeasurBloodoxygen() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearManualMeasurBloodoxygen();
                return this;
            }

            public Builder clearManualMeasurHR() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearManualMeasurHR();
                return this;
            }

            public Builder clearManualMeasurStress() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearManualMeasurStress();
                return this;
            }

            public Builder clearMotionDetectionOn() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearMotionDetectionOn();
                return this;
            }

            public Builder clearMusicPage() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearMusicPage();
                return this;
            }

            public Builder clearNotifiDeleAllCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearNotifiDeleAllCount();
                return this;
            }

            public Builder clearNotifiSlipDeleCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearNotifiSlipDeleCount();
                return this;
            }

            public Builder clearOutdoorRiddingCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearOutdoorRiddingCount();
                return this;
            }

            public Builder clearOutdoorRunCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearOutdoorRunCount();
                return this;
            }

            public Builder clearPAIGoalAchieve() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearPAIGoalAchieve();
                return this;
            }

            public Builder clearPaiDetailPage() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearPaiDetailPage();
                return this;
            }

            public Builder clearPalmCoverCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearPalmCoverCount();
                return this;
            }

            public Builder clearPinchOnCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearPinchOnCount();
                return this;
            }

            public Builder clearPowerSavingPage() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearPowerSavingPage();
                return this;
            }

            public Builder clearQuickStartPage() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearQuickStartPage();
                return this;
            }

            public Builder clearQuickStartSettingSave() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearQuickStartSettingSave();
                return this;
            }

            public Builder clearRemindPage() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearRemindPage();
                return this;
            }

            public Builder clearScreenNotificatiion() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearScreenNotificatiion();
                return this;
            }

            public Builder clearScreenPwdOnCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearScreenPwdOnCount();
                return this;
            }

            public Builder clearSettingBacklightPage() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearSettingBacklightPage();
                return this;
            }

            public Builder clearSettingPage() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearSettingPage();
                return this;
            }

            public Builder clearSettingWatchfacePage() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearSettingWatchfacePage();
                return this;
            }

            public Builder clearSmartDndCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearSmartDndCount();
                return this;
            }

            public Builder clearSnapCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearSnapCount();
                return this;
            }

            public Builder clearSportDetectionCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearSportDetectionCount();
                return this;
            }

            public Builder clearSportGpsFail() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearSportGpsFail();
                return this;
            }

            public Builder clearSportGpsSkip() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearSportGpsSkip();
                return this;
            }

            public Builder clearSportGpsfound() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearSportGpsfound();
                return this;
            }

            public Builder clearSportHistoryPage() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearSportHistoryPage();
                return this;
            }

            public Builder clearSportListPage() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearSportListPage();
                return this;
            }

            public Builder clearSportRealtimeSwitchCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearSportRealtimeSwitchCount();
                return this;
            }

            public Builder clearSportSettingPage() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearSportSettingPage();
                return this;
            }

            public Builder clearStandGoalAchieve() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearStandGoalAchieve();
                return this;
            }

            public Builder clearStatusPage() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearStatusPage();
                return this;
            }

            public Builder clearStepGoalAchieve() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearStepGoalAchieve();
                return this;
            }

            public Builder clearStopwatchNum() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearStopwatchNum();
                return this;
            }

            public Builder clearStressDetectionPage() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearStressDetectionPage();
                return this;
            }

            public Builder clearStressSuspendCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearStressSuspendCount();
                return this;
            }

            public Builder clearSwimCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearSwimCount();
                return this;
            }

            public Builder clearTargetSettingCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearTargetSettingCount();
                return this;
            }

            public Builder clearTimerCountdownPage() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearTimerCountdownPage();
                return this;
            }

            public Builder clearTimerStopwatchPage() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearTimerStopwatchPage();
                return this;
            }

            public Builder clearTrainCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearTrainCount();
                return this;
            }

            public Builder clearVoiceRecogCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearVoiceRecogCount();
                return this;
            }

            public Builder clearWalkCount() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearWalkCount();
                return this;
            }

            public Builder clearWeatherPage() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearWeatherPage();
                return this;
            }

            public Builder clearWristFlipEvent() {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).clearWristFlipEvent();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getAlarmPage() {
                return ((VeniceEventMessage) this.instance).getAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getAlarmRemindCount() {
                return ((VeniceEventMessage) this.instance).getAlarmRemindCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getAlipayBindSuccCount() {
                return ((VeniceEventMessage) this.instance).getAlipayBindSuccCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getAlipayCode128Num() {
                return ((VeniceEventMessage) this.instance).getAlipayCode128Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getAlipayPage() {
                return ((VeniceEventMessage) this.instance).getAlipayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getAlipayQRCodeNum() {
                return ((VeniceEventMessage) this.instance).getAlipayQRCodeNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getAllGoalAchieve() {
                return ((VeniceEventMessage) this.instance).getAllGoalAchieve();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getAlldayHrPage() {
                return ((VeniceEventMessage) this.instance).getAlldayHrPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getAutoBrightOn() {
                return ((VeniceEventMessage) this.instance).getAutoBrightOn();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getAutoExtinguishOn() {
                return ((VeniceEventMessage) this.instance).getAutoExtinguishOn();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getBloodoxygenExplain() {
                return ((VeniceEventMessage) this.instance).getBloodoxygenExplain();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getBloodoxygenPage() {
                return ((VeniceEventMessage) this.instance).getBloodoxygenPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getCalorieGoalAchieve() {
                return ((VeniceEventMessage) this.instance).getCalorieGoalAchieve();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getChangeDialCount() {
                return ((VeniceEventMessage) this.instance).getChangeDialCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getChargingCount() {
                return ((VeniceEventMessage) this.instance).getChargingCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getCombinDialCount() {
                return ((VeniceEventMessage) this.instance).getCombinDialCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getCountdownNum() {
                return ((VeniceEventMessage) this.instance).getCountdownNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getDialApplistPageView() {
                return ((VeniceEventMessage) this.instance).getDialApplistPageView();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getDialControlPage() {
                return ((VeniceEventMessage) this.instance).getDialControlPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getDialId() {
                return ((VeniceEventMessage) this.instance).getDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getDndCount() {
                return ((VeniceEventMessage) this.instance).getDndCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getDndCustomCount() {
                return ((VeniceEventMessage) this.instance).getDndCustomCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getEllipticalCount() {
                return ((VeniceEventMessage) this.instance).getEllipticalCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getEventRemindCount() {
                return ((VeniceEventMessage) this.instance).getEventRemindCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getExtinguishTimeOn() {
                return ((VeniceEventMessage) this.instance).getExtinguishTimeOn();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getFactoryResetCount() {
                return ((VeniceEventMessage) this.instance).getFactoryResetCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getFindPhoneCount() {
                return ((VeniceEventMessage) this.instance).getFindPhoneCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getFlashLightPage() {
                return ((VeniceEventMessage) this.instance).getFlashLightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getHRExplain() {
                return ((VeniceEventMessage) this.instance).getHRExplain();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getIndoorRiddingCount() {
                return ((VeniceEventMessage) this.instance).getIndoorRiddingCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getIndoorRunCount() {
                return ((VeniceEventMessage) this.instance).getIndoorRunCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getIndoorSwimCount() {
                return ((VeniceEventMessage) this.instance).getIndoorSwimCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getLcdOnBecauseOfEvent() {
                return ((VeniceEventMessage) this.instance).getLcdOnBecauseOfEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getLcdOnBecauseOfPress() {
                return ((VeniceEventMessage) this.instance).getLcdOnBecauseOfPress();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getManualMeasurBloodoxygen() {
                return ((VeniceEventMessage) this.instance).getManualMeasurBloodoxygen();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getManualMeasurHR() {
                return ((VeniceEventMessage) this.instance).getManualMeasurHR();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getManualMeasurStress() {
                return ((VeniceEventMessage) this.instance).getManualMeasurStress();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getMotionDetectionOn() {
                return ((VeniceEventMessage) this.instance).getMotionDetectionOn();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getMusicPage() {
                return ((VeniceEventMessage) this.instance).getMusicPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getNotifiDeleAllCount() {
                return ((VeniceEventMessage) this.instance).getNotifiDeleAllCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getNotifiSlipDeleCount() {
                return ((VeniceEventMessage) this.instance).getNotifiSlipDeleCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getOutdoorRiddingCount() {
                return ((VeniceEventMessage) this.instance).getOutdoorRiddingCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getOutdoorRunCount() {
                return ((VeniceEventMessage) this.instance).getOutdoorRunCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getPAIGoalAchieve() {
                return ((VeniceEventMessage) this.instance).getPAIGoalAchieve();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getPaiDetailPage() {
                return ((VeniceEventMessage) this.instance).getPaiDetailPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getPalmCoverCount() {
                return ((VeniceEventMessage) this.instance).getPalmCoverCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getPinchOnCount() {
                return ((VeniceEventMessage) this.instance).getPinchOnCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getPowerSavingPage() {
                return ((VeniceEventMessage) this.instance).getPowerSavingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getQuickStartPage() {
                return ((VeniceEventMessage) this.instance).getQuickStartPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getQuickStartSettingSave() {
                return ((VeniceEventMessage) this.instance).getQuickStartSettingSave();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getRemindPage() {
                return ((VeniceEventMessage) this.instance).getRemindPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getScreenNotificatiion() {
                return ((VeniceEventMessage) this.instance).getScreenNotificatiion();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getScreenPwdOnCount() {
                return ((VeniceEventMessage) this.instance).getScreenPwdOnCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getSettingBacklightPage() {
                return ((VeniceEventMessage) this.instance).getSettingBacklightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getSettingPage() {
                return ((VeniceEventMessage) this.instance).getSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getSettingWatchfacePage() {
                return ((VeniceEventMessage) this.instance).getSettingWatchfacePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getSmartDndCount() {
                return ((VeniceEventMessage) this.instance).getSmartDndCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getSnapCount() {
                return ((VeniceEventMessage) this.instance).getSnapCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getSportDetectionCount() {
                return ((VeniceEventMessage) this.instance).getSportDetectionCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getSportGpsFail() {
                return ((VeniceEventMessage) this.instance).getSportGpsFail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getSportGpsSkip() {
                return ((VeniceEventMessage) this.instance).getSportGpsSkip();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getSportGpsfound() {
                return ((VeniceEventMessage) this.instance).getSportGpsfound();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getSportHistoryPage() {
                return ((VeniceEventMessage) this.instance).getSportHistoryPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getSportListPage() {
                return ((VeniceEventMessage) this.instance).getSportListPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getSportRealtimeSwitchCount() {
                return ((VeniceEventMessage) this.instance).getSportRealtimeSwitchCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getSportSettingPage() {
                return ((VeniceEventMessage) this.instance).getSportSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getStandGoalAchieve() {
                return ((VeniceEventMessage) this.instance).getStandGoalAchieve();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getStatusPage() {
                return ((VeniceEventMessage) this.instance).getStatusPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getStepGoalAchieve() {
                return ((VeniceEventMessage) this.instance).getStepGoalAchieve();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getStopwatchNum() {
                return ((VeniceEventMessage) this.instance).getStopwatchNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getStressDetectionPage() {
                return ((VeniceEventMessage) this.instance).getStressDetectionPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getStressSuspendCount() {
                return ((VeniceEventMessage) this.instance).getStressSuspendCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getSwimCount() {
                return ((VeniceEventMessage) this.instance).getSwimCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getTargetSettingCount() {
                return ((VeniceEventMessage) this.instance).getTargetSettingCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getTimerCountdownPage() {
                return ((VeniceEventMessage) this.instance).getTimerCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getTimerStopwatchPage() {
                return ((VeniceEventMessage) this.instance).getTimerStopwatchPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getTrainCount() {
                return ((VeniceEventMessage) this.instance).getTrainCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getVoiceRecogCount() {
                return ((VeniceEventMessage) this.instance).getVoiceRecogCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getWalkCount() {
                return ((VeniceEventMessage) this.instance).getWalkCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getWeatherPage() {
                return ((VeniceEventMessage) this.instance).getWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public int getWristFlipEvent() {
                return ((VeniceEventMessage) this.instance).getWristFlipEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasAlarmPage() {
                return ((VeniceEventMessage) this.instance).hasAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasAlarmRemindCount() {
                return ((VeniceEventMessage) this.instance).hasAlarmRemindCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasAlipayBindSuccCount() {
                return ((VeniceEventMessage) this.instance).hasAlipayBindSuccCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasAlipayCode128Num() {
                return ((VeniceEventMessage) this.instance).hasAlipayCode128Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasAlipayPage() {
                return ((VeniceEventMessage) this.instance).hasAlipayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasAlipayQRCodeNum() {
                return ((VeniceEventMessage) this.instance).hasAlipayQRCodeNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasAllGoalAchieve() {
                return ((VeniceEventMessage) this.instance).hasAllGoalAchieve();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasAlldayHrPage() {
                return ((VeniceEventMessage) this.instance).hasAlldayHrPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasAutoBrightOn() {
                return ((VeniceEventMessage) this.instance).hasAutoBrightOn();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasAutoExtinguishOn() {
                return ((VeniceEventMessage) this.instance).hasAutoExtinguishOn();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasBloodoxygenExplain() {
                return ((VeniceEventMessage) this.instance).hasBloodoxygenExplain();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasBloodoxygenPage() {
                return ((VeniceEventMessage) this.instance).hasBloodoxygenPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasCalorieGoalAchieve() {
                return ((VeniceEventMessage) this.instance).hasCalorieGoalAchieve();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasChangeDialCount() {
                return ((VeniceEventMessage) this.instance).hasChangeDialCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasChargingCount() {
                return ((VeniceEventMessage) this.instance).hasChargingCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasCombinDialCount() {
                return ((VeniceEventMessage) this.instance).hasCombinDialCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasCountdownNum() {
                return ((VeniceEventMessage) this.instance).hasCountdownNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasDialApplistPageView() {
                return ((VeniceEventMessage) this.instance).hasDialApplistPageView();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasDialControlPage() {
                return ((VeniceEventMessage) this.instance).hasDialControlPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasDialId() {
                return ((VeniceEventMessage) this.instance).hasDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasDndCount() {
                return ((VeniceEventMessage) this.instance).hasDndCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasDndCustomCount() {
                return ((VeniceEventMessage) this.instance).hasDndCustomCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasEllipticalCount() {
                return ((VeniceEventMessage) this.instance).hasEllipticalCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasEventRemindCount() {
                return ((VeniceEventMessage) this.instance).hasEventRemindCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasExtinguishTimeOn() {
                return ((VeniceEventMessage) this.instance).hasExtinguishTimeOn();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasFactoryResetCount() {
                return ((VeniceEventMessage) this.instance).hasFactoryResetCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasFindPhoneCount() {
                return ((VeniceEventMessage) this.instance).hasFindPhoneCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasFlashLightPage() {
                return ((VeniceEventMessage) this.instance).hasFlashLightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasHRExplain() {
                return ((VeniceEventMessage) this.instance).hasHRExplain();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasIndoorRiddingCount() {
                return ((VeniceEventMessage) this.instance).hasIndoorRiddingCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasIndoorRunCount() {
                return ((VeniceEventMessage) this.instance).hasIndoorRunCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasIndoorSwimCount() {
                return ((VeniceEventMessage) this.instance).hasIndoorSwimCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfEvent() {
                return ((VeniceEventMessage) this.instance).hasLcdOnBecauseOfEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfPress() {
                return ((VeniceEventMessage) this.instance).hasLcdOnBecauseOfPress();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasManualMeasurBloodoxygen() {
                return ((VeniceEventMessage) this.instance).hasManualMeasurBloodoxygen();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasManualMeasurHR() {
                return ((VeniceEventMessage) this.instance).hasManualMeasurHR();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasManualMeasurStress() {
                return ((VeniceEventMessage) this.instance).hasManualMeasurStress();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasMotionDetectionOn() {
                return ((VeniceEventMessage) this.instance).hasMotionDetectionOn();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasMusicPage() {
                return ((VeniceEventMessage) this.instance).hasMusicPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasNotifiDeleAllCount() {
                return ((VeniceEventMessage) this.instance).hasNotifiDeleAllCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasNotifiSlipDeleCount() {
                return ((VeniceEventMessage) this.instance).hasNotifiSlipDeleCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasOutdoorRiddingCount() {
                return ((VeniceEventMessage) this.instance).hasOutdoorRiddingCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasOutdoorRunCount() {
                return ((VeniceEventMessage) this.instance).hasOutdoorRunCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasPAIGoalAchieve() {
                return ((VeniceEventMessage) this.instance).hasPAIGoalAchieve();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasPaiDetailPage() {
                return ((VeniceEventMessage) this.instance).hasPaiDetailPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasPalmCoverCount() {
                return ((VeniceEventMessage) this.instance).hasPalmCoverCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasPinchOnCount() {
                return ((VeniceEventMessage) this.instance).hasPinchOnCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasPowerSavingPage() {
                return ((VeniceEventMessage) this.instance).hasPowerSavingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasQuickStartPage() {
                return ((VeniceEventMessage) this.instance).hasQuickStartPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasQuickStartSettingSave() {
                return ((VeniceEventMessage) this.instance).hasQuickStartSettingSave();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasRemindPage() {
                return ((VeniceEventMessage) this.instance).hasRemindPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasScreenNotificatiion() {
                return ((VeniceEventMessage) this.instance).hasScreenNotificatiion();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasScreenPwdOnCount() {
                return ((VeniceEventMessage) this.instance).hasScreenPwdOnCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasSettingBacklightPage() {
                return ((VeniceEventMessage) this.instance).hasSettingBacklightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasSettingPage() {
                return ((VeniceEventMessage) this.instance).hasSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasSettingWatchfacePage() {
                return ((VeniceEventMessage) this.instance).hasSettingWatchfacePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasSmartDndCount() {
                return ((VeniceEventMessage) this.instance).hasSmartDndCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasSnapCount() {
                return ((VeniceEventMessage) this.instance).hasSnapCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasSportDetectionCount() {
                return ((VeniceEventMessage) this.instance).hasSportDetectionCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasSportGpsFail() {
                return ((VeniceEventMessage) this.instance).hasSportGpsFail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasSportGpsSkip() {
                return ((VeniceEventMessage) this.instance).hasSportGpsSkip();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasSportGpsfound() {
                return ((VeniceEventMessage) this.instance).hasSportGpsfound();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasSportHistoryPage() {
                return ((VeniceEventMessage) this.instance).hasSportHistoryPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasSportListPage() {
                return ((VeniceEventMessage) this.instance).hasSportListPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasSportRealtimeSwitchCount() {
                return ((VeniceEventMessage) this.instance).hasSportRealtimeSwitchCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasSportSettingPage() {
                return ((VeniceEventMessage) this.instance).hasSportSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasStandGoalAchieve() {
                return ((VeniceEventMessage) this.instance).hasStandGoalAchieve();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasStatusPage() {
                return ((VeniceEventMessage) this.instance).hasStatusPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasStepGoalAchieve() {
                return ((VeniceEventMessage) this.instance).hasStepGoalAchieve();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasStopwatchNum() {
                return ((VeniceEventMessage) this.instance).hasStopwatchNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasStressDetectionPage() {
                return ((VeniceEventMessage) this.instance).hasStressDetectionPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasStressSuspendCount() {
                return ((VeniceEventMessage) this.instance).hasStressSuspendCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasSwimCount() {
                return ((VeniceEventMessage) this.instance).hasSwimCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasTargetSettingCount() {
                return ((VeniceEventMessage) this.instance).hasTargetSettingCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasTimerCountdownPage() {
                return ((VeniceEventMessage) this.instance).hasTimerCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasTimerStopwatchPage() {
                return ((VeniceEventMessage) this.instance).hasTimerStopwatchPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasTrainCount() {
                return ((VeniceEventMessage) this.instance).hasTrainCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasVoiceRecogCount() {
                return ((VeniceEventMessage) this.instance).hasVoiceRecogCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasWalkCount() {
                return ((VeniceEventMessage) this.instance).hasWalkCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasWeatherPage() {
                return ((VeniceEventMessage) this.instance).hasWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
            public boolean hasWristFlipEvent() {
                return ((VeniceEventMessage) this.instance).hasWristFlipEvent();
            }

            public Builder setAlarmPage(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setAlarmPage(value);
                return this;
            }

            public Builder setAlarmRemindCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setAlarmRemindCount(value);
                return this;
            }

            public Builder setAlipayBindSuccCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setAlipayBindSuccCount(value);
                return this;
            }

            public Builder setAlipayCode128Num(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setAlipayCode128Num(value);
                return this;
            }

            public Builder setAlipayPage(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setAlipayPage(value);
                return this;
            }

            public Builder setAlipayQRCodeNum(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setAlipayQRCodeNum(value);
                return this;
            }

            public Builder setAllGoalAchieve(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setAllGoalAchieve(value);
                return this;
            }

            public Builder setAlldayHrPage(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setAlldayHrPage(value);
                return this;
            }

            public Builder setAutoBrightOn(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setAutoBrightOn(value);
                return this;
            }

            public Builder setAutoExtinguishOn(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setAutoExtinguishOn(value);
                return this;
            }

            public Builder setBloodoxygenExplain(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setBloodoxygenExplain(value);
                return this;
            }

            public Builder setBloodoxygenPage(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setBloodoxygenPage(value);
                return this;
            }

            public Builder setCalorieGoalAchieve(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setCalorieGoalAchieve(value);
                return this;
            }

            public Builder setChangeDialCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setChangeDialCount(value);
                return this;
            }

            public Builder setChargingCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setChargingCount(value);
                return this;
            }

            public Builder setCombinDialCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setCombinDialCount(value);
                return this;
            }

            public Builder setCountdownNum(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setCountdownNum(value);
                return this;
            }

            public Builder setDialApplistPageView(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setDialApplistPageView(value);
                return this;
            }

            public Builder setDialControlPage(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setDialControlPage(value);
                return this;
            }

            public Builder setDialId(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setDialId(value);
                return this;
            }

            public Builder setDndCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setDndCount(value);
                return this;
            }

            public Builder setDndCustomCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setDndCustomCount(value);
                return this;
            }

            public Builder setEllipticalCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setEllipticalCount(value);
                return this;
            }

            public Builder setEventRemindCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setEventRemindCount(value);
                return this;
            }

            public Builder setExtinguishTimeOn(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setExtinguishTimeOn(value);
                return this;
            }

            public Builder setFactoryResetCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setFactoryResetCount(value);
                return this;
            }

            public Builder setFindPhoneCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setFindPhoneCount(value);
                return this;
            }

            public Builder setFlashLightPage(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setFlashLightPage(value);
                return this;
            }

            public Builder setHRExplain(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setHRExplain(value);
                return this;
            }

            public Builder setIndoorRiddingCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setIndoorRiddingCount(value);
                return this;
            }

            public Builder setIndoorRunCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setIndoorRunCount(value);
                return this;
            }

            public Builder setIndoorSwimCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setIndoorSwimCount(value);
                return this;
            }

            public Builder setLcdOnBecauseOfEvent(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setLcdOnBecauseOfEvent(value);
                return this;
            }

            public Builder setLcdOnBecauseOfPress(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setLcdOnBecauseOfPress(value);
                return this;
            }

            public Builder setManualMeasurBloodoxygen(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setManualMeasurBloodoxygen(value);
                return this;
            }

            public Builder setManualMeasurHR(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setManualMeasurHR(value);
                return this;
            }

            public Builder setManualMeasurStress(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setManualMeasurStress(value);
                return this;
            }

            public Builder setMotionDetectionOn(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setMotionDetectionOn(value);
                return this;
            }

            public Builder setMusicPage(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setMusicPage(value);
                return this;
            }

            public Builder setNotifiDeleAllCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setNotifiDeleAllCount(value);
                return this;
            }

            public Builder setNotifiSlipDeleCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setNotifiSlipDeleCount(value);
                return this;
            }

            public Builder setOutdoorRiddingCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setOutdoorRiddingCount(value);
                return this;
            }

            public Builder setOutdoorRunCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setOutdoorRunCount(value);
                return this;
            }

            public Builder setPAIGoalAchieve(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setPAIGoalAchieve(value);
                return this;
            }

            public Builder setPaiDetailPage(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setPaiDetailPage(value);
                return this;
            }

            public Builder setPalmCoverCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setPalmCoverCount(value);
                return this;
            }

            public Builder setPinchOnCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setPinchOnCount(value);
                return this;
            }

            public Builder setPowerSavingPage(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setPowerSavingPage(value);
                return this;
            }

            public Builder setQuickStartPage(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setQuickStartPage(value);
                return this;
            }

            public Builder setQuickStartSettingSave(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setQuickStartSettingSave(value);
                return this;
            }

            public Builder setRemindPage(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setRemindPage(value);
                return this;
            }

            public Builder setScreenNotificatiion(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setScreenNotificatiion(value);
                return this;
            }

            public Builder setScreenPwdOnCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setScreenPwdOnCount(value);
                return this;
            }

            public Builder setSettingBacklightPage(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setSettingBacklightPage(value);
                return this;
            }

            public Builder setSettingPage(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setSettingPage(value);
                return this;
            }

            public Builder setSettingWatchfacePage(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setSettingWatchfacePage(value);
                return this;
            }

            public Builder setSmartDndCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setSmartDndCount(value);
                return this;
            }

            public Builder setSnapCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setSnapCount(value);
                return this;
            }

            public Builder setSportDetectionCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setSportDetectionCount(value);
                return this;
            }

            public Builder setSportGpsFail(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setSportGpsFail(value);
                return this;
            }

            public Builder setSportGpsSkip(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setSportGpsSkip(value);
                return this;
            }

            public Builder setSportGpsfound(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setSportGpsfound(value);
                return this;
            }

            public Builder setSportHistoryPage(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setSportHistoryPage(value);
                return this;
            }

            public Builder setSportListPage(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setSportListPage(value);
                return this;
            }

            public Builder setSportRealtimeSwitchCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setSportRealtimeSwitchCount(value);
                return this;
            }

            public Builder setSportSettingPage(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setSportSettingPage(value);
                return this;
            }

            public Builder setStandGoalAchieve(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setStandGoalAchieve(value);
                return this;
            }

            public Builder setStatusPage(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setStatusPage(value);
                return this;
            }

            public Builder setStepGoalAchieve(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setStepGoalAchieve(value);
                return this;
            }

            public Builder setStopwatchNum(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setStopwatchNum(value);
                return this;
            }

            public Builder setStressDetectionPage(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setStressDetectionPage(value);
                return this;
            }

            public Builder setStressSuspendCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setStressSuspendCount(value);
                return this;
            }

            public Builder setSwimCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setSwimCount(value);
                return this;
            }

            public Builder setTargetSettingCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setTargetSettingCount(value);
                return this;
            }

            public Builder setTimerCountdownPage(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setTimerCountdownPage(value);
                return this;
            }

            public Builder setTimerStopwatchPage(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setTimerStopwatchPage(value);
                return this;
            }

            public Builder setTrainCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setTrainCount(value);
                return this;
            }

            public Builder setVoiceRecogCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setVoiceRecogCount(value);
                return this;
            }

            public Builder setWalkCount(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setWalkCount(value);
                return this;
            }

            public Builder setWeatherPage(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setWeatherPage(value);
                return this;
            }

            public Builder setWristFlipEvent(int value) {
                copyOnWrite();
                ((VeniceEventMessage) this.instance).setWristFlipEvent(value);
                return this;
            }

            private Builder() {
                super(VeniceEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            VeniceEventMessage veniceEventMessage = new VeniceEventMessage();
            DEFAULT_INSTANCE = veniceEventMessage;
            GeneratedMessageLite.registerDefaultInstance(VeniceEventMessage.class, veniceEventMessage);
        }

        private VeniceEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmPage() {
            this.bitField0_ &= -65537;
            this.alarmPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmRemindCount() {
            this.bitField0_ &= -131073;
            this.alarmRemindCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayBindSuccCount() {
            this.bitField1_ &= -3;
            this.alipayBindSuccCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCode128Num() {
            this.bitField1_ &= -9;
            this.alipayCode128Num_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayPage() {
            this.bitField1_ &= -2;
            this.alipayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRCodeNum() {
            this.bitField1_ &= -5;
            this.alipayQRCodeNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAllGoalAchieve() {
            this.bitField1_ &= -4194305;
            this.allGoalAchieve_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlldayHrPage() {
            this.bitField1_ &= -8388609;
            this.alldayHrPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAutoBrightOn() {
            this.bitField1_ &= -65;
            this.autoBrightOn_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAutoExtinguishOn() {
            this.bitField1_ &= -129;
            this.autoExtinguishOn_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBloodoxygenExplain() {
            this.bitField1_ &= -268435457;
            this.bloodoxygenExplain_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBloodoxygenPage() {
            this.bitField1_ &= -67108865;
            this.bloodoxygenPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCalorieGoalAchieve() {
            this.bitField1_ &= -1048577;
            this.calorieGoalAchieve_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChangeDialCount() {
            this.bitField0_ &= -257;
            this.changeDialCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChargingCount() {
            this.bitField0_ &= -17;
            this.chargingCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCombinDialCount() {
            this.bitField0_ &= -129;
            this.combinDialCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountdownNum() {
            this.bitField0_ &= -4097;
            this.countdownNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialApplistPageView() {
            this.bitField0_ &= -1025;
            this.dialApplistPageView_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialControlPage() {
            this.bitField0_ &= -2097153;
            this.dialControlPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialId() {
            this.bitField0_ &= -513;
            this.dialId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDndCount() {
            this.bitField0_ &= -67108865;
            this.dndCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDndCustomCount() {
            this.bitField1_ &= -2049;
            this.dndCustomCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEllipticalCount() {
            this.bitField2_ &= -65;
            this.ellipticalCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventRemindCount() {
            this.bitField0_ &= -524289;
            this.eventRemindCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExtinguishTimeOn() {
            this.bitField1_ &= -257;
            this.extinguishTimeOn_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFactoryResetCount() {
            this.bitField0_ &= -9;
            this.factoryResetCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFindPhoneCount() {
            this.bitField0_ &= -4194305;
            this.findPhoneCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFlashLightPage() {
            this.bitField0_ &= -8388609;
            this.flashLightPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHRExplain() {
            this.bitField1_ &= -33554433;
            this.hRExplain_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIndoorRiddingCount() {
            this.bitField2_ &= -33;
            this.indoorRiddingCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIndoorRunCount() {
            this.bitField2_ &= -3;
            this.indoorRunCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIndoorSwimCount() {
            this.bitField2_ &= -257;
            this.indoorSwimCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLcdOnBecauseOfEvent() {
            this.bitField0_ &= -3;
            this.lcdOnBecauseOfEvent_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLcdOnBecauseOfPress() {
            this.bitField0_ &= -2;
            this.lcdOnBecauseOfPress_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearManualMeasurBloodoxygen() {
            this.bitField1_ &= -134217729;
            this.manualMeasurBloodoxygen_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearManualMeasurHR() {
            this.bitField1_ &= -16777217;
            this.manualMeasurHR_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearManualMeasurStress() {
            this.bitField1_ &= -1073741825;
            this.manualMeasurStress_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMotionDetectionOn() {
            this.bitField1_ &= -513;
            this.motionDetectionOn_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicPage() {
            this.bitField0_ &= -1048577;
            this.musicPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotifiDeleAllCount() {
            this.bitField0_ &= -1073741825;
            this.notifiDeleAllCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotifiSlipDeleCount() {
            this.bitField0_ &= Integer.MAX_VALUE;
            this.notifiSlipDeleCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOutdoorRiddingCount() {
            this.bitField2_ &= -129;
            this.outdoorRiddingCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOutdoorRunCount() {
            this.bitField2_ &= -9;
            this.outdoorRunCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPAIGoalAchieve() {
            this.bitField1_ &= -524289;
            this.pAIGoalAchieve_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPaiDetailPage() {
            this.bitField1_ &= -131073;
            this.paiDetailPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPalmCoverCount() {
            this.bitField0_ &= -33;
            this.palmCoverCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPinchOnCount() {
            this.bitField1_ &= -16385;
            this.pinchOnCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPowerSavingPage() {
            this.bitField0_ &= -16777217;
            this.powerSavingPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQuickStartPage() {
            this.bitField0_ &= -134217729;
            this.quickStartPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQuickStartSettingSave() {
            this.bitField0_ &= -268435457;
            this.quickStartSettingSave_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemindPage() {
            this.bitField0_ &= -262145;
            this.remindPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScreenNotificatiion() {
            this.bitField0_ &= -536870913;
            this.screenNotificatiion_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScreenPwdOnCount() {
            this.bitField1_ &= -4097;
            this.screenPwdOnCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSettingBacklightPage() {
            this.bitField1_ &= -33;
            this.settingBacklightPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSettingPage() {
            this.bitField1_ &= -17;
            this.settingPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSettingWatchfacePage() {
            this.bitField0_ &= -65;
            this.settingWatchfacePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSmartDndCount() {
            this.bitField1_ &= -1025;
            this.smartDndCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSnapCount() {
            this.bitField0_ &= -33554433;
            this.snapCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportDetectionCount() {
            this.bitField2_ &= -32769;
            this.sportDetectionCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportGpsFail() {
            this.bitField2_ &= -16385;
            this.sportGpsFail_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportGpsSkip() {
            this.bitField2_ &= -8193;
            this.sportGpsSkip_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportGpsfound() {
            this.bitField2_ &= -4097;
            this.sportGpsfound_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportHistoryPage() {
            this.bitField2_ &= -1025;
            this.sportHistoryPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportListPage() {
            this.bitField2_ &= -2;
            this.sportListPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportRealtimeSwitchCount() {
            this.bitField2_ &= -65537;
            this.sportRealtimeSwitchCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportSettingPage() {
            this.bitField2_ &= -2049;
            this.sportSettingPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStandGoalAchieve() {
            this.bitField1_ &= -2097153;
            this.standGoalAchieve_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatusPage() {
            this.bitField1_ &= -32769;
            this.statusPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStepGoalAchieve() {
            this.bitField1_ &= -262145;
            this.stepGoalAchieve_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStopwatchNum() {
            this.bitField0_ &= -16385;
            this.stopwatchNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStressDetectionPage() {
            this.bitField1_ &= -536870913;
            this.stressDetectionPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStressSuspendCount() {
            this.bitField1_ &= Integer.MAX_VALUE;
            this.stressSuspendCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSwimCount() {
            this.bitField2_ &= -513;
            this.swimCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTargetSettingCount() {
            this.bitField1_ &= -65537;
            this.targetSettingCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimerCountdownPage() {
            this.bitField0_ &= -2049;
            this.timerCountdownPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimerStopwatchPage() {
            this.bitField0_ &= -8193;
            this.timerStopwatchPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTrainCount() {
            this.bitField2_ &= -5;
            this.trainCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVoiceRecogCount() {
            this.bitField1_ &= -8193;
            this.voiceRecogCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWalkCount() {
            this.bitField2_ &= -17;
            this.walkCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeatherPage() {
            this.bitField0_ &= -32769;
            this.weatherPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWristFlipEvent() {
            this.bitField0_ &= -5;
            this.wristFlipEvent_ = 0;
        }

        public static VeniceEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static VeniceEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (VeniceEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static VeniceEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (VeniceEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<VeniceEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmPage(int value) {
            this.bitField0_ |= 65536;
            this.alarmPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmRemindCount(int value) {
            this.bitField0_ |= 131072;
            this.alarmRemindCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayBindSuccCount(int value) {
            this.bitField1_ |= 2;
            this.alipayBindSuccCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCode128Num(int value) {
            this.bitField1_ |= 8;
            this.alipayCode128Num_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayPage(int value) {
            this.bitField1_ |= 1;
            this.alipayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRCodeNum(int value) {
            this.bitField1_ |= 4;
            this.alipayQRCodeNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAllGoalAchieve(int value) {
            this.bitField1_ |= 4194304;
            this.allGoalAchieve_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlldayHrPage(int value) {
            this.bitField1_ |= 8388608;
            this.alldayHrPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAutoBrightOn(int value) {
            this.bitField1_ |= 64;
            this.autoBrightOn_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAutoExtinguishOn(int value) {
            this.bitField1_ |= 128;
            this.autoExtinguishOn_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBloodoxygenExplain(int value) {
            this.bitField1_ |= 268435456;
            this.bloodoxygenExplain_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBloodoxygenPage(int value) {
            this.bitField1_ |= 67108864;
            this.bloodoxygenPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCalorieGoalAchieve(int value) {
            this.bitField1_ |= 1048576;
            this.calorieGoalAchieve_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChangeDialCount(int value) {
            this.bitField0_ |= 256;
            this.changeDialCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChargingCount(int value) {
            this.bitField0_ |= 16;
            this.chargingCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCombinDialCount(int value) {
            this.bitField0_ |= 128;
            this.combinDialCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountdownNum(int value) {
            this.bitField0_ |= 4096;
            this.countdownNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialApplistPageView(int value) {
            this.bitField0_ |= 1024;
            this.dialApplistPageView_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialControlPage(int value) {
            this.bitField0_ |= 2097152;
            this.dialControlPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialId(int value) {
            this.bitField0_ |= 512;
            this.dialId_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDndCount(int value) {
            this.bitField0_ |= 67108864;
            this.dndCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDndCustomCount(int value) {
            this.bitField1_ |= 2048;
            this.dndCustomCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEllipticalCount(int value) {
            this.bitField2_ |= 64;
            this.ellipticalCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventRemindCount(int value) {
            this.bitField0_ |= 524288;
            this.eventRemindCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExtinguishTimeOn(int value) {
            this.bitField1_ |= 256;
            this.extinguishTimeOn_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFactoryResetCount(int value) {
            this.bitField0_ |= 8;
            this.factoryResetCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFindPhoneCount(int value) {
            this.bitField0_ |= 4194304;
            this.findPhoneCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlashLightPage(int value) {
            this.bitField0_ |= 8388608;
            this.flashLightPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHRExplain(int value) {
            this.bitField1_ |= 33554432;
            this.hRExplain_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndoorRiddingCount(int value) {
            this.bitField2_ |= 32;
            this.indoorRiddingCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndoorRunCount(int value) {
            this.bitField2_ |= 2;
            this.indoorRunCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndoorSwimCount(int value) {
            this.bitField2_ |= 256;
            this.indoorSwimCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOnBecauseOfEvent(int value) {
            this.bitField0_ |= 2;
            this.lcdOnBecauseOfEvent_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOnBecauseOfPress(int value) {
            this.bitField0_ |= 1;
            this.lcdOnBecauseOfPress_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setManualMeasurBloodoxygen(int value) {
            this.bitField1_ |= AMapEngineUtils.HALF_MAX_P20_WIDTH;
            this.manualMeasurBloodoxygen_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setManualMeasurHR(int value) {
            this.bitField1_ |= 16777216;
            this.manualMeasurHR_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setManualMeasurStress(int value) {
            this.bitField1_ |= 1073741824;
            this.manualMeasurStress_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMotionDetectionOn(int value) {
            this.bitField1_ |= 512;
            this.motionDetectionOn_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicPage(int value) {
            this.bitField0_ |= 1048576;
            this.musicPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotifiDeleAllCount(int value) {
            this.bitField0_ |= 1073741824;
            this.notifiDeleAllCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotifiSlipDeleCount(int value) {
            this.bitField0_ |= Integer.MIN_VALUE;
            this.notifiSlipDeleCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOutdoorRiddingCount(int value) {
            this.bitField2_ |= 128;
            this.outdoorRiddingCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOutdoorRunCount(int value) {
            this.bitField2_ |= 8;
            this.outdoorRunCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPAIGoalAchieve(int value) {
            this.bitField1_ |= 524288;
            this.pAIGoalAchieve_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaiDetailPage(int value) {
            this.bitField1_ |= 131072;
            this.paiDetailPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPalmCoverCount(int value) {
            this.bitField0_ |= 32;
            this.palmCoverCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPinchOnCount(int value) {
            this.bitField1_ |= 16384;
            this.pinchOnCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPowerSavingPage(int value) {
            this.bitField0_ |= 16777216;
            this.powerSavingPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuickStartPage(int value) {
            this.bitField0_ |= AMapEngineUtils.HALF_MAX_P20_WIDTH;
            this.quickStartPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuickStartSettingSave(int value) {
            this.bitField0_ |= 268435456;
            this.quickStartSettingSave_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemindPage(int value) {
            this.bitField0_ |= 262144;
            this.remindPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScreenNotificatiion(int value) {
            this.bitField0_ |= 536870912;
            this.screenNotificatiion_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScreenPwdOnCount(int value) {
            this.bitField1_ |= 4096;
            this.screenPwdOnCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingBacklightPage(int value) {
            this.bitField1_ |= 32;
            this.settingBacklightPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingPage(int value) {
            this.bitField1_ |= 16;
            this.settingPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingWatchfacePage(int value) {
            this.bitField0_ |= 64;
            this.settingWatchfacePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSmartDndCount(int value) {
            this.bitField1_ |= 1024;
            this.smartDndCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSnapCount(int value) {
            this.bitField0_ |= 33554432;
            this.snapCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportDetectionCount(int value) {
            this.bitField2_ |= 32768;
            this.sportDetectionCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportGpsFail(int value) {
            this.bitField2_ |= 16384;
            this.sportGpsFail_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportGpsSkip(int value) {
            this.bitField2_ |= 8192;
            this.sportGpsSkip_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportGpsfound(int value) {
            this.bitField2_ |= 4096;
            this.sportGpsfound_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportHistoryPage(int value) {
            this.bitField2_ |= 1024;
            this.sportHistoryPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportListPage(int value) {
            this.bitField2_ |= 1;
            this.sportListPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportRealtimeSwitchCount(int value) {
            this.bitField2_ |= 65536;
            this.sportRealtimeSwitchCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportSettingPage(int value) {
            this.bitField2_ |= 2048;
            this.sportSettingPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStandGoalAchieve(int value) {
            this.bitField1_ |= 2097152;
            this.standGoalAchieve_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusPage(int value) {
            this.bitField1_ |= 32768;
            this.statusPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStepGoalAchieve(int value) {
            this.bitField1_ |= 262144;
            this.stepGoalAchieve_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopwatchNum(int value) {
            this.bitField0_ |= 16384;
            this.stopwatchNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStressDetectionPage(int value) {
            this.bitField1_ |= 536870912;
            this.stressDetectionPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStressSuspendCount(int value) {
            this.bitField1_ |= Integer.MIN_VALUE;
            this.stressSuspendCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwimCount(int value) {
            this.bitField2_ |= 512;
            this.swimCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTargetSettingCount(int value) {
            this.bitField1_ |= 65536;
            this.targetSettingCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimerCountdownPage(int value) {
            this.bitField0_ |= 2048;
            this.timerCountdownPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimerStopwatchPage(int value) {
            this.bitField0_ |= 8192;
            this.timerStopwatchPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTrainCount(int value) {
            this.bitField2_ |= 4;
            this.trainCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVoiceRecogCount(int value) {
            this.bitField1_ |= 8192;
            this.voiceRecogCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWalkCount(int value) {
            this.bitField2_ |= 16;
            this.walkCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeatherPage(int value) {
            this.bitField0_ |= 32768;
            this.weatherPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWristFlipEvent(int value) {
            this.bitField0_ |= 4;
            this.wristFlipEvent_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new VeniceEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001Q\u0000\u0003\u0001QQ\u0000\u0000M\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nဋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f\u0011ᔋ\u0010\u0012ᔋ\u0011\u0013ᔋ\u0012\u0014ᔋ\u0013\u0015ᔋ\u0014\u0016ᔋ\u0015\u0017ᔋ\u0016\u0018ᔋ\u0017\u0019ᔋ\u0018\u001aᔋ\u0019\u001bᔋ\u001a\u001cᔋ\u001b\u001dᔋ\u001c\u001eᔋ\u001d\u001fᔋ\u001e ᔋ\u001f!ᔋ \"ᔋ!#ဋ\"$ဋ#%ᔋ$&ᔋ%'ᔋ&(ᔋ')ᔋ(*ᔋ)+ᔋ*,ᔋ+-ᔋ,.ᔋ-/ᔋ.0ᔋ/1ᔋ02ဋ13ᔋ24ᔋ35ᔋ46ᔋ57ᔋ68ᔋ79ᔋ8:ᔋ9;ᔋ:<ᔋ;=ᔋ<>ᔋ=?ᔋ>@ᔋ?Aᔋ@BᔋACᔋBDᔋCEᔋDFᔋEGᔋFHᔋGIᔋHJᔋIKᔋJLᔋKMᔋLNᔋMOᔋNPᔋOQᔋP", new Object[]{"bitField0_", "bitField1_", "bitField2_", "lcdOnBecauseOfPress_", "lcdOnBecauseOfEvent_", "wristFlipEvent_", "factoryResetCount_", "chargingCount_", "palmCoverCount_", "settingWatchfacePage_", "combinDialCount_", "changeDialCount_", "dialId_", "dialApplistPageView_", "timerCountdownPage_", "countdownNum_", "timerStopwatchPage_", "stopwatchNum_", "weatherPage_", "alarmPage_", "alarmRemindCount_", "remindPage_", "eventRemindCount_", "musicPage_", "dialControlPage_", "findPhoneCount_", "flashLightPage_", "powerSavingPage_", "snapCount_", "dndCount_", "quickStartPage_", "quickStartSettingSave_", "screenNotificatiion_", "notifiDeleAllCount_", "notifiSlipDeleCount_", "alipayPage_", "alipayBindSuccCount_", "alipayQRCodeNum_", "alipayCode128Num_", "settingPage_", "settingBacklightPage_", "autoBrightOn_", "autoExtinguishOn_", "extinguishTimeOn_", "motionDetectionOn_", "smartDndCount_", "dndCustomCount_", "screenPwdOnCount_", "voiceRecogCount_", "pinchOnCount_", "statusPage_", "targetSettingCount_", "paiDetailPage_", "stepGoalAchieve_", "pAIGoalAchieve_", "calorieGoalAchieve_", "standGoalAchieve_", "allGoalAchieve_", "alldayHrPage_", "manualMeasurHR_", "hRExplain_", "bloodoxygenPage_", "manualMeasurBloodoxygen_", "bloodoxygenExplain_", "stressDetectionPage_", "manualMeasurStress_", "stressSuspendCount_", "sportListPage_", "indoorRunCount_", "trainCount_", "outdoorRunCount_", "walkCount_", "indoorRiddingCount_", "ellipticalCount_", "outdoorRiddingCount_", "indoorSwimCount_", "swimCount_", "sportHistoryPage_", "sportSettingPage_", "sportGpsfound_", "sportGpsSkip_", "sportGpsFail_", "sportDetectionCount_", "sportRealtimeSwitchCount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<VeniceEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (VeniceEventMessage.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getAlarmPage() {
            return this.alarmPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getAlarmRemindCount() {
            return this.alarmRemindCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getAlipayBindSuccCount() {
            return this.alipayBindSuccCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getAlipayCode128Num() {
            return this.alipayCode128Num_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getAlipayPage() {
            return this.alipayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getAlipayQRCodeNum() {
            return this.alipayQRCodeNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getAllGoalAchieve() {
            return this.allGoalAchieve_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getAlldayHrPage() {
            return this.alldayHrPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getAutoBrightOn() {
            return this.autoBrightOn_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getAutoExtinguishOn() {
            return this.autoExtinguishOn_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getBloodoxygenExplain() {
            return this.bloodoxygenExplain_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getBloodoxygenPage() {
            return this.bloodoxygenPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getCalorieGoalAchieve() {
            return this.calorieGoalAchieve_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getChangeDialCount() {
            return this.changeDialCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getChargingCount() {
            return this.chargingCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getCombinDialCount() {
            return this.combinDialCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getCountdownNum() {
            return this.countdownNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getDialApplistPageView() {
            return this.dialApplistPageView_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getDialControlPage() {
            return this.dialControlPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getDialId() {
            return this.dialId_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getDndCount() {
            return this.dndCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getDndCustomCount() {
            return this.dndCustomCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getEllipticalCount() {
            return this.ellipticalCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getEventRemindCount() {
            return this.eventRemindCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getExtinguishTimeOn() {
            return this.extinguishTimeOn_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getFactoryResetCount() {
            return this.factoryResetCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getFindPhoneCount() {
            return this.findPhoneCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getFlashLightPage() {
            return this.flashLightPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getHRExplain() {
            return this.hRExplain_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getIndoorRiddingCount() {
            return this.indoorRiddingCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getIndoorRunCount() {
            return this.indoorRunCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getIndoorSwimCount() {
            return this.indoorSwimCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getLcdOnBecauseOfEvent() {
            return this.lcdOnBecauseOfEvent_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getLcdOnBecauseOfPress() {
            return this.lcdOnBecauseOfPress_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getManualMeasurBloodoxygen() {
            return this.manualMeasurBloodoxygen_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getManualMeasurHR() {
            return this.manualMeasurHR_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getManualMeasurStress() {
            return this.manualMeasurStress_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getMotionDetectionOn() {
            return this.motionDetectionOn_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getMusicPage() {
            return this.musicPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getNotifiDeleAllCount() {
            return this.notifiDeleAllCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getNotifiSlipDeleCount() {
            return this.notifiSlipDeleCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getOutdoorRiddingCount() {
            return this.outdoorRiddingCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getOutdoorRunCount() {
            return this.outdoorRunCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getPAIGoalAchieve() {
            return this.pAIGoalAchieve_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getPaiDetailPage() {
            return this.paiDetailPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getPalmCoverCount() {
            return this.palmCoverCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getPinchOnCount() {
            return this.pinchOnCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getPowerSavingPage() {
            return this.powerSavingPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getQuickStartPage() {
            return this.quickStartPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getQuickStartSettingSave() {
            return this.quickStartSettingSave_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getRemindPage() {
            return this.remindPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getScreenNotificatiion() {
            return this.screenNotificatiion_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getScreenPwdOnCount() {
            return this.screenPwdOnCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getSettingBacklightPage() {
            return this.settingBacklightPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getSettingPage() {
            return this.settingPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getSettingWatchfacePage() {
            return this.settingWatchfacePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getSmartDndCount() {
            return this.smartDndCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getSnapCount() {
            return this.snapCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getSportDetectionCount() {
            return this.sportDetectionCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getSportGpsFail() {
            return this.sportGpsFail_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getSportGpsSkip() {
            return this.sportGpsSkip_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getSportGpsfound() {
            return this.sportGpsfound_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getSportHistoryPage() {
            return this.sportHistoryPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getSportListPage() {
            return this.sportListPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getSportRealtimeSwitchCount() {
            return this.sportRealtimeSwitchCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getSportSettingPage() {
            return this.sportSettingPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getStandGoalAchieve() {
            return this.standGoalAchieve_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getStatusPage() {
            return this.statusPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getStepGoalAchieve() {
            return this.stepGoalAchieve_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getStopwatchNum() {
            return this.stopwatchNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getStressDetectionPage() {
            return this.stressDetectionPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getStressSuspendCount() {
            return this.stressSuspendCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getSwimCount() {
            return this.swimCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getTargetSettingCount() {
            return this.targetSettingCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getTimerCountdownPage() {
            return this.timerCountdownPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getTimerStopwatchPage() {
            return this.timerStopwatchPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getTrainCount() {
            return this.trainCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getVoiceRecogCount() {
            return this.voiceRecogCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getWalkCount() {
            return this.walkCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getWeatherPage() {
            return this.weatherPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public int getWristFlipEvent() {
            return this.wristFlipEvent_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasAlarmPage() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasAlarmRemindCount() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasAlipayBindSuccCount() {
            return (this.bitField1_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasAlipayCode128Num() {
            return (this.bitField1_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasAlipayPage() {
            return (this.bitField1_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasAlipayQRCodeNum() {
            return (this.bitField1_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasAllGoalAchieve() {
            return (this.bitField1_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasAlldayHrPage() {
            return (this.bitField1_ & 8388608) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasAutoBrightOn() {
            return (this.bitField1_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasAutoExtinguishOn() {
            return (this.bitField1_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasBloodoxygenExplain() {
            return (this.bitField1_ & 268435456) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasBloodoxygenPage() {
            return (this.bitField1_ & 67108864) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasCalorieGoalAchieve() {
            return (this.bitField1_ & 1048576) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasChangeDialCount() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasChargingCount() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasCombinDialCount() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasCountdownNum() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasDialApplistPageView() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasDialControlPage() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasDialId() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasDndCount() {
            return (this.bitField0_ & 67108864) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasDndCustomCount() {
            return (this.bitField1_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasEllipticalCount() {
            return (this.bitField2_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasEventRemindCount() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasExtinguishTimeOn() {
            return (this.bitField1_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasFactoryResetCount() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasFindPhoneCount() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasFlashLightPage() {
            return (this.bitField0_ & 8388608) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasHRExplain() {
            return (this.bitField1_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasIndoorRiddingCount() {
            return (this.bitField2_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasIndoorRunCount() {
            return (this.bitField2_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasIndoorSwimCount() {
            return (this.bitField2_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfEvent() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfPress() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasManualMeasurBloodoxygen() {
            return (this.bitField1_ & AMapEngineUtils.HALF_MAX_P20_WIDTH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasManualMeasurHR() {
            return (this.bitField1_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasManualMeasurStress() {
            return (this.bitField1_ & 1073741824) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasMotionDetectionOn() {
            return (this.bitField1_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasMusicPage() {
            return (this.bitField0_ & 1048576) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasNotifiDeleAllCount() {
            return (this.bitField0_ & 1073741824) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasNotifiSlipDeleCount() {
            return (this.bitField0_ & Integer.MIN_VALUE) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasOutdoorRiddingCount() {
            return (this.bitField2_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasOutdoorRunCount() {
            return (this.bitField2_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasPAIGoalAchieve() {
            return (this.bitField1_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasPaiDetailPage() {
            return (this.bitField1_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasPalmCoverCount() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasPinchOnCount() {
            return (this.bitField1_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasPowerSavingPage() {
            return (this.bitField0_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasQuickStartPage() {
            return (this.bitField0_ & AMapEngineUtils.HALF_MAX_P20_WIDTH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasQuickStartSettingSave() {
            return (this.bitField0_ & 268435456) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasRemindPage() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasScreenNotificatiion() {
            return (this.bitField0_ & 536870912) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasScreenPwdOnCount() {
            return (this.bitField1_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasSettingBacklightPage() {
            return (this.bitField1_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasSettingPage() {
            return (this.bitField1_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasSettingWatchfacePage() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasSmartDndCount() {
            return (this.bitField1_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasSnapCount() {
            return (this.bitField0_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasSportDetectionCount() {
            return (this.bitField2_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasSportGpsFail() {
            return (this.bitField2_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasSportGpsSkip() {
            return (this.bitField2_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasSportGpsfound() {
            return (this.bitField2_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasSportHistoryPage() {
            return (this.bitField2_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasSportListPage() {
            return (this.bitField2_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasSportRealtimeSwitchCount() {
            return (this.bitField2_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasSportSettingPage() {
            return (this.bitField2_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasStandGoalAchieve() {
            return (this.bitField1_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasStatusPage() {
            return (this.bitField1_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasStepGoalAchieve() {
            return (this.bitField1_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasStopwatchNum() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasStressDetectionPage() {
            return (this.bitField1_ & 536870912) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasStressSuspendCount() {
            return (this.bitField1_ & Integer.MIN_VALUE) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasSwimCount() {
            return (this.bitField2_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasTargetSettingCount() {
            return (this.bitField1_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasTimerCountdownPage() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasTimerStopwatchPage() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasTrainCount() {
            return (this.bitField2_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasVoiceRecogCount() {
            return (this.bitField1_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasWalkCount() {
            return (this.bitField2_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasWeatherPage() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceEventMessageOrBuilder
        public boolean hasWristFlipEvent() {
            return (this.bitField0_ & 4) != 0;
        }

        public static Builder newBuilder(VeniceEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static VeniceEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (VeniceEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static VeniceEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (VeniceEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static VeniceEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (VeniceEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static VeniceEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (VeniceEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static VeniceEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (VeniceEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static VeniceEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (VeniceEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static VeniceEventMessage parseFrom(InputStream input) throws IOException {
            return (VeniceEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static VeniceEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (VeniceEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static VeniceEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (VeniceEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static VeniceEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (VeniceEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface VeniceEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getAlarmPage();

        int getAlarmRemindCount();

        int getAlipayBindSuccCount();

        int getAlipayCode128Num();

        int getAlipayPage();

        int getAlipayQRCodeNum();

        int getAllGoalAchieve();

        int getAlldayHrPage();

        int getAutoBrightOn();

        int getAutoExtinguishOn();

        int getBloodoxygenExplain();

        int getBloodoxygenPage();

        int getCalorieGoalAchieve();

        int getChangeDialCount();

        int getChargingCount();

        int getCombinDialCount();

        int getCountdownNum();

        int getDialApplistPageView();

        int getDialControlPage();

        int getDialId();

        int getDndCount();

        int getDndCustomCount();

        int getEllipticalCount();

        int getEventRemindCount();

        int getExtinguishTimeOn();

        int getFactoryResetCount();

        int getFindPhoneCount();

        int getFlashLightPage();

        int getHRExplain();

        int getIndoorRiddingCount();

        int getIndoorRunCount();

        int getIndoorSwimCount();

        int getLcdOnBecauseOfEvent();

        int getLcdOnBecauseOfPress();

        int getManualMeasurBloodoxygen();

        int getManualMeasurHR();

        int getManualMeasurStress();

        int getMotionDetectionOn();

        int getMusicPage();

        int getNotifiDeleAllCount();

        int getNotifiSlipDeleCount();

        int getOutdoorRiddingCount();

        int getOutdoorRunCount();

        int getPAIGoalAchieve();

        int getPaiDetailPage();

        int getPalmCoverCount();

        int getPinchOnCount();

        int getPowerSavingPage();

        int getQuickStartPage();

        int getQuickStartSettingSave();

        int getRemindPage();

        int getScreenNotificatiion();

        int getScreenPwdOnCount();

        int getSettingBacklightPage();

        int getSettingPage();

        int getSettingWatchfacePage();

        int getSmartDndCount();

        int getSnapCount();

        int getSportDetectionCount();

        int getSportGpsFail();

        int getSportGpsSkip();

        int getSportGpsfound();

        int getSportHistoryPage();

        int getSportListPage();

        int getSportRealtimeSwitchCount();

        int getSportSettingPage();

        int getStandGoalAchieve();

        int getStatusPage();

        int getStepGoalAchieve();

        int getStopwatchNum();

        int getStressDetectionPage();

        int getStressSuspendCount();

        int getSwimCount();

        int getTargetSettingCount();

        int getTimerCountdownPage();

        int getTimerStopwatchPage();

        int getTrainCount();

        int getVoiceRecogCount();

        int getWalkCount();

        int getWeatherPage();

        int getWristFlipEvent();

        boolean hasAlarmPage();

        boolean hasAlarmRemindCount();

        boolean hasAlipayBindSuccCount();

        boolean hasAlipayCode128Num();

        boolean hasAlipayPage();

        boolean hasAlipayQRCodeNum();

        boolean hasAllGoalAchieve();

        boolean hasAlldayHrPage();

        boolean hasAutoBrightOn();

        boolean hasAutoExtinguishOn();

        boolean hasBloodoxygenExplain();

        boolean hasBloodoxygenPage();

        boolean hasCalorieGoalAchieve();

        boolean hasChangeDialCount();

        boolean hasChargingCount();

        boolean hasCombinDialCount();

        boolean hasCountdownNum();

        boolean hasDialApplistPageView();

        boolean hasDialControlPage();

        boolean hasDialId();

        boolean hasDndCount();

        boolean hasDndCustomCount();

        boolean hasEllipticalCount();

        boolean hasEventRemindCount();

        boolean hasExtinguishTimeOn();

        boolean hasFactoryResetCount();

        boolean hasFindPhoneCount();

        boolean hasFlashLightPage();

        boolean hasHRExplain();

        boolean hasIndoorRiddingCount();

        boolean hasIndoorRunCount();

        boolean hasIndoorSwimCount();

        boolean hasLcdOnBecauseOfEvent();

        boolean hasLcdOnBecauseOfPress();

        boolean hasManualMeasurBloodoxygen();

        boolean hasManualMeasurHR();

        boolean hasManualMeasurStress();

        boolean hasMotionDetectionOn();

        boolean hasMusicPage();

        boolean hasNotifiDeleAllCount();

        boolean hasNotifiSlipDeleCount();

        boolean hasOutdoorRiddingCount();

        boolean hasOutdoorRunCount();

        boolean hasPAIGoalAchieve();

        boolean hasPaiDetailPage();

        boolean hasPalmCoverCount();

        boolean hasPinchOnCount();

        boolean hasPowerSavingPage();

        boolean hasQuickStartPage();

        boolean hasQuickStartSettingSave();

        boolean hasRemindPage();

        boolean hasScreenNotificatiion();

        boolean hasScreenPwdOnCount();

        boolean hasSettingBacklightPage();

        boolean hasSettingPage();

        boolean hasSettingWatchfacePage();

        boolean hasSmartDndCount();

        boolean hasSnapCount();

        boolean hasSportDetectionCount();

        boolean hasSportGpsFail();

        boolean hasSportGpsSkip();

        boolean hasSportGpsfound();

        boolean hasSportHistoryPage();

        boolean hasSportListPage();

        boolean hasSportRealtimeSwitchCount();

        boolean hasSportSettingPage();

        boolean hasStandGoalAchieve();

        boolean hasStatusPage();

        boolean hasStepGoalAchieve();

        boolean hasStopwatchNum();

        boolean hasStressDetectionPage();

        boolean hasStressSuspendCount();

        boolean hasSwimCount();

        boolean hasTargetSettingCount();

        boolean hasTimerCountdownPage();

        boolean hasTimerStopwatchPage();

        boolean hasTrainCount();

        boolean hasVoiceRecogCount();

        boolean hasWalkCount();

        boolean hasWeatherPage();

        boolean hasWristFlipEvent();
    }

    public static final class VeniceStatisticsMessage extends GeneratedMessageLite<VeniceStatisticsMessage, Builder> implements VeniceStatisticsMessageOrBuilder {
        public static final int BACKLIGHTLEVEL_FIELD_NUMBER = 3;
        public static final int BASE_FIELD_NUMBER = 1;
        private static final VeniceStatisticsMessage DEFAULT_INSTANCE;
        public static final int EVENT_FIELD_NUMBER = 4;
        public static final int NFC_FIELD_NUMBER = 5;
        private static volatile Parser<VeniceStatisticsMessage> PARSER = null;
        public static final int SILENCEMODE_FIELD_NUMBER = 2;
        public static final int STANDBYDIALMODE_FIELD_NUMBER = 6;
        public static final int STANDBYDIALPATTERN_FIELD_NUMBER = 7;
        private int backlightLevel_;
        private StatisBase.StatisBaseMessage base_;
        private int bitField0_;
        private VeniceEventMessage event_;
        private byte memoizedIsInitialized = 2;
        private Nfc.NfcMessage nfc_;
        private int silenceMode_;
        private int standbydialMode_;
        private int standbydialPattern_;

        public static final class Builder extends GeneratedMessageLite.Builder<VeniceStatisticsMessage, Builder> implements VeniceStatisticsMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBacklightLevel() {
                copyOnWrite();
                ((VeniceStatisticsMessage) this.instance).clearBacklightLevel();
                return this;
            }

            public Builder clearBase() {
                copyOnWrite();
                ((VeniceStatisticsMessage) this.instance).clearBase();
                return this;
            }

            public Builder clearEvent() {
                copyOnWrite();
                ((VeniceStatisticsMessage) this.instance).clearEvent();
                return this;
            }

            public Builder clearNfc() {
                copyOnWrite();
                ((VeniceStatisticsMessage) this.instance).clearNfc();
                return this;
            }

            public Builder clearSilenceMode() {
                copyOnWrite();
                ((VeniceStatisticsMessage) this.instance).clearSilenceMode();
                return this;
            }

            public Builder clearStandbydialMode() {
                copyOnWrite();
                ((VeniceStatisticsMessage) this.instance).clearStandbydialMode();
                return this;
            }

            public Builder clearStandbydialPattern() {
                copyOnWrite();
                ((VeniceStatisticsMessage) this.instance).clearStandbydialPattern();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceStatisticsMessageOrBuilder
            public int getBacklightLevel() {
                return ((VeniceStatisticsMessage) this.instance).getBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceStatisticsMessageOrBuilder
            public StatisBase.StatisBaseMessage getBase() {
                return ((VeniceStatisticsMessage) this.instance).getBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceStatisticsMessageOrBuilder
            public VeniceEventMessage getEvent() {
                return ((VeniceStatisticsMessage) this.instance).getEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceStatisticsMessageOrBuilder
            public Nfc.NfcMessage getNfc() {
                return ((VeniceStatisticsMessage) this.instance).getNfc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceStatisticsMessageOrBuilder
            public SilenceModeOuterClass.SilenceMode getSilenceMode() {
                return ((VeniceStatisticsMessage) this.instance).getSilenceMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceStatisticsMessageOrBuilder
            public Standbydial.StandbydialMode getStandbydialMode() {
                return ((VeniceStatisticsMessage) this.instance).getStandbydialMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceStatisticsMessageOrBuilder
            public Standbydial.StandbydialPattern getStandbydialPattern() {
                return ((VeniceStatisticsMessage) this.instance).getStandbydialPattern();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceStatisticsMessageOrBuilder
            public boolean hasBacklightLevel() {
                return ((VeniceStatisticsMessage) this.instance).hasBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceStatisticsMessageOrBuilder
            public boolean hasBase() {
                return ((VeniceStatisticsMessage) this.instance).hasBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceStatisticsMessageOrBuilder
            public boolean hasEvent() {
                return ((VeniceStatisticsMessage) this.instance).hasEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceStatisticsMessageOrBuilder
            public boolean hasNfc() {
                return ((VeniceStatisticsMessage) this.instance).hasNfc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceStatisticsMessageOrBuilder
            public boolean hasSilenceMode() {
                return ((VeniceStatisticsMessage) this.instance).hasSilenceMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceStatisticsMessageOrBuilder
            public boolean hasStandbydialMode() {
                return ((VeniceStatisticsMessage) this.instance).hasStandbydialMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceStatisticsMessageOrBuilder
            public boolean hasStandbydialPattern() {
                return ((VeniceStatisticsMessage) this.instance).hasStandbydialPattern();
            }

            public Builder mergeBase(StatisBase.StatisBaseMessage value) {
                copyOnWrite();
                ((VeniceStatisticsMessage) this.instance).mergeBase(value);
                return this;
            }

            public Builder mergeEvent(VeniceEventMessage value) {
                copyOnWrite();
                ((VeniceStatisticsMessage) this.instance).mergeEvent(value);
                return this;
            }

            public Builder mergeNfc(Nfc.NfcMessage value) {
                copyOnWrite();
                ((VeniceStatisticsMessage) this.instance).mergeNfc(value);
                return this;
            }

            public Builder setBacklightLevel(int value) {
                copyOnWrite();
                ((VeniceStatisticsMessage) this.instance).setBacklightLevel(value);
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage value) {
                copyOnWrite();
                ((VeniceStatisticsMessage) this.instance).setBase(value);
                return this;
            }

            public Builder setEvent(VeniceEventMessage value) {
                copyOnWrite();
                ((VeniceStatisticsMessage) this.instance).setEvent(value);
                return this;
            }

            public Builder setNfc(Nfc.NfcMessage value) {
                copyOnWrite();
                ((VeniceStatisticsMessage) this.instance).setNfc(value);
                return this;
            }

            public Builder setSilenceMode(SilenceModeOuterClass.SilenceMode value) {
                copyOnWrite();
                ((VeniceStatisticsMessage) this.instance).setSilenceMode(value);
                return this;
            }

            public Builder setStandbydialMode(Standbydial.StandbydialMode value) {
                copyOnWrite();
                ((VeniceStatisticsMessage) this.instance).setStandbydialMode(value);
                return this;
            }

            public Builder setStandbydialPattern(Standbydial.StandbydialPattern value) {
                copyOnWrite();
                ((VeniceStatisticsMessage) this.instance).setStandbydialPattern(value);
                return this;
            }

            private Builder() {
                super(VeniceStatisticsMessage.DEFAULT_INSTANCE);
            }

            public Builder setBase(StatisBase.StatisBaseMessage.Builder builderForValue) {
                copyOnWrite();
                ((VeniceStatisticsMessage) this.instance).setBase(builderForValue.build());
                return this;
            }

            public Builder setEvent(VeniceEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((VeniceStatisticsMessage) this.instance).setEvent(builderForValue.build());
                return this;
            }

            public Builder setNfc(Nfc.NfcMessage.Builder builderForValue) {
                copyOnWrite();
                ((VeniceStatisticsMessage) this.instance).setNfc(builderForValue.build());
                return this;
            }
        }

        static {
            VeniceStatisticsMessage veniceStatisticsMessage = new VeniceStatisticsMessage();
            DEFAULT_INSTANCE = veniceStatisticsMessage;
            GeneratedMessageLite.registerDefaultInstance(VeniceStatisticsMessage.class, veniceStatisticsMessage);
        }

        private VeniceStatisticsMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBacklightLevel() {
            this.bitField0_ &= -5;
            this.backlightLevel_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBase() {
            this.base_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEvent() {
            this.event_ = null;
            this.bitField0_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNfc() {
            this.nfc_ = null;
            this.bitField0_ &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSilenceMode() {
            this.bitField0_ &= -3;
            this.silenceMode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStandbydialMode() {
            this.bitField0_ &= -33;
            this.standbydialMode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStandbydialPattern() {
            this.bitField0_ &= -65;
            this.standbydialPattern_ = 0;
        }

        public static VeniceStatisticsMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBase(StatisBase.StatisBaseMessage value) {
            value.getClass();
            StatisBase.StatisBaseMessage statisBaseMessage = this.base_;
            if (statisBaseMessage == null || statisBaseMessage == StatisBase.StatisBaseMessage.getDefaultInstance()) {
                this.base_ = value;
            } else {
                this.base_ = StatisBase.StatisBaseMessage.newBuilder(this.base_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEvent(VeniceEventMessage value) {
            value.getClass();
            VeniceEventMessage veniceEventMessage = this.event_;
            if (veniceEventMessage == null || veniceEventMessage == VeniceEventMessage.getDefaultInstance()) {
                this.event_ = value;
            } else {
                this.event_ = VeniceEventMessage.newBuilder(this.event_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNfc(Nfc.NfcMessage value) {
            value.getClass();
            Nfc.NfcMessage nfcMessage = this.nfc_;
            if (nfcMessage == null || nfcMessage == Nfc.NfcMessage.getDefaultInstance()) {
                this.nfc_ = value;
            } else {
                this.nfc_ = Nfc.NfcMessage.newBuilder(this.nfc_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static VeniceStatisticsMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (VeniceStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static VeniceStatisticsMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (VeniceStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<VeniceStatisticsMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBacklightLevel(int value) {
            this.bitField0_ |= 4;
            this.backlightLevel_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBase(StatisBase.StatisBaseMessage value) {
            value.getClass();
            this.base_ = value;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEvent(VeniceEventMessage value) {
            value.getClass();
            this.event_ = value;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNfc(Nfc.NfcMessage value) {
            value.getClass();
            this.nfc_ = value;
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSilenceMode(SilenceModeOuterClass.SilenceMode value) {
            this.silenceMode_ = value.getNumber();
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStandbydialMode(Standbydial.StandbydialMode value) {
            this.standbydialMode_ = value.getNumber();
            this.bitField0_ |= 32;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStandbydialPattern(Standbydial.StandbydialPattern value) {
            this.standbydialPattern_ = value.getNumber();
            this.bitField0_ |= 64;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new VeniceStatisticsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0005\u0001ᔉ\u0000\u0002ᔌ\u0001\u0003ᔋ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ဌ\u0005\u0007ဌ\u0006", new Object[]{"bitField0_", "base_", "silenceMode_", SilenceModeOuterClass.SilenceMode.internalGetVerifier(), "backlightLevel_", "event_", "nfc_", "standbydialMode_", Standbydial.StandbydialMode.internalGetVerifier(), "standbydialPattern_", Standbydial.StandbydialPattern.internalGetVerifier()});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<VeniceStatisticsMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (VeniceStatisticsMessage.class) {
                            defaultInstanceBasedParser = PARSER;
                            if (defaultInstanceBasedParser == null) {
                                defaultInstanceBasedParser = new GeneratedMessageLite.DefaultInstanceBasedParser<>(DEFAULT_INSTANCE);
                                PARSER = defaultInstanceBasedParser;
                            }
                            break;
                        }
                    }
                    return defaultInstanceBasedParser;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (arg0 == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceStatisticsMessageOrBuilder
        public int getBacklightLevel() {
            return this.backlightLevel_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceStatisticsMessageOrBuilder
        public StatisBase.StatisBaseMessage getBase() {
            StatisBase.StatisBaseMessage statisBaseMessage = this.base_;
            return statisBaseMessage == null ? StatisBase.StatisBaseMessage.getDefaultInstance() : statisBaseMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceStatisticsMessageOrBuilder
        public VeniceEventMessage getEvent() {
            VeniceEventMessage veniceEventMessage = this.event_;
            return veniceEventMessage == null ? VeniceEventMessage.getDefaultInstance() : veniceEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceStatisticsMessageOrBuilder
        public Nfc.NfcMessage getNfc() {
            Nfc.NfcMessage nfcMessage = this.nfc_;
            return nfcMessage == null ? Nfc.NfcMessage.getDefaultInstance() : nfcMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceStatisticsMessageOrBuilder
        public SilenceModeOuterClass.SilenceMode getSilenceMode() {
            SilenceModeOuterClass.SilenceMode silenceModeForNumber = SilenceModeOuterClass.SilenceMode.forNumber(this.silenceMode_);
            return silenceModeForNumber == null ? SilenceModeOuterClass.SilenceMode.OFF : silenceModeForNumber;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceStatisticsMessageOrBuilder
        public Standbydial.StandbydialMode getStandbydialMode() {
            Standbydial.StandbydialMode standbydialModeForNumber = Standbydial.StandbydialMode.forNumber(this.standbydialMode_);
            return standbydialModeForNumber == null ? Standbydial.StandbydialMode.ONOFF : standbydialModeForNumber;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceStatisticsMessageOrBuilder
        public Standbydial.StandbydialPattern getStandbydialPattern() {
            Standbydial.StandbydialPattern standbydialPatternForNumber = Standbydial.StandbydialPattern.forNumber(this.standbydialPattern_);
            return standbydialPatternForNumber == null ? Standbydial.StandbydialPattern.NONE : standbydialPatternForNumber;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceStatisticsMessageOrBuilder
        public boolean hasBacklightLevel() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceStatisticsMessageOrBuilder
        public boolean hasBase() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceStatisticsMessageOrBuilder
        public boolean hasEvent() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceStatisticsMessageOrBuilder
        public boolean hasNfc() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceStatisticsMessageOrBuilder
        public boolean hasSilenceMode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceStatisticsMessageOrBuilder
        public boolean hasStandbydialMode() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Venice.VeniceStatisticsMessageOrBuilder
        public boolean hasStandbydialPattern() {
            return (this.bitField0_ & 64) != 0;
        }

        public static Builder newBuilder(VeniceStatisticsMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static VeniceStatisticsMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (VeniceStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static VeniceStatisticsMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (VeniceStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static VeniceStatisticsMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (VeniceStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static VeniceStatisticsMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (VeniceStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static VeniceStatisticsMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (VeniceStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static VeniceStatisticsMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (VeniceStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static VeniceStatisticsMessage parseFrom(InputStream input) throws IOException {
            return (VeniceStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static VeniceStatisticsMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (VeniceStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static VeniceStatisticsMessage parseFrom(CodedInputStream input) throws IOException {
            return (VeniceStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static VeniceStatisticsMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (VeniceStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface VeniceStatisticsMessageOrBuilder extends MessageLiteOrBuilder {
        int getBacklightLevel();

        StatisBase.StatisBaseMessage getBase();

        VeniceEventMessage getEvent();

        Nfc.NfcMessage getNfc();

        SilenceModeOuterClass.SilenceMode getSilenceMode();

        Standbydial.StandbydialMode getStandbydialMode();

        Standbydial.StandbydialPattern getStandbydialPattern();

        boolean hasBacklightLevel();

        boolean hasBase();

        boolean hasEvent();

        boolean hasNfc();

        boolean hasSilenceMode();

        boolean hasStandbydialMode();

        boolean hasStandbydialPattern();
    }

    private Venice() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }
}
