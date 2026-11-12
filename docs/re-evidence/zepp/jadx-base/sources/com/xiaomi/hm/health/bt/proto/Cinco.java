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
public final class Cinco {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.Cinco$1, reason: invalid class name */
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

    public static final class CincoEventMessage extends GeneratedMessageLite<CincoEventMessage, Builder> implements CincoEventMessageOrBuilder {
        public static final int ACTIVECARDFAILCOUNT_FIELD_NUMBER = 40;
        public static final int ACTIVECARDSUCCESSCOUNT_FIELD_NUMBER = 39;
        public static final int ALARMFROMXIAOAI_FIELD_NUMBER = 48;
        public static final int ALARMLISTCOUNT_FIELD_NUMBER = 25;
        public static final int ALARMPAGEBACKCOUNT_FIELD_NUMBER = 28;
        public static final int ALARMPAGECOUNT_FIELD_NUMBER = 64;
        public static final int ALARMPAGELAZYCOUNT_FIELD_NUMBER = 26;
        public static final int ALARMPAGEOFFCOUNT_FIELD_NUMBER = 27;
        public static final int ALIPAYCODE128COUNT_FIELD_NUMBER = 43;
        public static final int ALIPAYPAGECOUNT_FIELD_NUMBER = 41;
        public static final int ALIPAYQRCODECOUNT_FIELD_NUMBER = 42;
        public static final int CALLHANGCOUNT_FIELD_NUMBER = 62;
        public static final int CALLIGNORECOUNT_FIELD_NUMBER = 61;
        public static final int CARDPAGECOUNT_FIELD_NUMBER = 38;
        public static final int CARENOTIFYCOUNT_FIELD_NUMBER = 73;
        public static final int CLICKKEYINSPORTCOUNT_FIELD_NUMBER = 53;
        public static final int CLICKTOUCHINSPORTCOUNT_FIELD_NUMBER = 52;
        public static final int COUNTDOWNCOUNT_FIELD_NUMBER = 33;
        public static final int COUNTDOWNFROMXIAOAI_FIELD_NUMBER = 50;
        public static final int CUSTOMOFXIAOAI_FIELD_NUMBER = 51;
        public static final int CYCLINGCOUNT_FIELD_NUMBER = 11;
        private static final CincoEventMessage DEFAULT_INSTANCE;
        public static final int DIAL2XIAOAI_FIELD_NUMBER = 4;
        public static final int DIALID_FIELD_NUMBER = 79;
        public static final int EMAILNOTIFYCOUNT_FIELD_NUMBER = 69;
        public static final int EXERCISECOUNT_FIELD_NUMBER = 13;
        public static final int FACTORYPAGECOUNT_FIELD_NUMBER = 44;
        public static final int FINDPHONECOUNT_FIELD_NUMBER = 36;
        public static final int HEARTRATEDETAILS_FIELD_NUMBER = 7;
        public static final int HEARTRATEFAILPAGE_FIELD_NUMBER = 8;
        public static final int HIGHHEARTRATENOTIFYCOUNT_FIELD_NUMBER = 77;
        public static final int INDOORRUNNINGCOUNT_FIELD_NUMBER = 10;
        public static final int LCDONBECAUSEOFEVENT_FIELD_NUMBER = 2;
        public static final int LCDONBECAUSEOFNOTIFY_FIELD_NUMBER = 3;
        public static final int LCDONBECAUSEOFPRESS_FIELD_NUMBER = 1;
        public static final int LONGPRESSKEYINSPORTCOUNT_FIELD_NUMBER = 56;
        public static final int LONGPRESSTOUCHINSPORTCOUNT_FIELD_NUMBER = 55;
        public static final int MISSCALLCOUNT_FIELD_NUMBER = 67;
        public static final int MORELISTPAGE_FIELD_NUMBER = 20;
        public static final int MSMNOTIFYCOUNT_FIELD_NUMBER = 68;
        public static final int MUSICNEXTCOUNT_FIELD_NUMBER = 31;
        public static final int MUSICPAGECOUNT_FIELD_NUMBER = 29;
        public static final int MUSICVOLUMECOUNT_FIELD_NUMBER = 30;
        public static final int NOTIFYDETAILS_FIELD_NUMBER = 19;
        public static final int OPENLCDAFTERNOTIF_FIELD_NUMBER = 63;
        public static final int OUTSIDERUNNINGCOUNT_FIELD_NUMBER = 9;
        public static final int PAIDETAILS_FIELD_NUMBER = 81;
        public static final int PAIENTRANCE_FIELD_NUMBER = 80;
        public static final int PAIINFO_FIELD_NUMBER = 82;
        private static volatile Parser<CincoEventMessage> PARSER = null;
        public static final int PASSWORDFACTORYCOUNT_FIELD_NUMBER = 45;
        public static final int PASSWORDPAGECOUNT_FIELD_NUMBER = 46;
        public static final int PHONEALARMNOTIFYCOUNT_FIELD_NUMBER = 76;
        public static final int PHONESILENCEBELL_FIELD_NUMBER = 60;
        public static final int PHONESILENCECOUNT_FIELD_NUMBER = 37;
        public static final int PHONESILENCEMUTECOUNT_FIELD_NUMBER = 59;
        public static final int REACHNOTIFYCOUNT_FIELD_NUMBER = 74;
        public static final int REDBAGNOTIFYCOUNT_FIELD_NUMBER = 75;
        public static final int REMINDFROMXIAOAI_FIELD_NUMBER = 47;
        public static final int REMINDNOTIFYCOUNT_FIELD_NUMBER = 71;
        public static final int RIGHTSLIDINGINSPORTCOUNT_FIELD_NUMBER = 54;
        public static final int SEDENTARYEXPLAINPAGE_FIELD_NUMBER = 6;
        public static final int SILENCENORMALMODECOUNT_FIELD_NUMBER = 23;
        public static final int SILENCEOFFMODECOUNT_FIELD_NUMBER = 24;
        public static final int SILENCEPAGECOUNT_FIELD_NUMBER = 21;
        public static final int SILENCESMARTMODECOUNT_FIELD_NUMBER = 22;
        public static final int SKIPGPSLOCATIONCOUNT_FIELD_NUMBER = 58;
        public static final int SPORTDISCONNECTCOUNT_FIELD_NUMBER = 15;
        public static final int SPORTSCREENCOUNT_FIELD_NUMBER = 16;
        public static final int SPORTSCREENDISCONNECTCOUNT_FIELD_NUMBER = 17;
        public static final int STATUSDETAILS_FIELD_NUMBER = 5;
        public static final int STOPWATCHCOUNT_FIELD_NUMBER = 32;
        public static final int STOPWATCHMARKCOUNT_FIELD_NUMBER = 34;
        public static final int STOPWATCHMARKDISCOUNT_FIELD_NUMBER = 35;
        public static final int SWIMMINGCOUNT_FIELD_NUMBER = 14;
        public static final int WAITGPSLOCATIONCOUNT_FIELD_NUMBER = 57;
        public static final int WALKINGCOUNT_FIELD_NUMBER = 12;
        public static final int WEATHERDETAILS_FIELD_NUMBER = 18;
        public static final int WEATHERFROMXIAOAI_FIELD_NUMBER = 49;
        public static final int WEATHERNOTIFYCOUNT_FIELD_NUMBER = 70;
        private int activeCardFailCount_;
        private int activeCardSuccessCount_;
        private int alarmFromXiaoai_;
        private int alarmListCount_;
        private int alarmPageBackCount_;
        private int alarmPageCount_;
        private int alarmPageLazyCount_;
        private int alarmPageOffCount_;
        private int alipayCode128Count_;
        private int alipayPageCount_;
        private int alipayQRCodeCount_;
        private int bitField0_;
        private int bitField1_;
        private int bitField2_;
        private int callHangCount_;
        private int callIgnoreCount_;
        private int cardPageCount_;
        private int careNotifyCount_;
        private int clickKeyInSportCount_;
        private int clickTouchInSportCount_;
        private int countdownCount_;
        private int countdownFromXiaoai_;
        private int customOfXiaoai_;
        private int cyclingCount_;
        private int dial2Xiaoai_;
        private int dialId_;
        private int eMAILNotifyCount_;
        private int exerciseCount_;
        private int factoryPageCount_;
        private int findPhoneCount_;
        private int heartrateDetails_;
        private int heartrateFailPage_;
        private int highHeartrateNotifyCount_;
        private int indoorRunningCount_;
        private int lcdOnBecauseOfEvent_;
        private int lcdOnBecauseOfNotify_;
        private int lcdOnBecauseOfPress_;
        private int longpressKeyInSportCount_;
        private int longpressTouchInSportCount_;
        private int mSMNotifyCount_;
        private byte memoizedIsInitialized = 2;
        private int missCallCount_;
        private int moreListPage_;
        private int musicNextCount_;
        private int musicPageCount_;
        private int musicVolumeCount_;
        private int notifyDetails_;
        private int openLcdAfterNotif_;
        private int outsideRunningCount_;
        private int paiDetails_;
        private int paiEntrance_;
        private int paiInfo_;
        private int passwordFactoryCount_;
        private int passwordPageCount_;
        private int phoneAlarmNotifyCount_;
        private int phoneSilenceBell_;
        private int phoneSilenceCount_;
        private int phoneSilenceMuteCount_;
        private int reachNotifyCount_;
        private int redBagNotifyCount_;
        private int remindFromXiaoai_;
        private int remindNotifyCount_;
        private int rightSlidingInSportCount_;
        private int sedentaryExplainPage_;
        private int silenceNormalModeCount_;
        private int silenceOffModeCount_;
        private int silencePageCount_;
        private int silenceSmartModeCount_;
        private int skipGpsLocationCount_;
        private int sportDisconnectCount_;
        private int sportScreenCount_;
        private int sportScreenDisconnectCount_;
        private int statusDetails_;
        private int stopwatchCount_;
        private int stopwatchMarkCount_;
        private int stopwatchMarkDisCount_;
        private int swimmingCount_;
        private int waitGpsLocationCount_;
        private int walkingCount_;
        private int weatherDetails_;
        private int weatherFromXiaoai_;
        private int weatherNotifyCount_;

        public static final class Builder extends GeneratedMessageLite.Builder<CincoEventMessage, Builder> implements CincoEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearActiveCardFailCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearActiveCardFailCount();
                return this;
            }

