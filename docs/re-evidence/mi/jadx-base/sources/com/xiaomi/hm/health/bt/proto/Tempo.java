package com.xiaomi.hm.health.bt.proto;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.j;
import com.google.protobuf.q0;
import com.google.protobuf.t;
import com.xiaomi.fitness.sync.model.EventRecurrence;
import defpackage.bsf;
import defpackage.vkh;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes11.dex */
public final class Tempo {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.Tempo$1, reason: invalid class name */
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

    public static final class TempoEventMessage extends GeneratedMessageLite<TempoEventMessage, Builder> implements TempoEventMessageOrBuilder {
        public static final int ALARMPAGE_FIELD_NUMBER = 8;
        public static final int ALIPAYCODE128NUM_FIELD_NUMBER = 22;
        public static final int ALIPAYQRCODENUM_FIELD_NUMBER = 21;
        public static final int COUNTDOWNNUM_FIELD_NUMBER = 17;
        private static final TempoEventMessage DEFAULT_INSTANCE;
        public static final int DIAL2DND_FIELD_NUMBER = 1;
        public static final int DIAL2MAINITEM1_FIELD_NUMBER = 3;
        public static final int DIAL2NOTIFY_FIELD_NUMBER = 2;
        public static final int DIALID_FIELD_NUMBER = 23;
        public static final int MIRRORSCREENHEARTRATEPAGE_FIELD_NUMBER = 19;
        public static final int MIRRORSCREENMAINPAGE_FIELD_NUMBER = 18;
        public static final int MIRRORSCREENTIMEPAGE_FIELD_NUMBER = 20;
        public static final int NOTIFYPAGE_FIELD_NUMBER = 6;
        private static volatile vkh<TempoEventMessage> PARSER = null;
        public static final int SETTINGBACKLIGHTPAGE_FIELD_NUMBER = 15;
        public static final int SETTINGPAGE_FIELD_NUMBER = 12;
        public static final int SETTINGSCREENLOCKPAGE_FIELD_NUMBER = 14;
        public static final int SETTINGWATCHFACEPAGE_FIELD_NUMBER = 13;
        public static final int STATUSPAGE1_FIELD_NUMBER = 4;
        public static final int STATUSPAGE2_FIELD_NUMBER = 5;
        public static final int STOPWATCHNUM_FIELD_NUMBER = 16;
        public static final int TIMERCOUNTDOWNPAGE_FIELD_NUMBER = 11;
        public static final int TIMERPAGE_FIELD_NUMBER = 9;
        public static final int TIMERSTOPWATCHPAGE_FIELD_NUMBER = 10;
        public static final int WEATHERPAGE_FIELD_NUMBER = 7;
        private int alarmPage_;
        private int alipayCode128Num_;
        private int alipayQRCodeNum_;
        private int bitField0_;
        private int countdownNum_;
        private int dial2DND_;
        private int dial2MainItem1_;
        private int dial2Notify_;
        private int dialId_;
        private byte memoizedIsInitialized = 2;
        private int mirrorScreenHeartratePage_;
        private int mirrorScreenMainPage_;
        private int mirrorScreenTimePage_;
        private int notifyPage_;
        private int settingBacklightPage_;
        private int settingPage_;
        private int settingScreenLockPage_;
        private int settingWatchfacePage_;
        private int statusPage1_;
        private int statusPage2_;
        private int stopwatchNum_;
        private int timerCountdownPage_;
        private int timerPage_;
        private int timerStopwatchPage_;
        private int weatherPage_;

        public static final class Builder extends GeneratedMessageLite.a<TempoEventMessage, Builder> implements TempoEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAlarmPage() {
                copyOnWrite();
                ((TempoEventMessage) this.instance).clearAlarmPage();
                return this;
            }

            public Builder clearAlipayCode128Num() {
                copyOnWrite();
                ((TempoEventMessage) this.instance).clearAlipayCode128Num();
                return this;
            }

            public Builder clearAlipayQRCodeNum() {
                copyOnWrite();
                ((TempoEventMessage) this.instance).clearAlipayQRCodeNum();
                return this;
            }

            public Builder clearCountdownNum() {
                copyOnWrite();
                ((TempoEventMessage) this.instance).clearCountdownNum();
                return this;
            }

            public Builder clearDial2DND() {
                copyOnWrite();
                ((TempoEventMessage) this.instance).clearDial2DND();
                return this;
            }

            public Builder clearDial2MainItem1() {
                copyOnWrite();
                ((TempoEventMessage) this.instance).clearDial2MainItem1();
                return this;
            }

            public Builder clearDial2Notify() {
                copyOnWrite();
                ((TempoEventMessage) this.instance).clearDial2Notify();
                return this;
            }

