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
public final class Tonlesap {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.Tonlesap$1, reason: invalid class name */
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

    public static final class TonlesapEventMessage extends GeneratedMessageLite<TonlesapEventMessage, Builder> implements TonlesapEventMessageOrBuilder {
        public static final int ALARMPAGE_FIELD_NUMBER = 12;
        public static final int ALIPAYCODE128NUM_FIELD_NUMBER = 30;
        public static final int ALIPAYQRCODENUM_FIELD_NUMBER = 29;
        public static final int COMPASSNUM_FIELD_NUMBER = 28;
        public static final int COMPASSPAGE_FIELD_NUMBER = 16;
        public static final int COUNTDOWNNUM_FIELD_NUMBER = 27;
        private static final TonlesapEventMessage DEFAULT_INSTANCE;
        public static final int DIAL2DND_FIELD_NUMBER = 3;
        public static final int DIAL2MAINITEM1_FIELD_NUMBER = 5;
        public static final int DIAL2NOTIFY_FIELD_NUMBER = 4;
        public static final int DIALID_FIELD_NUMBER = 31;
        public static final int LCDONBECAUSEOFEVENT_FIELD_NUMBER = 2;
        public static final int LCDONBECAUSEOFPRESS_FIELD_NUMBER = 1;
        private static volatile vkh<TonlesapEventMessage> PARSER = null;
        public static final int SETTINGBACKLIGHTPAGE_FIELD_NUMBER = 20;
        public static final int SETTINGLONGPRESSPAGE_FIELD_NUMBER = 19;
        public static final int SETTINGPAGE_FIELD_NUMBER = 17;
        public static final int SETTINGWATCHFACEPAGE_FIELD_NUMBER = 18;
        public static final int SKIPGPSLOCATIONNUM_FIELD_NUMBER = 22;
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
        private int compassNum_;
        private int compassPage_;
        private int countdownNum_;
        private int dial2DND_;
        private int dial2MainItem1_;
        private int dial2Notify_;
        private int dialId_;
        private int lcdOnBecauseOfEvent_;
        private int lcdOnBecauseOfPress_;
        private byte memoizedIsInitialized = 2;
        private int settingBacklightPage_;
        private int settingLongpressPage_;
        private int settingPage_;
        private int settingWatchfacePage_;
        private int skipGpsLocationNum_;
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

        public static final class Builder extends GeneratedMessageLite.a<TonlesapEventMessage, Builder> implements TonlesapEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAlarmPage() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearAlarmPage();
                return this;
            }

