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
public final class Bell {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.Bell$1, reason: invalid class name */
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

    public static final class BellEventMessage extends GeneratedMessageLite<BellEventMessage, Builder> implements BellEventMessageOrBuilder {
        private static final BellEventMessage DEFAULT_INSTANCE;
        private static volatile Parser<BellEventMessage> PARSER = null;
        public static final int SLOT_FIELD_NUMBER = 3;
        public static final int USE_COUNT_FIELD_NUMBER = 1;
        public static final int USE_TIME_FIELD_NUMBER = 2;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private UseTimeSlot.UseTimeSlotMessage slot_;
        private int useCount_;
        private int useTime_;

        public static final class Builder extends GeneratedMessageLite.Builder<BellEventMessage, Builder> implements BellEventMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearSlot() {
                copyOnWrite();
                ((BellEventMessage) this.instance).clearSlot();
                return this;
            }

            public Builder clearUseCount() {
                copyOnWrite();
                ((BellEventMessage) this.instance).clearUseCount();
                return this;
            }

            public Builder clearUseTime() {
                copyOnWrite();
                ((BellEventMessage) this.instance).clearUseTime();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Bell.BellEventMessageOrBuilder
            public UseTimeSlot.UseTimeSlotMessage getSlot() {
                return ((BellEventMessage) this.instance).getSlot();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Bell.BellEventMessageOrBuilder
            public int getUseCount() {
                return ((BellEventMessage) this.instance).getUseCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Bell.BellEventMessageOrBuilder
            public int getUseTime() {
                return ((BellEventMessage) this.instance).getUseTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Bell.BellEventMessageOrBuilder
            public boolean hasSlot() {
                return ((BellEventMessage) this.instance).hasSlot();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Bell.BellEventMessageOrBuilder
            public boolean hasUseCount() {
                return ((BellEventMessage) this.instance).hasUseCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Bell.BellEventMessageOrBuilder
            public boolean hasUseTime() {
                return ((BellEventMessage) this.instance).hasUseTime();
            }

            public Builder mergeSlot(UseTimeSlot.UseTimeSlotMessage value) {
                copyOnWrite();
                ((BellEventMessage) this.instance).mergeSlot(value);
                return this;
            }

            public Builder setSlot(UseTimeSlot.UseTimeSlotMessage value) {
                copyOnWrite();
                ((BellEventMessage) this.instance).setSlot(value);
                return this;
            }

            public Builder setUseCount(int value) {
                copyOnWrite();
                ((BellEventMessage) this.instance).setUseCount(value);
                return this;
            }

            public Builder setUseTime(int value) {
                copyOnWrite();
                ((BellEventMessage) this.instance).setUseTime(value);
                return this;
            }

            private Builder() {
                super(BellEventMessage.DEFAULT_INSTANCE);
            }

            public Builder setSlot(UseTimeSlot.UseTimeSlotMessage.Builder builderForValue) {
                copyOnWrite();
                ((BellEventMessage) this.instance).setSlot(builderForValue.build());
                return this;
            }
        }

        static {
            BellEventMessage bellEventMessage = new BellEventMessage();
            DEFAULT_INSTANCE = bellEventMessage;
            GeneratedMessageLite.registerDefaultInstance(BellEventMessage.class, bellEventMessage);
        }

        private BellEventMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSlot() {
            this.slot_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUseCount() {
            this.bitField0_ &= -2;
            this.useCount_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearUseTime() {
            this.bitField0_ &= -3;
            this.useTime_ = 0;
        }

        public static BellEventMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeSlot(UseTimeSlot.UseTimeSlotMessage value) {
            value.getClass();
            UseTimeSlot.UseTimeSlotMessage useTimeSlotMessage = this.slot_;
            if (useTimeSlotMessage == null || useTimeSlotMessage == UseTimeSlot.UseTimeSlotMessage.getDefaultInstance()) {
                this.slot_ = value;
            } else {
                this.slot_ = UseTimeSlot.UseTimeSlotMessage.newBuilder(this.slot_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BellEventMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (BellEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static BellEventMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (BellEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<BellEventMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSlot(UseTimeSlot.UseTimeSlotMessage value) {
            value.getClass();
            this.slot_ = value;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUseCount(int value) {
            this.bitField0_ |= 1;
            this.useCount_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setUseTime(int value) {
            this.bitField0_ |= 2;
            this.useTime_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new BellEventMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "useCount_", "useTime_", "slot_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<BellEventMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (BellEventMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Bell.BellEventMessageOrBuilder
        public UseTimeSlot.UseTimeSlotMessage getSlot() {
            UseTimeSlot.UseTimeSlotMessage useTimeSlotMessage = this.slot_;
            return useTimeSlotMessage == null ? UseTimeSlot.UseTimeSlotMessage.getDefaultInstance() : useTimeSlotMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Bell.BellEventMessageOrBuilder
        public int getUseCount() {
            return this.useCount_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Bell.BellEventMessageOrBuilder
        public int getUseTime() {
            return this.useTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Bell.BellEventMessageOrBuilder
        public boolean hasSlot() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Bell.BellEventMessageOrBuilder
        public boolean hasUseCount() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Bell.BellEventMessageOrBuilder
        public boolean hasUseTime() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(BellEventMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static BellEventMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BellEventMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static BellEventMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (BellEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static BellEventMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (BellEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static BellEventMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (BellEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static BellEventMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (BellEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static BellEventMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (BellEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static BellEventMessage parseFrom(InputStream input) throws IOException {
            return (BellEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static BellEventMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BellEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static BellEventMessage parseFrom(CodedInputStream input) throws IOException {
            return (BellEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static BellEventMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BellEventMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface BellEventMessageOrBuilder extends MessageLiteOrBuilder {
        UseTimeSlot.UseTimeSlotMessage getSlot();

        int getUseCount();

        int getUseTime();

        boolean hasSlot();

        boolean hasUseCount();

        boolean hasUseTime();
    }

    public static final class BellStatisticsMessage extends GeneratedMessageLite<BellStatisticsMessage, Builder> implements BellStatisticsMessageOrBuilder {
        private static final BellStatisticsMessage DEFAULT_INSTANCE;
        public static final int LEFT_FIELD_NUMBER = 2;
        private static volatile Parser<BellStatisticsMessage> PARSER = null;
        public static final int RIGHT_FIELD_NUMBER = 3;
        public static final int VERSION_FIELD_NUMBER = 1;
        private int bitField0_;
        private BellEventMessage left_;
        private byte memoizedIsInitialized = 2;
        private BellEventMessage right_;
        private int version_;

        public static final class Builder extends GeneratedMessageLite.Builder<BellStatisticsMessage, Builder> implements BellStatisticsMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearLeft() {
                copyOnWrite();
                ((BellStatisticsMessage) this.instance).clearLeft();
                return this;
            }

            public Builder clearRight() {
                copyOnWrite();
                ((BellStatisticsMessage) this.instance).clearRight();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((BellStatisticsMessage) this.instance).clearVersion();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Bell.BellStatisticsMessageOrBuilder
            public BellEventMessage getLeft() {
                return ((BellStatisticsMessage) this.instance).getLeft();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Bell.BellStatisticsMessageOrBuilder
            public BellEventMessage getRight() {
                return ((BellStatisticsMessage) this.instance).getRight();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Bell.BellStatisticsMessageOrBuilder
            public int getVersion() {
                return ((BellStatisticsMessage) this.instance).getVersion();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Bell.BellStatisticsMessageOrBuilder
            public boolean hasLeft() {
                return ((BellStatisticsMessage) this.instance).hasLeft();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Bell.BellStatisticsMessageOrBuilder
            public boolean hasRight() {
                return ((BellStatisticsMessage) this.instance).hasRight();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Bell.BellStatisticsMessageOrBuilder
            public boolean hasVersion() {
                return ((BellStatisticsMessage) this.instance).hasVersion();
            }

            public Builder mergeLeft(BellEventMessage value) {
                copyOnWrite();
                ((BellStatisticsMessage) this.instance).mergeLeft(value);
                return this;
            }

            public Builder mergeRight(BellEventMessage value) {
                copyOnWrite();
                ((BellStatisticsMessage) this.instance).mergeRight(value);
                return this;
            }

            public Builder setLeft(BellEventMessage value) {
                copyOnWrite();
                ((BellStatisticsMessage) this.instance).setLeft(value);
                return this;
            }

            public Builder setRight(BellEventMessage value) {
                copyOnWrite();
                ((BellStatisticsMessage) this.instance).setRight(value);
                return this;
            }

            public Builder setVersion(int value) {
                copyOnWrite();
                ((BellStatisticsMessage) this.instance).setVersion(value);
                return this;
            }

            private Builder() {
                super(BellStatisticsMessage.DEFAULT_INSTANCE);
            }

            public Builder setLeft(BellEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((BellStatisticsMessage) this.instance).setLeft(builderForValue.build());
                return this;
            }

            public Builder setRight(BellEventMessage.Builder builderForValue) {
                copyOnWrite();
                ((BellStatisticsMessage) this.instance).setRight(builderForValue.build());
                return this;
            }
        }

        static {
            BellStatisticsMessage bellStatisticsMessage = new BellStatisticsMessage();
            DEFAULT_INSTANCE = bellStatisticsMessage;
            GeneratedMessageLite.registerDefaultInstance(BellStatisticsMessage.class, bellStatisticsMessage);
        }

        private BellStatisticsMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLeft() {
            this.left_ = null;
            this.bitField0_ &= -3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearRight() {
            this.right_ = null;
            this.bitField0_ &= -5;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.bitField0_ &= -2;
            this.version_ = 0;
        }

        public static BellStatisticsMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeLeft(BellEventMessage value) {
            value.getClass();
            BellEventMessage bellEventMessage = this.left_;
            if (bellEventMessage == null || bellEventMessage == BellEventMessage.getDefaultInstance()) {
                this.left_ = value;
            } else {
                this.left_ = BellEventMessage.newBuilder(this.left_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void mergeRight(BellEventMessage value) {
            value.getClass();
            BellEventMessage bellEventMessage = this.right_;
            if (bellEventMessage == null || bellEventMessage == BellEventMessage.getDefaultInstance()) {
                this.right_ = value;
            } else {
                this.right_ = BellEventMessage.newBuilder(this.right_).mergeFrom(value).buildPartial();
            }
            this.bitField0_ |= 4;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BellStatisticsMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (BellStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static BellStatisticsMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (BellStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<BellStatisticsMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLeft(BellEventMessage value) {
            value.getClass();
            this.left_ = value;
            this.bitField0_ |= 2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setRight(BellEventMessage value) {
            value.getClass();
            this.right_ = value;
            this.bitField0_ |= 4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(int value) {
            this.bitField0_ |= 1;
            this.version_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new BellStatisticsMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔋ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002", new Object[]{"bitField0_", "version_", "left_", "right_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<BellStatisticsMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (BellStatisticsMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Bell.BellStatisticsMessageOrBuilder
        public BellEventMessage getLeft() {
            BellEventMessage bellEventMessage = this.left_;
            return bellEventMessage == null ? BellEventMessage.getDefaultInstance() : bellEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Bell.BellStatisticsMessageOrBuilder
        public BellEventMessage getRight() {
            BellEventMessage bellEventMessage = this.right_;
            return bellEventMessage == null ? BellEventMessage.getDefaultInstance() : bellEventMessage;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Bell.BellStatisticsMessageOrBuilder
        public int getVersion() {
            return this.version_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Bell.BellStatisticsMessageOrBuilder
        public boolean hasLeft() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Bell.BellStatisticsMessageOrBuilder
        public boolean hasRight() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Bell.BellStatisticsMessageOrBuilder
        public boolean hasVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(BellStatisticsMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static BellStatisticsMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BellStatisticsMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static BellStatisticsMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (BellStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static BellStatisticsMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (BellStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static BellStatisticsMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (BellStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static BellStatisticsMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (BellStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static BellStatisticsMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (BellStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static BellStatisticsMessage parseFrom(InputStream input) throws IOException {
            return (BellStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static BellStatisticsMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BellStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static BellStatisticsMessage parseFrom(CodedInputStream input) throws IOException {
            return (BellStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static BellStatisticsMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BellStatisticsMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface BellStatisticsMessageOrBuilder extends MessageLiteOrBuilder {
        BellEventMessage getLeft();

        BellEventMessage getRight();

        int getVersion();

        boolean hasLeft();

        boolean hasRight();

        boolean hasVersion();
    }

    private Bell() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }
}