            public Builder clearDialId() {
                copyOnWrite();
                ((TempoEventMessage) this.instance).clearDialId();
                return this;
            }

            public Builder clearMirrorScreenHeartratePage() {
                copyOnWrite();
                ((TempoEventMessage) this.instance).clearMirrorScreenHeartratePage();
                return this;
            }

            public Builder clearMirrorScreenMainPage() {
                copyOnWrite();
                ((TempoEventMessage) this.instance).clearMirrorScreenMainPage();
                return this;
            }

            public Builder clearMirrorScreenTimePage() {
                copyOnWrite();
                ((TempoEventMessage) this.instance).clearMirrorScreenTimePage();
                return this;
            }

            public Builder clearNotifyPage() {
                copyOnWrite();
                ((TempoEventMessage) this.instance).clearNotifyPage();
                return this;
            }

            public Builder clearSettingBacklightPage() {
                copyOnWrite();
                ((TempoEventMessage) this.instance).clearSettingBacklightPage();
                return this;
            }

            public Builder clearSettingPage() {
                copyOnWrite();
                ((TempoEventMessage) this.instance).clearSettingPage();
                return this;
            }

            public Builder clearSettingScreenLockPage() {
                copyOnWrite();
                ((TempoEventMessage) this.instance).clearSettingScreenLockPage();
                return this;
            }

            public Builder clearSettingWatchfacePage() {
                copyOnWrite();
                ((TempoEventMessage) this.instance).clearSettingWatchfacePage();
                return this;
            }

            public Builder clearStatusPage1() {
                copyOnWrite();
                ((TempoEventMessage) this.instance).clearStatusPage1();
                return this;
            }

            public Builder clearStatusPage2() {
                copyOnWrite();
                ((TempoEventMessage) this.instance).clearStatusPage2();
                return this;
            }

            public Builder clearStopwatchNum() {
                copyOnWrite();
                ((TempoEventMessage) this.instance).clearStopwatchNum();
                return this;
            }

            public Builder clearTimerCountdownPage() {
                copyOnWrite();
                ((TempoEventMessage) this.instance).clearTimerCountdownPage();
                return this;
            }

            public Builder clearTimerPage() {
                copyOnWrite();
                ((TempoEventMessage) this.instance).clearTimerPage();
                return this;
            }

            public Builder clearTimerStopwatchPage() {
                copyOnWrite();
                ((TempoEventMessage) this.instance).clearTimerStopwatchPage();
                return this;
            }