            public Builder clearAlipayCode128Num() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearAlipayCode128Num();
                return this;
            }

            public Builder clearAlipayQRCodeNum() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearAlipayQRCodeNum();
                return this;
            }

            public Builder clearCompassNum() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearCompassNum();
                return this;
            }

            public Builder clearCompassPage() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearCompassPage();
                return this;
            }

            public Builder clearCountdownNum() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearCountdownNum();
                return this;
            }

            public Builder clearDial2DND() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearDial2DND();
                return this;
            }

            public Builder clearDial2MainItem1() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearDial2MainItem1();
                return this;
            }

            public Builder clearDial2Notify() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearDial2Notify();
                return this;
            }

            public Builder clearDialId() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearDialId();
                return this;
            }

            public Builder clearLcdOnBecauseOfEvent() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearLcdOnBecauseOfEvent();
                return this;
            }

            public Builder clearLcdOnBecauseOfPress() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearLcdOnBecauseOfPress();
                return this;
            }

            public Builder clearSettingBacklightPage() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearSettingBacklightPage();
                return this;
            }

            public Builder clearSettingLongpressPage() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearSettingLongpressPage();
                return this;
            }

            public Builder clearSettingPage() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearSettingPage();
                return this;
            }

            public Builder clearSettingWatchfacePage() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearSettingWatchfacePage();
                return this;
            }

            public Builder clearSkipGpsLocationNum() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearSkipGpsLocationNum();
                return this;
            }

            public Builder clearSportHistoryPage() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearSportHistoryPage();
                return this;
            }

            public Builder clearSportPage() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearSportPage();
                return this;
            }

            public Builder clearSportPage1Num() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearSportPage1Num();
                return this;
            }

            public Builder clearSportPage2Num() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearSportPage2Num();
                return this;
            }

            public Builder clearSportPage3Num() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearSportPage3Num();
                return this;
            }

            public Builder clearSportSettingPage() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearSportSettingPage();
                return this;
            }

            public Builder clearStatusPage1() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearStatusPage1();
                return this;
            }

            public Builder clearStatusPage2() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearStatusPage2();
                return this;
            }

            public Builder clearStopwatchNum() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearStopwatchNum();
                return this;
            }

            public Builder clearTimerCountdownPage() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearTimerCountdownPage();
                return this;
            }

            public Builder clearTimerPage() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearTimerPage();
                return this;
            }

            public Builder clearTimerStopwatchPage() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearTimerStopwatchPage();
                return this;
            }

            public Builder clearWaitGpsLocationNum() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearWaitGpsLocationNum();
                return this;
            }

            public Builder clearWeatherPage() {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).clearWeatherPage();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getAlarmPage() {
                return ((TonlesapEventMessage) this.instance).getAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getAlipayCode128Num() {
                return ((TonlesapEventMessage) this.instance).getAlipayCode128Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getAlipayQRCodeNum() {
                return ((TonlesapEventMessage) this.instance).getAlipayQRCodeNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getCompassNum() {
                return ((TonlesapEventMessage) this.instance).getCompassNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getCompassPage() {
                return ((TonlesapEventMessage) this.instance).getCompassPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getCountdownNum() {
                return ((TonlesapEventMessage) this.instance).getCountdownNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getDial2DND() {
                return ((TonlesapEventMessage) this.instance).getDial2DND();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getDial2MainItem1() {
                return ((TonlesapEventMessage) this.instance).getDial2MainItem1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getDial2Notify() {
                return ((TonlesapEventMessage) this.instance).getDial2Notify();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getDialId() {
                return ((TonlesapEventMessage) this.instance).getDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getLcdOnBecauseOfEvent() {
                return ((TonlesapEventMessage) this.instance).getLcdOnBecauseOfEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getLcdOnBecauseOfPress() {
                return ((TonlesapEventMessage) this.instance).getLcdOnBecauseOfPress();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getSettingBacklightPage() {
                return ((TonlesapEventMessage) this.instance).getSettingBacklightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getSettingLongpressPage() {
                return ((TonlesapEventMessage) this.instance).getSettingLongpressPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getSettingPage() {
                return ((TonlesapEventMessage) this.instance).getSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getSettingWatchfacePage() {
                return ((TonlesapEventMessage) this.instance).getSettingWatchfacePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getSkipGpsLocationNum() {
                return ((TonlesapEventMessage) this.instance).getSkipGpsLocationNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getSportHistoryPage() {
                return ((TonlesapEventMessage) this.instance).getSportHistoryPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getSportPage() {
                return ((TonlesapEventMessage) this.instance).getSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getSportPage1Num() {
                return ((TonlesapEventMessage) this.instance).getSportPage1Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getSportPage2Num() {
                return ((TonlesapEventMessage) this.instance).getSportPage2Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getSportPage3Num() {
                return ((TonlesapEventMessage) this.instance).getSportPage3Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getSportSettingPage() {
                return ((TonlesapEventMessage) this.instance).getSportSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getStatusPage1() {
                return ((TonlesapEventMessage) this.instance).getStatusPage1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getStatusPage2() {
                return ((TonlesapEventMessage) this.instance).getStatusPage2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getStopwatchNum() {
                return ((TonlesapEventMessage) this.instance).getStopwatchNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getTimerCountdownPage() {
                return ((TonlesapEventMessage) this.instance).getTimerCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getTimerPage() {
                return ((TonlesapEventMessage) this.instance).getTimerPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getTimerStopwatchPage() {
                return ((TonlesapEventMessage) this.instance).getTimerStopwatchPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getWaitGpsLocationNum() {
                return ((TonlesapEventMessage) this.instance).getWaitGpsLocationNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public int getWeatherPage() {
                return ((TonlesapEventMessage) this.instance).getWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasAlarmPage() {
                return ((TonlesapEventMessage) this.instance).hasAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasAlipayCode128Num() {
                return ((TonlesapEventMessage) this.instance).hasAlipayCode128Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasAlipayQRCodeNum() {
                return ((TonlesapEventMessage) this.instance).hasAlipayQRCodeNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasCompassNum() {
                return ((TonlesapEventMessage) this.instance).hasCompassNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasCompassPage() {
                return ((TonlesapEventMessage) this.instance).hasCompassPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasCountdownNum() {
                return ((TonlesapEventMessage) this.instance).hasCountdownNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasDial2DND() {
                return ((TonlesapEventMessage) this.instance).hasDial2DND();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasDial2MainItem1() {
                return ((TonlesapEventMessage) this.instance).hasDial2MainItem1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasDial2Notify() {
                return ((TonlesapEventMessage) this.instance).hasDial2Notify();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasDialId() {
                return ((TonlesapEventMessage) this.instance).hasDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfEvent() {
                return ((TonlesapEventMessage) this.instance).hasLcdOnBecauseOfEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfPress() {
                return ((TonlesapEventMessage) this.instance).hasLcdOnBecauseOfPress();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasSettingBacklightPage() {
                return ((TonlesapEventMessage) this.instance).hasSettingBacklightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasSettingLongpressPage() {
                return ((TonlesapEventMessage) this.instance).hasSettingLongpressPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasSettingPage() {
                return ((TonlesapEventMessage) this.instance).hasSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasSettingWatchfacePage() {
                return ((TonlesapEventMessage) this.instance).hasSettingWatchfacePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasSkipGpsLocationNum() {
                return ((TonlesapEventMessage) this.instance).hasSkipGpsLocationNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasSportHistoryPage() {
                return ((TonlesapEventMessage) this.instance).hasSportHistoryPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasSportPage() {
                return ((TonlesapEventMessage) this.instance).hasSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasSportPage1Num() {
                return ((TonlesapEventMessage) this.instance).hasSportPage1Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasSportPage2Num() {
                return ((TonlesapEventMessage) this.instance).hasSportPage2Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasSportPage3Num() {
                return ((TonlesapEventMessage) this.instance).hasSportPage3Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasSportSettingPage() {
                return ((TonlesapEventMessage) this.instance).hasSportSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasStatusPage1() {
                return ((TonlesapEventMessage) this.instance).hasStatusPage1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasStatusPage2() {
                return ((TonlesapEventMessage) this.instance).hasStatusPage2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasStopwatchNum() {
                return ((TonlesapEventMessage) this.instance).hasStopwatchNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasTimerCountdownPage() {
                return ((TonlesapEventMessage) this.instance).hasTimerCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasTimerPage() {
                return ((TonlesapEventMessage) this.instance).hasTimerPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasTimerStopwatchPage() {
                return ((TonlesapEventMessage) this.instance).hasTimerStopwatchPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasWaitGpsLocationNum() {
                return ((TonlesapEventMessage) this.instance).hasWaitGpsLocationNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
            public boolean hasWeatherPage() {
                return ((TonlesapEventMessage) this.instance).hasWeatherPage();
            }

            public Builder setAlarmPage(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setAlarmPage(i);
                return this;
            }

            public Builder setAlipayCode128Num(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setAlipayCode128Num(i);
                return this;
            }

            public Builder setAlipayQRCodeNum(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setAlipayQRCodeNum(i);
                return this;
            }

            public Builder setCompassNum(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setCompassNum(i);
                return this;
            }

            public Builder setCompassPage(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setCompassPage(i);
                return this;
            }

            public Builder setCountdownNum(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setCountdownNum(i);
                return this;
            }

            public Builder setDial2DND(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setDial2DND(i);
                return this;
            }

            public Builder setDial2MainItem1(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setDial2MainItem1(i);
                return this;
            }

            public Builder setDial2Notify(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setDial2Notify(i);
                return this;
            }

            public Builder setDialId(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setDialId(i);
                return this;
            }

            public Builder setLcdOnBecauseOfEvent(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setLcdOnBecauseOfEvent(i);
                return this;
            }

            public Builder setLcdOnBecauseOfPress(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setLcdOnBecauseOfPress(i);
                return this;
            }

            public Builder setSettingBacklightPage(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setSettingBacklightPage(i);
                return this;
            }

            public Builder setSettingLongpressPage(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setSettingLongpressPage(i);
                return this;
            }

            public Builder setSettingPage(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setSettingPage(i);
                return this;
            }

            public Builder setSettingWatchfacePage(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setSettingWatchfacePage(i);
                return this;
            }

            public Builder setSkipGpsLocationNum(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setSkipGpsLocationNum(i);
                return this;
            }

            public Builder setSportHistoryPage(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setSportHistoryPage(i);
                return this;
            }

            public Builder setSportPage(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setSportPage(i);
                return this;
            }

            public Builder setSportPage1Num(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setSportPage1Num(i);
                return this;
            }

            public Builder setSportPage2Num(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setSportPage2Num(i);
                return this;
            }

            public Builder setSportPage3Num(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setSportPage3Num(i);
                return this;
            }

            public Builder setSportSettingPage(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setSportSettingPage(i);
                return this;
            }

            public Builder setStatusPage1(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setStatusPage1(i);
                return this;
            }

            public Builder setStatusPage2(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setStatusPage2(i);
                return this;
            }

            public Builder setStopwatchNum(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setStopwatchNum(i);
                return this;
            }

            public Builder setTimerCountdownPage(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setTimerCountdownPage(i);
                return this;
            }

            public Builder setTimerPage(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setTimerPage(i);
                return this;
            }

            public Builder setTimerStopwatchPage(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setTimerStopwatchPage(i);
                return this;
            }

            public Builder setWaitGpsLocationNum(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setWaitGpsLocationNum(i);
                return this;
            }

            public Builder setWeatherPage(int i) {
                copyOnWrite();
                ((TonlesapEventMessage) this.instance).setWeatherPage(i);
                return this;
            }

            private Builder() {
                super(TonlesapEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            TonlesapEventMessage tonlesapEventMessage = new TonlesapEventMessage();
            DEFAULT_INSTANCE = tonlesapEventMessage;
            GeneratedMessageLite.registerDefaultInstance(TonlesapEventMessage.class, tonlesapEventMessage);
        }

        private TonlesapEventMessage() {
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

        public static TonlesapEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TonlesapEventMessage parseDelimitedFrom(InputStream inputStream) {
            return (TonlesapEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TonlesapEventMessage parseFrom(ByteBuffer byteBuffer) {
            return (TonlesapEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<TonlesapEventMessage> parser() {
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
                    return new TonlesapEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001f\u0000\u0001\u0001\u001f\u001f\u0000\u0000\u001c\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f\u0011ᔋ\u0010\u0012ᔋ\u0011\u0013ᔋ\u0012\u0014ᔋ\u0013\u0015ᔋ\u0014\u0016ᔋ\u0015\u0017ᔋ\u0016\u0018ᔋ\u0017\u0019ᔋ\u0018\u001aᔋ\u0019\u001bᔋ\u001a\u001cᔋ\u001b\u001dဋ\u001c\u001eဋ\u001d\u001fဋ\u001e", new Object[]{"bitField0_", "lcdOnBecauseOfPress_", "lcdOnBecauseOfEvent_", "dial2DND_", "dial2Notify_", "dial2MainItem1_", "statusPage1_", "statusPage2_", "sportPage_", "sportHistoryPage_", "sportSettingPage_", "weatherPage_", "alarmPage_", "timerPage_", "timerStopwatchPage_", "timerCountdownPage_", "compassPage_", "settingPage_", "settingWatchfacePage_", "settingLongpressPage_", "settingBacklightPage_", "waitGpsLocationNum_", "skipGpsLocationNum_", "sportPage1Num_", "sportPage2Num_", "sportPage3Num_", "stopwatchNum_", "countdownNum_", "compassNum_", "alipayQRCodeNum_", "alipayCode128Num_", "dialId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<TonlesapEventMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (TonlesapEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getAlarmPage() {
            return this.alarmPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getAlipayCode128Num() {
            return this.alipayCode128Num_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getAlipayQRCodeNum() {
            return this.alipayQRCodeNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getCompassNum() {
            return this.compassNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getCompassPage() {
            return this.compassPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getCountdownNum() {
            return this.countdownNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getDial2DND() {
            return this.dial2DND_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getDial2MainItem1() {
            return this.dial2MainItem1_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getDial2Notify() {
            return this.dial2Notify_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getDialId() {
            return this.dialId_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getLcdOnBecauseOfEvent() {
            return this.lcdOnBecauseOfEvent_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getLcdOnBecauseOfPress() {
            return this.lcdOnBecauseOfPress_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getSettingBacklightPage() {
            return this.settingBacklightPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getSettingLongpressPage() {
            return this.settingLongpressPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getSettingPage() {
            return this.settingPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getSettingWatchfacePage() {
            return this.settingWatchfacePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getSkipGpsLocationNum() {
            return this.skipGpsLocationNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getSportHistoryPage() {
            return this.sportHistoryPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getSportPage() {
            return this.sportPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getSportPage1Num() {
            return this.sportPage1Num_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getSportPage2Num() {
            return this.sportPage2Num_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getSportPage3Num() {
            return this.sportPage3Num_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getSportSettingPage() {
            return this.sportSettingPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getStatusPage1() {
            return this.statusPage1_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getStatusPage2() {
            return this.statusPage2_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getStopwatchNum() {
            return this.stopwatchNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getTimerCountdownPage() {
            return this.timerCountdownPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getTimerPage() {
            return this.timerPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getTimerStopwatchPage() {
            return this.timerStopwatchPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getWaitGpsLocationNum() {
            return this.waitGpsLocationNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public int getWeatherPage() {
            return this.weatherPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasAlarmPage() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasAlipayCode128Num() {
            return (this.bitField0_ & 536870912) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasAlipayQRCodeNum() {
            return (this.bitField0_ & 268435456) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasCompassNum() {
            return (this.bitField0_ & 134217728) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasCompassPage() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasCountdownNum() {
            return (this.bitField0_ & 67108864) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasDial2DND() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasDial2MainItem1() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasDial2Notify() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasDialId() {
            return (this.bitField0_ & 1073741824) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfEvent() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfPress() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasSettingBacklightPage() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasSettingLongpressPage() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasSettingPage() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasSettingWatchfacePage() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasSkipGpsLocationNum() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasSportHistoryPage() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasSportPage() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasSportPage1Num() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasSportPage2Num() {
            return (this.bitField0_ & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasSportPage3Num() {
            return (this.bitField0_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasSportSettingPage() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasStatusPage1() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasStatusPage2() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasStopwatchNum() {
            return (this.bitField0_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasTimerCountdownPage() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasTimerPage() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasTimerStopwatchPage() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasWaitGpsLocationNum() {
            return (this.bitField0_ & EventRecurrence.TH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapEventMessageOrBuilder
        public boolean hasWeatherPage() {
            return (this.bitField0_ & 1024) != 0;
        }

        public static Builder newBuilder(TonlesapEventMessage tonlesapEventMessage) {
            return DEFAULT_INSTANCE.createBuilder(tonlesapEventMessage);
        }

        public static TonlesapEventMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (TonlesapEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static TonlesapEventMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (TonlesapEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static TonlesapEventMessage parseFrom(ByteString byteString) {
            return (TonlesapEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TonlesapEventMessage parseFrom(ByteString byteString, t tVar) {
            return (TonlesapEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static TonlesapEventMessage parseFrom(byte[] bArr) {
            return (TonlesapEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TonlesapEventMessage parseFrom(byte[] bArr, t tVar) {
            return (TonlesapEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static TonlesapEventMessage parseFrom(InputStream inputStream) {
            return (TonlesapEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TonlesapEventMessage parseFrom(InputStream inputStream, t tVar) {
            return (TonlesapEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static TonlesapEventMessage parseFrom(j jVar) {
            return (TonlesapEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static TonlesapEventMessage parseFrom(j jVar, t tVar) {
            return (TonlesapEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface TonlesapEventMessageOrBuilder extends bsf {
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

        int getLcdOnBecauseOfEvent();

        int getLcdOnBecauseOfPress();

        int getSettingBacklightPage();

        int getSettingLongpressPage();

        int getSettingPage();

        int getSettingWatchfacePage();

        int getSkipGpsLocationNum();

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

        boolean hasLcdOnBecauseOfEvent();

        boolean hasLcdOnBecauseOfPress();

        boolean hasSettingBacklightPage();

        boolean hasSettingLongpressPage();

        boolean hasSettingPage();

        boolean hasSettingWatchfacePage();

        boolean hasSkipGpsLocationNum();

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

    public static final class TonlesapStatisticsMessage extends GeneratedMessageLite<TonlesapStatisticsMessage, Builder> implements TonlesapStatisticsMessageOrBuilder {
        public static final int BACKLIGHTLEVEL_FIELD_NUMBER = 3;
        public static final int BASE_FIELD_NUMBER = 1;
        private static final TonlesapStatisticsMessage DEFAULT_INSTANCE;
        public static final int EVENT_FIELD_NUMBER = 4;
        public static final int NFC_FIELD_NUMBER = 5;
        private static volatile vkh<TonlesapStatisticsMessage> PARSER = null;
        public static final int SILENCEMODE_FIELD_NUMBER = 2;
        private int backlightLevel_;
        private StatisBase.StatisBaseMessage base_;
        private int bitField0_;
        private TonlesapEventMessage event_;
        private byte memoizedIsInitialized = 2;
        private Nfc.NfcMessage nfc_;
        private int silenceMode_;

        public static final class Builder extends GeneratedMessageLite.a<TonlesapStatisticsMessage, Builder> implements TonlesapStatisticsMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBacklightLevel() {
                copyOnWrite();
                ((TonlesapStatisticsMessage) this.instance).clearBacklightLevel();
                return this;
            }

            public Builder clearBase() {
                copyOnWrite();
                ((TonlesapStatisticsMessage) this.instance).clearBase();
                return this;
            }

            public Builder clearEvent() {
                copyOnWrite();
                ((TonlesapStatisticsMessage) this.instance).clearEvent();
                return this;
            }

            public Builder clearNfc() {
                copyOnWrite();
                ((TonlesapStatisticsMessage) this.instance).clearNfc();
                return this;
            }

            public Builder clearSilenceMode() {
                copyOnWrite();
                ((TonlesapStatisticsMessage) this.instance).clearSilenceMode();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapStatisticsMessageOrBuilder
            public int getBacklightLevel() {
                return ((TonlesapStatisticsMessage) this.instance).getBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapStatisticsMessageOrBuilder
            public StatisBase.StatisBaseMessage getBase() {
                return ((TonlesapStatisticsMessage) this.instance).getBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapStatisticsMessageOrBuilder
            public TonlesapEventMessage getEvent() {
                return ((TonlesapStatisticsMessage) this.instance).getEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapStatisticsMessageOrBuilder
            public Nfc.NfcMessage getNfc() {
                return ((TonlesapStatisticsMessage) this.instance).getNfc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapStatisticsMessageOrBuilder
            public SilenceModeOuterClass.SilenceMode getSilenceMode() {
                return ((TonlesapStatisticsMessage) this.instance).getSilenceMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapStatisticsMessageOrBuilder
            public boolean hasBacklightLevel() {
                return ((TonlesapStatisticsMessage) this.instance).hasBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapStatisticsMessageOrBuilder
            public boolean hasBase() {
                return ((TonlesapStatisticsMessage) this.instance).hasBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapStatisticsMessageOrBuilder
            public boolean hasEvent() {
                return ((TonlesapStatisticsMessage) this.instance).hasEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapStatisticsMessageOrBuilder
            public boolean hasNfc() {
                return ((TonlesapStatisticsMessage) this.instance).hasNfc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapStatisticsMessageOrBuilder
            public boolean hasSilenceMode() {
                return ((TonlesapStatisticsMessage) this.instance).hasSilenceMode();
            }

            public Builder mergeBase(StatisBase.StatisBaseMessage statisBaseMessage) {
                copyOnWrite();
                ((TonlesapStatisticsMessage) this.instance).mergeBase(statisBaseMessage);
                return this;
            }

            public Builder mergeEvent(TonlesapEventMessage tonlesapEventMessage) {
                copyOnWrite();
                ((TonlesapStatisticsMessage) this.instance).mergeEvent(tonlesapEventMessage);
                return this;
            }

            public Builder mergeNfc(Nfc.NfcMessage nfcMessage) {
                copyOnWrite();
                ((TonlesapStatisticsMessage) this.instance).mergeNfc(nfcMessage);
                return this;
            }

            public Builder setBacklightLevel(int i) {
                copyOnWrite();
                ((TonlesapStatisticsMessage) this.instance).setBacklightLevel(i);
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage statisBaseMessage) {
                copyOnWrite();
                ((TonlesapStatisticsMessage) this.instance).setBase(statisBaseMessage);
                return this;
            }

            public Builder setEvent(TonlesapEventMessage tonlesapEventMessage) {
                copyOnWrite();
                ((TonlesapStatisticsMessage) this.instance).setEvent(tonlesapEventMessage);
                return this;
            }

            public Builder setNfc(Nfc.NfcMessage nfcMessage) {
                copyOnWrite();
                ((TonlesapStatisticsMessage) this.instance).setNfc(nfcMessage);
                return this;
            }

            public Builder setSilenceMode(SilenceModeOuterClass.SilenceMode silenceMode) {
                copyOnWrite();
                ((TonlesapStatisticsMessage) this.instance).setSilenceMode(silenceMode);
                return this;
            }

            private Builder() {
                super(TonlesapStatisticsMessage.DEFAULT_INSTANCE);
            }

            public Builder setBase(StatisBase.StatisBaseMessage.Builder builder) {
                copyOnWrite();
                ((TonlesapStatisticsMessage) this.instance).setBase(builder.build());
                return this;
            }

            public Builder setEvent(TonlesapEventMessage.Builder builder) {
                copyOnWrite();
                ((TonlesapStatisticsMessage) this.instance).setEvent(builder.build());
                return this;
            }

            public Builder setNfc(Nfc.NfcMessage.Builder builder) {
                copyOnWrite();
                ((TonlesapStatisticsMessage) this.instance).setNfc(builder.build());
                return this;
            }
        }

        static {
            TonlesapStatisticsMessage tonlesapStatisticsMessage = new TonlesapStatisticsMessage();
            DEFAULT_INSTANCE = tonlesapStatisticsMessage;
            GeneratedMessageLite.registerDefaultInstance(TonlesapStatisticsMessage.class, tonlesapStatisticsMessage);
        }

        private TonlesapStatisticsMessage() {
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

        public static TonlesapStatisticsMessage getDefaultInstance() {
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
        public void mergeEvent(TonlesapEventMessage tonlesapEventMessage) {
            tonlesapEventMessage.getClass();
            TonlesapEventMessage tonlesapEventMessage2 = this.event_;
            if (tonlesapEventMessage2 == null || tonlesapEventMessage2 == TonlesapEventMessage.getDefaultInstance()) {
                this.event_ = tonlesapEventMessage;
            } else {
                this.event_ = TonlesapEventMessage.newBuilder(this.event_).mergeFrom(tonlesapEventMessage).buildPartial();
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

        public static TonlesapStatisticsMessage parseDelimitedFrom(InputStream inputStream) {
            return (TonlesapStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TonlesapStatisticsMessage parseFrom(ByteBuffer byteBuffer) {
            return (TonlesapStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<TonlesapStatisticsMessage> parser() {
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
        public void setEvent(TonlesapEventMessage tonlesapEventMessage) {
            tonlesapEventMessage.getClass();
            this.event_ = tonlesapEventMessage;
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
                    return new TonlesapStatisticsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001ᔉ\u0000\u0002ᔌ\u0001\u0003ᔋ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"bitField0_", "base_", "silenceMode_", SilenceModeOuterClass.SilenceMode.internalGetVerifier(), "backlightLevel_", "event_", "nfc_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<TonlesapStatisticsMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (TonlesapStatisticsMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapStatisticsMessageOrBuilder
        public int getBacklightLevel() {
            return this.backlightLevel_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapStatisticsMessageOrBuilder
        public StatisBase.StatisBaseMessage getBase() {
            StatisBase.StatisBaseMessage statisBaseMessage = this.base_;
            return statisBaseMessage == null ? StatisBase.StatisBaseMessage.getDefaultInstance() : statisBaseMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapStatisticsMessageOrBuilder
        public TonlesapEventMessage getEvent() {
            TonlesapEventMessage tonlesapEventMessage = this.event_;
            return tonlesapEventMessage == null ? TonlesapEventMessage.getDefaultInstance() : tonlesapEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapStatisticsMessageOrBuilder
        public Nfc.NfcMessage getNfc() {
            Nfc.NfcMessage nfcMessage = this.nfc_;
            return nfcMessage == null ? Nfc.NfcMessage.getDefaultInstance() : nfcMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapStatisticsMessageOrBuilder
        public SilenceModeOuterClass.SilenceMode getSilenceMode() {
            SilenceModeOuterClass.SilenceMode silenceModeForNumber = SilenceModeOuterClass.SilenceMode.forNumber(this.silenceMode_);
            return silenceModeForNumber == null ? SilenceModeOuterClass.SilenceMode.OFF : silenceModeForNumber;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapStatisticsMessageOrBuilder
        public boolean hasBacklightLevel() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapStatisticsMessageOrBuilder
        public boolean hasBase() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapStatisticsMessageOrBuilder
        public boolean hasEvent() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapStatisticsMessageOrBuilder
        public boolean hasNfc() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tonlesap.TonlesapStatisticsMessageOrBuilder
        public boolean hasSilenceMode() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(TonlesapStatisticsMessage tonlesapStatisticsMessage) {
            return DEFAULT_INSTANCE.createBuilder(tonlesapStatisticsMessage);
        }

        public static TonlesapStatisticsMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (TonlesapStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static TonlesapStatisticsMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (TonlesapStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static TonlesapStatisticsMessage parseFrom(ByteString byteString) {
            return (TonlesapStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TonlesapStatisticsMessage parseFrom(ByteString byteString, t tVar) {
            return (TonlesapStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static TonlesapStatisticsMessage parseFrom(byte[] bArr) {
            return (TonlesapStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TonlesapStatisticsMessage parseFrom(byte[] bArr, t tVar) {
            return (TonlesapStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static TonlesapStatisticsMessage parseFrom(InputStream inputStream) {
            return (TonlesapStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TonlesapStatisticsMessage parseFrom(InputStream inputStream, t tVar) {
            return (TonlesapStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static TonlesapStatisticsMessage parseFrom(j jVar) {
            return (TonlesapStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static TonlesapStatisticsMessage parseFrom(j jVar, t tVar) {
            return (TonlesapStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface TonlesapStatisticsMessageOrBuilder extends bsf {
        int getBacklightLevel();

        StatisBase.StatisBaseMessage getBase();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        TonlesapEventMessage getEvent();

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

    private Tonlesap() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}
