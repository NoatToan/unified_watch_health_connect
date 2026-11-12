package com.garmin.proto.generated;

import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractParser;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistry;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessage;
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
public final class GDIDataTransferProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0015GDIDataTransfer.proto\u0012\u0016GDI.Proto.DataTransfer\u001a\rGDICore.proto\u001a\u0012GDIDataTypes.proto\"ü\u0005\n\u0013DataTransferService\u0012J\n\u0015data_download_request\u0018\u0001 \u0001(\u000b2+.GDI.Proto.DataTransfer.DataDownloadRequest\u0012L\n\u0016data_download_response\u0018\u0002 \u0001(\u000b2,.GDI.Proto.DataTransfer.DataDownloadResponse\u0012W\n\u001cinitiate_data_upload_request\u0018\u0003 \u0001(\u000b21.GDI.Proto.DataTransfer.InitiateDataUploadRequest\u0012Y\n\u001dinitiate_data_upload_response\u0018\u0004 \u0001(\u000b22.GDI.Proto.DataTransfer.InitiateDataUploadResponse\u0012F\n\u0013data_upload_request\u0018\u0005 \u0001(\u000b2).GDI.Proto.DataTransfer.DataUploadRequest\u0012H\n\u0014data_upload_response\u0018\u0006 \u0001(\u000b2*.GDI.Proto.DataTransfer.DataUploadResponse\u0012a\n!data_upload_canceled_notification\u0018\u0007 \u0001(\u000b26.GDI.Proto.DataTransfer.DataUploadCanceledNotification\u0012O\n\u0018file_access_item_request\u0018\b \u0001(\u000b2-.GDI.Proto.DataTransfer.FileAccessItemRequest\u0012Q\n\u0019file_access_item_response\u0018\t \u0001(\u000b2..GDI.Proto.DataTransfer.FileAccessItemResponse\"¢\u0001\n\u0013CapabilitiesRequest\u0012\u0017\n\u000fservice_version\u0018\u0001 \u0001(\r2r\n\u0011data_xfer_request\u0012*.GDI.Proto.Core.FeatureCapabilitiesRequest\u0018\u000e \u0001(\u000b2+.GDI.Proto.DataTransfer.CapabilitiesRequest\"\u008d\u0001\n\u0014CapabilitiesResponse2u\n\u0012data_xfer_response\u0012+.GDI.Proto.Core.FeatureCapabilitiesResponse\u0018\u000e \u0001(\u000b2,.GDI.Proto.DataTransfer.CapabilitiesResponse\"O\n\u0013DataDownloadRequest\u0012\n\n\u0002id\u0018\u0001 \u0002(\r\u0012\u000e\n\u0006offset\u0018\u0002 \u0002(\r\u0012\u001c\n\u000emax_chunk_size\u0018\u0003 \u0001(\r:\u00044096\"Ð\u0001\n\u0014DataDownloadResponse\u0012C\n\u0006status\u0018\u0001 \u0002(\u000e23.GDI.Proto.DataTransfer.DataDownloadResponse.Status\u0012\n\n\u0002id\u0018\u0002 \u0002(\r\u0012\u000e\n\u0006offset\u0018\u0003 \u0002(\r\u0012\u000f\n\u0007payload\u0018\u0004 \u0001(\f\"F\n\u0006Status\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u000b\n\u0007SUCCESS\u0010\u0001\u0012\u000e\n\nINVALID_ID\u0010\u0002\u0012\u0012\n\u000eINVALID_OFFSET\u0010\u0003\"'\n\u0019InitiateDataUploadRequest\u0012\n\n\u0002id\u0018\u0001 \u0002(\r\"¢\u0001\n\u001aInitiateDataUploadResponse\u0012\n\n\u0002id\u0018\u0001 \u0002(\r\u0012I\n\u0006status\u0018\u0002 \u0002(\u000e29.GDI.Proto.DataTransfer.InitiateDataUploadResponse.Status\"-\n\u0006Status\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u000e\n\nINVALID_ID\u0010\u0002\"@\n\u0011DataUploadRequest\u0012\n\n\u0002id\u0018\u0001 \u0002(\r\u0012\u000e\n\u0006offset\u0018\u0002 \u0002(\r\u0012\u000f\n\u0007payload\u0018\u0003 \u0002(\f\"É\u0001\n\u0012DataUploadResponse\u0012\n\n\u0002id\u0018\u0001 \u0002(\r\u0012A\n\u0006status\u0018\u0002 \u0002(\u000e21.GDI.Proto.DataTransfer.DataUploadResponse.Status\"d\n\u0006Status\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u000b\n\u0007SUCCESS\u0010\u0001\u0012\u000e\n\nINVALID_ID\u0010\u0002\u0012\u0012\n\u000eINVALID_OFFSET\u0010\u0003\u0012\u0011\n\rSIZE_MISMATCH\u0010\u0004\u0012\t\n\u0005ABORT\u0010\u0005\",\n\u001eDataUploadCanceledNotification\u0012\n\n\u0002id\u0018\u0001 \u0002(\r\"Ï\u0001\n\u0015FileAccessItemRequest\u0012\u0014\n\fdata_xfer_id\u0018\u0001 \u0001(\r\u0012Y\n\u0010expected_latency\u0018\u0002 \u0001(\u000e25.GDI.Proto.DataTransfer.FileAccessItemRequest.Latency:\bSTANDARD\"E\n\u0007Latency\u0012\f\n\bSTANDARD\u0010\u0000\u0012\b\n\u0004SOON\u0010\u0001\u0012\r\n\tIMMEDIATE\u0010\u0002\u0012\u0013\n\u000fDURING_ACTIVITY\u0010\u0003\"Ý\u0001\n\u0016FileAccessItemResponse\u0012E\n\u0006status\u0018\u0001 \u0001(\u000e25.GDI.Proto.DataTransfer.FileAccessItemResponse.Status\u0012\u0014\n\fdata_xfer_id\u0018\u0002 \u0001(\r\u00127\n\u0014file_access_item_uid\u0018\u0003 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\"-\n\u0006Status\u0012\u000b\n\u0007UNKNOWN\u0010\u0000\u0012\u0006\n\u0002OK\u0010\u0001\u0012\u000e\n\nINVALID_ID\u0010\u0002B4\n\u001acom.garmin.proto.generatedB\u0014GDIDataTransferProtoH\u0003"}, new Descriptors.FileDescriptor[]{GDICore.getDescriptor(), GDIDataTypes.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DataTransfer_CapabilitiesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DataTransfer_CapabilitiesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DataTransfer_CapabilitiesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DataTransfer_CapabilitiesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DataTransfer_DataDownloadRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DataTransfer_DataDownloadRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DataTransfer_DataDownloadResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DataTransfer_DataDownloadResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DataTransfer_DataTransferService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DataTransfer_DataTransferService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DataTransfer_DataUploadCanceledNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DataTransfer_DataUploadCanceledNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DataTransfer_DataUploadRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DataTransfer_DataUploadRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DataTransfer_DataUploadResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DataTransfer_DataUploadResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DataTransfer_FileAccessItemRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DataTransfer_FileAccessItemRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DataTransfer_FileAccessItemResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DataTransfer_FileAccessItemResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DataTransfer_InitiateDataUploadRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DataTransfer_InitiateDataUploadRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_DataTransfer_InitiateDataUploadResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_DataTransfer_InitiateDataUploadResponse_fieldAccessorTable;

    public interface CapabilitiesRequestOrBuilder extends MessageOrBuilder {
        int getServiceVersion();

        boolean hasServiceVersion();
    }

    public interface CapabilitiesResponseOrBuilder extends MessageOrBuilder {
    }

    public interface DataDownloadRequestOrBuilder extends MessageOrBuilder {
        int getId();

        int getMaxChunkSize();

        int getOffset();

        boolean hasId();

        boolean hasMaxChunkSize();

        boolean hasOffset();
    }

    public interface DataDownloadResponseOrBuilder extends MessageOrBuilder {
        int getId();

        int getOffset();

        ByteString getPayload();

        DataDownloadResponse.Status getStatus();

        boolean hasId();

        boolean hasOffset();

        boolean hasPayload();

        boolean hasStatus();
    }

    public interface DataTransferServiceOrBuilder extends MessageOrBuilder {
        DataDownloadRequest getDataDownloadRequest();

        DataDownloadRequestOrBuilder getDataDownloadRequestOrBuilder();

        DataDownloadResponse getDataDownloadResponse();

        DataDownloadResponseOrBuilder getDataDownloadResponseOrBuilder();

        DataUploadCanceledNotification getDataUploadCanceledNotification();

        DataUploadCanceledNotificationOrBuilder getDataUploadCanceledNotificationOrBuilder();

        DataUploadRequest getDataUploadRequest();

        DataUploadRequestOrBuilder getDataUploadRequestOrBuilder();

        DataUploadResponse getDataUploadResponse();

        DataUploadResponseOrBuilder getDataUploadResponseOrBuilder();

        FileAccessItemRequest getFileAccessItemRequest();

        FileAccessItemRequestOrBuilder getFileAccessItemRequestOrBuilder();

        FileAccessItemResponse getFileAccessItemResponse();

        FileAccessItemResponseOrBuilder getFileAccessItemResponseOrBuilder();

        InitiateDataUploadRequest getInitiateDataUploadRequest();

        InitiateDataUploadRequestOrBuilder getInitiateDataUploadRequestOrBuilder();

        InitiateDataUploadResponse getInitiateDataUploadResponse();

        InitiateDataUploadResponseOrBuilder getInitiateDataUploadResponseOrBuilder();

        boolean hasDataDownloadRequest();

        boolean hasDataDownloadResponse();

        boolean hasDataUploadCanceledNotification();

        boolean hasDataUploadRequest();

        boolean hasDataUploadResponse();

        boolean hasFileAccessItemRequest();

        boolean hasFileAccessItemResponse();

        boolean hasInitiateDataUploadRequest();

        boolean hasInitiateDataUploadResponse();
    }

    public interface DataUploadCanceledNotificationOrBuilder extends MessageOrBuilder {
        int getId();

        boolean hasId();
    }

    public interface DataUploadRequestOrBuilder extends MessageOrBuilder {
        int getId();

        int getOffset();

        ByteString getPayload();

        boolean hasId();

        boolean hasOffset();

        boolean hasPayload();
    }

    public interface DataUploadResponseOrBuilder extends MessageOrBuilder {
        int getId();

        DataUploadResponse.Status getStatus();

        boolean hasId();

        boolean hasStatus();
    }

    public interface FileAccessItemRequestOrBuilder extends MessageOrBuilder {
        int getDataXferId();

        FileAccessItemRequest.Latency getExpectedLatency();

        boolean hasDataXferId();

        boolean hasExpectedLatency();
    }

    public interface FileAccessItemResponseOrBuilder extends MessageOrBuilder {
        int getDataXferId();

        GDIDataTypes.UUID getFileAccessItemUid();

        GDIDataTypes.UUIDOrBuilder getFileAccessItemUidOrBuilder();

        FileAccessItemResponse.Status getStatus();

        boolean hasDataXferId();

        boolean hasFileAccessItemUid();

        boolean hasStatus();
    }

    public interface InitiateDataUploadRequestOrBuilder extends MessageOrBuilder {
        int getId();

        boolean hasId();
    }

    public interface InitiateDataUploadResponseOrBuilder extends MessageOrBuilder {
        int getId();

        InitiateDataUploadResponse.Status getStatus();

        boolean hasId();

