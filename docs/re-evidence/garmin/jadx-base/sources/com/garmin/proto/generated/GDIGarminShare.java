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
public final class GDIGarminShare {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u0014GDIGarminShare.proto\u0012\u0015GDI.Proto.GarminShare\u001a\u0012GDIDataTypes.proto\"ð\u0005\n\u0007Service\u0012G\n\u0014consent_link_request\u0018\u0001 \u0001(\u000b2).GDI.Proto.GarminShare.ConsentLinkRequest\u0012I\n\u0015consent_link_response\u0018\u0002 \u0001(\u000b2*.GDI.Proto.GarminShare.ConsentLinkResponse\u0012\\\n\u001fsupported_receive_types_request\u0018\u0003 \u0001(\u000b23.GDI.Proto.GarminShare.SupportedReceiveTypesRequest\u0012^\n supported_receive_types_response\u0018\u0004 \u0001(\u000b24.GDI.Proto.GarminShare.SupportedReceiveTypesResponse\u0012E\n\u0013share_items_request\u0018\u0005 \u0001(\u000b2(.GDI.Proto.GarminShare.ShareItemsRequest\u0012G\n\u0014share_items_response\u0018\u0006 \u0001(\u000b2).GDI.Proto.GarminShare.ShareItemsResponse\u0012U\n\u001btransfer_start_notification\u0018\u0007 \u0001(\u000b20.GDI.Proto.GarminShare.TransferStartNotification\u0012T\n\u001bitems_status_update_request\u0018\b \u0001(\u000b2/.GDI.Proto.GarminShare.ItemsStatusUpdateRequest\u0012V\n\u001citems_status_update_response\u0018\t \u0001(\u000b20.GDI.Proto.GarminShare.ItemsStatusUpdateResponse\"F\n\u0012ConsentLinkRequest\u00120\n\rconnection_id\u0018\u0001 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\"\u008b\u0001\n\u0013ConsentLinkResponse\u0012A\n\u0006status\u0018\u0001 \u0001(\u000e21.GDI.Proto.GarminShare.ConsentLinkResponse.Status\"1\n\u0006Status\u0012\f\n\bACCEPTED\u0010\u0001\u0012\u0019\n\u0015UNKNOWN_CONNECTION_ID\u0010\u0002\"B\n\tShareType\u0012\u0012\n\nidentifier\u0018\u0001 \u0001(\t\u0012!\n\u0019supported_receive_formats\u0018\u0002 \u0003(\t\"U\n\u001cSupportedReceiveTypesRequest\u00125\n\u000bshare_types\u0018\u0001 \u0003(\u000b2 .GDI.Proto.GarminShare.ShareType\"V\n\u001dSupportedReceiveTypesResponse\u00125\n\u000bshare_types\u0018\u0001 \u0003(\u000b2 .GDI.Proto.GarminShare.ShareType\"»\u0001\n\tShareItem\u0012&\n\u0003uid\u0018\u0001 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\u00124\n\nshare_type\u0018\u0002 \u0001(\u000b2 .GDI.Proto.GarminShare.ShareType\u0012\u0017\n\u000fplain_text_name\u0018\u0003 \u0001(\t\u0012\u001b\n\u0013encoded_data_format\u0018\u0004 \u0001(\t\u0012\u001a\n\u0012compatibility_data\u0018\u0005 \u0001(\f\"l\n\u0011ShareItemsRequest\u00125\n\u000bshare_items\u0018\u0001 \u0003(\u000b2 .GDI.Proto.GarminShare.ShareItem\u0012 \n\u0018incompatible_items_count\u0018\u0002 \u0001(\r\"\u0089\u0002\n\u0011ShareItemResponse\u0012-\n\nshare_item\u0018\u0001 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\u0012G\n\u0006reason\u0018\u0002 \u0001(\u000e27.GDI.Proto.GarminShare.ShareItemResponse.DeclinedReason\"|\n\u000eDeclinedReason\u0012\u0011\n\rUSER_DECLINED\u0010\u0001\u0012\u0010\n\fINCOMPATABLE\u0010\u0002\u0012\u0010\n\fOUT_OF_SPACE\u0010\u0003\u0012\u0015\n\u0011RECEIVED_DISABLED\u0010\u0004\u0012\u001c\n\u0018WAIT_FOR_TRANSFER_STATUS\u0010\u0005\"T\n\u0012ShareItemsResponse\u0012>\n\fdenied_items\u0018\u0001 \u0003(\u000b2(.GDI.Proto.GarminShare.ShareItemResponse\"x\n\u0019TransferStartNotification\u0012.\n\u000bshare_items\u0018\u0001 \u0003(\u000b2\u0019.GDI.Proto.DataTypes.UUID\u0012+\n\bbatch_id\u0018\u0002 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\"f\n\u0018ItemsStatusUpdateRequest\u0012J\n\u0012item_status_update\u0018\u0001 \u0003(\u000b2..GDI.Proto.GarminShare.ItemStatusUpdateRequest\"ô\u0001\n\u0017ItemStatusUpdateRequest\u0012&\n\u0003uid\u0018\u0001 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\u0012E\n\u0006status\u0018\u0002 \u0001(\u000e25.GDI.Proto.GarminShare.ItemStatusUpdateRequest.Status\"j\n\u0006Status\u0012\f\n\bACCEPTED\u0010\u0001\u0012\u0013\n\u000fFAILED_REJECTED\u0010\u0002\u0012\u0014\n\u0010FAILED_RETRYABLE\u0010\u0003\u0012\u0013\n\u000fFAILED_NO_SPACE\u0010\u0004\u0012\u0012\n\u000eFAILED_INVALID\u0010\u0005\"h\n\u0019ItemsStatusUpdateResponse\u0012K\n\u0012item_status_update\u0018\u0001 \u0003(\u000b2/.GDI.Proto.GarminShare.ItemStatusUpdateResponse\"¶\u0001\n\u0018ItemStatusUpdateResponse\u0012&\n\u0003uid\u0018\u0001 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID\u0012F\n\u0006status\u0018\u0002 \u0001(\u000e26.GDI.Proto.GarminShare.ItemStatusUpdateResponse.Status\"*\n\u0006Status\u0012\f\n\bACCEPTED\u0010\u0001\u0012\u0012\n\u000eINTERNAL_ERROR\u0010\u0002B.\n\u001acom.garmin.proto.generatedB\u000eGDIGarminShareH\u0003"}, new Descriptors.FileDescriptor[]{GDIDataTypes.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminShare_ConsentLinkRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminShare_ConsentLinkRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminShare_ConsentLinkResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminShare_ConsentLinkResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminShare_ItemStatusUpdateRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminShare_ItemStatusUpdateRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminShare_ItemStatusUpdateResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminShare_ItemStatusUpdateResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminShare_ItemsStatusUpdateRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminShare_ItemsStatusUpdateRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminShare_ItemsStatusUpdateResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminShare_ItemsStatusUpdateResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminShare_Service_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminShare_Service_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminShare_ShareItemResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminShare_ShareItemResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminShare_ShareItem_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminShare_ShareItem_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminShare_ShareItemsRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminShare_ShareItemsRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminShare_ShareItemsResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminShare_ShareItemsResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminShare_ShareType_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminShare_ShareType_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminShare_SupportedReceiveTypesRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminShare_SupportedReceiveTypesRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminShare_SupportedReceiveTypesResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminShare_SupportedReceiveTypesResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GarminShare_TransferStartNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GarminShare_TransferStartNotification_fieldAccessorTable;

    public interface ConsentLinkRequestOrBuilder extends MessageOrBuilder {
        GDIDataTypes.UUID getConnectionId();

        GDIDataTypes.UUIDOrBuilder getConnectionIdOrBuilder();

        boolean hasConnectionId();
    }

    public interface ConsentLinkResponseOrBuilder extends MessageOrBuilder {
        ConsentLinkResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface ItemStatusUpdateRequestOrBuilder extends MessageOrBuilder {
        ItemStatusUpdateRequest.Status getStatus();

        GDIDataTypes.UUID getUid();

        GDIDataTypes.UUIDOrBuilder getUidOrBuilder();

        boolean hasStatus();

        boolean hasUid();
    }

    public interface ItemStatusUpdateResponseOrBuilder extends MessageOrBuilder {
        ItemStatusUpdateResponse.Status getStatus();

        GDIDataTypes.UUID getUid();

        GDIDataTypes.UUIDOrBuilder getUidOrBuilder();

        boolean hasStatus();

        boolean hasUid();
    }

    public interface ItemsStatusUpdateRequestOrBuilder extends MessageOrBuilder {
        ItemStatusUpdateRequest getItemStatusUpdate(int i14);

        int getItemStatusUpdateCount();

        List<ItemStatusUpdateRequest> getItemStatusUpdateList();

        ItemStatusUpdateRequestOrBuilder getItemStatusUpdateOrBuilder(int i14);

        List<? extends ItemStatusUpdateRequestOrBuilder> getItemStatusUpdateOrBuilderList();
    }

    public interface ItemsStatusUpdateResponseOrBuilder extends MessageOrBuilder {
        ItemStatusUpdateResponse getItemStatusUpdate(int i14);

        int getItemStatusUpdateCount();

        List<ItemStatusUpdateResponse> getItemStatusUpdateList();

        ItemStatusUpdateResponseOrBuilder getItemStatusUpdateOrBuilder(int i14);

        List<? extends ItemStatusUpdateResponseOrBuilder> getItemStatusUpdateOrBuilderList();
    }

    public interface ServiceOrBuilder extends MessageOrBuilder {
        ConsentLinkRequest getConsentLinkRequest();

        ConsentLinkRequestOrBuilder getConsentLinkRequestOrBuilder();

        ConsentLinkResponse getConsentLinkResponse();

        ConsentLinkResponseOrBuilder getConsentLinkResponseOrBuilder();

        ItemsStatusUpdateRequest getItemsStatusUpdateRequest();

        ItemsStatusUpdateRequestOrBuilder getItemsStatusUpdateRequestOrBuilder();

        ItemsStatusUpdateResponse getItemsStatusUpdateResponse();

        ItemsStatusUpdateResponseOrBuilder getItemsStatusUpdateResponseOrBuilder();

        ShareItemsRequest getShareItemsRequest();

        ShareItemsRequestOrBuilder getShareItemsRequestOrBuilder();

        ShareItemsResponse getShareItemsResponse();

        ShareItemsResponseOrBuilder getShareItemsResponseOrBuilder();

        SupportedReceiveTypesRequest getSupportedReceiveTypesRequest();

        SupportedReceiveTypesRequestOrBuilder getSupportedReceiveTypesRequestOrBuilder();

        SupportedReceiveTypesResponse getSupportedReceiveTypesResponse();

        SupportedReceiveTypesResponseOrBuilder getSupportedReceiveTypesResponseOrBuilder();

        TransferStartNotification getTransferStartNotification();

        TransferStartNotificationOrBuilder getTransferStartNotificationOrBuilder();

        boolean hasConsentLinkRequest();

        boolean hasConsentLinkResponse();

        boolean hasItemsStatusUpdateRequest();

        boolean hasItemsStatusUpdateResponse();

        boolean hasShareItemsRequest();

        boolean hasShareItemsResponse();

        boolean hasSupportedReceiveTypesRequest();

        boolean hasSupportedReceiveTypesResponse();

        boolean hasTransferStartNotification();
    }

    public interface ShareItemOrBuilder extends MessageOrBuilder {
        ByteString getCompatibilityData();

        String getEncodedDataFormat();

        ByteString getEncodedDataFormatBytes();

        String getPlainTextName();

        ByteString getPlainTextNameBytes();

        ShareType getShareType();

        ShareTypeOrBuilder getShareTypeOrBuilder();

        GDIDataTypes.UUID getUid();

        GDIDataTypes.UUIDOrBuilder getUidOrBuilder();

        boolean hasCompatibilityData();

        boolean hasEncodedDataFormat();

        boolean hasPlainTextName();

        boolean hasShareType();

        boolean hasUid();
    }

    public interface ShareItemResponseOrBuilder extends MessageOrBuilder {
        ShareItemResponse.DeclinedReason getReason();

        GDIDataTypes.UUID getShareItem();

        GDIDataTypes.UUIDOrBuilder getShareItemOrBuilder();

        boolean hasReason();

        boolean hasShareItem();
    }

    public interface ShareItemsRequestOrBuilder extends MessageOrBuilder {
        int getIncompatibleItemsCount();

        ShareItem getShareItems(int i14);

        int getShareItemsCount();

        List<ShareItem> getShareItemsList();

        ShareItemOrBuilder getShareItemsOrBuilder(int i14);

        List<? extends ShareItemOrBuilder> getShareItemsOrBuilderList();

        boolean hasIncompatibleItemsCount();
    }

    public interface ShareItemsResponseOrBuilder extends MessageOrBuilder {
        ShareItemResponse getDeniedItems(int i14);

        int getDeniedItemsCount();

        List<ShareItemResponse> getDeniedItemsList();

        ShareItemResponseOrBuilder getDeniedItemsOrBuilder(int i14);

        List<? extends ShareItemResponseOrBuilder> getDeniedItemsOrBuilderList();
    }

    public interface ShareTypeOrBuilder extends MessageOrBuilder {
        String getIdentifier();

        ByteString getIdentifierBytes();

        String getSupportedReceiveFormats(int i14);

        ByteString getSupportedReceiveFormatsBytes(int i14);

        int getSupportedReceiveFormatsCount();

        List<String> getSupportedReceiveFormatsList();

        boolean hasIdentifier();
    }

    public interface SupportedReceiveTypesRequestOrBuilder extends MessageOrBuilder {
        ShareType getShareTypes(int i14);

        int getShareTypesCount();

        List<ShareType> getShareTypesList();

        ShareTypeOrBuilder getShareTypesOrBuilder(int i14);

        List<? extends ShareTypeOrBuilder> getShareTypesOrBuilderList();
    }

    public interface SupportedReceiveTypesResponseOrBuilder extends MessageOrBuilder {
        ShareType getShareTypes(int i14);

        int getShareTypesCount();

        List<ShareType> getShareTypesList();

        ShareTypeOrBuilder getShareTypesOrBuilder(int i14);

        List<? extends ShareTypeOrBuilder> getShareTypesOrBuilderList();
    }

    public interface TransferStartNotificationOrBuilder extends MessageOrBuilder {
        GDIDataTypes.UUID getBatchId();

        GDIDataTypes.UUIDOrBuilder getBatchIdOrBuilder();

        GDIDataTypes.UUID getShareItems(int i14);

        int getShareItemsCount();

        List<GDIDataTypes.UUID> getShareItemsList();

        GDIDataTypes.UUIDOrBuilder getShareItemsOrBuilder(int i14);

        List<? extends GDIDataTypes.UUIDOrBuilder> getShareItemsOrBuilderList();

