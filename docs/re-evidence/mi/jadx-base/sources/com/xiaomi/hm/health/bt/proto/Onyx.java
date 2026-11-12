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
public final class Onyx {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.Onyx$1, reason: invalid class name */
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

    public static final class onyxEventMessage extends GeneratedMessageLite<onyxEventMessage, Builder> implements onyxEventMessageOrBuilder {
        public static final int ACTIVITYOBJECTIVES_FIELD_NUMBER = 124;
        public static final int ACTIVITYTARGET_FIELD_NUMBER = 55;
        public static final int ADDCARDSUCCESS_FIELD_NUMBER = 45;
        public static final int ALARMREMINDERCLICK_FIELD_NUMBER = 93;
        public static final int ALARMREMINDER_FIELD_NUMBER = 92;
        public static final int ALIPAYBINDSUCCESSNUM_FIELD_NUMBER = 29;
        public static final int APLAYSCREEN_FIELD_NUMBER = 119;
        public static final int ASSISTANTCARID_FIELD_NUMBER = 120;
        public static final int ASSISTANTINTO_FIELD_NUMBER = 121;
        public static final int ASSISTANTVAD_FIELD_NUMBER = 122;
        public static final int AUTOLIGHT_FIELD_NUMBER = 65;
        public static final int AUTOSCREENOFFTIME_FIELD_NUMBER = 60;
        public static final int BASE_RES_FIELD_NUMBER = 75;
        public static final int BATTERYSAVEROFF_FIELD_NUMBER = 39;
        public static final int BATTERYSAVERON_FIELD_NUMBER = 40;
        public static final int BINDINGSUCCESS_FIELD_NUMBER = 46;
        public static final int BINDSETLANGUAGE_FIELD_NUMBER = 142;
        public static final int BLECONNECTCLOSE_FIELD_NUMBER = 103;
        public static final int BLECONNECTFAIL_FIELD_NUMBER = 101;
        public static final int BLECONNECTSUCCESS_FIELD_NUMBER = 100;
        public static final int BLECONNECT_FIELD_NUMBER = 99;
        public static final int BLELISTCLICK_FIELD_NUMBER = 102;
        public static final int BLESTATUS_FIELD_NUMBER = 98;
        public static final int CHANGEBATTERYVALUE_FIELD_NUMBER = 59;
        public static final int CLOSEWIFI_FIELD_NUMBER = 110;
        public static final int COMPASSCALIBRATESUCCESSNUM_FIELD_NUMBER = 28;
        public static final int COUNTDOWNTIMEUP_FIELD_NUMBER = 38;
        public static final int COUTDOWNTIME_FIELD_NUMBER = 84;
        public static final int CURRENTDIALID_FIELD_NUMBER = 66;
        public static final int CURRENTDIALNUM_FIELD_NUMBER = 67;
        private static final onyxEventMessage DEFAULT_INSTANCE;
        public static final int DIALCHANGEMODE_FIELD_NUMBER = 123;
        public static final int DIALTOOL_FIELD_NUMBER = 83;
        public static final int DNDMODE_FIELD_NUMBER = 56;
        public static final int EVENTTIMEUP_FIELD_NUMBER = 33;
        public static final int FAT_DOSFSCK_FIELD_NUMBER = 73;
        public static final int FAT_DROPSIZE_FIELD_NUMBER = 70;
        public static final int FAT_DROPTIME_FIELD_NUMBER = 71;
        public static final int FAT_FORMAT_FIELD_NUMBER = 72;
        public static final int FAT_FREESIZE_FIELD_NUMBER = 69;
        public static final int FINDMOBLIE_FIELD_NUMBER = 133;
        public static final int FINDPHONE_FIELD_NUMBER = 42;
        public static final int FIRMWARE_FIELD_NUMBER = 74;
        public static final int FLYMODE_FIELD_NUMBER = 97;
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
        public static final int GOTOSLEEP_FIELD_NUMBER = 134;
        public static final int GOTOSPO2PAGE_FIELD_NUMBER = 11;
        public static final int GOTOSPORTDETAILPAGE_FIELD_NUMBER = 4;
        public static final int GOTOSPORTHISTORY_FIELD_NUMBER = 3;
        public static final int GOTOSPORTPAGE_FIELD_NUMBER = 5;
        public static final int GOTOSTOPWATCHPAGE_FIELD_NUMBER = 21;
        public static final int GOTOWAKEUP_FIELD_NUMBER = 135;
        public static final int GOTOWEATHERPAGE_FIELD_NUMBER = 14;
        public static final int GOTOWEATHERSECONDPAGE_FIELD_NUMBER = 15;
        public static final int INC_RES_FIELD_NUMBER = 76;
        public static final int LANGUAGESELECT_FIELD_NUMBER = 107;
        public static final int LCDOFF_FIELD_NUMBER = 32;
        public static final int LCDONBECAUSEOFWRISTSTATUS_FIELD_NUMBER = 61;
        public static final int LCDONBECAUSEOFWRIST_FIELD_NUMBER = 31;
        public static final int LIGHTSCREENTIME_FIELD_NUMBER = 108;
        public static final int LIGHTSETTING_FIELD_NUMBER = 130;
        public static final int LOCKSCREEN_FIELD_NUMBER = 41;
        public static final int MODIFYPWD_FIELD_NUMBER = 104;
        public static final int NANDMESSAGE_FIELD_NUMBER = 68;
        public static final int NFCSTATUS_FIELD_NUMBER = 105;
        public static final int NOBINDRECOVERY_FIELD_NUMBER = 140;
        public static final int NOBINDSUPERVISE_FIELD_NUMBER = 141;
        public static final int NOTIFYEXT_FIELD_NUMBER = 145;
        public static final int NOTIFY_FIELD_NUMBER = 27;
        public static final int OFFWRISTLOCK_FIELD_NUMBER = 91;
        private static volatile vkh<onyxEventMessage> PARSER = null;
        public static final int POWEROFFBATTERYVALUE_FIELD_NUMBER = 57;
        public static final int POWEROFF_FIELD_NUMBER = 48;
        public static final int POWERONBATTERYVALUE_FIELD_NUMBER = 58;
        public static final int PRESSUREAUTOMEASURE_FIELD_NUMBER = 117;
        public static final int PRESSUREINTO_FIELD_NUMBER = 116;
        public static final int PRESSUREMEASURERESULT_FIELD_NUMBER = 118;
        public static final int QNEGPS_FIELD_NUMBER = 95;
        public static final int QNEINTO_FIELD_NUMBER = 94;
        public static final int QUICKACCESSAPP_FIELD_NUMBER = 63;
        public static final int QUICKENTRYAPP_FIELD_NUMBER = 64;
        public static final int RATEABNORMALREMINDER_FIELD_NUMBER = 131;
        public static final int RATEMEASURE_FIELD_NUMBER = 115;
        public static final int RATEWARNREMINDER_FIELD_NUMBER = 132;
        public static final int REBOOTNUM_FIELD_NUMBER = 47;
        public static final int RECOVERYMODE_FIELD_NUMBER = 87;
        public static final int REMINDERSHOCK_FIELD_NUMBER = 80;
        public static final int REMINDERSTANDCOMPLETE_FIELD_NUMBER = 86;
        public static final int REMINDERSTAND_FIELD_NUMBER = 85;
        public static final int RINGREMINDER_FIELD_NUMBER = 106;
        public static final int SCHEDULEDELETE_FIELD_NUMBER = 127;
        public static final int SCHEDULEEDIT_FIELD_NUMBER = 128;
        public static final int SCHEDULEREMINDERCLICK_FIELD_NUMBER = 96;
        public static final int SEEPAIEXPLAIN_FIELD_NUMBER = 82;
        public static final int SEEPAIRATE_FIELD_NUMBER = 81;
        public static final int SETALARM_FIELD_NUMBER = 35;
        public static final int SLEEPGOAL_FIELD_NUMBER = 137;
        public static final int SLEEPREMINDER_FIELD_NUMBER = 139;
        public static final int SLEEPSCREEN_FIELD_NUMBER = 136;
        public static final int SLEEPSTOP_FIELD_NUMBER = 138;
        public static final int SPO2CALC_FIELD_NUMBER = 30;
        public static final int SPORTINDOORCALIBRATE_FIELD_NUMBER = 53;
        public static final int SPORTREMINDERSAVE_FIELD_NUMBER = 144;
        public static final int SPORTSTATUS_FIELD_NUMBER = 52;
        public static final int STARTWIFI_FIELD_NUMBER = 109;
        public static final int STOPWATCHRESET_FIELD_NUMBER = 126;
        public static final int STOPWATCHSTART_FIELD_NUMBER = 125;
        public static final int SWIMPOOLLENGTH_FIELD_NUMBER = 54;
        public static final int SYSTEMUPDATECANCLE_FIELD_NUMBER = 50;
        public static final int SYSTEMUPDATEIMMEDIATELY_FIELD_NUMBER = 49;
        public static final int SYSVIBRATION_FIELD_NUMBER = 114;
        public static final int TURNONKEEPWATCHAWAKE_FIELD_NUMBER = 44;
        public static final int TURNONTHEATERMODE_FIELD_NUMBER = 43;
        public static final int UNLOCK_FIELD_NUMBER = 34;
        public static final int UPDATAERRSCREEN_FIELD_NUMBER = 78;
        public static final int UPDATAIMMEDIATELYSCREEN_FIELD_NUMBER = 79;
        public static final int UPDATEBYUSER_FIELD_NUMBER = 143;
        public static final int UPDATEFAIL_FIELD_NUMBER = 51;
        public static final int USECARCOUNT_FIELD_NUMBER = 88;
        public static final int USESTOPWATCH_FIELD_NUMBER = 36;
        public static final int VOLBYCONTROL_FIELD_NUMBER = 90;
        public static final int VOLBYSETTING_FIELD_NUMBER = 113;
        public static final int VOLSETCOUNT_FIELD_NUMBER = 89;
        public static final int WATCHDIR_FIELD_NUMBER = 129;
        public static final int WIFIPWDCORRECT_FIELD_NUMBER = 112;
        public static final int WIFITIPSPAGE_FIELD_NUMBER = 111;
        public static final int WRISTOFFLOCKSTATUS_FIELD_NUMBER = 62;
        private int activityTarget_;
        private int activityobjectives_;
        private int addCardSuccess_;
        private int alarmreminder_;
        private int alipayBindSuccessNum_;
        private int aplayscreen_;
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
        private d0.i<Event.NotifyMessage> notifyExt_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.a<onyxEventMessage, Builder> implements onyxEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAlarmreminderclick(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAlarmreminderclick(i);
                return this;
            }

            public Builder addAllAlarmreminderclick(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllAlarmreminderclick(iterable);
                return this;
            }

            public Builder addAllBleconnect(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllBleconnect(iterable);
                return this;
            }

            public Builder addAllBlestatus(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllBlestatus(iterable);
                return this;
            }

            public Builder addAllFlymode(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllFlymode(iterable);
                return this;
            }

            public Builder addAllGotoSportDetailPage(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllGotoSportDetailPage(iterable);
                return this;
            }

            public Builder addAllLcdOff(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllLcdOff(iterable);
                return this;
            }

            public Builder addAllModifypwd(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllModifypwd(iterable);
                return this;
            }

            public Builder addAllNFCstatus(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllNFCstatus(iterable);
                return this;
            }

            public Builder addAllNotify(Iterable<? extends Event.NotifyMessage> iterable) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllNotify(iterable);
                return this;
            }

