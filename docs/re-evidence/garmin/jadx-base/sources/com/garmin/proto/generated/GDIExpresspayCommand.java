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

/* JADX INFO: loaded from: classes4.dex */
public final class GDIExpresspayCommand {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001aGDIExpresspayCommand.proto\u0012\u001bGDI.Proto.ExpresspayCommand\"\u009e\u0001\n\u0018ExpresspayCommandService\u0012?\n\u0007request\u0018\u0001 \u0001(\u000b2..GDI.Proto.ExpresspayCommand.ExpresspayRequest\u0012A\n\bresponse\u0018\u0002 \u0001(\u000b2/.GDI.Proto.ExpresspayCommand.ExpresspayResponse\"\u0084\u0002\n\u0011ExpresspayRequest\u0012Y\n\u000eControlCommand\u0018\u0001 \u0001(\u000e2A.GDI.Proto.ExpresspayCommand.ExpresspayRequest.ControlCommandType\u0012\u0017\n\u000fAPDUCommandData\u0018\u0002 \u0001(\f\"{\n\u0012ControlCommandType\u0012 \n\u001cUNKNOWN_CONTROL_COMMAND_TYPE\u0010\u0000\u0012\u0010\n\fAPDU_COMMAND\u0010\u0001\u0012\u000b\n\u0007CONNECT\u0010\u0002\u0012\u000e\n\nDISCONNECT\u0010\u0003\u0012\t\n\u0005RESET\u0010\u0004\u0012\t\n\u0005QUREY\u0010\u0005\"\"\n\u0012ExpresspayResponse\u0012\f\n\u0004Data\u0018\u0001 \u0002(\fB4\n\u001acom.garmin.proto.generatedB\u0014GDIExpresspayCommandH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ExpresspayCommand_ExpresspayCommandService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ExpresspayCommand_ExpresspayCommandService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ExpresspayCommand_ExpresspayRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ExpresspayCommand_ExpresspayRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_ExpresspayCommand_ExpresspayResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_ExpresspayCommand_ExpresspayResponse_fieldAccessorTable;

    public interface ExpresspayCommandServiceOrBuilder extends MessageOrBuilder {
        ExpresspayRequest getRequest();

        ExpresspayRequestOrBuilder getRequestOrBuilder();

        ExpresspayResponse getResponse();

        ExpresspayResponseOrBuilder getResponseOrBuilder();

        boolean hasRequest();

        boolean hasResponse();
    }

    public interface ExpresspayRequestOrBuilder extends MessageOrBuilder {
        ByteString getAPDUCommandData();

        ExpresspayRequest.ControlCommandType getControlCommand();

        boolean hasAPDUCommandData();

        boolean hasControlCommand();
    }

    public interface ExpresspayResponseOrBuilder extends MessageOrBuilder {
        ByteString getData();

