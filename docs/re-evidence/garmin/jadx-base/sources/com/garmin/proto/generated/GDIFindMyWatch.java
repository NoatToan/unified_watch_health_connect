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
public final class GDIFindMyWatch {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0014GDIFindMyWatch.proto\u0012\u0015GDI.Proto.FindMyWatch\")\n\u0012FindMyWatchRequest\u0012\u0013\n\u0007timeout\u0018\u0001 \u0001(\u0005:\u000260\"L\n\u0013FindMyWatchResponse\u00125\n\u0006status\u0018\u0001 \u0001(\u000e2%.GDI.Proto.FindMyWatch.ResponseStatus\"\u001a\n\u0018FindMyWatchCancelRequest\"R\n\u0019FindMyWatchCancelResponse\u00125\n\u0006status\u0018\u0001 \u0001(\u000e2%.GDI.Proto.FindMyWatch.ResponseStatus\"¦\u0002\n\u0012FindMyWatchService\u0012?\n\ffind_request\u0018\u0001 \u0001(\u000b2).GDI.Proto.FindMyWatch.FindMyWatchRequest\u0012A\n\rfind_response\u0018\u0002 \u0001(\u000b2*.GDI.Proto.FindMyWatch.FindMyWatchResponse\u0012G\n\u000ecancel_request\u0018\u0003 \u0001(\u000b2/.GDI.Proto.FindMyWatch.FindMyWatchCancelRequest\u0012C\n\u000fcancel_response\u0018\u0004 \u0001(\u000b2*.GDI.Proto.FindMyWatch.FindMyWatchResponse*A\n\u000eResponseStatus\u0012\u001b\n\u0017UNKNOWN_RESPONSE_STATUS\u0010\u0000\u0012\u0006\n\u0002OK\u0010d\u0012\n\n\u0005ERROR\u0010È\u0001B.\n\u001acom.garmin.proto.generatedB\u000eGDIFindMyWatchH\u0003"}, new Descriptors.FileDescriptor[0]);
    private static final Descriptors.Descriptor internal_static_GDI_Proto_FindMyWatch_FindMyWatchCancelRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_FindMyWatch_FindMyWatchCancelRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_FindMyWatch_FindMyWatchCancelResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_FindMyWatch_FindMyWatchCancelResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_FindMyWatch_FindMyWatchRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_FindMyWatch_FindMyWatchRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_FindMyWatch_FindMyWatchResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_FindMyWatch_FindMyWatchResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_FindMyWatch_FindMyWatchService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_FindMyWatch_FindMyWatchService_fieldAccessorTable;

    public interface FindMyWatchCancelRequestOrBuilder extends MessageOrBuilder {
    }

    public interface FindMyWatchCancelResponseOrBuilder extends MessageOrBuilder {
        ResponseStatus getStatus();

        boolean hasStatus();
    }

    public interface FindMyWatchRequestOrBuilder extends MessageOrBuilder {
        int getTimeout();

        boolean hasTimeout();
    }

    public interface FindMyWatchResponseOrBuilder extends MessageOrBuilder {
        ResponseStatus getStatus();

        boolean hasStatus();
    }

    public interface FindMyWatchServiceOrBuilder extends MessageOrBuilder {
        FindMyWatchCancelRequest getCancelRequest();

        FindMyWatchCancelRequestOrBuilder getCancelRequestOrBuilder();

        FindMyWatchResponse getCancelResponse();

        FindMyWatchResponseOrBuilder getCancelResponseOrBuilder();

        FindMyWatchRequest getFindRequest();

        FindMyWatchRequestOrBuilder getFindRequestOrBuilder();

        FindMyWatchResponse getFindResponse();

        FindMyWatchResponseOrBuilder getFindResponseOrBuilder();

        boolean hasCancelRequest();

        boolean hasCancelResponse();

        boolean hasFindRequest();

        boolean hasFindResponse();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_FindMyWatch_FindMyWatchRequest_descriptor = descriptor2;
        internal_static_GDI_Proto_FindMyWatch_FindMyWatchRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"Timeout"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_FindMyWatch_FindMyWatchResponse_descriptor = descriptor3;
        internal_static_GDI_Proto_FindMyWatch_FindMyWatchResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Status"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_FindMyWatch_FindMyWatchCancelRequest_descriptor = descriptor4;
        internal_static_GDI_Proto_FindMyWatch_FindMyWatchCancelRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[0]);
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_FindMyWatch_FindMyWatchCancelResponse_descriptor = descriptor5;
        internal_static_GDI_Proto_FindMyWatch_FindMyWatchCancelResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Status"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_FindMyWatch_FindMyWatchService_descriptor = descriptor6;
        internal_static_GDI_Proto_FindMyWatch_FindMyWatchService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"FindRequest", "FindResponse", "CancelRequest", "CancelResponse"});
    }

    private GDIFindMyWatch() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class FindMyWatchCancelRequest extends GeneratedMessageV3 implements FindMyWatchCancelRequestOrBuilder {
        private static final FindMyWatchCancelRequest DEFAULT_INSTANCE = new FindMyWatchCancelRequest();

        @Deprecated
        public static final Parser<FindMyWatchCancelRequest> PARSER = new AbstractParser<FindMyWatchCancelRequest>() { // from class: com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchCancelRequest.1
            @Override // com.google.protobuf.Parser
            public FindMyWatchCancelRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = FindMyWatchCancelRequest.newBuilder();
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

        private FindMyWatchCancelRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FindMyWatchCancelRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIFindMyWatch.internal_static_GDI_Proto_FindMyWatch_FindMyWatchCancelRequest_descriptor;
        }

        public static Builder newBuilder(FindMyWatchCancelRequest findMyWatchCancelRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(findMyWatchCancelRequest);
        }

        public static FindMyWatchCancelRequest parseDelimitedFrom(InputStream inputStream) {
            return (FindMyWatchCancelRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FindMyWatchCancelRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<FindMyWatchCancelRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof FindMyWatchCancelRequest) {
                return getUnknownFields().equals(((FindMyWatchCancelRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FindMyWatchCancelRequest> getParserForType() {
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
            return GDIFindMyWatch.internal_static_GDI_Proto_FindMyWatch_FindMyWatchCancelRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(FindMyWatchCancelRequest.class, Builder.class);
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
            return new FindMyWatchCancelRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FindMyWatchCancelRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIFindMyWatch.internal_static_GDI_Proto_FindMyWatch_FindMyWatchCancelRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FindMyWatchCancelRequest build() {
                FindMyWatchCancelRequest findMyWatchCancelRequestBuildPartial = buildPartial();
                if (findMyWatchCancelRequestBuildPartial.isInitialized()) {
                    return findMyWatchCancelRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) findMyWatchCancelRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FindMyWatchCancelRequest buildPartial() {
                FindMyWatchCancelRequest findMyWatchCancelRequest = new FindMyWatchCancelRequest(this);
                onBuilt();
                return findMyWatchCancelRequest;
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
                return GDIFindMyWatch.internal_static_GDI_Proto_FindMyWatch_FindMyWatchCancelRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIFindMyWatch.internal_static_GDI_Proto_FindMyWatch_FindMyWatchCancelRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(FindMyWatchCancelRequest.class, Builder.class);
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
            public FindMyWatchCancelRequest getDefaultInstanceForType() {
                return FindMyWatchCancelRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FindMyWatchCancelRequest) {
                    return mergeFrom((FindMyWatchCancelRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FindMyWatchCancelRequest findMyWatchCancelRequest) {
                if (findMyWatchCancelRequest == FindMyWatchCancelRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(findMyWatchCancelRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FindMyWatchCancelRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ FindMyWatchCancelRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private FindMyWatchCancelRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FindMyWatchCancelRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FindMyWatchCancelRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FindMyWatchCancelRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FindMyWatchCancelRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FindMyWatchCancelRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FindMyWatchCancelRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static FindMyWatchCancelRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FindMyWatchCancelRequest parseFrom(InputStream inputStream) {
            return (FindMyWatchCancelRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FindMyWatchCancelRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FindMyWatchCancelRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FindMyWatchCancelRequest parseFrom(CodedInputStream codedInputStream) {
            return (FindMyWatchCancelRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static FindMyWatchCancelRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FindMyWatchCancelRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class FindMyWatchCancelResponse extends GeneratedMessageV3 implements FindMyWatchCancelResponseOrBuilder {
        private static final FindMyWatchCancelResponse DEFAULT_INSTANCE = new FindMyWatchCancelResponse();

        @Deprecated
        public static final Parser<FindMyWatchCancelResponse> PARSER = new AbstractParser<FindMyWatchCancelResponse>() { // from class: com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchCancelResponse.1
            @Override // com.google.protobuf.Parser
            public FindMyWatchCancelResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = FindMyWatchCancelResponse.newBuilder();
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

        private FindMyWatchCancelResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FindMyWatchCancelResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIFindMyWatch.internal_static_GDI_Proto_FindMyWatch_FindMyWatchCancelResponse_descriptor;
        }

        public static Builder newBuilder(FindMyWatchCancelResponse findMyWatchCancelResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(findMyWatchCancelResponse);
        }

        public static FindMyWatchCancelResponse parseDelimitedFrom(InputStream inputStream) {
            return (FindMyWatchCancelResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FindMyWatchCancelResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<FindMyWatchCancelResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FindMyWatchCancelResponse)) {
                return super.equals(obj);
            }
            FindMyWatchCancelResponse findMyWatchCancelResponse = (FindMyWatchCancelResponse) obj;
            if (hasStatus() != findMyWatchCancelResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == findMyWatchCancelResponse.status_) && getUnknownFields().equals(findMyWatchCancelResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FindMyWatchCancelResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchCancelResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchCancelResponseOrBuilder
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
            return GDIFindMyWatch.internal_static_GDI_Proto_FindMyWatch_FindMyWatchCancelResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(FindMyWatchCancelResponse.class, Builder.class);
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
            return new FindMyWatchCancelResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FindMyWatchCancelResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(FindMyWatchCancelResponse findMyWatchCancelResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    findMyWatchCancelResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                findMyWatchCancelResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIFindMyWatch.internal_static_GDI_Proto_FindMyWatch_FindMyWatchCancelResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FindMyWatchCancelResponse build() {
                FindMyWatchCancelResponse findMyWatchCancelResponseBuildPartial = buildPartial();
                if (findMyWatchCancelResponseBuildPartial.isInitialized()) {
                    return findMyWatchCancelResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) findMyWatchCancelResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FindMyWatchCancelResponse buildPartial() {
                FindMyWatchCancelResponse findMyWatchCancelResponse = new FindMyWatchCancelResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(findMyWatchCancelResponse);
                }
                onBuilt();
                return findMyWatchCancelResponse;
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
                return GDIFindMyWatch.internal_static_GDI_Proto_FindMyWatch_FindMyWatchCancelResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchCancelResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchCancelResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIFindMyWatch.internal_static_GDI_Proto_FindMyWatch_FindMyWatchCancelResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(FindMyWatchCancelResponse.class, Builder.class);
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

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public FindMyWatchCancelResponse getDefaultInstanceForType() {
                return FindMyWatchCancelResponse.getDefaultInstance();
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
                if (message instanceof FindMyWatchCancelResponse) {
                    return mergeFrom((FindMyWatchCancelResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FindMyWatchCancelResponse findMyWatchCancelResponse) {
                if (findMyWatchCancelResponse == FindMyWatchCancelResponse.getDefaultInstance()) {
                    return this;
                }
                if (findMyWatchCancelResponse.hasStatus()) {
                    setStatus(findMyWatchCancelResponse.getStatus());
                }
                mergeUnknownFields(findMyWatchCancelResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FindMyWatchCancelResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static FindMyWatchCancelResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FindMyWatchCancelResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FindMyWatchCancelResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ FindMyWatchCancelResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static FindMyWatchCancelResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private FindMyWatchCancelResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FindMyWatchCancelResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FindMyWatchCancelResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static FindMyWatchCancelResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FindMyWatchCancelResponse parseFrom(InputStream inputStream) {
            return (FindMyWatchCancelResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FindMyWatchCancelResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FindMyWatchCancelResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FindMyWatchCancelResponse parseFrom(CodedInputStream codedInputStream) {
            return (FindMyWatchCancelResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static FindMyWatchCancelResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FindMyWatchCancelResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class FindMyWatchRequest extends GeneratedMessageV3 implements FindMyWatchRequestOrBuilder {
        private static final FindMyWatchRequest DEFAULT_INSTANCE = new FindMyWatchRequest();

        @Deprecated
        public static final Parser<FindMyWatchRequest> PARSER = new AbstractParser<FindMyWatchRequest>() { // from class: com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchRequest.1
            @Override // com.google.protobuf.Parser
            public FindMyWatchRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = FindMyWatchRequest.newBuilder();
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
        public static final int TIMEOUT_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int timeout_;

        private FindMyWatchRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.timeout_ = 60;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FindMyWatchRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIFindMyWatch.internal_static_GDI_Proto_FindMyWatch_FindMyWatchRequest_descriptor;
        }

        public static Builder newBuilder(FindMyWatchRequest findMyWatchRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(findMyWatchRequest);
        }

        public static FindMyWatchRequest parseDelimitedFrom(InputStream inputStream) {
            return (FindMyWatchRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FindMyWatchRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<FindMyWatchRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FindMyWatchRequest)) {
                return super.equals(obj);
            }
            FindMyWatchRequest findMyWatchRequest = (FindMyWatchRequest) obj;
            if (hasTimeout() != findMyWatchRequest.hasTimeout()) {
                return false;
            }
            return (!hasTimeout() || getTimeout() == findMyWatchRequest.getTimeout()) && getUnknownFields().equals(findMyWatchRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FindMyWatchRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeInt32Size(1, this.timeout_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchRequestOrBuilder
        public int getTimeout() {
            return this.timeout_;
        }

        @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchRequestOrBuilder
        public boolean hasTimeout() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTimeout()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getTimeout();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIFindMyWatch.internal_static_GDI_Proto_FindMyWatch_FindMyWatchRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(FindMyWatchRequest.class, Builder.class);
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
            return new FindMyWatchRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeInt32(1, this.timeout_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FindMyWatchRequestOrBuilder {
            private int bitField0_;
            private int timeout_;

            private Builder() {
                this.timeout_ = 60;
            }

            private void buildPartial0(FindMyWatchRequest findMyWatchRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    findMyWatchRequest.timeout_ = this.timeout_;
                } else {
                    i14 = 0;
                }
                findMyWatchRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIFindMyWatch.internal_static_GDI_Proto_FindMyWatch_FindMyWatchRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FindMyWatchRequest build() {
                FindMyWatchRequest findMyWatchRequestBuildPartial = buildPartial();
                if (findMyWatchRequestBuildPartial.isInitialized()) {
                    return findMyWatchRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) findMyWatchRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FindMyWatchRequest buildPartial() {
                FindMyWatchRequest findMyWatchRequest = new FindMyWatchRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(findMyWatchRequest);
                }
                onBuilt();
                return findMyWatchRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.timeout_ = 60;
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

            public Builder clearTimeout() {
                this.bitField0_ &= -2;
                this.timeout_ = 60;
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
                return GDIFindMyWatch.internal_static_GDI_Proto_FindMyWatch_FindMyWatchRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchRequestOrBuilder
            public int getTimeout() {
                return this.timeout_;
            }

            @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchRequestOrBuilder
            public boolean hasTimeout() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIFindMyWatch.internal_static_GDI_Proto_FindMyWatch_FindMyWatchRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(FindMyWatchRequest.class, Builder.class);
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
                                    this.timeout_ = codedInputStream.readInt32();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setTimeout(int i14) {
                this.timeout_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public FindMyWatchRequest getDefaultInstanceForType() {
                return FindMyWatchRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.timeout_ = 60;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FindMyWatchRequest) {
                    return mergeFrom((FindMyWatchRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FindMyWatchRequest findMyWatchRequest) {
                if (findMyWatchRequest == FindMyWatchRequest.getDefaultInstance()) {
                    return this;
                }
                if (findMyWatchRequest.hasTimeout()) {
                    setTimeout(findMyWatchRequest.getTimeout());
                }
                mergeUnknownFields(findMyWatchRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FindMyWatchRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static FindMyWatchRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FindMyWatchRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FindMyWatchRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FindMyWatchRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public /* synthetic */ FindMyWatchRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FindMyWatchRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        private FindMyWatchRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.timeout_ = 60;
        }

        public static FindMyWatchRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static FindMyWatchRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FindMyWatchRequest parseFrom(InputStream inputStream) {
            return (FindMyWatchRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FindMyWatchRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FindMyWatchRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FindMyWatchRequest parseFrom(CodedInputStream codedInputStream) {
            return (FindMyWatchRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static FindMyWatchRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FindMyWatchRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class FindMyWatchResponse extends GeneratedMessageV3 implements FindMyWatchResponseOrBuilder {
        private static final FindMyWatchResponse DEFAULT_INSTANCE = new FindMyWatchResponse();

        @Deprecated
        public static final Parser<FindMyWatchResponse> PARSER = new AbstractParser<FindMyWatchResponse>() { // from class: com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchResponse.1
            @Override // com.google.protobuf.Parser
            public FindMyWatchResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = FindMyWatchResponse.newBuilder();
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

        private FindMyWatchResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FindMyWatchResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIFindMyWatch.internal_static_GDI_Proto_FindMyWatch_FindMyWatchResponse_descriptor;
        }

        public static Builder newBuilder(FindMyWatchResponse findMyWatchResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(findMyWatchResponse);
        }

        public static FindMyWatchResponse parseDelimitedFrom(InputStream inputStream) {
            return (FindMyWatchResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FindMyWatchResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<FindMyWatchResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FindMyWatchResponse)) {
                return super.equals(obj);
            }
            FindMyWatchResponse findMyWatchResponse = (FindMyWatchResponse) obj;
            if (hasStatus() != findMyWatchResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == findMyWatchResponse.status_) && getUnknownFields().equals(findMyWatchResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FindMyWatchResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchResponseOrBuilder
        public ResponseStatus getStatus() {
            ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
            return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchResponseOrBuilder
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
            return GDIFindMyWatch.internal_static_GDI_Proto_FindMyWatch_FindMyWatchResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(FindMyWatchResponse.class, Builder.class);
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
            return new FindMyWatchResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FindMyWatchResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(FindMyWatchResponse findMyWatchResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    findMyWatchResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                findMyWatchResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIFindMyWatch.internal_static_GDI_Proto_FindMyWatch_FindMyWatchResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FindMyWatchResponse build() {
                FindMyWatchResponse findMyWatchResponseBuildPartial = buildPartial();
                if (findMyWatchResponseBuildPartial.isInitialized()) {
                    return findMyWatchResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) findMyWatchResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FindMyWatchResponse buildPartial() {
                FindMyWatchResponse findMyWatchResponse = new FindMyWatchResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(findMyWatchResponse);
                }
                onBuilt();
                return findMyWatchResponse;
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
                return GDIFindMyWatch.internal_static_GDI_Proto_FindMyWatch_FindMyWatchResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchResponseOrBuilder
            public ResponseStatus getStatus() {
                ResponseStatus responseStatusForNumber = ResponseStatus.forNumber(this.status_);
                return responseStatusForNumber == null ? ResponseStatus.UNKNOWN_RESPONSE_STATUS : responseStatusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIFindMyWatch.internal_static_GDI_Proto_FindMyWatch_FindMyWatchResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(FindMyWatchResponse.class, Builder.class);
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

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public FindMyWatchResponse getDefaultInstanceForType() {
                return FindMyWatchResponse.getDefaultInstance();
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
                if (message instanceof FindMyWatchResponse) {
                    return mergeFrom((FindMyWatchResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FindMyWatchResponse findMyWatchResponse) {
                if (findMyWatchResponse == FindMyWatchResponse.getDefaultInstance()) {
                    return this;
                }
                if (findMyWatchResponse.hasStatus()) {
                    setStatus(findMyWatchResponse.getStatus());
                }
                mergeUnknownFields(findMyWatchResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FindMyWatchResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static FindMyWatchResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FindMyWatchResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FindMyWatchResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ FindMyWatchResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static FindMyWatchResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private FindMyWatchResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FindMyWatchResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FindMyWatchResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static FindMyWatchResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FindMyWatchResponse parseFrom(InputStream inputStream) {
            return (FindMyWatchResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FindMyWatchResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FindMyWatchResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FindMyWatchResponse parseFrom(CodedInputStream codedInputStream) {
            return (FindMyWatchResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static FindMyWatchResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FindMyWatchResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class FindMyWatchService extends GeneratedMessageV3 implements FindMyWatchServiceOrBuilder {
        public static final int CANCEL_REQUEST_FIELD_NUMBER = 3;
        public static final int CANCEL_RESPONSE_FIELD_NUMBER = 4;
        public static final int FIND_REQUEST_FIELD_NUMBER = 1;
        public static final int FIND_RESPONSE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private FindMyWatchCancelRequest cancelRequest_;
        private FindMyWatchResponse cancelResponse_;
        private FindMyWatchRequest findRequest_;
        private FindMyWatchResponse findResponse_;
        private byte memoizedIsInitialized;
        private static final FindMyWatchService DEFAULT_INSTANCE = new FindMyWatchService();

        @Deprecated
        public static final Parser<FindMyWatchService> PARSER = new AbstractParser<FindMyWatchService>() { // from class: com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchService.1
            @Override // com.google.protobuf.Parser
            public FindMyWatchService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = FindMyWatchService.newBuilder();
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

        private FindMyWatchService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FindMyWatchService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIFindMyWatch.internal_static_GDI_Proto_FindMyWatch_FindMyWatchService_descriptor;
        }

        public static Builder newBuilder(FindMyWatchService findMyWatchService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(findMyWatchService);
        }

        public static FindMyWatchService parseDelimitedFrom(InputStream inputStream) {
            return (FindMyWatchService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FindMyWatchService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<FindMyWatchService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FindMyWatchService)) {
                return super.equals(obj);
            }
            FindMyWatchService findMyWatchService = (FindMyWatchService) obj;
            if (hasFindRequest() != findMyWatchService.hasFindRequest()) {
                return false;
            }
            if ((hasFindRequest() && !getFindRequest().equals(findMyWatchService.getFindRequest())) || hasFindResponse() != findMyWatchService.hasFindResponse()) {
                return false;
            }
            if ((hasFindResponse() && !getFindResponse().equals(findMyWatchService.getFindResponse())) || hasCancelRequest() != findMyWatchService.hasCancelRequest()) {
                return false;
            }
            if ((!hasCancelRequest() || getCancelRequest().equals(findMyWatchService.getCancelRequest())) && hasCancelResponse() == findMyWatchService.hasCancelResponse()) {
                return (!hasCancelResponse() || getCancelResponse().equals(findMyWatchService.getCancelResponse())) && getUnknownFields().equals(findMyWatchService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchServiceOrBuilder
        public FindMyWatchCancelRequest getCancelRequest() {
            FindMyWatchCancelRequest findMyWatchCancelRequest = this.cancelRequest_;
            return findMyWatchCancelRequest == null ? FindMyWatchCancelRequest.getDefaultInstance() : findMyWatchCancelRequest;
        }

        @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchServiceOrBuilder
        public FindMyWatchCancelRequestOrBuilder getCancelRequestOrBuilder() {
            FindMyWatchCancelRequest findMyWatchCancelRequest = this.cancelRequest_;
            return findMyWatchCancelRequest == null ? FindMyWatchCancelRequest.getDefaultInstance() : findMyWatchCancelRequest;
        }

        @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchServiceOrBuilder
        public FindMyWatchResponse getCancelResponse() {
            FindMyWatchResponse findMyWatchResponse = this.cancelResponse_;
            return findMyWatchResponse == null ? FindMyWatchResponse.getDefaultInstance() : findMyWatchResponse;
        }

        @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchServiceOrBuilder
        public FindMyWatchResponseOrBuilder getCancelResponseOrBuilder() {
            FindMyWatchResponse findMyWatchResponse = this.cancelResponse_;
            return findMyWatchResponse == null ? FindMyWatchResponse.getDefaultInstance() : findMyWatchResponse;
        }

        @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchServiceOrBuilder
        public FindMyWatchRequest getFindRequest() {
            FindMyWatchRequest findMyWatchRequest = this.findRequest_;
            return findMyWatchRequest == null ? FindMyWatchRequest.getDefaultInstance() : findMyWatchRequest;
        }

        @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchServiceOrBuilder
        public FindMyWatchRequestOrBuilder getFindRequestOrBuilder() {
            FindMyWatchRequest findMyWatchRequest = this.findRequest_;
            return findMyWatchRequest == null ? FindMyWatchRequest.getDefaultInstance() : findMyWatchRequest;
        }

        @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchServiceOrBuilder
        public FindMyWatchResponse getFindResponse() {
            FindMyWatchResponse findMyWatchResponse = this.findResponse_;
            return findMyWatchResponse == null ? FindMyWatchResponse.getDefaultInstance() : findMyWatchResponse;
        }

        @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchServiceOrBuilder
        public FindMyWatchResponseOrBuilder getFindResponseOrBuilder() {
            FindMyWatchResponse findMyWatchResponse = this.findResponse_;
            return findMyWatchResponse == null ? FindMyWatchResponse.getDefaultInstance() : findMyWatchResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FindMyWatchService> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getFindRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getFindResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getCancelRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getCancelResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchServiceOrBuilder
        public boolean hasCancelRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchServiceOrBuilder
        public boolean hasCancelResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchServiceOrBuilder
        public boolean hasFindRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchServiceOrBuilder
        public boolean hasFindResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasFindRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getFindRequest().hashCode();
            }
            if (hasFindResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getFindResponse().hashCode();
            }
            if (hasCancelRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getCancelRequest().hashCode();
            }
            if (hasCancelResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getCancelResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIFindMyWatch.internal_static_GDI_Proto_FindMyWatch_FindMyWatchService_fieldAccessorTable.ensureFieldAccessorsInitialized(FindMyWatchService.class, Builder.class);
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
            return new FindMyWatchService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getFindRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getFindResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getCancelRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getCancelResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FindMyWatchServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<FindMyWatchCancelRequest, FindMyWatchCancelRequest.Builder, FindMyWatchCancelRequestOrBuilder> cancelRequestBuilder_;
            private FindMyWatchCancelRequest cancelRequest_;
            private SingleFieldBuilderV3<FindMyWatchResponse, FindMyWatchResponse.Builder, FindMyWatchResponseOrBuilder> cancelResponseBuilder_;
            private FindMyWatchResponse cancelResponse_;
            private SingleFieldBuilderV3<FindMyWatchRequest, FindMyWatchRequest.Builder, FindMyWatchRequestOrBuilder> findRequestBuilder_;
            private FindMyWatchRequest findRequest_;
            private SingleFieldBuilderV3<FindMyWatchResponse, FindMyWatchResponse.Builder, FindMyWatchResponseOrBuilder> findResponseBuilder_;
            private FindMyWatchResponse findResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(FindMyWatchService findMyWatchService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<FindMyWatchRequest, FindMyWatchRequest.Builder, FindMyWatchRequestOrBuilder> singleFieldBuilderV3 = this.findRequestBuilder_;
                    findMyWatchService.findRequest_ = singleFieldBuilderV3 == null ? this.findRequest_ : (FindMyWatchRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<FindMyWatchResponse, FindMyWatchResponse.Builder, FindMyWatchResponseOrBuilder> singleFieldBuilderV4 = this.findResponseBuilder_;
                    findMyWatchService.findResponse_ = singleFieldBuilderV4 == null ? this.findResponse_ : (FindMyWatchResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<FindMyWatchCancelRequest, FindMyWatchCancelRequest.Builder, FindMyWatchCancelRequestOrBuilder> singleFieldBuilderV5 = this.cancelRequestBuilder_;
                    findMyWatchService.cancelRequest_ = singleFieldBuilderV5 == null ? this.cancelRequest_ : (FindMyWatchCancelRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<FindMyWatchResponse, FindMyWatchResponse.Builder, FindMyWatchResponseOrBuilder> singleFieldBuilderV6 = this.cancelResponseBuilder_;
                    findMyWatchService.cancelResponse_ = singleFieldBuilderV6 == null ? this.cancelResponse_ : (FindMyWatchResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                findMyWatchService.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<FindMyWatchCancelRequest, FindMyWatchCancelRequest.Builder, FindMyWatchCancelRequestOrBuilder> getCancelRequestFieldBuilder() {
                if (this.cancelRequestBuilder_ == null) {
                    this.cancelRequestBuilder_ = new SingleFieldBuilderV3<>(getCancelRequest(), getParentForChildren(), isClean());
                    this.cancelRequest_ = null;
                }
                return this.cancelRequestBuilder_;
            }

            private SingleFieldBuilderV3<FindMyWatchResponse, FindMyWatchResponse.Builder, FindMyWatchResponseOrBuilder> getCancelResponseFieldBuilder() {
                if (this.cancelResponseBuilder_ == null) {
                    this.cancelResponseBuilder_ = new SingleFieldBuilderV3<>(getCancelResponse(), getParentForChildren(), isClean());
                    this.cancelResponse_ = null;
                }
                return this.cancelResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIFindMyWatch.internal_static_GDI_Proto_FindMyWatch_FindMyWatchService_descriptor;
            }

            private SingleFieldBuilderV3<FindMyWatchRequest, FindMyWatchRequest.Builder, FindMyWatchRequestOrBuilder> getFindRequestFieldBuilder() {
                if (this.findRequestBuilder_ == null) {
                    this.findRequestBuilder_ = new SingleFieldBuilderV3<>(getFindRequest(), getParentForChildren(), isClean());
                    this.findRequest_ = null;
                }
                return this.findRequestBuilder_;
            }

            private SingleFieldBuilderV3<FindMyWatchResponse, FindMyWatchResponse.Builder, FindMyWatchResponseOrBuilder> getFindResponseFieldBuilder() {
                if (this.findResponseBuilder_ == null) {
                    this.findResponseBuilder_ = new SingleFieldBuilderV3<>(getFindResponse(), getParentForChildren(), isClean());
                    this.findResponse_ = null;
                }
                return this.findResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getFindRequestFieldBuilder();
                    getFindResponseFieldBuilder();
                    getCancelRequestFieldBuilder();
                    getCancelResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FindMyWatchService build() {
                FindMyWatchService findMyWatchServiceBuildPartial = buildPartial();
                if (findMyWatchServiceBuildPartial.isInitialized()) {
                    return findMyWatchServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) findMyWatchServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FindMyWatchService buildPartial() {
                FindMyWatchService findMyWatchService = new FindMyWatchService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(findMyWatchService);
                }
                onBuilt();
                return findMyWatchService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.findRequest_ = null;
                SingleFieldBuilderV3<FindMyWatchRequest, FindMyWatchRequest.Builder, FindMyWatchRequestOrBuilder> singleFieldBuilderV3 = this.findRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.findRequestBuilder_ = null;
                }
                this.findResponse_ = null;
                SingleFieldBuilderV3<FindMyWatchResponse, FindMyWatchResponse.Builder, FindMyWatchResponseOrBuilder> singleFieldBuilderV4 = this.findResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.findResponseBuilder_ = null;
                }
                this.cancelRequest_ = null;
                SingleFieldBuilderV3<FindMyWatchCancelRequest, FindMyWatchCancelRequest.Builder, FindMyWatchCancelRequestOrBuilder> singleFieldBuilderV5 = this.cancelRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.cancelRequestBuilder_ = null;
                }
                this.cancelResponse_ = null;
                SingleFieldBuilderV3<FindMyWatchResponse, FindMyWatchResponse.Builder, FindMyWatchResponseOrBuilder> singleFieldBuilderV6 = this.cancelResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.cancelResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearCancelRequest() {
                this.bitField0_ &= -5;
                this.cancelRequest_ = null;
                SingleFieldBuilderV3<FindMyWatchCancelRequest, FindMyWatchCancelRequest.Builder, FindMyWatchCancelRequestOrBuilder> singleFieldBuilderV3 = this.cancelRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.cancelRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearCancelResponse() {
                this.bitField0_ &= -9;
                this.cancelResponse_ = null;
                SingleFieldBuilderV3<FindMyWatchResponse, FindMyWatchResponse.Builder, FindMyWatchResponseOrBuilder> singleFieldBuilderV3 = this.cancelResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.cancelResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearFindRequest() {
                this.bitField0_ &= -2;
                this.findRequest_ = null;
                SingleFieldBuilderV3<FindMyWatchRequest, FindMyWatchRequest.Builder, FindMyWatchRequestOrBuilder> singleFieldBuilderV3 = this.findRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.findRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearFindResponse() {
                this.bitField0_ &= -3;
                this.findResponse_ = null;
                SingleFieldBuilderV3<FindMyWatchResponse, FindMyWatchResponse.Builder, FindMyWatchResponseOrBuilder> singleFieldBuilderV3 = this.findResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.findResponseBuilder_ = null;
                }
                onChanged();
                return this;
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

            @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchServiceOrBuilder
            public FindMyWatchCancelRequest getCancelRequest() {
                SingleFieldBuilderV3<FindMyWatchCancelRequest, FindMyWatchCancelRequest.Builder, FindMyWatchCancelRequestOrBuilder> singleFieldBuilderV3 = this.cancelRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FindMyWatchCancelRequest) singleFieldBuilderV3.getMessage();
                }
                FindMyWatchCancelRequest findMyWatchCancelRequest = this.cancelRequest_;
                return findMyWatchCancelRequest == null ? FindMyWatchCancelRequest.getDefaultInstance() : findMyWatchCancelRequest;
            }

            public FindMyWatchCancelRequest.Builder getCancelRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (FindMyWatchCancelRequest.Builder) getCancelRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchServiceOrBuilder
            public FindMyWatchCancelRequestOrBuilder getCancelRequestOrBuilder() {
                SingleFieldBuilderV3<FindMyWatchCancelRequest, FindMyWatchCancelRequest.Builder, FindMyWatchCancelRequestOrBuilder> singleFieldBuilderV3 = this.cancelRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FindMyWatchCancelRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FindMyWatchCancelRequest findMyWatchCancelRequest = this.cancelRequest_;
                return findMyWatchCancelRequest == null ? FindMyWatchCancelRequest.getDefaultInstance() : findMyWatchCancelRequest;
            }

            @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchServiceOrBuilder
            public FindMyWatchResponse getCancelResponse() {
                SingleFieldBuilderV3<FindMyWatchResponse, FindMyWatchResponse.Builder, FindMyWatchResponseOrBuilder> singleFieldBuilderV3 = this.cancelResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FindMyWatchResponse) singleFieldBuilderV3.getMessage();
                }
                FindMyWatchResponse findMyWatchResponse = this.cancelResponse_;
                return findMyWatchResponse == null ? FindMyWatchResponse.getDefaultInstance() : findMyWatchResponse;
            }

            public FindMyWatchResponse.Builder getCancelResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (FindMyWatchResponse.Builder) getCancelResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchServiceOrBuilder
            public FindMyWatchResponseOrBuilder getCancelResponseOrBuilder() {
                SingleFieldBuilderV3<FindMyWatchResponse, FindMyWatchResponse.Builder, FindMyWatchResponseOrBuilder> singleFieldBuilderV3 = this.cancelResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FindMyWatchResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FindMyWatchResponse findMyWatchResponse = this.cancelResponse_;
                return findMyWatchResponse == null ? FindMyWatchResponse.getDefaultInstance() : findMyWatchResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIFindMyWatch.internal_static_GDI_Proto_FindMyWatch_FindMyWatchService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchServiceOrBuilder
            public FindMyWatchRequest getFindRequest() {
                SingleFieldBuilderV3<FindMyWatchRequest, FindMyWatchRequest.Builder, FindMyWatchRequestOrBuilder> singleFieldBuilderV3 = this.findRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FindMyWatchRequest) singleFieldBuilderV3.getMessage();
                }
                FindMyWatchRequest findMyWatchRequest = this.findRequest_;
                return findMyWatchRequest == null ? FindMyWatchRequest.getDefaultInstance() : findMyWatchRequest;
            }

            public FindMyWatchRequest.Builder getFindRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (FindMyWatchRequest.Builder) getFindRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchServiceOrBuilder
            public FindMyWatchRequestOrBuilder getFindRequestOrBuilder() {
                SingleFieldBuilderV3<FindMyWatchRequest, FindMyWatchRequest.Builder, FindMyWatchRequestOrBuilder> singleFieldBuilderV3 = this.findRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FindMyWatchRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FindMyWatchRequest findMyWatchRequest = this.findRequest_;
                return findMyWatchRequest == null ? FindMyWatchRequest.getDefaultInstance() : findMyWatchRequest;
            }

            @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchServiceOrBuilder
            public FindMyWatchResponse getFindResponse() {
                SingleFieldBuilderV3<FindMyWatchResponse, FindMyWatchResponse.Builder, FindMyWatchResponseOrBuilder> singleFieldBuilderV3 = this.findResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FindMyWatchResponse) singleFieldBuilderV3.getMessage();
                }
                FindMyWatchResponse findMyWatchResponse = this.findResponse_;
                return findMyWatchResponse == null ? FindMyWatchResponse.getDefaultInstance() : findMyWatchResponse;
            }

            public FindMyWatchResponse.Builder getFindResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (FindMyWatchResponse.Builder) getFindResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchServiceOrBuilder
            public FindMyWatchResponseOrBuilder getFindResponseOrBuilder() {
                SingleFieldBuilderV3<FindMyWatchResponse, FindMyWatchResponse.Builder, FindMyWatchResponseOrBuilder> singleFieldBuilderV3 = this.findResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FindMyWatchResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FindMyWatchResponse findMyWatchResponse = this.findResponse_;
                return findMyWatchResponse == null ? FindMyWatchResponse.getDefaultInstance() : findMyWatchResponse;
            }

            @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchServiceOrBuilder
            public boolean hasCancelRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchServiceOrBuilder
            public boolean hasCancelResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchServiceOrBuilder
            public boolean hasFindRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIFindMyWatch.FindMyWatchServiceOrBuilder
            public boolean hasFindResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIFindMyWatch.internal_static_GDI_Proto_FindMyWatch_FindMyWatchService_fieldAccessorTable.ensureFieldAccessorsInitialized(FindMyWatchService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeCancelRequest(FindMyWatchCancelRequest findMyWatchCancelRequest) {
                FindMyWatchCancelRequest findMyWatchCancelRequest2;
                SingleFieldBuilderV3<FindMyWatchCancelRequest, FindMyWatchCancelRequest.Builder, FindMyWatchCancelRequestOrBuilder> singleFieldBuilderV3 = this.cancelRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(findMyWatchCancelRequest);
                } else if ((this.bitField0_ & 4) == 0 || (findMyWatchCancelRequest2 = this.cancelRequest_) == null || findMyWatchCancelRequest2 == FindMyWatchCancelRequest.getDefaultInstance()) {
                    this.cancelRequest_ = findMyWatchCancelRequest;
                } else {
                    getCancelRequestBuilder().mergeFrom(findMyWatchCancelRequest);
                }
                if (this.cancelRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeCancelResponse(FindMyWatchResponse findMyWatchResponse) {
                FindMyWatchResponse findMyWatchResponse2;
                SingleFieldBuilderV3<FindMyWatchResponse, FindMyWatchResponse.Builder, FindMyWatchResponseOrBuilder> singleFieldBuilderV3 = this.cancelResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(findMyWatchResponse);
                } else if ((this.bitField0_ & 8) == 0 || (findMyWatchResponse2 = this.cancelResponse_) == null || findMyWatchResponse2 == FindMyWatchResponse.getDefaultInstance()) {
                    this.cancelResponse_ = findMyWatchResponse;
                } else {
                    getCancelResponseBuilder().mergeFrom(findMyWatchResponse);
                }
                if (this.cancelResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeFindRequest(FindMyWatchRequest findMyWatchRequest) {
                FindMyWatchRequest findMyWatchRequest2;
                SingleFieldBuilderV3<FindMyWatchRequest, FindMyWatchRequest.Builder, FindMyWatchRequestOrBuilder> singleFieldBuilderV3 = this.findRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(findMyWatchRequest);
                } else if ((this.bitField0_ & 1) == 0 || (findMyWatchRequest2 = this.findRequest_) == null || findMyWatchRequest2 == FindMyWatchRequest.getDefaultInstance()) {
                    this.findRequest_ = findMyWatchRequest;
                } else {
                    getFindRequestBuilder().mergeFrom(findMyWatchRequest);
                }
                if (this.findRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeFindResponse(FindMyWatchResponse findMyWatchResponse) {
                FindMyWatchResponse findMyWatchResponse2;
                SingleFieldBuilderV3<FindMyWatchResponse, FindMyWatchResponse.Builder, FindMyWatchResponseOrBuilder> singleFieldBuilderV3 = this.findResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(findMyWatchResponse);
                } else if ((this.bitField0_ & 2) == 0 || (findMyWatchResponse2 = this.findResponse_) == null || findMyWatchResponse2 == FindMyWatchResponse.getDefaultInstance()) {
                    this.findResponse_ = findMyWatchResponse;
                } else {
                    getFindResponseBuilder().mergeFrom(findMyWatchResponse);
                }
                if (this.findResponse_ != null) {
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
                                    codedInputStream.readMessage(getFindRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getFindResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getCancelRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getCancelResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setCancelRequest(FindMyWatchCancelRequest.Builder builder) {
                SingleFieldBuilderV3<FindMyWatchCancelRequest, FindMyWatchCancelRequest.Builder, FindMyWatchCancelRequestOrBuilder> singleFieldBuilderV3 = this.cancelRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.cancelRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setCancelResponse(FindMyWatchResponse.Builder builder) {
                SingleFieldBuilderV3<FindMyWatchResponse, FindMyWatchResponse.Builder, FindMyWatchResponseOrBuilder> singleFieldBuilderV3 = this.cancelResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.cancelResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setFindRequest(FindMyWatchRequest.Builder builder) {
                SingleFieldBuilderV3<FindMyWatchRequest, FindMyWatchRequest.Builder, FindMyWatchRequestOrBuilder> singleFieldBuilderV3 = this.findRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.findRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setFindResponse(FindMyWatchResponse.Builder builder) {
                SingleFieldBuilderV3<FindMyWatchResponse, FindMyWatchResponse.Builder, FindMyWatchResponseOrBuilder> singleFieldBuilderV3 = this.findResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.findResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
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
            public FindMyWatchService getDefaultInstanceForType() {
                return FindMyWatchService.getDefaultInstance();
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

            public Builder setCancelRequest(FindMyWatchCancelRequest findMyWatchCancelRequest) {
                SingleFieldBuilderV3<FindMyWatchCancelRequest, FindMyWatchCancelRequest.Builder, FindMyWatchCancelRequestOrBuilder> singleFieldBuilderV3 = this.cancelRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    findMyWatchCancelRequest.getClass();
                    this.cancelRequest_ = findMyWatchCancelRequest;
                } else {
                    singleFieldBuilderV3.setMessage(findMyWatchCancelRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setCancelResponse(FindMyWatchResponse findMyWatchResponse) {
                SingleFieldBuilderV3<FindMyWatchResponse, FindMyWatchResponse.Builder, FindMyWatchResponseOrBuilder> singleFieldBuilderV3 = this.cancelResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    findMyWatchResponse.getClass();
                    this.cancelResponse_ = findMyWatchResponse;
                } else {
                    singleFieldBuilderV3.setMessage(findMyWatchResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setFindRequest(FindMyWatchRequest findMyWatchRequest) {
                SingleFieldBuilderV3<FindMyWatchRequest, FindMyWatchRequest.Builder, FindMyWatchRequestOrBuilder> singleFieldBuilderV3 = this.findRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    findMyWatchRequest.getClass();
                    this.findRequest_ = findMyWatchRequest;
                } else {
                    singleFieldBuilderV3.setMessage(findMyWatchRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setFindResponse(FindMyWatchResponse findMyWatchResponse) {
                SingleFieldBuilderV3<FindMyWatchResponse, FindMyWatchResponse.Builder, FindMyWatchResponseOrBuilder> singleFieldBuilderV3 = this.findResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    findMyWatchResponse.getClass();
                    this.findResponse_ = findMyWatchResponse;
                } else {
                    singleFieldBuilderV3.setMessage(findMyWatchResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FindMyWatchService) {
                    return mergeFrom((FindMyWatchService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FindMyWatchService findMyWatchService) {
                if (findMyWatchService == FindMyWatchService.getDefaultInstance()) {
                    return this;
                }
                if (findMyWatchService.hasFindRequest()) {
                    mergeFindRequest(findMyWatchService.getFindRequest());
                }
                if (findMyWatchService.hasFindResponse()) {
                    mergeFindResponse(findMyWatchService.getFindResponse());
                }
                if (findMyWatchService.hasCancelRequest()) {
                    mergeCancelRequest(findMyWatchService.getCancelRequest());
                }
                if (findMyWatchService.hasCancelResponse()) {
                    mergeCancelResponse(findMyWatchService.getCancelResponse());
                }
                mergeUnknownFields(findMyWatchService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FindMyWatchService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ FindMyWatchService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private FindMyWatchService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FindMyWatchService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FindMyWatchService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FindMyWatchService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FindMyWatchService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FindMyWatchService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FindMyWatchService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static FindMyWatchService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FindMyWatchService parseFrom(InputStream inputStream) {
            return (FindMyWatchService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FindMyWatchService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FindMyWatchService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FindMyWatchService parseFrom(CodedInputStream codedInputStream) {
            return (FindMyWatchService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static FindMyWatchService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FindMyWatchService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public enum ResponseStatus implements ProtocolMessageEnum {
        UNKNOWN_RESPONSE_STATUS(0),
        OK(100),
        ERROR(200);

        public static final int ERROR_VALUE = 200;
        public static final int OK_VALUE = 100;
        public static final int UNKNOWN_RESPONSE_STATUS_VALUE = 0;
        private final int value;
        private static final Internal.EnumLiteMap<ResponseStatus> internalValueMap = new Internal.EnumLiteMap<ResponseStatus>() { // from class: com.garmin.proto.generated.GDIFindMyWatch.ResponseStatus.1
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
            if (i14 == 0) {
                return UNKNOWN_RESPONSE_STATUS;
            }
            if (i14 == 100) {
                return OK;
            }
            if (i14 != 200) {
                return null;
            }
            return ERROR;
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIFindMyWatch.getDescriptor().getEnumTypes().get(0);
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
