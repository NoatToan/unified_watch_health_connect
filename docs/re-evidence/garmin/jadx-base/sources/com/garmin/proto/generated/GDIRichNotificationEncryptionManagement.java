package com.garmin.proto.generated;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import vb.h;

/* JADX INFO: loaded from: classes6.dex */
public final class GDIRichNotificationEncryptionManagement {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n-GDIRichNotificationEncryptionManagement.proto\u0012.GDI.Proto.RichNotificationEncryptionManagement\"Ç\u0003\n\u0007Service\u0012d\n\u0016encryption_key_request\u0018\u0001 \u0001(\u000b2D.GDI.Proto.RichNotificationEncryptionManagement.EncryptionKeyRequest\u0012f\n\u0017encryption_key_response\u0018\u0002 \u0001(\u000b2E.GDI.Proto.RichNotificationEncryptionManagement.EncryptionKeyResponse\u0012u\n\u001fencryption_key_exchange_request\u0018\u0003 \u0001(\u000b2L.GDI.Proto.RichNotificationEncryptionManagement.EncryptionKeyExchangeRequest\u0012w\n encryption_key_exchange_response\u0018\u0004 \u0001(\u000b2M.GDI.Proto.RichNotificationEncryptionManagement.EncryptionKeyExchangeResponse\"\u0016\n\u0014EncryptionKeyRequest\"¾\u0003\n\u0015EncryptionKeyResponse\u0012f\n\u000bciphersuite\u0018\u0001 \u0001(\u000e2Q.GDI.Proto.RichNotificationEncryptionManagement.EncryptionKeyResponse.Ciphersuite\u0012\u0012\n\npublic_key\u0018\u0002 \u0001(\f\u0012\\\n\u0006status\u0018\u0003 \u0001(\u000e2L.GDI.Proto.RichNotificationEncryptionManagement.EncryptionKeyResponse.Status\"\u0087\u0001\n\u000bCiphersuite\u0012\u0017\n\u0013CIPHERSUITE_UNKNOWN\u0010\u0000\u0012'\n#CIPHERSUITE_P256_SHA256_AES_GCM_256\u0010\u0001\u00126\n2CIPHERSUITE_XWINGMLKEM768X25519_SHA256_AES_GCM_256\u0010\u0002\"A\n\u0006Status\u0012\u0012\n\u000eSTATUS_UNKNOWN\u0010\u0000\u0012\u0012\n\u000eSTATUS_SUCCESS\u0010\u0001\u0012\u000f\n\u000bSTATUS_FAIL\u0010\u0002\"V\n\u001cEncryptionKeyExchangeRequest\u0012\u001c\n\u0014receiver_context_str\u0018\u0001 \u0001(\t\u0012\u0018\n\u0010encapsulated_key\u0018\u0002 \u0001(\f\"È\u0001\n\u001dEncryptionKeyExchangeResponse\u0012d\n\u0006status\u0018\u0001 \u0001(\u000e2T.GDI.Proto.RichNotificationEncryptionManagement.EncryptionKeyExchangeResponse.Status\"A\n\u0006Status\u0012\u0012\n\u000eSTATUS_UNKNOWN\u0010\u0000\u0012\u0012\n\u000eSTATUS_SUCCESS\u0010\u0001\u0012\u000f\n\u000bSTATUS_FAIL\u0010\u0002BG\n\u001acom.garmin.proto.generatedB'GDIRichNotificationEncryptionManagementH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyExchangeRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyExchangeRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyExchangeResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyExchangeResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_RichNotificationEncryptionManagement_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_RichNotificationEncryptionManagement_Service_fieldAccessorTable;

    public interface EncryptionKeyExchangeRequestOrBuilder extends MessageOrBuilder {
        ByteString getEncapsulatedKey();

        String getReceiverContextStr();

        ByteString getReceiverContextStrBytes();

        boolean hasEncapsulatedKey();

        boolean hasReceiverContextStr();
    }

    public interface EncryptionKeyExchangeResponseOrBuilder extends MessageOrBuilder {
        EncryptionKeyExchangeResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface EncryptionKeyRequestOrBuilder extends MessageOrBuilder {
    }

    public interface EncryptionKeyResponseOrBuilder extends MessageOrBuilder {
        EncryptionKeyResponse.Ciphersuite getCiphersuite();

        ByteString getPublicKey();

        EncryptionKeyResponse.Status getStatus();

        boolean hasCiphersuite();

        boolean hasPublicKey();

        boolean hasStatus();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        EncryptionKeyExchangeRequest getEncryptionKeyExchangeRequest();

        EncryptionKeyExchangeRequestOrBuilder getEncryptionKeyExchangeRequestOrBuilder();

        EncryptionKeyExchangeResponse getEncryptionKeyExchangeResponse();

        EncryptionKeyExchangeResponseOrBuilder getEncryptionKeyExchangeResponseOrBuilder();

        EncryptionKeyRequest getEncryptionKeyRequest();

        EncryptionKeyRequestOrBuilder getEncryptionKeyRequestOrBuilder();

        EncryptionKeyResponse getEncryptionKeyResponse();

        EncryptionKeyResponseOrBuilder getEncryptionKeyResponseOrBuilder();

        boolean hasEncryptionKeyExchangeRequest();

        boolean hasEncryptionKeyExchangeResponse();

        boolean hasEncryptionKeyRequest();

        boolean hasEncryptionKeyResponse();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_RichNotificationEncryptionManagement_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_RichNotificationEncryptionManagement_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"EncryptionKeyRequest", "EncryptionKeyResponse", "EncryptionKeyExchangeRequest", "EncryptionKeyExchangeResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[0]);
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Ciphersuite", "PublicKey", "Status"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyExchangeRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyExchangeRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"ReceiverContextStr", "EncapsulatedKey"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyExchangeResponse_descriptor = descriptor6;
        internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyExchangeResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Status"});
    }

