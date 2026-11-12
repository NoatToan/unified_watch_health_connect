package com.garmin.proto.generated;

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
import com.google.protobuf.Message;
import com.google.protobuf.MessageOrBuilder;
import com.google.protobuf.Parser;
import com.google.protobuf.ProtocolMessageEnum;
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UninitializedMessageException;
import com.google.protobuf.UnknownFieldSet;
import i3.e5;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import vb.h;

/* JADX INFO: loaded from: classes13.dex */
public final class GDIStoreAndForward {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0018GDIStoreAndForward.proto\u0012\u0019GDI.Proto.StoreAndForward\u001a\u0012GDIDataTypes.proto\"¯\u0001\n\u0007Service\u0012P\n\u0017get_stored_data_request\u0018\u0001 \u0001(\u000b2/.GDI.Proto.StoreAndForward.GetStoredDataRequest\u0012R\n\u0018get_stored_data_response\u0018\u0002 \u0001(\u000b20.GDI.Proto.StoreAndForward.GetStoredDataResponse\"Û\u0001\n\u0014GetStoredDataRequest\u0012F\n\u0004type\u0018\u0001 \u0001(\u000e28.GDI.Proto.StoreAndForward.GetStoredDataRequest.DataType\u0012\u0019\n\u0011current_date_time\u0018\u0002 \u0001(\r\u0012\u001a\n\u0012start_time_minutes\u0018\u0003 \u0001(\r\u0012\u0018\n\u0010end_time_minutes\u0018\u0004 \u0001(\r\"*\n\bDataType\u0012\r\n\tHEARTRATE\u0010\u0001\u0012\u000f\n\u000bXCEL_SPRINT\u0010\u0002\"Ó\u0002\n\u0015GetStoredDataResponse\u0012U\n\bresponse\u0018\u0001 \u0001(\u000e2C.GDI.Proto.StoreAndForward.GetStoredDataResponse.GenerationResponse\u0012L\n\u0007objects\u0018\u0002 \u0003(\u000b2;.GDI.Proto.StoreAndForward.GetStoredDataResponse.StoredData\u001aC\n\nStoredData\u0012'\n\u0004uuid\u0018\u0001 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\u0012\f\n\u0004size\u0018\u0002 \u0001(\u0004\"P\n\u0012GenerationResponse\u0012\u000b\n\u0007SUCCESS\u0010\u0001\u0012\n\n\u0006FAILED\u0010\u0002\u0012\u000b\n\u0007ABORTED\u0010\u0003\u0012\u0014\n\u0010TIME_SYNC_FAILED\u0010\u0004B2\n\u001acom.garmin.proto.generatedB\u0012GDIStoreAndForwardH\u0003"}, new Descriptors.FileDescriptor[]{GDIDataTypes.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_StoreAndForward_GetStoredDataRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_StoreAndForward_GetStoredDataRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_StoreAndForward_GetStoredDataResponse_StoredData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_StoreAndForward_GetStoredDataResponse_StoredData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_StoreAndForward_GetStoredDataResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_StoreAndForward_GetStoredDataResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_StoreAndForward_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_StoreAndForward_Service_fieldAccessorTable;

    public interface GetStoredDataRequestOrBuilder extends MessageOrBuilder {
        int getCurrentDateTime();

        int getEndTimeMinutes();

        int getStartTimeMinutes();

        GetStoredDataRequest.DataType getType();

        boolean hasCurrentDateTime();

        boolean hasEndTimeMinutes();

        boolean hasStartTimeMinutes();

        boolean hasType();
    }

    public interface GetStoredDataResponseOrBuilder extends MessageOrBuilder {
        GetStoredDataResponse.StoredData getObjects(int i14);

        int getObjectsCount();

        List<GetStoredDataResponse.StoredData> getObjectsList();

        GetStoredDataResponse.StoredDataOrBuilder getObjectsOrBuilder(int i14);

        List<? extends GetStoredDataResponse.StoredDataOrBuilder> getObjectsOrBuilderList();

        GetStoredDataResponse.GenerationResponse getResponse();

        boolean hasResponse();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        GetStoredDataRequest getGetStoredDataRequest();

        GetStoredDataRequestOrBuilder getGetStoredDataRequestOrBuilder();

        GetStoredDataResponse getGetStoredDataResponse();

        GetStoredDataResponseOrBuilder getGetStoredDataResponseOrBuilder();

        boolean hasGetStoredDataRequest();

