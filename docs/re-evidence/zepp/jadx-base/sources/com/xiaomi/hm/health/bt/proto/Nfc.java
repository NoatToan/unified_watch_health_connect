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
public final class Nfc {

    /* JADX INFO: renamed from: com.xiaomi.hm.health.bt.proto.Nfc$1, reason: invalid class name */
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

    public static final class NfcMessage extends GeneratedMessageLite<NfcMessage, Builder> implements NfcMessageOrBuilder {
        private static final NfcMessage DEFAULT_INSTANCE;
        public static final int NFCINRFFILEDNUM_FIELD_NUMBER = 2;
        public static final int NFCINRFFILEDTIME_FIELD_NUMBER = 3;
        public static final int NFCSTATE_FIELD_NUMBER = 1;
        private static volatile Parser<NfcMessage> PARSER;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private int nfcInRfFiledNum_;
        private int nfcInRfFiledTime_;
        private boolean nfcState_;

        public static final class Builder extends GeneratedMessageLite.Builder<NfcMessage, Builder> implements NfcMessageOrBuilder {
            public /* synthetic */ Builder(AnonymousClass1 anonymousClass1) {
                this();
            }

            public Builder clearNfcInRfFiledNum() {
                copyOnWrite();
                ((NfcMessage) this.instance).clearNfcInRfFiledNum();
                return this;
            }

            public Builder clearNfcInRfFiledTime() {
                copyOnWrite();
                ((NfcMessage) this.instance).clearNfcInRfFiledTime();
                return this;
            }

            public Builder clearNfcState() {
                copyOnWrite();
                ((NfcMessage) this.instance).clearNfcState();
                return this;
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nfc.NfcMessageOrBuilder
            public int getNfcInRfFiledNum() {
                return ((NfcMessage) this.instance).getNfcInRfFiledNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nfc.NfcMessageOrBuilder
            public int getNfcInRfFiledTime() {
                return ((NfcMessage) this.instance).getNfcInRfFiledTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nfc.NfcMessageOrBuilder
            public boolean getNfcState() {
                return ((NfcMessage) this.instance).getNfcState();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nfc.NfcMessageOrBuilder
            public boolean hasNfcInRfFiledNum() {
                return ((NfcMessage) this.instance).hasNfcInRfFiledNum();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nfc.NfcMessageOrBuilder
            public boolean hasNfcInRfFiledTime() {
                return ((NfcMessage) this.instance).hasNfcInRfFiledTime();
            }

            @Override // com.xiaomi.hm.health.bt.proto.Nfc.NfcMessageOrBuilder
            public boolean hasNfcState() {
                return ((NfcMessage) this.instance).hasNfcState();
            }

            public Builder setNfcInRfFiledNum(int value) {
                copyOnWrite();
                ((NfcMessage) this.instance).setNfcInRfFiledNum(value);
                return this;
            }

            public Builder setNfcInRfFiledTime(int value) {
                copyOnWrite();
                ((NfcMessage) this.instance).setNfcInRfFiledTime(value);
                return this;
            }

            public Builder setNfcState(boolean value) {
                copyOnWrite();
                ((NfcMessage) this.instance).setNfcState(value);
                return this;
            }

            private Builder() {
                super(NfcMessage.DEFAULT_INSTANCE);
            }
        }

        static {
            NfcMessage nfcMessage = new NfcMessage();
            DEFAULT_INSTANCE = nfcMessage;
            GeneratedMessageLite.registerDefaultInstance(NfcMessage.class, nfcMessage);
        }

        private NfcMessage() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNfcInRfFiledNum() {
            this.bitField0_ &= -3;
            this.nfcInRfFiledNum_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNfcInRfFiledTime() {
            this.bitField0_ &= -5;
            this.nfcInRfFiledTime_ = 0;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearNfcState() {
            this.bitField0_ &= -2;
            this.nfcState_ = false;
        }

        public static NfcMessage getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static NfcMessage parseDelimitedFrom(InputStream input) throws IOException {
            return (NfcMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input);
        }

        public static NfcMessage parseFrom(ByteBuffer data) throws InvalidProtocolBufferException {
            return (NfcMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static Parser<NfcMessage> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNfcInRfFiledNum(int value) {
            this.bitField0_ |= 2;
            this.nfcInRfFiledNum_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNfcInRfFiledTime(int value) {
            this.bitField0_ |= 4;
            this.nfcInRfFiledTime_ = value;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setNfcState(boolean value) {
            this.bitField0_ |= 1;
            this.nfcState_ = value;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke method, Object arg0, Object arg1) {
            AnonymousClass1 anonymousClass1 = null;
            switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[method.ordinal()]) {
                case 1:
                    return new NfcMessage();
                case 2:
                    return new Builder(anonymousClass1);
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔇ\u0000\u0002ᔋ\u0001\u0003ᔋ\u0002", new Object[]{"bitField0_", "nfcState_", "nfcInRfFiledNum_", "nfcInRfFiledTime_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<NfcMessage> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (NfcMessage.class) {
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

        @Override // com.xiaomi.hm.health.bt.proto.Nfc.NfcMessageOrBuilder
        public int getNfcInRfFiledNum() {
            return this.nfcInRfFiledNum_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nfc.NfcMessageOrBuilder
        public int getNfcInRfFiledTime() {
            return this.nfcInRfFiledTime_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nfc.NfcMessageOrBuilder
        public boolean getNfcState() {
            return this.nfcState_;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nfc.NfcMessageOrBuilder
        public boolean hasNfcInRfFiledNum() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nfc.NfcMessageOrBuilder
        public boolean hasNfcInRfFiledTime() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.xiaomi.hm.health.bt.proto.Nfc.NfcMessageOrBuilder
        public boolean hasNfcState() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(NfcMessage prototype) {
            return DEFAULT_INSTANCE.createBuilder(prototype);
        }

        public static NfcMessage parseDelimitedFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NfcMessage) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static NfcMessage parseFrom(ByteBuffer data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NfcMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NfcMessage parseFrom(ByteString data) throws InvalidProtocolBufferException {
            return (NfcMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static NfcMessage parseFrom(ByteString data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NfcMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NfcMessage parseFrom(byte[] data) throws InvalidProtocolBufferException {
            return (NfcMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data);
        }

        public static NfcMessage parseFrom(byte[] data, ExtensionRegistryLite extensionRegistry) throws InvalidProtocolBufferException {
            return (NfcMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, data, extensionRegistry);
        }

        public static NfcMessage parseFrom(InputStream input) throws IOException {
            return (NfcMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static NfcMessage parseFrom(InputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NfcMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }

        public static NfcMessage parseFrom(CodedInputStream input) throws IOException {
            return (NfcMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input);
        }

        public static NfcMessage parseFrom(CodedInputStream input, ExtensionRegistryLite extensionRegistry) throws IOException {
            return (NfcMessage) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, input, extensionRegistry);
        }
    }

    public interface NfcMessageOrBuilder extends MessageLiteOrBuilder {
        int getNfcInRfFiledNum();

        int getNfcInRfFiledTime();

        boolean getNfcState();

        boolean hasNfcInRfFiledNum();

        boolean hasNfcInRfFiledTime();

        boolean hasNfcState();
    }

    private Nfc() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite registry) {
    }
}