            public Builder addAllNotifyExt(Iterable<? extends Event.NotifyMessage> iterable) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllNotifyExt(iterable);
                return this;
            }

            public Builder addAllOffwristlock(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllOffwristlock(iterable);
                return this;
            }

            public Builder addAllPressureautomeasure(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllPressureautomeasure(iterable);
                return this;
            }

            public Builder addAllPressuremeasureresult(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllPressuremeasureresult(iterable);
                return this;
            }

            public Builder addAllQuickEntryApp(Iterable<? extends Boolean> iterable) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllQuickEntryApp(iterable);
                return this;
            }

            public Builder addAllRatemeasure(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllRatemeasure(iterable);
                return this;
            }

            public Builder addAllRingreminder(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllRingreminder(iterable);
                return this;
            }

            public Builder addAllScheduledelete(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllScheduledelete(iterable);
                return this;
            }

            public Builder addAllSchedulereminderclick(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllSchedulereminderclick(iterable);
                return this;
            }

            public Builder addAllSpo2Calc(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllSpo2Calc(iterable);
                return this;
            }

            public Builder addAllSportIndoorCalibrate(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllSportIndoorCalibrate(iterable);
                return this;
            }

            public Builder addAllSportStatus(Iterable<? extends Event.SportStatusMessage> iterable) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllSportStatus(iterable);
                return this;
            }

            public Builder addAllUnlock(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllUnlock(iterable);
                return this;
            }

            public Builder addAllUpdataerrscreen(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllUpdataerrscreen(iterable);
                return this;
            }

            public Builder addAllUpdataimmediatelyscreen(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllUpdataimmediatelyscreen(iterable);
                return this;
            }

            public Builder addAllUpdateFail(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllUpdateFail(iterable);
                return this;
            }

            public Builder addAllUsecarcount(Iterable<? extends Integer> iterable) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllUsecarcount(iterable);
                return this;
            }

            public Builder addBleconnect(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addBleconnect(i);
                return this;
            }

            public Builder addBlestatus(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addBlestatus(i);
                return this;
            }

            public Builder addFlymode(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addFlymode(i);
                return this;
            }

            public Builder addGotoSportDetailPage(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addGotoSportDetailPage(i);
                return this;
            }

            public Builder addLcdOff(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addLcdOff(i);
                return this;
            }

            public Builder addModifypwd(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addModifypwd(i);
                return this;
            }

            public Builder addNFCstatus(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addNFCstatus(i);
                return this;
            }

            public Builder addNotify(Event.NotifyMessage notifyMessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addNotify(notifyMessage);
                return this;
            }

            public Builder addNotifyExt(Event.NotifyMessage notifyMessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addNotifyExt(notifyMessage);
                return this;
            }

            public Builder addOffwristlock(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addOffwristlock(i);
                return this;
            }

            public Builder addPressureautomeasure(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addPressureautomeasure(i);
                return this;
            }

            public Builder addPressuremeasureresult(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addPressuremeasureresult(i);
                return this;
            }

            public Builder addQuickEntryApp(boolean z) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addQuickEntryApp(z);
                return this;
            }

            public Builder addRatemeasure(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addRatemeasure(i);
                return this;
            }

            public Builder addRingreminder(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addRingreminder(i);
                return this;
            }

            public Builder addScheduledelete(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addScheduledelete(i);
                return this;
            }

            public Builder addSchedulereminderclick(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addSchedulereminderclick(i);
                return this;
            }

            public Builder addSpo2Calc(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addSpo2Calc(i);
                return this;
            }

            public Builder addSportIndoorCalibrate(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addSportIndoorCalibrate(i);
                return this;
            }

            public Builder addSportStatus(Event.SportStatusMessage sportStatusMessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addSportStatus(sportStatusMessage);
                return this;
            }

            public Builder addUnlock(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addUnlock(i);
                return this;
            }

            public Builder addUpdataerrscreen(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addUpdataerrscreen(i);
                return this;
            }

            public Builder addUpdataimmediatelyscreen(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addUpdataimmediatelyscreen(i);
                return this;
            }

            public Builder addUpdateFail(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addUpdateFail(i);
                return this;
            }

            public Builder addUsecarcount(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addUsecarcount(i);
                return this;
            }

            public Builder clearActivityTarget() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearActivityTarget();
                return this;
            }

            public Builder clearActivityobjectives() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearActivityobjectives();
                return this;
            }

            public Builder clearAddCardSuccess() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearAddCardSuccess();
                return this;
            }

            public Builder clearAlarmreminder() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearAlarmreminder();
                return this;
            }

            public Builder clearAlarmreminderclick() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearAlarmreminderclick();
                return this;
            }

            public Builder clearAlipayBindSuccessNum() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearAlipayBindSuccessNum();
                return this;
            }

            public Builder clearAplayscreen() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearAplayscreen();
                return this;
            }

            public Builder clearAssistantVAD() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearAssistantVAD();
                return this;
            }

            public Builder clearAssistantcarid() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearAssistantcarid();
                return this;
            }

            public Builder clearAssistantinto() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearAssistantinto();
                return this;
            }

            public Builder clearAutoLight() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearAutoLight();
                return this;
            }

            public Builder clearAutoScreenOffTime() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearAutoScreenOffTime();
                return this;
            }

            public Builder clearBaseRes() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearBaseRes();
                return this;
            }

            public Builder clearBatterySaverOff() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearBatterySaverOff();
                return this;
            }

            public Builder clearBatterySaverOn() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearBatterySaverOn();
                return this;
            }

            public Builder clearBindingSuccess() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearBindingSuccess();
                return this;
            }

            public Builder clearBindsetlanguage() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearBindsetlanguage();
                return this;
            }

            public Builder clearBleconnect() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearBleconnect();
                return this;
            }

            public Builder clearBleconnectclose() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearBleconnectclose();
                return this;
            }

            public Builder clearBleconnectfail() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearBleconnectfail();
                return this;
            }

            public Builder clearBleconnectsuccess() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearBleconnectsuccess();
                return this;
            }

            public Builder clearBlelistclick() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearBlelistclick();
                return this;
            }

            public Builder clearBlestatus() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearBlestatus();
                return this;
            }

            public Builder clearChangeBatteryValue() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearChangeBatteryValue();
                return this;
            }

            public Builder clearClosewifi() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearClosewifi();
                return this;
            }

            public Builder clearCompassCalibrateSuccessNum() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearCompassCalibrateSuccessNum();
                return this;
            }

            public Builder clearCountDownTimeup() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearCountDownTimeup();
                return this;
            }

            public Builder clearCoutdowntime() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearCoutdowntime();
                return this;
            }

            public Builder clearCurrentDialId() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearCurrentDialId();
                return this;
            }

            public Builder clearCurrentDialNum() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearCurrentDialNum();
                return this;
            }

            public Builder clearDialchangemode() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearDialchangemode();
                return this;
            }

            public Builder clearDialtool() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearDialtool();
                return this;
            }

            public Builder clearDndMode() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearDndMode();
                return this;
            }

            public Builder clearEventTimeUp() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearEventTimeUp();
                return this;
            }

            public Builder clearFatDosfsck() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearFatDosfsck();
                return this;
            }

            public Builder clearFatDropsize() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearFatDropsize();
                return this;
            }

            public Builder clearFatDroptime() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearFatDroptime();
                return this;
            }

            public Builder clearFatFormat() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearFatFormat();
                return this;
            }

            public Builder clearFatFreesize() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearFatFreesize();
                return this;
            }

            public Builder clearFindPhone() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearFindPhone();
                return this;
            }

            public Builder clearFindmoblie() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearFindmoblie();
                return this;
            }

            public Builder clearFirmware() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearFirmware();
                return this;
            }

            public Builder clearFlymode() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearFlymode();
                return this;
            }

            public Builder clearFont() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearFont();
                return this;
            }

            public Builder clearForgetWristOffLockPasswd() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearForgetWristOffLockPasswd();
                return this;
            }

            public Builder clearGotoActivityPage() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearGotoActivityPage();
                return this;
            }

            public Builder clearGotoAlarmPage() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearGotoAlarmPage();
                return this;
            }

            public Builder clearGotoCompassPage() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearGotoCompassPage();
                return this;
            }

            public Builder clearGotoCountdownPage() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearGotoCountdownPage();
                return this;
            }

            public Builder clearGotoDialActivityPage() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearGotoDialActivityPage();
                return this;
            }

            public Builder clearGotoDialAlarmPage() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearGotoDialAlarmPage();
                return this;
            }

            public Builder clearGotoDialAlipayPage() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearGotoDialAlipayPage();
                return this;
            }

            public Builder clearGotoDialEventPage() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearGotoDialEventPage();
                return this;
            }

            public Builder clearGotoDialHeartPage() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearGotoDialHeartPage();
                return this;
            }

            public Builder clearGotoDialMusicPage() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearGotoDialMusicPage();
                return this;
            }

            public Builder clearGotoDialNfcCadePage() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearGotoDialNfcCadePage();
                return this;
            }

            public Builder clearGotoDialPaiPage() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearGotoDialPaiPage();
                return this;
            }

            public Builder clearGotoDialSportPage() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearGotoDialSportPage();
                return this;
            }

            public Builder clearGotoDialWeatherPage() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearGotoDialWeatherPage();
                return this;
            }

            public Builder clearGotoEventPage() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearGotoEventPage();
                return this;
            }

            public Builder clearGotoHeartPage() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearGotoHeartPage();
                return this;
            }

            public Builder clearGotoMusicPage() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearGotoMusicPage();
                return this;
            }

            public Builder clearGotoNfcCardPage() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearGotoNfcCardPage();
                return this;
            }

            public Builder clearGotoPaiPage() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearGotoPaiPage();
                return this;
            }

            public Builder clearGotoSpO2Page() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearGotoSpO2Page();
                return this;
            }

            public Builder clearGotoSportDetailPage() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearGotoSportDetailPage();
                return this;
            }

            public Builder clearGotoSportHistory() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearGotoSportHistory();
                return this;
            }

            public Builder clearGotoSportPage() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearGotoSportPage();
                return this;
            }

            public Builder clearGotoStopwatchPage() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearGotoStopwatchPage();
                return this;
            }

            public Builder clearGotoWeatherPage() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearGotoWeatherPage();
                return this;
            }

            public Builder clearGotoWeatherSecondPage() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearGotoWeatherSecondPage();
                return this;
            }

            public Builder clearGotosleep() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearGotosleep();
                return this;
            }

            public Builder clearGotowakeup() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearGotowakeup();
                return this;
            }

            public Builder clearIncRes() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearIncRes();
                return this;
            }

            public Builder clearLanguageselect() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearLanguageselect();
                return this;
            }

            public Builder clearLcdOff() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearLcdOff();
                return this;
            }

            public Builder clearLcdOnBecauseOfWrist() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearLcdOnBecauseOfWrist();
                return this;
            }

            public Builder clearLcdOnBecauseOfWristStatus() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearLcdOnBecauseOfWristStatus();
                return this;
            }

            public Builder clearLightscreentime() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearLightscreentime();
                return this;
            }

            public Builder clearLightsetting() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearLightsetting();
                return this;
            }

            public Builder clearLockScreen() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearLockScreen();
                return this;
            }

            public Builder clearModifypwd() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearModifypwd();
                return this;
            }

            public Builder clearNFCstatus() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearNFCstatus();
                return this;
            }

            public Builder clearNandMessage() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearNandMessage();
                return this;
            }

            public Builder clearNobindrecovery() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearNobindrecovery();
                return this;
            }

            public Builder clearNobindsupervise() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearNobindsupervise();
                return this;
            }

            public Builder clearNotify() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearNotify();
                return this;
            }

            public Builder clearNotifyExt() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearNotifyExt();
                return this;
            }

            public Builder clearOffwristlock() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearOffwristlock();
                return this;
            }

            public Builder clearPowerOff() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearPowerOff();
                return this;
            }

            public Builder clearPowerOffBatteryValue() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearPowerOffBatteryValue();
                return this;
            }

            public Builder clearPowerOnBatteryValue() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearPowerOnBatteryValue();
                return this;
            }

            public Builder clearPressureautomeasure() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearPressureautomeasure();
                return this;
            }

            public Builder clearPressureinto() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearPressureinto();
                return this;
            }

            public Builder clearPressuremeasureresult() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearPressuremeasureresult();
                return this;
            }

            public Builder clearQNEgps() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearQNEgps();
                return this;
            }

            public Builder clearQNEinto() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearQNEinto();
                return this;
            }

            public Builder clearQuickAccessApp() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearQuickAccessApp();
                return this;
            }

            public Builder clearQuickEntryApp() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearQuickEntryApp();
                return this;
            }

            public Builder clearRateabnormalreminder() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearRateabnormalreminder();
                return this;
            }

            public Builder clearRatemeasure() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearRatemeasure();
                return this;
            }

            public Builder clearRatewarnreminder() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearRatewarnreminder();
                return this;
            }

            public Builder clearRebootNum() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearRebootNum();
                return this;
            }

            public Builder clearRecoverymode() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearRecoverymode();
                return this;
            }

            public Builder clearRemindershock() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearRemindershock();
                return this;
            }

            public Builder clearReminderstand() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearReminderstand();
                return this;
            }

            public Builder clearReminderstandcomplete() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearReminderstandcomplete();
                return this;
            }

            public Builder clearRingreminder() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearRingreminder();
                return this;
            }

            public Builder clearScheduledelete() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearScheduledelete();
                return this;
            }

            public Builder clearScheduleedit() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearScheduleedit();
                return this;
            }

            public Builder clearSchedulereminderclick() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearSchedulereminderclick();
                return this;
            }

            public Builder clearSeePAIexplain() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearSeePAIexplain();
                return this;
            }

            public Builder clearSeePAIrate() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearSeePAIrate();
                return this;
            }

            public Builder clearSetAlarm() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearSetAlarm();
                return this;
            }

            public Builder clearSleepgoal() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearSleepgoal();
                return this;
            }

            public Builder clearSleepreminder() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearSleepreminder();
                return this;
            }

            public Builder clearSleepscreen() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearSleepscreen();
                return this;
            }

            public Builder clearSleepstop() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearSleepstop();
                return this;
            }

            public Builder clearSpo2Calc() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearSpo2Calc();
                return this;
            }

            public Builder clearSportIndoorCalibrate() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearSportIndoorCalibrate();
                return this;
            }

            public Builder clearSportStatus() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearSportStatus();
                return this;
            }

            public Builder clearSportremindersave() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearSportremindersave();
                return this;
            }

            public Builder clearStartwifi() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearStartwifi();
                return this;
            }

            public Builder clearStopwatchreset() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearStopwatchreset();
                return this;
            }

            public Builder clearStopwatchstart() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearStopwatchstart();
                return this;
            }

            public Builder clearSwimPoolLength() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearSwimPoolLength();
                return this;
            }

            public Builder clearSysVibration() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearSysVibration();
                return this;
            }

            public Builder clearSystemUpdateCancle() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearSystemUpdateCancle();
                return this;
            }

            public Builder clearSystemUpdateImmediately() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearSystemUpdateImmediately();
                return this;
            }

            public Builder clearTurnOnTheaterMode() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearTurnOnTheaterMode();
                return this;
            }

            public Builder clearTurnOnkeepWatchAwake() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearTurnOnkeepWatchAwake();
                return this;
            }

            public Builder clearUnlock() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearUnlock();
                return this;
            }

            public Builder clearUpdataerrscreen() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearUpdataerrscreen();
                return this;
            }

            public Builder clearUpdataimmediatelyscreen() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearUpdataimmediatelyscreen();
                return this;
            }

            public Builder clearUpdateFail() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearUpdateFail();
                return this;
            }

            public Builder clearUpdatebyuser() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearUpdatebyuser();
                return this;
            }

            public Builder clearUseStopwatch() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearUseStopwatch();
                return this;
            }

            public Builder clearUsecarcount() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearUsecarcount();
                return this;
            }

            public Builder clearVolbycontrol() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearVolbycontrol();
                return this;
            }

            public Builder clearVolbysetting() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearVolbysetting();
                return this;
            }

            public Builder clearVolsetcount() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearVolsetcount();
                return this;
            }

            public Builder clearWatchdir() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearWatchdir();
                return this;
            }

            public Builder clearWifiTipspage() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearWifiTipspage();
                return this;
            }

            public Builder clearWifipwdcorrect() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearWifipwdcorrect();
                return this;
            }

            public Builder clearWristOffLockStatus() {
                copyOnWrite();
                ((onyxEventMessage) this.instance).clearWristOffLockStatus();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getActivityTarget() {
                return ((onyxEventMessage) this.instance).getActivityTarget();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getActivityobjectives() {
                return ((onyxEventMessage) this.instance).getActivityobjectives();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getAddCardSuccess() {
                return ((onyxEventMessage) this.instance).getAddCardSuccess();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getAlarmreminder() {
                return ((onyxEventMessage) this.instance).getAlarmreminder();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getAlarmreminderclick(int i) {
                return ((onyxEventMessage) this.instance).getAlarmreminderclick(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getAlarmreminderclickCount() {
                return ((onyxEventMessage) this.instance).getAlarmreminderclickCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public List<Integer> getAlarmreminderclickList() {
                return Collections.unmodifiableList(((onyxEventMessage) this.instance).getAlarmreminderclickList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getAlipayBindSuccessNum() {
                return ((onyxEventMessage) this.instance).getAlipayBindSuccessNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getAplayscreen() {
                return ((onyxEventMessage) this.instance).getAplayscreen();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getAssistantVAD() {
                return ((onyxEventMessage) this.instance).getAssistantVAD();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getAssistantcarid() {
                return ((onyxEventMessage) this.instance).getAssistantcarid();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getAssistantinto() {
                return ((onyxEventMessage) this.instance).getAssistantinto();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean getAutoLight() {
                return ((onyxEventMessage) this.instance).getAutoLight();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getAutoScreenOffTime() {
                return ((onyxEventMessage) this.instance).getAutoScreenOffTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public Event.DfuUpgradeMessage getBaseRes() {
                return ((onyxEventMessage) this.instance).getBaseRes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public Event.BatterySaverMode getBatterySaverOff() {
                return ((onyxEventMessage) this.instance).getBatterySaverOff();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public Event.BatterySaverMode getBatterySaverOn() {
                return ((onyxEventMessage) this.instance).getBatterySaverOn();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getBindingSuccess() {
                return ((onyxEventMessage) this.instance).getBindingSuccess();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getBindsetlanguage() {
                return ((onyxEventMessage) this.instance).getBindsetlanguage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getBleconnect(int i) {
                return ((onyxEventMessage) this.instance).getBleconnect(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getBleconnectCount() {
                return ((onyxEventMessage) this.instance).getBleconnectCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public List<Integer> getBleconnectList() {
                return Collections.unmodifiableList(((onyxEventMessage) this.instance).getBleconnectList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getBleconnectclose() {
                return ((onyxEventMessage) this.instance).getBleconnectclose();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getBleconnectfail() {
                return ((onyxEventMessage) this.instance).getBleconnectfail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getBleconnectsuccess() {
                return ((onyxEventMessage) this.instance).getBleconnectsuccess();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getBlelistclick() {
                return ((onyxEventMessage) this.instance).getBlelistclick();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getBlestatus(int i) {
                return ((onyxEventMessage) this.instance).getBlestatus(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getBlestatusCount() {
                return ((onyxEventMessage) this.instance).getBlestatusCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public List<Integer> getBlestatusList() {
                return Collections.unmodifiableList(((onyxEventMessage) this.instance).getBlestatusList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getChangeBatteryValue() {
                return ((onyxEventMessage) this.instance).getChangeBatteryValue();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public Event.wifiuseMessage getClosewifi() {
                return ((onyxEventMessage) this.instance).getClosewifi();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getCompassCalibrateSuccessNum() {
                return ((onyxEventMessage) this.instance).getCompassCalibrateSuccessNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getCountDownTimeup() {
                return ((onyxEventMessage) this.instance).getCountDownTimeup();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getCoutdowntime() {
                return ((onyxEventMessage) this.instance).getCoutdowntime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getCurrentDialId() {
                return ((onyxEventMessage) this.instance).getCurrentDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getCurrentDialNum() {
                return ((onyxEventMessage) this.instance).getCurrentDialNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getDialchangemode() {
                return ((onyxEventMessage) this.instance).getDialchangemode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public Event.DialtoolMessage getDialtool() {
                return ((onyxEventMessage) this.instance).getDialtool();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public Event.DndEventMessage getDndMode() {
                return ((onyxEventMessage) this.instance).getDndMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getEventTimeUp() {
                return ((onyxEventMessage) this.instance).getEventTimeUp();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getFatDosfsck() {
                return ((onyxEventMessage) this.instance).getFatDosfsck();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getFatDropsize() {
                return ((onyxEventMessage) this.instance).getFatDropsize();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public long getFatDroptime() {
                return ((onyxEventMessage) this.instance).getFatDroptime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getFatFormat() {
                return ((onyxEventMessage) this.instance).getFatFormat();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getFatFreesize() {
                return ((onyxEventMessage) this.instance).getFatFreesize();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getFindPhone() {
                return ((onyxEventMessage) this.instance).getFindPhone();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getFindmoblie() {
                return ((onyxEventMessage) this.instance).getFindmoblie();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public Event.DfuUpgradeMessage getFirmware() {
                return ((onyxEventMessage) this.instance).getFirmware();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getFlymode(int i) {
                return ((onyxEventMessage) this.instance).getFlymode(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getFlymodeCount() {
                return ((onyxEventMessage) this.instance).getFlymodeCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public List<Integer> getFlymodeList() {
                return Collections.unmodifiableList(((onyxEventMessage) this.instance).getFlymodeList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public Event.DfuUpgradeMessage getFont() {
                return ((onyxEventMessage) this.instance).getFont();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getForgetWristOffLockPasswd() {
                return ((onyxEventMessage) this.instance).getForgetWristOffLockPasswd();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotoActivityPage() {
                return ((onyxEventMessage) this.instance).getGotoActivityPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotoAlarmPage() {
                return ((onyxEventMessage) this.instance).getGotoAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotoCompassPage() {
                return ((onyxEventMessage) this.instance).getGotoCompassPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotoCountdownPage() {
                return ((onyxEventMessage) this.instance).getGotoCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotoDialActivityPage() {
                return ((onyxEventMessage) this.instance).getGotoDialActivityPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotoDialAlarmPage() {
                return ((onyxEventMessage) this.instance).getGotoDialAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotoDialAlipayPage() {
                return ((onyxEventMessage) this.instance).getGotoDialAlipayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotoDialEventPage() {
                return ((onyxEventMessage) this.instance).getGotoDialEventPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotoDialHeartPage() {
                return ((onyxEventMessage) this.instance).getGotoDialHeartPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotoDialMusicPage() {
                return ((onyxEventMessage) this.instance).getGotoDialMusicPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotoDialNfcCadePage() {
                return ((onyxEventMessage) this.instance).getGotoDialNfcCadePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotoDialPaiPage() {
                return ((onyxEventMessage) this.instance).getGotoDialPaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotoDialSportPage() {
                return ((onyxEventMessage) this.instance).getGotoDialSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotoDialWeatherPage() {
                return ((onyxEventMessage) this.instance).getGotoDialWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotoEventPage() {
                return ((onyxEventMessage) this.instance).getGotoEventPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotoHeartPage() {
                return ((onyxEventMessage) this.instance).getGotoHeartPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotoMusicPage() {
                return ((onyxEventMessage) this.instance).getGotoMusicPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotoNfcCardPage() {
                return ((onyxEventMessage) this.instance).getGotoNfcCardPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotoPaiPage() {
                return ((onyxEventMessage) this.instance).getGotoPaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotoSpO2Page() {
                return ((onyxEventMessage) this.instance).getGotoSpO2Page();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotoSportDetailPage(int i) {
                return ((onyxEventMessage) this.instance).getGotoSportDetailPage(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotoSportDetailPageCount() {
                return ((onyxEventMessage) this.instance).getGotoSportDetailPageCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public List<Integer> getGotoSportDetailPageList() {
                return Collections.unmodifiableList(((onyxEventMessage) this.instance).getGotoSportDetailPageList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotoSportHistory() {
                return ((onyxEventMessage) this.instance).getGotoSportHistory();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotoSportPage() {
                return ((onyxEventMessage) this.instance).getGotoSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotoStopwatchPage() {
                return ((onyxEventMessage) this.instance).getGotoStopwatchPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotoWeatherPage() {
                return ((onyxEventMessage) this.instance).getGotoWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotoWeatherSecondPage() {
                return ((onyxEventMessage) this.instance).getGotoWeatherSecondPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotosleep() {
                return ((onyxEventMessage) this.instance).getGotosleep();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getGotowakeup() {
                return ((onyxEventMessage) this.instance).getGotowakeup();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public Event.DfuUpgradeMessage getIncRes() {
                return ((onyxEventMessage) this.instance).getIncRes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getLanguageselect() {
                return ((onyxEventMessage) this.instance).getLanguageselect();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getLcdOff(int i) {
                return ((onyxEventMessage) this.instance).getLcdOff(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getLcdOffCount() {
                return ((onyxEventMessage) this.instance).getLcdOffCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public List<Integer> getLcdOffList() {
                return Collections.unmodifiableList(((onyxEventMessage) this.instance).getLcdOffList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getLcdOnBecauseOfWrist() {
                return ((onyxEventMessage) this.instance).getLcdOnBecauseOfWrist();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getLcdOnBecauseOfWristStatus() {
                return ((onyxEventMessage) this.instance).getLcdOnBecauseOfWristStatus();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public Event.lightscreentimeMessage getLightscreentime() {
                return ((onyxEventMessage) this.instance).getLightscreentime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getLightsetting() {
                return ((onyxEventMessage) this.instance).getLightsetting();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getLockScreen() {
                return ((onyxEventMessage) this.instance).getLockScreen();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getModifypwd(int i) {
                return ((onyxEventMessage) this.instance).getModifypwd(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getModifypwdCount() {
                return ((onyxEventMessage) this.instance).getModifypwdCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public List<Integer> getModifypwdList() {
                return Collections.unmodifiableList(((onyxEventMessage) this.instance).getModifypwdList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getNFCstatus(int i) {
                return ((onyxEventMessage) this.instance).getNFCstatus(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getNFCstatusCount() {
                return ((onyxEventMessage) this.instance).getNFCstatusCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public List<Integer> getNFCstatusList() {
                return Collections.unmodifiableList(((onyxEventMessage) this.instance).getNFCstatusList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public Event.NandMessage getNandMessage() {
                return ((onyxEventMessage) this.instance).getNandMessage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getNobindrecovery() {
                return ((onyxEventMessage) this.instance).getNobindrecovery();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getNobindsupervise() {
                return ((onyxEventMessage) this.instance).getNobindsupervise();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public Event.NotifyMessage getNotify(int i) {
                return ((onyxEventMessage) this.instance).getNotify(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getNotifyCount() {
                return ((onyxEventMessage) this.instance).getNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public Event.NotifyMessage getNotifyExt(int i) {
                return ((onyxEventMessage) this.instance).getNotifyExt(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getNotifyExtCount() {
                return ((onyxEventMessage) this.instance).getNotifyExtCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public List<Event.NotifyMessage> getNotifyExtList() {
                return Collections.unmodifiableList(((onyxEventMessage) this.instance).getNotifyExtList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public List<Event.NotifyMessage> getNotifyList() {
                return Collections.unmodifiableList(((onyxEventMessage) this.instance).getNotifyList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getOffwristlock(int i) {
                return ((onyxEventMessage) this.instance).getOffwristlock(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getOffwristlockCount() {
                return ((onyxEventMessage) this.instance).getOffwristlockCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public List<Integer> getOffwristlockList() {
                return Collections.unmodifiableList(((onyxEventMessage) this.instance).getOffwristlockList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getPowerOff() {
                return ((onyxEventMessage) this.instance).getPowerOff();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getPowerOffBatteryValue() {
                return ((onyxEventMessage) this.instance).getPowerOffBatteryValue();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getPowerOnBatteryValue() {
                return ((onyxEventMessage) this.instance).getPowerOnBatteryValue();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getPressureautomeasure(int i) {
                return ((onyxEventMessage) this.instance).getPressureautomeasure(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getPressureautomeasureCount() {
                return ((onyxEventMessage) this.instance).getPressureautomeasureCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public List<Integer> getPressureautomeasureList() {
                return Collections.unmodifiableList(((onyxEventMessage) this.instance).getPressureautomeasureList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getPressureinto() {
                return ((onyxEventMessage) this.instance).getPressureinto();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getPressuremeasureresult(int i) {
                return ((onyxEventMessage) this.instance).getPressuremeasureresult(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getPressuremeasureresultCount() {
                return ((onyxEventMessage) this.instance).getPressuremeasureresultCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public List<Integer> getPressuremeasureresultList() {
                return Collections.unmodifiableList(((onyxEventMessage) this.instance).getPressuremeasureresultList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getQNEgps() {
                return ((onyxEventMessage) this.instance).getQNEgps();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getQNEinto() {
                return ((onyxEventMessage) this.instance).getQNEinto();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getQuickAccessApp() {
                return ((onyxEventMessage) this.instance).getQuickAccessApp();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean getQuickEntryApp(int i) {
                return ((onyxEventMessage) this.instance).getQuickEntryApp(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getQuickEntryAppCount() {
                return ((onyxEventMessage) this.instance).getQuickEntryAppCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public List<Boolean> getQuickEntryAppList() {
                return Collections.unmodifiableList(((onyxEventMessage) this.instance).getQuickEntryAppList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getRateabnormalreminder() {
                return ((onyxEventMessage) this.instance).getRateabnormalreminder();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getRatemeasure(int i) {
                return ((onyxEventMessage) this.instance).getRatemeasure(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getRatemeasureCount() {
                return ((onyxEventMessage) this.instance).getRatemeasureCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public List<Integer> getRatemeasureList() {
                return Collections.unmodifiableList(((onyxEventMessage) this.instance).getRatemeasureList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getRatewarnreminder() {
                return ((onyxEventMessage) this.instance).getRatewarnreminder();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getRebootNum() {
                return ((onyxEventMessage) this.instance).getRebootNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getRecoverymode() {
                return ((onyxEventMessage) this.instance).getRecoverymode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getRemindershock() {
                return ((onyxEventMessage) this.instance).getRemindershock();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getReminderstand() {
                return ((onyxEventMessage) this.instance).getReminderstand();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getReminderstandcomplete() {
                return ((onyxEventMessage) this.instance).getReminderstandcomplete();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getRingreminder(int i) {
                return ((onyxEventMessage) this.instance).getRingreminder(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getRingreminderCount() {
                return ((onyxEventMessage) this.instance).getRingreminderCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public List<Integer> getRingreminderList() {
                return Collections.unmodifiableList(((onyxEventMessage) this.instance).getRingreminderList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getScheduledelete(int i) {
                return ((onyxEventMessage) this.instance).getScheduledelete(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getScheduledeleteCount() {
                return ((onyxEventMessage) this.instance).getScheduledeleteCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public List<Integer> getScheduledeleteList() {
                return Collections.unmodifiableList(((onyxEventMessage) this.instance).getScheduledeleteList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getScheduleedit() {
                return ((onyxEventMessage) this.instance).getScheduleedit();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getSchedulereminderclick(int i) {
                return ((onyxEventMessage) this.instance).getSchedulereminderclick(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getSchedulereminderclickCount() {
                return ((onyxEventMessage) this.instance).getSchedulereminderclickCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public List<Integer> getSchedulereminderclickList() {
                return Collections.unmodifiableList(((onyxEventMessage) this.instance).getSchedulereminderclickList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getSeePAIexplain() {
                return ((onyxEventMessage) this.instance).getSeePAIexplain();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getSeePAIrate() {
                return ((onyxEventMessage) this.instance).getSeePAIrate();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getSetAlarm() {
                return ((onyxEventMessage) this.instance).getSetAlarm();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getSleepgoal() {
                return ((onyxEventMessage) this.instance).getSleepgoal();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getSleepreminder() {
                return ((onyxEventMessage) this.instance).getSleepreminder();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getSleepscreen() {
                return ((onyxEventMessage) this.instance).getSleepscreen();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getSleepstop() {
                return ((onyxEventMessage) this.instance).getSleepstop();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getSpo2Calc(int i) {
                return ((onyxEventMessage) this.instance).getSpo2Calc(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getSpo2CalcCount() {
                return ((onyxEventMessage) this.instance).getSpo2CalcCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public List<Integer> getSpo2CalcList() {
                return Collections.unmodifiableList(((onyxEventMessage) this.instance).getSpo2CalcList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getSportIndoorCalibrate(int i) {
                return ((onyxEventMessage) this.instance).getSportIndoorCalibrate(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getSportIndoorCalibrateCount() {
                return ((onyxEventMessage) this.instance).getSportIndoorCalibrateCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public List<Integer> getSportIndoorCalibrateList() {
                return Collections.unmodifiableList(((onyxEventMessage) this.instance).getSportIndoorCalibrateList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public Event.SportStatusMessage getSportStatus(int i) {
                return ((onyxEventMessage) this.instance).getSportStatus(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getSportStatusCount() {
                return ((onyxEventMessage) this.instance).getSportStatusCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public List<Event.SportStatusMessage> getSportStatusList() {
                return Collections.unmodifiableList(((onyxEventMessage) this.instance).getSportStatusList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getSportremindersave() {
                return ((onyxEventMessage) this.instance).getSportremindersave();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public Event.wifiuseMessage getStartwifi() {
                return ((onyxEventMessage) this.instance).getStartwifi();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getStopwatchreset() {
                return ((onyxEventMessage) this.instance).getStopwatchreset();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getStopwatchstart() {
                return ((onyxEventMessage) this.instance).getStopwatchstart();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getSwimPoolLength() {
                return ((onyxEventMessage) this.instance).getSwimPoolLength();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean getSysVibration() {
                return ((onyxEventMessage) this.instance).getSysVibration();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getSystemUpdateCancle() {
                return ((onyxEventMessage) this.instance).getSystemUpdateCancle();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getSystemUpdateImmediately() {
                return ((onyxEventMessage) this.instance).getSystemUpdateImmediately();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getTurnOnTheaterMode() {
                return ((onyxEventMessage) this.instance).getTurnOnTheaterMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getTurnOnkeepWatchAwake() {
                return ((onyxEventMessage) this.instance).getTurnOnkeepWatchAwake();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getUnlock(int i) {
                return ((onyxEventMessage) this.instance).getUnlock(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getUnlockCount() {
                return ((onyxEventMessage) this.instance).getUnlockCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public List<Integer> getUnlockList() {
                return Collections.unmodifiableList(((onyxEventMessage) this.instance).getUnlockList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getUpdataerrscreen(int i) {
                return ((onyxEventMessage) this.instance).getUpdataerrscreen(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getUpdataerrscreenCount() {
                return ((onyxEventMessage) this.instance).getUpdataerrscreenCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public List<Integer> getUpdataerrscreenList() {
                return Collections.unmodifiableList(((onyxEventMessage) this.instance).getUpdataerrscreenList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getUpdataimmediatelyscreen(int i) {
                return ((onyxEventMessage) this.instance).getUpdataimmediatelyscreen(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getUpdataimmediatelyscreenCount() {
                return ((onyxEventMessage) this.instance).getUpdataimmediatelyscreenCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public List<Integer> getUpdataimmediatelyscreenList() {
                return Collections.unmodifiableList(((onyxEventMessage) this.instance).getUpdataimmediatelyscreenList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getUpdateFail(int i) {
                return ((onyxEventMessage) this.instance).getUpdateFail(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getUpdateFailCount() {
                return ((onyxEventMessage) this.instance).getUpdateFailCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public List<Integer> getUpdateFailList() {
                return Collections.unmodifiableList(((onyxEventMessage) this.instance).getUpdateFailList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getUpdatebyuser() {
                return ((onyxEventMessage) this.instance).getUpdatebyuser();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getUseStopwatch() {
                return ((onyxEventMessage) this.instance).getUseStopwatch();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getUsecarcount(int i) {
                return ((onyxEventMessage) this.instance).getUsecarcount(i);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getUsecarcountCount() {
                return ((onyxEventMessage) this.instance).getUsecarcountCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public List<Integer> getUsecarcountList() {
                return Collections.unmodifiableList(((onyxEventMessage) this.instance).getUsecarcountList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getVolbycontrol() {
                return ((onyxEventMessage) this.instance).getVolbycontrol();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getVolbysetting() {
                return ((onyxEventMessage) this.instance).getVolbysetting();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getVolsetcount() {
                return ((onyxEventMessage) this.instance).getVolsetcount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean getWatchdir() {
                return ((onyxEventMessage) this.instance).getWatchdir();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getWifiTipspage() {
                return ((onyxEventMessage) this.instance).getWifiTipspage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getWifipwdcorrect() {
                return ((onyxEventMessage) this.instance).getWifipwdcorrect();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean getWristOffLockStatus() {
                return ((onyxEventMessage) this.instance).getWristOffLockStatus();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasActivityTarget() {
                return ((onyxEventMessage) this.instance).hasActivityTarget();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasActivityobjectives() {
                return ((onyxEventMessage) this.instance).hasActivityobjectives();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasAddCardSuccess() {
                return ((onyxEventMessage) this.instance).hasAddCardSuccess();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasAlarmreminder() {
                return ((onyxEventMessage) this.instance).hasAlarmreminder();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasAlipayBindSuccessNum() {
                return ((onyxEventMessage) this.instance).hasAlipayBindSuccessNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasAplayscreen() {
                return ((onyxEventMessage) this.instance).hasAplayscreen();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasAssistantVAD() {
                return ((onyxEventMessage) this.instance).hasAssistantVAD();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasAssistantcarid() {
                return ((onyxEventMessage) this.instance).hasAssistantcarid();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasAssistantinto() {
                return ((onyxEventMessage) this.instance).hasAssistantinto();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasAutoLight() {
                return ((onyxEventMessage) this.instance).hasAutoLight();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasAutoScreenOffTime() {
                return ((onyxEventMessage) this.instance).hasAutoScreenOffTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasBaseRes() {
                return ((onyxEventMessage) this.instance).hasBaseRes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasBatterySaverOff() {
                return ((onyxEventMessage) this.instance).hasBatterySaverOff();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasBatterySaverOn() {
                return ((onyxEventMessage) this.instance).hasBatterySaverOn();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasBindingSuccess() {
                return ((onyxEventMessage) this.instance).hasBindingSuccess();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasBindsetlanguage() {
                return ((onyxEventMessage) this.instance).hasBindsetlanguage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasBleconnectclose() {
                return ((onyxEventMessage) this.instance).hasBleconnectclose();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasBleconnectfail() {
                return ((onyxEventMessage) this.instance).hasBleconnectfail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasBleconnectsuccess() {
                return ((onyxEventMessage) this.instance).hasBleconnectsuccess();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasBlelistclick() {
                return ((onyxEventMessage) this.instance).hasBlelistclick();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasChangeBatteryValue() {
                return ((onyxEventMessage) this.instance).hasChangeBatteryValue();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasClosewifi() {
                return ((onyxEventMessage) this.instance).hasClosewifi();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasCompassCalibrateSuccessNum() {
                return ((onyxEventMessage) this.instance).hasCompassCalibrateSuccessNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasCountDownTimeup() {
                return ((onyxEventMessage) this.instance).hasCountDownTimeup();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasCoutdowntime() {
                return ((onyxEventMessage) this.instance).hasCoutdowntime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasCurrentDialId() {
                return ((onyxEventMessage) this.instance).hasCurrentDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasCurrentDialNum() {
                return ((onyxEventMessage) this.instance).hasCurrentDialNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasDialchangemode() {
                return ((onyxEventMessage) this.instance).hasDialchangemode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasDialtool() {
                return ((onyxEventMessage) this.instance).hasDialtool();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasDndMode() {
                return ((onyxEventMessage) this.instance).hasDndMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasEventTimeUp() {
                return ((onyxEventMessage) this.instance).hasEventTimeUp();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasFatDosfsck() {
                return ((onyxEventMessage) this.instance).hasFatDosfsck();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasFatDropsize() {
                return ((onyxEventMessage) this.instance).hasFatDropsize();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasFatDroptime() {
                return ((onyxEventMessage) this.instance).hasFatDroptime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasFatFormat() {
                return ((onyxEventMessage) this.instance).hasFatFormat();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasFatFreesize() {
                return ((onyxEventMessage) this.instance).hasFatFreesize();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasFindPhone() {
                return ((onyxEventMessage) this.instance).hasFindPhone();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasFindmoblie() {
                return ((onyxEventMessage) this.instance).hasFindmoblie();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasFirmware() {
                return ((onyxEventMessage) this.instance).hasFirmware();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasFont() {
                return ((onyxEventMessage) this.instance).hasFont();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasForgetWristOffLockPasswd() {
                return ((onyxEventMessage) this.instance).hasForgetWristOffLockPasswd();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasGotoActivityPage() {
                return ((onyxEventMessage) this.instance).hasGotoActivityPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasGotoAlarmPage() {
                return ((onyxEventMessage) this.instance).hasGotoAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasGotoCompassPage() {
                return ((onyxEventMessage) this.instance).hasGotoCompassPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasGotoCountdownPage() {
                return ((onyxEventMessage) this.instance).hasGotoCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasGotoDialActivityPage() {
                return ((onyxEventMessage) this.instance).hasGotoDialActivityPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasGotoDialAlarmPage() {
                return ((onyxEventMessage) this.instance).hasGotoDialAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasGotoDialAlipayPage() {
                return ((onyxEventMessage) this.instance).hasGotoDialAlipayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasGotoDialEventPage() {
                return ((onyxEventMessage) this.instance).hasGotoDialEventPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasGotoDialHeartPage() {
                return ((onyxEventMessage) this.instance).hasGotoDialHeartPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasGotoDialMusicPage() {
                return ((onyxEventMessage) this.instance).hasGotoDialMusicPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasGotoDialNfcCadePage() {
                return ((onyxEventMessage) this.instance).hasGotoDialNfcCadePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasGotoDialPaiPage() {
                return ((onyxEventMessage) this.instance).hasGotoDialPaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasGotoDialSportPage() {
                return ((onyxEventMessage) this.instance).hasGotoDialSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasGotoDialWeatherPage() {
                return ((onyxEventMessage) this.instance).hasGotoDialWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasGotoEventPage() {
                return ((onyxEventMessage) this.instance).hasGotoEventPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasGotoHeartPage() {
                return ((onyxEventMessage) this.instance).hasGotoHeartPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasGotoMusicPage() {
                return ((onyxEventMessage) this.instance).hasGotoMusicPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasGotoNfcCardPage() {
                return ((onyxEventMessage) this.instance).hasGotoNfcCardPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasGotoPaiPage() {
                return ((onyxEventMessage) this.instance).hasGotoPaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasGotoSpO2Page() {
                return ((onyxEventMessage) this.instance).hasGotoSpO2Page();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasGotoSportHistory() {
                return ((onyxEventMessage) this.instance).hasGotoSportHistory();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasGotoSportPage() {
                return ((onyxEventMessage) this.instance).hasGotoSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasGotoStopwatchPage() {
                return ((onyxEventMessage) this.instance).hasGotoStopwatchPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasGotoWeatherPage() {
                return ((onyxEventMessage) this.instance).hasGotoWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasGotoWeatherSecondPage() {
                return ((onyxEventMessage) this.instance).hasGotoWeatherSecondPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasGotosleep() {
                return ((onyxEventMessage) this.instance).hasGotosleep();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasGotowakeup() {
                return ((onyxEventMessage) this.instance).hasGotowakeup();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasIncRes() {
                return ((onyxEventMessage) this.instance).hasIncRes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasLanguageselect() {
                return ((onyxEventMessage) this.instance).hasLanguageselect();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfWrist() {
                return ((onyxEventMessage) this.instance).hasLcdOnBecauseOfWrist();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfWristStatus() {
                return ((onyxEventMessage) this.instance).hasLcdOnBecauseOfWristStatus();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasLightscreentime() {
                return ((onyxEventMessage) this.instance).hasLightscreentime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasLightsetting() {
                return ((onyxEventMessage) this.instance).hasLightsetting();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasLockScreen() {
                return ((onyxEventMessage) this.instance).hasLockScreen();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasNandMessage() {
                return ((onyxEventMessage) this.instance).hasNandMessage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasNobindrecovery() {
                return ((onyxEventMessage) this.instance).hasNobindrecovery();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasNobindsupervise() {
                return ((onyxEventMessage) this.instance).hasNobindsupervise();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasPowerOff() {
                return ((onyxEventMessage) this.instance).hasPowerOff();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasPowerOffBatteryValue() {
                return ((onyxEventMessage) this.instance).hasPowerOffBatteryValue();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasPowerOnBatteryValue() {
                return ((onyxEventMessage) this.instance).hasPowerOnBatteryValue();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasPressureinto() {
                return ((onyxEventMessage) this.instance).hasPressureinto();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasQNEgps() {
                return ((onyxEventMessage) this.instance).hasQNEgps();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasQNEinto() {
                return ((onyxEventMessage) this.instance).hasQNEinto();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasQuickAccessApp() {
                return ((onyxEventMessage) this.instance).hasQuickAccessApp();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasRateabnormalreminder() {
                return ((onyxEventMessage) this.instance).hasRateabnormalreminder();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasRatewarnreminder() {
                return ((onyxEventMessage) this.instance).hasRatewarnreminder();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasRebootNum() {
                return ((onyxEventMessage) this.instance).hasRebootNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasRecoverymode() {
                return ((onyxEventMessage) this.instance).hasRecoverymode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasRemindershock() {
                return ((onyxEventMessage) this.instance).hasRemindershock();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasReminderstand() {
                return ((onyxEventMessage) this.instance).hasReminderstand();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasReminderstandcomplete() {
                return ((onyxEventMessage) this.instance).hasReminderstandcomplete();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasScheduleedit() {
                return ((onyxEventMessage) this.instance).hasScheduleedit();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasSeePAIexplain() {
                return ((onyxEventMessage) this.instance).hasSeePAIexplain();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasSeePAIrate() {
                return ((onyxEventMessage) this.instance).hasSeePAIrate();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasSetAlarm() {
                return ((onyxEventMessage) this.instance).hasSetAlarm();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasSleepgoal() {
                return ((onyxEventMessage) this.instance).hasSleepgoal();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasSleepreminder() {
                return ((onyxEventMessage) this.instance).hasSleepreminder();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasSleepscreen() {
                return ((onyxEventMessage) this.instance).hasSleepscreen();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasSleepstop() {
                return ((onyxEventMessage) this.instance).hasSleepstop();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasSportremindersave() {
                return ((onyxEventMessage) this.instance).hasSportremindersave();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasStartwifi() {
                return ((onyxEventMessage) this.instance).hasStartwifi();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasStopwatchreset() {
                return ((onyxEventMessage) this.instance).hasStopwatchreset();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasStopwatchstart() {
                return ((onyxEventMessage) this.instance).hasStopwatchstart();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasSwimPoolLength() {
                return ((onyxEventMessage) this.instance).hasSwimPoolLength();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasSysVibration() {
                return ((onyxEventMessage) this.instance).hasSysVibration();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasSystemUpdateCancle() {
                return ((onyxEventMessage) this.instance).hasSystemUpdateCancle();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasSystemUpdateImmediately() {
                return ((onyxEventMessage) this.instance).hasSystemUpdateImmediately();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasTurnOnTheaterMode() {
                return ((onyxEventMessage) this.instance).hasTurnOnTheaterMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasTurnOnkeepWatchAwake() {
                return ((onyxEventMessage) this.instance).hasTurnOnkeepWatchAwake();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasUpdatebyuser() {
                return ((onyxEventMessage) this.instance).hasUpdatebyuser();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasUseStopwatch() {
                return ((onyxEventMessage) this.instance).hasUseStopwatch();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasVolbycontrol() {
                return ((onyxEventMessage) this.instance).hasVolbycontrol();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasVolbysetting() {
                return ((onyxEventMessage) this.instance).hasVolbysetting();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasVolsetcount() {
                return ((onyxEventMessage) this.instance).hasVolsetcount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasWatchdir() {
                return ((onyxEventMessage) this.instance).hasWatchdir();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasWifiTipspage() {
                return ((onyxEventMessage) this.instance).hasWifiTipspage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasWifipwdcorrect() {
                return ((onyxEventMessage) this.instance).hasWifipwdcorrect();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public boolean hasWristOffLockStatus() {
                return ((onyxEventMessage) this.instance).hasWristOffLockStatus();
            }

            public Builder mergeBaseRes(Event.DfuUpgradeMessage dfuUpgradeMessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).mergeBaseRes(dfuUpgradeMessage);
                return this;
            }

            public Builder mergeBatterySaverOff(Event.BatterySaverMode batterySaverMode) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).mergeBatterySaverOff(batterySaverMode);
                return this;
            }

            public Builder mergeBatterySaverOn(Event.BatterySaverMode batterySaverMode) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).mergeBatterySaverOn(batterySaverMode);
                return this;
            }

            public Builder mergeClosewifi(Event.wifiuseMessage wifiusemessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).mergeClosewifi(wifiusemessage);
                return this;
            }

            public Builder mergeDialtool(Event.DialtoolMessage dialtoolMessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).mergeDialtool(dialtoolMessage);
                return this;
            }

            public Builder mergeDndMode(Event.DndEventMessage dndEventMessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).mergeDndMode(dndEventMessage);
                return this;
            }

            public Builder mergeFirmware(Event.DfuUpgradeMessage dfuUpgradeMessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).mergeFirmware(dfuUpgradeMessage);
                return this;
            }

            public Builder mergeFont(Event.DfuUpgradeMessage dfuUpgradeMessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).mergeFont(dfuUpgradeMessage);
                return this;
            }

            public Builder mergeIncRes(Event.DfuUpgradeMessage dfuUpgradeMessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).mergeIncRes(dfuUpgradeMessage);
                return this;
            }

            public Builder mergeLightscreentime(Event.lightscreentimeMessage lightscreentimemessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).mergeLightscreentime(lightscreentimemessage);
                return this;
            }

            public Builder mergeNandMessage(Event.NandMessage nandMessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).mergeNandMessage(nandMessage);
                return this;
            }

            public Builder mergeStartwifi(Event.wifiuseMessage wifiusemessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).mergeStartwifi(wifiusemessage);
                return this;
            }

            public Builder removeNotify(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).removeNotify(i);
                return this;
            }

            public Builder removeNotifyExt(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).removeNotifyExt(i);
                return this;
            }

            public Builder removeSportStatus(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).removeSportStatus(i);
                return this;
            }

            public Builder setActivityTarget(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setActivityTarget(i);
                return this;
            }

            public Builder setActivityobjectives(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setActivityobjectives(i);
                return this;
            }

            public Builder setAddCardSuccess(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setAddCardSuccess(i);
                return this;
            }

            public Builder setAlarmreminder(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setAlarmreminder(i);
                return this;
            }

            public Builder setAlarmreminderclick(int i, int i2) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setAlarmreminderclick(i, i2);
                return this;
            }

            public Builder setAlipayBindSuccessNum(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setAlipayBindSuccessNum(i);
                return this;
            }

            public Builder setAplayscreen(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setAplayscreen(i);
                return this;
            }

            public Builder setAssistantVAD(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setAssistantVAD(i);
                return this;
            }

            public Builder setAssistantcarid(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setAssistantcarid(i);
                return this;
            }

            public Builder setAssistantinto(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setAssistantinto(i);
                return this;
            }

            public Builder setAutoLight(boolean z) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setAutoLight(z);
                return this;
            }

            public Builder setAutoScreenOffTime(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setAutoScreenOffTime(i);
                return this;
            }

            public Builder setBaseRes(Event.DfuUpgradeMessage dfuUpgradeMessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setBaseRes(dfuUpgradeMessage);
                return this;
            }

            public Builder setBatterySaverOff(Event.BatterySaverMode batterySaverMode) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setBatterySaverOff(batterySaverMode);
                return this;
            }

            public Builder setBatterySaverOn(Event.BatterySaverMode batterySaverMode) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setBatterySaverOn(batterySaverMode);
                return this;
            }

            public Builder setBindingSuccess(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setBindingSuccess(i);
                return this;
            }

            public Builder setBindsetlanguage(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setBindsetlanguage(i);
                return this;
            }

            public Builder setBleconnect(int i, int i2) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setBleconnect(i, i2);
                return this;
            }

            public Builder setBleconnectclose(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setBleconnectclose(i);
                return this;
            }

            public Builder setBleconnectfail(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setBleconnectfail(i);
                return this;
            }

            public Builder setBleconnectsuccess(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setBleconnectsuccess(i);
                return this;
            }

            public Builder setBlelistclick(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setBlelistclick(i);
                return this;
            }

            public Builder setBlestatus(int i, int i2) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setBlestatus(i, i2);
                return this;
            }

            public Builder setChangeBatteryValue(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setChangeBatteryValue(i);
                return this;
            }

            public Builder setClosewifi(Event.wifiuseMessage wifiusemessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setClosewifi(wifiusemessage);
                return this;
            }

            public Builder setCompassCalibrateSuccessNum(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setCompassCalibrateSuccessNum(i);
                return this;
            }

            public Builder setCountDownTimeup(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setCountDownTimeup(i);
                return this;
            }

            public Builder setCoutdowntime(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setCoutdowntime(i);
                return this;
            }

            public Builder setCurrentDialId(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setCurrentDialId(i);
                return this;
            }

            public Builder setCurrentDialNum(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setCurrentDialNum(i);
                return this;
            }

            public Builder setDialchangemode(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setDialchangemode(i);
                return this;
            }

            public Builder setDialtool(Event.DialtoolMessage dialtoolMessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setDialtool(dialtoolMessage);
                return this;
            }

            public Builder setDndMode(Event.DndEventMessage dndEventMessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setDndMode(dndEventMessage);
                return this;
            }

            public Builder setEventTimeUp(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setEventTimeUp(i);
                return this;
            }

            public Builder setFatDosfsck(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setFatDosfsck(i);
                return this;
            }

            public Builder setFatDropsize(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setFatDropsize(i);
                return this;
            }

            public Builder setFatDroptime(long j) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setFatDroptime(j);
                return this;
            }

            public Builder setFatFormat(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setFatFormat(i);
                return this;
            }

            public Builder setFatFreesize(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setFatFreesize(i);
                return this;
            }

            public Builder setFindPhone(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setFindPhone(i);
                return this;
            }

            public Builder setFindmoblie(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setFindmoblie(i);
                return this;
            }

            public Builder setFirmware(Event.DfuUpgradeMessage dfuUpgradeMessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setFirmware(dfuUpgradeMessage);
                return this;
            }

            public Builder setFlymode(int i, int i2) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setFlymode(i, i2);
                return this;
            }

            public Builder setFont(Event.DfuUpgradeMessage dfuUpgradeMessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setFont(dfuUpgradeMessage);
                return this;
            }

            public Builder setForgetWristOffLockPasswd(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setForgetWristOffLockPasswd(i);
                return this;
            }

            public Builder setGotoActivityPage(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoActivityPage(i);
                return this;
            }

            public Builder setGotoAlarmPage(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoAlarmPage(i);
                return this;
            }

            public Builder setGotoCompassPage(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoCompassPage(i);
                return this;
            }

            public Builder setGotoCountdownPage(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoCountdownPage(i);
                return this;
            }

            public Builder setGotoDialActivityPage(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoDialActivityPage(i);
                return this;
            }

            public Builder setGotoDialAlarmPage(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoDialAlarmPage(i);
                return this;
            }

            public Builder setGotoDialAlipayPage(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoDialAlipayPage(i);
                return this;
            }

            public Builder setGotoDialEventPage(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoDialEventPage(i);
                return this;
            }

            public Builder setGotoDialHeartPage(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoDialHeartPage(i);
                return this;
            }

            public Builder setGotoDialMusicPage(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoDialMusicPage(i);
                return this;
            }

            public Builder setGotoDialNfcCadePage(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoDialNfcCadePage(i);
                return this;
            }

            public Builder setGotoDialPaiPage(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoDialPaiPage(i);
                return this;
            }

            public Builder setGotoDialSportPage(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoDialSportPage(i);
                return this;
            }

            public Builder setGotoDialWeatherPage(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoDialWeatherPage(i);
                return this;
            }

            public Builder setGotoEventPage(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoEventPage(i);
                return this;
            }

            public Builder setGotoHeartPage(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoHeartPage(i);
                return this;
            }

            public Builder setGotoMusicPage(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoMusicPage(i);
                return this;
            }

            public Builder setGotoNfcCardPage(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoNfcCardPage(i);
                return this;
            }

            public Builder setGotoPaiPage(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoPaiPage(i);
                return this;
            }

            public Builder setGotoSpO2Page(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoSpO2Page(i);
                return this;
            }

            public Builder setGotoSportDetailPage(int i, int i2) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoSportDetailPage(i, i2);
                return this;
            }

            public Builder setGotoSportHistory(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoSportHistory(i);
                return this;
            }

            public Builder setGotoSportPage(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoSportPage(i);
                return this;
            }

            public Builder setGotoStopwatchPage(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoStopwatchPage(i);
                return this;
            }

            public Builder setGotoWeatherPage(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoWeatherPage(i);
                return this;
            }

            public Builder setGotoWeatherSecondPage(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoWeatherSecondPage(i);
                return this;
            }

            public Builder setGotosleep(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotosleep(i);
                return this;
            }

            public Builder setGotowakeup(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotowakeup(i);
                return this;
            }

            public Builder setIncRes(Event.DfuUpgradeMessage dfuUpgradeMessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setIncRes(dfuUpgradeMessage);
                return this;
            }

            public Builder setLanguageselect(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setLanguageselect(i);
                return this;
            }

            public Builder setLcdOff(int i, int i2) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setLcdOff(i, i2);
                return this;
            }

            public Builder setLcdOnBecauseOfWrist(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setLcdOnBecauseOfWrist(i);
                return this;
            }

            public Builder setLcdOnBecauseOfWristStatus(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setLcdOnBecauseOfWristStatus(i);
                return this;
            }

            public Builder setLightscreentime(Event.lightscreentimeMessage lightscreentimemessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setLightscreentime(lightscreentimemessage);
                return this;
            }

            public Builder setLightsetting(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setLightsetting(i);
                return this;
            }

            public Builder setLockScreen(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setLockScreen(i);
                return this;
            }

            public Builder setModifypwd(int i, int i2) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setModifypwd(i, i2);
                return this;
            }

            public Builder setNFCstatus(int i, int i2) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setNFCstatus(i, i2);
                return this;
            }

            public Builder setNandMessage(Event.NandMessage nandMessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setNandMessage(nandMessage);
                return this;
            }

            public Builder setNobindrecovery(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setNobindrecovery(i);
                return this;
            }

            public Builder setNobindsupervise(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setNobindsupervise(i);
                return this;
            }

            public Builder setNotify(int i, Event.NotifyMessage notifyMessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setNotify(i, notifyMessage);
                return this;
            }

            public Builder setNotifyExt(int i, Event.NotifyMessage notifyMessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setNotifyExt(i, notifyMessage);
                return this;
            }

            public Builder setOffwristlock(int i, int i2) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setOffwristlock(i, i2);
                return this;
            }

            public Builder setPowerOff(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setPowerOff(i);
                return this;
            }

            public Builder setPowerOffBatteryValue(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setPowerOffBatteryValue(i);
                return this;
            }

            public Builder setPowerOnBatteryValue(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setPowerOnBatteryValue(i);
                return this;
            }

            public Builder setPressureautomeasure(int i, int i2) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setPressureautomeasure(i, i2);
                return this;
            }

            public Builder setPressureinto(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setPressureinto(i);
                return this;
            }

            public Builder setPressuremeasureresult(int i, int i2) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setPressuremeasureresult(i, i2);
                return this;
            }

            public Builder setQNEgps(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setQNEgps(i);
                return this;
            }

            public Builder setQNEinto(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setQNEinto(i);
                return this;
            }

            public Builder setQuickAccessApp(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setQuickAccessApp(i);
                return this;
            }

            public Builder setQuickEntryApp(int i, boolean z) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setQuickEntryApp(i, z);
                return this;
            }

            public Builder setRateabnormalreminder(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setRateabnormalreminder(i);
                return this;
            }

            public Builder setRatemeasure(int i, int i2) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setRatemeasure(i, i2);
                return this;
            }

            public Builder setRatewarnreminder(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setRatewarnreminder(i);
                return this;
            }

            public Builder setRebootNum(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setRebootNum(i);
                return this;
            }

            public Builder setRecoverymode(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setRecoverymode(i);
                return this;
            }

            public Builder setRemindershock(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setRemindershock(i);
                return this;
            }

            public Builder setReminderstand(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setReminderstand(i);
                return this;
            }

            public Builder setReminderstandcomplete(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setReminderstandcomplete(i);
                return this;
            }

            public Builder setRingreminder(int i, int i2) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setRingreminder(i, i2);
                return this;
            }

            public Builder setScheduledelete(int i, int i2) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setScheduledelete(i, i2);
                return this;
            }

            public Builder setScheduleedit(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setScheduleedit(i);
                return this;
            }

            public Builder setSchedulereminderclick(int i, int i2) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSchedulereminderclick(i, i2);
                return this;
            }

            public Builder setSeePAIexplain(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSeePAIexplain(i);
                return this;
            }

            public Builder setSeePAIrate(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSeePAIrate(i);
                return this;
            }

            public Builder setSetAlarm(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSetAlarm(i);
                return this;
            }

            public Builder setSleepgoal(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSleepgoal(i);
                return this;
            }

            public Builder setSleepreminder(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSleepreminder(i);
                return this;
            }

            public Builder setSleepscreen(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSleepscreen(i);
                return this;
            }

            public Builder setSleepstop(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSleepstop(i);
                return this;
            }

            public Builder setSpo2Calc(int i, int i2) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSpo2Calc(i, i2);
                return this;
            }

            public Builder setSportIndoorCalibrate(int i, int i2) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSportIndoorCalibrate(i, i2);
                return this;
            }

            public Builder setSportStatus(int i, Event.SportStatusMessage sportStatusMessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSportStatus(i, sportStatusMessage);
                return this;
            }

            public Builder setSportremindersave(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSportremindersave(i);
                return this;
            }

            public Builder setStartwifi(Event.wifiuseMessage wifiusemessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setStartwifi(wifiusemessage);
                return this;
            }

            public Builder setStopwatchreset(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setStopwatchreset(i);
                return this;
            }

            public Builder setStopwatchstart(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setStopwatchstart(i);
                return this;
            }

            public Builder setSwimPoolLength(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSwimPoolLength(i);
                return this;
            }

            public Builder setSysVibration(boolean z) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSysVibration(z);
                return this;
            }

            public Builder setSystemUpdateCancle(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSystemUpdateCancle(i);
                return this;
            }

            public Builder setSystemUpdateImmediately(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSystemUpdateImmediately(i);
                return this;
            }

            public Builder setTurnOnTheaterMode(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setTurnOnTheaterMode(i);
                return this;
            }

            public Builder setTurnOnkeepWatchAwake(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setTurnOnkeepWatchAwake(i);
                return this;
            }

            public Builder setUnlock(int i, int i2) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setUnlock(i, i2);
                return this;
            }

            public Builder setUpdataerrscreen(int i, int i2) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setUpdataerrscreen(i, i2);
                return this;
            }

            public Builder setUpdataimmediatelyscreen(int i, int i2) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setUpdataimmediatelyscreen(i, i2);
                return this;
            }

            public Builder setUpdateFail(int i, int i2) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setUpdateFail(i, i2);
                return this;
            }

            public Builder setUpdatebyuser(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setUpdatebyuser(i);
                return this;
            }

            public Builder setUseStopwatch(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setUseStopwatch(i);
                return this;
            }

            public Builder setUsecarcount(int i, int i2) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setUsecarcount(i, i2);
                return this;
            }

            public Builder setVolbycontrol(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setVolbycontrol(i);
                return this;
            }

            public Builder setVolbysetting(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setVolbysetting(i);
                return this;
            }

            public Builder setVolsetcount(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setVolsetcount(i);
                return this;
            }

            public Builder setWatchdir(boolean z) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setWatchdir(z);
                return this;
            }

            public Builder setWifiTipspage(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setWifiTipspage(i);
                return this;
            }

            public Builder setWifipwdcorrect(int i) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setWifipwdcorrect(i);
                return this;
            }

            public Builder setWristOffLockStatus(boolean z) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setWristOffLockStatus(z);
                return this;
            }

            private Builder() {
                super(onyxEventMessage.DEFAULT_INSTANCE);
            }

            public Builder addNotify(int i, Event.NotifyMessage notifyMessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addNotify(i, notifyMessage);
                return this;
            }

            public Builder addNotifyExt(int i, Event.NotifyMessage notifyMessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addNotifyExt(i, notifyMessage);
                return this;
            }

            public Builder addSportStatus(int i, Event.SportStatusMessage sportStatusMessage) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addSportStatus(i, sportStatusMessage);
                return this;
            }

            public Builder setBaseRes(Event.DfuUpgradeMessage.Builder builder) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setBaseRes(builder.build());
                return this;
            }

            public Builder setBatterySaverOff(Event.BatterySaverMode.Builder builder) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setBatterySaverOff(builder.build());
                return this;
            }

            public Builder setBatterySaverOn(Event.BatterySaverMode.Builder builder) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setBatterySaverOn(builder.build());
                return this;
            }

            public Builder setClosewifi(Event.wifiuseMessage.Builder builder) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setClosewifi(builder.build());
                return this;
            }

            public Builder setDialtool(Event.DialtoolMessage.Builder builder) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setDialtool(builder.build());
                return this;
            }

            public Builder setDndMode(Event.DndEventMessage.Builder builder) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setDndMode(builder.build());
                return this;
            }

            public Builder setFirmware(Event.DfuUpgradeMessage.Builder builder) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setFirmware(builder.build());
                return this;
            }

            public Builder setFont(Event.DfuUpgradeMessage.Builder builder) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setFont(builder.build());
                return this;
            }

            public Builder setIncRes(Event.DfuUpgradeMessage.Builder builder) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setIncRes(builder.build());
                return this;
            }

            public Builder setLightscreentime(Event.lightscreentimeMessage.Builder builder) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setLightscreentime(builder.build());
                return this;
            }

            public Builder setNandMessage(Event.NandMessage.Builder builder) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setNandMessage(builder.build());
                return this;
            }

            public Builder setNotify(int i, Event.NotifyMessage.Builder builder) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setNotify(i, builder.build());
                return this;
            }

            public Builder setNotifyExt(int i, Event.NotifyMessage.Builder builder) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setNotifyExt(i, builder.build());
                return this;
            }

            public Builder setSportStatus(int i, Event.SportStatusMessage.Builder builder) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSportStatus(i, builder.build());
                return this;
            }

            public Builder setStartwifi(Event.wifiuseMessage.Builder builder) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setStartwifi(builder.build());
                return this;
            }

            public Builder addNotify(Event.NotifyMessage.Builder builder) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addNotify(builder.build());
                return this;
            }

            public Builder addNotifyExt(Event.NotifyMessage.Builder builder) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addNotifyExt(builder.build());
                return this;
            }

            public Builder addSportStatus(Event.SportStatusMessage.Builder builder) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addSportStatus(builder.build());
                return this;
            }

            public Builder addNotify(int i, Event.NotifyMessage.Builder builder) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addNotify(i, builder.build());
                return this;
            }

            public Builder addNotifyExt(int i, Event.NotifyMessage.Builder builder) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addNotifyExt(i, builder.build());
                return this;
            }

            public Builder addSportStatus(int i, Event.SportStatusMessage.Builder builder) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addSportStatus(i, builder.build());
                return this;
            }
        }

        static {
            onyxEventMessage onyxeventmessage = new onyxEventMessage();
            DEFAULT_INSTANCE = onyxeventmessage;
            GeneratedMessageLite.registerDefaultInstance(onyxEventMessage.class, onyxeventmessage);
        }

        private onyxEventMessage() {
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
        public void addAllNotifyExt(Iterable<? extends Event.NotifyMessage> iterable) {
            ensureNotifyExtIsMutable();
            b.addAll((Iterable) iterable, (List) this.notifyExt_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOffwristlock(Iterable<? extends Integer> iterable) {
            ensureOffwristlockIsMutable();
            b.addAll((Iterable) iterable, (List) this.offwristlock_);
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
        public void addNotifyExt(Event.NotifyMessage notifyMessage) {
            notifyMessage.getClass();
            ensureNotifyExtIsMutable();
            this.notifyExt_.add(notifyMessage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOffwristlock(int i) {
            ensureOffwristlockIsMutable();
            this.offwristlock_.Q(i);
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
            this.bitField3_ &= -9;
            this.activityobjectives_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddCardSuccess() {
            this.bitField1_ &= -129;
            this.addCardSuccess_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmreminder() {
            this.bitField2_ &= -16385;
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
            this.bitField2_ &= -1073741825;
            this.aplayscreen_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssistantVAD() {
            this.bitField3_ &= -3;
            this.assistantVAD_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssistantcarid() {
            this.bitField2_ &= Integer.MAX_VALUE;
            this.assistantcarid_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssistantinto() {
            this.bitField3_ &= -2;
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
            this.bitField3_ &= -1048577;
            this.bindsetlanguage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBleconnect() {
            this.bleconnect_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBleconnectclose() {
            this.bitField2_ &= -1048577;
            this.bleconnectclose_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBleconnectfail() {
            this.bitField2_ &= -262145;
            this.bleconnectfail_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBleconnectsuccess() {
            this.bitField2_ &= -131073;
            this.bleconnectsuccess_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBlelistclick() {
            this.bitField2_ &= -524289;
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
            this.bitField2_ &= -16777217;
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
            this.bitField2_ &= -257;
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
            this.bitField3_ &= -5;
            this.dialchangemode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialtool() {
            this.dialtool_ = null;
            this.bitField2_ &= -129;
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
            this.bitField3_ &= -2049;
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
            this.bitField3_ &= -4097;
            this.gotosleep_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotowakeup() {
            this.bitField3_ &= -8193;
            this.gotowakeup_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIncRes() {
            this.incRes_ = null;
            this.bitField2_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLanguageselect() {
            this.bitField2_ &= -2097153;
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
            this.bitField2_ &= -4194305;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLightsetting() {
            this.bitField3_ &= -257;
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
            this.bitField3_ &= -262145;
            this.nobindrecovery_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNobindsupervise() {
            this.bitField3_ &= -524289;
            this.nobindsupervise_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotify() {
            this.notify_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotifyExt() {
            this.notifyExt_ = GeneratedMessageLite.emptyProtobufList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOffwristlock() {
            this.offwristlock_ = GeneratedMessageLite.emptyIntList();
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
            this.bitField2_ &= -536870913;
            this.pressureinto_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPressuremeasureresult() {
            this.pressuremeasureresult_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQNEgps() {
            this.bitField2_ &= -65537;
            this.qNEgps_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQNEinto() {
            this.bitField2_ &= -32769;
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
            this.bitField3_ &= -513;
            this.rateabnormalreminder_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRatemeasure() {
            this.ratemeasure_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRatewarnreminder() {
            this.bitField3_ &= -1025;
            this.ratewarnreminder_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRebootNum() {
            this.bitField1_ &= -513;
            this.rebootNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRecoverymode() {
            this.bitField2_ &= -2049;
            this.recoverymode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemindershock() {
            this.bitField2_ &= -17;
            this.remindershock_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReminderstand() {
            this.bitField2_ &= -513;
            this.reminderstand_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReminderstandcomplete() {
            this.bitField2_ &= -1025;
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
            this.bitField3_ &= -65;
            this.scheduleedit_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSchedulereminderclick() {
            this.schedulereminderclick_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSeePAIexplain() {
            this.bitField2_ &= -65;
            this.seePAIexplain_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSeePAIrate() {
            this.bitField2_ &= -33;
            this.seePAIrate_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSetAlarm() {
            this.bitField0_ &= -536870913;
            this.setAlarm_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSleepgoal() {
            this.bitField3_ &= -32769;
            this.sleepgoal_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSleepreminder() {
            this.bitField3_ &= -131073;
            this.sleepreminder_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSleepscreen() {
            this.bitField3_ &= -16385;
            this.sleepscreen_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSleepstop() {
            this.bitField3_ &= -65537;
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
            this.bitField3_ &= -4194305;
            this.sportremindersave_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartwifi() {
            this.startwifi_ = null;
            this.bitField2_ &= -8388609;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStopwatchreset() {
            this.bitField3_ &= -33;
            this.stopwatchreset_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStopwatchstart() {
            this.bitField3_ &= -17;
            this.stopwatchstart_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSwimPoolLength() {
            this.bitField1_ &= -8193;
            this.swimPoolLength_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSysVibration() {
            this.bitField2_ &= -268435457;
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
            this.bitField3_ &= -2097153;
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
        public void clearVolbycontrol() {
            this.bitField2_ &= -8193;
            this.volbycontrol_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVolbysetting() {
            this.bitField2_ &= -134217729;
            this.volbysetting_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVolsetcount() {
            this.bitField2_ &= -4097;
            this.volsetcount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWatchdir() {
            this.bitField3_ &= -129;
            this.watchdir_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWifiTipspage() {
            this.bitField2_ &= -33554433;
            this.wifiTipspage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWifipwdcorrect() {
            this.bitField2_ &= -67108865;
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

        private void ensureNotifyExtIsMutable() {
            d0.i<Event.NotifyMessage> iVar = this.notifyExt_;
            if (iVar.c()) {
                return;
            }
            this.notifyExt_ = GeneratedMessageLite.mutableCopy(iVar);
        }

        private void ensureNotifyIsMutable() {
            d0.i<Event.NotifyMessage> iVar = this.notify_;
            if (iVar.c()) {
                return;
            }
            this.notify_ = GeneratedMessageLite.mutableCopy(iVar);
        }

        private void ensureOffwristlockIsMutable() {
            d0.g gVar = this.offwristlock_;
            if (gVar.c()) {
                return;
            }
            this.offwristlock_ = GeneratedMessageLite.mutableCopy(gVar);
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

        public static onyxEventMessage getDefaultInstance() {
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
            this.bitField2_ |= 16777216;
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
            this.bitField2_ |= 128;
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
            this.bitField2_ |= 4194304;
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
            this.bitField2_ |= NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static onyxEventMessage parseDelimitedFrom(InputStream inputStream) {
            return (onyxEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static onyxEventMessage parseFrom(ByteBuffer byteBuffer) {
            return (onyxEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<onyxEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeNotify(int i) {
            ensureNotifyIsMutable();
            this.notify_.remove(i);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeNotifyExt(int i) {
            ensureNotifyExtIsMutable();
            this.notifyExt_.remove(i);
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
            this.bitField3_ |= 8;
            this.activityobjectives_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddCardSuccess(int i) {
            this.bitField1_ |= 128;
            this.addCardSuccess_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmreminder(int i) {
            this.bitField2_ |= 16384;
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
            this.bitField2_ |= 1073741824;
            this.aplayscreen_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssistantVAD(int i) {
            this.bitField3_ |= 2;
            this.assistantVAD_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssistantcarid(int i) {
            this.bitField2_ |= Integer.MIN_VALUE;
            this.assistantcarid_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssistantinto(int i) {
            this.bitField3_ |= 1;
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
            this.bitField3_ |= EventRecurrence.TH;
            this.bindsetlanguage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBleconnect(int i, int i2) {
            ensureBleconnectIsMutable();
            this.bleconnect_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBleconnectclose(int i) {
            this.bitField2_ |= EventRecurrence.TH;
            this.bleconnectclose_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBleconnectfail(int i) {
            this.bitField2_ |= 262144;
            this.bleconnectfail_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBleconnectsuccess(int i) {
            this.bitField2_ |= 131072;
            this.bleconnectsuccess_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBlelistclick(int i) {
            this.bitField2_ |= 524288;
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
            this.bitField2_ |= 16777216;
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
            this.bitField2_ |= 256;
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
            this.bitField3_ |= 4;
            this.dialchangemode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialtool(Event.DialtoolMessage dialtoolMessage) {
            dialtoolMessage.getClass();
            this.dialtool_ = dialtoolMessage;
            this.bitField2_ |= 128;
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
            this.bitField3_ |= 2048;
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
            this.bitField3_ |= 4096;
            this.gotosleep_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotowakeup(int i) {
            this.bitField3_ |= 8192;
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
            this.bitField2_ |= 2097152;
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
            this.bitField2_ |= 4194304;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLightsetting(int i) {
            this.bitField3_ |= 256;
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
            this.bitField3_ |= 262144;
            this.nobindrecovery_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNobindsupervise(int i) {
            this.bitField3_ |= 524288;
            this.nobindsupervise_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotify(int i, Event.NotifyMessage notifyMessage) {
            notifyMessage.getClass();
            ensureNotifyIsMutable();
            this.notify_.set(i, notifyMessage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotifyExt(int i, Event.NotifyMessage notifyMessage) {
            notifyMessage.getClass();
            ensureNotifyExtIsMutable();
            this.notifyExt_.set(i, notifyMessage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOffwristlock(int i, int i2) {
            ensureOffwristlockIsMutable();
            this.offwristlock_.K(i, i2);
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
            this.bitField2_ |= 536870912;
            this.pressureinto_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPressuremeasureresult(int i, int i2) {
            ensurePressuremeasureresultIsMutable();
            this.pressuremeasureresult_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQNEgps(int i) {
            this.bitField2_ |= 65536;
            this.qNEgps_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQNEinto(int i) {
            this.bitField2_ |= 32768;
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
            this.bitField3_ |= 512;
            this.rateabnormalreminder_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRatemeasure(int i, int i2) {
            ensureRatemeasureIsMutable();
            this.ratemeasure_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRatewarnreminder(int i) {
            this.bitField3_ |= 1024;
            this.ratewarnreminder_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRebootNum(int i) {
            this.bitField1_ |= 512;
            this.rebootNum_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRecoverymode(int i) {
            this.bitField2_ |= 2048;
            this.recoverymode_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemindershock(int i) {
            this.bitField2_ |= 16;
            this.remindershock_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReminderstand(int i) {
            this.bitField2_ |= 512;
            this.reminderstand_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReminderstandcomplete(int i) {
            this.bitField2_ |= 1024;
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
            this.bitField3_ |= 64;
            this.scheduleedit_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSchedulereminderclick(int i, int i2) {
            ensureSchedulereminderclickIsMutable();
            this.schedulereminderclick_.K(i, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSeePAIexplain(int i) {
            this.bitField2_ |= 64;
            this.seePAIexplain_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSeePAIrate(int i) {
            this.bitField2_ |= 32;
            this.seePAIrate_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSetAlarm(int i) {
            this.bitField0_ |= 536870912;
            this.setAlarm_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSleepgoal(int i) {
            this.bitField3_ |= 32768;
            this.sleepgoal_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSleepreminder(int i) {
            this.bitField3_ |= 131072;
            this.sleepreminder_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSleepscreen(int i) {
            this.bitField3_ |= 16384;
            this.sleepscreen_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSleepstop(int i) {
            this.bitField3_ |= 65536;
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
            this.bitField3_ |= 4194304;
            this.sportremindersave_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartwifi(Event.wifiuseMessage wifiusemessage) {
            wifiusemessage.getClass();
            this.startwifi_ = wifiusemessage;
            this.bitField2_ |= NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopwatchreset(int i) {
            this.bitField3_ |= 32;
            this.stopwatchreset_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopwatchstart(int i) {
            this.bitField3_ |= 16;
            this.stopwatchstart_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwimPoolLength(int i) {
            this.bitField1_ |= 8192;
            this.swimPoolLength_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSysVibration(boolean z) {
            this.bitField2_ |= 268435456;
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
            this.bitField3_ |= 2097152;
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
        public void setVolbycontrol(int i) {
            this.bitField2_ |= 8192;
            this.volbycontrol_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVolbysetting(int i) {
            this.bitField2_ |= 134217728;
            this.volbysetting_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVolsetcount(int i) {
            this.bitField2_ |= 4096;
            this.volsetcount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWatchdir(boolean z) {
            this.bitField3_ |= 128;
            this.watchdir_ = z;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWifiTipspage(int i) {
            this.bitField2_ |= 33554432;
            this.wifiTipspage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWifipwdcorrect(int i) {
            this.bitField2_ |= 67108864;
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
                    return new onyxEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0091\u0000\u0004\u0001\u0091\u0091\u0000\u001aK\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004\u001d\u0005ᔋ\u0003\u0006ᔋ\u0004\u0007ᔋ\u0005\bᔋ\u0006\tᔋ\u0007\nᔋ\b\u000bᔋ\t\fᔋ\n\rᔋ\u000b\u000eᔋ\f\u000fᔋ\r\u0010ᔋ\u000e\u0011ᔋ\u000f\u0012ᔋ\u0010\u0013ᔋ\u0011\u0014ᔋ\u0012\u0015ᔋ\u0013\u0016ᔋ\u0014\u0017ᔋ\u0015\u0018ᔋ\u0016\u0019ᔋ\u0017\u001aᔋ\u0018\u001bЛ\u001cᔋ\u0019\u001dᔋ\u001a\u001e\u001d\u001fᔋ\u001b \u001d!ᔋ\u001c\"\u001d#ᔋ\u001d$ᔋ\u001e%ᔋ\u001f&ᔋ 'ᔉ!(ᔉ\")ᔋ#*ᔋ$+ᔋ%,ᔋ&-ᔋ'.ᔋ(/ᔋ)0ᔋ*1ᔋ+2ᔋ,3\u001d4Л5\u001d6ᔋ-7ᔋ.8ᔉ/9ᔋ0:ᔋ1;ᔋ2<ᔋ3=ᔋ4>ᔇ5?ᔋ6@\u0019Aᔇ7Bᔋ8Cᔋ9Dᔉ:Eᔋ;Fᔄ<Gᔃ=Hᔋ>Iᔋ?Jᔉ@KᔉALᔉBMᔉCN\u001dO\u001dPဋDQဋERဋFSᐉGTဋHUဋIVဋJWဋKX\u001dYဋLZဋM[\u001d\\ဋN]\u001d^ဋO_ဋP`\u001da\u001db\u001dc\u001ddဋQeဋRfဋSgဋTh\u001di\u001dj\u001dkဋUlᐉVmᐉWnᐉXoဋYpဋZqဋ[rဇ\\s\u001dtဋ]u\u001dv\u001dwဋ^xဋ_yဋ`zဋa{ဋb|ဋc}ဋd~ဋe\u007f\u001d\u0080ဋf\u0081ဇg\u0082ဋh\u0083ဋi\u0084ဋj\u0085ဋk\u0086ဋl\u0087ဋm\u0088ဋn\u0089ဋo\u008aဋp\u008bဋq\u008cဋr\u008dဋs\u008eဋt\u008fဋu\u0090ဋv\u0091Л", new Object[]{"bitField0_", "bitField1_", "bitField2_", "bitField3_", "gotoCompassPage_", "gotoDialAlipayPage_", "gotoSportHistory_", "gotoSportDetailPage_", "gotoSportPage_", "gotoDialSportPage_", "gotoMusicPage_", "gotoDialMusicPage_", "gotoHeartPage_", "gotoDialHeartPage_", "gotoSpO2Page_", "gotoPaiPage_", "gotoDialPaiPage_", "gotoWeatherPage_", "gotoWeatherSecondPage_", "gotoDialWeatherPage_", "gotoEventPage_", "gotoDialEventPage_", "gotoAlarmPage_", "gotoDialAlarmPage_", "gotoStopwatchPage_", "gotoCountdownPage_", "gotoNfcCardPage_", "gotoDialNfcCadePage_", "gotoActivityPage_", "gotoDialActivityPage_", "notify_", Event.NotifyMessage.class, "compassCalibrateSuccessNum_", "alipayBindSuccessNum_", "spo2Calc_", "lcdOnBecauseOfWrist_", "lcdOff_", "eventTimeUp_", "unlock_", "setAlarm_", "useStopwatch_", "forgetWristOffLockPasswd_", "countDownTimeup_", "batterySaverOff_", "batterySaverOn_", "lockScreen_", "findPhone_", "turnOnTheaterMode_", "turnOnkeepWatchAwake_", "addCardSuccess_", "bindingSuccess_", "rebootNum_", "powerOff_", "systemUpdateImmediately_", "systemUpdateCancle_", "updateFail_", "sportStatus_", Event.SportStatusMessage.class, "sportIndoorCalibrate_", "swimPoolLength_", "activityTarget_", "dndMode_", "powerOffBatteryValue_", "powerOnBatteryValue_", "changeBatteryValue_", "autoScreenOffTime_", "lcdOnBecauseOfWristStatus_", "wristOffLockStatus_", "quickAccessApp_", "quickEntryApp_", "autoLight_", "currentDialId_", "currentDialNum_", "nandMessage_", "fatFreesize_", "fatDropsize_", "fatDroptime_", "fatFormat_", "fatDosfsck_", "firmware_", "baseRes_", "incRes_", "font_", "updataerrscreen_", "updataimmediatelyscreen_", "remindershock_", "seePAIrate_", "seePAIexplain_", "dialtool_", "coutdowntime_", "reminderstand_", "reminderstandcomplete_", "recoverymode_", "usecarcount_", "volsetcount_", "volbycontrol_", "offwristlock_", "alarmreminder_", "alarmreminderclick_", "qNEinto_", "qNEgps_", "schedulereminderclick_", "flymode_", "blestatus_", "bleconnect_", "bleconnectsuccess_", "bleconnectfail_", "blelistclick_", "bleconnectclose_", "modifypwd_", "nFCstatus_", "ringreminder_", "languageselect_", "lightscreentime_", "startwifi_", "closewifi_", "wifiTipspage_", "wifipwdcorrect_", "volbysetting_", "sysVibration_", "ratemeasure_", "pressureinto_", "pressureautomeasure_", "pressuremeasureresult_", "aplayscreen_", "assistantcarid_", "assistantinto_", "assistantVAD_", "dialchangemode_", "activityobjectives_", "stopwatchstart_", "stopwatchreset_", "scheduledelete_", "scheduleedit_", "watchdir_", "lightsetting_", "rateabnormalreminder_", "ratewarnreminder_", "findmoblie_", "gotosleep_", "gotowakeup_", "sleepscreen_", "sleepgoal_", "sleepstop_", "sleepreminder_", "nobindrecovery_", "nobindsupervise_", "bindsetlanguage_", "updatebyuser_", "sportremindersave_", "notifyExt_", Event.NotifyMessage.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<onyxEventMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (onyxEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getActivityTarget() {
            return this.activityTarget_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getActivityobjectives() {
            return this.activityobjectives_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getAddCardSuccess() {
            return this.addCardSuccess_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getAlarmreminder() {
            return this.alarmreminder_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getAlarmreminderclick(int i) {
            return this.alarmreminderclick_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getAlarmreminderclickCount() {
            return this.alarmreminderclick_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Integer> getAlarmreminderclickList() {
            return this.alarmreminderclick_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getAlipayBindSuccessNum() {
            return this.alipayBindSuccessNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getAplayscreen() {
            return this.aplayscreen_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getAssistantVAD() {
            return this.assistantVAD_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getAssistantcarid() {
            return this.assistantcarid_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getAssistantinto() {
            return this.assistantinto_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean getAutoLight() {
            return this.autoLight_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getAutoScreenOffTime() {
            return this.autoScreenOffTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public Event.DfuUpgradeMessage getBaseRes() {
            Event.DfuUpgradeMessage dfuUpgradeMessage = this.baseRes_;
            return dfuUpgradeMessage == null ? Event.DfuUpgradeMessage.getDefaultInstance() : dfuUpgradeMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public Event.BatterySaverMode getBatterySaverOff() {
            Event.BatterySaverMode batterySaverMode = this.batterySaverOff_;
            return batterySaverMode == null ? Event.BatterySaverMode.getDefaultInstance() : batterySaverMode;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public Event.BatterySaverMode getBatterySaverOn() {
            Event.BatterySaverMode batterySaverMode = this.batterySaverOn_;
            return batterySaverMode == null ? Event.BatterySaverMode.getDefaultInstance() : batterySaverMode;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getBindingSuccess() {
            return this.bindingSuccess_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getBindsetlanguage() {
            return this.bindsetlanguage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getBleconnect(int i) {
            return this.bleconnect_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getBleconnectCount() {
            return this.bleconnect_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Integer> getBleconnectList() {
            return this.bleconnect_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getBleconnectclose() {
            return this.bleconnectclose_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getBleconnectfail() {
            return this.bleconnectfail_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getBleconnectsuccess() {
            return this.bleconnectsuccess_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getBlelistclick() {
            return this.blelistclick_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getBlestatus(int i) {
            return this.blestatus_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getBlestatusCount() {
            return this.blestatus_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Integer> getBlestatusList() {
            return this.blestatus_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getChangeBatteryValue() {
            return this.changeBatteryValue_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public Event.wifiuseMessage getClosewifi() {
            Event.wifiuseMessage wifiusemessage = this.closewifi_;
            return wifiusemessage == null ? Event.wifiuseMessage.getDefaultInstance() : wifiusemessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getCompassCalibrateSuccessNum() {
            return this.compassCalibrateSuccessNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getCountDownTimeup() {
            return this.countDownTimeup_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getCoutdowntime() {
            return this.coutdowntime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getCurrentDialId() {
            return this.currentDialId_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getCurrentDialNum() {
            return this.currentDialNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getDialchangemode() {
            return this.dialchangemode_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public Event.DialtoolMessage getDialtool() {
            Event.DialtoolMessage dialtoolMessage = this.dialtool_;
            return dialtoolMessage == null ? Event.DialtoolMessage.getDefaultInstance() : dialtoolMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public Event.DndEventMessage getDndMode() {
            Event.DndEventMessage dndEventMessage = this.dndMode_;
            return dndEventMessage == null ? Event.DndEventMessage.getDefaultInstance() : dndEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getEventTimeUp() {
            return this.eventTimeUp_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getFatDosfsck() {
            return this.fatDosfsck_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getFatDropsize() {
            return this.fatDropsize_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public long getFatDroptime() {
            return this.fatDroptime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getFatFormat() {
            return this.fatFormat_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getFatFreesize() {
            return this.fatFreesize_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getFindPhone() {
            return this.findPhone_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getFindmoblie() {
            return this.findmoblie_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public Event.DfuUpgradeMessage getFirmware() {
            Event.DfuUpgradeMessage dfuUpgradeMessage = this.firmware_;
            return dfuUpgradeMessage == null ? Event.DfuUpgradeMessage.getDefaultInstance() : dfuUpgradeMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getFlymode(int i) {
            return this.flymode_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getFlymodeCount() {
            return this.flymode_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Integer> getFlymodeList() {
            return this.flymode_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public Event.DfuUpgradeMessage getFont() {
            Event.DfuUpgradeMessage dfuUpgradeMessage = this.font_;
            return dfuUpgradeMessage == null ? Event.DfuUpgradeMessage.getDefaultInstance() : dfuUpgradeMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getForgetWristOffLockPasswd() {
            return this.forgetWristOffLockPasswd_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotoActivityPage() {
            return this.gotoActivityPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotoAlarmPage() {
            return this.gotoAlarmPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotoCompassPage() {
            return this.gotoCompassPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotoCountdownPage() {
            return this.gotoCountdownPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotoDialActivityPage() {
            return this.gotoDialActivityPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotoDialAlarmPage() {
            return this.gotoDialAlarmPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotoDialAlipayPage() {
            return this.gotoDialAlipayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotoDialEventPage() {
            return this.gotoDialEventPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotoDialHeartPage() {
            return this.gotoDialHeartPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotoDialMusicPage() {
            return this.gotoDialMusicPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotoDialNfcCadePage() {
            return this.gotoDialNfcCadePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotoDialPaiPage() {
            return this.gotoDialPaiPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotoDialSportPage() {
            return this.gotoDialSportPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotoDialWeatherPage() {
            return this.gotoDialWeatherPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotoEventPage() {
            return this.gotoEventPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotoHeartPage() {
            return this.gotoHeartPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotoMusicPage() {
            return this.gotoMusicPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotoNfcCardPage() {
            return this.gotoNfcCardPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotoPaiPage() {
            return this.gotoPaiPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotoSpO2Page() {
            return this.gotoSpO2Page_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotoSportDetailPage(int i) {
            return this.gotoSportDetailPage_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotoSportDetailPageCount() {
            return this.gotoSportDetailPage_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Integer> getGotoSportDetailPageList() {
            return this.gotoSportDetailPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotoSportHistory() {
            return this.gotoSportHistory_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotoSportPage() {
            return this.gotoSportPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotoStopwatchPage() {
            return this.gotoStopwatchPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotoWeatherPage() {
            return this.gotoWeatherPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotoWeatherSecondPage() {
            return this.gotoWeatherSecondPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotosleep() {
            return this.gotosleep_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getGotowakeup() {
            return this.gotowakeup_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public Event.DfuUpgradeMessage getIncRes() {
            Event.DfuUpgradeMessage dfuUpgradeMessage = this.incRes_;
            return dfuUpgradeMessage == null ? Event.DfuUpgradeMessage.getDefaultInstance() : dfuUpgradeMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getLanguageselect() {
            return this.languageselect_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getLcdOff(int i) {
            return this.lcdOff_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getLcdOffCount() {
            return this.lcdOff_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Integer> getLcdOffList() {
            return this.lcdOff_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getLcdOnBecauseOfWrist() {
            return this.lcdOnBecauseOfWrist_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getLcdOnBecauseOfWristStatus() {
            return this.lcdOnBecauseOfWristStatus_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public Event.lightscreentimeMessage getLightscreentime() {
            Event.lightscreentimeMessage lightscreentimemessage = this.lightscreentime_;
            return lightscreentimemessage == null ? Event.lightscreentimeMessage.getDefaultInstance() : lightscreentimemessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getLightsetting() {
            return this.lightsetting_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getLockScreen() {
            return this.lockScreen_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getModifypwd(int i) {
            return this.modifypwd_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getModifypwdCount() {
            return this.modifypwd_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Integer> getModifypwdList() {
            return this.modifypwd_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getNFCstatus(int i) {
            return this.nFCstatus_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getNFCstatusCount() {
            return this.nFCstatus_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Integer> getNFCstatusList() {
            return this.nFCstatus_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public Event.NandMessage getNandMessage() {
            Event.NandMessage nandMessage = this.nandMessage_;
            return nandMessage == null ? Event.NandMessage.getDefaultInstance() : nandMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getNobindrecovery() {
            return this.nobindrecovery_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getNobindsupervise() {
            return this.nobindsupervise_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public Event.NotifyMessage getNotify(int i) {
            return this.notify_.get(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getNotifyCount() {
            return this.notify_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public Event.NotifyMessage getNotifyExt(int i) {
            return this.notifyExt_.get(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getNotifyExtCount() {
            return this.notifyExt_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Event.NotifyMessage> getNotifyExtList() {
            return this.notifyExt_;
        }

        public Event.NotifyMessageOrBuilder getNotifyExtOrBuilder(int i) {
            return this.notifyExt_.get(i);
        }

        public List<? extends Event.NotifyMessageOrBuilder> getNotifyExtOrBuilderList() {
            return this.notifyExt_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Event.NotifyMessage> getNotifyList() {
            return this.notify_;
        }

        public Event.NotifyMessageOrBuilder getNotifyOrBuilder(int i) {
            return this.notify_.get(i);
        }

        public List<? extends Event.NotifyMessageOrBuilder> getNotifyOrBuilderList() {
            return this.notify_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getOffwristlock(int i) {
            return this.offwristlock_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getOffwristlockCount() {
            return this.offwristlock_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Integer> getOffwristlockList() {
            return this.offwristlock_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getPowerOff() {
            return this.powerOff_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getPowerOffBatteryValue() {
            return this.powerOffBatteryValue_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getPowerOnBatteryValue() {
            return this.powerOnBatteryValue_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getPressureautomeasure(int i) {
            return this.pressureautomeasure_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getPressureautomeasureCount() {
            return this.pressureautomeasure_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Integer> getPressureautomeasureList() {
            return this.pressureautomeasure_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getPressureinto() {
            return this.pressureinto_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getPressuremeasureresult(int i) {
            return this.pressuremeasureresult_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getPressuremeasureresultCount() {
            return this.pressuremeasureresult_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Integer> getPressuremeasureresultList() {
            return this.pressuremeasureresult_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getQNEgps() {
            return this.qNEgps_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getQNEinto() {
            return this.qNEinto_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getQuickAccessApp() {
            return this.quickAccessApp_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean getQuickEntryApp(int i) {
            return this.quickEntryApp_.getBoolean(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getQuickEntryAppCount() {
            return this.quickEntryApp_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Boolean> getQuickEntryAppList() {
            return this.quickEntryApp_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getRateabnormalreminder() {
            return this.rateabnormalreminder_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getRatemeasure(int i) {
            return this.ratemeasure_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getRatemeasureCount() {
            return this.ratemeasure_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Integer> getRatemeasureList() {
            return this.ratemeasure_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getRatewarnreminder() {
            return this.ratewarnreminder_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getRebootNum() {
            return this.rebootNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getRecoverymode() {
            return this.recoverymode_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getRemindershock() {
            return this.remindershock_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getReminderstand() {
            return this.reminderstand_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getReminderstandcomplete() {
            return this.reminderstandcomplete_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getRingreminder(int i) {
            return this.ringreminder_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getRingreminderCount() {
            return this.ringreminder_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Integer> getRingreminderList() {
            return this.ringreminder_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getScheduledelete(int i) {
            return this.scheduledelete_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getScheduledeleteCount() {
            return this.scheduledelete_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Integer> getScheduledeleteList() {
            return this.scheduledelete_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getScheduleedit() {
            return this.scheduleedit_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getSchedulereminderclick(int i) {
            return this.schedulereminderclick_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getSchedulereminderclickCount() {
            return this.schedulereminderclick_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Integer> getSchedulereminderclickList() {
            return this.schedulereminderclick_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getSeePAIexplain() {
            return this.seePAIexplain_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getSeePAIrate() {
            return this.seePAIrate_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getSetAlarm() {
            return this.setAlarm_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getSleepgoal() {
            return this.sleepgoal_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getSleepreminder() {
            return this.sleepreminder_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getSleepscreen() {
            return this.sleepscreen_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getSleepstop() {
            return this.sleepstop_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getSpo2Calc(int i) {
            return this.spo2Calc_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getSpo2CalcCount() {
            return this.spo2Calc_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Integer> getSpo2CalcList() {
            return this.spo2Calc_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getSportIndoorCalibrate(int i) {
            return this.sportIndoorCalibrate_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getSportIndoorCalibrateCount() {
            return this.sportIndoorCalibrate_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Integer> getSportIndoorCalibrateList() {
            return this.sportIndoorCalibrate_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public Event.SportStatusMessage getSportStatus(int i) {
            return this.sportStatus_.get(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getSportStatusCount() {
            return this.sportStatus_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Event.SportStatusMessage> getSportStatusList() {
            return this.sportStatus_;
        }

        public Event.SportStatusMessageOrBuilder getSportStatusOrBuilder(int i) {
            return this.sportStatus_.get(i);
        }

        public List<? extends Event.SportStatusMessageOrBuilder> getSportStatusOrBuilderList() {
            return this.sportStatus_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getSportremindersave() {
            return this.sportremindersave_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public Event.wifiuseMessage getStartwifi() {
            Event.wifiuseMessage wifiusemessage = this.startwifi_;
            return wifiusemessage == null ? Event.wifiuseMessage.getDefaultInstance() : wifiusemessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getStopwatchreset() {
            return this.stopwatchreset_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getStopwatchstart() {
            return this.stopwatchstart_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getSwimPoolLength() {
            return this.swimPoolLength_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean getSysVibration() {
            return this.sysVibration_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getSystemUpdateCancle() {
            return this.systemUpdateCancle_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getSystemUpdateImmediately() {
            return this.systemUpdateImmediately_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getTurnOnTheaterMode() {
            return this.turnOnTheaterMode_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getTurnOnkeepWatchAwake() {
            return this.turnOnkeepWatchAwake_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getUnlock(int i) {
            return this.unlock_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getUnlockCount() {
            return this.unlock_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Integer> getUnlockList() {
            return this.unlock_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getUpdataerrscreen(int i) {
            return this.updataerrscreen_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getUpdataerrscreenCount() {
            return this.updataerrscreen_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Integer> getUpdataerrscreenList() {
            return this.updataerrscreen_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getUpdataimmediatelyscreen(int i) {
            return this.updataimmediatelyscreen_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getUpdataimmediatelyscreenCount() {
            return this.updataimmediatelyscreen_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Integer> getUpdataimmediatelyscreenList() {
            return this.updataimmediatelyscreen_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getUpdateFail(int i) {
            return this.updateFail_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getUpdateFailCount() {
            return this.updateFail_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Integer> getUpdateFailList() {
            return this.updateFail_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getUpdatebyuser() {
            return this.updatebyuser_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getUseStopwatch() {
            return this.useStopwatch_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getUsecarcount(int i) {
            return this.usecarcount_.getInt(i);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getUsecarcountCount() {
            return this.usecarcount_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Integer> getUsecarcountList() {
            return this.usecarcount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getVolbycontrol() {
            return this.volbycontrol_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getVolbysetting() {
            return this.volbysetting_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getVolsetcount() {
            return this.volsetcount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean getWatchdir() {
            return this.watchdir_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getWifiTipspage() {
            return this.wifiTipspage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getWifipwdcorrect() {
            return this.wifipwdcorrect_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean getWristOffLockStatus() {
            return this.wristOffLockStatus_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasActivityTarget() {
            return (this.bitField1_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasActivityobjectives() {
            return (this.bitField3_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasAddCardSuccess() {
            return (this.bitField1_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasAlarmreminder() {
            return (this.bitField2_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasAlipayBindSuccessNum() {
            return (this.bitField0_ & 67108864) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasAplayscreen() {
            return (this.bitField2_ & 1073741824) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasAssistantVAD() {
            return (this.bitField3_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasAssistantcarid() {
            return (this.bitField2_ & Integer.MIN_VALUE) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasAssistantinto() {
            return (this.bitField3_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasAutoLight() {
            return (this.bitField1_ & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasAutoScreenOffTime() {
            return (this.bitField1_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasBaseRes() {
            return (this.bitField2_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasBatterySaverOff() {
            return (this.bitField1_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasBatterySaverOn() {
            return (this.bitField1_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasBindingSuccess() {
            return (this.bitField1_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasBindsetlanguage() {
            return (this.bitField3_ & EventRecurrence.TH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasBleconnectclose() {
            return (this.bitField2_ & EventRecurrence.TH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasBleconnectfail() {
            return (this.bitField2_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasBleconnectsuccess() {
            return (this.bitField2_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasBlelistclick() {
            return (this.bitField2_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasChangeBatteryValue() {
            return (this.bitField1_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasClosewifi() {
            return (this.bitField2_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasCompassCalibrateSuccessNum() {
            return (this.bitField0_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasCountDownTimeup() {
            return (this.bitField1_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasCoutdowntime() {
            return (this.bitField2_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasCurrentDialId() {
            return (this.bitField1_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasCurrentDialNum() {
            return (this.bitField1_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasDialchangemode() {
            return (this.bitField3_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasDialtool() {
            return (this.bitField2_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasDndMode() {
            return (this.bitField1_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasEventTimeUp() {
            return (this.bitField0_ & 268435456) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasFatDosfsck() {
            return (this.bitField1_ & Integer.MIN_VALUE) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasFatDropsize() {
            return (this.bitField1_ & 268435456) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasFatDroptime() {
            return (this.bitField1_ & 536870912) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasFatFormat() {
            return (this.bitField1_ & 1073741824) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasFatFreesize() {
            return (this.bitField1_ & 134217728) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasFindPhone() {
            return (this.bitField1_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasFindmoblie() {
            return (this.bitField3_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasFirmware() {
            return (this.bitField2_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasFont() {
            return (this.bitField2_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasForgetWristOffLockPasswd() {
            return (this.bitField0_ & Integer.MIN_VALUE) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasGotoActivityPage() {
            return (this.bitField0_ & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasGotoAlarmPage() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasGotoCompassPage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasGotoCountdownPage() {
            return (this.bitField0_ & EventRecurrence.TH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasGotoDialActivityPage() {
            return (this.bitField0_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasGotoDialAlarmPage() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasGotoDialAlipayPage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasGotoDialEventPage() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasGotoDialHeartPage() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasGotoDialMusicPage() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasGotoDialNfcCadePage() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasGotoDialPaiPage() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasGotoDialSportPage() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasGotoDialWeatherPage() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasGotoEventPage() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasGotoHeartPage() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasGotoMusicPage() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasGotoNfcCardPage() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasGotoPaiPage() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasGotoSpO2Page() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasGotoSportHistory() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasGotoSportPage() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasGotoStopwatchPage() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasGotoWeatherPage() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasGotoWeatherSecondPage() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasGotosleep() {
            return (this.bitField3_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasGotowakeup() {
            return (this.bitField3_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasIncRes() {
            return (this.bitField2_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasLanguageselect() {
            return (this.bitField2_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfWrist() {
            return (this.bitField0_ & 134217728) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfWristStatus() {
            return (this.bitField1_ & EventRecurrence.TH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasLightscreentime() {
            return (this.bitField2_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasLightsetting() {
            return (this.bitField3_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasLockScreen() {
            return (this.bitField1_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasNandMessage() {
            return (this.bitField1_ & 67108864) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasNobindrecovery() {
            return (this.bitField3_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasNobindsupervise() {
            return (this.bitField3_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasPowerOff() {
            return (this.bitField1_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasPowerOffBatteryValue() {
            return (this.bitField1_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasPowerOnBatteryValue() {
            return (this.bitField1_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasPressureinto() {
            return (this.bitField2_ & 536870912) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasQNEgps() {
            return (this.bitField2_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasQNEinto() {
            return (this.bitField2_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasQuickAccessApp() {
            return (this.bitField1_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasRateabnormalreminder() {
            return (this.bitField3_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasRatewarnreminder() {
            return (this.bitField3_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasRebootNum() {
            return (this.bitField1_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasRecoverymode() {
            return (this.bitField2_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasRemindershock() {
            return (this.bitField2_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasReminderstand() {
            return (this.bitField2_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasReminderstandcomplete() {
            return (this.bitField2_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasScheduleedit() {
            return (this.bitField3_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasSeePAIexplain() {
            return (this.bitField2_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasSeePAIrate() {
            return (this.bitField2_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasSetAlarm() {
            return (this.bitField0_ & 536870912) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasSleepgoal() {
            return (this.bitField3_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasSleepreminder() {
            return (this.bitField3_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasSleepscreen() {
            return (this.bitField3_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasSleepstop() {
            return (this.bitField3_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasSportremindersave() {
            return (this.bitField3_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasStartwifi() {
            return (this.bitField2_ & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasStopwatchreset() {
            return (this.bitField3_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasStopwatchstart() {
            return (this.bitField3_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasSwimPoolLength() {
            return (this.bitField1_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasSysVibration() {
            return (this.bitField2_ & 268435456) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasSystemUpdateCancle() {
            return (this.bitField1_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasSystemUpdateImmediately() {
            return (this.bitField1_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasTurnOnTheaterMode() {
            return (this.bitField1_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasTurnOnkeepWatchAwake() {
            return (this.bitField1_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasUpdatebyuser() {
            return (this.bitField3_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasUseStopwatch() {
            return (this.bitField0_ & 1073741824) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasVolbycontrol() {
            return (this.bitField2_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasVolbysetting() {
            return (this.bitField2_ & 134217728) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasVolsetcount() {
            return (this.bitField2_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasWatchdir() {
            return (this.bitField3_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasWifiTipspage() {
            return (this.bitField2_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasWifipwdcorrect() {
            return (this.bitField2_ & 67108864) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasWristOffLockStatus() {
            return (this.bitField1_ & 2097152) != 0;
        }

        public static Builder newBuilder(onyxEventMessage onyxeventmessage) {
            return DEFAULT_INSTANCE.createBuilder(onyxeventmessage);
        }

        public static onyxEventMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (onyxEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static onyxEventMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (onyxEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static onyxEventMessage parseFrom(ByteString byteString) {
            return (onyxEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNotify(int i, Event.NotifyMessage notifyMessage) {
            notifyMessage.getClass();
            ensureNotifyIsMutable();
            this.notify_.add(i, notifyMessage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNotifyExt(int i, Event.NotifyMessage notifyMessage) {
            notifyMessage.getClass();
            ensureNotifyExtIsMutable();
            this.notifyExt_.add(i, notifyMessage);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSportStatus(int i, Event.SportStatusMessage sportStatusMessage) {
            sportStatusMessage.getClass();
            ensureSportStatusIsMutable();
            this.sportStatus_.add(i, sportStatusMessage);
        }

        public static onyxEventMessage parseFrom(ByteString byteString, t tVar) {
            return (onyxEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static onyxEventMessage parseFrom(byte[] bArr) {
            return (onyxEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static onyxEventMessage parseFrom(byte[] bArr, t tVar) {
            return (onyxEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static onyxEventMessage parseFrom(InputStream inputStream) {
            return (onyxEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static onyxEventMessage parseFrom(InputStream inputStream, t tVar) {
            return (onyxEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static onyxEventMessage parseFrom(j jVar) {
            return (onyxEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static onyxEventMessage parseFrom(j jVar, t tVar) {
            return (onyxEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface onyxEventMessageOrBuilder extends bsf {
        int getActivityTarget();

        int getActivityobjectives();

        int getAddCardSuccess();

        int getAlarmreminder();

        int getAlarmreminderclick(int i);

        int getAlarmreminderclickCount();

        List<Integer> getAlarmreminderclickList();

        int getAlipayBindSuccessNum();

        int getAplayscreen();

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

        Event.NotifyMessage getNotifyExt(int i);

        int getNotifyExtCount();

        List<Event.NotifyMessage> getNotifyExtList();

        List<Event.NotifyMessage> getNotifyList();

        int getOffwristlock(int i);

        int getOffwristlockCount();

        List<Integer> getOffwristlockList();

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

    public static final class onyxStatisticsMessage extends GeneratedMessageLite<onyxStatisticsMessage, Builder> implements onyxStatisticsMessageOrBuilder {
        public static final int BACKLIGHTLEVEL_FIELD_NUMBER = 3;
        public static final int BASE_FIELD_NUMBER = 1;
        private static final onyxStatisticsMessage DEFAULT_INSTANCE;
        public static final int EVENT_FIELD_NUMBER = 4;
        public static final int NFC_FIELD_NUMBER = 5;
        private static volatile vkh<onyxStatisticsMessage> PARSER = null;
        public static final int SILENCEMODE_FIELD_NUMBER = 2;
        private int backlightLevel_;
        private StatisBase.StatisBaseMessage base_;
        private int bitField0_;
        private onyxEventMessage event_;
        private byte memoizedIsInitialized = 2;
        private Nfc.NfcMessage nfc_;
        private int silenceMode_;

        public static final class Builder extends GeneratedMessageLite.a<onyxStatisticsMessage, Builder> implements onyxStatisticsMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBacklightLevel() {
                copyOnWrite();
                ((onyxStatisticsMessage) this.instance).clearBacklightLevel();
                return this;
            }

            public Builder clearBase() {
                copyOnWrite();
                ((onyxStatisticsMessage) this.instance).clearBase();
                return this;
            }

            public Builder clearEvent() {
                copyOnWrite();
                ((onyxStatisticsMessage) this.instance).clearEvent();
                return this;
            }

            public Builder clearNfc() {
                copyOnWrite();
                ((onyxStatisticsMessage) this.instance).clearNfc();
                return this;
            }

            public Builder clearSilenceMode() {
                copyOnWrite();
                ((onyxStatisticsMessage) this.instance).clearSilenceMode();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxStatisticsMessageOrBuilder
            public int getBacklightLevel() {
                return ((onyxStatisticsMessage) this.instance).getBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxStatisticsMessageOrBuilder
            public StatisBase.StatisBaseMessage getBase() {
                return ((onyxStatisticsMessage) this.instance).getBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxStatisticsMessageOrBuilder
            public onyxEventMessage getEvent() {
                return ((onyxStatisticsMessage) this.instance).getEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxStatisticsMessageOrBuilder
            public Nfc.NfcMessage getNfc() {
                return ((onyxStatisticsMessage) this.instance).getNfc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxStatisticsMessageOrBuilder
            public SilenceModeOuterClass.SilenceMode getSilenceMode() {
                return ((onyxStatisticsMessage) this.instance).getSilenceMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxStatisticsMessageOrBuilder
            public boolean hasBacklightLevel() {
                return ((onyxStatisticsMessage) this.instance).hasBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxStatisticsMessageOrBuilder
            public boolean hasBase() {
                return ((onyxStatisticsMessage) this.instance).hasBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxStatisticsMessageOrBuilder
            public boolean hasEvent() {
                return ((onyxStatisticsMessage) this.instance).hasEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxStatisticsMessageOrBuilder
            public boolean hasNfc() {
                return ((onyxStatisticsMessage) this.instance).hasNfc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxStatisticsMessageOrBuilder
            public boolean hasSilenceMode() {
                return ((onyxStatisticsMessage) this.instance).hasSilenceMode();
            }

            public Builder mergeBase(StatisBase.StatisBaseMessage statisBaseMessage) {
                copyOnWrite();
                ((onyxStatisticsMessage) this.instance).mergeBase(statisBaseMessage);
                return this;
            }

            public Builder mergeEvent(onyxEventMessage onyxeventmessage) {
                copyOnWrite();
                ((onyxStatisticsMessage) this.instance).mergeEvent(onyxeventmessage);
                return this;
            }

            public Builder mergeNfc(Nfc.NfcMessage nfcMessage) {
                copyOnWrite();
                ((onyxStatisticsMessage) this.instance).mergeNfc(nfcMessage);
                return this;
            }

            public Builder setBacklightLevel(int i) {
                copyOnWrite();
                ((onyxStatisticsMessage) this.instance).setBacklightLevel(i);
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage statisBaseMessage) {
                copyOnWrite();
                ((onyxStatisticsMessage) this.instance).setBase(statisBaseMessage);
                return this;
            }

            public Builder setEvent(onyxEventMessage onyxeventmessage) {
                copyOnWrite();
                ((onyxStatisticsMessage) this.instance).setEvent(onyxeventmessage);
                return this;
            }

            public Builder setNfc(Nfc.NfcMessage nfcMessage) {
                copyOnWrite();
                ((onyxStatisticsMessage) this.instance).setNfc(nfcMessage);
                return this;
            }

            public Builder setSilenceMode(SilenceModeOuterClass.SilenceMode silenceMode) {
                copyOnWrite();
                ((onyxStatisticsMessage) this.instance).setSilenceMode(silenceMode);
                return this;
            }

            private Builder() {
                super(onyxStatisticsMessage.DEFAULT_INSTANCE);
            }

            public Builder setBase(StatisBase.StatisBaseMessage.Builder builder) {
                copyOnWrite();
                ((onyxStatisticsMessage) this.instance).setBase(builder.build());
                return this;
            }

            public Builder setEvent(onyxEventMessage.Builder builder) {
                copyOnWrite();
                ((onyxStatisticsMessage) this.instance).setEvent(builder.build());
                return this;
            }

            public Builder setNfc(Nfc.NfcMessage.Builder builder) {
                copyOnWrite();
                ((onyxStatisticsMessage) this.instance).setNfc(builder.build());
                return this;
            }
        }

        static {
            onyxStatisticsMessage onyxstatisticsmessage = new onyxStatisticsMessage();
            DEFAULT_INSTANCE = onyxstatisticsmessage;
            GeneratedMessageLite.registerDefaultInstance(onyxStatisticsMessage.class, onyxstatisticsmessage);
        }

        private onyxStatisticsMessage() {
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

        public static onyxStatisticsMessage getDefaultInstance() {
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
        public void mergeEvent(onyxEventMessage onyxeventmessage) {
            onyxeventmessage.getClass();
            onyxEventMessage onyxeventmessage2 = this.event_;
            if (onyxeventmessage2 == null || onyxeventmessage2 == onyxEventMessage.getDefaultInstance()) {
                this.event_ = onyxeventmessage;
            } else {
                this.event_ = onyxEventMessage.newBuilder(this.event_).mergeFrom(onyxeventmessage).buildPartial();
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

        public static onyxStatisticsMessage parseDelimitedFrom(InputStream inputStream) {
            return (onyxStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static onyxStatisticsMessage parseFrom(ByteBuffer byteBuffer) {
            return (onyxStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<onyxStatisticsMessage> parser() {
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
        public void setEvent(onyxEventMessage onyxeventmessage) {
            onyxeventmessage.getClass();
            this.event_ = onyxeventmessage;
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
                    return new onyxStatisticsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001ᔉ\u0000\u0002ᔌ\u0001\u0003ᔋ\u0002\u0004ᔉ\u0003\u0005ᐉ\u0004", new Object[]{"bitField0_", "base_", "silenceMode_", SilenceModeOuterClass.SilenceMode.internalGetVerifier(), "backlightLevel_", "event_", "nfc_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<onyxStatisticsMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (onyxStatisticsMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxStatisticsMessageOrBuilder
        public int getBacklightLevel() {
            return this.backlightLevel_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxStatisticsMessageOrBuilder
        public StatisBase.StatisBaseMessage getBase() {
            StatisBase.StatisBaseMessage statisBaseMessage = this.base_;
            return statisBaseMessage == null ? StatisBase.StatisBaseMessage.getDefaultInstance() : statisBaseMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxStatisticsMessageOrBuilder
        public onyxEventMessage getEvent() {
            onyxEventMessage onyxeventmessage = this.event_;
            return onyxeventmessage == null ? onyxEventMessage.getDefaultInstance() : onyxeventmessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxStatisticsMessageOrBuilder
        public Nfc.NfcMessage getNfc() {
            Nfc.NfcMessage nfcMessage = this.nfc_;
            return nfcMessage == null ? Nfc.NfcMessage.getDefaultInstance() : nfcMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxStatisticsMessageOrBuilder
        public SilenceModeOuterClass.SilenceMode getSilenceMode() {
            SilenceModeOuterClass.SilenceMode silenceModeForNumber = SilenceModeOuterClass.SilenceMode.forNumber(this.silenceMode_);
            return silenceModeForNumber == null ? SilenceModeOuterClass.SilenceMode.OFF : silenceModeForNumber;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxStatisticsMessageOrBuilder
        public boolean hasBacklightLevel() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxStatisticsMessageOrBuilder
        public boolean hasBase() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxStatisticsMessageOrBuilder
        public boolean hasEvent() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxStatisticsMessageOrBuilder
        public boolean hasNfc() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxStatisticsMessageOrBuilder
        public boolean hasSilenceMode() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(onyxStatisticsMessage onyxstatisticsmessage) {
            return DEFAULT_INSTANCE.createBuilder(onyxstatisticsmessage);
        }

        public static onyxStatisticsMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (onyxStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static onyxStatisticsMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (onyxStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static onyxStatisticsMessage parseFrom(ByteString byteString) {
            return (onyxStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static onyxStatisticsMessage parseFrom(ByteString byteString, t tVar) {
            return (onyxStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static onyxStatisticsMessage parseFrom(byte[] bArr) {
            return (onyxStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static onyxStatisticsMessage parseFrom(byte[] bArr, t tVar) {
            return (onyxStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static onyxStatisticsMessage parseFrom(InputStream inputStream) {
            return (onyxStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static onyxStatisticsMessage parseFrom(InputStream inputStream, t tVar) {
            return (onyxStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static onyxStatisticsMessage parseFrom(j jVar) {
            return (onyxStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static onyxStatisticsMessage parseFrom(j jVar, t tVar) {
            return (onyxStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface onyxStatisticsMessageOrBuilder extends bsf {
        int getBacklightLevel();

        StatisBase.StatisBaseMessage getBase();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        onyxEventMessage getEvent();

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

    private Onyx() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}