        boolean hasGetStoredDataResponse();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_StoreAndForward_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_StoreAndForward_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"GetStoredDataRequest", "GetStoredDataResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_StoreAndForward_GetStoredDataRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_StoreAndForward_GetStoredDataRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"Type", "CurrentDateTime", "StartTimeMinutes", "EndTimeMinutes"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_StoreAndForward_GetStoredDataResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_StoreAndForward_GetStoredDataResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Response", "Objects"});
        Descriptors.Descriptor descriptor5 = descriptor4.getNestedTypes().get(0);
        internal_static_GDI_Proto_StoreAndForward_GetStoredDataResponse_StoredData_descriptor = descriptor5;
        internal_static_GDI_Proto_StoreAndForward_GetStoredDataResponse_StoredData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Uuid", "Size"});
        GDIDataTypes.getDescriptor();
    }

    private GDIStoreAndForward() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class GetStoredDataResponse extends GeneratedMessageV3 implements GetStoredDataResponseOrBuilder {
        public static final int OBJECTS_FIELD_NUMBER = 2;
        public static final int RESPONSE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private List<StoredData> objects_;
        private int response_;
        private static final GetStoredDataResponse DEFAULT_INSTANCE = new GetStoredDataResponse();

        @Deprecated
        public static final Parser<GetStoredDataResponse> PARSER = new AbstractParser<GetStoredDataResponse>() { // from class: com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataResponse.1
            @Override // com.google.protobuf.Parser
            public GetStoredDataResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetStoredDataResponse.newBuilder();
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

        public interface StoredDataOrBuilder extends MessageOrBuilder {
            long getSize();

            GDIDataTypes.UUID getUuid();

            GDIDataTypes.UUIDOrBuilder getUuidOrBuilder();

            boolean hasSize();

            boolean hasUuid();
        }

        private GetStoredDataResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.response_ = 1;
            this.objects_ = Collections.EMPTY_LIST;
        }

        public static GetStoredDataResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIStoreAndForward.internal_static_GDI_Proto_StoreAndForward_GetStoredDataResponse_descriptor;
        }

        public static Builder newBuilder(GetStoredDataResponse getStoredDataResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getStoredDataResponse);
        }

        public static GetStoredDataResponse parseDelimitedFrom(InputStream inputStream) {
            return (GetStoredDataResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetStoredDataResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetStoredDataResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetStoredDataResponse)) {
                return super.equals(obj);
            }
            GetStoredDataResponse getStoredDataResponse = (GetStoredDataResponse) obj;
            if (hasResponse() != getStoredDataResponse.hasResponse()) {
                return false;
            }
            return (!hasResponse() || this.response_ == getStoredDataResponse.response_) && getObjectsList().equals(getStoredDataResponse.getObjectsList()) && getUnknownFields().equals(getStoredDataResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataResponseOrBuilder
        public StoredData getObjects(int i14) {
            return this.objects_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataResponseOrBuilder
        public int getObjectsCount() {
            return this.objects_.size();
        }

        @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataResponseOrBuilder
        public List<StoredData> getObjectsList() {
            return this.objects_;
        }

        @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataResponseOrBuilder
        public StoredDataOrBuilder getObjectsOrBuilder(int i14) {
            return this.objects_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataResponseOrBuilder
        public List<? extends StoredDataOrBuilder> getObjectsOrBuilderList() {
            return this.objects_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetStoredDataResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataResponseOrBuilder
        public GenerationResponse getResponse() {
            GenerationResponse generationResponseForNumber = GenerationResponse.forNumber(this.response_);
            return generationResponseForNumber == null ? GenerationResponse.SUCCESS : generationResponseForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.response_) : 0;
            for (int i15 = 0; i15 < this.objects_.size(); i15++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, this.objects_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataResponseOrBuilder
        public boolean hasResponse() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasResponse()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.response_;
            }
            if (getObjectsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getObjectsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIStoreAndForward.internal_static_GDI_Proto_StoreAndForward_GetStoredDataResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetStoredDataResponse.class, Builder.class);
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
            for (int i14 = 0; i14 < getObjectsCount(); i14++) {
                if (!getObjects(i14).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
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
            return new GetStoredDataResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.response_);
            }
            for (int i14 = 0; i14 < this.objects_.size(); i14++) {
                codedOutputStream.writeMessage(2, this.objects_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class StoredData extends GeneratedMessageV3 implements StoredDataOrBuilder {
            private static final StoredData DEFAULT_INSTANCE = new StoredData();

            @Deprecated
            public static final Parser<StoredData> PARSER = new AbstractParser<StoredData>() { // from class: com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataResponse.StoredData.1
                @Override // com.google.protobuf.Parser
                public StoredData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = StoredData.newBuilder();
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
            public static final int SIZE_FIELD_NUMBER = 2;
            public static final int UUID_FIELD_NUMBER = 1;
            private static final long serialVersionUID = 0;
            private int bitField0_;
            private byte memoizedIsInitialized;
            private long size_;
            private GDIDataTypes.UUID uuid_;

            private StoredData(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.size_ = 0L;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static StoredData getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIStoreAndForward.internal_static_GDI_Proto_StoreAndForward_GetStoredDataResponse_StoredData_descriptor;
            }

            public static Builder newBuilder(StoredData storedData) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(storedData);
            }

            public static StoredData parseDelimitedFrom(InputStream inputStream) {
                return (StoredData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static StoredData parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<StoredData> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof StoredData)) {
                    return super.equals(obj);
                }
                StoredData storedData = (StoredData) obj;
                if (hasUuid() != storedData.hasUuid()) {
                    return false;
                }
                if ((!hasUuid() || getUuid().equals(storedData.getUuid())) && hasSize() == storedData.hasSize()) {
                    return (!hasSize() || getSize() == storedData.getSize()) && getUnknownFields().equals(storedData.getUnknownFields());
                }
                return false;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<StoredData> getParserForType() {
                return PARSER;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public int getSerializedSize() {
                int i14 = this.memoizedSize;
                if (i14 != -1) {
                    return i14;
                }
                int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getUuid()) : 0;
                if ((this.bitField0_ & 2) != 0) {
                    iComputeMessageSize += CodedOutputStream.computeUInt64Size(2, this.size_);
                }
                int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
                this.memoizedSize = serializedSize;
                return serializedSize;
            }

            @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataResponse.StoredDataOrBuilder
            public long getSize() {
                return this.size_;
            }

            @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataResponse.StoredDataOrBuilder
            public GDIDataTypes.UUID getUuid() {
                GDIDataTypes.UUID uuid = this.uuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataResponse.StoredDataOrBuilder
            public GDIDataTypes.UUIDOrBuilder getUuidOrBuilder() {
                GDIDataTypes.UUID uuid = this.uuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataResponse.StoredDataOrBuilder
            public boolean hasSize() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataResponse.StoredDataOrBuilder
            public boolean hasUuid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public int hashCode() {
                int i14 = this.memoizedHashCode;
                if (i14 != 0) {
                    return i14;
                }
                int iHashCode = getDescriptor().hashCode() + 779;
                if (hasUuid()) {
                    iHashCode = e5.c(iHashCode, 37, 1, 53) + getUuid().hashCode();
                }
                if (hasSize()) {
                    iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashLong(getSize());
                }
                int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
                this.memoizedHashCode = iHashCode2;
                return iHashCode2;
            }

            @Override // com.google.protobuf.GeneratedMessageV3
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIStoreAndForward.internal_static_GDI_Proto_StoreAndForward_GetStoredDataResponse_StoredData_fieldAccessorTable.ensureFieldAccessorsInitialized(StoredData.class, Builder.class);
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
                if (!hasUuid() || getUuid().isInitialized()) {
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
                return new StoredData();
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder toBuilder() {
                int i14 = 0;
                return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
            public void writeTo(CodedOutputStream codedOutputStream) {
                if ((this.bitField0_ & 1) != 0) {
                    codedOutputStream.writeMessage(1, getUuid());
                }
                if ((this.bitField0_ & 2) != 0) {
                    codedOutputStream.writeUInt64(2, this.size_);
                }
                getUnknownFields().writeTo(codedOutputStream);
            }

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements StoredDataOrBuilder {
                private int bitField0_;
                private long size_;
                private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> uuidBuilder_;
                private GDIDataTypes.UUID uuid_;

                private Builder() {
                    maybeForceBuilderInitialization();
                }

                private void buildPartial0(StoredData storedData) {
                    int i14;
                    int i15 = this.bitField0_;
                    if ((i15 & 1) != 0) {
                        SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                        storedData.uuid_ = singleFieldBuilderV3 == null ? this.uuid_ : (GDIDataTypes.UUID) singleFieldBuilderV3.build();
                        i14 = 1;
                    } else {
                        i14 = 0;
                    }
                    if ((i15 & 2) != 0) {
                        storedData.size_ = this.size_;
                        i14 |= 2;
                    }
                    storedData.bitField0_ |= i14;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return GDIStoreAndForward.internal_static_GDI_Proto_StoreAndForward_GetStoredDataResponse_StoredData_descriptor;
                }

                private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> getUuidFieldBuilder() {
                    if (this.uuidBuilder_ == null) {
                        this.uuidBuilder_ = new SingleFieldBuilderV3<>(getUuid(), getParentForChildren(), isClean());
                        this.uuid_ = null;
                    }
                    return this.uuidBuilder_;
                }

                private void maybeForceBuilderInitialization() {
                    if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                        getUuidFieldBuilder();
                    }
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public StoredData build() {
                    StoredData storedDataBuildPartial = buildPartial();
                    if (storedDataBuildPartial.isInitialized()) {
                        return storedDataBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) storedDataBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public StoredData buildPartial() {
                    StoredData storedData = new StoredData(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(storedData);
                    }
                    onBuilt();
                    return storedData;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public Builder clear() {
                    super.clear();
                    this.bitField0_ = 0;
                    this.uuid_ = null;
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.uuidBuilder_ = null;
                    }
                    this.size_ = 0L;
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

                public Builder clearSize() {
                    this.bitField0_ &= -3;
                    this.size_ = 0L;
                    onChanged();
                    return this;
                }

                public Builder clearUuid() {
                    this.bitField0_ &= -2;
                    this.uuid_ = null;
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.dispose();
                        this.uuidBuilder_ = null;
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
                    return GDIStoreAndForward.internal_static_GDI_Proto_StoreAndForward_GetStoredDataResponse_StoredData_descriptor;
                }

                @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataResponse.StoredDataOrBuilder
                public long getSize() {
                    return this.size_;
                }

                @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataResponse.StoredDataOrBuilder
                public GDIDataTypes.UUID getUuid() {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (GDIDataTypes.UUID) singleFieldBuilderV3.getMessage();
                    }
                    GDIDataTypes.UUID uuid = this.uuid_;
                    return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
                }

                public GDIDataTypes.UUID.Builder getUuidBuilder() {
                    this.bitField0_ |= 1;
                    onChanged();
                    return (GDIDataTypes.UUID.Builder) getUuidFieldBuilder().getBuilder();
                }

                @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataResponse.StoredDataOrBuilder
                public GDIDataTypes.UUIDOrBuilder getUuidOrBuilder() {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                    }
                    GDIDataTypes.UUID uuid = this.uuid_;
                    return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
                }

                @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataResponse.StoredDataOrBuilder
                public boolean hasSize() {
                    return (this.bitField0_ & 2) != 0;
                }

                @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataResponse.StoredDataOrBuilder
                public boolean hasUuid() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return GDIStoreAndForward.internal_static_GDI_Proto_StoreAndForward_GetStoredDataResponse_StoredData_fieldAccessorTable.ensureFieldAccessorsInitialized(StoredData.class, Builder.class);
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
                public final boolean isInitialized() {
                    return !hasUuid() || getUuid().isInitialized();
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
                                        codedInputStream.readMessage(getUuidFieldBuilder().getBuilder(), extensionRegistryLite);
                                        this.bitField0_ |= 1;
                                    } else if (tag == 16) {
                                        this.size_ = codedInputStream.readUInt64();
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

                public Builder mergeUuid(GDIDataTypes.UUID uuid) {
                    GDIDataTypes.UUID uuid2;
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                    if (singleFieldBuilderV3 != null) {
                        singleFieldBuilderV3.mergeFrom(uuid);
                    } else if ((this.bitField0_ & 1) == 0 || (uuid2 = this.uuid_) == null || uuid2 == GDIDataTypes.UUID.getDefaultInstance()) {
                        this.uuid_ = uuid;
                    } else {
                        getUuidBuilder().mergeFrom(uuid);
                    }
                    if (this.uuid_ != null) {
                        this.bitField0_ |= 1;
                        onChanged();
                    }
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

                public Builder setSize(long j8) {
                    this.size_ = j8;
                    this.bitField0_ |= 2;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                    return (Builder) super.setUnknownFields(unknownFieldSet);
                }

                public Builder setUuid(GDIDataTypes.UUID.Builder builder) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        this.uuid_ = builder.build();
                    } else {
                        singleFieldBuilderV3.setMessage(builder.build());
                    }
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
                public StoredData getDefaultInstanceForType() {
                    return StoredData.getDefaultInstance();
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

                public Builder setUuid(GDIDataTypes.UUID uuid) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                    if (singleFieldBuilderV3 == null) {
                        uuid.getClass();
                        this.uuid_ = uuid;
                    } else {
                        singleFieldBuilderV3.setMessage(uuid);
                    }
                    this.bitField0_ |= 1;
                    onChanged();
                    return this;
                }

                @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
                public Builder mergeFrom(Message message) {
                    if (message instanceof StoredData) {
                        return mergeFrom((StoredData) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(StoredData storedData) {
                    if (storedData == StoredData.getDefaultInstance()) {
                        return this;
                    }
                    if (storedData.hasUuid()) {
                        mergeUuid(storedData.getUuid());
                    }
                    if (storedData.hasSize()) {
                        setSize(storedData.getSize());
                    }
                    mergeUnknownFields(storedData.getUnknownFields());
                    onChanged();
                    return this;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public StoredData getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static StoredData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (StoredData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static StoredData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static StoredData parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            public /* synthetic */ StoredData(Builder builder) {
                this((GeneratedMessageV3.Builder<?>) builder);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static StoredData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            private StoredData() {
                this.size_ = 0L;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static StoredData parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            public static StoredData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static StoredData parseFrom(InputStream inputStream) {
                return (StoredData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static StoredData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (StoredData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static StoredData parseFrom(CodedInputStream codedInputStream) {
                return (StoredData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static StoredData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (StoredData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetStoredDataResponseOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<StoredData, StoredData.Builder, StoredDataOrBuilder> objectsBuilder_;
            private List<StoredData> objects_;
            private int response_;

            private Builder() {
                this.response_ = 1;
                this.objects_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(GetStoredDataResponse getStoredDataResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    getStoredDataResponse.response_ = this.response_;
                } else {
                    i14 = 0;
                }
                getStoredDataResponse.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(GetStoredDataResponse getStoredDataResponse) {
                RepeatedFieldBuilderV3<StoredData, StoredData.Builder, StoredDataOrBuilder> repeatedFieldBuilderV3 = this.objectsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    getStoredDataResponse.objects_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 2) != 0) {
                    this.objects_ = Collections.unmodifiableList(this.objects_);
                    this.bitField0_ &= -3;
                }
                getStoredDataResponse.objects_ = this.objects_;
            }

            private void ensureObjectsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.objects_ = new ArrayList(this.objects_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIStoreAndForward.internal_static_GDI_Proto_StoreAndForward_GetStoredDataResponse_descriptor;
            }

            private RepeatedFieldBuilderV3<StoredData, StoredData.Builder, StoredDataOrBuilder> getObjectsFieldBuilder() {
                if (this.objectsBuilder_ == null) {
                    this.objectsBuilder_ = new RepeatedFieldBuilderV3<>(this.objects_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.objects_ = null;
                }
                return this.objectsBuilder_;
            }

            public Builder addAllObjects(Iterable<? extends StoredData> iterable) {
                RepeatedFieldBuilderV3<StoredData, StoredData.Builder, StoredDataOrBuilder> repeatedFieldBuilderV3 = this.objectsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureObjectsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.objects_);
                onChanged();
                return this;
            }

            public Builder addObjects(StoredData.Builder builder) {
                RepeatedFieldBuilderV3<StoredData, StoredData.Builder, StoredDataOrBuilder> repeatedFieldBuilderV3 = this.objectsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureObjectsIsMutable();
                this.objects_.add(builder.build());
                onChanged();
                return this;
            }

            public StoredData.Builder addObjectsBuilder() {
                return (StoredData.Builder) getObjectsFieldBuilder().addBuilder(StoredData.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetStoredDataResponse build() {
                GetStoredDataResponse getStoredDataResponseBuildPartial = buildPartial();
                if (getStoredDataResponseBuildPartial.isInitialized()) {
                    return getStoredDataResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getStoredDataResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetStoredDataResponse buildPartial() {
                GetStoredDataResponse getStoredDataResponse = new GetStoredDataResponse(this);
                buildPartialRepeatedFields(getStoredDataResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(getStoredDataResponse);
                }
                onBuilt();
                return getStoredDataResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.response_ = 1;
                RepeatedFieldBuilderV3<StoredData, StoredData.Builder, StoredDataOrBuilder> repeatedFieldBuilderV3 = this.objectsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.objects_ = Collections.EMPTY_LIST;
                } else {
                    this.objects_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearObjects() {
                RepeatedFieldBuilderV3<StoredData, StoredData.Builder, StoredDataOrBuilder> repeatedFieldBuilderV3 = this.objectsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.objects_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearResponse() {
                this.bitField0_ &= -2;
                this.response_ = 1;
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
                return GDIStoreAndForward.internal_static_GDI_Proto_StoreAndForward_GetStoredDataResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataResponseOrBuilder
            public StoredData getObjects(int i14) {
                RepeatedFieldBuilderV3<StoredData, StoredData.Builder, StoredDataOrBuilder> repeatedFieldBuilderV3 = this.objectsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.objects_.get(i14) : (StoredData) repeatedFieldBuilderV3.getMessage(i14);
            }

            public StoredData.Builder getObjectsBuilder(int i14) {
                return (StoredData.Builder) getObjectsFieldBuilder().getBuilder(i14);
            }

            public List<StoredData.Builder> getObjectsBuilderList() {
                return getObjectsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataResponseOrBuilder
            public int getObjectsCount() {
                RepeatedFieldBuilderV3<StoredData, StoredData.Builder, StoredDataOrBuilder> repeatedFieldBuilderV3 = this.objectsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.objects_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataResponseOrBuilder
            public List<StoredData> getObjectsList() {
                RepeatedFieldBuilderV3<StoredData, StoredData.Builder, StoredDataOrBuilder> repeatedFieldBuilderV3 = this.objectsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.objects_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataResponseOrBuilder
            public StoredDataOrBuilder getObjectsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<StoredData, StoredData.Builder, StoredDataOrBuilder> repeatedFieldBuilderV3 = this.objectsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.objects_.get(i14) : (StoredDataOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataResponseOrBuilder
            public List<? extends StoredDataOrBuilder> getObjectsOrBuilderList() {
                RepeatedFieldBuilderV3<StoredData, StoredData.Builder, StoredDataOrBuilder> repeatedFieldBuilderV3 = this.objectsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.objects_);
            }

            @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataResponseOrBuilder
            public GenerationResponse getResponse() {
                GenerationResponse generationResponseForNumber = GenerationResponse.forNumber(this.response_);
                return generationResponseForNumber == null ? GenerationResponse.SUCCESS : generationResponseForNumber;
            }

            @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataResponseOrBuilder
            public boolean hasResponse() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIStoreAndForward.internal_static_GDI_Proto_StoreAndForward_GetStoredDataResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(GetStoredDataResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getObjectsCount(); i14++) {
                    if (!getObjects(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(GetStoredDataResponse getStoredDataResponse) {
                if (getStoredDataResponse == GetStoredDataResponse.getDefaultInstance()) {
                    return this;
                }
                if (getStoredDataResponse.hasResponse()) {
                    setResponse(getStoredDataResponse.getResponse());
                }
                if (this.objectsBuilder_ == null) {
                    if (!getStoredDataResponse.objects_.isEmpty()) {
                        if (this.objects_.isEmpty()) {
                            this.objects_ = getStoredDataResponse.objects_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureObjectsIsMutable();
                            this.objects_.addAll(getStoredDataResponse.objects_);
                        }
                        onChanged();
                    }
                } else if (!getStoredDataResponse.objects_.isEmpty()) {
                    boolean zIsEmpty = this.objectsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<StoredData, StoredData.Builder, StoredDataOrBuilder> repeatedFieldBuilderV3 = this.objectsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.objectsBuilder_ = null;
                        this.objects_ = getStoredDataResponse.objects_;
                        this.bitField0_ &= -3;
                        this.objectsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getObjectsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(getStoredDataResponse.objects_);
                    }
                }
                mergeUnknownFields(getStoredDataResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeObjects(int i14) {
                RepeatedFieldBuilderV3<StoredData, StoredData.Builder, StoredDataOrBuilder> repeatedFieldBuilderV3 = this.objectsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureObjectsIsMutable();
                this.objects_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setObjects(int i14, StoredData.Builder builder) {
                RepeatedFieldBuilderV3<StoredData, StoredData.Builder, StoredDataOrBuilder> repeatedFieldBuilderV3 = this.objectsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureObjectsIsMutable();
                this.objects_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setResponse(GenerationResponse generationResponse) {
                generationResponse.getClass();
                this.bitField0_ |= 1;
                this.response_ = generationResponse.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GetStoredDataResponse getDefaultInstanceForType() {
                return GetStoredDataResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.response_ = 1;
                this.objects_ = Collections.EMPTY_LIST;
            }

            public StoredData.Builder addObjectsBuilder(int i14) {
                return (StoredData.Builder) getObjectsFieldBuilder().addBuilder(i14, StoredData.getDefaultInstance());
            }

            public Builder addObjects(int i14, StoredData storedData) {
                RepeatedFieldBuilderV3<StoredData, StoredData.Builder, StoredDataOrBuilder> repeatedFieldBuilderV3 = this.objectsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    storedData.getClass();
                    ensureObjectsIsMutable();
                    this.objects_.add(i14, storedData);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, storedData);
                return this;
            }

            public Builder setObjects(int i14, StoredData storedData) {
                RepeatedFieldBuilderV3<StoredData, StoredData.Builder, StoredDataOrBuilder> repeatedFieldBuilderV3 = this.objectsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    storedData.getClass();
                    ensureObjectsIsMutable();
                    this.objects_.set(i14, storedData);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, storedData);
                return this;
            }

            public Builder addObjects(StoredData storedData) {
                RepeatedFieldBuilderV3<StoredData, StoredData.Builder, StoredDataOrBuilder> repeatedFieldBuilderV3 = this.objectsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    storedData.getClass();
                    ensureObjectsIsMutable();
                    this.objects_.add(storedData);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(storedData);
                return this;
            }

            public Builder addObjects(int i14, StoredData.Builder builder) {
                RepeatedFieldBuilderV3<StoredData, StoredData.Builder, StoredDataOrBuilder> repeatedFieldBuilderV3 = this.objectsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureObjectsIsMutable();
                    this.objects_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetStoredDataResponse) {
                    return mergeFrom((GetStoredDataResponse) message);
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
                                if (tag == 8) {
                                    int i14 = codedInputStream.readEnum();
                                    if (GenerationResponse.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.response_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    StoredData storedData = (StoredData) codedInputStream.readMessage(StoredData.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<StoredData, StoredData.Builder, StoredDataOrBuilder> repeatedFieldBuilderV3 = this.objectsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureObjectsIsMutable();
                                        this.objects_.add(storedData);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(storedData);
                                    }
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

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetStoredDataResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GetStoredDataResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetStoredDataResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetStoredDataResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetStoredDataResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetStoredDataResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GetStoredDataResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GetStoredDataResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private GetStoredDataResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.response_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetStoredDataResponse parseFrom(InputStream inputStream) {
            return (GetStoredDataResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GetStoredDataResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetStoredDataResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ GetStoredDataResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static GetStoredDataResponse parseFrom(CodedInputStream codedInputStream) {
            return (GetStoredDataResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GetStoredDataResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetStoredDataResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum GenerationResponse implements ProtocolMessageEnum {
            SUCCESS(1),
            FAILED(2),
            ABORTED(3),
            TIME_SYNC_FAILED(4);

            public static final int ABORTED_VALUE = 3;
            public static final int FAILED_VALUE = 2;
            public static final int SUCCESS_VALUE = 1;
            public static final int TIME_SYNC_FAILED_VALUE = 4;
            private final int value;
            private static final Internal.EnumLiteMap<GenerationResponse> internalValueMap = new Internal.EnumLiteMap<GenerationResponse>() { // from class: com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataResponse.GenerationResponse.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public GenerationResponse findValueByNumber(int i14) {
                    return GenerationResponse.forNumber(i14);
                }
            };
            private static final GenerationResponse[] VALUES = values();

            GenerationResponse(int i14) {
                this.value = i14;
            }

            public static GenerationResponse forNumber(int i14) {
                if (i14 == 1) {
                    return SUCCESS;
                }
                if (i14 == 2) {
                    return FAILED;
                }
                if (i14 == 3) {
                    return ABORTED;
                }
                if (i14 != 4) {
                    return null;
                }
                return TIME_SYNC_FAILED;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return GetStoredDataResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<GenerationResponse> internalGetValueMap() {
                return internalValueMap;
            }

            public static GenerationResponse valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static GenerationResponse valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class GetStoredDataRequest extends GeneratedMessageV3 implements GetStoredDataRequestOrBuilder {
        public static final int CURRENT_DATE_TIME_FIELD_NUMBER = 2;
        public static final int END_TIME_MINUTES_FIELD_NUMBER = 4;
        public static final int START_TIME_MINUTES_FIELD_NUMBER = 3;
        public static final int TYPE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int currentDateTime_;
        private int endTimeMinutes_;
        private byte memoizedIsInitialized;
        private int startTimeMinutes_;
        private int type_;
        private static final GetStoredDataRequest DEFAULT_INSTANCE = new GetStoredDataRequest();

        @Deprecated
        public static final Parser<GetStoredDataRequest> PARSER = new AbstractParser<GetStoredDataRequest>() { // from class: com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataRequest.1
            @Override // com.google.protobuf.Parser
            public GetStoredDataRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GetStoredDataRequest.newBuilder();
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

        private GetStoredDataRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.type_ = 1;
            this.currentDateTime_ = 0;
            this.startTimeMinutes_ = 0;
            this.endTimeMinutes_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GetStoredDataRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIStoreAndForward.internal_static_GDI_Proto_StoreAndForward_GetStoredDataRequest_descriptor;
        }

        public static Builder newBuilder(GetStoredDataRequest getStoredDataRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(getStoredDataRequest);
        }

        public static GetStoredDataRequest parseDelimitedFrom(InputStream inputStream) {
            return (GetStoredDataRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GetStoredDataRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GetStoredDataRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GetStoredDataRequest)) {
                return super.equals(obj);
            }
            GetStoredDataRequest getStoredDataRequest = (GetStoredDataRequest) obj;
            if (hasType() != getStoredDataRequest.hasType()) {
                return false;
            }
            if ((hasType() && this.type_ != getStoredDataRequest.type_) || hasCurrentDateTime() != getStoredDataRequest.hasCurrentDateTime()) {
                return false;
            }
            if ((hasCurrentDateTime() && getCurrentDateTime() != getStoredDataRequest.getCurrentDateTime()) || hasStartTimeMinutes() != getStoredDataRequest.hasStartTimeMinutes()) {
                return false;
            }
            if ((!hasStartTimeMinutes() || getStartTimeMinutes() == getStoredDataRequest.getStartTimeMinutes()) && hasEndTimeMinutes() == getStoredDataRequest.hasEndTimeMinutes()) {
                return (!hasEndTimeMinutes() || getEndTimeMinutes() == getStoredDataRequest.getEndTimeMinutes()) && getUnknownFields().equals(getStoredDataRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataRequestOrBuilder
        public int getCurrentDateTime() {
            return this.currentDateTime_;
        }

        @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataRequestOrBuilder
        public int getEndTimeMinutes() {
            return this.endTimeMinutes_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GetStoredDataRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.type_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.currentDateTime_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(3, this.startTimeMinutes_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(4, this.endTimeMinutes_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataRequestOrBuilder
        public int getStartTimeMinutes() {
            return this.startTimeMinutes_;
        }

        @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataRequestOrBuilder
        public DataType getType() {
            DataType dataTypeForNumber = DataType.forNumber(this.type_);
            return dataTypeForNumber == null ? DataType.HEARTRATE : dataTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataRequestOrBuilder
        public boolean hasCurrentDateTime() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataRequestOrBuilder
        public boolean hasEndTimeMinutes() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataRequestOrBuilder
        public boolean hasStartTimeMinutes() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataRequestOrBuilder
        public boolean hasType() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasType()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.type_;
            }
            if (hasCurrentDateTime()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getCurrentDateTime();
            }
            if (hasStartTimeMinutes()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getStartTimeMinutes();
            }
            if (hasEndTimeMinutes()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getEndTimeMinutes();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIStoreAndForward.internal_static_GDI_Proto_StoreAndForward_GetStoredDataRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetStoredDataRequest.class, Builder.class);
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
            return new GetStoredDataRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.type_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.currentDateTime_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.startTimeMinutes_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.endTimeMinutes_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GetStoredDataRequestOrBuilder {
            private int bitField0_;
            private int currentDateTime_;
            private int endTimeMinutes_;
            private int startTimeMinutes_;
            private int type_;

            private Builder() {
                this.type_ = 1;
            }

            private void buildPartial0(GetStoredDataRequest getStoredDataRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    getStoredDataRequest.type_ = this.type_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    getStoredDataRequest.currentDateTime_ = this.currentDateTime_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    getStoredDataRequest.startTimeMinutes_ = this.startTimeMinutes_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    getStoredDataRequest.endTimeMinutes_ = this.endTimeMinutes_;
                    i14 |= 8;
                }
                getStoredDataRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIStoreAndForward.internal_static_GDI_Proto_StoreAndForward_GetStoredDataRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetStoredDataRequest build() {
                GetStoredDataRequest getStoredDataRequestBuildPartial = buildPartial();
                if (getStoredDataRequestBuildPartial.isInitialized()) {
                    return getStoredDataRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) getStoredDataRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GetStoredDataRequest buildPartial() {
                GetStoredDataRequest getStoredDataRequest = new GetStoredDataRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(getStoredDataRequest);
                }
                onBuilt();
                return getStoredDataRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.type_ = 1;
                this.currentDateTime_ = 0;
                this.startTimeMinutes_ = 0;
                this.endTimeMinutes_ = 0;
                return this;
            }

            public Builder clearCurrentDateTime() {
                this.bitField0_ &= -3;
                this.currentDateTime_ = 0;
                onChanged();
                return this;
            }

            public Builder clearEndTimeMinutes() {
                this.bitField0_ &= -9;
                this.endTimeMinutes_ = 0;
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

            public Builder clearStartTimeMinutes() {
                this.bitField0_ &= -5;
                this.startTimeMinutes_ = 0;
                onChanged();
                return this;
            }

            public Builder clearType() {
                this.bitField0_ &= -2;
                this.type_ = 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataRequestOrBuilder
            public int getCurrentDateTime() {
                return this.currentDateTime_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIStoreAndForward.internal_static_GDI_Proto_StoreAndForward_GetStoredDataRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataRequestOrBuilder
            public int getEndTimeMinutes() {
                return this.endTimeMinutes_;
            }

            @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataRequestOrBuilder
            public int getStartTimeMinutes() {
                return this.startTimeMinutes_;
            }

            @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataRequestOrBuilder
            public DataType getType() {
                DataType dataTypeForNumber = DataType.forNumber(this.type_);
                return dataTypeForNumber == null ? DataType.HEARTRATE : dataTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataRequestOrBuilder
            public boolean hasCurrentDateTime() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataRequestOrBuilder
            public boolean hasEndTimeMinutes() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataRequestOrBuilder
            public boolean hasStartTimeMinutes() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataRequestOrBuilder
            public boolean hasType() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIStoreAndForward.internal_static_GDI_Proto_StoreAndForward_GetStoredDataRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(GetStoredDataRequest.class, Builder.class);
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
                                    if (DataType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.type_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    this.currentDateTime_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.startTimeMinutes_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.endTimeMinutes_ = codedInputStream.readUInt32();
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

            public Builder setCurrentDateTime(int i14) {
                this.currentDateTime_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setEndTimeMinutes(int i14) {
                this.endTimeMinutes_ = i14;
                this.bitField0_ |= 8;
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

            public Builder setStartTimeMinutes(int i14) {
                this.startTimeMinutes_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setType(DataType dataType) {
                dataType.getClass();
                this.bitField0_ |= 1;
                this.type_ = dataType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GetStoredDataRequest getDefaultInstanceForType() {
                return GetStoredDataRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.type_ = 1;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GetStoredDataRequest) {
                    return mergeFrom((GetStoredDataRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GetStoredDataRequest getStoredDataRequest) {
                if (getStoredDataRequest == GetStoredDataRequest.getDefaultInstance()) {
                    return this;
                }
                if (getStoredDataRequest.hasType()) {
                    setType(getStoredDataRequest.getType());
                }
                if (getStoredDataRequest.hasCurrentDateTime()) {
                    setCurrentDateTime(getStoredDataRequest.getCurrentDateTime());
                }
                if (getStoredDataRequest.hasStartTimeMinutes()) {
                    setStartTimeMinutes(getStoredDataRequest.getStartTimeMinutes());
                }
                if (getStoredDataRequest.hasEndTimeMinutes()) {
                    setEndTimeMinutes(getStoredDataRequest.getEndTimeMinutes());
                }
                mergeUnknownFields(getStoredDataRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GetStoredDataRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GetStoredDataRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetStoredDataRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GetStoredDataRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GetStoredDataRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GetStoredDataRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GetStoredDataRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GetStoredDataRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GetStoredDataRequest parseFrom(InputStream inputStream) {
            return (GetStoredDataRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GetStoredDataRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetStoredDataRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ GetStoredDataRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private GetStoredDataRequest() {
            this.currentDateTime_ = 0;
            this.startTimeMinutes_ = 0;
            this.endTimeMinutes_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.type_ = 1;
        }

        public static GetStoredDataRequest parseFrom(CodedInputStream codedInputStream) {
            return (GetStoredDataRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GetStoredDataRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GetStoredDataRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum DataType implements ProtocolMessageEnum {
            HEARTRATE(1),
            XCEL_SPRINT(2);

            public static final int HEARTRATE_VALUE = 1;
            public static final int XCEL_SPRINT_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<DataType> internalValueMap = new Internal.EnumLiteMap<DataType>() { // from class: com.garmin.proto.generated.GDIStoreAndForward.GetStoredDataRequest.DataType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public DataType findValueByNumber(int i14) {
                    return DataType.forNumber(i14);
                }
            };
            private static final DataType[] VALUES = values();

            DataType(int i14) {
                this.value = i14;
            }

            public static DataType forNumber(int i14) {
                if (i14 == 1) {
                    return HEARTRATE;
                }
                if (i14 != 2) {
                    return null;
                }
                return XCEL_SPRINT;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return GetStoredDataRequest.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<DataType> internalGetValueMap() {
                return internalValueMap;
            }

            public static DataType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static DataType valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int GET_STORED_DATA_REQUEST_FIELD_NUMBER = 1;
        public static final int GET_STORED_DATA_RESPONSE_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private GetStoredDataRequest getStoredDataRequest_;
        private GetStoredDataResponse getStoredDataResponse_;
        private byte memoizedIsInitialized;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIStoreAndForward.Service.1
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
            return GDIStoreAndForward.internal_static_GDI_Proto_StoreAndForward_Service_descriptor;
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
            if (hasGetStoredDataRequest() != service.hasGetStoredDataRequest()) {
                return false;
            }
            if ((!hasGetStoredDataRequest() || getGetStoredDataRequest().equals(service.getGetStoredDataRequest())) && hasGetStoredDataResponse() == service.hasGetStoredDataResponse()) {
                return (!hasGetStoredDataResponse() || getGetStoredDataResponse().equals(service.getGetStoredDataResponse())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIStoreAndForward.ServiceOrBuilder
        public GetStoredDataRequest getGetStoredDataRequest() {
            GetStoredDataRequest getStoredDataRequest = this.getStoredDataRequest_;
            return getStoredDataRequest == null ? GetStoredDataRequest.getDefaultInstance() : getStoredDataRequest;
        }

        @Override // com.garmin.proto.generated.GDIStoreAndForward.ServiceOrBuilder
        public GetStoredDataRequestOrBuilder getGetStoredDataRequestOrBuilder() {
            GetStoredDataRequest getStoredDataRequest = this.getStoredDataRequest_;
            return getStoredDataRequest == null ? GetStoredDataRequest.getDefaultInstance() : getStoredDataRequest;
        }

        @Override // com.garmin.proto.generated.GDIStoreAndForward.ServiceOrBuilder
        public GetStoredDataResponse getGetStoredDataResponse() {
            GetStoredDataResponse getStoredDataResponse = this.getStoredDataResponse_;
            return getStoredDataResponse == null ? GetStoredDataResponse.getDefaultInstance() : getStoredDataResponse;
        }

        @Override // com.garmin.proto.generated.GDIStoreAndForward.ServiceOrBuilder
        public GetStoredDataResponseOrBuilder getGetStoredDataResponseOrBuilder() {
            GetStoredDataResponse getStoredDataResponse = this.getStoredDataResponse_;
            return getStoredDataResponse == null ? GetStoredDataResponse.getDefaultInstance() : getStoredDataResponse;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getGetStoredDataRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getGetStoredDataResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIStoreAndForward.ServiceOrBuilder
        public boolean hasGetStoredDataRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIStoreAndForward.ServiceOrBuilder
        public boolean hasGetStoredDataResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasGetStoredDataRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getGetStoredDataRequest().hashCode();
            }
            if (hasGetStoredDataResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getGetStoredDataResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIStoreAndForward.internal_static_GDI_Proto_StoreAndForward_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
            if (!hasGetStoredDataResponse() || getGetStoredDataResponse().isInitialized()) {
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
                codedOutputStream.writeMessage(1, getGetStoredDataRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getGetStoredDataResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<GetStoredDataRequest, GetStoredDataRequest.Builder, GetStoredDataRequestOrBuilder> getStoredDataRequestBuilder_;
            private GetStoredDataRequest getStoredDataRequest_;
            private SingleFieldBuilderV3<GetStoredDataResponse, GetStoredDataResponse.Builder, GetStoredDataResponseOrBuilder> getStoredDataResponseBuilder_;
            private GetStoredDataResponse getStoredDataResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<GetStoredDataRequest, GetStoredDataRequest.Builder, GetStoredDataRequestOrBuilder> singleFieldBuilderV3 = this.getStoredDataRequestBuilder_;
                    service.getStoredDataRequest_ = singleFieldBuilderV3 == null ? this.getStoredDataRequest_ : (GetStoredDataRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<GetStoredDataResponse, GetStoredDataResponse.Builder, GetStoredDataResponseOrBuilder> singleFieldBuilderV4 = this.getStoredDataResponseBuilder_;
                    service.getStoredDataResponse_ = singleFieldBuilderV4 == null ? this.getStoredDataResponse_ : (GetStoredDataResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                service.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIStoreAndForward.internal_static_GDI_Proto_StoreAndForward_Service_descriptor;
            }

            private SingleFieldBuilderV3<GetStoredDataRequest, GetStoredDataRequest.Builder, GetStoredDataRequestOrBuilder> getGetStoredDataRequestFieldBuilder() {
                if (this.getStoredDataRequestBuilder_ == null) {
                    this.getStoredDataRequestBuilder_ = new SingleFieldBuilderV3<>(getGetStoredDataRequest(), getParentForChildren(), isClean());
                    this.getStoredDataRequest_ = null;
                }
                return this.getStoredDataRequestBuilder_;
            }

            private SingleFieldBuilderV3<GetStoredDataResponse, GetStoredDataResponse.Builder, GetStoredDataResponseOrBuilder> getGetStoredDataResponseFieldBuilder() {
                if (this.getStoredDataResponseBuilder_ == null) {
                    this.getStoredDataResponseBuilder_ = new SingleFieldBuilderV3<>(getGetStoredDataResponse(), getParentForChildren(), isClean());
                    this.getStoredDataResponse_ = null;
                }
                return this.getStoredDataResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getGetStoredDataRequestFieldBuilder();
                    getGetStoredDataResponseFieldBuilder();
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
                this.getStoredDataRequest_ = null;
                SingleFieldBuilderV3<GetStoredDataRequest, GetStoredDataRequest.Builder, GetStoredDataRequestOrBuilder> singleFieldBuilderV3 = this.getStoredDataRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.getStoredDataRequestBuilder_ = null;
                }
                this.getStoredDataResponse_ = null;
                SingleFieldBuilderV3<GetStoredDataResponse, GetStoredDataResponse.Builder, GetStoredDataResponseOrBuilder> singleFieldBuilderV4 = this.getStoredDataResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.getStoredDataResponseBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGetStoredDataRequest() {
                this.bitField0_ &= -2;
                this.getStoredDataRequest_ = null;
                SingleFieldBuilderV3<GetStoredDataRequest, GetStoredDataRequest.Builder, GetStoredDataRequestOrBuilder> singleFieldBuilderV3 = this.getStoredDataRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.getStoredDataRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearGetStoredDataResponse() {
                this.bitField0_ &= -3;
                this.getStoredDataResponse_ = null;
                SingleFieldBuilderV3<GetStoredDataResponse, GetStoredDataResponse.Builder, GetStoredDataResponseOrBuilder> singleFieldBuilderV3 = this.getStoredDataResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.getStoredDataResponseBuilder_ = null;
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIStoreAndForward.internal_static_GDI_Proto_StoreAndForward_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIStoreAndForward.ServiceOrBuilder
            public GetStoredDataRequest getGetStoredDataRequest() {
                SingleFieldBuilderV3<GetStoredDataRequest, GetStoredDataRequest.Builder, GetStoredDataRequestOrBuilder> singleFieldBuilderV3 = this.getStoredDataRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetStoredDataRequest) singleFieldBuilderV3.getMessage();
                }
                GetStoredDataRequest getStoredDataRequest = this.getStoredDataRequest_;
                return getStoredDataRequest == null ? GetStoredDataRequest.getDefaultInstance() : getStoredDataRequest;
            }

            public GetStoredDataRequest.Builder getGetStoredDataRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GetStoredDataRequest.Builder) getGetStoredDataRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIStoreAndForward.ServiceOrBuilder
            public GetStoredDataRequestOrBuilder getGetStoredDataRequestOrBuilder() {
                SingleFieldBuilderV3<GetStoredDataRequest, GetStoredDataRequest.Builder, GetStoredDataRequestOrBuilder> singleFieldBuilderV3 = this.getStoredDataRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetStoredDataRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GetStoredDataRequest getStoredDataRequest = this.getStoredDataRequest_;
                return getStoredDataRequest == null ? GetStoredDataRequest.getDefaultInstance() : getStoredDataRequest;
            }

            @Override // com.garmin.proto.generated.GDIStoreAndForward.ServiceOrBuilder
            public GetStoredDataResponse getGetStoredDataResponse() {
                SingleFieldBuilderV3<GetStoredDataResponse, GetStoredDataResponse.Builder, GetStoredDataResponseOrBuilder> singleFieldBuilderV3 = this.getStoredDataResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetStoredDataResponse) singleFieldBuilderV3.getMessage();
                }
                GetStoredDataResponse getStoredDataResponse = this.getStoredDataResponse_;
                return getStoredDataResponse == null ? GetStoredDataResponse.getDefaultInstance() : getStoredDataResponse;
            }

            public GetStoredDataResponse.Builder getGetStoredDataResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (GetStoredDataResponse.Builder) getGetStoredDataResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIStoreAndForward.ServiceOrBuilder
            public GetStoredDataResponseOrBuilder getGetStoredDataResponseOrBuilder() {
                SingleFieldBuilderV3<GetStoredDataResponse, GetStoredDataResponse.Builder, GetStoredDataResponseOrBuilder> singleFieldBuilderV3 = this.getStoredDataResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GetStoredDataResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GetStoredDataResponse getStoredDataResponse = this.getStoredDataResponse_;
                return getStoredDataResponse == null ? GetStoredDataResponse.getDefaultInstance() : getStoredDataResponse;
            }

            @Override // com.garmin.proto.generated.GDIStoreAndForward.ServiceOrBuilder
            public boolean hasGetStoredDataRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIStoreAndForward.ServiceOrBuilder
            public boolean hasGetStoredDataResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIStoreAndForward.internal_static_GDI_Proto_StoreAndForward_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasGetStoredDataResponse() || getGetStoredDataResponse().isInitialized();
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
                                    codedInputStream.readMessage(getGetStoredDataRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getGetStoredDataResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeGetStoredDataRequest(GetStoredDataRequest getStoredDataRequest) {
                GetStoredDataRequest getStoredDataRequest2;
                SingleFieldBuilderV3<GetStoredDataRequest, GetStoredDataRequest.Builder, GetStoredDataRequestOrBuilder> singleFieldBuilderV3 = this.getStoredDataRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(getStoredDataRequest);
                } else if ((this.bitField0_ & 1) == 0 || (getStoredDataRequest2 = this.getStoredDataRequest_) == null || getStoredDataRequest2 == GetStoredDataRequest.getDefaultInstance()) {
                    this.getStoredDataRequest_ = getStoredDataRequest;
                } else {
                    getGetStoredDataRequestBuilder().mergeFrom(getStoredDataRequest);
                }
                if (this.getStoredDataRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeGetStoredDataResponse(GetStoredDataResponse getStoredDataResponse) {
                GetStoredDataResponse getStoredDataResponse2;
                SingleFieldBuilderV3<GetStoredDataResponse, GetStoredDataResponse.Builder, GetStoredDataResponseOrBuilder> singleFieldBuilderV3 = this.getStoredDataResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(getStoredDataResponse);
                } else if ((this.bitField0_ & 2) == 0 || (getStoredDataResponse2 = this.getStoredDataResponse_) == null || getStoredDataResponse2 == GetStoredDataResponse.getDefaultInstance()) {
                    this.getStoredDataResponse_ = getStoredDataResponse;
                } else {
                    getGetStoredDataResponseBuilder().mergeFrom(getStoredDataResponse);
                }
                if (this.getStoredDataResponse_ != null) {
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

            public Builder setGetStoredDataRequest(GetStoredDataRequest.Builder builder) {
                SingleFieldBuilderV3<GetStoredDataRequest, GetStoredDataRequest.Builder, GetStoredDataRequestOrBuilder> singleFieldBuilderV3 = this.getStoredDataRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.getStoredDataRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setGetStoredDataResponse(GetStoredDataResponse.Builder builder) {
                SingleFieldBuilderV3<GetStoredDataResponse, GetStoredDataResponse.Builder, GetStoredDataResponseOrBuilder> singleFieldBuilderV3 = this.getStoredDataResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.getStoredDataResponse_ = builder.build();
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

            public Builder setGetStoredDataRequest(GetStoredDataRequest getStoredDataRequest) {
                SingleFieldBuilderV3<GetStoredDataRequest, GetStoredDataRequest.Builder, GetStoredDataRequestOrBuilder> singleFieldBuilderV3 = this.getStoredDataRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    getStoredDataRequest.getClass();
                    this.getStoredDataRequest_ = getStoredDataRequest;
                } else {
                    singleFieldBuilderV3.setMessage(getStoredDataRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setGetStoredDataResponse(GetStoredDataResponse getStoredDataResponse) {
                SingleFieldBuilderV3<GetStoredDataResponse, GetStoredDataResponse.Builder, GetStoredDataResponseOrBuilder> singleFieldBuilderV3 = this.getStoredDataResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    getStoredDataResponse.getClass();
                    this.getStoredDataResponse_ = getStoredDataResponse;
                } else {
                    singleFieldBuilderV3.setMessage(getStoredDataResponse);
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
                if (service.hasGetStoredDataRequest()) {
                    mergeGetStoredDataRequest(service.getGetStoredDataRequest());
                }
                if (service.hasGetStoredDataResponse()) {
                    mergeGetStoredDataResponse(service.getGetStoredDataResponse());
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
