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
public final class Vulture {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.Vulture$1, reason: invalid class name */
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

    public static final class VultrueStatisticsMessage extends GeneratedMessageLite<VultrueStatisticsMessage, Builder> implements VultrueStatisticsMessageOrBuilder {
        public static final int BACKLIGHTLEVEL_FIELD_NUMBER = 3;
        public static final int BASE_FIELD_NUMBER = 1;
        private static final VultrueStatisticsMessage DEFAULT_INSTANCE;
        public static final int EVENT_FIELD_NUMBER = 4;
        public static final int NFC_FIELD_NUMBER = 5;
        private static volatile Parser<VultrueStatisticsMessage> PARSER = null;
        public static final int SILENCEMODE_FIELD_NUMBER = 2;
        private int backlightLevel_;
        private StatisBase.StatisBaseMessage base_;
        private int bitField0_;
        private VultureEventMessage event_;
        private byte memoizedIsInitialized = 2;
        private Nfc.NfcMessage nfc_;
        private int silenceMode_;

        public static final class Builder extends GeneratedMessageLite.Builder<VultrueStatisticsMessage, Builder> implements VultrueStatisticsMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBacklightLevel() {
                copyOnWrite();
                ((VultrueStatisticsMessage) this.instance).clearBacklightLevel();
                return this;
            }

            public Builder clearBase() {
                copyOnWrite();
                ((VultrueStatisticsMessage) this.instance).clearBase();
                return this;
            }

            public Builder clearEvent() {
                copyOnWrite();
                ((VultrueStatisticsMessage) this.instance).clearEvent();
                return this;
            }

            public Builder clearNfc() {
                copyOnWrite();
                ((VultrueStatisticsMessage) this.instance).clearNfc();
                return this;
            }

