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
public final class Jiuhuashan {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.Jiuhuashan$1, reason: invalid class name */
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

    public static final class JiuhuashanEventMessage extends GeneratedMessageLite<JiuhuashanEventMessage, Builder> implements JiuhuashanEventMessageOrBuilder {
        public static final int ALARMPAGE_FIELD_NUMBER = 12;
        public static final int ALIPAYCODE128NUM_FIELD_NUMBER = 30;
        public static final int ALIPAYQRCODENUM_FIELD_NUMBER = 29;
        public static final int COMPASSNUM_FIELD_NUMBER = 28;
        public static final int COMPASSPAGE_FIELD_NUMBER = 16;
        public static final int COUNTDOWNNUM_FIELD_NUMBER = 27;
        private static final JiuhuashanEventMessage DEFAULT_INSTANCE;
        public static final int DIAL2DND_FIELD_NUMBER = 3;
        public static final int DIAL2MAINITEM1_FIELD_NUMBER = 5;
        public static final int DIAL2NOTIFY_FIELD_NUMBER = 4;
        public static final int DIALID_FIELD_NUMBER = 31;
        public static final int ECG_AF_NUM_FIELD_NUMBER = 43;
        public static final int ECG_NORMAL_NUM_FIELD_NUMBER = 44;
        public static final int ECG_POORQUALITY_NUM_FIELD_NUMBER = 46;
        public static final int ECG_UNCLASSIFY_NUM_FIELD_NUMBER = 45;
        public static final int FALL_ALG_CNT_FIELD_NUMBER = 35;
        public static final int FALL_BLE_FAIL_CNT_FIELD_NUMBER = 42;
        public static final int FALL_BLE_SUCCESS_CNT_FIELD_NUMBER = 41;
        public static final int FALL_CANCEL_CNT_FIELD_NUMBER = 37;
        public static final int FALL_CONFIRM_CNT_FIELD_NUMBER = 36;
        public static final int FALL_CONFIRM_TIME_OUT_CNT_FIELD_NUMBER = 38;
        public static final int FALL_NB_FAIL_CNT_FIELD_NUMBER = 40;
        public static final int FALL_NB_SUCCESS_CNT_FIELD_NUMBER = 39;
        public static final int LCDONBECAUSEOFEVENT_FIELD_NUMBER = 2;
        public static final int LCDONBECAUSEOFPRESS_FIELD_NUMBER = 1;
        public static final int NBLOTFAILNUM_FIELD_NUMBER = 34;
        public static final int NBLOTSUCCESSNUM_FIELD_NUMBER = 33;
        public static final int NBLOTWORKNUM_FIELD_NUMBER = 32;
        private static volatile vkh<JiuhuashanEventMessage> PARSER = null;
        public static final int SETTINGBACKLIGHTPAGE_FIELD_NUMBER = 20;
        public static final int SETTINGLONGPRESSPAGE_FIELD_NUMBER = 19;
        public static final int SETTINGPAGE_FIELD_NUMBER = 17;
        public static final int SETTINGWATCHFACEPAGE_FIELD_NUMBER = 18;
        public static final int SKIPGPSLOCATIONNUM_FIELD_NUMBER = 22;
        public static final int SPO2_CLICK_NUM_FIELD_NUMBER = 47;
        public static final int SPO2_REPEAT_NUM_FIELD_NUMBER = 48;
        public static final int SPO2_RESULT_FAIL_NUM_FIELD_NUMBER = 49;
        public static final int SPO2_RESULT_REPEAT_NUM_FIELD_NUMBER = 50;
        public static final int SPORTHISTORYPAGE_FIELD_NUMBER = 9;
        public static final int SPORTPAGE1NUM_FIELD_NUMBER = 23;
        public static final int SPORTPAGE2NUM_FIELD_NUMBER = 24;
        public static final int SPORTPAGE3NUM_FIELD_NUMBER = 25;
        public static final int SPORTPAGE_FIELD_NUMBER = 8;
        public static final int SPORTSETTINGPAGE_FIELD_NUMBER = 10;
        public static final int STATUSPAGE1_FIELD_NUMBER = 6;
        public static final int STATUSPAGE2_FIELD_NUMBER = 7;
        public static final int STOPWATCHNUM_FIELD_NUMBER = 26;
        public static final int TIMERCOUNTDOWNPAGE_FIELD_NUMBER = 15;
        public static final int TIMERPAGE_FIELD_NUMBER = 13;
        public static final int TIMERSTOPWATCHPAGE_FIELD_NUMBER = 14;
        public static final int WAITGPSLOCATIONNUM_FIELD_NUMBER = 21;
        public static final int WEATHERPAGE_FIELD_NUMBER = 11;
        private int alarmPage_;
        private int alipayCode128Num_;
        private int alipayQRCodeNum_;
        private int bitField0_;
        private int bitField1_;
        private int compassNum_;
        private int compassPage_;
        private int countdownNum_;
        private int dial2DND_;
        private int dial2MainItem1_;
        private int dial2Notify_;
        private int dialId_;
        private int ecgAfNum_;
        private int ecgNormalNum_;
        private int ecgPoorqualityNum_;
        private int ecgUnclassifyNum_;
        private int fallAlgCnt_;
        private int fallBleFailCnt_;
        private int fallBleSuccessCnt_;
        private int fallCancelCnt_;
        private int fallConfirmCnt_;
        private int fallConfirmTimeOutCnt_;
        private int fallNbFailCnt_;
        private int fallNbSuccessCnt_;
        private int lcdOnBecauseOfEvent_;
        private int lcdOnBecauseOfPress_;
        private byte memoizedIsInitialized = 2;
        private int nblotFailNum_;
        private int nblotSuccessNum_;
        private int nblotWorkNum_;
        private int settingBacklightPage_;
        private int settingLongpressPage_;
        private int settingPage_;
        private int settingWatchfacePage_;
        private int skipGpsLocationNum_;
        private int spo2ClickNum_;
        private int spo2RepeatNum_;
        private int spo2ResultFailNum_;
        private int spo2ResultRepeatNum_;
        private int sportHistoryPage_;
        private int sportPage1Num_;
        private int sportPage2Num_;
        private int sportPage3Num_;
        private int sportPage_;
        private int sportSettingPage_;
        private int statusPage1_;
        private int statusPage2_;
        private int stopwatchNum_;
        private int timerCountdownPage_;
        private int timerPage_;
        private int timerStopwatchPage_;
        private int waitGpsLocationNum_;
        private int weatherPage_;

        public static final class Builder extends GeneratedMessageLite.a<JiuhuashanEventMessage, Builder> implements JiuhuashanEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAlarmPage() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearAlarmPage();
                return this;
            }

