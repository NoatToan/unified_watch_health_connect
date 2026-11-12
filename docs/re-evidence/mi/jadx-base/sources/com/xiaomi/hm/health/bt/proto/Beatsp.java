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
public final class Beatsp {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.Beatsp$1, reason: invalid class name */
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

    public static final class BeatsPEventMessage extends GeneratedMessageLite<BeatsPEventMessage, Builder> implements BeatsPEventMessageOrBuilder {
        public static final int ALARMPAGE_FIELD_NUMBER = 8;
        public static final int ALIPAYCODE128NUM_FIELD_NUMBER = 22;
        public static final int ALIPAYQRCODENUM_FIELD_NUMBER = 21;
        public static final int COUNTDOWNNUM_FIELD_NUMBER = 17;
        private static final BeatsPEventMessage DEFAULT_INSTANCE;
        public static final int DIAL2DND_FIELD_NUMBER = 1;
        public static final int DIAL2MAINITEM1_FIELD_NUMBER = 3;
        public static final int DIAL2NOTIFY_FIELD_NUMBER = 2;
        public static final int DIALID_FIELD_NUMBER = 23;
        public static final int MIRRORSCREENHEARTRATEPAGE_FIELD_NUMBER = 19;
        public static final int MIRRORSCREENMAINPAGE_FIELD_NUMBER = 18;
        public static final int MIRRORSCREENTIMEPAGE_FIELD_NUMBER = 20;
        public static final int NOTIFYPAGE_FIELD_NUMBER = 6;
        private static volatile vkh<BeatsPEventMessage> PARSER = null;
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

        public static final class Builder extends GeneratedMessageLite.a<BeatsPEventMessage, Builder> implements BeatsPEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAlarmPage() {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).clearAlarmPage();
                return this;
            }

