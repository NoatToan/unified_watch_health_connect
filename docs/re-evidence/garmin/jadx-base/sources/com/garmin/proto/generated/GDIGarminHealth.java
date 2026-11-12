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

/* JADX INFO: loaded from: classes4.dex */
public final class GDIGarminHealth {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0015GDIGarminHealth.proto\u0012\rGDI.Proto.GHS\u001a\rGDISaMD.proto\u001a\u0012GDIDataTypes.proto\"£\u0006\n\u0007Service\u0012@\n\rtoken_request\u0018\u0001 \u0001(\u000b2).GDI.Proto.GHS.EmbeddedHealthTokenRequest\u0012B\n\u000etoken_response\u0018\u0002 \u0001(\u000b2*.GDI.Proto.GHS.EmbeddedHealthTokenResponse\u0012A\n\u0015update_samdid_request\u0018\u0003 \u0001(\u000b2\".GDI.Proto.GHS.UpdateSaMDIdRequest\u0012C\n\u0016update_samdid_response\u0018\u0004 \u0001(\u000b2#.GDI.Proto.GHS.UpdateSaMDIdResponse\u0012N\n\u001afile_xfer_precheck_request\u0018\u0005 \u0001(\u000b2*.GDI.Proto.GHS.FileTransferPrecheckRequest\u0012P\n\u001bfile_xfer_precheck_response\u0018\u0006 \u0001(\u000b2+.GDI.Proto.GHS.FileTransferPrecheckResponse\u0012=\n\u0011file_xfer_request\u0018\u0007 \u0001(\u000b2\".GDI.Proto.GHS.FileTransferRequest\u0012?\n\u0012file_xfer_response\u0018\b \u0001(\u000b2#.GDI.Proto.GHS.FileTransferResponse\u0012I\n\u0018file_xfer_ready_for_next\u0018\t \u0001(\u000b2'.GDI.Proto.GHS.FileTransferReadyForNext\u0012C\n\u0016invalid_upload_consent\u0018\n \u0001(\u000b2#.GDI.Proto.GHS.InvalidUploadConsent\u0012X\n\u001ffile_xfer_complete_notification\u0018\u000b \u0001(\u000b2/.GDI.Proto.GHS.FileTransferCompleteNotification\"\u001c\n\u001aEmbeddedHealthTokenRequest\"a\n\u001bEmbeddedHealthTokenResponse\u0012\r\n\u0005token\u0018\u0001 \u0001(\t\u00123\n\u0007failure\u0018\u0002 \u0001(\u000e2\".GDI.Proto.SaMD.SaMDCommonFailures\"&\n\u0013UpdateSaMDIdRequest\u0012\u000f\n\u0007samd_id\u0018\u0001 \u0001(\t\"'\n\u0014UpdateSaMDIdResponse\u0012\u000f\n\u0007success\u0018\u0001 \u0002(\b\"\u001d\n\u001bFileTransferPrecheckRequest\"\u0088\u0001\n\u001cFileTransferPrecheckResponse\u00123\n\u0007failure\u0018\u0001 \u0001(\u000e2\".GDI.Proto.SaMD.SaMDCommonFailures\u00123\n+garmin_health_service_file_transfer_support\u0018\u0002 \u0001(\b\"\u0093\u0003\n\u0013FileTransferRequest\u0012\u0011\n\traw_bytes\u0018\u0001 \u0001(\f\u0012\u0011\n\tfile_name\u0018\u0002 \u0001(\t\u0012>\n\tfile_type\u0018\u0003 \u0001(\u000e2+.GDI.Proto.GHS.FileTransferRequest.FileType\u0012D\n\fcontent_type\u0018\u0004 \u0001(\u000e2..GDI.Proto.GHS.FileTransferRequest.ContentType\u0012B\n\tfile_data\u0018\u0005 \u0003(\u000b2+.GDI.Proto.GHS.FileTransferRequest.FileDataB\u0002\u0018\u0001\u00128\n\txfer_data\u0018\u0006 \u0001(\u000b2%.GDI.Proto.DataTypes.DataTransferItem\u001a\u0018\n\bFileData\u0012\f\n\u0004data\u0018\u0001 \u0001(\f\"\u0013\n\bFileType\u0012\u0007\n\u0003ECG\u0010\u0000\"#\n\u000bContentType\u0012\u0007\n\u0003FIT\u0010\u0000\u0012\u000b\n\u0007ZIP_FIT\u0010\u0001\"_\n\u0014FileTransferResponse\u00123\n\u0007failure\u0018\u0001 \u0001(\u000e2\".GDI.Proto.SaMD.SaMDCommonFailures\u0012\u0012\n\nis_pending\u0018\u0002 \u0001(\b\"j\n FileTransferCompleteNotification\u00123\n\u0007failure\u0018\u0001 \u0001(\u000e2\".GDI.Proto.SaMD.SaMDCommonFailures\u0012\u0011\n\tfile_name\u0018\u0002 \u0001(\t\"\u001a\n\u0018FileTransferReadyForNext\"\u0016\n\u0014InvalidUploadConsentB/\n\u001acom.garmin.proto.generatedB\u000fGDIGarminHealthH\u0003"}, new Descriptors.FileDescriptor[]{GDISaMD.getDescriptor(), GDIDataTypes.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GHS_EmbeddedHealthTokenRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GHS_EmbeddedHealthTokenRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GHS_EmbeddedHealthTokenResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GHS_EmbeddedHealthTokenResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GHS_FileTransferCompleteNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GHS_FileTransferCompleteNotification_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GHS_FileTransferPrecheckRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GHS_FileTransferPrecheckRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GHS_FileTransferPrecheckResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GHS_FileTransferPrecheckResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GHS_FileTransferReadyForNext_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GHS_FileTransferReadyForNext_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GHS_FileTransferRequest_FileData_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GHS_FileTransferRequest_FileData_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GHS_FileTransferRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GHS_FileTransferRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GHS_FileTransferResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GHS_FileTransferResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GHS_InvalidUploadConsent_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GHS_InvalidUploadConsent_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GHS_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GHS_Service_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GHS_UpdateSaMDIdRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GHS_UpdateSaMDIdRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GHS_UpdateSaMDIdResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GHS_UpdateSaMDIdResponse_fieldAccessorTable;

    public interface EmbeddedHealthTokenRequestOrBuilder extends MessageOrBuilder {
    }

    public interface EmbeddedHealthTokenResponseOrBuilder extends MessageOrBuilder {
        GDISaMD.SaMDCommonFailures getFailure();

        String getToken();

        ByteString getTokenBytes();

        boolean hasFailure();

        boolean hasToken();
    }

    public interface FileTransferCompleteNotificationOrBuilder extends MessageOrBuilder {
        GDISaMD.SaMDCommonFailures getFailure();

        String getFileName();

        ByteString getFileNameBytes();

        boolean hasFailure();

        boolean hasFileName();
    }

    public interface FileTransferPrecheckRequestOrBuilder extends MessageOrBuilder {
    }

    public interface FileTransferPrecheckResponseOrBuilder extends MessageOrBuilder {
        GDISaMD.SaMDCommonFailures getFailure();

        boolean getGarminHealthServiceFileTransferSupport();

        boolean hasFailure();

        boolean hasGarminHealthServiceFileTransferSupport();
    }

    public interface FileTransferReadyForNextOrBuilder extends MessageOrBuilder {
    }

    public interface FileTransferRequestOrBuilder extends MessageOrBuilder {
        FileTransferRequest.ContentType getContentType();

        @Deprecated
        FileTransferRequest.FileData getFileData(int i14);

        @Deprecated
        int getFileDataCount();

        @Deprecated
        List<FileTransferRequest.FileData> getFileDataList();

        @Deprecated
        FileTransferRequest.FileDataOrBuilder getFileDataOrBuilder(int i14);

        @Deprecated
        List<? extends FileTransferRequest.FileDataOrBuilder> getFileDataOrBuilderList();

        String getFileName();

        ByteString getFileNameBytes();

        FileTransferRequest.FileType getFileType();

        ByteString getRawBytes();

        GDIDataTypes.DataTransferItem getXferData();

        GDIDataTypes.DataTransferItemOrBuilder getXferDataOrBuilder();

        boolean hasContentType();

        boolean hasFileName();

        boolean hasFileType();

        boolean hasRawBytes();

        boolean hasXferData();
    }

    public interface FileTransferResponseOrBuilder extends MessageOrBuilder {
        GDISaMD.SaMDCommonFailures getFailure();

        boolean getIsPending();

        boolean hasFailure();

        boolean hasIsPending();
    }

    public interface InvalidUploadConsentOrBuilder extends MessageOrBuilder {
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        FileTransferCompleteNotification getFileXferCompleteNotification();

        FileTransferCompleteNotificationOrBuilder getFileXferCompleteNotificationOrBuilder();

        FileTransferPrecheckRequest getFileXferPrecheckRequest();

        FileTransferPrecheckRequestOrBuilder getFileXferPrecheckRequestOrBuilder();

        FileTransferPrecheckResponse getFileXferPrecheckResponse();

        FileTransferPrecheckResponseOrBuilder getFileXferPrecheckResponseOrBuilder();

        FileTransferReadyForNext getFileXferReadyForNext();

        FileTransferReadyForNextOrBuilder getFileXferReadyForNextOrBuilder();

        FileTransferRequest getFileXferRequest();

        FileTransferRequestOrBuilder getFileXferRequestOrBuilder();

        FileTransferResponse getFileXferResponse();

        FileTransferResponseOrBuilder getFileXferResponseOrBuilder();

        InvalidUploadConsent getInvalidUploadConsent();

        InvalidUploadConsentOrBuilder getInvalidUploadConsentOrBuilder();

        EmbeddedHealthTokenRequest getTokenRequest();

        EmbeddedHealthTokenRequestOrBuilder getTokenRequestOrBuilder();

        EmbeddedHealthTokenResponse getTokenResponse();

        EmbeddedHealthTokenResponseOrBuilder getTokenResponseOrBuilder();

        UpdateSaMDIdRequest getUpdateSamdidRequest();

        UpdateSaMDIdRequestOrBuilder getUpdateSamdidRequestOrBuilder();

        UpdateSaMDIdResponse getUpdateSamdidResponse();

        UpdateSaMDIdResponseOrBuilder getUpdateSamdidResponseOrBuilder();

        boolean hasFileXferCompleteNotification();

        boolean hasFileXferPrecheckRequest();

        boolean hasFileXferPrecheckResponse();

        boolean hasFileXferReadyForNext();

        boolean hasFileXferRequest();

        boolean hasFileXferResponse();

        boolean hasInvalidUploadConsent();

        boolean hasTokenRequest();

        boolean hasTokenResponse();

        boolean hasUpdateSamdidRequest();

        boolean hasUpdateSamdidResponse();
    }

    public interface UpdateSaMDIdRequestOrBuilder extends MessageOrBuilder {
        String getSamdId();

        ByteString getSamdIdBytes();

        boolean hasSamdId();
    }

    public interface UpdateSaMDIdResponseOrBuilder extends MessageOrBuilder {
        boolean getSuccess();