            public Builder clearActiveCardSuccessCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearActiveCardSuccessCount();
                return this;
            }

            public Builder clearAlarmFromXiaoai() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearAlarmFromXiaoai();
                return this;
            }

            public Builder clearAlarmListCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearAlarmListCount();
                return this;
            }

            public Builder clearAlarmPageBackCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearAlarmPageBackCount();
                return this;
            }

            public Builder clearAlarmPageCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearAlarmPageCount();
                return this;
            }

            public Builder clearAlarmPageLazyCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearAlarmPageLazyCount();
                return this;
            }

            public Builder clearAlarmPageOffCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearAlarmPageOffCount();
                return this;
            }

            public Builder clearAlipayCode128Count() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearAlipayCode128Count();
                return this;
            }

            public Builder clearAlipayPageCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearAlipayPageCount();
                return this;
            }

            public Builder clearAlipayQRCodeCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearAlipayQRCodeCount();
                return this;
            }

            public Builder clearCallHangCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearCallHangCount();
                return this;
            }

            public Builder clearCallIgnoreCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearCallIgnoreCount();
                return this;
            }

            public Builder clearCardPageCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearCardPageCount();
                return this;
            }

            public Builder clearCareNotifyCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearCareNotifyCount();
                return this;
            }

            public Builder clearClickKeyInSportCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearClickKeyInSportCount();
                return this;
            }

            public Builder clearClickTouchInSportCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearClickTouchInSportCount();
                return this;
            }

            public Builder clearCountdownCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearCountdownCount();
                return this;
            }

            public Builder clearCountdownFromXiaoai() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearCountdownFromXiaoai();
                return this;
            }

            public Builder clearCustomOfXiaoai() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearCustomOfXiaoai();
                return this;
            }

            public Builder clearCyclingCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearCyclingCount();
                return this;
            }

            public Builder clearDial2Xiaoai() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearDial2Xiaoai();
                return this;
            }

            public Builder clearDialId() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearDialId();
                return this;
            }

            public Builder clearEMAILNotifyCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearEMAILNotifyCount();
                return this;
            }

            public Builder clearExerciseCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearExerciseCount();
                return this;
            }

            public Builder clearFactoryPageCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearFactoryPageCount();
                return this;
            }

            public Builder clearFindPhoneCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearFindPhoneCount();
                return this;
            }

            public Builder clearHeartrateDetails() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearHeartrateDetails();
                return this;
            }

            public Builder clearHeartrateFailPage() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearHeartrateFailPage();
                return this;
            }

            public Builder clearHighHeartrateNotifyCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearHighHeartrateNotifyCount();
                return this;
            }

            public Builder clearIndoorRunningCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearIndoorRunningCount();
                return this;
            }

            public Builder clearLcdOnBecauseOfEvent() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearLcdOnBecauseOfEvent();
                return this;
            }

            public Builder clearLcdOnBecauseOfNotify() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearLcdOnBecauseOfNotify();
                return this;
            }

            public Builder clearLcdOnBecauseOfPress() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearLcdOnBecauseOfPress();
                return this;
            }

            public Builder clearLongpressKeyInSportCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearLongpressKeyInSportCount();
                return this;
            }

            public Builder clearLongpressTouchInSportCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearLongpressTouchInSportCount();
                return this;
            }

            public Builder clearMSMNotifyCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearMSMNotifyCount();
                return this;
            }

            public Builder clearMissCallCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearMissCallCount();
                return this;
            }

            public Builder clearMoreListPage() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearMoreListPage();
                return this;
            }

            public Builder clearMusicNextCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearMusicNextCount();
                return this;
            }

            public Builder clearMusicPageCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearMusicPageCount();
                return this;
            }

            public Builder clearMusicVolumeCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearMusicVolumeCount();
                return this;
            }

            public Builder clearNotifyDetails() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearNotifyDetails();
                return this;
            }

            public Builder clearOpenLcdAfterNotif() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearOpenLcdAfterNotif();
                return this;
            }

            public Builder clearOutsideRunningCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearOutsideRunningCount();
                return this;
            }

            public Builder clearPaiDetails() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearPaiDetails();
                return this;
            }

            public Builder clearPaiEntrance() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearPaiEntrance();
                return this;
            }

            public Builder clearPaiInfo() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearPaiInfo();
                return this;
            }

            public Builder clearPasswordFactoryCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearPasswordFactoryCount();
                return this;
            }

            public Builder clearPasswordPageCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearPasswordPageCount();
                return this;
            }

            public Builder clearPhoneAlarmNotifyCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearPhoneAlarmNotifyCount();
                return this;
            }

            public Builder clearPhoneSilenceBell() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearPhoneSilenceBell();
                return this;
            }

            public Builder clearPhoneSilenceCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearPhoneSilenceCount();
                return this;
            }

            public Builder clearPhoneSilenceMuteCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearPhoneSilenceMuteCount();
                return this;
            }

            public Builder clearReachNotifyCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearReachNotifyCount();
                return this;
            }

            public Builder clearRedBagNotifyCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearRedBagNotifyCount();
                return this;
            }

            public Builder clearRemindFromXiaoai() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearRemindFromXiaoai();
                return this;
            }

            public Builder clearRemindNotifyCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearRemindNotifyCount();
                return this;
            }

            public Builder clearRightSlidingInSportCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearRightSlidingInSportCount();
                return this;
            }

            public Builder clearSedentaryExplainPage() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearSedentaryExplainPage();
                return this;
            }

            public Builder clearSilenceNormalModeCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearSilenceNormalModeCount();
                return this;
            }

            public Builder clearSilenceOffModeCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearSilenceOffModeCount();
                return this;
            }

            public Builder clearSilencePageCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearSilencePageCount();
                return this;
            }

            public Builder clearSilenceSmartModeCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearSilenceSmartModeCount();
                return this;
            }

            public Builder clearSkipGpsLocationCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearSkipGpsLocationCount();
                return this;
            }

            public Builder clearSportDisconnectCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearSportDisconnectCount();
                return this;
            }

            public Builder clearSportScreenCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearSportScreenCount();
                return this;
            }

            public Builder clearSportScreenDisconnectCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearSportScreenDisconnectCount();
                return this;
            }

            public Builder clearStatusDetails() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearStatusDetails();
                return this;
            }

            public Builder clearStopwatchCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearStopwatchCount();
                return this;
            }

            public Builder clearStopwatchMarkCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearStopwatchMarkCount();
                return this;
            }

            public Builder clearStopwatchMarkDisCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearStopwatchMarkDisCount();
                return this;
            }

            public Builder clearSwimmingCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearSwimmingCount();
                return this;
            }

            public Builder clearWaitGpsLocationCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearWaitGpsLocationCount();
                return this;
            }

            public Builder clearWalkingCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearWalkingCount();
                return this;
            }

            public Builder clearWeatherDetails() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearWeatherDetails();
                return this;
            }

            public Builder clearWeatherFromXiaoai() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearWeatherFromXiaoai();
                return this;
            }

            public Builder clearWeatherNotifyCount() {
                copyOnWrite();
                ((CincoEventMessage) this.instance).clearWeatherNotifyCount();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getActiveCardFailCount() {
                return ((CincoEventMessage) this.instance).getActiveCardFailCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getActiveCardSuccessCount() {
                return ((CincoEventMessage) this.instance).getActiveCardSuccessCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getAlarmFromXiaoai() {
                return ((CincoEventMessage) this.instance).getAlarmFromXiaoai();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getAlarmListCount() {
                return ((CincoEventMessage) this.instance).getAlarmListCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getAlarmPageBackCount() {
                return ((CincoEventMessage) this.instance).getAlarmPageBackCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getAlarmPageCount() {
                return ((CincoEventMessage) this.instance).getAlarmPageCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getAlarmPageLazyCount() {
                return ((CincoEventMessage) this.instance).getAlarmPageLazyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getAlarmPageOffCount() {
                return ((CincoEventMessage) this.instance).getAlarmPageOffCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getAlipayCode128Count() {
                return ((CincoEventMessage) this.instance).getAlipayCode128Count();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getAlipayPageCount() {
                return ((CincoEventMessage) this.instance).getAlipayPageCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getAlipayQRCodeCount() {
                return ((CincoEventMessage) this.instance).getAlipayQRCodeCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getCallHangCount() {
                return ((CincoEventMessage) this.instance).getCallHangCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getCallIgnoreCount() {
                return ((CincoEventMessage) this.instance).getCallIgnoreCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getCardPageCount() {
                return ((CincoEventMessage) this.instance).getCardPageCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getCareNotifyCount() {
                return ((CincoEventMessage) this.instance).getCareNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getClickKeyInSportCount() {
                return ((CincoEventMessage) this.instance).getClickKeyInSportCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getClickTouchInSportCount() {
                return ((CincoEventMessage) this.instance).getClickTouchInSportCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getCountdownCount() {
                return ((CincoEventMessage) this.instance).getCountdownCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getCountdownFromXiaoai() {
                return ((CincoEventMessage) this.instance).getCountdownFromXiaoai();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getCustomOfXiaoai() {
                return ((CincoEventMessage) this.instance).getCustomOfXiaoai();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getCyclingCount() {
                return ((CincoEventMessage) this.instance).getCyclingCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getDial2Xiaoai() {
                return ((CincoEventMessage) this.instance).getDial2Xiaoai();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getDialId() {
                return ((CincoEventMessage) this.instance).getDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getEMAILNotifyCount() {
                return ((CincoEventMessage) this.instance).getEMAILNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getExerciseCount() {
                return ((CincoEventMessage) this.instance).getExerciseCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getFactoryPageCount() {
                return ((CincoEventMessage) this.instance).getFactoryPageCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getFindPhoneCount() {
                return ((CincoEventMessage) this.instance).getFindPhoneCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getHeartrateDetails() {
                return ((CincoEventMessage) this.instance).getHeartrateDetails();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getHeartrateFailPage() {
                return ((CincoEventMessage) this.instance).getHeartrateFailPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getHighHeartrateNotifyCount() {
                return ((CincoEventMessage) this.instance).getHighHeartrateNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getIndoorRunningCount() {
                return ((CincoEventMessage) this.instance).getIndoorRunningCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getLcdOnBecauseOfEvent() {
                return ((CincoEventMessage) this.instance).getLcdOnBecauseOfEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getLcdOnBecauseOfNotify() {
                return ((CincoEventMessage) this.instance).getLcdOnBecauseOfNotify();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getLcdOnBecauseOfPress() {
                return ((CincoEventMessage) this.instance).getLcdOnBecauseOfPress();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getLongpressKeyInSportCount() {
                return ((CincoEventMessage) this.instance).getLongpressKeyInSportCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getLongpressTouchInSportCount() {
                return ((CincoEventMessage) this.instance).getLongpressTouchInSportCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getMSMNotifyCount() {
                return ((CincoEventMessage) this.instance).getMSMNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getMissCallCount() {
                return ((CincoEventMessage) this.instance).getMissCallCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getMoreListPage() {
                return ((CincoEventMessage) this.instance).getMoreListPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getMusicNextCount() {
                return ((CincoEventMessage) this.instance).getMusicNextCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getMusicPageCount() {
                return ((CincoEventMessage) this.instance).getMusicPageCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getMusicVolumeCount() {
                return ((CincoEventMessage) this.instance).getMusicVolumeCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getNotifyDetails() {
                return ((CincoEventMessage) this.instance).getNotifyDetails();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getOpenLcdAfterNotif() {
                return ((CincoEventMessage) this.instance).getOpenLcdAfterNotif();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getOutsideRunningCount() {
                return ((CincoEventMessage) this.instance).getOutsideRunningCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getPaiDetails() {
                return ((CincoEventMessage) this.instance).getPaiDetails();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getPaiEntrance() {
                return ((CincoEventMessage) this.instance).getPaiEntrance();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getPaiInfo() {
                return ((CincoEventMessage) this.instance).getPaiInfo();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getPasswordFactoryCount() {
                return ((CincoEventMessage) this.instance).getPasswordFactoryCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getPasswordPageCount() {
                return ((CincoEventMessage) this.instance).getPasswordPageCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getPhoneAlarmNotifyCount() {
                return ((CincoEventMessage) this.instance).getPhoneAlarmNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getPhoneSilenceBell() {
                return ((CincoEventMessage) this.instance).getPhoneSilenceBell();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getPhoneSilenceCount() {
                return ((CincoEventMessage) this.instance).getPhoneSilenceCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getPhoneSilenceMuteCount() {
                return ((CincoEventMessage) this.instance).getPhoneSilenceMuteCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getReachNotifyCount() {
                return ((CincoEventMessage) this.instance).getReachNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getRedBagNotifyCount() {
                return ((CincoEventMessage) this.instance).getRedBagNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getRemindFromXiaoai() {
                return ((CincoEventMessage) this.instance).getRemindFromXiaoai();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getRemindNotifyCount() {
                return ((CincoEventMessage) this.instance).getRemindNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getRightSlidingInSportCount() {
                return ((CincoEventMessage) this.instance).getRightSlidingInSportCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getSedentaryExplainPage() {
                return ((CincoEventMessage) this.instance).getSedentaryExplainPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getSilenceNormalModeCount() {
                return ((CincoEventMessage) this.instance).getSilenceNormalModeCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getSilenceOffModeCount() {
                return ((CincoEventMessage) this.instance).getSilenceOffModeCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getSilencePageCount() {
                return ((CincoEventMessage) this.instance).getSilencePageCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getSilenceSmartModeCount() {
                return ((CincoEventMessage) this.instance).getSilenceSmartModeCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getSkipGpsLocationCount() {
                return ((CincoEventMessage) this.instance).getSkipGpsLocationCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getSportDisconnectCount() {
                return ((CincoEventMessage) this.instance).getSportDisconnectCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getSportScreenCount() {
                return ((CincoEventMessage) this.instance).getSportScreenCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getSportScreenDisconnectCount() {
                return ((CincoEventMessage) this.instance).getSportScreenDisconnectCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getStatusDetails() {
                return ((CincoEventMessage) this.instance).getStatusDetails();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getStopwatchCount() {
                return ((CincoEventMessage) this.instance).getStopwatchCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getStopwatchMarkCount() {
                return ((CincoEventMessage) this.instance).getStopwatchMarkCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getStopwatchMarkDisCount() {
                return ((CincoEventMessage) this.instance).getStopwatchMarkDisCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getSwimmingCount() {
                return ((CincoEventMessage) this.instance).getSwimmingCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getWaitGpsLocationCount() {
                return ((CincoEventMessage) this.instance).getWaitGpsLocationCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getWalkingCount() {
                return ((CincoEventMessage) this.instance).getWalkingCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getWeatherDetails() {
                return ((CincoEventMessage) this.instance).getWeatherDetails();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getWeatherFromXiaoai() {
                return ((CincoEventMessage) this.instance).getWeatherFromXiaoai();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public int getWeatherNotifyCount() {
                return ((CincoEventMessage) this.instance).getWeatherNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasActiveCardFailCount() {
                return ((CincoEventMessage) this.instance).hasActiveCardFailCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasActiveCardSuccessCount() {
                return ((CincoEventMessage) this.instance).hasActiveCardSuccessCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasAlarmFromXiaoai() {
                return ((CincoEventMessage) this.instance).hasAlarmFromXiaoai();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasAlarmListCount() {
                return ((CincoEventMessage) this.instance).hasAlarmListCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasAlarmPageBackCount() {
                return ((CincoEventMessage) this.instance).hasAlarmPageBackCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasAlarmPageCount() {
                return ((CincoEventMessage) this.instance).hasAlarmPageCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasAlarmPageLazyCount() {
                return ((CincoEventMessage) this.instance).hasAlarmPageLazyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasAlarmPageOffCount() {
                return ((CincoEventMessage) this.instance).hasAlarmPageOffCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasAlipayCode128Count() {
                return ((CincoEventMessage) this.instance).hasAlipayCode128Count();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasAlipayPageCount() {
                return ((CincoEventMessage) this.instance).hasAlipayPageCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasAlipayQRCodeCount() {
                return ((CincoEventMessage) this.instance).hasAlipayQRCodeCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasCallHangCount() {
                return ((CincoEventMessage) this.instance).hasCallHangCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasCallIgnoreCount() {
                return ((CincoEventMessage) this.instance).hasCallIgnoreCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasCardPageCount() {
                return ((CincoEventMessage) this.instance).hasCardPageCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasCareNotifyCount() {
                return ((CincoEventMessage) this.instance).hasCareNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasClickKeyInSportCount() {
                return ((CincoEventMessage) this.instance).hasClickKeyInSportCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasClickTouchInSportCount() {
                return ((CincoEventMessage) this.instance).hasClickTouchInSportCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasCountdownCount() {
                return ((CincoEventMessage) this.instance).hasCountdownCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasCountdownFromXiaoai() {
                return ((CincoEventMessage) this.instance).hasCountdownFromXiaoai();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasCustomOfXiaoai() {
                return ((CincoEventMessage) this.instance).hasCustomOfXiaoai();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasCyclingCount() {
                return ((CincoEventMessage) this.instance).hasCyclingCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasDial2Xiaoai() {
                return ((CincoEventMessage) this.instance).hasDial2Xiaoai();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasDialId() {
                return ((CincoEventMessage) this.instance).hasDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasEMAILNotifyCount() {
                return ((CincoEventMessage) this.instance).hasEMAILNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasExerciseCount() {
                return ((CincoEventMessage) this.instance).hasExerciseCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasFactoryPageCount() {
                return ((CincoEventMessage) this.instance).hasFactoryPageCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasFindPhoneCount() {
                return ((CincoEventMessage) this.instance).hasFindPhoneCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasHeartrateDetails() {
                return ((CincoEventMessage) this.instance).hasHeartrateDetails();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasHeartrateFailPage() {
                return ((CincoEventMessage) this.instance).hasHeartrateFailPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasHighHeartrateNotifyCount() {
                return ((CincoEventMessage) this.instance).hasHighHeartrateNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasIndoorRunningCount() {
                return ((CincoEventMessage) this.instance).hasIndoorRunningCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfEvent() {
                return ((CincoEventMessage) this.instance).hasLcdOnBecauseOfEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfNotify() {
                return ((CincoEventMessage) this.instance).hasLcdOnBecauseOfNotify();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfPress() {
                return ((CincoEventMessage) this.instance).hasLcdOnBecauseOfPress();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasLongpressKeyInSportCount() {
                return ((CincoEventMessage) this.instance).hasLongpressKeyInSportCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasLongpressTouchInSportCount() {
                return ((CincoEventMessage) this.instance).hasLongpressTouchInSportCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasMSMNotifyCount() {
                return ((CincoEventMessage) this.instance).hasMSMNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasMissCallCount() {
                return ((CincoEventMessage) this.instance).hasMissCallCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasMoreListPage() {
                return ((CincoEventMessage) this.instance).hasMoreListPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasMusicNextCount() {
                return ((CincoEventMessage) this.instance).hasMusicNextCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasMusicPageCount() {
                return ((CincoEventMessage) this.instance).hasMusicPageCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasMusicVolumeCount() {
                return ((CincoEventMessage) this.instance).hasMusicVolumeCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasNotifyDetails() {
                return ((CincoEventMessage) this.instance).hasNotifyDetails();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasOpenLcdAfterNotif() {
                return ((CincoEventMessage) this.instance).hasOpenLcdAfterNotif();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasOutsideRunningCount() {
                return ((CincoEventMessage) this.instance).hasOutsideRunningCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasPaiDetails() {
                return ((CincoEventMessage) this.instance).hasPaiDetails();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasPaiEntrance() {
                return ((CincoEventMessage) this.instance).hasPaiEntrance();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasPaiInfo() {
                return ((CincoEventMessage) this.instance).hasPaiInfo();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasPasswordFactoryCount() {
                return ((CincoEventMessage) this.instance).hasPasswordFactoryCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasPasswordPageCount() {
                return ((CincoEventMessage) this.instance).hasPasswordPageCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasPhoneAlarmNotifyCount() {
                return ((CincoEventMessage) this.instance).hasPhoneAlarmNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasPhoneSilenceBell() {
                return ((CincoEventMessage) this.instance).hasPhoneSilenceBell();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasPhoneSilenceCount() {
                return ((CincoEventMessage) this.instance).hasPhoneSilenceCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasPhoneSilenceMuteCount() {
                return ((CincoEventMessage) this.instance).hasPhoneSilenceMuteCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasReachNotifyCount() {
                return ((CincoEventMessage) this.instance).hasReachNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasRedBagNotifyCount() {
                return ((CincoEventMessage) this.instance).hasRedBagNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasRemindFromXiaoai() {
                return ((CincoEventMessage) this.instance).hasRemindFromXiaoai();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasRemindNotifyCount() {
                return ((CincoEventMessage) this.instance).hasRemindNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasRightSlidingInSportCount() {
                return ((CincoEventMessage) this.instance).hasRightSlidingInSportCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasSedentaryExplainPage() {
                return ((CincoEventMessage) this.instance).hasSedentaryExplainPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasSilenceNormalModeCount() {
                return ((CincoEventMessage) this.instance).hasSilenceNormalModeCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasSilenceOffModeCount() {
                return ((CincoEventMessage) this.instance).hasSilenceOffModeCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasSilencePageCount() {
                return ((CincoEventMessage) this.instance).hasSilencePageCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasSilenceSmartModeCount() {
                return ((CincoEventMessage) this.instance).hasSilenceSmartModeCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasSkipGpsLocationCount() {
                return ((CincoEventMessage) this.instance).hasSkipGpsLocationCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasSportDisconnectCount() {
                return ((CincoEventMessage) this.instance).hasSportDisconnectCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasSportScreenCount() {
                return ((CincoEventMessage) this.instance).hasSportScreenCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasSportScreenDisconnectCount() {
                return ((CincoEventMessage) this.instance).hasSportScreenDisconnectCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasStatusDetails() {
                return ((CincoEventMessage) this.instance).hasStatusDetails();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasStopwatchCount() {
                return ((CincoEventMessage) this.instance).hasStopwatchCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasStopwatchMarkCount() {
                return ((CincoEventMessage) this.instance).hasStopwatchMarkCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasStopwatchMarkDisCount() {
                return ((CincoEventMessage) this.instance).hasStopwatchMarkDisCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasSwimmingCount() {
                return ((CincoEventMessage) this.instance).hasSwimmingCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasWaitGpsLocationCount() {
                return ((CincoEventMessage) this.instance).hasWaitGpsLocationCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasWalkingCount() {
                return ((CincoEventMessage) this.instance).hasWalkingCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasWeatherDetails() {
                return ((CincoEventMessage) this.instance).hasWeatherDetails();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasWeatherFromXiaoai() {
                return ((CincoEventMessage) this.instance).hasWeatherFromXiaoai();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
            public boolean hasWeatherNotifyCount() {
                return ((CincoEventMessage) this.instance).hasWeatherNotifyCount();
            }

            public Builder setActiveCardFailCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setActiveCardFailCount(value);
                return this;
            }

            public Builder setActiveCardSuccessCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setActiveCardSuccessCount(value);
                return this;
            }

            public Builder setAlarmFromXiaoai(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setAlarmFromXiaoai(value);
                return this;
            }

            public Builder setAlarmListCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setAlarmListCount(value);
                return this;
            }

            public Builder setAlarmPageBackCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setAlarmPageBackCount(value);
                return this;
            }

            public Builder setAlarmPageCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setAlarmPageCount(value);
                return this;
            }

            public Builder setAlarmPageLazyCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setAlarmPageLazyCount(value);
                return this;
            }

            public Builder setAlarmPageOffCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setAlarmPageOffCount(value);
                return this;
            }

            public Builder setAlipayCode128Count(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setAlipayCode128Count(value);
                return this;
            }

            public Builder setAlipayPageCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setAlipayPageCount(value);
                return this;
            }

            public Builder setAlipayQRCodeCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setAlipayQRCodeCount(value);
                return this;
            }

            public Builder setCallHangCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setCallHangCount(value);
                return this;
            }

            public Builder setCallIgnoreCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setCallIgnoreCount(value);
                return this;
            }

            public Builder setCardPageCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setCardPageCount(value);
                return this;
            }

            public Builder setCareNotifyCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setCareNotifyCount(value);
                return this;
            }

            public Builder setClickKeyInSportCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setClickKeyInSportCount(value);
                return this;
            }

            public Builder setClickTouchInSportCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setClickTouchInSportCount(value);
                return this;
            }

            public Builder setCountdownCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setCountdownCount(value);
                return this;
            }

            public Builder setCountdownFromXiaoai(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setCountdownFromXiaoai(value);
                return this;
            }

            public Builder setCustomOfXiaoai(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setCustomOfXiaoai(value);
                return this;
            }

            public Builder setCyclingCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setCyclingCount(value);
                return this;
            }

            public Builder setDial2Xiaoai(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setDial2Xiaoai(value);
                return this;
            }

            public Builder setDialId(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setDialId(value);
                return this;
            }

            public Builder setEMAILNotifyCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setEMAILNotifyCount(value);
                return this;
            }

            public Builder setExerciseCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setExerciseCount(value);
                return this;
            }

            public Builder setFactoryPageCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setFactoryPageCount(value);
                return this;
            }

            public Builder setFindPhoneCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setFindPhoneCount(value);
                return this;
            }

            public Builder setHeartrateDetails(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setHeartrateDetails(value);
                return this;
            }

            public Builder setHeartrateFailPage(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setHeartrateFailPage(value);
                return this;
            }

            public Builder setHighHeartrateNotifyCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setHighHeartrateNotifyCount(value);
                return this;
            }

            public Builder setIndoorRunningCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setIndoorRunningCount(value);
                return this;
            }

            public Builder setLcdOnBecauseOfEvent(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setLcdOnBecauseOfEvent(value);
                return this;
            }

            public Builder setLcdOnBecauseOfNotify(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setLcdOnBecauseOfNotify(value);
                return this;
            }

            public Builder setLcdOnBecauseOfPress(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setLcdOnBecauseOfPress(value);
                return this;
            }

            public Builder setLongpressKeyInSportCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setLongpressKeyInSportCount(value);
                return this;
            }

            public Builder setLongpressTouchInSportCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setLongpressTouchInSportCount(value);
                return this;
            }

            public Builder setMSMNotifyCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setMSMNotifyCount(value);
                return this;
            }

            public Builder setMissCallCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setMissCallCount(value);
                return this;
            }

            public Builder setMoreListPage(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setMoreListPage(value);
                return this;
            }

            public Builder setMusicNextCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setMusicNextCount(value);
                return this;
            }

            public Builder setMusicPageCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setMusicPageCount(value);
                return this;
            }

            public Builder setMusicVolumeCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setMusicVolumeCount(value);
                return this;
            }

            public Builder setNotifyDetails(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setNotifyDetails(value);
                return this;
            }

            public Builder setOpenLcdAfterNotif(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setOpenLcdAfterNotif(value);
                return this;
            }

            public Builder setOutsideRunningCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setOutsideRunningCount(value);
                return this;
            }

            public Builder setPaiDetails(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setPaiDetails(value);
                return this;
            }

            public Builder setPaiEntrance(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setPaiEntrance(value);
                return this;
            }

            public Builder setPaiInfo(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setPaiInfo(value);
                return this;
            }

            public Builder setPasswordFactoryCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setPasswordFactoryCount(value);
                return this;
            }

            public Builder setPasswordPageCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setPasswordPageCount(value);
                return this;
            }

            public Builder setPhoneAlarmNotifyCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setPhoneAlarmNotifyCount(value);
                return this;
            }

            public Builder setPhoneSilenceBell(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setPhoneSilenceBell(value);
                return this;
            }

            public Builder setPhoneSilenceCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setPhoneSilenceCount(value);
                return this;
            }

            public Builder setPhoneSilenceMuteCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setPhoneSilenceMuteCount(value);
                return this;
            }

            public Builder setReachNotifyCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setReachNotifyCount(value);
                return this;
            }

            public Builder setRedBagNotifyCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setRedBagNotifyCount(value);
                return this;
            }

            public Builder setRemindFromXiaoai(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setRemindFromXiaoai(value);
                return this;
            }

            public Builder setRemindNotifyCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setRemindNotifyCount(value);
                return this;
            }

            public Builder setRightSlidingInSportCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setRightSlidingInSportCount(value);
                return this;
            }

            public Builder setSedentaryExplainPage(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setSedentaryExplainPage(value);
                return this;
            }

            public Builder setSilenceNormalModeCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setSilenceNormalModeCount(value);
                return this;
            }

            public Builder setSilenceOffModeCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setSilenceOffModeCount(value);
                return this;
            }

            public Builder setSilencePageCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setSilencePageCount(value);
                return this;
            }

            public Builder setSilenceSmartModeCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setSilenceSmartModeCount(value);
                return this;
            }

            public Builder setSkipGpsLocationCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setSkipGpsLocationCount(value);
                return this;
            }

            public Builder setSportDisconnectCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setSportDisconnectCount(value);
                return this;
            }

            public Builder setSportScreenCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setSportScreenCount(value);
                return this;
            }

            public Builder setSportScreenDisconnectCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setSportScreenDisconnectCount(value);
                return this;
            }

            public Builder setStatusDetails(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setStatusDetails(value);
                return this;
            }

            public Builder setStopwatchCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setStopwatchCount(value);
                return this;
            }

            public Builder setStopwatchMarkCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setStopwatchMarkCount(value);
                return this;
            }

            public Builder setStopwatchMarkDisCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setStopwatchMarkDisCount(value);
                return this;
            }

            public Builder setSwimmingCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setSwimmingCount(value);
                return this;
            }

            public Builder setWaitGpsLocationCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setWaitGpsLocationCount(value);
                return this;
            }

            public Builder setWalkingCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setWalkingCount(value);
                return this;
            }

            public Builder setWeatherDetails(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setWeatherDetails(value);
                return this;
            }

            public Builder setWeatherFromXiaoai(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setWeatherFromXiaoai(value);
                return this;
            }

            public Builder setWeatherNotifyCount(int value) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setWeatherNotifyCount(value);
                return this;
            }

            private Builder() {
                super(CincoEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            CincoEventMessage cincoEventMessage = new CincoEventMessage();
            DEFAULT_INSTANCE = cincoEventMessage;
            GeneratedMessageLite.registerDefaultInstance(CincoEventMessage.class, cincoEventMessage);
        }

        private CincoEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearActiveCardFailCount() {
            this.bitField1_ &= -129;
            this.activeCardFailCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearActiveCardSuccessCount() {
            this.bitField1_ &= -65;
            this.activeCardSuccessCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmFromXiaoai() {
            this.bitField1_ &= -32769;
            this.alarmFromXiaoai_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmListCount() {
            this.bitField0_ &= -16777217;
            this.alarmListCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmPageBackCount() {
            this.bitField0_ &= -134217729;
            this.alarmPageBackCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmPageCount() {
            this.bitField1_ &= Integer.MAX_VALUE;
            this.alarmPageCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmPageLazyCount() {
            this.bitField0_ &= -33554433;
            this.alarmPageLazyCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmPageOffCount() {
            this.bitField0_ &= -67108865;
            this.alarmPageOffCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCode128Count() {
            this.bitField1_ &= -1025;
            this.alipayCode128Count_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayPageCount() {
            this.bitField1_ &= -257;
            this.alipayPageCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRCodeCount() {
            this.bitField1_ &= -513;
            this.alipayQRCodeCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCallHangCount() {
            this.bitField1_ &= -536870913;
            this.callHangCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCallIgnoreCount() {
            this.bitField1_ &= -268435457;
            this.callIgnoreCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCardPageCount() {
            this.bitField1_ &= -33;
            this.cardPageCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCareNotifyCount() {
            this.bitField2_ &= -33;
            this.careNotifyCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClickKeyInSportCount() {
            this.bitField1_ &= -1048577;
            this.clickKeyInSportCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearClickTouchInSportCount() {
            this.bitField1_ &= -524289;
            this.clickTouchInSportCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountdownCount() {
            this.bitField1_ &= -2;
            this.countdownCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountdownFromXiaoai() {
            this.bitField1_ &= -131073;
            this.countdownFromXiaoai_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCustomOfXiaoai() {
            this.bitField1_ &= -262145;
            this.customOfXiaoai_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCyclingCount() {
            this.bitField0_ &= -1025;
            this.cyclingCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDial2Xiaoai() {
            this.bitField0_ &= -9;
            this.dial2Xiaoai_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialId() {
            this.bitField2_ &= -1025;
            this.dialId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEMAILNotifyCount() {
            this.bitField2_ &= -5;
            this.eMAILNotifyCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExerciseCount() {
            this.bitField0_ &= -4097;
            this.exerciseCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFactoryPageCount() {
            this.bitField1_ &= -2049;
            this.factoryPageCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFindPhoneCount() {
            this.bitField1_ &= -9;
            this.findPhoneCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeartrateDetails() {
            this.bitField0_ &= -65;
            this.heartrateDetails_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeartrateFailPage() {
            this.bitField0_ &= -129;
            this.heartrateFailPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHighHeartrateNotifyCount() {
            this.bitField2_ &= -513;
            this.highHeartrateNotifyCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearIndoorRunningCount() {
            this.bitField0_ &= -513;
            this.indoorRunningCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLcdOnBecauseOfEvent() {
            this.bitField0_ &= -3;
            this.lcdOnBecauseOfEvent_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLcdOnBecauseOfNotify() {
            this.bitField0_ &= -5;
            this.lcdOnBecauseOfNotify_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLcdOnBecauseOfPress() {
            this.bitField0_ &= -2;
            this.lcdOnBecauseOfPress_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLongpressKeyInSportCount() {
            this.bitField1_ &= -8388609;
            this.longpressKeyInSportCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLongpressTouchInSportCount() {
            this.bitField1_ &= -4194305;
            this.longpressTouchInSportCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMSMNotifyCount() {
            this.bitField2_ &= -3;
            this.mSMNotifyCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMissCallCount() {
            this.bitField2_ &= -2;
            this.missCallCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMoreListPage() {
            this.bitField0_ &= -524289;
            this.moreListPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicNextCount() {
            this.bitField0_ &= -1073741825;
            this.musicNextCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicPageCount() {
            this.bitField0_ &= -268435457;
            this.musicPageCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicVolumeCount() {
            this.bitField0_ &= -536870913;
            this.musicVolumeCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotifyDetails() {
            this.bitField0_ &= -262145;
            this.notifyDetails_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOpenLcdAfterNotif() {
            this.bitField1_ &= -1073741825;
            this.openLcdAfterNotif_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOutsideRunningCount() {
            this.bitField0_ &= -257;
            this.outsideRunningCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPaiDetails() {
            this.bitField2_ &= -4097;
            this.paiDetails_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPaiEntrance() {
            this.bitField2_ &= -2049;
            this.paiEntrance_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPaiInfo() {
            this.bitField2_ &= -8193;
            this.paiInfo_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPasswordFactoryCount() {
            this.bitField1_ &= -4097;
            this.passwordFactoryCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPasswordPageCount() {
            this.bitField1_ &= -8193;
            this.passwordPageCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhoneAlarmNotifyCount() {
            this.bitField2_ &= -257;
            this.phoneAlarmNotifyCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhoneSilenceBell() {
            this.bitField1_ &= -134217729;
            this.phoneSilenceBell_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhoneSilenceCount() {
            this.bitField1_ &= -17;
            this.phoneSilenceCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhoneSilenceMuteCount() {
            this.bitField1_ &= -67108865;
            this.phoneSilenceMuteCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReachNotifyCount() {
            this.bitField2_ &= -65;
            this.reachNotifyCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRedBagNotifyCount() {
            this.bitField2_ &= -129;
            this.redBagNotifyCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemindFromXiaoai() {
            this.bitField1_ &= -16385;
            this.remindFromXiaoai_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRemindNotifyCount() {
            this.bitField2_ &= -17;
            this.remindNotifyCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRightSlidingInSportCount() {
            this.bitField1_ &= -2097153;
            this.rightSlidingInSportCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSedentaryExplainPage() {
            this.bitField0_ &= -33;
            this.sedentaryExplainPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSilenceNormalModeCount() {
            this.bitField0_ &= -4194305;
            this.silenceNormalModeCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSilenceOffModeCount() {
            this.bitField0_ &= -8388609;
            this.silenceOffModeCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSilencePageCount() {
            this.bitField0_ &= -1048577;
            this.silencePageCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSilenceSmartModeCount() {
            this.bitField0_ &= -2097153;
            this.silenceSmartModeCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkipGpsLocationCount() {
            this.bitField1_ &= -33554433;
            this.skipGpsLocationCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportDisconnectCount() {
            this.bitField0_ &= -16385;
            this.sportDisconnectCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportScreenCount() {
            this.bitField0_ &= -32769;
            this.sportScreenCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportScreenDisconnectCount() {
            this.bitField0_ &= -65537;
            this.sportScreenDisconnectCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatusDetails() {
            this.bitField0_ &= -17;
            this.statusDetails_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStopwatchCount() {
            this.bitField0_ &= Integer.MAX_VALUE;
            this.stopwatchCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStopwatchMarkCount() {
            this.bitField1_ &= -3;
            this.stopwatchMarkCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStopwatchMarkDisCount() {
            this.bitField1_ &= -5;
            this.stopwatchMarkDisCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSwimmingCount() {
            this.bitField0_ &= -8193;
            this.swimmingCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWaitGpsLocationCount() {
            this.bitField1_ &= -16777217;
            this.waitGpsLocationCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWalkingCount() {
            this.bitField0_ &= -2049;
            this.walkingCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeatherDetails() {
            this.bitField0_ &= -131073;
            this.weatherDetails_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeatherFromXiaoai() {
            this.bitField1_ &= -65537;
            this.weatherFromXiaoai_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeatherNotifyCount() {
            this.bitField2_ &= -9;
            this.weatherNotifyCount_ = 0;
        }

        public static CincoEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CincoEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (CincoEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static CincoEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (CincoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<CincoEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActiveCardFailCount(int value) {
            this.bitField1_ |= 128;
            this.activeCardFailCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActiveCardSuccessCount(int value) {
            this.bitField1_ |= 64;
            this.activeCardSuccessCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmFromXiaoai(int value) {
            this.bitField1_ |= 32768;
            this.alarmFromXiaoai_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmListCount(int value) {
            this.bitField0_ |= 16777216;
            this.alarmListCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmPageBackCount(int value) {
            this.bitField0_ |= AMapEngineUtils.HALF_MAX_P20_WIDTH;
            this.alarmPageBackCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmPageCount(int value) {
            this.bitField1_ |= Integer.MIN_VALUE;
            this.alarmPageCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmPageLazyCount(int value) {
            this.bitField0_ |= 33554432;
            this.alarmPageLazyCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmPageOffCount(int value) {
            this.bitField0_ |= 67108864;
            this.alarmPageOffCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCode128Count(int value) {
            this.bitField1_ |= 1024;
            this.alipayCode128Count_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayPageCount(int value) {
            this.bitField1_ |= 256;
            this.alipayPageCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRCodeCount(int value) {
            this.bitField1_ |= 512;
            this.alipayQRCodeCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallHangCount(int value) {
            this.bitField1_ |= 536870912;
            this.callHangCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallIgnoreCount(int value) {
            this.bitField1_ |= 268435456;
            this.callIgnoreCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCardPageCount(int value) {
            this.bitField1_ |= 32;
            this.cardPageCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCareNotifyCount(int value) {
            this.bitField2_ |= 32;
            this.careNotifyCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClickKeyInSportCount(int value) {
            this.bitField1_ |= 1048576;
            this.clickKeyInSportCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClickTouchInSportCount(int value) {
            this.bitField1_ |= 524288;
            this.clickTouchInSportCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountdownCount(int value) {
            this.bitField1_ |= 1;
            this.countdownCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountdownFromXiaoai(int value) {
            this.bitField1_ |= 131072;
            this.countdownFromXiaoai_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomOfXiaoai(int value) {
            this.bitField1_ |= 262144;
            this.customOfXiaoai_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCyclingCount(int value) {
            this.bitField0_ |= 1024;
            this.cyclingCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDial2Xiaoai(int value) {
            this.bitField0_ |= 8;
            this.dial2Xiaoai_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialId(int value) {
            this.bitField2_ |= 1024;
            this.dialId_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEMAILNotifyCount(int value) {
            this.bitField2_ |= 4;
            this.eMAILNotifyCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExerciseCount(int value) {
            this.bitField0_ |= 4096;
            this.exerciseCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFactoryPageCount(int value) {
            this.bitField1_ |= 2048;
            this.factoryPageCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFindPhoneCount(int value) {
            this.bitField1_ |= 8;
            this.findPhoneCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeartrateDetails(int value) {
            this.bitField0_ |= 64;
            this.heartrateDetails_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeartrateFailPage(int value) {
            this.bitField0_ |= 128;
            this.heartrateFailPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHighHeartrateNotifyCount(int value) {
            this.bitField2_ |= 512;
            this.highHeartrateNotifyCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndoorRunningCount(int value) {
            this.bitField0_ |= 512;
            this.indoorRunningCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOnBecauseOfEvent(int value) {
            this.bitField0_ |= 2;
            this.lcdOnBecauseOfEvent_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOnBecauseOfNotify(int value) {
            this.bitField0_ |= 4;
            this.lcdOnBecauseOfNotify_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOnBecauseOfPress(int value) {
            this.bitField0_ |= 1;
            this.lcdOnBecauseOfPress_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLongpressKeyInSportCount(int value) {
            this.bitField1_ |= 8388608;
            this.longpressKeyInSportCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLongpressTouchInSportCount(int value) {
            this.bitField1_ |= 4194304;
            this.longpressTouchInSportCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMSMNotifyCount(int value) {
            this.bitField2_ |= 2;
            this.mSMNotifyCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMissCallCount(int value) {
            this.bitField2_ |= 1;
            this.missCallCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMoreListPage(int value) {
            this.bitField0_ |= 524288;
            this.moreListPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicNextCount(int value) {
            this.bitField0_ |= 1073741824;
            this.musicNextCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicPageCount(int value) {
            this.bitField0_ |= 268435456;
            this.musicPageCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicVolumeCount(int value) {
            this.bitField0_ |= 536870912;
            this.musicVolumeCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotifyDetails(int value) {
            this.bitField0_ |= 262144;
            this.notifyDetails_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpenLcdAfterNotif(int value) {
            this.bitField1_ |= 1073741824;
            this.openLcdAfterNotif_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOutsideRunningCount(int value) {
            this.bitField0_ |= 256;
            this.outsideRunningCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaiDetails(int value) {
            this.bitField2_ |= 4096;
            this.paiDetails_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaiEntrance(int value) {
            this.bitField2_ |= 2048;
            this.paiEntrance_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaiInfo(int value) {
            this.bitField2_ |= 8192;
            this.paiInfo_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPasswordFactoryCount(int value) {
            this.bitField1_ |= 4096;
            this.passwordFactoryCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPasswordPageCount(int value) {
            this.bitField1_ |= 8192;
            this.passwordPageCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhoneAlarmNotifyCount(int value) {
            this.bitField2_ |= 256;
            this.phoneAlarmNotifyCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhoneSilenceBell(int value) {
            this.bitField1_ |= AMapEngineUtils.HALF_MAX_P20_WIDTH;
            this.phoneSilenceBell_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhoneSilenceCount(int value) {
            this.bitField1_ |= 16;
            this.phoneSilenceCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhoneSilenceMuteCount(int value) {
            this.bitField1_ |= 67108864;
            this.phoneSilenceMuteCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReachNotifyCount(int value) {
            this.bitField2_ |= 64;
            this.reachNotifyCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRedBagNotifyCount(int value) {
            this.bitField2_ |= 128;
            this.redBagNotifyCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemindFromXiaoai(int value) {
            this.bitField1_ |= 16384;
            this.remindFromXiaoai_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemindNotifyCount(int value) {
            this.bitField2_ |= 16;
            this.remindNotifyCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRightSlidingInSportCount(int value) {
            this.bitField1_ |= 2097152;
            this.rightSlidingInSportCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSedentaryExplainPage(int value) {
            this.bitField0_ |= 32;
            this.sedentaryExplainPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSilenceNormalModeCount(int value) {
            this.bitField0_ |= 4194304;
            this.silenceNormalModeCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSilenceOffModeCount(int value) {
            this.bitField0_ |= 8388608;
            this.silenceOffModeCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSilencePageCount(int value) {
            this.bitField0_ |= 1048576;
            this.silencePageCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSilenceSmartModeCount(int value) {
            this.bitField0_ |= 2097152;
            this.silenceSmartModeCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkipGpsLocationCount(int value) {
            this.bitField1_ |= 33554432;
            this.skipGpsLocationCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportDisconnectCount(int value) {
            this.bitField0_ |= 16384;
            this.sportDisconnectCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportScreenCount(int value) {
            this.bitField0_ |= 32768;
            this.sportScreenCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportScreenDisconnectCount(int value) {
            this.bitField0_ |= 65536;
            this.sportScreenDisconnectCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusDetails(int value) {
            this.bitField0_ |= 16;
            this.statusDetails_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopwatchCount(int value) {
            this.bitField0_ |= Integer.MIN_VALUE;
            this.stopwatchCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopwatchMarkCount(int value) {
            this.bitField1_ |= 2;
            this.stopwatchMarkCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopwatchMarkDisCount(int value) {
            this.bitField1_ |= 4;
            this.stopwatchMarkDisCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwimmingCount(int value) {
            this.bitField0_ |= 8192;
            this.swimmingCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWaitGpsLocationCount(int value) {
            this.bitField1_ |= 16777216;
            this.waitGpsLocationCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWalkingCount(int value) {
            this.bitField0_ |= 2048;
            this.walkingCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeatherDetails(int value) {
            this.bitField0_ |= 131072;
            this.weatherDetails_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeatherFromXiaoai(int value) {
            this.bitField1_ |= 65536;
            this.weatherFromXiaoai_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeatherNotifyCount(int value) {
            this.bitField2_ |= 8;
            this.weatherNotifyCount_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new CincoEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001N\u0000\u0003\u0001RN\u0000\u0000K\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f\u0011ᔋ\u0010\u0012ᔋ\u0011\u0013ᔋ\u0012\u0014ᔋ\u0013\u0015ᔋ\u0014\u0016ᔋ\u0015\u0017ᔋ\u0016\u0018ᔋ\u0017\u0019ᔋ\u0018\u001aᔋ\u0019\u001bᔋ\u001a\u001cᔋ\u001b\u001dᔋ\u001c\u001eᔋ\u001d\u001fᔋ\u001e ᔋ\u001f!ᔋ \"ᔋ!#ᔋ\"$ᔋ#%ᔋ$&ᔋ%'ᔋ&(ᔋ')ᔋ(*ᔋ)+ᔋ*,ᔋ+-ᔋ,.ᔋ-/ᔋ.0ᔋ/1ᔋ02ᔋ13ᔋ24ᔋ35ᔋ46ᔋ57ᔋ68ᔋ79ᔋ8:ᔋ9;ᔋ:<ᔋ;=ᔋ<>ᔋ=?ᔋ>@ᔋ?Cᔋ@DᔋAEᔋBFᔋCGᔋDIᔋEJᔋFKᔋGLᔋHMᔋIOᔋJPဋKQဋLRဋM", new Object[]{"bitField0_", "bitField1_", "bitField2_", "lcdOnBecauseOfPress_", "lcdOnBecauseOfEvent_", "lcdOnBecauseOfNotify_", "dial2Xiaoai_", "statusDetails_", "sedentaryExplainPage_", "heartrateDetails_", "heartrateFailPage_", "outsideRunningCount_", "indoorRunningCount_", "cyclingCount_", "walkingCount_", "exerciseCount_", "swimmingCount_", "sportDisconnectCount_", "sportScreenCount_", "sportScreenDisconnectCount_", "weatherDetails_", "notifyDetails_", "moreListPage_", "silencePageCount_", "silenceSmartModeCount_", "silenceNormalModeCount_", "silenceOffModeCount_", "alarmListCount_", "alarmPageLazyCount_", "alarmPageOffCount_", "alarmPageBackCount_", "musicPageCount_", "musicVolumeCount_", "musicNextCount_", "stopwatchCount_", "countdownCount_", "stopwatchMarkCount_", "stopwatchMarkDisCount_", "findPhoneCount_", "phoneSilenceCount_", "cardPageCount_", "activeCardSuccessCount_", "activeCardFailCount_", "alipayPageCount_", "alipayQRCodeCount_", "alipayCode128Count_", "factoryPageCount_", "passwordFactoryCount_", "passwordPageCount_", "remindFromXiaoai_", "alarmFromXiaoai_", "weatherFromXiaoai_", "countdownFromXiaoai_", "customOfXiaoai_", "clickTouchInSportCount_", "clickKeyInSportCount_", "rightSlidingInSportCount_", "longpressTouchInSportCount_", "longpressKeyInSportCount_", "waitGpsLocationCount_", "skipGpsLocationCount_", "phoneSilenceMuteCount_", "phoneSilenceBell_", "callIgnoreCount_", "callHangCount_", "openLcdAfterNotif_", "alarmPageCount_", "missCallCount_", "mSMNotifyCount_", "eMAILNotifyCount_", "weatherNotifyCount_", "remindNotifyCount_", "careNotifyCount_", "reachNotifyCount_", "redBagNotifyCount_", "phoneAlarmNotifyCount_", "highHeartrateNotifyCount_", "dialId_", "paiEntrance_", "paiDetails_", "paiInfo_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CincoEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (CincoEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getActiveCardFailCount() {
            return this.activeCardFailCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getActiveCardSuccessCount() {
            return this.activeCardSuccessCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getAlarmFromXiaoai() {
            return this.alarmFromXiaoai_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getAlarmListCount() {
            return this.alarmListCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getAlarmPageBackCount() {
            return this.alarmPageBackCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getAlarmPageCount() {
            return this.alarmPageCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getAlarmPageLazyCount() {
            return this.alarmPageLazyCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getAlarmPageOffCount() {
            return this.alarmPageOffCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getAlipayCode128Count() {
            return this.alipayCode128Count_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getAlipayPageCount() {
            return this.alipayPageCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getAlipayQRCodeCount() {
            return this.alipayQRCodeCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getCallHangCount() {
            return this.callHangCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getCallIgnoreCount() {
            return this.callIgnoreCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getCardPageCount() {
            return this.cardPageCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getCareNotifyCount() {
            return this.careNotifyCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getClickKeyInSportCount() {
            return this.clickKeyInSportCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getClickTouchInSportCount() {
            return this.clickTouchInSportCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getCountdownCount() {
            return this.countdownCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getCountdownFromXiaoai() {
            return this.countdownFromXiaoai_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getCustomOfXiaoai() {
            return this.customOfXiaoai_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getCyclingCount() {
            return this.cyclingCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getDial2Xiaoai() {
            return this.dial2Xiaoai_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getDialId() {
            return this.dialId_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getEMAILNotifyCount() {
            return this.eMAILNotifyCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getExerciseCount() {
            return this.exerciseCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getFactoryPageCount() {
            return this.factoryPageCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getFindPhoneCount() {
            return this.findPhoneCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getHeartrateDetails() {
            return this.heartrateDetails_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getHeartrateFailPage() {
            return this.heartrateFailPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getHighHeartrateNotifyCount() {
            return this.highHeartrateNotifyCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getIndoorRunningCount() {
            return this.indoorRunningCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getLcdOnBecauseOfEvent() {
            return this.lcdOnBecauseOfEvent_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getLcdOnBecauseOfNotify() {
            return this.lcdOnBecauseOfNotify_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getLcdOnBecauseOfPress() {
            return this.lcdOnBecauseOfPress_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getLongpressKeyInSportCount() {
            return this.longpressKeyInSportCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getLongpressTouchInSportCount() {
            return this.longpressTouchInSportCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getMSMNotifyCount() {
            return this.mSMNotifyCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getMissCallCount() {
            return this.missCallCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getMoreListPage() {
            return this.moreListPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getMusicNextCount() {
            return this.musicNextCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getMusicPageCount() {
            return this.musicPageCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getMusicVolumeCount() {
            return this.musicVolumeCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getNotifyDetails() {
            return this.notifyDetails_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getOpenLcdAfterNotif() {
            return this.openLcdAfterNotif_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getOutsideRunningCount() {
            return this.outsideRunningCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getPaiDetails() {
            return this.paiDetails_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getPaiEntrance() {
            return this.paiEntrance_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getPaiInfo() {
            return this.paiInfo_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getPasswordFactoryCount() {
            return this.passwordFactoryCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getPasswordPageCount() {
            return this.passwordPageCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getPhoneAlarmNotifyCount() {
            return this.phoneAlarmNotifyCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getPhoneSilenceBell() {
            return this.phoneSilenceBell_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getPhoneSilenceCount() {
            return this.phoneSilenceCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getPhoneSilenceMuteCount() {
            return this.phoneSilenceMuteCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getReachNotifyCount() {
            return this.reachNotifyCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getRedBagNotifyCount() {
            return this.redBagNotifyCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getRemindFromXiaoai() {
            return this.remindFromXiaoai_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getRemindNotifyCount() {
            return this.remindNotifyCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getRightSlidingInSportCount() {
            return this.rightSlidingInSportCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getSedentaryExplainPage() {
            return this.sedentaryExplainPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getSilenceNormalModeCount() {
            return this.silenceNormalModeCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getSilenceOffModeCount() {
            return this.silenceOffModeCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getSilencePageCount() {
            return this.silencePageCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getSilenceSmartModeCount() {
            return this.silenceSmartModeCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getSkipGpsLocationCount() {
            return this.skipGpsLocationCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getSportDisconnectCount() {
            return this.sportDisconnectCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getSportScreenCount() {
            return this.sportScreenCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getSportScreenDisconnectCount() {
            return this.sportScreenDisconnectCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getStatusDetails() {
            return this.statusDetails_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getStopwatchCount() {
            return this.stopwatchCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getStopwatchMarkCount() {
            return this.stopwatchMarkCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getStopwatchMarkDisCount() {
            return this.stopwatchMarkDisCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getSwimmingCount() {
            return this.swimmingCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getWaitGpsLocationCount() {
            return this.waitGpsLocationCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getWalkingCount() {
            return this.walkingCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getWeatherDetails() {
            return this.weatherDetails_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getWeatherFromXiaoai() {
            return this.weatherFromXiaoai_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public int getWeatherNotifyCount() {
            return this.weatherNotifyCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasActiveCardFailCount() {
            return (this.bitField1_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasActiveCardSuccessCount() {
            return (this.bitField1_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasAlarmFromXiaoai() {
            return (this.bitField1_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasAlarmListCount() {
            return (this.bitField0_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasAlarmPageBackCount() {
            return (this.bitField0_ & AMapEngineUtils.HALF_MAX_P20_WIDTH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasAlarmPageCount() {
            return (this.bitField1_ & Integer.MIN_VALUE) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasAlarmPageLazyCount() {
            return (this.bitField0_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasAlarmPageOffCount() {
            return (this.bitField0_ & 67108864) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasAlipayCode128Count() {
            return (this.bitField1_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasAlipayPageCount() {
            return (this.bitField1_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasAlipayQRCodeCount() {
            return (this.bitField1_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasCallHangCount() {
            return (this.bitField1_ & 536870912) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasCallIgnoreCount() {
            return (this.bitField1_ & 268435456) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasCardPageCount() {
            return (this.bitField1_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasCareNotifyCount() {
            return (this.bitField2_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasClickKeyInSportCount() {
            return (this.bitField1_ & 1048576) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasClickTouchInSportCount() {
            return (this.bitField1_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasCountdownCount() {
            return (this.bitField1_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasCountdownFromXiaoai() {
            return (this.bitField1_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasCustomOfXiaoai() {
            return (this.bitField1_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasCyclingCount() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasDial2Xiaoai() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasDialId() {
            return (this.bitField2_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasEMAILNotifyCount() {
            return (this.bitField2_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasExerciseCount() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasFactoryPageCount() {
            return (this.bitField1_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasFindPhoneCount() {
            return (this.bitField1_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasHeartrateDetails() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasHeartrateFailPage() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasHighHeartrateNotifyCount() {
            return (this.bitField2_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasIndoorRunningCount() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfEvent() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfNotify() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfPress() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasLongpressKeyInSportCount() {
            return (this.bitField1_ & 8388608) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasLongpressTouchInSportCount() {
            return (this.bitField1_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasMSMNotifyCount() {
            return (this.bitField2_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasMissCallCount() {
            return (this.bitField2_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasMoreListPage() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasMusicNextCount() {
            return (this.bitField0_ & 1073741824) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasMusicPageCount() {
            return (this.bitField0_ & 268435456) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasMusicVolumeCount() {
            return (this.bitField0_ & 536870912) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasNotifyDetails() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasOpenLcdAfterNotif() {
            return (this.bitField1_ & 1073741824) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasOutsideRunningCount() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasPaiDetails() {
            return (this.bitField2_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasPaiEntrance() {
            return (this.bitField2_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasPaiInfo() {
            return (this.bitField2_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasPasswordFactoryCount() {
            return (this.bitField1_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasPasswordPageCount() {
            return (this.bitField1_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasPhoneAlarmNotifyCount() {
            return (this.bitField2_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasPhoneSilenceBell() {
            return (this.bitField1_ & AMapEngineUtils.HALF_MAX_P20_WIDTH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasPhoneSilenceCount() {
            return (this.bitField1_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasPhoneSilenceMuteCount() {
            return (this.bitField1_ & 67108864) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasReachNotifyCount() {
            return (this.bitField2_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasRedBagNotifyCount() {
            return (this.bitField2_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasRemindFromXiaoai() {
            return (this.bitField1_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasRemindNotifyCount() {
            return (this.bitField2_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasRightSlidingInSportCount() {
            return (this.bitField1_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasSedentaryExplainPage() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasSilenceNormalModeCount() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasSilenceOffModeCount() {
            return (this.bitField0_ & 8388608) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasSilencePageCount() {
            return (this.bitField0_ & 1048576) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasSilenceSmartModeCount() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasSkipGpsLocationCount() {
            return (this.bitField1_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasSportDisconnectCount() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasSportScreenCount() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasSportScreenDisconnectCount() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasStatusDetails() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasStopwatchCount() {
            return (this.bitField0_ & Integer.MIN_VALUE) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasStopwatchMarkCount() {
            return (this.bitField1_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasStopwatchMarkDisCount() {
            return (this.bitField1_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasSwimmingCount() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasWaitGpsLocationCount() {
            return (this.bitField1_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasWalkingCount() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasWeatherDetails() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasWeatherFromXiaoai() {
            return (this.bitField1_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasWeatherNotifyCount() {
            return (this.bitField2_ & 8) != 0;
        }

        public static Builder newBuilder(CincoEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static CincoEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CincoEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static CincoEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CincoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static CincoEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (CincoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static CincoEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CincoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static CincoEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (CincoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static CincoEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CincoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static CincoEventMessage parseFrom(InputStream input) throws IOException {
            return (CincoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static CincoEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CincoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static CincoEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (CincoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static CincoEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CincoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface CincoEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getActiveCardFailCount();

        int getActiveCardSuccessCount();

        int getAlarmFromXiaoai();

        int getAlarmListCount();

        int getAlarmPageBackCount();

        int getAlarmPageCount();

        int getAlarmPageLazyCount();

        int getAlarmPageOffCount();

        int getAlipayCode128Count();

        int getAlipayPageCount();

        int getAlipayQRCodeCount();

        int getCallHangCount();

        int getCallIgnoreCount();

        int getCardPageCount();

        int getCareNotifyCount();

        int getClickKeyInSportCount();

        int getClickTouchInSportCount();

        int getCountdownCount();

        int getCountdownFromXiaoai();

        int getCustomOfXiaoai();

        int getCyclingCount();

        int getDial2Xiaoai();

        int getDialId();

        int getEMAILNotifyCount();

        int getExerciseCount();

        int getFactoryPageCount();

        int getFindPhoneCount();

        int getHeartrateDetails();

        int getHeartrateFailPage();

        int getHighHeartrateNotifyCount();

        int getIndoorRunningCount();

        int getLcdOnBecauseOfEvent();

        int getLcdOnBecauseOfNotify();

        int getLcdOnBecauseOfPress();

        int getLongpressKeyInSportCount();

        int getLongpressTouchInSportCount();

        int getMSMNotifyCount();

        int getMissCallCount();

        int getMoreListPage();

        int getMusicNextCount();

        int getMusicPageCount();

        int getMusicVolumeCount();

        int getNotifyDetails();

        int getOpenLcdAfterNotif();

        int getOutsideRunningCount();

        int getPaiDetails();

        int getPaiEntrance();

        int getPaiInfo();

        int getPasswordFactoryCount();

        int getPasswordPageCount();

        int getPhoneAlarmNotifyCount();

        int getPhoneSilenceBell();

        int getPhoneSilenceCount();

        int getPhoneSilenceMuteCount();

        int getReachNotifyCount();

        int getRedBagNotifyCount();

        int getRemindFromXiaoai();

        int getRemindNotifyCount();

        int getRightSlidingInSportCount();

        int getSedentaryExplainPage();

        int getSilenceNormalModeCount();

        int getSilenceOffModeCount();

        int getSilencePageCount();

        int getSilenceSmartModeCount();

        int getSkipGpsLocationCount();

        int getSportDisconnectCount();

        int getSportScreenCount();

        int getSportScreenDisconnectCount();

        int getStatusDetails();

        int getStopwatchCount();

        int getStopwatchMarkCount();

        int getStopwatchMarkDisCount();

        int getSwimmingCount();

        int getWaitGpsLocationCount();

        int getWalkingCount();

        int getWeatherDetails();

        int getWeatherFromXiaoai();

        int getWeatherNotifyCount();

        boolean hasActiveCardFailCount();

        boolean hasActiveCardSuccessCount();

        boolean hasAlarmFromXiaoai();

        boolean hasAlarmListCount();

        boolean hasAlarmPageBackCount();

        boolean hasAlarmPageCount();

        boolean hasAlarmPageLazyCount();

        boolean hasAlarmPageOffCount();

        boolean hasAlipayCode128Count();

        boolean hasAlipayPageCount();

        boolean hasAlipayQRCodeCount();

        boolean hasCallHangCount();

        boolean hasCallIgnoreCount();

        boolean hasCardPageCount();

        boolean hasCareNotifyCount();

        boolean hasClickKeyInSportCount();

        boolean hasClickTouchInSportCount();

        boolean hasCountdownCount();

        boolean hasCountdownFromXiaoai();

        boolean hasCustomOfXiaoai();

        boolean hasCyclingCount();

        boolean hasDial2Xiaoai();

        boolean hasDialId();

        boolean hasEMAILNotifyCount();

        boolean hasExerciseCount();

        boolean hasFactoryPageCount();

        boolean hasFindPhoneCount();

        boolean hasHeartrateDetails();

        boolean hasHeartrateFailPage();

        boolean hasHighHeartrateNotifyCount();

        boolean hasIndoorRunningCount();

        boolean hasLcdOnBecauseOfEvent();

        boolean hasLcdOnBecauseOfNotify();

        boolean hasLcdOnBecauseOfPress();

        boolean hasLongpressKeyInSportCount();

        boolean hasLongpressTouchInSportCount();

        boolean hasMSMNotifyCount();

        boolean hasMissCallCount();

        boolean hasMoreListPage();

        boolean hasMusicNextCount();

        boolean hasMusicPageCount();

        boolean hasMusicVolumeCount();

        boolean hasNotifyDetails();

        boolean hasOpenLcdAfterNotif();

        boolean hasOutsideRunningCount();

        boolean hasPaiDetails();

        boolean hasPaiEntrance();

        boolean hasPaiInfo();

        boolean hasPasswordFactoryCount();

        boolean hasPasswordPageCount();

        boolean hasPhoneAlarmNotifyCount();

        boolean hasPhoneSilenceBell();

        boolean hasPhoneSilenceCount();

        boolean hasPhoneSilenceMuteCount();

        boolean hasReachNotifyCount();

        boolean hasRedBagNotifyCount();

        boolean hasRemindFromXiaoai();

        boolean hasRemindNotifyCount();

        boolean hasRightSlidingInSportCount();

        boolean hasSedentaryExplainPage();

        boolean hasSilenceNormalModeCount();

        boolean hasSilenceOffModeCount();

        boolean hasSilencePageCount();

        boolean hasSilenceSmartModeCount();

        boolean hasSkipGpsLocationCount();

        boolean hasSportDisconnectCount();

        boolean hasSportScreenCount();

        boolean hasSportScreenDisconnectCount();

        boolean hasStatusDetails();

        boolean hasStopwatchCount();

        boolean hasStopwatchMarkCount();

        boolean hasStopwatchMarkDisCount();

        boolean hasSwimmingCount();

        boolean hasWaitGpsLocationCount();

        boolean hasWalkingCount();

        boolean hasWeatherDetails();

        boolean hasWeatherFromXiaoai();

        boolean hasWeatherNotifyCount();
    }

    public static final class CincoStatisticsMessage extends GeneratedMessageLite<CincoStatisticsMessage, Builder> implements CincoStatisticsMessageOrBuilder {
        public static final int ALIPAYBIND_FIELD_NUMBER = 4;
        public static final int ALIPAY_EVENT_FIELD_NUMBER = 7;
        public static final int BACKLIGHTLEVEL_FIELD_NUMBER = 3;
        public static final int BASE_FIELD_NUMBER = 1;
        private static final CincoStatisticsMessage DEFAULT_INSTANCE;
        public static final int EVENT_FIELD_NUMBER = 5;
        public static final int NFC_FIELD_NUMBER = 6;
        private static volatile Parser<CincoStatisticsMessage> PARSER = null;
        public static final int SILENCEMODE_FIELD_NUMBER = 2;
        private AlipayEvent.CincoAlipayEventMessage alipayEvent_;
        private boolean alipaybind_;
        private int backlightLevel_;
        private StatisBase.StatisBaseMessage base_;
        private int bitField0_;
        private CincoEventMessage event_;
        private byte memoizedIsInitialized = 2;
        private Nfc.NfcMessage nfc_;
        private int silenceMode_;

        public static final class Builder extends GeneratedMessageLite.Builder<CincoStatisticsMessage, Builder> implements CincoStatisticsMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAlipayEvent() {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).clearAlipayEvent();
                return this;
            }

            public Builder clearAlipaybind() {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).clearAlipaybind();
                return this;
            }

            public Builder clearBacklightLevel() {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).clearBacklightLevel();
                return this;
            }

            public Builder clearBase() {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).clearBase();
                return this;
            }

            public Builder clearEvent() {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).clearEvent();
                return this;
            }

            public Builder clearNfc() {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).clearNfc();
                return this;
            }

            public Builder clearSilenceMode() {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).clearSilenceMode();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoStatisticsMessageOrBuilder
            public AlipayEvent.CincoAlipayEventMessage getAlipayEvent() {
                return ((CincoStatisticsMessage) this.instance).getAlipayEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoStatisticsMessageOrBuilder
            public boolean getAlipaybind() {
                return ((CincoStatisticsMessage) this.instance).getAlipaybind();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoStatisticsMessageOrBuilder
            public int getBacklightLevel() {
                return ((CincoStatisticsMessage) this.instance).getBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoStatisticsMessageOrBuilder
            public StatisBase.StatisBaseMessage getBase() {
                return ((CincoStatisticsMessage) this.instance).getBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoStatisticsMessageOrBuilder
            public CincoEventMessage getEvent() {
                return ((CincoStatisticsMessage) this.instance).getEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoStatisticsMessageOrBuilder
            public Nfc.NfcMessage getNfc() {
                return ((CincoStatisticsMessage) this.instance).getNfc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoStatisticsMessageOrBuilder
            public SilenceModeOuterClass.SilenceMode getSilenceMode() {
                return ((CincoStatisticsMessage) this.instance).getSilenceMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoStatisticsMessageOrBuilder
            public boolean hasAlipayEvent() {
                return ((CincoStatisticsMessage) this.instance).hasAlipayEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoStatisticsMessageOrBuilder
            public boolean hasAlipaybind() {
                return ((CincoStatisticsMessage) this.instance).hasAlipaybind();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoStatisticsMessageOrBuilder
            public boolean hasBacklightLevel() {
                return ((CincoStatisticsMessage) this.instance).hasBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoStatisticsMessageOrBuilder
            public boolean hasBase() {
                return ((CincoStatisticsMessage) this.instance).hasBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoStatisticsMessageOrBuilder
            public boolean hasEvent() {
                return ((CincoStatisticsMessage) this.instance).hasEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoStatisticsMessageOrBuilder
            public boolean hasNfc() {
                return ((CincoStatisticsMessage) this.instance).hasNfc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoStatisticsMessageOrBuilder
            public boolean hasSilenceMode() {
                return ((CincoStatisticsMessage) this.instance).hasSilenceMode();
            }

            public Builder mergeAlipayEvent(AlipayEvent.CincoAlipayEventMessage value) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).mergeAlipayEvent(value);
                return this;
            }

            public Builder mergeBase(StatisBase.StatisBaseMessage value) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).mergeBase(value);
                return this;
            }

            public Builder mergeEvent(CincoEventMessage value) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).mergeEvent(value);
                return this;
            }

            public Builder mergeNfc(Nfc.NfcMessage value) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).mergeNfc(value);
                return this;
            }

            public Builder setAlipayEvent(AlipayEvent.CincoAlipayEventMessage value) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).setAlipayEvent(value);
                return this;
            }

            public Builder setAlipaybind(boolean value) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).setAlipaybind(value);
                return this;
            }

            public Builder setBacklightLevel(int value) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).setBacklightLevel(value);
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage value) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).setBase(value);
                return this;
            }

            public Builder setEvent(CincoEventMessage value) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).setEvent(value);
                return this;
            }

            public Builder setNfc(Nfc.NfcMessage value) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).setNfc(value);
                return this;
            }

            public Builder setSilenceMode(SilenceModeOuterClass.SilenceMode value) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).setSilenceMode(value);
                return this;
            }

            private Builder() {
                super(CincoStatisticsMessage.DEFAULT_INSTANCE);
            }

            public Builder setAlipayEvent(AlipayEvent.CincoAlipayEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).setAlipayEvent(builderForValue.build());
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage.Builder builderForValue) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).setBase(builderForValue.build());
                return this;
            }

            public Builder setEvent(CincoEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).setEvent(builderForValue.build());
                return this;
            }

            public Builder setNfc(Nfc.NfcMessage.Builder builderForValue) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).setNfc(builderForValue.build());
                return this;
            }
        }

        static {
            CincoStatisticsMessage cincoStatisticsMessage = new CincoStatisticsMessage();
            DEFAULT_INSTANCE = cincoStatisticsMessage;
            GeneratedMessageLite.registerDefaultInstance(CincoStatisticsMessage.class, cincoStatisticsMessage);
        }

        private CincoStatisticsMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayEvent() {
            this.alipayEvent_ = null;
            this.bitField0_ &= -65;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipaybind() {
            this.bitField0_ &= -9;
            this.alipaybind_ = false;
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
            this.bitField0_ &= -17;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNfc() {
            this.nfc_ = null;
            this.bitField0_ &= -33;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSilenceMode() {
            this.bitField0_ &= -3;
            this.silenceMode_ = 0;
        }

        public static CincoStatisticsMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAlipayEvent(AlipayEvent.CincoAlipayEventMessage value) {
            value.getClass();
            AlipayEvent.CincoAlipayEventMessage cincoAlipayEventMessage = this.alipayEvent_;
            if (cincoAlipayEventMessage == null || cincoAlipayEventMessage == AlipayEvent.CincoAlipayEventMessage.getDefaultInstance()) {
                this.alipayEvent_ = value;
            } else {
                this.alipayEvent_ = AlipayEvent.CincoAlipayEventMessage.newBuilder(this.alipayEvent_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 64;
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
        public void mergeEvent(CincoEventMessage value) {
            value.getClass();
            CincoEventMessage cincoEventMessage = this.event_;
            if (cincoEventMessage == null || cincoEventMessage == CincoEventMessage.getDefaultInstance()) {
                this.event_ = value;
            } else {
                this.event_ = CincoEventMessage.newBuilder(this.event_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 16;
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
            this.bitField0_ |= 32;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CincoStatisticsMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (CincoStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static CincoStatisticsMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (CincoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<CincoStatisticsMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayEvent(AlipayEvent.CincoAlipayEventMessage value) {
            value.getClass();
            this.alipayEvent_ = value;
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipaybind(boolean value) {
            this.bitField0_ |= 8;
            this.alipaybind_ = value;
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
        public void setEvent(CincoEventMessage value) {
            value.getClass();
            this.event_ = value;
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNfc(Nfc.NfcMessage value) {
            value.getClass();
            this.nfc_ = value;
            this.bitField0_ |= 32;
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
                    return new CincoStatisticsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0007\u0001ᔉ\u0000\u0002ᔌ\u0001\u0003ᔋ\u0002\u0004ᔇ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"bitField0_", "base_", "silenceMode_", SilenceModeOuterClass.SilenceMode.internalGetVerifier(), "backlightLevel_", "alipaybind_", "event_", "nfc_", "alipayEvent_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<CincoStatisticsMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (CincoStatisticsMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoStatisticsMessageOrBuilder
        public AlipayEvent.CincoAlipayEventMessage getAlipayEvent() {
            AlipayEvent.CincoAlipayEventMessage cincoAlipayEventMessage = this.alipayEvent_;
            return cincoAlipayEventMessage == null ? AlipayEvent.CincoAlipayEventMessage.getDefaultInstance() : cincoAlipayEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoStatisticsMessageOrBuilder
        public boolean getAlipaybind() {
            return this.alipaybind_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoStatisticsMessageOrBuilder
        public int getBacklightLevel() {
            return this.backlightLevel_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoStatisticsMessageOrBuilder
        public StatisBase.StatisBaseMessage getBase() {
            StatisBase.StatisBaseMessage statisBaseMessage = this.base_;
            return statisBaseMessage == null ? StatisBase.StatisBaseMessage.getDefaultInstance() : statisBaseMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoStatisticsMessageOrBuilder
        public CincoEventMessage getEvent() {
            CincoEventMessage cincoEventMessage = this.event_;
            return cincoEventMessage == null ? CincoEventMessage.getDefaultInstance() : cincoEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoStatisticsMessageOrBuilder
        public Nfc.NfcMessage getNfc() {
            Nfc.NfcMessage nfcMessage = this.nfc_;
            return nfcMessage == null ? Nfc.NfcMessage.getDefaultInstance() : nfcMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoStatisticsMessageOrBuilder
        public SilenceModeOuterClass.SilenceMode getSilenceMode() {
            SilenceModeOuterClass.SilenceMode silenceModeForNumber = SilenceModeOuterClass.SilenceMode.forNumber(this.silenceMode_);
            return silenceModeForNumber == null ? SilenceModeOuterClass.SilenceMode.OFF : silenceModeForNumber;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoStatisticsMessageOrBuilder
        public boolean hasAlipayEvent() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoStatisticsMessageOrBuilder
        public boolean hasAlipaybind() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoStatisticsMessageOrBuilder
        public boolean hasBacklightLevel() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoStatisticsMessageOrBuilder
        public boolean hasBase() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoStatisticsMessageOrBuilder
        public boolean hasEvent() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoStatisticsMessageOrBuilder
        public boolean hasNfc() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoStatisticsMessageOrBuilder
        public boolean hasSilenceMode() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(CincoStatisticsMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static CincoStatisticsMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CincoStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static CincoStatisticsMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CincoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static CincoStatisticsMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (CincoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static CincoStatisticsMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CincoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static CincoStatisticsMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (CincoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static CincoStatisticsMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (CincoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static CincoStatisticsMessage parseFrom(InputStream input) throws IOException {
            return (CincoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static CincoStatisticsMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CincoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static CincoStatisticsMessage parseFrom(CodedInputStream input) throws IOException {
            return (CincoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static CincoStatisticsMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (CincoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface CincoStatisticsMessageOrBuilder extends MessageLiteOrBuilder {
        AlipayEvent.CincoAlipayEventMessage getAlipayEvent();

        boolean getAlipaybind();

        int getBacklightLevel();

        StatisBase.StatisBaseMessage getBase();

        CincoEventMessage getEvent();

        Nfc.NfcMessage getNfc();

        SilenceModeOuterClass.SilenceMode getSilenceMode();

        boolean hasAlipayEvent();

        boolean hasAlipaybind();

        boolean hasBacklightLevel();

        boolean hasBase();

        boolean hasEvent();

        boolean hasNfc();

        boolean hasSilenceMode();
    }

    private Cinco() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }
}
