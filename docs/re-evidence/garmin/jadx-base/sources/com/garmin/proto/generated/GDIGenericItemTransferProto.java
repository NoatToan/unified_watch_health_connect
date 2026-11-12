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
import com.google.protobuf.GeneratedMessage;
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
public final class GDIGenericItemTransferProto {
    private static Descriptors.FileDescriptor descriptor = Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(new String[]{"\n\u001cGDIGenericItemTransfer.proto\u0012\u001dGDI.Proto.GenericItemTransfer\u001a\u0012GDIDataTypes.proto\"\u0081\u0006\n\u001aGenericItemTransferService\u0012S\n\u0016arbitrary_item_request\u0018\u0001 \u0001(\u000b23.GDI.Proto.GenericItemTransfer.ArbitraryItemRequest\u0012U\n\u0017arbitrary_item_response\u0018\u0002 \u0001(\u000b24.GDI.Proto.GenericItemTransfer.ArbitraryItemResponse\u0012I\n\u0011item_list_request\u0018\u0003 \u0001(\u000b2..GDI.Proto.GenericItemTransfer.ItemListRequest\u0012K\n\u0012item_list_response\u0018\u0004 \u0001(\u000b2/.GDI.Proto.GenericItemTransfer.ItemListResponse\u0012E\n\u0011item_data_request\u0018\u0005 \u0001(\u000b2*.GDI.Proto.GenericItemTransfer.ItemRequest\u0012G\n\u0012item_data_response\u0018\u0006 \u0001(\u000b2+.GDI.Proto.GenericItemTransfer.ItemResponse\u0012S\n\u0016cancel_session_request\u0018\t \u0001(\u000b23.GDI.Proto.GenericItemTransfer.CancelSessionRequest\u0012U\n\u0017cancel_session_response\u0018\n \u0001(\u000b24.GDI.Proto.GenericItemTransfer.CancelSessionResponse\u0012c\n\u001esession_completed_notification\u0018\u000b \u0001(\u000b2;.GDI.Proto.GenericItemTransfer.SessionCompletedNotification\"\u001a\n\u000eDataTypeConfig*\b\bd\u0010\u0080\u0080\u0080\u0080\u0002\"\u001a\n\u000eDataTypeStatus*\b\bd\u0010\u0080\u0080\u0080\u0080\u0002\"M\n\u000bGenericItem\u0012\u0018\n\u0010data_transfer_id\u0018\u0001 \u0001(\r\u0012\u001a\n\u0012data_transfer_size\u0018\u0002 \u0001(\r*\b\bd\u0010\u0080\u0080\u0080\u0080\u0002\"I\n\u0014GenericItemReference\u0012'\n\u0004uuid\u0018\u0001 \u0001(\u000b2\u0019.GDI.Proto.DataTypes.UUID*\b\bd\u0010\u0080\u0080\u0080\u0080\u0002\"q\n\u0014ArbitraryItemRequest\u0012=\n\u0006config\u0018\u0001 \u0001(\u000b2-.GDI.Proto.GenericItemTransfer.DataTypeConfig\u0012\u001a\n\u0012item_request_count\u0018\u0002 \u0001(\r\"\u0085\u0003\n\u0015ArbitraryItemResponse\u0012K\n\u0006status\u0018\u0001 \u0002(\u000e2;.GDI.Proto.GenericItemTransfer.ArbitraryItemResponse.Status\u0012G\n\u0010data_type_status\u0018\u0002 \u0001(\u000b2-.GDI.Proto.GenericItemTransfer.DataTypeStatus\u0012\u0012\n\nsession_id\u0018\u0003 \u0001(\r\u0012\u001c\n\u0011max_request_count\u0018\u0004 \u0001(\r:\u00011\"£\u0001\n\u0006Status\u0012\u000b\n\u0007SUCCESS\u0010\u0001\u0012\t\n\u0005ABORT\u0010\u0002\u0012\t\n\u0005ERROR\u0010\u0003\u0012\u0019\n\u0015UNSUPPORTED_DATA_TYPE\u0010\u0004\u0012\u001c\n\u0018UNSUPPORTED_REQUEST_TYPE\u0010\u0005\u0012\u0015\n\u0011DATA_TYPE_IS_BUSY\u0010\u0006\u0012\u0012\n\u000eSYSTEM_IS_BUSY\u0010\u0007\u0012\u0012\n\u000eTRANSFER_LIMIT\u0010\b\"\u0095\u0001\n\u000fItemListRequest\u0012\u0012\n\nsession_id\u0018\u0001 \u0001(\r\u0012=\n\u0006config\u0018\u0002 \u0001(\u000b2-.GDI.Proto.GenericItemTransfer.DataTypeConfig\u0012\u0013\n\u000blist_offset\u0018\u0003 \u0001(\r\u0012\u001a\n\u0012max_item_ref_count\u0018\u0004 \u0001(\r\"°\u0004\n\u0010ItemListResponse\u0012F\n\u0006status\u0018\u0001 \u0002(\u000e26.GDI.Proto.GenericItemTransfer.ItemListResponse.Status\u0012G\n\u0010data_type_status\u0018\u0002 \u0001(\u000b2-.GDI.Proto.GenericItemTransfer.DataTypeStatus\u0012\u0012\n\nsession_id\u0018\u0003 \u0001(\r\u0012B\n\u0005items\u0018\u0004 \u0003(\u000b23.GDI.Proto.GenericItemTransfer.GenericItemReference\u0012\u001c\n\u0011max_request_count\u0018\u0005 \u0001(\r:\u00011\u0012\u0018\n\u0010next_list_offset\u0018\u0006 \u0001(\r\"ú\u0001\n\u0006Status\u0012\u000b\n\u0007SUCCESS\u0010\u0001\u0012\f\n\bNO_ITEMS\u0010\u0002\u0012\t\n\u0005ABORT\u0010\u0003\u0012\t\n\u0005ERROR\u0010\u0004\u0012\u0016\n\u0012INVALID_SESSION_ID\u0010\u0005\u0012\u0017\n\u0013INVALID_LIST_OFFSET\u0010\u0006\u0012\u0016\n\u0012WRONG_SESSION_TYPE\u0010\u0007\u0012\u0019\n\u0015UNSUPPORTED_DATA_TYPE\u0010\b\u0012\u001c\n\u0018UNSUPPORTED_REQUEST_TYPE\u0010\t\u0012\u0015\n\u0011DATA_TYPE_IS_BUSY\u0010\n\u0012\u0012\n\u000eSYSTEM_IS_BUSY\u0010\u000b\u0012\u0012\n\u000eTRANSFER_LIMIT\u0010\f\"e\n\u000bItemRequest\u0012\u0012\n\nsession_id\u0018\u0001 \u0001(\r\u0012B\n\u0005items\u0018\u0006 \u0003(\u000b23.GDI.Proto.GenericItemTransfer.GenericItemReference\"Þ\u0003\n\fItemResponse\u0012B\n\u0006status\u0018\u0001 \u0002(\u000e22.GDI.Proto.GenericItemTransfer.ItemResponse.Status\u0012G\n\u0010data_type_status\u0018\u0002 \u0001(\u000b2-.GDI.Proto.GenericItemTransfer.DataTypeStatus\u0012\u0012\n\nsession_id\u0018\u0003 \u0001(\r\u00129\n\u0005items\u0018\u0004 \u0003(\u000b2*.GDI.Proto.GenericItemTransfer.GenericItem\u0012J\n\rinvalid_items\u0018\u0005 \u0003(\u000b23.GDI.Proto.GenericItemTransfer.GenericItemReference\u0012\u0019\n\u0011max_request_count\u0018\u0006 \u0001(\r\"\u008a\u0001\n\u0006Status\u0012\u000b\n\u0007SUCCESS\u0010\u0001\u0012\u0010\n\fINVALID_ITEM\u0010\u0002\u0012\t\n\u0005ABORT\u0010\u0003\u0012\t\n\u0005ERROR\u0010\u0004\u0012\u0016\n\u0012INVALID_SESSION_ID\u0010\u0005\u0012\u001c\n\u0018UNSUPPORTED_REQUEST_TYPE\u0010\u0006\u0012\u0015\n\u0011REQUEST_TOO_LARGE\u0010\u0007\"¼\u0001\n\u001cSessionCompletedNotification\u0012\u0012\n\nsession_id\u0018\u0001 \u0002(\r\u0012?\n\u0006reason\u0018\u0002 \u0002(\u000e2/.GDI.Proto.GenericItemTransfer.SessionEndReason\u0012G\n\u0010data_type_status\u0018\u0003 \u0001(\u000b2-.GDI.Proto.GenericItemTransfer.DataTypeStatus\"´\u0001\n\u0014CancelSessionRequest\u0012\u0012\n\nsession_id\u0018\u0001 \u0002(\r\u0012?\n\u0006reason\u0018\u0002 \u0001(\u000e2/.GDI.Proto.GenericItemTransfer.SessionEndReason\u0012G\n\u0010data_type_status\u0018\u0003 \u0001(\u000b2-.GDI.Proto.GenericItemTransfer.DataTypeStatus\"\u009e\u0001\n\u0015CancelSessionResponse\u0012K\n\u0006status\u0018\u0001 \u0002(\u000e2;.GDI.Proto.GenericItemTransfer.CancelSessionResponse.Status\"8\n\u0006Status\u0012\u000b\n\u0007SUCCESS\u0010\u0001\u0012\t\n\u0005ERROR\u0010\u0002\u0012\u0016\n\u0012INVALID_SESSION_ID\u0010\u0003*\u0088\u0001\n\u0010SessionEndReason\u0012\f\n\bCOMPLETE\u0010\u0001\u0012\t\n\u0005ERROR\u0010\u0002\u0012\u000b\n\u0007TIMEOUT\u0010\u0003\u0012\u000f\n\u000bUSER_CANCEL\u0010\u0004\u0012\f\n\bSHUTDOWN\u0010\u0005\u0012\u000b\n\u0007RESTART\u0010\u0006\u0012\u0013\n\u000fAPP_RESTRICTION\u0010\u0007\u0012\r\n\tAPP_CLOSE\u0010\bB;\n\u001acom.garmin.proto.generatedB\u001bGDIGenericItemTransferProtoH\u0003"}, new Descriptors.FileDescriptor[]{GDIDataTypes.getDescriptor()});
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GenericItemTransfer_ArbitraryItemRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GenericItemTransfer_ArbitraryItemRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GenericItemTransfer_ArbitraryItemResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GenericItemTransfer_ArbitraryItemResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GenericItemTransfer_CancelSessionRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GenericItemTransfer_CancelSessionRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GenericItemTransfer_CancelSessionResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GenericItemTransfer_CancelSessionResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GenericItemTransfer_DataTypeConfig_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GenericItemTransfer_DataTypeConfig_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GenericItemTransfer_DataTypeStatus_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GenericItemTransfer_DataTypeStatus_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GenericItemTransfer_GenericItemReference_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GenericItemTransfer_GenericItemReference_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GenericItemTransfer_GenericItemTransferService_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GenericItemTransfer_GenericItemTransferService_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GenericItemTransfer_GenericItem_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GenericItemTransfer_GenericItem_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GenericItemTransfer_ItemListRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GenericItemTransfer_ItemListRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GenericItemTransfer_ItemListResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GenericItemTransfer_ItemListResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GenericItemTransfer_ItemRequest_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GenericItemTransfer_ItemRequest_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GenericItemTransfer_ItemResponse_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GenericItemTransfer_ItemResponse_fieldAccessorTable;
    private static final Descriptors.Descriptor internal_static_GDI_Proto_GenericItemTransfer_SessionCompletedNotification_descriptor;
    private static final GeneratedMessageV3.FieldAccessorTable internal_static_GDI_Proto_GenericItemTransfer_SessionCompletedNotification_fieldAccessorTable;

    public interface ArbitraryItemRequestOrBuilder extends MessageOrBuilder {
        DataTypeConfig getConfig();

        DataTypeConfigOrBuilder getConfigOrBuilder();

        int getItemRequestCount();

        boolean hasConfig();

        boolean hasItemRequestCount();
    }

    public interface ArbitraryItemResponseOrBuilder extends MessageOrBuilder {
        DataTypeStatus getDataTypeStatus();

        DataTypeStatusOrBuilder getDataTypeStatusOrBuilder();

        int getMaxRequestCount();

        int getSessionId();

        ArbitraryItemResponse.Status getStatus();

        boolean hasDataTypeStatus();

        boolean hasMaxRequestCount();

        boolean hasSessionId();

        boolean hasStatus();
    }

    public interface CancelSessionRequestOrBuilder extends MessageOrBuilder {
        DataTypeStatus getDataTypeStatus();

        DataTypeStatusOrBuilder getDataTypeStatusOrBuilder();

        SessionEndReason getReason();

        int getSessionId();

        boolean hasDataTypeStatus();

        boolean hasReason();

        boolean hasSessionId();
    }

    public interface CancelSessionResponseOrBuilder extends MessageOrBuilder {
        CancelSessionResponse.Status getStatus();

        boolean hasStatus();
    }

    public interface DataTypeConfigOrBuilder extends GeneratedMessageV3.ExtendableMessageOrBuilder<DataTypeConfig> {
    }

    public interface DataTypeStatusOrBuilder extends GeneratedMessageV3.ExtendableMessageOrBuilder<DataTypeStatus> {
    }

    public interface GenericItemOrBuilder extends GeneratedMessageV3.ExtendableMessageOrBuilder<GenericItem> {
        int getDataTransferId();

        int getDataTransferSize();

        boolean hasDataTransferId();

        boolean hasDataTransferSize();
    }

    public interface GenericItemReferenceOrBuilder extends GeneratedMessageV3.ExtendableMessageOrBuilder<GenericItemReference> {
        GDIDataTypes.UUID getUuid();

        GDIDataTypes.UUIDOrBuilder getUuidOrBuilder();

        boolean hasUuid();
    }

    public interface GenericItemTransferServiceOrBuilder extends MessageOrBuilder {
        ArbitraryItemRequest getArbitraryItemRequest();

        ArbitraryItemRequestOrBuilder getArbitraryItemRequestOrBuilder();

        ArbitraryItemResponse getArbitraryItemResponse();

        ArbitraryItemResponseOrBuilder getArbitraryItemResponseOrBuilder();

        CancelSessionRequest getCancelSessionRequest();

        CancelSessionRequestOrBuilder getCancelSessionRequestOrBuilder();

        CancelSessionResponse getCancelSessionResponse();

        CancelSessionResponseOrBuilder getCancelSessionResponseOrBuilder();

        ItemRequest getItemDataRequest();

        ItemRequestOrBuilder getItemDataRequestOrBuilder();

        ItemResponse getItemDataResponse();

        ItemResponseOrBuilder getItemDataResponseOrBuilder();

        ItemListRequest getItemListRequest();

        ItemListRequestOrBuilder getItemListRequestOrBuilder();

        ItemListResponse getItemListResponse();

        ItemListResponseOrBuilder getItemListResponseOrBuilder();

        SessionCompletedNotification getSessionCompletedNotification();

        SessionCompletedNotificationOrBuilder getSessionCompletedNotificationOrBuilder();

        boolean hasArbitraryItemRequest();

        boolean hasArbitraryItemResponse();

        boolean hasCancelSessionRequest();

        boolean hasCancelSessionResponse();

        boolean hasItemDataRequest();

        boolean hasItemDataResponse();

        boolean hasItemListRequest();

        boolean hasItemListResponse();

        boolean hasSessionCompletedNotification();
    }

    public interface ItemListRequestOrBuilder extends MessageOrBuilder {
        DataTypeConfig getConfig();

        DataTypeConfigOrBuilder getConfigOrBuilder();

        int getListOffset();

        int getMaxItemRefCount();

        int getSessionId();

        boolean hasConfig();

        boolean hasListOffset();

        boolean hasMaxItemRefCount();

        boolean hasSessionId();
    }

    public interface ItemListResponseOrBuilder extends MessageOrBuilder {
        DataTypeStatus getDataTypeStatus();

        DataTypeStatusOrBuilder getDataTypeStatusOrBuilder();

        GenericItemReference getItems(int i14);

        int getItemsCount();

        List<GenericItemReference> getItemsList();

        GenericItemReferenceOrBuilder getItemsOrBuilder(int i14);

        List<? extends GenericItemReferenceOrBuilder> getItemsOrBuilderList();

        int getMaxRequestCount();

        int getNextListOffset();

        int getSessionId();

        ItemListResponse.Status getStatus();

        boolean hasDataTypeStatus();

        boolean hasMaxRequestCount();

        boolean hasNextListOffset();

        boolean hasSessionId();

        boolean hasStatus();
    }

    public interface ItemRequestOrBuilder extends MessageOrBuilder {
        GenericItemReference getItems(int i14);

        int getItemsCount();

        List<GenericItemReference> getItemsList();

        GenericItemReferenceOrBuilder getItemsOrBuilder(int i14);

        List<? extends GenericItemReferenceOrBuilder> getItemsOrBuilderList();

        int getSessionId();

        boolean hasSessionId();
    }

    public interface ItemResponseOrBuilder extends MessageOrBuilder {
        DataTypeStatus getDataTypeStatus();

        DataTypeStatusOrBuilder getDataTypeStatusOrBuilder();

        GenericItemReference getInvalidItems(int i14);

        int getInvalidItemsCount();

        List<GenericItemReference> getInvalidItemsList();

        GenericItemReferenceOrBuilder getInvalidItemsOrBuilder(int i14);

        List<? extends GenericItemReferenceOrBuilder> getInvalidItemsOrBuilderList();

        GenericItem getItems(int i14);

        int getItemsCount();

        List<GenericItem> getItemsList();

        GenericItemOrBuilder getItemsOrBuilder(int i14);

        List<? extends GenericItemOrBuilder> getItemsOrBuilderList();

        int getMaxRequestCount();

        int getSessionId();

        ItemResponse.Status getStatus();

        boolean hasDataTypeStatus();

        boolean hasMaxRequestCount();

        boolean hasSessionId();

        boolean hasStatus();
    }

    public interface SessionCompletedNotificationOrBuilder extends MessageOrBuilder {
        DataTypeStatus getDataTypeStatus();

        DataTypeStatusOrBuilder getDataTypeStatusOrBuilder();

        SessionEndReason getReason();

        int getSessionId();

        boolean hasDataTypeStatus();

        boolean hasReason();

        boolean hasSessionId();
    }

