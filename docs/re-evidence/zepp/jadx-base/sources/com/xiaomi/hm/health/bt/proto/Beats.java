package com.xiaomi.hm.health.bt.proto;

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
public final class Beats {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.Beats$1, reason: invalid class name */
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

    public static final class BeatsEventMessage extends GeneratedMessageLite<BeatsEventMessage, Builder> implements BeatsEventMessageOrBuilder {
        public static final int ALARMPAGE_FIELD_NUMBER = 8;
        public static final int ALIPAYCODE128NUM_FIELD_NUMBER = 22;
        public static final int ALIPAYQRCODENUM_FIELD_NUMBER = 21;
        public static final int COUNTDOWNNUM_FIELD_NUMBER = 17;
        private static final BeatsEventMessage DEFAULT_INSTANCE;
        public static final int DIAL2DND_FIELD_NUMBER = 1;
        public static final int DIAL2MAINITEM1_FIELD_NUMBER = 3;
        public static final int DIAL2NOTIFY_FIELD_NUMBER = 2;
        public static final int DIALID_FIELD_NUMBER = 23;
        public static final int MIRRORSCREENHEARTRATEPAGE_FIELD_NUMBER = 19;
        public static final int MIRRORSCREENMAINPAGE_FIELD_NUMBER = 18;
        public static final int MIRRORSCREENTIMEPAGE_FIELD_NUMBER = 20;
        public static final int NOTIFYPAGE_FIELD_NUMBER = 6;
        private static volatile Parser<BeatsEventMessage> PARSER = null;
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

        public static final class Builder extends GeneratedMessageLite.Builder<BeatsEventMessage, Builder> implements BeatsEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAlarmPage() {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).clearAlarmPage();
                return this;
            }