            public Builder clearSilenceMode() {
                copyOnWrite();
                ((VultrueStatisticsMessage) this.instance).clearSilenceMode();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultrueStatisticsMessageOrBuilder
            public int getBacklightLevel() {
                return ((VultrueStatisticsMessage) this.instance).getBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultrueStatisticsMessageOrBuilder
            public StatisBase.StatisBaseMessage getBase() {
                return ((VultrueStatisticsMessage) this.instance).getBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultrueStatisticsMessageOrBuilder
            public VultureEventMessage getEvent() {
                return ((VultrueStatisticsMessage) this.instance).getEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultrueStatisticsMessageOrBuilder
            public Nfc.NfcMessage getNfc() {
                return ((VultrueStatisticsMessage) this.instance).getNfc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultrueStatisticsMessageOrBuilder
            public SilenceModeOuterClass.SilenceMode getSilenceMode() {
                return ((VultrueStatisticsMessage) this.instance).getSilenceMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultrueStatisticsMessageOrBuilder
            public boolean hasBacklightLevel() {
                return ((VultrueStatisticsMessage) this.instance).hasBacklightLevel();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultrueStatisticsMessageOrBuilder
            public boolean hasBase() {
                return ((VultrueStatisticsMessage) this.instance).hasBase();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultrueStatisticsMessageOrBuilder
            public boolean hasEvent() {
                return ((VultrueStatisticsMessage) this.instance).hasEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultrueStatisticsMessageOrBuilder
            public boolean hasNfc() {
                return ((VultrueStatisticsMessage) this.instance).hasNfc();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultrueStatisticsMessageOrBuilder
            public boolean hasSilenceMode() {
                return ((VultrueStatisticsMessage) this.instance).hasSilenceMode();
            }

            public Builder mergeBase(StatisBase.StatisBaseMessage value) {
                copyOnWrite();
                ((VultrueStatisticsMessage) this.instance).mergeBase(value);
                return this;
            }

            public Builder mergeEvent(VultureEventMessage value) {
                copyOnWrite();
                ((VultrueStatisticsMessage) this.instance).mergeEvent(value);
                return this;
            }

            public Builder mergeNfc(Nfc.NfcMessage value) {
                copyOnWrite();
                ((VultrueStatisticsMessage) this.instance).mergeNfc(value);
                return this;
            }

            public Builder setBacklightLevel(int value) {
                copyOnWrite();
                ((VultrueStatisticsMessage) this.instance).setBacklightLevel(value);
                return this;
            }

            public Builder setBase(StatisBase.StatisBaseMessage value) {
                copyOnWrite();
                ((VultrueStatisticsMessage) this.instance).setBase(value);
                return this;
            }

            public Builder setEvent(VultureEventMessage value) {
                copyOnWrite();
                ((VultrueStatisticsMessage) this.instance).setEvent(value);
                return this;
            }

            public Builder setNfc(Nfc.NfcMessage value) {
                copyOnWrite();
                ((VultrueStatisticsMessage) this.instance).setNfc(value);
                return this;
            }

            public Builder setSilenceMode(SilenceModeOuterClass.SilenceMode value) {
                copyOnWrite();
                ((VultrueStatisticsMessage) this.instance).setSilenceMode(value);
                return this;
            }

            private Builder() {
                super(VultrueStatisticsMessage.DEFAULT_INSTANCE);
            }

            public Builder setBase(StatisBase.StatisBaseMessage.Builder builderForValue) {
                copyOnWrite();
                ((VultrueStatisticsMessage) this.instance).setBase(builderForValue.build());
                return this;
            }

            public Builder setEvent(VultureEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((VultrueStatisticsMessage) this.instance).setEvent(builderForValue.build());
                return this;
            }

            public Builder setNfc(Nfc.NfcMessage.Builder builderForValue) {
                copyOnWrite();
                ((VultrueStatisticsMessage) this.instance).setNfc(builderForValue.build());
                return this;
            }
        }

        static {
            VultrueStatisticsMessage vultrueStatisticsMessage = new VultrueStatisticsMessage();
            DEFAULT_INSTANCE = vultrueStatisticsMessage;
            GeneratedMessageLite.registerDefaultInstance(VultrueStatisticsMessage.class, vultrueStatisticsMessage);
        }

        private VultrueStatisticsMessage() {
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

        public static VultrueStatisticsMessage getDefaultInstance() {
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
        public void mergeEvent(VultureEventMessage value) {
            value.getClass();
            VultureEventMessage vultureEventMessage = this.event_;
            if (vultureEventMessage == null || vultureEventMessage == VultureEventMessage.getDefaultInstance()) {
                this.event_ = value;
            } else {
                this.event_ = VultureEventMessage.newBuilder(this.event_).mergeFrom(value).buildPartial();
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

        public static VultrueStatisticsMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (VultrueStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static VultrueStatisticsMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (VultrueStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<VultrueStatisticsMessage> parser() {
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
        public void setEvent(VultureEventMessage value) {
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

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new VultrueStatisticsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001ᔉ\u0000\u0002ᔌ\u0001\u0003ᔋ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"bitField0_", "base_", "silenceMode_", SilenceModeOuterClass.SilenceMode.internalGetVerifier(), "backlightLevel_", "event_", "nfc_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<VultrueStatisticsMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (VultrueStatisticsMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultrueStatisticsMessageOrBuilder
        public int getBacklightLevel() {
            return this.backlightLevel_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultrueStatisticsMessageOrBuilder
        public StatisBase.StatisBaseMessage getBase() {
            StatisBase.StatisBaseMessage statisBaseMessage = this.base_;
            return statisBaseMessage == null ? StatisBase.StatisBaseMessage.getDefaultInstance() : statisBaseMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultrueStatisticsMessageOrBuilder
        public VultureEventMessage getEvent() {
            VultureEventMessage vultureEventMessage = this.event_;
            return vultureEventMessage == null ? VultureEventMessage.getDefaultInstance() : vultureEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultrueStatisticsMessageOrBuilder
        public Nfc.NfcMessage getNfc() {
            Nfc.NfcMessage nfcMessage = this.nfc_;
            return nfcMessage == null ? Nfc.NfcMessage.getDefaultInstance() : nfcMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultrueStatisticsMessageOrBuilder
        public SilenceModeOuterClass.SilenceMode getSilenceMode() {
            SilenceModeOuterClass.SilenceMode silenceModeForNumber = SilenceModeOuterClass.SilenceMode.forNumber(this.silenceMode_);
            return silenceModeForNumber == null ? SilenceModeOuterClass.SilenceMode.OFF : silenceModeForNumber;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultrueStatisticsMessageOrBuilder
        public boolean hasBacklightLevel() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultrueStatisticsMessageOrBuilder
        public boolean hasBase() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultrueStatisticsMessageOrBuilder
        public boolean hasEvent() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultrueStatisticsMessageOrBuilder
        public boolean hasNfc() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultrueStatisticsMessageOrBuilder
        public boolean hasSilenceMode() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(VultrueStatisticsMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static VultrueStatisticsMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (VultrueStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static VultrueStatisticsMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (VultrueStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static VultrueStatisticsMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (VultrueStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static VultrueStatisticsMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (VultrueStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static VultrueStatisticsMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (VultrueStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static VultrueStatisticsMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (VultrueStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static VultrueStatisticsMessage parseFrom(InputStream input) throws IOException {
            return (VultrueStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static VultrueStatisticsMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (VultrueStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static VultrueStatisticsMessage parseFrom(CodedInputStream input) throws IOException {
            return (VultrueStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static VultrueStatisticsMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (VultrueStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface VultrueStatisticsMessageOrBuilder extends MessageLiteOrBuilder {
        int getBacklightLevel();

        StatisBase.StatisBaseMessage getBase();

        VultureEventMessage getEvent();

        Nfc.NfcMessage getNfc();

        SilenceModeOuterClass.SilenceMode getSilenceMode();

        boolean hasBacklightLevel();

        boolean hasBase();

        boolean hasEvent();

        boolean hasNfc();

        boolean hasSilenceMode();
    }

    public static final class VultureEventMessage extends GeneratedMessageLite<VultureEventMessage, Builder> implements VultureEventMessageOrBuilder {
        public static final int ALARMPAGE_FIELD_NUMBER = 12;
        public static final int ALIPAYCODE128NUM_FIELD_NUMBER = 30;
        public static final int ALIPAYQRCODENUM_FIELD_NUMBER = 29;
        public static final int COMPASSNUM_FIELD_NUMBER = 28;
        public static final int COMPASSPAGE_FIELD_NUMBER = 16;
        public static final int COUNTDOWNNUM_FIELD_NUMBER = 27;
        private static final VultureEventMessage DEFAULT_INSTANCE;
        public static final int DIAL2DND_FIELD_NUMBER = 3;
        public static final int DIAL2MAINITEM1_FIELD_NUMBER = 5;
        public static final int DIAL2NOTIFY_FIELD_NUMBER = 4;
        public static final int DIALID_FIELD_NUMBER = 31;
        public static final int LCDONBECAUSEOFEVENT_FIELD_NUMBER = 2;
        public static final int LCDONBECAUSEOFPRESS_FIELD_NUMBER = 1;
        private static volatile Parser<VultureEventMessage> PARSER = null;
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

        public static final class Builder extends GeneratedMessageLite.Builder<VultureEventMessage, Builder> implements VultureEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAlarmPage() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearAlarmPage();
                return this;
            }

            public Builder clearAlipayCode128Num() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearAlipayCode128Num();
                return this;
            }

            public Builder clearAlipayQRCodeNum() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearAlipayQRCodeNum();
                return this;
            }

            public Builder clearCompassNum() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearCompassNum();
                return this;
            }

            public Builder clearCompassPage() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearCompassPage();
                return this;
            }

            public Builder clearCountdownNum() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearCountdownNum();
                return this;
            }

            public Builder clearDial2DND() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearDial2DND();
                return this;
            }

            public Builder clearDial2MainItem1() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearDial2MainItem1();
                return this;
            }

            public Builder clearDial2Notify() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearDial2Notify();
                return this;
            }

            public Builder clearDialId() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearDialId();
                return this;
            }

            public Builder clearLcdOnBecauseOfEvent() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearLcdOnBecauseOfEvent();
                return this;
            }

            public Builder clearLcdOnBecauseOfPress() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearLcdOnBecauseOfPress();
                return this;
            }

            public Builder clearSettingBacklightPage() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearSettingBacklightPage();
                return this;
            }

            public Builder clearSettingLongpressPage() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearSettingLongpressPage();
                return this;
            }

            public Builder clearSettingPage() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearSettingPage();
                return this;
            }

            public Builder clearSettingWatchfacePage() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearSettingWatchfacePage();
                return this;
            }

            public Builder clearSkipGpsLocationNum() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearSkipGpsLocationNum();
                return this;
            }

            public Builder clearSportHistoryPage() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearSportHistoryPage();
                return this;
            }

            public Builder clearSportPage() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearSportPage();
                return this;
            }

            public Builder clearSportPage1Num() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearSportPage1Num();
                return this;
            }

            public Builder clearSportPage2Num() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearSportPage2Num();
                return this;
            }

            public Builder clearSportPage3Num() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearSportPage3Num();
                return this;
            }

            public Builder clearSportSettingPage() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearSportSettingPage();
                return this;
            }

            public Builder clearStatusPage1() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearStatusPage1();
                return this;
            }

            public Builder clearStatusPage2() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearStatusPage2();
                return this;
            }

            public Builder clearStopwatchNum() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearStopwatchNum();
                return this;
            }

            public Builder clearTimerCountdownPage() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearTimerCountdownPage();
                return this;
            }

            public Builder clearTimerPage() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearTimerPage();
                return this;
            }

            public Builder clearTimerStopwatchPage() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearTimerStopwatchPage();
                return this;
            }

            public Builder clearWaitGpsLocationNum() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearWaitGpsLocationNum();
                return this;
            }

            public Builder clearWeatherPage() {
                copyOnWrite();
                ((VultureEventMessage) this.instance).clearWeatherPage();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getAlarmPage() {
                return ((VultureEventMessage) this.instance).getAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getAlipayCode128Num() {
                return ((VultureEventMessage) this.instance).getAlipayCode128Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getAlipayQRCodeNum() {
                return ((VultureEventMessage) this.instance).getAlipayQRCodeNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getCompassNum() {
                return ((VultureEventMessage) this.instance).getCompassNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getCompassPage() {
                return ((VultureEventMessage) this.instance).getCompassPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getCountdownNum() {
                return ((VultureEventMessage) this.instance).getCountdownNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getDial2DND() {
                return ((VultureEventMessage) this.instance).getDial2DND();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getDial2MainItem1() {
                return ((VultureEventMessage) this.instance).getDial2MainItem1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getDial2Notify() {
                return ((VultureEventMessage) this.instance).getDial2Notify();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getDialId() {
                return ((VultureEventMessage) this.instance).getDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getLcdOnBecauseOfEvent() {
                return ((VultureEventMessage) this.instance).getLcdOnBecauseOfEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getLcdOnBecauseOfPress() {
                return ((VultureEventMessage) this.instance).getLcdOnBecauseOfPress();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getSettingBacklightPage() {
                return ((VultureEventMessage) this.instance).getSettingBacklightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getSettingLongpressPage() {
                return ((VultureEventMessage) this.instance).getSettingLongpressPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getSettingPage() {
                return ((VultureEventMessage) this.instance).getSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getSettingWatchfacePage() {
                return ((VultureEventMessage) this.instance).getSettingWatchfacePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getSkipGpsLocationNum() {
                return ((VultureEventMessage) this.instance).getSkipGpsLocationNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getSportHistoryPage() {
                return ((VultureEventMessage) this.instance).getSportHistoryPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getSportPage() {
                return ((VultureEventMessage) this.instance).getSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getSportPage1Num() {
                return ((VultureEventMessage) this.instance).getSportPage1Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getSportPage2Num() {
                return ((VultureEventMessage) this.instance).getSportPage2Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getSportPage3Num() {
                return ((VultureEventMessage) this.instance).getSportPage3Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getSportSettingPage() {
                return ((VultureEventMessage) this.instance).getSportSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getStatusPage1() {
                return ((VultureEventMessage) this.instance).getStatusPage1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getStatusPage2() {
                return ((VultureEventMessage) this.instance).getStatusPage2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getStopwatchNum() {
                return ((VultureEventMessage) this.instance).getStopwatchNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getTimerCountdownPage() {
                return ((VultureEventMessage) this.instance).getTimerCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getTimerPage() {
                return ((VultureEventMessage) this.instance).getTimerPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getTimerStopwatchPage() {
                return ((VultureEventMessage) this.instance).getTimerStopwatchPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getWaitGpsLocationNum() {
                return ((VultureEventMessage) this.instance).getWaitGpsLocationNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public int getWeatherPage() {
                return ((VultureEventMessage) this.instance).getWeatherPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasAlarmPage() {
                return ((VultureEventMessage) this.instance).hasAlarmPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasAlipayCode128Num() {
                return ((VultureEventMessage) this.instance).hasAlipayCode128Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasAlipayQRCodeNum() {
                return ((VultureEventMessage) this.instance).hasAlipayQRCodeNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasCompassNum() {
                return ((VultureEventMessage) this.instance).hasCompassNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasCompassPage() {
                return ((VultureEventMessage) this.instance).hasCompassPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasCountdownNum() {
                return ((VultureEventMessage) this.instance).hasCountdownNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasDial2DND() {
                return ((VultureEventMessage) this.instance).hasDial2DND();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasDial2MainItem1() {
                return ((VultureEventMessage) this.instance).hasDial2MainItem1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasDial2Notify() {
                return ((VultureEventMessage) this.instance).hasDial2Notify();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasDialId() {
                return ((VultureEventMessage) this.instance).hasDialId();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfEvent() {
                return ((VultureEventMessage) this.instance).hasLcdOnBecauseOfEvent();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasLcdOnBecauseOfPress() {
                return ((VultureEventMessage) this.instance).hasLcdOnBecauseOfPress();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasSettingBacklightPage() {
                return ((VultureEventMessage) this.instance).hasSettingBacklightPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasSettingLongpressPage() {
                return ((VultureEventMessage) this.instance).hasSettingLongpressPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasSettingPage() {
                return ((VultureEventMessage) this.instance).hasSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasSettingWatchfacePage() {
                return ((VultureEventMessage) this.instance).hasSettingWatchfacePage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasSkipGpsLocationNum() {
                return ((VultureEventMessage) this.instance).hasSkipGpsLocationNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasSportHistoryPage() {
                return ((VultureEventMessage) this.instance).hasSportHistoryPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasSportPage() {
                return ((VultureEventMessage) this.instance).hasSportPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasSportPage1Num() {
                return ((VultureEventMessage) this.instance).hasSportPage1Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasSportPage2Num() {
                return ((VultureEventMessage) this.instance).hasSportPage2Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasSportPage3Num() {
                return ((VultureEventMessage) this.instance).hasSportPage3Num();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasSportSettingPage() {
                return ((VultureEventMessage) this.instance).hasSportSettingPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasStatusPage1() {
                return ((VultureEventMessage) this.instance).hasStatusPage1();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasStatusPage2() {
                return ((VultureEventMessage) this.instance).hasStatusPage2();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasStopwatchNum() {
                return ((VultureEventMessage) this.instance).hasStopwatchNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasTimerCountdownPage() {
                return ((VultureEventMessage) this.instance).hasTimerCountdownPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasTimerPage() {
                return ((VultureEventMessage) this.instance).hasTimerPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasTimerStopwatchPage() {
                return ((VultureEventMessage) this.instance).hasTimerStopwatchPage();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasWaitGpsLocationNum() {
                return ((VultureEventMessage) this.instance).hasWaitGpsLocationNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
            public boolean hasWeatherPage() {
                return ((VultureEventMessage) this.instance).hasWeatherPage();
            }

            public Builder setAlarmPage(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setAlarmPage(value);
                return this;
            }

            public Builder setAlipayCode128Num(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setAlipayCode128Num(value);
                return this;
            }

            public Builder setAlipayQRCodeNum(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setAlipayQRCodeNum(value);
                return this;
            }

            public Builder setCompassNum(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setCompassNum(value);
                return this;
            }

            public Builder setCompassPage(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setCompassPage(value);
                return this;
            }

            public Builder setCountdownNum(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setCountdownNum(value);
                return this;
            }

            public Builder setDial2DND(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setDial2DND(value);
                return this;
            }

            public Builder setDial2MainItem1(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setDial2MainItem1(value);
                return this;
            }

            public Builder setDial2Notify(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setDial2Notify(value);
                return this;
            }

            public Builder setDialId(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setDialId(value);
                return this;
            }

            public Builder setLcdOnBecauseOfEvent(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setLcdOnBecauseOfEvent(value);
                return this;
            }

            public Builder setLcdOnBecauseOfPress(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setLcdOnBecauseOfPress(value);
                return this;
            }

            public Builder setSettingBacklightPage(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setSettingBacklightPage(value);
                return this;
            }

            public Builder setSettingLongpressPage(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setSettingLongpressPage(value);
                return this;
            }

            public Builder setSettingPage(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setSettingPage(value);
                return this;
            }

            public Builder setSettingWatchfacePage(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setSettingWatchfacePage(value);
                return this;
            }

            public Builder setSkipGpsLocationNum(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setSkipGpsLocationNum(value);
                return this;
            }

            public Builder setSportHistoryPage(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setSportHistoryPage(value);
                return this;
            }

            public Builder setSportPage(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setSportPage(value);
                return this;
            }

            public Builder setSportPage1Num(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setSportPage1Num(value);
                return this;
            }

            public Builder setSportPage2Num(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setSportPage2Num(value);
                return this;
            }

            public Builder setSportPage3Num(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setSportPage3Num(value);
                return this;
            }

            public Builder setSportSettingPage(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setSportSettingPage(value);
                return this;
            }

            public Builder setStatusPage1(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setStatusPage1(value);
                return this;
            }

            public Builder setStatusPage2(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setStatusPage2(value);
                return this;
            }

            public Builder setStopwatchNum(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setStopwatchNum(value);
                return this;
            }

            public Builder setTimerCountdownPage(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setTimerCountdownPage(value);
                return this;
            }

            public Builder setTimerPage(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setTimerPage(value);
                return this;
            }

            public Builder setTimerStopwatchPage(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setTimerStopwatchPage(value);
                return this;
            }

            public Builder setWaitGpsLocationNum(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setWaitGpsLocationNum(value);
                return this;
            }

            public Builder setWeatherPage(int value) {
                copyOnWrite();
                ((VultureEventMessage) this.instance).setWeatherPage(value);
                return this;
            }

            private Builder() {
                super(VultureEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            VultureEventMessage vultureEventMessage = new VultureEventMessage();
            DEFAULT_INSTANCE = vultureEventMessage;
            GeneratedMessageLite.registerDefaultInstance(VultureEventMessage.class, vultureEventMessage);
        }

        private VultureEventMessage() {
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

        public static VultureEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static VultureEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (VultureEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static VultureEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (VultureEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<VultureEventMessage> parser() {
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
                    return new VultureEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u001f\u0000\u0001\u0001\u001f\u001f\u0000\u0000\u001c\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004\u0006ᔋ\u0005\u0007ᔋ\u0006\bᔋ\u0007\tᔋ\b\nᔋ\t\u000bᔋ\n\fᔋ\u000b\rᔋ\f\u000eᔋ\r\u000fᔋ\u000e\u0010ᔋ\u000f\u0011ᔋ\u0010\u0012ᔋ\u0011\u0013ᔋ\u0012\u0014ᔋ\u0013\u0015ᔋ\u0014\u0016ᔋ\u0015\u0017ᔋ\u0016\u0018ᔋ\u0017\u0019ᔋ\u0018\u001aᔋ\u0019\u001bᔋ\u001a\u001cᔋ\u001b\u001dဋ\u001c\u001eဋ\u001d\u001fဋ\u001e", new Object[]{"bitField0_", "lcdOnBecauseOfPress_", "lcdOnBecauseOfEvent_", "dial2DND_", "dial2Notify_", "dial2MainItem1_", "statusPage1_", "statusPage2_", "sportPage_", "sportHistoryPage_", "sportSettingPage_", "weatherPage_", "alarmPage_", "timerPage_", "timerStopwatchPage_", "timerCountdownPage_", "compassPage_", "settingPage_", "settingWatchfacePage_", "settingLongpressPage_", "settingBacklightPage_", "waitGpsLocationNum_", "skipGpsLocationNum_", "sportPage1Num_", "sportPage2Num_", "sportPage3Num_", "stopwatchNum_", "countdownNum_", "compassNum_", "alipayQRCodeNum_", "alipayCode128Num_", "dialId_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<VultureEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (VultureEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getAlarmPage() {
            return this.alarmPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getAlipayCode128Num() {
            return this.alipayCode128Num_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getAlipayQRCodeNum() {
            return this.alipayQRCodeNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getCompassNum() {
            return this.compassNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getCompassPage() {
            return this.compassPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getCountdownNum() {
            return this.countdownNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getDial2DND() {
            return this.dial2DND_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getDial2MainItem1() {
            return this.dial2MainItem1_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getDial2Notify() {
            return this.dial2Notify_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getDialId() {
            return this.dialId_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getLcdOnBecauseOfEvent() {
            return this.lcdOnBecauseOfEvent_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getLcdOnBecauseOfPress() {
            return this.lcdOnBecauseOfPress_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getSettingBacklightPage() {
            return this.settingBacklightPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getSettingLongpressPage() {
            return this.settingLongpressPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getSettingPage() {
            return this.settingPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getSettingWatchfacePage() {
            return this.settingWatchfacePage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getSkipGpsLocationNum() {
            return this.skipGpsLocationNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getSportHistoryPage() {
            return this.sportHistoryPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getSportPage() {
            return this.sportPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getSportPage1Num() {
            return this.sportPage1Num_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getSportPage2Num() {
            return this.sportPage2Num_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getSportPage3Num() {
            return this.sportPage3Num_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getSportSettingPage() {
            return this.sportSettingPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getStatusPage1() {
            return this.statusPage1_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getStatusPage2() {
            return this.statusPage2_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getStopwatchNum() {
            return this.stopwatchNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getTimerCountdownPage() {
            return this.timerCountdownPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getTimerPage() {
            return this.timerPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getTimerStopwatchPage() {
            return this.timerStopwatchPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getWaitGpsLocationNum() {
            return this.waitGpsLocationNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public int getWeatherPage() {
            return this.weatherPage_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasAlarmPage() {
            return (this.bitField0_ & 2048) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasAlipayCode128Num() {
            return (this.bitField0_ & 536870912) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasAlipayQRCodeNum() {
            return (this.bitField0_ & 268435456) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasCompassNum() {
            return (this.bitField0_ & AMapEngineUtils.HALF_MAX_P20_WIDTH) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasCompassPage() {
            return (this.bitField0_ & 32768) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasCountdownNum() {
            return (this.bitField0_ & 67108864) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasDial2DND() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasDial2MainItem1() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasDial2Notify() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasDialId() {
            return (this.bitField0_ & 1073741824) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfEvent() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasLcdOnBecauseOfPress() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasSettingBacklightPage() {
            return (this.bitField0_ & 524288) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasSettingLongpressPage() {
            return (this.bitField0_ & 262144) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasSettingPage() {
            return (this.bitField0_ & 65536) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasSettingWatchfacePage() {
            return (this.bitField0_ & 131072) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasSkipGpsLocationNum() {
            return (this.bitField0_ & 2097152) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasSportHistoryPage() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasSportPage() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasSportPage1Num() {
            return (this.bitField0_ & 4194304) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasSportPage2Num() {
            return (this.bitField0_ & 8388608) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasSportPage3Num() {
            return (this.bitField0_ & 16777216) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasSportSettingPage() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasStatusPage1() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasStatusPage2() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasStopwatchNum() {
            return (this.bitField0_ & 33554432) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasTimerCountdownPage() {
            return (this.bitField0_ & 16384) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasTimerPage() {
            return (this.bitField0_ & 4096) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasTimerStopwatchPage() {
            return (this.bitField0_ & 8192) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasWaitGpsLocationNum() {
            return (this.bitField0_ & 1048576) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Vulture.VultureEventMessageOrBuilder
        public boolean hasWeatherPage() {
            return (this.bitField0_ & 1024) != 0;
        }

        public static Builder newBuilder(VultureEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static VultureEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (VultureEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static VultureEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (VultureEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static VultureEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (VultureEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static VultureEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (VultureEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static VultureEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (VultureEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static VultureEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (VultureEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static VultureEventMessage parseFrom(InputStream input) throws IOException {
            return (VultureEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static VultureEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (VultureEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static VultureEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (VultureEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static VultureEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (VultureEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface VultureEventMessageOrBuilder extends MessageLiteOrBuilder {
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

    private Vulture() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }
}
