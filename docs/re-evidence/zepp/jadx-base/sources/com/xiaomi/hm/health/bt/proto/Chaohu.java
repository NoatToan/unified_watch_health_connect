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
public final class Chaohu {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.Chaohu$1, reason: invalid class name */
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

    public static final class ChaoHuAddEventMessage extends GeneratedMessageLite<ChaoHuAddEventMessage, Builder> implements ChaoHuAddEventMessageOrBuilder {
        public static final int ALARMCLOSETIMES_FIELD_NUMBER = 4;
        public static final int ALARMOPENTIMES_FIELD_NUMBER = 3;
        public static final int ALARMREMINDERCLOSE_FIELD_NUMBER = 12;
        public static final int ALARMREMINDERLATERON_FIELD_NUMBER = 11;
        public static final int ALIPAYCODE128TIMES_FIELD_NUMBER = 19;
        public static final int ALIPAYQRCODETIMES_FIELD_NUMBER = 18;
        public static final int APPNOTIFREMINDDISCOUNT_FIELD_NUMBER = 20;
        public static final int CALLINGREMINDDISCOUNT_FIELD_NUMBER = 21;
        private static final ChaoHuAddEventMessage DEFAULT_INSTANCE;
        public static final int DISCONNECTDISCOUNT_FIELD_NUMBER = 23;
        public static final int FACTORYRESETPAGE_FIELD_NUMBER = 9;
        public static final int FINDPHONEFAIL_FIELD_NUMBER = 7;
        public static final int FINDPHONEPAGE_FIELD_NUMBER = 5;
        public static final int FINDPHONESUCC_FIELD_NUMBER = 6;
        public static final int LONGSITREMINDDISCOUNT_FIELD_NUMBER = 22;
        public static final int NEGATIVEPAGE_FIELD_NUMBER = 2;
        private static volatile Parser<ChaoHuAddEventMessage> PARSER = null;
        public static final int REMINDERPAGE_FIELD_NUMBER = 10;
        public static final int SETPOWEROFFCOUNT_FIELD_NUMBER = 8;
        public static final int SPORTGPSLOCATIONMAXTIME_FIELD_NUMBER = 16;
        public static final int SPORTGPSLOCATIONMINTIME_FIELD_NUMBER = 15;
        public static final int SPORTLINKLOST_FIELD_NUMBER = 13;
        public static final int SPORTLINKRECOVER_FIELD_NUMBER = 14;
        public static final int SPORTLOCATIONSUCCCTIME_FIELD_NUMBER = 17;
        public static final int STATUSPAGE_FIELD_NUMBER = 1;
        private int alarmCloseTimes_;
        private int alarmOpenTimes_;
        private int alarmReminderClose_;
        private int alarmReminderLaterOn_;
        private int alipayCode128Times_;
        private int alipayQRCodeTimes_;
        private int appNotifRemindDisCount_;
        private int bitField0_;
        private int callingRemindDisCount_;
        private int disconnectDisCount_;
        private int factoryResetPage_;
        private int findPhoneFail_;
        private int findPhonePage_;
        private int findPhoneSucc_;
        private int longSitRemindDisCount_;
        private byte memoizedIsInitialized = 2;
        private int negativePage_;
        private int reminderPage_;
        private int setPowerOffCount_;
        private int sportGPSLocationMaxTime_;
        private int sportGPSLocationMinTime_;
        private int sportLinkLost_;
        private int sportLinkRecover_;
        private int sportLocationSucccTime_;
        private int statusPage_;

        public static final class Builder extends GeneratedMessageLite.Builder<ChaoHuAddEventMessage, Builder> implements ChaoHuAddEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAlarmCloseTimes() {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).clearAlarmCloseTimes();
                return this;
            }

