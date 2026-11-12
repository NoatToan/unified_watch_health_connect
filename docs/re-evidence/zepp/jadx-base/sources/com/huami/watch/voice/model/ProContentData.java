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
public final class ProContentData {

    public static final class ContentData extends GeneratedMessageLite<ContentData, Builder> implements ContentDataOrBuilder {
        public static final int CONTENT_FIELD_NUMBER = 3;
        private static final ContentData DEFAULT_INSTANCE;
        private static volatile Parser<ContentData> PARSER = null;
        public static final int PARSER_FIELD_NUMBER = 2;
        public static final int VERSION_FIELD_NUMBER = 1;
        private int bitField0_;
        private int version_;
        private byte memoizedIsInitialized = 2;
        private String parser_ = "";
        private ByteString content_ = ByteString.EMPTY;

        public static final class Builder extends GeneratedMessageLite.Builder<ContentData, Builder> implements ContentDataOrBuilder {
            private Builder() {
                super(ContentData.DEFAULT_INSTANCE);
            }

            public Builder clearContent() {
                copyOnWrite();
                ((ContentData) this.instance).clearContent();
                return this;
            }

            public Builder clearParser() {
                copyOnWrite();
                ((ContentData) this.instance).clearParser();
                return this;
            }

            public Builder clearVersion() {
                copyOnWrite();
                ((ContentData) this.instance).clearVersion();
                return this;
            }

            @Override // com.huami.watch.voice.model.ProContentData.ContentDataOrBuilder
            public ByteString getContent() {
                return ((ContentData) this.instance).getContent();
            }

            @Override // com.huami.watch.voice.model.ProContentData.ContentDataOrBuilder
            public String getParser() {
                return ((ContentData) this.instance).getParser();
            }

            @Override // com.huami.watch.voice.model.ProContentData.ContentDataOrBuilder
            public ByteString getParserBytes() {
                return ((ContentData) this.instance).getParserBytes();
            }

            @Override // com.huami.watch.voice.model.ProContentData.ContentDataOrBuilder
            public int getVersion() {
                return ((ContentData) this.instance).getVersion();
            }

            @Override // com.huami.watch.voice.model.ProContentData.ContentDataOrBuilder
            public boolean hasContent() {
                return ((ContentData) this.instance).hasContent();
            }

            @Override // com.huami.watch.voice.model.ProContentData.ContentDataOrBuilder
            public boolean hasParser() {
                return ((ContentData) this.instance).hasParser();
            }

            @Override // com.huami.watch.voice.model.ProContentData.ContentDataOrBuilder
            public boolean hasVersion() {
                return ((ContentData) this.instance).hasVersion();
            }

            public Builder setContent(ByteString byteString) {
                copyOnWrite();
                ((ContentData) this.instance).setContent(byteString);
                return this;
            }

            public Builder setParser(String str) {
                copyOnWrite();
                ((ContentData) this.instance).setParser(str);
                return this;
            }

            public Builder setParserBytes(ByteString byteString) {
                copyOnWrite();
                ((ContentData) this.instance).setParserBytes(byteString);
                return this;
            }

            public Builder setVersion(int i) {
                copyOnWrite();
                ((ContentData) this.instance).setVersion(i);
                return this;
            }
        }

        static {
            ContentData contentData = new ContentData();
            DEFAULT_INSTANCE = contentData;
            GeneratedMessageLite.registerDefaultInstance(ContentData.class, contentData);
        }

        private ContentData() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearContent() {
            this.bitField0_ &= -5;
            this.content_ = getDefaultInstance().getContent();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearParser() {
            this.bitField0_ &= -3;
            this.parser_ = getDefaultInstance().getParser();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clearVersion() {
            this.bitField0_ &= -2;
            this.version_ = 0;
        }

        public static ContentData getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static ContentData parseDelimitedFrom(InputStream inputStream) throws IOException {
            return (ContentData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContentData parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
            return (ContentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static Parser<ContentData> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setContent(ByteString byteString) {
            Objects.requireNonNull(byteString);
            this.bitField0_ |= 4;
            this.content_ = byteString;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParser(String str) {
            Objects.requireNonNull(str);
            this.bitField0_ |= 2;
            this.parser_ = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setParserBytes(ByteString byteString) {
            Objects.requireNonNull(byteString);
            this.bitField0_ |= 2;
            this.parser_ = byteString.toStringUtf8();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setVersion(int i) {
            this.bitField0_ |= 1;
            this.version_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            switch (a.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new ContentData();
                case 2:
                    return new Builder();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001Ԅ\u0000\u0002Ԉ\u0001\u0003Ԋ\u0002", new Object[]{"bitField0_", "version_", "parser_", "content_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<ContentData> defaultInstanceBasedParser = PARSER;
                    if (defaultInstanceBasedParser == null) {
                        synchronized (ContentData.class) {
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

        @Override // com.huami.watch.voice.model.ProContentData.ContentDataOrBuilder
        public ByteString getContent() {
            return this.content_;
        }

        @Override // com.huami.watch.voice.model.ProContentData.ContentDataOrBuilder
        public String getParser() {
            return this.parser_;
        }

        @Override // com.huami.watch.voice.model.ProContentData.ContentDataOrBuilder
        public ByteString getParserBytes() {
            return ByteString.copyFromUtf8(this.parser_);
        }

        @Override // com.huami.watch.voice.model.ProContentData.ContentDataOrBuilder
        public int getVersion() {
            return this.version_;
        }

        @Override // com.huami.watch.voice.model.ProContentData.ContentDataOrBuilder
        public boolean hasContent() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.huami.watch.voice.model.ProContentData.ContentDataOrBuilder
        public boolean hasParser() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.huami.watch.voice.model.ProContentData.ContentDataOrBuilder
        public boolean hasVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        public static Builder newBuilder(ContentData contentData) {
            return DEFAULT_INSTANCE.createBuilder(contentData);
        }

        public static ContentData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContentData) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ContentData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static ContentData parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
            return (ContentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static ContentData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static ContentData parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
            return (ContentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static ContentData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
            return (ContentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }

        public static ContentData parseFrom(InputStream inputStream) throws IOException {
            return (ContentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static ContentData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static ContentData parseFrom(CodedInputStream codedInputStream) throws IOException {
            return (ContentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static ContentData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws IOException {
            return (ContentData) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }
    }

    public interface ContentDataOrBuilder extends MessageLiteOrBuilder {
        ByteString getContent();

        String getParser();

        ByteString getParserBytes();

        int getVersion();

        boolean hasContent();

        boolean hasParser();

        boolean hasVersion();
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

    private ProContentData() {
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
