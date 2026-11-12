package com.xiaomi.hm.health.bt.proto;

import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes20.dex */
public final class UseTimeSlot {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.UseTimeSlot$1, reason: invalid class name */
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

    public static final class UseTimeSlotMessage extends GeneratedMessageLite<UseTimeSlotMessage, Builder> implements UseTimeSlotMessageOrBuilder {
        private static final UseTimeSlotMessage DEFAULT_INSTANCE;
        private static volatile Parser<UseTimeSlotMessage> PARSER = null;
        public static final int SLOT_FIELD_NUMBER = 1;
        private byte memoizedIsInitialized = 2;
        private Internal.ProtobufList<UseTimeSlotUnitMessage> slot_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.Builder<UseTimeSlotMessage, Builder> implements UseTimeSlotMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllSlot(Iterable<? extends UseTimeSlotUnitMessage> values) {
                copyOnWrite();
                ((UseTimeSlotMessage) this.instance).addAllSlot(values);
                return this;
            }

            public Builder addSlot(UseTimeSlotUnitMessage value) {
                copyOnWrite();
                ((UseTimeSlotMessage) this.instance).addSlot(value);
                return this;
            }

            public Builder clearSlot() {
                copyOnWrite();
                ((UseTimeSlotMessage) this.instance).clearSlot();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotMessageOrBuilder
            public UseTimeSlotUnitMessage getSlot(int index) {
                return ((UseTimeSlotMessage) this.instance).getSlot(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotMessageOrBuilder
            public int getSlotCount() {
                return ((UseTimeSlotMessage) this.instance).getSlotCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotMessageOrBuilder
            public List<UseTimeSlotUnitMessage> getSlotList() {
                return Collections.unmodifiableList(((UseTimeSlotMessage) this.instance).getSlotList());
            }

            public Builder removeSlot(int index) {
                copyOnWrite();
                ((UseTimeSlotMessage) this.instance).removeSlot(index);
                return this;
            }

            public Builder setSlot(int index, UseTimeSlotUnitMessage value) {
                copyOnWrite();
                ((UseTimeSlotMessage) this.instance).setSlot(index, value);
                return this;
            }

            private Builder() {
                super(UseTimeSlotMessage.DEFAULT_INSTANCE);
            }

            public Builder addSlot(int index, UseTimeSlotUnitMessage value) {
                copyOnWrite();
                ((UseTimeSlotMessage) this.instance).addSlot(index, value);
                return this;
            }

            public Builder setSlot(int index, UseTimeSlotUnitMessage.Builder builderForValue) {
                copyOnWrite();
                ((UseTimeSlotMessage) this.instance).setSlot(index, builderForValue.build());
                return this;
            }

            public Builder addSlot(UseTimeSlotUnitMessage.Builder builderForValue) {
                copyOnWrite();
                ((UseTimeSlotMessage) this.instance).addSlot(builderForValue.build());
                return this;
            }

            public Builder addSlot(int index, UseTimeSlotUnitMessage.Builder builderForValue) {
                copyOnWrite();
                ((UseTimeSlotMessage) this.instance).addSlot(index, builderForValue.build());
                return this;
            }
        }

        static {
            UseTimeSlotMessage useTimeSlotMessage = new UseTimeSlotMessage();
            DEFAULT_INSTANCE = useTimeSlotMessage;
            GeneratedMessageLite.registerDefaultInstance(UseTimeSlotMessage.class, useTimeSlotMessage);
        }

        private UseTimeSlotMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllSlot(Iterable<? extends UseTimeSlotUnitMessage> values) {
            ensureSlotIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.slot_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSlot(UseTimeSlotUnitMessage value) {
            value.getClass();
            ensureSlotIsMutable();
            this.slot_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearSlot() {
            this.slot_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureSlotIsMutable() {
            Internal.ProtobufList<UseTimeSlotUnitMessage> protobufList = this.slot_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.slot_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static UseTimeSlotMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static UseTimeSlotMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (UseTimeSlotMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static UseTimeSlotMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (UseTimeSlotMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<UseTimeSlotMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeSlot(int index) {
            ensureSlotIsMutable();
            this.slot_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setSlot(int index, UseTimeSlotUnitMessage value) {
            value.getClass();
            ensureSlotIsMutable();
            this.slot_.set(index, value);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new UseTimeSlotMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"slot_", UseTimeSlotUnitMessage.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<UseTimeSlotMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (UseTimeSlotMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotMessageOrBuilder
        public UseTimeSlotUnitMessage getSlot(int index) {
            return this.slot_.get(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotMessageOrBuilder
        public int getSlotCount() {
            return this.slot_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotMessageOrBuilder
        public List<UseTimeSlotUnitMessage> getSlotList() {
            return this.slot_;
        }

        public UseTimeSlotUnitMessageOrBuilder getSlotOrBuilder(int index) {
            return this.slot_.get(index);
        }

        public List<? extends UseTimeSlotUnitMessageOrBuilder> getSlotOrBuilderList() {
            return this.slot_;
        }

        public static Builder newBuilder(UseTimeSlotMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static UseTimeSlotMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UseTimeSlotMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static UseTimeSlotMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (UseTimeSlotMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static UseTimeSlotMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (UseTimeSlotMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addSlot(int index, UseTimeSlotUnitMessage value) {
            value.getClass();
            ensureSlotIsMutable();
            this.slot_.add(index, value);
        }

        public static UseTimeSlotMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (UseTimeSlotMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static UseTimeSlotMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (UseTimeSlotMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static UseTimeSlotMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (UseTimeSlotMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static UseTimeSlotMessage parseFrom(InputStream input) throws IOException {
            return (UseTimeSlotMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static UseTimeSlotMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UseTimeSlotMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static UseTimeSlotMessage parseFrom(CodedInputStream input) throws IOException {
            return (UseTimeSlotMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static UseTimeSlotMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UseTimeSlotMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface UseTimeSlotMessageOrBuilder extends MessageLiteOrBuilder {
        UseTimeSlotUnitMessage getSlot(int index);

        int getSlotCount();

        List<UseTimeSlotUnitMessage> getSlotList();
    }

    public static final class UseTimeSlotUnitMessage extends GeneratedMessageLite<UseTimeSlotUnitMessage, Builder> implements UseTimeSlotUnitMessageOrBuilder {
        public static final int BATTERY_FIELD_NUMBER = 3;
        private static final UseTimeSlotUnitMessage DEFAULT_INSTANCE;
        public static final int MODE_FIELD_NUMBER = 2;
        private static volatile Parser<UseTimeSlotUnitMessage> PARSER = null;
        public static final int TIME_FIELD_NUMBER = 1;
        private int battery_;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private int mode_;
        private int time_;

        public static final class Builder extends GeneratedMessageLite.Builder<UseTimeSlotUnitMessage, Builder> implements UseTimeSlotUnitMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearBattery() {
                copyOnWrite();
                ((UseTimeSlotUnitMessage) this.instance).clearBattery();
                return this;
            }

            public Builder clearMode() {
                copyOnWrite();
                ((UseTimeSlotUnitMessage) this.instance).clearMode();
                return this;
            }

            public Builder clearTime() {
                copyOnWrite();
                ((UseTimeSlotUnitMessage) this.instance).clearTime();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotUnitMessageOrBuilder
            public int getBattery() {
                return ((UseTimeSlotUnitMessage) this.instance).getBattery();
            }

            @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotUnitMessageOrBuilder
            public int getMode() {
                return ((UseTimeSlotUnitMessage) this.instance).getMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotUnitMessageOrBuilder
            public int getTime() {
                return ((UseTimeSlotUnitMessage) this.instance).getTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotUnitMessageOrBuilder
            public boolean hasBattery() {
                return ((UseTimeSlotUnitMessage) this.instance).hasBattery();
            }

            @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotUnitMessageOrBuilder
            public boolean hasMode() {
                return ((UseTimeSlotUnitMessage) this.instance).hasMode();
            }

            @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotUnitMessageOrBuilder
            public boolean hasTime() {
                return ((UseTimeSlotUnitMessage) this.instance).hasTime();
            }

            public Builder setBattery(int value) {
                copyOnWrite();
                ((UseTimeSlotUnitMessage) this.instance).setBattery(value);
                return this;
            }

            public Builder setMode(int value) {
                copyOnWrite();
                ((UseTimeSlotUnitMessage) this.instance).setMode(value);
                return this;
            }

            public Builder setTime(int value) {
                copyOnWrite();
                ((UseTimeSlotUnitMessage) this.instance).setTime(value);
                return this;
            }

            private Builder() {
                super(UseTimeSlotUnitMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            UseTimeSlotUnitMessage useTimeSlotUnitMessage = new UseTimeSlotUnitMessage();
            DEFAULT_INSTANCE = useTimeSlotUnitMessage;
            GeneratedMessageLite.registerDefaultInstance(UseTimeSlotUnitMessage.class, useTimeSlotUnitMessage);
        }

        private UseTimeSlotUnitMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearBattery() {
            this.bitField0_ &= -5;
            this.battery_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearMode() {
            this.bitField0_ &= -3;
            this.mode_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearTime() {
            this.bitField0_ &= -2;
            this.time_ = 0;
        }

        public static UseTimeSlotUnitMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static UseTimeSlotUnitMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (UseTimeSlotUnitMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static UseTimeSlotUnitMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (UseTimeSlotUnitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<UseTimeSlotUnitMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setBattery(int value) {
            this.bitField0_ |= 4;
            this.battery_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setMode(int value) {
            this.bitField0_ |= 2;
            this.mode_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setTime(int value) {
            this.bitField0_ |= 1;
            this.time_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new UseTimeSlotUnitMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔋ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002", new Object[]{"bitField0_", "time_", "mode_", "battery_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<UseTimeSlotUnitMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (UseTimeSlotUnitMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotUnitMessageOrBuilder
        public int getBattery() {
            return this.battery_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotUnitMessageOrBuilder
        public int getMode() {
            return this.mode_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotUnitMessageOrBuilder
        public int getTime() {
            return this.time_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotUnitMessageOrBuilder
        public boolean hasBattery() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotUnitMessageOrBuilder
        public boolean hasMode() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.UseTimeSlot.UseTimeSlotUnitMessageOrBuilder
        public boolean hasTime() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(UseTimeSlotUnitMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static UseTimeSlotUnitMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UseTimeSlotUnitMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static UseTimeSlotUnitMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (UseTimeSlotUnitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static UseTimeSlotUnitMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (UseTimeSlotUnitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static UseTimeSlotUnitMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (UseTimeSlotUnitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static UseTimeSlotUnitMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (UseTimeSlotUnitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static UseTimeSlotUnitMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (UseTimeSlotUnitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static UseTimeSlotUnitMessage parseFrom(InputStream input) throws IOException {
            return (UseTimeSlotUnitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static UseTimeSlotUnitMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UseTimeSlotUnitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static UseTimeSlotUnitMessage parseFrom(CodedInputStream input) throws IOException {
            return (UseTimeSlotUnitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static UseTimeSlotUnitMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (UseTimeSlotUnitMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface UseTimeSlotUnitMessageOrBuilder extends MessageLiteOrBuilder {
        int getBattery();

        int getMode();

        int getTime();

        boolean hasBattery();

        boolean hasMode();

        boolean hasTime();
    }

    private UseTimeSlot() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }
}
