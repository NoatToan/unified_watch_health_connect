package com.xiaomi.hm.health.bt.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.j;
import com.google.protobuf.q0;
import com.google.protobuf.t;
import com.mi.fitness.netproxy.NetProxyComponentKt;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import defpackage.bsf;
import defpackage.vkh;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
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
        private static volatile vkh<CincoEventMessage> PARSER = null;
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

        public static final class Builder extends GeneratedMessageLite.a<CincoEventMessage, Builder> implements CincoEventMessageOrBuilder {
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

            public Builder setActiveCardFailCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setActiveCardFailCount(i);
                return this;
            }

            public Builder setActiveCardSuccessCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setActiveCardSuccessCount(i);
                return this;
            }

            public Builder setAlarmFromXiaoai(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setAlarmFromXiaoai(i);
                return this;
            }

            public Builder setAlarmListCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setAlarmListCount(i);
                return this;
            }

            public Builder setAlarmPageBackCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setAlarmPageBackCount(i);
                return this;
            }

            public Builder setAlarmPageCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setAlarmPageCount(i);
                return this;
            }

            public Builder setAlarmPageLazyCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setAlarmPageLazyCount(i);
                return this;
            }

            public Builder setAlarmPageOffCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setAlarmPageOffCount(i);
                return this;
            }

            public Builder setAlipayCode128Count(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setAlipayCode128Count(i);
                return this;
            }

            public Builder setAlipayPageCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setAlipayPageCount(i);
                return this;
            }

            public Builder setAlipayQRCodeCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setAlipayQRCodeCount(i);
                return this;
            }

            public Builder setCallHangCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setCallHangCount(i);
                return this;
            }

            public Builder setCallIgnoreCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setCallIgnoreCount(i);
                return this;
            }

            public Builder setCardPageCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setCardPageCount(i);
                return this;
            }

            public Builder setCareNotifyCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setCareNotifyCount(i);
                return this;
            }

            public Builder setClickKeyInSportCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setClickKeyInSportCount(i);
                return this;
            }

            public Builder setClickTouchInSportCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setClickTouchInSportCount(i);
                return this;
            }

            public Builder setCountdownCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setCountdownCount(i);
                return this;
            }

            public Builder setCountdownFromXiaoai(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setCountdownFromXiaoai(i);
                return this;
            }

            public Builder setCustomOfXiaoai(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setCustomOfXiaoai(i);
                return this;
            }

            public Builder setCyclingCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setCyclingCount(i);
                return this;
            }

            public Builder setDial2Xiaoai(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setDial2Xiaoai(i);
                return this;
            }

            public Builder setDialId(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setDialId(i);
                return this;
            }

            public Builder setEMAILNotifyCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setEMAILNotifyCount(i);
                return this;
            }

            public Builder setExerciseCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setExerciseCount(i);
                return this;
            }

            public Builder setFactoryPageCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setFactoryPageCount(i);
                return this;
            }

            public Builder setFindPhoneCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setFindPhoneCount(i);
                return this;
            }

            public Builder setHeartrateDetails(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setHeartrateDetails(i);
                return this;
            }

            public Builder setHeartrateFailPage(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setHeartrateFailPage(i);
                return this;
            }

            public Builder setHighHeartrateNotifyCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setHighHeartrateNotifyCount(i);
                return this;
            }

            public Builder setIndoorRunningCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setIndoorRunningCount(i);
                return this;
            }

            public Builder setLcdOnBecauseOfEvent(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setLcdOnBecauseOfEvent(i);
                return this;
            }

            public Builder setLcdOnBecauseOfNotify(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setLcdOnBecauseOfNotify(i);
                return this;
            }

            public Builder setLcdOnBecauseOfPress(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setLcdOnBecauseOfPress(i);
                return this;
            }

            public Builder setLongpressKeyInSportCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setLongpressKeyInSportCount(i);
                return this;
            }

            public Builder setLongpressTouchInSportCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setLongpressTouchInSportCount(i);
                return this;
            }

            public Builder setMSMNotifyCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setMSMNotifyCount(i);
                return this;
            }

            public Builder setMissCallCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setMissCallCount(i);
                return this;
            }

            public Builder setMoreListPage(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setMoreListPage(i);
                return this;
            }

            public Builder setMusicNextCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setMusicNextCount(i);
                return this;
            }

            public Builder setMusicPageCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setMusicPageCount(i);
                return this;
            }

            public Builder setMusicVolumeCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setMusicVolumeCount(i);
                return this;
            }

            public Builder setNotifyDetails(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setNotifyDetails(i);
                return this;
            }

            public Builder setOpenLcdAfterNotif(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setOpenLcdAfterNotif(i);
                return this;
            }

            public Builder setOutsideRunningCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setOutsideRunningCount(i);
                return this;
            }

            public Builder setPaiDetails(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setPaiDetails(i);
                return this;
            }

            public Builder setPaiEntrance(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setPaiEntrance(i);
                return this;
            }

            public Builder setPaiInfo(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setPaiInfo(i);
                return this;
            }

            public Builder setPasswordFactoryCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setPasswordFactoryCount(i);
                return this;
            }

            public Builder setPasswordPageCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setPasswordPageCount(i);
                return this;
            }

            public Builder setPhoneAlarmNotifyCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setPhoneAlarmNotifyCount(i);
                return this;
            }

            public Builder setPhoneSilenceBell(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setPhoneSilenceBell(i);
                return this;
            }

            public Builder setPhoneSilenceCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setPhoneSilenceCount(i);
                return this;
            }

            public Builder setPhoneSilenceMuteCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setPhoneSilenceMuteCount(i);
                return this;
            }

            public Builder setReachNotifyCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setReachNotifyCount(i);
                return this;
            }

            public Builder setRedBagNotifyCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setRedBagNotifyCount(i);
                return this;
            }

            public Builder setRemindFromXiaoai(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setRemindFromXiaoai(i);
                return this;
            }

            public Builder setRemindNotifyCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setRemindNotifyCount(i);
                return this;
            }

            public Builder setRightSlidingInSportCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setRightSlidingInSportCount(i);
                return this;
            }

            public Builder setSedentaryExplainPage(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setSedentaryExplainPage(i);
                return this;
            }

            public Builder setSilenceNormalModeCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setSilenceNormalModeCount(i);
                return this;
            }

            public Builder setSilenceOffModeCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setSilenceOffModeCount(i);
                return this;
            }

            public Builder setSilencePageCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setSilencePageCount(i);
                return this;
            }

            public Builder setSilenceSmartModeCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setSilenceSmartModeCount(i);
                return this;
            }

            public Builder setSkipGpsLocationCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setSkipGpsLocationCount(i);
                return this;
            }

            public Builder setSportDisconnectCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setSportDisconnectCount(i);
                return this;
            }

            public Builder setSportScreenCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setSportScreenCount(i);
                return this;
            }

            public Builder setSportScreenDisconnectCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setSportScreenDisconnectCount(i);
                return this;
            }

            public Builder setStatusDetails(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setStatusDetails(i);
                return this;
            }

            public Builder setStopwatchCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setStopwatchCount(i);
                return this;
            }

            public Builder setStopwatchMarkCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setStopwatchMarkCount(i);
                return this;
            }

            public Builder setStopwatchMarkDisCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setStopwatchMarkDisCount(i);
                return this;
            }

            public Builder setSwimmingCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setSwimmingCount(i);
                return this;
            }

            public Builder setWaitGpsLocationCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setWaitGpsLocationCount(i);
                return this;
            }

            public Builder setWalkingCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setWalkingCount(i);
                return this;
            }

            public Builder setWeatherDetails(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setWeatherDetails(i);
                return this;
            }

            public Builder setWeatherFromXiaoai(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setWeatherFromXiaoai(i);
                return this;
            }

            public Builder setWeatherNotifyCount(int i) {
                copyOnWrite();
                ((CincoEventMessage) this.instance).setWeatherNotifyCount(i);
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

        public static CincoEventMessage parseDelimitedFrom(InputStream inputStream) {
            return (CincoEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CincoEventMessage parseFrom(ByteBuffer byteBuffer) {
            return (CincoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<CincoEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActiveCardFailCount(int i) {
            this.bitField1_ |= 128;
            this.activeCardFailCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActiveCardSuccessCount(int i) {
            this.bitField1_ |= 64;
            this.activeCardSuccessCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmFromXiaoai(int i) {
            this.bitField1_ |= 32768;
            this.alarmFromXiaoai_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmListCount(int i) {
            this.bitField0_ |= 16777216;
            this.alarmListCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmPageBackCount(int i) {
            this.bitField0_ |= 134217728;
            this.alarmPageBackCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmPageCount(int i) {
            this.bitField1_ |= Integer.MIN_VALUE;
            this.alarmPageCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmPageLazyCount(int i) {
            this.bitField0_ |= 33554432;
            this.alarmPageLazyCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmPageOffCount(int i) {
            this.bitField0_ |= 67108864;
            this.alarmPageOffCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCode128Count(int i) {
            this.bitField1_ |= 1024;
            this.alipayCode128Count_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayPageCount(int i) {
            this.bitField1_ |= 256;
            this.alipayPageCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRCodeCount(int i) {
            this.bitField1_ |= 512;
            this.alipayQRCodeCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallHangCount(int i) {
            this.bitField1_ |= 536870912;
            this.callHangCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallIgnoreCount(int i) {
            this.bitField1_ |= 268435456;
            this.callIgnoreCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCardPageCount(int i) {
            this.bitField1_ |= 32;
            this.cardPageCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCareNotifyCount(int i) {
            this.bitField2_ |= 32;
            this.careNotifyCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClickKeyInSportCount(int i) {
            this.bitField1_ |= EventRecurrence.TH;
            this.clickKeyInSportCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setClickTouchInSportCount(int i) {
            this.bitField1_ |= 524288;
            this.clickTouchInSportCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountdownCount(int i) {
            this.bitField1_ |= 1;
            this.countdownCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountdownFromXiaoai(int i) {
            this.bitField1_ |= 131072;
            this.countdownFromXiaoai_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCustomOfXiaoai(int i) {
            this.bitField1_ |= 262144;
            this.customOfXiaoai_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCyclingCount(int i) {
            this.bitField0_ |= 1024;
            this.cyclingCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDial2Xiaoai(int i) {
            this.bitField0_ |= 8;
            this.dial2Xiaoai_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialId(int i) {
            this.bitField2_ |= 1024;
            this.dialId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEMAILNotifyCount(int i) {
            this.bitField2_ |= 4;
            this.eMAILNotifyCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExerciseCount(int i) {
            this.bitField0_ |= 4096;
            this.exerciseCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFactoryPageCount(int i) {
            this.bitField1_ |= 2048;
            this.factoryPageCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFindPhoneCount(int i) {
            this.bitField1_ |= 8;
            this.findPhoneCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeartrateDetails(int i) {
            this.bitField0_ |= 64;
            this.heartrateDetails_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeartrateFailPage(int i) {
            this.bitField0_ |= 128;
            this.heartrateFailPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHighHeartrateNotifyCount(int i) {
            this.bitField2_ |= 512;
            this.highHeartrateNotifyCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIndoorRunningCount(int i) {
            this.bitField0_ |= 512;
            this.indoorRunningCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOnBecauseOfEvent(int i) {
            this.bitField0_ |= 2;
            this.lcdOnBecauseOfEvent_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOnBecauseOfNotify(int i) {
            this.bitField0_ |= 4;
            this.lcdOnBecauseOfNotify_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOnBecauseOfPress(int i) {
            this.bitField0_ |= 1;
            this.lcdOnBecauseOfPress_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLongpressKeyInSportCount(int i) {
            this.bitField1_ |= NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
            this.longpressKeyInSportCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLongpressTouchInSportCount(int i) {
            this.bitField1_ |= 4194304;
            this.longpressTouchInSportCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMSMNotifyCount(int i) {
            this.bitField2_ |= 2;
            this.mSMNotifyCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMissCallCount(int i) {
            this.bitField2_ |= 1;
            this.missCallCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMoreListPage(int i) {
            this.bitField0_ |= 524288;
            this.moreListPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicNextCount(int i) {
            this.bitField0_ |= 1073741824;
            this.musicNextCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicPageCount(int i) {
            this.bitField0_ |= 268435456;
            this.musicPageCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicVolumeCount(int i) {
            this.bitField0_ |= 536870912;
            this.musicVolumeCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotifyDetails(int i) {
            this.bitField0_ |= 262144;
            this.notifyDetails_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOpenLcdAfterNotif(int i) {
            this.bitField1_ |= 1073741824;
            this.openLcdAfterNotif_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOutsideRunningCount(int i) {
            this.bitField0_ |= 256;
            this.outsideRunningCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaiDetails(int i) {
            this.bitField2_ |= 4096;
            this.paiDetails_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaiEntrance(int i) {
            this.bitField2_ |= 2048;
            this.paiEntrance_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaiInfo(int i) {
            this.bitField2_ |= 8192;
            this.paiInfo_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPasswordFactoryCount(int i) {
            this.bitField1_ |= 4096;
            this.passwordFactoryCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPasswordPageCount(int i) {
            this.bitField1_ |= 8192;
            this.passwordPageCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhoneAlarmNotifyCount(int i) {
            this.bitField2_ |= 256;
            this.phoneAlarmNotifyCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhoneSilenceBell(int i) {
            this.bitField1_ |= 134217728;
            this.phoneSilenceBell_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhoneSilenceCount(int i) {
            this.bitField1_ |= 16;
            this.phoneSilenceCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhoneSilenceMuteCount(int i) {
            this.bitField1_ |= 67108864;
            this.phoneSilenceMuteCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReachNotifyCount(int i) {
            this.bitField2_ |= 64;
            this.reachNotifyCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRedBagNotifyCount(int i) {
            this.bitField2_ |= 128;
            this.redBagNotifyCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemindFromXiaoai(int i) {
            this.bitField1_ |= 16384;
            this.remindFromXiaoai_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRemindNotifyCount(int i) {
            this.bitField2_ |= 16;
            this.remindNotifyCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRightSlidingInSportCount(int i) {
            this.bitField1_ |= 2097152;
            this.rightSlidingInSportCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSedentaryExplainPage(int i) {
            this.bitField0_ |= 32;
            this.sedentaryExplainPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSilenceNormalModeCount(int i) {
            this.bitField0_ |= 4194304;
            this.silenceNormalModeCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSilenceOffModeCount(int i) {
            this.bitField0_ |= NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
            this.silenceOffModeCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSilencePageCount(int i) {
            this.bitField0_ |= EventRecurrence.TH;
            this.silencePageCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSilenceSmartModeCount(int i) {
            this.bitField0_ |= 2097152;
            this.silenceSmartModeCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkipGpsLocationCount(int i) {
            this.bitField1_ |= 33554432;
            this.skipGpsLocationCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportDisconnectCount(int i) {
            this.bitField0_ |= 16384;
            this.sportDisconnectCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportScreenCount(int i) {
            this.bitField0_ |= 32768;
            this.sportScreenCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportScreenDisconnectCount(int i) {
            this.bitField0_ |= 65536;
            this.sportScreenDisconnectCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusDetails(int i) {
            this.bitField0_ |= 16;
            this.statusDetails_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopwatchCount(int i) {
            this.bitField0_ |= Integer.MIN_VALUE;
            this.stopwatchCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopwatchMarkCount(int i) {
            this.bitField1_ |= 2;
            this.stopwatchMarkCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopwatchMarkDisCount(int i) {
            this.bitField1_ |= 4;
            this.stopwatchMarkDisCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSwimmingCount(int i) {
            this.bitField0_ |= 8192;
            this.swimmingCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWaitGpsLocationCount(int i) {
            this.bitField1_ |= 16777216;
            this.waitGpsLocationCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWalkingCount(int i) {
            this.bitField0_ |= 2048;
            this.walkingCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeatherDetails(int i) {
            this.bitField0_ |= 131072;
            this.weatherDetails_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeatherFromXiaoai(int i) {
            this.bitField1_ |= 65536;
            this.weatherFromXiaoai_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeatherNotifyCount(int i) {
            this.bitField2_ |= 8;
            this.weatherNotifyCount_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new CincoEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001N\u0000\u0003\u0001RN\u0000\u0000K\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f\u0011ᔋ\u0010\u0012ᔋ\u0011\u0013ᔋ\u0012\u0014ᔋ\u0013\u0015ᔋ\u0014\u0016ᔋ\u0015\u0017ᔋ\u0016\u0018ᔋ\u0017\u0019ᔋ\u0018\u001aᔋ\u0019\u001bᔋ\u001a\u001cᔋ\u001b\u001dᔋ\u001c\u001eᔋ\u001d\u001fᔋ\u001e ᔋ\u001f!ᔋ \"ᔋ!#ᔋ\"$ᔋ#%ᔋ$&ᔋ%'ᔋ&(ᔋ')ᔋ(*ᔋ)+ᔋ*,ᔋ+-ᔋ,.ᔋ-/ᔋ.0ᔋ/1ᔋ02ᔋ13ᔋ24ᔋ35ᔋ46ᔋ57ᔋ68ᔋ79ᔋ8:ᔋ9;ᔋ:<ᔋ;=ᔋ<>ᔋ=?ᔋ>@ᔋ?Cᔋ@DᔋAEᔋBFᔋCGᔋDIᔋEJᔋFKᔋGLᔋHMᔋIOᔋJPဋKQဋLRဋM", new Object[]{"bitField0_", "bitField1_", "bitField2_", "lcdOnBecauseOfPress_", "lcdOnBecauseOfEvent_", "lcdOnBecauseOfNotify_", "dial2Xiaoai_", "statusDetails_", "sedentaryExplainPage_", "heartrateDetails_", "heartrateFailPage_", "outsideRunningCount_", "indoorRunningCount_", "cyclingCount_", "walkingCount_", "exerciseCount_", "swimmingCount_", "sportDisconnectCount_", "sportScreenCount_", "sportScreenDisconnectCount_", "weatherDetails_", "notifyDetails_", "moreListPage_", "silencePageCount_", "silenceSmartModeCount_", "silenceNormalModeCount_", "silenceOffModeCount_", "alarmListCount_", "alarmPageLazyCount_", "alarmPageOffCount_", "alarmPageBackCount_", "musicPageCount_", "musicVolumeCount_", "musicNextCount_", "stopwatchCount_", "countdownCount_", "stopwatchMarkCount_", "stopwatchMarkDisCount_", "findPhoneCount_", "phoneSilenceCount_", "cardPageCount_", "activeCardSuccessCount_", "activeCardFailCount_", "alipayPageCount_", "alipayQRCodeCount_", "alipayCode128Count_", "factoryPageCount_", "passwordFactoryCount_", "passwordPageCount_", "remindFromXiaoai_", "alarmFromXiaoai_", "weatherFromXiaoai_", "countdownFromXiaoai_", "customOfXiaoai_", "clickTouchInSportCount_", "clickKeyInSportCount_", "rightSlidingInSportCount_", "longpressTouchInSportCount_", "longpressKeyInSportCount_", "waitGpsLocationCount_", "skipGpsLocationCount_", "phoneSilenceMuteCount_", "phoneSilenceBell_", "callIgnoreCount_", "callHangCount_", "openLcdAfterNotif_", "alarmPageCount_", "missCallCount_", "mSMNotifyCount_", "eMAILNotifyCount_", "weatherNotifyCount_", "remindNotifyCount_", "careNotifyCount_", "reachNotifyCount_", "redBagNotifyCount_", "phoneAlarmNotifyCount_", "highHeartrateNotifyCount_", "dialId_", "paiEntrance_", "paiDetails_", "paiInfo_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<CincoEventMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (CincoEventMessage.class) {
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
            return (this.bitField0_ & 134217728) != 0;
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
            return (this.bitField1_ & EventRecurrence.TH) != 0;
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
            return (this.bitField1_ & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) != 0;
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
            return (this.bitField1_ & 134217728) != 0;
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
            return (this.bitField0_ & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Cinco.CincoEventMessageOrBuilder
        public boolean hasSilencePageCount() {
            return (this.bitField0_ & EventRecurrence.TH) != 0;
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

        public static Builder newBuilder(CincoEventMessage cincoEventMessage) {
            return DEFAULT_INSTANCE.createBuilder(cincoEventMessage);
        }

        public static CincoEventMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (CincoEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static CincoEventMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (CincoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static CincoEventMessage parseFrom(ByteString byteString) {
            return (CincoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CincoEventMessage parseFrom(ByteString byteString, t tVar) {
            return (CincoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static CincoEventMessage parseFrom(byte[] bArr) {
            return (CincoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CincoEventMessage parseFrom(byte[] bArr, t tVar) {
            return (CincoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static CincoEventMessage parseFrom(InputStream inputStream) {
            return (CincoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CincoEventMessage parseFrom(InputStream inputStream, t tVar) {
            return (CincoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static CincoEventMessage parseFrom(j jVar) {
            return (CincoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static CincoEventMessage parseFrom(j jVar, t tVar) {
            return (CincoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface CincoEventMessageOrBuilder extends bsf {
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

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

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

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class CincoStatisticsMessage extends GeneratedMessageLite<CincoStatisticsMessage, Builder> implements CincoStatisticsMessageOrBuilder {
        public static final int ALIPAYBIND_FIELD_NUMBER = 4;
        public static final int ALIPAY_EVENT_FIELD_NUMBER = 7;
        public static final int BACKLIGHTLEVEL_FIELD_NUMBER = 3;
        public static final int BASE_FIELD_NUMBER = 1;
        private static final CincoStatisticsMessage DEFAULT_INSTANCE;
        public static final int EVENT_FIELD_NUMBER = 5;
        public static final int NFC_FIELD_NUMBER = 6;
        private static volatile vkh<CincoStatisticsMessage> PARSER = null;
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

        public static final class Builder extends GeneratedMessageLite.a<CincoStatisticsMessage, Builder> implements CincoStatisticsMessageOrBuilder {
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

            public Builder mergeAlipayEvent(AlipayEvent.CincoAlipayEventMessage cincoAlipayEventMessage) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).mergeAlipayEvent(cincoAlipayEventMessage);
                return this;
            }

            public Builder mergeBase(StatisBase.StatisBaseMessage statisBaseMessage) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).mergeBase(statisBaseMessage);
                return this;
            }

            public Builder mergeEvent(CincoEventMessage cincoEventMessage) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).mergeEvent(cincoEventMessage);
                return this;
            }

            public Builder mergeNfc(Nfc.NfcMessage nfcMessage) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).mergeNfc(nfcMessage);
                return this;
            }

            public Builder setAlipayEvent(AlipayEvent.CincoAlipayEventMessage cincoAlipayEventMessage) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).setAlipayEvent(cincoAlipayEventMessage);
                return this;
            }

            public Builder setAlipaybind(boolean z) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).setAlipaybind(z);
                return this;
            }

            public Builder setBacklightLevel(int i) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).setBacklightLevel(i);
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage statisBaseMessage) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).setBase(statisBaseMessage);
                return this;
            }

            public Builder setEvent(CincoEventMessage cincoEventMessage) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).setEvent(cincoEventMessage);
                return this;
            }

            public Builder setNfc(Nfc.NfcMessage nfcMessage) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).setNfc(nfcMessage);
                return this;
            }

            public Builder setSilenceMode(SilenceModeOuterClass.SilenceMode silenceMode) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).setSilenceMode(silenceMode);
                return this;
            }

            private Builder() {
                super(CincoStatisticsMessage.DEFAULT_INSTANCE);
            }

            public Builder setAlipayEvent(AlipayEvent.CincoAlipayEventMessage.Builder builder) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).setAlipayEvent(builder.build());
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage.Builder builder) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).setBase(builder.build());
                return this;
            }

            public Builder setEvent(CincoEventMessage.Builder builder) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).setEvent(builder.build());
                return this;
            }

            public Builder setNfc(Nfc.NfcMessage.Builder builder) {
                copyOnWrite();
                ((CincoStatisticsMessage) this.instance).setNfc(builder.build());
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
        public void mergeAlipayEvent(AlipayEvent.CincoAlipayEventMessage cincoAlipayEventMessage) {
            cincoAlipayEventMessage.getClass();
            AlipayEvent.CincoAlipayEventMessage cincoAlipayEventMessage2 = this.alipayEvent_;
            if (cincoAlipayEventMessage2 == null || cincoAlipayEventMessage2 == AlipayEvent.CincoAlipayEventMessage.getDefaultInstance()) {
                this.alipayEvent_ = cincoAlipayEventMessage;
            } else {
                this.alipayEvent_ = AlipayEvent.CincoAlipayEventMessage.newBuilder(this.alipayEvent_).mergeFrom(cincoAlipayEventMessage).buildPartial();
            }
            this.bitField0_ |= 64;
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
        public void mergeEvent(CincoEventMessage cincoEventMessage) {
            cincoEventMessage.getClass();
            CincoEventMessage cincoEventMessage2 = this.event_;
            if (cincoEventMessage2 == null || cincoEventMessage2 == CincoEventMessage.getDefaultInstance()) {
                this.event_ = cincoEventMessage;
            } else {
                this.event_ = CincoEventMessage.newBuilder(this.event_).mergeFrom(cincoEventMessage).buildPartial();
            }
            this.bitField0_ |= 16;
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
            this.bitField0_ |= 32;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static CincoStatisticsMessage parseDelimitedFrom(InputStream inputStream) {
            return (CincoStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CincoStatisticsMessage parseFrom(ByteBuffer byteBuffer) {
            return (CincoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<CincoStatisticsMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayEvent(AlipayEvent.CincoAlipayEventMessage cincoAlipayEventMessage) {
            cincoAlipayEventMessage.getClass();
            this.alipayEvent_ = cincoAlipayEventMessage;
            this.bitField0_ |= 64;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipaybind(boolean z) {
            this.bitField0_ |= 8;
            this.alipaybind_ = z;
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
        public void setEvent(CincoEventMessage cincoEventMessage) {
            cincoEventMessage.getClass();
            this.event_ = cincoEventMessage;
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNfc(Nfc.NfcMessage nfcMessage) {
            nfcMessage.getClass();
            this.nfc_ = nfcMessage;
            this.bitField0_ |= 32;
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
                    return new CincoStatisticsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0007\u0001ᔉ\u0000\u0002ᔌ\u0001\u0003ᔋ\u0002\u0004ᔇ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005\u0007ᐉ\u0006", new Object[]{"bitField0_", "base_", "silenceMode_", SilenceModeOuterClass.SilenceMode.internalGetVerifier(), "backlightLevel_", "alipaybind_", "event_", "nfc_", "alipayEvent_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<CincoStatisticsMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (CincoStatisticsMessage.class) {
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

        public static Builder newBuilder(CincoStatisticsMessage cincoStatisticsMessage) {
            return DEFAULT_INSTANCE.createBuilder(cincoStatisticsMessage);
        }

        public static CincoStatisticsMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (CincoStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static CincoStatisticsMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (CincoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static CincoStatisticsMessage parseFrom(ByteString byteString) {
            return (CincoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static CincoStatisticsMessage parseFrom(ByteString byteString, t tVar) {
            return (CincoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static CincoStatisticsMessage parseFrom(byte[] bArr) {
            return (CincoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static CincoStatisticsMessage parseFrom(byte[] bArr, t tVar) {
            return (CincoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static CincoStatisticsMessage parseFrom(InputStream inputStream) {
            return (CincoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static CincoStatisticsMessage parseFrom(InputStream inputStream, t tVar) {
            return (CincoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static CincoStatisticsMessage parseFrom(j jVar) {
            return (CincoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static CincoStatisticsMessage parseFrom(j jVar, t tVar) {
            return (CincoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface CincoStatisticsMessageOrBuilder extends bsf {
        AlipayEvent.CincoAlipayEventMessage getAlipayEvent();

        boolean getAlipaybind();

        int getBacklightLevel();

        StatisBase.StatisBaseMessage getBase();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

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

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    private Cinco() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}
