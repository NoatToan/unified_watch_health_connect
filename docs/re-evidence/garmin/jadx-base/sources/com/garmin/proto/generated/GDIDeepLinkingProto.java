package com.garmin.proto.generated;

import com.garmin.android.apps.connectmobile.f3;
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
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
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.LazyStringList;
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.ProtocolStringList;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes4.dex */
public final class GDIDeepLinkingProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0014GDIDeepLinking.proto\u0012\u0015GDI.Proto.DeepLinking\"°\u0001\n\u0012DeepLinkingService\u0012K\n\u0014deep_linking_request\u0018\u0001 \u0001(\u000b2-.GDI.Proto.DeepLinking.OpenDeepLinkingRequest\u0012M\n\u0015deep_linking_response\u0018\u0002 \u0001(\u000b2..GDI.Proto.DeepLinking.OpenDeepLinkingResponse\")\n\u0016OpenDeepLinkingRequest\u0012\u000f\n\u0007schemas\u0018\u0001 \u0003(\t\"¿\u0001\n\u0017OpenDeepLinkingResponse\u0012M\n\u0006status\u0018\u0001 \u0001(\u000e2=.GDI.Proto.DeepLinking.OpenDeepLinkingResponse.ResponseStatus\u0012\u0019\n\u0011used_schema_index\u0018\u0002 \u0001(\u0005\":\n\u000eResponseStatus\u0012\u0006\n\u0002OK\u0010\u0001\u0012\r\n\tUNHANDLED\u0010\u0002\u0012\u0011\n\rUNKNOWN_ERROR\u0010\u0003B3\n\u001acom.garmin.proto.generatedB\u0013GDIDeepLinkingProtoH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeepLinking_DeepLinkingService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeepLinking_DeepLinkingService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeepLinking_OpenDeepLinkingRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeepLinking_OpenDeepLinkingRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DeepLinking_OpenDeepLinkingResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DeepLinking_OpenDeepLinkingResponse_fieldAccessorTable;

    public interface DeepLinkingServiceOrBuilder extends MessageOrBuilder {
        OpenDeepLinkingRequest getDeepLinkingRequest();

        OpenDeepLinkingRequestOrBuilder getDeepLinkingRequestOrBuilder();

        OpenDeepLinkingResponse getDeepLinkingResponse();

        OpenDeepLinkingResponseOrBuilder getDeepLinkingResponseOrBuilder();

        boolean hasDeepLinkingRequest();

        boolean hasDeepLinkingResponse();
    }

    public interface OpenDeepLinkingRequestOrBuilder extends MessageOrBuilder {
        String getSchemas(int i14);

        ByteString getSchemasBytes(int i14);

        int getSchemasCount();

        List<String> getSchemasList();
    }

    public interface OpenDeepLinkingResponseOrBuilder extends MessageOrBuilder {
        OpenDeepLinkingResponse.ResponseStatus getStatus();

        int getUsedSchemaIndex();

        boolean hasStatus();

        boolean hasUsedSchemaIndex();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_DeepLinking_DeepLinkingService_descriptor = descriptor2;
        internal_static_GDI_Proto_DeepLinking_DeepLinkingService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"DeepLinkingRequest", "DeepLinkingResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_DeepLinking_OpenDeepLinkingRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_DeepLinking_OpenDeepLinkingRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Schemas"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_DeepLinking_OpenDeepLinkingResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_DeepLinking_OpenDeepLinkingResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Status", "UsedSchemaIndex"});
    }

    private GDIDeepLinkingProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class DeepLinkingService extends GeneratedMessageV3 implements DeepLinkingServiceOrBuilder {
        public static final int DEEP_LINKING_REQUEST_FIELD_NUMBER = 1;
        public static final int DEEP_LINKING_RESPONSE_FIELD_NUMBER = 2;
        private static final DeepLinkingService DEFAULT_INSTANCE = new DeepLinkingService();

        @Deprecated
        public static final Parser<DeepLinkingService> PARSER = new AbstractParser<DeepLinkingService>() { // from class: com.garmin.proto.generated.GDIDeepLinkingProto.DeepLinkingService.1
            @Override // com.google.protobuf.Parser
            public DeepLinkingService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DeepLinkingService.newBuilder();
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
        private int bitField0_;
        private OpenDeepLinkingRequest deepLinkingRequest_;
        private OpenDeepLinkingResponse deepLinkingResponse_;
        private byte memoizedIsInitialized;

        private DeepLinkingService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeepLinkingService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeepLinkingProto.internal_static_GDI_Proto_DeepLinking_DeepLinkingService_descriptor;
        }

        public static Builder newBuilder(DeepLinkingService deepLinkingService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(deepLinkingService);
        }

        public static DeepLinkingService parseDelimitedFrom(InputStream inputStream) {
            return (DeepLinkingService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DeepLinkingService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DeepLinkingService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DeepLinkingService)) {
                return super.equals(obj);
            }
            DeepLinkingService deepLinkingService = (DeepLinkingService) obj;
            if (hasDeepLinkingRequest() != deepLinkingService.hasDeepLinkingRequest()) {
                return false;
            }
            if ((!hasDeepLinkingRequest() || getDeepLinkingRequest().equals(deepLinkingService.getDeepLinkingRequest())) && hasDeepLinkingResponse() == deepLinkingService.hasDeepLinkingResponse()) {
                return (!hasDeepLinkingResponse() || getDeepLinkingResponse().equals(deepLinkingService.getDeepLinkingResponse())) && getUnknownFields().equals(deepLinkingService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDeepLinkingProto.DeepLinkingServiceOrBuilder
        public OpenDeepLinkingRequest getDeepLinkingRequest() {
            OpenDeepLinkingRequest openDeepLinkingRequest = this.deepLinkingRequest_;
            return openDeepLinkingRequest == null ? OpenDeepLinkingRequest.getDefaultInstance() : openDeepLinkingRequest;
        }

        @Override // com.garmin.proto.generated.GDIDeepLinkingProto.DeepLinkingServiceOrBuilder
        public OpenDeepLinkingRequestOrBuilder getDeepLinkingRequestOrBuilder() {
            OpenDeepLinkingRequest openDeepLinkingRequest = this.deepLinkingRequest_;
            return openDeepLinkingRequest == null ? OpenDeepLinkingRequest.getDefaultInstance() : openDeepLinkingRequest;
        }

        @Override // com.garmin.proto.generated.GDIDeepLinkingProto.DeepLinkingServiceOrBuilder
        public OpenDeepLinkingResponse getDeepLinkingResponse() {
            OpenDeepLinkingResponse openDeepLinkingResponse = this.deepLinkingResponse_;
            return openDeepLinkingResponse == null ? OpenDeepLinkingResponse.getDefaultInstance() : openDeepLinkingResponse;
        }

        @Override // com.garmin.proto.generated.GDIDeepLinkingProto.DeepLinkingServiceOrBuilder
        public OpenDeepLinkingResponseOrBuilder getDeepLinkingResponseOrBuilder() {
            OpenDeepLinkingResponse openDeepLinkingResponse = this.deepLinkingResponse_;
            return openDeepLinkingResponse == null ? OpenDeepLinkingResponse.getDefaultInstance() : openDeepLinkingResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DeepLinkingService> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getDeepLinkingRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getDeepLinkingResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDeepLinkingProto.DeepLinkingServiceOrBuilder
        public boolean hasDeepLinkingRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDeepLinkingProto.DeepLinkingServiceOrBuilder
        public boolean hasDeepLinkingResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasDeepLinkingRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getDeepLinkingRequest().hashCode();
            }
            if (hasDeepLinkingResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getDeepLinkingResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeepLinkingProto.internal_static_GDI_Proto_DeepLinking_DeepLinkingService_fieldAccessorTable.ensureFieldAccessorsInitialized(DeepLinkingService.class, Builder.class);
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
            return new DeepLinkingService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getDeepLinkingRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getDeepLinkingResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DeepLinkingServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<OpenDeepLinkingRequest, OpenDeepLinkingRequest.Builder, OpenDeepLinkingRequestOrBuilder> deepLinkingRequestBuilder_;
            private OpenDeepLinkingRequest deepLinkingRequest_;
            private SingleFieldBuilderV3<OpenDeepLinkingResponse, OpenDeepLinkingResponse.Builder, OpenDeepLinkingResponseOrBuilder> deepLinkingResponseBuilder_;
            private OpenDeepLinkingResponse deepLinkingResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(DeepLinkingService deepLinkingService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<OpenDeepLinkingRequest, OpenDeepLinkingRequest.Builder, OpenDeepLinkingRequestOrBuilder> singleFieldBuilderV3 = this.deepLinkingRequestBuilder_;
                    deepLinkingService.deepLinkingRequest_ = singleFieldBuilderV3 == null ? this.deepLinkingRequest_ : (OpenDeepLinkingRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<OpenDeepLinkingResponse, OpenDeepLinkingResponse.Builder, OpenDeepLinkingResponseOrBuilder> singleFieldBuilderV4 = this.deepLinkingResponseBuilder_;
                    deepLinkingService.deepLinkingResponse_ = singleFieldBuilderV4 == null ? this.deepLinkingResponse_ : (OpenDeepLinkingResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                deepLinkingService.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<OpenDeepLinkingRequest, OpenDeepLinkingRequest.Builder, OpenDeepLinkingRequestOrBuilder> getDeepLinkingRequestFieldBuilder() {
                if (this.deepLinkingRequestBuilder_ == null) {
                    this.deepLinkingRequestBuilder_ = new SingleFieldBuilderV3<>(getDeepLinkingRequest(), getParentForChildren(), isClean());
                    this.deepLinkingRequest_ = null;
                }
                return this.deepLinkingRequestBuilder_;
            }

            private SingleFieldBuilderV3<OpenDeepLinkingResponse, OpenDeepLinkingResponse.Builder, OpenDeepLinkingResponseOrBuilder> getDeepLinkingResponseFieldBuilder() {
                if (this.deepLinkingResponseBuilder_ == null) {
                    this.deepLinkingResponseBuilder_ = new SingleFieldBuilderV3<>(getDeepLinkingResponse(), getParentForChildren(), isClean());
                    this.deepLinkingResponse_ = null;
                }
                return this.deepLinkingResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeepLinkingProto.internal_static_GDI_Proto_DeepLinking_DeepLinkingService_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getDeepLinkingRequestFieldBuilder();
                    getDeepLinkingResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeepLinkingService build() {
                DeepLinkingService deepLinkingServiceBuildPartial = buildPartial();
                if (deepLinkingServiceBuildPartial.isInitialized()) {
                    return deepLinkingServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) deepLinkingServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DeepLinkingService buildPartial() {
                DeepLinkingService deepLinkingService = new DeepLinkingService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(deepLinkingService);
                }
                onBuilt();
                return deepLinkingService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.deepLinkingRequest_ = null;
                SingleFieldBuilderV3<OpenDeepLinkingRequest, OpenDeepLinkingRequest.Builder, OpenDeepLinkingRequestOrBuilder> singleFieldBuilderV3 = this.deepLinkingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deepLinkingRequestBuilder_ = null;
                }
                this.deepLinkingResponse_ = null;
                SingleFieldBuilderV3<OpenDeepLinkingResponse, OpenDeepLinkingResponse.Builder, OpenDeepLinkingResponseOrBuilder> singleFieldBuilderV4 = this.deepLinkingResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.deepLinkingResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearDeepLinkingRequest() {
                this.bitField0_ &= -2;
                this.deepLinkingRequest_ = null;
                SingleFieldBuilderV3<OpenDeepLinkingRequest, OpenDeepLinkingRequest.Builder, OpenDeepLinkingRequestOrBuilder> singleFieldBuilderV3 = this.deepLinkingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deepLinkingRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDeepLinkingResponse() {
                this.bitField0_ &= -3;
                this.deepLinkingResponse_ = null;
                SingleFieldBuilderV3<OpenDeepLinkingResponse, OpenDeepLinkingResponse.Builder, OpenDeepLinkingResponseOrBuilder> singleFieldBuilderV3 = this.deepLinkingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.deepLinkingResponseBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIDeepLinkingProto.DeepLinkingServiceOrBuilder
            public OpenDeepLinkingRequest getDeepLinkingRequest() {
                SingleFieldBuilderV3<OpenDeepLinkingRequest, OpenDeepLinkingRequest.Builder, OpenDeepLinkingRequestOrBuilder> singleFieldBuilderV3 = this.deepLinkingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OpenDeepLinkingRequest) singleFieldBuilderV3.getMessage();
                }
                OpenDeepLinkingRequest openDeepLinkingRequest = this.deepLinkingRequest_;
                return openDeepLinkingRequest == null ? OpenDeepLinkingRequest.getDefaultInstance() : openDeepLinkingRequest;
            }

            public OpenDeepLinkingRequest.Builder getDeepLinkingRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (OpenDeepLinkingRequest.Builder) getDeepLinkingRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDeepLinkingProto.DeepLinkingServiceOrBuilder
            public OpenDeepLinkingRequestOrBuilder getDeepLinkingRequestOrBuilder() {
                SingleFieldBuilderV3<OpenDeepLinkingRequest, OpenDeepLinkingRequest.Builder, OpenDeepLinkingRequestOrBuilder> singleFieldBuilderV3 = this.deepLinkingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OpenDeepLinkingRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                OpenDeepLinkingRequest openDeepLinkingRequest = this.deepLinkingRequest_;
                return openDeepLinkingRequest == null ? OpenDeepLinkingRequest.getDefaultInstance() : openDeepLinkingRequest;
            }

            @Override // com.garmin.proto.generated.GDIDeepLinkingProto.DeepLinkingServiceOrBuilder
            public OpenDeepLinkingResponse getDeepLinkingResponse() {
                SingleFieldBuilderV3<OpenDeepLinkingResponse, OpenDeepLinkingResponse.Builder, OpenDeepLinkingResponseOrBuilder> singleFieldBuilderV3 = this.deepLinkingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OpenDeepLinkingResponse) singleFieldBuilderV3.getMessage();
                }
                OpenDeepLinkingResponse openDeepLinkingResponse = this.deepLinkingResponse_;
                return openDeepLinkingResponse == null ? OpenDeepLinkingResponse.getDefaultInstance() : openDeepLinkingResponse;
            }

            public OpenDeepLinkingResponse.Builder getDeepLinkingResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (OpenDeepLinkingResponse.Builder) getDeepLinkingResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDeepLinkingProto.DeepLinkingServiceOrBuilder
            public OpenDeepLinkingResponseOrBuilder getDeepLinkingResponseOrBuilder() {
                SingleFieldBuilderV3<OpenDeepLinkingResponse, OpenDeepLinkingResponse.Builder, OpenDeepLinkingResponseOrBuilder> singleFieldBuilderV3 = this.deepLinkingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (OpenDeepLinkingResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                OpenDeepLinkingResponse openDeepLinkingResponse = this.deepLinkingResponse_;
                return openDeepLinkingResponse == null ? OpenDeepLinkingResponse.getDefaultInstance() : openDeepLinkingResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDeepLinkingProto.internal_static_GDI_Proto_DeepLinking_DeepLinkingService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDeepLinkingProto.DeepLinkingServiceOrBuilder
            public boolean hasDeepLinkingRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDeepLinkingProto.DeepLinkingServiceOrBuilder
            public boolean hasDeepLinkingResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeepLinkingProto.internal_static_GDI_Proto_DeepLinking_DeepLinkingService_fieldAccessorTable.ensureFieldAccessorsInitialized(DeepLinkingService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeDeepLinkingRequest(OpenDeepLinkingRequest openDeepLinkingRequest) {
                OpenDeepLinkingRequest openDeepLinkingRequest2;
                SingleFieldBuilderV3<OpenDeepLinkingRequest, OpenDeepLinkingRequest.Builder, OpenDeepLinkingRequestOrBuilder> singleFieldBuilderV3 = this.deepLinkingRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(openDeepLinkingRequest);
                } else if ((this.bitField0_ & 1) == 0 || (openDeepLinkingRequest2 = this.deepLinkingRequest_) == null || openDeepLinkingRequest2 == OpenDeepLinkingRequest.getDefaultInstance()) {
                    this.deepLinkingRequest_ = openDeepLinkingRequest;
                } else {
                    getDeepLinkingRequestBuilder().mergeFrom(openDeepLinkingRequest);
                }
                if (this.deepLinkingRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDeepLinkingResponse(OpenDeepLinkingResponse openDeepLinkingResponse) {
                OpenDeepLinkingResponse openDeepLinkingResponse2;
                SingleFieldBuilderV3<OpenDeepLinkingResponse, OpenDeepLinkingResponse.Builder, OpenDeepLinkingResponseOrBuilder> singleFieldBuilderV3 = this.deepLinkingResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(openDeepLinkingResponse);
                } else if ((this.bitField0_ & 2) == 0 || (openDeepLinkingResponse2 = this.deepLinkingResponse_) == null || openDeepLinkingResponse2 == OpenDeepLinkingResponse.getDefaultInstance()) {
                    this.deepLinkingResponse_ = openDeepLinkingResponse;
                } else {
                    getDeepLinkingResponseBuilder().mergeFrom(openDeepLinkingResponse);
                }
                if (this.deepLinkingResponse_ != null) {
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
                                    codedInputStream.readMessage(getDeepLinkingRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getDeepLinkingResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setDeepLinkingRequest(OpenDeepLinkingRequest.Builder builder) {
                SingleFieldBuilderV3<OpenDeepLinkingRequest, OpenDeepLinkingRequest.Builder, OpenDeepLinkingRequestOrBuilder> singleFieldBuilderV3 = this.deepLinkingRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.deepLinkingRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setDeepLinkingResponse(OpenDeepLinkingResponse.Builder builder) {
                SingleFieldBuilderV3<OpenDeepLinkingResponse, OpenDeepLinkingResponse.Builder, OpenDeepLinkingResponseOrBuilder> singleFieldBuilderV3 = this.deepLinkingResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.deepLinkingResponse_ = builder.build();
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
            public DeepLinkingService getDefaultInstanceForType() {
                return DeepLinkingService.getDefaultInstance();
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

            public Builder setDeepLinkingRequest(OpenDeepLinkingRequest openDeepLinkingRequest) {
                SingleFieldBuilderV3<OpenDeepLinkingRequest, OpenDeepLinkingRequest.Builder, OpenDeepLinkingRequestOrBuilder> singleFieldBuilderV3 = this.deepLinkingRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    openDeepLinkingRequest.getClass();
                    this.deepLinkingRequest_ = openDeepLinkingRequest;
                } else {
                    singleFieldBuilderV3.setMessage(openDeepLinkingRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setDeepLinkingResponse(OpenDeepLinkingResponse openDeepLinkingResponse) {
                SingleFieldBuilderV3<OpenDeepLinkingResponse, OpenDeepLinkingResponse.Builder, OpenDeepLinkingResponseOrBuilder> singleFieldBuilderV3 = this.deepLinkingResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    openDeepLinkingResponse.getClass();
                    this.deepLinkingResponse_ = openDeepLinkingResponse;
                } else {
                    singleFieldBuilderV3.setMessage(openDeepLinkingResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DeepLinkingService) {
                    return mergeFrom((DeepLinkingService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DeepLinkingService deepLinkingService) {
                if (deepLinkingService == DeepLinkingService.getDefaultInstance()) {
                    return this;
                }
                if (deepLinkingService.hasDeepLinkingRequest()) {
                    mergeDeepLinkingRequest(deepLinkingService.getDeepLinkingRequest());
                }
                if (deepLinkingService.hasDeepLinkingResponse()) {
                    mergeDeepLinkingResponse(deepLinkingService.getDeepLinkingResponse());
                }
                mergeUnknownFields(deepLinkingService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DeepLinkingService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ DeepLinkingService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private DeepLinkingService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DeepLinkingService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeepLinkingService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeepLinkingService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DeepLinkingService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DeepLinkingService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DeepLinkingService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DeepLinkingService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DeepLinkingService parseFrom(InputStream inputStream) {
            return (DeepLinkingService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DeepLinkingService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeepLinkingService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DeepLinkingService parseFrom(CodedInputStream codedInputStream) {
            return (DeepLinkingService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DeepLinkingService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DeepLinkingService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class OpenDeepLinkingRequest extends GeneratedMessageV3 implements OpenDeepLinkingRequestOrBuilder {
        private static final OpenDeepLinkingRequest DEFAULT_INSTANCE = new OpenDeepLinkingRequest();

        @Deprecated
        public static final Parser<OpenDeepLinkingRequest> PARSER = new AbstractParser<OpenDeepLinkingRequest>() { // from class: com.garmin.proto.generated.GDIDeepLinkingProto.OpenDeepLinkingRequest.1
            @Override // com.google.protobuf.Parser
            public OpenDeepLinkingRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = OpenDeepLinkingRequest.newBuilder();
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
        public static final int SCHEMAS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private LazyStringArrayList schemas_;

        private OpenDeepLinkingRequest() {
            this.schemas_ = LazyStringArrayList.emptyList();
            this.memoizedIsInitialized = (byte) -1;
            this.schemas_ = LazyStringArrayList.emptyList();
        }

        public static OpenDeepLinkingRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeepLinkingProto.internal_static_GDI_Proto_DeepLinking_OpenDeepLinkingRequest_descriptor;
        }

        public static Builder newBuilder(OpenDeepLinkingRequest openDeepLinkingRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(openDeepLinkingRequest);
        }

        public static OpenDeepLinkingRequest parseDelimitedFrom(InputStream inputStream) {
            return (OpenDeepLinkingRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static OpenDeepLinkingRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<OpenDeepLinkingRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OpenDeepLinkingRequest)) {
                return super.equals(obj);
            }
            OpenDeepLinkingRequest openDeepLinkingRequest = (OpenDeepLinkingRequest) obj;
            return getSchemasList().equals(openDeepLinkingRequest.getSchemasList()) && getUnknownFields().equals(openDeepLinkingRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<OpenDeepLinkingRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIDeepLinkingProto.OpenDeepLinkingRequestOrBuilder
        public String getSchemas(int i14) {
            return this.schemas_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIDeepLinkingProto.OpenDeepLinkingRequestOrBuilder
        public ByteString getSchemasBytes(int i14) {
            return this.schemas_.getByteString(i14);
        }

        @Override // com.garmin.proto.generated.GDIDeepLinkingProto.OpenDeepLinkingRequestOrBuilder
        public int getSchemasCount() {
            return this.schemas_.size();
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iD = 0;
            for (int i15 = 0; i15 < this.schemas_.size(); i15++) {
                iD = f3.d(this.schemas_, i15, iD);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + getSchemasList().size() + iD;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getSchemasCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSchemasList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeepLinkingProto.internal_static_GDI_Proto_DeepLinking_OpenDeepLinkingRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(OpenDeepLinkingRequest.class, Builder.class);
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
            return new OpenDeepLinkingRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            int iE = 0;
            while (iE < this.schemas_.size()) {
                iE = f3.e(this.schemas_, iE, codedOutputStream, 1, iE, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OpenDeepLinkingRequestOrBuilder {
            private int bitField0_;
            private LazyStringArrayList schemas_;

            private Builder() {
                this.schemas_ = LazyStringArrayList.emptyList();
            }

            private void buildPartial0(OpenDeepLinkingRequest openDeepLinkingRequest) {
                if ((this.bitField0_ & 1) != 0) {
                    this.schemas_.makeImmutable();
                    openDeepLinkingRequest.schemas_ = this.schemas_;
                }
            }

            private void ensureSchemasIsMutable() {
                if (!this.schemas_.isModifiable()) {
                    this.schemas_ = new LazyStringArrayList((LazyStringList) this.schemas_);
                }
                this.bitField0_ |= 1;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeepLinkingProto.internal_static_GDI_Proto_DeepLinking_OpenDeepLinkingRequest_descriptor;
            }

            public Builder addAllSchemas(Iterable<String> iterable) {
                ensureSchemasIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.schemas_);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addSchemas(String str) {
                str.getClass();
                ensureSchemasIsMutable();
                this.schemas_.add(str);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder addSchemasBytes(ByteString byteString) {
                byteString.getClass();
                ensureSchemasIsMutable();
                this.schemas_.add(byteString);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OpenDeepLinkingRequest build() {
                OpenDeepLinkingRequest openDeepLinkingRequestBuildPartial = buildPartial();
                if (openDeepLinkingRequestBuildPartial.isInitialized()) {
                    return openDeepLinkingRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) openDeepLinkingRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OpenDeepLinkingRequest buildPartial() {
                OpenDeepLinkingRequest openDeepLinkingRequest = new OpenDeepLinkingRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(openDeepLinkingRequest);
                }
                onBuilt();
                return openDeepLinkingRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.schemas_ = LazyStringArrayList.emptyList();
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

            public Builder clearSchemas() {
                this.schemas_ = LazyStringArrayList.emptyList();
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
                return GDIDeepLinkingProto.internal_static_GDI_Proto_DeepLinking_OpenDeepLinkingRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDeepLinkingProto.OpenDeepLinkingRequestOrBuilder
            public String getSchemas(int i14) {
                return this.schemas_.get(i14);
            }

            @Override // com.garmin.proto.generated.GDIDeepLinkingProto.OpenDeepLinkingRequestOrBuilder
            public ByteString getSchemasBytes(int i14) {
                return this.schemas_.getByteString(i14);
            }

            @Override // com.garmin.proto.generated.GDIDeepLinkingProto.OpenDeepLinkingRequestOrBuilder
            public int getSchemasCount() {
                return this.schemas_.size();
            }

            @Override // com.garmin.proto.generated.GDIDeepLinkingProto.OpenDeepLinkingRequestOrBuilder
            public ProtocolStringList getSchemasList() {
                this.schemas_.makeImmutable();
                return this.schemas_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeepLinkingProto.internal_static_GDI_Proto_DeepLinking_OpenDeepLinkingRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(OpenDeepLinkingRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(OpenDeepLinkingRequest openDeepLinkingRequest) {
                if (openDeepLinkingRequest == OpenDeepLinkingRequest.getDefaultInstance()) {
                    return this;
                }
                if (!openDeepLinkingRequest.schemas_.isEmpty()) {
                    if (this.schemas_.isEmpty()) {
                        this.schemas_ = openDeepLinkingRequest.schemas_;
                        this.bitField0_ |= 1;
                    } else {
                        ensureSchemasIsMutable();
                        this.schemas_.addAll(openDeepLinkingRequest.schemas_);
                    }
                    onChanged();
                }
                mergeUnknownFields(openDeepLinkingRequest.getUnknownFields());
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

            public Builder setSchemas(int i14, String str) {
                str.getClass();
                ensureSchemasIsMutable();
                this.schemas_.set(i14, str);
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public OpenDeepLinkingRequest getDefaultInstanceForType() {
                return OpenDeepLinkingRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.schemas_ = LazyStringArrayList.emptyList();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof OpenDeepLinkingRequest) {
                    return mergeFrom((OpenDeepLinkingRequest) message);
                }
                super.mergeFrom(message);
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
                                if (tag != 10) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    ByteString bytes = codedInputStream.readBytes();
                                    ensureSchemasIsMutable();
                                    this.schemas_.add(bytes);
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
        }

        @Override // com.garmin.proto.generated.GDIDeepLinkingProto.OpenDeepLinkingRequestOrBuilder
        public ProtocolStringList getSchemasList() {
            return this.schemas_;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public OpenDeepLinkingRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static OpenDeepLinkingRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OpenDeepLinkingRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static OpenDeepLinkingRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static OpenDeepLinkingRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OpenDeepLinkingRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static OpenDeepLinkingRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static OpenDeepLinkingRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static OpenDeepLinkingRequest parseFrom(InputStream inputStream) {
            return (OpenDeepLinkingRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static OpenDeepLinkingRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OpenDeepLinkingRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static OpenDeepLinkingRequest parseFrom(CodedInputStream codedInputStream) {
            return (OpenDeepLinkingRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private OpenDeepLinkingRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.schemas_ = LazyStringArrayList.emptyList();
            this.memoizedIsInitialized = (byte) -1;
        }

        public static OpenDeepLinkingRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OpenDeepLinkingRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ OpenDeepLinkingRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class OpenDeepLinkingResponse extends GeneratedMessageV3 implements OpenDeepLinkingResponseOrBuilder {
        private static final OpenDeepLinkingResponse DEFAULT_INSTANCE = new OpenDeepLinkingResponse();

        @Deprecated
        public static final Parser<OpenDeepLinkingResponse> PARSER = new AbstractParser<OpenDeepLinkingResponse>() { // from class: com.garmin.proto.generated.GDIDeepLinkingProto.OpenDeepLinkingResponse.1
            @Override // com.google.protobuf.Parser
            public OpenDeepLinkingResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = OpenDeepLinkingResponse.newBuilder();
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
        public static final int USED_SCHEMA_INDEX_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int status_;
        private int usedSchemaIndex_;

        private OpenDeepLinkingResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 1;
            this.usedSchemaIndex_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static OpenDeepLinkingResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDeepLinkingProto.internal_static_GDI_Proto_DeepLinking_OpenDeepLinkingResponse_descriptor;
        }

        public static Builder newBuilder(OpenDeepLinkingResponse openDeepLinkingResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(openDeepLinkingResponse);
        }

        public static OpenDeepLinkingResponse parseDelimitedFrom(InputStream inputStream) {
            return (OpenDeepLinkingResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static OpenDeepLinkingResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<OpenDeepLinkingResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof OpenDeepLinkingResponse)) {
                return super.equals(obj);
            }
            OpenDeepLinkingResponse openDeepLinkingResponse = (OpenDeepLinkingResponse) obj;
            if (hasStatus() != openDeepLinkingResponse.hasStatus()) {
                return false;
            }
            if ((!hasStatus() || this.status_ == openDeepLinkingResponse.status_) && hasUsedSchemaIndex() == openDeepLinkingResponse.hasUsedSchemaIndex()) {
                return (!hasUsedSchemaIndex() || getUsedSchemaIndex() == openDeepLinkingResponse.getUsedSchemaIndex()) && getUnknownFields().equals(openDeepLinkingResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<OpenDeepLinkingResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeInt32Size(2, this.usedSchemaIndex_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDeepLinkingProto.OpenDeepLinkingResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.OK : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIDeepLinkingProto.OpenDeepLinkingResponseOrBuilder
        public int getUsedSchemaIndex() {
            return this.usedSchemaIndex_;
        }

        @Override // com.garmin.proto.generated.GDIDeepLinkingProto.OpenDeepLinkingResponseOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDeepLinkingProto.OpenDeepLinkingResponseOrBuilder
        public boolean hasUsedSchemaIndex() {
            return (this.bitField0_ & 2) != 0;
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
            if (hasUsedSchemaIndex()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getUsedSchemaIndex();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDeepLinkingProto.internal_static_GDI_Proto_DeepLinking_OpenDeepLinkingResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(OpenDeepLinkingResponse.class, Builder.class);
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
            return new OpenDeepLinkingResponse();
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
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeInt32(2, this.usedSchemaIndex_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements OpenDeepLinkingResponseOrBuilder {
            private int bitField0_;
            private int status_;
            private int usedSchemaIndex_;

            private Builder() {
                this.status_ = 1;
            }

            private void buildPartial0(OpenDeepLinkingResponse openDeepLinkingResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    openDeepLinkingResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    openDeepLinkingResponse.usedSchemaIndex_ = this.usedSchemaIndex_;
                    i14 |= 2;
                }
                openDeepLinkingResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDeepLinkingProto.internal_static_GDI_Proto_DeepLinking_OpenDeepLinkingResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OpenDeepLinkingResponse build() {
                OpenDeepLinkingResponse openDeepLinkingResponseBuildPartial = buildPartial();
                if (openDeepLinkingResponseBuildPartial.isInitialized()) {
                    return openDeepLinkingResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) openDeepLinkingResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public OpenDeepLinkingResponse buildPartial() {
                OpenDeepLinkingResponse openDeepLinkingResponse = new OpenDeepLinkingResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(openDeepLinkingResponse);
                }
                onBuilt();
                return openDeepLinkingResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 1;
                this.usedSchemaIndex_ = 0;
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

            public Builder clearUsedSchemaIndex() {
                this.bitField0_ &= -3;
                this.usedSchemaIndex_ = 0;
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
                return GDIDeepLinkingProto.internal_static_GDI_Proto_DeepLinking_OpenDeepLinkingResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDeepLinkingProto.OpenDeepLinkingResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.OK : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIDeepLinkingProto.OpenDeepLinkingResponseOrBuilder
            public int getUsedSchemaIndex() {
                return this.usedSchemaIndex_;
            }

            @Override // com.garmin.proto.generated.GDIDeepLinkingProto.OpenDeepLinkingResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDeepLinkingProto.OpenDeepLinkingResponseOrBuilder
            public boolean hasUsedSchemaIndex() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDeepLinkingProto.internal_static_GDI_Proto_DeepLinking_OpenDeepLinkingResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(OpenDeepLinkingResponse.class, Builder.class);
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
                                    if (ResponseStatus.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    this.usedSchemaIndex_ = codedInputStream.readInt32();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStatus(ResponseStatus responseStatus) {
                responseStatus.getClass();
                this.bitField0_ |= 1;
                this.status_ = responseStatus.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            public Builder setUsedSchemaIndex(int i14) {
                this.usedSchemaIndex_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public OpenDeepLinkingResponse getDefaultInstanceForType() {
                return OpenDeepLinkingResponse.getDefaultInstance();
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
                if (message instanceof OpenDeepLinkingResponse) {
                    return mergeFrom((OpenDeepLinkingResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(OpenDeepLinkingResponse openDeepLinkingResponse) {
                if (openDeepLinkingResponse == OpenDeepLinkingResponse.getDefaultInstance()) {
                    return this;
                }
                if (openDeepLinkingResponse.hasStatus()) {
                    setStatus(openDeepLinkingResponse.getStatus());
                }
                if (openDeepLinkingResponse.hasUsedSchemaIndex()) {
                    setUsedSchemaIndex(openDeepLinkingResponse.getUsedSchemaIndex());
                }
                mergeUnknownFields(openDeepLinkingResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public OpenDeepLinkingResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static OpenDeepLinkingResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OpenDeepLinkingResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static OpenDeepLinkingResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static OpenDeepLinkingResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static OpenDeepLinkingResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static OpenDeepLinkingResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ OpenDeepLinkingResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static OpenDeepLinkingResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private OpenDeepLinkingResponse() {
            this.usedSchemaIndex_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 1;
        }

        public static OpenDeepLinkingResponse parseFrom(InputStream inputStream) {
            return (OpenDeepLinkingResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static OpenDeepLinkingResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OpenDeepLinkingResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static OpenDeepLinkingResponse parseFrom(CodedInputStream codedInputStream) {
            return (OpenDeepLinkingResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static OpenDeepLinkingResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OpenDeepLinkingResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ResponseStatus implements ProtocolMessageEnum {
            OK(1),
            UNHANDLED(2),
            UNKNOWN_ERROR(3);

            public static final int OK_VALUE = 1;
            public static final int UNHANDLED_VALUE = 2;
            public static final int UNKNOWN_ERROR_VALUE = 3;
            private final int value;
            private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIDeepLinkingProto.OpenDeepLinkingResponse.ResponseStatus.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ResponseStatus findValueByNumber(int i14) {
                    return ResponseStatus.forNumber(i14);
                }
            };
            private static final ResponseStatus[] VALUES = values();

            ResponseStatus(int i14) {
                this.value = i14;
            }

            public static ResponseStatus forNumber(int i14) {
                if (i14 == 1) {
                    return OK;
                }
                if (i14 == 2) {
                    return UNHANDLED;
                }
                if (i14 != 3) {
                    return null;
                }
                return UNKNOWN_ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return OpenDeepLinkingResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ResponseStatus> internalGetValueMap() {
                return internalValueMap;
            }

            public static ResponseStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ResponseStatus valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
