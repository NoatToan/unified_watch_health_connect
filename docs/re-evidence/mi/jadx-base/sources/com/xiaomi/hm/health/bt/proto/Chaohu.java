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
        private static volatile vkh<ChaoHuAddEventMessage> PARSER = null;
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

        public static final class Builder extends GeneratedMessageLite.a<ChaoHuAddEventMessage, Builder> implements ChaoHuAddEventMessageOrBuilder {
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

            public Builder setAlarmCloseTimes(int i) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setAlarmCloseTimes(i);
                return this;
            }

            public Builder setAlarmOpenTimes(int i) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setAlarmOpenTimes(i);
                return this;
            }

            public Builder setAlarmReminderClose(int i) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setAlarmReminderClose(i);
                return this;
            }

            public Builder setAlarmReminderLaterOn(int i) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setAlarmReminderLaterOn(i);
                return this;
            }

            public Builder setAlipayCode128Times(int i) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setAlipayCode128Times(i);
                return this;
            }

            public Builder setAlipayQRCodeTimes(int i) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setAlipayQRCodeTimes(i);
                return this;
            }

            public Builder setAppNotifRemindDisCount(int i) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setAppNotifRemindDisCount(i);
                return this;
            }

            public Builder setCallingRemindDisCount(int i) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setCallingRemindDisCount(i);
                return this;
            }

            public Builder setDisconnectDisCount(int i) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setDisconnectDisCount(i);
                return this;
            }

            public Builder setFactoryResetPage(int i) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setFactoryResetPage(i);
                return this;
            }

            public Builder setFindPhoneFail(int i) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setFindPhoneFail(i);
                return this;
            }

            public Builder setFindPhonePage(int i) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setFindPhonePage(i);
                return this;
            }

            public Builder setFindPhoneSucc(int i) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setFindPhoneSucc(i);
                return this;
            }

            public Builder setLongSitRemindDisCount(int i) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setLongSitRemindDisCount(i);
                return this;
            }

            public Builder setNegativePage(int i) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setNegativePage(i);
                return this;
            }

            public Builder setReminderPage(int i) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setReminderPage(i);
                return this;
            }

            public Builder setSetPowerOffCount(int i) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setSetPowerOffCount(i);
                return this;
            }

            public Builder setSportGPSLocationMaxTime(int i) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setSportGPSLocationMaxTime(i);
                return this;
            }

            public Builder setSportGPSLocationMinTime(int i) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setSportGPSLocationMinTime(i);
                return this;
            }

            public Builder setSportLinkLost(int i) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setSportLinkLost(i);
                return this;
            }

            public Builder setSportLinkRecover(int i) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setSportLinkRecover(i);
                return this;
            }

            public Builder setSportLocationSucccTime(int i) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setSportLocationSucccTime(i);
                return this;
            }

            public Builder setStatusPage(int i) {
                copyOnWrite();
                ((ChaoHuAddEventMessage) this.instance).setStatusPage(i);
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

        public static ChaoHuAddEventMessage parseDelimitedFrom(InputStream inputStream) {
            return (ChaoHuAddEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChaoHuAddEventMessage parseFrom(ByteBuffer byteBuffer) {
            return (ChaoHuAddEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<ChaoHuAddEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmCloseTimes(int i) {
            this.bitField0_ |= 8;
            this.alarmCloseTimes_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmOpenTimes(int i) {
            this.bitField0_ |= 4;
            this.alarmOpenTimes_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmReminderClose(int i) {
            this.bitField0_ |= 2048;
            this.alarmReminderClose_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlarmReminderLaterOn(int i) {
            this.bitField0_ |= 1024;
            this.alarmReminderLaterOn_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayCode128Times(int i) {
            this.bitField0_ |= 262144;
            this.alipayCode128Times_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAlipayQRCodeTimes(int i) {
            this.bitField0_ |= 131072;
            this.alipayQRCodeTimes_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAppNotifRemindDisCount(int i) {
            this.bitField0_ |= 524288;
            this.appNotifRemindDisCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCallingRemindDisCount(int i) {
            this.bitField0_ |= EventRecurrence.TH;
            this.callingRemindDisCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDisconnectDisCount(int i) {
            this.bitField0_ |= 4194304;
            this.disconnectDisCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFactoryResetPage(int i) {
            this.bitField0_ |= 256;
            this.factoryResetPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFindPhoneFail(int i) {
            this.bitField0_ |= 64;
            this.findPhoneFail_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFindPhonePage(int i) {
            this.bitField0_ |= 16;
            this.findPhonePage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFindPhoneSucc(int i) {
            this.bitField0_ |= 32;
            this.findPhoneSucc_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLongSitRemindDisCount(int i) {
            this.bitField0_ |= 2097152;
            this.longSitRemindDisCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNegativePage(int i) {
            this.bitField0_ |= 2;
            this.negativePage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReminderPage(int i) {
            this.bitField0_ |= 512;
            this.reminderPage_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSetPowerOffCount(int i) {
            this.bitField0_ |= 128;
            this.setPowerOffCount_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportGPSLocationMaxTime(int i) {
            this.bitField0_ |= 32768;
            this.sportGPSLocationMaxTime_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportGPSLocationMinTime(int i) {
            this.bitField0_ |= 16384;
            this.sportGPSLocationMinTime_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportLinkLost(int i) {
            this.bitField0_ |= 4096;
            this.sportLinkLost_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportLinkRecover(int i) {
            this.bitField0_ |= 8192;
            this.sportLinkRecover_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportLocationSucccTime(int i) {
            this.bitField0_ |= 65536;
            this.sportLocationSucccTime_ = i;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStatusPage(int i) {
            this.bitField0_ |= 1;
            this.statusPage_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
                case 1:
                    return new ChaoHuAddEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0017\u0000\u0001\u0001\u0017\u0017\u0000\u0000\u0017\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f\u0011ᔋ\u0010\u0012ᔋ\u0011\u0013ᔋ\u0012\u0014ᔋ\u0013\u0015ᔋ\u0014\u0016ᔋ\u0015\u0017ᔋ\u0016", new Object[]{"bitField0_", "statusPage_", "negativePage_", "alarmOpenTimes_", "alarmCloseTimes_", "findPhonePage_", "findPhoneSucc_", "findPhoneFail_", "setPowerOffCount_", "factoryResetPage_", "reminderPage_", "alarmReminderLaterOn_", "alarmReminderClose_", "sportLinkLost_", "sportLinkRecover_", "sportGPSLocationMinTime_", "sportGPSLocationMaxTime_", "sportLocationSucccTime_", "alipayQRCodeTimes_", "alipayCode128Times_", "appNotifRemindDisCount_", "callingRemindDisCount_", "longSitRemindDisCount_", "disconnectDisCount_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<ChaoHuAddEventMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (ChaoHuAddEventMessage.class) {
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
            return (this.bitField0_ & EventRecurrence.TH) != 0;
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

        public static Builder newBuilder(ChaoHuAddEventMessage chaoHuAddEventMessage) {
            return DEFAULT_INSTANCE.createBuilder(chaoHuAddEventMessage);
        }

        public static ChaoHuAddEventMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (ChaoHuAddEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static ChaoHuAddEventMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (ChaoHuAddEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static ChaoHuAddEventMessage parseFrom(ByteString byteString) {
            return (ChaoHuAddEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ChaoHuAddEventMessage parseFrom(ByteString byteString, t tVar) {
            return (ChaoHuAddEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static ChaoHuAddEventMessage parseFrom(byte[] bArr) {
            return (ChaoHuAddEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ChaoHuAddEventMessage parseFrom(byte[] bArr, t tVar) {
            return (ChaoHuAddEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static ChaoHuAddEventMessage parseFrom(InputStream inputStream) {
            return (ChaoHuAddEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChaoHuAddEventMessage parseFrom(InputStream inputStream, t tVar) {
            return (ChaoHuAddEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static ChaoHuAddEventMessage parseFrom(j jVar) {
            return (ChaoHuAddEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static ChaoHuAddEventMessage parseFrom(j jVar, t tVar) {
            return (ChaoHuAddEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface ChaoHuAddEventMessageOrBuilder extends bsf {
        int getAlarmCloseTimes();

        int getAlarmOpenTimes();

        int getAlarmReminderClose();

        int getAlarmReminderLaterOn();

        int getAlipayCode128Times();

        int getAlipayQRCodeTimes();

        int getAppNotifRemindDisCount();

        int getCallingRemindDisCount();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

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

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
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
        private static volatile vkh<ChaoHuEventMessage> PARSER = null;
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

        public static final class Builder extends GeneratedMessageLite.a<ChaoHuEventMessage, Builder> implements ChaoHuEventMessageOrBuilder {
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

            public Builder setAlarmPage(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setAlarmPage(i);
                return this;
            }

            public Builder setAlipayCode128Num(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setAlipayCode128Num(i);
                return this;
            }

            public Builder setAlipayQRCodeNum(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setAlipayQRCodeNum(i);
                return this;
            }

            public Builder setCompassNum(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setCompassNum(i);
                return this;
            }

            public Builder setCompassPage(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setCompassPage(i);
                return this;
            }

            public Builder setCountdownNum(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setCountdownNum(i);
                return this;
            }

            public Builder setDial2DND(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setDial2DND(i);
                return this;
            }

            public Builder setDial2MainItem1(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setDial2MainItem1(i);
                return this;
            }

            public Builder setDial2Notify(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setDial2Notify(i);
                return this;
            }

            public Builder setDialId(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setDialId(i);
                return this;
            }

            public Builder setLcdOnBecauseOfEvent(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setLcdOnBecauseOfEvent(i);
                return this;
            }

            public Builder setLcdOnBecauseOfPress(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setLcdOnBecauseOfPress(i);
                return this;
            }

            public Builder setSettingBacklightPage(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setSettingBacklightPage(i);
                return this;
            }

            public Builder setSettingLongpressPage(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setSettingLongpressPage(i);
                return this;
            }

            public Builder setSettingPage(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setSettingPage(i);
                return this;
            }

            public Builder setSettingWatchfacePage(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setSettingWatchfacePage(i);
                return this;
            }

            public Builder setSkipGpsLocationNum(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setSkipGpsLocationNum(i);
                return this;
            }

            public Builder setSportHistoryPage(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setSportHistoryPage(i);
                return this;
            }

            public Builder setSportPage(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setSportPage(i);
                return this;
            }

            public Builder setSportPage1Num(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setSportPage1Num(i);
                return this;
            }

            public Builder setSportPage2Num(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setSportPage2Num(i);
                return this;
            }

            public Builder setSportPage3Num(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setSportPage3Num(i);
                return this;
            }

            public Builder setSportSettingPage(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setSportSettingPage(i);
                return this;
            }

            public Builder setStatusPage1(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setStatusPage1(i);
                return this;
            }

            public Builder setStatusPage2(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setStatusPage2(i);
                return this;
            }

            public Builder setStopwatchNum(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setStopwatchNum(i);
                return this;
            }

            public Builder setTimerCountdownPage(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setTimerCountdownPage(i);
                return this;
            }

            public Builder setTimerPage(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setTimerPage(i);
                return this;
            }

            public Builder setTimerStopwatchPage(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setTimerStopwatchPage(i);
                return this;
            }

            public Builder setWaitGpsLocationNum(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setWaitGpsLocationNum(i);
                return this;
            }

            public Builder setWeatherPage(int i) {
                copyOnWrite();
                ((ChaoHuEventMessage) this.instance).setWeatherPage(i);
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

        public static ChaoHuEventMessage parseDelimitedFrom(InputStream inputStream) {
            return (ChaoHuEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChaoHuEventMessage parseFrom(ByteBuffer byteBuffer) {
            return (ChaoHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<ChaoHuEventMessage> parser() {
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
                    return new ChaoHuEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001f\u0000\u0001\u0001\u001f\u001f\u0000\u0000\u001c\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f\u0011ᔋ\u0010\u0012ᔋ\u0011\u0013ᔋ\u0012\u0014ᔋ\u0013\u0015ᔋ\u0014\u0016ᔋ\u0015\u0017ᔋ\u0016\u0018ᔋ\u0017\u0019ᔋ\u0018\u001aᔋ\u0019\u001bᔋ\u001a\u001cᔋ\u001b\u001dဋ\u001c\u001eဋ\u001d\u001fဋ\u001e", new Object[]{"bitField0_", "lcdOnBecauseOfPress_", "lcdOnBecauseOfEvent_", "dial2DND_", "dial2Notify_", "dial2MainItem1_", "statusPage1_", "statusPage2_", "sportPage_", "sportHistoryPage_", "sportSettingPage_", "weatherPage_", "alarmPage_", "timerPage_", "timerStopwatchPage_", "timerCountdownPage_", "compassPage_", "settingPage_", "settingWatchfacePage_", "settingLongpressPage_", "settingBacklightPage_", "waitGpsLocationNum_", "skipGpsLocationNum_", "sportPage1Num_", "sportPage2Num_", "sportPage3Num_", "stopwatchNum_", "countdownNum_", "compassNum_", "alipayQRCodeNum_", "alipayCode128Num_", "dialId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<ChaoHuEventMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (ChaoHuEventMessage.class) {
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
            return (this.bitField0_ & 134217728) != 0;
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
            return (this.bitField0_ & NetProxyComponentKt.DEVICE_CAPABILITY_NET_PROXY) != 0;
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
            return (this.bitField0_ & EventRecurrence.TH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Chaohu.ChaoHuEventMessageOrBuilder
        public boolean hasWeatherPage() {
            return (this.bitField0_ & 1024) != 0;
        }

        public static Builder newBuilder(ChaoHuEventMessage chaoHuEventMessage) {
            return DEFAULT_INSTANCE.createBuilder(chaoHuEventMessage);
        }

        public static ChaoHuEventMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (ChaoHuEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static ChaoHuEventMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (ChaoHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static ChaoHuEventMessage parseFrom(ByteString byteString) {
            return (ChaoHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ChaoHuEventMessage parseFrom(ByteString byteString, t tVar) {
            return (ChaoHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static ChaoHuEventMessage parseFrom(byte[] bArr) {
            return (ChaoHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ChaoHuEventMessage parseFrom(byte[] bArr, t tVar) {
            return (ChaoHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static ChaoHuEventMessage parseFrom(InputStream inputStream) {
            return (ChaoHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChaoHuEventMessage parseFrom(InputStream inputStream, t tVar) {
            return (ChaoHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static ChaoHuEventMessage parseFrom(j jVar) {
            return (ChaoHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static ChaoHuEventMessage parseFrom(j jVar, t tVar) {
            return (ChaoHuEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface ChaoHuEventMessageOrBuilder extends bsf {
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

    public static final class ChaoHuStatisticsMessage extends GeneratedMessageLite<ChaoHuStatisticsMessage, Builder> implements ChaoHuStatisticsMessageOrBuilder {
        public static final int ADDEVENT_FIELD_NUMBER = 5;
        public static final int BACKLIGHTLEVEL_FIELD_NUMBER = 3;
        public static final int BASE_FIELD_NUMBER = 1;
        private static final ChaoHuStatisticsMessage DEFAULT_INSTANCE;
        public static final int EVENT_FIELD_NUMBER = 4;
        private static volatile vkh<ChaoHuStatisticsMessage> PARSER = null;
        public static final int SILENCEMODE_FIELD_NUMBER = 2;
        private ChaoHuAddEventMessage addEvent_;
        private int backlightLevel_;
        private StatisBase.StatisBaseMessage base_;
        private int bitField0_;
        private ChaoHuEventMessage event_;
        private byte memoizedIsInitialized = 2;
        private int silenceMode_;

        public static final class Builder extends GeneratedMessageLite.a<ChaoHuStatisticsMessage, Builder> implements ChaoHuStatisticsMessageOrBuilder {
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

            public Builder mergeAddEvent(ChaoHuAddEventMessage chaoHuAddEventMessage) {
                copyOnWrite();
                ((ChaoHuStatisticsMessage) this.instance).mergeAddEvent(chaoHuAddEventMessage);
                return this;
            }

            public Builder mergeBase(StatisBase.StatisBaseMessage statisBaseMessage) {
                copyOnWrite();
                ((ChaoHuStatisticsMessage) this.instance).mergeBase(statisBaseMessage);
                return this;
            }

            public Builder mergeEvent(ChaoHuEventMessage chaoHuEventMessage) {
                copyOnWrite();
                ((ChaoHuStatisticsMessage) this.instance).mergeEvent(chaoHuEventMessage);
                return this;
            }

            public Builder setAddEvent(ChaoHuAddEventMessage chaoHuAddEventMessage) {
                copyOnWrite();
                ((ChaoHuStatisticsMessage) this.instance).setAddEvent(chaoHuAddEventMessage);
                return this;
            }

            public Builder setBacklightLevel(int i) {
                copyOnWrite();
                ((ChaoHuStatisticsMessage) this.instance).setBacklightLevel(i);
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage statisBaseMessage) {
                copyOnWrite();
                ((ChaoHuStatisticsMessage) this.instance).setBase(statisBaseMessage);
                return this;
            }

            public Builder setEvent(ChaoHuEventMessage chaoHuEventMessage) {
                copyOnWrite();
                ((ChaoHuStatisticsMessage) this.instance).setEvent(chaoHuEventMessage);
                return this;
            }

            public Builder setSilenceMode(SilenceModeOuterClass.SilenceMode silenceMode) {
                copyOnWrite();
                ((ChaoHuStatisticsMessage) this.instance).setSilenceMode(silenceMode);
                return this;
            }

            private Builder() {
                super(ChaoHuStatisticsMessage.DEFAULT_INSTANCE);
            }

            public Builder setAddEvent(ChaoHuAddEventMessage.Builder builder) {
                copyOnWrite();
                ((ChaoHuStatisticsMessage) this.instance).setAddEvent(builder.build());
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage.Builder builder) {
                copyOnWrite();
                ((ChaoHuStatisticsMessage) this.instance).setBase(builder.build());
                return this;
            }

            public Builder setEvent(ChaoHuEventMessage.Builder builder) {
                copyOnWrite();
                ((ChaoHuStatisticsMessage) this.instance).setEvent(builder.build());
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
        public void mergeAddEvent(ChaoHuAddEventMessage chaoHuAddEventMessage) {
            chaoHuAddEventMessage.getClass();
            ChaoHuAddEventMessage chaoHuAddEventMessage2 = this.addEvent_;
            if (chaoHuAddEventMessage2 == null || chaoHuAddEventMessage2 == ChaoHuAddEventMessage.getDefaultInstance()) {
                this.addEvent_ = chaoHuAddEventMessage;
            } else {
                this.addEvent_ = ChaoHuAddEventMessage.newBuilder(this.addEvent_).mergeFrom(chaoHuAddEventMessage).buildPartial();
            }
            this.bitField0_ |= 16;
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
        public void mergeEvent(ChaoHuEventMessage chaoHuEventMessage) {
            chaoHuEventMessage.getClass();
            ChaoHuEventMessage chaoHuEventMessage2 = this.event_;
            if (chaoHuEventMessage2 == null || chaoHuEventMessage2 == ChaoHuEventMessage.getDefaultInstance()) {
                this.event_ = chaoHuEventMessage;
            } else {
                this.event_ = ChaoHuEventMessage.newBuilder(this.event_).mergeFrom(chaoHuEventMessage).buildPartial();
            }
            this.bitField0_ |= 8;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ChaoHuStatisticsMessage parseDelimitedFrom(InputStream inputStream) {
            return (ChaoHuStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChaoHuStatisticsMessage parseFrom(ByteBuffer byteBuffer) {
            return (ChaoHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static vkh<ChaoHuStatisticsMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAddEvent(ChaoHuAddEventMessage chaoHuAddEventMessage) {
            chaoHuAddEventMessage.getClass();
            this.addEvent_ = chaoHuAddEventMessage;
            this.bitField0_ |= 16;
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
        public void setEvent(ChaoHuEventMessage chaoHuEventMessage) {
            chaoHuEventMessage.getClass();
            this.event_ = chaoHuEventMessage;
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
                    return new ChaoHuStatisticsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001ᔉ\u0000\u0002ᔌ\u0001\u0003ᔋ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"bitField0_", "base_", "silenceMode_", SilenceModeOuterClass.SilenceMode.internalGetVerifier(), "backlightLevel_", "event_", "addEvent_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    vkh<ChaoHuStatisticsMessage> bVar = PARSER;
                    if (bVar == null) {
                        synchronized (ChaoHuStatisticsMessage.class) {
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

        public static Builder newBuilder(ChaoHuStatisticsMessage chaoHuStatisticsMessage) {
            return DEFAULT_INSTANCE.createBuilder(chaoHuStatisticsMessage);
        }

        public static ChaoHuStatisticsMessage parseDelimitedFrom(InputStream inputStream, t tVar) {
            return (ChaoHuStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static ChaoHuStatisticsMessage parseFrom(ByteBuffer byteBuffer, t tVar) {
            return (ChaoHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, tVar);
        }

        public static ChaoHuStatisticsMessage parseFrom(ByteString byteString) {
            return (ChaoHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ChaoHuStatisticsMessage parseFrom(ByteString byteString, t tVar) {
            return (ChaoHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, tVar);
        }

        public static ChaoHuStatisticsMessage parseFrom(byte[] bArr) {
            return (ChaoHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ChaoHuStatisticsMessage parseFrom(byte[] bArr, t tVar) {
            return (ChaoHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, tVar);
        }

        public static ChaoHuStatisticsMessage parseFrom(InputStream inputStream) {
            return (ChaoHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ChaoHuStatisticsMessage parseFrom(InputStream inputStream, t tVar) {
            return (ChaoHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, tVar);
        }

        public static ChaoHuStatisticsMessage parseFrom(j jVar) {
            return (ChaoHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar);
        }

        public static ChaoHuStatisticsMessage parseFrom(j jVar, t tVar) {
            return (ChaoHuStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, jVar, tVar);
        }
    }

    public interface ChaoHuStatisticsMessageOrBuilder extends bsf {
        ChaoHuAddEventMessage getAddEvent();

        int getBacklightLevel();

        StatisBase.StatisBaseMessage getBase();

        @Override // defpackage.bsf, com.google.protobuf.s0
        /* synthetic */ q0 getDefaultInstanceForType();

        ChaoHuEventMessage getEvent();

        SilenceModeOuterClass.SilenceMode getSilenceMode();

        boolean hasAddEvent();

        boolean hasBacklightLevel();

        boolean hasBase();

        boolean hasEvent();

        boolean hasSilenceMode();

        @Override // defpackage.bsf
        /* synthetic */ boolean isInitialized();
    }

    private Chaohu() {
    }

    public static void registerAllExtensions(t tVar) {
    }
}