            public Builder clearAlipayCode128Num() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearAlipayCode128Num();
                return this;
            }

            public Builder clearAlipayQRCodeNum() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearAlipayQRCodeNum();
                return this;
            }

            public Builder clearCompassNum() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearCompassNum();
                return this;
            }

            public Builder clearCompassPage() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearCompassPage();
                return this;
            }

            public Builder clearCountdownNum() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearCountdownNum();
                return this;
            }

            public Builder clearDial2DND() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearDial2DND();
                return this;
            }

            public Builder clearDial2MainItem1() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearDial2MainItem1();
                return this;
            }

            public Builder clearDial2Notify() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearDial2Notify();
                return this;
            }

            public Builder clearDialId() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearDialId();
                return this;
            }

            public Builder clearEcgAfNum() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearEcgAfNum();
                return this;
            }

            public Builder clearEcgNormalNum() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearEcgNormalNum();
                return this;
            }

            public Builder clearEcgPoorqualityNum() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearEcgPoorqualityNum();
                return this;
            }

            public Builder clearEcgUnclassifyNum() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearEcgUnclassifyNum();
                return this;
            }

            public Builder clearFallAlgCnt() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearFallAlgCnt();
                return this;
            }

            public Builder clearFallBleFailCnt() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearFallBleFailCnt();
                return this;
            }

            public Builder clearFallBleSuccessCnt() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearFallBleSuccessCnt();
                return this;
            }

            public Builder clearFallCancelCnt() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearFallCancelCnt();
                return this;
            }

            public Builder clearFallConfirmCnt() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearFallConfirmCnt();
                return this;
            }

            public Builder clearFallConfirmTimeOutCnt() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearFallConfirmTimeOutCnt();
                return this;
            }

            public Builder clearFallNbFailCnt() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearFallNbFailCnt();
                return this;
            }

            public Builder clearFallNbSuccessCnt() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearFallNbSuccessCnt();
                return this;
            }

            public Builder clearLcdOnBecauseOfEvent() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearLcdOnBecauseOfEvent();
                return this;
            }

            public Builder clearLcdOnBecauseOfPress() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearLcdOnBecauseOfPress();
                return this;
            }

            public Builder clearNblotFailNum() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearNblotFailNum();
                return this;
            }

            public Builder clearNblotSuccessNum() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearNblotSuccessNum();
                return this;
            }

            public Builder clearNblotWorkNum() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearNblotWorkNum();
                return this;
            }

            public Builder clearSettingBacklightPage() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearSettingBacklightPage();
                return this;
            }

            public Builder clearSettingLongpressPage() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearSettingLongpressPage();
                return this;
            }

            public Builder clearSettingPage() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearSettingPage();
                return this;
            }

            public Builder clearSettingWatchfacePage() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearSettingWatchfacePage();
                return this;
            }

            public Builder clearSkipGpsLocationNum() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearSkipGpsLocationNum();
                return this;
            }

            public Builder clearSpo2ClickNum() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearSpo2ClickNum();
                return this;
            }

            public Builder clearSpo2RepeatNum() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearSpo2RepeatNum();
                return this;
            }

            public Builder clearSpo2ResultFailNum() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearSpo2ResultFailNum();
                return this;
            }

            public Builder clearSpo2ResultRepeatNum() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearSpo2ResultRepeatNum();
                return this;
            }

            public Builder clearSportHistoryPage() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearSportHistoryPage();
                return this;
            }

            public Builder clearSportPage() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearSportPage();
                return this;
            }

            public Builder clearSportPage1Num() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearSportPage1Num();
                return this;
            }

            public Builder clearSportPage2Num() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearSportPage2Num();
                return this;
            }

            public Builder clearSportPage3Num() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearSportPage3Num();
                return this;
            }

            public Builder clearSportSettingPage() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearSportSettingPage();
                return this;
            }

            public Builder clearStatusPage1() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearStatusPage1();
                return this;
            }

            public Builder clearStatusPage2() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearStatusPage2();
                return this;
            }

            public Builder clearStopwatchNum() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearStopwatchNum();
                return this;
            }

            public Builder clearTimerCountdownPage() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearTimerCountdownPage();
                return this;
            }

            public Builder clearTimerPage() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearTimerPage();
                return this;
            }

            public Builder clearTimerStopwatchPage() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearTimerStopwatchPage();
                return this;
            }

            public Builder clearWaitGpsLocationNum() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearWaitGpsLocationNum();
                return this;
            }

            public Builder clearWeatherPage() {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).clearWeatherPage();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getAlarmPage() {
                return ((JiuhuashanEventMessage) this.instance).getAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getAlipayCode128Num() {
                return ((JiuhuashanEventMessage) this.instance).getAlipayCode128Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getAlipayQRCodeNum() {
                return ((JiuhuashanEventMessage) this.instance).getAlipayQRCodeNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getCompassNum() {
                return ((JiuhuashanEventMessage) this.instance).getCompassNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getCompassPage() {
                return ((JiuhuashanEventMessage) this.instance).getCompassPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getCountdownNum() {
                return ((JiuhuashanEventMessage) this.instance).getCountdownNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getDial2DND() {
                return ((JiuhuashanEventMessage) this.instance).getDial2DND();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getDial2MainItem1() {
                return ((JiuhuashanEventMessage) this.instance).getDial2MainItem1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getDial2Notify() {
                return ((JiuhuashanEventMessage) this.instance).getDial2Notify();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getDialId() {
                return ((JiuhuashanEventMessage) this.instance).getDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getEcgAfNum() {
                return ((JiuhuashanEventMessage) this.instance).getEcgAfNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getEcgNormalNum() {
                return ((JiuhuashanEventMessage) this.instance).getEcgNormalNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getEcgPoorqualityNum() {
                return ((JiuhuashanEventMessage) this.instance).getEcgPoorqualityNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getEcgUnclassifyNum() {
                return ((JiuhuashanEventMessage) this.instance).getEcgUnclassifyNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getFallAlgCnt() {
                return ((JiuhuashanEventMessage) this.instance).getFallAlgCnt();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getFallBleFailCnt() {
                return ((JiuhuashanEventMessage) this.instance).getFallBleFailCnt();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getFallBleSuccessCnt() {
                return ((JiuhuashanEventMessage) this.instance).getFallBleSuccessCnt();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getFallCancelCnt() {
                return ((JiuhuashanEventMessage) this.instance).getFallCancelCnt();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getFallConfirmCnt() {
                return ((JiuhuashanEventMessage) this.instance).getFallConfirmCnt();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getFallConfirmTimeOutCnt() {
                return ((JiuhuashanEventMessage) this.instance).getFallConfirmTimeOutCnt();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getFallNbFailCnt() {
                return ((JiuhuashanEventMessage) this.instance).getFallNbFailCnt();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getFallNbSuccessCnt() {
                return ((JiuhuashanEventMessage) this.instance).getFallNbSuccessCnt();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getLcdOnBecauseOfEvent() {
                return ((JiuhuashanEventMessage) this.instance).getLcdOnBecauseOfEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getLcdOnBecauseOfPress() {
                return ((JiuhuashanEventMessage) this.instance).getLcdOnBecauseOfPress();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getNblotFailNum() {
                return ((JiuhuashanEventMessage) this.instance).getNblotFailNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getNblotSuccessNum() {
                return ((JiuhuashanEventMessage) this.instance).getNblotSuccessNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getNblotWorkNum() {
                return ((JiuhuashanEventMessage) this.instance).getNblotWorkNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getSettingBacklightPage() {
                return ((JiuhuashanEventMessage) this.instance).getSettingBacklightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getSettingLongpressPage() {
                return ((JiuhuashanEventMessage) this.instance).getSettingLongpressPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getSettingPage() {
                return ((JiuhuashanEventMessage) this.instance).getSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getSettingWatchfacePage() {
                return ((JiuhuashanEventMessage) this.instance).getSettingWatchfacePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getSkipGpsLocationNum() {
                return ((JiuhuashanEventMessage) this.instance).getSkipGpsLocationNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getSpo2ClickNum() {
                return ((JiuhuashanEventMessage) this.instance).getSpo2ClickNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getSpo2RepeatNum() {
                return ((JiuhuashanEventMessage) this.instance).getSpo2RepeatNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getSpo2ResultFailNum() {
                return ((JiuhuashanEventMessage) this.instance).getSpo2ResultFailNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getSpo2ResultRepeatNum() {
                return ((JiuhuashanEventMessage) this.instance).getSpo2ResultRepeatNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getSportHistoryPage() {
                return ((JiuhuashanEventMessage) this.instance).getSportHistoryPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getSportPage() {
                return ((JiuhuashanEventMessage) this.instance).getSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getSportPage1Num() {
                return ((JiuhuashanEventMessage) this.instance).getSportPage1Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getSportPage2Num() {
                return ((JiuhuashanEventMessage) this.instance).getSportPage2Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getSportPage3Num() {
                return ((JiuhuashanEventMessage) this.instance).getSportPage3Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getSportSettingPage() {
                return ((JiuhuashanEventMessage) this.instance).getSportSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getStatusPage1() {
                return ((JiuhuashanEventMessage) this.instance).getStatusPage1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getStatusPage2() {
                return ((JiuhuashanEventMessage) this.instance).getStatusPage2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getStopwatchNum() {
                return ((JiuhuashanEventMessage) this.instance).getStopwatchNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getTimerCountdownPage() {
                return ((JiuhuashanEventMessage) this.instance).getTimerCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getTimerPage() {
                return ((JiuhuashanEventMessage) this.instance).getTimerPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getTimerStopwatchPage() {
                return ((JiuhuashanEventMessage) this.instance).getTimerStopwatchPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getWaitGpsLocationNum() {
                return ((JiuhuashanEventMessage) this.instance).getWaitGpsLocationNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public int getWeatherPage() {
                return ((JiuhuashanEventMessage) this.instance).getWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasAlarmPage() {
                return ((JiuhuashanEventMessage) this.instance).hasAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasAlipayCode128Num() {
                return ((JiuhuashanEventMessage) this.instance).hasAlipayCode128Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasAlipayQRCodeNum() {
                return ((JiuhuashanEventMessage) this.instance).hasAlipayQRCodeNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasCompassNum() {
                return ((JiuhuashanEventMessage) this.instance).hasCompassNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasCompassPage() {
                return ((JiuhuashanEventMessage) this.instance).hasCompassPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasCountdownNum() {
                return ((JiuhuashanEventMessage) this.instance).hasCountdownNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasDial2DND() {
                return ((JiuhuashanEventMessage) this.instance).hasDial2DND();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasDial2MainItem1() {
                return ((JiuhuashanEventMessage) this.instance).hasDial2MainItem1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasDial2Notify() {
                return ((JiuhuashanEventMessage) this.instance).hasDial2Notify();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasDialId() {
                return ((JiuhuashanEventMessage) this.instance).hasDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasEcgAfNum() {
                return ((JiuhuashanEventMessage) this.instance).hasEcgAfNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasEcgNormalNum() {
                return ((JiuhuashanEventMessage) this.instance).hasEcgNormalNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasEcgPoorqualityNum() {
                return ((JiuhuashanEventMessage) this.instance).hasEcgPoorqualityNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasEcgUnclassifyNum() {
                return ((JiuhuashanEventMessage) this.instance).hasEcgUnclassifyNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasFallAlgCnt() {
                return ((JiuhuashanEventMessage) this.instance).hasFallAlgCnt();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasFallBleFailCnt() {
                return ((JiuhuashanEventMessage) this.instance).hasFallBleFailCnt();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasFallBleSuccessCnt() {
                return ((JiuhuashanEventMessage) this.instance).hasFallBleSuccessCnt();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasFallCancelCnt() {
                return ((JiuhuashanEventMessage) this.instance).hasFallCancelCnt();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasFallConfirmCnt() {
                return ((JiuhuashanEventMessage) this.instance).hasFallConfirmCnt();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasFallConfirmTimeOutCnt() {
                return ((JiuhuashanEventMessage) this.instance).hasFallConfirmTimeOutCnt();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasFallNbFailCnt() {
                return ((JiuhuashanEventMessage) this.instance).hasFallNbFailCnt();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasFallNbSuccessCnt() {
                return ((JiuhuashanEventMessage) this.instance).hasFallNbSuccessCnt();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfEvent() {
                return ((JiuhuashanEventMessage) this.instance).hasLcdOnBecauseOfEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfPress() {
                return ((JiuhuashanEventMessage) this.instance).hasLcdOnBecauseOfPress();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasNblotFailNum() {
                return ((JiuhuashanEventMessage) this.instance).hasNblotFailNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasNblotSuccessNum() {
                return ((JiuhuashanEventMessage) this.instance).hasNblotSuccessNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasNblotWorkNum() {
                return ((JiuhuashanEventMessage) this.instance).hasNblotWorkNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasSettingBacklightPage() {
                return ((JiuhuashanEventMessage) this.instance).hasSettingBacklightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasSettingLongpressPage() {
                return ((JiuhuashanEventMessage) this.instance).hasSettingLongpressPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasSettingPage() {
                return ((JiuhuashanEventMessage) this.instance).hasSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasSettingWatchfacePage() {
                return ((JiuhuashanEventMessage) this.instance).hasSettingWatchfacePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasSkipGpsLocationNum() {
                return ((JiuhuashanEventMessage) this.instance).hasSkipGpsLocationNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasSpo2ClickNum() {
                return ((JiuhuashanEventMessage) this.instance).hasSpo2ClickNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasSpo2RepeatNum() {
                return ((JiuhuashanEventMessage) this.instance).hasSpo2RepeatNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasSpo2ResultFailNum() {
                return ((JiuhuashanEventMessage) this.instance).hasSpo2ResultFailNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasSpo2ResultRepeatNum() {
                return ((JiuhuashanEventMessage) this.instance).hasSpo2ResultRepeatNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasSportHistoryPage() {
                return ((JiuhuashanEventMessage) this.instance).hasSportHistoryPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasSportPage() {
                return ((JiuhuashanEventMessage) this.instance).hasSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasSportPage1Num() {
                return ((JiuhuashanEventMessage) this.instance).hasSportPage1Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasSportPage2Num() {
                return ((JiuhuashanEventMessage) this.instance).hasSportPage2Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasSportPage3Num() {
                return ((JiuhuashanEventMessage) this.instance).hasSportPage3Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasSportSettingPage() {
                return ((JiuhuashanEventMessage) this.instance).hasSportSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasStatusPage1() {
                return ((JiuhuashanEventMessage) this.instance).hasStatusPage1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasStatusPage2() {
                return ((JiuhuashanEventMessage) this.instance).hasStatusPage2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasStopwatchNum() {
                return ((JiuhuashanEventMessage) this.instance).hasStopwatchNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasTimerCountdownPage() {
                return ((JiuhuashanEventMessage) this.instance).hasTimerCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasTimerPage() {
                return ((JiuhuashanEventMessage) this.instance).hasTimerPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasTimerStopwatchPage() {
                return ((JiuhuashanEventMessage) this.instance).hasTimerStopwatchPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasWaitGpsLocationNum() {
                return ((JiuhuashanEventMessage) this.instance).hasWaitGpsLocationNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
            public boolean hasWeatherPage() {
                return ((JiuhuashanEventMessage) this.instance).hasWeatherPage();
            }

            public Builder setAlarmPage(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setAlarmPage(i);
                return this;
            }

            public Builder setAlipayCode128Num(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setAlipayCode128Num(i);
                return this;
            }

            public Builder setAlipayQRCodeNum(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setAlipayQRCodeNum(i);
                return this;
            }

            public Builder setCompassNum(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setCompassNum(i);
                return this;
            }

            public Builder setCompassPage(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setCompassPage(i);
                return this;
            }

            public Builder setCountdownNum(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setCountdownNum(i);
                return this;
            }

            public Builder setDial2DND(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setDial2DND(i);
                return this;
            }

            public Builder setDial2MainItem1(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setDial2MainItem1(i);
                return this;
            }

            public Builder setDial2Notify(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setDial2Notify(i);
                return this;
            }

            public Builder setDialId(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setDialId(i);
                return this;
            }

            public Builder setEcgAfNum(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setEcgAfNum(i);
                return this;
            }

            public Builder setEcgNormalNum(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setEcgNormalNum(i);
                return this;
            }

            public Builder setEcgPoorqualityNum(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setEcgPoorqualityNum(i);
                return this;
            }

            public Builder setEcgUnclassifyNum(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setEcgUnclassifyNum(i);
                return this;
            }

            public Builder setFallAlgCnt(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setFallAlgCnt(i);
                return this;
            }

            public Builder setFallBleFailCnt(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setFallBleFailCnt(i);
                return this;
            }

            public Builder setFallBleSuccessCnt(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setFallBleSuccessCnt(i);
                return this;
            }

            public Builder setFallCancelCnt(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setFallCancelCnt(i);
                return this;
            }

            public Builder setFallConfirmCnt(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setFallConfirmCnt(i);
                return this;
            }

            public Builder setFallConfirmTimeOutCnt(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setFallConfirmTimeOutCnt(i);
                return this;
            }

            public Builder setFallNbFailCnt(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setFallNbFailCnt(i);
                return this;
            }

            public Builder setFallNbSuccessCnt(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setFallNbSuccessCnt(i);
                return this;
            }

            public Builder setLcdOnBecauseOfEvent(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setLcdOnBecauseOfEvent(i);
                return this;
            }

            public Builder setLcdOnBecauseOfPress(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setLcdOnBecauseOfPress(i);
                return this;
            }

            public Builder setNblotFailNum(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setNblotFailNum(i);
                return this;
            }

            public Builder setNblotSuccessNum(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setNblotSuccessNum(i);
                return this;
            }

            public Builder setNblotWorkNum(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setNblotWorkNum(i);
                return this;
            }

            public Builder setSettingBacklightPage(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setSettingBacklightPage(i);
                return this;
            }

            public Builder setSettingLongpressPage(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setSettingLongpressPage(i);
                return this;
            }

            public Builder setSettingPage(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setSettingPage(i);
                return this;
            }

            public Builder setSettingWatchfacePage(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setSettingWatchfacePage(i);
                return this;
            }

            public Builder setSkipGpsLocationNum(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setSkipGpsLocationNum(i);
                return this;
            }

            public Builder setSpo2ClickNum(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setSpo2ClickNum(i);
                return this;
            }

            public Builder setSpo2RepeatNum(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setSpo2RepeatNum(i);
                return this;
            }

            public Builder setSpo2ResultFailNum(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setSpo2ResultFailNum(i);
                return this;
            }

            public Builder setSpo2ResultRepeatNum(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setSpo2ResultRepeatNum(i);
                return this;
            }

            public Builder setSportHistoryPage(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setSportHistoryPage(i);
                return this;
            }

            public Builder setSportPage(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setSportPage(i);
                return this;
            }

            public Builder setSportPage1Num(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setSportPage1Num(i);
                return this;
            }

            public Builder setSportPage2Num(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setSportPage2Num(i);
                return this;
            }

            public Builder setSportPage3Num(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setSportPage3Num(i);
                return this;
            }

            public Builder setSportSettingPage(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setSportSettingPage(i);
                return this;
            }

            public Builder setStatusPage1(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setStatusPage1(i);
                return this;
            }

            public Builder setStatusPage2(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setStatusPage2(i);
                return this;
            }

            public Builder setStopwatchNum(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setStopwatchNum(i);
                return this;
            }

            public Builder setTimerCountdownPage(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setTimerCountdownPage(i);
                return this;
            }

            public Builder setTimerPage(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setTimerPage(i);
                return this;
            }

            public Builder setTimerStopwatchPage(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setTimerStopwatchPage(i);
                return this;
            }

            public Builder setWaitGpsLocationNum(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setWaitGpsLocationNum(i);
                return this;
            }

            public Builder setWeatherPage(int i) {
                copyOnWrite();
                ((JiuhuashanEventMessage) this.instance).setWeatherPage(i);
                return this;
            }

            private Builder() {
                super(JiuhuashanEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            JiuhuashanEventMessage jiuhuashanEventMessage = new JiuhuashanEventMessage();
            DEFAULT_INSTANCE = jiuhuashanEventMessage;
            GeneratedMessageLite.registerDefaultInstance(JiuhuashanEventMessage.class, jiuhuashanEventMessage);
        }

        private JiuhuashanEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmPage() {
            this.bitField0_ &= -2049;
            this.alarmPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCode128Num() {
            this.bitField0_ &= -536870913;
            this.alipayCode128Num_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRCodeNum() {
            this.bitField0_ &= -268435457;
            this.alipayQRCodeNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCompassNum() {
            this.bitField0_ &= -134217729;
            this.compassNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCompassPage() {
            this.bitField0_ &= -32769;
            this.compassPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountdownNum() {
            this.bitField0_ &= -67108865;
            this.countdownNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDial2DND() {
            this.bitField0_ &= -5;
            this.dial2DND_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDial2MainItem1() {
            this.bitField0_ &= -17;
            this.dial2MainItem1_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDial2Notify() {
            this.bitField0_ &= -9;
            this.dial2Notify_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialId() {
            this.bitField0_ &= -1073741825;
            this.dialId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEcgAfNum() {
            this.bitField1_ &= -1025;
            this.ecgAfNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEcgNormalNum() {
            this.bitField1_ &= -2049;
            this.ecgNormalNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEcgPoorqualityNum() {
            this.bitField1_ &= -8193;
            this.ecgPoorqualityNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEcgUnclassifyNum() {
            this.bitField1_ &= -4097;
            this.ecgUnclassifyNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFallAlgCnt() {
            this.bitField1_ &= -5;
            this.fallAlgCnt_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFallBleFailCnt() {
            this.bitField1_ &= -513;
            this.fallBleFailCnt_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFallBleSuccessCnt() {
            this.bitField1_ &= -257;
            this.fallBleSuccessCnt_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFallCancelCnt() {
            this.bitField1_ &= -17;
            this.fallCancelCnt_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFallConfirmCnt() {
            this.bitField1_ &= -9;
            this.fallConfirmCnt_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFallConfirmTimeOutCnt() {
            this.bitField1_ &= -33;
            this.fallConfirmTimeOutCnt_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFallNbFailCnt() {
            this.bitField1_ &= -129;
            this.fallNbFailCnt_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFallNbSuccessCnt() {
            this.bitField1_ &= -65;
            this.fallNbSuccessCnt_ = 0;
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
        public void clearNblotFailNum() {
            this.bitField1_ &= -3;
            this.nblotFailNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNblotSuccessNum() {
            this.bitField1_ &= -2;
            this.nblotSuccessNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNblotWorkNum() {
            this.bitField0_ &= Integer.MAX_VALUE;
            this.nblotWorkNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSettingBacklightPage() {
            this.bitField0_ &= -524289;
            this.settingBacklightPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSettingLongpressPage() {
            this.bitField0_ &= -262145;
            this.settingLongpressPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSettingPage() {
            this.bitField0_ &= -65537;
            this.settingPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSettingWatchfacePage() {
            this.bitField0_ &= -131073;
            this.settingWatchfacePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkipGpsLocationNum() {
            this.bitField0_ &= -2097153;
            this.skipGpsLocationNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSpo2ClickNum() {
            this.bitField1_ &= -16385;
            this.spo2ClickNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSpo2RepeatNum() {
            this.bitField1_ &= -32769;
            this.spo2RepeatNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSpo2ResultFailNum() {
            this.bitField1_ &= -65537;
            this.spo2ResultFailNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSpo2ResultRepeatNum() {
            this.bitField1_ &= -131073;
            this.spo2ResultRepeatNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportHistoryPage() {
            this.bitField0_ &= -257;
            this.sportHistoryPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportPage() {
            this.bitField0_ &= -129;
            this.sportPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportPage1Num() {
            this.bitField0_ &= -4194305;
            this.sportPage1Num_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportPage2Num() {
            this.bitField0_ &= -8388609;
            this.sportPage2Num_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportPage3Num() {
            this.bitField0_ &= -16777217;
            this.sportPage3Num_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportSettingPage() {
            this.bitField0_ &= -513;
            this.sportSettingPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatusPage1() {
            this.bitField0_ &= -33;
            this.statusPage1_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatusPage2() {
            this.bitField0_ &= -65;
            this.statusPage2_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStopwatchNum() {
            this.bitField0_ &= -33554433;
            this.stopwatchNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimerCountdownPage() {
            this.bitField0_ &= -16385;
            this.timerCountdownPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimerPage() {
            this.bitField0_ &= -4097;
            this.timerPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimerStopwatchPage() {
            this.bitField0_ &= -8193;
            this.timerStopwatchPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWaitGpsLocationNum() {
            this.bitField0_ &= -1048577;
            this.waitGpsLocationNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeatherPage() {
            this.bitField0_ &= -1025;
            this.weatherPage_ = 0;
        }

        public static JiuhuashanEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static JiuhuashanEventMessage parseDelimitedFrom(InputStream inputStream) {
            return (JiuhuashanEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static JiuhuashanEventMessage parseFrom(ByteBuffer byteBuffer) {
            return (JiuhuashanEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<JiuhuashanEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmPage(int i) {
            this.bitField0_ |= 2048;
            this.alarmPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCode128Num(int i) {
            this.bitField0_ |= 536870912;
            this.alipayCode128Num_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRCodeNum(int i) {
            this.bitField0_ |= 268435456;
            this.alipayQRCodeNum_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCompassNum(int i) {
            this.bitField0_ |= 134217728;
            this.compassNum_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCompassPage(int i) {
            this.bitField0_ |= 32768;
            this.compassPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountdownNum(int i) {
            this.bitField0_ |= 67108864;
            this.countdownNum_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDial2DND(int i) {
            this.bitField0_ |= 4;
            this.dial2DND_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDial2MainItem1(int i) {
            this.bitField0_ |= 16;
            this.dial2MainItem1_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDial2Notify(int i) {
            this.bitField0_ |= 8;
            this.dial2Notify_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialId(int i) {
            this.bitField0_ |= 1073741824;
            this.dialId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEcgAfNum(int i) {
            this.bitField1_ |= 1024;
            this.ecgAfNum_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEcgNormalNum(int i) {
            this.bitField1_ |= 2048;
            this.ecgNormalNum_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEcgPoorqualityNum(int i) {
            this.bitField1_ |= 8192;
            this.ecgPoorqualityNum_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEcgUnclassifyNum(int i) {
            this.bitField1_ |= 4096;
            this.ecgUnclassifyNum_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFallAlgCnt(int i) {
            this.bitField1_ |= 4;
            this.fallAlgCnt_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFallBleFailCnt(int i) {
            this.bitField1_ |= 512;
            this.fallBleFailCnt_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFallBleSuccessCnt(int i) {
            this.bitField1_ |= 256;
            this.fallBleSuccessCnt_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFallCancelCnt(int i) {
            this.bitField1_ |= 16;
            this.fallCancelCnt_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFallConfirmCnt(int i) {
            this.bitField1_ |= 8;
            this.fallConfirmCnt_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFallConfirmTimeOutCnt(int i) {
            this.bitField1_ |= 32;
            this.fallConfirmTimeOutCnt_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFallNbFailCnt(int i) {
            this.bitField1_ |= 128;
            this.fallNbFailCnt_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFallNbSuccessCnt(int i) {
            this.bitField1_ |= 64;
            this.fallNbSuccessCnt_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOnBecauseOfEvent(int i) {
            this.bitField0_ |= 2;
            this.lcdOnBecauseOfEvent_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOnBecauseOfPress(int i) {
            this.bitField0_ |= 1;
            this.lcdOnBecauseOfPress_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNblotFailNum(int i) {
            this.bitField1_ |= 2;
            this.nblotFailNum_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNblotSuccessNum(int i) {
            this.bitField1_ |= 1;
            this.nblotSuccessNum_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNblotWorkNum(int i) {
            this.bitField0_ |= Integer.MIN_VALUE;
            this.nblotWorkNum_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingBacklightPage(int i) {
            this.bitField0_ |= 524288;
            this.settingBacklightPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingLongpressPage(int i) {
            this.bitField0_ |= 262144;
            this.settingLongpressPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingPage(int i) {
            this.bitField0_ |= 65536;
            this.settingPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingWatchfacePage(int i) {
            this.bitField0_ |= 131072;
            this.settingWatchfacePage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkipGpsLocationNum(int i) {
            this.bitField0_ |= 2097152;
            this.skipGpsLocationNum_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpo2ClickNum(int i) {
            this.bitField1_ |= 16384;
            this.spo2ClickNum_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpo2RepeatNum(int i) {
            this.bitField1_ |= 32768;
            this.spo2RepeatNum_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpo2ResultFailNum(int i) {
            this.bitField1_ |= 65536;
            this.spo2ResultFailNum_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSpo2ResultRepeatNum(int i) {
            this.bitField1_ |= 131072;
            this.spo2ResultRepeatNum_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportHistoryPage(int i) {
            this.bitField0_ |= 256;
            this.sportHistoryPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportPage(int i) {
            this.bitField0_ |= 128;
            this.sportPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportPage1Num(int i) {
            this.bitField0_ |= 4194304;
            this.sportPage1Num_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportPage2Num(int i) {
            this.bitField0_ |= NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY;
            this.sportPage2Num_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportPage3Num(int i) {
            this.bitField0_ |= 16777216;
            this.sportPage3Num_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportSettingPage(int i) {
            this.bitField0_ |= 512;
            this.sportSettingPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusPage1(int i) {
            this.bitField0_ |= 32;
            this.statusPage1_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusPage2(int i) {
            this.bitField0_ |= 64;
            this.statusPage2_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopwatchNum(int i) {
            this.bitField0_ |= 33554432;
            this.stopwatchNum_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimerCountdownPage(int i) {
            this.bitField0_ |= 16384;
            this.timerCountdownPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimerPage(int i) {
            this.bitField0_ |= 4096;
            this.timerPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimerStopwatchPage(int i) {
            this.bitField0_ |= 8192;
            this.timerStopwatchPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWaitGpsLocationNum(int i) {
            this.bitField0_ |= EventRecurrence.TH;
            this.waitGpsLocationNum_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeatherPage(int i) {
            this.bitField0_ |= 1024;
            this.weatherPage_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new JiuhuashanEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u00012\u0000\u0002\u000122\u0000\u0000 \u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f\u0011ᔋ\u0010\u0012ᔋ\u0011\u0013ᔋ\u0012\u0014ᔋ\u0013\u0015ᔋ\u0014\u0016ᔋ\u0015\u0017ᔋ\u0016\u0018ᔋ\u0017\u0019ᔋ\u0018\u001aᔋ\u0019\u001bᔋ\u001a\u001cᔋ\u001b\u001dဋ\u001c\u001eဋ\u001d\u001fဋ\u001e ဋ\u001f!ဋ \"ဋ!#ဋ\"$ဋ#%ဋ$&ဋ%'ဋ&(ဋ')ဋ(*ဋ)+ᔋ*,ᔋ+-ᔋ,.ᔋ-/ဋ.0ဋ/1ဋ02ဋ1", new Object[]{"bitField0_", "bitField1_", "lcdOnBecauseOfPress_", "lcdOnBecauseOfEvent_", "dial2DND_", "dial2Notify_", "dial2MainItem1_", "statusPage1_", "statusPage2_", "sportPage_", "sportHistoryPage_", "sportSettingPage_", "weatherPage_", "alarmPage_", "timerPage_", "timerStopwatchPage_", "timerCountdownPage_", "compassPage_", "settingPage_", "settingWatchfacePage_", "settingLongpressPage_", "settingBacklightPage_", "waitGpsLocationNum_", "skipGpsLocationNum_", "sportPage1Num_", "sportPage2Num_", "sportPage3Num_", "stopwatchNum_", "countdownNum_", "compassNum_", "alipayQRCodeNum_", "alipayCode128Num_", "dialId_", "nblotWorkNum_", "nblotSuccessNum_", "nblotFailNum_", "fallAlgCnt_", "fallConfirmCnt_", "fallCancelCnt_", "fallConfirmTimeOutCnt_", "fallNbSuccessCnt_", "fallNbFailCnt_", "fallBleSuccessCnt_", "fallBleFailCnt_", "ecgAfNum_", "ecgNormalNum_", "ecgUnclassifyNum_", "ecgPoorqualityNum_", "spo2ClickNum_", "spo2RepeatNum_", "spo2ResultFailNum_", "spo2ResultRepeatNum_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<JiuhuashanEventMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (JiuhuashanEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getAlarmPage() {
            return this.alarmPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getAlipayCode128Num() {
            return this.alipayCode128Num_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getAlipayQRCodeNum() {
            return this.alipayQRCodeNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getCompassNum() {
            return this.compassNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getCompassPage() {
            return this.compassPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getCountdownNum() {
            return this.countdownNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getDial2DND() {
            return this.dial2DND_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getDial2MainItem1() {
            return this.dial2MainItem1_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getDial2Notify() {
            return this.dial2Notify_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getDialId() {
            return this.dialId_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getEcgAfNum() {
            return this.ecgAfNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getEcgNormalNum() {
            return this.ecgNormalNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getEcgPoorqualityNum() {
            return this.ecgPoorqualityNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getEcgUnclassifyNum() {
            return this.ecgUnclassifyNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getFallAlgCnt() {
            return this.fallAlgCnt_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getFallBleFailCnt() {
            return this.fallBleFailCnt_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getFallBleSuccessCnt() {
            return this.fallBleSuccessCnt_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getFallCancelCnt() {
            return this.fallCancelCnt_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getFallConfirmCnt() {
            return this.fallConfirmCnt_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getFallConfirmTimeOutCnt() {
            return this.fallConfirmTimeOutCnt_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getFallNbFailCnt() {
            return this.fallNbFailCnt_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getFallNbSuccessCnt() {
            return this.fallNbSuccessCnt_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getLcdOnBecauseOfEvent() {
            return this.lcdOnBecauseOfEvent_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getLcdOnBecauseOfPress() {
            return this.lcdOnBecauseOfPress_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getNblotFailNum() {
            return this.nblotFailNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getNblotSuccessNum() {
            return this.nblotSuccessNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getNblotWorkNum() {
            return this.nblotWorkNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getSettingBacklightPage() {
            return this.settingBacklightPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getSettingLongpressPage() {
            return this.settingLongpressPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getSettingPage() {
            return this.settingPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getSettingWatchfacePage() {
            return this.settingWatchfacePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getSkipGpsLocationNum() {
            return this.skipGpsLocationNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getSpo2ClickNum() {
            return this.spo2ClickNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getSpo2RepeatNum() {
            return this.spo2RepeatNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getSpo2ResultFailNum() {
            return this.spo2ResultFailNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getSpo2ResultRepeatNum() {
            return this.spo2ResultRepeatNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getSportHistoryPage() {
            return this.sportHistoryPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getSportPage() {
            return this.sportPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getSportPage1Num() {
            return this.sportPage1Num_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getSportPage2Num() {
            return this.sportPage2Num_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getSportPage3Num() {
            return this.sportPage3Num_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getSportSettingPage() {
            return this.sportSettingPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getStatusPage1() {
            return this.statusPage1_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getStatusPage2() {
            return this.statusPage2_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getStopwatchNum() {
            return this.stopwatchNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getTimerCountdownPage() {
            return this.timerCountdownPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getTimerPage() {
            return this.timerPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getTimerStopwatchPage() {
            return this.timerStopwatchPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getWaitGpsLocationNum() {
            return this.waitGpsLocationNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public int getWeatherPage() {
            return this.weatherPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasAlarmPage() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasAlipayCode128Num() {
            return (this.bitField0_ & 536870912) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasAlipayQRCodeNum() {
            return (this.bitField0_ & 268435456) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasCompassNum() {
            return (this.bitField0_ & 134217728) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasCompassPage() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasCountdownNum() {
            return (this.bitField0_ & 67108864) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasDial2DND() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasDial2MainItem1() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasDial2Notify() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasDialId() {
            return (this.bitField0_ & 1073741824) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasEcgAfNum() {
            return (this.bitField1_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasEcgNormalNum() {
            return (this.bitField1_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasEcgPoorqualityNum() {
            return (this.bitField1_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasEcgUnclassifyNum() {
            return (this.bitField1_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasFallAlgCnt() {
            return (this.bitField1_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasFallBleFailCnt() {
            return (this.bitField1_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasFallBleSuccessCnt() {
            return (this.bitField1_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasFallCancelCnt() {
            return (this.bitField1_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasFallConfirmCnt() {
            return (this.bitField1_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasFallConfirmTimeOutCnt() {
            return (this.bitField1_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasFallNbFailCnt() {
            return (this.bitField1_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasFallNbSuccessCnt() {
            return (this.bitField1_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfEvent() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfPress() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasNblotFailNum() {
            return (this.bitField1_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasNblotSuccessNum() {
            return (this.bitField1_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasNblotWorkNum() {
            return (this.bitField0_ & Integer.MIN_VALUE) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasSettingBacklightPage() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasSettingLongpressPage() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasSettingPage() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasSettingWatchfacePage() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasSkipGpsLocationNum() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasSpo2ClickNum() {
            return (this.bitField1_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasSpo2RepeatNum() {
            return (this.bitField1_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasSpo2ResultFailNum() {
            return (this.bitField1_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasSpo2ResultRepeatNum() {
            return (this.bitField1_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasSportHistoryPage() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasSportPage() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasSportPage1Num() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasSportPage2Num() {
            return (this.bitField0_ & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasSportPage3Num() {
            return (this.bitField0_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasSportSettingPage() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasStatusPage1() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasStatusPage2() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasStopwatchNum() {
            return (this.bitField0_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasTimerCountdownPage() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasTimerPage() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasTimerStopwatchPage() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasWaitGpsLocationNum() {
            return (this.bitField0_ & EventRecurrence.TH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanEventMessageOrBuilder
        public boolean hasWeatherPage() {
            return (this.bitField0_ & 1024) != 0;
        }

        public static Builder newBuilder(JiuhuashanEventMessage jiuhuashanEventMessage) {
            return DEFAULT_INSTANCE.createBuilder(jiuhuashanEventMessage);
        }

        public static JiuhuashanEventMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (JiuhuashanEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static JiuhuashanEventMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (JiuhuashanEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static JiuhuashanEventMessage parseFrom(ByteString byteString) {
            return (JiuhuashanEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static JiuhuashanEventMessage parseFrom(ByteString byteString, t tVar) {
            return (JiuhuashanEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static JiuhuashanEventMessage parseFrom(byte[] bArr) {
            return (JiuhuashanEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static JiuhuashanEventMessage parseFrom(byte[] bArr, t tVar) {
            return (JiuhuashanEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static JiuhuashanEventMessage parseFrom(InputStream inputStream) {
            return (JiuhuashanEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static JiuhuashanEventMessage parseFrom(InputStream inputStream, t tVar) {
            return (JiuhuashanEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static JiuhuashanEventMessage parseFrom(j jVar) {
            return (JiuhuashanEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static JiuhuashanEventMessage parseFrom(j jVar, t tVar) {
            return (JiuhuashanEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface JiuhuashanEventMessageOrBuilder extends bsf {
        int getAlarmPage();

        int getAlipayCode128Num();

        int getAlipayQRCodeNum();

        int getCompassNum();

        int getCompassPage();

        int getCountdownNum();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getDial2DND();

        int getDial2MainItem1();

        int getDial2Notify();

        int getDialId();

        int getEcgAfNum();

        int getEcgNormalNum();

        int getEcgPoorqualityNum();

        int getEcgUnclassifyNum();

        int getFallAlgCnt();

        int getFallBleFailCnt();

        int getFallBleSuccessCnt();

        int getFallCancelCnt();

        int getFallConfirmCnt();

        int getFallConfirmTimeOutCnt();

        int getFallNbFailCnt();

        int getFallNbSuccessCnt();

        int getLcdOnBecauseOfEvent();

        int getLcdOnBecauseOfPress();

        int getNblotFailNum();

        int getNblotSuccessNum();

        int getNblotWorkNum();

        int getSettingBacklightPage();

        int getSettingLongpressPage();

        int getSettingPage();

        int getSettingWatchfacePage();

        int getSkipGpsLocationNum();

        int getSpo2ClickNum();

        int getSpo2RepeatNum();

        int getSpo2ResultFailNum();

        int getSpo2ResultRepeatNum();

        int getSportHistoryPage();

        int getSportPage();

        int getSportPage1Num();

        int getSportPage2Num();

        int getSportPage3Num();

        int getSportSettingPage();

        int getStatusPage1();

        int getStatusPage2();

        int getStopwatchNum();

        int getTimerCountdownPage();

        int getTimerPage();

        int getTimerStopwatchPage();

        int getWaitGpsLocationNum();

        int getWeatherPage();

        boolean hasAlarmPage();

        boolean hasAlipayCode128Num();

        boolean hasAlipayQRCodeNum();

        boolean hasCompassNum();

        boolean hasCompassPage();

        boolean hasCountdownNum();

        boolean hasDial2DND();

        boolean hasDial2MainItem1();

        boolean hasDial2Notify();

        boolean hasDialId();

        boolean hasEcgAfNum();

        boolean hasEcgNormalNum();

        boolean hasEcgPoorqualityNum();

        boolean hasEcgUnclassifyNum();

        boolean hasFallAlgCnt();

        boolean hasFallBleFailCnt();

        boolean hasFallBleSuccessCnt();

        boolean hasFallCancelCnt();

        boolean hasFallConfirmCnt();

        boolean hasFallConfirmTimeOutCnt();

        boolean hasFallNbFailCnt();

        boolean hasFallNbSuccessCnt();

        boolean hasLcdOnBecauseOfEvent();

        boolean hasLcdOnBecauseOfPress();

        boolean hasNblotFailNum();

        boolean hasNblotSuccessNum();

        boolean hasNblotWorkNum();

        boolean hasSettingBacklightPage();

        boolean hasSettingLongpressPage();

        boolean hasSettingPage();

        boolean hasSettingWatchfacePage();

        boolean hasSkipGpsLocationNum();

        boolean hasSpo2ClickNum();

        boolean hasSpo2RepeatNum();

        boolean hasSpo2ResultFailNum();

        boolean hasSpo2ResultRepeatNum();

        boolean hasSportHistoryPage();

        boolean hasSportPage();

        boolean hasSportPage1Num();

        boolean hasSportPage2Num();

        boolean hasSportPage3Num();

        boolean hasSportSettingPage();

        boolean hasStatusPage1();

        boolean hasStatusPage2();

        boolean hasStopwatchNum();

        boolean hasTimerCountdownPage();

        boolean hasTimerPage();

        boolean hasTimerStopwatchPage();

        boolean hasWaitGpsLocationNum();

        boolean hasWeatherPage();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class JiuhuashanStatisticsMessage extends GeneratedMessageLite<JiuhuashanStatisticsMessage, Builder> implements JiuhuashanStatisticsMessageOrBuilder {
        public static final int BACKLIGHTLEVEL_FIELD_NUMBER = 3;
        public static final int BASE_FIELD_NUMBER = 1;
        private static final JiuhuashanStatisticsMessage DEFAULT_INSTANCE;
        public static final int EVENT_FIELD_NUMBER = 4;
        private static volatile vkh<JiuhuashanStatisticsMessage> PARSER = null;
        public static final int SILENCEMODE_FIELD_NUMBER = 2;
        private int backlightLevel_;
        private StatisBase.StatisBaseMessage base_;
        private int bitField0_;
        private JiuhuashanEventMessage event_;
        private byte memoizedIsInitialized = 2;
        private int silenceMode_;

        public static final class Builder extends GeneratedMessageLite.a<JiuhuashanStatisticsMessage, Builder> implements JiuhuashanStatisticsMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBacklightLevel() {
                copyOnWrite();
                ((JiuhuashanStatisticsMessage) this.instance).clearBacklightLevel();
                return this;
            }

            public Builder clearBase() {
                copyOnWrite();
                ((JiuhuashanStatisticsMessage) this.instance).clearBase();
                return this;
            }

            public Builder clearEvent() {
                copyOnWrite();
                ((JiuhuashanStatisticsMessage) this.instance).clearEvent();
                return this;
            }

            public Builder clearSilenceMode() {
                copyOnWrite();
                ((JiuhuashanStatisticsMessage) this.instance).clearSilenceMode();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanStatisticsMessageOrBuilder
            public int getBacklightLevel() {
                return ((JiuhuashanStatisticsMessage) this.instance).getBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanStatisticsMessageOrBuilder
            public StatisBase.StatisBaseMessage getBase() {
                return ((JiuhuashanStatisticsMessage) this.instance).getBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanStatisticsMessageOrBuilder
            public JiuhuashanEventMessage getEvent() {
                return ((JiuhuashanStatisticsMessage) this.instance).getEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanStatisticsMessageOrBuilder
            public SilenceModeOuterClass.SilenceMode getSilenceMode() {
                return ((JiuhuashanStatisticsMessage) this.instance).getSilenceMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanStatisticsMessageOrBuilder
            public boolean hasBacklightLevel() {
                return ((JiuhuashanStatisticsMessage) this.instance).hasBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanStatisticsMessageOrBuilder
            public boolean hasBase() {
                return ((JiuhuashanStatisticsMessage) this.instance).hasBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanStatisticsMessageOrBuilder
            public boolean hasEvent() {
                return ((JiuhuashanStatisticsMessage) this.instance).hasEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanStatisticsMessageOrBuilder
            public boolean hasSilenceMode() {
                return ((JiuhuashanStatisticsMessage) this.instance).hasSilenceMode();
            }

            public Builder mergeBase(StatisBase.StatisBaseMessage statisBaseMessage) {
                copyOnWrite();
                ((JiuhuashanStatisticsMessage) this.instance).mergeBase(statisBaseMessage);
                return this;
            }

            public Builder mergeEvent(JiuhuashanEventMessage jiuhuashanEventMessage) {
                copyOnWrite();
                ((JiuhuashanStatisticsMessage) this.instance).mergeEvent(jiuhuashanEventMessage);
                return this;
            }

            public Builder setBacklightLevel(int i) {
                copyOnWrite();
                ((JiuhuashanStatisticsMessage) this.instance).setBacklightLevel(i);
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage statisBaseMessage) {
                copyOnWrite();
                ((JiuhuashanStatisticsMessage) this.instance).setBase(statisBaseMessage);
                return this;
            }

            public Builder setEvent(JiuhuashanEventMessage jiuhuashanEventMessage) {
                copyOnWrite();
                ((JiuhuashanStatisticsMessage) this.instance).setEvent(jiuhuashanEventMessage);
                return this;
            }

            public Builder setSilenceMode(SilenceModeOuterClass.SilenceMode silenceMode) {
                copyOnWrite();
                ((JiuhuashanStatisticsMessage) this.instance).setSilenceMode(silenceMode);
                return this;
            }

            private Builder() {
                super(JiuhuashanStatisticsMessage.DEFAULT_INSTANCE);
            }

            public Builder setBase(StatisBase.StatisBaseMessage.Builder builder) {
                copyOnWrite();
                ((JiuhuashanStatisticsMessage) this.instance).setBase(builder.build());
                return this;
            }

            public Builder setEvent(JiuhuashanEventMessage.Builder builder) {
                copyOnWrite();
                ((JiuhuashanStatisticsMessage) this.instance).setEvent(builder.build());
                return this;
            }
        }

        static {
            JiuhuashanStatisticsMessage jiuhuashanStatisticsMessage = new JiuhuashanStatisticsMessage();
            DEFAULT_INSTANCE = jiuhuashanStatisticsMessage;
            GeneratedMessageLite.registerDefaultInstance(JiuhuashanStatisticsMessage.class, jiuhuashanStatisticsMessage);
        }

        private JiuhuashanStatisticsMessage() {
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
        public void clearSilenceMode() {
            this.bitField0_ &= -3;
            this.silenceMode_ = 0;
        }

        public static JiuhuashanStatisticsMessage getDefaultInstance() {
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
        public void mergeEvent(JiuhuashanEventMessage jiuhuashanEventMessage) {
            jiuhuashanEventMessage.getClass();
            JiuhuashanEventMessage jiuhuashanEventMessage2 = this.event_;
            if (jiuhuashanEventMessage2 == null || jiuhuashanEventMessage2 == JiuhuashanEventMessage.getDefaultInstance()) {
                this.event_ = jiuhuashanEventMessage;
            } else {
                this.event_ = JiuhuashanEventMessage.newBuilder(this.event_).mergeFrom(jiuhuashanEventMessage).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static JiuhuashanStatisticsMessage parseDelimitedFrom(InputStream inputStream) {
            return (JiuhuashanStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static JiuhuashanStatisticsMessage parseFrom(ByteBuffer byteBuffer) {
            return (JiuhuashanStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<JiuhuashanStatisticsMessage> parser() {
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
        public void setEvent(JiuhuashanEventMessage jiuhuashanEventMessage) {
            jiuhuashanEventMessage.getClass();
            this.event_ = jiuhuashanEventMessage;
            this.bitField0_ |= 8;
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
                    return new JiuhuashanStatisticsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᔉ\u0000\u0002ᔌ\u0001\u0003ᔋ\u0002\u0004ᐉ\u0003", new Object[]{"bitField0_", "base_", "silenceMode_", SilenceModeOuterClass.SilenceMode.internalGetVerifier(), "backlightLevel_", "event_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<JiuhuashanStatisticsMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (JiuhuashanStatisticsMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanStatisticsMessageOrBuilder
        public int getBacklightLevel() {
            return this.backlightLevel_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanStatisticsMessageOrBuilder
        public StatisBase.StatisBaseMessage getBase() {
            StatisBase.StatisBaseMessage statisBaseMessage = this.base_;
            return statisBaseMessage == null ? StatisBase.StatisBaseMessage.getDefaultInstance() : statisBaseMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanStatisticsMessageOrBuilder
        public JiuhuashanEventMessage getEvent() {
            JiuhuashanEventMessage jiuhuashanEventMessage = this.event_;
            return jiuhuashanEventMessage == null ? JiuhuashanEventMessage.getDefaultInstance() : jiuhuashanEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanStatisticsMessageOrBuilder
        public SilenceModeOuterClass.SilenceMode getSilenceMode() {
            SilenceModeOuterClass.SilenceMode silenceModeForNumber = SilenceModeOuterClass.SilenceMode.forNumber(this.silenceMode_);
            return silenceModeForNumber == null ? SilenceModeOuterClass.SilenceMode.OFF : silenceModeForNumber;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanStatisticsMessageOrBuilder
        public boolean hasBacklightLevel() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanStatisticsMessageOrBuilder
        public boolean hasBase() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanStatisticsMessageOrBuilder
        public boolean hasEvent() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Jiuhuashan.JiuhuashanStatisticsMessageOrBuilder
        public boolean hasSilenceMode() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(JiuhuashanStatisticsMessage jiuhuashanStatisticsMessage) {
            return DEFAULT_INSTANCE.createBuilder(jiuhuashanStatisticsMessage);
        }

        public static JiuhuashanStatisticsMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (JiuhuashanStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static JiuhuashanStatisticsMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (JiuhuashanStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static JiuhuashanStatisticsMessage parseFrom(ByteString byteString) {
            return (JiuhuashanStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static JiuhuashanStatisticsMessage parseFrom(ByteString byteString, t tVar) {
            return (JiuhuashanStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static JiuhuashanStatisticsMessage parseFrom(byte[] bArr) {
            return (JiuhuashanStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static JiuhuashanStatisticsMessage parseFrom(byte[] bArr, t tVar) {
            return (JiuhuashanStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static JiuhuashanStatisticsMessage parseFrom(InputStream inputStream) {
            return (JiuhuashanStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static JiuhuashanStatisticsMessage parseFrom(InputStream inputStream, t tVar) {
            return (JiuhuashanStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static JiuhuashanStatisticsMessage parseFrom(j jVar) {
            return (JiuhuashanStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static JiuhuashanStatisticsMessage parseFrom(j jVar, t tVar) {
            return (JiuhuashanStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface JiuhuashanStatisticsMessageOrBuilder extends bsf {
        int getBacklightLevel();

        StatisBase.StatisBaseMessage getBase();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        JiuhuashanEventMessage getEvent();

        SilenceModeOuterClass.SilenceMode getSilenceMode();

        boolean hasBacklightLevel();

        boolean hasBase();

        boolean hasEvent();

        boolean hasSilenceMode();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    private Jiuhuashan() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}
