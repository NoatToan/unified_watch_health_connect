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

/* JADX INFO: loaded from: classes13.dex */
public final class GDIWallet {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u000fGDIWallet.proto\u0012\u0010GDI.Proto.Wallet\"\u0091\u0001\n\u0007Service\u0012A\n\u0014tap_add_card_request\u0018\u0001 \u0001(\u000b2#.GDI.Proto.Wallet.TapAddCardRequest\u0012C\n\u0015tap_add_card_response\u0018\u0002 \u0001(\u000b2$.GDI.Proto.Wallet.TapAddCardResponse\"\u0013\n\u0011TapAddCardRequest\"}\n\u0012TapAddCardResponse\u0012;\n\u0006status\u0018\u0001 \u0001(\u000e2+.GDI.Proto.Wallet.TapAddCardResponse.Status\"*\n\u0006Status\u0012\u000b\n\u0007SUCCESS\u0010\u0001\u0012\b\n\u0004BUSY\u0010\u0002\u0012\t\n\u0005ERROR\u0010\u0003B)\n\u001acom.garmin.proto.generatedB\tGDIWalletH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Wallet_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Wallet_Service_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Wallet_TapAddCardRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Wallet_TapAddCardRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_Wallet_TapAddCardResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_Wallet_TapAddCardResponse_fieldAccessorTable;

    public interface ServiceOrBuilder extends MessageOrBuilder {
        TapAddCardRequest getTapAddCardRequest();

        TapAddCardRequestOrBuilder getTapAddCardRequestOrBuilder();

        TapAddCardResponse getTapAddCardResponse();

        TapAddCardResponseOrBuilder getTapAddCardResponseOrBuilder();

        boolean hasTapAddCardRequest();

        boolean hasTapAddCardResponse();
    }

    public interface TapAddCardRequestOrBuilder extends MessageOrBuilder {
    }

    public interface TapAddCardResponseOrBuilder extends MessageOrBuilder {
        TapAddCardResponse.Status getStatus();

        boolean hasStatus();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_Wallet_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_Wallet_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"TapAddCardRequest", "TapAddCardResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_Wallet_TapAddCardRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_Wallet_TapAddCardRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[0]);
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_Wallet_TapAddCardResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_Wallet_TapAddCardResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Status"});
    }

