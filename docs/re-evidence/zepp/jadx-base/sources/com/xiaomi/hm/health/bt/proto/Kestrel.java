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
public final class Kestrel {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.Kestrel$1, reason: invalid class name */
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

    public static final class KestrelEventMessage extends GeneratedMessageLite<KestrelEventMessage, Builder> implements KestrelEventMessageOrBuilder {
        public static final int ALARMPAGE_FIELD_NUMBER = 12;
        public static final int ALIPAYCODE128NUM_FIELD_NUMBER = 30;
        public static final int ALIPAYQRCODENUM_FIELD_NUMBER = 29;
        public static final int COMPASSNUM_FIELD_NUMBER = 28;
        public static final int COMPASSPAGE_FIELD_NUMBER = 16;
        public static final int COUNTDOWNNUM_FIELD_NUMBER = 27;
        private static final KestrelEventMessage DEFAULT_INSTANCE;
        public static final int DIAL2DND_FIELD_NUMBER = 3;
        public static final int DIAL2MAINITEM1_FIELD_NUMBER = 5;
        public static final int DIAL2NOTIFY_FIELD_NUMBER = 4;
        public static final int DIALID_FIELD_NUMBER = 31;
        public static final int LCDONBECAUSEOFEVENT_FIELD_NUMBER = 2;
        public static final int LCDONBECAUSEOFPRESS_FIELD_NUMBER = 1;
        public static final int PAIDETAILPAGE_FIELD_NUMBER = 33;
        public static final int PAIHELPPAGE_FIELD_NUMBER = 34;
        public static final int PAIPAGENUM_FIELD_NUMBER = 32;
        private static volatile Parser<KestrelEventMessage> PARSER = null;
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
        private int bitField1_;
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
        private int paiDetailPage_;
        private int paiHelpPage_;
        private int paiPageNum_;
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

        public static final class Builder extends GeneratedMessageLite.Builder<KestrelEventMessage, Builder> implements KestrelEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAlarmPage() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearAlarmPage();
                return this;
            }