        boolean hasBatchId();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_GarminShare_Service_descriptor = descriptor2;
        internal_static_GDI_Proto_GarminShare_Service_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"ConsentLinkRequest", "ConsentLinkResponse", "SupportedReceiveTypesRequest", "SupportedReceiveTypesResponse", "ShareItemsRequest", "ShareItemsResponse", "TransferStartNotification", "ItemsStatusUpdateRequest", "ItemsStatusUpdateResponse"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_GarminShare_ConsentLinkRequest_descriptor = descriptor3;
        internal_static_GDI_Proto_GarminShare_ConsentLinkRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[]{"ConnectionId"});
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_GarminShare_ConsentLinkResponse_descriptor = descriptor4;
        internal_static_GDI_Proto_GarminShare_ConsentLinkResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[]{"Status"});
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_GarminShare_ShareType_descriptor = descriptor5;
        internal_static_GDI_Proto_GarminShare_ShareType_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"Identifier", "SupportedReceiveFormats"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_GarminShare_SupportedReceiveTypesRequest_descriptor = descriptor6;
        internal_static_GDI_Proto_GarminShare_SupportedReceiveTypesRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"ShareTypes"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_GarminShare_SupportedReceiveTypesResponse_descriptor = descriptor7;
        internal_static_GDI_Proto_GarminShare_SupportedReceiveTypesResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"ShareTypes"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_GarminShare_ShareItem_descriptor = descriptor8;
        internal_static_GDI_Proto_GarminShare_ShareItem_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Uid", "ShareType", "PlainTextName", "EncodedDataFormat", "CompatibilityData"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_GarminShare_ShareItemsRequest_descriptor = descriptor9;
        internal_static_GDI_Proto_GarminShare_ShareItemsRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"ShareItems", "IncompatibleItemsCount"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_GarminShare_ShareItemResponse_descriptor = descriptor10;
        internal_static_GDI_Proto_GarminShare_ShareItemResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"ShareItem", "Reason"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_GarminShare_ShareItemsResponse_descriptor = descriptor11;
        internal_static_GDI_Proto_GarminShare_ShareItemsResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"DeniedItems"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_GDI_Proto_GarminShare_TransferStartNotification_descriptor = descriptor12;
        internal_static_GDI_Proto_GarminShare_TransferStartNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"ShareItems", "BatchId"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_GDI_Proto_GarminShare_ItemsStatusUpdateRequest_descriptor = descriptor13;
        internal_static_GDI_Proto_GarminShare_ItemsStatusUpdateRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"ItemStatusUpdate"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(12);
        internal_static_GDI_Proto_GarminShare_ItemStatusUpdateRequest_descriptor = descriptor14;
        internal_static_GDI_Proto_GarminShare_ItemStatusUpdateRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"Uid", "Status"});
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(13);
        internal_static_GDI_Proto_GarminShare_ItemsStatusUpdateResponse_descriptor = descriptor15;
        internal_static_GDI_Proto_GarminShare_ItemsStatusUpdateResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"ItemStatusUpdate"});
        Descriptors.Descriptor descriptor16 = getDescriptor().getMessageTypes().get(14);
        internal_static_GDI_Proto_GarminShare_ItemStatusUpdateResponse_descriptor = descriptor16;
        internal_static_GDI_Proto_GarminShare_ItemStatusUpdateResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor16, new String[]{"Uid", "Status"});
        GDIDataTypes.getDescriptor();
    }

    private GDIGarminShare() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class ConsentLinkRequest extends GeneratedMessageV3 implements ConsentLinkRequestOrBuilder {
        public static final int CONNECTION_ID_FIELD_NUMBER = 1;
        private static final ConsentLinkRequest DEFAULT_INSTANCE = new ConsentLinkRequest();

        @Deprecated
        public static final Parser<ConsentLinkRequest> PARSER = new AbstractParser<ConsentLinkRequest>() { // from class: com.garmin.proto.generated.GDIGarminShare.ConsentLinkRequest.1
            @Override // com.google.protobuf.Parser
            public ConsentLinkRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConsentLinkRequest.newBuilder();
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
        private GDIDataTypes.UUID connectionId_;
        private byte memoizedIsInitialized;

        private ConsentLinkRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConsentLinkRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ConsentLinkRequest_descriptor;
        }

        public static Builder newBuilder(ConsentLinkRequest consentLinkRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(consentLinkRequest);
        }

        public static ConsentLinkRequest parseDelimitedFrom(InputStream inputStream) {
            return (ConsentLinkRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConsentLinkRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConsentLinkRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConsentLinkRequest)) {
                return super.equals(obj);
            }
            ConsentLinkRequest consentLinkRequest = (ConsentLinkRequest) obj;
            if (hasConnectionId() != consentLinkRequest.hasConnectionId()) {
                return false;
            }
            return (!hasConnectionId() || getConnectionId().equals(consentLinkRequest.getConnectionId())) && getUnknownFields().equals(consentLinkRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ConsentLinkRequestOrBuilder
        public GDIDataTypes.UUID getConnectionId() {
            GDIDataTypes.UUID uuid = this.connectionId_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ConsentLinkRequestOrBuilder
        public GDIDataTypes.UUIDOrBuilder getConnectionIdOrBuilder() {
            GDIDataTypes.UUID uuid = this.connectionId_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConsentLinkRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getConnectionId()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ConsentLinkRequestOrBuilder
        public boolean hasConnectionId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasConnectionId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getConnectionId().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ConsentLinkRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConsentLinkRequest.class, Builder.class);
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
            if (!hasConnectionId() || getConnectionId().isInitialized()) {
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
            return new ConsentLinkRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getConnectionId());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConsentLinkRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> connectionIdBuilder_;
            private GDIDataTypes.UUID connectionId_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ConsentLinkRequest consentLinkRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.connectionIdBuilder_;
                    consentLinkRequest.connectionId_ = singleFieldBuilderV3 == null ? this.connectionId_ : (GDIDataTypes.UUID) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                consentLinkRequest.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> getConnectionIdFieldBuilder() {
                if (this.connectionIdBuilder_ == null) {
                    this.connectionIdBuilder_ = new SingleFieldBuilderV3<>(getConnectionId(), getParentForChildren(), isClean());
                    this.connectionId_ = null;
                }
                return this.connectionIdBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ConsentLinkRequest_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getConnectionIdFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConsentLinkRequest build() {
                ConsentLinkRequest consentLinkRequestBuildPartial = buildPartial();
                if (consentLinkRequestBuildPartial.isInitialized()) {
                    return consentLinkRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) consentLinkRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConsentLinkRequest buildPartial() {
                ConsentLinkRequest consentLinkRequest = new ConsentLinkRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(consentLinkRequest);
                }
                onBuilt();
                return consentLinkRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.connectionId_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.connectionIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectionIdBuilder_ = null;
                }
                return this;
            }

            public Builder clearConnectionId() {
                this.bitField0_ &= -2;
                this.connectionId_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.connectionIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.connectionIdBuilder_ = null;
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

            @Override // com.garmin.proto.generated.GDIGarminShare.ConsentLinkRequestOrBuilder
            public GDIDataTypes.UUID getConnectionId() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.connectionIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUID) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.UUID uuid = this.connectionId_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            public GDIDataTypes.UUID.Builder getConnectionIdBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GDIDataTypes.UUID.Builder) getConnectionIdFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ConsentLinkRequestOrBuilder
            public GDIDataTypes.UUIDOrBuilder getConnectionIdOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.connectionIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.connectionId_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ConsentLinkRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ConsentLinkRequestOrBuilder
            public boolean hasConnectionId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ConsentLinkRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ConsentLinkRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasConnectionId() || getConnectionId().isInitialized();
            }

            public Builder mergeConnectionId(GDIDataTypes.UUID uuid) {
                GDIDataTypes.UUID uuid2;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.connectionIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uuid);
                } else if ((this.bitField0_ & 1) == 0 || (uuid2 = this.connectionId_) == null || uuid2 == GDIDataTypes.UUID.getDefaultInstance()) {
                    this.connectionId_ = uuid;
                } else {
                    getConnectionIdBuilder().mergeFrom(uuid);
                }
                if (this.connectionId_ != null) {
                    this.bitField0_ |= 1;
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
                                    codedInputStream.readMessage(getConnectionIdFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setConnectionId(GDIDataTypes.UUID.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.connectionIdBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.connectionId_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
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
            public ConsentLinkRequest getDefaultInstanceForType() {
                return ConsentLinkRequest.getDefaultInstance();
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

            public Builder setConnectionId(GDIDataTypes.UUID uuid) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.connectionIdBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uuid.getClass();
                    this.connectionId_ = uuid;
                } else {
                    singleFieldBuilderV3.setMessage(uuid);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ConsentLinkRequest) {
                    return mergeFrom((ConsentLinkRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConsentLinkRequest consentLinkRequest) {
                if (consentLinkRequest == ConsentLinkRequest.getDefaultInstance()) {
                    return this;
                }
                if (consentLinkRequest.hasConnectionId()) {
                    mergeConnectionId(consentLinkRequest.getConnectionId());
                }
                mergeUnknownFields(consentLinkRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConsentLinkRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ ConsentLinkRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ConsentLinkRequest() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConsentLinkRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConsentLinkRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConsentLinkRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ConsentLinkRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConsentLinkRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConsentLinkRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConsentLinkRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConsentLinkRequest parseFrom(InputStream inputStream) {
            return (ConsentLinkRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConsentLinkRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConsentLinkRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConsentLinkRequest parseFrom(CodedInputStream codedInputStream) {
            return (ConsentLinkRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConsentLinkRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConsentLinkRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ConsentLinkResponse extends GeneratedMessageV3 implements ConsentLinkResponseOrBuilder {
        private static final ConsentLinkResponse DEFAULT_INSTANCE = new ConsentLinkResponse();

        @Deprecated
        public static final Parser<ConsentLinkResponse> PARSER = new AbstractParser<ConsentLinkResponse>() { // from class: com.garmin.proto.generated.GDIGarminShare.ConsentLinkResponse.1
            @Override // com.google.protobuf.Parser
            public ConsentLinkResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ConsentLinkResponse.newBuilder();
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

        private ConsentLinkResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ConsentLinkResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ConsentLinkResponse_descriptor;
        }

        public static Builder newBuilder(ConsentLinkResponse consentLinkResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(consentLinkResponse);
        }

        public static ConsentLinkResponse parseDelimitedFrom(InputStream inputStream) {
            return (ConsentLinkResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ConsentLinkResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ConsentLinkResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ConsentLinkResponse)) {
                return super.equals(obj);
            }
            ConsentLinkResponse consentLinkResponse = (ConsentLinkResponse) obj;
            if (hasStatus() != consentLinkResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == consentLinkResponse.status_) && getUnknownFields().equals(consentLinkResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ConsentLinkResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIGarminShare.ConsentLinkResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.ACCEPTED : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ConsentLinkResponseOrBuilder
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
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ConsentLinkResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConsentLinkResponse.class, Builder.class);
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
            return new ConsentLinkResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ConsentLinkResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 1;
            }

            private void buildPartial0(ConsentLinkResponse consentLinkResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    consentLinkResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                consentLinkResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ConsentLinkResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConsentLinkResponse build() {
                ConsentLinkResponse consentLinkResponseBuildPartial = buildPartial();
                if (consentLinkResponseBuildPartial.isInitialized()) {
                    return consentLinkResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) consentLinkResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ConsentLinkResponse buildPartial() {
                ConsentLinkResponse consentLinkResponse = new ConsentLinkResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(consentLinkResponse);
                }
                onBuilt();
                return consentLinkResponse;
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
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ConsentLinkResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ConsentLinkResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.ACCEPTED : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ConsentLinkResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ConsentLinkResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ConsentLinkResponse.class, Builder.class);
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
            public ConsentLinkResponse getDefaultInstanceForType() {
                return ConsentLinkResponse.getDefaultInstance();
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
                if (message instanceof ConsentLinkResponse) {
                    return mergeFrom((ConsentLinkResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ConsentLinkResponse consentLinkResponse) {
                if (consentLinkResponse == ConsentLinkResponse.getDefaultInstance()) {
                    return this;
                }
                if (consentLinkResponse.hasStatus()) {
                    setStatus(consentLinkResponse.getStatus());
                }
                mergeUnknownFields(consentLinkResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ConsentLinkResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ConsentLinkResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConsentLinkResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConsentLinkResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ConsentLinkResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ConsentLinkResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ConsentLinkResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ConsentLinkResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ConsentLinkResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ConsentLinkResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ConsentLinkResponse parseFrom(InputStream inputStream) {
            return (ConsentLinkResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ConsentLinkResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConsentLinkResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ConsentLinkResponse parseFrom(CodedInputStream codedInputStream) {
            return (ConsentLinkResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ConsentLinkResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ConsentLinkResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            ACCEPTED(1),
            UNKNOWN_CONNECTION_ID(2);

            public static final int ACCEPTED_VALUE = 1;
            public static final int UNKNOWN_CONNECTION_ID_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIGarminShare.ConsentLinkResponse.Status.1
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
                    return ACCEPTED;
                }
                if (i14 != 2) {
                    return null;
                }
                return UNKNOWN_CONNECTION_ID;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ConsentLinkResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class ItemStatusUpdateRequest extends GeneratedMessageV3 implements ItemStatusUpdateRequestOrBuilder {
        private static final ItemStatusUpdateRequest DEFAULT_INSTANCE = new ItemStatusUpdateRequest();

        @Deprecated
        public static final Parser<ItemStatusUpdateRequest> PARSER = new AbstractParser<ItemStatusUpdateRequest>() { // from class: com.garmin.proto.generated.GDIGarminShare.ItemStatusUpdateRequest.1
            @Override // com.google.protobuf.Parser
            public ItemStatusUpdateRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ItemStatusUpdateRequest.newBuilder();
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
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int UID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int status_;
        private GDIDataTypes.UUID uid_;

        private ItemStatusUpdateRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ItemStatusUpdateRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ItemStatusUpdateRequest_descriptor;
        }

        public static Builder newBuilder(ItemStatusUpdateRequest itemStatusUpdateRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(itemStatusUpdateRequest);
        }

        public static ItemStatusUpdateRequest parseDelimitedFrom(InputStream inputStream) {
            return (ItemStatusUpdateRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ItemStatusUpdateRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ItemStatusUpdateRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ItemStatusUpdateRequest)) {
                return super.equals(obj);
            }
            ItemStatusUpdateRequest itemStatusUpdateRequest = (ItemStatusUpdateRequest) obj;
            if (hasUid() != itemStatusUpdateRequest.hasUid()) {
                return false;
            }
            if ((!hasUid() || getUid().equals(itemStatusUpdateRequest.getUid())) && hasStatus() == itemStatusUpdateRequest.hasStatus()) {
                return (!hasStatus() || this.status_ == itemStatusUpdateRequest.status_) && getUnknownFields().equals(itemStatusUpdateRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ItemStatusUpdateRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getUid()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(2, this.status_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ItemStatusUpdateRequestOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.ACCEPTED : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ItemStatusUpdateRequestOrBuilder
        public GDIDataTypes.UUID getUid() {
            GDIDataTypes.UUID uuid = this.uid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ItemStatusUpdateRequestOrBuilder
        public GDIDataTypes.UUIDOrBuilder getUidOrBuilder() {
            GDIDataTypes.UUID uuid = this.uid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ItemStatusUpdateRequestOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ItemStatusUpdateRequestOrBuilder
        public boolean hasUid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasUid()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getUid().hashCode();
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
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ItemStatusUpdateRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemStatusUpdateRequest.class, Builder.class);
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
            if (!hasUid() || getUid().isInitialized()) {
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
            return new ItemStatusUpdateRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getUid());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.status_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ItemStatusUpdateRequestOrBuilder {
            private int bitField0_;
            private int status_;
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> uidBuilder_;
            private GDIDataTypes.UUID uid_;

            private Builder() {
                this.status_ = 1;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ItemStatusUpdateRequest itemStatusUpdateRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uidBuilder_;
                    itemStatusUpdateRequest.uid_ = singleFieldBuilderV3 == null ? this.uid_ : (GDIDataTypes.UUID) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    itemStatusUpdateRequest.status_ = this.status_;
                    i14 |= 2;
                }
                itemStatusUpdateRequest.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ItemStatusUpdateRequest_descriptor;
            }

            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> getUidFieldBuilder() {
                if (this.uidBuilder_ == null) {
                    this.uidBuilder_ = new SingleFieldBuilderV3<>(getUid(), getParentForChildren(), isClean());
                    this.uid_ = null;
                }
                return this.uidBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getUidFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ItemStatusUpdateRequest build() {
                ItemStatusUpdateRequest itemStatusUpdateRequestBuildPartial = buildPartial();
                if (itemStatusUpdateRequestBuildPartial.isInitialized()) {
                    return itemStatusUpdateRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) itemStatusUpdateRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ItemStatusUpdateRequest buildPartial() {
                ItemStatusUpdateRequest itemStatusUpdateRequest = new ItemStatusUpdateRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(itemStatusUpdateRequest);
                }
                onBuilt();
                return itemStatusUpdateRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.uid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.uidBuilder_ = null;
                }
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
                this.bitField0_ &= -3;
                this.status_ = 1;
                onChanged();
                return this;
            }

            public Builder clearUid() {
                this.bitField0_ &= -2;
                this.uid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.uidBuilder_ = null;
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
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ItemStatusUpdateRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ItemStatusUpdateRequestOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.ACCEPTED : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ItemStatusUpdateRequestOrBuilder
            public GDIDataTypes.UUID getUid() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUID) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.UUID uuid = this.uid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            public GDIDataTypes.UUID.Builder getUidBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GDIDataTypes.UUID.Builder) getUidFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ItemStatusUpdateRequestOrBuilder
            public GDIDataTypes.UUIDOrBuilder getUidOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.uid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ItemStatusUpdateRequestOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ItemStatusUpdateRequestOrBuilder
            public boolean hasUid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ItemStatusUpdateRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemStatusUpdateRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasUid() || getUid().isInitialized();
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
                                    codedInputStream.readMessage(getUidFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeUid(GDIDataTypes.UUID uuid) {
                GDIDataTypes.UUID uuid2;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uuid);
                } else if ((this.bitField0_ & 1) == 0 || (uuid2 = this.uid_) == null || uuid2 == GDIDataTypes.UUID.getDefaultInstance()) {
                    this.uid_ = uuid;
                } else {
                    getUidBuilder().mergeFrom(uuid);
                }
                if (this.uid_ != null) {
                    this.bitField0_ |= 1;
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

            public Builder setStatus(Status status) {
                status.getClass();
                this.bitField0_ |= 2;
                this.status_ = status.getNumber();
                onChanged();
                return this;
            }

            public Builder setUid(GDIDataTypes.UUID.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.uid_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ItemStatusUpdateRequest getDefaultInstanceForType() {
                return ItemStatusUpdateRequest.getDefaultInstance();
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
                maybeForceBuilderInitialization();
            }

            public Builder setUid(GDIDataTypes.UUID uuid) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uuid.getClass();
                    this.uid_ = uuid;
                } else {
                    singleFieldBuilderV3.setMessage(uuid);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ItemStatusUpdateRequest) {
                    return mergeFrom((ItemStatusUpdateRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ItemStatusUpdateRequest itemStatusUpdateRequest) {
                if (itemStatusUpdateRequest == ItemStatusUpdateRequest.getDefaultInstance()) {
                    return this;
                }
                if (itemStatusUpdateRequest.hasUid()) {
                    mergeUid(itemStatusUpdateRequest.getUid());
                }
                if (itemStatusUpdateRequest.hasStatus()) {
                    setStatus(itemStatusUpdateRequest.getStatus());
                }
                mergeUnknownFields(itemStatusUpdateRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ItemStatusUpdateRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ItemStatusUpdateRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemStatusUpdateRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ItemStatusUpdateRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ItemStatusUpdateRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ItemStatusUpdateRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ItemStatusUpdateRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ItemStatusUpdateRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ItemStatusUpdateRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ItemStatusUpdateRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ItemStatusUpdateRequest parseFrom(InputStream inputStream) {
            return (ItemStatusUpdateRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ItemStatusUpdateRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemStatusUpdateRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ItemStatusUpdateRequest parseFrom(CodedInputStream codedInputStream) {
            return (ItemStatusUpdateRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ItemStatusUpdateRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemStatusUpdateRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            ACCEPTED(1),
            FAILED_REJECTED(2),
            FAILED_RETRYABLE(3),
            FAILED_NO_SPACE(4),
            FAILED_INVALID(5);

            public static final int ACCEPTED_VALUE = 1;
            public static final int FAILED_INVALID_VALUE = 5;
            public static final int FAILED_NO_SPACE_VALUE = 4;
            public static final int FAILED_REJECTED_VALUE = 2;
            public static final int FAILED_RETRYABLE_VALUE = 3;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIGarminShare.ItemStatusUpdateRequest.Status.1
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
                    return ACCEPTED;
                }
                if (i14 == 2) {
                    return FAILED_REJECTED;
                }
                if (i14 == 3) {
                    return FAILED_RETRYABLE;
                }
                if (i14 == 4) {
                    return FAILED_NO_SPACE;
                }
                if (i14 != 5) {
                    return null;
                }
                return FAILED_INVALID;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ItemStatusUpdateRequest.getDescriptor().getEnumTypes().get(0);
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

    public static final class ItemStatusUpdateResponse extends GeneratedMessageV3 implements ItemStatusUpdateResponseOrBuilder {
        private static final ItemStatusUpdateResponse DEFAULT_INSTANCE = new ItemStatusUpdateResponse();

        @Deprecated
        public static final Parser<ItemStatusUpdateResponse> PARSER = new AbstractParser<ItemStatusUpdateResponse>() { // from class: com.garmin.proto.generated.GDIGarminShare.ItemStatusUpdateResponse.1
            @Override // com.google.protobuf.Parser
            public ItemStatusUpdateResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ItemStatusUpdateResponse.newBuilder();
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
        public static final int STATUS_FIELD_NUMBER = 2;
        public static final int UID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int status_;
        private GDIDataTypes.UUID uid_;

        private ItemStatusUpdateResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ItemStatusUpdateResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ItemStatusUpdateResponse_descriptor;
        }

        public static Builder newBuilder(ItemStatusUpdateResponse itemStatusUpdateResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(itemStatusUpdateResponse);
        }

        public static ItemStatusUpdateResponse parseDelimitedFrom(InputStream inputStream) {
            return (ItemStatusUpdateResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ItemStatusUpdateResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ItemStatusUpdateResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ItemStatusUpdateResponse)) {
                return super.equals(obj);
            }
            ItemStatusUpdateResponse itemStatusUpdateResponse = (ItemStatusUpdateResponse) obj;
            if (hasUid() != itemStatusUpdateResponse.hasUid()) {
                return false;
            }
            if ((!hasUid() || getUid().equals(itemStatusUpdateResponse.getUid())) && hasStatus() == itemStatusUpdateResponse.hasStatus()) {
                return (!hasStatus() || this.status_ == itemStatusUpdateResponse.status_) && getUnknownFields().equals(itemStatusUpdateResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ItemStatusUpdateResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getUid()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(2, this.status_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ItemStatusUpdateResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.ACCEPTED : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ItemStatusUpdateResponseOrBuilder
        public GDIDataTypes.UUID getUid() {
            GDIDataTypes.UUID uuid = this.uid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ItemStatusUpdateResponseOrBuilder
        public GDIDataTypes.UUIDOrBuilder getUidOrBuilder() {
            GDIDataTypes.UUID uuid = this.uid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ItemStatusUpdateResponseOrBuilder
        public boolean hasStatus() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ItemStatusUpdateResponseOrBuilder
        public boolean hasUid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasUid()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getUid().hashCode();
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
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ItemStatusUpdateResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemStatusUpdateResponse.class, Builder.class);
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
            if (!hasUid() || getUid().isInitialized()) {
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
            return new ItemStatusUpdateResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getUid());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.status_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ItemStatusUpdateResponseOrBuilder {
            private int bitField0_;
            private int status_;
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> uidBuilder_;
            private GDIDataTypes.UUID uid_;

            private Builder() {
                this.status_ = 1;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ItemStatusUpdateResponse itemStatusUpdateResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uidBuilder_;
                    itemStatusUpdateResponse.uid_ = singleFieldBuilderV3 == null ? this.uid_ : (GDIDataTypes.UUID) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    itemStatusUpdateResponse.status_ = this.status_;
                    i14 |= 2;
                }
                itemStatusUpdateResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ItemStatusUpdateResponse_descriptor;
            }

            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> getUidFieldBuilder() {
                if (this.uidBuilder_ == null) {
                    this.uidBuilder_ = new SingleFieldBuilderV3<>(getUid(), getParentForChildren(), isClean());
                    this.uid_ = null;
                }
                return this.uidBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getUidFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ItemStatusUpdateResponse build() {
                ItemStatusUpdateResponse itemStatusUpdateResponseBuildPartial = buildPartial();
                if (itemStatusUpdateResponseBuildPartial.isInitialized()) {
                    return itemStatusUpdateResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) itemStatusUpdateResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ItemStatusUpdateResponse buildPartial() {
                ItemStatusUpdateResponse itemStatusUpdateResponse = new ItemStatusUpdateResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(itemStatusUpdateResponse);
                }
                onBuilt();
                return itemStatusUpdateResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.uid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.uidBuilder_ = null;
                }
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
                this.bitField0_ &= -3;
                this.status_ = 1;
                onChanged();
                return this;
            }

            public Builder clearUid() {
                this.bitField0_ &= -2;
                this.uid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.uidBuilder_ = null;
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
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ItemStatusUpdateResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ItemStatusUpdateResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.ACCEPTED : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ItemStatusUpdateResponseOrBuilder
            public GDIDataTypes.UUID getUid() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUID) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.UUID uuid = this.uid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            public GDIDataTypes.UUID.Builder getUidBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GDIDataTypes.UUID.Builder) getUidFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ItemStatusUpdateResponseOrBuilder
            public GDIDataTypes.UUIDOrBuilder getUidOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.uid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ItemStatusUpdateResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ItemStatusUpdateResponseOrBuilder
            public boolean hasUid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ItemStatusUpdateResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemStatusUpdateResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasUid() || getUid().isInitialized();
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
                                    codedInputStream.readMessage(getUidFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeUid(GDIDataTypes.UUID uuid) {
                GDIDataTypes.UUID uuid2;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uuid);
                } else if ((this.bitField0_ & 1) == 0 || (uuid2 = this.uid_) == null || uuid2 == GDIDataTypes.UUID.getDefaultInstance()) {
                    this.uid_ = uuid;
                } else {
                    getUidBuilder().mergeFrom(uuid);
                }
                if (this.uid_ != null) {
                    this.bitField0_ |= 1;
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

            public Builder setStatus(Status status) {
                status.getClass();
                this.bitField0_ |= 2;
                this.status_ = status.getNumber();
                onChanged();
                return this;
            }

            public Builder setUid(GDIDataTypes.UUID.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.uid_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ItemStatusUpdateResponse getDefaultInstanceForType() {
                return ItemStatusUpdateResponse.getDefaultInstance();
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
                maybeForceBuilderInitialization();
            }

            public Builder setUid(GDIDataTypes.UUID uuid) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uuid.getClass();
                    this.uid_ = uuid;
                } else {
                    singleFieldBuilderV3.setMessage(uuid);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ItemStatusUpdateResponse) {
                    return mergeFrom((ItemStatusUpdateResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ItemStatusUpdateResponse itemStatusUpdateResponse) {
                if (itemStatusUpdateResponse == ItemStatusUpdateResponse.getDefaultInstance()) {
                    return this;
                }
                if (itemStatusUpdateResponse.hasUid()) {
                    mergeUid(itemStatusUpdateResponse.getUid());
                }
                if (itemStatusUpdateResponse.hasStatus()) {
                    setStatus(itemStatusUpdateResponse.getStatus());
                }
                mergeUnknownFields(itemStatusUpdateResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ItemStatusUpdateResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ItemStatusUpdateResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemStatusUpdateResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ItemStatusUpdateResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ItemStatusUpdateResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ItemStatusUpdateResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ItemStatusUpdateResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ItemStatusUpdateResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ItemStatusUpdateResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ItemStatusUpdateResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ItemStatusUpdateResponse parseFrom(InputStream inputStream) {
            return (ItemStatusUpdateResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ItemStatusUpdateResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemStatusUpdateResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ItemStatusUpdateResponse parseFrom(CodedInputStream codedInputStream) {
            return (ItemStatusUpdateResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ItemStatusUpdateResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemStatusUpdateResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            ACCEPTED(1),
            INTERNAL_ERROR(2);

            public static final int ACCEPTED_VALUE = 1;
            public static final int INTERNAL_ERROR_VALUE = 2;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIGarminShare.ItemStatusUpdateResponse.Status.1
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
                    return ACCEPTED;
                }
                if (i14 != 2) {
                    return null;
                }
                return INTERNAL_ERROR;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ItemStatusUpdateResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class ItemsStatusUpdateRequest extends GeneratedMessageV3 implements ItemsStatusUpdateRequestOrBuilder {
        public static final int ITEM_STATUS_UPDATE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<ItemStatusUpdateRequest> itemStatusUpdate_;
        private byte memoizedIsInitialized;
        private static final ItemsStatusUpdateRequest DEFAULT_INSTANCE = new ItemsStatusUpdateRequest();

        @Deprecated
        public static final Parser<ItemsStatusUpdateRequest> PARSER = new AbstractParser<ItemsStatusUpdateRequest>() { // from class: com.garmin.proto.generated.GDIGarminShare.ItemsStatusUpdateRequest.1
            @Override // com.google.protobuf.Parser
            public ItemsStatusUpdateRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ItemsStatusUpdateRequest.newBuilder();
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

        private ItemsStatusUpdateRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.itemStatusUpdate_ = Collections.EMPTY_LIST;
        }

        public static ItemsStatusUpdateRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ItemsStatusUpdateRequest_descriptor;
        }

        public static Builder newBuilder(ItemsStatusUpdateRequest itemsStatusUpdateRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(itemsStatusUpdateRequest);
        }

        public static ItemsStatusUpdateRequest parseDelimitedFrom(InputStream inputStream) {
            return (ItemsStatusUpdateRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ItemsStatusUpdateRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ItemsStatusUpdateRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ItemsStatusUpdateRequest)) {
                return super.equals(obj);
            }
            ItemsStatusUpdateRequest itemsStatusUpdateRequest = (ItemsStatusUpdateRequest) obj;
            return getItemStatusUpdateList().equals(itemsStatusUpdateRequest.getItemStatusUpdateList()) && getUnknownFields().equals(itemsStatusUpdateRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ItemsStatusUpdateRequestOrBuilder
        public ItemStatusUpdateRequest getItemStatusUpdate(int i14) {
            return this.itemStatusUpdate_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ItemsStatusUpdateRequestOrBuilder
        public int getItemStatusUpdateCount() {
            return this.itemStatusUpdate_.size();
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ItemsStatusUpdateRequestOrBuilder
        public List<ItemStatusUpdateRequest> getItemStatusUpdateList() {
            return this.itemStatusUpdate_;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ItemsStatusUpdateRequestOrBuilder
        public ItemStatusUpdateRequestOrBuilder getItemStatusUpdateOrBuilder(int i14) {
            return this.itemStatusUpdate_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ItemsStatusUpdateRequestOrBuilder
        public List<? extends ItemStatusUpdateRequestOrBuilder> getItemStatusUpdateOrBuilderList() {
            return this.itemStatusUpdate_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ItemsStatusUpdateRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.itemStatusUpdate_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.itemStatusUpdate_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
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
            if (getItemStatusUpdateCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getItemStatusUpdateList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ItemsStatusUpdateRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemsStatusUpdateRequest.class, Builder.class);
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
            for (int i14 = 0; i14 < getItemStatusUpdateCount(); i14++) {
                if (!getItemStatusUpdate(i14).isInitialized()) {
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
            return new ItemsStatusUpdateRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.itemStatusUpdate_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.itemStatusUpdate_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ItemsStatusUpdateRequestOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<ItemStatusUpdateRequest, ItemStatusUpdateRequest.Builder, ItemStatusUpdateRequestOrBuilder> itemStatusUpdateBuilder_;
            private List<ItemStatusUpdateRequest> itemStatusUpdate_;

            private Builder() {
                this.itemStatusUpdate_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(ItemsStatusUpdateRequest itemsStatusUpdateRequest) {
            }

            private void buildPartialRepeatedFields(ItemsStatusUpdateRequest itemsStatusUpdateRequest) {
                RepeatedFieldBuilderV3<ItemStatusUpdateRequest, ItemStatusUpdateRequest.Builder, ItemStatusUpdateRequestOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    itemsStatusUpdateRequest.itemStatusUpdate_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.itemStatusUpdate_ = Collections.unmodifiableList(this.itemStatusUpdate_);
                    this.bitField0_ &= -2;
                }
                itemsStatusUpdateRequest.itemStatusUpdate_ = this.itemStatusUpdate_;
            }

            private void ensureItemStatusUpdateIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.itemStatusUpdate_ = new ArrayList(this.itemStatusUpdate_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ItemsStatusUpdateRequest_descriptor;
            }

            private RepeatedFieldBuilderV3<ItemStatusUpdateRequest, ItemStatusUpdateRequest.Builder, ItemStatusUpdateRequestOrBuilder> getItemStatusUpdateFieldBuilder() {
                if (this.itemStatusUpdateBuilder_ == null) {
                    this.itemStatusUpdateBuilder_ = new RepeatedFieldBuilderV3<>(this.itemStatusUpdate_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.itemStatusUpdate_ = null;
                }
                return this.itemStatusUpdateBuilder_;
            }

            public Builder addAllItemStatusUpdate(Iterable<? extends ItemStatusUpdateRequest> iterable) {
                RepeatedFieldBuilderV3<ItemStatusUpdateRequest, ItemStatusUpdateRequest.Builder, ItemStatusUpdateRequestOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureItemStatusUpdateIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.itemStatusUpdate_);
                onChanged();
                return this;
            }

            public Builder addItemStatusUpdate(ItemStatusUpdateRequest.Builder builder) {
                RepeatedFieldBuilderV3<ItemStatusUpdateRequest, ItemStatusUpdateRequest.Builder, ItemStatusUpdateRequestOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureItemStatusUpdateIsMutable();
                this.itemStatusUpdate_.add(builder.build());
                onChanged();
                return this;
            }

            public ItemStatusUpdateRequest.Builder addItemStatusUpdateBuilder() {
                return (ItemStatusUpdateRequest.Builder) getItemStatusUpdateFieldBuilder().addBuilder(ItemStatusUpdateRequest.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ItemsStatusUpdateRequest build() {
                ItemsStatusUpdateRequest itemsStatusUpdateRequestBuildPartial = buildPartial();
                if (itemsStatusUpdateRequestBuildPartial.isInitialized()) {
                    return itemsStatusUpdateRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) itemsStatusUpdateRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ItemsStatusUpdateRequest buildPartial() {
                ItemsStatusUpdateRequest itemsStatusUpdateRequest = new ItemsStatusUpdateRequest(this);
                buildPartialRepeatedFields(itemsStatusUpdateRequest);
                if (this.bitField0_ != 0) {
                    buildPartial0(itemsStatusUpdateRequest);
                }
                onBuilt();
                return itemsStatusUpdateRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<ItemStatusUpdateRequest, ItemStatusUpdateRequest.Builder, ItemStatusUpdateRequestOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.itemStatusUpdate_ = Collections.EMPTY_LIST;
                } else {
                    this.itemStatusUpdate_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearItemStatusUpdate() {
                RepeatedFieldBuilderV3<ItemStatusUpdateRequest, ItemStatusUpdateRequest.Builder, ItemStatusUpdateRequestOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.itemStatusUpdate_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
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
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ItemsStatusUpdateRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ItemsStatusUpdateRequestOrBuilder
            public ItemStatusUpdateRequest getItemStatusUpdate(int i14) {
                RepeatedFieldBuilderV3<ItemStatusUpdateRequest, ItemStatusUpdateRequest.Builder, ItemStatusUpdateRequestOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                return repeatedFieldBuilderV3 == null ? this.itemStatusUpdate_.get(i14) : (ItemStatusUpdateRequest) repeatedFieldBuilderV3.getMessage(i14);
            }

            public ItemStatusUpdateRequest.Builder getItemStatusUpdateBuilder(int i14) {
                return (ItemStatusUpdateRequest.Builder) getItemStatusUpdateFieldBuilder().getBuilder(i14);
            }

            public List<ItemStatusUpdateRequest.Builder> getItemStatusUpdateBuilderList() {
                return getItemStatusUpdateFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ItemsStatusUpdateRequestOrBuilder
            public int getItemStatusUpdateCount() {
                RepeatedFieldBuilderV3<ItemStatusUpdateRequest, ItemStatusUpdateRequest.Builder, ItemStatusUpdateRequestOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                return repeatedFieldBuilderV3 == null ? this.itemStatusUpdate_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ItemsStatusUpdateRequestOrBuilder
            public List<ItemStatusUpdateRequest> getItemStatusUpdateList() {
                RepeatedFieldBuilderV3<ItemStatusUpdateRequest, ItemStatusUpdateRequest.Builder, ItemStatusUpdateRequestOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.itemStatusUpdate_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ItemsStatusUpdateRequestOrBuilder
            public ItemStatusUpdateRequestOrBuilder getItemStatusUpdateOrBuilder(int i14) {
                RepeatedFieldBuilderV3<ItemStatusUpdateRequest, ItemStatusUpdateRequest.Builder, ItemStatusUpdateRequestOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                return repeatedFieldBuilderV3 == null ? this.itemStatusUpdate_.get(i14) : (ItemStatusUpdateRequestOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ItemsStatusUpdateRequestOrBuilder
            public List<? extends ItemStatusUpdateRequestOrBuilder> getItemStatusUpdateOrBuilderList() {
                RepeatedFieldBuilderV3<ItemStatusUpdateRequest, ItemStatusUpdateRequest.Builder, ItemStatusUpdateRequestOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.itemStatusUpdate_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ItemsStatusUpdateRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemsStatusUpdateRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getItemStatusUpdateCount(); i14++) {
                    if (!getItemStatusUpdate(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(ItemsStatusUpdateRequest itemsStatusUpdateRequest) {
                if (itemsStatusUpdateRequest == ItemsStatusUpdateRequest.getDefaultInstance()) {
                    return this;
                }
                if (this.itemStatusUpdateBuilder_ == null) {
                    if (!itemsStatusUpdateRequest.itemStatusUpdate_.isEmpty()) {
                        if (this.itemStatusUpdate_.isEmpty()) {
                            this.itemStatusUpdate_ = itemsStatusUpdateRequest.itemStatusUpdate_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureItemStatusUpdateIsMutable();
                            this.itemStatusUpdate_.addAll(itemsStatusUpdateRequest.itemStatusUpdate_);
                        }
                        onChanged();
                    }
                } else if (!itemsStatusUpdateRequest.itemStatusUpdate_.isEmpty()) {
                    boolean zIsEmpty = this.itemStatusUpdateBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<ItemStatusUpdateRequest, ItemStatusUpdateRequest.Builder, ItemStatusUpdateRequestOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.itemStatusUpdateBuilder_ = null;
                        this.itemStatusUpdate_ = itemsStatusUpdateRequest.itemStatusUpdate_;
                        this.bitField0_ &= -2;
                        this.itemStatusUpdateBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getItemStatusUpdateFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(itemsStatusUpdateRequest.itemStatusUpdate_);
                    }
                }
                mergeUnknownFields(itemsStatusUpdateRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeItemStatusUpdate(int i14) {
                RepeatedFieldBuilderV3<ItemStatusUpdateRequest, ItemStatusUpdateRequest.Builder, ItemStatusUpdateRequestOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureItemStatusUpdateIsMutable();
                this.itemStatusUpdate_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setItemStatusUpdate(int i14, ItemStatusUpdateRequest.Builder builder) {
                RepeatedFieldBuilderV3<ItemStatusUpdateRequest, ItemStatusUpdateRequest.Builder, ItemStatusUpdateRequestOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureItemStatusUpdateIsMutable();
                this.itemStatusUpdate_.set(i14, builder.build());
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
            public ItemsStatusUpdateRequest getDefaultInstanceForType() {
                return ItemsStatusUpdateRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.itemStatusUpdate_ = Collections.EMPTY_LIST;
            }

            public ItemStatusUpdateRequest.Builder addItemStatusUpdateBuilder(int i14) {
                return (ItemStatusUpdateRequest.Builder) getItemStatusUpdateFieldBuilder().addBuilder(i14, ItemStatusUpdateRequest.getDefaultInstance());
            }

            public Builder addItemStatusUpdate(int i14, ItemStatusUpdateRequest itemStatusUpdateRequest) {
                RepeatedFieldBuilderV3<ItemStatusUpdateRequest, ItemStatusUpdateRequest.Builder, ItemStatusUpdateRequestOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    itemStatusUpdateRequest.getClass();
                    ensureItemStatusUpdateIsMutable();
                    this.itemStatusUpdate_.add(i14, itemStatusUpdateRequest);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, itemStatusUpdateRequest);
                return this;
            }

            public Builder setItemStatusUpdate(int i14, ItemStatusUpdateRequest itemStatusUpdateRequest) {
                RepeatedFieldBuilderV3<ItemStatusUpdateRequest, ItemStatusUpdateRequest.Builder, ItemStatusUpdateRequestOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    itemStatusUpdateRequest.getClass();
                    ensureItemStatusUpdateIsMutable();
                    this.itemStatusUpdate_.set(i14, itemStatusUpdateRequest);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, itemStatusUpdateRequest);
                return this;
            }

            public Builder addItemStatusUpdate(ItemStatusUpdateRequest itemStatusUpdateRequest) {
                RepeatedFieldBuilderV3<ItemStatusUpdateRequest, ItemStatusUpdateRequest.Builder, ItemStatusUpdateRequestOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    itemStatusUpdateRequest.getClass();
                    ensureItemStatusUpdateIsMutable();
                    this.itemStatusUpdate_.add(itemStatusUpdateRequest);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(itemStatusUpdateRequest);
                return this;
            }

            public Builder addItemStatusUpdate(int i14, ItemStatusUpdateRequest.Builder builder) {
                RepeatedFieldBuilderV3<ItemStatusUpdateRequest, ItemStatusUpdateRequest.Builder, ItemStatusUpdateRequestOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureItemStatusUpdateIsMutable();
                    this.itemStatusUpdate_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ItemsStatusUpdateRequest) {
                    return mergeFrom((ItemsStatusUpdateRequest) message);
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
                                    ItemStatusUpdateRequest itemStatusUpdateRequest = (ItemStatusUpdateRequest) codedInputStream.readMessage(ItemStatusUpdateRequest.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<ItemStatusUpdateRequest, ItemStatusUpdateRequest.Builder, ItemStatusUpdateRequestOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureItemStatusUpdateIsMutable();
                                        this.itemStatusUpdate_.add(itemStatusUpdateRequest);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(itemStatusUpdateRequest);
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
        public ItemsStatusUpdateRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ItemsStatusUpdateRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemsStatusUpdateRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ItemsStatusUpdateRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ItemsStatusUpdateRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ItemsStatusUpdateRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ItemsStatusUpdateRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ItemsStatusUpdateRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ ItemsStatusUpdateRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ItemsStatusUpdateRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ItemsStatusUpdateRequest parseFrom(InputStream inputStream) {
            return (ItemsStatusUpdateRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ItemsStatusUpdateRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemsStatusUpdateRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ItemsStatusUpdateRequest parseFrom(CodedInputStream codedInputStream) {
            return (ItemsStatusUpdateRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ItemsStatusUpdateRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemsStatusUpdateRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ItemsStatusUpdateResponse extends GeneratedMessageV3 implements ItemsStatusUpdateResponseOrBuilder {
        public static final int ITEM_STATUS_UPDATE_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<ItemStatusUpdateResponse> itemStatusUpdate_;
        private byte memoizedIsInitialized;
        private static final ItemsStatusUpdateResponse DEFAULT_INSTANCE = new ItemsStatusUpdateResponse();

        @Deprecated
        public static final Parser<ItemsStatusUpdateResponse> PARSER = new AbstractParser<ItemsStatusUpdateResponse>() { // from class: com.garmin.proto.generated.GDIGarminShare.ItemsStatusUpdateResponse.1
            @Override // com.google.protobuf.Parser
            public ItemsStatusUpdateResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ItemsStatusUpdateResponse.newBuilder();
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

        private ItemsStatusUpdateResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.itemStatusUpdate_ = Collections.EMPTY_LIST;
        }

        public static ItemsStatusUpdateResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ItemsStatusUpdateResponse_descriptor;
        }

        public static Builder newBuilder(ItemsStatusUpdateResponse itemsStatusUpdateResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(itemsStatusUpdateResponse);
        }

        public static ItemsStatusUpdateResponse parseDelimitedFrom(InputStream inputStream) {
            return (ItemsStatusUpdateResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ItemsStatusUpdateResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ItemsStatusUpdateResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ItemsStatusUpdateResponse)) {
                return super.equals(obj);
            }
            ItemsStatusUpdateResponse itemsStatusUpdateResponse = (ItemsStatusUpdateResponse) obj;
            return getItemStatusUpdateList().equals(itemsStatusUpdateResponse.getItemStatusUpdateList()) && getUnknownFields().equals(itemsStatusUpdateResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ItemsStatusUpdateResponseOrBuilder
        public ItemStatusUpdateResponse getItemStatusUpdate(int i14) {
            return this.itemStatusUpdate_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ItemsStatusUpdateResponseOrBuilder
        public int getItemStatusUpdateCount() {
            return this.itemStatusUpdate_.size();
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ItemsStatusUpdateResponseOrBuilder
        public List<ItemStatusUpdateResponse> getItemStatusUpdateList() {
            return this.itemStatusUpdate_;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ItemsStatusUpdateResponseOrBuilder
        public ItemStatusUpdateResponseOrBuilder getItemStatusUpdateOrBuilder(int i14) {
            return this.itemStatusUpdate_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ItemsStatusUpdateResponseOrBuilder
        public List<? extends ItemStatusUpdateResponseOrBuilder> getItemStatusUpdateOrBuilderList() {
            return this.itemStatusUpdate_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ItemsStatusUpdateResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.itemStatusUpdate_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.itemStatusUpdate_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
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
            if (getItemStatusUpdateCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getItemStatusUpdateList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ItemsStatusUpdateResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemsStatusUpdateResponse.class, Builder.class);
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
            for (int i14 = 0; i14 < getItemStatusUpdateCount(); i14++) {
                if (!getItemStatusUpdate(i14).isInitialized()) {
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
            return new ItemsStatusUpdateResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.itemStatusUpdate_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.itemStatusUpdate_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ItemsStatusUpdateResponseOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<ItemStatusUpdateResponse, ItemStatusUpdateResponse.Builder, ItemStatusUpdateResponseOrBuilder> itemStatusUpdateBuilder_;
            private List<ItemStatusUpdateResponse> itemStatusUpdate_;

            private Builder() {
                this.itemStatusUpdate_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(ItemsStatusUpdateResponse itemsStatusUpdateResponse) {
            }

            private void buildPartialRepeatedFields(ItemsStatusUpdateResponse itemsStatusUpdateResponse) {
                RepeatedFieldBuilderV3<ItemStatusUpdateResponse, ItemStatusUpdateResponse.Builder, ItemStatusUpdateResponseOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    itemsStatusUpdateResponse.itemStatusUpdate_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.itemStatusUpdate_ = Collections.unmodifiableList(this.itemStatusUpdate_);
                    this.bitField0_ &= -2;
                }
                itemsStatusUpdateResponse.itemStatusUpdate_ = this.itemStatusUpdate_;
            }

            private void ensureItemStatusUpdateIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.itemStatusUpdate_ = new ArrayList(this.itemStatusUpdate_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ItemsStatusUpdateResponse_descriptor;
            }

            private RepeatedFieldBuilderV3<ItemStatusUpdateResponse, ItemStatusUpdateResponse.Builder, ItemStatusUpdateResponseOrBuilder> getItemStatusUpdateFieldBuilder() {
                if (this.itemStatusUpdateBuilder_ == null) {
                    this.itemStatusUpdateBuilder_ = new RepeatedFieldBuilderV3<>(this.itemStatusUpdate_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.itemStatusUpdate_ = null;
                }
                return this.itemStatusUpdateBuilder_;
            }

            public Builder addAllItemStatusUpdate(Iterable<? extends ItemStatusUpdateResponse> iterable) {
                RepeatedFieldBuilderV3<ItemStatusUpdateResponse, ItemStatusUpdateResponse.Builder, ItemStatusUpdateResponseOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureItemStatusUpdateIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.itemStatusUpdate_);
                onChanged();
                return this;
            }

            public Builder addItemStatusUpdate(ItemStatusUpdateResponse.Builder builder) {
                RepeatedFieldBuilderV3<ItemStatusUpdateResponse, ItemStatusUpdateResponse.Builder, ItemStatusUpdateResponseOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureItemStatusUpdateIsMutable();
                this.itemStatusUpdate_.add(builder.build());
                onChanged();
                return this;
            }

            public ItemStatusUpdateResponse.Builder addItemStatusUpdateBuilder() {
                return (ItemStatusUpdateResponse.Builder) getItemStatusUpdateFieldBuilder().addBuilder(ItemStatusUpdateResponse.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ItemsStatusUpdateResponse build() {
                ItemsStatusUpdateResponse itemsStatusUpdateResponseBuildPartial = buildPartial();
                if (itemsStatusUpdateResponseBuildPartial.isInitialized()) {
                    return itemsStatusUpdateResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) itemsStatusUpdateResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ItemsStatusUpdateResponse buildPartial() {
                ItemsStatusUpdateResponse itemsStatusUpdateResponse = new ItemsStatusUpdateResponse(this);
                buildPartialRepeatedFields(itemsStatusUpdateResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(itemsStatusUpdateResponse);
                }
                onBuilt();
                return itemsStatusUpdateResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<ItemStatusUpdateResponse, ItemStatusUpdateResponse.Builder, ItemStatusUpdateResponseOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.itemStatusUpdate_ = Collections.EMPTY_LIST;
                } else {
                    this.itemStatusUpdate_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearItemStatusUpdate() {
                RepeatedFieldBuilderV3<ItemStatusUpdateResponse, ItemStatusUpdateResponse.Builder, ItemStatusUpdateResponseOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.itemStatusUpdate_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
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
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ItemsStatusUpdateResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ItemsStatusUpdateResponseOrBuilder
            public ItemStatusUpdateResponse getItemStatusUpdate(int i14) {
                RepeatedFieldBuilderV3<ItemStatusUpdateResponse, ItemStatusUpdateResponse.Builder, ItemStatusUpdateResponseOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                return repeatedFieldBuilderV3 == null ? this.itemStatusUpdate_.get(i14) : (ItemStatusUpdateResponse) repeatedFieldBuilderV3.getMessage(i14);
            }

            public ItemStatusUpdateResponse.Builder getItemStatusUpdateBuilder(int i14) {
                return (ItemStatusUpdateResponse.Builder) getItemStatusUpdateFieldBuilder().getBuilder(i14);
            }

            public List<ItemStatusUpdateResponse.Builder> getItemStatusUpdateBuilderList() {
                return getItemStatusUpdateFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ItemsStatusUpdateResponseOrBuilder
            public int getItemStatusUpdateCount() {
                RepeatedFieldBuilderV3<ItemStatusUpdateResponse, ItemStatusUpdateResponse.Builder, ItemStatusUpdateResponseOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                return repeatedFieldBuilderV3 == null ? this.itemStatusUpdate_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ItemsStatusUpdateResponseOrBuilder
            public List<ItemStatusUpdateResponse> getItemStatusUpdateList() {
                RepeatedFieldBuilderV3<ItemStatusUpdateResponse, ItemStatusUpdateResponse.Builder, ItemStatusUpdateResponseOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.itemStatusUpdate_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ItemsStatusUpdateResponseOrBuilder
            public ItemStatusUpdateResponseOrBuilder getItemStatusUpdateOrBuilder(int i14) {
                RepeatedFieldBuilderV3<ItemStatusUpdateResponse, ItemStatusUpdateResponse.Builder, ItemStatusUpdateResponseOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                return repeatedFieldBuilderV3 == null ? this.itemStatusUpdate_.get(i14) : (ItemStatusUpdateResponseOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ItemsStatusUpdateResponseOrBuilder
            public List<? extends ItemStatusUpdateResponseOrBuilder> getItemStatusUpdateOrBuilderList() {
                RepeatedFieldBuilderV3<ItemStatusUpdateResponse, ItemStatusUpdateResponse.Builder, ItemStatusUpdateResponseOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.itemStatusUpdate_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ItemsStatusUpdateResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemsStatusUpdateResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getItemStatusUpdateCount(); i14++) {
                    if (!getItemStatusUpdate(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(ItemsStatusUpdateResponse itemsStatusUpdateResponse) {
                if (itemsStatusUpdateResponse == ItemsStatusUpdateResponse.getDefaultInstance()) {
                    return this;
                }
                if (this.itemStatusUpdateBuilder_ == null) {
                    if (!itemsStatusUpdateResponse.itemStatusUpdate_.isEmpty()) {
                        if (this.itemStatusUpdate_.isEmpty()) {
                            this.itemStatusUpdate_ = itemsStatusUpdateResponse.itemStatusUpdate_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureItemStatusUpdateIsMutable();
                            this.itemStatusUpdate_.addAll(itemsStatusUpdateResponse.itemStatusUpdate_);
                        }
                        onChanged();
                    }
                } else if (!itemsStatusUpdateResponse.itemStatusUpdate_.isEmpty()) {
                    boolean zIsEmpty = this.itemStatusUpdateBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<ItemStatusUpdateResponse, ItemStatusUpdateResponse.Builder, ItemStatusUpdateResponseOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.itemStatusUpdateBuilder_ = null;
                        this.itemStatusUpdate_ = itemsStatusUpdateResponse.itemStatusUpdate_;
                        this.bitField0_ &= -2;
                        this.itemStatusUpdateBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getItemStatusUpdateFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(itemsStatusUpdateResponse.itemStatusUpdate_);
                    }
                }
                mergeUnknownFields(itemsStatusUpdateResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeItemStatusUpdate(int i14) {
                RepeatedFieldBuilderV3<ItemStatusUpdateResponse, ItemStatusUpdateResponse.Builder, ItemStatusUpdateResponseOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureItemStatusUpdateIsMutable();
                this.itemStatusUpdate_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setItemStatusUpdate(int i14, ItemStatusUpdateResponse.Builder builder) {
                RepeatedFieldBuilderV3<ItemStatusUpdateResponse, ItemStatusUpdateResponse.Builder, ItemStatusUpdateResponseOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureItemStatusUpdateIsMutable();
                this.itemStatusUpdate_.set(i14, builder.build());
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
            public ItemsStatusUpdateResponse getDefaultInstanceForType() {
                return ItemsStatusUpdateResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.itemStatusUpdate_ = Collections.EMPTY_LIST;
            }

            public ItemStatusUpdateResponse.Builder addItemStatusUpdateBuilder(int i14) {
                return (ItemStatusUpdateResponse.Builder) getItemStatusUpdateFieldBuilder().addBuilder(i14, ItemStatusUpdateResponse.getDefaultInstance());
            }

            public Builder addItemStatusUpdate(int i14, ItemStatusUpdateResponse itemStatusUpdateResponse) {
                RepeatedFieldBuilderV3<ItemStatusUpdateResponse, ItemStatusUpdateResponse.Builder, ItemStatusUpdateResponseOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    itemStatusUpdateResponse.getClass();
                    ensureItemStatusUpdateIsMutable();
                    this.itemStatusUpdate_.add(i14, itemStatusUpdateResponse);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, itemStatusUpdateResponse);
                return this;
            }

            public Builder setItemStatusUpdate(int i14, ItemStatusUpdateResponse itemStatusUpdateResponse) {
                RepeatedFieldBuilderV3<ItemStatusUpdateResponse, ItemStatusUpdateResponse.Builder, ItemStatusUpdateResponseOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    itemStatusUpdateResponse.getClass();
                    ensureItemStatusUpdateIsMutable();
                    this.itemStatusUpdate_.set(i14, itemStatusUpdateResponse);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, itemStatusUpdateResponse);
                return this;
            }

            public Builder addItemStatusUpdate(ItemStatusUpdateResponse itemStatusUpdateResponse) {
                RepeatedFieldBuilderV3<ItemStatusUpdateResponse, ItemStatusUpdateResponse.Builder, ItemStatusUpdateResponseOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    itemStatusUpdateResponse.getClass();
                    ensureItemStatusUpdateIsMutable();
                    this.itemStatusUpdate_.add(itemStatusUpdateResponse);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(itemStatusUpdateResponse);
                return this;
            }

            public Builder addItemStatusUpdate(int i14, ItemStatusUpdateResponse.Builder builder) {
                RepeatedFieldBuilderV3<ItemStatusUpdateResponse, ItemStatusUpdateResponse.Builder, ItemStatusUpdateResponseOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureItemStatusUpdateIsMutable();
                    this.itemStatusUpdate_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ItemsStatusUpdateResponse) {
                    return mergeFrom((ItemsStatusUpdateResponse) message);
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
                                    ItemStatusUpdateResponse itemStatusUpdateResponse = (ItemStatusUpdateResponse) codedInputStream.readMessage(ItemStatusUpdateResponse.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<ItemStatusUpdateResponse, ItemStatusUpdateResponse.Builder, ItemStatusUpdateResponseOrBuilder> repeatedFieldBuilderV3 = this.itemStatusUpdateBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureItemStatusUpdateIsMutable();
                                        this.itemStatusUpdate_.add(itemStatusUpdateResponse);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(itemStatusUpdateResponse);
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
        public ItemsStatusUpdateResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ItemsStatusUpdateResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemsStatusUpdateResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ItemsStatusUpdateResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ItemsStatusUpdateResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ItemsStatusUpdateResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ItemsStatusUpdateResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ItemsStatusUpdateResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ ItemsStatusUpdateResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ItemsStatusUpdateResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ItemsStatusUpdateResponse parseFrom(InputStream inputStream) {
            return (ItemsStatusUpdateResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ItemsStatusUpdateResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemsStatusUpdateResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ItemsStatusUpdateResponse parseFrom(CodedInputStream codedInputStream) {
            return (ItemsStatusUpdateResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ItemsStatusUpdateResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemsStatusUpdateResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class Service extends GeneratedMessageV3 implements ServiceOrBuilder {
        public static final int CONSENT_LINK_REQUEST_FIELD_NUMBER = 1;
        public static final int CONSENT_LINK_RESPONSE_FIELD_NUMBER = 2;
        public static final int ITEMS_STATUS_UPDATE_REQUEST_FIELD_NUMBER = 8;
        public static final int ITEMS_STATUS_UPDATE_RESPONSE_FIELD_NUMBER = 9;
        public static final int SHARE_ITEMS_REQUEST_FIELD_NUMBER = 5;
        public static final int SHARE_ITEMS_RESPONSE_FIELD_NUMBER = 6;
        public static final int SUPPORTED_RECEIVE_TYPES_REQUEST_FIELD_NUMBER = 3;
        public static final int SUPPORTED_RECEIVE_TYPES_RESPONSE_FIELD_NUMBER = 4;
        public static final int TRANSFER_START_NOTIFICATION_FIELD_NUMBER = 7;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ConsentLinkRequest consentLinkRequest_;
        private ConsentLinkResponse consentLinkResponse_;
        private ItemsStatusUpdateRequest itemsStatusUpdateRequest_;
        private ItemsStatusUpdateResponse itemsStatusUpdateResponse_;
        private byte memoizedIsInitialized;
        private ShareItemsRequest shareItemsRequest_;
        private ShareItemsResponse shareItemsResponse_;
        private SupportedReceiveTypesRequest supportedReceiveTypesRequest_;
        private SupportedReceiveTypesResponse supportedReceiveTypesResponse_;
        private TransferStartNotification transferStartNotification_;
        private static final Service DEFAULT_INSTANCE = new Service();

        @Deprecated
        public static final Parser<Service> PARSER = new AbstractParser<Service>() { // from class: com.garmin.proto.generated.GDIGarminShare.Service.1
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
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_Service_descriptor;
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
            if (hasConsentLinkRequest() != service.hasConsentLinkRequest()) {
                return false;
            }
            if ((hasConsentLinkRequest() && !getConsentLinkRequest().equals(service.getConsentLinkRequest())) || hasConsentLinkResponse() != service.hasConsentLinkResponse()) {
                return false;
            }
            if ((hasConsentLinkResponse() && !getConsentLinkResponse().equals(service.getConsentLinkResponse())) || hasSupportedReceiveTypesRequest() != service.hasSupportedReceiveTypesRequest()) {
                return false;
            }
            if ((hasSupportedReceiveTypesRequest() && !getSupportedReceiveTypesRequest().equals(service.getSupportedReceiveTypesRequest())) || hasSupportedReceiveTypesResponse() != service.hasSupportedReceiveTypesResponse()) {
                return false;
            }
            if ((hasSupportedReceiveTypesResponse() && !getSupportedReceiveTypesResponse().equals(service.getSupportedReceiveTypesResponse())) || hasShareItemsRequest() != service.hasShareItemsRequest()) {
                return false;
            }
            if ((hasShareItemsRequest() && !getShareItemsRequest().equals(service.getShareItemsRequest())) || hasShareItemsResponse() != service.hasShareItemsResponse()) {
                return false;
            }
            if ((hasShareItemsResponse() && !getShareItemsResponse().equals(service.getShareItemsResponse())) || hasTransferStartNotification() != service.hasTransferStartNotification()) {
                return false;
            }
            if ((hasTransferStartNotification() && !getTransferStartNotification().equals(service.getTransferStartNotification())) || hasItemsStatusUpdateRequest() != service.hasItemsStatusUpdateRequest()) {
                return false;
            }
            if ((!hasItemsStatusUpdateRequest() || getItemsStatusUpdateRequest().equals(service.getItemsStatusUpdateRequest())) && hasItemsStatusUpdateResponse() == service.hasItemsStatusUpdateResponse()) {
                return (!hasItemsStatusUpdateResponse() || getItemsStatusUpdateResponse().equals(service.getItemsStatusUpdateResponse())) && getUnknownFields().equals(service.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
        public ConsentLinkRequest getConsentLinkRequest() {
            ConsentLinkRequest consentLinkRequest = this.consentLinkRequest_;
            return consentLinkRequest == null ? ConsentLinkRequest.getDefaultInstance() : consentLinkRequest;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
        public ConsentLinkRequestOrBuilder getConsentLinkRequestOrBuilder() {
            ConsentLinkRequest consentLinkRequest = this.consentLinkRequest_;
            return consentLinkRequest == null ? ConsentLinkRequest.getDefaultInstance() : consentLinkRequest;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
        public ConsentLinkResponse getConsentLinkResponse() {
            ConsentLinkResponse consentLinkResponse = this.consentLinkResponse_;
            return consentLinkResponse == null ? ConsentLinkResponse.getDefaultInstance() : consentLinkResponse;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
        public ConsentLinkResponseOrBuilder getConsentLinkResponseOrBuilder() {
            ConsentLinkResponse consentLinkResponse = this.consentLinkResponse_;
            return consentLinkResponse == null ? ConsentLinkResponse.getDefaultInstance() : consentLinkResponse;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
        public ItemsStatusUpdateRequest getItemsStatusUpdateRequest() {
            ItemsStatusUpdateRequest itemsStatusUpdateRequest = this.itemsStatusUpdateRequest_;
            return itemsStatusUpdateRequest == null ? ItemsStatusUpdateRequest.getDefaultInstance() : itemsStatusUpdateRequest;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
        public ItemsStatusUpdateRequestOrBuilder getItemsStatusUpdateRequestOrBuilder() {
            ItemsStatusUpdateRequest itemsStatusUpdateRequest = this.itemsStatusUpdateRequest_;
            return itemsStatusUpdateRequest == null ? ItemsStatusUpdateRequest.getDefaultInstance() : itemsStatusUpdateRequest;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
        public ItemsStatusUpdateResponse getItemsStatusUpdateResponse() {
            ItemsStatusUpdateResponse itemsStatusUpdateResponse = this.itemsStatusUpdateResponse_;
            return itemsStatusUpdateResponse == null ? ItemsStatusUpdateResponse.getDefaultInstance() : itemsStatusUpdateResponse;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
        public ItemsStatusUpdateResponseOrBuilder getItemsStatusUpdateResponseOrBuilder() {
            ItemsStatusUpdateResponse itemsStatusUpdateResponse = this.itemsStatusUpdateResponse_;
            return itemsStatusUpdateResponse == null ? ItemsStatusUpdateResponse.getDefaultInstance() : itemsStatusUpdateResponse;
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
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getConsentLinkRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getConsentLinkResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getSupportedReceiveTypesRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getSupportedReceiveTypesResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getShareItemsRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getShareItemsResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(7, getTransferStartNotification());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(8, getItemsStatusUpdateRequest());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getItemsStatusUpdateResponse());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
        public ShareItemsRequest getShareItemsRequest() {
            ShareItemsRequest shareItemsRequest = this.shareItemsRequest_;
            return shareItemsRequest == null ? ShareItemsRequest.getDefaultInstance() : shareItemsRequest;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
        public ShareItemsRequestOrBuilder getShareItemsRequestOrBuilder() {
            ShareItemsRequest shareItemsRequest = this.shareItemsRequest_;
            return shareItemsRequest == null ? ShareItemsRequest.getDefaultInstance() : shareItemsRequest;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
        public ShareItemsResponse getShareItemsResponse() {
            ShareItemsResponse shareItemsResponse = this.shareItemsResponse_;
            return shareItemsResponse == null ? ShareItemsResponse.getDefaultInstance() : shareItemsResponse;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
        public ShareItemsResponseOrBuilder getShareItemsResponseOrBuilder() {
            ShareItemsResponse shareItemsResponse = this.shareItemsResponse_;
            return shareItemsResponse == null ? ShareItemsResponse.getDefaultInstance() : shareItemsResponse;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
        public SupportedReceiveTypesRequest getSupportedReceiveTypesRequest() {
            SupportedReceiveTypesRequest supportedReceiveTypesRequest = this.supportedReceiveTypesRequest_;
            return supportedReceiveTypesRequest == null ? SupportedReceiveTypesRequest.getDefaultInstance() : supportedReceiveTypesRequest;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
        public SupportedReceiveTypesRequestOrBuilder getSupportedReceiveTypesRequestOrBuilder() {
            SupportedReceiveTypesRequest supportedReceiveTypesRequest = this.supportedReceiveTypesRequest_;
            return supportedReceiveTypesRequest == null ? SupportedReceiveTypesRequest.getDefaultInstance() : supportedReceiveTypesRequest;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
        public SupportedReceiveTypesResponse getSupportedReceiveTypesResponse() {
            SupportedReceiveTypesResponse supportedReceiveTypesResponse = this.supportedReceiveTypesResponse_;
            return supportedReceiveTypesResponse == null ? SupportedReceiveTypesResponse.getDefaultInstance() : supportedReceiveTypesResponse;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
        public SupportedReceiveTypesResponseOrBuilder getSupportedReceiveTypesResponseOrBuilder() {
            SupportedReceiveTypesResponse supportedReceiveTypesResponse = this.supportedReceiveTypesResponse_;
            return supportedReceiveTypesResponse == null ? SupportedReceiveTypesResponse.getDefaultInstance() : supportedReceiveTypesResponse;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
        public TransferStartNotification getTransferStartNotification() {
            TransferStartNotification transferStartNotification = this.transferStartNotification_;
            return transferStartNotification == null ? TransferStartNotification.getDefaultInstance() : transferStartNotification;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
        public TransferStartNotificationOrBuilder getTransferStartNotificationOrBuilder() {
            TransferStartNotification transferStartNotification = this.transferStartNotification_;
            return transferStartNotification == null ? TransferStartNotification.getDefaultInstance() : transferStartNotification;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
        public boolean hasConsentLinkRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
        public boolean hasConsentLinkResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
        public boolean hasItemsStatusUpdateRequest() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
        public boolean hasItemsStatusUpdateResponse() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
        public boolean hasShareItemsRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
        public boolean hasShareItemsResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
        public boolean hasSupportedReceiveTypesRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
        public boolean hasSupportedReceiveTypesResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
        public boolean hasTransferStartNotification() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasConsentLinkRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getConsentLinkRequest().hashCode();
            }
            if (hasConsentLinkResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getConsentLinkResponse().hashCode();
            }
            if (hasSupportedReceiveTypesRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getSupportedReceiveTypesRequest().hashCode();
            }
            if (hasSupportedReceiveTypesResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getSupportedReceiveTypesResponse().hashCode();
            }
            if (hasShareItemsRequest()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getShareItemsRequest().hashCode();
            }
            if (hasShareItemsResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getShareItemsResponse().hashCode();
            }
            if (hasTransferStartNotification()) {
                iHashCode = e5.c(iHashCode, 37, 7, 53) + getTransferStartNotification().hashCode();
            }
            if (hasItemsStatusUpdateRequest()) {
                iHashCode = e5.c(iHashCode, 37, 8, 53) + getItemsStatusUpdateRequest().hashCode();
            }
            if (hasItemsStatusUpdateResponse()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getItemsStatusUpdateResponse().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
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
            if (hasConsentLinkRequest() && !getConsentLinkRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasShareItemsRequest() && !getShareItemsRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasShareItemsResponse() && !getShareItemsResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasTransferStartNotification() && !getTransferStartNotification().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasItemsStatusUpdateRequest() && !getItemsStatusUpdateRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasItemsStatusUpdateResponse() || getItemsStatusUpdateResponse().isInitialized()) {
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
                codedOutputStream.writeMessage(1, getConsentLinkRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getConsentLinkResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getSupportedReceiveTypesRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getSupportedReceiveTypesResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getShareItemsRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getShareItemsResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(7, getTransferStartNotification());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(8, getItemsStatusUpdateRequest());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(9, getItemsStatusUpdateResponse());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ServiceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<ConsentLinkRequest, ConsentLinkRequest.Builder, ConsentLinkRequestOrBuilder> consentLinkRequestBuilder_;
            private ConsentLinkRequest consentLinkRequest_;
            private SingleFieldBuilderV3<ConsentLinkResponse, ConsentLinkResponse.Builder, ConsentLinkResponseOrBuilder> consentLinkResponseBuilder_;
            private ConsentLinkResponse consentLinkResponse_;
            private SingleFieldBuilderV3<ItemsStatusUpdateRequest, ItemsStatusUpdateRequest.Builder, ItemsStatusUpdateRequestOrBuilder> itemsStatusUpdateRequestBuilder_;
            private ItemsStatusUpdateRequest itemsStatusUpdateRequest_;
            private SingleFieldBuilderV3<ItemsStatusUpdateResponse, ItemsStatusUpdateResponse.Builder, ItemsStatusUpdateResponseOrBuilder> itemsStatusUpdateResponseBuilder_;
            private ItemsStatusUpdateResponse itemsStatusUpdateResponse_;
            private SingleFieldBuilderV3<ShareItemsRequest, ShareItemsRequest.Builder, ShareItemsRequestOrBuilder> shareItemsRequestBuilder_;
            private ShareItemsRequest shareItemsRequest_;
            private SingleFieldBuilderV3<ShareItemsResponse, ShareItemsResponse.Builder, ShareItemsResponseOrBuilder> shareItemsResponseBuilder_;
            private ShareItemsResponse shareItemsResponse_;
            private SingleFieldBuilderV3<SupportedReceiveTypesRequest, SupportedReceiveTypesRequest.Builder, SupportedReceiveTypesRequestOrBuilder> supportedReceiveTypesRequestBuilder_;
            private SupportedReceiveTypesRequest supportedReceiveTypesRequest_;
            private SingleFieldBuilderV3<SupportedReceiveTypesResponse, SupportedReceiveTypesResponse.Builder, SupportedReceiveTypesResponseOrBuilder> supportedReceiveTypesResponseBuilder_;
            private SupportedReceiveTypesResponse supportedReceiveTypesResponse_;
            private SingleFieldBuilderV3<TransferStartNotification, TransferStartNotification.Builder, TransferStartNotificationOrBuilder> transferStartNotificationBuilder_;
            private TransferStartNotification transferStartNotification_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(Service service) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<ConsentLinkRequest, ConsentLinkRequest.Builder, ConsentLinkRequestOrBuilder> singleFieldBuilderV3 = this.consentLinkRequestBuilder_;
                    service.consentLinkRequest_ = singleFieldBuilderV3 == null ? this.consentLinkRequest_ : (ConsentLinkRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<ConsentLinkResponse, ConsentLinkResponse.Builder, ConsentLinkResponseOrBuilder> singleFieldBuilderV4 = this.consentLinkResponseBuilder_;
                    service.consentLinkResponse_ = singleFieldBuilderV4 == null ? this.consentLinkResponse_ : (ConsentLinkResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<SupportedReceiveTypesRequest, SupportedReceiveTypesRequest.Builder, SupportedReceiveTypesRequestOrBuilder> singleFieldBuilderV5 = this.supportedReceiveTypesRequestBuilder_;
                    service.supportedReceiveTypesRequest_ = singleFieldBuilderV5 == null ? this.supportedReceiveTypesRequest_ : (SupportedReceiveTypesRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<SupportedReceiveTypesResponse, SupportedReceiveTypesResponse.Builder, SupportedReceiveTypesResponseOrBuilder> singleFieldBuilderV6 = this.supportedReceiveTypesResponseBuilder_;
                    service.supportedReceiveTypesResponse_ = singleFieldBuilderV6 == null ? this.supportedReceiveTypesResponse_ : (SupportedReceiveTypesResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<ShareItemsRequest, ShareItemsRequest.Builder, ShareItemsRequestOrBuilder> singleFieldBuilderV7 = this.shareItemsRequestBuilder_;
                    service.shareItemsRequest_ = singleFieldBuilderV7 == null ? this.shareItemsRequest_ : (ShareItemsRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<ShareItemsResponse, ShareItemsResponse.Builder, ShareItemsResponseOrBuilder> singleFieldBuilderV8 = this.shareItemsResponseBuilder_;
                    service.shareItemsResponse_ = singleFieldBuilderV8 == null ? this.shareItemsResponse_ : (ShareItemsResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<TransferStartNotification, TransferStartNotification.Builder, TransferStartNotificationOrBuilder> singleFieldBuilderV9 = this.transferStartNotificationBuilder_;
                    service.transferStartNotification_ = singleFieldBuilderV9 == null ? this.transferStartNotification_ : (TransferStartNotification) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<ItemsStatusUpdateRequest, ItemsStatusUpdateRequest.Builder, ItemsStatusUpdateRequestOrBuilder> singleFieldBuilderV10 = this.itemsStatusUpdateRequestBuilder_;
                    service.itemsStatusUpdateRequest_ = singleFieldBuilderV10 == null ? this.itemsStatusUpdateRequest_ : (ItemsStatusUpdateRequest) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<ItemsStatusUpdateResponse, ItemsStatusUpdateResponse.Builder, ItemsStatusUpdateResponseOrBuilder> singleFieldBuilderV11 = this.itemsStatusUpdateResponseBuilder_;
                    service.itemsStatusUpdateResponse_ = singleFieldBuilderV11 == null ? this.itemsStatusUpdateResponse_ : (ItemsStatusUpdateResponse) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                service.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<ConsentLinkRequest, ConsentLinkRequest.Builder, ConsentLinkRequestOrBuilder> getConsentLinkRequestFieldBuilder() {
                if (this.consentLinkRequestBuilder_ == null) {
                    this.consentLinkRequestBuilder_ = new SingleFieldBuilderV3<>(getConsentLinkRequest(), getParentForChildren(), isClean());
                    this.consentLinkRequest_ = null;
                }
                return this.consentLinkRequestBuilder_;
            }

            private SingleFieldBuilderV3<ConsentLinkResponse, ConsentLinkResponse.Builder, ConsentLinkResponseOrBuilder> getConsentLinkResponseFieldBuilder() {
                if (this.consentLinkResponseBuilder_ == null) {
                    this.consentLinkResponseBuilder_ = new SingleFieldBuilderV3<>(getConsentLinkResponse(), getParentForChildren(), isClean());
                    this.consentLinkResponse_ = null;
                }
                return this.consentLinkResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_Service_descriptor;
            }

            private SingleFieldBuilderV3<ItemsStatusUpdateRequest, ItemsStatusUpdateRequest.Builder, ItemsStatusUpdateRequestOrBuilder> getItemsStatusUpdateRequestFieldBuilder() {
                if (this.itemsStatusUpdateRequestBuilder_ == null) {
                    this.itemsStatusUpdateRequestBuilder_ = new SingleFieldBuilderV3<>(getItemsStatusUpdateRequest(), getParentForChildren(), isClean());
                    this.itemsStatusUpdateRequest_ = null;
                }
                return this.itemsStatusUpdateRequestBuilder_;
            }

            private SingleFieldBuilderV3<ItemsStatusUpdateResponse, ItemsStatusUpdateResponse.Builder, ItemsStatusUpdateResponseOrBuilder> getItemsStatusUpdateResponseFieldBuilder() {
                if (this.itemsStatusUpdateResponseBuilder_ == null) {
                    this.itemsStatusUpdateResponseBuilder_ = new SingleFieldBuilderV3<>(getItemsStatusUpdateResponse(), getParentForChildren(), isClean());
                    this.itemsStatusUpdateResponse_ = null;
                }
                return this.itemsStatusUpdateResponseBuilder_;
            }

            private SingleFieldBuilderV3<ShareItemsRequest, ShareItemsRequest.Builder, ShareItemsRequestOrBuilder> getShareItemsRequestFieldBuilder() {
                if (this.shareItemsRequestBuilder_ == null) {
                    this.shareItemsRequestBuilder_ = new SingleFieldBuilderV3<>(getShareItemsRequest(), getParentForChildren(), isClean());
                    this.shareItemsRequest_ = null;
                }
                return this.shareItemsRequestBuilder_;
            }

            private SingleFieldBuilderV3<ShareItemsResponse, ShareItemsResponse.Builder, ShareItemsResponseOrBuilder> getShareItemsResponseFieldBuilder() {
                if (this.shareItemsResponseBuilder_ == null) {
                    this.shareItemsResponseBuilder_ = new SingleFieldBuilderV3<>(getShareItemsResponse(), getParentForChildren(), isClean());
                    this.shareItemsResponse_ = null;
                }
                return this.shareItemsResponseBuilder_;
            }

            private SingleFieldBuilderV3<SupportedReceiveTypesRequest, SupportedReceiveTypesRequest.Builder, SupportedReceiveTypesRequestOrBuilder> getSupportedReceiveTypesRequestFieldBuilder() {
                if (this.supportedReceiveTypesRequestBuilder_ == null) {
                    this.supportedReceiveTypesRequestBuilder_ = new SingleFieldBuilderV3<>(getSupportedReceiveTypesRequest(), getParentForChildren(), isClean());
                    this.supportedReceiveTypesRequest_ = null;
                }
                return this.supportedReceiveTypesRequestBuilder_;
            }

            private SingleFieldBuilderV3<SupportedReceiveTypesResponse, SupportedReceiveTypesResponse.Builder, SupportedReceiveTypesResponseOrBuilder> getSupportedReceiveTypesResponseFieldBuilder() {
                if (this.supportedReceiveTypesResponseBuilder_ == null) {
                    this.supportedReceiveTypesResponseBuilder_ = new SingleFieldBuilderV3<>(getSupportedReceiveTypesResponse(), getParentForChildren(), isClean());
                    this.supportedReceiveTypesResponse_ = null;
                }
                return this.supportedReceiveTypesResponseBuilder_;
            }

            private SingleFieldBuilderV3<TransferStartNotification, TransferStartNotification.Builder, TransferStartNotificationOrBuilder> getTransferStartNotificationFieldBuilder() {
                if (this.transferStartNotificationBuilder_ == null) {
                    this.transferStartNotificationBuilder_ = new SingleFieldBuilderV3<>(getTransferStartNotification(), getParentForChildren(), isClean());
                    this.transferStartNotification_ = null;
                }
                return this.transferStartNotificationBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getConsentLinkRequestFieldBuilder();
                    getConsentLinkResponseFieldBuilder();
                    getSupportedReceiveTypesRequestFieldBuilder();
                    getSupportedReceiveTypesResponseFieldBuilder();
                    getShareItemsRequestFieldBuilder();
                    getShareItemsResponseFieldBuilder();
                    getTransferStartNotificationFieldBuilder();
                    getItemsStatusUpdateRequestFieldBuilder();
                    getItemsStatusUpdateResponseFieldBuilder();
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
                this.consentLinkRequest_ = null;
                SingleFieldBuilderV3<ConsentLinkRequest, ConsentLinkRequest.Builder, ConsentLinkRequestOrBuilder> singleFieldBuilderV3 = this.consentLinkRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.consentLinkRequestBuilder_ = null;
                }
                this.consentLinkResponse_ = null;
                SingleFieldBuilderV3<ConsentLinkResponse, ConsentLinkResponse.Builder, ConsentLinkResponseOrBuilder> singleFieldBuilderV4 = this.consentLinkResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.consentLinkResponseBuilder_ = null;
                }
                this.supportedReceiveTypesRequest_ = null;
                SingleFieldBuilderV3<SupportedReceiveTypesRequest, SupportedReceiveTypesRequest.Builder, SupportedReceiveTypesRequestOrBuilder> singleFieldBuilderV5 = this.supportedReceiveTypesRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.supportedReceiveTypesRequestBuilder_ = null;
                }
                this.supportedReceiveTypesResponse_ = null;
                SingleFieldBuilderV3<SupportedReceiveTypesResponse, SupportedReceiveTypesResponse.Builder, SupportedReceiveTypesResponseOrBuilder> singleFieldBuilderV6 = this.supportedReceiveTypesResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.supportedReceiveTypesResponseBuilder_ = null;
                }
                this.shareItemsRequest_ = null;
                SingleFieldBuilderV3<ShareItemsRequest, ShareItemsRequest.Builder, ShareItemsRequestOrBuilder> singleFieldBuilderV7 = this.shareItemsRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.shareItemsRequestBuilder_ = null;
                }
                this.shareItemsResponse_ = null;
                SingleFieldBuilderV3<ShareItemsResponse, ShareItemsResponse.Builder, ShareItemsResponseOrBuilder> singleFieldBuilderV8 = this.shareItemsResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.shareItemsResponseBuilder_ = null;
                }
                this.transferStartNotification_ = null;
                SingleFieldBuilderV3<TransferStartNotification, TransferStartNotification.Builder, TransferStartNotificationOrBuilder> singleFieldBuilderV9 = this.transferStartNotificationBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.transferStartNotificationBuilder_ = null;
                }
                this.itemsStatusUpdateRequest_ = null;
                SingleFieldBuilderV3<ItemsStatusUpdateRequest, ItemsStatusUpdateRequest.Builder, ItemsStatusUpdateRequestOrBuilder> singleFieldBuilderV10 = this.itemsStatusUpdateRequestBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.itemsStatusUpdateRequestBuilder_ = null;
                }
                this.itemsStatusUpdateResponse_ = null;
                SingleFieldBuilderV3<ItemsStatusUpdateResponse, ItemsStatusUpdateResponse.Builder, ItemsStatusUpdateResponseOrBuilder> singleFieldBuilderV11 = this.itemsStatusUpdateResponseBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.itemsStatusUpdateResponseBuilder_ = null;
                }
                return this;
            }

            public Builder clearConsentLinkRequest() {
                this.bitField0_ &= -2;
                this.consentLinkRequest_ = null;
                SingleFieldBuilderV3<ConsentLinkRequest, ConsentLinkRequest.Builder, ConsentLinkRequestOrBuilder> singleFieldBuilderV3 = this.consentLinkRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.consentLinkRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearConsentLinkResponse() {
                this.bitField0_ &= -3;
                this.consentLinkResponse_ = null;
                SingleFieldBuilderV3<ConsentLinkResponse, ConsentLinkResponse.Builder, ConsentLinkResponseOrBuilder> singleFieldBuilderV3 = this.consentLinkResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.consentLinkResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearItemsStatusUpdateRequest() {
                this.bitField0_ &= -129;
                this.itemsStatusUpdateRequest_ = null;
                SingleFieldBuilderV3<ItemsStatusUpdateRequest, ItemsStatusUpdateRequest.Builder, ItemsStatusUpdateRequestOrBuilder> singleFieldBuilderV3 = this.itemsStatusUpdateRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.itemsStatusUpdateRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearItemsStatusUpdateResponse() {
                this.bitField0_ &= -257;
                this.itemsStatusUpdateResponse_ = null;
                SingleFieldBuilderV3<ItemsStatusUpdateResponse, ItemsStatusUpdateResponse.Builder, ItemsStatusUpdateResponseOrBuilder> singleFieldBuilderV3 = this.itemsStatusUpdateResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.itemsStatusUpdateResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearShareItemsRequest() {
                this.bitField0_ &= -17;
                this.shareItemsRequest_ = null;
                SingleFieldBuilderV3<ShareItemsRequest, ShareItemsRequest.Builder, ShareItemsRequestOrBuilder> singleFieldBuilderV3 = this.shareItemsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.shareItemsRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearShareItemsResponse() {
                this.bitField0_ &= -33;
                this.shareItemsResponse_ = null;
                SingleFieldBuilderV3<ShareItemsResponse, ShareItemsResponse.Builder, ShareItemsResponseOrBuilder> singleFieldBuilderV3 = this.shareItemsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.shareItemsResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSupportedReceiveTypesRequest() {
                this.bitField0_ &= -5;
                this.supportedReceiveTypesRequest_ = null;
                SingleFieldBuilderV3<SupportedReceiveTypesRequest, SupportedReceiveTypesRequest.Builder, SupportedReceiveTypesRequestOrBuilder> singleFieldBuilderV3 = this.supportedReceiveTypesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.supportedReceiveTypesRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearSupportedReceiveTypesResponse() {
                this.bitField0_ &= -9;
                this.supportedReceiveTypesResponse_ = null;
                SingleFieldBuilderV3<SupportedReceiveTypesResponse, SupportedReceiveTypesResponse.Builder, SupportedReceiveTypesResponseOrBuilder> singleFieldBuilderV3 = this.supportedReceiveTypesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.supportedReceiveTypesResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearTransferStartNotification() {
                this.bitField0_ &= -65;
                this.transferStartNotification_ = null;
                SingleFieldBuilderV3<TransferStartNotification, TransferStartNotification.Builder, TransferStartNotificationOrBuilder> singleFieldBuilderV3 = this.transferStartNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.transferStartNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
            public ConsentLinkRequest getConsentLinkRequest() {
                SingleFieldBuilderV3<ConsentLinkRequest, ConsentLinkRequest.Builder, ConsentLinkRequestOrBuilder> singleFieldBuilderV3 = this.consentLinkRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConsentLinkRequest) singleFieldBuilderV3.getMessage();
                }
                ConsentLinkRequest consentLinkRequest = this.consentLinkRequest_;
                return consentLinkRequest == null ? ConsentLinkRequest.getDefaultInstance() : consentLinkRequest;
            }

            public ConsentLinkRequest.Builder getConsentLinkRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ConsentLinkRequest.Builder) getConsentLinkRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
            public ConsentLinkRequestOrBuilder getConsentLinkRequestOrBuilder() {
                SingleFieldBuilderV3<ConsentLinkRequest, ConsentLinkRequest.Builder, ConsentLinkRequestOrBuilder> singleFieldBuilderV3 = this.consentLinkRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConsentLinkRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConsentLinkRequest consentLinkRequest = this.consentLinkRequest_;
                return consentLinkRequest == null ? ConsentLinkRequest.getDefaultInstance() : consentLinkRequest;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
            public ConsentLinkResponse getConsentLinkResponse() {
                SingleFieldBuilderV3<ConsentLinkResponse, ConsentLinkResponse.Builder, ConsentLinkResponseOrBuilder> singleFieldBuilderV3 = this.consentLinkResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConsentLinkResponse) singleFieldBuilderV3.getMessage();
                }
                ConsentLinkResponse consentLinkResponse = this.consentLinkResponse_;
                return consentLinkResponse == null ? ConsentLinkResponse.getDefaultInstance() : consentLinkResponse;
            }

            public ConsentLinkResponse.Builder getConsentLinkResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ConsentLinkResponse.Builder) getConsentLinkResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
            public ConsentLinkResponseOrBuilder getConsentLinkResponseOrBuilder() {
                SingleFieldBuilderV3<ConsentLinkResponse, ConsentLinkResponse.Builder, ConsentLinkResponseOrBuilder> singleFieldBuilderV3 = this.consentLinkResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ConsentLinkResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ConsentLinkResponse consentLinkResponse = this.consentLinkResponse_;
                return consentLinkResponse == null ? ConsentLinkResponse.getDefaultInstance() : consentLinkResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_Service_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
            public ItemsStatusUpdateRequest getItemsStatusUpdateRequest() {
                SingleFieldBuilderV3<ItemsStatusUpdateRequest, ItemsStatusUpdateRequest.Builder, ItemsStatusUpdateRequestOrBuilder> singleFieldBuilderV3 = this.itemsStatusUpdateRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ItemsStatusUpdateRequest) singleFieldBuilderV3.getMessage();
                }
                ItemsStatusUpdateRequest itemsStatusUpdateRequest = this.itemsStatusUpdateRequest_;
                return itemsStatusUpdateRequest == null ? ItemsStatusUpdateRequest.getDefaultInstance() : itemsStatusUpdateRequest;
            }

            public ItemsStatusUpdateRequest.Builder getItemsStatusUpdateRequestBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (ItemsStatusUpdateRequest.Builder) getItemsStatusUpdateRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
            public ItemsStatusUpdateRequestOrBuilder getItemsStatusUpdateRequestOrBuilder() {
                SingleFieldBuilderV3<ItemsStatusUpdateRequest, ItemsStatusUpdateRequest.Builder, ItemsStatusUpdateRequestOrBuilder> singleFieldBuilderV3 = this.itemsStatusUpdateRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ItemsStatusUpdateRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ItemsStatusUpdateRequest itemsStatusUpdateRequest = this.itemsStatusUpdateRequest_;
                return itemsStatusUpdateRequest == null ? ItemsStatusUpdateRequest.getDefaultInstance() : itemsStatusUpdateRequest;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
            public ItemsStatusUpdateResponse getItemsStatusUpdateResponse() {
                SingleFieldBuilderV3<ItemsStatusUpdateResponse, ItemsStatusUpdateResponse.Builder, ItemsStatusUpdateResponseOrBuilder> singleFieldBuilderV3 = this.itemsStatusUpdateResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ItemsStatusUpdateResponse) singleFieldBuilderV3.getMessage();
                }
                ItemsStatusUpdateResponse itemsStatusUpdateResponse = this.itemsStatusUpdateResponse_;
                return itemsStatusUpdateResponse == null ? ItemsStatusUpdateResponse.getDefaultInstance() : itemsStatusUpdateResponse;
            }

            public ItemsStatusUpdateResponse.Builder getItemsStatusUpdateResponseBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (ItemsStatusUpdateResponse.Builder) getItemsStatusUpdateResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
            public ItemsStatusUpdateResponseOrBuilder getItemsStatusUpdateResponseOrBuilder() {
                SingleFieldBuilderV3<ItemsStatusUpdateResponse, ItemsStatusUpdateResponse.Builder, ItemsStatusUpdateResponseOrBuilder> singleFieldBuilderV3 = this.itemsStatusUpdateResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ItemsStatusUpdateResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ItemsStatusUpdateResponse itemsStatusUpdateResponse = this.itemsStatusUpdateResponse_;
                return itemsStatusUpdateResponse == null ? ItemsStatusUpdateResponse.getDefaultInstance() : itemsStatusUpdateResponse;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
            public ShareItemsRequest getShareItemsRequest() {
                SingleFieldBuilderV3<ShareItemsRequest, ShareItemsRequest.Builder, ShareItemsRequestOrBuilder> singleFieldBuilderV3 = this.shareItemsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ShareItemsRequest) singleFieldBuilderV3.getMessage();
                }
                ShareItemsRequest shareItemsRequest = this.shareItemsRequest_;
                return shareItemsRequest == null ? ShareItemsRequest.getDefaultInstance() : shareItemsRequest;
            }

            public ShareItemsRequest.Builder getShareItemsRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (ShareItemsRequest.Builder) getShareItemsRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
            public ShareItemsRequestOrBuilder getShareItemsRequestOrBuilder() {
                SingleFieldBuilderV3<ShareItemsRequest, ShareItemsRequest.Builder, ShareItemsRequestOrBuilder> singleFieldBuilderV3 = this.shareItemsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ShareItemsRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ShareItemsRequest shareItemsRequest = this.shareItemsRequest_;
                return shareItemsRequest == null ? ShareItemsRequest.getDefaultInstance() : shareItemsRequest;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
            public ShareItemsResponse getShareItemsResponse() {
                SingleFieldBuilderV3<ShareItemsResponse, ShareItemsResponse.Builder, ShareItemsResponseOrBuilder> singleFieldBuilderV3 = this.shareItemsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ShareItemsResponse) singleFieldBuilderV3.getMessage();
                }
                ShareItemsResponse shareItemsResponse = this.shareItemsResponse_;
                return shareItemsResponse == null ? ShareItemsResponse.getDefaultInstance() : shareItemsResponse;
            }

            public ShareItemsResponse.Builder getShareItemsResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (ShareItemsResponse.Builder) getShareItemsResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
            public ShareItemsResponseOrBuilder getShareItemsResponseOrBuilder() {
                SingleFieldBuilderV3<ShareItemsResponse, ShareItemsResponse.Builder, ShareItemsResponseOrBuilder> singleFieldBuilderV3 = this.shareItemsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ShareItemsResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ShareItemsResponse shareItemsResponse = this.shareItemsResponse_;
                return shareItemsResponse == null ? ShareItemsResponse.getDefaultInstance() : shareItemsResponse;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
            public SupportedReceiveTypesRequest getSupportedReceiveTypesRequest() {
                SingleFieldBuilderV3<SupportedReceiveTypesRequest, SupportedReceiveTypesRequest.Builder, SupportedReceiveTypesRequestOrBuilder> singleFieldBuilderV3 = this.supportedReceiveTypesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SupportedReceiveTypesRequest) singleFieldBuilderV3.getMessage();
                }
                SupportedReceiveTypesRequest supportedReceiveTypesRequest = this.supportedReceiveTypesRequest_;
                return supportedReceiveTypesRequest == null ? SupportedReceiveTypesRequest.getDefaultInstance() : supportedReceiveTypesRequest;
            }

            public SupportedReceiveTypesRequest.Builder getSupportedReceiveTypesRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (SupportedReceiveTypesRequest.Builder) getSupportedReceiveTypesRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
            public SupportedReceiveTypesRequestOrBuilder getSupportedReceiveTypesRequestOrBuilder() {
                SingleFieldBuilderV3<SupportedReceiveTypesRequest, SupportedReceiveTypesRequest.Builder, SupportedReceiveTypesRequestOrBuilder> singleFieldBuilderV3 = this.supportedReceiveTypesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SupportedReceiveTypesRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SupportedReceiveTypesRequest supportedReceiveTypesRequest = this.supportedReceiveTypesRequest_;
                return supportedReceiveTypesRequest == null ? SupportedReceiveTypesRequest.getDefaultInstance() : supportedReceiveTypesRequest;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
            public SupportedReceiveTypesResponse getSupportedReceiveTypesResponse() {
                SingleFieldBuilderV3<SupportedReceiveTypesResponse, SupportedReceiveTypesResponse.Builder, SupportedReceiveTypesResponseOrBuilder> singleFieldBuilderV3 = this.supportedReceiveTypesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SupportedReceiveTypesResponse) singleFieldBuilderV3.getMessage();
                }
                SupportedReceiveTypesResponse supportedReceiveTypesResponse = this.supportedReceiveTypesResponse_;
                return supportedReceiveTypesResponse == null ? SupportedReceiveTypesResponse.getDefaultInstance() : supportedReceiveTypesResponse;
            }

            public SupportedReceiveTypesResponse.Builder getSupportedReceiveTypesResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (SupportedReceiveTypesResponse.Builder) getSupportedReceiveTypesResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
            public SupportedReceiveTypesResponseOrBuilder getSupportedReceiveTypesResponseOrBuilder() {
                SingleFieldBuilderV3<SupportedReceiveTypesResponse, SupportedReceiveTypesResponse.Builder, SupportedReceiveTypesResponseOrBuilder> singleFieldBuilderV3 = this.supportedReceiveTypesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SupportedReceiveTypesResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SupportedReceiveTypesResponse supportedReceiveTypesResponse = this.supportedReceiveTypesResponse_;
                return supportedReceiveTypesResponse == null ? SupportedReceiveTypesResponse.getDefaultInstance() : supportedReceiveTypesResponse;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
            public TransferStartNotification getTransferStartNotification() {
                SingleFieldBuilderV3<TransferStartNotification, TransferStartNotification.Builder, TransferStartNotificationOrBuilder> singleFieldBuilderV3 = this.transferStartNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TransferStartNotification) singleFieldBuilderV3.getMessage();
                }
                TransferStartNotification transferStartNotification = this.transferStartNotification_;
                return transferStartNotification == null ? TransferStartNotification.getDefaultInstance() : transferStartNotification;
            }

            public TransferStartNotification.Builder getTransferStartNotificationBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (TransferStartNotification.Builder) getTransferStartNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
            public TransferStartNotificationOrBuilder getTransferStartNotificationOrBuilder() {
                SingleFieldBuilderV3<TransferStartNotification, TransferStartNotification.Builder, TransferStartNotificationOrBuilder> singleFieldBuilderV3 = this.transferStartNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (TransferStartNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                TransferStartNotification transferStartNotification = this.transferStartNotification_;
                return transferStartNotification == null ? TransferStartNotification.getDefaultInstance() : transferStartNotification;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
            public boolean hasConsentLinkRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
            public boolean hasConsentLinkResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
            public boolean hasItemsStatusUpdateRequest() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
            public boolean hasItemsStatusUpdateResponse() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
            public boolean hasShareItemsRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
            public boolean hasShareItemsResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
            public boolean hasSupportedReceiveTypesRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
            public boolean hasSupportedReceiveTypesResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ServiceOrBuilder
            public boolean hasTransferStartNotification() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_Service_fieldAccessorTable.ensureFieldAccessorsInitialized(Service.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasConsentLinkRequest() && !getConsentLinkRequest().isInitialized()) {
                    return false;
                }
                if (hasShareItemsRequest() && !getShareItemsRequest().isInitialized()) {
                    return false;
                }
                if (hasShareItemsResponse() && !getShareItemsResponse().isInitialized()) {
                    return false;
                }
                if (hasTransferStartNotification() && !getTransferStartNotification().isInitialized()) {
                    return false;
                }
                if (!hasItemsStatusUpdateRequest() || getItemsStatusUpdateRequest().isInitialized()) {
                    return !hasItemsStatusUpdateResponse() || getItemsStatusUpdateResponse().isInitialized();
                }
                return false;
            }

            public Builder mergeConsentLinkRequest(ConsentLinkRequest consentLinkRequest) {
                ConsentLinkRequest consentLinkRequest2;
                SingleFieldBuilderV3<ConsentLinkRequest, ConsentLinkRequest.Builder, ConsentLinkRequestOrBuilder> singleFieldBuilderV3 = this.consentLinkRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(consentLinkRequest);
                } else if ((this.bitField0_ & 1) == 0 || (consentLinkRequest2 = this.consentLinkRequest_) == null || consentLinkRequest2 == ConsentLinkRequest.getDefaultInstance()) {
                    this.consentLinkRequest_ = consentLinkRequest;
                } else {
                    getConsentLinkRequestBuilder().mergeFrom(consentLinkRequest);
                }
                if (this.consentLinkRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeConsentLinkResponse(ConsentLinkResponse consentLinkResponse) {
                ConsentLinkResponse consentLinkResponse2;
                SingleFieldBuilderV3<ConsentLinkResponse, ConsentLinkResponse.Builder, ConsentLinkResponseOrBuilder> singleFieldBuilderV3 = this.consentLinkResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(consentLinkResponse);
                } else if ((this.bitField0_ & 2) == 0 || (consentLinkResponse2 = this.consentLinkResponse_) == null || consentLinkResponse2 == ConsentLinkResponse.getDefaultInstance()) {
                    this.consentLinkResponse_ = consentLinkResponse;
                } else {
                    getConsentLinkResponseBuilder().mergeFrom(consentLinkResponse);
                }
                if (this.consentLinkResponse_ != null) {
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
                                    codedInputStream.readMessage(getConsentLinkRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getConsentLinkResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getSupportedReceiveTypesRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getSupportedReceiveTypesResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getShareItemsRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(getShareItemsResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                } else if (tag == 58) {
                                    codedInputStream.readMessage(getTransferStartNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                } else if (tag == 66) {
                                    codedInputStream.readMessage(getItemsStatusUpdateRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                } else if (tag == 74) {
                                    codedInputStream.readMessage(getItemsStatusUpdateResponseFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeItemsStatusUpdateRequest(ItemsStatusUpdateRequest itemsStatusUpdateRequest) {
                ItemsStatusUpdateRequest itemsStatusUpdateRequest2;
                SingleFieldBuilderV3<ItemsStatusUpdateRequest, ItemsStatusUpdateRequest.Builder, ItemsStatusUpdateRequestOrBuilder> singleFieldBuilderV3 = this.itemsStatusUpdateRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(itemsStatusUpdateRequest);
                } else if ((this.bitField0_ & 128) == 0 || (itemsStatusUpdateRequest2 = this.itemsStatusUpdateRequest_) == null || itemsStatusUpdateRequest2 == ItemsStatusUpdateRequest.getDefaultInstance()) {
                    this.itemsStatusUpdateRequest_ = itemsStatusUpdateRequest;
                } else {
                    getItemsStatusUpdateRequestBuilder().mergeFrom(itemsStatusUpdateRequest);
                }
                if (this.itemsStatusUpdateRequest_ != null) {
                    this.bitField0_ |= 128;
                    onChanged();
                }
                return this;
            }

            public Builder mergeItemsStatusUpdateResponse(ItemsStatusUpdateResponse itemsStatusUpdateResponse) {
                ItemsStatusUpdateResponse itemsStatusUpdateResponse2;
                SingleFieldBuilderV3<ItemsStatusUpdateResponse, ItemsStatusUpdateResponse.Builder, ItemsStatusUpdateResponseOrBuilder> singleFieldBuilderV3 = this.itemsStatusUpdateResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(itemsStatusUpdateResponse);
                } else if ((this.bitField0_ & 256) == 0 || (itemsStatusUpdateResponse2 = this.itemsStatusUpdateResponse_) == null || itemsStatusUpdateResponse2 == ItemsStatusUpdateResponse.getDefaultInstance()) {
                    this.itemsStatusUpdateResponse_ = itemsStatusUpdateResponse;
                } else {
                    getItemsStatusUpdateResponseBuilder().mergeFrom(itemsStatusUpdateResponse);
                }
                if (this.itemsStatusUpdateResponse_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            public Builder mergeShareItemsRequest(ShareItemsRequest shareItemsRequest) {
                ShareItemsRequest shareItemsRequest2;
                SingleFieldBuilderV3<ShareItemsRequest, ShareItemsRequest.Builder, ShareItemsRequestOrBuilder> singleFieldBuilderV3 = this.shareItemsRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(shareItemsRequest);
                } else if ((this.bitField0_ & 16) == 0 || (shareItemsRequest2 = this.shareItemsRequest_) == null || shareItemsRequest2 == ShareItemsRequest.getDefaultInstance()) {
                    this.shareItemsRequest_ = shareItemsRequest;
                } else {
                    getShareItemsRequestBuilder().mergeFrom(shareItemsRequest);
                }
                if (this.shareItemsRequest_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeShareItemsResponse(ShareItemsResponse shareItemsResponse) {
                ShareItemsResponse shareItemsResponse2;
                SingleFieldBuilderV3<ShareItemsResponse, ShareItemsResponse.Builder, ShareItemsResponseOrBuilder> singleFieldBuilderV3 = this.shareItemsResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(shareItemsResponse);
                } else if ((this.bitField0_ & 32) == 0 || (shareItemsResponse2 = this.shareItemsResponse_) == null || shareItemsResponse2 == ShareItemsResponse.getDefaultInstance()) {
                    this.shareItemsResponse_ = shareItemsResponse;
                } else {
                    getShareItemsResponseBuilder().mergeFrom(shareItemsResponse);
                }
                if (this.shareItemsResponse_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSupportedReceiveTypesRequest(SupportedReceiveTypesRequest supportedReceiveTypesRequest) {
                SupportedReceiveTypesRequest supportedReceiveTypesRequest2;
                SingleFieldBuilderV3<SupportedReceiveTypesRequest, SupportedReceiveTypesRequest.Builder, SupportedReceiveTypesRequestOrBuilder> singleFieldBuilderV3 = this.supportedReceiveTypesRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(supportedReceiveTypesRequest);
                } else if ((this.bitField0_ & 4) == 0 || (supportedReceiveTypesRequest2 = this.supportedReceiveTypesRequest_) == null || supportedReceiveTypesRequest2 == SupportedReceiveTypesRequest.getDefaultInstance()) {
                    this.supportedReceiveTypesRequest_ = supportedReceiveTypesRequest;
                } else {
                    getSupportedReceiveTypesRequestBuilder().mergeFrom(supportedReceiveTypesRequest);
                }
                if (this.supportedReceiveTypesRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSupportedReceiveTypesResponse(SupportedReceiveTypesResponse supportedReceiveTypesResponse) {
                SupportedReceiveTypesResponse supportedReceiveTypesResponse2;
                SingleFieldBuilderV3<SupportedReceiveTypesResponse, SupportedReceiveTypesResponse.Builder, SupportedReceiveTypesResponseOrBuilder> singleFieldBuilderV3 = this.supportedReceiveTypesResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(supportedReceiveTypesResponse);
                } else if ((this.bitField0_ & 8) == 0 || (supportedReceiveTypesResponse2 = this.supportedReceiveTypesResponse_) == null || supportedReceiveTypesResponse2 == SupportedReceiveTypesResponse.getDefaultInstance()) {
                    this.supportedReceiveTypesResponse_ = supportedReceiveTypesResponse;
                } else {
                    getSupportedReceiveTypesResponseBuilder().mergeFrom(supportedReceiveTypesResponse);
                }
                if (this.supportedReceiveTypesResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeTransferStartNotification(TransferStartNotification transferStartNotification) {
                TransferStartNotification transferStartNotification2;
                SingleFieldBuilderV3<TransferStartNotification, TransferStartNotification.Builder, TransferStartNotificationOrBuilder> singleFieldBuilderV3 = this.transferStartNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(transferStartNotification);
                } else if ((this.bitField0_ & 64) == 0 || (transferStartNotification2 = this.transferStartNotification_) == null || transferStartNotification2 == TransferStartNotification.getDefaultInstance()) {
                    this.transferStartNotification_ = transferStartNotification;
                } else {
                    getTransferStartNotificationBuilder().mergeFrom(transferStartNotification);
                }
                if (this.transferStartNotification_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setConsentLinkRequest(ConsentLinkRequest.Builder builder) {
                SingleFieldBuilderV3<ConsentLinkRequest, ConsentLinkRequest.Builder, ConsentLinkRequestOrBuilder> singleFieldBuilderV3 = this.consentLinkRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.consentLinkRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setConsentLinkResponse(ConsentLinkResponse.Builder builder) {
                SingleFieldBuilderV3<ConsentLinkResponse, ConsentLinkResponse.Builder, ConsentLinkResponseOrBuilder> singleFieldBuilderV3 = this.consentLinkResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.consentLinkResponse_ = builder.build();
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

            public Builder setItemsStatusUpdateRequest(ItemsStatusUpdateRequest.Builder builder) {
                SingleFieldBuilderV3<ItemsStatusUpdateRequest, ItemsStatusUpdateRequest.Builder, ItemsStatusUpdateRequestOrBuilder> singleFieldBuilderV3 = this.itemsStatusUpdateRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.itemsStatusUpdateRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setItemsStatusUpdateResponse(ItemsStatusUpdateResponse.Builder builder) {
                SingleFieldBuilderV3<ItemsStatusUpdateResponse, ItemsStatusUpdateResponse.Builder, ItemsStatusUpdateResponseOrBuilder> singleFieldBuilderV3 = this.itemsStatusUpdateResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.itemsStatusUpdateResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setShareItemsRequest(ShareItemsRequest.Builder builder) {
                SingleFieldBuilderV3<ShareItemsRequest, ShareItemsRequest.Builder, ShareItemsRequestOrBuilder> singleFieldBuilderV3 = this.shareItemsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.shareItemsRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setShareItemsResponse(ShareItemsResponse.Builder builder) {
                SingleFieldBuilderV3<ShareItemsResponse, ShareItemsResponse.Builder, ShareItemsResponseOrBuilder> singleFieldBuilderV3 = this.shareItemsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.shareItemsResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setSupportedReceiveTypesRequest(SupportedReceiveTypesRequest.Builder builder) {
                SingleFieldBuilderV3<SupportedReceiveTypesRequest, SupportedReceiveTypesRequest.Builder, SupportedReceiveTypesRequestOrBuilder> singleFieldBuilderV3 = this.supportedReceiveTypesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.supportedReceiveTypesRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSupportedReceiveTypesResponse(SupportedReceiveTypesResponse.Builder builder) {
                SingleFieldBuilderV3<SupportedReceiveTypesResponse, SupportedReceiveTypesResponse.Builder, SupportedReceiveTypesResponseOrBuilder> singleFieldBuilderV3 = this.supportedReceiveTypesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.supportedReceiveTypesResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setTransferStartNotification(TransferStartNotification.Builder builder) {
                SingleFieldBuilderV3<TransferStartNotification, TransferStartNotification.Builder, TransferStartNotificationOrBuilder> singleFieldBuilderV3 = this.transferStartNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.transferStartNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
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

            public Builder setConsentLinkRequest(ConsentLinkRequest consentLinkRequest) {
                SingleFieldBuilderV3<ConsentLinkRequest, ConsentLinkRequest.Builder, ConsentLinkRequestOrBuilder> singleFieldBuilderV3 = this.consentLinkRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    consentLinkRequest.getClass();
                    this.consentLinkRequest_ = consentLinkRequest;
                } else {
                    singleFieldBuilderV3.setMessage(consentLinkRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setConsentLinkResponse(ConsentLinkResponse consentLinkResponse) {
                SingleFieldBuilderV3<ConsentLinkResponse, ConsentLinkResponse.Builder, ConsentLinkResponseOrBuilder> singleFieldBuilderV3 = this.consentLinkResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    consentLinkResponse.getClass();
                    this.consentLinkResponse_ = consentLinkResponse;
                } else {
                    singleFieldBuilderV3.setMessage(consentLinkResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setItemsStatusUpdateRequest(ItemsStatusUpdateRequest itemsStatusUpdateRequest) {
                SingleFieldBuilderV3<ItemsStatusUpdateRequest, ItemsStatusUpdateRequest.Builder, ItemsStatusUpdateRequestOrBuilder> singleFieldBuilderV3 = this.itemsStatusUpdateRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    itemsStatusUpdateRequest.getClass();
                    this.itemsStatusUpdateRequest_ = itemsStatusUpdateRequest;
                } else {
                    singleFieldBuilderV3.setMessage(itemsStatusUpdateRequest);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setItemsStatusUpdateResponse(ItemsStatusUpdateResponse itemsStatusUpdateResponse) {
                SingleFieldBuilderV3<ItemsStatusUpdateResponse, ItemsStatusUpdateResponse.Builder, ItemsStatusUpdateResponseOrBuilder> singleFieldBuilderV3 = this.itemsStatusUpdateResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    itemsStatusUpdateResponse.getClass();
                    this.itemsStatusUpdateResponse_ = itemsStatusUpdateResponse;
                } else {
                    singleFieldBuilderV3.setMessage(itemsStatusUpdateResponse);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            public Builder setShareItemsRequest(ShareItemsRequest shareItemsRequest) {
                SingleFieldBuilderV3<ShareItemsRequest, ShareItemsRequest.Builder, ShareItemsRequestOrBuilder> singleFieldBuilderV3 = this.shareItemsRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    shareItemsRequest.getClass();
                    this.shareItemsRequest_ = shareItemsRequest;
                } else {
                    singleFieldBuilderV3.setMessage(shareItemsRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setShareItemsResponse(ShareItemsResponse shareItemsResponse) {
                SingleFieldBuilderV3<ShareItemsResponse, ShareItemsResponse.Builder, ShareItemsResponseOrBuilder> singleFieldBuilderV3 = this.shareItemsResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    shareItemsResponse.getClass();
                    this.shareItemsResponse_ = shareItemsResponse;
                } else {
                    singleFieldBuilderV3.setMessage(shareItemsResponse);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setSupportedReceiveTypesRequest(SupportedReceiveTypesRequest supportedReceiveTypesRequest) {
                SingleFieldBuilderV3<SupportedReceiveTypesRequest, SupportedReceiveTypesRequest.Builder, SupportedReceiveTypesRequestOrBuilder> singleFieldBuilderV3 = this.supportedReceiveTypesRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    supportedReceiveTypesRequest.getClass();
                    this.supportedReceiveTypesRequest_ = supportedReceiveTypesRequest;
                } else {
                    singleFieldBuilderV3.setMessage(supportedReceiveTypesRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setSupportedReceiveTypesResponse(SupportedReceiveTypesResponse supportedReceiveTypesResponse) {
                SingleFieldBuilderV3<SupportedReceiveTypesResponse, SupportedReceiveTypesResponse.Builder, SupportedReceiveTypesResponseOrBuilder> singleFieldBuilderV3 = this.supportedReceiveTypesResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    supportedReceiveTypesResponse.getClass();
                    this.supportedReceiveTypesResponse_ = supportedReceiveTypesResponse;
                } else {
                    singleFieldBuilderV3.setMessage(supportedReceiveTypesResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setTransferStartNotification(TransferStartNotification transferStartNotification) {
                SingleFieldBuilderV3<TransferStartNotification, TransferStartNotification.Builder, TransferStartNotificationOrBuilder> singleFieldBuilderV3 = this.transferStartNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    transferStartNotification.getClass();
                    this.transferStartNotification_ = transferStartNotification;
                } else {
                    singleFieldBuilderV3.setMessage(transferStartNotification);
                }
                this.bitField0_ |= 64;
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
                if (service.hasConsentLinkRequest()) {
                    mergeConsentLinkRequest(service.getConsentLinkRequest());
                }
                if (service.hasConsentLinkResponse()) {
                    mergeConsentLinkResponse(service.getConsentLinkResponse());
                }
                if (service.hasSupportedReceiveTypesRequest()) {
                    mergeSupportedReceiveTypesRequest(service.getSupportedReceiveTypesRequest());
                }
                if (service.hasSupportedReceiveTypesResponse()) {
                    mergeSupportedReceiveTypesResponse(service.getSupportedReceiveTypesResponse());
                }
                if (service.hasShareItemsRequest()) {
                    mergeShareItemsRequest(service.getShareItemsRequest());
                }
                if (service.hasShareItemsResponse()) {
                    mergeShareItemsResponse(service.getShareItemsResponse());
                }
                if (service.hasTransferStartNotification()) {
                    mergeTransferStartNotification(service.getTransferStartNotification());
                }
                if (service.hasItemsStatusUpdateRequest()) {
                    mergeItemsStatusUpdateRequest(service.getItemsStatusUpdateRequest());
                }
                if (service.hasItemsStatusUpdateResponse()) {
                    mergeItemsStatusUpdateResponse(service.getItemsStatusUpdateResponse());
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

    public static final class ShareItem extends GeneratedMessageV3 implements ShareItemOrBuilder {
        public static final int COMPATIBILITY_DATA_FIELD_NUMBER = 5;
        public static final int ENCODED_DATA_FORMAT_FIELD_NUMBER = 4;
        public static final int PLAIN_TEXT_NAME_FIELD_NUMBER = 3;
        public static final int SHARE_TYPE_FIELD_NUMBER = 2;
        public static final int UID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private ByteString compatibilityData_;
        private volatile Object encodedDataFormat_;
        private byte memoizedIsInitialized;
        private volatile Object plainTextName_;
        private ShareType shareType_;
        private GDIDataTypes.UUID uid_;
        private static final ShareItem DEFAULT_INSTANCE = new ShareItem();

        @Deprecated
        public static final Parser<ShareItem> PARSER = new AbstractParser<ShareItem>() { // from class: com.garmin.proto.generated.GDIGarminShare.ShareItem.1
            @Override // com.google.protobuf.Parser
            public ShareItem parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ShareItem.newBuilder();
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

        private ShareItem() {
            this.plainTextName_ = "";
            this.encodedDataFormat_ = "";
            ByteString byteString = ByteString.EMPTY;
            this.compatibilityData_ = byteString;
            this.memoizedIsInitialized = (byte) -1;
            this.plainTextName_ = "";
            this.encodedDataFormat_ = "";
            this.compatibilityData_ = byteString;
        }

        public static ShareItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ShareItem_descriptor;
        }

        public static Builder newBuilder(ShareItem shareItem) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(shareItem);
        }

        public static ShareItem parseDelimitedFrom(InputStream inputStream) {
            return (ShareItem) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ShareItem parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ShareItem> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShareItem)) {
                return super.equals(obj);
            }
            ShareItem shareItem = (ShareItem) obj;
            if (hasUid() != shareItem.hasUid()) {
                return false;
            }
            if ((hasUid() && !getUid().equals(shareItem.getUid())) || hasShareType() != shareItem.hasShareType()) {
                return false;
            }
            if ((hasShareType() && !getShareType().equals(shareItem.getShareType())) || hasPlainTextName() != shareItem.hasPlainTextName()) {
                return false;
            }
            if ((hasPlainTextName() && !getPlainTextName().equals(shareItem.getPlainTextName())) || hasEncodedDataFormat() != shareItem.hasEncodedDataFormat()) {
                return false;
            }
            if ((!hasEncodedDataFormat() || getEncodedDataFormat().equals(shareItem.getEncodedDataFormat())) && hasCompatibilityData() == shareItem.hasCompatibilityData()) {
                return (!hasCompatibilityData() || getCompatibilityData().equals(shareItem.getCompatibilityData())) && getUnknownFields().equals(shareItem.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemOrBuilder
        public ByteString getCompatibilityData() {
            return this.compatibilityData_;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemOrBuilder
        public String getEncodedDataFormat() {
            Object obj = this.encodedDataFormat_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.encodedDataFormat_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemOrBuilder
        public ByteString getEncodedDataFormatBytes() {
            Object obj = this.encodedDataFormat_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.encodedDataFormat_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ShareItem> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemOrBuilder
        public String getPlainTextName() {
            Object obj = this.plainTextName_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.plainTextName_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemOrBuilder
        public ByteString getPlainTextNameBytes() {
            Object obj = this.plainTextName_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.plainTextName_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getUid()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getShareType());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += GeneratedMessageV3.computeStringSize(3, this.plainTextName_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += GeneratedMessageV3.computeStringSize(4, this.encodedDataFormat_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeBytesSize(5, this.compatibilityData_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemOrBuilder
        public ShareType getShareType() {
            ShareType shareType = this.shareType_;
            return shareType == null ? ShareType.getDefaultInstance() : shareType;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemOrBuilder
        public ShareTypeOrBuilder getShareTypeOrBuilder() {
            ShareType shareType = this.shareType_;
            return shareType == null ? ShareType.getDefaultInstance() : shareType;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemOrBuilder
        public GDIDataTypes.UUID getUid() {
            GDIDataTypes.UUID uuid = this.uid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemOrBuilder
        public GDIDataTypes.UUIDOrBuilder getUidOrBuilder() {
            GDIDataTypes.UUID uuid = this.uid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemOrBuilder
        public boolean hasCompatibilityData() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemOrBuilder
        public boolean hasEncodedDataFormat() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemOrBuilder
        public boolean hasPlainTextName() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemOrBuilder
        public boolean hasShareType() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemOrBuilder
        public boolean hasUid() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasUid()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getUid().hashCode();
            }
            if (hasShareType()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getShareType().hashCode();
            }
            if (hasPlainTextName()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getPlainTextName().hashCode();
            }
            if (hasEncodedDataFormat()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getEncodedDataFormat().hashCode();
            }
            if (hasCompatibilityData()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getCompatibilityData().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ShareItem_fieldAccessorTable.ensureFieldAccessorsInitialized(ShareItem.class, Builder.class);
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
            if (!hasUid() || getUid().isInitialized()) {
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
            return new ShareItem();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getUid());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getShareType());
            }
            if ((this.bitField0_ & 4) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 3, this.plainTextName_);
            }
            if ((this.bitField0_ & 8) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 4, this.encodedDataFormat_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeBytes(5, this.compatibilityData_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ShareItemOrBuilder {
            private int bitField0_;
            private ByteString compatibilityData_;
            private Object encodedDataFormat_;
            private Object plainTextName_;
            private SingleFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> shareTypeBuilder_;
            private ShareType shareType_;
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> uidBuilder_;
            private GDIDataTypes.UUID uid_;

            private Builder() {
                this.plainTextName_ = "";
                this.encodedDataFormat_ = "";
                this.compatibilityData_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ShareItem shareItem) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uidBuilder_;
                    shareItem.uid_ = singleFieldBuilderV3 == null ? this.uid_ : (GDIDataTypes.UUID) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> singleFieldBuilderV4 = this.shareTypeBuilder_;
                    shareItem.shareType_ = singleFieldBuilderV4 == null ? this.shareType_ : (ShareType) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    shareItem.plainTextName_ = this.plainTextName_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    shareItem.encodedDataFormat_ = this.encodedDataFormat_;
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    shareItem.compatibilityData_ = this.compatibilityData_;
                    i14 |= 16;
                }
                shareItem.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ShareItem_descriptor;
            }

            private SingleFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> getShareTypeFieldBuilder() {
                if (this.shareTypeBuilder_ == null) {
                    this.shareTypeBuilder_ = new SingleFieldBuilderV3<>(getShareType(), getParentForChildren(), isClean());
                    this.shareType_ = null;
                }
                return this.shareTypeBuilder_;
            }

            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> getUidFieldBuilder() {
                if (this.uidBuilder_ == null) {
                    this.uidBuilder_ = new SingleFieldBuilderV3<>(getUid(), getParentForChildren(), isClean());
                    this.uid_ = null;
                }
                return this.uidBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getUidFieldBuilder();
                    getShareTypeFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ShareItem build() {
                ShareItem shareItemBuildPartial = buildPartial();
                if (shareItemBuildPartial.isInitialized()) {
                    return shareItemBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) shareItemBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ShareItem buildPartial() {
                ShareItem shareItem = new ShareItem(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(shareItem);
                }
                onBuilt();
                return shareItem;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.uid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.uidBuilder_ = null;
                }
                this.shareType_ = null;
                SingleFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> singleFieldBuilderV4 = this.shareTypeBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.shareTypeBuilder_ = null;
                }
                this.plainTextName_ = "";
                this.encodedDataFormat_ = "";
                this.compatibilityData_ = ByteString.EMPTY;
                return this;
            }

            public Builder clearCompatibilityData() {
                this.bitField0_ &= -17;
                this.compatibilityData_ = ShareItem.getDefaultInstance().getCompatibilityData();
                onChanged();
                return this;
            }

            public Builder clearEncodedDataFormat() {
                this.encodedDataFormat_ = ShareItem.getDefaultInstance().getEncodedDataFormat();
                this.bitField0_ &= -9;
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

            public Builder clearPlainTextName() {
                this.plainTextName_ = ShareItem.getDefaultInstance().getPlainTextName();
                this.bitField0_ &= -5;
                onChanged();
                return this;
            }

            public Builder clearShareType() {
                this.bitField0_ &= -3;
                this.shareType_ = null;
                SingleFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> singleFieldBuilderV3 = this.shareTypeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.shareTypeBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearUid() {
                this.bitField0_ &= -2;
                this.uid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.uidBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemOrBuilder
            public ByteString getCompatibilityData() {
                return this.compatibilityData_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ShareItem_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemOrBuilder
            public String getEncodedDataFormat() {
                Object obj = this.encodedDataFormat_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.encodedDataFormat_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemOrBuilder
            public ByteString getEncodedDataFormatBytes() {
                Object obj = this.encodedDataFormat_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.encodedDataFormat_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemOrBuilder
            public String getPlainTextName() {
                Object obj = this.plainTextName_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.plainTextName_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemOrBuilder
            public ByteString getPlainTextNameBytes() {
                Object obj = this.plainTextName_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.plainTextName_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemOrBuilder
            public ShareType getShareType() {
                SingleFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> singleFieldBuilderV3 = this.shareTypeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ShareType) singleFieldBuilderV3.getMessage();
                }
                ShareType shareType = this.shareType_;
                return shareType == null ? ShareType.getDefaultInstance() : shareType;
            }

            public ShareType.Builder getShareTypeBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ShareType.Builder) getShareTypeFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemOrBuilder
            public ShareTypeOrBuilder getShareTypeOrBuilder() {
                SingleFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> singleFieldBuilderV3 = this.shareTypeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ShareTypeOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ShareType shareType = this.shareType_;
                return shareType == null ? ShareType.getDefaultInstance() : shareType;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemOrBuilder
            public GDIDataTypes.UUID getUid() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUID) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.UUID uuid = this.uid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            public GDIDataTypes.UUID.Builder getUidBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GDIDataTypes.UUID.Builder) getUidFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemOrBuilder
            public GDIDataTypes.UUIDOrBuilder getUidOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.uid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemOrBuilder
            public boolean hasCompatibilityData() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemOrBuilder
            public boolean hasEncodedDataFormat() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemOrBuilder
            public boolean hasPlainTextName() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemOrBuilder
            public boolean hasShareType() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemOrBuilder
            public boolean hasUid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ShareItem_fieldAccessorTable.ensureFieldAccessorsInitialized(ShareItem.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasUid() || getUid().isInitialized();
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
                                    codedInputStream.readMessage(getUidFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getShareTypeFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    this.plainTextName_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    this.encodedDataFormat_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    this.compatibilityData_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 16;
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

            public Builder mergeShareType(ShareType shareType) {
                ShareType shareType2;
                SingleFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> singleFieldBuilderV3 = this.shareTypeBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(shareType);
                } else if ((this.bitField0_ & 2) == 0 || (shareType2 = this.shareType_) == null || shareType2 == ShareType.getDefaultInstance()) {
                    this.shareType_ = shareType;
                } else {
                    getShareTypeBuilder().mergeFrom(shareType);
                }
                if (this.shareType_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeUid(GDIDataTypes.UUID uuid) {
                GDIDataTypes.UUID uuid2;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uuid);
                } else if ((this.bitField0_ & 1) == 0 || (uuid2 = this.uid_) == null || uuid2 == GDIDataTypes.UUID.getDefaultInstance()) {
                    this.uid_ = uuid;
                } else {
                    getUidBuilder().mergeFrom(uuid);
                }
                if (this.uid_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setCompatibilityData(ByteString byteString) {
                byteString.getClass();
                this.compatibilityData_ = byteString;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setEncodedDataFormat(String str) {
                str.getClass();
                this.encodedDataFormat_ = str;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setEncodedDataFormatBytes(ByteString byteString) {
                byteString.getClass();
                this.encodedDataFormat_ = byteString;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setPlainTextName(String str) {
                str.getClass();
                this.plainTextName_ = str;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setPlainTextNameBytes(ByteString byteString) {
                byteString.getClass();
                this.plainTextName_ = byteString;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setShareType(ShareType.Builder builder) {
                SingleFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> singleFieldBuilderV3 = this.shareTypeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.shareType_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setUid(GDIDataTypes.UUID.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.uid_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ShareItem getDefaultInstanceForType() {
                return ShareItem.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.plainTextName_ = "";
                this.encodedDataFormat_ = "";
                this.compatibilityData_ = ByteString.EMPTY;
                maybeForceBuilderInitialization();
            }

            public Builder setShareType(ShareType shareType) {
                SingleFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> singleFieldBuilderV3 = this.shareTypeBuilder_;
                if (singleFieldBuilderV3 == null) {
                    shareType.getClass();
                    this.shareType_ = shareType;
                } else {
                    singleFieldBuilderV3.setMessage(shareType);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setUid(GDIDataTypes.UUID uuid) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uidBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uuid.getClass();
                    this.uid_ = uuid;
                } else {
                    singleFieldBuilderV3.setMessage(uuid);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ShareItem) {
                    return mergeFrom((ShareItem) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ShareItem shareItem) {
                if (shareItem == ShareItem.getDefaultInstance()) {
                    return this;
                }
                if (shareItem.hasUid()) {
                    mergeUid(shareItem.getUid());
                }
                if (shareItem.hasShareType()) {
                    mergeShareType(shareItem.getShareType());
                }
                if (shareItem.hasPlainTextName()) {
                    this.plainTextName_ = shareItem.plainTextName_;
                    this.bitField0_ |= 4;
                    onChanged();
                }
                if (shareItem.hasEncodedDataFormat()) {
                    this.encodedDataFormat_ = shareItem.encodedDataFormat_;
                    this.bitField0_ |= 8;
                    onChanged();
                }
                if (shareItem.hasCompatibilityData()) {
                    setCompatibilityData(shareItem.getCompatibilityData());
                }
                mergeUnknownFields(shareItem.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ShareItem getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ShareItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareItem) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ShareItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ShareItem parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ShareItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ShareItem parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ShareItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ShareItem parseFrom(InputStream inputStream) {
            return (ShareItem) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ShareItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareItem) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ShareItem parseFrom(CodedInputStream codedInputStream) {
            return (ShareItem) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ShareItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareItem) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private ShareItem(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.plainTextName_ = "";
            this.encodedDataFormat_ = "";
            this.compatibilityData_ = ByteString.EMPTY;
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ ShareItem(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class ShareItemResponse extends GeneratedMessageV3 implements ShareItemResponseOrBuilder {
        private static final ShareItemResponse DEFAULT_INSTANCE = new ShareItemResponse();

        @Deprecated
        public static final Parser<ShareItemResponse> PARSER = new AbstractParser<ShareItemResponse>() { // from class: com.garmin.proto.generated.GDIGarminShare.ShareItemResponse.1
            @Override // com.google.protobuf.Parser
            public ShareItemResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ShareItemResponse.newBuilder();
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
        public static final int REASON_FIELD_NUMBER = 2;
        public static final int SHARE_ITEM_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private int reason_;
        private GDIDataTypes.UUID shareItem_;

        private ShareItemResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.reason_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ShareItemResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ShareItemResponse_descriptor;
        }

        public static Builder newBuilder(ShareItemResponse shareItemResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(shareItemResponse);
        }

        public static ShareItemResponse parseDelimitedFrom(InputStream inputStream) {
            return (ShareItemResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ShareItemResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ShareItemResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShareItemResponse)) {
                return super.equals(obj);
            }
            ShareItemResponse shareItemResponse = (ShareItemResponse) obj;
            if (hasShareItem() != shareItemResponse.hasShareItem()) {
                return false;
            }
            if ((!hasShareItem() || getShareItem().equals(shareItemResponse.getShareItem())) && hasReason() == shareItemResponse.hasReason()) {
                return (!hasReason() || this.reason_ == shareItemResponse.reason_) && getUnknownFields().equals(shareItemResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ShareItemResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemResponseOrBuilder
        public DeclinedReason getReason() {
            DeclinedReason declinedReasonForNumber = DeclinedReason.forNumber(this.reason_);
            return declinedReasonForNumber == null ? DeclinedReason.USER_DECLINED : declinedReasonForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getShareItem()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeEnumSize(2, this.reason_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemResponseOrBuilder
        public GDIDataTypes.UUID getShareItem() {
            GDIDataTypes.UUID uuid = this.shareItem_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemResponseOrBuilder
        public GDIDataTypes.UUIDOrBuilder getShareItemOrBuilder() {
            GDIDataTypes.UUID uuid = this.shareItem_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemResponseOrBuilder
        public boolean hasReason() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemResponseOrBuilder
        public boolean hasShareItem() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasShareItem()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getShareItem().hashCode();
            }
            if (hasReason()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.reason_;
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ShareItemResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ShareItemResponse.class, Builder.class);
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
            if (!hasShareItem() || getShareItem().isInitialized()) {
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
            return new ShareItemResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getShareItem());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.reason_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ShareItemResponseOrBuilder {
            private int bitField0_;
            private int reason_;
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> shareItemBuilder_;
            private GDIDataTypes.UUID shareItem_;

            private Builder() {
                this.reason_ = 1;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ShareItemResponse shareItemResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.shareItemBuilder_;
                    shareItemResponse.shareItem_ = singleFieldBuilderV3 == null ? this.shareItem_ : (GDIDataTypes.UUID) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    shareItemResponse.reason_ = this.reason_;
                    i14 |= 2;
                }
                shareItemResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ShareItemResponse_descriptor;
            }

            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> getShareItemFieldBuilder() {
                if (this.shareItemBuilder_ == null) {
                    this.shareItemBuilder_ = new SingleFieldBuilderV3<>(getShareItem(), getParentForChildren(), isClean());
                    this.shareItem_ = null;
                }
                return this.shareItemBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getShareItemFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ShareItemResponse build() {
                ShareItemResponse shareItemResponseBuildPartial = buildPartial();
                if (shareItemResponseBuildPartial.isInitialized()) {
                    return shareItemResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) shareItemResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ShareItemResponse buildPartial() {
                ShareItemResponse shareItemResponse = new ShareItemResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(shareItemResponse);
                }
                onBuilt();
                return shareItemResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.shareItem_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.shareItemBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.shareItemBuilder_ = null;
                }
                this.reason_ = 1;
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

            public Builder clearReason() {
                this.bitField0_ &= -3;
                this.reason_ = 1;
                onChanged();
                return this;
            }

            public Builder clearShareItem() {
                this.bitField0_ &= -2;
                this.shareItem_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.shareItemBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.shareItemBuilder_ = null;
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
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ShareItemResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemResponseOrBuilder
            public DeclinedReason getReason() {
                DeclinedReason declinedReasonForNumber = DeclinedReason.forNumber(this.reason_);
                return declinedReasonForNumber == null ? DeclinedReason.USER_DECLINED : declinedReasonForNumber;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemResponseOrBuilder
            public GDIDataTypes.UUID getShareItem() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.shareItemBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUID) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.UUID uuid = this.shareItem_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            public GDIDataTypes.UUID.Builder getShareItemBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (GDIDataTypes.UUID.Builder) getShareItemFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemResponseOrBuilder
            public GDIDataTypes.UUIDOrBuilder getShareItemOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.shareItemBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.shareItem_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemResponseOrBuilder
            public boolean hasReason() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemResponseOrBuilder
            public boolean hasShareItem() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ShareItemResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ShareItemResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasShareItem() || getShareItem().isInitialized();
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
                                    codedInputStream.readMessage(getShareItemFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (DeclinedReason.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.reason_ = i14;
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

            public Builder mergeShareItem(GDIDataTypes.UUID uuid) {
                GDIDataTypes.UUID uuid2;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.shareItemBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uuid);
                } else if ((this.bitField0_ & 1) == 0 || (uuid2 = this.shareItem_) == null || uuid2 == GDIDataTypes.UUID.getDefaultInstance()) {
                    this.shareItem_ = uuid;
                } else {
                    getShareItemBuilder().mergeFrom(uuid);
                }
                if (this.shareItem_ != null) {
                    this.bitField0_ |= 1;
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

            public Builder setReason(DeclinedReason declinedReason) {
                declinedReason.getClass();
                this.bitField0_ |= 2;
                this.reason_ = declinedReason.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setShareItem(GDIDataTypes.UUID.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.shareItemBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.shareItem_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ShareItemResponse getDefaultInstanceForType() {
                return ShareItemResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.reason_ = 1;
                maybeForceBuilderInitialization();
            }

            public Builder setShareItem(GDIDataTypes.UUID uuid) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.shareItemBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uuid.getClass();
                    this.shareItem_ = uuid;
                } else {
                    singleFieldBuilderV3.setMessage(uuid);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ShareItemResponse) {
                    return mergeFrom((ShareItemResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ShareItemResponse shareItemResponse) {
                if (shareItemResponse == ShareItemResponse.getDefaultInstance()) {
                    return this;
                }
                if (shareItemResponse.hasShareItem()) {
                    mergeShareItem(shareItemResponse.getShareItem());
                }
                if (shareItemResponse.hasReason()) {
                    setReason(shareItemResponse.getReason());
                }
                mergeUnknownFields(shareItemResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ShareItemResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ShareItemResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareItemResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ShareItemResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ShareItemResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ShareItemResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ShareItemResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.reason_ = 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ShareItemResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ShareItemResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ShareItemResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ShareItemResponse parseFrom(InputStream inputStream) {
            return (ShareItemResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ShareItemResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareItemResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ShareItemResponse parseFrom(CodedInputStream codedInputStream) {
            return (ShareItemResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ShareItemResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareItemResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum DeclinedReason implements ProtocolMessageEnum {
            USER_DECLINED(1),
            INCOMPATABLE(2),
            OUT_OF_SPACE(3),
            RECEIVED_DISABLED(4),
            WAIT_FOR_TRANSFER_STATUS(5);

            public static final int INCOMPATABLE_VALUE = 2;
            public static final int OUT_OF_SPACE_VALUE = 3;
            public static final int RECEIVED_DISABLED_VALUE = 4;
            public static final int USER_DECLINED_VALUE = 1;
            public static final int WAIT_FOR_TRANSFER_STATUS_VALUE = 5;
            private final int value;
            private static final Internal.EnumLiteMap<DeclinedReason> internalValueMap = new Internal.EnumLiteMap<DeclinedReason>() { // from class: com.garmin.proto.generated.GDIGarminShare.ShareItemResponse.DeclinedReason.1
                @Override // com.google.protobuf.Internal.EnumLiteMap
                public DeclinedReason findValueByNumber(int i14) {
                    return DeclinedReason.forNumber(i14);
                }
            };
            private static final DeclinedReason[] VALUES = values();

            DeclinedReason(int i14) {
                this.value = i14;
            }

            public static DeclinedReason forNumber(int i14) {
                if (i14 == 1) {
                    return USER_DECLINED;
                }
                if (i14 == 2) {
                    return INCOMPATABLE;
                }
                if (i14 == 3) {
                    return OUT_OF_SPACE;
                }
                if (i14 == 4) {
                    return RECEIVED_DISABLED;
                }
                if (i14 != 5) {
                    return null;
                }
                return WAIT_FOR_TRANSFER_STATUS;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ShareItemResponse.getDescriptor().getEnumTypes().get(0);
            }

            public static Internal.EnumLiteMap<DeclinedReason> internalGetValueMap() {
                return internalValueMap;
            }

            public static DeclinedReason valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
            public static DeclinedReason valueOf(int i14) {
                return forNumber(i14);
            }
        }
    }

    public static final class ShareItemsRequest extends GeneratedMessageV3 implements ShareItemsRequestOrBuilder {
        public static final int INCOMPATIBLE_ITEMS_COUNT_FIELD_NUMBER = 2;
        public static final int SHARE_ITEMS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private int incompatibleItemsCount_;
        private byte memoizedIsInitialized;
        private List<ShareItem> shareItems_;
        private static final ShareItemsRequest DEFAULT_INSTANCE = new ShareItemsRequest();

        @Deprecated
        public static final Parser<ShareItemsRequest> PARSER = new AbstractParser<ShareItemsRequest>() { // from class: com.garmin.proto.generated.GDIGarminShare.ShareItemsRequest.1
            @Override // com.google.protobuf.Parser
            public ShareItemsRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ShareItemsRequest.newBuilder();
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

        private ShareItemsRequest() {
            this.incompatibleItemsCount_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.shareItems_ = Collections.EMPTY_LIST;
        }

        public static ShareItemsRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ShareItemsRequest_descriptor;
        }

        public static Builder newBuilder(ShareItemsRequest shareItemsRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(shareItemsRequest);
        }

        public static ShareItemsRequest parseDelimitedFrom(InputStream inputStream) {
            return (ShareItemsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ShareItemsRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ShareItemsRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShareItemsRequest)) {
                return super.equals(obj);
            }
            ShareItemsRequest shareItemsRequest = (ShareItemsRequest) obj;
            if (getShareItemsList().equals(shareItemsRequest.getShareItemsList()) && hasIncompatibleItemsCount() == shareItemsRequest.hasIncompatibleItemsCount()) {
                return (!hasIncompatibleItemsCount() || getIncompatibleItemsCount() == shareItemsRequest.getIncompatibleItemsCount()) && getUnknownFields().equals(shareItemsRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemsRequestOrBuilder
        public int getIncompatibleItemsCount() {
            return this.incompatibleItemsCount_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ShareItemsRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = 0;
            for (int i15 = 0; i15 < this.shareItems_.size(); i15++) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(1, this.shareItems_.get(i15));
            }
            if ((this.bitField0_ & 1) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.incompatibleItemsCount_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemsRequestOrBuilder
        public ShareItem getShareItems(int i14) {
            return this.shareItems_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemsRequestOrBuilder
        public int getShareItemsCount() {
            return this.shareItems_.size();
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemsRequestOrBuilder
        public List<ShareItem> getShareItemsList() {
            return this.shareItems_;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemsRequestOrBuilder
        public ShareItemOrBuilder getShareItemsOrBuilder(int i14) {
            return this.shareItems_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemsRequestOrBuilder
        public List<? extends ShareItemOrBuilder> getShareItemsOrBuilderList() {
            return this.shareItems_;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemsRequestOrBuilder
        public boolean hasIncompatibleItemsCount() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getShareItemsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getShareItemsList().hashCode();
            }
            if (hasIncompatibleItemsCount()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getIncompatibleItemsCount();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ShareItemsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ShareItemsRequest.class, Builder.class);
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
            for (int i14 = 0; i14 < getShareItemsCount(); i14++) {
                if (!getShareItems(i14).isInitialized()) {
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
            return new ShareItemsRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.shareItems_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.shareItems_.get(i14));
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(2, this.incompatibleItemsCount_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ShareItemsRequestOrBuilder {
            private int bitField0_;
            private int incompatibleItemsCount_;
            private RepeatedFieldBuilderV3<ShareItem, ShareItem.Builder, ShareItemOrBuilder> shareItemsBuilder_;
            private List<ShareItem> shareItems_;

            private Builder() {
                this.shareItems_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(ShareItemsRequest shareItemsRequest) {
                int i14;
                if ((this.bitField0_ & 2) != 0) {
                    shareItemsRequest.incompatibleItemsCount_ = this.incompatibleItemsCount_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                shareItemsRequest.bitField0_ = i14 | shareItemsRequest.bitField0_;
            }

            private void buildPartialRepeatedFields(ShareItemsRequest shareItemsRequest) {
                RepeatedFieldBuilderV3<ShareItem, ShareItem.Builder, ShareItemOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    shareItemsRequest.shareItems_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.shareItems_ = Collections.unmodifiableList(this.shareItems_);
                    this.bitField0_ &= -2;
                }
                shareItemsRequest.shareItems_ = this.shareItems_;
            }

            private void ensureShareItemsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.shareItems_ = new ArrayList(this.shareItems_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ShareItemsRequest_descriptor;
            }

            private RepeatedFieldBuilderV3<ShareItem, ShareItem.Builder, ShareItemOrBuilder> getShareItemsFieldBuilder() {
                if (this.shareItemsBuilder_ == null) {
                    this.shareItemsBuilder_ = new RepeatedFieldBuilderV3<>(this.shareItems_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.shareItems_ = null;
                }
                return this.shareItemsBuilder_;
            }

            public Builder addAllShareItems(Iterable<? extends ShareItem> iterable) {
                RepeatedFieldBuilderV3<ShareItem, ShareItem.Builder, ShareItemOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureShareItemsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.shareItems_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addShareItems(ShareItem.Builder builder) {
                RepeatedFieldBuilderV3<ShareItem, ShareItem.Builder, ShareItemOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureShareItemsIsMutable();
                this.shareItems_.add(builder.build());
                onChanged();
                return this;
            }

            public ShareItem.Builder addShareItemsBuilder() {
                return (ShareItem.Builder) getShareItemsFieldBuilder().addBuilder(ShareItem.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ShareItemsRequest build() {
                ShareItemsRequest shareItemsRequestBuildPartial = buildPartial();
                if (shareItemsRequestBuildPartial.isInitialized()) {
                    return shareItemsRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) shareItemsRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ShareItemsRequest buildPartial() {
                ShareItemsRequest shareItemsRequest = new ShareItemsRequest(this);
                buildPartialRepeatedFields(shareItemsRequest);
                if (this.bitField0_ != 0) {
                    buildPartial0(shareItemsRequest);
                }
                onBuilt();
                return shareItemsRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<ShareItem, ShareItem.Builder, ShareItemOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.shareItems_ = Collections.EMPTY_LIST;
                } else {
                    this.shareItems_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                this.incompatibleItemsCount_ = 0;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIncompatibleItemsCount() {
                this.bitField0_ &= -3;
                this.incompatibleItemsCount_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearShareItems() {
                RepeatedFieldBuilderV3<ShareItem, ShareItem.Builder, ShareItemOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.shareItems_ = Collections.EMPTY_LIST;
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
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ShareItemsRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemsRequestOrBuilder
            public int getIncompatibleItemsCount() {
                return this.incompatibleItemsCount_;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemsRequestOrBuilder
            public ShareItem getShareItems(int i14) {
                RepeatedFieldBuilderV3<ShareItem, ShareItem.Builder, ShareItemOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.shareItems_.get(i14) : (ShareItem) repeatedFieldBuilderV3.getMessage(i14);
            }

            public ShareItem.Builder getShareItemsBuilder(int i14) {
                return (ShareItem.Builder) getShareItemsFieldBuilder().getBuilder(i14);
            }

            public List<ShareItem.Builder> getShareItemsBuilderList() {
                return getShareItemsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemsRequestOrBuilder
            public int getShareItemsCount() {
                RepeatedFieldBuilderV3<ShareItem, ShareItem.Builder, ShareItemOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.shareItems_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemsRequestOrBuilder
            public List<ShareItem> getShareItemsList() {
                RepeatedFieldBuilderV3<ShareItem, ShareItem.Builder, ShareItemOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.shareItems_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemsRequestOrBuilder
            public ShareItemOrBuilder getShareItemsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<ShareItem, ShareItem.Builder, ShareItemOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.shareItems_.get(i14) : (ShareItemOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemsRequestOrBuilder
            public List<? extends ShareItemOrBuilder> getShareItemsOrBuilderList() {
                RepeatedFieldBuilderV3<ShareItem, ShareItem.Builder, ShareItemOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.shareItems_);
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemsRequestOrBuilder
            public boolean hasIncompatibleItemsCount() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ShareItemsRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ShareItemsRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getShareItemsCount(); i14++) {
                    if (!getShareItems(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(ShareItemsRequest shareItemsRequest) {
                if (shareItemsRequest == ShareItemsRequest.getDefaultInstance()) {
                    return this;
                }
                if (this.shareItemsBuilder_ == null) {
                    if (!shareItemsRequest.shareItems_.isEmpty()) {
                        if (this.shareItems_.isEmpty()) {
                            this.shareItems_ = shareItemsRequest.shareItems_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureShareItemsIsMutable();
                            this.shareItems_.addAll(shareItemsRequest.shareItems_);
                        }
                        onChanged();
                    }
                } else if (!shareItemsRequest.shareItems_.isEmpty()) {
                    boolean zIsEmpty = this.shareItemsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<ShareItem, ShareItem.Builder, ShareItemOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.shareItemsBuilder_ = null;
                        this.shareItems_ = shareItemsRequest.shareItems_;
                        this.bitField0_ &= -2;
                        this.shareItemsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getShareItemsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(shareItemsRequest.shareItems_);
                    }
                }
                if (shareItemsRequest.hasIncompatibleItemsCount()) {
                    setIncompatibleItemsCount(shareItemsRequest.getIncompatibleItemsCount());
                }
                mergeUnknownFields(shareItemsRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeShareItems(int i14) {
                RepeatedFieldBuilderV3<ShareItem, ShareItem.Builder, ShareItemOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureShareItemsIsMutable();
                this.shareItems_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setIncompatibleItemsCount(int i14) {
                this.incompatibleItemsCount_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setShareItems(int i14, ShareItem.Builder builder) {
                RepeatedFieldBuilderV3<ShareItem, ShareItem.Builder, ShareItemOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureShareItemsIsMutable();
                this.shareItems_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ShareItemsRequest getDefaultInstanceForType() {
                return ShareItemsRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.shareItems_ = Collections.EMPTY_LIST;
            }

            public ShareItem.Builder addShareItemsBuilder(int i14) {
                return (ShareItem.Builder) getShareItemsFieldBuilder().addBuilder(i14, ShareItem.getDefaultInstance());
            }

            public Builder addShareItems(int i14, ShareItem shareItem) {
                RepeatedFieldBuilderV3<ShareItem, ShareItem.Builder, ShareItemOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    shareItem.getClass();
                    ensureShareItemsIsMutable();
                    this.shareItems_.add(i14, shareItem);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, shareItem);
                return this;
            }

            public Builder setShareItems(int i14, ShareItem shareItem) {
                RepeatedFieldBuilderV3<ShareItem, ShareItem.Builder, ShareItemOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    shareItem.getClass();
                    ensureShareItemsIsMutable();
                    this.shareItems_.set(i14, shareItem);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, shareItem);
                return this;
            }

            public Builder addShareItems(ShareItem shareItem) {
                RepeatedFieldBuilderV3<ShareItem, ShareItem.Builder, ShareItemOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    shareItem.getClass();
                    ensureShareItemsIsMutable();
                    this.shareItems_.add(shareItem);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(shareItem);
                return this;
            }

            public Builder addShareItems(int i14, ShareItem.Builder builder) {
                RepeatedFieldBuilderV3<ShareItem, ShareItem.Builder, ShareItemOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureShareItemsIsMutable();
                    this.shareItems_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ShareItemsRequest) {
                    return mergeFrom((ShareItemsRequest) message);
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
                                    ShareItem shareItem = (ShareItem) codedInputStream.readMessage(ShareItem.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<ShareItem, ShareItem.Builder, ShareItemOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureShareItemsIsMutable();
                                        this.shareItems_.add(shareItem);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(shareItem);
                                    }
                                } else if (tag != 16) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.incompatibleItemsCount_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 2;
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
        public ShareItemsRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ShareItemsRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareItemsRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ShareItemsRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ShareItemsRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ShareItemsRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ShareItemsRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ShareItemsRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private ShareItemsRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.incompatibleItemsCount_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ShareItemsRequest parseFrom(InputStream inputStream) {
            return (ShareItemsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ShareItemsRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareItemsRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ ShareItemsRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ShareItemsRequest parseFrom(CodedInputStream codedInputStream) {
            return (ShareItemsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ShareItemsRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareItemsRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ShareItemsResponse extends GeneratedMessageV3 implements ShareItemsResponseOrBuilder {
        public static final int DENIED_ITEMS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private List<ShareItemResponse> deniedItems_;
        private byte memoizedIsInitialized;
        private static final ShareItemsResponse DEFAULT_INSTANCE = new ShareItemsResponse();

        @Deprecated
        public static final Parser<ShareItemsResponse> PARSER = new AbstractParser<ShareItemsResponse>() { // from class: com.garmin.proto.generated.GDIGarminShare.ShareItemsResponse.1
            @Override // com.google.protobuf.Parser
            public ShareItemsResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ShareItemsResponse.newBuilder();
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

        private ShareItemsResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.deniedItems_ = Collections.EMPTY_LIST;
        }

        public static ShareItemsResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ShareItemsResponse_descriptor;
        }

        public static Builder newBuilder(ShareItemsResponse shareItemsResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(shareItemsResponse);
        }

        public static ShareItemsResponse parseDelimitedFrom(InputStream inputStream) {
            return (ShareItemsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ShareItemsResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ShareItemsResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShareItemsResponse)) {
                return super.equals(obj);
            }
            ShareItemsResponse shareItemsResponse = (ShareItemsResponse) obj;
            return getDeniedItemsList().equals(shareItemsResponse.getDeniedItemsList()) && getUnknownFields().equals(shareItemsResponse.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemsResponseOrBuilder
        public ShareItemResponse getDeniedItems(int i14) {
            return this.deniedItems_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemsResponseOrBuilder
        public int getDeniedItemsCount() {
            return this.deniedItems_.size();
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemsResponseOrBuilder
        public List<ShareItemResponse> getDeniedItemsList() {
            return this.deniedItems_;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemsResponseOrBuilder
        public ShareItemResponseOrBuilder getDeniedItemsOrBuilder(int i14) {
            return this.deniedItems_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemsResponseOrBuilder
        public List<? extends ShareItemResponseOrBuilder> getDeniedItemsOrBuilderList() {
            return this.deniedItems_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ShareItemsResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.deniedItems_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.deniedItems_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
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
            if (getDeniedItemsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getDeniedItemsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ShareItemsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ShareItemsResponse.class, Builder.class);
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
            for (int i14 = 0; i14 < getDeniedItemsCount(); i14++) {
                if (!getDeniedItems(i14).isInitialized()) {
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
            return new ShareItemsResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.deniedItems_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.deniedItems_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ShareItemsResponseOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<ShareItemResponse, ShareItemResponse.Builder, ShareItemResponseOrBuilder> deniedItemsBuilder_;
            private List<ShareItemResponse> deniedItems_;

            private Builder() {
                this.deniedItems_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(ShareItemsResponse shareItemsResponse) {
            }

            private void buildPartialRepeatedFields(ShareItemsResponse shareItemsResponse) {
                RepeatedFieldBuilderV3<ShareItemResponse, ShareItemResponse.Builder, ShareItemResponseOrBuilder> repeatedFieldBuilderV3 = this.deniedItemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    shareItemsResponse.deniedItems_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.deniedItems_ = Collections.unmodifiableList(this.deniedItems_);
                    this.bitField0_ &= -2;
                }
                shareItemsResponse.deniedItems_ = this.deniedItems_;
            }

            private void ensureDeniedItemsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.deniedItems_ = new ArrayList(this.deniedItems_);
                    this.bitField0_ |= 1;
                }
            }

            private RepeatedFieldBuilderV3<ShareItemResponse, ShareItemResponse.Builder, ShareItemResponseOrBuilder> getDeniedItemsFieldBuilder() {
                if (this.deniedItemsBuilder_ == null) {
                    this.deniedItemsBuilder_ = new RepeatedFieldBuilderV3<>(this.deniedItems_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.deniedItems_ = null;
                }
                return this.deniedItemsBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ShareItemsResponse_descriptor;
            }

            public Builder addAllDeniedItems(Iterable<? extends ShareItemResponse> iterable) {
                RepeatedFieldBuilderV3<ShareItemResponse, ShareItemResponse.Builder, ShareItemResponseOrBuilder> repeatedFieldBuilderV3 = this.deniedItemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureDeniedItemsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.deniedItems_);
                onChanged();
                return this;
            }

            public Builder addDeniedItems(ShareItemResponse.Builder builder) {
                RepeatedFieldBuilderV3<ShareItemResponse, ShareItemResponse.Builder, ShareItemResponseOrBuilder> repeatedFieldBuilderV3 = this.deniedItemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureDeniedItemsIsMutable();
                this.deniedItems_.add(builder.build());
                onChanged();
                return this;
            }

            public ShareItemResponse.Builder addDeniedItemsBuilder() {
                return (ShareItemResponse.Builder) getDeniedItemsFieldBuilder().addBuilder(ShareItemResponse.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ShareItemsResponse build() {
                ShareItemsResponse shareItemsResponseBuildPartial = buildPartial();
                if (shareItemsResponseBuildPartial.isInitialized()) {
                    return shareItemsResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) shareItemsResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ShareItemsResponse buildPartial() {
                ShareItemsResponse shareItemsResponse = new ShareItemsResponse(this);
                buildPartialRepeatedFields(shareItemsResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(shareItemsResponse);
                }
                onBuilt();
                return shareItemsResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<ShareItemResponse, ShareItemResponse.Builder, ShareItemResponseOrBuilder> repeatedFieldBuilderV3 = this.deniedItemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.deniedItems_ = Collections.EMPTY_LIST;
                } else {
                    this.deniedItems_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                return this;
            }

            public Builder clearDeniedItems() {
                RepeatedFieldBuilderV3<ShareItemResponse, ShareItemResponse.Builder, ShareItemResponseOrBuilder> repeatedFieldBuilderV3 = this.deniedItemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.deniedItems_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
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

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemsResponseOrBuilder
            public ShareItemResponse getDeniedItems(int i14) {
                RepeatedFieldBuilderV3<ShareItemResponse, ShareItemResponse.Builder, ShareItemResponseOrBuilder> repeatedFieldBuilderV3 = this.deniedItemsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.deniedItems_.get(i14) : (ShareItemResponse) repeatedFieldBuilderV3.getMessage(i14);
            }

            public ShareItemResponse.Builder getDeniedItemsBuilder(int i14) {
                return (ShareItemResponse.Builder) getDeniedItemsFieldBuilder().getBuilder(i14);
            }

            public List<ShareItemResponse.Builder> getDeniedItemsBuilderList() {
                return getDeniedItemsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemsResponseOrBuilder
            public int getDeniedItemsCount() {
                RepeatedFieldBuilderV3<ShareItemResponse, ShareItemResponse.Builder, ShareItemResponseOrBuilder> repeatedFieldBuilderV3 = this.deniedItemsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.deniedItems_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemsResponseOrBuilder
            public List<ShareItemResponse> getDeniedItemsList() {
                RepeatedFieldBuilderV3<ShareItemResponse, ShareItemResponse.Builder, ShareItemResponseOrBuilder> repeatedFieldBuilderV3 = this.deniedItemsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.deniedItems_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemsResponseOrBuilder
            public ShareItemResponseOrBuilder getDeniedItemsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<ShareItemResponse, ShareItemResponse.Builder, ShareItemResponseOrBuilder> repeatedFieldBuilderV3 = this.deniedItemsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.deniedItems_.get(i14) : (ShareItemResponseOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareItemsResponseOrBuilder
            public List<? extends ShareItemResponseOrBuilder> getDeniedItemsOrBuilderList() {
                RepeatedFieldBuilderV3<ShareItemResponse, ShareItemResponse.Builder, ShareItemResponseOrBuilder> repeatedFieldBuilderV3 = this.deniedItemsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.deniedItems_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ShareItemsResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ShareItemsResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ShareItemsResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getDeniedItemsCount(); i14++) {
                    if (!getDeniedItems(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(ShareItemsResponse shareItemsResponse) {
                if (shareItemsResponse == ShareItemsResponse.getDefaultInstance()) {
                    return this;
                }
                if (this.deniedItemsBuilder_ == null) {
                    if (!shareItemsResponse.deniedItems_.isEmpty()) {
                        if (this.deniedItems_.isEmpty()) {
                            this.deniedItems_ = shareItemsResponse.deniedItems_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureDeniedItemsIsMutable();
                            this.deniedItems_.addAll(shareItemsResponse.deniedItems_);
                        }
                        onChanged();
                    }
                } else if (!shareItemsResponse.deniedItems_.isEmpty()) {
                    boolean zIsEmpty = this.deniedItemsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<ShareItemResponse, ShareItemResponse.Builder, ShareItemResponseOrBuilder> repeatedFieldBuilderV3 = this.deniedItemsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.deniedItemsBuilder_ = null;
                        this.deniedItems_ = shareItemsResponse.deniedItems_;
                        this.bitField0_ &= -2;
                        this.deniedItemsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getDeniedItemsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(shareItemsResponse.deniedItems_);
                    }
                }
                mergeUnknownFields(shareItemsResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeDeniedItems(int i14) {
                RepeatedFieldBuilderV3<ShareItemResponse, ShareItemResponse.Builder, ShareItemResponseOrBuilder> repeatedFieldBuilderV3 = this.deniedItemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureDeniedItemsIsMutable();
                this.deniedItems_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setDeniedItems(int i14, ShareItemResponse.Builder builder) {
                RepeatedFieldBuilderV3<ShareItemResponse, ShareItemResponse.Builder, ShareItemResponseOrBuilder> repeatedFieldBuilderV3 = this.deniedItemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureDeniedItemsIsMutable();
                this.deniedItems_.set(i14, builder.build());
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
            public ShareItemsResponse getDefaultInstanceForType() {
                return ShareItemsResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.deniedItems_ = Collections.EMPTY_LIST;
            }

            public ShareItemResponse.Builder addDeniedItemsBuilder(int i14) {
                return (ShareItemResponse.Builder) getDeniedItemsFieldBuilder().addBuilder(i14, ShareItemResponse.getDefaultInstance());
            }

            public Builder addDeniedItems(int i14, ShareItemResponse shareItemResponse) {
                RepeatedFieldBuilderV3<ShareItemResponse, ShareItemResponse.Builder, ShareItemResponseOrBuilder> repeatedFieldBuilderV3 = this.deniedItemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    shareItemResponse.getClass();
                    ensureDeniedItemsIsMutable();
                    this.deniedItems_.add(i14, shareItemResponse);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, shareItemResponse);
                return this;
            }

            public Builder setDeniedItems(int i14, ShareItemResponse shareItemResponse) {
                RepeatedFieldBuilderV3<ShareItemResponse, ShareItemResponse.Builder, ShareItemResponseOrBuilder> repeatedFieldBuilderV3 = this.deniedItemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    shareItemResponse.getClass();
                    ensureDeniedItemsIsMutable();
                    this.deniedItems_.set(i14, shareItemResponse);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, shareItemResponse);
                return this;
            }

            public Builder addDeniedItems(ShareItemResponse shareItemResponse) {
                RepeatedFieldBuilderV3<ShareItemResponse, ShareItemResponse.Builder, ShareItemResponseOrBuilder> repeatedFieldBuilderV3 = this.deniedItemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    shareItemResponse.getClass();
                    ensureDeniedItemsIsMutable();
                    this.deniedItems_.add(shareItemResponse);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(shareItemResponse);
                return this;
            }

            public Builder addDeniedItems(int i14, ShareItemResponse.Builder builder) {
                RepeatedFieldBuilderV3<ShareItemResponse, ShareItemResponse.Builder, ShareItemResponseOrBuilder> repeatedFieldBuilderV3 = this.deniedItemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureDeniedItemsIsMutable();
                    this.deniedItems_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ShareItemsResponse) {
                    return mergeFrom((ShareItemsResponse) message);
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
                                    ShareItemResponse shareItemResponse = (ShareItemResponse) codedInputStream.readMessage(ShareItemResponse.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<ShareItemResponse, ShareItemResponse.Builder, ShareItemResponseOrBuilder> repeatedFieldBuilderV3 = this.deniedItemsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureDeniedItemsIsMutable();
                                        this.deniedItems_.add(shareItemResponse);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(shareItemResponse);
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
        public ShareItemsResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ShareItemsResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareItemsResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ShareItemsResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ShareItemsResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ShareItemsResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ShareItemsResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ShareItemsResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ ShareItemsResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ShareItemsResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ShareItemsResponse parseFrom(InputStream inputStream) {
            return (ShareItemsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ShareItemsResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareItemsResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ShareItemsResponse parseFrom(CodedInputStream codedInputStream) {
            return (ShareItemsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ShareItemsResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareItemsResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ShareType extends GeneratedMessageV3 implements ShareTypeOrBuilder {
        public static final int IDENTIFIER_FIELD_NUMBER = 1;
        public static final int SUPPORTED_RECEIVE_FORMATS_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private volatile Object identifier_;
        private byte memoizedIsInitialized;
        private LazyStringArrayList supportedReceiveFormats_;
        private static final ShareType DEFAULT_INSTANCE = new ShareType();

        @Deprecated
        public static final Parser<ShareType> PARSER = new AbstractParser<ShareType>() { // from class: com.garmin.proto.generated.GDIGarminShare.ShareType.1
            @Override // com.google.protobuf.Parser
            public ShareType parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ShareType.newBuilder();
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

        private ShareType() {
            this.identifier_ = "";
            this.supportedReceiveFormats_ = LazyStringArrayList.emptyList();
            this.memoizedIsInitialized = (byte) -1;
            this.identifier_ = "";
            this.supportedReceiveFormats_ = LazyStringArrayList.emptyList();
        }

        public static ShareType getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ShareType_descriptor;
        }

        public static Builder newBuilder(ShareType shareType) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(shareType);
        }

        public static ShareType parseDelimitedFrom(InputStream inputStream) {
            return (ShareType) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ShareType parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ShareType> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ShareType)) {
                return super.equals(obj);
            }
            ShareType shareType = (ShareType) obj;
            if (hasIdentifier() != shareType.hasIdentifier()) {
                return false;
            }
            return (!hasIdentifier() || getIdentifier().equals(shareType.getIdentifier())) && getSupportedReceiveFormatsList().equals(shareType.getSupportedReceiveFormatsList()) && getUnknownFields().equals(shareType.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareTypeOrBuilder
        public String getIdentifier() {
            Object obj = this.identifier_;
            if (obj instanceof String) {
                return (String) obj;
            }
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.identifier_ = stringUtf8;
            }
            return stringUtf8;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareTypeOrBuilder
        public ByteString getIdentifierBytes() {
            Object obj = this.identifier_;
            if (!(obj instanceof String)) {
                return (ByteString) obj;
            }
            ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
            this.identifier_ = byteStringCopyFromUtf8;
            return byteStringCopyFromUtf8;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ShareType> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeStringSize = (this.bitField0_ & 1) != 0 ? GeneratedMessageV3.computeStringSize(1, this.identifier_) : 0;
            int iD = 0;
            for (int i15 = 0; i15 < this.supportedReceiveFormats_.size(); i15++) {
                iD = f3.d(this.supportedReceiveFormats_, i15, iD);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + getSupportedReceiveFormatsList().size() + iComputeStringSize + iD;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareTypeOrBuilder
        public String getSupportedReceiveFormats(int i14) {
            return this.supportedReceiveFormats_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareTypeOrBuilder
        public ByteString getSupportedReceiveFormatsBytes(int i14) {
            return this.supportedReceiveFormats_.getByteString(i14);
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareTypeOrBuilder
        public int getSupportedReceiveFormatsCount() {
            return this.supportedReceiveFormats_.size();
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareTypeOrBuilder
        public boolean hasIdentifier() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasIdentifier()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getIdentifier().hashCode();
            }
            if (getSupportedReceiveFormatsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getSupportedReceiveFormatsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ShareType_fieldAccessorTable.ensureFieldAccessorsInitialized(ShareType.class, Builder.class);
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
            return new ShareType();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                GeneratedMessageV3.writeString(codedOutputStream, 1, this.identifier_);
            }
            int iE = 0;
            while (iE < this.supportedReceiveFormats_.size()) {
                iE = f3.e(this.supportedReceiveFormats_, iE, codedOutputStream, 2, iE, 1);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ShareTypeOrBuilder {
            private int bitField0_;
            private Object identifier_;
            private LazyStringArrayList supportedReceiveFormats_;

            private Builder() {
                this.identifier_ = "";
                this.supportedReceiveFormats_ = LazyStringArrayList.emptyList();
            }

            private void buildPartial0(ShareType shareType) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    shareType.identifier_ = this.identifier_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    this.supportedReceiveFormats_.makeImmutable();
                    shareType.supportedReceiveFormats_ = this.supportedReceiveFormats_;
                }
                shareType.bitField0_ |= i14;
            }

            private void ensureSupportedReceiveFormatsIsMutable() {
                if (!this.supportedReceiveFormats_.isModifiable()) {
                    this.supportedReceiveFormats_ = new LazyStringArrayList((LazyStringList) this.supportedReceiveFormats_);
                }
                this.bitField0_ |= 2;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ShareType_descriptor;
            }

            public Builder addAllSupportedReceiveFormats(Iterable<String> iterable) {
                ensureSupportedReceiveFormatsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.supportedReceiveFormats_);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addSupportedReceiveFormats(String str) {
                str.getClass();
                ensureSupportedReceiveFormatsIsMutable();
                this.supportedReceiveFormats_.add(str);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder addSupportedReceiveFormatsBytes(ByteString byteString) {
                byteString.getClass();
                ensureSupportedReceiveFormatsIsMutable();
                this.supportedReceiveFormats_.add(byteString);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ShareType build() {
                ShareType shareTypeBuildPartial = buildPartial();
                if (shareTypeBuildPartial.isInitialized()) {
                    return shareTypeBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) shareTypeBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ShareType buildPartial() {
                ShareType shareType = new ShareType(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(shareType);
                }
                onBuilt();
                return shareType;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.identifier_ = "";
                this.supportedReceiveFormats_ = LazyStringArrayList.emptyList();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearIdentifier() {
                this.identifier_ = ShareType.getDefaultInstance().getIdentifier();
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSupportedReceiveFormats() {
                this.supportedReceiveFormats_ = LazyStringArrayList.emptyList();
                this.bitField0_ &= -3;
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
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ShareType_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareTypeOrBuilder
            public String getIdentifier() {
                Object obj = this.identifier_;
                if (obj instanceof String) {
                    return (String) obj;
                }
                ByteString byteString = (ByteString) obj;
                String stringUtf8 = byteString.toStringUtf8();
                if (byteString.isValidUtf8()) {
                    this.identifier_ = stringUtf8;
                }
                return stringUtf8;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareTypeOrBuilder
            public ByteString getIdentifierBytes() {
                Object obj = this.identifier_;
                if (!(obj instanceof String)) {
                    return (ByteString) obj;
                }
                ByteString byteStringCopyFromUtf8 = ByteString.copyFromUtf8((String) obj);
                this.identifier_ = byteStringCopyFromUtf8;
                return byteStringCopyFromUtf8;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareTypeOrBuilder
            public String getSupportedReceiveFormats(int i14) {
                return this.supportedReceiveFormats_.get(i14);
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareTypeOrBuilder
            public ByteString getSupportedReceiveFormatsBytes(int i14) {
                return this.supportedReceiveFormats_.getByteString(i14);
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareTypeOrBuilder
            public int getSupportedReceiveFormatsCount() {
                return this.supportedReceiveFormats_.size();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareTypeOrBuilder
            public ProtocolStringList getSupportedReceiveFormatsList() {
                this.supportedReceiveFormats_.makeImmutable();
                return this.supportedReceiveFormats_;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.ShareTypeOrBuilder
            public boolean hasIdentifier() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_ShareType_fieldAccessorTable.ensureFieldAccessorsInitialized(ShareType.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(ShareType shareType) {
                if (shareType == ShareType.getDefaultInstance()) {
                    return this;
                }
                if (shareType.hasIdentifier()) {
                    this.identifier_ = shareType.identifier_;
                    this.bitField0_ |= 1;
                    onChanged();
                }
                if (!shareType.supportedReceiveFormats_.isEmpty()) {
                    if (this.supportedReceiveFormats_.isEmpty()) {
                        this.supportedReceiveFormats_ = shareType.supportedReceiveFormats_;
                        this.bitField0_ |= 2;
                    } else {
                        ensureSupportedReceiveFormatsIsMutable();
                        this.supportedReceiveFormats_.addAll(shareType.supportedReceiveFormats_);
                    }
                    onChanged();
                }
                mergeUnknownFields(shareType.getUnknownFields());
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

            public Builder setIdentifier(String str) {
                str.getClass();
                this.identifier_ = str;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setIdentifierBytes(ByteString byteString) {
                byteString.getClass();
                this.identifier_ = byteString;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSupportedReceiveFormats(int i14, String str) {
                str.getClass();
                ensureSupportedReceiveFormatsIsMutable();
                this.supportedReceiveFormats_.set(i14, str);
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ShareType getDefaultInstanceForType() {
                return ShareType.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.identifier_ = "";
                this.supportedReceiveFormats_ = LazyStringArrayList.emptyList();
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ShareType) {
                    return mergeFrom((ShareType) message);
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
                                    this.identifier_ = codedInputStream.readBytes();
                                    this.bitField0_ |= 1;
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    ByteString bytes = codedInputStream.readBytes();
                                    ensureSupportedReceiveFormatsIsMutable();
                                    this.supportedReceiveFormats_.add(bytes);
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

        @Override // com.garmin.proto.generated.GDIGarminShare.ShareTypeOrBuilder
        public ProtocolStringList getSupportedReceiveFormatsList() {
            return this.supportedReceiveFormats_;
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ShareType getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ShareType parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareType) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ShareType parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ShareType parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ShareType parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ShareType parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ShareType parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ShareType parseFrom(InputStream inputStream) {
            return (ShareType) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ShareType parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareType) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ShareType parseFrom(CodedInputStream codedInputStream) {
            return (ShareType) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ShareType parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ShareType) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private ShareType(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.identifier_ = "";
            this.supportedReceiveFormats_ = LazyStringArrayList.emptyList();
            this.memoizedIsInitialized = (byte) -1;
        }

        public /* synthetic */ ShareType(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class SupportedReceiveTypesRequest extends GeneratedMessageV3 implements SupportedReceiveTypesRequestOrBuilder {
        private static final SupportedReceiveTypesRequest DEFAULT_INSTANCE = new SupportedReceiveTypesRequest();

        @Deprecated
        public static final Parser<SupportedReceiveTypesRequest> PARSER = new AbstractParser<SupportedReceiveTypesRequest>() { // from class: com.garmin.proto.generated.GDIGarminShare.SupportedReceiveTypesRequest.1
            @Override // com.google.protobuf.Parser
            public SupportedReceiveTypesRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SupportedReceiveTypesRequest.newBuilder();
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
        public static final int SHARE_TYPES_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private List<ShareType> shareTypes_;

        private SupportedReceiveTypesRequest() {
            this.memoizedIsInitialized = (byte) -1;
            this.shareTypes_ = Collections.EMPTY_LIST;
        }

        public static SupportedReceiveTypesRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_SupportedReceiveTypesRequest_descriptor;
        }

        public static Builder newBuilder(SupportedReceiveTypesRequest supportedReceiveTypesRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(supportedReceiveTypesRequest);
        }

        public static SupportedReceiveTypesRequest parseDelimitedFrom(InputStream inputStream) {
            return (SupportedReceiveTypesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SupportedReceiveTypesRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SupportedReceiveTypesRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SupportedReceiveTypesRequest)) {
                return super.equals(obj);
            }
            SupportedReceiveTypesRequest supportedReceiveTypesRequest = (SupportedReceiveTypesRequest) obj;
            return getShareTypesList().equals(supportedReceiveTypesRequest.getShareTypesList()) && getUnknownFields().equals(supportedReceiveTypesRequest.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SupportedReceiveTypesRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.shareTypes_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.shareTypes_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.SupportedReceiveTypesRequestOrBuilder
        public ShareType getShareTypes(int i14) {
            return this.shareTypes_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.SupportedReceiveTypesRequestOrBuilder
        public int getShareTypesCount() {
            return this.shareTypes_.size();
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.SupportedReceiveTypesRequestOrBuilder
        public List<ShareType> getShareTypesList() {
            return this.shareTypes_;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.SupportedReceiveTypesRequestOrBuilder
        public ShareTypeOrBuilder getShareTypesOrBuilder(int i14) {
            return this.shareTypes_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.SupportedReceiveTypesRequestOrBuilder
        public List<? extends ShareTypeOrBuilder> getShareTypesOrBuilderList() {
            return this.shareTypes_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getShareTypesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getShareTypesList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_SupportedReceiveTypesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SupportedReceiveTypesRequest.class, Builder.class);
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
            return new SupportedReceiveTypesRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.shareTypes_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.shareTypes_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SupportedReceiveTypesRequestOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> shareTypesBuilder_;
            private List<ShareType> shareTypes_;

            private Builder() {
                this.shareTypes_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(SupportedReceiveTypesRequest supportedReceiveTypesRequest) {
            }

            private void buildPartialRepeatedFields(SupportedReceiveTypesRequest supportedReceiveTypesRequest) {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    supportedReceiveTypesRequest.shareTypes_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.shareTypes_ = Collections.unmodifiableList(this.shareTypes_);
                    this.bitField0_ &= -2;
                }
                supportedReceiveTypesRequest.shareTypes_ = this.shareTypes_;
            }

            private void ensureShareTypesIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.shareTypes_ = new ArrayList(this.shareTypes_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_SupportedReceiveTypesRequest_descriptor;
            }

            private RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> getShareTypesFieldBuilder() {
                if (this.shareTypesBuilder_ == null) {
                    this.shareTypesBuilder_ = new RepeatedFieldBuilderV3<>(this.shareTypes_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.shareTypes_ = null;
                }
                return this.shareTypesBuilder_;
            }

            public Builder addAllShareTypes(Iterable<? extends ShareType> iterable) {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureShareTypesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.shareTypes_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addShareTypes(ShareType.Builder builder) {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureShareTypesIsMutable();
                this.shareTypes_.add(builder.build());
                onChanged();
                return this;
            }

            public ShareType.Builder addShareTypesBuilder() {
                return (ShareType.Builder) getShareTypesFieldBuilder().addBuilder(ShareType.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SupportedReceiveTypesRequest build() {
                SupportedReceiveTypesRequest supportedReceiveTypesRequestBuildPartial = buildPartial();
                if (supportedReceiveTypesRequestBuildPartial.isInitialized()) {
                    return supportedReceiveTypesRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) supportedReceiveTypesRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SupportedReceiveTypesRequest buildPartial() {
                SupportedReceiveTypesRequest supportedReceiveTypesRequest = new SupportedReceiveTypesRequest(this);
                buildPartialRepeatedFields(supportedReceiveTypesRequest);
                if (this.bitField0_ != 0) {
                    buildPartial0(supportedReceiveTypesRequest);
                }
                onBuilt();
                return supportedReceiveTypesRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.shareTypes_ = Collections.EMPTY_LIST;
                } else {
                    this.shareTypes_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
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

            public Builder clearShareTypes() {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.shareTypes_ = Collections.EMPTY_LIST;
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
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_SupportedReceiveTypesRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.SupportedReceiveTypesRequestOrBuilder
            public ShareType getShareTypes(int i14) {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.shareTypes_.get(i14) : (ShareType) repeatedFieldBuilderV3.getMessage(i14);
            }

            public ShareType.Builder getShareTypesBuilder(int i14) {
                return (ShareType.Builder) getShareTypesFieldBuilder().getBuilder(i14);
            }

            public List<ShareType.Builder> getShareTypesBuilderList() {
                return getShareTypesFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.SupportedReceiveTypesRequestOrBuilder
            public int getShareTypesCount() {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.shareTypes_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.SupportedReceiveTypesRequestOrBuilder
            public List<ShareType> getShareTypesList() {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.shareTypes_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.SupportedReceiveTypesRequestOrBuilder
            public ShareTypeOrBuilder getShareTypesOrBuilder(int i14) {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.shareTypes_.get(i14) : (ShareTypeOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.SupportedReceiveTypesRequestOrBuilder
            public List<? extends ShareTypeOrBuilder> getShareTypesOrBuilderList() {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.shareTypes_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_SupportedReceiveTypesRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(SupportedReceiveTypesRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(SupportedReceiveTypesRequest supportedReceiveTypesRequest) {
                if (supportedReceiveTypesRequest == SupportedReceiveTypesRequest.getDefaultInstance()) {
                    return this;
                }
                if (this.shareTypesBuilder_ == null) {
                    if (!supportedReceiveTypesRequest.shareTypes_.isEmpty()) {
                        if (this.shareTypes_.isEmpty()) {
                            this.shareTypes_ = supportedReceiveTypesRequest.shareTypes_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureShareTypesIsMutable();
                            this.shareTypes_.addAll(supportedReceiveTypesRequest.shareTypes_);
                        }
                        onChanged();
                    }
                } else if (!supportedReceiveTypesRequest.shareTypes_.isEmpty()) {
                    boolean zIsEmpty = this.shareTypesBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.shareTypesBuilder_ = null;
                        this.shareTypes_ = supportedReceiveTypesRequest.shareTypes_;
                        this.bitField0_ &= -2;
                        this.shareTypesBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getShareTypesFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(supportedReceiveTypesRequest.shareTypes_);
                    }
                }
                mergeUnknownFields(supportedReceiveTypesRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeShareTypes(int i14) {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureShareTypesIsMutable();
                this.shareTypes_.remove(i14);
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

            public Builder setShareTypes(int i14, ShareType.Builder builder) {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureShareTypesIsMutable();
                this.shareTypes_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SupportedReceiveTypesRequest getDefaultInstanceForType() {
                return SupportedReceiveTypesRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.shareTypes_ = Collections.EMPTY_LIST;
            }

            public ShareType.Builder addShareTypesBuilder(int i14) {
                return (ShareType.Builder) getShareTypesFieldBuilder().addBuilder(i14, ShareType.getDefaultInstance());
            }

            public Builder addShareTypes(int i14, ShareType shareType) {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    shareType.getClass();
                    ensureShareTypesIsMutable();
                    this.shareTypes_.add(i14, shareType);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, shareType);
                return this;
            }

            public Builder setShareTypes(int i14, ShareType shareType) {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    shareType.getClass();
                    ensureShareTypesIsMutable();
                    this.shareTypes_.set(i14, shareType);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, shareType);
                return this;
            }

            public Builder addShareTypes(ShareType shareType) {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    shareType.getClass();
                    ensureShareTypesIsMutable();
                    this.shareTypes_.add(shareType);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(shareType);
                return this;
            }

            public Builder addShareTypes(int i14, ShareType.Builder builder) {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureShareTypesIsMutable();
                    this.shareTypes_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SupportedReceiveTypesRequest) {
                    return mergeFrom((SupportedReceiveTypesRequest) message);
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
                                    ShareType shareType = (ShareType) codedInputStream.readMessage(ShareType.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureShareTypesIsMutable();
                                        this.shareTypes_.add(shareType);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(shareType);
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
        public SupportedReceiveTypesRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SupportedReceiveTypesRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SupportedReceiveTypesRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SupportedReceiveTypesRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SupportedReceiveTypesRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SupportedReceiveTypesRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SupportedReceiveTypesRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SupportedReceiveTypesRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ SupportedReceiveTypesRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SupportedReceiveTypesRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SupportedReceiveTypesRequest parseFrom(InputStream inputStream) {
            return (SupportedReceiveTypesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SupportedReceiveTypesRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SupportedReceiveTypesRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SupportedReceiveTypesRequest parseFrom(CodedInputStream codedInputStream) {
            return (SupportedReceiveTypesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SupportedReceiveTypesRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SupportedReceiveTypesRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class SupportedReceiveTypesResponse extends GeneratedMessageV3 implements SupportedReceiveTypesResponseOrBuilder {
        private static final SupportedReceiveTypesResponse DEFAULT_INSTANCE = new SupportedReceiveTypesResponse();

        @Deprecated
        public static final Parser<SupportedReceiveTypesResponse> PARSER = new AbstractParser<SupportedReceiveTypesResponse>() { // from class: com.garmin.proto.generated.GDIGarminShare.SupportedReceiveTypesResponse.1
            @Override // com.google.protobuf.Parser
            public SupportedReceiveTypesResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SupportedReceiveTypesResponse.newBuilder();
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
        public static final int SHARE_TYPES_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private byte memoizedIsInitialized;
        private List<ShareType> shareTypes_;

        private SupportedReceiveTypesResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.shareTypes_ = Collections.EMPTY_LIST;
        }

        public static SupportedReceiveTypesResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_SupportedReceiveTypesResponse_descriptor;
        }

        public static Builder newBuilder(SupportedReceiveTypesResponse supportedReceiveTypesResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(supportedReceiveTypesResponse);
        }

        public static SupportedReceiveTypesResponse parseDelimitedFrom(InputStream inputStream) {
            return (SupportedReceiveTypesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SupportedReceiveTypesResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SupportedReceiveTypesResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SupportedReceiveTypesResponse)) {
                return super.equals(obj);
            }
            SupportedReceiveTypesResponse supportedReceiveTypesResponse = (SupportedReceiveTypesResponse) obj;
            return getShareTypesList().equals(supportedReceiveTypesResponse.getShareTypesList()) && getUnknownFields().equals(supportedReceiveTypesResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SupportedReceiveTypesResponse> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.shareTypes_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.shareTypes_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.SupportedReceiveTypesResponseOrBuilder
        public ShareType getShareTypes(int i14) {
            return this.shareTypes_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.SupportedReceiveTypesResponseOrBuilder
        public int getShareTypesCount() {
            return this.shareTypes_.size();
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.SupportedReceiveTypesResponseOrBuilder
        public List<ShareType> getShareTypesList() {
            return this.shareTypes_;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.SupportedReceiveTypesResponseOrBuilder
        public ShareTypeOrBuilder getShareTypesOrBuilder(int i14) {
            return this.shareTypes_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.SupportedReceiveTypesResponseOrBuilder
        public List<? extends ShareTypeOrBuilder> getShareTypesOrBuilderList() {
            return this.shareTypes_;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getShareTypesCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getShareTypesList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_SupportedReceiveTypesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SupportedReceiveTypesResponse.class, Builder.class);
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
            return new SupportedReceiveTypesResponse();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.shareTypes_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.shareTypes_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SupportedReceiveTypesResponseOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> shareTypesBuilder_;
            private List<ShareType> shareTypes_;

            private Builder() {
                this.shareTypes_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(SupportedReceiveTypesResponse supportedReceiveTypesResponse) {
            }

            private void buildPartialRepeatedFields(SupportedReceiveTypesResponse supportedReceiveTypesResponse) {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    supportedReceiveTypesResponse.shareTypes_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.shareTypes_ = Collections.unmodifiableList(this.shareTypes_);
                    this.bitField0_ &= -2;
                }
                supportedReceiveTypesResponse.shareTypes_ = this.shareTypes_;
            }

            private void ensureShareTypesIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.shareTypes_ = new ArrayList(this.shareTypes_);
                    this.bitField0_ |= 1;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_SupportedReceiveTypesResponse_descriptor;
            }

            private RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> getShareTypesFieldBuilder() {
                if (this.shareTypesBuilder_ == null) {
                    this.shareTypesBuilder_ = new RepeatedFieldBuilderV3<>(this.shareTypes_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.shareTypes_ = null;
                }
                return this.shareTypesBuilder_;
            }

            public Builder addAllShareTypes(Iterable<? extends ShareType> iterable) {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureShareTypesIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.shareTypes_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addShareTypes(ShareType.Builder builder) {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureShareTypesIsMutable();
                this.shareTypes_.add(builder.build());
                onChanged();
                return this;
            }

            public ShareType.Builder addShareTypesBuilder() {
                return (ShareType.Builder) getShareTypesFieldBuilder().addBuilder(ShareType.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SupportedReceiveTypesResponse build() {
                SupportedReceiveTypesResponse supportedReceiveTypesResponseBuildPartial = buildPartial();
                if (supportedReceiveTypesResponseBuildPartial.isInitialized()) {
                    return supportedReceiveTypesResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) supportedReceiveTypesResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SupportedReceiveTypesResponse buildPartial() {
                SupportedReceiveTypesResponse supportedReceiveTypesResponse = new SupportedReceiveTypesResponse(this);
                buildPartialRepeatedFields(supportedReceiveTypesResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(supportedReceiveTypesResponse);
                }
                onBuilt();
                return supportedReceiveTypesResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.shareTypes_ = Collections.EMPTY_LIST;
                } else {
                    this.shareTypes_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
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

            public Builder clearShareTypes() {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.shareTypes_ = Collections.EMPTY_LIST;
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
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_SupportedReceiveTypesResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.SupportedReceiveTypesResponseOrBuilder
            public ShareType getShareTypes(int i14) {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.shareTypes_.get(i14) : (ShareType) repeatedFieldBuilderV3.getMessage(i14);
            }

            public ShareType.Builder getShareTypesBuilder(int i14) {
                return (ShareType.Builder) getShareTypesFieldBuilder().getBuilder(i14);
            }

            public List<ShareType.Builder> getShareTypesBuilderList() {
                return getShareTypesFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.SupportedReceiveTypesResponseOrBuilder
            public int getShareTypesCount() {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.shareTypes_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.SupportedReceiveTypesResponseOrBuilder
            public List<ShareType> getShareTypesList() {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.shareTypes_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.SupportedReceiveTypesResponseOrBuilder
            public ShareTypeOrBuilder getShareTypesOrBuilder(int i14) {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                return repeatedFieldBuilderV3 == null ? this.shareTypes_.get(i14) : (ShareTypeOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.SupportedReceiveTypesResponseOrBuilder
            public List<? extends ShareTypeOrBuilder> getShareTypesOrBuilderList() {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.shareTypes_);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_SupportedReceiveTypesResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(SupportedReceiveTypesResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(SupportedReceiveTypesResponse supportedReceiveTypesResponse) {
                if (supportedReceiveTypesResponse == SupportedReceiveTypesResponse.getDefaultInstance()) {
                    return this;
                }
                if (this.shareTypesBuilder_ == null) {
                    if (!supportedReceiveTypesResponse.shareTypes_.isEmpty()) {
                        if (this.shareTypes_.isEmpty()) {
                            this.shareTypes_ = supportedReceiveTypesResponse.shareTypes_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureShareTypesIsMutable();
                            this.shareTypes_.addAll(supportedReceiveTypesResponse.shareTypes_);
                        }
                        onChanged();
                    }
                } else if (!supportedReceiveTypesResponse.shareTypes_.isEmpty()) {
                    boolean zIsEmpty = this.shareTypesBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.shareTypesBuilder_ = null;
                        this.shareTypes_ = supportedReceiveTypesResponse.shareTypes_;
                        this.bitField0_ &= -2;
                        this.shareTypesBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getShareTypesFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(supportedReceiveTypesResponse.shareTypes_);
                    }
                }
                mergeUnknownFields(supportedReceiveTypesResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeShareTypes(int i14) {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureShareTypesIsMutable();
                this.shareTypes_.remove(i14);
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

            public Builder setShareTypes(int i14, ShareType.Builder builder) {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureShareTypesIsMutable();
                this.shareTypes_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SupportedReceiveTypesResponse getDefaultInstanceForType() {
                return SupportedReceiveTypesResponse.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.shareTypes_ = Collections.EMPTY_LIST;
            }

            public ShareType.Builder addShareTypesBuilder(int i14) {
                return (ShareType.Builder) getShareTypesFieldBuilder().addBuilder(i14, ShareType.getDefaultInstance());
            }

            public Builder addShareTypes(int i14, ShareType shareType) {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    shareType.getClass();
                    ensureShareTypesIsMutable();
                    this.shareTypes_.add(i14, shareType);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, shareType);
                return this;
            }

            public Builder setShareTypes(int i14, ShareType shareType) {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    shareType.getClass();
                    ensureShareTypesIsMutable();
                    this.shareTypes_.set(i14, shareType);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, shareType);
                return this;
            }

            public Builder addShareTypes(ShareType shareType) {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    shareType.getClass();
                    ensureShareTypesIsMutable();
                    this.shareTypes_.add(shareType);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(shareType);
                return this;
            }

            public Builder addShareTypes(int i14, ShareType.Builder builder) {
                RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureShareTypesIsMutable();
                    this.shareTypes_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SupportedReceiveTypesResponse) {
                    return mergeFrom((SupportedReceiveTypesResponse) message);
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
                                    ShareType shareType = (ShareType) codedInputStream.readMessage(ShareType.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<ShareType, ShareType.Builder, ShareTypeOrBuilder> repeatedFieldBuilderV3 = this.shareTypesBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureShareTypesIsMutable();
                                        this.shareTypes_.add(shareType);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(shareType);
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
        public SupportedReceiveTypesResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SupportedReceiveTypesResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SupportedReceiveTypesResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SupportedReceiveTypesResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SupportedReceiveTypesResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private SupportedReceiveTypesResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SupportedReceiveTypesResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SupportedReceiveTypesResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ SupportedReceiveTypesResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SupportedReceiveTypesResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static SupportedReceiveTypesResponse parseFrom(InputStream inputStream) {
            return (SupportedReceiveTypesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SupportedReceiveTypesResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SupportedReceiveTypesResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SupportedReceiveTypesResponse parseFrom(CodedInputStream codedInputStream) {
            return (SupportedReceiveTypesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SupportedReceiveTypesResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SupportedReceiveTypesResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class TransferStartNotification extends GeneratedMessageV3 implements TransferStartNotificationOrBuilder {
        public static final int BATCH_ID_FIELD_NUMBER = 2;
        private static final TransferStartNotification DEFAULT_INSTANCE = new TransferStartNotification();

        @Deprecated
        public static final Parser<TransferStartNotification> PARSER = new AbstractParser<TransferStartNotification>() { // from class: com.garmin.proto.generated.GDIGarminShare.TransferStartNotification.1
            @Override // com.google.protobuf.Parser
            public TransferStartNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = TransferStartNotification.newBuilder();
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
        public static final int SHARE_ITEMS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private GDIDataTypes.UUID batchId_;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private List<GDIDataTypes.UUID> shareItems_;

        private TransferStartNotification() {
            this.memoizedIsInitialized = (byte) -1;
            this.shareItems_ = Collections.EMPTY_LIST;
        }

        public static TransferStartNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_TransferStartNotification_descriptor;
        }

        public static Builder newBuilder(TransferStartNotification transferStartNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(transferStartNotification);
        }

        public static TransferStartNotification parseDelimitedFrom(InputStream inputStream) {
            return (TransferStartNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static TransferStartNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<TransferStartNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof TransferStartNotification)) {
                return super.equals(obj);
            }
            TransferStartNotification transferStartNotification = (TransferStartNotification) obj;
            if (getShareItemsList().equals(transferStartNotification.getShareItemsList()) && hasBatchId() == transferStartNotification.hasBatchId()) {
                return (!hasBatchId() || getBatchId().equals(transferStartNotification.getBatchId())) && getUnknownFields().equals(transferStartNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.TransferStartNotificationOrBuilder
        public GDIDataTypes.UUID getBatchId() {
            GDIDataTypes.UUID uuid = this.batchId_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.TransferStartNotificationOrBuilder
        public GDIDataTypes.UUIDOrBuilder getBatchIdOrBuilder() {
            GDIDataTypes.UUID uuid = this.batchId_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<TransferStartNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = 0;
            for (int i15 = 0; i15 < this.shareItems_.size(); i15++) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(1, this.shareItems_.get(i15));
            }
            if ((this.bitField0_ & 1) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getBatchId());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.TransferStartNotificationOrBuilder
        public GDIDataTypes.UUID getShareItems(int i14) {
            return this.shareItems_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.TransferStartNotificationOrBuilder
        public int getShareItemsCount() {
            return this.shareItems_.size();
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.TransferStartNotificationOrBuilder
        public List<GDIDataTypes.UUID> getShareItemsList() {
            return this.shareItems_;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.TransferStartNotificationOrBuilder
        public GDIDataTypes.UUIDOrBuilder getShareItemsOrBuilder(int i14) {
            return this.shareItems_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.TransferStartNotificationOrBuilder
        public List<? extends GDIDataTypes.UUIDOrBuilder> getShareItemsOrBuilderList() {
            return this.shareItems_;
        }

        @Override // com.garmin.proto.generated.GDIGarminShare.TransferStartNotificationOrBuilder
        public boolean hasBatchId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (getShareItemsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getShareItemsList().hashCode();
            }
            if (hasBatchId()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getBatchId().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGarminShare.internal_static_GDI_Proto_GarminShare_TransferStartNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(TransferStartNotification.class, Builder.class);
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
            for (int i14 = 0; i14 < getShareItemsCount(); i14++) {
                if (!getShareItems(i14).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            if (!hasBatchId() || getBatchId().isInitialized()) {
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
            return new TransferStartNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            for (int i14 = 0; i14 < this.shareItems_.size(); i14++) {
                codedOutputStream.writeMessage(1, this.shareItems_.get(i14));
            }
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(2, getBatchId());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements TransferStartNotificationOrBuilder {
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> batchIdBuilder_;
            private GDIDataTypes.UUID batchId_;
            private int bitField0_;
            private RepeatedFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> shareItemsBuilder_;
            private List<GDIDataTypes.UUID> shareItems_;

            private Builder() {
                this.shareItems_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(TransferStartNotification transferStartNotification) {
                int i14;
                if ((this.bitField0_ & 2) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.batchIdBuilder_;
                    transferStartNotification.batchId_ = singleFieldBuilderV3 == null ? this.batchId_ : (GDIDataTypes.UUID) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                transferStartNotification.bitField0_ = i14 | transferStartNotification.bitField0_;
            }

            private void buildPartialRepeatedFields(TransferStartNotification transferStartNotification) {
                RepeatedFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    transferStartNotification.shareItems_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 1) != 0) {
                    this.shareItems_ = Collections.unmodifiableList(this.shareItems_);
                    this.bitField0_ &= -2;
                }
                transferStartNotification.shareItems_ = this.shareItems_;
            }

            private void ensureShareItemsIsMutable() {
                if ((this.bitField0_ & 1) == 0) {
                    this.shareItems_ = new ArrayList(this.shareItems_);
                    this.bitField0_ |= 1;
                }
            }

            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> getBatchIdFieldBuilder() {
                if (this.batchIdBuilder_ == null) {
                    this.batchIdBuilder_ = new SingleFieldBuilderV3<>(getBatchId(), getParentForChildren(), isClean());
                    this.batchId_ = null;
                }
                return this.batchIdBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_TransferStartNotification_descriptor;
            }

            private RepeatedFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> getShareItemsFieldBuilder() {
                if (this.shareItemsBuilder_ == null) {
                    this.shareItemsBuilder_ = new RepeatedFieldBuilderV3<>(this.shareItems_, (this.bitField0_ & 1) != 0, getParentForChildren(), isClean());
                    this.shareItems_ = null;
                }
                return this.shareItemsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getShareItemsFieldBuilder();
                    getBatchIdFieldBuilder();
                }
            }

            public Builder addAllShareItems(Iterable<? extends GDIDataTypes.UUID> iterable) {
                RepeatedFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureShareItemsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.shareItems_);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            public Builder addShareItems(GDIDataTypes.UUID.Builder builder) {
                RepeatedFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureShareItemsIsMutable();
                this.shareItems_.add(builder.build());
                onChanged();
                return this;
            }

            public GDIDataTypes.UUID.Builder addShareItemsBuilder() {
                return (GDIDataTypes.UUID.Builder) getShareItemsFieldBuilder().addBuilder(GDIDataTypes.UUID.getDefaultInstance());
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TransferStartNotification build() {
                TransferStartNotification transferStartNotificationBuildPartial = buildPartial();
                if (transferStartNotificationBuildPartial.isInitialized()) {
                    return transferStartNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) transferStartNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public TransferStartNotification buildPartial() {
                TransferStartNotification transferStartNotification = new TransferStartNotification(this);
                buildPartialRepeatedFields(transferStartNotification);
                if (this.bitField0_ != 0) {
                    buildPartial0(transferStartNotification);
                }
                onBuilt();
                return transferStartNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                RepeatedFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.shareItems_ = Collections.EMPTY_LIST;
                } else {
                    this.shareItems_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -2;
                this.batchId_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.batchIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.batchIdBuilder_ = null;
                }
                return this;
            }

            public Builder clearBatchId() {
                this.bitField0_ &= -3;
                this.batchId_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.batchIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.batchIdBuilder_ = null;
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

            public Builder clearShareItems() {
                RepeatedFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.shareItems_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.TransferStartNotificationOrBuilder
            public GDIDataTypes.UUID getBatchId() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.batchIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUID) singleFieldBuilderV3.getMessage();
                }
                GDIDataTypes.UUID uuid = this.batchId_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            public GDIDataTypes.UUID.Builder getBatchIdBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (GDIDataTypes.UUID.Builder) getBatchIdFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.TransferStartNotificationOrBuilder
            public GDIDataTypes.UUIDOrBuilder getBatchIdOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.batchIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.batchId_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_TransferStartNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.TransferStartNotificationOrBuilder
            public GDIDataTypes.UUID getShareItems(int i14) {
                RepeatedFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.shareItems_.get(i14) : (GDIDataTypes.UUID) repeatedFieldBuilderV3.getMessage(i14);
            }

            public GDIDataTypes.UUID.Builder getShareItemsBuilder(int i14) {
                return (GDIDataTypes.UUID.Builder) getShareItemsFieldBuilder().getBuilder(i14);
            }

            public List<GDIDataTypes.UUID.Builder> getShareItemsBuilderList() {
                return getShareItemsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.TransferStartNotificationOrBuilder
            public int getShareItemsCount() {
                RepeatedFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.shareItems_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.TransferStartNotificationOrBuilder
            public List<GDIDataTypes.UUID> getShareItemsList() {
                RepeatedFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.shareItems_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.TransferStartNotificationOrBuilder
            public GDIDataTypes.UUIDOrBuilder getShareItemsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.shareItems_.get(i14) : (GDIDataTypes.UUIDOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.TransferStartNotificationOrBuilder
            public List<? extends GDIDataTypes.UUIDOrBuilder> getShareItemsOrBuilderList() {
                RepeatedFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.shareItems_);
            }

            @Override // com.garmin.proto.generated.GDIGarminShare.TransferStartNotificationOrBuilder
            public boolean hasBatchId() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGarminShare.internal_static_GDI_Proto_GarminShare_TransferStartNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(TransferStartNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getShareItemsCount(); i14++) {
                    if (!getShareItems(i14).isInitialized()) {
                        return false;
                    }
                }
                return !hasBatchId() || getBatchId().isInitialized();
            }

            public Builder mergeBatchId(GDIDataTypes.UUID uuid) {
                GDIDataTypes.UUID uuid2;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.batchIdBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(uuid);
                } else if ((this.bitField0_ & 2) == 0 || (uuid2 = this.batchId_) == null || uuid2 == GDIDataTypes.UUID.getDefaultInstance()) {
                    this.batchId_ = uuid;
                } else {
                    getBatchIdBuilder().mergeFrom(uuid);
                }
                if (this.batchId_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeFrom(TransferStartNotification transferStartNotification) {
                if (transferStartNotification == TransferStartNotification.getDefaultInstance()) {
                    return this;
                }
                if (this.shareItemsBuilder_ == null) {
                    if (!transferStartNotification.shareItems_.isEmpty()) {
                        if (this.shareItems_.isEmpty()) {
                            this.shareItems_ = transferStartNotification.shareItems_;
                            this.bitField0_ &= -2;
                        } else {
                            ensureShareItemsIsMutable();
                            this.shareItems_.addAll(transferStartNotification.shareItems_);
                        }
                        onChanged();
                    }
                } else if (!transferStartNotification.shareItems_.isEmpty()) {
                    boolean zIsEmpty = this.shareItemsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.shareItemsBuilder_ = null;
                        this.shareItems_ = transferStartNotification.shareItems_;
                        this.bitField0_ &= -2;
                        this.shareItemsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getShareItemsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(transferStartNotification.shareItems_);
                    }
                }
                if (transferStartNotification.hasBatchId()) {
                    mergeBatchId(transferStartNotification.getBatchId());
                }
                mergeUnknownFields(transferStartNotification.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeShareItems(int i14) {
                RepeatedFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureShareItemsIsMutable();
                this.shareItems_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setBatchId(GDIDataTypes.UUID.Builder builder) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.batchIdBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.batchId_ = builder.build();
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

            public Builder setShareItems(int i14, GDIDataTypes.UUID.Builder builder) {
                RepeatedFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureShareItemsIsMutable();
                this.shareItems_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public TransferStartNotification getDefaultInstanceForType() {
                return TransferStartNotification.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.shareItems_ = Collections.EMPTY_LIST;
                maybeForceBuilderInitialization();
            }

            public GDIDataTypes.UUID.Builder addShareItemsBuilder(int i14) {
                return (GDIDataTypes.UUID.Builder) getShareItemsFieldBuilder().addBuilder(i14, GDIDataTypes.UUID.getDefaultInstance());
            }

            public Builder addShareItems(int i14, GDIDataTypes.UUID uuid) {
                RepeatedFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    uuid.getClass();
                    ensureShareItemsIsMutable();
                    this.shareItems_.add(i14, uuid);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, uuid);
                return this;
            }

            public Builder setBatchId(GDIDataTypes.UUID uuid) {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.batchIdBuilder_;
                if (singleFieldBuilderV3 == null) {
                    uuid.getClass();
                    this.batchId_ = uuid;
                } else {
                    singleFieldBuilderV3.setMessage(uuid);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setShareItems(int i14, GDIDataTypes.UUID uuid) {
                RepeatedFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    uuid.getClass();
                    ensureShareItemsIsMutable();
                    this.shareItems_.set(i14, uuid);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, uuid);
                return this;
            }

            public Builder addShareItems(GDIDataTypes.UUID uuid) {
                RepeatedFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    uuid.getClass();
                    ensureShareItemsIsMutable();
                    this.shareItems_.add(uuid);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(uuid);
                return this;
            }

            public Builder addShareItems(int i14, GDIDataTypes.UUID.Builder builder) {
                RepeatedFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureShareItemsIsMutable();
                    this.shareItems_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof TransferStartNotification) {
                    return mergeFrom((TransferStartNotification) message);
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
                                    GDIDataTypes.UUID uuid = (GDIDataTypes.UUID) codedInputStream.readMessage(GDIDataTypes.UUID.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> repeatedFieldBuilderV3 = this.shareItemsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureShareItemsIsMutable();
                                        this.shareItems_.add(uuid);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(uuid);
                                    }
                                } else if (tag != 18) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    codedInputStream.readMessage(getBatchIdFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
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
        public TransferStartNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static TransferStartNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TransferStartNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TransferStartNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static TransferStartNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private TransferStartNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static TransferStartNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static TransferStartNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ TransferStartNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static TransferStartNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static TransferStartNotification parseFrom(InputStream inputStream) {
            return (TransferStartNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static TransferStartNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TransferStartNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static TransferStartNotification parseFrom(CodedInputStream codedInputStream) {
            return (TransferStartNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static TransferStartNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (TransferStartNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }
}