            public Builder clearWeatherPage() {
                copyOnWrite();
                ((TempoEventMessage) this.instance).clearWeatherPage();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public int getAlarmPage() {
                return ((TempoEventMessage) this.instance).getAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public int getAlipayCode128Num() {
                return ((TempoEventMessage) this.instance).getAlipayCode128Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public int getAlipayQRCodeNum() {
                return ((TempoEventMessage) this.instance).getAlipayQRCodeNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public int getCountdownNum() {
                return ((TempoEventMessage) this.instance).getCountdownNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public int getDial2DND() {
                return ((TempoEventMessage) this.instance).getDial2DND();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public int getDial2MainItem1() {
                return ((TempoEventMessage) this.instance).getDial2MainItem1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public int getDial2Notify() {
                return ((TempoEventMessage) this.instance).getDial2Notify();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public int getDialId() {
                return ((TempoEventMessage) this.instance).getDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public int getMirrorScreenHeartratePage() {
                return ((TempoEventMessage) this.instance).getMirrorScreenHeartratePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public int getMirrorScreenMainPage() {
                return ((TempoEventMessage) this.instance).getMirrorScreenMainPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public int getMirrorScreenTimePage() {
                return ((TempoEventMessage) this.instance).getMirrorScreenTimePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public int getNotifyPage() {
                return ((TempoEventMessage) this.instance).getNotifyPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public int getSettingBacklightPage() {
                return ((TempoEventMessage) this.instance).getSettingBacklightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public int getSettingPage() {
                return ((TempoEventMessage) this.instance).getSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public int getSettingScreenLockPage() {
                return ((TempoEventMessage) this.instance).getSettingScreenLockPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public int getSettingWatchfacePage() {
                return ((TempoEventMessage) this.instance).getSettingWatchfacePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public int getStatusPage1() {
                return ((TempoEventMessage) this.instance).getStatusPage1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public int getStatusPage2() {
                return ((TempoEventMessage) this.instance).getStatusPage2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public int getStopwatchNum() {
                return ((TempoEventMessage) this.instance).getStopwatchNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public int getTimerCountdownPage() {
                return ((TempoEventMessage) this.instance).getTimerCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public int getTimerPage() {
                return ((TempoEventMessage) this.instance).getTimerPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public int getTimerStopwatchPage() {
                return ((TempoEventMessage) this.instance).getTimerStopwatchPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public int getWeatherPage() {
                return ((TempoEventMessage) this.instance).getWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public boolean hasAlarmPage() {
                return ((TempoEventMessage) this.instance).hasAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public boolean hasAlipayCode128Num() {
                return ((TempoEventMessage) this.instance).hasAlipayCode128Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public boolean hasAlipayQRCodeNum() {
                return ((TempoEventMessage) this.instance).hasAlipayQRCodeNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public boolean hasCountdownNum() {
                return ((TempoEventMessage) this.instance).hasCountdownNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public boolean hasDial2DND() {
                return ((TempoEventMessage) this.instance).hasDial2DND();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public boolean hasDial2MainItem1() {
                return ((TempoEventMessage) this.instance).hasDial2MainItem1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public boolean hasDial2Notify() {
                return ((TempoEventMessage) this.instance).hasDial2Notify();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public boolean hasDialId() {
                return ((TempoEventMessage) this.instance).hasDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public boolean hasMirrorScreenHeartratePage() {
                return ((TempoEventMessage) this.instance).hasMirrorScreenHeartratePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public boolean hasMirrorScreenMainPage() {
                return ((TempoEventMessage) this.instance).hasMirrorScreenMainPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public boolean hasMirrorScreenTimePage() {
                return ((TempoEventMessage) this.instance).hasMirrorScreenTimePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public boolean hasNotifyPage() {
                return ((TempoEventMessage) this.instance).hasNotifyPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public boolean hasSettingBacklightPage() {
                return ((TempoEventMessage) this.instance).hasSettingBacklightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public boolean hasSettingPage() {
                return ((TempoEventMessage) this.instance).hasSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public boolean hasSettingScreenLockPage() {
                return ((TempoEventMessage) this.instance).hasSettingScreenLockPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public boolean hasSettingWatchfacePage() {
                return ((TempoEventMessage) this.instance).hasSettingWatchfacePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public boolean hasStatusPage1() {
                return ((TempoEventMessage) this.instance).hasStatusPage1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public boolean hasStatusPage2() {
                return ((TempoEventMessage) this.instance).hasStatusPage2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public boolean hasStopwatchNum() {
                return ((TempoEventMessage) this.instance).hasStopwatchNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public boolean hasTimerCountdownPage() {
                return ((TempoEventMessage) this.instance).hasTimerCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public boolean hasTimerPage() {
                return ((TempoEventMessage) this.instance).hasTimerPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public boolean hasTimerStopwatchPage() {
                return ((TempoEventMessage) this.instance).hasTimerStopwatchPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
            public boolean hasWeatherPage() {
                return ((TempoEventMessage) this.instance).hasWeatherPage();
            }

            public Builder setAlarmPage(int i) {
                copyOnWrite();
                ((TempoEventMessage) this.instance).setAlarmPage(i);
                return this;
            }

            public Builder setAlipayCode128Num(int i) {
                copyOnWrite();
                ((TempoEventMessage) this.instance).setAlipayCode128Num(i);
                return this;
            }

            public Builder setAlipayQRCodeNum(int i) {
                copyOnWrite();
                ((TempoEventMessage) this.instance).setAlipayQRCodeNum(i);
                return this;
            }

            public Builder setCountdownNum(int i) {
                copyOnWrite();
                ((TempoEventMessage) this.instance).setCountdownNum(i);
                return this;
            }

            public Builder setDial2DND(int i) {
                copyOnWrite();
                ((TempoEventMessage) this.instance).setDial2DND(i);
                return this;
            }

            public Builder setDial2MainItem1(int i) {
                copyOnWrite();
                ((TempoEventMessage) this.instance).setDial2MainItem1(i);
                return this;
            }

            public Builder setDial2Notify(int i) {
                copyOnWrite();
                ((TempoEventMessage) this.instance).setDial2Notify(i);
                return this;
            }

            public Builder setDialId(int i) {
                copyOnWrite();
                ((TempoEventMessage) this.instance).setDialId(i);
                return this;
            }

            public Builder setMirrorScreenHeartratePage(int i) {
                copyOnWrite();
                ((TempoEventMessage) this.instance).setMirrorScreenHeartratePage(i);
                return this;
            }

            public Builder setMirrorScreenMainPage(int i) {
                copyOnWrite();
                ((TempoEventMessage) this.instance).setMirrorScreenMainPage(i);
                return this;
            }

            public Builder setMirrorScreenTimePage(int i) {
                copyOnWrite();
                ((TempoEventMessage) this.instance).setMirrorScreenTimePage(i);
                return this;
            }

            public Builder setNotifyPage(int i) {
                copyOnWrite();
                ((TempoEventMessage) this.instance).setNotifyPage(i);
                return this;
            }

            public Builder setSettingBacklightPage(int i) {
                copyOnWrite();
                ((TempoEventMessage) this.instance).setSettingBacklightPage(i);
                return this;
            }

            public Builder setSettingPage(int i) {
                copyOnWrite();
                ((TempoEventMessage) this.instance).setSettingPage(i);
                return this;
            }

            public Builder setSettingScreenLockPage(int i) {
                copyOnWrite();
                ((TempoEventMessage) this.instance).setSettingScreenLockPage(i);
                return this;
            }

            public Builder setSettingWatchfacePage(int i) {
                copyOnWrite();
                ((TempoEventMessage) this.instance).setSettingWatchfacePage(i);
                return this;
            }

            public Builder setStatusPage1(int i) {
                copyOnWrite();
                ((TempoEventMessage) this.instance).setStatusPage1(i);
                return this;
            }

            public Builder setStatusPage2(int i) {
                copyOnWrite();
                ((TempoEventMessage) this.instance).setStatusPage2(i);
                return this;
            }

            public Builder setStopwatchNum(int i) {
                copyOnWrite();
                ((TempoEventMessage) this.instance).setStopwatchNum(i);
                return this;
            }

            public Builder setTimerCountdownPage(int i) {
                copyOnWrite();
                ((TempoEventMessage) this.instance).setTimerCountdownPage(i);
                return this;
            }

            public Builder setTimerPage(int i) {
                copyOnWrite();
                ((TempoEventMessage) this.instance).setTimerPage(i);
                return this;
            }

            public Builder setTimerStopwatchPage(int i) {
                copyOnWrite();
                ((TempoEventMessage) this.instance).setTimerStopwatchPage(i);
                return this;
            }

            public Builder setWeatherPage(int i) {
                copyOnWrite();
                ((TempoEventMessage) this.instance).setWeatherPage(i);
                return this;
            }

            private Builder() {
                super(TempoEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            TempoEventMessage tempoEventMessage = new TempoEventMessage();
            DEFAULT_INSTANCE = tempoEventMessage;
            GeneratedMessageLite.registerDefaultInstance(TempoEventMessage.class, tempoEventMessage);
        }

        private TempoEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmPage() {
            this.bitField0_ &= -129;
            this.alarmPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCode128Num() {
            this.bitField0_ &= -2097153;
            this.alipayCode128Num_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRCodeNum() {
            this.bitField0_ &= -1048577;
            this.alipayQRCodeNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountdownNum() {
            this.bitField0_ &= -65537;
            this.countdownNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDial2DND() {
            this.bitField0_ &= -2;
            this.dial2DND_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDial2MainItem1() {
            this.bitField0_ &= -5;
            this.dial2MainItem1_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDial2Notify() {
            this.bitField0_ &= -3;
            this.dial2Notify_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialId() {
            this.bitField0_ &= -4194305;
            this.dialId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMirrorScreenHeartratePage() {
            this.bitField0_ &= -262145;
            this.mirrorScreenHeartratePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMirrorScreenMainPage() {
            this.bitField0_ &= -131073;
            this.mirrorScreenMainPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMirrorScreenTimePage() {
            this.bitField0_ &= -524289;
            this.mirrorScreenTimePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNotifyPage() {
            this.bitField0_ &= -33;
            this.notifyPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSettingBacklightPage() {
            this.bitField0_ &= -16385;
            this.settingBacklightPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSettingPage() {
            this.bitField0_ &= -2049;
            this.settingPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSettingScreenLockPage() {
            this.bitField0_ &= -8193;
            this.settingScreenLockPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSettingWatchfacePage() {
            this.bitField0_ &= -4097;
            this.settingWatchfacePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatusPage1() {
            this.bitField0_ &= -9;
            this.statusPage1_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatusPage2() {
            this.bitField0_ &= -17;
            this.statusPage2_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStopwatchNum() {
            this.bitField0_ &= -32769;
            this.stopwatchNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimerCountdownPage() {
            this.bitField0_ &= -1025;
            this.timerCountdownPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimerPage() {
            this.bitField0_ &= -257;
            this.timerPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimerStopwatchPage() {
            this.bitField0_ &= -513;
            this.timerStopwatchPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeatherPage() {
            this.bitField0_ &= -65;
            this.weatherPage_ = 0;
        }

        public static TempoEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TempoEventMessage parseDelimitedFrom(InputStream inputStream) {
            return (TempoEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TempoEventMessage parseFrom(ByteBuffer byteBuffer) {
            return (TempoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<TempoEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmPage(int i) {
            this.bitField0_ |= 128;
            this.alarmPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCode128Num(int i) {
            this.bitField0_ |= 2097152;
            this.alipayCode128Num_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRCodeNum(int i) {
            this.bitField0_ |= EventRecurrence.TH;
            this.alipayQRCodeNum_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountdownNum(int i) {
            this.bitField0_ |= 65536;
            this.countdownNum_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDial2DND(int i) {
            this.bitField0_ |= 1;
            this.dial2DND_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDial2MainItem1(int i) {
            this.bitField0_ |= 4;
            this.dial2MainItem1_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDial2Notify(int i) {
            this.bitField0_ |= 2;
            this.dial2Notify_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialId(int i) {
            this.bitField0_ |= 4194304;
            this.dialId_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMirrorScreenHeartratePage(int i) {
            this.bitField0_ |= 262144;
            this.mirrorScreenHeartratePage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMirrorScreenMainPage(int i) {
            this.bitField0_ |= 131072;
            this.mirrorScreenMainPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMirrorScreenTimePage(int i) {
            this.bitField0_ |= 524288;
            this.mirrorScreenTimePage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotifyPage(int i) {
            this.bitField0_ |= 32;
            this.notifyPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingBacklightPage(int i) {
            this.bitField0_ |= 16384;
            this.settingBacklightPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingPage(int i) {
            this.bitField0_ |= 2048;
            this.settingPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingScreenLockPage(int i) {
            this.bitField0_ |= 8192;
            this.settingScreenLockPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingWatchfacePage(int i) {
            this.bitField0_ |= 4096;
            this.settingWatchfacePage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusPage1(int i) {
            this.bitField0_ |= 8;
            this.statusPage1_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusPage2(int i) {
            this.bitField0_ |= 16;
            this.statusPage2_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopwatchNum(int i) {
            this.bitField0_ |= 32768;
            this.stopwatchNum_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimerCountdownPage(int i) {
            this.bitField0_ |= 1024;
            this.timerCountdownPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimerPage(int i) {
            this.bitField0_ |= 256;
            this.timerPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimerStopwatchPage(int i) {
            this.bitField0_ |= 512;
            this.timerStopwatchPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeatherPage(int i) {
            this.bitField0_ |= 64;
            this.weatherPage_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new TempoEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0000\u0014\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f\u0011ᔋ\u0010\u0012ᔋ\u0011\u0013ᔋ\u0012\u0014ᔋ\u0013\u0015ဋ\u0014\u0016ဋ\u0015\u0017ဋ\u0016", new Object[]{"bitField0_", "dial2DND_", "dial2Notify_", "dial2MainItem1_", "statusPage1_", "statusPage2_", "notifyPage_", "weatherPage_", "alarmPage_", "timerPage_", "timerStopwatchPage_", "timerCountdownPage_", "settingPage_", "settingWatchfacePage_", "settingScreenLockPage_", "settingBacklightPage_", "stopwatchNum_", "countdownNum_", "mirrorScreenMainPage_", "mirrorScreenHeartratePage_", "mirrorScreenTimePage_", "alipayQRCodeNum_", "alipayCode128Num_", "dialId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<TempoEventMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (TempoEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public int getAlarmPage() {
            return this.alarmPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public int getAlipayCode128Num() {
            return this.alipayCode128Num_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public int getAlipayQRCodeNum() {
            return this.alipayQRCodeNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public int getCountdownNum() {
            return this.countdownNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public int getDial2DND() {
            return this.dial2DND_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public int getDial2MainItem1() {
            return this.dial2MainItem1_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public int getDial2Notify() {
            return this.dial2Notify_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public int getDialId() {
            return this.dialId_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public int getMirrorScreenHeartratePage() {
            return this.mirrorScreenHeartratePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public int getMirrorScreenMainPage() {
            return this.mirrorScreenMainPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public int getMirrorScreenTimePage() {
            return this.mirrorScreenTimePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public int getNotifyPage() {
            return this.notifyPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public int getSettingBacklightPage() {
            return this.settingBacklightPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public int getSettingPage() {
            return this.settingPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public int getSettingScreenLockPage() {
            return this.settingScreenLockPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public int getSettingWatchfacePage() {
            return this.settingWatchfacePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public int getStatusPage1() {
            return this.statusPage1_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public int getStatusPage2() {
            return this.statusPage2_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public int getStopwatchNum() {
            return this.stopwatchNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public int getTimerCountdownPage() {
            return this.timerCountdownPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public int getTimerPage() {
            return this.timerPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public int getTimerStopwatchPage() {
            return this.timerStopwatchPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public int getWeatherPage() {
            return this.weatherPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public boolean hasAlarmPage() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public boolean hasAlipayCode128Num() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public boolean hasAlipayQRCodeNum() {
            return (this.bitField0_ & EventRecurrence.TH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public boolean hasCountdownNum() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public boolean hasDial2DND() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public boolean hasDial2MainItem1() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public boolean hasDial2Notify() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public boolean hasDialId() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public boolean hasMirrorScreenHeartratePage() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public boolean hasMirrorScreenMainPage() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public boolean hasMirrorScreenTimePage() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public boolean hasNotifyPage() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public boolean hasSettingBacklightPage() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public boolean hasSettingPage() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public boolean hasSettingScreenLockPage() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public boolean hasSettingWatchfacePage() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public boolean hasStatusPage1() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public boolean hasStatusPage2() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public boolean hasStopwatchNum() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public boolean hasTimerCountdownPage() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public boolean hasTimerPage() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public boolean hasTimerStopwatchPage() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoEventMessageOrBuilder
        public boolean hasWeatherPage() {
            return (this.bitField0_ & 64) != 0;
        }

        public static Builder newBuilder(TempoEventMessage tempoEventMessage) {
            return DEFAULT_INSTANCE.createBuilder(tempoEventMessage);
        }

        public static TempoEventMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (TempoEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static TempoEventMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (TempoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static TempoEventMessage parseFrom(ByteString byteString) {
            return (TempoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TempoEventMessage parseFrom(ByteString byteString, t tVar) {
            return (TempoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static TempoEventMessage parseFrom(byte[] bArr) {
            return (TempoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TempoEventMessage parseFrom(byte[] bArr, t tVar) {
            return (TempoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static TempoEventMessage parseFrom(InputStream inputStream) {
            return (TempoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TempoEventMessage parseFrom(InputStream inputStream, t tVar) {
            return (TempoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static TempoEventMessage parseFrom(j jVar) {
            return (TempoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static TempoEventMessage parseFrom(j jVar, t tVar) {
            return (TempoEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface TempoEventMessageOrBuilder extends bsf {
        int getAlarmPage();

        int getAlipayCode128Num();

        int getAlipayQRCodeNum();

        int getCountdownNum();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        int getDial2DND();

        int getDial2MainItem1();

        int getDial2Notify();

        int getDialId();

        int getMirrorScreenHeartratePage();

        int getMirrorScreenMainPage();

        int getMirrorScreenTimePage();

        int getNotifyPage();

        int getSettingBacklightPage();

        int getSettingPage();

        int getSettingScreenLockPage();

        int getSettingWatchfacePage();

        int getStatusPage1();

        int getStatusPage2();

        int getStopwatchNum();

        int getTimerCountdownPage();

        int getTimerPage();

        int getTimerStopwatchPage();

        int getWeatherPage();

        boolean hasAlarmPage();

        boolean hasAlipayCode128Num();

        boolean hasAlipayQRCodeNum();

        boolean hasCountdownNum();

        boolean hasDial2DND();

        boolean hasDial2MainItem1();

        boolean hasDial2Notify();

        boolean hasDialId();

        boolean hasMirrorScreenHeartratePage();

        boolean hasMirrorScreenMainPage();

        boolean hasMirrorScreenTimePage();

        boolean hasNotifyPage();

        boolean hasSettingBacklightPage();

        boolean hasSettingPage();

        boolean hasSettingScreenLockPage();

        boolean hasSettingWatchfacePage();

        boolean hasStatusPage1();

        boolean hasStatusPage2();

        boolean hasStopwatchNum();

        boolean hasTimerCountdownPage();

        boolean hasTimerPage();

        boolean hasTimerStopwatchPage();

        boolean hasWeatherPage();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    public static final class TempoStatisticsMessage extends GeneratedMessageLite<TempoStatisticsMessage, Builder> implements TempoStatisticsMessageOrBuilder {
        public static final int BACKLIGHTLEVEL_FIELD_NUMBER = 3;
        public static final int BASE_FIELD_NUMBER = 1;
        private static final TempoStatisticsMessage DEFAULT_INSTANCE;
        public static final int EVENT_FIELD_NUMBER = 5;
        private static volatile vkh<TempoStatisticsMessage> PARSER = null;
        public static final int SCREENLOCK_FIELD_NUMBER = 4;
        public static final int SILENCEMODE_FIELD_NUMBER = 2;
        private int backlightLevel_;
        private StatisBase.StatisBaseMessage base_;
        private int bitField0_;
        private TempoEventMessage event_;
        private byte memoizedIsInitialized = 2;
        private boolean screenLock_;
        private int silenceMode_;

        public static final class Builder extends GeneratedMessageLite.a<TempoStatisticsMessage, Builder> implements TempoStatisticsMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBacklightLevel() {
                copyOnWrite();
                ((TempoStatisticsMessage) this.instance).clearBacklightLevel();
                return this;
            }

            public Builder clearBase() {
                copyOnWrite();
                ((TempoStatisticsMessage) this.instance).clearBase();
                return this;
            }

            public Builder clearEvent() {
                copyOnWrite();
                ((TempoStatisticsMessage) this.instance).clearEvent();
                return this;
            }

            public Builder clearScreenLock() {
                copyOnWrite();
                ((TempoStatisticsMessage) this.instance).clearScreenLock();
                return this;
            }

            public Builder clearSilenceMode() {
                copyOnWrite();
                ((TempoStatisticsMessage) this.instance).clearSilenceMode();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoStatisticsMessageOrBuilder
            public int getBacklightLevel() {
                return ((TempoStatisticsMessage) this.instance).getBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoStatisticsMessageOrBuilder
            public StatisBase.StatisBaseMessage getBase() {
                return ((TempoStatisticsMessage) this.instance).getBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoStatisticsMessageOrBuilder
            public TempoEventMessage getEvent() {
                return ((TempoStatisticsMessage) this.instance).getEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoStatisticsMessageOrBuilder
            public boolean getScreenLock() {
                return ((TempoStatisticsMessage) this.instance).getScreenLock();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoStatisticsMessageOrBuilder
            public SilenceModeOuterClass.SilenceMode getSilenceMode() {
                return ((TempoStatisticsMessage) this.instance).getSilenceMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoStatisticsMessageOrBuilder
            public boolean hasBacklightLevel() {
                return ((TempoStatisticsMessage) this.instance).hasBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoStatisticsMessageOrBuilder
            public boolean hasBase() {
                return ((TempoStatisticsMessage) this.instance).hasBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoStatisticsMessageOrBuilder
            public boolean hasEvent() {
                return ((TempoStatisticsMessage) this.instance).hasEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoStatisticsMessageOrBuilder
            public boolean hasScreenLock() {
                return ((TempoStatisticsMessage) this.instance).hasScreenLock();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoStatisticsMessageOrBuilder
            public boolean hasSilenceMode() {
                return ((TempoStatisticsMessage) this.instance).hasSilenceMode();
            }

            public Builder mergeBase(StatisBase.StatisBaseMessage statisBaseMessage) {
                copyOnWrite();
                ((TempoStatisticsMessage) this.instance).mergeBase(statisBaseMessage);
                return this;
            }

            public Builder mergeEvent(TempoEventMessage tempoEventMessage) {
                copyOnWrite();
                ((TempoStatisticsMessage) this.instance).mergeEvent(tempoEventMessage);
                return this;
            }

            public Builder setBacklightLevel(int i) {
                copyOnWrite();
                ((TempoStatisticsMessage) this.instance).setBacklightLevel(i);
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage statisBaseMessage) {
                copyOnWrite();
                ((TempoStatisticsMessage) this.instance).setBase(statisBaseMessage);
                return this;
            }

            public Builder setEvent(TempoEventMessage tempoEventMessage) {
                copyOnWrite();
                ((TempoStatisticsMessage) this.instance).setEvent(tempoEventMessage);
                return this;
            }

            public Builder setScreenLock(boolean z) {
                copyOnWrite();
                ((TempoStatisticsMessage) this.instance).setScreenLock(z);
                return this;
            }

            public Builder setSilenceMode(SilenceModeOuterClass.SilenceMode silenceMode) {
                copyOnWrite();
                ((TempoStatisticsMessage) this.instance).setSilenceMode(silenceMode);
                return this;
            }

            private Builder() {
                super(TempoStatisticsMessage.DEFAULT_INSTANCE);
            }

            public Builder setBase(StatisBase.StatisBaseMessage.Builder builder) {
                copyOnWrite();
                ((TempoStatisticsMessage) this.instance).setBase(builder.build());
                return this;
            }

            public Builder setEvent(TempoEventMessage.Builder builder) {
                copyOnWrite();
                ((TempoStatisticsMessage) this.instance).setEvent(builder.build());
                return this;
            }
        }

        static {
            TempoStatisticsMessage tempoStatisticsMessage = new TempoStatisticsMessage();
            DEFAULT_INSTANCE = tempoStatisticsMessage;
            GeneratedMessageLite.registerDefaultInstance(TempoStatisticsMessage.class, tempoStatisticsMessage);
        }

        private TempoStatisticsMessage() {
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
        public void clearScreenLock() {
            this.bitField0_ &= -9;
            this.screenLock_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSilenceMode() {
            this.bitField0_ &= -3;
            this.silenceMode_ = 0;
        }

        public static TempoStatisticsMessage getDefaultInstance() {
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
        public void mergeEvent(TempoEventMessage tempoEventMessage) {
            tempoEventMessage.getClass();
            TempoEventMessage tempoEventMessage2 = this.event_;
            if (tempoEventMessage2 == null || tempoEventMessage2 == TempoEventMessage.getDefaultInstance()) {
                this.event_ = tempoEventMessage;
            } else {
                this.event_ = TempoEventMessage.newBuilder(this.event_).mergeFrom(tempoEventMessage).buildPartial();
            }
            this.bitField0_ |= 16;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TempoStatisticsMessage parseDelimitedFrom(InputStream inputStream) {
            return (TempoStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TempoStatisticsMessage parseFrom(ByteBuffer byteBuffer) {
            return (TempoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<TempoStatisticsMessage> parser() {
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
        public void setEvent(TempoEventMessage tempoEventMessage) {
            tempoEventMessage.getClass();
            this.event_ = tempoEventMessage;
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setScreenLock(boolean z) {
            this.bitField0_ |= 8;
            this.screenLock_ = z;
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
                    return new TempoStatisticsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001ᔉ\u0000\u0002ᔌ\u0001\u0003ᔋ\u0002\u0004ᔇ\u0003\u0005ᐉ\u0004", new Object[]{"bitField0_", "base_", "silenceMode_", SilenceModeOuterClass.SilenceMode.internalGetVerifier(), "backlightLevel_", "screenLock_", "event_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<TempoStatisticsMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (TempoStatisticsMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoStatisticsMessageOrBuilder
        public int getBacklightLevel() {
            return this.backlightLevel_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoStatisticsMessageOrBuilder
        public StatisBase.StatisBaseMessage getBase() {
            StatisBase.StatisBaseMessage statisBaseMessage = this.base_;
            return statisBaseMessage == null ? StatisBase.StatisBaseMessage.getDefaultInstance() : statisBaseMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoStatisticsMessageOrBuilder
        public TempoEventMessage getEvent() {
            TempoEventMessage tempoEventMessage = this.event_;
            return tempoEventMessage == null ? TempoEventMessage.getDefaultInstance() : tempoEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoStatisticsMessageOrBuilder
        public boolean getScreenLock() {
            return this.screenLock_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoStatisticsMessageOrBuilder
        public SilenceModeOuterClass.SilenceMode getSilenceMode() {
            SilenceModeOuterClass.SilenceMode silenceModeForNumber = SilenceModeOuterClass.SilenceMode.forNumber(this.silenceMode_);
            return silenceModeForNumber == null ? SilenceModeOuterClass.SilenceMode.OFF : silenceModeForNumber;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoStatisticsMessageOrBuilder
        public boolean hasBacklightLevel() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoStatisticsMessageOrBuilder
        public boolean hasBase() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoStatisticsMessageOrBuilder
        public boolean hasEvent() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoStatisticsMessageOrBuilder
        public boolean hasScreenLock() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Tempo.TempoStatisticsMessageOrBuilder
        public boolean hasSilenceMode() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(TempoStatisticsMessage tempoStatisticsMessage) {
            return DEFAULT_INSTANCE.createBuilder(tempoStatisticsMessage);
        }

        public static TempoStatisticsMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (TempoStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static TempoStatisticsMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (TempoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static TempoStatisticsMessage parseFrom(ByteString byteString) {
            return (TempoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static TempoStatisticsMessage parseFrom(ByteString byteString, t tVar) {
            return (TempoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static TempoStatisticsMessage parseFrom(byte[] bArr) {
            return (TempoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static TempoStatisticsMessage parseFrom(byte[] bArr, t tVar) {
            return (TempoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static TempoStatisticsMessage parseFrom(InputStream inputStream) {
            return (TempoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static TempoStatisticsMessage parseFrom(InputStream inputStream, t tVar) {
            return (TempoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static TempoStatisticsMessage parseFrom(j jVar) {
            return (TempoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static TempoStatisticsMessage parseFrom(j jVar, t tVar) {
            return (TempoStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface TempoStatisticsMessageOrBuilder extends bsf {
        int getBacklightLevel();

        StatisBase.StatisBaseMessage getBase();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        TempoEventMessage getEvent();

        boolean getScreenLock();

        SilenceModeOuterClass.SilenceMode getSilenceMode();

        boolean hasBacklightLevel();

        boolean hasBase();

        boolean hasEvent();

        boolean hasScreenLock();

        boolean hasSilenceMode();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    private Tempo() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}