            public Builder clearAlipayCode128Num() {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).clearAlipayCode128Num();
                return this;
            }

            public Builder clearAlipayQRCodeNum() {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).clearAlipayQRCodeNum();
                return this;
            }

            public Builder clearCountdownNum() {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).clearCountdownNum();
                return this;
            }

            public Builder clearDial2DND() {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).clearDial2DND();
                return this;
            }

            public Builder clearDial2MainItem1() {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).clearDial2MainItem1();
                return this;
            }

            public Builder clearDial2Notify() {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).clearDial2Notify();
                return this;
            }

            public Builder clearDialId() {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).clearDialId();
                return this;
            }

            public Builder clearMirrorScreenHeartratePage() {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).clearMirrorScreenHeartratePage();
                return this;
            }

            public Builder clearMirrorScreenMainPage() {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).clearMirrorScreenMainPage();
                return this;
            }

            public Builder clearMirrorScreenTimePage() {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).clearMirrorScreenTimePage();
                return this;
            }

            public Builder clearNotifyPage() {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).clearNotifyPage();
                return this;
            }

            public Builder clearSettingBacklightPage() {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).clearSettingBacklightPage();
                return this;
            }

            public Builder clearSettingPage() {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).clearSettingPage();
                return this;
            }

            public Builder clearSettingScreenLockPage() {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).clearSettingScreenLockPage();
                return this;
            }

            public Builder clearSettingWatchfacePage() {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).clearSettingWatchfacePage();
                return this;
            }

            public Builder clearStatusPage1() {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).clearStatusPage1();
                return this;
            }

            public Builder clearStatusPage2() {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).clearStatusPage2();
                return this;
            }

            public Builder clearStopwatchNum() {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).clearStopwatchNum();
                return this;
            }

            public Builder clearTimerCountdownPage() {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).clearTimerCountdownPage();
                return this;
            }

            public Builder clearTimerPage() {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).clearTimerPage();
                return this;
            }

            public Builder clearTimerStopwatchPage() {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).clearTimerStopwatchPage();
                return this;
            }

            public Builder clearWeatherPage() {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).clearWeatherPage();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public int getAlarmPage() {
                return ((BeatsEventMessage) this.instance).getAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public int getAlipayCode128Num() {
                return ((BeatsEventMessage) this.instance).getAlipayCode128Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public int getAlipayQRCodeNum() {
                return ((BeatsEventMessage) this.instance).getAlipayQRCodeNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public int getCountdownNum() {
                return ((BeatsEventMessage) this.instance).getCountdownNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public int getDial2DND() {
                return ((BeatsEventMessage) this.instance).getDial2DND();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public int getDial2MainItem1() {
                return ((BeatsEventMessage) this.instance).getDial2MainItem1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public int getDial2Notify() {
                return ((BeatsEventMessage) this.instance).getDial2Notify();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public int getDialId() {
                return ((BeatsEventMessage) this.instance).getDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public int getMirrorScreenHeartratePage() {
                return ((BeatsEventMessage) this.instance).getMirrorScreenHeartratePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public int getMirrorScreenMainPage() {
                return ((BeatsEventMessage) this.instance).getMirrorScreenMainPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public int getMirrorScreenTimePage() {
                return ((BeatsEventMessage) this.instance).getMirrorScreenTimePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public int getNotifyPage() {
                return ((BeatsEventMessage) this.instance).getNotifyPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public int getSettingBacklightPage() {
                return ((BeatsEventMessage) this.instance).getSettingBacklightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public int getSettingPage() {
                return ((BeatsEventMessage) this.instance).getSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public int getSettingScreenLockPage() {
                return ((BeatsEventMessage) this.instance).getSettingScreenLockPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public int getSettingWatchfacePage() {
                return ((BeatsEventMessage) this.instance).getSettingWatchfacePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public int getStatusPage1() {
                return ((BeatsEventMessage) this.instance).getStatusPage1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public int getStatusPage2() {
                return ((BeatsEventMessage) this.instance).getStatusPage2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public int getStopwatchNum() {
                return ((BeatsEventMessage) this.instance).getStopwatchNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public int getTimerCountdownPage() {
                return ((BeatsEventMessage) this.instance).getTimerCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public int getTimerPage() {
                return ((BeatsEventMessage) this.instance).getTimerPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public int getTimerStopwatchPage() {
                return ((BeatsEventMessage) this.instance).getTimerStopwatchPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public int getWeatherPage() {
                return ((BeatsEventMessage) this.instance).getWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public boolean hasAlarmPage() {
                return ((BeatsEventMessage) this.instance).hasAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public boolean hasAlipayCode128Num() {
                return ((BeatsEventMessage) this.instance).hasAlipayCode128Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public boolean hasAlipayQRCodeNum() {
                return ((BeatsEventMessage) this.instance).hasAlipayQRCodeNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public boolean hasCountdownNum() {
                return ((BeatsEventMessage) this.instance).hasCountdownNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public boolean hasDial2DND() {
                return ((BeatsEventMessage) this.instance).hasDial2DND();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public boolean hasDial2MainItem1() {
                return ((BeatsEventMessage) this.instance).hasDial2MainItem1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public boolean hasDial2Notify() {
                return ((BeatsEventMessage) this.instance).hasDial2Notify();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public boolean hasDialId() {
                return ((BeatsEventMessage) this.instance).hasDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public boolean hasMirrorScreenHeartratePage() {
                return ((BeatsEventMessage) this.instance).hasMirrorScreenHeartratePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public boolean hasMirrorScreenMainPage() {
                return ((BeatsEventMessage) this.instance).hasMirrorScreenMainPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public boolean hasMirrorScreenTimePage() {
                return ((BeatsEventMessage) this.instance).hasMirrorScreenTimePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public boolean hasNotifyPage() {
                return ((BeatsEventMessage) this.instance).hasNotifyPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public boolean hasSettingBacklightPage() {
                return ((BeatsEventMessage) this.instance).hasSettingBacklightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public boolean hasSettingPage() {
                return ((BeatsEventMessage) this.instance).hasSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public boolean hasSettingScreenLockPage() {
                return ((BeatsEventMessage) this.instance).hasSettingScreenLockPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public boolean hasSettingWatchfacePage() {
                return ((BeatsEventMessage) this.instance).hasSettingWatchfacePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public boolean hasStatusPage1() {
                return ((BeatsEventMessage) this.instance).hasStatusPage1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public boolean hasStatusPage2() {
                return ((BeatsEventMessage) this.instance).hasStatusPage2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public boolean hasStopwatchNum() {
                return ((BeatsEventMessage) this.instance).hasStopwatchNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public boolean hasTimerCountdownPage() {
                return ((BeatsEventMessage) this.instance).hasTimerCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public boolean hasTimerPage() {
                return ((BeatsEventMessage) this.instance).hasTimerPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public boolean hasTimerStopwatchPage() {
                return ((BeatsEventMessage) this.instance).hasTimerStopwatchPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
            public boolean hasWeatherPage() {
                return ((BeatsEventMessage) this.instance).hasWeatherPage();
            }

            public Builder setAlarmPage(int value) {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).setAlarmPage(value);
                return this;
            }

            public Builder setAlipayCode128Num(int value) {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).setAlipayCode128Num(value);
                return this;
            }

            public Builder setAlipayQRCodeNum(int value) {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).setAlipayQRCodeNum(value);
                return this;
            }

            public Builder setCountdownNum(int value) {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).setCountdownNum(value);
                return this;
            }

            public Builder setDial2DND(int value) {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).setDial2DND(value);
                return this;
            }

            public Builder setDial2MainItem1(int value) {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).setDial2MainItem1(value);
                return this;
            }

            public Builder setDial2Notify(int value) {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).setDial2Notify(value);
                return this;
            }

            public Builder setDialId(int value) {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).setDialId(value);
                return this;
            }

            public Builder setMirrorScreenHeartratePage(int value) {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).setMirrorScreenHeartratePage(value);
                return this;
            }

            public Builder setMirrorScreenMainPage(int value) {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).setMirrorScreenMainPage(value);
                return this;
            }

            public Builder setMirrorScreenTimePage(int value) {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).setMirrorScreenTimePage(value);
                return this;
            }

            public Builder setNotifyPage(int value) {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).setNotifyPage(value);
                return this;
            }

            public Builder setSettingBacklightPage(int value) {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).setSettingBacklightPage(value);
                return this;
            }

            public Builder setSettingPage(int value) {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).setSettingPage(value);
                return this;
            }

            public Builder setSettingScreenLockPage(int value) {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).setSettingScreenLockPage(value);
                return this;
            }

            public Builder setSettingWatchfacePage(int value) {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).setSettingWatchfacePage(value);
                return this;
            }

            public Builder setStatusPage1(int value) {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).setStatusPage1(value);
                return this;
            }

            public Builder setStatusPage2(int value) {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).setStatusPage2(value);
                return this;
            }

            public Builder setStopwatchNum(int value) {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).setStopwatchNum(value);
                return this;
            }

            public Builder setTimerCountdownPage(int value) {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).setTimerCountdownPage(value);
                return this;
            }

            public Builder setTimerPage(int value) {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).setTimerPage(value);
                return this;
            }

            public Builder setTimerStopwatchPage(int value) {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).setTimerStopwatchPage(value);
                return this;
            }

            public Builder setWeatherPage(int value) {
                copyOnWrite();
                ((BeatsEventMessage) this.instance).setWeatherPage(value);
                return this;
            }

            private Builder() {
                super(BeatsEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            BeatsEventMessage beatsEventMessage = new BeatsEventMessage();
            DEFAULT_INSTANCE = beatsEventMessage;
            GeneratedMessageLite.registerDefaultInstance(BeatsEventMessage.class, beatsEventMessage);
        }

        private BeatsEventMessage() {
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

        public static BeatsEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BeatsEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (BeatsEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static BeatsEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (BeatsEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<BeatsEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmPage(int value) {
            this.bitField0_ |= 128;
            this.alarmPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCode128Num(int value) {
            this.bitField0_ |= 2097152;
            this.alipayCode128Num_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRCodeNum(int value) {
            this.bitField0_ |= 1048576;
            this.alipayQRCodeNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountdownNum(int value) {
            this.bitField0_ |= 65536;
            this.countdownNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDial2DND(int value) {
            this.bitField0_ |= 1;
            this.dial2DND_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDial2MainItem1(int value) {
            this.bitField0_ |= 4;
            this.dial2MainItem1_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDial2Notify(int value) {
            this.bitField0_ |= 2;
            this.dial2Notify_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialId(int value) {
            this.bitField0_ |= 4194304;
            this.dialId_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMirrorScreenHeartratePage(int value) {
            this.bitField0_ |= 262144;
            this.mirrorScreenHeartratePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMirrorScreenMainPage(int value) {
            this.bitField0_ |= 131072;
            this.mirrorScreenMainPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMirrorScreenTimePage(int value) {
            this.bitField0_ |= 524288;
            this.mirrorScreenTimePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNotifyPage(int value) {
            this.bitField0_ |= 32;
            this.notifyPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingBacklightPage(int value) {
            this.bitField0_ |= 16384;
            this.settingBacklightPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingPage(int value) {
            this.bitField0_ |= 2048;
            this.settingPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingScreenLockPage(int value) {
            this.bitField0_ |= 8192;
            this.settingScreenLockPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingWatchfacePage(int value) {
            this.bitField0_ |= 4096;
            this.settingWatchfacePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusPage1(int value) {
            this.bitField0_ |= 8;
            this.statusPage1_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusPage2(int value) {
            this.bitField0_ |= 16;
            this.statusPage2_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopwatchNum(int value) {
            this.bitField0_ |= 32768;
            this.stopwatchNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimerCountdownPage(int value) {
            this.bitField0_ |= 1024;
            this.timerCountdownPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimerPage(int value) {
            this.bitField0_ |= 256;
            this.timerPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimerStopwatchPage(int value) {
            this.bitField0_ |= 512;
            this.timerStopwatchPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWeatherPage(int value) {
            this.bitField0_ |= 64;
            this.weatherPage_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new BeatsEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0000\u0014\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f\u0011ᔋ\u0010\u0012ᔋ\u0011\u0013ᔋ\u0012\u0014ᔋ\u0013\u0015ဋ\u0014\u0016ဋ\u0015\u0017ဋ\u0016", new Object[]{"bitField0_", "dial2DND_", "dial2Notify_", "dial2MainItem1_", "statusPage1_", "statusPage2_", "notifyPage_", "weatherPage_", "alarmPage_", "timerPage_", "timerStopwatchPage_", "timerCountdownPage_", "settingPage_", "settingWatchfacePage_", "settingScreenLockPage_", "settingBacklightPage_", "stopwatchNum_", "countdownNum_", "mirrorScreenMainPage_", "mirrorScreenHeartratePage_", "mirrorScreenTimePage_", "alipayQRCodeNum_", "alipayCode128Num_", "dialId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<BeatsEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (BeatsEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public int getAlarmPage() {
            return this.alarmPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public int getAlipayCode128Num() {
            return this.alipayCode128Num_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public int getAlipayQRCodeNum() {
            return this.alipayQRCodeNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public int getCountdownNum() {
            return this.countdownNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public int getDial2DND() {
            return this.dial2DND_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public int getDial2MainItem1() {
            return this.dial2MainItem1_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public int getDial2Notify() {
            return this.dial2Notify_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public int getDialId() {
            return this.dialId_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public int getMirrorScreenHeartratePage() {
            return this.mirrorScreenHeartratePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public int getMirrorScreenMainPage() {
            return this.mirrorScreenMainPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public int getMirrorScreenTimePage() {
            return this.mirrorScreenTimePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public int getNotifyPage() {
            return this.notifyPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public int getSettingBacklightPage() {
            return this.settingBacklightPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public int getSettingPage() {
            return this.settingPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public int getSettingScreenLockPage() {
            return this.settingScreenLockPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public int getSettingWatchfacePage() {
            return this.settingWatchfacePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public int getStatusPage1() {
            return this.statusPage1_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public int getStatusPage2() {
            return this.statusPage2_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public int getStopwatchNum() {
            return this.stopwatchNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public int getTimerCountdownPage() {
            return this.timerCountdownPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public int getTimerPage() {
            return this.timerPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public int getTimerStopwatchPage() {
            return this.timerStopwatchPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public int getWeatherPage() {
            return this.weatherPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public boolean hasAlarmPage() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public boolean hasAlipayCode128Num() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public boolean hasAlipayQRCodeNum() {
            return (this.bitField0_ & 1048576) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public boolean hasCountdownNum() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public boolean hasDial2DND() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public boolean hasDial2MainItem1() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public boolean hasDial2Notify() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public boolean hasDialId() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public boolean hasMirrorScreenHeartratePage() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public boolean hasMirrorScreenMainPage() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public boolean hasMirrorScreenTimePage() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public boolean hasNotifyPage() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public boolean hasSettingBacklightPage() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public boolean hasSettingPage() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public boolean hasSettingScreenLockPage() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public boolean hasSettingWatchfacePage() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public boolean hasStatusPage1() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public boolean hasStatusPage2() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public boolean hasStopwatchNum() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public boolean hasTimerCountdownPage() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public boolean hasTimerPage() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public boolean hasTimerStopwatchPage() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsEventMessageOrBuilder
        public boolean hasWeatherPage() {
            return (this.bitField0_ & 64) != 0;
        }

        public static Builder newBuilder(BeatsEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static BeatsEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BeatsEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static BeatsEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (BeatsEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static BeatsEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (BeatsEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static BeatsEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (BeatsEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static BeatsEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (BeatsEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static BeatsEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (BeatsEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static BeatsEventMessage parseFrom(InputStream input) throws IOException {
            return (BeatsEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static BeatsEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BeatsEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static BeatsEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (BeatsEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static BeatsEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BeatsEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface BeatsEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getAlarmPage();

        int getAlipayCode128Num();

        int getAlipayQRCodeNum();

        int getCountdownNum();

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
    }

    public static final class BeatsStatisticsMessage extends GeneratedMessageLite<BeatsStatisticsMessage, Builder> implements BeatsStatisticsMessageOrBuilder {
        public static final int BACKLIGHTLEVEL_FIELD_NUMBER = 3;
        public static final int BASE_FIELD_NUMBER = 1;
        private static final BeatsStatisticsMessage DEFAULT_INSTANCE;
        public static final int EVENT_FIELD_NUMBER = 5;
        public static final int NFC_FIELD_NUMBER = 6;
        private static volatile Parser<BeatsStatisticsMessage> PARSER = null;
        public static final int SCREENLOCK_FIELD_NUMBER = 4;
        public static final int SILENCEMODE_FIELD_NUMBER = 2;
        private int backlightLevel_;
        private StatisBase.StatisBaseMessage base_;
        private int bitField0_;
        private BeatsEventMessage event_;
        private byte memoizedIsInitialized = 2;
        private Nfc.NfcMessage nfc_;
        private boolean screenLock_;
        private int silenceMode_;

        public static final class Builder extends GeneratedMessageLite.Builder<BeatsStatisticsMessage, Builder> implements BeatsStatisticsMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBacklightLevel() {
                copyOnWrite();
                ((BeatsStatisticsMessage) this.instance).clearBacklightLevel();
                return this;
            }

            public Builder clearBase() {
                copyOnWrite();
                ((BeatsStatisticsMessage) this.instance).clearBase();
                return this;
            }

            public Builder clearEvent() {
                copyOnWrite();
                ((BeatsStatisticsMessage) this.instance).clearEvent();
                return this;
            }

            public Builder clearNfc() {
                copyOnWrite();
                ((BeatsStatisticsMessage) this.instance).clearNfc();
                return this;
            }

            public Builder clearScreenLock() {
                copyOnWrite();
                ((BeatsStatisticsMessage) this.instance).clearScreenLock();
                return this;
            }

            public Builder clearSilenceMode() {
                copyOnWrite();
                ((BeatsStatisticsMessage) this.instance).clearSilenceMode();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsStatisticsMessageOrBuilder
            public int getBacklightLevel() {
                return ((BeatsStatisticsMessage) this.instance).getBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsStatisticsMessageOrBuilder
            public StatisBase.StatisBaseMessage getBase() {
                return ((BeatsStatisticsMessage) this.instance).getBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsStatisticsMessageOrBuilder
            public BeatsEventMessage getEvent() {
                return ((BeatsStatisticsMessage) this.instance).getEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsStatisticsMessageOrBuilder
            public Nfc.NfcMessage getNfc() {
                return ((BeatsStatisticsMessage) this.instance).getNfc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsStatisticsMessageOrBuilder
            public boolean getScreenLock() {
                return ((BeatsStatisticsMessage) this.instance).getScreenLock();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsStatisticsMessageOrBuilder
            public SilenceModeOuterClass.SilenceMode getSilenceMode() {
                return ((BeatsStatisticsMessage) this.instance).getSilenceMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsStatisticsMessageOrBuilder
            public boolean hasBacklightLevel() {
                return ((BeatsStatisticsMessage) this.instance).hasBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsStatisticsMessageOrBuilder
            public boolean hasBase() {
                return ((BeatsStatisticsMessage) this.instance).hasBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsStatisticsMessageOrBuilder
            public boolean hasEvent() {
                return ((BeatsStatisticsMessage) this.instance).hasEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsStatisticsMessageOrBuilder
            public boolean hasNfc() {
                return ((BeatsStatisticsMessage) this.instance).hasNfc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsStatisticsMessageOrBuilder
            public boolean hasScreenLock() {
                return ((BeatsStatisticsMessage) this.instance).hasScreenLock();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsStatisticsMessageOrBuilder
            public boolean hasSilenceMode() {
                return ((BeatsStatisticsMessage) this.instance).hasSilenceMode();
            }

            public Builder mergeBase(StatisBase.StatisBaseMessage value) {
                copyOnWrite();
                ((BeatsStatisticsMessage) this.instance).mergeBase(value);
                return this;
            }

            public Builder mergeEvent(BeatsEventMessage value) {
                copyOnWrite();
                ((BeatsStatisticsMessage) this.instance).mergeEvent(value);
                return this;
            }

            public Builder mergeNfc(Nfc.NfcMessage value) {
                copyOnWrite();
                ((BeatsStatisticsMessage) this.instance).mergeNfc(value);
                return this;
            }

            public Builder setBacklightLevel(int value) {
                copyOnWrite();
                ((BeatsStatisticsMessage) this.instance).setBacklightLevel(value);
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage value) {
                copyOnWrite();
                ((BeatsStatisticsMessage) this.instance).setBase(value);
                return this;
            }

            public Builder setEvent(BeatsEventMessage value) {
                copyOnWrite();
                ((BeatsStatisticsMessage) this.instance).setEvent(value);
                return this;
            }

            public Builder setNfc(Nfc.NfcMessage value) {
                copyOnWrite();
                ((BeatsStatisticsMessage) this.instance).setNfc(value);
                return this;
            }

            public Builder setScreenLock(boolean value) {
                copyOnWrite();
                ((BeatsStatisticsMessage) this.instance).setScreenLock(value);
                return this;
            }

            public Builder setSilenceMode(SilenceModeOuterClass.SilenceMode value) {
                copyOnWrite();
                ((BeatsStatisticsMessage) this.instance).setSilenceMode(value);
                return this;
            }

            private Builder() {
                super(BeatsStatisticsMessage.DEFAULT_INSTANCE);
            }

            public Builder setBase(StatisBase.StatisBaseMessage.Builder builderForValue) {
                copyOnWrite();
                ((BeatsStatisticsMessage) this.instance).setBase(builderForValue.build());
                return this;
            }

            public Builder setEvent(BeatsEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((BeatsStatisticsMessage) this.instance).setEvent(builderForValue.build());
                return this;
            }

            public Builder setNfc(Nfc.NfcMessage.Builder builderForValue) {
                copyOnWrite();
                ((BeatsStatisticsMessage) this.instance).setNfc(builderForValue.build());
                return this;
            }
        }

        static {
            BeatsStatisticsMessage beatsStatisticsMessage = new BeatsStatisticsMessage();
            DEFAULT_INSTANCE = beatsStatisticsMessage;
            GeneratedMessageLite.registerDefaultInstance(BeatsStatisticsMessage.class, beatsStatisticsMessage);
        }

        private BeatsStatisticsMessage() {
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
        public void clearScreenLock() {
            this.bitField0_ &= -9;
            this.screenLock_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSilenceMode() {
            this.bitField0_ &= -3;
            this.silenceMode_ = 0;
        }

        public static BeatsStatisticsMessage getDefaultInstance() {
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
        public void mergeEvent(BeatsEventMessage value) {
            value.getClass();
            BeatsEventMessage beatsEventMessage = this.event_;
            if (beatsEventMessage == null || beatsEventMessage == BeatsEventMessage.getDefaultInstance()) {
                this.event_ = value;
            } else {
                this.event_ = BeatsEventMessage.newBuilder(this.event_).mergeFrom(value).buildPartial();
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

        public static BeatsStatisticsMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (BeatsStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static BeatsStatisticsMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (BeatsStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<BeatsStatisticsMessage> parser() {
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
        public void setEvent(BeatsEventMessage value) {
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
        public void setScreenLock(boolean value) {
            this.bitField0_ |= 8;
            this.screenLock_ = value;
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
                    return new BeatsStatisticsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001ᔉ\u0000\u0002ᔌ\u0001\u0003ᔋ\u0002\u0004ᔇ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005", new Object[]{"bitField0_", "base_", "silenceMode_", SilenceModeOuterClass.SilenceMode.internalGetVerifier(), "backlightLevel_", "screenLock_", "event_", "nfc_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<BeatsStatisticsMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (BeatsStatisticsMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsStatisticsMessageOrBuilder
        public int getBacklightLevel() {
            return this.backlightLevel_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsStatisticsMessageOrBuilder
        public StatisBase.StatisBaseMessage getBase() {
            StatisBase.StatisBaseMessage statisBaseMessage = this.base_;
            return statisBaseMessage == null ? StatisBase.StatisBaseMessage.getDefaultInstance() : statisBaseMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsStatisticsMessageOrBuilder
        public BeatsEventMessage getEvent() {
            BeatsEventMessage beatsEventMessage = this.event_;
            return beatsEventMessage == null ? BeatsEventMessage.getDefaultInstance() : beatsEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsStatisticsMessageOrBuilder
        public Nfc.NfcMessage getNfc() {
            Nfc.NfcMessage nfcMessage = this.nfc_;
            return nfcMessage == null ? Nfc.NfcMessage.getDefaultInstance() : nfcMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsStatisticsMessageOrBuilder
        public boolean getScreenLock() {
            return this.screenLock_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsStatisticsMessageOrBuilder
        public SilenceModeOuterClass.SilenceMode getSilenceMode() {
            SilenceModeOuterClass.SilenceMode silenceModeForNumber = SilenceModeOuterClass.SilenceMode.forNumber(this.silenceMode_);
            return silenceModeForNumber == null ? SilenceModeOuterClass.SilenceMode.OFF : silenceModeForNumber;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsStatisticsMessageOrBuilder
        public boolean hasBacklightLevel() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsStatisticsMessageOrBuilder
        public boolean hasBase() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsStatisticsMessageOrBuilder
        public boolean hasEvent() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsStatisticsMessageOrBuilder
        public boolean hasNfc() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsStatisticsMessageOrBuilder
        public boolean hasScreenLock() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beats.BeatsStatisticsMessageOrBuilder
        public boolean hasSilenceMode() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(BeatsStatisticsMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static BeatsStatisticsMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BeatsStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static BeatsStatisticsMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (BeatsStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static BeatsStatisticsMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (BeatsStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static BeatsStatisticsMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (BeatsStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static BeatsStatisticsMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (BeatsStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static BeatsStatisticsMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (BeatsStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static BeatsStatisticsMessage parseFrom(InputStream input) throws IOException {
            return (BeatsStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static BeatsStatisticsMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BeatsStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static BeatsStatisticsMessage parseFrom(CodedInputStream input) throws IOException {
            return (BeatsStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static BeatsStatisticsMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BeatsStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface BeatsStatisticsMessageOrBuilder extends MessageLiteOrBuilder {
        int getBacklightLevel();

        StatisBase.StatisBaseMessage getBase();

        BeatsEventMessage getEvent();

        Nfc.NfcMessage getNfc();

        boolean getScreenLock();

        SilenceModeOuterClass.SilenceMode getSilenceMode();

        boolean hasBacklightLevel();

        boolean hasBase();

        boolean hasEvent();

        boolean hasNfc();

        boolean hasScreenLock();

        boolean hasSilenceMode();
    }

    private Beats() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }
}