            public Builder clearAlarmOpenTimes() {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).clearAlarmOpenTimes();
                return this;
            }

            public Builder clearAlarmReminderClose() {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).clearAlarmReminderClose();
                return this;
            }

            public Builder clearAlarmReminderLaterOn() {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).clearAlarmReminderLaterOn();
                return this;
            }

            public Builder clearAlipayCode128Times() {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).clearAlipayCode128Times();
                return this;
            }

            public Builder clearAlipayQRCodeTimes() {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).clearAlipayQRCodeTimes();
                return this;
            }

            public Builder clearAppNotifRemindDisCount() {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).clearAppNotifRemindDisCount();
                return this;
            }

            public Builder clearCallingRemindDisCount() {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).clearCallingRemindDisCount();
                return this;
            }

            public Builder clearDisconnectDisCount() {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).clearDisconnectDisCount();
                return this;
            }

            public Builder clearFactoryResetPage() {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).clearFactoryResetPage();
                return this;
            }

            public Builder clearFindPhoneFail() {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).clearFindPhoneFail();
                return this;
            }

            public Builder clearFindPhonePage() {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).clearFindPhonePage();
                return this;
            }

            public Builder clearFindPhoneSucc() {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).clearFindPhoneSucc();
                return this;
            }

            public Builder clearLongSitRemindDisCount() {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).clearLongSitRemindDisCount();
                return this;
            }

            public Builder clearNegativePage() {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).clearNegativePage();
                return this;
            }

            public Builder clearReminderPage() {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).clearReminderPage();
                return this;
            }

            public Builder clearSetPowerOffCount() {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).clearSetPowerOffCount();
                return this;
            }

            public Builder clearSportGPSLocationMaxTime() {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).clearSportGPSLocationMaxTime();
                return this;
            }

            public Builder clearSportGPSLocationMinTime() {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).clearSportGPSLocationMinTime();
                return this;
            }

            public Builder clearSportLinkLost() {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).clearSportLinkLost();
                return this;
            }

            public Builder clearSportLinkRecover() {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).clearSportLinkRecover();
                return this;
            }

            public Builder clearSportLocationSucccTime() {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).clearSportLocationSucccTime();
                return this;
            }

            public Builder clearStatusPage() {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).clearStatusPage();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public int getAlarmCloseTimes() {
                return ((ChaoHuAddEventMessage) this.instance).getAlarmCloseTimes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public int getAlarmOpenTimes() {
                return ((ChaoHuAddEventMessage) this.instance).getAlarmOpenTimes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public int getAlarmReminderClose() {
                return ((ChaoHuAddEventMessage) this.instance).getAlarmReminderClose();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public int getAlarmReminderLaterOn() {
                return ((ChaoHuAddEventMessage) this.instance).getAlarmReminderLaterOn();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public int getAlipayCode128Times() {
                return ((ChaoHuAddEventMessage) this.instance).getAlipayCode128Times();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public int getAlipayQRCodeTimes() {
                return ((ChaoHuAddEventMessage) this.instance).getAlipayQRCodeTimes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public int getAppNotifRemindDisCount() {
                return ((ChaoHuAddEventMessage) this.instance).getAppNotifRemindDisCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public int getCallingRemindDisCount() {
                return ((ChaoHuAddEventMessage) this.instance).getCallingRemindDisCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public int getDisconnectDisCount() {
                return ((ChaoHuAddEventMessage) this.instance).getDisconnectDisCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public int getFactoryResetPage() {
                return ((ChaoHuAddEventMessage) this.instance).getFactoryResetPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public int getFindPhoneFail() {
                return ((ChaoHuAddEventMessage) this.instance).getFindPhoneFail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public int getFindPhonePage() {
                return ((ChaoHuAddEventMessage) this.instance).getFindPhonePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public int getFindPhoneSucc() {
                return ((ChaoHuAddEventMessage) this.instance).getFindPhoneSucc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public int getLongSitRemindDisCount() {
                return ((ChaoHuAddEventMessage) this.instance).getLongSitRemindDisCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public int getNegativePage() {
                return ((ChaoHuAddEventMessage) this.instance).getNegativePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public int getReminderPage() {
                return ((ChaoHuAddEventMessage) this.instance).getReminderPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public int getSetPowerOffCount() {
                return ((ChaoHuAddEventMessage) this.instance).getSetPowerOffCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public int getSportGPSLocationMaxTime() {
                return ((ChaoHuAddEventMessage) this.instance).getSportGPSLocationMaxTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public int getSportGPSLocationMinTime() {
                return ((ChaoHuAddEventMessage) this.instance).getSportGPSLocationMinTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public int getSportLinkLost() {
                return ((ChaoHuAddEventMessage) this.instance).getSportLinkLost();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public int getSportLinkRecover() {
                return ((ChaoHuAddEventMessage) this.instance).getSportLinkRecover();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public int getSportLocationSucccTime() {
                return ((ChaoHuAddEventMessage) this.instance).getSportLocationSucccTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public int getStatusPage() {
                return ((ChaoHuAddEventMessage) this.instance).getStatusPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public boolean hasAlarmCloseTimes() {
                return ((ChaoHuAddEventMessage) this.instance).hasAlarmCloseTimes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public boolean hasAlarmOpenTimes() {
                return ((ChaoHuAddEventMessage) this.instance).hasAlarmOpenTimes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public boolean hasAlarmReminderClose() {
                return ((ChaoHuAddEventMessage) this.instance).hasAlarmReminderClose();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public boolean hasAlarmReminderLaterOn() {
                return ((ChaoHuAddEventMessage) this.instance).hasAlarmReminderLaterOn();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public boolean hasAlipayCode128Times() {
                return ((ChaoHuAddEventMessage) this.instance).hasAlipayCode128Times();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public boolean hasAlipayQRCodeTimes() {
                return ((ChaoHuAddEventMessage) this.instance).hasAlipayQRCodeTimes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public boolean hasAppNotifRemindDisCount() {
                return ((ChaoHuAddEventMessage) this.instance).hasAppNotifRemindDisCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public boolean hasCallingRemindDisCount() {
                return ((ChaoHuAddEventMessage) this.instance).hasCallingRemindDisCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public boolean hasDisconnectDisCount() {
                return ((ChaoHuAddEventMessage) this.instance).hasDisconnectDisCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public boolean hasFactoryResetPage() {
                return ((ChaoHuAddEventMessage) this.instance).hasFactoryResetPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public boolean hasFindPhoneFail() {
                return ((ChaoHuAddEventMessage) this.instance).hasFindPhoneFail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public boolean hasFindPhonePage() {
                return ((ChaoHuAddEventMessage) this.instance).hasFindPhonePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public boolean hasFindPhoneSucc() {
                return ((ChaoHuAddEventMessage) this.instance).hasFindPhoneSucc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public boolean hasLongSitRemindDisCount() {
                return ((ChaoHuAddEventMessage) this.instance).hasLongSitRemindDisCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public boolean hasNegativePage() {
                return ((ChaoHuAddEventMessage) this.instance).hasNegativePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public boolean hasReminderPage() {
                return ((ChaoHuAddEventMessage) this.instance).hasReminderPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public boolean hasSetPowerOffCount() {
                return ((ChaoHuAddEventMessage) this.instance).hasSetPowerOffCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public boolean hasSportGPSLocationMaxTime() {
                return ((ChaoHuAddEventMessage) this.instance).hasSportGPSLocationMaxTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public boolean hasSportGPSLocationMinTime() {
                return ((ChaoHuAddEventMessage) this.instance).hasSportGPSLocationMinTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public boolean hasSportLinkLost() {
                return ((ChaoHuAddEventMessage) this.instance).hasSportLinkLost();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public boolean hasSportLinkRecover() {
                return ((ChaoHuAddEventMessage) this.instance).hasSportLinkRecover();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public boolean hasSportLocationSucccTime() {
                return ((ChaoHuAddEventMessage) this.instance).hasSportLocationSucccTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
            public boolean hasStatusPage() {
                return ((ChaoHuAddEventMessage) this.instance).hasStatusPage();
            }

            public Builder setAlarmCloseTimes(int value) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setAlarmCloseTimes(value);
                return this;
            }

            public Builder setAlarmOpenTimes(int value) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setAlarmOpenTimes(value);
                return this;
            }

            public Builder setAlarmReminderClose(int value) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setAlarmReminderClose(value);
                return this;
            }

            public Builder setAlarmReminderLaterOn(int value) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setAlarmReminderLaterOn(value);
                return this;
            }

            public Builder setAlipayCode128Times(int value) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setAlipayCode128Times(value);
                return this;
            }

            public Builder setAlipayQRCodeTimes(int value) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setAlipayQRCodeTimes(value);
                return this;
            }

            public Builder setAppNotifRemindDisCount(int value) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setAppNotifRemindDisCount(value);
                return this;
            }

            public Builder setCallingRemindDisCount(int value) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setCallingRemindDisCount(value);
                return this;
            }

            public Builder setDisconnectDisCount(int value) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setDisconnectDisCount(value);
                return this;
            }

            public Builder setFactoryResetPage(int value) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setFactoryResetPage(value);
                return this;
            }

            public Builder setFindPhoneFail(int value) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setFindPhoneFail(value);
                return this;
            }

            public Builder setFindPhonePage(int value) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setFindPhonePage(value);
                return this;
            }

            public Builder setFindPhoneSucc(int value) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setFindPhoneSucc(value);
                return this;
            }

            public Builder setLongSitRemindDisCount(int value) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setLongSitRemindDisCount(value);
                return this;
            }

            public Builder setNegativePage(int value) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setNegativePage(value);
                return this;
            }

            public Builder setReminderPage(int value) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setReminderPage(value);
                return this;
            }

            public Builder setSetPowerOffCount(int value) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setSetPowerOffCount(value);
                return this;
            }

            public Builder setSportGPSLocationMaxTime(int value) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setSportGPSLocationMaxTime(value);
                return this;
            }

            public Builder setSportGPSLocationMinTime(int value) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setSportGPSLocationMinTime(value);
                return this;
            }

            public Builder setSportLinkLost(int value) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setSportLinkLost(value);
                return this;
            }

            public Builder setSportLinkRecover(int value) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setSportLinkRecover(value);
                return this;
            }

            public Builder setSportLocationSucccTime(int value) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setSportLocationSucccTime(value);
                return this;
            }

            public Builder setStatusPage(int value) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setStatusPage(value);
                return this;
            }

            private Builder() {
                super(ChaoHuAddEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            ChaoHuAddEventMessage chaoHuAddEventMessage = new ChaoHuAddEventMessage();
            DEFAULT_INSTANCE = chaoHuAddEventMessage;
            GeneratedMessageLite.registerDefaultInstance(ChaoHuAddEventMessage.class, chaoHuAddEventMessage);
        }

        private ChaoHuAddEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmCloseTimes() {
            this.bitField0_ &= -9;
            this.alarmCloseTimes_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmOpenTimes() {
            this.bitField0_ &= -5;
            this.alarmOpenTimes_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmReminderClose() {
            this.bitField0_ &= -2049;
            this.alarmReminderClose_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlarmReminderLaterOn() {
            this.bitField0_ &= -1025;
            this.alarmReminderLaterOn_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayCode128Times() {
            this.bitField0_ &= -262145;
            this.alipayCode128Times_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAlipayQRCodeTimes() {
            this.bitField0_ &= -131073;
            this.alipayQRCodeTimes_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAppNotifRemindDisCount() {
            this.bitField0_ &= -524289;
            this.appNotifRemindDisCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCallingRemindDisCount() {
            this.bitField0_ &= -1048577;
            this.callingRemindDisCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDisconnectDisCount() {
            this.bitField0_ &= -4194305;
            this.disconnectDisCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFactoryResetPage() {
            this.bitField0_ &= -257;
            this.factoryResetPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFindPhoneFail() {
            this.bitField0_ &= -65;
            this.findPhoneFail_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFindPhonePage() {
            this.bitField0_ &= -17;
            this.findPhonePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearFindPhoneSucc() {
            this.bitField0_ &= -33;
            this.findPhoneSucc_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLongSitRemindDisCount() {
            this.bitField0_ &= -2097153;
            this.longSitRemindDisCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNegativePage() {
            this.bitField0_ &= -3;
            this.negativePage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReminderPage() {
            this.bitField0_ &= -513;
            this.reminderPage_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSetPowerOffCount() {
            this.bitField0_ &= -129;
            this.setPowerOffCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportGPSLocationMaxTime() {
            this.bitField0_ &= -32769;
            this.sportGPSLocationMaxTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportGPSLocationMinTime() {
            this.bitField0_ &= -16385;
            this.sportGPSLocationMinTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportLinkLost() {
            this.bitField0_ &= -4097;
            this.sportLinkLost_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportLinkRecover() {
            this.bitField0_ &= -8193;
            this.sportLinkRecover_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportLocationSucccTime() {
            this.bitField0_ &= -65537;
            this.sportLocationSucccTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStatusPage() {
            this.bitField0_ &= -2;
            this.statusPage_ = 0;
        }

        public static ChaoHuAddEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ChaoHuAddEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (ChaoHuAddEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static ChaoHuAddEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (ChaoHuAddEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<ChaoHuAddEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmCloseTimes(int value) {
            this.bitField0_ |= 8;
            this.alarmCloseTimes_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmOpenTimes(int value) {
            this.bitField0_ |= 4;
            this.alarmOpenTimes_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmReminderClose(int value) {
            this.bitField0_ |= 2048;
            this.alarmReminderClose_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmReminderLaterOn(int value) {
            this.bitField0_ |= 1024;
            this.alarmReminderLaterOn_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCode128Times(int value) {
            this.bitField0_ |= 262144;
            this.alipayCode128Times_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRCodeTimes(int value) {
            this.bitField0_ |= 131072;
            this.alipayQRCodeTimes_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppNotifRemindDisCount(int value) {
            this.bitField0_ |= 524288;
            this.appNotifRemindDisCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallingRemindDisCount(int value) {
            this.bitField0_ |= 1048576;
            this.callingRemindDisCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisconnectDisCount(int value) {
            this.bitField0_ |= 4194304;
            this.disconnectDisCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFactoryResetPage(int value) {
            this.bitField0_ |= 256;
            this.factoryResetPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFindPhoneFail(int value) {
            this.bitField0_ |= 64;
            this.findPhoneFail_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFindPhonePage(int value) {
            this.bitField0_ |= 16;
            this.findPhonePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFindPhoneSucc(int value) {
            this.bitField0_ |= 32;
            this.findPhoneSucc_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLongSitRemindDisCount(int value) {
            this.bitField0_ |= 2097152;
            this.longSitRemindDisCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNegativePage(int value) {
            this.bitField0_ |= 2;
            this.negativePage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReminderPage(int value) {
            this.bitField0_ |= 512;
            this.reminderPage_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSetPowerOffCount(int value) {
            this.bitField0_ |= 128;
            this.setPowerOffCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportGPSLocationMaxTime(int value) {
            this.bitField0_ |= 32768;
            this.sportGPSLocationMaxTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportGPSLocationMinTime(int value) {
            this.bitField0_ |= 16384;
            this.sportGPSLocationMinTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportLinkLost(int value) {
            this.bitField0_ |= 4096;
            this.sportLinkLost_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportLinkRecover(int value) {
            this.bitField0_ |= 8192;
            this.sportLinkRecover_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportLocationSucccTime(int value) {
            this.bitField0_ |= 65536;
            this.sportLocationSucccTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusPage(int value) {
            this.bitField0_ |= 1;
            this.statusPage_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new ChaoHuAddEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0000\u0017\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f\u0011ᔋ\u0010\u0012ᔋ\u0011\u0013ᔋ\u0012\u0014ᔋ\u0013\u0015ᔋ\u0014\u0016ᔋ\u0015\u0017ᔋ\u0016", new Object[]{"bitField0_", "statusPage_", "negativePage_", "alarmOpenTimes_", "alarmCloseTimes_", "findPhonePage_", "findPhoneSucc_", "findPhoneFail_", "setPowerOffCount_", "factoryResetPage_", "reminderPage_", "alarmReminderLaterOn_", "alarmReminderClose_", "sportLinkLost_", "sportLinkRecover_", "sportGPSLocationMinTime_", "sportGPSLocationMaxTime_", "sportLocationSucccTime_", "alipayQRCodeTimes_", "alipayCode128Times_", "appNotifRemindDisCount_", "callingRemindDisCount_", "longSitRemindDisCount_", "disconnectDisCount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ChaoHuAddEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ChaoHuAddEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public int getAlarmCloseTimes() {
            return this.alarmCloseTimes_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public int getAlarmOpenTimes() {
            return this.alarmOpenTimes_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public int getAlarmReminderClose() {
            return this.alarmReminderClose_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public int getAlarmReminderLaterOn() {
            return this.alarmReminderLaterOn_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public int getAlipayCode128Times() {
            return this.alipayCode128Times_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public int getAlipayQRCodeTimes() {
            return this.alipayQRCodeTimes_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public int getAppNotifRemindDisCount() {
            return this.appNotifRemindDisCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public int getCallingRemindDisCount() {
            return this.callingRemindDisCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public int getDisconnectDisCount() {
            return this.disconnectDisCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public int getFactoryResetPage() {
            return this.factoryResetPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public int getFindPhoneFail() {
            return this.findPhoneFail_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public int getFindPhonePage() {
            return this.findPhonePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public int getFindPhoneSucc() {
            return this.findPhoneSucc_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public int getLongSitRemindDisCount() {
            return this.longSitRemindDisCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public int getNegativePage() {
            return this.negativePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public int getReminderPage() {
            return this.reminderPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public int getSetPowerOffCount() {
            return this.setPowerOffCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public int getSportGPSLocationMaxTime() {
            return this.sportGPSLocationMaxTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public int getSportGPSLocationMinTime() {
            return this.sportGPSLocationMinTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public int getSportLinkLost() {
            return this.sportLinkLost_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public int getSportLinkRecover() {
            return this.sportLinkRecover_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public int getSportLocationSucccTime() {
            return this.sportLocationSucccTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public int getStatusPage() {
            return this.statusPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public boolean hasAlarmCloseTimes() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public boolean hasAlarmOpenTimes() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public boolean hasAlarmReminderClose() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public boolean hasAlarmReminderLaterOn() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public boolean hasAlipayCode128Times() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public boolean hasAlipayQRCodeTimes() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public boolean hasAppNotifRemindDisCount() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public boolean hasCallingRemindDisCount() {
            return (this.bitField0_ & 1048576) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public boolean hasDisconnectDisCount() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public boolean hasFactoryResetPage() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public boolean hasFindPhoneFail() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public boolean hasFindPhonePage() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public boolean hasFindPhoneSucc() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public boolean hasLongSitRemindDisCount() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public boolean hasNegativePage() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public boolean hasReminderPage() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public boolean hasSetPowerOffCount() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public boolean hasSportGPSLocationMaxTime() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public boolean hasSportGPSLocationMinTime() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public boolean hasSportLinkLost() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public boolean hasSportLinkRecover() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public boolean hasSportLocationSucccTime() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuAddEventMessageOrBuilder
        public boolean hasStatusPage() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(ChaoHuAddEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static ChaoHuAddEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ChaoHuAddEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ChaoHuAddEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ChaoHuAddEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ChaoHuAddEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ChaoHuAddEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ChaoHuAddEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ChaoHuAddEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ChaoHuAddEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ChaoHuAddEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ChaoHuAddEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ChaoHuAddEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ChaoHuAddEventMessage parseFrom(InputStream input) throws IOException {
            return (ChaoHuAddEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ChaoHuAddEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ChaoHuAddEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ChaoHuAddEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (ChaoHuAddEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ChaoHuAddEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ChaoHuAddEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface ChaoHuAddEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getAlarmCloseTimes();

        int getAlarmOpenTimes();

        int getAlarmReminderClose();

        int getAlarmReminderLaterOn();

        int getAlipayCode128Times();

        int getAlipayQRCodeTimes();

        int getAppNotifRemindDisCount();

        int getCallingRemindDisCount();

        int getDisconnectDisCount();

        int getFactoryResetPage();

        int getFindPhoneFail();

        int getFindPhonePage();

        int getFindPhoneSucc();

        int getLongSitRemindDisCount();

        int getNegativePage();

        int getReminderPage();

        int getSetPowerOffCount();

        int getSportGPSLocationMaxTime();

        int getSportGPSLocationMinTime();

        int getSportLinkLost();

        int getSportLinkRecover();

        int getSportLocationSucccTime();

        int getStatusPage();

        boolean hasAlarmCloseTimes();

        boolean hasAlarmOpenTimes();

        boolean hasAlarmReminderClose();

        boolean hasAlarmReminderLaterOn();

        boolean hasAlipayCode128Times();

        boolean hasAlipayQRCodeTimes();

        boolean hasAppNotifRemindDisCount();

        boolean hasCallingRemindDisCount();

        boolean hasDisconnectDisCount();

        boolean hasFactoryResetPage();

        boolean hasFindPhoneFail();

        boolean hasFindPhonePage();

        boolean hasFindPhoneSucc();

        boolean hasLongSitRemindDisCount();

        boolean hasNegativePage();

        boolean hasReminderPage();

        boolean hasSetPowerOffCount();

        boolean hasSportGPSLocationMaxTime();

        boolean hasSportGPSLocationMinTime();

        boolean hasSportLinkLost();

        boolean hasSportLinkRecover();

        boolean hasSportLocationSucccTime();

        boolean hasStatusPage();
    }

    public static final class ChaoHuEventMessage extends GeneratedMessageLite<ChaoHuEventMessage, Builder> implements ChaoHuEventMessageOrBuilder {
        public static final int ALARMPAGE_FIELD_NUMBER = 12;
        public static final int ALIPAYCODE128NUM_FIELD_NUMBER = 30;
        public static final int ALIPAYQRCODENUM_FIELD_NUMBER = 29;
        public static final int COMPASSNUM_FIELD_NUMBER = 28;
        public static final int COMPASSPAGE_FIELD_NUMBER = 16;
        public static final int COUNTDOWNNUM_FIELD_NUMBER = 27;
        private static final ChaoHuEventMessage DEFAULT_INSTANCE;
        public static final int DIAL2DND_FIELD_NUMBER = 3;
        public static final int DIAL2MAINITEM1_FIELD_NUMBER = 5;
        public static final int DIAL2NOTIFY_FIELD_NUMBER = 4;
        public static final int DIALID_FIELD_NUMBER = 31;
        public static final int LCDONBECAUSEOFEVENT_FIELD_NUMBER = 2;
        public static final int LCDONBECAUSEOFPRESS_FIELD_NUMBER = 1;
        private static volatile Parser<ChaoHuEventMessage> PARSER = null;
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

        public static final class Builder extends GeneratedMessageLite.Builder<ChaoHuEventMessage, Builder> implements ChaoHuEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAlarmPage() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearAlarmPage();
                return this;
            }

            public Builder clearAlipayCode128Num() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearAlipayCode128Num();
                return this;
            }

            public Builder clearAlipayQRCodeNum() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearAlipayQRCodeNum();
                return this;
            }

            public Builder clearCompassNum() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearCompassNum();
                return this;
            }

            public Builder clearCompassPage() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearCompassPage();
                return this;
            }

            public Builder clearCountdownNum() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearCountdownNum();
                return this;
            }

            public Builder clearDial2DND() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearDial2DND();
                return this;
            }

            public Builder clearDial2MainItem1() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearDial2MainItem1();
                return this;
            }

            public Builder clearDial2Notify() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearDial2Notify();
                return this;
            }

            public Builder clearDialId() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearDialId();
                return this;
            }

            public Builder clearLcdOnBecauseOfEvent() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearLcdOnBecauseOfEvent();
                return this;
            }

            public Builder clearLcdOnBecauseOfPress() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearLcdOnBecauseOfPress();
                return this;
            }

            public Builder clearSettingBacklightPage() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearSettingBacklightPage();
                return this;
            }

            public Builder clearSettingLongpressPage() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearSettingLongpressPage();
                return this;
            }

            public Builder clearSettingPage() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearSettingPage();
                return this;
            }

            public Builder clearSettingWatchfacePage() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearSettingWatchfacePage();
                return this;
            }

            public Builder clearSkipGpsLocationNum() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearSkipGpsLocationNum();
                return this;
            }

            public Builder clearSportHistoryPage() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearSportHistoryPage();
                return this;
            }

            public Builder clearSportPage() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearSportPage();
                return this;
            }

            public Builder clearSportPage1Num() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearSportPage1Num();
                return this;
            }

            public Builder clearSportPage2Num() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearSportPage2Num();
                return this;
            }

            public Builder clearSportPage3Num() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearSportPage3Num();
                return this;
            }

            public Builder clearSportSettingPage() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearSportSettingPage();
                return this;
            }

            public Builder clearStatusPage1() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearStatusPage1();
                return this;
            }

            public Builder clearStatusPage2() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearStatusPage2();
                return this;
            }

            public Builder clearStopwatchNum() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearStopwatchNum();
                return this;
            }

            public Builder clearTimerCountdownPage() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearTimerCountdownPage();
                return this;
            }

            public Builder clearTimerPage() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearTimerPage();
                return this;
            }

            public Builder clearTimerStopwatchPage() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearTimerStopwatchPage();
                return this;
            }

            public Builder clearWaitGpsLocationNum() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearWaitGpsLocationNum();
                return this;
            }

            public Builder clearWeatherPage() {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).clearWeatherPage();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getAlarmPage() {
                return ((ChaoHuEventMessage) this.instance).getAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getAlipayCode128Num() {
                return ((ChaoHuEventMessage) this.instance).getAlipayCode128Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getAlipayQRCodeNum() {
                return ((ChaoHuEventMessage) this.instance).getAlipayQRCodeNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getCompassNum() {
                return ((ChaoHuEventMessage) this.instance).getCompassNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getCompassPage() {
                return ((ChaoHuEventMessage) this.instance).getCompassPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getCountdownNum() {
                return ((ChaoHuEventMessage) this.instance).getCountdownNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getDial2DND() {
                return ((ChaoHuEventMessage) this.instance).getDial2DND();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getDial2MainItem1() {
                return ((ChaoHuEventMessage) this.instance).getDial2MainItem1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getDial2Notify() {
                return ((ChaoHuEventMessage) this.instance).getDial2Notify();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getDialId() {
                return ((ChaoHuEventMessage) this.instance).getDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getLcdOnBecauseOfEvent() {
                return ((ChaoHuEventMessage) this.instance).getLcdOnBecauseOfEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getLcdOnBecauseOfPress() {
                return ((ChaoHuEventMessage) this.instance).getLcdOnBecauseOfPress();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getSettingBacklightPage() {
                return ((ChaoHuEventMessage) this.instance).getSettingBacklightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getSettingLongpressPage() {
                return ((ChaoHuEventMessage) this.instance).getSettingLongpressPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getSettingPage() {
                return ((ChaoHuEventMessage) this.instance).getSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getSettingWatchfacePage() {
                return ((ChaoHuEventMessage) this.instance).getSettingWatchfacePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getSkipGpsLocationNum() {
                return ((ChaoHuEventMessage) this.instance).getSkipGpsLocationNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getSportHistoryPage() {
                return ((ChaoHuEventMessage) this.instance).getSportHistoryPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getSportPage() {
                return ((ChaoHuEventMessage) this.instance).getSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getSportPage1Num() {
                return ((ChaoHuEventMessage) this.instance).getSportPage1Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getSportPage2Num() {
                return ((ChaoHuEventMessage) this.instance).getSportPage2Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getSportPage3Num() {
                return ((ChaoHuEventMessage) this.instance).getSportPage3Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getSportSettingPage() {
                return ((ChaoHuEventMessage) this.instance).getSportSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getStatusPage1() {
                return ((ChaoHuEventMessage) this.instance).getStatusPage1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getStatusPage2() {
                return ((ChaoHuEventMessage) this.instance).getStatusPage2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getStopwatchNum() {
                return ((ChaoHuEventMessage) this.instance).getStopwatchNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getTimerCountdownPage() {
                return ((ChaoHuEventMessage) this.instance).getTimerCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getTimerPage() {
                return ((ChaoHuEventMessage) this.instance).getTimerPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getTimerStopwatchPage() {
                return ((ChaoHuEventMessage) this.instance).getTimerStopwatchPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getWaitGpsLocationNum() {
                return ((ChaoHuEventMessage) this.instance).getWaitGpsLocationNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public int getWeatherPage() {
                return ((ChaoHuEventMessage) this.instance).getWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasAlarmPage() {
                return ((ChaoHuEventMessage) this.instance).hasAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasAlipayCode128Num() {
                return ((ChaoHuEventMessage) this.instance).hasAlipayCode128Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasAlipayQRCodeNum() {
                return ((ChaoHuEventMessage) this.instance).hasAlipayQRCodeNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasCompassNum() {
                return ((ChaoHuEventMessage) this.instance).hasCompassNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasCompassPage() {
                return ((ChaoHuEventMessage) this.instance).hasCompassPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasCountdownNum() {
                return ((ChaoHuEventMessage) this.instance).hasCountdownNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasDial2DND() {
                return ((ChaoHuEventMessage) this.instance).hasDial2DND();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasDial2MainItem1() {
                return ((ChaoHuEventMessage) this.instance).hasDial2MainItem1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasDial2Notify() {
                return ((ChaoHuEventMessage) this.instance).hasDial2Notify();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasDialId() {
                return ((ChaoHuEventMessage) this.instance).hasDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfEvent() {
                return ((ChaoHuEventMessage) this.instance).hasLcdOnBecauseOfEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfPress() {
                return ((ChaoHuEventMessage) this.instance).hasLcdOnBecauseOfPress();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasSettingBacklightPage() {
                return ((ChaoHuEventMessage) this.instance).hasSettingBacklightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasSettingLongpressPage() {
                return ((ChaoHuEventMessage) this.instance).hasSettingLongpressPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasSettingPage() {
                return ((ChaoHuEventMessage) this.instance).hasSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasSettingWatchfacePage() {
                return ((ChaoHuEventMessage) this.instance).hasSettingWatchfacePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasSkipGpsLocationNum() {
                return ((ChaoHuEventMessage) this.instance).hasSkipGpsLocationNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasSportHistoryPage() {
                return ((ChaoHuEventMessage) this.instance).hasSportHistoryPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasSportPage() {
                return ((ChaoHuEventMessage) this.instance).hasSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasSportPage1Num() {
                return ((ChaoHuEventMessage) this.instance).hasSportPage1Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasSportPage2Num() {
                return ((ChaoHuEventMessage) this.instance).hasSportPage2Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasSportPage3Num() {
                return ((ChaoHuEventMessage) this.instance).hasSportPage3Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasSportSettingPage() {
                return ((ChaoHuEventMessage) this.instance).hasSportSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasStatusPage1() {
                return ((ChaoHuEventMessage) this.instance).hasStatusPage1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasStatusPage2() {
                return ((ChaoHuEventMessage) this.instance).hasStatusPage2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasStopwatchNum() {
                return ((ChaoHuEventMessage) this.instance).hasStopwatchNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasTimerCountdownPage() {
                return ((ChaoHuEventMessage) this.instance).hasTimerCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasTimerPage() {
                return ((ChaoHuEventMessage) this.instance).hasTimerPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasTimerStopwatchPage() {
                return ((ChaoHuEventMessage) this.instance).hasTimerStopwatchPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasWaitGpsLocationNum() {
                return ((ChaoHuEventMessage) this.instance).hasWaitGpsLocationNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
            public boolean hasWeatherPage() {
                return ((ChaoHuEventMessage) this.instance).hasWeatherPage();
            }

            public Builder setAlarmPage(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setAlarmPage(value);
                return this;
            }

            public Builder setAlipayCode128Num(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setAlipayCode128Num(value);
                return this;
            }

            public Builder setAlipayQRCodeNum(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setAlipayQRCodeNum(value);
                return this;
            }

            public Builder setCompassNum(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setCompassNum(value);
                return this;
            }

            public Builder setCompassPage(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setCompassPage(value);
                return this;
            }

            public Builder setCountdownNum(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setCountdownNum(value);
                return this;
            }

            public Builder setDial2DND(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setDial2DND(value);
                return this;
            }

            public Builder setDial2MainItem1(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setDial2MainItem1(value);
                return this;
            }

            public Builder setDial2Notify(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setDial2Notify(value);
                return this;
            }

            public Builder setDialId(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setDialId(value);
                return this;
            }

            public Builder setLcdOnBecauseOfEvent(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setLcdOnBecauseOfEvent(value);
                return this;
            }

            public Builder setLcdOnBecauseOfPress(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setLcdOnBecauseOfPress(value);
                return this;
            }

            public Builder setSettingBacklightPage(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setSettingBacklightPage(value);
                return this;
            }

            public Builder setSettingLongpressPage(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setSettingLongpressPage(value);
                return this;
            }

            public Builder setSettingPage(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setSettingPage(value);
                return this;
            }

            public Builder setSettingWatchfacePage(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setSettingWatchfacePage(value);
                return this;
            }

            public Builder setSkipGpsLocationNum(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setSkipGpsLocationNum(value);
                return this;
            }

            public Builder setSportHistoryPage(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setSportHistoryPage(value);
                return this;
            }

            public Builder setSportPage(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setSportPage(value);
                return this;
            }

            public Builder setSportPage1Num(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setSportPage1Num(value);
                return this;
            }

            public Builder setSportPage2Num(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setSportPage2Num(value);
                return this;
            }

            public Builder setSportPage3Num(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setSportPage3Num(value);
                return this;
            }

            public Builder setSportSettingPage(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setSportSettingPage(value);
                return this;
            }

            public Builder setStatusPage1(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setStatusPage1(value);
                return this;
            }

            public Builder setStatusPage2(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setStatusPage2(value);
                return this;
            }

            public Builder setStopwatchNum(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setStopwatchNum(value);
                return this;
            }

            public Builder setTimerCountdownPage(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setTimerCountdownPage(value);
                return this;
            }

            public Builder setTimerPage(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setTimerPage(value);
                return this;
            }

            public Builder setTimerStopwatchPage(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setTimerStopwatchPage(value);
                return this;
            }

            public Builder setWaitGpsLocationNum(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setWaitGpsLocationNum(value);
                return this;
            }

            public Builder setWeatherPage(int value) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setWeatherPage(value);
                return this;
            }

            private Builder() {
                super(ChaoHuEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            ChaoHuEventMessage chaoHuEventMessage = new ChaoHuEventMessage();
            DEFAULT_INSTANCE = chaoHuEventMessage;
            GeneratedMessageLite.registerDefaultInstance(ChaoHuEventMessage.class, chaoHuEventMessage);
        }

        private ChaoHuEventMessage() {
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

        public static ChaoHuEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ChaoHuEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (ChaoHuEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static ChaoHuEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (ChaoHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<ChaoHuEventMessage> parser() {
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
                    return new ChaoHuEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001f\u0000\u0001\u0001\u001f\u001f\u0000\u0000\u001c\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f\u0011ᔋ\u0010\u0012ᔋ\u0011\u0013ᔋ\u0012\u0014ᔋ\u0013\u0015ᔋ\u0014\u0016ᔋ\u0015\u0017ᔋ\u0016\u0018ᔋ\u0017\u0019ᔋ\u0018\u001aᔋ\u0019\u001bᔋ\u001a\u001cᔋ\u001b\u001dဋ\u001c\u001eဋ\u001d\u001fဋ\u001e", new Object[]{"bitField0_", "lcdOnBecauseOfPress_", "lcdOnBecauseOfEvent_", "dial2DND_", "dial2Notify_", "dial2MainItem1_", "statusPage1_", "statusPage2_", "sportPage_", "sportHistoryPage_", "sportSettingPage_", "weatherPage_", "alarmPage_", "timerPage_", "timerStopwatchPage_", "timerCountdownPage_", "compassPage_", "settingPage_", "settingWatchfacePage_", "settingLongpressPage_", "settingBacklightPage_", "waitGpsLocationNum_", "skipGpsLocationNum_", "sportPage1Num_", "sportPage2Num_", "sportPage3Num_", "stopwatchNum_", "countdownNum_", "compassNum_", "alipayQRCodeNum_", "alipayCode128Num_", "dialId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ChaoHuEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ChaoHuEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getAlarmPage() {
            return this.alarmPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getAlipayCode128Num() {
            return this.alipayCode128Num_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getAlipayQRCodeNum() {
            return this.alipayQRCodeNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getCompassNum() {
            return this.compassNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getCompassPage() {
            return this.compassPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getCountdownNum() {
            return this.countdownNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getDial2DND() {
            return this.dial2DND_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getDial2MainItem1() {
            return this.dial2MainItem1_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getDial2Notify() {
            return this.dial2Notify_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getDialId() {
            return this.dialId_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getLcdOnBecauseOfEvent() {
            return this.lcdOnBecauseOfEvent_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getLcdOnBecauseOfPress() {
            return this.lcdOnBecauseOfPress_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getSettingBacklightPage() {
            return this.settingBacklightPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getSettingLongpressPage() {
            return this.settingLongpressPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getSettingPage() {
            return this.settingPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getSettingWatchfacePage() {
            return this.settingWatchfacePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getSkipGpsLocationNum() {
            return this.skipGpsLocationNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getSportHistoryPage() {
            return this.sportHistoryPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getSportPage() {
            return this.sportPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getSportPage1Num() {
            return this.sportPage1Num_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getSportPage2Num() {
            return this.sportPage2Num_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getSportPage3Num() {
            return this.sportPage3Num_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getSportSettingPage() {
            return this.sportSettingPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getStatusPage1() {
            return this.statusPage1_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getStatusPage2() {
            return this.statusPage2_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getStopwatchNum() {
            return this.stopwatchNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getTimerCountdownPage() {
            return this.timerCountdownPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getTimerPage() {
            return this.timerPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getTimerStopwatchPage() {
            return this.timerStopwatchPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getWaitGpsLocationNum() {
            return this.waitGpsLocationNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public int getWeatherPage() {
            return this.weatherPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasAlarmPage() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasAlipayCode128Num() {
            return (this.bitField0_ & 536870912) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasAlipayQRCodeNum() {
            return (this.bitField0_ & 268435456) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasCompassNum() {
            return (this.bitField0_ & AMapEngineUtils.HALF_MAX_P20_WIDTH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasCompassPage() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasCountdownNum() {
            return (this.bitField0_ & 67108864) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasDial2DND() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasDial2MainItem1() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasDial2Notify() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasDialId() {
            return (this.bitField0_ & 1073741824) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfEvent() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfPress() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasSettingBacklightPage() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasSettingLongpressPage() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasSettingPage() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasSettingWatchfacePage() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasSkipGpsLocationNum() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasSportHistoryPage() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasSportPage() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasSportPage1Num() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasSportPage2Num() {
            return (this.bitField0_ & 8388608) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasSportPage3Num() {
            return (this.bitField0_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasSportSettingPage() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasStatusPage1() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasStatusPage2() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasStopwatchNum() {
            return (this.bitField0_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasTimerCountdownPage() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasTimerPage() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasTimerStopwatchPage() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasWaitGpsLocationNum() {
            return (this.bitField0_ & 1048576) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasWeatherPage() {
            return (this.bitField0_ & 1024) != 0;
        }

        public static Builder newBuilder(ChaoHuEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static ChaoHuEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ChaoHuEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ChaoHuEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ChaoHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ChaoHuEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ChaoHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ChaoHuEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ChaoHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ChaoHuEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ChaoHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ChaoHuEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ChaoHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ChaoHuEventMessage parseFrom(InputStream input) throws IOException {
            return (ChaoHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ChaoHuEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ChaoHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ChaoHuEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (ChaoHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ChaoHuEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ChaoHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface ChaoHuEventMessageOrBuilder extends MessageLiteOrBuilder {
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
    }

    public static final class ChaoHuStatisticsMessage extends GeneratedMessageLite<ChaoHuStatisticsMessage, Builder> implements ChaoHuStatisticsMessageOrBuilder {
        public static final int ADDEVENT_FIELD_NUMBER = 5;
        public static final int BACKLIGHTLEVEL_FIELD_NUMBER = 3;
        public static final int BASE_FIELD_NUMBER = 1;
        private static final ChaoHuStatisticsMessage DEFAULT_INSTANCE;
        public static final int EVENT_FIELD_NUMBER = 4;
        private static volatile Parser<ChaoHuStatisticsMessage> PARSER = null;
        public static final int SILENCEMODE_FIELD_NUMBER = 2;
        private ChaoHuAddEventMessage addEvent_;
        private int backlightLevel_;
        private StatisBase.StatisBaseMessage base_;
        private int bitField0_;
        private ChaoHuEventMessage event_;
        private byte memoizedIsInitialized = 2;
        private int silenceMode_;

        public static final class Builder extends GeneratedMessageLite.Builder<ChaoHuStatisticsMessage, Builder> implements ChaoHuStatisticsMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAddEvent() {
                copyOnWrite();
                ((ChaoHuStatisticsMessage) this.instance).clearAddEvent();
                return this;
            }

            public Builder clearBacklightLevel() {
                copyOnWrite();
                ((ChaoHuStatisticsMessage) this.instance).clearBacklightLevel();
                return this;
            }

            public Builder clearBase() {
                copyOnWrite();
                ((ChaoHuStatisticsMessage) this.instance).clearBase();
                return this;
            }

            public Builder clearEvent() {
                copyOnWrite();
                ((ChaoHuStatisticsMessage) this.instance).clearEvent();
                return this;
            }

            public Builder clearSilenceMode() {
                copyOnWrite();
                ((ChaoHuStatisticsMessage) this.instance).clearSilenceMode();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuStatisticsMessageOrBuilder
            public ChaoHuAddEventMessage getAddEvent() {
                return ((ChaoHuStatisticsMessage) this.instance).getAddEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuStatisticsMessageOrBuilder
            public int getBacklightLevel() {
                return ((ChaoHuStatisticsMessage) this.instance).getBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuStatisticsMessageOrBuilder
            public StatisBase.StatisBaseMessage getBase() {
                return ((ChaoHuStatisticsMessage) this.instance).getBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuStatisticsMessageOrBuilder
            public ChaoHuEventMessage getEvent() {
                return ((ChaoHuStatisticsMessage) this.instance).getEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuStatisticsMessageOrBuilder
            public SilenceModeOuterClass.SilenceMode getSilenceMode() {
                return ((ChaoHuStatisticsMessage) this.instance).getSilenceMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuStatisticsMessageOrBuilder
            public boolean hasAddEvent() {
                return ((ChaoHuStatisticsMessage) this.instance).hasAddEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuStatisticsMessageOrBuilder
            public boolean hasBacklightLevel() {
                return ((ChaoHuStatisticsMessage) this.instance).hasBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuStatisticsMessageOrBuilder
            public boolean hasBase() {
                return ((ChaoHuStatisticsMessage) this.instance).hasBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuStatisticsMessageOrBuilder
            public boolean hasEvent() {
                return ((ChaoHuStatisticsMessage) this.instance).hasEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuStatisticsMessageOrBuilder
            public boolean hasSilenceMode() {
                return ((ChaoHuStatisticsMessage) this.instance).hasSilenceMode();
            }

            public Builder mergeAddEvent(ChaoHuAddEventMessage value) {
                copyOnWrite();
                ((ChaoHuStatisticsMessage) this.instance).mergeAddEvent(value);
                return this;
            }

            public Builder mergeBase(StatisBase.StatisBaseMessage value) {
                copyOnWrite();
                ((ChaoHuStatisticsMessage) this.instance).mergeBase(value);
                return this;
            }

            public Builder mergeEvent(ChaoHuEventMessage value) {
                copyOnWrite();
                ((ChaoHuStatisticsMessage) this.instance).mergeEvent(value);
                return this;
            }

            public Builder setAddEvent(ChaoHuAddEventMessage value) {
                copyOnWrite();
                ((ChaoHuStatisticsMessage) this.instance).setAddEvent(value);
                return this;
            }

            public Builder setBacklightLevel(int value) {
                copyOnWrite();
                ((ChaoHuStatisticsMessage) this.instance).setBacklightLevel(value);
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage value) {
                copyOnWrite();
                ((ChaoHuStatisticsMessage) this.instance).setBase(value);
                return this;
            }

            public Builder setEvent(ChaoHuEventMessage value) {
                copyOnWrite();
                ((ChaoHuStatisticsMessage) this.instance).setEvent(value);
                return this;
            }

            public Builder setSilenceMode(SilenceModeOuterClass.SilenceMode value) {
                copyOnWrite();
                ((ChaoHuStatisticsMessage) this.instance).setSilenceMode(value);
                return this;
            }

            private Builder() {
                super(ChaoHuStatisticsMessage.DEFAULT_INSTANCE);
            }

            public Builder setAddEvent(ChaoHuAddEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((ChaoHuStatisticsMessage) this.instance).setAddEvent(builderForValue.build());
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage.Builder builderForValue) {
                copyOnWrite();
                ((ChaoHuStatisticsMessage) this.instance).setBase(builderForValue.build());
                return this;
            }

            public Builder setEvent(ChaoHuEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((ChaoHuStatisticsMessage) this.instance).setEvent(builderForValue.build());
                return this;
            }
        }

        static {
            ChaoHuStatisticsMessage chaoHuStatisticsMessage = new ChaoHuStatisticsMessage();
            DEFAULT_INSTANCE = chaoHuStatisticsMessage;
            GeneratedMessageLite.registerDefaultInstance(ChaoHuStatisticsMessage.class, chaoHuStatisticsMessage);
        }

        private ChaoHuStatisticsMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAddEvent() {
            this.addEvent_ = null;
            this.bitField0_ &= -17;
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

        public static ChaoHuStatisticsMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeAddEvent(ChaoHuAddEventMessage value) {
            value.getClass();
            ChaoHuAddEventMessage chaoHuAddEventMessage = this.addEvent_;
            if (chaoHuAddEventMessage == null || chaoHuAddEventMessage == ChaoHuAddEventMessage.getDefaultInstance()) {
                this.addEvent_ = value;
            } else {
                this.addEvent_ = ChaoHuAddEventMessage.newBuilder(this.addEvent_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 16;
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
        public void mergeEvent(ChaoHuEventMessage value) {
            value.getClass();
            ChaoHuEventMessage chaoHuEventMessage = this.event_;
            if (chaoHuEventMessage == null || chaoHuEventMessage == ChaoHuEventMessage.getDefaultInstance()) {
                this.event_ = value;
            } else {
                this.event_ = ChaoHuEventMessage.newBuilder(this.event_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ChaoHuStatisticsMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (ChaoHuStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static ChaoHuStatisticsMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (ChaoHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<ChaoHuStatisticsMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddEvent(ChaoHuAddEventMessage value) {
            value.getClass();
            this.addEvent_ = value;
            this.bitField0_ |= 16;
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
        public void setEvent(ChaoHuEventMessage value) {
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
                    return new ChaoHuStatisticsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001ᔉ\u0000\u0002ᔌ\u0001\u0003ᔋ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"bitField0_", "base_", "silenceMode_", SilenceModeOuterClass.SilenceMode.internalGetVerifier(), "backlightLevel_", "event_", "addEvent_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ChaoHuStatisticsMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ChaoHuStatisticsMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuStatisticsMessageOrBuilder
        public ChaoHuAddEventMessage getAddEvent() {
            ChaoHuAddEventMessage chaoHuAddEventMessage = this.addEvent_;
            return chaoHuAddEventMessage == null ? ChaoHuAddEventMessage.getDefaultInstance() : chaoHuAddEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuStatisticsMessageOrBuilder
        public int getBacklightLevel() {
            return this.backlightLevel_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuStatisticsMessageOrBuilder
        public StatisBase.StatisBaseMessage getBase() {
            StatisBase.StatisBaseMessage statisBaseMessage = this.base_;
            return statisBaseMessage == null ? StatisBase.StatisBaseMessage.getDefaultInstance() : statisBaseMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuStatisticsMessageOrBuilder
        public ChaoHuEventMessage getEvent() {
            ChaoHuEventMessage chaoHuEventMessage = this.event_;
            return chaoHuEventMessage == null ? ChaoHuEventMessage.getDefaultInstance() : chaoHuEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuStatisticsMessageOrBuilder
        public SilenceModeOuterClass.SilenceMode getSilenceMode() {
            SilenceModeOuterClass.SilenceMode silenceModeForNumber = SilenceModeOuterClass.SilenceMode.forNumber(this.silenceMode_);
            return silenceModeForNumber == null ? SilenceModeOuterClass.SilenceMode.OFF : silenceModeForNumber;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuStatisticsMessageOrBuilder
        public boolean hasAddEvent() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuStatisticsMessageOrBuilder
        public boolean hasBacklightLevel() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuStatisticsMessageOrBuilder
        public boolean hasBase() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuStatisticsMessageOrBuilder
        public boolean hasEvent() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuStatisticsMessageOrBuilder
        public boolean hasSilenceMode() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(ChaoHuStatisticsMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static ChaoHuStatisticsMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ChaoHuStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ChaoHuStatisticsMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ChaoHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ChaoHuStatisticsMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (ChaoHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ChaoHuStatisticsMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ChaoHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ChaoHuStatisticsMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (ChaoHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static ChaoHuStatisticsMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (ChaoHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static ChaoHuStatisticsMessage parseFrom(InputStream input) throws IOException {
            return (ChaoHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ChaoHuStatisticsMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ChaoHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static ChaoHuStatisticsMessage parseFrom(CodedInputStream input) throws IOException {
            return (ChaoHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static ChaoHuStatisticsMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (ChaoHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface ChaoHuStatisticsMessageOrBuilder extends MessageLiteOrBuilder {
        ChaoHuAddEventMessage getAddEvent();

        int getBacklightLevel();

        StatisBase.StatisBaseMessage getBase();

        ChaoHuEventMessage getEvent();

        SilenceModeOuterClass.SilenceMode getSilenceMode();

        boolean hasAddEvent();

        boolean hasBacklightLevel();

        boolean hasBase();

        boolean hasEvent();

        boolean hasSilenceMode();
    }

    private Chaohu() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }
}
