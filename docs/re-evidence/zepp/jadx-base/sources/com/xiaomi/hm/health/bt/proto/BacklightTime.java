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
public final class BacklightTime {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.BacklightTime$1, reason: invalid class name */
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

    public static final class BacklightTimeDayMessage extends GeneratedMessageLite<BacklightTimeDayMessage, Builder> implements BacklightTimeDayMessageOrBuilder {
        private static final BacklightTimeDayMessage DEFAULT_INSTANCE;
        public static final int LCDONTIMEBYEVENT_FIELD_NUMBER = 2;
        public static final int LCDONTIMEBYPRESS_FIELD_NUMBER = 1;
        private static volatile Parser<BacklightTimeDayMessage> PARSER;
        private Internal.IntList lcdOnTimeByPress_ = GeneratedMessageLite.emptyIntList();
        private Internal.IntList lcdOnTimeByEvent_ = GeneratedMessageLite.emptyIntList();

        public static final class Builder extends GeneratedMessageLite.Builder<BacklightTimeDayMessage, Builder> implements BacklightTimeDayMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllLcdOnTimeByEvent(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((BacklightTimeDayMessage) this.instance).addAllLcdOnTimeByEvent(values);
                return this;
            }

            public Builder addAllLcdOnTimeByPress(Iterable<? extends Integer> values) {
                copyOnWrite();
                ((BacklightTimeDayMessage) this.instance).addAllLcdOnTimeByPress(values);
                return this;
            }

            public Builder addLcdOnTimeByEvent(int value) {
                copyOnWrite();
                ((BacklightTimeDayMessage) this.instance).addLcdOnTimeByEvent(value);
                return this;
            }

            public Builder addLcdOnTimeByPress(int value) {
                copyOnWrite();
                ((BacklightTimeDayMessage) this.instance).addLcdOnTimeByPress(value);
                return this;
            }

            public Builder clearLcdOnTimeByEvent() {
                copyOnWrite();
                ((BacklightTimeDayMessage) this.instance).clearLcdOnTimeByEvent();
                return this;
            }