    private GDIRichNotificationEncryptionManagement() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class EncryptionKeyRequest extends GeneratedMessageV3 implements EncryptionKeyRequestOrBuilder {
        private static final EncryptionKeyRequest DEFAULT_INSTANCE = new EncryptionKeyRequest();

        @Deprecated
        public static final Parser<EncryptionKeyRequest> PARSER = new AbstractParser<EncryptionKeyRequest>() { // from class: com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyRequest.1
            @Override // com.google.protobuf.Parser
            public EncryptionKeyRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EncryptionKeyRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;

        private EncryptionKeyRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EncryptionKeyRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRichNotificationEncryptionManagement.internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyRequest_descriptor;
        }

        public static Builder newBuilder(EncryptionKeyRequest encryptionKeyRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(encryptionKeyRequest);
        }

        public static EncryptionKeyRequest parseDelimitedFrom(InputStream inputStream) {
            return (EncryptionKeyRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EncryptionKeyRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EncryptionKeyRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof EncryptionKeyRequest) {
                return getUnknownFields().equals(((EncryptionKeyRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EncryptionKeyRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getUnknownFields().hashCode() + ((getDescriptor().hashCode() + 779) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRichNotificationEncryptionManagement.internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(EncryptionKeyRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new EncryptionKeyRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EncryptionKeyRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRichNotificationEncryptionManagement.internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EncryptionKeyRequest build() {
                EncryptionKeyRequest encryptionKeyRequestBuildPartial = buildPartial();
                if (encryptionKeyRequestBuildPartial.isInitialized()) {
                    return encryptionKeyRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) encryptionKeyRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EncryptionKeyRequest buildPartial() {
                EncryptionKeyRequest encryptionKeyRequest = new EncryptionKeyRequest(this);
                onBuilt();
                return encryptionKeyRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIRichNotificationEncryptionManagement.internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRichNotificationEncryptionManagement.internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(EncryptionKeyRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag == 0 || !super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                z14 = true;
                            }
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EncryptionKeyRequest getDefaultInstanceForType() {
                return EncryptionKeyRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EncryptionKeyRequest) {
                    return mergeFrom((EncryptionKeyRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EncryptionKeyRequest encryptionKeyRequest) {
                if (encryptionKeyRequest == EncryptionKeyRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(encryptionKeyRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EncryptionKeyRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ EncryptionKeyRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private EncryptionKeyRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EncryptionKeyRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EncryptionKeyRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EncryptionKeyRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EncryptionKeyRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EncryptionKeyRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EncryptionKeyRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EncryptionKeyRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EncryptionKeyRequest parseFrom(InputStream inputStream) {
            return (EncryptionKeyRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static EncryptionKeyRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EncryptionKeyRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EncryptionKeyRequest parseFrom(CodedInputStream codedInputStream) {
            return (EncryptionKeyRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EncryptionKeyRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EncryptionKeyRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class EncryptionKeyExchangeRequest extends GeneratedMessageV3 implements EncryptionKeyExchangeRequestOrBuilder {
        public static final int ENCAPSULATED_KEY_FIELD_NUMBER = 2;
        public static final int RECEIVER_CONTEXT_STR_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString encapsulatedKey_;
        private byte memoizedIsInitialized;
        private volatile Object receiverContextStr_;
        private static final EncryptionKeyExchangeRequest DEFAULT_INSTANCE = new EncryptionKeyExchangeRequest();

        @Deprecated
        public static final Parser<EncryptionKeyExchangeRequest> PARSER = new AbstractParser<EncryptionKeyExchangeRequest>() { // from class: com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyExchangeRequest.1
            @Override // com.google.protobuf.Parser
            public EncryptionKeyExchangeRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EncryptionKeyExchangeRequest.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        private EncryptionKeyExchangeRequest() {
            this.receiverContextStr_ = "";
            ByteString byteString = ByteString.EMPTY;
            this.encapsulatedKey_ = byteString;
            this.memoizedIsInitialized = (byte) -1;
            this.receiverContextStr_ = "";
            this.encapsulatedKey_ = byteString;
        }

        public static EncryptionKeyExchangeRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRichNotificationEncryptionManagement.internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyExchangeRequest_descriptor;
        }

        public static Builder newBuilder(EncryptionKeyExchangeRequest encryptionKeyExchangeRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(encryptionKeyExchangeRequest);
        }

        public static EncryptionKeyExchangeRequest parseDelimitedFrom(InputStream inputStream) {
            return (EncryptionKeyExchangeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EncryptionKeyExchangeRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EncryptionKeyExchangeRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EncryptionKeyExchangeRequest)) {
                return super.equals(obj);
            }
            EncryptionKeyExchangeRequest encryptionKeyExchangeRequest = (EncryptionKeyExchangeRequest) obj;
            if (hasReceiverContextStr() != encryptionKeyExchangeRequest.hasReceiverContextStr()) {
                return false;
            }
            if ((!hasReceiverContextStr() || getReceiverContextStr().equals(encryptionKeyExchangeRequest.getReceiverContextStr())) && hasEncapsulatedKey() == encryptionKeyExchangeRequest.hasEncapsulatedKey()) {
                return (!hasEncapsulatedKey() || getEncapsulatedKey().equals(encryptionKeyExchangeRequest.getEncapsulatedKey())) && getUnknownFields().equals(encryptionKeyExchangeRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyExchangeRequestOrBuilder
        public ByteString getEncapsulatedKey() {
            return this.encapsulatedKey_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EncryptionKeyExchangeRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyExchangeRequestOrBuilder
        public String getReceiverContextStr() {
            Object obj = this.receiverContextStr_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.receiverContextStr_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyExchangeRequestOrBuilder
        public ByteString getReceiverContextStrBytes() {
            Object obj = this.receiverContextStr_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.receiverContextStr_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.receiverContextStr_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeBytesSize(2, this.encapsulatedKey_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyExchangeRequestOrBuilder
        public boolean hasEncapsulatedKey() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyExchangeRequestOrBuilder
        public boolean hasReceiverContextStr() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasReceiverContextStr()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getReceiverContextStr().hashCode();
            }
            if (hasEncapsulatedKey()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getEncapsulatedKey().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRichNotificationEncryptionManagement.internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyExchangeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(EncryptionKeyExchangeRequest.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new EncryptionKeyExchangeRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.receiverContextStr_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBytes(2, this.encapsulatedKey_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EncryptionKeyExchangeRequestOrBuilder {
            private int bitField0_;
            private ByteString encapsulatedKey_;
            private Object receiverContextStr_;

            private Builder() {
                this.receiverContextStr_ = "";
                this.encapsulatedKey_ = ByteString.EMPTY;
            }

            private void buildPartial0(EncryptionKeyExchangeRequest encryptionKeyExchangeRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    encryptionKeyExchangeRequest.receiverContextStr_ = this.receiverContextStr_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    encryptionKeyExchangeRequest.encapsulatedKey_ = this.encapsulatedKey_;
                    i14 |= 2;
                }
                encryptionKeyExchangeRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRichNotificationEncryptionManagement.internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyExchangeRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EncryptionKeyExchangeRequest build() {
                EncryptionKeyExchangeRequest encryptionKeyExchangeRequestBuildPartial = buildPartial();
                if (encryptionKeyExchangeRequestBuildPartial.isInitialized()) {
                    return encryptionKeyExchangeRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) encryptionKeyExchangeRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EncryptionKeyExchangeRequest buildPartial() {
                EncryptionKeyExchangeRequest encryptionKeyExchangeRequest = new EncryptionKeyExchangeRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(encryptionKeyExchangeRequest);
                }
                onBuilt();
                return encryptionKeyExchangeRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.receiverContextStr_ = "";
                this.encapsulatedKey_ = ByteString.EMPTY;
                return this;
            }

            public Builder clearEncapsulatedKey() {
                this.bitField0_ &= -3;
                this.encapsulatedKey_ = EncryptionKeyExchangeRequest.getDefaultInstance().getEncapsulatedKey();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearReceiverContextStr() {
                this.receiverContextStr_ = EncryptionKeyExchangeRequest.getDefaultInstance().getReceiverContextStr();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIRichNotificationEncryptionManagement.internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyExchangeRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyExchangeRequestOrBuilder
            public ByteString getEncapsulatedKey() {
                return this.encapsulatedKey_;
            }

            @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyExchangeRequestOrBuilder
            public String getReceiverContextStr() {
                Object obj = this.receiverContextStr_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.receiverContextStr_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyExchangeRequestOrBuilder
            public ByteString getReceiverContextStrBytes() {
                Object obj = this.receiverContextStr_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.receiverContextStr_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyExchangeRequestOrBuilder
            public boolean hasEncapsulatedKey() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyExchangeRequestOrBuilder
            public boolean hasReceiverContextStr() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRichNotificationEncryptionManagement.internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyExchangeRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(EncryptionKeyExchangeRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    this.receiverContextStr_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.encapsulatedKey_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setEncapsulatedKey(ByteString byteString) {
                byteString.getClass();
                this.encapsulatedKey_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setReceiverContextStr(String str) {
                str.getClass();
                this.receiverContextStr_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setReceiverContextStrBytes(ByteString byteString) {
                byteString.getClass();
                this.receiverContextStr_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EncryptionKeyExchangeRequest getDefaultInstanceForType() {
                return EncryptionKeyExchangeRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.receiverContextStr_ = "";
                this.encapsulatedKey_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EncryptionKeyExchangeRequest) {
                    return mergeFrom((EncryptionKeyExchangeRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EncryptionKeyExchangeRequest encryptionKeyExchangeRequest) {
                if (encryptionKeyExchangeRequest == EncryptionKeyExchangeRequest.getDefaultInstance()) {
                    return this;
                }
                if (encryptionKeyExchangeRequest.hasReceiverContextStr()) {
                    this.receiverContextStr_ = encryptionKeyExchangeRequest.receiverContextStr_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (encryptionKeyExchangeRequest.hasEncapsulatedKey()) {
                    setEncapsulatedKey(encryptionKeyExchangeRequest.getEncapsulatedKey());
                }
                mergeUnknownFields(encryptionKeyExchangeRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EncryptionKeyExchangeRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static EncryptionKeyExchangeRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EncryptionKeyExchangeRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EncryptionKeyExchangeRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EncryptionKeyExchangeRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EncryptionKeyExchangeRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EncryptionKeyExchangeRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EncryptionKeyExchangeRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EncryptionKeyExchangeRequest parseFrom(InputStream inputStream) {
            return (EncryptionKeyExchangeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static EncryptionKeyExchangeRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EncryptionKeyExchangeRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EncryptionKeyExchangeRequest parseFrom(CodedInputStream codedInputStream) {
            return (EncryptionKeyExchangeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private EncryptionKeyExchangeRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.receiverContextStr_ = "";
            this.encapsulatedKey_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EncryptionKeyExchangeRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EncryptionKeyExchangeRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ EncryptionKeyExchangeRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class EncryptionKeyExchangeResponse extends GeneratedMessageV3 implements EncryptionKeyExchangeResponseOrBuilder {
        private static final EncryptionKeyExchangeResponse DEFAULT_INSTANCE = new EncryptionKeyExchangeResponse();

        @Deprecated
        public static final Parser<EncryptionKeyExchangeResponse> PARSER = new AbstractParser<EncryptionKeyExchangeResponse>() { // from class: com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyExchangeResponse.1
            @Override // com.google.protobuf.Parser
            public EncryptionKeyExchangeResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EncryptionKeyExchangeResponse.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int status_;

        private EncryptionKeyExchangeResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EncryptionKeyExchangeResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRichNotificationEncryptionManagement.internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyExchangeResponse_descriptor;
        }

        public static Builder newBuilder(EncryptionKeyExchangeResponse encryptionKeyExchangeResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(encryptionKeyExchangeResponse);
        }

        public static EncryptionKeyExchangeResponse parseDelimitedFrom(InputStream inputStream) {
            return (EncryptionKeyExchangeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EncryptionKeyExchangeResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EncryptionKeyExchangeResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EncryptionKeyExchangeResponse)) {
                return super.equals(obj);
            }
            EncryptionKeyExchangeResponse encryptionKeyExchangeResponse = (EncryptionKeyExchangeResponse) obj;
            if (hasStatus() != encryptionKeyExchangeResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == encryptionKeyExchangeResponse.status_) && getUnknownFields().equals(encryptionKeyExchangeResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EncryptionKeyExchangeResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyExchangeResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyExchangeResponseOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasStatus()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.status_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRichNotificationEncryptionManagement.internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyExchangeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(EncryptionKeyExchangeResponse.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new EncryptionKeyExchangeResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.status_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EncryptionKeyExchangeResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(EncryptionKeyExchangeResponse encryptionKeyExchangeResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    encryptionKeyExchangeResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                encryptionKeyExchangeResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRichNotificationEncryptionManagement.internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyExchangeResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EncryptionKeyExchangeResponse build() {
                EncryptionKeyExchangeResponse encryptionKeyExchangeResponseBuildPartial = buildPartial();
                if (encryptionKeyExchangeResponseBuildPartial.isInitialized()) {
                    return encryptionKeyExchangeResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) encryptionKeyExchangeResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EncryptionKeyExchangeResponse buildPartial() {
                EncryptionKeyExchangeResponse encryptionKeyExchangeResponse = new EncryptionKeyExchangeResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(encryptionKeyExchangeResponse);
                }
                onBuilt();
                return encryptionKeyExchangeResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearStatus() {
                this.bitField0_ &= -2;
                this.status_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIRichNotificationEncryptionManagement.internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyExchangeResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyExchangeResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyExchangeResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRichNotificationEncryptionManagement.internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyExchangeResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(EncryptionKeyExchangeResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    int i14 = codedInputStream.readEnum();
                                    if (Status.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStatus(Status status) {
                status.getClass();
                this.bitField0_ |= 1;
                this.status_ = status.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EncryptionKeyExchangeResponse getDefaultInstanceForType() {
                return EncryptionKeyExchangeResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.status_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EncryptionKeyExchangeResponse) {
                    return mergeFrom((EncryptionKeyExchangeResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EncryptionKeyExchangeResponse encryptionKeyExchangeResponse) {
                if (encryptionKeyExchangeResponse == EncryptionKeyExchangeResponse.getDefaultInstance()) {
                    return this;
                }
                if (encryptionKeyExchangeResponse.hasStatus()) {
                    setStatus(encryptionKeyExchangeResponse.getStatus());
                }
                mergeUnknownFields(encryptionKeyExchangeResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EncryptionKeyExchangeResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static EncryptionKeyExchangeResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EncryptionKeyExchangeResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EncryptionKeyExchangeResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ EncryptionKeyExchangeResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static EncryptionKeyExchangeResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private EncryptionKeyExchangeResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EncryptionKeyExchangeResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EncryptionKeyExchangeResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EncryptionKeyExchangeResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EncryptionKeyExchangeResponse parseFrom(InputStream inputStream) {
            return (EncryptionKeyExchangeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static EncryptionKeyExchangeResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EncryptionKeyExchangeResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EncryptionKeyExchangeResponse parseFrom(CodedInputStream codedInputStream) {
            return (EncryptionKeyExchangeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EncryptionKeyExchangeResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EncryptionKeyExchangeResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            STATUS_UNKNOWN(0),
            STATUS_SUCCESS(1),
            STATUS_FAIL(2);

            public static final int STATUS_FAIL_VALUE = 2;
            public static final int STATUS_SUCCESS_VALUE = 1;
            public static final int STATUS_UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyExchangeResponse.Status.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Status findValueByNumber(int i14) {
                    return Status.forNumber(i14);
                }
            };
            private static final Status[] VALUES = values();

            Status(int i14) {
                this.value = i14;
            }

            public static Status forNumber(int i14) {
                if (i14 == 0) {
                    return STATUS_UNKNOWN;
                }
                if (i14 == 1) {
                    return STATUS_SUCCESS;
                }
                if (i14 != 2) {
                    return null;
                }
                return STATUS_FAIL;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return EncryptionKeyExchangeResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Status> internalGetValueMap() {
                return internalValueMap;
            }

            public static Status valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                h.s("EnumValueDescriptor is not for this type.");
                return null;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            @Deprecated
            public static Status valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class EncryptionKeyResponse extends GeneratedMessageV3 implements EncryptionKeyResponseOrBuilder {
        public static final int CIPHERSUITE_FIELD_NUMBER = 1;
        private static final EncryptionKeyResponse DEFAULT_INSTANCE = new EncryptionKeyResponse();

        @Deprecated
        public static final Parser<EncryptionKeyResponse> PARSER = new AbstractParser<EncryptionKeyResponse>() { // from class: com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyResponse.1
            @Override // com.google.protobuf.Parser
            public EncryptionKeyResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EncryptionKeyResponse.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };
        public static final int PUBLIC_KEY_FIELD_NUMBER = 2;
        public static final int STATUS_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int ciphersuite_;
        private byte memoizedIsInitialized;
        private ByteString publicKey_;
        private int status_;

        private EncryptionKeyResponse() {
            this.ciphersuite_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.ciphersuite_ = 0;
            this.publicKey_ = byteString;
            this.status_ = 0;
        }

        public static EncryptionKeyResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRichNotificationEncryptionManagement.internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyResponse_descriptor;
        }

        public static Builder newBuilder(EncryptionKeyResponse encryptionKeyResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(encryptionKeyResponse);
        }

        public static EncryptionKeyResponse parseDelimitedFrom(InputStream inputStream) {
            return (EncryptionKeyResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EncryptionKeyResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EncryptionKeyResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EncryptionKeyResponse)) {
                return super.equals(obj);
            }
            EncryptionKeyResponse encryptionKeyResponse = (EncryptionKeyResponse) obj;
            if (hasCiphersuite() != encryptionKeyResponse.hasCiphersuite()) {
                return false;
            }
            if ((hasCiphersuite() && this.ciphersuite_ != encryptionKeyResponse.ciphersuite_) || hasPublicKey() != encryptionKeyResponse.hasPublicKey()) {
                return false;
            }
            if ((!hasPublicKey() || getPublicKey().equals(encryptionKeyResponse.getPublicKey())) && hasStatus() == encryptionKeyResponse.hasStatus()) {
                return (!hasStatus() || this.status_ == encryptionKeyResponse.status_) && getUnknownFields().equals(encryptionKeyResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyResponseOrBuilder
        public Ciphersuite getCiphersuite() {
            Ciphersuite ciphersuiteForNumber = Ciphersuite.forNumber(this.ciphersuite_);
            return ciphersuiteForNumber == null ? Ciphersuite.CIPHERSUITE_UNKNOWN : ciphersuiteForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EncryptionKeyResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyResponseOrBuilder
        public ByteString getPublicKey() {
            return this.publicKey_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.ciphersuite_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBytesSize(2, this.publicKey_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeEnumSize(3, this.status_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyResponseOrBuilder
        public boolean hasCiphersuite() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyResponseOrBuilder
        public boolean hasPublicKey() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyResponseOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasCiphersuite()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.ciphersuite_;
            }
            if (hasPublicKey()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getPublicKey().hashCode();
            }
            if (hasStatus()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.status_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRichNotificationEncryptionManagement.internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(EncryptionKeyResponse.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new EncryptionKeyResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.ciphersuite_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBytes(2, this.publicKey_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.status_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EncryptionKeyResponseOrBuilder {
            private int bitField0_;
            private int ciphersuite_;
            private ByteString publicKey_;
            private int status_;

            private Builder() {
                this.ciphersuite_ = 0;
                this.publicKey_ = ByteString.EMPTY;
                this.status_ = 0;
            }

            private void buildPartial0(EncryptionKeyResponse encryptionKeyResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    encryptionKeyResponse.ciphersuite_ = this.ciphersuite_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    encryptionKeyResponse.publicKey_ = this.publicKey_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    encryptionKeyResponse.status_ = this.status_;
                    i14 |= 4;
                }
                encryptionKeyResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRichNotificationEncryptionManagement.internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EncryptionKeyResponse build() {
                EncryptionKeyResponse encryptionKeyResponseBuildPartial = buildPartial();
                if (encryptionKeyResponseBuildPartial.isInitialized()) {
                    return encryptionKeyResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) encryptionKeyResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EncryptionKeyResponse buildPartial() {
                EncryptionKeyResponse encryptionKeyResponse = new EncryptionKeyResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(encryptionKeyResponse);
                }
                onBuilt();
                return encryptionKeyResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.ciphersuite_ = 0;
                this.publicKey_ = ByteString.EMPTY;
                this.status_ = 0;
                return this;
            }

            public Builder clearCiphersuite() {
                this.bitField0_ &= -2;
                this.ciphersuite_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPublicKey() {
                this.bitField0_ &= -3;
                this.publicKey_ = EncryptionKeyResponse.getDefaultInstance().getPublicKey();
                onChanged();
                return this;
            }

            public Builder clearStatus() {
                this.bitField0_ &= -5;
                this.status_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyResponseOrBuilder
            public Ciphersuite getCiphersuite() {
                Ciphersuite ciphersuiteForNumber = Ciphersuite.forNumber(this.ciphersuite_);
                return ciphersuiteForNumber == null ? Ciphersuite.CIPHERSUITE_UNKNOWN : ciphersuiteForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIRichNotificationEncryptionManagement.internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyResponseOrBuilder
            public ByteString getPublicKey() {
                return this.publicKey_;
            }

            @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.STATUS_UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyResponseOrBuilder
            public boolean hasCiphersuite() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyResponseOrBuilder
            public boolean hasPublicKey() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRichNotificationEncryptionManagement.internal_static_GDI_Proto_RichNotificationEncryptionManagement_EncryptionKeyResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(EncryptionKeyResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 8) {
                                    int i14 = codedInputStream.readEnum();
                                    if (Ciphersuite.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.ciphersuite_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    this.publicKey_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    int i15 = codedInputStream.readEnum();
                                    if (Status.forNumber(i15) == null) {
                                        mergeUnknownVarintField(3, i15);
                                    } else {
                                        this.status_ = i15;
                                        this.bitField0_ |= 4;
                                    }
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setCiphersuite(Ciphersuite ciphersuite) {
                ciphersuite.getClass();
                this.bitField0_ |= 1;
                this.ciphersuite_ = ciphersuite.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setPublicKey(ByteString byteString) {
                byteString.getClass();
                this.publicKey_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStatus(Status status) {
                status.getClass();
                this.bitField0_ |= 4;
                this.status_ = status.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EncryptionKeyResponse getDefaultInstanceForType() {
                return EncryptionKeyResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.ciphersuite_ = 0;
                this.publicKey_ = ByteString.EMPTY;
                this.status_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EncryptionKeyResponse) {
                    return mergeFrom((EncryptionKeyResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EncryptionKeyResponse encryptionKeyResponse) {
                if (encryptionKeyResponse == EncryptionKeyResponse.getDefaultInstance()) {
                    return this;
                }
                if (encryptionKeyResponse.hasCiphersuite()) {
                    setCiphersuite(encryptionKeyResponse.getCiphersuite());
                }
                if (encryptionKeyResponse.hasPublicKey()) {
                    setPublicKey(encryptionKeyResponse.getPublicKey());
                }
                if (encryptionKeyResponse.hasStatus()) {
                    setStatus(encryptionKeyResponse.getStatus());
                }
                mergeUnknownFields(encryptionKeyResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EncryptionKeyResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static EncryptionKeyResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EncryptionKeyResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EncryptionKeyResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EncryptionKeyResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EncryptionKeyResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EncryptionKeyResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EncryptionKeyResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EncryptionKeyResponse parseFrom(InputStream inputStream) {
            return (EncryptionKeyResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static EncryptionKeyResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EncryptionKeyResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private EncryptionKeyResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.ciphersuite_ = 0;
            this.publicKey_ = ByteString.EMPTY;
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EncryptionKeyResponse parseFrom(CodedInputStream codedInputStream) {
            return (EncryptionKeyResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EncryptionKeyResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EncryptionKeyResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ EncryptionKeyResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public enum Ciphersuite implements ProtocolMessageEnum {
            CIPHERSUITE_UNKNOWN(0),
            CIPHERSUITE_P256_SHA256_AES_GCM_256(1),
            CIPHERSUITE_XWINGMLKEM768X25519_SHA256_AES_GCM_256(2);

            public static final int CIPHERSUITE_P256_SHA256_AES_GCM_256_VALUE = 1;
            public static final int CIPHERSUITE_UNKNOWN_VALUE = 0;
            public static final int CIPHERSUITE_XWINGMLKEM768X25519_SHA256_AES_GCM_256_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<Ciphersuite> internalValueMap = new Internal.EnumLiteMap<Ciphersuite>() { // from class: com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyResponse.Ciphersuite.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Ciphersuite findValueByNumber(int i14) {
                    return Ciphersuite.forNumber(i14);
                }
            };
            private static final Ciphersuite[] VALUES = values();

            Ciphersuite(int i14) {
                this.value = i14;
            }

            public static Ciphersuite forNumber(int i14) {
                if (i14 == 0) {
                    return CIPHERSUITE_UNKNOWN;
                }
                if (i14 == 1) {
                    return CIPHERSUITE_P256_SHA256_AES_GCM_256;
                }
                if (i14 != 2) {
                    return null;
                }
                return CIPHERSUITE_XWINGMLKEM768X25519_SHA256_AES_GCM_256;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return EncryptionKeyResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Ciphersuite> internalGetValueMap() {
                return internalValueMap;
            }

            public static Ciphersuite valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                h.s("EnumValueDescriptor is not for this type.");
                return null;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            @Deprecated
            public static Ciphersuite valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public enum Status implements ProtocolMessageEnum {
            STATUS_UNKNOWN(0),
            STATUS_SUCCESS(1),
            STATUS_FAIL(2);

            public static final int STATUS_FAIL_VALUE = 2;
            public static final int STATUS_SUCCESS_VALUE = 1;
            public static final int STATUS_UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.EncryptionKeyResponse.Status.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Status findValueByNumber(int i14) {
                    return Status.forNumber(i14);
                }
            };
            private static final Status[] VALUES = values();

            Status(int i14) {
                this.value = i14;
            }

            public static Status forNumber(int i14) {
                if (i14 == 0) {
                    return STATUS_UNKNOWN;
                }
                if (i14 == 1) {
                    return STATUS_SUCCESS;
                }
                if (i14 != 2) {
                    return null;
                }
                return STATUS_FAIL;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return EncryptionKeyResponse.getDescriptor().getEnumTypes().get(1);
            }

            public static Internal.EnumLiteMap<Status> internalGetValueMap() {
                return internalValueMap;
            }

            public static Status valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
                if (enumValueDescriptor.getType() == getDescriptor()) {
                    return VALUES[enumValueDescriptor.getIndex()];
                }
                h.s("EnumValueDescriptor is not for this type.");
                return null;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumDescriptor getDescriptorForType() {
                return getDescriptor();
            }

            @Override // com.google.protobuf.ProtocolMessageEnum, com.google.protobuf.Internal.EnumLite
            public final int getNumber() {
                return this.value;
            }

            @Override // com.google.protobuf.ProtocolMessageEnum
            public final Descriptors.EnumValueDescriptor getValueDescriptor() {
                return getDescriptor().getValues().get(ordinal());
            }

            @Deprecated
            public static Status valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int ENCRYPTION_KEY_EXCHANGE_REQUEST_FIELD_NUMBER = 3;
        public static final int ENCRYPTION_KEY_EXCHANGE_RESPONSE_FIELD_NUMBER = 4;
        public static final int ENCRYPTION_KEY_REQUEST_FIELD_NUMBER = 1;
        public static final int ENCRYPTION_KEY_RESPONSE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private EncryptionKeyExchangeRequest encryptionKeyExchangeRequest_;
        private EncryptionKeyExchangeResponse encryptionKeyExchangeResponse_;
        private EncryptionKeyRequest encryptionKeyRequest_;
        private EncryptionKeyResponse encryptionKeyResponse_;
        private byte memoizedIsInitialized;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.Service.1
            @Override // com.google.protobuf.Parser
            public Service parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = Service.newBuilder();
                try {
                    builderNewBuilder.mergeFrom(codedInputStream, extensionRegistryLite);
                    return builderNewBuilder.buildPartial();
                } catch (InvalidProtocolBufferException e4) {
                    throw e4.setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (UninitializedMessageException e14) {
                    throw e14.asInvalidProtocolBufferException().setUnfinishedMessage(builderNewBuilder.buildPartial());
                } catch (IOException e15) {
                    throw new InvalidProtocolBufferException(e15).setUnfinishedMessage(builderNewBuilder.buildPartial());
                }
            }
        };

        private Service(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Service getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIRichNotificationEncryptionManagement.internal_static_GDI_Proto_RichNotificationEncryptionManagement_Service_descriptor;
        }

        public static Builder newBuilder(Service service) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(service);
        }

        public static Service parseDelimitedFrom(InputStream inputStream) {
            return (Service) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static Service parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<Service> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Service)) {
                return super.equals(obj);
            }
            Service service = (Service) obj;
            if (hasEncryptionKeyRequest() != service.hasEncryptionKeyRequest()) {
                return false;
            }
            if ((hasEncryptionKeyRequest() && !getEncryptionKeyRequest().equals(service.getEncryptionKeyRequest())) || hasEncryptionKeyResponse() != service.hasEncryptionKeyResponse()) {
                return false;
            }
            if ((hasEncryptionKeyResponse() && !getEncryptionKeyResponse().equals(service.getEncryptionKeyResponse())) || hasEncryptionKeyExchangeRequest() != service.hasEncryptionKeyExchangeRequest()) {
                return false;
            }
            if ((!hasEncryptionKeyExchangeRequest() || getEncryptionKeyExchangeRequest().equals(service.getEncryptionKeyExchangeRequest())) && hasEncryptionKeyExchangeResponse() == service.hasEncryptionKeyExchangeResponse()) {
                return (!hasEncryptionKeyExchangeResponse() || getEncryptionKeyExchangeResponse().equals(service.getEncryptionKeyExchangeResponse())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.ServiceOrBuilder
        public EncryptionKeyExchangeRequest getEncryptionKeyExchangeRequest() {
            EncryptionKeyExchangeRequest encryptionKeyExchangeRequest = this.encryptionKeyExchangeRequest_;
            return encryptionKeyExchangeRequest == null ? EncryptionKeyExchangeRequest.getDefaultInstance() : encryptionKeyExchangeRequest;
        }

        @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.ServiceOrBuilder
        public EncryptionKeyExchangeRequestOrBuilder getEncryptionKeyExchangeRequestOrBuilder() {
            EncryptionKeyExchangeRequest encryptionKeyExchangeRequest = this.encryptionKeyExchangeRequest_;
            return encryptionKeyExchangeRequest == null ? EncryptionKeyExchangeRequest.getDefaultInstance() : encryptionKeyExchangeRequest;
        }

        @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.ServiceOrBuilder
        public EncryptionKeyExchangeResponse getEncryptionKeyExchangeResponse() {
            EncryptionKeyExchangeResponse encryptionKeyExchangeResponse = this.encryptionKeyExchangeResponse_;
            return encryptionKeyExchangeResponse == null ? EncryptionKeyExchangeResponse.getDefaultInstance() : encryptionKeyExchangeResponse;
        }

        @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.ServiceOrBuilder
        public EncryptionKeyExchangeResponseOrBuilder getEncryptionKeyExchangeResponseOrBuilder() {
            EncryptionKeyExchangeResponse encryptionKeyExchangeResponse = this.encryptionKeyExchangeResponse_;
            return encryptionKeyExchangeResponse == null ? EncryptionKeyExchangeResponse.getDefaultInstance() : encryptionKeyExchangeResponse;
        }

        @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.ServiceOrBuilder
        public EncryptionKeyRequest getEncryptionKeyRequest() {
            EncryptionKeyRequest encryptionKeyRequest = this.encryptionKeyRequest_;
            return encryptionKeyRequest == null ? EncryptionKeyRequest.getDefaultInstance() : encryptionKeyRequest;
        }

        @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.ServiceOrBuilder
        public EncryptionKeyRequestOrBuilder getEncryptionKeyRequestOrBuilder() {
            EncryptionKeyRequest encryptionKeyRequest = this.encryptionKeyRequest_;
            return encryptionKeyRequest == null ? EncryptionKeyRequest.getDefaultInstance() : encryptionKeyRequest;
        }

        @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.ServiceOrBuilder
        public EncryptionKeyResponse getEncryptionKeyResponse() {
            EncryptionKeyResponse encryptionKeyResponse = this.encryptionKeyResponse_;
            return encryptionKeyResponse == null ? EncryptionKeyResponse.getDefaultInstance() : encryptionKeyResponse;
        }

        @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.ServiceOrBuilder
        public EncryptionKeyResponseOrBuilder getEncryptionKeyResponseOrBuilder() {
            EncryptionKeyResponse encryptionKeyResponse = this.encryptionKeyResponse_;
            return encryptionKeyResponse == null ? EncryptionKeyResponse.getDefaultInstance() : encryptionKeyResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<Service> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getEncryptionKeyRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getEncryptionKeyResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getEncryptionKeyExchangeRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getEncryptionKeyExchangeResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.ServiceOrBuilder
        public boolean hasEncryptionKeyExchangeRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.ServiceOrBuilder
        public boolean hasEncryptionKeyExchangeResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.ServiceOrBuilder
        public boolean hasEncryptionKeyRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.ServiceOrBuilder
        public boolean hasEncryptionKeyResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasEncryptionKeyRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getEncryptionKeyRequest().hashCode();
            }
            if (hasEncryptionKeyResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getEncryptionKeyResponse().hashCode();
            }
            if (hasEncryptionKeyExchangeRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getEncryptionKeyExchangeRequest().hashCode();
            }
            if (hasEncryptionKeyExchangeResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getEncryptionKeyExchangeResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIRichNotificationEncryptionManagement.internal_static_GDI_Proto_RichNotificationEncryptionManagement_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            this.memoizedIsInitialized = (byte) 1;
            return true;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new Service();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getEncryptionKeyRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getEncryptionKeyResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getEncryptionKeyExchangeRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getEncryptionKeyExchangeResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<EncryptionKeyExchangeRequest, EncryptionKeyExchangeRequest.Builder, EncryptionKeyExchangeRequestOrBuilder> encryptionKeyExchangeRequestBuilder_;
            private EncryptionKeyExchangeRequest encryptionKeyExchangeRequest_;
            private SingleFieldBuilderV3<EncryptionKeyExchangeResponse, EncryptionKeyExchangeResponse.Builder, EncryptionKeyExchangeResponseOrBuilder> encryptionKeyExchangeResponseBuilder_;
            private EncryptionKeyExchangeResponse encryptionKeyExchangeResponse_;
            private SingleFieldBuilderV3<EncryptionKeyRequest, EncryptionKeyRequest.Builder, EncryptionKeyRequestOrBuilder> encryptionKeyRequestBuilder_;
            private EncryptionKeyRequest encryptionKeyRequest_;
            private SingleFieldBuilderV3<EncryptionKeyResponse, EncryptionKeyResponse.Builder, EncryptionKeyResponseOrBuilder> encryptionKeyResponseBuilder_;
            private EncryptionKeyResponse encryptionKeyResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<EncryptionKeyRequest, EncryptionKeyRequest.Builder, EncryptionKeyRequestOrBuilder> singleFieldBuilderV3 = this.encryptionKeyRequestBuilder_;
                    service.encryptionKeyRequest_ = singleFieldBuilderV3 == null ? this.encryptionKeyRequest_ : (EncryptionKeyRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<EncryptionKeyResponse, EncryptionKeyResponse.Builder, EncryptionKeyResponseOrBuilder> singleFieldBuilderV4 = this.encryptionKeyResponseBuilder_;
                    service.encryptionKeyResponse_ = singleFieldBuilderV4 == null ? this.encryptionKeyResponse_ : (EncryptionKeyResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<EncryptionKeyExchangeRequest, EncryptionKeyExchangeRequest.Builder, EncryptionKeyExchangeRequestOrBuilder> singleFieldBuilderV5 = this.encryptionKeyExchangeRequestBuilder_;
                    service.encryptionKeyExchangeRequest_ = singleFieldBuilderV5 == null ? this.encryptionKeyExchangeRequest_ : (EncryptionKeyExchangeRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<EncryptionKeyExchangeResponse, EncryptionKeyExchangeResponse.Builder, EncryptionKeyExchangeResponseOrBuilder> singleFieldBuilderV6 = this.encryptionKeyExchangeResponseBuilder_;
                    service.encryptionKeyExchangeResponse_ = singleFieldBuilderV6 == null ? this.encryptionKeyExchangeResponse_ : (EncryptionKeyExchangeResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                service.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIRichNotificationEncryptionManagement.internal_static_GDI_Proto_RichNotificationEncryptionManagement_Service_descriptor;
            }

            private SingleFieldBuilderV3<EncryptionKeyExchangeRequest, EncryptionKeyExchangeRequest.Builder, EncryptionKeyExchangeRequestOrBuilder> getEncryptionKeyExchangeRequestFieldBuilder() {
                if (this.encryptionKeyExchangeRequestBuilder_ == null) {
                    this.encryptionKeyExchangeRequestBuilder_ = new SingleFieldBuilderV3<>(getEncryptionKeyExchangeRequest(), getParentForChildren(), isClean());
                    this.encryptionKeyExchangeRequest_ = null;
                }
                return this.encryptionKeyExchangeRequestBuilder_;
            }

            private SingleFieldBuilderV3<EncryptionKeyExchangeResponse, EncryptionKeyExchangeResponse.Builder, EncryptionKeyExchangeResponseOrBuilder> getEncryptionKeyExchangeResponseFieldBuilder() {
                if (this.encryptionKeyExchangeResponseBuilder_ == null) {
                    this.encryptionKeyExchangeResponseBuilder_ = new SingleFieldBuilderV3<>(getEncryptionKeyExchangeResponse(), getParentForChildren(), isClean());
                    this.encryptionKeyExchangeResponse_ = null;
                }
                return this.encryptionKeyExchangeResponseBuilder_;
            }

            private SingleFieldBuilderV3<EncryptionKeyRequest, EncryptionKeyRequest.Builder, EncryptionKeyRequestOrBuilder> getEncryptionKeyRequestFieldBuilder() {
                if (this.encryptionKeyRequestBuilder_ == null) {
                    this.encryptionKeyRequestBuilder_ = new SingleFieldBuilderV3<>(getEncryptionKeyRequest(), getParentForChildren(), isClean());
                    this.encryptionKeyRequest_ = null;
                }
                return this.encryptionKeyRequestBuilder_;
            }

            private SingleFieldBuilderV3<EncryptionKeyResponse, EncryptionKeyResponse.Builder, EncryptionKeyResponseOrBuilder> getEncryptionKeyResponseFieldBuilder() {
                if (this.encryptionKeyResponseBuilder_ == null) {
                    this.encryptionKeyResponseBuilder_ = new SingleFieldBuilderV3<>(getEncryptionKeyResponse(), getParentForChildren(), isClean());
                    this.encryptionKeyResponse_ = null;
                }
                return this.encryptionKeyResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getEncryptionKeyRequestFieldBuilder();
                    getEncryptionKeyResponseFieldBuilder();
                    getEncryptionKeyExchangeRequestFieldBuilder();
                    getEncryptionKeyExchangeResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Service build() {
                Service serviceBuildPartial = buildPartial();
                if (serviceBuildPartial.isInitialized()) {
                    return serviceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) serviceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Service buildPartial() {
                Service service = new Service(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(service);
                }
                onBuilt();
                return service;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.encryptionKeyRequest_ = null;
                SingleFieldBuilderV3<EncryptionKeyRequest, EncryptionKeyRequest.Builder, EncryptionKeyRequestOrBuilder> singleFieldBuilderV3 = this.encryptionKeyRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.encryptionKeyRequestBuilder_ = null;
                }
                this.encryptionKeyResponse_ = null;
                SingleFieldBuilderV3<EncryptionKeyResponse, EncryptionKeyResponse.Builder, EncryptionKeyResponseOrBuilder> singleFieldBuilderV4 = this.encryptionKeyResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.encryptionKeyResponseBuilder_ = null;
                }
                this.encryptionKeyExchangeRequest_ = null;
                SingleFieldBuilderV3<EncryptionKeyExchangeRequest, EncryptionKeyExchangeRequest.Builder, EncryptionKeyExchangeRequestOrBuilder> singleFieldBuilderV5 = this.encryptionKeyExchangeRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.encryptionKeyExchangeRequestBuilder_ = null;
                }
                this.encryptionKeyExchangeResponse_ = null;
                SingleFieldBuilderV3<EncryptionKeyExchangeResponse, EncryptionKeyExchangeResponse.Builder, EncryptionKeyExchangeResponseOrBuilder> singleFieldBuilderV6 = this.encryptionKeyExchangeResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.encryptionKeyExchangeResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearEncryptionKeyExchangeRequest() {
                this.bitField0_ &= -5;
                this.encryptionKeyExchangeRequest_ = null;
                SingleFieldBuilderV3<EncryptionKeyExchangeRequest, EncryptionKeyExchangeRequest.Builder, EncryptionKeyExchangeRequestOrBuilder> singleFieldBuilderV3 = this.encryptionKeyExchangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.encryptionKeyExchangeRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearEncryptionKeyExchangeResponse() {
                this.bitField0_ &= -9;
                this.encryptionKeyExchangeResponse_ = null;
                SingleFieldBuilderV3<EncryptionKeyExchangeResponse, EncryptionKeyExchangeResponse.Builder, EncryptionKeyExchangeResponseOrBuilder> singleFieldBuilderV3 = this.encryptionKeyExchangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.encryptionKeyExchangeResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearEncryptionKeyRequest() {
                this.bitField0_ &= -2;
                this.encryptionKeyRequest_ = null;
                SingleFieldBuilderV3<EncryptionKeyRequest, EncryptionKeyRequest.Builder, EncryptionKeyRequestOrBuilder> singleFieldBuilderV3 = this.encryptionKeyRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.encryptionKeyRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearEncryptionKeyResponse() {
                this.bitField0_ &= -3;
                this.encryptionKeyResponse_ = null;
                SingleFieldBuilderV3<EncryptionKeyResponse, EncryptionKeyResponse.Builder, EncryptionKeyResponseOrBuilder> singleFieldBuilderV3 = this.encryptionKeyResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.encryptionKeyResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIRichNotificationEncryptionManagement.internal_static_GDI_Proto_RichNotificationEncryptionManagement_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.ServiceOrBuilder
            public EncryptionKeyExchangeRequest getEncryptionKeyExchangeRequest() {
                SingleFieldBuilderV3<EncryptionKeyExchangeRequest, EncryptionKeyExchangeRequest.Builder, EncryptionKeyExchangeRequestOrBuilder> singleFieldBuilderV3 = this.encryptionKeyExchangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EncryptionKeyExchangeRequest) singleFieldBuilderV3.getMessage();
                }
                EncryptionKeyExchangeRequest encryptionKeyExchangeRequest = this.encryptionKeyExchangeRequest_;
                return encryptionKeyExchangeRequest == null ? EncryptionKeyExchangeRequest.getDefaultInstance() : encryptionKeyExchangeRequest;
            }

            public EncryptionKeyExchangeRequest.Builder getEncryptionKeyExchangeRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (EncryptionKeyExchangeRequest.Builder) getEncryptionKeyExchangeRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.ServiceOrBuilder
            public EncryptionKeyExchangeRequestOrBuilder getEncryptionKeyExchangeRequestOrBuilder() {
                SingleFieldBuilderV3<EncryptionKeyExchangeRequest, EncryptionKeyExchangeRequest.Builder, EncryptionKeyExchangeRequestOrBuilder> singleFieldBuilderV3 = this.encryptionKeyExchangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EncryptionKeyExchangeRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EncryptionKeyExchangeRequest encryptionKeyExchangeRequest = this.encryptionKeyExchangeRequest_;
                return encryptionKeyExchangeRequest == null ? EncryptionKeyExchangeRequest.getDefaultInstance() : encryptionKeyExchangeRequest;
            }

            @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.ServiceOrBuilder
            public EncryptionKeyExchangeResponse getEncryptionKeyExchangeResponse() {
                SingleFieldBuilderV3<EncryptionKeyExchangeResponse, EncryptionKeyExchangeResponse.Builder, EncryptionKeyExchangeResponseOrBuilder> singleFieldBuilderV3 = this.encryptionKeyExchangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EncryptionKeyExchangeResponse) singleFieldBuilderV3.getMessage();
                }
                EncryptionKeyExchangeResponse encryptionKeyExchangeResponse = this.encryptionKeyExchangeResponse_;
                return encryptionKeyExchangeResponse == null ? EncryptionKeyExchangeResponse.getDefaultInstance() : encryptionKeyExchangeResponse;
            }

            public EncryptionKeyExchangeResponse.Builder getEncryptionKeyExchangeResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (EncryptionKeyExchangeResponse.Builder) getEncryptionKeyExchangeResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.ServiceOrBuilder
            public EncryptionKeyExchangeResponseOrBuilder getEncryptionKeyExchangeResponseOrBuilder() {
                SingleFieldBuilderV3<EncryptionKeyExchangeResponse, EncryptionKeyExchangeResponse.Builder, EncryptionKeyExchangeResponseOrBuilder> singleFieldBuilderV3 = this.encryptionKeyExchangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EncryptionKeyExchangeResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EncryptionKeyExchangeResponse encryptionKeyExchangeResponse = this.encryptionKeyExchangeResponse_;
                return encryptionKeyExchangeResponse == null ? EncryptionKeyExchangeResponse.getDefaultInstance() : encryptionKeyExchangeResponse;
            }

            @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.ServiceOrBuilder
            public EncryptionKeyRequest getEncryptionKeyRequest() {
                SingleFieldBuilderV3<EncryptionKeyRequest, EncryptionKeyRequest.Builder, EncryptionKeyRequestOrBuilder> singleFieldBuilderV3 = this.encryptionKeyRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EncryptionKeyRequest) singleFieldBuilderV3.getMessage();
                }
                EncryptionKeyRequest encryptionKeyRequest = this.encryptionKeyRequest_;
                return encryptionKeyRequest == null ? EncryptionKeyRequest.getDefaultInstance() : encryptionKeyRequest;
            }

            public EncryptionKeyRequest.Builder getEncryptionKeyRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (EncryptionKeyRequest.Builder) getEncryptionKeyRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.ServiceOrBuilder
            public EncryptionKeyRequestOrBuilder getEncryptionKeyRequestOrBuilder() {
                SingleFieldBuilderV3<EncryptionKeyRequest, EncryptionKeyRequest.Builder, EncryptionKeyRequestOrBuilder> singleFieldBuilderV3 = this.encryptionKeyRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EncryptionKeyRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EncryptionKeyRequest encryptionKeyRequest = this.encryptionKeyRequest_;
                return encryptionKeyRequest == null ? EncryptionKeyRequest.getDefaultInstance() : encryptionKeyRequest;
            }

            @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.ServiceOrBuilder
            public EncryptionKeyResponse getEncryptionKeyResponse() {
                SingleFieldBuilderV3<EncryptionKeyResponse, EncryptionKeyResponse.Builder, EncryptionKeyResponseOrBuilder> singleFieldBuilderV3 = this.encryptionKeyResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EncryptionKeyResponse) singleFieldBuilderV3.getMessage();
                }
                EncryptionKeyResponse encryptionKeyResponse = this.encryptionKeyResponse_;
                return encryptionKeyResponse == null ? EncryptionKeyResponse.getDefaultInstance() : encryptionKeyResponse;
            }

            public EncryptionKeyResponse.Builder getEncryptionKeyResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (EncryptionKeyResponse.Builder) getEncryptionKeyResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.ServiceOrBuilder
            public EncryptionKeyResponseOrBuilder getEncryptionKeyResponseOrBuilder() {
                SingleFieldBuilderV3<EncryptionKeyResponse, EncryptionKeyResponse.Builder, EncryptionKeyResponseOrBuilder> singleFieldBuilderV3 = this.encryptionKeyResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EncryptionKeyResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EncryptionKeyResponse encryptionKeyResponse = this.encryptionKeyResponse_;
                return encryptionKeyResponse == null ? EncryptionKeyResponse.getDefaultInstance() : encryptionKeyResponse;
            }

            @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.ServiceOrBuilder
            public boolean hasEncryptionKeyExchangeRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.ServiceOrBuilder
            public boolean hasEncryptionKeyExchangeResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.ServiceOrBuilder
            public boolean hasEncryptionKeyRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIRichNotificationEncryptionManagement.ServiceOrBuilder
            public boolean hasEncryptionKeyResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIRichNotificationEncryptionManagement.internal_static_GDI_Proto_RichNotificationEncryptionManagement_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeEncryptionKeyExchangeRequest(EncryptionKeyExchangeRequest encryptionKeyExchangeRequest) {
                EncryptionKeyExchangeRequest encryptionKeyExchangeRequest2;
                SingleFieldBuilderV3<EncryptionKeyExchangeRequest, EncryptionKeyExchangeRequest.Builder, EncryptionKeyExchangeRequestOrBuilder> singleFieldBuilderV3 = this.encryptionKeyExchangeRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(encryptionKeyExchangeRequest);
                } else if ((this.bitField0_ & 4) == 0 || (encryptionKeyExchangeRequest2 = this.encryptionKeyExchangeRequest_) == null || encryptionKeyExchangeRequest2 == EncryptionKeyExchangeRequest.getDefaultInstance()) {
                    this.encryptionKeyExchangeRequest_ = encryptionKeyExchangeRequest;
                } else {
                    getEncryptionKeyExchangeRequestBuilder().mergeFrom(encryptionKeyExchangeRequest);
                }
                if (this.encryptionKeyExchangeRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeEncryptionKeyExchangeResponse(EncryptionKeyExchangeResponse encryptionKeyExchangeResponse) {
                EncryptionKeyExchangeResponse encryptionKeyExchangeResponse2;
                SingleFieldBuilderV3<EncryptionKeyExchangeResponse, EncryptionKeyExchangeResponse.Builder, EncryptionKeyExchangeResponseOrBuilder> singleFieldBuilderV3 = this.encryptionKeyExchangeResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(encryptionKeyExchangeResponse);
                } else if ((this.bitField0_ & 8) == 0 || (encryptionKeyExchangeResponse2 = this.encryptionKeyExchangeResponse_) == null || encryptionKeyExchangeResponse2 == EncryptionKeyExchangeResponse.getDefaultInstance()) {
                    this.encryptionKeyExchangeResponse_ = encryptionKeyExchangeResponse;
                } else {
                    getEncryptionKeyExchangeResponseBuilder().mergeFrom(encryptionKeyExchangeResponse);
                }
                if (this.encryptionKeyExchangeResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeEncryptionKeyRequest(EncryptionKeyRequest encryptionKeyRequest) {
                EncryptionKeyRequest encryptionKeyRequest2;
                SingleFieldBuilderV3<EncryptionKeyRequest, EncryptionKeyRequest.Builder, EncryptionKeyRequestOrBuilder> singleFieldBuilderV3 = this.encryptionKeyRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(encryptionKeyRequest);
                } else if ((this.bitField0_ & 1) == 0 || (encryptionKeyRequest2 = this.encryptionKeyRequest_) == null || encryptionKeyRequest2 == EncryptionKeyRequest.getDefaultInstance()) {
                    this.encryptionKeyRequest_ = encryptionKeyRequest;
                } else {
                    getEncryptionKeyRequestBuilder().mergeFrom(encryptionKeyRequest);
                }
                if (this.encryptionKeyRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeEncryptionKeyResponse(EncryptionKeyResponse encryptionKeyResponse) {
                EncryptionKeyResponse encryptionKeyResponse2;
                SingleFieldBuilderV3<EncryptionKeyResponse, EncryptionKeyResponse.Builder, EncryptionKeyResponseOrBuilder> singleFieldBuilderV3 = this.encryptionKeyResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(encryptionKeyResponse);
                } else if ((this.bitField0_ & 2) == 0 || (encryptionKeyResponse2 = this.encryptionKeyResponse_) == null || encryptionKeyResponse2 == EncryptionKeyResponse.getDefaultInstance()) {
                    this.encryptionKeyResponse_ = encryptionKeyResponse;
                } else {
                    getEncryptionKeyResponseBuilder().mergeFrom(encryptionKeyResponse);
                }
                if (this.encryptionKeyResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                extensionRegistryLite.getClass();
                boolean z14 = false;
                while (!z14) {
                    try {
                        try {
                            int tag = codedInputStream.readTag();
                            if (tag != 0) {
                                if (tag == 10) {
                                    codedInputStream.readMessage(getEncryptionKeyRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getEncryptionKeyResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getEncryptionKeyExchangeRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getEncryptionKeyExchangeResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                }
                            }
                            z14 = true;
                        } catch (InvalidProtocolBufferException e4) {
                            throw e4.unwrapIOException();
                        }
                    } catch (Throwable th3) {
                        onChanged();
                        throw th3;
                    }
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setEncryptionKeyExchangeRequest(EncryptionKeyExchangeRequest.Builder builder) {
                SingleFieldBuilderV3<EncryptionKeyExchangeRequest, EncryptionKeyExchangeRequest.Builder, EncryptionKeyExchangeRequestOrBuilder> singleFieldBuilderV3 = this.encryptionKeyExchangeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.encryptionKeyExchangeRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setEncryptionKeyExchangeResponse(EncryptionKeyExchangeResponse.Builder builder) {
                SingleFieldBuilderV3<EncryptionKeyExchangeResponse, EncryptionKeyExchangeResponse.Builder, EncryptionKeyExchangeResponseOrBuilder> singleFieldBuilderV3 = this.encryptionKeyExchangeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.encryptionKeyExchangeResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setEncryptionKeyRequest(EncryptionKeyRequest.Builder builder) {
                SingleFieldBuilderV3<EncryptionKeyRequest, EncryptionKeyRequest.Builder, EncryptionKeyRequestOrBuilder> singleFieldBuilderV3 = this.encryptionKeyRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.encryptionKeyRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setEncryptionKeyResponse(EncryptionKeyResponse.Builder builder) {
                SingleFieldBuilderV3<EncryptionKeyResponse, EncryptionKeyResponse.Builder, EncryptionKeyResponseOrBuilder> singleFieldBuilderV3 = this.encryptionKeyResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.encryptionKeyResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public Service getDefaultInstanceForType() {
                return Service.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            public Builder setEncryptionKeyExchangeRequest(EncryptionKeyExchangeRequest encryptionKeyExchangeRequest) {
                SingleFieldBuilderV3<EncryptionKeyExchangeRequest, EncryptionKeyExchangeRequest.Builder, EncryptionKeyExchangeRequestOrBuilder> singleFieldBuilderV3 = this.encryptionKeyExchangeRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    encryptionKeyExchangeRequest.getClass();
                    this.encryptionKeyExchangeRequest_ = encryptionKeyExchangeRequest;
                } else {
                    singleFieldBuilderV3.setMessage(encryptionKeyExchangeRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setEncryptionKeyExchangeResponse(EncryptionKeyExchangeResponse encryptionKeyExchangeResponse) {
                SingleFieldBuilderV3<EncryptionKeyExchangeResponse, EncryptionKeyExchangeResponse.Builder, EncryptionKeyExchangeResponseOrBuilder> singleFieldBuilderV3 = this.encryptionKeyExchangeResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    encryptionKeyExchangeResponse.getClass();
                    this.encryptionKeyExchangeResponse_ = encryptionKeyExchangeResponse;
                } else {
                    singleFieldBuilderV3.setMessage(encryptionKeyExchangeResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setEncryptionKeyRequest(EncryptionKeyRequest encryptionKeyRequest) {
                SingleFieldBuilderV3<EncryptionKeyRequest, EncryptionKeyRequest.Builder, EncryptionKeyRequestOrBuilder> singleFieldBuilderV3 = this.encryptionKeyRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    encryptionKeyRequest.getClass();
                    this.encryptionKeyRequest_ = encryptionKeyRequest;
                } else {
                    singleFieldBuilderV3.setMessage(encryptionKeyRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setEncryptionKeyResponse(EncryptionKeyResponse encryptionKeyResponse) {
                SingleFieldBuilderV3<EncryptionKeyResponse, EncryptionKeyResponse.Builder, EncryptionKeyResponseOrBuilder> singleFieldBuilderV3 = this.encryptionKeyResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    encryptionKeyResponse.getClass();
                    this.encryptionKeyResponse_ = encryptionKeyResponse;
                } else {
                    singleFieldBuilderV3.setMessage(encryptionKeyResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof Service) {
                    return mergeFrom((Service) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(Service service) {
                if (service == Service.getDefaultInstance()) {
                    return this;
                }
                if (service.hasEncryptionKeyRequest()) {
                    mergeEncryptionKeyRequest(service.getEncryptionKeyRequest());
                }
                if (service.hasEncryptionKeyResponse()) {
                    mergeEncryptionKeyResponse(service.getEncryptionKeyResponse());
                }
                if (service.hasEncryptionKeyExchangeRequest()) {
                    mergeEncryptionKeyExchangeRequest(service.getEncryptionKeyExchangeRequest());
                }
                if (service.hasEncryptionKeyExchangeResponse()) {
                    mergeEncryptionKeyExchangeResponse(service.getEncryptionKeyExchangeResponse());
                }
                mergeUnknownFields(service.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public Service getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ Service(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private Service() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Service parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Service) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Service parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Service parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static Service parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static Service parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static Service parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static Service parseFrom(InputStream inputStream) {
            return (Service) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static Service parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Service) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static Service parseFrom(CodedInputStream codedInputStream) {
            return (Service) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static Service parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (Service) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