        boolean hasSuccess();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_GHS_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_GHS_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"TokenRequest", "TokenResponse", "UpdateSamdidRequest", "UpdateSamdidResponse", "FileXferPrecheckRequest", "FileXferPrecheckResponse", "FileXferRequest", "FileXferResponse", "FileXferReadyForNext", "InvalidUploadConsent", "FileXferCompleteNotification"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_GHS_EmbeddedHealthTokenRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_GHS_EmbeddedHealthTokenRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[0]);
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_GHS_EmbeddedHealthTokenResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_GHS_EmbeddedHealthTokenResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Token", "Failure"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_GHS_UpdateSaMDIdRequest_descriptor = descriptor5;
        internal_static_GDI_Proto_GHS_UpdateSaMDIdRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"SamdId"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_GHS_UpdateSaMDIdResponse_descriptor = descriptor6;
        internal_static_GDI_Proto_GHS_UpdateSaMDIdResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Success"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_GHS_FileTransferPrecheckRequest_descriptor = descriptor7;
        internal_static_GDI_Proto_GHS_FileTransferPrecheckRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[0]);
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_GHS_FileTransferPrecheckResponse_descriptor = descriptor8;
        internal_static_GDI_Proto_GHS_FileTransferPrecheckResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Failure", "GarminHealthServiceFileTransferSupport"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_GHS_FileTransferRequest_descriptor = descriptor9;
        internal_static_GDI_Proto_GHS_FileTransferRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"RawBytes", "FileName", "FileType", "ContentType", "FileData", "XferData"});
        Descriptors.Descriptor descriptor10 = descriptor9.getNestedTypes().get(0);
        internal_static_GDI_Proto_GHS_FileTransferRequest_FileData_descriptor = descriptor10;
        internal_static_GDI_Proto_GHS_FileTransferRequest_FileData_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Data"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_GHS_FileTransferResponse_descriptor = descriptor11;
        internal_static_GDI_Proto_GHS_FileTransferResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"Failure", "IsPending"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_GHS_FileTransferCompleteNotification_descriptor = descriptor12;
        internal_static_GDI_Proto_GHS_FileTransferCompleteNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Failure", "FileName"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(10);
        internal_static_GDI_Proto_GHS_FileTransferReadyForNext_descriptor = descriptor13;
        internal_static_GDI_Proto_GHS_FileTransferReadyForNext_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[0]);
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(11);
        internal_static_GDI_Proto_GHS_InvalidUploadConsent_descriptor = descriptor14;
        internal_static_GDI_Proto_GHS_InvalidUploadConsent_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[0]);
        GDISaMD.getDescriptor();
        GDIDataTypes.getDescriptor();
    }

    private GDIGarminHealth() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class EmbeddedHealthTokenRequest extends GeneratedMessageV3 implements EmbeddedHealthTokenRequestOrBuilder {
        private static final EmbeddedHealthTokenRequest DEFAULT_INSTANCE = new EmbeddedHealthTokenRequest();

        @Deprecated
        public static final Parser<EmbeddedHealthTokenRequest> PARSER = new AbstractParser<EmbeddedHealthTokenRequest>() { // from class: com.garmin.proto.generated.GDIGarminHealth.EmbeddedHealthTokenRequest.1
            @Override // com.google.protobuf.Parser
            public EmbeddedHealthTokenRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EmbeddedHealthTokenRequest.newBuilder();
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

        private EmbeddedHealthTokenRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EmbeddedHealthTokenRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminHealth.internal_static_GDI_Proto_GHS_EmbeddedHealthTokenRequest_descriptor;
        }

        public static Builder newBuilder(EmbeddedHealthTokenRequest embeddedHealthTokenRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(embeddedHealthTokenRequest);
        }

        public static EmbeddedHealthTokenRequest parseDelimitedFrom(InputStream inputStream) {
            return (EmbeddedHealthTokenRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EmbeddedHealthTokenRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EmbeddedHealthTokenRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof EmbeddedHealthTokenRequest) {
                return getUnknownFields().equals(((EmbeddedHealthTokenRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EmbeddedHealthTokenRequest> getParserForType() {
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
            return GDIGarminHealth.internal_static_GDI_Proto_GHS_EmbeddedHealthTokenRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(EmbeddedHealthTokenRequest.class, Builder.class);
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
            return new EmbeddedHealthTokenRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EmbeddedHealthTokenRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_EmbeddedHealthTokenRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EmbeddedHealthTokenRequest build() {
                EmbeddedHealthTokenRequest embeddedHealthTokenRequestBuildPartial = buildPartial();
                if (embeddedHealthTokenRequestBuildPartial.isInitialized()) {
                    return embeddedHealthTokenRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) embeddedHealthTokenRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EmbeddedHealthTokenRequest buildPartial() {
                EmbeddedHealthTokenRequest embeddedHealthTokenRequest = new EmbeddedHealthTokenRequest(this);
                onBuilt();
                return embeddedHealthTokenRequest;
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
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_EmbeddedHealthTokenRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_EmbeddedHealthTokenRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(EmbeddedHealthTokenRequest.class, Builder.class);
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
            public EmbeddedHealthTokenRequest getDefaultInstanceForType() {
                return EmbeddedHealthTokenRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EmbeddedHealthTokenRequest) {
                    return mergeFrom((EmbeddedHealthTokenRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EmbeddedHealthTokenRequest embeddedHealthTokenRequest) {
                if (embeddedHealthTokenRequest == EmbeddedHealthTokenRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(embeddedHealthTokenRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EmbeddedHealthTokenRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ EmbeddedHealthTokenRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private EmbeddedHealthTokenRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EmbeddedHealthTokenRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedHealthTokenRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EmbeddedHealthTokenRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EmbeddedHealthTokenRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EmbeddedHealthTokenRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EmbeddedHealthTokenRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EmbeddedHealthTokenRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EmbeddedHealthTokenRequest parseFrom(InputStream inputStream) {
            return (EmbeddedHealthTokenRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static EmbeddedHealthTokenRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedHealthTokenRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EmbeddedHealthTokenRequest parseFrom(CodedInputStream codedInputStream) {
            return (EmbeddedHealthTokenRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EmbeddedHealthTokenRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedHealthTokenRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class FileTransferPrecheckRequest extends GeneratedMessageV3 implements FileTransferPrecheckRequestOrBuilder {
        private static final FileTransferPrecheckRequest DEFAULT_INSTANCE = new FileTransferPrecheckRequest();

        @Deprecated
        public static final Parser<FileTransferPrecheckRequest> PARSER = new AbstractParser<FileTransferPrecheckRequest>() { // from class: com.garmin.proto.generated.GDIGarminHealth.FileTransferPrecheckRequest.1
            @Override // com.google.protobuf.Parser
            public FileTransferPrecheckRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = FileTransferPrecheckRequest.newBuilder();
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

        private FileTransferPrecheckRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FileTransferPrecheckRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferPrecheckRequest_descriptor;
        }

        public static Builder newBuilder(FileTransferPrecheckRequest fileTransferPrecheckRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(fileTransferPrecheckRequest);
        }

        public static FileTransferPrecheckRequest parseDelimitedFrom(InputStream inputStream) {
            return (FileTransferPrecheckRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FileTransferPrecheckRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<FileTransferPrecheckRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof FileTransferPrecheckRequest) {
                return getUnknownFields().equals(((FileTransferPrecheckRequest) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FileTransferPrecheckRequest> getParserForType() {
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
            return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferPrecheckRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(FileTransferPrecheckRequest.class, Builder.class);
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
            return new FileTransferPrecheckRequest();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FileTransferPrecheckRequestOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferPrecheckRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FileTransferPrecheckRequest build() {
                FileTransferPrecheckRequest fileTransferPrecheckRequestBuildPartial = buildPartial();
                if (fileTransferPrecheckRequestBuildPartial.isInitialized()) {
                    return fileTransferPrecheckRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) fileTransferPrecheckRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FileTransferPrecheckRequest buildPartial() {
                FileTransferPrecheckRequest fileTransferPrecheckRequest = new FileTransferPrecheckRequest(this);
                onBuilt();
                return fileTransferPrecheckRequest;
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
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferPrecheckRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferPrecheckRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(FileTransferPrecheckRequest.class, Builder.class);
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
            public FileTransferPrecheckRequest getDefaultInstanceForType() {
                return FileTransferPrecheckRequest.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FileTransferPrecheckRequest) {
                    return mergeFrom((FileTransferPrecheckRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FileTransferPrecheckRequest fileTransferPrecheckRequest) {
                if (fileTransferPrecheckRequest == FileTransferPrecheckRequest.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(fileTransferPrecheckRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FileTransferPrecheckRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ FileTransferPrecheckRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private FileTransferPrecheckRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FileTransferPrecheckRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileTransferPrecheckRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FileTransferPrecheckRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FileTransferPrecheckRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FileTransferPrecheckRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FileTransferPrecheckRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static FileTransferPrecheckRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FileTransferPrecheckRequest parseFrom(InputStream inputStream) {
            return (FileTransferPrecheckRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FileTransferPrecheckRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileTransferPrecheckRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FileTransferPrecheckRequest parseFrom(CodedInputStream codedInputStream) {
            return (FileTransferPrecheckRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static FileTransferPrecheckRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileTransferPrecheckRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class FileTransferReadyForNext extends GeneratedMessageV3 implements FileTransferReadyForNextOrBuilder {
        private static final FileTransferReadyForNext DEFAULT_INSTANCE = new FileTransferReadyForNext();

        @Deprecated
        public static final Parser<FileTransferReadyForNext> PARSER = new AbstractParser<FileTransferReadyForNext>() { // from class: com.garmin.proto.generated.GDIGarminHealth.FileTransferReadyForNext.1
            @Override // com.google.protobuf.Parser
            public FileTransferReadyForNext parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = FileTransferReadyForNext.newBuilder();
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

        private FileTransferReadyForNext(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FileTransferReadyForNext getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferReadyForNext_descriptor;
        }

        public static Builder newBuilder(FileTransferReadyForNext fileTransferReadyForNext) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(fileTransferReadyForNext);
        }

        public static FileTransferReadyForNext parseDelimitedFrom(InputStream inputStream) {
            return (FileTransferReadyForNext) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FileTransferReadyForNext parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<FileTransferReadyForNext> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof FileTransferReadyForNext) {
                return getUnknownFields().equals(((FileTransferReadyForNext) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FileTransferReadyForNext> getParserForType() {
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
            return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferReadyForNext_fieldAccessorTable.ensureFieldAccessorsInitialized(FileTransferReadyForNext.class, Builder.class);
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
            return new FileTransferReadyForNext();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FileTransferReadyForNextOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferReadyForNext_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FileTransferReadyForNext build() {
                FileTransferReadyForNext fileTransferReadyForNextBuildPartial = buildPartial();
                if (fileTransferReadyForNextBuildPartial.isInitialized()) {
                    return fileTransferReadyForNextBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) fileTransferReadyForNextBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FileTransferReadyForNext buildPartial() {
                FileTransferReadyForNext fileTransferReadyForNext = new FileTransferReadyForNext(this);
                onBuilt();
                return fileTransferReadyForNext;
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
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferReadyForNext_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferReadyForNext_fieldAccessorTable.ensureFieldAccessorsInitialized(FileTransferReadyForNext.class, Builder.class);
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
            public FileTransferReadyForNext getDefaultInstanceForType() {
                return FileTransferReadyForNext.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FileTransferReadyForNext) {
                    return mergeFrom((FileTransferReadyForNext) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FileTransferReadyForNext fileTransferReadyForNext) {
                if (fileTransferReadyForNext == FileTransferReadyForNext.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(fileTransferReadyForNext.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FileTransferReadyForNext getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ FileTransferReadyForNext(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private FileTransferReadyForNext() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FileTransferReadyForNext parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileTransferReadyForNext) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FileTransferReadyForNext parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FileTransferReadyForNext parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FileTransferReadyForNext parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FileTransferReadyForNext parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static FileTransferReadyForNext parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FileTransferReadyForNext parseFrom(InputStream inputStream) {
            return (FileTransferReadyForNext) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FileTransferReadyForNext parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileTransferReadyForNext) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FileTransferReadyForNext parseFrom(CodedInputStream codedInputStream) {
            return (FileTransferReadyForNext) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static FileTransferReadyForNext parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileTransferReadyForNext) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class InvalidUploadConsent extends GeneratedMessageV3 implements InvalidUploadConsentOrBuilder {
        private static final InvalidUploadConsent DEFAULT_INSTANCE = new InvalidUploadConsent();

        @Deprecated
        public static final Parser<InvalidUploadConsent> PARSER = new AbstractParser<InvalidUploadConsent>() { // from class: com.garmin.proto.generated.GDIGarminHealth.InvalidUploadConsent.1
            @Override // com.google.protobuf.Parser
            public InvalidUploadConsent parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = InvalidUploadConsent.newBuilder();
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

        private InvalidUploadConsent(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InvalidUploadConsent getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminHealth.internal_static_GDI_Proto_GHS_InvalidUploadConsent_descriptor;
        }

        public static Builder newBuilder(InvalidUploadConsent invalidUploadConsent) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(invalidUploadConsent);
        }

        public static InvalidUploadConsent parseDelimitedFrom(InputStream inputStream) {
            return (InvalidUploadConsent) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static InvalidUploadConsent parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<InvalidUploadConsent> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof InvalidUploadConsent) {
                return getUnknownFields().equals(((InvalidUploadConsent) obj).getUnknownFields());
            }
            return super.equals(obj);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<InvalidUploadConsent> getParserForType() {
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
            return GDIGarminHealth.internal_static_GDI_Proto_GHS_InvalidUploadConsent_fieldAccessorTable.ensureFieldAccessorsInitialized(InvalidUploadConsent.class, Builder.class);
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
            return new InvalidUploadConsent();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements InvalidUploadConsentOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_InvalidUploadConsent_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InvalidUploadConsent build() {
                InvalidUploadConsent invalidUploadConsentBuildPartial = buildPartial();
                if (invalidUploadConsentBuildPartial.isInitialized()) {
                    return invalidUploadConsentBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) invalidUploadConsentBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public InvalidUploadConsent buildPartial() {
                InvalidUploadConsent invalidUploadConsent = new InvalidUploadConsent(this);
                onBuilt();
                return invalidUploadConsent;
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
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_InvalidUploadConsent_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_InvalidUploadConsent_fieldAccessorTable.ensureFieldAccessorsInitialized(InvalidUploadConsent.class, Builder.class);
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
            public InvalidUploadConsent getDefaultInstanceForType() {
                return InvalidUploadConsent.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof InvalidUploadConsent) {
                    return mergeFrom((InvalidUploadConsent) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(InvalidUploadConsent invalidUploadConsent) {
                if (invalidUploadConsent == InvalidUploadConsent.getDefaultInstance()) {
                    return this;
                }
                mergeUnknownFields(invalidUploadConsent.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public InvalidUploadConsent getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ InvalidUploadConsent(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private InvalidUploadConsent() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static InvalidUploadConsent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InvalidUploadConsent) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InvalidUploadConsent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static InvalidUploadConsent parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static InvalidUploadConsent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static InvalidUploadConsent parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static InvalidUploadConsent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static InvalidUploadConsent parseFrom(InputStream inputStream) {
            return (InvalidUploadConsent) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static InvalidUploadConsent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InvalidUploadConsent) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static InvalidUploadConsent parseFrom(CodedInputStream codedInputStream) {
            return (InvalidUploadConsent) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static InvalidUploadConsent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (InvalidUploadConsent) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class UpdateSaMDIdResponse extends GeneratedMessageV3 implements UpdateSaMDIdResponseOrBuilder {
        private static final UpdateSaMDIdResponse DEFAULT_INSTANCE = new UpdateSaMDIdResponse();

        @Deprecated
        public static final Parser<UpdateSaMDIdResponse> PARSER = new AbstractParser<UpdateSaMDIdResponse>() { // from class: com.garmin.proto.generated.GDIGarminHealth.UpdateSaMDIdResponse.1
            @Override // com.google.protobuf.Parser
            public UpdateSaMDIdResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UpdateSaMDIdResponse.newBuilder();
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
        public static final int SUCCESS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private boolean success_;

        private UpdateSaMDIdResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.success_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UpdateSaMDIdResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminHealth.internal_static_GDI_Proto_GHS_UpdateSaMDIdResponse_descriptor;
        }

        public static Builder newBuilder(UpdateSaMDIdResponse updateSaMDIdResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(updateSaMDIdResponse);
        }

        public static UpdateSaMDIdResponse parseDelimitedFrom(InputStream inputStream) {
            return (UpdateSaMDIdResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UpdateSaMDIdResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UpdateSaMDIdResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateSaMDIdResponse)) {
                return super.equals(obj);
            }
            UpdateSaMDIdResponse updateSaMDIdResponse = (UpdateSaMDIdResponse) obj;
            if (hasSuccess() != updateSaMDIdResponse.hasSuccess()) {
                return false;
            }
            return (!hasSuccess() || getSuccess() == updateSaMDIdResponse.getSuccess()) && getUnknownFields().equals(updateSaMDIdResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UpdateSaMDIdResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBoolSize(1, this.success_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.UpdateSaMDIdResponseOrBuilder
        public boolean getSuccess() {
            return this.success_;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.UpdateSaMDIdResponseOrBuilder
        public boolean hasSuccess() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSuccess()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + Internal.hashBoolean(getSuccess());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminHealth.internal_static_GDI_Proto_GHS_UpdateSaMDIdResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateSaMDIdResponse.class, Builder.class);
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
            if (hasSuccess()) {
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
            return new UpdateSaMDIdResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBool(1, this.success_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UpdateSaMDIdResponseOrBuilder {
            private int bitField0_;
            private boolean success_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(UpdateSaMDIdResponse updateSaMDIdResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    updateSaMDIdResponse.success_ = this.success_;
                } else {
                    i14 = 0;
                }
                updateSaMDIdResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_UpdateSaMDIdResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateSaMDIdResponse build() {
                UpdateSaMDIdResponse updateSaMDIdResponseBuildPartial = buildPartial();
                if (updateSaMDIdResponseBuildPartial.isInitialized()) {
                    return updateSaMDIdResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) updateSaMDIdResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateSaMDIdResponse buildPartial() {
                UpdateSaMDIdResponse updateSaMDIdResponse = new UpdateSaMDIdResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(updateSaMDIdResponse);
                }
                onBuilt();
                return updateSaMDIdResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.success_ = false;
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

            public Builder clearSuccess() {
                this.bitField0_ &= -2;
                this.success_ = false;
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
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_UpdateSaMDIdResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.UpdateSaMDIdResponseOrBuilder
            public boolean getSuccess() {
                return this.success_;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.UpdateSaMDIdResponseOrBuilder
            public boolean hasSuccess() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_UpdateSaMDIdResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateSaMDIdResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasSuccess();
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
                                    this.success_ = codedInputStream.readBool();
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

            public Builder setSuccess(boolean z14) {
                this.success_ = z14;
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
            public UpdateSaMDIdResponse getDefaultInstanceForType() {
                return UpdateSaMDIdResponse.getDefaultInstance();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UpdateSaMDIdResponse) {
                    return mergeFrom((UpdateSaMDIdResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UpdateSaMDIdResponse updateSaMDIdResponse) {
                if (updateSaMDIdResponse == UpdateSaMDIdResponse.getDefaultInstance()) {
                    return this;
                }
                if (updateSaMDIdResponse.hasSuccess()) {
                    setSuccess(updateSaMDIdResponse.getSuccess());
                }
                mergeUnknownFields(updateSaMDIdResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UpdateSaMDIdResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UpdateSaMDIdResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateSaMDIdResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateSaMDIdResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ UpdateSaMDIdResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static UpdateSaMDIdResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private UpdateSaMDIdResponse() {
            this.success_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UpdateSaMDIdResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UpdateSaMDIdResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static UpdateSaMDIdResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UpdateSaMDIdResponse parseFrom(InputStream inputStream) {
            return (UpdateSaMDIdResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static UpdateSaMDIdResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateSaMDIdResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateSaMDIdResponse parseFrom(CodedInputStream codedInputStream) {
            return (UpdateSaMDIdResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UpdateSaMDIdResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateSaMDIdResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class FileTransferRequest extends GeneratedMessageV3 implements FileTransferRequestOrBuilder {
        public static final int CONTENT_TYPE_FIELD_NUMBER = 4;
        public static final int FILE_DATA_FIELD_NUMBER = 5;
        public static final int FILE_NAME_FIELD_NUMBER = 2;
        public static final int FILE_TYPE_FIELD_NUMBER = 3;
        public static final int RAW_BYTES_FIELD_NUMBER = 1;
        public static final int XFER_DATA_FIELD_NUMBER = 6;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int contentType_;
        private List<FileData> fileData_;
        private volatile Object fileName_;
        private int fileType_;
        private byte memoizedIsInitialized;
        private ByteString rawBytes_;
        private GDIDataTypes.DataTransferItem xferData_;
        private static final FileTransferRequest DEFAULT_INSTANCE = new FileTransferRequest();

        @Deprecated
        public static final Parser<FileTransferRequest> PARSER = new AbstractParser<FileTransferRequest>() { // from class: com.garmin.proto.generated.GDIGarminHealth.FileTransferRequest.1
            @Override // com.google.protobuf.Parser
            public FileTransferRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = FileTransferRequest.newBuilder();
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

        public interface FileDataOrBuilder extends MessageOrBuilder {
            ByteString getData();

            boolean hasData();
        }

        private FileTransferRequest() {
            ByteString byteString = ByteString.EMPTY;
            this.rawBytes_ = byteString;
            this.fileName_ = "";
            this.fileType_ = 0;
            this.contentType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.rawBytes_ = byteString;
            this.fileName_ = "";
            this.fileType_ = 0;
            this.contentType_ = 0;
            this.fileData_ = Collections.EMPTY_LIST;
        }

        public static FileTransferRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferRequest_descriptor;
        }

        public static Builder newBuilder(FileTransferRequest fileTransferRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(fileTransferRequest);
        }

        public static FileTransferRequest parseDelimitedFrom(InputStream inputStream) {
            return (FileTransferRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FileTransferRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<FileTransferRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FileTransferRequest)) {
                return super.equals(obj);
            }
            FileTransferRequest fileTransferRequest = (FileTransferRequest) obj;
            if (hasRawBytes() != fileTransferRequest.hasRawBytes()) {
                return false;
            }
            if ((hasRawBytes() && !getRawBytes().equals(fileTransferRequest.getRawBytes())) || hasFileName() != fileTransferRequest.hasFileName()) {
                return false;
            }
            if ((hasFileName() && !getFileName().equals(fileTransferRequest.getFileName())) || hasFileType() != fileTransferRequest.hasFileType()) {
                return false;
            }
            if ((hasFileType() && this.fileType_ != fileTransferRequest.fileType_) || hasContentType() != fileTransferRequest.hasContentType()) {
                return false;
            }
            if ((!hasContentType() || this.contentType_ == fileTransferRequest.contentType_) && getFileDataList().equals(fileTransferRequest.getFileDataList()) && hasXferData() == fileTransferRequest.hasXferData()) {
                return (!hasXferData() || getXferData().equals(fileTransferRequest.getXferData())) && getUnknownFields().equals(fileTransferRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
        public ContentType getContentType() {
            ContentType contentTypeForNumber = ContentType.forNumber(this.contentType_);
            return contentTypeForNumber == null ? ContentType.FIT : contentTypeForNumber;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
        @Deprecated
        public FileData getFileData(int i14) {
            return this.fileData_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
        @Deprecated
        public int getFileDataCount() {
            return this.fileData_.size();
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
        @Deprecated
        public List<FileData> getFileDataList() {
            return this.fileData_;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
        @Deprecated
        public FileDataOrBuilder getFileDataOrBuilder(int i14) {
            return this.fileData_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
        @Deprecated
        public List<? extends FileDataOrBuilder> getFileDataOrBuilderList() {
            return this.fileData_;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
        public String getFileName() {
            Object obj = this.fileName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.fileName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
        public ByteString getFileNameBytes() {
            Object obj = this.fileName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fileName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
        public FileType getFileType() {
            FileType fileTypeForNumber = FileType.forNumber(this.fileType_);
            return fileTypeForNumber == null ? FileType.ECG : fileTypeForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FileTransferRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
        public ByteString getRawBytes() {
            return this.rawBytes_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeBytesSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeBytesSize(1, this.rawBytes_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeBytesSize += GeneratedMessageV3.computeStringSize(2, this.fileName_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeBytesSize += CodedOutputStream.computeEnumSize(3, this.fileType_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeBytesSize += CodedOutputStream.computeEnumSize(4, this.contentType_);
            }
            for (int i15 = 0; i15 < this.fileData_.size(); i15++) {
                iComputeBytesSize += CodedOutputStream.computeMessageSize(5, this.fileData_.get(i15));
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeBytesSize += CodedOutputStream.computeMessageSize(6, getXferData());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeBytesSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
        public GDIDataTypes.DataTransferItem getXferData() {
            GDIDataTypes.DataTransferItem dataTransferItem = this.xferData_;
            return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
        public GDIDataTypes.DataTransferItemOrBuilder getXferDataOrBuilder() {
            GDIDataTypes.DataTransferItem dataTransferItem = this.xferData_;
            return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
        public boolean hasContentType() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
        public boolean hasFileName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
        public boolean hasFileType() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
        public boolean hasRawBytes() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
        public boolean hasXferData() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasRawBytes()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getRawBytes().hashCode();
            }
            if (hasFileName()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getFileName().hashCode();
            }
            if (hasFileType()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + this.fileType_;
            }
            if (hasContentType()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + this.contentType_;
            }
            if (getFileDataCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getFileDataList().hashCode();
            }
            if (hasXferData()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getXferData().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(FileTransferRequest.class, Builder.class);
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
            if (!hasXferData() || getXferData().isInitialized()) {
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
            return new FileTransferRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeBytes(1, this.rawBytes_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.fileName_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeEnum(3, this.fileType_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeEnum(4, this.contentType_);
            }
            for (int i14 = 0; i14 < this.fileData_.size(); i14++) {
                codedOutputStream.writeMessage(5, this.fileData_.get(i14));
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(6, getXferData());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class FileData extends GeneratedMessageV3 implements FileDataOrBuilder {
            public static final int DATA_FIELD_NUMBER = 1;
            private static final FileData DEFAULT_INSTANCE = new FileData();

            @Deprecated
            public static final Parser<FileData> PARSER = new AbstractParser<FileData>() { // from class: com.garmin.proto.generated.GDIGarminHealth.FileTransferRequest.FileData.1
                @Override // com.google.protobuf.Parser
                public FileData parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                    Builder builderNewBuilder = FileData.newBuilder();
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

            private FileData(GeneratedMessageV3.Builder<?> builder) {
                super(builder);
                this.data_ = ByteString.EMPTY;
                this.memoizedIsInitialized = (byte) -1;
            }

            public static FileData getDefaultInstance() {
                return DEFAULT_INSTANCE;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferRequest_FileData_descriptor;
            }

            public static Builder newBuilder(FileData fileData) {
                return DEFAULT_INSTANCE.toBuilder().mergeFrom(fileData);
            }

            public static FileData parseDelimitedFrom(InputStream inputStream) {
                return (FileData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
            }

            public static FileData parseFrom(ByteBuffer byteBuffer) {
                return PARSER.parseFrom(byteBuffer);
            }

            public static Parser<FileData> parser() {
                return PARSER;
            }

            @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
            public boolean equals(Object obj) {
                if (obj == this) {
                    return true;
                }
                if (!(obj instanceof FileData)) {
                    return super.equals(obj);
                }
                FileData fileData = (FileData) obj;
                if (hasData() != fileData.hasData()) {
                    return false;
                }
                return (!hasData() || getData().equals(fileData.getData())) && getUnknownFields().equals(fileData.getUnknownFields());
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequest.FileDataOrBuilder
            public ByteString getData() {
                return this.data_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Parser<FileData> getParserForType() {
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

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequest.FileDataOrBuilder
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
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferRequest_FileData_fieldAccessorTable.ensureFieldAccessorsInitialized(FileData.class, Builder.class);
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
                return new FileData();
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

            public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FileDataOrBuilder {
                private int bitField0_;
                private ByteString data_;

                private Builder() {
                    this.data_ = ByteString.EMPTY;
                }

                private void buildPartial0(FileData fileData) {
                    int i14 = 1;
                    if ((this.bitField0_ & 1) != 0) {
                        fileData.data_ = this.data_;
                    } else {
                        i14 = 0;
                    }
                    fileData.bitField0_ |= i14;
                }

                public static final Descriptors.Descriptor getDescriptor() {
                    return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferRequest_FileData_descriptor;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
                public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                    return (Builder) super.addRepeatedField(fieldDescriptor, obj);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public FileData build() {
                    FileData fileDataBuildPartial = buildPartial();
                    if (fileDataBuildPartial.isInitialized()) {
                        return fileDataBuildPartial;
                    }
                    throw AbstractMessage.Builder.newUninitializedMessageException((Message) fileDataBuildPartial);
                }

                @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
                public FileData buildPartial() {
                    FileData fileData = new FileData(this);
                    if (this.bitField0_ != 0) {
                        buildPartial0(fileData);
                    }
                    onBuilt();
                    return fileData;
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
                    this.data_ = FileData.getDefaultInstance().getData();
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

                @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequest.FileDataOrBuilder
                public ByteString getData() {
                    return this.data_;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
                public Descriptors.Descriptor getDescriptorForType() {
                    return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferRequest_FileData_descriptor;
                }

                @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequest.FileDataOrBuilder
                public boolean hasData() {
                    return (this.bitField0_ & 1) != 0;
                }

                @Override // com.google.protobuf.GeneratedMessageV3.Builder
                public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                    return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferRequest_FileData_fieldAccessorTable.ensureFieldAccessorsInitialized(FileData.class, Builder.class);
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
                public FileData getDefaultInstanceForType() {
                    return FileData.getDefaultInstance();
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
                    if (message instanceof FileData) {
                        return mergeFrom((FileData) message);
                    }
                    super.mergeFrom(message);
                    return this;
                }

                public Builder mergeFrom(FileData fileData) {
                    if (fileData == FileData.getDefaultInstance()) {
                        return this;
                    }
                    if (fileData.hasData()) {
                        setData(fileData.getData());
                    }
                    mergeUnknownFields(fileData.getUnknownFields());
                    onChanged();
                    return this;
                }
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public FileData getDefaultInstanceForType() {
                return DEFAULT_INSTANCE;
            }

            public static FileData parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (FileData) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static FileData parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
            }

            @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
            public Builder newBuilderForType() {
                return newBuilder();
            }

            public static FileData parseFrom(ByteString byteString) {
                return PARSER.parseFrom(byteString);
            }

            public /* synthetic */ FileData(Builder builder) {
                this((GeneratedMessageV3.Builder<?>) builder);
            }

            public static Builder newBuilder() {
                return DEFAULT_INSTANCE.toBuilder();
            }

            public static FileData parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(byteString, extensionRegistryLite);
            }

            private FileData() {
                ByteString byteString = ByteString.EMPTY;
                this.memoizedIsInitialized = (byte) -1;
                this.data_ = byteString;
            }

            public static FileData parseFrom(byte[] bArr) {
                return PARSER.parseFrom(bArr);
            }

            public static FileData parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
                return PARSER.parseFrom(bArr, extensionRegistryLite);
            }

            public static FileData parseFrom(InputStream inputStream) {
                return (FileData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
            }

            public static FileData parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (FileData) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
            }

            public static FileData parseFrom(CodedInputStream codedInputStream) {
                return (FileData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
            }

            public static FileData parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
                return (FileData) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
            }
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FileTransferRequestOrBuilder {
            private int bitField0_;
            private int contentType_;
            private RepeatedFieldBuilderV3<FileData, FileData.Builder, FileDataOrBuilder> fileDataBuilder_;
            private List<FileData> fileData_;
            private Object fileName_;
            private int fileType_;
            private ByteString rawBytes_;
            private SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> xferDataBuilder_;
            private GDIDataTypes.DataTransferItem xferData_;

            private Builder() {
                this.rawBytes_ = ByteString.EMPTY;
                this.fileName_ = "";
                this.fileType_ = 0;
                this.contentType_ = 0;
                this.fileData_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(FileTransferRequest fileTransferRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    fileTransferRequest.rawBytes_ = this.rawBytes_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    fileTransferRequest.fileName_ = this.fileName_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    fileTransferRequest.fileType_ = this.fileType_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    fileTransferRequest.contentType_ = this.contentType_;
                    i14 |= 8;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                    fileTransferRequest.xferData_ = singleFieldBuilderV3 == null ? this.xferData_ : (GDIDataTypes.DataTransferItem) singleFieldBuilderV3.build();
                    i14 |= 16;
                }
                fileTransferRequest.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(FileTransferRequest fileTransferRequest) {
                RepeatedFieldBuilderV3<FileData, FileData.Builder, FileDataOrBuilder> repeatedFieldBuilderV3 = this.fileDataBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    fileTransferRequest.fileData_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 16) != 0) {
                    this.fileData_ = Collections.unmodifiableList(this.fileData_);
                    this.bitField0_ &= -17;
                }
                fileTransferRequest.fileData_ = this.fileData_;
            }

            private void ensureFileDataIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.fileData_ = new ArrayList(this.fileData_);
                    this.bitField0_ |= 16;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferRequest_descriptor;
            }

            private RepeatedFieldBuilderV3<FileData, FileData.Builder, FileDataOrBuilder> getFileDataFieldBuilder() {
                if (this.fileDataBuilder_ == null) {
                    this.fileDataBuilder_ = new RepeatedFieldBuilderV3<>(this.fileData_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                    this.fileData_ = null;
                }
                return this.fileDataBuilder_;
            }

            private SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> getXferDataFieldBuilder() {
                if (this.xferDataBuilder_ == null) {
                    this.xferDataBuilder_ = new SingleFieldBuilderV3<>(getXferData(), getParentForChildren(), isClean());
                    this.xferData_ = null;
                }
                return this.xferDataBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getFileDataFieldBuilder();
                    getXferDataFieldBuilder();
                }
            }

            @Deprecated
            public Builder addAllFileData(Iterable<? extends FileData> iterable) {
                RepeatedFieldBuilderV3<FileData, FileData.Builder, FileDataOrBuilder> repeatedFieldBuilderV3 = this.fileDataBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureFileDataIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.fileData_);
                onChanged();
                return this;
            }

            @Deprecated
            public Builder addFileData(FileData.Builder builder) {
                RepeatedFieldBuilderV3<FileData, FileData.Builder, FileDataOrBuilder> repeatedFieldBuilderV3 = this.fileDataBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureFileDataIsMutable();
                this.fileData_.add(builder.build());
                onChanged();
                return this;
            }

            @Deprecated
            public FileData.Builder addFileDataBuilder() {
                return (FileData.Builder) getFileDataFieldBuilder().addBuilder(FileData.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FileTransferRequest build() {
                FileTransferRequest fileTransferRequestBuildPartial = buildPartial();
                if (fileTransferRequestBuildPartial.isInitialized()) {
                    return fileTransferRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) fileTransferRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FileTransferRequest buildPartial() {
                FileTransferRequest fileTransferRequest = new FileTransferRequest(this);
                buildPartialRepeatedFields(fileTransferRequest);
                if (this.bitField0_ != 0) {
                    buildPartial0(fileTransferRequest);
                }
                onBuilt();
                return fileTransferRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.rawBytes_ = ByteString.EMPTY;
                this.fileName_ = "";
                this.fileType_ = 0;
                this.contentType_ = 0;
                RepeatedFieldBuilderV3<FileData, FileData.Builder, FileDataOrBuilder> repeatedFieldBuilderV3 = this.fileDataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.fileData_ = Collections.EMPTY_LIST;
                } else {
                    this.fileData_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -17;
                this.xferData_ = null;
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.xferDataBuilder_ = null;
                }
                return this;
            }

            public Builder clearContentType() {
                this.bitField0_ &= -9;
                this.contentType_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Deprecated
            public Builder clearFileData() {
                RepeatedFieldBuilderV3<FileData, FileData.Builder, FileDataOrBuilder> repeatedFieldBuilderV3 = this.fileDataBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.fileData_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearFileName() {
                this.fileName_ = FileTransferRequest.getDefaultInstance().getFileName();
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            public Builder clearFileType() {
                this.bitField0_ &= -5;
                this.fileType_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearRawBytes() {
                this.bitField0_ &= -2;
                this.rawBytes_ = FileTransferRequest.getDefaultInstance().getRawBytes();
                onChanged();
                return this;
            }

            public Builder clearXferData() {
                this.bitField0_ &= -33;
                this.xferData_ = null;
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.xferDataBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
            public ContentType getContentType() {
                ContentType contentTypeForNumber = ContentType.forNumber(this.contentType_);
                return contentTypeForNumber == null ? ContentType.FIT : contentTypeForNumber;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
            @Deprecated
            public FileData getFileData(int i14) {
                RepeatedFieldBuilderV3<FileData, FileData.Builder, FileDataOrBuilder> repeatedFieldBuilderV3 = this.fileDataBuilder_;
                return repeatedFieldBuilderV3 == null ? this.fileData_.get(i14) : (FileData) repeatedFieldBuilderV3.getMessage(i14);
            }

            @Deprecated
            public FileData.Builder getFileDataBuilder(int i14) {
                return (FileData.Builder) getFileDataFieldBuilder().getBuilder(i14);
            }

            @Deprecated
            public List<FileData.Builder> getFileDataBuilderList() {
                return getFileDataFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
            @Deprecated
            public int getFileDataCount() {
                RepeatedFieldBuilderV3<FileData, FileData.Builder, FileDataOrBuilder> repeatedFieldBuilderV3 = this.fileDataBuilder_;
                return repeatedFieldBuilderV3 == null ? this.fileData_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
            @Deprecated
            public List<FileData> getFileDataList() {
                RepeatedFieldBuilderV3<FileData, FileData.Builder, FileDataOrBuilder> repeatedFieldBuilderV3 = this.fileDataBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.fileData_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
            @Deprecated
            public FileDataOrBuilder getFileDataOrBuilder(int i14) {
                RepeatedFieldBuilderV3<FileData, FileData.Builder, FileDataOrBuilder> repeatedFieldBuilderV3 = this.fileDataBuilder_;
                return repeatedFieldBuilderV3 == null ? this.fileData_.get(i14) : (FileDataOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
            @Deprecated
            public List<? extends FileDataOrBuilder> getFileDataOrBuilderList() {
                RepeatedFieldBuilderV3<FileData, FileData.Builder, FileDataOrBuilder> repeatedFieldBuilderV3 = this.fileDataBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.fileData_);
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
            public String getFileName() {
                Object obj = this.fileName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.fileName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
            public ByteString getFileNameBytes() {
                Object obj = this.fileName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.fileName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
            public FileType getFileType() {
                FileType fileTypeForNumber = FileType.forNumber(this.fileType_);
                return fileTypeForNumber == null ? FileType.ECG : fileTypeForNumber;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
            public ByteString getRawBytes() {
                return this.rawBytes_;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
            public GDIDataTypes.DataTransferItem getXferData() {
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.DataTransferItem) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.DataTransferItem dataTransferItem = this.xferData_;
                return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
            }

            public GDIDataTypes.DataTransferItem.Builder getXferDataBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (GDIDataTypes.DataTransferItem.Builder) getXferDataFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
            public GDIDataTypes.DataTransferItemOrBuilder getXferDataOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.DataTransferItemOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.DataTransferItem dataTransferItem = this.xferData_;
                return dataTransferItem == null ? GDIDataTypes.DataTransferItem.getDefaultInstance() : dataTransferItem;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
            public boolean hasContentType() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
            public boolean hasFileName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
            public boolean hasFileType() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
            public boolean hasRawBytes() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferRequestOrBuilder
            public boolean hasXferData() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(FileTransferRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasXferData() || getXferData().isInitialized();
            }

            public Builder mergeFrom(FileTransferRequest fileTransferRequest) {
                if (fileTransferRequest == FileTransferRequest.getDefaultInstance()) {
                    return this;
                }
                if (fileTransferRequest.hasRawBytes()) {
                    setRawBytes(fileTransferRequest.getRawBytes());
                }
                if (fileTransferRequest.hasFileName()) {
                    this.fileName_ = fileTransferRequest.fileName_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                if (fileTransferRequest.hasFileType()) {
                    setFileType(fileTransferRequest.getFileType());
                }
                if (fileTransferRequest.hasContentType()) {
                    setContentType(fileTransferRequest.getContentType());
                }
                if (this.fileDataBuilder_ == null) {
                    if (!fileTransferRequest.fileData_.isEmpty()) {
                        if (this.fileData_.isEmpty()) {
                            this.fileData_ = fileTransferRequest.fileData_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureFileDataIsMutable();
                            this.fileData_.addAll(fileTransferRequest.fileData_);
                        }
                        onChanged();
                    }
                } else if (!fileTransferRequest.fileData_.isEmpty()) {
                    boolean zIsEmpty = this.fileDataBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<FileData, FileData.Builder, FileDataOrBuilder> repeatedFieldBuilderV3 = this.fileDataBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.fileDataBuilder_ = null;
                        this.fileData_ = fileTransferRequest.fileData_;
                        this.bitField0_ &= -17;
                        this.fileDataBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getFileDataFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(fileTransferRequest.fileData_);
                    }
                }
                if (fileTransferRequest.hasXferData()) {
                    mergeXferData(fileTransferRequest.getXferData());
                }
                mergeUnknownFields(fileTransferRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder mergeXferData(GDIDataTypes.DataTransferItem dataTransferItem) {
                GDIDataTypes.DataTransferItem dataTransferItem2;
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dataTransferItem);
                } else if ((this.bitField0_ & 32) == 0 || (dataTransferItem2 = this.xferData_) == null || dataTransferItem2 == GDIDataTypes.DataTransferItem.getDefaultInstance()) {
                    this.xferData_ = dataTransferItem;
                } else {
                    getXferDataBuilder().mergeFrom(dataTransferItem);
                }
                if (this.xferData_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            @Deprecated
            public Builder removeFileData(int i14) {
                RepeatedFieldBuilderV3<FileData, FileData.Builder, FileDataOrBuilder> repeatedFieldBuilderV3 = this.fileDataBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureFileDataIsMutable();
                this.fileData_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setContentType(ContentType contentType) {
                contentType.getClass();
                this.bitField0_ |= 8;
                this.contentType_ = contentType.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Deprecated
            public Builder setFileData(int i14, FileData.Builder builder) {
                RepeatedFieldBuilderV3<FileData, FileData.Builder, FileDataOrBuilder> repeatedFieldBuilderV3 = this.fileDataBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureFileDataIsMutable();
                this.fileData_.set(i14, builder.build());
                onChanged();
                return this;
            }

            public Builder setFileName(String str) {
                str.getClass();
                this.fileName_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setFileNameBytes(ByteString byteString) {
                byteString.getClass();
                this.fileName_ = byteString;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setFileType(FileType fileType) {
                fileType.getClass();
                this.bitField0_ |= 4;
                this.fileType_ = fileType.getNumber();
                onChanged();
                return this;
            }

            public Builder setRawBytes(ByteString byteString) {
                byteString.getClass();
                this.rawBytes_ = byteString;
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

            public Builder setXferData(GDIDataTypes.DataTransferItem.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.xferData_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public FileTransferRequest getDefaultInstanceForType() {
                return FileTransferRequest.getDefaultInstance();
            }

            @Deprecated
            public FileData.Builder addFileDataBuilder(int i14) {
                return (FileData.Builder) getFileDataFieldBuilder().addBuilder(i14, FileData.getDefaultInstance());
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.rawBytes_ = ByteString.EMPTY;
                this.fileName_ = "";
                this.fileType_ = 0;
                this.contentType_ = 0;
                this.fileData_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            @Deprecated
            public Builder addFileData(int i14, FileData fileData) {
                RepeatedFieldBuilderV3<FileData, FileData.Builder, FileDataOrBuilder> repeatedFieldBuilderV3 = this.fileDataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    fileData.getClass();
                    ensureFileDataIsMutable();
                    this.fileData_.add(i14, fileData);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, fileData);
                return this;
            }

            @Deprecated
            public Builder setFileData(int i14, FileData fileData) {
                RepeatedFieldBuilderV3<FileData, FileData.Builder, FileDataOrBuilder> repeatedFieldBuilderV3 = this.fileDataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    fileData.getClass();
                    ensureFileDataIsMutable();
                    this.fileData_.set(i14, fileData);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, fileData);
                return this;
            }

            public Builder setXferData(GDIDataTypes.DataTransferItem dataTransferItem) {
                SingleFieldBuilderV3<GDIDataTypes.DataTransferItem, GDIDataTypes.DataTransferItem.Builder, GDIDataTypes.DataTransferItemOrBuilder> singleFieldBuilderV3 = this.xferDataBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dataTransferItem.getClass();
                    this.xferData_ = dataTransferItem;
                } else {
                    singleFieldBuilderV3.setMessage(dataTransferItem);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Deprecated
            public Builder addFileData(FileData fileData) {
                RepeatedFieldBuilderV3<FileData, FileData.Builder, FileDataOrBuilder> repeatedFieldBuilderV3 = this.fileDataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    fileData.getClass();
                    ensureFileDataIsMutable();
                    this.fileData_.add(fileData);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(fileData);
                return this;
            }

            @Deprecated
            public Builder addFileData(int i14, FileData.Builder builder) {
                RepeatedFieldBuilderV3<FileData, FileData.Builder, FileDataOrBuilder> repeatedFieldBuilderV3 = this.fileDataBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureFileDataIsMutable();
                    this.fileData_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FileTransferRequest) {
                    return mergeFrom((FileTransferRequest) message);
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
                                if (tag == 10) {
                                    this.rawBytes_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    this.fileName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    int i14 = codedInputStream.readEnum();
                                    if (FileType.forNumber(i14) == null) {
                                        mergeUnknownVarintField(3, i14);
                                    } else {
                                        this.fileType_ = i14;
                                        this.bitField0_ |= 4;
                                    }
                                } else if (tag == 32) {
                                    int i15 = codedInputStream.readEnum();
                                    if (ContentType.forNumber(i15) == null) {
                                        mergeUnknownVarintField(4, i15);
                                    } else {
                                        this.contentType_ = i15;
                                        this.bitField0_ |= 8;
                                    }
                                } else if (tag == 42) {
                                    FileData fileData = (FileData) codedInputStream.readMessage(FileData.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<FileData, FileData.Builder, FileDataOrBuilder> repeatedFieldBuilderV3 = this.fileDataBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureFileDataIsMutable();
                                        this.fileData_.add(fileData);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(fileData);
                                    }
                                } else if (tag != 50) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(getXferDataFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
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
        public FileTransferRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static FileTransferRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileTransferRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FileTransferRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FileTransferRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FileTransferRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FileTransferRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static FileTransferRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FileTransferRequest parseFrom(InputStream inputStream) {
            return (FileTransferRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FileTransferRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileTransferRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FileTransferRequest parseFrom(CodedInputStream codedInputStream) {
            return (FileTransferRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static FileTransferRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileTransferRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum ContentType implements ProtocolMessageEnum {
            FIT(0),
            ZIP_FIT(1);

            public static final int FIT_VALUE = 0;
            public static final int ZIP_FIT_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<ContentType> internalValueMap = new Internal.EnumLiteMap<ContentType>() { // from class: com.garmin.proto.generated.GDIGarminHealth.FileTransferRequest.ContentType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public ContentType findValueByNumber(int i14) {
                    return ContentType.forNumber(i14);
                }
            };
            private static final ContentType[] VALUES = values();

            ContentType(int i14) {
                this.value = i14;
            }

            public static ContentType forNumber(int i14) {
                if (i14 == 0) {
                    return FIT;
                }
                if (i14 != 1) {
                    return null;
                }
                return ZIP_FIT;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return FileTransferRequest.getDescriptor().getEnumTypes().get(1);
            }

            public static Internal.EnumLiteMap<ContentType> internalGetValueMap() {
                return internalValueMap;
            }

            public static ContentType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static ContentType valueOf(int i14) {
                return forNumber(i14);
            }
        }

        public enum FileType implements ProtocolMessageEnum {
            ECG(0);

            public static final int ECG_VALUE = 0;
            private final int value;
            private static final Internal.EnumLiteMap<FileType> internalValueMap = new Internal.EnumLiteMap<FileType>() { // from class: com.garmin.proto.generated.GDIGarminHealth.FileTransferRequest.FileType.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public FileType findValueByNumber(int i14) {
                    return FileType.forNumber(i14);
                }
            };
            private static final FileType[] VALUES = values();

            FileType(int i14) {
                this.value = i14;
            }

            public static FileType forNumber(int i14) {
                if (i14 != 0) {
                    return null;
                }
                return ECG;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return FileTransferRequest.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<FileType> internalGetValueMap() {
                return internalValueMap;
            }

            public static FileType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static FileType valueOf(int i14) {
                return forNumber(i14);
            }
        }

        private FileTransferRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.rawBytes_ = ByteString.EMPTY;
            this.fileName_ = "";
            this.fileType_ = 0;
            this.contentType_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ FileTransferRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class EmbeddedHealthTokenResponse extends GeneratedMessageV3 implements EmbeddedHealthTokenResponseOrBuilder {
        public static final int FAILURE_FIELD_NUMBER = 2;
        public static final int TOKEN_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int failure_;
        private byte memoizedIsInitialized;
        private volatile Object token_;
        private static final EmbeddedHealthTokenResponse DEFAULT_INSTANCE = new EmbeddedHealthTokenResponse();

        @Deprecated
        public static final Parser<EmbeddedHealthTokenResponse> PARSER = new AbstractParser<EmbeddedHealthTokenResponse>() { // from class: com.garmin.proto.generated.GDIGarminHealth.EmbeddedHealthTokenResponse.1
            @Override // com.google.protobuf.Parser
            public EmbeddedHealthTokenResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = EmbeddedHealthTokenResponse.newBuilder();
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

        private EmbeddedHealthTokenResponse() {
            this.token_ = "";
            this.failure_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.token_ = "";
            this.failure_ = 0;
        }

        public static EmbeddedHealthTokenResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminHealth.internal_static_GDI_Proto_GHS_EmbeddedHealthTokenResponse_descriptor;
        }

        public static Builder newBuilder(EmbeddedHealthTokenResponse embeddedHealthTokenResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(embeddedHealthTokenResponse);
        }

        public static EmbeddedHealthTokenResponse parseDelimitedFrom(InputStream inputStream) {
            return (EmbeddedHealthTokenResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static EmbeddedHealthTokenResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<EmbeddedHealthTokenResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof EmbeddedHealthTokenResponse)) {
                return super.equals(obj);
            }
            EmbeddedHealthTokenResponse embeddedHealthTokenResponse = (EmbeddedHealthTokenResponse) obj;
            if (hasToken() != embeddedHealthTokenResponse.hasToken()) {
                return false;
            }
            if ((!hasToken() || getToken().equals(embeddedHealthTokenResponse.getToken())) && hasFailure() == embeddedHealthTokenResponse.hasFailure()) {
                return (!hasFailure() || this.failure_ == embeddedHealthTokenResponse.failure_) && getUnknownFields().equals(embeddedHealthTokenResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.EmbeddedHealthTokenResponseOrBuilder
        public GDISaMD.SaMDCommonFailures getFailure() {
            GDISaMD.SaMDCommonFailures saMDCommonFailuresForNumber = GDISaMD.SaMDCommonFailures.forNumber(this.failure_);
            return saMDCommonFailuresForNumber == null ? GDISaMD.SaMDCommonFailures.OTHER : saMDCommonFailuresForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<EmbeddedHealthTokenResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.token_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeStringSize += CodedOutputStream.computeEnumSize(2, this.failure_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeStringSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.EmbeddedHealthTokenResponseOrBuilder
        public String getToken() {
            Object obj = this.token_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.token_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.EmbeddedHealthTokenResponseOrBuilder
        public ByteString getTokenBytes() {
            Object obj = this.token_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.token_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.EmbeddedHealthTokenResponseOrBuilder
        public boolean hasFailure() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.EmbeddedHealthTokenResponseOrBuilder
        public boolean hasToken() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasToken()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getToken().hashCode();
            }
            if (hasFailure()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.failure_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminHealth.internal_static_GDI_Proto_GHS_EmbeddedHealthTokenResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(EmbeddedHealthTokenResponse.class, Builder.class);
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
            return new EmbeddedHealthTokenResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.token_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.failure_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements EmbeddedHealthTokenResponseOrBuilder {
            private int bitField0_;
            private int failure_;
            private Object token_;

            private Builder() {
                this.token_ = "";
                this.failure_ = 0;
            }

            private void buildPartial0(EmbeddedHealthTokenResponse embeddedHealthTokenResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    embeddedHealthTokenResponse.token_ = this.token_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    embeddedHealthTokenResponse.failure_ = this.failure_;
                    i14 |= 2;
                }
                embeddedHealthTokenResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_EmbeddedHealthTokenResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EmbeddedHealthTokenResponse build() {
                EmbeddedHealthTokenResponse embeddedHealthTokenResponseBuildPartial = buildPartial();
                if (embeddedHealthTokenResponseBuildPartial.isInitialized()) {
                    return embeddedHealthTokenResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) embeddedHealthTokenResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public EmbeddedHealthTokenResponse buildPartial() {
                EmbeddedHealthTokenResponse embeddedHealthTokenResponse = new EmbeddedHealthTokenResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(embeddedHealthTokenResponse);
                }
                onBuilt();
                return embeddedHealthTokenResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.token_ = "";
                this.failure_ = 0;
                return this;
            }

            public Builder clearFailure() {
                this.bitField0_ &= -3;
                this.failure_ = 0;
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

            public Builder clearToken() {
                this.token_ = EmbeddedHealthTokenResponse.getDefaultInstance().getToken();
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
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_EmbeddedHealthTokenResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.EmbeddedHealthTokenResponseOrBuilder
            public GDISaMD.SaMDCommonFailures getFailure() {
                GDISaMD.SaMDCommonFailures saMDCommonFailuresForNumber = GDISaMD.SaMDCommonFailures.forNumber(this.failure_);
                return saMDCommonFailuresForNumber == null ? GDISaMD.SaMDCommonFailures.OTHER : saMDCommonFailuresForNumber;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.EmbeddedHealthTokenResponseOrBuilder
            public String getToken() {
                Object obj = this.token_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.token_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.EmbeddedHealthTokenResponseOrBuilder
            public ByteString getTokenBytes() {
                Object obj = this.token_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.token_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.EmbeddedHealthTokenResponseOrBuilder
            public boolean hasFailure() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.EmbeddedHealthTokenResponseOrBuilder
            public boolean hasToken() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_EmbeddedHealthTokenResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(EmbeddedHealthTokenResponse.class, Builder.class);
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
                                    this.token_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (GDISaMD.SaMDCommonFailures.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.failure_ = i14;
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

            public Builder setFailure(GDISaMD.SaMDCommonFailures saMDCommonFailures) {
                saMDCommonFailures.getClass();
                this.bitField0_ |= 2;
                this.failure_ = saMDCommonFailures.getNumber();
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

            public Builder setToken(String str) {
                str.getClass();
                this.token_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTokenBytes(ByteString byteString) {
                byteString.getClass();
                this.token_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public EmbeddedHealthTokenResponse getDefaultInstanceForType() {
                return EmbeddedHealthTokenResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.token_ = "";
                this.failure_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof EmbeddedHealthTokenResponse) {
                    return mergeFrom((EmbeddedHealthTokenResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(EmbeddedHealthTokenResponse embeddedHealthTokenResponse) {
                if (embeddedHealthTokenResponse == EmbeddedHealthTokenResponse.getDefaultInstance()) {
                    return this;
                }
                if (embeddedHealthTokenResponse.hasToken()) {
                    this.token_ = embeddedHealthTokenResponse.token_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (embeddedHealthTokenResponse.hasFailure()) {
                    setFailure(embeddedHealthTokenResponse.getFailure());
                }
                mergeUnknownFields(embeddedHealthTokenResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public EmbeddedHealthTokenResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static EmbeddedHealthTokenResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedHealthTokenResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static EmbeddedHealthTokenResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static EmbeddedHealthTokenResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static EmbeddedHealthTokenResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static EmbeddedHealthTokenResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static EmbeddedHealthTokenResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static EmbeddedHealthTokenResponse parseFrom(InputStream inputStream) {
            return (EmbeddedHealthTokenResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static EmbeddedHealthTokenResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedHealthTokenResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private EmbeddedHealthTokenResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.token_ = "";
            this.failure_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static EmbeddedHealthTokenResponse parseFrom(CodedInputStream codedInputStream) {
            return (EmbeddedHealthTokenResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static EmbeddedHealthTokenResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (EmbeddedHealthTokenResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ EmbeddedHealthTokenResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class FileTransferCompleteNotification extends GeneratedMessageV3 implements FileTransferCompleteNotificationOrBuilder {
        public static final int FAILURE_FIELD_NUMBER = 1;
        public static final int FILE_NAME_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int failure_;
        private volatile Object fileName_;
        private byte memoizedIsInitialized;
        private static final FileTransferCompleteNotification DEFAULT_INSTANCE = new FileTransferCompleteNotification();

        @Deprecated
        public static final Parser<FileTransferCompleteNotification> PARSER = new AbstractParser<FileTransferCompleteNotification>() { // from class: com.garmin.proto.generated.GDIGarminHealth.FileTransferCompleteNotification.1
            @Override // com.google.protobuf.Parser
            public FileTransferCompleteNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = FileTransferCompleteNotification.newBuilder();
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

        private FileTransferCompleteNotification() {
            this.failure_ = 0;
            this.fileName_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.failure_ = 0;
            this.fileName_ = "";
        }

        public static FileTransferCompleteNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferCompleteNotification_descriptor;
        }

        public static Builder newBuilder(FileTransferCompleteNotification fileTransferCompleteNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(fileTransferCompleteNotification);
        }

        public static FileTransferCompleteNotification parseDelimitedFrom(InputStream inputStream) {
            return (FileTransferCompleteNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FileTransferCompleteNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<FileTransferCompleteNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FileTransferCompleteNotification)) {
                return super.equals(obj);
            }
            FileTransferCompleteNotification fileTransferCompleteNotification = (FileTransferCompleteNotification) obj;
            if (hasFailure() != fileTransferCompleteNotification.hasFailure()) {
                return false;
            }
            if ((!hasFailure() || this.failure_ == fileTransferCompleteNotification.failure_) && hasFileName() == fileTransferCompleteNotification.hasFileName()) {
                return (!hasFileName() || getFileName().equals(fileTransferCompleteNotification.getFileName())) && getUnknownFields().equals(fileTransferCompleteNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferCompleteNotificationOrBuilder
        public GDISaMD.SaMDCommonFailures getFailure() {
            GDISaMD.SaMDCommonFailures saMDCommonFailuresForNumber = GDISaMD.SaMDCommonFailures.forNumber(this.failure_);
            return saMDCommonFailuresForNumber == null ? GDISaMD.SaMDCommonFailures.OTHER : saMDCommonFailuresForNumber;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferCompleteNotificationOrBuilder
        public String getFileName() {
            Object obj = this.fileName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.fileName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferCompleteNotificationOrBuilder
        public ByteString getFileNameBytes() {
            Object obj = this.fileName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.fileName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FileTransferCompleteNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.failure_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += GeneratedMessageV3.computeStringSize(2, this.fileName_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferCompleteNotificationOrBuilder
        public boolean hasFailure() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferCompleteNotificationOrBuilder
        public boolean hasFileName() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasFailure()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.failure_;
            }
            if (hasFileName()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getFileName().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferCompleteNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(FileTransferCompleteNotification.class, Builder.class);
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
            return new FileTransferCompleteNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.failure_);
            }
            if ((this.bitField0_ & 2) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 2, this.fileName_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FileTransferCompleteNotificationOrBuilder {
            private int bitField0_;
            private int failure_;
            private Object fileName_;

            private Builder() {
                this.failure_ = 0;
                this.fileName_ = "";
            }

            private void buildPartial0(FileTransferCompleteNotification fileTransferCompleteNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    fileTransferCompleteNotification.failure_ = this.failure_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    fileTransferCompleteNotification.fileName_ = this.fileName_;
                    i14 |= 2;
                }
                fileTransferCompleteNotification.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferCompleteNotification_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FileTransferCompleteNotification build() {
                FileTransferCompleteNotification fileTransferCompleteNotificationBuildPartial = buildPartial();
                if (fileTransferCompleteNotificationBuildPartial.isInitialized()) {
                    return fileTransferCompleteNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) fileTransferCompleteNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FileTransferCompleteNotification buildPartial() {
                FileTransferCompleteNotification fileTransferCompleteNotification = new FileTransferCompleteNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(fileTransferCompleteNotification);
                }
                onBuilt();
                return fileTransferCompleteNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.failure_ = 0;
                this.fileName_ = "";
                return this;
            }

            public Builder clearFailure() {
                this.bitField0_ &= -2;
                this.failure_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearFileName() {
                this.fileName_ = FileTransferCompleteNotification.getDefaultInstance().getFileName();
                this.bitField0_ &= -3;
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
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferCompleteNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferCompleteNotificationOrBuilder
            public GDISaMD.SaMDCommonFailures getFailure() {
                GDISaMD.SaMDCommonFailures saMDCommonFailuresForNumber = GDISaMD.SaMDCommonFailures.forNumber(this.failure_);
                return saMDCommonFailuresForNumber == null ? GDISaMD.SaMDCommonFailures.OTHER : saMDCommonFailuresForNumber;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferCompleteNotificationOrBuilder
            public String getFileName() {
                Object obj = this.fileName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.fileName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferCompleteNotificationOrBuilder
            public ByteString getFileNameBytes() {
                Object obj = this.fileName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.fileName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferCompleteNotificationOrBuilder
            public boolean hasFailure() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferCompleteNotificationOrBuilder
            public boolean hasFileName() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferCompleteNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(FileTransferCompleteNotification.class, Builder.class);
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
                                    if (GDISaMD.SaMDCommonFailures.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.failure_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    this.fileName_ = codedInputStream.readBytes();
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

            public Builder setFailure(GDISaMD.SaMDCommonFailures saMDCommonFailures) {
                saMDCommonFailures.getClass();
                this.bitField0_ |= 1;
                this.failure_ = saMDCommonFailures.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setFileName(String str) {
                str.getClass();
                this.fileName_ = str;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setFileNameBytes(ByteString byteString) {
                byteString.getClass();
                this.fileName_ = byteString;
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
            public FileTransferCompleteNotification getDefaultInstanceForType() {
                return FileTransferCompleteNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.failure_ = 0;
                this.fileName_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FileTransferCompleteNotification) {
                    return mergeFrom((FileTransferCompleteNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FileTransferCompleteNotification fileTransferCompleteNotification) {
                if (fileTransferCompleteNotification == FileTransferCompleteNotification.getDefaultInstance()) {
                    return this;
                }
                if (fileTransferCompleteNotification.hasFailure()) {
                    setFailure(fileTransferCompleteNotification.getFailure());
                }
                if (fileTransferCompleteNotification.hasFileName()) {
                    this.fileName_ = fileTransferCompleteNotification.fileName_;
                    this.bitField0_ |= 2;
                    onChanged();
                }
                mergeUnknownFields(fileTransferCompleteNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FileTransferCompleteNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static FileTransferCompleteNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileTransferCompleteNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FileTransferCompleteNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FileTransferCompleteNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FileTransferCompleteNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static FileTransferCompleteNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static FileTransferCompleteNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FileTransferCompleteNotification parseFrom(InputStream inputStream) {
            return (FileTransferCompleteNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FileTransferCompleteNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileTransferCompleteNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        private FileTransferCompleteNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.failure_ = 0;
            this.fileName_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FileTransferCompleteNotification parseFrom(CodedInputStream codedInputStream) {
            return (FileTransferCompleteNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static FileTransferCompleteNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileTransferCompleteNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public /* synthetic */ FileTransferCompleteNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class FileTransferPrecheckResponse extends GeneratedMessageV3 implements FileTransferPrecheckResponseOrBuilder {
        public static final int FAILURE_FIELD_NUMBER = 1;
        public static final int GARMIN_HEALTH_SERVICE_FILE_TRANSFER_SUPPORT_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int failure_;
        private boolean garminHealthServiceFileTransferSupport_;
        private byte memoizedIsInitialized;
        private static final FileTransferPrecheckResponse DEFAULT_INSTANCE = new FileTransferPrecheckResponse();

        @Deprecated
        public static final Parser<FileTransferPrecheckResponse> PARSER = new AbstractParser<FileTransferPrecheckResponse>() { // from class: com.garmin.proto.generated.GDIGarminHealth.FileTransferPrecheckResponse.1
            @Override // com.google.protobuf.Parser
            public FileTransferPrecheckResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = FileTransferPrecheckResponse.newBuilder();
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

        private FileTransferPrecheckResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.failure_ = 0;
            this.garminHealthServiceFileTransferSupport_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FileTransferPrecheckResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferPrecheckResponse_descriptor;
        }

        public static Builder newBuilder(FileTransferPrecheckResponse fileTransferPrecheckResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(fileTransferPrecheckResponse);
        }

        public static FileTransferPrecheckResponse parseDelimitedFrom(InputStream inputStream) {
            return (FileTransferPrecheckResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FileTransferPrecheckResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<FileTransferPrecheckResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FileTransferPrecheckResponse)) {
                return super.equals(obj);
            }
            FileTransferPrecheckResponse fileTransferPrecheckResponse = (FileTransferPrecheckResponse) obj;
            if (hasFailure() != fileTransferPrecheckResponse.hasFailure()) {
                return false;
            }
            if ((!hasFailure() || this.failure_ == fileTransferPrecheckResponse.failure_) && hasGarminHealthServiceFileTransferSupport() == fileTransferPrecheckResponse.hasGarminHealthServiceFileTransferSupport()) {
                return (!hasGarminHealthServiceFileTransferSupport() || getGarminHealthServiceFileTransferSupport() == fileTransferPrecheckResponse.getGarminHealthServiceFileTransferSupport()) && getUnknownFields().equals(fileTransferPrecheckResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferPrecheckResponseOrBuilder
        public GDISaMD.SaMDCommonFailures getFailure() {
            GDISaMD.SaMDCommonFailures saMDCommonFailuresForNumber = GDISaMD.SaMDCommonFailures.forNumber(this.failure_);
            return saMDCommonFailuresForNumber == null ? GDISaMD.SaMDCommonFailures.OTHER : saMDCommonFailuresForNumber;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferPrecheckResponseOrBuilder
        public boolean getGarminHealthServiceFileTransferSupport() {
            return this.garminHealthServiceFileTransferSupport_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FileTransferPrecheckResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.failure_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBoolSize(2, this.garminHealthServiceFileTransferSupport_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferPrecheckResponseOrBuilder
        public boolean hasFailure() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferPrecheckResponseOrBuilder
        public boolean hasGarminHealthServiceFileTransferSupport() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasFailure()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.failure_;
            }
            if (hasGarminHealthServiceFileTransferSupport()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getGarminHealthServiceFileTransferSupport());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferPrecheckResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(FileTransferPrecheckResponse.class, Builder.class);
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
            return new FileTransferPrecheckResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.failure_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.garminHealthServiceFileTransferSupport_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FileTransferPrecheckResponseOrBuilder {
            private int bitField0_;
            private int failure_;
            private boolean garminHealthServiceFileTransferSupport_;

            private Builder() {
                this.failure_ = 0;
            }

            private void buildPartial0(FileTransferPrecheckResponse fileTransferPrecheckResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    fileTransferPrecheckResponse.failure_ = this.failure_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    fileTransferPrecheckResponse.garminHealthServiceFileTransferSupport_ = this.garminHealthServiceFileTransferSupport_;
                    i14 |= 2;
                }
                fileTransferPrecheckResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferPrecheckResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FileTransferPrecheckResponse build() {
                FileTransferPrecheckResponse fileTransferPrecheckResponseBuildPartial = buildPartial();
                if (fileTransferPrecheckResponseBuildPartial.isInitialized()) {
                    return fileTransferPrecheckResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) fileTransferPrecheckResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FileTransferPrecheckResponse buildPartial() {
                FileTransferPrecheckResponse fileTransferPrecheckResponse = new FileTransferPrecheckResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(fileTransferPrecheckResponse);
                }
                onBuilt();
                return fileTransferPrecheckResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.failure_ = 0;
                this.garminHealthServiceFileTransferSupport_ = false;
                return this;
            }

            public Builder clearFailure() {
                this.bitField0_ &= -2;
                this.failure_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearGarminHealthServiceFileTransferSupport() {
                this.bitField0_ &= -3;
                this.garminHealthServiceFileTransferSupport_ = false;
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
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferPrecheckResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferPrecheckResponseOrBuilder
            public GDISaMD.SaMDCommonFailures getFailure() {
                GDISaMD.SaMDCommonFailures saMDCommonFailuresForNumber = GDISaMD.SaMDCommonFailures.forNumber(this.failure_);
                return saMDCommonFailuresForNumber == null ? GDISaMD.SaMDCommonFailures.OTHER : saMDCommonFailuresForNumber;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferPrecheckResponseOrBuilder
            public boolean getGarminHealthServiceFileTransferSupport() {
                return this.garminHealthServiceFileTransferSupport_;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferPrecheckResponseOrBuilder
            public boolean hasFailure() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferPrecheckResponseOrBuilder
            public boolean hasGarminHealthServiceFileTransferSupport() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferPrecheckResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(FileTransferPrecheckResponse.class, Builder.class);
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
                                    if (GDISaMD.SaMDCommonFailures.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.failure_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    this.garminHealthServiceFileTransferSupport_ = codedInputStream.readBool();
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

            public Builder setFailure(GDISaMD.SaMDCommonFailures saMDCommonFailures) {
                saMDCommonFailures.getClass();
                this.bitField0_ |= 1;
                this.failure_ = saMDCommonFailures.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setGarminHealthServiceFileTransferSupport(boolean z14) {
                this.garminHealthServiceFileTransferSupport_ = z14;
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
            public FileTransferPrecheckResponse getDefaultInstanceForType() {
                return FileTransferPrecheckResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.failure_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FileTransferPrecheckResponse) {
                    return mergeFrom((FileTransferPrecheckResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FileTransferPrecheckResponse fileTransferPrecheckResponse) {
                if (fileTransferPrecheckResponse == FileTransferPrecheckResponse.getDefaultInstance()) {
                    return this;
                }
                if (fileTransferPrecheckResponse.hasFailure()) {
                    setFailure(fileTransferPrecheckResponse.getFailure());
                }
                if (fileTransferPrecheckResponse.hasGarminHealthServiceFileTransferSupport()) {
                    setGarminHealthServiceFileTransferSupport(fileTransferPrecheckResponse.getGarminHealthServiceFileTransferSupport());
                }
                mergeUnknownFields(fileTransferPrecheckResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FileTransferPrecheckResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static FileTransferPrecheckResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileTransferPrecheckResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FileTransferPrecheckResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FileTransferPrecheckResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FileTransferPrecheckResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ FileTransferPrecheckResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static FileTransferPrecheckResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private FileTransferPrecheckResponse() {
            this.garminHealthServiceFileTransferSupport_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.failure_ = 0;
        }

        public static FileTransferPrecheckResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FileTransferPrecheckResponse parseFrom(InputStream inputStream) {
            return (FileTransferPrecheckResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FileTransferPrecheckResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileTransferPrecheckResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FileTransferPrecheckResponse parseFrom(CodedInputStream codedInputStream) {
            return (FileTransferPrecheckResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static FileTransferPrecheckResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileTransferPrecheckResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class FileTransferResponse extends GeneratedMessageV3 implements FileTransferResponseOrBuilder {
        public static final int FAILURE_FIELD_NUMBER = 1;
        public static final int IS_PENDING_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int failure_;
        private boolean isPending_;
        private byte memoizedIsInitialized;
        private static final FileTransferResponse DEFAULT_INSTANCE = new FileTransferResponse();

        @Deprecated
        public static final Parser<FileTransferResponse> PARSER = new AbstractParser<FileTransferResponse>() { // from class: com.garmin.proto.generated.GDIGarminHealth.FileTransferResponse.1
            @Override // com.google.protobuf.Parser
            public FileTransferResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = FileTransferResponse.newBuilder();
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

        private FileTransferResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.failure_ = 0;
            this.isPending_ = false;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static FileTransferResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferResponse_descriptor;
        }

        public static Builder newBuilder(FileTransferResponse fileTransferResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(fileTransferResponse);
        }

        public static FileTransferResponse parseDelimitedFrom(InputStream inputStream) {
            return (FileTransferResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static FileTransferResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<FileTransferResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof FileTransferResponse)) {
                return super.equals(obj);
            }
            FileTransferResponse fileTransferResponse = (FileTransferResponse) obj;
            if (hasFailure() != fileTransferResponse.hasFailure()) {
                return false;
            }
            if ((!hasFailure() || this.failure_ == fileTransferResponse.failure_) && hasIsPending() == fileTransferResponse.hasIsPending()) {
                return (!hasIsPending() || getIsPending() == fileTransferResponse.getIsPending()) && getUnknownFields().equals(fileTransferResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferResponseOrBuilder
        public GDISaMD.SaMDCommonFailures getFailure() {
            GDISaMD.SaMDCommonFailures saMDCommonFailuresForNumber = GDISaMD.SaMDCommonFailures.forNumber(this.failure_);
            return saMDCommonFailuresForNumber == null ? GDISaMD.SaMDCommonFailures.OTHER : saMDCommonFailuresForNumber;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferResponseOrBuilder
        public boolean getIsPending() {
            return this.isPending_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<FileTransferResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeEnumSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeEnumSize(1, this.failure_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeEnumSize += CodedOutputStream.computeBoolSize(2, this.isPending_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferResponseOrBuilder
        public boolean hasFailure() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferResponseOrBuilder
        public boolean hasIsPending() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasFailure()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + this.failure_;
            }
            if (hasIsPending()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + Internal.hashBoolean(getIsPending());
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(FileTransferResponse.class, Builder.class);
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
            return new FileTransferResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeEnum(1, this.failure_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeBool(2, this.isPending_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements FileTransferResponseOrBuilder {
            private int bitField0_;
            private int failure_;
            private boolean isPending_;

            private Builder() {
                this.failure_ = 0;
            }

            private void buildPartial0(FileTransferResponse fileTransferResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    fileTransferResponse.failure_ = this.failure_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    fileTransferResponse.isPending_ = this.isPending_;
                    i14 |= 2;
                }
                fileTransferResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FileTransferResponse build() {
                FileTransferResponse fileTransferResponseBuildPartial = buildPartial();
                if (fileTransferResponseBuildPartial.isInitialized()) {
                    return fileTransferResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) fileTransferResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public FileTransferResponse buildPartial() {
                FileTransferResponse fileTransferResponse = new FileTransferResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(fileTransferResponse);
                }
                onBuilt();
                return fileTransferResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.failure_ = 0;
                this.isPending_ = false;
                return this;
            }

            public Builder clearFailure() {
                this.bitField0_ &= -2;
                this.failure_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIsPending() {
                this.bitField0_ &= -3;
                this.isPending_ = false;
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
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferResponseOrBuilder
            public GDISaMD.SaMDCommonFailures getFailure() {
                GDISaMD.SaMDCommonFailures saMDCommonFailuresForNumber = GDISaMD.SaMDCommonFailures.forNumber(this.failure_);
                return saMDCommonFailuresForNumber == null ? GDISaMD.SaMDCommonFailures.OTHER : saMDCommonFailuresForNumber;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferResponseOrBuilder
            public boolean getIsPending() {
                return this.isPending_;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferResponseOrBuilder
            public boolean hasFailure() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.FileTransferResponseOrBuilder
            public boolean hasIsPending() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_FileTransferResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(FileTransferResponse.class, Builder.class);
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
                                    if (GDISaMD.SaMDCommonFailures.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.failure_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 16) {
                                    this.isPending_ = codedInputStream.readBool();
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

            public Builder setFailure(GDISaMD.SaMDCommonFailures saMDCommonFailures) {
                saMDCommonFailures.getClass();
                this.bitField0_ |= 1;
                this.failure_ = saMDCommonFailures.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setIsPending(boolean z14) {
                this.isPending_ = z14;
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
            public FileTransferResponse getDefaultInstanceForType() {
                return FileTransferResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.failure_ = 0;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof FileTransferResponse) {
                    return mergeFrom((FileTransferResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(FileTransferResponse fileTransferResponse) {
                if (fileTransferResponse == FileTransferResponse.getDefaultInstance()) {
                    return this;
                }
                if (fileTransferResponse.hasFailure()) {
                    setFailure(fileTransferResponse.getFailure());
                }
                if (fileTransferResponse.hasIsPending()) {
                    setIsPending(fileTransferResponse.getIsPending());
                }
                mergeUnknownFields(fileTransferResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public FileTransferResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static FileTransferResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileTransferResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FileTransferResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static FileTransferResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static FileTransferResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ FileTransferResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static FileTransferResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private FileTransferResponse() {
            this.isPending_ = false;
            this.memoizedIsInitialized = (byte) -1;
            this.failure_ = 0;
        }

        public static FileTransferResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static FileTransferResponse parseFrom(InputStream inputStream) {
            return (FileTransferResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static FileTransferResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileTransferResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static FileTransferResponse parseFrom(CodedInputStream codedInputStream) {
            return (FileTransferResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static FileTransferResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (FileTransferResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int FILE_XFER_COMPLETE_NOTIFICATION_FIELD_NUMBER = 11;
        public static final int FILE_XFER_PRECHECK_REQUEST_FIELD_NUMBER = 5;
        public static final int FILE_XFER_PRECHECK_RESPONSE_FIELD_NUMBER = 6;
        public static final int FILE_XFER_READY_FOR_NEXT_FIELD_NUMBER = 9;
        public static final int FILE_XFER_REQUEST_FIELD_NUMBER = 7;
        public static final int FILE_XFER_RESPONSE_FIELD_NUMBER = 8;
        public static final int INVALID_UPLOAD_CONSENT_FIELD_NUMBER = 10;
        public static final int TOKEN_REQUEST_FIELD_NUMBER = 1;
        public static final int TOKEN_RESPONSE_FIELD_NUMBER = 2;
        public static final int UPDATE_SAMDID_REQUEST_FIELD_NUMBER = 3;
        public static final int UPDATE_SAMDID_RESPONSE_FIELD_NUMBER = 4;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private FileTransferCompleteNotification fileXferCompleteNotification_;
        private FileTransferPrecheckRequest fileXferPrecheckRequest_;
        private FileTransferPrecheckResponse fileXferPrecheckResponse_;
        private FileTransferReadyForNext fileXferReadyForNext_;
        private FileTransferRequest fileXferRequest_;
        private FileTransferResponse fileXferResponse_;
        private InvalidUploadConsent invalidUploadConsent_;
        private byte memoizedIsInitialized;
        private EmbeddedHealthTokenRequest tokenRequest_;
        private EmbeddedHealthTokenResponse tokenResponse_;
        private UpdateSaMDIdRequest updateSamdidRequest_;
        private UpdateSaMDIdResponse updateSamdidResponse_;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIGarminHealth.Service.1
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
            return GDIGarminHealth.internal_static_GDI_Proto_GHS_Service_descriptor;
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
            if (hasTokenRequest() != service.hasTokenRequest()) {
                return false;
            }
            if ((hasTokenRequest() && !getTokenRequest().equals(service.getTokenRequest())) || hasTokenResponse() != service.hasTokenResponse()) {
                return false;
            }
            if ((hasTokenResponse() && !getTokenResponse().equals(service.getTokenResponse())) || hasUpdateSamdidRequest() != service.hasUpdateSamdidRequest()) {
                return false;
            }
            if ((hasUpdateSamdidRequest() && !getUpdateSamdidRequest().equals(service.getUpdateSamdidRequest())) || hasUpdateSamdidResponse() != service.hasUpdateSamdidResponse()) {
                return false;
            }
            if ((hasUpdateSamdidResponse() && !getUpdateSamdidResponse().equals(service.getUpdateSamdidResponse())) || hasFileXferPrecheckRequest() != service.hasFileXferPrecheckRequest()) {
                return false;
            }
            if ((hasFileXferPrecheckRequest() && !getFileXferPrecheckRequest().equals(service.getFileXferPrecheckRequest())) || hasFileXferPrecheckResponse() != service.hasFileXferPrecheckResponse()) {
                return false;
            }
            if ((hasFileXferPrecheckResponse() && !getFileXferPrecheckResponse().equals(service.getFileXferPrecheckResponse())) || hasFileXferRequest() != service.hasFileXferRequest()) {
                return false;
            }
            if ((hasFileXferRequest() && !getFileXferRequest().equals(service.getFileXferRequest())) || hasFileXferResponse() != service.hasFileXferResponse()) {
                return false;
            }
            if ((hasFileXferResponse() && !getFileXferResponse().equals(service.getFileXferResponse())) || hasFileXferReadyForNext() != service.hasFileXferReadyForNext()) {
                return false;
            }
            if ((hasFileXferReadyForNext() && !getFileXferReadyForNext().equals(service.getFileXferReadyForNext())) || hasInvalidUploadConsent() != service.hasInvalidUploadConsent()) {
                return false;
            }
            if ((!hasInvalidUploadConsent() || getInvalidUploadConsent().equals(service.getInvalidUploadConsent())) && hasFileXferCompleteNotification() == service.hasFileXferCompleteNotification()) {
                return (!hasFileXferCompleteNotification() || getFileXferCompleteNotification().equals(service.getFileXferCompleteNotification())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public FileTransferCompleteNotification getFileXferCompleteNotification() {
            FileTransferCompleteNotification fileTransferCompleteNotification = this.fileXferCompleteNotification_;
            return fileTransferCompleteNotification == null ? FileTransferCompleteNotification.getDefaultInstance() : fileTransferCompleteNotification;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public FileTransferCompleteNotificationOrBuilder getFileXferCompleteNotificationOrBuilder() {
            FileTransferCompleteNotification fileTransferCompleteNotification = this.fileXferCompleteNotification_;
            return fileTransferCompleteNotification == null ? FileTransferCompleteNotification.getDefaultInstance() : fileTransferCompleteNotification;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public FileTransferPrecheckRequest getFileXferPrecheckRequest() {
            FileTransferPrecheckRequest fileTransferPrecheckRequest = this.fileXferPrecheckRequest_;
            return fileTransferPrecheckRequest == null ? FileTransferPrecheckRequest.getDefaultInstance() : fileTransferPrecheckRequest;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public FileTransferPrecheckRequestOrBuilder getFileXferPrecheckRequestOrBuilder() {
            FileTransferPrecheckRequest fileTransferPrecheckRequest = this.fileXferPrecheckRequest_;
            return fileTransferPrecheckRequest == null ? FileTransferPrecheckRequest.getDefaultInstance() : fileTransferPrecheckRequest;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public FileTransferPrecheckResponse getFileXferPrecheckResponse() {
            FileTransferPrecheckResponse fileTransferPrecheckResponse = this.fileXferPrecheckResponse_;
            return fileTransferPrecheckResponse == null ? FileTransferPrecheckResponse.getDefaultInstance() : fileTransferPrecheckResponse;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public FileTransferPrecheckResponseOrBuilder getFileXferPrecheckResponseOrBuilder() {
            FileTransferPrecheckResponse fileTransferPrecheckResponse = this.fileXferPrecheckResponse_;
            return fileTransferPrecheckResponse == null ? FileTransferPrecheckResponse.getDefaultInstance() : fileTransferPrecheckResponse;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public FileTransferReadyForNext getFileXferReadyForNext() {
            FileTransferReadyForNext fileTransferReadyForNext = this.fileXferReadyForNext_;
            return fileTransferReadyForNext == null ? FileTransferReadyForNext.getDefaultInstance() : fileTransferReadyForNext;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public FileTransferReadyForNextOrBuilder getFileXferReadyForNextOrBuilder() {
            FileTransferReadyForNext fileTransferReadyForNext = this.fileXferReadyForNext_;
            return fileTransferReadyForNext == null ? FileTransferReadyForNext.getDefaultInstance() : fileTransferReadyForNext;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public FileTransferRequest getFileXferRequest() {
            FileTransferRequest fileTransferRequest = this.fileXferRequest_;
            return fileTransferRequest == null ? FileTransferRequest.getDefaultInstance() : fileTransferRequest;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public FileTransferRequestOrBuilder getFileXferRequestOrBuilder() {
            FileTransferRequest fileTransferRequest = this.fileXferRequest_;
            return fileTransferRequest == null ? FileTransferRequest.getDefaultInstance() : fileTransferRequest;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public FileTransferResponse getFileXferResponse() {
            FileTransferResponse fileTransferResponse = this.fileXferResponse_;
            return fileTransferResponse == null ? FileTransferResponse.getDefaultInstance() : fileTransferResponse;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public FileTransferResponseOrBuilder getFileXferResponseOrBuilder() {
            FileTransferResponse fileTransferResponse = this.fileXferResponse_;
            return fileTransferResponse == null ? FileTransferResponse.getDefaultInstance() : fileTransferResponse;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public InvalidUploadConsent getInvalidUploadConsent() {
            InvalidUploadConsent invalidUploadConsent = this.invalidUploadConsent_;
            return invalidUploadConsent == null ? InvalidUploadConsent.getDefaultInstance() : invalidUploadConsent;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public InvalidUploadConsentOrBuilder getInvalidUploadConsentOrBuilder() {
            InvalidUploadConsent invalidUploadConsent = this.invalidUploadConsent_;
            return invalidUploadConsent == null ? InvalidUploadConsent.getDefaultInstance() : invalidUploadConsent;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getTokenRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getTokenResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getUpdateSamdidRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getUpdateSamdidResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getFileXferPrecheckRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getFileXferPrecheckResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getFileXferRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getFileXferResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getFileXferReadyForNext());
            }
            if ((this.bitField0_ & 512) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getInvalidUploadConsent());
            }
            if ((this.bitField0_ & 1024) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, getFileXferCompleteNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public EmbeddedHealthTokenRequest getTokenRequest() {
            EmbeddedHealthTokenRequest embeddedHealthTokenRequest = this.tokenRequest_;
            return embeddedHealthTokenRequest == null ? EmbeddedHealthTokenRequest.getDefaultInstance() : embeddedHealthTokenRequest;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public EmbeddedHealthTokenRequestOrBuilder getTokenRequestOrBuilder() {
            EmbeddedHealthTokenRequest embeddedHealthTokenRequest = this.tokenRequest_;
            return embeddedHealthTokenRequest == null ? EmbeddedHealthTokenRequest.getDefaultInstance() : embeddedHealthTokenRequest;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public EmbeddedHealthTokenResponse getTokenResponse() {
            EmbeddedHealthTokenResponse embeddedHealthTokenResponse = this.tokenResponse_;
            return embeddedHealthTokenResponse == null ? EmbeddedHealthTokenResponse.getDefaultInstance() : embeddedHealthTokenResponse;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public EmbeddedHealthTokenResponseOrBuilder getTokenResponseOrBuilder() {
            EmbeddedHealthTokenResponse embeddedHealthTokenResponse = this.tokenResponse_;
            return embeddedHealthTokenResponse == null ? EmbeddedHealthTokenResponse.getDefaultInstance() : embeddedHealthTokenResponse;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public UpdateSaMDIdRequest getUpdateSamdidRequest() {
            UpdateSaMDIdRequest updateSaMDIdRequest = this.updateSamdidRequest_;
            return updateSaMDIdRequest == null ? UpdateSaMDIdRequest.getDefaultInstance() : updateSaMDIdRequest;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public UpdateSaMDIdRequestOrBuilder getUpdateSamdidRequestOrBuilder() {
            UpdateSaMDIdRequest updateSaMDIdRequest = this.updateSamdidRequest_;
            return updateSaMDIdRequest == null ? UpdateSaMDIdRequest.getDefaultInstance() : updateSaMDIdRequest;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public UpdateSaMDIdResponse getUpdateSamdidResponse() {
            UpdateSaMDIdResponse updateSaMDIdResponse = this.updateSamdidResponse_;
            return updateSaMDIdResponse == null ? UpdateSaMDIdResponse.getDefaultInstance() : updateSaMDIdResponse;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public UpdateSaMDIdResponseOrBuilder getUpdateSamdidResponseOrBuilder() {
            UpdateSaMDIdResponse updateSaMDIdResponse = this.updateSamdidResponse_;
            return updateSaMDIdResponse == null ? UpdateSaMDIdResponse.getDefaultInstance() : updateSaMDIdResponse;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public boolean hasFileXferCompleteNotification() {
            return (this.bitField0_ & 1024) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public boolean hasFileXferPrecheckRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public boolean hasFileXferPrecheckResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public boolean hasFileXferReadyForNext() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public boolean hasFileXferRequest() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public boolean hasFileXferResponse() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public boolean hasInvalidUploadConsent() {
            return (this.bitField0_ & 512) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public boolean hasTokenRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public boolean hasTokenResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public boolean hasUpdateSamdidRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
        public boolean hasUpdateSamdidResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasTokenRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getTokenRequest().hashCode();
            }
            if (hasTokenResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getTokenResponse().hashCode();
            }
            if (hasUpdateSamdidRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getUpdateSamdidRequest().hashCode();
            }
            if (hasUpdateSamdidResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getUpdateSamdidResponse().hashCode();
            }
            if (hasFileXferPrecheckRequest()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getFileXferPrecheckRequest().hashCode();
            }
            if (hasFileXferPrecheckResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getFileXferPrecheckResponse().hashCode();
            }
            if (hasFileXferRequest()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getFileXferRequest().hashCode();
            }
            if (hasFileXferResponse()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getFileXferResponse().hashCode();
            }
            if (hasFileXferReadyForNext()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getFileXferReadyForNext().hashCode();
            }
            if (hasInvalidUploadConsent()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getInvalidUploadConsent().hashCode();
            }
            if (hasFileXferCompleteNotification()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getFileXferCompleteNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminHealth.internal_static_GDI_Proto_GHS_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
            if (hasUpdateSamdidResponse() && !getUpdateSamdidResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasFileXferRequest() || getFileXferRequest().isInitialized()) {
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
                codedOutputStream.writeMessage(1, getTokenRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getTokenResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getUpdateSamdidRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getUpdateSamdidResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getFileXferPrecheckRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getFileXferPrecheckResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getFileXferRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getFileXferResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getFileXferReadyForNext());
            }
            if ((this.bitField0_ & 512) != 0) {
                codedOutputStream.writeMessage(10, getInvalidUploadConsent());
            }
            if ((this.bitField0_ & 1024) != 0) {
                codedOutputStream.writeMessage(11, getFileXferCompleteNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<FileTransferCompleteNotification, FileTransferCompleteNotification.Builder, FileTransferCompleteNotificationOrBuilder> fileXferCompleteNotificationBuilder_;
            private FileTransferCompleteNotification fileXferCompleteNotification_;
            private SingleFieldBuilderV3<FileTransferPrecheckRequest, FileTransferPrecheckRequest.Builder, FileTransferPrecheckRequestOrBuilder> fileXferPrecheckRequestBuilder_;
            private FileTransferPrecheckRequest fileXferPrecheckRequest_;
            private SingleFieldBuilderV3<FileTransferPrecheckResponse, FileTransferPrecheckResponse.Builder, FileTransferPrecheckResponseOrBuilder> fileXferPrecheckResponseBuilder_;
            private FileTransferPrecheckResponse fileXferPrecheckResponse_;
            private SingleFieldBuilderV3<FileTransferReadyForNext, FileTransferReadyForNext.Builder, FileTransferReadyForNextOrBuilder> fileXferReadyForNextBuilder_;
            private FileTransferReadyForNext fileXferReadyForNext_;
            private SingleFieldBuilderV3<FileTransferRequest, FileTransferRequest.Builder, FileTransferRequestOrBuilder> fileXferRequestBuilder_;
            private FileTransferRequest fileXferRequest_;
            private SingleFieldBuilderV3<FileTransferResponse, FileTransferResponse.Builder, FileTransferResponseOrBuilder> fileXferResponseBuilder_;
            private FileTransferResponse fileXferResponse_;
            private SingleFieldBuilderV3<InvalidUploadConsent, InvalidUploadConsent.Builder, InvalidUploadConsentOrBuilder> invalidUploadConsentBuilder_;
            private InvalidUploadConsent invalidUploadConsent_;
            private SingleFieldBuilderV3<EmbeddedHealthTokenRequest, EmbeddedHealthTokenRequest.Builder, EmbeddedHealthTokenRequestOrBuilder> tokenRequestBuilder_;
            private EmbeddedHealthTokenRequest tokenRequest_;
            private SingleFieldBuilderV3<EmbeddedHealthTokenResponse, EmbeddedHealthTokenResponse.Builder, EmbeddedHealthTokenResponseOrBuilder> tokenResponseBuilder_;
            private EmbeddedHealthTokenResponse tokenResponse_;
            private SingleFieldBuilderV3<UpdateSaMDIdRequest, UpdateSaMDIdRequest.Builder, UpdateSaMDIdRequestOrBuilder> updateSamdidRequestBuilder_;
            private UpdateSaMDIdRequest updateSamdidRequest_;
            private SingleFieldBuilderV3<UpdateSaMDIdResponse, UpdateSaMDIdResponse.Builder, UpdateSaMDIdResponseOrBuilder> updateSamdidResponseBuilder_;
            private UpdateSaMDIdResponse updateSamdidResponse_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<EmbeddedHealthTokenRequest, EmbeddedHealthTokenRequest.Builder, EmbeddedHealthTokenRequestOrBuilder> singleFieldBuilderV3 = this.tokenRequestBuilder_;
                    service.tokenRequest_ = singleFieldBuilderV3 == null ? this.tokenRequest_ : (EmbeddedHealthTokenRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<EmbeddedHealthTokenResponse, EmbeddedHealthTokenResponse.Builder, EmbeddedHealthTokenResponseOrBuilder> singleFieldBuilderV4 = this.tokenResponseBuilder_;
                    service.tokenResponse_ = singleFieldBuilderV4 == null ? this.tokenResponse_ : (EmbeddedHealthTokenResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<UpdateSaMDIdRequest, UpdateSaMDIdRequest.Builder, UpdateSaMDIdRequestOrBuilder> singleFieldBuilderV5 = this.updateSamdidRequestBuilder_;
                    service.updateSamdidRequest_ = singleFieldBuilderV5 == null ? this.updateSamdidRequest_ : (UpdateSaMDIdRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<UpdateSaMDIdResponse, UpdateSaMDIdResponse.Builder, UpdateSaMDIdResponseOrBuilder> singleFieldBuilderV6 = this.updateSamdidResponseBuilder_;
                    service.updateSamdidResponse_ = singleFieldBuilderV6 == null ? this.updateSamdidResponse_ : (UpdateSaMDIdResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<FileTransferPrecheckRequest, FileTransferPrecheckRequest.Builder, FileTransferPrecheckRequestOrBuilder> singleFieldBuilderV7 = this.fileXferPrecheckRequestBuilder_;
                    service.fileXferPrecheckRequest_ = singleFieldBuilderV7 == null ? this.fileXferPrecheckRequest_ : (FileTransferPrecheckRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<FileTransferPrecheckResponse, FileTransferPrecheckResponse.Builder, FileTransferPrecheckResponseOrBuilder> singleFieldBuilderV8 = this.fileXferPrecheckResponseBuilder_;
                    service.fileXferPrecheckResponse_ = singleFieldBuilderV8 == null ? this.fileXferPrecheckResponse_ : (FileTransferPrecheckResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<FileTransferRequest, FileTransferRequest.Builder, FileTransferRequestOrBuilder> singleFieldBuilderV9 = this.fileXferRequestBuilder_;
                    service.fileXferRequest_ = singleFieldBuilderV9 == null ? this.fileXferRequest_ : (FileTransferRequest) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<FileTransferResponse, FileTransferResponse.Builder, FileTransferResponseOrBuilder> singleFieldBuilderV10 = this.fileXferResponseBuilder_;
                    service.fileXferResponse_ = singleFieldBuilderV10 == null ? this.fileXferResponse_ : (FileTransferResponse) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<FileTransferReadyForNext, FileTransferReadyForNext.Builder, FileTransferReadyForNextOrBuilder> singleFieldBuilderV11 = this.fileXferReadyForNextBuilder_;
                    service.fileXferReadyForNext_ = singleFieldBuilderV11 == null ? this.fileXferReadyForNext_ : (FileTransferReadyForNext) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                if ((i15 & 512) != 0) {
                    SingleFieldBuilderV3<InvalidUploadConsent, InvalidUploadConsent.Builder, InvalidUploadConsentOrBuilder> singleFieldBuilderV12 = this.invalidUploadConsentBuilder_;
                    service.invalidUploadConsent_ = singleFieldBuilderV12 == null ? this.invalidUploadConsent_ : (InvalidUploadConsent) singleFieldBuilderV12.build();
                    i14 |= 512;
                }
                if ((i15 & 1024) != 0) {
                    SingleFieldBuilderV3<FileTransferCompleteNotification, FileTransferCompleteNotification.Builder, FileTransferCompleteNotificationOrBuilder> singleFieldBuilderV13 = this.fileXferCompleteNotificationBuilder_;
                    service.fileXferCompleteNotification_ = singleFieldBuilderV13 == null ? this.fileXferCompleteNotification_ : (FileTransferCompleteNotification) singleFieldBuilderV13.build();
                    i14 |= 1024;
                }
                service.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_Service_descriptor;
            }

            private SingleFieldBuilderV3<FileTransferCompleteNotification, FileTransferCompleteNotification.Builder, FileTransferCompleteNotificationOrBuilder> getFileXferCompleteNotificationFieldBuilder() {
                if (this.fileXferCompleteNotificationBuilder_ == null) {
                    this.fileXferCompleteNotificationBuilder_ = new SingleFieldBuilderV3<>(getFileXferCompleteNotification(), getParentForChildren(), isClean());
                    this.fileXferCompleteNotification_ = null;
                }
                return this.fileXferCompleteNotificationBuilder_;
            }

            private SingleFieldBuilderV3<FileTransferPrecheckRequest, FileTransferPrecheckRequest.Builder, FileTransferPrecheckRequestOrBuilder> getFileXferPrecheckRequestFieldBuilder() {
                if (this.fileXferPrecheckRequestBuilder_ == null) {
                    this.fileXferPrecheckRequestBuilder_ = new SingleFieldBuilderV3<>(getFileXferPrecheckRequest(), getParentForChildren(), isClean());
                    this.fileXferPrecheckRequest_ = null;
                }
                return this.fileXferPrecheckRequestBuilder_;
            }

            private SingleFieldBuilderV3<FileTransferPrecheckResponse, FileTransferPrecheckResponse.Builder, FileTransferPrecheckResponseOrBuilder> getFileXferPrecheckResponseFieldBuilder() {
                if (this.fileXferPrecheckResponseBuilder_ == null) {
                    this.fileXferPrecheckResponseBuilder_ = new SingleFieldBuilderV3<>(getFileXferPrecheckResponse(), getParentForChildren(), isClean());
                    this.fileXferPrecheckResponse_ = null;
                }
                return this.fileXferPrecheckResponseBuilder_;
            }

            private SingleFieldBuilderV3<FileTransferReadyForNext, FileTransferReadyForNext.Builder, FileTransferReadyForNextOrBuilder> getFileXferReadyForNextFieldBuilder() {
                if (this.fileXferReadyForNextBuilder_ == null) {
                    this.fileXferReadyForNextBuilder_ = new SingleFieldBuilderV3<>(getFileXferReadyForNext(), getParentForChildren(), isClean());
                    this.fileXferReadyForNext_ = null;
                }
                return this.fileXferReadyForNextBuilder_;
            }

            private SingleFieldBuilderV3<FileTransferRequest, FileTransferRequest.Builder, FileTransferRequestOrBuilder> getFileXferRequestFieldBuilder() {
                if (this.fileXferRequestBuilder_ == null) {
                    this.fileXferRequestBuilder_ = new SingleFieldBuilderV3<>(getFileXferRequest(), getParentForChildren(), isClean());
                    this.fileXferRequest_ = null;
                }
                return this.fileXferRequestBuilder_;
            }

            private SingleFieldBuilderV3<FileTransferResponse, FileTransferResponse.Builder, FileTransferResponseOrBuilder> getFileXferResponseFieldBuilder() {
                if (this.fileXferResponseBuilder_ == null) {
                    this.fileXferResponseBuilder_ = new SingleFieldBuilderV3<>(getFileXferResponse(), getParentForChildren(), isClean());
                    this.fileXferResponse_ = null;
                }
                return this.fileXferResponseBuilder_;
            }

            private SingleFieldBuilderV3<InvalidUploadConsent, InvalidUploadConsent.Builder, InvalidUploadConsentOrBuilder> getInvalidUploadConsentFieldBuilder() {
                if (this.invalidUploadConsentBuilder_ == null) {
                    this.invalidUploadConsentBuilder_ = new SingleFieldBuilderV3<>(getInvalidUploadConsent(), getParentForChildren(), isClean());
                    this.invalidUploadConsent_ = null;
                }
                return this.invalidUploadConsentBuilder_;
            }

            private SingleFieldBuilderV3<EmbeddedHealthTokenRequest, EmbeddedHealthTokenRequest.Builder, EmbeddedHealthTokenRequestOrBuilder> getTokenRequestFieldBuilder() {
                if (this.tokenRequestBuilder_ == null) {
                    this.tokenRequestBuilder_ = new SingleFieldBuilderV3<>(getTokenRequest(), getParentForChildren(), isClean());
                    this.tokenRequest_ = null;
                }
                return this.tokenRequestBuilder_;
            }

            private SingleFieldBuilderV3<EmbeddedHealthTokenResponse, EmbeddedHealthTokenResponse.Builder, EmbeddedHealthTokenResponseOrBuilder> getTokenResponseFieldBuilder() {
                if (this.tokenResponseBuilder_ == null) {
                    this.tokenResponseBuilder_ = new SingleFieldBuilderV3<>(getTokenResponse(), getParentForChildren(), isClean());
                    this.tokenResponse_ = null;
                }
                return this.tokenResponseBuilder_;
            }

            private SingleFieldBuilderV3<UpdateSaMDIdRequest, UpdateSaMDIdRequest.Builder, UpdateSaMDIdRequestOrBuilder> getUpdateSamdidRequestFieldBuilder() {
                if (this.updateSamdidRequestBuilder_ == null) {
                    this.updateSamdidRequestBuilder_ = new SingleFieldBuilderV3<>(getUpdateSamdidRequest(), getParentForChildren(), isClean());
                    this.updateSamdidRequest_ = null;
                }
                return this.updateSamdidRequestBuilder_;
            }

            private SingleFieldBuilderV3<UpdateSaMDIdResponse, UpdateSaMDIdResponse.Builder, UpdateSaMDIdResponseOrBuilder> getUpdateSamdidResponseFieldBuilder() {
                if (this.updateSamdidResponseBuilder_ == null) {
                    this.updateSamdidResponseBuilder_ = new SingleFieldBuilderV3<>(getUpdateSamdidResponse(), getParentForChildren(), isClean());
                    this.updateSamdidResponse_ = null;
                }
                return this.updateSamdidResponseBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getTokenRequestFieldBuilder();
                    getTokenResponseFieldBuilder();
                    getUpdateSamdidRequestFieldBuilder();
                    getUpdateSamdidResponseFieldBuilder();
                    getFileXferPrecheckRequestFieldBuilder();
                    getFileXferPrecheckResponseFieldBuilder();
                    getFileXferRequestFieldBuilder();
                    getFileXferResponseFieldBuilder();
                    getFileXferReadyForNextFieldBuilder();
                    getInvalidUploadConsentFieldBuilder();
                    getFileXferCompleteNotificationFieldBuilder();
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
                this.tokenRequest_ = null;
                SingleFieldBuilderV3<EmbeddedHealthTokenRequest, EmbeddedHealthTokenRequest.Builder, EmbeddedHealthTokenRequestOrBuilder> singleFieldBuilderV3 = this.tokenRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.tokenRequestBuilder_ = null;
                }
                this.tokenResponse_ = null;
                SingleFieldBuilderV3<EmbeddedHealthTokenResponse, EmbeddedHealthTokenResponse.Builder, EmbeddedHealthTokenResponseOrBuilder> singleFieldBuilderV4 = this.tokenResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.tokenResponseBuilder_ = null;
                }
                this.updateSamdidRequest_ = null;
                SingleFieldBuilderV3<UpdateSaMDIdRequest, UpdateSaMDIdRequest.Builder, UpdateSaMDIdRequestOrBuilder> singleFieldBuilderV5 = this.updateSamdidRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.updateSamdidRequestBuilder_ = null;
                }
                this.updateSamdidResponse_ = null;
                SingleFieldBuilderV3<UpdateSaMDIdResponse, UpdateSaMDIdResponse.Builder, UpdateSaMDIdResponseOrBuilder> singleFieldBuilderV6 = this.updateSamdidResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.updateSamdidResponseBuilder_ = null;
                }
                this.fileXferPrecheckRequest_ = null;
                SingleFieldBuilderV3<FileTransferPrecheckRequest, FileTransferPrecheckRequest.Builder, FileTransferPrecheckRequestOrBuilder> singleFieldBuilderV7 = this.fileXferPrecheckRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.fileXferPrecheckRequestBuilder_ = null;
                }
                this.fileXferPrecheckResponse_ = null;
                SingleFieldBuilderV3<FileTransferPrecheckResponse, FileTransferPrecheckResponse.Builder, FileTransferPrecheckResponseOrBuilder> singleFieldBuilderV8 = this.fileXferPrecheckResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.fileXferPrecheckResponseBuilder_ = null;
                }
                this.fileXferRequest_ = null;
                SingleFieldBuilderV3<FileTransferRequest, FileTransferRequest.Builder, FileTransferRequestOrBuilder> singleFieldBuilderV9 = this.fileXferRequestBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.fileXferRequestBuilder_ = null;
                }
                this.fileXferResponse_ = null;
                SingleFieldBuilderV3<FileTransferResponse, FileTransferResponse.Builder, FileTransferResponseOrBuilder> singleFieldBuilderV10 = this.fileXferResponseBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.fileXferResponseBuilder_ = null;
                }
                this.fileXferReadyForNext_ = null;
                SingleFieldBuilderV3<FileTransferReadyForNext, FileTransferReadyForNext.Builder, FileTransferReadyForNextOrBuilder> singleFieldBuilderV11 = this.fileXferReadyForNextBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.fileXferReadyForNextBuilder_ = null;
                }
                this.invalidUploadConsent_ = null;
                SingleFieldBuilderV3<InvalidUploadConsent, InvalidUploadConsent.Builder, InvalidUploadConsentOrBuilder> singleFieldBuilderV12 = this.invalidUploadConsentBuilder_;
                if (singleFieldBuilderV12 != null) {
                    singleFieldBuilderV12.dispose();
                    this.invalidUploadConsentBuilder_ = null;
                }
                this.fileXferCompleteNotification_ = null;
                SingleFieldBuilderV3<FileTransferCompleteNotification, FileTransferCompleteNotification.Builder, FileTransferCompleteNotificationOrBuilder> singleFieldBuilderV13 = this.fileXferCompleteNotificationBuilder_;
                if (singleFieldBuilderV13 != null) {
                    singleFieldBuilderV13.dispose();
                    this.fileXferCompleteNotificationBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearFileXferCompleteNotification() {
                this.bitField0_ &= -1025;
                this.fileXferCompleteNotification_ = null;
                SingleFieldBuilderV3<FileTransferCompleteNotification, FileTransferCompleteNotification.Builder, FileTransferCompleteNotificationOrBuilder> singleFieldBuilderV3 = this.fileXferCompleteNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.fileXferCompleteNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearFileXferPrecheckRequest() {
                this.bitField0_ &= -17;
                this.fileXferPrecheckRequest_ = null;
                SingleFieldBuilderV3<FileTransferPrecheckRequest, FileTransferPrecheckRequest.Builder, FileTransferPrecheckRequestOrBuilder> singleFieldBuilderV3 = this.fileXferPrecheckRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.fileXferPrecheckRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearFileXferPrecheckResponse() {
                this.bitField0_ &= -33;
                this.fileXferPrecheckResponse_ = null;
                SingleFieldBuilderV3<FileTransferPrecheckResponse, FileTransferPrecheckResponse.Builder, FileTransferPrecheckResponseOrBuilder> singleFieldBuilderV3 = this.fileXferPrecheckResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.fileXferPrecheckResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearFileXferReadyForNext() {
                this.bitField0_ &= -257;
                this.fileXferReadyForNext_ = null;
                SingleFieldBuilderV3<FileTransferReadyForNext, FileTransferReadyForNext.Builder, FileTransferReadyForNextOrBuilder> singleFieldBuilderV3 = this.fileXferReadyForNextBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.fileXferReadyForNextBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearFileXferRequest() {
                this.bitField0_ &= -65;
                this.fileXferRequest_ = null;
                SingleFieldBuilderV3<FileTransferRequest, FileTransferRequest.Builder, FileTransferRequestOrBuilder> singleFieldBuilderV3 = this.fileXferRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.fileXferRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearFileXferResponse() {
                this.bitField0_ &= -129;
                this.fileXferResponse_ = null;
                SingleFieldBuilderV3<FileTransferResponse, FileTransferResponse.Builder, FileTransferResponseOrBuilder> singleFieldBuilderV3 = this.fileXferResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.fileXferResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearInvalidUploadConsent() {
                this.bitField0_ &= -513;
                this.invalidUploadConsent_ = null;
                SingleFieldBuilderV3<InvalidUploadConsent, InvalidUploadConsent.Builder, InvalidUploadConsentOrBuilder> singleFieldBuilderV3 = this.invalidUploadConsentBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.invalidUploadConsentBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearTokenRequest() {
                this.bitField0_ &= -2;
                this.tokenRequest_ = null;
                SingleFieldBuilderV3<EmbeddedHealthTokenRequest, EmbeddedHealthTokenRequest.Builder, EmbeddedHealthTokenRequestOrBuilder> singleFieldBuilderV3 = this.tokenRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.tokenRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTokenResponse() {
                this.bitField0_ &= -3;
                this.tokenResponse_ = null;
                SingleFieldBuilderV3<EmbeddedHealthTokenResponse, EmbeddedHealthTokenResponse.Builder, EmbeddedHealthTokenResponseOrBuilder> singleFieldBuilderV3 = this.tokenResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.tokenResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUpdateSamdidRequest() {
                this.bitField0_ &= -5;
                this.updateSamdidRequest_ = null;
                SingleFieldBuilderV3<UpdateSaMDIdRequest, UpdateSaMDIdRequest.Builder, UpdateSaMDIdRequestOrBuilder> singleFieldBuilderV3 = this.updateSamdidRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.updateSamdidRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUpdateSamdidResponse() {
                this.bitField0_ &= -9;
                this.updateSamdidResponse_ = null;
                SingleFieldBuilderV3<UpdateSaMDIdResponse, UpdateSaMDIdResponse.Builder, UpdateSaMDIdResponseOrBuilder> singleFieldBuilderV3 = this.updateSamdidResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.updateSamdidResponseBuilder_ = null;
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
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public FileTransferCompleteNotification getFileXferCompleteNotification() {
                SingleFieldBuilderV3<FileTransferCompleteNotification, FileTransferCompleteNotification.Builder, FileTransferCompleteNotificationOrBuilder> singleFieldBuilderV3 = this.fileXferCompleteNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FileTransferCompleteNotification) singleFieldBuilderV3.getMessage();
                }
                FileTransferCompleteNotification fileTransferCompleteNotification = this.fileXferCompleteNotification_;
                return fileTransferCompleteNotification == null ? FileTransferCompleteNotification.getDefaultInstance() : fileTransferCompleteNotification;
            }

            public FileTransferCompleteNotification.Builder getFileXferCompleteNotificationBuilder() {
                this.bitField0_ |= 1024;
                onChanged();
                return (FileTransferCompleteNotification.Builder) getFileXferCompleteNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public FileTransferCompleteNotificationOrBuilder getFileXferCompleteNotificationOrBuilder() {
                SingleFieldBuilderV3<FileTransferCompleteNotification, FileTransferCompleteNotification.Builder, FileTransferCompleteNotificationOrBuilder> singleFieldBuilderV3 = this.fileXferCompleteNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FileTransferCompleteNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FileTransferCompleteNotification fileTransferCompleteNotification = this.fileXferCompleteNotification_;
                return fileTransferCompleteNotification == null ? FileTransferCompleteNotification.getDefaultInstance() : fileTransferCompleteNotification;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public FileTransferPrecheckRequest getFileXferPrecheckRequest() {
                SingleFieldBuilderV3<FileTransferPrecheckRequest, FileTransferPrecheckRequest.Builder, FileTransferPrecheckRequestOrBuilder> singleFieldBuilderV3 = this.fileXferPrecheckRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FileTransferPrecheckRequest) singleFieldBuilderV3.getMessage();
                }
                FileTransferPrecheckRequest fileTransferPrecheckRequest = this.fileXferPrecheckRequest_;
                return fileTransferPrecheckRequest == null ? FileTransferPrecheckRequest.getDefaultInstance() : fileTransferPrecheckRequest;
            }

            public FileTransferPrecheckRequest.Builder getFileXferPrecheckRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (FileTransferPrecheckRequest.Builder) getFileXferPrecheckRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public FileTransferPrecheckRequestOrBuilder getFileXferPrecheckRequestOrBuilder() {
                SingleFieldBuilderV3<FileTransferPrecheckRequest, FileTransferPrecheckRequest.Builder, FileTransferPrecheckRequestOrBuilder> singleFieldBuilderV3 = this.fileXferPrecheckRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FileTransferPrecheckRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FileTransferPrecheckRequest fileTransferPrecheckRequest = this.fileXferPrecheckRequest_;
                return fileTransferPrecheckRequest == null ? FileTransferPrecheckRequest.getDefaultInstance() : fileTransferPrecheckRequest;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public FileTransferPrecheckResponse getFileXferPrecheckResponse() {
                SingleFieldBuilderV3<FileTransferPrecheckResponse, FileTransferPrecheckResponse.Builder, FileTransferPrecheckResponseOrBuilder> singleFieldBuilderV3 = this.fileXferPrecheckResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FileTransferPrecheckResponse) singleFieldBuilderV3.getMessage();
                }
                FileTransferPrecheckResponse fileTransferPrecheckResponse = this.fileXferPrecheckResponse_;
                return fileTransferPrecheckResponse == null ? FileTransferPrecheckResponse.getDefaultInstance() : fileTransferPrecheckResponse;
            }

            public FileTransferPrecheckResponse.Builder getFileXferPrecheckResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (FileTransferPrecheckResponse.Builder) getFileXferPrecheckResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public FileTransferPrecheckResponseOrBuilder getFileXferPrecheckResponseOrBuilder() {
                SingleFieldBuilderV3<FileTransferPrecheckResponse, FileTransferPrecheckResponse.Builder, FileTransferPrecheckResponseOrBuilder> singleFieldBuilderV3 = this.fileXferPrecheckResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FileTransferPrecheckResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FileTransferPrecheckResponse fileTransferPrecheckResponse = this.fileXferPrecheckResponse_;
                return fileTransferPrecheckResponse == null ? FileTransferPrecheckResponse.getDefaultInstance() : fileTransferPrecheckResponse;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public FileTransferReadyForNext getFileXferReadyForNext() {
                SingleFieldBuilderV3<FileTransferReadyForNext, FileTransferReadyForNext.Builder, FileTransferReadyForNextOrBuilder> singleFieldBuilderV3 = this.fileXferReadyForNextBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FileTransferReadyForNext) singleFieldBuilderV3.getMessage();
                }
                FileTransferReadyForNext fileTransferReadyForNext = this.fileXferReadyForNext_;
                return fileTransferReadyForNext == null ? FileTransferReadyForNext.getDefaultInstance() : fileTransferReadyForNext;
            }

            public FileTransferReadyForNext.Builder getFileXferReadyForNextBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (FileTransferReadyForNext.Builder) getFileXferReadyForNextFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public FileTransferReadyForNextOrBuilder getFileXferReadyForNextOrBuilder() {
                SingleFieldBuilderV3<FileTransferReadyForNext, FileTransferReadyForNext.Builder, FileTransferReadyForNextOrBuilder> singleFieldBuilderV3 = this.fileXferReadyForNextBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FileTransferReadyForNextOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FileTransferReadyForNext fileTransferReadyForNext = this.fileXferReadyForNext_;
                return fileTransferReadyForNext == null ? FileTransferReadyForNext.getDefaultInstance() : fileTransferReadyForNext;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public FileTransferRequest getFileXferRequest() {
                SingleFieldBuilderV3<FileTransferRequest, FileTransferRequest.Builder, FileTransferRequestOrBuilder> singleFieldBuilderV3 = this.fileXferRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FileTransferRequest) singleFieldBuilderV3.getMessage();
                }
                FileTransferRequest fileTransferRequest = this.fileXferRequest_;
                return fileTransferRequest == null ? FileTransferRequest.getDefaultInstance() : fileTransferRequest;
            }

            public FileTransferRequest.Builder getFileXferRequestBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (FileTransferRequest.Builder) getFileXferRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public FileTransferRequestOrBuilder getFileXferRequestOrBuilder() {
                SingleFieldBuilderV3<FileTransferRequest, FileTransferRequest.Builder, FileTransferRequestOrBuilder> singleFieldBuilderV3 = this.fileXferRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FileTransferRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FileTransferRequest fileTransferRequest = this.fileXferRequest_;
                return fileTransferRequest == null ? FileTransferRequest.getDefaultInstance() : fileTransferRequest;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public FileTransferResponse getFileXferResponse() {
                SingleFieldBuilderV3<FileTransferResponse, FileTransferResponse.Builder, FileTransferResponseOrBuilder> singleFieldBuilderV3 = this.fileXferResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FileTransferResponse) singleFieldBuilderV3.getMessage();
                }
                FileTransferResponse fileTransferResponse = this.fileXferResponse_;
                return fileTransferResponse == null ? FileTransferResponse.getDefaultInstance() : fileTransferResponse;
            }

            public FileTransferResponse.Builder getFileXferResponseBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (FileTransferResponse.Builder) getFileXferResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public FileTransferResponseOrBuilder getFileXferResponseOrBuilder() {
                SingleFieldBuilderV3<FileTransferResponse, FileTransferResponse.Builder, FileTransferResponseOrBuilder> singleFieldBuilderV3 = this.fileXferResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (FileTransferResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                FileTransferResponse fileTransferResponse = this.fileXferResponse_;
                return fileTransferResponse == null ? FileTransferResponse.getDefaultInstance() : fileTransferResponse;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public InvalidUploadConsent getInvalidUploadConsent() {
                SingleFieldBuilderV3<InvalidUploadConsent, InvalidUploadConsent.Builder, InvalidUploadConsentOrBuilder> singleFieldBuilderV3 = this.invalidUploadConsentBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (InvalidUploadConsent) singleFieldBuilderV3.getMessage();
                }
                InvalidUploadConsent invalidUploadConsent = this.invalidUploadConsent_;
                return invalidUploadConsent == null ? InvalidUploadConsent.getDefaultInstance() : invalidUploadConsent;
            }

            public InvalidUploadConsent.Builder getInvalidUploadConsentBuilder() {
                this.bitField0_ |= 512;
                onChanged();
                return (InvalidUploadConsent.Builder) getInvalidUploadConsentFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public InvalidUploadConsentOrBuilder getInvalidUploadConsentOrBuilder() {
                SingleFieldBuilderV3<InvalidUploadConsent, InvalidUploadConsent.Builder, InvalidUploadConsentOrBuilder> singleFieldBuilderV3 = this.invalidUploadConsentBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (InvalidUploadConsentOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                InvalidUploadConsent invalidUploadConsent = this.invalidUploadConsent_;
                return invalidUploadConsent == null ? InvalidUploadConsent.getDefaultInstance() : invalidUploadConsent;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public EmbeddedHealthTokenRequest getTokenRequest() {
                SingleFieldBuilderV3<EmbeddedHealthTokenRequest, EmbeddedHealthTokenRequest.Builder, EmbeddedHealthTokenRequestOrBuilder> singleFieldBuilderV3 = this.tokenRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EmbeddedHealthTokenRequest) singleFieldBuilderV3.getMessage();
                }
                EmbeddedHealthTokenRequest embeddedHealthTokenRequest = this.tokenRequest_;
                return embeddedHealthTokenRequest == null ? EmbeddedHealthTokenRequest.getDefaultInstance() : embeddedHealthTokenRequest;
            }

            public EmbeddedHealthTokenRequest.Builder getTokenRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (EmbeddedHealthTokenRequest.Builder) getTokenRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public EmbeddedHealthTokenRequestOrBuilder getTokenRequestOrBuilder() {
                SingleFieldBuilderV3<EmbeddedHealthTokenRequest, EmbeddedHealthTokenRequest.Builder, EmbeddedHealthTokenRequestOrBuilder> singleFieldBuilderV3 = this.tokenRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EmbeddedHealthTokenRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EmbeddedHealthTokenRequest embeddedHealthTokenRequest = this.tokenRequest_;
                return embeddedHealthTokenRequest == null ? EmbeddedHealthTokenRequest.getDefaultInstance() : embeddedHealthTokenRequest;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public EmbeddedHealthTokenResponse getTokenResponse() {
                SingleFieldBuilderV3<EmbeddedHealthTokenResponse, EmbeddedHealthTokenResponse.Builder, EmbeddedHealthTokenResponseOrBuilder> singleFieldBuilderV3 = this.tokenResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EmbeddedHealthTokenResponse) singleFieldBuilderV3.getMessage();
                }
                EmbeddedHealthTokenResponse embeddedHealthTokenResponse = this.tokenResponse_;
                return embeddedHealthTokenResponse == null ? EmbeddedHealthTokenResponse.getDefaultInstance() : embeddedHealthTokenResponse;
            }

            public EmbeddedHealthTokenResponse.Builder getTokenResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (EmbeddedHealthTokenResponse.Builder) getTokenResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public EmbeddedHealthTokenResponseOrBuilder getTokenResponseOrBuilder() {
                SingleFieldBuilderV3<EmbeddedHealthTokenResponse, EmbeddedHealthTokenResponse.Builder, EmbeddedHealthTokenResponseOrBuilder> singleFieldBuilderV3 = this.tokenResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (EmbeddedHealthTokenResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                EmbeddedHealthTokenResponse embeddedHealthTokenResponse = this.tokenResponse_;
                return embeddedHealthTokenResponse == null ? EmbeddedHealthTokenResponse.getDefaultInstance() : embeddedHealthTokenResponse;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public UpdateSaMDIdRequest getUpdateSamdidRequest() {
                SingleFieldBuilderV3<UpdateSaMDIdRequest, UpdateSaMDIdRequest.Builder, UpdateSaMDIdRequestOrBuilder> singleFieldBuilderV3 = this.updateSamdidRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateSaMDIdRequest) singleFieldBuilderV3.getMessage();
                }
                UpdateSaMDIdRequest updateSaMDIdRequest = this.updateSamdidRequest_;
                return updateSaMDIdRequest == null ? UpdateSaMDIdRequest.getDefaultInstance() : updateSaMDIdRequest;
            }

            public UpdateSaMDIdRequest.Builder getUpdateSamdidRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (UpdateSaMDIdRequest.Builder) getUpdateSamdidRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public UpdateSaMDIdRequestOrBuilder getUpdateSamdidRequestOrBuilder() {
                SingleFieldBuilderV3<UpdateSaMDIdRequest, UpdateSaMDIdRequest.Builder, UpdateSaMDIdRequestOrBuilder> singleFieldBuilderV3 = this.updateSamdidRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateSaMDIdRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UpdateSaMDIdRequest updateSaMDIdRequest = this.updateSamdidRequest_;
                return updateSaMDIdRequest == null ? UpdateSaMDIdRequest.getDefaultInstance() : updateSaMDIdRequest;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public UpdateSaMDIdResponse getUpdateSamdidResponse() {
                SingleFieldBuilderV3<UpdateSaMDIdResponse, UpdateSaMDIdResponse.Builder, UpdateSaMDIdResponseOrBuilder> singleFieldBuilderV3 = this.updateSamdidResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateSaMDIdResponse) singleFieldBuilderV3.getMessage();
                }
                UpdateSaMDIdResponse updateSaMDIdResponse = this.updateSamdidResponse_;
                return updateSaMDIdResponse == null ? UpdateSaMDIdResponse.getDefaultInstance() : updateSaMDIdResponse;
            }

            public UpdateSaMDIdResponse.Builder getUpdateSamdidResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (UpdateSaMDIdResponse.Builder) getUpdateSamdidResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public UpdateSaMDIdResponseOrBuilder getUpdateSamdidResponseOrBuilder() {
                SingleFieldBuilderV3<UpdateSaMDIdResponse, UpdateSaMDIdResponse.Builder, UpdateSaMDIdResponseOrBuilder> singleFieldBuilderV3 = this.updateSamdidResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (UpdateSaMDIdResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                UpdateSaMDIdResponse updateSaMDIdResponse = this.updateSamdidResponse_;
                return updateSaMDIdResponse == null ? UpdateSaMDIdResponse.getDefaultInstance() : updateSaMDIdResponse;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public boolean hasFileXferCompleteNotification() {
                return (this.bitField0_ & 1024) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public boolean hasFileXferPrecheckRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public boolean hasFileXferPrecheckResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public boolean hasFileXferReadyForNext() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public boolean hasFileXferRequest() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public boolean hasFileXferResponse() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public boolean hasInvalidUploadConsent() {
                return (this.bitField0_ & 512) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public boolean hasTokenRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public boolean hasTokenResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public boolean hasUpdateSamdidRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.ServiceOrBuilder
            public boolean hasUpdateSamdidResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasUpdateSamdidResponse() || getUpdateSamdidResponse().isInitialized()) {
                    return !hasFileXferRequest() || getFileXferRequest().isInitialized();
                }
                return false;
            }

            public Builder mergeFileXferCompleteNotification(FileTransferCompleteNotification fileTransferCompleteNotification) {
                FileTransferCompleteNotification fileTransferCompleteNotification2;
                SingleFieldBuilderV3<FileTransferCompleteNotification, FileTransferCompleteNotification.Builder, FileTransferCompleteNotificationOrBuilder> singleFieldBuilderV3 = this.fileXferCompleteNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(fileTransferCompleteNotification);
                } else if ((this.bitField0_ & 1024) == 0 || (fileTransferCompleteNotification2 = this.fileXferCompleteNotification_) == null || fileTransferCompleteNotification2 == FileTransferCompleteNotification.getDefaultInstance()) {
                    this.fileXferCompleteNotification_ = fileTransferCompleteNotification;
                } else {
                    getFileXferCompleteNotificationBuilder().mergeFrom(fileTransferCompleteNotification);
                }
                if (this.fileXferCompleteNotification_ != null) {
                    this.bitField0_ |= 1024;
                    onChanged();
                }
                return this;
            }

            public Builder mergeFileXferPrecheckRequest(FileTransferPrecheckRequest fileTransferPrecheckRequest) {
                FileTransferPrecheckRequest fileTransferPrecheckRequest2;
                SingleFieldBuilderV3<FileTransferPrecheckRequest, FileTransferPrecheckRequest.Builder, FileTransferPrecheckRequestOrBuilder> singleFieldBuilderV3 = this.fileXferPrecheckRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(fileTransferPrecheckRequest);
                } else if ((this.bitField0_ & 16) == 0 || (fileTransferPrecheckRequest2 = this.fileXferPrecheckRequest_) == null || fileTransferPrecheckRequest2 == FileTransferPrecheckRequest.getDefaultInstance()) {
                    this.fileXferPrecheckRequest_ = fileTransferPrecheckRequest;
                } else {
                    getFileXferPrecheckRequestBuilder().mergeFrom(fileTransferPrecheckRequest);
                }
                if (this.fileXferPrecheckRequest_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeFileXferPrecheckResponse(FileTransferPrecheckResponse fileTransferPrecheckResponse) {
                FileTransferPrecheckResponse fileTransferPrecheckResponse2;
                SingleFieldBuilderV3<FileTransferPrecheckResponse, FileTransferPrecheckResponse.Builder, FileTransferPrecheckResponseOrBuilder> singleFieldBuilderV3 = this.fileXferPrecheckResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(fileTransferPrecheckResponse);
                } else if ((this.bitField0_ & 32) == 0 || (fileTransferPrecheckResponse2 = this.fileXferPrecheckResponse_) == null || fileTransferPrecheckResponse2 == FileTransferPrecheckResponse.getDefaultInstance()) {
                    this.fileXferPrecheckResponse_ = fileTransferPrecheckResponse;
                } else {
                    getFileXferPrecheckResponseBuilder().mergeFrom(fileTransferPrecheckResponse);
                }
                if (this.fileXferPrecheckResponse_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeFileXferReadyForNext(FileTransferReadyForNext fileTransferReadyForNext) {
                FileTransferReadyForNext fileTransferReadyForNext2;
                SingleFieldBuilderV3<FileTransferReadyForNext, FileTransferReadyForNext.Builder, FileTransferReadyForNextOrBuilder> singleFieldBuilderV3 = this.fileXferReadyForNextBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(fileTransferReadyForNext);
                } else if ((this.bitField0_ & 256) == 0 || (fileTransferReadyForNext2 = this.fileXferReadyForNext_) == null || fileTransferReadyForNext2 == FileTransferReadyForNext.getDefaultInstance()) {
                    this.fileXferReadyForNext_ = fileTransferReadyForNext;
                } else {
                    getFileXferReadyForNextBuilder().mergeFrom(fileTransferReadyForNext);
                }
                if (this.fileXferReadyForNext_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergeFileXferRequest(FileTransferRequest fileTransferRequest) {
                FileTransferRequest fileTransferRequest2;
                SingleFieldBuilderV3<FileTransferRequest, FileTransferRequest.Builder, FileTransferRequestOrBuilder> singleFieldBuilderV3 = this.fileXferRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(fileTransferRequest);
                } else if ((this.bitField0_ & 64) == 0 || (fileTransferRequest2 = this.fileXferRequest_) == null || fileTransferRequest2 == FileTransferRequest.getDefaultInstance()) {
                    this.fileXferRequest_ = fileTransferRequest;
                } else {
                    getFileXferRequestBuilder().mergeFrom(fileTransferRequest);
                }
                if (this.fileXferRequest_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeFileXferResponse(FileTransferResponse fileTransferResponse) {
                FileTransferResponse fileTransferResponse2;
                SingleFieldBuilderV3<FileTransferResponse, FileTransferResponse.Builder, FileTransferResponseOrBuilder> singleFieldBuilderV3 = this.fileXferResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(fileTransferResponse);
                } else if ((this.bitField0_ & 128) == 0 || (fileTransferResponse2 = this.fileXferResponse_) == null || fileTransferResponse2 == FileTransferResponse.getDefaultInstance()) {
                    this.fileXferResponse_ = fileTransferResponse;
                } else {
                    getFileXferResponseBuilder().mergeFrom(fileTransferResponse);
                }
                if (this.fileXferResponse_ != null) {
                    this.bitField0_ |= 128;
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
                            switch (tag) {
                                case 0:
                                    break;
                                case 10:
                                    codedInputStream.readMessage(getTokenRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                    continue;
                                case 18:
                                    codedInputStream.readMessage(getTokenResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                    continue;
                                case 26:
                                    codedInputStream.readMessage(getUpdateSamdidRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                    continue;
                                case 34:
                                    codedInputStream.readMessage(getUpdateSamdidResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                    continue;
                                case 42:
                                    codedInputStream.readMessage(getFileXferPrecheckRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                    continue;
                                case 50:
                                    codedInputStream.readMessage(getFileXferPrecheckResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                    continue;
                                case 58:
                                    codedInputStream.readMessage(getFileXferRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                    continue;
                                case 66:
                                    codedInputStream.readMessage(getFileXferResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                    continue;
                                case 74:
                                    codedInputStream.readMessage(getFileXferReadyForNextFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 256;
                                    continue;
                                case 82:
                                    codedInputStream.readMessage(getInvalidUploadConsentFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 512;
                                    continue;
                                case 90:
                                    codedInputStream.readMessage(getFileXferCompleteNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1024;
                                    continue;
                                default:
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                        break;
                                    }
                                    break;
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

            public Builder mergeInvalidUploadConsent(InvalidUploadConsent invalidUploadConsent) {
                InvalidUploadConsent invalidUploadConsent2;
                SingleFieldBuilderV3<InvalidUploadConsent, InvalidUploadConsent.Builder, InvalidUploadConsentOrBuilder> singleFieldBuilderV3 = this.invalidUploadConsentBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(invalidUploadConsent);
                } else if ((this.bitField0_ & 512) == 0 || (invalidUploadConsent2 = this.invalidUploadConsent_) == null || invalidUploadConsent2 == InvalidUploadConsent.getDefaultInstance()) {
                    this.invalidUploadConsent_ = invalidUploadConsent;
                } else {
                    getInvalidUploadConsentBuilder().mergeFrom(invalidUploadConsent);
                }
                if (this.invalidUploadConsent_ != null) {
                    this.bitField0_ |= 512;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTokenRequest(EmbeddedHealthTokenRequest embeddedHealthTokenRequest) {
                EmbeddedHealthTokenRequest embeddedHealthTokenRequest2;
                SingleFieldBuilderV3<EmbeddedHealthTokenRequest, EmbeddedHealthTokenRequest.Builder, EmbeddedHealthTokenRequestOrBuilder> singleFieldBuilderV3 = this.tokenRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(embeddedHealthTokenRequest);
                } else if ((this.bitField0_ & 1) == 0 || (embeddedHealthTokenRequest2 = this.tokenRequest_) == null || embeddedHealthTokenRequest2 == EmbeddedHealthTokenRequest.getDefaultInstance()) {
                    this.tokenRequest_ = embeddedHealthTokenRequest;
                } else {
                    getTokenRequestBuilder().mergeFrom(embeddedHealthTokenRequest);
                }
                if (this.tokenRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTokenResponse(EmbeddedHealthTokenResponse embeddedHealthTokenResponse) {
                EmbeddedHealthTokenResponse embeddedHealthTokenResponse2;
                SingleFieldBuilderV3<EmbeddedHealthTokenResponse, EmbeddedHealthTokenResponse.Builder, EmbeddedHealthTokenResponseOrBuilder> singleFieldBuilderV3 = this.tokenResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(embeddedHealthTokenResponse);
                } else if ((this.bitField0_ & 2) == 0 || (embeddedHealthTokenResponse2 = this.tokenResponse_) == null || embeddedHealthTokenResponse2 == EmbeddedHealthTokenResponse.getDefaultInstance()) {
                    this.tokenResponse_ = embeddedHealthTokenResponse;
                } else {
                    getTokenResponseBuilder().mergeFrom(embeddedHealthTokenResponse);
                }
                if (this.tokenResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder mergeUpdateSamdidRequest(UpdateSaMDIdRequest updateSaMDIdRequest) {
                UpdateSaMDIdRequest updateSaMDIdRequest2;
                SingleFieldBuilderV3<UpdateSaMDIdRequest, UpdateSaMDIdRequest.Builder, UpdateSaMDIdRequestOrBuilder> singleFieldBuilderV3 = this.updateSamdidRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(updateSaMDIdRequest);
                } else if ((this.bitField0_ & 4) == 0 || (updateSaMDIdRequest2 = this.updateSamdidRequest_) == null || updateSaMDIdRequest2 == UpdateSaMDIdRequest.getDefaultInstance()) {
                    this.updateSamdidRequest_ = updateSaMDIdRequest;
                } else {
                    getUpdateSamdidRequestBuilder().mergeFrom(updateSaMDIdRequest);
                }
                if (this.updateSamdidRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeUpdateSamdidResponse(UpdateSaMDIdResponse updateSaMDIdResponse) {
                UpdateSaMDIdResponse updateSaMDIdResponse2;
                SingleFieldBuilderV3<UpdateSaMDIdResponse, UpdateSaMDIdResponse.Builder, UpdateSaMDIdResponseOrBuilder> singleFieldBuilderV3 = this.updateSamdidResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(updateSaMDIdResponse);
                } else if ((this.bitField0_ & 8) == 0 || (updateSaMDIdResponse2 = this.updateSamdidResponse_) == null || updateSaMDIdResponse2 == UpdateSaMDIdResponse.getDefaultInstance()) {
                    this.updateSamdidResponse_ = updateSaMDIdResponse;
                } else {
                    getUpdateSamdidResponseBuilder().mergeFrom(updateSaMDIdResponse);
                }
                if (this.updateSamdidResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setFileXferCompleteNotification(FileTransferCompleteNotification.Builder builder) {
                SingleFieldBuilderV3<FileTransferCompleteNotification, FileTransferCompleteNotification.Builder, FileTransferCompleteNotificationOrBuilder> singleFieldBuilderV3 = this.fileXferCompleteNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.fileXferCompleteNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setFileXferPrecheckRequest(FileTransferPrecheckRequest.Builder builder) {
                SingleFieldBuilderV3<FileTransferPrecheckRequest, FileTransferPrecheckRequest.Builder, FileTransferPrecheckRequestOrBuilder> singleFieldBuilderV3 = this.fileXferPrecheckRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.fileXferPrecheckRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setFileXferPrecheckResponse(FileTransferPrecheckResponse.Builder builder) {
                SingleFieldBuilderV3<FileTransferPrecheckResponse, FileTransferPrecheckResponse.Builder, FileTransferPrecheckResponseOrBuilder> singleFieldBuilderV3 = this.fileXferPrecheckResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.fileXferPrecheckResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setFileXferReadyForNext(FileTransferReadyForNext.Builder builder) {
                SingleFieldBuilderV3<FileTransferReadyForNext, FileTransferReadyForNext.Builder, FileTransferReadyForNextOrBuilder> singleFieldBuilderV3 = this.fileXferReadyForNextBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.fileXferReadyForNext_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setFileXferRequest(FileTransferRequest.Builder builder) {
                SingleFieldBuilderV3<FileTransferRequest, FileTransferRequest.Builder, FileTransferRequestOrBuilder> singleFieldBuilderV3 = this.fileXferRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.fileXferRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setFileXferResponse(FileTransferResponse.Builder builder) {
                SingleFieldBuilderV3<FileTransferResponse, FileTransferResponse.Builder, FileTransferResponseOrBuilder> singleFieldBuilderV3 = this.fileXferResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.fileXferResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setInvalidUploadConsent(InvalidUploadConsent.Builder builder) {
                SingleFieldBuilderV3<InvalidUploadConsent, InvalidUploadConsent.Builder, InvalidUploadConsentOrBuilder> singleFieldBuilderV3 = this.invalidUploadConsentBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.invalidUploadConsent_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setTokenRequest(EmbeddedHealthTokenRequest.Builder builder) {
                SingleFieldBuilderV3<EmbeddedHealthTokenRequest, EmbeddedHealthTokenRequest.Builder, EmbeddedHealthTokenRequestOrBuilder> singleFieldBuilderV3 = this.tokenRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.tokenRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTokenResponse(EmbeddedHealthTokenResponse.Builder builder) {
                SingleFieldBuilderV3<EmbeddedHealthTokenResponse, EmbeddedHealthTokenResponse.Builder, EmbeddedHealthTokenResponseOrBuilder> singleFieldBuilderV3 = this.tokenResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.tokenResponse_ = builder.build();
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

            public Builder setUpdateSamdidRequest(UpdateSaMDIdRequest.Builder builder) {
                SingleFieldBuilderV3<UpdateSaMDIdRequest, UpdateSaMDIdRequest.Builder, UpdateSaMDIdRequestOrBuilder> singleFieldBuilderV3 = this.updateSamdidRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.updateSamdidRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setUpdateSamdidResponse(UpdateSaMDIdResponse.Builder builder) {
                SingleFieldBuilderV3<UpdateSaMDIdResponse, UpdateSaMDIdResponse.Builder, UpdateSaMDIdResponseOrBuilder> singleFieldBuilderV3 = this.updateSamdidResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.updateSamdidResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
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

            public Builder setFileXferCompleteNotification(FileTransferCompleteNotification fileTransferCompleteNotification) {
                SingleFieldBuilderV3<FileTransferCompleteNotification, FileTransferCompleteNotification.Builder, FileTransferCompleteNotificationOrBuilder> singleFieldBuilderV3 = this.fileXferCompleteNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    fileTransferCompleteNotification.getClass();
                    this.fileXferCompleteNotification_ = fileTransferCompleteNotification;
                } else {
                    singleFieldBuilderV3.setMessage(fileTransferCompleteNotification);
                }
                this.bitField0_ |= 1024;
                onChanged();
                return this;
            }

            public Builder setFileXferPrecheckRequest(FileTransferPrecheckRequest fileTransferPrecheckRequest) {
                SingleFieldBuilderV3<FileTransferPrecheckRequest, FileTransferPrecheckRequest.Builder, FileTransferPrecheckRequestOrBuilder> singleFieldBuilderV3 = this.fileXferPrecheckRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    fileTransferPrecheckRequest.getClass();
                    this.fileXferPrecheckRequest_ = fileTransferPrecheckRequest;
                } else {
                    singleFieldBuilderV3.setMessage(fileTransferPrecheckRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setFileXferPrecheckResponse(FileTransferPrecheckResponse fileTransferPrecheckResponse) {
                SingleFieldBuilderV3<FileTransferPrecheckResponse, FileTransferPrecheckResponse.Builder, FileTransferPrecheckResponseOrBuilder> singleFieldBuilderV3 = this.fileXferPrecheckResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    fileTransferPrecheckResponse.getClass();
                    this.fileXferPrecheckResponse_ = fileTransferPrecheckResponse;
                } else {
                    singleFieldBuilderV3.setMessage(fileTransferPrecheckResponse);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setFileXferReadyForNext(FileTransferReadyForNext fileTransferReadyForNext) {
                SingleFieldBuilderV3<FileTransferReadyForNext, FileTransferReadyForNext.Builder, FileTransferReadyForNextOrBuilder> singleFieldBuilderV3 = this.fileXferReadyForNextBuilder_;
                if (singleFieldBuilderV3 == null) {
                    fileTransferReadyForNext.getClass();
                    this.fileXferReadyForNext_ = fileTransferReadyForNext;
                } else {
                    singleFieldBuilderV3.setMessage(fileTransferReadyForNext);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setFileXferRequest(FileTransferRequest fileTransferRequest) {
                SingleFieldBuilderV3<FileTransferRequest, FileTransferRequest.Builder, FileTransferRequestOrBuilder> singleFieldBuilderV3 = this.fileXferRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    fileTransferRequest.getClass();
                    this.fileXferRequest_ = fileTransferRequest;
                } else {
                    singleFieldBuilderV3.setMessage(fileTransferRequest);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setFileXferResponse(FileTransferResponse fileTransferResponse) {
                SingleFieldBuilderV3<FileTransferResponse, FileTransferResponse.Builder, FileTransferResponseOrBuilder> singleFieldBuilderV3 = this.fileXferResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    fileTransferResponse.getClass();
                    this.fileXferResponse_ = fileTransferResponse;
                } else {
                    singleFieldBuilderV3.setMessage(fileTransferResponse);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setInvalidUploadConsent(InvalidUploadConsent invalidUploadConsent) {
                SingleFieldBuilderV3<InvalidUploadConsent, InvalidUploadConsent.Builder, InvalidUploadConsentOrBuilder> singleFieldBuilderV3 = this.invalidUploadConsentBuilder_;
                if (singleFieldBuilderV3 == null) {
                    invalidUploadConsent.getClass();
                    this.invalidUploadConsent_ = invalidUploadConsent;
                } else {
                    singleFieldBuilderV3.setMessage(invalidUploadConsent);
                }
                this.bitField0_ |= 512;
                onChanged();
                return this;
            }

            public Builder setTokenRequest(EmbeddedHealthTokenRequest embeddedHealthTokenRequest) {
                SingleFieldBuilderV3<EmbeddedHealthTokenRequest, EmbeddedHealthTokenRequest.Builder, EmbeddedHealthTokenRequestOrBuilder> singleFieldBuilderV3 = this.tokenRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    embeddedHealthTokenRequest.getClass();
                    this.tokenRequest_ = embeddedHealthTokenRequest;
                } else {
                    singleFieldBuilderV3.setMessage(embeddedHealthTokenRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setTokenResponse(EmbeddedHealthTokenResponse embeddedHealthTokenResponse) {
                SingleFieldBuilderV3<EmbeddedHealthTokenResponse, EmbeddedHealthTokenResponse.Builder, EmbeddedHealthTokenResponseOrBuilder> singleFieldBuilderV3 = this.tokenResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    embeddedHealthTokenResponse.getClass();
                    this.tokenResponse_ = embeddedHealthTokenResponse;
                } else {
                    singleFieldBuilderV3.setMessage(embeddedHealthTokenResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setUpdateSamdidRequest(UpdateSaMDIdRequest updateSaMDIdRequest) {
                SingleFieldBuilderV3<UpdateSaMDIdRequest, UpdateSaMDIdRequest.Builder, UpdateSaMDIdRequestOrBuilder> singleFieldBuilderV3 = this.updateSamdidRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    updateSaMDIdRequest.getClass();
                    this.updateSamdidRequest_ = updateSaMDIdRequest;
                } else {
                    singleFieldBuilderV3.setMessage(updateSaMDIdRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setUpdateSamdidResponse(UpdateSaMDIdResponse updateSaMDIdResponse) {
                SingleFieldBuilderV3<UpdateSaMDIdResponse, UpdateSaMDIdResponse.Builder, UpdateSaMDIdResponseOrBuilder> singleFieldBuilderV3 = this.updateSamdidResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    updateSaMDIdResponse.getClass();
                    this.updateSamdidResponse_ = updateSaMDIdResponse;
                } else {
                    singleFieldBuilderV3.setMessage(updateSaMDIdResponse);
                }
                this.bitField0_ |= 8;
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
                if (service.hasTokenRequest()) {
                    mergeTokenRequest(service.getTokenRequest());
                }
                if (service.hasTokenResponse()) {
                    mergeTokenResponse(service.getTokenResponse());
                }
                if (service.hasUpdateSamdidRequest()) {
                    mergeUpdateSamdidRequest(service.getUpdateSamdidRequest());
                }
                if (service.hasUpdateSamdidResponse()) {
                    mergeUpdateSamdidResponse(service.getUpdateSamdidResponse());
                }
                if (service.hasFileXferPrecheckRequest()) {
                    mergeFileXferPrecheckRequest(service.getFileXferPrecheckRequest());
                }
                if (service.hasFileXferPrecheckResponse()) {
                    mergeFileXferPrecheckResponse(service.getFileXferPrecheckResponse());
                }
                if (service.hasFileXferRequest()) {
                    mergeFileXferRequest(service.getFileXferRequest());
                }
                if (service.hasFileXferResponse()) {
                    mergeFileXferResponse(service.getFileXferResponse());
                }
                if (service.hasFileXferReadyForNext()) {
                    mergeFileXferReadyForNext(service.getFileXferReadyForNext());
                }
                if (service.hasInvalidUploadConsent()) {
                    mergeInvalidUploadConsent(service.getInvalidUploadConsent());
                }
                if (service.hasFileXferCompleteNotification()) {
                    mergeFileXferCompleteNotification(service.getFileXferCompleteNotification());
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

    public static final class UpdateSaMDIdRequest extends GeneratedMessageV3 implements UpdateSaMDIdRequestOrBuilder {
        private static final UpdateSaMDIdRequest DEFAULT_INSTANCE = new UpdateSaMDIdRequest();

        @Deprecated
        public static final Parser<UpdateSaMDIdRequest> PARSER = new AbstractParser<UpdateSaMDIdRequest>() { // from class: com.garmin.proto.generated.GDIGarminHealth.UpdateSaMDIdRequest.1
            @Override // com.google.protobuf.Parser
            public UpdateSaMDIdRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = UpdateSaMDIdRequest.newBuilder();
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
        public static final int SAMD_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private volatile Object samdId_;

        private UpdateSaMDIdRequest() {
            this.samdId_ = "";
            this.memoizedIsInitialized = (byte) -1;
            this.samdId_ = "";
        }

        public static UpdateSaMDIdRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminHealth.internal_static_GDI_Proto_GHS_UpdateSaMDIdRequest_descriptor;
        }

        public static Builder newBuilder(UpdateSaMDIdRequest updateSaMDIdRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(updateSaMDIdRequest);
        }

        public static UpdateSaMDIdRequest parseDelimitedFrom(InputStream inputStream) {
            return (UpdateSaMDIdRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static UpdateSaMDIdRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<UpdateSaMDIdRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof UpdateSaMDIdRequest)) {
                return super.equals(obj);
            }
            UpdateSaMDIdRequest updateSaMDIdRequest = (UpdateSaMDIdRequest) obj;
            if (hasSamdId() != updateSaMDIdRequest.hasSamdId()) {
                return false;
            }
            return (!hasSamdId() || getSamdId().equals(updateSaMDIdRequest.getSamdId())) && getUnknownFields().equals(updateSaMDIdRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<UpdateSaMDIdRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.UpdateSaMDIdRequestOrBuilder
        public String getSamdId() {
            Object obj = this.samdId_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.samdId_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.UpdateSaMDIdRequestOrBuilder
        public ByteString getSamdIdBytes() {
            Object obj = this.samdId_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.samdId_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.samdId_) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGarminHealth.UpdateSaMDIdRequestOrBuilder
        public boolean hasSamdId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSamdId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSamdId().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminHealth.internal_static_GDI_Proto_GHS_UpdateSaMDIdRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateSaMDIdRequest.class, Builder.class);
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
            return new UpdateSaMDIdRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.samdId_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements UpdateSaMDIdRequestOrBuilder {
            private int bitField0_;
            private Object samdId_;

            private Builder() {
                this.samdId_ = "";
            }

            private void buildPartial0(UpdateSaMDIdRequest updateSaMDIdRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    updateSaMDIdRequest.samdId_ = this.samdId_;
                } else {
                    i14 = 0;
                }
                updateSaMDIdRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_UpdateSaMDIdRequest_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateSaMDIdRequest build() {
                UpdateSaMDIdRequest updateSaMDIdRequestBuildPartial = buildPartial();
                if (updateSaMDIdRequestBuildPartial.isInitialized()) {
                    return updateSaMDIdRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) updateSaMDIdRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public UpdateSaMDIdRequest buildPartial() {
                UpdateSaMDIdRequest updateSaMDIdRequest = new UpdateSaMDIdRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(updateSaMDIdRequest);
                }
                onBuilt();
                return updateSaMDIdRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.samdId_ = "";
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

            public Builder clearSamdId() {
                this.samdId_ = UpdateSaMDIdRequest.getDefaultInstance().getSamdId();
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
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_UpdateSaMDIdRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.UpdateSaMDIdRequestOrBuilder
            public String getSamdId() {
                Object obj = this.samdId_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.samdId_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.UpdateSaMDIdRequestOrBuilder
            public ByteString getSamdIdBytes() {
                Object obj = this.samdId_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.samdId_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIGarminHealth.UpdateSaMDIdRequestOrBuilder
            public boolean hasSamdId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminHealth.internal_static_GDI_Proto_GHS_UpdateSaMDIdRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(UpdateSaMDIdRequest.class, Builder.class);
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
                                    this.samdId_ = codedInputStream.readBytes();
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

            public Builder setSamdId(String str) {
                str.getClass();
                this.samdId_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setSamdIdBytes(ByteString byteString) {
                byteString.getClass();
                this.samdId_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public UpdateSaMDIdRequest getDefaultInstanceForType() {
                return UpdateSaMDIdRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.samdId_ = "";
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof UpdateSaMDIdRequest) {
                    return mergeFrom((UpdateSaMDIdRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(UpdateSaMDIdRequest updateSaMDIdRequest) {
                if (updateSaMDIdRequest == UpdateSaMDIdRequest.getDefaultInstance()) {
                    return this;
                }
                if (updateSaMDIdRequest.hasSamdId()) {
                    this.samdId_ = updateSaMDIdRequest.samdId_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                mergeUnknownFields(updateSaMDIdRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public UpdateSaMDIdRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static UpdateSaMDIdRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateSaMDIdRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateSaMDIdRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static UpdateSaMDIdRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static UpdateSaMDIdRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static UpdateSaMDIdRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private UpdateSaMDIdRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.samdId_ = "";
            this.memoizedIsInitialized = (byte) -1;
        }

        public static UpdateSaMDIdRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static UpdateSaMDIdRequest parseFrom(InputStream inputStream) {
            return (UpdateSaMDIdRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ UpdateSaMDIdRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static UpdateSaMDIdRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateSaMDIdRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static UpdateSaMDIdRequest parseFrom(CodedInputStream codedInputStream) {
            return (UpdateSaMDIdRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static UpdateSaMDIdRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (UpdateSaMDIdRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
