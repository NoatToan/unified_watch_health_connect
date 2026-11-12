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
public final class TimexOrigin {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.TimexOrigin$1, reason: invalid class name */
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

    public static final class TimexEventMessage extends GeneratedMessageLite<TimexEventMessage, Builder> implements TimexEventMessageOrBuilder {
        public static final int ACTIVITYHR_FIELD_NUMBER = 7;
        public static final int ACTIVITYMENU_FIELD_NUMBER = 6;
        public static final int ALARMOFFPAGE_FIELD_NUMBER = 14;
        public static final int ALARMONPAGE_FIELD_NUMBER = 13;
        public static final int ALARMPAGE_FIELD_NUMBER = 12;
        public static final int ALARMREMINDERCLOSE_FIELD_NUMBER = 36;
        public static final int ALARMREMINDERLATERON_FIELD_NUMBER = 35;
        public static final int ALIPAYCODE128NUM_FIELD_NUMBER = 42;
        public static final int ALIPAYQRCODENUM_FIELD_NUMBER = 41;
        public static final int APPNOTIFREMINDDISCOUNT_FIELD_NUMBER = 31;
        public static final int CALLINGREMINDDISCOUNT_FIELD_NUMBER = 32;
        public static final int COACHPAGE_FIELD_NUMBER = 9;
        public static final int COMPASSPAGE_FIELD_NUMBER = 28;
        public static final int COUNTDOWNNUM_FIELD_NUMBER = 30;
        private static final TimexEventMessage DEFAULT_INSTANCE;
        public static final int DIAL2DND_FIELD_NUMBER = 3;
        public static final int DIAL2MAINITEM1_FIELD_NUMBER = 5;
        public static final int DIAL2NOTIFY_FIELD_NUMBER = 4;
        public static final int DIALID_FIELD_NUMBER = 43;
        public static final int DISCONNECTDISCOUNT_FIELD_NUMBER = 34;
        public static final int FACTORYRESETPAGE_FIELD_NUMBER = 40;
        public static final int FINDPHONEFAIL_FIELD_NUMBER = 38;
        public static final int FINDPHONESUCC_FIELD_NUMBER = 37;
        public static final int LCDONBECAUSEOFEVENT_FIELD_NUMBER = 2;
        public static final int LCDONBECAUSEOFPRESS_FIELD_NUMBER = 1;
        public static final int LONGSITREMINDDISCOUNT_FIELD_NUMBER = 33;
        public static final int MUSICPAGE_FIELD_NUMBER = 15;
        private static volatile Parser<TimexEventMessage> PARSER = null;
        public static final int SETPOWEROFFCOUNT_FIELD_NUMBER = 39;
        public static final int SETTINGBACKLIGHTPAGE_FIELD_NUMBER = 19;
        public static final int SETTINGLONGPRESSPAGE_FIELD_NUMBER = 18;
        public static final int SETTINGPAGE_FIELD_NUMBER = 16;
        public static final int SETTINGWATCHFACEPAGE_FIELD_NUMBER = 17;
        public static final int SKIPGPSLOCATIONNUM_FIELD_NUMBER = 21;
        public static final int SPORTGPSFINDNUM_FIELD_NUMBER = 22;
        public static final int SPORTGPSLOCATIONWAITTIME_FIELD_NUMBER = 23;
        public static final int SPORTLINKLOSTNUM_FIELD_NUMBER = 24;
        public static final int SPORTPAGE_FIELD_NUMBER = 8;
        public static final int SPORTRECONNECTNUM_FIELD_NUMBER = 27;
        public static final int SPORTSETTINGAUTOLAPNUM_FIELD_NUMBER = 25;
        public static final int SPORTSETTINGAUTOPAUSENUM_FIELD_NUMBER = 26;
        public static final int SPORTSETTINGPAGE_FIELD_NUMBER = 10;
        public static final int STOPWATCHNUM_FIELD_NUMBER = 29;
        public static final int WAITGPSLOCATIONNUM_FIELD_NUMBER = 20;
        public static final int WEATHERPAGE_FIELD_NUMBER = 11;
        private int activityHR_;
        private int activityMenu_;
        private int alarmOffPage_;
        private int alarmOnPage_;
        private int alarmPage_;
        private int alarmReminderClose_;
        private int alarmReminderLaterOn_;
        private int alipayCode128Num_;
        private int alipayQRCodeNum_;
        private int appNotifRemindDisCount_;
        private int bitField0_;
        private int bitField1_;
        private int callingRemindDisCount_;
        private int coachPage_;
        private int compassPage_;
        private int countdownNum_;
        private int dial2DND_;
        private int dial2MainItem1_;
        private int dial2Notify_;
        private int dialId_;
        private int disconnectDisCount_;
        private int factoryResetPage_;
        private int findPhoneFail_;
        private int findPhoneSucc_;
        private int lcdOnBecauseOfEvent_;
        private int lcdOnBecauseOfPress_;
        private int longSitRemindDisCount_;
        private byte memoizedIsInitialized = 2;
        private int musicPage_;
        private int setPowerOffCount_;
        private int settingBacklightPage_;
        private int settingLongpressPage_;
        private int settingPage_;
        private int settingWatchfacePage_;
        private int skipGpsLocationNum_;
        private int sportGPSLocationWaitTime_;
        private int sportGpsFindNum_;
        private int sportLinkLostNum_;
        private int sportPage_;
        private int sportReconnectNum_;
        private int sportSettingAutoLapNum_;
        private int sportSettingAutoPauseNum_;
        private int sportSettingPage_;
        private int stopwatchNum_;
        private int waitGpsLocationNum_;
        private int weatherPage_;

        public static final class Builder extends GeneratedMessageLite.Builder<TimexEventMessage, Builder> implements TimexEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearActivityHR() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearActivityHR();
                return this;
            }

