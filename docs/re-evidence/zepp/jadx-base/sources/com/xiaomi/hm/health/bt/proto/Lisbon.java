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
public final class Lisbon {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.Lisbon$1, reason: invalid class name */
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

    public static final class lisbonEventMessage extends GeneratedMessageLite<lisbonEventMessage, Builder> implements lisbonEventMessageOrBuilder {
        public static final int ACTIVITYOBJECTIVES_FIELD_NUMBER = 149;
        public static final int ACTIVITYTARGET_FIELD_NUMBER = 55;
        public static final int ADDCARDSUCCESS_FIELD_NUMBER = 45;
        public static final int ALARMREMINDERCLICK_FIELD_NUMBER = 118;
        public static final int ALARMREMINDER_FIELD_NUMBER = 117;
        public static final int ALIPAYBINDSUCCESSNUM_FIELD_NUMBER = 29;
        public static final int APLAYSCREEN_FIELD_NUMBER = 144;
        public static final int ASSISTANTCARID_FIELD_NUMBER = 145;
        public static final int ASSISTANTINTO_FIELD_NUMBER = 146;
        public static final int ASSISTANTVAD_FIELD_NUMBER = 147;
        public static final int AUTOLIGHT_FIELD_NUMBER = 65;
        public static final int AUTOSCREENOFFTIME_FIELD_NUMBER = 60;
        public static final int BASE_RES_FIELD_NUMBER = 75;
        public static final int BATTERYSAVEROFF_FIELD_NUMBER = 39;
        public static final int BATTERYSAVERON_FIELD_NUMBER = 40;
        public static final int BINDINGSUCCESS_FIELD_NUMBER = 46;
        public static final int BINDSETLANGUAGE_FIELD_NUMBER = 167;
        public static final int BLECONNECTCLOSE_FIELD_NUMBER = 128;
        public static final int BLECONNECTFAIL_FIELD_NUMBER = 126;
        public static final int BLECONNECTSUCCESS_FIELD_NUMBER = 125;
        public static final int BLECONNECT_FIELD_NUMBER = 124;
        public static final int BLELISTCLICK_FIELD_NUMBER = 127;
        public static final int BLESTATUS_FIELD_NUMBER = 123;
        public static final int CHANGEBATTERYVALUE_FIELD_NUMBER = 59;
        public static final int CLOSEWIFI_FIELD_NUMBER = 135;
        public static final int CLOUDMUSICPLAYBACKFOLDER_FIELD_NUMBER = 86;
        public static final int CLOUDMUSICPLAYMODE_FIELD_NUMBER = 87;
        public static final int COMPASSCALIBRATESUCCESSNUM_FIELD_NUMBER = 28;
        public static final int COUNTDOWNTIMEUP_FIELD_NUMBER = 38;
        public static final int COUTDOWNTIME_FIELD_NUMBER = 109;
        public static final int CURRENTDIALID_FIELD_NUMBER = 66;
        public static final int CURRENTDIALNUM_FIELD_NUMBER = 67;
        private static final lisbonEventMessage DEFAULT_INSTANCE;
        public static final int DIALCHANGEMODE_FIELD_NUMBER = 148;
        public static final int DIALTOOL_FIELD_NUMBER = 108;
        public static final int DNDMODE_FIELD_NUMBER = 56;
        public static final int ENTERCLOUDMUSIC_FIELD_NUMBER = 85;
        public static final int ENTERLOCALMUSICFIRSTPAGE_FIELD_NUMBER = 96;
        public static final int ENTERMUSICVICESCREEN_FIELD_NUMBER = 95;
        public static final int EVENTTIMEUP_FIELD_NUMBER = 33;
        public static final int FAT_DOSFSCK_FIELD_NUMBER = 73;
        public static final int FAT_DROPSIZE_FIELD_NUMBER = 70;
        public static final int FAT_DROPTIME_FIELD_NUMBER = 71;
        public static final int FAT_FORMAT_FIELD_NUMBER = 72;
        public static final int FAT_FREESIZE_FIELD_NUMBER = 69;
        public static final int FINDMOBLIE_FIELD_NUMBER = 158;
        public static final int FINDPHONE_FIELD_NUMBER = 42;
        public static final int FIRMWARE_FIELD_NUMBER = 74;
        public static final int FLYMODE_FIELD_NUMBER = 122;
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
        public static final int GOTOSLEEP_FIELD_NUMBER = 159;
        public static final int GOTOSPO2PAGE_FIELD_NUMBER = 11;
        public static final int GOTOSPORTDETAILPAGE_FIELD_NUMBER = 4;
        public static final int GOTOSPORTHISTORY_FIELD_NUMBER = 3;
        public static final int GOTOSPORTPAGE_FIELD_NUMBER = 5;
        public static final int GOTOSTOPWATCHPAGE_FIELD_NUMBER = 21;
        public static final int GOTOWAKEUP_FIELD_NUMBER = 160;
        public static final int GOTOWEATHERPAGE_FIELD_NUMBER = 14;
        public static final int GOTOWEATHERSECONDPAGE_FIELD_NUMBER = 15;
        public static final int HFPCALLINANSWER_FIELD_NUMBER = 90;
        public static final int HFPCALLINHANGUP_FIELD_NUMBER = 89;
        public static final int HFPCALLINIGNORE_FIELD_NUMBER = 88;
        public static final int HFPCALLONHANGUP_FIELD_NUMBER = 92;
        public static final int HFPCALLONMUTE_FIELD_NUMBER = 91;
        public static final int HFPCALLONSWITCHPHONE_FIELD_NUMBER = 94;
        public static final int HFPCALLONVOLUME_FIELD_NUMBER = 93;
        public static final int INC_RES_FIELD_NUMBER = 76;
        public static final int LANGUAGESELECT_FIELD_NUMBER = 132;
        public static final int LCDOFF_FIELD_NUMBER = 32;
        public static final int LCDONBECAUSEOFWRISTSTATUS_FIELD_NUMBER = 61;
        public static final int LCDONBECAUSEOFWRIST_FIELD_NUMBER = 31;
        public static final int LIGHTSCREENTIME_FIELD_NUMBER = 133;
        public static final int LIGHTSETTING_FIELD_NUMBER = 155;
        public static final int LOCALMUSICAUDIOSOURCE_FIELD_NUMBER = 101;
        public static final int LOCALMUSICCONNECTBLEDEVICE_FIELD_NUMBER = 102;
        public static final int LOCALMUSICLOOPBUTTON_FIELD_NUMBER = 99;
        public static final int LOCALMUSICLOOPMODE_FIELD_NUMBER = 98;
        public static final int LOCALMUSICPLAYBACKBUTTON_FIELD_NUMBER = 100;
        public static final int LOCALMUSICSONGSOURCE_FIELD_NUMBER = 97;
        public static final int LOCKSCREEN_FIELD_NUMBER = 41;
        public static final int MODIFYPWD_FIELD_NUMBER = 129;
        public static final int NANDMESSAGE_FIELD_NUMBER = 68;
        public static final int NFCSTATUS_FIELD_NUMBER = 130;
        public static final int NOBINDRECOVERY_FIELD_NUMBER = 165;
        public static final int NOBINDSUPERVISE_FIELD_NUMBER = 166;
        public static final int NOTIFY_FIELD_NUMBER = 27;
        public static final int OFFLINEASRCMD_FIELD_NUMBER = 81;
        public static final int OFFLINEASRFAILORSUCCESS_FIELD_NUMBER = 80;
        public static final int OFFLINEASRMODEINTO_FIELD_NUMBER = 79;
        public static final int OFFLINEASRMODESELECT_FIELD_NUMBER = 78;
        public static final int OFFWRISTLOCK_FIELD_NUMBER = 116;
        public static final int ONLINEVADACTIONTYPE_FIELD_NUMBER = 84;
        public static final int ONLINEVADREQUEST_FIELD_NUMBER = 83;
        public static final int ONLINEVADSTARTTYPE_FIELD_NUMBER = 82;
        private static volatile Parser<lisbonEventMessage> PARSER = null;
        public static final int POWEROFFBATTERYVALUE_FIELD_NUMBER = 57;
        public static final int POWEROFF_FIELD_NUMBER = 48;
        public static final int POWERONBATTERYVALUE_FIELD_NUMBER = 58;
        public static final int PRESSUREAUTOMEASURE_FIELD_NUMBER = 142;
        public static final int PRESSUREINTO_FIELD_NUMBER = 141;
        public static final int PRESSUREMEASURERESULT_FIELD_NUMBER = 143;
        public static final int QNEGPS_FIELD_NUMBER = 120;
        public static final int QNEINTO_FIELD_NUMBER = 119;
        public static final int QUICKACCESSAPP_FIELD_NUMBER = 63;
        public static final int QUICKENTRYAPP_FIELD_NUMBER = 64;
        public static final int RATEABNORMALREMINDER_FIELD_NUMBER = 156;
        public static final int RATEMEASURE_FIELD_NUMBER = 140;
        public static final int RATEWARNREMINDER_FIELD_NUMBER = 157;
        public static final int REBOOTNUM_FIELD_NUMBER = 47;
        public static final int RECOVERYMODE_FIELD_NUMBER = 112;
        public static final int REMINDERSHOCK_FIELD_NUMBER = 105;
        public static final int REMINDERSTANDCOMPLETE_FIELD_NUMBER = 111;
        public static final int REMINDERSTAND_FIELD_NUMBER = 110;
        public static final int RINGREMINDER_FIELD_NUMBER = 131;
        public static final int SCHEDULEDELETE_FIELD_NUMBER = 152;
        public static final int SCHEDULEEDIT_FIELD_NUMBER = 153;
        public static final int SCHEDULEREMINDERCLICK_FIELD_NUMBER = 121;
        public static final int SEEPAIEXPLAIN_FIELD_NUMBER = 107;
        public static final int SEEPAIRATE_FIELD_NUMBER = 106;
        public static final int SETALARM_FIELD_NUMBER = 35;
        public static final int SLEEPGOAL_FIELD_NUMBER = 162;
        public static final int SLEEPREMINDER_FIELD_NUMBER = 164;
        public static final int SLEEPSCREEN_FIELD_NUMBER = 161;
        public static final int SLEEPSTOP_FIELD_NUMBER = 163;
        public static final int SPO2CALC_FIELD_NUMBER = 30;
        public static final int SPORTINDOORCALIBRATE_FIELD_NUMBER = 53;
        public static final int SPORTREMINDERSAVE_FIELD_NUMBER = 169;
        public static final int SPORTSTATUS_FIELD_NUMBER = 52;
        public static final int STARTWIFI_FIELD_NUMBER = 134;
        public static final int STOPWATCHRESET_FIELD_NUMBER = 151;
        public static final int STOPWATCHSTART_FIELD_NUMBER = 150;
        public static final int SWIMPOOLLENGTH_FIELD_NUMBER = 54;
        public static final int SYSTEMUPDATECANCLE_FIELD_NUMBER = 50;
        public static final int SYSTEMUPDATEIMMEDIATELY_FIELD_NUMBER = 49;
        public static final int SYSVIBRATION_FIELD_NUMBER = 139;
        public static final int TURNONKEEPWATCHAWAKE_FIELD_NUMBER = 44;
        public static final int TURNONTHEATERMODE_FIELD_NUMBER = 43;
        public static final int UNLOCK_FIELD_NUMBER = 34;
        public static final int UPDATAERRSCREEN_FIELD_NUMBER = 103;
        public static final int UPDATAIMMEDIATELYSCREEN_FIELD_NUMBER = 104;
        public static final int UPDATEBYUSER_FIELD_NUMBER = 168;
        public static final int UPDATEFAIL_FIELD_NUMBER = 51;
        public static final int USECARCOUNT_FIELD_NUMBER = 113;
        public static final int USESTOPWATCH_FIELD_NUMBER = 36;
        public static final int VOLBYCONTROL_FIELD_NUMBER = 115;
        public static final int VOLBYSETTING_FIELD_NUMBER = 138;
        public static final int VOLSETCOUNT_FIELD_NUMBER = 114;
        public static final int WATCHDIR_FIELD_NUMBER = 154;
        public static final int WIFIPWDCORRECT_FIELD_NUMBER = 137;
        public static final int WIFITIPSPAGE_FIELD_NUMBER = 136;
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
        private int bitField4_;
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
        private int enterCloudMusic_;
        private int enterLocalMusicFirstpage_;
        private int enterMusicViceScreen_;
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
        private int hfpCallInAnswer_;
        private int hfpCallInHangUp_;
        private int hfpCallInIgnore_;
        private int hfpCallOnHangUp_;
        private int hfpCallOnMute_;
        private int hfpCallOnSwitchPhone_;
        private int hfpCallOnVolume_;
        private Event.DfuUpgradeMessage incRes_;
        private int languageselect_;
        private int lcdOnBecauseOfWristStatus_;
        private int lcdOnBecauseOfWrist_;
        private Event.lightscreentimeMessage lightscreentime_;
        private int lightsetting_;
        private int localMusicConnectBleDevice_;
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
        private Internal.IntList offlineAsrModeSelect_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList offlineAsrModeInto_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList offlineAsrFailOrSuccess_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList offlineAsrCmd_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList onlineVADStartType_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList onlineVADRequest_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList onlineVADActionType_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList cloudMusicPlayBackFolder_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList cloudMusicPlayMode_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList localMusicSongSource_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList localMusicLoopMode_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList localMusicLoopButton_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList localMusicPlaybackButton_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList localMusicAudioSource_ = GeneratedMessageLite.emptyIntList();
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

        public static final class Builder extends GeneratedMessageLite.Builder<lisbonEventMessage, Builder> implements lisbonEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAlarmreminderclick(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAlarmreminderclick(value);
                return this;
            }

            public Builder addAllAlarmreminderclick(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllAlarmreminderclick(values);
                return this;
            }

            public Builder addAllBleconnect(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllBleconnect(values);
                return this;
            }

            public Builder addAllBlestatus(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllBlestatus(values);
                return this;
            }

            public Builder addAllCloudMusicPlayBackFolder(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllCloudMusicPlayBackFolder(values);
                return this;
            }

            public Builder addAllCloudMusicPlayMode(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllCloudMusicPlayMode(values);
                return this;
            }

            public Builder addAllFlymode(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllFlymode(values);
                return this;
            }

            public Builder addAllGotoSportDetailPage(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllGotoSportDetailPage(values);
                return this;
            }

            public Builder addAllLcdOff(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllLcdOff(values);
                return this;
            }

            public Builder addAllLocalMusicAudioSource(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllLocalMusicAudioSource(values);
                return this;
            }

            public Builder addAllLocalMusicLoopButton(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllLocalMusicLoopButton(values);
                return this;
            }

            public Builder addAllLocalMusicLoopMode(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllLocalMusicLoopMode(values);
                return this;
            }

            public Builder addAllLocalMusicPlaybackButton(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllLocalMusicPlaybackButton(values);
                return this;
            }

            public Builder addAllLocalMusicSongSource(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllLocalMusicSongSource(values);
                return this;
            }

            public Builder addAllModifypwd(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllModifypwd(values);
                return this;
            }

            public Builder addAllNFCstatus(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllNFCstatus(values);
                return this;
            }

            public Builder addAllNotify(Iterable<? extends Event.NotifyMessage> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllNotify(values);
                return this;
            }

            public Builder addAllOfflineAsrCmd(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllOfflineAsrCmd(values);
                return this;
            }

            public Builder addAllOfflineAsrFailOrSuccess(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllOfflineAsrFailOrSuccess(values);
                return this;
            }

            public Builder addAllOfflineAsrModeInto(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllOfflineAsrModeInto(values);
                return this;
            }

            public Builder addAllOfflineAsrModeSelect(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllOfflineAsrModeSelect(values);
                return this;
            }

            public Builder addAllOffwristlock(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllOffwristlock(values);
                return this;
            }

            public Builder addAllOnlineVADActionType(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllOnlineVADActionType(values);
                return this;
            }

            public Builder addAllOnlineVADRequest(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllOnlineVADRequest(values);
                return this;
            }

            public Builder addAllOnlineVADStartType(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllOnlineVADStartType(values);
                return this;
            }

            public Builder addAllPressureautomeasure(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllPressureautomeasure(values);
                return this;
            }

            public Builder addAllPressuremeasureresult(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllPressuremeasureresult(values);
                return this;
            }

            public Builder addAllQuickEntryApp(Iterable<? extends Boolean> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllQuickEntryApp(values);
                return this;
            }

            public Builder addAllRatemeasure(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllRatemeasure(values);
                return this;
            }

            public Builder addAllRingreminder(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllRingreminder(values);
                return this;
            }

            public Builder addAllScheduledelete(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllScheduledelete(values);
                return this;
            }

            public Builder addAllSchedulereminderclick(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllSchedulereminderclick(values);
                return this;
            }

            public Builder addAllSpo2Calc(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllSpo2Calc(values);
                return this;
            }

            public Builder addAllSportIndoorCalibrate(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllSportIndoorCalibrate(values);
                return this;
            }

            public Builder addAllSportStatus(Iterable<? extends Event.SportStatusMessage> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllSportStatus(values);
                return this;
            }

            public Builder addAllUnlock(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllUnlock(values);
                return this;
            }

            public Builder addAllUpdataerrscreen(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllUpdataerrscreen(values);
                return this;
            }

            public Builder addAllUpdataimmediatelyscreen(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllUpdataimmediatelyscreen(values);
                return this;
            }

            public Builder addAllUpdateFail(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllUpdateFail(values);
                return this;
            }

            public Builder addAllUsecarcount(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addAllUsecarcount(values);
                return this;
            }

            public Builder addBleconnect(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addBleconnect(value);
                return this;
            }

            public Builder addBlestatus(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addBlestatus(value);
                return this;
            }

            public Builder addCloudMusicPlayBackFolder(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addCloudMusicPlayBackFolder(value);
                return this;
            }

            public Builder addCloudMusicPlayMode(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addCloudMusicPlayMode(value);
                return this;
            }

            public Builder addFlymode(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addFlymode(value);
                return this;
            }

            public Builder addGotoSportDetailPage(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addGotoSportDetailPage(value);
                return this;
            }

            public Builder addLcdOff(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addLcdOff(value);
                return this;
            }

            public Builder addLocalMusicAudioSource(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addLocalMusicAudioSource(value);
                return this;
            }

            public Builder addLocalMusicLoopButton(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addLocalMusicLoopButton(value);
                return this;
            }

            public Builder addLocalMusicLoopMode(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addLocalMusicLoopMode(value);
                return this;
            }

            public Builder addLocalMusicPlaybackButton(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addLocalMusicPlaybackButton(value);
                return this;
            }

            public Builder addLocalMusicSongSource(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addLocalMusicSongSource(value);
                return this;
            }

            public Builder addModifypwd(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addModifypwd(value);
                return this;
            }

            public Builder addNFCstatus(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addNFCstatus(value);
                return this;
            }

            public Builder addNotify(Event.NotifyMessage value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addNotify(value);
                return this;
            }

            public Builder addOfflineAsrCmd(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addOfflineAsrCmd(value);
                return this;
            }

            public Builder addOfflineAsrFailOrSuccess(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addOfflineAsrFailOrSuccess(value);
                return this;
            }

            public Builder addOfflineAsrModeInto(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addOfflineAsrModeInto(value);
                return this;
            }

            public Builder addOfflineAsrModeSelect(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addOfflineAsrModeSelect(value);
                return this;
            }

            public Builder addOffwristlock(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addOffwristlock(value);
                return this;
            }

            public Builder addOnlineVADActionType(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addOnlineVADActionType(value);
                return this;
            }

            public Builder addOnlineVADRequest(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addOnlineVADRequest(value);
                return this;
            }

            public Builder addOnlineVADStartType(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addOnlineVADStartType(value);
                return this;
            }

            public Builder addPressureautomeasure(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addPressureautomeasure(value);
                return this;
            }

            public Builder addPressuremeasureresult(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addPressuremeasureresult(value);
                return this;
            }

            public Builder addQuickEntryApp(boolean value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addQuickEntryApp(value);
                return this;
            }

            public Builder addRatemeasure(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addRatemeasure(value);
                return this;
            }

            public Builder addRingreminder(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addRingreminder(value);
                return this;
            }

            public Builder addScheduledelete(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addScheduledelete(value);
                return this;
            }

            public Builder addSchedulereminderclick(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addSchedulereminderclick(value);
                return this;
            }

            public Builder addSpo2Calc(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addSpo2Calc(value);
                return this;
            }

            public Builder addSportIndoorCalibrate(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addSportIndoorCalibrate(value);
                return this;
            }

            public Builder addSportStatus(Event.SportStatusMessage value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addSportStatus(value);
                return this;
            }

            public Builder addUnlock(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addUnlock(value);
                return this;
            }

            public Builder addUpdataerrscreen(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addUpdataerrscreen(value);
                return this;
            }