            public Builder clearAlipayCode128Num() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearAlipayCode128Num();
                return this;
            }

            public Builder clearAlipayQRCodeNum() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearAlipayQRCodeNum();
                return this;
            }

            public Builder clearCompassNum() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearCompassNum();
                return this;
            }

            public Builder clearCompassPage() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearCompassPage();
                return this;
            }

            public Builder clearCountdownNum() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearCountdownNum();
                return this;
            }

            public Builder clearDial2DND() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearDial2DND();
                return this;
            }

            public Builder clearDial2MainItem1() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearDial2MainItem1();
                return this;
            }

            public Builder clearDial2Notify() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearDial2Notify();
                return this;
            }

            public Builder clearDialId() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearDialId();
                return this;
            }

            public Builder clearLcdOnBecauseOfEvent() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearLcdOnBecauseOfEvent();
                return this;
            }

            public Builder clearLcdOnBecauseOfPress() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearLcdOnBecauseOfPress();
                return this;
            }

            public Builder clearPaiDetailPage() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearPaiDetailPage();
                return this;
            }

            public Builder clearPaiHelpPage() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearPaiHelpPage();
                return this;
            }

            public Builder clearPaiPageNum() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearPaiPageNum();
                return this;
            }

            public Builder clearSettingBacklightPage() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearSettingBacklightPage();
                return this;
            }

            public Builder clearSettingLongpressPage() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearSettingLongpressPage();
                return this;
            }

            public Builder clearSettingPage() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearSettingPage();
                return this;
            }

            public Builder clearSettingWatchfacePage() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearSettingWatchfacePage();
                return this;
            }

            public Builder clearSkipGpsLocationNum() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearSkipGpsLocationNum();
                return this;
            }

            public Builder clearSportHistoryPage() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearSportHistoryPage();
                return this;
            }

            public Builder clearSportPage() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearSportPage();
                return this;
            }

            public Builder clearSportPage1Num() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearSportPage1Num();
                return this;
            }

            public Builder clearSportPage2Num() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearSportPage2Num();
                return this;
            }

            public Builder clearSportPage3Num() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearSportPage3Num();
                return this;
            }

            public Builder clearSportSettingPage() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearSportSettingPage();
                return this;
            }

            public Builder clearStatusPage1() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearStatusPage1();
                return this;
            }

            public Builder clearStatusPage2() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearStatusPage2();
                return this;
            }

            public Builder clearStopwatchNum() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearStopwatchNum();
                return this;
            }

            public Builder clearTimerCountdownPage() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearTimerCountdownPage();
                return this;
            }

            public Builder clearTimerPage() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearTimerPage();
                return this;
            }

            public Builder clearTimerStopwatchPage() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearTimerStopwatchPage();
                return this;
            }

            public Builder clearWaitGpsLocationNum() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearWaitGpsLocationNum();
                return this;
            }

            public Builder clearWeatherPage() {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).clearWeatherPage();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getAlarmPage() {
                return ((KestrelEventMessage) this.instance).getAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getAlipayCode128Num() {
                return ((KestrelEventMessage) this.instance).getAlipayCode128Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getAlipayQRCodeNum() {
                return ((KestrelEventMessage) this.instance).getAlipayQRCodeNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getCompassNum() {
                return ((KestrelEventMessage) this.instance).getCompassNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getCompassPage() {
                return ((KestrelEventMessage) this.instance).getCompassPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getCountdownNum() {
                return ((KestrelEventMessage) this.instance).getCountdownNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getDial2DND() {
                return ((KestrelEventMessage) this.instance).getDial2DND();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getDial2MainItem1() {
                return ((KestrelEventMessage) this.instance).getDial2MainItem1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getDial2Notify() {
                return ((KestrelEventMessage) this.instance).getDial2Notify();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getDialId() {
                return ((KestrelEventMessage) this.instance).getDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getLcdOnBecauseOfEvent() {
                return ((KestrelEventMessage) this.instance).getLcdOnBecauseOfEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getLcdOnBecauseOfPress() {
                return ((KestrelEventMessage) this.instance).getLcdOnBecauseOfPress();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getPaiDetailPage() {
                return ((KestrelEventMessage) this.instance).getPaiDetailPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getPaiHelpPage() {
                return ((KestrelEventMessage) this.instance).getPaiHelpPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getPaiPageNum() {
                return ((KestrelEventMessage) this.instance).getPaiPageNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getSettingBacklightPage() {
                return ((KestrelEventMessage) this.instance).getSettingBacklightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getSettingLongpressPage() {
                return ((KestrelEventMessage) this.instance).getSettingLongpressPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getSettingPage() {
                return ((KestrelEventMessage) this.instance).getSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getSettingWatchfacePage() {
                return ((KestrelEventMessage) this.instance).getSettingWatchfacePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getSkipGpsLocationNum() {
                return ((KestrelEventMessage) this.instance).getSkipGpsLocationNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getSportHistoryPage() {
                return ((KestrelEventMessage) this.instance).getSportHistoryPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getSportPage() {
                return ((KestrelEventMessage) this.instance).getSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getSportPage1Num() {
                return ((KestrelEventMessage) this.instance).getSportPage1Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getSportPage2Num() {
                return ((KestrelEventMessage) this.instance).getSportPage2Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getSportPage3Num() {
                return ((KestrelEventMessage) this.instance).getSportPage3Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getSportSettingPage() {
                return ((KestrelEventMessage) this.instance).getSportSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getStatusPage1() {
                return ((KestrelEventMessage) this.instance).getStatusPage1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getStatusPage2() {
                return ((KestrelEventMessage) this.instance).getStatusPage2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getStopwatchNum() {
                return ((KestrelEventMessage) this.instance).getStopwatchNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getTimerCountdownPage() {
                return ((KestrelEventMessage) this.instance).getTimerCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getTimerPage() {
                return ((KestrelEventMessage) this.instance).getTimerPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getTimerStopwatchPage() {
                return ((KestrelEventMessage) this.instance).getTimerStopwatchPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getWaitGpsLocationNum() {
                return ((KestrelEventMessage) this.instance).getWaitGpsLocationNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public int getWeatherPage() {
                return ((KestrelEventMessage) this.instance).getWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasAlarmPage() {
                return ((KestrelEventMessage) this.instance).hasAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasAlipayCode128Num() {
                return ((KestrelEventMessage) this.instance).hasAlipayCode128Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasAlipayQRCodeNum() {
                return ((KestrelEventMessage) this.instance).hasAlipayQRCodeNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasCompassNum() {
                return ((KestrelEventMessage) this.instance).hasCompassNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasCompassPage() {
                return ((KestrelEventMessage) this.instance).hasCompassPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasCountdownNum() {
                return ((KestrelEventMessage) this.instance).hasCountdownNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasDial2DND() {
                return ((KestrelEventMessage) this.instance).hasDial2DND();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasDial2MainItem1() {
                return ((KestrelEventMessage) this.instance).hasDial2MainItem1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasDial2Notify() {
                return ((KestrelEventMessage) this.instance).hasDial2Notify();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasDialId() {
                return ((KestrelEventMessage) this.instance).hasDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfEvent() {
                return ((KestrelEventMessage) this.instance).hasLcdOnBecauseOfEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfPress() {
                return ((KestrelEventMessage) this.instance).hasLcdOnBecauseOfPress();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasPaiDetailPage() {
                return ((KestrelEventMessage) this.instance).hasPaiDetailPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasPaiHelpPage() {
                return ((KestrelEventMessage) this.instance).hasPaiHelpPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasPaiPageNum() {
                return ((KestrelEventMessage) this.instance).hasPaiPageNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasSettingBacklightPage() {
                return ((KestrelEventMessage) this.instance).hasSettingBacklightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasSettingLongpressPage() {
                return ((KestrelEventMessage) this.instance).hasSettingLongpressPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasSettingPage() {
                return ((KestrelEventMessage) this.instance).hasSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasSettingWatchfacePage() {
                return ((KestrelEventMessage) this.instance).hasSettingWatchfacePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasSkipGpsLocationNum() {
                return ((KestrelEventMessage) this.instance).hasSkipGpsLocationNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasSportHistoryPage() {
                return ((KestrelEventMessage) this.instance).hasSportHistoryPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasSportPage() {
                return ((KestrelEventMessage) this.instance).hasSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasSportPage1Num() {
                return ((KestrelEventMessage) this.instance).hasSportPage1Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasSportPage2Num() {
                return ((KestrelEventMessage) this.instance).hasSportPage2Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasSportPage3Num() {
                return ((KestrelEventMessage) this.instance).hasSportPage3Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasSportSettingPage() {
                return ((KestrelEventMessage) this.instance).hasSportSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasStatusPage1() {
                return ((KestrelEventMessage) this.instance).hasStatusPage1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasStatusPage2() {
                return ((KestrelEventMessage) this.instance).hasStatusPage2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasStopwatchNum() {
                return ((KestrelEventMessage) this.instance).hasStopwatchNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasTimerCountdownPage() {
                return ((KestrelEventMessage) this.instance).hasTimerCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasTimerPage() {
                return ((KestrelEventMessage) this.instance).hasTimerPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasTimerStopwatchPage() {
                return ((KestrelEventMessage) this.instance).hasTimerStopwatchPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasWaitGpsLocationNum() {
                return ((KestrelEventMessage) this.instance).hasWaitGpsLocationNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
            public boolean hasWeatherPage() {
                return ((KestrelEventMessage) this.instance).hasWeatherPage();
            }

            public Builder setAlarmPage(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setAlarmPage(value);
                return this;
            }

            public Builder setAlipayCode128Num(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setAlipayCode128Num(value);
                return this;
            }

            public Builder setAlipayQRCodeNum(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setAlipayQRCodeNum(value);
                return this;
            }

            public Builder setCompassNum(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setCompassNum(value);
                return this;
            }

            public Builder setCompassPage(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setCompassPage(value);
                return this;
            }

            public Builder setCountdownNum(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setCountdownNum(value);
                return this;
            }

            public Builder setDial2DND(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setDial2DND(value);
                return this;
            }

            public Builder setDial2MainItem1(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setDial2MainItem1(value);
                return this;
            }

            public Builder setDial2Notify(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setDial2Notify(value);
                return this;
            }

            public Builder setDialId(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setDialId(value);
                return this;
            }

            public Builder setLcdOnBecauseOfEvent(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setLcdOnBecauseOfEvent(value);
                return this;
            }

            public Builder setLcdOnBecauseOfPress(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setLcdOnBecauseOfPress(value);
                return this;
            }

            public Builder setPaiDetailPage(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setPaiDetailPage(value);
                return this;
            }

            public Builder setPaiHelpPage(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setPaiHelpPage(value);
                return this;
            }

            public Builder setPaiPageNum(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setPaiPageNum(value);
                return this;
            }

            public Builder setSettingBacklightPage(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setSettingBacklightPage(value);
                return this;
            }

            public Builder setSettingLongpressPage(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setSettingLongpressPage(value);
                return this;
            }

            public Builder setSettingPage(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setSettingPage(value);
                return this;
            }

            public Builder setSettingWatchfacePage(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setSettingWatchfacePage(value);
                return this;
            }

            public Builder setSkipGpsLocationNum(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setSkipGpsLocationNum(value);
                return this;
            }

            public Builder setSportHistoryPage(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setSportHistoryPage(value);
                return this;
            }

            public Builder setSportPage(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setSportPage(value);
                return this;
            }

            public Builder setSportPage1Num(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setSportPage1Num(value);
                return this;
            }

            public Builder setSportPage2Num(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setSportPage2Num(value);
                return this;
            }

            public Builder setSportPage3Num(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setSportPage3Num(value);
                return this;
            }

            public Builder setSportSettingPage(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setSportSettingPage(value);
                return this;
            }

            public Builder setStatusPage1(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setStatusPage1(value);
                return this;
            }

            public Builder setStatusPage2(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setStatusPage2(value);
                return this;
            }

            public Builder setStopwatchNum(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setStopwatchNum(value);
                return this;
            }

            public Builder setTimerCountdownPage(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setTimerCountdownPage(value);
                return this;
            }

            public Builder setTimerPage(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setTimerPage(value);
                return this;
            }

            public Builder setTimerStopwatchPage(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setTimerStopwatchPage(value);
                return this;
            }

            public Builder setWaitGpsLocationNum(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setWaitGpsLocationNum(value);
                return this;
            }

            public Builder setWeatherPage(int value) {
                copyOnWrite();
                ((KestrelEventMessage) this.instance).setWeatherPage(value);
                return this;
            }

            private Builder() {
                super(KestrelEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            KestrelEventMessage kestrelEventMessage = new KestrelEventMessage();
            DEFAULT_INSTANCE = kestrelEventMessage;
            GeneratedMessageLite.registerDefaultInstance(KestrelEventMessage.class, kestrelEventMessage);
        }

        private KestrelEventMessage() {
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
        public void clearPaiDetailPage() {
            this.bitField1_ &= -2;
            this.paiDetailPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPaiHelpPage() {
            this.bitField1_ &= -3;
            this.paiHelpPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearPaiPageNum() {
            this.bitField0_ &= Integer.MAX_VALUE;
            this.paiPageNum_ = 0;
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

        public static KestrelEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static KestrelEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (KestrelEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static KestrelEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (KestrelEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<KestrelEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmPage(int value) {
            this.bitField0_ |= 2048;
            this.alarmPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCode128Num(int value) {
            this.bitField0_ |= 536870912;
            this.alipayCode128Num_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRCodeNum(int value) {
            this.bitField0_ |= 268435456;
            this.alipayQRCodeNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCompassNum(int value) {
            this.bitField0_ |= AMapEngineUtils.HALF_MAX_P20_WIDTH;
            this.compassNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCompassPage(int value) {
            this.bitField0_ |= 32768;
            this.compassPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountdownNum(int value) {
            this.bitField0_ |= 67108864;
            this.countdownNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDial2DND(int value) {
            this.bitField0_ |= 4;
            this.dial2DND_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDial2MainItem1(int value) {
            this.bitField0_ |= 16;
            this.dial2MainItem1_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDial2Notify(int value) {
            this.bitField0_ |= 8;
            this.dial2Notify_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialId(int value) {
            this.bitField0_ |= 1073741824;
            this.dialId_ = value;
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
        public void setPaiDetailPage(int value) {
            this.bitField1_ |= 1;
            this.paiDetailPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaiHelpPage(int value) {
            this.bitField1_ |= 2;
            this.paiHelpPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setPaiPageNum(int value) {
            this.bitField0_ |= Integer.MIN_VALUE;
            this.paiPageNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingBacklightPage(int value) {
            this.bitField0_ |= 524288;
            this.settingBacklightPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingLongpressPage(int value) {
            this.bitField0_ |= 262144;
            this.settingLongpressPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingPage(int value) {
            this.bitField0_ |= 65536;
            this.settingPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingWatchfacePage(int value) {
            this.bitField0_ |= 131072;
            this.settingWatchfacePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkipGpsLocationNum(int value) {
            this.bitField0_ |= 2097152;
            this.skipGpsLocationNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportHistoryPage(int value) {
            this.bitField0_ |= 256;
            this.sportHistoryPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportPage(int value) {
            this.bitField0_ |= 128;
            this.sportPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportPage1Num(int value) {
            this.bitField0_ |= 4194304;
            this.sportPage1Num_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportPage2Num(int value) {
            this.bitField0_ |= 8388608;
            this.sportPage2Num_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportPage3Num(int value) {
            this.bitField0_ |= 16777216;
            this.sportPage3Num_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportSettingPage(int value) {
            this.bitField0_ |= 512;
            this.sportSettingPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusPage1(int value) {
            this.bitField0_ |= 32;
            this.statusPage1_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusPage2(int value) {
            this.bitField0_ |= 64;
            this.statusPage2_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopwatchNum(int value) {
            this.bitField0_ |= 33554432;
            this.stopwatchNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimerCountdownPage(int value) {
            this.bitField0_ |= 16384;
            this.timerCountdownPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimerPage(int value) {
            this.bitField0_ |= 4096;
            this.timerPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimerStopwatchPage(int value) {
            this.bitField0_ |= 8192;
            this.timerStopwatchPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWaitGpsLocationNum(int value) {
            this.bitField0_ |= 1048576;
            this.waitGpsLocationNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeatherPage(int value) {
            this.bitField0_ |= 1024;
            this.weatherPage_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new KestrelEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\"\u0000\u0002\u0001\"\"\u0000\u0000\u001c\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f\u0011ᔋ\u0010\u0012ᔋ\u0011\u0013ᔋ\u0012\u0014ᔋ\u0013\u0015ᔋ\u0014\u0016ᔋ\u0015\u0017ᔋ\u0016\u0018ᔋ\u0017\u0019ᔋ\u0018\u001aᔋ\u0019\u001bᔋ\u001a\u001cᔋ\u001b\u001dဋ\u001c\u001eဋ\u001d\u001fဋ\u001e ဋ\u001f!ဋ \"ဋ!", new Object[]{"bitField0_", "bitField1_", "lcdOnBecauseOfPress_", "lcdOnBecauseOfEvent_", "dial2DND_", "dial2Notify_", "dial2MainItem1_", "statusPage1_", "statusPage2_", "sportPage_", "sportHistoryPage_", "sportSettingPage_", "weatherPage_", "alarmPage_", "timerPage_", "timerStopwatchPage_", "timerCountdownPage_", "compassPage_", "settingPage_", "settingWatchfacePage_", "settingLongpressPage_", "settingBacklightPage_", "waitGpsLocationNum_", "skipGpsLocationNum_", "sportPage1Num_", "sportPage2Num_", "sportPage3Num_", "stopwatchNum_", "countdownNum_", "compassNum_", "alipayQRCodeNum_", "alipayCode128Num_", "dialId_", "paiPageNum_", "paiDetailPage_", "paiHelpPage_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<KestrelEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (KestrelEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getAlarmPage() {
            return this.alarmPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getAlipayCode128Num() {
            return this.alipayCode128Num_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getAlipayQRCodeNum() {
            return this.alipayQRCodeNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getCompassNum() {
            return this.compassNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getCompassPage() {
            return this.compassPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getCountdownNum() {
            return this.countdownNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getDial2DND() {
            return this.dial2DND_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getDial2MainItem1() {
            return this.dial2MainItem1_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getDial2Notify() {
            return this.dial2Notify_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getDialId() {
            return this.dialId_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getLcdOnBecauseOfEvent() {
            return this.lcdOnBecauseOfEvent_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getLcdOnBecauseOfPress() {
            return this.lcdOnBecauseOfPress_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getPaiDetailPage() {
            return this.paiDetailPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getPaiHelpPage() {
            return this.paiHelpPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getPaiPageNum() {
            return this.paiPageNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getSettingBacklightPage() {
            return this.settingBacklightPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getSettingLongpressPage() {
            return this.settingLongpressPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getSettingPage() {
            return this.settingPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getSettingWatchfacePage() {
            return this.settingWatchfacePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getSkipGpsLocationNum() {
            return this.skipGpsLocationNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getSportHistoryPage() {
            return this.sportHistoryPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getSportPage() {
            return this.sportPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getSportPage1Num() {
            return this.sportPage1Num_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getSportPage2Num() {
            return this.sportPage2Num_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getSportPage3Num() {
            return this.sportPage3Num_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getSportSettingPage() {
            return this.sportSettingPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getStatusPage1() {
            return this.statusPage1_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getStatusPage2() {
            return this.statusPage2_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getStopwatchNum() {
            return this.stopwatchNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getTimerCountdownPage() {
            return this.timerCountdownPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getTimerPage() {
            return this.timerPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getTimerStopwatchPage() {
            return this.timerStopwatchPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getWaitGpsLocationNum() {
            return this.waitGpsLocationNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public int getWeatherPage() {
            return this.weatherPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasAlarmPage() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasAlipayCode128Num() {
            return (this.bitField0_ & 536870912) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasAlipayQRCodeNum() {
            return (this.bitField0_ & 268435456) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasCompassNum() {
            return (this.bitField0_ & AMapEngineUtils.HALF_MAX_P20_WIDTH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasCompassPage() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasCountdownNum() {
            return (this.bitField0_ & 67108864) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasDial2DND() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasDial2MainItem1() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasDial2Notify() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasDialId() {
            return (this.bitField0_ & 1073741824) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfEvent() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfPress() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasPaiDetailPage() {
            return (this.bitField1_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasPaiHelpPage() {
            return (this.bitField1_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasPaiPageNum() {
            return (this.bitField0_ & Integer.MIN_VALUE) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasSettingBacklightPage() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasSettingLongpressPage() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasSettingPage() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasSettingWatchfacePage() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasSkipGpsLocationNum() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasSportHistoryPage() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasSportPage() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasSportPage1Num() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasSportPage2Num() {
            return (this.bitField0_ & 8388608) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasSportPage3Num() {
            return (this.bitField0_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasSportSettingPage() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasStatusPage1() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasStatusPage2() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasStopwatchNum() {
            return (this.bitField0_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasTimerCountdownPage() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasTimerPage() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasTimerStopwatchPage() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasWaitGpsLocationNum() {
            return (this.bitField0_ & 1048576) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelEventMessageOrBuilder
        public boolean hasWeatherPage() {
            return (this.bitField0_ & 1024) != 0;
        }

        public static Builder newBuilder(KestrelEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static KestrelEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (KestrelEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static KestrelEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (KestrelEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static KestrelEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (KestrelEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static KestrelEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (KestrelEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static KestrelEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (KestrelEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static KestrelEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (KestrelEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static KestrelEventMessage parseFrom(InputStream input) throws IOException {
            return (KestrelEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static KestrelEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (KestrelEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static KestrelEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (KestrelEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static KestrelEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (KestrelEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface KestrelEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getAlarmPage();

        int getAlipayCode128Num();

        int getAlipayQRCodeNum();

        int getCompassNum();

        int getCompassPage();

        int getCountdownNum();

        int getDial2DND();

        int getDial2MainItem1();

        int getDial2Notify();

        int getDialId();

        int getLcdOnBecauseOfEvent();

        int getLcdOnBecauseOfPress();

        int getPaiDetailPage();

        int getPaiHelpPage();

        int getPaiPageNum();

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

        boolean hasPaiDetailPage();

        boolean hasPaiHelpPage();

        boolean hasPaiPageNum();

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
    }

    public static final class KestrelStatisticsMessage extends GeneratedMessageLite<KestrelStatisticsMessage, Builder> implements KestrelStatisticsMessageOrBuilder {
        public static final int BACKLIGHTLEVEL_FIELD_NUMBER = 3;
        public static final int BASE_FIELD_NUMBER = 1;
        private static final KestrelStatisticsMessage DEFAULT_INSTANCE;
        public static final int EVENT_FIELD_NUMBER = 4;
        public static final int NFC_FIELD_NUMBER = 5;
        private static volatile Parser<KestrelStatisticsMessage> PARSER = null;
        public static final int SILENCEMODE_FIELD_NUMBER = 2;
        public static final int STANDBYDIALMODE_FIELD_NUMBER = 6;
        public static final int STANDBYDIALPATTERN_FIELD_NUMBER = 7;
        private int backlightLevel_;
        private StatisBase.StatisBaseMessage base_;
        private int bitField0_;
        private KestrelEventMessage event_;
        private byte memoizedIsInitialized = 2;
        private Nfc.NfcMessage nfc_;
        private int silenceMode_;
        private int standbydialMode_;
        private int standbydialPattern_;

        public static final class Builder extends GeneratedMessageLite.Builder<KestrelStatisticsMessage, Builder> implements KestrelStatisticsMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBacklightLevel() {
                copyOnWrite();
                ((KestrelStatisticsMessage) this.instance).clearBacklightLevel();
                return this;
            }

            public Builder clearBase() {
                copyOnWrite();
                ((KestrelStatisticsMessage) this.instance).clearBase();
                return this;
            }

            public Builder clearEvent() {
                copyOnWrite();
                ((KestrelStatisticsMessage) this.instance).clearEvent();
                return this;
            }

            public Builder clearNfc() {
                copyOnWrite();
                ((KestrelStatisticsMessage) this.instance).clearNfc();
                return this;
            }

            public Builder clearSilenceMode() {
                copyOnWrite();
                ((KestrelStatisticsMessage) this.instance).clearSilenceMode();
                return this;
            }

            public Builder clearStandbydialMode() {
                copyOnWrite();
                ((KestrelStatisticsMessage) this.instance).clearStandbydialMode();
                return this;
            }

            public Builder clearStandbydialPattern() {
                copyOnWrite();
                ((KestrelStatisticsMessage) this.instance).clearStandbydialPattern();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelStatisticsMessageOrBuilder
            public int getBacklightLevel() {
                return ((KestrelStatisticsMessage) this.instance).getBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelStatisticsMessageOrBuilder
            public StatisBase.StatisBaseMessage getBase() {
                return ((KestrelStatisticsMessage) this.instance).getBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelStatisticsMessageOrBuilder
            public KestrelEventMessage getEvent() {
                return ((KestrelStatisticsMessage) this.instance).getEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelStatisticsMessageOrBuilder
            public Nfc.NfcMessage getNfc() {
                return ((KestrelStatisticsMessage) this.instance).getNfc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelStatisticsMessageOrBuilder
            public SilenceModeOuterClass.SilenceMode getSilenceMode() {
                return ((KestrelStatisticsMessage) this.instance).getSilenceMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelStatisticsMessageOrBuilder
            public Standbydial.StandbydialMode getStandbydialMode() {
                return ((KestrelStatisticsMessage) this.instance).getStandbydialMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelStatisticsMessageOrBuilder
            public Standbydial.StandbydialPattern getStandbydialPattern() {
                return ((KestrelStatisticsMessage) this.instance).getStandbydialPattern();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelStatisticsMessageOrBuilder
            public boolean hasBacklightLevel() {
                return ((KestrelStatisticsMessage) this.instance).hasBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelStatisticsMessageOrBuilder
            public boolean hasBase() {
                return ((KestrelStatisticsMessage) this.instance).hasBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelStatisticsMessageOrBuilder
            public boolean hasEvent() {
                return ((KestrelStatisticsMessage) this.instance).hasEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelStatisticsMessageOrBuilder
            public boolean hasNfc() {
                return ((KestrelStatisticsMessage) this.instance).hasNfc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelStatisticsMessageOrBuilder
            public boolean hasSilenceMode() {
                return ((KestrelStatisticsMessage) this.instance).hasSilenceMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelStatisticsMessageOrBuilder
            public boolean hasStandbydialMode() {
                return ((KestrelStatisticsMessage) this.instance).hasStandbydialMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelStatisticsMessageOrBuilder
            public boolean hasStandbydialPattern() {
                return ((KestrelStatisticsMessage) this.instance).hasStandbydialPattern();
            }

            public Builder mergeBase(StatisBase.StatisBaseMessage value) {
                copyOnWrite();
                ((KestrelStatisticsMessage) this.instance).mergeBase(value);
                return this;
            }

            public Builder mergeEvent(KestrelEventMessage value) {
                copyOnWrite();
                ((KestrelStatisticsMessage) this.instance).mergeEvent(value);
                return this;
            }

            public Builder mergeNfc(Nfc.NfcMessage value) {
                copyOnWrite();
                ((KestrelStatisticsMessage) this.instance).mergeNfc(value);
                return this;
            }

            public Builder setBacklightLevel(int value) {
                copyOnWrite();
                ((KestrelStatisticsMessage) this.instance).setBacklightLevel(value);
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage value) {
                copyOnWrite();
                ((KestrelStatisticsMessage) this.instance).setBase(value);
                return this;
            }

            public Builder setEvent(KestrelEventMessage value) {
                copyOnWrite();
                ((KestrelStatisticsMessage) this.instance).setEvent(value);
                return this;
            }

            public Builder setNfc(Nfc.NfcMessage value) {
                copyOnWrite();
                ((KestrelStatisticsMessage) this.instance).setNfc(value);
                return this;
            }

            public Builder setSilenceMode(SilenceModeOuterClass.SilenceMode value) {
                copyOnWrite();
                ((KestrelStatisticsMessage) this.instance).setSilenceMode(value);
                return this;
            }

            public Builder setStandbydialMode(Standbydial.StandbydialMode value) {
                copyOnWrite();
                ((KestrelStatisticsMessage) this.instance).setStandbydialMode(value);
                return this;
            }

            public Builder setStandbydialPattern(Standbydial.StandbydialPattern value) {
                copyOnWrite();
                ((KestrelStatisticsMessage) this.instance).setStandbydialPattern(value);
                return this;
            }

            private Builder() {
                super(KestrelStatisticsMessage.DEFAULT_INSTANCE);
            }

            public Builder setBase(StatisBase.StatisBaseMessage.Builder builderForValue) {
                copyOnWrite();
                ((KestrelStatisticsMessage) this.instance).setBase(builderForValue.build());
                return this;
            }

            public Builder setEvent(KestrelEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((KestrelStatisticsMessage) this.instance).setEvent(builderForValue.build());
                return this;
            }

            public Builder setNfc(Nfc.NfcMessage.Builder builderForValue) {
                copyOnWrite();
                ((KestrelStatisticsMessage) this.instance).setNfc(builderForValue.build());
                return this;
            }
        }

        static {
            KestrelStatisticsMessage kestrelStatisticsMessage = new KestrelStatisticsMessage();
            DEFAULT_INSTANCE = kestrelStatisticsMessage;
            GeneratedMessageLite.registerDefaultInstance(KestrelStatisticsMessage.class, kestrelStatisticsMessage);
        }

        private KestrelStatisticsMessage() {
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

        public static KestrelStatisticsMessage getDefaultInstance() {
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
        public void mergeEvent(KestrelEventMessage value) {
            value.getClass();
            KestrelEventMessage kestrelEventMessage = this.event_;
            if (kestrelEventMessage == null || kestrelEventMessage == KestrelEventMessage.getDefaultInstance()) {
                this.event_ = value;
            } else {
                this.event_ = KestrelEventMessage.newBuilder(this.event_).mergeFrom(value).buildPartial();
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

        public static KestrelStatisticsMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (KestrelStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static KestrelStatisticsMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (KestrelStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<KestrelStatisticsMessage> parser() {
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
        public void setEvent(KestrelEventMessage value) {
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
                    return new KestrelStatisticsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0005\u0001ᔉ\u0000\u0002ᔌ\u0001\u0003ᔋ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004\u0006ဌ\u0005\u0007ဌ\u0006", new Object[]{"bitField0_", "base_", "silenceMode_", SilenceModeOuterClass.SilenceMode.internalGetVerifier(), "backlightLevel_", "event_", "nfc_", "standbydialMode_", Standbydial.StandbydialMode.internalGetVerifier(), "standbydialPattern_", Standbydial.StandbydialPattern.internalGetVerifier()});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<KestrelStatisticsMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (KestrelStatisticsMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelStatisticsMessageOrBuilder
        public int getBacklightLevel() {
            return this.backlightLevel_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelStatisticsMessageOrBuilder
        public StatisBase.StatisBaseMessage getBase() {
            StatisBase.StatisBaseMessage statisBaseMessage = this.base_;
            return statisBaseMessage == null ? StatisBase.StatisBaseMessage.getDefaultInstance() : statisBaseMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelStatisticsMessageOrBuilder
        public KestrelEventMessage getEvent() {
            KestrelEventMessage kestrelEventMessage = this.event_;
            return kestrelEventMessage == null ? KestrelEventMessage.getDefaultInstance() : kestrelEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelStatisticsMessageOrBuilder
        public Nfc.NfcMessage getNfc() {
            Nfc.NfcMessage nfcMessage = this.nfc_;
            return nfcMessage == null ? Nfc.NfcMessage.getDefaultInstance() : nfcMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelStatisticsMessageOrBuilder
        public SilenceModeOuterClass.SilenceMode getSilenceMode() {
            SilenceModeOuterClass.SilenceMode silenceModeForNumber = SilenceModeOuterClass.SilenceMode.forNumber(this.silenceMode_);
            return silenceModeForNumber == null ? SilenceModeOuterClass.SilenceMode.OFF : silenceModeForNumber;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelStatisticsMessageOrBuilder
        public Standbydial.StandbydialMode getStandbydialMode() {
            Standbydial.StandbydialMode standbydialModeForNumber = Standbydial.StandbydialMode.forNumber(this.standbydialMode_);
            return standbydialModeForNumber == null ? Standbydial.StandbydialMode.ONOFF : standbydialModeForNumber;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelStatisticsMessageOrBuilder
        public Standbydial.StandbydialPattern getStandbydialPattern() {
            Standbydial.StandbydialPattern standbydialPatternForNumber = Standbydial.StandbydialPattern.forNumber(this.standbydialPattern_);
            return standbydialPatternForNumber == null ? Standbydial.StandbydialPattern.NONE : standbydialPatternForNumber;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelStatisticsMessageOrBuilder
        public boolean hasBacklightLevel() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelStatisticsMessageOrBuilder
        public boolean hasBase() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelStatisticsMessageOrBuilder
        public boolean hasEvent() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelStatisticsMessageOrBuilder
        public boolean hasNfc() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelStatisticsMessageOrBuilder
        public boolean hasSilenceMode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelStatisticsMessageOrBuilder
        public boolean hasStandbydialMode() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Kestrel.KestrelStatisticsMessageOrBuilder
        public boolean hasStandbydialPattern() {
            return (this.bitField0_ & 64) != 0;
        }

        public static Builder newBuilder(KestrelStatisticsMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static KestrelStatisticsMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (KestrelStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static KestrelStatisticsMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (KestrelStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static KestrelStatisticsMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (KestrelStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static KestrelStatisticsMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (KestrelStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static KestrelStatisticsMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (KestrelStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static KestrelStatisticsMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (KestrelStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static KestrelStatisticsMessage parseFrom(InputStream input) throws IOException {
            return (KestrelStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static KestrelStatisticsMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (KestrelStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static KestrelStatisticsMessage parseFrom(CodedInputStream input) throws IOException {
            return (KestrelStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static KestrelStatisticsMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (KestrelStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface KestrelStatisticsMessageOrBuilder extends MessageLiteOrBuilder {
        int getBacklightLevel();

        StatisBase.StatisBaseMessage getBase();

        KestrelEventMessage getEvent();

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

    private Kestrel() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }
}