    static {
        Descriptors.Descriptor descriptor2 = getDescriptor().getMessageTypes().get(0);
        internal_static_GDI_Proto_GenericItemTransfer_GenericItemTransferService_descriptor = descriptor2;
        internal_static_GDI_Proto_GenericItemTransfer_GenericItemTransferService_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor2, new String[]{"ArbitraryItemRequest", "ArbitraryItemResponse", "ItemListRequest", "ItemListResponse", "ItemDataRequest", "ItemDataResponse", "CancelSessionRequest", "CancelSessionResponse", "SessionCompletedNotification"});
        Descriptors.Descriptor descriptor3 = getDescriptor().getMessageTypes().get(1);
        internal_static_GDI_Proto_GenericItemTransfer_DataTypeConfig_descriptor = descriptor3;
        internal_static_GDI_Proto_GenericItemTransfer_DataTypeConfig_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor3, new String[0]);
        Descriptors.Descriptor descriptor4 = getDescriptor().getMessageTypes().get(2);
        internal_static_GDI_Proto_GenericItemTransfer_DataTypeStatus_descriptor = descriptor4;
        internal_static_GDI_Proto_GenericItemTransfer_DataTypeStatus_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor4, new String[0]);
        Descriptors.Descriptor descriptor5 = getDescriptor().getMessageTypes().get(3);
        internal_static_GDI_Proto_GenericItemTransfer_GenericItem_descriptor = descriptor5;
        internal_static_GDI_Proto_GenericItemTransfer_GenericItem_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor5, new String[]{"DataTransferId", "DataTransferSize"});
        Descriptors.Descriptor descriptor6 = getDescriptor().getMessageTypes().get(4);
        internal_static_GDI_Proto_GenericItemTransfer_GenericItemReference_descriptor = descriptor6;
        internal_static_GDI_Proto_GenericItemTransfer_GenericItemReference_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor6, new String[]{"Uuid"});
        Descriptors.Descriptor descriptor7 = getDescriptor().getMessageTypes().get(5);
        internal_static_GDI_Proto_GenericItemTransfer_ArbitraryItemRequest_descriptor = descriptor7;
        internal_static_GDI_Proto_GenericItemTransfer_ArbitraryItemRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor7, new String[]{"Config", "ItemRequestCount"});
        Descriptors.Descriptor descriptor8 = getDescriptor().getMessageTypes().get(6);
        internal_static_GDI_Proto_GenericItemTransfer_ArbitraryItemResponse_descriptor = descriptor8;
        internal_static_GDI_Proto_GenericItemTransfer_ArbitraryItemResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor8, new String[]{"Status", "DataTypeStatus", "SessionId", "MaxRequestCount"});
        Descriptors.Descriptor descriptor9 = getDescriptor().getMessageTypes().get(7);
        internal_static_GDI_Proto_GenericItemTransfer_ItemListRequest_descriptor = descriptor9;
        internal_static_GDI_Proto_GenericItemTransfer_ItemListRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor9, new String[]{"SessionId", "Config", "ListOffset", "MaxItemRefCount"});
        Descriptors.Descriptor descriptor10 = getDescriptor().getMessageTypes().get(8);
        internal_static_GDI_Proto_GenericItemTransfer_ItemListResponse_descriptor = descriptor10;
        internal_static_GDI_Proto_GenericItemTransfer_ItemListResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor10, new String[]{"Status", "DataTypeStatus", "SessionId", "Items", "MaxRequestCount", "NextListOffset"});
        Descriptors.Descriptor descriptor11 = getDescriptor().getMessageTypes().get(9);
        internal_static_GDI_Proto_GenericItemTransfer_ItemRequest_descriptor = descriptor11;
        internal_static_GDI_Proto_GenericItemTransfer_ItemRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor11, new String[]{"SessionId", "Items"});
        Descriptors.Descriptor descriptor12 = getDescriptor().getMessageTypes().get(10);
        internal_static_GDI_Proto_GenericItemTransfer_ItemResponse_descriptor = descriptor12;
        internal_static_GDI_Proto_GenericItemTransfer_ItemResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor12, new String[]{"Status", "DataTypeStatus", "SessionId", "Items", "InvalidItems", "MaxRequestCount"});
        Descriptors.Descriptor descriptor13 = getDescriptor().getMessageTypes().get(11);
        internal_static_GDI_Proto_GenericItemTransfer_SessionCompletedNotification_descriptor = descriptor13;
        internal_static_GDI_Proto_GenericItemTransfer_SessionCompletedNotification_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor13, new String[]{"SessionId", "Reason", "DataTypeStatus"});
        Descriptors.Descriptor descriptor14 = getDescriptor().getMessageTypes().get(12);
        internal_static_GDI_Proto_GenericItemTransfer_CancelSessionRequest_descriptor = descriptor14;
        internal_static_GDI_Proto_GenericItemTransfer_CancelSessionRequest_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor14, new String[]{"SessionId", "Reason", "DataTypeStatus"});
        Descriptors.Descriptor descriptor15 = getDescriptor().getMessageTypes().get(13);
        internal_static_GDI_Proto_GenericItemTransfer_CancelSessionResponse_descriptor = descriptor15;
        internal_static_GDI_Proto_GenericItemTransfer_CancelSessionResponse_fieldAccessorTable = new GeneratedMessageV3.FieldAccessorTable(descriptor15, new String[]{"Status"});
        GDIDataTypes.getDescriptor();
    }

    private GDIGenericItemTransferProto() {
    }

    public static Descriptors.FileDescriptor getDescriptor() {
        return descriptor;
    }

    public static void registerAllExtensions(ExtensionRegistry extensionRegistry) {
        registerAllExtensions((ExtensionRegistryLite) extensionRegistry);
    }

    public static final class DataTypeConfig extends GeneratedMessageV3.ExtendableMessage<DataTypeConfig> implements DataTypeConfigOrBuilder {
        private static final DataTypeConfig DEFAULT_INSTANCE = new DataTypeConfig();

        @Deprecated
        public static final Parser<DataTypeConfig> PARSER = new AbstractParser<DataTypeConfig>() { // from class: com.garmin.proto.generated.GDIGenericItemTransferProto.DataTypeConfig.1
            @Override // com.google.protobuf.Parser
            public DataTypeConfig parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DataTypeConfig.newBuilder();
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

        private DataTypeConfig(GeneratedMessageV3.ExtendableBuilder<DataTypeConfig, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DataTypeConfig getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_DataTypeConfig_descriptor;
        }

        public static Builder newBuilder(DataTypeConfig dataTypeConfig) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dataTypeConfig);
        }

        public static DataTypeConfig parseDelimitedFrom(InputStream inputStream) {
            return (DataTypeConfig) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DataTypeConfig parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DataTypeConfig> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DataTypeConfig)) {
                return super.equals(obj);
            }
            DataTypeConfig dataTypeConfig = (DataTypeConfig) obj;
            return getUnknownFields().equals(dataTypeConfig.getUnknownFields()) && getExtensionFields().equals(dataTypeConfig.getExtensionFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DataTypeConfig> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getUnknownFields().hashCode() + (AbstractMessage.hashFields(getDescriptor().hashCode() + 779, getExtensionFields()) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_DataTypeConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(DataTypeConfig.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            if (extensionsAreInitialized()) {
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
            return new DataTypeConfig();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            newExtensionWriter().writeUntil(536870912, codedOutputStream);
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.ExtendableBuilder<DataTypeConfig, Builder> implements DataTypeConfigOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_DataTypeConfig_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder addExtension(GeneratedMessage.GeneratedExtension<DataTypeConfig, List<Type>> generatedExtension, Type type) {
                return (Builder) super.addExtension((GeneratedMessage.GeneratedExtension<MessageT, List<Type>>) generatedExtension, type);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataTypeConfig build() {
                DataTypeConfig dataTypeConfigBuildPartial = buildPartial();
                if (dataTypeConfigBuildPartial.isInitialized()) {
                    return dataTypeConfigBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataTypeConfigBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataTypeConfig buildPartial() {
                DataTypeConfig dataTypeConfig = new DataTypeConfig(this);
                onBuilt();
                return dataTypeConfig;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <T> Builder clearExtension(GeneratedMessage.GeneratedExtension<DataTypeConfig, T> generatedExtension) {
                return (Builder) super.clearExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
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
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_DataTypeConfig_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_DataTypeConfig_fieldAccessorTable.ensureFieldAccessorsInitialized(DataTypeConfig.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return extensionsAreInitialized();
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

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder setExtension(GeneratedMessage.GeneratedExtension<DataTypeConfig, Type> generatedExtension, Type type) {
                return (Builder) super.setExtension((GeneratedMessage.GeneratedExtension<MessageT, Type>) generatedExtension, type);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
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
            public DataTypeConfig getDefaultInstanceForType() {
                return DataTypeConfig.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder addExtension(GeneratedMessage.GeneratedExtension generatedExtension, Object obj) {
                return addExtension((GeneratedMessage.GeneratedExtension<DataTypeConfig, List<Object>>) generatedExtension, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedExtension, Object obj) {
                return setExtension((GeneratedMessage.GeneratedExtension<DataTypeConfig, Object>) generatedExtension, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedExtension, int i14, Object obj) {
                return setExtension((GeneratedMessage.GeneratedExtension<DataTypeConfig, List<Object>>) generatedExtension, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder setExtension(GeneratedMessage.GeneratedExtension<DataTypeConfig, List<Type>> generatedExtension, int i14, Type type) {
                return (Builder) super.setExtension((GeneratedMessage.GeneratedExtension<MessageT, List<Type>>) generatedExtension, i14, type);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DataTypeConfig) {
                    return mergeFrom((DataTypeConfig) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DataTypeConfig dataTypeConfig) {
                if (dataTypeConfig == DataTypeConfig.getDefaultInstance()) {
                    return this;
                }
                mergeExtensionFields(dataTypeConfig);
                mergeUnknownFields(dataTypeConfig.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DataTypeConfig getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ DataTypeConfig(Builder builder) {
            this((GeneratedMessageV3.ExtendableBuilder<DataTypeConfig, ?>) builder);
        }

        private DataTypeConfig() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DataTypeConfig parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataTypeConfig) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataTypeConfig parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DataTypeConfig parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DataTypeConfig parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DataTypeConfig parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DataTypeConfig parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DataTypeConfig parseFrom(InputStream inputStream) {
            return (DataTypeConfig) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DataTypeConfig parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataTypeConfig) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataTypeConfig parseFrom(CodedInputStream codedInputStream) {
            return (DataTypeConfig) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DataTypeConfig parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataTypeConfig) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class DataTypeStatus extends GeneratedMessageV3.ExtendableMessage<DataTypeStatus> implements DataTypeStatusOrBuilder {
        private static final DataTypeStatus DEFAULT_INSTANCE = new DataTypeStatus();

        @Deprecated
        public static final Parser<DataTypeStatus> PARSER = new AbstractParser<DataTypeStatus>() { // from class: com.garmin.proto.generated.GDIGenericItemTransferProto.DataTypeStatus.1
            @Override // com.google.protobuf.Parser
            public DataTypeStatus parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = DataTypeStatus.newBuilder();
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

        private DataTypeStatus(GeneratedMessageV3.ExtendableBuilder<DataTypeStatus, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DataTypeStatus getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_DataTypeStatus_descriptor;
        }

        public static Builder newBuilder(DataTypeStatus dataTypeStatus) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(dataTypeStatus);
        }

        public static DataTypeStatus parseDelimitedFrom(InputStream inputStream) {
            return (DataTypeStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static DataTypeStatus parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<DataTypeStatus> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof DataTypeStatus)) {
                return super.equals(obj);
            }
            DataTypeStatus dataTypeStatus = (DataTypeStatus) obj;
            return getUnknownFields().equals(dataTypeStatus.getUnknownFields()) && getExtensionFields().equals(dataTypeStatus.getExtensionFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<DataTypeStatus> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize();
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getUnknownFields().hashCode() + (AbstractMessage.hashFields(getDescriptor().hashCode() + 779, getExtensionFields()) * 29);
            this.memoizedHashCode = iHashCode;
            return iHashCode;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_DataTypeStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(DataTypeStatus.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            if (extensionsAreInitialized()) {
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
            return new DataTypeStatus();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            newExtensionWriter().writeUntil(536870912, codedOutputStream);
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.ExtendableBuilder<DataTypeStatus, Builder> implements DataTypeStatusOrBuilder {
            public /* synthetic */ Builder(int i14) {
                this();
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_DataTypeStatus_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder addExtension(GeneratedMessage.GeneratedExtension<DataTypeStatus, List<Type>> generatedExtension, Type type) {
                return (Builder) super.addExtension((GeneratedMessage.GeneratedExtension<MessageT, List<Type>>) generatedExtension, type);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataTypeStatus build() {
                DataTypeStatus dataTypeStatusBuildPartial = buildPartial();
                if (dataTypeStatusBuildPartial.isInitialized()) {
                    return dataTypeStatusBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) dataTypeStatusBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public DataTypeStatus buildPartial() {
                DataTypeStatus dataTypeStatus = new DataTypeStatus(this);
                onBuilt();
                return dataTypeStatus;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <T> Builder clearExtension(GeneratedMessage.GeneratedExtension<DataTypeStatus, T> generatedExtension) {
                return (Builder) super.clearExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
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
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_DataTypeStatus_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_DataTypeStatus_fieldAccessorTable.ensureFieldAccessorsInitialized(DataTypeStatus.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return extensionsAreInitialized();
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

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder setExtension(GeneratedMessage.GeneratedExtension<DataTypeStatus, Type> generatedExtension, Type type) {
                return (Builder) super.setExtension((GeneratedMessage.GeneratedExtension<MessageT, Type>) generatedExtension, type);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
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
            public DataTypeStatus getDefaultInstanceForType() {
                return DataTypeStatus.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder addExtension(GeneratedMessage.GeneratedExtension generatedExtension, Object obj) {
                return addExtension((GeneratedMessage.GeneratedExtension<DataTypeStatus, List<Object>>) generatedExtension, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedExtension, Object obj) {
                return setExtension((GeneratedMessage.GeneratedExtension<DataTypeStatus, Object>) generatedExtension, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedExtension, int i14, Object obj) {
                return setExtension((GeneratedMessage.GeneratedExtension<DataTypeStatus, List<Object>>) generatedExtension, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder setExtension(GeneratedMessage.GeneratedExtension<DataTypeStatus, List<Type>> generatedExtension, int i14, Type type) {
                return (Builder) super.setExtension((GeneratedMessage.GeneratedExtension<MessageT, List<Type>>) generatedExtension, i14, type);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof DataTypeStatus) {
                    return mergeFrom((DataTypeStatus) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(DataTypeStatus dataTypeStatus) {
                if (dataTypeStatus == DataTypeStatus.getDefaultInstance()) {
                    return this;
                }
                mergeExtensionFields(dataTypeStatus);
                mergeUnknownFields(dataTypeStatus.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public DataTypeStatus getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ DataTypeStatus(Builder builder) {
            this((GeneratedMessageV3.ExtendableBuilder<DataTypeStatus, ?>) builder);
        }

        private DataTypeStatus() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static DataTypeStatus parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataTypeStatus) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataTypeStatus parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static DataTypeStatus parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static DataTypeStatus parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static DataTypeStatus parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static DataTypeStatus parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static DataTypeStatus parseFrom(InputStream inputStream) {
            return (DataTypeStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static DataTypeStatus parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataTypeStatus) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static DataTypeStatus parseFrom(CodedInputStream codedInputStream) {
            return (DataTypeStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static DataTypeStatus parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (DataTypeStatus) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GenericItem extends GeneratedMessageV3.ExtendableMessage<GenericItem> implements GenericItemOrBuilder {
        public static final int DATA_TRANSFER_ID_FIELD_NUMBER = 1;
        public static final int DATA_TRANSFER_SIZE_FIELD_NUMBER = 2;
        private static final GenericItem DEFAULT_INSTANCE = new GenericItem();

        @Deprecated
        public static final Parser<GenericItem> PARSER = new AbstractParser<GenericItem>() { // from class: com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItem.1
            @Override // com.google.protobuf.Parser
            public GenericItem parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GenericItem.newBuilder();
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
        private int dataTransferId_;
        private int dataTransferSize_;
        private byte memoizedIsInitialized;

        private GenericItem(GeneratedMessageV3.ExtendableBuilder<GenericItem, ?> extendableBuilder) {
            super(extendableBuilder);
            this.dataTransferId_ = 0;
            this.dataTransferSize_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GenericItem getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_GenericItem_descriptor;
        }

        public static Builder newBuilder(GenericItem genericItem) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(genericItem);
        }

        public static GenericItem parseDelimitedFrom(InputStream inputStream) {
            return (GenericItem) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GenericItem parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GenericItem> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GenericItem)) {
                return super.equals(obj);
            }
            GenericItem genericItem = (GenericItem) obj;
            if (hasDataTransferId() != genericItem.hasDataTransferId()) {
                return false;
            }
            if ((!hasDataTransferId() || getDataTransferId() == genericItem.getDataTransferId()) && hasDataTransferSize() == genericItem.hasDataTransferSize()) {
                return (!hasDataTransferSize() || getDataTransferSize() == genericItem.getDataTransferSize()) && getUnknownFields().equals(genericItem.getUnknownFields()) && getExtensionFields().equals(genericItem.getExtensionFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemOrBuilder
        public int getDataTransferId() {
            return this.dataTransferId_;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemOrBuilder
        public int getDataTransferSize() {
            return this.dataTransferSize_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GenericItem> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.dataTransferId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(2, this.dataTransferSize_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemOrBuilder
        public boolean hasDataTransferId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemOrBuilder
        public boolean hasDataTransferSize() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasDataTransferId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getDataTransferId();
            }
            if (hasDataTransferSize()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getDataTransferSize();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (AbstractMessage.hashFields(iHashCode, getExtensionFields()) * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_GenericItem_fieldAccessorTable.ensureFieldAccessorsInitialized(GenericItem.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            if (extensionsAreInitialized()) {
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
            return new GenericItem();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            GeneratedMessageV3.ExtendableMessage<MessageT>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.dataTransferId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.dataTransferSize_);
            }
            extensionWriterNewExtensionWriter.writeUntil(536870912, codedOutputStream);
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.ExtendableBuilder<GenericItem, Builder> implements GenericItemOrBuilder {
            private int bitField0_;
            private int dataTransferId_;
            private int dataTransferSize_;

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private void buildPartial0(GenericItem genericItem) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    genericItem.dataTransferId_ = this.dataTransferId_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    genericItem.dataTransferSize_ = this.dataTransferSize_;
                    i14 |= 2;
                }
                genericItem.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_GenericItem_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder addExtension(GeneratedMessage.GeneratedExtension<GenericItem, List<Type>> generatedExtension, Type type) {
                return (Builder) super.addExtension((GeneratedMessage.GeneratedExtension<MessageT, List<Type>>) generatedExtension, type);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GenericItem build() {
                GenericItem genericItemBuildPartial = buildPartial();
                if (genericItemBuildPartial.isInitialized()) {
                    return genericItemBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) genericItemBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GenericItem buildPartial() {
                GenericItem genericItem = new GenericItem(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(genericItem);
                }
                onBuilt();
                return genericItem;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.dataTransferId_ = 0;
                this.dataTransferSize_ = 0;
                return this;
            }

            public Builder clearDataTransferId() {
                this.bitField0_ &= -2;
                this.dataTransferId_ = 0;
                onChanged();
                return this;
            }

            public Builder clearDataTransferSize() {
                this.bitField0_ &= -3;
                this.dataTransferSize_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <T> Builder clearExtension(GeneratedMessage.GeneratedExtension<GenericItem, T> generatedExtension) {
                return (Builder) super.clearExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
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

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemOrBuilder
            public int getDataTransferId() {
                return this.dataTransferId_;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemOrBuilder
            public int getDataTransferSize() {
                return this.dataTransferSize_;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_GenericItem_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemOrBuilder
            public boolean hasDataTransferId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemOrBuilder
            public boolean hasDataTransferSize() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_GenericItem_fieldAccessorTable.ensureFieldAccessorsInitialized(GenericItem.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return extensionsAreInitialized();
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
                                    this.dataTransferId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.dataTransferSize_ = codedInputStream.readUInt32();
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

            public Builder setDataTransferId(int i14) {
                this.dataTransferId_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setDataTransferSize(int i14) {
                this.dataTransferSize_ = i14;
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder setExtension(GeneratedMessage.GeneratedExtension<GenericItem, Type> generatedExtension, Type type) {
                return (Builder) super.setExtension((GeneratedMessage.GeneratedExtension<MessageT, Type>) generatedExtension, type);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
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
            public GenericItem getDefaultInstanceForType() {
                return GenericItem.getDefaultInstance();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder addExtension(GeneratedMessage.GeneratedExtension generatedExtension, Object obj) {
                return addExtension((GeneratedMessage.GeneratedExtension<GenericItem, List<Object>>) generatedExtension, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedExtension, Object obj) {
                return setExtension((GeneratedMessage.GeneratedExtension<GenericItem, Object>) generatedExtension, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedExtension, int i14, Object obj) {
                return setExtension((GeneratedMessage.GeneratedExtension<GenericItem, List<Object>>) generatedExtension, i14, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder setExtension(GeneratedMessage.GeneratedExtension<GenericItem, List<Type>> generatedExtension, int i14, Type type) {
                return (Builder) super.setExtension((GeneratedMessage.GeneratedExtension<MessageT, List<Type>>) generatedExtension, i14, type);
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GenericItem) {
                    return mergeFrom((GenericItem) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GenericItem genericItem) {
                if (genericItem == GenericItem.getDefaultInstance()) {
                    return this;
                }
                if (genericItem.hasDataTransferId()) {
                    setDataTransferId(genericItem.getDataTransferId());
                }
                if (genericItem.hasDataTransferSize()) {
                    setDataTransferSize(genericItem.getDataTransferSize());
                }
                mergeExtensionFields(genericItem);
                mergeUnknownFields(genericItem.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GenericItem getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static GenericItem parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GenericItem) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GenericItem parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GenericItem parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GenericItem parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public /* synthetic */ GenericItem(Builder builder) {
            this((GeneratedMessageV3.ExtendableBuilder<GenericItem, ?>) builder);
        }

        public static GenericItem parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        private GenericItem() {
            this.dataTransferId_ = 0;
            this.dataTransferSize_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GenericItem parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GenericItem parseFrom(InputStream inputStream) {
            return (GenericItem) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GenericItem parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GenericItem) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GenericItem parseFrom(CodedInputStream codedInputStream) {
            return (GenericItem) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GenericItem parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GenericItem) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ArbitraryItemRequest extends GeneratedMessageV3 implements ArbitraryItemRequestOrBuilder {
        public static final int CONFIG_FIELD_NUMBER = 1;
        public static final int ITEM_REQUEST_COUNT_FIELD_NUMBER = 2;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DataTypeConfig config_;
        private int itemRequestCount_;
        private byte memoizedIsInitialized;
        private static final ArbitraryItemRequest DEFAULT_INSTANCE = new ArbitraryItemRequest();

        @Deprecated
        public static final Parser<ArbitraryItemRequest> PARSER = new AbstractParser<ArbitraryItemRequest>() { // from class: com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemRequest.1
            @Override // com.google.protobuf.Parser
            public ArbitraryItemRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ArbitraryItemRequest.newBuilder();
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

        private ArbitraryItemRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.itemRequestCount_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ArbitraryItemRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ArbitraryItemRequest_descriptor;
        }

        public static Builder newBuilder(ArbitraryItemRequest arbitraryItemRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(arbitraryItemRequest);
        }

        public static ArbitraryItemRequest parseDelimitedFrom(InputStream inputStream) {
            return (ArbitraryItemRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ArbitraryItemRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ArbitraryItemRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ArbitraryItemRequest)) {
                return super.equals(obj);
            }
            ArbitraryItemRequest arbitraryItemRequest = (ArbitraryItemRequest) obj;
            if (hasConfig() != arbitraryItemRequest.hasConfig()) {
                return false;
            }
            if ((!hasConfig() || getConfig().equals(arbitraryItemRequest.getConfig())) && hasItemRequestCount() == arbitraryItemRequest.hasItemRequestCount()) {
                return (!hasItemRequestCount() || getItemRequestCount() == arbitraryItemRequest.getItemRequestCount()) && getUnknownFields().equals(arbitraryItemRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemRequestOrBuilder
        public DataTypeConfig getConfig() {
            DataTypeConfig dataTypeConfig = this.config_;
            return dataTypeConfig == null ? DataTypeConfig.getDefaultInstance() : dataTypeConfig;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemRequestOrBuilder
        public DataTypeConfigOrBuilder getConfigOrBuilder() {
            DataTypeConfig dataTypeConfig = this.config_;
            return dataTypeConfig == null ? DataTypeConfig.getDefaultInstance() : dataTypeConfig;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemRequestOrBuilder
        public int getItemRequestCount() {
            return this.itemRequestCount_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ArbitraryItemRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getConfig()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeUInt32Size(2, this.itemRequestCount_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemRequestOrBuilder
        public boolean hasConfig() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemRequestOrBuilder
        public boolean hasItemRequestCount() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasConfig()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getConfig().hashCode();
            }
            if (hasItemRequestCount()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getItemRequestCount();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ArbitraryItemRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ArbitraryItemRequest.class, Builder.class);
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
            if (!hasConfig() || getConfig().isInitialized()) {
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
            return new ArbitraryItemRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getConfig());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeUInt32(2, this.itemRequestCount_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ArbitraryItemRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<DataTypeConfig, DataTypeConfig.Builder, DataTypeConfigOrBuilder> configBuilder_;
            private DataTypeConfig config_;
            private int itemRequestCount_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ArbitraryItemRequest arbitraryItemRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<DataTypeConfig, DataTypeConfig.Builder, DataTypeConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                    arbitraryItemRequest.config_ = singleFieldBuilderV3 == null ? this.config_ : (DataTypeConfig) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    arbitraryItemRequest.itemRequestCount_ = this.itemRequestCount_;
                    i14 |= 2;
                }
                arbitraryItemRequest.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<DataTypeConfig, DataTypeConfig.Builder, DataTypeConfigOrBuilder> getConfigFieldBuilder() {
                if (this.configBuilder_ == null) {
                    this.configBuilder_ = new SingleFieldBuilderV3<>(getConfig(), getParentForChildren(), isClean());
                    this.config_ = null;
                }
                return this.configBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ArbitraryItemRequest_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getConfigFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ArbitraryItemRequest build() {
                ArbitraryItemRequest arbitraryItemRequestBuildPartial = buildPartial();
                if (arbitraryItemRequestBuildPartial.isInitialized()) {
                    return arbitraryItemRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) arbitraryItemRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ArbitraryItemRequest buildPartial() {
                ArbitraryItemRequest arbitraryItemRequest = new ArbitraryItemRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(arbitraryItemRequest);
                }
                onBuilt();
                return arbitraryItemRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.config_ = null;
                SingleFieldBuilderV3<DataTypeConfig, DataTypeConfig.Builder, DataTypeConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configBuilder_ = null;
                }
                this.itemRequestCount_ = 0;
                return this;
            }

            public Builder clearConfig() {
                this.bitField0_ &= -2;
                this.config_ = null;
                SingleFieldBuilderV3<DataTypeConfig, DataTypeConfig.Builder, DataTypeConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearItemRequestCount() {
                this.bitField0_ &= -3;
                this.itemRequestCount_ = 0;
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

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemRequestOrBuilder
            public DataTypeConfig getConfig() {
                SingleFieldBuilderV3<DataTypeConfig, DataTypeConfig.Builder, DataTypeConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypeConfig) singleFieldBuilderV3.getMessage();
                }
                DataTypeConfig dataTypeConfig = this.config_;
                return dataTypeConfig == null ? DataTypeConfig.getDefaultInstance() : dataTypeConfig;
            }

            public DataTypeConfig.Builder getConfigBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (DataTypeConfig.Builder) getConfigFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemRequestOrBuilder
            public DataTypeConfigOrBuilder getConfigOrBuilder() {
                SingleFieldBuilderV3<DataTypeConfig, DataTypeConfig.Builder, DataTypeConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypeConfigOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DataTypeConfig dataTypeConfig = this.config_;
                return dataTypeConfig == null ? DataTypeConfig.getDefaultInstance() : dataTypeConfig;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ArbitraryItemRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemRequestOrBuilder
            public int getItemRequestCount() {
                return this.itemRequestCount_;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemRequestOrBuilder
            public boolean hasConfig() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemRequestOrBuilder
            public boolean hasItemRequestCount() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ArbitraryItemRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ArbitraryItemRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasConfig() || getConfig().isInitialized();
            }

            public Builder mergeConfig(DataTypeConfig dataTypeConfig) {
                DataTypeConfig dataTypeConfig2;
                SingleFieldBuilderV3<DataTypeConfig, DataTypeConfig.Builder, DataTypeConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dataTypeConfig);
                } else if ((this.bitField0_ & 1) == 0 || (dataTypeConfig2 = this.config_) == null || dataTypeConfig2 == DataTypeConfig.getDefaultInstance()) {
                    this.config_ = dataTypeConfig;
                } else {
                    getConfigBuilder().mergeFrom(dataTypeConfig);
                }
                if (this.config_ != null) {
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
                                    codedInputStream.readMessage(getConfigFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    this.itemRequestCount_ = codedInputStream.readUInt32();
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

            public Builder setConfig(DataTypeConfig.Builder builder) {
                SingleFieldBuilderV3<DataTypeConfig, DataTypeConfig.Builder, DataTypeConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.config_ = builder.build();
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

            public Builder setItemRequestCount(int i14) {
                this.itemRequestCount_ = i14;
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
            public ArbitraryItemRequest getDefaultInstanceForType() {
                return ArbitraryItemRequest.getDefaultInstance();
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

            public Builder setConfig(DataTypeConfig dataTypeConfig) {
                SingleFieldBuilderV3<DataTypeConfig, DataTypeConfig.Builder, DataTypeConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dataTypeConfig.getClass();
                    this.config_ = dataTypeConfig;
                } else {
                    singleFieldBuilderV3.setMessage(dataTypeConfig);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ArbitraryItemRequest) {
                    return mergeFrom((ArbitraryItemRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ArbitraryItemRequest arbitraryItemRequest) {
                if (arbitraryItemRequest == ArbitraryItemRequest.getDefaultInstance()) {
                    return this;
                }
                if (arbitraryItemRequest.hasConfig()) {
                    mergeConfig(arbitraryItemRequest.getConfig());
                }
                if (arbitraryItemRequest.hasItemRequestCount()) {
                    setItemRequestCount(arbitraryItemRequest.getItemRequestCount());
                }
                mergeUnknownFields(arbitraryItemRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ArbitraryItemRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ArbitraryItemRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ArbitraryItemRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ArbitraryItemRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ ArbitraryItemRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ArbitraryItemRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private ArbitraryItemRequest() {
            this.itemRequestCount_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ArbitraryItemRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ArbitraryItemRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ArbitraryItemRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ArbitraryItemRequest parseFrom(InputStream inputStream) {
            return (ArbitraryItemRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ArbitraryItemRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ArbitraryItemRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ArbitraryItemRequest parseFrom(CodedInputStream codedInputStream) {
            return (ArbitraryItemRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ArbitraryItemRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ArbitraryItemRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ArbitraryItemResponse extends GeneratedMessageV3 implements ArbitraryItemResponseOrBuilder {
        public static final int DATA_TYPE_STATUS_FIELD_NUMBER = 2;
        public static final int MAX_REQUEST_COUNT_FIELD_NUMBER = 4;
        public static final int SESSION_ID_FIELD_NUMBER = 3;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DataTypeStatus dataTypeStatus_;
        private int maxRequestCount_;
        private byte memoizedIsInitialized;
        private int sessionId_;
        private int status_;
        private static final ArbitraryItemResponse DEFAULT_INSTANCE = new ArbitraryItemResponse();

        @Deprecated
        public static final Parser<ArbitraryItemResponse> PARSER = new AbstractParser<ArbitraryItemResponse>() { // from class: com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemResponse.1
            @Override // com.google.protobuf.Parser
            public ArbitraryItemResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ArbitraryItemResponse.newBuilder();
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

        private ArbitraryItemResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 1;
            this.sessionId_ = 0;
            this.maxRequestCount_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ArbitraryItemResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ArbitraryItemResponse_descriptor;
        }

        public static Builder newBuilder(ArbitraryItemResponse arbitraryItemResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(arbitraryItemResponse);
        }

        public static ArbitraryItemResponse parseDelimitedFrom(InputStream inputStream) {
            return (ArbitraryItemResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ArbitraryItemResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ArbitraryItemResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ArbitraryItemResponse)) {
                return super.equals(obj);
            }
            ArbitraryItemResponse arbitraryItemResponse = (ArbitraryItemResponse) obj;
            if (hasStatus() != arbitraryItemResponse.hasStatus()) {
                return false;
            }
            if ((hasStatus() && this.status_ != arbitraryItemResponse.status_) || hasDataTypeStatus() != arbitraryItemResponse.hasDataTypeStatus()) {
                return false;
            }
            if ((hasDataTypeStatus() && !getDataTypeStatus().equals(arbitraryItemResponse.getDataTypeStatus())) || hasSessionId() != arbitraryItemResponse.hasSessionId()) {
                return false;
            }
            if ((!hasSessionId() || getSessionId() == arbitraryItemResponse.getSessionId()) && hasMaxRequestCount() == arbitraryItemResponse.hasMaxRequestCount()) {
                return (!hasMaxRequestCount() || getMaxRequestCount() == arbitraryItemResponse.getMaxRequestCount()) && getUnknownFields().equals(arbitraryItemResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemResponseOrBuilder
        public DataTypeStatus getDataTypeStatus() {
            DataTypeStatus dataTypeStatus = this.dataTypeStatus_;
            return dataTypeStatus == null ? DataTypeStatus.getDefaultInstance() : dataTypeStatus;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemResponseOrBuilder
        public DataTypeStatusOrBuilder getDataTypeStatusOrBuilder() {
            DataTypeStatus dataTypeStatus = this.dataTypeStatus_;
            return dataTypeStatus == null ? DataTypeStatus.getDefaultInstance() : dataTypeStatus;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemResponseOrBuilder
        public int getMaxRequestCount() {
            return this.maxRequestCount_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ArbitraryItemResponse> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getDataTypeStatus());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(3, this.sessionId_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(4, this.maxRequestCount_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemResponseOrBuilder
        public int getSessionId() {
            return this.sessionId_;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.SUCCESS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemResponseOrBuilder
        public boolean hasDataTypeStatus() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemResponseOrBuilder
        public boolean hasMaxRequestCount() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemResponseOrBuilder
        public boolean hasSessionId() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemResponseOrBuilder
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
            if (hasDataTypeStatus()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getDataTypeStatus().hashCode();
            }
            if (hasSessionId()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getSessionId();
            }
            if (hasMaxRequestCount()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getMaxRequestCount();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ArbitraryItemResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ArbitraryItemResponse.class, Builder.class);
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
            if (!hasDataTypeStatus() || getDataTypeStatus().isInitialized()) {
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
            return new ArbitraryItemResponse();
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
                codedOutputStream.writeMessage(2, getDataTypeStatus());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.sessionId_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.maxRequestCount_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ArbitraryItemResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> dataTypeStatusBuilder_;
            private DataTypeStatus dataTypeStatus_;
            private int maxRequestCount_;
            private int sessionId_;
            private int status_;

            private Builder() {
                this.status_ = 1;
                this.maxRequestCount_ = 1;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ArbitraryItemResponse arbitraryItemResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    arbitraryItemResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                    arbitraryItemResponse.dataTypeStatus_ = singleFieldBuilderV3 == null ? this.dataTypeStatus_ : (DataTypeStatus) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    arbitraryItemResponse.sessionId_ = this.sessionId_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    arbitraryItemResponse.maxRequestCount_ = this.maxRequestCount_;
                    i14 |= 8;
                }
                arbitraryItemResponse.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> getDataTypeStatusFieldBuilder() {
                if (this.dataTypeStatusBuilder_ == null) {
                    this.dataTypeStatusBuilder_ = new SingleFieldBuilderV3<>(getDataTypeStatus(), getParentForChildren(), isClean());
                    this.dataTypeStatus_ = null;
                }
                return this.dataTypeStatusBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ArbitraryItemResponse_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getDataTypeStatusFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ArbitraryItemResponse build() {
                ArbitraryItemResponse arbitraryItemResponseBuildPartial = buildPartial();
                if (arbitraryItemResponseBuildPartial.isInitialized()) {
                    return arbitraryItemResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) arbitraryItemResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ArbitraryItemResponse buildPartial() {
                ArbitraryItemResponse arbitraryItemResponse = new ArbitraryItemResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(arbitraryItemResponse);
                }
                onBuilt();
                return arbitraryItemResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 1;
                this.dataTypeStatus_ = null;
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.dataTypeStatusBuilder_ = null;
                }
                this.sessionId_ = 0;
                this.maxRequestCount_ = 1;
                return this;
            }

            public Builder clearDataTypeStatus() {
                this.bitField0_ &= -3;
                this.dataTypeStatus_ = null;
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.dataTypeStatusBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearMaxRequestCount() {
                this.bitField0_ &= -9;
                this.maxRequestCount_ = 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSessionId() {
                this.bitField0_ &= -5;
                this.sessionId_ = 0;
                onChanged();
                return this;
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

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemResponseOrBuilder
            public DataTypeStatus getDataTypeStatus() {
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypeStatus) singleFieldBuilderV3.getMessage();
                }
                DataTypeStatus dataTypeStatus = this.dataTypeStatus_;
                return dataTypeStatus == null ? DataTypeStatus.getDefaultInstance() : dataTypeStatus;
            }

            public DataTypeStatus.Builder getDataTypeStatusBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (DataTypeStatus.Builder) getDataTypeStatusFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemResponseOrBuilder
            public DataTypeStatusOrBuilder getDataTypeStatusOrBuilder() {
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypeStatusOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DataTypeStatus dataTypeStatus = this.dataTypeStatus_;
                return dataTypeStatus == null ? DataTypeStatus.getDefaultInstance() : dataTypeStatus;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ArbitraryItemResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemResponseOrBuilder
            public int getMaxRequestCount() {
                return this.maxRequestCount_;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemResponseOrBuilder
            public int getSessionId() {
                return this.sessionId_;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.SUCCESS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemResponseOrBuilder
            public boolean hasDataTypeStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemResponseOrBuilder
            public boolean hasMaxRequestCount() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemResponseOrBuilder
            public boolean hasSessionId() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ArbitraryItemResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ArbitraryItemResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasStatus()) {
                    return !hasDataTypeStatus() || getDataTypeStatus().isInitialized();
                }
                return false;
            }

            public Builder mergeDataTypeStatus(DataTypeStatus dataTypeStatus) {
                DataTypeStatus dataTypeStatus2;
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dataTypeStatus);
                } else if ((this.bitField0_ & 2) == 0 || (dataTypeStatus2 = this.dataTypeStatus_) == null || dataTypeStatus2 == DataTypeStatus.getDefaultInstance()) {
                    this.dataTypeStatus_ = dataTypeStatus;
                } else {
                    getDataTypeStatusBuilder().mergeFrom(dataTypeStatus);
                }
                if (this.dataTypeStatus_ != null) {
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
                                if (tag == 8) {
                                    int i14 = codedInputStream.readEnum();
                                    if (Status.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getDataTypeStatusFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.sessionId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.maxRequestCount_ = codedInputStream.readUInt32();
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

            public Builder setDataTypeStatus(DataTypeStatus.Builder builder) {
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.dataTypeStatus_ = builder.build();
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

            public Builder setMaxRequestCount(int i14) {
                this.maxRequestCount_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSessionId(int i14) {
                this.sessionId_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
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
            public ArbitraryItemResponse getDefaultInstanceForType() {
                return ArbitraryItemResponse.getDefaultInstance();
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
                this.maxRequestCount_ = 1;
                maybeForceBuilderInitialization();
            }

            public Builder setDataTypeStatus(DataTypeStatus dataTypeStatus) {
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dataTypeStatus.getClass();
                    this.dataTypeStatus_ = dataTypeStatus;
                } else {
                    singleFieldBuilderV3.setMessage(dataTypeStatus);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ArbitraryItemResponse) {
                    return mergeFrom((ArbitraryItemResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ArbitraryItemResponse arbitraryItemResponse) {
                if (arbitraryItemResponse == ArbitraryItemResponse.getDefaultInstance()) {
                    return this;
                }
                if (arbitraryItemResponse.hasStatus()) {
                    setStatus(arbitraryItemResponse.getStatus());
                }
                if (arbitraryItemResponse.hasDataTypeStatus()) {
                    mergeDataTypeStatus(arbitraryItemResponse.getDataTypeStatus());
                }
                if (arbitraryItemResponse.hasSessionId()) {
                    setSessionId(arbitraryItemResponse.getSessionId());
                }
                if (arbitraryItemResponse.hasMaxRequestCount()) {
                    setMaxRequestCount(arbitraryItemResponse.getMaxRequestCount());
                }
                mergeUnknownFields(arbitraryItemResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ArbitraryItemResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ArbitraryItemResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ArbitraryItemResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ArbitraryItemResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ArbitraryItemResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ArbitraryItemResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ArbitraryItemResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ArbitraryItemResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ArbitraryItemResponse parseFrom(InputStream inputStream) {
            return (ArbitraryItemResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public /* synthetic */ ArbitraryItemResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private ArbitraryItemResponse() {
            this.sessionId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 1;
            this.maxRequestCount_ = 1;
        }

        public static ArbitraryItemResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ArbitraryItemResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ArbitraryItemResponse parseFrom(CodedInputStream codedInputStream) {
            return (ArbitraryItemResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ArbitraryItemResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ArbitraryItemResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            SUCCESS(1),
            ABORT(2),
            ERROR(3),
            UNSUPPORTED_DATA_TYPE(4),
            UNSUPPORTED_REQUEST_TYPE(5),
            DATA_TYPE_IS_BUSY(6),
            SYSTEM_IS_BUSY(7),
            TRANSFER_LIMIT(8);

            public static final int ABORT_VALUE = 2;
            public static final int DATA_TYPE_IS_BUSY_VALUE = 6;
            public static final int ERROR_VALUE = 3;
            public static final int SUCCESS_VALUE = 1;
            public static final int SYSTEM_IS_BUSY_VALUE = 7;
            public static final int TRANSFER_LIMIT_VALUE = 8;
            public static final int UNSUPPORTED_DATA_TYPE_VALUE = 4;
            public static final int UNSUPPORTED_REQUEST_TYPE_VALUE = 5;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIGenericItemTransferProto.ArbitraryItemResponse.Status.1
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
                switch (i14) {
                    case 1:
                        return SUCCESS;
                    case 2:
                        return ABORT;
                    case 3:
                        return ERROR;
                    case 4:
                        return UNSUPPORTED_DATA_TYPE;
                    case 5:
                        return UNSUPPORTED_REQUEST_TYPE;
                    case 6:
                        return DATA_TYPE_IS_BUSY;
                    case 7:
                        return SYSTEM_IS_BUSY;
                    case 8:
                        return TRANSFER_LIMIT;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ArbitraryItemResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class CancelSessionRequest extends GeneratedMessageV3 implements CancelSessionRequestOrBuilder {
        public static final int DATA_TYPE_STATUS_FIELD_NUMBER = 3;
        private static final CancelSessionRequest DEFAULT_INSTANCE = new CancelSessionRequest();

        @Deprecated
        public static final Parser<CancelSessionRequest> PARSER = new AbstractParser<CancelSessionRequest>() { // from class: com.garmin.proto.generated.GDIGenericItemTransferProto.CancelSessionRequest.1
            @Override // com.google.protobuf.Parser
            public CancelSessionRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CancelSessionRequest.newBuilder();
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
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DataTypeStatus dataTypeStatus_;
        private byte memoizedIsInitialized;
        private int reason_;
        private int sessionId_;

        private CancelSessionRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sessionId_ = 0;
            this.reason_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CancelSessionRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_CancelSessionRequest_descriptor;
        }

        public static Builder newBuilder(CancelSessionRequest cancelSessionRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cancelSessionRequest);
        }

        public static CancelSessionRequest parseDelimitedFrom(InputStream inputStream) {
            return (CancelSessionRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CancelSessionRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CancelSessionRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CancelSessionRequest)) {
                return super.equals(obj);
            }
            CancelSessionRequest cancelSessionRequest = (CancelSessionRequest) obj;
            if (hasSessionId() != cancelSessionRequest.hasSessionId()) {
                return false;
            }
            if ((hasSessionId() && getSessionId() != cancelSessionRequest.getSessionId()) || hasReason() != cancelSessionRequest.hasReason()) {
                return false;
            }
            if ((!hasReason() || this.reason_ == cancelSessionRequest.reason_) && hasDataTypeStatus() == cancelSessionRequest.hasDataTypeStatus()) {
                return (!hasDataTypeStatus() || getDataTypeStatus().equals(cancelSessionRequest.getDataTypeStatus())) && getUnknownFields().equals(cancelSessionRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.CancelSessionRequestOrBuilder
        public DataTypeStatus getDataTypeStatus() {
            DataTypeStatus dataTypeStatus = this.dataTypeStatus_;
            return dataTypeStatus == null ? DataTypeStatus.getDefaultInstance() : dataTypeStatus;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.CancelSessionRequestOrBuilder
        public DataTypeStatusOrBuilder getDataTypeStatusOrBuilder() {
            DataTypeStatus dataTypeStatus = this.dataTypeStatus_;
            return dataTypeStatus == null ? DataTypeStatus.getDefaultInstance() : dataTypeStatus;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CancelSessionRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.CancelSessionRequestOrBuilder
        public SessionEndReason getReason() {
            SessionEndReason sessionEndReasonForNumber = SessionEndReason.forNumber(this.reason_);
            return sessionEndReasonForNumber == null ? SessionEndReason.COMPLETE : sessionEndReasonForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.sessionId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(2, this.reason_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(3, getDataTypeStatus());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.CancelSessionRequestOrBuilder
        public int getSessionId() {
            return this.sessionId_;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.CancelSessionRequestOrBuilder
        public boolean hasDataTypeStatus() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.CancelSessionRequestOrBuilder
        public boolean hasReason() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.CancelSessionRequestOrBuilder
        public boolean hasSessionId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSessionId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSessionId();
            }
            if (hasReason()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.reason_;
            }
            if (hasDataTypeStatus()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getDataTypeStatus().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_CancelSessionRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CancelSessionRequest.class, Builder.class);
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
            if (!hasSessionId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasDataTypeStatus() || getDataTypeStatus().isInitialized()) {
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
            return new CancelSessionRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.sessionId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.reason_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getDataTypeStatus());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CancelSessionRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> dataTypeStatusBuilder_;
            private DataTypeStatus dataTypeStatus_;
            private int reason_;
            private int sessionId_;

            private Builder() {
                this.reason_ = 1;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(CancelSessionRequest cancelSessionRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    cancelSessionRequest.sessionId_ = this.sessionId_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    cancelSessionRequest.reason_ = this.reason_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                    cancelSessionRequest.dataTypeStatus_ = singleFieldBuilderV3 == null ? this.dataTypeStatus_ : (DataTypeStatus) singleFieldBuilderV3.build();
                    i14 |= 4;
                }
                cancelSessionRequest.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> getDataTypeStatusFieldBuilder() {
                if (this.dataTypeStatusBuilder_ == null) {
                    this.dataTypeStatusBuilder_ = new SingleFieldBuilderV3<>(getDataTypeStatus(), getParentForChildren(), isClean());
                    this.dataTypeStatus_ = null;
                }
                return this.dataTypeStatusBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_CancelSessionRequest_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getDataTypeStatusFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CancelSessionRequest build() {
                CancelSessionRequest cancelSessionRequestBuildPartial = buildPartial();
                if (cancelSessionRequestBuildPartial.isInitialized()) {
                    return cancelSessionRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) cancelSessionRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CancelSessionRequest buildPartial() {
                CancelSessionRequest cancelSessionRequest = new CancelSessionRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(cancelSessionRequest);
                }
                onBuilt();
                return cancelSessionRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sessionId_ = 0;
                this.reason_ = 1;
                this.dataTypeStatus_ = null;
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.dataTypeStatusBuilder_ = null;
                }
                return this;
            }

            public Builder clearDataTypeStatus() {
                this.bitField0_ &= -5;
                this.dataTypeStatus_ = null;
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.dataTypeStatusBuilder_ = null;
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

            public Builder clearReason() {
                this.bitField0_ &= -3;
                this.reason_ = 1;
                onChanged();
                return this;
            }

            public Builder clearSessionId() {
                this.bitField0_ &= -2;
                this.sessionId_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.CancelSessionRequestOrBuilder
            public DataTypeStatus getDataTypeStatus() {
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypeStatus) singleFieldBuilderV3.getMessage();
                }
                DataTypeStatus dataTypeStatus = this.dataTypeStatus_;
                return dataTypeStatus == null ? DataTypeStatus.getDefaultInstance() : dataTypeStatus;
            }

            public DataTypeStatus.Builder getDataTypeStatusBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (DataTypeStatus.Builder) getDataTypeStatusFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.CancelSessionRequestOrBuilder
            public DataTypeStatusOrBuilder getDataTypeStatusOrBuilder() {
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypeStatusOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DataTypeStatus dataTypeStatus = this.dataTypeStatus_;
                return dataTypeStatus == null ? DataTypeStatus.getDefaultInstance() : dataTypeStatus;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_CancelSessionRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.CancelSessionRequestOrBuilder
            public SessionEndReason getReason() {
                SessionEndReason sessionEndReasonForNumber = SessionEndReason.forNumber(this.reason_);
                return sessionEndReasonForNumber == null ? SessionEndReason.COMPLETE : sessionEndReasonForNumber;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.CancelSessionRequestOrBuilder
            public int getSessionId() {
                return this.sessionId_;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.CancelSessionRequestOrBuilder
            public boolean hasDataTypeStatus() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.CancelSessionRequestOrBuilder
            public boolean hasReason() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.CancelSessionRequestOrBuilder
            public boolean hasSessionId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_CancelSessionRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(CancelSessionRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasSessionId()) {
                    return !hasDataTypeStatus() || getDataTypeStatus().isInitialized();
                }
                return false;
            }

            public Builder mergeDataTypeStatus(DataTypeStatus dataTypeStatus) {
                DataTypeStatus dataTypeStatus2;
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dataTypeStatus);
                } else if ((this.bitField0_ & 4) == 0 || (dataTypeStatus2 = this.dataTypeStatus_) == null || dataTypeStatus2 == DataTypeStatus.getDefaultInstance()) {
                    this.dataTypeStatus_ = dataTypeStatus;
                } else {
                    getDataTypeStatusBuilder().mergeFrom(dataTypeStatus);
                }
                if (this.dataTypeStatus_ != null) {
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
                                    this.sessionId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (SessionEndReason.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.reason_ = i14;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getDataTypeStatusFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setDataTypeStatus(DataTypeStatus.Builder builder) {
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.dataTypeStatus_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setReason(SessionEndReason sessionEndReason) {
                sessionEndReason.getClass();
                this.bitField0_ |= 2;
                this.reason_ = sessionEndReason.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSessionId(int i14) {
                this.sessionId_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public CancelSessionRequest getDefaultInstanceForType() {
                return CancelSessionRequest.getDefaultInstance();
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

            public Builder setDataTypeStatus(DataTypeStatus dataTypeStatus) {
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dataTypeStatus.getClass();
                    this.dataTypeStatus_ = dataTypeStatus;
                } else {
                    singleFieldBuilderV3.setMessage(dataTypeStatus);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof CancelSessionRequest) {
                    return mergeFrom((CancelSessionRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CancelSessionRequest cancelSessionRequest) {
                if (cancelSessionRequest == CancelSessionRequest.getDefaultInstance()) {
                    return this;
                }
                if (cancelSessionRequest.hasSessionId()) {
                    setSessionId(cancelSessionRequest.getSessionId());
                }
                if (cancelSessionRequest.hasReason()) {
                    setReason(cancelSessionRequest.getReason());
                }
                if (cancelSessionRequest.hasDataTypeStatus()) {
                    mergeDataTypeStatus(cancelSessionRequest.getDataTypeStatus());
                }
                mergeUnknownFields(cancelSessionRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CancelSessionRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CancelSessionRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CancelSessionRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CancelSessionRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static CancelSessionRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CancelSessionRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CancelSessionRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ CancelSessionRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CancelSessionRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private CancelSessionRequest() {
            this.sessionId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.reason_ = 1;
        }

        public static CancelSessionRequest parseFrom(InputStream inputStream) {
            return (CancelSessionRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CancelSessionRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CancelSessionRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CancelSessionRequest parseFrom(CodedInputStream codedInputStream) {
            return (CancelSessionRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CancelSessionRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CancelSessionRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class CancelSessionResponse extends GeneratedMessageV3 implements CancelSessionResponseOrBuilder {
        private static final CancelSessionResponse DEFAULT_INSTANCE = new CancelSessionResponse();

        @Deprecated
        public static final Parser<CancelSessionResponse> PARSER = new AbstractParser<CancelSessionResponse>() { // from class: com.garmin.proto.generated.GDIGenericItemTransferProto.CancelSessionResponse.1
            @Override // com.google.protobuf.Parser
            public CancelSessionResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = CancelSessionResponse.newBuilder();
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

        private CancelSessionResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static CancelSessionResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_CancelSessionResponse_descriptor;
        }

        public static Builder newBuilder(CancelSessionResponse cancelSessionResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(cancelSessionResponse);
        }

        public static CancelSessionResponse parseDelimitedFrom(InputStream inputStream) {
            return (CancelSessionResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static CancelSessionResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<CancelSessionResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof CancelSessionResponse)) {
                return super.equals(obj);
            }
            CancelSessionResponse cancelSessionResponse = (CancelSessionResponse) obj;
            if (hasStatus() != cancelSessionResponse.hasStatus()) {
                return false;
            }
            return (!hasStatus() || this.status_ == cancelSessionResponse.status_) && getUnknownFields().equals(cancelSessionResponse.getUnknownFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<CancelSessionResponse> getParserForType() {
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

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.CancelSessionResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.SUCCESS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.CancelSessionResponseOrBuilder
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
            return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_CancelSessionResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CancelSessionResponse.class, Builder.class);
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
            return new CancelSessionResponse();
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

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements CancelSessionResponseOrBuilder {
            private int bitField0_;
            private int status_;

            private Builder() {
                this.status_ = 1;
            }

            private void buildPartial0(CancelSessionResponse cancelSessionResponse) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    cancelSessionResponse.status_ = this.status_;
                } else {
                    i14 = 0;
                }
                cancelSessionResponse.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_CancelSessionResponse_descriptor;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CancelSessionResponse build() {
                CancelSessionResponse cancelSessionResponseBuildPartial = buildPartial();
                if (cancelSessionResponseBuildPartial.isInitialized()) {
                    return cancelSessionResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) cancelSessionResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public CancelSessionResponse buildPartial() {
                CancelSessionResponse cancelSessionResponse = new CancelSessionResponse(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(cancelSessionResponse);
                }
                onBuilt();
                return cancelSessionResponse;
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
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_CancelSessionResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.CancelSessionResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.SUCCESS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.CancelSessionResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_CancelSessionResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(CancelSessionResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return hasStatus();
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
            public CancelSessionResponse getDefaultInstanceForType() {
                return CancelSessionResponse.getDefaultInstance();
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
                if (message instanceof CancelSessionResponse) {
                    return mergeFrom((CancelSessionResponse) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(CancelSessionResponse cancelSessionResponse) {
                if (cancelSessionResponse == CancelSessionResponse.getDefaultInstance()) {
                    return this;
                }
                if (cancelSessionResponse.hasStatus()) {
                    setStatus(cancelSessionResponse.getStatus());
                }
                mergeUnknownFields(cancelSessionResponse.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public CancelSessionResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static CancelSessionResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CancelSessionResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CancelSessionResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public /* synthetic */ CancelSessionResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static CancelSessionResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        private CancelSessionResponse() {
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 1;
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static CancelSessionResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static CancelSessionResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static CancelSessionResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static CancelSessionResponse parseFrom(InputStream inputStream) {
            return (CancelSessionResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static CancelSessionResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CancelSessionResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static CancelSessionResponse parseFrom(CodedInputStream codedInputStream) {
            return (CancelSessionResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static CancelSessionResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (CancelSessionResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        public enum Status implements ProtocolMessageEnum {
            SUCCESS(1),
            ERROR(2),
            INVALID_SESSION_ID(3);

            public static final int ERROR_VALUE = 2;
            public static final int INVALID_SESSION_ID_VALUE = 3;
            public static final int SUCCESS_VALUE = 1;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIGenericItemTransferProto.CancelSessionResponse.Status.1
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
                    return ERROR;
                }
                if (i14 != 3) {
                    return null;
                }
                return INVALID_SESSION_ID;
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return CancelSessionResponse.getDescriptor().getEnumTypes().get(0);
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

    public static final class GenericItemReference extends GeneratedMessageV3.ExtendableMessage<GenericItemReference> implements GenericItemReferenceOrBuilder {
        private static final GenericItemReference DEFAULT_INSTANCE = new GenericItemReference();

        @Deprecated
        public static final Parser<GenericItemReference> PARSER = new AbstractParser<GenericItemReference>() { // from class: com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemReference.1
            @Override // com.google.protobuf.Parser
            public GenericItemReference parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GenericItemReference.newBuilder();
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
        public static final int UUID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private byte memoizedIsInitialized;
        private GDIDataTypes.UUID uuid_;

        private GenericItemReference(GeneratedMessageV3.ExtendableBuilder<GenericItemReference, ?> extendableBuilder) {
            super(extendableBuilder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GenericItemReference getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_GenericItemReference_descriptor;
        }

        public static Builder newBuilder(GenericItemReference genericItemReference) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(genericItemReference);
        }

        public static GenericItemReference parseDelimitedFrom(InputStream inputStream) {
            return (GenericItemReference) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GenericItemReference parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GenericItemReference> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GenericItemReference)) {
                return super.equals(obj);
            }
            GenericItemReference genericItemReference = (GenericItemReference) obj;
            if (hasUuid() != genericItemReference.hasUuid()) {
                return false;
            }
            return (!hasUuid() || getUuid().equals(genericItemReference.getUuid())) && getUnknownFields().equals(genericItemReference.getUnknownFields()) && getExtensionFields().equals(genericItemReference.getExtensionFields());
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GenericItemReference> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int serializedSize = getUnknownFields().getSerializedSize() + extensionsSerializedSize() + ((this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getUuid()) : 0);
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemReferenceOrBuilder
        public GDIDataTypes.UUID getUuid() {
            GDIDataTypes.UUID uuid = this.uuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemReferenceOrBuilder
        public GDIDataTypes.UUIDOrBuilder getUuidOrBuilder() {
            GDIDataTypes.UUID uuid = this.uuid_;
            return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemReferenceOrBuilder
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
            int iHashCode2 = getUnknownFields().hashCode() + (AbstractMessage.hashFields(iHashCode, getExtensionFields()) * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_GenericItemReference_fieldAccessorTable.ensureFieldAccessorsInitialized(GenericItemReference.class, Builder.class);
        }

        @Override // com.google.protobuf.GeneratedMessageV3.ExtendableMessage, com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLiteOrBuilder
        public final boolean isInitialized() {
            byte b14 = this.memoizedIsInitialized;
            if (b14 == 1) {
                return true;
            }
            if (b14 == 0) {
                return false;
            }
            if (hasUuid() && !getUuid().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (extensionsAreInitialized()) {
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
            return new GenericItemReference();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            GeneratedMessageV3.ExtendableMessage<MessageT>.ExtensionWriter extensionWriterNewExtensionWriter = newExtensionWriter();
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getUuid());
            }
            extensionWriterNewExtensionWriter.writeUntil(536870912, codedOutputStream);
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.ExtendableBuilder<GenericItemReference, Builder> implements GenericItemReferenceOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> uuidBuilder_;
            private GDIDataTypes.UUID uuid_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(GenericItemReference genericItemReference) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                    genericItemReference.uuid_ = singleFieldBuilderV3 == null ? this.uuid_ : (GDIDataTypes.UUID) singleFieldBuilderV3.build();
                } else {
                    i14 = 0;
                }
                genericItemReference.bitField0_ |= i14;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_GenericItemReference_descriptor;
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

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder addExtension(GeneratedMessage.GeneratedExtension<GenericItemReference, List<Type>> generatedExtension, Type type) {
                return (Builder) super.addExtension((GeneratedMessage.GeneratedExtension<MessageT, List<Type>>) generatedExtension, type);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GenericItemReference build() {
                GenericItemReference genericItemReferenceBuildPartial = buildPartial();
                if (genericItemReferenceBuildPartial.isInitialized()) {
                    return genericItemReferenceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) genericItemReferenceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GenericItemReference buildPartial() {
                GenericItemReference genericItemReference = new GenericItemReference(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(genericItemReference);
                }
                onBuilt();
                return genericItemReference;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.uuid_ = null;
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.uuidBuilder_ = null;
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <T> Builder clearExtension(GeneratedMessage.GeneratedExtension<GenericItemReference, T> generatedExtension) {
                return (Builder) super.clearExtension((GeneratedMessage.GeneratedExtension) generatedExtension);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
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
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_GenericItemReference_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemReferenceOrBuilder
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

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemReferenceOrBuilder
            public GDIDataTypes.UUIDOrBuilder getUuidOrBuilder() {
                SingleFieldBuilderV3<GDIDataTypes.UUID, GDIDataTypes.UUID.Builder, GDIDataTypes.UUIDOrBuilder> singleFieldBuilderV3 = this.uuidBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (GDIDataTypes.UUIDOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                GDIDataTypes.UUID uuid = this.uuid_;
                return uuid == null ? GDIDataTypes.UUID.getDefaultInstance() : uuid;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemReferenceOrBuilder
            public boolean hasUuid() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_GenericItemReference_fieldAccessorTable.ensureFieldAccessorsInitialized(GenericItemReference.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return (!hasUuid() || getUuid().isInitialized()) && extensionsAreInitialized();
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

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder setExtension(GeneratedMessage.GeneratedExtension<GenericItemReference, Type> generatedExtension, Type type) {
                return (Builder) super.setExtension((GeneratedMessage.GeneratedExtension<MessageT, Type>) generatedExtension, type);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder, com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
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
            public GenericItemReference getDefaultInstanceForType() {
                return GenericItemReference.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder addExtension(GeneratedMessage.GeneratedExtension generatedExtension, Object obj) {
                return addExtension((GeneratedMessage.GeneratedExtension<GenericItemReference, List<Object>>) generatedExtension, obj);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedExtension, Object obj) {
                return setExtension((GeneratedMessage.GeneratedExtension<GenericItemReference, Object>) generatedExtension, obj);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public /* bridge */ /* synthetic */ GeneratedMessageV3.ExtendableBuilder setExtension(GeneratedMessage.GeneratedExtension generatedExtension, int i14, Object obj) {
                return setExtension((GeneratedMessage.GeneratedExtension<GenericItemReference, List<Object>>) generatedExtension, i14, obj);
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                maybeForceBuilderInitialization();
            }

            @Override // com.google.protobuf.GeneratedMessageV3.ExtendableBuilder
            public <Type> Builder setExtension(GeneratedMessage.GeneratedExtension<GenericItemReference, List<Type>> generatedExtension, int i14, Type type) {
                return (Builder) super.setExtension((GeneratedMessage.GeneratedExtension<MessageT, List<Type>>) generatedExtension, i14, type);
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
                if (message instanceof GenericItemReference) {
                    return mergeFrom((GenericItemReference) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GenericItemReference genericItemReference) {
                if (genericItemReference == GenericItemReference.getDefaultInstance()) {
                    return this;
                }
                if (genericItemReference.hasUuid()) {
                    mergeUuid(genericItemReference.getUuid());
                }
                mergeExtensionFields(genericItemReference);
                mergeUnknownFields(genericItemReference.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GenericItemReference getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ GenericItemReference(Builder builder) {
            this((GeneratedMessageV3.ExtendableBuilder<GenericItemReference, ?>) builder);
        }

        private GenericItemReference() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GenericItemReference parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GenericItemReference) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GenericItemReference parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GenericItemReference parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GenericItemReference parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GenericItemReference parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GenericItemReference parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GenericItemReference parseFrom(InputStream inputStream) {
            return (GenericItemReference) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GenericItemReference parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GenericItemReference) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GenericItemReference parseFrom(CodedInputStream codedInputStream) {
            return (GenericItemReference) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GenericItemReference parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GenericItemReference) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class GenericItemTransferService extends GeneratedMessageV3 implements GenericItemTransferServiceOrBuilder {
        public static final int ARBITRARY_ITEM_REQUEST_FIELD_NUMBER = 1;
        public static final int ARBITRARY_ITEM_RESPONSE_FIELD_NUMBER = 2;
        public static final int CANCEL_SESSION_REQUEST_FIELD_NUMBER = 9;
        public static final int CANCEL_SESSION_RESPONSE_FIELD_NUMBER = 10;
        public static final int ITEM_DATA_REQUEST_FIELD_NUMBER = 5;
        public static final int ITEM_DATA_RESPONSE_FIELD_NUMBER = 6;
        public static final int ITEM_LIST_REQUEST_FIELD_NUMBER = 3;
        public static final int ITEM_LIST_RESPONSE_FIELD_NUMBER = 4;
        public static final int SESSION_COMPLETED_NOTIFICATION_FIELD_NUMBER = 11;
        private static final long serialVersionUID = 0;
        private ArbitraryItemRequest arbitraryItemRequest_;
        private ArbitraryItemResponse arbitraryItemResponse_;
        private int bitField0_;
        private CancelSessionRequest cancelSessionRequest_;
        private CancelSessionResponse cancelSessionResponse_;
        private ItemRequest itemDataRequest_;
        private ItemResponse itemDataResponse_;
        private ItemListRequest itemListRequest_;
        private ItemListResponse itemListResponse_;
        private byte memoizedIsInitialized;
        private SessionCompletedNotification sessionCompletedNotification_;
        private static final GenericItemTransferService DEFAULT_INSTANCE = new GenericItemTransferService();

        @Deprecated
        public static final Parser<GenericItemTransferService> PARSER = new AbstractParser<GenericItemTransferService>() { // from class: com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferService.1
            @Override // com.google.protobuf.Parser
            public GenericItemTransferService parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = GenericItemTransferService.newBuilder();
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

        private GenericItemTransferService(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GenericItemTransferService getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_GenericItemTransferService_descriptor;
        }

        public static Builder newBuilder(GenericItemTransferService genericItemTransferService) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(genericItemTransferService);
        }

        public static GenericItemTransferService parseDelimitedFrom(InputStream inputStream) {
            return (GenericItemTransferService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static GenericItemTransferService parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<GenericItemTransferService> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof GenericItemTransferService)) {
                return super.equals(obj);
            }
            GenericItemTransferService genericItemTransferService = (GenericItemTransferService) obj;
            if (hasArbitraryItemRequest() != genericItemTransferService.hasArbitraryItemRequest()) {
                return false;
            }
            if ((hasArbitraryItemRequest() && !getArbitraryItemRequest().equals(genericItemTransferService.getArbitraryItemRequest())) || hasArbitraryItemResponse() != genericItemTransferService.hasArbitraryItemResponse()) {
                return false;
            }
            if ((hasArbitraryItemResponse() && !getArbitraryItemResponse().equals(genericItemTransferService.getArbitraryItemResponse())) || hasItemListRequest() != genericItemTransferService.hasItemListRequest()) {
                return false;
            }
            if ((hasItemListRequest() && !getItemListRequest().equals(genericItemTransferService.getItemListRequest())) || hasItemListResponse() != genericItemTransferService.hasItemListResponse()) {
                return false;
            }
            if ((hasItemListResponse() && !getItemListResponse().equals(genericItemTransferService.getItemListResponse())) || hasItemDataRequest() != genericItemTransferService.hasItemDataRequest()) {
                return false;
            }
            if ((hasItemDataRequest() && !getItemDataRequest().equals(genericItemTransferService.getItemDataRequest())) || hasItemDataResponse() != genericItemTransferService.hasItemDataResponse()) {
                return false;
            }
            if ((hasItemDataResponse() && !getItemDataResponse().equals(genericItemTransferService.getItemDataResponse())) || hasCancelSessionRequest() != genericItemTransferService.hasCancelSessionRequest()) {
                return false;
            }
            if ((hasCancelSessionRequest() && !getCancelSessionRequest().equals(genericItemTransferService.getCancelSessionRequest())) || hasCancelSessionResponse() != genericItemTransferService.hasCancelSessionResponse()) {
                return false;
            }
            if ((!hasCancelSessionResponse() || getCancelSessionResponse().equals(genericItemTransferService.getCancelSessionResponse())) && hasSessionCompletedNotification() == genericItemTransferService.hasSessionCompletedNotification()) {
                return (!hasSessionCompletedNotification() || getSessionCompletedNotification().equals(genericItemTransferService.getSessionCompletedNotification())) && getUnknownFields().equals(genericItemTransferService.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
        public ArbitraryItemRequest getArbitraryItemRequest() {
            ArbitraryItemRequest arbitraryItemRequest = this.arbitraryItemRequest_;
            return arbitraryItemRequest == null ? ArbitraryItemRequest.getDefaultInstance() : arbitraryItemRequest;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
        public ArbitraryItemRequestOrBuilder getArbitraryItemRequestOrBuilder() {
            ArbitraryItemRequest arbitraryItemRequest = this.arbitraryItemRequest_;
            return arbitraryItemRequest == null ? ArbitraryItemRequest.getDefaultInstance() : arbitraryItemRequest;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
        public ArbitraryItemResponse getArbitraryItemResponse() {
            ArbitraryItemResponse arbitraryItemResponse = this.arbitraryItemResponse_;
            return arbitraryItemResponse == null ? ArbitraryItemResponse.getDefaultInstance() : arbitraryItemResponse;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
        public ArbitraryItemResponseOrBuilder getArbitraryItemResponseOrBuilder() {
            ArbitraryItemResponse arbitraryItemResponse = this.arbitraryItemResponse_;
            return arbitraryItemResponse == null ? ArbitraryItemResponse.getDefaultInstance() : arbitraryItemResponse;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
        public CancelSessionRequest getCancelSessionRequest() {
            CancelSessionRequest cancelSessionRequest = this.cancelSessionRequest_;
            return cancelSessionRequest == null ? CancelSessionRequest.getDefaultInstance() : cancelSessionRequest;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
        public CancelSessionRequestOrBuilder getCancelSessionRequestOrBuilder() {
            CancelSessionRequest cancelSessionRequest = this.cancelSessionRequest_;
            return cancelSessionRequest == null ? CancelSessionRequest.getDefaultInstance() : cancelSessionRequest;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
        public CancelSessionResponse getCancelSessionResponse() {
            CancelSessionResponse cancelSessionResponse = this.cancelSessionResponse_;
            return cancelSessionResponse == null ? CancelSessionResponse.getDefaultInstance() : cancelSessionResponse;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
        public CancelSessionResponseOrBuilder getCancelSessionResponseOrBuilder() {
            CancelSessionResponse cancelSessionResponse = this.cancelSessionResponse_;
            return cancelSessionResponse == null ? CancelSessionResponse.getDefaultInstance() : cancelSessionResponse;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
        public ItemRequest getItemDataRequest() {
            ItemRequest itemRequest = this.itemDataRequest_;
            return itemRequest == null ? ItemRequest.getDefaultInstance() : itemRequest;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
        public ItemRequestOrBuilder getItemDataRequestOrBuilder() {
            ItemRequest itemRequest = this.itemDataRequest_;
            return itemRequest == null ? ItemRequest.getDefaultInstance() : itemRequest;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
        public ItemResponse getItemDataResponse() {
            ItemResponse itemResponse = this.itemDataResponse_;
            return itemResponse == null ? ItemResponse.getDefaultInstance() : itemResponse;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
        public ItemResponseOrBuilder getItemDataResponseOrBuilder() {
            ItemResponse itemResponse = this.itemDataResponse_;
            return itemResponse == null ? ItemResponse.getDefaultInstance() : itemResponse;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
        public ItemListRequest getItemListRequest() {
            ItemListRequest itemListRequest = this.itemListRequest_;
            return itemListRequest == null ? ItemListRequest.getDefaultInstance() : itemListRequest;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
        public ItemListRequestOrBuilder getItemListRequestOrBuilder() {
            ItemListRequest itemListRequest = this.itemListRequest_;
            return itemListRequest == null ? ItemListRequest.getDefaultInstance() : itemListRequest;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
        public ItemListResponse getItemListResponse() {
            ItemListResponse itemListResponse = this.itemListResponse_;
            return itemListResponse == null ? ItemListResponse.getDefaultInstance() : itemListResponse;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
        public ItemListResponseOrBuilder getItemListResponseOrBuilder() {
            ItemListResponse itemListResponse = this.itemListResponse_;
            return itemListResponse == null ? ItemListResponse.getDefaultInstance() : itemListResponse;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<GenericItemTransferService> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeMessageSize = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeMessageSize(1, getArbitraryItemRequest()) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(2, getArbitraryItemResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(3, getItemListRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(4, getItemListResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(5, getItemDataRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(6, getItemDataResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(9, getCancelSessionRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(10, getCancelSessionResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                iComputeMessageSize += CodedOutputStream.computeMessageSize(11, getSessionCompletedNotification());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeMessageSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
        public SessionCompletedNotification getSessionCompletedNotification() {
            SessionCompletedNotification sessionCompletedNotification = this.sessionCompletedNotification_;
            return sessionCompletedNotification == null ? SessionCompletedNotification.getDefaultInstance() : sessionCompletedNotification;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
        public SessionCompletedNotificationOrBuilder getSessionCompletedNotificationOrBuilder() {
            SessionCompletedNotification sessionCompletedNotification = this.sessionCompletedNotification_;
            return sessionCompletedNotification == null ? SessionCompletedNotification.getDefaultInstance() : sessionCompletedNotification;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
        public boolean hasArbitraryItemRequest() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
        public boolean hasArbitraryItemResponse() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
        public boolean hasCancelSessionRequest() {
            return (this.bitField0_ & 64) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
        public boolean hasCancelSessionResponse() {
            return (this.bitField0_ & 128) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
        public boolean hasItemDataRequest() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
        public boolean hasItemDataResponse() {
            return (this.bitField0_ & 32) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
        public boolean hasItemListRequest() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
        public boolean hasItemListResponse() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
        public boolean hasSessionCompletedNotification() {
            return (this.bitField0_ & 256) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasArbitraryItemRequest()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getArbitraryItemRequest().hashCode();
            }
            if (hasArbitraryItemResponse()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getArbitraryItemResponse().hashCode();
            }
            if (hasItemListRequest()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getItemListRequest().hashCode();
            }
            if (hasItemListResponse()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getItemListResponse().hashCode();
            }
            if (hasItemDataRequest()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getItemDataRequest().hashCode();
            }
            if (hasItemDataResponse()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getItemDataResponse().hashCode();
            }
            if (hasCancelSessionRequest()) {
                iHashCode = e5.c(iHashCode, 37, 9, 53) + getCancelSessionRequest().hashCode();
            }
            if (hasCancelSessionResponse()) {
                iHashCode = e5.c(iHashCode, 37, 10, 53) + getCancelSessionResponse().hashCode();
            }
            if (hasSessionCompletedNotification()) {
                iHashCode = e5.c(iHashCode, 37, 11, 53) + getSessionCompletedNotification().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_GenericItemTransferService_fieldAccessorTable.ensureFieldAccessorsInitialized(GenericItemTransferService.class, Builder.class);
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
            if (hasArbitraryItemRequest() && !getArbitraryItemRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasArbitraryItemResponse() && !getArbitraryItemResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasItemListRequest() && !getItemListRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasItemListResponse() && !getItemListResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasItemDataRequest() && !getItemDataRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasItemDataResponse() && !getItemDataResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasCancelSessionRequest() && !getCancelSessionRequest().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (hasCancelSessionResponse() && !getCancelSessionResponse().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasSessionCompletedNotification() || getSessionCompletedNotification().isInitialized()) {
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
            return new GenericItemTransferService();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeMessage(1, getArbitraryItemRequest());
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getArbitraryItemResponse());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getItemListRequest());
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeMessage(4, getItemListResponse());
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeMessage(5, getItemDataRequest());
            }
            if ((this.bitField0_ & 32) != 0) {
                codedOutputStream.writeMessage(6, getItemDataResponse());
            }
            if ((this.bitField0_ & 64) != 0) {
                codedOutputStream.writeMessage(9, getCancelSessionRequest());
            }
            if ((this.bitField0_ & 128) != 0) {
                codedOutputStream.writeMessage(10, getCancelSessionResponse());
            }
            if ((this.bitField0_ & 256) != 0) {
                codedOutputStream.writeMessage(11, getSessionCompletedNotification());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements GenericItemTransferServiceOrBuilder {
            private SingleFieldBuilderV3<ArbitraryItemRequest, ArbitraryItemRequest.Builder, ArbitraryItemRequestOrBuilder> arbitraryItemRequestBuilder_;
            private ArbitraryItemRequest arbitraryItemRequest_;
            private SingleFieldBuilderV3<ArbitraryItemResponse, ArbitraryItemResponse.Builder, ArbitraryItemResponseOrBuilder> arbitraryItemResponseBuilder_;
            private ArbitraryItemResponse arbitraryItemResponse_;
            private int bitField0_;
            private SingleFieldBuilderV3<CancelSessionRequest, CancelSessionRequest.Builder, CancelSessionRequestOrBuilder> cancelSessionRequestBuilder_;
            private CancelSessionRequest cancelSessionRequest_;
            private SingleFieldBuilderV3<CancelSessionResponse, CancelSessionResponse.Builder, CancelSessionResponseOrBuilder> cancelSessionResponseBuilder_;
            private CancelSessionResponse cancelSessionResponse_;
            private SingleFieldBuilderV3<ItemRequest, ItemRequest.Builder, ItemRequestOrBuilder> itemDataRequestBuilder_;
            private ItemRequest itemDataRequest_;
            private SingleFieldBuilderV3<ItemResponse, ItemResponse.Builder, ItemResponseOrBuilder> itemDataResponseBuilder_;
            private ItemResponse itemDataResponse_;
            private SingleFieldBuilderV3<ItemListRequest, ItemListRequest.Builder, ItemListRequestOrBuilder> itemListRequestBuilder_;
            private ItemListRequest itemListRequest_;
            private SingleFieldBuilderV3<ItemListResponse, ItemListResponse.Builder, ItemListResponseOrBuilder> itemListResponseBuilder_;
            private ItemListResponse itemListResponse_;
            private SingleFieldBuilderV3<SessionCompletedNotification, SessionCompletedNotification.Builder, SessionCompletedNotificationOrBuilder> sessionCompletedNotificationBuilder_;
            private SessionCompletedNotification sessionCompletedNotification_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(GenericItemTransferService genericItemTransferService) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    SingleFieldBuilderV3<ArbitraryItemRequest, ArbitraryItemRequest.Builder, ArbitraryItemRequestOrBuilder> singleFieldBuilderV3 = this.arbitraryItemRequestBuilder_;
                    genericItemTransferService.arbitraryItemRequest_ = singleFieldBuilderV3 == null ? this.arbitraryItemRequest_ : (ArbitraryItemRequest) singleFieldBuilderV3.build();
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<ArbitraryItemResponse, ArbitraryItemResponse.Builder, ArbitraryItemResponseOrBuilder> singleFieldBuilderV4 = this.arbitraryItemResponseBuilder_;
                    genericItemTransferService.arbitraryItemResponse_ = singleFieldBuilderV4 == null ? this.arbitraryItemResponse_ : (ArbitraryItemResponse) singleFieldBuilderV4.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<ItemListRequest, ItemListRequest.Builder, ItemListRequestOrBuilder> singleFieldBuilderV5 = this.itemListRequestBuilder_;
                    genericItemTransferService.itemListRequest_ = singleFieldBuilderV5 == null ? this.itemListRequest_ : (ItemListRequest) singleFieldBuilderV5.build();
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    SingleFieldBuilderV3<ItemListResponse, ItemListResponse.Builder, ItemListResponseOrBuilder> singleFieldBuilderV6 = this.itemListResponseBuilder_;
                    genericItemTransferService.itemListResponse_ = singleFieldBuilderV6 == null ? this.itemListResponse_ : (ItemListResponse) singleFieldBuilderV6.build();
                    i14 |= 8;
                }
                if ((i15 & 16) != 0) {
                    SingleFieldBuilderV3<ItemRequest, ItemRequest.Builder, ItemRequestOrBuilder> singleFieldBuilderV7 = this.itemDataRequestBuilder_;
                    genericItemTransferService.itemDataRequest_ = singleFieldBuilderV7 == null ? this.itemDataRequest_ : (ItemRequest) singleFieldBuilderV7.build();
                    i14 |= 16;
                }
                if ((i15 & 32) != 0) {
                    SingleFieldBuilderV3<ItemResponse, ItemResponse.Builder, ItemResponseOrBuilder> singleFieldBuilderV8 = this.itemDataResponseBuilder_;
                    genericItemTransferService.itemDataResponse_ = singleFieldBuilderV8 == null ? this.itemDataResponse_ : (ItemResponse) singleFieldBuilderV8.build();
                    i14 |= 32;
                }
                if ((i15 & 64) != 0) {
                    SingleFieldBuilderV3<CancelSessionRequest, CancelSessionRequest.Builder, CancelSessionRequestOrBuilder> singleFieldBuilderV9 = this.cancelSessionRequestBuilder_;
                    genericItemTransferService.cancelSessionRequest_ = singleFieldBuilderV9 == null ? this.cancelSessionRequest_ : (CancelSessionRequest) singleFieldBuilderV9.build();
                    i14 |= 64;
                }
                if ((i15 & 128) != 0) {
                    SingleFieldBuilderV3<CancelSessionResponse, CancelSessionResponse.Builder, CancelSessionResponseOrBuilder> singleFieldBuilderV10 = this.cancelSessionResponseBuilder_;
                    genericItemTransferService.cancelSessionResponse_ = singleFieldBuilderV10 == null ? this.cancelSessionResponse_ : (CancelSessionResponse) singleFieldBuilderV10.build();
                    i14 |= 128;
                }
                if ((i15 & 256) != 0) {
                    SingleFieldBuilderV3<SessionCompletedNotification, SessionCompletedNotification.Builder, SessionCompletedNotificationOrBuilder> singleFieldBuilderV11 = this.sessionCompletedNotificationBuilder_;
                    genericItemTransferService.sessionCompletedNotification_ = singleFieldBuilderV11 == null ? this.sessionCompletedNotification_ : (SessionCompletedNotification) singleFieldBuilderV11.build();
                    i14 |= 256;
                }
                genericItemTransferService.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<ArbitraryItemRequest, ArbitraryItemRequest.Builder, ArbitraryItemRequestOrBuilder> getArbitraryItemRequestFieldBuilder() {
                if (this.arbitraryItemRequestBuilder_ == null) {
                    this.arbitraryItemRequestBuilder_ = new SingleFieldBuilderV3<>(getArbitraryItemRequest(), getParentForChildren(), isClean());
                    this.arbitraryItemRequest_ = null;
                }
                return this.arbitraryItemRequestBuilder_;
            }

            private SingleFieldBuilderV3<ArbitraryItemResponse, ArbitraryItemResponse.Builder, ArbitraryItemResponseOrBuilder> getArbitraryItemResponseFieldBuilder() {
                if (this.arbitraryItemResponseBuilder_ == null) {
                    this.arbitraryItemResponseBuilder_ = new SingleFieldBuilderV3<>(getArbitraryItemResponse(), getParentForChildren(), isClean());
                    this.arbitraryItemResponse_ = null;
                }
                return this.arbitraryItemResponseBuilder_;
            }

            private SingleFieldBuilderV3<CancelSessionRequest, CancelSessionRequest.Builder, CancelSessionRequestOrBuilder> getCancelSessionRequestFieldBuilder() {
                if (this.cancelSessionRequestBuilder_ == null) {
                    this.cancelSessionRequestBuilder_ = new SingleFieldBuilderV3<>(getCancelSessionRequest(), getParentForChildren(), isClean());
                    this.cancelSessionRequest_ = null;
                }
                return this.cancelSessionRequestBuilder_;
            }

            private SingleFieldBuilderV3<CancelSessionResponse, CancelSessionResponse.Builder, CancelSessionResponseOrBuilder> getCancelSessionResponseFieldBuilder() {
                if (this.cancelSessionResponseBuilder_ == null) {
                    this.cancelSessionResponseBuilder_ = new SingleFieldBuilderV3<>(getCancelSessionResponse(), getParentForChildren(), isClean());
                    this.cancelSessionResponse_ = null;
                }
                return this.cancelSessionResponseBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_GenericItemTransferService_descriptor;
            }

            private SingleFieldBuilderV3<ItemRequest, ItemRequest.Builder, ItemRequestOrBuilder> getItemDataRequestFieldBuilder() {
                if (this.itemDataRequestBuilder_ == null) {
                    this.itemDataRequestBuilder_ = new SingleFieldBuilderV3<>(getItemDataRequest(), getParentForChildren(), isClean());
                    this.itemDataRequest_ = null;
                }
                return this.itemDataRequestBuilder_;
            }

            private SingleFieldBuilderV3<ItemResponse, ItemResponse.Builder, ItemResponseOrBuilder> getItemDataResponseFieldBuilder() {
                if (this.itemDataResponseBuilder_ == null) {
                    this.itemDataResponseBuilder_ = new SingleFieldBuilderV3<>(getItemDataResponse(), getParentForChildren(), isClean());
                    this.itemDataResponse_ = null;
                }
                return this.itemDataResponseBuilder_;
            }

            private SingleFieldBuilderV3<ItemListRequest, ItemListRequest.Builder, ItemListRequestOrBuilder> getItemListRequestFieldBuilder() {
                if (this.itemListRequestBuilder_ == null) {
                    this.itemListRequestBuilder_ = new SingleFieldBuilderV3<>(getItemListRequest(), getParentForChildren(), isClean());
                    this.itemListRequest_ = null;
                }
                return this.itemListRequestBuilder_;
            }

            private SingleFieldBuilderV3<ItemListResponse, ItemListResponse.Builder, ItemListResponseOrBuilder> getItemListResponseFieldBuilder() {
                if (this.itemListResponseBuilder_ == null) {
                    this.itemListResponseBuilder_ = new SingleFieldBuilderV3<>(getItemListResponse(), getParentForChildren(), isClean());
                    this.itemListResponse_ = null;
                }
                return this.itemListResponseBuilder_;
            }

            private SingleFieldBuilderV3<SessionCompletedNotification, SessionCompletedNotification.Builder, SessionCompletedNotificationOrBuilder> getSessionCompletedNotificationFieldBuilder() {
                if (this.sessionCompletedNotificationBuilder_ == null) {
                    this.sessionCompletedNotificationBuilder_ = new SingleFieldBuilderV3<>(getSessionCompletedNotification(), getParentForChildren(), isClean());
                    this.sessionCompletedNotification_ = null;
                }
                return this.sessionCompletedNotificationBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getArbitraryItemRequestFieldBuilder();
                    getArbitraryItemResponseFieldBuilder();
                    getItemListRequestFieldBuilder();
                    getItemListResponseFieldBuilder();
                    getItemDataRequestFieldBuilder();
                    getItemDataResponseFieldBuilder();
                    getCancelSessionRequestFieldBuilder();
                    getCancelSessionResponseFieldBuilder();
                    getSessionCompletedNotificationFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GenericItemTransferService build() {
                GenericItemTransferService genericItemTransferServiceBuildPartial = buildPartial();
                if (genericItemTransferServiceBuildPartial.isInitialized()) {
                    return genericItemTransferServiceBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) genericItemTransferServiceBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public GenericItemTransferService buildPartial() {
                GenericItemTransferService genericItemTransferService = new GenericItemTransferService(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(genericItemTransferService);
                }
                onBuilt();
                return genericItemTransferService;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.arbitraryItemRequest_ = null;
                SingleFieldBuilderV3<ArbitraryItemRequest, ArbitraryItemRequest.Builder, ArbitraryItemRequestOrBuilder> singleFieldBuilderV3 = this.arbitraryItemRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.arbitraryItemRequestBuilder_ = null;
                }
                this.arbitraryItemResponse_ = null;
                SingleFieldBuilderV3<ArbitraryItemResponse, ArbitraryItemResponse.Builder, ArbitraryItemResponseOrBuilder> singleFieldBuilderV4 = this.arbitraryItemResponseBuilder_;
                if (singleFieldBuilderV4 != null) {
                    singleFieldBuilderV4.dispose();
                    this.arbitraryItemResponseBuilder_ = null;
                }
                this.itemListRequest_ = null;
                SingleFieldBuilderV3<ItemListRequest, ItemListRequest.Builder, ItemListRequestOrBuilder> singleFieldBuilderV5 = this.itemListRequestBuilder_;
                if (singleFieldBuilderV5 != null) {
                    singleFieldBuilderV5.dispose();
                    this.itemListRequestBuilder_ = null;
                }
                this.itemListResponse_ = null;
                SingleFieldBuilderV3<ItemListResponse, ItemListResponse.Builder, ItemListResponseOrBuilder> singleFieldBuilderV6 = this.itemListResponseBuilder_;
                if (singleFieldBuilderV6 != null) {
                    singleFieldBuilderV6.dispose();
                    this.itemListResponseBuilder_ = null;
                }
                this.itemDataRequest_ = null;
                SingleFieldBuilderV3<ItemRequest, ItemRequest.Builder, ItemRequestOrBuilder> singleFieldBuilderV7 = this.itemDataRequestBuilder_;
                if (singleFieldBuilderV7 != null) {
                    singleFieldBuilderV7.dispose();
                    this.itemDataRequestBuilder_ = null;
                }
                this.itemDataResponse_ = null;
                SingleFieldBuilderV3<ItemResponse, ItemResponse.Builder, ItemResponseOrBuilder> singleFieldBuilderV8 = this.itemDataResponseBuilder_;
                if (singleFieldBuilderV8 != null) {
                    singleFieldBuilderV8.dispose();
                    this.itemDataResponseBuilder_ = null;
                }
                this.cancelSessionRequest_ = null;
                SingleFieldBuilderV3<CancelSessionRequest, CancelSessionRequest.Builder, CancelSessionRequestOrBuilder> singleFieldBuilderV9 = this.cancelSessionRequestBuilder_;
                if (singleFieldBuilderV9 != null) {
                    singleFieldBuilderV9.dispose();
                    this.cancelSessionRequestBuilder_ = null;
                }
                this.cancelSessionResponse_ = null;
                SingleFieldBuilderV3<CancelSessionResponse, CancelSessionResponse.Builder, CancelSessionResponseOrBuilder> singleFieldBuilderV10 = this.cancelSessionResponseBuilder_;
                if (singleFieldBuilderV10 != null) {
                    singleFieldBuilderV10.dispose();
                    this.cancelSessionResponseBuilder_ = null;
                }
                this.sessionCompletedNotification_ = null;
                SingleFieldBuilderV3<SessionCompletedNotification, SessionCompletedNotification.Builder, SessionCompletedNotificationOrBuilder> singleFieldBuilderV11 = this.sessionCompletedNotificationBuilder_;
                if (singleFieldBuilderV11 != null) {
                    singleFieldBuilderV11.dispose();
                    this.sessionCompletedNotificationBuilder_ = null;
                }
                return this;
            }

            public Builder clearArbitraryItemRequest() {
                this.bitField0_ &= -2;
                this.arbitraryItemRequest_ = null;
                SingleFieldBuilderV3<ArbitraryItemRequest, ArbitraryItemRequest.Builder, ArbitraryItemRequestOrBuilder> singleFieldBuilderV3 = this.arbitraryItemRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.arbitraryItemRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearArbitraryItemResponse() {
                this.bitField0_ &= -3;
                this.arbitraryItemResponse_ = null;
                SingleFieldBuilderV3<ArbitraryItemResponse, ArbitraryItemResponse.Builder, ArbitraryItemResponseOrBuilder> singleFieldBuilderV3 = this.arbitraryItemResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.arbitraryItemResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearCancelSessionRequest() {
                this.bitField0_ &= -65;
                this.cancelSessionRequest_ = null;
                SingleFieldBuilderV3<CancelSessionRequest, CancelSessionRequest.Builder, CancelSessionRequestOrBuilder> singleFieldBuilderV3 = this.cancelSessionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.cancelSessionRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearCancelSessionResponse() {
                this.bitField0_ &= -129;
                this.cancelSessionResponse_ = null;
                SingleFieldBuilderV3<CancelSessionResponse, CancelSessionResponse.Builder, CancelSessionResponseOrBuilder> singleFieldBuilderV3 = this.cancelSessionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.cancelSessionResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearItemDataRequest() {
                this.bitField0_ &= -17;
                this.itemDataRequest_ = null;
                SingleFieldBuilderV3<ItemRequest, ItemRequest.Builder, ItemRequestOrBuilder> singleFieldBuilderV3 = this.itemDataRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.itemDataRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearItemDataResponse() {
                this.bitField0_ &= -33;
                this.itemDataResponse_ = null;
                SingleFieldBuilderV3<ItemResponse, ItemResponse.Builder, ItemResponseOrBuilder> singleFieldBuilderV3 = this.itemDataResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.itemDataResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearItemListRequest() {
                this.bitField0_ &= -5;
                this.itemListRequest_ = null;
                SingleFieldBuilderV3<ItemListRequest, ItemListRequest.Builder, ItemListRequestOrBuilder> singleFieldBuilderV3 = this.itemListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.itemListRequestBuilder_ = null;
                }
                onChanged();
                return this;
            }

            public Builder clearItemListResponse() {
                this.bitField0_ &= -9;
                this.itemListResponse_ = null;
                SingleFieldBuilderV3<ItemListResponse, ItemListResponse.Builder, ItemListResponseOrBuilder> singleFieldBuilderV3 = this.itemListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.itemListResponseBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSessionCompletedNotification() {
                this.bitField0_ &= -257;
                this.sessionCompletedNotification_ = null;
                SingleFieldBuilderV3<SessionCompletedNotification, SessionCompletedNotification.Builder, SessionCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.sessionCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.sessionCompletedNotificationBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
            public ArbitraryItemRequest getArbitraryItemRequest() {
                SingleFieldBuilderV3<ArbitraryItemRequest, ArbitraryItemRequest.Builder, ArbitraryItemRequestOrBuilder> singleFieldBuilderV3 = this.arbitraryItemRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ArbitraryItemRequest) singleFieldBuilderV3.getMessage();
                }
                ArbitraryItemRequest arbitraryItemRequest = this.arbitraryItemRequest_;
                return arbitraryItemRequest == null ? ArbitraryItemRequest.getDefaultInstance() : arbitraryItemRequest;
            }

            public ArbitraryItemRequest.Builder getArbitraryItemRequestBuilder() {
                this.bitField0_ |= 1;
                onChanged();
                return (ArbitraryItemRequest.Builder) getArbitraryItemRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
            public ArbitraryItemRequestOrBuilder getArbitraryItemRequestOrBuilder() {
                SingleFieldBuilderV3<ArbitraryItemRequest, ArbitraryItemRequest.Builder, ArbitraryItemRequestOrBuilder> singleFieldBuilderV3 = this.arbitraryItemRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ArbitraryItemRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ArbitraryItemRequest arbitraryItemRequest = this.arbitraryItemRequest_;
                return arbitraryItemRequest == null ? ArbitraryItemRequest.getDefaultInstance() : arbitraryItemRequest;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
            public ArbitraryItemResponse getArbitraryItemResponse() {
                SingleFieldBuilderV3<ArbitraryItemResponse, ArbitraryItemResponse.Builder, ArbitraryItemResponseOrBuilder> singleFieldBuilderV3 = this.arbitraryItemResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ArbitraryItemResponse) singleFieldBuilderV3.getMessage();
                }
                ArbitraryItemResponse arbitraryItemResponse = this.arbitraryItemResponse_;
                return arbitraryItemResponse == null ? ArbitraryItemResponse.getDefaultInstance() : arbitraryItemResponse;
            }

            public ArbitraryItemResponse.Builder getArbitraryItemResponseBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (ArbitraryItemResponse.Builder) getArbitraryItemResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
            public ArbitraryItemResponseOrBuilder getArbitraryItemResponseOrBuilder() {
                SingleFieldBuilderV3<ArbitraryItemResponse, ArbitraryItemResponse.Builder, ArbitraryItemResponseOrBuilder> singleFieldBuilderV3 = this.arbitraryItemResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ArbitraryItemResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ArbitraryItemResponse arbitraryItemResponse = this.arbitraryItemResponse_;
                return arbitraryItemResponse == null ? ArbitraryItemResponse.getDefaultInstance() : arbitraryItemResponse;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
            public CancelSessionRequest getCancelSessionRequest() {
                SingleFieldBuilderV3<CancelSessionRequest, CancelSessionRequest.Builder, CancelSessionRequestOrBuilder> singleFieldBuilderV3 = this.cancelSessionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CancelSessionRequest) singleFieldBuilderV3.getMessage();
                }
                CancelSessionRequest cancelSessionRequest = this.cancelSessionRequest_;
                return cancelSessionRequest == null ? CancelSessionRequest.getDefaultInstance() : cancelSessionRequest;
            }

            public CancelSessionRequest.Builder getCancelSessionRequestBuilder() {
                this.bitField0_ |= 64;
                onChanged();
                return (CancelSessionRequest.Builder) getCancelSessionRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
            public CancelSessionRequestOrBuilder getCancelSessionRequestOrBuilder() {
                SingleFieldBuilderV3<CancelSessionRequest, CancelSessionRequest.Builder, CancelSessionRequestOrBuilder> singleFieldBuilderV3 = this.cancelSessionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CancelSessionRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CancelSessionRequest cancelSessionRequest = this.cancelSessionRequest_;
                return cancelSessionRequest == null ? CancelSessionRequest.getDefaultInstance() : cancelSessionRequest;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
            public CancelSessionResponse getCancelSessionResponse() {
                SingleFieldBuilderV3<CancelSessionResponse, CancelSessionResponse.Builder, CancelSessionResponseOrBuilder> singleFieldBuilderV3 = this.cancelSessionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CancelSessionResponse) singleFieldBuilderV3.getMessage();
                }
                CancelSessionResponse cancelSessionResponse = this.cancelSessionResponse_;
                return cancelSessionResponse == null ? CancelSessionResponse.getDefaultInstance() : cancelSessionResponse;
            }

            public CancelSessionResponse.Builder getCancelSessionResponseBuilder() {
                this.bitField0_ |= 128;
                onChanged();
                return (CancelSessionResponse.Builder) getCancelSessionResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
            public CancelSessionResponseOrBuilder getCancelSessionResponseOrBuilder() {
                SingleFieldBuilderV3<CancelSessionResponse, CancelSessionResponse.Builder, CancelSessionResponseOrBuilder> singleFieldBuilderV3 = this.cancelSessionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (CancelSessionResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                CancelSessionResponse cancelSessionResponse = this.cancelSessionResponse_;
                return cancelSessionResponse == null ? CancelSessionResponse.getDefaultInstance() : cancelSessionResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_GenericItemTransferService_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
            public ItemRequest getItemDataRequest() {
                SingleFieldBuilderV3<ItemRequest, ItemRequest.Builder, ItemRequestOrBuilder> singleFieldBuilderV3 = this.itemDataRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ItemRequest) singleFieldBuilderV3.getMessage();
                }
                ItemRequest itemRequest = this.itemDataRequest_;
                return itemRequest == null ? ItemRequest.getDefaultInstance() : itemRequest;
            }

            public ItemRequest.Builder getItemDataRequestBuilder() {
                this.bitField0_ |= 16;
                onChanged();
                return (ItemRequest.Builder) getItemDataRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
            public ItemRequestOrBuilder getItemDataRequestOrBuilder() {
                SingleFieldBuilderV3<ItemRequest, ItemRequest.Builder, ItemRequestOrBuilder> singleFieldBuilderV3 = this.itemDataRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ItemRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ItemRequest itemRequest = this.itemDataRequest_;
                return itemRequest == null ? ItemRequest.getDefaultInstance() : itemRequest;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
            public ItemResponse getItemDataResponse() {
                SingleFieldBuilderV3<ItemResponse, ItemResponse.Builder, ItemResponseOrBuilder> singleFieldBuilderV3 = this.itemDataResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ItemResponse) singleFieldBuilderV3.getMessage();
                }
                ItemResponse itemResponse = this.itemDataResponse_;
                return itemResponse == null ? ItemResponse.getDefaultInstance() : itemResponse;
            }

            public ItemResponse.Builder getItemDataResponseBuilder() {
                this.bitField0_ |= 32;
                onChanged();
                return (ItemResponse.Builder) getItemDataResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
            public ItemResponseOrBuilder getItemDataResponseOrBuilder() {
                SingleFieldBuilderV3<ItemResponse, ItemResponse.Builder, ItemResponseOrBuilder> singleFieldBuilderV3 = this.itemDataResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ItemResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ItemResponse itemResponse = this.itemDataResponse_;
                return itemResponse == null ? ItemResponse.getDefaultInstance() : itemResponse;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
            public ItemListRequest getItemListRequest() {
                SingleFieldBuilderV3<ItemListRequest, ItemListRequest.Builder, ItemListRequestOrBuilder> singleFieldBuilderV3 = this.itemListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ItemListRequest) singleFieldBuilderV3.getMessage();
                }
                ItemListRequest itemListRequest = this.itemListRequest_;
                return itemListRequest == null ? ItemListRequest.getDefaultInstance() : itemListRequest;
            }

            public ItemListRequest.Builder getItemListRequestBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (ItemListRequest.Builder) getItemListRequestFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
            public ItemListRequestOrBuilder getItemListRequestOrBuilder() {
                SingleFieldBuilderV3<ItemListRequest, ItemListRequest.Builder, ItemListRequestOrBuilder> singleFieldBuilderV3 = this.itemListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ItemListRequestOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ItemListRequest itemListRequest = this.itemListRequest_;
                return itemListRequest == null ? ItemListRequest.getDefaultInstance() : itemListRequest;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
            public ItemListResponse getItemListResponse() {
                SingleFieldBuilderV3<ItemListResponse, ItemListResponse.Builder, ItemListResponseOrBuilder> singleFieldBuilderV3 = this.itemListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ItemListResponse) singleFieldBuilderV3.getMessage();
                }
                ItemListResponse itemListResponse = this.itemListResponse_;
                return itemListResponse == null ? ItemListResponse.getDefaultInstance() : itemListResponse;
            }

            public ItemListResponse.Builder getItemListResponseBuilder() {
                this.bitField0_ |= 8;
                onChanged();
                return (ItemListResponse.Builder) getItemListResponseFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
            public ItemListResponseOrBuilder getItemListResponseOrBuilder() {
                SingleFieldBuilderV3<ItemListResponse, ItemListResponse.Builder, ItemListResponseOrBuilder> singleFieldBuilderV3 = this.itemListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (ItemListResponseOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                ItemListResponse itemListResponse = this.itemListResponse_;
                return itemListResponse == null ? ItemListResponse.getDefaultInstance() : itemListResponse;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
            public SessionCompletedNotification getSessionCompletedNotification() {
                SingleFieldBuilderV3<SessionCompletedNotification, SessionCompletedNotification.Builder, SessionCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.sessionCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SessionCompletedNotification) singleFieldBuilderV3.getMessage();
                }
                SessionCompletedNotification sessionCompletedNotification = this.sessionCompletedNotification_;
                return sessionCompletedNotification == null ? SessionCompletedNotification.getDefaultInstance() : sessionCompletedNotification;
            }

            public SessionCompletedNotification.Builder getSessionCompletedNotificationBuilder() {
                this.bitField0_ |= 256;
                onChanged();
                return (SessionCompletedNotification.Builder) getSessionCompletedNotificationFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
            public SessionCompletedNotificationOrBuilder getSessionCompletedNotificationOrBuilder() {
                SingleFieldBuilderV3<SessionCompletedNotification, SessionCompletedNotification.Builder, SessionCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.sessionCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (SessionCompletedNotificationOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                SessionCompletedNotification sessionCompletedNotification = this.sessionCompletedNotification_;
                return sessionCompletedNotification == null ? SessionCompletedNotification.getDefaultInstance() : sessionCompletedNotification;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
            public boolean hasArbitraryItemRequest() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
            public boolean hasArbitraryItemResponse() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
            public boolean hasCancelSessionRequest() {
                return (this.bitField0_ & 64) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
            public boolean hasCancelSessionResponse() {
                return (this.bitField0_ & 128) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
            public boolean hasItemDataRequest() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
            public boolean hasItemDataResponse() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
            public boolean hasItemListRequest() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
            public boolean hasItemListResponse() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.GenericItemTransferServiceOrBuilder
            public boolean hasSessionCompletedNotification() {
                return (this.bitField0_ & 256) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_GenericItemTransferService_fieldAccessorTable.ensureFieldAccessorsInitialized(GenericItemTransferService.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasArbitraryItemRequest() && !getArbitraryItemRequest().isInitialized()) {
                    return false;
                }
                if (hasArbitraryItemResponse() && !getArbitraryItemResponse().isInitialized()) {
                    return false;
                }
                if (hasItemListRequest() && !getItemListRequest().isInitialized()) {
                    return false;
                }
                if (hasItemListResponse() && !getItemListResponse().isInitialized()) {
                    return false;
                }
                if (hasItemDataRequest() && !getItemDataRequest().isInitialized()) {
                    return false;
                }
                if (hasItemDataResponse() && !getItemDataResponse().isInitialized()) {
                    return false;
                }
                if (hasCancelSessionRequest() && !getCancelSessionRequest().isInitialized()) {
                    return false;
                }
                if (!hasCancelSessionResponse() || getCancelSessionResponse().isInitialized()) {
                    return !hasSessionCompletedNotification() || getSessionCompletedNotification().isInitialized();
                }
                return false;
            }

            public Builder mergeArbitraryItemRequest(ArbitraryItemRequest arbitraryItemRequest) {
                ArbitraryItemRequest arbitraryItemRequest2;
                SingleFieldBuilderV3<ArbitraryItemRequest, ArbitraryItemRequest.Builder, ArbitraryItemRequestOrBuilder> singleFieldBuilderV3 = this.arbitraryItemRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(arbitraryItemRequest);
                } else if ((this.bitField0_ & 1) == 0 || (arbitraryItemRequest2 = this.arbitraryItemRequest_) == null || arbitraryItemRequest2 == ArbitraryItemRequest.getDefaultInstance()) {
                    this.arbitraryItemRequest_ = arbitraryItemRequest;
                } else {
                    getArbitraryItemRequestBuilder().mergeFrom(arbitraryItemRequest);
                }
                if (this.arbitraryItemRequest_ != null) {
                    this.bitField0_ |= 1;
                    onChanged();
                }
                return this;
            }

            public Builder mergeArbitraryItemResponse(ArbitraryItemResponse arbitraryItemResponse) {
                ArbitraryItemResponse arbitraryItemResponse2;
                SingleFieldBuilderV3<ArbitraryItemResponse, ArbitraryItemResponse.Builder, ArbitraryItemResponseOrBuilder> singleFieldBuilderV3 = this.arbitraryItemResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(arbitraryItemResponse);
                } else if ((this.bitField0_ & 2) == 0 || (arbitraryItemResponse2 = this.arbitraryItemResponse_) == null || arbitraryItemResponse2 == ArbitraryItemResponse.getDefaultInstance()) {
                    this.arbitraryItemResponse_ = arbitraryItemResponse;
                } else {
                    getArbitraryItemResponseBuilder().mergeFrom(arbitraryItemResponse);
                }
                if (this.arbitraryItemResponse_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeCancelSessionRequest(CancelSessionRequest cancelSessionRequest) {
                CancelSessionRequest cancelSessionRequest2;
                SingleFieldBuilderV3<CancelSessionRequest, CancelSessionRequest.Builder, CancelSessionRequestOrBuilder> singleFieldBuilderV3 = this.cancelSessionRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(cancelSessionRequest);
                } else if ((this.bitField0_ & 64) == 0 || (cancelSessionRequest2 = this.cancelSessionRequest_) == null || cancelSessionRequest2 == CancelSessionRequest.getDefaultInstance()) {
                    this.cancelSessionRequest_ = cancelSessionRequest;
                } else {
                    getCancelSessionRequestBuilder().mergeFrom(cancelSessionRequest);
                }
                if (this.cancelSessionRequest_ != null) {
                    this.bitField0_ |= 64;
                    onChanged();
                }
                return this;
            }

            public Builder mergeCancelSessionResponse(CancelSessionResponse cancelSessionResponse) {
                CancelSessionResponse cancelSessionResponse2;
                SingleFieldBuilderV3<CancelSessionResponse, CancelSessionResponse.Builder, CancelSessionResponseOrBuilder> singleFieldBuilderV3 = this.cancelSessionResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(cancelSessionResponse);
                } else if ((this.bitField0_ & 128) == 0 || (cancelSessionResponse2 = this.cancelSessionResponse_) == null || cancelSessionResponse2 == CancelSessionResponse.getDefaultInstance()) {
                    this.cancelSessionResponse_ = cancelSessionResponse;
                } else {
                    getCancelSessionResponseBuilder().mergeFrom(cancelSessionResponse);
                }
                if (this.cancelSessionResponse_ != null) {
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
                            if (tag != 0) {
                                if (tag == 10) {
                                    codedInputStream.readMessage(getArbitraryItemRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getArbitraryItemResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getItemListRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    codedInputStream.readMessage(getItemListResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 8;
                                } else if (tag == 42) {
                                    codedInputStream.readMessage(getItemDataRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 16;
                                } else if (tag == 50) {
                                    codedInputStream.readMessage(getItemDataResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 32;
                                } else if (tag == 74) {
                                    codedInputStream.readMessage(getCancelSessionRequestFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 64;
                                } else if (tag == 82) {
                                    codedInputStream.readMessage(getCancelSessionResponseFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 128;
                                } else if (tag == 90) {
                                    codedInputStream.readMessage(getSessionCompletedNotificationFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder mergeItemDataRequest(ItemRequest itemRequest) {
                ItemRequest itemRequest2;
                SingleFieldBuilderV3<ItemRequest, ItemRequest.Builder, ItemRequestOrBuilder> singleFieldBuilderV3 = this.itemDataRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(itemRequest);
                } else if ((this.bitField0_ & 16) == 0 || (itemRequest2 = this.itemDataRequest_) == null || itemRequest2 == ItemRequest.getDefaultInstance()) {
                    this.itemDataRequest_ = itemRequest;
                } else {
                    getItemDataRequestBuilder().mergeFrom(itemRequest);
                }
                if (this.itemDataRequest_ != null) {
                    this.bitField0_ |= 16;
                    onChanged();
                }
                return this;
            }

            public Builder mergeItemDataResponse(ItemResponse itemResponse) {
                ItemResponse itemResponse2;
                SingleFieldBuilderV3<ItemResponse, ItemResponse.Builder, ItemResponseOrBuilder> singleFieldBuilderV3 = this.itemDataResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(itemResponse);
                } else if ((this.bitField0_ & 32) == 0 || (itemResponse2 = this.itemDataResponse_) == null || itemResponse2 == ItemResponse.getDefaultInstance()) {
                    this.itemDataResponse_ = itemResponse;
                } else {
                    getItemDataResponseBuilder().mergeFrom(itemResponse);
                }
                if (this.itemDataResponse_ != null) {
                    this.bitField0_ |= 32;
                    onChanged();
                }
                return this;
            }

            public Builder mergeItemListRequest(ItemListRequest itemListRequest) {
                ItemListRequest itemListRequest2;
                SingleFieldBuilderV3<ItemListRequest, ItemListRequest.Builder, ItemListRequestOrBuilder> singleFieldBuilderV3 = this.itemListRequestBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(itemListRequest);
                } else if ((this.bitField0_ & 4) == 0 || (itemListRequest2 = this.itemListRequest_) == null || itemListRequest2 == ItemListRequest.getDefaultInstance()) {
                    this.itemListRequest_ = itemListRequest;
                } else {
                    getItemListRequestBuilder().mergeFrom(itemListRequest);
                }
                if (this.itemListRequest_ != null) {
                    this.bitField0_ |= 4;
                    onChanged();
                }
                return this;
            }

            public Builder mergeItemListResponse(ItemListResponse itemListResponse) {
                ItemListResponse itemListResponse2;
                SingleFieldBuilderV3<ItemListResponse, ItemListResponse.Builder, ItemListResponseOrBuilder> singleFieldBuilderV3 = this.itemListResponseBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(itemListResponse);
                } else if ((this.bitField0_ & 8) == 0 || (itemListResponse2 = this.itemListResponse_) == null || itemListResponse2 == ItemListResponse.getDefaultInstance()) {
                    this.itemListResponse_ = itemListResponse;
                } else {
                    getItemListResponseBuilder().mergeFrom(itemListResponse);
                }
                if (this.itemListResponse_ != null) {
                    this.bitField0_ |= 8;
                    onChanged();
                }
                return this;
            }

            public Builder mergeSessionCompletedNotification(SessionCompletedNotification sessionCompletedNotification) {
                SessionCompletedNotification sessionCompletedNotification2;
                SingleFieldBuilderV3<SessionCompletedNotification, SessionCompletedNotification.Builder, SessionCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.sessionCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(sessionCompletedNotification);
                } else if ((this.bitField0_ & 256) == 0 || (sessionCompletedNotification2 = this.sessionCompletedNotification_) == null || sessionCompletedNotification2 == SessionCompletedNotification.getDefaultInstance()) {
                    this.sessionCompletedNotification_ = sessionCompletedNotification;
                } else {
                    getSessionCompletedNotificationBuilder().mergeFrom(sessionCompletedNotification);
                }
                if (this.sessionCompletedNotification_ != null) {
                    this.bitField0_ |= 256;
                    onChanged();
                }
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder setArbitraryItemRequest(ArbitraryItemRequest.Builder builder) {
                SingleFieldBuilderV3<ArbitraryItemRequest, ArbitraryItemRequest.Builder, ArbitraryItemRequestOrBuilder> singleFieldBuilderV3 = this.arbitraryItemRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.arbitraryItemRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setArbitraryItemResponse(ArbitraryItemResponse.Builder builder) {
                SingleFieldBuilderV3<ArbitraryItemResponse, ArbitraryItemResponse.Builder, ArbitraryItemResponseOrBuilder> singleFieldBuilderV3 = this.arbitraryItemResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.arbitraryItemResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setCancelSessionRequest(CancelSessionRequest.Builder builder) {
                SingleFieldBuilderV3<CancelSessionRequest, CancelSessionRequest.Builder, CancelSessionRequestOrBuilder> singleFieldBuilderV3 = this.cancelSessionRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.cancelSessionRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setCancelSessionResponse(CancelSessionResponse.Builder builder) {
                SingleFieldBuilderV3<CancelSessionResponse, CancelSessionResponse.Builder, CancelSessionResponseOrBuilder> singleFieldBuilderV3 = this.cancelSessionResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.cancelSessionResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setItemDataRequest(ItemRequest.Builder builder) {
                SingleFieldBuilderV3<ItemRequest, ItemRequest.Builder, ItemRequestOrBuilder> singleFieldBuilderV3 = this.itemDataRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.itemDataRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setItemDataResponse(ItemResponse.Builder builder) {
                SingleFieldBuilderV3<ItemResponse, ItemResponse.Builder, ItemResponseOrBuilder> singleFieldBuilderV3 = this.itemDataResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.itemDataResponse_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setItemListRequest(ItemListRequest.Builder builder) {
                SingleFieldBuilderV3<ItemListRequest, ItemListRequest.Builder, ItemListRequestOrBuilder> singleFieldBuilderV3 = this.itemListRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.itemListRequest_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setItemListResponse(ItemListResponse.Builder builder) {
                SingleFieldBuilderV3<ItemListResponse, ItemListResponse.Builder, ItemListResponseOrBuilder> singleFieldBuilderV3 = this.itemListResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.itemListResponse_ = builder.build();
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

            public Builder setSessionCompletedNotification(SessionCompletedNotification.Builder builder) {
                SingleFieldBuilderV3<SessionCompletedNotification, SessionCompletedNotification.Builder, SessionCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.sessionCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.sessionCompletedNotification_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public GenericItemTransferService getDefaultInstanceForType() {
                return GenericItemTransferService.getDefaultInstance();
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

            public Builder setArbitraryItemRequest(ArbitraryItemRequest arbitraryItemRequest) {
                SingleFieldBuilderV3<ArbitraryItemRequest, ArbitraryItemRequest.Builder, ArbitraryItemRequestOrBuilder> singleFieldBuilderV3 = this.arbitraryItemRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    arbitraryItemRequest.getClass();
                    this.arbitraryItemRequest_ = arbitraryItemRequest;
                } else {
                    singleFieldBuilderV3.setMessage(arbitraryItemRequest);
                }
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            public Builder setArbitraryItemResponse(ArbitraryItemResponse arbitraryItemResponse) {
                SingleFieldBuilderV3<ArbitraryItemResponse, ArbitraryItemResponse.Builder, ArbitraryItemResponseOrBuilder> singleFieldBuilderV3 = this.arbitraryItemResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    arbitraryItemResponse.getClass();
                    this.arbitraryItemResponse_ = arbitraryItemResponse;
                } else {
                    singleFieldBuilderV3.setMessage(arbitraryItemResponse);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setCancelSessionRequest(CancelSessionRequest cancelSessionRequest) {
                SingleFieldBuilderV3<CancelSessionRequest, CancelSessionRequest.Builder, CancelSessionRequestOrBuilder> singleFieldBuilderV3 = this.cancelSessionRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    cancelSessionRequest.getClass();
                    this.cancelSessionRequest_ = cancelSessionRequest;
                } else {
                    singleFieldBuilderV3.setMessage(cancelSessionRequest);
                }
                this.bitField0_ |= 64;
                onChanged();
                return this;
            }

            public Builder setCancelSessionResponse(CancelSessionResponse cancelSessionResponse) {
                SingleFieldBuilderV3<CancelSessionResponse, CancelSessionResponse.Builder, CancelSessionResponseOrBuilder> singleFieldBuilderV3 = this.cancelSessionResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    cancelSessionResponse.getClass();
                    this.cancelSessionResponse_ = cancelSessionResponse;
                } else {
                    singleFieldBuilderV3.setMessage(cancelSessionResponse);
                }
                this.bitField0_ |= 128;
                onChanged();
                return this;
            }

            public Builder setItemDataRequest(ItemRequest itemRequest) {
                SingleFieldBuilderV3<ItemRequest, ItemRequest.Builder, ItemRequestOrBuilder> singleFieldBuilderV3 = this.itemDataRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    itemRequest.getClass();
                    this.itemDataRequest_ = itemRequest;
                } else {
                    singleFieldBuilderV3.setMessage(itemRequest);
                }
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setItemDataResponse(ItemResponse itemResponse) {
                SingleFieldBuilderV3<ItemResponse, ItemResponse.Builder, ItemResponseOrBuilder> singleFieldBuilderV3 = this.itemDataResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    itemResponse.getClass();
                    this.itemDataResponse_ = itemResponse;
                } else {
                    singleFieldBuilderV3.setMessage(itemResponse);
                }
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            public Builder setItemListRequest(ItemListRequest itemListRequest) {
                SingleFieldBuilderV3<ItemListRequest, ItemListRequest.Builder, ItemListRequestOrBuilder> singleFieldBuilderV3 = this.itemListRequestBuilder_;
                if (singleFieldBuilderV3 == null) {
                    itemListRequest.getClass();
                    this.itemListRequest_ = itemListRequest;
                } else {
                    singleFieldBuilderV3.setMessage(itemListRequest);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setItemListResponse(ItemListResponse itemListResponse) {
                SingleFieldBuilderV3<ItemListResponse, ItemListResponse.Builder, ItemListResponseOrBuilder> singleFieldBuilderV3 = this.itemListResponseBuilder_;
                if (singleFieldBuilderV3 == null) {
                    itemListResponse.getClass();
                    this.itemListResponse_ = itemListResponse;
                } else {
                    singleFieldBuilderV3.setMessage(itemListResponse);
                }
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            public Builder setSessionCompletedNotification(SessionCompletedNotification sessionCompletedNotification) {
                SingleFieldBuilderV3<SessionCompletedNotification, SessionCompletedNotification.Builder, SessionCompletedNotificationOrBuilder> singleFieldBuilderV3 = this.sessionCompletedNotificationBuilder_;
                if (singleFieldBuilderV3 == null) {
                    sessionCompletedNotification.getClass();
                    this.sessionCompletedNotification_ = sessionCompletedNotification;
                } else {
                    singleFieldBuilderV3.setMessage(sessionCompletedNotification);
                }
                this.bitField0_ |= 256;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof GenericItemTransferService) {
                    return mergeFrom((GenericItemTransferService) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(GenericItemTransferService genericItemTransferService) {
                if (genericItemTransferService == GenericItemTransferService.getDefaultInstance()) {
                    return this;
                }
                if (genericItemTransferService.hasArbitraryItemRequest()) {
                    mergeArbitraryItemRequest(genericItemTransferService.getArbitraryItemRequest());
                }
                if (genericItemTransferService.hasArbitraryItemResponse()) {
                    mergeArbitraryItemResponse(genericItemTransferService.getArbitraryItemResponse());
                }
                if (genericItemTransferService.hasItemListRequest()) {
                    mergeItemListRequest(genericItemTransferService.getItemListRequest());
                }
                if (genericItemTransferService.hasItemListResponse()) {
                    mergeItemListResponse(genericItemTransferService.getItemListResponse());
                }
                if (genericItemTransferService.hasItemDataRequest()) {
                    mergeItemDataRequest(genericItemTransferService.getItemDataRequest());
                }
                if (genericItemTransferService.hasItemDataResponse()) {
                    mergeItemDataResponse(genericItemTransferService.getItemDataResponse());
                }
                if (genericItemTransferService.hasCancelSessionRequest()) {
                    mergeCancelSessionRequest(genericItemTransferService.getCancelSessionRequest());
                }
                if (genericItemTransferService.hasCancelSessionResponse()) {
                    mergeCancelSessionResponse(genericItemTransferService.getCancelSessionResponse());
                }
                if (genericItemTransferService.hasSessionCompletedNotification()) {
                    mergeSessionCompletedNotification(genericItemTransferService.getSessionCompletedNotification());
                }
                mergeUnknownFields(genericItemTransferService.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public GenericItemTransferService getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public /* synthetic */ GenericItemTransferService(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        private GenericItemTransferService() {
            this.memoizedIsInitialized = (byte) -1;
        }

        public static GenericItemTransferService parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GenericItemTransferService) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GenericItemTransferService parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static GenericItemTransferService parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static GenericItemTransferService parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static GenericItemTransferService parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static GenericItemTransferService parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static GenericItemTransferService parseFrom(InputStream inputStream) {
            return (GenericItemTransferService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static GenericItemTransferService parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GenericItemTransferService) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static GenericItemTransferService parseFrom(CodedInputStream codedInputStream) {
            return (GenericItemTransferService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static GenericItemTransferService parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (GenericItemTransferService) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ItemListRequest extends GeneratedMessageV3 implements ItemListRequestOrBuilder {
        public static final int CONFIG_FIELD_NUMBER = 2;
        public static final int LIST_OFFSET_FIELD_NUMBER = 3;
        public static final int MAX_ITEM_REF_COUNT_FIELD_NUMBER = 4;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DataTypeConfig config_;
        private int listOffset_;
        private int maxItemRefCount_;
        private byte memoizedIsInitialized;
        private int sessionId_;
        private static final ItemListRequest DEFAULT_INSTANCE = new ItemListRequest();

        @Deprecated
        public static final Parser<ItemListRequest> PARSER = new AbstractParser<ItemListRequest>() { // from class: com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListRequest.1
            @Override // com.google.protobuf.Parser
            public ItemListRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ItemListRequest.newBuilder();
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

        private ItemListRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sessionId_ = 0;
            this.listOffset_ = 0;
            this.maxItemRefCount_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ItemListRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ItemListRequest_descriptor;
        }

        public static Builder newBuilder(ItemListRequest itemListRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(itemListRequest);
        }

        public static ItemListRequest parseDelimitedFrom(InputStream inputStream) {
            return (ItemListRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ItemListRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ItemListRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ItemListRequest)) {
                return super.equals(obj);
            }
            ItemListRequest itemListRequest = (ItemListRequest) obj;
            if (hasSessionId() != itemListRequest.hasSessionId()) {
                return false;
            }
            if ((hasSessionId() && getSessionId() != itemListRequest.getSessionId()) || hasConfig() != itemListRequest.hasConfig()) {
                return false;
            }
            if ((hasConfig() && !getConfig().equals(itemListRequest.getConfig())) || hasListOffset() != itemListRequest.hasListOffset()) {
                return false;
            }
            if ((!hasListOffset() || getListOffset() == itemListRequest.getListOffset()) && hasMaxItemRefCount() == itemListRequest.hasMaxItemRefCount()) {
                return (!hasMaxItemRefCount() || getMaxItemRefCount() == itemListRequest.getMaxItemRefCount()) && getUnknownFields().equals(itemListRequest.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListRequestOrBuilder
        public DataTypeConfig getConfig() {
            DataTypeConfig dataTypeConfig = this.config_;
            return dataTypeConfig == null ? DataTypeConfig.getDefaultInstance() : dataTypeConfig;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListRequestOrBuilder
        public DataTypeConfigOrBuilder getConfigOrBuilder() {
            DataTypeConfig dataTypeConfig = this.config_;
            return dataTypeConfig == null ? DataTypeConfig.getDefaultInstance() : dataTypeConfig;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListRequestOrBuilder
        public int getListOffset() {
            return this.listOffset_;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListRequestOrBuilder
        public int getMaxItemRefCount() {
            return this.maxItemRefCount_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ItemListRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.sessionId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(2, getConfig());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(3, this.listOffset_);
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeUInt32Size(4, this.maxItemRefCount_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListRequestOrBuilder
        public int getSessionId() {
            return this.sessionId_;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListRequestOrBuilder
        public boolean hasConfig() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListRequestOrBuilder
        public boolean hasListOffset() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListRequestOrBuilder
        public boolean hasMaxItemRefCount() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListRequestOrBuilder
        public boolean hasSessionId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSessionId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSessionId();
            }
            if (hasConfig()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getConfig().hashCode();
            }
            if (hasListOffset()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getListOffset();
            }
            if (hasMaxItemRefCount()) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getMaxItemRefCount();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ItemListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemListRequest.class, Builder.class);
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
            if (!hasConfig() || getConfig().isInitialized()) {
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
            return new ItemListRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.sessionId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeMessage(2, getConfig());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.listOffset_);
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(4, this.maxItemRefCount_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ItemListRequestOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<DataTypeConfig, DataTypeConfig.Builder, DataTypeConfigOrBuilder> configBuilder_;
            private DataTypeConfig config_;
            private int listOffset_;
            private int maxItemRefCount_;
            private int sessionId_;

            private Builder() {
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ItemListRequest itemListRequest) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    itemListRequest.sessionId_ = this.sessionId_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<DataTypeConfig, DataTypeConfig.Builder, DataTypeConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                    itemListRequest.config_ = singleFieldBuilderV3 == null ? this.config_ : (DataTypeConfig) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    itemListRequest.listOffset_ = this.listOffset_;
                    i14 |= 4;
                }
                if ((i15 & 8) != 0) {
                    itemListRequest.maxItemRefCount_ = this.maxItemRefCount_;
                    i14 |= 8;
                }
                itemListRequest.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<DataTypeConfig, DataTypeConfig.Builder, DataTypeConfigOrBuilder> getConfigFieldBuilder() {
                if (this.configBuilder_ == null) {
                    this.configBuilder_ = new SingleFieldBuilderV3<>(getConfig(), getParentForChildren(), isClean());
                    this.config_ = null;
                }
                return this.configBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ItemListRequest_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getConfigFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ItemListRequest build() {
                ItemListRequest itemListRequestBuildPartial = buildPartial();
                if (itemListRequestBuildPartial.isInitialized()) {
                    return itemListRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) itemListRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ItemListRequest buildPartial() {
                ItemListRequest itemListRequest = new ItemListRequest(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(itemListRequest);
                }
                onBuilt();
                return itemListRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sessionId_ = 0;
                this.config_ = null;
                SingleFieldBuilderV3<DataTypeConfig, DataTypeConfig.Builder, DataTypeConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configBuilder_ = null;
                }
                this.listOffset_ = 0;
                this.maxItemRefCount_ = 0;
                return this;
            }

            public Builder clearConfig() {
                this.bitField0_ &= -3;
                this.config_ = null;
                SingleFieldBuilderV3<DataTypeConfig, DataTypeConfig.Builder, DataTypeConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.configBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearListOffset() {
                this.bitField0_ &= -5;
                this.listOffset_ = 0;
                onChanged();
                return this;
            }

            public Builder clearMaxItemRefCount() {
                this.bitField0_ &= -9;
                this.maxItemRefCount_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSessionId() {
                this.bitField0_ &= -2;
                this.sessionId_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListRequestOrBuilder
            public DataTypeConfig getConfig() {
                SingleFieldBuilderV3<DataTypeConfig, DataTypeConfig.Builder, DataTypeConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypeConfig) singleFieldBuilderV3.getMessage();
                }
                DataTypeConfig dataTypeConfig = this.config_;
                return dataTypeConfig == null ? DataTypeConfig.getDefaultInstance() : dataTypeConfig;
            }

            public DataTypeConfig.Builder getConfigBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (DataTypeConfig.Builder) getConfigFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListRequestOrBuilder
            public DataTypeConfigOrBuilder getConfigOrBuilder() {
                SingleFieldBuilderV3<DataTypeConfig, DataTypeConfig.Builder, DataTypeConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypeConfigOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DataTypeConfig dataTypeConfig = this.config_;
                return dataTypeConfig == null ? DataTypeConfig.getDefaultInstance() : dataTypeConfig;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ItemListRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListRequestOrBuilder
            public int getListOffset() {
                return this.listOffset_;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListRequestOrBuilder
            public int getMaxItemRefCount() {
                return this.maxItemRefCount_;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListRequestOrBuilder
            public int getSessionId() {
                return this.sessionId_;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListRequestOrBuilder
            public boolean hasConfig() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListRequestOrBuilder
            public boolean hasListOffset() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListRequestOrBuilder
            public boolean hasMaxItemRefCount() {
                return (this.bitField0_ & 8) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListRequestOrBuilder
            public boolean hasSessionId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ItemListRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemListRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                return !hasConfig() || getConfig().isInitialized();
            }

            public Builder mergeConfig(DataTypeConfig dataTypeConfig) {
                DataTypeConfig dataTypeConfig2;
                SingleFieldBuilderV3<DataTypeConfig, DataTypeConfig.Builder, DataTypeConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dataTypeConfig);
                } else if ((this.bitField0_ & 2) == 0 || (dataTypeConfig2 = this.config_) == null || dataTypeConfig2 == DataTypeConfig.getDefaultInstance()) {
                    this.config_ = dataTypeConfig;
                } else {
                    getConfigBuilder().mergeFrom(dataTypeConfig);
                }
                if (this.config_ != null) {
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
                                if (tag == 8) {
                                    this.sessionId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getConfigFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.listOffset_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 32) {
                                    this.maxItemRefCount_ = codedInputStream.readUInt32();
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

            public Builder setConfig(DataTypeConfig.Builder builder) {
                SingleFieldBuilderV3<DataTypeConfig, DataTypeConfig.Builder, DataTypeConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.config_ = builder.build();
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

            public Builder setListOffset(int i14) {
                this.listOffset_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            public Builder setMaxItemRefCount(int i14) {
                this.maxItemRefCount_ = i14;
                this.bitField0_ |= 8;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSessionId(int i14) {
                this.sessionId_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ItemListRequest getDefaultInstanceForType() {
                return ItemListRequest.getDefaultInstance();
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

            public Builder setConfig(DataTypeConfig dataTypeConfig) {
                SingleFieldBuilderV3<DataTypeConfig, DataTypeConfig.Builder, DataTypeConfigOrBuilder> singleFieldBuilderV3 = this.configBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dataTypeConfig.getClass();
                    this.config_ = dataTypeConfig;
                } else {
                    singleFieldBuilderV3.setMessage(dataTypeConfig);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ItemListRequest) {
                    return mergeFrom((ItemListRequest) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(ItemListRequest itemListRequest) {
                if (itemListRequest == ItemListRequest.getDefaultInstance()) {
                    return this;
                }
                if (itemListRequest.hasSessionId()) {
                    setSessionId(itemListRequest.getSessionId());
                }
                if (itemListRequest.hasConfig()) {
                    mergeConfig(itemListRequest.getConfig());
                }
                if (itemListRequest.hasListOffset()) {
                    setListOffset(itemListRequest.getListOffset());
                }
                if (itemListRequest.hasMaxItemRefCount()) {
                    setMaxItemRefCount(itemListRequest.getMaxItemRefCount());
                }
                mergeUnknownFields(itemListRequest.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public ItemListRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ItemListRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemListRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ItemListRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ItemListRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ItemListRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ItemListRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ItemListRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public /* synthetic */ ItemListRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ItemListRequest parseFrom(InputStream inputStream) {
            return (ItemListRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        private ItemListRequest() {
            this.sessionId_ = 0;
            this.listOffset_ = 0;
            this.maxItemRefCount_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ItemListRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemListRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ItemListRequest parseFrom(CodedInputStream codedInputStream) {
            return (ItemListRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ItemListRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemListRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ItemListResponse extends GeneratedMessageV3 implements ItemListResponseOrBuilder {
        public static final int DATA_TYPE_STATUS_FIELD_NUMBER = 2;
        public static final int ITEMS_FIELD_NUMBER = 4;
        public static final int MAX_REQUEST_COUNT_FIELD_NUMBER = 5;
        public static final int NEXT_LIST_OFFSET_FIELD_NUMBER = 6;
        public static final int SESSION_ID_FIELD_NUMBER = 3;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DataTypeStatus dataTypeStatus_;
        private List<GenericItemReference> items_;
        private int maxRequestCount_;
        private byte memoizedIsInitialized;
        private int nextListOffset_;
        private int sessionId_;
        private int status_;
        private static final ItemListResponse DEFAULT_INSTANCE = new ItemListResponse();

        @Deprecated
        public static final Parser<ItemListResponse> PARSER = new AbstractParser<ItemListResponse>() { // from class: com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponse.1
            @Override // com.google.protobuf.Parser
            public ItemListResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ItemListResponse.newBuilder();
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

        private ItemListResponse() {
            this.sessionId_ = 0;
            this.maxRequestCount_ = 1;
            this.nextListOffset_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 1;
            this.items_ = Collections.EMPTY_LIST;
            this.maxRequestCount_ = 1;
        }

        public static ItemListResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ItemListResponse_descriptor;
        }

        public static Builder newBuilder(ItemListResponse itemListResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(itemListResponse);
        }

        public static ItemListResponse parseDelimitedFrom(InputStream inputStream) {
            return (ItemListResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ItemListResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ItemListResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ItemListResponse)) {
                return super.equals(obj);
            }
            ItemListResponse itemListResponse = (ItemListResponse) obj;
            if (hasStatus() != itemListResponse.hasStatus()) {
                return false;
            }
            if ((hasStatus() && this.status_ != itemListResponse.status_) || hasDataTypeStatus() != itemListResponse.hasDataTypeStatus()) {
                return false;
            }
            if ((hasDataTypeStatus() && !getDataTypeStatus().equals(itemListResponse.getDataTypeStatus())) || hasSessionId() != itemListResponse.hasSessionId()) {
                return false;
            }
            if ((hasSessionId() && getSessionId() != itemListResponse.getSessionId()) || !getItemsList().equals(itemListResponse.getItemsList()) || hasMaxRequestCount() != itemListResponse.hasMaxRequestCount()) {
                return false;
            }
            if ((!hasMaxRequestCount() || getMaxRequestCount() == itemListResponse.getMaxRequestCount()) && hasNextListOffset() == itemListResponse.hasNextListOffset()) {
                return (!hasNextListOffset() || getNextListOffset() == itemListResponse.getNextListOffset()) && getUnknownFields().equals(itemListResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
        public DataTypeStatus getDataTypeStatus() {
            DataTypeStatus dataTypeStatus = this.dataTypeStatus_;
            return dataTypeStatus == null ? DataTypeStatus.getDefaultInstance() : dataTypeStatus;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
        public DataTypeStatusOrBuilder getDataTypeStatusOrBuilder() {
            DataTypeStatus dataTypeStatus = this.dataTypeStatus_;
            return dataTypeStatus == null ? DataTypeStatus.getDefaultInstance() : dataTypeStatus;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
        public GenericItemReference getItems(int i14) {
            return this.items_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
        public int getItemsCount() {
            return this.items_.size();
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
        public List<GenericItemReference> getItemsList() {
            return this.items_;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
        public GenericItemReferenceOrBuilder getItemsOrBuilder(int i14) {
            return this.items_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
        public List<? extends GenericItemReferenceOrBuilder> getItemsOrBuilderList() {
            return this.items_;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
        public int getMaxRequestCount() {
            return this.maxRequestCount_;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
        public int getNextListOffset() {
            return this.nextListOffset_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ItemListResponse> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getDataTypeStatus());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(3, this.sessionId_);
            }
            for (int i15 = 0; i15 < this.items_.size(); i15++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(4, this.items_.get(i15));
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(5, this.maxRequestCount_);
            }
            if ((this.bitField0_ & 16) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(6, this.nextListOffset_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
        public int getSessionId() {
            return this.sessionId_;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.SUCCESS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
        public boolean hasDataTypeStatus() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
        public boolean hasMaxRequestCount() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
        public boolean hasNextListOffset() {
            return (this.bitField0_ & 16) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
        public boolean hasSessionId() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
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
            if (hasDataTypeStatus()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getDataTypeStatus().hashCode();
            }
            if (hasSessionId()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getSessionId();
            }
            if (getItemsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getItemsList().hashCode();
            }
            if (hasMaxRequestCount()) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getMaxRequestCount();
            }
            if (hasNextListOffset()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getNextListOffset();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ItemListResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemListResponse.class, Builder.class);
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
            if (hasDataTypeStatus() && !getDataTypeStatus().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i14 = 0; i14 < getItemsCount(); i14++) {
                if (!getItems(i14).isInitialized()) {
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
            return new ItemListResponse();
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
                codedOutputStream.writeMessage(2, getDataTypeStatus());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.sessionId_);
            }
            for (int i14 = 0; i14 < this.items_.size(); i14++) {
                codedOutputStream.writeMessage(4, this.items_.get(i14));
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(5, this.maxRequestCount_);
            }
            if ((this.bitField0_ & 16) != 0) {
                codedOutputStream.writeUInt32(6, this.nextListOffset_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ItemListResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> dataTypeStatusBuilder_;
            private DataTypeStatus dataTypeStatus_;
            private RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> itemsBuilder_;
            private List<GenericItemReference> items_;
            private int maxRequestCount_;
            private int nextListOffset_;
            private int sessionId_;
            private int status_;

            private Builder() {
                this.status_ = 1;
                this.items_ = Collections.EMPTY_LIST;
                this.maxRequestCount_ = 1;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ItemListResponse itemListResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    itemListResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                    itemListResponse.dataTypeStatus_ = singleFieldBuilderV3 == null ? this.dataTypeStatus_ : (DataTypeStatus) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    itemListResponse.sessionId_ = this.sessionId_;
                    i14 |= 4;
                }
                if ((i15 & 16) != 0) {
                    itemListResponse.maxRequestCount_ = this.maxRequestCount_;
                    i14 |= 8;
                }
                if ((i15 & 32) != 0) {
                    itemListResponse.nextListOffset_ = this.nextListOffset_;
                    i14 |= 16;
                }
                itemListResponse.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(ItemListResponse itemListResponse) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    itemListResponse.items_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 8) != 0) {
                    this.items_ = Collections.unmodifiableList(this.items_);
                    this.bitField0_ &= -9;
                }
                itemListResponse.items_ = this.items_;
            }

            private void ensureItemsIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.items_ = new ArrayList(this.items_);
                    this.bitField0_ |= 8;
                }
            }

            private SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> getDataTypeStatusFieldBuilder() {
                if (this.dataTypeStatusBuilder_ == null) {
                    this.dataTypeStatusBuilder_ = new SingleFieldBuilderV3<>(getDataTypeStatus(), getParentForChildren(), isClean());
                    this.dataTypeStatus_ = null;
                }
                return this.dataTypeStatusBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ItemListResponse_descriptor;
            }

            private RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> getItemsFieldBuilder() {
                if (this.itemsBuilder_ == null) {
                    this.itemsBuilder_ = new RepeatedFieldBuilderV3<>(this.items_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                    this.items_ = null;
                }
                return this.itemsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getDataTypeStatusFieldBuilder();
                    getItemsFieldBuilder();
                }
            }

            public Builder addAllItems(Iterable<? extends GenericItemReference> iterable) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureItemsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.items_);
                onChanged();
                return this;
            }

            public Builder addItems(GenericItemReference.Builder builder) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureItemsIsMutable();
                this.items_.add(builder.build());
                onChanged();
                return this;
            }

            public GenericItemReference.Builder addItemsBuilder() {
                return (GenericItemReference.Builder) getItemsFieldBuilder().addBuilder(GenericItemReference.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ItemListResponse build() {
                ItemListResponse itemListResponseBuildPartial = buildPartial();
                if (itemListResponseBuildPartial.isInitialized()) {
                    return itemListResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) itemListResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ItemListResponse buildPartial() {
                ItemListResponse itemListResponse = new ItemListResponse(this);
                buildPartialRepeatedFields(itemListResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(itemListResponse);
                }
                onBuilt();
                return itemListResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 1;
                this.dataTypeStatus_ = null;
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.dataTypeStatusBuilder_ = null;
                }
                this.sessionId_ = 0;
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.items_ = Collections.EMPTY_LIST;
                } else {
                    this.items_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -9;
                this.maxRequestCount_ = 1;
                this.nextListOffset_ = 0;
                return this;
            }

            public Builder clearDataTypeStatus() {
                this.bitField0_ &= -3;
                this.dataTypeStatus_ = null;
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.dataTypeStatusBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearItems() {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.items_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearMaxRequestCount() {
                this.bitField0_ &= -17;
                this.maxRequestCount_ = 1;
                onChanged();
                return this;
            }

            public Builder clearNextListOffset() {
                this.bitField0_ &= -33;
                this.nextListOffset_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSessionId() {
                this.bitField0_ &= -5;
                this.sessionId_ = 0;
                onChanged();
                return this;
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

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
            public DataTypeStatus getDataTypeStatus() {
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypeStatus) singleFieldBuilderV3.getMessage();
                }
                DataTypeStatus dataTypeStatus = this.dataTypeStatus_;
                return dataTypeStatus == null ? DataTypeStatus.getDefaultInstance() : dataTypeStatus;
            }

            public DataTypeStatus.Builder getDataTypeStatusBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (DataTypeStatus.Builder) getDataTypeStatusFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
            public DataTypeStatusOrBuilder getDataTypeStatusOrBuilder() {
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypeStatusOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DataTypeStatus dataTypeStatus = this.dataTypeStatus_;
                return dataTypeStatus == null ? DataTypeStatus.getDefaultInstance() : dataTypeStatus;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ItemListResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
            public GenericItemReference getItems(int i14) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.items_.get(i14) : (GenericItemReference) repeatedFieldBuilderV3.getMessage(i14);
            }

            public GenericItemReference.Builder getItemsBuilder(int i14) {
                return (GenericItemReference.Builder) getItemsFieldBuilder().getBuilder(i14);
            }

            public List<GenericItemReference.Builder> getItemsBuilderList() {
                return getItemsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
            public int getItemsCount() {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.items_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
            public List<GenericItemReference> getItemsList() {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.items_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
            public GenericItemReferenceOrBuilder getItemsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.items_.get(i14) : (GenericItemReferenceOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
            public List<? extends GenericItemReferenceOrBuilder> getItemsOrBuilderList() {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.items_);
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
            public int getMaxRequestCount() {
                return this.maxRequestCount_;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
            public int getNextListOffset() {
                return this.nextListOffset_;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
            public int getSessionId() {
                return this.sessionId_;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.SUCCESS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
            public boolean hasDataTypeStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
            public boolean hasMaxRequestCount() {
                return (this.bitField0_ & 16) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
            public boolean hasNextListOffset() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
            public boolean hasSessionId() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ItemListResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemListResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasStatus()) {
                    return false;
                }
                if (hasDataTypeStatus() && !getDataTypeStatus().isInitialized()) {
                    return false;
                }
                for (int i14 = 0; i14 < getItemsCount(); i14++) {
                    if (!getItems(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeDataTypeStatus(DataTypeStatus dataTypeStatus) {
                DataTypeStatus dataTypeStatus2;
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dataTypeStatus);
                } else if ((this.bitField0_ & 2) == 0 || (dataTypeStatus2 = this.dataTypeStatus_) == null || dataTypeStatus2 == DataTypeStatus.getDefaultInstance()) {
                    this.dataTypeStatus_ = dataTypeStatus;
                } else {
                    getDataTypeStatusBuilder().mergeFrom(dataTypeStatus);
                }
                if (this.dataTypeStatus_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeFrom(ItemListResponse itemListResponse) {
                if (itemListResponse == ItemListResponse.getDefaultInstance()) {
                    return this;
                }
                if (itemListResponse.hasStatus()) {
                    setStatus(itemListResponse.getStatus());
                }
                if (itemListResponse.hasDataTypeStatus()) {
                    mergeDataTypeStatus(itemListResponse.getDataTypeStatus());
                }
                if (itemListResponse.hasSessionId()) {
                    setSessionId(itemListResponse.getSessionId());
                }
                if (this.itemsBuilder_ == null) {
                    if (!itemListResponse.items_.isEmpty()) {
                        if (this.items_.isEmpty()) {
                            this.items_ = itemListResponse.items_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureItemsIsMutable();
                            this.items_.addAll(itemListResponse.items_);
                        }
                        onChanged();
                    }
                } else if (!itemListResponse.items_.isEmpty()) {
                    boolean zIsEmpty = this.itemsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.itemsBuilder_ = null;
                        this.items_ = itemListResponse.items_;
                        this.bitField0_ &= -9;
                        this.itemsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getItemsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(itemListResponse.items_);
                    }
                }
                if (itemListResponse.hasMaxRequestCount()) {
                    setMaxRequestCount(itemListResponse.getMaxRequestCount());
                }
                if (itemListResponse.hasNextListOffset()) {
                    setNextListOffset(itemListResponse.getNextListOffset());
                }
                mergeUnknownFields(itemListResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeItems(int i14) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureItemsIsMutable();
                this.items_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setDataTypeStatus(DataTypeStatus.Builder builder) {
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.dataTypeStatus_ = builder.build();
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

            public Builder setItems(int i14, GenericItemReference.Builder builder) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureItemsIsMutable();
                this.items_.set(i14, builder.build());
                onChanged();
                return this;
            }

            public Builder setMaxRequestCount(int i14) {
                this.maxRequestCount_ = i14;
                this.bitField0_ |= 16;
                onChanged();
                return this;
            }

            public Builder setNextListOffset(int i14) {
                this.nextListOffset_ = i14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSessionId(int i14) {
                this.sessionId_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
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
            public ItemListResponse getDefaultInstanceForType() {
                return ItemListResponse.getDefaultInstance();
            }

            public GenericItemReference.Builder addItemsBuilder(int i14) {
                return (GenericItemReference.Builder) getItemsFieldBuilder().addBuilder(i14, GenericItemReference.getDefaultInstance());
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
                this.items_ = Collections.EMPTY_LIST;
                this.maxRequestCount_ = 1;
                maybeForceBuilderInitialization();
            }

            public Builder addItems(int i14, GenericItemReference genericItemReference) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    genericItemReference.getClass();
                    ensureItemsIsMutable();
                    this.items_.add(i14, genericItemReference);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, genericItemReference);
                return this;
            }

            public Builder setDataTypeStatus(DataTypeStatus dataTypeStatus) {
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dataTypeStatus.getClass();
                    this.dataTypeStatus_ = dataTypeStatus;
                } else {
                    singleFieldBuilderV3.setMessage(dataTypeStatus);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setItems(int i14, GenericItemReference genericItemReference) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    genericItemReference.getClass();
                    ensureItemsIsMutable();
                    this.items_.set(i14, genericItemReference);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, genericItemReference);
                return this;
            }

            public Builder addItems(GenericItemReference genericItemReference) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    genericItemReference.getClass();
                    ensureItemsIsMutable();
                    this.items_.add(genericItemReference);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(genericItemReference);
                return this;
            }

            public Builder addItems(int i14, GenericItemReference.Builder builder) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureItemsIsMutable();
                    this.items_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ItemListResponse) {
                    return mergeFrom((ItemListResponse) message);
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
                                    if (Status.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getDataTypeStatusFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.sessionId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    GenericItemReference genericItemReference = (GenericItemReference) codedInputStream.readMessage(GenericItemReference.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureItemsIsMutable();
                                        this.items_.add(genericItemReference);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(genericItemReference);
                                    }
                                } else if (tag == 40) {
                                    this.maxRequestCount_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 16;
                                } else if (tag != 48) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.nextListOffset_ = codedInputStream.readUInt32();
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
        public ItemListResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ItemListResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemListResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ItemListResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ItemListResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ItemListResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ItemListResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ItemListResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ItemListResponse parseFrom(InputStream inputStream) {
            return (ItemListResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ItemListResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemListResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ItemListResponse parseFrom(CodedInputStream codedInputStream) {
            return (ItemListResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ItemListResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemListResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private ItemListResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 1;
            this.sessionId_ = 0;
            this.maxRequestCount_ = 1;
            this.nextListOffset_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public enum Status implements ProtocolMessageEnum {
            SUCCESS(1),
            NO_ITEMS(2),
            ABORT(3),
            ERROR(4),
            INVALID_SESSION_ID(5),
            INVALID_LIST_OFFSET(6),
            WRONG_SESSION_TYPE(7),
            UNSUPPORTED_DATA_TYPE(8),
            UNSUPPORTED_REQUEST_TYPE(9),
            DATA_TYPE_IS_BUSY(10),
            SYSTEM_IS_BUSY(11),
            TRANSFER_LIMIT(12);

            public static final int ABORT_VALUE = 3;
            public static final int DATA_TYPE_IS_BUSY_VALUE = 10;
            public static final int ERROR_VALUE = 4;
            public static final int INVALID_LIST_OFFSET_VALUE = 6;
            public static final int INVALID_SESSION_ID_VALUE = 5;
            public static final int NO_ITEMS_VALUE = 2;
            public static final int SUCCESS_VALUE = 1;
            public static final int SYSTEM_IS_BUSY_VALUE = 11;
            public static final int TRANSFER_LIMIT_VALUE = 12;
            public static final int UNSUPPORTED_DATA_TYPE_VALUE = 8;
            public static final int UNSUPPORTED_REQUEST_TYPE_VALUE = 9;
            public static final int WRONG_SESSION_TYPE_VALUE = 7;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIGenericItemTransferProto.ItemListResponse.Status.1
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
                switch (i14) {
                    case 1:
                        return SUCCESS;
                    case 2:
                        return NO_ITEMS;
                    case 3:
                        return ABORT;
                    case 4:
                        return ERROR;
                    case 5:
                        return INVALID_SESSION_ID;
                    case 6:
                        return INVALID_LIST_OFFSET;
                    case 7:
                        return WRONG_SESSION_TYPE;
                    case 8:
                        return UNSUPPORTED_DATA_TYPE;
                    case 9:
                        return UNSUPPORTED_REQUEST_TYPE;
                    case 10:
                        return DATA_TYPE_IS_BUSY;
                    case 11:
                        return SYSTEM_IS_BUSY;
                    case 12:
                        return TRANSFER_LIMIT;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ItemListResponse.getDescriptor().getEnumTypes().get(0);
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

        public /* synthetic */ ItemListResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class ItemRequest extends GeneratedMessageV3 implements ItemRequestOrBuilder {
        public static final int ITEMS_FIELD_NUMBER = 6;
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private List<GenericItemReference> items_;
        private byte memoizedIsInitialized;
        private int sessionId_;
        private static final ItemRequest DEFAULT_INSTANCE = new ItemRequest();

        @Deprecated
        public static final Parser<ItemRequest> PARSER = new AbstractParser<ItemRequest>() { // from class: com.garmin.proto.generated.GDIGenericItemTransferProto.ItemRequest.1
            @Override // com.google.protobuf.Parser
            public ItemRequest parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ItemRequest.newBuilder();
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

        private ItemRequest() {
            this.sessionId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.items_ = Collections.EMPTY_LIST;
        }

        public static ItemRequest getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ItemRequest_descriptor;
        }

        public static Builder newBuilder(ItemRequest itemRequest) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(itemRequest);
        }

        public static ItemRequest parseDelimitedFrom(InputStream inputStream) {
            return (ItemRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ItemRequest parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ItemRequest> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ItemRequest)) {
                return super.equals(obj);
            }
            ItemRequest itemRequest = (ItemRequest) obj;
            if (hasSessionId() != itemRequest.hasSessionId()) {
                return false;
            }
            return (!hasSessionId() || getSessionId() == itemRequest.getSessionId()) && getItemsList().equals(itemRequest.getItemsList()) && getUnknownFields().equals(itemRequest.getUnknownFields());
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemRequestOrBuilder
        public GenericItemReference getItems(int i14) {
            return this.items_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemRequestOrBuilder
        public int getItemsCount() {
            return this.items_.size();
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemRequestOrBuilder
        public List<GenericItemReference> getItemsList() {
            return this.items_;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemRequestOrBuilder
        public GenericItemReferenceOrBuilder getItemsOrBuilder(int i14) {
            return this.items_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemRequestOrBuilder
        public List<? extends GenericItemReferenceOrBuilder> getItemsOrBuilderList() {
            return this.items_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ItemRequest> getParserForType() {
            return PARSER;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.sessionId_) : 0;
            for (int i15 = 0; i15 < this.items_.size(); i15++) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(6, this.items_.get(i15));
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemRequestOrBuilder
        public int getSessionId() {
            return this.sessionId_;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemRequestOrBuilder
        public boolean hasSessionId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSessionId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSessionId();
            }
            if (getItemsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getItemsList().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ItemRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemRequest.class, Builder.class);
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
            for (int i14 = 0; i14 < getItemsCount(); i14++) {
                if (!getItems(i14).isInitialized()) {
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
            return new ItemRequest();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.sessionId_);
            }
            for (int i14 = 0; i14 < this.items_.size(); i14++) {
                codedOutputStream.writeMessage(6, this.items_.get(i14));
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ItemRequestOrBuilder {
            private int bitField0_;
            private RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> itemsBuilder_;
            private List<GenericItemReference> items_;
            private int sessionId_;

            private Builder() {
                this.items_ = Collections.EMPTY_LIST;
            }

            private void buildPartial0(ItemRequest itemRequest) {
                int i14 = 1;
                if ((this.bitField0_ & 1) != 0) {
                    itemRequest.sessionId_ = this.sessionId_;
                } else {
                    i14 = 0;
                }
                itemRequest.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(ItemRequest itemRequest) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    itemRequest.items_ = repeatedFieldBuilderV3.build();
                    return;
                }
                if ((this.bitField0_ & 2) != 0) {
                    this.items_ = Collections.unmodifiableList(this.items_);
                    this.bitField0_ &= -3;
                }
                itemRequest.items_ = this.items_;
            }

            private void ensureItemsIsMutable() {
                if ((this.bitField0_ & 2) == 0) {
                    this.items_ = new ArrayList(this.items_);
                    this.bitField0_ |= 2;
                }
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ItemRequest_descriptor;
            }

            private RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> getItemsFieldBuilder() {
                if (this.itemsBuilder_ == null) {
                    this.itemsBuilder_ = new RepeatedFieldBuilderV3<>(this.items_, (this.bitField0_ & 2) != 0, getParentForChildren(), isClean());
                    this.items_ = null;
                }
                return this.itemsBuilder_;
            }

            public Builder addAllItems(Iterable<? extends GenericItemReference> iterable) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureItemsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.items_);
                onChanged();
                return this;
            }

            public Builder addItems(GenericItemReference.Builder builder) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureItemsIsMutable();
                this.items_.add(builder.build());
                onChanged();
                return this;
            }

            public GenericItemReference.Builder addItemsBuilder() {
                return (GenericItemReference.Builder) getItemsFieldBuilder().addBuilder(GenericItemReference.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ItemRequest build() {
                ItemRequest itemRequestBuildPartial = buildPartial();
                if (itemRequestBuildPartial.isInitialized()) {
                    return itemRequestBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) itemRequestBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ItemRequest buildPartial() {
                ItemRequest itemRequest = new ItemRequest(this);
                buildPartialRepeatedFields(itemRequest);
                if (this.bitField0_ != 0) {
                    buildPartial0(itemRequest);
                }
                onBuilt();
                return itemRequest;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sessionId_ = 0;
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.items_ = Collections.EMPTY_LIST;
                } else {
                    this.items_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -3;
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearItems() {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.items_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -3;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSessionId() {
                this.bitField0_ &= -2;
                this.sessionId_ = 0;
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
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ItemRequest_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemRequestOrBuilder
            public GenericItemReference getItems(int i14) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.items_.get(i14) : (GenericItemReference) repeatedFieldBuilderV3.getMessage(i14);
            }

            public GenericItemReference.Builder getItemsBuilder(int i14) {
                return (GenericItemReference.Builder) getItemsFieldBuilder().getBuilder(i14);
            }

            public List<GenericItemReference.Builder> getItemsBuilderList() {
                return getItemsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemRequestOrBuilder
            public int getItemsCount() {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.items_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemRequestOrBuilder
            public List<GenericItemReference> getItemsList() {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.items_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemRequestOrBuilder
            public GenericItemReferenceOrBuilder getItemsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.items_.get(i14) : (GenericItemReferenceOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemRequestOrBuilder
            public List<? extends GenericItemReferenceOrBuilder> getItemsOrBuilderList() {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.items_);
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemRequestOrBuilder
            public int getSessionId() {
                return this.sessionId_;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemRequestOrBuilder
            public boolean hasSessionId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ItemRequest_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemRequest.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                for (int i14 = 0; i14 < getItemsCount(); i14++) {
                    if (!getItems(i14).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeFrom(ItemRequest itemRequest) {
                if (itemRequest == ItemRequest.getDefaultInstance()) {
                    return this;
                }
                if (itemRequest.hasSessionId()) {
                    setSessionId(itemRequest.getSessionId());
                }
                if (this.itemsBuilder_ == null) {
                    if (!itemRequest.items_.isEmpty()) {
                        if (this.items_.isEmpty()) {
                            this.items_ = itemRequest.items_;
                            this.bitField0_ &= -3;
                        } else {
                            ensureItemsIsMutable();
                            this.items_.addAll(itemRequest.items_);
                        }
                        onChanged();
                    }
                } else if (!itemRequest.items_.isEmpty()) {
                    boolean zIsEmpty = this.itemsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.itemsBuilder_ = null;
                        this.items_ = itemRequest.items_;
                        this.bitField0_ &= -3;
                        this.itemsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getItemsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(itemRequest.items_);
                    }
                }
                mergeUnknownFields(itemRequest.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeItems(int i14) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureItemsIsMutable();
                this.items_.remove(i14);
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setItems(int i14, GenericItemReference.Builder builder) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureItemsIsMutable();
                this.items_.set(i14, builder.build());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSessionId(int i14) {
                this.sessionId_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public ItemRequest getDefaultInstanceForType() {
                return ItemRequest.getDefaultInstance();
            }

            public /* synthetic */ Builder(GeneratedMessageV3.BuilderParent builderParent, int i14) {
                this(builderParent);
            }

            public /* synthetic */ Builder(int i14) {
                this();
            }

            private Builder(GeneratedMessageV3.BuilderParent builderParent) {
                super(builderParent);
                this.items_ = Collections.EMPTY_LIST;
            }

            public GenericItemReference.Builder addItemsBuilder(int i14) {
                return (GenericItemReference.Builder) getItemsFieldBuilder().addBuilder(i14, GenericItemReference.getDefaultInstance());
            }

            public Builder addItems(int i14, GenericItemReference genericItemReference) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    genericItemReference.getClass();
                    ensureItemsIsMutable();
                    this.items_.add(i14, genericItemReference);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, genericItemReference);
                return this;
            }

            public Builder setItems(int i14, GenericItemReference genericItemReference) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    genericItemReference.getClass();
                    ensureItemsIsMutable();
                    this.items_.set(i14, genericItemReference);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, genericItemReference);
                return this;
            }

            public Builder addItems(GenericItemReference genericItemReference) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    genericItemReference.getClass();
                    ensureItemsIsMutable();
                    this.items_.add(genericItemReference);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(genericItemReference);
                return this;
            }

            public Builder addItems(int i14, GenericItemReference.Builder builder) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureItemsIsMutable();
                    this.items_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ItemRequest) {
                    return mergeFrom((ItemRequest) message);
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
                                    this.sessionId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag != 50) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    GenericItemReference genericItemReference = (GenericItemReference) codedInputStream.readMessage(GenericItemReference.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureItemsIsMutable();
                                        this.items_.add(genericItemReference);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(genericItemReference);
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
        public ItemRequest getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ItemRequest parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemRequest) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ItemRequest parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ItemRequest parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ItemRequest parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ItemRequest parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ItemRequest parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private ItemRequest(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sessionId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static ItemRequest parseFrom(InputStream inputStream) {
            return (ItemRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ItemRequest parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemRequest) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public /* synthetic */ ItemRequest(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static ItemRequest parseFrom(CodedInputStream codedInputStream) {
            return (ItemRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ItemRequest parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemRequest) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static final class ItemResponse extends GeneratedMessageV3 implements ItemResponseOrBuilder {
        public static final int DATA_TYPE_STATUS_FIELD_NUMBER = 2;
        public static final int INVALID_ITEMS_FIELD_NUMBER = 5;
        public static final int ITEMS_FIELD_NUMBER = 4;
        public static final int MAX_REQUEST_COUNT_FIELD_NUMBER = 6;
        public static final int SESSION_ID_FIELD_NUMBER = 3;
        public static final int STATUS_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DataTypeStatus dataTypeStatus_;
        private List<GenericItemReference> invalidItems_;
        private List<GenericItem> items_;
        private int maxRequestCount_;
        private byte memoizedIsInitialized;
        private int sessionId_;
        private int status_;
        private static final ItemResponse DEFAULT_INSTANCE = new ItemResponse();

        @Deprecated
        public static final Parser<ItemResponse> PARSER = new AbstractParser<ItemResponse>() { // from class: com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponse.1
            @Override // com.google.protobuf.Parser
            public ItemResponse parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = ItemResponse.newBuilder();
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

        private ItemResponse() {
            this.sessionId_ = 0;
            this.maxRequestCount_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.status_ = 1;
            List list = Collections.EMPTY_LIST;
            this.items_ = list;
            this.invalidItems_ = list;
        }

        public static ItemResponse getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ItemResponse_descriptor;
        }

        public static Builder newBuilder(ItemResponse itemResponse) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(itemResponse);
        }

        public static ItemResponse parseDelimitedFrom(InputStream inputStream) {
            return (ItemResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static ItemResponse parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<ItemResponse> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof ItemResponse)) {
                return super.equals(obj);
            }
            ItemResponse itemResponse = (ItemResponse) obj;
            if (hasStatus() != itemResponse.hasStatus()) {
                return false;
            }
            if ((hasStatus() && this.status_ != itemResponse.status_) || hasDataTypeStatus() != itemResponse.hasDataTypeStatus()) {
                return false;
            }
            if ((hasDataTypeStatus() && !getDataTypeStatus().equals(itemResponse.getDataTypeStatus())) || hasSessionId() != itemResponse.hasSessionId()) {
                return false;
            }
            if ((!hasSessionId() || getSessionId() == itemResponse.getSessionId()) && getItemsList().equals(itemResponse.getItemsList()) && getInvalidItemsList().equals(itemResponse.getInvalidItemsList()) && hasMaxRequestCount() == itemResponse.hasMaxRequestCount()) {
                return (!hasMaxRequestCount() || getMaxRequestCount() == itemResponse.getMaxRequestCount()) && getUnknownFields().equals(itemResponse.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
        public DataTypeStatus getDataTypeStatus() {
            DataTypeStatus dataTypeStatus = this.dataTypeStatus_;
            return dataTypeStatus == null ? DataTypeStatus.getDefaultInstance() : dataTypeStatus;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
        public DataTypeStatusOrBuilder getDataTypeStatusOrBuilder() {
            DataTypeStatus dataTypeStatus = this.dataTypeStatus_;
            return dataTypeStatus == null ? DataTypeStatus.getDefaultInstance() : dataTypeStatus;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
        public GenericItemReference getInvalidItems(int i14) {
            return this.invalidItems_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
        public int getInvalidItemsCount() {
            return this.invalidItems_.size();
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
        public List<GenericItemReference> getInvalidItemsList() {
            return this.invalidItems_;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
        public GenericItemReferenceOrBuilder getInvalidItemsOrBuilder(int i14) {
            return this.invalidItems_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
        public List<? extends GenericItemReferenceOrBuilder> getInvalidItemsOrBuilderList() {
            return this.invalidItems_;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
        public GenericItem getItems(int i14) {
            return this.items_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
        public int getItemsCount() {
            return this.items_.size();
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
        public List<GenericItem> getItemsList() {
            return this.items_;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
        public GenericItemOrBuilder getItemsOrBuilder(int i14) {
            return this.items_.get(i14);
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
        public List<? extends GenericItemOrBuilder> getItemsOrBuilderList() {
            return this.items_;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
        public int getMaxRequestCount() {
            return this.maxRequestCount_;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<ItemResponse> getParserForType() {
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
                iComputeEnumSize += CodedOutputStream.computeMessageSize(2, getDataTypeStatus());
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(3, this.sessionId_);
            }
            for (int i15 = 0; i15 < this.items_.size(); i15++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(4, this.items_.get(i15));
            }
            for (int i16 = 0; i16 < this.invalidItems_.size(); i16++) {
                iComputeEnumSize += CodedOutputStream.computeMessageSize(5, this.invalidItems_.get(i16));
            }
            if ((this.bitField0_ & 8) != 0) {
                iComputeEnumSize += CodedOutputStream.computeUInt32Size(6, this.maxRequestCount_);
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeEnumSize;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
        public int getSessionId() {
            return this.sessionId_;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
        public Status getStatus() {
            Status statusForNumber = Status.forNumber(this.status_);
            return statusForNumber == null ? Status.SUCCESS : statusForNumber;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
        public boolean hasDataTypeStatus() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
        public boolean hasMaxRequestCount() {
            return (this.bitField0_ & 8) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
        public boolean hasSessionId() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
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
            if (hasDataTypeStatus()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + getDataTypeStatus().hashCode();
            }
            if (hasSessionId()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getSessionId();
            }
            if (getItemsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 4, 53) + getItemsList().hashCode();
            }
            if (getInvalidItemsCount() > 0) {
                iHashCode = e5.c(iHashCode, 37, 5, 53) + getInvalidItemsList().hashCode();
            }
            if (hasMaxRequestCount()) {
                iHashCode = e5.c(iHashCode, 37, 6, 53) + getMaxRequestCount();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ItemResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemResponse.class, Builder.class);
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
            if (hasDataTypeStatus() && !getDataTypeStatus().isInitialized()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            for (int i14 = 0; i14 < getItemsCount(); i14++) {
                if (!getItems(i14).isInitialized()) {
                    this.memoizedIsInitialized = (byte) 0;
                    return false;
                }
            }
            for (int i15 = 0; i15 < getInvalidItemsCount(); i15++) {
                if (!getInvalidItems(i15).isInitialized()) {
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
            return new ItemResponse();
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
                codedOutputStream.writeMessage(2, getDataTypeStatus());
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeUInt32(3, this.sessionId_);
            }
            for (int i14 = 0; i14 < this.items_.size(); i14++) {
                codedOutputStream.writeMessage(4, this.items_.get(i14));
            }
            for (int i15 = 0; i15 < this.invalidItems_.size(); i15++) {
                codedOutputStream.writeMessage(5, this.invalidItems_.get(i15));
            }
            if ((this.bitField0_ & 8) != 0) {
                codedOutputStream.writeUInt32(6, this.maxRequestCount_);
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements ItemResponseOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> dataTypeStatusBuilder_;
            private DataTypeStatus dataTypeStatus_;
            private RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> invalidItemsBuilder_;
            private List<GenericItemReference> invalidItems_;
            private RepeatedFieldBuilderV3<GenericItem, GenericItem.Builder, GenericItemOrBuilder> itemsBuilder_;
            private List<GenericItem> items_;
            private int maxRequestCount_;
            private int sessionId_;
            private int status_;

            private Builder() {
                this.status_ = 1;
                List list = Collections.EMPTY_LIST;
                this.items_ = list;
                this.invalidItems_ = list;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(ItemResponse itemResponse) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    itemResponse.status_ = this.status_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                    itemResponse.dataTypeStatus_ = singleFieldBuilderV3 == null ? this.dataTypeStatus_ : (DataTypeStatus) singleFieldBuilderV3.build();
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    itemResponse.sessionId_ = this.sessionId_;
                    i14 |= 4;
                }
                if ((i15 & 32) != 0) {
                    itemResponse.maxRequestCount_ = this.maxRequestCount_;
                    i14 |= 8;
                }
                itemResponse.bitField0_ |= i14;
            }

            private void buildPartialRepeatedFields(ItemResponse itemResponse) {
                RepeatedFieldBuilderV3<GenericItem, GenericItem.Builder, GenericItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    if ((this.bitField0_ & 8) != 0) {
                        this.items_ = Collections.unmodifiableList(this.items_);
                        this.bitField0_ &= -9;
                    }
                    itemResponse.items_ = this.items_;
                } else {
                    itemResponse.items_ = repeatedFieldBuilderV3.build();
                }
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV4 = this.invalidItemsBuilder_;
                if (repeatedFieldBuilderV4 != null) {
                    itemResponse.invalidItems_ = repeatedFieldBuilderV4.build();
                    return;
                }
                if ((this.bitField0_ & 16) != 0) {
                    this.invalidItems_ = Collections.unmodifiableList(this.invalidItems_);
                    this.bitField0_ &= -17;
                }
                itemResponse.invalidItems_ = this.invalidItems_;
            }

            private void ensureInvalidItemsIsMutable() {
                if ((this.bitField0_ & 16) == 0) {
                    this.invalidItems_ = new ArrayList(this.invalidItems_);
                    this.bitField0_ |= 16;
                }
            }

            private void ensureItemsIsMutable() {
                if ((this.bitField0_ & 8) == 0) {
                    this.items_ = new ArrayList(this.items_);
                    this.bitField0_ |= 8;
                }
            }

            private SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> getDataTypeStatusFieldBuilder() {
                if (this.dataTypeStatusBuilder_ == null) {
                    this.dataTypeStatusBuilder_ = new SingleFieldBuilderV3<>(getDataTypeStatus(), getParentForChildren(), isClean());
                    this.dataTypeStatus_ = null;
                }
                return this.dataTypeStatusBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ItemResponse_descriptor;
            }

            private RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> getInvalidItemsFieldBuilder() {
                if (this.invalidItemsBuilder_ == null) {
                    this.invalidItemsBuilder_ = new RepeatedFieldBuilderV3<>(this.invalidItems_, (this.bitField0_ & 16) != 0, getParentForChildren(), isClean());
                    this.invalidItems_ = null;
                }
                return this.invalidItemsBuilder_;
            }

            private RepeatedFieldBuilderV3<GenericItem, GenericItem.Builder, GenericItemOrBuilder> getItemsFieldBuilder() {
                if (this.itemsBuilder_ == null) {
                    this.itemsBuilder_ = new RepeatedFieldBuilderV3<>(this.items_, (this.bitField0_ & 8) != 0, getParentForChildren(), isClean());
                    this.items_ = null;
                }
                return this.itemsBuilder_;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getDataTypeStatusFieldBuilder();
                    getItemsFieldBuilder();
                    getInvalidItemsFieldBuilder();
                }
            }

            public Builder addAllInvalidItems(Iterable<? extends GenericItemReference> iterable) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.invalidItemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureInvalidItemsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.invalidItems_);
                onChanged();
                return this;
            }

            public Builder addAllItems(Iterable<? extends GenericItem> iterable) {
                RepeatedFieldBuilderV3<GenericItem, GenericItem.Builder, GenericItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addAllMessages(iterable);
                    return this;
                }
                ensureItemsIsMutable();
                AbstractMessageLite.Builder.addAll((Iterable) iterable, (List) this.items_);
                onChanged();
                return this;
            }

            public Builder addInvalidItems(GenericItemReference.Builder builder) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.invalidItemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureInvalidItemsIsMutable();
                this.invalidItems_.add(builder.build());
                onChanged();
                return this;
            }

            public GenericItemReference.Builder addInvalidItemsBuilder() {
                return (GenericItemReference.Builder) getInvalidItemsFieldBuilder().addBuilder(GenericItemReference.getDefaultInstance());
            }

            public Builder addItems(GenericItem.Builder builder) {
                RepeatedFieldBuilderV3<GenericItem, GenericItem.Builder, GenericItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.addMessage(builder.build());
                    return this;
                }
                ensureItemsIsMutable();
                this.items_.add(builder.build());
                onChanged();
                return this;
            }

            public GenericItem.Builder addItemsBuilder() {
                return (GenericItem.Builder) getItemsFieldBuilder().addBuilder(GenericItem.getDefaultInstance());
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ItemResponse build() {
                ItemResponse itemResponseBuildPartial = buildPartial();
                if (itemResponseBuildPartial.isInitialized()) {
                    return itemResponseBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) itemResponseBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public ItemResponse buildPartial() {
                ItemResponse itemResponse = new ItemResponse(this);
                buildPartialRepeatedFields(itemResponse);
                if (this.bitField0_ != 0) {
                    buildPartial0(itemResponse);
                }
                onBuilt();
                return itemResponse;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.status_ = 1;
                this.dataTypeStatus_ = null;
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.dataTypeStatusBuilder_ = null;
                }
                this.sessionId_ = 0;
                RepeatedFieldBuilderV3<GenericItem, GenericItem.Builder, GenericItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    this.items_ = Collections.EMPTY_LIST;
                } else {
                    this.items_ = null;
                    repeatedFieldBuilderV3.clear();
                }
                this.bitField0_ &= -9;
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV4 = this.invalidItemsBuilder_;
                if (repeatedFieldBuilderV4 == null) {
                    this.invalidItems_ = Collections.EMPTY_LIST;
                } else {
                    this.invalidItems_ = null;
                    repeatedFieldBuilderV4.clear();
                }
                this.bitField0_ &= -17;
                this.maxRequestCount_ = 0;
                return this;
            }

            public Builder clearDataTypeStatus() {
                this.bitField0_ &= -3;
                this.dataTypeStatus_ = null;
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.dataTypeStatusBuilder_ = null;
                }
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
                return (Builder) super.clearField(fieldDescriptor);
            }

            public Builder clearInvalidItems() {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.invalidItemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.invalidItems_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -17;
                onChanged();
                return this;
            }

            public Builder clearItems() {
                RepeatedFieldBuilderV3<GenericItem, GenericItem.Builder, GenericItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.clear();
                    return this;
                }
                this.items_ = Collections.EMPTY_LIST;
                this.bitField0_ &= -9;
                onChanged();
                return this;
            }

            public Builder clearMaxRequestCount() {
                this.bitField0_ &= -33;
                this.maxRequestCount_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
                return (Builder) super.clearOneof(oneofDescriptor);
            }

            public Builder clearSessionId() {
                this.bitField0_ &= -5;
                this.sessionId_ = 0;
                onChanged();
                return this;
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

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
            public DataTypeStatus getDataTypeStatus() {
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypeStatus) singleFieldBuilderV3.getMessage();
                }
                DataTypeStatus dataTypeStatus = this.dataTypeStatus_;
                return dataTypeStatus == null ? DataTypeStatus.getDefaultInstance() : dataTypeStatus;
            }

            public DataTypeStatus.Builder getDataTypeStatusBuilder() {
                this.bitField0_ |= 2;
                onChanged();
                return (DataTypeStatus.Builder) getDataTypeStatusFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
            public DataTypeStatusOrBuilder getDataTypeStatusOrBuilder() {
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypeStatusOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DataTypeStatus dataTypeStatus = this.dataTypeStatus_;
                return dataTypeStatus == null ? DataTypeStatus.getDefaultInstance() : dataTypeStatus;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ItemResponse_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
            public GenericItemReference getInvalidItems(int i14) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.invalidItemsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.invalidItems_.get(i14) : (GenericItemReference) repeatedFieldBuilderV3.getMessage(i14);
            }

            public GenericItemReference.Builder getInvalidItemsBuilder(int i14) {
                return (GenericItemReference.Builder) getInvalidItemsFieldBuilder().getBuilder(i14);
            }

            public List<GenericItemReference.Builder> getInvalidItemsBuilderList() {
                return getInvalidItemsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
            public int getInvalidItemsCount() {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.invalidItemsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.invalidItems_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
            public List<GenericItemReference> getInvalidItemsList() {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.invalidItemsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.invalidItems_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
            public GenericItemReferenceOrBuilder getInvalidItemsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.invalidItemsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.invalidItems_.get(i14) : (GenericItemReferenceOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
            public List<? extends GenericItemReferenceOrBuilder> getInvalidItemsOrBuilderList() {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.invalidItemsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.invalidItems_);
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
            public GenericItem getItems(int i14) {
                RepeatedFieldBuilderV3<GenericItem, GenericItem.Builder, GenericItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.items_.get(i14) : (GenericItem) repeatedFieldBuilderV3.getMessage(i14);
            }

            public GenericItem.Builder getItemsBuilder(int i14) {
                return (GenericItem.Builder) getItemsFieldBuilder().getBuilder(i14);
            }

            public List<GenericItem.Builder> getItemsBuilderList() {
                return getItemsFieldBuilder().getBuilderList();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
            public int getItemsCount() {
                RepeatedFieldBuilderV3<GenericItem, GenericItem.Builder, GenericItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.items_.size() : repeatedFieldBuilderV3.getCount();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
            public List<GenericItem> getItemsList() {
                RepeatedFieldBuilderV3<GenericItem, GenericItem.Builder, GenericItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                return repeatedFieldBuilderV3 == null ? Collections.unmodifiableList(this.items_) : repeatedFieldBuilderV3.getMessageList();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
            public GenericItemOrBuilder getItemsOrBuilder(int i14) {
                RepeatedFieldBuilderV3<GenericItem, GenericItem.Builder, GenericItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                return repeatedFieldBuilderV3 == null ? this.items_.get(i14) : (GenericItemOrBuilder) repeatedFieldBuilderV3.getMessageOrBuilder(i14);
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
            public List<? extends GenericItemOrBuilder> getItemsOrBuilderList() {
                RepeatedFieldBuilderV3<GenericItem, GenericItem.Builder, GenericItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                return repeatedFieldBuilderV3 != null ? repeatedFieldBuilderV3.getMessageOrBuilderList() : Collections.unmodifiableList(this.items_);
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
            public int getMaxRequestCount() {
                return this.maxRequestCount_;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
            public int getSessionId() {
                return this.sessionId_;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
            public Status getStatus() {
                Status statusForNumber = Status.forNumber(this.status_);
                return statusForNumber == null ? Status.SUCCESS : statusForNumber;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
            public boolean hasDataTypeStatus() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
            public boolean hasMaxRequestCount() {
                return (this.bitField0_ & 32) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
            public boolean hasSessionId() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponseOrBuilder
            public boolean hasStatus() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_ItemResponse_fieldAccessorTable.ensureFieldAccessorsInitialized(ItemResponse.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (!hasStatus()) {
                    return false;
                }
                if (hasDataTypeStatus() && !getDataTypeStatus().isInitialized()) {
                    return false;
                }
                for (int i14 = 0; i14 < getItemsCount(); i14++) {
                    if (!getItems(i14).isInitialized()) {
                        return false;
                    }
                }
                for (int i15 = 0; i15 < getInvalidItemsCount(); i15++) {
                    if (!getInvalidItems(i15).isInitialized()) {
                        return false;
                    }
                }
                return true;
            }

            public Builder mergeDataTypeStatus(DataTypeStatus dataTypeStatus) {
                DataTypeStatus dataTypeStatus2;
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dataTypeStatus);
                } else if ((this.bitField0_ & 2) == 0 || (dataTypeStatus2 = this.dataTypeStatus_) == null || dataTypeStatus2 == DataTypeStatus.getDefaultInstance()) {
                    this.dataTypeStatus_ = dataTypeStatus;
                } else {
                    getDataTypeStatusBuilder().mergeFrom(dataTypeStatus);
                }
                if (this.dataTypeStatus_ != null) {
                    this.bitField0_ |= 2;
                    onChanged();
                }
                return this;
            }

            public Builder mergeFrom(ItemResponse itemResponse) {
                if (itemResponse == ItemResponse.getDefaultInstance()) {
                    return this;
                }
                if (itemResponse.hasStatus()) {
                    setStatus(itemResponse.getStatus());
                }
                if (itemResponse.hasDataTypeStatus()) {
                    mergeDataTypeStatus(itemResponse.getDataTypeStatus());
                }
                if (itemResponse.hasSessionId()) {
                    setSessionId(itemResponse.getSessionId());
                }
                if (this.itemsBuilder_ == null) {
                    if (!itemResponse.items_.isEmpty()) {
                        if (this.items_.isEmpty()) {
                            this.items_ = itemResponse.items_;
                            this.bitField0_ &= -9;
                        } else {
                            ensureItemsIsMutable();
                            this.items_.addAll(itemResponse.items_);
                        }
                        onChanged();
                    }
                } else if (!itemResponse.items_.isEmpty()) {
                    boolean zIsEmpty = this.itemsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<GenericItem, GenericItem.Builder, GenericItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                    if (zIsEmpty) {
                        repeatedFieldBuilderV3.dispose();
                        this.itemsBuilder_ = null;
                        this.items_ = itemResponse.items_;
                        this.bitField0_ &= -9;
                        this.itemsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getItemsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV3.addAllMessages(itemResponse.items_);
                    }
                }
                if (this.invalidItemsBuilder_ == null) {
                    if (!itemResponse.invalidItems_.isEmpty()) {
                        if (this.invalidItems_.isEmpty()) {
                            this.invalidItems_ = itemResponse.invalidItems_;
                            this.bitField0_ &= -17;
                        } else {
                            ensureInvalidItemsIsMutable();
                            this.invalidItems_.addAll(itemResponse.invalidItems_);
                        }
                        onChanged();
                    }
                } else if (!itemResponse.invalidItems_.isEmpty()) {
                    boolean zIsEmpty2 = this.invalidItemsBuilder_.isEmpty();
                    RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV4 = this.invalidItemsBuilder_;
                    if (zIsEmpty2) {
                        repeatedFieldBuilderV4.dispose();
                        this.invalidItemsBuilder_ = null;
                        this.invalidItems_ = itemResponse.invalidItems_;
                        this.bitField0_ &= -17;
                        this.invalidItemsBuilder_ = GeneratedMessageV3.alwaysUseFieldBuilders ? getInvalidItemsFieldBuilder() : null;
                    } else {
                        repeatedFieldBuilderV4.addAllMessages(itemResponse.invalidItems_);
                    }
                }
                if (itemResponse.hasMaxRequestCount()) {
                    setMaxRequestCount(itemResponse.getMaxRequestCount());
                }
                mergeUnknownFields(itemResponse.getUnknownFields());
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public final Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.mergeUnknownFields(unknownFieldSet);
            }

            public Builder removeInvalidItems(int i14) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.invalidItemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureInvalidItemsIsMutable();
                this.invalidItems_.remove(i14);
                onChanged();
                return this;
            }

            public Builder removeItems(int i14) {
                RepeatedFieldBuilderV3<GenericItem, GenericItem.Builder, GenericItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.remove(i14);
                    return this;
                }
                ensureItemsIsMutable();
                this.items_.remove(i14);
                onChanged();
                return this;
            }

            public Builder setDataTypeStatus(DataTypeStatus.Builder builder) {
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.dataTypeStatus_ = builder.build();
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

            public Builder setInvalidItems(int i14, GenericItemReference.Builder builder) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.invalidItemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureInvalidItemsIsMutable();
                this.invalidItems_.set(i14, builder.build());
                onChanged();
                return this;
            }

            public Builder setItems(int i14, GenericItem.Builder builder) {
                RepeatedFieldBuilderV3<GenericItem, GenericItem.Builder, GenericItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 != null) {
                    repeatedFieldBuilderV3.setMessage(i14, builder.build());
                    return this;
                }
                ensureItemsIsMutable();
                this.items_.set(i14, builder.build());
                onChanged();
                return this;
            }

            public Builder setMaxRequestCount(int i14) {
                this.maxRequestCount_ = i14;
                this.bitField0_ |= 32;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSessionId(int i14) {
                this.sessionId_ = i14;
                this.bitField0_ |= 4;
                onChanged();
                return this;
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
            public ItemResponse getDefaultInstanceForType() {
                return ItemResponse.getDefaultInstance();
            }

            public GenericItemReference.Builder addInvalidItemsBuilder(int i14) {
                return (GenericItemReference.Builder) getInvalidItemsFieldBuilder().addBuilder(i14, GenericItemReference.getDefaultInstance());
            }

            public GenericItem.Builder addItemsBuilder(int i14) {
                return (GenericItem.Builder) getItemsFieldBuilder().addBuilder(i14, GenericItem.getDefaultInstance());
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
                List list = Collections.EMPTY_LIST;
                this.items_ = list;
                this.invalidItems_ = list;
                maybeForceBuilderInitialization();
            }

            public Builder addInvalidItems(int i14, GenericItemReference genericItemReference) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.invalidItemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    genericItemReference.getClass();
                    ensureInvalidItemsIsMutable();
                    this.invalidItems_.add(i14, genericItemReference);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, genericItemReference);
                return this;
            }

            public Builder addItems(int i14, GenericItem genericItem) {
                RepeatedFieldBuilderV3<GenericItem, GenericItem.Builder, GenericItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    genericItem.getClass();
                    ensureItemsIsMutable();
                    this.items_.add(i14, genericItem);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, genericItem);
                return this;
            }

            public Builder setDataTypeStatus(DataTypeStatus dataTypeStatus) {
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dataTypeStatus.getClass();
                    this.dataTypeStatus_ = dataTypeStatus;
                } else {
                    singleFieldBuilderV3.setMessage(dataTypeStatus);
                }
                this.bitField0_ |= 2;
                onChanged();
                return this;
            }

            public Builder setInvalidItems(int i14, GenericItemReference genericItemReference) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.invalidItemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    genericItemReference.getClass();
                    ensureInvalidItemsIsMutable();
                    this.invalidItems_.set(i14, genericItemReference);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, genericItemReference);
                return this;
            }

            public Builder setItems(int i14, GenericItem genericItem) {
                RepeatedFieldBuilderV3<GenericItem, GenericItem.Builder, GenericItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    genericItem.getClass();
                    ensureItemsIsMutable();
                    this.items_.set(i14, genericItem);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.setMessage(i14, genericItem);
                return this;
            }

            public Builder addInvalidItems(GenericItemReference genericItemReference) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.invalidItemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    genericItemReference.getClass();
                    ensureInvalidItemsIsMutable();
                    this.invalidItems_.add(genericItemReference);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(genericItemReference);
                return this;
            }

            public Builder addItems(GenericItem genericItem) {
                RepeatedFieldBuilderV3<GenericItem, GenericItem.Builder, GenericItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    genericItem.getClass();
                    ensureItemsIsMutable();
                    this.items_.add(genericItem);
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(genericItem);
                return this;
            }

            public Builder addInvalidItems(int i14, GenericItemReference.Builder builder) {
                RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV3 = this.invalidItemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureInvalidItemsIsMutable();
                    this.invalidItems_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            public Builder addItems(int i14, GenericItem.Builder builder) {
                RepeatedFieldBuilderV3<GenericItem, GenericItem.Builder, GenericItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                if (repeatedFieldBuilderV3 == null) {
                    ensureItemsIsMutable();
                    this.items_.add(i14, builder.build());
                    onChanged();
                    return this;
                }
                repeatedFieldBuilderV3.addMessage(i14, builder.build());
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof ItemResponse) {
                    return mergeFrom((ItemResponse) message);
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
                                    if (Status.forNumber(i14) == null) {
                                        mergeUnknownVarintField(1, i14);
                                    } else {
                                        this.status_ = i14;
                                        this.bitField0_ |= 1;
                                    }
                                } else if (tag == 18) {
                                    codedInputStream.readMessage(getDataTypeStatusFieldBuilder().getBuilder(), extensionRegistryLite);
                                    this.bitField0_ |= 2;
                                } else if (tag == 24) {
                                    this.sessionId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 4;
                                } else if (tag == 34) {
                                    GenericItem genericItem = (GenericItem) codedInputStream.readMessage(GenericItem.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<GenericItem, GenericItem.Builder, GenericItemOrBuilder> repeatedFieldBuilderV3 = this.itemsBuilder_;
                                    if (repeatedFieldBuilderV3 == null) {
                                        ensureItemsIsMutable();
                                        this.items_.add(genericItem);
                                    } else {
                                        repeatedFieldBuilderV3.addMessage(genericItem);
                                    }
                                } else if (tag == 42) {
                                    GenericItemReference genericItemReference = (GenericItemReference) codedInputStream.readMessage(GenericItemReference.PARSER, extensionRegistryLite);
                                    RepeatedFieldBuilderV3<GenericItemReference, GenericItemReference.Builder, GenericItemReferenceOrBuilder> repeatedFieldBuilderV4 = this.invalidItemsBuilder_;
                                    if (repeatedFieldBuilderV4 == null) {
                                        ensureInvalidItemsIsMutable();
                                        this.invalidItems_.add(genericItemReference);
                                    } else {
                                        repeatedFieldBuilderV4.addMessage(genericItemReference);
                                    }
                                } else if (tag != 48) {
                                    if (!super.parseUnknownField(codedInputStream, extensionRegistryLite, tag)) {
                                    }
                                } else {
                                    this.maxRequestCount_ = codedInputStream.readUInt32();
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
        public ItemResponse getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static ItemResponse parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemResponse) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ItemResponse parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static ItemResponse parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static ItemResponse parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static ItemResponse parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public static ItemResponse parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        public static ItemResponse parseFrom(InputStream inputStream) {
            return (ItemResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static ItemResponse parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemResponse) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static ItemResponse parseFrom(CodedInputStream codedInputStream) {
            return (ItemResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static ItemResponse parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (ItemResponse) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }

        private ItemResponse(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.status_ = 1;
            this.sessionId_ = 0;
            this.maxRequestCount_ = 0;
            this.memoizedIsInitialized = (byte) -1;
        }

        public enum Status implements ProtocolMessageEnum {
            SUCCESS(1),
            INVALID_ITEM(2),
            ABORT(3),
            ERROR(4),
            INVALID_SESSION_ID(5),
            UNSUPPORTED_REQUEST_TYPE(6),
            REQUEST_TOO_LARGE(7);

            public static final int ABORT_VALUE = 3;
            public static final int ERROR_VALUE = 4;
            public static final int INVALID_ITEM_VALUE = 2;
            public static final int INVALID_SESSION_ID_VALUE = 5;
            public static final int REQUEST_TOO_LARGE_VALUE = 7;
            public static final int SUCCESS_VALUE = 1;
            public static final int UNSUPPORTED_REQUEST_TYPE_VALUE = 6;
            private final int value;
            private static final Internal.EnumLiteMap<Status> internalValueMap = new Internal.EnumLiteMap<Status>() { // from class: com.garmin.proto.generated.GDIGenericItemTransferProto.ItemResponse.Status.1
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
                switch (i14) {
                    case 1:
                        return SUCCESS;
                    case 2:
                        return INVALID_ITEM;
                    case 3:
                        return ABORT;
                    case 4:
                        return ERROR;
                    case 5:
                        return INVALID_SESSION_ID;
                    case 6:
                        return UNSUPPORTED_REQUEST_TYPE;
                    case 7:
                        return REQUEST_TOO_LARGE;
                    default:
                        return null;
                }
            }

            public static final Descriptors.EnumDescriptor getDescriptor() {
                return ItemResponse.getDescriptor().getEnumTypes().get(0);
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

        public /* synthetic */ ItemResponse(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }
    }

    public static final class SessionCompletedNotification extends GeneratedMessageV3 implements SessionCompletedNotificationOrBuilder {
        public static final int DATA_TYPE_STATUS_FIELD_NUMBER = 3;
        private static final SessionCompletedNotification DEFAULT_INSTANCE = new SessionCompletedNotification();

        @Deprecated
        public static final Parser<SessionCompletedNotification> PARSER = new AbstractParser<SessionCompletedNotification>() { // from class: com.garmin.proto.generated.GDIGenericItemTransferProto.SessionCompletedNotification.1
            @Override // com.google.protobuf.Parser
            public SessionCompletedNotification parsePartialFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) throws InvalidProtocolBufferException {
                Builder builderNewBuilder = SessionCompletedNotification.newBuilder();
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
        public static final int SESSION_ID_FIELD_NUMBER = 1;
        private static final long serialVersionUID = 0;
        private int bitField0_;
        private DataTypeStatus dataTypeStatus_;
        private byte memoizedIsInitialized;
        private int reason_;
        private int sessionId_;

        private SessionCompletedNotification(GeneratedMessageV3.Builder<?> builder) {
            super(builder);
            this.sessionId_ = 0;
            this.reason_ = 1;
            this.memoizedIsInitialized = (byte) -1;
        }

        public static SessionCompletedNotification getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static final Descriptors.Descriptor getDescriptor() {
            return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_SessionCompletedNotification_descriptor;
        }

        public static Builder newBuilder(SessionCompletedNotification sessionCompletedNotification) {
            return DEFAULT_INSTANCE.toBuilder().mergeFrom(sessionCompletedNotification);
        }

        public static SessionCompletedNotification parseDelimitedFrom(InputStream inputStream) {
            return (SessionCompletedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream);
        }

        public static SessionCompletedNotification parseFrom(ByteBuffer byteBuffer) {
            return PARSER.parseFrom(byteBuffer);
        }

        public static Parser<SessionCompletedNotification> parser() {
            return PARSER;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof SessionCompletedNotification)) {
                return super.equals(obj);
            }
            SessionCompletedNotification sessionCompletedNotification = (SessionCompletedNotification) obj;
            if (hasSessionId() != sessionCompletedNotification.hasSessionId()) {
                return false;
            }
            if ((hasSessionId() && getSessionId() != sessionCompletedNotification.getSessionId()) || hasReason() != sessionCompletedNotification.hasReason()) {
                return false;
            }
            if ((!hasReason() || this.reason_ == sessionCompletedNotification.reason_) && hasDataTypeStatus() == sessionCompletedNotification.hasDataTypeStatus()) {
                return (!hasDataTypeStatus() || getDataTypeStatus().equals(sessionCompletedNotification.getDataTypeStatus())) && getUnknownFields().equals(sessionCompletedNotification.getUnknownFields());
            }
            return false;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.SessionCompletedNotificationOrBuilder
        public DataTypeStatus getDataTypeStatus() {
            DataTypeStatus dataTypeStatus = this.dataTypeStatus_;
            return dataTypeStatus == null ? DataTypeStatus.getDefaultInstance() : dataTypeStatus;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.SessionCompletedNotificationOrBuilder
        public DataTypeStatusOrBuilder getDataTypeStatusOrBuilder() {
            DataTypeStatus dataTypeStatus = this.dataTypeStatus_;
            return dataTypeStatus == null ? DataTypeStatus.getDefaultInstance() : dataTypeStatus;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Parser<SessionCompletedNotification> getParserForType() {
            return PARSER;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.SessionCompletedNotificationOrBuilder
        public SessionEndReason getReason() {
            SessionEndReason sessionEndReasonForNumber = SessionEndReason.forNumber(this.reason_);
            return sessionEndReasonForNumber == null ? SessionEndReason.COMPLETE : sessionEndReasonForNumber;
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public int getSerializedSize() {
            int i14 = this.memoizedSize;
            if (i14 != -1) {
                return i14;
            }
            int iComputeUInt32Size = (this.bitField0_ & 1) != 0 ? CodedOutputStream.computeUInt32Size(1, this.sessionId_) : 0;
            if ((this.bitField0_ & 2) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeEnumSize(2, this.reason_);
            }
            if ((this.bitField0_ & 4) != 0) {
                iComputeUInt32Size += CodedOutputStream.computeMessageSize(3, getDataTypeStatus());
            }
            int serializedSize = getUnknownFields().getSerializedSize() + iComputeUInt32Size;
            this.memoizedSize = serializedSize;
            return serializedSize;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.SessionCompletedNotificationOrBuilder
        public int getSessionId() {
            return this.sessionId_;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.SessionCompletedNotificationOrBuilder
        public boolean hasDataTypeStatus() {
            return (this.bitField0_ & 4) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.SessionCompletedNotificationOrBuilder
        public boolean hasReason() {
            return (this.bitField0_ & 2) != 0;
        }

        @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.SessionCompletedNotificationOrBuilder
        public boolean hasSessionId() {
            return (this.bitField0_ & 1) != 0;
        }

        @Override // com.google.protobuf.AbstractMessage, com.google.protobuf.Message
        public int hashCode() {
            int i14 = this.memoizedHashCode;
            if (i14 != 0) {
                return i14;
            }
            int iHashCode = getDescriptor().hashCode() + 779;
            if (hasSessionId()) {
                iHashCode = e5.c(iHashCode, 37, 1, 53) + getSessionId();
            }
            if (hasReason()) {
                iHashCode = e5.c(iHashCode, 37, 2, 53) + this.reason_;
            }
            if (hasDataTypeStatus()) {
                iHashCode = e5.c(iHashCode, 37, 3, 53) + getDataTypeStatus().hashCode();
            }
            int iHashCode2 = getUnknownFields().hashCode() + (iHashCode * 29);
            this.memoizedHashCode = iHashCode2;
            return iHashCode2;
        }

        @Override // com.google.protobuf.GeneratedMessageV3
        public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
            return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_SessionCompletedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SessionCompletedNotification.class, Builder.class);
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
            if (!hasSessionId()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasReason()) {
                this.memoizedIsInitialized = (byte) 0;
                return false;
            }
            if (!hasDataTypeStatus() || getDataTypeStatus().isInitialized()) {
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
            return new SessionCompletedNotification();
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder toBuilder() {
            int i14 = 0;
            return this == DEFAULT_INSTANCE ? new Builder(i14) : new Builder(i14).mergeFrom(this);
        }

        @Override // com.google.protobuf.GeneratedMessageV3, com.google.protobuf.AbstractMessage, com.google.protobuf.MessageLite
        public void writeTo(CodedOutputStream codedOutputStream) {
            if ((this.bitField0_ & 1) != 0) {
                codedOutputStream.writeUInt32(1, this.sessionId_);
            }
            if ((this.bitField0_ & 2) != 0) {
                codedOutputStream.writeEnum(2, this.reason_);
            }
            if ((this.bitField0_ & 4) != 0) {
                codedOutputStream.writeMessage(3, getDataTypeStatus());
            }
            getUnknownFields().writeTo(codedOutputStream);
        }

        public static final class Builder extends GeneratedMessageV3.Builder<Builder> implements SessionCompletedNotificationOrBuilder {
            private int bitField0_;
            private SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> dataTypeStatusBuilder_;
            private DataTypeStatus dataTypeStatus_;
            private int reason_;
            private int sessionId_;

            private Builder() {
                this.reason_ = 1;
                maybeForceBuilderInitialization();
            }

            private void buildPartial0(SessionCompletedNotification sessionCompletedNotification) {
                int i14;
                int i15 = this.bitField0_;
                if ((i15 & 1) != 0) {
                    sessionCompletedNotification.sessionId_ = this.sessionId_;
                    i14 = 1;
                } else {
                    i14 = 0;
                }
                if ((i15 & 2) != 0) {
                    sessionCompletedNotification.reason_ = this.reason_;
                    i14 |= 2;
                }
                if ((i15 & 4) != 0) {
                    SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                    sessionCompletedNotification.dataTypeStatus_ = singleFieldBuilderV3 == null ? this.dataTypeStatus_ : (DataTypeStatus) singleFieldBuilderV3.build();
                    i14 |= 4;
                }
                sessionCompletedNotification.bitField0_ |= i14;
            }

            private SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> getDataTypeStatusFieldBuilder() {
                if (this.dataTypeStatusBuilder_ == null) {
                    this.dataTypeStatusBuilder_ = new SingleFieldBuilderV3<>(getDataTypeStatus(), getParentForChildren(), isClean());
                    this.dataTypeStatus_ = null;
                }
                return this.dataTypeStatusBuilder_;
            }

            public static final Descriptors.Descriptor getDescriptor() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_SessionCompletedNotification_descriptor;
            }

            private void maybeForceBuilderInitialization() {
                if (GeneratedMessageV3.alwaysUseFieldBuilders) {
                    getDataTypeStatusFieldBuilder();
                }
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.addRepeatedField(fieldDescriptor, obj);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SessionCompletedNotification build() {
                SessionCompletedNotification sessionCompletedNotificationBuildPartial = buildPartial();
                if (sessionCompletedNotificationBuildPartial.isInitialized()) {
                    return sessionCompletedNotificationBuildPartial;
                }
                throw AbstractMessage.Builder.newUninitializedMessageException((Message) sessionCompletedNotificationBuildPartial);
            }

            @Override // com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public SessionCompletedNotification buildPartial() {
                SessionCompletedNotification sessionCompletedNotification = new SessionCompletedNotification(this);
                if (this.bitField0_ != 0) {
                    buildPartial0(sessionCompletedNotification);
                }
                onBuilt();
                return sessionCompletedNotification;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.MessageLite.Builder, com.google.protobuf.Message.Builder
            public Builder clear() {
                super.clear();
                this.bitField0_ = 0;
                this.sessionId_ = 0;
                this.reason_ = 1;
                this.dataTypeStatus_ = null;
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.dataTypeStatusBuilder_ = null;
                }
                return this;
            }

            public Builder clearDataTypeStatus() {
                this.bitField0_ &= -5;
                this.dataTypeStatus_ = null;
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.dispose();
                    this.dataTypeStatusBuilder_ = null;
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

            public Builder clearReason() {
                this.bitField0_ &= -3;
                this.reason_ = 1;
                onChanged();
                return this;
            }

            public Builder clearSessionId() {
                this.bitField0_ &= -2;
                this.sessionId_ = 0;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.AbstractMessageLite.Builder
            /* JADX INFO: renamed from: clone */
            public Builder mo57clone() {
                return (Builder) super.mo57clone();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.SessionCompletedNotificationOrBuilder
            public DataTypeStatus getDataTypeStatus() {
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypeStatus) singleFieldBuilderV3.getMessage();
                }
                DataTypeStatus dataTypeStatus = this.dataTypeStatus_;
                return dataTypeStatus == null ? DataTypeStatus.getDefaultInstance() : dataTypeStatus;
            }

            public DataTypeStatus.Builder getDataTypeStatusBuilder() {
                this.bitField0_ |= 4;
                onChanged();
                return (DataTypeStatus.Builder) getDataTypeStatusFieldBuilder().getBuilder();
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.SessionCompletedNotificationOrBuilder
            public DataTypeStatusOrBuilder getDataTypeStatusOrBuilder() {
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    return (DataTypeStatusOrBuilder) singleFieldBuilderV3.getMessageOrBuilder();
                }
                DataTypeStatus dataTypeStatus = this.dataTypeStatus_;
                return dataTypeStatus == null ? DataTypeStatus.getDefaultInstance() : dataTypeStatus;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder, com.google.protobuf.MessageOrBuilder
            public Descriptors.Descriptor getDescriptorForType() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_SessionCompletedNotification_descriptor;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.SessionCompletedNotificationOrBuilder
            public SessionEndReason getReason() {
                SessionEndReason sessionEndReasonForNumber = SessionEndReason.forNumber(this.reason_);
                return sessionEndReasonForNumber == null ? SessionEndReason.COMPLETE : sessionEndReasonForNumber;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.SessionCompletedNotificationOrBuilder
            public int getSessionId() {
                return this.sessionId_;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.SessionCompletedNotificationOrBuilder
            public boolean hasDataTypeStatus() {
                return (this.bitField0_ & 4) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.SessionCompletedNotificationOrBuilder
            public boolean hasReason() {
                return (this.bitField0_ & 2) != 0;
            }

            @Override // com.garmin.proto.generated.GDIGenericItemTransferProto.SessionCompletedNotificationOrBuilder
            public boolean hasSessionId() {
                return (this.bitField0_ & 1) != 0;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder
            public GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
                return GDIGenericItemTransferProto.internal_static_GDI_Proto_GenericItemTransfer_SessionCompletedNotification_fieldAccessorTable.ensureFieldAccessorsInitialized(SessionCompletedNotification.class, Builder.class);
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.MessageLiteOrBuilder
            public final boolean isInitialized() {
                if (hasSessionId() && hasReason()) {
                    return !hasDataTypeStatus() || getDataTypeStatus().isInitialized();
                }
                return false;
            }

            public Builder mergeDataTypeStatus(DataTypeStatus dataTypeStatus) {
                DataTypeStatus dataTypeStatus2;
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 != null) {
                    singleFieldBuilderV3.mergeFrom(dataTypeStatus);
                } else if ((this.bitField0_ & 4) == 0 || (dataTypeStatus2 = this.dataTypeStatus_) == null || dataTypeStatus2 == DataTypeStatus.getDefaultInstance()) {
                    this.dataTypeStatus_ = dataTypeStatus;
                } else {
                    getDataTypeStatusBuilder().mergeFrom(dataTypeStatus);
                }
                if (this.dataTypeStatus_ != null) {
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
                                    this.sessionId_ = codedInputStream.readUInt32();
                                    this.bitField0_ |= 1;
                                } else if (tag == 16) {
                                    int i14 = codedInputStream.readEnum();
                                    if (SessionEndReason.forNumber(i14) == null) {
                                        mergeUnknownVarintField(2, i14);
                                    } else {
                                        this.reason_ = i14;
                                        this.bitField0_ |= 2;
                                    }
                                } else if (tag == 26) {
                                    codedInputStream.readMessage(getDataTypeStatusFieldBuilder().getBuilder(), extensionRegistryLite);
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

            public Builder setDataTypeStatus(DataTypeStatus.Builder builder) {
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    this.dataTypeStatus_ = builder.build();
                } else {
                    singleFieldBuilderV3.setMessage(builder.build());
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object obj) {
                return (Builder) super.setField(fieldDescriptor, obj);
            }

            public Builder setReason(SessionEndReason sessionEndReason) {
                sessionEndReason.getClass();
                this.bitField0_ |= 2;
                this.reason_ = sessionEndReason.getNumber();
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int i14, Object obj) {
                return (Builder) super.setRepeatedField(fieldDescriptor, i14, obj);
            }

            public Builder setSessionId(int i14) {
                this.sessionId_ = i14;
                this.bitField0_ |= 1;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.GeneratedMessageV3.Builder, com.google.protobuf.Message.Builder
            public final Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
                return (Builder) super.setUnknownFields(unknownFieldSet);
            }

            @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
            public SessionCompletedNotification getDefaultInstanceForType() {
                return SessionCompletedNotification.getDefaultInstance();
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

            public Builder setDataTypeStatus(DataTypeStatus dataTypeStatus) {
                SingleFieldBuilderV3<DataTypeStatus, DataTypeStatus.Builder, DataTypeStatusOrBuilder> singleFieldBuilderV3 = this.dataTypeStatusBuilder_;
                if (singleFieldBuilderV3 == null) {
                    dataTypeStatus.getClass();
                    this.dataTypeStatus_ = dataTypeStatus;
                } else {
                    singleFieldBuilderV3.setMessage(dataTypeStatus);
                }
                this.bitField0_ |= 4;
                onChanged();
                return this;
            }

            @Override // com.google.protobuf.AbstractMessage.Builder, com.google.protobuf.Message.Builder
            public Builder mergeFrom(Message message) {
                if (message instanceof SessionCompletedNotification) {
                    return mergeFrom((SessionCompletedNotification) message);
                }
                super.mergeFrom(message);
                return this;
            }

            public Builder mergeFrom(SessionCompletedNotification sessionCompletedNotification) {
                if (sessionCompletedNotification == SessionCompletedNotification.getDefaultInstance()) {
                    return this;
                }
                if (sessionCompletedNotification.hasSessionId()) {
                    setSessionId(sessionCompletedNotification.getSessionId());
                }
                if (sessionCompletedNotification.hasReason()) {
                    setReason(sessionCompletedNotification.getReason());
                }
                if (sessionCompletedNotification.hasDataTypeStatus()) {
                    mergeDataTypeStatus(sessionCompletedNotification.getDataTypeStatus());
                }
                mergeUnknownFields(sessionCompletedNotification.getUnknownFields());
                onChanged();
                return this;
            }
        }

        @Override // com.google.protobuf.MessageLiteOrBuilder, com.google.protobuf.MessageOrBuilder
        public SessionCompletedNotification getDefaultInstanceForType() {
            return DEFAULT_INSTANCE;
        }

        public static SessionCompletedNotification parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionCompletedNotification) GeneratedMessageV3.parseDelimitedWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SessionCompletedNotification parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteBuffer, extensionRegistryLite);
        }

        @Override // com.google.protobuf.MessageLite, com.google.protobuf.Message
        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static SessionCompletedNotification parseFrom(ByteString byteString) {
            return PARSER.parseFrom(byteString);
        }

        public static Builder newBuilder() {
            return DEFAULT_INSTANCE.toBuilder();
        }

        public static SessionCompletedNotification parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(byteString, extensionRegistryLite);
        }

        public static SessionCompletedNotification parseFrom(byte[] bArr) {
            return PARSER.parseFrom(bArr);
        }

        public /* synthetic */ SessionCompletedNotification(Builder builder) {
            this((GeneratedMessageV3.Builder<?>) builder);
        }

        public static SessionCompletedNotification parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return PARSER.parseFrom(bArr, extensionRegistryLite);
        }

        private SessionCompletedNotification() {
            this.sessionId_ = 0;
            this.memoizedIsInitialized = (byte) -1;
            this.reason_ = 1;
        }

        public static SessionCompletedNotification parseFrom(InputStream inputStream) {
            return (SessionCompletedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream);
        }

        public static SessionCompletedNotification parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionCompletedNotification) GeneratedMessageV3.parseWithIOException(PARSER, inputStream, extensionRegistryLite);
        }

        public static SessionCompletedNotification parseFrom(CodedInputStream codedInputStream) {
            return (SessionCompletedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream);
        }

        public static SessionCompletedNotification parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (SessionCompletedNotification) GeneratedMessageV3.parseWithIOException(PARSER, codedInputStream, extensionRegistryLite);
        }
    }

    public static void registerAllExtensions(ExtensionRegistryLite extensionRegistryLite) {
    }

    public enum SessionEndReason implements ProtocolMessageEnum {
        COMPLETE(1),
        ERROR(2),
        TIMEOUT(3),
        USER_CANCEL(4),
        SHUTDOWN(5),
        RESTART(6),
        APP_RESTRICTION(7),
        APP_CLOSE(8);

        public static final int APP_CLOSE_VALUE = 8;
        public static final int APP_RESTRICTION_VALUE = 7;
        public static final int COMPLETE_VALUE = 1;
        public static final int ERROR_VALUE = 2;
        public static final int RESTART_VALUE = 6;
        public static final int SHUTDOWN_VALUE = 5;
        public static final int TIMEOUT_VALUE = 3;
        public static final int USER_CANCEL_VALUE = 4;
        private final int value;
        private static final Internal.EnumLiteMap<SessionEndReason> internalValueMap = new Internal.EnumLiteMap<SessionEndReason>() { // from class: com.garmin.proto.generated.GDIGenericItemTransferProto.SessionEndReason.1
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public SessionEndReason findValueByNumber(int i14) {
                return SessionEndReason.forNumber(i14);
            }
        };
        private static final SessionEndReason[] VALUES = values();

        SessionEndReason(int i14) {
            this.value = i14;
        }

        public static SessionEndReason forNumber(int i14) {
            switch (i14) {
                case 1:
                    return COMPLETE;
                case 2:
                    return ERROR;
                case 3:
                    return TIMEOUT;
                case 4:
                    return USER_CANCEL;
                case 5:
                    return SHUTDOWN;
                case 6:
                    return RESTART;
                case 7:
                    return APP_RESTRICTION;
                case 8:
                    return APP_CLOSE;
                default:
                    return null;
            }
        }

        public static final Descriptors.EnumDescriptor getDescriptor() {
            return GDIGenericItemTransferProto.getDescriptor().getEnumTypes().get(0);
        }

        public static Internal.EnumLiteMap<SessionEndReason> internalGetValueMap() {
            return internalValueMap;
        }

        public static SessionEndReason valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
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
        public static SessionEndReason valueOf(int i14) {
            return forNumber(i14);
        }
    }
}
