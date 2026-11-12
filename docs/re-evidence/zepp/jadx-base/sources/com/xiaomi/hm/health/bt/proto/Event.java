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
public final class Event {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.Event$1, reason: invalid class name */
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

    public static final class BatterySaverMode extends GeneratedMessageLite<BatterySaverMode, Builder> implements BatterySaverModeOrBuilder {
        public static final int BATTERYVALUE_FIELD_NUMBER = 2;
        public static final int COUNT_FIELD_NUMBER = 1;
        private static final BatterySaverMode DEFAULT_INSTANCE;
        private static volatile Parser<BatterySaverMode> PARSER;
        private int batteryValue_;
        private int bitField0_;
        private int count_;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends GeneratedMessageLite.Builder<BatterySaverMode, Builder> implements BatterySaverModeOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBatteryValue() {
                copyOnWrite();
                ((BatterySaverMode) this.instance).clearBatteryValue();
                return this;
            }

            public Builder clearCount() {
                copyOnWrite();
                ((BatterySaverMode) this.instance).clearCount();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.BatterySaverModeOrBuilder
            public int getBatteryValue() {
                return ((BatterySaverMode) this.instance).getBatteryValue();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.BatterySaverModeOrBuilder
            public int getCount() {
                return ((BatterySaverMode) this.instance).getCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.BatterySaverModeOrBuilder
            public boolean hasBatteryValue() {
                return ((BatterySaverMode) this.instance).hasBatteryValue();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.BatterySaverModeOrBuilder
            public boolean hasCount() {
                return ((BatterySaverMode) this.instance).hasCount();
            }

            public Builder setBatteryValue(int value) {
                copyOnWrite();
                ((BatterySaverMode) this.instance).setBatteryValue(value);
                return this;
            }

            public Builder setCount(int value) {
                copyOnWrite();
                ((BatterySaverMode) this.instance).setCount(value);
                return this;
            }

            private Builder() {
                super(BatterySaverMode.DEFAULT_INSTANCE);
            }
        }

        static {
            BatterySaverMode batterySaverMode = new BatterySaverMode();
            DEFAULT_INSTANCE = batterySaverMode;
            GeneratedMessageLite.registerDefaultInstance(BatterySaverMode.class, batterySaverMode);
        }

        private BatterySaverMode() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBatteryValue() {
            this.bitField0_ &= -3;
            this.batteryValue_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCount() {
            this.bitField0_ &= -2;
            this.count_ = 0;
        }

        public static BatterySaverMode getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BatterySaverMode parseDelimitedFrom(InputStream input) throws IOException {
            return (BatterySaverMode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static BatterySaverMode parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (BatterySaverMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<BatterySaverMode> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBatteryValue(int value) {
            this.bitField0_ |= 2;
            this.batteryValue_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCount(int value) {
            this.bitField0_ |= 1;
            this.count_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new BatterySaverMode();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔋ\u0000\u0002ᔋ\u0001", new Object[]{"bitField0_", "count_", "batteryValue_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<BatterySaverMode> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (BatterySaverMode.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Event.BatterySaverModeOrBuilder
        public int getBatteryValue() {
            return this.batteryValue_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.BatterySaverModeOrBuilder
        public int getCount() {
            return this.count_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.BatterySaverModeOrBuilder
        public boolean hasBatteryValue() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.BatterySaverModeOrBuilder
        public boolean hasCount() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(BatterySaverMode prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static BatterySaverMode parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BatterySaverMode) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static BatterySaverMode parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (BatterySaverMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static BatterySaverMode parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (BatterySaverMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static BatterySaverMode parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (BatterySaverMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static BatterySaverMode parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (BatterySaverMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static BatterySaverMode parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (BatterySaverMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static BatterySaverMode parseFrom(InputStream input) throws IOException {
            return (BatterySaverMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static BatterySaverMode parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BatterySaverMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static BatterySaverMode parseFrom(CodedInputStream input) throws IOException {
            return (BatterySaverMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static BatterySaverMode parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BatterySaverMode) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface BatterySaverModeOrBuilder extends MessageLiteOrBuilder {
        int getBatteryValue();

        int getCount();

        boolean hasBatteryValue();

        boolean hasCount();
    }

    public static final class DfuUpgradeMessage extends GeneratedMessageLite<DfuUpgradeMessage, Builder> implements DfuUpgradeMessageOrBuilder {
        private static final DfuUpgradeMessage DEFAULT_INSTANCE;
        private static volatile Parser<DfuUpgradeMessage> PARSER = null;
        public static final int UPGRADEFAILTIME_FIELD_NUMBER = 2;
        public static final int UPGRADETIME_FIELD_NUMBER = 1;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private int upgradeFailTime_;
        private int upgradeTime_;

        public static final class Builder extends GeneratedMessageLite.Builder<DfuUpgradeMessage, Builder> implements DfuUpgradeMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearUpgradeFailTime() {
                copyOnWrite();
                ((DfuUpgradeMessage) this.instance).clearUpgradeFailTime();
                return this;
            }

            public Builder clearUpgradeTime() {
                copyOnWrite();
                ((DfuUpgradeMessage) this.instance).clearUpgradeTime();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DfuUpgradeMessageOrBuilder
            public int getUpgradeFailTime() {
                return ((DfuUpgradeMessage) this.instance).getUpgradeFailTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DfuUpgradeMessageOrBuilder
            public int getUpgradeTime() {
                return ((DfuUpgradeMessage) this.instance).getUpgradeTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DfuUpgradeMessageOrBuilder
            public boolean hasUpgradeFailTime() {
                return ((DfuUpgradeMessage) this.instance).hasUpgradeFailTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DfuUpgradeMessageOrBuilder
            public boolean hasUpgradeTime() {
                return ((DfuUpgradeMessage) this.instance).hasUpgradeTime();
            }

            public Builder setUpgradeFailTime(int value) {
                copyOnWrite();
                ((DfuUpgradeMessage) this.instance).setUpgradeFailTime(value);
                return this;
            }

            public Builder setUpgradeTime(int value) {
                copyOnWrite();
                ((DfuUpgradeMessage) this.instance).setUpgradeTime(value);
                return this;
            }

            private Builder() {
                super(DfuUpgradeMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            DfuUpgradeMessage dfuUpgradeMessage = new DfuUpgradeMessage();
            DEFAULT_INSTANCE = dfuUpgradeMessage;
            GeneratedMessageLite.registerDefaultInstance(DfuUpgradeMessage.class, dfuUpgradeMessage);
        }

        private DfuUpgradeMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpgradeFailTime() {
            this.bitField0_ &= -3;
            this.upgradeFailTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUpgradeTime() {
            this.bitField0_ &= -2;
            this.upgradeTime_ = 0;
        }

        public static DfuUpgradeMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DfuUpgradeMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (DfuUpgradeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static DfuUpgradeMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (DfuUpgradeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<DfuUpgradeMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpgradeFailTime(int value) {
            this.bitField0_ |= 2;
            this.upgradeFailTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUpgradeTime(int value) {
            this.bitField0_ |= 1;
            this.upgradeTime_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new DfuUpgradeMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔋ\u0000\u0002ᔋ\u0001", new Object[]{"bitField0_", "upgradeTime_", "upgradeFailTime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DfuUpgradeMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (DfuUpgradeMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Event.DfuUpgradeMessageOrBuilder
        public int getUpgradeFailTime() {
            return this.upgradeFailTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DfuUpgradeMessageOrBuilder
        public int getUpgradeTime() {
            return this.upgradeTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DfuUpgradeMessageOrBuilder
        public boolean hasUpgradeFailTime() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DfuUpgradeMessageOrBuilder
        public boolean hasUpgradeTime() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(DfuUpgradeMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static DfuUpgradeMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DfuUpgradeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static DfuUpgradeMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DfuUpgradeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DfuUpgradeMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (DfuUpgradeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static DfuUpgradeMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DfuUpgradeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DfuUpgradeMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (DfuUpgradeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static DfuUpgradeMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DfuUpgradeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DfuUpgradeMessage parseFrom(InputStream input) throws IOException {
            return (DfuUpgradeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static DfuUpgradeMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DfuUpgradeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static DfuUpgradeMessage parseFrom(CodedInputStream input) throws IOException {
            return (DfuUpgradeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static DfuUpgradeMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DfuUpgradeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface DfuUpgradeMessageOrBuilder extends MessageLiteOrBuilder {
        int getUpgradeFailTime();

        int getUpgradeTime();

        boolean hasUpgradeFailTime();

        boolean hasUpgradeTime();
    }

    public static final class DialtoolMessage extends GeneratedMessageLite<DialtoolMessage, Builder> implements DialtoolMessageOrBuilder {
        private static final DialtoolMessage DEFAULT_INSTANCE;
        public static final int DIALID_FIELD_NUMBER = 1;
        public static final int DIALSELECTID_FIELD_NUMBER = 3;
        public static final int DIALTOOLID_FIELD_NUMBER = 2;
        private static volatile Parser<DialtoolMessage> PARSER;
        private int bitField0_;
        private int dialid_;
        private int dialselectid_;
        private int dialtoolid_;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends GeneratedMessageLite.Builder<DialtoolMessage, Builder> implements DialtoolMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDialid() {
                copyOnWrite();
                ((DialtoolMessage) this.instance).clearDialid();
                return this;
            }

            public Builder clearDialselectid() {
                copyOnWrite();
                ((DialtoolMessage) this.instance).clearDialselectid();
                return this;
            }

            public Builder clearDialtoolid() {
                copyOnWrite();
                ((DialtoolMessage) this.instance).clearDialtoolid();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DialtoolMessageOrBuilder
            public int getDialid() {
                return ((DialtoolMessage) this.instance).getDialid();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DialtoolMessageOrBuilder
            public int getDialselectid() {
                return ((DialtoolMessage) this.instance).getDialselectid();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DialtoolMessageOrBuilder
            public int getDialtoolid() {
                return ((DialtoolMessage) this.instance).getDialtoolid();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DialtoolMessageOrBuilder
            public boolean hasDialid() {
                return ((DialtoolMessage) this.instance).hasDialid();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DialtoolMessageOrBuilder
            public boolean hasDialselectid() {
                return ((DialtoolMessage) this.instance).hasDialselectid();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DialtoolMessageOrBuilder
            public boolean hasDialtoolid() {
                return ((DialtoolMessage) this.instance).hasDialtoolid();
            }

            public Builder setDialid(int value) {
                copyOnWrite();
                ((DialtoolMessage) this.instance).setDialid(value);
                return this;
            }

            public Builder setDialselectid(int value) {
                copyOnWrite();
                ((DialtoolMessage) this.instance).setDialselectid(value);
                return this;
            }

            public Builder setDialtoolid(int value) {
                copyOnWrite();
                ((DialtoolMessage) this.instance).setDialtoolid(value);
                return this;
            }

            private Builder() {
                super(DialtoolMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            DialtoolMessage dialtoolMessage = new DialtoolMessage();
            DEFAULT_INSTANCE = dialtoolMessage;
            GeneratedMessageLite.registerDefaultInstance(DialtoolMessage.class, dialtoolMessage);
        }

        private DialtoolMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialid() {
            this.bitField0_ &= -2;
            this.dialid_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialselectid() {
            this.bitField0_ &= -5;
            this.dialselectid_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDialtoolid() {
            this.bitField0_ &= -3;
            this.dialtoolid_ = 0;
        }

        public static DialtoolMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DialtoolMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (DialtoolMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static DialtoolMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (DialtoolMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<DialtoolMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialid(int value) {
            this.bitField0_ |= 1;
            this.dialid_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialselectid(int value) {
            this.bitField0_ |= 4;
            this.dialselectid_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDialtoolid(int value) {
            this.bitField0_ |= 2;
            this.dialtoolid_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new DialtoolMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002", new Object[]{"bitField0_", "dialid_", "dialtoolid_", "dialselectid_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DialtoolMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (DialtoolMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Event.DialtoolMessageOrBuilder
        public int getDialid() {
            return this.dialid_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DialtoolMessageOrBuilder
        public int getDialselectid() {
            return this.dialselectid_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DialtoolMessageOrBuilder
        public int getDialtoolid() {
            return this.dialtoolid_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DialtoolMessageOrBuilder
        public boolean hasDialid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DialtoolMessageOrBuilder
        public boolean hasDialselectid() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DialtoolMessageOrBuilder
        public boolean hasDialtoolid() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(DialtoolMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static DialtoolMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DialtoolMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static DialtoolMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DialtoolMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DialtoolMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (DialtoolMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static DialtoolMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DialtoolMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DialtoolMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (DialtoolMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static DialtoolMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DialtoolMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DialtoolMessage parseFrom(InputStream input) throws IOException {
            return (DialtoolMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static DialtoolMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DialtoolMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static DialtoolMessage parseFrom(CodedInputStream input) throws IOException {
            return (DialtoolMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static DialtoolMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DialtoolMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface DialtoolMessageOrBuilder extends MessageLiteOrBuilder {
        int getDialid();

        int getDialselectid();

        int getDialtoolid();

        boolean hasDialid();

        boolean hasDialselectid();

        boolean hasDialtoolid();
    }

    public static final class DndEventMessage extends GeneratedMessageLite<DndEventMessage, Builder> implements DndEventMessageOrBuilder {
        private static final DndEventMessage DEFAULT_INSTANCE;
        public static final int DNDINHOUR_FIELD_NUMBER = 2;
        public static final int DNDINMIN_FIELD_NUMBER = 3;
        public static final int DNDMODE_FIELD_NUMBER = 1;
        public static final int DNDOUTHOUR_FIELD_NUMBER = 4;
        public static final int DNDOUTMIN_FIELD_NUMBER = 5;
        private static volatile Parser<DndEventMessage> PARSER;
        private int bitField0_;
        private int dndInHour_;
        private int dndInMin_;
        private int dndMode_;
        private int dndOutHour_;
        private int dndOutMin_;
        private byte memoizedIsInitialized = 2;

        public static final class Builder extends GeneratedMessageLite.Builder<DndEventMessage, Builder> implements DndEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDndInHour() {
                copyOnWrite();
                ((DndEventMessage) this.instance).clearDndInHour();
                return this;
            }

            public Builder clearDndInMin() {
                copyOnWrite();
                ((DndEventMessage) this.instance).clearDndInMin();
                return this;
            }

            public Builder clearDndMode() {
                copyOnWrite();
                ((DndEventMessage) this.instance).clearDndMode();
                return this;
            }

            public Builder clearDndOutHour() {
                copyOnWrite();
                ((DndEventMessage) this.instance).clearDndOutHour();
                return this;
            }

            public Builder clearDndOutMin() {
                copyOnWrite();
                ((DndEventMessage) this.instance).clearDndOutMin();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
            public int getDndInHour() {
                return ((DndEventMessage) this.instance).getDndInHour();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
            public int getDndInMin() {
                return ((DndEventMessage) this.instance).getDndInMin();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
            public int getDndMode() {
                return ((DndEventMessage) this.instance).getDndMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
            public int getDndOutHour() {
                return ((DndEventMessage) this.instance).getDndOutHour();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
            public int getDndOutMin() {
                return ((DndEventMessage) this.instance).getDndOutMin();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
            public boolean hasDndInHour() {
                return ((DndEventMessage) this.instance).hasDndInHour();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
            public boolean hasDndInMin() {
                return ((DndEventMessage) this.instance).hasDndInMin();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
            public boolean hasDndMode() {
                return ((DndEventMessage) this.instance).hasDndMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
            public boolean hasDndOutHour() {
                return ((DndEventMessage) this.instance).hasDndOutHour();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
            public boolean hasDndOutMin() {
                return ((DndEventMessage) this.instance).hasDndOutMin();
            }

            public Builder setDndInHour(int value) {
                copyOnWrite();
                ((DndEventMessage) this.instance).setDndInHour(value);
                return this;
            }

            public Builder setDndInMin(int value) {
                copyOnWrite();
                ((DndEventMessage) this.instance).setDndInMin(value);
                return this;
            }

            public Builder setDndMode(int value) {
                copyOnWrite();
                ((DndEventMessage) this.instance).setDndMode(value);
                return this;
            }

            public Builder setDndOutHour(int value) {
                copyOnWrite();
                ((DndEventMessage) this.instance).setDndOutHour(value);
                return this;
            }

            public Builder setDndOutMin(int value) {
                copyOnWrite();
                ((DndEventMessage) this.instance).setDndOutMin(value);
                return this;
            }

            private Builder() {
                super(DndEventMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            DndEventMessage dndEventMessage = new DndEventMessage();
            DEFAULT_INSTANCE = dndEventMessage;
            GeneratedMessageLite.registerDefaultInstance(DndEventMessage.class, dndEventMessage);
        }

        private DndEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDndInHour() {
            this.bitField0_ &= -3;
            this.dndInHour_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDndInMin() {
            this.bitField0_ &= -5;
            this.dndInMin_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDndMode() {
            this.bitField0_ &= -2;
            this.dndMode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDndOutHour() {
            this.bitField0_ &= -9;
            this.dndOutHour_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDndOutMin() {
            this.bitField0_ &= -17;
            this.dndOutMin_ = 0;
        }

        public static DndEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static DndEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (DndEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static DndEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (DndEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<DndEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDndInHour(int value) {
            this.bitField0_ |= 2;
            this.dndInHour_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDndInMin(int value) {
            this.bitField0_ |= 4;
            this.dndInMin_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDndMode(int value) {
            this.bitField0_ |= 1;
            this.dndMode_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDndOutHour(int value) {
            this.bitField0_ |= 8;
            this.dndOutHour_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDndOutMin(int value) {
            this.bitField0_ |= 16;
            this.dndOutMin_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new DndEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002\u0004ᔋ\u0003\u0005ᔋ\u0004", new Object[]{"bitField0_", "dndMode_", "dndInHour_", "dndInMin_", "dndOutHour_", "dndOutMin_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<DndEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (DndEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
        public int getDndInHour() {
            return this.dndInHour_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
        public int getDndInMin() {
            return this.dndInMin_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
        public int getDndMode() {
            return this.dndMode_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
        public int getDndOutHour() {
            return this.dndOutHour_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
        public int getDndOutMin() {
            return this.dndOutMin_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
        public boolean hasDndInHour() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
        public boolean hasDndInMin() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
        public boolean hasDndMode() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
        public boolean hasDndOutHour() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.DndEventMessageOrBuilder
        public boolean hasDndOutMin() {
            return (this.bitField0_ & 16) != 0;
        }

        public static Builder newBuilder(DndEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static DndEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DndEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static DndEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DndEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DndEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (DndEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static DndEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DndEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DndEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (DndEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static DndEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (DndEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static DndEventMessage parseFrom(InputStream input) throws IOException {
            return (DndEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static DndEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DndEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static DndEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (DndEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static DndEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (DndEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface DndEventMessageOrBuilder extends MessageLiteOrBuilder {
        int getDndInHour();

        int getDndInMin();

        int getDndMode();

        int getDndOutHour();

        int getDndOutMin();

        boolean hasDndInHour();

        boolean hasDndInMin();

        boolean hasDndMode();

        boolean hasDndOutHour();

        boolean hasDndOutMin();
    }

    public static final class NandMessage extends GeneratedMessageLite<NandMessage, Builder> implements NandMessageOrBuilder {
        private static final NandMessage DEFAULT_INSTANCE;
        public static final int ERASETIMES_FIELD_NUMBER = 3;
        private static volatile Parser<NandMessage> PARSER = null;
        public static final int READTIMES_FIELD_NUMBER = 2;
        public static final int WRITETIMES_FIELD_NUMBER = 1;
        private int bitField0_;
        private int eraseTimes_;
        private byte memoizedIsInitialized = 2;
        private int readTimes_;
        private int writeTimes_;

        public static final class Builder extends GeneratedMessageLite.Builder<NandMessage, Builder> implements NandMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearEraseTimes() {
                copyOnWrite();
                ((NandMessage) this.instance).clearEraseTimes();
                return this;
            }

            public Builder clearReadTimes() {
                copyOnWrite();
                ((NandMessage) this.instance).clearReadTimes();
                return this;
            }

            public Builder clearWriteTimes() {
                copyOnWrite();
                ((NandMessage) this.instance).clearWriteTimes();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.NandMessageOrBuilder
            public int getEraseTimes() {
                return ((NandMessage) this.instance).getEraseTimes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.NandMessageOrBuilder
            public int getReadTimes() {
                return ((NandMessage) this.instance).getReadTimes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.NandMessageOrBuilder
            public int getWriteTimes() {
                return ((NandMessage) this.instance).getWriteTimes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.NandMessageOrBuilder
            public boolean hasEraseTimes() {
                return ((NandMessage) this.instance).hasEraseTimes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.NandMessageOrBuilder
            public boolean hasReadTimes() {
                return ((NandMessage) this.instance).hasReadTimes();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.NandMessageOrBuilder
            public boolean hasWriteTimes() {
                return ((NandMessage) this.instance).hasWriteTimes();
            }

            public Builder setEraseTimes(int value) {
                copyOnWrite();
                ((NandMessage) this.instance).setEraseTimes(value);
                return this;
            }

            public Builder setReadTimes(int value) {
                copyOnWrite();
                ((NandMessage) this.instance).setReadTimes(value);
                return this;
            }

            public Builder setWriteTimes(int value) {
                copyOnWrite();
                ((NandMessage) this.instance).setWriteTimes(value);
                return this;
            }

            private Builder() {
                super(NandMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            NandMessage nandMessage = new NandMessage();
            DEFAULT_INSTANCE = nandMessage;
            GeneratedMessageLite.registerDefaultInstance(NandMessage.class, nandMessage);
        }

        private NandMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEraseTimes() {
            this.bitField0_ &= -5;
            this.eraseTimes_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearReadTimes() {
            this.bitField0_ &= -3;
            this.readTimes_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearWriteTimes() {
            this.bitField0_ &= -2;
            this.writeTimes_ = 0;
        }

        public static NandMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NandMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (NandMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static NandMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (NandMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<NandMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEraseTimes(int value) {
            this.bitField0_ |= 4;
            this.eraseTimes_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setReadTimes(int value) {
            this.bitField0_ |= 2;
            this.readTimes_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setWriteTimes(int value) {
            this.bitField0_ |= 1;
            this.writeTimes_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new NandMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002", new Object[]{"bitField0_", "writeTimes_", "readTimes_", "eraseTimes_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<NandMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (NandMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Event.NandMessageOrBuilder
        public int getEraseTimes() {
            return this.eraseTimes_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.NandMessageOrBuilder
        public int getReadTimes() {
            return this.readTimes_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.NandMessageOrBuilder
        public int getWriteTimes() {
            return this.writeTimes_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.NandMessageOrBuilder
        public boolean hasEraseTimes() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.NandMessageOrBuilder
        public boolean hasReadTimes() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.NandMessageOrBuilder
        public boolean hasWriteTimes() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(NandMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static NandMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NandMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static NandMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NandMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NandMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (NandMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static NandMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NandMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NandMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (NandMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static NandMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NandMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NandMessage parseFrom(InputStream input) throws IOException {
            return (NandMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static NandMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NandMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static NandMessage parseFrom(CodedInputStream input) throws IOException {
            return (NandMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static NandMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NandMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface NandMessageOrBuilder extends MessageLiteOrBuilder {
        int getEraseTimes();

        int getReadTimes();

        int getWriteTimes();

        boolean hasEraseTimes();

        boolean hasReadTimes();

        boolean hasWriteTimes();
    }

    public static final class NotifyMessage extends GeneratedMessageLite<NotifyMessage, Builder> implements NotifyMessageOrBuilder {
        private static final NotifyMessage DEFAULT_INSTANCE;
        public static final int DETAIL_FIELD_NUMBER = 2;
        private static volatile Parser<NotifyMessage> PARSER = null;
        public static final int RECIVE_FIELD_NUMBER = 1;
        private int bitField0_;
        private int detail_;
        private byte memoizedIsInitialized = 2;
        private int recive_;

        public static final class Builder extends GeneratedMessageLite.Builder<NotifyMessage, Builder> implements NotifyMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearDetail() {
                copyOnWrite();
                ((NotifyMessage) this.instance).clearDetail();
                return this;
            }

            public Builder clearRecive() {
                copyOnWrite();
                ((NotifyMessage) this.instance).clearRecive();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.NotifyMessageOrBuilder
            public int getDetail() {
                return ((NotifyMessage) this.instance).getDetail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.NotifyMessageOrBuilder
            public int getRecive() {
                return ((NotifyMessage) this.instance).getRecive();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.NotifyMessageOrBuilder
            public boolean hasDetail() {
                return ((NotifyMessage) this.instance).hasDetail();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.NotifyMessageOrBuilder
            public boolean hasRecive() {
                return ((NotifyMessage) this.instance).hasRecive();
            }

            public Builder setDetail(int value) {
                copyOnWrite();
                ((NotifyMessage) this.instance).setDetail(value);
                return this;
            }

            public Builder setRecive(int value) {
                copyOnWrite();
                ((NotifyMessage) this.instance).setRecive(value);
                return this;
            }

            private Builder() {
                super(NotifyMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            NotifyMessage notifyMessage = new NotifyMessage();
            DEFAULT_INSTANCE = notifyMessage;
            GeneratedMessageLite.registerDefaultInstance(NotifyMessage.class, notifyMessage);
        }

        private NotifyMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDetail() {
            this.bitField0_ &= -3;
            this.detail_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRecive() {
            this.bitField0_ &= -2;
            this.recive_ = 0;
        }

        public static NotifyMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NotifyMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (NotifyMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static NotifyMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (NotifyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<NotifyMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDetail(int value) {
            this.bitField0_ |= 2;
            this.detail_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRecive(int value) {
            this.bitField0_ |= 1;
            this.recive_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new NotifyMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔋ\u0000\u0002ᔋ\u0001", new Object[]{"bitField0_", "recive_", "detail_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<NotifyMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (NotifyMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Event.NotifyMessageOrBuilder
        public int getDetail() {
            return this.detail_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.NotifyMessageOrBuilder
        public int getRecive() {
            return this.recive_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.NotifyMessageOrBuilder
        public boolean hasDetail() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.NotifyMessageOrBuilder
        public boolean hasRecive() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(NotifyMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static NotifyMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NotifyMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static NotifyMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NotifyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NotifyMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (NotifyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static NotifyMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NotifyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NotifyMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (NotifyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static NotifyMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NotifyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NotifyMessage parseFrom(InputStream input) throws IOException {
            return (NotifyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static NotifyMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NotifyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static NotifyMessage parseFrom(CodedInputStream input) throws IOException {
            return (NotifyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static NotifyMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NotifyMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface NotifyMessageOrBuilder extends MessageLiteOrBuilder {
        int getDetail();

        int getRecive();

        boolean hasDetail();

        boolean hasRecive();
    }

    public static final class SportStatusMessage extends GeneratedMessageLite<SportStatusMessage, Builder> implements SportStatusMessageOrBuilder {
        public static final int AUTOPAUSE_FIELD_NUMBER = 4;
        public static final int CALTARGE_FIELD_NUMBER = 3;
        private static final SportStatusMessage DEFAULT_INSTANCE;
        public static final int DISTANCETARGE_FIELD_NUMBER = 1;
        private static volatile Parser<SportStatusMessage> PARSER = null;
        public static final int SPORTGRAPH_FIELD_NUMBER = 5;
        public static final int TIMETARGE_FIELD_NUMBER = 2;
        private boolean autoPause_;
        private int bitField0_;
        private int calTarge_;
        private int distanceTarge_;
        private byte memoizedIsInitialized = 2;
        private int sportGraph_;
        private int timeTarge_;

        public static final class Builder extends GeneratedMessageLite.Builder<SportStatusMessage, Builder> implements SportStatusMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearAutoPause() {
                copyOnWrite();
                ((SportStatusMessage) this.instance).clearAutoPause();
                return this;
            }

            public Builder clearCalTarge() {
                copyOnWrite();
                ((SportStatusMessage) this.instance).clearCalTarge();
                return this;
            }

            public Builder clearDistanceTarge() {
                copyOnWrite();
                ((SportStatusMessage) this.instance).clearDistanceTarge();
                return this;
            }

            public Builder clearSportGraph() {
                copyOnWrite();
                ((SportStatusMessage) this.instance).clearSportGraph();
                return this;
            }

            public Builder clearTimeTarge() {
                copyOnWrite();
                ((SportStatusMessage) this.instance).clearTimeTarge();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
            public boolean getAutoPause() {
                return ((SportStatusMessage) this.instance).getAutoPause();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
            public int getCalTarge() {
                return ((SportStatusMessage) this.instance).getCalTarge();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
            public int getDistanceTarge() {
                return ((SportStatusMessage) this.instance).getDistanceTarge();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
            public int getSportGraph() {
                return ((SportStatusMessage) this.instance).getSportGraph();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
            public int getTimeTarge() {
                return ((SportStatusMessage) this.instance).getTimeTarge();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
            public boolean hasAutoPause() {
                return ((SportStatusMessage) this.instance).hasAutoPause();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
            public boolean hasCalTarge() {
                return ((SportStatusMessage) this.instance).hasCalTarge();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
            public boolean hasDistanceTarge() {
                return ((SportStatusMessage) this.instance).hasDistanceTarge();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
            public boolean hasSportGraph() {
                return ((SportStatusMessage) this.instance).hasSportGraph();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
            public boolean hasTimeTarge() {
                return ((SportStatusMessage) this.instance).hasTimeTarge();
            }

            public Builder setAutoPause(boolean value) {
                copyOnWrite();
                ((SportStatusMessage) this.instance).setAutoPause(value);
                return this;
            }

            public Builder setCalTarge(int value) {
                copyOnWrite();
                ((SportStatusMessage) this.instance).setCalTarge(value);
                return this;
            }

            public Builder setDistanceTarge(int value) {
                copyOnWrite();
                ((SportStatusMessage) this.instance).setDistanceTarge(value);
                return this;
            }

            public Builder setSportGraph(int value) {
                copyOnWrite();
                ((SportStatusMessage) this.instance).setSportGraph(value);
                return this;
            }

            public Builder setTimeTarge(int value) {
                copyOnWrite();
                ((SportStatusMessage) this.instance).setTimeTarge(value);
                return this;
            }

            private Builder() {
                super(SportStatusMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            SportStatusMessage sportStatusMessage = new SportStatusMessage();
            DEFAULT_INSTANCE = sportStatusMessage;
            GeneratedMessageLite.registerDefaultInstance(SportStatusMessage.class, sportStatusMessage);
        }

        private SportStatusMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearAutoPause() {
            this.bitField0_ &= -9;
            this.autoPause_ = false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearCalTarge() {
            this.bitField0_ &= -5;
            this.calTarge_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearDistanceTarge() {
            this.bitField0_ &= -2;
            this.distanceTarge_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSportGraph() {
            this.bitField0_ &= -17;
            this.sportGraph_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTimeTarge() {
            this.bitField0_ &= -3;
            this.timeTarge_ = 0;
        }

        public static SportStatusMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static SportStatusMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (SportStatusMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static SportStatusMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (SportStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<SportStatusMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setAutoPause(boolean value) {
            this.bitField0_ |= 8;
            this.autoPause_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setCalTarge(int value) {
            this.bitField0_ |= 4;
            this.calTarge_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setDistanceTarge(int value) {
            this.bitField0_ |= 1;
            this.distanceTarge_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSportGraph(int value) {
            this.bitField0_ |= 16;
            this.sportGraph_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTimeTarge(int value) {
            this.bitField0_ |= 2;
            this.timeTarge_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new SportStatusMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0002\u0001ဋ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ᔇ\u0003\u0005ᔋ\u0004", new Object[]{"bitField0_", "distanceTarge_", "timeTarge_", "calTarge_", "autoPause_", "sportGraph_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<SportStatusMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (SportStatusMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
        public boolean getAutoPause() {
            return this.autoPause_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
        public int getCalTarge() {
            return this.calTarge_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
        public int getDistanceTarge() {
            return this.distanceTarge_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
        public int getSportGraph() {
            return this.sportGraph_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
        public int getTimeTarge() {
            return this.timeTarge_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
        public boolean hasAutoPause() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
        public boolean hasCalTarge() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
        public boolean hasDistanceTarge() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
        public boolean hasSportGraph() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.SportStatusMessageOrBuilder
        public boolean hasTimeTarge() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(SportStatusMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static SportStatusMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (SportStatusMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static SportStatusMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (SportStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SportStatusMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (SportStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static SportStatusMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (SportStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SportStatusMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (SportStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static SportStatusMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (SportStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static SportStatusMessage parseFrom(InputStream input) throws IOException {
            return (SportStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static SportStatusMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (SportStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static SportStatusMessage parseFrom(CodedInputStream input) throws IOException {
            return (SportStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static SportStatusMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (SportStatusMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface SportStatusMessageOrBuilder extends MessageLiteOrBuilder {
        boolean getAutoPause();

        int getCalTarge();

        int getDistanceTarge();

        int getSportGraph();

        int getTimeTarge();

        boolean hasAutoPause();

        boolean hasCalTarge();

        boolean hasDistanceTarge();

        boolean hasSportGraph();

        boolean hasTimeTarge();
    }

    public static final class lightscreentimeMessage extends GeneratedMessageLite<lightscreentimeMessage, Builder> implements lightscreentimeMessageOrBuilder {
        private static final lightscreentimeMessage DEFAULT_INSTANCE;
        public static final int ENDTIME_FIELD_NUMBER = 2;
        private static volatile Parser<lightscreentimeMessage> PARSER = null;
        public static final int STARTTIME_FIELD_NUMBER = 1;
        private int bitField0_;
        private int endtime_;
        private byte memoizedIsInitialized = 2;
        private int starttime_;

        public static final class Builder extends GeneratedMessageLite.Builder<lightscreentimeMessage, Builder> implements lightscreentimeMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearEndtime() {
                copyOnWrite();
                ((lightscreentimeMessage) this.instance).clearEndtime();
                return this;
            }

            public Builder clearStarttime() {
                copyOnWrite();
                ((lightscreentimeMessage) this.instance).clearStarttime();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.lightscreentimeMessageOrBuilder
            public int getEndtime() {
                return ((lightscreentimeMessage) this.instance).getEndtime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.lightscreentimeMessageOrBuilder
            public int getStarttime() {
                return ((lightscreentimeMessage) this.instance).getStarttime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.lightscreentimeMessageOrBuilder
            public boolean hasEndtime() {
                return ((lightscreentimeMessage) this.instance).hasEndtime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.lightscreentimeMessageOrBuilder
            public boolean hasStarttime() {
                return ((lightscreentimeMessage) this.instance).hasStarttime();
            }

            public Builder setEndtime(int value) {
                copyOnWrite();
                ((lightscreentimeMessage) this.instance).setEndtime(value);
                return this;
            }

            public Builder setStarttime(int value) {
                copyOnWrite();
                ((lightscreentimeMessage) this.instance).setStarttime(value);
                return this;
            }

            private Builder() {
                super(lightscreentimeMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            lightscreentimeMessage lightscreentimemessage = new lightscreentimeMessage();
            DEFAULT_INSTANCE = lightscreentimemessage;
            GeneratedMessageLite.registerDefaultInstance(lightscreentimeMessage.class, lightscreentimemessage);
        }

        private lightscreentimeMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndtime() {
            this.bitField0_ &= -3;
            this.endtime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStarttime() {
            this.bitField0_ &= -2;
            this.starttime_ = 0;
        }

        public static lightscreentimeMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static lightscreentimeMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (lightscreentimeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static lightscreentimeMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (lightscreentimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<lightscreentimeMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndtime(int value) {
            this.bitField0_ |= 2;
            this.endtime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStarttime(int value) {
            this.bitField0_ |= 1;
            this.starttime_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new lightscreentimeMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔋ\u0000\u0002ᔋ\u0001", new Object[]{"bitField0_", "starttime_", "endtime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<lightscreentimeMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (lightscreentimeMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Event.lightscreentimeMessageOrBuilder
        public int getEndtime() {
            return this.endtime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.lightscreentimeMessageOrBuilder
        public int getStarttime() {
            return this.starttime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.lightscreentimeMessageOrBuilder
        public boolean hasEndtime() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.lightscreentimeMessageOrBuilder
        public boolean hasStarttime() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(lightscreentimeMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static lightscreentimeMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (lightscreentimeMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static lightscreentimeMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (lightscreentimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static lightscreentimeMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (lightscreentimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static lightscreentimeMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (lightscreentimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static lightscreentimeMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (lightscreentimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static lightscreentimeMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (lightscreentimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static lightscreentimeMessage parseFrom(InputStream input) throws IOException {
            return (lightscreentimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static lightscreentimeMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (lightscreentimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static lightscreentimeMessage parseFrom(CodedInputStream input) throws IOException {
            return (lightscreentimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static lightscreentimeMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (lightscreentimeMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface lightscreentimeMessageOrBuilder extends MessageLiteOrBuilder {
        int getEndtime();

        int getStarttime();

        boolean hasEndtime();

        boolean hasStarttime();
    }

    public static final class wifiuseMessage extends GeneratedMessageLite<wifiuseMessage, Builder> implements wifiuseMessageOrBuilder {
        private static final wifiuseMessage DEFAULT_INSTANCE;
        public static final int ENDTIME_FIELD_NUMBER = 2;
        private static volatile Parser<wifiuseMessage> PARSER = null;
        public static final int STARTTIME_FIELD_NUMBER = 1;
        private int bitField0_;
        private int endtime_;
        private byte memoizedIsInitialized = 2;
        private int starttime_;

        public static final class Builder extends GeneratedMessageLite.Builder<wifiuseMessage, Builder> implements wifiuseMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearEndtime() {
                copyOnWrite();
                ((wifiuseMessage) this.instance).clearEndtime();
                return this;
            }

            public Builder clearStarttime() {
                copyOnWrite();
                ((wifiuseMessage) this.instance).clearStarttime();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.wifiuseMessageOrBuilder
            public int getEndtime() {
                return ((wifiuseMessage) this.instance).getEndtime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.wifiuseMessageOrBuilder
            public int getStarttime() {
                return ((wifiuseMessage) this.instance).getStarttime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.wifiuseMessageOrBuilder
            public boolean hasEndtime() {
                return ((wifiuseMessage) this.instance).hasEndtime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Event.wifiuseMessageOrBuilder
            public boolean hasStarttime() {
                return ((wifiuseMessage) this.instance).hasStarttime();
            }

            public Builder setEndtime(int value) {
                copyOnWrite();
                ((wifiuseMessage) this.instance).setEndtime(value);
                return this;
            }

            public Builder setStarttime(int value) {
                copyOnWrite();
                ((wifiuseMessage) this.instance).setStarttime(value);
                return this;
            }

            private Builder() {
                super(wifiuseMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            wifiuseMessage wifiusemessage = new wifiuseMessage();
            DEFAULT_INSTANCE = wifiusemessage;
            GeneratedMessageLite.registerDefaultInstance(wifiuseMessage.class, wifiusemessage);
        }

        private wifiuseMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearEndtime() {
            this.bitField0_ &= -3;
            this.endtime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearStarttime() {
            this.bitField0_ &= -2;
            this.starttime_ = 0;
        }

        public static wifiuseMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static wifiuseMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (wifiuseMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static wifiuseMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (wifiuseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<wifiuseMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setEndtime(int value) {
            this.bitField0_ |= 2;
            this.endtime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStarttime(int value) {
            this.bitField0_ |= 1;
            this.starttime_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new wifiuseMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔋ\u0000\u0002ᔋ\u0001", new Object[]{"bitField0_", "starttime_", "endtime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<wifiuseMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (wifiuseMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Event.wifiuseMessageOrBuilder
        public int getEndtime() {
            return this.endtime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.wifiuseMessageOrBuilder
        public int getStarttime() {
            return this.starttime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.wifiuseMessageOrBuilder
        public boolean hasEndtime() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Event.wifiuseMessageOrBuilder
        public boolean hasStarttime() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(wifiuseMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static wifiuseMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (wifiuseMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static wifiuseMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (wifiuseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static wifiuseMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (wifiuseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static wifiuseMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (wifiuseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static wifiuseMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (wifiuseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static wifiuseMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (wifiuseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static wifiuseMessage parseFrom(InputStream input) throws IOException {
            return (wifiuseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static wifiuseMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (wifiuseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static wifiuseMessage parseFrom(CodedInputStream input) throws IOException {
            return (wifiuseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static wifiuseMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (wifiuseMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface wifiuseMessageOrBuilder extends MessageLiteOrBuilder {
        int getEndtime();

        int getStarttime();

        boolean hasEndtime();

        boolean hasStarttime();
    }

    private Event() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }
}
