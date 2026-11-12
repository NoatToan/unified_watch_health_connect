package com.huami.watch.voice.model;

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
import java.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public final class ProVoiceData {

    public static final class VoiceData extends GeneratedMessageLite<VoiceData, Builder> implements VoiceDataOrBuilder {
        public static final int CONTENTID_FIELD_NUMBER = 1;
        private static final VoiceData DEFAULT_INSTANCE;
        private static volatile Parser<VoiceData> PARSER = null;
        public static final int VOICEDATA_FIELD_NUMBER = 2;
        private int bitField0_;
        private byte memoizedIsInitialized = 2;
        private String contentId_ = "";
        private ByteString voiceData_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.Builder<VoiceData, Builder> implements VoiceDataOrBuilder {
            private Builder() {
                super(VoiceData.DEFAULT_INSTANCE);
            }

            public Builder clearContentId() {
                copyOnWrite();
                ((VoiceData) this.instance).clearContentId();
                return this;
            }

            public Builder clearVoiceData() {
                copyOnWrite();
                ((VoiceData) this.instance).clearVoiceData();
                return this;
            }

            @Override // com.huami.watch.voice.model.ProVoiceData.VoiceDataOrBuilder
            public String getContentId() {
                return ((VoiceData) this.instance).getContentId();
            }

            @Override // com.huami.watch.voice.model.ProVoiceData.VoiceDataOrBuilder
            public ByteString getContentIdBytes() {
                return ((VoiceData) this.instance).getContentIdBytes();
            }

            @Override // com.huami.watch.voice.model.ProVoiceData.VoiceDataOrBuilder
            public ByteString getVoiceData() {
                return ((VoiceData) this.instance).getVoiceData();
            }

            @Override // com.huami.watch.voice.model.ProVoiceData.VoiceDataOrBuilder
            public boolean hasContentId() {
                return ((VoiceData) this.instance).hasContentId();
            }

            @Override // com.huami.watch.voice.model.ProVoiceData.VoiceDataOrBuilder
            public boolean hasVoiceData() {
                return ((VoiceData) this.instance).hasVoiceData();
            }

            public Builder setContentId(String str) {
                copyOnWrite();
                ((VoiceData) this.instance).setContentId(str);
                return this;
            }

            public Builder setContentIdBytes(ByteString byteString) {
                copyOnWrite();
                ((VoiceData) this.instance).setContentIdBytes(byteString);
                return this;
            }

            public Builder setVoiceData(ByteString byteString) {
                copyOnWrite();
                ((VoiceData) this.instance).setVoiceData(byteString);
                return this;
            }
        }

        static {
            VoiceData voiceData = new VoiceData();
            DEFAULT_INSTANCE = voiceData;
            GeneratedMessageLite.registerDefaultInstance(VoiceData.class, voiceData);
        }

        private VoiceData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContentId() {
            this.bitField0_ &= -2;
            this.contentId_ = getDefaultInstance().getContentId();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVoiceData() {
            this.bitField0_ &= -3;
            this.voiceData_ = getDefaultInstance().getVoiceData();
        }

        public static VoiceData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static VoiceData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (VoiceData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (VoiceData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<VoiceData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContentId(String str) {
            Objects.requireNonNull(str);
            this.bitField0_ |= 1;
            this.contentId_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContentIdBytes(ByteString byteString) {
            Objects.requireNonNull(byteString);
            this.bitField0_ |= 1;
            this.contentId_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVoiceData(ByteString byteString) {
            Objects.requireNonNull(byteString);
            this.bitField0_ |= 2;
            this.voiceData_ = byteString;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new VoiceData();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001Ԉ\u0000\u0002Ԋ\u0001", new Object[]{"bitField0_", "contentId_", "voiceData_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<VoiceData> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (VoiceData.class) {
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
                    this.memoizedIsInitialized = (byte) (obj == null ? 0 : 1);
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        @Override // com.huami.watch.voice.model.ProVoiceData.VoiceDataOrBuilder
        public String getContentId() {
            return this.contentId_;
        }

        @Override // com.huami.watch.voice.model.ProVoiceData.VoiceDataOrBuilder
        public ByteString getContentIdBytes() {
            return ByteString.copyFromUtf8(this.contentId_);
        }

        @Override // com.huami.watch.voice.model.ProVoiceData.VoiceDataOrBuilder
        public ByteString getVoiceData() {
            return this.voiceData_;
        }

        @Override // com.huami.watch.voice.model.ProVoiceData.VoiceDataOrBuilder
        public boolean hasContentId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.huami.watch.voice.model.ProVoiceData.VoiceDataOrBuilder
        public boolean hasVoiceData() {
            return (this.bitField0_ & 2) != 0;
        }

        public static Builder newBuilder(VoiceData voiceData) {
            return DEFAULT_INSTANCE.createBuilder(voiceData);
        }

        public static VoiceData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VoiceData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VoiceData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VoiceData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static VoiceData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (VoiceData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static VoiceData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VoiceData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static VoiceData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (VoiceData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static VoiceData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (VoiceData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static VoiceData parseFrom(InputStream inputStream) throws IOException {
            return (VoiceData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static VoiceData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VoiceData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static VoiceData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (VoiceData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static VoiceData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (VoiceData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface VoiceDataOrBuilder extends MessageLiteOrBuilder {
        String getContentId();

        ByteString getContentIdBytes();

        ByteString getVoiceData();

        boolean hasContentId();

        boolean hasVoiceData();
    }

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            a = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    private ProVoiceData() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