            public Builder clearLcdOnTimeByPress() {
                copyOnWrite();
                ((BacklightTimeDayMessage) this.instance).clearLcdOnTimeByPress();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeDayMessageOrBuilder
            public int getLcdOnTimeByEvent(int index) {
                return ((BacklightTimeDayMessage) this.instance).getLcdOnTimeByEvent(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeDayMessageOrBuilder
            public int getLcdOnTimeByEventCount() {
                return ((BacklightTimeDayMessage) this.instance).getLcdOnTimeByEventCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeDayMessageOrBuilder
            public List<Integer> getLcdOnTimeByEventList() {
                return Collections.unmodifiableList(((BacklightTimeDayMessage) this.instance).getLcdOnTimeByEventList());
            }

            @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeDayMessageOrBuilder
            public int getLcdOnTimeByPress(int index) {
                return ((BacklightTimeDayMessage) this.instance).getLcdOnTimeByPress(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeDayMessageOrBuilder
            public int getLcdOnTimeByPressCount() {
                return ((BacklightTimeDayMessage) this.instance).getLcdOnTimeByPressCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeDayMessageOrBuilder
            public List<Integer> getLcdOnTimeByPressList() {
                return Collections.unmodifiableList(((BacklightTimeDayMessage) this.instance).getLcdOnTimeByPressList());
            }

            public Builder setLcdOnTimeByEvent(int index, int value) {
                copyOnWrite();
                ((BacklightTimeDayMessage) this.instance).setLcdOnTimeByEvent(index, value);
                return this;
            }

            public Builder setLcdOnTimeByPress(int index, int value) {
                copyOnWrite();
                ((BacklightTimeDayMessage) this.instance).setLcdOnTimeByPress(index, value);
                return this;
            }

            private Builder() {
                super(BacklightTimeDayMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            BacklightTimeDayMessage backlightTimeDayMessage = new BacklightTimeDayMessage();
            DEFAULT_INSTANCE = backlightTimeDayMessage;
            GeneratedMessageLite.registerDefaultInstance(BacklightTimeDayMessage.class, backlightTimeDayMessage);
        }

        private BacklightTimeDayMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLcdOnTimeByEvent(Iterable<? extends Integer> values) {
            ensureLcdOnTimeByEventIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.lcdOnTimeByEvent_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLcdOnTimeByPress(Iterable<? extends Integer> values) {
            ensureLcdOnTimeByPressIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.lcdOnTimeByPress_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLcdOnTimeByEvent(int value) {
            ensureLcdOnTimeByEventIsMutable();
            this.lcdOnTimeByEvent_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLcdOnTimeByPress(int value) {
            ensureLcdOnTimeByPressIsMutable();
            this.lcdOnTimeByPress_.addInt(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLcdOnTimeByEvent() {
            this.lcdOnTimeByEvent_ = GeneratedMessageLite.emptyIntList();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLcdOnTimeByPress() {
            this.lcdOnTimeByPress_ = GeneratedMessageLite.emptyIntList();
        }

        private void ensureLcdOnTimeByEventIsMutable() {
            Internal.IntList intList = this.lcdOnTimeByEvent_;
            if (intList.isModifiable()) {
                return;
            }
            this.lcdOnTimeByEvent_ = GeneratedMessageLite.mutableCopy(intList);
        }

        private void ensureLcdOnTimeByPressIsMutable() {
            Internal.IntList intList = this.lcdOnTimeByPress_;
            if (intList.isModifiable()) {
                return;
            }
            this.lcdOnTimeByPress_ = GeneratedMessageLite.mutableCopy(intList);
        }

        public static BacklightTimeDayMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BacklightTimeDayMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (BacklightTimeDayMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static BacklightTimeDayMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (BacklightTimeDayMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<BacklightTimeDayMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOnTimeByEvent(int index, int value) {
            ensureLcdOnTimeByEventIsMutable();
            this.lcdOnTimeByEvent_.setInt(index, value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOnTimeByPress(int index, int value) {
            ensureLcdOnTimeByPressIsMutable();
            this.lcdOnTimeByPress_.setInt(index, value);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new BacklightTimeDayMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001d\u0002\u001d", new Object[]{"lcdOnTimeByPress_", "lcdOnTimeByEvent_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<BacklightTimeDayMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (BacklightTimeDayMessage.class) {
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
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeDayMessageOrBuilder
        public int getLcdOnTimeByEvent(int index) {
            return this.lcdOnTimeByEvent_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeDayMessageOrBuilder
        public int getLcdOnTimeByEventCount() {
            return this.lcdOnTimeByEvent_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeDayMessageOrBuilder
        public List<Integer> getLcdOnTimeByEventList() {
            return this.lcdOnTimeByEvent_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeDayMessageOrBuilder
        public int getLcdOnTimeByPress(int index) {
            return this.lcdOnTimeByPress_.getInt(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeDayMessageOrBuilder
        public int getLcdOnTimeByPressCount() {
            return this.lcdOnTimeByPress_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeDayMessageOrBuilder
        public List<Integer> getLcdOnTimeByPressList() {
            return this.lcdOnTimeByPress_;
        }

        public static Builder newBuilder(BacklightTimeDayMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static BacklightTimeDayMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BacklightTimeDayMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static BacklightTimeDayMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (BacklightTimeDayMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static BacklightTimeDayMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (BacklightTimeDayMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static BacklightTimeDayMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (BacklightTimeDayMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static BacklightTimeDayMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (BacklightTimeDayMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static BacklightTimeDayMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (BacklightTimeDayMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static BacklightTimeDayMessage parseFrom(InputStream input) throws IOException {
            return (BacklightTimeDayMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static BacklightTimeDayMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BacklightTimeDayMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static BacklightTimeDayMessage parseFrom(CodedInputStream input) throws IOException {
            return (BacklightTimeDayMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static BacklightTimeDayMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BacklightTimeDayMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface BacklightTimeDayMessageOrBuilder extends MessageLiteOrBuilder {
        int getLcdOnTimeByEvent(int index);

        int getLcdOnTimeByEventCount();

        List<Integer> getLcdOnTimeByEventList();

        int getLcdOnTimeByPress(int index);

        int getLcdOnTimeByPressCount();

        List<Integer> getLcdOnTimeByPressList();
    }

    public static final class BacklightTimeWeekMessage extends GeneratedMessageLite<BacklightTimeWeekMessage, Builder> implements BacklightTimeWeekMessageOrBuilder {
        private static final BacklightTimeWeekMessage DEFAULT_INSTANCE;
        public static final int LCDONDAYTIME_FIELD_NUMBER = 1;
        private static volatile Parser<BacklightTimeWeekMessage> PARSER;
        private Internal.ProtobufList<BacklightTimeDayMessage> lcdOnDayTime_ = GeneratedMessageLite.emptyProtobufList();

        public static final class Builder extends GeneratedMessageLite.Builder<BacklightTimeWeekMessage, Builder> implements BacklightTimeWeekMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder addAllLcdOnDayTime(Iterable<? extends BacklightTimeDayMessage> values) {
                copyOnWrite();
                ((BacklightTimeWeekMessage) this.instance).addAllLcdOnDayTime(values);
                return this;
            }

            public Builder addLcdOnDayTime(BacklightTimeDayMessage value) {
                copyOnWrite();
                ((BacklightTimeWeekMessage) this.instance).addLcdOnDayTime(value);
                return this;
            }

            public Builder clearLcdOnDayTime() {
                copyOnWrite();
                ((BacklightTimeWeekMessage) this.instance).clearLcdOnDayTime();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeWeekMessageOrBuilder
            public BacklightTimeDayMessage getLcdOnDayTime(int index) {
                return ((BacklightTimeWeekMessage) this.instance).getLcdOnDayTime(index);
            }

            @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeWeekMessageOrBuilder
            public int getLcdOnDayTimeCount() {
                return ((BacklightTimeWeekMessage) this.instance).getLcdOnDayTimeCount();
            }

            @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeWeekMessageOrBuilder
            public List<BacklightTimeDayMessage> getLcdOnDayTimeList() {
                return Collections.unmodifiableList(((BacklightTimeWeekMessage) this.instance).getLcdOnDayTimeList());
            }

            public Builder removeLcdOnDayTime(int index) {
                copyOnWrite();
                ((BacklightTimeWeekMessage) this.instance).removeLcdOnDayTime(index);
                return this;
            }

            public Builder setLcdOnDayTime(int index, BacklightTimeDayMessage value) {
                copyOnWrite();
                ((BacklightTimeWeekMessage) this.instance).setLcdOnDayTime(index, value);
                return this;
            }

            private Builder() {
                super(BacklightTimeWeekMessage.DEFAULT_INSTANCE);
            }

            public Builder addLcdOnDayTime(int index, BacklightTimeDayMessage value) {
                copyOnWrite();
                ((BacklightTimeWeekMessage) this.instance).addLcdOnDayTime(index, value);
                return this;
            }

            public Builder setLcdOnDayTime(int index, BacklightTimeDayMessage.Builder builderForValue) {
                copyOnWrite();
                ((BacklightTimeWeekMessage) this.instance).setLcdOnDayTime(index, builderForValue.build());
                return this;
            }

            public Builder addLcdOnDayTime(BacklightTimeDayMessage.Builder builderForValue) {
                copyOnWrite();
                ((BacklightTimeWeekMessage) this.instance).addLcdOnDayTime(builderForValue.build());
                return this;
            }

            public Builder addLcdOnDayTime(int index, BacklightTimeDayMessage.Builder builderForValue) {
                copyOnWrite();
                ((BacklightTimeWeekMessage) this.instance).addLcdOnDayTime(index, builderForValue.build());
                return this;
            }
        }

        static {
            BacklightTimeWeekMessage backlightTimeWeekMessage = new BacklightTimeWeekMessage();
            DEFAULT_INSTANCE = backlightTimeWeekMessage;
            GeneratedMessageLite.registerDefaultInstance(BacklightTimeWeekMessage.class, backlightTimeWeekMessage);
        }

        private BacklightTimeWeekMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addAllLcdOnDayTime(Iterable<? extends BacklightTimeDayMessage> values) {
            ensureLcdOnDayTimeIsMutable();
            AbstractMessageLite.addAll((Iterable) values, (List) this.lcdOnDayTime_);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLcdOnDayTime(BacklightTimeDayMessage value) {
            value.getClass();
            ensureLcdOnDayTimeIsMutable();
            this.lcdOnDayTime_.add(value);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearLcdOnDayTime() {
            this.lcdOnDayTime_ = GeneratedMessageLite.emptyProtobufList();
        }

        private void ensureLcdOnDayTimeIsMutable() {
            Internal.ProtobufList<BacklightTimeDayMessage> protobufList = this.lcdOnDayTime_;
            if (protobufList.isModifiable()) {
                return;
            }
            this.lcdOnDayTime_ = GeneratedMessageLite.mutableCopy(protobufList);
        }

        public static BacklightTimeWeekMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static BacklightTimeWeekMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (BacklightTimeWeekMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static BacklightTimeWeekMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (BacklightTimeWeekMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<BacklightTimeWeekMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void removeLcdOnDayTime(int index) {
            ensureLcdOnDayTimeIsMutable();
            this.lcdOnDayTime_.remove(index);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setLcdOnDayTime(int index, BacklightTimeDayMessage value) {
            value.getClass();
            ensureLcdOnDayTimeIsMutable();
            this.lcdOnDayTime_.set(index, value);
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new BacklightTimeWeekMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"lcdOnDayTime_", BacklightTimeDayMessage.class});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<BacklightTimeWeekMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (BacklightTimeWeekMessage.class) {
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
                    return (byte) 1;
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeWeekMessageOrBuilder
        public BacklightTimeDayMessage getLcdOnDayTime(int index) {
            return this.lcdOnDayTime_.get(index);
        }

        @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeWeekMessageOrBuilder
        public int getLcdOnDayTimeCount() {
            return this.lcdOnDayTime_.size();
        }

        @Override // com.xiaomi.hm.health.bt.proto.BacklightTime.BacklightTimeWeekMessageOrBuilder
        public List<BacklightTimeDayMessage> getLcdOnDayTimeList() {
            return this.lcdOnDayTime_;
        }

        public BacklightTimeDayMessageOrBuilder getLcdOnDayTimeOrBuilder(int index) {
            return this.lcdOnDayTime_.get(index);
        }

        public List<? extends BacklightTimeDayMessageOrBuilder> getLcdOnDayTimeOrBuilderList() {
            return this.lcdOnDayTime_;
        }

        public static Builder newBuilder(BacklightTimeWeekMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static BacklightTimeWeekMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BacklightTimeWeekMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static BacklightTimeWeekMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (BacklightTimeWeekMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static BacklightTimeWeekMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (BacklightTimeWeekMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void addLcdOnDayTime(int index, BacklightTimeDayMessage value) {
            value.getClass();
            ensureLcdOnDayTimeIsMutable();
            this.lcdOnDayTime_.add(index, value);
        }

        public static BacklightTimeWeekMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (BacklightTimeWeekMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static BacklightTimeWeekMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (BacklightTimeWeekMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static BacklightTimeWeekMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (BacklightTimeWeekMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static BacklightTimeWeekMessage parseFrom(InputStream input) throws IOException {
            return (BacklightTimeWeekMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static BacklightTimeWeekMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BacklightTimeWeekMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static BacklightTimeWeekMessage parseFrom(CodedInputStream input) throws IOException {
            return (BacklightTimeWeekMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static BacklightTimeWeekMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (BacklightTimeWeekMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface BacklightTimeWeekMessageOrBuilder extends MessageLiteOrBuilder {
        BacklightTimeDayMessage getLcdOnDayTime(int index);

        int getLcdOnDayTimeCount();

        List<BacklightTimeDayMessage> getLcdOnDayTimeList();
    }

    private BacklightTime() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }
}
