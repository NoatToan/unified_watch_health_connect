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
public final class Tokyo {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.Tokyo$1, reason: invalid class name */
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

    public static final class TokyoEventMessage extends GeneratedMessageLite<TokyoEventMessage, Builder> implements TokyoEventMessageOrBuilder {
        public static final int ALARMOFFCOUNT_FIELD_NUMBER = 8;
        public static final int ALARMONCOUNT_FIELD_NUMBER = 7;
        public static final int ALARMPAGECOUNT_FIELD_NUMBER = 26;
        public static final int APPNOTIFYCOUNT_FIELD_NUMBER = 18;
        public static final int AUTOHEARTRATEANDSLEEPAIDCOUNT_FIELD_NUMBER = 36;
        public static final int AUTOHEARTRATETESTCOUNT_FIELD_NUMBER = 34;
        public static final int BUZZERSWOFFCOUNT_FIELD_NUMBER = 33;
        public static final int BUZZERSWONCOUNT_FIELD_NUMBER = 32;
        public static final int CALLPAGECOUNT_FIELD_NUMBER = 17;
        public static final int CARDIACABNORMALNOTIFYCOUNT_FIELD_NUMBER = 25;
        public static final int CARENOTIFYCOUNT_FIELD_NUMBER = 27;
        private static final TokyoEventMessage DEFAULT_INSTANCE;
        public static final int DISTANCECOUNT_FIELD_NUMBER = 4;
        public static final int EMAILNOTIFYCOUNT_FIELD_NUMBER = 20;
        public static final int EXPENDCOUNT_FIELD_NUMBER = 5;
        public static final int FACTORYPAGECOUNT_FIELD_NUMBER = 43;
        public static final int FINDPHONEFAIL_FIELD_NUMBER = 45;
        public static final int FINDPHONEOK_FIELD_NUMBER = 44;
        public static final int FIVEMINUTEFREQCOUNT_FIELD_NUMBER = 40;
        public static final int HEARTHEALTHTESTCOUNT_FIELD_NUMBER = 37;
        public static final int HEARTRATECOUNT_FIELD_NUMBER = 2;
        public static final int HIGHHEARTRATENOTIFYCOUNT_FIELD_NUMBER = 23;
        public static final int LCDOFFCOUNTBYEVENT_FIELD_NUMBER = 31;
        public static final int LCDOFFCOUNTBYPRESS_FIELD_NUMBER = 29;
        public static final int LCDONCOUNTBYEVENT_FIELD_NUMBER = 30;
        public static final int LCDONCOUNTBYPRESS_FIELD_NUMBER = 28;
        public static final int MSMNOTIFYCOUNT_FIELD_NUMBER = 19;
        public static final int ONEMINUTEFREQCOUNT_FIELD_NUMBER = 39;
        public static final int PAICOUNT_FIELD_NUMBER = 3;
        private static volatile vkh<TokyoEventMessage> PARSER = null;
        public static final int PERKILOMETERNOTIFYCOUNT_FIELD_NUMBER = 24;
        public static final int PHONEDISCONNECTBYSPORT_FIELD_NUMBER = 15;
        public static final int PHONERECOVERYBYSPORT_FIELD_NUMBER = 16;
        public static final int POWERDISCONNCTCOUNT_FIELD_NUMBER = 48;
        public static final int POWERRESTARTCOUNT_FIELD_NUMBER = 46;
        public static final int POWERSHUTDOWNCOUNT_FIELD_NUMBER = 47;
        public static final int REACHNOTIFYCOUNT_FIELD_NUMBER = 22;
        public static final int SEDENTARYNOTIFYCOUNT_FIELD_NUMBER = 21;
        public static final int SILENCEOFFCOUNT_FIELD_NUMBER = 11;
        public static final int SILENCEONCOUNTBYSMART_FIELD_NUMBER = 10;
        public static final int SILENCEONCOUNTBYTIMER_FIELD_NUMBER = 9;
        public static final int SLEEPAIDTESTCOUNT_FIELD_NUMBER = 35;
        public static final int SPORTSCREENUSINGCOUNT_FIELD_NUMBER = 14;
        public static final int STEPCOUNT_FIELD_NUMBER = 1;
        public static final int STOPWATCHMARKCOUNT_FIELD_NUMBER = 13;
        public static final int STOPWATCHSTARTCOUNT_FIELD_NUMBER = 12;
        public static final int TENMINUTEFREQCOUNT_FIELD_NUMBER = 41;
        public static final int TESTOFFCOUNT_FIELD_NUMBER = 38;
        public static final int THIRTYMINUTEFREQCOUNT_FIELD_NUMBER = 42;
        public static final int WEATHERCOUNT_FIELD_NUMBER = 6;
        private int alarmOffCount_;
        private int alarmOnCount_;
        private int alarmPageCount_;
        private int appNotifyCount_;
        private int autoHeartRateAndSleepAidCount_;
        private int autoHeartRateTestCount_;
        private int bitField0_;
        private int bitField1_;
        private int buzzerSwOffCount_;
        private int buzzerSwOnCount_;
        private int callPageCount_;
        private int cardiacAbnormalNotifyCount_;
        private int careNotifyCount_;
        private int distanceCount_;
        private int eMAILNotifyCount_;
        private int expendCount_;
        private int factoryPageCount_;
        private int findPhoneFail_;
        private int findPhoneOk_;
        private int fiveMinuteFreqCount_;
        private int heartHealthTestCount_;
        private int heartRateCount_;
        private int highHeartrateNotifyCount_;
        private int lcdOffCountByEvent_;
        private int lcdOffCountByPress_;
        private int lcdOnCountByEvent_;
        private int lcdOnCountByPress_;
        private int mSMNotifyCount_;
        private byte memoizedIsInitialized = 2;
        private int oneMinuteFreqCount_;
        private int paiCount_;
        private int perKilometerNotifyCount_;
        private int phoneDisconnectBySport_;
        private int phoneRecoveryBySport_;
        private int powerDisconnctCount_;
        private int powerRestartCount_;
        private int powerShutDownCount_;
        private int reachNotifyCount_;
        private int sedentaryNotifyCount_;
        private int silenceOffCount_;
        private int silenceOnCountBySmart_;
        private int silenceOnCountByTimer_;
        private int sleepAidTestCount_;
        private int sportScreenUsingCount_;
        private int stepCount_;
        private int stopWatchMarkCount_;
        private int stopWatchStartCount_;
        private int tenMinuteFreqCount_;
        private int testOffCount_;
        private int thirtyMinuteFreqCount_;
        private int weatherCount_;

        public static final class Builder extends GeneratedMessageLite.a<TokyoEventMessage, Builder> implements TokyoEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAlarmOffCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearAlarmOffCount();
                return this;
            }