        boolean hasStatus();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_DataTransfer_DataTransferService_descriptor = descriptor2;
        internal_static_GDI_Proto_DataTransfer_DataTransferService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"DataDownloadRequest", "DataDownloadResponse", "InitiateDataUploadRequest", "InitiateDataUploadResponse", "DataUploadRequest", "DataUploadResponse", "DataUploadCanceledNotification", "FileAccessItemRequest", "FileAccessItemResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_DataTransfer_CapabilitiesRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_DataTransfer_CapabilitiesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"ServiceVersion"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_DataTransfer_CapabilitiesResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_DataTransfer_CapabilitiesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[0]);
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_DataTransfer_DataDownloadRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_DataTransfer_DataDownloadRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Id", "Offset", "MaxChunkSize"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_DataTransfer_DataDownloadResponse_descriptor = descriptor6;
        internal_static_GDI_Proto_DataTransfer_DataDownloadResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Status", "Id", "Offset", "Payload"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_DataTransfer_InitiateDataUploadRequest_descriptor = descriptor7;
        internal_static_GDI_Proto_DataTransfer_InitiateDataUploadRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Id"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_DataTransfer_InitiateDataUploadResponse_descriptor = descriptor8;
        internal_static_GDI_Proto_DataTransfer_InitiateDataUploadResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Id", "Status"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_DataTransfer_DataUploadRequest_descriptor = descriptor9;
        internal_static_GDI_Proto_DataTransfer_DataUploadRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"Id", "Offset", "Payload"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_DataTransfer_DataUploadResponse_descriptor = descriptor10;
        internal_static_GDI_Proto_DataTransfer_DataUploadResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Id", "Status"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_DataTransfer_DataUploadCanceledNotification_descriptor = descriptor11;
        internal_static_GDI_Proto_DataTransfer_DataUploadCanceledNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Id"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_GDI_Proto_DataTransfer_FileAccessItemRequest_descriptor = descriptor12;
        internal_static_GDI_Proto_DataTransfer_FileAccessItemRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"DataXferId", "ExpectedLatency"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_GDI_Proto_DataTransfer_FileAccessItemResponse_descriptor = descriptor13;
        internal_static_GDI_Proto_DataTransfer_FileAccessItemResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"Status", "DataXferId", "FileAccessItemUid"});
        GDICore.getDescriptor();
        GDIDataTypes.getDescriptor();
    }

    private GDIDataTransferProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
        extensionRegistryLite.add(CapabilitiesRequest.dataXferRequest);
        extensionRegistryLite.add(CapabilitiesResponse.dataXferResponse);
    }

    public static final class CapabilitiesRequest extends GeneratedMessageV3 implements CapabilitiesRequestOrBuilder {
        public static final int DATA_XFER_REQUEST_FIELD_NUMBER = 14;
        public static final int SERVICE_VERSION_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int serviceVersion_;
        private static final CapabilitiesRequest DEFAULT_INSTANCE = new CapabilitiesRequest();

        @Deprecated
        public static final Parser<CapabilitiesRequest> PARSER = new AbstractParser<CapabilitiesRequest>() { // from class: com.garmin.proto.generated.GDIDataTransferProto.CapabilitiesRequest.1
            @Override // com.google.protobuf.Parser
            public CapabilitiesRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CapabilitiesRequest.newBuilder();
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
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesRequest, CapabilitiesRequest> dataXferRequest = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesRequest.class, getDefaultInstance());

        private CapabilitiesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.serviceVersion_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_CapabilitiesRequest_descriptor;
        }

        public static Builder newBuilder(CapabilitiesRequest capabilitiesRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(capabilitiesRequest);
        }

        public static CapabilitiesRequest parseDelimitedFrom(InputStream inputStream) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CapabilitiesRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CapabilitiesRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CapabilitiesRequest)) {
                return super.equals(obj);
            }
            CapabilitiesRequest capabilitiesRequest = (CapabilitiesRequest) obj;
            if (hasServiceVersion() != capabilitiesRequest.hasServiceVersion()) {
                return false;
            }
            return (!hasServiceVersion() || getServiceVersion() == capabilitiesRequest.getServiceVersion()) && getUnknownFields().equals(capabilitiesRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CapabilitiesRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.serviceVersion_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.CapabilitiesRequestOrBuilder
        public int getServiceVersion() {
            return this.serviceVersion_;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.CapabilitiesRequestOrBuilder
        public boolean hasServiceVersion() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasServiceVersion()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getServiceVersion();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
            return new CapabilitiesRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.serviceVersion_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesRequestOrBuilder {
            private int bitField0_;
            private int serviceVersion_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(CapabilitiesRequest capabilitiesRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    capabilitiesRequest.serviceVersion_ = this.serviceVersion_;
                } else {
                    i14 = 0;
                }
                capabilitiesRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_CapabilitiesRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CapabilitiesRequest build() {
                CapabilitiesRequest capabilitiesRequestBuildPartial = buildPartial();
                if (capabilitiesRequestBuildPartial.isInitialized()) {
                    return capabilitiesRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) capabilitiesRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CapabilitiesRequest buildPartial() {
                CapabilitiesRequest capabilitiesRequest = new CapabilitiesRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(capabilitiesRequest);
                }
                onBuilt();
                return capabilitiesRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.serviceVersion_ = 0;
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

            public Builder clearServiceVersion() {
                this.bitField0_ &= -2;
                this.serviceVersion_ = 0;
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
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_CapabilitiesRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.CapabilitiesRequestOrBuilder
            public int getServiceVersion() {
                return this.serviceVersion_;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.CapabilitiesRequestOrBuilder
            public boolean hasServiceVersion() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_CapabilitiesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesRequest.class, Builder.class);
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
                                    this.serviceVersion_ = codedInputStream.readUInt32();
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

            public Builder setServiceVersion(int i14) {
                this.serviceVersion_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
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
            public CapabilitiesRequest getDefaultInstanceForType() {
                return CapabilitiesRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CapabilitiesRequest) {
                    return mergeFrom((CapabilitiesRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CapabilitiesRequest capabilitiesRequest) {
                if (capabilitiesRequest == CapabilitiesRequest.getDefaultInstance()) {
                    return this;
                }
                if (capabilitiesRequest.hasServiceVersion()) {
                    setServiceVersion(capabilitiesRequest.getServiceVersion());
                }
                mergeUnknownFields(capabilitiesRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CapabilitiesRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CapabilitiesRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CapabilitiesRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ CapabilitiesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CapabilitiesRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private CapabilitiesRequest() {
            this.serviceVersion_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CapabilitiesRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CapabilitiesRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CapabilitiesRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CapabilitiesRequest parseFrom(InputStream inputStream) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CapabilitiesRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CapabilitiesRequest parseFrom(CodedInputStream codedInputStream) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CapabilitiesRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CapabilitiesResponse extends GeneratedMessageV3 implements CapabilitiesResponseOrBuilder {
        public static final int DATA_XFER_RESPONSE_FIELD_NUMBER = 14;
        private static final CapabilitiesResponse DEFAULT_INSTANCE = new CapabilitiesResponse();

        @Deprecated
        public static final Parser<CapabilitiesResponse> PARSER = new AbstractParser<CapabilitiesResponse>() { // from class: com.garmin.proto.generated.GDIDataTransferProto.CapabilitiesResponse.1
            @Override // com.google.protobuf.Parser
            public CapabilitiesResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CapabilitiesResponse.newBuilder();
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
        public static final GeneratedMessage.GeneratedExtension<GDICore.FeatureCapabilitiesResponse, CapabilitiesResponse> dataXferResponse = GeneratedMessage.newMessageScopedGeneratedExtension(getDefaultInstance(), 0, CapabilitiesResponse.class, getDefaultInstance());
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;

        private CapabilitiesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_CapabilitiesResponse_descriptor;
        }

        public static Builder newBuilder(CapabilitiesResponse capabilitiesResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(capabilitiesResponse);
        }

        public static CapabilitiesResponse parseDelimitedFrom(InputStream inputStream) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CapabilitiesResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CapabilitiesResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof CapabilitiesResponse) {
                return getUnknownFields().equals(((CapabilitiesResponse) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CapabilitiesResponse> getParserForType() {
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
            return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
            return new CapabilitiesResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CapabilitiesResponseOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_CapabilitiesResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CapabilitiesResponse build() {
                CapabilitiesResponse capabilitiesResponseBuildPartial = buildPartial();
                if (capabilitiesResponseBuildPartial.isInitialized()) {
                    return capabilitiesResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) capabilitiesResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CapabilitiesResponse buildPartial() {
                CapabilitiesResponse capabilitiesResponse = new CapabilitiesResponse(this);
                onBuilt();
                return capabilitiesResponse;
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
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_CapabilitiesResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_CapabilitiesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CapabilitiesResponse.class, Builder.class);
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
            public CapabilitiesResponse getDefaultInstanceForType() {
                return CapabilitiesResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CapabilitiesResponse) {
                    return mergeFrom((CapabilitiesResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CapabilitiesResponse capabilitiesResponse) {
                if (capabilitiesResponse == CapabilitiesResponse.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(capabilitiesResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CapabilitiesResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ CapabilitiesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private CapabilitiesResponse() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CapabilitiesResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CapabilitiesResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CapabilitiesResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CapabilitiesResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CapabilitiesResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CapabilitiesResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CapabilitiesResponse parseFrom(InputStream inputStream) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CapabilitiesResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CapabilitiesResponse parseFrom(CodedInputStream codedInputStream) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CapabilitiesResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CapabilitiesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DataUploadCanceledNotification extends GeneratedMessageV3 implements DataUploadCanceledNotificationOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int id_;
        private byte memoizedIsInitialized;
        private static final DataUploadCanceledNotification DEFAULT_INSTANCE = new DataUploadCanceledNotification();

        @Deprecated
        public static final Parser<DataUploadCanceledNotification> PARSER = new AbstractParser<DataUploadCanceledNotification>() { // from class: com.garmin.proto.generated.GDIDataTransferProto.DataUploadCanceledNotification.1
            @Override // com.google.protobuf.Parser
            public DataUploadCanceledNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DataUploadCanceledNotification.newBuilder();
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

        private DataUploadCanceledNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.id_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DataUploadCanceledNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataUploadCanceledNotification_descriptor;
        }

        public static Builder newBuilder(DataUploadCanceledNotification dataUploadCanceledNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dataUploadCanceledNotification);
        }

        public static DataUploadCanceledNotification parseDelimitedFrom(InputStream inputStream) {
            return (DataUploadCanceledNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DataUploadCanceledNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DataUploadCanceledNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DataUploadCanceledNotification)) {
                return super.equals(obj);
            }
            DataUploadCanceledNotification dataUploadCanceledNotification = (DataUploadCanceledNotification) obj;
            if (hasId() != dataUploadCanceledNotification.hasId()) {
                return false;
            }
            return (!hasId() || getId() == dataUploadCanceledNotification.getId()) && getUnknownFields().equals(dataUploadCanceledNotification.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataUploadCanceledNotificationOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DataUploadCanceledNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.id_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataUploadCanceledNotificationOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getId();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataUploadCanceledNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(DataUploadCanceledNotification.class, Builder.class);
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
            if (hasId()) {
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
            return new DataUploadCanceledNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.id_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DataUploadCanceledNotificationOrBuilder {
            private int bitField0_;
            private int id_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(DataUploadCanceledNotification dataUploadCanceledNotification) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    dataUploadCanceledNotification.id_ = this.id_;
                } else {
                    i14 = 0;
                }
                dataUploadCanceledNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataUploadCanceledNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataUploadCanceledNotification build() {
                DataUploadCanceledNotification dataUploadCanceledNotificationBuildPartial = buildPartial();
                if (dataUploadCanceledNotificationBuildPartial.isInitialized()) {
                    return dataUploadCanceledNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataUploadCanceledNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataUploadCanceledNotification buildPartial() {
                DataUploadCanceledNotification dataUploadCanceledNotification = new DataUploadCanceledNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(dataUploadCanceledNotification);
                }
                onBuilt();
                return dataUploadCanceledNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = 0;
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
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataUploadCanceledNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataUploadCanceledNotificationOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataUploadCanceledNotificationOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataUploadCanceledNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(DataUploadCanceledNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId();
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
                                    this.id_ = codedInputStream.readUInt32();
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

            public Builder setId(int i14) {
                this.id_ = i14;
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

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DataUploadCanceledNotification getDefaultInstanceForType() {
                return DataUploadCanceledNotification.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DataUploadCanceledNotification) {
                    return mergeFrom((DataUploadCanceledNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DataUploadCanceledNotification dataUploadCanceledNotification) {
                if (dataUploadCanceledNotification == DataUploadCanceledNotification.getDefaultInstance()) {
                    return this;
                }
                if (dataUploadCanceledNotification.hasId()) {
                    setId(dataUploadCanceledNotification.getId());
                }
                mergeUnknownFields(dataUploadCanceledNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DataUploadCanceledNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DataUploadCanceledNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataUploadCanceledNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataUploadCanceledNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ DataUploadCanceledNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DataUploadCanceledNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private DataUploadCanceledNotification() {
            this.id_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DataUploadCanceledNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DataUploadCanceledNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DataUploadCanceledNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DataUploadCanceledNotification parseFrom(InputStream inputStream) {
            return (DataUploadCanceledNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DataUploadCanceledNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataUploadCanceledNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataUploadCanceledNotification parseFrom(CodedInputStream codedInputStream) {
            return (DataUploadCanceledNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DataUploadCanceledNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataUploadCanceledNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class InitiateDataUploadRequest extends GeneratedMessageV3 implements InitiateDataUploadRequestOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int id_;
        private byte memoizedIsInitialized;
        private static final InitiateDataUploadRequest DEFAULT_INSTANCE = new InitiateDataUploadRequest();

        @Deprecated
        public static final Parser<InitiateDataUploadRequest> PARSER = new AbstractParser<InitiateDataUploadRequest>() { // from class: com.garmin.proto.generated.GDIDataTransferProto.InitiateDataUploadRequest.1
            @Override // com.google.protobuf.Parser
            public InitiateDataUploadRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = InitiateDataUploadRequest.newBuilder();
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

        private InitiateDataUploadRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.id_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InitiateDataUploadRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_InitiateDataUploadRequest_descriptor;
        }

        public static Builder newBuilder(InitiateDataUploadRequest initiateDataUploadRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(initiateDataUploadRequest);
        }

        public static InitiateDataUploadRequest parseDelimitedFrom(InputStream inputStream) {
            return (InitiateDataUploadRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static InitiateDataUploadRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<InitiateDataUploadRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InitiateDataUploadRequest)) {
                return super.equals(obj);
            }
            InitiateDataUploadRequest initiateDataUploadRequest = (InitiateDataUploadRequest) obj;
            if (hasId() != initiateDataUploadRequest.hasId()) {
                return false;
            }
            return (!hasId() || getId() == initiateDataUploadRequest.getId()) && getUnknownFields().equals(initiateDataUploadRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.InitiateDataUploadRequestOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<InitiateDataUploadRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.id_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.InitiateDataUploadRequestOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getId();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_InitiateDataUploadRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(InitiateDataUploadRequest.class, Builder.class);
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
            if (hasId()) {
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
            return new InitiateDataUploadRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.id_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InitiateDataUploadRequestOrBuilder {
            private int bitField0_;
            private int id_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(InitiateDataUploadRequest initiateDataUploadRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    initiateDataUploadRequest.id_ = this.id_;
                } else {
                    i14 = 0;
                }
                initiateDataUploadRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_InitiateDataUploadRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InitiateDataUploadRequest build() {
                InitiateDataUploadRequest initiateDataUploadRequestBuildPartial = buildPartial();
                if (initiateDataUploadRequestBuildPartial.isInitialized()) {
                    return initiateDataUploadRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) initiateDataUploadRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InitiateDataUploadRequest buildPartial() {
                InitiateDataUploadRequest initiateDataUploadRequest = new InitiateDataUploadRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(initiateDataUploadRequest);
                }
                onBuilt();
                return initiateDataUploadRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = 0;
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
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_InitiateDataUploadRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.InitiateDataUploadRequestOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.InitiateDataUploadRequestOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_InitiateDataUploadRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(InitiateDataUploadRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId();
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
                                    this.id_ = codedInputStream.readUInt32();
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

            public Builder setId(int i14) {
                this.id_ = i14;
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

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            private Builder() {
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public InitiateDataUploadRequest getDefaultInstanceForType() {
                return InitiateDataUploadRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof InitiateDataUploadRequest) {
                    return mergeFrom((InitiateDataUploadRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(InitiateDataUploadRequest initiateDataUploadRequest) {
                if (initiateDataUploadRequest == InitiateDataUploadRequest.getDefaultInstance()) {
                    return this;
                }
                if (initiateDataUploadRequest.hasId()) {
                    setId(initiateDataUploadRequest.getId());
                }
                mergeUnknownFields(initiateDataUploadRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public InitiateDataUploadRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static InitiateDataUploadRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InitiateDataUploadRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InitiateDataUploadRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ InitiateDataUploadRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static InitiateDataUploadRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private InitiateDataUploadRequest() {
            this.id_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static InitiateDataUploadRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static InitiateDataUploadRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static InitiateDataUploadRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static InitiateDataUploadRequest parseFrom(InputStream inputStream) {
            return (InitiateDataUploadRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static InitiateDataUploadRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InitiateDataUploadRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InitiateDataUploadRequest parseFrom(CodedInputStream codedInputStream) {
            return (InitiateDataUploadRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static InitiateDataUploadRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InitiateDataUploadRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DataDownloadRequest extends GeneratedMessageV3 implements DataDownloadRequestOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        public static final int MAX_CHUNK_SIZE_FIELD_NUMBER = 3;
        public static final int OFFSET_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int id_;
        private int maxChunkSize_;
        private byte memoizedIsInitialized;
        private int offset_;
        private static final DataDownloadRequest DEFAULT_INSTANCE = new DataDownloadRequest();

        @Deprecated
        public static final Parser<DataDownloadRequest> PARSER = new AbstractParser<DataDownloadRequest>() { // from class: com.garmin.proto.generated.GDIDataTransferProto.DataDownloadRequest.1
            @Override // com.google.protobuf.Parser
            public DataDownloadRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DataDownloadRequest.newBuilder();
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

        private DataDownloadRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.id_ = 0;
            this.offset_ = 0;
            this.maxChunkSize_ = 4096;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DataDownloadRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataDownloadRequest_descriptor;
        }

        public static Builder newBuilder(DataDownloadRequest dataDownloadRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dataDownloadRequest);
        }

        public static DataDownloadRequest parseDelimitedFrom(InputStream inputStream) {
            return (DataDownloadRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DataDownloadRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DataDownloadRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DataDownloadRequest)) {
                return super.equals(obj);
            }
            DataDownloadRequest dataDownloadRequest = (DataDownloadRequest) obj;
            if (hasId() != dataDownloadRequest.hasId()) {
                return false;
            }
            if ((hasId() && getId() != dataDownloadRequest.getId()) || hasOffset() != dataDownloadRequest.hasOffset()) {
                return false;
            }
            if ((!hasOffset() || getOffset() == dataDownloadRequest.getOffset()) && hasMaxChunkSize() == dataDownloadRequest.hasMaxChunkSize()) {
                return (!hasMaxChunkSize() || getMaxChunkSize() == dataDownloadRequest.getMaxChunkSize()) && getUnknownFields().equals(dataDownloadRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataDownloadRequestOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataDownloadRequestOrBuilder
        public int getMaxChunkSize() {
            return this.maxChunkSize_;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataDownloadRequestOrBuilder
        public int getOffset() {
            return this.offset_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DataDownloadRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.id_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.offset_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.maxChunkSize_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataDownloadRequestOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataDownloadRequestOrBuilder
        public boolean hasMaxChunkSize() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataDownloadRequestOrBuilder
        public boolean hasOffset() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getId();
            }
            if (hasOffset()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getOffset();
            }
            if (hasMaxChunkSize()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getMaxChunkSize();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataDownloadRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DataDownloadRequest.class, Builder.class);
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
            if (!hasId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasOffset()) {
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
            return new DataDownloadRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.id_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.offset_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.maxChunkSize_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DataDownloadRequestOrBuilder {
            private int bitField0_;
            private int id_;
            private int maxChunkSize_;
            private int offset_;

            private Builder() {
                this.maxChunkSize_ = 4096;
            }

            private void buildPartial0(DataDownloadRequest dataDownloadRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    dataDownloadRequest.id_ = this.id_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    dataDownloadRequest.offset_ = this.offset_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    dataDownloadRequest.maxChunkSize_ = this.maxChunkSize_;
                    i14 |= 4;
                }
                dataDownloadRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataDownloadRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataDownloadRequest build() {
                DataDownloadRequest dataDownloadRequestBuildPartial = buildPartial();
                if (dataDownloadRequestBuildPartial.isInitialized()) {
                    return dataDownloadRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataDownloadRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataDownloadRequest buildPartial() {
                DataDownloadRequest dataDownloadRequest = new DataDownloadRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(dataDownloadRequest);
                }
                onBuilt();
                return dataDownloadRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = 0;
                this.offset_ = 0;
                this.maxChunkSize_ = 4096;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxChunkSize() {
                this.bitField0_ &= -5;
                this.maxChunkSize_ = 4096;
                onChanged();
                return this;
            }

            public Builder clearOffset() {
                this.bitField0_ &= -3;
                this.offset_ = 0;
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
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataDownloadRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataDownloadRequestOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataDownloadRequestOrBuilder
            public int getMaxChunkSize() {
                return this.maxChunkSize_;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataDownloadRequestOrBuilder
            public int getOffset() {
                return this.offset_;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataDownloadRequestOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataDownloadRequestOrBuilder
            public boolean hasMaxChunkSize() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataDownloadRequestOrBuilder
            public boolean hasOffset() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataDownloadRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DataDownloadRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId() && hasOffset();
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
                                    this.id_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.offset_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.maxChunkSize_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
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

            public Builder setId(int i14) {
                this.id_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setMaxChunkSize(int i14) {
                this.maxChunkSize_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setOffset(int i14) {
                this.offset_ = i14;
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
            public DataDownloadRequest getDefaultInstanceForType() {
                return DataDownloadRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.maxChunkSize_ = 4096;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DataDownloadRequest) {
                    return mergeFrom((DataDownloadRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DataDownloadRequest dataDownloadRequest) {
                if (dataDownloadRequest == DataDownloadRequest.getDefaultInstance()) {
                    return this;
                }
                if (dataDownloadRequest.hasId()) {
                    setId(dataDownloadRequest.getId());
                }
                if (dataDownloadRequest.hasOffset()) {
                    setOffset(dataDownloadRequest.getOffset());
                }
                if (dataDownloadRequest.hasMaxChunkSize()) {
                    setMaxChunkSize(dataDownloadRequest.getMaxChunkSize());
                }
                mergeUnknownFields(dataDownloadRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DataDownloadRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DataDownloadRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataDownloadRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataDownloadRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DataDownloadRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DataDownloadRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DataDownloadRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DataDownloadRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DataDownloadRequest parseFrom(InputStream inputStream) {
            return (DataDownloadRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ DataDownloadRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DataDownloadRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataDownloadRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private DataDownloadRequest() {
            this.id_ = 0;
            this.offset_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.maxChunkSize_ = 4096;
        }

        public static DataDownloadRequest parseFrom(CodedInputStream codedInputStream) {
            return (DataDownloadRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DataDownloadRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataDownloadRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DataDownloadResponse extends GeneratedMessageV3 implements DataDownloadResponseOrBuilder {
        public static final int ID_FIELD_NUMBER = 2;
        public static final int OFFSET_FIELD_NUMBER = 3;
        public static final int PAYLOAD_FIELD_NUMBER = 4;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int id_;
        private byte memoizedIsInitialized;
        private int offset_;
        private ByteString payload_;
        private int status_;
        private static final DataDownloadResponse DEFAULT_INSTANCE = new DataDownloadResponse();

        @Deprecated
        public static final Parser<DataDownloadResponse> PARSER = new AbstractParser<DataDownloadResponse>() { // from class: com.garmin.proto.generated.GDIDataTransferProto.DataDownloadResponse.1
            @Override // com.google.protobuf.Parser
            public DataDownloadResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DataDownloadResponse.newBuilder();
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

        private DataDownloadResponse() {
            this.status_ = 0;
            this.id_ = 0;
            this.offset_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
            this.payload_ = byteString;
        }

        public static DataDownloadResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataDownloadResponse_descriptor;
        }

        public static Builder newBuilder(DataDownloadResponse dataDownloadResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dataDownloadResponse);
        }

        public static DataDownloadResponse parseDelimitedFrom(InputStream inputStream) {
            return (DataDownloadResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DataDownloadResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DataDownloadResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DataDownloadResponse)) {
                return super.equals(obj);
            }
            DataDownloadResponse dataDownloadResponse = (DataDownloadResponse) obj;
            if (hasStatus() != dataDownloadResponse.hasStatus()) {
                return false;
            }
            if ((hasStatus() && this.status_ != dataDownloadResponse.status_) || hasId() != dataDownloadResponse.hasId()) {
                return false;
            }
            if ((hasId() && getId() != dataDownloadResponse.getId()) || hasOffset() != dataDownloadResponse.hasOffset()) {
                return false;
            }
            if ((!hasOffset() || getOffset() == dataDownloadResponse.getOffset()) && hasPayload() == dataDownloadResponse.hasPayload()) {
                return (!hasPayload() || getPayload().equals(dataDownloadResponse.getPayload())) && getUnknownFields().equals(dataDownloadResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataDownloadResponseOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataDownloadResponseOrBuilder
        public int getOffset() {
            return this.offset_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DataDownloadResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataDownloadResponseOrBuilder
        public ByteString getPayload() {
            return this.payload_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.status_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.id_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(3, this.offset_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBytesSize(4, this.payload_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataDownloadResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataDownloadResponseOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataDownloadResponseOrBuilder
        public boolean hasOffset() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataDownloadResponseOrBuilder
        public boolean hasPayload() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataDownloadResponseOrBuilder
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
            if (hasId()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getId();
            }
            if (hasOffset()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getOffset();
            }
            if (hasPayload()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getPayload().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataDownloadResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DataDownloadResponse.class, Builder.class);
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
            if (!hasStatus()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasOffset()) {
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
            return new DataDownloadResponse();
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
                codedOutputStream.writeUInt32(2, this.id_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.offset_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeBytes(4, this.payload_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DataDownloadResponseOrBuilder {
            private int bitField0_;
            private int id_;
            private int offset_;
            private ByteString payload_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                this.payload_ = ByteString.EMPTY;
            }

            private void buildPartial0(DataDownloadResponse dataDownloadResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    dataDownloadResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    dataDownloadResponse.id_ = this.id_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    dataDownloadResponse.offset_ = this.offset_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    dataDownloadResponse.payload_ = this.payload_;
                    i14 |= 8;
                }
                dataDownloadResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataDownloadResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataDownloadResponse build() {
                DataDownloadResponse dataDownloadResponseBuildPartial = buildPartial();
                if (dataDownloadResponseBuildPartial.isInitialized()) {
                    return dataDownloadResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataDownloadResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataDownloadResponse buildPartial() {
                DataDownloadResponse dataDownloadResponse = new DataDownloadResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(dataDownloadResponse);
                }
                onBuilt();
                return dataDownloadResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.id_ = 0;
                this.offset_ = 0;
                this.payload_ = ByteString.EMPTY;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearId() {
                this.bitField0_ &= -3;
                this.id_ = 0;
                onChanged();
                return this;
            }

            public Builder clearOffset() {
                this.bitField0_ &= -5;
                this.offset_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPayload() {
                this.bitField0_ &= -9;
                this.payload_ = DataDownloadResponse.getDefaultInstance().getPayload();
                onChanged();
                return this;
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
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataDownloadResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataDownloadResponseOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataDownloadResponseOrBuilder
            public int getOffset() {
                return this.offset_;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataDownloadResponseOrBuilder
            public ByteString getPayload() {
                return this.payload_;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataDownloadResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataDownloadResponseOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataDownloadResponseOrBuilder
            public boolean hasOffset() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataDownloadResponseOrBuilder
            public boolean hasPayload() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataDownloadResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataDownloadResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DataDownloadResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasStatus() && hasId() && hasOffset();
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
                                } else if (tag == 16) {
                                    this.id_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.offset_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.payload_ = codedInputStream.readBytes();
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

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setId(int i14) {
                this.id_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setOffset(int i14) {
                this.offset_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPayload(ByteString byteString) {
                byteString.getClass();
                this.payload_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
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
            public DataDownloadResponse getDefaultInstanceForType() {
                return DataDownloadResponse.getDefaultInstance();
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
                this.payload_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DataDownloadResponse) {
                    return mergeFrom((DataDownloadResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DataDownloadResponse dataDownloadResponse) {
                if (dataDownloadResponse == DataDownloadResponse.getDefaultInstance()) {
                    return this;
                }
                if (dataDownloadResponse.hasStatus()) {
                    setStatus(dataDownloadResponse.getStatus());
                }
                if (dataDownloadResponse.hasId()) {
                    setId(dataDownloadResponse.getId());
                }
                if (dataDownloadResponse.hasOffset()) {
                    setOffset(dataDownloadResponse.getOffset());
                }
                if (dataDownloadResponse.hasPayload()) {
                    setPayload(dataDownloadResponse.getPayload());
                }
                mergeUnknownFields(dataDownloadResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DataDownloadResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DataDownloadResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataDownloadResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataDownloadResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DataDownloadResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DataDownloadResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DataDownloadResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DataDownloadResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DataDownloadResponse parseFrom(InputStream inputStream) {
            return (DataDownloadResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DataDownloadResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataDownloadResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataDownloadResponse parseFrom(CodedInputStream codedInputStream) {
            return (DataDownloadResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        private DataDownloadResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.id_ = 0;
            this.offset_ = 0;
            this.payload_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DataDownloadResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataDownloadResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN(0),
            SUCCESS(1),
            INVALID_ID(2),
            INVALID_OFFSET(3);

            public static final int INVALID_ID_VALUE = 2;
            public static final int INVALID_OFFSET_VALUE = 3;
            public static final int SUCCESS_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIDataTransferProto.DataDownloadResponse.Status.1
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
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return SUCCESS;
                }
                if (i14 == 2) {
                    return INVALID_ID;
                }
                if (i14 != 3) {
                    return null;
                }
                return INVALID_OFFSET;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return DataDownloadResponse.getDescriptor().getEnumTypes().get(0);
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

        public /* synthetic */ DataDownloadResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class DataTransferService extends GeneratedMessageV3 implements DataTransferServiceOrBuilder {
        public static final int DATA_DOWNLOAD_REQUEST_FIELD_NUMBER = 1;
        public static final int DATA_DOWNLOAD_RESPONSE_FIELD_NUMBER = 2;
        public static final int DATA_UPLOAD_CANCELED_NOTIFICATION_FIELD_NUMBER = 7;
        public static final int DATA_UPLOAD_REQUEST_FIELD_NUMBER = 5;
        public static final int DATA_UPLOAD_RESPONSE_FIELD_NUMBER = 6;
        public static final int FILE_ACCESS_ITEM_REQUEST_FIELD_NUMBER = 8;
        public static final int FILE_ACCESS_ITEM_RESPONSE_FIELD_NUMBER = 9;
        public static final int INITIATE_DATA_UPLOAD_REQUEST_FIELD_NUMBER = 3;
        public static final int INITIATE_DATA_UPLOAD_RESPONSE_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DataDownloadRequest dataDownloadRequest_;
        private DataDownloadResponse dataDownloadResponse_;
        private DataUploadCanceledNotification dataUploadCanceledNotification_;
        private DataUploadRequest dataUploadRequest_;
        private DataUploadResponse dataUploadResponse_;
        private FileAccessItemRequest fileAccessItemRequest_;
        private FileAccessItemResponse fileAccessItemResponse_;
        private InitiateDataUploadRequest initiateDataUploadRequest_;
        private InitiateDataUploadResponse initiateDataUploadResponse_;
        private byte memoizedIsInitialized;
        private static final DataTransferService DEFAULT_INSTANCE = new DataTransferService();

        @Deprecated
        public static final Parser<DataTransferService> PARSER = new AbstractParser<DataTransferService>() { // from class: com.garmin.proto.generated.GDIDataTransferProto.DataTransferService.1
            @Override // com.google.protobuf.Parser
            public DataTransferService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DataTransferService.newBuilder();
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

        private DataTransferService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DataTransferService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataTransferService_descriptor;
        }

        public static Builder newBuilder(DataTransferService dataTransferService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dataTransferService);
        }

        public static DataTransferService parseDelimitedFrom(InputStream inputStream) {
            return (DataTransferService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DataTransferService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DataTransferService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DataTransferService)) {
                return super.equals(obj);
            }
            DataTransferService dataTransferService = (DataTransferService) obj;
            if (hasDataDownloadRequest() != dataTransferService.hasDataDownloadRequest()) {
                return false;
            }
            if ((hasDataDownloadRequest() && !getDataDownloadRequest().equals(dataTransferService.getDataDownloadRequest())) || hasDataDownloadResponse() != dataTransferService.hasDataDownloadResponse()) {
                return false;
            }
            if ((hasDataDownloadResponse() && !getDataDownloadResponse().equals(dataTransferService.getDataDownloadResponse())) || hasInitiateDataUploadRequest() != dataTransferService.hasInitiateDataUploadRequest()) {
                return false;
            }
            if ((hasInitiateDataUploadRequest() && !getInitiateDataUploadRequest().equals(dataTransferService.getInitiateDataUploadRequest())) || hasInitiateDataUploadResponse() != dataTransferService.hasInitiateDataUploadResponse()) {
                return false;
            }
            if ((hasInitiateDataUploadResponse() && !getInitiateDataUploadResponse().equals(dataTransferService.getInitiateDataUploadResponse())) || hasDataUploadRequest() != dataTransferService.hasDataUploadRequest()) {
                return false;
            }
            if ((hasDataUploadRequest() && !getDataUploadRequest().equals(dataTransferService.getDataUploadRequest())) || hasDataUploadResponse() != dataTransferService.hasDataUploadResponse()) {
                return false;
            }
            if ((hasDataUploadResponse() && !getDataUploadResponse().equals(dataTransferService.getDataUploadResponse())) || hasDataUploadCanceledNotification() != dataTransferService.hasDataUploadCanceledNotification()) {
                return false;
            }
            if ((hasDataUploadCanceledNotification() && !getDataUploadCanceledNotification().equals(dataTransferService.getDataUploadCanceledNotification())) || hasFileAccessItemRequest() != dataTransferService.hasFileAccessItemRequest()) {
                return false;
            }
            if ((!hasFileAccessItemRequest() || getFileAccessItemRequest().equals(dataTransferService.getFileAccessItemRequest())) && hasFileAccessItemResponse() == dataTransferService.hasFileAccessItemResponse()) {
                return (!hasFileAccessItemResponse() || getFileAccessItemResponse().equals(dataTransferService.getFileAccessItemResponse())) && getUnknownFields().equals(dataTransferService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
        public DataDownloadRequest getDataDownloadRequest() {
            DataDownloadRequest dataDownloadRequest = this.dataDownloadRequest_;
            return dataDownloadRequest == null ? DataDownloadRequest.getDefaultInstance() : dataDownloadRequest;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
        public DataDownloadRequestOrBuilder getDataDownloadRequestOrBuilder() {
            DataDownloadRequest dataDownloadRequest = this.dataDownloadRequest_;
            return dataDownloadRequest == null ? DataDownloadRequest.getDefaultInstance() : dataDownloadRequest;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
        public DataDownloadResponse getDataDownloadResponse() {
            DataDownloadResponse dataDownloadResponse = this.dataDownloadResponse_;
            return dataDownloadResponse == null ? DataDownloadResponse.getDefaultInstance() : dataDownloadResponse;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
        public DataDownloadResponseOrBuilder getDataDownloadResponseOrBuilder() {
            DataDownloadResponse dataDownloadResponse = this.dataDownloadResponse_;
            return dataDownloadResponse == null ? DataDownloadResponse.getDefaultInstance() : dataDownloadResponse;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
        public DataUploadCanceledNotification getDataUploadCanceledNotification() {
            DataUploadCanceledNotification dataUploadCanceledNotification = this.dataUploadCanceledNotification_;
            return dataUploadCanceledNotification == null ? DataUploadCanceledNotification.getDefaultInstance() : dataUploadCanceledNotification;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
        public DataUploadCanceledNotificationOrBuilder getDataUploadCanceledNotificationOrBuilder() {
            DataUploadCanceledNotification dataUploadCanceledNotification = this.dataUploadCanceledNotification_;
            return dataUploadCanceledNotification == null ? DataUploadCanceledNotification.getDefaultInstance() : dataUploadCanceledNotification;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
        public DataUploadRequest getDataUploadRequest() {
            DataUploadRequest dataUploadRequest = this.dataUploadRequest_;
            return dataUploadRequest == null ? DataUploadRequest.getDefaultInstance() : dataUploadRequest;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
        public DataUploadRequestOrBuilder getDataUploadRequestOrBuilder() {
            DataUploadRequest dataUploadRequest = this.dataUploadRequest_;
            return dataUploadRequest == null ? DataUploadRequest.getDefaultInstance() : dataUploadRequest;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
        public DataUploadResponse getDataUploadResponse() {
            DataUploadResponse dataUploadResponse = this.dataUploadResponse_;
            return dataUploadResponse == null ? DataUploadResponse.getDefaultInstance() : dataUploadResponse;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
        public DataUploadResponseOrBuilder getDataUploadResponseOrBuilder() {
            DataUploadResponse dataUploadResponse = this.dataUploadResponse_;
            return dataUploadResponse == null ? DataUploadResponse.getDefaultInstance() : dataUploadResponse;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
        public FileAccessItemRequest getFileAccessItemRequest() {
            FileAccessItemRequest fileAccessItemRequest = this.fileAccessItemRequest_;
            return fileAccessItemRequest == null ? FileAccessItemRequest.getDefaultInstance() : fileAccessItemRequest;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
        public FileAccessItemRequestOrBuilder getFileAccessItemRequestOrBuilder() {
            FileAccessItemRequest fileAccessItemRequest = this.fileAccessItemRequest_;
            return fileAccessItemRequest == null ? FileAccessItemRequest.getDefaultInstance() : fileAccessItemRequest;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
        public FileAccessItemResponse getFileAccessItemResponse() {
            FileAccessItemResponse fileAccessItemResponse = this.fileAccessItemResponse_;
            return fileAccessItemResponse == null ? FileAccessItemResponse.getDefaultInstance() : fileAccessItemResponse;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
        public FileAccessItemResponseOrBuilder getFileAccessItemResponseOrBuilder() {
            FileAccessItemResponse fileAccessItemResponse = this.fileAccessItemResponse_;
            return fileAccessItemResponse == null ? FileAccessItemResponse.getDefaultInstance() : fileAccessItemResponse;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
        public InitiateDataUploadRequest getInitiateDataUploadRequest() {
            InitiateDataUploadRequest initiateDataUploadRequest = this.initiateDataUploadRequest_;
            return initiateDataUploadRequest == null ? InitiateDataUploadRequest.getDefaultInstance() : initiateDataUploadRequest;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
        public InitiateDataUploadRequestOrBuilder getInitiateDataUploadRequestOrBuilder() {
            InitiateDataUploadRequest initiateDataUploadRequest = this.initiateDataUploadRequest_;
            return initiateDataUploadRequest == null ? InitiateDataUploadRequest.getDefaultInstance() : initiateDataUploadRequest;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
        public InitiateDataUploadResponse getInitiateDataUploadResponse() {
            InitiateDataUploadResponse initiateDataUploadResponse = this.initiateDataUploadResponse_;
            return initiateDataUploadResponse == null ? InitiateDataUploadResponse.getDefaultInstance() : initiateDataUploadResponse;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
        public InitiateDataUploadResponseOrBuilder getInitiateDataUploadResponseOrBuilder() {
            InitiateDataUploadResponse initiateDataUploadResponse = this.initiateDataUploadResponse_;
            return initiateDataUploadResponse == null ? InitiateDataUploadResponse.getDefaultInstance() : initiateDataUploadResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DataTransferService> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getDataDownloadRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getDataDownloadResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getInitiateDataUploadRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getInitiateDataUploadResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getDataUploadRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getDataUploadResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getDataUploadCanceledNotification());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getFileAccessItemRequest());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getFileAccessItemResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
        public boolean hasDataDownloadRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
        public boolean hasDataDownloadResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
        public boolean hasDataUploadCanceledNotification() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
        public boolean hasDataUploadRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
        public boolean hasDataUploadResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
        public boolean hasFileAccessItemRequest() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
        public boolean hasFileAccessItemResponse() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
        public boolean hasInitiateDataUploadRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
        public boolean hasInitiateDataUploadResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasDataDownloadRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getDataDownloadRequest().hashCode();
            }
            if (hasDataDownloadResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getDataDownloadResponse().hashCode();
            }
            if (hasInitiateDataUploadRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getInitiateDataUploadRequest().hashCode();
            }
            if (hasInitiateDataUploadResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getInitiateDataUploadResponse().hashCode();
            }
            if (hasDataUploadRequest()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getDataUploadRequest().hashCode();
            }
            if (hasDataUploadResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getDataUploadResponse().hashCode();
            }
            if (hasDataUploadCanceledNotification()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getDataUploadCanceledNotification().hashCode();
            }
            if (hasFileAccessItemRequest()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getFileAccessItemRequest().hashCode();
            }
            if (hasFileAccessItemResponse()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getFileAccessItemResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataTransferService_fieldAccessorTable.ensureFieldAccessorsInitialized(DataTransferService.class, Builder.class);
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
            if (hasDataDownloadRequest() && !getDataDownloadRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasDataDownloadResponse() && !getDataDownloadResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasInitiateDataUploadRequest() && !getInitiateDataUploadRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasInitiateDataUploadResponse() && !getInitiateDataUploadResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasDataUploadRequest() && !getDataUploadRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasDataUploadResponse() && !getDataUploadResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasDataUploadCanceledNotification() && !getDataUploadCanceledNotification().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasFileAccessItemResponse() || getFileAccessItemResponse().isInitialized()) {
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
            return new DataTransferService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getDataDownloadRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getDataDownloadResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getInitiateDataUploadRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getInitiateDataUploadResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getDataUploadRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getDataUploadResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getDataUploadCanceledNotification());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getFileAccessItemRequest());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getFileAccessItemResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DataTransferServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<DataDownloadRequest, DataDownloadRequest.Builder, DataDownloadRequestOrBuilder> dataDownloadRequestBuilder_;
            private DataDownloadRequest dataDownloadRequest_;
            private SingleFieldBuilderV3<DataDownloadResponse, DataDownloadResponse.Builder, DataDownloadResponseOrBuilder> dataDownloadResponseBuilder_;
            private DataDownloadResponse dataDownloadResponse_;
            private SingleFieldBuilderV3<DataUploadCanceledNotification, DataUploadCanceledNotification.Builder, DataUploadCanceledNotificationOrBuilder> dataUploadCanceledNotificationBuilder_;
            private DataUploadCanceledNotification dataUploadCanceledNotification_;
            private SingleFieldBuilderV3<DataUploadRequest, DataUploadRequest.Builder, DataUploadRequestOrBuilder> dataUploadRequestBuilder_;
            private DataUploadRequest dataUploadRequest_;
            private SingleFieldBuilderV3<DataUploadResponse, DataUploadResponse.Builder, DataUploadResponseOrBuilder> dataUploadResponseBuilder_;
            private DataUploadResponse dataUploadResponse_;
            private SingleFieldBuilderV3<FileAccessItemRequest, FileAccessItemRequest.Builder, FileAccessItemRequestOrBuilder> fileAccessItemRequestBuilder_;
            private FileAccessItemRequest fileAccessItemRequest_;
            private SingleFieldBuilderV3<FileAccessItemResponse, FileAccessItemResponse.Builder, FileAccessItemResponseOrBuilder> fileAccessItemResponseBuilder_;
            private FileAccessItemResponse fileAccessItemResponse_;
            private SingleFieldBuilderV3<InitiateDataUploadRequest, InitiateDataUploadRequest.Builder, InitiateDataUploadRequestOrBuilder> initiateDataUploadRequestBuilder_;
            private InitiateDataUploadRequest initiateDataUploadRequest_;
            private SingleFieldBuilderV3<InitiateDataUploadResponse, InitiateDataUploadResponse.Builder, InitiateDataUploadResponseOrBuilder> initiateDataUploadResponseBuilder_;
            private InitiateDataUploadResponse initiateDataUploadResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(DataTransferService dataTransferService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<DataDownloadRequest, DataDownloadRequest.Builder, DataDownloadRequestOrBuilder> singleFieldBuilderV3 = this.dataDownloadRequestBuilder_;
                    dataTransferService.dataDownloadRequest_ = singleFieldBuilderV3 == null ? this.dataDownloadRequest_ : (DataDownloadRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<DataDownloadResponse, DataDownloadResponse.Builder, DataDownloadResponseOrBuilder> singleFieldBuilderV4 = this.dataDownloadResponseBuilder_;
                    dataTransferService.dataDownloadResponse_ = singleFieldBuilderV4 == null ? this.dataDownloadResponse_ : (DataDownloadResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<InitiateDataUploadRequest, InitiateDataUploadRequest.Builder, InitiateDataUploadRequestOrBuilder> singleFieldBuilderV5 = this.initiateDataUploadRequestBuilder_;
                    dataTransferService.initiateDataUploadRequest_ = singleFieldBuilderV5 == null ? this.initiateDataUploadRequest_ : (InitiateDataUploadRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<InitiateDataUploadResponse, InitiateDataUploadResponse.Builder, InitiateDataUploadResponseOrBuilder> singleFieldBuilderV6 = this.initiateDataUploadResponseBuilder_;
                    dataTransferService.initiateDataUploadResponse_ = singleFieldBuilderV6 == null ? this.initiateDataUploadResponse_ : (InitiateDataUploadResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<DataUploadRequest, DataUploadRequest.Builder, DataUploadRequestOrBuilder> singleFieldBuilderV7 = this.dataUploadRequestBuilder_;
                    dataTransferService.dataUploadRequest_ = singleFieldBuilderV7 == null ? this.dataUploadRequest_ : (DataUploadRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<DataUploadResponse, DataUploadResponse.Builder, DataUploadResponseOrBuilder> singleFieldBuilderV8 = this.dataUploadResponseBuilder_;
                    dataTransferService.dataUploadResponse_ = singleFieldBuilderV8 == null ? this.dataUploadResponse_ : (DataUploadResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<DataUploadCanceledNotification, DataUploadCanceledNotification.Builder, DataUploadCanceledNotificationOrBuilder> singleFieldBuilderV9 = this.dataUploadCanceledNotificationBuilder_;
                    dataTransferService.dataUploadCanceledNotification_ = singleFieldBuilderV9 == null ? this.dataUploadCanceledNotification_ : (DataUploadCanceledNotification) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<FileAccessItemRequest, FileAccessItemRequest.Builder, FileAccessItemRequestOrBuilder> singleFieldBuilderV10 = this.fileAccessItemRequestBuilder_;
                    dataTransferService.fileAccessItemRequest_ = singleFieldBuilderV10 == null ? this.fileAccessItemRequest_ : (FileAccessItemRequest) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<FileAccessItemResponse, FileAccessItemResponse.Builder, FileAccessItemResponseOrBuilder> singleFieldBuilderV11 = this.fileAccessItemResponseBuilder_;
                    dataTransferService.fileAccessItemResponse_ = singleFieldBuilderV11 == null ? this.fileAccessItemResponse_ : (FileAccessItemResponse) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                dataTransferService.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<DataDownloadRequest, DataDownloadRequest.Builder, DataDownloadRequestOrBuilder> getDataDownloadRequestFieldBuilder() {
                if (this.dataDownloadRequestBuilder_ == null) {
                    this.dataDownloadRequestBuilder_ = new SingleFieldBuilderV3<>(getDataDownloadRequest(), getParentForChildren(), isClean());
                    this.dataDownloadRequest_ = null;
                }
                return this.dataDownloadRequestBuilder_;
            }

            private SingleFieldBuilderV3<DataDownloadResponse, DataDownloadResponse.Builder, DataDownloadResponseOrBuilder> getDataDownloadResponseFieldBuilder() {
                if (this.dataDownloadResponseBuilder_ == null) {
                    this.dataDownloadResponseBuilder_ = new SingleFieldBuilderV3<>(getDataDownloadResponse(), getParentForChildren(), isClean());
                    this.dataDownloadResponse_ = null;
                }
                return this.dataDownloadResponseBuilder_;
            }

            private SingleFieldBuilderV3<DataUploadCanceledNotification, DataUploadCanceledNotification.Builder, DataUploadCanceledNotificationOrBuilder> getDataUploadCanceledNotificationFieldBuilder() {
                if (this.dataUploadCanceledNotificationBuilder_ == null) {
                    this.dataUploadCanceledNotificationBuilder_ = new SingleFieldBuilderV3<>(getDataUploadCanceledNotification(), getParentForChildren(), isClean());
                    this.dataUploadCanceledNotification_ = null;
                }
                return this.dataUploadCanceledNotificationBuilder_;
            }

            private SingleFieldBuilderV3<DataUploadRequest, DataUploadRequest.Builder, DataUploadRequestOrBuilder> getDataUploadRequestFieldBuilder() {
                if (this.dataUploadRequestBuilder_ == null) {
                    this.dataUploadRequestBuilder_ = new SingleFieldBuilderV3<>(getDataUploadRequest(), getParentForChildren(), isClean());
                    this.dataUploadRequest_ = null;
                }
                return this.dataUploadRequestBuilder_;
            }

            private SingleFieldBuilderV3<DataUploadResponse, DataUploadResponse.Builder, DataUploadResponseOrBuilder> getDataUploadResponseFieldBuilder() {
                if (this.dataUploadResponseBuilder_ == null) {
                    this.dataUploadResponseBuilder_ = new SingleFieldBuilderV3<>(getDataUploadResponse(), getParentForChildren(), isClean());
                    this.dataUploadResponse_ = null;
                }
                return this.dataUploadResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataTransferService_descriptor;
            }

            private SingleFieldBuilderV3<FileAccessItemRequest, FileAccessItemRequest.Builder, FileAccessItemRequestOrBuilder> getFileAccessItemRequestFieldBuilder() {
                if (this.fileAccessItemRequestBuilder_ == null) {
                    this.fileAccessItemRequestBuilder_ = new SingleFieldBuilderV3<>(getFileAccessItemRequest(), getParentForChildren(), isClean());
                    this.fileAccessItemRequest_ = null;
                }
                return this.fileAccessItemRequestBuilder_;
            }

            private SingleFieldBuilderV3<FileAccessItemResponse, FileAccessItemResponse.Builder, FileAccessItemResponseOrBuilder> getFileAccessItemResponseFieldBuilder() {
                if (this.fileAccessItemResponseBuilder_ == null) {
                    this.fileAccessItemResponseBuilder_ = new SingleFieldBuilderV3<>(getFileAccessItemResponse(), getParentForChildren(), isClean());
                    this.fileAccessItemResponse_ = null;
                }
                return this.fileAccessItemResponseBuilder_;
            }

            private SingleFieldBuilderV3<InitiateDataUploadRequest, InitiateDataUploadRequest.Builder, InitiateDataUploadRequestOrBuilder> getInitiateDataUploadRequestFieldBuilder() {
                if (this.initiateDataUploadRequestBuilder_ == null) {
                    this.initiateDataUploadRequestBuilder_ = new SingleFieldBuilderV3<>(getInitiateDataUploadRequest(), getParentForChildren(), isClean());
                    this.initiateDataUploadRequest_ = null;
                }
                return this.initiateDataUploadRequestBuilder_;
            }

            private SingleFieldBuilderV3<InitiateDataUploadResponse, InitiateDataUploadResponse.Builder, InitiateDataUploadResponseOrBuilder> getInitiateDataUploadResponseFieldBuilder() {
                if (this.initiateDataUploadResponseBuilder_ == null) {
                    this.initiateDataUploadResponseBuilder_ = new SingleFieldBuilderV3<>(getInitiateDataUploadResponse(), getParentForChildren(), isClean());
                    this.initiateDataUploadResponse_ = null;
                }
                return this.initiateDataUploadResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getDataDownloadRequestFieldBuilder();
                    getDataDownloadResponseFieldBuilder();
                    getInitiateDataUploadRequestFieldBuilder();
                    getInitiateDataUploadResponseFieldBuilder();
                    getDataUploadRequestFieldBuilder();
                    getDataUploadResponseFieldBuilder();
                    getDataUploadCanceledNotificationFieldBuilder();
                    getFileAccessItemRequestFieldBuilder();
                    getFileAccessItemResponseFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataTransferService build() {
                DataTransferService dataTransferServiceBuildPartial = buildPartial();
                if (dataTransferServiceBuildPartial.isInitialized()) {
                    return dataTransferServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataTransferServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataTransferService buildPartial() {
                DataTransferService dataTransferService = new DataTransferService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(dataTransferService);
                }
                onBuilt();
                return dataTransferService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.dataDownloadRequest_ = null;
                SingleFieldBuilderV3<DataDownloadRequest, DataDownloadRequest.Builder, DataDownloadRequestOrBuilder> singleFieldBuilderV3 = this.dataDownloadRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.dataDownloadRequestBuilder_ = null;
                }
                this.dataDownloadResponse_ = null;
                SingleFieldBuilderV3<DataDownloadResponse, DataDownloadResponse.Builder, DataDownloadResponseOrBuilder> singleFieldBuilderV4 = this.dataDownloadResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.dataDownloadResponseBuilder_ = null;
                }
                this.initiateDataUploadRequest_ = null;
                SingleFieldBuilderV3<InitiateDataUploadRequest, InitiateDataUploadRequest.Builder, InitiateDataUploadRequestOrBuilder> singleFieldBuilderV5 = this.initiateDataUploadRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.initiateDataUploadRequestBuilder_ = null;
                }
                this.initiateDataUploadResponse_ = null;
                SingleFieldBuilderV3<InitiateDataUploadResponse, InitiateDataUploadResponse.Builder, InitiateDataUploadResponseOrBuilder> singleFieldBuilderV6 = this.initiateDataUploadResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.initiateDataUploadResponseBuilder_ = null;
                }
                this.dataUploadRequest_ = null;
                SingleFieldBuilderV3<DataUploadRequest, DataUploadRequest.Builder, DataUploadRequestOrBuilder> singleFieldBuilderV7 = this.dataUploadRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.dataUploadRequestBuilder_ = null;
                }
                this.dataUploadResponse_ = null;
                SingleFieldBuilderV3<DataUploadResponse, DataUploadResponse.Builder, DataUploadResponseOrBuilder> singleFieldBuilderV8 = this.dataUploadResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.dataUploadResponseBuilder_ = null;
                }
                this.dataUploadCanceledNotification_ = null;
                SingleFieldBuilderV3<DataUploadCanceledNotification, DataUploadCanceledNotification.Builder, DataUploadCanceledNotificationOrBuilder> singleFieldBuilderV9 = this.dataUploadCanceledNotificationBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.dataUploadCanceledNotificationBuilder_ = null;
                }
                this.fileAccessItemRequest_ = null;
                SingleFieldBuilderV3<FileAccessItemRequest, FileAccessItemRequest.Builder, FileAccessItemRequestOrBuilder> singleFieldBuilderV10 = this.fileAccessItemRequestBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.fileAccessItemRequestBuilder_ = null;
                }
                this.fileAccessItemResponse_ = null;
                SingleFieldBuilderV3<FileAccessItemResponse, FileAccessItemResponse.Builder, FileAccessItemResponseOrBuilder> singleFieldBuilderV11 = this.fileAccessItemResponseBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.fileAccessItemResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearDataDownloadRequest() {
                this.bitField0_ &= -2;
                this.dataDownloadRequest_ = null;
                SingleFieldBuilderV3<DataDownloadRequest, DataDownloadRequest.Builder, DataDownloadRequestOrBuilder> singleFieldBuilderV3 = this.dataDownloadRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.dataDownloadRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDataDownloadResponse() {
                this.bitField0_ &= -3;
                this.dataDownloadResponse_ = null;
                SingleFieldBuilderV3<DataDownloadResponse, DataDownloadResponse.Builder, DataDownloadResponseOrBuilder> singleFieldBuilderV3 = this.dataDownloadResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.dataDownloadResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDataUploadCanceledNotification() {
                this.bitField0_ &= -65;
                this.dataUploadCanceledNotification_ = null;
                SingleFieldBuilderV3<DataUploadCanceledNotification, DataUploadCanceledNotification.Builder, DataUploadCanceledNotificationOrBuilder> singleFieldBuilderV3 = this.dataUploadCanceledNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.dataUploadCanceledNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDataUploadRequest() {
                this.bitField0_ &= -17;
                this.dataUploadRequest_ = null;
                SingleFieldBuilderV3<DataUploadRequest, DataUploadRequest.Builder, DataUploadRequestOrBuilder> singleFieldBuilderV3 = this.dataUploadRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.dataUploadRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearDataUploadResponse() {
                this.bitField0_ &= -33;
                this.dataUploadResponse_ = null;
                SingleFieldBuilderV3<DataUploadResponse, DataUploadResponse.Builder, DataUploadResponseOrBuilder> singleFieldBuilderV3 = this.dataUploadResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.dataUploadResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearFileAccessItemRequest() {
                this.bitField0_ &= -129;
                this.fileAccessItemRequest_ = null;
                SingleFieldBuilderV3<FileAccessItemRequest, FileAccessItemRequest.Builder, FileAccessItemRequestOrBuilder> singleFieldBuilderV3 = this.fileAccessItemRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.fileAccessItemRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearFileAccessItemResponse() {
                this.bitField0_ &= -257;
                this.fileAccessItemResponse_ = null;
                SingleFieldBuilderV3<FileAccessItemResponse, FileAccessItemResponse.Builder, FileAccessItemResponseOrBuilder> singleFieldBuilderV3 = this.fileAccessItemResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.fileAccessItemResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearInitiateDataUploadRequest() {
                this.bitField0_ &= -5;
                this.initiateDataUploadRequest_ = null;
                SingleFieldBuilderV3<InitiateDataUploadRequest, InitiateDataUploadRequest.Builder, InitiateDataUploadRequestOrBuilder> singleFieldBuilderV3 = this.initiateDataUploadRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.initiateDataUploadRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearInitiateDataUploadResponse() {
                this.bitField0_ &= -9;
                this.initiateDataUploadResponse_ = null;
                SingleFieldBuilderV3<InitiateDataUploadResponse, InitiateDataUploadResponse.Builder, InitiateDataUploadResponseOrBuilder> singleFieldBuilderV3 = this.initiateDataUploadResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.initiateDataUploadResponseBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
            public DataDownloadRequest getDataDownloadRequest() {
                SingleFieldBuilderV3<DataDownloadRequest, DataDownloadRequest.Builder, DataDownloadRequestOrBuilder> singleFieldBuilderV3 = this.dataDownloadRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataDownloadRequest) singleFieldBuilderV3.getMessage();
                }
                DataDownloadRequest dataDownloadRequest = this.dataDownloadRequest_;
                return dataDownloadRequest == null ? DataDownloadRequest.getDefaultInstance() : dataDownloadRequest;
            }

            public DataDownloadRequest.Builder getDataDownloadRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (DataDownloadRequest.Builder) getDataDownloadRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
            public DataDownloadRequestOrBuilder getDataDownloadRequestOrBuilder() {
                SingleFieldBuilderV3<DataDownloadRequest, DataDownloadRequest.Builder, DataDownloadRequestOrBuilder> singleFieldBuilderV3 = this.dataDownloadRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataDownloadRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DataDownloadRequest dataDownloadRequest = this.dataDownloadRequest_;
                return dataDownloadRequest == null ? DataDownloadRequest.getDefaultInstance() : dataDownloadRequest;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
            public DataDownloadResponse getDataDownloadResponse() {
                SingleFieldBuilderV3<DataDownloadResponse, DataDownloadResponse.Builder, DataDownloadResponseOrBuilder> singleFieldBuilderV3 = this.dataDownloadResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataDownloadResponse) singleFieldBuilderV3.getMessage();
                }
                DataDownloadResponse dataDownloadResponse = this.dataDownloadResponse_;
                return dataDownloadResponse == null ? DataDownloadResponse.getDefaultInstance() : dataDownloadResponse;
            }

            public DataDownloadResponse.Builder getDataDownloadResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (DataDownloadResponse.Builder) getDataDownloadResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
            public DataDownloadResponseOrBuilder getDataDownloadResponseOrBuilder() {
                SingleFieldBuilderV3<DataDownloadResponse, DataDownloadResponse.Builder, DataDownloadResponseOrBuilder> singleFieldBuilderV3 = this.dataDownloadResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataDownloadResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DataDownloadResponse dataDownloadResponse = this.dataDownloadResponse_;
                return dataDownloadResponse == null ? DataDownloadResponse.getDefaultInstance() : dataDownloadResponse;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
            public DataUploadCanceledNotification getDataUploadCanceledNotification() {
                SingleFieldBuilderV3<DataUploadCanceledNotification, DataUploadCanceledNotification.Builder, DataUploadCanceledNotificationOrBuilder> singleFieldBuilderV3 = this.dataUploadCanceledNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataUploadCanceledNotification) singleFieldBuilderV3.getMessage();
                }
                DataUploadCanceledNotification dataUploadCanceledNotification = this.dataUploadCanceledNotification_;
                return dataUploadCanceledNotification == null ? DataUploadCanceledNotification.getDefaultInstance() : dataUploadCanceledNotification;
            }

            public DataUploadCanceledNotification.Builder getDataUploadCanceledNotificationBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (DataUploadCanceledNotification.Builder) getDataUploadCanceledNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
            public DataUploadCanceledNotificationOrBuilder getDataUploadCanceledNotificationOrBuilder() {
                SingleFieldBuilderV3<DataUploadCanceledNotification, DataUploadCanceledNotification.Builder, DataUploadCanceledNotificationOrBuilder> singleFieldBuilderV3 = this.dataUploadCanceledNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataUploadCanceledNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DataUploadCanceledNotification dataUploadCanceledNotification = this.dataUploadCanceledNotification_;
                return dataUploadCanceledNotification == null ? DataUploadCanceledNotification.getDefaultInstance() : dataUploadCanceledNotification;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
            public DataUploadRequest getDataUploadRequest() {
                SingleFieldBuilderV3<DataUploadRequest, DataUploadRequest.Builder, DataUploadRequestOrBuilder> singleFieldBuilderV3 = this.dataUploadRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataUploadRequest) singleFieldBuilderV3.getMessage();
                }
                DataUploadRequest dataUploadRequest = this.dataUploadRequest_;
                return dataUploadRequest == null ? DataUploadRequest.getDefaultInstance() : dataUploadRequest;
            }

            public DataUploadRequest.Builder getDataUploadRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (DataUploadRequest.Builder) getDataUploadRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
            public DataUploadRequestOrBuilder getDataUploadRequestOrBuilder() {
                SingleFieldBuilderV3<DataUploadRequest, DataUploadRequest.Builder, DataUploadRequestOrBuilder> singleFieldBuilderV3 = this.dataUploadRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataUploadRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DataUploadRequest dataUploadRequest = this.dataUploadRequest_;
                return dataUploadRequest == null ? DataUploadRequest.getDefaultInstance() : dataUploadRequest;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
            public DataUploadResponse getDataUploadResponse() {
                SingleFieldBuilderV3<DataUploadResponse, DataUploadResponse.Builder, DataUploadResponseOrBuilder> singleFieldBuilderV3 = this.dataUploadResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataUploadResponse) singleFieldBuilderV3.getMessage();
                }
                DataUploadResponse dataUploadResponse = this.dataUploadResponse_;
                return dataUploadResponse == null ? DataUploadResponse.getDefaultInstance() : dataUploadResponse;
            }

            public DataUploadResponse.Builder getDataUploadResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (DataUploadResponse.Builder) getDataUploadResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
            public DataUploadResponseOrBuilder getDataUploadResponseOrBuilder() {
                SingleFieldBuilderV3<DataUploadResponse, DataUploadResponse.Builder, DataUploadResponseOrBuilder> singleFieldBuilderV3 = this.dataUploadResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataUploadResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DataUploadResponse dataUploadResponse = this.dataUploadResponse_;
                return dataUploadResponse == null ? DataUploadResponse.getDefaultInstance() : dataUploadResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataTransferService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
            public FileAccessItemRequest getFileAccessItemRequest() {
                SingleFieldBuilderV3<FileAccessItemRequest, FileAccessItemRequest.Builder, FileAccessItemRequestOrBuilder> singleFieldBuilderV3 = this.fileAccessItemRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FileAccessItemRequest) singleFieldBuilderV3.getMessage();
                }
                FileAccessItemRequest fileAccessItemRequest = this.fileAccessItemRequest_;
                return fileAccessItemRequest == null ? FileAccessItemRequest.getDefaultInstance() : fileAccessItemRequest;
            }

            public FileAccessItemRequest.Builder getFileAccessItemRequestBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (FileAccessItemRequest.Builder) getFileAccessItemRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
            public FileAccessItemRequestOrBuilder getFileAccessItemRequestOrBuilder() {
                SingleFieldBuilderV3<FileAccessItemRequest, FileAccessItemRequest.Builder, FileAccessItemRequestOrBuilder> singleFieldBuilderV3 = this.fileAccessItemRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FileAccessItemRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FileAccessItemRequest fileAccessItemRequest = this.fileAccessItemRequest_;
                return fileAccessItemRequest == null ? FileAccessItemRequest.getDefaultInstance() : fileAccessItemRequest;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
            public FileAccessItemResponse getFileAccessItemResponse() {
                SingleFieldBuilderV3<FileAccessItemResponse, FileAccessItemResponse.Builder, FileAccessItemResponseOrBuilder> singleFieldBuilderV3 = this.fileAccessItemResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FileAccessItemResponse) singleFieldBuilderV3.getMessage();
                }
                FileAccessItemResponse fileAccessItemResponse = this.fileAccessItemResponse_;
                return fileAccessItemResponse == null ? FileAccessItemResponse.getDefaultInstance() : fileAccessItemResponse;
            }

            public FileAccessItemResponse.Builder getFileAccessItemResponseBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (FileAccessItemResponse.Builder) getFileAccessItemResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
            public FileAccessItemResponseOrBuilder getFileAccessItemResponseOrBuilder() {
                SingleFieldBuilderV3<FileAccessItemResponse, FileAccessItemResponse.Builder, FileAccessItemResponseOrBuilder> singleFieldBuilderV3 = this.fileAccessItemResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FileAccessItemResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FileAccessItemResponse fileAccessItemResponse = this.fileAccessItemResponse_;
                return fileAccessItemResponse == null ? FileAccessItemResponse.getDefaultInstance() : fileAccessItemResponse;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
            public InitiateDataUploadRequest getInitiateDataUploadRequest() {
                SingleFieldBuilderV3<InitiateDataUploadRequest, InitiateDataUploadRequest.Builder, InitiateDataUploadRequestOrBuilder> singleFieldBuilderV3 = this.initiateDataUploadRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (InitiateDataUploadRequest) singleFieldBuilderV3.getMessage();
                }
                InitiateDataUploadRequest initiateDataUploadRequest = this.initiateDataUploadRequest_;
                return initiateDataUploadRequest == null ? InitiateDataUploadRequest.getDefaultInstance() : initiateDataUploadRequest;
            }

            public InitiateDataUploadRequest.Builder getInitiateDataUploadRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (InitiateDataUploadRequest.Builder) getInitiateDataUploadRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
            public InitiateDataUploadRequestOrBuilder getInitiateDataUploadRequestOrBuilder() {
                SingleFieldBuilderV3<InitiateDataUploadRequest, InitiateDataUploadRequest.Builder, InitiateDataUploadRequestOrBuilder> singleFieldBuilderV3 = this.initiateDataUploadRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (InitiateDataUploadRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                InitiateDataUploadRequest initiateDataUploadRequest = this.initiateDataUploadRequest_;
                return initiateDataUploadRequest == null ? InitiateDataUploadRequest.getDefaultInstance() : initiateDataUploadRequest;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
            public InitiateDataUploadResponse getInitiateDataUploadResponse() {
                SingleFieldBuilderV3<InitiateDataUploadResponse, InitiateDataUploadResponse.Builder, InitiateDataUploadResponseOrBuilder> singleFieldBuilderV3 = this.initiateDataUploadResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (InitiateDataUploadResponse) singleFieldBuilderV3.getMessage();
                }
                InitiateDataUploadResponse initiateDataUploadResponse = this.initiateDataUploadResponse_;
                return initiateDataUploadResponse == null ? InitiateDataUploadResponse.getDefaultInstance() : initiateDataUploadResponse;
            }

            public InitiateDataUploadResponse.Builder getInitiateDataUploadResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (InitiateDataUploadResponse.Builder) getInitiateDataUploadResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
            public InitiateDataUploadResponseOrBuilder getInitiateDataUploadResponseOrBuilder() {
                SingleFieldBuilderV3<InitiateDataUploadResponse, InitiateDataUploadResponse.Builder, InitiateDataUploadResponseOrBuilder> singleFieldBuilderV3 = this.initiateDataUploadResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (InitiateDataUploadResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                InitiateDataUploadResponse initiateDataUploadResponse = this.initiateDataUploadResponse_;
                return initiateDataUploadResponse == null ? InitiateDataUploadResponse.getDefaultInstance() : initiateDataUploadResponse;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
            public boolean hasDataDownloadRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
            public boolean hasDataDownloadResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
            public boolean hasDataUploadCanceledNotification() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
            public boolean hasDataUploadRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
            public boolean hasDataUploadResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
            public boolean hasFileAccessItemRequest() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
            public boolean hasFileAccessItemResponse() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
            public boolean hasInitiateDataUploadRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataTransferServiceOrBuilder
            public boolean hasInitiateDataUploadResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataTransferService_fieldAccessorTable.ensureFieldAccessorsInitialized(DataTransferService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasDataDownloadRequest() && !getDataDownloadRequest().isInitialized()) {
                    return false;
                }
                if (hasDataDownloadResponse() && !getDataDownloadResponse().isInitialized()) {
                    return false;
                }
                if (hasInitiateDataUploadRequest() && !getInitiateDataUploadRequest().isInitialized()) {
                    return false;
                }
                if (hasInitiateDataUploadResponse() && !getInitiateDataUploadResponse().isInitialized()) {
                    return false;
                }
                if (hasDataUploadRequest() && !getDataUploadRequest().isInitialized()) {
                    return false;
                }
                if (hasDataUploadResponse() && !getDataUploadResponse().isInitialized()) {
                    return false;
                }
                if (!hasDataUploadCanceledNotification() || getDataUploadCanceledNotification().isInitialized()) {
                    return !hasFileAccessItemResponse() || getFileAccessItemResponse().isInitialized();
                }
                return false;
            }

            public Builder mergeDataDownloadRequest(DataDownloadRequest dataDownloadRequest) {
                DataDownloadRequest dataDownloadRequest2;
                SingleFieldBuilderV3<DataDownloadRequest, DataDownloadRequest.Builder, DataDownloadRequestOrBuilder> singleFieldBuilderV3 = this.dataDownloadRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dataDownloadRequest);
                } else if ((this.bitField0_ & 1) == 0 || (dataDownloadRequest2 = this.dataDownloadRequest_) == null || dataDownloadRequest2 == DataDownloadRequest.getDefaultInstance()) {
                    this.dataDownloadRequest_ = dataDownloadRequest;
                } else {
                    getDataDownloadRequestBuilder().mergeFrom(dataDownloadRequest);
                }
                if (this.dataDownloadRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDataDownloadResponse(DataDownloadResponse dataDownloadResponse) {
                DataDownloadResponse dataDownloadResponse2;
                SingleFieldBuilderV3<DataDownloadResponse, DataDownloadResponse.Builder, DataDownloadResponseOrBuilder> singleFieldBuilderV3 = this.dataDownloadResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dataDownloadResponse);
                } else if ((this.bitField0_ & 2) == 0 || (dataDownloadResponse2 = this.dataDownloadResponse_) == null || dataDownloadResponse2 == DataDownloadResponse.getDefaultInstance()) {
                    this.dataDownloadResponse_ = dataDownloadResponse;
                } else {
                    getDataDownloadResponseBuilder().mergeFrom(dataDownloadResponse);
                }
                if (this.dataDownloadResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDataUploadCanceledNotification(DataUploadCanceledNotification dataUploadCanceledNotification) {
                DataUploadCanceledNotification dataUploadCanceledNotification2;
                SingleFieldBuilderV3<DataUploadCanceledNotification, DataUploadCanceledNotification.Builder, DataUploadCanceledNotificationOrBuilder> singleFieldBuilderV3 = this.dataUploadCanceledNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dataUploadCanceledNotification);
                } else if ((this.bitField0_ & 64) == 0 || (dataUploadCanceledNotification2 = this.dataUploadCanceledNotification_) == null || dataUploadCanceledNotification2 == DataUploadCanceledNotification.getDefaultInstance()) {
                    this.dataUploadCanceledNotification_ = dataUploadCanceledNotification;
                } else {
                    getDataUploadCanceledNotificationBuilder().mergeFrom(dataUploadCanceledNotification);
                }
                if (this.dataUploadCanceledNotification_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDataUploadRequest(DataUploadRequest dataUploadRequest) {
                DataUploadRequest dataUploadRequest2;
                SingleFieldBuilderV3<DataUploadRequest, DataUploadRequest.Builder, DataUploadRequestOrBuilder> singleFieldBuilderV3 = this.dataUploadRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dataUploadRequest);
                } else if ((this.bitField0_ & 16) == 0 || (dataUploadRequest2 = this.dataUploadRequest_) == null || dataUploadRequest2 == DataUploadRequest.getDefaultInstance()) {
                    this.dataUploadRequest_ = dataUploadRequest;
                } else {
                    getDataUploadRequestBuilder().mergeFrom(dataUploadRequest);
                }
                if (this.dataUploadRequest_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeDataUploadResponse(DataUploadResponse dataUploadResponse) {
                DataUploadResponse dataUploadResponse2;
                SingleFieldBuilderV3<DataUploadResponse, DataUploadResponse.Builder, DataUploadResponseOrBuilder> singleFieldBuilderV3 = this.dataUploadResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dataUploadResponse);
                } else if ((this.bitField0_ & 32) == 0 || (dataUploadResponse2 = this.dataUploadResponse_) == null || dataUploadResponse2 == DataUploadResponse.getDefaultInstance()) {
                    this.dataUploadResponse_ = dataUploadResponse;
                } else {
                    getDataUploadResponseBuilder().mergeFrom(dataUploadResponse);
                }
                if (this.dataUploadResponse_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeFileAccessItemRequest(FileAccessItemRequest fileAccessItemRequest) {
                FileAccessItemRequest fileAccessItemRequest2;
                SingleFieldBuilderV3<FileAccessItemRequest, FileAccessItemRequest.Builder, FileAccessItemRequestOrBuilder> singleFieldBuilderV3 = this.fileAccessItemRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(fileAccessItemRequest);
                } else if ((this.bitField0_ & 128) == 0 || (fileAccessItemRequest2 = this.fileAccessItemRequest_) == null || fileAccessItemRequest2 == FileAccessItemRequest.getDefaultInstance()) {
                    this.fileAccessItemRequest_ = fileAccessItemRequest;
                } else {
                    getFileAccessItemRequestBuilder().mergeFrom(fileAccessItemRequest);
                }
                if (this.fileAccessItemRequest_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder mergeFileAccessItemResponse(FileAccessItemResponse fileAccessItemResponse) {
                FileAccessItemResponse fileAccessItemResponse2;
                SingleFieldBuilderV3<FileAccessItemResponse, FileAccessItemResponse.Builder, FileAccessItemResponseOrBuilder> singleFieldBuilderV3 = this.fileAccessItemResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(fileAccessItemResponse);
                } else if ((this.bitField0_ & 256) == 0 || (fileAccessItemResponse2 = this.fileAccessItemResponse_) == null || fileAccessItemResponse2 == FileAccessItemResponse.getDefaultInstance()) {
                    this.fileAccessItemResponse_ = fileAccessItemResponse;
                } else {
                    getFileAccessItemResponseBuilder().mergeFrom(fileAccessItemResponse);
                }
                if (this.fileAccessItemResponse_ != null) {
                    this.bitField0_ |= 256;
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
                                    codedInputStream.readMessage(getDataDownloadRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getDataDownloadResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getInitiateDataUploadRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getInitiateDataUploadResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getDataUploadRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(getDataUploadResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                } else if (tag == 58) {
                                    codedInputStream.readMessage(getDataUploadCanceledNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                } else if (tag == 66) {
                                    codedInputStream.readMessage(getFileAccessItemRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                } else if (tag == 74) {
                                    codedInputStream.readMessage(getFileAccessItemResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
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

            public Builder mergeInitiateDataUploadRequest(InitiateDataUploadRequest initiateDataUploadRequest) {
                InitiateDataUploadRequest initiateDataUploadRequest2;
                SingleFieldBuilderV3<InitiateDataUploadRequest, InitiateDataUploadRequest.Builder, InitiateDataUploadRequestOrBuilder> singleFieldBuilderV3 = this.initiateDataUploadRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(initiateDataUploadRequest);
                } else if ((this.bitField0_ & 4) == 0 || (initiateDataUploadRequest2 = this.initiateDataUploadRequest_) == null || initiateDataUploadRequest2 == InitiateDataUploadRequest.getDefaultInstance()) {
                    this.initiateDataUploadRequest_ = initiateDataUploadRequest;
                } else {
                    getInitiateDataUploadRequestBuilder().mergeFrom(initiateDataUploadRequest);
                }
                if (this.initiateDataUploadRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeInitiateDataUploadResponse(InitiateDataUploadResponse initiateDataUploadResponse) {
                InitiateDataUploadResponse initiateDataUploadResponse2;
                SingleFieldBuilderV3<InitiateDataUploadResponse, InitiateDataUploadResponse.Builder, InitiateDataUploadResponseOrBuilder> singleFieldBuilderV3 = this.initiateDataUploadResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(initiateDataUploadResponse);
                } else if ((this.bitField0_ & 8) == 0 || (initiateDataUploadResponse2 = this.initiateDataUploadResponse_) == null || initiateDataUploadResponse2 == InitiateDataUploadResponse.getDefaultInstance()) {
                    this.initiateDataUploadResponse_ = initiateDataUploadResponse;
                } else {
                    getInitiateDataUploadResponseBuilder().mergeFrom(initiateDataUploadResponse);
                }
                if (this.initiateDataUploadResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setDataDownloadRequest(DataDownloadRequest.Builder builder) {
                SingleFieldBuilderV3<DataDownloadRequest, DataDownloadRequest.Builder, DataDownloadRequestOrBuilder> singleFieldBuilderV3 = this.dataDownloadRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.dataDownloadRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setDataDownloadResponse(DataDownloadResponse.Builder builder) {
                SingleFieldBuilderV3<DataDownloadResponse, DataDownloadResponse.Builder, DataDownloadResponseOrBuilder> singleFieldBuilderV3 = this.dataDownloadResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.dataDownloadResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setDataUploadCanceledNotification(DataUploadCanceledNotification.Builder builder) {
                SingleFieldBuilderV3<DataUploadCanceledNotification, DataUploadCanceledNotification.Builder, DataUploadCanceledNotificationOrBuilder> singleFieldBuilderV3 = this.dataUploadCanceledNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.dataUploadCanceledNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setDataUploadRequest(DataUploadRequest.Builder builder) {
                SingleFieldBuilderV3<DataUploadRequest, DataUploadRequest.Builder, DataUploadRequestOrBuilder> singleFieldBuilderV3 = this.dataUploadRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.dataUploadRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setDataUploadResponse(DataUploadResponse.Builder builder) {
                SingleFieldBuilderV3<DataUploadResponse, DataUploadResponse.Builder, DataUploadResponseOrBuilder> singleFieldBuilderV3 = this.dataUploadResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.dataUploadResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setFileAccessItemRequest(FileAccessItemRequest.Builder builder) {
                SingleFieldBuilderV3<FileAccessItemRequest, FileAccessItemRequest.Builder, FileAccessItemRequestOrBuilder> singleFieldBuilderV3 = this.fileAccessItemRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.fileAccessItemRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setFileAccessItemResponse(FileAccessItemResponse.Builder builder) {
                SingleFieldBuilderV3<FileAccessItemResponse, FileAccessItemResponse.Builder, FileAccessItemResponseOrBuilder> singleFieldBuilderV3 = this.fileAccessItemResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.fileAccessItemResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setInitiateDataUploadRequest(InitiateDataUploadRequest.Builder builder) {
                SingleFieldBuilderV3<InitiateDataUploadRequest, InitiateDataUploadRequest.Builder, InitiateDataUploadRequestOrBuilder> singleFieldBuilderV3 = this.initiateDataUploadRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.initiateDataUploadRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setInitiateDataUploadResponse(InitiateDataUploadResponse.Builder builder) {
                SingleFieldBuilderV3<InitiateDataUploadResponse, InitiateDataUploadResponse.Builder, InitiateDataUploadResponseOrBuilder> singleFieldBuilderV3 = this.initiateDataUploadResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.initiateDataUploadResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
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
            public DataTransferService getDefaultInstanceForType() {
                return DataTransferService.getDefaultInstance();
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

            public Builder setDataDownloadRequest(DataDownloadRequest dataDownloadRequest) {
                SingleFieldBuilderV3<DataDownloadRequest, DataDownloadRequest.Builder, DataDownloadRequestOrBuilder> singleFieldBuilderV3 = this.dataDownloadRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dataDownloadRequest.getClass();
                    this.dataDownloadRequest_ = dataDownloadRequest;
                } else {
                    singleFieldBuilderV3.setMessage(dataDownloadRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setDataDownloadResponse(DataDownloadResponse dataDownloadResponse) {
                SingleFieldBuilderV3<DataDownloadResponse, DataDownloadResponse.Builder, DataDownloadResponseOrBuilder> singleFieldBuilderV3 = this.dataDownloadResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dataDownloadResponse.getClass();
                    this.dataDownloadResponse_ = dataDownloadResponse;
                } else {
                    singleFieldBuilderV3.setMessage(dataDownloadResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setDataUploadCanceledNotification(DataUploadCanceledNotification dataUploadCanceledNotification) {
                SingleFieldBuilderV3<DataUploadCanceledNotification, DataUploadCanceledNotification.Builder, DataUploadCanceledNotificationOrBuilder> singleFieldBuilderV3 = this.dataUploadCanceledNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dataUploadCanceledNotification.getClass();
                    this.dataUploadCanceledNotification_ = dataUploadCanceledNotification;
                } else {
                    singleFieldBuilderV3.setMessage(dataUploadCanceledNotification);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setDataUploadRequest(DataUploadRequest dataUploadRequest) {
                SingleFieldBuilderV3<DataUploadRequest, DataUploadRequest.Builder, DataUploadRequestOrBuilder> singleFieldBuilderV3 = this.dataUploadRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dataUploadRequest.getClass();
                    this.dataUploadRequest_ = dataUploadRequest;
                } else {
                    singleFieldBuilderV3.setMessage(dataUploadRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setDataUploadResponse(DataUploadResponse dataUploadResponse) {
                SingleFieldBuilderV3<DataUploadResponse, DataUploadResponse.Builder, DataUploadResponseOrBuilder> singleFieldBuilderV3 = this.dataUploadResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dataUploadResponse.getClass();
                    this.dataUploadResponse_ = dataUploadResponse;
                } else {
                    singleFieldBuilderV3.setMessage(dataUploadResponse);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setFileAccessItemRequest(FileAccessItemRequest fileAccessItemRequest) {
                SingleFieldBuilderV3<FileAccessItemRequest, FileAccessItemRequest.Builder, FileAccessItemRequestOrBuilder> singleFieldBuilderV3 = this.fileAccessItemRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    fileAccessItemRequest.getClass();
                    this.fileAccessItemRequest_ = fileAccessItemRequest;
                } else {
                    singleFieldBuilderV3.setMessage(fileAccessItemRequest);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setFileAccessItemResponse(FileAccessItemResponse fileAccessItemResponse) {
                SingleFieldBuilderV3<FileAccessItemResponse, FileAccessItemResponse.Builder, FileAccessItemResponseOrBuilder> singleFieldBuilderV3 = this.fileAccessItemResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    fileAccessItemResponse.getClass();
                    this.fileAccessItemResponse_ = fileAccessItemResponse;
                } else {
                    singleFieldBuilderV3.setMessage(fileAccessItemResponse);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setInitiateDataUploadRequest(InitiateDataUploadRequest initiateDataUploadRequest) {
                SingleFieldBuilderV3<InitiateDataUploadRequest, InitiateDataUploadRequest.Builder, InitiateDataUploadRequestOrBuilder> singleFieldBuilderV3 = this.initiateDataUploadRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    initiateDataUploadRequest.getClass();
                    this.initiateDataUploadRequest_ = initiateDataUploadRequest;
                } else {
                    singleFieldBuilderV3.setMessage(initiateDataUploadRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setInitiateDataUploadResponse(InitiateDataUploadResponse initiateDataUploadResponse) {
                SingleFieldBuilderV3<InitiateDataUploadResponse, InitiateDataUploadResponse.Builder, InitiateDataUploadResponseOrBuilder> singleFieldBuilderV3 = this.initiateDataUploadResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    initiateDataUploadResponse.getClass();
                    this.initiateDataUploadResponse_ = initiateDataUploadResponse;
                } else {
                    singleFieldBuilderV3.setMessage(initiateDataUploadResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DataTransferService) {
                    return mergeFrom((DataTransferService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DataTransferService dataTransferService) {
                if (dataTransferService == DataTransferService.getDefaultInstance()) {
                    return this;
                }
                if (dataTransferService.hasDataDownloadRequest()) {
                    mergeDataDownloadRequest(dataTransferService.getDataDownloadRequest());
                }
                if (dataTransferService.hasDataDownloadResponse()) {
                    mergeDataDownloadResponse(dataTransferService.getDataDownloadResponse());
                }
                if (dataTransferService.hasInitiateDataUploadRequest()) {
                    mergeInitiateDataUploadRequest(dataTransferService.getInitiateDataUploadRequest());
                }
                if (dataTransferService.hasInitiateDataUploadResponse()) {
                    mergeInitiateDataUploadResponse(dataTransferService.getInitiateDataUploadResponse());
                }
                if (dataTransferService.hasDataUploadRequest()) {
                    mergeDataUploadRequest(dataTransferService.getDataUploadRequest());
                }
                if (dataTransferService.hasDataUploadResponse()) {
                    mergeDataUploadResponse(dataTransferService.getDataUploadResponse());
                }
                if (dataTransferService.hasDataUploadCanceledNotification()) {
                    mergeDataUploadCanceledNotification(dataTransferService.getDataUploadCanceledNotification());
                }
                if (dataTransferService.hasFileAccessItemRequest()) {
                    mergeFileAccessItemRequest(dataTransferService.getFileAccessItemRequest());
                }
                if (dataTransferService.hasFileAccessItemResponse()) {
                    mergeFileAccessItemResponse(dataTransferService.getFileAccessItemResponse());
                }
                mergeUnknownFields(dataTransferService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DataTransferService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ DataTransferService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private DataTransferService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DataTransferService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataTransferService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataTransferService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DataTransferService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DataTransferService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DataTransferService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DataTransferService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DataTransferService parseFrom(InputStream inputStream) {
            return (DataTransferService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DataTransferService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataTransferService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataTransferService parseFrom(CodedInputStream codedInputStream) {
            return (DataTransferService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DataTransferService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataTransferService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DataUploadRequest extends GeneratedMessageV3 implements DataUploadRequestOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        public static final int OFFSET_FIELD_NUMBER = 2;
        public static final int PAYLOAD_FIELD_NUMBER = 3;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int id_;
        private byte memoizedIsInitialized;
        private int offset_;
        private ByteString payload_;
        private static final DataUploadRequest DEFAULT_INSTANCE = new DataUploadRequest();

        @Deprecated
        public static final Parser<DataUploadRequest> PARSER = new AbstractParser<DataUploadRequest>() { // from class: com.garmin.proto.generated.GDIDataTransferProto.DataUploadRequest.1
            @Override // com.google.protobuf.Parser
            public DataUploadRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DataUploadRequest.newBuilder();
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

        private DataUploadRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.id_ = 0;
            this.offset_ = 0;
            this.payload_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DataUploadRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataUploadRequest_descriptor;
        }

        public static Builder newBuilder(DataUploadRequest dataUploadRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dataUploadRequest);
        }

        public static DataUploadRequest parseDelimitedFrom(InputStream inputStream) {
            return (DataUploadRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DataUploadRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DataUploadRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DataUploadRequest)) {
                return super.equals(obj);
            }
            DataUploadRequest dataUploadRequest = (DataUploadRequest) obj;
            if (hasId() != dataUploadRequest.hasId()) {
                return false;
            }
            if ((hasId() && getId() != dataUploadRequest.getId()) || hasOffset() != dataUploadRequest.hasOffset()) {
                return false;
            }
            if ((!hasOffset() || getOffset() == dataUploadRequest.getOffset()) && hasPayload() == dataUploadRequest.hasPayload()) {
                return (!hasPayload() || getPayload().equals(dataUploadRequest.getPayload())) && getUnknownFields().equals(dataUploadRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataUploadRequestOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataUploadRequestOrBuilder
        public int getOffset() {
            return this.offset_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DataUploadRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataUploadRequestOrBuilder
        public ByteString getPayload() {
            return this.payload_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.id_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.offset_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeBytesSize(3, this.payload_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataUploadRequestOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataUploadRequestOrBuilder
        public boolean hasOffset() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataUploadRequestOrBuilder
        public boolean hasPayload() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getId();
            }
            if (hasOffset()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getOffset();
            }
            if (hasPayload()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getPayload().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataUploadRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DataUploadRequest.class, Builder.class);
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
            if (!hasId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasOffset()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasPayload()) {
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
            return new DataUploadRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.id_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.offset_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeBytes(3, this.payload_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DataUploadRequestOrBuilder {
            private int bitField0_;
            private int id_;
            private int offset_;
            private ByteString payload_;

            private Builder() {
                this.payload_ = ByteString.EMPTY;
            }

            private void buildPartial0(DataUploadRequest dataUploadRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    dataUploadRequest.id_ = this.id_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    dataUploadRequest.offset_ = this.offset_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    dataUploadRequest.payload_ = this.payload_;
                    i14 |= 4;
                }
                dataUploadRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataUploadRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataUploadRequest build() {
                DataUploadRequest dataUploadRequestBuildPartial = buildPartial();
                if (dataUploadRequestBuildPartial.isInitialized()) {
                    return dataUploadRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataUploadRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataUploadRequest buildPartial() {
                DataUploadRequest dataUploadRequest = new DataUploadRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(dataUploadRequest);
                }
                onBuilt();
                return dataUploadRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = 0;
                this.offset_ = 0;
                this.payload_ = ByteString.EMPTY;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = 0;
                onChanged();
                return this;
            }

            public Builder clearOffset() {
                this.bitField0_ &= -3;
                this.offset_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearPayload() {
                this.bitField0_ &= -5;
                this.payload_ = DataUploadRequest.getDefaultInstance().getPayload();
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
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataUploadRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataUploadRequestOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataUploadRequestOrBuilder
            public int getOffset() {
                return this.offset_;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataUploadRequestOrBuilder
            public ByteString getPayload() {
                return this.payload_;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataUploadRequestOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataUploadRequestOrBuilder
            public boolean hasOffset() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataUploadRequestOrBuilder
            public boolean hasPayload() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataUploadRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(DataUploadRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId() && hasOffset() && hasPayload();
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
                                    this.id_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.offset_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.payload_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
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

            public Builder setId(int i14) {
                this.id_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setOffset(int i14) {
                this.offset_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setPayload(ByteString byteString) {
                byteString.getClass();
                this.payload_ = byteString;
                this.bitField0_ |= 4;
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
            public DataUploadRequest getDefaultInstanceForType() {
                return DataUploadRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.payload_ = ByteString.EMPTY;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DataUploadRequest) {
                    return mergeFrom((DataUploadRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DataUploadRequest dataUploadRequest) {
                if (dataUploadRequest == DataUploadRequest.getDefaultInstance()) {
                    return this;
                }
                if (dataUploadRequest.hasId()) {
                    setId(dataUploadRequest.getId());
                }
                if (dataUploadRequest.hasOffset()) {
                    setOffset(dataUploadRequest.getOffset());
                }
                if (dataUploadRequest.hasPayload()) {
                    setPayload(dataUploadRequest.getPayload());
                }
                mergeUnknownFields(dataUploadRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DataUploadRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DataUploadRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataUploadRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataUploadRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DataUploadRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DataUploadRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DataUploadRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DataUploadRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DataUploadRequest parseFrom(InputStream inputStream) {
            return (DataUploadRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ DataUploadRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DataUploadRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataUploadRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private DataUploadRequest() {
            this.id_ = 0;
            this.offset_ = 0;
            ByteString byteString = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
            this.payload_ = byteString;
        }

        public static DataUploadRequest parseFrom(CodedInputStream codedInputStream) {
            return (DataUploadRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DataUploadRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataUploadRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DataUploadResponse extends GeneratedMessageV3 implements DataUploadResponseOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        public static final int STATUS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int id_;
        private byte memoizedIsInitialized;
        private int status_;
        private static final DataUploadResponse DEFAULT_INSTANCE = new DataUploadResponse();

        @Deprecated
        public static final Parser<DataUploadResponse> PARSER = new AbstractParser<DataUploadResponse>() { // from class: com.garmin.proto.generated.GDIDataTransferProto.DataUploadResponse.1
            @Override // com.google.protobuf.Parser
            public DataUploadResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DataUploadResponse.newBuilder();
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

        private DataUploadResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.id_ = 0;
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DataUploadResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataUploadResponse_descriptor;
        }

        public static Builder newBuilder(DataUploadResponse dataUploadResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dataUploadResponse);
        }

        public static DataUploadResponse parseDelimitedFrom(InputStream inputStream) {
            return (DataUploadResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DataUploadResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DataUploadResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DataUploadResponse)) {
                return super.equals(obj);
            }
            DataUploadResponse dataUploadResponse = (DataUploadResponse) obj;
            if (hasId() != dataUploadResponse.hasId()) {
                return false;
            }
            if ((!hasId() || getId() == dataUploadResponse.getId()) && hasStatus() == dataUploadResponse.hasStatus()) {
                return (!hasStatus() || this.status_ == dataUploadResponse.status_) && getUnknownFields().equals(dataUploadResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataUploadResponseOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DataUploadResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.id_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(2, this.status_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataUploadResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataUploadResponseOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.DataUploadResponseOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getId();
            }
            if (hasStatus()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.status_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataUploadResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DataUploadResponse.class, Builder.class);
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
            if (!hasId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasStatus()) {
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
            return new DataUploadResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.id_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.status_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements DataUploadResponseOrBuilder {
            private int bitField0_;
            private int id_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(DataUploadResponse dataUploadResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    dataUploadResponse.id_ = this.id_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    dataUploadResponse.status_ = this.status_;
                    i14 |= 2;
                }
                dataUploadResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataUploadResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataUploadResponse build() {
                DataUploadResponse dataUploadResponseBuildPartial = buildPartial();
                if (dataUploadResponseBuildPartial.isInitialized()) {
                    return dataUploadResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataUploadResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataUploadResponse buildPartial() {
                DataUploadResponse dataUploadResponse = new DataUploadResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(dataUploadResponse);
                }
                onBuilt();
                return dataUploadResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = 0;
                this.status_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearStatus() {
                this.bitField0_ &= -3;
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
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataUploadResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataUploadResponseOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataUploadResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataUploadResponseOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.DataUploadResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_DataUploadResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(DataUploadResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId() && hasStatus();
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
                                    this.id_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (Status.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 2;
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

            public Builder setId(int i14) {
                this.id_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStatus(Status status) {
                status.getClass();
                this.bitField0_ |= 2;
                this.status_ = status.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public DataUploadResponse getDefaultInstanceForType() {
                return DataUploadResponse.getDefaultInstance();
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
                if (message instanceof DataUploadResponse) {
                    return mergeFrom((DataUploadResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DataUploadResponse dataUploadResponse) {
                if (dataUploadResponse == DataUploadResponse.getDefaultInstance()) {
                    return this;
                }
                if (dataUploadResponse.hasId()) {
                    setId(dataUploadResponse.getId());
                }
                if (dataUploadResponse.hasStatus()) {
                    setStatus(dataUploadResponse.getStatus());
                }
                mergeUnknownFields(dataUploadResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DataUploadResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static DataUploadResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataUploadResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataUploadResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DataUploadResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DataUploadResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ DataUploadResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static DataUploadResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private DataUploadResponse() {
            this.id_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static DataUploadResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DataUploadResponse parseFrom(InputStream inputStream) {
            return (DataUploadResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DataUploadResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataUploadResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataUploadResponse parseFrom(CodedInputStream codedInputStream) {
            return (DataUploadResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DataUploadResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataUploadResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN(0),
            SUCCESS(1),
            INVALID_ID(2),
            INVALID_OFFSET(3),
            SIZE_MISMATCH(4),
            ABORT(5);

            public static final int ABORT_VALUE = 5;
            public static final int INVALID_ID_VALUE = 2;
            public static final int INVALID_OFFSET_VALUE = 3;
            public static final int SIZE_MISMATCH_VALUE = 4;
            public static final int SUCCESS_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIDataTransferProto.DataUploadResponse.Status.1
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
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return SUCCESS;
                }
                if (i14 == 2) {
                    return INVALID_ID;
                }
                if (i14 == 3) {
                    return INVALID_OFFSET;
                }
                if (i14 == 4) {
                    return SIZE_MISMATCH;
                }
                if (i14 != 5) {
                    return null;
                }
                return ABORT;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return DataUploadResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class FileAccessItemRequest extends GeneratedMessageV3 implements FileAccessItemRequestOrBuilder {
        public static final int DATA_XFER_ID_FIELD_NUMBER = 1;
        public static final int EXPECTED_LATENCY_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int dataXferId_;
        private int expectedLatency_;
        private byte memoizedIsInitialized;
        private static final FileAccessItemRequest DEFAULT_INSTANCE = new FileAccessItemRequest();

        @Deprecated
        public static final Parser<FileAccessItemRequest> PARSER = new AbstractParser<FileAccessItemRequest>() { // from class: com.garmin.proto.generated.GDIDataTransferProto.FileAccessItemRequest.1
            @Override // com.google.protobuf.Parser
            public FileAccessItemRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = FileAccessItemRequest.newBuilder();
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

        private FileAccessItemRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.dataXferId_ = 0;
            this.expectedLatency_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FileAccessItemRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_FileAccessItemRequest_descriptor;
        }

        public static Builder newBuilder(FileAccessItemRequest fileAccessItemRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(fileAccessItemRequest);
        }

        public static FileAccessItemRequest parseDelimitedFrom(InputStream inputStream) {
            return (FileAccessItemRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FileAccessItemRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<FileAccessItemRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FileAccessItemRequest)) {
                return super.equals(obj);
            }
            FileAccessItemRequest fileAccessItemRequest = (FileAccessItemRequest) obj;
            if (hasDataXferId() != fileAccessItemRequest.hasDataXferId()) {
                return false;
            }
            if ((!hasDataXferId() || getDataXferId() == fileAccessItemRequest.getDataXferId()) && hasExpectedLatency() == fileAccessItemRequest.hasExpectedLatency()) {
                return (!hasExpectedLatency() || this.expectedLatency_ == fileAccessItemRequest.expectedLatency_) && getUnknownFields().equals(fileAccessItemRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.FileAccessItemRequestOrBuilder
        public int getDataXferId() {
            return this.dataXferId_;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.FileAccessItemRequestOrBuilder
        public Latency getExpectedLatency() {
            Latency latencyForNumber = Latency.forNumber(this.expectedLatency_);
            return latencyForNumber == null ? Latency.STANDARD : latencyForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FileAccessItemRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.dataXferId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(2, this.expectedLatency_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.FileAccessItemRequestOrBuilder
        public boolean hasDataXferId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.FileAccessItemRequestOrBuilder
        public boolean hasExpectedLatency() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasDataXferId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getDataXferId();
            }
            if (hasExpectedLatency()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.expectedLatency_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_FileAccessItemRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(FileAccessItemRequest.class, Builder.class);
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
            return new FileAccessItemRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.dataXferId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.expectedLatency_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FileAccessItemRequestOrBuilder {
            private int bitField0_;
            private int dataXferId_;
            private int expectedLatency_;

            private Builder() {
                this.expectedLatency_ = 0;
            }

            private void buildPartial0(FileAccessItemRequest fileAccessItemRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    fileAccessItemRequest.dataXferId_ = this.dataXferId_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    fileAccessItemRequest.expectedLatency_ = this.expectedLatency_;
                    i14 |= 2;
                }
                fileAccessItemRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_FileAccessItemRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FileAccessItemRequest build() {
                FileAccessItemRequest fileAccessItemRequestBuildPartial = buildPartial();
                if (fileAccessItemRequestBuildPartial.isInitialized()) {
                    return fileAccessItemRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) fileAccessItemRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FileAccessItemRequest buildPartial() {
                FileAccessItemRequest fileAccessItemRequest = new FileAccessItemRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(fileAccessItemRequest);
                }
                onBuilt();
                return fileAccessItemRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.dataXferId_ = 0;
                this.expectedLatency_ = 0;
                return this;
            }

            public Builder clearDataXferId() {
                this.bitField0_ &= -2;
                this.dataXferId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearExpectedLatency() {
                this.bitField0_ &= -3;
                this.expectedLatency_ = 0;
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

            @Override // com.garmin.proto.generated.GDIDataTransferProto.FileAccessItemRequestOrBuilder
            public int getDataXferId() {
                return this.dataXferId_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_FileAccessItemRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.FileAccessItemRequestOrBuilder
            public Latency getExpectedLatency() {
                Latency latencyForNumber = Latency.forNumber(this.expectedLatency_);
                return latencyForNumber == null ? Latency.STANDARD : latencyForNumber;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.FileAccessItemRequestOrBuilder
            public boolean hasDataXferId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.FileAccessItemRequestOrBuilder
            public boolean hasExpectedLatency() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_FileAccessItemRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(FileAccessItemRequest.class, Builder.class);
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
                                    this.dataXferId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (Latency.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.expectedLatency_ = i14;
                                        this.bitField0_ |= 2;
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

            public Builder setDataXferId(int i14) {
                this.dataXferId_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setExpectedLatency(Latency latency) {
                latency.getClass();
                this.bitField0_ |= 2;
                this.expectedLatency_ = latency.getNumber();
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
            public FileAccessItemRequest getDefaultInstanceForType() {
                return FileAccessItemRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.expectedLatency_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FileAccessItemRequest) {
                    return mergeFrom((FileAccessItemRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FileAccessItemRequest fileAccessItemRequest) {
                if (fileAccessItemRequest == FileAccessItemRequest.getDefaultInstance()) {
                    return this;
                }
                if (fileAccessItemRequest.hasDataXferId()) {
                    setDataXferId(fileAccessItemRequest.getDataXferId());
                }
                if (fileAccessItemRequest.hasExpectedLatency()) {
                    setExpectedLatency(fileAccessItemRequest.getExpectedLatency());
                }
                mergeUnknownFields(fileAccessItemRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FileAccessItemRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static FileAccessItemRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileAccessItemRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FileAccessItemRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FileAccessItemRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FileAccessItemRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ FileAccessItemRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static FileAccessItemRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private FileAccessItemRequest() {
            this.dataXferId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.expectedLatency_ = 0;
        }

        public static FileAccessItemRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FileAccessItemRequest parseFrom(InputStream inputStream) {
            return (FileAccessItemRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FileAccessItemRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileAccessItemRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FileAccessItemRequest parseFrom(CodedInputStream codedInputStream) {
            return (FileAccessItemRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static FileAccessItemRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileAccessItemRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Latency implements ProtocolMessageEnum {
            STANDARD(0),
            SOON(1),
            IMMEDIATE(2),
            DURING_ACTIVITY(3);

            public static final int DURING_ACTIVITY_VALUE = 3;
            public static final int IMMEDIATE_VALUE = 2;
            public static final int SOON_VALUE = 1;
            public static final int STANDARD_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Latency> internalValueMap = new Internal.EnumLiteMap<Latency>() { // from class: com.garmin.proto.generated.GDIDataTransferProto.FileAccessItemRequest.Latency.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public Latency findValueByNumber(int i14) {
                    return Latency.forNumber(i14);
                }
            };
            private static final Latency[] VALUES = values();

            Latency(int i14) {
                this.value = i14;
            }

            public static Latency forNumber(int i14) {
                if (i14 == 0) {
                    return STANDARD;
                }
                if (i14 == 1) {
                    return SOON;
                }
                if (i14 == 2) {
                    return IMMEDIATE;
                }
                if (i14 != 3) {
                    return null;
                }
                return DURING_ACTIVITY;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return FileAccessItemRequest.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<Latency> internalGetValueMap() {
                return internalValueMap;
            }

            public static Latency valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static Latency valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class FileAccessItemResponse extends GeneratedMessageV3 implements FileAccessItemResponseOrBuilder {
        public static final int DATA_XFER_ID_FIELD_NUMBER = 2;
        public static final int FILE_ACCESS_ITEM_UID_FIELD_NUMBER = 3;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int dataXferId_;
        private GDIDataTypes.UUID fileAccessItemUid_;
        private byte memoizedIsInitialized;
        private int status_;
        private static final FileAccessItemResponse DEFAULT_INSTANCE = new FileAccessItemResponse();

        @Deprecated
        public static final Parser<FileAccessItemResponse> PARSER = new AbstractParser<FileAccessItemResponse>() { // from class: com.garmin.proto.generated.GDIDataTransferProto.FileAccessItemResponse.1
            @Override // com.google.protobuf.Parser
            public FileAccessItemResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = FileAccessItemResponse.newBuilder();
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

        private FileAccessItemResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 0;
            this.dataXferId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FileAccessItemResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_FileAccessItemResponse_descriptor;
        }

        public static Builder newBuilder(FileAccessItemResponse fileAccessItemResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(fileAccessItemResponse);
        }

        public static FileAccessItemResponse parseDelimitedFrom(InputStream inputStream) {
            return (FileAccessItemResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FileAccessItemResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<FileAccessItemResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FileAccessItemResponse)) {
                return super.equals(obj);
            }
            FileAccessItemResponse fileAccessItemResponse = (FileAccessItemResponse) obj;
            if (hasStatus() != fileAccessItemResponse.hasStatus()) {
                return false;
            }
            if ((hasStatus() && this.status_ != fileAccessItemResponse.status_) || hasDataXferId() != fileAccessItemResponse.hasDataXferId()) {
                return false;
            }
            if ((!hasDataXferId() || getDataXferId() == fileAccessItemResponse.getDataXferId()) && hasFileAccessItemUid() == fileAccessItemResponse.hasFileAccessItemUid()) {
                return (!hasFileAccessItemUid() || getFileAccessItemUid().equals(fileAccessItemResponse.getFileAccessItemUid())) && getUnknownFields().equals(fileAccessItemResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.FileAccessItemResponseOrBuilder
        public int getDataXferId() {
            return this.dataXferId_;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.FileAccessItemResponseOrBuilder
        public GDIDataTypes.UUID getFileAccessItemUid() {
            GDIDataTypes.UUID uuid = this.fileAccessItemUid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.FileAccessItemResponseOrBuilder
        public GDIDataTypes.UUIDOrBuilder getFileAccessItemUidOrBuilder() {
            GDIDataTypes.UUID uuid = this.fileAccessItemUid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FileAccessItemResponse> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(2, this.dataXferId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(3, getFileAccessItemUid());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.FileAccessItemResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.FileAccessItemResponseOrBuilder
        public boolean hasDataXferId() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.FileAccessItemResponseOrBuilder
        public boolean hasFileAccessItemUid() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.FileAccessItemResponseOrBuilder
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
            if (hasDataXferId()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getDataXferId();
            }
            if (hasFileAccessItemUid()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getFileAccessItemUid().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_FileAccessItemResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(FileAccessItemResponse.class, Builder.class);
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
            if (!hasFileAccessItemUid() || getFileAccessItemUid().isInitialized()) {
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
            return new FileAccessItemResponse();
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
                codedOutputStream.writeUInt32(2, this.dataXferId_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getFileAccessItemUid());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FileAccessItemResponseOrBuilder {
            private int bitField0_;
            private int dataXferId_;
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> fileAccessItemUidBuilder_;
            private GDIDataTypes.UUID fileAccessItemUid_;
            private int status_;

            private Builder() {
                this.status_ = 0;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(FileAccessItemResponse fileAccessItemResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    fileAccessItemResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    fileAccessItemResponse.dataXferId_ = this.dataXferId_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.fileAccessItemUidBuilder_;
                    fileAccessItemResponse.fileAccessItemUid_ = singleFieldBuilderV3 == null ? this.fileAccessItemUid_ : (GDIDataTypes.UUID) singleFieldBuilderV3.build();
                    i14 |= 4;
                }
                fileAccessItemResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_FileAccessItemResponse_descriptor;
            }

            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> getFileAccessItemUidFieldBuilder() {
                if (this.fileAccessItemUidBuilder_ == null) {
                    this.fileAccessItemUidBuilder_ = new SingleFieldBuilderV3<>(getFileAccessItemUid(), getParentForChildren(), isClean());
                    this.fileAccessItemUid_ = null;
                }
                return this.fileAccessItemUidBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getFileAccessItemUidFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FileAccessItemResponse build() {
                FileAccessItemResponse fileAccessItemResponseBuildPartial = buildPartial();
                if (fileAccessItemResponseBuildPartial.isInitialized()) {
                    return fileAccessItemResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) fileAccessItemResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FileAccessItemResponse buildPartial() {
                FileAccessItemResponse fileAccessItemResponse = new FileAccessItemResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(fileAccessItemResponse);
                }
                onBuilt();
                return fileAccessItemResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 0;
                this.dataXferId_ = 0;
                this.fileAccessItemUid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.fileAccessItemUidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.fileAccessItemUidBuilder_ = null;
                }
                return this;
            }

            public Builder clearDataXferId() {
                this.bitField0_ &= -3;
                this.dataXferId_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearFileAccessItemUid() {
                this.bitField0_ &= -5;
                this.fileAccessItemUid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.fileAccessItemUidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.fileAccessItemUidBuilder_ = null;
                }
                onChanged();
                return this;
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

            @Override // com.garmin.proto.generated.GDIDataTransferProto.FileAccessItemResponseOrBuilder
            public int getDataXferId() {
                return this.dataXferId_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_FileAccessItemResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.FileAccessItemResponseOrBuilder
            public GDIDataTypes.UUID getFileAccessItemUid() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.fileAccessItemUidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUID) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.UUID uuid = this.fileAccessItemUid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            public GDIDataTypes.UUID.Builder getFileAccessItemUidBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (GDIDataTypes.UUID.Builder) getFileAccessItemUidFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.FileAccessItemResponseOrBuilder
            public GDIDataTypes.UUIDOrBuilder getFileAccessItemUidOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.fileAccessItemUidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.fileAccessItemUid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.FileAccessItemResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.FileAccessItemResponseOrBuilder
            public boolean hasDataXferId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.FileAccessItemResponseOrBuilder
            public boolean hasFileAccessItemUid() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.FileAccessItemResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_FileAccessItemResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(FileAccessItemResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasFileAccessItemUid() || getFileAccessItemUid().isInitialized();
            }

            public Builder mergeFileAccessItemUid(GDIDataTypes.UUID uuid) {
                GDIDataTypes.UUID uuid2;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.fileAccessItemUidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uuid);
                } else if ((this.bitField0_ & 4) == 0 || (uuid2 = this.fileAccessItemUid_) == null || uuid2 == GDIDataTypes.UUID.getDefaultInstance()) {
                    this.fileAccessItemUid_ = uuid;
                } else {
                    getFileAccessItemUidBuilder().mergeFrom(uuid);
                }
                if (this.fileAccessItemUid_ != null) {
                    this.bitField0_ |= 4;
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
                                if (tag == 8) {
                                    int i14 = codedInputStream.readEnum();
                                    if (Status.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    this.dataXferId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getFileAccessItemUidFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
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

            public Builder setDataXferId(int i14) {
                this.dataXferId_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setFileAccessItemUid(GDIDataTypes.UUID.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.fileAccessItemUidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.fileAccessItemUid_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
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
            public FileAccessItemResponse getDefaultInstanceForType() {
                return FileAccessItemResponse.getDefaultInstance();
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
                maybeForceBuilderInitialization();
            }

            public Builder setFileAccessItemUid(GDIDataTypes.UUID uuid) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.fileAccessItemUidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uuid.getClass();
                    this.fileAccessItemUid_ = uuid;
                } else {
                    singleFieldBuilderV3.setMessage(uuid);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FileAccessItemResponse) {
                    return mergeFrom((FileAccessItemResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FileAccessItemResponse fileAccessItemResponse) {
                if (fileAccessItemResponse == FileAccessItemResponse.getDefaultInstance()) {
                    return this;
                }
                if (fileAccessItemResponse.hasStatus()) {
                    setStatus(fileAccessItemResponse.getStatus());
                }
                if (fileAccessItemResponse.hasDataXferId()) {
                    setDataXferId(fileAccessItemResponse.getDataXferId());
                }
                if (fileAccessItemResponse.hasFileAccessItemUid()) {
                    mergeFileAccessItemUid(fileAccessItemResponse.getFileAccessItemUid());
                }
                mergeUnknownFields(fileAccessItemResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FileAccessItemResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static FileAccessItemResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileAccessItemResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FileAccessItemResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FileAccessItemResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FileAccessItemResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ FileAccessItemResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static FileAccessItemResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private FileAccessItemResponse() {
            this.dataXferId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static FileAccessItemResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FileAccessItemResponse parseFrom(InputStream inputStream) {
            return (FileAccessItemResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FileAccessItemResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileAccessItemResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FileAccessItemResponse parseFrom(CodedInputStream codedInputStream) {
            return (FileAccessItemResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static FileAccessItemResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileAccessItemResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN(0),
            OK(1),
            INVALID_ID(2);

            public static final int INVALID_ID_VALUE = 2;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIDataTransferProto.FileAccessItemResponse.Status.1
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
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return OK;
                }
                if (i14 != 2) {
                    return null;
                }
                return INVALID_ID;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return FileAccessItemResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class InitiateDataUploadResponse extends GeneratedMessageV3 implements InitiateDataUploadResponseOrBuilder {
        public static final int ID_FIELD_NUMBER = 1;
        public static final int STATUS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int id_;
        private byte memoizedIsInitialized;
        private int status_;
        private static final InitiateDataUploadResponse DEFAULT_INSTANCE = new InitiateDataUploadResponse();

        @Deprecated
        public static final Parser<InitiateDataUploadResponse> PARSER = new AbstractParser<InitiateDataUploadResponse>() { // from class: com.garmin.proto.generated.GDIDataTransferProto.InitiateDataUploadResponse.1
            @Override // com.google.protobuf.Parser
            public InitiateDataUploadResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = InitiateDataUploadResponse.newBuilder();
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

        private InitiateDataUploadResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.id_ = 0;
            this.status_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InitiateDataUploadResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_InitiateDataUploadResponse_descriptor;
        }

        public static Builder newBuilder(InitiateDataUploadResponse initiateDataUploadResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(initiateDataUploadResponse);
        }

        public static InitiateDataUploadResponse parseDelimitedFrom(InputStream inputStream) {
            return (InitiateDataUploadResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static InitiateDataUploadResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<InitiateDataUploadResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof InitiateDataUploadResponse)) {
                return super.equals(obj);
            }
            InitiateDataUploadResponse initiateDataUploadResponse = (InitiateDataUploadResponse) obj;
            if (hasId() != initiateDataUploadResponse.hasId()) {
                return false;
            }
            if ((!hasId() || getId() == initiateDataUploadResponse.getId()) && hasStatus() == initiateDataUploadResponse.hasStatus()) {
                return (!hasStatus() || this.status_ == initiateDataUploadResponse.status_) && getUnknownFields().equals(initiateDataUploadResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.InitiateDataUploadResponseOrBuilder
        public int getId() {
            return this.id_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<InitiateDataUploadResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.id_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(2, this.status_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.InitiateDataUploadResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.InitiateDataUploadResponseOrBuilder
        public boolean hasId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIDataTransferProto.InitiateDataUploadResponseOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getId();
            }
            if (hasStatus()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.status_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_InitiateDataUploadResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(InitiateDataUploadResponse.class, Builder.class);
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
            if (!hasId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasStatus()) {
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
            return new InitiateDataUploadResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.id_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.status_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InitiateDataUploadResponseOrBuilder {
            private int bitField0_;
            private int id_;
            private int status_;

            private Builder() {
                this.status_ = 0;
            }

            private void buildPartial0(InitiateDataUploadResponse initiateDataUploadResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    initiateDataUploadResponse.id_ = this.id_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    initiateDataUploadResponse.status_ = this.status_;
                    i14 |= 2;
                }
                initiateDataUploadResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_InitiateDataUploadResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InitiateDataUploadResponse build() {
                InitiateDataUploadResponse initiateDataUploadResponseBuildPartial = buildPartial();
                if (initiateDataUploadResponseBuildPartial.isInitialized()) {
                    return initiateDataUploadResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) initiateDataUploadResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InitiateDataUploadResponse buildPartial() {
                InitiateDataUploadResponse initiateDataUploadResponse = new InitiateDataUploadResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(initiateDataUploadResponse);
                }
                onBuilt();
                return initiateDataUploadResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.id_ = 0;
                this.status_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearId() {
                this.bitField0_ &= -2;
                this.id_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearStatus() {
                this.bitField0_ &= -3;
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
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_InitiateDataUploadResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.InitiateDataUploadResponseOrBuilder
            public int getId() {
                return this.id_;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.InitiateDataUploadResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.UNKNOWN : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.InitiateDataUploadResponseOrBuilder
            public boolean hasId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIDataTransferProto.InitiateDataUploadResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIDataTransferProto.internal_static_GDI_Proto_DataTransfer_InitiateDataUploadResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(InitiateDataUploadResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasId() && hasStatus();
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
                                    this.id_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (Status.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 2;
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

            public Builder setId(int i14) {
                this.id_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setStatus(Status status) {
                status.getClass();
                this.bitField0_ |= 2;
                this.status_ = status.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public InitiateDataUploadResponse getDefaultInstanceForType() {
                return InitiateDataUploadResponse.getDefaultInstance();
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
                if (message instanceof InitiateDataUploadResponse) {
                    return mergeFrom((InitiateDataUploadResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(InitiateDataUploadResponse initiateDataUploadResponse) {
                if (initiateDataUploadResponse == InitiateDataUploadResponse.getDefaultInstance()) {
                    return this;
                }
                if (initiateDataUploadResponse.hasId()) {
                    setId(initiateDataUploadResponse.getId());
                }
                if (initiateDataUploadResponse.hasStatus()) {
                    setStatus(initiateDataUploadResponse.getStatus());
                }
                mergeUnknownFields(initiateDataUploadResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public InitiateDataUploadResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static InitiateDataUploadResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InitiateDataUploadResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InitiateDataUploadResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static InitiateDataUploadResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static InitiateDataUploadResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ InitiateDataUploadResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static InitiateDataUploadResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private InitiateDataUploadResponse() {
            this.id_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 0;
        }

        public static InitiateDataUploadResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static InitiateDataUploadResponse parseFrom(InputStream inputStream) {
            return (InitiateDataUploadResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static InitiateDataUploadResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InitiateDataUploadResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InitiateDataUploadResponse parseFrom(CodedInputStream codedInputStream) {
            return (InitiateDataUploadResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static InitiateDataUploadResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InitiateDataUploadResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            UNKNOWN(0),
            OK(1),
            INVALID_ID(2);

            public static final int INVALID_ID_VALUE = 2;
            public static final int OK_VALUE = 1;
            public static final int UNKNOWN_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIDataTransferProto.InitiateDataUploadResponse.Status.1
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
                    return UNKNOWN;
                }
                if (i14 == 1) {
                    return OK;
                }
                if (i14 != 2) {
                    return null;
                }
                return INVALID_ID;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return InitiateDataUploadResponse.getDescriptor().getEnumTypes().get(0);
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

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }
}