            public Builder clearActivityMenu() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearActivityMenu();
                return this;
            }

            public Builder clearAlarmOffPage() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearAlarmOffPage();
                return this;
            }

            public Builder clearAlarmOnPage() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearAlarmOnPage();
                return this;
            }

            public Builder clearAlarmPage() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearAlarmPage();
                return this;
            }

            public Builder clearAlarmReminderClose() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearAlarmReminderClose();
                return this;
            }

            public Builder clearAlarmReminderLaterOn() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearAlarmReminderLaterOn();
                return this;
            }

            public Builder clearAlipayCode128Num() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearAlipayCode128Num();
                return this;
            }

            public Builder clearAlipayQRCodeNum() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearAlipayQRCodeNum();
                return this;
            }

            public Builder clearAppNotifRemindDisCount() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearAppNotifRemindDisCount();
                return this;
            }

            public Builder clearCallingRemindDisCount() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearCallingRemindDisCount();
                return this;
            }

            public Builder clearCoachPage() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearCoachPage();
                return this;
            }

            public Builder clearCompassPage() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearCompassPage();
                return this;
            }

            public Builder clearCountdownNum() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearCountdownNum();
                return this;
            }

            public Builder clearDial2DND() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearDial2DND();
                return this;
            }

            public Builder clearDial2MainItem1() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearDial2MainItem1();
                return this;
            }

            public Builder clearDial2Notify() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearDial2Notify();
                return this;
            }

            public Builder clearDialId() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearDialId();
                return this;
            }

            public Builder clearDisconnectDisCount() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearDisconnectDisCount();
                return this;
            }

            public Builder clearFactoryResetPage() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearFactoryResetPage();
                return this;
            }

            public Builder clearFindPhoneFail() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearFindPhoneFail();
                return this;
            }

            public Builder clearFindPhoneSucc() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearFindPhoneSucc();
                return this;
            }

            public Builder clearLcdOnBecauseOfEvent() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearLcdOnBecauseOfEvent();
                return this;
            }

            public Builder clearLcdOnBecauseOfPress() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearLcdOnBecauseOfPress();
                return this;
            }

            public Builder clearLongSitRemindDisCount() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearLongSitRemindDisCount();
                return this;
            }

            public Builder clearMusicPage() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearMusicPage();
                return this;
            }

            public Builder clearSetPowerOffCount() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearSetPowerOffCount();
                return this;
            }

            public Builder clearSettingBacklightPage() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearSettingBacklightPage();
                return this;
            }

            public Builder clearSettingLongpressPage() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearSettingLongpressPage();
                return this;
            }

            public Builder clearSettingPage() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearSettingPage();
                return this;
            }

            public Builder clearSettingWatchfacePage() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearSettingWatchfacePage();
                return this;
            }

            public Builder clearSkipGpsLocationNum() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearSkipGpsLocationNum();
                return this;
            }

            public Builder clearSportGPSLocationWaitTime() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearSportGPSLocationWaitTime();
                return this;
            }

            public Builder clearSportGpsFindNum() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearSportGpsFindNum();
                return this;
            }

            public Builder clearSportLinkLostNum() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearSportLinkLostNum();
                return this;
            }

            public Builder clearSportPage() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearSportPage();
                return this;
            }

            public Builder clearSportReconnectNum() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearSportReconnectNum();
                return this;
            }

            public Builder clearSportSettingAutoLapNum() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearSportSettingAutoLapNum();
                return this;
            }

            public Builder clearSportSettingAutoPauseNum() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearSportSettingAutoPauseNum();
                return this;
            }

            public Builder clearSportSettingPage() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearSportSettingPage();
                return this;
            }

            public Builder clearStopwatchNum() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearStopwatchNum();
                return this;
            }

            public Builder clearWaitGpsLocationNum() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearWaitGpsLocationNum();
                return this;
            }

            public Builder clearWeatherPage() {
                copyOnWrite();
                ((TimexEventMessage) this.instance).clearWeatherPage();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getActivityHR() {
                return ((TimexEventMessage) this.instance).getActivityHR();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getActivityMenu() {
                return ((TimexEventMessage) this.instance).getActivityMenu();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getAlarmOffPage() {
                return ((TimexEventMessage) this.instance).getAlarmOffPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getAlarmOnPage() {
                return ((TimexEventMessage) this.instance).getAlarmOnPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getAlarmPage() {
                return ((TimexEventMessage) this.instance).getAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getAlarmReminderClose() {
                return ((TimexEventMessage) this.instance).getAlarmReminderClose();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getAlarmReminderLaterOn() {
                return ((TimexEventMessage) this.instance).getAlarmReminderLaterOn();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getAlipayCode128Num() {
                return ((TimexEventMessage) this.instance).getAlipayCode128Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getAlipayQRCodeNum() {
                return ((TimexEventMessage) this.instance).getAlipayQRCodeNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getAppNotifRemindDisCount() {
                return ((TimexEventMessage) this.instance).getAppNotifRemindDisCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getCallingRemindDisCount() {
                return ((TimexEventMessage) this.instance).getCallingRemindDisCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getCoachPage() {
                return ((TimexEventMessage) this.instance).getCoachPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getCompassPage() {
                return ((TimexEventMessage) this.instance).getCompassPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getCountdownNum() {
                return ((TimexEventMessage) this.instance).getCountdownNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getDial2DND() {
                return ((TimexEventMessage) this.instance).getDial2DND();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getDial2MainItem1() {
                return ((TimexEventMessage) this.instance).getDial2MainItem1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getDial2Notify() {
                return ((TimexEventMessage) this.instance).getDial2Notify();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getDialId() {
                return ((TimexEventMessage) this.instance).getDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getDisconnectDisCount() {
                return ((TimexEventMessage) this.instance).getDisconnectDisCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getFactoryResetPage() {
                return ((TimexEventMessage) this.instance).getFactoryResetPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getFindPhoneFail() {
                return ((TimexEventMessage) this.instance).getFindPhoneFail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getFindPhoneSucc() {
                return ((TimexEventMessage) this.instance).getFindPhoneSucc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getLcdOnBecauseOfEvent() {
                return ((TimexEventMessage) this.instance).getLcdOnBecauseOfEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getLcdOnBecauseOfPress() {
                return ((TimexEventMessage) this.instance).getLcdOnBecauseOfPress();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getLongSitRemindDisCount() {
                return ((TimexEventMessage) this.instance).getLongSitRemindDisCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getMusicPage() {
                return ((TimexEventMessage) this.instance).getMusicPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getSetPowerOffCount() {
                return ((TimexEventMessage) this.instance).getSetPowerOffCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getSettingBacklightPage() {
                return ((TimexEventMessage) this.instance).getSettingBacklightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getSettingLongpressPage() {
                return ((TimexEventMessage) this.instance).getSettingLongpressPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getSettingPage() {
                return ((TimexEventMessage) this.instance).getSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getSettingWatchfacePage() {
                return ((TimexEventMessage) this.instance).getSettingWatchfacePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getSkipGpsLocationNum() {
                return ((TimexEventMessage) this.instance).getSkipGpsLocationNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getSportGPSLocationWaitTime() {
                return ((TimexEventMessage) this.instance).getSportGPSLocationWaitTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getSportGpsFindNum() {
                return ((TimexEventMessage) this.instance).getSportGpsFindNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getSportLinkLostNum() {
                return ((TimexEventMessage) this.instance).getSportLinkLostNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getSportPage() {
                return ((TimexEventMessage) this.instance).getSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getSportReconnectNum() {
                return ((TimexEventMessage) this.instance).getSportReconnectNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getSportSettingAutoLapNum() {
                return ((TimexEventMessage) this.instance).getSportSettingAutoLapNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getSportSettingAutoPauseNum() {
                return ((TimexEventMessage) this.instance).getSportSettingAutoPauseNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getSportSettingPage() {
                return ((TimexEventMessage) this.instance).getSportSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getStopwatchNum() {
                return ((TimexEventMessage) this.instance).getStopwatchNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getWaitGpsLocationNum() {
                return ((TimexEventMessage) this.instance).getWaitGpsLocationNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public int getWeatherPage() {
                return ((TimexEventMessage) this.instance).getWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasActivityHR() {
                return ((TimexEventMessage) this.instance).hasActivityHR();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasActivityMenu() {
                return ((TimexEventMessage) this.instance).hasActivityMenu();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasAlarmOffPage() {
                return ((TimexEventMessage) this.instance).hasAlarmOffPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasAlarmOnPage() {
                return ((TimexEventMessage) this.instance).hasAlarmOnPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasAlarmPage() {
                return ((TimexEventMessage) this.instance).hasAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasAlarmReminderClose() {
                return ((TimexEventMessage) this.instance).hasAlarmReminderClose();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasAlarmReminderLaterOn() {
                return ((TimexEventMessage) this.instance).hasAlarmReminderLaterOn();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasAlipayCode128Num() {
                return ((TimexEventMessage) this.instance).hasAlipayCode128Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasAlipayQRCodeNum() {
                return ((TimexEventMessage) this.instance).hasAlipayQRCodeNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasAppNotifRemindDisCount() {
                return ((TimexEventMessage) this.instance).hasAppNotifRemindDisCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasCallingRemindDisCount() {
                return ((TimexEventMessage) this.instance).hasCallingRemindDisCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasCoachPage() {
                return ((TimexEventMessage) this.instance).hasCoachPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasCompassPage() {
                return ((TimexEventMessage) this.instance).hasCompassPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasCountdownNum() {
                return ((TimexEventMessage) this.instance).hasCountdownNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasDial2DND() {
                return ((TimexEventMessage) this.instance).hasDial2DND();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasDial2MainItem1() {
                return ((TimexEventMessage) this.instance).hasDial2MainItem1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasDial2Notify() {
                return ((TimexEventMessage) this.instance).hasDial2Notify();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasDialId() {
                return ((TimexEventMessage) this.instance).hasDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasDisconnectDisCount() {
                return ((TimexEventMessage) this.instance).hasDisconnectDisCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasFactoryResetPage() {
                return ((TimexEventMessage) this.instance).hasFactoryResetPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasFindPhoneFail() {
                return ((TimexEventMessage) this.instance).hasFindPhoneFail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasFindPhoneSucc() {
                return ((TimexEventMessage) this.instance).hasFindPhoneSucc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfEvent() {
                return ((TimexEventMessage) this.instance).hasLcdOnBecauseOfEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfPress() {
                return ((TimexEventMessage) this.instance).hasLcdOnBecauseOfPress();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasLongSitRemindDisCount() {
                return ((TimexEventMessage) this.instance).hasLongSitRemindDisCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasMusicPage() {
                return ((TimexEventMessage) this.instance).hasMusicPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasSetPowerOffCount() {
                return ((TimexEventMessage) this.instance).hasSetPowerOffCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasSettingBacklightPage() {
                return ((TimexEventMessage) this.instance).hasSettingBacklightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasSettingLongpressPage() {
                return ((TimexEventMessage) this.instance).hasSettingLongpressPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasSettingPage() {
                return ((TimexEventMessage) this.instance).hasSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasSettingWatchfacePage() {
                return ((TimexEventMessage) this.instance).hasSettingWatchfacePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasSkipGpsLocationNum() {
                return ((TimexEventMessage) this.instance).hasSkipGpsLocationNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasSportGPSLocationWaitTime() {
                return ((TimexEventMessage) this.instance).hasSportGPSLocationWaitTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasSportGpsFindNum() {
                return ((TimexEventMessage) this.instance).hasSportGpsFindNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasSportLinkLostNum() {
                return ((TimexEventMessage) this.instance).hasSportLinkLostNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasSportPage() {
                return ((TimexEventMessage) this.instance).hasSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasSportReconnectNum() {
                return ((TimexEventMessage) this.instance).hasSportReconnectNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasSportSettingAutoLapNum() {
                return ((TimexEventMessage) this.instance).hasSportSettingAutoLapNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasSportSettingAutoPauseNum() {
                return ((TimexEventMessage) this.instance).hasSportSettingAutoPauseNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasSportSettingPage() {
                return ((TimexEventMessage) this.instance).hasSportSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasStopwatchNum() {
                return ((TimexEventMessage) this.instance).hasStopwatchNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasWaitGpsLocationNum() {
                return ((TimexEventMessage) this.instance).hasWaitGpsLocationNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
            public boolean hasWeatherPage() {
                return ((TimexEventMessage) this.instance).hasWeatherPage();
            }

            public Builder setActivityHR(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setActivityHR(value);
                return this;
            }

            public Builder setActivityMenu(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setActivityMenu(value);
                return this;
            }

            public Builder setAlarmOffPage(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setAlarmOffPage(value);
                return this;
            }

            public Builder setAlarmOnPage(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setAlarmOnPage(value);
                return this;
            }

            public Builder setAlarmPage(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setAlarmPage(value);
                return this;
            }

            public Builder setAlarmReminderClose(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setAlarmReminderClose(value);
                return this;
            }

            public Builder setAlarmReminderLaterOn(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setAlarmReminderLaterOn(value);
                return this;
            }

            public Builder setAlipayCode128Num(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setAlipayCode128Num(value);
                return this;
            }

            public Builder setAlipayQRCodeNum(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setAlipayQRCodeNum(value);
                return this;
            }

            public Builder setAppNotifRemindDisCount(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setAppNotifRemindDisCount(value);
                return this;
            }

            public Builder setCallingRemindDisCount(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setCallingRemindDisCount(value);
                return this;
            }

            public Builder setCoachPage(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setCoachPage(value);
                return this;
            }

            public Builder setCompassPage(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setCompassPage(value);
                return this;
            }

            public Builder setCountdownNum(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setCountdownNum(value);
                return this;
            }

            public Builder setDial2DND(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setDial2DND(value);
                return this;
            }

            public Builder setDial2MainItem1(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setDial2MainItem1(value);
                return this;
            }

            public Builder setDial2Notify(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setDial2Notify(value);
                return this;
            }

            public Builder setDialId(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setDialId(value);
                return this;
            }

            public Builder setDisconnectDisCount(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setDisconnectDisCount(value);
                return this;
            }

            public Builder setFactoryResetPage(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setFactoryResetPage(value);
                return this;
            }

            public Builder setFindPhoneFail(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setFindPhoneFail(value);
                return this;
            }

            public Builder setFindPhoneSucc(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setFindPhoneSucc(value);
                return this;
            }

            public Builder setLcdOnBecauseOfEvent(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setLcdOnBecauseOfEvent(value);
                return this;
            }

            public Builder setLcdOnBecauseOfPress(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setLcdOnBecauseOfPress(value);
                return this;
            }

            public Builder setLongSitRemindDisCount(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setLongSitRemindDisCount(value);
                return this;
            }

            public Builder setMusicPage(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setMusicPage(value);
                return this;
            }

            public Builder setSetPowerOffCount(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setSetPowerOffCount(value);
                return this;
            }

            public Builder setSettingBacklightPage(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setSettingBacklightPage(value);
                return this;
            }

            public Builder setSettingLongpressPage(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setSettingLongpressPage(value);
                return this;
            }

            public Builder setSettingPage(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setSettingPage(value);
                return this;
            }

            public Builder setSettingWatchfacePage(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setSettingWatchfacePage(value);
                return this;
            }

            public Builder setSkipGpsLocationNum(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setSkipGpsLocationNum(value);
                return this;
            }

            public Builder setSportGPSLocationWaitTime(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setSportGPSLocationWaitTime(value);
                return this;
            }

            public Builder setSportGpsFindNum(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setSportGpsFindNum(value);
                return this;
            }

            public Builder setSportLinkLostNum(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setSportLinkLostNum(value);
                return this;
            }

            public Builder setSportPage(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setSportPage(value);
                return this;
            }

            public Builder setSportReconnectNum(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setSportReconnectNum(value);
                return this;
            }

            public Builder setSportSettingAutoLapNum(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setSportSettingAutoLapNum(value);
                return this;
            }

            public Builder setSportSettingAutoPauseNum(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setSportSettingAutoPauseNum(value);
                return this;
            }

            public Builder setSportSettingPage(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setSportSettingPage(value);
                return this;
            }

            public Builder setStopwatchNum(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setStopwatchNum(value);
                return this;
            }

            public Builder setWaitGpsLocationNum(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setWaitGpsLocationNum(value);
                return this;
            }

            public Builder setWeatherPage(int value) {
                copyOnWrite();
                ((TimexEventMessage) this.instance).setWeatherPage(value);
                return this;
            }

            private Builder() {
                super(TimexEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            TimexEventMessage timexEventMessage = new TimexEventMessage();
            DEFAULT_INSTANCE = timexEventMessage;
            GeneratedMessageLite.registerDefaultInstance(TimexEventMessage.class, timexEventMessage);
        }

        private TimexEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearActivityHR() {
            this.bitField0_ &= -65;
            this.activityHR_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearActivityMenu() {
            this.bitField0_ &= -33;
            this.activityMenu_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmOffPage() {
            this.bitField0_ &= -8193;
            this.alarmOffPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmOnPage() {
            this.bitField0_ &= -4097;
            this.alarmOnPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmPage() {
            this.bitField0_ &= -2049;
            this.alarmPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmReminderClose() {
            this.bitField1_ &= -9;
            this.alarmReminderClose_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmReminderLaterOn() {
            this.bitField1_ &= -5;
            this.alarmReminderLaterOn_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCode128Num() {
            this.bitField1_ &= -513;
            this.alipayCode128Num_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRCodeNum() {
            this.bitField1_ &= -257;
            this.alipayQRCodeNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppNotifRemindDisCount() {
            this.bitField0_ &= -1073741825;
            this.appNotifRemindDisCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCallingRemindDisCount() {
            this.bitField0_ &= Integer.MAX_VALUE;
            this.callingRemindDisCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCoachPage() {
            this.bitField0_ &= -257;
            this.coachPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCompassPage() {
            this.bitField0_ &= -134217729;
            this.compassPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCountdownNum() {
            this.bitField0_ &= -536870913;
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
            this.bitField1_ &= -1025;
            this.dialId_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDisconnectDisCount() {
            this.bitField1_ &= -3;
            this.disconnectDisCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFactoryResetPage() {
            this.bitField1_ &= -129;
            this.factoryResetPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFindPhoneFail() {
            this.bitField1_ &= -33;
            this.findPhoneFail_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFindPhoneSucc() {
            this.bitField1_ &= -17;
            this.findPhoneSucc_ = 0;
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
        public void clearLongSitRemindDisCount() {
            this.bitField1_ &= -2;
            this.longSitRemindDisCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMusicPage() {
            this.bitField0_ &= -16385;
            this.musicPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSetPowerOffCount() {
            this.bitField1_ &= -65;
            this.setPowerOffCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSettingBacklightPage() {
            this.bitField0_ &= -262145;
            this.settingBacklightPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSettingLongpressPage() {
            this.bitField0_ &= -131073;
            this.settingLongpressPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSettingPage() {
            this.bitField0_ &= -32769;
            this.settingPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSettingWatchfacePage() {
            this.bitField0_ &= -65537;
            this.settingWatchfacePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSkipGpsLocationNum() {
            this.bitField0_ &= -1048577;
            this.skipGpsLocationNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportGPSLocationWaitTime() {
            this.bitField0_ &= -4194305;
            this.sportGPSLocationWaitTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportGpsFindNum() {
            this.bitField0_ &= -2097153;
            this.sportGpsFindNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportLinkLostNum() {
            this.bitField0_ &= -8388609;
            this.sportLinkLostNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportPage() {
            this.bitField0_ &= -129;
            this.sportPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportReconnectNum() {
            this.bitField0_ &= -67108865;
            this.sportReconnectNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportSettingAutoLapNum() {
            this.bitField0_ &= -16777217;
            this.sportSettingAutoLapNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportSettingAutoPauseNum() {
            this.bitField0_ &= -33554433;
            this.sportSettingAutoPauseNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportSettingPage() {
            this.bitField0_ &= -513;
            this.sportSettingPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStopwatchNum() {
            this.bitField0_ &= -268435457;
            this.stopwatchNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWaitGpsLocationNum() {
            this.bitField0_ &= -524289;
            this.waitGpsLocationNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWeatherPage() {
            this.bitField0_ &= -1025;
            this.weatherPage_ = 0;
        }

        public static TimexEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TimexEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (TimexEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static TimexEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (TimexEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<TimexEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActivityHR(int value) {
            this.bitField0_ |= 64;
            this.activityHR_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setActivityMenu(int value) {
            this.bitField0_ |= 32;
            this.activityMenu_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmOffPage(int value) {
            this.bitField0_ |= 8192;
            this.alarmOffPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmOnPage(int value) {
            this.bitField0_ |= 4096;
            this.alarmOnPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmPage(int value) {
            this.bitField0_ |= 2048;
            this.alarmPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmReminderClose(int value) {
            this.bitField1_ |= 8;
            this.alarmReminderClose_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmReminderLaterOn(int value) {
            this.bitField1_ |= 4;
            this.alarmReminderLaterOn_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCode128Num(int value) {
            this.bitField1_ |= 512;
            this.alipayCode128Num_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRCodeNum(int value) {
            this.bitField1_ |= 256;
            this.alipayQRCodeNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppNotifRemindDisCount(int value) {
            this.bitField0_ |= 1073741824;
            this.appNotifRemindDisCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallingRemindDisCount(int value) {
            this.bitField0_ |= Integer.MIN_VALUE;
            this.callingRemindDisCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCoachPage(int value) {
            this.bitField0_ |= 256;
            this.coachPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCompassPage(int value) {
            this.bitField0_ |= AMapEngineUtils.HALF_MAX_P20_WIDTH;
            this.compassPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCountdownNum(int value) {
            this.bitField0_ |= 536870912;
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
            this.bitField1_ |= 1024;
            this.dialId_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisconnectDisCount(int value) {
            this.bitField1_ |= 2;
            this.disconnectDisCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFactoryResetPage(int value) {
            this.bitField1_ |= 128;
            this.factoryResetPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFindPhoneFail(int value) {
            this.bitField1_ |= 32;
            this.findPhoneFail_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFindPhoneSucc(int value) {
            this.bitField1_ |= 16;
            this.findPhoneSucc_ = value;
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
        public void setLongSitRemindDisCount(int value) {
            this.bitField1_ |= 1;
            this.longSitRemindDisCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMusicPage(int value) {
            this.bitField0_ |= 16384;
            this.musicPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSetPowerOffCount(int value) {
            this.bitField1_ |= 64;
            this.setPowerOffCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingBacklightPage(int value) {
            this.bitField0_ |= 262144;
            this.settingBacklightPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingLongpressPage(int value) {
            this.bitField0_ |= 131072;
            this.settingLongpressPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingPage(int value) {
            this.bitField0_ |= 32768;
            this.settingPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSettingWatchfacePage(int value) {
            this.bitField0_ |= 65536;
            this.settingWatchfacePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSkipGpsLocationNum(int value) {
            this.bitField0_ |= 1048576;
            this.skipGpsLocationNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportGPSLocationWaitTime(int value) {
            this.bitField0_ |= 4194304;
            this.sportGPSLocationWaitTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportGpsFindNum(int value) {
            this.bitField0_ |= 2097152;
            this.sportGpsFindNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportLinkLostNum(int value) {
            this.bitField0_ |= 8388608;
            this.sportLinkLostNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportPage(int value) {
            this.bitField0_ |= 128;
            this.sportPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportReconnectNum(int value) {
            this.bitField0_ |= 67108864;
            this.sportReconnectNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportSettingAutoLapNum(int value) {
            this.bitField0_ |= 16777216;
            this.sportSettingAutoLapNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportSettingAutoPauseNum(int value) {
            this.bitField0_ |= 33554432;
            this.sportSettingAutoPauseNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportSettingPage(int value) {
            this.bitField0_ |= 512;
            this.sportSettingPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStopwatchNum(int value) {
            this.bitField0_ |= 268435456;
            this.stopwatchNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWaitGpsLocationNum(int value) {
            this.bitField0_ |= 524288;
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
                    return new TimexEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001+\u0000\u0002\u0001++\u0000\u0000(\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f\u0011ᔋ\u0010\u0012ᔋ\u0011\u0013ᔋ\u0012\u0014ᔋ\u0013\u0015ᔋ\u0014\u0016ᔋ\u0015\u0017ᔋ\u0016\u0018ᔋ\u0017\u0019ᔋ\u0018\u001aᔋ\u0019\u001bᔋ\u001a\u001cᔋ\u001b\u001dᔋ\u001c\u001eᔋ\u001d\u001fᔋ\u001e ᔋ\u001f!ᔋ \"ᔋ!#ᔋ\"$ᔋ#%ᔋ$&ᔋ%'ᔋ&(ᔋ')ဋ(*ဋ)+ဋ*", new Object[]{"bitField0_", "bitField1_", "lcdOnBecauseOfPress_", "lcdOnBecauseOfEvent_", "dial2DND_", "dial2Notify_", "dial2MainItem1_", "activityMenu_", "activityHR_", "sportPage_", "coachPage_", "sportSettingPage_", "weatherPage_", "alarmPage_", "alarmOnPage_", "alarmOffPage_", "musicPage_", "settingPage_", "settingWatchfacePage_", "settingLongpressPage_", "settingBacklightPage_", "waitGpsLocationNum_", "skipGpsLocationNum_", "sportGpsFindNum_", "sportGPSLocationWaitTime_", "sportLinkLostNum_", "sportSettingAutoLapNum_", "sportSettingAutoPauseNum_", "sportReconnectNum_", "compassPage_", "stopwatchNum_", "countdownNum_", "appNotifRemindDisCount_", "callingRemindDisCount_", "longSitRemindDisCount_", "disconnectDisCount_", "alarmReminderLaterOn_", "alarmReminderClose_", "findPhoneSucc_", "findPhoneFail_", "setPowerOffCount_", "factoryResetPage_", "alipayQRCodeNum_", "alipayCode128Num_", "dialId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<TimexEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (TimexEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getActivityHR() {
            return this.activityHR_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getActivityMenu() {
            return this.activityMenu_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getAlarmOffPage() {
            return this.alarmOffPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getAlarmOnPage() {
            return this.alarmOnPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getAlarmPage() {
            return this.alarmPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getAlarmReminderClose() {
            return this.alarmReminderClose_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getAlarmReminderLaterOn() {
            return this.alarmReminderLaterOn_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getAlipayCode128Num() {
            return this.alipayCode128Num_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getAlipayQRCodeNum() {
            return this.alipayQRCodeNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getAppNotifRemindDisCount() {
            return this.appNotifRemindDisCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getCallingRemindDisCount() {
            return this.callingRemindDisCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getCoachPage() {
            return this.coachPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getCompassPage() {
            return this.compassPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getCountdownNum() {
            return this.countdownNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getDial2DND() {
            return this.dial2DND_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getDial2MainItem1() {
            return this.dial2MainItem1_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getDial2Notify() {
            return this.dial2Notify_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getDialId() {
            return this.dialId_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getDisconnectDisCount() {
            return this.disconnectDisCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getFactoryResetPage() {
            return this.factoryResetPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getFindPhoneFail() {
            return this.findPhoneFail_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getFindPhoneSucc() {
            return this.findPhoneSucc_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getLcdOnBecauseOfEvent() {
            return this.lcdOnBecauseOfEvent_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getLcdOnBecauseOfPress() {
            return this.lcdOnBecauseOfPress_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getLongSitRemindDisCount() {
            return this.longSitRemindDisCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getMusicPage() {
            return this.musicPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getSetPowerOffCount() {
            return this.setPowerOffCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getSettingBacklightPage() {
            return this.settingBacklightPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getSettingLongpressPage() {
            return this.settingLongpressPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getSettingPage() {
            return this.settingPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getSettingWatchfacePage() {
            return this.settingWatchfacePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getSkipGpsLocationNum() {
            return this.skipGpsLocationNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getSportGPSLocationWaitTime() {
            return this.sportGPSLocationWaitTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getSportGpsFindNum() {
            return this.sportGpsFindNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getSportLinkLostNum() {
            return this.sportLinkLostNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getSportPage() {
            return this.sportPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getSportReconnectNum() {
            return this.sportReconnectNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getSportSettingAutoLapNum() {
            return this.sportSettingAutoLapNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getSportSettingAutoPauseNum() {
            return this.sportSettingAutoPauseNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getSportSettingPage() {
            return this.sportSettingPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getStopwatchNum() {
            return this.stopwatchNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getWaitGpsLocationNum() {
            return this.waitGpsLocationNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public int getWeatherPage() {
            return this.weatherPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasActivityHR() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasActivityMenu() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasAlarmOffPage() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasAlarmOnPage() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasAlarmPage() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasAlarmReminderClose() {
            return (this.bitField1_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasAlarmReminderLaterOn() {
            return (this.bitField1_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasAlipayCode128Num() {
            return (this.bitField1_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasAlipayQRCodeNum() {
            return (this.bitField1_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasAppNotifRemindDisCount() {
            return (this.bitField0_ & 1073741824) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasCallingRemindDisCount() {
            return (this.bitField0_ & Integer.MIN_VALUE) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasCoachPage() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasCompassPage() {
            return (this.bitField0_ & AMapEngineUtils.HALF_MAX_P20_WIDTH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasCountdownNum() {
            return (this.bitField0_ & 536870912) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasDial2DND() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasDial2MainItem1() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasDial2Notify() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasDialId() {
            return (this.bitField1_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasDisconnectDisCount() {
            return (this.bitField1_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasFactoryResetPage() {
            return (this.bitField1_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasFindPhoneFail() {
            return (this.bitField1_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasFindPhoneSucc() {
            return (this.bitField1_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfEvent() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfPress() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasLongSitRemindDisCount() {
            return (this.bitField1_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasMusicPage() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasSetPowerOffCount() {
            return (this.bitField1_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasSettingBacklightPage() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasSettingLongpressPage() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasSettingPage() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasSettingWatchfacePage() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasSkipGpsLocationNum() {
            return (this.bitField0_ & 1048576) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasSportGPSLocationWaitTime() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasSportGpsFindNum() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasSportLinkLostNum() {
            return (this.bitField0_ & 8388608) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasSportPage() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasSportReconnectNum() {
            return (this.bitField0_ & 67108864) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasSportSettingAutoLapNum() {
            return (this.bitField0_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasSportSettingAutoPauseNum() {
            return (this.bitField0_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasSportSettingPage() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasStopwatchNum() {
            return (this.bitField0_ & 268435456) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasWaitGpsLocationNum() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexEventMessageOrBuilder
        public boolean hasWeatherPage() {
            return (this.bitField0_ & 1024) != 0;
        }

        public static Builder newBuilder(TimexEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static TimexEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TimexEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static TimexEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TimexEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TimexEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (TimexEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static TimexEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TimexEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TimexEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (TimexEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static TimexEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TimexEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TimexEventMessage parseFrom(InputStream input) throws IOException {
            return (TimexEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static TimexEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TimexEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static TimexEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (TimexEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static TimexEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TimexEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface TimexEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getActivityHR();

        int getActivityMenu();

        int getAlarmOffPage();

        int getAlarmOnPage();

        int getAlarmPage();

        int getAlarmReminderClose();

        int getAlarmReminderLaterOn();

        int getAlipayCode128Num();

        int getAlipayQRCodeNum();

        int getAppNotifRemindDisCount();

        int getCallingRemindDisCount();

        int getCoachPage();

        int getCompassPage();

        int getCountdownNum();

        int getDial2DND();

        int getDial2MainItem1();

        int getDial2Notify();

        int getDialId();

        int getDisconnectDisCount();

        int getFactoryResetPage();

        int getFindPhoneFail();

        int getFindPhoneSucc();

        int getLcdOnBecauseOfEvent();

        int getLcdOnBecauseOfPress();

        int getLongSitRemindDisCount();

        int getMusicPage();

        int getSetPowerOffCount();

        int getSettingBacklightPage();

        int getSettingLongpressPage();

        int getSettingPage();

        int getSettingWatchfacePage();

        int getSkipGpsLocationNum();

        int getSportGPSLocationWaitTime();

        int getSportGpsFindNum();

        int getSportLinkLostNum();

        int getSportPage();

        int getSportReconnectNum();

        int getSportSettingAutoLapNum();

        int getSportSettingAutoPauseNum();

        int getSportSettingPage();

        int getStopwatchNum();

        int getWaitGpsLocationNum();

        int getWeatherPage();

        boolean hasActivityHR();

        boolean hasActivityMenu();

        boolean hasAlarmOffPage();

        boolean hasAlarmOnPage();

        boolean hasAlarmPage();

        boolean hasAlarmReminderClose();

        boolean hasAlarmReminderLaterOn();

        boolean hasAlipayCode128Num();

        boolean hasAlipayQRCodeNum();

        boolean hasAppNotifRemindDisCount();

        boolean hasCallingRemindDisCount();

        boolean hasCoachPage();

        boolean hasCompassPage();

        boolean hasCountdownNum();

        boolean hasDial2DND();

        boolean hasDial2MainItem1();

        boolean hasDial2Notify();

        boolean hasDialId();

        boolean hasDisconnectDisCount();

        boolean hasFactoryResetPage();

        boolean hasFindPhoneFail();

        boolean hasFindPhoneSucc();

        boolean hasLcdOnBecauseOfEvent();

        boolean hasLcdOnBecauseOfPress();

        boolean hasLongSitRemindDisCount();

        boolean hasMusicPage();

        boolean hasSetPowerOffCount();

        boolean hasSettingBacklightPage();

        boolean hasSettingLongpressPage();

        boolean hasSettingPage();

        boolean hasSettingWatchfacePage();

        boolean hasSkipGpsLocationNum();

        boolean hasSportGPSLocationWaitTime();

        boolean hasSportGpsFindNum();

        boolean hasSportLinkLostNum();

        boolean hasSportPage();

        boolean hasSportReconnectNum();

        boolean hasSportSettingAutoLapNum();

        boolean hasSportSettingAutoPauseNum();

        boolean hasSportSettingPage();

        boolean hasStopwatchNum();

        boolean hasWaitGpsLocationNum();

        boolean hasWeatherPage();
    }

    public static final class TimexStatisticsMessage extends GeneratedMessageLite<TimexStatisticsMessage, Builder> implements TimexStatisticsMessageOrBuilder {
        public static final int BACKLIGHTLEVEL_FIELD_NUMBER = 3;
        public static final int BASE_FIELD_NUMBER = 1;
        private static final TimexStatisticsMessage DEFAULT_INSTANCE;
        public static final int EVENT_FIELD_NUMBER = 4;
        private static volatile Parser<TimexStatisticsMessage> PARSER = null;
        public static final int SILENCEMODE_FIELD_NUMBER = 2;
        private int backlightLevel_;
        private StatisBase.StatisBaseMessage base_;
        private int bitField0_;
        private TimexEventMessage event_;
        private byte memoizedIsInitialized = 2;
        private int silenceMode_;

        public static final class Builder extends GeneratedMessageLite.Builder<TimexStatisticsMessage, Builder> implements TimexStatisticsMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBacklightLevel() {
                copyOnWrite();
                ((TimexStatisticsMessage) this.instance).clearBacklightLevel();
                return this;
            }

            public Builder clearBase() {
                copyOnWrite();
                ((TimexStatisticsMessage) this.instance).clearBase();
                return this;
            }

            public Builder clearEvent() {
                copyOnWrite();
                ((TimexStatisticsMessage) this.instance).clearEvent();
                return this;
            }

            public Builder clearSilenceMode() {
                copyOnWrite();
                ((TimexStatisticsMessage) this.instance).clearSilenceMode();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexStatisticsMessageOrBuilder
            public int getBacklightLevel() {
                return ((TimexStatisticsMessage) this.instance).getBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexStatisticsMessageOrBuilder
            public StatisBase.StatisBaseMessage getBase() {
                return ((TimexStatisticsMessage) this.instance).getBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexStatisticsMessageOrBuilder
            public TimexEventMessage getEvent() {
                return ((TimexStatisticsMessage) this.instance).getEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexStatisticsMessageOrBuilder
            public SilenceModeOuterClass.SilenceMode getSilenceMode() {
                return ((TimexStatisticsMessage) this.instance).getSilenceMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexStatisticsMessageOrBuilder
            public boolean hasBacklightLevel() {
                return ((TimexStatisticsMessage) this.instance).hasBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexStatisticsMessageOrBuilder
            public boolean hasBase() {
                return ((TimexStatisticsMessage) this.instance).hasBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexStatisticsMessageOrBuilder
            public boolean hasEvent() {
                return ((TimexStatisticsMessage) this.instance).hasEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexStatisticsMessageOrBuilder
            public boolean hasSilenceMode() {
                return ((TimexStatisticsMessage) this.instance).hasSilenceMode();
            }

            public Builder mergeBase(StatisBase.StatisBaseMessage value) {
                copyOnWrite();
                ((TimexStatisticsMessage) this.instance).mergeBase(value);
                return this;
            }

            public Builder mergeEvent(TimexEventMessage value) {
                copyOnWrite();
                ((TimexStatisticsMessage) this.instance).mergeEvent(value);
                return this;
            }

            public Builder setBacklightLevel(int value) {
                copyOnWrite();
                ((TimexStatisticsMessage) this.instance).setBacklightLevel(value);
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage value) {
                copyOnWrite();
                ((TimexStatisticsMessage) this.instance).setBase(value);
                return this;
            }

            public Builder setEvent(TimexEventMessage value) {
                copyOnWrite();
                ((TimexStatisticsMessage) this.instance).setEvent(value);
                return this;
            }

            public Builder setSilenceMode(SilenceModeOuterClass.SilenceMode value) {
                copyOnWrite();
                ((TimexStatisticsMessage) this.instance).setSilenceMode(value);
                return this;
            }

            private Builder() {
                super(TimexStatisticsMessage.DEFAULT_INSTANCE);
            }

            public Builder setBase(StatisBase.StatisBaseMessage.Builder builderForValue) {
                copyOnWrite();
                ((TimexStatisticsMessage) this.instance).setBase(builderForValue.build());
                return this;
            }

            public Builder setEvent(TimexEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((TimexStatisticsMessage) this.instance).setEvent(builderForValue.build());
                return this;
            }
        }

        static {
            TimexStatisticsMessage timexStatisticsMessage = new TimexStatisticsMessage();
            DEFAULT_INSTANCE = timexStatisticsMessage;
            GeneratedMessageLite.registerDefaultInstance(TimexStatisticsMessage.class, timexStatisticsMessage);
        }

        private TimexStatisticsMessage() {
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

        public static TimexStatisticsMessage getDefaultInstance() {
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
        public void mergeEvent(TimexEventMessage value) {
            value.getClass();
            TimexEventMessage timexEventMessage = this.event_;
            if (timexEventMessage == null || timexEventMessage == TimexEventMessage.getDefaultInstance()) {
                this.event_ = value;
            } else {
                this.event_ = TimexEventMessage.newBuilder(this.event_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static TimexStatisticsMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (TimexStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static TimexStatisticsMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (TimexStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<TimexStatisticsMessage> parser() {
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
        public void setEvent(TimexEventMessage value) {
            value.getClass();
            this.event_ = value;
            this.bitField0_ |= 8;
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
                    return new TimexStatisticsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0004\u0001ᔉ\u0000\u0002ᔌ\u0001\u0003ᔋ\u0002\u0004ᐉ\u0003", new Object[]{"bitField0_", "base_", "silenceMode_", SilenceModeOuterClass.SilenceMode.internalGetVerifier(), "backlightLevel_", "event_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<TimexStatisticsMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (TimexStatisticsMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexStatisticsMessageOrBuilder
        public int getBacklightLevel() {
            return this.backlightLevel_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexStatisticsMessageOrBuilder
        public StatisBase.StatisBaseMessage getBase() {
            StatisBase.StatisBaseMessage statisBaseMessage = this.base_;
            return statisBaseMessage == null ? StatisBase.StatisBaseMessage.getDefaultInstance() : statisBaseMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexStatisticsMessageOrBuilder
        public TimexEventMessage getEvent() {
            TimexEventMessage timexEventMessage = this.event_;
            return timexEventMessage == null ? TimexEventMessage.getDefaultInstance() : timexEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexStatisticsMessageOrBuilder
        public SilenceModeOuterClass.SilenceMode getSilenceMode() {
            SilenceModeOuterClass.SilenceMode silenceModeForNumber = SilenceModeOuterClass.SilenceMode.forNumber(this.silenceMode_);
            return silenceModeForNumber == null ? SilenceModeOuterClass.SilenceMode.OFF : silenceModeForNumber;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexStatisticsMessageOrBuilder
        public boolean hasBacklightLevel() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexStatisticsMessageOrBuilder
        public boolean hasBase() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexStatisticsMessageOrBuilder
        public boolean hasEvent() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.TimexOrigin.TimexStatisticsMessageOrBuilder
        public boolean hasSilenceMode() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(TimexStatisticsMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static TimexStatisticsMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TimexStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static TimexStatisticsMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TimexStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TimexStatisticsMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (TimexStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static TimexStatisticsMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TimexStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TimexStatisticsMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (TimexStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static TimexStatisticsMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (TimexStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static TimexStatisticsMessage parseFrom(InputStream input) throws IOException {
            return (TimexStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static TimexStatisticsMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TimexStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static TimexStatisticsMessage parseFrom(CodedInputStream input) throws IOException {
            return (TimexStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static TimexStatisticsMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (TimexStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface TimexStatisticsMessageOrBuilder extends MessageLiteOrBuilder {
        int getBacklightLevel();

        StatisBase.StatisBaseMessage getBase();

        TimexEventMessage getEvent();

        SilenceModeOuterClass.SilenceMode getSilenceMode();

        boolean hasBacklightLevel();

        boolean hasBase();

        boolean hasEvent();

        boolean hasSilenceMode();
    }

    private TimexOrigin() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }
}