    private GDIWallet() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class TapAddCardRequest extends GeneratedMessageV3 implements TapAddCardRequestOrBuilder {
        private static final TapAddCardRequest DEFAULT_INSTANCE = new TapAddCardRequest();

        @Deprecated
        public static final Parser<TapAddCardRequest> PARSER = new AbstractParser<TapAddCardRequest>() { // from class: com.garmin.proto.generated.GDIWallet.TapAddCardRequest.1
            @Override // com.google.protobuf.Parser
            public TapAddCardRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TapAddCardRequest.newBuilder();
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

        private TapAddCardRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TapAddCardRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWallet.internal_static_GDI_Proto_Wallet_TapAddCardRequest_descriptor;
        }

        public static Builder newBuilder(TapAddCardRequest tapAddCardRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(tapAddCardRequest);
        }

        public static TapAddCardRequest parseDelimitedFrom(InputStream inputStream) {
            return (TapAddCardRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TapAddCardRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TapAddCardRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof TapAddCardRequest) {
                return getUnknownFields().equals(((TapAddCardRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TapAddCardRequest> getParserForType() {
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
            return GDIWallet.internal_static_GDI_Proto_Wallet_TapAddCardRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(TapAddCardRequest.class, Builder.class);
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
            return new TapAddCardRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TapAddCardRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWallet.internal_static_GDI_Proto_Wallet_TapAddCardRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TapAddCardRequest build() {
                TapAddCardRequest tapAddCardRequestBuildPartial = buildPartial();
                if (tapAddCardRequestBuildPartial.isInitialized()) {
                    return tapAddCardRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) tapAddCardRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TapAddCardRequest buildPartial() {
                TapAddCardRequest tapAddCardRequest = new TapAddCardRequest(this);
                onBuilt();
                return tapAddCardRequest;
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
                return GDIWallet.internal_static_GDI_Proto_Wallet_TapAddCardRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWallet.internal_static_GDI_Proto_Wallet_TapAddCardRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(TapAddCardRequest.class, Builder.class);
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
            public TapAddCardRequest getDefaultInstanceForType() {
                return TapAddCardRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TapAddCardRequest) {
                    return mergeFrom((TapAddCardRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TapAddCardRequest tapAddCardRequest) {
                if (tapAddCardRequest == TapAddCardRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(tapAddCardRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TapAddCardRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ TapAddCardRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private TapAddCardRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TapAddCardRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TapAddCardRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TapAddCardRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TapAddCardRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TapAddCardRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TapAddCardRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TapAddCardRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TapAddCardRequest parseFrom(InputStream inputStream) {
            return (TapAddCardRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TapAddCardRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TapAddCardRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TapAddCardRequest parseFrom(CodedInputStream codedInputStream) {
            return (TapAddCardRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TapAddCardRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TapAddCardRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIWallet.Service.1
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
        public static final int TAP_ADD_CARD_REQUEST_FIELD_NUMBER = 1;
        public static final int TAP_ADD_CARD_RESPONSE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private TapAddCardRequest tapAddCardRequest_;
        private TapAddCardResponse tapAddCardResponse_;

        private Service(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Service getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWallet.internal_static_GDI_Proto_Wallet_Service_descriptor;
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
            if (hasTapAddCardRequest() != service.hasTapAddCardRequest()) {
                return false;
            }
            if ((!hasTapAddCardRequest() || getTapAddCardRequest().equals(service.getTapAddCardRequest())) && hasTapAddCardResponse() == service.hasTapAddCardResponse()) {
                return (!hasTapAddCardResponse() || getTapAddCardResponse().equals(service.getTapAddCardResponse())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getTapAddCardRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getTapAddCardResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIWallet.ServiceOrBuilder
        public TapAddCardRequest getTapAddCardRequest() {
            TapAddCardRequest tapAddCardRequest = this.tapAddCardRequest_;
            return tapAddCardRequest == null ? TapAddCardRequest.getDefaultInstance() : tapAddCardRequest;
        }

        @Override // com.garmin.proto.generated.GDIWallet.ServiceOrBuilder
        public TapAddCardRequestOrBuilder getTapAddCardRequestOrBuilder() {
            TapAddCardRequest tapAddCardRequest = this.tapAddCardRequest_;
            return tapAddCardRequest == null ? TapAddCardRequest.getDefaultInstance() : tapAddCardRequest;
        }

        @Override // com.garmin.proto.generated.GDIWallet.ServiceOrBuilder
        public TapAddCardResponse getTapAddCardResponse() {
            TapAddCardResponse tapAddCardResponse = this.tapAddCardResponse_;
            return tapAddCardResponse == null ? TapAddCardResponse.getDefaultInstance() : tapAddCardResponse;
        }

        @Override // com.garmin.proto.generated.GDIWallet.ServiceOrBuilder
        public TapAddCardResponseOrBuilder getTapAddCardResponseOrBuilder() {
            TapAddCardResponse tapAddCardResponse = this.tapAddCardResponse_;
            return tapAddCardResponse == null ? TapAddCardResponse.getDefaultInstance() : tapAddCardResponse;
        }

        @Override // com.garmin.proto.generated.GDIWallet.ServiceOrBuilder
        public boolean hasTapAddCardRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIWallet.ServiceOrBuilder
        public boolean hasTapAddCardResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTapAddCardRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getTapAddCardRequest().hashCode();
            }
            if (hasTapAddCardResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTapAddCardResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIWallet.internal_static_GDI_Proto_Wallet_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                codedOutputStream.writeMessage(1, getTapAddCardRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getTapAddCardResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<TapAddCardRequest, TapAddCardRequest.Builder, TapAddCardRequestOrBuilder> tapAddCardRequestBuilder_;
            private TapAddCardRequest tapAddCardRequest_;
            private SingleFieldBuilderV3<TapAddCardResponse, TapAddCardResponse.Builder, TapAddCardResponseOrBuilder> tapAddCardResponseBuilder_;
            private TapAddCardResponse tapAddCardResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<TapAddCardRequest, TapAddCardRequest.Builder, TapAddCardRequestOrBuilder> singleFieldBuilderV3 = this.tapAddCardRequestBuilder_;
                    service.tapAddCardRequest_ = singleFieldBuilderV3 == null ? this.tapAddCardRequest_ : (TapAddCardRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<TapAddCardResponse, TapAddCardResponse.Builder, TapAddCardResponseOrBuilder> singleFieldBuilderV4 = this.tapAddCardResponseBuilder_;
                    service.tapAddCardResponse_ = singleFieldBuilderV4 == null ? this.tapAddCardResponse_ : (TapAddCardResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                service.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWallet.internal_static_GDI_Proto_Wallet_Service_descriptor;
            }

            private SingleFieldBuilderV3<TapAddCardRequest, TapAddCardRequest.Builder, TapAddCardRequestOrBuilder> getTapAddCardRequestFieldBuilder() {
                if (this.tapAddCardRequestBuilder_ == null) {
                    this.tapAddCardRequestBuilder_ = new SingleFieldBuilderV3<>(getTapAddCardRequest(), getParentForChildren(), isClean());
                    this.tapAddCardRequest_ = null;
                }
                return this.tapAddCardRequestBuilder_;
            }

            private SingleFieldBuilderV3<TapAddCardResponse, TapAddCardResponse.Builder, TapAddCardResponseOrBuilder> getTapAddCardResponseFieldBuilder() {
                if (this.tapAddCardResponseBuilder_ == null) {
                    this.tapAddCardResponseBuilder_ = new SingleFieldBuilderV3<>(getTapAddCardResponse(), getParentForChildren(), isClean());
                    this.tapAddCardResponse_ = null;
                }
                return this.tapAddCardResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getTapAddCardRequestFieldBuilder();
                    getTapAddCardResponseFieldBuilder();
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
                this.tapAddCardRequest_ = null;
                SingleFieldBuilderV3<TapAddCardRequest, TapAddCardRequest.Builder, TapAddCardRequestOrBuilder> singleFieldBuilderV3 = this.tapAddCardRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.tapAddCardRequestBuilder_ = null;
                }
                this.tapAddCardResponse_ = null;
                SingleFieldBuilderV3<TapAddCardResponse, TapAddCardResponse.Builder, TapAddCardResponseOrBuilder> singleFieldBuilderV4 = this.tapAddCardResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.tapAddCardResponseBuilder_ = null;
                }
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

            public Builder clearTapAddCardRequest() {
                this.bitField0_ &= -2;
                this.tapAddCardRequest_ = null;
                SingleFieldBuilderV3<TapAddCardRequest, TapAddCardRequest.Builder, TapAddCardRequestOrBuilder> singleFieldBuilderV3 = this.tapAddCardRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.tapAddCardRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTapAddCardResponse() {
                this.bitField0_ &= -3;
                this.tapAddCardResponse_ = null;
                SingleFieldBuilderV3<TapAddCardResponse, TapAddCardResponse.Builder, TapAddCardResponseOrBuilder> singleFieldBuilderV3 = this.tapAddCardResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.tapAddCardResponseBuilder_ = null;
                }
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
                return GDIWallet.internal_static_GDI_Proto_Wallet_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWallet.ServiceOrBuilder
            public TapAddCardRequest getTapAddCardRequest() {
                SingleFieldBuilderV3<TapAddCardRequest, TapAddCardRequest.Builder, TapAddCardRequestOrBuilder> singleFieldBuilderV3 = this.tapAddCardRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TapAddCardRequest) singleFieldBuilderV3.getMessage();
                }
                TapAddCardRequest tapAddCardRequest = this.tapAddCardRequest_;
                return tapAddCardRequest == null ? TapAddCardRequest.getDefaultInstance() : tapAddCardRequest;
            }

            public TapAddCardRequest.Builder getTapAddCardRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (TapAddCardRequest.Builder) getTapAddCardRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWallet.ServiceOrBuilder
            public TapAddCardRequestOrBuilder getTapAddCardRequestOrBuilder() {
                SingleFieldBuilderV3<TapAddCardRequest, TapAddCardRequest.Builder, TapAddCardRequestOrBuilder> singleFieldBuilderV3 = this.tapAddCardRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TapAddCardRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TapAddCardRequest tapAddCardRequest = this.tapAddCardRequest_;
                return tapAddCardRequest == null ? TapAddCardRequest.getDefaultInstance() : tapAddCardRequest;
            }

            @Override // com.garmin.proto.generated.GDIWallet.ServiceOrBuilder
            public TapAddCardResponse getTapAddCardResponse() {
                SingleFieldBuilderV3<TapAddCardResponse, TapAddCardResponse.Builder, TapAddCardResponseOrBuilder> singleFieldBuilderV3 = this.tapAddCardResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TapAddCardResponse) singleFieldBuilderV3.getMessage();
                }
                TapAddCardResponse tapAddCardResponse = this.tapAddCardResponse_;
                return tapAddCardResponse == null ? TapAddCardResponse.getDefaultInstance() : tapAddCardResponse;
            }

            public TapAddCardResponse.Builder getTapAddCardResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (TapAddCardResponse.Builder) getTapAddCardResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIWallet.ServiceOrBuilder
            public TapAddCardResponseOrBuilder getTapAddCardResponseOrBuilder() {
                SingleFieldBuilderV3<TapAddCardResponse, TapAddCardResponse.Builder, TapAddCardResponseOrBuilder> singleFieldBuilderV3 = this.tapAddCardResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TapAddCardResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TapAddCardResponse tapAddCardResponse = this.tapAddCardResponse_;
                return tapAddCardResponse == null ? TapAddCardResponse.getDefaultInstance() : tapAddCardResponse;
            }

            @Override // com.garmin.proto.generated.GDIWallet.ServiceOrBuilder
            public boolean hasTapAddCardRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIWallet.ServiceOrBuilder
            public boolean hasTapAddCardResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWallet.internal_static_GDI_Proto_Wallet_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
                                    codedInputStream.readMessage(getTapAddCardRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getTapAddCardResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeTapAddCardRequest(TapAddCardRequest tapAddCardRequest) {
                TapAddCardRequest tapAddCardRequest2;
                SingleFieldBuilderV3<TapAddCardRequest, TapAddCardRequest.Builder, TapAddCardRequestOrBuilder> singleFieldBuilderV3 = this.tapAddCardRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(tapAddCardRequest);
                } else if ((this.bitField0_ & 1) == 0 || (tapAddCardRequest2 = this.tapAddCardRequest_) == null || tapAddCardRequest2 == TapAddCardRequest.getDefaultInstance()) {
                    this.tapAddCardRequest_ = tapAddCardRequest;
                } else {
                    getTapAddCardRequestBuilder().mergeFrom(tapAddCardRequest);
                }
                if (this.tapAddCardRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTapAddCardResponse(TapAddCardResponse tapAddCardResponse) {
                TapAddCardResponse tapAddCardResponse2;
                SingleFieldBuilderV3<TapAddCardResponse, TapAddCardResponse.Builder, TapAddCardResponseOrBuilder> singleFieldBuilderV3 = this.tapAddCardResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(tapAddCardResponse);
                } else if ((this.bitField0_ & 2) == 0 || (tapAddCardResponse2 = this.tapAddCardResponse_) == null || tapAddCardResponse2 == TapAddCardResponse.getDefaultInstance()) {
                    this.tapAddCardResponse_ = tapAddCardResponse;
                } else {
                    getTapAddCardResponseBuilder().mergeFrom(tapAddCardResponse);
                }
                if (this.tapAddCardResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
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

            public Builder setTapAddCardRequest(TapAddCardRequest.Builder builder) {
                SingleFieldBuilderV3<TapAddCardRequest, TapAddCardRequest.Builder, TapAddCardRequestOrBuilder> singleFieldBuilderV3 = this.tapAddCardRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.tapAddCardRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTapAddCardResponse(TapAddCardResponse.Builder builder) {
                SingleFieldBuilderV3<TapAddCardResponse, TapAddCardResponse.Builder, TapAddCardResponseOrBuilder> singleFieldBuilderV3 = this.tapAddCardResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.tapAddCardResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
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

            public Builder setTapAddCardRequest(TapAddCardRequest tapAddCardRequest) {
                SingleFieldBuilderV3<TapAddCardRequest, TapAddCardRequest.Builder, TapAddCardRequestOrBuilder> singleFieldBuilderV3 = this.tapAddCardRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    tapAddCardRequest.getClass();
                    this.tapAddCardRequest_ = tapAddCardRequest;
                } else {
                    singleFieldBuilderV3.setMessage(tapAddCardRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTapAddCardResponse(TapAddCardResponse tapAddCardResponse) {
                SingleFieldBuilderV3<TapAddCardResponse, TapAddCardResponse.Builder, TapAddCardResponseOrBuilder> singleFieldBuilderV3 = this.tapAddCardResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    tapAddCardResponse.getClass();
                    this.tapAddCardResponse_ = tapAddCardResponse;
                } else {
                    singleFieldBuilderV3.setMessage(tapAddCardResponse);
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
                if (service.hasTapAddCardRequest()) {
                    mergeTapAddCardRequest(service.getTapAddCardRequest());
                }
                if (service.hasTapAddCardResponse()) {
                    mergeTapAddCardResponse(service.getTapAddCardResponse());
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

    public static final class TapAddCardResponse extends GeneratedMessageV3 implements TapAddCardResponseOrBuilder {
        private static final TapAddCardResponse DEFAULT_INSTANCE = new TapAddCardResponse();

        @Deprecated
        public static final Parser<TapAddCardResponse> PARSER = new AbstractParser<TapAddCardResponse>() { // from class: com.garmin.proto.generated.GDIWallet.TapAddCardResponse.1
            @Override // com.google.protobuf.Parser
            public TapAddCardResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TapAddCardResponse.newBuilder();
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

        private TapAddCardResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static TapAddCardResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIWallet.internal_static_GDI_Proto_Wallet_TapAddCardResponse_descriptor;
        }

        public static Builder newBuilder(TapAddCardResponse tapAddCardResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(tapAddCardResponse);
        }

        public static TapAddCardResponse parseDelimitedFrom(InputStream inputStream) {
            return (TapAddCardResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TapAddCardResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TapAddCardResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TapAddCardResponse)) {
                return super.equals(obj);
            }
            TapAddCardResponse tapAddCardResponse = (TapAddCardResponse) obj;
            if (hasStatus() != tapAddCardResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == tapAddCardResponse.status_) && getUnknownFields().equals(tapAddCardResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TapAddCardResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIWallet.TapAddCardResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.SUCCESS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIWallet.TapAddCardResponseOrBuilder
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
            return GDIWallet.internal_static_GDI_Proto_Wallet_TapAddCardResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(TapAddCardResponse.class, Builder.class);
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
            return new TapAddCardResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TapAddCardResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 1;
            }

            private void buildPartial0(TapAddCardResponse tapAddCardResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    tapAddCardResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                tapAddCardResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIWallet.internal_static_GDI_Proto_Wallet_TapAddCardResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TapAddCardResponse build() {
                TapAddCardResponse tapAddCardResponseBuildPartial = buildPartial();
                if (tapAddCardResponseBuildPartial.isInitialized()) {
                    return tapAddCardResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) tapAddCardResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TapAddCardResponse buildPartial() {
                TapAddCardResponse tapAddCardResponse = new TapAddCardResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(tapAddCardResponse);
                }
                onBuilt();
                return tapAddCardResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 1;
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
                this.status_ = 1;
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
                return GDIWallet.internal_static_GDI_Proto_Wallet_TapAddCardResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIWallet.TapAddCardResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.SUCCESS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIWallet.TapAddCardResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIWallet.internal_static_GDI_Proto_Wallet_TapAddCardResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(TapAddCardResponse.class, Builder.class);
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
            public TapAddCardResponse getDefaultInstanceForType() {
                return TapAddCardResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.status_ = 1;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TapAddCardResponse) {
                    return mergeFrom((TapAddCardResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(TapAddCardResponse tapAddCardResponse) {
                if (tapAddCardResponse == TapAddCardResponse.getDefaultInstance()) {
                    return this;
                }
                if (tapAddCardResponse.hasStatus()) {
                    setStatus(tapAddCardResponse.getStatus());
                }
                mergeUnknownFields(tapAddCardResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public TapAddCardResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static TapAddCardResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TapAddCardResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TapAddCardResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ TapAddCardResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static TapAddCardResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private TapAddCardResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TapAddCardResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TapAddCardResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static TapAddCardResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TapAddCardResponse parseFrom(InputStream inputStream) {
            return (TapAddCardResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TapAddCardResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TapAddCardResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TapAddCardResponse parseFrom(CodedInputStream codedInputStream) {
            return (TapAddCardResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TapAddCardResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TapAddCardResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            SUCCESS(1),
            BUSY(2),
            ERROR(3);

            public static final int BUSY_VALUE = 2;
            public static final int ERROR_VALUE = 3;
            public static final int SUCCESS_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIWallet.TapAddCardResponse.Status.1
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
                if (i14 == 1) {
                    return SUCCESS;
                }
                if (i14 == 2) {
                    return BUSY;
                }
                if (i14 != 3) {
                    return null;
                }
                return ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return TapAddCardResponse.getDescriptor().getEnumTypes().get(0);
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

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