            public Builder clearAlipayCode128Num() {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).clearAlipayCode128Num();
                return this;
            }

            public Builder clearAlipayQRCodeNum() {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).clearAlipayQRCodeNum();
                return this;
            }

            public Builder clearCountdownNum() {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).clearCountdownNum();
                return this;
            }

            public Builder clearDial2DND() {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).clearDial2DND();
                return this;
            }

            public Builder clearDial2MainItem1() {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).clearDial2MainItem1();
                return this;
            }

            public Builder clearDial2Notify() {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).clearDial2Notify();
                return this;
            }

            public Builder clearDialId() {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).clearDialId();
                return this;
            }

            public Builder clearMirrorScreenHeartratePage() {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).clearMirrorScreenHeartratePage();
                return this;
            }

            public Builder clearMirrorScreenMainPage() {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).clearMirrorScreenMainPage();
                return this;
            }

            public Builder clearMirrorScreenTimePage() {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).clearMirrorScreenTimePage();
                return this;
            }

            public Builder clearNotifyPage() {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).clearNotifyPage();
                return this;
            }

            public Builder clearSettingBacklightPage() {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).clearSettingBacklightPage();
                return this;
            }

            public Builder clearSettingPage() {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).clearSettingPage();
                return this;
            }

            public Builder clearSettingScreenLockPage() {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).clearSettingScreenLockPage();
                return this;
            }

            public Builder clearSettingWatchfacePage() {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).clearSettingWatchfacePage();
                return this;
            }

            public Builder clearStatusPage1() {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).clearStatusPage1();
                return this;
            }

            public Builder clearStatusPage2() {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).clearStatusPage2();
                return this;
            }

            public Builder clearStopwatchNum() {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).clearStopwatchNum();
                return this;
            }

            public Builder clearTimerCountdownPage() {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).clearTimerCountdownPage();
                return this;
            }

            public Builder clearTimerPage() {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).clearTimerPage();
                return this;
            }

            public Builder clearTimerStopwatchPage() {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).clearTimerStopwatchPage();
                return this;
            }

            public Builder clearWeatherPage() {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).clearWeatherPage();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public int getAlarmPage() {
                return ((BeatsPEventMessage) this.instance).getAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public int getAlipayCode128Num() {
                return ((BeatsPEventMessage) this.instance).getAlipayCode128Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public int getAlipayQRCodeNum() {
                return ((BeatsPEventMessage) this.instance).getAlipayQRCodeNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public int getCountdownNum() {
                return ((BeatsPEventMessage) this.instance).getCountdownNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public int getDial2DND() {
                return ((BeatsPEventMessage) this.instance).getDial2DND();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public int getDial2MainItem1() {
                return ((BeatsPEventMessage) this.instance).getDial2MainItem1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public int getDial2Notify() {
                return ((BeatsPEventMessage) this.instance).getDial2Notify();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public int getDialId() {
                return ((BeatsPEventMessage) this.instance).getDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public int getMirrorScreenHeartratePage() {
                return ((BeatsPEventMessage) this.instance).getMirrorScreenHeartratePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public int getMirrorScreenMainPage() {
                return ((BeatsPEventMessage) this.instance).getMirrorScreenMainPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public int getMirrorScreenTimePage() {
                return ((BeatsPEventMessage) this.instance).getMirrorScreenTimePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public int getNotifyPage() {
                return ((BeatsPEventMessage) this.instance).getNotifyPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public int getSettingBacklightPage() {
                return ((BeatsPEventMessage) this.instance).getSettingBacklightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public int getSettingPage() {
                return ((BeatsPEventMessage) this.instance).getSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public int getSettingScreenLockPage() {
                return ((BeatsPEventMessage) this.instance).getSettingScreenLockPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public int getSettingWatchfacePage() {
                return ((BeatsPEventMessage) this.instance).getSettingWatchfacePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public int getStatusPage1() {
                return ((BeatsPEventMessage) this.instance).getStatusPage1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public int getStatusPage2() {
                return ((BeatsPEventMessage) this.instance).getStatusPage2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public int getStopwatchNum() {
                return ((BeatsPEventMessage) this.instance).getStopwatchNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public int getTimerCountdownPage() {
                return ((BeatsPEventMessage) this.instance).getTimerCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public int getTimerPage() {
                return ((BeatsPEventMessage) this.instance).getTimerPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public int getTimerStopwatchPage() {
                return ((BeatsPEventMessage) this.instance).getTimerStopwatchPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public int getWeatherPage() {
                return ((BeatsPEventMessage) this.instance).getWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public boolean hasAlarmPage() {
                return ((BeatsPEventMessage) this.instance).hasAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public boolean hasAlipayCode128Num() {
                return ((BeatsPEventMessage) this.instance).hasAlipayCode128Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public boolean hasAlipayQRCodeNum() {
                return ((BeatsPEventMessage) this.instance).hasAlipayQRCodeNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public boolean hasCountdownNum() {
                return ((BeatsPEventMessage) this.instance).hasCountdownNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public boolean hasDial2DND() {
                return ((BeatsPEventMessage) this.instance).hasDial2DND();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public boolean hasDial2MainItem1() {
                return ((BeatsPEventMessage) this.instance).hasDial2MainItem1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public boolean hasDial2Notify() {
                return ((BeatsPEventMessage) this.instance).hasDial2Notify();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public boolean hasDialId() {
                return ((BeatsPEventMessage) this.instance).hasDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public boolean hasMirrorScreenHeartratePage() {
                return ((BeatsPEventMessage) this.instance).hasMirrorScreenHeartratePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public boolean hasMirrorScreenMainPage() {
                return ((BeatsPEventMessage) this.instance).hasMirrorScreenMainPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public boolean hasMirrorScreenTimePage() {
                return ((BeatsPEventMessage) this.instance).hasMirrorScreenTimePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public boolean hasNotifyPage() {
                return ((BeatsPEventMessage) this.instance).hasNotifyPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public boolean hasSettingBacklightPage() {
                return ((BeatsPEventMessage) this.instance).hasSettingBacklightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public boolean hasSettingPage() {
                return ((BeatsPEventMessage) this.instance).hasSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public boolean hasSettingScreenLockPage() {
                return ((BeatsPEventMessage) this.instance).hasSettingScreenLockPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public boolean hasSettingWatchfacePage() {
                return ((BeatsPEventMessage) this.instance).hasSettingWatchfacePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public boolean hasStatusPage1() {
                return ((BeatsPEventMessage) this.instance).hasStatusPage1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public boolean hasStatusPage2() {
                return ((BeatsPEventMessage) this.instance).hasStatusPage2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public boolean hasStopwatchNum() {
                return ((BeatsPEventMessage) this.instance).hasStopwatchNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public boolean hasTimerCountdownPage() {
                return ((BeatsPEventMessage) this.instance).hasTimerCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public boolean hasTimerPage() {
                return ((BeatsPEventMessage) this.instance).hasTimerPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public boolean hasTimerStopwatchPage() {
                return ((BeatsPEventMessage) this.instance).hasTimerStopwatchPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
            public boolean hasWeatherPage() {
                return ((BeatsPEventMessage) this.instance).hasWeatherPage();
            }

            public Builder setAlarmPage(int i) {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).setAlarmPage(i);
                return this;
            }

            public Builder setAlipayCode128Num(int i) {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).setAlipayCode128Num(i);
                return this;
            }

            public Builder setAlipayQRCodeNum(int i) {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).setAlipayQRCodeNum(i);
                return this;
            }

            public Builder setCountdownNum(int i) {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).setCountdownNum(i);
                return this;
            }

            public Builder setDial2DND(int i) {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).setDial2DND(i);
                return this;
            }

            public Builder setDial2MainItem1(int i) {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).setDial2MainItem1(i);
                return this;
            }

            public Builder setDial2Notify(int i) {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).setDial2Notify(i);
                return this;
            }

            public Builder setDialId(int i) {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).setDialId(i);
                return this;
            }

            public Builder setMirrorScreenHeartratePage(int i) {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).setMirrorScreenHeartratePage(i);
                return this;
            }

            public Builder setMirrorScreenMainPage(int i) {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).setMirrorScreenMainPage(i);
                return this;
            }

            public Builder setMirrorScreenTimePage(int i) {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).setMirrorScreenTimePage(i);
                return this;
            }

            public Builder setNotifyPage(int i) {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).setNotifyPage(i);
                return this;
            }

            public Builder setSettingBacklightPage(int i) {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).setSettingBacklightPage(i);
                return this;
            }

            public Builder setSettingPage(int i) {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).setSettingPage(i);
                return this;
            }

            public Builder setSettingScreenLockPage(int i) {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).setSettingScreenLockPage(i);
                return this;
            }

            public Builder setSettingWatchfacePage(int i) {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).setSettingWatchfacePage(i);
                return this;
            }

            public Builder setStatusPage1(int i) {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).setStatusPage1(i);
                return this;
            }

            public Builder setStatusPage2(int i) {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).setStatusPage2(i);
                return this;
            }

            public Builder setStopwatchNum(int i) {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).setStopwatchNum(i);
                return this;
            }

            public Builder setTimerCountdownPage(int i) {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).setTimerCountdownPage(i);
                return this;
            }

            public Builder setTimerPage(int i) {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).setTimerPage(i);
                return this;
            }

            public Builder setTimerStopwatchPage(int i) {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).setTimerStopwatchPage(i);
                return this;
            }

            public Builder setWeatherPage(int i) {
                copyOnWrite();
                ((BeatsPEventMessage) this.instance).setWeatherPage(i);
                return this;
            }

            private Builder() {
                super(BeatsPEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            BeatsPEventMessage beatsPEventMessage = new BeatsPEventMessage();
            DEFAULT_INSTANCE = beatsPEventMessage;
            GeneratedMessageLite.registerDefaultInstance(BeatsPEventMessage.class, beatsPEventMessage);
        }

        private BeatsPEventMessage() {
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

        public static BeatsPEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BeatsPEventMessage parseDelimitedFrom(InputStream inputStream) {
            return (BeatsPEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BeatsPEventMessage parseFrom(ByteBuffer byteBuffer) {
            return (BeatsPEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<BeatsPEventMessage> parser() {
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
                    return new BeatsPEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0000\u0014\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f\u0011ᔋ\u0010\u0012ᔋ\u0011\u0013ᔋ\u0012\u0014ᔋ\u0013\u0015ဋ\u0014\u0016ဋ\u0015\u0017ဋ\u0016", new Object[]{"bitField0_", "dial2DND_", "dial2Notify_", "dial2MainItem1_", "statusPage1_", "statusPage2_", "notifyPage_", "weatherPage_", "alarmPage_", "timerPage_", "timerStopwatchPage_", "timerCountdownPage_", "settingPage_", "settingWatchfacePage_", "settingScreenLockPage_", "settingBacklightPage_", "stopwatchNum_", "countdownNum_", "mirrorScreenMainPage_", "mirrorScreenHeartratePage_", "mirrorScreenTimePage_", "alipayQRCodeNum_", "alipayCode128Num_", "dialId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<BeatsPEventMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (BeatsPEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public int getAlarmPage() {
            return this.alarmPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public int getAlipayCode128Num() {
            return this.alipayCode128Num_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public int getAlipayQRCodeNum() {
            return this.alipayQRCodeNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public int getCountdownNum() {
            return this.countdownNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public int getDial2DND() {
            return this.dial2DND_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public int getDial2MainItem1() {
            return this.dial2MainItem1_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public int getDial2Notify() {
            return this.dial2Notify_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public int getDialId() {
            return this.dialId_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public int getMirrorScreenHeartratePage() {
            return this.mirrorScreenHeartratePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public int getMirrorScreenMainPage() {
            return this.mirrorScreenMainPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public int getMirrorScreenTimePage() {
            return this.mirrorScreenTimePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public int getNotifyPage() {
            return this.notifyPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public int getSettingBacklightPage() {
            return this.settingBacklightPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public int getSettingPage() {
            return this.settingPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public int getSettingScreenLockPage() {
            return this.settingScreenLockPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public int getSettingWatchfacePage() {
            return this.settingWatchfacePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public int getStatusPage1() {
            return this.statusPage1_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public int getStatusPage2() {
            return this.statusPage2_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public int getStopwatchNum() {
            return this.stopwatchNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public int getTimerCountdownPage() {
            return this.timerCountdownPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public int getTimerPage() {
            return this.timerPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public int getTimerStopwatchPage() {
            return this.timerStopwatchPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public int getWeatherPage() {
            return this.weatherPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public boolean hasAlarmPage() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public boolean hasAlipayCode128Num() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public boolean hasAlipayQRCodeNum() {
            return (this.bitField0_ & EventRecurrence.TH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public boolean hasCountdownNum() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public boolean hasDial2DND() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public boolean hasDial2MainItem1() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public boolean hasDial2Notify() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public boolean hasDialId() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public boolean hasMirrorScreenHeartratePage() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public boolean hasMirrorScreenMainPage() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public boolean hasMirrorScreenTimePage() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public boolean hasNotifyPage() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public boolean hasSettingBacklightPage() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public boolean hasSettingPage() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public boolean hasSettingScreenLockPage() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public boolean hasSettingWatchfacePage() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public boolean hasStatusPage1() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public boolean hasStatusPage2() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public boolean hasStopwatchNum() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public boolean hasTimerCountdownPage() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public boolean hasTimerPage() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public boolean hasTimerStopwatchPage() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPEventMessageOrBuilder
        public boolean hasWeatherPage() {
            return (this.bitField0_ & 64) != 0;
        }

        public static Builder newBuilder(BeatsPEventMessage beatsPEventMessage) {
            return DEFAULT_INSTANCE.createBuilder(beatsPEventMessage);
        }

        public static BeatsPEventMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (BeatsPEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static BeatsPEventMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (BeatsPEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static BeatsPEventMessage parseFrom(ByteString byteString) {
            return (BeatsPEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BeatsPEventMessage parseFrom(ByteString byteString, t tVar) {
            return (BeatsPEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static BeatsPEventMessage parseFrom(byte[] bArr) {
            return (BeatsPEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BeatsPEventMessage parseFrom(byte[] bArr, t tVar) {
            return (BeatsPEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static BeatsPEventMessage parseFrom(InputStream inputStream) {
            return (BeatsPEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BeatsPEventMessage parseFrom(InputStream inputStream, t tVar) {
            return (BeatsPEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static BeatsPEventMessage parseFrom(j jVar) {
            return (BeatsPEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static BeatsPEventMessage parseFrom(j jVar, t tVar) {
            return (BeatsPEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface BeatsPEventMessageOrBuilder extends bsf {
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

    public static final class BeatsPStatisticsMessage extends GeneratedMessageLite<BeatsPStatisticsMessage, Builder> implements BeatsPStatisticsMessageOrBuilder {
        public static final int BACKLIGHTLEVEL_FIELD_NUMBER = 3;
        public static final int BASE_FIELD_NUMBER = 1;
        private static final BeatsPStatisticsMessage DEFAULT_INSTANCE;
        public static final int EVENT_FIELD_NUMBER = 5;
        public static final int NFC_FIELD_NUMBER = 6;
        private static volatile vkh<BeatsPStatisticsMessage> PARSER = null;
        public static final int SCREENLOCK_FIELD_NUMBER = 4;
        public static final int SILENCEMODE_FIELD_NUMBER = 2;
        private int backlightLevel_;
        private StatisBase.StatisBaseMessage base_;
        private int bitField0_;
        private BeatsPEventMessage event_;
        private byte memoizedIsInitialized = 2;
        private Nfc.NfcMessage nfc_;
        private boolean screenLock_;
        private int silenceMode_;

        public static final class Builder extends GeneratedMessageLite.a<BeatsPStatisticsMessage, Builder> implements BeatsPStatisticsMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBacklightLevel() {
                copyOnWrite();
                ((BeatsPStatisticsMessage) this.instance).clearBacklightLevel();
                return this;
            }

            public Builder clearBase() {
                copyOnWrite();
                ((BeatsPStatisticsMessage) this.instance).clearBase();
                return this;
            }

            public Builder clearEvent() {
                copyOnWrite();
                ((BeatsPStatisticsMessage) this.instance).clearEvent();
                return this;
            }

            public Builder clearNfc() {
                copyOnWrite();
                ((BeatsPStatisticsMessage) this.instance).clearNfc();
                return this;
            }

            public Builder clearScreenLock() {
                copyOnWrite();
                ((BeatsPStatisticsMessage) this.instance).clearScreenLock();
                return this;
            }

            public Builder clearSilenceMode() {
                copyOnWrite();
                ((BeatsPStatisticsMessage) this.instance).clearSilenceMode();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPStatisticsMessageOrBuilder
            public int getBacklightLevel() {
                return ((BeatsPStatisticsMessage) this.instance).getBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPStatisticsMessageOrBuilder
            public StatisBase.StatisBaseMessage getBase() {
                return ((BeatsPStatisticsMessage) this.instance).getBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPStatisticsMessageOrBuilder
            public BeatsPEventMessage getEvent() {
                return ((BeatsPStatisticsMessage) this.instance).getEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPStatisticsMessageOrBuilder
            public Nfc.NfcMessage getNfc() {
                return ((BeatsPStatisticsMessage) this.instance).getNfc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPStatisticsMessageOrBuilder
            public boolean getScreenLock() {
                return ((BeatsPStatisticsMessage) this.instance).getScreenLock();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPStatisticsMessageOrBuilder
            public SilenceModeOuterClass.SilenceMode getSilenceMode() {
                return ((BeatsPStatisticsMessage) this.instance).getSilenceMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPStatisticsMessageOrBuilder
            public boolean hasBacklightLevel() {
                return ((BeatsPStatisticsMessage) this.instance).hasBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPStatisticsMessageOrBuilder
            public boolean hasBase() {
                return ((BeatsPStatisticsMessage) this.instance).hasBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPStatisticsMessageOrBuilder
            public boolean hasEvent() {
                return ((BeatsPStatisticsMessage) this.instance).hasEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPStatisticsMessageOrBuilder
            public boolean hasNfc() {
                return ((BeatsPStatisticsMessage) this.instance).hasNfc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPStatisticsMessageOrBuilder
            public boolean hasScreenLock() {
                return ((BeatsPStatisticsMessage) this.instance).hasScreenLock();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPStatisticsMessageOrBuilder
            public boolean hasSilenceMode() {
                return ((BeatsPStatisticsMessage) this.instance).hasSilenceMode();
            }

            public Builder mergeBase(StatisBase.StatisBaseMessage statisBaseMessage) {
                copyOnWrite();
                ((BeatsPStatisticsMessage) this.instance).mergeBase(statisBaseMessage);
                return this;
            }

            public Builder mergeEvent(BeatsPEventMessage beatsPEventMessage) {
                copyOnWrite();
                ((BeatsPStatisticsMessage) this.instance).mergeEvent(beatsPEventMessage);
                return this;
            }

            public Builder mergeNfc(Nfc.NfcMessage nfcMessage) {
                copyOnWrite();
                ((BeatsPStatisticsMessage) this.instance).mergeNfc(nfcMessage);
                return this;
            }

            public Builder setBacklightLevel(int i) {
                copyOnWrite();
                ((BeatsPStatisticsMessage) this.instance).setBacklightLevel(i);
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage statisBaseMessage) {
                copyOnWrite();
                ((BeatsPStatisticsMessage) this.instance).setBase(statisBaseMessage);
                return this;
            }

            public Builder setEvent(BeatsPEventMessage beatsPEventMessage) {
                copyOnWrite();
                ((BeatsPStatisticsMessage) this.instance).setEvent(beatsPEventMessage);
                return this;
            }

            public Builder setNfc(Nfc.NfcMessage nfcMessage) {
                copyOnWrite();
                ((BeatsPStatisticsMessage) this.instance).setNfc(nfcMessage);
                return this;
            }

            public Builder setScreenLock(boolean z) {
                copyOnWrite();
                ((BeatsPStatisticsMessage) this.instance).setScreenLock(z);
                return this;
            }

            public Builder setSilenceMode(SilenceModeOuterClass.SilenceMode silenceMode) {
                copyOnWrite();
                ((BeatsPStatisticsMessage) this.instance).setSilenceMode(silenceMode);
                return this;
            }

            private Builder() {
                super(BeatsPStatisticsMessage.DEFAULT_INSTANCE);
            }

            public Builder setBase(StatisBase.StatisBaseMessage.Builder builder) {
                copyOnWrite();
                ((BeatsPStatisticsMessage) this.instance).setBase(builder.build());
                return this;
            }

            public Builder setEvent(BeatsPEventMessage.Builder builder) {
                copyOnWrite();
                ((BeatsPStatisticsMessage) this.instance).setEvent(builder.build());
                return this;
            }

            public Builder setNfc(Nfc.NfcMessage.Builder builder) {
                copyOnWrite();
                ((BeatsPStatisticsMessage) this.instance).setNfc(builder.build());
                return this;
            }
        }

        static {
            BeatsPStatisticsMessage beatsPStatisticsMessage = new BeatsPStatisticsMessage();
            DEFAULT_INSTANCE = beatsPStatisticsMessage;
            GeneratedMessageLite.registerDefaultInstance(BeatsPStatisticsMessage.class, beatsPStatisticsMessage);
        }

        private BeatsPStatisticsMessage() {
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

        public static BeatsPStatisticsMessage getDefaultInstance() {
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
        public void mergeEvent(BeatsPEventMessage beatsPEventMessage) {
            beatsPEventMessage.getClass();
            BeatsPEventMessage beatsPEventMessage2 = this.event_;
            if (beatsPEventMessage2 == null || beatsPEventMessage2 == BeatsPEventMessage.getDefaultInstance()) {
                this.event_ = beatsPEventMessage;
            } else {
                this.event_ = BeatsPEventMessage.newBuilder(this.event_).mergeFrom(beatsPEventMessage).buildPartial();
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

        public static BeatsPStatisticsMessage parseDelimitedFrom(InputStream inputStream) {
            return (BeatsPStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BeatsPStatisticsMessage parseFrom(ByteBuffer byteBuffer) {
            return (BeatsPStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<BeatsPStatisticsMessage> parser() {
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
        public void setEvent(BeatsPEventMessage beatsPEventMessage) {
            beatsPEventMessage.getClass();
            this.event_ = beatsPEventMessage;
            this.bitField0_ |= 16;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNfc(Nfc.NfcMessage nfcMessage) {
            nfcMessage.getClass();
            this.nfc_ = nfcMessage;
            this.bitField0_ |= 32;
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
                    return new BeatsPStatisticsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0006\u0001ᔉ\u0000\u0002ᔌ\u0001\u0003ᔋ\u0002\u0004ᔇ\u0003\u0005ᐉ\u0004\u0006ᐉ\u0005", new Object[]{"bitField0_", "base_", "silenceMode_", SilenceModeOuterClass.SilenceMode.internalGetVerifier(), "backlightLevel_", "screenLock_", "event_", "nfc_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<BeatsPStatisticsMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (BeatsPStatisticsMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPStatisticsMessageOrBuilder
        public int getBacklightLevel() {
            return this.backlightLevel_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPStatisticsMessageOrBuilder
        public StatisBase.StatisBaseMessage getBase() {
            StatisBase.StatisBaseMessage statisBaseMessage = this.base_;
            return statisBaseMessage == null ? StatisBase.StatisBaseMessage.getDefaultInstance() : statisBaseMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPStatisticsMessageOrBuilder
        public BeatsPEventMessage getEvent() {
            BeatsPEventMessage beatsPEventMessage = this.event_;
            return beatsPEventMessage == null ? BeatsPEventMessage.getDefaultInstance() : beatsPEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPStatisticsMessageOrBuilder
        public Nfc.NfcMessage getNfc() {
            Nfc.NfcMessage nfcMessage = this.nfc_;
            return nfcMessage == null ? Nfc.NfcMessage.getDefaultInstance() : nfcMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPStatisticsMessageOrBuilder
        public boolean getScreenLock() {
            return this.screenLock_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPStatisticsMessageOrBuilder
        public SilenceModeOuterClass.SilenceMode getSilenceMode() {
            SilenceModeOuterClass.SilenceMode silenceModeForNumber = SilenceModeOuterClass.SilenceMode.forNumber(this.silenceMode_);
            return silenceModeForNumber == null ? SilenceModeOuterClass.SilenceMode.OFF : silenceModeForNumber;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPStatisticsMessageOrBuilder
        public boolean hasBacklightLevel() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPStatisticsMessageOrBuilder
        public boolean hasBase() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPStatisticsMessageOrBuilder
        public boolean hasEvent() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPStatisticsMessageOrBuilder
        public boolean hasNfc() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPStatisticsMessageOrBuilder
        public boolean hasScreenLock() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Beatsp.BeatsPStatisticsMessageOrBuilder
        public boolean hasSilenceMode() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(BeatsPStatisticsMessage beatsPStatisticsMessage) {
            return DEFAULT_INSTANCE.createBuilder(beatsPStatisticsMessage);
        }

        public static BeatsPStatisticsMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (BeatsPStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static BeatsPStatisticsMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (BeatsPStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static BeatsPStatisticsMessage parseFrom(ByteString byteString) {
            return (BeatsPStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static BeatsPStatisticsMessage parseFrom(ByteString byteString, t tVar) {
            return (BeatsPStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static BeatsPStatisticsMessage parseFrom(byte[] bArr) {
            return (BeatsPStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static BeatsPStatisticsMessage parseFrom(byte[] bArr, t tVar) {
            return (BeatsPStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static BeatsPStatisticsMessage parseFrom(InputStream inputStream) {
            return (BeatsPStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static BeatsPStatisticsMessage parseFrom(InputStream inputStream, t tVar) {
            return (BeatsPStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static BeatsPStatisticsMessage parseFrom(j jVar) {
            return (BeatsPStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static BeatsPStatisticsMessage parseFrom(j jVar, t tVar) {
            return (BeatsPStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface BeatsPStatisticsMessageOrBuilder extends bsf {
        int getBacklightLevel();

        StatisBase.StatisBaseMessage getBase();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        BeatsPEventMessage getEvent();

        Nfc.NfcMessage getNfc();

        boolean getScreenLock();

        SilenceModeOuterClass.SilenceMode getSilenceMode();

        boolean hasBacklightLevel();

        boolean hasBase();

        boolean hasEvent();

        boolean hasNfc();

        boolean hasScreenLock();

        boolean hasSilenceMode();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    private Beatsp() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}