            public Builder addUpdataimmediatelyscreen(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addUpdataimmediatelyscreen(value);
                return this;
            }

            public Builder addUpdateFail(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addUpdateFail(value);
                return this;
            }

            public Builder addUsecarcount(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addUsecarcount(value);
                return this;
            }

            public Builder clearActivityTarget() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearActivityTarget();
                return this;
            }

            public Builder clearActivityobjectives() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearActivityobjectives();
                return this;
            }

            public Builder clearAddCardSuccess() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearAddCardSuccess();
                return this;
            }

            public Builder clearAlarmreminder() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearAlarmreminder();
                return this;
            }

            public Builder clearAlarmreminderclick() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearAlarmreminderclick();
                return this;
            }

            public Builder clearAlipayBindSuccessNum() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearAlipayBindSuccessNum();
                return this;
            }

            public Builder clearAplayscreen() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearAplayscreen();
                return this;
            }

            public Builder clearAssistantVAD() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearAssistantVAD();
                return this;
            }

            public Builder clearAssistantcarid() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearAssistantcarid();
                return this;
            }

            public Builder clearAssistantinto() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearAssistantinto();
                return this;
            }

            public Builder clearAutoLight() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearAutoLight();
                return this;
            }

            public Builder clearAutoScreenOffTime() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearAutoScreenOffTime();
                return this;
            }

            public Builder clearBaseRes() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearBaseRes();
                return this;
            }

            public Builder clearBatterySaverOff() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearBatterySaverOff();
                return this;
            }

            public Builder clearBatterySaverOn() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearBatterySaverOn();
                return this;
            }

            public Builder clearBindingSuccess() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearBindingSuccess();
                return this;
            }

            public Builder clearBindsetlanguage() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearBindsetlanguage();
                return this;
            }

            public Builder clearBleconnect() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearBleconnect();
                return this;
            }

            public Builder clearBleconnectclose() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearBleconnectclose();
                return this;
            }

            public Builder clearBleconnectfail() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearBleconnectfail();
                return this;
            }

            public Builder clearBleconnectsuccess() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearBleconnectsuccess();
                return this;
            }

            public Builder clearBlelistclick() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearBlelistclick();
                return this;
            }

            public Builder clearBlestatus() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearBlestatus();
                return this;
            }

            public Builder clearChangeBatteryValue() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearChangeBatteryValue();
                return this;
            }

            public Builder clearClosewifi() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearClosewifi();
                return this;
            }

            public Builder clearCloudMusicPlayBackFolder() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearCloudMusicPlayBackFolder();
                return this;
            }

            public Builder clearCloudMusicPlayMode() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearCloudMusicPlayMode();
                return this;
            }

            public Builder clearCompassCalibrateSuccessNum() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearCompassCalibrateSuccessNum();
                return this;
            }

            public Builder clearCountDownTimeup() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearCountDownTimeup();
                return this;
            }

            public Builder clearCoutdowntime() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearCoutdowntime();
                return this;
            }

            public Builder clearCurrentDialId() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearCurrentDialId();
                return this;
            }

            public Builder clearCurrentDialNum() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearCurrentDialNum();
                return this;
            }

            public Builder clearDialchangemode() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearDialchangemode();
                return this;
            }

            public Builder clearDialtool() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearDialtool();
                return this;
            }

            public Builder clearDndMode() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearDndMode();
                return this;
            }

            public Builder clearEnterCloudMusic() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearEnterCloudMusic();
                return this;
            }

            public Builder clearEnterLocalMusicFirstpage() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearEnterLocalMusicFirstpage();
                return this;
            }

            public Builder clearEnterMusicViceScreen() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearEnterMusicViceScreen();
                return this;
            }

            public Builder clearEventTimeUp() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearEventTimeUp();
                return this;
            }

            public Builder clearFatDosfsck() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearFatDosfsck();
                return this;
            }

            public Builder clearFatDropsize() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearFatDropsize();
                return this;
            }

            public Builder clearFatDroptime() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearFatDroptime();
                return this;
            }

            public Builder clearFatFormat() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearFatFormat();
                return this;
            }

            public Builder clearFatFreesize() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearFatFreesize();
                return this;
            }

            public Builder clearFindPhone() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearFindPhone();
                return this;
            }

            public Builder clearFindmoblie() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearFindmoblie();
                return this;
            }

            public Builder clearFirmware() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearFirmware();
                return this;
            }

            public Builder clearFlymode() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearFlymode();
                return this;
            }

            public Builder clearFont() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearFont();
                return this;
            }

            public Builder clearForgetWristOffLockPasswd() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearForgetWristOffLockPasswd();
                return this;
            }

            public Builder clearGotoActivityPage() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearGotoActivityPage();
                return this;
            }

            public Builder clearGotoAlarmPage() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearGotoAlarmPage();
                return this;
            }

            public Builder clearGotoCompassPage() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearGotoCompassPage();
                return this;
            }

            public Builder clearGotoCountdownPage() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearGotoCountdownPage();
                return this;
            }

            public Builder clearGotoDialActivityPage() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearGotoDialActivityPage();
                return this;
            }

            public Builder clearGotoDialAlarmPage() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearGotoDialAlarmPage();
                return this;
            }

            public Builder clearGotoDialAlipayPage() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearGotoDialAlipayPage();
                return this;
            }

            public Builder clearGotoDialEventPage() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearGotoDialEventPage();
                return this;
            }

            public Builder clearGotoDialHeartPage() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearGotoDialHeartPage();
                return this;
            }

            public Builder clearGotoDialMusicPage() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearGotoDialMusicPage();
                return this;
            }

            public Builder clearGotoDialNfcCadePage() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearGotoDialNfcCadePage();
                return this;
            }

            public Builder clearGotoDialPaiPage() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearGotoDialPaiPage();
                return this;
            }

            public Builder clearGotoDialSportPage() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearGotoDialSportPage();
                return this;
            }

            public Builder clearGotoDialWeatherPage() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearGotoDialWeatherPage();
                return this;
            }

            public Builder clearGotoEventPage() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearGotoEventPage();
                return this;
            }

            public Builder clearGotoHeartPage() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearGotoHeartPage();
                return this;
            }

            public Builder clearGotoMusicPage() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearGotoMusicPage();
                return this;
            }

            public Builder clearGotoNfcCardPage() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearGotoNfcCardPage();
                return this;
            }

            public Builder clearGotoPaiPage() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearGotoPaiPage();
                return this;
            }

            public Builder clearGotoSpO2Page() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearGotoSpO2Page();
                return this;
            }

            public Builder clearGotoSportDetailPage() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearGotoSportDetailPage();
                return this;
            }

            public Builder clearGotoSportHistory() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearGotoSportHistory();
                return this;
            }

            public Builder clearGotoSportPage() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearGotoSportPage();
                return this;
            }

            public Builder clearGotoStopwatchPage() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearGotoStopwatchPage();
                return this;
            }

            public Builder clearGotoWeatherPage() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearGotoWeatherPage();
                return this;
            }

            public Builder clearGotoWeatherSecondPage() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearGotoWeatherSecondPage();
                return this;
            }

            public Builder clearGotosleep() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearGotosleep();
                return this;
            }

            public Builder clearGotowakeup() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearGotowakeup();
                return this;
            }

            public Builder clearHfpCallInAnswer() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearHfpCallInAnswer();
                return this;
            }

            public Builder clearHfpCallInHangUp() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearHfpCallInHangUp();
                return this;
            }

            public Builder clearHfpCallInIgnore() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearHfpCallInIgnore();
                return this;
            }

            public Builder clearHfpCallOnHangUp() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearHfpCallOnHangUp();
                return this;
            }

            public Builder clearHfpCallOnMute() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearHfpCallOnMute();
                return this;
            }

            public Builder clearHfpCallOnSwitchPhone() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearHfpCallOnSwitchPhone();
                return this;
            }

            public Builder clearHfpCallOnVolume() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearHfpCallOnVolume();
                return this;
            }

            public Builder clearIncRes() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearIncRes();
                return this;
            }

            public Builder clearLanguageselect() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearLanguageselect();
                return this;
            }

            public Builder clearLcdOff() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearLcdOff();
                return this;
            }

            public Builder clearLcdOnBecauseOfWrist() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearLcdOnBecauseOfWrist();
                return this;
            }

            public Builder clearLcdOnBecauseOfWristStatus() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearLcdOnBecauseOfWristStatus();
                return this;
            }

            public Builder clearLightscreentime() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearLightscreentime();
                return this;
            }

            public Builder clearLightsetting() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearLightsetting();
                return this;
            }

            public Builder clearLocalMusicAudioSource() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearLocalMusicAudioSource();
                return this;
            }

            public Builder clearLocalMusicConnectBleDevice() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearLocalMusicConnectBleDevice();
                return this;
            }

            public Builder clearLocalMusicLoopButton() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearLocalMusicLoopButton();
                return this;
            }

            public Builder clearLocalMusicLoopMode() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearLocalMusicLoopMode();
                return this;
            }

            public Builder clearLocalMusicPlaybackButton() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearLocalMusicPlaybackButton();
                return this;
            }

            public Builder clearLocalMusicSongSource() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearLocalMusicSongSource();
                return this;
            }

            public Builder clearLockScreen() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearLockScreen();
                return this;
            }

            public Builder clearModifypwd() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearModifypwd();
                return this;
            }

            public Builder clearNFCstatus() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearNFCstatus();
                return this;
            }

            public Builder clearNandMessage() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearNandMessage();
                return this;
            }

            public Builder clearNobindrecovery() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearNobindrecovery();
                return this;
            }

            public Builder clearNobindsupervise() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearNobindsupervise();
                return this;
            }

            public Builder clearNotify() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearNotify();
                return this;
            }

            public Builder clearOfflineAsrCmd() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearOfflineAsrCmd();
                return this;
            }

            public Builder clearOfflineAsrFailOrSuccess() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearOfflineAsrFailOrSuccess();
                return this;
            }

            public Builder clearOfflineAsrModeInto() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearOfflineAsrModeInto();
                return this;
            }

            public Builder clearOfflineAsrModeSelect() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearOfflineAsrModeSelect();
                return this;
            }

            public Builder clearOffwristlock() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearOffwristlock();
                return this;
            }

            public Builder clearOnlineVADActionType() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearOnlineVADActionType();
                return this;
            }

            public Builder clearOnlineVADRequest() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearOnlineVADRequest();
                return this;
            }

            public Builder clearOnlineVADStartType() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearOnlineVADStartType();
                return this;
            }

            public Builder clearPowerOff() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearPowerOff();
                return this;
            }

            public Builder clearPowerOffBatteryValue() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearPowerOffBatteryValue();
                return this;
            }

            public Builder clearPowerOnBatteryValue() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearPowerOnBatteryValue();
                return this;
            }

            public Builder clearPressureautomeasure() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearPressureautomeasure();
                return this;
            }

            public Builder clearPressureinto() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearPressureinto();
                return this;
            }

            public Builder clearPressuremeasureresult() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearPressuremeasureresult();
                return this;
            }

            public Builder clearQNEgps() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearQNEgps();
                return this;
            }

            public Builder clearQNEinto() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearQNEinto();
                return this;
            }

            public Builder clearQuickAccessApp() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearQuickAccessApp();
                return this;
            }

            public Builder clearQuickEntryApp() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearQuickEntryApp();
                return this;
            }

            public Builder clearRateabnormalreminder() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearRateabnormalreminder();
                return this;
            }

            public Builder clearRatemeasure() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearRatemeasure();
                return this;
            }

            public Builder clearRatewarnreminder() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearRatewarnreminder();
                return this;
            }

            public Builder clearRebootNum() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearRebootNum();
                return this;
            }

            public Builder clearRecoverymode() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearRecoverymode();
                return this;
            }

            public Builder clearRemindershock() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearRemindershock();
                return this;
            }

            public Builder clearReminderstand() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearReminderstand();
                return this;
            }

            public Builder clearReminderstandcomplete() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearReminderstandcomplete();
                return this;
            }

            public Builder clearRingreminder() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearRingreminder();
                return this;
            }

            public Builder clearScheduledelete() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearScheduledelete();
                return this;
            }

            public Builder clearScheduleedit() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearScheduleedit();
                return this;
            }

            public Builder clearSchedulereminderclick() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearSchedulereminderclick();
                return this;
            }

            public Builder clearSeePAIexplain() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearSeePAIexplain();
                return this;
            }

            public Builder clearSeePAIrate() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearSeePAIrate();
                return this;
            }

            public Builder clearSetAlarm() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearSetAlarm();
                return this;
            }

            public Builder clearSleepgoal() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearSleepgoal();
                return this;
            }

            public Builder clearSleepreminder() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearSleepreminder();
                return this;
            }

            public Builder clearSleepscreen() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearSleepscreen();
                return this;
            }

            public Builder clearSleepstop() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearSleepstop();
                return this;
            }

            public Builder clearSpo2Calc() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearSpo2Calc();
                return this;
            }

            public Builder clearSportIndoorCalibrate() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearSportIndoorCalibrate();
                return this;
            }

            public Builder clearSportStatus() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearSportStatus();
                return this;
            }

            public Builder clearSportremindersave() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearSportremindersave();
                return this;
            }

            public Builder clearStartwifi() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearStartwifi();
                return this;
            }

            public Builder clearStopwatchreset() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearStopwatchreset();
                return this;
            }

            public Builder clearStopwatchstart() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearStopwatchstart();
                return this;
            }

            public Builder clearSwimPoolLength() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearSwimPoolLength();
                return this;
            }

            public Builder clearSysVibration() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearSysVibration();
                return this;
            }

            public Builder clearSystemUpdateCancle() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearSystemUpdateCancle();
                return this;
            }

            public Builder clearSystemUpdateImmediately() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearSystemUpdateImmediately();
                return this;
            }

            public Builder clearTurnOnTheaterMode() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearTurnOnTheaterMode();
                return this;
            }

            public Builder clearTurnOnkeepWatchAwake() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearTurnOnkeepWatchAwake();
                return this;
            }

            public Builder clearUnlock() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearUnlock();
                return this;
            }

            public Builder clearUpdataerrscreen() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearUpdataerrscreen();
                return this;
            }

            public Builder clearUpdataimmediatelyscreen() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearUpdataimmediatelyscreen();
                return this;
            }

            public Builder clearUpdateFail() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearUpdateFail();
                return this;
            }

            public Builder clearUpdatebyuser() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearUpdatebyuser();
                return this;
            }

            public Builder clearUseStopwatch() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearUseStopwatch();
                return this;
            }

            public Builder clearUsecarcount() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearUsecarcount();
                return this;
            }

            public Builder clearVolbycontrol() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearVolbycontrol();
                return this;
            }

            public Builder clearVolbysetting() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearVolbysetting();
                return this;
            }

            public Builder clearVolsetcount() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearVolsetcount();
                return this;
            }

            public Builder clearWatchdir() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearWatchdir();
                return this;
            }

            public Builder clearWifiTipspage() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearWifiTipspage();
                return this;
            }

            public Builder clearWifipwdcorrect() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearWifipwdcorrect();
                return this;
            }

            public Builder clearWristOffLockStatus() {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).clearWristOffLockStatus();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getActivityTarget() {
                return ((lisbonEventMessage) this.instance).getActivityTarget();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getActivityobjectives() {
                return ((lisbonEventMessage) this.instance).getActivityobjectives();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getAddCardSuccess() {
                return ((lisbonEventMessage) this.instance).getAddCardSuccess();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getAlarmreminder() {
                return ((lisbonEventMessage) this.instance).getAlarmreminder();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getAlarmreminderclick(int index) {
                return ((lisbonEventMessage) this.instance).getAlarmreminderclick(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getAlarmreminderclickCount() {
                return ((lisbonEventMessage) this.instance).getAlarmreminderclickCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getAlarmreminderclickList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getAlarmreminderclickList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getAlipayBindSuccessNum() {
                return ((lisbonEventMessage) this.instance).getAlipayBindSuccessNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getAplayscreen() {
                return ((lisbonEventMessage) this.instance).getAplayscreen();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getAssistantVAD() {
                return ((lisbonEventMessage) this.instance).getAssistantVAD();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getAssistantcarid() {
                return ((lisbonEventMessage) this.instance).getAssistantcarid();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getAssistantinto() {
                return ((lisbonEventMessage) this.instance).getAssistantinto();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean getAutoLight() {
                return ((lisbonEventMessage) this.instance).getAutoLight();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getAutoScreenOffTime() {
                return ((lisbonEventMessage) this.instance).getAutoScreenOffTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public Event.DfuUpgradeMessage getBaseRes() {
                return ((lisbonEventMessage) this.instance).getBaseRes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public Event.BatterySaverMode getBatterySaverOff() {
                return ((lisbonEventMessage) this.instance).getBatterySaverOff();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public Event.BatterySaverMode getBatterySaverOn() {
                return ((lisbonEventMessage) this.instance).getBatterySaverOn();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getBindingSuccess() {
                return ((lisbonEventMessage) this.instance).getBindingSuccess();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getBindsetlanguage() {
                return ((lisbonEventMessage) this.instance).getBindsetlanguage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getBleconnect(int index) {
                return ((lisbonEventMessage) this.instance).getBleconnect(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getBleconnectCount() {
                return ((lisbonEventMessage) this.instance).getBleconnectCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getBleconnectList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getBleconnectList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getBleconnectclose() {
                return ((lisbonEventMessage) this.instance).getBleconnectclose();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getBleconnectfail() {
                return ((lisbonEventMessage) this.instance).getBleconnectfail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getBleconnectsuccess() {
                return ((lisbonEventMessage) this.instance).getBleconnectsuccess();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getBlelistclick() {
                return ((lisbonEventMessage) this.instance).getBlelistclick();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getBlestatus(int index) {
                return ((lisbonEventMessage) this.instance).getBlestatus(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getBlestatusCount() {
                return ((lisbonEventMessage) this.instance).getBlestatusCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getBlestatusList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getBlestatusList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getChangeBatteryValue() {
                return ((lisbonEventMessage) this.instance).getChangeBatteryValue();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public Event.wifiuseMessage getClosewifi() {
                return ((lisbonEventMessage) this.instance).getClosewifi();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getCloudMusicPlayBackFolder(int index) {
                return ((lisbonEventMessage) this.instance).getCloudMusicPlayBackFolder(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getCloudMusicPlayBackFolderCount() {
                return ((lisbonEventMessage) this.instance).getCloudMusicPlayBackFolderCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getCloudMusicPlayBackFolderList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getCloudMusicPlayBackFolderList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getCloudMusicPlayMode(int index) {
                return ((lisbonEventMessage) this.instance).getCloudMusicPlayMode(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getCloudMusicPlayModeCount() {
                return ((lisbonEventMessage) this.instance).getCloudMusicPlayModeCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getCloudMusicPlayModeList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getCloudMusicPlayModeList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getCompassCalibrateSuccessNum() {
                return ((lisbonEventMessage) this.instance).getCompassCalibrateSuccessNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getCountDownTimeup() {
                return ((lisbonEventMessage) this.instance).getCountDownTimeup();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getCoutdowntime() {
                return ((lisbonEventMessage) this.instance).getCoutdowntime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getCurrentDialId() {
                return ((lisbonEventMessage) this.instance).getCurrentDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getCurrentDialNum() {
                return ((lisbonEventMessage) this.instance).getCurrentDialNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getDialchangemode() {
                return ((lisbonEventMessage) this.instance).getDialchangemode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public Event.DialtoolMessage getDialtool() {
                return ((lisbonEventMessage) this.instance).getDialtool();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public Event.DndEventMessage getDndMode() {
                return ((lisbonEventMessage) this.instance).getDndMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getEnterCloudMusic() {
                return ((lisbonEventMessage) this.instance).getEnterCloudMusic();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getEnterLocalMusicFirstpage() {
                return ((lisbonEventMessage) this.instance).getEnterLocalMusicFirstpage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getEnterMusicViceScreen() {
                return ((lisbonEventMessage) this.instance).getEnterMusicViceScreen();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getEventTimeUp() {
                return ((lisbonEventMessage) this.instance).getEventTimeUp();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getFatDosfsck() {
                return ((lisbonEventMessage) this.instance).getFatDosfsck();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getFatDropsize() {
                return ((lisbonEventMessage) this.instance).getFatDropsize();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public long getFatDroptime() {
                return ((lisbonEventMessage) this.instance).getFatDroptime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getFatFormat() {
                return ((lisbonEventMessage) this.instance).getFatFormat();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getFatFreesize() {
                return ((lisbonEventMessage) this.instance).getFatFreesize();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getFindPhone() {
                return ((lisbonEventMessage) this.instance).getFindPhone();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getFindmoblie() {
                return ((lisbonEventMessage) this.instance).getFindmoblie();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public Event.DfuUpgradeMessage getFirmware() {
                return ((lisbonEventMessage) this.instance).getFirmware();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getFlymode(int index) {
                return ((lisbonEventMessage) this.instance).getFlymode(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getFlymodeCount() {
                return ((lisbonEventMessage) this.instance).getFlymodeCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getFlymodeList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getFlymodeList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public Event.DfuUpgradeMessage getFont() {
                return ((lisbonEventMessage) this.instance).getFont();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getForgetWristOffLockPasswd() {
                return ((lisbonEventMessage) this.instance).getForgetWristOffLockPasswd();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotoActivityPage() {
                return ((lisbonEventMessage) this.instance).getGotoActivityPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotoAlarmPage() {
                return ((lisbonEventMessage) this.instance).getGotoAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotoCompassPage() {
                return ((lisbonEventMessage) this.instance).getGotoCompassPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotoCountdownPage() {
                return ((lisbonEventMessage) this.instance).getGotoCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotoDialActivityPage() {
                return ((lisbonEventMessage) this.instance).getGotoDialActivityPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotoDialAlarmPage() {
                return ((lisbonEventMessage) this.instance).getGotoDialAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotoDialAlipayPage() {
                return ((lisbonEventMessage) this.instance).getGotoDialAlipayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotoDialEventPage() {
                return ((lisbonEventMessage) this.instance).getGotoDialEventPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotoDialHeartPage() {
                return ((lisbonEventMessage) this.instance).getGotoDialHeartPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotoDialMusicPage() {
                return ((lisbonEventMessage) this.instance).getGotoDialMusicPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotoDialNfcCadePage() {
                return ((lisbonEventMessage) this.instance).getGotoDialNfcCadePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotoDialPaiPage() {
                return ((lisbonEventMessage) this.instance).getGotoDialPaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotoDialSportPage() {
                return ((lisbonEventMessage) this.instance).getGotoDialSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotoDialWeatherPage() {
                return ((lisbonEventMessage) this.instance).getGotoDialWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotoEventPage() {
                return ((lisbonEventMessage) this.instance).getGotoEventPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotoHeartPage() {
                return ((lisbonEventMessage) this.instance).getGotoHeartPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotoMusicPage() {
                return ((lisbonEventMessage) this.instance).getGotoMusicPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotoNfcCardPage() {
                return ((lisbonEventMessage) this.instance).getGotoNfcCardPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotoPaiPage() {
                return ((lisbonEventMessage) this.instance).getGotoPaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotoSpO2Page() {
                return ((lisbonEventMessage) this.instance).getGotoSpO2Page();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotoSportDetailPage(int index) {
                return ((lisbonEventMessage) this.instance).getGotoSportDetailPage(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotoSportDetailPageCount() {
                return ((lisbonEventMessage) this.instance).getGotoSportDetailPageCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getGotoSportDetailPageList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getGotoSportDetailPageList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotoSportHistory() {
                return ((lisbonEventMessage) this.instance).getGotoSportHistory();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotoSportPage() {
                return ((lisbonEventMessage) this.instance).getGotoSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotoStopwatchPage() {
                return ((lisbonEventMessage) this.instance).getGotoStopwatchPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotoWeatherPage() {
                return ((lisbonEventMessage) this.instance).getGotoWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotoWeatherSecondPage() {
                return ((lisbonEventMessage) this.instance).getGotoWeatherSecondPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotosleep() {
                return ((lisbonEventMessage) this.instance).getGotosleep();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getGotowakeup() {
                return ((lisbonEventMessage) this.instance).getGotowakeup();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getHfpCallInAnswer() {
                return ((lisbonEventMessage) this.instance).getHfpCallInAnswer();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getHfpCallInHangUp() {
                return ((lisbonEventMessage) this.instance).getHfpCallInHangUp();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getHfpCallInIgnore() {
                return ((lisbonEventMessage) this.instance).getHfpCallInIgnore();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getHfpCallOnHangUp() {
                return ((lisbonEventMessage) this.instance).getHfpCallOnHangUp();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getHfpCallOnMute() {
                return ((lisbonEventMessage) this.instance).getHfpCallOnMute();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getHfpCallOnSwitchPhone() {
                return ((lisbonEventMessage) this.instance).getHfpCallOnSwitchPhone();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getHfpCallOnVolume() {
                return ((lisbonEventMessage) this.instance).getHfpCallOnVolume();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public Event.DfuUpgradeMessage getIncRes() {
                return ((lisbonEventMessage) this.instance).getIncRes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getLanguageselect() {
                return ((lisbonEventMessage) this.instance).getLanguageselect();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getLcdOff(int index) {
                return ((lisbonEventMessage) this.instance).getLcdOff(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getLcdOffCount() {
                return ((lisbonEventMessage) this.instance).getLcdOffCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getLcdOffList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getLcdOffList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getLcdOnBecauseOfWrist() {
                return ((lisbonEventMessage) this.instance).getLcdOnBecauseOfWrist();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getLcdOnBecauseOfWristStatus() {
                return ((lisbonEventMessage) this.instance).getLcdOnBecauseOfWristStatus();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public Event.lightscreentimeMessage getLightscreentime() {
                return ((lisbonEventMessage) this.instance).getLightscreentime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getLightsetting() {
                return ((lisbonEventMessage) this.instance).getLightsetting();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getLocalMusicAudioSource(int index) {
                return ((lisbonEventMessage) this.instance).getLocalMusicAudioSource(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getLocalMusicAudioSourceCount() {
                return ((lisbonEventMessage) this.instance).getLocalMusicAudioSourceCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getLocalMusicAudioSourceList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getLocalMusicAudioSourceList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getLocalMusicConnectBleDevice() {
                return ((lisbonEventMessage) this.instance).getLocalMusicConnectBleDevice();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getLocalMusicLoopButton(int index) {
                return ((lisbonEventMessage) this.instance).getLocalMusicLoopButton(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getLocalMusicLoopButtonCount() {
                return ((lisbonEventMessage) this.instance).getLocalMusicLoopButtonCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getLocalMusicLoopButtonList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getLocalMusicLoopButtonList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getLocalMusicLoopMode(int index) {
                return ((lisbonEventMessage) this.instance).getLocalMusicLoopMode(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getLocalMusicLoopModeCount() {
                return ((lisbonEventMessage) this.instance).getLocalMusicLoopModeCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getLocalMusicLoopModeList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getLocalMusicLoopModeList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getLocalMusicPlaybackButton(int index) {
                return ((lisbonEventMessage) this.instance).getLocalMusicPlaybackButton(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getLocalMusicPlaybackButtonCount() {
                return ((lisbonEventMessage) this.instance).getLocalMusicPlaybackButtonCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getLocalMusicPlaybackButtonList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getLocalMusicPlaybackButtonList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getLocalMusicSongSource(int index) {
                return ((lisbonEventMessage) this.instance).getLocalMusicSongSource(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getLocalMusicSongSourceCount() {
                return ((lisbonEventMessage) this.instance).getLocalMusicSongSourceCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getLocalMusicSongSourceList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getLocalMusicSongSourceList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getLockScreen() {
                return ((lisbonEventMessage) this.instance).getLockScreen();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getModifypwd(int index) {
                return ((lisbonEventMessage) this.instance).getModifypwd(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getModifypwdCount() {
                return ((lisbonEventMessage) this.instance).getModifypwdCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getModifypwdList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getModifypwdList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getNFCstatus(int index) {
                return ((lisbonEventMessage) this.instance).getNFCstatus(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getNFCstatusCount() {
                return ((lisbonEventMessage) this.instance).getNFCstatusCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getNFCstatusList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getNFCstatusList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public Event.NandMessage getNandMessage() {
                return ((lisbonEventMessage) this.instance).getNandMessage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getNobindrecovery() {
                return ((lisbonEventMessage) this.instance).getNobindrecovery();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getNobindsupervise() {
                return ((lisbonEventMessage) this.instance).getNobindsupervise();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public Event.NotifyMessage getNotify(int index) {
                return ((lisbonEventMessage) this.instance).getNotify(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getNotifyCount() {
                return ((lisbonEventMessage) this.instance).getNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Event.NotifyMessage> getNotifyList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getNotifyList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getOfflineAsrCmd(int index) {
                return ((lisbonEventMessage) this.instance).getOfflineAsrCmd(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getOfflineAsrCmdCount() {
                return ((lisbonEventMessage) this.instance).getOfflineAsrCmdCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getOfflineAsrCmdList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getOfflineAsrCmdList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getOfflineAsrFailOrSuccess(int index) {
                return ((lisbonEventMessage) this.instance).getOfflineAsrFailOrSuccess(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getOfflineAsrFailOrSuccessCount() {
                return ((lisbonEventMessage) this.instance).getOfflineAsrFailOrSuccessCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getOfflineAsrFailOrSuccessList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getOfflineAsrFailOrSuccessList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getOfflineAsrModeInto(int index) {
                return ((lisbonEventMessage) this.instance).getOfflineAsrModeInto(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getOfflineAsrModeIntoCount() {
                return ((lisbonEventMessage) this.instance).getOfflineAsrModeIntoCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getOfflineAsrModeIntoList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getOfflineAsrModeIntoList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getOfflineAsrModeSelect(int index) {
                return ((lisbonEventMessage) this.instance).getOfflineAsrModeSelect(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getOfflineAsrModeSelectCount() {
                return ((lisbonEventMessage) this.instance).getOfflineAsrModeSelectCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getOfflineAsrModeSelectList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getOfflineAsrModeSelectList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getOffwristlock(int index) {
                return ((lisbonEventMessage) this.instance).getOffwristlock(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getOffwristlockCount() {
                return ((lisbonEventMessage) this.instance).getOffwristlockCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getOffwristlockList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getOffwristlockList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getOnlineVADActionType(int index) {
                return ((lisbonEventMessage) this.instance).getOnlineVADActionType(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getOnlineVADActionTypeCount() {
                return ((lisbonEventMessage) this.instance).getOnlineVADActionTypeCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getOnlineVADActionTypeList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getOnlineVADActionTypeList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getOnlineVADRequest(int index) {
                return ((lisbonEventMessage) this.instance).getOnlineVADRequest(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getOnlineVADRequestCount() {
                return ((lisbonEventMessage) this.instance).getOnlineVADRequestCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getOnlineVADRequestList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getOnlineVADRequestList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getOnlineVADStartType(int index) {
                return ((lisbonEventMessage) this.instance).getOnlineVADStartType(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getOnlineVADStartTypeCount() {
                return ((lisbonEventMessage) this.instance).getOnlineVADStartTypeCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getOnlineVADStartTypeList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getOnlineVADStartTypeList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getPowerOff() {
                return ((lisbonEventMessage) this.instance).getPowerOff();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getPowerOffBatteryValue() {
                return ((lisbonEventMessage) this.instance).getPowerOffBatteryValue();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getPowerOnBatteryValue() {
                return ((lisbonEventMessage) this.instance).getPowerOnBatteryValue();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getPressureautomeasure(int index) {
                return ((lisbonEventMessage) this.instance).getPressureautomeasure(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getPressureautomeasureCount() {
                return ((lisbonEventMessage) this.instance).getPressureautomeasureCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getPressureautomeasureList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getPressureautomeasureList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getPressureinto() {
                return ((lisbonEventMessage) this.instance).getPressureinto();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getPressuremeasureresult(int index) {
                return ((lisbonEventMessage) this.instance).getPressuremeasureresult(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getPressuremeasureresultCount() {
                return ((lisbonEventMessage) this.instance).getPressuremeasureresultCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getPressuremeasureresultList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getPressuremeasureresultList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getQNEgps() {
                return ((lisbonEventMessage) this.instance).getQNEgps();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getQNEinto() {
                return ((lisbonEventMessage) this.instance).getQNEinto();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getQuickAccessApp() {
                return ((lisbonEventMessage) this.instance).getQuickAccessApp();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean getQuickEntryApp(int index) {
                return ((lisbonEventMessage) this.instance).getQuickEntryApp(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getQuickEntryAppCount() {
                return ((lisbonEventMessage) this.instance).getQuickEntryAppCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Boolean> getQuickEntryAppList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getQuickEntryAppList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getRateabnormalreminder() {
                return ((lisbonEventMessage) this.instance).getRateabnormalreminder();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getRatemeasure(int index) {
                return ((lisbonEventMessage) this.instance).getRatemeasure(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getRatemeasureCount() {
                return ((lisbonEventMessage) this.instance).getRatemeasureCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getRatemeasureList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getRatemeasureList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getRatewarnreminder() {
                return ((lisbonEventMessage) this.instance).getRatewarnreminder();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getRebootNum() {
                return ((lisbonEventMessage) this.instance).getRebootNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getRecoverymode() {
                return ((lisbonEventMessage) this.instance).getRecoverymode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getRemindershock() {
                return ((lisbonEventMessage) this.instance).getRemindershock();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getReminderstand() {
                return ((lisbonEventMessage) this.instance).getReminderstand();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getReminderstandcomplete() {
                return ((lisbonEventMessage) this.instance).getReminderstandcomplete();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getRingreminder(int index) {
                return ((lisbonEventMessage) this.instance).getRingreminder(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getRingreminderCount() {
                return ((lisbonEventMessage) this.instance).getRingreminderCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getRingreminderList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getRingreminderList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getScheduledelete(int index) {
                return ((lisbonEventMessage) this.instance).getScheduledelete(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getScheduledeleteCount() {
                return ((lisbonEventMessage) this.instance).getScheduledeleteCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getScheduledeleteList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getScheduledeleteList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getScheduleedit() {
                return ((lisbonEventMessage) this.instance).getScheduleedit();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getSchedulereminderclick(int index) {
                return ((lisbonEventMessage) this.instance).getSchedulereminderclick(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getSchedulereminderclickCount() {
                return ((lisbonEventMessage) this.instance).getSchedulereminderclickCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getSchedulereminderclickList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getSchedulereminderclickList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getSeePAIexplain() {
                return ((lisbonEventMessage) this.instance).getSeePAIexplain();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getSeePAIrate() {
                return ((lisbonEventMessage) this.instance).getSeePAIrate();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getSetAlarm() {
                return ((lisbonEventMessage) this.instance).getSetAlarm();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getSleepgoal() {
                return ((lisbonEventMessage) this.instance).getSleepgoal();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getSleepreminder() {
                return ((lisbonEventMessage) this.instance).getSleepreminder();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getSleepscreen() {
                return ((lisbonEventMessage) this.instance).getSleepscreen();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getSleepstop() {
                return ((lisbonEventMessage) this.instance).getSleepstop();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getSpo2Calc(int index) {
                return ((lisbonEventMessage) this.instance).getSpo2Calc(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getSpo2CalcCount() {
                return ((lisbonEventMessage) this.instance).getSpo2CalcCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getSpo2CalcList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getSpo2CalcList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getSportIndoorCalibrate(int index) {
                return ((lisbonEventMessage) this.instance).getSportIndoorCalibrate(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getSportIndoorCalibrateCount() {
                return ((lisbonEventMessage) this.instance).getSportIndoorCalibrateCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getSportIndoorCalibrateList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getSportIndoorCalibrateList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public Event.SportStatusMessage getSportStatus(int index) {
                return ((lisbonEventMessage) this.instance).getSportStatus(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getSportStatusCount() {
                return ((lisbonEventMessage) this.instance).getSportStatusCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Event.SportStatusMessage> getSportStatusList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getSportStatusList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getSportremindersave() {
                return ((lisbonEventMessage) this.instance).getSportremindersave();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public Event.wifiuseMessage getStartwifi() {
                return ((lisbonEventMessage) this.instance).getStartwifi();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getStopwatchreset() {
                return ((lisbonEventMessage) this.instance).getStopwatchreset();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getStopwatchstart() {
                return ((lisbonEventMessage) this.instance).getStopwatchstart();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getSwimPoolLength() {
                return ((lisbonEventMessage) this.instance).getSwimPoolLength();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean getSysVibration() {
                return ((lisbonEventMessage) this.instance).getSysVibration();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getSystemUpdateCancle() {
                return ((lisbonEventMessage) this.instance).getSystemUpdateCancle();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getSystemUpdateImmediately() {
                return ((lisbonEventMessage) this.instance).getSystemUpdateImmediately();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getTurnOnTheaterMode() {
                return ((lisbonEventMessage) this.instance).getTurnOnTheaterMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getTurnOnkeepWatchAwake() {
                return ((lisbonEventMessage) this.instance).getTurnOnkeepWatchAwake();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getUnlock(int index) {
                return ((lisbonEventMessage) this.instance).getUnlock(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getUnlockCount() {
                return ((lisbonEventMessage) this.instance).getUnlockCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getUnlockList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getUnlockList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getUpdataerrscreen(int index) {
                return ((lisbonEventMessage) this.instance).getUpdataerrscreen(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getUpdataerrscreenCount() {
                return ((lisbonEventMessage) this.instance).getUpdataerrscreenCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getUpdataerrscreenList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getUpdataerrscreenList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getUpdataimmediatelyscreen(int index) {
                return ((lisbonEventMessage) this.instance).getUpdataimmediatelyscreen(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getUpdataimmediatelyscreenCount() {
                return ((lisbonEventMessage) this.instance).getUpdataimmediatelyscreenCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getUpdataimmediatelyscreenList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getUpdataimmediatelyscreenList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getUpdateFail(int index) {
                return ((lisbonEventMessage) this.instance).getUpdateFail(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getUpdateFailCount() {
                return ((lisbonEventMessage) this.instance).getUpdateFailCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getUpdateFailList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getUpdateFailList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getUpdatebyuser() {
                return ((lisbonEventMessage) this.instance).getUpdatebyuser();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getUseStopwatch() {
                return ((lisbonEventMessage) this.instance).getUseStopwatch();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getUsecarcount(int index) {
                return ((lisbonEventMessage) this.instance).getUsecarcount(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getUsecarcountCount() {
                return ((lisbonEventMessage) this.instance).getUsecarcountCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public List<Integer> getUsecarcountList() {
                return Collections.unmodifiableList(((lisbonEventMessage) this.instance).getUsecarcountList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getVolbycontrol() {
                return ((lisbonEventMessage) this.instance).getVolbycontrol();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getVolbysetting() {
                return ((lisbonEventMessage) this.instance).getVolbysetting();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getVolsetcount() {
                return ((lisbonEventMessage) this.instance).getVolsetcount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean getWatchdir() {
                return ((lisbonEventMessage) this.instance).getWatchdir();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getWifiTipspage() {
                return ((lisbonEventMessage) this.instance).getWifiTipspage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public int getWifipwdcorrect() {
                return ((lisbonEventMessage) this.instance).getWifipwdcorrect();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean getWristOffLockStatus() {
                return ((lisbonEventMessage) this.instance).getWristOffLockStatus();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasActivityTarget() {
                return ((lisbonEventMessage) this.instance).hasActivityTarget();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasActivityobjectives() {
                return ((lisbonEventMessage) this.instance).hasActivityobjectives();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasAddCardSuccess() {
                return ((lisbonEventMessage) this.instance).hasAddCardSuccess();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasAlarmreminder() {
                return ((lisbonEventMessage) this.instance).hasAlarmreminder();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasAlipayBindSuccessNum() {
                return ((lisbonEventMessage) this.instance).hasAlipayBindSuccessNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasAplayscreen() {
                return ((lisbonEventMessage) this.instance).hasAplayscreen();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasAssistantVAD() {
                return ((lisbonEventMessage) this.instance).hasAssistantVAD();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasAssistantcarid() {
                return ((lisbonEventMessage) this.instance).hasAssistantcarid();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasAssistantinto() {
                return ((lisbonEventMessage) this.instance).hasAssistantinto();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasAutoLight() {
                return ((lisbonEventMessage) this.instance).hasAutoLight();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasAutoScreenOffTime() {
                return ((lisbonEventMessage) this.instance).hasAutoScreenOffTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasBaseRes() {
                return ((lisbonEventMessage) this.instance).hasBaseRes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasBatterySaverOff() {
                return ((lisbonEventMessage) this.instance).hasBatterySaverOff();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasBatterySaverOn() {
                return ((lisbonEventMessage) this.instance).hasBatterySaverOn();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasBindingSuccess() {
                return ((lisbonEventMessage) this.instance).hasBindingSuccess();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasBindsetlanguage() {
                return ((lisbonEventMessage) this.instance).hasBindsetlanguage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasBleconnectclose() {
                return ((lisbonEventMessage) this.instance).hasBleconnectclose();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasBleconnectfail() {
                return ((lisbonEventMessage) this.instance).hasBleconnectfail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasBleconnectsuccess() {
                return ((lisbonEventMessage) this.instance).hasBleconnectsuccess();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasBlelistclick() {
                return ((lisbonEventMessage) this.instance).hasBlelistclick();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasChangeBatteryValue() {
                return ((lisbonEventMessage) this.instance).hasChangeBatteryValue();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasClosewifi() {
                return ((lisbonEventMessage) this.instance).hasClosewifi();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasCompassCalibrateSuccessNum() {
                return ((lisbonEventMessage) this.instance).hasCompassCalibrateSuccessNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasCountDownTimeup() {
                return ((lisbonEventMessage) this.instance).hasCountDownTimeup();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasCoutdowntime() {
                return ((lisbonEventMessage) this.instance).hasCoutdowntime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasCurrentDialId() {
                return ((lisbonEventMessage) this.instance).hasCurrentDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasCurrentDialNum() {
                return ((lisbonEventMessage) this.instance).hasCurrentDialNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasDialchangemode() {
                return ((lisbonEventMessage) this.instance).hasDialchangemode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasDialtool() {
                return ((lisbonEventMessage) this.instance).hasDialtool();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasDndMode() {
                return ((lisbonEventMessage) this.instance).hasDndMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasEnterCloudMusic() {
                return ((lisbonEventMessage) this.instance).hasEnterCloudMusic();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasEnterLocalMusicFirstpage() {
                return ((lisbonEventMessage) this.instance).hasEnterLocalMusicFirstpage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasEnterMusicViceScreen() {
                return ((lisbonEventMessage) this.instance).hasEnterMusicViceScreen();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasEventTimeUp() {
                return ((lisbonEventMessage) this.instance).hasEventTimeUp();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasFatDosfsck() {
                return ((lisbonEventMessage) this.instance).hasFatDosfsck();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasFatDropsize() {
                return ((lisbonEventMessage) this.instance).hasFatDropsize();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasFatDroptime() {
                return ((lisbonEventMessage) this.instance).hasFatDroptime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasFatFormat() {
                return ((lisbonEventMessage) this.instance).hasFatFormat();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasFatFreesize() {
                return ((lisbonEventMessage) this.instance).hasFatFreesize();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasFindPhone() {
                return ((lisbonEventMessage) this.instance).hasFindPhone();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasFindmoblie() {
                return ((lisbonEventMessage) this.instance).hasFindmoblie();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasFirmware() {
                return ((lisbonEventMessage) this.instance).hasFirmware();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasFont() {
                return ((lisbonEventMessage) this.instance).hasFont();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasForgetWristOffLockPasswd() {
                return ((lisbonEventMessage) this.instance).hasForgetWristOffLockPasswd();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasGotoActivityPage() {
                return ((lisbonEventMessage) this.instance).hasGotoActivityPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasGotoAlarmPage() {
                return ((lisbonEventMessage) this.instance).hasGotoAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasGotoCompassPage() {
                return ((lisbonEventMessage) this.instance).hasGotoCompassPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasGotoCountdownPage() {
                return ((lisbonEventMessage) this.instance).hasGotoCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasGotoDialActivityPage() {
                return ((lisbonEventMessage) this.instance).hasGotoDialActivityPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasGotoDialAlarmPage() {
                return ((lisbonEventMessage) this.instance).hasGotoDialAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasGotoDialAlipayPage() {
                return ((lisbonEventMessage) this.instance).hasGotoDialAlipayPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasGotoDialEventPage() {
                return ((lisbonEventMessage) this.instance).hasGotoDialEventPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasGotoDialHeartPage() {
                return ((lisbonEventMessage) this.instance).hasGotoDialHeartPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasGotoDialMusicPage() {
                return ((lisbonEventMessage) this.instance).hasGotoDialMusicPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasGotoDialNfcCadePage() {
                return ((lisbonEventMessage) this.instance).hasGotoDialNfcCadePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasGotoDialPaiPage() {
                return ((lisbonEventMessage) this.instance).hasGotoDialPaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasGotoDialSportPage() {
                return ((lisbonEventMessage) this.instance).hasGotoDialSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasGotoDialWeatherPage() {
                return ((lisbonEventMessage) this.instance).hasGotoDialWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasGotoEventPage() {
                return ((lisbonEventMessage) this.instance).hasGotoEventPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasGotoHeartPage() {
                return ((lisbonEventMessage) this.instance).hasGotoHeartPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasGotoMusicPage() {
                return ((lisbonEventMessage) this.instance).hasGotoMusicPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasGotoNfcCardPage() {
                return ((lisbonEventMessage) this.instance).hasGotoNfcCardPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasGotoPaiPage() {
                return ((lisbonEventMessage) this.instance).hasGotoPaiPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasGotoSpO2Page() {
                return ((lisbonEventMessage) this.instance).hasGotoSpO2Page();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasGotoSportHistory() {
                return ((lisbonEventMessage) this.instance).hasGotoSportHistory();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasGotoSportPage() {
                return ((lisbonEventMessage) this.instance).hasGotoSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasGotoStopwatchPage() {
                return ((lisbonEventMessage) this.instance).hasGotoStopwatchPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasGotoWeatherPage() {
                return ((lisbonEventMessage) this.instance).hasGotoWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasGotoWeatherSecondPage() {
                return ((lisbonEventMessage) this.instance).hasGotoWeatherSecondPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasGotosleep() {
                return ((lisbonEventMessage) this.instance).hasGotosleep();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasGotowakeup() {
                return ((lisbonEventMessage) this.instance).hasGotowakeup();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasHfpCallInAnswer() {
                return ((lisbonEventMessage) this.instance).hasHfpCallInAnswer();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasHfpCallInHangUp() {
                return ((lisbonEventMessage) this.instance).hasHfpCallInHangUp();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasHfpCallInIgnore() {
                return ((lisbonEventMessage) this.instance).hasHfpCallInIgnore();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasHfpCallOnHangUp() {
                return ((lisbonEventMessage) this.instance).hasHfpCallOnHangUp();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasHfpCallOnMute() {
                return ((lisbonEventMessage) this.instance).hasHfpCallOnMute();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasHfpCallOnSwitchPhone() {
                return ((lisbonEventMessage) this.instance).hasHfpCallOnSwitchPhone();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasHfpCallOnVolume() {
                return ((lisbonEventMessage) this.instance).hasHfpCallOnVolume();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasIncRes() {
                return ((lisbonEventMessage) this.instance).hasIncRes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasLanguageselect() {
                return ((lisbonEventMessage) this.instance).hasLanguageselect();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfWrist() {
                return ((lisbonEventMessage) this.instance).hasLcdOnBecauseOfWrist();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfWristStatus() {
                return ((lisbonEventMessage) this.instance).hasLcdOnBecauseOfWristStatus();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasLightscreentime() {
                return ((lisbonEventMessage) this.instance).hasLightscreentime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasLightsetting() {
                return ((lisbonEventMessage) this.instance).hasLightsetting();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasLocalMusicConnectBleDevice() {
                return ((lisbonEventMessage) this.instance).hasLocalMusicConnectBleDevice();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasLockScreen() {
                return ((lisbonEventMessage) this.instance).hasLockScreen();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasNandMessage() {
                return ((lisbonEventMessage) this.instance).hasNandMessage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasNobindrecovery() {
                return ((lisbonEventMessage) this.instance).hasNobindrecovery();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasNobindsupervise() {
                return ((lisbonEventMessage) this.instance).hasNobindsupervise();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasPowerOff() {
                return ((lisbonEventMessage) this.instance).hasPowerOff();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasPowerOffBatteryValue() {
                return ((lisbonEventMessage) this.instance).hasPowerOffBatteryValue();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasPowerOnBatteryValue() {
                return ((lisbonEventMessage) this.instance).hasPowerOnBatteryValue();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasPressureinto() {
                return ((lisbonEventMessage) this.instance).hasPressureinto();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasQNEgps() {
                return ((lisbonEventMessage) this.instance).hasQNEgps();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasQNEinto() {
                return ((lisbonEventMessage) this.instance).hasQNEinto();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasQuickAccessApp() {
                return ((lisbonEventMessage) this.instance).hasQuickAccessApp();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasRateabnormalreminder() {
                return ((lisbonEventMessage) this.instance).hasRateabnormalreminder();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasRatewarnreminder() {
                return ((lisbonEventMessage) this.instance).hasRatewarnreminder();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasRebootNum() {
                return ((lisbonEventMessage) this.instance).hasRebootNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasRecoverymode() {
                return ((lisbonEventMessage) this.instance).hasRecoverymode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasRemindershock() {
                return ((lisbonEventMessage) this.instance).hasRemindershock();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasReminderstand() {
                return ((lisbonEventMessage) this.instance).hasReminderstand();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasReminderstandcomplete() {
                return ((lisbonEventMessage) this.instance).hasReminderstandcomplete();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasScheduleedit() {
                return ((lisbonEventMessage) this.instance).hasScheduleedit();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasSeePAIexplain() {
                return ((lisbonEventMessage) this.instance).hasSeePAIexplain();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasSeePAIrate() {
                return ((lisbonEventMessage) this.instance).hasSeePAIrate();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasSetAlarm() {
                return ((lisbonEventMessage) this.instance).hasSetAlarm();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasSleepgoal() {
                return ((lisbonEventMessage) this.instance).hasSleepgoal();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasSleepreminder() {
                return ((lisbonEventMessage) this.instance).hasSleepreminder();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasSleepscreen() {
                return ((lisbonEventMessage) this.instance).hasSleepscreen();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasSleepstop() {
                return ((lisbonEventMessage) this.instance).hasSleepstop();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasSportremindersave() {
                return ((lisbonEventMessage) this.instance).hasSportremindersave();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasStartwifi() {
                return ((lisbonEventMessage) this.instance).hasStartwifi();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasStopwatchreset() {
                return ((lisbonEventMessage) this.instance).hasStopwatchreset();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasStopwatchstart() {
                return ((lisbonEventMessage) this.instance).hasStopwatchstart();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasSwimPoolLength() {
                return ((lisbonEventMessage) this.instance).hasSwimPoolLength();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasSysVibration() {
                return ((lisbonEventMessage) this.instance).hasSysVibration();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasSystemUpdateCancle() {
                return ((lisbonEventMessage) this.instance).hasSystemUpdateCancle();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasSystemUpdateImmediately() {
                return ((lisbonEventMessage) this.instance).hasSystemUpdateImmediately();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasTurnOnTheaterMode() {
                return ((lisbonEventMessage) this.instance).hasTurnOnTheaterMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasTurnOnkeepWatchAwake() {
                return ((lisbonEventMessage) this.instance).hasTurnOnkeepWatchAwake();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasUpdatebyuser() {
                return ((lisbonEventMessage) this.instance).hasUpdatebyuser();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasUseStopwatch() {
                return ((lisbonEventMessage) this.instance).hasUseStopwatch();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasVolbycontrol() {
                return ((lisbonEventMessage) this.instance).hasVolbycontrol();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasVolbysetting() {
                return ((lisbonEventMessage) this.instance).hasVolbysetting();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasVolsetcount() {
                return ((lisbonEventMessage) this.instance).hasVolsetcount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasWatchdir() {
                return ((lisbonEventMessage) this.instance).hasWatchdir();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasWifiTipspage() {
                return ((lisbonEventMessage) this.instance).hasWifiTipspage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasWifipwdcorrect() {
                return ((lisbonEventMessage) this.instance).hasWifipwdcorrect();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
            public boolean hasWristOffLockStatus() {
                return ((lisbonEventMessage) this.instance).hasWristOffLockStatus();
            }

            public Builder mergeBaseRes(Event.DfuUpgradeMessage value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).mergeBaseRes(value);
                return this;
            }

            public Builder mergeBatterySaverOff(Event.BatterySaverMode value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).mergeBatterySaverOff(value);
                return this;
            }

            public Builder mergeBatterySaverOn(Event.BatterySaverMode value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).mergeBatterySaverOn(value);
                return this;
            }

            public Builder mergeClosewifi(Event.wifiuseMessage value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).mergeClosewifi(value);
                return this;
            }

            public Builder mergeDialtool(Event.DialtoolMessage value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).mergeDialtool(value);
                return this;
            }

            public Builder mergeDndMode(Event.DndEventMessage value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).mergeDndMode(value);
                return this;
            }

            public Builder mergeFirmware(Event.DfuUpgradeMessage value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).mergeFirmware(value);
                return this;
            }

            public Builder mergeFont(Event.DfuUpgradeMessage value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).mergeFont(value);
                return this;
            }

            public Builder mergeIncRes(Event.DfuUpgradeMessage value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).mergeIncRes(value);
                return this;
            }

            public Builder mergeLightscreentime(Event.lightscreentimeMessage value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).mergeLightscreentime(value);
                return this;
            }

            public Builder mergeNandMessage(Event.NandMessage value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).mergeNandMessage(value);
                return this;
            }

            public Builder mergeStartwifi(Event.wifiuseMessage value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).mergeStartwifi(value);
                return this;
            }

            public Builder removeNotify(int index) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).removeNotify(index);
                return this;
            }

            public Builder removeSportStatus(int index) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).removeSportStatus(index);
                return this;
            }

            public Builder setActivityTarget(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setActivityTarget(value);
                return this;
            }

            public Builder setActivityobjectives(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setActivityobjectives(value);
                return this;
            }

            public Builder setAddCardSuccess(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setAddCardSuccess(value);
                return this;
            }

            public Builder setAlarmreminder(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setAlarmreminder(value);
                return this;
            }

            public Builder setAlarmreminderclick(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setAlarmreminderclick(index, value);
                return this;
            }

            public Builder setAlipayBindSuccessNum(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setAlipayBindSuccessNum(value);
                return this;
            }

            public Builder setAplayscreen(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setAplayscreen(value);
                return this;
            }

            public Builder setAssistantVAD(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setAssistantVAD(value);
                return this;
            }

            public Builder setAssistantcarid(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setAssistantcarid(value);
                return this;
            }

            public Builder setAssistantinto(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setAssistantinto(value);
                return this;
            }

            public Builder setAutoLight(boolean value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setAutoLight(value);
                return this;
            }

            public Builder setAutoScreenOffTime(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setAutoScreenOffTime(value);
                return this;
            }

            public Builder setBaseRes(Event.DfuUpgradeMessage value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setBaseRes(value);
                return this;
            }

            public Builder setBatterySaverOff(Event.BatterySaverMode value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setBatterySaverOff(value);
                return this;
            }

            public Builder setBatterySaverOn(Event.BatterySaverMode value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setBatterySaverOn(value);
                return this;
            }

            public Builder setBindingSuccess(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setBindingSuccess(value);
                return this;
            }

            public Builder setBindsetlanguage(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setBindsetlanguage(value);
                return this;
            }

            public Builder setBleconnect(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setBleconnect(index, value);
                return this;
            }

            public Builder setBleconnectclose(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setBleconnectclose(value);
                return this;
            }

            public Builder setBleconnectfail(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setBleconnectfail(value);
                return this;
            }

            public Builder setBleconnectsuccess(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setBleconnectsuccess(value);
                return this;
            }

            public Builder setBlelistclick(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setBlelistclick(value);
                return this;
            }

            public Builder setBlestatus(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setBlestatus(index, value);
                return this;
            }

            public Builder setChangeBatteryValue(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setChangeBatteryValue(value);
                return this;
            }

            public Builder setClosewifi(Event.wifiuseMessage value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setClosewifi(value);
                return this;
            }

            public Builder setCloudMusicPlayBackFolder(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setCloudMusicPlayBackFolder(index, value);
                return this;
            }

            public Builder setCloudMusicPlayMode(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setCloudMusicPlayMode(index, value);
                return this;
            }

            public Builder setCompassCalibrateSuccessNum(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setCompassCalibrateSuccessNum(value);
                return this;
            }

            public Builder setCountDownTimeup(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setCountDownTimeup(value);
                return this;
            }

            public Builder setCoutdowntime(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setCoutdowntime(value);
                return this;
            }

            public Builder setCurrentDialId(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setCurrentDialId(value);
                return this;
            }

            public Builder setCurrentDialNum(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setCurrentDialNum(value);
                return this;
            }

            public Builder setDialchangemode(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setDialchangemode(value);
                return this;
            }

            public Builder setDialtool(Event.DialtoolMessage value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setDialtool(value);
                return this;
            }

            public Builder setDndMode(Event.DndEventMessage value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setDndMode(value);
                return this;
            }

            public Builder setEnterCloudMusic(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setEnterCloudMusic(value);
                return this;
            }

            public Builder setEnterLocalMusicFirstpage(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setEnterLocalMusicFirstpage(value);
                return this;
            }

            public Builder setEnterMusicViceScreen(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setEnterMusicViceScreen(value);
                return this;
            }

            public Builder setEventTimeUp(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setEventTimeUp(value);
                return this;
            }

            public Builder setFatDosfsck(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setFatDosfsck(value);
                return this;
            }

            public Builder setFatDropsize(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setFatDropsize(value);
                return this;
            }

            public Builder setFatDroptime(long value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setFatDroptime(value);
                return this;
            }

            public Builder setFatFormat(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setFatFormat(value);
                return this;
            }

            public Builder setFatFreesize(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setFatFreesize(value);
                return this;
            }

            public Builder setFindPhone(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setFindPhone(value);
                return this;
            }

            public Builder setFindmoblie(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setFindmoblie(value);
                return this;
            }

            public Builder setFirmware(Event.DfuUpgradeMessage value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setFirmware(value);
                return this;
            }

            public Builder setFlymode(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setFlymode(index, value);
                return this;
            }

            public Builder setFont(Event.DfuUpgradeMessage value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setFont(value);
                return this;
            }

            public Builder setForgetWristOffLockPasswd(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setForgetWristOffLockPasswd(value);
                return this;
            }

            public Builder setGotoActivityPage(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setGotoActivityPage(value);
                return this;
            }

            public Builder setGotoAlarmPage(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setGotoAlarmPage(value);
                return this;
            }

            public Builder setGotoCompassPage(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setGotoCompassPage(value);
                return this;
            }

            public Builder setGotoCountdownPage(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setGotoCountdownPage(value);
                return this;
            }

            public Builder setGotoDialActivityPage(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setGotoDialActivityPage(value);
                return this;
            }

            public Builder setGotoDialAlarmPage(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setGotoDialAlarmPage(value);
                return this;
            }

            public Builder setGotoDialAlipayPage(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setGotoDialAlipayPage(value);
                return this;
            }

            public Builder setGotoDialEventPage(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setGotoDialEventPage(value);
                return this;
            }

            public Builder setGotoDialHeartPage(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setGotoDialHeartPage(value);
                return this;
            }

            public Builder setGotoDialMusicPage(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setGotoDialMusicPage(value);
                return this;
            }

            public Builder setGotoDialNfcCadePage(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setGotoDialNfcCadePage(value);
                return this;
            }

            public Builder setGotoDialPaiPage(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setGotoDialPaiPage(value);
                return this;
            }

            public Builder setGotoDialSportPage(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setGotoDialSportPage(value);
                return this;
            }

            public Builder setGotoDialWeatherPage(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setGotoDialWeatherPage(value);
                return this;
            }

            public Builder setGotoEventPage(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setGotoEventPage(value);
                return this;
            }

            public Builder setGotoHeartPage(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setGotoHeartPage(value);
                return this;
            }

            public Builder setGotoMusicPage(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setGotoMusicPage(value);
                return this;
            }

            public Builder setGotoNfcCardPage(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setGotoNfcCardPage(value);
                return this;
            }

            public Builder setGotoPaiPage(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setGotoPaiPage(value);
                return this;
            }

            public Builder setGotoSpO2Page(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setGotoSpO2Page(value);
                return this;
            }

            public Builder setGotoSportDetailPage(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setGotoSportDetailPage(index, value);
                return this;
            }

            public Builder setGotoSportHistory(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setGotoSportHistory(value);
                return this;
            }

            public Builder setGotoSportPage(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setGotoSportPage(value);
                return this;
            }

            public Builder setGotoStopwatchPage(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setGotoStopwatchPage(value);
                return this;
            }

            public Builder setGotoWeatherPage(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setGotoWeatherPage(value);
                return this;
            }

            public Builder setGotoWeatherSecondPage(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setGotoWeatherSecondPage(value);
                return this;
            }

            public Builder setGotosleep(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setGotosleep(value);
                return this;
            }

            public Builder setGotowakeup(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setGotowakeup(value);
                return this;
            }

            public Builder setHfpCallInAnswer(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setHfpCallInAnswer(value);
                return this;
            }

            public Builder setHfpCallInHangUp(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setHfpCallInHangUp(value);
                return this;
            }

            public Builder setHfpCallInIgnore(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setHfpCallInIgnore(value);
                return this;
            }

            public Builder setHfpCallOnHangUp(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setHfpCallOnHangUp(value);
                return this;
            }

            public Builder setHfpCallOnMute(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setHfpCallOnMute(value);
                return this;
            }

            public Builder setHfpCallOnSwitchPhone(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setHfpCallOnSwitchPhone(value);
                return this;
            }

            public Builder setHfpCallOnVolume(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setHfpCallOnVolume(value);
                return this;
            }

            public Builder setIncRes(Event.DfuUpgradeMessage value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setIncRes(value);
                return this;
            }

            public Builder setLanguageselect(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setLanguageselect(value);
                return this;
            }

            public Builder setLcdOff(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setLcdOff(index, value);
                return this;
            }

            public Builder setLcdOnBecauseOfWrist(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setLcdOnBecauseOfWrist(value);
                return this;
            }

            public Builder setLcdOnBecauseOfWristStatus(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setLcdOnBecauseOfWristStatus(value);
                return this;
            }

            public Builder setLightscreentime(Event.lightscreentimeMessage value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setLightscreentime(value);
                return this;
            }

            public Builder setLightsetting(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setLightsetting(value);
                return this;
            }

            public Builder setLocalMusicAudioSource(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setLocalMusicAudioSource(index, value);
                return this;
            }

            public Builder setLocalMusicConnectBleDevice(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setLocalMusicConnectBleDevice(value);
                return this;
            }

            public Builder setLocalMusicLoopButton(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setLocalMusicLoopButton(index, value);
                return this;
            }

            public Builder setLocalMusicLoopMode(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setLocalMusicLoopMode(index, value);
                return this;
            }

            public Builder setLocalMusicPlaybackButton(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setLocalMusicPlaybackButton(index, value);
                return this;
            }

            public Builder setLocalMusicSongSource(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setLocalMusicSongSource(index, value);
                return this;
            }

            public Builder setLockScreen(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setLockScreen(value);
                return this;
            }

            public Builder setModifypwd(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setModifypwd(index, value);
                return this;
            }

            public Builder setNFCstatus(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setNFCstatus(index, value);
                return this;
            }

            public Builder setNandMessage(Event.NandMessage value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setNandMessage(value);
                return this;
            }

            public Builder setNobindrecovery(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setNobindrecovery(value);
                return this;
            }

            public Builder setNobindsupervise(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setNobindsupervise(value);
                return this;
            }

            public Builder setNotify(int index, Event.NotifyMessage value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setNotify(index, value);
                return this;
            }

            public Builder setOfflineAsrCmd(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setOfflineAsrCmd(index, value);
                return this;
            }

            public Builder setOfflineAsrFailOrSuccess(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setOfflineAsrFailOrSuccess(index, value);
                return this;
            }

            public Builder setOfflineAsrModeInto(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setOfflineAsrModeInto(index, value);
                return this;
            }

            public Builder setOfflineAsrModeSelect(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setOfflineAsrModeSelect(index, value);
                return this;
            }

            public Builder setOffwristlock(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setOffwristlock(index, value);
                return this;
            }

            public Builder setOnlineVADActionType(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setOnlineVADActionType(index, value);
                return this;
            }

            public Builder setOnlineVADRequest(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setOnlineVADRequest(index, value);
                return this;
            }

            public Builder setOnlineVADStartType(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setOnlineVADStartType(index, value);
                return this;
            }

            public Builder setPowerOff(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setPowerOff(value);
                return this;
            }

            public Builder setPowerOffBatteryValue(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setPowerOffBatteryValue(value);
                return this;
            }

            public Builder setPowerOnBatteryValue(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setPowerOnBatteryValue(value);
                return this;
            }

            public Builder setPressureautomeasure(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setPressureautomeasure(index, value);
                return this;
            }

            public Builder setPressureinto(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setPressureinto(value);
                return this;
            }

            public Builder setPressuremeasureresult(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setPressuremeasureresult(index, value);
                return this;
            }

            public Builder setQNEgps(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setQNEgps(value);
                return this;
            }

            public Builder setQNEinto(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setQNEinto(value);
                return this;
            }

            public Builder setQuickAccessApp(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setQuickAccessApp(value);
                return this;
            }

            public Builder setQuickEntryApp(int index, boolean value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setQuickEntryApp(index, value);
                return this;
            }

            public Builder setRateabnormalreminder(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setRateabnormalreminder(value);
                return this;
            }

            public Builder setRatemeasure(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setRatemeasure(index, value);
                return this;
            }

            public Builder setRatewarnreminder(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setRatewarnreminder(value);
                return this;
            }

            public Builder setRebootNum(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setRebootNum(value);
                return this;
            }

            public Builder setRecoverymode(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setRecoverymode(value);
                return this;
            }

            public Builder setRemindershock(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setRemindershock(value);
                return this;
            }

            public Builder setReminderstand(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setReminderstand(value);
                return this;
            }

            public Builder setReminderstandcomplete(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setReminderstandcomplete(value);
                return this;
            }

            public Builder setRingreminder(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setRingreminder(index, value);
                return this;
            }

            public Builder setScheduledelete(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setScheduledelete(index, value);
                return this;
            }

            public Builder setScheduleedit(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setScheduleedit(value);
                return this;
            }

            public Builder setSchedulereminderclick(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setSchedulereminderclick(index, value);
                return this;
            }

            public Builder setSeePAIexplain(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setSeePAIexplain(value);
                return this;
            }

            public Builder setSeePAIrate(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setSeePAIrate(value);
                return this;
            }

            public Builder setSetAlarm(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setSetAlarm(value);
                return this;
            }

            public Builder setSleepgoal(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setSleepgoal(value);
                return this;
            }

            public Builder setSleepreminder(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setSleepreminder(value);
                return this;
            }

            public Builder setSleepscreen(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setSleepscreen(value);
                return this;
            }

            public Builder setSleepstop(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setSleepstop(value);
                return this;
            }

            public Builder setSpo2Calc(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setSpo2Calc(index, value);
                return this;
            }

            public Builder setSportIndoorCalibrate(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setSportIndoorCalibrate(index, value);
                return this;
            }

            public Builder setSportStatus(int index, Event.SportStatusMessage value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setSportStatus(index, value);
                return this;
            }

            public Builder setSportremindersave(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setSportremindersave(value);
                return this;
            }

            public Builder setStartwifi(Event.wifiuseMessage value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setStartwifi(value);
                return this;
            }

            public Builder setStopwatchreset(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setStopwatchreset(value);
                return this;
            }

            public Builder setStopwatchstart(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setStopwatchstart(value);
                return this;
            }

            public Builder setSwimPoolLength(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setSwimPoolLength(value);
                return this;
            }

            public Builder setSysVibration(boolean value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setSysVibration(value);
                return this;
            }

            public Builder setSystemUpdateCancle(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setSystemUpdateCancle(value);
                return this;
            }

            public Builder setSystemUpdateImmediately(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setSystemUpdateImmediately(value);
                return this;
            }

            public Builder setTurnOnTheaterMode(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setTurnOnTheaterMode(value);
                return this;
            }

            public Builder setTurnOnkeepWatchAwake(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setTurnOnkeepWatchAwake(value);
                return this;
            }

            public Builder setUnlock(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setUnlock(index, value);
                return this;
            }

            public Builder setUpdataerrscreen(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setUpdataerrscreen(index, value);
                return this;
            }

            public Builder setUpdataimmediatelyscreen(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setUpdataimmediatelyscreen(index, value);
                return this;
            }

            public Builder setUpdateFail(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setUpdateFail(index, value);
                return this;
            }

            public Builder setUpdatebyuser(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setUpdatebyuser(value);
                return this;
            }

            public Builder setUseStopwatch(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setUseStopwatch(value);
                return this;
            }

            public Builder setUsecarcount(int index, int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setUsecarcount(index, value);
                return this;
            }

            public Builder setVolbycontrol(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setVolbycontrol(value);
                return this;
            }

            public Builder setVolbysetting(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setVolbysetting(value);
                return this;
            }

            public Builder setVolsetcount(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setVolsetcount(value);
                return this;
            }

            public Builder setWatchdir(boolean value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setWatchdir(value);
                return this;
            }

            public Builder setWifiTipspage(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setWifiTipspage(value);
                return this;
            }

            public Builder setWifipwdcorrect(int value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setWifipwdcorrect(value);
                return this;
            }

            public Builder setWristOffLockStatus(boolean value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setWristOffLockStatus(value);
                return this;
            }

            private Builder() {
                super(lisbonEventMessage.DEFAULT_INSTANCE);
            }

            public Builder addNotify(int index, Event.NotifyMessage value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addNotify(index, value);
                return this;
            }

            public Builder addSportStatus(int index, Event.SportStatusMessage value) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addSportStatus(index, value);
                return this;
            }

            public Builder setBaseRes(Event.DfuUpgradeMessage.Builder builderForValue) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setBaseRes(builderForValue.build());
                return this;
            }

            public Builder setBatterySaverOff(Event.BatterySaverMode.Builder builderForValue) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setBatterySaverOff(builderForValue.build());
                return this;
            }

            public Builder setBatterySaverOn(Event.BatterySaverMode.Builder builderForValue) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setBatterySaverOn(builderForValue.build());
                return this;
            }

            public Builder setClosewifi(Event.wifiuseMessage.Builder builderForValue) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setClosewifi(builderForValue.build());
                return this;
            }

            public Builder setDialtool(Event.DialtoolMessage.Builder builderForValue) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setDialtool(builderForValue.build());
                return this;
            }

            public Builder setDndMode(Event.DndEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setDndMode(builderForValue.build());
                return this;
            }

            public Builder setFirmware(Event.DfuUpgradeMessage.Builder builderForValue) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setFirmware(builderForValue.build());
                return this;
            }

            public Builder setFont(Event.DfuUpgradeMessage.Builder builderForValue) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setFont(builderForValue.build());
                return this;
            }

            public Builder setIncRes(Event.DfuUpgradeMessage.Builder builderForValue) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setIncRes(builderForValue.build());
                return this;
            }

            public Builder setLightscreentime(Event.lightscreentimeMessage.Builder builderForValue) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setLightscreentime(builderForValue.build());
                return this;
            }

            public Builder setNandMessage(Event.NandMessage.Builder builderForValue) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setNandMessage(builderForValue.build());
                return this;
            }

            public Builder setNotify(int index, Event.NotifyMessage.Builder builderForValue) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setNotify(index, builderForValue.build());
                return this;
            }

            public Builder setSportStatus(int index, Event.SportStatusMessage.Builder builderForValue) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setSportStatus(index, builderForValue.build());
                return this;
            }

            public Builder setStartwifi(Event.wifiuseMessage.Builder builderForValue) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).setStartwifi(builderForValue.build());
                return this;
            }

            public Builder addNotify(Event.NotifyMessage.Builder builderForValue) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addNotify(builderForValue.build());
                return this;
            }

            public Builder addSportStatus(Event.SportStatusMessage.Builder builderForValue) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addSportStatus(builderForValue.build());
                return this;
            }

            public Builder addNotify(int index, Event.NotifyMessage.Builder builderForValue) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addNotify(index, builderForValue.build());
                return this;
            }

            public Builder addSportStatus(int index, Event.SportStatusMessage.Builder builderForValue) {
                copyOnWrite();
                ((lisbonEventMessage) this.instance).addSportStatus(index, builderForValue.build());
                return this;
            }
        }

        static {
            lisbonEventMessage lisboneventmessage = new lisbonEventMessage();
            DEFAULT_INSTANCE = lisboneventmessage;
            GeneratedMessageLite.registerDefaultInstance(lisbonEventMessage.class, lisboneventmessage);
        }

        private lisbonEventMessage() {
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
        public void addAllCloudMusicPlayBackFolder(Iterable<? extends Integer> values) {
            ensureCloudMusicPlayBackFolderIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.cloudMusicPlayBackFolder_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllCloudMusicPlayMode(Iterable<? extends Integer> values) {
            ensureCloudMusicPlayModeIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.cloudMusicPlayMode_);
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
        public void addAllLocalMusicAudioSource(Iterable<? extends Integer> values) {
            ensureLocalMusicAudioSourceIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.localMusicAudioSource_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLocalMusicLoopButton(Iterable<? extends Integer> values) {
            ensureLocalMusicLoopButtonIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.localMusicLoopButton_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLocalMusicLoopMode(Iterable<? extends Integer> values) {
            ensureLocalMusicLoopModeIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.localMusicLoopMode_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLocalMusicPlaybackButton(Iterable<? extends Integer> values) {
            ensureLocalMusicPlaybackButtonIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.localMusicPlaybackButton_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLocalMusicSongSource(Iterable<? extends Integer> values) {
            ensureLocalMusicSongSourceIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.localMusicSongSource_);
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
        public void addAllOfflineAsrCmd(Iterable<? extends Integer> values) {
            ensureOfflineAsrCmdIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.offlineAsrCmd_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOfflineAsrFailOrSuccess(Iterable<? extends Integer> values) {
            ensureOfflineAsrFailOrSuccessIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.offlineAsrFailOrSuccess_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOfflineAsrModeInto(Iterable<? extends Integer> values) {
            ensureOfflineAsrModeIntoIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.offlineAsrModeInto_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOfflineAsrModeSelect(Iterable<? extends Integer> values) {
            ensureOfflineAsrModeSelectIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.offlineAsrModeSelect_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOffwristlock(Iterable<? extends Integer> values) {
            ensureOffwristlockIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.offwristlock_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOnlineVADActionType(Iterable<? extends Integer> values) {
            ensureOnlineVADActionTypeIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.onlineVADActionType_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOnlineVADRequest(Iterable<? extends Integer> values) {
            ensureOnlineVADRequestIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.onlineVADRequest_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllOnlineVADStartType(Iterable<? extends Integer> values) {
            ensureOnlineVADStartTypeIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.onlineVADStartType_);
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
        public void addCloudMusicPlayBackFolder(int value) {
            ensureCloudMusicPlayBackFolderIsMutable();
            this.cloudMusicPlayBackFolder_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addCloudMusicPlayMode(int value) {
            ensureCloudMusicPlayModeIsMutable();
            this.cloudMusicPlayMode_.addInt(value);
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
        public void addLocalMusicAudioSource(int value) {
            ensureLocalMusicAudioSourceIsMutable();
            this.localMusicAudioSource_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLocalMusicLoopButton(int value) {
            ensureLocalMusicLoopButtonIsMutable();
            this.localMusicLoopButton_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLocalMusicLoopMode(int value) {
            ensureLocalMusicLoopModeIsMutable();
            this.localMusicLoopMode_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLocalMusicPlaybackButton(int value) {
            ensureLocalMusicPlaybackButtonIsMutable();
            this.localMusicPlaybackButton_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLocalMusicSongSource(int value) {
            ensureLocalMusicSongSourceIsMutable();
            this.localMusicSongSource_.addInt(value);
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
        public void addOfflineAsrCmd(int value) {
            ensureOfflineAsrCmdIsMutable();
            this.offlineAsrCmd_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOfflineAsrFailOrSuccess(int value) {
            ensureOfflineAsrFailOrSuccessIsMutable();
            this.offlineAsrFailOrSuccess_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOfflineAsrModeInto(int value) {
            ensureOfflineAsrModeIntoIsMutable();
            this.offlineAsrModeInto_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOfflineAsrModeSelect(int value) {
            ensureOfflineAsrModeSelectIsMutable();
            this.offlineAsrModeSelect_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOffwristlock(int value) {
            ensureOffwristlockIsMutable();
            this.offwristlock_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOnlineVADActionType(int value) {
            ensureOnlineVADActionTypeIsMutable();
            this.onlineVADActionType_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOnlineVADRequest(int value) {
            ensureOnlineVADRequestIsMutable();
            this.onlineVADRequest_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addOnlineVADStartType(int value) {
            ensureOnlineVADStartTypeIsMutable();
            this.onlineVADStartType_.addInt(value);
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
            this.bitField3_ &= -16385;
            this.activityobjectives_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddCardSuccess() {
            this.bitField1_ &= -129;
            this.addCardSuccess_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmreminder() {
            this.bitField2_ &= -33554433;
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
            this.bitField3_ &= -513;
            this.aplayscreen_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssistantVAD() {
            this.bitField3_ &= -4097;
            this.assistantVAD_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssistantcarid() {
            this.bitField3_ &= -1025;
            this.assistantcarid_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAssistantinto() {
            this.bitField3_ &= -2049;
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
            this.bitField3_ &= Integer.MAX_VALUE;
            this.bindsetlanguage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBleconnect() {
            this.bleconnect_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBleconnectclose() {
            this.bitField2_ &= Integer.MAX_VALUE;
            this.bleconnectclose_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBleconnectfail() {
            this.bitField2_ &= -536870913;
            this.bleconnectfail_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBleconnectsuccess() {
            this.bitField2_ &= -268435457;
            this.bleconnectsuccess_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBlelistclick() {
            this.bitField2_ &= -1073741825;
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
            this.bitField3_ &= -9;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCloudMusicPlayBackFolder() {
            this.cloudMusicPlayBackFolder_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCloudMusicPlayMode() {
            this.cloudMusicPlayMode_ = GeneratedMessageLite.emptyIntList();
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
            this.bitField2_ &= -524289;
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
            this.bitField3_ &= -8193;
            this.dialchangemode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialtool() {
            this.dialtool_ = null;
            this.bitField2_ &= -262145;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDndMode() {
            this.dndMode_ = null;
            this.bitField1_ &= -32769;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnterCloudMusic() {
            this.bitField2_ &= -17;
            this.enterCloudMusic_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnterLocalMusicFirstpage() {
            this.bitField2_ &= -8193;
            this.enterLocalMusicFirstpage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEnterMusicViceScreen() {
            this.bitField2_ &= -4097;
            this.enterMusicViceScreen_ = 0;
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
            this.bitField3_ &= -4194305;
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
            this.bitField3_ &= -8388609;
            this.gotosleep_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearGotowakeup() {
            this.bitField3_ &= -16777217;
            this.gotowakeup_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHfpCallInAnswer() {
            this.bitField2_ &= -129;
            this.hfpCallInAnswer_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHfpCallInHangUp() {
            this.bitField2_ &= -65;
            this.hfpCallInHangUp_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHfpCallInIgnore() {
            this.bitField2_ &= -33;
            this.hfpCallInIgnore_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHfpCallOnHangUp() {
            this.bitField2_ &= -513;
            this.hfpCallOnHangUp_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHfpCallOnMute() {
            this.bitField2_ &= -257;
            this.hfpCallOnMute_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHfpCallOnSwitchPhone() {
            this.bitField2_ &= -2049;
            this.hfpCallOnSwitchPhone_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHfpCallOnVolume() {
            this.bitField2_ &= -1025;
            this.hfpCallOnVolume_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIncRes() {
            this.incRes_ = null;
            this.bitField2_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLanguageselect() {
            this.bitField3_ &= -2;
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
            this.bitField3_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLightsetting() {
            this.bitField3_ &= -524289;
            this.lightsetting_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLocalMusicAudioSource() {
            this.localMusicAudioSource_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLocalMusicConnectBleDevice() {
            this.bitField2_ &= -16385;
            this.localMusicConnectBleDevice_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLocalMusicLoopButton() {
            this.localMusicLoopButton_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLocalMusicLoopMode() {
            this.localMusicLoopMode_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLocalMusicPlaybackButton() {
            this.localMusicPlaybackButton_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLocalMusicSongSource() {
            this.localMusicSongSource_ = GeneratedMessageLite.emptyIntList();
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
            this.bitField3_ &= -536870913;
            this.nobindrecovery_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNobindsupervise() {
            this.bitField3_ &= -1073741825;
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
            this.bitField3_ &= -257;
            this.pressureinto_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPressuremeasureresult() {
            this.pressuremeasureresult_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQNEgps() {
            this.bitField2_ &= -134217729;
            this.qNEgps_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearQNEinto() {
            this.bitField2_ &= -67108865;
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
            this.bitField3_ &= -1048577;
            this.rateabnormalreminder_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRatemeasure() {
            this.ratemeasure_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRatewarnreminder() {
            this.bitField3_ &= -2097153;
            this.ratewarnreminder_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRebootNum() {
            this.bitField1_ &= -513;
            this.rebootNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRecoverymode() {
            this.bitField2_ &= -4194305;
            this.recoverymode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemindershock() {
            this.bitField2_ &= -32769;
            this.remindershock_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReminderstand() {
            this.bitField2_ &= -1048577;
            this.reminderstand_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReminderstandcomplete() {
            this.bitField2_ &= -2097153;
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
            this.bitField3_ &= -131073;
            this.scheduleedit_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSchedulereminderclick() {
            this.schedulereminderclick_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSeePAIexplain() {
            this.bitField2_ &= -131073;
            this.seePAIexplain_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSeePAIrate() {
            this.bitField2_ &= -65537;
            this.seePAIrate_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSetAlarm() {
            this.bitField0_ &= -536870913;
            this.setAlarm_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSleepgoal() {
            this.bitField3_ &= -67108865;
            this.sleepgoal_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSleepreminder() {
            this.bitField3_ &= -268435457;
            this.sleepreminder_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSleepscreen() {
            this.bitField3_ &= -33554433;
            this.sleepscreen_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSleepstop() {
            this.bitField3_ &= -134217729;
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
            this.bitField4_ &= -3;
            this.sportremindersave_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStartwifi() {
            this.startwifi_ = null;
            this.bitField3_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStopwatchreset() {
            this.bitField3_ &= -65537;
            this.stopwatchreset_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStopwatchstart() {
            this.bitField3_ &= -32769;
            this.stopwatchstart_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSwimPoolLength() {
            this.bitField1_ &= -8193;
            this.swimPoolLength_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSysVibration() {
            this.bitField3_ &= -129;
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
            this.bitField4_ &= -2;
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
            this.bitField2_ &= -16777217;
            this.volbycontrol_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVolbysetting() {
            this.bitField3_ &= -65;
            this.volbysetting_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVolsetcount() {
            this.bitField2_ &= -8388609;
            this.volsetcount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWatchdir() {
            this.bitField3_ &= -262145;
            this.watchdir_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWifiTipspage() {
            this.bitField3_ &= -17;
            this.wifiTipspage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWifipwdcorrect() {
            this.bitField3_ &= -33;
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

        private void ensureCloudMusicPlayBackFolderIsMutable() {
            Internal.IntList intList = this.cloudMusicPlayBackFolder_;
            if (intList.isModifiable()) {
                return;
            }
            this.cloudMusicPlayBackFolder_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureCloudMusicPlayModeIsMutable() {
            Internal.IntList intList = this.cloudMusicPlayMode_;
            if (intList.isModifiable()) {
                return;
            }
            this.cloudMusicPlayMode_ = GeneratedMessageLite.mutableCopy(intList);
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

        private void ensureLocalMusicAudioSourceIsMutable() {
            Internal.IntList intList = this.localMusicAudioSource_;
            if (intList.isModifiable()) {
                return;
            }
            this.localMusicAudioSource_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureLocalMusicLoopButtonIsMutable() {
            Internal.IntList intList = this.localMusicLoopButton_;
            if (intList.isModifiable()) {
                return;
            }
            this.localMusicLoopButton_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureLocalMusicLoopModeIsMutable() {
            Internal.IntList intList = this.localMusicLoopMode_;
            if (intList.isModifiable()) {
                return;
            }
            this.localMusicLoopMode_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureLocalMusicPlaybackButtonIsMutable() {
            Internal.IntList intList = this.localMusicPlaybackButton_;
            if (intList.isModifiable()) {
                return;
            }
            this.localMusicPlaybackButton_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureLocalMusicSongSourceIsMutable() {
            Internal.IntList intList = this.localMusicSongSource_;
            if (intList.isModifiable()) {
                return;
            }
            this.localMusicSongSource_ = GeneratedMessageLite.mutableCopy(intList);
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

        private void ensureNotifyIsMutable() {
            Internal.ProtobufList<Event.NotifyMessage> protobufList = this.notify_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.notify_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        private void ensureOfflineAsrCmdIsMutable() {
            Internal.IntList intList = this.offlineAsrCmd_;
            if (intList.isModifiable()) {
                return;
            }
            this.offlineAsrCmd_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureOfflineAsrFailOrSuccessIsMutable() {
            Internal.IntList intList = this.offlineAsrFailOrSuccess_;
            if (intList.isModifiable()) {
                return;
            }
            this.offlineAsrFailOrSuccess_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureOfflineAsrModeIntoIsMutable() {
            Internal.IntList intList = this.offlineAsrModeInto_;
            if (intList.isModifiable()) {
                return;
            }
            this.offlineAsrModeInto_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureOfflineAsrModeSelectIsMutable() {
            Internal.IntList intList = this.offlineAsrModeSelect_;
            if (intList.isModifiable()) {
                return;
            }
            this.offlineAsrModeSelect_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureOffwristlockIsMutable() {
            Internal.IntList intList = this.offwristlock_;
            if (intList.isModifiable()) {
                return;
            }
            this.offwristlock_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureOnlineVADActionTypeIsMutable() {
            Internal.IntList intList = this.onlineVADActionType_;
            if (intList.isModifiable()) {
                return;
            }
            this.onlineVADActionType_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureOnlineVADRequestIsMutable() {
            Internal.IntList intList = this.onlineVADRequest_;
            if (intList.isModifiable()) {
                return;
            }
            this.onlineVADRequest_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureOnlineVADStartTypeIsMutable() {
            Internal.IntList intList = this.onlineVADStartType_;
            if (intList.isModifiable()) {
                return;
            }
            this.onlineVADStartType_ = GeneratedMessageLite.mutableCopy(intList);
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

        public static lisbonEventMessage getDefaultInstance() {
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
            this.bitField3_ |= 8;
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
            this.bitField2_ |= 262144;
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
            this.bitField3_ |= 2;
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
            this.bitField3_ |= 4;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static lisbonEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (lisbonEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static lisbonEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (lisbonEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<lisbonEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeNotify(int index) {
            ensureNotifyIsMutable();
            this.notify_.remove(index);
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
            this.bitField3_ |= 16384;
            this.activityobjectives_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddCardSuccess(int value) {
            this.bitField1_ |= 128;
            this.addCardSuccess_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmreminder(int value) {
            this.bitField2_ |= 33554432;
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
            this.bitField3_ |= 512;
            this.aplayscreen_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssistantVAD(int value) {
            this.bitField3_ |= 4096;
            this.assistantVAD_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssistantcarid(int value) {
            this.bitField3_ |= 1024;
            this.assistantcarid_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAssistantinto(int value) {
            this.bitField3_ |= 2048;
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
            this.bitField3_ |= Integer.MIN_VALUE;
            this.bindsetlanguage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBleconnect(int index, int value) {
            ensureBleconnectIsMutable();
            this.bleconnect_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBleconnectclose(int value) {
            this.bitField2_ |= Integer.MIN_VALUE;
            this.bleconnectclose_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBleconnectfail(int value) {
            this.bitField2_ |= 536870912;
            this.bleconnectfail_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBleconnectsuccess(int value) {
            this.bitField2_ |= 268435456;
            this.bleconnectsuccess_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBlelistclick(int value) {
            this.bitField2_ |= 1073741824;
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
            this.bitField3_ |= 8;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCloudMusicPlayBackFolder(int index, int value) {
            ensureCloudMusicPlayBackFolderIsMutable();
            this.cloudMusicPlayBackFolder_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCloudMusicPlayMode(int index, int value) {
            ensureCloudMusicPlayModeIsMutable();
            this.cloudMusicPlayMode_.setInt(index, value);
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
            this.bitField2_ |= 524288;
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
            this.bitField3_ |= 8192;
            this.dialchangemode_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialtool(Event.DialtoolMessage value) {
            value.getClass();
            this.dialtool_ = value;
            this.bitField2_ |= 262144;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDndMode(Event.DndEventMessage value) {
            value.getClass();
            this.dndMode_ = value;
            this.bitField1_ |= 32768;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnterCloudMusic(int value) {
            this.bitField2_ |= 16;
            this.enterCloudMusic_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnterLocalMusicFirstpage(int value) {
            this.bitField2_ |= 8192;
            this.enterLocalMusicFirstpage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEnterMusicViceScreen(int value) {
            this.bitField2_ |= 4096;
            this.enterMusicViceScreen_ = value;
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
            this.bitField3_ |= 4194304;
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
            this.bitField3_ |= 8388608;
            this.gotosleep_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setGotowakeup(int value) {
            this.bitField3_ |= 16777216;
            this.gotowakeup_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHfpCallInAnswer(int value) {
            this.bitField2_ |= 128;
            this.hfpCallInAnswer_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHfpCallInHangUp(int value) {
            this.bitField2_ |= 64;
            this.hfpCallInHangUp_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHfpCallInIgnore(int value) {
            this.bitField2_ |= 32;
            this.hfpCallInIgnore_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHfpCallOnHangUp(int value) {
            this.bitField2_ |= 512;
            this.hfpCallOnHangUp_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHfpCallOnMute(int value) {
            this.bitField2_ |= 256;
            this.hfpCallOnMute_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHfpCallOnSwitchPhone(int value) {
            this.bitField2_ |= 2048;
            this.hfpCallOnSwitchPhone_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHfpCallOnVolume(int value) {
            this.bitField2_ |= 1024;
            this.hfpCallOnVolume_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIncRes(Event.DfuUpgradeMessage value) {
            value.getClass();
            this.incRes_ = value;
            this.bitField2_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLanguageselect(int value) {
            this.bitField3_ |= 1;
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
            this.bitField3_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLightsetting(int value) {
            this.bitField3_ |= 524288;
            this.lightsetting_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocalMusicAudioSource(int index, int value) {
            ensureLocalMusicAudioSourceIsMutable();
            this.localMusicAudioSource_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocalMusicConnectBleDevice(int value) {
            this.bitField2_ |= 16384;
            this.localMusicConnectBleDevice_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocalMusicLoopButton(int index, int value) {
            ensureLocalMusicLoopButtonIsMutable();
            this.localMusicLoopButton_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocalMusicLoopMode(int index, int value) {
            ensureLocalMusicLoopModeIsMutable();
            this.localMusicLoopMode_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocalMusicPlaybackButton(int index, int value) {
            ensureLocalMusicPlaybackButtonIsMutable();
            this.localMusicPlaybackButton_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLocalMusicSongSource(int index, int value) {
            ensureLocalMusicSongSourceIsMutable();
            this.localMusicSongSource_.setInt(index, value);
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
            this.bitField3_ |= 536870912;
            this.nobindrecovery_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNobindsupervise(int value) {
            this.bitField3_ |= 1073741824;
            this.nobindsupervise_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotify(int index, Event.NotifyMessage value) {
            value.getClass();
            ensureNotifyIsMutable();
            this.notify_.set(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOfflineAsrCmd(int index, int value) {
            ensureOfflineAsrCmdIsMutable();
            this.offlineAsrCmd_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOfflineAsrFailOrSuccess(int index, int value) {
            ensureOfflineAsrFailOrSuccessIsMutable();
            this.offlineAsrFailOrSuccess_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOfflineAsrModeInto(int index, int value) {
            ensureOfflineAsrModeIntoIsMutable();
            this.offlineAsrModeInto_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOfflineAsrModeSelect(int index, int value) {
            ensureOfflineAsrModeSelectIsMutable();
            this.offlineAsrModeSelect_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOffwristlock(int index, int value) {
            ensureOffwristlockIsMutable();
            this.offwristlock_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOnlineVADActionType(int index, int value) {
            ensureOnlineVADActionTypeIsMutable();
            this.onlineVADActionType_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOnlineVADRequest(int index, int value) {
            ensureOnlineVADRequestIsMutable();
            this.onlineVADRequest_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOnlineVADStartType(int index, int value) {
            ensureOnlineVADStartTypeIsMutable();
            this.onlineVADStartType_.setInt(index, value);
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
            this.bitField3_ |= 256;
            this.pressureinto_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPressuremeasureresult(int index, int value) {
            ensurePressuremeasureresultIsMutable();
            this.pressuremeasureresult_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQNEgps(int value) {
            this.bitField2_ |= AMapEngineUtils.HALF_MAX_P20_WIDTH;
            this.qNEgps_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setQNEinto(int value) {
            this.bitField2_ |= 67108864;
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
            this.bitField3_ |= 1048576;
            this.rateabnormalreminder_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRatemeasure(int index, int value) {
            ensureRatemeasureIsMutable();
            this.ratemeasure_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRatewarnreminder(int value) {
            this.bitField3_ |= 2097152;
            this.ratewarnreminder_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRebootNum(int value) {
            this.bitField1_ |= 512;
            this.rebootNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRecoverymode(int value) {
            this.bitField2_ |= 4194304;
            this.recoverymode_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemindershock(int value) {
            this.bitField2_ |= 32768;
            this.remindershock_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReminderstand(int value) {
            this.bitField2_ |= 1048576;
            this.reminderstand_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReminderstandcomplete(int value) {
            this.bitField2_ |= 2097152;
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
            this.bitField3_ |= 131072;
            this.scheduleedit_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSchedulereminderclick(int index, int value) {
            ensureSchedulereminderclickIsMutable();
            this.schedulereminderclick_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSeePAIexplain(int value) {
            this.bitField2_ |= 131072;
            this.seePAIexplain_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSeePAIrate(int value) {
            this.bitField2_ |= 65536;
            this.seePAIrate_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSetAlarm(int value) {
            this.bitField0_ |= 536870912;
            this.setAlarm_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSleepgoal(int value) {
            this.bitField3_ |= 67108864;
            this.sleepgoal_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSleepreminder(int value) {
            this.bitField3_ |= 268435456;
            this.sleepreminder_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSleepscreen(int value) {
            this.bitField3_ |= 33554432;
            this.sleepscreen_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSleepstop(int value) {
            this.bitField3_ |= AMapEngineUtils.HALF_MAX_P20_WIDTH;
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
            this.bitField4_ |= 2;
            this.sportremindersave_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStartwifi(Event.wifiuseMessage value) {
            value.getClass();
            this.startwifi_ = value;
            this.bitField3_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopwatchreset(int value) {
            this.bitField3_ |= 65536;
            this.stopwatchreset_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopwatchstart(int value) {
            this.bitField3_ |= 32768;
            this.stopwatchstart_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwimPoolLength(int value) {
            this.bitField1_ |= 8192;
            this.swimPoolLength_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSysVibration(boolean value) {
            this.bitField3_ |= 128;
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
            this.bitField4_ |= 1;
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
            this.bitField2_ |= 16777216;
            this.volbycontrol_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVolbysetting(int value) {
            this.bitField3_ |= 64;
            this.volbysetting_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVolsetcount(int value) {
            this.bitField2_ |= 8388608;
            this.volsetcount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWatchdir(boolean value) {
            this.bitField3_ |= 262144;
            this.watchdir_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWifiTipspage(int value) {
            this.bitField3_ |= 16;
            this.wifiTipspage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWifipwdcorrect(int value) {
            this.bitField3_ |= 32;
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
                    return new lisbonEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001©\u0000\u0005\u0001©©\u0000'\u0084\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004\u001d\u0005ᔋ\u0003\u0006ᔋ\u0004\u0007ᔋ\u0005\bᔋ\u0006\tᔋ\u0007\nᔋ\b\u000bᔋ\t\fᔋ\n\rᔋ\u000b\u000eᔋ\f\u000fᔋ\r\u0010ᔋ\u000e\u0011ᔋ\u000f\u0012ᔋ\u0010\u0013ᔋ\u0011\u0014ᔋ\u0012\u0015ᔋ\u0013\u0016ᔋ\u0014\u0017ᔋ\u0015\u0018ᔋ\u0016\u0019ᔋ\u0017\u001aᔋ\u0018\u001bЛ\u001cᔋ\u0019\u001dᔋ\u001a\u001e\u001d\u001fᔋ\u001b \u001d!ᔋ\u001c\"\u001d#ᔋ\u001d$ᔋ\u001e%ᔋ\u001f&ᔋ 'ᔉ!(ᔉ\")ᔋ#*ᔋ$+ᔋ%,ᔋ&-ᔋ'.ᔋ(/ᔋ)0ᔋ*1ᔋ+2ᔋ,3\u001d4Л5\u001d6ᔋ-7ᔋ.8ᔉ/9ᔋ0:ᔋ1;ᔋ2<ᔋ3=ᔋ4>ᔇ5?ᔋ6@\u0019Aᔇ7Bᔋ8Cᔋ9Dᔉ:Eᔋ;Fᔄ<Gᔃ=Hᔋ>Iᔋ?Jᔉ@KᔉALᔉBMᔉCN\u001dO\u001dP\u001dQ\u001dR\u001dS\u001dT\u001dUᔋDV\u001dW\u001dXᔋEYᔋFZᔋG[ᔋH\\ᔋI]ᔋJ^ᔋK_ᔋL`ᔋMa\u001db\u001dc\u001dd\u001de\u001dfᔋNg\u001dh\u001diᔋOjᔋPkᔋQlᔉRmᔋSnᔋToᔋUpᔋVq\u001drᔋWsᔋXt\u001duᔋYv\u001dwᔋZxᔋ[y\u001dz\u001d{\u001d|\u001d}ᔋ\\~ᔋ]\u007fᔋ^\u0080ᔋ_\u0081\u001d\u0082\u001d\u0083\u001d\u0084ᔋ`\u0085ᔉa\u0086ᔉb\u0087ᔉc\u0088ᔋd\u0089ᔋe\u008aᔋf\u008bᔇg\u008c\u001d\u008dᔋh\u008e\u001d\u008f\u001d\u0090ᔋi\u0091ᔋj\u0092ᔋk\u0093ᔋl\u0094ᔋm\u0095ᔋn\u0096ᔋo\u0097ᔋp\u0098\u001d\u0099ᔋq\u009aᔇr\u009bᔋs\u009cᔋt\u009dᔋu\u009eᔋv\u009fᔋw ᔋx¡ᔋy¢ᔋz£ᔋ{¤ᔋ|¥ᔋ}¦ᔋ~§ᔋ\u007f¨ᔋ\u0080©ᔋ\u0081", new Object[]{"bitField0_", "bitField1_", "bitField2_", "bitField3_", "bitField4_", "gotoCompassPage_", "gotoDialAlipayPage_", "gotoSportHistory_", "gotoSportDetailPage_", "gotoSportPage_", "gotoDialSportPage_", "gotoMusicPage_", "gotoDialMusicPage_", "gotoHeartPage_", "gotoDialHeartPage_", "gotoSpO2Page_", "gotoPaiPage_", "gotoDialPaiPage_", "gotoWeatherPage_", "gotoWeatherSecondPage_", "gotoDialWeatherPage_", "gotoEventPage_", "gotoDialEventPage_", "gotoAlarmPage_", "gotoDialAlarmPage_", "gotoStopwatchPage_", "gotoCountdownPage_", "gotoNfcCardPage_", "gotoDialNfcCadePage_", "gotoActivityPage_", "gotoDialActivityPage_", "notify_", Event.NotifyMessage.class, "compassCalibrateSuccessNum_", "alipayBindSuccessNum_", "spo2Calc_", "lcdOnBecauseOfWrist_", "lcdOff_", "eventTimeUp_", "unlock_", "setAlarm_", "useStopwatch_", "forgetWristOffLockPasswd_", "countDownTimeup_", "batterySaverOff_", "batterySaverOn_", "lockScreen_", "findPhone_", "turnOnTheaterMode_", "turnOnkeepWatchAwake_", "addCardSuccess_", "bindingSuccess_", "rebootNum_", "powerOff_", "systemUpdateImmediately_", "systemUpdateCancle_", "updateFail_", "sportStatus_", Event.SportStatusMessage.class, "sportIndoorCalibrate_", "swimPoolLength_", "activityTarget_", "dndMode_", "powerOffBatteryValue_", "powerOnBatteryValue_", "changeBatteryValue_", "autoScreenOffTime_", "lcdOnBecauseOfWristStatus_", "wristOffLockStatus_", "quickAccessApp_", "quickEntryApp_", "autoLight_", "currentDialId_", "currentDialNum_", "nandMessage_", "fatFreesize_", "fatDropsize_", "fatDroptime_", "fatFormat_", "fatDosfsck_", "firmware_", "baseRes_", "incRes_", "font_", "offlineAsrModeSelect_", "offlineAsrModeInto_", "offlineAsrFailOrSuccess_", "offlineAsrCmd_", "onlineVADStartType_", "onlineVADRequest_", "onlineVADActionType_", "enterCloudMusic_", "cloudMusicPlayBackFolder_", "cloudMusicPlayMode_", "hfpCallInIgnore_", "hfpCallInHangUp_", "hfpCallInAnswer_", "hfpCallOnMute_", "hfpCallOnHangUp_", "hfpCallOnVolume_", "hfpCallOnSwitchPhone_", "enterMusicViceScreen_", "enterLocalMusicFirstpage_", "localMusicSongSource_", "localMusicLoopMode_", "localMusicLoopButton_", "localMusicPlaybackButton_", "localMusicAudioSource_", "localMusicConnectBleDevice_", "updataerrscreen_", "updataimmediatelyscreen_", "remindershock_", "seePAIrate_", "seePAIexplain_", "dialtool_", "coutdowntime_", "reminderstand_", "reminderstandcomplete_", "recoverymode_", "usecarcount_", "volsetcount_", "volbycontrol_", "offwristlock_", "alarmreminder_", "alarmreminderclick_", "qNEinto_", "qNEgps_", "schedulereminderclick_", "flymode_", "blestatus_", "bleconnect_", "bleconnectsuccess_", "bleconnectfail_", "blelistclick_", "bleconnectclose_", "modifypwd_", "nFCstatus_", "ringreminder_", "languageselect_", "lightscreentime_", "startwifi_", "closewifi_", "wifiTipspage_", "wifipwdcorrect_", "volbysetting_", "sysVibration_", "ratemeasure_", "pressureinto_", "pressureautomeasure_", "pressuremeasureresult_", "aplayscreen_", "assistantcarid_", "assistantinto_", "assistantVAD_", "dialchangemode_", "activityobjectives_", "stopwatchstart_", "stopwatchreset_", "scheduledelete_", "scheduleedit_", "watchdir_", "lightsetting_", "rateabnormalreminder_", "ratewarnreminder_", "findmoblie_", "gotosleep_", "gotowakeup_", "sleepscreen_", "sleepgoal_", "sleepstop_", "sleepreminder_", "nobindrecovery_", "nobindsupervise_", "bindsetlanguage_", "updatebyuser_", "sportremindersave_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<lisbonEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (lisbonEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getActivityTarget() {
            return this.activityTarget_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getActivityobjectives() {
            return this.activityobjectives_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getAddCardSuccess() {
            return this.addCardSuccess_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getAlarmreminder() {
            return this.alarmreminder_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getAlarmreminderclick(int index) {
            return this.alarmreminderclick_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getAlarmreminderclickCount() {
            return this.alarmreminderclick_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getAlarmreminderclickList() {
            return this.alarmreminderclick_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getAlipayBindSuccessNum() {
            return this.alipayBindSuccessNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getAplayscreen() {
            return this.aplayscreen_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getAssistantVAD() {
            return this.assistantVAD_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getAssistantcarid() {
            return this.assistantcarid_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getAssistantinto() {
            return this.assistantinto_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean getAutoLight() {
            return this.autoLight_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getAutoScreenOffTime() {
            return this.autoScreenOffTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public Event.DfuUpgradeMessage getBaseRes() {
            Event.DfuUpgradeMessage dfuUpgradeMessage = this.baseRes_;
            return dfuUpgradeMessage == null ? Event.DfuUpgradeMessage.getDefaultInstance() : dfuUpgradeMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public Event.BatterySaverMode getBatterySaverOff() {
            Event.BatterySaverMode batterySaverMode = this.batterySaverOff_;
            return batterySaverMode == null ? Event.BatterySaverMode.getDefaultInstance() : batterySaverMode;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public Event.BatterySaverMode getBatterySaverOn() {
            Event.BatterySaverMode batterySaverMode = this.batterySaverOn_;
            return batterySaverMode == null ? Event.BatterySaverMode.getDefaultInstance() : batterySaverMode;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getBindingSuccess() {
            return this.bindingSuccess_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getBindsetlanguage() {
            return this.bindsetlanguage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getBleconnect(int index) {
            return this.bleconnect_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getBleconnectCount() {
            return this.bleconnect_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getBleconnectList() {
            return this.bleconnect_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getBleconnectclose() {
            return this.bleconnectclose_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getBleconnectfail() {
            return this.bleconnectfail_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getBleconnectsuccess() {
            return this.bleconnectsuccess_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getBlelistclick() {
            return this.blelistclick_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getBlestatus(int index) {
            return this.blestatus_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getBlestatusCount() {
            return this.blestatus_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getBlestatusList() {
            return this.blestatus_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getChangeBatteryValue() {
            return this.changeBatteryValue_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public Event.wifiuseMessage getClosewifi() {
            Event.wifiuseMessage wifiusemessage = this.closewifi_;
            return wifiusemessage == null ? Event.wifiuseMessage.getDefaultInstance() : wifiusemessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getCloudMusicPlayBackFolder(int index) {
            return this.cloudMusicPlayBackFolder_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getCloudMusicPlayBackFolderCount() {
            return this.cloudMusicPlayBackFolder_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getCloudMusicPlayBackFolderList() {
            return this.cloudMusicPlayBackFolder_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getCloudMusicPlayMode(int index) {
            return this.cloudMusicPlayMode_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getCloudMusicPlayModeCount() {
            return this.cloudMusicPlayMode_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getCloudMusicPlayModeList() {
            return this.cloudMusicPlayMode_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getCompassCalibrateSuccessNum() {
            return this.compassCalibrateSuccessNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getCountDownTimeup() {
            return this.countDownTimeup_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getCoutdowntime() {
            return this.coutdowntime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getCurrentDialId() {
            return this.currentDialId_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getCurrentDialNum() {
            return this.currentDialNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getDialchangemode() {
            return this.dialchangemode_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public Event.DialtoolMessage getDialtool() {
            Event.DialtoolMessage dialtoolMessage = this.dialtool_;
            return dialtoolMessage == null ? Event.DialtoolMessage.getDefaultInstance() : dialtoolMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public Event.DndEventMessage getDndMode() {
            Event.DndEventMessage dndEventMessage = this.dndMode_;
            return dndEventMessage == null ? Event.DndEventMessage.getDefaultInstance() : dndEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getEnterCloudMusic() {
            return this.enterCloudMusic_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getEnterLocalMusicFirstpage() {
            return this.enterLocalMusicFirstpage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getEnterMusicViceScreen() {
            return this.enterMusicViceScreen_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getEventTimeUp() {
            return this.eventTimeUp_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getFatDosfsck() {
            return this.fatDosfsck_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getFatDropsize() {
            return this.fatDropsize_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public long getFatDroptime() {
            return this.fatDroptime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getFatFormat() {
            return this.fatFormat_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getFatFreesize() {
            return this.fatFreesize_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getFindPhone() {
            return this.findPhone_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getFindmoblie() {
            return this.findmoblie_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public Event.DfuUpgradeMessage getFirmware() {
            Event.DfuUpgradeMessage dfuUpgradeMessage = this.firmware_;
            return dfuUpgradeMessage == null ? Event.DfuUpgradeMessage.getDefaultInstance() : dfuUpgradeMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getFlymode(int index) {
            return this.flymode_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getFlymodeCount() {
            return this.flymode_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getFlymodeList() {
            return this.flymode_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public Event.DfuUpgradeMessage getFont() {
            Event.DfuUpgradeMessage dfuUpgradeMessage = this.font_;
            return dfuUpgradeMessage == null ? Event.DfuUpgradeMessage.getDefaultInstance() : dfuUpgradeMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getForgetWristOffLockPasswd() {
            return this.forgetWristOffLockPasswd_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotoActivityPage() {
            return this.gotoActivityPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotoAlarmPage() {
            return this.gotoAlarmPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotoCompassPage() {
            return this.gotoCompassPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotoCountdownPage() {
            return this.gotoCountdownPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotoDialActivityPage() {
            return this.gotoDialActivityPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotoDialAlarmPage() {
            return this.gotoDialAlarmPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotoDialAlipayPage() {
            return this.gotoDialAlipayPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotoDialEventPage() {
            return this.gotoDialEventPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotoDialHeartPage() {
            return this.gotoDialHeartPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotoDialMusicPage() {
            return this.gotoDialMusicPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotoDialNfcCadePage() {
            return this.gotoDialNfcCadePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotoDialPaiPage() {
            return this.gotoDialPaiPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotoDialSportPage() {
            return this.gotoDialSportPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotoDialWeatherPage() {
            return this.gotoDialWeatherPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotoEventPage() {
            return this.gotoEventPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotoHeartPage() {
            return this.gotoHeartPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotoMusicPage() {
            return this.gotoMusicPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotoNfcCardPage() {
            return this.gotoNfcCardPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotoPaiPage() {
            return this.gotoPaiPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotoSpO2Page() {
            return this.gotoSpO2Page_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotoSportDetailPage(int index) {
            return this.gotoSportDetailPage_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotoSportDetailPageCount() {
            return this.gotoSportDetailPage_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getGotoSportDetailPageList() {
            return this.gotoSportDetailPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotoSportHistory() {
            return this.gotoSportHistory_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotoSportPage() {
            return this.gotoSportPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotoStopwatchPage() {
            return this.gotoStopwatchPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotoWeatherPage() {
            return this.gotoWeatherPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotoWeatherSecondPage() {
            return this.gotoWeatherSecondPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotosleep() {
            return this.gotosleep_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getGotowakeup() {
            return this.gotowakeup_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getHfpCallInAnswer() {
            return this.hfpCallInAnswer_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getHfpCallInHangUp() {
            return this.hfpCallInHangUp_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getHfpCallInIgnore() {
            return this.hfpCallInIgnore_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getHfpCallOnHangUp() {
            return this.hfpCallOnHangUp_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getHfpCallOnMute() {
            return this.hfpCallOnMute_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getHfpCallOnSwitchPhone() {
            return this.hfpCallOnSwitchPhone_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getHfpCallOnVolume() {
            return this.hfpCallOnVolume_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public Event.DfuUpgradeMessage getIncRes() {
            Event.DfuUpgradeMessage dfuUpgradeMessage = this.incRes_;
            return dfuUpgradeMessage == null ? Event.DfuUpgradeMessage.getDefaultInstance() : dfuUpgradeMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getLanguageselect() {
            return this.languageselect_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getLcdOff(int index) {
            return this.lcdOff_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getLcdOffCount() {
            return this.lcdOff_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getLcdOffList() {
            return this.lcdOff_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getLcdOnBecauseOfWrist() {
            return this.lcdOnBecauseOfWrist_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getLcdOnBecauseOfWristStatus() {
            return this.lcdOnBecauseOfWristStatus_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public Event.lightscreentimeMessage getLightscreentime() {
            Event.lightscreentimeMessage lightscreentimemessage = this.lightscreentime_;
            return lightscreentimemessage == null ? Event.lightscreentimeMessage.getDefaultInstance() : lightscreentimemessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getLightsetting() {
            return this.lightsetting_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getLocalMusicAudioSource(int index) {
            return this.localMusicAudioSource_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getLocalMusicAudioSourceCount() {
            return this.localMusicAudioSource_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getLocalMusicAudioSourceList() {
            return this.localMusicAudioSource_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getLocalMusicConnectBleDevice() {
            return this.localMusicConnectBleDevice_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getLocalMusicLoopButton(int index) {
            return this.localMusicLoopButton_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getLocalMusicLoopButtonCount() {
            return this.localMusicLoopButton_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getLocalMusicLoopButtonList() {
            return this.localMusicLoopButton_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getLocalMusicLoopMode(int index) {
            return this.localMusicLoopMode_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getLocalMusicLoopModeCount() {
            return this.localMusicLoopMode_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getLocalMusicLoopModeList() {
            return this.localMusicLoopMode_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getLocalMusicPlaybackButton(int index) {
            return this.localMusicPlaybackButton_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getLocalMusicPlaybackButtonCount() {
            return this.localMusicPlaybackButton_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getLocalMusicPlaybackButtonList() {
            return this.localMusicPlaybackButton_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getLocalMusicSongSource(int index) {
            return this.localMusicSongSource_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getLocalMusicSongSourceCount() {
            return this.localMusicSongSource_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getLocalMusicSongSourceList() {
            return this.localMusicSongSource_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getLockScreen() {
            return this.lockScreen_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getModifypwd(int index) {
            return this.modifypwd_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getModifypwdCount() {
            return this.modifypwd_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getModifypwdList() {
            return this.modifypwd_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getNFCstatus(int index) {
            return this.nFCstatus_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getNFCstatusCount() {
            return this.nFCstatus_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getNFCstatusList() {
            return this.nFCstatus_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public Event.NandMessage getNandMessage() {
            Event.NandMessage nandMessage = this.nandMessage_;
            return nandMessage == null ? Event.NandMessage.getDefaultInstance() : nandMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getNobindrecovery() {
            return this.nobindrecovery_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getNobindsupervise() {
            return this.nobindsupervise_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public Event.NotifyMessage getNotify(int index) {
            return this.notify_.get(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getNotifyCount() {
            return this.notify_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Event.NotifyMessage> getNotifyList() {
            return this.notify_;
        }

        public Event.NotifyMessageOrBuilder getNotifyOrBuilder(int index) {
            return this.notify_.get(index);
        }

        public List<? extends Event.NotifyMessageOrBuilder> getNotifyOrBuilderList() {
            return this.notify_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getOfflineAsrCmd(int index) {
            return this.offlineAsrCmd_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getOfflineAsrCmdCount() {
            return this.offlineAsrCmd_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getOfflineAsrCmdList() {
            return this.offlineAsrCmd_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getOfflineAsrFailOrSuccess(int index) {
            return this.offlineAsrFailOrSuccess_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getOfflineAsrFailOrSuccessCount() {
            return this.offlineAsrFailOrSuccess_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getOfflineAsrFailOrSuccessList() {
            return this.offlineAsrFailOrSuccess_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getOfflineAsrModeInto(int index) {
            return this.offlineAsrModeInto_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getOfflineAsrModeIntoCount() {
            return this.offlineAsrModeInto_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getOfflineAsrModeIntoList() {
            return this.offlineAsrModeInto_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getOfflineAsrModeSelect(int index) {
            return this.offlineAsrModeSelect_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getOfflineAsrModeSelectCount() {
            return this.offlineAsrModeSelect_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getOfflineAsrModeSelectList() {
            return this.offlineAsrModeSelect_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getOffwristlock(int index) {
            return this.offwristlock_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getOffwristlockCount() {
            return this.offwristlock_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getOffwristlockList() {
            return this.offwristlock_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getOnlineVADActionType(int index) {
            return this.onlineVADActionType_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getOnlineVADActionTypeCount() {
            return this.onlineVADActionType_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getOnlineVADActionTypeList() {
            return this.onlineVADActionType_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getOnlineVADRequest(int index) {
            return this.onlineVADRequest_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getOnlineVADRequestCount() {
            return this.onlineVADRequest_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getOnlineVADRequestList() {
            return this.onlineVADRequest_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getOnlineVADStartType(int index) {
            return this.onlineVADStartType_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getOnlineVADStartTypeCount() {
            return this.onlineVADStartType_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getOnlineVADStartTypeList() {
            return this.onlineVADStartType_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getPowerOff() {
            return this.powerOff_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getPowerOffBatteryValue() {
            return this.powerOffBatteryValue_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getPowerOnBatteryValue() {
            return this.powerOnBatteryValue_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getPressureautomeasure(int index) {
            return this.pressureautomeasure_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getPressureautomeasureCount() {
            return this.pressureautomeasure_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getPressureautomeasureList() {
            return this.pressureautomeasure_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getPressureinto() {
            return this.pressureinto_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getPressuremeasureresult(int index) {
            return this.pressuremeasureresult_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getPressuremeasureresultCount() {
            return this.pressuremeasureresult_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getPressuremeasureresultList() {
            return this.pressuremeasureresult_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getQNEgps() {
            return this.qNEgps_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getQNEinto() {
            return this.qNEinto_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getQuickAccessApp() {
            return this.quickAccessApp_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean getQuickEntryApp(int index) {
            return this.quickEntryApp_.getBoolean(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getQuickEntryAppCount() {
            return this.quickEntryApp_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Boolean> getQuickEntryAppList() {
            return this.quickEntryApp_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getRateabnormalreminder() {
            return this.rateabnormalreminder_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getRatemeasure(int index) {
            return this.ratemeasure_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getRatemeasureCount() {
            return this.ratemeasure_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getRatemeasureList() {
            return this.ratemeasure_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getRatewarnreminder() {
            return this.ratewarnreminder_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getRebootNum() {
            return this.rebootNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getRecoverymode() {
            return this.recoverymode_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getRemindershock() {
            return this.remindershock_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getReminderstand() {
            return this.reminderstand_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getReminderstandcomplete() {
            return this.reminderstandcomplete_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getRingreminder(int index) {
            return this.ringreminder_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getRingreminderCount() {
            return this.ringreminder_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getRingreminderList() {
            return this.ringreminder_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getScheduledelete(int index) {
            return this.scheduledelete_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getScheduledeleteCount() {
            return this.scheduledelete_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getScheduledeleteList() {
            return this.scheduledelete_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getScheduleedit() {
            return this.scheduleedit_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getSchedulereminderclick(int index) {
            return this.schedulereminderclick_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getSchedulereminderclickCount() {
            return this.schedulereminderclick_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getSchedulereminderclickList() {
            return this.schedulereminderclick_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getSeePAIexplain() {
            return this.seePAIexplain_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getSeePAIrate() {
            return this.seePAIrate_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getSetAlarm() {
            return this.setAlarm_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getSleepgoal() {
            return this.sleepgoal_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getSleepreminder() {
            return this.sleepreminder_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getSleepscreen() {
            return this.sleepscreen_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getSleepstop() {
            return this.sleepstop_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getSpo2Calc(int index) {
            return this.spo2Calc_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getSpo2CalcCount() {
            return this.spo2Calc_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getSpo2CalcList() {
            return this.spo2Calc_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getSportIndoorCalibrate(int index) {
            return this.sportIndoorCalibrate_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getSportIndoorCalibrateCount() {
            return this.sportIndoorCalibrate_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getSportIndoorCalibrateList() {
            return this.sportIndoorCalibrate_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public Event.SportStatusMessage getSportStatus(int index) {
            return this.sportStatus_.get(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getSportStatusCount() {
            return this.sportStatus_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Event.SportStatusMessage> getSportStatusList() {
            return this.sportStatus_;
        }

        public Event.SportStatusMessageOrBuilder getSportStatusOrBuilder(int index) {
            return this.sportStatus_.get(index);
        }

        public List<? extends Event.SportStatusMessageOrBuilder> getSportStatusOrBuilderList() {
            return this.sportStatus_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getSportremindersave() {
            return this.sportremindersave_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public Event.wifiuseMessage getStartwifi() {
            Event.wifiuseMessage wifiusemessage = this.startwifi_;
            return wifiusemessage == null ? Event.wifiuseMessage.getDefaultInstance() : wifiusemessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getStopwatchreset() {
            return this.stopwatchreset_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getStopwatchstart() {
            return this.stopwatchstart_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getSwimPoolLength() {
            return this.swimPoolLength_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean getSysVibration() {
            return this.sysVibration_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getSystemUpdateCancle() {
            return this.systemUpdateCancle_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getSystemUpdateImmediately() {
            return this.systemUpdateImmediately_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getTurnOnTheaterMode() {
            return this.turnOnTheaterMode_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getTurnOnkeepWatchAwake() {
            return this.turnOnkeepWatchAwake_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getUnlock(int index) {
            return this.unlock_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getUnlockCount() {
            return this.unlock_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getUnlockList() {
            return this.unlock_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getUpdataerrscreen(int index) {
            return this.updataerrscreen_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getUpdataerrscreenCount() {
            return this.updataerrscreen_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getUpdataerrscreenList() {
            return this.updataerrscreen_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getUpdataimmediatelyscreen(int index) {
            return this.updataimmediatelyscreen_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getUpdataimmediatelyscreenCount() {
            return this.updataimmediatelyscreen_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getUpdataimmediatelyscreenList() {
            return this.updataimmediatelyscreen_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getUpdateFail(int index) {
            return this.updateFail_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getUpdateFailCount() {
            return this.updateFail_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getUpdateFailList() {
            return this.updateFail_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getUpdatebyuser() {
            return this.updatebyuser_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getUseStopwatch() {
            return this.useStopwatch_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getUsecarcount(int index) {
            return this.usecarcount_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getUsecarcountCount() {
            return this.usecarcount_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public List<Integer> getUsecarcountList() {
            return this.usecarcount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getVolbycontrol() {
            return this.volbycontrol_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getVolbysetting() {
            return this.volbysetting_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getVolsetcount() {
            return this.volsetcount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean getWatchdir() {
            return this.watchdir_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getWifiTipspage() {
            return this.wifiTipspage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public int getWifipwdcorrect() {
            return this.wifipwdcorrect_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean getWristOffLockStatus() {
            return this.wristOffLockStatus_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasActivityTarget() {
            return (this.bitField1_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasActivityobjectives() {
            return (this.bitField3_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasAddCardSuccess() {
            return (this.bitField1_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasAlarmreminder() {
            return (this.bitField2_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasAlipayBindSuccessNum() {
            return (this.bitField0_ & 67108864) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasAplayscreen() {
            return (this.bitField3_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasAssistantVAD() {
            return (this.bitField3_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasAssistantcarid() {
            return (this.bitField3_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasAssistantinto() {
            return (this.bitField3_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasAutoLight() {
            return (this.bitField1_ & 8388608) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasAutoScreenOffTime() {
            return (this.bitField1_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasBaseRes() {
            return (this.bitField2_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasBatterySaverOff() {
            return (this.bitField1_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasBatterySaverOn() {
            return (this.bitField1_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasBindingSuccess() {
            return (this.bitField1_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasBindsetlanguage() {
            return (this.bitField3_ & Integer.MIN_VALUE) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasBleconnectclose() {
            return (this.bitField2_ & Integer.MIN_VALUE) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasBleconnectfail() {
            return (this.bitField2_ & 536870912) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasBleconnectsuccess() {
            return (this.bitField2_ & 268435456) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasBlelistclick() {
            return (this.bitField2_ & 1073741824) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasChangeBatteryValue() {
            return (this.bitField1_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasClosewifi() {
            return (this.bitField3_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasCompassCalibrateSuccessNum() {
            return (this.bitField0_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasCountDownTimeup() {
            return (this.bitField1_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasCoutdowntime() {
            return (this.bitField2_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasCurrentDialId() {
            return (this.bitField1_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasCurrentDialNum() {
            return (this.bitField1_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasDialchangemode() {
            return (this.bitField3_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasDialtool() {
            return (this.bitField2_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasDndMode() {
            return (this.bitField1_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasEnterCloudMusic() {
            return (this.bitField2_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasEnterLocalMusicFirstpage() {
            return (this.bitField2_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasEnterMusicViceScreen() {
            return (this.bitField2_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasEventTimeUp() {
            return (this.bitField0_ & 268435456) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasFatDosfsck() {
            return (this.bitField1_ & Integer.MIN_VALUE) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasFatDropsize() {
            return (this.bitField1_ & 268435456) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasFatDroptime() {
            return (this.bitField1_ & 536870912) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasFatFormat() {
            return (this.bitField1_ & 1073741824) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasFatFreesize() {
            return (this.bitField1_ & AMapEngineUtils.HALF_MAX_P20_WIDTH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasFindPhone() {
            return (this.bitField1_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasFindmoblie() {
            return (this.bitField3_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasFirmware() {
            return (this.bitField2_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasFont() {
            return (this.bitField2_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasForgetWristOffLockPasswd() {
            return (this.bitField0_ & Integer.MIN_VALUE) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasGotoActivityPage() {
            return (this.bitField0_ & 8388608) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasGotoAlarmPage() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasGotoCompassPage() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasGotoCountdownPage() {
            return (this.bitField0_ & 1048576) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasGotoDialActivityPage() {
            return (this.bitField0_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasGotoDialAlarmPage() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasGotoDialAlipayPage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasGotoDialEventPage() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasGotoDialHeartPage() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasGotoDialMusicPage() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasGotoDialNfcCadePage() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasGotoDialPaiPage() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasGotoDialSportPage() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasGotoDialWeatherPage() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasGotoEventPage() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasGotoHeartPage() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasGotoMusicPage() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasGotoNfcCardPage() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasGotoPaiPage() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasGotoSpO2Page() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasGotoSportHistory() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasGotoSportPage() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasGotoStopwatchPage() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasGotoWeatherPage() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasGotoWeatherSecondPage() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasGotosleep() {
            return (this.bitField3_ & 8388608) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasGotowakeup() {
            return (this.bitField3_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasHfpCallInAnswer() {
            return (this.bitField2_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasHfpCallInHangUp() {
            return (this.bitField2_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasHfpCallInIgnore() {
            return (this.bitField2_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasHfpCallOnHangUp() {
            return (this.bitField2_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasHfpCallOnMute() {
            return (this.bitField2_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasHfpCallOnSwitchPhone() {
            return (this.bitField2_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasHfpCallOnVolume() {
            return (this.bitField2_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasIncRes() {
            return (this.bitField2_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasLanguageselect() {
            return (this.bitField3_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfWrist() {
            return (this.bitField0_ & AMapEngineUtils.HALF_MAX_P20_WIDTH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfWristStatus() {
            return (this.bitField1_ & 1048576) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasLightscreentime() {
            return (this.bitField3_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasLightsetting() {
            return (this.bitField3_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasLocalMusicConnectBleDevice() {
            return (this.bitField2_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasLockScreen() {
            return (this.bitField1_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasNandMessage() {
            return (this.bitField1_ & 67108864) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasNobindrecovery() {
            return (this.bitField3_ & 536870912) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasNobindsupervise() {
            return (this.bitField3_ & 1073741824) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasPowerOff() {
            return (this.bitField1_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasPowerOffBatteryValue() {
            return (this.bitField1_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasPowerOnBatteryValue() {
            return (this.bitField1_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasPressureinto() {
            return (this.bitField3_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasQNEgps() {
            return (this.bitField2_ & AMapEngineUtils.HALF_MAX_P20_WIDTH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasQNEinto() {
            return (this.bitField2_ & 67108864) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasQuickAccessApp() {
            return (this.bitField1_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasRateabnormalreminder() {
            return (this.bitField3_ & 1048576) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasRatewarnreminder() {
            return (this.bitField3_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasRebootNum() {
            return (this.bitField1_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasRecoverymode() {
            return (this.bitField2_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasRemindershock() {
            return (this.bitField2_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasReminderstand() {
            return (this.bitField2_ & 1048576) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasReminderstandcomplete() {
            return (this.bitField2_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasScheduleedit() {
            return (this.bitField3_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasSeePAIexplain() {
            return (this.bitField2_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasSeePAIrate() {
            return (this.bitField2_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasSetAlarm() {
            return (this.bitField0_ & 536870912) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasSleepgoal() {
            return (this.bitField3_ & 67108864) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasSleepreminder() {
            return (this.bitField3_ & 268435456) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasSleepscreen() {
            return (this.bitField3_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasSleepstop() {
            return (this.bitField3_ & AMapEngineUtils.HALF_MAX_P20_WIDTH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasSportremindersave() {
            return (this.bitField4_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasStartwifi() {
            return (this.bitField3_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasStopwatchreset() {
            return (this.bitField3_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasStopwatchstart() {
            return (this.bitField3_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasSwimPoolLength() {
            return (this.bitField1_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasSysVibration() {
            return (this.bitField3_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasSystemUpdateCancle() {
            return (this.bitField1_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasSystemUpdateImmediately() {
            return (this.bitField1_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasTurnOnTheaterMode() {
            return (this.bitField1_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasTurnOnkeepWatchAwake() {
            return (this.bitField1_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasUpdatebyuser() {
            return (this.bitField4_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasUseStopwatch() {
            return (this.bitField0_ & 1073741824) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasVolbycontrol() {
            return (this.bitField2_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasVolbysetting() {
            return (this.bitField3_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasVolsetcount() {
            return (this.bitField2_ & 8388608) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasWatchdir() {
            return (this.bitField3_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasWifiTipspage() {
            return (this.bitField3_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasWifipwdcorrect() {
            return (this.bitField3_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonEventMessageOrBuilder
        public boolean hasWristOffLockStatus() {
            return (this.bitField1_ & 2097152) != 0;
        }

        public static Builder newBuilder(lisbonEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static lisbonEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (lisbonEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static lisbonEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (lisbonEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static lisbonEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (lisbonEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addNotify(int index, Event.NotifyMessage value) {
            value.getClass();
            ensureNotifyIsMutable();
            this.notify_.add(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSportStatus(int index, Event.SportStatusMessage value) {
            value.getClass();
            ensureSportStatusIsMutable();
            this.sportStatus_.add(index, value);
        }

        public static lisbonEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (lisbonEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static lisbonEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (lisbonEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static lisbonEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (lisbonEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static lisbonEventMessage parseFrom(InputStream input) throws IOException {
            return (lisbonEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static lisbonEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (lisbonEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static lisbonEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (lisbonEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static lisbonEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (lisbonEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface lisbonEventMessageOrBuilder extends MessageLiteOrBuilder {
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

        int getCloudMusicPlayBackFolder(int index);

        int getCloudMusicPlayBackFolderCount();

        List<Integer> getCloudMusicPlayBackFolderList();

        int getCloudMusicPlayMode(int index);

        int getCloudMusicPlayModeCount();

        List<Integer> getCloudMusicPlayModeList();

        int getCompassCalibrateSuccessNum();

        int getCountDownTimeup();

        int getCoutdowntime();

        int getCurrentDialId();

        int getCurrentDialNum();

        int getDialchangemode();

        Event.DialtoolMessage getDialtool();

        Event.DndEventMessage getDndMode();

        int getEnterCloudMusic();

        int getEnterLocalMusicFirstpage();

        int getEnterMusicViceScreen();

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

        int getHfpCallInAnswer();

        int getHfpCallInHangUp();

        int getHfpCallInIgnore();

        int getHfpCallOnHangUp();

        int getHfpCallOnMute();

        int getHfpCallOnSwitchPhone();

        int getHfpCallOnVolume();

        Event.DfuUpgradeMessage getIncRes();

        int getLanguageselect();

        int getLcdOff(int index);

        int getLcdOffCount();

        List<Integer> getLcdOffList();

        int getLcdOnBecauseOfWrist();

        int getLcdOnBecauseOfWristStatus();

        Event.lightscreentimeMessage getLightscreentime();

        int getLightsetting();

        int getLocalMusicAudioSource(int index);

        int getLocalMusicAudioSourceCount();

        List<Integer> getLocalMusicAudioSourceList();

        int getLocalMusicConnectBleDevice();

        int getLocalMusicLoopButton(int index);

        int getLocalMusicLoopButtonCount();

        List<Integer> getLocalMusicLoopButtonList();

        int getLocalMusicLoopMode(int index);

        int getLocalMusicLoopModeCount();

        List<Integer> getLocalMusicLoopModeList();

        int getLocalMusicPlaybackButton(int index);

        int getLocalMusicPlaybackButtonCount();

        List<Integer> getLocalMusicPlaybackButtonList();

        int getLocalMusicSongSource(int index);

        int getLocalMusicSongSourceCount();

        List<Integer> getLocalMusicSongSourceList();

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

        List<Event.NotifyMessage> getNotifyList();

        int getOfflineAsrCmd(int index);

        int getOfflineAsrCmdCount();

        List<Integer> getOfflineAsrCmdList();

        int getOfflineAsrFailOrSuccess(int index);

        int getOfflineAsrFailOrSuccessCount();

        List<Integer> getOfflineAsrFailOrSuccessList();

        int getOfflineAsrModeInto(int index);

        int getOfflineAsrModeIntoCount();

        List<Integer> getOfflineAsrModeIntoList();

        int getOfflineAsrModeSelect(int index);

        int getOfflineAsrModeSelectCount();

        List<Integer> getOfflineAsrModeSelectList();

        int getOffwristlock(int index);

        int getOffwristlockCount();

        List<Integer> getOffwristlockList();

        int getOnlineVADActionType(int index);

        int getOnlineVADActionTypeCount();

        List<Integer> getOnlineVADActionTypeList();

        int getOnlineVADRequest(int index);

        int getOnlineVADRequestCount();

        List<Integer> getOnlineVADRequestList();

        int getOnlineVADStartType(int index);

        int getOnlineVADStartTypeCount();

        List<Integer> getOnlineVADStartTypeList();

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

        boolean hasEnterCloudMusic();

        boolean hasEnterLocalMusicFirstpage();

        boolean hasEnterMusicViceScreen();

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

        boolean hasHfpCallInAnswer();

        boolean hasHfpCallInHangUp();

        boolean hasHfpCallInIgnore();

        boolean hasHfpCallOnHangUp();

        boolean hasHfpCallOnMute();

        boolean hasHfpCallOnSwitchPhone();

        boolean hasHfpCallOnVolume();

        boolean hasIncRes();

        boolean hasLanguageselect();

        boolean hasLcdOnBecauseOfWrist();

        boolean hasLcdOnBecauseOfWristStatus();

        boolean hasLightscreentime();

        boolean hasLightsetting();

        boolean hasLocalMusicConnectBleDevice();

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

    public static final class lisbonStatisticsMessage extends GeneratedMessageLite<lisbonStatisticsMessage, Builder> implements lisbonStatisticsMessageOrBuilder {
        public static final int BACKLIGHTLEVEL_FIELD_NUMBER = 3;
        public static final int BASE_FIELD_NUMBER = 1;
        private static final lisbonStatisticsMessage DEFAULT_INSTANCE;
        public static final int EVENT_FIELD_NUMBER = 4;
        public static final int NFC_FIELD_NUMBER = 5;
        private static volatile Parser<lisbonStatisticsMessage> PARSER = null;
        public static final int SILENCEMODE_FIELD_NUMBER = 2;
        private int backlightLevel_;
        private StatisBase.StatisBaseMessage base_;
        private int bitField0_;
        private lisbonEventMessage event_;
        private byte memoizedIsInitialized = 2;
        private Nfc.NfcMessage nfc_;
        private int silenceMode_;

        public static final class Builder extends GeneratedMessageLite.Builder<lisbonStatisticsMessage, Builder> implements lisbonStatisticsMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBacklightLevel() {
                copyOnWrite();
                ((lisbonStatisticsMessage) this.instance).clearBacklightLevel();
                return this;
            }

            public Builder clearBase() {
                copyOnWrite();
                ((lisbonStatisticsMessage) this.instance).clearBase();
                return this;
            }

            public Builder clearEvent() {
                copyOnWrite();
                ((lisbonStatisticsMessage) this.instance).clearEvent();
                return this;
            }

            public Builder clearNfc() {
                copyOnWrite();
                ((lisbonStatisticsMessage) this.instance).clearNfc();
                return this;
            }

            public Builder clearSilenceMode() {
                copyOnWrite();
                ((lisbonStatisticsMessage) this.instance).clearSilenceMode();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonStatisticsMessageOrBuilder
            public int getBacklightLevel() {
                return ((lisbonStatisticsMessage) this.instance).getBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonStatisticsMessageOrBuilder
            public StatisBase.StatisBaseMessage getBase() {
                return ((lisbonStatisticsMessage) this.instance).getBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonStatisticsMessageOrBuilder
            public lisbonEventMessage getEvent() {
                return ((lisbonStatisticsMessage) this.instance).getEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonStatisticsMessageOrBuilder
            public Nfc.NfcMessage getNfc() {
                return ((lisbonStatisticsMessage) this.instance).getNfc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonStatisticsMessageOrBuilder
            public SilenceModeOuterClass.SilenceMode getSilenceMode() {
                return ((lisbonStatisticsMessage) this.instance).getSilenceMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonStatisticsMessageOrBuilder
            public boolean hasBacklightLevel() {
                return ((lisbonStatisticsMessage) this.instance).hasBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonStatisticsMessageOrBuilder
            public boolean hasBase() {
                return ((lisbonStatisticsMessage) this.instance).hasBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonStatisticsMessageOrBuilder
            public boolean hasEvent() {
                return ((lisbonStatisticsMessage) this.instance).hasEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonStatisticsMessageOrBuilder
            public boolean hasNfc() {
                return ((lisbonStatisticsMessage) this.instance).hasNfc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonStatisticsMessageOrBuilder
            public boolean hasSilenceMode() {
                return ((lisbonStatisticsMessage) this.instance).hasSilenceMode();
            }

            public Builder mergeBase(StatisBase.StatisBaseMessage value) {
                copyOnWrite();
                ((lisbonStatisticsMessage) this.instance).mergeBase(value);
                return this;
            }

            public Builder mergeEvent(lisbonEventMessage value) {
                copyOnWrite();
                ((lisbonStatisticsMessage) this.instance).mergeEvent(value);
                return this;
            }

            public Builder mergeNfc(Nfc.NfcMessage value) {
                copyOnWrite();
                ((lisbonStatisticsMessage) this.instance).mergeNfc(value);
                return this;
            }

            public Builder setBacklightLevel(int value) {
                copyOnWrite();
                ((lisbonStatisticsMessage) this.instance).setBacklightLevel(value);
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage value) {
                copyOnWrite();
                ((lisbonStatisticsMessage) this.instance).setBase(value);
                return this;
            }

            public Builder setEvent(lisbonEventMessage value) {
                copyOnWrite();
                ((lisbonStatisticsMessage) this.instance).setEvent(value);
                return this;
            }

            public Builder setNfc(Nfc.NfcMessage value) {
                copyOnWrite();
                ((lisbonStatisticsMessage) this.instance).setNfc(value);
                return this;
            }

            public Builder setSilenceMode(SilenceModeOuterClass.SilenceMode value) {
                copyOnWrite();
                ((lisbonStatisticsMessage) this.instance).setSilenceMode(value);
                return this;
            }

            private Builder() {
                super(lisbonStatisticsMessage.DEFAULT_INSTANCE);
            }

            public Builder setBase(StatisBase.StatisBaseMessage.Builder builderForValue) {
                copyOnWrite();
                ((lisbonStatisticsMessage) this.instance).setBase(builderForValue.build());
                return this;
            }

            public Builder setEvent(lisbonEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((lisbonStatisticsMessage) this.instance).setEvent(builderForValue.build());
                return this;
            }

            public Builder setNfc(Nfc.NfcMessage.Builder builderForValue) {
                copyOnWrite();
                ((lisbonStatisticsMessage) this.instance).setNfc(builderForValue.build());
                return this;
            }
        }

        static {
            lisbonStatisticsMessage lisbonstatisticsmessage = new lisbonStatisticsMessage();
            DEFAULT_INSTANCE = lisbonstatisticsmessage;
            GeneratedMessageLite.registerDefaultInstance(lisbonStatisticsMessage.class, lisbonstatisticsmessage);
        }

        private lisbonStatisticsMessage() {
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

        public static lisbonStatisticsMessage getDefaultInstance() {
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
        public void mergeEvent(lisbonEventMessage value) {
            value.getClass();
            lisbonEventMessage lisboneventmessage = this.event_;
            if (lisboneventmessage == null || lisboneventmessage == lisbonEventMessage.getDefaultInstance()) {
                this.event_ = value;
            } else {
                this.event_ = lisbonEventMessage.newBuilder(this.event_).mergeFrom(value).buildPartial();
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

        public static lisbonStatisticsMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (lisbonStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static lisbonStatisticsMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (lisbonStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<lisbonStatisticsMessage> parser() {
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
        public void setEvent(lisbonEventMessage value) {
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
                    return new lisbonStatisticsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001ᔉ\u0000\u0002ᔌ\u0001\u0003ᔋ\u0002\u0004ᔉ\u0003\u0005ᐉ\u0004", new Object[]{"bitField0_", "base_", "silenceMode_", SilenceModeOuterClass.SilenceMode.internalGetVerifier(), "backlightLevel_", "event_", "nfc_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<lisbonStatisticsMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (lisbonStatisticsMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonStatisticsMessageOrBuilder
        public int getBacklightLevel() {
            return this.backlightLevel_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonStatisticsMessageOrBuilder
        public StatisBase.StatisBaseMessage getBase() {
            StatisBase.StatisBaseMessage statisBaseMessage = this.base_;
            return statisBaseMessage == null ? StatisBase.StatisBaseMessage.getDefaultInstance() : statisBaseMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonStatisticsMessageOrBuilder
        public lisbonEventMessage getEvent() {
            lisbonEventMessage lisboneventmessage = this.event_;
            return lisboneventmessage == null ? lisbonEventMessage.getDefaultInstance() : lisboneventmessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonStatisticsMessageOrBuilder
        public Nfc.NfcMessage getNfc() {
            Nfc.NfcMessage nfcMessage = this.nfc_;
            return nfcMessage == null ? Nfc.NfcMessage.getDefaultInstance() : nfcMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonStatisticsMessageOrBuilder
        public SilenceModeOuterClass.SilenceMode getSilenceMode() {
            SilenceModeOuterClass.SilenceMode silenceModeForNumber = SilenceModeOuterClass.SilenceMode.forNumber(this.silenceMode_);
            return silenceModeForNumber == null ? SilenceModeOuterClass.SilenceMode.OFF : silenceModeForNumber;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonStatisticsMessageOrBuilder
        public boolean hasBacklightLevel() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonStatisticsMessageOrBuilder
        public boolean hasBase() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonStatisticsMessageOrBuilder
        public boolean hasEvent() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonStatisticsMessageOrBuilder
        public boolean hasNfc() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Lisbon.lisbonStatisticsMessageOrBuilder
        public boolean hasSilenceMode() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(lisbonStatisticsMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static lisbonStatisticsMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (lisbonStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static lisbonStatisticsMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (lisbonStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static lisbonStatisticsMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (lisbonStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static lisbonStatisticsMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (lisbonStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static lisbonStatisticsMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (lisbonStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static lisbonStatisticsMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (lisbonStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static lisbonStatisticsMessage parseFrom(InputStream input) throws IOException {
            return (lisbonStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static lisbonStatisticsMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (lisbonStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static lisbonStatisticsMessage parseFrom(CodedInputStream input) throws IOException {
            return (lisbonStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static lisbonStatisticsMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (lisbonStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface lisbonStatisticsMessageOrBuilder extends MessageLiteOrBuilder {
        int getBacklightLevel();

        StatisBase.StatisBaseMessage getBase();

        lisbonEventMessage getEvent();

        Nfc.NfcMessage getNfc();

        SilenceModeOuterClass.SilenceMode getSilenceMode();

        boolean hasBacklightLevel();

        boolean hasBase();

        boolean hasEvent();

        boolean hasNfc();

        boolean hasSilenceMode();
    }

    private Lisbon() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }
}