            public Builder clearAlarmOnCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearAlarmOnCount();
                return this;
            }

            public Builder clearAlarmPageCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearAlarmPageCount();
                return this;
            }

            public Builder clearAppNotifyCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearAppNotifyCount();
                return this;
            }

            public Builder clearAutoHeartRateAndSleepAidCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearAutoHeartRateAndSleepAidCount();
                return this;
            }

            public Builder clearAutoHeartRateTestCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearAutoHeartRateTestCount();
                return this;
            }

            public Builder clearBuzzerSwOffCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearBuzzerSwOffCount();
                return this;
            }

            public Builder clearBuzzerSwOnCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearBuzzerSwOnCount();
                return this;
            }

            public Builder clearCallPageCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearCallPageCount();
                return this;
            }

            public Builder clearCardiacAbnormalNotifyCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearCardiacAbnormalNotifyCount();
                return this;
            }

            public Builder clearCareNotifyCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearCareNotifyCount();
                return this;
            }

            public Builder clearDistanceCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearDistanceCount();
                return this;
            }

            public Builder clearEMAILNotifyCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearEMAILNotifyCount();
                return this;
            }

            public Builder clearExpendCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearExpendCount();
                return this;
            }

            public Builder clearFactoryPageCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearFactoryPageCount();
                return this;
            }

            public Builder clearFindPhoneFail() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearFindPhoneFail();
                return this;
            }

            public Builder clearFindPhoneOk() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearFindPhoneOk();
                return this;
            }

            public Builder clearFiveMinuteFreqCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearFiveMinuteFreqCount();
                return this;
            }

            public Builder clearHeartHealthTestCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearHeartHealthTestCount();
                return this;
            }

            public Builder clearHeartRateCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearHeartRateCount();
                return this;
            }

            public Builder clearHighHeartrateNotifyCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearHighHeartrateNotifyCount();
                return this;
            }

            public Builder clearLcdOffCountByEvent() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearLcdOffCountByEvent();
                return this;
            }

            public Builder clearLcdOffCountByPress() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearLcdOffCountByPress();
                return this;
            }

            public Builder clearLcdOnCountByEvent() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearLcdOnCountByEvent();
                return this;
            }

            public Builder clearLcdOnCountByPress() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearLcdOnCountByPress();
                return this;
            }

            public Builder clearMSMNotifyCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearMSMNotifyCount();
                return this;
            }

            public Builder clearOneMinuteFreqCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearOneMinuteFreqCount();
                return this;
            }

            public Builder clearPaiCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearPaiCount();
                return this;
            }

            public Builder clearPerKilometerNotifyCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearPerKilometerNotifyCount();
                return this;
            }

            public Builder clearPhoneDisconnectBySport() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearPhoneDisconnectBySport();
                return this;
            }

            public Builder clearPhoneRecoveryBySport() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearPhoneRecoveryBySport();
                return this;
            }

            public Builder clearPowerDisconnctCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearPowerDisconnctCount();
                return this;
            }

            public Builder clearPowerRestartCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearPowerRestartCount();
                return this;
            }

            public Builder clearPowerShutDownCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearPowerShutDownCount();
                return this;
            }

            public Builder clearReachNotifyCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearReachNotifyCount();
                return this;
            }

            public Builder clearSedentaryNotifyCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearSedentaryNotifyCount();
                return this;
            }

            public Builder clearSilenceOffCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearSilenceOffCount();
                return this;
            }

            public Builder clearSilenceOnCountBySmart() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearSilenceOnCountBySmart();
                return this;
            }

            public Builder clearSilenceOnCountByTimer() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearSilenceOnCountByTimer();
                return this;
            }

            public Builder clearSleepAidTestCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearSleepAidTestCount();
                return this;
            }

            public Builder clearSportScreenUsingCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearSportScreenUsingCount();
                return this;
            }

            public Builder clearStepCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearStepCount();
                return this;
            }

            public Builder clearStopWatchMarkCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearStopWatchMarkCount();
                return this;
            }

            public Builder clearStopWatchStartCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearStopWatchStartCount();
                return this;
            }

            public Builder clearTenMinuteFreqCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearTenMinuteFreqCount();
                return this;
            }

            public Builder clearTestOffCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearTestOffCount();
                return this;
            }

            public Builder clearThirtyMinuteFreqCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearThirtyMinuteFreqCount();
                return this;
            }

            public Builder clearWeatherCount() {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).clearWeatherCount();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getAlarmOffCount() {
                return ((TokyoEventMessage) this.instance).getAlarmOffCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getAlarmOnCount() {
                return ((TokyoEventMessage) this.instance).getAlarmOnCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getAlarmPageCount() {
                return ((TokyoEventMessage) this.instance).getAlarmPageCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getAppNotifyCount() {
                return ((TokyoEventMessage) this.instance).getAppNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getAutoHeartRateAndSleepAidCount() {
                return ((TokyoEventMessage) this.instance).getAutoHeartRateAndSleepAidCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getAutoHeartRateTestCount() {
                return ((TokyoEventMessage) this.instance).getAutoHeartRateTestCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getBuzzerSwOffCount() {
                return ((TokyoEventMessage) this.instance).getBuzzerSwOffCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getBuzzerSwOnCount() {
                return ((TokyoEventMessage) this.instance).getBuzzerSwOnCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getCallPageCount() {
                return ((TokyoEventMessage) this.instance).getCallPageCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getCardiacAbnormalNotifyCount() {
                return ((TokyoEventMessage) this.instance).getCardiacAbnormalNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getCareNotifyCount() {
                return ((TokyoEventMessage) this.instance).getCareNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getDistanceCount() {
                return ((TokyoEventMessage) this.instance).getDistanceCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getEMAILNotifyCount() {
                return ((TokyoEventMessage) this.instance).getEMAILNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getExpendCount() {
                return ((TokyoEventMessage) this.instance).getExpendCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getFactoryPageCount() {
                return ((TokyoEventMessage) this.instance).getFactoryPageCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getFindPhoneFail() {
                return ((TokyoEventMessage) this.instance).getFindPhoneFail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getFindPhoneOk() {
                return ((TokyoEventMessage) this.instance).getFindPhoneOk();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getFiveMinuteFreqCount() {
                return ((TokyoEventMessage) this.instance).getFiveMinuteFreqCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getHeartHealthTestCount() {
                return ((TokyoEventMessage) this.instance).getHeartHealthTestCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getHeartRateCount() {
                return ((TokyoEventMessage) this.instance).getHeartRateCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getHighHeartrateNotifyCount() {
                return ((TokyoEventMessage) this.instance).getHighHeartrateNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getLcdOffCountByEvent() {
                return ((TokyoEventMessage) this.instance).getLcdOffCountByEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getLcdOffCountByPress() {
                return ((TokyoEventMessage) this.instance).getLcdOffCountByPress();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getLcdOnCountByEvent() {
                return ((TokyoEventMessage) this.instance).getLcdOnCountByEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getLcdOnCountByPress() {
                return ((TokyoEventMessage) this.instance).getLcdOnCountByPress();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getMSMNotifyCount() {
                return ((TokyoEventMessage) this.instance).getMSMNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getOneMinuteFreqCount() {
                return ((TokyoEventMessage) this.instance).getOneMinuteFreqCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getPaiCount() {
                return ((TokyoEventMessage) this.instance).getPaiCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getPerKilometerNotifyCount() {
                return ((TokyoEventMessage) this.instance).getPerKilometerNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getPhoneDisconnectBySport() {
                return ((TokyoEventMessage) this.instance).getPhoneDisconnectBySport();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getPhoneRecoveryBySport() {
                return ((TokyoEventMessage) this.instance).getPhoneRecoveryBySport();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getPowerDisconnctCount() {
                return ((TokyoEventMessage) this.instance).getPowerDisconnctCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getPowerRestartCount() {
                return ((TokyoEventMessage) this.instance).getPowerRestartCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getPowerShutDownCount() {
                return ((TokyoEventMessage) this.instance).getPowerShutDownCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getReachNotifyCount() {
                return ((TokyoEventMessage) this.instance).getReachNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getSedentaryNotifyCount() {
                return ((TokyoEventMessage) this.instance).getSedentaryNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getSilenceOffCount() {
                return ((TokyoEventMessage) this.instance).getSilenceOffCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getSilenceOnCountBySmart() {
                return ((TokyoEventMessage) this.instance).getSilenceOnCountBySmart();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getSilenceOnCountByTimer() {
                return ((TokyoEventMessage) this.instance).getSilenceOnCountByTimer();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getSleepAidTestCount() {
                return ((TokyoEventMessage) this.instance).getSleepAidTestCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getSportScreenUsingCount() {
                return ((TokyoEventMessage) this.instance).getSportScreenUsingCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getStepCount() {
                return ((TokyoEventMessage) this.instance).getStepCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getStopWatchMarkCount() {
                return ((TokyoEventMessage) this.instance).getStopWatchMarkCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getStopWatchStartCount() {
                return ((TokyoEventMessage) this.instance).getStopWatchStartCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getTenMinuteFreqCount() {
                return ((TokyoEventMessage) this.instance).getTenMinuteFreqCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getTestOffCount() {
                return ((TokyoEventMessage) this.instance).getTestOffCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getThirtyMinuteFreqCount() {
                return ((TokyoEventMessage) this.instance).getThirtyMinuteFreqCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public int getWeatherCount() {
                return ((TokyoEventMessage) this.instance).getWeatherCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasAlarmOffCount() {
                return ((TokyoEventMessage) this.instance).hasAlarmOffCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasAlarmOnCount() {
                return ((TokyoEventMessage) this.instance).hasAlarmOnCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasAlarmPageCount() {
                return ((TokyoEventMessage) this.instance).hasAlarmPageCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasAppNotifyCount() {
                return ((TokyoEventMessage) this.instance).hasAppNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasAutoHeartRateAndSleepAidCount() {
                return ((TokyoEventMessage) this.instance).hasAutoHeartRateAndSleepAidCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasAutoHeartRateTestCount() {
                return ((TokyoEventMessage) this.instance).hasAutoHeartRateTestCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasBuzzerSwOffCount() {
                return ((TokyoEventMessage) this.instance).hasBuzzerSwOffCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasBuzzerSwOnCount() {
                return ((TokyoEventMessage) this.instance).hasBuzzerSwOnCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasCallPageCount() {
                return ((TokyoEventMessage) this.instance).hasCallPageCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasCardiacAbnormalNotifyCount() {
                return ((TokyoEventMessage) this.instance).hasCardiacAbnormalNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasCareNotifyCount() {
                return ((TokyoEventMessage) this.instance).hasCareNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasDistanceCount() {
                return ((TokyoEventMessage) this.instance).hasDistanceCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasEMAILNotifyCount() {
                return ((TokyoEventMessage) this.instance).hasEMAILNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasExpendCount() {
                return ((TokyoEventMessage) this.instance).hasExpendCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasFactoryPageCount() {
                return ((TokyoEventMessage) this.instance).hasFactoryPageCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasFindPhoneFail() {
                return ((TokyoEventMessage) this.instance).hasFindPhoneFail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasFindPhoneOk() {
                return ((TokyoEventMessage) this.instance).hasFindPhoneOk();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasFiveMinuteFreqCount() {
                return ((TokyoEventMessage) this.instance).hasFiveMinuteFreqCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasHeartHealthTestCount() {
                return ((TokyoEventMessage) this.instance).hasHeartHealthTestCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasHeartRateCount() {
                return ((TokyoEventMessage) this.instance).hasHeartRateCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasHighHeartrateNotifyCount() {
                return ((TokyoEventMessage) this.instance).hasHighHeartrateNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasLcdOffCountByEvent() {
                return ((TokyoEventMessage) this.instance).hasLcdOffCountByEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasLcdOffCountByPress() {
                return ((TokyoEventMessage) this.instance).hasLcdOffCountByPress();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasLcdOnCountByEvent() {
                return ((TokyoEventMessage) this.instance).hasLcdOnCountByEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasLcdOnCountByPress() {
                return ((TokyoEventMessage) this.instance).hasLcdOnCountByPress();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasMSMNotifyCount() {
                return ((TokyoEventMessage) this.instance).hasMSMNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasOneMinuteFreqCount() {
                return ((TokyoEventMessage) this.instance).hasOneMinuteFreqCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasPaiCount() {
                return ((TokyoEventMessage) this.instance).hasPaiCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasPerKilometerNotifyCount() {
                return ((TokyoEventMessage) this.instance).hasPerKilometerNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasPhoneDisconnectBySport() {
                return ((TokyoEventMessage) this.instance).hasPhoneDisconnectBySport();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasPhoneRecoveryBySport() {
                return ((TokyoEventMessage) this.instance).hasPhoneRecoveryBySport();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasPowerDisconnctCount() {
                return ((TokyoEventMessage) this.instance).hasPowerDisconnctCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasPowerRestartCount() {
                return ((TokyoEventMessage) this.instance).hasPowerRestartCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasPowerShutDownCount() {
                return ((TokyoEventMessage) this.instance).hasPowerShutDownCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasReachNotifyCount() {
                return ((TokyoEventMessage) this.instance).hasReachNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasSedentaryNotifyCount() {
                return ((TokyoEventMessage) this.instance).hasSedentaryNotifyCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasSilenceOffCount() {
                return ((TokyoEventMessage) this.instance).hasSilenceOffCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasSilenceOnCountBySmart() {
                return ((TokyoEventMessage) this.instance).hasSilenceOnCountBySmart();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasSilenceOnCountByTimer() {
                return ((TokyoEventMessage) this.instance).hasSilenceOnCountByTimer();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasSleepAidTestCount() {
                return ((TokyoEventMessage) this.instance).hasSleepAidTestCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasSportScreenUsingCount() {
                return ((TokyoEventMessage) this.instance).hasSportScreenUsingCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasStepCount() {
                return ((TokyoEventMessage) this.instance).hasStepCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasStopWatchMarkCount() {
                return ((TokyoEventMessage) this.instance).hasStopWatchMarkCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasStopWatchStartCount() {
                return ((TokyoEventMessage) this.instance).hasStopWatchStartCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasTenMinuteFreqCount() {
                return ((TokyoEventMessage) this.instance).hasTenMinuteFreqCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasTestOffCount() {
                return ((TokyoEventMessage) this.instance).hasTestOffCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasThirtyMinuteFreqCount() {
                return ((TokyoEventMessage) this.instance).hasThirtyMinuteFreqCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
            public boolean hasWeatherCount() {
                return ((TokyoEventMessage) this.instance).hasWeatherCount();
            }

            public Builder setAlarmOffCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setAlarmOffCount(i);
                return this;
            }

            public Builder setAlarmOnCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setAlarmOnCount(i);
                return this;
            }

            public Builder setAlarmPageCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setAlarmPageCount(i);
                return this;
            }

            public Builder setAppNotifyCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setAppNotifyCount(i);
                return this;
            }

            public Builder setAutoHeartRateAndSleepAidCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setAutoHeartRateAndSleepAidCount(i);
                return this;
            }

            public Builder setAutoHeartRateTestCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setAutoHeartRateTestCount(i);
                return this;
            }

            public Builder setBuzzerSwOffCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setBuzzerSwOffCount(i);
                return this;
            }

            public Builder setBuzzerSwOnCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setBuzzerSwOnCount(i);
                return this;
            }

            public Builder setCallPageCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setCallPageCount(i);
                return this;
            }

            public Builder setCardiacAbnormalNotifyCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setCardiacAbnormalNotifyCount(i);
                return this;
            }

            public Builder setCareNotifyCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setCareNotifyCount(i);
                return this;
            }

            public Builder setDistanceCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setDistanceCount(i);
                return this;
            }

            public Builder setEMAILNotifyCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setEMAILNotifyCount(i);
                return this;
            }

            public Builder setExpendCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setExpendCount(i);
                return this;
            }

            public Builder setFactoryPageCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setFactoryPageCount(i);
                return this;
            }

            public Builder setFindPhoneFail(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setFindPhoneFail(i);
                return this;
            }

            public Builder setFindPhoneOk(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setFindPhoneOk(i);
                return this;
            }

            public Builder setFiveMinuteFreqCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setFiveMinuteFreqCount(i);
                return this;
            }

            public Builder setHeartHealthTestCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setHeartHealthTestCount(i);
                return this;
            }

            public Builder setHeartRateCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setHeartRateCount(i);
                return this;
            }

            public Builder setHighHeartrateNotifyCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setHighHeartrateNotifyCount(i);
                return this;
            }

            public Builder setLcdOffCountByEvent(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setLcdOffCountByEvent(i);
                return this;
            }

            public Builder setLcdOffCountByPress(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setLcdOffCountByPress(i);
                return this;
            }

            public Builder setLcdOnCountByEvent(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setLcdOnCountByEvent(i);
                return this;
            }

            public Builder setLcdOnCountByPress(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setLcdOnCountByPress(i);
                return this;
            }

            public Builder setMSMNotifyCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setMSMNotifyCount(i);
                return this;
            }

            public Builder setOneMinuteFreqCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setOneMinuteFreqCount(i);
                return this;
            }

            public Builder setPaiCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setPaiCount(i);
                return this;
            }

            public Builder setPerKilometerNotifyCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setPerKilometerNotifyCount(i);
                return this;
            }

            public Builder setPhoneDisconnectBySport(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setPhoneDisconnectBySport(i);
                return this;
            }

            public Builder setPhoneRecoveryBySport(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setPhoneRecoveryBySport(i);
                return this;
            }

            public Builder setPowerDisconnctCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setPowerDisconnctCount(i);
                return this;
            }

            public Builder setPowerRestartCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setPowerRestartCount(i);
                return this;
            }

            public Builder setPowerShutDownCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setPowerShutDownCount(i);
                return this;
            }

            public Builder setReachNotifyCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setReachNotifyCount(i);
                return this;
            }

            public Builder setSedentaryNotifyCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setSedentaryNotifyCount(i);
                return this;
            }

            public Builder setSilenceOffCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setSilenceOffCount(i);
                return this;
            }

            public Builder setSilenceOnCountBySmart(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setSilenceOnCountBySmart(i);
                return this;
            }

            public Builder setSilenceOnCountByTimer(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setSilenceOnCountByTimer(i);
                return this;
            }

            public Builder setSleepAidTestCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setSleepAidTestCount(i);
                return this;
            }

            public Builder setSportScreenUsingCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setSportScreenUsingCount(i);
                return this;
            }

            public Builder setStepCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setStepCount(i);
                return this;
            }

            public Builder setStopWatchMarkCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setStopWatchMarkCount(i);
                return this;
            }

            public Builder setStopWatchStartCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setStopWatchStartCount(i);
                return this;
            }

            public Builder setTenMinuteFreqCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setTenMinuteFreqCount(i);
                return this;
            }

            public Builder setTestOffCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setTestOffCount(i);
                return this;
            }

            public Builder setThirtyMinuteFreqCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setThirtyMinuteFreqCount(i);
                return this;
            }

            public Builder setWeatherCount(int i) {
                copyOnWrite();
                ((TokyoEventMessage) this.instance).setWeatherCount(i);
                return this;
            }

            private Builder() {
                super(TokyoEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            TokyoEventMessage tokyoEventMessage = new TokyoEventMessage();
            DEFAULT_INSTANCE = tokyoEventMessage;
            GeneratedMessageLite.registerDefaultInstance(TokyoEventMessage.class, tokyoEventMessage);
        }

        private TokyoEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmOffCount() {
            this.bitField0_ &= -129;
            this.alarmOffCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmOnCount() {
            this.bitField0_ &= -65;
            this.alarmOnCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmPageCount() {
            this.bitField0_ &= -33554433;
            this.alarmPageCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppNotifyCount() {
            this.bitField0_ &= -131073;
            this.appNotifyCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAutoHeartRateAndSleepAidCount() {
            this.bitField1_ &= -9;
            this.autoHeartRateAndSleepAidCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAutoHeartRateTestCount() {
            this.bitField1_ &= -3;
            this.autoHeartRateTestCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBuzzerSwOffCount() {
            this.bitField1_ &= -2;
            this.buzzerSwOffCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBuzzerSwOnCount() {
            this.bitField0_ &= Integer.MAX_VALUE;
            this.buzzerSwOnCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCallPageCount() {
            this.bitField0_ &= -65537;
            this.callPageCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCardiacAbnormalNotifyCount() {
            this.bitField0_ &= -16777217;
            this.cardiacAbnormalNotifyCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCareNotifyCount() {
            this.bitField0_ &= -67108865;
            this.careNotifyCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDistanceCount() {
            this.bitField0_ &= -9;
            this.distanceCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEMAILNotifyCount() {
            this.bitField0_ &= -524289;
            this.eMAILNotifyCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearExpendCount() {
            this.bitField0_ &= -17;
            this.expendCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFactoryPageCount() {
            this.bitField1_ &= -1025;
            this.factoryPageCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFindPhoneFail() {
            this.bitField1_ &= -4097;
            this.findPhoneFail_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFindPhoneOk() {
            this.bitField1_ &= -2049;
            this.findPhoneOk_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFiveMinuteFreqCount() {
            this.bitField1_ &= -129;
            this.fiveMinuteFreqCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeartHealthTestCount() {
            this.bitField1_ &= -17;
            this.heartHealthTestCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHeartRateCount() {
            this.bitField0_ &= -3;
            this.heartRateCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearHighHeartrateNotifyCount() {
            this.bitField0_ &= -4194305;
            this.highHeartrateNotifyCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLcdOffCountByEvent() {
            this.bitField0_ &= -1073741825;
            this.lcdOffCountByEvent_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLcdOffCountByPress() {
            this.bitField0_ &= -268435457;
            this.lcdOffCountByPress_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLcdOnCountByEvent() {
            this.bitField0_ &= -536870913;
            this.lcdOnCountByEvent_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLcdOnCountByPress() {
            this.bitField0_ &= -134217729;
            this.lcdOnCountByPress_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMSMNotifyCount() {
            this.bitField0_ &= -262145;
            this.mSMNotifyCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearOneMinuteFreqCount() {
            this.bitField1_ &= -65;
            this.oneMinuteFreqCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPaiCount() {
            this.bitField0_ &= -5;
            this.paiCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPerKilometerNotifyCount() {
            this.bitField0_ &= -8388609;
            this.perKilometerNotifyCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhoneDisconnectBySport() {
            this.bitField0_ &= -16385;
            this.phoneDisconnectBySport_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPhoneRecoveryBySport() {
            this.bitField0_ &= -32769;
            this.phoneRecoveryBySport_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPowerDisconnctCount() {
            this.bitField1_ &= -32769;
            this.powerDisconnctCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPowerRestartCount() {
            this.bitField1_ &= -8193;
            this.powerRestartCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPowerShutDownCount() {
            this.bitField1_ &= -16385;
            this.powerShutDownCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReachNotifyCount() {
            this.bitField0_ &= -2097153;
            this.reachNotifyCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSedentaryNotifyCount() {
            this.bitField0_ &= -1048577;
            this.sedentaryNotifyCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSilenceOffCount() {
            this.bitField0_ &= -1025;
            this.silenceOffCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSilenceOnCountBySmart() {
            this.bitField0_ &= -513;
            this.silenceOnCountBySmart_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSilenceOnCountByTimer() {
            this.bitField0_ &= -257;
            this.silenceOnCountByTimer_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSleepAidTestCount() {
            this.bitField1_ &= -5;
            this.sleepAidTestCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportScreenUsingCount() {
            this.bitField0_ &= -8193;
            this.sportScreenUsingCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStepCount() {
            this.bitField0_ &= -2;
            this.stepCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStopWatchMarkCount() {
            this.bitField0_ &= -4097;
            this.stopWatchMarkCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStopWatchStartCount() {
            this.bitField0_ &= -2049;
            this.stopWatchStartCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTenMinuteFreqCount() {
            this.bitField1_ &= -257;
            this.tenMinuteFreqCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTestOffCount() {
            this.bitField1_ &= -33;
            this.testOffCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearThirtyMinuteFreqCount() {
            this.bitField1_ &= -513;
            this.thirtyMinuteFreqCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeatherCount() {
            this.bitField0_ &= -33;
            this.weatherCount_ = 0;
        }

        public static TokyoEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TokyoEventMessage parseDelimitedFrom(InputStream inputStream) {
            return (TokyoEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TokyoEventMessage parseFrom(ByteBuffer byteBuffer) {
            return (TokyoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<TokyoEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmOffCount(int i) {
            this.bitField0_ |= 128;
            this.alarmOffCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmOnCount(int i) {
            this.bitField0_ |= 64;
            this.alarmOnCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmPageCount(int i) {
            this.bitField0_ |= 33554432;
            this.alarmPageCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppNotifyCount(int i) {
            this.bitField0_ |= 131072;
            this.appNotifyCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAutoHeartRateAndSleepAidCount(int i) {
            this.bitField1_ |= 8;
            this.autoHeartRateAndSleepAidCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAutoHeartRateTestCount(int i) {
            this.bitField1_ |= 2;
            this.autoHeartRateTestCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuzzerSwOffCount(int i) {
            this.bitField1_ |= 1;
            this.buzzerSwOffCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBuzzerSwOnCount(int i) {
            this.bitField0_ |= Integer.MIN_VALUE;
            this.buzzerSwOnCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallPageCount(int i) {
            this.bitField0_ |= 65536;
            this.callPageCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCardiacAbnormalNotifyCount(int i) {
            this.bitField0_ |= 16777216;
            this.cardiacAbnormalNotifyCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCareNotifyCount(int i) {
            this.bitField0_ |= 67108864;
            this.careNotifyCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDistanceCount(int i) {
            this.bitField0_ |= 8;
            this.distanceCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEMAILNotifyCount(int i) {
            this.bitField0_ |= 524288;
            this.eMAILNotifyCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setExpendCount(int i) {
            this.bitField0_ |= 16;
            this.expendCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFactoryPageCount(int i) {
            this.bitField1_ |= 1024;
            this.factoryPageCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFindPhoneFail(int i) {
            this.bitField1_ |= 4096;
            this.findPhoneFail_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFindPhoneOk(int i) {
            this.bitField1_ |= 2048;
            this.findPhoneOk_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFiveMinuteFreqCount(int i) {
            this.bitField1_ |= 128;
            this.fiveMinuteFreqCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeartHealthTestCount(int i) {
            this.bitField1_ |= 16;
            this.heartHealthTestCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHeartRateCount(int i) {
            this.bitField0_ |= 2;
            this.heartRateCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setHighHeartrateNotifyCount(int i) {
            this.bitField0_ |= 4194304;
            this.highHeartrateNotifyCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOffCountByEvent(int i) {
            this.bitField0_ |= 1073741824;
            this.lcdOffCountByEvent_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOffCountByPress(int i) {
            this.bitField0_ |= 268435456;
            this.lcdOffCountByPress_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOnCountByEvent(int i) {
            this.bitField0_ |= 536870912;
            this.lcdOnCountByEvent_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOnCountByPress(int i) {
            this.bitField0_ |= 134217728;
            this.lcdOnCountByPress_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMSMNotifyCount(int i) {
            this.bitField0_ |= 262144;
            this.mSMNotifyCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setOneMinuteFreqCount(int i) {
            this.bitField1_ |= 64;
            this.oneMinuteFreqCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaiCount(int i) {
            this.bitField0_ |= 4;
            this.paiCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPerKilometerNotifyCount(int i) {
            this.bitField0_ |= NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
            this.perKilometerNotifyCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhoneDisconnectBySport(int i) {
            this.bitField0_ |= 16384;
            this.phoneDisconnectBySport_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPhoneRecoveryBySport(int i) {
            this.bitField0_ |= 32768;
            this.phoneRecoveryBySport_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPowerDisconnctCount(int i) {
            this.bitField1_ |= 32768;
            this.powerDisconnctCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPowerRestartCount(int i) {
            this.bitField1_ |= 8192;
            this.powerRestartCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPowerShutDownCount(int i) {
            this.bitField1_ |= 16384;
            this.powerShutDownCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReachNotifyCount(int i) {
            this.bitField0_ |= 2097152;
            this.reachNotifyCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSedentaryNotifyCount(int i) {
            this.bitField0_ |= EventRecurrence.TH;
            this.sedentaryNotifyCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSilenceOffCount(int i) {
            this.bitField0_ |= 1024;
            this.silenceOffCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSilenceOnCountBySmart(int i) {
            this.bitField0_ |= 512;
            this.silenceOnCountBySmart_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSilenceOnCountByTimer(int i) {
            this.bitField0_ |= 256;
            this.silenceOnCountByTimer_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSleepAidTestCount(int i) {
            this.bitField1_ |= 4;
            this.sleepAidTestCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportScreenUsingCount(int i) {
            this.bitField0_ |= 8192;
            this.sportScreenUsingCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStepCount(int i) {
            this.bitField0_ |= 1;
            this.stepCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopWatchMarkCount(int i) {
            this.bitField0_ |= 4096;
            this.stopWatchMarkCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopWatchStartCount(int i) {
            this.bitField0_ |= 2048;
            this.stopWatchStartCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTenMinuteFreqCount(int i) {
            this.bitField1_ |= 256;
            this.tenMinuteFreqCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTestOffCount(int i) {
            this.bitField1_ |= 32;
            this.testOffCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setThirtyMinuteFreqCount(int i) {
            this.bitField1_ |= 512;
            this.thirtyMinuteFreqCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeatherCount(int i) {
            this.bitField0_ |= 32;
            this.weatherCount_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new TokyoEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u00010\u0000\u0002\u000100\u0000\u00000\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f\u0011ᔋ\u0010\u0012ᔋ\u0011\u0013ᔋ\u0012\u0014ᔋ\u0013\u0015ᔋ\u0014\u0016ᔋ\u0015\u0017ᔋ\u0016\u0018ᔋ\u0017\u0019ᔋ\u0018\u001aᔋ\u0019\u001bᔋ\u001a\u001cᔋ\u001b\u001dᔋ\u001c\u001eᔋ\u001d\u001fᔋ\u001e ᔋ\u001f!ᔋ \"ᔋ!#ᔋ\"$ᔋ#%ᔋ$&ᔋ%'ᔋ&(ᔋ')ᔋ(*ᔋ)+ᔋ*,ᔋ+-ᔋ,.ᔋ-/ᔋ.0ᔋ/", new Object[]{"bitField0_", "bitField1_", "stepCount_", "heartRateCount_", "paiCount_", "distanceCount_", "expendCount_", "weatherCount_", "alarmOnCount_", "alarmOffCount_", "silenceOnCountByTimer_", "silenceOnCountBySmart_", "silenceOffCount_", "stopWatchStartCount_", "stopWatchMarkCount_", "sportScreenUsingCount_", "phoneDisconnectBySport_", "phoneRecoveryBySport_", "callPageCount_", "appNotifyCount_", "mSMNotifyCount_", "eMAILNotifyCount_", "sedentaryNotifyCount_", "reachNotifyCount_", "highHeartrateNotifyCount_", "perKilometerNotifyCount_", "cardiacAbnormalNotifyCount_", "alarmPageCount_", "careNotifyCount_", "lcdOnCountByPress_", "lcdOffCountByPress_", "lcdOnCountByEvent_", "lcdOffCountByEvent_", "buzzerSwOnCount_", "buzzerSwOffCount_", "autoHeartRateTestCount_", "sleepAidTestCount_", "autoHeartRateAndSleepAidCount_", "heartHealthTestCount_", "testOffCount_", "oneMinuteFreqCount_", "fiveMinuteFreqCount_", "tenMinuteFreqCount_", "thirtyMinuteFreqCount_", "factoryPageCount_", "findPhoneOk_", "findPhoneFail_", "powerRestartCount_", "powerShutDownCount_", "powerDisconnctCount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<TokyoEventMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (TokyoEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getAlarmOffCount() {
            return this.alarmOffCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getAlarmOnCount() {
            return this.alarmOnCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getAlarmPageCount() {
            return this.alarmPageCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getAppNotifyCount() {
            return this.appNotifyCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getAutoHeartRateAndSleepAidCount() {
            return this.autoHeartRateAndSleepAidCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getAutoHeartRateTestCount() {
            return this.autoHeartRateTestCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getBuzzerSwOffCount() {
            return this.buzzerSwOffCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getBuzzerSwOnCount() {
            return this.buzzerSwOnCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getCallPageCount() {
            return this.callPageCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getCardiacAbnormalNotifyCount() {
            return this.cardiacAbnormalNotifyCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getCareNotifyCount() {
            return this.careNotifyCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getDistanceCount() {
            return this.distanceCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getEMAILNotifyCount() {
            return this.eMAILNotifyCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getExpendCount() {
            return this.expendCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getFactoryPageCount() {
            return this.factoryPageCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getFindPhoneFail() {
            return this.findPhoneFail_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getFindPhoneOk() {
            return this.findPhoneOk_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getFiveMinuteFreqCount() {
            return this.fiveMinuteFreqCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getHeartHealthTestCount() {
            return this.heartHealthTestCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getHeartRateCount() {
            return this.heartRateCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getHighHeartrateNotifyCount() {
            return this.highHeartrateNotifyCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getLcdOffCountByEvent() {
            return this.lcdOffCountByEvent_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getLcdOffCountByPress() {
            return this.lcdOffCountByPress_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getLcdOnCountByEvent() {
            return this.lcdOnCountByEvent_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getLcdOnCountByPress() {
            return this.lcdOnCountByPress_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getMSMNotifyCount() {
            return this.mSMNotifyCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getOneMinuteFreqCount() {
            return this.oneMinuteFreqCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getPaiCount() {
            return this.paiCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getPerKilometerNotifyCount() {
            return this.perKilometerNotifyCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getPhoneDisconnectBySport() {
            return this.phoneDisconnectBySport_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getPhoneRecoveryBySport() {
            return this.phoneRecoveryBySport_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getPowerDisconnctCount() {
            return this.powerDisconnctCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getPowerRestartCount() {
            return this.powerRestartCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getPowerShutDownCount() {
            return this.powerShutDownCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getReachNotifyCount() {
            return this.reachNotifyCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getSedentaryNotifyCount() {
            return this.sedentaryNotifyCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getSilenceOffCount() {
            return this.silenceOffCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getSilenceOnCountBySmart() {
            return this.silenceOnCountBySmart_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getSilenceOnCountByTimer() {
            return this.silenceOnCountByTimer_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getSleepAidTestCount() {
            return this.sleepAidTestCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getSportScreenUsingCount() {
            return this.sportScreenUsingCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getStepCount() {
            return this.stepCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getStopWatchMarkCount() {
            return this.stopWatchMarkCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getStopWatchStartCount() {
            return this.stopWatchStartCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getTenMinuteFreqCount() {
            return this.tenMinuteFreqCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getTestOffCount() {
            return this.testOffCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getThirtyMinuteFreqCount() {
            return this.thirtyMinuteFreqCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public int getWeatherCount() {
            return this.weatherCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasAlarmOffCount() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasAlarmOnCount() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasAlarmPageCount() {
            return (this.bitField0_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasAppNotifyCount() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasAutoHeartRateAndSleepAidCount() {
            return (this.bitField1_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasAutoHeartRateTestCount() {
            return (this.bitField1_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasBuzzerSwOffCount() {
            return (this.bitField1_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasBuzzerSwOnCount() {
            return (this.bitField0_ & Integer.MIN_VALUE) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasCallPageCount() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasCardiacAbnormalNotifyCount() {
            return (this.bitField0_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasCareNotifyCount() {
            return (this.bitField0_ & 67108864) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasDistanceCount() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasEMAILNotifyCount() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasExpendCount() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasFactoryPageCount() {
            return (this.bitField1_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasFindPhoneFail() {
            return (this.bitField1_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasFindPhoneOk() {
            return (this.bitField1_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasFiveMinuteFreqCount() {
            return (this.bitField1_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasHeartHealthTestCount() {
            return (this.bitField1_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasHeartRateCount() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasHighHeartrateNotifyCount() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasLcdOffCountByEvent() {
            return (this.bitField0_ & 1073741824) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasLcdOffCountByPress() {
            return (this.bitField0_ & 268435456) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasLcdOnCountByEvent() {
            return (this.bitField0_ & 536870912) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasLcdOnCountByPress() {
            return (this.bitField0_ & 134217728) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasMSMNotifyCount() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasOneMinuteFreqCount() {
            return (this.bitField1_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasPaiCount() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasPerKilometerNotifyCount() {
            return (this.bitField0_ & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasPhoneDisconnectBySport() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasPhoneRecoveryBySport() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasPowerDisconnctCount() {
            return (this.bitField1_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasPowerRestartCount() {
            return (this.bitField1_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasPowerShutDownCount() {
            return (this.bitField1_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasReachNotifyCount() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasSedentaryNotifyCount() {
            return (this.bitField0_ & EventRecurrence.TH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasSilenceOffCount() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasSilenceOnCountBySmart() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasSilenceOnCountByTimer() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasSleepAidTestCount() {
            return (this.bitField1_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasSportScreenUsingCount() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasStepCount() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasStopWatchMarkCount() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasStopWatchStartCount() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasTenMinuteFreqCount() {
            return (this.bitField1_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasTestOffCount() {
            return (this.bitField1_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasThirtyMinuteFreqCount() {
            return (this.bitField1_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoEventMessageOrBuilder
        public boolean hasWeatherCount() {
            return (this.bitField0_ & 32) != 0;
        }

        public static Builder newBuilder(TokyoEventMessage tokyoEventMessage) {
            return DEFAULT_INSTANCE.createBuilder(tokyoEventMessage);
        }

        public static TokyoEventMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (TokyoEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static TokyoEventMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (TokyoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static TokyoEventMessage parseFrom(ByteString byteString) {
            return (TokyoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TokyoEventMessage parseFrom(ByteString byteString, t tVar) {
            return (TokyoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static TokyoEventMessage parseFrom(byte[] bArr) {
            return (TokyoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TokyoEventMessage parseFrom(byte[] bArr, t tVar) {
            return (TokyoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static TokyoEventMessage parseFrom(InputStream inputStream) {
            return (TokyoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TokyoEventMessage parseFrom(InputStream inputStream, t tVar) {
            return (TokyoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static TokyoEventMessage parseFrom(j jVar) {
            return (TokyoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static TokyoEventMessage parseFrom(j jVar, t tVar) {
            return (TokyoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface TokyoEventMessageOrBuilder extends bsf {
        int getAlarmOffCount();

        int getAlarmOnCount();

        int getAlarmPageCount();

        int getAppNotifyCount();

        int getAutoHeartRateAndSleepAidCount();

        int getAutoHeartRateTestCount();

        int getBuzzerSwOffCount();

        int getBuzzerSwOnCount();

        int getCallPageCount();

        int getCardiacAbnormalNotifyCount();

        int getCareNotifyCount();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getDistanceCount();

        int getEMAILNotifyCount();

        int getExpendCount();

        int getFactoryPageCount();

        int getFindPhoneFail();

        int getFindPhoneOk();

        int getFiveMinuteFreqCount();

        int getHeartHealthTestCount();

        int getHeartRateCount();

        int getHighHeartrateNotifyCount();

        int getLcdOffCountByEvent();

        int getLcdOffCountByPress();

        int getLcdOnCountByEvent();

        int getLcdOnCountByPress();

        int getMSMNotifyCount();

        int getOneMinuteFreqCount();

        int getPaiCount();

        int getPerKilometerNotifyCount();

        int getPhoneDisconnectBySport();

        int getPhoneRecoveryBySport();

        int getPowerDisconnctCount();

        int getPowerRestartCount();

        int getPowerShutDownCount();

        int getReachNotifyCount();

        int getSedentaryNotifyCount();

        int getSilenceOffCount();

        int getSilenceOnCountBySmart();

        int getSilenceOnCountByTimer();

        int getSleepAidTestCount();

        int getSportScreenUsingCount();

        int getStepCount();

        int getStopWatchMarkCount();

        int getStopWatchStartCount();

        int getTenMinuteFreqCount();

        int getTestOffCount();

        int getThirtyMinuteFreqCount();

        int getWeatherCount();

        boolean hasAlarmOffCount();

        boolean hasAlarmOnCount();

        boolean hasAlarmPageCount();

        boolean hasAppNotifyCount();

        boolean hasAutoHeartRateAndSleepAidCount();

        boolean hasAutoHeartRateTestCount();

        boolean hasBuzzerSwOffCount();

        boolean hasBuzzerSwOnCount();

        boolean hasCallPageCount();

        boolean hasCardiacAbnormalNotifyCount();

        boolean hasCareNotifyCount();

        boolean hasDistanceCount();

        boolean hasEMAILNotifyCount();

        boolean hasExpendCount();

        boolean hasFactoryPageCount();

        boolean hasFindPhoneFail();

        boolean hasFindPhoneOk();

        boolean hasFiveMinuteFreqCount();

        boolean hasHeartHealthTestCount();

        boolean hasHeartRateCount();

        boolean hasHighHeartrateNotifyCount();

        boolean hasLcdOffCountByEvent();

        boolean hasLcdOffCountByPress();

        boolean hasLcdOnCountByEvent();

        boolean hasLcdOnCountByPress();

        boolean hasMSMNotifyCount();

        boolean hasOneMinuteFreqCount();

        boolean hasPaiCount();

        boolean hasPerKilometerNotifyCount();

        boolean hasPhoneDisconnectBySport();

        boolean hasPhoneRecoveryBySport();

        boolean hasPowerDisconnctCount();

        boolean hasPowerRestartCount();

        boolean hasPowerShutDownCount();

        boolean hasReachNotifyCount();

        boolean hasSedentaryNotifyCount();

        boolean hasSilenceOffCount();

        boolean hasSilenceOnCountBySmart();

        boolean hasSilenceOnCountByTimer();

        boolean hasSleepAidTestCount();

        boolean hasSportScreenUsingCount();

        boolean hasStepCount();

        boolean hasStopWatchMarkCount();

        boolean hasStopWatchStartCount();

        boolean hasTenMinuteFreqCount();

        boolean hasTestOffCount();

        boolean hasThirtyMinuteFreqCount();

        boolean hasWeatherCount();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class TokyoStatisticMessage extends GeneratedMessageLite<TokyoStatisticMessage, Builder> implements TokyoStatisticMessageOrBuilder {
        public static final int BACKLIGHTTIMEMSG_FIELD_NUMBER = 3;
        public static final int BASE_FIELD_NUMBER = 1;
        private static final TokyoStatisticMessage DEFAULT_INSTANCE;
        public static final int EVENT_FIELD_NUMBER = 2;
        private static volatile vkh<TokyoStatisticMessage> PARSER;
        private BacklightTime.BacklightTimeWeekMessage backlightTimeMsg_;
        private StatisBase.StatisBaseMessage base_;
        private int bitField0_;
        private TokyoEventMessage event_;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends GeneratedMessageLite.a<TokyoStatisticMessage, Builder> implements TokyoStatisticMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBacklightTimeMsg() {
                copyOnWrite();
                ((TokyoStatisticMessage) this.instance).clearBacklightTimeMsg();
                return this;
            }

            public Builder clearBase() {
                copyOnWrite();
                ((TokyoStatisticMessage) this.instance).clearBase();
                return this;
            }

            public Builder clearEvent() {
                copyOnWrite();
                ((TokyoStatisticMessage) this.instance).clearEvent();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoStatisticMessageOrBuilder
            public BacklightTime.BacklightTimeWeekMessage getBacklightTimeMsg() {
                return ((TokyoStatisticMessage) this.instance).getBacklightTimeMsg();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoStatisticMessageOrBuilder
            public StatisBase.StatisBaseMessage getBase() {
                return ((TokyoStatisticMessage) this.instance).getBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoStatisticMessageOrBuilder
            public TokyoEventMessage getEvent() {
                return ((TokyoStatisticMessage) this.instance).getEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoStatisticMessageOrBuilder
            public boolean hasBacklightTimeMsg() {
                return ((TokyoStatisticMessage) this.instance).hasBacklightTimeMsg();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoStatisticMessageOrBuilder
            public boolean hasBase() {
                return ((TokyoStatisticMessage) this.instance).hasBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoStatisticMessageOrBuilder
            public boolean hasEvent() {
                return ((TokyoStatisticMessage) this.instance).hasEvent();
            }

            public Builder mergeBacklightTimeMsg(BacklightTime.BacklightTimeWeekMessage backlightTimeWeekMessage) {
                copyOnWrite();
                ((TokyoStatisticMessage) this.instance).mergeBacklightTimeMsg(backlightTimeWeekMessage);
                return this;
            }

            public Builder mergeBase(StatisBase.StatisBaseMessage statisBaseMessage) {
                copyOnWrite();
                ((TokyoStatisticMessage) this.instance).mergeBase(statisBaseMessage);
                return this;
            }

            public Builder mergeEvent(TokyoEventMessage tokyoEventMessage) {
                copyOnWrite();
                ((TokyoStatisticMessage) this.instance).mergeEvent(tokyoEventMessage);
                return this;
            }

            public Builder setBacklightTimeMsg(BacklightTime.BacklightTimeWeekMessage backlightTimeWeekMessage) {
                copyOnWrite();
                ((TokyoStatisticMessage) this.instance).setBacklightTimeMsg(backlightTimeWeekMessage);
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage statisBaseMessage) {
                copyOnWrite();
                ((TokyoStatisticMessage) this.instance).setBase(statisBaseMessage);
                return this;
            }

            public Builder setEvent(TokyoEventMessage tokyoEventMessage) {
                copyOnWrite();
                ((TokyoStatisticMessage) this.instance).setEvent(tokyoEventMessage);
                return this;
            }

            private Builder() {
                super(TokyoStatisticMessage.DEFAULT_INSTANCE);
            }

            public Builder setBacklightTimeMsg(BacklightTime.BacklightTimeWeekMessage.Builder builder) {
                copyOnWrite();
                ((TokyoStatisticMessage) this.instance).setBacklightTimeMsg(builder.build());
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage.Builder builder) {
                copyOnWrite();
                ((TokyoStatisticMessage) this.instance).setBase(builder.build());
                return this;
            }

            public Builder setEvent(TokyoEventMessage.Builder builder) {
                copyOnWrite();
                ((TokyoStatisticMessage) this.instance).setEvent(builder.build());
                return this;
            }
        }

        static {
            TokyoStatisticMessage tokyoStatisticMessage = new TokyoStatisticMessage();
            DEFAULT_INSTANCE = tokyoStatisticMessage;
            GeneratedMessageLite.registerDefaultInstance(TokyoStatisticMessage.class, tokyoStatisticMessage);
        }

        private TokyoStatisticMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBacklightTimeMsg() {
            this.backlightTimeMsg_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBase() {
            this.base_ = null;
            this.bitField0_ &= -2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEvent() {
            this.event_ = null;
            this.bitField0_ &= -3;
        }

        public static TokyoStatisticMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeBacklightTimeMsg(BacklightTime.BacklightTimeWeekMessage backlightTimeWeekMessage) {
            backlightTimeWeekMessage.getClass();
            BacklightTime.BacklightTimeWeekMessage backlightTimeWeekMessage2 = this.backlightTimeMsg_;
            if (backlightTimeWeekMessage2 == null || backlightTimeWeekMessage2 == BacklightTime.BacklightTimeWeekMessage.getDefaultInstance()) {
                this.backlightTimeMsg_ = backlightTimeWeekMessage;
            } else {
                this.backlightTimeMsg_ = BacklightTime.BacklightTimeWeekMessage.newBuilder(this.backlightTimeMsg_).mergeFrom(backlightTimeWeekMessage).buildPartial();
            }
            this.bitField0_ |= 4;
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
        public void mergeEvent(TokyoEventMessage tokyoEventMessage) {
            tokyoEventMessage.getClass();
            TokyoEventMessage tokyoEventMessage2 = this.event_;
            if (tokyoEventMessage2 == null || tokyoEventMessage2 == TokyoEventMessage.getDefaultInstance()) {
                this.event_ = tokyoEventMessage;
            } else {
                this.event_ = TokyoEventMessage.newBuilder(this.event_).mergeFrom(tokyoEventMessage).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TokyoStatisticMessage parseDelimitedFrom(InputStream inputStream) {
            return (TokyoStatisticMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TokyoStatisticMessage parseFrom(ByteBuffer byteBuffer) {
            return (TokyoStatisticMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<TokyoStatisticMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBacklightTimeMsg(BacklightTime.BacklightTimeWeekMessage backlightTimeWeekMessage) {
            backlightTimeWeekMessage.getClass();
            this.backlightTimeMsg_ = backlightTimeWeekMessage;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBase(StatisBase.StatisBaseMessage statisBaseMessage) {
            statisBaseMessage.getClass();
            this.base_ = statisBaseMessage;
            this.bitField0_ |= 1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEvent(TokyoEventMessage tokyoEventMessage) {
            tokyoEventMessage.getClass();
            this.event_ = tokyoEventMessage;
            this.bitField0_ |= 2;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new TokyoStatisticMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔉ\u0000\u0002ᔉ\u0001\u0003ᔉ\u0002", new Object[]{"bitField0_", "base_", "event_", "backlightTimeMsg_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<TokyoStatisticMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (TokyoStatisticMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoStatisticMessageOrBuilder
        public BacklightTime.BacklightTimeWeekMessage getBacklightTimeMsg() {
            BacklightTime.BacklightTimeWeekMessage backlightTimeWeekMessage = this.backlightTimeMsg_;
            return backlightTimeWeekMessage == null ? BacklightTime.BacklightTimeWeekMessage.getDefaultInstance() : backlightTimeWeekMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoStatisticMessageOrBuilder
        public StatisBase.StatisBaseMessage getBase() {
            StatisBase.StatisBaseMessage statisBaseMessage = this.base_;
            return statisBaseMessage == null ? StatisBase.StatisBaseMessage.getDefaultInstance() : statisBaseMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoStatisticMessageOrBuilder
        public TokyoEventMessage getEvent() {
            TokyoEventMessage tokyoEventMessage = this.event_;
            return tokyoEventMessage == null ? TokyoEventMessage.getDefaultInstance() : tokyoEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoStatisticMessageOrBuilder
        public boolean hasBacklightTimeMsg() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoStatisticMessageOrBuilder
        public boolean hasBase() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tokyo.TokyoStatisticMessageOrBuilder
        public boolean hasEvent() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(TokyoStatisticMessage tokyoStatisticMessage) {
            return DEFAULT_INSTANCE.createBuilder(tokyoStatisticMessage);
        }

        public static TokyoStatisticMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (TokyoStatisticMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static TokyoStatisticMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (TokyoStatisticMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static TokyoStatisticMessage parseFrom(ByteString byteString) {
            return (TokyoStatisticMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TokyoStatisticMessage parseFrom(ByteString byteString, t tVar) {
            return (TokyoStatisticMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static TokyoStatisticMessage parseFrom(byte[] bArr) {
            return (TokyoStatisticMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TokyoStatisticMessage parseFrom(byte[] bArr, t tVar) {
            return (TokyoStatisticMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static TokyoStatisticMessage parseFrom(InputStream inputStream) {
            return (TokyoStatisticMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TokyoStatisticMessage parseFrom(InputStream inputStream, t tVar) {
            return (TokyoStatisticMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static TokyoStatisticMessage parseFrom(j jVar) {
            return (TokyoStatisticMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static TokyoStatisticMessage parseFrom(j jVar, t tVar) {
            return (TokyoStatisticMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface TokyoStatisticMessageOrBuilder extends bsf {
        BacklightTime.BacklightTimeWeekMessage getBacklightTimeMsg();

        StatisBase.StatisBaseMessage getBase();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        TokyoEventMessage getEvent();

        boolean hasBacklightTimeMsg();

        boolean hasBase();

        boolean hasEvent();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    private Tokyo() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}
