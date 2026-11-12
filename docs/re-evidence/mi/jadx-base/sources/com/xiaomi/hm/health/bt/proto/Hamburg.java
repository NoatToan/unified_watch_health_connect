package com.xiaomi.hm.health.bt.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.b;
import com.google.protobuf.d0;
import com.google.protobuf.j;
import com.google.protobuf.q0;
import com.google.protobuf.t;
import com.mi.fitness.netproxy.NetProxyComponentKt;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import defpackage.bsf;
import defpackage.vkh;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public final class Hamburg {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.Hamburg$1, reason: invalid class name */
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

    public static final class hamburgEventMessage extends GeneratedMessageLite<hamburgEventMessage, Builder> implements hamburgEventMessageOrBuilder {
        public static final int ACTIVITYOBJECTIVES_FIELD_NUMBER = 136;
        public static final int ACTIVITYTARGET_FIELD_NUMBER = 55;
        public static final int ADDCARDSUCCESS_FIELD_NUMBER = 45;
        public static final int ALARMREMINDERCLICK_FIELD_NUMBER = 108;
        public static final int ALARMREMINDER_FIELD_NUMBER = 107;
        public static final int ALIPAYBINDSUCCESSNUM_FIELD_NUMBER = 29;
        public static final int APLAYSCREEN_FIELD_NUMBER = 131;
        public static final int APPLISTTEMPERATURE_FIELD_NUMBER = 82;
        public static final int ASSISTANTCARID_FIELD_NUMBER = 132;
        public static final int ASSISTANTINTO_FIELD_NUMBER = 133;
        public static final int ASSISTANTTEMPERATURE_FIELD_NUMBER = 84;
        public static final int ASSISTANTVAD_FIELD_NUMBER = 134;
        public static final int AUTOLIGHT_FIELD_NUMBER = 65;
        public static final int AUTOSCREENOFFTIME_FIELD_NUMBER = 60;
        public static final int BASE_RES_FIELD_NUMBER = 75;
        public static final int BATTERYSAVEROFF_FIELD_NUMBER = 39;
        public static final int BATTERYSAVERON_FIELD_NUMBER = 40;
        public static final int BINDINGSUCCESS_FIELD_NUMBER = 46;
        public static final int BINDSETLANGUAGE_FIELD_NUMBER = 153;
        public static final int BLECONNECTCLOSE_FIELD_NUMBER = 116;
        public static final int BLECONNECTFAIL_FIELD_NUMBER = 114;
        public static final int BLECONNECTSUCCESS_FIELD_NUMBER = 113;
        public static final int BLECONNECT_FIELD_NUMBER = 112;
        public static final int BLELISTCLICK_FIELD_NUMBER = 115;
        public static final int BLESTATUS_FIELD_NUMBER = 111;
        public static final int CHANGEBATTERYVALUE_FIELD_NUMBER = 59;
        public static final int CLOSEWIFI_FIELD_NUMBER = 123;
        public static final int COMPASSCALIBRATESUCCESSNUM_FIELD_NUMBER = 28;
        public static final int COUNTDOWNTIMEUP_FIELD_NUMBER = 38;
        public static final int COUTDOWNTIME_FIELD_NUMBER = 99;
        public static final int CURRENTDIALID_FIELD_NUMBER = 66;
        public static final int CURRENTDIALNUM_FIELD_NUMBER = 67;
        private static final hamburgEventMessage DEFAULT_INSTANCE;
        public static final int DIALCHANGEMODE_FIELD_NUMBER = 135;
        public static final int DIALTOOL_FIELD_NUMBER = 98;
        public static final int DNDMODE_FIELD_NUMBER = 56;
        public static final int EVENTTIMEUP_FIELD_NUMBER = 33;
        public static final int FAT_DOSFSCK_FIELD_NUMBER = 73;
        public static final int FAT_DROPSIZE_FIELD_NUMBER = 70;
        public static final int FAT_DROPTIME_FIELD_NUMBER = 71;
        public static final int FAT_FORMAT_FIELD_NUMBER = 72;
        public static final int FAT_FREESIZE_FIELD_NUMBER = 69;
        public static final int FINDMOBLIE_FIELD_NUMBER = 144;
        public static final int FINDPHONE_FIELD_NUMBER = 42;
        public static final int FIRMWARE_FIELD_NUMBER = 74;
        public static final int FLYMODE_FIELD_NUMBER = 110;
        public static final int FONT_FIELD_NUMBER = 77;
        public static final int FORGETWRISTOFFLOCKPASSWD_FIELD_NUMBER = 37;
        public static final int GOTOACTIVITYPAGE_FIELD_NUMBER = 25;
        public static final int GOTOALARMPAGE_FIELD_NUMBER = 19;
        public static final int GOTOCOMPASSPAGE_FIELD_NUMBER = 1;
        public static final int GOTOCOUNTDOWNPAGE_FIELD_NUMBER = 22;
        public static final int GOTODIALACTIVITYPAGE_FIELD_NUMBER = 26;
        public static final int GOTODIALALARMPAGE_FIELD_NUMBER = 20;
        public static final int GOTODIALALIPAYPAGE_FIELD_NUMBER = 2;
        public static final int GOTODIALEVENTPAGE_FIELD_NUMBER = 18;
        public static final int GOTODIALHEARTPAGE_FIELD_NUMBER = 10;
        public static final int GOTODIALMUSICPAGE_FIELD_NUMBER = 8;
        public static final int GOTODIALNFCCADEPAGE_FIELD_NUMBER = 24;
        public static final int GOTODIALPAIPAGE_FIELD_NUMBER = 13;
        public static final int GOTODIALSPORTPAGE_FIELD_NUMBER = 6;
        public static final int GOTODIALWEATHERPAGE_FIELD_NUMBER = 16;
        public static final int GOTOEVENTPAGE_FIELD_NUMBER = 17;
        public static final int GOTOHEARTPAGE_FIELD_NUMBER = 9;
        public static final int GOTOMUSICPAGE_FIELD_NUMBER = 7;
        public static final int GOTONFCCARDPAGE_FIELD_NUMBER = 23;
        public static final int GOTOPAIPAGE_FIELD_NUMBER = 12;
        public static final int GOTOSLEEP_FIELD_NUMBER = 145;
        public static final int GOTOSPO2PAGE_FIELD_NUMBER = 11;
        public static final int GOTOSPORTDETAILPAGE_FIELD_NUMBER = 4;
        public static final int GOTOSPORTHISTORY_FIELD_NUMBER = 3;
        public static final int GOTOSPORTPAGE_FIELD_NUMBER = 5;
        public static final int GOTOSTOPWATCHPAGE_FIELD_NUMBER = 21;
        public static final int GOTOWAKEUP_FIELD_NUMBER = 146;
        public static final int GOTOWEATHERPAGE_FIELD_NUMBER = 14;
        public static final int GOTOWEATHERSECONDPAGE_FIELD_NUMBER = 15;
        public static final int INC_RES_FIELD_NUMBER = 76;
        public static final int LANGUAGESELECT_FIELD_NUMBER = 120;
        public static final int LCDOFF_FIELD_NUMBER = 32;
        public static final int LCDONBECAUSEOFWRISTSTATUS_FIELD_NUMBER = 61;
        public static final int LCDONBECAUSEOFWRIST_FIELD_NUMBER = 31;
        public static final int LIGHTSCREENTIME_FIELD_NUMBER = 121;
        public static final int LIGHTSETTING_FIELD_NUMBER = 141;
        public static final int LOCKSCREEN_FIELD_NUMBER = 41;
        public static final int MODIFYPWD_FIELD_NUMBER = 117;
        public static final int NANDMESSAGE_FIELD_NUMBER = 68;
        public static final int NFCSTATUS_FIELD_NUMBER = 118;
        public static final int NOBINDRECOVERY_FIELD_NUMBER = 151;
        public static final int NOBINDSUPERVISE_FIELD_NUMBER = 152;
        public static final int NOTIFY_FIELD_NUMBER = 27;
        public static final int OFFLINEASRCMD_FIELD_NUMBER = 89;
        public static final int OFFLINEASRFAILORSUCCESS_FIELD_NUMBER = 88;
        public static final int OFFLINEASRMODEINTO_FIELD_NUMBER = 87;
        public static final int OFFLINEASRMODESELECT_FIELD_NUMBER = 86;
        public static final int OFFWRISTLOCK_FIELD_NUMBER = 106;
        public static final int ONLINEVADACTIONTYPE_FIELD_NUMBER = 92;
        public static final int ONLINEVADREQUEST_FIELD_NUMBER = 91;
        public static final int ONLINEVADSTARTTYPE_FIELD_NUMBER = 90;
        private static volatile vkh<hamburgEventMessage> PARSER = null;
        public static final int POWEROFFBATTERYVALUE_FIELD_NUMBER = 57;
        public static final int POWEROFF_FIELD_NUMBER = 48;
        public static final int POWERONBATTERYVALUE_FIELD_NUMBER = 58;
        public static final int PRESSUREAUTOMEASURE_FIELD_NUMBER = 129;
        public static final int PRESSUREINTO_FIELD_NUMBER = 128;
        public static final int PRESSUREMEASURERESULT_FIELD_NUMBER = 130;
        public static final int QNEGPS_FIELD_NUMBER = 79;
        public static final int QNEINTO_FIELD_NUMBER = 78;
        public static final int QUICKACCESSAPP_FIELD_NUMBER = 63;
        public static final int QUICKENTRYAPP_FIELD_NUMBER = 64;
        public static final int RATEABNORMALREMINDER_FIELD_NUMBER = 142;
        public static final int RATEMEASURE_FIELD_NUMBER = 127;
        public static final int RATEWARNREMINDER_FIELD_NUMBER = 143;
        public static final int REBOOTNUM_FIELD_NUMBER = 47;
        public static final int RECOVERYMODE_FIELD_NUMBER = 102;
        public static final int REMINDERSHOCK_FIELD_NUMBER = 95;
        public static final int REMINDERSTANDCOMPLETE_FIELD_NUMBER = 101;
        public static final int REMINDERSTAND_FIELD_NUMBER = 100;
        public static final int RINGREMINDER_FIELD_NUMBER = 119;
        public static final int SCHEDULEDELETE_FIELD_NUMBER = 139;
        public static final int SCHEDULEEDIT_FIELD_NUMBER = 140;
        public static final int SCHEDULEREMINDERCLICK_FIELD_NUMBER = 109;
        public static final int SEEPAIEXPLAIN_FIELD_NUMBER = 97;
        public static final int SEEPAIRATE_FIELD_NUMBER = 96;
        public static final int SETALARM_FIELD_NUMBER = 35;
        public static final int SLEEPGOAL_FIELD_NUMBER = 148;
        public static final int SLEEPREMINDER_FIELD_NUMBER = 150;
        public static final int SLEEPSCREEN_FIELD_NUMBER = 147;
        public static final int SLEEPSTOP_FIELD_NUMBER = 149;
        public static final int SPO2CALC_FIELD_NUMBER = 30;
        public static final int SPORTINDOORCALIBRATE_FIELD_NUMBER = 53;
        public static final int SPORTREMINDERSAVE_FIELD_NUMBER = 155;
        public static final int SPORTSTATUS_FIELD_NUMBER = 52;
        public static final int STARTWIFI_FIELD_NUMBER = 122;
        public static final int STOPWATCHRESET_FIELD_NUMBER = 138;
        public static final int STOPWATCHSTART_FIELD_NUMBER = 137;
        public static final int SWIMPOOLLENGTH_FIELD_NUMBER = 54;
        public static final int SYSTEMUPDATECANCLE_FIELD_NUMBER = 50;
        public static final int SYSTEMUPDATEIMMEDIATELY_FIELD_NUMBER = 49;
        public static final int SYSVIBRATION_FIELD_NUMBER = 80;
        public static final int TEMPERATURESTATUS_FIELD_NUMBER = 85;
        public static final int TURNONKEEPWATCHAWAKE_FIELD_NUMBER = 44;
        public static final int TURNONTHEATERMODE_FIELD_NUMBER = 43;
        public static final int UNLOCK_FIELD_NUMBER = 34;
        public static final int UPDATAERRSCREEN_FIELD_NUMBER = 93;
        public static final int UPDATAIMMEDIATELYSCREEN_FIELD_NUMBER = 94;
        public static final int UPDATEBYUSER_FIELD_NUMBER = 154;
        public static final int UPDATEFAIL_FIELD_NUMBER = 51;
        public static final int USECARCOUNT_FIELD_NUMBER = 103;
        public static final int USESTOPWATCH_FIELD_NUMBER = 36;
        public static final int VICESCREENTEMPERATURE_FIELD_NUMBER = 83;
        public static final int VOLBYCONTROL_FIELD_NUMBER = 105;
        public static final int VOLBYSETTING_FIELD_NUMBER = 126;
        public static final int VOLSETCOUNT_FIELD_NUMBER = 104;
        public static final int WATCHDIR_FIELD_NUMBER = 81;
        public static final int WIFIPWDCORRECT_FIELD_NUMBER = 125;
        public static final int WIFITIPSPAGE_FIELD_NUMBER = 124;
        public static final int WRISTOFFLOCKSTATUS_FIELD_NUMBER = 62;
        private int activityTarget_;
        private int activityobjectives_;
        private int addCardSuccess_;
        private int alarmreminder_;
        private int alipayBindSuccessNum_;
        private int aplayscreen_;
        private int applistTemperature_;
        private int assistantTemperature_;
        private int assistantVAD_;
        private int assistantcarid_;
        private int assistantinto_;
        private boolean autoLight_;
        private int autoScreenOffTime_;
        private Event.DfuUpgradeMessage baseRes_;
        private Event.BatterySaverMode batterySaverOff_;
        private Event.BatterySaverMode batterySaverOn_;
        private int bindingSuccess_;
        private int bindsetlanguage_;
        private int bitField0_;
        private int bitField1_;
        private int bitField2_;
        private int bitField3_;
        private int bleconnectclose_;
        private int bleconnectfail_;
        private int bleconnectsuccess_;
        private int blelistclick_;
        private int changeBatteryValue_;
        private Event.wifiuseMessage closewifi_;
        private int compassCalibrateSuccessNum_;
        private int countDownTimeup_;
        private int coutdowntime_;
        private int currentDialId_;
        private int currentDialNum_;
        private int dialchangemode_;
        private Event.DialtoolMessage dialtool_;
        private Event.DndEventMessage dndMode_;
        private int eventTimeUp_;
        private int fatDosfsck_;
        private int fatDropsize_;
        private long fatDroptime_;
        private int fatFormat_;
        private int fatFreesize_;
        private int findPhone_;
        private int findmoblie_;
        private Event.DfuUpgradeMessage firmware_;
        private Event.DfuUpgradeMessage font_;
        private int forgetWristOffLockPasswd_;
        private int gotoActivityPage_;
        private int gotoAlarmPage_;
        private int gotoCompassPage_;
        private int gotoCountdownPage_;
        private int gotoDialActivityPage_;
        private int gotoDialAlarmPage_;
        private int gotoDialAlipayPage_;
        private int gotoDialEventPage_;
        private int gotoDialHeartPage_;
        private int gotoDialMusicPage_;
        private int gotoDialNfcCadePage_;
        private int gotoDialPaiPage_;
        private int gotoDialSportPage_;
        private int gotoDialWeatherPage_;
        private int gotoEventPage_;
        private int gotoHeartPage_;
        private int gotoMusicPage_;
        private int gotoNfcCardPage_;
        private int gotoPaiPage_;
        private int gotoSpO2Page_;
        private int gotoSportHistory_;
        private int gotoSportPage_;
        private int gotoStopwatchPage_;
        private int gotoWeatherPage_;
        private int gotoWeatherSecondPage_;
        private int gotosleep_;
        private int gotowakeup_;
        private Event.DfuUpgradeMessage incRes_;
        private int languageselect_;
        private int lcdOnBecauseOfWristStatus_;
        private int lcdOnBecauseOfWrist_;
        private Event.lightscreentimeMessage lightscreentime_;
        private int lightsetting_;
        private int lockScreen_;
        private Event.NandMessage nandMessage_;
        private int nobindrecovery_;
        private int nobindsupervise_;
        private int powerOffBatteryValue_;
        private int powerOff_;
        private int powerOnBatteryValue_;
        private int pressureinto_;
        private int qNEgps_;
        private int qNEinto_;
        private int quickAccessApp_;
        private int rateabnormalreminder_;
        private int ratewarnreminder_;
        private int rebootNum_;
        private int recoverymode_;
        private int remindershock_;
        private int reminderstand_;
        private int reminderstandcomplete_;
        private int scheduleedit_;
        private int seePAIexplain_;
        private int seePAIrate_;
        private int setAlarm_;
        private int sleepgoal_;
        private int sleepreminder_;
        private int sleepscreen_;
        private int sleepstop_;
        private int sportremindersave_;
        private Event.wifiuseMessage startwifi_;
        private int stopwatchreset_;
        private int stopwatchstart_;
        private int swimPoolLength_;
        private boolean sysVibration_;
        private int systemUpdateCancle_;
        private int systemUpdateImmediately_;
        private int turnOnTheaterMode_;
        private int turnOnkeepWatchAwake_;
        private int updatebyuser_;
        private int useStopwatch_;
        private int vicescreenTemperature_;
        private int volbycontrol_;
        private int volbysetting_;
        private int volsetcount_;
        private boolean watchdir_;
        private int wifiTipspage_;
        private int wifipwdcorrect_;
        private boolean wristOffLockStatus_;
        private byte memoizedIsInitialized = 2;
        private d0.g gotoSportDetailPage_ = GeneratedMessageLite.emptyIntList();
        private d0.i<Event.NotifyMessage> notify_ = GeneratedMessageLite.emptyProtobufList();
        private d0.g spo2Calc_ = GeneratedMessageLite.emptyIntList();
        private d0.g lcdOff_ = GeneratedMessageLite.emptyIntList();
        private d0.g unlock_ = GeneratedMessageLite.emptyIntList();
        private d0.g updateFail_ = GeneratedMessageLite.emptyIntList();
        private d0.i<Event.SportStatusMessage> sportStatus_ = GeneratedMessageLite.emptyProtobufList();
        private d0.g sportIndoorCalibrate_ = GeneratedMessageLite.emptyIntList();
        private d0.a quickEntryApp_ = GeneratedMessageLite.emptyBooleanList();
        private d0.g temperatureStatus_ = GeneratedMessageLite.emptyIntList();
        private d0.g offlineAsrModeSelect_ = GeneratedMessageLite.emptyIntList();
        private d0.g offlineAsrModeInto_ = GeneratedMessageLite.emptyIntList();
        private d0.g offlineAsrFailOrSuccess_ = GeneratedMessageLite.emptyIntList();
        private d0.g offlineAsrCmd_ = GeneratedMessageLite.emptyIntList();
        private d0.g onlineVADStartType_ = GeneratedMessageLite.emptyIntList();
        private d0.g onlineVADRequest_ = GeneratedMessageLite.emptyIntList();
        private d0.g onlineVADActionType_ = GeneratedMessageLite.emptyIntList();
        private d0.g updataerrscreen_ = GeneratedMessageLite.emptyIntList();
        private d0.g updataimmediatelyscreen_ = GeneratedMessageLite.emptyIntList();
        private d0.g usecarcount_ = GeneratedMessageLite.emptyIntList();
        private d0.g offwristlock_ = GeneratedMessageLite.emptyIntList();
        private d0.g alarmreminderclick_ = GeneratedMessageLite.emptyIntList();
        private d0.g schedulereminderclick_ = GeneratedMessageLite.emptyIntList();
        private d0.g flymode_ = GeneratedMessageLite.emptyIntList();
        private d0.g blestatus_ = GeneratedMessageLite.emptyIntList();
        private d0.g bleconnect_ = GeneratedMessageLite.emptyIntList();
        private d0.g modifypwd_ = GeneratedMessageLite.emptyIntList();
        private d0.g nFCstatus_ = GeneratedMessageLite.emptyIntList();
        private d0.g ringreminder_ = GeneratedMessageLite.emptyIntList();
        private d0.g ratemeasure_ = GeneratedMessageLite.emptyIntList();
        private d0.g pressureautomeasure_ = GeneratedMessageLite.emptyIntList();
        private d0.g pressuremeasureresult_ = GeneratedMessageLite.emptyIntList();
        private d0.g scheduledelete_ = GeneratedMessageLite.emptyIntList();

        public static final class Builder extends GeneratedMessageLite.a<hamburgEventMessage, Builder> implements hamburgEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAlarmreminderclick(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAlarmreminderclick(i);
                return this;
            }

            public Builder addAllAlarmreminderclick(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllAlarmreminderclick(iterable);
                return this;
            }

            public Builder addAllBleconnect(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllBleconnect(iterable);
                return this;
            }

            public Builder addAllBlestatus(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllBlestatus(iterable);
                return this;
            }

            public Builder addAllFlymode(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllFlymode(iterable);
                return this;
            }

            public Builder addAllGotoSportDetailPage(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllGotoSportDetailPage(iterable);
                return this;
            }

            public Builder addAllLcdOff(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllLcdOff(iterable);
                return this;
            }

            public Builder addAllModifypwd(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllModifypwd(iterable);
                return this;
            }

            public Builder addAllNFCstatus(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllNFCstatus(iterable);
                return this;
            }

            public Builder addAllNotify(Iterable<? extends Event.NotifyMessage> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllNotify(iterable);
                return this;
            }

            public Builder addAllOfflineAsrCmd(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllOfflineAsrCmd(iterable);
                return this;
            }

            public Builder addAllOfflineAsrFailOrSuccess(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllOfflineAsrFailOrSuccess(iterable);
                return this;
            }

            public Builder addAllOfflineAsrModeInto(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllOfflineAsrModeInto(iterable);
                return this;
            }

            public Builder addAllOfflineAsrModeSelect(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllOfflineAsrModeSelect(iterable);
                return this;
            }

            public Builder addAllOffwristlock(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllOffwristlock(iterable);
                return this;
            }

            public Builder addAllOnlineVADActionType(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllOnlineVADActionType(iterable);
                return this;
            }

            public Builder addAllOnlineVADRequest(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllOnlineVADRequest(iterable);
                return this;
            }

            public Builder addAllOnlineVADStartType(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllOnlineVADStartType(iterable);
                return this;
            }

            public Builder addAllPressureautomeasure(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllPressureautomeasure(iterable);
                return this;
            }

            public Builder addAllPressuremeasureresult(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllPressuremeasureresult(iterable);
                return this;
            }

            public Builder addAllQuickEntryApp(Iterable<? extends Boolean> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllQuickEntryApp(iterable);
                return this;
            }

            public Builder addAllRatemeasure(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllRatemeasure(iterable);
                return this;
            }

            public Builder addAllRingreminder(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllRingreminder(iterable);
                return this;
            }

            public Builder addAllScheduledelete(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllScheduledelete(iterable);
                return this;
            }

            public Builder addAllSchedulereminderclick(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllSchedulereminderclick(iterable);
                return this;
            }

            public Builder addAllSpo2Calc(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllSpo2Calc(iterable);
                return this;
            }

            public Builder addAllSportIndoorCalibrate(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllSportIndoorCalibrate(iterable);
                return this;
            }

            public Builder addAllSportStatus(Iterable<? extends Event.SportStatusMessage> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllSportStatus(iterable);
                return this;
            }

            public Builder addAllTemperatureStatus(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllTemperatureStatus(iterable);
                return this;
            }

            public Builder addAllUnlock(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllUnlock(iterable);
                return this;
            }

            public Builder addAllUpdataerrscreen(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllUpdataerrscreen(iterable);
                return this;
            }

            public Builder addAllUpdataimmediatelyscreen(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllUpdataimmediatelyscreen(iterable);
                return this;
            }

            public Builder addAllUpdateFail(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllUpdateFail(iterable);
                return this;
            }

            public Builder addAllUsecarcount(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addAllUsecarcount(iterable);
                return this;
            }

            public Builder addBleconnect(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addBleconnect(i);
                return this;
            }

            public Builder addBlestatus(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addBlestatus(i);
                return this;
            }

            public Builder addFlymode(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addFlymode(i);
                return this;
            }

            public Builder addGotoSportDetailPage(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addGotoSportDetailPage(i);
                return this;
            }

            public Builder addLcdOff(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addLcdOff(i);
                return this;
            }

            public Builder addModifypwd(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addModifypwd(i);
                return this;
            }

            public Builder addNFCstatus(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addNFCstatus(i);
                return this;
            }

            public Builder addNotify(Event.NotifyMessage notifyMessage) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addNotify(notifyMessage);
                return this;
            }

            public Builder addOfflineAsrCmd(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addOfflineAsrCmd(i);
                return this;
            }

            public Builder addOfflineAsrFailOrSuccess(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addOfflineAsrFailOrSuccess(i);
                return this;
            }

            public Builder addOfflineAsrModeInto(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addOfflineAsrModeInto(i);
                return this;
            }

            public Builder addOfflineAsrModeSelect(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addOfflineAsrModeSelect(i);
                return this;
            }

            public Builder addOffwristlock(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addOffwristlock(i);
                return this;
            }

            public Builder addOnlineVADActionType(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addOnlineVADActionType(i);
                return this;
            }

            public Builder addOnlineVADRequest(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addOnlineVADRequest(i);
                return this;
            }

            public Builder addOnlineVADStartType(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addOnlineVADStartType(i);
                return this;
            }

            public Builder addPressureautomeasure(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addPressureautomeasure(i);
                return this;
            }

            public Builder addPressuremeasureresult(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addPressuremeasureresult(i);
                return this;
            }

            public Builder addQuickEntryApp(boolean z) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addQuickEntryApp(z);
                return this;
            }

            public Builder addRatemeasure(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addRatemeasure(i);
                return this;
            }

            public Builder addRingreminder(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addRingreminder(i);
                return this;
            }

            public Builder addScheduledelete(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addScheduledelete(i);
                return this;
            }

            public Builder addSchedulereminderclick(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addSchedulereminderclick(i);
                return this;
            }

            public Builder addSpo2Calc(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addSpo2Calc(i);
                return this;
            }

            public Builder addSportIndoorCalibrate(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addSportIndoorCalibrate(i);
                return this;
            }

            public Builder addSportStatus(Event.SportStatusMessage sportStatusMessage) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addSportStatus(sportStatusMessage);
                return this;
            }

            public Builder addTemperatureStatus(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addTemperatureStatus(i);
                return this;
            }

            public Builder addUnlock(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addUnlock(i);
                return this;
            }

            public Builder addUpdataerrscreen(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addUpdataerrscreen(i);
                return this;
            }

            public Builder addUpdataimmediatelyscreen(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addUpdataimmediatelyscreen(i);
                return this;
            }

            public Builder addUpdateFail(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addUpdateFail(i);
                return this;
            }

            public Builder addUsecarcount(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addUsecarcount(i);
                return this;
            }

            public Builder clearActivityTarget() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearActivityTarget();
                return this;
            }

            public Builder clearActivityobjectives() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearActivityobjectives();
                return this;
            }

            public Builder clearAddCardSuccess() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearAddCardSuccess();
                return this;
            }

            public Builder clearAlarmreminder() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearAlarmreminder();
                return this;
            }

            public Builder clearAlarmreminderclick() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearAlarmreminderclick();
                return this;
            }

            public Builder clearAlipayBindSuccessNum() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearAlipayBindSuccessNum();
                return this;
            }

            public Builder clearAplayscreen() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearAplayscreen();
                return this;
            }

            public Builder clearApplistTemperature() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearApplistTemperature();
                return this;
            }

            public Builder clearAssistantTemperature() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearAssistantTemperature();
                return this;
            }

            public Builder clearAssistantVAD() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearAssistantVAD();
                return this;
            }

            public Builder clearAssistantcarid() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearAssistantcarid();
                return this;
            }

            public Builder clearAssistantinto() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearAssistantinto();
                return this;
            }

            public Builder clearAutoLight() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearAutoLight();
                return this;
            }

            public Builder clearAutoScreenOffTime() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearAutoScreenOffTime();
                return this;
            }

            public Builder clearBaseRes() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearBaseRes();
                return this;
            }

            public Builder clearBatterySaverOff() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearBatterySaverOff();
                return this;
            }

            public Builder clearBatterySaverOn() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearBatterySaverOn();
                return this;
            }

            public Builder clearBindingSuccess() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearBindingSuccess();
                return this;
            }

            public Builder clearBindsetlanguage() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearBindsetlanguage();
                return this;
            }

            public Builder clearBleconnect() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearBleconnect();
                return this;
            }

            public Builder clearBleconnectclose() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearBleconnectclose();
                return this;
            }

            public Builder clearBleconnectfail() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearBleconnectfail();
                return this;
            }

            public Builder clearBleconnectsuccess() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearBleconnectsuccess();
                return this;
            }

            public Builder clearBlelistclick() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearBlelistclick();
                return this;
            }

            public Builder clearBlestatus() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearBlestatus();
                return this;
            }

            public Builder clearChangeBatteryValue() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearChangeBatteryValue();
                return this;
            }

            public Builder clearClosewifi() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearClosewifi();
                return this;
            }

            public Builder clearCompassCalibrateSuccessNum() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearCompassCalibrateSuccessNum();
                return this;
            }

            public Builder clearCountDownTimeup() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearCountDownTimeup();
                return this;
            }

            public Builder clearCoutdowntime() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearCoutdowntime();
                return this;
            }

            public Builder clearCurrentDialId() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearCurrentDialId();
                return this;
            }

            public Builder clearCurrentDialNum() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearCurrentDialNum();
                return this;
            }

            public Builder clearDialchangemode() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearDialchangemode();
                return this;
            }

            public Builder clearDialtool() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearDialtool();
                return this;
            }

            public Builder clearDndMode() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearDndMode();
                return this;
            }

            public Builder clearEventTimeUp() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearEventTimeUp();
                return this;
            }

            public Builder clearFatDosfsck() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearFatDosfsck();
                return this;
            }

            public Builder clearFatDropsize() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearFatDropsize();
                return this;
            }

            public Builder clearFatDroptime() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearFatDroptime();
                return this;
            }

            public Builder clearFatFormat() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearFatFormat();
                return this;
            }

            public Builder clearFatFreesize() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearFatFreesize();
                return this;
            }

            public Builder clearFindPhone() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearFindPhone();
                return this;
            }

            public Builder clearFindmoblie() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearFindmoblie();
                return this;
            }

            public Builder clearFirmware() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearFirmware();
                return this;
            }

            public Builder clearFlymode() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearFlymode();
                return this;
            }

            public Builder clearFont() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearFont();
                return this;
            }

            public Builder clearForgetWristOffLockPasswd() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearForgetWristOffLockPasswd();
                return this;
            }

            public Builder clearGotoActivityPage() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearGotoActivityPage();
                return this;
            }

            public Builder clearGotoAlarmPage() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearGotoAlarmPage();
                return this;
            }

            public Builder clearGotoCompassPage() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearGotoCompassPage();
                return this;
            }

            public Builder clearGotoCountdownPage() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearGotoCountdownPage();
                return this;
            }

            public Builder clearGotoDialActivityPage() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearGotoDialActivityPage();
                return this;
            }

            public Builder clearGotoDialAlarmPage() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearGotoDialAlarmPage();
                return this;
            }

            public Builder clearGotoDialAlipayPage() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearGotoDialAlipayPage();
                return this;
            }

            public Builder clearGotoDialEventPage() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearGotoDialEventPage();
                return this;
            }

            public Builder clearGotoDialHeartPage() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearGotoDialHeartPage();
                return this;
            }

            public Builder clearGotoDialMusicPage() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearGotoDialMusicPage();
                return this;
            }

            public Builder clearGotoDialNfcCadePage() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearGotoDialNfcCadePage();
                return this;
            }

            public Builder clearGotoDialPaiPage() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearGotoDialPaiPage();
                return this;
            }

            public Builder clearGotoDialSportPage() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearGotoDialSportPage();
                return this;
            }

            public Builder clearGotoDialWeatherPage() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearGotoDialWeatherPage();
                return this;
            }

            public Builder clearGotoEventPage() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearGotoEventPage();
                return this;
            }

            public Builder clearGotoHeartPage() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearGotoHeartPage();
                return this;
            }

            public Builder clearGotoMusicPage() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearGotoMusicPage();
                return this;
            }

            public Builder clearGotoNfcCardPage() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearGotoNfcCardPage();
                return this;
            }

            public Builder clearGotoPaiPage() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearGotoPaiPage();
                return this;
            }

            public Builder clearGotoSpO2Page() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearGotoSpO2Page();
                return this;
            }

            public Builder clearGotoSportDetailPage() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearGotoSportDetailPage();
                return this;
            }

            public Builder clearGotoSportHistory() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearGotoSportHistory();
                return this;
            }

            public Builder clearGotoSportPage() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearGotoSportPage();
                return this;
            }

            public Builder clearGotoStopwatchPage() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearGotoStopwatchPage();
                return this;
            }

            public Builder clearGotoWeatherPage() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearGotoWeatherPage();
                return this;
            }

            public Builder clearGotoWeatherSecondPage() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearGotoWeatherSecondPage();
                return this;
            }

            public Builder clearGotosleep() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearGotosleep();
                return this;
            }

            public Builder clearGotowakeup() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearGotowakeup();
                return this;
            }

            public Builder clearIncRes() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearIncRes();
                return this;
            }

            public Builder clearLanguageselect() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearLanguageselect();
                return this;
            }

            public Builder clearLcdOff() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearLcdOff();
                return this;
            }

            public Builder clearLcdOnBecauseOfWrist() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearLcdOnBecauseOfWrist();
                return this;
            }

            public Builder clearLcdOnBecauseOfWristStatus() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearLcdOnBecauseOfWristStatus();
                return this;
            }

            public Builder clearLightscreentime() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearLightscreentime();
                return this;
            }

            public Builder clearLightsetting() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearLightsetting();
                return this;
            }

            public Builder clearLockScreen() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearLockScreen();
                return this;
            }

            public Builder clearModifypwd() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearModifypwd();
                return this;
            }

            public Builder clearNFCstatus() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearNFCstatus();
                return this;
            }

            public Builder clearNandMessage() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearNandMessage();
                return this;
            }

            public Builder clearNobindrecovery() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearNobindrecovery();
                return this;
            }

            public Builder clearNobindsupervise() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearNobindsupervise();
                return this;
            }

            public Builder clearNotify() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearNotify();
                return this;
            }

            public Builder clearOfflineAsrCmd() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearOfflineAsrCmd();
                return this;
            }

            public Builder clearOfflineAsrFailOrSuccess() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearOfflineAsrFailOrSuccess();
                return this;
            }

            public Builder clearOfflineAsrModeInto() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearOfflineAsrModeInto();
                return this;
            }

            public Builder clearOfflineAsrModeSelect() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearOfflineAsrModeSelect();
                return this;
            }

            public Builder clearOffwristlock() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearOffwristlock();
                return this;
            }

            public Builder clearOnlineVADActionType() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearOnlineVADActionType();
                return this;
            }

            public Builder clearOnlineVADRequest() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearOnlineVADRequest();
                return this;
            }

            public Builder clearOnlineVADStartType() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearOnlineVADStartType();
                return this;
            }

            public Builder clearPowerOff() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearPowerOff();
                return this;
            }

            public Builder clearPowerOffBatteryValue() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearPowerOffBatteryValue();
                return this;
            }

            public Builder clearPowerOnBatteryValue() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearPowerOnBatteryValue();
                return this;
            }

            public Builder clearPressureautomeasure() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearPressureautomeasure();
                return this;
            }

            public Builder clearPressureinto() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearPressureinto();
                return this;
            }

            public Builder clearPressuremeasureresult() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearPressuremeasureresult();
                return this;
            }

            public Builder clearQNEgps() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearQNEgps();
                return this;
            }

            public Builder clearQNEinto() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearQNEinto();
                return this;
            }

            public Builder clearQuickAccessApp() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearQuickAccessApp();
                return this;
            }

            public Builder clearQuickEntryApp() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearQuickEntryApp();
                return this;
            }

            public Builder clearRateabnormalreminder() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearRateabnormalreminder();
                return this;
            }

            public Builder clearRatemeasure() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearRatemeasure();
                return this;
            }

            public Builder clearRatewarnreminder() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearRatewarnreminder();
                return this;
            }

            public Builder clearRebootNum() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearRebootNum();
                return this;
            }

            public Builder clearRecoverymode() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearRecoverymode();
                return this;
            }

            public Builder clearRemindershock() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearRemindershock();
                return this;
            }

            public Builder clearReminderstand() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearReminderstand();
                return this;
            }

            public Builder clearReminderstandcomplete() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearReminderstandcomplete();
                return this;
            }

            public Builder clearRingreminder() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearRingreminder();
                return this;
            }

            public Builder clearScheduledelete() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearScheduledelete();
                return this;
            }

            public Builder clearScheduleedit() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearScheduleedit();
                return this;
            }

            public Builder clearSchedulereminderclick() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearSchedulereminderclick();
                return this;
            }

            public Builder clearSeePAIexplain() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearSeePAIexplain();
                return this;
            }

            public Builder clearSeePAIrate() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearSeePAIrate();
                return this;
            }

            public Builder clearSetAlarm() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearSetAlarm();
                return this;
            }

            public Builder clearSleepgoal() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearSleepgoal();
                return this;
            }

            public Builder clearSleepreminder() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearSleepreminder();
                return this;
            }

            public Builder clearSleepscreen() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearSleepscreen();
                return this;
            }

            public Builder clearSleepstop() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearSleepstop();
                return this;
            }

            public Builder clearSpo2Calc() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearSpo2Calc();
                return this;
            }

            public Builder clearSportIndoorCalibrate() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearSportIndoorCalibrate();
                return this;
            }

            public Builder clearSportStatus() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearSportStatus();
                return this;
            }

            public Builder clearSportremindersave() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearSportremindersave();
                return this;
            }

            public Builder clearStartwifi() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearStartwifi();
                return this;
            }

            public Builder clearStopwatchreset() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearStopwatchreset();
                return this;
            }

            public Builder clearStopwatchstart() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearStopwatchstart();
                return this;
            }

            public Builder clearSwimPoolLength() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearSwimPoolLength();
                return this;
            }

            public Builder clearSysVibration() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearSysVibration();
                return this;
            }

            public Builder clearSystemUpdateCancle() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearSystemUpdateCancle();
                return this;
            }

            public Builder clearSystemUpdateImmediately() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearSystemUpdateImmediately();
                return this;
            }

            public Builder clearTemperatureStatus() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearTemperatureStatus();
                return this;
            }

            public Builder clearTurnOnTheaterMode() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearTurnOnTheaterMode();
                return this;
            }

            public Builder clearTurnOnkeepWatchAwake() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearTurnOnkeepWatchAwake();
                return this;
            }

            public Builder clearUnlock() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearUnlock();
                return this;
            }

            public Builder clearUpdataerrscreen() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearUpdataerrscreen();
                return this;
            }

            public Builder clearUpdataimmediatelyscreen() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearUpdataimmediatelyscreen();
                return this;
            }

            public Builder clearUpdateFail() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearUpdateFail();
                return this;
            }

            public Builder clearUpdatebyuser() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearUpdatebyuser();
                return this;
            }

            public Builder clearUseStopwatch() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearUseStopwatch();
                return this;
            }

            public Builder clearUsecarcount() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearUsecarcount();
                return this;
            }

            public Builder clearVicescreenTemperature() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearVicescreenTemperature();
                return this;
            }

            public Builder clearVolbycontrol() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearVolbycontrol();
                return this;
            }

            public Builder clearVolbysetting() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearVolbysetting();
                return this;
            }

            public Builder clearVolsetcount() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearVolsetcount();
                return this;
            }

            public Builder clearWatchdir() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearWatchdir();
                return this;
            }

            public Builder clearWifiTipspage() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearWifiTipspage();
                return this;
            }

            public Builder clearWifipwdcorrect() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearWifipwdcorrect();
                return this;
            }

            public Builder clearWristOffLockStatus() {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).clearWristOffLockStatus();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getActivityTarget() {
                return ((hamburgEventMessage) this.instance).getActivityTarget();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getActivityobjectives() {
                return ((hamburgEventMessage) this.instance).getActivityobjectives();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getAddCardSuccess() {
                return ((hamburgEventMessage) this.instance).getAddCardSuccess();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getAlarmreminder() {
                return ((hamburgEventMessage) this.instance).getAlarmreminder();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getAlarmreminderclick(int i) {
                return ((hamburgEventMessage) this.instance).getAlarmreminderclick(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getAlarmreminderclickCount() {
                return ((hamburgEventMessage) this.instance).getAlarmreminderclickCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getAlarmreminderclickList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getAlarmreminderclickList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getAlipayBindSuccessNum() {
                return ((hamburgEventMessage) this.instance).getAlipayBindSuccessNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getAplayscreen() {
                return ((hamburgEventMessage) this.instance).getAplayscreen();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getApplistTemperature() {
                return ((hamburgEventMessage) this.instance).getApplistTemperature();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getAssistantTemperature() {
                return ((hamburgEventMessage) this.instance).getAssistantTemperature();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getAssistantVAD() {
                return ((hamburgEventMessage) this.instance).getAssistantVAD();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getAssistantcarid() {
                return ((hamburgEventMessage) this.instance).getAssistantcarid();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getAssistantinto() {
                return ((hamburgEventMessage) this.instance).getAssistantinto();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean getAutoLight() {
                return ((hamburgEventMessage) this.instance).getAutoLight();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getAutoScreenOffTime() {
                return ((hamburgEventMessage) this.instance).getAutoScreenOffTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public Event.DfuUpgradeMessage getBaseRes() {
                return ((hamburgEventMessage) this.instance).getBaseRes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public Event.BatterySaverMode getBatterySaverOff() {
                return ((hamburgEventMessage) this.instance).getBatterySaverOff();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public Event.BatterySaverMode getBatterySaverOn() {
                return ((hamburgEventMessage) this.instance).getBatterySaverOn();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getBindingSuccess() {
                return ((hamburgEventMessage) this.instance).getBindingSuccess();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getBindsetlanguage() {
                return ((hamburgEventMessage) this.instance).getBindsetlanguage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getBleconnect(int i) {
                return ((hamburgEventMessage) this.instance).getBleconnect(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getBleconnectCount() {
                return ((hamburgEventMessage) this.instance).getBleconnectCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getBleconnectList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getBleconnectList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getBleconnectclose() {
                return ((hamburgEventMessage) this.instance).getBleconnectclose();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getBleconnectfail() {
                return ((hamburgEventMessage) this.instance).getBleconnectfail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getBleconnectsuccess() {
                return ((hamburgEventMessage) this.instance).getBleconnectsuccess();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getBlelistclick() {
                return ((hamburgEventMessage) this.instance).getBlelistclick();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getBlestatus(int i) {
                return ((hamburgEventMessage) this.instance).getBlestatus(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getBlestatusCount() {
                return ((hamburgEventMessage) this.instance).getBlestatusCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getBlestatusList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getBlestatusList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getChangeBatteryValue() {
                return ((hamburgEventMessage) this.instance).getChangeBatteryValue();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public Event.wifiuseMessage getClosewifi() {
                return ((hamburgEventMessage) this.instance).getClosewifi();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getCompassCalibrateSuccessNum() {
                return ((hamburgEventMessage) this.instance).getCompassCalibrateSuccessNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getCountDownTimeup() {
                return ((hamburgEventMessage) this.instance).getCountDownTimeup();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getCoutdowntime() {
                return ((hamburgEventMessage) this.instance).getCoutdowntime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getCurrentDialId() {
                return ((hamburgEventMessage) this.instance).getCurrentDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getCurrentDialNum() {
                return ((hamburgEventMessage) this.instance).getCurrentDialNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getDialchangemode() {
                return ((hamburgEventMessage) this.instance).getDialchangemode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public Event.DialtoolMessage getDialtool() {
                return ((hamburgEventMessage) this.instance).getDialtool();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public Event.DndEventMessage getDndMode() {
                return ((hamburgEventMessage) this.instance).getDndMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getEventTimeUp() {
                return ((hamburgEventMessage) this.instance).getEventTimeUp();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getFatDosfsck() {
                return ((hamburgEventMessage) this.instance).getFatDosfsck();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getFatDropsize() {
                return ((hamburgEventMessage) this.instance).getFatDropsize();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public long getFatDroptime() {
                return ((hamburgEventMessage) this.instance).getFatDroptime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getFatFormat() {
                return ((hamburgEventMessage) this.instance).getFatFormat();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getFatFreesize() {
                return ((hamburgEventMessage) this.instance).getFatFreesize();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getFindPhone() {
                return ((hamburgEventMessage) this.instance).getFindPhone();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getFindmoblie() {
                return ((hamburgEventMessage) this.instance).getFindmoblie();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public Event.DfuUpgradeMessage getFirmware() {
                return ((hamburgEventMessage) this.instance).getFirmware();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getFlymode(int i) {
                return ((hamburgEventMessage) this.instance).getFlymode(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getFlymodeCount() {
                return ((hamburgEventMessage) this.instance).getFlymodeCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getFlymodeList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getFlymodeList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public Event.DfuUpgradeMessage getFont() {
                return ((hamburgEventMessage) this.instance).getFont();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getForgetWristOffLockPasswd() {
                return ((hamburgEventMessage) this.instance).getForgetWristOffLockPasswd();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotoActivityPage() {
                return ((hamburgEventMessage) this.instance).getGotoActivityPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotoAlarmPage() {
                return ((hamburgEventMessage) this.instance).getGotoAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotoCompassPage() {
                return ((hamburgEventMessage) this.instance).getGotoCompassPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotoCountdownPage() {
                return ((hamburgEventMessage) this.instance).getGotoCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotoDialActivityPage() {
                return ((hamburgEventMessage) this.instance).getGotoDialActivityPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotoDialAlarmPage() {
                return ((hamburgEventMessage) this.instance).getGotoDialAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotoDialAlipayPage() {
                return ((hamburgEventMessage) this.instance).getGotoDialAlipayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotoDialEventPage() {
                return ((hamburgEventMessage) this.instance).getGotoDialEventPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotoDialHeartPage() {
                return ((hamburgEventMessage) this.instance).getGotoDialHeartPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotoDialMusicPage() {
                return ((hamburgEventMessage) this.instance).getGotoDialMusicPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotoDialNfcCadePage() {
                return ((hamburgEventMessage) this.instance).getGotoDialNfcCadePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotoDialPaiPage() {
                return ((hamburgEventMessage) this.instance).getGotoDialPaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotoDialSportPage() {
                return ((hamburgEventMessage) this.instance).getGotoDialSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotoDialWeatherPage() {
                return ((hamburgEventMessage) this.instance).getGotoDialWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotoEventPage() {
                return ((hamburgEventMessage) this.instance).getGotoEventPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotoHeartPage() {
                return ((hamburgEventMessage) this.instance).getGotoHeartPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotoMusicPage() {
                return ((hamburgEventMessage) this.instance).getGotoMusicPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotoNfcCardPage() {
                return ((hamburgEventMessage) this.instance).getGotoNfcCardPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotoPaiPage() {
                return ((hamburgEventMessage) this.instance).getGotoPaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotoSpO2Page() {
                return ((hamburgEventMessage) this.instance).getGotoSpO2Page();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotoSportDetailPage(int i) {
                return ((hamburgEventMessage) this.instance).getGotoSportDetailPage(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotoSportDetailPageCount() {
                return ((hamburgEventMessage) this.instance).getGotoSportDetailPageCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getGotoSportDetailPageList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getGotoSportDetailPageList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotoSportHistory() {
                return ((hamburgEventMessage) this.instance).getGotoSportHistory();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotoSportPage() {
                return ((hamburgEventMessage) this.instance).getGotoSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotoStopwatchPage() {
                return ((hamburgEventMessage) this.instance).getGotoStopwatchPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotoWeatherPage() {
                return ((hamburgEventMessage) this.instance).getGotoWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotoWeatherSecondPage() {
                return ((hamburgEventMessage) this.instance).getGotoWeatherSecondPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotosleep() {
                return ((hamburgEventMessage) this.instance).getGotosleep();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getGotowakeup() {
                return ((hamburgEventMessage) this.instance).getGotowakeup();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public Event.DfuUpgradeMessage getIncRes() {
                return ((hamburgEventMessage) this.instance).getIncRes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getLanguageselect() {
                return ((hamburgEventMessage) this.instance).getLanguageselect();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getLcdOff(int i) {
                return ((hamburgEventMessage) this.instance).getLcdOff(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getLcdOffCount() {
                return ((hamburgEventMessage) this.instance).getLcdOffCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getLcdOffList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getLcdOffList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getLcdOnBecauseOfWrist() {
                return ((hamburgEventMessage) this.instance).getLcdOnBecauseOfWrist();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getLcdOnBecauseOfWristStatus() {
                return ((hamburgEventMessage) this.instance).getLcdOnBecauseOfWristStatus();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public Event.lightscreentimeMessage getLightscreentime() {
                return ((hamburgEventMessage) this.instance).getLightscreentime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getLightsetting() {
                return ((hamburgEventMessage) this.instance).getLightsetting();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getLockScreen() {
                return ((hamburgEventMessage) this.instance).getLockScreen();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getModifypwd(int i) {
                return ((hamburgEventMessage) this.instance).getModifypwd(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getModifypwdCount() {
                return ((hamburgEventMessage) this.instance).getModifypwdCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getModifypwdList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getModifypwdList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getNFCstatus(int i) {
                return ((hamburgEventMessage) this.instance).getNFCstatus(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getNFCstatusCount() {
                return ((hamburgEventMessage) this.instance).getNFCstatusCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getNFCstatusList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getNFCstatusList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public Event.NandMessage getNandMessage() {
                return ((hamburgEventMessage) this.instance).getNandMessage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getNobindrecovery() {
                return ((hamburgEventMessage) this.instance).getNobindrecovery();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getNobindsupervise() {
                return ((hamburgEventMessage) this.instance).getNobindsupervise();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public Event.NotifyMessage getNotify(int i) {
                return ((hamburgEventMessage) this.instance).getNotify(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getNotifyCount() {
                return ((hamburgEventMessage) this.instance).getNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Event.NotifyMessage> getNotifyList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getNotifyList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getOfflineAsrCmd(int i) {
                return ((hamburgEventMessage) this.instance).getOfflineAsrCmd(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getOfflineAsrCmdCount() {
                return ((hamburgEventMessage) this.instance).getOfflineAsrCmdCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getOfflineAsrCmdList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getOfflineAsrCmdList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getOfflineAsrFailOrSuccess(int i) {
                return ((hamburgEventMessage) this.instance).getOfflineAsrFailOrSuccess(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getOfflineAsrFailOrSuccessCount() {
                return ((hamburgEventMessage) this.instance).getOfflineAsrFailOrSuccessCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getOfflineAsrFailOrSuccessList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getOfflineAsrFailOrSuccessList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getOfflineAsrModeInto(int i) {
                return ((hamburgEventMessage) this.instance).getOfflineAsrModeInto(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getOfflineAsrModeIntoCount() {
                return ((hamburgEventMessage) this.instance).getOfflineAsrModeIntoCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getOfflineAsrModeIntoList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getOfflineAsrModeIntoList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getOfflineAsrModeSelect(int i) {
                return ((hamburgEventMessage) this.instance).getOfflineAsrModeSelect(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getOfflineAsrModeSelectCount() {
                return ((hamburgEventMessage) this.instance).getOfflineAsrModeSelectCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getOfflineAsrModeSelectList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getOfflineAsrModeSelectList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getOffwristlock(int i) {
                return ((hamburgEventMessage) this.instance).getOffwristlock(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getOffwristlockCount() {
                return ((hamburgEventMessage) this.instance).getOffwristlockCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getOffwristlockList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getOffwristlockList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getOnlineVADActionType(int i) {
                return ((hamburgEventMessage) this.instance).getOnlineVADActionType(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getOnlineVADActionTypeCount() {
                return ((hamburgEventMessage) this.instance).getOnlineVADActionTypeCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getOnlineVADActionTypeList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getOnlineVADActionTypeList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getOnlineVADRequest(int i) {
                return ((hamburgEventMessage) this.instance).getOnlineVADRequest(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getOnlineVADRequestCount() {
                return ((hamburgEventMessage) this.instance).getOnlineVADRequestCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getOnlineVADRequestList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getOnlineVADRequestList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getOnlineVADStartType(int i) {
                return ((hamburgEventMessage) this.instance).getOnlineVADStartType(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getOnlineVADStartTypeCount() {
                return ((hamburgEventMessage) this.instance).getOnlineVADStartTypeCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getOnlineVADStartTypeList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getOnlineVADStartTypeList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getPowerOff() {
                return ((hamburgEventMessage) this.instance).getPowerOff();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getPowerOffBatteryValue() {
                return ((hamburgEventMessage) this.instance).getPowerOffBatteryValue();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getPowerOnBatteryValue() {
                return ((hamburgEventMessage) this.instance).getPowerOnBatteryValue();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getPressureautomeasure(int i) {
                return ((hamburgEventMessage) this.instance).getPressureautomeasure(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getPressureautomeasureCount() {
                return ((hamburgEventMessage) this.instance).getPressureautomeasureCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getPressureautomeasureList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getPressureautomeasureList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getPressureinto() {
                return ((hamburgEventMessage) this.instance).getPressureinto();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getPressuremeasureresult(int i) {
                return ((hamburgEventMessage) this.instance).getPressuremeasureresult(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getPressuremeasureresultCount() {
                return ((hamburgEventMessage) this.instance).getPressuremeasureresultCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getPressuremeasureresultList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getPressuremeasureresultList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getQNEgps() {
                return ((hamburgEventMessage) this.instance).getQNEgps();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getQNEinto() {
                return ((hamburgEventMessage) this.instance).getQNEinto();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getQuickAccessApp() {
                return ((hamburgEventMessage) this.instance).getQuickAccessApp();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean getQuickEntryApp(int i) {
                return ((hamburgEventMessage) this.instance).getQuickEntryApp(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getQuickEntryAppCount() {
                return ((hamburgEventMessage) this.instance).getQuickEntryAppCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Boolean> getQuickEntryAppList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getQuickEntryAppList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getRateabnormalreminder() {
                return ((hamburgEventMessage) this.instance).getRateabnormalreminder();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getRatemeasure(int i) {
                return ((hamburgEventMessage) this.instance).getRatemeasure(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getRatemeasureCount() {
                return ((hamburgEventMessage) this.instance).getRatemeasureCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getRatemeasureList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getRatemeasureList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getRatewarnreminder() {
                return ((hamburgEventMessage) this.instance).getRatewarnreminder();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getRebootNum() {
                return ((hamburgEventMessage) this.instance).getRebootNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getRecoverymode() {
                return ((hamburgEventMessage) this.instance).getRecoverymode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getRemindershock() {
                return ((hamburgEventMessage) this.instance).getRemindershock();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getReminderstand() {
                return ((hamburgEventMessage) this.instance).getReminderstand();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getReminderstandcomplete() {
                return ((hamburgEventMessage) this.instance).getReminderstandcomplete();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getRingreminder(int i) {
                return ((hamburgEventMessage) this.instance).getRingreminder(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getRingreminderCount() {
                return ((hamburgEventMessage) this.instance).getRingreminderCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getRingreminderList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getRingreminderList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getScheduledelete(int i) {
                return ((hamburgEventMessage) this.instance).getScheduledelete(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getScheduledeleteCount() {
                return ((hamburgEventMessage) this.instance).getScheduledeleteCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getScheduledeleteList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getScheduledeleteList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getScheduleedit() {
                return ((hamburgEventMessage) this.instance).getScheduleedit();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getSchedulereminderclick(int i) {
                return ((hamburgEventMessage) this.instance).getSchedulereminderclick(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getSchedulereminderclickCount() {
                return ((hamburgEventMessage) this.instance).getSchedulereminderclickCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getSchedulereminderclickList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getSchedulereminderclickList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getSeePAIexplain() {
                return ((hamburgEventMessage) this.instance).getSeePAIexplain();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getSeePAIrate() {
                return ((hamburgEventMessage) this.instance).getSeePAIrate();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getSetAlarm() {
                return ((hamburgEventMessage) this.instance).getSetAlarm();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getSleepgoal() {
                return ((hamburgEventMessage) this.instance).getSleepgoal();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getSleepreminder() {
                return ((hamburgEventMessage) this.instance).getSleepreminder();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getSleepscreen() {
                return ((hamburgEventMessage) this.instance).getSleepscreen();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getSleepstop() {
                return ((hamburgEventMessage) this.instance).getSleepstop();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getSpo2Calc(int i) {
                return ((hamburgEventMessage) this.instance).getSpo2Calc(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getSpo2CalcCount() {
                return ((hamburgEventMessage) this.instance).getSpo2CalcCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getSpo2CalcList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getSpo2CalcList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getSportIndoorCalibrate(int i) {
                return ((hamburgEventMessage) this.instance).getSportIndoorCalibrate(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getSportIndoorCalibrateCount() {
                return ((hamburgEventMessage) this.instance).getSportIndoorCalibrateCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getSportIndoorCalibrateList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getSportIndoorCalibrateList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public Event.SportStatusMessage getSportStatus(int i) {
                return ((hamburgEventMessage) this.instance).getSportStatus(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getSportStatusCount() {
                return ((hamburgEventMessage) this.instance).getSportStatusCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Event.SportStatusMessage> getSportStatusList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getSportStatusList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getSportremindersave() {
                return ((hamburgEventMessage) this.instance).getSportremindersave();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public Event.wifiuseMessage getStartwifi() {
                return ((hamburgEventMessage) this.instance).getStartwifi();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getStopwatchreset() {
                return ((hamburgEventMessage) this.instance).getStopwatchreset();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getStopwatchstart() {
                return ((hamburgEventMessage) this.instance).getStopwatchstart();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getSwimPoolLength() {
                return ((hamburgEventMessage) this.instance).getSwimPoolLength();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean getSysVibration() {
                return ((hamburgEventMessage) this.instance).getSysVibration();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getSystemUpdateCancle() {
                return ((hamburgEventMessage) this.instance).getSystemUpdateCancle();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getSystemUpdateImmediately() {
                return ((hamburgEventMessage) this.instance).getSystemUpdateImmediately();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getTemperatureStatus(int i) {
                return ((hamburgEventMessage) this.instance).getTemperatureStatus(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getTemperatureStatusCount() {
                return ((hamburgEventMessage) this.instance).getTemperatureStatusCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getTemperatureStatusList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getTemperatureStatusList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getTurnOnTheaterMode() {
                return ((hamburgEventMessage) this.instance).getTurnOnTheaterMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getTurnOnkeepWatchAwake() {
                return ((hamburgEventMessage) this.instance).getTurnOnkeepWatchAwake();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getUnlock(int i) {
                return ((hamburgEventMessage) this.instance).getUnlock(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getUnlockCount() {
                return ((hamburgEventMessage) this.instance).getUnlockCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getUnlockList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getUnlockList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getUpdataerrscreen(int i) {
                return ((hamburgEventMessage) this.instance).getUpdataerrscreen(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getUpdataerrscreenCount() {
                return ((hamburgEventMessage) this.instance).getUpdataerrscreenCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getUpdataerrscreenList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getUpdataerrscreenList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getUpdataimmediatelyscreen(int i) {
                return ((hamburgEventMessage) this.instance).getUpdataimmediatelyscreen(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getUpdataimmediatelyscreenCount() {
                return ((hamburgEventMessage) this.instance).getUpdataimmediatelyscreenCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getUpdataimmediatelyscreenList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getUpdataimmediatelyscreenList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getUpdateFail(int i) {
                return ((hamburgEventMessage) this.instance).getUpdateFail(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getUpdateFailCount() {
                return ((hamburgEventMessage) this.instance).getUpdateFailCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getUpdateFailList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getUpdateFailList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getUpdatebyuser() {
                return ((hamburgEventMessage) this.instance).getUpdatebyuser();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getUseStopwatch() {
                return ((hamburgEventMessage) this.instance).getUseStopwatch();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getUsecarcount(int i) {
                return ((hamburgEventMessage) this.instance).getUsecarcount(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getUsecarcountCount() {
                return ((hamburgEventMessage) this.instance).getUsecarcountCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public List<Integer> getUsecarcountList() {
                return Collections.unmodifiableList(((hamburgEventMessage) this.instance).getUsecarcountList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getVicescreenTemperature() {
                return ((hamburgEventMessage) this.instance).getVicescreenTemperature();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getVolbycontrol() {
                return ((hamburgEventMessage) this.instance).getVolbycontrol();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getVolbysetting() {
                return ((hamburgEventMessage) this.instance).getVolbysetting();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getVolsetcount() {
                return ((hamburgEventMessage) this.instance).getVolsetcount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean getWatchdir() {
                return ((hamburgEventMessage) this.instance).getWatchdir();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getWifiTipspage() {
                return ((hamburgEventMessage) this.instance).getWifiTipspage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public int getWifipwdcorrect() {
                return ((hamburgEventMessage) this.instance).getWifipwdcorrect();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean getWristOffLockStatus() {
                return ((hamburgEventMessage) this.instance).getWristOffLockStatus();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasActivityTarget() {
                return ((hamburgEventMessage) this.instance).hasActivityTarget();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasActivityobjectives() {
                return ((hamburgEventMessage) this.instance).hasActivityobjectives();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasAddCardSuccess() {
                return ((hamburgEventMessage) this.instance).hasAddCardSuccess();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasAlarmreminder() {
                return ((hamburgEventMessage) this.instance).hasAlarmreminder();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasAlipayBindSuccessNum() {
                return ((hamburgEventMessage) this.instance).hasAlipayBindSuccessNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasAplayscreen() {
                return ((hamburgEventMessage) this.instance).hasAplayscreen();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasApplistTemperature() {
                return ((hamburgEventMessage) this.instance).hasApplistTemperature();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasAssistantTemperature() {
                return ((hamburgEventMessage) this.instance).hasAssistantTemperature();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasAssistantVAD() {
                return ((hamburgEventMessage) this.instance).hasAssistantVAD();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasAssistantcarid() {
                return ((hamburgEventMessage) this.instance).hasAssistantcarid();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasAssistantinto() {
                return ((hamburgEventMessage) this.instance).hasAssistantinto();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasAutoLight() {
                return ((hamburgEventMessage) this.instance).hasAutoLight();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasAutoScreenOffTime() {
                return ((hamburgEventMessage) this.instance).hasAutoScreenOffTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasBaseRes() {
                return ((hamburgEventMessage) this.instance).hasBaseRes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasBatterySaverOff() {
                return ((hamburgEventMessage) this.instance).hasBatterySaverOff();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasBatterySaverOn() {
                return ((hamburgEventMessage) this.instance).hasBatterySaverOn();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasBindingSuccess() {
                return ((hamburgEventMessage) this.instance).hasBindingSuccess();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasBindsetlanguage() {
                return ((hamburgEventMessage) this.instance).hasBindsetlanguage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasBleconnectclose() {
                return ((hamburgEventMessage) this.instance).hasBleconnectclose();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasBleconnectfail() {
                return ((hamburgEventMessage) this.instance).hasBleconnectfail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasBleconnectsuccess() {
                return ((hamburgEventMessage) this.instance).hasBleconnectsuccess();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasBlelistclick() {
                return ((hamburgEventMessage) this.instance).hasBlelistclick();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasChangeBatteryValue() {
                return ((hamburgEventMessage) this.instance).hasChangeBatteryValue();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasClosewifi() {
                return ((hamburgEventMessage) this.instance).hasClosewifi();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasCompassCalibrateSuccessNum() {
                return ((hamburgEventMessage) this.instance).hasCompassCalibrateSuccessNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasCountDownTimeup() {
                return ((hamburgEventMessage) this.instance).hasCountDownTimeup();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasCoutdowntime() {
                return ((hamburgEventMessage) this.instance).hasCoutdowntime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasCurrentDialId() {
                return ((hamburgEventMessage) this.instance).hasCurrentDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasCurrentDialNum() {
                return ((hamburgEventMessage) this.instance).hasCurrentDialNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasDialchangemode() {
                return ((hamburgEventMessage) this.instance).hasDialchangemode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasDialtool() {
                return ((hamburgEventMessage) this.instance).hasDialtool();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasDndMode() {
                return ((hamburgEventMessage) this.instance).hasDndMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasEventTimeUp() {
                return ((hamburgEventMessage) this.instance).hasEventTimeUp();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasFatDosfsck() {
                return ((hamburgEventMessage) this.instance).hasFatDosfsck();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasFatDropsize() {
                return ((hamburgEventMessage) this.instance).hasFatDropsize();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasFatDroptime() {
                return ((hamburgEventMessage) this.instance).hasFatDroptime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasFatFormat() {
                return ((hamburgEventMessage) this.instance).hasFatFormat();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasFatFreesize() {
                return ((hamburgEventMessage) this.instance).hasFatFreesize();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasFindPhone() {
                return ((hamburgEventMessage) this.instance).hasFindPhone();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasFindmoblie() {
                return ((hamburgEventMessage) this.instance).hasFindmoblie();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasFirmware() {
                return ((hamburgEventMessage) this.instance).hasFirmware();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasFont() {
                return ((hamburgEventMessage) this.instance).hasFont();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasForgetWristOffLockPasswd() {
                return ((hamburgEventMessage) this.instance).hasForgetWristOffLockPasswd();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasGotoActivityPage() {
                return ((hamburgEventMessage) this.instance).hasGotoActivityPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasGotoAlarmPage() {
                return ((hamburgEventMessage) this.instance).hasGotoAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasGotoCompassPage() {
                return ((hamburgEventMessage) this.instance).hasGotoCompassPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasGotoCountdownPage() {
                return ((hamburgEventMessage) this.instance).hasGotoCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasGotoDialActivityPage() {
                return ((hamburgEventMessage) this.instance).hasGotoDialActivityPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasGotoDialAlarmPage() {
                return ((hamburgEventMessage) this.instance).hasGotoDialAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasGotoDialAlipayPage() {
                return ((hamburgEventMessage) this.instance).hasGotoDialAlipayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasGotoDialEventPage() {
                return ((hamburgEventMessage) this.instance).hasGotoDialEventPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasGotoDialHeartPage() {
                return ((hamburgEventMessage) this.instance).hasGotoDialHeartPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasGotoDialMusicPage() {
                return ((hamburgEventMessage) this.instance).hasGotoDialMusicPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasGotoDialNfcCadePage() {
                return ((hamburgEventMessage) this.instance).hasGotoDialNfcCadePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasGotoDialPaiPage() {
                return ((hamburgEventMessage) this.instance).hasGotoDialPaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasGotoDialSportPage() {
                return ((hamburgEventMessage) this.instance).hasGotoDialSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasGotoDialWeatherPage() {
                return ((hamburgEventMessage) this.instance).hasGotoDialWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasGotoEventPage() {
                return ((hamburgEventMessage) this.instance).hasGotoEventPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasGotoHeartPage() {
                return ((hamburgEventMessage) this.instance).hasGotoHeartPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasGotoMusicPage() {
                return ((hamburgEventMessage) this.instance).hasGotoMusicPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasGotoNfcCardPage() {
                return ((hamburgEventMessage) this.instance).hasGotoNfcCardPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasGotoPaiPage() {
                return ((hamburgEventMessage) this.instance).hasGotoPaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasGotoSpO2Page() {
                return ((hamburgEventMessage) this.instance).hasGotoSpO2Page();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasGotoSportHistory() {
                return ((hamburgEventMessage) this.instance).hasGotoSportHistory();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasGotoSportPage() {
                return ((hamburgEventMessage) this.instance).hasGotoSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasGotoStopwatchPage() {
                return ((hamburgEventMessage) this.instance).hasGotoStopwatchPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasGotoWeatherPage() {
                return ((hamburgEventMessage) this.instance).hasGotoWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasGotoWeatherSecondPage() {
                return ((hamburgEventMessage) this.instance).hasGotoWeatherSecondPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasGotosleep() {
                return ((hamburgEventMessage) this.instance).hasGotosleep();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasGotowakeup() {
                return ((hamburgEventMessage) this.instance).hasGotowakeup();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasIncRes() {
                return ((hamburgEventMessage) this.instance).hasIncRes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasLanguageselect() {
                return ((hamburgEventMessage) this.instance).hasLanguageselect();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfWrist() {
                return ((hamburgEventMessage) this.instance).hasLcdOnBecauseOfWrist();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfWristStatus() {
                return ((hamburgEventMessage) this.instance).hasLcdOnBecauseOfWristStatus();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasLightscreentime() {
                return ((hamburgEventMessage) this.instance).hasLightscreentime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasLightsetting() {
                return ((hamburgEventMessage) this.instance).hasLightsetting();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasLockScreen() {
                return ((hamburgEventMessage) this.instance).hasLockScreen();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasNandMessage() {
                return ((hamburgEventMessage) this.instance).hasNandMessage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasNobindrecovery() {
                return ((hamburgEventMessage) this.instance).hasNobindrecovery();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasNobindsupervise() {
                return ((hamburgEventMessage) this.instance).hasNobindsupervise();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasPowerOff() {
                return ((hamburgEventMessage) this.instance).hasPowerOff();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasPowerOffBatteryValue() {
                return ((hamburgEventMessage) this.instance).hasPowerOffBatteryValue();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasPowerOnBatteryValue() {
                return ((hamburgEventMessage) this.instance).hasPowerOnBatteryValue();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasPressureinto() {
                return ((hamburgEventMessage) this.instance).hasPressureinto();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasQNEgps() {
                return ((hamburgEventMessage) this.instance).hasQNEgps();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasQNEinto() {
                return ((hamburgEventMessage) this.instance).hasQNEinto();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasQuickAccessApp() {
                return ((hamburgEventMessage) this.instance).hasQuickAccessApp();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasRateabnormalreminder() {
                return ((hamburgEventMessage) this.instance).hasRateabnormalreminder();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasRatewarnreminder() {
                return ((hamburgEventMessage) this.instance).hasRatewarnreminder();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasRebootNum() {
                return ((hamburgEventMessage) this.instance).hasRebootNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasRecoverymode() {
                return ((hamburgEventMessage) this.instance).hasRecoverymode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasRemindershock() {
                return ((hamburgEventMessage) this.instance).hasRemindershock();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasReminderstand() {
                return ((hamburgEventMessage) this.instance).hasReminderstand();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasReminderstandcomplete() {
                return ((hamburgEventMessage) this.instance).hasReminderstandcomplete();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasScheduleedit() {
                return ((hamburgEventMessage) this.instance).hasScheduleedit();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasSeePAIexplain() {
                return ((hamburgEventMessage) this.instance).hasSeePAIexplain();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasSeePAIrate() {
                return ((hamburgEventMessage) this.instance).hasSeePAIrate();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasSetAlarm() {
                return ((hamburgEventMessage) this.instance).hasSetAlarm();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasSleepgoal() {
                return ((hamburgEventMessage) this.instance).hasSleepgoal();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasSleepreminder() {
                return ((hamburgEventMessage) this.instance).hasSleepreminder();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasSleepscreen() {
                return ((hamburgEventMessage) this.instance).hasSleepscreen();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasSleepstop() {
                return ((hamburgEventMessage) this.instance).hasSleepstop();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasSportremindersave() {
                return ((hamburgEventMessage) this.instance).hasSportremindersave();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasStartwifi() {
                return ((hamburgEventMessage) this.instance).hasStartwifi();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasStopwatchreset() {
                return ((hamburgEventMessage) this.instance).hasStopwatchreset();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasStopwatchstart() {
                return ((hamburgEventMessage) this.instance).hasStopwatchstart();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasSwimPoolLength() {
                return ((hamburgEventMessage) this.instance).hasSwimPoolLength();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasSysVibration() {
                return ((hamburgEventMessage) this.instance).hasSysVibration();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasSystemUpdateCancle() {
                return ((hamburgEventMessage) this.instance).hasSystemUpdateCancle();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasSystemUpdateImmediately() {
                return ((hamburgEventMessage) this.instance).hasSystemUpdateImmediately();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasTurnOnTheaterMode() {
                return ((hamburgEventMessage) this.instance).hasTurnOnTheaterMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasTurnOnkeepWatchAwake() {
                return ((hamburgEventMessage) this.instance).hasTurnOnkeepWatchAwake();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasUpdatebyuser() {
                return ((hamburgEventMessage) this.instance).hasUpdatebyuser();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasUseStopwatch() {
                return ((hamburgEventMessage) this.instance).hasUseStopwatch();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasVicescreenTemperature() {
                return ((hamburgEventMessage) this.instance).hasVicescreenTemperature();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasVolbycontrol() {
                return ((hamburgEventMessage) this.instance).hasVolbycontrol();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasVolbysetting() {
                return ((hamburgEventMessage) this.instance).hasVolbysetting();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasVolsetcount() {
                return ((hamburgEventMessage) this.instance).hasVolsetcount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasWatchdir() {
                return ((hamburgEventMessage) this.instance).hasWatchdir();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasWifiTipspage() {
                return ((hamburgEventMessage) this.instance).hasWifiTipspage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasWifipwdcorrect() {
                return ((hamburgEventMessage) this.instance).hasWifipwdcorrect();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
            public boolean hasWristOffLockStatus() {
                return ((hamburgEventMessage) this.instance).hasWristOffLockStatus();
            }

            public Builder mergeBaseRes(Event.DfuUpgradeMessage dfuUpgradeMessage) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).mergeBaseRes(dfuUpgradeMessage);
                return this;
            }

            public Builder mergeBatterySaverOff(Event.BatterySaverMode batterySaverMode) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).mergeBatterySaverOff(batterySaverMode);
                return this;
            }

            public Builder mergeBatterySaverOn(Event.BatterySaverMode batterySaverMode) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).mergeBatterySaverOn(batterySaverMode);
                return this;
            }

            public Builder mergeClosewifi(Event.wifiuseMessage wifiusemessage) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).mergeClosewifi(wifiusemessage);
                return this;
            }

            public Builder mergeDialtool(Event.DialtoolMessage dialtoolMessage) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).mergeDialtool(dialtoolMessage);
                return this;
            }

            public Builder mergeDndMode(Event.DndEventMessage dndEventMessage) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).mergeDndMode(dndEventMessage);
                return this;
            }

            public Builder mergeFirmware(Event.DfuUpgradeMessage dfuUpgradeMessage) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).mergeFirmware(dfuUpgradeMessage);
                return this;
            }

            public Builder mergeFont(Event.DfuUpgradeMessage dfuUpgradeMessage) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).mergeFont(dfuUpgradeMessage);
                return this;
            }

            public Builder mergeIncRes(Event.DfuUpgradeMessage dfuUpgradeMessage) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).mergeIncRes(dfuUpgradeMessage);
                return this;
            }

            public Builder mergeLightscreentime(Event.lightscreentimeMessage lightscreentimemessage) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).mergeLightscreentime(lightscreentimemessage);
                return this;
            }

            public Builder mergeNandMessage(Event.NandMessage nandMessage) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).mergeNandMessage(nandMessage);
                return this;
            }

            public Builder mergeStartwifi(Event.wifiuseMessage wifiusemessage) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).mergeStartwifi(wifiusemessage);
                return this;
            }

            public Builder removeNotify(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).removeNotify(i);
                return this;
            }

            public Builder removeSportStatus(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).removeSportStatus(i);
                return this;
            }

            public Builder setActivityTarget(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setActivityTarget(i);
                return this;
            }

            public Builder setActivityobjectives(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setActivityobjectives(i);
                return this;
            }

            public Builder setAddCardSuccess(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setAddCardSuccess(i);
                return this;
            }

            public Builder setAlarmreminder(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setAlarmreminder(i);
                return this;
            }

            public Builder setAlarmreminderclick(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setAlarmreminderclick(i, i2);
                return this;
            }

            public Builder setAlipayBindSuccessNum(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setAlipayBindSuccessNum(i);
                return this;
            }

            public Builder setAplayscreen(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setAplayscreen(i);
                return this;
            }

            public Builder setApplistTemperature(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setApplistTemperature(i);
                return this;
            }

            public Builder setAssistantTemperature(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setAssistantTemperature(i);
                return this;
            }

            public Builder setAssistantVAD(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setAssistantVAD(i);
                return this;
            }

            public Builder setAssistantcarid(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setAssistantcarid(i);
                return this;
            }

            public Builder setAssistantinto(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setAssistantinto(i);
                return this;
            }

            public Builder setAutoLight(boolean z) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setAutoLight(z);
                return this;
            }

            public Builder setAutoScreenOffTime(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setAutoScreenOffTime(i);
                return this;
            }

            public Builder setBaseRes(Event.DfuUpgradeMessage dfuUpgradeMessage) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setBaseRes(dfuUpgradeMessage);
                return this;
            }

            public Builder setBatterySaverOff(Event.BatterySaverMode batterySaverMode) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setBatterySaverOff(batterySaverMode);
                return this;
            }

            public Builder setBatterySaverOn(Event.BatterySaverMode batterySaverMode) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setBatterySaverOn(batterySaverMode);
                return this;
            }

            public Builder setBindingSuccess(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setBindingSuccess(i);
                return this;
            }

            public Builder setBindsetlanguage(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setBindsetlanguage(i);
                return this;
            }

            public Builder setBleconnect(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setBleconnect(i, i2);
                return this;
            }

            public Builder setBleconnectclose(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setBleconnectclose(i);
                return this;
            }

            public Builder setBleconnectfail(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setBleconnectfail(i);
                return this;
            }

            public Builder setBleconnectsuccess(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setBleconnectsuccess(i);
                return this;
            }

            public Builder setBlelistclick(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setBlelistclick(i);
                return this;
            }

            public Builder setBlestatus(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setBlestatus(i, i2);
                return this;
            }

            public Builder setChangeBatteryValue(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setChangeBatteryValue(i);
                return this;
            }

            public Builder setClosewifi(Event.wifiuseMessage wifiusemessage) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setClosewifi(wifiusemessage);
                return this;
            }

            public Builder setCompassCalibrateSuccessNum(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setCompassCalibrateSuccessNum(i);
                return this;
            }

            public Builder setCountDownTimeup(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setCountDownTimeup(i);
                return this;
            }

            public Builder setCoutdowntime(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setCoutdowntime(i);
                return this;
            }

            public Builder setCurrentDialId(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setCurrentDialId(i);
                return this;
            }

            public Builder setCurrentDialNum(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setCurrentDialNum(i);
                return this;
            }

            public Builder setDialchangemode(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setDialchangemode(i);
                return this;
            }

            public Builder setDialtool(Event.DialtoolMessage dialtoolMessage) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setDialtool(dialtoolMessage);
                return this;
            }

            public Builder setDndMode(Event.DndEventMessage dndEventMessage) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setDndMode(dndEventMessage);
                return this;
            }

            public Builder setEventTimeUp(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setEventTimeUp(i);
                return this;
            }

            public Builder setFatDosfsck(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setFatDosfsck(i);
                return this;
            }

            public Builder setFatDropsize(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setFatDropsize(i);
                return this;
            }

            public Builder setFatDroptime(long j) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setFatDroptime(j);
                return this;
            }

            public Builder setFatFormat(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setFatFormat(i);
                return this;
            }

            public Builder setFatFreesize(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setFatFreesize(i);
                return this;
            }

            public Builder setFindPhone(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setFindPhone(i);
                return this;
            }

            public Builder setFindmoblie(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setFindmoblie(i);
                return this;
            }

            public Builder setFirmware(Event.DfuUpgradeMessage dfuUpgradeMessage) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setFirmware(dfuUpgradeMessage);
                return this;
            }

            public Builder setFlymode(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setFlymode(i, i2);
                return this;
            }

            public Builder setFont(Event.DfuUpgradeMessage dfuUpgradeMessage) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setFont(dfuUpgradeMessage);
                return this;
            }

            public Builder setForgetWristOffLockPasswd(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setForgetWristOffLockPasswd(i);
                return this;
            }

            public Builder setGotoActivityPage(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setGotoActivityPage(i);
                return this;
            }

            public Builder setGotoAlarmPage(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setGotoAlarmPage(i);
                return this;
            }

            public Builder setGotoCompassPage(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setGotoCompassPage(i);
                return this;
            }

            public Builder setGotoCountdownPage(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setGotoCountdownPage(i);
                return this;
            }

            public Builder setGotoDialActivityPage(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setGotoDialActivityPage(i);
                return this;
            }

            public Builder setGotoDialAlarmPage(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setGotoDialAlarmPage(i);
                return this;
            }

            public Builder setGotoDialAlipayPage(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setGotoDialAlipayPage(i);
                return this;
            }

            public Builder setGotoDialEventPage(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setGotoDialEventPage(i);
                return this;
            }

            public Builder setGotoDialHeartPage(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setGotoDialHeartPage(i);
                return this;
            }

            public Builder setGotoDialMusicPage(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setGotoDialMusicPage(i);
                return this;
            }

            public Builder setGotoDialNfcCadePage(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setGotoDialNfcCadePage(i);
                return this;
            }

            public Builder setGotoDialPaiPage(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setGotoDialPaiPage(i);
                return this;
            }

            public Builder setGotoDialSportPage(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setGotoDialSportPage(i);
                return this;
            }

            public Builder setGotoDialWeatherPage(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setGotoDialWeatherPage(i);
                return this;
            }

            public Builder setGotoEventPage(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setGotoEventPage(i);
                return this;
            }

            public Builder setGotoHeartPage(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setGotoHeartPage(i);
                return this;
            }

            public Builder setGotoMusicPage(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setGotoMusicPage(i);
                return this;
            }

            public Builder setGotoNfcCardPage(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setGotoNfcCardPage(i);
                return this;
            }

            public Builder setGotoPaiPage(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setGotoPaiPage(i);
                return this;
            }

            public Builder setGotoSpO2Page(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setGotoSpO2Page(i);
                return this;
            }

            public Builder setGotoSportDetailPage(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setGotoSportDetailPage(i, i2);
                return this;
            }

            public Builder setGotoSportHistory(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setGotoSportHistory(i);
                return this;
            }

            public Builder setGotoSportPage(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setGotoSportPage(i);
                return this;
            }

            public Builder setGotoStopwatchPage(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setGotoStopwatchPage(i);
                return this;
            }

            public Builder setGotoWeatherPage(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setGotoWeatherPage(i);
                return this;
            }

            public Builder setGotoWeatherSecondPage(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setGotoWeatherSecondPage(i);
                return this;
            }

            public Builder setGotosleep(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setGotosleep(i);
                return this;
            }

            public Builder setGotowakeup(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setGotowakeup(i);
                return this;
            }

            public Builder setIncRes(Event.DfuUpgradeMessage dfuUpgradeMessage) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setIncRes(dfuUpgradeMessage);
                return this;
            }

            public Builder setLanguageselect(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setLanguageselect(i);
                return this;
            }

            public Builder setLcdOff(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setLcdOff(i, i2);
                return this;
            }

            public Builder setLcdOnBecauseOfWrist(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setLcdOnBecauseOfWrist(i);
                return this;
            }

            public Builder setLcdOnBecauseOfWristStatus(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setLcdOnBecauseOfWristStatus(i);
                return this;
            }

            public Builder setLightscreentime(Event.lightscreentimeMessage lightscreentimemessage) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setLightscreentime(lightscreentimemessage);
                return this;
            }

            public Builder setLightsetting(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setLightsetting(i);
                return this;
            }

            public Builder setLockScreen(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setLockScreen(i);
                return this;
            }

            public Builder setModifypwd(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setModifypwd(i, i2);
                return this;
            }

            public Builder setNFCstatus(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setNFCstatus(i, i2);
                return this;
            }

            public Builder setNandMessage(Event.NandMessage nandMessage) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setNandMessage(nandMessage);
                return this;
            }

            public Builder setNobindrecovery(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setNobindrecovery(i);
                return this;
            }

            public Builder setNobindsupervise(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setNobindsupervise(i);
                return this;
            }

            public Builder setNotify(int i, Event.NotifyMessage notifyMessage) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setNotify(i, notifyMessage);
                return this;
            }

            public Builder setOfflineAsrCmd(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setOfflineAsrCmd(i, i2);
                return this;
            }

            public Builder setOfflineAsrFailOrSuccess(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setOfflineAsrFailOrSuccess(i, i2);
                return this;
            }

            public Builder setOfflineAsrModeInto(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setOfflineAsrModeInto(i, i2);
                return this;
            }

            public Builder setOfflineAsrModeSelect(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setOfflineAsrModeSelect(i, i2);
                return this;
            }

            public Builder setOffwristlock(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setOffwristlock(i, i2);
                return this;
            }

            public Builder setOnlineVADActionType(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setOnlineVADActionType(i, i2);
                return this;
            }

            public Builder setOnlineVADRequest(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setOnlineVADRequest(i, i2);
                return this;
            }

            public Builder setOnlineVADStartType(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setOnlineVADStartType(i, i2);
                return this;
            }

            public Builder setPowerOff(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setPowerOff(i);
                return this;
            }

            public Builder setPowerOffBatteryValue(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setPowerOffBatteryValue(i);
                return this;
            }

            public Builder setPowerOnBatteryValue(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setPowerOnBatteryValue(i);
                return this;
            }

            public Builder setPressureautomeasure(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setPressureautomeasure(i, i2);
                return this;
            }

            public Builder setPressureinto(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setPressureinto(i);
                return this;
            }

            public Builder setPressuremeasureresult(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setPressuremeasureresult(i, i2);
                return this;
            }

            public Builder setQNEgps(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setQNEgps(i);
                return this;
            }

            public Builder setQNEinto(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setQNEinto(i);
                return this;
            }

            public Builder setQuickAccessApp(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setQuickAccessApp(i);
                return this;
            }

            public Builder setQuickEntryApp(int i, boolean z) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setQuickEntryApp(i, z);
                return this;
            }

            public Builder setRateabnormalreminder(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setRateabnormalreminder(i);
                return this;
            }

            public Builder setRatemeasure(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setRatemeasure(i, i2);
                return this;
            }

            public Builder setRatewarnreminder(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setRatewarnreminder(i);
                return this;
            }

            public Builder setRebootNum(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setRebootNum(i);
                return this;
            }

            public Builder setRecoverymode(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setRecoverymode(i);
                return this;
            }

            public Builder setRemindershock(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setRemindershock(i);
                return this;
            }

            public Builder setReminderstand(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setReminderstand(i);
                return this;
            }

            public Builder setReminderstandcomplete(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setReminderstandcomplete(i);
                return this;
            }

            public Builder setRingreminder(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setRingreminder(i, i2);
                return this;
            }

            public Builder setScheduledelete(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setScheduledelete(i, i2);
                return this;
            }

            public Builder setScheduleedit(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setScheduleedit(i);
                return this;
            }

            public Builder setSchedulereminderclick(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setSchedulereminderclick(i, i2);
                return this;
            }

            public Builder setSeePAIexplain(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setSeePAIexplain(i);
                return this;
            }

            public Builder setSeePAIrate(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setSeePAIrate(i);
                return this;
            }

            public Builder setSetAlarm(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setSetAlarm(i);
                return this;
            }

            public Builder setSleepgoal(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setSleepgoal(i);
                return this;
            }

            public Builder setSleepreminder(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setSleepreminder(i);
                return this;
            }

            public Builder setSleepscreen(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setSleepscreen(i);
                return this;
            }

            public Builder setSleepstop(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setSleepstop(i);
                return this;
            }

            public Builder setSpo2Calc(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setSpo2Calc(i, i2);
                return this;
            }

            public Builder setSportIndoorCalibrate(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setSportIndoorCalibrate(i, i2);
                return this;
            }

            public Builder setSportStatus(int i, Event.SportStatusMessage sportStatusMessage) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setSportStatus(i, sportStatusMessage);
                return this;
            }

            public Builder setSportremindersave(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setSportremindersave(i);
                return this;
            }

            public Builder setStartwifi(Event.wifiuseMessage wifiusemessage) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setStartwifi(wifiusemessage);
                return this;
            }

            public Builder setStopwatchreset(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setStopwatchreset(i);
                return this;
            }

            public Builder setStopwatchstart(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setStopwatchstart(i);
                return this;
            }

            public Builder setSwimPoolLength(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setSwimPoolLength(i);
                return this;
            }

            public Builder setSysVibration(boolean z) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setSysVibration(z);
                return this;
            }

            public Builder setSystemUpdateCancle(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setSystemUpdateCancle(i);
                return this;
            }

            public Builder setSystemUpdateImmediately(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setSystemUpdateImmediately(i);
                return this;
            }

            public Builder setTemperatureStatus(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setTemperatureStatus(i, i2);
                return this;
            }

            public Builder setTurnOnTheaterMode(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setTurnOnTheaterMode(i);
                return this;
            }

            public Builder setTurnOnkeepWatchAwake(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setTurnOnkeepWatchAwake(i);
                return this;
            }

            public Builder setUnlock(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setUnlock(i, i2);
                return this;
            }

            public Builder setUpdataerrscreen(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setUpdataerrscreen(i, i2);
                return this;
            }

            public Builder setUpdataimmediatelyscreen(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setUpdataimmediatelyscreen(i, i2);
                return this;
            }

            public Builder setUpdateFail(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setUpdateFail(i, i2);
                return this;
            }

            public Builder setUpdatebyuser(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setUpdatebyuser(i);
                return this;
            }

            public Builder setUseStopwatch(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setUseStopwatch(i);
                return this;
            }

            public Builder setUsecarcount(int i, int i2) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setUsecarcount(i, i2);
                return this;
            }

            public Builder setVicescreenTemperature(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setVicescreenTemperature(i);
                return this;
            }

            public Builder setVolbycontrol(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setVolbycontrol(i);
                return this;
            }

            public Builder setVolbysetting(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setVolbysetting(i);
                return this;
            }

            public Builder setVolsetcount(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setVolsetcount(i);
                return this;
            }

            public Builder setWatchdir(boolean z) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setWatchdir(z);
                return this;
            }

            public Builder setWifiTipspage(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setWifiTipspage(i);
                return this;
            }

            public Builder setWifipwdcorrect(int i) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setWifipwdcorrect(i);
                return this;
            }

            public Builder setWristOffLockStatus(boolean z) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setWristOffLockStatus(z);
                return this;
            }

            private Builder() {
                super(hamburgEventMessage.DEFAULT_INSTANCE);
            }

            public Builder addNotify(int i, Event.NotifyMessage notifyMessage) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addNotify(i, notifyMessage);
                return this;
            }

            public Builder addSportStatus(int i, Event.SportStatusMessage sportStatusMessage) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addSportStatus(i, sportStatusMessage);
                return this;
            }

            public Builder setBaseRes(Event.DfuUpgradeMessage.Builder builder) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setBaseRes(builder.build());
                return this;
            }

            public Builder setBatterySaverOff(Event.BatterySaverMode.Builder builder) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setBatterySaverOff(builder.build());
                return this;
            }

            public Builder setBatterySaverOn(Event.BatterySaverMode.Builder builder) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setBatterySaverOn(builder.build());
                return this;
            }

            public Builder setClosewifi(Event.wifiuseMessage.Builder builder) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setClosewifi(builder.build());
                return this;
            }

            public Builder setDialtool(Event.DialtoolMessage.Builder builder) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setDialtool(builder.build());
                return this;
            }

            public Builder setDndMode(Event.DndEventMessage.Builder builder) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setDndMode(builder.build());
                return this;
            }

            public Builder setFirmware(Event.DfuUpgradeMessage.Builder builder) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setFirmware(builder.build());
                return this;
            }

            public Builder setFont(Event.DfuUpgradeMessage.Builder builder) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setFont(builder.build());
                return this;
            }

            public Builder setIncRes(Event.DfuUpgradeMessage.Builder builder) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setIncRes(builder.build());
                return this;
            }

            public Builder setLightscreentime(Event.lightscreentimeMessage.Builder builder) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setLightscreentime(builder.build());
                return this;
            }

            public Builder setNandMessage(Event.NandMessage.Builder builder) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setNandMessage(builder.build());
                return this;
            }

            public Builder setNotify(int i, Event.NotifyMessage.Builder builder) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setNotify(i, builder.build());
                return this;
            }

            public Builder setSportStatus(int i, Event.SportStatusMessage.Builder builder) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setSportStatus(i, builder.build());
                return this;
            }

            public Builder setStartwifi(Event.wifiuseMessage.Builder builder) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).setStartwifi(builder.build());
                return this;
            }

            public Builder addNotify(Event.NotifyMessage.Builder builder) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addNotify(builder.build());
                return this;
            }

            public Builder addSportStatus(Event.SportStatusMessage.Builder builder) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addSportStatus(builder.build());
                return this;
            }

            public Builder addNotify(int i, Event.NotifyMessage.Builder builder) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addNotify(i, builder.build());
                return this;
            }

            public Builder addSportStatus(int i, Event.SportStatusMessage.Builder builder) {
                copyOnWrite();
                ((hamburgEventMessage) this.instance).addSportStatus(i, builder.build());
                return this;
            }
        }

        static {
            hamburgEventMessage hamburgeventmessage = new hamburgEventMessage();
            DEFAULT_INSTANCE = hamburgeventmessage;
            GeneratedMessageLite.registerDefaultInstance(hamburgEventMessage.class, hamburgeventmessage);
        }

        private hamburgEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAlarmreminderclick(int i) {
            ensureAlarmreminderclickIsMutable();
            this.alarmreminderclick_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAlarmreminderclick(Iterable<? extends Integer> iterable) {
            ensureAlarmreminderclickIsMutable();
            b.addAll((Iterable) iterable, (List) this.alarmreminderclick_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBleconnect(Iterable<? extends Integer> iterable) {
            ensureBleconnectIsMutable();
            b.addAll((Iterable) iterable, (List) this.bleconnect_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBlestatus(Iterable<? extends Integer> iterable) {
            ensureBlestatusIsMutable();
            b.addAll((Iterable) iterable, (List) this.blestatus_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllFlymode(Iterable<? extends Integer> iterable) {
            ensureFlymodeIsMutable();
            b.addAll((Iterable) iterable, (List) this.flymode_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllGotoSportDetailPage(Iterable<? extends Integer> iterable) {
            ensureGotoSportDetailPageIsMutable();
            b.addAll((Iterable) iterable, (List) this.gotoSportDetailPage_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLcdOff(Iterable<? extends Integer> iterable) {
            ensureLcdOffIsMutable();
            b.addAll((Iterable) iterable, (List) this.lcdOff_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllModifypwd(Iterable<? extends Integer> iterable) {
            ensureModifypwdIsMutable();
            b.addAll((Iterable) iterable, (List) this.modifypwd_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllNFCstatus(Iterable<? extends Integer> iterable) {
            ensureNFCstatusIsMutable();
            b.addAll((Iterable) iterable, (List) this.nFCstatus_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllNotify(Iterable<? extends Event.NotifyMessage> iterable) {
            ensureNotifyIsMutable();
            b.addAll((Iterable) iterable, (List) this.notify_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOfflineAsrCmd(Iterable<? extends Integer> iterable) {
            ensureOfflineAsrCmdIsMutable();
            b.addAll((Iterable) iterable, (List) this.offlineAsrCmd_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOfflineAsrFailOrSuccess(Iterable<? extends Integer> iterable) {
            ensureOfflineAsrFailOrSuccessIsMutable();
            b.addAll((Iterable) iterable, (List) this.offlineAsrFailOrSuccess_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOfflineAsrModeInto(Iterable<? extends Integer> iterable) {
            ensureOfflineAsrModeIntoIsMutable();
            b.addAll((Iterable) iterable, (List) this.offlineAsrModeInto_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOfflineAsrModeSelect(Iterable<? extends Integer> iterable) {
            ensureOfflineAsrModeSelectIsMutable();
            b.addAll((Iterable) iterable, (List) this.offlineAsrModeSelect_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOffwristlock(Iterable<? extends Integer> iterable) {
            ensureOffwristlockIsMutable();
            b.addAll((Iterable) iterable, (List) this.offwristlock_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOnlineVADActionType(Iterable<? extends Integer> iterable) {
            ensureOnlineVADActionTypeIsMutable();
            b.addAll((Iterable) iterable, (List) this.onlineVADActionType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOnlineVADRequest(Iterable<? extends Integer> iterable) {
            ensureOnlineVADRequestIsMutable();
            b.addAll((Iterable) iterable, (List) this.onlineVADRequest_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOnlineVADStartType(Iterable<? extends Integer> iterable) {
            ensureOnlineVADStartTypeIsMutable();
            b.addAll((Iterable) iterable, (List) this.onlineVADStartType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPressureautomeasure(Iterable<? extends Integer> iterable) {
            ensurePressureautomeasureIsMutable();
            b.addAll((Iterable) iterable, (List) this.pressureautomeasure_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPressuremeasureresult(Iterable<? extends Integer> iterable) {
            ensurePressuremeasureresultIsMutable();
            b.addAll((Iterable) iterable, (List) this.pressuremeasureresult_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllQuickEntryApp(Iterable<? extends Boolean> iterable) {
            ensureQuickEntryAppIsMutable();
            b.addAll((Iterable) iterable, (List) this.quickEntryApp_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllRatemeasure(Iterable<? extends Integer> iterable) {
            ensureRatemeasureIsMutable();
            b.addAll((Iterable) iterable, (List) this.ratemeasure_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllRingreminder(Iterable<? extends Integer> iterable) {
            ensureRingreminderIsMutable();
            b.addAll((Iterable) iterable, (List) this.ringreminder_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllScheduledelete(Iterable<? extends Integer> iterable) {
            ensureScheduledeleteIsMutable();
            b.addAll((Iterable) iterable, (List) this.scheduledelete_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSchedulereminderclick(Iterable<? extends Integer> iterable) {
            ensureSchedulereminderclickIsMutable();
            b.addAll((Iterable) iterable, (List) this.schedulereminderclick_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSpo2Calc(Iterable<? extends Integer> iterable) {
            ensureSpo2CalcIsMutable();
            b.addAll((Iterable) iterable, (List) this.spo2Calc_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSportIndoorCalibrate(Iterable<? extends Integer> iterable) {
            ensureSportIndoorCalibrateIsMutable();
            b.addAll((Iterable) iterable, (List) this.sportIndoorCalibrate_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSportStatus(Iterable<? extends Event.SportStatusMessage> iterable) {
            ensureSportStatusIsMutable();
            b.addAll((Iterable) iterable, (List) this.sportStatus_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllTemperatureStatus(Iterable<? extends Integer> iterable) {
            ensureTemperatureStatusIsMutable();
            b.addAll((Iterable) iterable, (List) this.temperatureStatus_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUnlock(Iterable<? extends Integer> iterable) {
            ensureUnlockIsMutable();
            b.addAll((Iterable) iterable, (List) this.unlock_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUpdataerrscreen(Iterable<? extends Integer> iterable) {
            ensureUpdataerrscreenIsMutable();
            b.addAll((Iterable) iterable, (List) this.updataerrscreen_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUpdataimmediatelyscreen(Iterable<? extends Integer> iterable) {
            ensureUpdataimmediatelyscreenIsMutable();
            b.addAll((Iterable) iterable, (List) this.updataimmediatelyscreen_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUpdateFail(Iterable<? extends Integer> iterable) {
            ensureUpdateFailIsMutable();
            b.addAll((Iterable) iterable, (List) this.updateFail_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUsecarcount(Iterable<? extends Integer> iterable) {
            ensureUsecarcountIsMutable();
            b.addAll((Iterable) iterable, (List) this.usecarcount_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBleconnect(int i) {
            ensureBleconnectIsMutable();
            this.bleconnect_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBlestatus(int i) {
            ensureBlestatusIsMutable();
            this.blestatus_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFlymode(int i) {
            ensureFlymodeIsMutable();
            this.flymode_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addGotoSportDetailPage(int i) {
            ensureGotoSportDetailPageIsMutable();
            this.gotoSportDetailPage_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLcdOff(int i) {
            ensureLcdOffIsMutable();
            this.lcdOff_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addModifypwd(int i) {
            ensureModifypwdIsMutable();
            this.modifypwd_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNFCstatus(int i) {
            ensureNFCstatusIsMutable();
            this.nFCstatus_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNotify(Event.NotifyMessage notifyMessage) {
            notifyMessage.getClass();
            ensureNotifyIsMutable();
            this.notify_.add(notifyMessage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOfflineAsrCmd(int i) {
            ensureOfflineAsrCmdIsMutable();
            this.offlineAsrCmd_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOfflineAsrFailOrSuccess(int i) {
            ensureOfflineAsrFailOrSuccessIsMutable();
            this.offlineAsrFailOrSuccess_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOfflineAsrModeInto(int i) {
            ensureOfflineAsrModeIntoIsMutable();
            this.offlineAsrModeInto_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOfflineAsrModeSelect(int i) {
            ensureOfflineAsrModeSelectIsMutable();
            this.offlineAsrModeSelect_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOffwristlock(int i) {
            ensureOffwristlockIsMutable();
            this.offwristlock_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOnlineVADActionType(int i) {
            ensureOnlineVADActionTypeIsMutable();
            this.onlineVADActionType_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOnlineVADRequest(int i) {
            ensureOnlineVADRequestIsMutable();
            this.onlineVADRequest_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOnlineVADStartType(int i) {
            ensureOnlineVADStartTypeIsMutable();
            this.onlineVADStartType_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPressureautomeasure(int i) {
            ensurePressureautomeasureIsMutable();
            this.pressureautomeasure_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPressuremeasureresult(int i) {
            ensurePressuremeasureresultIsMutable();
            this.pressuremeasureresult_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addQuickEntryApp(boolean z) {
            ensureQuickEntryAppIsMutable();
            this.quickEntryApp_.p(z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRatemeasure(int i) {
            ensureRatemeasureIsMutable();
            this.ratemeasure_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRingreminder(int i) {
            ensureRingreminderIsMutable();
            this.ringreminder_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addScheduledelete(int i) {
            ensureScheduledeleteIsMutable();
            this.scheduledelete_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSchedulereminderclick(int i) {
            ensureSchedulereminderclickIsMutable();
            this.schedulereminderclick_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSpo2Calc(int i) {
            ensureSpo2CalcIsMutable();
            this.spo2Calc_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSportIndoorCalibrate(int i) {
            ensureSportIndoorCalibrateIsMutable();
            this.sportIndoorCalibrate_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSportStatus(Event.SportStatusMessage sportStatusMessage) {
            sportStatusMessage.getClass();
            ensureSportStatusIsMutable();
            this.sportStatus_.add(sportStatusMessage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addTemperatureStatus(int i) {
            ensureTemperatureStatusIsMutable();
            this.temperatureStatus_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUnlock(int i) {
            ensureUnlockIsMutable();
            this.unlock_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUpdataerrscreen(int i) {
            ensureUpdataerrscreenIsMutable();
            this.updataerrscreen_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUpdataimmediatelyscreen(int i) {
            ensureUpdataimmediatelyscreenIsMutable();
            this.updataimmediatelyscreen_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUpdateFail(int i) {
            ensureUpdateFailIsMutable();
            this.updateFail_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUsecarcount(int i) {
            ensureUsecarcountIsMutable();
            this.usecarcount_.Q(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearActivityTarget() {
            this.bitField1_ &= -16385;
            this.activityTarget_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearActivityobjectives() {
            this.bitField3_ &= -129;
            this.activityobjectives_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddCardSuccess() {
            this.bitField1_ &= -129;
            this.addCardSuccess_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmreminder() {
            this.bitField2_ &= -2097153;
            this.alarmreminder_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmreminderclick() {
            this.alarmreminderclick_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayBindSuccessNum() {
            this.bitField0_ &= -67108865;
            this.alipayBindSuccessNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAplayscreen() {
            this.bitField3_ &= -5;
            this.aplayscreen_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearApplistTemperature() {
            this.bitField2_ &= -257;
            this.applistTemperature_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssistantTemperature() {
            this.bitField2_ &= -1025;
            this.assistantTemperature_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssistantVAD() {
            this.bitField3_ &= -33;
            this.assistantVAD_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssistantcarid() {
            this.bitField3_ &= -9;
            this.assistantcarid_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssistantinto() {
            this.bitField3_ &= -17;
            this.assistantinto_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAutoLight() {
            this.bitField1_ &= -8388609;
            this.autoLight_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAutoScreenOffTime() {
            this.bitField1_ &= -524289;
            this.autoScreenOffTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBaseRes() {
            this.baseRes_ = null;
            this.bitField2_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBatterySaverOff() {
            this.batterySaverOff_ = null;
            this.bitField1_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBatterySaverOn() {
            this.batterySaverOn_ = null;
            this.bitField1_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBindingSuccess() {
            this.bitField1_ &= -257;
            this.bindingSuccess_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBindsetlanguage() {
            this.bitField3_ &= -8388609;
            this.bindsetlanguage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBleconnect() {
            this.bleconnect_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBleconnectclose() {
            this.bitField2_ &= -33554433;
            this.bleconnectclose_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBleconnectfail() {
            this.bitField2_ &= -8388609;
            this.bleconnectfail_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBleconnectsuccess() {
            this.bitField2_ &= -4194305;
            this.bleconnectsuccess_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBlelistclick() {
            this.bitField2_ &= -16777217;
            this.blelistclick_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBlestatus() {
            this.blestatus_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearChangeBatteryValue() {
            this.bitField1_ &= -262145;
            this.changeBatteryValue_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClosewifi() {
            this.closewifi_ = null;
            this.bitField2_ &= -536870913;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCompassCalibrateSuccessNum() {
            this.bitField0_ &= -33554433;
            this.compassCalibrateSuccessNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountDownTimeup() {
            this.bitField1_ &= -2;
            this.countDownTimeup_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCoutdowntime() {
            this.bitField2_ &= -32769;
            this.coutdowntime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentDialId() {
            this.bitField1_ &= -16777217;
            this.currentDialId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCurrentDialNum() {
            this.bitField1_ &= -33554433;
            this.currentDialNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialchangemode() {
            this.bitField3_ &= -65;
            this.dialchangemode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialtool() {
            this.dialtool_ = null;
            this.bitField2_ &= -16385;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDndMode() {
            this.dndMode_ = null;
            this.bitField1_ &= -32769;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEventTimeUp() {
            this.bitField0_ &= -268435457;
            this.eventTimeUp_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFatDosfsck() {
            this.bitField1_ &= Integer.MAX_VALUE;
            this.fatDosfsck_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFatDropsize() {
            this.bitField1_ &= -268435457;
            this.fatDropsize_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFatDroptime() {
            this.bitField1_ &= -536870913;
            this.fatDroptime_ = 0L;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFatFormat() {
            this.bitField1_ &= -1073741825;
            this.fatFormat_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFatFreesize() {
            this.bitField1_ &= -134217729;
            this.fatFreesize_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFindPhone() {
            this.bitField1_ &= -17;
            this.findPhone_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFindmoblie() {
            this.bitField3_ &= -16385;
            this.findmoblie_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFirmware() {
            this.firmware_ = null;
            this.bitField2_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFlymode() {
            this.flymode_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFont() {
            this.font_ = null;
            this.bitField2_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearForgetWristOffLockPasswd() {
            this.bitField0_ &= Integer.MAX_VALUE;
            this.forgetWristOffLockPasswd_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotoActivityPage() {
            this.bitField0_ &= -8388609;
            this.gotoActivityPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotoAlarmPage() {
            this.bitField0_ &= -131073;
            this.gotoAlarmPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotoCompassPage() {
            this.bitField0_ &= -2;
            this.gotoCompassPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotoCountdownPage() {
            this.bitField0_ &= -1048577;
            this.gotoCountdownPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotoDialActivityPage() {
            this.bitField0_ &= -16777217;
            this.gotoDialActivityPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotoDialAlarmPage() {
            this.bitField0_ &= -262145;
            this.gotoDialAlarmPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotoDialAlipayPage() {
            this.bitField0_ &= -3;
            this.gotoDialAlipayPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotoDialEventPage() {
            this.bitField0_ &= -65537;
            this.gotoDialEventPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotoDialHeartPage() {
            this.bitField0_ &= -257;
            this.gotoDialHeartPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotoDialMusicPage() {
            this.bitField0_ &= -65;
            this.gotoDialMusicPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotoDialNfcCadePage() {
            this.bitField0_ &= -4194305;
            this.gotoDialNfcCadePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotoDialPaiPage() {
            this.bitField0_ &= -2049;
            this.gotoDialPaiPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotoDialSportPage() {
            this.bitField0_ &= -17;
            this.gotoDialSportPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotoDialWeatherPage() {
            this.bitField0_ &= -16385;
            this.gotoDialWeatherPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotoEventPage() {
            this.bitField0_ &= -32769;
            this.gotoEventPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotoHeartPage() {
            this.bitField0_ &= -129;
            this.gotoHeartPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotoMusicPage() {
            this.bitField0_ &= -33;
            this.gotoMusicPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotoNfcCardPage() {
            this.bitField0_ &= -2097153;
            this.gotoNfcCardPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotoPaiPage() {
            this.bitField0_ &= -1025;
            this.gotoPaiPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotoSpO2Page() {
            this.bitField0_ &= -513;
            this.gotoSpO2Page_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotoSportDetailPage() {
            this.gotoSportDetailPage_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotoSportHistory() {
            this.bitField0_ &= -5;
            this.gotoSportHistory_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotoSportPage() {
            this.bitField0_ &= -9;
            this.gotoSportPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotoStopwatchPage() {
            this.bitField0_ &= -524289;
            this.gotoStopwatchPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotoWeatherPage() {
            this.bitField0_ &= -4097;
            this.gotoWeatherPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotoWeatherSecondPage() {
            this.bitField0_ &= -8193;
            this.gotoWeatherSecondPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotosleep() {
            this.bitField3_ &= -32769;
            this.gotosleep_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotowakeup() {
            this.bitField3_ &= -65537;
            this.gotowakeup_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIncRes() {
            this.incRes_ = null;
            this.bitField2_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLanguageselect() {
            this.bitField2_ &= -67108865;
            this.languageselect_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLcdOff() {
            this.lcdOff_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLcdOnBecauseOfWrist() {
            this.bitField0_ &= -134217729;
            this.lcdOnBecauseOfWrist_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLcdOnBecauseOfWristStatus() {
            this.bitField1_ &= -1048577;
            this.lcdOnBecauseOfWristStatus_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLightscreentime() {
            this.lightscreentime_ = null;
            this.bitField2_ &= -134217729;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLightsetting() {
            this.bitField3_ &= -2049;
            this.lightsetting_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLockScreen() {
            this.bitField1_ &= -9;
            this.lockScreen_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearModifypwd() {
            this.modifypwd_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNFCstatus() {
            this.nFCstatus_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNandMessage() {
            this.nandMessage_ = null;
            this.bitField1_ &= -67108865;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNobindrecovery() {
            this.bitField3_ &= -2097153;
            this.nobindrecovery_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNobindsupervise() {
            this.bitField3_ &= -4194305;
            this.nobindsupervise_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotify() {
            this.notify_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOfflineAsrCmd() {
            this.offlineAsrCmd_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOfflineAsrFailOrSuccess() {
            this.offlineAsrFailOrSuccess_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOfflineAsrModeInto() {
            this.offlineAsrModeInto_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOfflineAsrModeSelect() {
            this.offlineAsrModeSelect_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOffwristlock() {
            this.offwristlock_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOnlineVADActionType() {
            this.onlineVADActionType_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOnlineVADRequest() {
            this.onlineVADRequest_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOnlineVADStartType() {
            this.onlineVADStartType_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPowerOff() {
            this.bitField1_ &= -1025;
            this.powerOff_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPowerOffBatteryValue() {
            this.bitField1_ &= -65537;
            this.powerOffBatteryValue_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPowerOnBatteryValue() {
            this.bitField1_ &= -131073;
            this.powerOnBatteryValue_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPressureautomeasure() {
            this.pressureautomeasure_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPressureinto() {
            this.bitField3_ &= -3;
            this.pressureinto_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPressuremeasureresult() {
            this.pressuremeasureresult_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQNEgps() {
            this.bitField2_ &= -33;
            this.qNEgps_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQNEinto() {
            this.bitField2_ &= -17;
            this.qNEinto_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQuickAccessApp() {
            this.bitField1_ &= -4194305;
            this.quickAccessApp_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQuickEntryApp() {
            this.quickEntryApp_ = GeneratedMessageLite.emptyBooleanList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRateabnormalreminder() {
            this.bitField3_ &= -4097;
            this.rateabnormalreminder_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRatemeasure() {
            this.ratemeasure_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRatewarnreminder() {
            this.bitField3_ &= -8193;
            this.ratewarnreminder_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRebootNum() {
            this.bitField1_ &= -513;
            this.rebootNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRecoverymode() {
            this.bitField2_ &= -262145;
            this.recoverymode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemindershock() {
            this.bitField2_ &= -2049;
            this.remindershock_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReminderstand() {
            this.bitField2_ &= -65537;
            this.reminderstand_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReminderstandcomplete() {
            this.bitField2_ &= -131073;
            this.reminderstandcomplete_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRingreminder() {
            this.ringreminder_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScheduledelete() {
            this.scheduledelete_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearScheduleedit() {
            this.bitField3_ &= -1025;
            this.scheduleedit_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSchedulereminderclick() {
            this.schedulereminderclick_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSeePAIexplain() {
            this.bitField2_ &= -8193;
            this.seePAIexplain_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSeePAIrate() {
            this.bitField2_ &= -4097;
            this.seePAIrate_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSetAlarm() {
            this.bitField0_ &= -536870913;
            this.setAlarm_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSleepgoal() {
            this.bitField3_ &= -262145;
            this.sleepgoal_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSleepreminder() {
            this.bitField3_ &= -1048577;
            this.sleepreminder_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSleepscreen() {
            this.bitField3_ &= -131073;
            this.sleepscreen_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSleepstop() {
            this.bitField3_ &= -524289;
            this.sleepstop_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSpo2Calc() {
            this.spo2Calc_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportIndoorCalibrate() {
            this.sportIndoorCalibrate_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportStatus() {
            this.sportStatus_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportremindersave() {
            this.bitField3_ &= -33554433;
            this.sportremindersave_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartwifi() {
            this.startwifi_ = null;
            this.bitField2_ &= -268435457;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStopwatchreset() {
            this.bitField3_ &= -513;
            this.stopwatchreset_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStopwatchstart() {
            this.bitField3_ &= -257;
            this.stopwatchstart_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSwimPoolLength() {
            this.bitField1_ &= -8193;
            this.swimPoolLength_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSysVibration() {
            this.bitField2_ &= -65;
            this.sysVibration_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSystemUpdateCancle() {
            this.bitField1_ &= -4097;
            this.systemUpdateCancle_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSystemUpdateImmediately() {
            this.bitField1_ &= -2049;
            this.systemUpdateImmediately_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTemperatureStatus() {
            this.temperatureStatus_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTurnOnTheaterMode() {
            this.bitField1_ &= -33;
            this.turnOnTheaterMode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTurnOnkeepWatchAwake() {
            this.bitField1_ &= -65;
            this.turnOnkeepWatchAwake_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUnlock() {
            this.unlock_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpdataerrscreen() {
            this.updataerrscreen_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpdataimmediatelyscreen() {
            this.updataimmediatelyscreen_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpdateFail() {
            this.updateFail_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpdatebyuser() {
            this.bitField3_ &= -16777217;
            this.updatebyuser_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUseStopwatch() {
            this.bitField0_ &= -1073741825;
            this.useStopwatch_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUsecarcount() {
            this.usecarcount_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVicescreenTemperature() {
            this.bitField2_ &= -513;
            this.vicescreenTemperature_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVolbycontrol() {
            this.bitField2_ &= -1048577;
            this.volbycontrol_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVolbysetting() {
            this.bitField3_ &= -2;
            this.volbysetting_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVolsetcount() {
            this.bitField2_ &= -524289;
            this.volsetcount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWatchdir() {
            this.bitField2_ &= -129;
            this.watchdir_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWifiTipspage() {
            this.bitField2_ &= -1073741825;
            this.wifiTipspage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWifipwdcorrect() {
            this.bitField2_ &= Integer.MAX_VALUE;
            this.wifipwdcorrect_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWristOffLockStatus() {
            this.bitField1_ &= -2097153;
            this.wristOffLockStatus_ = false;
        }

        private void ensureAlarmreminderclickIsMutable() {
            d0.g gVar = this.alarmreminderclick_;
            if (gVar.c()) {
                return;
            }
            this.alarmreminderclick_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureBleconnectIsMutable() {
            d0.g gVar = this.bleconnect_;
            if (gVar.c()) {
                return;
            }
            this.bleconnect_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureBlestatusIsMutable() {
            d0.g gVar = this.blestatus_;
            if (gVar.c()) {
                return;
            }
            this.blestatus_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureFlymodeIsMutable() {
            d0.g gVar = this.flymode_;
            if (gVar.c()) {
                return;
            }
            this.flymode_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureGotoSportDetailPageIsMutable() {
            d0.g gVar = this.gotoSportDetailPage_;
            if (gVar.c()) {
                return;
            }
            this.gotoSportDetailPage_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureLcdOffIsMutable() {
            d0.g gVar = this.lcdOff_;
            if (gVar.c()) {
                return;
            }
            this.lcdOff_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureModifypwdIsMutable() {
            d0.g gVar = this.modifypwd_;
            if (gVar.c()) {
                return;
            }
            this.modifypwd_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureNFCstatusIsMutable() {
            d0.g gVar = this.nFCstatus_;
            if (gVar.c()) {
                return;
            }
            this.nFCstatus_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureNotifyIsMutable() {
            d0.i<Event.NotifyMessage> iVar = this.notify_;
            if (iVar.c()) {
                return;
            }
            this.notify_ = GeneratedMessageLite.mutableCopy(iVar);
        }

        private void ensureOfflineAsrCmdIsMutable() {
            d0.g gVar = this.offlineAsrCmd_;
            if (gVar.c()) {
                return;
            }
            this.offlineAsrCmd_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureOfflineAsrFailOrSuccessIsMutable() {
            d0.g gVar = this.offlineAsrFailOrSuccess_;
            if (gVar.c()) {
                return;
            }
            this.offlineAsrFailOrSuccess_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureOfflineAsrModeIntoIsMutable() {
            d0.g gVar = this.offlineAsrModeInto_;
            if (gVar.c()) {
                return;
            }
            this.offlineAsrModeInto_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureOfflineAsrModeSelectIsMutable() {
            d0.g gVar = this.offlineAsrModeSelect_;
            if (gVar.c()) {
                return;
            }
            this.offlineAsrModeSelect_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureOffwristlockIsMutable() {
            d0.g gVar = this.offwristlock_;
            if (gVar.c()) {
                return;
            }
            this.offwristlock_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureOnlineVADActionTypeIsMutable() {
            d0.g gVar = this.onlineVADActionType_;
            if (gVar.c()) {
                return;
            }
            this.onlineVADActionType_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureOnlineVADRequestIsMutable() {
            d0.g gVar = this.onlineVADRequest_;
            if (gVar.c()) {
                return;
            }
            this.onlineVADRequest_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureOnlineVADStartTypeIsMutable() {
            d0.g gVar = this.onlineVADStartType_;
            if (gVar.c()) {
                return;
            }
            this.onlineVADStartType_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensurePressureautomeasureIsMutable() {
            d0.g gVar = this.pressureautomeasure_;
            if (gVar.c()) {
                return;
            }
            this.pressureautomeasure_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensurePressuremeasureresultIsMutable() {
            d0.g gVar = this.pressuremeasureresult_;
            if (gVar.c()) {
                return;
            }
            this.pressuremeasureresult_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureQuickEntryAppIsMutable() {
            d0.a aVar = this.quickEntryApp_;
            if (aVar.c()) {
                return;
            }
            this.quickEntryApp_ = GeneratedMessageLite.mutableCopy(aVar);
        }

        private void ensureRatemeasureIsMutable() {
            d0.g gVar = this.ratemeasure_;
            if (gVar.c()) {
                return;
            }
            this.ratemeasure_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureRingreminderIsMutable() {
            d0.g gVar = this.ringreminder_;
            if (gVar.c()) {
                return;
            }
            this.ringreminder_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureScheduledeleteIsMutable() {
            d0.g gVar = this.scheduledelete_;
            if (gVar.c()) {
                return;
            }
            this.scheduledelete_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureSchedulereminderclickIsMutable() {
            d0.g gVar = this.schedulereminderclick_;
            if (gVar.c()) {
                return;
            }
            this.schedulereminderclick_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureSpo2CalcIsMutable() {
            d0.g gVar = this.spo2Calc_;
            if (gVar.c()) {
                return;
            }
            this.spo2Calc_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureSportIndoorCalibrateIsMutable() {
            d0.g gVar = this.sportIndoorCalibrate_;
            if (gVar.c()) {
                return;
            }
            this.sportIndoorCalibrate_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureSportStatusIsMutable() {
            d0.i<Event.SportStatusMessage> iVar = this.sportStatus_;
            if (iVar.c()) {
                return;
            }
            this.sportStatus_ = GeneratedMessageLite.mutableCopy(iVar);
        }

        private void ensureTemperatureStatusIsMutable() {
            d0.g gVar = this.temperatureStatus_;
            if (gVar.c()) {
                return;
            }
            this.temperatureStatus_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureUnlockIsMutable() {
            d0.g gVar = this.unlock_;
            if (gVar.c()) {
                return;
            }
            this.unlock_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureUpdataerrscreenIsMutable() {
            d0.g gVar = this.updataerrscreen_;
            if (gVar.c()) {
                return;
            }
            this.updataerrscreen_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureUpdataimmediatelyscreenIsMutable() {
            d0.g gVar = this.updataimmediatelyscreen_;
            if (gVar.c()) {
                return;
            }
            this.updataimmediatelyscreen_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureUpdateFailIsMutable() {
            d0.g gVar = this.updateFail_;
            if (gVar.c()) {
                return;
            }
            this.updateFail_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        private void ensureUsecarcountIsMutable() {
            d0.g gVar = this.usecarcount_;
            if (gVar.c()) {
                return;
            }
            this.usecarcount_ = GeneratedMessageLite.mutableCopy(gVar);
        }

        public static hamburgEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBaseRes(Event.DfuUpgradeMessage dfuUpgradeMessage) {
            dfuUpgradeMessage.getClass();
            Event.DfuUpgradeMessage dfuUpgradeMessage2 = this.baseRes_;
            if (dfuUpgradeMessage2 == null || dfuUpgradeMessage2 == Event.DfuUpgradeMessage.getDefaultInstance()) {
                this.baseRes_ = dfuUpgradeMessage;
            } else {
                this.baseRes_ = Event.DfuUpgradeMessage.newBuilder(this.baseRes_).mergeFrom(dfuUpgradeMessage).buildPartial();
            }
            this.bitField2_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBatterySaverOff(Event.BatterySaverMode batterySaverMode) {
            batterySaverMode.getClass();
            Event.BatterySaverMode batterySaverMode2 = this.batterySaverOff_;
            if (batterySaverMode2 == null || batterySaverMode2 == Event.BatterySaverMode.getDefaultInstance()) {
                this.batterySaverOff_ = batterySaverMode;
            } else {
                this.batterySaverOff_ = Event.BatterySaverMode.newBuilder(this.batterySaverOff_).mergeFrom(batterySaverMode).buildPartial();
            }
            this.bitField1_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBatterySaverOn(Event.BatterySaverMode batterySaverMode) {
            batterySaverMode.getClass();
            Event.BatterySaverMode batterySaverMode2 = this.batterySaverOn_;
            if (batterySaverMode2 == null || batterySaverMode2 == Event.BatterySaverMode.getDefaultInstance()) {
                this.batterySaverOn_ = batterySaverMode;
            } else {
                this.batterySaverOn_ = Event.BatterySaverMode.newBuilder(this.batterySaverOn_).mergeFrom(batterySaverMode).buildPartial();
            }
            this.bitField1_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeClosewifi(Event.wifiuseMessage wifiusemessage) {
            wifiusemessage.getClass();
            Event.wifiuseMessage wifiusemessage2 = this.closewifi_;
            if (wifiusemessage2 == null || wifiusemessage2 == Event.wifiuseMessage.getDefaultInstance()) {
                this.closewifi_ = wifiusemessage;
            } else {
                this.closewifi_ = Event.wifiuseMessage.newBuilder(this.closewifi_).mergeFrom(wifiusemessage).buildPartial();
            }
            this.bitField2_ |= 536870912;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDialtool(Event.DialtoolMessage dialtoolMessage) {
            dialtoolMessage.getClass();
            Event.DialtoolMessage dialtoolMessage2 = this.dialtool_;
            if (dialtoolMessage2 == null || dialtoolMessage2 == Event.DialtoolMessage.getDefaultInstance()) {
                this.dialtool_ = dialtoolMessage;
            } else {
                this.dialtool_ = Event.DialtoolMessage.newBuilder(this.dialtool_).mergeFrom(dialtoolMessage).buildPartial();
            }
            this.bitField2_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDndMode(Event.DndEventMessage dndEventMessage) {
            dndEventMessage.getClass();
            Event.DndEventMessage dndEventMessage2 = this.dndMode_;
            if (dndEventMessage2 == null || dndEventMessage2 == Event.DndEventMessage.getDefaultInstance()) {
                this.dndMode_ = dndEventMessage;
            } else {
                this.dndMode_ = Event.DndEventMessage.newBuilder(this.dndMode_).mergeFrom(dndEventMessage).buildPartial();
            }
            this.bitField1_ |= 32768;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFirmware(Event.DfuUpgradeMessage dfuUpgradeMessage) {
            dfuUpgradeMessage.getClass();
            Event.DfuUpgradeMessage dfuUpgradeMessage2 = this.firmware_;
            if (dfuUpgradeMessage2 == null || dfuUpgradeMessage2 == Event.DfuUpgradeMessage.getDefaultInstance()) {
                this.firmware_ = dfuUpgradeMessage;
            } else {
                this.firmware_ = Event.DfuUpgradeMessage.newBuilder(this.firmware_).mergeFrom(dfuUpgradeMessage).buildPartial();
            }
            this.bitField2_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFont(Event.DfuUpgradeMessage dfuUpgradeMessage) {
            dfuUpgradeMessage.getClass();
            Event.DfuUpgradeMessage dfuUpgradeMessage2 = this.font_;
            if (dfuUpgradeMessage2 == null || dfuUpgradeMessage2 == Event.DfuUpgradeMessage.getDefaultInstance()) {
                this.font_ = dfuUpgradeMessage;
            } else {
                this.font_ = Event.DfuUpgradeMessage.newBuilder(this.font_).mergeFrom(dfuUpgradeMessage).buildPartial();
            }
            this.bitField2_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeIncRes(Event.DfuUpgradeMessage dfuUpgradeMessage) {
            dfuUpgradeMessage.getClass();
            Event.DfuUpgradeMessage dfuUpgradeMessage2 = this.incRes_;
            if (dfuUpgradeMessage2 == null || dfuUpgradeMessage2 == Event.DfuUpgradeMessage.getDefaultInstance()) {
                this.incRes_ = dfuUpgradeMessage;
            } else {
                this.incRes_ = Event.DfuUpgradeMessage.newBuilder(this.incRes_).mergeFrom(dfuUpgradeMessage).buildPartial();
            }
            this.bitField2_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLightscreentime(Event.lightscreentimeMessage lightscreentimemessage) {
            lightscreentimemessage.getClass();
            Event.lightscreentimeMessage lightscreentimemessage2 = this.lightscreentime_;
            if (lightscreentimemessage2 == null || lightscreentimemessage2 == Event.lightscreentimeMessage.getDefaultInstance()) {
                this.lightscreentime_ = lightscreentimemessage;
            } else {
                this.lightscreentime_ = Event.lightscreentimeMessage.newBuilder(this.lightscreentime_).mergeFrom(lightscreentimemessage).buildPartial();
            }
            this.bitField2_ |= 134217728;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNandMessage(Event.NandMessage nandMessage) {
            nandMessage.getClass();
            Event.NandMessage nandMessage2 = this.nandMessage_;
            if (nandMessage2 == null || nandMessage2 == Event.NandMessage.getDefaultInstance()) {
                this.nandMessage_ = nandMessage;
            } else {
                this.nandMessage_ = Event.NandMessage.newBuilder(this.nandMessage_).mergeFrom(nandMessage).buildPartial();
            }
            this.bitField1_ |= 67108864;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStartwifi(Event.wifiuseMessage wifiusemessage) {
            wifiusemessage.getClass();
            Event.wifiuseMessage wifiusemessage2 = this.startwifi_;
            if (wifiusemessage2 == null || wifiusemessage2 == Event.wifiuseMessage.getDefaultInstance()) {
                this.startwifi_ = wifiusemessage;
            } else {
                this.startwifi_ = Event.wifiuseMessage.newBuilder(this.startwifi_).mergeFrom(wifiusemessage).buildPartial();
            }
            this.bitField2_ |= 268435456;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static hamburgEventMessage parseDelimitedFrom(InputStream inputStream) {
            return (hamburgEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static hamburgEventMessage parseFrom(ByteBuffer byteBuffer) {
            return (hamburgEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<hamburgEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeNotify(int i) {
            ensureNotifyIsMutable();
            this.notify_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeSportStatus(int i) {
            ensureSportStatusIsMutable();
            this.sportStatus_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActivityTarget(int i) {
            this.bitField1_ |= 16384;
            this.activityTarget_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActivityobjectives(int i) {
            this.bitField3_ |= 128;
            this.activityobjectives_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddCardSuccess(int i) {
            this.bitField1_ |= 128;
            this.addCardSuccess_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmreminder(int i) {
            this.bitField2_ |= 2097152;
            this.alarmreminder_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmreminderclick(int i, int i2) {
            ensureAlarmreminderclickIsMutable();
            this.alarmreminderclick_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayBindSuccessNum(int i) {
            this.bitField0_ |= 67108864;
            this.alipayBindSuccessNum_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAplayscreen(int i) {
            this.bitField3_ |= 4;
            this.aplayscreen_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setApplistTemperature(int i) {
            this.bitField2_ |= 256;
            this.applistTemperature_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssistantTemperature(int i) {
            this.bitField2_ |= 1024;
            this.assistantTemperature_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssistantVAD(int i) {
            this.bitField3_ |= 32;
            this.assistantVAD_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssistantcarid(int i) {
            this.bitField3_ |= 8;
            this.assistantcarid_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssistantinto(int i) {
            this.bitField3_ |= 16;
            this.assistantinto_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAutoLight(boolean z) {
            this.bitField1_ |= NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
            this.autoLight_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAutoScreenOffTime(int i) {
            this.bitField1_ |= 524288;
            this.autoScreenOffTime_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseRes(Event.DfuUpgradeMessage dfuUpgradeMessage) {
            dfuUpgradeMessage.getClass();
            this.baseRes_ = dfuUpgradeMessage;
            this.bitField2_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBatterySaverOff(Event.BatterySaverMode batterySaverMode) {
            batterySaverMode.getClass();
            this.batterySaverOff_ = batterySaverMode;
            this.bitField1_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBatterySaverOn(Event.BatterySaverMode batterySaverMode) {
            batterySaverMode.getClass();
            this.batterySaverOn_ = batterySaverMode;
            this.bitField1_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBindingSuccess(int i) {
            this.bitField1_ |= 256;
            this.bindingSuccess_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBindsetlanguage(int i) {
            this.bitField3_ |= NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
            this.bindsetlanguage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBleconnect(int i, int i2) {
            ensureBleconnectIsMutable();
            this.bleconnect_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBleconnectclose(int i) {
            this.bitField2_ |= 33554432;
            this.bleconnectclose_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBleconnectfail(int i) {
            this.bitField2_ |= NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
            this.bleconnectfail_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBleconnectsuccess(int i) {
            this.bitField2_ |= 4194304;
            this.bleconnectsuccess_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBlelistclick(int i) {
            this.bitField2_ |= 16777216;
            this.blelistclick_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBlestatus(int i, int i2) {
            ensureBlestatusIsMutable();
            this.blestatus_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChangeBatteryValue(int i) {
            this.bitField1_ |= 262144;
            this.changeBatteryValue_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClosewifi(Event.wifiuseMessage wifiusemessage) {
            wifiusemessage.getClass();
            this.closewifi_ = wifiusemessage;
            this.bitField2_ |= 536870912;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCompassCalibrateSuccessNum(int i) {
            this.bitField0_ |= 33554432;
            this.compassCalibrateSuccessNum_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountDownTimeup(int i) {
            this.bitField1_ |= 1;
            this.countDownTimeup_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCoutdowntime(int i) {
            this.bitField2_ |= 32768;
            this.coutdowntime_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentDialId(int i) {
            this.bitField1_ |= 16777216;
            this.currentDialId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentDialNum(int i) {
            this.bitField1_ |= 33554432;
            this.currentDialNum_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialchangemode(int i) {
            this.bitField3_ |= 64;
            this.dialchangemode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialtool(Event.DialtoolMessage dialtoolMessage) {
            dialtoolMessage.getClass();
            this.dialtool_ = dialtoolMessage;
            this.bitField2_ |= 16384;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDndMode(Event.DndEventMessage dndEventMessage) {
            dndEventMessage.getClass();
            this.dndMode_ = dndEventMessage;
            this.bitField1_ |= 32768;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventTimeUp(int i) {
            this.bitField0_ |= 268435456;
            this.eventTimeUp_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFatDosfsck(int i) {
            this.bitField1_ |= Integer.MIN_VALUE;
            this.fatDosfsck_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFatDropsize(int i) {
            this.bitField1_ |= 268435456;
            this.fatDropsize_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFatDroptime(long j) {
            this.bitField1_ |= 536870912;
            this.fatDroptime_ = j;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFatFormat(int i) {
            this.bitField1_ |= 1073741824;
            this.fatFormat_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFatFreesize(int i) {
            this.bitField1_ |= 134217728;
            this.fatFreesize_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFindPhone(int i) {
            this.bitField1_ |= 16;
            this.findPhone_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFindmoblie(int i) {
            this.bitField3_ |= 16384;
            this.findmoblie_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFirmware(Event.DfuUpgradeMessage dfuUpgradeMessage) {
            dfuUpgradeMessage.getClass();
            this.firmware_ = dfuUpgradeMessage;
            this.bitField2_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlymode(int i, int i2) {
            ensureFlymodeIsMutable();
            this.flymode_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFont(Event.DfuUpgradeMessage dfuUpgradeMessage) {
            dfuUpgradeMessage.getClass();
            this.font_ = dfuUpgradeMessage;
            this.bitField2_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setForgetWristOffLockPasswd(int i) {
            this.bitField0_ |= Integer.MIN_VALUE;
            this.forgetWristOffLockPasswd_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoActivityPage(int i) {
            this.bitField0_ |= NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
            this.gotoActivityPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoAlarmPage(int i) {
            this.bitField0_ |= 131072;
            this.gotoAlarmPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoCompassPage(int i) {
            this.bitField0_ |= 1;
            this.gotoCompassPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoCountdownPage(int i) {
            this.bitField0_ |= EventRecurrence.TH;
            this.gotoCountdownPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoDialActivityPage(int i) {
            this.bitField0_ |= 16777216;
            this.gotoDialActivityPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoDialAlarmPage(int i) {
            this.bitField0_ |= 262144;
            this.gotoDialAlarmPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoDialAlipayPage(int i) {
            this.bitField0_ |= 2;
            this.gotoDialAlipayPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoDialEventPage(int i) {
            this.bitField0_ |= 65536;
            this.gotoDialEventPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoDialHeartPage(int i) {
            this.bitField0_ |= 256;
            this.gotoDialHeartPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoDialMusicPage(int i) {
            this.bitField0_ |= 64;
            this.gotoDialMusicPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoDialNfcCadePage(int i) {
            this.bitField0_ |= 4194304;
            this.gotoDialNfcCadePage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoDialPaiPage(int i) {
            this.bitField0_ |= 2048;
            this.gotoDialPaiPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoDialSportPage(int i) {
            this.bitField0_ |= 16;
            this.gotoDialSportPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoDialWeatherPage(int i) {
            this.bitField0_ |= 16384;
            this.gotoDialWeatherPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoEventPage(int i) {
            this.bitField0_ |= 32768;
            this.gotoEventPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoHeartPage(int i) {
            this.bitField0_ |= 128;
            this.gotoHeartPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoMusicPage(int i) {
            this.bitField0_ |= 32;
            this.gotoMusicPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoNfcCardPage(int i) {
            this.bitField0_ |= 2097152;
            this.gotoNfcCardPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoPaiPage(int i) {
            this.bitField0_ |= 1024;
            this.gotoPaiPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoSpO2Page(int i) {
            this.bitField0_ |= 512;
            this.gotoSpO2Page_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoSportDetailPage(int i, int i2) {
            ensureGotoSportDetailPageIsMutable();
            this.gotoSportDetailPage_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoSportHistory(int i) {
            this.bitField0_ |= 4;
            this.gotoSportHistory_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoSportPage(int i) {
            this.bitField0_ |= 8;
            this.gotoSportPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoStopwatchPage(int i) {
            this.bitField0_ |= 524288;
            this.gotoStopwatchPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoWeatherPage(int i) {
            this.bitField0_ |= 4096;
            this.gotoWeatherPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoWeatherSecondPage(int i) {
            this.bitField0_ |= 8192;
            this.gotoWeatherSecondPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotosleep(int i) {
            this.bitField3_ |= 32768;
            this.gotosleep_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotowakeup(int i) {
            this.bitField3_ |= 65536;
            this.gotowakeup_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIncRes(Event.DfuUpgradeMessage dfuUpgradeMessage) {
            dfuUpgradeMessage.getClass();
            this.incRes_ = dfuUpgradeMessage;
            this.bitField2_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguageselect(int i) {
            this.bitField2_ |= 67108864;
            this.languageselect_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOff(int i, int i2) {
            ensureLcdOffIsMutable();
            this.lcdOff_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOnBecauseOfWrist(int i) {
            this.bitField0_ |= 134217728;
            this.lcdOnBecauseOfWrist_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOnBecauseOfWristStatus(int i) {
            this.bitField1_ |= EventRecurrence.TH;
            this.lcdOnBecauseOfWristStatus_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLightscreentime(Event.lightscreentimeMessage lightscreentimemessage) {
            lightscreentimemessage.getClass();
            this.lightscreentime_ = lightscreentimemessage;
            this.bitField2_ |= 134217728;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLightsetting(int i) {
            this.bitField3_ |= 2048;
            this.lightsetting_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLockScreen(int i) {
            this.bitField1_ |= 8;
            this.lockScreen_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModifypwd(int i, int i2) {
            ensureModifypwdIsMutable();
            this.modifypwd_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNFCstatus(int i, int i2) {
            ensureNFCstatusIsMutable();
            this.nFCstatus_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNandMessage(Event.NandMessage nandMessage) {
            nandMessage.getClass();
            this.nandMessage_ = nandMessage;
            this.bitField1_ |= 67108864;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNobindrecovery(int i) {
            this.bitField3_ |= 2097152;
            this.nobindrecovery_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNobindsupervise(int i) {
            this.bitField3_ |= 4194304;
            this.nobindsupervise_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotify(int i, Event.NotifyMessage notifyMessage) {
            notifyMessage.getClass();
            ensureNotifyIsMutable();
            this.notify_.set(i, notifyMessage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOfflineAsrCmd(int i, int i2) {
            ensureOfflineAsrCmdIsMutable();
            this.offlineAsrCmd_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOfflineAsrFailOrSuccess(int i, int i2) {
            ensureOfflineAsrFailOrSuccessIsMutable();
            this.offlineAsrFailOrSuccess_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOfflineAsrModeInto(int i, int i2) {
            ensureOfflineAsrModeIntoIsMutable();
            this.offlineAsrModeInto_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOfflineAsrModeSelect(int i, int i2) {
            ensureOfflineAsrModeSelectIsMutable();
            this.offlineAsrModeSelect_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOffwristlock(int i, int i2) {
            ensureOffwristlockIsMutable();
            this.offwristlock_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOnlineVADActionType(int i, int i2) {
            ensureOnlineVADActionTypeIsMutable();
            this.onlineVADActionType_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOnlineVADRequest(int i, int i2) {
            ensureOnlineVADRequestIsMutable();
            this.onlineVADRequest_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOnlineVADStartType(int i, int i2) {
            ensureOnlineVADStartTypeIsMutable();
            this.onlineVADStartType_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPowerOff(int i) {
            this.bitField1_ |= 1024;
            this.powerOff_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPowerOffBatteryValue(int i) {
            this.bitField1_ |= 65536;
            this.powerOffBatteryValue_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPowerOnBatteryValue(int i) {
            this.bitField1_ |= 131072;
            this.powerOnBatteryValue_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPressureautomeasure(int i, int i2) {
            ensurePressureautomeasureIsMutable();
            this.pressureautomeasure_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPressureinto(int i) {
            this.bitField3_ |= 2;
            this.pressureinto_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPressuremeasureresult(int i, int i2) {
            ensurePressuremeasureresultIsMutable();
            this.pressuremeasureresult_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQNEgps(int i) {
            this.bitField2_ |= 32;
            this.qNEgps_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQNEinto(int i) {
            this.bitField2_ |= 16;
            this.qNEinto_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuickAccessApp(int i) {
            this.bitField1_ |= 4194304;
            this.quickAccessApp_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuickEntryApp(int i, boolean z) {
            ensureQuickEntryAppIsMutable();
            this.quickEntryApp_.s(i, z);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRateabnormalreminder(int i) {
            this.bitField3_ |= 4096;
            this.rateabnormalreminder_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRatemeasure(int i, int i2) {
            ensureRatemeasureIsMutable();
            this.ratemeasure_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRatewarnreminder(int i) {
            this.bitField3_ |= 8192;
            this.ratewarnreminder_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRebootNum(int i) {
            this.bitField1_ |= 512;
            this.rebootNum_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRecoverymode(int i) {
            this.bitField2_ |= 262144;
            this.recoverymode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemindershock(int i) {
            this.bitField2_ |= 2048;
            this.remindershock_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReminderstand(int i) {
            this.bitField2_ |= 65536;
            this.reminderstand_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReminderstandcomplete(int i) {
            this.bitField2_ |= 131072;
            this.reminderstandcomplete_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRingreminder(int i, int i2) {
            ensureRingreminderIsMutable();
            this.ringreminder_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScheduledelete(int i, int i2) {
            ensureScheduledeleteIsMutable();
            this.scheduledelete_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScheduleedit(int i) {
            this.bitField3_ |= 1024;
            this.scheduleedit_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSchedulereminderclick(int i, int i2) {
            ensureSchedulereminderclickIsMutable();
            this.schedulereminderclick_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSeePAIexplain(int i) {
            this.bitField2_ |= 8192;
            this.seePAIexplain_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSeePAIrate(int i) {
            this.bitField2_ |= 4096;
            this.seePAIrate_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSetAlarm(int i) {
            this.bitField0_ |= 536870912;
            this.setAlarm_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSleepgoal(int i) {
            this.bitField3_ |= 262144;
            this.sleepgoal_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSleepreminder(int i) {
            this.bitField3_ |= EventRecurrence.TH;
            this.sleepreminder_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSleepscreen(int i) {
            this.bitField3_ |= 131072;
            this.sleepscreen_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSleepstop(int i) {
            this.bitField3_ |= 524288;
            this.sleepstop_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpo2Calc(int i, int i2) {
            ensureSpo2CalcIsMutable();
            this.spo2Calc_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportIndoorCalibrate(int i, int i2) {
            ensureSportIndoorCalibrateIsMutable();
            this.sportIndoorCalibrate_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportStatus(int i, Event.SportStatusMessage sportStatusMessage) {
            sportStatusMessage.getClass();
            ensureSportStatusIsMutable();
            this.sportStatus_.set(i, sportStatusMessage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportremindersave(int i) {
            this.bitField3_ |= 33554432;
            this.sportremindersave_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartwifi(Event.wifiuseMessage wifiusemessage) {
            wifiusemessage.getClass();
            this.startwifi_ = wifiusemessage;
            this.bitField2_ |= 268435456;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopwatchreset(int i) {
            this.bitField3_ |= 512;
            this.stopwatchreset_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopwatchstart(int i) {
            this.bitField3_ |= 256;
            this.stopwatchstart_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwimPoolLength(int i) {
            this.bitField1_ |= 8192;
            this.swimPoolLength_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSysVibration(boolean z) {
            this.bitField2_ |= 64;
            this.sysVibration_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSystemUpdateCancle(int i) {
            this.bitField1_ |= 4096;
            this.systemUpdateCancle_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSystemUpdateImmediately(int i) {
            this.bitField1_ |= 2048;
            this.systemUpdateImmediately_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTemperatureStatus(int i, int i2) {
            ensureTemperatureStatusIsMutable();
            this.temperatureStatus_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTurnOnTheaterMode(int i) {
            this.bitField1_ |= 32;
            this.turnOnTheaterMode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTurnOnkeepWatchAwake(int i) {
            this.bitField1_ |= 64;
            this.turnOnkeepWatchAwake_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnlock(int i, int i2) {
            ensureUnlockIsMutable();
            this.unlock_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdataerrscreen(int i, int i2) {
            ensureUpdataerrscreenIsMutable();
            this.updataerrscreen_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdataimmediatelyscreen(int i, int i2) {
            ensureUpdataimmediatelyscreenIsMutable();
            this.updataimmediatelyscreen_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdateFail(int i, int i2) {
            ensureUpdateFailIsMutable();
            this.updateFail_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdatebyuser(int i) {
            this.bitField3_ |= 16777216;
            this.updatebyuser_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUseStopwatch(int i) {
            this.bitField0_ |= 1073741824;
            this.useStopwatch_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUsecarcount(int i, int i2) {
            ensureUsecarcountIsMutable();
            this.usecarcount_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVicescreenTemperature(int i) {
            this.bitField2_ |= 512;
            this.vicescreenTemperature_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVolbycontrol(int i) {
            this.bitField2_ |= EventRecurrence.TH;
            this.volbycontrol_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVolbysetting(int i) {
            this.bitField3_ |= 1;
            this.volbysetting_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVolsetcount(int i) {
            this.bitField2_ |= 524288;
            this.volsetcount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWatchdir(boolean z) {
            this.bitField2_ |= 128;
            this.watchdir_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWifiTipspage(int i) {
            this.bitField2_ |= 1073741824;
            this.wifiTipspage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWifipwdcorrect(int i) {
            this.bitField2_ |= Integer.MIN_VALUE;
            this.wifipwdcorrect_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWristOffLockStatus(boolean z) {
            this.bitField1_ |= 2097152;
            this.wristOffLockStatus_ = z;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new hamburgEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u009b\u0000\u0004\u0001\u009b\u009b\u0000!Q\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004\u001d\u0005ᔋ\u0003\u0006ᔋ\u0004\u0007ᔋ\u0005\bᔋ\u0006\tᔋ\u0007\nᔋ\b\u000bᔋ\t\fᔋ\n\rᔋ\u000b\u000eᔋ\f\u000fᔋ\r\u0010ᔋ\u000e\u0011ᔋ\u000f\u0012ᔋ\u0010\u0013ᔋ\u0011\u0014ᔋ\u0012\u0015ᔋ\u0013\u0016ᔋ\u0014\u0017ᔋ\u0015\u0018ᔋ\u0016\u0019ᔋ\u0017\u001aᔋ\u0018\u001bЛ\u001cᔋ\u0019\u001dᔋ\u001a\u001e\u001d\u001fᔋ\u001b \u001d!ᔋ\u001c\"\u001d#ᔋ\u001d$ᔋ\u001e%ᔋ\u001f&ᔋ 'ᔉ!(ᔉ\")ᔋ#*ᔋ$+ᔋ%,ᔋ&-ᔋ'.ᔋ(/ᔋ)0ᔋ*1ᔋ+2ᔋ,3\u001d4Л5\u001d6ᔋ-7ᔋ.8ᔉ/9ᔋ0:ᔋ1;ᔋ2<ᔋ3=ᔋ4>ᔇ5?ᔋ6@\u0019Aᔇ7Bᔋ8Cᔋ9Dᔉ:Eᔋ;Fᔄ<Gᔃ=Hᔋ>Iᔋ?Jᔉ@KᔉALᔉBMᔉCNᔋDOᔋEPᔇFQᔇGRᔋHSᔋITᔋJU\u001dV\u001dW\u001dX\u001dY\u001dZ\u001d[\u001d\\\u001d]\u001d^\u001d_ဋK`ဋLaဋMbᐉNcဋOdဋPeဋQfဋRg\u001dhဋSiဋTj\u001dkဋUl\u001dm\u001dn\u001do\u001dp\u001dqဋVrဋWsဋXtဋYu\u001dv\u001dw\u001dxဋZyᐉ[zᐉ\\{ᐉ]|ဋ^}ဋ_~ဋ`\u007f\u001d\u0080ဋa\u0081\u001d\u0082\u001d\u0083ဋb\u0084ဋc\u0085ဋd\u0086ဋe\u0087ဋf\u0088ဋg\u0089ဋh\u008aဋi\u008b\u001d\u008cဋj\u008dဋk\u008eဋl\u008fဋm\u0090ဋn\u0091ဋo\u0092ဋp\u0093ဋq\u0094ဋr\u0095ဋs\u0096ဋt\u0097ဋu\u0098ဋv\u0099ဋw\u009aဋx\u009bဋy", new Object[]{"bitField0_", "bitField1_", "bitField2_", "bitField3_", "gotoCompassPage_", "gotoDialAlipayPage_", "gotoSportHistory_", "gotoSportDetailPage_", "gotoSportPage_", "gotoDialSportPage_", "gotoMusicPage_", "gotoDialMusicPage_", "gotoHeartPage_", "gotoDialHeartPage_", "gotoSpO2Page_", "gotoPaiPage_", "gotoDialPaiPage_", "gotoWeatherPage_", "gotoWeatherSecondPage_", "gotoDialWeatherPage_", "gotoEventPage_", "gotoDialEventPage_", "gotoAlarmPage_", "gotoDialAlarmPage_", "gotoStopwatchPage_", "gotoCountdownPage_", "gotoNfcCardPage_", "gotoDialNfcCadePage_", "gotoActivityPage_", "gotoDialActivityPage_", "notify_", Event.NotifyMessage.class, "compassCalibrateSuccessNum_", "alipayBindSuccessNum_", "spo2Calc_", "lcdOnBecauseOfWrist_", "lcdOff_", "eventTimeUp_", "unlock_", "setAlarm_", "useStopwatch_", "forgetWristOffLockPasswd_", "countDownTimeup_", "batterySaverOff_", "batterySaverOn_", "lockScreen_", "findPhone_", "turnOnTheaterMode_", "turnOnkeepWatchAwake_", "addCardSuccess_", "bindingSuccess_", "rebootNum_", "powerOff_", "systemUpdateImmediately_", "systemUpdateCancle_", "updateFail_", "sportStatus_", Event.SportStatusMessage.class, "sportIndoorCalibrate_", "swimPoolLength_", "activityTarget_", "dndMode_", "powerOffBatteryValue_", "powerOnBatteryValue_", "changeBatteryValue_", "autoScreenOffTime_", "lcdOnBecauseOfWristStatus_", "wristOffLockStatus_", "quickAccessApp_", "quickEntryApp_", "autoLight_", "currentDialId_", "currentDialNum_", "nandMessage_", "fatFreesize_", "fatDropsize_", "fatDroptime_", "fatFormat_", "fatDosfsck_", "firmware_", "baseRes_", "incRes_", "font_", "qNEinto_", "qNEgps_", "sysVibration_", "watchdir_", "applistTemperature_", "vicescreenTemperature_", "assistantTemperature_", "temperatureStatus_", "offlineAsrModeSelect_", "offlineAsrModeInto_", "offlineAsrFailOrSuccess_", "offlineAsrCmd_", "onlineVADStartType_", "onlineVADRequest_", "onlineVADActionType_", "updataerrscreen_", "updataimmediatelyscreen_", "remindershock_", "seePAIrate_", "seePAIexplain_", "dialtool_", "coutdowntime_", "reminderstand_", "reminderstandcomplete_", "recoverymode_", "usecarcount_", "volsetcount_", "volbycontrol_", "offwristlock_", "alarmreminder_", "alarmreminderclick_", "schedulereminderclick_", "flymode_", "blestatus_", "bleconnect_", "bleconnectsuccess_", "bleconnectfail_", "blelistclick_", "bleconnectclose_", "modifypwd_", "nFCstatus_", "ringreminder_", "languageselect_", "lightscreentime_", "startwifi_", "closewifi_", "wifiTipspage_", "wifipwdcorrect_", "volbysetting_", "ratemeasure_", "pressureinto_", "pressureautomeasure_", "pressuremeasureresult_", "aplayscreen_", "assistantcarid_", "assistantinto_", "assistantVAD_", "dialchangemode_", "activityobjectives_", "stopwatchstart_", "stopwatchreset_", "scheduledelete_", "scheduleedit_", "lightsetting_", "rateabnormalreminder_", "ratewarnreminder_", "findmoblie_", "gotosleep_", "gotowakeup_", "sleepscreen_", "sleepgoal_", "sleepstop_", "sleepreminder_", "nobindrecovery_", "nobindsupervise_", "bindsetlanguage_", "updatebyuser_", "sportremindersave_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<hamburgEventMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (hamburgEventMessage.class) {
                            try {
                                bVar = PARSER;
                                if (bVar == null) {
                                    bVar = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                    PARSER = bVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return bVar;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getActivityTarget() {
            return this.activityTarget_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getActivityobjectives() {
            return this.activityobjectives_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getAddCardSuccess() {
            return this.addCardSuccess_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getAlarmreminder() {
            return this.alarmreminder_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getAlarmreminderclick(int i) {
            return this.alarmreminderclick_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getAlarmreminderclickCount() {
            return this.alarmreminderclick_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getAlarmreminderclickList() {
            return this.alarmreminderclick_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getAlipayBindSuccessNum() {
            return this.alipayBindSuccessNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getAplayscreen() {
            return this.aplayscreen_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getApplistTemperature() {
            return this.applistTemperature_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getAssistantTemperature() {
            return this.assistantTemperature_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getAssistantVAD() {
            return this.assistantVAD_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getAssistantcarid() {
            return this.assistantcarid_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getAssistantinto() {
            return this.assistantinto_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean getAutoLight() {
            return this.autoLight_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getAutoScreenOffTime() {
            return this.autoScreenOffTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public Event.DfuUpgradeMessage getBaseRes() {
            Event.DfuUpgradeMessage dfuUpgradeMessage = this.baseRes_;
            return dfuUpgradeMessage == null ? Event.DfuUpgradeMessage.getDefaultInstance() : dfuUpgradeMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public Event.BatterySaverMode getBatterySaverOff() {
            Event.BatterySaverMode batterySaverMode = this.batterySaverOff_;
            return batterySaverMode == null ? Event.BatterySaverMode.getDefaultInstance() : batterySaverMode;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public Event.BatterySaverMode getBatterySaverOn() {
            Event.BatterySaverMode batterySaverMode = this.batterySaverOn_;
            return batterySaverMode == null ? Event.BatterySaverMode.getDefaultInstance() : batterySaverMode;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getBindingSuccess() {
            return this.bindingSuccess_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getBindsetlanguage() {
            return this.bindsetlanguage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getBleconnect(int i) {
            return this.bleconnect_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getBleconnectCount() {
            return this.bleconnect_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getBleconnectList() {
            return this.bleconnect_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getBleconnectclose() {
            return this.bleconnectclose_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getBleconnectfail() {
            return this.bleconnectfail_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getBleconnectsuccess() {
            return this.bleconnectsuccess_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getBlelistclick() {
            return this.blelistclick_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getBlestatus(int i) {
            return this.blestatus_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getBlestatusCount() {
            return this.blestatus_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getBlestatusList() {
            return this.blestatus_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getChangeBatteryValue() {
            return this.changeBatteryValue_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public Event.wifiuseMessage getClosewifi() {
            Event.wifiuseMessage wifiusemessage = this.closewifi_;
            return wifiusemessage == null ? Event.wifiuseMessage.getDefaultInstance() : wifiusemessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getCompassCalibrateSuccessNum() {
            return this.compassCalibrateSuccessNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getCountDownTimeup() {
            return this.countDownTimeup_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getCoutdowntime() {
            return this.coutdowntime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getCurrentDialId() {
            return this.currentDialId_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getCurrentDialNum() {
            return this.currentDialNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getDialchangemode() {
            return this.dialchangemode_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public Event.DialtoolMessage getDialtool() {
            Event.DialtoolMessage dialtoolMessage = this.dialtool_;
            return dialtoolMessage == null ? Event.DialtoolMessage.getDefaultInstance() : dialtoolMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public Event.DndEventMessage getDndMode() {
            Event.DndEventMessage dndEventMessage = this.dndMode_;
            return dndEventMessage == null ? Event.DndEventMessage.getDefaultInstance() : dndEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getEventTimeUp() {
            return this.eventTimeUp_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getFatDosfsck() {
            return this.fatDosfsck_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getFatDropsize() {
            return this.fatDropsize_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public long getFatDroptime() {
            return this.fatDroptime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getFatFormat() {
            return this.fatFormat_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getFatFreesize() {
            return this.fatFreesize_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getFindPhone() {
            return this.findPhone_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getFindmoblie() {
            return this.findmoblie_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public Event.DfuUpgradeMessage getFirmware() {
            Event.DfuUpgradeMessage dfuUpgradeMessage = this.firmware_;
            return dfuUpgradeMessage == null ? Event.DfuUpgradeMessage.getDefaultInstance() : dfuUpgradeMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getFlymode(int i) {
            return this.flymode_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getFlymodeCount() {
            return this.flymode_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getFlymodeList() {
            return this.flymode_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public Event.DfuUpgradeMessage getFont() {
            Event.DfuUpgradeMessage dfuUpgradeMessage = this.font_;
            return dfuUpgradeMessage == null ? Event.DfuUpgradeMessage.getDefaultInstance() : dfuUpgradeMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getForgetWristOffLockPasswd() {
            return this.forgetWristOffLockPasswd_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotoActivityPage() {
            return this.gotoActivityPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotoAlarmPage() {
            return this.gotoAlarmPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotoCompassPage() {
            return this.gotoCompassPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotoCountdownPage() {
            return this.gotoCountdownPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotoDialActivityPage() {
            return this.gotoDialActivityPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotoDialAlarmPage() {
            return this.gotoDialAlarmPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotoDialAlipayPage() {
            return this.gotoDialAlipayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotoDialEventPage() {
            return this.gotoDialEventPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotoDialHeartPage() {
            return this.gotoDialHeartPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotoDialMusicPage() {
            return this.gotoDialMusicPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotoDialNfcCadePage() {
            return this.gotoDialNfcCadePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotoDialPaiPage() {
            return this.gotoDialPaiPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotoDialSportPage() {
            return this.gotoDialSportPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotoDialWeatherPage() {
            return this.gotoDialWeatherPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotoEventPage() {
            return this.gotoEventPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotoHeartPage() {
            return this.gotoHeartPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotoMusicPage() {
            return this.gotoMusicPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotoNfcCardPage() {
            return this.gotoNfcCardPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotoPaiPage() {
            return this.gotoPaiPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotoSpO2Page() {
            return this.gotoSpO2Page_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotoSportDetailPage(int i) {
            return this.gotoSportDetailPage_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotoSportDetailPageCount() {
            return this.gotoSportDetailPage_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getGotoSportDetailPageList() {
            return this.gotoSportDetailPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotoSportHistory() {
            return this.gotoSportHistory_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotoSportPage() {
            return this.gotoSportPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotoStopwatchPage() {
            return this.gotoStopwatchPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotoWeatherPage() {
            return this.gotoWeatherPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotoWeatherSecondPage() {
            return this.gotoWeatherSecondPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotosleep() {
            return this.gotosleep_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getGotowakeup() {
            return this.gotowakeup_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public Event.DfuUpgradeMessage getIncRes() {
            Event.DfuUpgradeMessage dfuUpgradeMessage = this.incRes_;
            return dfuUpgradeMessage == null ? Event.DfuUpgradeMessage.getDefaultInstance() : dfuUpgradeMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getLanguageselect() {
            return this.languageselect_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getLcdOff(int i) {
            return this.lcdOff_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getLcdOffCount() {
            return this.lcdOff_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getLcdOffList() {
            return this.lcdOff_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getLcdOnBecauseOfWrist() {
            return this.lcdOnBecauseOfWrist_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getLcdOnBecauseOfWristStatus() {
            return this.lcdOnBecauseOfWristStatus_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public Event.lightscreentimeMessage getLightscreentime() {
            Event.lightscreentimeMessage lightscreentimemessage = this.lightscreentime_;
            return lightscreentimemessage == null ? Event.lightscreentimeMessage.getDefaultInstance() : lightscreentimemessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getLightsetting() {
            return this.lightsetting_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getLockScreen() {
            return this.lockScreen_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getModifypwd(int i) {
            return this.modifypwd_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getModifypwdCount() {
            return this.modifypwd_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getModifypwdList() {
            return this.modifypwd_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getNFCstatus(int i) {
            return this.nFCstatus_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getNFCstatusCount() {
            return this.nFCstatus_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getNFCstatusList() {
            return this.nFCstatus_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public Event.NandMessage getNandMessage() {
            Event.NandMessage nandMessage = this.nandMessage_;
            return nandMessage == null ? Event.NandMessage.getDefaultInstance() : nandMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getNobindrecovery() {
            return this.nobindrecovery_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getNobindsupervise() {
            return this.nobindsupervise_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public Event.NotifyMessage getNotify(int i) {
            return this.notify_.get(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getNotifyCount() {
            return this.notify_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Event.NotifyMessage> getNotifyList() {
            return this.notify_;
        }

        public Event.NotifyMessageOrBuilder getNotifyOrBuilder(int i) {
            return this.notify_.get(i);
        }

        public List<? extends Event.NotifyMessageOrBuilder> getNotifyOrBuilderList() {
            return this.notify_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getOfflineAsrCmd(int i) {
            return this.offlineAsrCmd_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getOfflineAsrCmdCount() {
            return this.offlineAsrCmd_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getOfflineAsrCmdList() {
            return this.offlineAsrCmd_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getOfflineAsrFailOrSuccess(int i) {
            return this.offlineAsrFailOrSuccess_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getOfflineAsrFailOrSuccessCount() {
            return this.offlineAsrFailOrSuccess_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getOfflineAsrFailOrSuccessList() {
            return this.offlineAsrFailOrSuccess_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getOfflineAsrModeInto(int i) {
            return this.offlineAsrModeInto_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getOfflineAsrModeIntoCount() {
            return this.offlineAsrModeInto_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getOfflineAsrModeIntoList() {
            return this.offlineAsrModeInto_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getOfflineAsrModeSelect(int i) {
            return this.offlineAsrModeSelect_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getOfflineAsrModeSelectCount() {
            return this.offlineAsrModeSelect_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getOfflineAsrModeSelectList() {
            return this.offlineAsrModeSelect_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getOffwristlock(int i) {
            return this.offwristlock_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getOffwristlockCount() {
            return this.offwristlock_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getOffwristlockList() {
            return this.offwristlock_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getOnlineVADActionType(int i) {
            return this.onlineVADActionType_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getOnlineVADActionTypeCount() {
            return this.onlineVADActionType_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getOnlineVADActionTypeList() {
            return this.onlineVADActionType_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getOnlineVADRequest(int i) {
            return this.onlineVADRequest_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getOnlineVADRequestCount() {
            return this.onlineVADRequest_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getOnlineVADRequestList() {
            return this.onlineVADRequest_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getOnlineVADStartType(int i) {
            return this.onlineVADStartType_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getOnlineVADStartTypeCount() {
            return this.onlineVADStartType_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getOnlineVADStartTypeList() {
            return this.onlineVADStartType_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getPowerOff() {
            return this.powerOff_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getPowerOffBatteryValue() {
            return this.powerOffBatteryValue_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getPowerOnBatteryValue() {
            return this.powerOnBatteryValue_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getPressureautomeasure(int i) {
            return this.pressureautomeasure_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getPressureautomeasureCount() {
            return this.pressureautomeasure_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getPressureautomeasureList() {
            return this.pressureautomeasure_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getPressureinto() {
            return this.pressureinto_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getPressuremeasureresult(int i) {
            return this.pressuremeasureresult_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getPressuremeasureresultCount() {
            return this.pressuremeasureresult_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getPressuremeasureresultList() {
            return this.pressuremeasureresult_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getQNEgps() {
            return this.qNEgps_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getQNEinto() {
            return this.qNEinto_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getQuickAccessApp() {
            return this.quickAccessApp_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean getQuickEntryApp(int i) {
            return this.quickEntryApp_.getBoolean(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getQuickEntryAppCount() {
            return this.quickEntryApp_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Boolean> getQuickEntryAppList() {
            return this.quickEntryApp_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getRateabnormalreminder() {
            return this.rateabnormalreminder_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getRatemeasure(int i) {
            return this.ratemeasure_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getRatemeasureCount() {
            return this.ratemeasure_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getRatemeasureList() {
            return this.ratemeasure_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getRatewarnreminder() {
            return this.ratewarnreminder_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getRebootNum() {
            return this.rebootNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getRecoverymode() {
            return this.recoverymode_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getRemindershock() {
            return this.remindershock_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getReminderstand() {
            return this.reminderstand_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getReminderstandcomplete() {
            return this.reminderstandcomplete_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getRingreminder(int i) {
            return this.ringreminder_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getRingreminderCount() {
            return this.ringreminder_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getRingreminderList() {
            return this.ringreminder_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getScheduledelete(int i) {
            return this.scheduledelete_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getScheduledeleteCount() {
            return this.scheduledelete_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getScheduledeleteList() {
            return this.scheduledelete_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getScheduleedit() {
            return this.scheduleedit_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getSchedulereminderclick(int i) {
            return this.schedulereminderclick_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getSchedulereminderclickCount() {
            return this.schedulereminderclick_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getSchedulereminderclickList() {
            return this.schedulereminderclick_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getSeePAIexplain() {
            return this.seePAIexplain_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getSeePAIrate() {
            return this.seePAIrate_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getSetAlarm() {
            return this.setAlarm_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getSleepgoal() {
            return this.sleepgoal_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getSleepreminder() {
            return this.sleepreminder_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getSleepscreen() {
            return this.sleepscreen_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getSleepstop() {
            return this.sleepstop_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getSpo2Calc(int i) {
            return this.spo2Calc_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getSpo2CalcCount() {
            return this.spo2Calc_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getSpo2CalcList() {
            return this.spo2Calc_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getSportIndoorCalibrate(int i) {
            return this.sportIndoorCalibrate_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getSportIndoorCalibrateCount() {
            return this.sportIndoorCalibrate_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getSportIndoorCalibrateList() {
            return this.sportIndoorCalibrate_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public Event.SportStatusMessage getSportStatus(int i) {
            return this.sportStatus_.get(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getSportStatusCount() {
            return this.sportStatus_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Event.SportStatusMessage> getSportStatusList() {
            return this.sportStatus_;
        }

        public Event.SportStatusMessageOrBuilder getSportStatusOrBuilder(int i) {
            return this.sportStatus_.get(i);
        }

        public List<? extends Event.SportStatusMessageOrBuilder> getSportStatusOrBuilderList() {
            return this.sportStatus_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getSportremindersave() {
            return this.sportremindersave_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public Event.wifiuseMessage getStartwifi() {
            Event.wifiuseMessage wifiusemessage = this.startwifi_;
            return wifiusemessage == null ? Event.wifiuseMessage.getDefaultInstance() : wifiusemessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getStopwatchreset() {
            return this.stopwatchreset_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getStopwatchstart() {
            return this.stopwatchstart_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getSwimPoolLength() {
            return this.swimPoolLength_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean getSysVibration() {
            return this.sysVibration_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getSystemUpdateCancle() {
            return this.systemUpdateCancle_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getSystemUpdateImmediately() {
            return this.systemUpdateImmediately_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getTemperatureStatus(int i) {
            return this.temperatureStatus_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getTemperatureStatusCount() {
            return this.temperatureStatus_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getTemperatureStatusList() {
            return this.temperatureStatus_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getTurnOnTheaterMode() {
            return this.turnOnTheaterMode_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getTurnOnkeepWatchAwake() {
            return this.turnOnkeepWatchAwake_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getUnlock(int i) {
            return this.unlock_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getUnlockCount() {
            return this.unlock_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getUnlockList() {
            return this.unlock_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getUpdataerrscreen(int i) {
            return this.updataerrscreen_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getUpdataerrscreenCount() {
            return this.updataerrscreen_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getUpdataerrscreenList() {
            return this.updataerrscreen_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getUpdataimmediatelyscreen(int i) {
            return this.updataimmediatelyscreen_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getUpdataimmediatelyscreenCount() {
            return this.updataimmediatelyscreen_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getUpdataimmediatelyscreenList() {
            return this.updataimmediatelyscreen_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getUpdateFail(int i) {
            return this.updateFail_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getUpdateFailCount() {
            return this.updateFail_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getUpdateFailList() {
            return this.updateFail_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getUpdatebyuser() {
            return this.updatebyuser_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getUseStopwatch() {
            return this.useStopwatch_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getUsecarcount(int i) {
            return this.usecarcount_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getUsecarcountCount() {
            return this.usecarcount_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public List<Integer> getUsecarcountList() {
            return this.usecarcount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getVicescreenTemperature() {
            return this.vicescreenTemperature_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getVolbycontrol() {
            return this.volbycontrol_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getVolbysetting() {
            return this.volbysetting_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getVolsetcount() {
            return this.volsetcount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean getWatchdir() {
            return this.watchdir_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getWifiTipspage() {
            return this.wifiTipspage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public int getWifipwdcorrect() {
            return this.wifipwdcorrect_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean getWristOffLockStatus() {
            return this.wristOffLockStatus_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasActivityTarget() {
            return (this.bitField1_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasActivityobjectives() {
            return (this.bitField3_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasAddCardSuccess() {
            return (this.bitField1_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasAlarmreminder() {
            return (this.bitField2_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasAlipayBindSuccessNum() {
            return (this.bitField0_ & 67108864) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasAplayscreen() {
            return (this.bitField3_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasApplistTemperature() {
            return (this.bitField2_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasAssistantTemperature() {
            return (this.bitField2_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasAssistantVAD() {
            return (this.bitField3_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasAssistantcarid() {
            return (this.bitField3_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasAssistantinto() {
            return (this.bitField3_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasAutoLight() {
            return (this.bitField1_ & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasAutoScreenOffTime() {
            return (this.bitField1_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasBaseRes() {
            return (this.bitField2_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasBatterySaverOff() {
            return (this.bitField1_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasBatterySaverOn() {
            return (this.bitField1_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasBindingSuccess() {
            return (this.bitField1_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasBindsetlanguage() {
            return (this.bitField3_ & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasBleconnectclose() {
            return (this.bitField2_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasBleconnectfail() {
            return (this.bitField2_ & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasBleconnectsuccess() {
            return (this.bitField2_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasBlelistclick() {
            return (this.bitField2_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasChangeBatteryValue() {
            return (this.bitField1_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasClosewifi() {
            return (this.bitField2_ & 536870912) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasCompassCalibrateSuccessNum() {
            return (this.bitField0_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasCountDownTimeup() {
            return (this.bitField1_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasCoutdowntime() {
            return (this.bitField2_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasCurrentDialId() {
            return (this.bitField1_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasCurrentDialNum() {
            return (this.bitField1_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasDialchangemode() {
            return (this.bitField3_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasDialtool() {
            return (this.bitField2_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasDndMode() {
            return (this.bitField1_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasEventTimeUp() {
            return (this.bitField0_ & 268435456) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasFatDosfsck() {
            return (this.bitField1_ & Integer.MIN_VALUE) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasFatDropsize() {
            return (this.bitField1_ & 268435456) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasFatDroptime() {
            return (this.bitField1_ & 536870912) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasFatFormat() {
            return (this.bitField1_ & 1073741824) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasFatFreesize() {
            return (this.bitField1_ & 134217728) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasFindPhone() {
            return (this.bitField1_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasFindmoblie() {
            return (this.bitField3_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasFirmware() {
            return (this.bitField2_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasFont() {
            return (this.bitField2_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasForgetWristOffLockPasswd() {
            return (this.bitField0_ & Integer.MIN_VALUE) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasGotoActivityPage() {
            return (this.bitField0_ & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasGotoAlarmPage() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasGotoCompassPage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasGotoCountdownPage() {
            return (this.bitField0_ & EventRecurrence.TH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasGotoDialActivityPage() {
            return (this.bitField0_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasGotoDialAlarmPage() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasGotoDialAlipayPage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasGotoDialEventPage() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasGotoDialHeartPage() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasGotoDialMusicPage() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasGotoDialNfcCadePage() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasGotoDialPaiPage() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasGotoDialSportPage() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasGotoDialWeatherPage() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasGotoEventPage() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasGotoHeartPage() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasGotoMusicPage() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasGotoNfcCardPage() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasGotoPaiPage() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasGotoSpO2Page() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasGotoSportHistory() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasGotoSportPage() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasGotoStopwatchPage() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasGotoWeatherPage() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasGotoWeatherSecondPage() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasGotosleep() {
            return (this.bitField3_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasGotowakeup() {
            return (this.bitField3_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasIncRes() {
            return (this.bitField2_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasLanguageselect() {
            return (this.bitField2_ & 67108864) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfWrist() {
            return (this.bitField0_ & 134217728) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfWristStatus() {
            return (this.bitField1_ & EventRecurrence.TH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasLightscreentime() {
            return (this.bitField2_ & 134217728) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasLightsetting() {
            return (this.bitField3_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasLockScreen() {
            return (this.bitField1_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasNandMessage() {
            return (this.bitField1_ & 67108864) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasNobindrecovery() {
            return (this.bitField3_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasNobindsupervise() {
            return (this.bitField3_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasPowerOff() {
            return (this.bitField1_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasPowerOffBatteryValue() {
            return (this.bitField1_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasPowerOnBatteryValue() {
            return (this.bitField1_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasPressureinto() {
            return (this.bitField3_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasQNEgps() {
            return (this.bitField2_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasQNEinto() {
            return (this.bitField2_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasQuickAccessApp() {
            return (this.bitField1_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasRateabnormalreminder() {
            return (this.bitField3_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasRatewarnreminder() {
            return (this.bitField3_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasRebootNum() {
            return (this.bitField1_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasRecoverymode() {
            return (this.bitField2_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasRemindershock() {
            return (this.bitField2_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasReminderstand() {
            return (this.bitField2_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasReminderstandcomplete() {
            return (this.bitField2_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasScheduleedit() {
            return (this.bitField3_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasSeePAIexplain() {
            return (this.bitField2_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasSeePAIrate() {
            return (this.bitField2_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasSetAlarm() {
            return (this.bitField0_ & 536870912) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasSleepgoal() {
            return (this.bitField3_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasSleepreminder() {
            return (this.bitField3_ & EventRecurrence.TH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasSleepscreen() {
            return (this.bitField3_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasSleepstop() {
            return (this.bitField3_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasSportremindersave() {
            return (this.bitField3_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasStartwifi() {
            return (this.bitField2_ & 268435456) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasStopwatchreset() {
            return (this.bitField3_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasStopwatchstart() {
            return (this.bitField3_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasSwimPoolLength() {
            return (this.bitField1_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasSysVibration() {
            return (this.bitField2_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasSystemUpdateCancle() {
            return (this.bitField1_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasSystemUpdateImmediately() {
            return (this.bitField1_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasTurnOnTheaterMode() {
            return (this.bitField1_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasTurnOnkeepWatchAwake() {
            return (this.bitField1_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasUpdatebyuser() {
            return (this.bitField3_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasUseStopwatch() {
            return (this.bitField0_ & 1073741824) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasVicescreenTemperature() {
            return (this.bitField2_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasVolbycontrol() {
            return (this.bitField2_ & EventRecurrence.TH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasVolbysetting() {
            return (this.bitField3_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasVolsetcount() {
            return (this.bitField2_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasWatchdir() {
            return (this.bitField2_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasWifiTipspage() {
            return (this.bitField2_ & 1073741824) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasWifipwdcorrect() {
            return (this.bitField2_ & Integer.MIN_VALUE) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgEventMessageOrBuilder
        public boolean hasWristOffLockStatus() {
            return (this.bitField1_ & 2097152) != 0;
        }

        public static Builder newBuilder(hamburgEventMessage hamburgeventmessage) {
            return DEFAULT_INSTANCE.createBuilder(hamburgeventmessage);
        }

        public static hamburgEventMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (hamburgEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static hamburgEventMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (hamburgEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static hamburgEventMessage parseFrom(ByteString byteString) {
            return (hamburgEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNotify(int i, Event.NotifyMessage notifyMessage) {
            notifyMessage.getClass();
            ensureNotifyIsMutable();
            this.notify_.add(i, notifyMessage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSportStatus(int i, Event.SportStatusMessage sportStatusMessage) {
            sportStatusMessage.getClass();
            ensureSportStatusIsMutable();
            this.sportStatus_.add(i, sportStatusMessage);
        }

        public static hamburgEventMessage parseFrom(ByteString byteString, t tVar) {
            return (hamburgEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static hamburgEventMessage parseFrom(byte[] bArr) {
            return (hamburgEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static hamburgEventMessage parseFrom(byte[] bArr, t tVar) {
            return (hamburgEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static hamburgEventMessage parseFrom(InputStream inputStream) {
            return (hamburgEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static hamburgEventMessage parseFrom(InputStream inputStream, t tVar) {
            return (hamburgEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static hamburgEventMessage parseFrom(j jVar) {
            return (hamburgEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static hamburgEventMessage parseFrom(j jVar, t tVar) {
            return (hamburgEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface hamburgEventMessageOrBuilder extends bsf {
        int getActivityTarget();

        int getActivityobjectives();

        int getAddCardSuccess();

        int getAlarmreminder();

        int getAlarmreminderclick(int i);

        int getAlarmreminderclickCount();

        List<Integer> getAlarmreminderclickList();

        int getAlipayBindSuccessNum();

        int getAplayscreen();

        int getApplistTemperature();

        int getAssistantTemperature();

        int getAssistantVAD();

        int getAssistantcarid();

        int getAssistantinto();

        boolean getAutoLight();

        int getAutoScreenOffTime();

        Event.DfuUpgradeMessage getBaseRes();

        Event.BatterySaverMode getBatterySaverOff();

        Event.BatterySaverMode getBatterySaverOn();

        int getBindingSuccess();

        int getBindsetlanguage();

        int getBleconnect(int i);

        int getBleconnectCount();

        List<Integer> getBleconnectList();

        int getBleconnectclose();

        int getBleconnectfail();

        int getBleconnectsuccess();

        int getBlelistclick();

        int getBlestatus(int i);

        int getBlestatusCount();

        List<Integer> getBlestatusList();

        int getChangeBatteryValue();

        Event.wifiuseMessage getClosewifi();

        int getCompassCalibrateSuccessNum();

        int getCountDownTimeup();

        int getCoutdowntime();

        int getCurrentDialId();

        int getCurrentDialNum();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getDialchangemode();

        Event.DialtoolMessage getDialtool();

        Event.DndEventMessage getDndMode();

        int getEventTimeUp();

        int getFatDosfsck();

        int getFatDropsize();

        long getFatDroptime();

        int getFatFormat();

        int getFatFreesize();

        int getFindPhone();

        int getFindmoblie();

        Event.DfuUpgradeMessage getFirmware();

        int getFlymode(int i);

        int getFlymodeCount();

        List<Integer> getFlymodeList();

        Event.DfuUpgradeMessage getFont();

        int getForgetWristOffLockPasswd();

        int getGotoActivityPage();

        int getGotoAlarmPage();

        int getGotoCompassPage();

        int getGotoCountdownPage();

        int getGotoDialActivityPage();

        int getGotoDialAlarmPage();

        int getGotoDialAlipayPage();

        int getGotoDialEventPage();

        int getGotoDialHeartPage();

        int getGotoDialMusicPage();

        int getGotoDialNfcCadePage();

        int getGotoDialPaiPage();

        int getGotoDialSportPage();

        int getGotoDialWeatherPage();

        int getGotoEventPage();

        int getGotoHeartPage();

        int getGotoMusicPage();

        int getGotoNfcCardPage();

        int getGotoPaiPage();

        int getGotoSpO2Page();

        int getGotoSportDetailPage(int i);

        int getGotoSportDetailPageCount();

        List<Integer> getGotoSportDetailPageList();

        int getGotoSportHistory();

        int getGotoSportPage();

        int getGotoStopwatchPage();

        int getGotoWeatherPage();

        int getGotoWeatherSecondPage();

        int getGotosleep();

        int getGotowakeup();

        Event.DfuUpgradeMessage getIncRes();

        int getLanguageselect();

        int getLcdOff(int i);

        int getLcdOffCount();

        List<Integer> getLcdOffList();

        int getLcdOnBecauseOfWrist();

        int getLcdOnBecauseOfWristStatus();

        Event.lightscreentimeMessage getLightscreentime();

        int getLightsetting();

        int getLockScreen();

        int getModifypwd(int i);

        int getModifypwdCount();

        List<Integer> getModifypwdList();

        int getNFCstatus(int i);

        int getNFCstatusCount();

        List<Integer> getNFCstatusList();

        Event.NandMessage getNandMessage();

        int getNobindrecovery();

        int getNobindsupervise();

        Event.NotifyMessage getNotify(int i);

        int getNotifyCount();

        List<Event.NotifyMessage> getNotifyList();

        int getOfflineAsrCmd(int i);

        int getOfflineAsrCmdCount();

        List<Integer> getOfflineAsrCmdList();

        int getOfflineAsrFailOrSuccess(int i);

        int getOfflineAsrFailOrSuccessCount();

        List<Integer> getOfflineAsrFailOrSuccessList();

        int getOfflineAsrModeInto(int i);

        int getOfflineAsrModeIntoCount();

        List<Integer> getOfflineAsrModeIntoList();

        int getOfflineAsrModeSelect(int i);

        int getOfflineAsrModeSelectCount();

        List<Integer> getOfflineAsrModeSelectList();

        int getOffwristlock(int i);

        int getOffwristlockCount();

        List<Integer> getOffwristlockList();

        int getOnlineVADActionType(int i);

        int getOnlineVADActionTypeCount();

        List<Integer> getOnlineVADActionTypeList();

        int getOnlineVADRequest(int i);

        int getOnlineVADRequestCount();

        List<Integer> getOnlineVADRequestList();

        int getOnlineVADStartType(int i);

        int getOnlineVADStartTypeCount();

        List<Integer> getOnlineVADStartTypeList();

        int getPowerOff();

        int getPowerOffBatteryValue();

        int getPowerOnBatteryValue();

        int getPressureautomeasure(int i);

        int getPressureautomeasureCount();

        List<Integer> getPressureautomeasureList();

        int getPressureinto();

        int getPressuremeasureresult(int i);

        int getPressuremeasureresultCount();

        List<Integer> getPressuremeasureresultList();

        int getQNEgps();

        int getQNEinto();

        int getQuickAccessApp();

        boolean getQuickEntryApp(int i);

        int getQuickEntryAppCount();

        List<Boolean> getQuickEntryAppList();

        int getRateabnormalreminder();

        int getRatemeasure(int i);

        int getRatemeasureCount();

        List<Integer> getRatemeasureList();

        int getRatewarnreminder();

        int getRebootNum();

        int getRecoverymode();

        int getRemindershock();

        int getReminderstand();

        int getReminderstandcomplete();

        int getRingreminder(int i);

        int getRingreminderCount();

        List<Integer> getRingreminderList();

        int getScheduledelete(int i);

        int getScheduledeleteCount();

        List<Integer> getScheduledeleteList();

        int getScheduleedit();

        int getSchedulereminderclick(int i);

        int getSchedulereminderclickCount();

        List<Integer> getSchedulereminderclickList();

        int getSeePAIexplain();

        int getSeePAIrate();

        int getSetAlarm();

        int getSleepgoal();

        int getSleepreminder();

        int getSleepscreen();

        int getSleepstop();

        int getSpo2Calc(int i);

        int getSpo2CalcCount();

        List<Integer> getSpo2CalcList();

        int getSportIndoorCalibrate(int i);

        int getSportIndoorCalibrateCount();

        List<Integer> getSportIndoorCalibrateList();

        Event.SportStatusMessage getSportStatus(int i);

        int getSportStatusCount();

        List<Event.SportStatusMessage> getSportStatusList();

        int getSportremindersave();

        Event.wifiuseMessage getStartwifi();

        int getStopwatchreset();

        int getStopwatchstart();

        int getSwimPoolLength();

        boolean getSysVibration();

        int getSystemUpdateCancle();

        int getSystemUpdateImmediately();

        int getTemperatureStatus(int i);

        int getTemperatureStatusCount();

        List<Integer> getTemperatureStatusList();

        int getTurnOnTheaterMode();

        int getTurnOnkeepWatchAwake();

        int getUnlock(int i);

        int getUnlockCount();

        List<Integer> getUnlockList();

        int getUpdataerrscreen(int i);

        int getUpdataerrscreenCount();

        List<Integer> getUpdataerrscreenList();

        int getUpdataimmediatelyscreen(int i);

        int getUpdataimmediatelyscreenCount();

        List<Integer> getUpdataimmediatelyscreenList();

        int getUpdateFail(int i);

        int getUpdateFailCount();

        List<Integer> getUpdateFailList();

        int getUpdatebyuser();

        int getUseStopwatch();

        int getUsecarcount(int i);

        int getUsecarcountCount();

        List<Integer> getUsecarcountList();

        int getVicescreenTemperature();

        int getVolbycontrol();

        int getVolbysetting();

        int getVolsetcount();

        boolean getWatchdir();

        int getWifiTipspage();

        int getWifipwdcorrect();

        boolean getWristOffLockStatus();

        boolean hasActivityTarget();

        boolean hasActivityobjectives();

        boolean hasAddCardSuccess();

        boolean hasAlarmreminder();

        boolean hasAlipayBindSuccessNum();

        boolean hasAplayscreen();

        boolean hasApplistTemperature();

        boolean hasAssistantTemperature();

        boolean hasAssistantVAD();

        boolean hasAssistantcarid();

        boolean hasAssistantinto();

        boolean hasAutoLight();

        boolean hasAutoScreenOffTime();

        boolean hasBaseRes();

        boolean hasBatterySaverOff();

        boolean hasBatterySaverOn();

        boolean hasBindingSuccess();

        boolean hasBindsetlanguage();

        boolean hasBleconnectclose();

        boolean hasBleconnectfail();

        boolean hasBleconnectsuccess();

        boolean hasBlelistclick();

        boolean hasChangeBatteryValue();

        boolean hasClosewifi();

        boolean hasCompassCalibrateSuccessNum();

        boolean hasCountDownTimeup();

        boolean hasCoutdowntime();

        boolean hasCurrentDialId();

        boolean hasCurrentDialNum();

        boolean hasDialchangemode();

        boolean hasDialtool();

        boolean hasDndMode();

        boolean hasEventTimeUp();

        boolean hasFatDosfsck();

        boolean hasFatDropsize();

        boolean hasFatDroptime();

        boolean hasFatFormat();

        boolean hasFatFreesize();

        boolean hasFindPhone();

        boolean hasFindmoblie();

        boolean hasFirmware();

        boolean hasFont();

        boolean hasForgetWristOffLockPasswd();

        boolean hasGotoActivityPage();

        boolean hasGotoAlarmPage();

        boolean hasGotoCompassPage();

        boolean hasGotoCountdownPage();

        boolean hasGotoDialActivityPage();

        boolean hasGotoDialAlarmPage();

        boolean hasGotoDialAlipayPage();

        boolean hasGotoDialEventPage();

        boolean hasGotoDialHeartPage();

        boolean hasGotoDialMusicPage();

        boolean hasGotoDialNfcCadePage();

        boolean hasGotoDialPaiPage();

        boolean hasGotoDialSportPage();

        boolean hasGotoDialWeatherPage();

        boolean hasGotoEventPage();

        boolean hasGotoHeartPage();

        boolean hasGotoMusicPage();

        boolean hasGotoNfcCardPage();

        boolean hasGotoPaiPage();

        boolean hasGotoSpO2Page();

        boolean hasGotoSportHistory();

        boolean hasGotoSportPage();

        boolean hasGotoStopwatchPage();

        boolean hasGotoWeatherPage();

        boolean hasGotoWeatherSecondPage();

        boolean hasGotosleep();

        boolean hasGotowakeup();

        boolean hasIncRes();

        boolean hasLanguageselect();

        boolean hasLcdOnBecauseOfWrist();

        boolean hasLcdOnBecauseOfWristStatus();

        boolean hasLightscreentime();

        boolean hasLightsetting();

        boolean hasLockScreen();

        boolean hasNandMessage();

        boolean hasNobindrecovery();

        boolean hasNobindsupervise();

        boolean hasPowerOff();

        boolean hasPowerOffBatteryValue();

        boolean hasPowerOnBatteryValue();

        boolean hasPressureinto();

        boolean hasQNEgps();

        boolean hasQNEinto();

        boolean hasQuickAccessApp();

        boolean hasRateabnormalreminder();

        boolean hasRatewarnreminder();

        boolean hasRebootNum();

        boolean hasRecoverymode();

        boolean hasRemindershock();

        boolean hasReminderstand();

        boolean hasReminderstandcomplete();

        boolean hasScheduleedit();

        boolean hasSeePAIexplain();

        boolean hasSeePAIrate();

        boolean hasSetAlarm();

        boolean hasSleepgoal();

        boolean hasSleepreminder();

        boolean hasSleepscreen();

        boolean hasSleepstop();

        boolean hasSportremindersave();

        boolean hasStartwifi();

        boolean hasStopwatchreset();

        boolean hasStopwatchstart();

        boolean hasSwimPoolLength();

        boolean hasSysVibration();

        boolean hasSystemUpdateCancle();

        boolean hasSystemUpdateImmediately();

        boolean hasTurnOnTheaterMode();

        boolean hasTurnOnkeepWatchAwake();

        boolean hasUpdatebyuser();

        boolean hasUseStopwatch();

        boolean hasVicescreenTemperature();

        boolean hasVolbycontrol();

        boolean hasVolbysetting();

        boolean hasVolsetcount();

        boolean hasWatchdir();

        boolean hasWifiTipspage();

        boolean hasWifipwdcorrect();

        boolean hasWristOffLockStatus();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class hamburgStatisticsMessage extends GeneratedMessageLite<hamburgStatisticsMessage, Builder> implements hamburgStatisticsMessageOrBuilder {
        public static final int BACKLIGHTLEVEL_FIELD_NUMBER = 3;
        public static final int BASE_FIELD_NUMBER = 1;
        private static final hamburgStatisticsMessage DEFAULT_INSTANCE;
        public static final int EVENT_FIELD_NUMBER = 4;
        public static final int NFC_FIELD_NUMBER = 5;
        private static volatile vkh<hamburgStatisticsMessage> PARSER = null;
        public static final int SILENCEMODE_FIELD_NUMBER = 2;
        private int backlightLevel_;
        private StatisBase.StatisBaseMessage base_;
        private int bitField0_;
        private hamburgEventMessage event_;
        private byte memoizedIsInitialized = 2;
        private Nfc.NfcMessage nfc_;
        private int silenceMode_;

        public static final class Builder extends GeneratedMessageLite.a<hamburgStatisticsMessage, Builder> implements hamburgStatisticsMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBacklightLevel() {
                copyOnWrite();
                ((hamburgStatisticsMessage) this.instance).clearBacklightLevel();
                return this;
            }

            public Builder clearBase() {
                copyOnWrite();
                ((hamburgStatisticsMessage) this.instance).clearBase();
                return this;
            }

            public Builder clearEvent() {
                copyOnWrite();
                ((hamburgStatisticsMessage) this.instance).clearEvent();
                return this;
            }

            public Builder clearNfc() {
                copyOnWrite();
                ((hamburgStatisticsMessage) this.instance).clearNfc();
                return this;
            }

            public Builder clearSilenceMode() {
                copyOnWrite();
                ((hamburgStatisticsMessage) this.instance).clearSilenceMode();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgStatisticsMessageOrBuilder
            public int getBacklightLevel() {
                return ((hamburgStatisticsMessage) this.instance).getBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgStatisticsMessageOrBuilder
            public StatisBase.StatisBaseMessage getBase() {
                return ((hamburgStatisticsMessage) this.instance).getBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgStatisticsMessageOrBuilder
            public hamburgEventMessage getEvent() {
                return ((hamburgStatisticsMessage) this.instance).getEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgStatisticsMessageOrBuilder
            public Nfc.NfcMessage getNfc() {
                return ((hamburgStatisticsMessage) this.instance).getNfc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgStatisticsMessageOrBuilder
            public SilenceModeOuterClass.SilenceMode getSilenceMode() {
                return ((hamburgStatisticsMessage) this.instance).getSilenceMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgStatisticsMessageOrBuilder
            public boolean hasBacklightLevel() {
                return ((hamburgStatisticsMessage) this.instance).hasBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgStatisticsMessageOrBuilder
            public boolean hasBase() {
                return ((hamburgStatisticsMessage) this.instance).hasBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgStatisticsMessageOrBuilder
            public boolean hasEvent() {
                return ((hamburgStatisticsMessage) this.instance).hasEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgStatisticsMessageOrBuilder
            public boolean hasNfc() {
                return ((hamburgStatisticsMessage) this.instance).hasNfc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgStatisticsMessageOrBuilder
            public boolean hasSilenceMode() {
                return ((hamburgStatisticsMessage) this.instance).hasSilenceMode();
            }

            public Builder mergeBase(StatisBase.StatisBaseMessage statisBaseMessage) {
                copyOnWrite();
                ((hamburgStatisticsMessage) this.instance).mergeBase(statisBaseMessage);
                return this;
            }

            public Builder mergeEvent(hamburgEventMessage hamburgeventmessage) {
                copyOnWrite();
                ((hamburgStatisticsMessage) this.instance).mergeEvent(hamburgeventmessage);
                return this;
            }

            public Builder mergeNfc(Nfc.NfcMessage nfcMessage) {
                copyOnWrite();
                ((hamburgStatisticsMessage) this.instance).mergeNfc(nfcMessage);
                return this;
            }

            public Builder setBacklightLevel(int i) {
                copyOnWrite();
                ((hamburgStatisticsMessage) this.instance).setBacklightLevel(i);
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage statisBaseMessage) {
                copyOnWrite();
                ((hamburgStatisticsMessage) this.instance).setBase(statisBaseMessage);
                return this;
            }

            public Builder setEvent(hamburgEventMessage hamburgeventmessage) {
                copyOnWrite();
                ((hamburgStatisticsMessage) this.instance).setEvent(hamburgeventmessage);
                return this;
            }

            public Builder setNfc(Nfc.NfcMessage nfcMessage) {
                copyOnWrite();
                ((hamburgStatisticsMessage) this.instance).setNfc(nfcMessage);
                return this;
            }

            public Builder setSilenceMode(SilenceModeOuterClass.SilenceMode silenceMode) {
                copyOnWrite();
                ((hamburgStatisticsMessage) this.instance).setSilenceMode(silenceMode);
                return this;
            }

            private Builder() {
                super(hamburgStatisticsMessage.DEFAULT_INSTANCE);
            }

            public Builder setBase(StatisBase.StatisBaseMessage.Builder builder) {
                copyOnWrite();
                ((hamburgStatisticsMessage) this.instance).setBase(builder.build());
                return this;
            }

            public Builder setEvent(hamburgEventMessage.Builder builder) {
                copyOnWrite();
                ((hamburgStatisticsMessage) this.instance).setEvent(builder.build());
                return this;
            }

            public Builder setNfc(Nfc.NfcMessage.Builder builder) {
                copyOnWrite();
                ((hamburgStatisticsMessage) this.instance).setNfc(builder.build());
                return this;
            }
        }

        static {
            hamburgStatisticsMessage hamburgstatisticsmessage = new hamburgStatisticsMessage();
            DEFAULT_INSTANCE = hamburgstatisticsmessage;
            GeneratedMessageLite.registerDefaultInstance(hamburgStatisticsMessage.class, hamburgstatisticsmessage);
        }

        private hamburgStatisticsMessage() {
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

        public static hamburgStatisticsMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBase(StatisBase.StatisBaseMessage statisBaseMessage) {
            statisBaseMessage.getClass();
            StatisBase.StatisBaseMessage statisBaseMessage2 = this.base_;
            if (statisBaseMessage2 == null || statisBaseMessage2 == StatisBase.StatisBaseMessage.getDefaultInstance()) {
                this.base_ = statisBaseMessage;
            } else {
                this.base_ = StatisBase.StatisBaseMessage.newBuilder(this.base_).mergeFrom(statisBaseMessage).buildPartial();
            }
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeEvent(hamburgEventMessage hamburgeventmessage) {
            hamburgeventmessage.getClass();
            hamburgEventMessage hamburgeventmessage2 = this.event_;
            if (hamburgeventmessage2 == null || hamburgeventmessage2 == hamburgEventMessage.getDefaultInstance()) {
                this.event_ = hamburgeventmessage;
            } else {
                this.event_ = hamburgEventMessage.newBuilder(this.event_).mergeFrom(hamburgeventmessage).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNfc(Nfc.NfcMessage nfcMessage) {
            nfcMessage.getClass();
            Nfc.NfcMessage nfcMessage2 = this.nfc_;
            if (nfcMessage2 == null || nfcMessage2 == Nfc.NfcMessage.getDefaultInstance()) {
                this.nfc_ = nfcMessage;
            } else {
                this.nfc_ = Nfc.NfcMessage.newBuilder(this.nfc_).mergeFrom(nfcMessage).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static hamburgStatisticsMessage parseDelimitedFrom(InputStream inputStream) {
            return (hamburgStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static hamburgStatisticsMessage parseFrom(ByteBuffer byteBuffer) {
            return (hamburgStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<hamburgStatisticsMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBacklightLevel(int i) {
            this.bitField0_ |= 4;
            this.backlightLevel_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBase(StatisBase.StatisBaseMessage statisBaseMessage) {
            statisBaseMessage.getClass();
            this.base_ = statisBaseMessage;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEvent(hamburgEventMessage hamburgeventmessage) {
            hamburgeventmessage.getClass();
            this.event_ = hamburgeventmessage;
            this.bitField0_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNfc(Nfc.NfcMessage nfcMessage) {
            nfcMessage.getClass();
            this.nfc_ = nfcMessage;
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSilenceMode(SilenceModeOuterClass.SilenceMode silenceMode) {
            this.silenceMode_ = silenceMode.getNumber();
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new hamburgStatisticsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001ᔉ\u0000\u0002ᔌ\u0001\u0003ᔋ\u0002\u0004ᔉ\u0003\u0005ᐉ\u0004", new Object[]{"bitField0_", "base_", "silenceMode_", SilenceModeOuterClass.SilenceMode.internalGetVerifier(), "backlightLevel_", "event_", "nfc_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<hamburgStatisticsMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (hamburgStatisticsMessage.class) {
                            try {
                                bVar = PARSER;
                                if (bVar == null) {
                                    bVar = new GeneratedMessageLite.b<>(DEFAULT_INSTANCE);
                                    PARSER = bVar;
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                            break;
                        }
                    }
                    return bVar;
                case 6:
                    return Byte.valueOf(this.memoizedIsInitialized);
                case 7:
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgStatisticsMessageOrBuilder
        public int getBacklightLevel() {
            return this.backlightLevel_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgStatisticsMessageOrBuilder
        public StatisBase.StatisBaseMessage getBase() {
            StatisBase.StatisBaseMessage statisBaseMessage = this.base_;
            return statisBaseMessage == null ? StatisBase.StatisBaseMessage.getDefaultInstance() : statisBaseMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgStatisticsMessageOrBuilder
        public hamburgEventMessage getEvent() {
            hamburgEventMessage hamburgeventmessage = this.event_;
            return hamburgeventmessage == null ? hamburgEventMessage.getDefaultInstance() : hamburgeventmessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgStatisticsMessageOrBuilder
        public Nfc.NfcMessage getNfc() {
            Nfc.NfcMessage nfcMessage = this.nfc_;
            return nfcMessage == null ? Nfc.NfcMessage.getDefaultInstance() : nfcMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgStatisticsMessageOrBuilder
        public SilenceModeOuterClass.SilenceMode getSilenceMode() {
            SilenceModeOuterClass.SilenceMode silenceModeForNumber = SilenceModeOuterClass.SilenceMode.forNumber(this.silenceMode_);
            return silenceModeForNumber == null ? SilenceModeOuterClass.SilenceMode.OFF : silenceModeForNumber;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgStatisticsMessageOrBuilder
        public boolean hasBacklightLevel() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgStatisticsMessageOrBuilder
        public boolean hasBase() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgStatisticsMessageOrBuilder
        public boolean hasEvent() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgStatisticsMessageOrBuilder
        public boolean hasNfc() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Hamburg.hamburgStatisticsMessageOrBuilder
        public boolean hasSilenceMode() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(hamburgStatisticsMessage hamburgstatisticsmessage) {
            return DEFAULT_INSTANCE.createBuilder(hamburgstatisticsmessage);
        }

        public static hamburgStatisticsMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (hamburgStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static hamburgStatisticsMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (hamburgStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static hamburgStatisticsMessage parseFrom(ByteString byteString) {
            return (hamburgStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static hamburgStatisticsMessage parseFrom(ByteString byteString, t tVar) {
            return (hamburgStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static hamburgStatisticsMessage parseFrom(byte[] bArr) {
            return (hamburgStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static hamburgStatisticsMessage parseFrom(byte[] bArr, t tVar) {
            return (hamburgStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static hamburgStatisticsMessage parseFrom(InputStream inputStream) {
            return (hamburgStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static hamburgStatisticsMessage parseFrom(InputStream inputStream, t tVar) {
            return (hamburgStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static hamburgStatisticsMessage parseFrom(j jVar) {
            return (hamburgStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static hamburgStatisticsMessage parseFrom(j jVar, t tVar) {
            return (hamburgStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface hamburgStatisticsMessageOrBuilder extends bsf {
        int getBacklightLevel();

        StatisBase.StatisBaseMessage getBase();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        hamburgEventMessage getEvent();

        Nfc.NfcMessage getNfc();

        SilenceModeOuterClass.SilenceMode getSilenceMode();

        boolean hasBacklightLevel();

        boolean hasBase();

        boolean hasEvent();

        boolean hasNfc();

        boolean hasSilenceMode();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    private Hamburg() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}
