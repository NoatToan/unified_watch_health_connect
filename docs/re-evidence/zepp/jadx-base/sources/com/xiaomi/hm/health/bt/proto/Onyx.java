package com.xiaomi.hm.health.bt.proto;

import com.autonavi.amap.mapcore.AMapEngineUtils;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
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
        private static volatile Parser<onyxEventMessage> PARSER = null;
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
        private Internal.IntList gotoSportDetailPage_ = GeneratedMessageLite.emptyIntList();
        private Internal.ProtobufList<Event.NotifyMessage> notify_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.IntList spo2Calc_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList lcdOff_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList unlock_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList updateFail_ = GeneratedMessageLite.emptyIntList();
        private Internal.ProtobufList<Event.SportStatusMessage> sportStatus_ = GeneratedMessageLite.emptyProtobufList();
        private Internal.IntList sportIndoorCalibrate_ = GeneratedMessageLite.emptyIntList();
        private Internal.BooleanList quickEntryApp_ = GeneratedMessageLite.emptyBooleanList();
        private Internal.IntList updataerrscreen_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList updataimmediatelyscreen_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList usecarcount_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList offwristlock_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList alarmreminderclick_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList schedulereminderclick_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList flymode_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList blestatus_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList bleconnect_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList modifypwd_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList nFCstatus_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList ringreminder_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList ratemeasure_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList pressureautomeasure_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList pressuremeasureresult_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList scheduledelete_ = GeneratedMessageLite.emptyIntList();
        private Internal.ProtobufList<Event.NotifyMessage> notifyExt_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.Builder<onyxEventMessage, Builder> implements onyxEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAlarmreminderclick(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAlarmreminderclick(value);
                return this;
            }

            public Builder addAllAlarmreminderclick(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllAlarmreminderclick(values);
                return this;
            }

            public Builder addAllBleconnect(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllBleconnect(values);
                return this;
            }

            public Builder addAllBlestatus(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllBlestatus(values);
                return this;
            }

            public Builder addAllFlymode(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllFlymode(values);
                return this;
            }

            public Builder addAllGotoSportDetailPage(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllGotoSportDetailPage(values);
                return this;
            }

            public Builder addAllLcdOff(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllLcdOff(values);
                return this;
            }

            public Builder addAllModifypwd(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllModifypwd(values);
                return this;
            }

            public Builder addAllNFCstatus(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllNFCstatus(values);
                return this;
            }

            public Builder addAllNotify(Iterable<? extends Event.NotifyMessage> values) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllNotify(values);
                return this;
            }

            public Builder addAllNotifyExt(Iterable<? extends Event.NotifyMessage> values) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllNotifyExt(values);
                return this;
            }

            public Builder addAllOffwristlock(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllOffwristlock(values);
                return this;
            }

            public Builder addAllPressureautomeasure(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllPressureautomeasure(values);
                return this;
            }

            public Builder addAllPressuremeasureresult(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllPressuremeasureresult(values);
                return this;
            }

            public Builder addAllQuickEntryApp(Iterable<? extends Boolean> values) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllQuickEntryApp(values);
                return this;
            }

            public Builder addAllRatemeasure(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllRatemeasure(values);
                return this;
            }

            public Builder addAllRingreminder(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllRingreminder(values);
                return this;
            }

            public Builder addAllScheduledelete(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllScheduledelete(values);
                return this;
            }

            public Builder addAllSchedulereminderclick(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllSchedulereminderclick(values);
                return this;
            }

            public Builder addAllSpo2Calc(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllSpo2Calc(values);
                return this;
            }

            public Builder addAllSportIndoorCalibrate(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllSportIndoorCalibrate(values);
                return this;
            }

            public Builder addAllSportStatus(Iterable<? extends Event.SportStatusMessage> values) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllSportStatus(values);
                return this;
            }

            public Builder addAllUnlock(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllUnlock(values);
                return this;
            }

            public Builder addAllUpdataerrscreen(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllUpdataerrscreen(values);
                return this;
            }

            public Builder addAllUpdataimmediatelyscreen(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllUpdataimmediatelyscreen(values);
                return this;
            }

            public Builder addAllUpdateFail(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllUpdateFail(values);
                return this;
            }

            public Builder addAllUsecarcount(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addAllUsecarcount(values);
                return this;
            }

            public Builder addBleconnect(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addBleconnect(value);
                return this;
            }

            public Builder addBlestatus(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addBlestatus(value);
                return this;
            }

            public Builder addFlymode(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addFlymode(value);
                return this;
            }

            public Builder addGotoSportDetailPage(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addGotoSportDetailPage(value);
                return this;
            }

            public Builder addLcdOff(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addLcdOff(value);
                return this;
            }

            public Builder addModifypwd(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addModifypwd(value);
                return this;
            }

            public Builder addNFCstatus(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addNFCstatus(value);
                return this;
            }

            public Builder addNotify(Event.NotifyMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addNotify(value);
                return this;
            }

            public Builder addNotifyExt(Event.NotifyMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addNotifyExt(value);
                return this;
            }

            public Builder addOffwristlock(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addOffwristlock(value);
                return this;
            }

            public Builder addPressureautomeasure(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addPressureautomeasure(value);
                return this;
            }

            public Builder addPressuremeasureresult(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addPressuremeasureresult(value);
                return this;
            }

            public Builder addQuickEntryApp(boolean value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addQuickEntryApp(value);
                return this;
            }

            public Builder addRatemeasure(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addRatemeasure(value);
                return this;
            }

            public Builder addRingreminder(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addRingreminder(value);
                return this;
            }

            public Builder addScheduledelete(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addScheduledelete(value);
                return this;
            }

            public Builder addSchedulereminderclick(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addSchedulereminderclick(value);
                return this;
            }

            public Builder addSpo2Calc(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addSpo2Calc(value);
                return this;
            }

            public Builder addSportIndoorCalibrate(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addSportIndoorCalibrate(value);
                return this;
            }

            public Builder addSportStatus(Event.SportStatusMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addSportStatus(value);
                return this;
            }

            public Builder addUnlock(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addUnlock(value);
                return this;
            }

            public Builder addUpdataerrscreen(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addUpdataerrscreen(value);
                return this;
            }

            public Builder addUpdataimmediatelyscreen(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addUpdataimmediatelyscreen(value);
                return this;
            }

            public Builder addUpdateFail(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addUpdateFail(value);
                return this;
            }

            public Builder addUsecarcount(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addUsecarcount(value);
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
            public int getAlarmreminderclick(int index) {
                return ((onyxEventMessage) this.instance).getAlarmreminderclick(index);
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
            public int getBleconnect(int index) {
                return ((onyxEventMessage) this.instance).getBleconnect(index);
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
            public int getBlestatus(int index) {
                return ((onyxEventMessage) this.instance).getBlestatus(index);
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
            public int getFlymode(int index) {
                return ((onyxEventMessage) this.instance).getFlymode(index);
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
            public int getGotoSportDetailPage(int index) {
                return ((onyxEventMessage) this.instance).getGotoSportDetailPage(index);
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
            public int getLcdOff(int index) {
                return ((onyxEventMessage) this.instance).getLcdOff(index);
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
            public int getModifypwd(int index) {
                return ((onyxEventMessage) this.instance).getModifypwd(index);
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
            public int getNFCstatus(int index) {
                return ((onyxEventMessage) this.instance).getNFCstatus(index);
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
            public Event.NotifyMessage getNotify(int index) {
                return ((onyxEventMessage) this.instance).getNotify(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public int getNotifyCount() {
                return ((onyxEventMessage) this.instance).getNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
            public Event.NotifyMessage getNotifyExt(int index) {
                return ((onyxEventMessage) this.instance).getNotifyExt(index);
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
            public int getOffwristlock(int index) {
                return ((onyxEventMessage) this.instance).getOffwristlock(index);
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
            public int getPressureautomeasure(int index) {
                return ((onyxEventMessage) this.instance).getPressureautomeasure(index);
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
            public int getPressuremeasureresult(int index) {
                return ((onyxEventMessage) this.instance).getPressuremeasureresult(index);
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
            public boolean getQuickEntryApp(int index) {
                return ((onyxEventMessage) this.instance).getQuickEntryApp(index);
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
            public int getRatemeasure(int index) {
                return ((onyxEventMessage) this.instance).getRatemeasure(index);
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
            public int getRingreminder(int index) {
                return ((onyxEventMessage) this.instance).getRingreminder(index);
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
            public int getScheduledelete(int index) {
                return ((onyxEventMessage) this.instance).getScheduledelete(index);
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
            public int getSchedulereminderclick(int index) {
                return ((onyxEventMessage) this.instance).getSchedulereminderclick(index);
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
            public int getSpo2Calc(int index) {
                return ((onyxEventMessage) this.instance).getSpo2Calc(index);
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
            public int getSportIndoorCalibrate(int index) {
                return ((onyxEventMessage) this.instance).getSportIndoorCalibrate(index);
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
            public Event.SportStatusMessage getSportStatus(int index) {
                return ((onyxEventMessage) this.instance).getSportStatus(index);
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
            public int getUnlock(int index) {
                return ((onyxEventMessage) this.instance).getUnlock(index);
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
            public int getUpdataerrscreen(int index) {
                return ((onyxEventMessage) this.instance).getUpdataerrscreen(index);
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
            public int getUpdataimmediatelyscreen(int index) {
                return ((onyxEventMessage) this.instance).getUpdataimmediatelyscreen(index);
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
            public int getUpdateFail(int index) {
                return ((onyxEventMessage) this.instance).getUpdateFail(index);
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
            public int getUsecarcount(int index) {
                return ((onyxEventMessage) this.instance).getUsecarcount(index);
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

            public Builder mergeBaseRes(Event.DfuUpgradeMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).mergeBaseRes(value);
                return this;
            }

            public Builder mergeBatterySaverOff(Event.BatterySaverMode value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).mergeBatterySaverOff(value);
                return this;
            }

            public Builder mergeBatterySaverOn(Event.BatterySaverMode value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).mergeBatterySaverOn(value);
                return this;
            }

            public Builder mergeClosewifi(Event.wifiuseMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).mergeClosewifi(value);
                return this;
            }

            public Builder mergeDialtool(Event.DialtoolMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).mergeDialtool(value);
                return this;
            }

            public Builder mergeDndMode(Event.DndEventMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).mergeDndMode(value);
                return this;
            }

            public Builder mergeFirmware(Event.DfuUpgradeMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).mergeFirmware(value);
                return this;
            }

            public Builder mergeFont(Event.DfuUpgradeMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).mergeFont(value);
                return this;
            }

            public Builder mergeIncRes(Event.DfuUpgradeMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).mergeIncRes(value);
                return this;
            }

            public Builder mergeLightscreentime(Event.lightscreentimeMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).mergeLightscreentime(value);
                return this;
            }

            public Builder mergeNandMessage(Event.NandMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).mergeNandMessage(value);
                return this;
            }

            public Builder mergeStartwifi(Event.wifiuseMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).mergeStartwifi(value);
                return this;
            }

            public Builder removeNotify(int index) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).removeNotify(index);
                return this;
            }

            public Builder removeNotifyExt(int index) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).removeNotifyExt(index);
                return this;
            }

            public Builder removeSportStatus(int index) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).removeSportStatus(index);
                return this;
            }

            public Builder setActivityTarget(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setActivityTarget(value);
                return this;
            }

            public Builder setActivityobjectives(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setActivityobjectives(value);
                return this;
            }

            public Builder setAddCardSuccess(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setAddCardSuccess(value);
                return this;
            }

            public Builder setAlarmreminder(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setAlarmreminder(value);
                return this;
            }

            public Builder setAlarmreminderclick(int index, int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setAlarmreminderclick(index, value);
                return this;
            }

            public Builder setAlipayBindSuccessNum(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setAlipayBindSuccessNum(value);
                return this;
            }

            public Builder setAplayscreen(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setAplayscreen(value);
                return this;
            }

            public Builder setAssistantVAD(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setAssistantVAD(value);
                return this;
            }

            public Builder setAssistantcarid(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setAssistantcarid(value);
                return this;
            }

            public Builder setAssistantinto(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setAssistantinto(value);
                return this;
            }

            public Builder setAutoLight(boolean value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setAutoLight(value);
                return this;
            }

            public Builder setAutoScreenOffTime(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setAutoScreenOffTime(value);
                return this;
            }

            public Builder setBaseRes(Event.DfuUpgradeMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setBaseRes(value);
                return this;
            }

            public Builder setBatterySaverOff(Event.BatterySaverMode value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setBatterySaverOff(value);
                return this;
            }

            public Builder setBatterySaverOn(Event.BatterySaverMode value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setBatterySaverOn(value);
                return this;
            }

            public Builder setBindingSuccess(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setBindingSuccess(value);
                return this;
            }

            public Builder setBindsetlanguage(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setBindsetlanguage(value);
                return this;
            }

            public Builder setBleconnect(int index, int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setBleconnect(index, value);
                return this;
            }

            public Builder setBleconnectclose(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setBleconnectclose(value);
                return this;
            }

            public Builder setBleconnectfail(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setBleconnectfail(value);
                return this;
            }

            public Builder setBleconnectsuccess(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setBleconnectsuccess(value);
                return this;
            }

            public Builder setBlelistclick(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setBlelistclick(value);
                return this;
            }

            public Builder setBlestatus(int index, int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setBlestatus(index, value);
                return this;
            }

            public Builder setChangeBatteryValue(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setChangeBatteryValue(value);
                return this;
            }

            public Builder setClosewifi(Event.wifiuseMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setClosewifi(value);
                return this;
            }

            public Builder setCompassCalibrateSuccessNum(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setCompassCalibrateSuccessNum(value);
                return this;
            }

            public Builder setCountDownTimeup(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setCountDownTimeup(value);
                return this;
            }

            public Builder setCoutdowntime(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setCoutdowntime(value);
                return this;
            }

            public Builder setCurrentDialId(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setCurrentDialId(value);
                return this;
            }

            public Builder setCurrentDialNum(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setCurrentDialNum(value);
                return this;
            }

            public Builder setDialchangemode(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setDialchangemode(value);
                return this;
            }

            public Builder setDialtool(Event.DialtoolMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setDialtool(value);
                return this;
            }

            public Builder setDndMode(Event.DndEventMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setDndMode(value);
                return this;
            }

            public Builder setEventTimeUp(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setEventTimeUp(value);
                return this;
            }

            public Builder setFatDosfsck(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setFatDosfsck(value);
                return this;
            }

            public Builder setFatDropsize(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setFatDropsize(value);
                return this;
            }

            public Builder setFatDroptime(long value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setFatDroptime(value);
                return this;
            }

            public Builder setFatFormat(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setFatFormat(value);
                return this;
            }

            public Builder setFatFreesize(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setFatFreesize(value);
                return this;
            }

            public Builder setFindPhone(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setFindPhone(value);
                return this;
            }

            public Builder setFindmoblie(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setFindmoblie(value);
                return this;
            }

            public Builder setFirmware(Event.DfuUpgradeMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setFirmware(value);
                return this;
            }

            public Builder setFlymode(int index, int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setFlymode(index, value);
                return this;
            }

            public Builder setFont(Event.DfuUpgradeMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setFont(value);
                return this;
            }

            public Builder setForgetWristOffLockPasswd(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setForgetWristOffLockPasswd(value);
                return this;
            }

            public Builder setGotoActivityPage(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoActivityPage(value);
                return this;
            }

            public Builder setGotoAlarmPage(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoAlarmPage(value);
                return this;
            }

            public Builder setGotoCompassPage(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoCompassPage(value);
                return this;
            }

            public Builder setGotoCountdownPage(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoCountdownPage(value);
                return this;
            }

            public Builder setGotoDialActivityPage(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoDialActivityPage(value);
                return this;
            }

            public Builder setGotoDialAlarmPage(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoDialAlarmPage(value);
                return this;
            }

            public Builder setGotoDialAlipayPage(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoDialAlipayPage(value);
                return this;
            }

            public Builder setGotoDialEventPage(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoDialEventPage(value);
                return this;
            }

            public Builder setGotoDialHeartPage(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoDialHeartPage(value);
                return this;
            }

            public Builder setGotoDialMusicPage(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoDialMusicPage(value);
                return this;
            }

            public Builder setGotoDialNfcCadePage(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoDialNfcCadePage(value);
                return this;
            }

            public Builder setGotoDialPaiPage(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoDialPaiPage(value);
                return this;
            }

            public Builder setGotoDialSportPage(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoDialSportPage(value);
                return this;
            }

            public Builder setGotoDialWeatherPage(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoDialWeatherPage(value);
                return this;
            }

            public Builder setGotoEventPage(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoEventPage(value);
                return this;
            }

            public Builder setGotoHeartPage(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoHeartPage(value);
                return this;
            }

            public Builder setGotoMusicPage(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoMusicPage(value);
                return this;
            }

            public Builder setGotoNfcCardPage(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoNfcCardPage(value);
                return this;
            }

            public Builder setGotoPaiPage(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoPaiPage(value);
                return this;
            }

            public Builder setGotoSpO2Page(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoSpO2Page(value);
                return this;
            }

            public Builder setGotoSportDetailPage(int index, int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoSportDetailPage(index, value);
                return this;
            }

            public Builder setGotoSportHistory(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoSportHistory(value);
                return this;
            }

            public Builder setGotoSportPage(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoSportPage(value);
                return this;
            }

            public Builder setGotoStopwatchPage(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoStopwatchPage(value);
                return this;
            }

            public Builder setGotoWeatherPage(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoWeatherPage(value);
                return this;
            }

            public Builder setGotoWeatherSecondPage(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotoWeatherSecondPage(value);
                return this;
            }

            public Builder setGotosleep(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotosleep(value);
                return this;
            }

            public Builder setGotowakeup(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setGotowakeup(value);
                return this;
            }

            public Builder setIncRes(Event.DfuUpgradeMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setIncRes(value);
                return this;
            }

            public Builder setLanguageselect(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setLanguageselect(value);
                return this;
            }

            public Builder setLcdOff(int index, int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setLcdOff(index, value);
                return this;
            }

            public Builder setLcdOnBecauseOfWrist(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setLcdOnBecauseOfWrist(value);
                return this;
            }

            public Builder setLcdOnBecauseOfWristStatus(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setLcdOnBecauseOfWristStatus(value);
                return this;
            }

            public Builder setLightscreentime(Event.lightscreentimeMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setLightscreentime(value);
                return this;
            }

            public Builder setLightsetting(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setLightsetting(value);
                return this;
            }

            public Builder setLockScreen(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setLockScreen(value);
                return this;
            }

            public Builder setModifypwd(int index, int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setModifypwd(index, value);
                return this;
            }

            public Builder setNFCstatus(int index, int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setNFCstatus(index, value);
                return this;
            }

            public Builder setNandMessage(Event.NandMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setNandMessage(value);
                return this;
            }

            public Builder setNobindrecovery(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setNobindrecovery(value);
                return this;
            }

            public Builder setNobindsupervise(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setNobindsupervise(value);
                return this;
            }

            public Builder setNotify(int index, Event.NotifyMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setNotify(index, value);
                return this;
            }

            public Builder setNotifyExt(int index, Event.NotifyMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setNotifyExt(index, value);
                return this;
            }

            public Builder setOffwristlock(int index, int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setOffwristlock(index, value);
                return this;
            }

            public Builder setPowerOff(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setPowerOff(value);
                return this;
            }

            public Builder setPowerOffBatteryValue(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setPowerOffBatteryValue(value);
                return this;
            }

            public Builder setPowerOnBatteryValue(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setPowerOnBatteryValue(value);
                return this;
            }

            public Builder setPressureautomeasure(int index, int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setPressureautomeasure(index, value);
                return this;
            }

            public Builder setPressureinto(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setPressureinto(value);
                return this;
            }

            public Builder setPressuremeasureresult(int index, int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setPressuremeasureresult(index, value);
                return this;
            }

            public Builder setQNEgps(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setQNEgps(value);
                return this;
            }

            public Builder setQNEinto(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setQNEinto(value);
                return this;
            }

            public Builder setQuickAccessApp(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setQuickAccessApp(value);
                return this;
            }

            public Builder setQuickEntryApp(int index, boolean value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setQuickEntryApp(index, value);
                return this;
            }

            public Builder setRateabnormalreminder(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setRateabnormalreminder(value);
                return this;
            }

            public Builder setRatemeasure(int index, int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setRatemeasure(index, value);
                return this;
            }

            public Builder setRatewarnreminder(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setRatewarnreminder(value);
                return this;
            }

            public Builder setRebootNum(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setRebootNum(value);
                return this;
            }

            public Builder setRecoverymode(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setRecoverymode(value);
                return this;
            }

            public Builder setRemindershock(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setRemindershock(value);
                return this;
            }

            public Builder setReminderstand(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setReminderstand(value);
                return this;
            }

            public Builder setReminderstandcomplete(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setReminderstandcomplete(value);
                return this;
            }

            public Builder setRingreminder(int index, int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setRingreminder(index, value);
                return this;
            }

            public Builder setScheduledelete(int index, int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setScheduledelete(index, value);
                return this;
            }

            public Builder setScheduleedit(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setScheduleedit(value);
                return this;
            }

            public Builder setSchedulereminderclick(int index, int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSchedulereminderclick(index, value);
                return this;
            }

            public Builder setSeePAIexplain(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSeePAIexplain(value);
                return this;
            }

            public Builder setSeePAIrate(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSeePAIrate(value);
                return this;
            }

            public Builder setSetAlarm(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSetAlarm(value);
                return this;
            }

            public Builder setSleepgoal(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSleepgoal(value);
                return this;
            }

            public Builder setSleepreminder(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSleepreminder(value);
                return this;
            }

            public Builder setSleepscreen(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSleepscreen(value);
                return this;
            }

            public Builder setSleepstop(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSleepstop(value);
                return this;
            }

            public Builder setSpo2Calc(int index, int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSpo2Calc(index, value);
                return this;
            }

            public Builder setSportIndoorCalibrate(int index, int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSportIndoorCalibrate(index, value);
                return this;
            }

            public Builder setSportStatus(int index, Event.SportStatusMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSportStatus(index, value);
                return this;
            }

            public Builder setSportremindersave(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSportremindersave(value);
                return this;
            }

            public Builder setStartwifi(Event.wifiuseMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setStartwifi(value);
                return this;
            }

            public Builder setStopwatchreset(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setStopwatchreset(value);
                return this;
            }

            public Builder setStopwatchstart(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setStopwatchstart(value);
                return this;
            }

            public Builder setSwimPoolLength(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSwimPoolLength(value);
                return this;
            }

            public Builder setSysVibration(boolean value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSysVibration(value);
                return this;
            }

            public Builder setSystemUpdateCancle(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSystemUpdateCancle(value);
                return this;
            }

            public Builder setSystemUpdateImmediately(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSystemUpdateImmediately(value);
                return this;
            }

            public Builder setTurnOnTheaterMode(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setTurnOnTheaterMode(value);
                return this;
            }

            public Builder setTurnOnkeepWatchAwake(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setTurnOnkeepWatchAwake(value);
                return this;
            }

            public Builder setUnlock(int index, int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setUnlock(index, value);
                return this;
            }

            public Builder setUpdataerrscreen(int index, int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setUpdataerrscreen(index, value);
                return this;
            }

            public Builder setUpdataimmediatelyscreen(int index, int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setUpdataimmediatelyscreen(index, value);
                return this;
            }

            public Builder setUpdateFail(int index, int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setUpdateFail(index, value);
                return this;
            }

            public Builder setUpdatebyuser(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setUpdatebyuser(value);
                return this;
            }

            public Builder setUseStopwatch(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setUseStopwatch(value);
                return this;
            }

            public Builder setUsecarcount(int index, int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setUsecarcount(index, value);
                return this;
            }

            public Builder setVolbycontrol(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setVolbycontrol(value);
                return this;
            }

            public Builder setVolbysetting(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setVolbysetting(value);
                return this;
            }

            public Builder setVolsetcount(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setVolsetcount(value);
                return this;
            }

            public Builder setWatchdir(boolean value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setWatchdir(value);
                return this;
            }

            public Builder setWifiTipspage(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setWifiTipspage(value);
                return this;
            }

            public Builder setWifipwdcorrect(int value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setWifipwdcorrect(value);
                return this;
            }

            public Builder setWristOffLockStatus(boolean value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setWristOffLockStatus(value);
                return this;
            }

            private Builder() {
                super(onyxEventMessage.DEFAULT_INSTANCE);
            }

            public Builder addNotify(int index, Event.NotifyMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addNotify(index, value);
                return this;
            }

            public Builder addNotifyExt(int index, Event.NotifyMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addNotifyExt(index, value);
                return this;
            }

            public Builder addSportStatus(int index, Event.SportStatusMessage value) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addSportStatus(index, value);
                return this;
            }

            public Builder setBaseRes(Event.DfuUpgradeMessage.Builder builderForValue) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setBaseRes(builderForValue.build());
                return this;
            }

            public Builder setBatterySaverOff(Event.BatterySaverMode.Builder builderForValue) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setBatterySaverOff(builderForValue.build());
                return this;
            }

            public Builder setBatterySaverOn(Event.BatterySaverMode.Builder builderForValue) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setBatterySaverOn(builderForValue.build());
                return this;
            }

            public Builder setClosewifi(Event.wifiuseMessage.Builder builderForValue) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setClosewifi(builderForValue.build());
                return this;
            }

            public Builder setDialtool(Event.DialtoolMessage.Builder builderForValue) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setDialtool(builderForValue.build());
                return this;
            }

            public Builder setDndMode(Event.DndEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setDndMode(builderForValue.build());
                return this;
            }

            public Builder setFirmware(Event.DfuUpgradeMessage.Builder builderForValue) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setFirmware(builderForValue.build());
                return this;
            }

            public Builder setFont(Event.DfuUpgradeMessage.Builder builderForValue) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setFont(builderForValue.build());
                return this;
            }

            public Builder setIncRes(Event.DfuUpgradeMessage.Builder builderForValue) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setIncRes(builderForValue.build());
                return this;
            }

            public Builder setLightscreentime(Event.lightscreentimeMessage.Builder builderForValue) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setLightscreentime(builderForValue.build());
                return this;
            }

            public Builder setNandMessage(Event.NandMessage.Builder builderForValue) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setNandMessage(builderForValue.build());
                return this;
            }

            public Builder setNotify(int index, Event.NotifyMessage.Builder builderForValue) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setNotify(index, builderForValue.build());
                return this;
            }

            public Builder setNotifyExt(int index, Event.NotifyMessage.Builder builderForValue) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setNotifyExt(index, builderForValue.build());
                return this;
            }

            public Builder setSportStatus(int index, Event.SportStatusMessage.Builder builderForValue) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setSportStatus(index, builderForValue.build());
                return this;
            }

            public Builder setStartwifi(Event.wifiuseMessage.Builder builderForValue) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).setStartwifi(builderForValue.build());
                return this;
            }

            public Builder addNotify(Event.NotifyMessage.Builder builderForValue) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addNotify(builderForValue.build());
                return this;
            }

            public Builder addNotifyExt(Event.NotifyMessage.Builder builderForValue) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addNotifyExt(builderForValue.build());
                return this;
            }

            public Builder addSportStatus(Event.SportStatusMessage.Builder builderForValue) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addSportStatus(builderForValue.build());
                return this;
            }

            public Builder addNotify(int index, Event.NotifyMessage.Builder builderForValue) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addNotify(index, builderForValue.build());
                return this;
            }

            public Builder addNotifyExt(int index, Event.NotifyMessage.Builder builderForValue) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addNotifyExt(index, builderForValue.build());
                return this;
            }

            public Builder addSportStatus(int index, Event.SportStatusMessage.Builder builderForValue) {
                copyOnWrite();
                ((onyxEventMessage) this.instance).addSportStatus(index, builderForValue.build());
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
        public void addAlarmreminderclick(int value) {
            ensureAlarmreminderclickIsMutable();
            this.alarmreminderclick_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllAlarmreminderclick(Iterable<? extends Integer> values) {
            ensureAlarmreminderclickIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.alarmreminderclick_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBleconnect(Iterable<? extends Integer> values) {
            ensureBleconnectIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.bleconnect_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllBlestatus(Iterable<? extends Integer> values) {
            ensureBlestatusIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.blestatus_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllFlymode(Iterable<? extends Integer> values) {
            ensureFlymodeIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.flymode_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllGotoSportDetailPage(Iterable<? extends Integer> values) {
            ensureGotoSportDetailPageIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.gotoSportDetailPage_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLcdOff(Iterable<? extends Integer> values) {
            ensureLcdOffIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.lcdOff_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllModifypwd(Iterable<? extends Integer> values) {
            ensureModifypwdIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.modifypwd_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllNFCstatus(Iterable<? extends Integer> values) {
            ensureNFCstatusIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.nFCstatus_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllNotify(Iterable<? extends Event.NotifyMessage> values) {
            ensureNotifyIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.notify_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllNotifyExt(Iterable<? extends Event.NotifyMessage> values) {
            ensureNotifyExtIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.notifyExt_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOffwristlock(Iterable<? extends Integer> values) {
            ensureOffwristlockIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.offwristlock_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPressureautomeasure(Iterable<? extends Integer> values) {
            ensurePressureautomeasureIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.pressureautomeasure_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllPressuremeasureresult(Iterable<? extends Integer> values) {
            ensurePressuremeasureresultIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.pressuremeasureresult_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllQuickEntryApp(Iterable<? extends Boolean> values) {
            ensureQuickEntryAppIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.quickEntryApp_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllRatemeasure(Iterable<? extends Integer> values) {
            ensureRatemeasureIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.ratemeasure_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllRingreminder(Iterable<? extends Integer> values) {
            ensureRingreminderIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.ringreminder_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllScheduledelete(Iterable<? extends Integer> values) {
            ensureScheduledeleteIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.scheduledelete_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSchedulereminderclick(Iterable<? extends Integer> values) {
            ensureSchedulereminderclickIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.schedulereminderclick_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSpo2Calc(Iterable<? extends Integer> values) {
            ensureSpo2CalcIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.spo2Calc_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSportIndoorCalibrate(Iterable<? extends Integer> values) {
            ensureSportIndoorCalibrateIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.sportIndoorCalibrate_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSportStatus(Iterable<? extends Event.SportStatusMessage> values) {
            ensureSportStatusIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.sportStatus_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUnlock(Iterable<? extends Integer> values) {
            ensureUnlockIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.unlock_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUpdataerrscreen(Iterable<? extends Integer> values) {
            ensureUpdataerrscreenIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.updataerrscreen_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUpdataimmediatelyscreen(Iterable<? extends Integer> values) {
            ensureUpdataimmediatelyscreenIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.updataimmediatelyscreen_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUpdateFail(Iterable<? extends Integer> values) {
            ensureUpdateFailIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.updateFail_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllUsecarcount(Iterable<? extends Integer> values) {
            ensureUsecarcountIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.usecarcount_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBleconnect(int value) {
            ensureBleconnectIsMutable();
            this.bleconnect_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addBlestatus(int value) {
            ensureBlestatusIsMutable();
            this.blestatus_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addFlymode(int value) {
            ensureFlymodeIsMutable();
            this.flymode_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addGotoSportDetailPage(int value) {
            ensureGotoSportDetailPageIsMutable();
            this.gotoSportDetailPage_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLcdOff(int value) {
            ensureLcdOffIsMutable();
            this.lcdOff_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addModifypwd(int value) {
            ensureModifypwdIsMutable();
            this.modifypwd_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNFCstatus(int value) {
            ensureNFCstatusIsMutable();
            this.nFCstatus_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNotify(Event.NotifyMessage value) {
            value.getClass();
            ensureNotifyIsMutable();
            this.notify_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNotifyExt(Event.NotifyMessage value) {
            value.getClass();
            ensureNotifyExtIsMutable();
            this.notifyExt_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOffwristlock(int value) {
            ensureOffwristlockIsMutable();
            this.offwristlock_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPressureautomeasure(int value) {
            ensurePressureautomeasureIsMutable();
            this.pressureautomeasure_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addPressuremeasureresult(int value) {
            ensurePressuremeasureresultIsMutable();
            this.pressuremeasureresult_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addQuickEntryApp(boolean value) {
            ensureQuickEntryAppIsMutable();
            this.quickEntryApp_.addBoolean(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRatemeasure(int value) {
            ensureRatemeasureIsMutable();
            this.ratemeasure_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addRingreminder(int value) {
            ensureRingreminderIsMutable();
            this.ringreminder_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addScheduledelete(int value) {
            ensureScheduledeleteIsMutable();
            this.scheduledelete_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSchedulereminderclick(int value) {
            ensureSchedulereminderclickIsMutable();
            this.schedulereminderclick_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSpo2Calc(int value) {
            ensureSpo2CalcIsMutable();
            this.spo2Calc_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSportIndoorCalibrate(int value) {
            ensureSportIndoorCalibrateIsMutable();
            this.sportIndoorCalibrate_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSportStatus(Event.SportStatusMessage value) {
            value.getClass();
            ensureSportStatusIsMutable();
            this.sportStatus_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUnlock(int value) {
            ensureUnlockIsMutable();
            this.unlock_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUpdataerrscreen(int value) {
            ensureUpdataerrscreenIsMutable();
            this.updataerrscreen_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUpdataimmediatelyscreen(int value) {
            ensureUpdataimmediatelyscreenIsMutable();
            this.updataimmediatelyscreen_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUpdateFail(int value) {
            ensureUpdateFailIsMutable();
            this.updateFail_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addUsecarcount(int value) {
            ensureUsecarcountIsMutable();
            this.usecarcount_.addInt(value);
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
            Internal.IntList intList = this.alarmreminderclick_;
            if (intList.isModifiable()) {
                return;
            }
            this.alarmreminderclick_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureBleconnectIsMutable() {
            Internal.IntList intList = this.bleconnect_;
            if (intList.isModifiable()) {
                return;
            }
            this.bleconnect_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureBlestatusIsMutable() {
            Internal.IntList intList = this.blestatus_;
            if (intList.isModifiable()) {
                return;
            }
            this.blestatus_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureFlymodeIsMutable() {
            Internal.IntList intList = this.flymode_;
            if (intList.isModifiable()) {
                return;
            }
            this.flymode_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureGotoSportDetailPageIsMutable() {
            Internal.IntList intList = this.gotoSportDetailPage_;
            if (intList.isModifiable()) {
                return;
            }
            this.gotoSportDetailPage_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureLcdOffIsMutable() {
            Internal.IntList intList = this.lcdOff_;
            if (intList.isModifiable()) {
                return;
            }
            this.lcdOff_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureModifypwdIsMutable() {
            Internal.IntList intList = this.modifypwd_;
            if (intList.isModifiable()) {
                return;
            }
            this.modifypwd_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureNFCstatusIsMutable() {
            Internal.IntList intList = this.nFCstatus_;
            if (intList.isModifiable()) {
                return;
            }
            this.nFCstatus_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureNotifyExtIsMutable() {
            Internal.ProtobufList<Event.NotifyMessage> protobufList = this.notifyExt_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.notifyExt_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureNotifyIsMutable() {
            Internal.ProtobufList<Event.NotifyMessage> protobufList = this.notify_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.notify_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureOffwristlockIsMutable() {
            Internal.IntList intList = this.offwristlock_;
            if (intList.isModifiable()) {
                return;
            }
            this.offwristlock_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensurePressureautomeasureIsMutable() {
            Internal.IntList intList = this.pressureautomeasure_;
            if (intList.isModifiable()) {
                return;
            }
            this.pressureautomeasure_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensurePressuremeasureresultIsMutable() {
            Internal.IntList intList = this.pressuremeasureresult_;
            if (intList.isModifiable()) {
                return;
            }
            this.pressuremeasureresult_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureQuickEntryAppIsMutable() {
            Internal.BooleanList booleanList = this.quickEntryApp_;
            if (booleanList.isModifiable()) {
                return;
            }
            this.quickEntryApp_ = GeneratedMessageLite.mutableCopy(booleanList);
        }

        private void ensureRatemeasureIsMutable() {
            Internal.IntList intList = this.ratemeasure_;
            if (intList.isModifiable()) {
                return;
            }
            this.ratemeasure_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureRingreminderIsMutable() {
            Internal.IntList intList = this.ringreminder_;
            if (intList.isModifiable()) {
                return;
            }
            this.ringreminder_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureScheduledeleteIsMutable() {
            Internal.IntList intList = this.scheduledelete_;
            if (intList.isModifiable()) {
                return;
            }
            this.scheduledelete_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureSchedulereminderclickIsMutable() {
            Internal.IntList intList = this.schedulereminderclick_;
            if (intList.isModifiable()) {
                return;
            }
            this.schedulereminderclick_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureSpo2CalcIsMutable() {
            Internal.IntList intList = this.spo2Calc_;
            if (intList.isModifiable()) {
                return;
            }
            this.spo2Calc_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureSportIndoorCalibrateIsMutable() {
            Internal.IntList intList = this.sportIndoorCalibrate_;
            if (intList.isModifiable()) {
                return;
            }
            this.sportIndoorCalibrate_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureSportStatusIsMutable() {
            Internal.ProtobufList<Event.SportStatusMessage> protobufList = this.sportStatus_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.sportStatus_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureUnlockIsMutable() {
            Internal.IntList intList = this.unlock_;
            if (intList.isModifiable()) {
                return;
            }
            this.unlock_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureUpdataerrscreenIsMutable() {
            Internal.IntList intList = this.updataerrscreen_;
            if (intList.isModifiable()) {
                return;
            }
            this.updataerrscreen_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureUpdataimmediatelyscreenIsMutable() {
            Internal.IntList intList = this.updataimmediatelyscreen_;
            if (intList.isModifiable()) {
                return;
            }
            this.updataimmediatelyscreen_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureUpdateFailIsMutable() {
            Internal.IntList intList = this.updateFail_;
            if (intList.isModifiable()) {
                return;
            }
            this.updateFail_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureUsecarcountIsMutable() {
            Internal.IntList intList = this.usecarcount_;
            if (intList.isModifiable()) {
                return;
            }
            this.usecarcount_ = GeneratedMessageLite.mutableCopy(intList);
        }

        public static onyxEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBaseRes(Event.DfuUpgradeMessage value) {
            value.getClass();
            Event.DfuUpgradeMessage dfuUpgradeMessage = this.baseRes_;
            if (dfuUpgradeMessage == null || dfuUpgradeMessage == Event.DfuUpgradeMessage.getDefaultInstance()) {
                this.baseRes_ = value;
            } else {
                this.baseRes_ = Event.DfuUpgradeMessage.newBuilder(this.baseRes_).mergeFrom(value).buildPartial();
            }
            this.bitField2_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBatterySaverOff(Event.BatterySaverMode value) {
            value.getClass();
            Event.BatterySaverMode batterySaverMode = this.batterySaverOff_;
            if (batterySaverMode == null || batterySaverMode == Event.BatterySaverMode.getDefaultInstance()) {
                this.batterySaverOff_ = value;
            } else {
                this.batterySaverOff_ = Event.BatterySaverMode.newBuilder(this.batterySaverOff_).mergeFrom(value).buildPartial();
            }
            this.bitField1_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBatterySaverOn(Event.BatterySaverMode value) {
            value.getClass();
            Event.BatterySaverMode batterySaverMode = this.batterySaverOn_;
            if (batterySaverMode == null || batterySaverMode == Event.BatterySaverMode.getDefaultInstance()) {
                this.batterySaverOn_ = value;
            } else {
                this.batterySaverOn_ = Event.BatterySaverMode.newBuilder(this.batterySaverOn_).mergeFrom(value).buildPartial();
            }
            this.bitField1_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeClosewifi(Event.wifiuseMessage value) {
            value.getClass();
            Event.wifiuseMessage wifiusemessage = this.closewifi_;
            if (wifiusemessage == null || wifiusemessage == Event.wifiuseMessage.getDefaultInstance()) {
                this.closewifi_ = value;
            } else {
                this.closewifi_ = Event.wifiuseMessage.newBuilder(this.closewifi_).mergeFrom(value).buildPartial();
            }
            this.bitField2_ |= 16777216;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDialtool(Event.DialtoolMessage value) {
            value.getClass();
            Event.DialtoolMessage dialtoolMessage = this.dialtool_;
            if (dialtoolMessage == null || dialtoolMessage == Event.DialtoolMessage.getDefaultInstance()) {
                this.dialtool_ = value;
            } else {
                this.dialtool_ = Event.DialtoolMessage.newBuilder(this.dialtool_).mergeFrom(value).buildPartial();
            }
            this.bitField2_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeDndMode(Event.DndEventMessage value) {
            value.getClass();
            Event.DndEventMessage dndEventMessage = this.dndMode_;
            if (dndEventMessage == null || dndEventMessage == Event.DndEventMessage.getDefaultInstance()) {
                this.dndMode_ = value;
            } else {
                this.dndMode_ = Event.DndEventMessage.newBuilder(this.dndMode_).mergeFrom(value).buildPartial();
            }
            this.bitField1_ |= 32768;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFirmware(Event.DfuUpgradeMessage value) {
            value.getClass();
            Event.DfuUpgradeMessage dfuUpgradeMessage = this.firmware_;
            if (dfuUpgradeMessage == null || dfuUpgradeMessage == Event.DfuUpgradeMessage.getDefaultInstance()) {
                this.firmware_ = value;
            } else {
                this.firmware_ = Event.DfuUpgradeMessage.newBuilder(this.firmware_).mergeFrom(value).buildPartial();
            }
            this.bitField2_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeFont(Event.DfuUpgradeMessage value) {
            value.getClass();
            Event.DfuUpgradeMessage dfuUpgradeMessage = this.font_;
            if (dfuUpgradeMessage == null || dfuUpgradeMessage == Event.DfuUpgradeMessage.getDefaultInstance()) {
                this.font_ = value;
            } else {
                this.font_ = Event.DfuUpgradeMessage.newBuilder(this.font_).mergeFrom(value).buildPartial();
            }
            this.bitField2_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeIncRes(Event.DfuUpgradeMessage value) {
            value.getClass();
            Event.DfuUpgradeMessage dfuUpgradeMessage = this.incRes_;
            if (dfuUpgradeMessage == null || dfuUpgradeMessage == Event.DfuUpgradeMessage.getDefaultInstance()) {
                this.incRes_ = value;
            } else {
                this.incRes_ = Event.DfuUpgradeMessage.newBuilder(this.incRes_).mergeFrom(value).buildPartial();
            }
            this.bitField2_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLightscreentime(Event.lightscreentimeMessage value) {
            value.getClass();
            Event.lightscreentimeMessage lightscreentimemessage = this.lightscreentime_;
            if (lightscreentimemessage == null || lightscreentimemessage == Event.lightscreentimeMessage.getDefaultInstance()) {
                this.lightscreentime_ = value;
            } else {
                this.lightscreentime_ = Event.lightscreentimeMessage.newBuilder(this.lightscreentime_).mergeFrom(value).buildPartial();
            }
            this.bitField2_ |= 4194304;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeNandMessage(Event.NandMessage value) {
            value.getClass();
            Event.NandMessage nandMessage = this.nandMessage_;
            if (nandMessage == null || nandMessage == Event.NandMessage.getDefaultInstance()) {
                this.nandMessage_ = value;
            } else {
                this.nandMessage_ = Event.NandMessage.newBuilder(this.nandMessage_).mergeFrom(value).buildPartial();
            }
            this.bitField1_ |= 67108864;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeStartwifi(Event.wifiuseMessage value) {
            value.getClass();
            Event.wifiuseMessage wifiusemessage = this.startwifi_;
            if (wifiusemessage == null || wifiusemessage == Event.wifiuseMessage.getDefaultInstance()) {
                this.startwifi_ = value;
            } else {
                this.startwifi_ = Event.wifiuseMessage.newBuilder(this.startwifi_).mergeFrom(value).buildPartial();
            }
            this.bitField2_ |= 8388608;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static onyxEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (onyxEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static onyxEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (onyxEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<onyxEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeNotify(int index) {
            ensureNotifyIsMutable();
            this.notify_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeNotifyExt(int index) {
            ensureNotifyExtIsMutable();
            this.notifyExt_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeSportStatus(int index) {
            ensureSportStatusIsMutable();
            this.sportStatus_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActivityTarget(int value) {
            this.bitField1_ |= 16384;
            this.activityTarget_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActivityobjectives(int value) {
            this.bitField3_ |= 8;
            this.activityobjectives_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddCardSuccess(int value) {
            this.bitField1_ |= 128;
            this.addCardSuccess_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmreminder(int value) {
            this.bitField2_ |= 16384;
            this.alarmreminder_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmreminderclick(int index, int value) {
            ensureAlarmreminderclickIsMutable();
            this.alarmreminderclick_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayBindSuccessNum(int value) {
            this.bitField0_ |= 67108864;
            this.alipayBindSuccessNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAplayscreen(int value) {
            this.bitField2_ |= 1073741824;
            this.aplayscreen_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssistantVAD(int value) {
            this.bitField3_ |= 2;
            this.assistantVAD_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssistantcarid(int value) {
            this.bitField2_ |= Integer.MIN_VALUE;
            this.assistantcarid_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssistantinto(int value) {
            this.bitField3_ |= 1;
            this.assistantinto_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAutoLight(boolean value) {
            this.bitField1_ |= 8388608;
            this.autoLight_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAutoScreenOffTime(int value) {
            this.bitField1_ |= 524288;
            this.autoScreenOffTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBaseRes(Event.DfuUpgradeMessage value) {
            value.getClass();
            this.baseRes_ = value;
            this.bitField2_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBatterySaverOff(Event.BatterySaverMode value) {
            value.getClass();
            this.batterySaverOff_ = value;
            this.bitField1_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBatterySaverOn(Event.BatterySaverMode value) {
            value.getClass();
            this.batterySaverOn_ = value;
            this.bitField1_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBindingSuccess(int value) {
            this.bitField1_ |= 256;
            this.bindingSuccess_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBindsetlanguage(int value) {
            this.bitField3_ |= 1048576;
            this.bindsetlanguage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBleconnect(int index, int value) {
            ensureBleconnectIsMutable();
            this.bleconnect_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBleconnectclose(int value) {
            this.bitField2_ |= 1048576;
            this.bleconnectclose_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBleconnectfail(int value) {
            this.bitField2_ |= 262144;
            this.bleconnectfail_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBleconnectsuccess(int value) {
            this.bitField2_ |= 131072;
            this.bleconnectsuccess_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBlelistclick(int value) {
            this.bitField2_ |= 524288;
            this.blelistclick_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBlestatus(int index, int value) {
            ensureBlestatusIsMutable();
            this.blestatus_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setChangeBatteryValue(int value) {
            this.bitField1_ |= 262144;
            this.changeBatteryValue_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClosewifi(Event.wifiuseMessage value) {
            value.getClass();
            this.closewifi_ = value;
            this.bitField2_ |= 16777216;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCompassCalibrateSuccessNum(int value) {
            this.bitField0_ |= 33554432;
            this.compassCalibrateSuccessNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountDownTimeup(int value) {
            this.bitField1_ |= 1;
            this.countDownTimeup_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCoutdowntime(int value) {
            this.bitField2_ |= 256;
            this.coutdowntime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentDialId(int value) {
            this.bitField1_ |= 16777216;
            this.currentDialId_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCurrentDialNum(int value) {
            this.bitField1_ |= 33554432;
            this.currentDialNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialchangemode(int value) {
            this.bitField3_ |= 4;
            this.dialchangemode_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialtool(Event.DialtoolMessage value) {
            value.getClass();
            this.dialtool_ = value;
            this.bitField2_ |= 128;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDndMode(Event.DndEventMessage value) {
            value.getClass();
            this.dndMode_ = value;
            this.bitField1_ |= 32768;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEventTimeUp(int value) {
            this.bitField0_ |= 268435456;
            this.eventTimeUp_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFatDosfsck(int value) {
            this.bitField1_ |= Integer.MIN_VALUE;
            this.fatDosfsck_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFatDropsize(int value) {
            this.bitField1_ |= 268435456;
            this.fatDropsize_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFatDroptime(long value) {
            this.bitField1_ |= 536870912;
            this.fatDroptime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFatFormat(int value) {
            this.bitField1_ |= 1073741824;
            this.fatFormat_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFatFreesize(int value) {
            this.bitField1_ |= AMapEngineUtils.HALF_MAX_P20_WIDTH;
            this.fatFreesize_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFindPhone(int value) {
            this.bitField1_ |= 16;
            this.findPhone_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFindmoblie(int value) {
            this.bitField3_ |= 2048;
            this.findmoblie_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFirmware(Event.DfuUpgradeMessage value) {
            value.getClass();
            this.firmware_ = value;
            this.bitField2_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFlymode(int index, int value) {
            ensureFlymodeIsMutable();
            this.flymode_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFont(Event.DfuUpgradeMessage value) {
            value.getClass();
            this.font_ = value;
            this.bitField2_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setForgetWristOffLockPasswd(int value) {
            this.bitField0_ |= Integer.MIN_VALUE;
            this.forgetWristOffLockPasswd_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoActivityPage(int value) {
            this.bitField0_ |= 8388608;
            this.gotoActivityPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoAlarmPage(int value) {
            this.bitField0_ |= 131072;
            this.gotoAlarmPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoCompassPage(int value) {
            this.bitField0_ |= 1;
            this.gotoCompassPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoCountdownPage(int value) {
            this.bitField0_ |= 1048576;
            this.gotoCountdownPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoDialActivityPage(int value) {
            this.bitField0_ |= 16777216;
            this.gotoDialActivityPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoDialAlarmPage(int value) {
            this.bitField0_ |= 262144;
            this.gotoDialAlarmPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoDialAlipayPage(int value) {
            this.bitField0_ |= 2;
            this.gotoDialAlipayPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoDialEventPage(int value) {
            this.bitField0_ |= 65536;
            this.gotoDialEventPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoDialHeartPage(int value) {
            this.bitField0_ |= 256;
            this.gotoDialHeartPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoDialMusicPage(int value) {
            this.bitField0_ |= 64;
            this.gotoDialMusicPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoDialNfcCadePage(int value) {
            this.bitField0_ |= 4194304;
            this.gotoDialNfcCadePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoDialPaiPage(int value) {
            this.bitField0_ |= 2048;
            this.gotoDialPaiPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoDialSportPage(int value) {
            this.bitField0_ |= 16;
            this.gotoDialSportPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoDialWeatherPage(int value) {
            this.bitField0_ |= 16384;
            this.gotoDialWeatherPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoEventPage(int value) {
            this.bitField0_ |= 32768;
            this.gotoEventPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoHeartPage(int value) {
            this.bitField0_ |= 128;
            this.gotoHeartPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoMusicPage(int value) {
            this.bitField0_ |= 32;
            this.gotoMusicPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoNfcCardPage(int value) {
            this.bitField0_ |= 2097152;
            this.gotoNfcCardPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoPaiPage(int value) {
            this.bitField0_ |= 1024;
            this.gotoPaiPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoSpO2Page(int value) {
            this.bitField0_ |= 512;
            this.gotoSpO2Page_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoSportDetailPage(int index, int value) {
            ensureGotoSportDetailPageIsMutable();
            this.gotoSportDetailPage_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoSportHistory(int value) {
            this.bitField0_ |= 4;
            this.gotoSportHistory_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoSportPage(int value) {
            this.bitField0_ |= 8;
            this.gotoSportPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoStopwatchPage(int value) {
            this.bitField0_ |= 524288;
            this.gotoStopwatchPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoWeatherPage(int value) {
            this.bitField0_ |= 4096;
            this.gotoWeatherPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotoWeatherSecondPage(int value) {
            this.bitField0_ |= 8192;
            this.gotoWeatherSecondPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotosleep(int value) {
            this.bitField3_ |= 4096;
            this.gotosleep_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotowakeup(int value) {
            this.bitField3_ |= 8192;
            this.gotowakeup_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIncRes(Event.DfuUpgradeMessage value) {
            value.getClass();
            this.incRes_ = value;
            this.bitField2_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguageselect(int value) {
            this.bitField2_ |= 2097152;
            this.languageselect_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOff(int index, int value) {
            ensureLcdOffIsMutable();
            this.lcdOff_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOnBecauseOfWrist(int value) {
            this.bitField0_ |= AMapEngineUtils.HALF_MAX_P20_WIDTH;
            this.lcdOnBecauseOfWrist_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOnBecauseOfWristStatus(int value) {
            this.bitField1_ |= 1048576;
            this.lcdOnBecauseOfWristStatus_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLightscreentime(Event.lightscreentimeMessage value) {
            value.getClass();
            this.lightscreentime_ = value;
            this.bitField2_ |= 4194304;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLightsetting(int value) {
            this.bitField3_ |= 256;
            this.lightsetting_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLockScreen(int value) {
            this.bitField1_ |= 8;
            this.lockScreen_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setModifypwd(int index, int value) {
            ensureModifypwdIsMutable();
            this.modifypwd_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNFCstatus(int index, int value) {
            ensureNFCstatusIsMutable();
            this.nFCstatus_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNandMessage(Event.NandMessage value) {
            value.getClass();
            this.nandMessage_ = value;
            this.bitField1_ |= 67108864;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNobindrecovery(int value) {
            this.bitField3_ |= 262144;
            this.nobindrecovery_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNobindsupervise(int value) {
            this.bitField3_ |= 524288;
            this.nobindsupervise_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotify(int index, Event.NotifyMessage value) {
            value.getClass();
            ensureNotifyIsMutable();
            this.notify_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotifyExt(int index, Event.NotifyMessage value) {
            value.getClass();
            ensureNotifyExtIsMutable();
            this.notifyExt_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOffwristlock(int index, int value) {
            ensureOffwristlockIsMutable();
            this.offwristlock_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPowerOff(int value) {
            this.bitField1_ |= 1024;
            this.powerOff_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPowerOffBatteryValue(int value) {
            this.bitField1_ |= 65536;
            this.powerOffBatteryValue_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPowerOnBatteryValue(int value) {
            this.bitField1_ |= 131072;
            this.powerOnBatteryValue_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPressureautomeasure(int index, int value) {
            ensurePressureautomeasureIsMutable();
            this.pressureautomeasure_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPressureinto(int value) {
            this.bitField2_ |= 536870912;
            this.pressureinto_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPressuremeasureresult(int index, int value) {
            ensurePressuremeasureresultIsMutable();
            this.pressuremeasureresult_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQNEgps(int value) {
            this.bitField2_ |= 65536;
            this.qNEgps_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQNEinto(int value) {
            this.bitField2_ |= 32768;
            this.qNEinto_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuickAccessApp(int value) {
            this.bitField1_ |= 4194304;
            this.quickAccessApp_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQuickEntryApp(int index, boolean value) {
            ensureQuickEntryAppIsMutable();
            this.quickEntryApp_.setBoolean(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRateabnormalreminder(int value) {
            this.bitField3_ |= 512;
            this.rateabnormalreminder_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRatemeasure(int index, int value) {
            ensureRatemeasureIsMutable();
            this.ratemeasure_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRatewarnreminder(int value) {
            this.bitField3_ |= 1024;
            this.ratewarnreminder_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRebootNum(int value) {
            this.bitField1_ |= 512;
            this.rebootNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRecoverymode(int value) {
            this.bitField2_ |= 2048;
            this.recoverymode_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemindershock(int value) {
            this.bitField2_ |= 16;
            this.remindershock_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReminderstand(int value) {
            this.bitField2_ |= 512;
            this.reminderstand_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReminderstandcomplete(int value) {
            this.bitField2_ |= 1024;
            this.reminderstandcomplete_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRingreminder(int index, int value) {
            ensureRingreminderIsMutable();
            this.ringreminder_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScheduledelete(int index, int value) {
            ensureScheduledeleteIsMutable();
            this.scheduledelete_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScheduleedit(int value) {
            this.bitField3_ |= 64;
            this.scheduleedit_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSchedulereminderclick(int index, int value) {
            ensureSchedulereminderclickIsMutable();
            this.schedulereminderclick_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSeePAIexplain(int value) {
            this.bitField2_ |= 64;
            this.seePAIexplain_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSeePAIrate(int value) {
            this.bitField2_ |= 32;
            this.seePAIrate_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSetAlarm(int value) {
            this.bitField0_ |= 536870912;
            this.setAlarm_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSleepgoal(int value) {
            this.bitField3_ |= 32768;
            this.sleepgoal_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSleepreminder(int value) {
            this.bitField3_ |= 131072;
            this.sleepreminder_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSleepscreen(int value) {
            this.bitField3_ |= 16384;
            this.sleepscreen_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSleepstop(int value) {
            this.bitField3_ |= 65536;
            this.sleepstop_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpo2Calc(int index, int value) {
            ensureSpo2CalcIsMutable();
            this.spo2Calc_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportIndoorCalibrate(int index, int value) {
            ensureSportIndoorCalibrateIsMutable();
            this.sportIndoorCalibrate_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportStatus(int index, Event.SportStatusMessage value) {
            value.getClass();
            ensureSportStatusIsMutable();
            this.sportStatus_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportremindersave(int value) {
            this.bitField3_ |= 4194304;
            this.sportremindersave_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartwifi(Event.wifiuseMessage value) {
            value.getClass();
            this.startwifi_ = value;
            this.bitField2_ |= 8388608;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopwatchreset(int value) {
            this.bitField3_ |= 32;
            this.stopwatchreset_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopwatchstart(int value) {
            this.bitField3_ |= 16;
            this.stopwatchstart_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwimPoolLength(int value) {
            this.bitField1_ |= 8192;
            this.swimPoolLength_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSysVibration(boolean value) {
            this.bitField2_ |= 268435456;
            this.sysVibration_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSystemUpdateCancle(int value) {
            this.bitField1_ |= 4096;
            this.systemUpdateCancle_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSystemUpdateImmediately(int value) {
            this.bitField1_ |= 2048;
            this.systemUpdateImmediately_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTurnOnTheaterMode(int value) {
            this.bitField1_ |= 32;
            this.turnOnTheaterMode_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTurnOnkeepWatchAwake(int value) {
            this.bitField1_ |= 64;
            this.turnOnkeepWatchAwake_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUnlock(int index, int value) {
            ensureUnlockIsMutable();
            this.unlock_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdataerrscreen(int index, int value) {
            ensureUpdataerrscreenIsMutable();
            this.updataerrscreen_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdataimmediatelyscreen(int index, int value) {
            ensureUpdataimmediatelyscreenIsMutable();
            this.updataimmediatelyscreen_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdateFail(int index, int value) {
            ensureUpdateFailIsMutable();
            this.updateFail_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpdatebyuser(int value) {
            this.bitField3_ |= 2097152;
            this.updatebyuser_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUseStopwatch(int value) {
            this.bitField0_ |= 1073741824;
            this.useStopwatch_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUsecarcount(int index, int value) {
            ensureUsecarcountIsMutable();
            this.usecarcount_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVolbycontrol(int value) {
            this.bitField2_ |= 8192;
            this.volbycontrol_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVolbysetting(int value) {
            this.bitField2_ |= AMapEngineUtils.HALF_MAX_P20_WIDTH;
            this.volbysetting_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVolsetcount(int value) {
            this.bitField2_ |= 4096;
            this.volsetcount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWatchdir(boolean value) {
            this.bitField3_ |= 128;
            this.watchdir_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWifiTipspage(int value) {
            this.bitField2_ |= 33554432;
            this.wifiTipspage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWifipwdcorrect(int value) {
            this.bitField2_ |= 67108864;
            this.wifipwdcorrect_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWristOffLockStatus(boolean value) {
            this.bitField1_ |= 2097152;
            this.wristOffLockStatus_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new onyxEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0091\u0000\u0004\u0001\u0091\u0091\u0000\u001aK\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004\u001d\u0005ᔋ\u0003\u0006ᔋ\u0004\u0007ᔋ\u0005\bᔋ\u0006\tᔋ\u0007\nᔋ\b\u000bᔋ\t\fᔋ\n\rᔋ\u000b\u000eᔋ\f\u000fᔋ\r\u0010ᔋ\u000e\u0011ᔋ\u000f\u0012ᔋ\u0010\u0013ᔋ\u0011\u0014ᔋ\u0012\u0015ᔋ\u0013\u0016ᔋ\u0014\u0017ᔋ\u0015\u0018ᔋ\u0016\u0019ᔋ\u0017\u001aᔋ\u0018\u001bЛ\u001cᔋ\u0019\u001dᔋ\u001a\u001e\u001d\u001fᔋ\u001b \u001d!ᔋ\u001c\"\u001d#ᔋ\u001d$ᔋ\u001e%ᔋ\u001f&ᔋ 'ᔉ!(ᔉ\")ᔋ#*ᔋ$+ᔋ%,ᔋ&-ᔋ'.ᔋ(/ᔋ)0ᔋ*1ᔋ+2ᔋ,3\u001d4Л5\u001d6ᔋ-7ᔋ.8ᔉ/9ᔋ0:ᔋ1;ᔋ2<ᔋ3=ᔋ4>ᔇ5?ᔋ6@\u0019Aᔇ7Bᔋ8Cᔋ9Dᔉ:Eᔋ;Fᔄ<Gᔃ=Hᔋ>Iᔋ?Jᔉ@KᔉALᔉBMᔉCN\u001dO\u001dPဋDQဋERဋFSᐉGTဋHUဋIVဋJWဋKX\u001dYဋLZဋM[\u001d\\ဋN]\u001d^ဋO_ဋP`\u001da\u001db\u001dc\u001ddဋQeဋRfဋSgဋTh\u001di\u001dj\u001dkဋUlᐉVmᐉWnᐉXoဋYpဋZqဋ[rဇ\\s\u001dtဋ]u\u001dv\u001dwဋ^xဋ_yဋ`zဋa{ဋb|ဋc}ဋd~ဋe\u007f\u001d\u0080ဋf\u0081ဇg\u0082ဋh\u0083ဋi\u0084ဋj\u0085ဋk\u0086ဋl\u0087ဋm\u0088ဋn\u0089ဋo\u008aဋp\u008bဋq\u008cဋr\u008dဋs\u008eဋt\u008fဋu\u0090ဋv\u0091Л", new Object[]{"bitField0_", "bitField1_", "bitField2_", "bitField3_", "gotoCompassPage_", "gotoDialAlipayPage_", "gotoSportHistory_", "gotoSportDetailPage_", "gotoSportPage_", "gotoDialSportPage_", "gotoMusicPage_", "gotoDialMusicPage_", "gotoHeartPage_", "gotoDialHeartPage_", "gotoSpO2Page_", "gotoPaiPage_", "gotoDialPaiPage_", "gotoWeatherPage_", "gotoWeatherSecondPage_", "gotoDialWeatherPage_", "gotoEventPage_", "gotoDialEventPage_", "gotoAlarmPage_", "gotoDialAlarmPage_", "gotoStopwatchPage_", "gotoCountdownPage_", "gotoNfcCardPage_", "gotoDialNfcCadePage_", "gotoActivityPage_", "gotoDialActivityPage_", "notify_", Event.NotifyMessage.class, "compassCalibrateSuccessNum_", "alipayBindSuccessNum_", "spo2Calc_", "lcdOnBecauseOfWrist_", "lcdOff_", "eventTimeUp_", "unlock_", "setAlarm_", "useStopwatch_", "forgetWristOffLockPasswd_", "countDownTimeup_", "batterySaverOff_", "batterySaverOn_", "lockScreen_", "findPhone_", "turnOnTheaterMode_", "turnOnkeepWatchAwake_", "addCardSuccess_", "bindingSuccess_", "rebootNum_", "powerOff_", "systemUpdateImmediately_", "systemUpdateCancle_", "updateFail_", "sportStatus_", Event.SportStatusMessage.class, "sportIndoorCalibrate_", "swimPoolLength_", "activityTarget_", "dndMode_", "powerOffBatteryValue_", "powerOnBatteryValue_", "changeBatteryValue_", "autoScreenOffTime_", "lcdOnBecauseOfWristStatus_", "wristOffLockStatus_", "quickAccessApp_", "quickEntryApp_", "autoLight_", "currentDialId_", "currentDialNum_", "nandMessage_", "fatFreesize_", "fatDropsize_", "fatDroptime_", "fatFormat_", "fatDosfsck_", "firmware_", "baseRes_", "incRes_", "font_", "updataerrscreen_", "updataimmediatelyscreen_", "remindershock_", "seePAIrate_", "seePAIexplain_", "dialtool_", "coutdowntime_", "reminderstand_", "reminderstandcomplete_", "recoverymode_", "usecarcount_", "volsetcount_", "volbycontrol_", "offwristlock_", "alarmreminder_", "alarmreminderclick_", "qNEinto_", "qNEgps_", "schedulereminderclick_", "flymode_", "blestatus_", "bleconnect_", "bleconnectsuccess_", "bleconnectfail_", "blelistclick_", "bleconnectclose_", "modifypwd_", "nFCstatus_", "ringreminder_", "languageselect_", "lightscreentime_", "startwifi_", "closewifi_", "wifiTipspage_", "wifipwdcorrect_", "volbysetting_", "sysVibration_", "ratemeasure_", "pressureinto_", "pressureautomeasure_", "pressuremeasureresult_", "aplayscreen_", "assistantcarid_", "assistantinto_", "assistantVAD_", "dialchangemode_", "activityobjectives_", "stopwatchstart_", "stopwatchreset_", "scheduledelete_", "scheduleedit_", "watchdir_", "lightsetting_", "rateabnormalreminder_", "ratewarnreminder_", "findmoblie_", "gotosleep_", "gotowakeup_", "sleepscreen_", "sleepgoal_", "sleepstop_", "sleepreminder_", "nobindrecovery_", "nobindsupervise_", "bindsetlanguage_", "updatebyuser_", "sportremindersave_", "notifyExt_", Event.NotifyMessage.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<onyxEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (onyxEventMessage.class) {
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
        public int getAlarmreminderclick(int index) {
            return this.alarmreminderclick_.getInt(index);
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
        public int getBleconnect(int index) {
            return this.bleconnect_.getInt(index);
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
        public int getBlestatus(int index) {
            return this.blestatus_.getInt(index);
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
        public int getFlymode(int index) {
            return this.flymode_.getInt(index);
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
        public int getGotoSportDetailPage(int index) {
            return this.gotoSportDetailPage_.getInt(index);
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
        public int getLcdOff(int index) {
            return this.lcdOff_.getInt(index);
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
        public int getModifypwd(int index) {
            return this.modifypwd_.getInt(index);
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
        public int getNFCstatus(int index) {
            return this.nFCstatus_.getInt(index);
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
        public Event.NotifyMessage getNotify(int index) {
            return this.notify_.get(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getNotifyCount() {
            return this.notify_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public Event.NotifyMessage getNotifyExt(int index) {
            return this.notifyExt_.get(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getNotifyExtCount() {
            return this.notifyExt_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Event.NotifyMessage> getNotifyExtList() {
            return this.notifyExt_;
        }

        public Event.NotifyMessageOrBuilder getNotifyExtOrBuilder(int index) {
            return this.notifyExt_.get(index);
        }

        public List<? extends Event.NotifyMessageOrBuilder> getNotifyExtOrBuilderList() {
            return this.notifyExt_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Event.NotifyMessage> getNotifyList() {
            return this.notify_;
        }

        public Event.NotifyMessageOrBuilder getNotifyOrBuilder(int index) {
            return this.notify_.get(index);
        }

        public List<? extends Event.NotifyMessageOrBuilder> getNotifyOrBuilderList() {
            return this.notify_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getOffwristlock(int index) {
            return this.offwristlock_.getInt(index);
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
        public int getPressureautomeasure(int index) {
            return this.pressureautomeasure_.getInt(index);
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
        public int getPressuremeasureresult(int index) {
            return this.pressuremeasureresult_.getInt(index);
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
        public boolean getQuickEntryApp(int index) {
            return this.quickEntryApp_.getBoolean(index);
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
        public int getRatemeasure(int index) {
            return this.ratemeasure_.getInt(index);
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
        public int getRingreminder(int index) {
            return this.ringreminder_.getInt(index);
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
        public int getScheduledelete(int index) {
            return this.scheduledelete_.getInt(index);
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
        public int getSchedulereminderclick(int index) {
            return this.schedulereminderclick_.getInt(index);
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
        public int getSpo2Calc(int index) {
            return this.spo2Calc_.getInt(index);
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
        public int getSportIndoorCalibrate(int index) {
            return this.sportIndoorCalibrate_.getInt(index);
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
        public Event.SportStatusMessage getSportStatus(int index) {
            return this.sportStatus_.get(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public int getSportStatusCount() {
            return this.sportStatus_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public List<Event.SportStatusMessage> getSportStatusList() {
            return this.sportStatus_;
        }

        public Event.SportStatusMessageOrBuilder getSportStatusOrBuilder(int index) {
            return this.sportStatus_.get(index);
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
        public int getUnlock(int index) {
            return this.unlock_.getInt(index);
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
        public int getUpdataerrscreen(int index) {
            return this.updataerrscreen_.getInt(index);
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
        public int getUpdataimmediatelyscreen(int index) {
            return this.updataimmediatelyscreen_.getInt(index);
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
        public int getUpdateFail(int index) {
            return this.updateFail_.getInt(index);
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
        public int getUsecarcount(int index) {
            return this.usecarcount_.getInt(index);
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
            return (this.bitField1_ & 8388608) != 0;
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
            return (this.bitField3_ & 1048576) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasBleconnectclose() {
            return (this.bitField2_ & 1048576) != 0;
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
            return (this.bitField1_ & AMapEngineUtils.HALF_MAX_P20_WIDTH) != 0;
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
            return (this.bitField0_ & 8388608) != 0;
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
            return (this.bitField0_ & 1048576) != 0;
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
            return (this.bitField0_ & AMapEngineUtils.HALF_MAX_P20_WIDTH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Onyx.onyxEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfWristStatus() {
            return (this.bitField1_ & 1048576) != 0;
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
            return (this.bitField2_ & 8388608) != 0;
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
            return (this.bitField2_ & AMapEngineUtils.HALF_MAX_P20_WIDTH) != 0;
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

        public static Builder newBuilder(onyxEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static onyxEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (onyxEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static onyxEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (onyxEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static onyxEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (onyxEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNotify(int index, Event.NotifyMessage value) {
            value.getClass();
            ensureNotifyIsMutable();
            this.notify_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNotifyExt(int index, Event.NotifyMessage value) {
            value.getClass();
            ensureNotifyExtIsMutable();
            this.notifyExt_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSportStatus(int index, Event.SportStatusMessage value) {
            value.getClass();
            ensureSportStatusIsMutable();
            this.sportStatus_.add(index, value);
        }

        public static onyxEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (onyxEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static onyxEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (onyxEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static onyxEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (onyxEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static onyxEventMessage parseFrom(InputStream input) throws IOException {
            return (onyxEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static onyxEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (onyxEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static onyxEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (onyxEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static onyxEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (onyxEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface onyxEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getActivityTarget();

        int getActivityobjectives();

        int getAddCardSuccess();

        int getAlarmreminder();

        int getAlarmreminderclick(int index);

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

        int getBleconnect(int index);

        int getBleconnectCount();

        List<Integer> getBleconnectList();

        int getBleconnectclose();

        int getBleconnectfail();

        int getBleconnectsuccess();

        int getBlelistclick();

        int getBlestatus(int index);

        int getBlestatusCount();

        List<Integer> getBlestatusList();

        int getChangeBatteryValue();

        Event.wifiuseMessage getClosewifi();

        int getCompassCalibrateSuccessNum();

        int getCountDownTimeup();

        int getCoutdowntime();

        int getCurrentDialId();

        int getCurrentDialNum();

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

        int getFlymode(int index);

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

        int getGotoSportDetailPage(int index);

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

        int getLcdOff(int index);

        int getLcdOffCount();

        List<Integer> getLcdOffList();

        int getLcdOnBecauseOfWrist();

        int getLcdOnBecauseOfWristStatus();

        Event.lightscreentimeMessage getLightscreentime();

        int getLightsetting();

        int getLockScreen();

        int getModifypwd(int index);

        int getModifypwdCount();

        List<Integer> getModifypwdList();

        int getNFCstatus(int index);

        int getNFCstatusCount();

        List<Integer> getNFCstatusList();

        Event.NandMessage getNandMessage();

        int getNobindrecovery();

        int getNobindsupervise();

        Event.NotifyMessage getNotify(int index);

        int getNotifyCount();

        Event.NotifyMessage getNotifyExt(int index);

        int getNotifyExtCount();

        List<Event.NotifyMessage> getNotifyExtList();

        List<Event.NotifyMessage> getNotifyList();

        int getOffwristlock(int index);

        int getOffwristlockCount();

        List<Integer> getOffwristlockList();

        int getPowerOff();

        int getPowerOffBatteryValue();

        int getPowerOnBatteryValue();

        int getPressureautomeasure(int index);

        int getPressureautomeasureCount();

        List<Integer> getPressureautomeasureList();

        int getPressureinto();

        int getPressuremeasureresult(int index);

        int getPressuremeasureresultCount();

        List<Integer> getPressuremeasureresultList();

        int getQNEgps();

        int getQNEinto();

        int getQuickAccessApp();

        boolean getQuickEntryApp(int index);

        int getQuickEntryAppCount();

        List<Boolean> getQuickEntryAppList();

        int getRateabnormalreminder();

        int getRatemeasure(int index);

        int getRatemeasureCount();

        List<Integer> getRatemeasureList();

        int getRatewarnreminder();

        int getRebootNum();

        int getRecoverymode();

        int getRemindershock();

        int getReminderstand();

        int getReminderstandcomplete();

        int getRingreminder(int index);

        int getRingreminderCount();

        List<Integer> getRingreminderList();

        int getScheduledelete(int index);

        int getScheduledeleteCount();

        List<Integer> getScheduledeleteList();

        int getScheduleedit();

        int getSchedulereminderclick(int index);

        int getSchedulereminderclickCount();

        List<Integer> getSchedulereminderclickList();

        int getSeePAIexplain();

        int getSeePAIrate();

        int getSetAlarm();

        int getSleepgoal();

        int getSleepreminder();

        int getSleepscreen();

        int getSleepstop();

        int getSpo2Calc(int index);

        int getSpo2CalcCount();

        List<Integer> getSpo2CalcList();

        int getSportIndoorCalibrate(int index);

        int getSportIndoorCalibrateCount();

        List<Integer> getSportIndoorCalibrateList();

        Event.SportStatusMessage getSportStatus(int index);

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

        int getUnlock(int index);

        int getUnlockCount();

        List<Integer> getUnlockList();

        int getUpdataerrscreen(int index);

        int getUpdataerrscreenCount();

        List<Integer> getUpdataerrscreenList();

        int getUpdataimmediatelyscreen(int index);

        int getUpdataimmediatelyscreenCount();

        List<Integer> getUpdataimmediatelyscreenList();

        int getUpdateFail(int index);

        int getUpdateFailCount();

        List<Integer> getUpdateFailList();

        int getUpdatebyuser();

        int getUseStopwatch();

        int getUsecarcount(int index);

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
    }

    public static final class onyxStatisticsMessage extends GeneratedMessageLite<onyxStatisticsMessage, Builder> implements onyxStatisticsMessageOrBuilder {
        public static final int BACKLIGHTLEVEL_FIELD_NUMBER = 3;
        public static final int BASE_FIELD_NUMBER = 1;
        private static final onyxStatisticsMessage DEFAULT_INSTANCE;
        public static final int EVENT_FIELD_NUMBER = 4;
        public static final int NFC_FIELD_NUMBER = 5;
        private static volatile Parser<onyxStatisticsMessage> PARSER = null;
        public static final int SILENCEMODE_FIELD_NUMBER = 2;
        private int backlightLevel_;
        private StatisBase.StatisBaseMessage base_;
        private int bitField0_;
        private onyxEventMessage event_;
        private byte memoizedIsInitialized = 2;
        private Nfc.NfcMessage nfc_;
        private int silenceMode_;

        public static final class Builder extends GeneratedMessageLite.Builder<onyxStatisticsMessage, Builder> implements onyxStatisticsMessageOrBuilder {
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

            public Builder mergeBase(StatisBase.StatisBaseMessage value) {
                copyOnWrite();
                ((onyxStatisticsMessage) this.instance).mergeBase(value);
                return this;
            }

            public Builder mergeEvent(onyxEventMessage value) {
                copyOnWrite();
                ((onyxStatisticsMessage) this.instance).mergeEvent(value);
                return this;
            }

            public Builder mergeNfc(Nfc.NfcMessage value) {
                copyOnWrite();
                ((onyxStatisticsMessage) this.instance).mergeNfc(value);
                return this;
            }

            public Builder setBacklightLevel(int value) {
                copyOnWrite();
                ((onyxStatisticsMessage) this.instance).setBacklightLevel(value);
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage value) {
                copyOnWrite();
                ((onyxStatisticsMessage) this.instance).setBase(value);
                return this;
            }

            public Builder setEvent(onyxEventMessage value) {
                copyOnWrite();
                ((onyxStatisticsMessage) this.instance).setEvent(value);
                return this;
            }

            public Builder setNfc(Nfc.NfcMessage value) {
                copyOnWrite();
                ((onyxStatisticsMessage) this.instance).setNfc(value);
                return this;
            }

            public Builder setSilenceMode(SilenceModeOuterClass.SilenceMode value) {
                copyOnWrite();
                ((onyxStatisticsMessage) this.instance).setSilenceMode(value);
                return this;
            }

            private Builder() {
                super(onyxStatisticsMessage.DEFAULT_INSTANCE);
            }

            public Builder setBase(StatisBase.StatisBaseMessage.Builder builderForValue) {
                copyOnWrite();
                ((onyxStatisticsMessage) this.instance).setBase(builderForValue.build());
                return this;
            }

            public Builder setEvent(onyxEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((onyxStatisticsMessage) this.instance).setEvent(builderForValue.build());
                return this;
            }

            public Builder setNfc(Nfc.NfcMessage.Builder builderForValue) {
                copyOnWrite();
                ((onyxStatisticsMessage) this.instance).setNfc(builderForValue.build());
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
        public void mergeEvent(onyxEventMessage value) {
            value.getClass();
            onyxEventMessage onyxeventmessage = this.event_;
            if (onyxeventmessage == null || onyxeventmessage == onyxEventMessage.getDefaultInstance()) {
                this.event_ = value;
            } else {
                this.event_ = onyxEventMessage.newBuilder(this.event_).mergeFrom(value).buildPartial();
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

        public static onyxStatisticsMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (onyxStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static onyxStatisticsMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (onyxStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<onyxStatisticsMessage> parser() {
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
        public void setEvent(onyxEventMessage value) {
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new onyxStatisticsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001ᔉ\u0000\u0002ᔌ\u0001\u0003ᔋ\u0002\u0004ᔉ\u0003\u0005ᐉ\u0004", new Object[]{"bitField0_", "base_", "silenceMode_", SilenceModeOuterClass.SilenceMode.internalGetVerifier(), "backlightLevel_", "event_", "nfc_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<onyxStatisticsMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (onyxStatisticsMessage.class) {
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

        public static Builder newBuilder(onyxStatisticsMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static onyxStatisticsMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (onyxStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static onyxStatisticsMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (onyxStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static onyxStatisticsMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (onyxStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static onyxStatisticsMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (onyxStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static onyxStatisticsMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (onyxStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static onyxStatisticsMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (onyxStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static onyxStatisticsMessage parseFrom(InputStream input) throws IOException {
            return (onyxStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static onyxStatisticsMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (onyxStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static onyxStatisticsMessage parseFrom(CodedInputStream input) throws IOException {
            return (onyxStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static onyxStatisticsMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (onyxStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface onyxStatisticsMessageOrBuilder extends MessageLiteOrBuilder {
        int getBacklightLevel();

        StatisBase.StatisBaseMessage getBase();

        onyxEventMessage getEvent();

        Nfc.NfcMessage getNfc();

        SilenceModeOuterClass.SilenceMode getSilenceMode();

        boolean hasBacklightLevel();

        boolean hasBase();

        boolean hasEvent();

        boolean hasNfc();

        boolean hasSilenceMode();
    }

    private Onyx() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }
}