        boolean hasData();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_ExpresspayCommand_ExpresspayCommandService_descriptor = descriptor2;
        internal_static_GDI_Proto_ExpresspayCommand_ExpresspayCommandService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Request", "Response"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_ExpresspayCommand_ExpresspayRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_ExpresspayCommand_ExpresspayRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"ControlCommand", "APDUCommandData"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_ExpresspayCommand_ExpresspayResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_ExpresspayCommand_ExpresspayResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Data"});
    }

    private GDIExpresspayCommand() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class ExpresspayCommandService extends GeneratedMessageV3 implements ExpresspayCommandServiceOrBuilder {
        private static final ExpresspayCommandService DEFAULT_INSTANCE = new ExpresspayCommandService();

        @Deprecated
        public static final Parser<ExpresspayCommandService> PARSER = new AbstractParser<ExpresspayCommandService>() { // from class: com.garmin.proto.generated.GDIExpresspayCommand.ExpresspayCommandService.1
            @Override // com.google.protobuf.Parser
            public ExpresspayCommandService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ExpresspayCommandService.newBuilder();
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
        public static final int REQUEST_FIELD_NUMBER = 1;
        public static final int RESPONSE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private ExpresspayRequest request_;
        private ExpresspayResponse response_;

        private ExpresspayCommandService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ExpresspayCommandService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIExpresspayCommand.internal_static_GDI_Proto_ExpresspayCommand_ExpresspayCommandService_descriptor;
        }

        public static Builder newBuilder(ExpresspayCommandService expresspayCommandService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(expresspayCommandService);
        }

        public static ExpresspayCommandService parseDelimitedFrom(InputStream inputStream) {
            return (ExpresspayCommandService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ExpresspayCommandService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ExpresspayCommandService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ExpresspayCommandService)) {
                return super.equals(obj);
            }
            ExpresspayCommandService expresspayCommandService = (ExpresspayCommandService) obj;
            if (hasRequest() != expresspayCommandService.hasRequest()) {
                return false;
            }
            if ((!hasRequest() || getRequest().equals(expresspayCommandService.getRequest())) && hasResponse() == expresspayCommandService.hasResponse()) {
                return (!hasResponse() || getResponse().equals(expresspayCommandService.getResponse())) && getUnknownFields().equals(expresspayCommandService.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ExpresspayCommandService> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIExpresspayCommand.ExpresspayCommandServiceOrBuilder
        public ExpresspayRequest getRequest() {
            ExpresspayRequest expresspayRequest = this.request_;
            return expresspayRequest == null ? ExpresspayRequest.getDefaultInstance() : expresspayRequest;
        }

        @Override // com.garmin.proto.generated.GDIExpresspayCommand.ExpresspayCommandServiceOrBuilder
        public ExpresspayRequestOrBuilder getRequestOrBuilder() {
            ExpresspayRequest expresspayRequest = this.request_;
            return expresspayRequest == null ? ExpresspayRequest.getDefaultInstance() : expresspayRequest;
        }

        @Override // com.garmin.proto.generated.GDIExpresspayCommand.ExpresspayCommandServiceOrBuilder
        public ExpresspayResponse getResponse() {
            ExpresspayResponse expresspayResponse = this.response_;
            return expresspayResponse == null ? ExpresspayResponse.getDefaultInstance() : expresspayResponse;
        }

        @Override // com.garmin.proto.generated.GDIExpresspayCommand.ExpresspayCommandServiceOrBuilder
        public ExpresspayResponseOrBuilder getResponseOrBuilder() {
            ExpresspayResponse expresspayResponse = this.response_;
            return expresspayResponse == null ? ExpresspayResponse.getDefaultInstance() : expresspayResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIExpresspayCommand.ExpresspayCommandServiceOrBuilder
        public boolean hasRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIExpresspayCommand.ExpresspayCommandServiceOrBuilder
        public boolean hasResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getRequest().hashCode();
            }
            if (hasResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIExpresspayCommand.internal_static_GDI_Proto_ExpresspayCommand_ExpresspayCommandService_fieldAccessorTable.ensureFieldAccessorsInitialized(ExpresspayCommandService.class, Builder.class);
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
            if (!hasResponse() || getResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new ExpresspayCommandService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ExpresspayCommandServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ExpresspayRequest, ExpresspayRequest.Builder, ExpresspayRequestOrBuilder> requestBuilder_;
            private ExpresspayRequest request_;
            private SingleFieldBuilderV3<ExpresspayResponse, ExpresspayResponse.Builder, ExpresspayResponseOrBuilder> responseBuilder_;
            private ExpresspayResponse response_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ExpresspayCommandService expresspayCommandService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<ExpresspayRequest, ExpresspayRequest.Builder, ExpresspayRequestOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
                    expresspayCommandService.request_ = singleFieldBuilderV3 == null ? this.request_ : (ExpresspayRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<ExpresspayResponse, ExpresspayResponse.Builder, ExpresspayResponseOrBuilder> singleFieldBuilderV4 = this.responseBuilder_;
                    expresspayCommandService.response_ = singleFieldBuilderV4 == null ? this.response_ : (ExpresspayResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                expresspayCommandService.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIExpresspayCommand.internal_static_GDI_Proto_ExpresspayCommand_ExpresspayCommandService_descriptor;
            }

            private SingleFieldBuilderV3<ExpresspayRequest, ExpresspayRequest.Builder, ExpresspayRequestOrBuilder> getRequestFieldBuilder() {
                if (this.requestBuilder_ == null) {
                    this.requestBuilder_ = new SingleFieldBuilderV3<>(getRequest(), getParentForChildren(), isClean());
                    this.request_ = null;
                }
                return this.requestBuilder_;
            }

            private SingleFieldBuilderV3<ExpresspayResponse, ExpresspayResponse.Builder, ExpresspayResponseOrBuilder> getResponseFieldBuilder() {
                if (this.responseBuilder_ == null) {
                    this.responseBuilder_ = new SingleFieldBuilderV3<>(getResponse(), getParentForChildren(), isClean());
                    this.response_ = null;
                }
                return this.responseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getRequestFieldBuilder();
                    getResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ExpresspayCommandService build() {
                ExpresspayCommandService expresspayCommandServiceBuildPartial = buildPartial();
                if (expresspayCommandServiceBuildPartial.isInitialized()) {
                    return expresspayCommandServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) expresspayCommandServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ExpresspayCommandService buildPartial() {
                ExpresspayCommandService expresspayCommandService = new ExpresspayCommandService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(expresspayCommandService);
                }
                onBuilt();
                return expresspayCommandService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.request_ = null;
                SingleFieldBuilderV3<ExpresspayRequest, ExpresspayRequest.Builder, ExpresspayRequestOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.requestBuilder_ = null;
                }
                this.response_ = null;
                SingleFieldBuilderV3<ExpresspayResponse, ExpresspayResponse.Builder, ExpresspayResponseOrBuilder> singleFieldBuilderV4 = this.responseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.responseBuilder_ = null;
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

            public Builder clearRequest() {
                this.bitField0_ &= -2;
                this.request_ = null;
                SingleFieldBuilderV3<ExpresspayRequest, ExpresspayRequest.Builder, ExpresspayRequestOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.requestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearResponse() {
                this.bitField0_ &= -3;
                this.response_ = null;
                SingleFieldBuilderV3<ExpresspayResponse, ExpresspayResponse.Builder, ExpresspayResponseOrBuilder> singleFieldBuilderV3 = this.responseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.responseBuilder_ = null;
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
                return GDIExpresspayCommand.internal_static_GDI_Proto_ExpresspayCommand_ExpresspayCommandService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIExpresspayCommand.ExpresspayCommandServiceOrBuilder
            public ExpresspayRequest getRequest() {
                SingleFieldBuilderV3<ExpresspayRequest, ExpresspayRequest.Builder, ExpresspayRequestOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ExpresspayRequest) singleFieldBuilderV3.getMessage();
                }
                ExpresspayRequest expresspayRequest = this.request_;
                return expresspayRequest == null ? ExpresspayRequest.getDefaultInstance() : expresspayRequest;
            }

            public ExpresspayRequest.Builder getRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ExpresspayRequest.Builder) getRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIExpresspayCommand.ExpresspayCommandServiceOrBuilder
            public ExpresspayRequestOrBuilder getRequestOrBuilder() {
                SingleFieldBuilderV3<ExpresspayRequest, ExpresspayRequest.Builder, ExpresspayRequestOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ExpresspayRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ExpresspayRequest expresspayRequest = this.request_;
                return expresspayRequest == null ? ExpresspayRequest.getDefaultInstance() : expresspayRequest;
            }

            @Override // com.garmin.proto.generated.GDIExpresspayCommand.ExpresspayCommandServiceOrBuilder
            public ExpresspayResponse getResponse() {
                SingleFieldBuilderV3<ExpresspayResponse, ExpresspayResponse.Builder, ExpresspayResponseOrBuilder> singleFieldBuilderV3 = this.responseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ExpresspayResponse) singleFieldBuilderV3.getMessage();
                }
                ExpresspayResponse expresspayResponse = this.response_;
                return expresspayResponse == null ? ExpresspayResponse.getDefaultInstance() : expresspayResponse;
            }

            public ExpresspayResponse.Builder getResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ExpresspayResponse.Builder) getResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIExpresspayCommand.ExpresspayCommandServiceOrBuilder
            public ExpresspayResponseOrBuilder getResponseOrBuilder() {
                SingleFieldBuilderV3<ExpresspayResponse, ExpresspayResponse.Builder, ExpresspayResponseOrBuilder> singleFieldBuilderV3 = this.responseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ExpresspayResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ExpresspayResponse expresspayResponse = this.response_;
                return expresspayResponse == null ? ExpresspayResponse.getDefaultInstance() : expresspayResponse;
            }

            @Override // com.garmin.proto.generated.GDIExpresspayCommand.ExpresspayCommandServiceOrBuilder
            public boolean hasRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIExpresspayCommand.ExpresspayCommandServiceOrBuilder
            public boolean hasResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIExpresspayCommand.internal_static_GDI_Proto_ExpresspayCommand_ExpresspayCommandService_fieldAccessorTable.ensureFieldAccessorsInitialized(ExpresspayCommandService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasResponse() || getResponse().isInitialized();
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
                                    codedInputStream.readMessage(getRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeRequest(ExpresspayRequest expresspayRequest) {
                ExpresspayRequest expresspayRequest2;
                SingleFieldBuilderV3<ExpresspayRequest, ExpresspayRequest.Builder, ExpresspayRequestOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(expresspayRequest);
                } else if ((this.bitField0_ & 1) == 0 || (expresspayRequest2 = this.request_) == null || expresspayRequest2 == ExpresspayRequest.getDefaultInstance()) {
                    this.request_ = expresspayRequest;
                } else {
                    getRequestBuilder().mergeFrom(expresspayRequest);
                }
                if (this.request_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeResponse(ExpresspayResponse expresspayResponse) {
                ExpresspayResponse expresspayResponse2;
                SingleFieldBuilderV3<ExpresspayResponse, ExpresspayResponse.Builder, ExpresspayResponseOrBuilder> singleFieldBuilderV3 = this.responseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(expresspayResponse);
                } else if ((this.bitField0_ & 2) == 0 || (expresspayResponse2 = this.response_) == null || expresspayResponse2 == ExpresspayResponse.getDefaultInstance()) {
                    this.response_ = expresspayResponse;
                } else {
                    getResponseBuilder().mergeFrom(expresspayResponse);
                }
                if (this.response_ != null) {
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

            public Builder setRequest(ExpresspayRequest.Builder builder) {
                SingleFieldBuilderV3<ExpresspayRequest, ExpresspayRequest.Builder, ExpresspayRequestOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.request_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setResponse(ExpresspayResponse.Builder builder) {
                SingleFieldBuilderV3<ExpresspayResponse, ExpresspayResponse.Builder, ExpresspayResponseOrBuilder> singleFieldBuilderV3 = this.responseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.response_ = builder.build();
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
            public ExpresspayCommandService getDefaultInstanceForType() {
                return ExpresspayCommandService.getDefaultInstance();
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

            public Builder setRequest(ExpresspayRequest expresspayRequest) {
                SingleFieldBuilderV3<ExpresspayRequest, ExpresspayRequest.Builder, ExpresspayRequestOrBuilder> singleFieldBuilderV3 = this.requestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    expresspayRequest.getClass();
                    this.request_ = expresspayRequest;
                } else {
                    singleFieldBuilderV3.setMessage(expresspayRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setResponse(ExpresspayResponse expresspayResponse) {
                SingleFieldBuilderV3<ExpresspayResponse, ExpresspayResponse.Builder, ExpresspayResponseOrBuilder> singleFieldBuilderV3 = this.responseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    expresspayResponse.getClass();
                    this.response_ = expresspayResponse;
                } else {
                    singleFieldBuilderV3.setMessage(expresspayResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ExpresspayCommandService) {
                    return mergeFrom((ExpresspayCommandService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ExpresspayCommandService expresspayCommandService) {
                if (expresspayCommandService == ExpresspayCommandService.getDefaultInstance()) {
                    return this;
                }
                if (expresspayCommandService.hasRequest()) {
                    mergeRequest(expresspayCommandService.getRequest());
                }
                if (expresspayCommandService.hasResponse()) {
                    mergeResponse(expresspayCommandService.getResponse());
                }
                mergeUnknownFields(expresspayCommandService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ExpresspayCommandService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ExpresspayCommandService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ExpresspayCommandService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ExpresspayCommandService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ExpresspayCommandService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ExpresspayCommandService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ExpresspayCommandService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ExpresspayCommandService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ExpresspayCommandService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ExpresspayCommandService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ExpresspayCommandService parseFrom(InputStream inputStream) {
            return (ExpresspayCommandService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ExpresspayCommandService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ExpresspayCommandService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ExpresspayCommandService parseFrom(CodedInputStream codedInputStream) {
            return (ExpresspayCommandService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ExpresspayCommandService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ExpresspayCommandService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ExpresspayRequest extends GeneratedMessageV3 implements ExpresspayRequestOrBuilder {
        public static final int APDUCOMMANDDATA_FIELD_NUMBER = 2;
        public static final int CONTROLCOMMAND_FIELD_NUMBER = 1;
        private static final ExpresspayRequest DEFAULT_INSTANCE = new ExpresspayRequest();

        @Deprecated
        public static final Parser<ExpresspayRequest> PARSER = new AbstractParser<ExpresspayRequest>() { // from class: com.garmin.proto.generated.GDIExpresspayCommand.ExpresspayRequest.1
            @Override // com.google.protobuf.Parser
            public ExpresspayRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ExpresspayRequest.newBuilder();
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
        private ByteString aPDUCommandData_;
        private int bitField0_;
        private int controlCommand_;
        private byte memoizedIsInitialized;

        private ExpresspayRequest() {
            this.controlCommand_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.controlCommand_ = 0;
            this.aPDUCommandData_ = byteString;
        }

        public static ExpresspayRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIExpresspayCommand.internal_static_GDI_Proto_ExpresspayCommand_ExpresspayRequest_descriptor;
        }

        public static Builder newBuilder(ExpresspayRequest expresspayRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(expresspayRequest);
        }

        public static ExpresspayRequest parseDelimitedFrom(InputStream inputStream) {
            return (ExpresspayRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ExpresspayRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ExpresspayRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ExpresspayRequest)) {
                return super.equals(obj);
            }
            ExpresspayRequest expresspayRequest = (ExpresspayRequest) obj;
            if (hasControlCommand() != expresspayRequest.hasControlCommand()) {
                return false;
            }
            if ((!hasControlCommand() || this.controlCommand_ == expresspayRequest.controlCommand_) && hasAPDUCommandData() == expresspayRequest.hasAPDUCommandData()) {
                return (!hasAPDUCommandData() || getAPDUCommandData().equals(expresspayRequest.getAPDUCommandData())) && getUnknownFields().equals(expresspayRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIExpresspayCommand.ExpresspayRequestOrBuilder
        public ByteString getAPDUCommandData() {
            return this.aPDUCommandData_;
        }

        @Override // com.garmin.proto.generated.GDIExpresspayCommand.ExpresspayRequestOrBuilder
        public ControlCommandType getControlCommand() {
            ControlCommandType controlCommandTypeForNumber = ControlCommandType.forNumber(this.controlCommand_);
            return controlCommandTypeForNumber == null ? ControlCommandType.UNKNOWN_CONTROL_COMMAND_TYPE : controlCommandTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ExpresspayRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.controlCommand_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBytesSize(2, this.aPDUCommandData_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIExpresspayCommand.ExpresspayRequestOrBuilder
        public boolean hasAPDUCommandData() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIExpresspayCommand.ExpresspayRequestOrBuilder
        public boolean hasControlCommand() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasControlCommand()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.controlCommand_;
            }
            if (hasAPDUCommandData()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getAPDUCommandData().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIExpresspayCommand.internal_static_GDI_Proto_ExpresspayCommand_ExpresspayRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ExpresspayRequest.class, Builder.class);
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
            return new ExpresspayRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.controlCommand_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBytes(2, this.aPDUCommandData_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ExpresspayRequestOrBuilder {
            private ByteString aPDUCommandData_;
            private int bitField0_;
            private int controlCommand_;

            private Builder() {
                this.controlCommand_ = 0;
                this.aPDUCommandData_ = ByteString.EMPTY;
            }

            private void buildPartial0(ExpresspayRequest expresspayRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    expresspayRequest.controlCommand_ = this.controlCommand_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    expresspayRequest.aPDUCommandData_ = this.aPDUCommandData_;
                    i14 |= 2;
                }
                expresspayRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIExpresspayCommand.internal_static_GDI_Proto_ExpresspayCommand_ExpresspayRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ExpresspayRequest build() {
                ExpresspayRequest expresspayRequestBuildPartial = buildPartial();
                if (expresspayRequestBuildPartial.isInitialized()) {
                    return expresspayRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) expresspayRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ExpresspayRequest buildPartial() {
                ExpresspayRequest expresspayRequest = new ExpresspayRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(expresspayRequest);
                }
                onBuilt();
                return expresspayRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.controlCommand_ = 0;
                this.aPDUCommandData_ = ByteString.EMPTY;
                return this;
            }

            public Builder clearAPDUCommandData() {
                this.bitField0_ &= -3;
                this.aPDUCommandData_ = ExpresspayRequest.getDefaultInstance().getAPDUCommandData();
                onChanged();
                return this;
            }

            public Builder clearControlCommand() {
                this.bitField0_ &= -2;
                this.controlCommand_ = 0;
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

            @Override // com.garmin.proto.generated.GDIExpresspayCommand.ExpresspayRequestOrBuilder
            public ByteString getAPDUCommandData() {
                return this.aPDUCommandData_;
            }

            @Override // com.garmin.proto.generated.GDIExpresspayCommand.ExpresspayRequestOrBuilder
            public ControlCommandType getControlCommand() {
                ControlCommandType controlCommandTypeForNumber = ControlCommandType.forNumber(this.controlCommand_);
                return controlCommandTypeForNumber == null ? ControlCommandType.UNKNOWN_CONTROL_COMMAND_TYPE : controlCommandTypeForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIExpresspayCommand.internal_static_GDI_Proto_ExpresspayCommand_ExpresspayRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIExpresspayCommand.ExpresspayRequestOrBuilder
            public boolean hasAPDUCommandData() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIExpresspayCommand.ExpresspayRequestOrBuilder
            public boolean hasControlCommand() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIExpresspayCommand.internal_static_GDI_Proto_ExpresspayCommand_ExpresspayRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ExpresspayRequest.class, Builder.class);
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
                                    if (ControlCommandType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.controlCommand_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    this.aPDUCommandData_ = codedInputStream.readBytes();
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

            public Builder setAPDUCommandData(ByteString byteString) {
                byteString.getClass();
                this.aPDUCommandData_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setControlCommand(ControlCommandType controlCommandType) {
                controlCommandType.getClass();
                this.bitField0_ |= 1;
                this.controlCommand_ = controlCommandType.getNumber();
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
            public ExpresspayRequest getDefaultInstanceForType() {
                return ExpresspayRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.controlCommand_ = 0;
                this.aPDUCommandData_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ExpresspayRequest) {
                    return mergeFrom((ExpresspayRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ExpresspayRequest expresspayRequest) {
                if (expresspayRequest == ExpresspayRequest.getDefaultInstance()) {
                    return this;
                }
                if (expresspayRequest.hasControlCommand()) {
                    setControlCommand(expresspayRequest.getControlCommand());
                }
                if (expresspayRequest.hasAPDUCommandData()) {
                    setAPDUCommandData(expresspayRequest.getAPDUCommandData());
                }
                mergeUnknownFields(expresspayRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ExpresspayRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ExpresspayRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ExpresspayRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ExpresspayRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ExpresspayRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ExpresspayRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ExpresspayRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ExpresspayRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ExpresspayRequest parseFrom(InputStream inputStream) {
            return (ExpresspayRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private ExpresspayRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.controlCommand_ = 0;
            this.aPDUCommandData_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ExpresspayRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ExpresspayRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ExpresspayRequest parseFrom(CodedInputStream codedInputStream) {
            return (ExpresspayRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public /* synthetic */ ExpresspayRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ExpresspayRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ExpresspayRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ControlCommandType implements ProtocolMessageEnum {
            UNKNOWN_CONTROL_COMMAND_TYPE(0),
            APDU_COMMAND(1),
            CONNECT(2),
            DISCONNECT(3),
            RESET(4),
            QUREY(5);

            public static final int APDU_COMMAND_VALUE = 1;
            public static final int CONNECT_VALUE = 2;
            public static final int DISCONNECT_VALUE = 3;
            public static final int QUREY_VALUE = 5;
            public static final int RESET_VALUE = 4;
            public static final int UNKNOWN_CONTROL_COMMAND_TYPE_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<ControlCommandType> internalValueMap = new Internal.EnumLiteMap<ControlCommandType>() { // from class: com.garmin.proto.generated.GDIExpresspayCommand.ExpresspayRequest.ControlCommandType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ControlCommandType findValueByNumber(int i14) {
                    return ControlCommandType.forNumber(i14);
                }
            };
            private static final ControlCommandType[] VALUES = values();

            ControlCommandType(int i14) {
                this.value = i14;
            }

            public static ControlCommandType forNumber(int i14) {
                if (i14 == 0) {
                    return UNKNOWN_CONTROL_COMMAND_TYPE;
                }
                if (i14 == 1) {
                    return APDU_COMMAND;
                }
                if (i14 == 2) {
                    return CONNECT;
                }
                if (i14 == 3) {
                    return DISCONNECT;
                }
                if (i14 == 4) {
                    return RESET;
                }
                if (i14 != 5) {
                    return null;
                }
                return QUREY;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ExpresspayRequest.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<ControlCommandType> internalGetValueMap() {
                return internalValueMap;
            }

            public static ControlCommandType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ControlCommandType valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class ExpresspayResponse extends GeneratedMessageV3 implements ExpresspayResponseOrBuilder {
        public static final int DATA_FIELD_NUMBER = 1;
        private static final ExpresspayResponse DEFAULT_INSTANCE = new ExpresspayResponse();

        @Deprecated
        public static final Parser<ExpresspayResponse> PARSER = new AbstractParser<ExpresspayResponse>() { // from class: com.garmin.proto.generated.GDIExpresspayCommand.ExpresspayResponse.1
            @Override // com.google.protobuf.Parser
            public ExpresspayResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ExpresspayResponse.newBuilder();
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
        private ByteString data_;
        private byte memoizedIsInitialized;

        private ExpresspayResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.data_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ExpresspayResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIExpresspayCommand.internal_static_GDI_Proto_ExpresspayCommand_ExpresspayResponse_descriptor;
        }

        public static Builder newBuilder(ExpresspayResponse expresspayResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(expresspayResponse);
        }

        public static ExpresspayResponse parseDelimitedFrom(InputStream inputStream) {
            return (ExpresspayResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ExpresspayResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ExpresspayResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ExpresspayResponse)) {
                return super.equals(obj);
            }
            ExpresspayResponse expresspayResponse = (ExpresspayResponse) obj;
            if (hasData() != expresspayResponse.hasData()) {
                return false;
            }
            return (!hasData() || getData().equals(expresspayResponse.getData())) && getUnknownFields().equals(expresspayResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIExpresspayCommand.ExpresspayResponseOrBuilder
        public ByteString getData() {
            return this.data_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ExpresspayResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.data_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIExpresspayCommand.ExpresspayResponseOrBuilder
        public boolean hasData() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasData()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getData().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIExpresspayCommand.internal_static_GDI_Proto_ExpresspayCommand_ExpresspayResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ExpresspayResponse.class, Builder.class);
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
            if (hasData()) {
                this.memoizedIsInitialized = (byte) 1;
                return true;
            }
            this.memoizedIsInitialized = (byte) 0;
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
            return new Builder(builderParent, 0);
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public Object newInstance(GeneratedMessageV3.UnusedPrivateParameter unusedPrivateParameter) {
            return new ExpresspayResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.data_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ExpresspayResponseOrBuilder {
            private int bitField0_;
            private ByteString data_;

            private Builder() {
                this.data_ = ByteString.EMPTY;
            }

            private void buildPartial0(ExpresspayResponse expresspayResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    expresspayResponse.data_ = this.data_;
                } else {
                    i14 = 0;
                }
                expresspayResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIExpresspayCommand.internal_static_GDI_Proto_ExpresspayCommand_ExpresspayResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ExpresspayResponse build() {
                ExpresspayResponse expresspayResponseBuildPartial = buildPartial();
                if (expresspayResponseBuildPartial.isInitialized()) {
                    return expresspayResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) expresspayResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ExpresspayResponse buildPartial() {
                ExpresspayResponse expresspayResponse = new ExpresspayResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(expresspayResponse);
                }
                onBuilt();
                return expresspayResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.data_ = ByteString.EMPTY;
                return this;
            }

            public Builder clearData() {
                this.bitField0_ &= -2;
                this.data_ = ExpresspayResponse.getDefaultInstance().getData();
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

            @Override // com.garmin.proto.generated.GDIExpresspayCommand.ExpresspayResponseOrBuilder
            public ByteString getData() {
                return this.data_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIExpresspayCommand.internal_static_GDI_Proto_ExpresspayCommand_ExpresspayResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIExpresspayCommand.ExpresspayResponseOrBuilder
            public boolean hasData() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIExpresspayCommand.internal_static_GDI_Proto_ExpresspayCommand_ExpresspayResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ExpresspayResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasData();
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
                                    this.data_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
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

            public Builder setData(ByteString byteString) {
                byteString.getClass();
                this.data_ = byteString;
                this.bitField0_ |= 1;
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
            public ExpresspayResponse getDefaultInstanceForType() {
                return ExpresspayResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.data_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ExpresspayResponse) {
                    return mergeFrom((ExpresspayResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ExpresspayResponse expresspayResponse) {
                if (expresspayResponse == ExpresspayResponse.getDefaultInstance()) {
                    return this;
                }
                if (expresspayResponse.hasData()) {
                    setData(expresspayResponse.getData());
                }
                mergeUnknownFields(expresspayResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ExpresspayResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ExpresspayResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ExpresspayResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ExpresspayResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ExpresspayResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public /* synthetic */ ExpresspayResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ExpresspayResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private ExpresspayResponse() {
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.data_ = byteString;
        }

        public static ExpresspayResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ExpresspayResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ExpresspayResponse parseFrom(InputStream inputStream) {
            return (ExpresspayResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ExpresspayResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ExpresspayResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ExpresspayResponse parseFrom(CodedInputStream codedInputStream) {
            return (ExpresspayResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ExpresspayResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ExpresspayResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
